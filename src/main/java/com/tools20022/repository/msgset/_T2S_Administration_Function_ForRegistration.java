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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.admi.ReceiptAcknowledgementV01;
import com.tools20022.repository.area.admi.ReportQueryRequestV01;
import com.tools20022.repository.area.admi.ResendRequestV01;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Work in Progress Message Set for the updated messages prepared for
 * registration with ISO 20022.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageSet#getMessageDefinition
 * messageDefinition} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.area.admi.ReportQueryRequestV01
 * ReportQueryRequestV01}</li>
 * <li>{@linkplain com.tools20022.repository.area.admi.ResendRequestV01
 * ResendRequestV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.admi.ReceiptAcknowledgementV01
 * ReceiptAcknowledgementV01}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelCatalogueEntry#getBusinessProcessCatalogue
 * businessProcessCatalogue} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#catalogue
 * GeneratedRepository.catalogue}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "_T2S_Administration_Function_ForRegistration"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Work in Progress Message Set for the updated messages prepared for registration with ISO 20022."
 * </li>
 * </ul>
 */
public class _T2S_Administration_Function_ForRegistration {

	final static private AtomicReference<MMMessageSet> mmObject_lazy = new AtomicReference<>();

	final static public MMMessageSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageSet() {
			{
				businessProcessCatalogue_lazy = () -> GeneratedRepository.catalogue;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "_T2S_Administration_Function_ForRegistration";
				definition = "Work in Progress Message Set for the updated messages prepared for registration with ISO 20022.";
				messageDefinition_lazy = () -> Arrays.asList(ReportQueryRequestV01.mmObject(), ResendRequestV01.mmObject(), ReceiptAcknowledgementV01.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}