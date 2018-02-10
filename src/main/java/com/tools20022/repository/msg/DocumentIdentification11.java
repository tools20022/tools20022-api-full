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
import com.tools20022.repository.area.seev.*;
import com.tools20022.repository.area.semt.*;
import com.tools20022.repository.area.sese.*;
import com.tools20022.repository.choice.DateAndDateTimeChoice;
import com.tools20022.repository.codeset.CopyDuplicate1Code;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.Document;
import com.tools20022.repository.entity.GenericIdentification;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

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
 * {@linkplain com.tools20022.repository.msg.DocumentIdentification11#mmIdentification
 * DocumentIdentification11.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DocumentIdentification11#mmCreationDateTime
 * DocumentIdentification11.mmCreationDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DocumentIdentification11#mmCopyDuplicate
 * DocumentIdentification11.mmCopyDuplicate}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Document Document}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV01#mmIdentification
 * CorporateActionCancellationAdviceV01.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionEventProcessingStatusAdviceV01#mmIdentification
 * CorporateActionEventProcessingStatusAdviceV01.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestStatusAdviceV01#mmIdentification
 * CorporateActionInstructionCancellationRequestStatusAdviceV01.mmIdentification
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatementReportV01#mmIdentification
 * CorporateActionInstructionStatementReportV01.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatusAdviceV01#mmIdentification
 * CorporateActionInstructionStatusAdviceV01.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV01#mmIdentification
 * CorporateActionMovementConfirmationV01.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV01#mmIdentification
 * CorporateActionMovementPreliminaryAdviceV01.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV01#mmIdentification
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV01.
 * mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV01#mmIdentification
 * CorporateActionMovementReversalAdviceV01.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV01#mmIdentification
 * CorporateActionNotificationV01.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementConfirmationV01#mmIdentification
 * IntraPositionMovementConfirmationV01.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementPostingReportV01#mmIdentification
 * IntraPositionMovementPostingReportV01.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV03#mmIdentification
 * SecuritiesBalanceAccountingReportV03.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceCustodyReportV03#mmIdentification
 * SecuritiesBalanceCustodyReportV03.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV01#mmIdentification
 * SecuritiesFinancingConfirmationV01.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesMessageCancellationAdviceV01#mmIdentification
 * SecuritiesMessageCancellationAdviceV01.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionModificationStatusAdviceV01#mmIdentification
 * SecuritiesSettlementConditionModificationStatusAdviceV01.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionsModificationRequestV01#mmIdentification
 * SecuritiesSettlementConditionsModificationRequestV01.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV01#mmIdentification
 * SecuritiesSettlementTransactionConfirmationV01.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV01#mmIdentification
 * SecuritiesSettlementTransactionGenerationNotificationV01.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV01#mmIdentification
 * SecuritiesSettlementTransactionStatusAdviceV01.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPendingReportV01#mmIdentification
 * SecuritiesTransactionPendingReportV01.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV01#mmIdentification
 * SecuritiesTransactionPostingReportV01.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementStatusAdviceV01#mmIdentification
 * IntraPositionMovementStatusAdviceV01.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferNotificationV01#mmIdentification
 * PortfolioTransferNotificationV01.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV01#mmIdentification
 * SecuritiesFinancingModificationInstructionV01.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingStatusAdviceV01#mmIdentification
 * SecuritiesFinancingStatusAdviceV01.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementAllegementRemovalAdviceV01#mmIdentification
 * SecuritiesSettlementAllegementRemovalAdviceV01.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAllegementReportV01#mmIdentification
 * SecuritiesSettlementTransactionAllegementReportV01.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV01#mmIdentification
 * SecuritiesSettlementTransactionReversalAdviceV01.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesStatementQueryV01#mmIdentification
 * SecuritiesStatementQueryV01.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesStatusOrStatementQueryStatusAdviceV01#mmIdentification
 * SecuritiesStatusOrStatementQueryStatusAdviceV01.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequestStatusAdviceV01#mmIdentification
 * SecuritiesTransactionCancellationRequestStatusAdviceV01.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequestV01#mmIdentification
 * SecuritiesTransactionCancellationRequestV01.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionStatusQueryV01#mmIdentification
 * SecuritiesTransactionStatusQueryV01.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNarrativeV01#mmIdentification
 * CorporateActionNarrativeV01.mmIdentification}</li>
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
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "DocumentIdentification11", propOrder = {"identification", "creationDateTime", "copyDuplicate"})
public class DocumentIdentification11 {

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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentification
	 * GenericIdentification.mmIdentification}</li>
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
	public static final MMMessageAttribute mmIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> GenericIdentification.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.DocumentIdentification11.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Unique identifier of the document (message) assigned by the sender of the document.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "CreDtTm")
	protected DateAndDateTimeChoice creationDateTime;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.entity.Document#mmIssueDate
	 * Document.mmIssueDate}</li>
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
	public static final MMMessageAttribute mmCreationDateTime = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Document.mmIssueDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.DocumentIdentification11.mmObject();
			isDerived = false;
			xmlTag = "CreDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreationDateTime";
			definition = "Date and time at which the document (message) was created by the sender.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateAndDateTimeChoice.mmObject();
		}
	};
	@XmlElement(name = "CpyDplct")
	protected CopyDuplicate1Code copyDuplicate;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.entity.Document#mmCopyDuplicate
	 * Document.mmCopyDuplicate}</li>
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
	public static final MMMessageAttribute mmCopyDuplicate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Document.mmCopyDuplicate;
			componentContext_lazy = () -> com.tools20022.repository.msg.DocumentIdentification11.mmObject();
			isDerived = false;
			xmlTag = "CpyDplct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CopyDuplicate";
			definition = "Specifies if this document is a copy, a duplicate, or a duplicate of a copy.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CopyDuplicate1Code.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DocumentIdentification11.mmIdentification, com.tools20022.repository.msg.DocumentIdentification11.mmCreationDateTime,
						com.tools20022.repository.msg.DocumentIdentification11.mmCopyDuplicate);
				messageBuildingBlock_lazy = () -> Arrays.asList(CorporateActionCancellationAdviceV01.mmIdentification, CorporateActionEventProcessingStatusAdviceV01.mmIdentification,
						CorporateActionInstructionCancellationRequestStatusAdviceV01.mmIdentification, CorporateActionInstructionStatementReportV01.mmIdentification, CorporateActionInstructionStatusAdviceV01.mmIdentification,
						CorporateActionMovementConfirmationV01.mmIdentification, CorporateActionMovementPreliminaryAdviceV01.mmIdentification, CorporateActionMovementPreliminaryAdviceCancellationAdviceV01.mmIdentification,
						CorporateActionMovementReversalAdviceV01.mmIdentification, CorporateActionNotificationV01.mmIdentification, IntraPositionMovementConfirmationV01.mmIdentification,
						IntraPositionMovementPostingReportV01.mmIdentification, SecuritiesBalanceAccountingReportV03.mmIdentification, SecuritiesBalanceCustodyReportV03.mmIdentification, SecuritiesFinancingConfirmationV01.mmIdentification,
						SecuritiesMessageCancellationAdviceV01.mmIdentification, SecuritiesSettlementConditionModificationStatusAdviceV01.mmIdentification, SecuritiesSettlementConditionsModificationRequestV01.mmIdentification,
						SecuritiesSettlementTransactionConfirmationV01.mmIdentification, SecuritiesSettlementTransactionGenerationNotificationV01.mmIdentification, SecuritiesSettlementTransactionStatusAdviceV01.mmIdentification,
						SecuritiesTransactionPendingReportV01.mmIdentification, SecuritiesTransactionPostingReportV01.mmIdentification, IntraPositionMovementStatusAdviceV01.mmIdentification,
						PortfolioTransferNotificationV01.mmIdentification, SecuritiesFinancingModificationInstructionV01.mmIdentification, SecuritiesFinancingStatusAdviceV01.mmIdentification,
						SecuritiesSettlementAllegementRemovalAdviceV01.mmIdentification, SecuritiesSettlementTransactionAllegementReportV01.mmIdentification, SecuritiesSettlementTransactionReversalAdviceV01.mmIdentification,
						SecuritiesStatementQueryV01.mmIdentification, SecuritiesStatusOrStatementQueryStatusAdviceV01.mmIdentification, SecuritiesTransactionCancellationRequestStatusAdviceV01.mmIdentification,
						SecuritiesTransactionCancellationRequestV01.mmIdentification, SecuritiesTransactionStatusQueryV01.mmIdentification, CorporateActionNarrativeV01.mmIdentification);
				trace_lazy = () -> Document.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DocumentIdentification11";
				definition = "Identification and creation date of a document.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getIdentification() {
		return identification;
	}

	public DocumentIdentification11 setIdentification(Max35Text identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public Optional<DateAndDateTimeChoice> getCreationDateTime() {
		return creationDateTime == null ? Optional.empty() : Optional.of(creationDateTime);
	}

	public DocumentIdentification11 setCreationDateTime(DateAndDateTimeChoice creationDateTime) {
		this.creationDateTime = creationDateTime;
		return this;
	}

	public Optional<CopyDuplicate1Code> getCopyDuplicate() {
		return copyDuplicate == null ? Optional.empty() : Optional.of(copyDuplicate);
	}

	public DocumentIdentification11 setCopyDuplicate(CopyDuplicate1Code copyDuplicate) {
		this.copyDuplicate = copyDuplicate;
		return this;
	}
}