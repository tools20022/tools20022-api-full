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

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.datatype.Max350Text;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Additional information that can not be captured in the structured fields
 * and/or any other specific block.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Extension1#PlaceAndName
 * Extension1.PlaceAndName}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Extension1#Text
 * Extension1.Text}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV02#Extension
 * AccountDetailsConfirmationV02.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV03#Extension
 * AccountDetailsConfirmationV03.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PEPOrISAOrPortfolioInformationV01#Extension
 * PEPOrISAOrPortfolioInformationV01.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV02#Extension
 * AccountHoldingInformationV02.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV03#Extension
 * AccountHoldingInformationV03.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV02#Extension
 * AccountModificationInstructionV02.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV03#Extension
 * AccountModificationInstructionV03.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV02#Extension
 * AccountOpeningInstructionV02.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV03#Extension
 * AccountOpeningInstructionV03.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PEPOrISAOrPortfolioTransferConfirmationV02#Extension
 * PEPOrISAOrPortfolioTransferConfirmationV02.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV03#Extension
 * PortfolioTransferConfirmationV03.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV04#Extension
 * PortfolioTransferConfirmationV04.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PEPOrISAOrPortfolioTransferInstructionV02#Extension
 * PEPOrISAOrPortfolioTransferInstructionV02.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV03#Extension
 * PortfolioTransferInstructionV03.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV04#Extension
 * PortfolioTransferInstructionV04.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.PriceReportCancellationV04#Extension
 * PriceReportCancellationV04.Extension}</li>
 * <li>{@linkplain com.tools20022.repository.area.reda.PriceReportV02#Extension
 * PriceReportV02.Extension}</li>
 * <li>{@linkplain com.tools20022.repository.area.reda.PriceReportV03#Extension
 * PriceReportV03.Extension}</li>
 * <li>{@linkplain com.tools20022.repository.area.reda.PriceReportV04#Extension
 * PriceReportV04.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInConfirmation#Extension
 * TransferInConfirmation.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInConfirmationV02#Extension
 * TransferInConfirmationV02.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInConfirmationV03#Extension
 * TransferInConfirmationV03.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInConfirmationV04#Extension
 * TransferInConfirmationV04.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInInstruction#Extension
 * TransferInInstruction.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInInstructionV02#Extension
 * TransferInInstructionV02.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInInstructionV03#Extension
 * TransferInInstructionV03.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInInstructionV04#Extension
 * TransferInInstructionV04.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutConfirmation#Extension
 * TransferOutConfirmation.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutConfirmationV02#Extension
 * TransferOutConfirmationV02.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutConfirmationV03#Extension
 * TransferOutConfirmationV03.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutConfirmationV04#Extension
 * TransferOutConfirmationV04.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutInstruction#Extension
 * TransferOutInstruction.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutInstructionV02#Extension
 * TransferOutInstructionV02.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutInstructionV03#Extension
 * TransferOutInstructionV03.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutInstructionV04#Extension
 * TransferOutInstructionV04.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.AccountingStatementOfHoldings#Extension
 * AccountingStatementOfHoldings.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.AccountingStatementOfHoldingsV02#Extension
 * AccountingStatementOfHoldingsV02.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.CustodyStatementOfHoldings#Extension
 * CustodyStatementOfHoldings.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.CustodyStatementOfHoldingsV02#Extension
 * CustodyStatementOfHoldingsV02.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundConfirmedCashForecastReportV02#Extension
 * FundConfirmedCashForecastReportV02.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundConfirmedCashForecastReportV03#Extension
 * FundConfirmedCashForecastReportV03.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportV02#Extension
 * FundDetailedConfirmedCashForecastReportV02.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportV03#Extension
 * FundDetailedConfirmedCashForecastReportV03.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedEstimatedCashForecastReportV02#Extension
 * FundDetailedEstimatedCashForecastReportV02.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedEstimatedCashForecastReportV03#Extension
 * FundDetailedEstimatedCashForecastReportV03.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundEstimatedCashForecastReportV02#Extension
 * FundEstimatedCashForecastReportV02.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundEstimatedCashForecastReportV03#Extension
 * FundEstimatedCashForecastReportV03.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.OrderCancellationStatusReportV03#Extension
 * OrderCancellationStatusReportV03.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.OrderConfirmationStatusReportV01#Extension
 * OrderConfirmationStatusReportV01.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.OrderInstructionStatusReportV03#Extension
 * OrderInstructionStatusReportV03.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationAmendmentV01#Extension
 * RedemptionBulkOrderConfirmationAmendmentV01.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationV02#Extension
 * RedemptionBulkOrderConfirmationV02.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationV03#Extension
 * RedemptionBulkOrderConfirmationV03.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderV02#Extension
 * RedemptionBulkOrderV02.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderV03#Extension
 * RedemptionBulkOrderV03.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderConfirmationAmendmentV01#Extension
 * RedemptionOrderConfirmationAmendmentV01.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionMultipleOrderConfirmationV02#Extension
 * RedemptionMultipleOrderConfirmationV02.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderConfirmationV03#Extension
 * RedemptionOrderConfirmationV03.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionMultipleOrderV02#Extension
 * RedemptionMultipleOrderV02.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderV03#Extension
 * RedemptionOrderV03.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RequestForOrderConfirmationStatusReportV01#Extension
 * RequestForOrderConfirmationStatusReportV01.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RequestForOrderStatusReportV03#Extension
 * RequestForOrderStatusReportV03.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.StatementOfInvestmentFundTransactions#Extension
 * StatementOfInvestmentFundTransactions.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.StatementOfInvestmentFundTransactionsV02#Extension
 * StatementOfInvestmentFundTransactionsV02.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationAmendmentV01#Extension
 * SubscriptionBulkOrderConfirmationAmendmentV01.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationV02#Extension
 * SubscriptionBulkOrderConfirmationV02.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationV03#Extension
 * SubscriptionBulkOrderConfirmationV03.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderV02#Extension
 * SubscriptionBulkOrderV02.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderV03#Extension
 * SubscriptionBulkOrderV03.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderConfirmationAmendmentV01#Extension
 * SubscriptionOrderConfirmationAmendmentV01.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionMultipleOrderConfirmationV02#Extension
 * SubscriptionMultipleOrderConfirmationV02.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderConfirmationV03#Extension
 * SubscriptionOrderConfirmationV03.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionMultipleOrderV02#Extension
 * SubscriptionMultipleOrderV02.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderV03#Extension
 * SubscriptionOrderV03.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderConfirmationAmendmentV01#Extension
 * SwitchOrderConfirmationAmendmentV01.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderConfirmationV02#Extension
 * SwitchOrderConfirmationV02.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderConfirmationV03#Extension
 * SwitchOrderConfirmationV03.Extension}</li>
 * <li>{@linkplain com.tools20022.repository.area.setr.SwitchOrderV02#Extension
 * SwitchOrderV02.Extension}</li>
 * <li>{@linkplain com.tools20022.repository.area.setr.SwitchOrderV03#Extension
 * SwitchOrderV03.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.RequestForTransferStatusReportV02#Extension
 * RequestForTransferStatusReportV02.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.RequestForTransferStatusReportV03#Extension
 * RequestForTransferStatusReportV03.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferCancellationStatusReportV02#Extension
 * TransferCancellationStatusReportV02.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferCancellationStatusReportV03#Extension
 * TransferCancellationStatusReportV03.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInstructionStatusReportV02#Extension
 * TransferInstructionStatusReportV02.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInstructionStatusReportV03#Extension
 * TransferInstructionStatusReportV03.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.RequestForPEPOrISAOrPortfolioInformationV01#Extension
 * RequestForPEPOrISAOrPortfolioInformationV01.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationRequestV02#Extension
 * AccountHoldingInformationRequestV02.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.RegulatoryTransactionReportV02#Extension
 * RegulatoryTransactionReportV02.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV04#Extension
 * AccountDetailsConfirmationV04.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV04#Extension
 * AccountModificationInstructionV04.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV04#Extension
 * AccountOpeningInstructionV04.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInConfirmationV05#Extension
 * TransferInConfirmationV05.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInstructionStatusReportV04#Extension
 * TransferInstructionStatusReportV04.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationRequestV03#Extension
 * AccountHoldingInformationRequestV03.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutInstructionV05#Extension
 * TransferOutInstructionV05.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV04#Extension
 * AccountHoldingInformationV04.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferCancellationStatusReportV04#Extension
 * TransferCancellationStatusReportV04.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV05#Extension
 * PortfolioTransferInstructionV05.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInInstructionV05#Extension
 * TransferInInstructionV05.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV05#Extension
 * PortfolioTransferConfirmationV05.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutConfirmationV05#Extension
 * TransferOutConfirmationV05.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.RequestForTransferStatusReportV04#Extension
 * RequestForTransferStatusReportV04.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountManagementStatusReportV04#Extension
 * AccountManagementStatusReportV04.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedEstimatedCashForecastReportV04#Extension
 * FundDetailedEstimatedCashForecastReportV04.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV05#Extension
 * AccountOpeningInstructionV05.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundConfirmedCashForecastReportV04#Extension
 * FundConfirmedCashForecastReportV04.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundEstimatedCashForecastReportV04#Extension
 * FundEstimatedCashForecastReportV04.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV05#Extension
 * AccountModificationInstructionV05.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.StatementOfInvestmentFundTransactionsV03#Extension
 * StatementOfInvestmentFundTransactionsV03.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV05#Extension
 * AccountDetailsConfirmationV05.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportV04#Extension
 * FundDetailedConfirmedCashForecastReportV04.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV06#Extension
 * PortfolioTransferConfirmationV06.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV06#Extension
 * PortfolioTransferInstructionV06.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInInstructionV06#Extension
 * TransferInInstructionV06.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutConfirmationV06#Extension
 * TransferOutConfirmationV06.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutInstructionV06#Extension
 * TransferOutInstructionV06.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInConfirmationV06#Extension
 * TransferInConfirmationV06.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV07#Extension
 * PortfolioTransferInstructionV07.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV05#Extension
 * AccountHoldingInformationV05.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInstructionStatusReportV05#Extension
 * TransferInstructionStatusReportV05.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInConfirmationV07#Extension
 * TransferInConfirmationV07.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV06#Extension
 * AccountOpeningInstructionV06.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutConfirmationV07#Extension
 * TransferOutConfirmationV07.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.RequestForTransferStatusReportV05#Extension
 * RequestForTransferStatusReportV05.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV06#Extension
 * AccountDetailsConfirmationV06.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV07#Extension
 * PortfolioTransferConfirmationV07.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferCancellationStatusReportV05#Extension
 * TransferCancellationStatusReportV05.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutInstructionV07#Extension
 * TransferOutInstructionV07.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountManagementStatusReportV05#Extension
 * AccountManagementStatusReportV05.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV06#Extension
 * AccountModificationInstructionV06.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInInstructionV07#Extension
 * TransferInInstructionV07.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationRequestV04#Extension
 * AccountHoldingInformationRequestV04.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationV04#Extension
 * SubscriptionBulkOrderConfirmationV04.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderV04#Extension
 * RedemptionBulkOrderV04.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderV04#Extension
 * RedemptionOrderV04.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationV04#Extension
 * RedemptionBulkOrderConfirmationV04.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderConfirmationV04#Extension
 * SwitchOrderConfirmationV04.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RequestForOrderStatusReportV04#Extension
 * RequestForOrderStatusReportV04.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderConfirmationV04#Extension
 * SubscriptionOrderConfirmationV04.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.OrderCancellationStatusReportV04#Extension
 * OrderCancellationStatusReportV04.Extension}</li>
 * <li>{@linkplain com.tools20022.repository.area.setr.SwitchOrderV04#Extension
 * SwitchOrderV04.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderConfirmationV04#Extension
 * RedemptionOrderConfirmationV04.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.OrderInstructionStatusReportV04#Extension
 * OrderInstructionStatusReportV04.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RequestForOrderConfirmationStatusReportV02#Extension
 * RequestForOrderConfirmationStatusReportV02.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderV04#Extension
 * SubscriptionBulkOrderV04.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.OrderConfirmationStatusReportV02#Extension
 * OrderConfirmationStatusReportV02.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderV04#Extension
 * SubscriptionOrderV04.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV07#Extension
 * AccountDetailsConfirmationV07.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV07#Extension
 * AccountModificationInstructionV07.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV07#Extension
 * AccountOpeningInstructionV07.Extension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountManagementStatusReportV06#Extension
 * AccountManagementStatusReportV06.Extension}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Extension1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Additional information that can not be captured in the structured fields and/or any other specific block."
 * </li>
 * </ul>
 */
