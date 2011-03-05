/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Classifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Classifier#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Classifier#getMethods <em>Methods</em>}</li>
 *   <li>{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Classifier#getSuperClass <em>Super Class</em>}</li>
 *   <li>{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Classifier#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Classifier#isIsSealed <em>Is Sealed</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.ScalaPackage#getClassifier()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Classifier extends NamedElement, Type {
	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.ScalaPackage#getClassifier_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getAttributes();

	/**
	 * Returns the value of the '<em><b>Methods</b></em>' containment reference list.
	 * The list contents are of type {@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Method}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Methods</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Methods</em>' containment reference list.
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.ScalaPackage#getClassifier_Methods()
	 * @model containment="true"
	 * @generated
	 */
	EList<Method> getMethods();

	/**
	 * Returns the value of the '<em><b>Super Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Class</em>' reference.
	 * @see #setSuperClass(com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Class)
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.ScalaPackage#getClassifier_SuperClass()
	 * @model
	 * @generated
	 */
	com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Class getSuperClass();

	/**
	 * Sets the value of the '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Classifier#getSuperClass <em>Super Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super Class</em>' reference.
	 * @see #getSuperClass()
	 * @generated
	 */
	void setSuperClass(
			com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Class value);

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
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.ScalaPackage#getClassifier_IsAbstract()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isIsAbstract();

	/**
	 * Sets the value of the '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Classifier#isIsAbstract <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Abstract</em>' attribute.
	 * @see #isIsAbstract()
	 * @generated
	 */
	void setIsAbstract(boolean value);

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
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.ScalaPackage#getClassifier_IsSealed()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isIsSealed();

	/**
	 * Sets the value of the '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Classifier#isIsSealed <em>Is Sealed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Sealed</em>' attribute.
	 * @see #isIsSealed()
	 * @generated
	 */
	void setIsSealed(boolean value);

} // Classifier
