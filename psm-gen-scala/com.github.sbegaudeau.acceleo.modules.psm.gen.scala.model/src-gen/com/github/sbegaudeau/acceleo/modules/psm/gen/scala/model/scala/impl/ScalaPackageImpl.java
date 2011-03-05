/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl;

import com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Attribute;
import com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Classifier;
import com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Comment;
import com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Definition;
import com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Element;
import com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.File;
import com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.GenericType;
import com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Method;
import com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.MethodSignature;
import com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Model;
import com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.NamedElement;
import com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Parameter;
import com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.ScalaFactory;
import com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.ScalaPackage;
import com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Trait;
import com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Type;
import com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.TypedElement;
import com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Visibility;
import com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.VisibilityKind;
import com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.VisibilityScope;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ScalaPackageImpl extends EPackageImpl implements ScalaPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass definitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass traitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodSignatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genericTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass visibilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass visibilityScopeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum visibilityKindEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.ScalaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ScalaPackageImpl() {
		super(eNS_URI, ScalaFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ScalaPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ScalaPackage init() {
		if (isInited)
			return (ScalaPackage) EPackage.Registry.INSTANCE
					.getEPackage(ScalaPackage.eNS_URI);

		// Obtain or create and register package
		ScalaPackageImpl theScalaPackage = (ScalaPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof ScalaPackageImpl ? EPackage.Registry.INSTANCE
				.get(eNS_URI) : new ScalaPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theScalaPackage.createPackageContents();

		// Initialize created meta-data
		theScalaPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theScalaPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ScalaPackage.eNS_URI, theScalaPackage);
		return theScalaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElement() {
		return elementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElement_Comment() {
		return (EReference) elementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComment() {
		return commentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComment_Body() {
		return (EAttribute) commentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComment_CommentedElement() {
		return (EReference) commentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
		return (EAttribute) namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypedElement() {
		return typedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypedElement_GenericType() {
		return (EReference) typedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassifier() {
		return classifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassifier_Attributes() {
		return (EReference) classifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassifier_Methods() {
		return (EReference) classifierEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassifier_SuperClass() {
		return (EReference) classifierEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassifier_IsAbstract() {
		return (EAttribute) classifierEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassifier_IsSealed() {
		return (EAttribute) classifierEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefinition() {
		return definitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDefinition_Traits() {
		return (EReference) definitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDefinition_IsCase() {
		return (EAttribute) definitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClass_() {
		return classEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_CompanionObject() {
		return (EReference) classEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObject() {
		return objectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObject_CompanionClass() {
		return (EReference) objectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrait() {
		return traitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttribute() {
		return attributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_IsFinal() {
		return (EAttribute) attributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_IsOverriding() {
		return (EAttribute) attributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttribute_Visibility() {
		return (EReference) attributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMethod() {
		return methodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethod_Signature() {
		return (EReference) methodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethod_IsAbstract() {
		return (EAttribute) methodEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethod_IsFinal() {
		return (EAttribute) methodEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethod_IsOverriding() {
		return (EAttribute) methodEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethod_Visibility() {
		return (EReference) methodEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMethodSignature() {
		return methodSignatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodSignature_Parameters() {
		return (EReference) methodSignatureEClass.getEStructuralFeatures().get(
				0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModel() {
		return modelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_Packages() {
		return (EReference) modelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPackage() {
		return packageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackage_Files() {
		return (EReference) packageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackage_SubPackages() {
		return (EReference) packageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackage_SuperPackage() {
		return (EReference) packageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFile() {
		return fileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFile_Classifiers() {
		return (EReference) fileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getType() {
		return typeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenericType() {
		return genericTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenericType_Type() {
		return (EReference) genericTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenericType_IsOption() {
		return (EAttribute) genericTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVisibility() {
		return visibilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVisibility_Kind() {
		return (EAttribute) visibilityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVisibility_Scope() {
		return (EReference) visibilityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVisibilityScope() {
		return visibilityScopeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVisibilityKind() {
		return visibilityKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScalaFactory getScalaFactory() {
		return (ScalaFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		elementEClass = createEClass(ELEMENT);
		createEReference(elementEClass, ELEMENT__COMMENT);

		commentEClass = createEClass(COMMENT);
		createEAttribute(commentEClass, COMMENT__BODY);
		createEReference(commentEClass, COMMENT__COMMENTED_ELEMENT);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		typedElementEClass = createEClass(TYPED_ELEMENT);
		createEReference(typedElementEClass, TYPED_ELEMENT__GENERIC_TYPE);

		classifierEClass = createEClass(CLASSIFIER);
		createEReference(classifierEClass, CLASSIFIER__ATTRIBUTES);
		createEReference(classifierEClass, CLASSIFIER__METHODS);
		createEReference(classifierEClass, CLASSIFIER__SUPER_CLASS);
		createEAttribute(classifierEClass, CLASSIFIER__IS_ABSTRACT);
		createEAttribute(classifierEClass, CLASSIFIER__IS_SEALED);

		definitionEClass = createEClass(DEFINITION);
		createEReference(definitionEClass, DEFINITION__TRAITS);
		createEAttribute(definitionEClass, DEFINITION__IS_CASE);

		classEClass = createEClass(CLASS);
		createEReference(classEClass, CLASS__COMPANION_OBJECT);

		objectEClass = createEClass(OBJECT);
		createEReference(objectEClass, OBJECT__COMPANION_CLASS);

		traitEClass = createEClass(TRAIT);

		attributeEClass = createEClass(ATTRIBUTE);
		createEAttribute(attributeEClass, ATTRIBUTE__IS_FINAL);
		createEAttribute(attributeEClass, ATTRIBUTE__IS_OVERRIDING);
		createEReference(attributeEClass, ATTRIBUTE__VISIBILITY);

		methodEClass = createEClass(METHOD);
		createEReference(methodEClass, METHOD__SIGNATURE);
		createEAttribute(methodEClass, METHOD__IS_ABSTRACT);
		createEAttribute(methodEClass, METHOD__IS_FINAL);
		createEAttribute(methodEClass, METHOD__IS_OVERRIDING);
		createEReference(methodEClass, METHOD__VISIBILITY);

		methodSignatureEClass = createEClass(METHOD_SIGNATURE);
		createEReference(methodSignatureEClass, METHOD_SIGNATURE__PARAMETERS);

		modelEClass = createEClass(MODEL);
		createEReference(modelEClass, MODEL__PACKAGES);

		parameterEClass = createEClass(PARAMETER);

		packageEClass = createEClass(PACKAGE);
		createEReference(packageEClass, PACKAGE__FILES);
		createEReference(packageEClass, PACKAGE__SUB_PACKAGES);
		createEReference(packageEClass, PACKAGE__SUPER_PACKAGE);

		fileEClass = createEClass(FILE);
		createEReference(fileEClass, FILE__CLASSIFIERS);

		typeEClass = createEClass(TYPE);

		genericTypeEClass = createEClass(GENERIC_TYPE);
		createEReference(genericTypeEClass, GENERIC_TYPE__TYPE);
		createEAttribute(genericTypeEClass, GENERIC_TYPE__IS_OPTION);

		visibilityEClass = createEClass(VISIBILITY);
		createEAttribute(visibilityEClass, VISIBILITY__KIND);
		createEReference(visibilityEClass, VISIBILITY__SCOPE);

		visibilityScopeEClass = createEClass(VISIBILITY_SCOPE);

		// Create enums
		visibilityKindEEnum = createEEnum(VISIBILITY_KIND);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		namedElementEClass.getESuperTypes().add(this.getElement());
		typedElementEClass.getESuperTypes().add(this.getElement());
		classifierEClass.getESuperTypes().add(this.getNamedElement());
		classifierEClass.getESuperTypes().add(this.getType());
		definitionEClass.getESuperTypes().add(this.getClassifier());
		classEClass.getESuperTypes().add(this.getDefinition());
		objectEClass.getESuperTypes().add(this.getDefinition());
		traitEClass.getESuperTypes().add(this.getClassifier());
		attributeEClass.getESuperTypes().add(this.getNamedElement());
		attributeEClass.getESuperTypes().add(this.getTypedElement());
		methodEClass.getESuperTypes().add(this.getNamedElement());
		methodSignatureEClass.getESuperTypes().add(this.getTypedElement());
		methodSignatureEClass.getESuperTypes().add(this.getType());
		modelEClass.getESuperTypes().add(this.getNamedElement());
		parameterEClass.getESuperTypes().add(this.getNamedElement());
		parameterEClass.getESuperTypes().add(this.getTypedElement());
		packageEClass.getESuperTypes().add(this.getNamedElement());
		fileEClass.getESuperTypes().add(this.getNamedElement());
		typeEClass.getESuperTypes().add(this.getNamedElement());
		genericTypeEClass.getESuperTypes().add(this.getType());

		// Initialize classes and features; add operations and parameters
		initEClass(
				elementEClass,
				Element.class,
				"Element", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(
				getElement_Comment(),
				this.getComment(),
				this.getComment_CommentedElement(),
				"comment", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(
				commentEClass,
				Comment.class,
				"Comment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(
				getComment_Body(),
				ecorePackage.getEString(),
				"body", null, 0, 1, Comment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getComment_CommentedElement(),
				this.getElement(),
				this.getElement_Comment(),
				"commentedElement", null, 1, 1, Comment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(
				namedElementEClass,
				NamedElement.class,
				"NamedElement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(
				getNamedElement_Name(),
				ecorePackage.getEString(),
				"name", "", 0, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$

		initEClass(
				typedElementEClass,
				TypedElement.class,
				"TypedElement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(
				getTypedElement_GenericType(),
				this.getGenericType(),
				null,
				"genericType", null, 1, 1, TypedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(
				classifierEClass,
				Classifier.class,
				"Classifier", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(
				getClassifier_Attributes(),
				this.getAttribute(),
				null,
				"attributes", null, 0, -1, Classifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getClassifier_Methods(),
				this.getMethod(),
				null,
				"methods", null, 0, -1, Classifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getClassifier_SuperClass(),
				this.getClass_(),
				null,
				"superClass", null, 0, 1, Classifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getClassifier_IsAbstract(),
				ecorePackage.getEBoolean(),
				"isAbstract", "false", 1, 1, Classifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(
				getClassifier_IsSealed(),
				ecorePackage.getEBoolean(),
				"isSealed", "false", 1, 1, Classifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$

		initEClass(
				definitionEClass,
				Definition.class,
				"Definition", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(
				getDefinition_Traits(),
				this.getTrait(),
				null,
				"traits", null, 0, -1, Definition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getDefinition_IsCase(),
				ecorePackage.getEBoolean(),
				"isCase", "false", 1, 1, Definition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$

		initEClass(
				classEClass,
				com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Class.class,
				"Class", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(
				getClass_CompanionObject(),
				this.getObject(),
				this.getObject_CompanionClass(),
				"companionObject", null, 0, 1, com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(
				objectEClass,
				com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Object.class,
				"Object", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(
				getObject_CompanionClass(),
				this.getClass_(),
				this.getClass_CompanionObject(),
				"companionClass", null, 0, 1, com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Object.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(
				traitEClass,
				Trait.class,
				"Trait", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(
				attributeEClass,
				Attribute.class,
				"Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(
				getAttribute_IsFinal(),
				ecorePackage.getEBoolean(),
				"isFinal", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getAttribute_IsOverriding(),
				ecorePackage.getEBoolean(),
				"isOverriding", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getAttribute_Visibility(),
				this.getVisibility(),
				null,
				"visibility", null, 1, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(
				methodEClass,
				Method.class,
				"Method", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(
				getMethod_Signature(),
				this.getMethodSignature(),
				null,
				"signature", null, 0, 1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getMethod_IsAbstract(),
				ecorePackage.getEBoolean(),
				"isAbstract", null, 0, 1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getMethod_IsFinal(),
				ecorePackage.getEBoolean(),
				"isFinal", null, 0, 1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getMethod_IsOverriding(),
				ecorePackage.getEBoolean(),
				"isOverriding", null, 0, 1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getMethod_Visibility(),
				this.getVisibility(),
				null,
				"visibility", null, 1, 1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(
				methodSignatureEClass,
				MethodSignature.class,
				"MethodSignature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(
				getMethodSignature_Parameters(),
				this.getParameter(),
				null,
				"parameters", null, 0, -1, MethodSignature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(
				modelEClass,
				Model.class,
				"Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(
				getModel_Packages(),
				this.getPackage(),
				null,
				"packages", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(
				parameterEClass,
				Parameter.class,
				"Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(
				packageEClass,
				com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Package.class,
				"Package", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(
				getPackage_Files(),
				this.getFile(),
				null,
				"files", null, 0, -1, com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getPackage_SubPackages(),
				this.getPackage(),
				this.getPackage_SuperPackage(),
				"subPackages", null, 0, -1, com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getPackage_SuperPackage(),
				this.getPackage(),
				this.getPackage_SubPackages(),
				"superPackage", null, 0, 1, com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(
				fileEClass,
				File.class,
				"File", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(
				getFile_Classifiers(),
				this.getClassifier(),
				null,
				"classifiers", null, 0, -1, File.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(typeEClass, Type.class,
				"Type", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(
				genericTypeEClass,
				GenericType.class,
				"GenericType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(
				getGenericType_Type(),
				this.getType(),
				null,
				"type", null, 1, 1, GenericType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getGenericType_IsOption(),
				ecorePackage.getEBoolean(),
				"isOption", "false", 0, 1, GenericType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$

		initEClass(
				visibilityEClass,
				Visibility.class,
				"Visibility", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(
				getVisibility_Kind(),
				this.getVisibilityKind(),
				"kind", null, 1, 1, Visibility.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getVisibility_Scope(),
				this.getVisibilityScope(),
				null,
				"scope", null, 0, 1, Visibility.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(
				visibilityScopeEClass,
				VisibilityScope.class,
				"VisibilityScope", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		// Initialize enums and add enum literals
		initEEnum(visibilityKindEEnum, VisibilityKind.class, "VisibilityKind"); //$NON-NLS-1$
		addEEnumLiteral(visibilityKindEEnum, VisibilityKind.PUBLIC);
		addEEnumLiteral(visibilityKindEEnum, VisibilityKind.PRIVATE);
		addEEnumLiteral(visibilityKindEEnum, VisibilityKind.PROTECTED);

		// Create resource
		createResource(eNS_URI);
	}

} //ScalaPackageImpl
