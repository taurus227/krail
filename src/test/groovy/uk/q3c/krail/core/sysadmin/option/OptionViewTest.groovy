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

package uk.q3c.krail.core.sysadmin.option

import com.vaadin.ui.Panel
import uk.q3c.krail.core.view.ViewTest
import uk.q3c.krail.core.view.component.ViewChangeBusMessage
/**
 * Created by David Sowerby on 19 Jan 2016
 */
class OptionViewTest extends ViewTest {

    ActiveOptionSourcePanel activeOptionSourcePanel = Mock()
    SelectedOptionSourcePanel selectedOptionSourcePanel = Mock()
    SelectionPanel selectionPanel = Mock()
    ViewChangeBusMessage busMessage = Mock()
    OptionView thisView


    def setup() {
        fieldsWIthoutIds = ['activeOptionSourcePanel', 'selectedOptionSourcePanel', 'selectionPanel']
        thisView = new OptionView(activeOptionSourcePanel, selectedOptionSourcePanel, selectionPanel, translate)
        view = thisView
    }



    def "doBuild"() {
        when:
        OptionView
        view.doBuild(busMessage)
        then:
        view.getRootComponent() != null
        view.getRootComponent() instanceof Panel
        1 * activeOptionSourcePanel.displayInfo();
        1 * selectedOptionSourcePanel.displayInfo();
    }
}
