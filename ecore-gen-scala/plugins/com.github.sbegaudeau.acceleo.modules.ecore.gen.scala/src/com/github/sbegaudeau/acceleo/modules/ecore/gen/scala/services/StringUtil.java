/*******************************************************************************
 * Copyright (c) 2008, 2011 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Obeo - Initial API and implementation
 *******************************************************************************/
package com.github.sbegaudeau.acceleo.modules.ecore.gen.scala.services;

import java.util.Locale;

/**
 * This class is used to manipulate strings.
 * 
 * @author <a href="mailto:stephane.bouchet@obeo.fr">Stephane Bouchet</a>
 */
public class StringUtil {

	public String toLowerCase(String string, Object locale) {
		if (locale instanceof Locale) {
			return string.toLowerCase((Locale)locale);
		}
		return string;
	}

	public String genSquareBrackets(String string) {
		StringBuffer buf = new StringBuffer(string.length() + 2);
		buf.append("[");
		buf.append(string);
		buf.append("]");
		return buf.toString();
	}
}
