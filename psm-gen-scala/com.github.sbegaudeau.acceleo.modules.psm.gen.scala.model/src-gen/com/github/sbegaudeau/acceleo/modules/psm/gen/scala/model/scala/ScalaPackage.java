/**
 * Copyright (c) 2011 Stephane Begaudeau.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *  
 *  Contributors:
 *     Stephane Begaudeau - initial API and implementation
 */
package com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.ScalaFactory
 * @model kind="package"
 * @generated
 */
public interface ScalaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "scala"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://github.com/sbegaudeau/acceleo/scalametamodel/2011/01"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "scala"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ScalaPackage eINSTANCE = com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.ScalaPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Element <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Element
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.ScalaPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__OWNED_COMMENT = 0;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.NamedElement <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.NamedElement
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.ScalaPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__OWNED_COMMENT = ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.TypedElement <em>Typed Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.TypedElement
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.ScalaPackageImpl#getTypedElement()
	 * @generated
	 */
	int TYPED_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT__OWNED_COMMENT = ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT__TYPE = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Option</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT__IS_OPTION = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Typed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Classifier <em>Classifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Classifier
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.ScalaPackageImpl#getClassifier()
	 * @generated
	 */
	int CLASSIFIER = 3;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__OWNED_COMMENT = NAMED_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__FIELDS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__METHODS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Super Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__SUPER_TYPE = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Traits</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__TRAITS = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.CaseClassifier <em>Case Classifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.CaseClassifier
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.ScalaPackageImpl#getCaseClassifier()
	 * @generated
	 */
	int CASE_CLASSIFIER = 4;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CLASSIFIER__OWNED_COMMENT = CLASSIFIER__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CLASSIFIER__NAME = CLASSIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CLASSIFIER__FIELDS = CLASSIFIER__FIELDS;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CLASSIFIER__METHODS = CLASSIFIER__METHODS;

	/**
	 * The feature id for the '<em><b>Super Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CLASSIFIER__SUPER_TYPE = CLASSIFIER__SUPER_TYPE;

	/**
	 * The feature id for the '<em><b>Traits</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CLASSIFIER__TRAITS = CLASSIFIER__TRAITS;

	/**
	 * The feature id for the '<em><b>Is Case</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CLASSIFIER__IS_CASE = CLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Case Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CLASSIFIER_FEATURE_COUNT = CLASSIFIER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.ExtendableClassifierImpl <em>Extendable Classifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.ExtendableClassifierImpl
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.ScalaPackageImpl#getExtendableClassifier()
	 * @generated
	 */
	int EXTENDABLE_CLASSIFIER = 5;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDABLE_CLASSIFIER__OWNED_COMMENT = CLASSIFIER__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDABLE_CLASSIFIER__NAME = CLASSIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDABLE_CLASSIFIER__FIELDS = CLASSIFIER__FIELDS;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDABLE_CLASSIFIER__METHODS = CLASSIFIER__METHODS;

	/**
	 * The feature id for the '<em><b>Super Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDABLE_CLASSIFIER__SUPER_TYPE = CLASSIFIER__SUPER_TYPE;

	/**
	 * The feature id for the '<em><b>Traits</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDABLE_CLASSIFIER__TRAITS = CLASSIFIER__TRAITS;

	/**
	 * The feature id for the '<em><b>Is Sealed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDABLE_CLASSIFIER__IS_SEALED = CLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Extendable Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDABLE_CLASSIFIER_FEATURE_COUNT = CLASSIFIER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.ClassImpl <em>Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.ClassImpl
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.ScalaPackageImpl#getClass_()
	 * @generated
	 */
	int CLASS = 6;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__OWNED_COMMENT = CASE_CLASSIFIER__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__NAME = CASE_CLASSIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__FIELDS = CASE_CLASSIFIER__FIELDS;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__METHODS = CASE_CLASSIFIER__METHODS;

	/**
	 * The feature id for the '<em><b>Super Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__SUPER_TYPE = CASE_CLASSIFIER__SUPER_TYPE;

	/**
	 * The feature id for the '<em><b>Traits</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__TRAITS = CASE_CLASSIFIER__TRAITS;

	/**
	 * The feature id for the '<em><b>Is Case</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__IS_CASE = CASE_CLASSIFIER__IS_CASE;

	/**
	 * The feature id for the '<em><b>Is Sealed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__IS_SEALED = CASE_CLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Constructors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__CONSTRUCTORS = CASE_CLASSIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Companion Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__COMPANION_OBJECT = CASE_CLASSIFIER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__IS_FINAL = CASE_CLASSIFIER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__IS_ABSTRACT = CASE_CLASSIFIER_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_FEATURE_COUNT = CASE_CLASSIFIER_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.ObjectImpl <em>Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.ObjectImpl
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.ScalaPackageImpl#getObject()
	 * @generated
	 */
	int OBJECT = 7;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__OWNED_COMMENT = CASE_CLASSIFIER__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__NAME = CASE_CLASSIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__FIELDS = CASE_CLASSIFIER__FIELDS;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__METHODS = CASE_CLASSIFIER__METHODS;

	/**
	 * The feature id for the '<em><b>Super Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__SUPER_TYPE = CASE_CLASSIFIER__SUPER_TYPE;

	/**
	 * The feature id for the '<em><b>Traits</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__TRAITS = CASE_CLASSIFIER__TRAITS;

	/**
	 * The feature id for the '<em><b>Is Case</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__IS_CASE = CASE_CLASSIFIER__IS_CASE;

	/**
	 * The feature id for the '<em><b>Companion Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__COMPANION_CLASS = CASE_CLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FEATURE_COUNT = CASE_CLASSIFIER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.TraitImpl <em>Trait</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.TraitImpl
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.ScalaPackageImpl#getTrait()
	 * @generated
	 */
	int TRAIT = 8;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIT__OWNED_COMMENT = EXTENDABLE_CLASSIFIER__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIT__NAME = EXTENDABLE_CLASSIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIT__FIELDS = EXTENDABLE_CLASSIFIER__FIELDS;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIT__METHODS = EXTENDABLE_CLASSIFIER__METHODS;

	/**
	 * The feature id for the '<em><b>Super Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIT__SUPER_TYPE = EXTENDABLE_CLASSIFIER__SUPER_TYPE;

	/**
	 * The feature id for the '<em><b>Traits</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIT__TRAITS = EXTENDABLE_CLASSIFIER__TRAITS;

	/**
	 * The feature id for the '<em><b>Is Sealed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIT__IS_SEALED = EXTENDABLE_CLASSIFIER__IS_SEALED;

	/**
	 * The number of structural features of the '<em>Trait</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIT_FEATURE_COUNT = EXTENDABLE_CLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.FieldImpl <em>Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.FieldImpl
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.ScalaPackageImpl#getField()
	 * @generated
	 */
	int FIELD = 9;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__OWNED_COMMENT = NAMED_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Option</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__IS_OPTION = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Constructor Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__IS_CONSTRUCTOR_PROPERTY = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__IS_FINAL = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Is Overriding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__IS_OVERRIDING = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__VISIBILITY = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.ConstructorImpl <em>Constructor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.ConstructorImpl
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.ScalaPackageImpl#getConstructor()
	 * @generated
	 */
	int CONSTRUCTOR = 10;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__OWNED_COMMENT = ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__PARAMETERS = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Constructor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.MethodImpl <em>Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.MethodImpl
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.ScalaPackageImpl#getMethod()
	 * @generated
	 */
	int METHOD = 11;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__OWNED_COMMENT = NAMED_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__SIGNATURE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__IS_ABSTRACT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__IS_FINAL = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Overriding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__IS_OVERRIDING = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__VISIBILITY = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.MethodSignatureImpl <em>Method Signature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.MethodSignatureImpl
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.ScalaPackageImpl#getMethodSignature()
	 * @generated
	 */
	int METHOD_SIGNATURE = 12;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_SIGNATURE__OWNED_COMMENT = TYPED_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_SIGNATURE__TYPE = TYPED_ELEMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Is Option</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_SIGNATURE__IS_OPTION = TYPED_ELEMENT__IS_OPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_SIGNATURE__NAME = TYPED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_SIGNATURE__PARAMETERS = TYPED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Method Signature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_SIGNATURE_FEATURE_COUNT = TYPED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.ModelImpl
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.ScalaPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 13;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__OWNED_COMMENT = NAMED_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__PACKAGES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.ParameterImpl
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.ScalaPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 14;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__OWNED_COMMENT = NAMED_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Option</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__IS_OPTION = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.PackageImpl <em>Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.PackageImpl
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.ScalaPackageImpl#getPackage()
	 * @generated
	 */
	int PACKAGE = 15;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__OWNED_COMMENT = NAMED_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Files</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__FILES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sub Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__SUB_PACKAGES = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Super Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__SUPER_PACKAGE = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.FileImpl <em>File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.FileImpl
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.ScalaPackageImpl#getFile()
	 * @generated
	 */
	int FILE = 16;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__OWNED_COMMENT = NAMED_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Classifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__CLASSIFIERS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Type <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Type
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.ScalaPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 17;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__OWNED_COMMENT = NAMED_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.VisibilityImpl <em>Visibility</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.VisibilityImpl
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.ScalaPackageImpl#getVisibility()
	 * @generated
	 */
	int VISIBILITY = 18;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY__KIND = 0;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY__SCOPE = 1;

	/**
	 * The number of structural features of the '<em>Visibility</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.VisibilityScope <em>Visibility Scope</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.VisibilityScope
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.ScalaPackageImpl#getVisibilityScope()
	 * @generated
	 */
	int VISIBILITY_SCOPE = 19;

	/**
	 * The number of structural features of the '<em>Visibility Scope</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY_SCOPE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.VisibilityKind <em>Visibility Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.VisibilityKind
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.ScalaPackageImpl#getVisibilityKind()
	 * @generated
	 */
	int VISIBILITY_KIND = 20;

	/**
	 * Returns the meta object for class '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the attribute '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Element#getOwnedComment <em>Owned Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owned Comment</em>'.
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Element#getOwnedComment()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_OwnedComment();

	/**
	 * Returns the meta object for class '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.TypedElement <em>Typed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Typed Element</em>'.
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.TypedElement
	 * @generated
	 */
	EClass getTypedElement();

	/**
	 * Returns the meta object for the reference '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.TypedElement#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.TypedElement#getType()
	 * @see #getTypedElement()
	 * @generated
	 */
	EReference getTypedElement_Type();

	/**
	 * Returns the meta object for the attribute '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.TypedElement#isIsOption <em>Is Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Option</em>'.
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.TypedElement#isIsOption()
	 * @see #getTypedElement()
	 * @generated
	 */
	EAttribute getTypedElement_IsOption();

	/**
	 * Returns the meta object for class '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Classifier <em>Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classifier</em>'.
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Classifier
	 * @generated
	 */
	EClass getClassifier();

	/**
	 * Returns the meta object for the containment reference list '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Classifier#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fields</em>'.
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Classifier#getFields()
	 * @see #getClassifier()
	 * @generated
	 */
	EReference getClassifier_Fields();

	/**
	 * Returns the meta object for the containment reference list '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Classifier#getMethods <em>Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Methods</em>'.
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Classifier#getMethods()
	 * @see #getClassifier()
	 * @generated
	 */
	EReference getClassifier_Methods();

	/**
	 * Returns the meta object for the reference '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Classifier#getSuperType <em>Super Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Super Type</em>'.
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Classifier#getSuperType()
	 * @see #getClassifier()
	 * @generated
	 */
	EReference getClassifier_SuperType();

	/**
	 * Returns the meta object for the reference list '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Classifier#getTraits <em>Traits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Traits</em>'.
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Classifier#getTraits()
	 * @see #getClassifier()
	 * @generated
	 */
	EReference getClassifier_Traits();

	/**
	 * Returns the meta object for class '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.CaseClassifier <em>Case Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Case Classifier</em>'.
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.CaseClassifier
	 * @generated
	 */
	EClass getCaseClassifier();

	/**
	 * Returns the meta object for the attribute '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.CaseClassifier#isIsCase <em>Is Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Case</em>'.
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.CaseClassifier#isIsCase()
	 * @see #getCaseClassifier()
	 * @generated
	 */
	EAttribute getCaseClassifier_IsCase();

	/**
	 * Returns the meta object for class '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.ExtendableClassifier <em>Extendable Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extendable Classifier</em>'.
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.ExtendableClassifier
	 * @generated
	 */
	EClass getExtendableClassifier();

	/**
	 * Returns the meta object for the attribute '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.ExtendableClassifier#isIsSealed <em>Is Sealed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Sealed</em>'.
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.ExtendableClassifier#isIsSealed()
	 * @see #getExtendableClassifier()
	 * @generated
	 */
	EAttribute getExtendableClassifier_IsSealed();

	/**
	 * Returns the meta object for class '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class</em>'.
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Class
	 * @generated
	 */
	EClass getClass_();

	/**
	 * Returns the meta object for the containment reference list '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Class#getConstructors <em>Constructors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constructors</em>'.
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Class#getConstructors()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Constructors();

	/**
	 * Returns the meta object for the reference '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Class#getCompanionObject <em>Companion Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Companion Object</em>'.
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Class#getCompanionObject()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_CompanionObject();

	/**
	 * Returns the meta object for the attribute '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Class#isIsFinal <em>Is Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Final</em>'.
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Class#isIsFinal()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_IsFinal();

	/**
	 * Returns the meta object for the attribute '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Class#isIsAbstract <em>Is Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Abstract</em>'.
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Class#isIsAbstract()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_IsAbstract();

	/**
	 * Returns the meta object for class '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Object <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object</em>'.
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Object
	 * @generated
	 */
	EClass getObject();

	/**
	 * Returns the meta object for the reference '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Object#getCompanionClass <em>Companion Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Companion Class</em>'.
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Object#getCompanionClass()
	 * @see #getObject()
	 * @generated
	 */
	EReference getObject_CompanionClass();

	/**
	 * Returns the meta object for class '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Trait <em>Trait</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trait</em>'.
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Trait
	 * @generated
	 */
	EClass getTrait();

	/**
	 * Returns the meta object for class '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field</em>'.
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Field
	 * @generated
	 */
	EClass getField();

	/**
	 * Returns the meta object for the attribute '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Field#isIsConstructorProperty <em>Is Constructor Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Constructor Property</em>'.
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Field#isIsConstructorProperty()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_IsConstructorProperty();

	/**
	 * Returns the meta object for the attribute '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Field#isIsFinal <em>Is Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Final</em>'.
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Field#isIsFinal()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_IsFinal();

	/**
	 * Returns the meta object for the attribute '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Field#isIsOverriding <em>Is Overriding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Overriding</em>'.
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Field#isIsOverriding()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_IsOverriding();

	/**
	 * Returns the meta object for the containment reference '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Field#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Visibility</em>'.
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Field#getVisibility()
	 * @see #getField()
	 * @generated
	 */
	EReference getField_Visibility();

	/**
	 * Returns the meta object for class '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Constructor <em>Constructor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constructor</em>'.
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Constructor
	 * @generated
	 */
	EClass getConstructor();

	/**
	 * Returns the meta object for the containment reference list '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Constructor#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Constructor#getParameters()
	 * @see #getConstructor()
	 * @generated
	 */
	EReference getConstructor_Parameters();

	/**
	 * Returns the meta object for class '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Method <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method</em>'.
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Method
	 * @generated
	 */
	EClass getMethod();

	/**
	 * Returns the meta object for the containment reference '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Method#getSignature <em>Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Signature</em>'.
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Method#getSignature()
	 * @see #getMethod()
	 * @generated
	 */
	EReference getMethod_Signature();

	/**
	 * Returns the meta object for the attribute '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Method#isIsAbstract <em>Is Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Abstract</em>'.
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Method#isIsAbstract()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_IsAbstract();

	/**
	 * Returns the meta object for the attribute '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Method#isIsFinal <em>Is Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Final</em>'.
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Method#isIsFinal()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_IsFinal();

	/**
	 * Returns the meta object for the attribute '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Method#isIsOverriding <em>Is Overriding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Overriding</em>'.
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Method#isIsOverriding()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_IsOverriding();

	/**
	 * Returns the meta object for the containment reference '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Method#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Visibility</em>'.
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Method#getVisibility()
	 * @see #getMethod()
	 * @generated
	 */
	EReference getMethod_Visibility();

	/**
	 * Returns the meta object for class '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.MethodSignature <em>Method Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Signature</em>'.
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.MethodSignature
	 * @generated
	 */
	EClass getMethodSignature();

	/**
	 * Returns the meta object for the containment reference list '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.MethodSignature#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.MethodSignature#getParameters()
	 * @see #getMethodSignature()
	 * @generated
	 */
	EReference getMethodSignature_Parameters();

	/**
	 * Returns the meta object for class '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the containment reference list '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Model#getPackages <em>Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Packages</em>'.
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Model#getPackages()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Packages();

	/**
	 * Returns the meta object for class '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for class '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package</em>'.
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Package
	 * @generated
	 */
	EClass getPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Package#getFiles <em>Files</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Files</em>'.
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Package#getFiles()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_Files();

	/**
	 * Returns the meta object for the containment reference list '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Package#getSubPackages <em>Sub Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Packages</em>'.
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Package#getSubPackages()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_SubPackages();

	/**
	 * Returns the meta object for the container reference '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Package#getSuperPackage <em>Super Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Super Package</em>'.
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Package#getSuperPackage()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_SuperPackage();

	/**
	 * Returns the meta object for class '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.File <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File</em>'.
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.File
	 * @generated
	 */
	EClass getFile();

	/**
	 * Returns the meta object for the containment reference list '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.File#getClassifiers <em>Classifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classifiers</em>'.
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.File#getClassifiers()
	 * @see #getFile()
	 * @generated
	 */
	EReference getFile_Classifiers();

	/**
	 * Returns the meta object for class '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for class '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Visibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Visibility</em>'.
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Visibility
	 * @generated
	 */
	EClass getVisibility();

	/**
	 * Returns the meta object for the attribute '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Visibility#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Visibility#getKind()
	 * @see #getVisibility()
	 * @generated
	 */
	EAttribute getVisibility_Kind();

	/**
	 * Returns the meta object for the reference '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Visibility#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Scope</em>'.
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Visibility#getScope()
	 * @see #getVisibility()
	 * @generated
	 */
	EReference getVisibility_Scope();

	/**
	 * Returns the meta object for class '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.VisibilityScope <em>Visibility Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Visibility Scope</em>'.
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.VisibilityScope
	 * @generated
	 */
	EClass getVisibilityScope();

	/**
	 * Returns the meta object for enum '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.VisibilityKind <em>Visibility Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Visibility Kind</em>'.
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.VisibilityKind
	 * @generated
	 */
	EEnum getVisibilityKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ScalaFactory getScalaFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Element <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Element
		 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.ScalaPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '<em><b>Owned Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__OWNED_COMMENT = eINSTANCE.getElement_OwnedComment();

		/**
		 * The meta object literal for the '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.NamedElement <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.NamedElement
		 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.ScalaPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.TypedElement <em>Typed Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.TypedElement
		 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.ScalaPackageImpl#getTypedElement()
		 * @generated
		 */
		EClass TYPED_ELEMENT = eINSTANCE.getTypedElement();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPED_ELEMENT__TYPE = eINSTANCE.getTypedElement_Type();

		/**
		 * The meta object literal for the '<em><b>Is Option</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPED_ELEMENT__IS_OPTION = eINSTANCE
				.getTypedElement_IsOption();

		/**
		 * The meta object literal for the '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Classifier <em>Classifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Classifier
		 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.ScalaPackageImpl#getClassifier()
		 * @generated
		 */
		EClass CLASSIFIER = eINSTANCE.getClassifier();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFIER__FIELDS = eINSTANCE.getClassifier_Fields();

		/**
		 * The meta object literal for the '<em><b>Methods</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFIER__METHODS = eINSTANCE.getClassifier_Methods();

		/**
		 * The meta object literal for the '<em><b>Super Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFIER__SUPER_TYPE = eINSTANCE.getClassifier_SuperType();

		/**
		 * The meta object literal for the '<em><b>Traits</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFIER__TRAITS = eINSTANCE.getClassifier_Traits();

		/**
		 * The meta object literal for the '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.CaseClassifier <em>Case Classifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.CaseClassifier
		 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.ScalaPackageImpl#getCaseClassifier()
		 * @generated
		 */
		EClass CASE_CLASSIFIER = eINSTANCE.getCaseClassifier();

		/**
		 * The meta object literal for the '<em><b>Is Case</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CASE_CLASSIFIER__IS_CASE = eINSTANCE
				.getCaseClassifier_IsCase();

		/**
		 * The meta object literal for the '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.ExtendableClassifierImpl <em>Extendable Classifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.ExtendableClassifierImpl
		 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.ScalaPackageImpl#getExtendableClassifier()
		 * @generated
		 */
		EClass EXTENDABLE_CLASSIFIER = eINSTANCE.getExtendableClassifier();

		/**
		 * The meta object literal for the '<em><b>Is Sealed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENDABLE_CLASSIFIER__IS_SEALED = eINSTANCE
				.getExtendableClassifier_IsSealed();

		/**
		 * The meta object literal for the '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.ClassImpl <em>Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.ClassImpl
		 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.ScalaPackageImpl#getClass_()
		 * @generated
		 */
		EClass CLASS = eINSTANCE.getClass_();

		/**
		 * The meta object literal for the '<em><b>Constructors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__CONSTRUCTORS = eINSTANCE.getClass_Constructors();

		/**
		 * The meta object literal for the '<em><b>Companion Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__COMPANION_OBJECT = eINSTANCE
				.getClass_CompanionObject();

		/**
		 * The meta object literal for the '<em><b>Is Final</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS__IS_FINAL = eINSTANCE.getClass_IsFinal();

		/**
		 * The meta object literal for the '<em><b>Is Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS__IS_ABSTRACT = eINSTANCE.getClass_IsAbstract();

		/**
		 * The meta object literal for the '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.ObjectImpl <em>Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.ObjectImpl
		 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.ScalaPackageImpl#getObject()
		 * @generated
		 */
		EClass OBJECT = eINSTANCE.getObject();

		/**
		 * The meta object literal for the '<em><b>Companion Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT__COMPANION_CLASS = eINSTANCE
				.getObject_CompanionClass();

		/**
		 * The meta object literal for the '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.TraitImpl <em>Trait</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.TraitImpl
		 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.ScalaPackageImpl#getTrait()
		 * @generated
		 */
		EClass TRAIT = eINSTANCE.getTrait();

		/**
		 * The meta object literal for the '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.FieldImpl <em>Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.FieldImpl
		 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.ScalaPackageImpl#getField()
		 * @generated
		 */
		EClass FIELD = eINSTANCE.getField();

		/**
		 * The meta object literal for the '<em><b>Is Constructor Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__IS_CONSTRUCTOR_PROPERTY = eINSTANCE
				.getField_IsConstructorProperty();

		/**
		 * The meta object literal for the '<em><b>Is Final</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__IS_FINAL = eINSTANCE.getField_IsFinal();

		/**
		 * The meta object literal for the '<em><b>Is Overriding</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__IS_OVERRIDING = eINSTANCE.getField_IsOverriding();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD__VISIBILITY = eINSTANCE.getField_Visibility();

		/**
		 * The meta object literal for the '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.ConstructorImpl <em>Constructor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.ConstructorImpl
		 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.ScalaPackageImpl#getConstructor()
		 * @generated
		 */
		EClass CONSTRUCTOR = eINSTANCE.getConstructor();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRUCTOR__PARAMETERS = eINSTANCE
				.getConstructor_Parameters();

		/**
		 * The meta object literal for the '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.MethodImpl <em>Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.MethodImpl
		 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.ScalaPackageImpl#getMethod()
		 * @generated
		 */
		EClass METHOD = eINSTANCE.getMethod();

		/**
		 * The meta object literal for the '<em><b>Signature</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD__SIGNATURE = eINSTANCE.getMethod_Signature();

		/**
		 * The meta object literal for the '<em><b>Is Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__IS_ABSTRACT = eINSTANCE.getMethod_IsAbstract();

		/**
		 * The meta object literal for the '<em><b>Is Final</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__IS_FINAL = eINSTANCE.getMethod_IsFinal();

		/**
		 * The meta object literal for the '<em><b>Is Overriding</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__IS_OVERRIDING = eINSTANCE.getMethod_IsOverriding();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD__VISIBILITY = eINSTANCE.getMethod_Visibility();

		/**
		 * The meta object literal for the '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.MethodSignatureImpl <em>Method Signature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.MethodSignatureImpl
		 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.ScalaPackageImpl#getMethodSignature()
		 * @generated
		 */
		EClass METHOD_SIGNATURE = eINSTANCE.getMethodSignature();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD_SIGNATURE__PARAMETERS = eINSTANCE
				.getMethodSignature_Parameters();

		/**
		 * The meta object literal for the '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.ModelImpl
		 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.ScalaPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Packages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__PACKAGES = eINSTANCE.getModel_Packages();

		/**
		 * The meta object literal for the '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.ParameterImpl
		 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.ScalaPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.PackageImpl <em>Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.PackageImpl
		 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.ScalaPackageImpl#getPackage()
		 * @generated
		 */
		EClass PACKAGE = eINSTANCE.getPackage();

		/**
		 * The meta object literal for the '<em><b>Files</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__FILES = eINSTANCE.getPackage_Files();

		/**
		 * The meta object literal for the '<em><b>Sub Packages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__SUB_PACKAGES = eINSTANCE.getPackage_SubPackages();

		/**
		 * The meta object literal for the '<em><b>Super Package</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__SUPER_PACKAGE = eINSTANCE.getPackage_SuperPackage();

		/**
		 * The meta object literal for the '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.FileImpl <em>File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.FileImpl
		 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.ScalaPackageImpl#getFile()
		 * @generated
		 */
		EClass FILE = eINSTANCE.getFile();

		/**
		 * The meta object literal for the '<em><b>Classifiers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILE__CLASSIFIERS = eINSTANCE.getFile_Classifiers();

		/**
		 * The meta object literal for the '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Type <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Type
		 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.ScalaPackageImpl#getType()
		 * @generated
		 */
		EClass TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.VisibilityImpl <em>Visibility</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.VisibilityImpl
		 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.ScalaPackageImpl#getVisibility()
		 * @generated
		 */
		EClass VISIBILITY = eINSTANCE.getVisibility();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VISIBILITY__KIND = eINSTANCE.getVisibility_Kind();

		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VISIBILITY__SCOPE = eINSTANCE.getVisibility_Scope();

		/**
		 * The meta object literal for the '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.VisibilityScope <em>Visibility Scope</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.VisibilityScope
		 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.ScalaPackageImpl#getVisibilityScope()
		 * @generated
		 */
		EClass VISIBILITY_SCOPE = eINSTANCE.getVisibilityScope();

		/**
		 * The meta object literal for the '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.VisibilityKind <em>Visibility Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.VisibilityKind
		 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.ScalaPackageImpl#getVisibilityKind()
		 * @generated
		 */
		EEnum VISIBILITY_KIND = eINSTANCE.getVisibilityKind();

	}

} //ScalaPackage
