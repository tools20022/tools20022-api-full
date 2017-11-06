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
import com.tools20022.repository.area.tsin.*;
import com.tools20022.repository.area.tsmt.InvoicePaymentReconciliationAdviceV01;
import com.tools20022.repository.area.tsmt.InvoicePaymentReconciliationStatusV01;
import com.tools20022.repository.area.tsmt.PartyEventAdviceV01;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Set of messages enabling entities involved in factoring transactions to
 * operate dematerialized services such as invoice discounting, full factoring,
 * with recourse or without recourse, reverse factoring, etc. The message set
 * covers party, account and guarantee management, invoice assignment and
 * payment reconciliation. The messages represent formal business letters and
 * can be secured in order to be compliant with legal requirements.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageSet#getMessageDefinition
 * messageDefinition} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.InvoicePaymentReconciliationAdviceV01
 * InvoicePaymentReconciliationAdviceV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsin.InvoiceAssignmentRequestV01
 * InvoiceAssignmentRequestV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsin.PartyRegistrationAndGuaranteeAcknowledgementV01
 * PartyRegistrationAndGuaranteeAcknowledgementV01}</li>
 * <li>{@linkplain com.tools20022.repository.area.tsmt.PartyEventAdviceV01
 * PartyEventAdviceV01}</li>
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
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.InvoicePaymentReconciliationStatusV01
 * InvoicePaymentReconciliationStatusV01}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FactoringServices - ISO - Latest version"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Set of messages enabling entities involved in factoring transactions to operate dematerialized services such as invoice discounting, full factoring, with recourse or without recourse, reverse factoring, etc. The message set covers party, account and guarantee management, invoice assignment and payment reconciliation. The messages represent formal business letters and can be secured in order to be compliant with legal requirements."
 * </li>
 * </ul>
 */
public class FactoringServicesISOLatestversion {

	final static private AtomicReference<MMMessageSet> mmObject_lazy = new AtomicReference<>();

	final static public MMMessageSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageSet() {
			{
				businessProcessCatalogue_lazy = () -> com.tools20022.repository.GeneratedRepository.mmcatalogue;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "FactoringServices - ISO - Latest version";
				definition = "Set of messages enabling entities involved in factoring transactions to operate dematerialized services such as invoice discounting, full factoring, with recourse or without recourse, reverse factoring, etc. The message set covers party, account and guarantee management, invoice assignment and payment reconciliation. The messages represent formal business letters and can be secured in order to be compliant with legal requirements.";
				messageDefinition_lazy = () -> Arrays.asList(InvoicePaymentReconciliationAdviceV01.mmObject(), InvoiceAssignmentRequestV01.mmObject(), PartyRegistrationAndGuaranteeAcknowledgementV01.mmObject(),
						PartyEventAdviceV01.mmObject(), PartyRegistrationAndGuaranteeStatusV01.mmObject(), PartyRegistrationAndGuaranteeNotificationV01.mmObject(), InvoiceAssignmentNotificationV01.mmObject(),
						InvoiceAssignmentAcknowledgementV01.mmObject(), InvoiceAssignmentStatusV01.mmObject(), PartyRegistrationAndGuaranteeRequestV01.mmObject(), InvoicePaymentReconciliationStatusV01.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}