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
import com.tools20022.repository.area.caaa.*;
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
 * "Acceptor to Acquirer Card Transaction - Archive - master"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Messages that support any card payment related transactions and services between a card acceptor and a card transaction acquirer. It includes the authorisation, cancellation and capture of card transactions."
 * </li>
 * </ul>
 */
public class AcceptortoAcquirerCardTransactionArchive {

	final static private AtomicReference<MMBusinessArea> mmObject_lazy = new AtomicReference<>();

	final static public MMBusinessArea mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessArea() {
			{
				businessProcessCatalogue_lazy = () -> com.tools20022.repository.GeneratedRepository.catalogue;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Acceptor to Acquirer Card Transaction - Archive - master";
				definition = "Messages that support any card payment related transactions and services between a card acceptor and a card transaction acquirer. It includes the authorisation, cancellation and capture of card transactions.";
				messageDefinition_lazy = () -> Arrays.asList(AcceptorDiagnosticResponseV01.mmObject(), AcceptorDiagnosticResponseV02.mmObject(), AcceptorBatchTransferV01.mmObject(), AcceptorBatchTransferV02.mmObject(),
						AcceptorCancellationAdviceResponseV01.mmObject(), AcceptorCancellationAdviceResponseV02.mmObject(), AcceptorAuthorisationRequestV01.mmObject(), AcceptorAuthorisationRequestV02.mmObject(),
						AcceptorCompletionAdviceResponseV01.mmObject(), AcceptorCompletionAdviceResponseV02.mmObject(), AcceptorReconciliationRequestV01.mmObject(), AcceptorReconciliationRequestV02.mmObject(),
						AcceptorReconciliationResponseV01.mmObject(), AcceptorReconciliationResponseV02.mmObject(), AcceptorCancellationRequestV01.mmObject(), AcceptorCancellationRequestV02.mmObject(),
						AcceptorCancellationResponseV01.mmObject(), AcceptorCancellationResponseV02.mmObject(), AcceptorDiagnosticRequestV01.mmObject(), AcceptorDiagnosticRequestV02.mmObject(), AcceptorRejectionV01.mmObject(),
						AcceptorRejectionV02.mmObject(), AcceptorCompletionAdviceV01.mmObject(), AcceptorCompletionAdviceV02.mmObject(), AcceptorBatchTransferResponseV01.mmObject(), AcceptorBatchTransferResponseV02.mmObject(),
						AcceptorCancellationAdviceV01.mmObject(), AcceptorCancellationAdviceV02.mmObject(), AcceptorAuthorisationResponseV01.mmObject(), AcceptorAuthorisationResponseV02.mmObject());
				code = "caaa";
			}
		});
		return mmObject_lazy.get();
	}
}