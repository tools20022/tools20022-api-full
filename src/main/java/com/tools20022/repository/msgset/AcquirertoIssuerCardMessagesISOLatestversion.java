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
import com.tools20022.repository.area.cain.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Messages that support any card related Automated Teller Machine (ATM)
 * transactions and services between an ATM equipment and an ATM acquirer. These
 * services include cash withdrawals, kiosk functions and card account
 * management transactions.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageSet#getMessageDefinition
 * messageDefinition} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.cain.NetworkManagementResponse
 * NetworkManagementResponse}</li>
 * <li>{@linkplain com.tools20022.repository.area.cain.AcquirerRejection
 * AcquirerRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.cain.AcquirerFinancialResponse
 * AcquirerFinancialResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.cain.AcquirerReversalInitiation
 * AcquirerReversalInitiation}</li>
 * <li>{@linkplain com.tools20022.repository.area.cain.KeyExchangeResponse
 * KeyExchangeResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.cain.AcquirerAuthorisationInitiation
 * AcquirerAuthorisationInitiation}</li>
 * <li>{@linkplain com.tools20022.repository.area.cain.ReconciliationInitiation
 * ReconciliationInitiation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.cain.AcquirerAuthorisationResponse
 * AcquirerAuthorisationResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.cain.NetworkManagementInitiation
 * NetworkManagementInitiation}</li>
 * <li>{@linkplain com.tools20022.repository.area.cain.AcquirerReversalResponse
 * AcquirerReversalResponse}</li>
 * <li>{@linkplain com.tools20022.repository.area.cain.KeyExchangeInitiation
 * KeyExchangeInitiation}</li>
 * <li>{@linkplain com.tools20022.repository.area.cain.ReconciliationResponse
 * ReconciliationResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.cain.AcquirerFinancialInitiation
 * AcquirerFinancialInitiation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelCatalogueEntry#getBusinessProcessCatalogue
 * businessProcessCatalogue} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#catalogue
 * GeneratedRepository.catalogue}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Acquirer to Issuer Card Messages - ISO - Latest version"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Messages that support any card related Automated Teller Machine (ATM) transactions and services between an ATM equipment and an ATM acquirer. These services include cash withdrawals, kiosk functions and card account management transactions."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
public class AcquirertoIssuerCardMessagesISOLatestversion {

	final static private AtomicReference<MMMessageSet> mmObject_lazy = new AtomicReference<>();

	final static public MMMessageSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageSet() {
			{
				businessProcessCatalogue_lazy = () -> GeneratedRepository.catalogue;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Acquirer to Issuer Card Messages - ISO - Latest version";
				definition = "Messages that support any card related Automated Teller Machine (ATM) transactions and services between an ATM equipment and an ATM acquirer. These services include cash withdrawals, kiosk functions and card account management transactions.";
				messageDefinition_lazy = () -> Arrays.asList(NetworkManagementResponse.mmObject(), AcquirerRejection.mmObject(), AcquirerFinancialResponse.mmObject(), AcquirerReversalInitiation.mmObject(), KeyExchangeResponse.mmObject(),
						AcquirerAuthorisationInitiation.mmObject(), ReconciliationInitiation.mmObject(), AcquirerAuthorisationResponse.mmObject(), NetworkManagementInitiation.mmObject(), AcquirerReversalResponse.mmObject(),
						KeyExchangeInitiation.mmObject(), ReconciliationResponse.mmObject(), AcquirerFinancialInitiation.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}