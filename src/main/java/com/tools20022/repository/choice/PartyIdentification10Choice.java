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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.repository.datatype.AnyBICIdentifier;
import com.tools20022.repository.entity.PartyIdentificationInformation;
import com.tools20022.repository.msg.GenericIdentification19;
import com.tools20022.repository.msg.NameAndAddress5;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;

/**
 * Choice of identification of a party.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification10Choice#BICOrBEI
 * PartyIdentification10Choice.BICOrBEI}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification10Choice#ProprietaryIdentification
 * PartyIdentification10Choice.ProprietaryIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification10Choice#NameAndAddress
 * PartyIdentification10Choice.NameAndAddress}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation
 * PartyIdentificationInformation}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV01#MessageOriginator
 * CorporateActionCancellationAdviceV01.MessageOriginator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV01#MessageRecipient
 * CorporateActionCancellationAdviceV01.MessageRecipient}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV01#IssuerAgent
 * CorporateActionCancellationAdviceV01.IssuerAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV01#PayingAgent
 * CorporateActionCancellationAdviceV01.PayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV01#SubPayingAgent
 * CorporateActionCancellationAdviceV01.SubPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV01#Registrar
 * CorporateActionCancellationAdviceV01.Registrar}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV01#ResellingAgent
 * CorporateActionCancellationAdviceV01.ResellingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV01#PhysicalSecuritiesAgent
 * CorporateActionCancellationAdviceV01.PhysicalSecuritiesAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV01#DropAgent
 * CorporateActionCancellationAdviceV01.DropAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV01#SolicitationAgent
 * CorporateActionCancellationAdviceV01.SolicitationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV01#InformationAgent
 * CorporateActionCancellationAdviceV01.InformationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionEventProcessingStatusAdviceV01#MessageOriginator
 * CorporateActionEventProcessingStatusAdviceV01.MessageOriginator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionEventProcessingStatusAdviceV01#MessageRecipient
 * CorporateActionEventProcessingStatusAdviceV01.MessageRecipient}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionV01#MessageOriginator
 * CorporateActionInstructionV01.MessageOriginator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionV01#MessageRecipient
 * CorporateActionInstructionV01.MessageRecipient}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestV01#MessageOriginator
 * CorporateActionInstructionCancellationRequestV01.MessageOriginator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestV01#MessageRecipient
 * CorporateActionInstructionCancellationRequestV01.MessageRecipient}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestStatusAdviceV01#MessageOriginator
 * CorporateActionInstructionCancellationRequestStatusAdviceV01.
 * MessageOriginator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestStatusAdviceV01#MessageRecipient
 * CorporateActionInstructionCancellationRequestStatusAdviceV01.MessageRecipient
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatementReportV01#MessageOriginator
 * CorporateActionInstructionStatementReportV01.MessageOriginator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatementReportV01#MessageRecipient
 * CorporateActionInstructionStatementReportV01.MessageRecipient}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatusAdviceV01#MessageOriginator
 * CorporateActionInstructionStatusAdviceV01.MessageOriginator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatusAdviceV01#MessageRecipient
 * CorporateActionInstructionStatusAdviceV01.MessageRecipient}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV01#MessageOriginator
 * CorporateActionMovementConfirmationV01.MessageOriginator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV01#MessageRecipient
 * CorporateActionMovementConfirmationV01.MessageRecipient}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV01#IssuerAgent
 * CorporateActionMovementConfirmationV01.IssuerAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV01#PayingAgent
 * CorporateActionMovementConfirmationV01.PayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV01#SubPayingAgent
 * CorporateActionMovementConfirmationV01.SubPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV01#MessageOriginator
 * CorporateActionMovementPreliminaryAdviceV01.MessageOriginator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV01#MessageRecipient
 * CorporateActionMovementPreliminaryAdviceV01.MessageRecipient}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV01#IssuerAgent
 * CorporateActionMovementPreliminaryAdviceV01.IssuerAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV01#PayingAgent
 * CorporateActionMovementPreliminaryAdviceV01.PayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV01#SubPayingAgent
 * CorporateActionMovementPreliminaryAdviceV01.SubPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV01#Registrar
 * CorporateActionMovementPreliminaryAdviceV01.Registrar}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV01#ResellingAgent
 * CorporateActionMovementPreliminaryAdviceV01.ResellingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV01#PhysicalSecuritiesAgent
 * CorporateActionMovementPreliminaryAdviceV01.PhysicalSecuritiesAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV01#DropAgent
 * CorporateActionMovementPreliminaryAdviceV01.DropAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV01#SolicitationAgent
 * CorporateActionMovementPreliminaryAdviceV01.SolicitationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV01#InformationAgent
 * CorporateActionMovementPreliminaryAdviceV01.InformationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV01#MessageOriginator
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV01.
 * MessageOriginator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV01#MessageRecipient
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV01.
 * MessageRecipient}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV01#IssuerAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV01.IssuerAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV01#PayingAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV01.PayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV01#SubPayingAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV01.SubPayingAgent}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV01#Registrar
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV01.Registrar}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV01#ResellingAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV01.ResellingAgent}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV01#PhysicalSecuritiesAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV01.
 * PhysicalSecuritiesAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV01#DropAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV01.DropAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV01#SolicitationAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV01.
 * SolicitationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV01#InformationAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV01.
 * InformationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV01#MessageOriginator
 * CorporateActionMovementReversalAdviceV01.MessageOriginator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV01#MessageRecipient
 * CorporateActionMovementReversalAdviceV01.MessageRecipient}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV01#IssuerAgent
 * CorporateActionMovementReversalAdviceV01.IssuerAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV01#PayingAgent
 * CorporateActionMovementReversalAdviceV01.PayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV01#SubPayingAgent
 * CorporateActionMovementReversalAdviceV01.SubPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV01#MessageOriginator
 * CorporateActionNotificationV01.MessageOriginator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV01#MessageRecipient
 * CorporateActionNotificationV01.MessageRecipient}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV01#IssuerAgent
 * CorporateActionNotificationV01.IssuerAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV01#PayingAgent
 * CorporateActionNotificationV01.PayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV01#SubPayingAgent
 * CorporateActionNotificationV01.SubPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV01#Registrar
 * CorporateActionNotificationV01.Registrar}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV01#ResellingAgent
 * CorporateActionNotificationV01.ResellingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV01#PhysicalSecuritiesAgent
 * CorporateActionNotificationV01.PhysicalSecuritiesAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV01#DropAgent
 * CorporateActionNotificationV01.DropAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV01#SolicitationAgent
 * CorporateActionNotificationV01.SolicitationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV01#InformationAgent
 * CorporateActionNotificationV01.InformationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementConfirmationV01#MessageOriginator
 * IntraPositionMovementConfirmationV01.MessageOriginator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementConfirmationV01#MessageRecipient
 * IntraPositionMovementConfirmationV01.MessageRecipient}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementPostingReportV01#MessageOriginator
 * IntraPositionMovementPostingReportV01.MessageOriginator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementPostingReportV01#MessageRecipient
 * IntraPositionMovementPostingReportV01.MessageRecipient}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV03#AccountServicer
 * SecuritiesBalanceAccountingReportV03.AccountServicer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV03#MessageOriginator
 * SecuritiesBalanceAccountingReportV03.MessageOriginator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV03#MessageRecipient
 * SecuritiesBalanceAccountingReportV03.MessageRecipient}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceCustodyReportV03#AccountServicer
 * SecuritiesBalanceCustodyReportV03.AccountServicer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceCustodyReportV03#MessageOriginator
 * SecuritiesBalanceCustodyReportV03.MessageOriginator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceCustodyReportV03#MessageRecipient
 * SecuritiesBalanceCustodyReportV03.MessageRecipient}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV01#MessageOriginator
 * SecuritiesFinancingConfirmationV01.MessageOriginator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV01#MessageRecipient
 * SecuritiesFinancingConfirmationV01.MessageRecipient}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV01#MessageOriginator
 * SecuritiesFinancingInstructionV01.MessageOriginator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV01#MessageRecipient
 * SecuritiesFinancingInstructionV01.MessageRecipient}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesMessageCancellationAdviceV01#MessageOriginator
 * SecuritiesMessageCancellationAdviceV01.MessageOriginator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesMessageCancellationAdviceV01#MessageRecipient
 * SecuritiesMessageCancellationAdviceV01.MessageRecipient}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionModificationStatusAdviceV01#MessageOriginator
 * SecuritiesSettlementConditionModificationStatusAdviceV01.MessageOriginator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionModificationStatusAdviceV01#MessageRecipient
 * SecuritiesSettlementConditionModificationStatusAdviceV01.MessageRecipient}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionsModificationRequestV01#MessageOriginator
 * SecuritiesSettlementConditionsModificationRequestV01.MessageOriginator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionsModificationRequestV01#MessageRecipient
 * SecuritiesSettlementConditionsModificationRequestV01.MessageRecipient}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV01#MessageOriginator
 * SecuritiesSettlementTransactionConfirmationV01.MessageOriginator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV01#MessageRecipient
 * SecuritiesSettlementTransactionConfirmationV01.MessageRecipient}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV01#MessageOriginator
 * SecuritiesSettlementTransactionGenerationNotificationV01.MessageOriginator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV01#MessageRecipient
 * SecuritiesSettlementTransactionGenerationNotificationV01.MessageRecipient}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV01#MessageOriginator
 * SecuritiesSettlementTransactionInstructionV01.MessageOriginator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV01#MessageRecipient
 * SecuritiesSettlementTransactionInstructionV01.MessageRecipient}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV01#MessageOriginator
 * SecuritiesSettlementTransactionStatusAdviceV01.MessageOriginator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV01#MessageRecipient
 * SecuritiesSettlementTransactionStatusAdviceV01.MessageRecipient}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPendingReportV01#MessageOriginator
 * SecuritiesTransactionPendingReportV01.MessageOriginator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPendingReportV01#MessageRecipient
 * SecuritiesTransactionPendingReportV01.MessageRecipient}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV01#MessageOriginator
 * SecuritiesTransactionPostingReportV01.MessageOriginator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV01#MessageRecipient
 * SecuritiesTransactionPostingReportV01.MessageRecipient}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementInstructionV01#MessageOriginator
 * IntraPositionMovementInstructionV01.MessageOriginator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementInstructionV01#MessageRecipient
 * IntraPositionMovementInstructionV01.MessageRecipient}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementStatusAdviceV01#MessageOriginator
 * IntraPositionMovementStatusAdviceV01.MessageOriginator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementStatusAdviceV01#MessageRecipient
 * IntraPositionMovementStatusAdviceV01.MessageRecipient}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferNotificationV01#MessageOriginator
 * PortfolioTransferNotificationV01.MessageOriginator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferNotificationV01#MessageRecipient
 * PortfolioTransferNotificationV01.MessageRecipient}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV01#MessageOriginator
 * SecuritiesFinancingModificationInstructionV01.MessageOriginator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV01#MessageRecipient
 * SecuritiesFinancingModificationInstructionV01.MessageRecipient}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingStatusAdviceV01#MessageOriginator
 * SecuritiesFinancingStatusAdviceV01.MessageOriginator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingStatusAdviceV01#MessageRecipient
 * SecuritiesFinancingStatusAdviceV01.MessageRecipient}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementAllegementRemovalAdviceV01#MessageOriginator
 * SecuritiesSettlementAllegementRemovalAdviceV01.MessageOriginator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementAllegementRemovalAdviceV01#MessageRecipient
 * SecuritiesSettlementAllegementRemovalAdviceV01.MessageRecipient}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotificationV01#MessageOriginator
 * SecuritiesSettlementTransactionAllegementNotificationV01.MessageOriginator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotificationV01#MessageRecipient
 * SecuritiesSettlementTransactionAllegementNotificationV01.MessageRecipient}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAllegementReportV01#MessageOriginator
 * SecuritiesSettlementTransactionAllegementReportV01.MessageOriginator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAllegementReportV01#MessageRecipient
 * SecuritiesSettlementTransactionAllegementReportV01.MessageRecipient}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV01#MessageOriginator
 * SecuritiesSettlementTransactionReversalAdviceV01.MessageOriginator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV01#MessageRecipient
 * SecuritiesSettlementTransactionReversalAdviceV01.MessageRecipient}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesStatementQueryV01#MessageOriginator
 * SecuritiesStatementQueryV01.MessageOriginator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesStatementQueryV01#MessageRecipient
 * SecuritiesStatementQueryV01.MessageRecipient}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesStatusOrStatementQueryStatusAdviceV01#MessageOriginator
 * SecuritiesStatusOrStatementQueryStatusAdviceV01.MessageOriginator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesStatusOrStatementQueryStatusAdviceV01#MessageRecipient
 * SecuritiesStatusOrStatementQueryStatusAdviceV01.MessageRecipient}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequestStatusAdviceV01#MessageOriginator
 * SecuritiesTransactionCancellationRequestStatusAdviceV01.MessageOriginator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequestStatusAdviceV01#MessageRecipient
 * SecuritiesTransactionCancellationRequestStatusAdviceV01.MessageRecipient}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequestV01#MessageOriginator
 * SecuritiesTransactionCancellationRequestV01.MessageOriginator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequestV01#MessageRecipient
 * SecuritiesTransactionCancellationRequestV01.MessageRecipient}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionStatusQueryV01#MessageOriginator
 * SecuritiesTransactionStatusQueryV01.MessageOriginator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionStatusQueryV01#MessageRecipient
 * SecuritiesTransactionStatusQueryV01.MessageRecipient}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNarrativeV01#MessageOriginator
 * CorporateActionNarrativeV01.MessageOriginator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNarrativeV01#MessageRecipient
 * CorporateActionNarrativeV01.MessageRecipient}</li>
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
 * removalDate} = May 5, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PartyIdentification10Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice of identification of a party."</li>
 * </ul>
 */
