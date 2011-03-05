/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Class#getCompanionObject <em>Companion Object</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.ScalaPackage#getClass_()
 * @model
 * @generated
 */
public interface Class extends Definition {
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

} // Class
