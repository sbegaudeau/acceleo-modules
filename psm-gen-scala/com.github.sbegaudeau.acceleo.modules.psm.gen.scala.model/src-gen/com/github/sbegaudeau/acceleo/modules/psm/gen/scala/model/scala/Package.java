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
 * A representation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Package#getFiles <em>Files</em>}</li>
 *   <li>{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Package#getSubPackages <em>Sub Packages</em>}</li>
 *   <li>{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Package#getSuperPackage <em>Super Package</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.ScalaPackage#getPackage()
 * @model
 * @generated
 */
public interface Package extends NamedElement, VisibilityScope {
	/**
	 * Returns the value of the '<em><b>Files</b></em>' containment reference list.
	 * The list contents are of type {@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.File}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Files</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Files</em>' containment reference list.
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.ScalaPackage#getPackage_Files()
	 * @model containment="true"
	 * @generated
	 */
	EList<File> getFiles();

	/**
	 * Returns the value of the '<em><b>Sub Packages</b></em>' containment reference list.
	 * The list contents are of type {@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Package}.
	 * It is bidirectional and its opposite is '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Package#getSuperPackage <em>Super Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Packages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Packages</em>' containment reference list.
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.ScalaPackage#getPackage_SubPackages()
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Package#getSuperPackage
	 * @model opposite="superPackage" containment="true"
	 * @generated
	 */
	EList<Package> getSubPackages();

	/**
	 * Returns the value of the '<em><b>Super Package</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Package#getSubPackages <em>Sub Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Package</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Package</em>' container reference.
	 * @see #setSuperPackage(Package)
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.ScalaPackage#getPackage_SuperPackage()
	 * @see com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Package#getSubPackages
	 * @model opposite="subPackages" transient="false"
	 * @generated
	 */
	Package getSuperPackage();

	/**
	 * Sets the value of the '{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Package#getSuperPackage <em>Super Package</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super Package</em>' container reference.
	 * @see #getSuperPackage()
	 * @generated
	 */
	void setSuperPackage(Package value);

} // Package
