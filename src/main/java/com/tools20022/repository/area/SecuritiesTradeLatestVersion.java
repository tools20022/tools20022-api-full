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
import com.tools20022.repository.area.setr.*;
import com.tools20022.repository.GeneratedRepository;
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
 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationCancellationV01
 * SecuritiesTradeConfirmationCancellationV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationResponseV01
 * SecuritiesTradeConfirmationResponseV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationAmendmentV01
 * RedemptionBulkOrderConfirmationAmendmentV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderConfirmationAmendmentV01
 * RedemptionOrderConfirmationAmendmentV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationAmendmentV01
 * SubscriptionBulkOrderConfirmationAmendmentV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderConfirmationAmendmentV01
 * SubscriptionOrderConfirmationAmendmentV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderConfirmationAmendmentV01
 * SwitchOrderConfirmationAmendmentV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV03
 * SecuritiesTradeConfirmationV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationStatusAdviceV02
 * SecuritiesTradeConfirmationStatusAdviceV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationV04
 * SubscriptionBulkOrderConfirmationV04}</li>
 * <li>{@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderV04
 * RedemptionBulkOrderV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderCancellationRequestV04
 * SubscriptionBulkOrderCancellationRequestV04}</li>
 * <li>{@linkplain com.tools20022.repository.area.setr.RedemptionOrderV04
 * RedemptionOrderV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderCancellationRequestV04
 * SubscriptionOrderCancellationRequestV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationCancellationInstructionV02
 * RedemptionBulkOrderConfirmationCancellationInstructionV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationV04
 * RedemptionBulkOrderConfirmationV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderCancellationRequestV04
 * RedemptionBulkOrderCancellationRequestV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderConfirmationV04
 * SwitchOrderConfirmationV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RequestForOrderStatusReportV04
 * RequestForOrderStatusReportV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderConfirmationV04
 * SubscriptionOrderConfirmationV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderConfirmationCancellationInstructionV02
 * SubscriptionOrderConfirmationCancellationInstructionV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderCancellationRequestV04
 * SwitchOrderCancellationRequestV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.OrderCancellationStatusReportV04
 * OrderCancellationStatusReportV04}</li>
 * <li>{@linkplain com.tools20022.repository.area.setr.SwitchOrderV04
 * SwitchOrderV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderConfirmationCancellationInstructionV02
 * RedemptionOrderConfirmationCancellationInstructionV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderConfirmationV04
 * RedemptionOrderConfirmationV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.OrderInstructionStatusReportV04
 * OrderInstructionStatusReportV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationCancellationInstructionV02
 * SubscriptionBulkOrderConfirmationCancellationInstructionV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderCancellationRequestV04
 * RedemptionOrderCancellationRequestV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RequestForOrderConfirmationStatusReportV02
 * RequestForOrderConfirmationStatusReportV02}</li>
 * <li>{@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderV04
 * SubscriptionBulkOrderV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderConfirmationCancellationInstructionV02
 * SwitchOrderConfirmationCancellationInstructionV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.OrderConfirmationStatusReportV02
 * OrderConfirmationStatusReportV02}</li>
 * <li>{@linkplain com.tools20022.repository.area.setr.SubscriptionOrderV04
 * SubscriptionOrderV04}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelCatalogueEntry#getBusinessProcessCatalogue
 * businessProcessCatalogue} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#catalogue
 * GeneratedRepository.catalogue}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Securities Trade - Latest version - master"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Messages that support trade and post-trade processes for securities, including order to buy or sell, trade execution, affirmation, confirmation, allocation and notification."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
public class SecuritiesTradeLatestVersion {

	final static private AtomicReference<MMBusinessArea> mmObject_lazy = new AtomicReference<>();

	final static public MMBusinessArea mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessArea() {
			{
				businessProcessCatalogue_lazy = () -> GeneratedRepository.catalogue;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Securities Trade - Latest version - master";
				definition = "Messages that support trade and post-trade processes for securities, including order to buy or sell, trade execution, affirmation, confirmation, allocation and notification.";
				code = "setr";
				messageDefinition_lazy = () -> Arrays.asList(SecuritiesTradeConfirmationCancellationV01.mmObject(), SecuritiesTradeConfirmationResponseV01.mmObject(), RedemptionBulkOrderConfirmationAmendmentV01.mmObject(),
						RedemptionOrderConfirmationAmendmentV01.mmObject(), SubscriptionBulkOrderConfirmationAmendmentV01.mmObject(), SubscriptionOrderConfirmationAmendmentV01.mmObject(), SwitchOrderConfirmationAmendmentV01.mmObject(),
						SecuritiesTradeConfirmationV03.mmObject(), SecuritiesTradeConfirmationStatusAdviceV02.mmObject(), SubscriptionBulkOrderConfirmationV04.mmObject(), RedemptionBulkOrderV04.mmObject(),
						SubscriptionBulkOrderCancellationRequestV04.mmObject(), RedemptionOrderV04.mmObject(), SubscriptionOrderCancellationRequestV04.mmObject(), RedemptionBulkOrderConfirmationCancellationInstructionV02.mmObject(),
						RedemptionBulkOrderConfirmationV04.mmObject(), RedemptionBulkOrderCancellationRequestV04.mmObject(), SwitchOrderConfirmationV04.mmObject(), RequestForOrderStatusReportV04.mmObject(),
						SubscriptionOrderConfirmationV04.mmObject(), SubscriptionOrderConfirmationCancellationInstructionV02.mmObject(), SwitchOrderCancellationRequestV04.mmObject(), OrderCancellationStatusReportV04.mmObject(),
						SwitchOrderV04.mmObject(), RedemptionOrderConfirmationCancellationInstructionV02.mmObject(), RedemptionOrderConfirmationV04.mmObject(), OrderInstructionStatusReportV04.mmObject(),
						SubscriptionBulkOrderConfirmationCancellationInstructionV02.mmObject(), RedemptionOrderCancellationRequestV04.mmObject(), RequestForOrderConfirmationStatusReportV02.mmObject(), SubscriptionBulkOrderV04.mmObject(),
						SwitchOrderConfirmationCancellationInstructionV02.mmObject(), OrderConfirmationStatusReportV02.mmObject(), SubscriptionOrderV04.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}