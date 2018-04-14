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
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorDiagnosticResponseV01
 * AcceptorDiagnosticResponseV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorDiagnosticResponseV02
 * AcceptorDiagnosticResponseV02}</li>
 * <li>{@linkplain com.tools20022.repository.area.caaa.AcceptorBatchTransferV01
 * AcceptorBatchTransferV01}</li>
 * <li>{@linkplain com.tools20022.repository.area.caaa.AcceptorBatchTransferV02
 * AcceptorBatchTransferV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCancellationAdviceResponseV01
 * AcceptorCancellationAdviceResponseV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCancellationAdviceResponseV02
 * AcceptorCancellationAdviceResponseV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorAuthorisationRequestV01
 * AcceptorAuthorisationRequestV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorAuthorisationRequestV02
 * AcceptorAuthorisationRequestV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCompletionAdviceResponseV01
 * AcceptorCompletionAdviceResponseV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCompletionAdviceResponseV02
 * AcceptorCompletionAdviceResponseV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorReconciliationRequestV01
 * AcceptorReconciliationRequestV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorReconciliationRequestV02
 * AcceptorReconciliationRequestV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorReconciliationResponseV01
 * AcceptorReconciliationResponseV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorReconciliationResponseV02
 * AcceptorReconciliationResponseV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCancellationRequestV01
 * AcceptorCancellationRequestV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCancellationRequestV02
 * AcceptorCancellationRequestV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCancellationResponseV01
 * AcceptorCancellationResponseV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCancellationResponseV02
 * AcceptorCancellationResponseV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorDiagnosticRequestV01
 * AcceptorDiagnosticRequestV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorDiagnosticRequestV02
 * AcceptorDiagnosticRequestV02}</li>
 * <li>{@linkplain com.tools20022.repository.area.caaa.AcceptorRejectionV01
 * AcceptorRejectionV01}</li>
 * <li>{@linkplain com.tools20022.repository.area.caaa.AcceptorRejectionV02
 * AcceptorRejectionV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCompletionAdviceV01
 * AcceptorCompletionAdviceV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCompletionAdviceV02
 * AcceptorCompletionAdviceV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorBatchTransferResponseV01
 * AcceptorBatchTransferResponseV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorBatchTransferResponseV02
 * AcceptorBatchTransferResponseV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCancellationAdviceV01
 * AcceptorCancellationAdviceV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCancellationAdviceV02
 * AcceptorCancellationAdviceV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorAuthorisationResponseV01
 * AcceptorAuthorisationResponseV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorAuthorisationResponseV02
 * AcceptorAuthorisationResponseV02}</li>
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
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCompletionAdviceV04
 * AcceptorCompletionAdviceV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorDiagnosticResponseV04
 * AcceptorDiagnosticResponseV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorReconciliationResponseV04
 * AcceptorReconciliationResponseV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCurrencyConversionRequestV02
 * AcceptorCurrencyConversionRequestV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCancellationAdviceResponseV04
 * AcceptorCancellationAdviceResponseV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorDiagnosticRequestV04
 * AcceptorDiagnosticRequestV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCancellationResponseV04
 * AcceptorCancellationResponseV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCurrencyConversionResponseV02
 * AcceptorCurrencyConversionResponseV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCompletionAdviceResponseV04
 * AcceptorCompletionAdviceResponseV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorAuthorisationResponseV04
 * AcceptorAuthorisationResponseV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorBatchTransferResponseV04
 * AcceptorBatchTransferResponseV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCancellationAdviceV04
 * AcceptorCancellationAdviceV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCancellationRequestV04
 * AcceptorCancellationRequestV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorReconciliationRequestV04
 * AcceptorReconciliationRequestV04}</li>
 * <li>{@linkplain com.tools20022.repository.area.caaa.AcceptorBatchTransferV04
 * AcceptorBatchTransferV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorAuthorisationRequestV04
 * AcceptorAuthorisationRequestV04}</li>
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
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCompletionAdviceResponseV05
 * AcceptorCompletionAdviceResponseV05}</li>
 * <li>{@linkplain com.tools20022.repository.area.caaa.AcceptorBatchTransferV05
 * AcceptorBatchTransferV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorDiagnosticRequestV05
 * AcceptorDiagnosticRequestV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCancellationAdviceResponseV05
 * AcceptorCancellationAdviceResponseV05}</li>
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
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Acceptor to Acquirer Card Transaction - Archive - master"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Messages that support any card payment related transactions and services between a card acceptor and a card transaction acquirer. It includes the authorisation, cancellation and capture of card transactions."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
public class AcceptortoAcquirerCardTransactionArchive {

	final static private AtomicReference<MMBusinessArea> mmObject_lazy = new AtomicReference<>();

