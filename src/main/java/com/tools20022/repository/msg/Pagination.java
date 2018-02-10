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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.camt.*;
import com.tools20022.repository.area.colr.CollateralAndExposureReportV02;
import com.tools20022.repository.area.colr.CollateralAndExposureReportV03;
import com.tools20022.repository.area.colr.InterestPaymentStatementV03;
import com.tools20022.repository.area.colr.InterestPaymentStatementV04;
import com.tools20022.repository.area.fxtr.ForeignExchangeTradeBulkStatusNotificationV04;
import com.tools20022.repository.area.other.ForeignExchangeTradeBulkStatusNotificationV02;
import com.tools20022.repository.area.reda.*;
import com.tools20022.repository.area.secl.MarginReportV02;
import com.tools20022.repository.area.secl.NetPositionV03;
import com.tools20022.repository.area.secl.SettlementObligationReportV03;
import com.tools20022.repository.area.secl.TradeLegStatementV03;
import com.tools20022.repository.area.seev.*;
import com.tools20022.repository.area.semt.*;
import com.tools20022.repository.area.sese.*;
import com.tools20022.repository.area.setr.SwitchOrderV03;
import com.tools20022.repository.area.setr.SwitchOrderV04;
import com.tools20022.repository.datatype.Max5NumericText;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.GeneratedRepository;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

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
 * <li>{@linkplain com.tools20022.repository.msg.Pagination#mmPageNumber
 * Pagination.mmPageNumber}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Pagination#mmLastPageIndicator
 * Pagination.mmLastPageIndicator}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.PriceReportCancellationV03#mmMessagePagination
 * PriceReportCancellationV03.mmMessagePagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.PriceReportCancellationV04#mmMessagePagination
 * PriceReportCancellationV04.mmMessagePagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.PriceReportV03#mmMessagePagination
 * PriceReportV03.mmMessagePagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.PriceReportV04#mmMessagePagination
 * PriceReportV04.mmMessagePagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAuditTrailReportV01#mmPagination
 * SecuritiesSettlementTransactionAuditTrailReportV01.mmPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatementReportV01#mmPagination
 * CorporateActionInstructionStatementReportV01.mmPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatementReportV02#mmPagination
 * CorporateActionInstructionStatementReportV02.mmPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatementReportV03#mmPagination
 * CorporateActionInstructionStatementReportV03.mmPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatementReportV04#mmPagination
 * CorporateActionInstructionStatementReportV04.mmPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV03#mmPagination
 * CorporateActionMovementPreliminaryAdviceV03.mmPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV04#mmPagination
 * CorporateActionMovementPreliminaryAdviceV04.mmPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV03#mmPagination
 * CorporateActionNotificationV03.mmPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV04#mmPagination
 * CorporateActionNotificationV04.mmPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementPostingReportV01#mmPagination
 * IntraPositionMovementPostingReportV01.mmPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementPostingReportV02#mmPagination
 * IntraPositionMovementPostingReportV02.mmPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementPostingReportV03#mmPagination
 * IntraPositionMovementPostingReportV03.mmPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementPostingReportV04#mmPagination
 * IntraPositionMovementPostingReportV04.mmPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.AccountingStatementOfHoldings#mmMessagePagination
 * AccountingStatementOfHoldings.mmMessagePagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.AccountingStatementOfHoldingsV02#mmMessagePagination
 * AccountingStatementOfHoldingsV02.mmMessagePagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV03#mmPagination
 * SecuritiesBalanceAccountingReportV03.mmPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV04#mmPagination
 * SecuritiesBalanceAccountingReportV04.mmPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV05#mmPagination
 * SecuritiesBalanceAccountingReportV05.mmPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV06#mmPagination
 * SecuritiesBalanceAccountingReportV06.mmPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.CustodyStatementOfHoldings#mmMessagePagination
 * CustodyStatementOfHoldings.mmMessagePagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.CustodyStatementOfHoldingsV02#mmMessagePagination
 * CustodyStatementOfHoldingsV02.mmMessagePagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceCustodyReportV03#mmPagination
 * SecuritiesBalanceCustodyReportV03.mmPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceCustodyReportV04#mmPagination
 * SecuritiesBalanceCustodyReportV04.mmPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceCustodyReportV05#mmPagination
 * SecuritiesBalanceCustodyReportV05.mmPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceCustodyReportV06#mmPagination
 * SecuritiesBalanceCustodyReportV06.mmPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPendingReportV01#mmPagination
 * SecuritiesTransactionPendingReportV01.mmPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPendingReportV02#mmPagination
 * SecuritiesTransactionPendingReportV02.mmPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPendingReportV03#mmPagination
 * SecuritiesTransactionPendingReportV03.mmPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPendingReportV04#mmPagination
 * SecuritiesTransactionPendingReportV04.mmPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV01#mmPagination
 * SecuritiesTransactionPostingReportV01.mmPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV02#mmPagination
 * SecuritiesTransactionPostingReportV02.mmPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV03#mmPagination
 * SecuritiesTransactionPostingReportV03.mmPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV04#mmPagination
 * SecuritiesTransactionPostingReportV04.mmPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.other.ForeignExchangeTradeBulkStatusNotificationV02#mmMessagePagination
 * ForeignExchangeTradeBulkStatusNotificationV02.mmMessagePagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.AccountingStatementOfHoldingsCancellation#mmMessagePagination
 * AccountingStatementOfHoldingsCancellation.mmMessagePagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.AccountingStatementOfHoldingsCancellationV02#mmMessagePagination
 * AccountingStatementOfHoldingsCancellationV02.mmMessagePagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.CustodyStatementOfHoldingsCancellation#mmMessagePagination
 * CustodyStatementOfHoldingsCancellation.mmMessagePagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.CustodyStatementOfHoldingsCancellationV02#mmMessagePagination
 * CustodyStatementOfHoldingsCancellationV02.mmMessagePagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundConfirmedCashForecastReportCancellationV02#mmMessagePagination
 * FundConfirmedCashForecastReportCancellationV02.mmMessagePagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundConfirmedCashForecastReportV03#mmMessagePagination
 * FundConfirmedCashForecastReportV03.mmMessagePagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportCancellationV02#mmMessagePagination
 * FundDetailedConfirmedCashForecastReportCancellationV02.mmMessagePagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportV03#mmMessagePagination
 * FundDetailedConfirmedCashForecastReportV03.mmMessagePagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedEstimatedCashForecastReportV03#mmMessagePagination
 * FundDetailedEstimatedCashForecastReportV03.mmMessagePagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundEstimatedCashForecastReportV03#mmMessagePagination
 * FundEstimatedCashForecastReportV03.mmMessagePagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.StatementOfInvestmentFundTransactionsCancellation#mmMessagePagination
 * StatementOfInvestmentFundTransactionsCancellation.mmMessagePagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.StatementOfInvestmentFundTransactionsCancellationV02#mmMessagePagination
 * StatementOfInvestmentFundTransactionsCancellationV02.mmMessagePagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.StatementOfInvestmentFundTransactions#mmMessagePagination
 * StatementOfInvestmentFundTransactions.mmMessagePagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.StatementOfInvestmentFundTransactionsV02#mmMessagePagination
 * StatementOfInvestmentFundTransactionsV02.mmMessagePagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderV03#mmMessagePagination
 * SwitchOrderV03.mmMessagePagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferNotificationV01#mmPagination
 * PortfolioTransferNotificationV01.mmPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferNotificationV02#mmPagination
 * PortfolioTransferNotificationV02.mmPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAllegementReportV01#mmPagination
 * SecuritiesSettlementTransactionAllegementReportV01.mmPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAllegementReportV02#mmPagination
 * SecuritiesSettlementTransactionAllegementReportV02.mmPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAllegementReportV03#mmPagination
 * SecuritiesSettlementTransactionAllegementReportV03.mmPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferNotificationV03#mmPagination
 * PortfolioTransferNotificationV03.mmPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesEndOfProcessReportV01#mmPagination
 * SecuritiesEndOfProcessReportV01.mmPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.TotalPortfolioValuationReportV01#mmPagination
 * TotalPortfolioValuationReportV01.mmPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.secl.MarginReportV02#mmPagination
 * MarginReportV02.mmPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.PriceReportCorrectionV03#mmMessagePagination
 * PriceReportCorrectionV03.mmMessagePagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV05#mmPagination
 * CorporateActionNotificationV05.mmPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV05#mmPagination
 * CorporateActionMovementPreliminaryAdviceV05.mmPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPendingReportV05#mmPagination
 * SecuritiesTransactionPendingReportV05.mmPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV05#mmPagination
 * SecuritiesTransactionPostingReportV05.mmPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceCustodyReportV07#mmPagination
 * SecuritiesBalanceCustodyReportV07.mmPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV07#mmPagination
 * SecuritiesBalanceAccountingReportV07.mmPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAllegementReportV04#mmPagination
 * SecuritiesSettlementTransactionAllegementReportV04.mmPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedEstimatedCashForecastReportV04#mmMessagePagination
 * FundDetailedEstimatedCashForecastReportV04.mmMessagePagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundConfirmedCashForecastReportV04#mmMessagePagination
 * FundConfirmedCashForecastReportV04.mmMessagePagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportCancellationV03#mmMessagePagination
 * FundDetailedConfirmedCashForecastReportCancellationV03.mmMessagePagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundEstimatedCashForecastReportV04#mmMessagePagination
 * FundEstimatedCashForecastReportV04.mmMessagePagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.StatementOfInvestmentFundTransactionsV03#mmMessagePagination
 * StatementOfInvestmentFundTransactionsV03.mmMessagePagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundConfirmedCashForecastReportCancellationV03#mmMessagePagination
 * FundConfirmedCashForecastReportCancellationV03.mmMessagePagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.StatementOfInvestmentFundTransactionsCancellationV03#mmMessagePagination
 * StatementOfInvestmentFundTransactionsCancellationV03.mmMessagePagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportV04#mmMessagePagination
 * FundDetailedConfirmedCashForecastReportV04.mmMessagePagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.secl.NetPositionV03#mmPagination
 * NetPositionV03.mmPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.secl.TradeLegStatementV03#mmPagination
 * TradeLegStatementV03.mmPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceCustodyReportV08#mmPagination
 * SecuritiesBalanceCustodyReportV08.mmPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPendingReportV06#mmPagination
 * SecuritiesTransactionPendingReportV06.mmPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV08#mmPagination
 * SecuritiesBalanceAccountingReportV08.mmPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.secl.SettlementObligationReportV03#mmPagination
 * SettlementObligationReportV03.mmPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAuditTrailReportV02#mmPagination
 * SecuritiesSettlementTransactionAuditTrailReportV02.mmPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV06#mmPagination
 * CorporateActionMovementPreliminaryAdviceV06.mmPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.InterestPaymentStatementV03#mmPagination
 * InterestPaymentStatementV03.mmPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.CollateralAndExposureReportV02#mmPagination
 * CollateralAndExposureReportV02.mmPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceCustodyReportV09#mmPagination
 * SecuritiesBalanceCustodyReportV09.mmPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferNotificationV04#mmPagination
 * PortfolioTransferNotificationV04.mmPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV06#mmPagination
 * SecuritiesTransactionPostingReportV06.mmPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementPostingReportV05#mmPagination
 * IntraPositionMovementPostingReportV05.mmPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV09#mmPagination
 * SecuritiesBalanceAccountingReportV09.mmPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAllegementReportV05#mmPagination
 * SecuritiesSettlementTransactionAllegementReportV05.mmPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAuditTrailReportV03#mmPagination
 * SecuritiesSettlementTransactionAuditTrailReportV03.mmPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPendingReportV07#mmPagination
 * SecuritiesTransactionPendingReportV07.mmPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV07#mmPagination
 * CorporateActionMovementPreliminaryAdviceV07.mmPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatementReportV05#mmPagination
 * CorporateActionInstructionStatementReportV05.mmPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV06#mmPagination
 * CorporateActionNotificationV06.mmPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.InterestPaymentStatementV04#mmPagination
 * InterestPaymentStatementV04.mmPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.CollateralAndExposureReportV03#mmPagination
 * CollateralAndExposureReportV03.mmPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAllegementReport002V05#mmPagination
 * SecuritiesSettlementTransactionAllegementReport002V05.mmPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferNotification002V04#mmPagination
 * PortfolioTransferNotification002V04.mmPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPostingReport002V06#mmPagination
 * SecuritiesTransactionPostingReport002V06.mmPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementPostingReport002V05#mmPagination
 * IntraPositionMovementPostingReport002V05.mmPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAuditTrailReport002V03#mmPagination
 * SecuritiesSettlementTransactionAuditTrailReport002V03.mmPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReport002V09#mmPagination
 * SecuritiesBalanceAccountingReport002V09.mmPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPendingReport002V07#mmPagination
 * SecuritiesTransactionPendingReport002V07.mmPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceCustodyReport002V09#mmPagination
 * SecuritiesBalanceCustodyReport002V09.mmPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceTransparencyReportV02#mmPagination
 * SecuritiesBalanceTransparencyReportV02.mmPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderV04#mmMessagePagination
 * SwitchOrderV04.mmMessagePagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV07#mmPagination
 * CorporateActionNotificationV07.mmPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatementReportV06#mmPagination
 * CorporateActionInstructionStatementReportV06.mmPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV08#mmPagination
 * CorporateActionMovementPreliminaryAdviceV08.mmPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeBulkStatusNotificationV04#mmMessagePagination
 * ForeignExchangeTradeBulkStatusNotificationV04.mmMessagePagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementPostingReportV06#mmPagination
 * IntraPositionMovementPostingReportV06.mmPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAllegementReportV06#mmPagination
 * SecuritiesSettlementTransactionAllegementReportV06.mmPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPendingReportV08#mmPagination
 * SecuritiesTransactionPendingReportV08.mmPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV07#mmPagination
 * SecuritiesTransactionPostingReportV07.mmPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.SecuritiesTransactionPendingReport002V08#mmPagination
 * SecuritiesTransactionPendingReport002V08.mmPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdvice002V08#mmPagination
 * CorporateActionMovementPreliminaryAdvice002V08.mmPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.IntraPositionMovementPostingReport002V06#mmPagination
 * IntraPositionMovementPostingReport002V06.mmPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.SecuritiesSettlementTransactionAllegementReport002V06#mmPagination
 * SecuritiesSettlementTransactionAllegementReport002V06.mmPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotification002V07#mmPagination
 * CorporateActionNotification002V07.mmPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatementReport002V06#mmPagination
 * CorporateActionInstructionStatementReport002V06.mmPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.SecuritiesTransactionPostingReport002V07#mmPagination
 * SecuritiesTransactionPostingReport002V07.mmPagination}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2018</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Pagination"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Number used to sequence pages when it is not possible for data to be conveyed in a single message and the data has to be split across several pages (messages)."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Pagination1 Pagination1}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Pagination", propOrder = {"pageNumber", "lastPageIndicator"})
