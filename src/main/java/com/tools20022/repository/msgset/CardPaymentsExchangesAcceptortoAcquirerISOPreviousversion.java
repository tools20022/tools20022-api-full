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
 * Set of messages that support transactions and services that are related to
 * card payments between a card acceptor and a card transaction acquirer. It
 * includes the authorisation, cancellation and capture of card transactions.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageSet#getMessageDefinition
 * messageDefinition} =
 * <ul>
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
 * <li>{@linkplain com.tools20022.repository.area.caaa.AcceptorRejectionV04
 * AcceptorRejectionV04}</li>
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
 * "Card Payments Exchanges - Acceptor to Acquirer  - ISO - Previous version"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Set of messages that support transactions and services that are related to card payments  between a card acceptor and a card transaction acquirer. It includes the authorisation, cancellation and capture of card transactions."
 * </li>
 * </ul>
 */
public class CardPaymentsExchangesAcceptortoAcquirerISOPreviousversion {

	final static private AtomicReference<MMMessageSet> mmObject_lazy = new AtomicReference<>();

	final static public MMMessageSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageSet() {
			{
				businessProcessCatalogue_lazy = () -> com.tools20022.repository.GeneratedRepository.catalogue;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Card Payments Exchanges - Acceptor to Acquirer  - ISO - Previous version";
				definition = "Set of messages that support transactions and services that are related to card payments  between a card acceptor and a card transaction acquirer. It includes the authorisation, cancellation and capture of card transactions.";
				messageDefinition_lazy = () -> Arrays.asList(AcceptorCompletionAdviceV04.mmObject(), AcceptorDiagnosticResponseV04.mmObject(), AcceptorReconciliationResponseV04.mmObject(), AcceptorCurrencyConversionRequestV02.mmObject(),
						AcceptorCancellationAdviceResponseV04.mmObject(), AcceptorDiagnosticRequestV04.mmObject(), AcceptorCancellationResponseV04.mmObject(), AcceptorRejectionV04.mmObject(),
						AcceptorCurrencyConversionResponseV02.mmObject(), AcceptorCompletionAdviceResponseV04.mmObject(), AcceptorAuthorisationResponseV04.mmObject(), AcceptorBatchTransferResponseV04.mmObject(),
						AcceptorCancellationAdviceV04.mmObject(), AcceptorCancellationRequestV04.mmObject(), AcceptorReconciliationRequestV04.mmObject(), AcceptorBatchTransferV04.mmObject(), AcceptorAuthorisationRequestV04.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}