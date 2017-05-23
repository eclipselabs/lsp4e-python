/*******************************************************************************
 * Copyright (c) 2017 Rogue Wave Software Inc. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Michał Niewrzał (Rogue Wave Software Inc.) - initial implementation
 *******************************************************************************/
package org.eclipse.lsp4e.python;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.lsp4e.LanguageServerPlugin;
import org.eclipse.lsp4e.server.ProcessStreamConnectionProvider;
import org.osgi.framework.Bundle;

public class PythonLanguageServer extends ProcessStreamConnectionProvider {

	public PythonLanguageServer() {
		Bundle bundle = Activator.getContext().getBundle();

		List<String> commands = new ArrayList<>();
		commands.add("pyls");
		setCommands(commands);

		Path workingDir = Path.EMPTY;
		try {
			workingDir = new Path(FileLocator.toFileURL(FileLocator.find(bundle, new Path("server"), null)).getPath());
		} catch (IOException e) {
			LanguageServerPlugin.logError(e);
		}
		setWorkingDirectory(workingDir.toOSString());
	}

	@Override
	public String toString() {
		return "Python Language Server: " + super.toString();
	}

}
