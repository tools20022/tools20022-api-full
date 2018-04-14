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
 * Set of messages used for settlement and reconciliation activities and used by
 * intermediaries involved in the settlement and reconciliation processing chain
 * such as the broker, the investment manager, the global custodian, the stock
 * exchange, the market insfrastructure, etc. <br>
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageSet#getMessageDefinition
 * messageDefinition} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceCustodyReportV09
 * SecuritiesBalanceCustodyReportV09}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementInstructionV04
 * IntraPositionMovementInstructionV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesStatusOrStatementQueryStatusAdviceV04
 * SecuritiesStatusOrStatementQueryStatusAdviceV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesMessageCancellationAdviceV05
 * SecuritiesMessageCancellationAdviceV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesStatementQueryV06
 * SecuritiesStatementQueryV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestStatusAdviceV04
 * SecuritiesSettlementTransactionModificationRequestStatusAdviceV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionModificationStatusAdviceV07
 * SecuritiesSettlementConditionModificationStatusAdviceV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionStatusQueryV04
 * SecuritiesTransactionStatusQueryV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementAllegementRemovalAdviceV04
 * SecuritiesSettlementAllegementRemovalAdviceV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequestV05
 * SecuritiesTransactionCancellationRequestV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV09
 * SecuritiesBalanceAccountingReportV09}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequestStatusAdviceV05
 * SecuritiesTransactionCancellationRequestStatusAdviceV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionCounterpartyResponseV02
 * SecuritiesSettlementTransactionCounterpartyResponseV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAuditTrailReportV03
 * SecuritiesSettlementTransactionAuditTrailReportV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementStatusAdviceV05
 * IntraPositionMovementStatusAdviceV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionsModificationRequestV07
 * SecuritiesSettlementConditionsModificationRequestV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV06
 * SecuritiesFinancingModificationInstructionV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingStatusAdviceV07
 * SecuritiesFinancingStatusAdviceV07}</li>
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
 * "Settlement And Reconciliation - ISO - Latest version"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Set of messages used for settlement and reconciliation activities and used by intermediaries involved in the settlement and reconciliation processing chain such as the broker, the investment manager, the global custodian, the stock exchange, the market insfrastructure, etc. \r\n"
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
public class SettlementAndReconciliationISOLatestversion {

	final static private AtomicReference<MMMessageSet> mmObject_lazy = new AtomicReference<>();

	final static public MMMessageSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageSet() {
			{
				businessProcessCatalogue_lazy = () -> GeneratedRepository.catalogue;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Settlement And Reconciliation - ISO - Latest version";
				definition = "Set of messages used for settlement and reconciliation activities and used by intermediaries involved in the settlement and reconciliation processing chain such as the broker, the investment manager, the global custodian, the stock exchange, the market insfrastructure, etc. \r\n";
				messageDefinition_lazy = () -> Arrays.asList(SecuritiesBalanceCustodyReportV09.mmObject(), IntraPositionMovementInstructionV04.mmObject(), SecuritiesStatusOrStatementQueryStatusAdviceV04.mmObject(),
						SecuritiesMessageCancellationAdviceV05.mmObject(), SecuritiesStatementQueryV06.mmObject(), SecuritiesSettlementTransactionModificationRequestStatusAdviceV04.mmObject(),
						SecuritiesSettlementConditionModificationStatusAdviceV07.mmObject(), SecuritiesTransactionStatusQueryV04.mmObject(), SecuritiesSettlementAllegementRemovalAdviceV04.mmObject(),
						SecuritiesTransactionCancellationRequestV05.mmObject(), SecuritiesBalanceAccountingReportV09.mmObject(), SecuritiesTransactionCancellationRequestStatusAdviceV05.mmObject(),
						SecuritiesSettlementTransactionCounterpartyResponseV02.mmObject(), SecuritiesSettlementTransactionAuditTrailReportV03.mmObject(), IntraPositionMovementStatusAdviceV05.mmObject(),
						SecuritiesSettlementConditionsModificationRequestV07.mmObject(), SecuritiesFinancingModificationInstructionV06.mmObject(), SecuritiesFinancingStatusAdviceV07.mmObject(),
						IntraPositionMovementConfirmationV07.mmObject(), SecuritiesSettlementTransactionGenerationNotificationV08.mmObject(), IntraPositionMovementPostingReportV07.mmObject(),
						SecuritiesTransactionPendingReportV09.mmObject(), SecuritiesSettlementTransactionAllegementReportV07.mmObject(), SecuritiesSettlementTransactionAllegementNotificationV07.mmObject(),
						SecuritiesSettlementTransactionModificationRequestV06.mmObject(), SecuritiesSettlementTransactionConfirmationV08.mmObject(), PortfolioTransferNotificationV05.mmObject(), SecuritiesFinancingInstructionV08.mmObject(),
						SecuritiesTransactionPostingReportV08.mmObject(), SecuritiesFinancingConfirmationV08.mmObject(), SecuritiesSettlementTransactionStatusAdviceV09.mmObject(),
						SecuritiesSettlementTransactionReversalAdviceV07.mmObject(), SecuritiesSettlementTransactionInstructionV08.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}