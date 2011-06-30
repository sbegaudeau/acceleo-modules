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
package com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl;

import com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Constructor;
import com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.ExtendableClassifier;
import com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Field;
import com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Method;
import com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.ScalaPackage;
import com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Trait;
import com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Type;
import com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.VisibilityScope;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.ClassImpl#getOwnedComment <em>Owned Comment</em>}</li>
 *   <li>{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.ClassImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.ClassImpl#getFields <em>Fields</em>}</li>
 *   <li>{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.ClassImpl#getMethods <em>Methods</em>}</li>
 *   <li>{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.ClassImpl#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.ClassImpl#getTraits <em>Traits</em>}</li>
 *   <li>{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.ClassImpl#isIsCase <em>Is Case</em>}</li>
 *   <li>{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.ClassImpl#isIsSealed <em>Is Sealed</em>}</li>
 *   <li>{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.ClassImpl#getConstructors <em>Constructors</em>}</li>
 *   <li>{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.ClassImpl#getCompanionObject <em>Companion Object</em>}</li>
 *   <li>{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.ClassImpl#isIsFinal <em>Is Final</em>}</li>
 *   <li>{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.ClassImpl#isIsAbstract <em>Is Abstract</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassImpl extends EObjectImpl implements
		com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Class {
	/**
	 * The default value of the '{@link #getOwnedComment() <em>Owned Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedComment()
	 * @generated
	 * @ordered
	 */
	protected static final String OWNED_COMMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOwnedComment() <em>Owned Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedComment()
	 * @generated
	 * @ordered
	 */
	protected String ownedComment = OWNED_COMMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = ""; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFields() <em>Fields</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFields()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> fields;

	/**
	 * The cached value of the '{@link #getMethods() <em>Methods</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethods()
	 * @generated
	 * @ordered
	 */
	protected EList<Method> methods;

	/**
	 * The cached value of the '{@link #getSuperType() <em>Super Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperType()
	 * @generated
	 * @ordered
	 */
	protected ExtendableClassifier superType;

	/**
	 * The cached value of the '{@link #getTraits() <em>Traits</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraits()
	 * @generated
	 * @ordered
	 */
	protected EList<Trait> traits;

	/**
	 * The default value of the '{@link #isIsCase() <em>Is Case</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsCase()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_CASE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsCase() <em>Is Case</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsCase()
	 * @generated
	 * @ordered
	 */
	protected boolean isCase = IS_CASE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsSealed() <em>Is Sealed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSealed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_SEALED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsSealed() <em>Is Sealed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSealed()
	 * @generated
	 * @ordered
	 */
	protected boolean isSealed = IS_SEALED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConstructors() <em>Constructors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstructors()
	 * @generated
	 * @ordered
	 */
	protected EList<Constructor> constructors;

	/**
	 * The cached value of the '{@link #getCompanionObject() <em>Companion Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompanionObject()
	 * @generated
	 * @ordered
	 */
	protected com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Object companionObject;

	/**
	 * The default value of the '{@link #isIsFinal() <em>Is Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsFinal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_FINAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsFinal() <em>Is Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsFinal()
	 * @generated
	 * @ordered
	 */
	protected boolean isFinal = IS_FINAL_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ABSTRACT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected boolean isAbstract = IS_ABSTRACT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScalaPackage.Literals.CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOwnedComment() {
		return ownedComment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedComment(String newOwnedComment) {
		String oldOwnedComment = ownedComment;
		ownedComment = newOwnedComment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ScalaPackage.CLASS__OWNED_COMMENT, oldOwnedComment,
					ownedComment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ScalaPackage.CLASS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Method> getMethods() {
		if (methods == null) {
			methods = new EObjectContainmentEList<Method>(Method.class, this,
					ScalaPackage.CLASS__METHODS);
		}
		return methods;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendableClassifier getSuperType() {
		if (superType != null && superType.eIsProxy()) {
			InternalEObject oldSuperType = (InternalEObject) superType;
			superType = (ExtendableClassifier) eResolveProxy(oldSuperType);
			if (superType != oldSuperType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ScalaPackage.CLASS__SUPER_TYPE, oldSuperType,
							superType));
			}
		}
		return superType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendableClassifier basicGetSuperType() {
		return superType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuperType(ExtendableClassifier newSuperType) {
		ExtendableClassifier oldSuperType = superType;
		superType = newSuperType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ScalaPackage.CLASS__SUPER_TYPE, oldSuperType, superType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Trait> getTraits() {
		if (traits == null) {
			traits = new EObjectResolvingEList<Trait>(Trait.class, this,
					ScalaPackage.CLASS__TRAITS);
		}
		return traits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsCase() {
		return isCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsCase(boolean newIsCase) {
		boolean oldIsCase = isCase;
		isCase = newIsCase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ScalaPackage.CLASS__IS_CASE, oldIsCase, isCase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsSealed() {
		return isSealed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsSealed(boolean newIsSealed) {
		boolean oldIsSealed = isSealed;
		isSealed = newIsSealed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ScalaPackage.CLASS__IS_SEALED, oldIsSealed, isSealed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getFields() {
		if (fields == null) {
			fields = new EObjectContainmentEList<Field>(Field.class, this,
					ScalaPackage.CLASS__FIELDS);
		}
		return fields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constructor> getConstructors() {
		if (constructors == null) {
			constructors = new EObjectContainmentEList<Constructor>(
					Constructor.class, this, ScalaPackage.CLASS__CONSTRUCTORS);
		}
		return constructors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Object getCompanionObject() {
		if (companionObject != null && companionObject.eIsProxy()) {
			InternalEObject oldCompanionObject = (InternalEObject) companionObject;
			companionObject = (com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Object) eResolveProxy(oldCompanionObject);
			if (companionObject != oldCompanionObject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ScalaPackage.CLASS__COMPANION_OBJECT,
							oldCompanionObject, companionObject));
			}
		}
		return companionObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Object basicGetCompanionObject() {
		return companionObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompanionObject(
			com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Object newCompanionObject,
			NotificationChain msgs) {
		com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Object oldCompanionObject = companionObject;
		companionObject = newCompanionObject;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, ScalaPackage.CLASS__COMPANION_OBJECT,
					oldCompanionObject, newCompanionObject);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompanionObject(
			com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Object newCompanionObject) {
		if (newCompanionObject != companionObject) {
			NotificationChain msgs = null;
			if (companionObject != null)
				msgs = ((InternalEObject) companionObject)
						.eInverseRemove(
								this,
								ScalaPackage.OBJECT__COMPANION_CLASS,
								com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Object.class,
								msgs);
			if (newCompanionObject != null)
				msgs = ((InternalEObject) newCompanionObject)
						.eInverseAdd(
								this,
								ScalaPackage.OBJECT__COMPANION_CLASS,
								com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Object.class,
								msgs);
			msgs = basicSetCompanionObject(newCompanionObject, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ScalaPackage.CLASS__COMPANION_OBJECT, newCompanionObject,
					newCompanionObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsFinal() {
		return isFinal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsFinal(boolean newIsFinal) {
		boolean oldIsFinal = isFinal;
		isFinal = newIsFinal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ScalaPackage.CLASS__IS_FINAL, oldIsFinal, isFinal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsAbstract() {
		return isAbstract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAbstract(boolean newIsAbstract) {
		boolean oldIsAbstract = isAbstract;
		isAbstract = newIsAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ScalaPackage.CLASS__IS_ABSTRACT, oldIsAbstract, isAbstract));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ScalaPackage.CLASS__COMPANION_OBJECT:
			if (companionObject != null)
				msgs = ((InternalEObject) companionObject)
						.eInverseRemove(
								this,
								ScalaPackage.OBJECT__COMPANION_CLASS,
								com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Object.class,
								msgs);
			return basicSetCompanionObject(
					(com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Object) otherEnd,
					msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ScalaPackage.CLASS__FIELDS:
			return ((InternalEList<?>) getFields()).basicRemove(otherEnd, msgs);
		case ScalaPackage.CLASS__METHODS:
			return ((InternalEList<?>) getMethods())
					.basicRemove(otherEnd, msgs);
		case ScalaPackage.CLASS__CONSTRUCTORS:
			return ((InternalEList<?>) getConstructors()).basicRemove(otherEnd,
					msgs);
		case ScalaPackage.CLASS__COMPANION_OBJECT:
			return basicSetCompanionObject(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ScalaPackage.CLASS__OWNED_COMMENT:
			return getOwnedComment();
		case ScalaPackage.CLASS__NAME:
			return getName();
		case ScalaPackage.CLASS__FIELDS:
			return getFields();
		case ScalaPackage.CLASS__METHODS:
			return getMethods();
		case ScalaPackage.CLASS__SUPER_TYPE:
			if (resolve)
				return getSuperType();
			return basicGetSuperType();
		case ScalaPackage.CLASS__TRAITS:
			return getTraits();
		case ScalaPackage.CLASS__IS_CASE:
			return isIsCase();
		case ScalaPackage.CLASS__IS_SEALED:
			return isIsSealed();
		case ScalaPackage.CLASS__CONSTRUCTORS:
			return getConstructors();
		case ScalaPackage.CLASS__COMPANION_OBJECT:
			if (resolve)
				return getCompanionObject();
			return basicGetCompanionObject();
		case ScalaPackage.CLASS__IS_FINAL:
			return isIsFinal();
		case ScalaPackage.CLASS__IS_ABSTRACT:
			return isIsAbstract();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ScalaPackage.CLASS__OWNED_COMMENT:
			setOwnedComment((String) newValue);
			return;
		case ScalaPackage.CLASS__NAME:
			setName((String) newValue);
			return;
		case ScalaPackage.CLASS__FIELDS:
			getFields().clear();
			getFields().addAll((Collection<? extends Field>) newValue);
			return;
		case ScalaPackage.CLASS__METHODS:
			getMethods().clear();
			getMethods().addAll((Collection<? extends Method>) newValue);
			return;
		case ScalaPackage.CLASS__SUPER_TYPE:
			setSuperType((ExtendableClassifier) newValue);
			return;
		case ScalaPackage.CLASS__TRAITS:
			getTraits().clear();
			getTraits().addAll((Collection<? extends Trait>) newValue);
			return;
		case ScalaPackage.CLASS__IS_CASE:
			setIsCase((Boolean) newValue);
			return;
		case ScalaPackage.CLASS__IS_SEALED:
			setIsSealed((Boolean) newValue);
			return;
		case ScalaPackage.CLASS__CONSTRUCTORS:
			getConstructors().clear();
			getConstructors().addAll(
					(Collection<? extends Constructor>) newValue);
			return;
		case ScalaPackage.CLASS__COMPANION_OBJECT:
			setCompanionObject((com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Object) newValue);
			return;
		case ScalaPackage.CLASS__IS_FINAL:
			setIsFinal((Boolean) newValue);
			return;
		case ScalaPackage.CLASS__IS_ABSTRACT:
			setIsAbstract((Boolean) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case ScalaPackage.CLASS__OWNED_COMMENT:
			setOwnedComment(OWNED_COMMENT_EDEFAULT);
			return;
		case ScalaPackage.CLASS__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ScalaPackage.CLASS__FIELDS:
			getFields().clear();
			return;
		case ScalaPackage.CLASS__METHODS:
			getMethods().clear();
			return;
		case ScalaPackage.CLASS__SUPER_TYPE:
			setSuperType((ExtendableClassifier) null);
			return;
		case ScalaPackage.CLASS__TRAITS:
			getTraits().clear();
			return;
		case ScalaPackage.CLASS__IS_CASE:
			setIsCase(IS_CASE_EDEFAULT);
			return;
		case ScalaPackage.CLASS__IS_SEALED:
			setIsSealed(IS_SEALED_EDEFAULT);
			return;
		case ScalaPackage.CLASS__CONSTRUCTORS:
			getConstructors().clear();
			return;
		case ScalaPackage.CLASS__COMPANION_OBJECT:
			setCompanionObject((com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Object) null);
			return;
		case ScalaPackage.CLASS__IS_FINAL:
			setIsFinal(IS_FINAL_EDEFAULT);
			return;
		case ScalaPackage.CLASS__IS_ABSTRACT:
			setIsAbstract(IS_ABSTRACT_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ScalaPackage.CLASS__OWNED_COMMENT:
			return OWNED_COMMENT_EDEFAULT == null ? ownedComment != null
					: !OWNED_COMMENT_EDEFAULT.equals(ownedComment);
		case ScalaPackage.CLASS__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT
					.equals(name);
		case ScalaPackage.CLASS__FIELDS:
			return fields != null && !fields.isEmpty();
		case ScalaPackage.CLASS__METHODS:
			return methods != null && !methods.isEmpty();
		case ScalaPackage.CLASS__SUPER_TYPE:
			return superType != null;
		case ScalaPackage.CLASS__TRAITS:
			return traits != null && !traits.isEmpty();
		case ScalaPackage.CLASS__IS_CASE:
			return isCase != IS_CASE_EDEFAULT;
		case ScalaPackage.CLASS__IS_SEALED:
			return isSealed != IS_SEALED_EDEFAULT;
		case ScalaPackage.CLASS__CONSTRUCTORS:
			return constructors != null && !constructors.isEmpty();
		case ScalaPackage.CLASS__COMPANION_OBJECT:
			return companionObject != null;
		case ScalaPackage.CLASS__IS_FINAL:
			return isFinal != IS_FINAL_EDEFAULT;
		case ScalaPackage.CLASS__IS_ABSTRACT:
			return isAbstract != IS_ABSTRACT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Type.class) {
			switch (derivedFeatureID) {
			default:
				return -1;
			}
		}
		if (baseClass == VisibilityScope.class) {
			switch (derivedFeatureID) {
			default:
				return -1;
			}
		}
		if (baseClass == ExtendableClassifier.class) {
			switch (derivedFeatureID) {
			case ScalaPackage.CLASS__IS_SEALED:
				return ScalaPackage.EXTENDABLE_CLASSIFIER__IS_SEALED;
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Type.class) {
			switch (baseFeatureID) {
			default:
				return -1;
			}
		}
		if (baseClass == VisibilityScope.class) {
			switch (baseFeatureID) {
			default:
				return -1;
			}
		}
		if (baseClass == ExtendableClassifier.class) {
			switch (baseFeatureID) {
			case ScalaPackage.EXTENDABLE_CLASSIFIER__IS_SEALED:
				return ScalaPackage.CLASS__IS_SEALED;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (ownedComment: "); //$NON-NLS-1$
		result.append(ownedComment);
		result.append(", name: "); //$NON-NLS-1$
		result.append(name);
		result.append(", isCase: "); //$NON-NLS-1$
		result.append(isCase);
		result.append(", isSealed: "); //$NON-NLS-1$
		result.append(isSealed);
		result.append(", isFinal: "); //$NON-NLS-1$
		result.append(isFinal);
		result.append(", isAbstract: "); //$NON-NLS-1$
		result.append(isAbstract);
		result.append(')');
		return result.toString();
	}

} //ClassImpl
