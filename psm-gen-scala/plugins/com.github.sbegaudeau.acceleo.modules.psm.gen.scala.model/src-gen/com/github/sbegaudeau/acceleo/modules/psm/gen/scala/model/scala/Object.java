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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Object#getCompanionClass <em>Companion Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.ScalaPackage#getObject()
 * @model
 * @generated
 */
public interface Object extends CaseClassifier {
	/**
	 * Returns the value of the '<em><b>Companion Class</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Class#getCompanionObject <em>Companion Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Companion Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Companion Class</em>' reference.
	 * @see #setCompanionClass(com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Class)
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.ScalaPackage#getObject_CompanionClass()
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Class#getCompanionObject
	 * @model opposite="companionObject"
	 * @generated
	 */
	com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Class getCompanionClass();

	/**
	 * Sets the value of the '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Object#getCompanionClass <em>Companion Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Companion Class</em>' reference.
	 * @see #getCompanionClass()
	 * @generated
	 */
	void setCompanionClass(
			com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Class value);

} // Object
