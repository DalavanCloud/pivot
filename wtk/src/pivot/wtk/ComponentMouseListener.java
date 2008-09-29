/*
 * Copyright (c) 2008 VMware, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package pivot.wtk;

/**
 * <p>Component mouse listener interface. Component mouse events are "bubbling"
 * and are fired as the event propagates up the component hierarchy.</p>
 *
 * @author gbrown
 */
public interface ComponentMouseListener {
    /**
     * Called when the mouse is moved over a component.
     *
     * @param component
     * @param x
     * @param y
     *
     * @return
     * <tt>true</tt> to consume the event; <tt>false</tt> to allow it to
     * propagate.
     */
    public boolean mouseMove(Component component, int x, int y);

    /**
     * Called when the mouse enters a component.
     *
     * @param component
     */
    public void mouseOver(Component component);

    /**
     * Called when the mouse exits a component.
     *
     * @param component
     */
    public void mouseOut(Component component);
}

