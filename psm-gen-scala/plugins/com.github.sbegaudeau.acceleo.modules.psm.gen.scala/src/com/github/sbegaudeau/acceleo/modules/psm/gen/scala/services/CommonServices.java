/*******************************************************************************
 * Copyright (c) 2011 Stephane Begaudeau.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Stephane Begaudeau - initial API and implementation
 *******************************************************************************/
package com.github.sbegaudeau.acceleo.modules.psm.gen.scala.services;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Utility class.
 * @author sbegaudeau
 */
public final class CommonServices {

	/**
	 * The constructor.
	 */
	private CommonServices() {
		// prevent instantiation.
	}
	
	/**
	 * Surround value with double quote if is not done (abcd to "abcd")<br/>
	 * Replace double quote with \" (ab"cd to "ab\"cd")<br/> Remove simple quote
	 * starting and ending in value ('abcd' to "abcd")<br/> Usefull for default string value.
	 * 
	 * @param value
	 *            the value
	 * 
	 * @return the string
	 */
	public static String addQuotes(String value) {
		if (value.endsWith("'") && value.startsWith("'")) {
			value = value.substring(1, value.length() - 1);
		}
		if (value.endsWith("\"") && value.startsWith("\"")) {
			value = value.substring(1, value.length() - 1);
		}
		return "\"" + value.trim().replaceAll("\"", "\\\\\\\"") + "\"";
	}

	/**
	 * Get the date in a long format : January 12, 1952
	 * 
	 * @return String representing the long format date
	 */
	public static String genLongDate() {
		Date date = new Date(); // to get the date
		Locale locale = Locale.getDefault();// to get the language of the system
		DateFormat dateFormatShort = DateFormat.getDateInstance(DateFormat.LONG, locale);
		return dateFormatShort.format(date);
	}

	/**
	 * Get the date in a short format : 06/08/07
	 * 
	 * @return String representing the short format date
	 */
	public static String genShortDate() {
		Date date = new Date(); // to get the date
		Locale locale = Locale.getDefault();// to get the language of the system
		DateFormat dateFormatShort = DateFormat.getDateInstance(DateFormat.SHORT, locale);
		return dateFormatShort.format(date);
	}
	
	/**
	 * Returns the current time.
	 * 
	 * @return The current time.
	 */
	public static String genTime() {
		Date date = new Date();
		return DateFormat.getTimeInstance(DateFormat.LONG).format(date);
	}
}
