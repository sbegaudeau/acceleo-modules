/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl;

import com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.ScalaPackage;
import com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Visibility;
import com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.VisibilityKind;
import com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.VisibilityScope;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Visibility</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.VisibilityImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.VisibilityImpl#getScope <em>Scope</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VisibilityImpl extends EObjectImpl implements Visibility {
	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final VisibilityKind KIND_EDEFAULT = VisibilityKind.PUBLIC;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected VisibilityKind kind = KIND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getScope() <em>Scope</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScope()
	 * @generated
	 * @ordered
	 */
	protected VisibilityScope scope;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VisibilityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScalaPackage.Literals.VISIBILITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisibilityKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(VisibilityKind newKind) {
		VisibilityKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ScalaPackage.VISIBILITY__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisibilityScope getScope() {
		if (scope != null && scope.eIsProxy()) {
			InternalEObject oldScope = (InternalEObject) scope;
			scope = (VisibilityScope) eResolveProxy(oldScope);
			if (scope != oldScope) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ScalaPackage.VISIBILITY__SCOPE, oldScope, scope));
			}
		}
		return scope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisibilityScope basicGetScope() {
		return scope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScope(VisibilityScope newScope) {
		VisibilityScope oldScope = scope;
		scope = newScope;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ScalaPackage.VISIBILITY__SCOPE, oldScope, scope));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ScalaPackage.VISIBILITY__KIND:
			return getKind();
		case ScalaPackage.VISIBILITY__SCOPE:
			if (resolve)
				return getScope();
			return basicGetScope();
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
		case ScalaPackage.VISIBILITY__KIND:
			setKind((VisibilityKind) newValue);
			return;
		case ScalaPackage.VISIBILITY__SCOPE:
			setScope((VisibilityScope) newValue);
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
		case ScalaPackage.VISIBILITY__KIND:
			setKind(KIND_EDEFAULT);
			return;
		case ScalaPackage.VISIBILITY__SCOPE:
			setScope((VisibilityScope) null);
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
		case ScalaPackage.VISIBILITY__KIND:
			return kind != KIND_EDEFAULT;
		case ScalaPackage.VISIBILITY__SCOPE:
			return scope != null;
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
		result.append(" (kind: "); //$NON-NLS-1$
		result.append(kind);
		result.append(')');
		return result.toString();
	}

} //VisibilityImpl
