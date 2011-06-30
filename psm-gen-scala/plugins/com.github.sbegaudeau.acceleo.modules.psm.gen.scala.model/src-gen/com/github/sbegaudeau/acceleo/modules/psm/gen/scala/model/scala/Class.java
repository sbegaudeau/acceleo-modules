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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Class#getConstructors <em>Constructors</em>}</li>
 *   <li>{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Class#getCompanionObject <em>Companion Object</em>}</li>
 *   <li>{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Class#isIsFinal <em>Is Final</em>}</li>
 *   <li>{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Class#isIsAbstract <em>Is Abstract</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.ScalaPackage#getClass_()
 * @model
 * @generated
 */
public interface Class extends CaseClassifier, ExtendableClassifier {
	/**
	 * Returns the value of the '<em><b>Constructors</b></em>' containment reference list.
	 * The list contents are of type {@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Constructor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constructors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constructors</em>' containment reference list.
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.ScalaPackage#getClass_Constructors()
	 * @model containment="true"
	 * @generated
	 */
	EList<Constructor> getConstructors();

	/**
	 * Returns the value of the '<em><b>Companion Object</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Object#getCompanionClass <em>Companion Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Companion Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Companion Object</em>' reference.
	 * @see #setCompanionObject(com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Object)
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.ScalaPackage#getClass_CompanionObject()
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Object#getCompanionClass
	 * @model opposite="companionClass"
	 * @generated
	 */
	com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Object getCompanionObject();

	/**
	 * Sets the value of the '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Class#getCompanionObject <em>Companion Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Companion Object</em>' reference.
	 * @see #getCompanionObject()
	 * @generated
	 */
	void setCompanionObject(
			com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Object value);

	/**
	 * Returns the value of the '<em><b>Is Final</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Final</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Final</em>' attribute.
	 * @see #setIsFinal(boolean)
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.ScalaPackage#getClass_IsFinal()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isIsFinal();

	/**
	 * Sets the value of the '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Class#isIsFinal <em>Is Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Final</em>' attribute.
	 * @see #isIsFinal()
	 * @generated
	 */
	void setIsFinal(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Abstract</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Abstract</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Abstract</em>' attribute.
	 * @see #setIsAbstract(boolean)
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.ScalaPackage#getClass_IsAbstract()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isIsAbstract();

	/**
	 * Sets the value of the '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Class#isIsAbstract <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Abstract</em>' attribute.
	 * @see #isIsAbstract()
	 * @generated
	 */
	void setIsAbstract(boolean value);

} // Class
