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
import com.tools20022.repository.area.semt.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Messages that support post-settlement processes for securities (including
 * reporting on securities movements, trades and balances), the processes
 * required to protect beneficial owner's rights throughout settlement, plus any
 * exceptions and investigations related to securities transactions.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessArea#getMessageDefinition
 * messageDefinition} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAuditTrailReportV01
 * SecuritiesSettlementTransactionAuditTrailReportV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementConfirmationV01
 * IntraPositionMovementConfirmationV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementConfirmationV02
 * IntraPositionMovementConfirmationV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementConfirmationV03
 * IntraPositionMovementConfirmationV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementConfirmationV04
 * IntraPositionMovementConfirmationV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementPostingReportV01
 * IntraPositionMovementPostingReportV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementPostingReportV02
 * IntraPositionMovementPostingReportV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementPostingReportV03
 * IntraPositionMovementPostingReportV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementPostingReportV04
 * IntraPositionMovementPostingReportV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.AccountingStatementOfHoldings
 * AccountingStatementOfHoldings}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.AccountingStatementOfHoldingsV02
 * AccountingStatementOfHoldingsV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV03
 * SecuritiesBalanceAccountingReportV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV04
 * SecuritiesBalanceAccountingReportV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV05
 * SecuritiesBalanceAccountingReportV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV06
 * SecuritiesBalanceAccountingReportV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.CustodyStatementOfHoldings
 * CustodyStatementOfHoldings}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.CustodyStatementOfHoldingsV02
 * CustodyStatementOfHoldingsV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceCustodyReportV03
 * SecuritiesBalanceCustodyReportV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceCustodyReportV04
 * SecuritiesBalanceCustodyReportV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceCustodyReportV05
 * SecuritiesBalanceCustodyReportV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceCustodyReportV06
 * SecuritiesBalanceCustodyReportV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesMessageCancellationAdviceV01
 * SecuritiesMessageCancellationAdviceV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesMessageCancellationAdviceV02
 * SecuritiesMessageCancellationAdviceV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesMessageCancellationAdviceV03
 * SecuritiesMessageCancellationAdviceV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPendingReportV01
 * SecuritiesTransactionPendingReportV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPendingReportV02
 * SecuritiesTransactionPendingReportV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPendingReportV03
 * SecuritiesTransactionPendingReportV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPendingReportV04
 * SecuritiesTransactionPendingReportV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV01
 * SecuritiesTransactionPostingReportV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV02
 * SecuritiesTransactionPostingReportV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV03
 * SecuritiesTransactionPostingReportV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV04
 * SecuritiesTransactionPostingReportV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesMessageRejection
 * SecuritiesMessageRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.StatementOfInvestmentFundTransactionsCancellation
 * StatementOfInvestmentFundTransactionsCancellation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.StatementOfInvestmentFundTransactions
 * StatementOfInvestmentFundTransactions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementInstructionV01
 * IntraPositionMovementInstructionV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementInstructionV02
 * IntraPositionMovementInstructionV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementStatusAdviceV01
 * IntraPositionMovementStatusAdviceV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementStatusAdviceV02
 * IntraPositionMovementStatusAdviceV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAllegementReportV01
 * SecuritiesSettlementTransactionAllegementReportV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAllegementReportV02
 * SecuritiesSettlementTransactionAllegementReportV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesStatementQueryV01
 * SecuritiesStatementQueryV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesStatementQueryV02
 * SecuritiesStatementQueryV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAllegementReportV03
 * SecuritiesSettlementTransactionAllegementReportV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesStatementQueryV03
 * SecuritiesStatementQueryV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementStatusAdviceV03
 * IntraPositionMovementStatusAdviceV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPendingReportV05
 * SecuritiesTransactionPendingReportV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV05
 * SecuritiesTransactionPostingReportV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceCustodyReportV07
 * SecuritiesBalanceCustodyReportV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV07
 * SecuritiesBalanceAccountingReportV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAllegementReportV04
 * SecuritiesSettlementTransactionAllegementReportV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesStatementQueryV04
 * SecuritiesStatementQueryV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPendingReportV06
 * SecuritiesTransactionPendingReportV06}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessArea#getCode code} =
 * "semt"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelCatalogueEntry#getBusinessProcessCatalogue
 * businessProcessCatalogue} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmcatalogue
 * GeneratedRepository.mmcatalogue}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Securities Management - Archive - master"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Messages that support post-settlement processes for securities (including reporting on securities movements, trades and balances), the processes required to protect beneficial owner's rights throughout settlement, plus any exceptions and investigations related to securities transactions."
 * </li>
 * </ul>
 */
