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

import com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.ExtendableClassifier;
import com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Method;
import com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.ScalaPackage;
import com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Trait;

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
 * An implementation of the model object '<em><b>Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.ObjectImpl#getOwnedComment <em>Owned Comment</em>}</li>
 *   <li>{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.ObjectImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.ObjectImpl#getMethods <em>Methods</em>}</li>
 *   <li>{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.ObjectImpl#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.ObjectImpl#getTraits <em>Traits</em>}</li>
 *   <li>{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.ObjectImpl#isIsCase <em>Is Case</em>}</li>
 *   <li>{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.ObjectImpl#getCompanionClass <em>Companion Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObjectImpl extends EObjectImpl implements
		com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Object {
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
	 * The cached value of the '{@link #getCompanionClass() <em>Companion Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompanionClass()
	 * @generated
	 * @ordered
	 */
	protected com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Class companionClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScalaPackage.Literals.OBJECT;
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
					ScalaPackage.OBJECT__OWNED_COMMENT, oldOwnedComment,
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
					ScalaPackage.OBJECT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Method> getMethods() {
		if (methods == null) {
			methods = new EObjectContainmentEList<Method>(Method.class, this,
					ScalaPackage.OBJECT__METHODS);
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
							ScalaPackage.OBJECT__SUPER_TYPE, oldSuperType,
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
					ScalaPackage.OBJECT__SUPER_TYPE, oldSuperType, superType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Trait> getTraits() {
		if (traits == null) {
			traits = new EObjectResolvingEList<Trait>(Trait.class, this,
					ScalaPackage.OBJECT__TRAITS);
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
					ScalaPackage.OBJECT__IS_CASE, oldIsCase, isCase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Class getCompanionClass() {
		if (companionClass != null && companionClass.eIsProxy()) {
			InternalEObject oldCompanionClass = (InternalEObject) companionClass;
			companionClass = (com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Class) eResolveProxy(oldCompanionClass);
			if (companionClass != oldCompanionClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ScalaPackage.OBJECT__COMPANION_CLASS,
							oldCompanionClass, companionClass));
			}
		}
		return companionClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Class basicGetCompanionClass() {
		return companionClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompanionClass(
			com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Class newCompanionClass,
			NotificationChain msgs) {
		com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Class oldCompanionClass = companionClass;
		companionClass = newCompanionClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, ScalaPackage.OBJECT__COMPANION_CLASS,
					oldCompanionClass, newCompanionClass);
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
	public void setCompanionClass(
			com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Class newCompanionClass) {
		if (newCompanionClass != companionClass) {
			NotificationChain msgs = null;
			if (companionClass != null)
				msgs = ((InternalEObject) companionClass)
						.eInverseRemove(
								this,
								ScalaPackage.CLASS__COMPANION_OBJECT,
								com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Class.class,
								msgs);
			if (newCompanionClass != null)
				msgs = ((InternalEObject) newCompanionClass)
						.eInverseAdd(
								this,
								ScalaPackage.CLASS__COMPANION_OBJECT,
								com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Class.class,
								msgs);
			msgs = basicSetCompanionClass(newCompanionClass, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ScalaPackage.OBJECT__COMPANION_CLASS, newCompanionClass,
					newCompanionClass));
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
		case ScalaPackage.OBJECT__COMPANION_CLASS:
			if (companionClass != null)
				msgs = ((InternalEObject) companionClass)
						.eInverseRemove(
								this,
								ScalaPackage.CLASS__COMPANION_OBJECT,
								com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Class.class,
								msgs);
			return basicSetCompanionClass(
					(com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Class) otherEnd,
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
		case ScalaPackage.OBJECT__METHODS:
			return ((InternalEList<?>) getMethods())
					.basicRemove(otherEnd, msgs);
		case ScalaPackage.OBJECT__COMPANION_CLASS:
			return basicSetCompanionClass(null, msgs);
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
		case ScalaPackage.OBJECT__OWNED_COMMENT:
			return getOwnedComment();
		case ScalaPackage.OBJECT__NAME:
			return getName();
		case ScalaPackage.OBJECT__METHODS:
			return getMethods();
		case ScalaPackage.OBJECT__SUPER_TYPE:
			if (resolve)
				return getSuperType();
			return basicGetSuperType();
		case ScalaPackage.OBJECT__TRAITS:
			return getTraits();
		case ScalaPackage.OBJECT__IS_CASE:
			return isIsCase();
		case ScalaPackage.OBJECT__COMPANION_CLASS:
			if (resolve)
				return getCompanionClass();
			return basicGetCompanionClass();
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
		case ScalaPackage.OBJECT__OWNED_COMMENT:
			setOwnedComment((String) newValue);
			return;
		case ScalaPackage.OBJECT__NAME:
			setName((String) newValue);
			return;
		case ScalaPackage.OBJECT__METHODS:
			getMethods().clear();
			getMethods().addAll((Collection<? extends Method>) newValue);
			return;
		case ScalaPackage.OBJECT__SUPER_TYPE:
			setSuperType((ExtendableClassifier) newValue);
			return;
		case ScalaPackage.OBJECT__TRAITS:
			getTraits().clear();
			getTraits().addAll((Collection<? extends Trait>) newValue);
			return;
		case ScalaPackage.OBJECT__IS_CASE:
			setIsCase((Boolean) newValue);
			return;
		case ScalaPackage.OBJECT__COMPANION_CLASS:
			setCompanionClass((com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Class) newValue);
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
		case ScalaPackage.OBJECT__OWNED_COMMENT:
			setOwnedComment(OWNED_COMMENT_EDEFAULT);
			return;
		case ScalaPackage.OBJECT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ScalaPackage.OBJECT__METHODS:
			getMethods().clear();
			return;
		case ScalaPackage.OBJECT__SUPER_TYPE:
			setSuperType((ExtendableClassifier) null);
			return;
		case ScalaPackage.OBJECT__TRAITS:
			getTraits().clear();
			return;
		case ScalaPackage.OBJECT__IS_CASE:
			setIsCase(IS_CASE_EDEFAULT);
			return;
		case ScalaPackage.OBJECT__COMPANION_CLASS:
			setCompanionClass((com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Class) null);
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
		case ScalaPackage.OBJECT__OWNED_COMMENT:
			return OWNED_COMMENT_EDEFAULT == null ? ownedComment != null
					: !OWNED_COMMENT_EDEFAULT.equals(ownedComment);
		case ScalaPackage.OBJECT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT
					.equals(name);
		case ScalaPackage.OBJECT__METHODS:
			return methods != null && !methods.isEmpty();
		case ScalaPackage.OBJECT__SUPER_TYPE:
			return superType != null;
		case ScalaPackage.OBJECT__TRAITS:
			return traits != null && !traits.isEmpty();
		case ScalaPackage.OBJECT__IS_CASE:
			return isCase != IS_CASE_EDEFAULT;
		case ScalaPackage.OBJECT__COMPANION_CLASS:
			return companionClass != null;
		}
		return super.eIsSet(featureID);
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
		result.append(')');
		return result.toString();
	}

} //ObjectImpl
