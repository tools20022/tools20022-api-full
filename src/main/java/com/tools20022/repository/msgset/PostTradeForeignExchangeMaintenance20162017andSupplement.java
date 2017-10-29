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
import com.tools20022.repository.area.admi.*;
import com.tools20022.repository.area.camt.NetReportV01;
import com.tools20022.repository.area.camt.PayInCallV02;
import com.tools20022.repository.area.camt.PayInEventAcknowledgementV02;
import com.tools20022.repository.area.camt.PayInScheduleV03;
import com.tools20022.repository.area.fxtr.*;
import com.tools20022.repository.area.reda.NettingCutOffReferenceDataReportV01;
import com.tools20022.repository.area.reda.NettingCutOffReferenceDataUpdateRequestV01;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * This message set covers the post-trade processing in the foreign exchange
 * trade domain together with cash management and administration messages to
 * support the associated netting, payments processing and notification of
 * system events. It also ncludes four new messages for the CLSNet service.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageSet#getMessageDefinition
 * messageDefinition} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeWithdrawalNotificationV03
 * ForeignExchangeTradeWithdrawalNotificationV03}</li>
 * <li>{@linkplain com.tools20022.repository.area.camt.PayInCallV02
 * PayInCallV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.PayInEventAcknowledgementV02
 * PayInEventAcknowledgementV02}</li>
 * <li>{@linkplain com.tools20022.repository.area.camt.PayInScheduleV03
 * PayInScheduleV03}</li>
 * <li>{@linkplain com.tools20022.repository.area.admi.StaticDataReportV02
 * StaticDataReportV02}</li>
 * <li>{@linkplain com.tools20022.repository.area.admi.StaticDataRequestV02
 * StaticDataRequestV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.admi.SystemEventAcknowledgementV01
 * SystemEventAcknowledgementV01}</li>
 * <li>{@linkplain com.tools20022.repository.area.admi.MessageRejectV01
 * MessageRejectV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.admi.SystemEventNotificationV02
 * SystemEventNotificationV02}</li>
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
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.NettingCutOffReferenceDataUpdateRequestV01
 * NettingCutOffReferenceDataUpdateRequestV01}</li>
 * <li>{@linkplain com.tools20022.repository.area.camt.NetReportV01
 * NetReportV01}</li>
 * <li>{@linkplain com.tools20022.repository.area.admi.ProcessingRequestV01
 * ProcessingRequestV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.NettingCutOffReferenceDataReportV01
 * NettingCutOffReferenceDataReportV01}</li>
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
 * "Post-Trade Foreign Exchange - Maintenance 2016 - 2017 and Supplement"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "This message set covers the post-trade processing in the foreign exchange trade domain together with cash management and administration messages to support the associated netting, payments processing and notification of system events. It also ncludes four new messages for the CLSNet service."
 * </li>
 * </ul>
 */
public class PostTradeForeignExchangeMaintenance20162017andSupplement {

	final static private AtomicReference<MMMessageSet> mmObject_lazy = new AtomicReference<>();

	final static public MMMessageSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageSet() {
			{
				businessProcessCatalogue_lazy = () -> com.tools20022.repository.GeneratedRepository.catalogue;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Post-Trade Foreign Exchange - Maintenance 2016 - 2017 and Supplement";
				definition = "This message set covers the post-trade processing in the foreign exchange trade domain together with cash management and administration messages to support the associated netting, payments processing and notification of system events. It also ncludes four new messages for the CLSNet service.";
				messageDefinition_lazy = () -> Arrays.asList(ForeignExchangeTradeWithdrawalNotificationV03.mmObject(), PayInCallV02.mmObject(), PayInEventAcknowledgementV02.mmObject(), PayInScheduleV03.mmObject(),
						StaticDataReportV02.mmObject(), StaticDataRequestV02.mmObject(), SystemEventAcknowledgementV01.mmObject(), MessageRejectV01.mmObject(), SystemEventNotificationV02.mmObject(),
						ForeignExchangeTradeInstructionV04.mmObject(), ForeignExchangeTradeStatusNotificationV06.mmObject(), ForeignExchangeTradeInstructionCancellationV04.mmObject(), ForeignExchangeTradeInstructionAmendmentV04.mmObject(),
						ForeignExchangeTradeStatusAndDetailsNotificationV04.mmObject(), ForeignExchangeTradeBulkStatusNotificationV04.mmObject(), NettingCutOffReferenceDataUpdateRequestV01.mmObject(), NetReportV01.mmObject(),
						ProcessingRequestV01.mmObject(), NettingCutOffReferenceDataReportV01.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}