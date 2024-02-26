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
package org.eclipse.sirius.web.application.editingcontext.services.api;

import java.util.Optional;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.sirius.web.domain.boundedcontexts.semanticdata.Document;

/**
 * Used to transform an EMF resource into a document.
 *
 * @author sbegaudeau
 */
public interface IResourceToDocumentService {
    Optional<Document> toDocument(Resource resource);
}
