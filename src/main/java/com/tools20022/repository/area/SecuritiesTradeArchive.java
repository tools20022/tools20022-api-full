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
 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV01
 * SecuritiesTradeConfirmationV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.OrderCancellationStatusReportV02
 * OrderCancellationStatusReportV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.OrderInstructionStatusReportV02
 * OrderInstructionStatusReportV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderCancellationInstructionV02
 * RedemptionBulkOrderCancellationInstructionV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationV02
 * RedemptionBulkOrderConfirmationV02}</li>
 * <li>{@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderV02
 * RedemptionBulkOrderV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionMultipleOrderCancellationInstructionV02
 * RedemptionMultipleOrderCancellationInstructionV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionMultipleOrderConfirmationV02
 * RedemptionMultipleOrderConfirmationV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionMultipleOrderV02
 * RedemptionMultipleOrderV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RequestForOrderStatusReportV02
 * RequestForOrderStatusReportV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderCancellationInstructionV02
 * SubscriptionBulkOrderCancellationInstructionV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationV02
 * SubscriptionBulkOrderConfirmationV02}</li>
 * <li>{@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderV02
 * SubscriptionBulkOrderV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionMultipleOrderCancellationInstructionV02
 * SubscriptionMultipleOrderCancellationInstructionV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionMultipleOrderConfirmationV02
 * SubscriptionMultipleOrderConfirmationV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionMultipleOrderV02
 * SubscriptionMultipleOrderV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderCancellationInstructionV02
 * SwitchOrderCancellationInstructionV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderConfirmationV02
 * SwitchOrderConfirmationV02}</li>
 * <li>{@linkplain com.tools20022.repository.area.setr.SwitchOrderV02
 * SwitchOrderV02}</li>
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
 * "Securities Trade - Archive - master"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Messages that support trade and post-trade processes for securities, including order to buy or sell, trade execution, affirmation, confirmation, allocation and notification."
 * </li>
 * </ul>
 */
public class SecuritiesTradeArchive {

	final static private AtomicReference<MMBusinessArea> mmObject_lazy = new AtomicReference<>();

	final static public MMBusinessArea mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessArea() {
			{
				businessProcessCatalogue_lazy = () -> GeneratedRepository.catalogue;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "Securities Trade - Archive - master";
				definition = "Messages that support trade and post-trade processes for securities, including order to buy or sell, trade execution, affirmation, confirmation, allocation and notification.";
				messageDefinition_lazy = () -> Arrays.asList(SecuritiesTradeConfirmationV01.mmObject(), OrderCancellationStatusReportV02.mmObject(), OrderInstructionStatusReportV02.mmObject(),
						RedemptionBulkOrderCancellationInstructionV02.mmObject(), RedemptionBulkOrderConfirmationV02.mmObject(), RedemptionBulkOrderV02.mmObject(), RedemptionMultipleOrderCancellationInstructionV02.mmObject(),
						RedemptionMultipleOrderConfirmationV02.mmObject(), RedemptionMultipleOrderV02.mmObject(), RequestForOrderStatusReportV02.mmObject(), SubscriptionBulkOrderCancellationInstructionV02.mmObject(),
						SubscriptionBulkOrderConfirmationV02.mmObject(), SubscriptionBulkOrderV02.mmObject(), SubscriptionMultipleOrderCancellationInstructionV02.mmObject(), SubscriptionMultipleOrderConfirmationV02.mmObject(),
						SubscriptionMultipleOrderV02.mmObject(), SwitchOrderCancellationInstructionV02.mmObject(), SwitchOrderConfirmationV02.mmObject(), SwitchOrderV02.mmObject());
				code = "setr";
			}
		});
		return mmObject_lazy.get();
	}
}