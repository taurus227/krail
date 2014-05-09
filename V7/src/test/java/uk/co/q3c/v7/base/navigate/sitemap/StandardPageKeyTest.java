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
package uk.co.q3c.v7.base.navigate.sitemap;

import static org.assertj.core.api.Assertions.*;

import java.util.Locale;

import org.junit.Test;

import uk.co.q3c.v7.base.navigate.StandardPageKey;

public class StandardPageKeyTest {

	@Test
	public void keyLabels() {

		// given

		// when

		// then
		for (StandardPageKey key : StandardPageKey.values()) {
			assertThat(key.getValue(Locale.UK)).overridingErrorMessage(key.name()).isNotNull();

		}
		assertThat(StandardPageKey.Logout.getValue(Locale.UK)).isEqualTo("Logout");
		assertThat(StandardPageKey.Login.getValue(Locale.UK)).isEqualTo("Login");
		assertThat(StandardPageKey.Private_Home.getValue(Locale.UK)).isEqualTo("Private Home");
		assertThat(StandardPageKey.Public_Home.getValue(Locale.UK)).isEqualTo("Public Home");
	}

}