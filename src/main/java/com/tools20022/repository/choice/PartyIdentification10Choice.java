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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.seev.*;
import com.tools20022.repository.area.semt.*;
import com.tools20022.repository.area.sese.*;
import com.tools20022.repository.datatype.AnyBICIdentifier;
import com.tools20022.repository.entity.OrganisationIdentification;
import com.tools20022.repository.entity.PartyIdentificationInformation;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.GenericIdentification19;
import com.tools20022.repository.msg.NameAndAddress5;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

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
 * {@linkplain com.tools20022.repository.choice.PartyIdentification10Choice#mmBICOrBEI
 * PartyIdentification10Choice.mmBICOrBEI}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification10Choice#mmProprietaryIdentification
 * PartyIdentification10Choice.mmProprietaryIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification10Choice#mmNameAndAddress
 * PartyIdentification10Choice.mmNameAndAddress}</li>
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
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV01#mmMessageOriginator
 * CorporateActionCancellationAdviceV01.mmMessageOriginator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV01#mmMessageRecipient
 * CorporateActionCancellationAdviceV01.mmMessageRecipient}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV01#mmIssuerAgent
 * CorporateActionCancellationAdviceV01.mmIssuerAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV01#mmPayingAgent
 * CorporateActionCancellationAdviceV01.mmPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV01#mmSubPayingAgent
 * CorporateActionCancellationAdviceV01.mmSubPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV01#mmRegistrar
 * CorporateActionCancellationAdviceV01.mmRegistrar}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV01#mmResellingAgent
 * CorporateActionCancellationAdviceV01.mmResellingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV01#mmPhysicalSecuritiesAgent
 * CorporateActionCancellationAdviceV01.mmPhysicalSecuritiesAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV01#mmDropAgent
 * CorporateActionCancellationAdviceV01.mmDropAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV01#mmSolicitationAgent
 * CorporateActionCancellationAdviceV01.mmSolicitationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV01#mmInformationAgent
 * CorporateActionCancellationAdviceV01.mmInformationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionEventProcessingStatusAdviceV01#mmMessageOriginator
 * CorporateActionEventProcessingStatusAdviceV01.mmMessageOriginator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionEventProcessingStatusAdviceV01#mmMessageRecipient
 * CorporateActionEventProcessingStatusAdviceV01.mmMessageRecipient}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionV01#mmMessageOriginator
 * CorporateActionInstructionV01.mmMessageOriginator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionV01#mmMessageRecipient
 * CorporateActionInstructionV01.mmMessageRecipient}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestV01#mmMessageOriginator
 * CorporateActionInstructionCancellationRequestV01.mmMessageOriginator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestV01#mmMessageRecipient
 * CorporateActionInstructionCancellationRequestV01.mmMessageRecipient}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestStatusAdviceV01#mmMessageOriginator
 * CorporateActionInstructionCancellationRequestStatusAdviceV01.
 * mmMessageOriginator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestStatusAdviceV01#mmMessageRecipient
 * CorporateActionInstructionCancellationRequestStatusAdviceV01.
 * mmMessageRecipient}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatementReportV01#mmMessageOriginator
 * CorporateActionInstructionStatementReportV01.mmMessageOriginator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatementReportV01#mmMessageRecipient
 * CorporateActionInstructionStatementReportV01.mmMessageRecipient}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatusAdviceV01#mmMessageOriginator
 * CorporateActionInstructionStatusAdviceV01.mmMessageOriginator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatusAdviceV01#mmMessageRecipient
 * CorporateActionInstructionStatusAdviceV01.mmMessageRecipient}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV01#mmMessageOriginator
 * CorporateActionMovementConfirmationV01.mmMessageOriginator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV01#mmMessageRecipient
 * CorporateActionMovementConfirmationV01.mmMessageRecipient}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV01#mmIssuerAgent
 * CorporateActionMovementConfirmationV01.mmIssuerAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV01#mmPayingAgent
 * CorporateActionMovementConfirmationV01.mmPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV01#mmSubPayingAgent
 * CorporateActionMovementConfirmationV01.mmSubPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV01#mmMessageOriginator
 * CorporateActionMovementPreliminaryAdviceV01.mmMessageOriginator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV01#mmMessageRecipient
 * CorporateActionMovementPreliminaryAdviceV01.mmMessageRecipient}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV01#mmIssuerAgent
 * CorporateActionMovementPreliminaryAdviceV01.mmIssuerAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV01#mmPayingAgent
 * CorporateActionMovementPreliminaryAdviceV01.mmPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV01#mmSubPayingAgent
 * CorporateActionMovementPreliminaryAdviceV01.mmSubPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV01#mmRegistrar
 * CorporateActionMovementPreliminaryAdviceV01.mmRegistrar}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV01#mmResellingAgent
 * CorporateActionMovementPreliminaryAdviceV01.mmResellingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV01#mmPhysicalSecuritiesAgent
 * CorporateActionMovementPreliminaryAdviceV01.mmPhysicalSecuritiesAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV01#mmDropAgent
 * CorporateActionMovementPreliminaryAdviceV01.mmDropAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV01#mmSolicitationAgent
 * CorporateActionMovementPreliminaryAdviceV01.mmSolicitationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV01#mmInformationAgent
 * CorporateActionMovementPreliminaryAdviceV01.mmInformationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV01#mmMessageOriginator
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV01.
 * mmMessageOriginator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV01#mmMessageRecipient
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV01.
 * mmMessageRecipient}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV01#mmIssuerAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV01.mmIssuerAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV01#mmPayingAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV01.mmPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV01#mmSubPayingAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV01.
 * mmSubPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV01#mmRegistrar
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV01.mmRegistrar}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV01#mmResellingAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV01.
 * mmResellingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV01#mmPhysicalSecuritiesAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV01.
 * mmPhysicalSecuritiesAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV01#mmDropAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV01.mmDropAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV01#mmSolicitationAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV01.
 * mmSolicitationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV01#mmInformationAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV01.
 * mmInformationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV01#mmMessageOriginator
 * CorporateActionMovementReversalAdviceV01.mmMessageOriginator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV01#mmMessageRecipient
 * CorporateActionMovementReversalAdviceV01.mmMessageRecipient}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV01#mmIssuerAgent
 * CorporateActionMovementReversalAdviceV01.mmIssuerAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV01#mmPayingAgent
 * CorporateActionMovementReversalAdviceV01.mmPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV01#mmSubPayingAgent
 * CorporateActionMovementReversalAdviceV01.mmSubPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV01#mmMessageOriginator
 * CorporateActionNotificationV01.mmMessageOriginator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV01#mmMessageRecipient
 * CorporateActionNotificationV01.mmMessageRecipient}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV01#mmIssuerAgent
 * CorporateActionNotificationV01.mmIssuerAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV01#mmPayingAgent
 * CorporateActionNotificationV01.mmPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV01#mmSubPayingAgent
 * CorporateActionNotificationV01.mmSubPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV01#mmRegistrar
 * CorporateActionNotificationV01.mmRegistrar}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV01#mmResellingAgent
 * CorporateActionNotificationV01.mmResellingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV01#mmPhysicalSecuritiesAgent
 * CorporateActionNotificationV01.mmPhysicalSecuritiesAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV01#mmDropAgent
 * CorporateActionNotificationV01.mmDropAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV01#mmSolicitationAgent
 * CorporateActionNotificationV01.mmSolicitationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV01#mmInformationAgent
 * CorporateActionNotificationV01.mmInformationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementConfirmationV01#mmMessageOriginator
 * IntraPositionMovementConfirmationV01.mmMessageOriginator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementConfirmationV01#mmMessageRecipient
 * IntraPositionMovementConfirmationV01.mmMessageRecipient}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementPostingReportV01#mmMessageOriginator
 * IntraPositionMovementPostingReportV01.mmMessageOriginator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementPostingReportV01#mmMessageRecipient
 * IntraPositionMovementPostingReportV01.mmMessageRecipient}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV03#mmAccountServicer
 * SecuritiesBalanceAccountingReportV03.mmAccountServicer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV03#mmMessageOriginator
 * SecuritiesBalanceAccountingReportV03.mmMessageOriginator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV03#mmMessageRecipient
 * SecuritiesBalanceAccountingReportV03.mmMessageRecipient}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceCustodyReportV03#mmAccountServicer
 * SecuritiesBalanceCustodyReportV03.mmAccountServicer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceCustodyReportV03#mmMessageOriginator
 * SecuritiesBalanceCustodyReportV03.mmMessageOriginator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceCustodyReportV03#mmMessageRecipient
 * SecuritiesBalanceCustodyReportV03.mmMessageRecipient}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV01#mmMessageOriginator
 * SecuritiesFinancingConfirmationV01.mmMessageOriginator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV01#mmMessageRecipient
 * SecuritiesFinancingConfirmationV01.mmMessageRecipient}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV01#mmMessageOriginator
 * SecuritiesFinancingInstructionV01.mmMessageOriginator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV01#mmMessageRecipient
 * SecuritiesFinancingInstructionV01.mmMessageRecipient}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesMessageCancellationAdviceV01#mmMessageOriginator
 * SecuritiesMessageCancellationAdviceV01.mmMessageOriginator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesMessageCancellationAdviceV01#mmMessageRecipient
 * SecuritiesMessageCancellationAdviceV01.mmMessageRecipient}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionModificationStatusAdviceV01#mmMessageOriginator
 * SecuritiesSettlementConditionModificationStatusAdviceV01.mmMessageOriginator}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionModificationStatusAdviceV01#mmMessageRecipient
 * SecuritiesSettlementConditionModificationStatusAdviceV01.mmMessageRecipient}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionsModificationRequestV01#mmMessageOriginator
 * SecuritiesSettlementConditionsModificationRequestV01.mmMessageOriginator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionsModificationRequestV01#mmMessageRecipient
 * SecuritiesSettlementConditionsModificationRequestV01.mmMessageRecipient}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV01#mmMessageOriginator
 * SecuritiesSettlementTransactionConfirmationV01.mmMessageOriginator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV01#mmMessageRecipient
 * SecuritiesSettlementTransactionConfirmationV01.mmMessageRecipient}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV01#mmMessageOriginator
 * SecuritiesSettlementTransactionGenerationNotificationV01.mmMessageOriginator}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV01#mmMessageRecipient
 * SecuritiesSettlementTransactionGenerationNotificationV01.mmMessageRecipient}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV01#mmMessageOriginator
 * SecuritiesSettlementTransactionInstructionV01.mmMessageOriginator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV01#mmMessageRecipient
 * SecuritiesSettlementTransactionInstructionV01.mmMessageRecipient}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV01#mmMessageOriginator
 * SecuritiesSettlementTransactionStatusAdviceV01.mmMessageOriginator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV01#mmMessageRecipient
 * SecuritiesSettlementTransactionStatusAdviceV01.mmMessageRecipient}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPendingReportV01#mmMessageOriginator
 * SecuritiesTransactionPendingReportV01.mmMessageOriginator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPendingReportV01#mmMessageRecipient
 * SecuritiesTransactionPendingReportV01.mmMessageRecipient}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV01#mmMessageOriginator
 * SecuritiesTransactionPostingReportV01.mmMessageOriginator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV01#mmMessageRecipient
 * SecuritiesTransactionPostingReportV01.mmMessageRecipient}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementInstructionV01#mmMessageOriginator
 * IntraPositionMovementInstructionV01.mmMessageOriginator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementInstructionV01#mmMessageRecipient
 * IntraPositionMovementInstructionV01.mmMessageRecipient}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementStatusAdviceV01#mmMessageOriginator
 * IntraPositionMovementStatusAdviceV01.mmMessageOriginator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementStatusAdviceV01#mmMessageRecipient
 * IntraPositionMovementStatusAdviceV01.mmMessageRecipient}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferNotificationV01#mmMessageOriginator
 * PortfolioTransferNotificationV01.mmMessageOriginator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferNotificationV01#mmMessageRecipient
 * PortfolioTransferNotificationV01.mmMessageRecipient}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV01#mmMessageOriginator
 * SecuritiesFinancingModificationInstructionV01.mmMessageOriginator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV01#mmMessageRecipient
 * SecuritiesFinancingModificationInstructionV01.mmMessageRecipient}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingStatusAdviceV01#mmMessageOriginator
 * SecuritiesFinancingStatusAdviceV01.mmMessageOriginator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingStatusAdviceV01#mmMessageRecipient
 * SecuritiesFinancingStatusAdviceV01.mmMessageRecipient}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementAllegementRemovalAdviceV01#mmMessageOriginator
 * SecuritiesSettlementAllegementRemovalAdviceV01.mmMessageOriginator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementAllegementRemovalAdviceV01#mmMessageRecipient
 * SecuritiesSettlementAllegementRemovalAdviceV01.mmMessageRecipient}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotificationV01#mmMessageOriginator
 * SecuritiesSettlementTransactionAllegementNotificationV01.mmMessageOriginator}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotificationV01#mmMessageRecipient
 * SecuritiesSettlementTransactionAllegementNotificationV01.mmMessageRecipient}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAllegementReportV01#mmMessageOriginator
 * SecuritiesSettlementTransactionAllegementReportV01.mmMessageOriginator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAllegementReportV01#mmMessageRecipient
 * SecuritiesSettlementTransactionAllegementReportV01.mmMessageRecipient}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV01#mmMessageOriginator
 * SecuritiesSettlementTransactionReversalAdviceV01.mmMessageOriginator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV01#mmMessageRecipient
 * SecuritiesSettlementTransactionReversalAdviceV01.mmMessageRecipient}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesStatementQueryV01#mmMessageOriginator
 * SecuritiesStatementQueryV01.mmMessageOriginator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesStatementQueryV01#mmMessageRecipient
 * SecuritiesStatementQueryV01.mmMessageRecipient}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesStatusOrStatementQueryStatusAdviceV01#mmMessageOriginator
 * SecuritiesStatusOrStatementQueryStatusAdviceV01.mmMessageOriginator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesStatusOrStatementQueryStatusAdviceV01#mmMessageRecipient
 * SecuritiesStatusOrStatementQueryStatusAdviceV01.mmMessageRecipient}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequestStatusAdviceV01#mmMessageOriginator
 * SecuritiesTransactionCancellationRequestStatusAdviceV01.mmMessageOriginator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequestStatusAdviceV01#mmMessageRecipient
 * SecuritiesTransactionCancellationRequestStatusAdviceV01.mmMessageRecipient}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequestV01#mmMessageOriginator
 * SecuritiesTransactionCancellationRequestV01.mmMessageOriginator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequestV01#mmMessageRecipient
 * SecuritiesTransactionCancellationRequestV01.mmMessageRecipient}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionStatusQueryV01#mmMessageOriginator
 * SecuritiesTransactionStatusQueryV01.mmMessageOriginator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionStatusQueryV01#mmMessageRecipient
 * SecuritiesTransactionStatusQueryV01.mmMessageRecipient}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNarrativeV01#mmMessageOriginator
 * CorporateActionNarrativeV01.mmMessageOriginator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNarrativeV01#mmMessageRecipient
 * CorporateActionNarrativeV01.mmMessageRecipient}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "PartyIdentification10Choice", propOrder = {"BICOrBEI", "proprietaryIdentification", "nameAndAddress"})
