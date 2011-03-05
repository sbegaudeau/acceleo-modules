/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl;

import com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Attribute;
import com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Comment;
import com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.GenericType;
import com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.ScalaPackage;
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
 * An implementation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.AttributeImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.AttributeImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.AttributeImpl#getGenericType <em>Generic Type</em>}</li>
 *   <li>{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.AttributeImpl#isIsFinal <em>Is Final</em>}</li>
 *   <li>{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.AttributeImpl#isIsOverriding <em>Is Overriding</em>}</li>
 *   <li>{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.AttributeImpl#getVisibility <em>Visibility</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributeImpl extends EObjectImpl implements Attribute {
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
	 * The cached value of the '{@link #getGenericType() <em>Generic Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenericType()
	 * @generated
	 * @ordered
	 */
	protected GenericType genericType;

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
	protected AttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScalaPackage.Literals.ATTRIBUTE;
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
							ScalaPackage.ATTRIBUTE__COMMENT, oldComment,
							comment));
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
					Notification.SET, ScalaPackage.ATTRIBUTE__COMMENT,
					oldComment, newComment);
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
					ScalaPackage.ATTRIBUTE__COMMENT, newComment, newComment));
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
					ScalaPackage.ATTRIBUTE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericType getGenericType() {
		return genericType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenericType(GenericType newGenericType,
			NotificationChain msgs) {
		GenericType oldGenericType = genericType;
		genericType = newGenericType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, ScalaPackage.ATTRIBUTE__GENERIC_TYPE,
					oldGenericType, newGenericType);
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
	public void setGenericType(GenericType newGenericType) {
		if (newGenericType != genericType) {
			NotificationChain msgs = null;
			if (genericType != null)
				msgs = ((InternalEObject) genericType).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- ScalaPackage.ATTRIBUTE__GENERIC_TYPE, null,
						msgs);
			if (newGenericType != null)
				msgs = ((InternalEObject) newGenericType).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- ScalaPackage.ATTRIBUTE__GENERIC_TYPE, null,
						msgs);
			msgs = basicSetGenericType(newGenericType, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ScalaPackage.ATTRIBUTE__GENERIC_TYPE, newGenericType,
					newGenericType));
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
					ScalaPackage.ATTRIBUTE__IS_FINAL, oldIsFinal, isFinal));
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
					ScalaPackage.ATTRIBUTE__IS_OVERRIDING, oldIsOverriding,
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
					Notification.SET, ScalaPackage.ATTRIBUTE__VISIBILITY,
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
				msgs = ((InternalEObject) visibility).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- ScalaPackage.ATTRIBUTE__VISIBILITY, null,
						msgs);
			if (newVisibility != null)
				msgs = ((InternalEObject) newVisibility).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- ScalaPackage.ATTRIBUTE__VISIBILITY, null,
						msgs);
			msgs = basicSetVisibility(newVisibility, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ScalaPackage.ATTRIBUTE__VISIBILITY, newVisibility,
					newVisibility));
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
		case ScalaPackage.ATTRIBUTE__COMMENT:
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
		case ScalaPackage.ATTRIBUTE__COMMENT:
			return basicSetComment(null, msgs);
		case ScalaPackage.ATTRIBUTE__GENERIC_TYPE:
			return basicSetGenericType(null, msgs);
		case ScalaPackage.ATTRIBUTE__VISIBILITY:
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
		case ScalaPackage.ATTRIBUTE__COMMENT:
			if (resolve)
				return getComment();
			return basicGetComment();
		case ScalaPackage.ATTRIBUTE__NAME:
			return getName();
		case ScalaPackage.ATTRIBUTE__GENERIC_TYPE:
			return getGenericType();
		case ScalaPackage.ATTRIBUTE__IS_FINAL:
			return isIsFinal();
		case ScalaPackage.ATTRIBUTE__IS_OVERRIDING:
			return isIsOverriding();
		case ScalaPackage.ATTRIBUTE__VISIBILITY:
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
		case ScalaPackage.ATTRIBUTE__COMMENT:
			setComment((Comment) newValue);
			return;
		case ScalaPackage.ATTRIBUTE__NAME:
			setName((String) newValue);
			return;
		case ScalaPackage.ATTRIBUTE__GENERIC_TYPE:
			setGenericType((GenericType) newValue);
			return;
		case ScalaPackage.ATTRIBUTE__IS_FINAL:
			setIsFinal((Boolean) newValue);
			return;
		case ScalaPackage.ATTRIBUTE__IS_OVERRIDING:
			setIsOverriding((Boolean) newValue);
			return;
		case ScalaPackage.ATTRIBUTE__VISIBILITY:
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
		case ScalaPackage.ATTRIBUTE__COMMENT:
			setComment((Comment) null);
			return;
		case ScalaPackage.ATTRIBUTE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ScalaPackage.ATTRIBUTE__GENERIC_TYPE:
			setGenericType((GenericType) null);
			return;
		case ScalaPackage.ATTRIBUTE__IS_FINAL:
			setIsFinal(IS_FINAL_EDEFAULT);
			return;
		case ScalaPackage.ATTRIBUTE__IS_OVERRIDING:
			setIsOverriding(IS_OVERRIDING_EDEFAULT);
			return;
		case ScalaPackage.ATTRIBUTE__VISIBILITY:
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
		case ScalaPackage.ATTRIBUTE__COMMENT:
			return comment != null;
		case ScalaPackage.ATTRIBUTE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT
					.equals(name);
		case ScalaPackage.ATTRIBUTE__GENERIC_TYPE:
			return genericType != null;
		case ScalaPackage.ATTRIBUTE__IS_FINAL:
			return isFinal != IS_FINAL_EDEFAULT;
		case ScalaPackage.ATTRIBUTE__IS_OVERRIDING:
			return isOverriding != IS_OVERRIDING_EDEFAULT;
		case ScalaPackage.ATTRIBUTE__VISIBILITY:
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
			case ScalaPackage.ATTRIBUTE__GENERIC_TYPE:
				return ScalaPackage.TYPED_ELEMENT__GENERIC_TYPE;
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
			case ScalaPackage.TYPED_ELEMENT__GENERIC_TYPE:
				return ScalaPackage.ATTRIBUTE__GENERIC_TYPE;
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
		result.append(", isFinal: "); //$NON-NLS-1$
		result.append(isFinal);
		result.append(", isOverriding: "); //$NON-NLS-1$
		result.append(isOverriding);
		result.append(')');
		return result.toString();
	}

} //AttributeImpl
