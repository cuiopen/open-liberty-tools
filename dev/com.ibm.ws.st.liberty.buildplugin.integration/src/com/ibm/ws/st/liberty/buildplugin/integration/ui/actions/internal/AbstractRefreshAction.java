/*******************************************************************************
 * Copyright (c) 2017 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * IBM Corporation - initial API and implementation
 *******************************************************************************/

package com.ibm.ws.st.liberty.buildplugin.integration.ui.actions.internal;

import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.ui.IWorkbenchCommandConstants;
import org.eclipse.ui.actions.SelectionProviderAction;

import com.ibm.ws.st.liberty.buildplugin.integration.internal.ILibertyBuildPluginImplProvider;
import com.ibm.ws.st.liberty.buildplugin.integration.internal.Messages;

public abstract class AbstractRefreshAction extends SelectionProviderAction implements ILibertyBuildPluginImplProvider {
    protected Object objectToRefresh;
    private final StructuredViewer viewer;

    public AbstractRefreshAction(ISelectionProvider selectionProvider, StructuredViewer viewer) {
        super(selectionProvider, Messages.refreshAction);
        setActionDefinitionId(IWorkbenchCommandConstants.FILE_REFRESH);
        setImageDescriptor(null);
        this.viewer = viewer;
        selectionChanged(getStructuredSelection());
    }

    @Override
    public void run() {
        if (objectToRefresh == null) {
            viewer.refresh(); // no item selected so just refresh the view
            return;
        }

        viewer.refresh(objectToRefresh);
    }
}
