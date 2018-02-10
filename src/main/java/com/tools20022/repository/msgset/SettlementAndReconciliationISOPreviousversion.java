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
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesMessageCancellationAdviceV04
 * SecuritiesMessageCancellationAdviceV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementAllegementRemovalAdviceV03
 * SecuritiesSettlementAllegementRemovalAdviceV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesStatusOrStatementQueryStatusAdviceV03
 * SecuritiesStatusOrStatementQueryStatusAdviceV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionStatusQueryV03
 * SecuritiesTransactionStatusQueryV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementInstructionV03
 * IntraPositionMovementInstructionV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferNotificationV03
 * PortfolioTransferNotificationV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionCounterpartyResponseV01
 * SecuritiesSettlementTransactionCounterpartyResponseV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequestV04
 * SecuritiesTransactionCancellationRequestV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceCustodyReportV08
 * SecuritiesBalanceCustodyReportV08}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesStatementQueryV05
 * SecuritiesStatementQueryV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV08
 * SecuritiesBalanceAccountingReportV08}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequestStatusAdviceV04
 * SecuritiesTransactionCancellationRequestStatusAdviceV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionModificationStatusAdviceV06
 * SecuritiesSettlementConditionModificationStatusAdviceV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestStatusAdviceV03
 * SecuritiesSettlementTransactionModificationRequestStatusAdviceV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAuditTrailReportV02
 * SecuritiesSettlementTransactionAuditTrailReportV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV06
 * SecuritiesSettlementTransactionInstructionV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingStatusAdviceV06
 * SecuritiesFinancingStatusAdviceV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionsModificationRequestV06
 * SecuritiesSettlementConditionsModificationRequestV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV06
 * SecuritiesSettlementTransactionConfirmationV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV06
 * SecuritiesFinancingInstructionV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV07
 * SecuritiesSettlementTransactionStatusAdviceV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV06
 * SecuritiesTransactionPostingReportV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementPostingReportV05
 * IntraPositionMovementPostingReportV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV06
 * SecuritiesSettlementTransactionGenerationNotificationV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV05
 * SecuritiesSettlementTransactionReversalAdviceV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementStatusAdviceV04
 * IntraPositionMovementStatusAdviceV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV06
 * SecuritiesFinancingConfirmationV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV05
 * SecuritiesFinancingModificationInstructionV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestV04
 * SecuritiesSettlementTransactionModificationRequestV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementConfirmationV05
 * IntraPositionMovementConfirmationV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAllegementReportV05
 * SecuritiesSettlementTransactionAllegementReportV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotificationV05
 * SecuritiesSettlementTransactionAllegementNotificationV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPendingReportV07
 * SecuritiesTransactionPendingReportV07}</li>
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
 * "Settlement And Reconciliation - ISO - Previous version"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Set of messages  used for settlement and reconciliation activities and used by intermediaries involved in the settlement and reconciliation processing chain such as the broker, the investment manager, the global custodian, the stock exchange, the market insfrastructure, etc. \r\n"
 * </li>
 * </ul>
 */
public class SettlementAndReconciliationISOPreviousversion {

	final static private AtomicReference<MMMessageSet> mmObject_lazy = new AtomicReference<>();

	final static public MMMessageSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageSet() {
			{
				businessProcessCatalogue_lazy = () -> GeneratedRepository.catalogue;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Settlement And Reconciliation - ISO - Previous version";
				definition = "Set of messages  used for settlement and reconciliation activities and used by intermediaries involved in the settlement and reconciliation processing chain such as the broker, the investment manager, the global custodian, the stock exchange, the market insfrastructure, etc. \r\n";
				messageDefinition_lazy = () -> Arrays.asList(SecuritiesMessageCancellationAdviceV04.mmObject(), SecuritiesSettlementAllegementRemovalAdviceV03.mmObject(), SecuritiesStatusOrStatementQueryStatusAdviceV03.mmObject(),
						SecuritiesTransactionStatusQueryV03.mmObject(), IntraPositionMovementInstructionV03.mmObject(), PortfolioTransferNotificationV03.mmObject(), SecuritiesSettlementTransactionCounterpartyResponseV01.mmObject(),
						SecuritiesTransactionCancellationRequestV04.mmObject(), SecuritiesBalanceCustodyReportV08.mmObject(), SecuritiesStatementQueryV05.mmObject(), SecuritiesBalanceAccountingReportV08.mmObject(),
						SecuritiesTransactionCancellationRequestStatusAdviceV04.mmObject(), SecuritiesSettlementConditionModificationStatusAdviceV06.mmObject(), SecuritiesSettlementTransactionModificationRequestStatusAdviceV03.mmObject(),
						SecuritiesSettlementTransactionAuditTrailReportV02.mmObject(), SecuritiesSettlementTransactionInstructionV06.mmObject(), SecuritiesFinancingStatusAdviceV06.mmObject(),
						SecuritiesSettlementConditionsModificationRequestV06.mmObject(), SecuritiesSettlementTransactionConfirmationV06.mmObject(), SecuritiesFinancingInstructionV06.mmObject(),
						SecuritiesSettlementTransactionStatusAdviceV07.mmObject(), SecuritiesTransactionPostingReportV06.mmObject(), IntraPositionMovementPostingReportV05.mmObject(),
						SecuritiesSettlementTransactionGenerationNotificationV06.mmObject(), SecuritiesSettlementTransactionReversalAdviceV05.mmObject(), IntraPositionMovementStatusAdviceV04.mmObject(),
						SecuritiesFinancingConfirmationV06.mmObject(), SecuritiesFinancingModificationInstructionV05.mmObject(), SecuritiesSettlementTransactionModificationRequestV04.mmObject(),
						IntraPositionMovementConfirmationV05.mmObject(), SecuritiesSettlementTransactionAllegementReportV05.mmObject(), SecuritiesSettlementTransactionAllegementNotificationV05.mmObject(),
						SecuritiesTransactionPendingReportV07.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}