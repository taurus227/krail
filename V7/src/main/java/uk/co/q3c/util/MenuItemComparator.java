/*
 * Copyright (C) 2014 David Sowerby
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
package uk.co.q3c.util;

import java.util.Comparator;

import com.vaadin.ui.MenuBar.MenuItem;

/**
 * A comparator to sort menu items by captions
 * 
 * @author David Sowerby
 * @date 10 Jun 2014
 */
public class MenuItemComparator implements Comparator<MenuItem> {

	@Override
	public int compare(MenuItem o1, MenuItem o2) {
		return o1.getText().compareTo(o2.getText());
	}

}