public class PartyIdentification10Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected AnyBICIdentifier bICOrBEI;
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
	 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification#mmAnyBIC
	 * OrganisationIdentification.mmAnyBIC}</li>
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
	public static final MMMessageAttribute mmBICOrBEI = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> OrganisationIdentification.mmAnyBIC;
			componentContext_lazy = () -> PartyIdentification10Choice.mmObject();
			isDerived = false;
			xmlTag = "BICOrBEI";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BICOrBEI";
			definition = "Code allocated to a financial or non-financial institution by the ISO 9362 Registration Authority, as described in ISO 9362 \"Banking - Banking telecommunication messages - Business identifier code (BIC)\".";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AnyBICIdentifier.mmObject();
		}
	};
	protected GenericIdentification19 proprietaryIdentification;
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
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmOtherIdentification
	 * PartyIdentificationInformation.mmOtherIdentification}</li>
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
	public static final MMMessageAttribute mmProprietaryIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PartyIdentificationInformation.mmOtherIdentification;
			componentContext_lazy = () -> PartyIdentification10Choice.mmObject();
			isDerived = false;
			xmlTag = "PrtryId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProprietaryIdentification";
			definition = "Unique and unambiguous identifier, as assigned to a financial institution using a proprietary identification scheme.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> GenericIdentification19.mmObject();
		}
	};
	protected NameAndAddress5 nameAndAddress;
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
	public static final MMMessageAttribute mmNameAndAddress = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> PartyIdentificationInformation.mmObject();
			componentContext_lazy = () -> PartyIdentification10Choice.mmObject();
			isDerived = false;
			xmlTag = "NmAndAdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NameAndAddress";
			definition = "Name and address of a party.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> NameAndAddress5.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(PartyIdentification10Choice.mmBICOrBEI, PartyIdentification10Choice.mmProprietaryIdentification, PartyIdentification10Choice.mmNameAndAddress);
				messageBuildingBlock_lazy = () -> Arrays.asList(CorporateActionCancellationAdviceV01.mmMessageOriginator, CorporateActionCancellationAdviceV01.mmMessageRecipient, CorporateActionCancellationAdviceV01.mmIssuerAgent,
						CorporateActionCancellationAdviceV01.mmPayingAgent, CorporateActionCancellationAdviceV01.mmSubPayingAgent, CorporateActionCancellationAdviceV01.mmRegistrar, CorporateActionCancellationAdviceV01.mmResellingAgent,
						CorporateActionCancellationAdviceV01.mmPhysicalSecuritiesAgent, CorporateActionCancellationAdviceV01.mmDropAgent, CorporateActionCancellationAdviceV01.mmSolicitationAgent,
						CorporateActionCancellationAdviceV01.mmInformationAgent, CorporateActionEventProcessingStatusAdviceV01.mmMessageOriginator, CorporateActionEventProcessingStatusAdviceV01.mmMessageRecipient,
						CorporateActionInstructionV01.mmMessageOriginator, CorporateActionInstructionV01.mmMessageRecipient, CorporateActionInstructionCancellationRequestV01.mmMessageOriginator,
						CorporateActionInstructionCancellationRequestV01.mmMessageRecipient, CorporateActionInstructionCancellationRequestStatusAdviceV01.mmMessageOriginator,
						CorporateActionInstructionCancellationRequestStatusAdviceV01.mmMessageRecipient, CorporateActionInstructionStatementReportV01.mmMessageOriginator, CorporateActionInstructionStatementReportV01.mmMessageRecipient,
						CorporateActionInstructionStatusAdviceV01.mmMessageOriginator, CorporateActionInstructionStatusAdviceV01.mmMessageRecipient, CorporateActionMovementConfirmationV01.mmMessageOriginator,
						CorporateActionMovementConfirmationV01.mmMessageRecipient, CorporateActionMovementConfirmationV01.mmIssuerAgent, CorporateActionMovementConfirmationV01.mmPayingAgent,
						CorporateActionMovementConfirmationV01.mmSubPayingAgent, CorporateActionMovementPreliminaryAdviceV01.mmMessageOriginator, CorporateActionMovementPreliminaryAdviceV01.mmMessageRecipient,
						CorporateActionMovementPreliminaryAdviceV01.mmIssuerAgent, CorporateActionMovementPreliminaryAdviceV01.mmPayingAgent, CorporateActionMovementPreliminaryAdviceV01.mmSubPayingAgent,
						CorporateActionMovementPreliminaryAdviceV01.mmRegistrar, CorporateActionMovementPreliminaryAdviceV01.mmResellingAgent, CorporateActionMovementPreliminaryAdviceV01.mmPhysicalSecuritiesAgent,
						CorporateActionMovementPreliminaryAdviceV01.mmDropAgent, CorporateActionMovementPreliminaryAdviceV01.mmSolicitationAgent, CorporateActionMovementPreliminaryAdviceV01.mmInformationAgent,
						CorporateActionMovementPreliminaryAdviceCancellationAdviceV01.mmMessageOriginator, CorporateActionMovementPreliminaryAdviceCancellationAdviceV01.mmMessageRecipient,
						CorporateActionMovementPreliminaryAdviceCancellationAdviceV01.mmIssuerAgent, CorporateActionMovementPreliminaryAdviceCancellationAdviceV01.mmPayingAgent,
						CorporateActionMovementPreliminaryAdviceCancellationAdviceV01.mmSubPayingAgent, CorporateActionMovementPreliminaryAdviceCancellationAdviceV01.mmRegistrar,
						CorporateActionMovementPreliminaryAdviceCancellationAdviceV01.mmResellingAgent, CorporateActionMovementPreliminaryAdviceCancellationAdviceV01.mmPhysicalSecuritiesAgent,
						CorporateActionMovementPreliminaryAdviceCancellationAdviceV01.mmDropAgent, CorporateActionMovementPreliminaryAdviceCancellationAdviceV01.mmSolicitationAgent,
						CorporateActionMovementPreliminaryAdviceCancellationAdviceV01.mmInformationAgent, CorporateActionMovementReversalAdviceV01.mmMessageOriginator, CorporateActionMovementReversalAdviceV01.mmMessageRecipient,
						CorporateActionMovementReversalAdviceV01.mmIssuerAgent, CorporateActionMovementReversalAdviceV01.mmPayingAgent, CorporateActionMovementReversalAdviceV01.mmSubPayingAgent,
						CorporateActionNotificationV01.mmMessageOriginator, CorporateActionNotificationV01.mmMessageRecipient, CorporateActionNotificationV01.mmIssuerAgent, CorporateActionNotificationV01.mmPayingAgent,
						CorporateActionNotificationV01.mmSubPayingAgent, CorporateActionNotificationV01.mmRegistrar, CorporateActionNotificationV01.mmResellingAgent, CorporateActionNotificationV01.mmPhysicalSecuritiesAgent,
						CorporateActionNotificationV01.mmDropAgent, CorporateActionNotificationV01.mmSolicitationAgent, CorporateActionNotificationV01.mmInformationAgent, IntraPositionMovementConfirmationV01.mmMessageOriginator,
						IntraPositionMovementConfirmationV01.mmMessageRecipient, IntraPositionMovementPostingReportV01.mmMessageOriginator, IntraPositionMovementPostingReportV01.mmMessageRecipient,
						SecuritiesBalanceAccountingReportV03.mmAccountServicer, SecuritiesBalanceAccountingReportV03.mmMessageOriginator, SecuritiesBalanceAccountingReportV03.mmMessageRecipient,
						SecuritiesBalanceCustodyReportV03.mmAccountServicer, SecuritiesBalanceCustodyReportV03.mmMessageOriginator, SecuritiesBalanceCustodyReportV03.mmMessageRecipient,
						SecuritiesFinancingConfirmationV01.mmMessageOriginator, SecuritiesFinancingConfirmationV01.mmMessageRecipient, SecuritiesFinancingInstructionV01.mmMessageOriginator,
						SecuritiesFinancingInstructionV01.mmMessageRecipient, SecuritiesMessageCancellationAdviceV01.mmMessageOriginator, SecuritiesMessageCancellationAdviceV01.mmMessageRecipient,
						SecuritiesSettlementConditionModificationStatusAdviceV01.mmMessageOriginator, SecuritiesSettlementConditionModificationStatusAdviceV01.mmMessageRecipient,
						SecuritiesSettlementConditionsModificationRequestV01.mmMessageOriginator, SecuritiesSettlementConditionsModificationRequestV01.mmMessageRecipient, SecuritiesSettlementTransactionConfirmationV01.mmMessageOriginator,
						SecuritiesSettlementTransactionConfirmationV01.mmMessageRecipient, SecuritiesSettlementTransactionGenerationNotificationV01.mmMessageOriginator,
						SecuritiesSettlementTransactionGenerationNotificationV01.mmMessageRecipient, SecuritiesSettlementTransactionInstructionV01.mmMessageOriginator, SecuritiesSettlementTransactionInstructionV01.mmMessageRecipient,
						SecuritiesSettlementTransactionStatusAdviceV01.mmMessageOriginator, SecuritiesSettlementTransactionStatusAdviceV01.mmMessageRecipient, SecuritiesTransactionPendingReportV01.mmMessageOriginator,
						SecuritiesTransactionPendingReportV01.mmMessageRecipient, SecuritiesTransactionPostingReportV01.mmMessageOriginator, SecuritiesTransactionPostingReportV01.mmMessageRecipient,
						IntraPositionMovementInstructionV01.mmMessageOriginator, IntraPositionMovementInstructionV01.mmMessageRecipient, IntraPositionMovementStatusAdviceV01.mmMessageOriginator,
						IntraPositionMovementStatusAdviceV01.mmMessageRecipient, PortfolioTransferNotificationV01.mmMessageOriginator, PortfolioTransferNotificationV01.mmMessageRecipient,
						SecuritiesFinancingModificationInstructionV01.mmMessageOriginator, SecuritiesFinancingModificationInstructionV01.mmMessageRecipient, SecuritiesFinancingStatusAdviceV01.mmMessageOriginator,
						SecuritiesFinancingStatusAdviceV01.mmMessageRecipient, SecuritiesSettlementAllegementRemovalAdviceV01.mmMessageOriginator, SecuritiesSettlementAllegementRemovalAdviceV01.mmMessageRecipient,
						SecuritiesSettlementTransactionAllegementNotificationV01.mmMessageOriginator, SecuritiesSettlementTransactionAllegementNotificationV01.mmMessageRecipient,
						SecuritiesSettlementTransactionAllegementReportV01.mmMessageOriginator, SecuritiesSettlementTransactionAllegementReportV01.mmMessageRecipient, SecuritiesSettlementTransactionReversalAdviceV01.mmMessageOriginator,
						SecuritiesSettlementTransactionReversalAdviceV01.mmMessageRecipient, SecuritiesStatementQueryV01.mmMessageOriginator, SecuritiesStatementQueryV01.mmMessageRecipient,
						SecuritiesStatusOrStatementQueryStatusAdviceV01.mmMessageOriginator, SecuritiesStatusOrStatementQueryStatusAdviceV01.mmMessageRecipient, SecuritiesTransactionCancellationRequestStatusAdviceV01.mmMessageOriginator,
						SecuritiesTransactionCancellationRequestStatusAdviceV01.mmMessageRecipient, SecuritiesTransactionCancellationRequestV01.mmMessageOriginator, SecuritiesTransactionCancellationRequestV01.mmMessageRecipient,
						SecuritiesTransactionStatusQueryV01.mmMessageOriginator, SecuritiesTransactionStatusQueryV01.mmMessageRecipient, CorporateActionNarrativeV01.mmMessageOriginator, CorporateActionNarrativeV01.mmMessageRecipient);
				trace_lazy = () -> PartyIdentificationInformation.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
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

	@XmlElement(name = "BICOrBEI", required = true)
	public AnyBICIdentifier getBICOrBEI() {
		return bICOrBEI;
	}

	public void setBICOrBEI(AnyBICIdentifier bICOrBEI) {
		this.bICOrBEI = bICOrBEI;
	}

	@XmlElement(name = "PrtryId", required = true)
	public GenericIdentification19 getProprietaryIdentification() {
		return proprietaryIdentification;
	}

	public void setProprietaryIdentification(GenericIdentification19 proprietaryIdentification) {
		this.proprietaryIdentification = proprietaryIdentification;
	}

	@XmlElement(name = "NmAndAdr", required = true)
	public NameAndAddress5 getNameAndAddress() {
		return nameAndAddress;
	}

	public void setNameAndAddress(NameAndAddress5 nameAndAddress) {
		this.nameAndAddress = nameAndAddress;
	}
}