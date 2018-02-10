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
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessArea#getCode code} =
 * "semt"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessArea#getMessageDefinition
 * messageDefinition} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesMessageCancellationAdviceV04
 * SecuritiesMessageCancellationAdviceV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.AccountingStatementOfHoldingsCancellation
 * AccountingStatementOfHoldingsCancellation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.CustodyStatementOfHoldingsCancellation
 * CustodyStatementOfHoldingsCancellation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesMessageRejectionV02
 * SecuritiesMessageRejectionV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.StatementOfInvestmentFundTransactionsCancellationV02
 * StatementOfInvestmentFundTransactionsCancellationV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.StatementOfInvestmentFundTransactionsV02
 * StatementOfInvestmentFundTransactionsV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementInstructionV03
 * IntraPositionMovementInstructionV03}</li>
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
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAuditTrailReportV02
 * SecuritiesSettlementTransactionAuditTrailReportV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV06
 * SecuritiesTransactionPostingReportV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementPostingReportV05
 * IntraPositionMovementPostingReportV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementStatusAdviceV04
 * IntraPositionMovementStatusAdviceV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementConfirmationV05
 * IntraPositionMovementConfirmationV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAllegementReportV05
 * SecuritiesSettlementTransactionAllegementReportV05}</li>
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
 * "Securities Management - Previous version - master"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Messages that support post-settlement processes for securities (including reporting on securities movements, trades and balances), the processes required to protect beneficial owner's rights throughout settlement, plus any exceptions and investigations related to securities transactions."
 * </li>
 * </ul>
 */
public class SecuritiesManagementPreviousVersion {

	final static private AtomicReference<MMBusinessArea> mmObject_lazy = new AtomicReference<>();

	final static public MMBusinessArea mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessArea() {
			{
				businessProcessCatalogue_lazy = () -> GeneratedRepository.catalogue;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Securities Management - Previous version - master";
				definition = "Messages that support post-settlement processes for securities (including reporting on securities movements, trades and balances), the processes required to protect beneficial owner's rights throughout settlement, plus any exceptions and investigations related to securities transactions.";
				messageDefinition_lazy = () -> Arrays.asList(SecuritiesMessageCancellationAdviceV04.mmObject(), AccountingStatementOfHoldingsCancellation.mmObject(), CustodyStatementOfHoldingsCancellation.mmObject(),
						SecuritiesMessageRejectionV02.mmObject(), StatementOfInvestmentFundTransactionsCancellationV02.mmObject(), StatementOfInvestmentFundTransactionsV02.mmObject(), IntraPositionMovementInstructionV03.mmObject(),
						SecuritiesBalanceCustodyReportV08.mmObject(), SecuritiesStatementQueryV05.mmObject(), SecuritiesBalanceAccountingReportV08.mmObject(), SecuritiesSettlementTransactionAuditTrailReportV02.mmObject(),
						SecuritiesTransactionPostingReportV06.mmObject(), IntraPositionMovementPostingReportV05.mmObject(), IntraPositionMovementStatusAdviceV04.mmObject(), IntraPositionMovementConfirmationV05.mmObject(),
						SecuritiesSettlementTransactionAllegementReportV05.mmObject(), SecuritiesTransactionPendingReportV07.mmObject());
				code = "semt";
			}
		});
		return mmObject_lazy.get();
	}
}