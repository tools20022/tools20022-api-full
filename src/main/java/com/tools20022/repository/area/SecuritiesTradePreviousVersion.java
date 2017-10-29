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
import com.tools20022.repository.area.setr.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Messages that support trade and post-trade processes for securities,
 * including order to buy or sell, trade execution, affirmation, confirmation,
 * allocation and notification.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessArea#getCode code} =
 * "setr"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessArea#getMessageDefinition
 * messageDefinition} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationStatusAdviceV01
 * SecuritiesTradeConfirmationStatusAdviceV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV02
 * SecuritiesTradeConfirmationV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.OrderCancellationStatusReportV03
 * OrderCancellationStatusReportV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.OrderConfirmationStatusReportV01
 * OrderConfirmationStatusReportV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.OrderInstructionStatusReportV03
 * OrderInstructionStatusReportV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderCancellationRequestV03
 * RedemptionBulkOrderCancellationRequestV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationCancellationInstructionV01
 * RedemptionBulkOrderConfirmationCancellationInstructionV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationV03
 * RedemptionBulkOrderConfirmationV03}</li>
 * <li>{@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderV03
 * RedemptionBulkOrderV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderCancellationRequestV03
 * RedemptionOrderCancellationRequestV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderConfirmationCancellationInstructionV01
 * RedemptionOrderConfirmationCancellationInstructionV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderConfirmationV03
 * RedemptionOrderConfirmationV03}</li>
 * <li>{@linkplain com.tools20022.repository.area.setr.RedemptionOrderV03
 * RedemptionOrderV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RequestForOrderConfirmationStatusReportV01
 * RequestForOrderConfirmationStatusReportV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RequestForOrderStatusReportV03
 * RequestForOrderStatusReportV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderCancellationRequestV03
 * SubscriptionBulkOrderCancellationRequestV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationCancellationInstructionV01
 * SubscriptionBulkOrderConfirmationCancellationInstructionV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationV03
 * SubscriptionBulkOrderConfirmationV03}</li>
 * <li>{@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderV03
 * SubscriptionBulkOrderV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderCancellationRequestV03
 * SubscriptionOrderCancellationRequestV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderConfirmationCancellationInstructionV01
 * SubscriptionOrderConfirmationCancellationInstructionV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderConfirmationV03
 * SubscriptionOrderConfirmationV03}</li>
 * <li>{@linkplain com.tools20022.repository.area.setr.SubscriptionOrderV03
 * SubscriptionOrderV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderCancellationRequestV03
 * SwitchOrderCancellationRequestV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderConfirmationCancellationInstructionV01
 * SwitchOrderConfirmationCancellationInstructionV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderConfirmationV03
 * SwitchOrderConfirmationV03}</li>
 * <li>{@linkplain com.tools20022.repository.area.setr.SwitchOrderV03
 * SwitchOrderV03}</li>
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
 * "Securities Trade - Previous version - master"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Messages that support trade and post-trade processes for securities, including order to buy or sell, trade execution, affirmation, confirmation, allocation and notification."
 * </li>
 * </ul>
 */
public class SecuritiesTradePreviousVersion {

	final static private AtomicReference<MMBusinessArea> mmObject_lazy = new AtomicReference<>();

	final static public MMBusinessArea mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessArea() {
			{
				businessProcessCatalogue_lazy = () -> com.tools20022.repository.GeneratedRepository.catalogue;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "Securities Trade - Previous version - master";
				definition = "Messages that support trade and post-trade processes for securities, including order to buy or sell, trade execution, affirmation, confirmation, allocation and notification.";
				messageDefinition_lazy = () -> Arrays.asList(SecuritiesTradeConfirmationStatusAdviceV01.mmObject(), SecuritiesTradeConfirmationV02.mmObject(), OrderCancellationStatusReportV03.mmObject(),
						OrderConfirmationStatusReportV01.mmObject(), OrderInstructionStatusReportV03.mmObject(), RedemptionBulkOrderCancellationRequestV03.mmObject(), RedemptionBulkOrderConfirmationCancellationInstructionV01.mmObject(),
						RedemptionBulkOrderConfirmationV03.mmObject(), RedemptionBulkOrderV03.mmObject(), RedemptionOrderCancellationRequestV03.mmObject(), RedemptionOrderConfirmationCancellationInstructionV01.mmObject(),
						RedemptionOrderConfirmationV03.mmObject(), RedemptionOrderV03.mmObject(), RequestForOrderConfirmationStatusReportV01.mmObject(), RequestForOrderStatusReportV03.mmObject(),
						SubscriptionBulkOrderCancellationRequestV03.mmObject(), SubscriptionBulkOrderConfirmationCancellationInstructionV01.mmObject(), SubscriptionBulkOrderConfirmationV03.mmObject(), SubscriptionBulkOrderV03.mmObject(),
						SubscriptionOrderCancellationRequestV03.mmObject(), SubscriptionOrderConfirmationCancellationInstructionV01.mmObject(), SubscriptionOrderConfirmationV03.mmObject(), SubscriptionOrderV03.mmObject(),
						SwitchOrderCancellationRequestV03.mmObject(), SwitchOrderConfirmationCancellationInstructionV01.mmObject(), SwitchOrderConfirmationV03.mmObject(), SwitchOrderV03.mmObject());
				code = "setr";
			}
		});
		return mmObject_lazy.get();
	}
}