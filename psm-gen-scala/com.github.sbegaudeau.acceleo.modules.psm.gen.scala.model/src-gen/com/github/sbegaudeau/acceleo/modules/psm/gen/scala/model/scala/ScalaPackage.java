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
	 * The feature id for the '<em><b>Comment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__COMMENT = 0;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.CommentImpl <em>Comment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.CommentImpl
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.ScalaPackageImpl#getComment()
	 * @generated
	 */
	int COMMENT = 1;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__BODY = 0;

	/**
	 * The feature id for the '<em><b>Commented Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__COMMENTED_ELEMENT = 1;

	/**
	 * The number of structural features of the '<em>Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.NamedElement <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.NamedElement
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.ScalaPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__COMMENT = ELEMENT__COMMENT;

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
	int TYPED_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT__COMMENT = ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Generic Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT__GENERIC_TYPE = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Typed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Classifier <em>Classifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Classifier
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.ScalaPackageImpl#getClassifier()
	 * @generated
	 */
	int CLASSIFIER = 4;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__COMMENT = NAMED_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__ATTRIBUTES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__METHODS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Super Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__SUPER_CLASS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__IS_ABSTRACT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Is Sealed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__IS_SEALED = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Definition <em>Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Definition
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.ScalaPackageImpl#getDefinition()
	 * @generated
	 */
	int DEFINITION = 5;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION__COMMENT = CLASSIFIER__COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION__NAME = CLASSIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION__ATTRIBUTES = CLASSIFIER__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION__METHODS = CLASSIFIER__METHODS;

	/**
	 * The feature id for the '<em><b>Super Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION__SUPER_CLASS = CLASSIFIER__SUPER_CLASS;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION__IS_ABSTRACT = CLASSIFIER__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Is Sealed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION__IS_SEALED = CLASSIFIER__IS_SEALED;

	/**
	 * The feature id for the '<em><b>Traits</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION__TRAITS = CLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Case</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION__IS_CASE = CLASSIFIER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_FEATURE_COUNT = CLASSIFIER_FEATURE_COUNT + 2;

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
	 * The feature id for the '<em><b>Comment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__COMMENT = DEFINITION__COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__NAME = DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__ATTRIBUTES = DEFINITION__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__METHODS = DEFINITION__METHODS;

	/**
	 * The feature id for the '<em><b>Super Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__SUPER_CLASS = DEFINITION__SUPER_CLASS;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__IS_ABSTRACT = DEFINITION__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Is Sealed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__IS_SEALED = DEFINITION__IS_SEALED;

	/**
	 * The feature id for the '<em><b>Traits</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__TRAITS = DEFINITION__TRAITS;

	/**
	 * The feature id for the '<em><b>Is Case</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__IS_CASE = DEFINITION__IS_CASE;

	/**
	 * The feature id for the '<em><b>Companion Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__COMPANION_OBJECT = DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_FEATURE_COUNT = DEFINITION_FEATURE_COUNT + 1;

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
	 * The feature id for the '<em><b>Comment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__COMMENT = DEFINITION__COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__NAME = DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__ATTRIBUTES = DEFINITION__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__METHODS = DEFINITION__METHODS;

	/**
	 * The feature id for the '<em><b>Super Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__SUPER_CLASS = DEFINITION__SUPER_CLASS;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__IS_ABSTRACT = DEFINITION__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Is Sealed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__IS_SEALED = DEFINITION__IS_SEALED;

	/**
	 * The feature id for the '<em><b>Traits</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__TRAITS = DEFINITION__TRAITS;

	/**
	 * The feature id for the '<em><b>Is Case</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__IS_CASE = DEFINITION__IS_CASE;

	/**
	 * The feature id for the '<em><b>Companion Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__COMPANION_CLASS = DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FEATURE_COUNT = DEFINITION_FEATURE_COUNT + 1;

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
	 * The feature id for the '<em><b>Comment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIT__COMMENT = CLASSIFIER__COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIT__NAME = CLASSIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIT__ATTRIBUTES = CLASSIFIER__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIT__METHODS = CLASSIFIER__METHODS;

	/**
	 * The feature id for the '<em><b>Super Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIT__SUPER_CLASS = CLASSIFIER__SUPER_CLASS;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIT__IS_ABSTRACT = CLASSIFIER__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Is Sealed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIT__IS_SEALED = CLASSIFIER__IS_SEALED;

	/**
	 * The number of structural features of the '<em>Trait</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIT_FEATURE_COUNT = CLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.AttributeImpl
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.ScalaPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 9;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__COMMENT = NAMED_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Generic Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__GENERIC_TYPE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__IS_FINAL = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Overriding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__IS_OVERRIDING = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__VISIBILITY = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.MethodImpl <em>Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.MethodImpl
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.ScalaPackageImpl#getMethod()
	 * @generated
	 */
	int METHOD = 10;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__COMMENT = NAMED_ELEMENT__COMMENT;

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
	int METHOD_SIGNATURE = 11;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_SIGNATURE__COMMENT = TYPED_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Generic Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_SIGNATURE__GENERIC_TYPE = TYPED_ELEMENT__GENERIC_TYPE;

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
	int MODEL = 12;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__COMMENT = NAMED_ELEMENT__COMMENT;

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
	int PARAMETER = 13;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__COMMENT = NAMED_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Generic Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__GENERIC_TYPE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.PackageImpl <em>Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.PackageImpl
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.ScalaPackageImpl#getPackage()
	 * @generated
	 */
	int PACKAGE = 14;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__COMMENT = NAMED_ELEMENT__COMMENT;

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
	int FILE = 15;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__COMMENT = NAMED_ELEMENT__COMMENT;

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
	int TYPE = 16;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__COMMENT = NAMED_ELEMENT__COMMENT;

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
	 * The meta object id for the '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.GenericTypeImpl <em>Generic Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.GenericTypeImpl
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.ScalaPackageImpl#getGenericType()
	 * @generated
	 */
	int GENERIC_TYPE = 17;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_TYPE__COMMENT = TYPE__COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_TYPE__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_TYPE__TYPE = TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Option</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_TYPE__IS_OPTION = TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Generic Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 2;

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
	 * Returns the meta object for the reference '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Element#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Comment</em>'.
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Element#getComment()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Comment();

	/**
	 * Returns the meta object for class '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Comment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comment</em>'.
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Comment
	 * @generated
	 */
	EClass getComment();

	/**
	 * Returns the meta object for the attribute '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Comment#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Comment#getBody()
	 * @see #getComment()
	 * @generated
	 */
	EAttribute getComment_Body();

	/**
	 * Returns the meta object for the reference '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Comment#getCommentedElement <em>Commented Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Commented Element</em>'.
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Comment#getCommentedElement()
	 * @see #getComment()
	 * @generated
	 */
	EReference getComment_CommentedElement();

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
	 * Returns the meta object for the containment reference '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.TypedElement#getGenericType <em>Generic Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Generic Type</em>'.
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.TypedElement#getGenericType()
	 * @see #getTypedElement()
	 * @generated
	 */
	EReference getTypedElement_GenericType();

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
	 * Returns the meta object for the containment reference list '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Classifier#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Classifier#getAttributes()
	 * @see #getClassifier()
	 * @generated
	 */
	EReference getClassifier_Attributes();

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
	 * Returns the meta object for the reference '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Classifier#getSuperClass <em>Super Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Super Class</em>'.
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Classifier#getSuperClass()
	 * @see #getClassifier()
	 * @generated
	 */
	EReference getClassifier_SuperClass();

	/**
	 * Returns the meta object for the attribute '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Classifier#isIsAbstract <em>Is Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Abstract</em>'.
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Classifier#isIsAbstract()
	 * @see #getClassifier()
	 * @generated
	 */
	EAttribute getClassifier_IsAbstract();

	/**
	 * Returns the meta object for the attribute '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Classifier#isIsSealed <em>Is Sealed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Sealed</em>'.
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Classifier#isIsSealed()
	 * @see #getClassifier()
	 * @generated
	 */
	EAttribute getClassifier_IsSealed();

	/**
	 * Returns the meta object for class '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Definition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Definition</em>'.
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Definition
	 * @generated
	 */
	EClass getDefinition();

	/**
	 * Returns the meta object for the reference list '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Definition#getTraits <em>Traits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Traits</em>'.
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Definition#getTraits()
	 * @see #getDefinition()
	 * @generated
	 */
	EReference getDefinition_Traits();

	/**
	 * Returns the meta object for the attribute '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Definition#isIsCase <em>Is Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Case</em>'.
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Definition#isIsCase()
	 * @see #getDefinition()
	 * @generated
	 */
	EAttribute getDefinition_IsCase();

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
	 * Returns the meta object for class '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Attribute#isIsFinal <em>Is Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Final</em>'.
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Attribute#isIsFinal()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_IsFinal();

	/**
	 * Returns the meta object for the attribute '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Attribute#isIsOverriding <em>Is Overriding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Overriding</em>'.
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Attribute#isIsOverriding()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_IsOverriding();

	/**
	 * Returns the meta object for the containment reference '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Attribute#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Visibility</em>'.
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Attribute#getVisibility()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_Visibility();

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
	 * Returns the meta object for class '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.GenericType <em>Generic Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generic Type</em>'.
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.GenericType
	 * @generated
	 */
	EClass getGenericType();

	/**
	 * Returns the meta object for the reference '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.GenericType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.GenericType#getType()
	 * @see #getGenericType()
	 * @generated
	 */
	EReference getGenericType_Type();

	/**
	 * Returns the meta object for the attribute '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.GenericType#isIsOption <em>Is Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Option</em>'.
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.GenericType#isIsOption()
	 * @see #getGenericType()
	 * @generated
	 */
	EAttribute getGenericType_IsOption();

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
		 * The meta object literal for the '<em><b>Comment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__COMMENT = eINSTANCE.getElement_Comment();

		/**
		 * The meta object literal for the '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.CommentImpl <em>Comment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.CommentImpl
		 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.ScalaPackageImpl#getComment()
		 * @generated
		 */
		EClass COMMENT = eINSTANCE.getComment();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMENT__BODY = eINSTANCE.getComment_Body();

		/**
		 * The meta object literal for the '<em><b>Commented Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMENT__COMMENTED_ELEMENT = eINSTANCE
				.getComment_CommentedElement();

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
		 * The meta object literal for the '<em><b>Generic Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPED_ELEMENT__GENERIC_TYPE = eINSTANCE
				.getTypedElement_GenericType();

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
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFIER__ATTRIBUTES = eINSTANCE
				.getClassifier_Attributes();

		/**
		 * The meta object literal for the '<em><b>Methods</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFIER__METHODS = eINSTANCE.getClassifier_Methods();

		/**
		 * The meta object literal for the '<em><b>Super Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFIER__SUPER_CLASS = eINSTANCE
				.getClassifier_SuperClass();

		/**
		 * The meta object literal for the '<em><b>Is Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASSIFIER__IS_ABSTRACT = eINSTANCE
				.getClassifier_IsAbstract();

		/**
		 * The meta object literal for the '<em><b>Is Sealed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASSIFIER__IS_SEALED = eINSTANCE.getClassifier_IsSealed();

		/**
		 * The meta object literal for the '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Definition <em>Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Definition
		 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.ScalaPackageImpl#getDefinition()
		 * @generated
		 */
		EClass DEFINITION = eINSTANCE.getDefinition();

		/**
		 * The meta object literal for the '<em><b>Traits</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFINITION__TRAITS = eINSTANCE.getDefinition_Traits();

		/**
		 * The meta object literal for the '<em><b>Is Case</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFINITION__IS_CASE = eINSTANCE.getDefinition_IsCase();

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
		 * The meta object literal for the '<em><b>Companion Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__COMPANION_OBJECT = eINSTANCE
				.getClass_CompanionObject();

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
		 * The meta object literal for the '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.AttributeImpl
		 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.ScalaPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Is Final</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__IS_FINAL = eINSTANCE.getAttribute_IsFinal();

		/**
		 * The meta object literal for the '<em><b>Is Overriding</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__IS_OVERRIDING = eINSTANCE
				.getAttribute_IsOverriding();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__VISIBILITY = eINSTANCE.getAttribute_Visibility();

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
		 * The meta object literal for the '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.GenericTypeImpl <em>Generic Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.GenericTypeImpl
		 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.ScalaPackageImpl#getGenericType()
		 * @generated
		 */
		EClass GENERIC_TYPE = eINSTANCE.getGenericType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERIC_TYPE__TYPE = eINSTANCE.getGenericType_Type();

		/**
		 * The meta object literal for the '<em><b>Is Option</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERIC_TYPE__IS_OPTION = eINSTANCE
				.getGenericType_IsOption();

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