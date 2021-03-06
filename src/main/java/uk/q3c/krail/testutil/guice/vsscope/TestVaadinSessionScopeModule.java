/*
 *
 *  * Copyright (c) 2016. David Sowerby
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 *  * the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 *  * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 *  * specific language governing permissions and limitations under the License.
 *
 */

package uk.q3c.krail.testutil.guice.vsscope;

import com.vaadin.server.VaadinSession;
import uk.q3c.krail.core.guice.vsscope.VaadinSessionScopeModule;

import static org.mockito.Mockito.mock;

/**
 * Created by David Sowerby on 14/03/15.
 */
public class TestVaadinSessionScopeModule extends VaadinSessionScopeModule {


    public TestVaadinSessionScopeModule() {
        getScope().flush();
        VaadinSession mockSession = mock(VaadinSession.class);
        VaadinSession.setCurrent(mockSession);
    }
}
