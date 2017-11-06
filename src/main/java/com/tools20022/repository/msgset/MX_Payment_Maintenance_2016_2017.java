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
import com.tools20022.repository.area.camt.*;
import com.tools20022.repository.area.pacs.FIToFICustomerDirectDebitV07;
import com.tools20022.repository.area.pacs.FIToFIPaymentReversalV07;
import com.tools20022.repository.area.pacs.FIToFIPaymentStatusReportV08;
import com.tools20022.repository.area.pacs.PaymentReturnV07;
import com.tools20022.repository.area.pain.*;
import com.tools20022.repository.area.remt.RemittanceAdviceV03;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Message set define for the ISO 20022 2016/2017 maintenance of the Payments
 * message definitions.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageSet#getMessageDefinition
 * messageDefinition} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.MandateAcceptanceReportV05
 * MandateAcceptanceReportV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.MandateAmendmentRequestV05
 * MandateAmendmentRequestV05}</li>
 * <li>{@linkplain com.tools20022.repository.area.camt.UnableToApplyV05
 * UnableToApplyV05}</li>
 * <li>{@linkplain com.tools20022.repository.area.pacs.PaymentReturnV07
 * PaymentReturnV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.MandateInitiationRequestV05
 * MandateInitiationRequestV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentStatusReportV08
 * FIToFIPaymentStatusReportV08}</li>
 * <li>{@linkplain com.tools20022.repository.area.remt.RemittanceAdviceV03
 * RemittanceAdviceV03}</li>
 * <li>{@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentReversalV07
 * FIToFIPaymentReversalV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.CustomerPaymentCancellationRequestV06
 * CustomerPaymentCancellationRequestV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.AdditionalPaymentInformationV07
 * AdditionalPaymentInformationV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ResolutionOfInvestigationV07
 * ResolutionOfInvestigationV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.FIToFICustomerDirectDebitV07
 * FIToFICustomerDirectDebitV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.CustomerCreditTransferInitiationV08
 * CustomerCreditTransferInitiationV08}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FIToFIPaymentCancellationRequestV06
 * FIToFIPaymentCancellationRequestV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.MandateCancellationRequestV05
 * MandateCancellationRequestV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.CustomerDirectDebitInitiationV07
 * CustomerDirectDebitInitiationV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.DebitAuthorisationRequestV05
 * DebitAuthorisationRequestV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.CreditorPaymentActivationRequestStatusReportV06
 * CreditorPaymentActivationRequestStatusReportV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.CustomerPaymentStatusReportV08
 * CustomerPaymentStatusReportV08}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.CreditorPaymentActivationRequestV06
 * CreditorPaymentActivationRequestV06}</li>
 * <li>{@linkplain com.tools20022.repository.area.camt.ClaimNonReceiptV05
 * ClaimNonReceiptV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.RequestToModifyPaymentV04
 * RequestToModifyPaymentV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.CustomerPaymentReversalV07
 * CustomerPaymentReversalV07}</li>
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
 * "MX_Payment_Maintenance_2016_2017"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Message set define for the ISO 20022 2016/2017 maintenance of the Payments message definitions."
 * </li>
 * </ul>
 */
public class MX_Payment_Maintenance_2016_2017 {

	final static private AtomicReference<MMMessageSet> mmObject_lazy = new AtomicReference<>();

	final static public MMMessageSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageSet() {
			{
				businessProcessCatalogue_lazy = () -> com.tools20022.repository.GeneratedRepository.mmcatalogue;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "MX_Payment_Maintenance_2016_2017";
				definition = "Message set define for the ISO 20022 2016/2017 maintenance of the Payments message definitions.";
				messageDefinition_lazy = () -> Arrays.asList(MandateAcceptanceReportV05.mmObject(), MandateAmendmentRequestV05.mmObject(), UnableToApplyV05.mmObject(), PaymentReturnV07.mmObject(), MandateInitiationRequestV05.mmObject(),
						FIToFIPaymentStatusReportV08.mmObject(), RemittanceAdviceV03.mmObject(), FIToFIPaymentReversalV07.mmObject(), CustomerPaymentCancellationRequestV06.mmObject(), AdditionalPaymentInformationV07.mmObject(),
						ResolutionOfInvestigationV07.mmObject(), FIToFICustomerDirectDebitV07.mmObject(), CustomerCreditTransferInitiationV08.mmObject(), FIToFIPaymentCancellationRequestV06.mmObject(),
						MandateCancellationRequestV05.mmObject(), CustomerDirectDebitInitiationV07.mmObject(), DebitAuthorisationRequestV05.mmObject(), CreditorPaymentActivationRequestStatusReportV06.mmObject(),
						CustomerPaymentStatusReportV08.mmObject(), CreditorPaymentActivationRequestV06.mmObject(), ClaimNonReceiptV05.mmObject(), RequestToModifyPaymentV04.mmObject(), CustomerPaymentReversalV07.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}