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

import com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Comment;
import com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.ExtendableClassifier;
import com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Method;
import com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.ScalaPackage;
import com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Trait;
import com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Type;

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
 * An implementation of the model object '<em><b>Trait</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.TraitImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.TraitImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.TraitImpl#getMethods <em>Methods</em>}</li>
 *   <li>{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.TraitImpl#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.TraitImpl#getTraits <em>Traits</em>}</li>
 *   <li>{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.TraitImpl#isIsSealed <em>Is Sealed</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TraitImpl extends EObjectImpl implements Trait {
	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected Comment comment;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TraitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScalaPackage.Literals.TRAIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comment getComment() {
		if (comment != null && comment.eIsProxy()) {
			InternalEObject oldComment = (InternalEObject) comment;
			comment = (Comment) eResolveProxy(oldComment);
			if (comment != oldComment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ScalaPackage.TRAIT__COMMENT, oldComment, comment));
			}
		}
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comment basicGetComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComment(Comment newComment,
			NotificationChain msgs) {
		Comment oldComment = comment;
		comment = newComment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, ScalaPackage.TRAIT__COMMENT, oldComment,
					newComment);
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
	public void setComment(Comment newComment) {
		if (newComment != comment) {
			NotificationChain msgs = null;
			if (comment != null)
				msgs = ((InternalEObject) comment).eInverseRemove(this,
						ScalaPackage.COMMENT__COMMENTED_ELEMENT, Comment.class,
						msgs);
			if (newComment != null)
				msgs = ((InternalEObject) newComment).eInverseAdd(this,
						ScalaPackage.COMMENT__COMMENTED_ELEMENT, Comment.class,
						msgs);
			msgs = basicSetComment(newComment, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ScalaPackage.TRAIT__COMMENT, newComment, newComment));
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
					ScalaPackage.TRAIT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Method> getMethods() {
		if (methods == null) {
			methods = new EObjectContainmentEList<Method>(Method.class, this,
					ScalaPackage.TRAIT__METHODS);
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
							ScalaPackage.TRAIT__SUPER_TYPE, oldSuperType,
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
					ScalaPackage.TRAIT__SUPER_TYPE, oldSuperType, superType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Trait> getTraits() {
		if (traits == null) {
			traits = new EObjectResolvingEList<Trait>(Trait.class, this,
					ScalaPackage.TRAIT__TRAITS);
		}
		return traits;
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
					ScalaPackage.TRAIT__IS_SEALED, oldIsSealed, isSealed));
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
		case ScalaPackage.TRAIT__COMMENT:
			if (comment != null)
				msgs = ((InternalEObject) comment).eInverseRemove(this,
						ScalaPackage.COMMENT__COMMENTED_ELEMENT, Comment.class,
						msgs);
			return basicSetComment((Comment) otherEnd, msgs);
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
		case ScalaPackage.TRAIT__COMMENT:
			return basicSetComment(null, msgs);
		case ScalaPackage.TRAIT__METHODS:
			return ((InternalEList<?>) getMethods())
					.basicRemove(otherEnd, msgs);
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
		case ScalaPackage.TRAIT__COMMENT:
			if (resolve)
				return getComment();
			return basicGetComment();
		case ScalaPackage.TRAIT__NAME:
			return getName();
		case ScalaPackage.TRAIT__METHODS:
			return getMethods();
		case ScalaPackage.TRAIT__SUPER_TYPE:
			if (resolve)
				return getSuperType();
			return basicGetSuperType();
		case ScalaPackage.TRAIT__TRAITS:
			return getTraits();
		case ScalaPackage.TRAIT__IS_SEALED:
			return isIsSealed();
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
		case ScalaPackage.TRAIT__COMMENT:
			setComment((Comment) newValue);
			return;
		case ScalaPackage.TRAIT__NAME:
			setName((String) newValue);
			return;
		case ScalaPackage.TRAIT__METHODS:
			getMethods().clear();
			getMethods().addAll((Collection<? extends Method>) newValue);
			return;
		case ScalaPackage.TRAIT__SUPER_TYPE:
			setSuperType((ExtendableClassifier) newValue);
			return;
		case ScalaPackage.TRAIT__TRAITS:
			getTraits().clear();
			getTraits().addAll((Collection<? extends Trait>) newValue);
			return;
		case ScalaPackage.TRAIT__IS_SEALED:
			setIsSealed((Boolean) newValue);
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
		case ScalaPackage.TRAIT__COMMENT:
			setComment((Comment) null);
			return;
		case ScalaPackage.TRAIT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ScalaPackage.TRAIT__METHODS:
			getMethods().clear();
			return;
		case ScalaPackage.TRAIT__SUPER_TYPE:
			setSuperType((ExtendableClassifier) null);
			return;
		case ScalaPackage.TRAIT__TRAITS:
			getTraits().clear();
			return;
		case ScalaPackage.TRAIT__IS_SEALED:
			setIsSealed(IS_SEALED_EDEFAULT);
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
		case ScalaPackage.TRAIT__COMMENT:
			return comment != null;
		case ScalaPackage.TRAIT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT
					.equals(name);
		case ScalaPackage.TRAIT__METHODS:
			return methods != null && !methods.isEmpty();
		case ScalaPackage.TRAIT__SUPER_TYPE:
			return superType != null;
		case ScalaPackage.TRAIT__TRAITS:
			return traits != null && !traits.isEmpty();
		case ScalaPackage.TRAIT__IS_SEALED:
			return isSealed != IS_SEALED_EDEFAULT;
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
		if (baseClass == ExtendableClassifier.class) {
			switch (derivedFeatureID) {
			case ScalaPackage.TRAIT__IS_SEALED:
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
		if (baseClass == ExtendableClassifier.class) {
			switch (baseFeatureID) {
			case ScalaPackage.EXTENDABLE_CLASSIFIER__IS_SEALED:
				return ScalaPackage.TRAIT__IS_SEALED;
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
		result.append(" (name: "); //$NON-NLS-1$
		result.append(name);
		result.append(", isSealed: "); //$NON-NLS-1$
		result.append(isSealed);
		result.append(')');
		return result.toString();
	}

} //TraitImpl
