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
import com.tools20022.repository.area.pain.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Messages that support the initiation of a payment from the ordering customer
 * to a financial institution that services a cash account and reporting its
 * status.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessArea#getCode code} =
 * "pain"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessArea#getMessageDefinition
 * messageDefinition} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.CustomerCreditTransferInitiationV02
 * CustomerCreditTransferInitiationV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.CustomerCreditTransferInitiationV03
 * CustomerCreditTransferInitiationV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.CustomerCreditTransferInitiationV04
 * CustomerCreditTransferInitiationV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.CustomerCreditTransferInitiationV05
 * CustomerCreditTransferInitiationV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.CustomerDirectDebitInitiationV01
 * CustomerDirectDebitInitiationV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.CustomerDirectDebitInitiationV02
 * CustomerDirectDebitInitiationV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.CustomerDirectDebitInitiationV03
 * CustomerDirectDebitInitiationV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.CustomerDirectDebitInitiationV04
 * CustomerDirectDebitInitiationV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.PaymentCancellationRequestV01
 * PaymentCancellationRequestV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.CustomerPaymentReversalV01
 * CustomerPaymentReversalV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.CustomerPaymentReversalV02
 * CustomerPaymentReversalV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.CustomerPaymentReversalV03
 * CustomerPaymentReversalV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.CustomerPaymentReversalV04
 * CustomerPaymentReversalV04}</li>
 * <li>{@linkplain com.tools20022.repository.area.pain.PaymentStatusReportV02
 * PaymentStatusReportV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.CustomerPaymentStatusReportV03
 * CustomerPaymentStatusReportV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.CustomerPaymentStatusReportV04
 * CustomerPaymentStatusReportV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.CustomerPaymentStatusReportV05
 * CustomerPaymentStatusReportV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.MandateAcceptanceReportV01
 * MandateAcceptanceReportV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.MandateAcceptanceReportV02
 * MandateAcceptanceReportV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.MandateAcceptanceReportV03
 * MandateAcceptanceReportV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.MandateAmendmentRequestV01
 * MandateAmendmentRequestV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.MandateAmendmentRequestV02
 * MandateAmendmentRequestV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.MandateAmendmentRequestV03
 * MandateAmendmentRequestV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.MandateCancellationRequestV01
 * MandateCancellationRequestV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.MandateCancellationRequestV02
 * MandateCancellationRequestV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.MandateCancellationRequestV03
 * MandateCancellationRequestV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.MandateInitiationRequestV01
 * MandateInitiationRequestV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.MandateInitiationRequestV02
 * MandateInitiationRequestV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.MandateInitiationRequestV03
 * MandateInitiationRequestV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.CreditorPaymentActivationRequestStatusReportV01
 * CreditorPaymentActivationRequestStatusReportV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.CreditorPaymentActivationRequestStatusReportV02
 * CreditorPaymentActivationRequestStatusReportV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.CreditorPaymentActivationRequestStatusReportV03
 * CreditorPaymentActivationRequestStatusReportV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.CreditorPaymentActivationRequestV01
 * CreditorPaymentActivationRequestV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.CreditorPaymentActivationRequestV02
 * CreditorPaymentActivationRequestV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.CreditorPaymentActivationRequestV03
 * CreditorPaymentActivationRequestV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.CustomerPaymentReversalV05
 * CustomerPaymentReversalV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.CustomerCreditTransferInitiationV06
 * CustomerCreditTransferInitiationV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.CustomerPaymentStatusReportV06
 * CustomerPaymentStatusReportV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.CustomerDirectDebitInitiationV05
 * CustomerDirectDebitInitiationV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.CreditorPaymentActivationRequestStatusReportV04
 * CreditorPaymentActivationRequestStatusReportV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.CreditorPaymentActivationRequestV04
 * CreditorPaymentActivationRequestV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.CustomerPaymentReversalV06
 * CustomerPaymentReversalV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.CustomerPaymentStatusReportV07
 * CustomerPaymentStatusReportV07}</li>
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
 * "Payments Initiation - Archive - master"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Messages that support the initiation of a payment from the ordering customer to a financial institution that services a cash account and reporting its status."
 * </li>
 * </ul>
 */
public class PaymentsInitiationArchive {

	final static private AtomicReference<MMBusinessArea> mmObject_lazy = new AtomicReference<>();

	final static public MMBusinessArea mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessArea() {
			{
				businessProcessCatalogue_lazy = () -> GeneratedRepository.catalogue;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "Payments Initiation - Archive - master";
				definition = "Messages that support the initiation of a payment from the ordering customer to a financial institution that services a cash account and reporting its status.";
				code = "pain";
				messageDefinition_lazy = () -> Arrays.asList(CustomerCreditTransferInitiationV02.mmObject(), CustomerCreditTransferInitiationV03.mmObject(), CustomerCreditTransferInitiationV04.mmObject(),
						CustomerCreditTransferInitiationV05.mmObject(), CustomerDirectDebitInitiationV01.mmObject(), CustomerDirectDebitInitiationV02.mmObject(), CustomerDirectDebitInitiationV03.mmObject(),
						CustomerDirectDebitInitiationV04.mmObject(), PaymentCancellationRequestV01.mmObject(), CustomerPaymentReversalV01.mmObject(), CustomerPaymentReversalV02.mmObject(), CustomerPaymentReversalV03.mmObject(),
						CustomerPaymentReversalV04.mmObject(), PaymentStatusReportV02.mmObject(), CustomerPaymentStatusReportV03.mmObject(), CustomerPaymentStatusReportV04.mmObject(), CustomerPaymentStatusReportV05.mmObject(),
						MandateAcceptanceReportV01.mmObject(), MandateAcceptanceReportV02.mmObject(), MandateAcceptanceReportV03.mmObject(), MandateAmendmentRequestV01.mmObject(), MandateAmendmentRequestV02.mmObject(),
						MandateAmendmentRequestV03.mmObject(), MandateCancellationRequestV01.mmObject(), MandateCancellationRequestV02.mmObject(), MandateCancellationRequestV03.mmObject(), MandateInitiationRequestV01.mmObject(),
						MandateInitiationRequestV02.mmObject(), MandateInitiationRequestV03.mmObject(), CreditorPaymentActivationRequestStatusReportV01.mmObject(), CreditorPaymentActivationRequestStatusReportV02.mmObject(),
						CreditorPaymentActivationRequestStatusReportV03.mmObject(), CreditorPaymentActivationRequestV01.mmObject(), CreditorPaymentActivationRequestV02.mmObject(), CreditorPaymentActivationRequestV03.mmObject(),
						CustomerPaymentReversalV05.mmObject(), CustomerCreditTransferInitiationV06.mmObject(), CustomerPaymentStatusReportV06.mmObject(), CustomerDirectDebitInitiationV05.mmObject(),
						CreditorPaymentActivationRequestStatusReportV04.mmObject(), CreditorPaymentActivationRequestV04.mmObject(), CustomerPaymentReversalV06.mmObject(), CustomerPaymentStatusReportV07.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}