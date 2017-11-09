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
import com.tools20022.repository.area.camt.NotificationToReceiveCancellationAdviceV04;
import com.tools20022.repository.area.camt.NotificationToReceiveStatusReportV04;
import com.tools20022.repository.area.camt.NotificationToReceiveV04;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Set of messages that allows an account owner or a party acting on its behalf
 * to advise an account servicing institution that it will receive funds to be
 * credited to the account of the account owner, cancel such an advice and
 * receive a report on the status of the receipt of funds.<br>
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageSet#getMessageDefinition
 * messageDefinition} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.NotificationToReceiveCancellationAdviceV04
 * NotificationToReceiveCancellationAdviceV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.NotificationToReceiveStatusReportV04
 * NotificationToReceiveStatusReportV04}</li>
 * <li>{@linkplain com.tools20022.repository.area.camt.NotificationToReceiveV04
 * NotificationToReceiveV04}</li>
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
 * "Notification to Receive  - ISO - Previous version"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Set of messages that allows an account owner or a party acting on its behalf to advise an account servicing institution that it will receive funds to be credited to the account of the account owner, cancel such an advice and receive a report on the status of the receipt of funds.\r\n"
 * </li>
 * </ul>
 */
public class NotificationtoReceiveISOPreviousversion {

	final static private AtomicReference<MMMessageSet> mmObject_lazy = new AtomicReference<>();

	final static public MMMessageSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageSet() {
			{
				businessProcessCatalogue_lazy = () -> GeneratedRepository.mmcatalogue;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "Notification to Receive  - ISO - Previous version";
				definition = "Set of messages that allows an account owner or a party acting on its behalf to advise an account servicing institution that it will receive funds to be credited to the account of the account owner, cancel such an advice and receive a report on the status of the receipt of funds.\r\n";
				messageDefinition_lazy = () -> Arrays.asList(NotificationToReceiveCancellationAdviceV04.mmObject(), NotificationToReceiveStatusReportV04.mmObject(), NotificationToReceiveV04.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}