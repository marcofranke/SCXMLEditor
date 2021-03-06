/**
 */
package scxml.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import scxml.OnEntry;
import scxml.ScxmlFactory;
import scxml.ScxmlPackage;

/**
 * This is the item provider adapter for a {@link scxml.OnEntry} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OnEntryItemProvider 
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
	public OnEntryItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(ScxmlPackage.Literals.ON_ENTRY__SCRIPT);
			childrenFeatures.add(ScxmlPackage.Literals.ON_ENTRY__ASSIGN);
			childrenFeatures.add(ScxmlPackage.Literals.ON_ENTRY__CANCEL);
			childrenFeatures.add(ScxmlPackage.Literals.ON_ENTRY__IF);
			childrenFeatures.add(ScxmlPackage.Literals.ON_ENTRY__LOG);
			childrenFeatures.add(ScxmlPackage.Literals.ON_ENTRY__PARAM);
			childrenFeatures.add(ScxmlPackage.Literals.ON_ENTRY__RAISE);
			childrenFeatures.add(ScxmlPackage.Literals.ON_ENTRY__SEND);
			childrenFeatures.add(ScxmlPackage.Literals.ON_ENTRY__VALIDATE);
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
	 * This returns OnEntry.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/OnEntry"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_OnEntry_type");
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

		switch (notification.getFeatureID(OnEntry.class)) {
			case ScxmlPackage.ON_ENTRY__SCRIPT:
			case ScxmlPackage.ON_ENTRY__ASSIGN:
			case ScxmlPackage.ON_ENTRY__CANCEL:
			case ScxmlPackage.ON_ENTRY__IF:
			case ScxmlPackage.ON_ENTRY__LOG:
			case ScxmlPackage.ON_ENTRY__PARAM:
			case ScxmlPackage.ON_ENTRY__RAISE:
			case ScxmlPackage.ON_ENTRY__SEND:
			case ScxmlPackage.ON_ENTRY__VALIDATE:
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
				(ScxmlPackage.Literals.ON_ENTRY__SCRIPT,
				 ScxmlFactory.eINSTANCE.createScript()));

		newChildDescriptors.add
			(createChildParameter
				(ScxmlPackage.Literals.ON_ENTRY__ASSIGN,
				 ScxmlFactory.eINSTANCE.createAssign()));

		newChildDescriptors.add
			(createChildParameter
				(ScxmlPackage.Literals.ON_ENTRY__CANCEL,
				 ScxmlFactory.eINSTANCE.createCancel()));

		newChildDescriptors.add
			(createChildParameter
				(ScxmlPackage.Literals.ON_ENTRY__IF,
				 ScxmlFactory.eINSTANCE.createIf()));

		newChildDescriptors.add
			(createChildParameter
				(ScxmlPackage.Literals.ON_ENTRY__LOG,
				 ScxmlFactory.eINSTANCE.createLog()));

		newChildDescriptors.add
			(createChildParameter
				(ScxmlPackage.Literals.ON_ENTRY__PARAM,
				 ScxmlFactory.eINSTANCE.createParam()));

		newChildDescriptors.add
			(createChildParameter
				(ScxmlPackage.Literals.ON_ENTRY__RAISE,
				 ScxmlFactory.eINSTANCE.createRaise()));

		newChildDescriptors.add
			(createChildParameter
				(ScxmlPackage.Literals.ON_ENTRY__SEND,
				 ScxmlFactory.eINSTANCE.createSend()));

		newChildDescriptors.add
			(createChildParameter
				(ScxmlPackage.Literals.ON_ENTRY__VALIDATE,
				 ScxmlFactory.eINSTANCE.createValidate()));
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
