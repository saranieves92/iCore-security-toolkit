/**
 */
package context.impl;

import context.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ContextFactoryImpl extends EFactoryImpl implements ContextFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static ContextFactory init() {
        try {
            ContextFactory theContextFactory = (ContextFactory)EPackage.Registry.INSTANCE.getEFactory(ContextPackage.eNS_URI);
            if (theContextFactory != null) {
                return theContextFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new ContextFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ContextFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
            case ContextPackage.CONTEXT_DESIGN_MODEL: return createContextDesignModel();
            case ContextPackage.CONTEXT_RUNTIME_MODEL: return createContextRuntimeModel();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ContextDesignModel createContextDesignModel() {
        ContextDesignModelImpl contextDesignModel = new ContextDesignModelImpl();
        return contextDesignModel;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ContextRuntimeModel createContextRuntimeModel() {
        ContextRuntimeModelImpl contextRuntimeModel = new ContextRuntimeModelImpl();
        return contextRuntimeModel;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ContextPackage getContextPackage() {
        return (ContextPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static ContextPackage getPackage() {
        return ContextPackage.eINSTANCE;
    }

} //ContextFactoryImpl
