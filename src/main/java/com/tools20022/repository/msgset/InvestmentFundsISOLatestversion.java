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
import com.tools20022.repository.area.acmt.*;
import com.tools20022.repository.area.camt.*;
import com.tools20022.repository.area.reda.FundProcessingPassportReportV02;
import com.tools20022.repository.area.reda.InvestmentFundReportRequestV02;
import com.tools20022.repository.area.reda.PriceReportCancellationV04;
import com.tools20022.repository.area.reda.PriceReportV04;
import com.tools20022.repository.area.semt.*;
import com.tools20022.repository.area.sese.*;
import com.tools20022.repository.area.setr.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Set of messages designed for the investment funds industry to support account
 * management; subscription, redemption and switch order and confirmation; order
 * status reporting, fund cash forecast reporting, price reporting, fund
 * processing passsport, statements of holdings and transactions; transfer and
 * confirmation; transfer status reporting and portfolio transfer.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageSet#getMessageDefinition
 * messageDefinition} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.FundProcessingPassportReportV02
 * FundProcessingPassportReportV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.InvestmentFundReportRequestV02
 * InvestmentFundReportRequestV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.PriceReportCancellationV04
 * PriceReportCancellationV04}</li>
 * <li>{@linkplain com.tools20022.repository.area.reda.PriceReportV04
 * PriceReportV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.AccountingStatementOfHoldingsV02
 * AccountingStatementOfHoldingsV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.CustodyStatementOfHoldingsV02
 * CustodyStatementOfHoldingsV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.AccountingStatementOfHoldingsCancellationV02
 * AccountingStatementOfHoldingsCancellationV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.CustodyStatementOfHoldingsCancellationV02
 * CustodyStatementOfHoldingsCancellationV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedEstimatedCashForecastReportV04
 * FundDetailedEstimatedCashForecastReportV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundConfirmedCashForecastReportV04
 * FundConfirmedCashForecastReportV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportCancellationV03
 * FundDetailedConfirmedCashForecastReportCancellationV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundEstimatedCashForecastReportV04
 * FundEstimatedCashForecastReportV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.StatementOfInvestmentFundTransactionsV03
 * StatementOfInvestmentFundTransactionsV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesMessageRejectionV03
 * SecuritiesMessageRejectionV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundConfirmedCashForecastReportCancellationV03
 * FundConfirmedCashForecastReportCancellationV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.StatementOfInvestmentFundTransactionsCancellationV03
 * StatementOfInvestmentFundTransactionsCancellationV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportV04
 * FundDetailedConfirmedCashForecastReportV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationV04
 * SubscriptionBulkOrderConfirmationV04}</li>
 * <li>{@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderV04
 * RedemptionBulkOrderV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderCancellationRequestV04
 * SubscriptionBulkOrderCancellationRequestV04}</li>
 * <li>{@linkplain com.tools20022.repository.area.setr.RedemptionOrderV04
 * RedemptionOrderV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderCancellationRequestV04
 * SubscriptionOrderCancellationRequestV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationCancellationInstructionV02
 * RedemptionBulkOrderConfirmationCancellationInstructionV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationV04
 * RedemptionBulkOrderConfirmationV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderCancellationRequestV04
 * RedemptionBulkOrderCancellationRequestV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderConfirmationV04
 * SwitchOrderConfirmationV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RequestForOrderStatusReportV04
 * RequestForOrderStatusReportV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderConfirmationV04
 * SubscriptionOrderConfirmationV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderConfirmationCancellationInstructionV02
 * SubscriptionOrderConfirmationCancellationInstructionV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderCancellationRequestV04
 * SwitchOrderCancellationRequestV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.OrderCancellationStatusReportV04
 * OrderCancellationStatusReportV04}</li>
 * <li>{@linkplain com.tools20022.repository.area.setr.SwitchOrderV04
 * SwitchOrderV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderConfirmationCancellationInstructionV02
 * RedemptionOrderConfirmationCancellationInstructionV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderConfirmationV04
 * RedemptionOrderConfirmationV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.OrderInstructionStatusReportV04
 * OrderInstructionStatusReportV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationCancellationInstructionV02
 * SubscriptionBulkOrderConfirmationCancellationInstructionV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderCancellationRequestV04
 * RedemptionOrderCancellationRequestV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RequestForOrderConfirmationStatusReportV02
 * RequestForOrderConfirmationStatusReportV02}</li>
 * <li>{@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderV04
 * SubscriptionBulkOrderV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderConfirmationCancellationInstructionV02
 * SwitchOrderConfirmationCancellationInstructionV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.OrderConfirmationStatusReportV02
 * OrderConfirmationStatusReportV02}</li>
 * <li>{@linkplain com.tools20022.repository.area.setr.SubscriptionOrderV04
 * SubscriptionOrderV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV07
 * AccountDetailsConfirmationV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV07
 * AccountModificationInstructionV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV07
 * AccountOpeningInstructionV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountManagementStatusReportV06
 * AccountManagementStatusReportV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.RequestForAccountManagementStatusReportV05
 * RequestForAccountManagementStatusReportV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferOutConfirmationV08
 * ReversalOfTransferOutConfirmationV08}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInConfirmationV08
 * TransferInConfirmationV08}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV08
 * PortfolioTransferInstructionV08}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferCancellationRequestV08
 * PortfolioTransferCancellationRequestV08}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutCancellationRequestV08
 * TransferOutCancellationRequestV08}</li>
 * <li>{@linkplain com.tools20022.repository.area.sese.TransferInInstructionV08
 * TransferInInstructionV08}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV08
 * PortfolioTransferConfirmationV08}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV06
 * AccountHoldingInformationV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutConfirmationV08
 * TransferOutConfirmationV08}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInCancellationRequestV08
 * TransferInCancellationRequestV08}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutInstructionV08
 * TransferOutInstructionV08}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferCancellationStatusReportV06
 * TransferCancellationStatusReportV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationRequestV05
 * AccountHoldingInformationRequestV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferInConfirmationV08
 * ReversalOfTransferInConfirmationV08}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.RequestForTransferStatusReportV06
 * RequestForTransferStatusReportV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInstructionStatusReportV06
 * TransferInstructionStatusReportV06}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelCatalogueEntry#getBusinessProcessCatalogue
 * businessProcessCatalogue} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#catalogue
 * GeneratedRepository.catalogue}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Investment Funds - ISO - Latest version"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Set of messages designed for the investment funds industry to support account management; subscription, redemption and switch order and confirmation; order status reporting, fund cash forecast reporting, price reporting, fund processing passsport, statements of holdings and transactions; transfer and confirmation; transfer status reporting and portfolio transfer."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
