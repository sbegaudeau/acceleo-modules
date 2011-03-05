/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Attribute#isIsFinal <em>Is Final</em>}</li>
 *   <li>{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Attribute#isIsOverriding <em>Is Overriding</em>}</li>
 *   <li>{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Attribute#getVisibility <em>Visibility</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.ScalaPackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends NamedElement, TypedElement {
	/**
	 * Returns the value of the '<em><b>Is Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Final</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Final</em>' attribute.
	 * @see #setIsFinal(boolean)
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.ScalaPackage#getAttribute_IsFinal()
	 * @model
	 * @generated
	 */
	boolean isIsFinal();

	/**
	 * Sets the value of the '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Attribute#isIsFinal <em>Is Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Final</em>' attribute.
	 * @see #isIsFinal()
	 * @generated
	 */
	void setIsFinal(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Overriding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Overriding</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Overriding</em>' attribute.
	 * @see #setIsOverriding(boolean)
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.ScalaPackage#getAttribute_IsOverriding()
	 * @model
	 * @generated
	 */
	boolean isIsOverriding();

	/**
	 * Sets the value of the '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Attribute#isIsOverriding <em>Is Overriding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Overriding</em>' attribute.
	 * @see #isIsOverriding()
	 * @generated
	 */
	void setIsOverriding(boolean value);

	/**
	 * Returns the value of the '<em><b>Visibility</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visibility</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visibility</em>' containment reference.
	 * @see #setVisibility(Visibility)
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.ScalaPackage#getAttribute_Visibility()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Visibility getVisibility();

	/**
	 * Sets the value of the '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Attribute#getVisibility <em>Visibility</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility</em>' containment reference.
	 * @see #getVisibility()
	 * @generated
	 */
	void setVisibility(Visibility value);

} // Attribute
