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

import scxml.If;
import scxml.ScxmlFactory;
import scxml.ScxmlPackage;

/**
 * This is the item provider adapter for a {@link scxml.If} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IfItemProvider 
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
	public IfItemProvider(AdapterFactory adapterFactory) {
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

			addCondPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Cond feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCondPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_If_cond_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_If_cond_feature", "_UI_If_type"),
				 ScxmlPackage.Literals.IF__COND,
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
			childrenFeatures.add(ScxmlPackage.Literals.IF__ELSEIF);
			childrenFeatures.add(ScxmlPackage.Literals.IF__ELSE);
			childrenFeatures.add(ScxmlPackage.Literals.IF__ASSIGN);
			childrenFeatures.add(ScxmlPackage.Literals.IF__CANCEL);
			childrenFeatures.add(ScxmlPackage.Literals.IF__IF);
			childrenFeatures.add(ScxmlPackage.Literals.IF__LOG);
			childrenFeatures.add(ScxmlPackage.Literals.IF__PARAM);
			childrenFeatures.add(ScxmlPackage.Literals.IF__RAISE);
			childrenFeatures.add(ScxmlPackage.Literals.IF__SEND);
			childrenFeatures.add(ScxmlPackage.Literals.IF__VALIDATE);
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
	 * This returns If.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/If"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((If)object).getCond();
		return label == null || label.length() == 0 ?
			getString("_UI_If_type") :
			getString("_UI_If_type") + " " + label;
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

		switch (notification.getFeatureID(If.class)) {
			case ScxmlPackage.IF__COND:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ScxmlPackage.IF__ELSEIF:
			case ScxmlPackage.IF__ELSE:
			case ScxmlPackage.IF__ASSIGN:
			case ScxmlPackage.IF__CANCEL:
			case ScxmlPackage.IF__IF:
			case ScxmlPackage.IF__LOG:
			case ScxmlPackage.IF__PARAM:
			case ScxmlPackage.IF__RAISE:
			case ScxmlPackage.IF__SEND:
			case ScxmlPackage.IF__VALIDATE:
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
				(ScxmlPackage.Literals.IF__ELSEIF,
				 ScxmlFactory.eINSTANCE.createElseIf()));

		newChildDescriptors.add
			(createChildParameter
				(ScxmlPackage.Literals.IF__ELSE,
				 ScxmlFactory.eINSTANCE.createElse()));

		newChildDescriptors.add
			(createChildParameter
				(ScxmlPackage.Literals.IF__ASSIGN,
				 ScxmlFactory.eINSTANCE.createAssign()));

		newChildDescriptors.add
			(createChildParameter
				(ScxmlPackage.Literals.IF__CANCEL,
				 ScxmlFactory.eINSTANCE.createCancel()));

		newChildDescriptors.add
			(createChildParameter
				(ScxmlPackage.Literals.IF__IF,
				 ScxmlFactory.eINSTANCE.createIf()));

		newChildDescriptors.add
			(createChildParameter
				(ScxmlPackage.Literals.IF__LOG,
				 ScxmlFactory.eINSTANCE.createLog()));

		newChildDescriptors.add
			(createChildParameter
				(ScxmlPackage.Literals.IF__PARAM,
				 ScxmlFactory.eINSTANCE.createParam()));

		newChildDescriptors.add
			(createChildParameter
				(ScxmlPackage.Literals.IF__RAISE,
				 ScxmlFactory.eINSTANCE.createRaise()));

		newChildDescriptors.add
			(createChildParameter
				(ScxmlPackage.Literals.IF__SEND,
				 ScxmlFactory.eINSTANCE.createSend()));

		newChildDescriptors.add
			(createChildParameter
				(ScxmlPackage.Literals.IF__VALIDATE,
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
