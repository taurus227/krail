/*
 * Copyright (C) 2013 David Sowerby
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package fixture.testviews2;

import uk.co.q3c.v7.base.view.V7View;
import uk.co.q3c.v7.base.view.V7ViewChangeEvent;

import com.vaadin.ui.Component;

public class PrivateView implements V7View {

	@Override
	public void enter(V7ViewChangeEvent event) {
		//
		throw new RuntimeException("not yet implemented");
	}

	@Override
	public Component getRootComponent() {
		// return null;
		throw new RuntimeException("not yet implemented");
	}

	@Override
	public String viewName() {

		return getClass().getSimpleName();
	}

	@Override
	public void setIds() {
	}

}
