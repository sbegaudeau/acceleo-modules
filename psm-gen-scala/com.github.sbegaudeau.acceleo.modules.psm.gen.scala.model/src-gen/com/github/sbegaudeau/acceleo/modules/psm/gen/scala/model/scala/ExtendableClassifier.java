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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extendable Classifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.ExtendableClassifier#isIsSealed <em>Is Sealed</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.ScalaPackage#getExtendableClassifier()
 * @model
 * @generated
 */
public interface ExtendableClassifier extends Classifier {
	/**
	 * Returns the value of the '<em><b>Is Sealed</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Sealed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Sealed</em>' attribute.
	 * @see #setIsSealed(boolean)
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.ScalaPackage#getExtendableClassifier_IsSealed()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isIsSealed();

	/**
	 * Sets the value of the '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.ExtendableClassifier#isIsSealed <em>Is Sealed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Sealed</em>' attribute.
	 * @see #isIsSealed()
	 * @generated
	 */
	void setIsSealed(boolean value);

} // ExtendableClassifier
