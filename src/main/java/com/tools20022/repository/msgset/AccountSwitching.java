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
import com.tools20022.repository.area.acmt.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * The Account Switch Service provides the central functions required to support
 * the guaranteed switch of a customer’s account and the transfer of payments
 * arrangements associated with the account from one payment institution to
 * another payment institution in seven working days. Payment institutions may
 * use some of the central functions to provide a partial account switch.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageSet#getMessageDefinition
 * messageDefinition} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountSwitchInformationResponseV01
 * AccountSwitchInformationResponseV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountSwitchBalanceTransferAcknowledgementV01
 * AccountSwitchBalanceTransferAcknowledgementV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountSwitchTechnicalRejectionV01
 * AccountSwitchTechnicalRejectionV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountSwitchPaymentResponseV01
 * AccountSwitchPaymentResponseV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountSwitchNotifyAccountSwitchCompleteV01
 * AccountSwitchNotifyAccountSwitchCompleteV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountSwitchRequestBalanceTransferV01
 * AccountSwitchRequestBalanceTransferV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountSwitchInformationRequestV01
 * AccountSwitchInformationRequestV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountSwitchRequestRedirectionV01
 * AccountSwitchRequestRedirectionV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountSwitchTerminationSwitchV01
 * AccountSwitchTerminationSwitchV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountSwitchCancelExistingPaymentV01
 * AccountSwitchCancelExistingPaymentV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountSwitchRequestPaymentV01
 * AccountSwitchRequestPaymentV01}</li>
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
 * "Account Switching"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "The Account Switch Service provides the central functions required to support the guaranteed switch of a customer’s account and the transfer of payments arrangements associated with the account from one payment institution to another payment institution in seven working days. Payment institutions may use some of the central functions to provide a partial account switch."
 * </li>
 * </ul>
 */
public class AccountSwitching {

	final static private AtomicReference<MMMessageSet> mmObject_lazy = new AtomicReference<>();

	final static public MMMessageSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageSet() {
			{
				businessProcessCatalogue_lazy = () -> GeneratedRepository.catalogue;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "Account Switching";
				definition = "The Account Switch Service provides the central functions required to support the guaranteed switch of a customer’s account and the transfer of payments arrangements associated with the account from one payment institution to another payment institution in seven working days. Payment institutions may use some of the central functions to provide a partial account switch.";
				messageDefinition_lazy = () -> Arrays.asList(AccountSwitchInformationResponseV01.mmObject(), AccountSwitchBalanceTransferAcknowledgementV01.mmObject(), AccountSwitchTechnicalRejectionV01.mmObject(),
						AccountSwitchPaymentResponseV01.mmObject(), AccountSwitchNotifyAccountSwitchCompleteV01.mmObject(), AccountSwitchRequestBalanceTransferV01.mmObject(), AccountSwitchInformationRequestV01.mmObject(),
						AccountSwitchRequestRedirectionV01.mmObject(), AccountSwitchTerminationSwitchV01.mmObject(), AccountSwitchCancelExistingPaymentV01.mmObject(), AccountSwitchRequestPaymentV01.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}