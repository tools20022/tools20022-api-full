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

package com.tools20022.repository.area.seev;

import com.tools20022.metamodel.*;
import com.tools20022.repository.area.SecuritiesEventsLatestVersion;
import com.tools20022.repository.choice.StandingInstructionCancellationStatus1Choice;
import com.tools20022.repository.choice.StandingInstructionStatus1Choice;
import com.tools20022.repository.msg.CorporateActionStandingInstructionGeneralInformation1;
import com.tools20022.repository.msg.DocumentIdentification8;
import com.tools20022.repository.msgset.IssuersAgentsCommunicationISOLatestversion;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * This message is sent by an issuer (or its agent) to the CSD to report the
 * status, or a change in status, of a standing instruction request or the
 * status of a standing instruction cancellation request.<br>
 * <b>Usage</b><br>
 * When this message is used to report the status of a standing instruction
 * request, the building block Standing Instruction Request Identification must
 * be present.<br>
 * When this message is used to report the status of a standing instruction
 * cancellation request, the building block Standing Instruction Cancellation
 * Request Identification must be present.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAStandingInstructionStatusAdviceV01#StandingInstructionRequestIdentificationOrStandingInstructionCancellationIdentificationRule
 * AgentCAStandingInstructionStatusAdviceV01.
 * StandingInstructionRequestIdentificationOrStandingInstructionCancellationIdentificationRule
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAStandingInstructionStatusAdviceV01#StandingInstructionRequestStatusOrStandingInstructionCancellationRequestStatusRule
 * AgentCAStandingInstructionStatusAdviceV01.
 * StandingInstructionRequestStatusOrStandingInstructionCancellationRequestStatusRule
 * }</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
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
 * {@linkplain com.tools20022.repository.area.seev.AgentCAStandingInstructionStatusAdviceV01#mmStandingInstructionGeneralInformation
 * AgentCAStandingInstructionStatusAdviceV01.
 * mmStandingInstructionGeneralInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAStandingInstructionStatusAdviceV01#mmStandingInstructionRequestStatus
 * AgentCAStandingInstructionStatusAdviceV01.mmStandingInstructionRequestStatus}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAStandingInstructionStatusAdviceV01#mmStandingInstructionCancellationRequestStatus
 * AgentCAStandingInstructionStatusAdviceV01.
 * mmStandingInstructionCancellationRequestStatus}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.IssuersAgentsCommunicationISOLatestversion
 * IssuersAgentsCommunicationISOLatestversion}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "AgtCAStgInstrStsAdvc"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesEventsLatestVersion
 * SecuritiesEventsLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code seev.027.001.01}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintStandingInstructionCancellationRequestStatusRule#forAgentCAStandingInstructionStatusAdviceV01
 * ConstraintStandingInstructionCancellationRequestStatusRule.
 * forAgentCAStandingInstructionStatusAdviceV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintStandingInstructionRequestStatusRule#forAgentCAStandingInstructionStatusAdviceV01
 * ConstraintStandingInstructionRequestStatusRule.
 * forAgentCAStandingInstructionStatusAdviceV01}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AgentCAStandingInstructionStatusAdviceV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThis message is sent by an issuer (or its agent) to the CSD to report the status, or a change in status, of a standing instruction request or the status of a standing instruction cancellation request.\r\nUsage\r\nWhen this message is used to report the status of a standing instruction request, the building block Standing Instruction Request Identification must be present.\r\nWhen this message is used to report the status of a standing instruction cancellation request, the building block Standing Instruction Cancellation Request Identification must be present."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AgentCAStandingInstructionStatusAdviceV01", propOrder = {"identification", "agentCAStandingInstructionRequestIdentification", "agentCAStandingInstructionCancellationRequestIdentification",
		"standingInstructionGeneralInformation", "standingInstructionRequestStatus", "standingInstructionCancellationRequestStatus"})
