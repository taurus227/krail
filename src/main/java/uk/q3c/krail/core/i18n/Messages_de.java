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
package uk.q3c.krail.core.i18n;

/**
 * The base for the resource bundle of {@link Messages_de}. The separation between them is arbitrary, but helps break
 * down
 * what could other wise be long lists, and only one of them needs to look up parameter values:
 * <ol>
 * <li>{@link Labels} : short, usually one or two words, no parameters, generally used as captions
 * <li>{@link Descriptions} : longer, typically several words, no parameters, generally used in tooltips
 * <li>{@link Messages_de} : contains parameters, typically used for user messages.
 *
 * @author David Sowerby 3 Aug 2013
 */
public class Messages_de extends Messages {

    @Override
    protected void loadMap() {
        put(MessageKey.Invalid_URI, "{0} ist keine gültige Seite");
        put(MessageKey.Service_not_Started, "Der Service {0} kann nicht benutzt werden bis er gestartet ist");
        put(MessageKey.Locale_Change, "Sprache und Land nach {0} geändert");
    }


}