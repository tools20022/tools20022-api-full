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
import com.tools20022.repository.area.fxtr.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Messages that support management processes for foreign exchange contracts,
 * including reporting on trades and balances, plus any exceptions and
 * investigations related to foreign exchange contracts.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessArea#getCode code} =
 * "fxtr"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessArea#getMessageDefinition
 * messageDefinition} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeConfirmationStatusAdviceV01
 * ForeignExchangeTradeConfirmationStatusAdviceV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeConfirmationRequestCancellationRequestV01
 * ForeignExchangeTradeConfirmationRequestCancellationRequestV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeConfirmationRequestAmendmentRequestV01
 * ForeignExchangeTradeConfirmationRequestAmendmentRequestV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeConfirmationStatusAdviceAcknowledgementV01
 * ForeignExchangeTradeConfirmationStatusAdviceAcknowledgementV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeConfirmationRequestV01
 * ForeignExchangeTradeConfirmationRequestV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeCaptureReportRequestV01
 * ForeignExchangeTradeCaptureReportRequestV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeCaptureReportV01
 * ForeignExchangeTradeCaptureReportV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeCaptureReportAcknowledgementV01
 * ForeignExchangeTradeCaptureReportAcknowledgementV01}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Foreign Exchange Trade - Latest version - master"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Messages that support management processes for foreign exchange contracts, including reporting on trades and balances, plus any exceptions and investigations related to foreign exchange contracts."
 * </li>
 * </ul>
 */
public class ForeignExchangeTradeLatestVersion {

	final static private AtomicReference<MMBusinessArea> mmObject_lazy = new AtomicReference<>();

	final static public MMBusinessArea mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessArea() {
			{
				businessProcessCatalogue_lazy = () -> GeneratedRepository.catalogue;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "Foreign Exchange Trade - Latest version - master";
				definition = "Messages that support management processes for foreign exchange contracts, including reporting on trades and balances, plus any exceptions and investigations related to foreign exchange contracts.";
				code = "fxtr";
				messageDefinition_lazy = () -> Arrays.asList(ForeignExchangeTradeConfirmationStatusAdviceV01.mmObject(), ForeignExchangeTradeConfirmationRequestCancellationRequestV01.mmObject(),
						ForeignExchangeTradeConfirmationRequestAmendmentRequestV01.mmObject(), ForeignExchangeTradeConfirmationStatusAdviceAcknowledgementV01.mmObject(), ForeignExchangeTradeConfirmationRequestV01.mmObject(),
						ForeignExchangeTradeCaptureReportRequestV01.mmObject(), ForeignExchangeTradeCaptureReportV01.mmObject(), ForeignExchangeTradeCaptureReportAcknowledgementV01.mmObject(), ForeignExchangeTradeInstructionV04.mmObject(),
						ForeignExchangeTradeStatusNotificationV06.mmObject(), ForeignExchangeTradeInstructionCancellationV04.mmObject(), ForeignExchangeTradeInstructionAmendmentV04.mmObject(),
						ForeignExchangeTradeStatusAndDetailsNotificationV04.mmObject(), ForeignExchangeTradeBulkStatusNotificationV04.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}