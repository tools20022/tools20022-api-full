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
import com.tools20022.repository.area.trea.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Set of messages used to notify Non Deliverable Forward and Foreign Exchange
 * Option operations (such as creation, valuation, amendment, cancellation) to
 * and from a central settlement system.<br>
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageSet#getMessageDefinition
 * messageDefinition} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.area.trea.StatusNotificationV02
 * StatusNotificationV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.trea.WithdrawalNotificationV01
 * WithdrawalNotificationV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.trea.CreateNonDeliverableForwardOpeningV02
 * CreateNonDeliverableForwardOpeningV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.trea.AmendNonDeliverableForwardOpeningV02
 * AmendNonDeliverableForwardOpeningV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.trea.CancelNonDeliverableForwardOpeningV02
 * CancelNonDeliverableForwardOpeningV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.trea.CreateNonDeliverableForwardValuationV02
 * CreateNonDeliverableForwardValuationV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.trea.AmendNonDeliverableForwardValuationV02
 * AmendNonDeliverableForwardValuationV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.trea.CancelNonDeliverableForwardValuationV02
 * CancelNonDeliverableForwardValuationV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.trea.NonDeliverableForwardNotificationV02
 * NonDeliverableForwardNotificationV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.trea.CreateForeignExchangeOptionV02
 * CreateForeignExchangeOptionV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.trea.AmendForeignExchangeOptionV02
 * AmendForeignExchangeOptionV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.trea.CancelForeignExchangeOptionV02
 * CancelForeignExchangeOptionV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.trea.ForeignExchangeOptionNotificationV02
 * ForeignExchangeOptionNotificationV02}</li>
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
 * "Forex Notifications - ISO - Archive"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Set of messages used to notify Non Deliverable Forward and Foreign Exchange Option operations (such as creation, valuation, amendment, cancellation) to and from a central settlement system.\r\n"
 * </li>
 * </ul>
 */
public class ForexNotificationsISOArchive {

	final static private AtomicReference<MMMessageSet> mmObject_lazy = new AtomicReference<>();

	final static public MMMessageSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageSet() {
			{
				businessProcessCatalogue_lazy = () -> GeneratedRepository.mmcatalogue;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Forex Notifications - ISO - Archive";
				definition = "Set of messages used to notify Non Deliverable Forward and Foreign Exchange Option operations (such as creation, valuation, amendment, cancellation) to and from a central settlement system.\r\n";
				messageDefinition_lazy = () -> Arrays.asList(StatusNotificationV02.mmObject(), WithdrawalNotificationV01.mmObject(), CreateNonDeliverableForwardOpeningV02.mmObject(), AmendNonDeliverableForwardOpeningV02.mmObject(),
						CancelNonDeliverableForwardOpeningV02.mmObject(), CreateNonDeliverableForwardValuationV02.mmObject(), AmendNonDeliverableForwardValuationV02.mmObject(), CancelNonDeliverableForwardValuationV02.mmObject(),
						NonDeliverableForwardNotificationV02.mmObject(), CreateForeignExchangeOptionV02.mmObject(), AmendForeignExchangeOptionV02.mmObject(), CancelForeignExchangeOptionV02.mmObject(),
						ForeignExchangeOptionNotificationV02.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}