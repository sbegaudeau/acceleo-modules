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
package com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.tests;

import com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.ScalaFactory;
import com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Trait;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Trait</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TraitTest extends ExtendableClassifierTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TraitTest.class);
	}

	/**
	 * Constructs a new Trait test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraitTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Trait test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Trait getFixture() {
		return (Trait) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ScalaFactory.eINSTANCE.createTrait());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //TraitTest
