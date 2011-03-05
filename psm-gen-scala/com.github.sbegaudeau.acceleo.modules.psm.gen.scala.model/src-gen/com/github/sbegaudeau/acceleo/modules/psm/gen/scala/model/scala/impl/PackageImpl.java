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
import com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.File;
import com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.ScalaPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.PackageImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.PackageImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.PackageImpl#getFiles <em>Files</em>}</li>
 *   <li>{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.PackageImpl#getSubPackages <em>Sub Packages</em>}</li>
 *   <li>{@link com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.impl.PackageImpl#getSuperPackage <em>Super Package</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PackageImpl extends EObjectImpl implements
		com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Package {
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
	 * The cached value of the '{@link #getFiles() <em>Files</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFiles()
	 * @generated
	 * @ordered
	 */
	protected EList<File> files;

	/**
	 * The cached value of the '{@link #getSubPackages() <em>Sub Packages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubPackages()
	 * @generated
	 * @ordered
	 */
	protected EList<com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Package> subPackages;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScalaPackage.Literals.PACKAGE;
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
							ScalaPackage.PACKAGE__COMMENT, oldComment, comment));
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
					Notification.SET, ScalaPackage.PACKAGE__COMMENT,
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
					ScalaPackage.PACKAGE__COMMENT, newComment, newComment));
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
					ScalaPackage.PACKAGE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<File> getFiles() {
		if (files == null) {
			files = new EObjectContainmentEList<File>(File.class, this,
					ScalaPackage.PACKAGE__FILES);
		}
		return files;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Package> getSubPackages() {
		if (subPackages == null) {
			subPackages = new EObjectContainmentWithInverseEList<com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Package>(
					com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Package.class,
					this, ScalaPackage.PACKAGE__SUB_PACKAGES,
					ScalaPackage.PACKAGE__SUPER_PACKAGE);
		}
		return subPackages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Package getSuperPackage() {
		if (eContainerFeatureID() != ScalaPackage.PACKAGE__SUPER_PACKAGE)
			return null;
		return (com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Package) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSuperPackage(
			com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Package newSuperPackage,
			NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newSuperPackage,
				ScalaPackage.PACKAGE__SUPER_PACKAGE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuperPackage(
			com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Package newSuperPackage) {
		if (newSuperPackage != eInternalContainer()
				|| (eContainerFeatureID() != ScalaPackage.PACKAGE__SUPER_PACKAGE && newSuperPackage != null)) {
			if (EcoreUtil.isAncestor(this, newSuperPackage))
				throw new IllegalArgumentException(
						"Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSuperPackage != null)
				msgs = ((InternalEObject) newSuperPackage)
						.eInverseAdd(
								this,
								ScalaPackage.PACKAGE__SUB_PACKAGES,
								com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Package.class,
								msgs);
			msgs = basicSetSuperPackage(newSuperPackage, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ScalaPackage.PACKAGE__SUPER_PACKAGE, newSuperPackage,
					newSuperPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ScalaPackage.PACKAGE__COMMENT:
			if (comment != null)
				msgs = ((InternalEObject) comment).eInverseRemove(this,
						ScalaPackage.COMMENT__COMMENTED_ELEMENT, Comment.class,
						msgs);
			return basicSetComment((Comment) otherEnd, msgs);
		case ScalaPackage.PACKAGE__SUB_PACKAGES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getSubPackages())
					.basicAdd(otherEnd, msgs);
		case ScalaPackage.PACKAGE__SUPER_PACKAGE:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetSuperPackage(
					(com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Package) otherEnd,
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
		case ScalaPackage.PACKAGE__COMMENT:
			return basicSetComment(null, msgs);
		case ScalaPackage.PACKAGE__FILES:
			return ((InternalEList<?>) getFiles()).basicRemove(otherEnd, msgs);
		case ScalaPackage.PACKAGE__SUB_PACKAGES:
			return ((InternalEList<?>) getSubPackages()).basicRemove(otherEnd,
					msgs);
		case ScalaPackage.PACKAGE__SUPER_PACKAGE:
			return basicSetSuperPackage(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(
			NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case ScalaPackage.PACKAGE__SUPER_PACKAGE:
			return eInternalContainer()
					.eInverseRemove(
							this,
							ScalaPackage.PACKAGE__SUB_PACKAGES,
							com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Package.class,
							msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ScalaPackage.PACKAGE__COMMENT:
			if (resolve)
				return getComment();
			return basicGetComment();
		case ScalaPackage.PACKAGE__NAME:
			return getName();
		case ScalaPackage.PACKAGE__FILES:
			return getFiles();
		case ScalaPackage.PACKAGE__SUB_PACKAGES:
			return getSubPackages();
		case ScalaPackage.PACKAGE__SUPER_PACKAGE:
			return getSuperPackage();
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
		case ScalaPackage.PACKAGE__COMMENT:
			setComment((Comment) newValue);
			return;
		case ScalaPackage.PACKAGE__NAME:
			setName((String) newValue);
			return;
		case ScalaPackage.PACKAGE__FILES:
			getFiles().clear();
			getFiles().addAll((Collection<? extends File>) newValue);
			return;
		case ScalaPackage.PACKAGE__SUB_PACKAGES:
			getSubPackages().clear();
			getSubPackages()
					.addAll((Collection<? extends com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Package>) newValue);
			return;
		case ScalaPackage.PACKAGE__SUPER_PACKAGE:
			setSuperPackage((com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Package) newValue);
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
		case ScalaPackage.PACKAGE__COMMENT:
			setComment((Comment) null);
			return;
		case ScalaPackage.PACKAGE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ScalaPackage.PACKAGE__FILES:
			getFiles().clear();
			return;
		case ScalaPackage.PACKAGE__SUB_PACKAGES:
			getSubPackages().clear();
			return;
		case ScalaPackage.PACKAGE__SUPER_PACKAGE:
			setSuperPackage((com.github.sbegaudeau.acceleo.modules.psm.gen.scala.model.scala.Package) null);
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
		case ScalaPackage.PACKAGE__COMMENT:
			return comment != null;
		case ScalaPackage.PACKAGE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT
					.equals(name);
		case ScalaPackage.PACKAGE__FILES:
			return files != null && !files.isEmpty();
		case ScalaPackage.PACKAGE__SUB_PACKAGES:
			return subPackages != null && !subPackages.isEmpty();
		case ScalaPackage.PACKAGE__SUPER_PACKAGE:
			return getSuperPackage() != null;
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
		result.append(')');
		return result.toString();
	}

} //PackageImpl
