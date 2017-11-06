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
import com.tools20022.repository.area.pain.CustomerCreditTransferInitiationV07;
import com.tools20022.repository.area.pain.CustomerDirectDebitInitiationV06;
import com.tools20022.repository.area.pain.CustomerPaymentReversalV06;
import com.tools20022.repository.area.pain.CustomerPaymentStatusReportV07;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Set of messages exchanged between a debtor (or buyer) and its bank or between
 * a creditor (or seller) and its bank to initiate, collect, manage and monitor
 * payments.<br>
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageSet#getMessageDefinition
 * messageDefinition} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.CustomerCreditTransferInitiationV07
 * CustomerCreditTransferInitiationV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.CustomerPaymentReversalV06
 * CustomerPaymentReversalV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.CustomerDirectDebitInitiationV06
 * CustomerDirectDebitInitiationV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.CustomerPaymentStatusReportV07
 * CustomerPaymentStatusReportV07}</li>
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
 * "Payments Initiation - ISO - Previous version"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Set of messages exchanged between a debtor (or buyer) and its bank or between a creditor (or seller) and its bank to initiate, collect, manage and monitor payments.\r\n"
 * </li>
 * </ul>
 */
public class PaymentsInitiationISOPreviousversion {

	final static private AtomicReference<MMMessageSet> mmObject_lazy = new AtomicReference<>();

	final static public MMMessageSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageSet() {
			{
				businessProcessCatalogue_lazy = () -> com.tools20022.repository.GeneratedRepository.mmcatalogue;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "Payments Initiation - ISO - Previous version";
				definition = "Set of messages exchanged between a debtor (or buyer) and its bank or between a creditor (or seller) and its bank to initiate, collect, manage and monitor payments.\r\n";
				messageDefinition_lazy = () -> Arrays.asList(CustomerCreditTransferInitiationV07.mmObject(), CustomerPaymentReversalV06.mmObject(), CustomerDirectDebitInitiationV06.mmObject(), CustomerPaymentStatusReportV07.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}