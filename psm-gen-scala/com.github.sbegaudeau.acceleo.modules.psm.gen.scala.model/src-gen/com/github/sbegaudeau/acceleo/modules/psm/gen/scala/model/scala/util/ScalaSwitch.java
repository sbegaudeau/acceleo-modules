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
import com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Constructor;
import com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Element;
import com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.ExtendableClassifier;
import com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Field;
import com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.File;
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

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.ScalaPackage
 * @generated
 */
public class ScalaSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ScalaPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScalaSwitch() {
		if (modelPackage == null) {
			modelPackage = ScalaPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		} else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return eSuperTypes.isEmpty() ? defaultCase(theEObject) : doSwitch(
					eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case ScalaPackage.ELEMENT: {
			Element element = (Element) theEObject;
			T result = caseElement(element);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ScalaPackage.NAMED_ELEMENT: {
			NamedElement namedElement = (NamedElement) theEObject;
			T result = caseNamedElement(namedElement);
			if (result == null)
				result = caseElement(namedElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ScalaPackage.TYPED_ELEMENT: {
			TypedElement typedElement = (TypedElement) theEObject;
			T result = caseTypedElement(typedElement);
			if (result == null)
				result = caseElement(typedElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ScalaPackage.CLASSIFIER: {
			Classifier classifier = (Classifier) theEObject;
			T result = caseClassifier(classifier);
			if (result == null)
				result = caseType(classifier);
			if (result == null)
				result = caseNamedElement(classifier);
			if (result == null)
				result = caseElement(classifier);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ScalaPackage.CASE_CLASSIFIER: {
			CaseClassifier caseClassifier = (CaseClassifier) theEObject;
			T result = caseCaseClassifier(caseClassifier);
			if (result == null)
				result = caseClassifier(caseClassifier);
			if (result == null)
				result = caseVisibilityScope(caseClassifier);
			if (result == null)
				result = caseType(caseClassifier);
			if (result == null)
				result = caseNamedElement(caseClassifier);
			if (result == null)
				result = caseElement(caseClassifier);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ScalaPackage.EXTENDABLE_CLASSIFIER: {
			ExtendableClassifier extendableClassifier = (ExtendableClassifier) theEObject;
			T result = caseExtendableClassifier(extendableClassifier);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ScalaPackage.CLASS: {
			com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Class class_ = (com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Class) theEObject;
			T result = caseClass(class_);
			if (result == null)
				result = caseCaseClassifier(class_);
			if (result == null)
				result = caseExtendableClassifier(class_);
			if (result == null)
				result = caseClassifier(class_);
			if (result == null)
				result = caseVisibilityScope(class_);
			if (result == null)
				result = caseType(class_);
			if (result == null)
				result = caseNamedElement(class_);
			if (result == null)
				result = caseElement(class_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ScalaPackage.OBJECT: {
			com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Object object = (com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Object) theEObject;
			T result = caseObject(object);
			if (result == null)
				result = caseCaseClassifier(object);
			if (result == null)
				result = caseClassifier(object);
			if (result == null)
				result = caseVisibilityScope(object);
			if (result == null)
				result = caseType(object);
			if (result == null)
				result = caseNamedElement(object);
			if (result == null)
				result = caseElement(object);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ScalaPackage.TRAIT: {
			Trait trait = (Trait) theEObject;
			T result = caseTrait(trait);
			if (result == null)
				result = caseClassifier(trait);
			if (result == null)
				result = caseExtendableClassifier(trait);
			if (result == null)
				result = caseType(trait);
			if (result == null)
				result = caseNamedElement(trait);
			if (result == null)
				result = caseElement(trait);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ScalaPackage.FIELD: {
			Field field = (Field) theEObject;
			T result = caseField(field);
			if (result == null)
				result = caseNamedElement(field);
			if (result == null)
				result = caseTypedElement(field);
			if (result == null)
				result = caseElement(field);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ScalaPackage.CONSTRUCTOR: {
			Constructor constructor = (Constructor) theEObject;
			T result = caseConstructor(constructor);
			if (result == null)
				result = caseElement(constructor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ScalaPackage.METHOD: {
			Method method = (Method) theEObject;
			T result = caseMethod(method);
			if (result == null)
				result = caseNamedElement(method);
			if (result == null)
				result = caseElement(method);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ScalaPackage.METHOD_SIGNATURE: {
			MethodSignature methodSignature = (MethodSignature) theEObject;
			T result = caseMethodSignature(methodSignature);
			if (result == null)
				result = caseTypedElement(methodSignature);
			if (result == null)
				result = caseType(methodSignature);
			if (result == null)
				result = caseNamedElement(methodSignature);
			if (result == null)
				result = caseElement(methodSignature);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ScalaPackage.MODEL: {
			Model model = (Model) theEObject;
			T result = caseModel(model);
			if (result == null)
				result = caseNamedElement(model);
			if (result == null)
				result = caseElement(model);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ScalaPackage.PARAMETER: {
			Parameter parameter = (Parameter) theEObject;
			T result = caseParameter(parameter);
			if (result == null)
				result = caseNamedElement(parameter);
			if (result == null)
				result = caseTypedElement(parameter);
			if (result == null)
				result = caseElement(parameter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ScalaPackage.PACKAGE: {
			com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Package package_ = (com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Package) theEObject;
			T result = casePackage(package_);
			if (result == null)
				result = caseNamedElement(package_);
			if (result == null)
				result = caseVisibilityScope(package_);
			if (result == null)
				result = caseElement(package_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ScalaPackage.FILE: {
			File file = (File) theEObject;
			T result = caseFile(file);
			if (result == null)
				result = caseNamedElement(file);
			if (result == null)
				result = caseElement(file);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ScalaPackage.TYPE: {
			Type type = (Type) theEObject;
			T result = caseType(type);
			if (result == null)
				result = caseNamedElement(type);
			if (result == null)
				result = caseElement(type);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ScalaPackage.VISIBILITY: {
			Visibility visibility = (Visibility) theEObject;
			T result = caseVisibility(visibility);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ScalaPackage.VISIBILITY_SCOPE: {
			VisibilityScope visibilityScope = (VisibilityScope) theEObject;
			T result = caseVisibilityScope(visibilityScope);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Typed Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Typed Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypedElement(TypedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Classifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassifier(Classifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Case Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Case Classifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCaseClassifier(CaseClassifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extendable Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extendable Classifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtendableClassifier(ExtendableClassifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClass(
			com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Class object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObject(
			com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Object object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trait</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trait</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrait(Trait object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseField(Field object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constructor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constructor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstructor(Constructor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethod(Method object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Signature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Signature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodSignature(MethodSignature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModel(Model object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameter(Parameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackage(
			com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Package object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFile(File object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseType(Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Visibility</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Visibility</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVisibility(Visibility object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Visibility Scope</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Visibility Scope</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVisibilityScope(VisibilityScope object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //ScalaSwitch
