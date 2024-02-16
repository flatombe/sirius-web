/*******************************************************************************
 * Copyright (c) 2023, 2024 Obeo.
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
package org.eclipse.sirius.components.view.gantt.provider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ChildCreationExtenderManager;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IChildCreationExtender;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.sirius.components.view.View;
import org.eclipse.sirius.components.view.ViewPackage;
import org.eclipse.sirius.components.view.gantt.GanttFactory;
import org.eclipse.sirius.components.view.gantt.GanttPackage;
import org.eclipse.sirius.components.view.gantt.util.GanttAdapterFactory;
import org.eclipse.sirius.components.view.util.ViewSwitch;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers. The adapters generated by this
 * factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}. The adapters
 * also support Eclipse property sheets. Note that most of the adapters are shared among multiple instances. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 *
 * @generated
 */
public class GanttItemProviderAdapterFactory extends GanttAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable, IChildCreationExtender {
    /**
     * This keeps track of the root adapter factory that delegates to this adapter factory. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected ComposedAdapterFactory parentAdapterFactory;

    /**
     * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected IChangeNotifier changeNotifier = new ChangeNotifier();

    /**
     * This helps manage the child creation extenders. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected ChildCreationExtenderManager childCreationExtenderManager = new ChildCreationExtenderManager(GanttEditPlugin.INSTANCE, GanttPackage.eNS_URI);

    /**
     * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected Collection<Object> supportedTypes = new ArrayList<>();

    /**
     * This constructs an instance. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public GanttItemProviderAdapterFactory() {
        this.supportedTypes.add(IEditingDomainItemProvider.class);
        this.supportedTypes.add(IStructuredItemContentProvider.class);
        this.supportedTypes.add(ITreeItemContentProvider.class);
        this.supportedTypes.add(IItemLabelProvider.class);
        this.supportedTypes.add(IItemPropertySource.class);
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.eclipse.sirius.components.view.gantt.GanttDescription} instances. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected GanttDescriptionItemProvider ganttDescriptionItemProvider;

    /**
     * This creates an adapter for a {@link org.eclipse.sirius.components.view.gantt.GanttDescription}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createGanttDescriptionAdapter() {
        if (this.ganttDescriptionItemProvider == null) {
            this.ganttDescriptionItemProvider = new GanttDescriptionItemProvider(this);
        }

        return this.ganttDescriptionItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.eclipse.sirius.components.view.gantt.TaskDescription}
     * instances. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected TaskDescriptionItemProvider taskDescriptionItemProvider;

    /**
     * This creates an adapter for a {@link org.eclipse.sirius.components.view.gantt.TaskDescription}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createTaskDescriptionAdapter() {
        if (this.taskDescriptionItemProvider == null) {
            this.taskDescriptionItemProvider = new TaskDescriptionItemProvider(this);
        }

        return this.taskDescriptionItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.eclipse.sirius.components.view.gantt.ConditionalTaskStyle} instances. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected ConditionalTaskStyleItemProvider conditionalTaskStyleItemProvider;

    /**
     * This creates an adapter for a {@link org.eclipse.sirius.components.view.gantt.ConditionalTaskStyle}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createConditionalTaskStyleAdapter() {
        if (this.conditionalTaskStyleItemProvider == null) {
            this.conditionalTaskStyleItemProvider = new ConditionalTaskStyleItemProvider(this);
        }

        return this.conditionalTaskStyleItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.eclipse.sirius.components.view.gantt.CreateTaskTool}
     * instances. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected CreateTaskToolItemProvider createTaskToolItemProvider;

    /**
     * This creates an adapter for a {@link org.eclipse.sirius.components.view.gantt.CreateTaskTool}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createCreateTaskToolAdapter() {
        if (this.createTaskToolItemProvider == null) {
            this.createTaskToolItemProvider = new CreateTaskToolItemProvider(this);
        }

        return this.createTaskToolItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.eclipse.sirius.components.view.gantt.EditTaskTool}
     * instances. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected EditTaskToolItemProvider editTaskToolItemProvider;

    /**
     * This creates an adapter for a {@link org.eclipse.sirius.components.view.gantt.EditTaskTool}. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createEditTaskToolAdapter() {
        if (this.editTaskToolItemProvider == null) {
            this.editTaskToolItemProvider = new EditTaskToolItemProvider(this);
        }

        return this.editTaskToolItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.eclipse.sirius.components.view.gantt.DeleteTaskTool}
     * instances. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected DeleteTaskToolItemProvider deleteTaskToolItemProvider;

    /**
     * This creates an adapter for a {@link org.eclipse.sirius.components.view.gantt.DeleteTaskTool}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createDeleteTaskToolAdapter() {
        if (this.deleteTaskToolItemProvider == null) {
            this.deleteTaskToolItemProvider = new DeleteTaskToolItemProvider(this);
        }

        return this.deleteTaskToolItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.eclipse.sirius.components.view.gantt.DropTaskTool}
     * instances. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected DropTaskToolItemProvider dropTaskToolItemProvider;

    /**
     * This creates an adapter for a {@link org.eclipse.sirius.components.view.gantt.DropTaskTool}. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createDropTaskToolAdapter() {
        if (this.dropTaskToolItemProvider == null) {
            this.dropTaskToolItemProvider = new DropTaskToolItemProvider(this);
        }

        return this.dropTaskToolItemProvider;
    }

    /**
     * This returns the root adapter factory that contains this factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ComposeableAdapterFactory getRootAdapterFactory() {
        return this.parentAdapterFactory == null ? this : this.parentAdapterFactory.getRootAdapterFactory();
    }

    /**
     * This sets the composed adapter factory that contains this factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
        this.parentAdapterFactory = parentAdapterFactory;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean isFactoryForType(Object type) {
        return this.supportedTypes.contains(type) || super.isFactoryForType(type);
    }

    /**
     * This implementation substitutes the factory itself as the key for the adapter. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter adapt(Notifier notifier, Object type) {
        return super.adapt(notifier, this);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object adapt(Object object, Object type) {
        if (this.isFactoryForType(type)) {
            Object adapter = super.adapt(object, type);
            if (!(type instanceof Class<?>) || (((Class<?>) type).isInstance(adapter))) {
                return adapter;
            }
        }

        return null;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public List<IChildCreationExtender> getChildCreationExtenders() {
        return this.childCreationExtenderManager.getChildCreationExtenders();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Collection<?> getNewChildDescriptors(Object object, EditingDomain editingDomain) {
        return this.childCreationExtenderManager.getNewChildDescriptors(object, editingDomain);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ResourceLocator getResourceLocator() {
        return this.childCreationExtenderManager;
    }

    /**
     * This adds a listener. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void addListener(INotifyChangedListener notifyChangedListener) {
        this.changeNotifier.addListener(notifyChangedListener);
    }

    /**
     * This removes a listener. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void removeListener(INotifyChangedListener notifyChangedListener) {
        this.changeNotifier.removeListener(notifyChangedListener);
    }

    /**
     * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    @Override
    public void fireNotifyChanged(Notification notification) {
        this.changeNotifier.fireNotifyChanged(notification);

        if (this.parentAdapterFactory != null) {
            this.parentAdapterFactory.fireNotifyChanged(notification);
        }
    }

    /**
     * This disposes all of the item providers created by this factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void dispose() {
        if (this.ganttDescriptionItemProvider != null)
            this.ganttDescriptionItemProvider.dispose();
        if (this.taskDescriptionItemProvider != null)
            this.taskDescriptionItemProvider.dispose();
        if (this.conditionalTaskStyleItemProvider != null)
            this.conditionalTaskStyleItemProvider.dispose();
        if (this.createTaskToolItemProvider != null)
            this.createTaskToolItemProvider.dispose();
        if (this.editTaskToolItemProvider != null)
            this.editTaskToolItemProvider.dispose();
        if (this.deleteTaskToolItemProvider != null)
            this.deleteTaskToolItemProvider.dispose();
        if (this.dropTaskToolItemProvider != null)
            this.dropTaskToolItemProvider.dispose();
    }

    /**
     * A child creation extender for the {@link ViewPackage}. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static class ViewChildCreationExtender implements IChildCreationExtender {
        /**
         * The switch for creating child descriptors specific to each extended class. <!-- begin-user-doc --> <!--
         * end-user-doc -->
         *
         * @generated
         */
        protected static class CreationSwitch extends ViewSwitch<Object> {
            /**
             * The child descriptors being populated. <!-- begin-user-doc --> <!-- end-user-doc -->
             *
             * @generated
             */
            protected List<Object> newChildDescriptors;