public class PartyIdentification10Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Code allocated to a financial or non-financial institution by the ISO
	 * 9362 Registration Authority, as described in ISO 9362
	 * "Banking - Banking telecommunication messages - Business identifier code (BIC)"
	 * .
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.AnyBICIdentifier
	 * AnyBICIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification#AnyBIC
	 * OrganisationIdentification.AnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification10Choice
	 * PartyIdentification10Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BICOrBEI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BICOrBEI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Code allocated to a financial or non-financial institution by the ISO 9362 Registration Authority, as described in ISO 9362 \"Banking - Banking telecommunication messages - Business identifier code (BIC)\"."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute BICOrBEI = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PartyIdentification10Choice.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.OrganisationIdentification.AnyBIC;
			isDerived = false;
			xmlTag = "BICOrBEI";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BICOrBEI";
			definition = "Code allocated to a financial or non-financial institution by the ISO 9362 Registration Authority, as described in ISO 9362 \"Banking - Banking telecommunication messages - Business identifier code (BIC)\".";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> AnyBICIdentifier.mmObject();
		}
	};
	/**
	 * Unique and unambiguous identifier, as assigned to a financial institution
	 * using a proprietary identification scheme.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification19
	 * GenericIdentification19}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#OtherIdentification
	 * PartyIdentificationInformation.OtherIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification10Choice
	 * PartyIdentification10Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtryId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProprietaryIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier, as assigned to a financial institution using a proprietary identification scheme."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute ProprietaryIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PartyIdentification10Choice.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PartyIdentificationInformation.OtherIdentification;
			isDerived = false;
			xmlTag = "PrtryId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProprietaryIdentification";
			definition = "Unique and unambiguous identifier, as assigned to a financial institution using a proprietary identification scheme.";
			minOccurs = 1;
			maxOccurs = 1;
			complexType_lazy = () -> GenericIdentification19.mmObject();
		}
	};
	/**
	 * Name and address of a party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.NameAndAddress5
	 * NameAndAddress5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation
	 * PartyIdentificationInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification10Choice
	 * PartyIdentification10Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NmAndAdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NameAndAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name and address of a party."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute NameAndAddress = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PartyIdentification10Choice.mmObject();
			businessComponentTrace_lazy = () -> PartyIdentificationInformation.mmObject();
			isDerived = false;
			xmlTag = "NmAndAdr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NameAndAddress";
			definition = "Name and address of a party.";
			minOccurs = 1;
			maxOccurs = 1;
			complexType_lazy = () -> NameAndAddress5.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.PartyIdentification10Choice.BICOrBEI, com.tools20022.repository.choice.PartyIdentification10Choice.ProprietaryIdentification,
						com.tools20022.repository.choice.PartyIdentification10Choice.NameAndAddress);
				trace_lazy = () -> PartyIdentificationInformation.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV01.MessageOriginator,
						com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV01.MessageRecipient, com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV01.IssuerAgent,
						com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV01.PayingAgent, com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV01.SubPayingAgent,
						com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV01.Registrar, com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV01.ResellingAgent,
						com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV01.PhysicalSecuritiesAgent, com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV01.DropAgent,
						com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV01.SolicitationAgent, com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV01.InformationAgent,
						com.tools20022.repository.area.seev.CorporateActionEventProcessingStatusAdviceV01.MessageOriginator, com.tools20022.repository.area.seev.CorporateActionEventProcessingStatusAdviceV01.MessageRecipient,
						com.tools20022.repository.area.seev.CorporateActionInstructionV01.MessageOriginator, com.tools20022.repository.area.seev.CorporateActionInstructionV01.MessageRecipient,
						com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestV01.MessageOriginator, com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestV01.MessageRecipient,
						com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestStatusAdviceV01.MessageOriginator,
						com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestStatusAdviceV01.MessageRecipient, com.tools20022.repository.area.seev.CorporateActionInstructionStatementReportV01.MessageOriginator,
						com.tools20022.repository.area.seev.CorporateActionInstructionStatementReportV01.MessageRecipient, com.tools20022.repository.area.seev.CorporateActionInstructionStatusAdviceV01.MessageOriginator,
						com.tools20022.repository.area.seev.CorporateActionInstructionStatusAdviceV01.MessageRecipient, com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV01.MessageOriginator,
						com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV01.MessageRecipient, com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV01.IssuerAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV01.PayingAgent, com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV01.SubPayingAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV01.MessageOriginator, com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV01.MessageRecipient,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV01.IssuerAgent, com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV01.PayingAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV01.SubPayingAgent, com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV01.Registrar,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV01.ResellingAgent, com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV01.PhysicalSecuritiesAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV01.DropAgent, com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV01.SolicitationAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV01.InformationAgent, com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV01.MessageOriginator,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV01.MessageRecipient,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV01.IssuerAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV01.PayingAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV01.SubPayingAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV01.Registrar,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV01.ResellingAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV01.PhysicalSecuritiesAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV01.DropAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV01.SolicitationAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV01.InformationAgent, com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV01.MessageOriginator,
						com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV01.MessageRecipient, com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV01.IssuerAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV01.PayingAgent, com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV01.SubPayingAgent,
						com.tools20022.repository.area.seev.CorporateActionNotificationV01.MessageOriginator, com.tools20022.repository.area.seev.CorporateActionNotificationV01.MessageRecipient,
						com.tools20022.repository.area.seev.CorporateActionNotificationV01.IssuerAgent, com.tools20022.repository.area.seev.CorporateActionNotificationV01.PayingAgent,
						com.tools20022.repository.area.seev.CorporateActionNotificationV01.SubPayingAgent, com.tools20022.repository.area.seev.CorporateActionNotificationV01.Registrar,
						com.tools20022.repository.area.seev.CorporateActionNotificationV01.ResellingAgent, com.tools20022.repository.area.seev.CorporateActionNotificationV01.PhysicalSecuritiesAgent,
						com.tools20022.repository.area.seev.CorporateActionNotificationV01.DropAgent, com.tools20022.repository.area.seev.CorporateActionNotificationV01.SolicitationAgent,
						com.tools20022.repository.area.seev.CorporateActionNotificationV01.InformationAgent, com.tools20022.repository.area.semt.IntraPositionMovementConfirmationV01.MessageOriginator,
						com.tools20022.repository.area.semt.IntraPositionMovementConfirmationV01.MessageRecipient, com.tools20022.repository.area.semt.IntraPositionMovementPostingReportV01.MessageOriginator,
						com.tools20022.repository.area.semt.IntraPositionMovementPostingReportV01.MessageRecipient, com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV03.AccountServicer,
						com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV03.MessageOriginator, com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV03.MessageRecipient,
						com.tools20022.repository.area.semt.SecuritiesBalanceCustodyReportV03.AccountServicer, com.tools20022.repository.area.semt.SecuritiesBalanceCustodyReportV03.MessageOriginator,
						com.tools20022.repository.area.semt.SecuritiesBalanceCustodyReportV03.MessageRecipient, com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV01.MessageOriginator,
						com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV01.MessageRecipient, com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV01.MessageOriginator,
						com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV01.MessageRecipient, com.tools20022.repository.area.semt.SecuritiesMessageCancellationAdviceV01.MessageOriginator,
						com.tools20022.repository.area.semt.SecuritiesMessageCancellationAdviceV01.MessageRecipient, com.tools20022.repository.area.sese.SecuritiesSettlementConditionModificationStatusAdviceV01.MessageOriginator,
						com.tools20022.repository.area.sese.SecuritiesSettlementConditionModificationStatusAdviceV01.MessageRecipient,
						com.tools20022.repository.area.sese.SecuritiesSettlementConditionsModificationRequestV01.MessageOriginator, com.tools20022.repository.area.sese.SecuritiesSettlementConditionsModificationRequestV01.MessageRecipient,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV01.MessageOriginator, com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV01.MessageRecipient,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV01.MessageOriginator,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV01.MessageRecipient, com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV01.MessageOriginator,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV01.MessageRecipient, com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV01.MessageOriginator,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV01.MessageRecipient, com.tools20022.repository.area.semt.SecuritiesTransactionPendingReportV01.MessageOriginator,
						com.tools20022.repository.area.semt.SecuritiesTransactionPendingReportV01.MessageRecipient, com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV01.MessageOriginator,
						com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV01.MessageRecipient, com.tools20022.repository.area.semt.IntraPositionMovementInstructionV01.MessageOriginator,
						com.tools20022.repository.area.semt.IntraPositionMovementInstructionV01.MessageRecipient, com.tools20022.repository.area.semt.IntraPositionMovementStatusAdviceV01.MessageOriginator,
						com.tools20022.repository.area.semt.IntraPositionMovementStatusAdviceV01.MessageRecipient, com.tools20022.repository.area.sese.PortfolioTransferNotificationV01.MessageOriginator,
						com.tools20022.repository.area.sese.PortfolioTransferNotificationV01.MessageRecipient, com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV01.MessageOriginator,
						com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV01.MessageRecipient, com.tools20022.repository.area.sese.SecuritiesFinancingStatusAdviceV01.MessageOriginator,
						com.tools20022.repository.area.sese.SecuritiesFinancingStatusAdviceV01.MessageRecipient, com.tools20022.repository.area.sese.SecuritiesSettlementAllegementRemovalAdviceV01.MessageOriginator,
						com.tools20022.repository.area.sese.SecuritiesSettlementAllegementRemovalAdviceV01.MessageRecipient, com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotificationV01.MessageOriginator,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotificationV01.MessageRecipient,
						com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAllegementReportV01.MessageOriginator, com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAllegementReportV01.MessageRecipient,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV01.MessageOriginator, com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV01.MessageRecipient,
						com.tools20022.repository.area.semt.SecuritiesStatementQueryV01.MessageOriginator, com.tools20022.repository.area.semt.SecuritiesStatementQueryV01.MessageRecipient,
						com.tools20022.repository.area.sese.SecuritiesStatusOrStatementQueryStatusAdviceV01.MessageOriginator, com.tools20022.repository.area.sese.SecuritiesStatusOrStatementQueryStatusAdviceV01.MessageRecipient,
						com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequestStatusAdviceV01.MessageOriginator,
						com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequestStatusAdviceV01.MessageRecipient, com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequestV01.MessageOriginator,
						com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequestV01.MessageRecipient, com.tools20022.repository.area.sese.SecuritiesTransactionStatusQueryV01.MessageOriginator,
						com.tools20022.repository.area.sese.SecuritiesTransactionStatusQueryV01.MessageRecipient, com.tools20022.repository.area.seev.CorporateActionNarrativeV01.MessageOriginator,
						com.tools20022.repository.area.seev.CorporateActionNarrativeV01.MessageRecipient);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("May 5, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "PartyIdentification10Choice";
				definition = "Choice of identification of a party.";
			}
		});
		return mmObject_lazy.get();
	}
}