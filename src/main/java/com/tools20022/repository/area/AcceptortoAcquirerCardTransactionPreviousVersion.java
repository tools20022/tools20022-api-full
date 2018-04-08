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
import com.tools20022.repository.area.caaa.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Messages that support any card payment related transactions and services
 * between a card acceptor and a card transaction acquirer. It includes the
 * authorisation, cancellation and capture of card transactions.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessArea#getCode code} =
 * "caaa"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessArea#getMessageDefinition
 * messageDefinition} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.area.caaa.AcceptorRejectionV04
 * AcceptorRejectionV04}</li>
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#catalogue
 * GeneratedRepository.catalogue}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Acceptor to Acquirer Card Transaction - Previous version - master"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Messages that support any card payment related transactions and services between a card acceptor and a card transaction acquirer. It includes the authorisation, cancellation and capture of card transactions."
 * </li>
 * </ul>
 */
public class AcceptortoAcquirerCardTransactionPreviousVersion {

	final static private AtomicReference<MMBusinessArea> mmObject_lazy = new AtomicReference<>();

	final static public MMBusinessArea mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessArea() {
			{
				businessProcessCatalogue_lazy = () -> GeneratedRepository.catalogue;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Acceptor to Acquirer Card Transaction - Previous version - master";
				definition = "Messages that support any card payment related transactions and services between a card acceptor and a card transaction acquirer. It includes the authorisation, cancellation and capture of card transactions.";
				code = "caaa";
				messageDefinition_lazy = () -> Arrays.asList(AcceptorRejectionV04.mmObject(), AcceptorReconciliationResponseV05.mmObject(), AcceptorDiagnosticResponseV05.mmObject(), AcceptorAuthorisationResponseV06.mmObject(),
						AcceptorAuthorisationRequestV06.mmObject(), AcceptorCancellationRequestV06.mmObject(), AcceptorCompletionAdviceResponseV06.mmObject(), AcceptorCancellationAdviceV06.mmObject(),
						AcceptorCurrencyConversionResponseV04.mmObject(), AcceptorCompletionAdviceV06.mmObject(), AcceptorCurrencyConversionRequestV04.mmObject(), AcceptorCancellationAdviceResponseV06.mmObject(),
						AcceptorBatchTransferResponseV06.mmObject(), AcceptorCancellationResponseV06.mmObject(), AcceptorReconciliationRequestV06.mmObject(), AcceptorDiagnosticRequestV06.mmObject(), AcceptorBatchTransferV06.mmObject(),
						AcceptorCurrencyConversionAdviceResponseV01.mmObject(), AcceptorCurrencyConversionAdviceV01.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}