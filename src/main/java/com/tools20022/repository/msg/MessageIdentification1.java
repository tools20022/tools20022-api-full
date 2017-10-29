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
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Identifies a message by a unique identifier and the date and time when the
 * message was created by the sender.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MessageIdentification1#Identification
 * MessageIdentification1.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MessageIdentification1#CreationDateTime
 * MessageIdentification1.CreationDateTime}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.FundProcessingPassportReportV02#MessageIdentification
 * FundProcessingPassportReportV02.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.InvestmentFundReportRequestV02#MessageIdentification
 * InvestmentFundReportRequestV02.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV02#MessageIdentification
 * AccountDetailsConfirmationV02.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV03#MessageIdentification
 * AccountDetailsConfirmationV03.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PEPOrISAOrPortfolioInformationV01#MessageReference
 * PEPOrISAOrPortfolioInformationV01.MessageReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV02#MessageReference
 * AccountHoldingInformationV02.MessageReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV03#MessageReference
 * AccountHoldingInformationV03.MessageReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountManagementStatusReportV02#MessageIdentification
 * AccountManagementStatusReportV02.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountManagementStatusReportV03#MessageIdentification
 * AccountManagementStatusReportV03.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV02#MessageIdentification
 * AccountModificationInstructionV02.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV03#MessageIdentification
 * AccountModificationInstructionV03.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV02#MessageIdentification
 * AccountOpeningInstructionV02.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV03#MessageIdentification
 * AccountOpeningInstructionV03.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PEPOrISAOrPortfolioTransferCancellationRequestV02#MessageReference
 * PEPOrISAOrPortfolioTransferCancellationRequestV02.MessageReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferCancellationRequestV03#MessageReference
 * PortfolioTransferCancellationRequestV03.MessageReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferCancellationRequestV04#MessageReference
 * PortfolioTransferCancellationRequestV04.MessageReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PEPOrISAOrPortfolioTransferConfirmationV02#MessageReference
 * PEPOrISAOrPortfolioTransferConfirmationV02.MessageReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV03#MessageReference
 * PortfolioTransferConfirmationV03.MessageReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV04#MessageReference
 * PortfolioTransferConfirmationV04.MessageReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PEPOrISAOrPortfolioTransferInstructionV02#MessageReference
 * PEPOrISAOrPortfolioTransferInstructionV02.MessageReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV03#MessageReference
 * PortfolioTransferInstructionV03.MessageReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV04#MessageReference
 * PortfolioTransferInstructionV04.MessageReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.PriceReportCancellationV03#MessageIdentification
 * PriceReportCancellationV03.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.PriceReportCancellationV04#MessageIdentification
 * PriceReportCancellationV04.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.PriceReportV03#MessageIdentification
 * PriceReportV03.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.PriceReportV04#MessageIdentification
 * PriceReportV04.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferInConfirmationV02#MessageIdentification
 * ReversalOfTransferInConfirmationV02.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferInConfirmationV03#MessageIdentification
 * ReversalOfTransferInConfirmationV03.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferInConfirmationV04#MessageIdentification
 * ReversalOfTransferInConfirmationV04.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferOutConfirmationV02#MessageIdentification
 * ReversalOfTransferOutConfirmationV02.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferOutConfirmationV03#MessageIdentification
 * ReversalOfTransferOutConfirmationV03.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferOutConfirmationV04#MessageIdentification
 * ReversalOfTransferOutConfirmationV04.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInCancellationRequestV02#MessageIdentification
 * TransferInCancellationRequestV02.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInCancellationRequestV03#MessageIdentification
 * TransferInCancellationRequestV03.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInCancellationRequestV04#MessageIdentification
 * TransferInCancellationRequestV04.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInConfirmationV02#MessageIdentification
 * TransferInConfirmationV02.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInConfirmationV03#MessageIdentification
 * TransferInConfirmationV03.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInConfirmationV04#MessageIdentification
 * TransferInConfirmationV04.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInInstructionV02#MessageIdentification
 * TransferInInstructionV02.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInInstructionV03#MessageIdentification
 * TransferInInstructionV03.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInInstructionV04#MessageIdentification
 * TransferInInstructionV04.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutCancellationRequestV02#MessageIdentification
 * TransferOutCancellationRequestV02.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutCancellationRequestV03#MessageIdentification
 * TransferOutCancellationRequestV03.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutCancellationRequestV04#MessageIdentification
 * TransferOutCancellationRequestV04.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutConfirmationV02#MessageIdentification
 * TransferOutConfirmationV02.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutConfirmationV03#MessageIdentification
 * TransferOutConfirmationV03.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutConfirmationV04#MessageIdentification
 * TransferOutConfirmationV04.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutInstructionV02#MessageIdentification
 * TransferOutInstructionV02.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutInstructionV03#MessageIdentification
 * TransferOutInstructionV03.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutInstructionV04#MessageIdentification
 * TransferOutInstructionV04.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.AccountingStatementOfHoldingsV02#MessageIdentification
 * AccountingStatementOfHoldingsV02.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.CustodyStatementOfHoldingsV02#MessageIdentification
 * CustodyStatementOfHoldingsV02.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.AccountingStatementOfHoldingsCancellationV02#MessageIdentification
 * AccountingStatementOfHoldingsCancellationV02.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.CustodyStatementOfHoldingsCancellationV02#MessageIdentification
 * CustodyStatementOfHoldingsCancellationV02.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundConfirmedCashForecastReportCancellationV02#MessageIdentification
 * FundConfirmedCashForecastReportCancellationV02.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundConfirmedCashForecastReportV03#MessageIdentification
 * FundConfirmedCashForecastReportV03.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportCancellationV02#MessageIdentification
 * FundDetailedConfirmedCashForecastReportCancellationV02.MessageIdentification}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportV03#MessageIdentification
 * FundDetailedConfirmedCashForecastReportV03.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedEstimatedCashForecastReportV03#MessageIdentification
 * FundDetailedEstimatedCashForecastReportV03.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundEstimatedCashForecastReportV03#MessageIdentification
 * FundEstimatedCashForecastReportV03.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.OrderCancellationStatusReportV03#MessageIdentification
 * OrderCancellationStatusReportV03.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.OrderConfirmationStatusReportV01#MessageIdentification
 * OrderConfirmationStatusReportV01.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.OrderInstructionStatusReportV03#MessageIdentification
 * OrderInstructionStatusReportV03.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderCancellationRequestV03#MessageIdentification
 * RedemptionBulkOrderCancellationRequestV03.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationAmendmentV01#MessageIdentification
 * RedemptionBulkOrderConfirmationAmendmentV01.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationCancellationInstructionV01#MessageIdentification
 * RedemptionBulkOrderConfirmationCancellationInstructionV01.
 * MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationV03#MessageIdentification
 * RedemptionBulkOrderConfirmationV03.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderV03#MessageIdentification
 * RedemptionBulkOrderV03.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderCancellationRequestV03#MessageIdentification
 * RedemptionOrderCancellationRequestV03.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderConfirmationAmendmentV01#MessageIdentification
 * RedemptionOrderConfirmationAmendmentV01.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderConfirmationCancellationInstructionV01#MessageIdentification
 * RedemptionOrderConfirmationCancellationInstructionV01.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderConfirmationV03#MessageIdentification
 * RedemptionOrderConfirmationV03.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderV03#MessageIdentification
 * RedemptionOrderV03.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.RequestForAccountManagementStatusReportV02#MessageIdentification
 * RequestForAccountManagementStatusReportV02.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RequestForOrderConfirmationStatusReportV01#MessageIdentification
 * RequestForOrderConfirmationStatusReportV01.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RequestForOrderStatusReportV03#MessageIdentification
 * RequestForOrderStatusReportV03.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesMessageRejectionV02#MessageIdentification
 * SecuritiesMessageRejectionV02.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.StatementOfInvestmentFundTransactionsCancellationV02#MessageIdentification
 * StatementOfInvestmentFundTransactionsCancellationV02.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.StatementOfInvestmentFundTransactionsV02#MessageIdentification
 * StatementOfInvestmentFundTransactionsV02.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderCancellationRequestV03#MessageIdentification
 * SubscriptionBulkOrderCancellationRequestV03.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationAmendmentV01#MessageIdentification
 * SubscriptionBulkOrderConfirmationAmendmentV01.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationCancellationInstructionV01#MessageIdentification
 * SubscriptionBulkOrderConfirmationCancellationInstructionV01.
 * MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationV03#MessageIdentification
 * SubscriptionBulkOrderConfirmationV03.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderV03#MessageIdentification
 * SubscriptionBulkOrderV03.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderCancellationRequestV03#MessageIdentification
 * SubscriptionOrderCancellationRequestV03.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderConfirmationAmendmentV01#MessageIdentification
 * SubscriptionOrderConfirmationAmendmentV01.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderConfirmationCancellationInstructionV01#MessageIdentification
 * SubscriptionOrderConfirmationCancellationInstructionV01.MessageIdentification
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderConfirmationV03#MessageIdentification
 * SubscriptionOrderConfirmationV03.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderV03#MessageIdentification
 * SubscriptionOrderV03.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderCancellationRequestV03#MessageIdentification
 * SwitchOrderCancellationRequestV03.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderConfirmationAmendmentV01#MessageIdentification
 * SwitchOrderConfirmationAmendmentV01.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderConfirmationCancellationInstructionV01#MessageIdentification
 * SwitchOrderConfirmationCancellationInstructionV01.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderConfirmationV03#MessageIdentification
 * SwitchOrderConfirmationV03.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderV03#MessageIdentification
 * SwitchOrderV03.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.RequestForTransferStatusReportV02#MessageIdentification
 * RequestForTransferStatusReportV02.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.RequestForTransferStatusReportV03#MessageIdentification
 * RequestForTransferStatusReportV03.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferCancellationStatusReportV02#MessageIdentification
 * TransferCancellationStatusReportV02.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferCancellationStatusReportV03#MessageIdentification
 * TransferCancellationStatusReportV03.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInstructionStatusReportV02#MessageIdentification
 * TransferInstructionStatusReportV02.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInstructionStatusReportV03#MessageIdentification
 * TransferInstructionStatusReportV03.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.RequestForPEPOrISAOrPortfolioInformationV01#MessageReference
 * RequestForPEPOrISAOrPortfolioInformationV01.MessageReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationRequestV02#MessageReference
 * AccountHoldingInformationRequestV02.MessageReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingNotificationV02#MeetingNotificationIdentification
 * MeetingNotificationV02.MeetingNotificationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingNotificationV03#Identification
 * MeetingNotificationV03.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingNotificationV04#Identification
 * MeetingNotificationV04.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingCancellationV02#CancellationIdentification
 * MeetingCancellationV02.CancellationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingCancellationV03#Identification
 * MeetingCancellationV03.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingCancellationV04#Identification
 * MeetingCancellationV04.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingEntitlementNotificationV02#EntitlementNotificationIdentification
 * MeetingEntitlementNotificationV02.EntitlementNotificationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingEntitlementNotificationV03#Identification
 * MeetingEntitlementNotificationV03.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingEntitlementNotificationV04#Identification
 * MeetingEntitlementNotificationV04.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingInstructionV02#MeetingInstructionIdentification
 * MeetingInstructionV02.MeetingInstructionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingInstructionV03#Identification
 * MeetingInstructionV03.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingInstructionV04#Identification
 * MeetingInstructionV04.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingInstructionCancellationRequestV02#InstructionCancellationIdentification
 * MeetingInstructionCancellationRequestV02.
 * InstructionCancellationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingInstructionCancellationRequestV03#Identification
 * MeetingInstructionCancellationRequestV03.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingInstructionCancellationRequestV04#Identification
 * MeetingInstructionCancellationRequestV04.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingInstructionStatusV02#MeetingInstructionStatusIdentification
 * MeetingInstructionStatusV02.MeetingInstructionStatusIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingInstructionStatusV03#Identification
 * MeetingInstructionStatusV03.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingInstructionStatusV04#Identification
 * MeetingInstructionStatusV04.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingVoteExecutionConfirmationV02#VoteExecutionConfirmationIdentification
 * MeetingVoteExecutionConfirmationV02.VoteExecutionConfirmationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingVoteExecutionConfirmationV03#Identification
 * MeetingVoteExecutionConfirmationV03.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingVoteExecutionConfirmationV04#Identification
 * MeetingVoteExecutionConfirmationV04.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingResultDisseminationV02#MeetingResultDisseminationIdentification
 * MeetingResultDisseminationV02.MeetingResultDisseminationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingResultDisseminationV03#Identification
 * MeetingResultDisseminationV03.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingResultDisseminationV04#Identification
 * MeetingResultDisseminationV04.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsin.InvoiceFinancingRequestStatusV01#StatusIdentification
 * InvoiceFinancingRequestStatusV01.StatusIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsin.InvoiceFinancingCancellationRequestV01#CancellationRequestIdentification
 * InvoiceFinancingCancellationRequestV01.CancellationRequestIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.AcknowledgementV03#AcknowledgementIdentification
 * AcknowledgementV03.AcknowledgementIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.AcknowledgementV03#AcknowledgedMessageReference
 * AcknowledgementV03.AcknowledgedMessageReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ActivityReportV03#ReportIdentification
 * ActivityReportV03.ReportIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ActivityReportV03#RelatedMessageReference
 * ActivityReportV03.RelatedMessageReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ActivityReportRequestV03#RequestIdentification
 * ActivityReportRequestV03.RequestIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ActivityReportSetUpRequestV02#RequestIdentification
 * ActivityReportSetUpRequestV02.RequestIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.AmendmentAcceptanceV02#AcceptanceIdentification
 * AmendmentAcceptanceV02.AcceptanceIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.AmendmentAcceptanceV02#DeltaReportReference
 * AmendmentAcceptanceV02.DeltaReportReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.AmendmentAcceptanceNotificationV03#NotificationIdentification
 * AmendmentAcceptanceNotificationV03.NotificationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.AmendmentAcceptanceNotificationV03#DeltaReportReference
 * AmendmentAcceptanceNotificationV03.DeltaReportReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.AmendmentRejectionV02#RejectionIdentification
 * AmendmentRejectionV02.RejectionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.AmendmentRejectionV02#DeltaReportReference
 * AmendmentRejectionV02.DeltaReportReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.AmendmentRejectionNotificationV03#NotificationIdentification
 * AmendmentRejectionNotificationV03.NotificationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.AmendmentRejectionNotificationV03#DeltaReportReference
 * AmendmentRejectionNotificationV03.DeltaReportReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineAmendmentRequestV03#RequestIdentification
 * BaselineAmendmentRequestV03.RequestIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineMatchReportV03#ReportIdentification
 * BaselineMatchReportV03.ReportIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReportV03#ReportIdentification
 * BaselineReportV03.ReportIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReportV03#RelatedMessageReference
 * BaselineReportV03.RelatedMessageReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReSubmissionV03#SubmissionIdentification
 * BaselineReSubmissionV03.SubmissionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.DataSetMatchReportV03#ReportIdentification
 * DataSetMatchReportV03.ReportIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.DataSetSubmissionV03#SubmissionIdentification
 * DataSetSubmissionV03.SubmissionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.DeltaReportV03#ReportIdentification
 * DeltaReportV03.ReportIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ErrorReportV03#ReportIdentification
 * ErrorReportV03.ReportIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ErrorReportV03#RejectedMessageReference
 * ErrorReportV03.RejectedMessageReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV03#ReportIdentification
 * ForwardDataSetSubmissionReportV03.ReportIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.FullPushThroughReportV03#ReportIdentification
 * FullPushThroughReportV03.ReportIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.InitialBaselineSubmissionV03#SubmissionIdentification
 * InitialBaselineSubmissionV03.SubmissionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.MisMatchAcceptanceV02#AcceptanceIdentification
 * MisMatchAcceptanceV02.AcceptanceIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.MisMatchAcceptanceV02#DataSetMatchReportReference
 * MisMatchAcceptanceV02.DataSetMatchReportReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.MisMatchAcceptanceNotificationV03#NotificationIdentification
 * MisMatchAcceptanceNotificationV03.NotificationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.MisMatchAcceptanceNotificationV03#DataSetMatchReportReference
 * MisMatchAcceptanceNotificationV03.DataSetMatchReportReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.MisMatchRejectionV02#RejectionIdentification
 * MisMatchRejectionV02.RejectionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.MisMatchRejectionV02#DataSetMatchReportReference
 * MisMatchRejectionV02.DataSetMatchReportReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.MisMatchRejectionNotificationV03#NotificationIdentification
 * MisMatchRejectionNotificationV03.NotificationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.MisMatchRejectionNotificationV03#DataSetMatchReportReference
 * MisMatchRejectionNotificationV03.DataSetMatchReportReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ActionReminderV03#ReminderIdentification
 * ActionReminderV03.ReminderIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ActionReminderV03#MessageRequiringAction
 * ActionReminderV03.MessageRequiringAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusChangeNotificationV03#NotificationIdentification
 * StatusChangeNotificationV03.NotificationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusChangeRequestV02#RequestIdentification
 * StatusChangeRequestV02.RequestIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusChangeRequestAcceptanceV02#AcceptanceIdentification
 * StatusChangeRequestAcceptanceV02.AcceptanceIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusChangeRequestNotificationV03#NotificationIdentification
 * StatusChangeRequestNotificationV03.NotificationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusChangeRequestRejectionV02#RejectionIdentification
 * StatusChangeRequestRejectionV02.RejectionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusChangeRequestRejectionNotificationV03#NotificationIdentification
 * StatusChangeRequestRejectionNotificationV03.NotificationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusExtensionRequestAcceptanceV03#AcceptanceIdentification
 * StatusExtensionRequestAcceptanceV03.AcceptanceIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusExtensionNotificationV03#NotificationIdentification
 * StatusExtensionNotificationV03.NotificationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusExtensionRequestRejectionV03#RejectionIdentification
 * StatusExtensionRequestRejectionV03.RejectionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusExtensionRejectionNotificationV03#NotificationIdentification
 * StatusExtensionRejectionNotificationV03.NotificationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusExtensionRequestV03#RequestIdentification
 * StatusExtensionRequestV03.RequestIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusExtensionRequestNotificationV03#NotificationIdentification
 * StatusExtensionRequestNotificationV03.NotificationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusReportV03#ReportIdentification
 * StatusReportV03.ReportIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusReportV03#RelatedMessageReference
 * StatusReportV03.RelatedMessageReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusReportRequestV03#RequestIdentification
 * StatusReportRequestV03.RequestIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.TimeOutNotificationV03#NotificationIdentification
 * TimeOutNotificationV03.NotificationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.TransactionReportV03#ReportIdentification
 * TransactionReportV03.ReportIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.TransactionReportV03#RelatedMessageReference
 * TransactionReportV03.RelatedMessageReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.TransactionReportRequestV03#RequestIdentification
 * TransactionReportRequestV03.RequestIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.IntentToPayNotificationV01#NotificationIdentification
 * IntentToPayNotificationV01.NotificationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ForwardIntentToPayNotificationV01#NotificationIdentification
 * ForwardIntentToPayNotificationV01.NotificationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.IntentToPayReportV01#ReportIdentification
 * IntentToPayReportV01.ReportIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.SpecialRequestV01#RequestIdentification
 * SpecialRequestV01.RequestIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.SpecialNotificationV01#NotificationIdentification
 * SpecialNotificationV01.NotificationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.RoleAndBaselineAcceptanceV01#AcceptanceIdentification
 * RoleAndBaselineAcceptanceV01.AcceptanceIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.RoleAndBaselineAcceptanceV01#RelatedMessageReference
 * RoleAndBaselineAcceptanceV01.RelatedMessageReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.RoleAndBaselineRejectionV01#RejectionIdentification
 * RoleAndBaselineRejectionV01.RejectionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.RoleAndBaselineRejectionV01#RelatedMessageReference
 * RoleAndBaselineRejectionV01.RelatedMessageReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.RoleAndBaselineAcceptanceNotificationV01#NotificationIdentification
 * RoleAndBaselineAcceptanceNotificationV01.NotificationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.RoleAndBaselineRejectionNotificationV01#NotificationIdentification
 * RoleAndBaselineRejectionNotificationV01.NotificationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.PriceReportCorrectionV03#MessageIdentification
 * PriceReportCorrectionV03.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV04#MessageIdentification
 * AccountDetailsConfirmationV04.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV04#MessageIdentification
 * AccountModificationInstructionV04.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV04#MessageIdentification
 * AccountOpeningInstructionV04.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReSubmissionV04#SubmissionIdentification
 * BaselineReSubmissionV04.SubmissionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.DataSetSubmissionV04#SubmissionIdentification
 * DataSetSubmissionV04.SubmissionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.FullPushThroughReportV04#ReportIdentification
 * FullPushThroughReportV04.ReportIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineAmendmentRequestV04#RequestIdentification
 * BaselineAmendmentRequestV04.RequestIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV04#ReportIdentification
 * ForwardDataSetSubmissionReportV04.ReportIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ActivityReportV04#ReportIdentification
 * ActivityReportV04.ReportIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ActivityReportV04#RelatedMessageReference
 * ActivityReportV04.RelatedMessageReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.InitialBaselineSubmissionV04#SubmissionIdentification
 * InitialBaselineSubmissionV04.SubmissionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferInConfirmationV05#MessageIdentification
 * ReversalOfTransferInConfirmationV05.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInConfirmationV05#MessageIdentification
 * TransferInConfirmationV05.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInstructionStatusReportV04#MessageIdentification
 * TransferInstructionStatusReportV04.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationRequestV03#MessageReference
 * AccountHoldingInformationRequestV03.MessageReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutInstructionV05#MessageIdentification
 * TransferOutInstructionV05.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV04#MessageReference
 * AccountHoldingInformationV04.MessageReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferCancellationRequestV05#MessageReference
 * PortfolioTransferCancellationRequestV05.MessageReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferCancellationStatusReportV04#MessageIdentification
 * TransferCancellationStatusReportV04.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV05#MessageReference
 * PortfolioTransferInstructionV05.MessageReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInInstructionV05#MessageIdentification
 * TransferInInstructionV05.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInCancellationRequestV05#MessageIdentification
 * TransferInCancellationRequestV05.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV05#MessageReference
 * PortfolioTransferConfirmationV05.MessageReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutConfirmationV05#MessageIdentification
 * TransferOutConfirmationV05.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.RequestForTransferStatusReportV04#MessageIdentification
 * RequestForTransferStatusReportV04.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferOutConfirmationV05#MessageIdentification
 * ReversalOfTransferOutConfirmationV05.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutCancellationRequestV05#MessageIdentification
 * TransferOutCancellationRequestV05.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountManagementStatusReportV04#MessageIdentification
 * AccountManagementStatusReportV04.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.IntentToPayNotificationV02#NotificationIdentification
 * IntentToPayNotificationV02.NotificationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ForwardIntentToPayNotificationV02#NotificationIdentification
 * ForwardIntentToPayNotificationV02.NotificationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedEstimatedCashForecastReportV04#MessageIdentification
 * FundDetailedEstimatedCashForecastReportV04.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV05#MessageIdentification
 * AccountOpeningInstructionV05.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundConfirmedCashForecastReportV04#MessageIdentification
 * FundConfirmedCashForecastReportV04.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportCancellationV03#MessageIdentification
 * FundDetailedConfirmedCashForecastReportCancellationV03.MessageIdentification}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundEstimatedCashForecastReportV04#MessageIdentification
 * FundEstimatedCashForecastReportV04.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV05#MessageIdentification
 * AccountModificationInstructionV05.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.RequestForAccountManagementStatusReportV03#MessageIdentification
 * RequestForAccountManagementStatusReportV03.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.StatementOfInvestmentFundTransactionsV03#MessageIdentification
 * StatementOfInvestmentFundTransactionsV03.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesMessageRejectionV03#MessageIdentification
 * SecuritiesMessageRejectionV03.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundConfirmedCashForecastReportCancellationV03#MessageIdentification
 * FundConfirmedCashForecastReportCancellationV03.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.StatementOfInvestmentFundTransactionsCancellationV03#MessageIdentification
 * StatementOfInvestmentFundTransactionsCancellationV03.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV05#MessageIdentification
 * AccountDetailsConfirmationV05.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferCancellationRequestV06#MessageReference
 * PortfolioTransferCancellationRequestV06.MessageReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportV04#MessageIdentification
 * FundDetailedConfirmedCashForecastReportV04.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV06#MessageReference
 * PortfolioTransferConfirmationV06.MessageReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV06#MessageReference
 * PortfolioTransferInstructionV06.MessageReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReportV04#ReportIdentification
 * BaselineReportV04.ReportIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReportV04#RelatedMessageReference
 * BaselineReportV04.RelatedMessageReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.InitialBaselineSubmissionV05#SubmissionIdentification
 * InitialBaselineSubmissionV05.SubmissionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineAmendmentRequestV05#RequestIdentification
 * BaselineAmendmentRequestV05.RequestIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.FullPushThroughReportV05#ReportIdentification
 * FullPushThroughReportV05.ReportIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV05#ReportIdentification
 * ForwardDataSetSubmissionReportV05.ReportIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.DataSetSubmissionV05#SubmissionIdentification
 * DataSetSubmissionV05.SubmissionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReSubmissionV05#SubmissionIdentification
 * BaselineReSubmissionV05.SubmissionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInInstructionV06#MessageIdentification
 * TransferInInstructionV06.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutConfirmationV06#MessageIdentification
 * TransferOutConfirmationV06.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutInstructionV06#MessageIdentification
 * TransferOutInstructionV06.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutCancellationRequestV06#MessageIdentification
 * TransferOutCancellationRequestV06.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInConfirmationV06#MessageIdentification
 * TransferInConfirmationV06.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferOutConfirmationV06#MessageIdentification
 * ReversalOfTransferOutConfirmationV06.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInCancellationRequestV06#MessageIdentification
 * TransferInCancellationRequestV06.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferInConfirmationV06#MessageIdentification
 * ReversalOfTransferInConfirmationV06.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceTransparencyReportStatusAdviceV01#MessageIdentification
 * SecuritiesBalanceTransparencyReportStatusAdviceV01.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV07#MessageReference
 * PortfolioTransferInstructionV07.MessageReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferOutConfirmationV07#MessageIdentification
 * ReversalOfTransferOutConfirmationV07.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutCancellationRequestV07#MessageIdentification
 * TransferOutCancellationRequestV07.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV05#MessageReference
 * AccountHoldingInformationV05.MessageReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferCancellationRequestV07#MessageReference
 * PortfolioTransferCancellationRequestV07.MessageReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInstructionStatusReportV05#MessageIdentification
 * TransferInstructionStatusReportV05.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInConfirmationV07#MessageIdentification
 * TransferInConfirmationV07.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV06#MessageIdentification
 * AccountOpeningInstructionV06.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutConfirmationV07#MessageIdentification
 * TransferOutConfirmationV07.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.RequestForTransferStatusReportV05#MessageIdentification
 * RequestForTransferStatusReportV05.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV06#MessageIdentification
 * AccountDetailsConfirmationV06.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.RequestForAccountManagementStatusReportV04#MessageIdentification
 * RequestForAccountManagementStatusReportV04.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInCancellationRequestV07#MessageIdentification
 * TransferInCancellationRequestV07.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV07#MessageReference
 * PortfolioTransferConfirmationV07.MessageReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferCancellationStatusReportV05#MessageIdentification
 * TransferCancellationStatusReportV05.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutInstructionV07#MessageIdentification
 * TransferOutInstructionV07.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountManagementStatusReportV05#MessageIdentification
 * AccountManagementStatusReportV05.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV06#MessageIdentification
 * AccountModificationInstructionV06.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInInstructionV07#MessageIdentification
 * TransferInInstructionV07.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationRequestV04#MessageReference
 * AccountHoldingInformationRequestV04.MessageReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferInConfirmationV07#MessageIdentification
 * ReversalOfTransferInConfirmationV07.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceTransparencyReportV02#MessageIdentification
 * SecuritiesBalanceTransparencyReportV02.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationV04#MessageIdentification
 * SubscriptionBulkOrderConfirmationV04.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderV04#MessageIdentification
 * RedemptionBulkOrderV04.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderCancellationRequestV04#MessageIdentification
 * SubscriptionBulkOrderCancellationRequestV04.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderV04#MessageIdentification
 * RedemptionOrderV04.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderCancellationRequestV04#MessageIdentification
 * SubscriptionOrderCancellationRequestV04.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationCancellationInstructionV02#MessageIdentification
 * RedemptionBulkOrderConfirmationCancellationInstructionV02.
 * MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationV04#MessageIdentification
 * RedemptionBulkOrderConfirmationV04.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderCancellationRequestV04#MessageIdentification
 * RedemptionBulkOrderCancellationRequestV04.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderConfirmationV04#MessageIdentification
 * SwitchOrderConfirmationV04.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RequestForOrderStatusReportV04#MessageIdentification
 * RequestForOrderStatusReportV04.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderConfirmationV04#MessageIdentification
 * SubscriptionOrderConfirmationV04.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderConfirmationCancellationInstructionV02#MessageIdentification
 * SubscriptionOrderConfirmationCancellationInstructionV02.MessageIdentification
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderCancellationRequestV04#MessageIdentification
 * SwitchOrderCancellationRequestV04.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.OrderCancellationStatusReportV04#MessageIdentification
 * OrderCancellationStatusReportV04.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderV04#MessageIdentification
 * SwitchOrderV04.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderConfirmationCancellationInstructionV02#MessageIdentification
 * RedemptionOrderConfirmationCancellationInstructionV02.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderConfirmationV04#MessageIdentification
 * RedemptionOrderConfirmationV04.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.OrderInstructionStatusReportV04#MessageIdentification
 * OrderInstructionStatusReportV04.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationCancellationInstructionV02#MessageIdentification
 * SubscriptionBulkOrderConfirmationCancellationInstructionV02.
 * MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderCancellationRequestV04#MessageIdentification
 * RedemptionOrderCancellationRequestV04.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RequestForOrderConfirmationStatusReportV02#MessageIdentification
 * RequestForOrderConfirmationStatusReportV02.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderV04#MessageIdentification
 * SubscriptionBulkOrderV04.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderConfirmationCancellationInstructionV02#MessageIdentification
 * SwitchOrderConfirmationCancellationInstructionV02.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.OrderConfirmationStatusReportV02#MessageIdentification
 * OrderConfirmationStatusReportV02.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderV04#MessageIdentification
 * SubscriptionOrderV04.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV07#MessageIdentification
 * AccountDetailsConfirmationV07.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV07#MessageIdentification
 * AccountModificationInstructionV07.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV07#MessageIdentification
 * AccountOpeningInstructionV07.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountManagementStatusReportV06#MessageIdentification
 * AccountManagementStatusReportV06.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.RequestForAccountManagementStatusReportV05#MessageIdentification
 * RequestForAccountManagementStatusReportV05.MessageIdentification}</li>
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
 * "MessageIdentification1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Identifies a message by a unique identifier and the date and time when the message was created by the sender."
 * </li>
 * </ul>
 */