public class AgentCAStandingInstructionStatusAdviceV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	/**
	 * Either AgentCAStandingInstructionRequestIdentification or
	 * AgentCAStandingInstructionCancellationRequestIdentification must be
	 * present, but not both.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageDefinition
	 * messageDefinition} =
	 * {@linkplain com.tools20022.repository.area.seev.AgentCAStandingInstructionStatusAdviceV01
	 * AgentCAStandingInstructionStatusAdviceV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMXor#getImpactedMessageBuildingBlocks
	 * impactedMessageBuildingBlocks} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.AgentCAStandingInstructionStatusAdviceV01#mmAgentCAStandingInstructionRequestIdentification
	 * AgentCAStandingInstructionStatusAdviceV01.
	 * mmAgentCAStandingInstructionRequestIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.AgentCAStandingInstructionStatusAdviceV01#mmAgentCAStandingInstructionCancellationRequestIdentification
	 * AgentCAStandingInstructionStatusAdviceV01.
	 * mmAgentCAStandingInstructionCancellationRequestIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} =
	 * "StandingInstructionRequestIdentificationOrStandingInstructionCancellationIdentificationRule"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either AgentCAStandingInstructionRequestIdentification or AgentCAStandingInstructionCancellationRequestIdentification must be present, but not both."
	 * </li>
	 * </ul>
	 */
	public static final MMXor StandingInstructionRequestIdentificationOrStandingInstructionCancellationIdentificationRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StandingInstructionRequestIdentificationOrStandingInstructionCancellationIdentificationRule";
			definition = "Either AgentCAStandingInstructionRequestIdentification or AgentCAStandingInstructionCancellationRequestIdentification must be present, but not both.";
			messageDefinition_lazy = () -> com.tools20022.repository.area.seev.AgentCAStandingInstructionStatusAdviceV01.mmObject();
			impactedMessageBuildingBlocks_lazy = () -> Arrays.asList(com.tools20022.repository.area.seev.AgentCAStandingInstructionStatusAdviceV01.mmAgentCAStandingInstructionRequestIdentification,
					com.tools20022.repository.area.seev.AgentCAStandingInstructionStatusAdviceV01.mmAgentCAStandingInstructionCancellationRequestIdentification);
		}
	};
	/**
	 * Either StandingInstructionRequestStatus or
	 * StandingInstructionCancellationRequestStatus must be present, but not
	 * both.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageDefinition
	 * messageDefinition} =
	 * {@linkplain com.tools20022.repository.area.seev.AgentCAStandingInstructionStatusAdviceV01
	 * AgentCAStandingInstructionStatusAdviceV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMXor#getImpactedMessageBuildingBlocks
	 * impactedMessageBuildingBlocks} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.AgentCAStandingInstructionStatusAdviceV01#mmStandingInstructionRequestStatus
	 * AgentCAStandingInstructionStatusAdviceV01.
	 * mmStandingInstructionRequestStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.AgentCAStandingInstructionStatusAdviceV01#mmStandingInstructionCancellationRequestStatus
	 * AgentCAStandingInstructionStatusAdviceV01.
	 * mmStandingInstructionCancellationRequestStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} =
	 * "StandingInstructionRequestStatusOrStandingInstructionCancellationRequestStatusRule"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either StandingInstructionRequestStatus or StandingInstructionCancellationRequestStatus must be present, but not both."
	 * </li>
	 * </ul>
	 */
	public static final MMXor StandingInstructionRequestStatusOrStandingInstructionCancellationRequestStatusRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StandingInstructionRequestStatusOrStandingInstructionCancellationRequestStatusRule";
			definition = "Either StandingInstructionRequestStatus or StandingInstructionCancellationRequestStatus must be present, but not both.";
			messageDefinition_lazy = () -> com.tools20022.repository.area.seev.AgentCAStandingInstructionStatusAdviceV01.mmObject();
			impactedMessageBuildingBlocks_lazy = () -> Arrays.asList(com.tools20022.repository.area.seev.AgentCAStandingInstructionStatusAdviceV01.mmStandingInstructionRequestStatus,
					com.tools20022.repository.area.seev.AgentCAStandingInstructionStatusAdviceV01.mmStandingInstructionCancellationRequestStatus);
		}
	};
	@XmlElement(name = "Id", required = true)
	protected DocumentIdentification8 identification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
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
	 * definition} =
	 * "Identification assigned by the Sender to unambiguously identify the status advice."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Identification assigned by the Sender to unambiguously identify the status advice.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DocumentIdentification8.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AgentCAStandingInstructionStatusAdviceV01.class.getMethod("getIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "AgtCAStgInstrReqId", required = true)
	protected DocumentIdentification8 agentCAStandingInstructionRequestIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification8
	 * DocumentIdentification8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AgtCAStgInstrReqId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgentCAStandingInstructionRequestIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the linked Agent CA Standing Instruction Request for which a status is given."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmAgentCAStandingInstructionRequestIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "AgtCAStgInstrReqId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgentCAStandingInstructionRequestIdentification";
			definition = "Identification of the linked Agent CA Standing Instruction Request for which a status is given.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DocumentIdentification8.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AgentCAStandingInstructionStatusAdviceV01.class.getMethod("getAgentCAStandingInstructionRequestIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "AgtCAStgInstrCxlReqId", required = true)
	protected DocumentIdentification8 agentCAStandingInstructionCancellationRequestIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification8
	 * DocumentIdentification8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AgtCAStgInstrCxlReqId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgentCAStandingInstructionCancellationRequestIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the linked Agent CA Standing Instruction  Cancellation Request for which a status is given.\n"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmAgentCAStandingInstructionCancellationRequestIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "AgtCAStgInstrCxlReqId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgentCAStandingInstructionCancellationRequestIdentification";
			definition = "Identification of the linked Agent CA Standing Instruction  Cancellation Request for which a status is given.\n";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DocumentIdentification8.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AgentCAStandingInstructionStatusAdviceV01.class.getMethod("getAgentCAStandingInstructionCancellationRequestIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "StgInstrGnlInf", required = true)
	protected CorporateActionStandingInstructionGeneralInformation1 standingInstructionGeneralInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionStandingInstructionGeneralInformation1
	 * CorporateActionStandingInstructionGeneralInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StgInstrGnlInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StandingInstructionGeneralInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "General information about the standing instruction."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmStandingInstructionGeneralInformation = new MMMessageBuildingBlock() {
		{
			xmlTag = "StgInstrGnlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StandingInstructionGeneralInformation";
			definition = "General information about the standing instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CorporateActionStandingInstructionGeneralInformation1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AgentCAStandingInstructionStatusAdviceV01.class.getMethod("getStandingInstructionGeneralInformation", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "StgInstrReqSts", required = true)
	protected StandingInstructionStatus1Choice standingInstructionRequestStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.StandingInstructionStatus1Choice
	 * StandingInstructionStatus1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StgInstrReqSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StandingInstructionRequestStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of the standing instruction request."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmStandingInstructionRequestStatus = new MMMessageBuildingBlock() {
		{
			xmlTag = "StgInstrReqSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StandingInstructionRequestStatus";
			definition = "Status of the standing instruction request.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> StandingInstructionStatus1Choice.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AgentCAStandingInstructionStatusAdviceV01.class.getMethod("getStandingInstructionRequestStatus", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "StgInstrCxlReqSts", required = true)
	protected StandingInstructionCancellationStatus1Choice standingInstructionCancellationRequestStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.StandingInstructionCancellationStatus1Choice
	 * StandingInstructionCancellationStatus1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StgInstrCxlReqSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StandingInstructionCancellationRequestStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information about the status of a standing instruction cancellation request."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmStandingInstructionCancellationRequestStatus = new MMMessageBuildingBlock() {
		{
			xmlTag = "StgInstrCxlReqSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StandingInstructionCancellationRequestStatus";
			definition = "Provides information about the status of a standing instruction cancellation request.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> StandingInstructionCancellationStatus1Choice.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AgentCAStandingInstructionStatusAdviceV01.class.getMethod("getStandingInstructionCancellationRequestStatus", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintStandingInstructionCancellationRequestStatusRule.forAgentCAStandingInstructionStatusAdviceV01,
						com.tools20022.repository.constraints.ConstraintStandingInstructionRequestStatusRule.forAgentCAStandingInstructionStatusAdviceV01);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AgentCAStandingInstructionStatusAdviceV01";
				definition = "Scope\r\nThis message is sent by an issuer (or its agent) to the CSD to report the status, or a change in status, of a standing instruction request or the status of a standing instruction cancellation request.\r\nUsage\r\nWhen this message is used to report the status of a standing instruction request, the building block Standing Instruction Request Identification must be present.\r\nWhen this message is used to report the status of a standing instruction cancellation request, the building block Standing Instruction Cancellation Request Identification must be present.";
				messageSet_lazy = () -> Arrays.asList(IssuersAgentsCommunicationISOLatestversion.mmObject());
				xors_lazy = () -> Arrays.asList(com.tools20022.repository.area.seev.AgentCAStandingInstructionStatusAdviceV01.StandingInstructionRequestIdentificationOrStandingInstructionCancellationIdentificationRule,
						com.tools20022.repository.area.seev.AgentCAStandingInstructionStatusAdviceV01.StandingInstructionRequestStatusOrStandingInstructionCancellationRequestStatusRule);
				rootElement = "Document";
				xmlTag = "AgtCAStgInstrStsAdvc";
				businessArea_lazy = () -> SecuritiesEventsLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.seev.AgentCAStandingInstructionStatusAdviceV01.mmIdentification,
						com.tools20022.repository.area.seev.AgentCAStandingInstructionStatusAdviceV01.mmAgentCAStandingInstructionRequestIdentification,
						com.tools20022.repository.area.seev.AgentCAStandingInstructionStatusAdviceV01.mmAgentCAStandingInstructionCancellationRequestIdentification,
						com.tools20022.repository.area.seev.AgentCAStandingInstructionStatusAdviceV01.mmStandingInstructionGeneralInformation,
						com.tools20022.repository.area.seev.AgentCAStandingInstructionStatusAdviceV01.mmStandingInstructionRequestStatus,
						com.tools20022.repository.area.seev.AgentCAStandingInstructionStatusAdviceV01.mmStandingInstructionCancellationRequestStatus);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "seev";
						messageFunctionality = "027";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return AgentCAStandingInstructionStatusAdviceV01.class;
			}
		});
		return mmObject_lazy.get();
	}

	public DocumentIdentification8 getIdentification() {
		return identification;
	}

	public AgentCAStandingInstructionStatusAdviceV01 setIdentification(DocumentIdentification8 identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public DocumentIdentification8 getAgentCAStandingInstructionRequestIdentification() {
		return agentCAStandingInstructionRequestIdentification;
	}

	public AgentCAStandingInstructionStatusAdviceV01 setAgentCAStandingInstructionRequestIdentification(DocumentIdentification8 agentCAStandingInstructionRequestIdentification) {
		this.agentCAStandingInstructionRequestIdentification = Objects.requireNonNull(agentCAStandingInstructionRequestIdentification);
		return this;
	}

	public DocumentIdentification8 getAgentCAStandingInstructionCancellationRequestIdentification() {
		return agentCAStandingInstructionCancellationRequestIdentification;
	}

	public AgentCAStandingInstructionStatusAdviceV01 setAgentCAStandingInstructionCancellationRequestIdentification(DocumentIdentification8 agentCAStandingInstructionCancellationRequestIdentification) {
		this.agentCAStandingInstructionCancellationRequestIdentification = Objects.requireNonNull(agentCAStandingInstructionCancellationRequestIdentification);
		return this;
	}

	public CorporateActionStandingInstructionGeneralInformation1 getStandingInstructionGeneralInformation() {
		return standingInstructionGeneralInformation;
	}

	public AgentCAStandingInstructionStatusAdviceV01 setStandingInstructionGeneralInformation(CorporateActionStandingInstructionGeneralInformation1 standingInstructionGeneralInformation) {
		this.standingInstructionGeneralInformation = Objects.requireNonNull(standingInstructionGeneralInformation);
		return this;
	}

	public StandingInstructionStatus1Choice getStandingInstructionRequestStatus() {
		return standingInstructionRequestStatus;
	}

	public AgentCAStandingInstructionStatusAdviceV01 setStandingInstructionRequestStatus(StandingInstructionStatus1Choice standingInstructionRequestStatus) {
		this.standingInstructionRequestStatus = Objects.requireNonNull(standingInstructionRequestStatus);
		return this;
	}

	public StandingInstructionCancellationStatus1Choice getStandingInstructionCancellationRequestStatus() {
		return standingInstructionCancellationRequestStatus;
	}

	public AgentCAStandingInstructionStatusAdviceV01 setStandingInstructionCancellationRequestStatus(StandingInstructionCancellationStatus1Choice standingInstructionCancellationRequestStatus) {
		this.standingInstructionCancellationRequestStatus = Objects.requireNonNull(standingInstructionCancellationRequestStatus);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.027.001.01")
	static public class Document {
		@XmlElement(name = "AgtCAStgInstrStsAdvc", required = true)
		public AgentCAStandingInstructionStatusAdviceV01 messageBody;
	}
}