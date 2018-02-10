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

package com.tools20022.repository.area;

import com.tools20022.metamodel.MMBusinessArea;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.catp.*;
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
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessArea#getCode code} =
 * "catp"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessArea#getMessageDefinition
 * messageDefinition} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.area.catp.ATMWithdrawalRequestV02
 * ATMWithdrawalRequestV02}</li>
 * <li>{@linkplain com.tools20022.repository.area.catp.ATMDepositResponseV01
 * ATMDepositResponseV01}</li>
 * <li>{@linkplain com.tools20022.repository.area.catp.ATMDepositRequestV01
 * ATMDepositRequestV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMWithdrawalCompletionAdviceV02
 * ATMWithdrawalCompletionAdviceV02}</li>
 * <li>{@linkplain com.tools20022.repository.area.catp.ATMInquiryResponseV02
 * ATMInquiryResponseV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMDepositCompletionAcknowledgementV01
 * ATMDepositCompletionAcknowledgementV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMPINManagementRequestV02
 * ATMPINManagementRequestV02}</li>
 * <li>{@linkplain com.tools20022.repository.area.catp.ATMTransferRequestV01
 * ATMTransferRequestV01}</li>
 * <li>{@linkplain com.tools20022.repository.area.catp.ATMWithdrawalResponseV02
 * ATMWithdrawalResponseV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMWithdrawalCompletionAcknowledgementV02
 * ATMWithdrawalCompletionAcknowledgementV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMPINManagementResponseV02
 * ATMPINManagementResponseV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMDepositCompletionAdviceV01
 * ATMDepositCompletionAdviceV01}</li>
 * <li>{@linkplain com.tools20022.repository.area.catp.ATMRejectV02
 * ATMRejectV02}</li>
 * <li>{@linkplain com.tools20022.repository.area.catp.ATMInquiryRequestV02
 * ATMInquiryRequestV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMCompletionAcknowledgementV02
 * ATMCompletionAcknowledgementV02}</li>
 * <li>{@linkplain com.tools20022.repository.area.catp.ATMCompletionAdviceV02
 * ATMCompletionAdviceV02}</li>
 * <li>{@linkplain com.tools20022.repository.area.catp.ATMTransferResponseV01
 * ATMTransferResponseV01}</li>
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
 * "ATM Card Transaction - Latest version - master"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Messages that support any card related Automated Teller Machine (ATM) transactions and services between an ATM equipment and an ATM acquirer. These services include cash withdrawals, kiosk functions and card account management transactions."
 * </li>
 * </ul>
 */
public class ATMCardTransactionLatestVersion {

	final static private AtomicReference<MMBusinessArea> mmObject_lazy = new AtomicReference<>();

	final static public MMBusinessArea mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessArea() {
			{
				businessProcessCatalogue_lazy = () -> GeneratedRepository.catalogue;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "ATM Card Transaction - Latest version - master";
				definition = "Messages that support any card related Automated Teller Machine (ATM) transactions and services between an ATM equipment and an ATM acquirer. These services include cash withdrawals, kiosk functions and card account management transactions.";
				messageDefinition_lazy = () -> Arrays.asList(ATMWithdrawalRequestV02.mmObject(), ATMDepositResponseV01.mmObject(), ATMDepositRequestV01.mmObject(), ATMWithdrawalCompletionAdviceV02.mmObject(),
						ATMInquiryResponseV02.mmObject(), ATMDepositCompletionAcknowledgementV01.mmObject(), ATMPINManagementRequestV02.mmObject(), ATMTransferRequestV01.mmObject(), ATMWithdrawalResponseV02.mmObject(),
						ATMWithdrawalCompletionAcknowledgementV02.mmObject(), ATMPINManagementResponseV02.mmObject(), ATMDepositCompletionAdviceV01.mmObject(), ATMRejectV02.mmObject(), ATMInquiryRequestV02.mmObject(),
						ATMCompletionAcknowledgementV02.mmObject(), ATMCompletionAdviceV02.mmObject(), ATMTransferResponseV01.mmObject());
				code = "catp";
			}
		});
		return mmObject_lazy.get();
	}
}