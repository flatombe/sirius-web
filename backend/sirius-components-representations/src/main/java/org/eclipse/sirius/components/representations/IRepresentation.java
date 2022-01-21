/*******************************************************************************
 * Copyright (c) 2019, 2022 Obeo.
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
package org.eclipse.sirius.components.representations;

import java.util.UUID;

/**
 * Common interface for all the representations.
 *
 * @author sbegaudeau
 */
public interface IRepresentation {
    String KIND_PREFIX = "siriusComponents://representation"; //$NON-NLS-1$

    String getId();

    UUID getDescriptionId();

    String getLabel();

    String getKind();
}