public class Extension1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Name qualifying the information provided in the Text field, and place
	 * where this information should be inserted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Extension1
	 * Extension1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PlcAndNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceAndName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Name qualifying the information provided in the Text field, and place where this information should be inserted."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute PlaceAndName = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Extension1.mmObject();
			isDerived = false;
			xmlTag = "PlcAndNm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceAndName";
			definition = "Name qualifying the information provided in the Text field, and place where this information should be inserted.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	/**
	 * Text of the extension.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Extension1
	 * Extension1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Txt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Text"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Text of the extension."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute Text = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Extension1.mmObject();
			isDerived = false;
			xmlTag = "Txt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Text";
			definition = "Text of the extension.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Extension1.PlaceAndName, com.tools20022.repository.msg.Extension1.Text);
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.acmt.AccountDetailsConfirmationV02.Extension, com.tools20022.repository.area.acmt.AccountDetailsConfirmationV03.Extension,
						com.tools20022.repository.area.sese.PEPOrISAOrPortfolioInformationV01.Extension, com.tools20022.repository.area.sese.AccountHoldingInformationV02.Extension,
						com.tools20022.repository.area.sese.AccountHoldingInformationV03.Extension, com.tools20022.repository.area.acmt.AccountModificationInstructionV02.Extension,
						com.tools20022.repository.area.acmt.AccountModificationInstructionV03.Extension, com.tools20022.repository.area.acmt.AccountOpeningInstructionV02.Extension,
						com.tools20022.repository.area.acmt.AccountOpeningInstructionV03.Extension, com.tools20022.repository.area.sese.PEPOrISAOrPortfolioTransferConfirmationV02.Extension,
						com.tools20022.repository.area.sese.PortfolioTransferConfirmationV03.Extension, com.tools20022.repository.area.sese.PortfolioTransferConfirmationV04.Extension,
						com.tools20022.repository.area.sese.PEPOrISAOrPortfolioTransferInstructionV02.Extension, com.tools20022.repository.area.sese.PortfolioTransferInstructionV03.Extension,
						com.tools20022.repository.area.sese.PortfolioTransferInstructionV04.Extension, com.tools20022.repository.area.reda.PriceReportCancellationV04.Extension, com.tools20022.repository.area.reda.PriceReportV02.Extension,
						com.tools20022.repository.area.reda.PriceReportV03.Extension, com.tools20022.repository.area.reda.PriceReportV04.Extension, com.tools20022.repository.area.sese.TransferInConfirmation.Extension,
						com.tools20022.repository.area.sese.TransferInConfirmationV02.Extension, com.tools20022.repository.area.sese.TransferInConfirmationV03.Extension,
						com.tools20022.repository.area.sese.TransferInConfirmationV04.Extension, com.tools20022.repository.area.sese.TransferInInstruction.Extension, com.tools20022.repository.area.sese.TransferInInstructionV02.Extension,
						com.tools20022.repository.area.sese.TransferInInstructionV03.Extension, com.tools20022.repository.area.sese.TransferInInstructionV04.Extension, com.tools20022.repository.area.sese.TransferOutConfirmation.Extension,
						com.tools20022.repository.area.sese.TransferOutConfirmationV02.Extension, com.tools20022.repository.area.sese.TransferOutConfirmationV03.Extension,
						com.tools20022.repository.area.sese.TransferOutConfirmationV04.Extension, com.tools20022.repository.area.sese.TransferOutInstruction.Extension,
						com.tools20022.repository.area.sese.TransferOutInstructionV02.Extension, com.tools20022.repository.area.sese.TransferOutInstructionV03.Extension,
						com.tools20022.repository.area.sese.TransferOutInstructionV04.Extension, com.tools20022.repository.area.semt.AccountingStatementOfHoldings.Extension,
						com.tools20022.repository.area.semt.AccountingStatementOfHoldingsV02.Extension, com.tools20022.repository.area.semt.CustodyStatementOfHoldings.Extension,
						com.tools20022.repository.area.semt.CustodyStatementOfHoldingsV02.Extension, com.tools20022.repository.area.camt.FundConfirmedCashForecastReportV02.Extension,
						com.tools20022.repository.area.camt.FundConfirmedCashForecastReportV03.Extension, com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportV02.Extension,
						com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportV03.Extension, com.tools20022.repository.area.camt.FundDetailedEstimatedCashForecastReportV02.Extension,
						com.tools20022.repository.area.camt.FundDetailedEstimatedCashForecastReportV03.Extension, com.tools20022.repository.area.camt.FundEstimatedCashForecastReportV02.Extension,
						com.tools20022.repository.area.camt.FundEstimatedCashForecastReportV03.Extension, com.tools20022.repository.area.setr.OrderCancellationStatusReportV03.Extension,
						com.tools20022.repository.area.setr.OrderConfirmationStatusReportV01.Extension, com.tools20022.repository.area.setr.OrderInstructionStatusReportV03.Extension,
						com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationAmendmentV01.Extension, com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationV02.Extension,
						com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationV03.Extension, com.tools20022.repository.area.setr.RedemptionBulkOrderV02.Extension,
						com.tools20022.repository.area.setr.RedemptionBulkOrderV03.Extension, com.tools20022.repository.area.setr.RedemptionOrderConfirmationAmendmentV01.Extension,
						com.tools20022.repository.area.setr.RedemptionMultipleOrderConfirmationV02.Extension, com.tools20022.repository.area.setr.RedemptionOrderConfirmationV03.Extension,
						com.tools20022.repository.area.setr.RedemptionMultipleOrderV02.Extension, com.tools20022.repository.area.setr.RedemptionOrderV03.Extension,
						com.tools20022.repository.area.setr.RequestForOrderConfirmationStatusReportV01.Extension, com.tools20022.repository.area.setr.RequestForOrderStatusReportV03.Extension,
						com.tools20022.repository.area.semt.StatementOfInvestmentFundTransactions.Extension, com.tools20022.repository.area.semt.StatementOfInvestmentFundTransactionsV02.Extension,
						com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationAmendmentV01.Extension, com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationV02.Extension,
						com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationV03.Extension, com.tools20022.repository.area.setr.SubscriptionBulkOrderV02.Extension,
						com.tools20022.repository.area.setr.SubscriptionBulkOrderV03.Extension, com.tools20022.repository.area.setr.SubscriptionOrderConfirmationAmendmentV01.Extension,
						com.tools20022.repository.area.setr.SubscriptionMultipleOrderConfirmationV02.Extension, com.tools20022.repository.area.setr.SubscriptionOrderConfirmationV03.Extension,
						com.tools20022.repository.area.setr.SubscriptionMultipleOrderV02.Extension, com.tools20022.repository.area.setr.SubscriptionOrderV03.Extension,
						com.tools20022.repository.area.setr.SwitchOrderConfirmationAmendmentV01.Extension, com.tools20022.repository.area.setr.SwitchOrderConfirmationV02.Extension,
						com.tools20022.repository.area.setr.SwitchOrderConfirmationV03.Extension, com.tools20022.repository.area.setr.SwitchOrderV02.Extension, com.tools20022.repository.area.setr.SwitchOrderV03.Extension,
						com.tools20022.repository.area.sese.RequestForTransferStatusReportV02.Extension, com.tools20022.repository.area.sese.RequestForTransferStatusReportV03.Extension,
						com.tools20022.repository.area.sese.TransferCancellationStatusReportV02.Extension, com.tools20022.repository.area.sese.TransferCancellationStatusReportV03.Extension,
						com.tools20022.repository.area.sese.TransferInstructionStatusReportV02.Extension, com.tools20022.repository.area.sese.TransferInstructionStatusReportV03.Extension,
						com.tools20022.repository.area.sese.RequestForPEPOrISAOrPortfolioInformationV01.Extension, com.tools20022.repository.area.sese.AccountHoldingInformationRequestV02.Extension,
						com.tools20022.repository.area.auth.RegulatoryTransactionReportV02.Extension, com.tools20022.repository.area.acmt.AccountDetailsConfirmationV04.Extension,
						com.tools20022.repository.area.acmt.AccountModificationInstructionV04.Extension, com.tools20022.repository.area.acmt.AccountOpeningInstructionV04.Extension,
						com.tools20022.repository.area.sese.TransferInConfirmationV05.Extension, com.tools20022.repository.area.sese.TransferInstructionStatusReportV04.Extension,
						com.tools20022.repository.area.sese.AccountHoldingInformationRequestV03.Extension, com.tools20022.repository.area.sese.TransferOutInstructionV05.Extension,
						com.tools20022.repository.area.sese.AccountHoldingInformationV04.Extension, com.tools20022.repository.area.sese.TransferCancellationStatusReportV04.Extension,
						com.tools20022.repository.area.sese.PortfolioTransferInstructionV05.Extension, com.tools20022.repository.area.sese.TransferInInstructionV05.Extension,
						com.tools20022.repository.area.sese.PortfolioTransferConfirmationV05.Extension, com.tools20022.repository.area.sese.TransferOutConfirmationV05.Extension,
						com.tools20022.repository.area.sese.RequestForTransferStatusReportV04.Extension, com.tools20022.repository.area.acmt.AccountManagementStatusReportV04.Extension,
						com.tools20022.repository.area.camt.FundDetailedEstimatedCashForecastReportV04.Extension, com.tools20022.repository.area.acmt.AccountOpeningInstructionV05.Extension,
						com.tools20022.repository.area.camt.FundConfirmedCashForecastReportV04.Extension, com.tools20022.repository.area.camt.FundEstimatedCashForecastReportV04.Extension,
						com.tools20022.repository.area.acmt.AccountModificationInstructionV05.Extension, com.tools20022.repository.area.semt.StatementOfInvestmentFundTransactionsV03.Extension,
						com.tools20022.repository.area.acmt.AccountDetailsConfirmationV05.Extension, com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportV04.Extension,
						com.tools20022.repository.area.sese.PortfolioTransferConfirmationV06.Extension, com.tools20022.repository.area.sese.PortfolioTransferInstructionV06.Extension,
						com.tools20022.repository.area.sese.TransferInInstructionV06.Extension, com.tools20022.repository.area.sese.TransferOutConfirmationV06.Extension,
						com.tools20022.repository.area.sese.TransferOutInstructionV06.Extension, com.tools20022.repository.area.sese.TransferInConfirmationV06.Extension,
						com.tools20022.repository.area.sese.PortfolioTransferInstructionV07.Extension, com.tools20022.repository.area.sese.AccountHoldingInformationV05.Extension,
						com.tools20022.repository.area.sese.TransferInstructionStatusReportV05.Extension, com.tools20022.repository.area.sese.TransferInConfirmationV07.Extension,
						com.tools20022.repository.area.acmt.AccountOpeningInstructionV06.Extension, com.tools20022.repository.area.sese.TransferOutConfirmationV07.Extension,
						com.tools20022.repository.area.sese.RequestForTransferStatusReportV05.Extension, com.tools20022.repository.area.acmt.AccountDetailsConfirmationV06.Extension,
						com.tools20022.repository.area.sese.PortfolioTransferConfirmationV07.Extension, com.tools20022.repository.area.sese.TransferCancellationStatusReportV05.Extension,
						com.tools20022.repository.area.sese.TransferOutInstructionV07.Extension, com.tools20022.repository.area.acmt.AccountManagementStatusReportV05.Extension,
						com.tools20022.repository.area.acmt.AccountModificationInstructionV06.Extension, com.tools20022.repository.area.sese.TransferInInstructionV07.Extension,
						com.tools20022.repository.area.sese.AccountHoldingInformationRequestV04.Extension, com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationV04.Extension,
						com.tools20022.repository.area.setr.RedemptionBulkOrderV04.Extension, com.tools20022.repository.area.setr.RedemptionOrderV04.Extension,
						com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationV04.Extension, com.tools20022.repository.area.setr.SwitchOrderConfirmationV04.Extension,
						com.tools20022.repository.area.setr.RequestForOrderStatusReportV04.Extension, com.tools20022.repository.area.setr.SubscriptionOrderConfirmationV04.Extension,
						com.tools20022.repository.area.setr.OrderCancellationStatusReportV04.Extension, com.tools20022.repository.area.setr.SwitchOrderV04.Extension,
						com.tools20022.repository.area.setr.RedemptionOrderConfirmationV04.Extension, com.tools20022.repository.area.setr.OrderInstructionStatusReportV04.Extension,
						com.tools20022.repository.area.setr.RequestForOrderConfirmationStatusReportV02.Extension, com.tools20022.repository.area.setr.SubscriptionBulkOrderV04.Extension,
						com.tools20022.repository.area.setr.OrderConfirmationStatusReportV02.Extension, com.tools20022.repository.area.setr.SubscriptionOrderV04.Extension,
						com.tools20022.repository.area.acmt.AccountDetailsConfirmationV07.Extension, com.tools20022.repository.area.acmt.AccountModificationInstructionV07.Extension,
						com.tools20022.repository.area.acmt.AccountOpeningInstructionV07.Extension, com.tools20022.repository.area.acmt.AccountManagementStatusReportV06.Extension);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Extension1";
				definition = "Additional information that can not be captured in the structured fields and/or any other specific block.";
			}
		});
		return mmObject_lazy.get();
	}
}