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
import com.tools20022.repository.area.pain.MandateAcceptanceReportV04;
import com.tools20022.repository.area.pain.MandateAmendmentRequestV04;
import com.tools20022.repository.area.pain.MandateCancellationRequestV04;
import com.tools20022.repository.area.pain.MandateInitiationRequestV04;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Set of messages to support the direct debit instructions and electronic
 * mandate related information and to cater for the initiation, amendment and
 * cancellation of the mandate in the customer-to-bank and interbank space. <br>
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageSet#getMessageDefinition
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
 * "Payments Mandates - ISO - Previous version"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Set of messages to support the direct debit instructions and electronic mandate related information and to cater for the initiation, amendment and cancellation of the mandate in the customer-to-bank and interbank space. \r\n"
 * </li>
 * </ul>
 */
public class PaymentsMandatesISOPreviousversion {

	final static private AtomicReference<MMMessageSet> mmObject_lazy = new AtomicReference<>();

	final static public MMMessageSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageSet() {
			{
				businessProcessCatalogue_lazy = () -> GeneratedRepository.catalogue;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Payments Mandates - ISO - Previous version";
				definition = "Set of messages to support the direct debit instructions and electronic mandate related information and to cater for the initiation, amendment and cancellation of the mandate in the customer-to-bank and interbank space. \r\n";
				messageDefinition_lazy = () -> Arrays.asList(MandateAmendmentRequestV04.mmObject(), MandateCancellationRequestV04.mmObject(), MandateAcceptanceReportV04.mmObject(), MandateInitiationRequestV04.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}