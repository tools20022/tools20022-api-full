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
import com.tools20022.repository.area.fxtr.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * This message set covers the post-trade processing in the foreign exchange
 * trade domain together with cash management and administration messages to
 * support the associated netting, payments processing and notification of
 * system events.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageSet#getMessageDefinition
 * messageDefinition} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeInstructionV04
 * ForeignExchangeTradeInstructionV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeStatusNotificationV06
 * ForeignExchangeTradeStatusNotificationV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeInstructionCancellationV04
 * ForeignExchangeTradeInstructionCancellationV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeInstructionAmendmentV04
 * ForeignExchangeTradeInstructionAmendmentV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeStatusAndDetailsNotificationV04
 * ForeignExchangeTradeStatusAndDetailsNotificationV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeBulkStatusNotificationV04
 * ForeignExchangeTradeBulkStatusNotificationV04}</li>
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
 * "Post-Trade Foreign Exchange - Maintenance 2016 - 2017"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "This message set covers the post-trade processing in the foreign exchange trade domain together with cash management and administration messages to support the associated netting, payments processing and notification of system events."
 * </li>
 * </ul>
 */
public class PostTradeForeignExchangeMaintenance20162017 {

	final static private AtomicReference<MMMessageSet> mmObject_lazy = new AtomicReference<>();

	final static public MMMessageSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageSet() {
			{
				businessProcessCatalogue_lazy = () -> GeneratedRepository.catalogue;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Post-Trade Foreign Exchange - Maintenance 2016 - 2017";
				definition = "This message set covers the post-trade processing in the foreign exchange trade domain together with cash management and administration messages to support the associated netting, payments processing and notification of system events.";
				messageDefinition_lazy = () -> Arrays.asList(ForeignExchangeTradeInstructionV04.mmObject(), ForeignExchangeTradeStatusNotificationV06.mmObject(), ForeignExchangeTradeInstructionCancellationV04.mmObject(),
						ForeignExchangeTradeInstructionAmendmentV04.mmObject(), ForeignExchangeTradeStatusAndDetailsNotificationV04.mmObject(), ForeignExchangeTradeBulkStatusNotificationV04.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}