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
 * <p>Interface defining a "skin". A skin is the graphical representation
 * of a component. In MVC terminology, a skin represents the "view" of the
 * "model" data provided by a component. Components delegate a number of methods
 * to the skin, including all methods defined by the <tt>Visual</tt> interface
 * as well as style properties and layout. In conjunction with renderers
 * (implementations of the <tt>Renderer</tt> interface), skins define the
 * overall look and feel of an application.</p>
 *
 * <p>Skins are primarily responsible for the following:</p>
 *
 * <ul>
 * <li>Painting the component; if a container, this is effectively the
 * background of the container - the Container class itself will paint the
 * subcomponents.</li>
 * <li>Layout of subcomponents; if not a container, <tt>layout()</tt> is
 * a no-op (it exists solely to avoid type checking during layout).</li>
 * </ul>
 *
 * <p>Skins will often change their appearance in response to events fired by
 * the component; most commonly, this will be in response to data changes within
 * the component but may also be in response to input events (e.g. keyboard,
 * mouse). Skins are not required to register for such events - skin base
 * classes implement all relevant listener interfaces and the component calls
 * them as appropriate.</p>
 *
 * <p>Skins may (but are not required to) expose internal properties that
 * affect the appearance of the component as "style properties", similar to CSS
 * styles. For example, a component might provide styles to let a caller
 * set the foreground color and font. Since callers are not allowed to interact
 * with a component's skin directly, access to styles is via the component's
 * styles collection, which delegates to the dictionary methods in the installed
 * skin. Skins are responsible for invalidating or repainting the component as
 * appropriate in response to events and style changes.</p>
 */
public interface Skin extends ConstrainedVisual {
    /**
     * Associates a skin with a component.
     *
     * @param component
     * The component to which the skin is being attached.
     */
    public void install(Component component);

    /**
     * Dissociates a skin from a component.
     */
    public void uninstall();

    /**
     * Returns the component with which a skin is associated.
     */
    public Component getComponent();

    /**
     * If the component on which the skin is installed is a container, lays
     * out the container's children.
     */
    public void layout();

    /**
     * Returns the skin's focusable state.
     *
     * @return
     * <tt>true</tt> if this skin is focusable; </tt>false</tt>, otherwise.
     */
    public boolean isFocusable();
}
