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
 * Message set defined for the implementation of the CRs related the SR2014 Card
 * Payments Exchanges
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageSet#getMessageDefinition
 * messageDefinition} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCancellationAdviceResponseV03
 * AcceptorCancellationAdviceResponseV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorDiagnosticResponseV03
 * AcceptorDiagnosticResponseV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCurrencyConversionResponseV01
 * AcceptorCurrencyConversionResponseV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCancellationResponseV03
 * AcceptorCancellationResponseV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCancellationRequestV03
 * AcceptorCancellationRequestV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCurrencyConversionRequestV01
 * AcceptorCurrencyConversionRequestV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorReconciliationResponseV03
 * AcceptorReconciliationResponseV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorBatchTransferResponseV03
 * AcceptorBatchTransferResponseV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCompletionAdviceResponseV03
 * AcceptorCompletionAdviceResponseV03}</li>
 * <li>{@linkplain com.tools20022.repository.area.caaa.AcceptorRejectionV03
 * AcceptorRejectionV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorDiagnosticRequestV03
 * AcceptorDiagnosticRequestV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorAuthorisationRequestV03
 * AcceptorAuthorisationRequestV03}</li>
 * <li>{@linkplain com.tools20022.repository.area.caaa.AcceptorBatchTransferV03
 * AcceptorBatchTransferV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCompletionAdviceV03
 * AcceptorCompletionAdviceV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCancellationAdviceV03
 * AcceptorCancellationAdviceV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorReconciliationRequestV03
 * AcceptorReconciliationRequestV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorAuthorisationResponseV03
 * AcceptorAuthorisationResponseV03}</li>
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
 * "CAPE - Acceptor to Acquirer - Maintenance 2013 - 2014"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Message set defined for the implementation of the CRs related the SR2014 Card Payments Exchanges"
 * </li>
 * </ul>
 */
public class CAPEAcceptortoAcquirerMaintenance20132014 {

	final static private AtomicReference<MMMessageSet> mmObject_lazy = new AtomicReference<>();

	final static public MMMessageSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageSet() {
			{
				businessProcessCatalogue_lazy = () -> GeneratedRepository.mmcatalogue;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "CAPE - Acceptor to Acquirer - Maintenance 2013 - 2014";
				definition = "Message set defined for the implementation of the CRs related the SR2014 Card Payments Exchanges";
				messageDefinition_lazy = () -> Arrays.asList(AcceptorCancellationAdviceResponseV03.mmObject(), AcceptorDiagnosticResponseV03.mmObject(), AcceptorCurrencyConversionResponseV01.mmObject(),
						AcceptorCancellationResponseV03.mmObject(), AcceptorCancellationRequestV03.mmObject(), AcceptorCurrencyConversionRequestV01.mmObject(), AcceptorReconciliationResponseV03.mmObject(),
						AcceptorBatchTransferResponseV03.mmObject(), AcceptorCompletionAdviceResponseV03.mmObject(), AcceptorRejectionV03.mmObject(), AcceptorDiagnosticRequestV03.mmObject(), AcceptorAuthorisationRequestV03.mmObject(),
						AcceptorBatchTransferV03.mmObject(), AcceptorCompletionAdviceV03.mmObject(), AcceptorCancellationAdviceV03.mmObject(), AcceptorReconciliationRequestV03.mmObject(), AcceptorAuthorisationResponseV03.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}