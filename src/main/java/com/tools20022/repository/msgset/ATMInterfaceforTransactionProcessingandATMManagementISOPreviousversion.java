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
import com.tools20022.repository.area.caam.*;
import com.tools20022.repository.area.catp.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Messages that support any card related Automated Teller Machine (ATM)
 * transactions, card related terminal management services and services between
 * an ATM equipment and an ATM acquirer. These services include cash
 * withdrawals, kiosk functions and card account management transactions.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageSet#getMessageDefinition
 * messageDefinition} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.ATMReconciliationAdviceV01
 * ATMReconciliationAdviceV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.ATMReconciliationAcknowledgementV01
 * ATMReconciliationAcknowledgementV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.HostToATMAcknowledgementV01
 * HostToATMAcknowledgementV01}</li>
 * <li>{@linkplain com.tools20022.repository.area.caam.ATMDiagnosticResponseV01
 * ATMDiagnosticResponseV01}</li>
 * <li>{@linkplain com.tools20022.repository.area.caam.ATMDiagnosticRequestV01
 * ATMDiagnosticRequestV01}</li>
 * <li>{@linkplain com.tools20022.repository.area.caam.HostToATMRequestV01
 * HostToATMRequestV01}</li>
 * <li>{@linkplain com.tools20022.repository.area.catp.ATMInquiryResponseV01
 * ATMInquiryResponseV01}</li>
 * <li>{@linkplain com.tools20022.repository.area.catp.ATMInquiryRequestV01
 * ATMInquiryRequestV01}</li>
 * <li>{@linkplain com.tools20022.repository.area.catp.ATMCompletionAdviceV01
 * ATMCompletionAdviceV01}</li>
 * <li>{@linkplain com.tools20022.repository.area.catp.ATMWithdrawalResponseV01
 * ATMWithdrawalResponseV01}</li>
 * <li>{@linkplain com.tools20022.repository.area.catp.ATMRejectV01
 * ATMRejectV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMCompletionAcknowledgementV01
 * ATMCompletionAcknowledgementV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMWithdrawalCompletionAdviceV01
 * ATMWithdrawalCompletionAdviceV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMWithdrawalCompletionAcknowledgementV01
 * ATMWithdrawalCompletionAcknowledgementV01}</li>
 * <li>{@linkplain com.tools20022.repository.area.catp.ATMWithdrawalRequestV01
 * ATMWithdrawalRequestV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMPINManagementRequestV01
 * ATMPINManagementRequestV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMPINManagementResponseV01
 * ATMPINManagementResponseV01}</li>
 * <li>{@linkplain com.tools20022.repository.area.caam.ATMDeviceControlV02
 * ATMDeviceControlV02}</li>
 * <li>{@linkplain com.tools20022.repository.area.caam.ATMDeviceReportV02
 * ATMDeviceReportV02}</li>
 * <li>{@linkplain com.tools20022.repository.area.caam.ATMKeyDownloadRequestV02
 * ATMKeyDownloadRequestV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.ATMKeyDownloadResponseV02
 * ATMKeyDownloadResponseV02}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ATM Interface for Transaction Processing and ATM Management - ISO - Previous version"
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Messages that support any card related Automated Teller Machine (ATM) transactions, card related terminal management services and services between an ATM equipment and an ATM acquirer. These services include cash withdrawals, kiosk functions and card account management transactions."
 * </li>
 * </ul>
 */
public class ATMInterfaceforTransactionProcessingandATMManagementISOPreviousversion {

	final static private AtomicReference<MMMessageSet> mmObject_lazy = new AtomicReference<>();

	final static public MMMessageSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageSet() {
			{
				businessProcessCatalogue_lazy = () -> GeneratedRepository.catalogue;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATM Interface for Transaction Processing and ATM Management - ISO - Previous version";
				definition = "Messages that support any card related Automated Teller Machine (ATM) transactions, card related terminal management services and services between an ATM equipment and an ATM acquirer. These services include cash withdrawals, kiosk functions and card account management transactions.";
				messageDefinition_lazy = () -> Arrays.asList(ATMReconciliationAdviceV01.mmObject(), ATMReconciliationAcknowledgementV01.mmObject(), HostToATMAcknowledgementV01.mmObject(), ATMDiagnosticResponseV01.mmObject(),
						ATMDiagnosticRequestV01.mmObject(), HostToATMRequestV01.mmObject(), ATMInquiryResponseV01.mmObject(), ATMInquiryRequestV01.mmObject(), ATMCompletionAdviceV01.mmObject(), ATMWithdrawalResponseV01.mmObject(),
						ATMRejectV01.mmObject(), ATMCompletionAcknowledgementV01.mmObject(), ATMWithdrawalCompletionAdviceV01.mmObject(), ATMWithdrawalCompletionAcknowledgementV01.mmObject(), ATMWithdrawalRequestV01.mmObject(),
						ATMPINManagementRequestV01.mmObject(), ATMPINManagementResponseV01.mmObject(), ATMDeviceControlV02.mmObject(), ATMDeviceReportV02.mmObject(), ATMKeyDownloadRequestV02.mmObject(), ATMKeyDownloadResponseV02.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}