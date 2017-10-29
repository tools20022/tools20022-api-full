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
import com.tools20022.repository.area.acmt.*;
import com.tools20022.repository.area.camt.*;
import com.tools20022.repository.area.reda.FundProcessingPassportReportV02;
import com.tools20022.repository.area.reda.InvestmentFundReportRequestV02;
import com.tools20022.repository.area.reda.PriceReportCancellationV04;
import com.tools20022.repository.area.reda.PriceReportV04;
import com.tools20022.repository.area.semt.*;
import com.tools20022.repository.area.sese.*;
import com.tools20022.repository.area.setr.*;
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
 * {@linkplain com.tools20022.repository.area.camt.FundConfirmedCashForecastReportCancellationV02
 * FundConfirmedCashForecastReportCancellationV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundConfirmedCashForecastReportV03
 * FundConfirmedCashForecastReportV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportCancellationV02
 * FundDetailedConfirmedCashForecastReportCancellationV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportV03
 * FundDetailedConfirmedCashForecastReportV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedEstimatedCashForecastReportV03
 * FundDetailedEstimatedCashForecastReportV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundEstimatedCashForecastReportV03
 * FundEstimatedCashForecastReportV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.OrderCancellationStatusReportV03
 * OrderCancellationStatusReportV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.OrderConfirmationStatusReportV01
 * OrderConfirmationStatusReportV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.OrderInstructionStatusReportV03
 * OrderInstructionStatusReportV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderCancellationRequestV03
 * RedemptionBulkOrderCancellationRequestV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationAmendmentV01
 * RedemptionBulkOrderConfirmationAmendmentV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationCancellationInstructionV01
 * RedemptionBulkOrderConfirmationCancellationInstructionV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationV03
 * RedemptionBulkOrderConfirmationV03}</li>
 * <li>{@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderV03
 * RedemptionBulkOrderV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderCancellationRequestV03
 * RedemptionOrderCancellationRequestV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderConfirmationAmendmentV01
 * RedemptionOrderConfirmationAmendmentV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderConfirmationCancellationInstructionV01
 * RedemptionOrderConfirmationCancellationInstructionV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderConfirmationV03
 * RedemptionOrderConfirmationV03}</li>
 * <li>{@linkplain com.tools20022.repository.area.setr.RedemptionOrderV03
 * RedemptionOrderV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RequestForOrderConfirmationStatusReportV01
 * RequestForOrderConfirmationStatusReportV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RequestForOrderStatusReportV03
 * RequestForOrderStatusReportV03}</li>
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
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderCancellationRequestV03
 * SubscriptionBulkOrderCancellationRequestV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationAmendmentV01
 * SubscriptionBulkOrderConfirmationAmendmentV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationCancellationInstructionV01
 * SubscriptionBulkOrderConfirmationCancellationInstructionV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationV03
 * SubscriptionBulkOrderConfirmationV03}</li>
 * <li>{@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderV03
 * SubscriptionBulkOrderV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderCancellationRequestV03
 * SubscriptionOrderCancellationRequestV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderConfirmationAmendmentV01
 * SubscriptionOrderConfirmationAmendmentV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderConfirmationCancellationInstructionV01
 * SubscriptionOrderConfirmationCancellationInstructionV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderConfirmationV03
 * SubscriptionOrderConfirmationV03}</li>
 * <li>{@linkplain com.tools20022.repository.area.setr.SubscriptionOrderV03
 * SubscriptionOrderV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderCancellationRequestV03
 * SwitchOrderCancellationRequestV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderConfirmationAmendmentV01
 * SwitchOrderConfirmationAmendmentV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderConfirmationCancellationInstructionV01
 * SwitchOrderConfirmationCancellationInstructionV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderConfirmationV03
 * SwitchOrderConfirmationV03}</li>
 * <li>{@linkplain com.tools20022.repository.area.setr.SwitchOrderV03
 * SwitchOrderV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInstructionStatusReportV04
 * TransferInstructionStatusReportV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationRequestV03
 * AccountHoldingInformationRequestV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV04
 * AccountHoldingInformationV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferCancellationStatusReportV04
 * TransferCancellationStatusReportV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.RequestForTransferStatusReportV04
 * RequestForTransferStatusReportV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferCancellationRequestV06
 * PortfolioTransferCancellationRequestV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV06
 * PortfolioTransferConfirmationV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV06
 * PortfolioTransferInstructionV06}</li>
 * <li>{@linkplain com.tools20022.repository.area.sese.TransferInInstructionV06
 * TransferInInstructionV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutConfirmationV06
 * TransferOutConfirmationV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutInstructionV06
 * TransferOutInstructionV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutCancellationRequestV06
 * TransferOutCancellationRequestV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInConfirmationV06
 * TransferInConfirmationV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferOutConfirmationV06
 * ReversalOfTransferOutConfirmationV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInCancellationRequestV06
 * TransferInCancellationRequestV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferInConfirmationV06
 * ReversalOfTransferInConfirmationV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV06
 * AccountOpeningInstructionV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV06
 * AccountDetailsConfirmationV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.RequestForAccountManagementStatusReportV04
 * RequestForAccountManagementStatusReportV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountManagementStatusReportV05
 * AccountManagementStatusReportV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV06
 * AccountModificationInstructionV06}</li>
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
 * "Investment Funds - ISO - Previous version"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Set of messages designed for the investment funds industry to support account management; subscription, redemption and switch order and confirmation; order status reporting, fund cash forecast reporting, price reporting, fund processing passsport, statements of holdings and transactions; transfer and confirmation; transfer status reporting and portfolio transfer."
 * </li>
 * </ul>
 */
