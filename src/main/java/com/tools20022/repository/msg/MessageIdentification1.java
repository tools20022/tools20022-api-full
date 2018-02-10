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
import com.tools20022.repository.area.acmt.*;
import com.tools20022.repository.area.camt.*;
import com.tools20022.repository.area.fxtr.*;
import com.tools20022.repository.area.reda.*;
import com.tools20022.repository.area.seev.*;
import com.tools20022.repository.area.semt.*;
import com.tools20022.repository.area.sese.*;
import com.tools20022.repository.area.setr.*;
import com.tools20022.repository.area.tsin.InvoiceFinancingCancellationRequestV01;
import com.tools20022.repository.area.tsin.InvoiceFinancingRequestStatusV01;
import com.tools20022.repository.area.tsmt.*;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

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
 * {@linkplain com.tools20022.repository.msg.MessageIdentification1#mmIdentification
 * MessageIdentification1.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MessageIdentification1#mmCreationDateTime
 * MessageIdentification1.mmCreationDateTime}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.FundProcessingPassportReportV02#mmMessageIdentification
 * FundProcessingPassportReportV02.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.InvestmentFundReportRequestV02#mmMessageIdentification
 * InvestmentFundReportRequestV02.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV02#mmMessageIdentification
 * AccountDetailsConfirmationV02.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV03#mmMessageIdentification
 * AccountDetailsConfirmationV03.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PEPOrISAOrPortfolioInformationV01#mmMessageReference
 * PEPOrISAOrPortfolioInformationV01.mmMessageReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV02#mmMessageReference
 * AccountHoldingInformationV02.mmMessageReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV03#mmMessageReference
 * AccountHoldingInformationV03.mmMessageReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountManagementStatusReportV02#mmMessageIdentification
 * AccountManagementStatusReportV02.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountManagementStatusReportV03#mmMessageIdentification
 * AccountManagementStatusReportV03.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV02#mmMessageIdentification
 * AccountModificationInstructionV02.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV03#mmMessageIdentification
 * AccountModificationInstructionV03.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV02#mmMessageIdentification
 * AccountOpeningInstructionV02.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV03#mmMessageIdentification
 * AccountOpeningInstructionV03.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PEPOrISAOrPortfolioTransferCancellationRequestV02#mmMessageReference
 * PEPOrISAOrPortfolioTransferCancellationRequestV02.mmMessageReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferCancellationRequestV03#mmMessageReference
 * PortfolioTransferCancellationRequestV03.mmMessageReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferCancellationRequestV04#mmMessageReference
 * PortfolioTransferCancellationRequestV04.mmMessageReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PEPOrISAOrPortfolioTransferConfirmationV02#mmMessageReference
 * PEPOrISAOrPortfolioTransferConfirmationV02.mmMessageReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV03#mmMessageReference
 * PortfolioTransferConfirmationV03.mmMessageReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV04#mmMessageReference
 * PortfolioTransferConfirmationV04.mmMessageReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PEPOrISAOrPortfolioTransferInstructionV02#mmMessageReference
 * PEPOrISAOrPortfolioTransferInstructionV02.mmMessageReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV03#mmMessageReference
 * PortfolioTransferInstructionV03.mmMessageReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV04#mmMessageReference
 * PortfolioTransferInstructionV04.mmMessageReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.PriceReportCancellationV03#mmMessageIdentification
 * PriceReportCancellationV03.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.PriceReportCancellationV04#mmMessageIdentification
 * PriceReportCancellationV04.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.PriceReportV03#mmMessageIdentification
 * PriceReportV03.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.PriceReportV04#mmMessageIdentification
 * PriceReportV04.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferInConfirmationV02#mmMessageIdentification
 * ReversalOfTransferInConfirmationV02.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferInConfirmationV03#mmMessageIdentification
 * ReversalOfTransferInConfirmationV03.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferInConfirmationV04#mmMessageIdentification
 * ReversalOfTransferInConfirmationV04.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferOutConfirmationV02#mmMessageIdentification
 * ReversalOfTransferOutConfirmationV02.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferOutConfirmationV03#mmMessageIdentification
 * ReversalOfTransferOutConfirmationV03.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferOutConfirmationV04#mmMessageIdentification
 * ReversalOfTransferOutConfirmationV04.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInCancellationRequestV02#mmMessageIdentification
 * TransferInCancellationRequestV02.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInCancellationRequestV03#mmMessageIdentification
 * TransferInCancellationRequestV03.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInCancellationRequestV04#mmMessageIdentification
 * TransferInCancellationRequestV04.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInConfirmationV02#mmMessageIdentification
 * TransferInConfirmationV02.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInConfirmationV03#mmMessageIdentification
 * TransferInConfirmationV03.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInConfirmationV04#mmMessageIdentification
 * TransferInConfirmationV04.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInInstructionV02#mmMessageIdentification
 * TransferInInstructionV02.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInInstructionV03#mmMessageIdentification
 * TransferInInstructionV03.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInInstructionV04#mmMessageIdentification
 * TransferInInstructionV04.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutCancellationRequestV02#mmMessageIdentification
 * TransferOutCancellationRequestV02.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutCancellationRequestV03#mmMessageIdentification
 * TransferOutCancellationRequestV03.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutCancellationRequestV04#mmMessageIdentification
 * TransferOutCancellationRequestV04.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutConfirmationV02#mmMessageIdentification
 * TransferOutConfirmationV02.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutConfirmationV03#mmMessageIdentification
 * TransferOutConfirmationV03.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutConfirmationV04#mmMessageIdentification
 * TransferOutConfirmationV04.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutInstructionV02#mmMessageIdentification
 * TransferOutInstructionV02.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutInstructionV03#mmMessageIdentification
 * TransferOutInstructionV03.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutInstructionV04#mmMessageIdentification
 * TransferOutInstructionV04.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.AccountingStatementOfHoldingsV02#mmMessageIdentification
 * AccountingStatementOfHoldingsV02.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.CustodyStatementOfHoldingsV02#mmMessageIdentification
 * CustodyStatementOfHoldingsV02.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.AccountingStatementOfHoldingsCancellationV02#mmMessageIdentification
 * AccountingStatementOfHoldingsCancellationV02.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.CustodyStatementOfHoldingsCancellationV02#mmMessageIdentification
 * CustodyStatementOfHoldingsCancellationV02.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundConfirmedCashForecastReportCancellationV02#mmMessageIdentification
 * FundConfirmedCashForecastReportCancellationV02.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundConfirmedCashForecastReportV03#mmMessageIdentification
 * FundConfirmedCashForecastReportV03.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportCancellationV02#mmMessageIdentification
 * FundDetailedConfirmedCashForecastReportCancellationV02.
 * mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportV03#mmMessageIdentification
 * FundDetailedConfirmedCashForecastReportV03.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedEstimatedCashForecastReportV03#mmMessageIdentification
 * FundDetailedEstimatedCashForecastReportV03.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundEstimatedCashForecastReportV03#mmMessageIdentification
 * FundEstimatedCashForecastReportV03.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.OrderCancellationStatusReportV03#mmMessageIdentification
 * OrderCancellationStatusReportV03.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.OrderConfirmationStatusReportV01#mmMessageIdentification
 * OrderConfirmationStatusReportV01.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.OrderInstructionStatusReportV03#mmMessageIdentification
 * OrderInstructionStatusReportV03.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderCancellationRequestV03#mmMessageIdentification
 * RedemptionBulkOrderCancellationRequestV03.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationAmendmentV01#mmMessageIdentification
 * RedemptionBulkOrderConfirmationAmendmentV01.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationCancellationInstructionV01#mmMessageIdentification
 * RedemptionBulkOrderConfirmationCancellationInstructionV01.
 * mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationV03#mmMessageIdentification
 * RedemptionBulkOrderConfirmationV03.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderV03#mmMessageIdentification
 * RedemptionBulkOrderV03.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderCancellationRequestV03#mmMessageIdentification
 * RedemptionOrderCancellationRequestV03.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderConfirmationAmendmentV01#mmMessageIdentification
 * RedemptionOrderConfirmationAmendmentV01.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderConfirmationCancellationInstructionV01#mmMessageIdentification
 * RedemptionOrderConfirmationCancellationInstructionV01.mmMessageIdentification
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderConfirmationV03#mmMessageIdentification
 * RedemptionOrderConfirmationV03.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderV03#mmMessageIdentification
 * RedemptionOrderV03.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.RequestForAccountManagementStatusReportV02#mmMessageIdentification
 * RequestForAccountManagementStatusReportV02.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RequestForOrderConfirmationStatusReportV01#mmMessageIdentification
 * RequestForOrderConfirmationStatusReportV01.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RequestForOrderStatusReportV03#mmMessageIdentification
 * RequestForOrderStatusReportV03.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesMessageRejectionV02#mmMessageIdentification
 * SecuritiesMessageRejectionV02.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.StatementOfInvestmentFundTransactionsCancellationV02#mmMessageIdentification
 * StatementOfInvestmentFundTransactionsCancellationV02.mmMessageIdentification}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.StatementOfInvestmentFundTransactionsV02#mmMessageIdentification
 * StatementOfInvestmentFundTransactionsV02.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderCancellationRequestV03#mmMessageIdentification
 * SubscriptionBulkOrderCancellationRequestV03.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationAmendmentV01#mmMessageIdentification
 * SubscriptionBulkOrderConfirmationAmendmentV01.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationCancellationInstructionV01#mmMessageIdentification
 * SubscriptionBulkOrderConfirmationCancellationInstructionV01.
 * mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationV03#mmMessageIdentification
 * SubscriptionBulkOrderConfirmationV03.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderV03#mmMessageIdentification
 * SubscriptionBulkOrderV03.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderCancellationRequestV03#mmMessageIdentification
 * SubscriptionOrderCancellationRequestV03.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderConfirmationAmendmentV01#mmMessageIdentification
 * SubscriptionOrderConfirmationAmendmentV01.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderConfirmationCancellationInstructionV01#mmMessageIdentification
 * SubscriptionOrderConfirmationCancellationInstructionV01.
 * mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderConfirmationV03#mmMessageIdentification
 * SubscriptionOrderConfirmationV03.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderV03#mmMessageIdentification
 * SubscriptionOrderV03.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderCancellationRequestV03#mmMessageIdentification
 * SwitchOrderCancellationRequestV03.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderConfirmationAmendmentV01#mmMessageIdentification
 * SwitchOrderConfirmationAmendmentV01.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderConfirmationCancellationInstructionV01#mmMessageIdentification
 * SwitchOrderConfirmationCancellationInstructionV01.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderConfirmationV03#mmMessageIdentification
 * SwitchOrderConfirmationV03.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderV03#mmMessageIdentification
 * SwitchOrderV03.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.RequestForTransferStatusReportV02#mmMessageIdentification
 * RequestForTransferStatusReportV02.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.RequestForTransferStatusReportV03#mmMessageIdentification
 * RequestForTransferStatusReportV03.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferCancellationStatusReportV02#mmMessageIdentification
 * TransferCancellationStatusReportV02.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferCancellationStatusReportV03#mmMessageIdentification
 * TransferCancellationStatusReportV03.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInstructionStatusReportV02#mmMessageIdentification
 * TransferInstructionStatusReportV02.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInstructionStatusReportV03#mmMessageIdentification
 * TransferInstructionStatusReportV03.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.RequestForPEPOrISAOrPortfolioInformationV01#mmMessageReference
 * RequestForPEPOrISAOrPortfolioInformationV01.mmMessageReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationRequestV02#mmMessageReference
 * AccountHoldingInformationRequestV02.mmMessageReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingNotificationV02#mmMeetingNotificationIdentification
 * MeetingNotificationV02.mmMeetingNotificationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingNotificationV03#mmIdentification
 * MeetingNotificationV03.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingNotificationV04#mmIdentification
 * MeetingNotificationV04.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingCancellationV02#mmCancellationIdentification
 * MeetingCancellationV02.mmCancellationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingCancellationV03#mmIdentification
 * MeetingCancellationV03.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingCancellationV04#mmIdentification
 * MeetingCancellationV04.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingEntitlementNotificationV02#mmEntitlementNotificationIdentification
 * MeetingEntitlementNotificationV02.mmEntitlementNotificationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingEntitlementNotificationV03#mmIdentification
 * MeetingEntitlementNotificationV03.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingEntitlementNotificationV04#mmIdentification
 * MeetingEntitlementNotificationV04.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingInstructionV02#mmMeetingInstructionIdentification
 * MeetingInstructionV02.mmMeetingInstructionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingInstructionV03#mmIdentification
 * MeetingInstructionV03.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingInstructionV04#mmIdentification
 * MeetingInstructionV04.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingInstructionCancellationRequestV02#mmInstructionCancellationIdentification
 * MeetingInstructionCancellationRequestV02.
 * mmInstructionCancellationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingInstructionCancellationRequestV03#mmIdentification
 * MeetingInstructionCancellationRequestV03.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingInstructionCancellationRequestV04#mmIdentification
 * MeetingInstructionCancellationRequestV04.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingInstructionStatusV02#mmMeetingInstructionStatusIdentification
 * MeetingInstructionStatusV02.mmMeetingInstructionStatusIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingInstructionStatusV03#mmIdentification
 * MeetingInstructionStatusV03.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingInstructionStatusV04#mmIdentification
 * MeetingInstructionStatusV04.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingVoteExecutionConfirmationV02#mmVoteExecutionConfirmationIdentification
 * MeetingVoteExecutionConfirmationV02.mmVoteExecutionConfirmationIdentification
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingVoteExecutionConfirmationV03#mmIdentification
 * MeetingVoteExecutionConfirmationV03.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingVoteExecutionConfirmationV04#mmIdentification
 * MeetingVoteExecutionConfirmationV04.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingResultDisseminationV02#mmMeetingResultDisseminationIdentification
 * MeetingResultDisseminationV02.mmMeetingResultDisseminationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingResultDisseminationV03#mmIdentification
 * MeetingResultDisseminationV03.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingResultDisseminationV04#mmIdentification
 * MeetingResultDisseminationV04.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsin.InvoiceFinancingRequestStatusV01#mmStatusIdentification
 * InvoiceFinancingRequestStatusV01.mmStatusIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsin.InvoiceFinancingCancellationRequestV01#mmCancellationRequestIdentification
 * InvoiceFinancingCancellationRequestV01.mmCancellationRequestIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.AcknowledgementV03#mmAcknowledgementIdentification
 * AcknowledgementV03.mmAcknowledgementIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.AcknowledgementV03#mmAcknowledgedMessageReference
 * AcknowledgementV03.mmAcknowledgedMessageReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ActivityReportV03#mmReportIdentification
 * ActivityReportV03.mmReportIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ActivityReportV03#mmRelatedMessageReference
 * ActivityReportV03.mmRelatedMessageReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ActivityReportRequestV03#mmRequestIdentification
 * ActivityReportRequestV03.mmRequestIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ActivityReportSetUpRequestV02#mmRequestIdentification
 * ActivityReportSetUpRequestV02.mmRequestIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.AmendmentAcceptanceV02#mmAcceptanceIdentification
 * AmendmentAcceptanceV02.mmAcceptanceIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.AmendmentAcceptanceV02#mmDeltaReportReference
 * AmendmentAcceptanceV02.mmDeltaReportReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.AmendmentAcceptanceNotificationV03#mmNotificationIdentification
 * AmendmentAcceptanceNotificationV03.mmNotificationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.AmendmentAcceptanceNotificationV03#mmDeltaReportReference
 * AmendmentAcceptanceNotificationV03.mmDeltaReportReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.AmendmentRejectionV02#mmRejectionIdentification
 * AmendmentRejectionV02.mmRejectionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.AmendmentRejectionV02#mmDeltaReportReference
 * AmendmentRejectionV02.mmDeltaReportReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.AmendmentRejectionNotificationV03#mmNotificationIdentification
 * AmendmentRejectionNotificationV03.mmNotificationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.AmendmentRejectionNotificationV03#mmDeltaReportReference
 * AmendmentRejectionNotificationV03.mmDeltaReportReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineAmendmentRequestV03#mmRequestIdentification
 * BaselineAmendmentRequestV03.mmRequestIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineMatchReportV03#mmReportIdentification
 * BaselineMatchReportV03.mmReportIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReportV03#mmReportIdentification
 * BaselineReportV03.mmReportIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReportV03#mmRelatedMessageReference
 * BaselineReportV03.mmRelatedMessageReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReSubmissionV03#mmSubmissionIdentification
 * BaselineReSubmissionV03.mmSubmissionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.DataSetMatchReportV03#mmReportIdentification
 * DataSetMatchReportV03.mmReportIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.DataSetSubmissionV03#mmSubmissionIdentification
 * DataSetSubmissionV03.mmSubmissionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.DeltaReportV03#mmReportIdentification
 * DeltaReportV03.mmReportIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ErrorReportV03#mmReportIdentification
 * ErrorReportV03.mmReportIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ErrorReportV03#mmRejectedMessageReference
 * ErrorReportV03.mmRejectedMessageReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV03#mmReportIdentification
 * ForwardDataSetSubmissionReportV03.mmReportIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.FullPushThroughReportV03#mmReportIdentification
 * FullPushThroughReportV03.mmReportIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.InitialBaselineSubmissionV03#mmSubmissionIdentification
 * InitialBaselineSubmissionV03.mmSubmissionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.MisMatchAcceptanceV02#mmAcceptanceIdentification
 * MisMatchAcceptanceV02.mmAcceptanceIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.MisMatchAcceptanceV02#mmDataSetMatchReportReference
 * MisMatchAcceptanceV02.mmDataSetMatchReportReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.MisMatchAcceptanceNotificationV03#mmNotificationIdentification
 * MisMatchAcceptanceNotificationV03.mmNotificationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.MisMatchAcceptanceNotificationV03#mmDataSetMatchReportReference
 * MisMatchAcceptanceNotificationV03.mmDataSetMatchReportReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.MisMatchRejectionV02#mmRejectionIdentification
 * MisMatchRejectionV02.mmRejectionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.MisMatchRejectionV02#mmDataSetMatchReportReference
 * MisMatchRejectionV02.mmDataSetMatchReportReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.MisMatchRejectionNotificationV03#mmNotificationIdentification
 * MisMatchRejectionNotificationV03.mmNotificationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.MisMatchRejectionNotificationV03#mmDataSetMatchReportReference
 * MisMatchRejectionNotificationV03.mmDataSetMatchReportReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ActionReminderV03#mmReminderIdentification
 * ActionReminderV03.mmReminderIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ActionReminderV03#mmMessageRequiringAction
 * ActionReminderV03.mmMessageRequiringAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusChangeNotificationV03#mmNotificationIdentification
 * StatusChangeNotificationV03.mmNotificationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusChangeRequestV02#mmRequestIdentification
 * StatusChangeRequestV02.mmRequestIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusChangeRequestAcceptanceV02#mmAcceptanceIdentification
 * StatusChangeRequestAcceptanceV02.mmAcceptanceIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusChangeRequestNotificationV03#mmNotificationIdentification
 * StatusChangeRequestNotificationV03.mmNotificationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusChangeRequestRejectionV02#mmRejectionIdentification
 * StatusChangeRequestRejectionV02.mmRejectionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusChangeRequestRejectionNotificationV03#mmNotificationIdentification
 * StatusChangeRequestRejectionNotificationV03.mmNotificationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusExtensionRequestAcceptanceV03#mmAcceptanceIdentification
 * StatusExtensionRequestAcceptanceV03.mmAcceptanceIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusExtensionNotificationV03#mmNotificationIdentification
 * StatusExtensionNotificationV03.mmNotificationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusExtensionRequestRejectionV03#mmRejectionIdentification
 * StatusExtensionRequestRejectionV03.mmRejectionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusExtensionRejectionNotificationV03#mmNotificationIdentification
 * StatusExtensionRejectionNotificationV03.mmNotificationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusExtensionRequestV03#mmRequestIdentification
 * StatusExtensionRequestV03.mmRequestIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusExtensionRequestNotificationV03#mmNotificationIdentification
 * StatusExtensionRequestNotificationV03.mmNotificationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusReportV03#mmReportIdentification
 * StatusReportV03.mmReportIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusReportV03#mmRelatedMessageReference
 * StatusReportV03.mmRelatedMessageReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusReportRequestV03#mmRequestIdentification
 * StatusReportRequestV03.mmRequestIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.TimeOutNotificationV03#mmNotificationIdentification
 * TimeOutNotificationV03.mmNotificationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.TransactionReportV03#mmReportIdentification
 * TransactionReportV03.mmReportIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.TransactionReportV03#mmRelatedMessageReference
 * TransactionReportV03.mmRelatedMessageReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.TransactionReportRequestV03#mmRequestIdentification
 * TransactionReportRequestV03.mmRequestIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.IntentToPayNotificationV01#mmNotificationIdentification
 * IntentToPayNotificationV01.mmNotificationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ForwardIntentToPayNotificationV01#mmNotificationIdentification
 * ForwardIntentToPayNotificationV01.mmNotificationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.IntentToPayReportV01#mmReportIdentification
 * IntentToPayReportV01.mmReportIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.SpecialRequestV01#mmRequestIdentification
 * SpecialRequestV01.mmRequestIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.SpecialNotificationV01#mmNotificationIdentification
 * SpecialNotificationV01.mmNotificationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.RoleAndBaselineAcceptanceV01#mmAcceptanceIdentification
 * RoleAndBaselineAcceptanceV01.mmAcceptanceIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.RoleAndBaselineAcceptanceV01#mmRelatedMessageReference
 * RoleAndBaselineAcceptanceV01.mmRelatedMessageReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.RoleAndBaselineRejectionV01#mmRejectionIdentification
 * RoleAndBaselineRejectionV01.mmRejectionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.RoleAndBaselineRejectionV01#mmRelatedMessageReference
 * RoleAndBaselineRejectionV01.mmRelatedMessageReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.RoleAndBaselineAcceptanceNotificationV01#mmNotificationIdentification
 * RoleAndBaselineAcceptanceNotificationV01.mmNotificationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.RoleAndBaselineRejectionNotificationV01#mmNotificationIdentification
 * RoleAndBaselineRejectionNotificationV01.mmNotificationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.PriceReportCorrectionV03#mmMessageIdentification
 * PriceReportCorrectionV03.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV04#mmMessageIdentification
 * AccountDetailsConfirmationV04.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV04#mmMessageIdentification
 * AccountModificationInstructionV04.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV04#mmMessageIdentification
 * AccountOpeningInstructionV04.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReSubmissionV04#mmSubmissionIdentification
 * BaselineReSubmissionV04.mmSubmissionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.DataSetSubmissionV04#mmSubmissionIdentification
 * DataSetSubmissionV04.mmSubmissionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.FullPushThroughReportV04#mmReportIdentification
 * FullPushThroughReportV04.mmReportIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineAmendmentRequestV04#mmRequestIdentification
 * BaselineAmendmentRequestV04.mmRequestIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV04#mmReportIdentification
 * ForwardDataSetSubmissionReportV04.mmReportIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ActivityReportV04#mmReportIdentification
 * ActivityReportV04.mmReportIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ActivityReportV04#mmRelatedMessageReference
 * ActivityReportV04.mmRelatedMessageReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.InitialBaselineSubmissionV04#mmSubmissionIdentification
 * InitialBaselineSubmissionV04.mmSubmissionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferInConfirmationV05#mmMessageIdentification
 * ReversalOfTransferInConfirmationV05.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInConfirmationV05#mmMessageIdentification
 * TransferInConfirmationV05.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInstructionStatusReportV04#mmMessageIdentification
 * TransferInstructionStatusReportV04.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationRequestV03#mmMessageReference
 * AccountHoldingInformationRequestV03.mmMessageReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutInstructionV05#mmMessageIdentification
 * TransferOutInstructionV05.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV04#mmMessageReference
 * AccountHoldingInformationV04.mmMessageReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferCancellationRequestV05#mmMessageReference
 * PortfolioTransferCancellationRequestV05.mmMessageReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferCancellationStatusReportV04#mmMessageIdentification
 * TransferCancellationStatusReportV04.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV05#mmMessageReference
 * PortfolioTransferInstructionV05.mmMessageReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInInstructionV05#mmMessageIdentification
 * TransferInInstructionV05.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInCancellationRequestV05#mmMessageIdentification
 * TransferInCancellationRequestV05.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV05#mmMessageReference
 * PortfolioTransferConfirmationV05.mmMessageReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutConfirmationV05#mmMessageIdentification
 * TransferOutConfirmationV05.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.RequestForTransferStatusReportV04#mmMessageIdentification
 * RequestForTransferStatusReportV04.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferOutConfirmationV05#mmMessageIdentification
 * ReversalOfTransferOutConfirmationV05.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutCancellationRequestV05#mmMessageIdentification
 * TransferOutCancellationRequestV05.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountManagementStatusReportV04#mmMessageIdentification
 * AccountManagementStatusReportV04.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.IntentToPayNotificationV02#mmNotificationIdentification
 * IntentToPayNotificationV02.mmNotificationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ForwardIntentToPayNotificationV02#mmNotificationIdentification
 * ForwardIntentToPayNotificationV02.mmNotificationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedEstimatedCashForecastReportV04#mmMessageIdentification
 * FundDetailedEstimatedCashForecastReportV04.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV05#mmMessageIdentification
 * AccountOpeningInstructionV05.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundConfirmedCashForecastReportV04#mmMessageIdentification
 * FundConfirmedCashForecastReportV04.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportCancellationV03#mmMessageIdentification
 * FundDetailedConfirmedCashForecastReportCancellationV03.
 * mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundEstimatedCashForecastReportV04#mmMessageIdentification
 * FundEstimatedCashForecastReportV04.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV05#mmMessageIdentification
 * AccountModificationInstructionV05.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.RequestForAccountManagementStatusReportV03#mmMessageIdentification
 * RequestForAccountManagementStatusReportV03.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.StatementOfInvestmentFundTransactionsV03#mmMessageIdentification
 * StatementOfInvestmentFundTransactionsV03.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesMessageRejectionV03#mmMessageIdentification
 * SecuritiesMessageRejectionV03.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundConfirmedCashForecastReportCancellationV03#mmMessageIdentification
 * FundConfirmedCashForecastReportCancellationV03.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.StatementOfInvestmentFundTransactionsCancellationV03#mmMessageIdentification
 * StatementOfInvestmentFundTransactionsCancellationV03.mmMessageIdentification}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV05#mmMessageIdentification
 * AccountDetailsConfirmationV05.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferCancellationRequestV06#mmMessageReference
 * PortfolioTransferCancellationRequestV06.mmMessageReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportV04#mmMessageIdentification
 * FundDetailedConfirmedCashForecastReportV04.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV06#mmMessageReference
 * PortfolioTransferConfirmationV06.mmMessageReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV06#mmMessageReference
 * PortfolioTransferInstructionV06.mmMessageReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReportV04#mmReportIdentification
 * BaselineReportV04.mmReportIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReportV04#mmRelatedMessageReference
 * BaselineReportV04.mmRelatedMessageReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.InitialBaselineSubmissionV05#mmSubmissionIdentification
 * InitialBaselineSubmissionV05.mmSubmissionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineAmendmentRequestV05#mmRequestIdentification
 * BaselineAmendmentRequestV05.mmRequestIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.FullPushThroughReportV05#mmReportIdentification
 * FullPushThroughReportV05.mmReportIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV05#mmReportIdentification
 * ForwardDataSetSubmissionReportV05.mmReportIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.DataSetSubmissionV05#mmSubmissionIdentification
 * DataSetSubmissionV05.mmSubmissionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReSubmissionV05#mmSubmissionIdentification
 * BaselineReSubmissionV05.mmSubmissionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInInstructionV06#mmMessageIdentification
 * TransferInInstructionV06.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutConfirmationV06#mmMessageIdentification
 * TransferOutConfirmationV06.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutInstructionV06#mmMessageIdentification
 * TransferOutInstructionV06.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutCancellationRequestV06#mmMessageIdentification
 * TransferOutCancellationRequestV06.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInConfirmationV06#mmMessageIdentification
 * TransferInConfirmationV06.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferOutConfirmationV06#mmMessageIdentification
 * ReversalOfTransferOutConfirmationV06.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInCancellationRequestV06#mmMessageIdentification
 * TransferInCancellationRequestV06.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferInConfirmationV06#mmMessageIdentification
 * ReversalOfTransferInConfirmationV06.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceTransparencyReportStatusAdviceV01#mmMessageIdentification
 * SecuritiesBalanceTransparencyReportStatusAdviceV01.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV07#mmMessageReference
 * PortfolioTransferInstructionV07.mmMessageReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferOutConfirmationV07#mmMessageIdentification
 * ReversalOfTransferOutConfirmationV07.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutCancellationRequestV07#mmMessageIdentification
 * TransferOutCancellationRequestV07.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV05#mmMessageReference
 * AccountHoldingInformationV05.mmMessageReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferCancellationRequestV07#mmMessageReference
 * PortfolioTransferCancellationRequestV07.mmMessageReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInstructionStatusReportV05#mmMessageIdentification
 * TransferInstructionStatusReportV05.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInConfirmationV07#mmMessageIdentification
 * TransferInConfirmationV07.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV06#mmMessageIdentification
 * AccountOpeningInstructionV06.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutConfirmationV07#mmMessageIdentification
 * TransferOutConfirmationV07.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.RequestForTransferStatusReportV05#mmMessageIdentification
 * RequestForTransferStatusReportV05.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV06#mmMessageIdentification
 * AccountDetailsConfirmationV06.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.RequestForAccountManagementStatusReportV04#mmMessageIdentification
 * RequestForAccountManagementStatusReportV04.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInCancellationRequestV07#mmMessageIdentification
 * TransferInCancellationRequestV07.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV07#mmMessageReference
 * PortfolioTransferConfirmationV07.mmMessageReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferCancellationStatusReportV05#mmMessageIdentification
 * TransferCancellationStatusReportV05.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutInstructionV07#mmMessageIdentification
 * TransferOutInstructionV07.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountManagementStatusReportV05#mmMessageIdentification
 * AccountManagementStatusReportV05.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV06#mmMessageIdentification
 * AccountModificationInstructionV06.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInInstructionV07#mmMessageIdentification
 * TransferInInstructionV07.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationRequestV04#mmMessageReference
 * AccountHoldingInformationRequestV04.mmMessageReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferInConfirmationV07#mmMessageIdentification
 * ReversalOfTransferInConfirmationV07.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeConfirmationStatusAdviceV01#mmAdviceIdentification
 * ForeignExchangeTradeConfirmationStatusAdviceV01.mmAdviceIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeConfirmationRequestCancellationRequestV01#mmCancellationRequestIdentification
 * ForeignExchangeTradeConfirmationRequestCancellationRequestV01.
 * mmCancellationRequestIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeConfirmationRequestAmendmentRequestV01#mmAmendmentRequestIdentification
 * ForeignExchangeTradeConfirmationRequestAmendmentRequestV01.
 * mmAmendmentRequestIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeConfirmationStatusAdviceAcknowledgementV01#mmAdviceAcknowledgementIdentification
 * ForeignExchangeTradeConfirmationStatusAdviceAcknowledgementV01.
 * mmAdviceAcknowledgementIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeConfirmationStatusAdviceAcknowledgementV01#mmRequestIdentification
 * ForeignExchangeTradeConfirmationStatusAdviceAcknowledgementV01.
 * mmRequestIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeConfirmationRequestV01#mmRequestIdentification
 * ForeignExchangeTradeConfirmationRequestV01.mmRequestIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeCaptureReportRequestV01#mmQueryRequestIdentification
 * ForeignExchangeTradeCaptureReportRequestV01.mmQueryRequestIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeCaptureReportV01#mmReportIdentification
 * ForeignExchangeTradeCaptureReportV01.mmReportIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeCaptureReportAcknowledgementV01#mmAcknowledgementIdentification
 * ForeignExchangeTradeCaptureReportAcknowledgementV01.
 * mmAcknowledgementIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceTransparencyReportV02#mmMessageIdentification
 * SecuritiesBalanceTransparencyReportV02.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationV04#mmMessageIdentification
 * SubscriptionBulkOrderConfirmationV04.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderV04#mmMessageIdentification
 * RedemptionBulkOrderV04.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderCancellationRequestV04#mmMessageIdentification
 * SubscriptionBulkOrderCancellationRequestV04.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderV04#mmMessageIdentification
 * RedemptionOrderV04.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderCancellationRequestV04#mmMessageIdentification
 * SubscriptionOrderCancellationRequestV04.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationCancellationInstructionV02#mmMessageIdentification
 * RedemptionBulkOrderConfirmationCancellationInstructionV02.
 * mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationV04#mmMessageIdentification
 * RedemptionBulkOrderConfirmationV04.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderCancellationRequestV04#mmMessageIdentification
 * RedemptionBulkOrderCancellationRequestV04.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderConfirmationV04#mmMessageIdentification
 * SwitchOrderConfirmationV04.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RequestForOrderStatusReportV04#mmMessageIdentification
 * RequestForOrderStatusReportV04.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderConfirmationV04#mmMessageIdentification
 * SubscriptionOrderConfirmationV04.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderConfirmationCancellationInstructionV02#mmMessageIdentification
 * SubscriptionOrderConfirmationCancellationInstructionV02.
 * mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderCancellationRequestV04#mmMessageIdentification
 * SwitchOrderCancellationRequestV04.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.OrderCancellationStatusReportV04#mmMessageIdentification
 * OrderCancellationStatusReportV04.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderV04#mmMessageIdentification
 * SwitchOrderV04.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderConfirmationCancellationInstructionV02#mmMessageIdentification
 * RedemptionOrderConfirmationCancellationInstructionV02.mmMessageIdentification
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderConfirmationV04#mmMessageIdentification
 * RedemptionOrderConfirmationV04.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.OrderInstructionStatusReportV04#mmMessageIdentification
 * OrderInstructionStatusReportV04.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationCancellationInstructionV02#mmMessageIdentification
 * SubscriptionBulkOrderConfirmationCancellationInstructionV02.
 * mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderCancellationRequestV04#mmMessageIdentification
 * RedemptionOrderCancellationRequestV04.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RequestForOrderConfirmationStatusReportV02#mmMessageIdentification
 * RequestForOrderConfirmationStatusReportV02.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderV04#mmMessageIdentification
 * SubscriptionBulkOrderV04.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderConfirmationCancellationInstructionV02#mmMessageIdentification
 * SwitchOrderConfirmationCancellationInstructionV02.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.OrderConfirmationStatusReportV02#mmMessageIdentification
 * OrderConfirmationStatusReportV02.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderV04#mmMessageIdentification
 * SubscriptionOrderV04.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV07#mmMessageIdentification
 * AccountDetailsConfirmationV07.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV07#mmMessageIdentification
 * AccountModificationInstructionV07.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV07#mmMessageIdentification
 * AccountOpeningInstructionV07.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountManagementStatusReportV06#mmMessageIdentification
 * AccountManagementStatusReportV06.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.RequestForAccountManagementStatusReportV05#mmMessageIdentification
 * RequestForAccountManagementStatusReportV05.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferOutConfirmationV08#mmMessageIdentification
 * ReversalOfTransferOutConfirmationV08.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInConfirmationV08#mmMessageIdentification
 * TransferInConfirmationV08.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV08#mmMessageReference
 * PortfolioTransferInstructionV08.mmMessageReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferCancellationRequestV08#mmMessageReference
 * PortfolioTransferCancellationRequestV08.mmMessageReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutCancellationRequestV08#mmMessageIdentification
 * TransferOutCancellationRequestV08.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInInstructionV08#mmMessageIdentification
 * TransferInInstructionV08.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV08#mmMessageReference
 * PortfolioTransferConfirmationV08.mmMessageReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV06#mmMessageReference
 * AccountHoldingInformationV06.mmMessageReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutConfirmationV08#mmMessageIdentification
 * TransferOutConfirmationV08.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInCancellationRequestV08#mmMessageIdentification
 * TransferInCancellationRequestV08.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutInstructionV08#mmMessageIdentification
 * TransferOutInstructionV08.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferCancellationStatusReportV06#mmMessageIdentification
 * TransferCancellationStatusReportV06.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationRequestV05#mmMessageReference
 * AccountHoldingInformationRequestV05.mmMessageReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferInConfirmationV08#mmMessageIdentification
 * ReversalOfTransferInConfirmationV08.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.RequestForTransferStatusReportV06#mmMessageIdentification
 * RequestForTransferStatusReportV06.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInstructionStatusReportV06#mmMessageIdentification
 * TransferInstructionStatusReportV06.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountSwitchInformationResponseV01#mmMessageIdentification
 * AccountSwitchInformationResponseV01.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountSwitchBalanceTransferAcknowledgementV01#mmMessageIdentification
 * AccountSwitchBalanceTransferAcknowledgementV01.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountSwitchTechnicalRejectionV01#mmMessageIdentification
 * AccountSwitchTechnicalRejectionV01.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountSwitchPaymentResponseV01#mmMessageIdentification
 * AccountSwitchPaymentResponseV01.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountSwitchNotifyAccountSwitchCompleteV01#mmMessageIdentification
 * AccountSwitchNotifyAccountSwitchCompleteV01.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountSwitchRequestBalanceTransferV01#mmMessageIdentification
 * AccountSwitchRequestBalanceTransferV01.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountSwitchInformationRequestV01#mmMessageIdentification
 * AccountSwitchInformationRequestV01.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountSwitchRequestRedirectionV01#mmMessageIdentification
 * AccountSwitchRequestRedirectionV01.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountSwitchTerminationSwitchV01#mmMessageIdentification
 * AccountSwitchTerminationSwitchV01.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountSwitchCancelExistingPaymentV01#mmMessageIdentification
 * AccountSwitchCancelExistingPaymentV01.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountSwitchRequestPaymentV01#mmMessageIdentification
 * AccountSwitchRequestPaymentV01.mmMessageIdentification}</li>
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
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "MessageIdentification1", propOrder = {"identification", "creationDateTime"})
public class MessageIdentification1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Id", required = true)
	protected Max35Text identification;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute mmIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MessageIdentification1.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Identification of the message.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "CreDtTm", required = true)
	protected ISODateTime creationDateTime;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute mmCreationDateTime = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MessageIdentification1.mmObject();
			isDerived = false;
			xmlTag = "CreDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreationDateTime";
			definition = "Date of creation of the message.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MessageIdentification1.mmIdentification, com.tools20022.repository.msg.MessageIdentification1.mmCreationDateTime);
				messageBuildingBlock_lazy = () -> Arrays.asList(FundProcessingPassportReportV02.mmMessageIdentification, InvestmentFundReportRequestV02.mmMessageIdentification, AccountDetailsConfirmationV02.mmMessageIdentification,
						AccountDetailsConfirmationV03.mmMessageIdentification, PEPOrISAOrPortfolioInformationV01.mmMessageReference, AccountHoldingInformationV02.mmMessageReference, AccountHoldingInformationV03.mmMessageReference,
						AccountManagementStatusReportV02.mmMessageIdentification, AccountManagementStatusReportV03.mmMessageIdentification, AccountModificationInstructionV02.mmMessageIdentification,
						AccountModificationInstructionV03.mmMessageIdentification, AccountOpeningInstructionV02.mmMessageIdentification, AccountOpeningInstructionV03.mmMessageIdentification,
						PEPOrISAOrPortfolioTransferCancellationRequestV02.mmMessageReference, PortfolioTransferCancellationRequestV03.mmMessageReference, PortfolioTransferCancellationRequestV04.mmMessageReference,
						PEPOrISAOrPortfolioTransferConfirmationV02.mmMessageReference, PortfolioTransferConfirmationV03.mmMessageReference, PortfolioTransferConfirmationV04.mmMessageReference,
						PEPOrISAOrPortfolioTransferInstructionV02.mmMessageReference, PortfolioTransferInstructionV03.mmMessageReference, PortfolioTransferInstructionV04.mmMessageReference,
						PriceReportCancellationV03.mmMessageIdentification, PriceReportCancellationV04.mmMessageIdentification, PriceReportV03.mmMessageIdentification, PriceReportV04.mmMessageIdentification,
						ReversalOfTransferInConfirmationV02.mmMessageIdentification, ReversalOfTransferInConfirmationV03.mmMessageIdentification, ReversalOfTransferInConfirmationV04.mmMessageIdentification,
						ReversalOfTransferOutConfirmationV02.mmMessageIdentification, ReversalOfTransferOutConfirmationV03.mmMessageIdentification, ReversalOfTransferOutConfirmationV04.mmMessageIdentification,
						TransferInCancellationRequestV02.mmMessageIdentification, TransferInCancellationRequestV03.mmMessageIdentification, TransferInCancellationRequestV04.mmMessageIdentification,
						TransferInConfirmationV02.mmMessageIdentification, TransferInConfirmationV03.mmMessageIdentification, TransferInConfirmationV04.mmMessageIdentification, TransferInInstructionV02.mmMessageIdentification,
						TransferInInstructionV03.mmMessageIdentification, TransferInInstructionV04.mmMessageIdentification, TransferOutCancellationRequestV02.mmMessageIdentification,
						TransferOutCancellationRequestV03.mmMessageIdentification, TransferOutCancellationRequestV04.mmMessageIdentification, TransferOutConfirmationV02.mmMessageIdentification,
						TransferOutConfirmationV03.mmMessageIdentification, TransferOutConfirmationV04.mmMessageIdentification, TransferOutInstructionV02.mmMessageIdentification, TransferOutInstructionV03.mmMessageIdentification,
						TransferOutInstructionV04.mmMessageIdentification, AccountingStatementOfHoldingsV02.mmMessageIdentification, CustodyStatementOfHoldingsV02.mmMessageIdentification,
						AccountingStatementOfHoldingsCancellationV02.mmMessageIdentification, CustodyStatementOfHoldingsCancellationV02.mmMessageIdentification, FundConfirmedCashForecastReportCancellationV02.mmMessageIdentification,
						FundConfirmedCashForecastReportV03.mmMessageIdentification, FundDetailedConfirmedCashForecastReportCancellationV02.mmMessageIdentification, FundDetailedConfirmedCashForecastReportV03.mmMessageIdentification,
						FundDetailedEstimatedCashForecastReportV03.mmMessageIdentification, FundEstimatedCashForecastReportV03.mmMessageIdentification, OrderCancellationStatusReportV03.mmMessageIdentification,
						OrderConfirmationStatusReportV01.mmMessageIdentification, OrderInstructionStatusReportV03.mmMessageIdentification, RedemptionBulkOrderCancellationRequestV03.mmMessageIdentification,
						RedemptionBulkOrderConfirmationAmendmentV01.mmMessageIdentification, RedemptionBulkOrderConfirmationCancellationInstructionV01.mmMessageIdentification, RedemptionBulkOrderConfirmationV03.mmMessageIdentification,
						RedemptionBulkOrderV03.mmMessageIdentification, RedemptionOrderCancellationRequestV03.mmMessageIdentification, RedemptionOrderConfirmationAmendmentV01.mmMessageIdentification,
						RedemptionOrderConfirmationCancellationInstructionV01.mmMessageIdentification, RedemptionOrderConfirmationV03.mmMessageIdentification, RedemptionOrderV03.mmMessageIdentification,
						RequestForAccountManagementStatusReportV02.mmMessageIdentification, RequestForOrderConfirmationStatusReportV01.mmMessageIdentification, RequestForOrderStatusReportV03.mmMessageIdentification,
						SecuritiesMessageRejectionV02.mmMessageIdentification, StatementOfInvestmentFundTransactionsCancellationV02.mmMessageIdentification, StatementOfInvestmentFundTransactionsV02.mmMessageIdentification,
						SubscriptionBulkOrderCancellationRequestV03.mmMessageIdentification, SubscriptionBulkOrderConfirmationAmendmentV01.mmMessageIdentification,
						SubscriptionBulkOrderConfirmationCancellationInstructionV01.mmMessageIdentification, SubscriptionBulkOrderConfirmationV03.mmMessageIdentification, SubscriptionBulkOrderV03.mmMessageIdentification,
						SubscriptionOrderCancellationRequestV03.mmMessageIdentification, SubscriptionOrderConfirmationAmendmentV01.mmMessageIdentification, SubscriptionOrderConfirmationCancellationInstructionV01.mmMessageIdentification,
						SubscriptionOrderConfirmationV03.mmMessageIdentification, SubscriptionOrderV03.mmMessageIdentification, SwitchOrderCancellationRequestV03.mmMessageIdentification,
						SwitchOrderConfirmationAmendmentV01.mmMessageIdentification, SwitchOrderConfirmationCancellationInstructionV01.mmMessageIdentification, SwitchOrderConfirmationV03.mmMessageIdentification,
						SwitchOrderV03.mmMessageIdentification, RequestForTransferStatusReportV02.mmMessageIdentification, RequestForTransferStatusReportV03.mmMessageIdentification,
						TransferCancellationStatusReportV02.mmMessageIdentification, TransferCancellationStatusReportV03.mmMessageIdentification, TransferInstructionStatusReportV02.mmMessageIdentification,
						TransferInstructionStatusReportV03.mmMessageIdentification, RequestForPEPOrISAOrPortfolioInformationV01.mmMessageReference, AccountHoldingInformationRequestV02.mmMessageReference,
						MeetingNotificationV02.mmMeetingNotificationIdentification, MeetingNotificationV03.mmIdentification, MeetingNotificationV04.mmIdentification, MeetingCancellationV02.mmCancellationIdentification,
						MeetingCancellationV03.mmIdentification, MeetingCancellationV04.mmIdentification, MeetingEntitlementNotificationV02.mmEntitlementNotificationIdentification, MeetingEntitlementNotificationV03.mmIdentification,
						MeetingEntitlementNotificationV04.mmIdentification, MeetingInstructionV02.mmMeetingInstructionIdentification, MeetingInstructionV03.mmIdentification, MeetingInstructionV04.mmIdentification,
						MeetingInstructionCancellationRequestV02.mmInstructionCancellationIdentification, MeetingInstructionCancellationRequestV03.mmIdentification, MeetingInstructionCancellationRequestV04.mmIdentification,
						MeetingInstructionStatusV02.mmMeetingInstructionStatusIdentification, MeetingInstructionStatusV03.mmIdentification, MeetingInstructionStatusV04.mmIdentification,
						MeetingVoteExecutionConfirmationV02.mmVoteExecutionConfirmationIdentification, MeetingVoteExecutionConfirmationV03.mmIdentification, MeetingVoteExecutionConfirmationV04.mmIdentification,
						MeetingResultDisseminationV02.mmMeetingResultDisseminationIdentification, MeetingResultDisseminationV03.mmIdentification, MeetingResultDisseminationV04.mmIdentification,
						InvoiceFinancingRequestStatusV01.mmStatusIdentification, InvoiceFinancingCancellationRequestV01.mmCancellationRequestIdentification, AcknowledgementV03.mmAcknowledgementIdentification,
						AcknowledgementV03.mmAcknowledgedMessageReference, ActivityReportV03.mmReportIdentification, ActivityReportV03.mmRelatedMessageReference, ActivityReportRequestV03.mmRequestIdentification,
						ActivityReportSetUpRequestV02.mmRequestIdentification, AmendmentAcceptanceV02.mmAcceptanceIdentification, AmendmentAcceptanceV02.mmDeltaReportReference,
						AmendmentAcceptanceNotificationV03.mmNotificationIdentification, AmendmentAcceptanceNotificationV03.mmDeltaReportReference, AmendmentRejectionV02.mmRejectionIdentification,
						AmendmentRejectionV02.mmDeltaReportReference, AmendmentRejectionNotificationV03.mmNotificationIdentification, AmendmentRejectionNotificationV03.mmDeltaReportReference,
						BaselineAmendmentRequestV03.mmRequestIdentification, BaselineMatchReportV03.mmReportIdentification, BaselineReportV03.mmReportIdentification, BaselineReportV03.mmRelatedMessageReference,
						BaselineReSubmissionV03.mmSubmissionIdentification, DataSetMatchReportV03.mmReportIdentification, DataSetSubmissionV03.mmSubmissionIdentification, DeltaReportV03.mmReportIdentification,
						ErrorReportV03.mmReportIdentification, ErrorReportV03.mmRejectedMessageReference, ForwardDataSetSubmissionReportV03.mmReportIdentification, FullPushThroughReportV03.mmReportIdentification,
						InitialBaselineSubmissionV03.mmSubmissionIdentification, MisMatchAcceptanceV02.mmAcceptanceIdentification, MisMatchAcceptanceV02.mmDataSetMatchReportReference,
						MisMatchAcceptanceNotificationV03.mmNotificationIdentification, MisMatchAcceptanceNotificationV03.mmDataSetMatchReportReference, MisMatchRejectionV02.mmRejectionIdentification,
						MisMatchRejectionV02.mmDataSetMatchReportReference, MisMatchRejectionNotificationV03.mmNotificationIdentification, MisMatchRejectionNotificationV03.mmDataSetMatchReportReference,
						ActionReminderV03.mmReminderIdentification, ActionReminderV03.mmMessageRequiringAction, StatusChangeNotificationV03.mmNotificationIdentification, StatusChangeRequestV02.mmRequestIdentification,
						StatusChangeRequestAcceptanceV02.mmAcceptanceIdentification, StatusChangeRequestNotificationV03.mmNotificationIdentification, StatusChangeRequestRejectionV02.mmRejectionIdentification,
						StatusChangeRequestRejectionNotificationV03.mmNotificationIdentification, StatusExtensionRequestAcceptanceV03.mmAcceptanceIdentification, StatusExtensionNotificationV03.mmNotificationIdentification,
						StatusExtensionRequestRejectionV03.mmRejectionIdentification, StatusExtensionRejectionNotificationV03.mmNotificationIdentification, StatusExtensionRequestV03.mmRequestIdentification,
						StatusExtensionRequestNotificationV03.mmNotificationIdentification, StatusReportV03.mmReportIdentification, StatusReportV03.mmRelatedMessageReference, StatusReportRequestV03.mmRequestIdentification,
						TimeOutNotificationV03.mmNotificationIdentification, TransactionReportV03.mmReportIdentification, TransactionReportV03.mmRelatedMessageReference, TransactionReportRequestV03.mmRequestIdentification,
						IntentToPayNotificationV01.mmNotificationIdentification, ForwardIntentToPayNotificationV01.mmNotificationIdentification, IntentToPayReportV01.mmReportIdentification, SpecialRequestV01.mmRequestIdentification,
						SpecialNotificationV01.mmNotificationIdentification, RoleAndBaselineAcceptanceV01.mmAcceptanceIdentification, RoleAndBaselineAcceptanceV01.mmRelatedMessageReference,
						RoleAndBaselineRejectionV01.mmRejectionIdentification, RoleAndBaselineRejectionV01.mmRelatedMessageReference, RoleAndBaselineAcceptanceNotificationV01.mmNotificationIdentification,
						RoleAndBaselineRejectionNotificationV01.mmNotificationIdentification, PriceReportCorrectionV03.mmMessageIdentification, AccountDetailsConfirmationV04.mmMessageIdentification,
						AccountModificationInstructionV04.mmMessageIdentification, AccountOpeningInstructionV04.mmMessageIdentification, BaselineReSubmissionV04.mmSubmissionIdentification, DataSetSubmissionV04.mmSubmissionIdentification,
						FullPushThroughReportV04.mmReportIdentification, BaselineAmendmentRequestV04.mmRequestIdentification, ForwardDataSetSubmissionReportV04.mmReportIdentification, ActivityReportV04.mmReportIdentification,
						ActivityReportV04.mmRelatedMessageReference, InitialBaselineSubmissionV04.mmSubmissionIdentification, ReversalOfTransferInConfirmationV05.mmMessageIdentification, TransferInConfirmationV05.mmMessageIdentification,
						TransferInstructionStatusReportV04.mmMessageIdentification, AccountHoldingInformationRequestV03.mmMessageReference, TransferOutInstructionV05.mmMessageIdentification, AccountHoldingInformationV04.mmMessageReference,
						PortfolioTransferCancellationRequestV05.mmMessageReference, TransferCancellationStatusReportV04.mmMessageIdentification, PortfolioTransferInstructionV05.mmMessageReference,
						TransferInInstructionV05.mmMessageIdentification, TransferInCancellationRequestV05.mmMessageIdentification, PortfolioTransferConfirmationV05.mmMessageReference, TransferOutConfirmationV05.mmMessageIdentification,
						RequestForTransferStatusReportV04.mmMessageIdentification, ReversalOfTransferOutConfirmationV05.mmMessageIdentification, TransferOutCancellationRequestV05.mmMessageIdentification,
						AccountManagementStatusReportV04.mmMessageIdentification, IntentToPayNotificationV02.mmNotificationIdentification, ForwardIntentToPayNotificationV02.mmNotificationIdentification,
						FundDetailedEstimatedCashForecastReportV04.mmMessageIdentification, AccountOpeningInstructionV05.mmMessageIdentification, FundConfirmedCashForecastReportV04.mmMessageIdentification,
						FundDetailedConfirmedCashForecastReportCancellationV03.mmMessageIdentification, FundEstimatedCashForecastReportV04.mmMessageIdentification, AccountModificationInstructionV05.mmMessageIdentification,
						RequestForAccountManagementStatusReportV03.mmMessageIdentification, StatementOfInvestmentFundTransactionsV03.mmMessageIdentification, SecuritiesMessageRejectionV03.mmMessageIdentification,
						FundConfirmedCashForecastReportCancellationV03.mmMessageIdentification, StatementOfInvestmentFundTransactionsCancellationV03.mmMessageIdentification, AccountDetailsConfirmationV05.mmMessageIdentification,
						PortfolioTransferCancellationRequestV06.mmMessageReference, FundDetailedConfirmedCashForecastReportV04.mmMessageIdentification, PortfolioTransferConfirmationV06.mmMessageReference,
						PortfolioTransferInstructionV06.mmMessageReference, BaselineReportV04.mmReportIdentification, BaselineReportV04.mmRelatedMessageReference, InitialBaselineSubmissionV05.mmSubmissionIdentification,
						BaselineAmendmentRequestV05.mmRequestIdentification, FullPushThroughReportV05.mmReportIdentification, ForwardDataSetSubmissionReportV05.mmReportIdentification, DataSetSubmissionV05.mmSubmissionIdentification,
						BaselineReSubmissionV05.mmSubmissionIdentification, TransferInInstructionV06.mmMessageIdentification, TransferOutConfirmationV06.mmMessageIdentification, TransferOutInstructionV06.mmMessageIdentification,
						TransferOutCancellationRequestV06.mmMessageIdentification, TransferInConfirmationV06.mmMessageIdentification, ReversalOfTransferOutConfirmationV06.mmMessageIdentification,
						TransferInCancellationRequestV06.mmMessageIdentification, ReversalOfTransferInConfirmationV06.mmMessageIdentification, SecuritiesBalanceTransparencyReportStatusAdviceV01.mmMessageIdentification,
						PortfolioTransferInstructionV07.mmMessageReference, ReversalOfTransferOutConfirmationV07.mmMessageIdentification, TransferOutCancellationRequestV07.mmMessageIdentification,
						AccountHoldingInformationV05.mmMessageReference, PortfolioTransferCancellationRequestV07.mmMessageReference, TransferInstructionStatusReportV05.mmMessageIdentification,
						TransferInConfirmationV07.mmMessageIdentification, AccountOpeningInstructionV06.mmMessageIdentification, TransferOutConfirmationV07.mmMessageIdentification, RequestForTransferStatusReportV05.mmMessageIdentification,
						AccountDetailsConfirmationV06.mmMessageIdentification, RequestForAccountManagementStatusReportV04.mmMessageIdentification, TransferInCancellationRequestV07.mmMessageIdentification,
						PortfolioTransferConfirmationV07.mmMessageReference, TransferCancellationStatusReportV05.mmMessageIdentification, TransferOutInstructionV07.mmMessageIdentification,
						AccountManagementStatusReportV05.mmMessageIdentification, AccountModificationInstructionV06.mmMessageIdentification, TransferInInstructionV07.mmMessageIdentification,
						AccountHoldingInformationRequestV04.mmMessageReference, ReversalOfTransferInConfirmationV07.mmMessageIdentification, ForeignExchangeTradeConfirmationStatusAdviceV01.mmAdviceIdentification,
						ForeignExchangeTradeConfirmationRequestCancellationRequestV01.mmCancellationRequestIdentification, ForeignExchangeTradeConfirmationRequestAmendmentRequestV01.mmAmendmentRequestIdentification,
						ForeignExchangeTradeConfirmationStatusAdviceAcknowledgementV01.mmAdviceAcknowledgementIdentification, ForeignExchangeTradeConfirmationStatusAdviceAcknowledgementV01.mmRequestIdentification,
						ForeignExchangeTradeConfirmationRequestV01.mmRequestIdentification, ForeignExchangeTradeCaptureReportRequestV01.mmQueryRequestIdentification, ForeignExchangeTradeCaptureReportV01.mmReportIdentification,
						ForeignExchangeTradeCaptureReportAcknowledgementV01.mmAcknowledgementIdentification, SecuritiesBalanceTransparencyReportV02.mmMessageIdentification, SubscriptionBulkOrderConfirmationV04.mmMessageIdentification,
						RedemptionBulkOrderV04.mmMessageIdentification, SubscriptionBulkOrderCancellationRequestV04.mmMessageIdentification, RedemptionOrderV04.mmMessageIdentification,
						SubscriptionOrderCancellationRequestV04.mmMessageIdentification, RedemptionBulkOrderConfirmationCancellationInstructionV02.mmMessageIdentification, RedemptionBulkOrderConfirmationV04.mmMessageIdentification,
						RedemptionBulkOrderCancellationRequestV04.mmMessageIdentification, SwitchOrderConfirmationV04.mmMessageIdentification, RequestForOrderStatusReportV04.mmMessageIdentification,
						SubscriptionOrderConfirmationV04.mmMessageIdentification, SubscriptionOrderConfirmationCancellationInstructionV02.mmMessageIdentification, SwitchOrderCancellationRequestV04.mmMessageIdentification,
						OrderCancellationStatusReportV04.mmMessageIdentification, SwitchOrderV04.mmMessageIdentification, RedemptionOrderConfirmationCancellationInstructionV02.mmMessageIdentification,
						RedemptionOrderConfirmationV04.mmMessageIdentification, OrderInstructionStatusReportV04.mmMessageIdentification, SubscriptionBulkOrderConfirmationCancellationInstructionV02.mmMessageIdentification,
						RedemptionOrderCancellationRequestV04.mmMessageIdentification, RequestForOrderConfirmationStatusReportV02.mmMessageIdentification, SubscriptionBulkOrderV04.mmMessageIdentification,
						SwitchOrderConfirmationCancellationInstructionV02.mmMessageIdentification, OrderConfirmationStatusReportV02.mmMessageIdentification, SubscriptionOrderV04.mmMessageIdentification,
						AccountDetailsConfirmationV07.mmMessageIdentification, AccountModificationInstructionV07.mmMessageIdentification, AccountOpeningInstructionV07.mmMessageIdentification,
						AccountManagementStatusReportV06.mmMessageIdentification, RequestForAccountManagementStatusReportV05.mmMessageIdentification, ReversalOfTransferOutConfirmationV08.mmMessageIdentification,
						TransferInConfirmationV08.mmMessageIdentification, PortfolioTransferInstructionV08.mmMessageReference, PortfolioTransferCancellationRequestV08.mmMessageReference,
						TransferOutCancellationRequestV08.mmMessageIdentification, TransferInInstructionV08.mmMessageIdentification, PortfolioTransferConfirmationV08.mmMessageReference, AccountHoldingInformationV06.mmMessageReference,
						TransferOutConfirmationV08.mmMessageIdentification, TransferInCancellationRequestV08.mmMessageIdentification, TransferOutInstructionV08.mmMessageIdentification,
						TransferCancellationStatusReportV06.mmMessageIdentification, AccountHoldingInformationRequestV05.mmMessageReference, ReversalOfTransferInConfirmationV08.mmMessageIdentification,
						RequestForTransferStatusReportV06.mmMessageIdentification, TransferInstructionStatusReportV06.mmMessageIdentification, AccountSwitchInformationResponseV01.mmMessageIdentification,
						AccountSwitchBalanceTransferAcknowledgementV01.mmMessageIdentification, AccountSwitchTechnicalRejectionV01.mmMessageIdentification, AccountSwitchPaymentResponseV01.mmMessageIdentification,
						AccountSwitchNotifyAccountSwitchCompleteV01.mmMessageIdentification, AccountSwitchRequestBalanceTransferV01.mmMessageIdentification, AccountSwitchInformationRequestV01.mmMessageIdentification,
						AccountSwitchRequestRedirectionV01.mmMessageIdentification, AccountSwitchTerminationSwitchV01.mmMessageIdentification, AccountSwitchCancelExistingPaymentV01.mmMessageIdentification,
						AccountSwitchRequestPaymentV01.mmMessageIdentification);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MessageIdentification1";
				definition = "Identifies a message by a unique identifier and the date and time when the message was created by the sender.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getIdentification() {
		return identification;
	}

	public MessageIdentification1 setIdentification(Max35Text identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public ISODateTime getCreationDateTime() {
		return creationDateTime;
	}

	public MessageIdentification1 setCreationDateTime(ISODateTime creationDateTime) {
		this.creationDateTime = Objects.requireNonNull(creationDateTime);
		return this;
	}
}