            /**
             * The domain in which to create the children. <!-- begin-user-doc --> <!-- end-user-doc -->
             *
             * @generated
             */
            protected EditingDomain editingDomain;

            /**
             * Creates the a switch for populating child descriptors in the given domain. <!-- begin-user-doc --> <!--
             * end-user-doc -->
             *
             * @generated
             */
            CreationSwitch(List<Object> newChildDescriptors, EditingDomain editingDomain) {
                this.newChildDescriptors = newChildDescriptors;
                this.editingDomain = editingDomain;
            }

            /**
             * <!-- begin-user-doc --> <!-- end-user-doc -->
             *
             * @generated
             */
            @Override
            public Object caseView(View object) {
                this.newChildDescriptors.add(this.createChildParameter(ViewPackage.Literals.VIEW__DESCRIPTIONS, GanttFactory.eINSTANCE.createGanttDescription()));

                return null;
            }

            /**
             * <!-- begin-user-doc --> <!-- end-user-doc -->
             *
             * @generated
             */
            protected CommandParameter createChildParameter(Object feature, Object child) {
                return new CommandParameter(null, feature, child);
            }

        }

        /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        @Override
        public Collection<Object> getNewChildDescriptors(Object object, EditingDomain editingDomain) {
            ArrayList<Object> result = new ArrayList<>();
            new CreationSwitch(result, editingDomain).doSwitch((EObject) object);
            return result;
        }

        /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        @Override
        public ResourceLocator getResourceLocator() {
            return GanttEditPlugin.INSTANCE;
        }
    }

}
