/**
 */
package scxml.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import scxml.Parallel;
import scxml.ScxmlFactory;
import scxml.ScxmlPackage;

/**
 * This is the item provider adapter for a {@link scxml.Parallel} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ParallelItemProvider extends NamedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParallelItemProvider(AdapterFactory adapterFactory) {
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

			addIdPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Parallel_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Parallel_id_feature", "_UI_Parallel_type"),
				 ScxmlPackage.Literals.PARALLEL__ID,
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
			childrenFeatures.add(ScxmlPackage.Literals.PARALLEL__ONENTRY);
			childrenFeatures.add(ScxmlPackage.Literals.PARALLEL__ONEXIT);
			childrenFeatures.add(ScxmlPackage.Literals.PARALLEL__PARALLEL);
			childrenFeatures.add(ScxmlPackage.Literals.PARALLEL__STATE);
			childrenFeatures.add(ScxmlPackage.Literals.PARALLEL__HISTORY);
			childrenFeatures.add(ScxmlPackage.Literals.PARALLEL__ANCHOR);
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
	 * This returns Parallel.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Parallel"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Parallel)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_Parallel_type") :
			getString("_UI_Parallel_type") + " " + label;
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

		switch (notification.getFeatureID(Parallel.class)) {
			case ScxmlPackage.PARALLEL__ID:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ScxmlPackage.PARALLEL__ONENTRY:
			case ScxmlPackage.PARALLEL__ONEXIT:
			case ScxmlPackage.PARALLEL__PARALLEL:
			case ScxmlPackage.PARALLEL__STATE:
			case ScxmlPackage.PARALLEL__HISTORY:
			case ScxmlPackage.PARALLEL__ANCHOR:
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
				(ScxmlPackage.Literals.PARALLEL__ONENTRY,
				 ScxmlFactory.eINSTANCE.createOnEntry()));

		newChildDescriptors.add
			(createChildParameter
				(ScxmlPackage.Literals.PARALLEL__ONEXIT,
				 ScxmlFactory.eINSTANCE.createOnExit()));

		newChildDescriptors.add
			(createChildParameter
				(ScxmlPackage.Literals.PARALLEL__PARALLEL,
				 ScxmlFactory.eINSTANCE.createParallel()));

		newChildDescriptors.add
			(createChildParameter
				(ScxmlPackage.Literals.PARALLEL__STATE,
				 ScxmlFactory.eINSTANCE.createState()));

		newChildDescriptors.add
			(createChildParameter
				(ScxmlPackage.Literals.PARALLEL__HISTORY,
				 ScxmlFactory.eINSTANCE.createHistoryState()));

		newChildDescriptors.add
			(createChildParameter
				(ScxmlPackage.Literals.PARALLEL__ANCHOR,
				 ScxmlFactory.eINSTANCE.createAnchor()));
	}

}
