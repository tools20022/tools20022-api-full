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
import com.tools20022.repository.choice.DateAndDateTimeChoice;
import com.tools20022.repository.codeset.CopyDuplicate1Code;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.Document;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Identification and creation date of a document.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DocumentIdentification11#Identification
 * DocumentIdentification11.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DocumentIdentification11#CreationDateTime
 * DocumentIdentification11.CreationDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DocumentIdentification11#CopyDuplicate
 * DocumentIdentification11.CopyDuplicate}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Document Document}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV01#Identification
 * CorporateActionCancellationAdviceV01.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionEventProcessingStatusAdviceV01#Identification
 * CorporateActionEventProcessingStatusAdviceV01.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestStatusAdviceV01#Identification
 * CorporateActionInstructionCancellationRequestStatusAdviceV01.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatementReportV01#Identification
 * CorporateActionInstructionStatementReportV01.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatusAdviceV01#Identification
 * CorporateActionInstructionStatusAdviceV01.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV01#Identification
 * CorporateActionMovementConfirmationV01.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV01#Identification
 * CorporateActionMovementPreliminaryAdviceV01.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV01#Identification
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV01.Identification}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV01#Identification
 * CorporateActionMovementReversalAdviceV01.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV01#Identification
 * CorporateActionNotificationV01.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementConfirmationV01#Identification
 * IntraPositionMovementConfirmationV01.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementPostingReportV01#Identification
 * IntraPositionMovementPostingReportV01.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV03#Identification
 * SecuritiesBalanceAccountingReportV03.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceCustodyReportV03#Identification
 * SecuritiesBalanceCustodyReportV03.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV01#Identification
 * SecuritiesFinancingConfirmationV01.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesMessageCancellationAdviceV01#Identification
 * SecuritiesMessageCancellationAdviceV01.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionModificationStatusAdviceV01#Identification
 * SecuritiesSettlementConditionModificationStatusAdviceV01.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionsModificationRequestV01#Identification
 * SecuritiesSettlementConditionsModificationRequestV01.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV01#Identification
 * SecuritiesSettlementTransactionConfirmationV01.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV01#Identification
 * SecuritiesSettlementTransactionGenerationNotificationV01.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV01#Identification
 * SecuritiesSettlementTransactionStatusAdviceV01.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPendingReportV01#Identification
 * SecuritiesTransactionPendingReportV01.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV01#Identification
 * SecuritiesTransactionPostingReportV01.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementStatusAdviceV01#Identification
 * IntraPositionMovementStatusAdviceV01.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferNotificationV01#Identification
 * PortfolioTransferNotificationV01.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV01#Identification
 * SecuritiesFinancingModificationInstructionV01.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingStatusAdviceV01#Identification
 * SecuritiesFinancingStatusAdviceV01.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementAllegementRemovalAdviceV01#Identification
 * SecuritiesSettlementAllegementRemovalAdviceV01.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAllegementReportV01#Identification
 * SecuritiesSettlementTransactionAllegementReportV01.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV01#Identification
 * SecuritiesSettlementTransactionReversalAdviceV01.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesStatementQueryV01#Identification
 * SecuritiesStatementQueryV01.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesStatusOrStatementQueryStatusAdviceV01#Identification
 * SecuritiesStatusOrStatementQueryStatusAdviceV01.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequestStatusAdviceV01#Identification
 * SecuritiesTransactionCancellationRequestStatusAdviceV01.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequestV01#Identification
 * SecuritiesTransactionCancellationRequestV01.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionStatusQueryV01#Identification
 * SecuritiesTransactionStatusQueryV01.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNarrativeV01#Identification
 * CorporateActionNarrativeV01.Identification}</li>
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
 * "DocumentIdentification11"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Identification and creation date of a document."</li>
 * </ul>
 */