public class Pagination {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PgNb", required = true)
	protected Max5NumericText pageNumber;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Pagination1#mmPageNumber
	 * Pagination1.mmPageNumber}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPageNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Pagination.mmObject();
			isDerived = false;
			xmlTag = "PgNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PageNumber";
			definition = "Page number.";
			nextVersions_lazy = () -> Arrays.asList(Pagination1.mmPageNumber);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max5NumericText.mmObject();
		}
	};
	@XmlElement(name = "LastPgInd", required = true)
	protected YesNoIndicator lastPageIndicator;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Pagination1#mmLastPageIndicator
	 * Pagination1.mmLastPageIndicator}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLastPageIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Pagination.mmObject();
			isDerived = false;
			xmlTag = "LastPgInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LastPageIndicator";
			definition = "Indicates the last page.";
			nextVersions_lazy = () -> Arrays.asList(Pagination1.mmLastPageIndicator);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Pagination.mmPageNumber, com.tools20022.repository.msg.Pagination.mmLastPageIndicator);
				messageBuildingBlock_lazy = () -> Arrays.asList(PriceReportCancellationV03.mmMessagePagination, PriceReportCancellationV04.mmMessagePagination, PriceReportV03.mmMessagePagination, PriceReportV04.mmMessagePagination,
						SecuritiesSettlementTransactionAuditTrailReportV01.mmPagination, CorporateActionInstructionStatementReportV01.mmPagination, CorporateActionInstructionStatementReportV02.mmPagination,
						CorporateActionInstructionStatementReportV03.mmPagination, CorporateActionInstructionStatementReportV04.mmPagination, CorporateActionMovementPreliminaryAdviceV03.mmPagination,
						CorporateActionMovementPreliminaryAdviceV04.mmPagination, CorporateActionNotificationV03.mmPagination, CorporateActionNotificationV04.mmPagination, IntraPositionMovementPostingReportV01.mmPagination,
						IntraPositionMovementPostingReportV02.mmPagination, IntraPositionMovementPostingReportV03.mmPagination, IntraPositionMovementPostingReportV04.mmPagination, AccountingStatementOfHoldings.mmMessagePagination,
						AccountingStatementOfHoldingsV02.mmMessagePagination, SecuritiesBalanceAccountingReportV03.mmPagination, SecuritiesBalanceAccountingReportV04.mmPagination, SecuritiesBalanceAccountingReportV05.mmPagination,
						SecuritiesBalanceAccountingReportV06.mmPagination, CustodyStatementOfHoldings.mmMessagePagination, CustodyStatementOfHoldingsV02.mmMessagePagination, SecuritiesBalanceCustodyReportV03.mmPagination,
						SecuritiesBalanceCustodyReportV04.mmPagination, SecuritiesBalanceCustodyReportV05.mmPagination, SecuritiesBalanceCustodyReportV06.mmPagination, SecuritiesTransactionPendingReportV01.mmPagination,
						SecuritiesTransactionPendingReportV02.mmPagination, SecuritiesTransactionPendingReportV03.mmPagination, SecuritiesTransactionPendingReportV04.mmPagination, SecuritiesTransactionPostingReportV01.mmPagination,
						SecuritiesTransactionPostingReportV02.mmPagination, SecuritiesTransactionPostingReportV03.mmPagination, SecuritiesTransactionPostingReportV04.mmPagination,
						ForeignExchangeTradeBulkStatusNotificationV02.mmMessagePagination, AccountingStatementOfHoldingsCancellation.mmMessagePagination, AccountingStatementOfHoldingsCancellationV02.mmMessagePagination,
						CustodyStatementOfHoldingsCancellation.mmMessagePagination, CustodyStatementOfHoldingsCancellationV02.mmMessagePagination, FundConfirmedCashForecastReportCancellationV02.mmMessagePagination,
						FundConfirmedCashForecastReportV03.mmMessagePagination, FundDetailedConfirmedCashForecastReportCancellationV02.mmMessagePagination, FundDetailedConfirmedCashForecastReportV03.mmMessagePagination,
						FundDetailedEstimatedCashForecastReportV03.mmMessagePagination, FundEstimatedCashForecastReportV03.mmMessagePagination, StatementOfInvestmentFundTransactionsCancellation.mmMessagePagination,
						StatementOfInvestmentFundTransactionsCancellationV02.mmMessagePagination, StatementOfInvestmentFundTransactions.mmMessagePagination, StatementOfInvestmentFundTransactionsV02.mmMessagePagination,
						SwitchOrderV03.mmMessagePagination, PortfolioTransferNotificationV01.mmPagination, PortfolioTransferNotificationV02.mmPagination, SecuritiesSettlementTransactionAllegementReportV01.mmPagination,
						SecuritiesSettlementTransactionAllegementReportV02.mmPagination, SecuritiesSettlementTransactionAllegementReportV03.mmPagination, PortfolioTransferNotificationV03.mmPagination,
						SecuritiesEndOfProcessReportV01.mmPagination, TotalPortfolioValuationReportV01.mmPagination, MarginReportV02.mmPagination, PriceReportCorrectionV03.mmMessagePagination, CorporateActionNotificationV05.mmPagination,
						CorporateActionMovementPreliminaryAdviceV05.mmPagination, SecuritiesTransactionPendingReportV05.mmPagination, SecuritiesTransactionPostingReportV05.mmPagination, SecuritiesBalanceCustodyReportV07.mmPagination,
						SecuritiesBalanceAccountingReportV07.mmPagination, SecuritiesSettlementTransactionAllegementReportV04.mmPagination, FundDetailedEstimatedCashForecastReportV04.mmMessagePagination,
						FundConfirmedCashForecastReportV04.mmMessagePagination, FundDetailedConfirmedCashForecastReportCancellationV03.mmMessagePagination, FundEstimatedCashForecastReportV04.mmMessagePagination,
						StatementOfInvestmentFundTransactionsV03.mmMessagePagination, FundConfirmedCashForecastReportCancellationV03.mmMessagePagination, StatementOfInvestmentFundTransactionsCancellationV03.mmMessagePagination,
						FundDetailedConfirmedCashForecastReportV04.mmMessagePagination, NetPositionV03.mmPagination, TradeLegStatementV03.mmPagination, SecuritiesBalanceCustodyReportV08.mmPagination,
						SecuritiesTransactionPendingReportV06.mmPagination, SecuritiesBalanceAccountingReportV08.mmPagination, SettlementObligationReportV03.mmPagination, SecuritiesSettlementTransactionAuditTrailReportV02.mmPagination,
						CorporateActionMovementPreliminaryAdviceV06.mmPagination, InterestPaymentStatementV03.mmPagination, CollateralAndExposureReportV02.mmPagination, SecuritiesBalanceCustodyReportV09.mmPagination,
						PortfolioTransferNotificationV04.mmPagination, SecuritiesTransactionPostingReportV06.mmPagination, IntraPositionMovementPostingReportV05.mmPagination, SecuritiesBalanceAccountingReportV09.mmPagination,
						SecuritiesSettlementTransactionAllegementReportV05.mmPagination, SecuritiesSettlementTransactionAuditTrailReportV03.mmPagination, SecuritiesTransactionPendingReportV07.mmPagination,
						CorporateActionMovementPreliminaryAdviceV07.mmPagination, CorporateActionInstructionStatementReportV05.mmPagination, CorporateActionNotificationV06.mmPagination, InterestPaymentStatementV04.mmPagination,
						CollateralAndExposureReportV03.mmPagination, SecuritiesSettlementTransactionAllegementReport002V05.mmPagination, PortfolioTransferNotification002V04.mmPagination,
						SecuritiesTransactionPostingReport002V06.mmPagination, IntraPositionMovementPostingReport002V05.mmPagination, SecuritiesSettlementTransactionAuditTrailReport002V03.mmPagination,
						SecuritiesBalanceAccountingReport002V09.mmPagination, SecuritiesTransactionPendingReport002V07.mmPagination, SecuritiesBalanceCustodyReport002V09.mmPagination, SecuritiesBalanceTransparencyReportV02.mmPagination,
						SwitchOrderV04.mmMessagePagination, CorporateActionNotificationV07.mmPagination, CorporateActionInstructionStatementReportV06.mmPagination, CorporateActionMovementPreliminaryAdviceV08.mmPagination,
						ForeignExchangeTradeBulkStatusNotificationV04.mmMessagePagination, IntraPositionMovementPostingReportV06.mmPagination, SecuritiesSettlementTransactionAllegementReportV06.mmPagination,
						SecuritiesTransactionPendingReportV08.mmPagination, SecuritiesTransactionPostingReportV07.mmPagination, SecuritiesTransactionPendingReport002V08.mmPagination,
						CorporateActionMovementPreliminaryAdvice002V08.mmPagination, IntraPositionMovementPostingReport002V06.mmPagination, SecuritiesSettlementTransactionAllegementReport002V06.mmPagination,
						CorporateActionNotification002V07.mmPagination, CorporateActionInstructionStatementReport002V06.mmPagination, SecuritiesTransactionPostingReport002V07.mmPagination);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2018");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "Pagination";
				definition = "Number used to sequence pages when it is not possible for data to be conveyed in a single message and the data has to be split across several pages (messages).";
				nextVersions_lazy = () -> Arrays.asList(Pagination1.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Max5NumericText getPageNumber() {
		return pageNumber;
	}

	public Pagination setPageNumber(Max5NumericText pageNumber) {
		this.pageNumber = Objects.requireNonNull(pageNumber);
		return this;
	}

	public YesNoIndicator getLastPageIndicator() {
		return lastPageIndicator;
	}

	public Pagination setLastPageIndicator(YesNoIndicator lastPageIndicator) {
		this.lastPageIndicator = Objects.requireNonNull(lastPageIndicator);
		return this;
	}
}