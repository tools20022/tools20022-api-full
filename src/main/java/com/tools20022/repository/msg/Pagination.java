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
import com.tools20022.repository.datatype.Max5NumericText;
import com.tools20022.repository.datatype.YesNoIndicator;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Number used to sequence pages when it is not possible for data to be conveyed
 * in a single message and the data has to be split across several pages
 * (messages).
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Pagination#PageNumber
 * Pagination.PageNumber}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Pagination#LastPageIndicator
 * Pagination.LastPageIndicator}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.PriceReportCancellationV03#MessagePagination
 * PriceReportCancellationV03.MessagePagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.PriceReportCancellationV04#MessagePagination
 * PriceReportCancellationV04.MessagePagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.PriceReportV03#MessagePagination
 * PriceReportV03.MessagePagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.PriceReportV04#MessagePagination
 * PriceReportV04.MessagePagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAuditTrailReportV01#Pagination
 * SecuritiesSettlementTransactionAuditTrailReportV01.Pagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatementReportV01#Pagination
 * CorporateActionInstructionStatementReportV01.Pagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatementReportV02#Pagination
 * CorporateActionInstructionStatementReportV02.Pagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatementReportV03#Pagination
 * CorporateActionInstructionStatementReportV03.Pagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatementReportV04#Pagination
 * CorporateActionInstructionStatementReportV04.Pagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV03#Pagination
 * CorporateActionMovementPreliminaryAdviceV03.Pagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV04#Pagination
 * CorporateActionMovementPreliminaryAdviceV04.Pagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV03#Pagination
 * CorporateActionNotificationV03.Pagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV04#Pagination
 * CorporateActionNotificationV04.Pagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementPostingReportV01#Pagination
 * IntraPositionMovementPostingReportV01.Pagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementPostingReportV02#Pagination
 * IntraPositionMovementPostingReportV02.Pagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementPostingReportV03#Pagination
 * IntraPositionMovementPostingReportV03.Pagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementPostingReportV04#Pagination
 * IntraPositionMovementPostingReportV04.Pagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.AccountingStatementOfHoldings#MessagePagination
 * AccountingStatementOfHoldings.MessagePagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.AccountingStatementOfHoldingsV02#MessagePagination
 * AccountingStatementOfHoldingsV02.MessagePagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV03#Pagination
 * SecuritiesBalanceAccountingReportV03.Pagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV04#Pagination
 * SecuritiesBalanceAccountingReportV04.Pagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV05#Pagination
 * SecuritiesBalanceAccountingReportV05.Pagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV06#Pagination
 * SecuritiesBalanceAccountingReportV06.Pagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.CustodyStatementOfHoldings#MessagePagination
 * CustodyStatementOfHoldings.MessagePagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.CustodyStatementOfHoldingsV02#MessagePagination
 * CustodyStatementOfHoldingsV02.MessagePagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceCustodyReportV03#Pagination
 * SecuritiesBalanceCustodyReportV03.Pagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceCustodyReportV04#Pagination
 * SecuritiesBalanceCustodyReportV04.Pagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceCustodyReportV05#Pagination
 * SecuritiesBalanceCustodyReportV05.Pagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceCustodyReportV06#Pagination
 * SecuritiesBalanceCustodyReportV06.Pagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPendingReportV01#Pagination
 * SecuritiesTransactionPendingReportV01.Pagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPendingReportV02#Pagination
 * SecuritiesTransactionPendingReportV02.Pagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPendingReportV03#Pagination
 * SecuritiesTransactionPendingReportV03.Pagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPendingReportV04#Pagination
 * SecuritiesTransactionPendingReportV04.Pagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV01#Pagination
 * SecuritiesTransactionPostingReportV01.Pagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV02#Pagination
 * SecuritiesTransactionPostingReportV02.Pagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV03#Pagination
 * SecuritiesTransactionPostingReportV03.Pagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV04#Pagination
 * SecuritiesTransactionPostingReportV04.Pagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.other.ForeignExchangeTradeBulkStatusNotificationV02#MessagePagination
 * ForeignExchangeTradeBulkStatusNotificationV02.MessagePagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.AccountingStatementOfHoldingsCancellation#MessagePagination
 * AccountingStatementOfHoldingsCancellation.MessagePagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.AccountingStatementOfHoldingsCancellationV02#MessagePagination
 * AccountingStatementOfHoldingsCancellationV02.MessagePagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.CustodyStatementOfHoldingsCancellation#MessagePagination
 * CustodyStatementOfHoldingsCancellation.MessagePagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.CustodyStatementOfHoldingsCancellationV02#MessagePagination
 * CustodyStatementOfHoldingsCancellationV02.MessagePagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundConfirmedCashForecastReportCancellationV02#MessagePagination
 * FundConfirmedCashForecastReportCancellationV02.MessagePagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundConfirmedCashForecastReportV03#MessagePagination
 * FundConfirmedCashForecastReportV03.MessagePagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportCancellationV02#MessagePagination
 * FundDetailedConfirmedCashForecastReportCancellationV02.MessagePagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportV03#MessagePagination
 * FundDetailedConfirmedCashForecastReportV03.MessagePagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedEstimatedCashForecastReportV03#MessagePagination
 * FundDetailedEstimatedCashForecastReportV03.MessagePagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundEstimatedCashForecastReportV03#MessagePagination
 * FundEstimatedCashForecastReportV03.MessagePagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.StatementOfInvestmentFundTransactionsCancellation#MessagePagination
 * StatementOfInvestmentFundTransactionsCancellation.MessagePagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.StatementOfInvestmentFundTransactionsCancellationV02#MessagePagination
 * StatementOfInvestmentFundTransactionsCancellationV02.MessagePagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.StatementOfInvestmentFundTransactions#MessagePagination
 * StatementOfInvestmentFundTransactions.MessagePagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.StatementOfInvestmentFundTransactionsV02#MessagePagination
 * StatementOfInvestmentFundTransactionsV02.MessagePagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderV03#MessagePagination
 * SwitchOrderV03.MessagePagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferNotificationV01#Pagination
 * PortfolioTransferNotificationV01.Pagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferNotificationV02#Pagination
 * PortfolioTransferNotificationV02.Pagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAllegementReportV01#Pagination
 * SecuritiesSettlementTransactionAllegementReportV01.Pagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAllegementReportV02#Pagination
 * SecuritiesSettlementTransactionAllegementReportV02.Pagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAllegementReportV03#Pagination
 * SecuritiesSettlementTransactionAllegementReportV03.Pagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferNotificationV03#Pagination
 * PortfolioTransferNotificationV03.Pagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesEndOfProcessReportV01#Pagination
 * SecuritiesEndOfProcessReportV01.Pagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.TotalPortfolioValuationReportV01#Pagination
 * TotalPortfolioValuationReportV01.Pagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.secl.MarginReportV02#Pagination
 * MarginReportV02.Pagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.PriceReportCorrectionV03#MessagePagination
 * PriceReportCorrectionV03.MessagePagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV05#Pagination
 * CorporateActionNotificationV05.Pagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV05#Pagination
 * CorporateActionMovementPreliminaryAdviceV05.Pagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPendingReportV05#Pagination
 * SecuritiesTransactionPendingReportV05.Pagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV05#Pagination
 * SecuritiesTransactionPostingReportV05.Pagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceCustodyReportV07#Pagination
 * SecuritiesBalanceCustodyReportV07.Pagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV07#Pagination
 * SecuritiesBalanceAccountingReportV07.Pagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAllegementReportV04#Pagination
 * SecuritiesSettlementTransactionAllegementReportV04.Pagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedEstimatedCashForecastReportV04#MessagePagination
 * FundDetailedEstimatedCashForecastReportV04.MessagePagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundConfirmedCashForecastReportV04#MessagePagination
 * FundConfirmedCashForecastReportV04.MessagePagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportCancellationV03#MessagePagination
 * FundDetailedConfirmedCashForecastReportCancellationV03.MessagePagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundEstimatedCashForecastReportV04#MessagePagination
 * FundEstimatedCashForecastReportV04.MessagePagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.StatementOfInvestmentFundTransactionsV03#MessagePagination
 * StatementOfInvestmentFundTransactionsV03.MessagePagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundConfirmedCashForecastReportCancellationV03#MessagePagination
 * FundConfirmedCashForecastReportCancellationV03.MessagePagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.StatementOfInvestmentFundTransactionsCancellationV03#MessagePagination
 * StatementOfInvestmentFundTransactionsCancellationV03.MessagePagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportV04#MessagePagination
 * FundDetailedConfirmedCashForecastReportV04.MessagePagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.secl.NetPositionV03#Pagination
 * NetPositionV03.Pagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.secl.TradeLegStatementV03#Pagination
 * TradeLegStatementV03.Pagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceCustodyReportV08#Pagination
 * SecuritiesBalanceCustodyReportV08.Pagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPendingReportV06#Pagination
 * SecuritiesTransactionPendingReportV06.Pagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV08#Pagination
 * SecuritiesBalanceAccountingReportV08.Pagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.secl.SettlementObligationReportV03#Pagination
 * SettlementObligationReportV03.Pagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAuditTrailReportV02#Pagination
 * SecuritiesSettlementTransactionAuditTrailReportV02.Pagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV06#Pagination
 * CorporateActionMovementPreliminaryAdviceV06.Pagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.InterestPaymentStatementV03#Pagination
 * InterestPaymentStatementV03.Pagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.CollateralAndExposureReportV02#Pagination
 * CollateralAndExposureReportV02.Pagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceCustodyReportV09#Pagination
 * SecuritiesBalanceCustodyReportV09.Pagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferNotificationV04#Pagination
 * PortfolioTransferNotificationV04.Pagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV06#Pagination
 * SecuritiesTransactionPostingReportV06.Pagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementPostingReportV05#Pagination
 * IntraPositionMovementPostingReportV05.Pagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV09#Pagination
 * SecuritiesBalanceAccountingReportV09.Pagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAllegementReportV05#Pagination
 * SecuritiesSettlementTransactionAllegementReportV05.Pagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAuditTrailReportV03#Pagination
 * SecuritiesSettlementTransactionAuditTrailReportV03.Pagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPendingReportV07#Pagination
 * SecuritiesTransactionPendingReportV07.Pagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV07#Pagination
 * CorporateActionMovementPreliminaryAdviceV07.Pagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatementReportV05#Pagination
 * CorporateActionInstructionStatementReportV05.Pagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV06#Pagination
 * CorporateActionNotificationV06.Pagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.InterestPaymentStatementV04#Pagination
 * InterestPaymentStatementV04.Pagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.CollateralAndExposureReportV03#Pagination
 * CollateralAndExposureReportV03.Pagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAllegementReport002V05#Pagination
 * SecuritiesSettlementTransactionAllegementReport002V05.Pagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferNotification002V04#Pagination
 * PortfolioTransferNotification002V04.Pagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPostingReport002V06#Pagination
 * SecuritiesTransactionPostingReport002V06.Pagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementPostingReport002V05#Pagination
 * IntraPositionMovementPostingReport002V05.Pagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAuditTrailReport002V03#Pagination
 * SecuritiesSettlementTransactionAuditTrailReport002V03.Pagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReport002V09#Pagination
 * SecuritiesBalanceAccountingReport002V09.Pagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPendingReport002V07#Pagination
 * SecuritiesTransactionPendingReport002V07.Pagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceCustodyReport002V09#Pagination
 * SecuritiesBalanceCustodyReport002V09.Pagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceTransparencyReportV02#Pagination
 * SecuritiesBalanceTransparencyReportV02.Pagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderV04#MessagePagination
 * SwitchOrderV04.MessagePagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV07#Pagination
 * CorporateActionNotificationV07.Pagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatementReportV06#Pagination
 * CorporateActionInstructionStatementReportV06.Pagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV08#Pagination
 * CorporateActionMovementPreliminaryAdviceV08.Pagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeBulkStatusNotificationV04#MessagePagination
 * ForeignExchangeTradeBulkStatusNotificationV04.MessagePagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementPostingReportV06#Pagination
 * IntraPositionMovementPostingReportV06.Pagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAllegementReportV06#Pagination
 * SecuritiesSettlementTransactionAllegementReportV06.Pagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPendingReportV08#Pagination
 * SecuritiesTransactionPendingReportV08.Pagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV07#Pagination
 * SecuritiesTransactionPostingReportV07.Pagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPendingReport002V08#Pagination
 * SecuritiesTransactionPendingReport002V08.Pagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdvice002V08#Pagination
 * CorporateActionMovementPreliminaryAdvice002V08.Pagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementPostingReport002V06#Pagination
 * IntraPositionMovementPostingReport002V06.Pagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAllegementReport002V06#Pagination
 * SecuritiesSettlementTransactionAllegementReport002V06.Pagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotification002V07#Pagination
 * CorporateActionNotification002V07.Pagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatementReport002V06#Pagination
 * CorporateActionInstructionStatementReport002V06.Pagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPostingReport002V07#Pagination
 * SecuritiesTransactionPostingReport002V07.Pagination}</li>
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
 * "Pagination"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Number used to sequence pages when it is not possible for data to be conveyed in a single message and the data has to be split across several pages (messages)."
 * </li>
 * </ul>
 */