public class DocumentIdentification11 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Unique identifier of the document (message) assigned by the sender of the
	 * document.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#Identification
	 * GenericIdentification.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification11
	 * DocumentIdentification11}</li>
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
	 * definition} =
	 * "Unique identifier of the document (message) assigned by the sender of the document."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute Identification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> DocumentIdentification11.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.GenericIdentification.Identification;
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Unique identifier of the document (message) assigned by the sender of the document.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Date and time at which the document (message) was created by the sender.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTimeChoice
	 * DateAndDateTimeChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Document#IssueDate
	 * Document.IssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification11
	 * DocumentIdentification11}</li>
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
	 * definition} =
	 * "Date and time at which the document (message) was created by the sender."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute CreationDateTime = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> DocumentIdentification11.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Document.IssueDate;
			isDerived = false;
			xmlTag = "CreDtTm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreationDateTime";
			definition = "Date and time at which the document (message) was created by the sender.";
			minOccurs = 0;
			maxOccurs = 1;
			complexType_lazy = () -> DateAndDateTimeChoice.mmObject();
		}
	};
	/**
	 * Specifies if this document is a copy, a duplicate, or a duplicate of a
	 * copy.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CopyDuplicate1Code
	 * CopyDuplicate1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Document#CopyDuplicate
	 * Document.CopyDuplicate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification11
	 * DocumentIdentification11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CpyDplct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CopyDuplicate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies if this document is a copy, a duplicate, or a duplicate of a copy."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute CopyDuplicate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> DocumentIdentification11.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Document.CopyDuplicate;
			isDerived = false;
			xmlTag = "CpyDplct";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CopyDuplicate";
			definition = "Specifies if this document is a copy, a duplicate, or a duplicate of a copy.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> CopyDuplicate1Code.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DocumentIdentification11.Identification, com.tools20022.repository.msg.DocumentIdentification11.CreationDateTime,
						com.tools20022.repository.msg.DocumentIdentification11.CopyDuplicate);
				trace_lazy = () -> Document.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV01.Identification,
						com.tools20022.repository.area.seev.CorporateActionEventProcessingStatusAdviceV01.Identification, com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestStatusAdviceV01.Identification,
						com.tools20022.repository.area.seev.CorporateActionInstructionStatementReportV01.Identification, com.tools20022.repository.area.seev.CorporateActionInstructionStatusAdviceV01.Identification,
						com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV01.Identification, com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV01.Identification,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV01.Identification, com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV01.Identification,
						com.tools20022.repository.area.seev.CorporateActionNotificationV01.Identification, com.tools20022.repository.area.semt.IntraPositionMovementConfirmationV01.Identification,
						com.tools20022.repository.area.semt.IntraPositionMovementPostingReportV01.Identification, com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV03.Identification,
						com.tools20022.repository.area.semt.SecuritiesBalanceCustodyReportV03.Identification, com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV01.Identification,
						com.tools20022.repository.area.semt.SecuritiesMessageCancellationAdviceV01.Identification, com.tools20022.repository.area.sese.SecuritiesSettlementConditionModificationStatusAdviceV01.Identification,
						com.tools20022.repository.area.sese.SecuritiesSettlementConditionsModificationRequestV01.Identification, com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV01.Identification,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV01.Identification, com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV01.Identification,
						com.tools20022.repository.area.semt.SecuritiesTransactionPendingReportV01.Identification, com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV01.Identification,
						com.tools20022.repository.area.semt.IntraPositionMovementStatusAdviceV01.Identification, com.tools20022.repository.area.sese.PortfolioTransferNotificationV01.Identification,
						com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV01.Identification, com.tools20022.repository.area.sese.SecuritiesFinancingStatusAdviceV01.Identification,
						com.tools20022.repository.area.sese.SecuritiesSettlementAllegementRemovalAdviceV01.Identification, com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAllegementReportV01.Identification,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV01.Identification, com.tools20022.repository.area.semt.SecuritiesStatementQueryV01.Identification,
						com.tools20022.repository.area.sese.SecuritiesStatusOrStatementQueryStatusAdviceV01.Identification, com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequestStatusAdviceV01.Identification,
						com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequestV01.Identification, com.tools20022.repository.area.sese.SecuritiesTransactionStatusQueryV01.Identification,
						com.tools20022.repository.area.seev.CorporateActionNarrativeV01.Identification);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "DocumentIdentification11";
				definition = "Identification and creation date of a document.";
			}
		});
		return mmObject_lazy.get();
	}
}