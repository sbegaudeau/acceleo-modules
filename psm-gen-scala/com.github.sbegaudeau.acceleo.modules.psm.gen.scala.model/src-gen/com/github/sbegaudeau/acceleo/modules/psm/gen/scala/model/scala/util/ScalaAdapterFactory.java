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
package com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.util;

import com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.CaseClassifier;
import com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Classifier;
import com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Comment;
import com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Constructor;
import com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Element;
import com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.ExtendableClassifier;
import com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Field;
import com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.File;
import com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.GenericType;
import com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Method;
import com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.MethodSignature;
import com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Model;
import com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.NamedElement;
import com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Parameter;
import com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.ScalaPackage;
import com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Trait;
import com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Type;
import com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.TypedElement;
import com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Visibility;
import com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.VisibilityScope;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.ScalaPackage
 * @generated
 */
public class ScalaAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ScalaPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScalaAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ScalaPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScalaSwitch<Adapter> modelSwitch = new ScalaSwitch<Adapter>() {
		@Override
		public Adapter caseElement(Element object) {
			return createElementAdapter();
		}

		@Override
		public Adapter caseComment(Comment object) {
			return createCommentAdapter();
		}

		@Override
		public Adapter caseNamedElement(NamedElement object) {
			return createNamedElementAdapter();
		}

		@Override
		public Adapter caseTypedElement(TypedElement object) {
			return createTypedElementAdapter();
		}

		@Override
		public Adapter caseClassifier(Classifier object) {
			return createClassifierAdapter();
		}

		@Override
		public Adapter caseCaseClassifier(CaseClassifier object) {
			return createCaseClassifierAdapter();
		}

		@Override
		public Adapter caseExtendableClassifier(ExtendableClassifier object) {
			return createExtendableClassifierAdapter();
		}

		@Override
		public Adapter caseClass(
				com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Class object) {
			return createClassAdapter();
		}

		@Override
		public Adapter caseObject(
				com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Object object) {
			return createObjectAdapter();
		}

		@Override
		public Adapter caseTrait(Trait object) {
			return createTraitAdapter();
		}

		@Override
		public Adapter caseField(Field object) {
			return createFieldAdapter();
		}

		@Override
		public Adapter caseConstructor(Constructor object) {
			return createConstructorAdapter();
		}

		@Override
		public Adapter caseMethod(Method object) {
			return createMethodAdapter();
		}

		@Override
		public Adapter caseMethodSignature(MethodSignature object) {
			return createMethodSignatureAdapter();
		}

		@Override
		public Adapter caseModel(Model object) {
			return createModelAdapter();
		}

		@Override
		public Adapter caseParameter(Parameter object) {
			return createParameterAdapter();
		}

		@Override
		public Adapter casePackage(
				com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Package object) {
			return createPackageAdapter();
		}

		@Override
		public Adapter caseFile(File object) {
			return createFileAdapter();
		}

		@Override
		public Adapter caseType(Type object) {
			return createTypeAdapter();
		}

		@Override
		public Adapter caseGenericType(GenericType object) {
			return createGenericTypeAdapter();
		}

		@Override
		public Adapter caseVisibility(Visibility object) {
			return createVisibilityAdapter();
		}

		@Override
		public Adapter caseVisibilityScope(VisibilityScope object) {
			return createVisibilityScopeAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Comment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Comment
	 * @generated
	 */
	public Adapter createCommentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.TypedElement <em>Typed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.TypedElement
	 * @generated
	 */
	public Adapter createTypedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Classifier <em>Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Classifier
	 * @generated
	 */
	public Adapter createClassifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.CaseClassifier <em>Case Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.CaseClassifier
	 * @generated
	 */
	public Adapter createCaseClassifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.ExtendableClassifier <em>Extendable Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.ExtendableClassifier
	 * @generated
	 */
	public Adapter createExtendableClassifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Class
	 * @generated
	 */
	public Adapter createClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Object <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Object
	 * @generated
	 */
	public Adapter createObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Trait <em>Trait</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Trait
	 * @generated
	 */
	public Adapter createTraitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Field
	 * @generated
	 */
	public Adapter createFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Constructor <em>Constructor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Constructor
	 * @generated
	 */
	public Adapter createConstructorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Method <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Method
	 * @generated
	 */
	public Adapter createMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.MethodSignature <em>Method Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.MethodSignature
	 * @generated
	 */
	public Adapter createMethodSignatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Model
	 * @generated
	 */
	public Adapter createModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Parameter
	 * @generated
	 */
	public Adapter createParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Package
	 * @generated
	 */
	public Adapter createPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.File <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.File
	 * @generated
	 */
	public Adapter createFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Type
	 * @generated
	 */
	public Adapter createTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.GenericType <em>Generic Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.GenericType
	 * @generated
	 */
	public Adapter createGenericTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Visibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Visibility
	 * @generated
	 */
	public Adapter createVisibilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.VisibilityScope <em>Visibility Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.VisibilityScope
	 * @generated
	 */
	public Adapter createVisibilityScopeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ScalaAdapterFactory
