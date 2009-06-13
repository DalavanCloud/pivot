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
package pivot.tutorials.transition;

import pivot.collections.Dictionary;
import pivot.wtk.Application;
import pivot.wtk.Button;
import pivot.wtk.ButtonPressListener;
import pivot.wtk.DesktopApplicationContext;
import pivot.wtk.Display;
import pivot.wtk.Window;
import pivot.wtkx.WTKX;
import pivot.wtkx.WTKXSerializer;

public class Transitions implements Application {
    private Window window = null;

    @WTKX private Button button1;
    @WTKX private Button button2;
    @WTKX private Button button3;
    @WTKX private Button button4;

    public void startup(Display display, Dictionary<String, String> properties)
        throws Exception {
        WTKXSerializer wtkxSerializer = new WTKXSerializer();
        window = (Window)wtkxSerializer.readObject(this, "transitions.wtkx");
        wtkxSerializer.bind(this, Transitions.class);

        ButtonPressListener trigger = new ButtonPressListener() {
            public void buttonPressed(Button button) {
                button.setEnabled(false);

                CollapseTransition transition = new CollapseTransition(button, 300, 30);
                transition.start();
            }
        };

        button1.getButtonPressListeners().add(trigger);
        button2.getButtonPressListeners().add(trigger);
        button3.getButtonPressListeners().add(trigger);
        button4.getButtonPressListeners().add(trigger);

        window.open(display);
    }

    public boolean shutdown(boolean optional) {
        if (window != null) {
            window.close();
        }

        return true;
    }

    public void suspend() {
    }

    public void resume() {
    }

    public static void main(String[] args) {
        DesktopApplicationContext.main(Transitions.class, args);
    }
}
