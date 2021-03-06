/*******************************************************************************
 * Copyright (c) 2017 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package com.ibm.ws.st.core.internal.launch;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.debug.core.ILaunch;

import com.ibm.ws.st.core.internal.WebSphereServer;

/**
 * Base class for remote utilities. For more information, see the UtilityExtension
 * class.
 *
 * @see com.ibm.ws.st.core.internal.UtilityExtension
 */
public abstract class RemoteUtility {

    public abstract void execute(WebSphereServer server, String launchMode, ILaunch launch, IProgressMonitor monitor) throws Exception;

}
