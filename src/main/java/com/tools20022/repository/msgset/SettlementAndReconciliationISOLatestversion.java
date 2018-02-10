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
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferNotificationV04
 * PortfolioTransferNotificationV04}</li>
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
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV07
 * SecuritiesFinancingInstructionV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementStatusAdviceV05
 * IntraPositionMovementStatusAdviceV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotificationV06
 * SecuritiesSettlementTransactionAllegementNotificationV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementPostingReportV06
 * IntraPositionMovementPostingReportV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV07
 * SecuritiesSettlementTransactionGenerationNotificationV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestV05
 * SecuritiesSettlementTransactionModificationRequestV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionsModificationRequestV07
 * SecuritiesSettlementConditionsModificationRequestV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV07
 * SecuritiesSettlementTransactionConfirmationV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAllegementReportV06
 * SecuritiesSettlementTransactionAllegementReportV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPendingReportV08
 * SecuritiesTransactionPendingReportV08}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementConfirmationV06
 * IntraPositionMovementConfirmationV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV06
 * SecuritiesSettlementTransactionReversalAdviceV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV06
 * SecuritiesFinancingModificationInstructionV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingStatusAdviceV07
 * SecuritiesFinancingStatusAdviceV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV07
 * SecuritiesTransactionPostingReportV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV07
 * SecuritiesFinancingConfirmationV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV08
 * SecuritiesSettlementTransactionStatusAdviceV08}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV07
 * SecuritiesSettlementTransactionInstructionV07}</li>
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
 * "Settlement And Reconciliation - ISO - Latest version"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Set of messages  used for settlement and reconciliation activities and used by intermediaries involved in the settlement and reconciliation processing chain such as the broker, the investment manager, the global custodian, the stock exchange, the market insfrastructure, etc. \r\n"
 * </li>
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
				definition = "Set of messages  used for settlement and reconciliation activities and used by intermediaries involved in the settlement and reconciliation processing chain such as the broker, the investment manager, the global custodian, the stock exchange, the market insfrastructure, etc. \r\n";
				messageDefinition_lazy = () -> Arrays.asList(SecuritiesBalanceCustodyReportV09.mmObject(), IntraPositionMovementInstructionV04.mmObject(), PortfolioTransferNotificationV04.mmObject(),
						SecuritiesStatusOrStatementQueryStatusAdviceV04.mmObject(), SecuritiesMessageCancellationAdviceV05.mmObject(), SecuritiesStatementQueryV06.mmObject(),
						SecuritiesSettlementTransactionModificationRequestStatusAdviceV04.mmObject(), SecuritiesSettlementConditionModificationStatusAdviceV07.mmObject(), SecuritiesTransactionStatusQueryV04.mmObject(),
						SecuritiesSettlementAllegementRemovalAdviceV04.mmObject(), SecuritiesTransactionCancellationRequestV05.mmObject(), SecuritiesBalanceAccountingReportV09.mmObject(),
						SecuritiesTransactionCancellationRequestStatusAdviceV05.mmObject(), SecuritiesSettlementTransactionCounterpartyResponseV02.mmObject(), SecuritiesSettlementTransactionAuditTrailReportV03.mmObject(),
						SecuritiesFinancingInstructionV07.mmObject(), IntraPositionMovementStatusAdviceV05.mmObject(), SecuritiesSettlementTransactionAllegementNotificationV06.mmObject(), IntraPositionMovementPostingReportV06.mmObject(),
						SecuritiesSettlementTransactionGenerationNotificationV07.mmObject(), SecuritiesSettlementTransactionModificationRequestV05.mmObject(), SecuritiesSettlementConditionsModificationRequestV07.mmObject(),
						SecuritiesSettlementTransactionConfirmationV07.mmObject(), SecuritiesSettlementTransactionAllegementReportV06.mmObject(), SecuritiesTransactionPendingReportV08.mmObject(),
						IntraPositionMovementConfirmationV06.mmObject(), SecuritiesSettlementTransactionReversalAdviceV06.mmObject(), SecuritiesFinancingModificationInstructionV06.mmObject(), SecuritiesFinancingStatusAdviceV07.mmObject(),
						SecuritiesTransactionPostingReportV07.mmObject(), SecuritiesFinancingConfirmationV07.mmObject(), SecuritiesSettlementTransactionStatusAdviceV08.mmObject(), SecuritiesSettlementTransactionInstructionV07.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}