public class InvestmentFundsISOLatestversion {

	final static private AtomicReference<MMMessageSet> mmObject_lazy = new AtomicReference<>();

	final static public MMMessageSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageSet() {
			{
				businessProcessCatalogue_lazy = () -> GeneratedRepository.catalogue;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Investment Funds - ISO - Latest version";
				definition = "Set of messages designed for the investment funds industry to support account management; subscription, redemption and switch order and confirmation; order status reporting, fund cash forecast reporting, price reporting, fund processing passsport, statements of holdings and transactions; transfer and confirmation; transfer status reporting and portfolio transfer.";
				messageDefinition_lazy = () -> Arrays.asList(FundProcessingPassportReportV02.mmObject(), InvestmentFundReportRequestV02.mmObject(), PriceReportCancellationV04.mmObject(), PriceReportV04.mmObject(),
						AccountingStatementOfHoldingsV02.mmObject(), CustodyStatementOfHoldingsV02.mmObject(), AccountingStatementOfHoldingsCancellationV02.mmObject(), CustodyStatementOfHoldingsCancellationV02.mmObject(),
						FundDetailedEstimatedCashForecastReportV04.mmObject(), FundConfirmedCashForecastReportV04.mmObject(), FundDetailedConfirmedCashForecastReportCancellationV03.mmObject(), FundEstimatedCashForecastReportV04.mmObject(),
						StatementOfInvestmentFundTransactionsV03.mmObject(), SecuritiesMessageRejectionV03.mmObject(), FundConfirmedCashForecastReportCancellationV03.mmObject(),
						StatementOfInvestmentFundTransactionsCancellationV03.mmObject(), FundDetailedConfirmedCashForecastReportV04.mmObject(), SubscriptionBulkOrderConfirmationV04.mmObject(), RedemptionBulkOrderV04.mmObject(),
						SubscriptionBulkOrderCancellationRequestV04.mmObject(), RedemptionOrderV04.mmObject(), SubscriptionOrderCancellationRequestV04.mmObject(), RedemptionBulkOrderConfirmationCancellationInstructionV02.mmObject(),
						RedemptionBulkOrderConfirmationV04.mmObject(), RedemptionBulkOrderCancellationRequestV04.mmObject(), SwitchOrderConfirmationV04.mmObject(), RequestForOrderStatusReportV04.mmObject(),
						SubscriptionOrderConfirmationV04.mmObject(), SubscriptionOrderConfirmationCancellationInstructionV02.mmObject(), SwitchOrderCancellationRequestV04.mmObject(), OrderCancellationStatusReportV04.mmObject(),
						SwitchOrderV04.mmObject(), RedemptionOrderConfirmationCancellationInstructionV02.mmObject(), RedemptionOrderConfirmationV04.mmObject(), OrderInstructionStatusReportV04.mmObject(),
						SubscriptionBulkOrderConfirmationCancellationInstructionV02.mmObject(), RedemptionOrderCancellationRequestV04.mmObject(), RequestForOrderConfirmationStatusReportV02.mmObject(), SubscriptionBulkOrderV04.mmObject(),
						SwitchOrderConfirmationCancellationInstructionV02.mmObject(), OrderConfirmationStatusReportV02.mmObject(), SubscriptionOrderV04.mmObject(), AccountDetailsConfirmationV07.mmObject(),
						AccountModificationInstructionV07.mmObject(), AccountOpeningInstructionV07.mmObject(), AccountManagementStatusReportV06.mmObject(), RequestForAccountManagementStatusReportV05.mmObject(),
						ReversalOfTransferOutConfirmationV08.mmObject(), TransferInConfirmationV08.mmObject(), PortfolioTransferInstructionV08.mmObject(), PortfolioTransferCancellationRequestV08.mmObject(),
						TransferOutCancellationRequestV08.mmObject(), TransferInInstructionV08.mmObject(), PortfolioTransferConfirmationV08.mmObject(), AccountHoldingInformationV06.mmObject(), TransferOutConfirmationV08.mmObject(),
						TransferInCancellationRequestV08.mmObject(), TransferOutInstructionV08.mmObject(), TransferCancellationStatusReportV06.mmObject(), AccountHoldingInformationRequestV05.mmObject(),
						ReversalOfTransferInConfirmationV08.mmObject(), RequestForTransferStatusReportV06.mmObject(), TransferInstructionStatusReportV06.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}