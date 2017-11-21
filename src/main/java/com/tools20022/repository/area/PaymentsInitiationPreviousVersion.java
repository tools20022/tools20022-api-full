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
 * status
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessArea#getCode code} =
 * "pain"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessArea#getMessageDefinition
 * messageDefinition} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.MandateAmendmentRequestV04
 * MandateAmendmentRequestV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.MandateCancellationRequestV04
 * MandateCancellationRequestV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.MandateAcceptanceReportV04
 * MandateAcceptanceReportV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.MandateInitiationRequestV04
 * MandateInitiationRequestV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.CustomerCreditTransferInitiationV07
 * CustomerCreditTransferInitiationV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.CreditorPaymentActivationRequestV05
 * CreditorPaymentActivationRequestV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.CustomerPaymentReversalV06
 * CustomerPaymentReversalV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.CustomerDirectDebitInitiationV06
 * CustomerDirectDebitInitiationV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.CustomerPaymentStatusReportV07
 * CustomerPaymentStatusReportV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.CreditorPaymentActivationRequestStatusReportV05
 * CreditorPaymentActivationRequestStatusReportV05}</li>
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
 * "Payments Initiation - Previous version - master"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Messages that support the initiation of a payment from the ordering customer to a financial institution that services a cash account and reporting its status"
 * </li>
 * </ul>
 */
public class PaymentsInitiationPreviousVersion {

	final static private AtomicReference<MMBusinessArea> mmObject_lazy = new AtomicReference<>();

	final static public MMBusinessArea mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessArea() {
			{
				businessProcessCatalogue_lazy = () -> GeneratedRepository.mmcatalogue;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "Payments Initiation - Previous version - master";
				definition = "Messages that support the initiation of a payment from the ordering customer to a financial institution that services a cash account and reporting its status";
				messageDefinition_lazy = () -> Arrays.asList(MandateAmendmentRequestV04.mmObject(), MandateCancellationRequestV04.mmObject(), MandateAcceptanceReportV04.mmObject(), MandateInitiationRequestV04.mmObject(),
						CustomerCreditTransferInitiationV07.mmObject(), CreditorPaymentActivationRequestV05.mmObject(), CustomerPaymentReversalV06.mmObject(), CustomerDirectDebitInitiationV06.mmObject(),
						CustomerPaymentStatusReportV07.mmObject(), CreditorPaymentActivationRequestStatusReportV05.mmObject());
				code = "pain";
			}
		});
		return mmObject_lazy.get();
	}
}