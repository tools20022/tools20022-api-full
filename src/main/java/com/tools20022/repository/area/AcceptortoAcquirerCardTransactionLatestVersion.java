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
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCompletionAdviceResponseV07
 * AcceptorCompletionAdviceResponseV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCurrencyConversionRequestV05
 * AcceptorCurrencyConversionRequestV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorDiagnosticRequestV07
 * AcceptorDiagnosticRequestV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCancellationResponseV07
 * AcceptorCancellationResponseV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorAuthorisationResponseV07
 * AcceptorAuthorisationResponseV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCurrencyConversionAdviceResponseV02
 * AcceptorCurrencyConversionAdviceResponseV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCancellationAdviceResponseV07
 * AcceptorCancellationAdviceResponseV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorReconciliationResponseV06
 * AcceptorReconciliationResponseV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCurrencyConversionAdviceV02
 * AcceptorCurrencyConversionAdviceV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCompletionAdviceV07
 * AcceptorCompletionAdviceV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorAuthorisationRequestV07
 * AcceptorAuthorisationRequestV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorReconciliationRequestV07
 * AcceptorReconciliationRequestV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorDiagnosticResponseV06
 * AcceptorDiagnosticResponseV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorBatchTransferResponseV07
 * AcceptorBatchTransferResponseV07}</li>
 * <li>{@linkplain com.tools20022.repository.area.caaa.AcceptorBatchTransferV07
 * AcceptorBatchTransferV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCancellationRequestV07
 * AcceptorCancellationRequestV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCancellationAdviceV07
 * AcceptorCancellationAdviceV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCurrencyConversionResponseV05
 * AcceptorCurrencyConversionResponseV05}</li>
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
 * "Acceptor to Acquirer Card Transaction - Latest version - master"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Messages that support any card payment related transactions and services between a card acceptor and a card transaction acquirer. It includes the authorisation, cancellation and capture of card transactions."
 * </li>
 * </ul>
 */
public class AcceptortoAcquirerCardTransactionLatestVersion {

	final static private AtomicReference<MMBusinessArea> mmObject_lazy = new AtomicReference<>();

	final static public MMBusinessArea mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessArea() {
			{
				businessProcessCatalogue_lazy = () -> GeneratedRepository.catalogue;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Acceptor to Acquirer Card Transaction - Latest version - master";
				definition = "Messages that support any card payment related transactions and services between a card acceptor and a card transaction acquirer. It includes the authorisation, cancellation and capture of card transactions.";
				messageDefinition_lazy = () -> Arrays.asList(AcceptorRejectionV05.mmObject(), AcceptorReconciliationResponseV05.mmObject(), AcceptorDiagnosticResponseV05.mmObject(), AcceptorAuthorisationResponseV06.mmObject(),
						AcceptorAuthorisationRequestV06.mmObject(), AcceptorCancellationRequestV06.mmObject(), AcceptorCompletionAdviceResponseV06.mmObject(), AcceptorCancellationAdviceV06.mmObject(),
						AcceptorCurrencyConversionResponseV04.mmObject(), AcceptorCompletionAdviceV06.mmObject(), AcceptorCurrencyConversionRequestV04.mmObject(), AcceptorCancellationAdviceResponseV06.mmObject(),
						AcceptorBatchTransferResponseV06.mmObject(), AcceptorCancellationResponseV06.mmObject(), AcceptorReconciliationRequestV06.mmObject(), AcceptorDiagnosticRequestV06.mmObject(), AcceptorBatchTransferV06.mmObject(),
						AcceptorCurrencyConversionAdviceResponseV01.mmObject(), AcceptorCurrencyConversionAdviceV01.mmObject(), AcceptorCompletionAdviceResponseV07.mmObject(), AcceptorCurrencyConversionRequestV05.mmObject(),
						AcceptorDiagnosticRequestV07.mmObject(), AcceptorCancellationResponseV07.mmObject(), AcceptorAuthorisationResponseV07.mmObject(), AcceptorCurrencyConversionAdviceResponseV02.mmObject(),
						AcceptorCancellationAdviceResponseV07.mmObject(), AcceptorReconciliationResponseV06.mmObject(), AcceptorCurrencyConversionAdviceV02.mmObject(), AcceptorCompletionAdviceV07.mmObject(),
						AcceptorAuthorisationRequestV07.mmObject(), AcceptorReconciliationRequestV07.mmObject(), AcceptorDiagnosticResponseV06.mmObject(), AcceptorBatchTransferResponseV07.mmObject(), AcceptorBatchTransferV07.mmObject(),
						AcceptorCancellationRequestV07.mmObject(), AcceptorCancellationAdviceV07.mmObject(), AcceptorCurrencyConversionResponseV05.mmObject());
				code = "caaa";
			}
		});
		return mmObject_lazy.get();
	}
}