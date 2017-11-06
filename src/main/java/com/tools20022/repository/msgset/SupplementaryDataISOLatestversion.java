/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.msgset;

import com.tools20022.metamodel.MMMessageSet;
import com.tools20022.repository.area.supl.InformationResponseSD1V01;
import com.tools20022.repository.area.supl.PaymentSD1V01;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Messages that add new components to existing message definitions in existing
 * business areas. The messages are each a separate extension of an existing
 * message and should always be linked to the supplementary data component in
 * the (core) registered message.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageSet#getMessageDefinition
 * messageDefinition} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.area.supl.PaymentSD1V01
 * PaymentSD1V01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.supl.InformationResponseSD1V01
 * InformationResponseSD1V01}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelCatalogueEntry#getBusinessProcessCatalogue
 * businessProcessCatalogue} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmcatalogue
 * GeneratedRepository.mmcatalogue}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Supplementary Data - ISO - Latest version"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Messages that add new components to existing message definitions in existing business areas. The messages are each a separate extension of an existing message and should always be linked to the supplementary data component in the (core) registered message."
 * </li>
 * </ul>
 */
public class SupplementaryDataISOLatestversion {

	final static private AtomicReference<MMMessageSet> mmObject_lazy = new AtomicReference<>();

	final static public MMMessageSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageSet() {
			{
				businessProcessCatalogue_lazy = () -> com.tools20022.repository.GeneratedRepository.mmcatalogue;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "Supplementary Data - ISO - Latest version";
				definition = "Messages that add new components to existing message definitions in existing business areas. The messages are each a separate extension of an existing message and should always be linked to the supplementary data component in the (core) registered message.";
				messageDefinition_lazy = () -> Arrays.asList(PaymentSD1V01.mmObject(), InformationResponseSD1V01.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}