public class Pagination {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Page number.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max5NumericText
	 * Max5NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Pagination
	 * Pagination}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PgNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PageNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Page number."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute PageNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Pagination.mmObject();
			isDerived = false;
			xmlTag = "PgNb";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PageNumber";
			definition = "Page number.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max5NumericText.mmObject();
		}
	};
	/**
	 * Indicates the last page.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Pagination
	 * Pagination}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LastPgInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LastPageIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the last page."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute LastPageIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Pagination.mmObject();
			isDerived = false;
			xmlTag = "LastPgInd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LastPageIndicator";
			definition = "Indicates the last page.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Pagination.PageNumber, com.tools20022.repository.msg.Pagination.LastPageIndicator);
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.reda.PriceReportCancellationV03.MessagePagination, com.tools20022.repository.area.reda.PriceReportCancellationV04.MessagePagination,
						com.tools20022.repository.area.reda.PriceReportV03.MessagePagination, com.tools20022.repository.area.reda.PriceReportV04.MessagePagination,
						com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAuditTrailReportV01.Pagination, com.tools20022.repository.area.seev.CorporateActionInstructionStatementReportV01.Pagination,
						com.tools20022.repository.area.seev.CorporateActionInstructionStatementReportV02.Pagination, com.tools20022.repository.area.seev.CorporateActionInstructionStatementReportV03.Pagination,
						com.tools20022.repository.area.seev.CorporateActionInstructionStatementReportV04.Pagination, com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV03.Pagination,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV04.Pagination, com.tools20022.repository.area.seev.CorporateActionNotificationV03.Pagination,
						com.tools20022.repository.area.seev.CorporateActionNotificationV04.Pagination, com.tools20022.repository.area.semt.IntraPositionMovementPostingReportV01.Pagination,
						com.tools20022.repository.area.semt.IntraPositionMovementPostingReportV02.Pagination, com.tools20022.repository.area.semt.IntraPositionMovementPostingReportV03.Pagination,
						com.tools20022.repository.area.semt.IntraPositionMovementPostingReportV04.Pagination, com.tools20022.repository.area.semt.AccountingStatementOfHoldings.MessagePagination,
						com.tools20022.repository.area.semt.AccountingStatementOfHoldingsV02.MessagePagination, com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV03.Pagination,
						com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV04.Pagination, com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV05.Pagination,
						com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV06.Pagination, com.tools20022.repository.area.semt.CustodyStatementOfHoldings.MessagePagination,
						com.tools20022.repository.area.semt.CustodyStatementOfHoldingsV02.MessagePagination, com.tools20022.repository.area.semt.SecuritiesBalanceCustodyReportV03.Pagination,
						com.tools20022.repository.area.semt.SecuritiesBalanceCustodyReportV04.Pagination, com.tools20022.repository.area.semt.SecuritiesBalanceCustodyReportV05.Pagination,
						com.tools20022.repository.area.semt.SecuritiesBalanceCustodyReportV06.Pagination, com.tools20022.repository.area.semt.SecuritiesTransactionPendingReportV01.Pagination,
						com.tools20022.repository.area.semt.SecuritiesTransactionPendingReportV02.Pagination, com.tools20022.repository.area.semt.SecuritiesTransactionPendingReportV03.Pagination,
						com.tools20022.repository.area.semt.SecuritiesTransactionPendingReportV04.Pagination, com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV01.Pagination,
						com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV02.Pagination, com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV03.Pagination,
						com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV04.Pagination, com.tools20022.repository.area.other.ForeignExchangeTradeBulkStatusNotificationV02.MessagePagination,
						com.tools20022.repository.area.semt.AccountingStatementOfHoldingsCancellation.MessagePagination, com.tools20022.repository.area.semt.AccountingStatementOfHoldingsCancellationV02.MessagePagination,
						com.tools20022.repository.area.semt.CustodyStatementOfHoldingsCancellation.MessagePagination, com.tools20022.repository.area.semt.CustodyStatementOfHoldingsCancellationV02.MessagePagination,
						com.tools20022.repository.area.camt.FundConfirmedCashForecastReportCancellationV02.MessagePagination, com.tools20022.repository.area.camt.FundConfirmedCashForecastReportV03.MessagePagination,
						com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportCancellationV02.MessagePagination, com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportV03.MessagePagination,
						com.tools20022.repository.area.camt.FundDetailedEstimatedCashForecastReportV03.MessagePagination, com.tools20022.repository.area.camt.FundEstimatedCashForecastReportV03.MessagePagination,
						com.tools20022.repository.area.semt.StatementOfInvestmentFundTransactionsCancellation.MessagePagination, com.tools20022.repository.area.semt.StatementOfInvestmentFundTransactionsCancellationV02.MessagePagination,
						com.tools20022.repository.area.semt.StatementOfInvestmentFundTransactions.MessagePagination, com.tools20022.repository.area.semt.StatementOfInvestmentFundTransactionsV02.MessagePagination,
						com.tools20022.repository.area.setr.SwitchOrderV03.MessagePagination, com.tools20022.repository.area.sese.PortfolioTransferNotificationV01.Pagination,
						com.tools20022.repository.area.sese.PortfolioTransferNotificationV02.Pagination, com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAllegementReportV01.Pagination,
						com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAllegementReportV02.Pagination, com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAllegementReportV03.Pagination,
						com.tools20022.repository.area.sese.PortfolioTransferNotificationV03.Pagination, com.tools20022.repository.area.semt.SecuritiesEndOfProcessReportV01.Pagination,
						com.tools20022.repository.area.semt.TotalPortfolioValuationReportV01.Pagination, com.tools20022.repository.area.secl.MarginReportV02.Pagination,
						com.tools20022.repository.area.reda.PriceReportCorrectionV03.MessagePagination, com.tools20022.repository.area.seev.CorporateActionNotificationV05.Pagination,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV05.Pagination, com.tools20022.repository.area.semt.SecuritiesTransactionPendingReportV05.Pagination,
						com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV05.Pagination, com.tools20022.repository.area.semt.SecuritiesBalanceCustodyReportV07.Pagination,
						com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV07.Pagination, com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAllegementReportV04.Pagination,
						com.tools20022.repository.area.camt.FundDetailedEstimatedCashForecastReportV04.MessagePagination, com.tools20022.repository.area.camt.FundConfirmedCashForecastReportV04.MessagePagination,
						com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportCancellationV03.MessagePagination, com.tools20022.repository.area.camt.FundEstimatedCashForecastReportV04.MessagePagination,
						com.tools20022.repository.area.semt.StatementOfInvestmentFundTransactionsV03.MessagePagination, com.tools20022.repository.area.camt.FundConfirmedCashForecastReportCancellationV03.MessagePagination,
						com.tools20022.repository.area.semt.StatementOfInvestmentFundTransactionsCancellationV03.MessagePagination, com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportV04.MessagePagination,
						com.tools20022.repository.area.secl.NetPositionV03.Pagination, com.tools20022.repository.area.secl.TradeLegStatementV03.Pagination, com.tools20022.repository.area.semt.SecuritiesBalanceCustodyReportV08.Pagination,
						com.tools20022.repository.area.semt.SecuritiesTransactionPendingReportV06.Pagination, com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV08.Pagination,
						com.tools20022.repository.area.secl.SettlementObligationReportV03.Pagination, com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAuditTrailReportV02.Pagination,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV06.Pagination, com.tools20022.repository.area.colr.InterestPaymentStatementV03.Pagination,
						com.tools20022.repository.area.colr.CollateralAndExposureReportV02.Pagination, com.tools20022.repository.area.semt.SecuritiesBalanceCustodyReportV09.Pagination,
						com.tools20022.repository.area.sese.PortfolioTransferNotificationV04.Pagination, com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV06.Pagination,
						com.tools20022.repository.area.semt.IntraPositionMovementPostingReportV05.Pagination, com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV09.Pagination,
						com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAllegementReportV05.Pagination, com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAuditTrailReportV03.Pagination,
						com.tools20022.repository.area.semt.SecuritiesTransactionPendingReportV07.Pagination, com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV07.Pagination,
						com.tools20022.repository.area.seev.CorporateActionInstructionStatementReportV05.Pagination, com.tools20022.repository.area.seev.CorporateActionNotificationV06.Pagination,
						com.tools20022.repository.area.colr.InterestPaymentStatementV04.Pagination, com.tools20022.repository.area.colr.CollateralAndExposureReportV03.Pagination,
						com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAllegementReport002V05.Pagination, com.tools20022.repository.area.sese.PortfolioTransferNotification002V04.Pagination,
						com.tools20022.repository.area.semt.SecuritiesTransactionPostingReport002V06.Pagination, com.tools20022.repository.area.semt.IntraPositionMovementPostingReport002V05.Pagination,
						com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAuditTrailReport002V03.Pagination, com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReport002V09.Pagination,
						com.tools20022.repository.area.semt.SecuritiesTransactionPendingReport002V07.Pagination, com.tools20022.repository.area.semt.SecuritiesBalanceCustodyReport002V09.Pagination,
						com.tools20022.repository.area.semt.SecuritiesBalanceTransparencyReportV02.Pagination, com.tools20022.repository.area.setr.SwitchOrderV04.MessagePagination,
						com.tools20022.repository.area.seev.CorporateActionNotificationV07.Pagination, com.tools20022.repository.area.seev.CorporateActionInstructionStatementReportV06.Pagination,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV08.Pagination, com.tools20022.repository.area.fxtr.ForeignExchangeTradeBulkStatusNotificationV04.MessagePagination,
						com.tools20022.repository.area.semt.IntraPositionMovementPostingReportV06.Pagination, com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAllegementReportV06.Pagination,
						com.tools20022.repository.area.semt.SecuritiesTransactionPendingReportV08.Pagination, com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV07.Pagination,
						com.tools20022.repository.area.semt.SecuritiesTransactionPendingReport002V08.Pagination, com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdvice002V08.Pagination,
						com.tools20022.repository.area.semt.IntraPositionMovementPostingReport002V06.Pagination, com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAllegementReport002V06.Pagination,
						com.tools20022.repository.area.seev.CorporateActionNotification002V07.Pagination, com.tools20022.repository.area.seev.CorporateActionInstructionStatementReport002V06.Pagination,
						com.tools20022.repository.area.semt.SecuritiesTransactionPostingReport002V07.Pagination);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Pagination";
				definition = "Number used to sequence pages when it is not possible for data to be conveyed in a single message and the data has to be split across several pages (messages).";
			}
		});
		return mmObject_lazy.get();
	}
}