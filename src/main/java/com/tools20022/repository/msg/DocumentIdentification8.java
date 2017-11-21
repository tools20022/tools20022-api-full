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
import com.tools20022.repository.area.auth.RegulatoryTransactionReportCancellationRequestV02;
import com.tools20022.repository.area.auth.RegulatoryTransactionReportCancellationStatusV01;
import com.tools20022.repository.area.auth.RegulatoryTransactionReportStatusV01;
import com.tools20022.repository.area.auth.RegulatoryTransactionReportV02;
import com.tools20022.repository.area.seev.*;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.Document;
import com.tools20022.repository.entity.GenericIdentification;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Identifies the document by providing a unique identification and optionally
 * the date/time of the creation of the document.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DocumentIdentification8#mmIdentification
 * DocumentIdentification8.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DocumentIdentification8#mmCreationDateTime
 * DocumentIdentification8.mmCreationDateTime}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Document Document}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCANotificationAdviceV01#mmIdentification
 * AgentCANotificationAdviceV01.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCANotificationCancellationRequestV01#mmIdentification
 * AgentCANotificationCancellationRequestV01.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCANotificationStatusAdviceV01#mmIdentification
 * AgentCANotificationStatusAdviceV01.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCANotificationStatusAdviceV01#mmAgentCANotificationAdviceIdentification
 * AgentCANotificationStatusAdviceV01.mmAgentCANotificationAdviceIdentification}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCANotificationStatusAdviceV01#mmAgentCANotificationCancellationRequestIdentification
 * AgentCANotificationStatusAdviceV01.
 * mmAgentCANotificationCancellationRequestIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAElectionAdviceV01#mmIdentification
 * AgentCAElectionAdviceV01.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAElectionAmendmentRequestV01#mmIdentification
 * AgentCAElectionAmendmentRequestV01.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAElectionAmendmentRequestV01#mmAgentCAElectionAdviceIdentification
 * AgentCAElectionAmendmentRequestV01.mmAgentCAElectionAdviceIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAElectionCancellationRequestV01#mmIdentification
 * AgentCAElectionCancellationRequestV01.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAElectionCancellationRequestV01#mmAgentCAElectionAdviceIdentification
 * AgentCAElectionCancellationRequestV01.mmAgentCAElectionAdviceIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAElectionStatusAdviceV01#mmIdentification
 * AgentCAElectionStatusAdviceV01.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAElectionStatusAdviceV01#mmAgentCAElectionAdviceIdentification
 * AgentCAElectionStatusAdviceV01.mmAgentCAElectionAdviceIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAElectionStatusAdviceV01#mmAgentCAElectionCancellationRequestIdentification
 * AgentCAElectionStatusAdviceV01.
 * mmAgentCAElectionCancellationRequestIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAElectionStatusAdviceV01#mmAgentCAElectionAmendmentRequestIdentification
 * AgentCAElectionStatusAdviceV01.
 * mmAgentCAElectionAmendmentRequestIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCADistributionBreakdownAdviceV01#mmIdentification
 * AgentCADistributionBreakdownAdviceV01.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAGlobalDistributionAuthorisationRequestV01#mmIdentification
 * AgentCAGlobalDistributionAuthorisationRequestV01.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAGlobalDistributionStatusAdviceV01#mmIdentification
 * AgentCAGlobalDistributionStatusAdviceV01.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAGlobalDistributionStatusAdviceV01#mmAgentCAGlobalDistributionAuthorisationRequestIdentification
 * AgentCAGlobalDistributionStatusAdviceV01.
 * mmAgentCAGlobalDistributionAuthorisationRequestIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAMovementInstructionV01#mmIdentification
 * AgentCAMovementInstructionV01.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAMovementInstructionV01#mmAgentCAElectionAdviceIdentification
 * AgentCAMovementInstructionV01.mmAgentCAElectionAdviceIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAMovementCancellationRequestV01#mmIdentification
 * AgentCAMovementCancellationRequestV01.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAMovementCancellationRequestV01#mmAgentCAMovementInstructionIdentification
 * AgentCAMovementCancellationRequestV01.
 * mmAgentCAMovementInstructionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAMovementConfirmationV01#mmIdentification
 * AgentCAMovementConfirmationV01.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAMovementConfirmationV01#mmAgentCAMovementInstructionIdentification
 * AgentCAMovementConfirmationV01.mmAgentCAMovementInstructionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAMovementConfirmationV01#mmAgentCAElectionStatusAdviceIdentification
 * AgentCAMovementConfirmationV01.mmAgentCAElectionStatusAdviceIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAMovementConfirmationV01#mmAgentCAGlobalDistributionStatusAdviceIdentification
 * AgentCAMovementConfirmationV01.
 * mmAgentCAGlobalDistributionStatusAdviceIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAMovementStatusAdviceV01#mmIdentification
 * AgentCAMovementStatusAdviceV01.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAMovementStatusAdviceV01#mmAgentCAElectionStatusAdviceIdentification
 * AgentCAMovementStatusAdviceV01.mmAgentCAElectionStatusAdviceIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAMovementStatusAdviceV01#mmAgentCAGlobalDistributionStatusAdviceIdentification
 * AgentCAMovementStatusAdviceV01.
 * mmAgentCAGlobalDistributionStatusAdviceIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAMovementStatusAdviceV01#mmAgentCAMovementInstructionIdentification
 * AgentCAMovementStatusAdviceV01.mmAgentCAMovementInstructionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAMovementStatusAdviceV01#mmAgentCAMovementCancellationRequestIdentification
 * AgentCAMovementStatusAdviceV01.
 * mmAgentCAMovementCancellationRequestIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAInformationAdviceV01#mmIdentification
 * AgentCAInformationAdviceV01.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAInformationAdviceV01#mmAgentCAElectionAdviceIdentification
 * AgentCAInformationAdviceV01.mmAgentCAElectionAdviceIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAInformationStatusAdviceV01#mmIdentification
 * AgentCAInformationStatusAdviceV01.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAInformationStatusAdviceV01#mmAgentCAInformationAdviceIdentification
 * AgentCAInformationStatusAdviceV01.mmAgentCAInformationAdviceIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAStandingInstructionRequestV01#mmIdentification
 * AgentCAStandingInstructionRequestV01.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAStandingInstructionCancellationRequestV01#mmIdentification
 * AgentCAStandingInstructionCancellationRequestV01.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAStandingInstructionCancellationRequestV01#mmAgentCAStandingInstructionRequestIdentification
 * AgentCAStandingInstructionCancellationRequestV01.
 * mmAgentCAStandingInstructionRequestIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAStandingInstructionStatusAdviceV01#mmIdentification
 * AgentCAStandingInstructionStatusAdviceV01.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAStandingInstructionStatusAdviceV01#mmAgentCAStandingInstructionRequestIdentification
 * AgentCAStandingInstructionStatusAdviceV01.
 * mmAgentCAStandingInstructionRequestIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAStandingInstructionStatusAdviceV01#mmAgentCAStandingInstructionCancellationRequestIdentification
 * AgentCAStandingInstructionStatusAdviceV01.
 * mmAgentCAStandingInstructionCancellationRequestIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCADeactivationInstructionV01#mmIdentification
 * AgentCADeactivationInstructionV01.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCADeactivationCancellationRequestV01#mmIdentification
 * AgentCADeactivationCancellationRequestV01.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCADeactivationCancellationRequestV01#mmAgentCADeactivationInstructionIdentification
 * AgentCADeactivationCancellationRequestV01.
 * mmAgentCADeactivationInstructionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCADeactivationStatusAdviceV01#mmIdentification
 * AgentCADeactivationStatusAdviceV01.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCADeactivationStatusAdviceV01#mmAgentCADeactivationInstructionIdentification
 * AgentCADeactivationStatusAdviceV01.
 * mmAgentCADeactivationInstructionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCADeactivationStatusAdviceV01#mmAgentCADeactivationCancellationRequestIdentification
 * AgentCADeactivationStatusAdviceV01.
 * mmAgentCADeactivationCancellationRequestIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.RegulatoryTransactionReportV02#mmIdentification
 * RegulatoryTransactionReportV02.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.RegulatoryTransactionReportCancellationRequestV02#mmIdentification
 * RegulatoryTransactionReportCancellationRequestV02.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.RegulatoryTransactionReportStatusV01#mmIdentification
 * RegulatoryTransactionReportStatusV01.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.RegulatoryTransactionReportCancellationStatusV01#mmIdentification
 * RegulatoryTransactionReportCancellationStatusV01.mmIdentification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DocumentIdentification8"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Identifies the document by providing a unique identification and optionally the date/time of the creation of the document."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "DocumentIdentification8", propOrder = {"identification", "creationDateTime"})
