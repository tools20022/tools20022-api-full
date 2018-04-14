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
import com.tools20022.repository.area.semt.*;
import com.tools20022.repository.area.sese.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * SR2018.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageSet#getMessageDefinition
 * messageDefinition} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementConfirmationV07
 * IntraPositionMovementConfirmationV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV08
 * SecuritiesSettlementTransactionGenerationNotificationV08}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementPostingReportV07
 * IntraPositionMovementPostingReportV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPendingReportV09
 * SecuritiesTransactionPendingReportV09}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAllegementReportV07
 * SecuritiesSettlementTransactionAllegementReportV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotificationV07
 * SecuritiesSettlementTransactionAllegementNotificationV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestV06
 * SecuritiesSettlementTransactionModificationRequestV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV08
 * SecuritiesSettlementTransactionConfirmationV08}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferNotificationV05
 * PortfolioTransferNotificationV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV08
 * SecuritiesFinancingInstructionV08}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV08
 * SecuritiesTransactionPostingReportV08}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV08
 * SecuritiesFinancingConfirmationV08}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV09
 * SecuritiesSettlementTransactionStatusAdviceV09}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV07
 * SecuritiesSettlementTransactionReversalAdviceV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV08
 * SecuritiesSettlementTransactionInstructionV08}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelCatalogueEntry#getBusinessProcessCatalogue
 * businessProcessCatalogue} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#catalogue
 * GeneratedRepository.catalogue}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "_SR2018_Settlement and Reconciliation"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "SR2018."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
public class _SR2018_SettlementandReconciliation {

	final static private AtomicReference<MMMessageSet> mmObject_lazy = new AtomicReference<>();

	final static public MMMessageSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageSet() {
			{
				businessProcessCatalogue_lazy = () -> GeneratedRepository.catalogue;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "_SR2018_Settlement and Reconciliation";
				definition = "SR2018.";
				messageDefinition_lazy = () -> Arrays.asList(IntraPositionMovementConfirmationV07.mmObject(), SecuritiesSettlementTransactionGenerationNotificationV08.mmObject(), IntraPositionMovementPostingReportV07.mmObject(),
						SecuritiesTransactionPendingReportV09.mmObject(), SecuritiesSettlementTransactionAllegementReportV07.mmObject(), SecuritiesSettlementTransactionAllegementNotificationV07.mmObject(),
						SecuritiesSettlementTransactionModificationRequestV06.mmObject(), SecuritiesSettlementTransactionConfirmationV08.mmObject(), PortfolioTransferNotificationV05.mmObject(), SecuritiesFinancingInstructionV08.mmObject(),
						SecuritiesTransactionPostingReportV08.mmObject(), SecuritiesFinancingConfirmationV08.mmObject(), SecuritiesSettlementTransactionStatusAdviceV09.mmObject(),
						SecuritiesSettlementTransactionReversalAdviceV07.mmObject(), SecuritiesSettlementTransactionInstructionV08.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}