public class MessageIdentification1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Identification of the message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MessageIdentification1
	 * MessageIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Id"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the message."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute Identification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> MessageIdentification1.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Identification of the message.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Date of creation of the message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MessageIdentification1
	 * MessageIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CreDtTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreationDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date of creation of the message."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute CreationDateTime = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> MessageIdentification1.mmObject();
			isDerived = false;
			xmlTag = "CreDtTm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreationDateTime";
			definition = "Date of creation of the message.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MessageIdentification1.Identification, com.tools20022.repository.msg.MessageIdentification1.CreationDateTime);
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.reda.FundProcessingPassportReportV02.MessageIdentification,
						com.tools20022.repository.area.reda.InvestmentFundReportRequestV02.MessageIdentification, com.tools20022.repository.area.acmt.AccountDetailsConfirmationV02.MessageIdentification,
						com.tools20022.repository.area.acmt.AccountDetailsConfirmationV03.MessageIdentification, com.tools20022.repository.area.sese.PEPOrISAOrPortfolioInformationV01.MessageReference,
						com.tools20022.repository.area.sese.AccountHoldingInformationV02.MessageReference, com.tools20022.repository.area.sese.AccountHoldingInformationV03.MessageReference,
						com.tools20022.repository.area.acmt.AccountManagementStatusReportV02.MessageIdentification, com.tools20022.repository.area.acmt.AccountManagementStatusReportV03.MessageIdentification,
						com.tools20022.repository.area.acmt.AccountModificationInstructionV02.MessageIdentification, com.tools20022.repository.area.acmt.AccountModificationInstructionV03.MessageIdentification,
						com.tools20022.repository.area.acmt.AccountOpeningInstructionV02.MessageIdentification, com.tools20022.repository.area.acmt.AccountOpeningInstructionV03.MessageIdentification,
						com.tools20022.repository.area.sese.PEPOrISAOrPortfolioTransferCancellationRequestV02.MessageReference, com.tools20022.repository.area.sese.PortfolioTransferCancellationRequestV03.MessageReference,
						com.tools20022.repository.area.sese.PortfolioTransferCancellationRequestV04.MessageReference, com.tools20022.repository.area.sese.PEPOrISAOrPortfolioTransferConfirmationV02.MessageReference,
						com.tools20022.repository.area.sese.PortfolioTransferConfirmationV03.MessageReference, com.tools20022.repository.area.sese.PortfolioTransferConfirmationV04.MessageReference,
						com.tools20022.repository.area.sese.PEPOrISAOrPortfolioTransferInstructionV02.MessageReference, com.tools20022.repository.area.sese.PortfolioTransferInstructionV03.MessageReference,
						com.tools20022.repository.area.sese.PortfolioTransferInstructionV04.MessageReference, com.tools20022.repository.area.reda.PriceReportCancellationV03.MessageIdentification,
						com.tools20022.repository.area.reda.PriceReportCancellationV04.MessageIdentification, com.tools20022.repository.area.reda.PriceReportV03.MessageIdentification,
						com.tools20022.repository.area.reda.PriceReportV04.MessageIdentification, com.tools20022.repository.area.sese.ReversalOfTransferInConfirmationV02.MessageIdentification,
						com.tools20022.repository.area.sese.ReversalOfTransferInConfirmationV03.MessageIdentification, com.tools20022.repository.area.sese.ReversalOfTransferInConfirmationV04.MessageIdentification,
						com.tools20022.repository.area.sese.ReversalOfTransferOutConfirmationV02.MessageIdentification, com.tools20022.repository.area.sese.ReversalOfTransferOutConfirmationV03.MessageIdentification,
						com.tools20022.repository.area.sese.ReversalOfTransferOutConfirmationV04.MessageIdentification, com.tools20022.repository.area.sese.TransferInCancellationRequestV02.MessageIdentification,
						com.tools20022.repository.area.sese.TransferInCancellationRequestV03.MessageIdentification, com.tools20022.repository.area.sese.TransferInCancellationRequestV04.MessageIdentification,
						com.tools20022.repository.area.sese.TransferInConfirmationV02.MessageIdentification, com.tools20022.repository.area.sese.TransferInConfirmationV03.MessageIdentification,
						com.tools20022.repository.area.sese.TransferInConfirmationV04.MessageIdentification, com.tools20022.repository.area.sese.TransferInInstructionV02.MessageIdentification,
						com.tools20022.repository.area.sese.TransferInInstructionV03.MessageIdentification, com.tools20022.repository.area.sese.TransferInInstructionV04.MessageIdentification,
						com.tools20022.repository.area.sese.TransferOutCancellationRequestV02.MessageIdentification, com.tools20022.repository.area.sese.TransferOutCancellationRequestV03.MessageIdentification,
						com.tools20022.repository.area.sese.TransferOutCancellationRequestV04.MessageIdentification, com.tools20022.repository.area.sese.TransferOutConfirmationV02.MessageIdentification,
						com.tools20022.repository.area.sese.TransferOutConfirmationV03.MessageIdentification, com.tools20022.repository.area.sese.TransferOutConfirmationV04.MessageIdentification,
						com.tools20022.repository.area.sese.TransferOutInstructionV02.MessageIdentification, com.tools20022.repository.area.sese.TransferOutInstructionV03.MessageIdentification,
						com.tools20022.repository.area.sese.TransferOutInstructionV04.MessageIdentification, com.tools20022.repository.area.semt.AccountingStatementOfHoldingsV02.MessageIdentification,
						com.tools20022.repository.area.semt.CustodyStatementOfHoldingsV02.MessageIdentification, com.tools20022.repository.area.semt.AccountingStatementOfHoldingsCancellationV02.MessageIdentification,
						com.tools20022.repository.area.semt.CustodyStatementOfHoldingsCancellationV02.MessageIdentification, com.tools20022.repository.area.camt.FundConfirmedCashForecastReportCancellationV02.MessageIdentification,
						com.tools20022.repository.area.camt.FundConfirmedCashForecastReportV03.MessageIdentification, com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportCancellationV02.MessageIdentification,
						com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportV03.MessageIdentification, com.tools20022.repository.area.camt.FundDetailedEstimatedCashForecastReportV03.MessageIdentification,
						com.tools20022.repository.area.camt.FundEstimatedCashForecastReportV03.MessageIdentification, com.tools20022.repository.area.setr.OrderCancellationStatusReportV03.MessageIdentification,
						com.tools20022.repository.area.setr.OrderConfirmationStatusReportV01.MessageIdentification, com.tools20022.repository.area.setr.OrderInstructionStatusReportV03.MessageIdentification,
						com.tools20022.repository.area.setr.RedemptionBulkOrderCancellationRequestV03.MessageIdentification, com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationAmendmentV01.MessageIdentification,
						com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationCancellationInstructionV01.MessageIdentification, com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationV03.MessageIdentification,
						com.tools20022.repository.area.setr.RedemptionBulkOrderV03.MessageIdentification, com.tools20022.repository.area.setr.RedemptionOrderCancellationRequestV03.MessageIdentification,
						com.tools20022.repository.area.setr.RedemptionOrderConfirmationAmendmentV01.MessageIdentification, com.tools20022.repository.area.setr.RedemptionOrderConfirmationCancellationInstructionV01.MessageIdentification,
						com.tools20022.repository.area.setr.RedemptionOrderConfirmationV03.MessageIdentification, com.tools20022.repository.area.setr.RedemptionOrderV03.MessageIdentification,
						com.tools20022.repository.area.acmt.RequestForAccountManagementStatusReportV02.MessageIdentification, com.tools20022.repository.area.setr.RequestForOrderConfirmationStatusReportV01.MessageIdentification,
						com.tools20022.repository.area.setr.RequestForOrderStatusReportV03.MessageIdentification, com.tools20022.repository.area.semt.SecuritiesMessageRejectionV02.MessageIdentification,
						com.tools20022.repository.area.semt.StatementOfInvestmentFundTransactionsCancellationV02.MessageIdentification, com.tools20022.repository.area.semt.StatementOfInvestmentFundTransactionsV02.MessageIdentification,
						com.tools20022.repository.area.setr.SubscriptionBulkOrderCancellationRequestV03.MessageIdentification, com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationAmendmentV01.MessageIdentification,
						com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationCancellationInstructionV01.MessageIdentification, com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationV03.MessageIdentification,
						com.tools20022.repository.area.setr.SubscriptionBulkOrderV03.MessageIdentification, com.tools20022.repository.area.setr.SubscriptionOrderCancellationRequestV03.MessageIdentification,
						com.tools20022.repository.area.setr.SubscriptionOrderConfirmationAmendmentV01.MessageIdentification, com.tools20022.repository.area.setr.SubscriptionOrderConfirmationCancellationInstructionV01.MessageIdentification,
						com.tools20022.repository.area.setr.SubscriptionOrderConfirmationV03.MessageIdentification, com.tools20022.repository.area.setr.SubscriptionOrderV03.MessageIdentification,
						com.tools20022.repository.area.setr.SwitchOrderCancellationRequestV03.MessageIdentification, com.tools20022.repository.area.setr.SwitchOrderConfirmationAmendmentV01.MessageIdentification,
						com.tools20022.repository.area.setr.SwitchOrderConfirmationCancellationInstructionV01.MessageIdentification, com.tools20022.repository.area.setr.SwitchOrderConfirmationV03.MessageIdentification,
						com.tools20022.repository.area.setr.SwitchOrderV03.MessageIdentification, com.tools20022.repository.area.sese.RequestForTransferStatusReportV02.MessageIdentification,
						com.tools20022.repository.area.sese.RequestForTransferStatusReportV03.MessageIdentification, com.tools20022.repository.area.sese.TransferCancellationStatusReportV02.MessageIdentification,
						com.tools20022.repository.area.sese.TransferCancellationStatusReportV03.MessageIdentification, com.tools20022.repository.area.sese.TransferInstructionStatusReportV02.MessageIdentification,
						com.tools20022.repository.area.sese.TransferInstructionStatusReportV03.MessageIdentification, com.tools20022.repository.area.sese.RequestForPEPOrISAOrPortfolioInformationV01.MessageReference,
						com.tools20022.repository.area.sese.AccountHoldingInformationRequestV02.MessageReference, com.tools20022.repository.area.seev.MeetingNotificationV02.MeetingNotificationIdentification,
						com.tools20022.repository.area.seev.MeetingNotificationV03.Identification, com.tools20022.repository.area.seev.MeetingNotificationV04.Identification,
						com.tools20022.repository.area.seev.MeetingCancellationV02.CancellationIdentification, com.tools20022.repository.area.seev.MeetingCancellationV03.Identification,
						com.tools20022.repository.area.seev.MeetingCancellationV04.Identification, com.tools20022.repository.area.seev.MeetingEntitlementNotificationV02.EntitlementNotificationIdentification,
						com.tools20022.repository.area.seev.MeetingEntitlementNotificationV03.Identification, com.tools20022.repository.area.seev.MeetingEntitlementNotificationV04.Identification,
						com.tools20022.repository.area.seev.MeetingInstructionV02.MeetingInstructionIdentification, com.tools20022.repository.area.seev.MeetingInstructionV03.Identification,
						com.tools20022.repository.area.seev.MeetingInstructionV04.Identification, com.tools20022.repository.area.seev.MeetingInstructionCancellationRequestV02.InstructionCancellationIdentification,
						com.tools20022.repository.area.seev.MeetingInstructionCancellationRequestV03.Identification, com.tools20022.repository.area.seev.MeetingInstructionCancellationRequestV04.Identification,
						com.tools20022.repository.area.seev.MeetingInstructionStatusV02.MeetingInstructionStatusIdentification, com.tools20022.repository.area.seev.MeetingInstructionStatusV03.Identification,
						com.tools20022.repository.area.seev.MeetingInstructionStatusV04.Identification, com.tools20022.repository.area.seev.MeetingVoteExecutionConfirmationV02.VoteExecutionConfirmationIdentification,
						com.tools20022.repository.area.seev.MeetingVoteExecutionConfirmationV03.Identification, com.tools20022.repository.area.seev.MeetingVoteExecutionConfirmationV04.Identification,
						com.tools20022.repository.area.seev.MeetingResultDisseminationV02.MeetingResultDisseminationIdentification, com.tools20022.repository.area.seev.MeetingResultDisseminationV03.Identification,
						com.tools20022.repository.area.seev.MeetingResultDisseminationV04.Identification, com.tools20022.repository.area.tsin.InvoiceFinancingRequestStatusV01.StatusIdentification,
						com.tools20022.repository.area.tsin.InvoiceFinancingCancellationRequestV01.CancellationRequestIdentification, com.tools20022.repository.area.tsmt.AcknowledgementV03.AcknowledgementIdentification,
						com.tools20022.repository.area.tsmt.AcknowledgementV03.AcknowledgedMessageReference, com.tools20022.repository.area.tsmt.ActivityReportV03.ReportIdentification,
						com.tools20022.repository.area.tsmt.ActivityReportV03.RelatedMessageReference, com.tools20022.repository.area.tsmt.ActivityReportRequestV03.RequestIdentification,
						com.tools20022.repository.area.tsmt.ActivityReportSetUpRequestV02.RequestIdentification, com.tools20022.repository.area.tsmt.AmendmentAcceptanceV02.AcceptanceIdentification,
						com.tools20022.repository.area.tsmt.AmendmentAcceptanceV02.DeltaReportReference, com.tools20022.repository.area.tsmt.AmendmentAcceptanceNotificationV03.NotificationIdentification,
						com.tools20022.repository.area.tsmt.AmendmentAcceptanceNotificationV03.DeltaReportReference, com.tools20022.repository.area.tsmt.AmendmentRejectionV02.RejectionIdentification,
						com.tools20022.repository.area.tsmt.AmendmentRejectionV02.DeltaReportReference, com.tools20022.repository.area.tsmt.AmendmentRejectionNotificationV03.NotificationIdentification,
						com.tools20022.repository.area.tsmt.AmendmentRejectionNotificationV03.DeltaReportReference, com.tools20022.repository.area.tsmt.BaselineAmendmentRequestV03.RequestIdentification,
						com.tools20022.repository.area.tsmt.BaselineMatchReportV03.ReportIdentification, com.tools20022.repository.area.tsmt.BaselineReportV03.ReportIdentification,
						com.tools20022.repository.area.tsmt.BaselineReportV03.RelatedMessageReference, com.tools20022.repository.area.tsmt.BaselineReSubmissionV03.SubmissionIdentification,
						com.tools20022.repository.area.tsmt.DataSetMatchReportV03.ReportIdentification, com.tools20022.repository.area.tsmt.DataSetSubmissionV03.SubmissionIdentification,
						com.tools20022.repository.area.tsmt.DeltaReportV03.ReportIdentification, com.tools20022.repository.area.tsmt.ErrorReportV03.ReportIdentification,
						com.tools20022.repository.area.tsmt.ErrorReportV03.RejectedMessageReference, com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV03.ReportIdentification,
						com.tools20022.repository.area.tsmt.FullPushThroughReportV03.ReportIdentification, com.tools20022.repository.area.tsmt.InitialBaselineSubmissionV03.SubmissionIdentification,
						com.tools20022.repository.area.tsmt.MisMatchAcceptanceV02.AcceptanceIdentification, com.tools20022.repository.area.tsmt.MisMatchAcceptanceV02.DataSetMatchReportReference,
						com.tools20022.repository.area.tsmt.MisMatchAcceptanceNotificationV03.NotificationIdentification, com.tools20022.repository.area.tsmt.MisMatchAcceptanceNotificationV03.DataSetMatchReportReference,
						com.tools20022.repository.area.tsmt.MisMatchRejectionV02.RejectionIdentification, com.tools20022.repository.area.tsmt.MisMatchRejectionV02.DataSetMatchReportReference,
						com.tools20022.repository.area.tsmt.MisMatchRejectionNotificationV03.NotificationIdentification, com.tools20022.repository.area.tsmt.MisMatchRejectionNotificationV03.DataSetMatchReportReference,
						com.tools20022.repository.area.tsmt.ActionReminderV03.ReminderIdentification, com.tools20022.repository.area.tsmt.ActionReminderV03.MessageRequiringAction,
						com.tools20022.repository.area.tsmt.StatusChangeNotificationV03.NotificationIdentification, com.tools20022.repository.area.tsmt.StatusChangeRequestV02.RequestIdentification,
						com.tools20022.repository.area.tsmt.StatusChangeRequestAcceptanceV02.AcceptanceIdentification, com.tools20022.repository.area.tsmt.StatusChangeRequestNotificationV03.NotificationIdentification,
						com.tools20022.repository.area.tsmt.StatusChangeRequestRejectionV02.RejectionIdentification, com.tools20022.repository.area.tsmt.StatusChangeRequestRejectionNotificationV03.NotificationIdentification,
						com.tools20022.repository.area.tsmt.StatusExtensionRequestAcceptanceV03.AcceptanceIdentification, com.tools20022.repository.area.tsmt.StatusExtensionNotificationV03.NotificationIdentification,
						com.tools20022.repository.area.tsmt.StatusExtensionRequestRejectionV03.RejectionIdentification, com.tools20022.repository.area.tsmt.StatusExtensionRejectionNotificationV03.NotificationIdentification,
						com.tools20022.repository.area.tsmt.StatusExtensionRequestV03.RequestIdentification, com.tools20022.repository.area.tsmt.StatusExtensionRequestNotificationV03.NotificationIdentification,
						com.tools20022.repository.area.tsmt.StatusReportV03.ReportIdentification, com.tools20022.repository.area.tsmt.StatusReportV03.RelatedMessageReference,
						com.tools20022.repository.area.tsmt.StatusReportRequestV03.RequestIdentification, com.tools20022.repository.area.tsmt.TimeOutNotificationV03.NotificationIdentification,
						com.tools20022.repository.area.tsmt.TransactionReportV03.ReportIdentification, com.tools20022.repository.area.tsmt.TransactionReportV03.RelatedMessageReference,
						com.tools20022.repository.area.tsmt.TransactionReportRequestV03.RequestIdentification, com.tools20022.repository.area.tsmt.IntentToPayNotificationV01.NotificationIdentification,
						com.tools20022.repository.area.tsmt.ForwardIntentToPayNotificationV01.NotificationIdentification, com.tools20022.repository.area.tsmt.IntentToPayReportV01.ReportIdentification,
						com.tools20022.repository.area.tsmt.SpecialRequestV01.RequestIdentification, com.tools20022.repository.area.tsmt.SpecialNotificationV01.NotificationIdentification,
						com.tools20022.repository.area.tsmt.RoleAndBaselineAcceptanceV01.AcceptanceIdentification, com.tools20022.repository.area.tsmt.RoleAndBaselineAcceptanceV01.RelatedMessageReference,
						com.tools20022.repository.area.tsmt.RoleAndBaselineRejectionV01.RejectionIdentification, com.tools20022.repository.area.tsmt.RoleAndBaselineRejectionV01.RelatedMessageReference,
						com.tools20022.repository.area.tsmt.RoleAndBaselineAcceptanceNotificationV01.NotificationIdentification, com.tools20022.repository.area.tsmt.RoleAndBaselineRejectionNotificationV01.NotificationIdentification,
						com.tools20022.repository.area.reda.PriceReportCorrectionV03.MessageIdentification, com.tools20022.repository.area.acmt.AccountDetailsConfirmationV04.MessageIdentification,
						com.tools20022.repository.area.acmt.AccountModificationInstructionV04.MessageIdentification, com.tools20022.repository.area.acmt.AccountOpeningInstructionV04.MessageIdentification,
						com.tools20022.repository.area.tsmt.BaselineReSubmissionV04.SubmissionIdentification, com.tools20022.repository.area.tsmt.DataSetSubmissionV04.SubmissionIdentification,
						com.tools20022.repository.area.tsmt.FullPushThroughReportV04.ReportIdentification, com.tools20022.repository.area.tsmt.BaselineAmendmentRequestV04.RequestIdentification,
						com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV04.ReportIdentification, com.tools20022.repository.area.tsmt.ActivityReportV04.ReportIdentification,
						com.tools20022.repository.area.tsmt.ActivityReportV04.RelatedMessageReference, com.tools20022.repository.area.tsmt.InitialBaselineSubmissionV04.SubmissionIdentification,
						com.tools20022.repository.area.sese.ReversalOfTransferInConfirmationV05.MessageIdentification, com.tools20022.repository.area.sese.TransferInConfirmationV05.MessageIdentification,
						com.tools20022.repository.area.sese.TransferInstructionStatusReportV04.MessageIdentification, com.tools20022.repository.area.sese.AccountHoldingInformationRequestV03.MessageReference,
						com.tools20022.repository.area.sese.TransferOutInstructionV05.MessageIdentification, com.tools20022.repository.area.sese.AccountHoldingInformationV04.MessageReference,
						com.tools20022.repository.area.sese.PortfolioTransferCancellationRequestV05.MessageReference, com.tools20022.repository.area.sese.TransferCancellationStatusReportV04.MessageIdentification,
						com.tools20022.repository.area.sese.PortfolioTransferInstructionV05.MessageReference, com.tools20022.repository.area.sese.TransferInInstructionV05.MessageIdentification,
						com.tools20022.repository.area.sese.TransferInCancellationRequestV05.MessageIdentification, com.tools20022.repository.area.sese.PortfolioTransferConfirmationV05.MessageReference,
						com.tools20022.repository.area.sese.TransferOutConfirmationV05.MessageIdentification, com.tools20022.repository.area.sese.RequestForTransferStatusReportV04.MessageIdentification,
						com.tools20022.repository.area.sese.ReversalOfTransferOutConfirmationV05.MessageIdentification, com.tools20022.repository.area.sese.TransferOutCancellationRequestV05.MessageIdentification,
						com.tools20022.repository.area.acmt.AccountManagementStatusReportV04.MessageIdentification, com.tools20022.repository.area.tsmt.IntentToPayNotificationV02.NotificationIdentification,
						com.tools20022.repository.area.tsmt.ForwardIntentToPayNotificationV02.NotificationIdentification, com.tools20022.repository.area.camt.FundDetailedEstimatedCashForecastReportV04.MessageIdentification,
						com.tools20022.repository.area.acmt.AccountOpeningInstructionV05.MessageIdentification, com.tools20022.repository.area.camt.FundConfirmedCashForecastReportV04.MessageIdentification,
						com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportCancellationV03.MessageIdentification, com.tools20022.repository.area.camt.FundEstimatedCashForecastReportV04.MessageIdentification,
						com.tools20022.repository.area.acmt.AccountModificationInstructionV05.MessageIdentification, com.tools20022.repository.area.acmt.RequestForAccountManagementStatusReportV03.MessageIdentification,
						com.tools20022.repository.area.semt.StatementOfInvestmentFundTransactionsV03.MessageIdentification, com.tools20022.repository.area.semt.SecuritiesMessageRejectionV03.MessageIdentification,
						com.tools20022.repository.area.camt.FundConfirmedCashForecastReportCancellationV03.MessageIdentification,
						com.tools20022.repository.area.semt.StatementOfInvestmentFundTransactionsCancellationV03.MessageIdentification, com.tools20022.repository.area.acmt.AccountDetailsConfirmationV05.MessageIdentification,
						com.tools20022.repository.area.sese.PortfolioTransferCancellationRequestV06.MessageReference, com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportV04.MessageIdentification,
						com.tools20022.repository.area.sese.PortfolioTransferConfirmationV06.MessageReference, com.tools20022.repository.area.sese.PortfolioTransferInstructionV06.MessageReference,
						com.tools20022.repository.area.tsmt.BaselineReportV04.ReportIdentification, com.tools20022.repository.area.tsmt.BaselineReportV04.RelatedMessageReference,
						com.tools20022.repository.area.tsmt.InitialBaselineSubmissionV05.SubmissionIdentification, com.tools20022.repository.area.tsmt.BaselineAmendmentRequestV05.RequestIdentification,
						com.tools20022.repository.area.tsmt.FullPushThroughReportV05.ReportIdentification, com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV05.ReportIdentification,
						com.tools20022.repository.area.tsmt.DataSetSubmissionV05.SubmissionIdentification, com.tools20022.repository.area.tsmt.BaselineReSubmissionV05.SubmissionIdentification,
						com.tools20022.repository.area.sese.TransferInInstructionV06.MessageIdentification, com.tools20022.repository.area.sese.TransferOutConfirmationV06.MessageIdentification,
						com.tools20022.repository.area.sese.TransferOutInstructionV06.MessageIdentification, com.tools20022.repository.area.sese.TransferOutCancellationRequestV06.MessageIdentification,
						com.tools20022.repository.area.sese.TransferInConfirmationV06.MessageIdentification, com.tools20022.repository.area.sese.ReversalOfTransferOutConfirmationV06.MessageIdentification,
						com.tools20022.repository.area.sese.TransferInCancellationRequestV06.MessageIdentification, com.tools20022.repository.area.sese.ReversalOfTransferInConfirmationV06.MessageIdentification,
						com.tools20022.repository.area.semt.SecuritiesBalanceTransparencyReportStatusAdviceV01.MessageIdentification, com.tools20022.repository.area.sese.PortfolioTransferInstructionV07.MessageReference,
						com.tools20022.repository.area.sese.ReversalOfTransferOutConfirmationV07.MessageIdentification, com.tools20022.repository.area.sese.TransferOutCancellationRequestV07.MessageIdentification,
						com.tools20022.repository.area.sese.AccountHoldingInformationV05.MessageReference, com.tools20022.repository.area.sese.PortfolioTransferCancellationRequestV07.MessageReference,
						com.tools20022.repository.area.sese.TransferInstructionStatusReportV05.MessageIdentification, com.tools20022.repository.area.sese.TransferInConfirmationV07.MessageIdentification,
						com.tools20022.repository.area.acmt.AccountOpeningInstructionV06.MessageIdentification, com.tools20022.repository.area.sese.TransferOutConfirmationV07.MessageIdentification,
						com.tools20022.repository.area.sese.RequestForTransferStatusReportV05.MessageIdentification, com.tools20022.repository.area.acmt.AccountDetailsConfirmationV06.MessageIdentification,
						com.tools20022.repository.area.acmt.RequestForAccountManagementStatusReportV04.MessageIdentification, com.tools20022.repository.area.sese.TransferInCancellationRequestV07.MessageIdentification,
						com.tools20022.repository.area.sese.PortfolioTransferConfirmationV07.MessageReference, com.tools20022.repository.area.sese.TransferCancellationStatusReportV05.MessageIdentification,
						com.tools20022.repository.area.sese.TransferOutInstructionV07.MessageIdentification, com.tools20022.repository.area.acmt.AccountManagementStatusReportV05.MessageIdentification,
						com.tools20022.repository.area.acmt.AccountModificationInstructionV06.MessageIdentification, com.tools20022.repository.area.sese.TransferInInstructionV07.MessageIdentification,
						com.tools20022.repository.area.sese.AccountHoldingInformationRequestV04.MessageReference, com.tools20022.repository.area.sese.ReversalOfTransferInConfirmationV07.MessageIdentification,
						com.tools20022.repository.area.semt.SecuritiesBalanceTransparencyReportV02.MessageIdentification, com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationV04.MessageIdentification,
						com.tools20022.repository.area.setr.RedemptionBulkOrderV04.MessageIdentification, com.tools20022.repository.area.setr.SubscriptionBulkOrderCancellationRequestV04.MessageIdentification,
						com.tools20022.repository.area.setr.RedemptionOrderV04.MessageIdentification, com.tools20022.repository.area.setr.SubscriptionOrderCancellationRequestV04.MessageIdentification,
						com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationCancellationInstructionV02.MessageIdentification, com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationV04.MessageIdentification,
						com.tools20022.repository.area.setr.RedemptionBulkOrderCancellationRequestV04.MessageIdentification, com.tools20022.repository.area.setr.SwitchOrderConfirmationV04.MessageIdentification,
						com.tools20022.repository.area.setr.RequestForOrderStatusReportV04.MessageIdentification, com.tools20022.repository.area.setr.SubscriptionOrderConfirmationV04.MessageIdentification,
						com.tools20022.repository.area.setr.SubscriptionOrderConfirmationCancellationInstructionV02.MessageIdentification, com.tools20022.repository.area.setr.SwitchOrderCancellationRequestV04.MessageIdentification,
						com.tools20022.repository.area.setr.OrderCancellationStatusReportV04.MessageIdentification, com.tools20022.repository.area.setr.SwitchOrderV04.MessageIdentification,
						com.tools20022.repository.area.setr.RedemptionOrderConfirmationCancellationInstructionV02.MessageIdentification, com.tools20022.repository.area.setr.RedemptionOrderConfirmationV04.MessageIdentification,
						com.tools20022.repository.area.setr.OrderInstructionStatusReportV04.MessageIdentification, com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationCancellationInstructionV02.MessageIdentification,
						com.tools20022.repository.area.setr.RedemptionOrderCancellationRequestV04.MessageIdentification, com.tools20022.repository.area.setr.RequestForOrderConfirmationStatusReportV02.MessageIdentification,
						com.tools20022.repository.area.setr.SubscriptionBulkOrderV04.MessageIdentification, com.tools20022.repository.area.setr.SwitchOrderConfirmationCancellationInstructionV02.MessageIdentification,
						com.tools20022.repository.area.setr.OrderConfirmationStatusReportV02.MessageIdentification, com.tools20022.repository.area.setr.SubscriptionOrderV04.MessageIdentification,
						com.tools20022.repository.area.acmt.AccountDetailsConfirmationV07.MessageIdentification, com.tools20022.repository.area.acmt.AccountModificationInstructionV07.MessageIdentification,
						com.tools20022.repository.area.acmt.AccountOpeningInstructionV07.MessageIdentification, com.tools20022.repository.area.acmt.AccountManagementStatusReportV06.MessageIdentification,
						com.tools20022.repository.area.acmt.RequestForAccountManagementStatusReportV05.MessageIdentification);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "MessageIdentification1";
				definition = "Identifies a message by a unique identifier and the date and time when the message was created by the sender.";
			}
		});
		return mmObject_lazy.get();
	}
}