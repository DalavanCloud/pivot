/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except in
 * compliance with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.pivot.wtk.skin.terra;

import java.io.File;

import org.apache.pivot.collections.Sequence;
import org.apache.pivot.io.Folder;
import org.apache.pivot.util.Filter;
import org.apache.pivot.wtk.Component;
import org.apache.pivot.wtk.FileBrowser;
import org.apache.pivot.wtk.skin.FileBrowserSkin;

/**
 * Terra file browser skin.
 *
 * @author gbrown
 */
public class TerraFileBrowserSkin extends FileBrowserSkin {
    @Override
    public void install(Component component) {
        super.install(component);

        // TODO Add components
    }

    @Override
    public void uninstall() {
        // TODO Remove components

        super.uninstall();
    }

    @Override
    public void layout() {
        // TODO Auto-generated method stub

    }

    public void selectedFolderChanged(FileBrowser fileBrowser, Folder previousSelectedFolder) {
        // TODO
    }

    public void selectedFileAdded(FileBrowser fileBrowser, File file) {
        // TODO
    }

    public void selectedFileRemoved(FileBrowser fileBrowser, File file) {
        // TODO
    }

    public void selectedFilesChanged(FileBrowser fileBrowser, Sequence<File> previousSelectedFiles) {
        // TODO
    }

    public void fileFilterChanged(FileBrowser fileBrowser, Filter<File> previousFileFilter) {
        // TODO
    }
}