public class SecuritiesManagementArchive {

	final static private AtomicReference<MMBusinessArea> mmObject_lazy = new AtomicReference<>();

	final static public MMBusinessArea mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessArea() {
			{
				businessProcessCatalogue_lazy = () -> GeneratedRepository.mmcatalogue;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Securities Management - Archive - master";
				definition = "Messages that support post-settlement processes for securities (including reporting on securities movements, trades and balances), the processes required to protect beneficial owner's rights throughout settlement, plus any exceptions and investigations related to securities transactions.";
				messageDefinition_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionAuditTrailReportV01.mmObject(), IntraPositionMovementConfirmationV01.mmObject(), IntraPositionMovementConfirmationV02.mmObject(),
						IntraPositionMovementConfirmationV03.mmObject(), IntraPositionMovementConfirmationV04.mmObject(), IntraPositionMovementPostingReportV01.mmObject(), IntraPositionMovementPostingReportV02.mmObject(),
						IntraPositionMovementPostingReportV03.mmObject(), IntraPositionMovementPostingReportV04.mmObject(), AccountingStatementOfHoldings.mmObject(), AccountingStatementOfHoldingsV02.mmObject(),
						SecuritiesBalanceAccountingReportV03.mmObject(), SecuritiesBalanceAccountingReportV04.mmObject(), SecuritiesBalanceAccountingReportV05.mmObject(), SecuritiesBalanceAccountingReportV06.mmObject(),
						CustodyStatementOfHoldings.mmObject(), CustodyStatementOfHoldingsV02.mmObject(), SecuritiesBalanceCustodyReportV03.mmObject(), SecuritiesBalanceCustodyReportV04.mmObject(),
						SecuritiesBalanceCustodyReportV05.mmObject(), SecuritiesBalanceCustodyReportV06.mmObject(), SecuritiesMessageCancellationAdviceV01.mmObject(), SecuritiesMessageCancellationAdviceV02.mmObject(),
						SecuritiesMessageCancellationAdviceV03.mmObject(), SecuritiesTransactionPendingReportV01.mmObject(), SecuritiesTransactionPendingReportV02.mmObject(), SecuritiesTransactionPendingReportV03.mmObject(),
						SecuritiesTransactionPendingReportV04.mmObject(), SecuritiesTransactionPostingReportV01.mmObject(), SecuritiesTransactionPostingReportV02.mmObject(), SecuritiesTransactionPostingReportV03.mmObject(),
						SecuritiesTransactionPostingReportV04.mmObject(), SecuritiesMessageRejection.mmObject(), StatementOfInvestmentFundTransactionsCancellation.mmObject(), StatementOfInvestmentFundTransactions.mmObject(),
						IntraPositionMovementInstructionV01.mmObject(), IntraPositionMovementInstructionV02.mmObject(), IntraPositionMovementStatusAdviceV01.mmObject(), IntraPositionMovementStatusAdviceV02.mmObject(),
						SecuritiesSettlementTransactionAllegementReportV01.mmObject(), SecuritiesSettlementTransactionAllegementReportV02.mmObject(), SecuritiesStatementQueryV01.mmObject(), SecuritiesStatementQueryV02.mmObject(),
						SecuritiesSettlementTransactionAllegementReportV03.mmObject(), SecuritiesStatementQueryV03.mmObject(), IntraPositionMovementStatusAdviceV03.mmObject(), SecuritiesTransactionPendingReportV05.mmObject(),
						SecuritiesTransactionPostingReportV05.mmObject(), SecuritiesBalanceCustodyReportV07.mmObject(), SecuritiesBalanceAccountingReportV07.mmObject(), SecuritiesSettlementTransactionAllegementReportV04.mmObject(),
						SecuritiesStatementQueryV04.mmObject(), SecuritiesTransactionPendingReportV06.mmObject());
				code = "semt";
			}
		});
		return mmObject_lazy.get();
	}
}