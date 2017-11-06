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
import com.tools20022.repository.area.sese.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Messages that support the settlement process for securities and report its
 * status and confirmation.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessArea#getCode code} =
 * "sese"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessArea#getMessageDefinition
 * messageDefinition} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestStatusAdvice002V04
 * SecuritiesSettlementTransactionModificationRequestStatusAdvice002V04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferNotification002V04
 * PortfolioTransferNotification002V04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementAllegementRemovalAdvice002V04
 * SecuritiesSettlementAllegementRemovalAdvice002V04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionStatusQuery002V04
 * SecuritiesTransactionStatusQuery002V04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionCounterpartyResponse002V02
 * SecuritiesSettlementTransactionCounterpartyResponse002V02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequestStatusAdvice002V05
 * SecuritiesTransactionCancellationRequestStatusAdvice002V05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesStatusOrStatementQueryStatusAdvice002V04
 * SecuritiesStatusOrStatementQueryStatusAdvice002V04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequest002V05
 * SecuritiesTransactionCancellationRequest002V05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionModificationStatusAdvice002V07
 * SecuritiesSettlementConditionModificationStatusAdvice002V07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequest002V05
 * SecuritiesSettlementTransactionModificationRequest002V05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotification002V06
 * SecuritiesSettlementTransactionAllegementNotification002V06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstruction002V07
 * SecuritiesSettlementTransactionInstruction002V07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmation002V07
 * SecuritiesFinancingConfirmation002V07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingStatusAdvice002V07
 * SecuritiesFinancingStatusAdvice002V07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionsModificationRequest002V07
 * SecuritiesSettlementConditionsModificationRequest002V07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdvice002V08
 * SecuritiesSettlementTransactionStatusAdvice002V08}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstruction002V07
 * SecuritiesFinancingInstruction002V07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotification002V07
 * SecuritiesSettlementTransactionGenerationNotification002V07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstruction002V06
 * SecuritiesFinancingModificationInstruction002V06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmation002V07
 * SecuritiesSettlementTransactionConfirmation002V07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdvice002V06
 * SecuritiesSettlementTransactionReversalAdvice002V06}</li>
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
 * "Securities Settlement - Latest version - subset / variant"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Messages that support the settlement process for securities and report its status and confirmation."
 * </li>
 * </ul>
 */
public class SecuritiesSettlementLatestversionsubsetvariant {

	final static private AtomicReference<MMBusinessArea> mmObject_lazy = new AtomicReference<>();

	final static public MMBusinessArea mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessArea() {
			{
				businessProcessCatalogue_lazy = () -> com.tools20022.repository.GeneratedRepository.mmcatalogue;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "Securities Settlement - Latest version - subset / variant";
				definition = "Messages that support the settlement process for securities and report its status and confirmation.";
				messageDefinition_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionModificationRequestStatusAdvice002V04.mmObject(), PortfolioTransferNotification002V04.mmObject(),
						SecuritiesSettlementAllegementRemovalAdvice002V04.mmObject(), SecuritiesTransactionStatusQuery002V04.mmObject(), SecuritiesSettlementTransactionCounterpartyResponse002V02.mmObject(),
						SecuritiesTransactionCancellationRequestStatusAdvice002V05.mmObject(), SecuritiesStatusOrStatementQueryStatusAdvice002V04.mmObject(), SecuritiesTransactionCancellationRequest002V05.mmObject(),
						SecuritiesSettlementConditionModificationStatusAdvice002V07.mmObject(), SecuritiesSettlementTransactionModificationRequest002V05.mmObject(), SecuritiesSettlementTransactionAllegementNotification002V06.mmObject(),
						SecuritiesSettlementTransactionInstruction002V07.mmObject(), SecuritiesFinancingConfirmation002V07.mmObject(), SecuritiesFinancingStatusAdvice002V07.mmObject(),
						SecuritiesSettlementConditionsModificationRequest002V07.mmObject(), SecuritiesSettlementTransactionStatusAdvice002V08.mmObject(), SecuritiesFinancingInstruction002V07.mmObject(),
						SecuritiesSettlementTransactionGenerationNotification002V07.mmObject(), SecuritiesFinancingModificationInstruction002V06.mmObject(), SecuritiesSettlementTransactionConfirmation002V07.mmObject(),
						SecuritiesSettlementTransactionReversalAdvice002V06.mmObject());
				code = "sese";
			}
		});
		return mmObject_lazy.get();
	}
}