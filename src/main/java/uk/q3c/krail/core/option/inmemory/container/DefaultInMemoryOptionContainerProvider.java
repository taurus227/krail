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

package uk.q3c.krail.core.option.inmemory.container;

import com.google.inject.Inject;
import com.vaadin.v7.data.Container;
import uk.q3c.krail.core.option.inmemory.InMemoryOptionContainerProvider;
import uk.q3c.krail.persist.inmemory.InMemoryOptionStore;

/**
 * Returns an {@link InMemoryOptionContainer}
 * <p>
 * Created by David Sowerby on 09/07/15.
 */
public class DefaultInMemoryOptionContainerProvider implements InMemoryOptionContainerProvider {


    private final InMemoryOptionStore optionStore;

    @Inject
    protected DefaultInMemoryOptionContainerProvider(InMemoryOptionStore optionStore) {
        this.optionStore = optionStore;
    }

    @Override
    public Container get() {
        return new InMemoryOptionContainer(optionStore);
    }
}