public class DocumentIdentification8 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text identification;
	/**
	 * Unique identification of the document.
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
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentification
	 * GenericIdentification.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification8
	 * DocumentIdentification8}</li>
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
	 * definition} = "Unique identification of the document."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> GenericIdentification.mmIdentification;
			componentContext_lazy = () -> DocumentIdentification8.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Unique identification of the document.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected ISODateTime creationDateTime;
	/**
	 * Date/time of the creation of the document.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Document#mmIssueDate
	 * Document.mmIssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification8
	 * DocumentIdentification8}</li>
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
	 * definition} = "Date/time of the creation of the document."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCreationDateTime = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Document.mmIssueDate;
			componentContext_lazy = () -> DocumentIdentification8.mmObject();
			isDerived = false;
			xmlTag = "CreDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreationDateTime";
			definition = "Date/time of the creation of the document.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(DocumentIdentification8.mmIdentification, DocumentIdentification8.mmCreationDateTime);
				messageBuildingBlock_lazy = () -> Arrays.asList(AgentCANotificationAdviceV01.mmIdentification, AgentCANotificationCancellationRequestV01.mmIdentification, AgentCANotificationStatusAdviceV01.mmIdentification,
						AgentCANotificationStatusAdviceV01.mmAgentCANotificationAdviceIdentification, AgentCANotificationStatusAdviceV01.mmAgentCANotificationCancellationRequestIdentification, AgentCAElectionAdviceV01.mmIdentification,
						AgentCAElectionAmendmentRequestV01.mmIdentification, AgentCAElectionAmendmentRequestV01.mmAgentCAElectionAdviceIdentification, AgentCAElectionCancellationRequestV01.mmIdentification,
						AgentCAElectionCancellationRequestV01.mmAgentCAElectionAdviceIdentification, AgentCAElectionStatusAdviceV01.mmIdentification, AgentCAElectionStatusAdviceV01.mmAgentCAElectionAdviceIdentification,
						AgentCAElectionStatusAdviceV01.mmAgentCAElectionCancellationRequestIdentification, AgentCAElectionStatusAdviceV01.mmAgentCAElectionAmendmentRequestIdentification,
						AgentCADistributionBreakdownAdviceV01.mmIdentification, AgentCAGlobalDistributionAuthorisationRequestV01.mmIdentification, AgentCAGlobalDistributionStatusAdviceV01.mmIdentification,
						AgentCAGlobalDistributionStatusAdviceV01.mmAgentCAGlobalDistributionAuthorisationRequestIdentification, AgentCAMovementInstructionV01.mmIdentification,
						AgentCAMovementInstructionV01.mmAgentCAElectionAdviceIdentification, AgentCAMovementCancellationRequestV01.mmIdentification, AgentCAMovementCancellationRequestV01.mmAgentCAMovementInstructionIdentification,
						AgentCAMovementConfirmationV01.mmIdentification, AgentCAMovementConfirmationV01.mmAgentCAMovementInstructionIdentification, AgentCAMovementConfirmationV01.mmAgentCAElectionStatusAdviceIdentification,
						AgentCAMovementConfirmationV01.mmAgentCAGlobalDistributionStatusAdviceIdentification, AgentCAMovementStatusAdviceV01.mmIdentification, AgentCAMovementStatusAdviceV01.mmAgentCAElectionStatusAdviceIdentification,
						AgentCAMovementStatusAdviceV01.mmAgentCAGlobalDistributionStatusAdviceIdentification, AgentCAMovementStatusAdviceV01.mmAgentCAMovementInstructionIdentification,
						AgentCAMovementStatusAdviceV01.mmAgentCAMovementCancellationRequestIdentification, AgentCAInformationAdviceV01.mmIdentification, AgentCAInformationAdviceV01.mmAgentCAElectionAdviceIdentification,
						AgentCAInformationStatusAdviceV01.mmIdentification, AgentCAInformationStatusAdviceV01.mmAgentCAInformationAdviceIdentification, AgentCAStandingInstructionRequestV01.mmIdentification,
						AgentCAStandingInstructionCancellationRequestV01.mmIdentification, AgentCAStandingInstructionCancellationRequestV01.mmAgentCAStandingInstructionRequestIdentification,
						AgentCAStandingInstructionStatusAdviceV01.mmIdentification, AgentCAStandingInstructionStatusAdviceV01.mmAgentCAStandingInstructionRequestIdentification,
						AgentCAStandingInstructionStatusAdviceV01.mmAgentCAStandingInstructionCancellationRequestIdentification, AgentCADeactivationInstructionV01.mmIdentification,
						AgentCADeactivationCancellationRequestV01.mmIdentification, AgentCADeactivationCancellationRequestV01.mmAgentCADeactivationInstructionIdentification, AgentCADeactivationStatusAdviceV01.mmIdentification,
						AgentCADeactivationStatusAdviceV01.mmAgentCADeactivationInstructionIdentification, AgentCADeactivationStatusAdviceV01.mmAgentCADeactivationCancellationRequestIdentification,
						RegulatoryTransactionReportV02.mmIdentification, RegulatoryTransactionReportCancellationRequestV02.mmIdentification, RegulatoryTransactionReportStatusV01.mmIdentification,
						RegulatoryTransactionReportCancellationStatusV01.mmIdentification);
				trace_lazy = () -> Document.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DocumentIdentification8";
				definition = "Identifies the document by providing a unique identification and optionally the date/time of the creation of the document.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Id", required = true)
	public Max35Text getIdentification() {
		return identification;
	}

	public void setIdentification(Max35Text identification) {
		this.identification = identification;
	}

	@XmlElement(name = "CreDtTm")
	public ISODateTime getCreationDateTime() {
		return creationDateTime;
	}

	public void setCreationDateTime(ISODateTime creationDateTime) {
		this.creationDateTime = creationDateTime;
	}
}