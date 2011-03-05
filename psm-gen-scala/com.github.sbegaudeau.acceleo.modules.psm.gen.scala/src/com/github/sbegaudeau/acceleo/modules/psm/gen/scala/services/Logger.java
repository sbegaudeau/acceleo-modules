/*******************************************************************************
 * Copyright (c) 2008, 2010 Stephane Begaudeau.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Stephane Begaudeau - initial API and implementation
 *******************************************************************************/
package com.github.sbegaudeau.acceleo.modules.psm.gen.scala.services;

import org.eclipse.core.runtime.Status;

import com.github.sbegaudeau.acceleo.modules.psm.gen.scala.ScalaGeneratorPlugin;

public class Logger {
	
	public static String logError(String message) {
		Status status = new Status(Status.ERROR, ScalaGeneratorPlugin.PLUGIN_ID, message, null);
		ScalaGeneratorPlugin.log(status);
		return "";
	}
	
	public static String logWarning(String message) {
		Status status = new Status(Status.WARNING, ScalaGeneratorPlugin.PLUGIN_ID, message, null);
		ScalaGeneratorPlugin.log(status);
		return "";
	}
	
	public static String logInformation(String message) {
		Status status = new Status(Status.OK, ScalaGeneratorPlugin.PLUGIN_ID, message, null);
		ScalaGeneratorPlugin.log(status);
		return "";
	}
}
