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
package org.eclipse.sirius.components.collaborative.forms.dto;

import java.text.MessageFormat;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

import org.eclipse.sirius.components.core.api.IPayload;

/**
 * Payload used to indicates that the subscribers of a widget have been updated.
 *
 * @author sbegaudeau
 */
public final class WidgetSubscriptionsUpdatedEventPayload implements IPayload {
    private final UUID id;

    private final List<WidgetSubscription> widgetSubscriptions;

    public WidgetSubscriptionsUpdatedEventPayload(UUID id, List<WidgetSubscription> widgetSubscriptions) {
        this.id = Objects.requireNonNull(id);
        this.widgetSubscriptions = Objects.requireNonNull(widgetSubscriptions);
    }

    @Override
    public UUID getId() {
        return this.id;
    }

    public List<WidgetSubscription> getWidgetSubscriptions() {
        return this.widgetSubscriptions;
    }

    @Override
    public String toString() {
        String pattern = "{0} '{'id: {1}'}'"; //$NON-NLS-1$
        return MessageFormat.format(pattern, this.getClass().getSimpleName(), this.id);
    }
}
