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
import com.tools20022.repository.area.caaa.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * This document describes the Card Payments Exchanges - Acceptor to Acquirer
 * message set. It includes the new candidate versions of the MessageDefinitions
 * that have been impacted by the maintenance cycle 2015/2016 (MCR #105) and are
 * submitted to the approval of the Cards Standards Evaluation Group as ISO
 * 20022 MessageDefinitions.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageSet#getMessageDefinition
 * messageDefinition} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorReconciliationRequestV05
 * AcceptorReconciliationRequestV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCurrencyConversionResponseV03
 * AcceptorCurrencyConversionResponseV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCancellationResponseV05
 * AcceptorCancellationResponseV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCancellationRequestV05
 * AcceptorCancellationRequestV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorBatchTransferResponseV05
 * AcceptorBatchTransferResponseV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorAuthorisationRequestV05
 * AcceptorAuthorisationRequestV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCurrencyConversionRequestV03
 * AcceptorCurrencyConversionRequestV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCompletionAdviceV05
 * AcceptorCompletionAdviceV05}</li>
 * <li>{@linkplain com.tools20022.repository.area.caaa.AcceptorRejectionV05
 * AcceptorRejectionV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCompletionAdviceResponseV05
 * AcceptorCompletionAdviceResponseV05}</li>
 * <li>{@linkplain com.tools20022.repository.area.caaa.AcceptorBatchTransferV05
 * AcceptorBatchTransferV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorDiagnosticRequestV05
 * AcceptorDiagnosticRequestV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorReconciliationResponseV05
 * AcceptorReconciliationResponseV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCancellationAdviceResponseV05
 * AcceptorCancellationAdviceResponseV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorDiagnosticResponseV05
 * AcceptorDiagnosticResponseV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCancellationAdviceV05
 * AcceptorCancellationAdviceV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorAuthorisationResponseV05
 * AcceptorAuthorisationResponseV05}</li>
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
 * "CAPE - Acceptor to Acquirer - Maintenance 2015 - 2016"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "This document describes the Card Payments Exchanges - Acceptor to Acquirer message set. It includes the new candidate versions of the MessageDefinitions that have been impacted by the maintenance cycle 2015/2016 (MCR #105) and are submitted to the approval of the Cards Standards Evaluation Group as ISO 20022 MessageDefinitions."
 * </li>
 * </ul>
 */
public class CAPEAcceptortoAcquirerMaintenance20152016 {

	final static private AtomicReference<MMMessageSet> mmObject_lazy = new AtomicReference<>();

	final static public MMMessageSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageSet() {
			{
				businessProcessCatalogue_lazy = () -> GeneratedRepository.catalogue;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CAPE - Acceptor to Acquirer - Maintenance 2015 - 2016";
				definition = "This document describes the Card Payments Exchanges - Acceptor to Acquirer message set. It includes the new candidate versions of the MessageDefinitions that have been impacted by the maintenance cycle 2015/2016 (MCR #105) and are submitted to the approval of the Cards Standards Evaluation Group as ISO 20022 MessageDefinitions.";
				messageDefinition_lazy = () -> Arrays.asList(AcceptorReconciliationRequestV05.mmObject(), AcceptorCurrencyConversionResponseV03.mmObject(), AcceptorCancellationResponseV05.mmObject(),
						AcceptorCancellationRequestV05.mmObject(), AcceptorBatchTransferResponseV05.mmObject(), AcceptorAuthorisationRequestV05.mmObject(), AcceptorCurrencyConversionRequestV03.mmObject(),
						AcceptorCompletionAdviceV05.mmObject(), AcceptorRejectionV05.mmObject(), AcceptorCompletionAdviceResponseV05.mmObject(), AcceptorBatchTransferV05.mmObject(), AcceptorDiagnosticRequestV05.mmObject(),
						AcceptorReconciliationResponseV05.mmObject(), AcceptorCancellationAdviceResponseV05.mmObject(), AcceptorDiagnosticResponseV05.mmObject(), AcceptorCancellationAdviceV05.mmObject(),
						AcceptorAuthorisationResponseV05.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}