public class InvestmentFundsISOPreviousversion {

	final static private AtomicReference<MMMessageSet> mmObject_lazy = new AtomicReference<>();

	final static public MMMessageSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageSet() {
			{
				businessProcessCatalogue_lazy = () -> com.tools20022.repository.GeneratedRepository.catalogue;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Investment Funds - ISO - Previous version";
				definition = "Set of messages designed for the investment funds industry to support account management; subscription, redemption and switch order and confirmation; order status reporting, fund cash forecast reporting, price reporting, fund processing passsport, statements of holdings and transactions; transfer and confirmation; transfer status reporting and portfolio transfer.";
				messageDefinition_lazy = () -> Arrays.asList(FundProcessingPassportReportV02.mmObject(), InvestmentFundReportRequestV02.mmObject(), PriceReportCancellationV04.mmObject(), PriceReportV04.mmObject(),
						AccountingStatementOfHoldingsV02.mmObject(), CustodyStatementOfHoldingsV02.mmObject(), AccountingStatementOfHoldingsCancellationV02.mmObject(), CustodyStatementOfHoldingsCancellationV02.mmObject(),
						FundConfirmedCashForecastReportCancellationV02.mmObject(), FundConfirmedCashForecastReportV03.mmObject(), FundDetailedConfirmedCashForecastReportCancellationV02.mmObject(),
						FundDetailedConfirmedCashForecastReportV03.mmObject(), FundDetailedEstimatedCashForecastReportV03.mmObject(), FundEstimatedCashForecastReportV03.mmObject(), OrderCancellationStatusReportV03.mmObject(),
						OrderConfirmationStatusReportV01.mmObject(), OrderInstructionStatusReportV03.mmObject(), RedemptionBulkOrderCancellationRequestV03.mmObject(), RedemptionBulkOrderConfirmationAmendmentV01.mmObject(),
						RedemptionBulkOrderConfirmationCancellationInstructionV01.mmObject(), RedemptionBulkOrderConfirmationV03.mmObject(), RedemptionBulkOrderV03.mmObject(), RedemptionOrderCancellationRequestV03.mmObject(),
						RedemptionOrderConfirmationAmendmentV01.mmObject(), RedemptionOrderConfirmationCancellationInstructionV01.mmObject(), RedemptionOrderConfirmationV03.mmObject(), RedemptionOrderV03.mmObject(),
						RequestForOrderConfirmationStatusReportV01.mmObject(), RequestForOrderStatusReportV03.mmObject(), SecuritiesMessageRejectionV02.mmObject(), StatementOfInvestmentFundTransactionsCancellationV02.mmObject(),
						StatementOfInvestmentFundTransactionsV02.mmObject(), SubscriptionBulkOrderCancellationRequestV03.mmObject(), SubscriptionBulkOrderConfirmationAmendmentV01.mmObject(),
						SubscriptionBulkOrderConfirmationCancellationInstructionV01.mmObject(), SubscriptionBulkOrderConfirmationV03.mmObject(), SubscriptionBulkOrderV03.mmObject(), SubscriptionOrderCancellationRequestV03.mmObject(),
						SubscriptionOrderConfirmationAmendmentV01.mmObject(), SubscriptionOrderConfirmationCancellationInstructionV01.mmObject(), SubscriptionOrderConfirmationV03.mmObject(), SubscriptionOrderV03.mmObject(),
						SwitchOrderCancellationRequestV03.mmObject(), SwitchOrderConfirmationAmendmentV01.mmObject(), SwitchOrderConfirmationCancellationInstructionV01.mmObject(), SwitchOrderConfirmationV03.mmObject(),
						SwitchOrderV03.mmObject(), TransferInstructionStatusReportV04.mmObject(), AccountHoldingInformationRequestV03.mmObject(), AccountHoldingInformationV04.mmObject(), TransferCancellationStatusReportV04.mmObject(),
						RequestForTransferStatusReportV04.mmObject(), PortfolioTransferCancellationRequestV06.mmObject(), PortfolioTransferConfirmationV06.mmObject(), PortfolioTransferInstructionV06.mmObject(),
						TransferInInstructionV06.mmObject(), TransferOutConfirmationV06.mmObject(), TransferOutInstructionV06.mmObject(), TransferOutCancellationRequestV06.mmObject(), TransferInConfirmationV06.mmObject(),
						ReversalOfTransferOutConfirmationV06.mmObject(), TransferInCancellationRequestV06.mmObject(), ReversalOfTransferInConfirmationV06.mmObject(), AccountOpeningInstructionV06.mmObject(),
						AccountDetailsConfirmationV06.mmObject(), RequestForAccountManagementStatusReportV04.mmObject(), AccountManagementStatusReportV05.mmObject(), AccountModificationInstructionV06.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}