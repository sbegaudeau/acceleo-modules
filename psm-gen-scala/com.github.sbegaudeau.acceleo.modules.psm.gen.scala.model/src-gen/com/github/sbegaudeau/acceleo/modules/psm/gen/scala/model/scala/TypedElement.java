/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Typed Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.TypedElement#getGenericType <em>Generic Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.ScalaPackage#getTypedElement()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface TypedElement extends Element {
	/**
	 * Returns the value of the '<em><b>Generic Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Type</em>' containment reference.
	 * @see #setGenericType(GenericType)
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.ScalaPackage#getTypedElement_GenericType()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GenericType getGenericType();

	/**
	 * Sets the value of the '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.TypedElement#getGenericType <em>Generic Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generic Type</em>' containment reference.
	 * @see #getGenericType()
	 * @generated
	 */
	void setGenericType(GenericType value);

} // TypedElement
