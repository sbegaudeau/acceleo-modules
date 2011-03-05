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

import com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Attribute;
import com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Comment;
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
 *   <li>{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.ObjectImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.ObjectImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.ObjectImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.ObjectImpl#getMethods <em>Methods</em>}</li>
 *   <li>{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.ObjectImpl#getSuperClass <em>Super Class</em>}</li>
 *   <li>{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.ObjectImpl#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.ObjectImpl#isIsSealed <em>Is Sealed</em>}</li>
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
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> attributes;

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
	 * The cached value of the '{@link #getSuperClass() <em>Super Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperClass()
	 * @generated
	 * @ordered
	 */
	protected com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Class superClass;

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
	public Comment getComment() {
		if (comment != null && comment.eIsProxy()) {
			InternalEObject oldComment = (InternalEObject) comment;
			comment = (Comment) eResolveProxy(oldComment);
			if (comment != oldComment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ScalaPackage.OBJECT__COMMENT, oldComment, comment));
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
					Notification.SET, ScalaPackage.OBJECT__COMMENT, oldComment,
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
					ScalaPackage.OBJECT__COMMENT, newComment, newComment));
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
	public EList<Attribute> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<Attribute>(
					Attribute.class, this, ScalaPackage.OBJECT__ATTRIBUTES);
		}
		return attributes;
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
	public com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Class getSuperClass() {
		if (superClass != null && superClass.eIsProxy()) {
			InternalEObject oldSuperClass = (InternalEObject) superClass;
			superClass = (com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Class) eResolveProxy(oldSuperClass);
			if (superClass != oldSuperClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ScalaPackage.OBJECT__SUPER_CLASS, oldSuperClass,
							superClass));
			}
		}
		return superClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Class basicGetSuperClass() {
		return superClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuperClass(
			com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Class newSuperClass) {
		com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Class oldSuperClass = superClass;
		superClass = newSuperClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ScalaPackage.OBJECT__SUPER_CLASS, oldSuperClass, superClass));
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
					ScalaPackage.OBJECT__IS_ABSTRACT, oldIsAbstract, isAbstract));
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
					ScalaPackage.OBJECT__IS_SEALED, oldIsSealed, isSealed));
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
		case ScalaPackage.OBJECT__COMMENT:
			if (comment != null)
				msgs = ((InternalEObject) comment).eInverseRemove(this,
						ScalaPackage.COMMENT__COMMENTED_ELEMENT, Comment.class,
						msgs);
			return basicSetComment((Comment) otherEnd, msgs);
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
		case ScalaPackage.OBJECT__COMMENT:
			return basicSetComment(null, msgs);
		case ScalaPackage.OBJECT__ATTRIBUTES:
			return ((InternalEList<?>) getAttributes()).basicRemove(otherEnd,
					msgs);
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
		case ScalaPackage.OBJECT__COMMENT:
			if (resolve)
				return getComment();
			return basicGetComment();
		case ScalaPackage.OBJECT__NAME:
			return getName();
		case ScalaPackage.OBJECT__ATTRIBUTES:
			return getAttributes();
		case ScalaPackage.OBJECT__METHODS:
			return getMethods();
		case ScalaPackage.OBJECT__SUPER_CLASS:
			if (resolve)
				return getSuperClass();
			return basicGetSuperClass();
		case ScalaPackage.OBJECT__IS_ABSTRACT:
			return isIsAbstract();
		case ScalaPackage.OBJECT__IS_SEALED:
			return isIsSealed();
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
		case ScalaPackage.OBJECT__COMMENT:
			setComment((Comment) newValue);
			return;
		case ScalaPackage.OBJECT__NAME:
			setName((String) newValue);
			return;
		case ScalaPackage.OBJECT__ATTRIBUTES:
			getAttributes().clear();
			getAttributes().addAll((Collection<? extends Attribute>) newValue);
			return;
		case ScalaPackage.OBJECT__METHODS:
			getMethods().clear();
			getMethods().addAll((Collection<? extends Method>) newValue);
			return;
		case ScalaPackage.OBJECT__SUPER_CLASS:
			setSuperClass((com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Class) newValue);
			return;
		case ScalaPackage.OBJECT__IS_ABSTRACT:
			setIsAbstract((Boolean) newValue);
			return;
		case ScalaPackage.OBJECT__IS_SEALED:
			setIsSealed((Boolean) newValue);
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
		case ScalaPackage.OBJECT__COMMENT:
			setComment((Comment) null);
			return;
		case ScalaPackage.OBJECT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ScalaPackage.OBJECT__ATTRIBUTES:
			getAttributes().clear();
			return;
		case ScalaPackage.OBJECT__METHODS:
			getMethods().clear();
			return;
		case ScalaPackage.OBJECT__SUPER_CLASS:
			setSuperClass((com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Class) null);
			return;
		case ScalaPackage.OBJECT__IS_ABSTRACT:
			setIsAbstract(IS_ABSTRACT_EDEFAULT);
			return;
		case ScalaPackage.OBJECT__IS_SEALED:
			setIsSealed(IS_SEALED_EDEFAULT);
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
		case ScalaPackage.OBJECT__COMMENT:
			return comment != null;
		case ScalaPackage.OBJECT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT
					.equals(name);
		case ScalaPackage.OBJECT__ATTRIBUTES:
			return attributes != null && !attributes.isEmpty();
		case ScalaPackage.OBJECT__METHODS:
			return methods != null && !methods.isEmpty();
		case ScalaPackage.OBJECT__SUPER_CLASS:
			return superClass != null;
		case ScalaPackage.OBJECT__IS_ABSTRACT:
			return isAbstract != IS_ABSTRACT_EDEFAULT;
		case ScalaPackage.OBJECT__IS_SEALED:
			return isSealed != IS_SEALED_EDEFAULT;
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
		result.append(" (name: "); //$NON-NLS-1$
		result.append(name);
		result.append(", isAbstract: "); //$NON-NLS-1$
		result.append(isAbstract);
		result.append(", isSealed: "); //$NON-NLS-1$
		result.append(isSealed);
		result.append(", isCase: "); //$NON-NLS-1$
		result.append(isCase);
		result.append(')');
		return result.toString();
	}

} //ObjectImpl
