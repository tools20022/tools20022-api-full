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
import com.tools20022.repository.area.tsin.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Messages that support the request for a trade service, including any related
 * application, instruction, request, acknowledgement or advice.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessArea#getCode code} =
 * "tsin"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessArea#getMessageDefinition
 * messageDefinition} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsin.UndertakingApplicationV01
 * UndertakingApplicationV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsin.InvoiceFinancingRequestV01
 * InvoiceFinancingRequestV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsin.InvoiceFinancingRequestStatusV01
 * InvoiceFinancingRequestStatusV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsin.InvoiceFinancingCancellationRequestV01
 * InvoiceFinancingCancellationRequestV01}</li>
 * <li>{@linkplain com.tools20022.repository.area.tsin.FinancialInvoiceV01
 * FinancialInvoiceV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsin.InvoiceAssignmentRequestV01
 * InvoiceAssignmentRequestV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsin.PartyRegistrationAndGuaranteeAcknowledgementV01
 * PartyRegistrationAndGuaranteeAcknowledgementV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsin.PartyRegistrationAndGuaranteeStatusV01
 * PartyRegistrationAndGuaranteeStatusV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsin.PartyRegistrationAndGuaranteeNotificationV01
 * PartyRegistrationAndGuaranteeNotificationV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsin.InvoiceAssignmentNotificationV01
 * InvoiceAssignmentNotificationV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsin.InvoiceAssignmentAcknowledgementV01
 * InvoiceAssignmentAcknowledgementV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsin.InvoiceAssignmentStatusV01
 * InvoiceAssignmentStatusV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsin.PartyRegistrationAndGuaranteeRequestV01
 * PartyRegistrationAndGuaranteeRequestV01}</li>
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
 * "Trade Services Initiation - Latest version - master"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Messages that support the request for a trade service, including any related application, instruction, request, acknowledgement or advice."
 * </li>
 * </ul>
 */
public class TradeServicesInitiationLatestVersion {

	final static private AtomicReference<MMBusinessArea> mmObject_lazy = new AtomicReference<>();

	final static public MMBusinessArea mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessArea() {
			{
				businessProcessCatalogue_lazy = () -> GeneratedRepository.catalogue;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "Trade Services Initiation - Latest version - master";
				definition = "Messages that support the request for a trade service, including any related application, instruction, request, acknowledgement or advice.";
				messageDefinition_lazy = () -> Arrays.asList(UndertakingApplicationV01.mmObject(), InvoiceFinancingRequestV01.mmObject(), InvoiceFinancingRequestStatusV01.mmObject(), InvoiceFinancingCancellationRequestV01.mmObject(),
						FinancialInvoiceV01.mmObject(), InvoiceAssignmentRequestV01.mmObject(), PartyRegistrationAndGuaranteeAcknowledgementV01.mmObject(), PartyRegistrationAndGuaranteeStatusV01.mmObject(),
						PartyRegistrationAndGuaranteeNotificationV01.mmObject(), InvoiceAssignmentNotificationV01.mmObject(), InvoiceAssignmentAcknowledgementV01.mmObject(), InvoiceAssignmentStatusV01.mmObject(),
						PartyRegistrationAndGuaranteeRequestV01.mmObject());
				code = "tsin";
			}
		});
		return mmObject_lazy.get();
	}
}