/**
 */
package dataflow.provider;

import dataflow.util.DataflowAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DataflowItemProviderAdapterFactory extends DataflowAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataflowItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link dataflow.Model} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelItemProvider modelItemProvider;

	/**
	 * This creates an adapter for a {@link dataflow.Model}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createModelAdapter() {
		if (modelItemProvider == null) {
			modelItemProvider = new ModelItemProvider(this);
		}

		return modelItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link dataflow.AllInstances} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AllInstancesItemProvider allInstancesItemProvider;

	/**
	 * This creates an adapter for a {@link dataflow.AllInstances}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAllInstancesAdapter() {
		if (allInstancesItemProvider == null) {
			allInstancesItemProvider = new AllInstancesItemProvider(this);
		}

		return allInstancesItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link dataflow.NewInstance} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NewInstanceItemProvider newInstanceItemProvider;

	/**
	 * This creates an adapter for a {@link dataflow.NewInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNewInstanceAdapter() {
		if (newInstanceItemProvider == null) {
			newInstanceItemProvider = new NewInstanceItemProvider(this);
		}

		return newInstanceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link dataflow.Filter} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FilterItemProvider filterItemProvider;

	/**
	 * This creates an adapter for a {@link dataflow.Filter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFilterAdapter() {
		if (filterItemProvider == null) {
			filterItemProvider = new FilterItemProvider(this);
		}

		return filterItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link dataflow.Sort} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SortItemProvider sortItemProvider;

	/**
	 * This creates an adapter for a {@link dataflow.Sort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSortAdapter() {
		if (sortItemProvider == null) {
			sortItemProvider = new SortItemProvider(this);
		}

		return sortItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link dataflow.Product} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductItemProvider productItemProvider;

	/**
	 * This creates an adapter for a {@link dataflow.Product}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProductAdapter() {
		if (productItemProvider == null) {
			productItemProvider = new ProductItemProvider(this);
		}

		return productItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link dataflow.GetFeature} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GetFeatureItemProvider getFeatureItemProvider;

	/**
	 * This creates an adapter for a {@link dataflow.GetFeature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGetFeatureAdapter() {
		if (getFeatureItemProvider == null) {
			getFeatureItemProvider = new GetFeatureItemProvider(this);
		}

		return getFeatureItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link dataflow.SetFeature} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SetFeatureItemProvider setFeatureItemProvider;

	/**
	 * This creates an adapter for a {@link dataflow.SetFeature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSetFeatureAdapter() {
		if (setFeatureItemProvider == null) {
			setFeatureItemProvider = new SetFeatureItemProvider(this);
		}

		return setFeatureItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link dataflow.UnsetFeature} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnsetFeatureItemProvider unsetFeatureItemProvider;

	/**
	 * This creates an adapter for a {@link dataflow.UnsetFeature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUnsetFeatureAdapter() {
		if (unsetFeatureItemProvider == null) {
			unsetFeatureItemProvider = new UnsetFeatureItemProvider(this);
		}

		return unsetFeatureItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link dataflow.NewContainer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NewContainerItemProvider newContainerItemProvider;

	/**
	 * This creates an adapter for a {@link dataflow.NewContainer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNewContainerAdapter() {
		if (newContainerItemProvider == null) {
			newContainerItemProvider = new NewContainerItemProvider(this);
		}

		return newContainerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link dataflow.AddToContainer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddToContainerItemProvider addToContainerItemProvider;

	/**
	 * This creates an adapter for a {@link dataflow.AddToContainer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAddToContainerAdapter() {
		if (addToContainerItemProvider == null) {
			addToContainerItemProvider = new AddToContainerItemProvider(this);
		}

		return addToContainerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link dataflow.Evaluate} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EvaluateItemProvider evaluateItemProvider;

	/**
	 * This creates an adapter for a {@link dataflow.Evaluate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEvaluateAdapter() {
		if (evaluateItemProvider == null) {
			evaluateItemProvider = new EvaluateItemProvider(this);
		}

		return evaluateItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link dataflow.IntegerLiteral} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntegerLiteralItemProvider integerLiteralItemProvider;

	/**
	 * This creates an adapter for a {@link dataflow.IntegerLiteral}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIntegerLiteralAdapter() {
		if (integerLiteralItemProvider == null) {
			integerLiteralItemProvider = new IntegerLiteralItemProvider(this);
		}

		return integerLiteralItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link dataflow.BooleanLiteral} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BooleanLiteralItemProvider booleanLiteralItemProvider;

	/**
	 * This creates an adapter for a {@link dataflow.BooleanLiteral}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBooleanLiteralAdapter() {
		if (booleanLiteralItemProvider == null) {
			booleanLiteralItemProvider = new BooleanLiteralItemProvider(this);
		}

		return booleanLiteralItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link dataflow.RealLiteral} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RealLiteralItemProvider realLiteralItemProvider;

	/**
	 * This creates an adapter for a {@link dataflow.RealLiteral}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRealLiteralAdapter() {
		if (realLiteralItemProvider == null) {
			realLiteralItemProvider = new RealLiteralItemProvider(this);
		}

		return realLiteralItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link dataflow.StringLiteral} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StringLiteralItemProvider stringLiteralItemProvider;

	/**
	 * This creates an adapter for a {@link dataflow.StringLiteral}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStringLiteralAdapter() {
		if (stringLiteralItemProvider == null) {
			stringLiteralItemProvider = new StringLiteralItemProvider(this);
		}

		return stringLiteralItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link dataflow.FieldReference} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FieldReferenceItemProvider fieldReferenceItemProvider;

	/**
	 * This creates an adapter for a {@link dataflow.FieldReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFieldReferenceAdapter() {
		if (fieldReferenceItemProvider == null) {
			fieldReferenceItemProvider = new FieldReferenceItemProvider(this);
		}

		return fieldReferenceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link dataflow.UnaryOperation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnaryOperationItemProvider unaryOperationItemProvider;

	/**
	 * This creates an adapter for a {@link dataflow.UnaryOperation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUnaryOperationAdapter() {
		if (unaryOperationItemProvider == null) {
			unaryOperationItemProvider = new UnaryOperationItemProvider(this);
		}

		return unaryOperationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link dataflow.BinaryOperation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BinaryOperationItemProvider binaryOperationItemProvider;

	/**
	 * This creates an adapter for a {@link dataflow.BinaryOperation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBinaryOperationAdapter() {
		if (binaryOperationItemProvider == null) {
			binaryOperationItemProvider = new BinaryOperationItemProvider(this);
		}

		return binaryOperationItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (modelItemProvider != null) modelItemProvider.dispose();
		if (allInstancesItemProvider != null) allInstancesItemProvider.dispose();
		if (newInstanceItemProvider != null) newInstanceItemProvider.dispose();
		if (filterItemProvider != null) filterItemProvider.dispose();
		if (sortItemProvider != null) sortItemProvider.dispose();
		if (productItemProvider != null) productItemProvider.dispose();
		if (getFeatureItemProvider != null) getFeatureItemProvider.dispose();
		if (setFeatureItemProvider != null) setFeatureItemProvider.dispose();
		if (unsetFeatureItemProvider != null) unsetFeatureItemProvider.dispose();
		if (newContainerItemProvider != null) newContainerItemProvider.dispose();
		if (addToContainerItemProvider != null) addToContainerItemProvider.dispose();
		if (evaluateItemProvider != null) evaluateItemProvider.dispose();
		if (integerLiteralItemProvider != null) integerLiteralItemProvider.dispose();
		if (booleanLiteralItemProvider != null) booleanLiteralItemProvider.dispose();
		if (realLiteralItemProvider != null) realLiteralItemProvider.dispose();
		if (stringLiteralItemProvider != null) stringLiteralItemProvider.dispose();
		if (fieldReferenceItemProvider != null) fieldReferenceItemProvider.dispose();
		if (unaryOperationItemProvider != null) unaryOperationItemProvider.dispose();
		if (binaryOperationItemProvider != null) binaryOperationItemProvider.dispose();
	}

}
