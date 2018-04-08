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
 * {@linkplain com.tools20022.repository.area.semt.AccountingStatementOfHoldingsCancellationV02
 * AccountingStatementOfHoldingsCancellationV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.CustodyStatementOfHoldingsCancellationV02
 * CustodyStatementOfHoldingsCancellationV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesEndOfProcessReportV01
 * SecuritiesEndOfProcessReportV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.TotalPortfolioValuationReportV01
 * TotalPortfolioValuationReportV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.StatementOfInvestmentFundTransactionsV03
 * StatementOfInvestmentFundTransactionsV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesMessageRejectionV03
 * SecuritiesMessageRejectionV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.StatementOfInvestmentFundTransactionsCancellationV03
 * StatementOfInvestmentFundTransactionsCancellationV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceTransparencyReportStatusAdviceV01
 * SecuritiesBalanceTransparencyReportStatusAdviceV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceCustodyReportV09
 * SecuritiesBalanceCustodyReportV09}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementInstructionV04
 * IntraPositionMovementInstructionV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesMessageCancellationAdviceV05
 * SecuritiesMessageCancellationAdviceV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesStatementQueryV06
 * SecuritiesStatementQueryV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV09
 * SecuritiesBalanceAccountingReportV09}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAuditTrailReportV03
 * SecuritiesSettlementTransactionAuditTrailReportV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceTransparencyReportV02
 * SecuritiesBalanceTransparencyReportV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementStatusAdviceV05
 * IntraPositionMovementStatusAdviceV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementConfirmationV07
 * IntraPositionMovementConfirmationV07}</li>
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
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV08
 * SecuritiesTransactionPostingReportV08}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Securities Management - Latest version - master"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Messages that support post-settlement processes for securities (including reporting on securities movements, trades and balances), the processes required to protect beneficial owner's rights throughout settlement, plus any exceptions and investigations related to securities transactions."
 * </li>
 * </ul>
 */
public class SecuritiesManagementLatestVersion {

	final static private AtomicReference<MMBusinessArea> mmObject_lazy = new AtomicReference<>();

	final static public MMBusinessArea mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessArea() {
			{
				businessProcessCatalogue_lazy = () -> GeneratedRepository.catalogue;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "Securities Management - Latest version - master";
				definition = "Messages that support post-settlement processes for securities (including reporting on securities movements, trades and balances), the processes required to protect beneficial owner's rights throughout settlement, plus any exceptions and investigations related to securities transactions.";
				code = "semt";
				messageDefinition_lazy = () -> Arrays.asList(AccountingStatementOfHoldingsCancellationV02.mmObject(), CustodyStatementOfHoldingsCancellationV02.mmObject(), SecuritiesEndOfProcessReportV01.mmObject(),
						TotalPortfolioValuationReportV01.mmObject(), StatementOfInvestmentFundTransactionsV03.mmObject(), SecuritiesMessageRejectionV03.mmObject(), StatementOfInvestmentFundTransactionsCancellationV03.mmObject(),
						SecuritiesBalanceTransparencyReportStatusAdviceV01.mmObject(), SecuritiesBalanceCustodyReportV09.mmObject(), IntraPositionMovementInstructionV04.mmObject(), SecuritiesMessageCancellationAdviceV05.mmObject(),
						SecuritiesStatementQueryV06.mmObject(), SecuritiesBalanceAccountingReportV09.mmObject(), SecuritiesSettlementTransactionAuditTrailReportV03.mmObject(), SecuritiesBalanceTransparencyReportV02.mmObject(),
						IntraPositionMovementStatusAdviceV05.mmObject(), IntraPositionMovementConfirmationV07.mmObject(), IntraPositionMovementPostingReportV07.mmObject(), SecuritiesTransactionPendingReportV09.mmObject(),
						SecuritiesSettlementTransactionAllegementReportV07.mmObject(), SecuritiesTransactionPostingReportV08.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}