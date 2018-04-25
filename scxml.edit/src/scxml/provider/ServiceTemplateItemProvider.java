/**
 */
package scxml.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import scxml.ScxmlFactory;
import scxml.ScxmlPackage;
import scxml.ServiceTemplate;

/**
 * This is the item provider adapter for a {@link scxml.ServiceTemplate} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ServiceTemplateItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceTemplateItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addNamePropertyDescriptor(object);
			addXmlnsPropertyDescriptor(object);
			addVersionPropertyDescriptor(object);
			addProfilePropertyDescriptor(object);
			addExmodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ServiceTemplate_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ServiceTemplate_name_feature", "_UI_ServiceTemplate_type"),
				 ScxmlPackage.Literals.SERVICE_TEMPLATE__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Xmlns feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addXmlnsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ServiceTemplate_xmlns_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ServiceTemplate_xmlns_feature", "_UI_ServiceTemplate_type"),
				 ScxmlPackage.Literals.SERVICE_TEMPLATE__XMLNS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Version feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVersionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ServiceTemplate_version_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ServiceTemplate_version_feature", "_UI_ServiceTemplate_type"),
				 ScxmlPackage.Literals.SERVICE_TEMPLATE__VERSION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Profile feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProfilePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ServiceTemplate_profile_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ServiceTemplate_profile_feature", "_UI_ServiceTemplate_type"),
				 ScxmlPackage.Literals.SERVICE_TEMPLATE__PROFILE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Exmode feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExmodePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ServiceTemplate_exmode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ServiceTemplate_exmode_feature", "_UI_ServiceTemplate_type"),
				 ScxmlPackage.Literals.SERVICE_TEMPLATE__EXMODE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(ScxmlPackage.Literals.SERVICE_TEMPLATE__TRANSITION);
			childrenFeatures.add(ScxmlPackage.Literals.SERVICE_TEMPLATE__STATE);
			childrenFeatures.add(ScxmlPackage.Literals.SERVICE_TEMPLATE__INITIAL);
			childrenFeatures.add(ScxmlPackage.Literals.SERVICE_TEMPLATE__FINAL);
			childrenFeatures.add(ScxmlPackage.Literals.SERVICE_TEMPLATE__PARALLEL);
			childrenFeatures.add(ScxmlPackage.Literals.SERVICE_TEMPLATE__DATAMODEL);
			childrenFeatures.add(ScxmlPackage.Literals.SERVICE_TEMPLATE__SCRIPT);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns ServiceTemplate.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ServiceTemplate"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ServiceTemplate)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ServiceTemplate_type") :
			getString("_UI_ServiceTemplate_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(ServiceTemplate.class)) {
			case ScxmlPackage.SERVICE_TEMPLATE__NAME:
			case ScxmlPackage.SERVICE_TEMPLATE__XMLNS:
			case ScxmlPackage.SERVICE_TEMPLATE__VERSION:
			case ScxmlPackage.SERVICE_TEMPLATE__PROFILE:
			case ScxmlPackage.SERVICE_TEMPLATE__EXMODE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ScxmlPackage.SERVICE_TEMPLATE__TRANSITION:
			case ScxmlPackage.SERVICE_TEMPLATE__STATE:
			case ScxmlPackage.SERVICE_TEMPLATE__INITIAL:
			case ScxmlPackage.SERVICE_TEMPLATE__FINAL:
			case ScxmlPackage.SERVICE_TEMPLATE__PARALLEL:
			case ScxmlPackage.SERVICE_TEMPLATE__DATAMODEL:
			case ScxmlPackage.SERVICE_TEMPLATE__SCRIPT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(ScxmlPackage.Literals.SERVICE_TEMPLATE__TRANSITION,
				 ScxmlFactory.eINSTANCE.createTransition()));

		newChildDescriptors.add
			(createChildParameter
				(ScxmlPackage.Literals.SERVICE_TEMPLATE__STATE,
				 ScxmlFactory.eINSTANCE.createState()));

		newChildDescriptors.add
			(createChildParameter
				(ScxmlPackage.Literals.SERVICE_TEMPLATE__INITIAL,
				 ScxmlFactory.eINSTANCE.createInitialState()));

		newChildDescriptors.add
			(createChildParameter
				(ScxmlPackage.Literals.SERVICE_TEMPLATE__FINAL,
				 ScxmlFactory.eINSTANCE.createFinalState()));

		newChildDescriptors.add
			(createChildParameter
				(ScxmlPackage.Literals.SERVICE_TEMPLATE__PARALLEL,
				 ScxmlFactory.eINSTANCE.createParallel()));

		newChildDescriptors.add
			(createChildParameter
				(ScxmlPackage.Literals.SERVICE_TEMPLATE__DATAMODEL,
				 ScxmlFactory.eINSTANCE.createDataModel()));

		newChildDescriptors.add
			(createChildParameter
				(ScxmlPackage.Literals.SERVICE_TEMPLATE__SCRIPT,
				 ScxmlFactory.eINSTANCE.createScript()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ScxmlEditPlugin.INSTANCE;
	}

}
