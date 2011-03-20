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

import com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Field;
import com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.ScalaPackage;
import com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Type;
import com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.TypedElement;
import com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Visibility;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.FieldImpl#getOwnedComment <em>Owned Comment</em>}</li>
 *   <li>{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.FieldImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.FieldImpl#getType <em>Type</em>}</li>
 *   <li>{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.FieldImpl#isIsOption <em>Is Option</em>}</li>
 *   <li>{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.FieldImpl#isIsConstructorProperty <em>Is Constructor Property</em>}</li>
 *   <li>{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.FieldImpl#isIsFinal <em>Is Final</em>}</li>
 *   <li>{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.FieldImpl#isIsOverriding <em>Is Overriding</em>}</li>
 *   <li>{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.FieldImpl#getVisibility <em>Visibility</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FieldImpl extends EObjectImpl implements Field {
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
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Type type;

	/**
	 * The default value of the '{@link #isIsOption() <em>Is Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsOption()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_OPTION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsOption() <em>Is Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsOption()
	 * @generated
	 * @ordered
	 */
	protected boolean isOption = IS_OPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsConstructorProperty() <em>Is Constructor Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsConstructorProperty()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_CONSTRUCTOR_PROPERTY_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isIsConstructorProperty() <em>Is Constructor Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsConstructorProperty()
	 * @generated
	 * @ordered
	 */
	protected boolean isConstructorProperty = IS_CONSTRUCTOR_PROPERTY_EDEFAULT;

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
	 * The default value of the '{@link #isIsOverriding() <em>Is Overriding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsOverriding()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_OVERRIDING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsOverriding() <em>Is Overriding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsOverriding()
	 * @generated
	 * @ordered
	 */
	protected boolean isOverriding = IS_OVERRIDING_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVisibility() <em>Visibility</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected Visibility visibility;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FieldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScalaPackage.Literals.FIELD;
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
					ScalaPackage.FIELD__OWNED_COMMENT, oldOwnedComment,
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
					ScalaPackage.FIELD__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject) type;
			type = (Type) eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ScalaPackage.FIELD__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Type newType) {
		Type oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ScalaPackage.FIELD__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsOption() {
		return isOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsOption(boolean newIsOption) {
		boolean oldIsOption = isOption;
		isOption = newIsOption;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ScalaPackage.FIELD__IS_OPTION, oldIsOption, isOption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsConstructorProperty() {
		return isConstructorProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsConstructorProperty(boolean newIsConstructorProperty) {
		boolean oldIsConstructorProperty = isConstructorProperty;
		isConstructorProperty = newIsConstructorProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ScalaPackage.FIELD__IS_CONSTRUCTOR_PROPERTY,
					oldIsConstructorProperty, isConstructorProperty));
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
					ScalaPackage.FIELD__IS_FINAL, oldIsFinal, isFinal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsOverriding() {
		return isOverriding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsOverriding(boolean newIsOverriding) {
		boolean oldIsOverriding = isOverriding;
		isOverriding = newIsOverriding;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ScalaPackage.FIELD__IS_OVERRIDING, oldIsOverriding,
					isOverriding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Visibility getVisibility() {
		return visibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVisibility(Visibility newVisibility,
			NotificationChain msgs) {
		Visibility oldVisibility = visibility;
		visibility = newVisibility;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, ScalaPackage.FIELD__VISIBILITY,
					oldVisibility, newVisibility);
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
	public void setVisibility(Visibility newVisibility) {
		if (newVisibility != visibility) {
			NotificationChain msgs = null;
			if (visibility != null)
				msgs = ((InternalEObject) visibility)
						.eInverseRemove(this, EOPPOSITE_FEATURE_BASE
								- ScalaPackage.FIELD__VISIBILITY, null, msgs);
			if (newVisibility != null)
				msgs = ((InternalEObject) newVisibility)
						.eInverseAdd(this, EOPPOSITE_FEATURE_BASE
								- ScalaPackage.FIELD__VISIBILITY, null, msgs);
			msgs = basicSetVisibility(newVisibility, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ScalaPackage.FIELD__VISIBILITY, newVisibility,
					newVisibility));
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
		case ScalaPackage.FIELD__VISIBILITY:
			return basicSetVisibility(null, msgs);
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
		case ScalaPackage.FIELD__OWNED_COMMENT:
			return getOwnedComment();
		case ScalaPackage.FIELD__NAME:
			return getName();
		case ScalaPackage.FIELD__TYPE:
			if (resolve)
				return getType();
			return basicGetType();
		case ScalaPackage.FIELD__IS_OPTION:
			return isIsOption();
		case ScalaPackage.FIELD__IS_CONSTRUCTOR_PROPERTY:
			return isIsConstructorProperty();
		case ScalaPackage.FIELD__IS_FINAL:
			return isIsFinal();
		case ScalaPackage.FIELD__IS_OVERRIDING:
			return isIsOverriding();
		case ScalaPackage.FIELD__VISIBILITY:
			return getVisibility();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ScalaPackage.FIELD__OWNED_COMMENT:
			setOwnedComment((String) newValue);
			return;
		case ScalaPackage.FIELD__NAME:
			setName((String) newValue);
			return;
		case ScalaPackage.FIELD__TYPE:
			setType((Type) newValue);
			return;
		case ScalaPackage.FIELD__IS_OPTION:
			setIsOption((Boolean) newValue);
			return;
		case ScalaPackage.FIELD__IS_CONSTRUCTOR_PROPERTY:
			setIsConstructorProperty((Boolean) newValue);
			return;
		case ScalaPackage.FIELD__IS_FINAL:
			setIsFinal((Boolean) newValue);
			return;
		case ScalaPackage.FIELD__IS_OVERRIDING:
			setIsOverriding((Boolean) newValue);
			return;
		case ScalaPackage.FIELD__VISIBILITY:
			setVisibility((Visibility) newValue);
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
		case ScalaPackage.FIELD__OWNED_COMMENT:
			setOwnedComment(OWNED_COMMENT_EDEFAULT);
			return;
		case ScalaPackage.FIELD__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ScalaPackage.FIELD__TYPE:
			setType((Type) null);
			return;
		case ScalaPackage.FIELD__IS_OPTION:
			setIsOption(IS_OPTION_EDEFAULT);
			return;
		case ScalaPackage.FIELD__IS_CONSTRUCTOR_PROPERTY:
			setIsConstructorProperty(IS_CONSTRUCTOR_PROPERTY_EDEFAULT);
			return;
		case ScalaPackage.FIELD__IS_FINAL:
			setIsFinal(IS_FINAL_EDEFAULT);
			return;
		case ScalaPackage.FIELD__IS_OVERRIDING:
			setIsOverriding(IS_OVERRIDING_EDEFAULT);
			return;
		case ScalaPackage.FIELD__VISIBILITY:
			setVisibility((Visibility) null);
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
		case ScalaPackage.FIELD__OWNED_COMMENT:
			return OWNED_COMMENT_EDEFAULT == null ? ownedComment != null
					: !OWNED_COMMENT_EDEFAULT.equals(ownedComment);
		case ScalaPackage.FIELD__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT
					.equals(name);
		case ScalaPackage.FIELD__TYPE:
			return type != null;
		case ScalaPackage.FIELD__IS_OPTION:
			return isOption != IS_OPTION_EDEFAULT;
		case ScalaPackage.FIELD__IS_CONSTRUCTOR_PROPERTY:
			return isConstructorProperty != IS_CONSTRUCTOR_PROPERTY_EDEFAULT;
		case ScalaPackage.FIELD__IS_FINAL:
			return isFinal != IS_FINAL_EDEFAULT;
		case ScalaPackage.FIELD__IS_OVERRIDING:
			return isOverriding != IS_OVERRIDING_EDEFAULT;
		case ScalaPackage.FIELD__VISIBILITY:
			return visibility != null;
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
		if (baseClass == TypedElement.class) {
			switch (derivedFeatureID) {
			case ScalaPackage.FIELD__TYPE:
				return ScalaPackage.TYPED_ELEMENT__TYPE;
			case ScalaPackage.FIELD__IS_OPTION:
				return ScalaPackage.TYPED_ELEMENT__IS_OPTION;
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
		if (baseClass == TypedElement.class) {
			switch (baseFeatureID) {
			case ScalaPackage.TYPED_ELEMENT__TYPE:
				return ScalaPackage.FIELD__TYPE;
			case ScalaPackage.TYPED_ELEMENT__IS_OPTION:
				return ScalaPackage.FIELD__IS_OPTION;
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
		result.append(", isOption: "); //$NON-NLS-1$
		result.append(isOption);
		result.append(", isConstructorProperty: "); //$NON-NLS-1$
		result.append(isConstructorProperty);
		result.append(", isFinal: "); //$NON-NLS-1$
		result.append(isFinal);
		result.append(", isOverriding: "); //$NON-NLS-1$
		result.append(isOverriding);
		result.append(')');
		return result.toString();
	}

} //FieldImpl
