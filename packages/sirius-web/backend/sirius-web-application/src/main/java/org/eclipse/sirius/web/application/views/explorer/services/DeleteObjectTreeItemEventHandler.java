/*******************************************************************************
 * Copyright (c) 2024 Obeo.
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.sirius.web.application.views.explorer.services;

import java.util.Map;
import java.util.Objects;
import java.util.Optional;

import org.eclipse.sirius.components.collaborative.api.ChangeKind;
import org.eclipse.sirius.components.core.api.IEditService;
import org.eclipse.sirius.components.core.api.IEditingContext;
import org.eclipse.sirius.components.core.api.IObjectSearchService;
import org.eclipse.sirius.components.core.api.SemanticKindConstants;
import org.eclipse.sirius.components.representations.Failure;
import org.eclipse.sirius.components.representations.IStatus;
import org.eclipse.sirius.components.representations.Success;
import org.eclipse.sirius.components.trees.TreeItem;
import org.eclipse.sirius.web.application.views.explorer.services.api.IDeleteTreeItemHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * Handles semantic object deletion triggered via a tree item from the explorer.
 *
 * @author pcdavid
 */
@Service
public class DeleteObjectTreeItemEventHandler implements IDeleteTreeItemHandler {

    private final Logger logger = LoggerFactory.getLogger(DeleteObjectTreeItemEventHandler.class);

    private final IObjectSearchService objectSearchService;

    private final IEditService editService;

    public DeleteObjectTreeItemEventHandler(IObjectSearchService objectSearchService, IEditService editService) {
        this.objectSearchService = Objects.requireNonNull(objectSearchService);
        this.editService = Objects.requireNonNull(editService);
    }

    @Override
    public boolean canHandle(IEditingContext editingContext, TreeItem treeItem) {
        return treeItem.getKind().startsWith(SemanticKindConstants.PREFIX);
    }

    @Override
    public IStatus handle(IEditingContext editingContext, TreeItem treeItem) {
        Optional<Object> optionalObject = this.objectSearchService.getObject(editingContext, treeItem.getId());
        if (optionalObject.isPresent()) {
            Object object = optionalObject.get();
            this.editService.delete(object);

            return new Success(ChangeKind.SEMANTIC_CHANGE, Map.of());
        } else {
            this.logger.warn("The object with the id {} does not exist", treeItem.getId());
        }
        return new Failure("");
    }
}
