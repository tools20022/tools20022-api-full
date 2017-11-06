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
import com.tools20022.repository.area.caaa.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * This document describes the Card Payments Exchanges - Acceptor to Acquirer
 * message set. It includes the new candidate versions of the MessageDefinitions
 * that have been impacted by the maintenance cycle 2016/2017 (MCR #120) and are
 * submitted to the approval of the Cards Standards Evaluation Group as ISO
 * 20022 MessageDefinitions.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageSet#getMessageDefinition
 * messageDefinition} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.area.caaa.AcceptorRejectionV05
 * AcceptorRejectionV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorReconciliationResponseV05
 * AcceptorReconciliationResponseV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorDiagnosticResponseV05
 * AcceptorDiagnosticResponseV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorAuthorisationResponseV06
 * AcceptorAuthorisationResponseV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorAuthorisationRequestV06
 * AcceptorAuthorisationRequestV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCancellationRequestV06
 * AcceptorCancellationRequestV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCompletionAdviceResponseV06
 * AcceptorCompletionAdviceResponseV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCancellationAdviceV06
 * AcceptorCancellationAdviceV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCurrencyConversionResponseV04
 * AcceptorCurrencyConversionResponseV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCompletionAdviceV06
 * AcceptorCompletionAdviceV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCurrencyConversionRequestV04
 * AcceptorCurrencyConversionRequestV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCancellationAdviceResponseV06
 * AcceptorCancellationAdviceResponseV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorBatchTransferResponseV06
 * AcceptorBatchTransferResponseV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCancellationResponseV06
 * AcceptorCancellationResponseV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorReconciliationRequestV06
 * AcceptorReconciliationRequestV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorDiagnosticRequestV06
 * AcceptorDiagnosticRequestV06}</li>
 * <li>{@linkplain com.tools20022.repository.area.caaa.AcceptorBatchTransferV06
 * AcceptorBatchTransferV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCurrencyConversionAdviceResponseV01
 * AcceptorCurrencyConversionAdviceResponseV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCurrencyConversionAdviceV01
 * AcceptorCurrencyConversionAdviceV01}</li>
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
 * "CAPE - Acceptor to Acquirer - Maintenance 2016 - 2017"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "This document describes the Card Payments Exchanges - Acceptor to Acquirer message set. It includes the new candidate versions of the MessageDefinitions that have been impacted by the maintenance cycle 2016/2017 (MCR #120) and are submitted to the approval of the Cards Standards Evaluation Group as ISO 20022 MessageDefinitions."
 * </li>
 * </ul>
 */
public class CAPEAcceptortoAcquirerMaintenance20162017 {

	final static private AtomicReference<MMMessageSet> mmObject_lazy = new AtomicReference<>();

	final static public MMMessageSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageSet() {
			{
				businessProcessCatalogue_lazy = () -> com.tools20022.repository.GeneratedRepository.mmcatalogue;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CAPE - Acceptor to Acquirer - Maintenance 2016 - 2017";
				definition = "This document describes the Card Payments Exchanges - Acceptor to Acquirer message set. It includes the new candidate versions of the MessageDefinitions that have been impacted by the maintenance cycle 2016/2017 (MCR #120) and are submitted to the approval of the Cards Standards Evaluation Group as ISO 20022 MessageDefinitions.";
				messageDefinition_lazy = () -> Arrays.asList(AcceptorRejectionV05.mmObject(), AcceptorReconciliationResponseV05.mmObject(), AcceptorDiagnosticResponseV05.mmObject(), AcceptorAuthorisationResponseV06.mmObject(),
						AcceptorAuthorisationRequestV06.mmObject(), AcceptorCancellationRequestV06.mmObject(), AcceptorCompletionAdviceResponseV06.mmObject(), AcceptorCancellationAdviceV06.mmObject(),
						AcceptorCurrencyConversionResponseV04.mmObject(), AcceptorCompletionAdviceV06.mmObject(), AcceptorCurrencyConversionRequestV04.mmObject(), AcceptorCancellationAdviceResponseV06.mmObject(),
						AcceptorBatchTransferResponseV06.mmObject(), AcceptorCancellationResponseV06.mmObject(), AcceptorReconciliationRequestV06.mmObject(), AcceptorDiagnosticRequestV06.mmObject(), AcceptorBatchTransferV06.mmObject(),
						AcceptorCurrencyConversionAdviceResponseV01.mmObject(), AcceptorCurrencyConversionAdviceV01.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}