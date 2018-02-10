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
import com.tools20022.repository.area.auth.InformationRequestOpeningV01;
import com.tools20022.repository.area.auth.InformationRequestResponseV01;
import com.tools20022.repository.area.auth.InformationRequestStatusChangeNotificationV01;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Set of messages that Authorities (like police, customs, tax authorities,
 * enforcement authorities) can use to request account and other banking and
 * financial instrument information from financial institutions to carry out
 * their duties.<br>
 * Requested information can relate to accounts, their signatories and
 * beneficiaries and co-owners as well as movements plus positions on these
 * accounts. Additionally, this information can pertain to loans and guarantees.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageSet#getMessageDefinition
 * messageDefinition} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.InformationRequestOpeningV01
 * InformationRequestOpeningV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.InformationRequestResponseV01
 * InformationRequestResponseV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.InformationRequestStatusChangeNotificationV01
 * InformationRequestStatusChangeNotificationV01}</li>
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
 * "Authorities Financial Investigations – ISO – Latest version"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Set of messages that Authorities (like police, customs, tax authorities, enforcement authorities) can use to request account and other banking and financial instrument information from financial institutions to carry out their duties.\r\nRequested information can relate to accounts, their signatories and beneficiaries and co-owners as well as movements plus positions on these accounts. Additionally, this information can pertain to loans and guarantees."
 * </li>
 * </ul>
 */
public class AuthoritiesFinancialInvestigationsISOLatestversion {

	final static private AtomicReference<MMMessageSet> mmObject_lazy = new AtomicReference<>();

	final static public MMMessageSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageSet() {
			{
				businessProcessCatalogue_lazy = () -> GeneratedRepository.catalogue;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "Authorities Financial Investigations – ISO – Latest version";
				definition = "Set of messages that Authorities (like police, customs, tax authorities, enforcement authorities) can use to request account and other banking and financial instrument information from financial institutions to carry out their duties.\r\nRequested information can relate to accounts, their signatories and beneficiaries and co-owners as well as movements plus positions on these accounts. Additionally, this information can pertain to loans and guarantees.";
				messageDefinition_lazy = () -> Arrays.asList(InformationRequestOpeningV01.mmObject(), InformationRequestResponseV01.mmObject(), InformationRequestStatusChangeNotificationV01.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}