	final static public MMBusinessArea mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessArea() {
			{
				businessProcessCatalogue_lazy = () -> GeneratedRepository.catalogue;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Acceptor to Acquirer Card Transaction - Archive - master";
				definition = "Messages that support any card payment related transactions and services between a card acceptor and a card transaction acquirer. It includes the authorisation, cancellation and capture of card transactions.";
				code = "caaa";
				messageDefinition_lazy = () -> Arrays.asList(AcceptorDiagnosticResponseV01.mmObject(), AcceptorDiagnosticResponseV02.mmObject(), AcceptorBatchTransferV01.mmObject(), AcceptorBatchTransferV02.mmObject(),
						AcceptorCancellationAdviceResponseV01.mmObject(), AcceptorCancellationAdviceResponseV02.mmObject(), AcceptorAuthorisationRequestV01.mmObject(), AcceptorAuthorisationRequestV02.mmObject(),
						AcceptorCompletionAdviceResponseV01.mmObject(), AcceptorCompletionAdviceResponseV02.mmObject(), AcceptorReconciliationRequestV01.mmObject(), AcceptorReconciliationRequestV02.mmObject(),
						AcceptorReconciliationResponseV01.mmObject(), AcceptorReconciliationResponseV02.mmObject(), AcceptorCancellationRequestV01.mmObject(), AcceptorCancellationRequestV02.mmObject(),
						AcceptorCancellationResponseV01.mmObject(), AcceptorCancellationResponseV02.mmObject(), AcceptorDiagnosticRequestV01.mmObject(), AcceptorDiagnosticRequestV02.mmObject(), AcceptorRejectionV01.mmObject(),
						AcceptorRejectionV02.mmObject(), AcceptorCompletionAdviceV01.mmObject(), AcceptorCompletionAdviceV02.mmObject(), AcceptorBatchTransferResponseV01.mmObject(), AcceptorBatchTransferResponseV02.mmObject(),
						AcceptorCancellationAdviceV01.mmObject(), AcceptorCancellationAdviceV02.mmObject(), AcceptorAuthorisationResponseV01.mmObject(), AcceptorAuthorisationResponseV02.mmObject(),
						AcceptorCancellationAdviceResponseV03.mmObject(), AcceptorDiagnosticResponseV03.mmObject(), AcceptorCurrencyConversionResponseV01.mmObject(), AcceptorCancellationResponseV03.mmObject(),
						AcceptorCancellationRequestV03.mmObject(), AcceptorCurrencyConversionRequestV01.mmObject(), AcceptorReconciliationResponseV03.mmObject(), AcceptorBatchTransferResponseV03.mmObject(),
						AcceptorCompletionAdviceResponseV03.mmObject(), AcceptorRejectionV03.mmObject(), AcceptorDiagnosticRequestV03.mmObject(), AcceptorAuthorisationRequestV03.mmObject(), AcceptorBatchTransferV03.mmObject(),
						AcceptorCompletionAdviceV03.mmObject(), AcceptorCancellationAdviceV03.mmObject(), AcceptorReconciliationRequestV03.mmObject(), AcceptorAuthorisationResponseV03.mmObject(), AcceptorCompletionAdviceV04.mmObject(),
						AcceptorDiagnosticResponseV04.mmObject(), AcceptorReconciliationResponseV04.mmObject(), AcceptorCurrencyConversionRequestV02.mmObject(), AcceptorCancellationAdviceResponseV04.mmObject(),
						AcceptorDiagnosticRequestV04.mmObject(), AcceptorCancellationResponseV04.mmObject(), AcceptorCurrencyConversionResponseV02.mmObject(), AcceptorCompletionAdviceResponseV04.mmObject(),
						AcceptorAuthorisationResponseV04.mmObject(), AcceptorBatchTransferResponseV04.mmObject(), AcceptorCancellationAdviceV04.mmObject(), AcceptorCancellationRequestV04.mmObject(),
						AcceptorReconciliationRequestV04.mmObject(), AcceptorBatchTransferV04.mmObject(), AcceptorAuthorisationRequestV04.mmObject(), AcceptorReconciliationRequestV05.mmObject(),
						AcceptorCurrencyConversionResponseV03.mmObject(), AcceptorCancellationResponseV05.mmObject(), AcceptorCancellationRequestV05.mmObject(), AcceptorBatchTransferResponseV05.mmObject(),
						AcceptorAuthorisationRequestV05.mmObject(), AcceptorCurrencyConversionRequestV03.mmObject(), AcceptorCompletionAdviceV05.mmObject(), AcceptorCompletionAdviceResponseV05.mmObject(),
						AcceptorBatchTransferV05.mmObject(), AcceptorDiagnosticRequestV05.mmObject(), AcceptorCancellationAdviceResponseV05.mmObject(), AcceptorCancellationAdviceV05.mmObject(), AcceptorAuthorisationResponseV05.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}