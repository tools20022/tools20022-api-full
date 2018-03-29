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
import com.tools20022.repository.choice.CorporateActionDeactivationCancellationStatus1Choice;
import com.tools20022.repository.msg.CorporateActionDeactivationInstructionStatus1;
import com.tools20022.repository.msg.CorporateActionInformation1;
import com.tools20022.repository.msg.DocumentIdentification8;
import com.tools20022.repository.msgset.IssuersAgentsCommunicationISOLatestversion;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * This message is sent by a CSD to an issuer (or its agent) to report the
 * status, or a change in status, of a corporate action deactivation instruction
 * or the status of a deactivation cancellation request.<br>
 * <b>Usage</b><br>
 * This message is used to provide a status on the deactivation instruction,
 * especially to confirm the deactivation of a Corporate Action event or option.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCADeactivationStatusAdviceV01#DeactivationInstructionIDOrDeactivationCancellationRequestIDRule
 * AgentCADeactivationStatusAdviceV01.
 * DeactivationInstructionIDOrDeactivationCancellationRequestIDRule}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCADeactivationStatusAdviceV01#DeactivationInstructionStatusOrDeactivationCancellationRequestStatusRule
 * AgentCADeactivationStatusAdviceV01.
 * DeactivationInstructionStatusOrDeactivationCancellationRequestStatusRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
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
 * {@linkplain com.tools20022.repository.area.seev.AgentCADeactivationStatusAdviceV01#mmCorporateActionGeneralInformation
 * AgentCADeactivationStatusAdviceV01.mmCorporateActionGeneralInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCADeactivationStatusAdviceV01#mmDeactivationInstructionStatus
 * AgentCADeactivationStatusAdviceV01.mmDeactivationInstructionStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCADeactivationStatusAdviceV01#mmDeactivationCancellationRequestStatus
 * AgentCADeactivationStatusAdviceV01.mmDeactivationCancellationRequestStatus}</li>
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
 * xmlTag} = "AgtCADeactvtnStsAdvc"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesEventsLatestVersion
 * SecuritiesEventsLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code seev.030.001.01}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintDeactivationInstructionStatusRule#forAgentCADeactivationStatusAdviceV01
 * ConstraintDeactivationInstructionStatusRule.
 * forAgentCADeactivationStatusAdviceV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintDeactivationCancellationRequestStatusRule#forAgentCADeactivationStatusAdviceV01
 * ConstraintDeactivationCancellationRequestStatusRule.
 * forAgentCADeactivationStatusAdviceV01}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AgentCADeactivationStatusAdviceV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThis message is sent by a CSD to an issuer (or its agent) to report the status, or a change in status, of a corporate action deactivation instruction or the status of a deactivation cancellation request.\r\nUsage\r\nThis message is used to provide a status on the deactivation instruction, especially to confirm the deactivation of a Corporate Action event or option."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AgentCADeactivationStatusAdviceV01", propOrder = {"identification", "agentCADeactivationInstructionIdentification", "agentCADeactivationCancellationRequestIdentification", "corporateActionGeneralInformation",
		"deactivationInstructionStatus", "deactivationCancellationRequestStatus"})
public class AgentCADeactivationStatusAdviceV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	/**
	 * Either AgentCADeactivationInstructionIdentification or
	 * AgentCADeactivationCancellationRequestIdentification must be present.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageDefinition
	 * messageDefinition} =
	 * {@linkplain com.tools20022.repository.area.seev.AgentCADeactivationStatusAdviceV01
	 * AgentCADeactivationStatusAdviceV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMXor#getImpactedMessageBuildingBlocks
	 * impactedMessageBuildingBlocks} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.AgentCADeactivationStatusAdviceV01#mmAgentCADeactivationInstructionIdentification
	 * AgentCADeactivationStatusAdviceV01.
	 * mmAgentCADeactivationInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.AgentCADeactivationStatusAdviceV01#mmAgentCADeactivationCancellationRequestIdentification
	 * AgentCADeactivationStatusAdviceV01.
	 * mmAgentCADeactivationCancellationRequestIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} =
	 * "DeactivationInstructionIDOrDeactivationCancellationRequestIDRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either AgentCADeactivationInstructionIdentification or AgentCADeactivationCancellationRequestIdentification must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMXor DeactivationInstructionIDOrDeactivationCancellationRequestIDRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeactivationInstructionIDOrDeactivationCancellationRequestIDRule";
			definition = "Either AgentCADeactivationInstructionIdentification or AgentCADeactivationCancellationRequestIdentification must be present.";
			messageDefinition_lazy = () -> com.tools20022.repository.area.seev.AgentCADeactivationStatusAdviceV01.mmObject();
			impactedMessageBuildingBlocks_lazy = () -> Arrays.asList(com.tools20022.repository.area.seev.AgentCADeactivationStatusAdviceV01.mmAgentCADeactivationInstructionIdentification,
					com.tools20022.repository.area.seev.AgentCADeactivationStatusAdviceV01.mmAgentCADeactivationCancellationRequestIdentification);
		}
	};
	/**
	 * Either DeactivationInstructionStatus or
	 * DeactivationCancellationRequestStatus must be present.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageDefinition
	 * messageDefinition} =
	 * {@linkplain com.tools20022.repository.area.seev.AgentCADeactivationStatusAdviceV01
	 * AgentCADeactivationStatusAdviceV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMXor#getImpactedMessageBuildingBlocks
	 * impactedMessageBuildingBlocks} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.AgentCADeactivationStatusAdviceV01#mmDeactivationInstructionStatus
	 * AgentCADeactivationStatusAdviceV01.mmDeactivationInstructionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.AgentCADeactivationStatusAdviceV01#mmDeactivationCancellationRequestStatus
	 * AgentCADeactivationStatusAdviceV01.
	 * mmDeactivationCancellationRequestStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} =
	 * "DeactivationInstructionStatusOrDeactivationCancellationRequestStatusRule"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either DeactivationInstructionStatus or DeactivationCancellationRequestStatus must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMXor DeactivationInstructionStatusOrDeactivationCancellationRequestStatusRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeactivationInstructionStatusOrDeactivationCancellationRequestStatusRule";
			definition = "Either DeactivationInstructionStatus or DeactivationCancellationRequestStatus must be present.";
			messageDefinition_lazy = () -> com.tools20022.repository.area.seev.AgentCADeactivationStatusAdviceV01.mmObject();
			impactedMessageBuildingBlocks_lazy = () -> Arrays.asList(com.tools20022.repository.area.seev.AgentCADeactivationStatusAdviceV01.mmDeactivationInstructionStatus,
					com.tools20022.repository.area.seev.AgentCADeactivationStatusAdviceV01.mmDeactivationCancellationRequestStatus);
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
	public static final MMMessageBuildingBlock<AgentCADeactivationStatusAdviceV01, DocumentIdentification8> mmIdentification = new MMMessageBuildingBlock<AgentCADeactivationStatusAdviceV01, DocumentIdentification8>() {
		{
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Identification assigned by the Sender to unambiguously identify the status advice.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DocumentIdentification8.mmObject();
		}

		@Override
		public DocumentIdentification8 getValue(AgentCADeactivationStatusAdviceV01 obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(AgentCADeactivationStatusAdviceV01 obj, DocumentIdentification8 value) {
			obj.setIdentification(value);
		}
	};
	@XmlElement(name = "AgtCADeactvtnInstrId", required = true)
	protected DocumentIdentification8 agentCADeactivationInstructionIdentification;
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
	 * xmlTag} = "AgtCADeactvtnInstrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgentCADeactivationInstructionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the linked Agent CA Deactivation Instruction for which a status is given."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AgentCADeactivationStatusAdviceV01, DocumentIdentification8> mmAgentCADeactivationInstructionIdentification = new MMMessageBuildingBlock<AgentCADeactivationStatusAdviceV01, DocumentIdentification8>() {
		{
			xmlTag = "AgtCADeactvtnInstrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgentCADeactivationInstructionIdentification";
			definition = "Identification of the linked Agent CA Deactivation Instruction for which a status is given.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DocumentIdentification8.mmObject();
		}

		@Override
		public DocumentIdentification8 getValue(AgentCADeactivationStatusAdviceV01 obj) {
			return obj.getAgentCADeactivationInstructionIdentification();
		}

		@Override
		public void setValue(AgentCADeactivationStatusAdviceV01 obj, DocumentIdentification8 value) {
			obj.setAgentCADeactivationInstructionIdentification(value);
		}
	};
	@XmlElement(name = "AgtCADeactvtnCxlReqId", required = true)
	protected DocumentIdentification8 agentCADeactivationCancellationRequestIdentification;
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
	 * xmlTag} = "AgtCADeactvtnCxlReqId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgentCADeactivationCancellationRequestIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the linked Agent CA Deactivation Cancellation Request for which a status is given."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AgentCADeactivationStatusAdviceV01, DocumentIdentification8> mmAgentCADeactivationCancellationRequestIdentification = new MMMessageBuildingBlock<AgentCADeactivationStatusAdviceV01, DocumentIdentification8>() {
		{
			xmlTag = "AgtCADeactvtnCxlReqId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgentCADeactivationCancellationRequestIdentification";
			definition = "Identification of the linked Agent CA Deactivation Cancellation Request for which a status is given.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DocumentIdentification8.mmObject();
		}

		@Override
		public DocumentIdentification8 getValue(AgentCADeactivationStatusAdviceV01 obj) {
			return obj.getAgentCADeactivationCancellationRequestIdentification();
		}

		@Override
		public void setValue(AgentCADeactivationStatusAdviceV01 obj, DocumentIdentification8 value) {
			obj.setAgentCADeactivationCancellationRequestIdentification(value);
		}
	};
	@XmlElement(name = "CorpActnGnlInf", required = true)
	protected CorporateActionInformation1 corporateActionGeneralInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInformation1
	 * CorporateActionInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CorpActnGnlInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionGeneralInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "General information about the corporate action event."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AgentCADeactivationStatusAdviceV01, CorporateActionInformation1> mmCorporateActionGeneralInformation = new MMMessageBuildingBlock<AgentCADeactivationStatusAdviceV01, CorporateActionInformation1>() {
		{
			xmlTag = "CorpActnGnlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionGeneralInformation";
			definition = "General information about the corporate action event.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CorporateActionInformation1.mmObject();
		}

		@Override
		public CorporateActionInformation1 getValue(AgentCADeactivationStatusAdviceV01 obj) {
			return obj.getCorporateActionGeneralInformation();
		}

		@Override
		public void setValue(AgentCADeactivationStatusAdviceV01 obj, CorporateActionInformation1 value) {
			obj.setCorporateActionGeneralInformation(value);
		}
	};
	@XmlElement(name = "DeactvtnInstrSts", required = true)
	protected List<CorporateActionDeactivationInstructionStatus1> deactivationInstructionStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDeactivationInstructionStatus1
	 * CorporateActionDeactivationInstructionStatus1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DeactvtnInstrSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeactivationInstructionStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Status of the deactivation instruction sent by the issuer (agent)."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AgentCADeactivationStatusAdviceV01, List<CorporateActionDeactivationInstructionStatus1>> mmDeactivationInstructionStatus = new MMMessageBuildingBlock<AgentCADeactivationStatusAdviceV01, List<CorporateActionDeactivationInstructionStatus1>>() {
		{
			xmlTag = "DeactvtnInstrSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeactivationInstructionStatus";
			definition = "Status of the deactivation instruction sent by the issuer (agent).";
			minOccurs = 1;
			complexType_lazy = () -> CorporateActionDeactivationInstructionStatus1.mmObject();
		}

		@Override
		public List<CorporateActionDeactivationInstructionStatus1> getValue(AgentCADeactivationStatusAdviceV01 obj) {
			return obj.getDeactivationInstructionStatus();
		}

		@Override
		public void setValue(AgentCADeactivationStatusAdviceV01 obj, List<CorporateActionDeactivationInstructionStatus1> value) {
			obj.setDeactivationInstructionStatus(value);
		}
	};
	@XmlElement(name = "DeactvtnCxlReqSts", required = true)
	protected CorporateActionDeactivationCancellationStatus1Choice deactivationCancellationRequestStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionDeactivationCancellationStatus1Choice
	 * CorporateActionDeactivationCancellationStatus1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DeactvtnCxlReqSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeactivationCancellationRequestStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Status of the deactivation cancellation request sent by the issuer (agent)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AgentCADeactivationStatusAdviceV01, CorporateActionDeactivationCancellationStatus1Choice> mmDeactivationCancellationRequestStatus = new MMMessageBuildingBlock<AgentCADeactivationStatusAdviceV01, CorporateActionDeactivationCancellationStatus1Choice>() {
		{
			xmlTag = "DeactvtnCxlReqSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeactivationCancellationRequestStatus";
			definition = "Status of the deactivation cancellation request sent by the issuer (agent).";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CorporateActionDeactivationCancellationStatus1Choice.mmObject();
		}

		@Override
		public CorporateActionDeactivationCancellationStatus1Choice getValue(AgentCADeactivationStatusAdviceV01 obj) {
			return obj.getDeactivationCancellationRequestStatus();
		}

		@Override
		public void setValue(AgentCADeactivationStatusAdviceV01 obj, CorporateActionDeactivationCancellationStatus1Choice value) {
			obj.setDeactivationCancellationRequestStatus(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintDeactivationInstructionStatusRule.forAgentCADeactivationStatusAdviceV01,
						com.tools20022.repository.constraints.ConstraintDeactivationCancellationRequestStatusRule.forAgentCADeactivationStatusAdviceV01);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AgentCADeactivationStatusAdviceV01";
				definition = "Scope\r\nThis message is sent by a CSD to an issuer (or its agent) to report the status, or a change in status, of a corporate action deactivation instruction or the status of a deactivation cancellation request.\r\nUsage\r\nThis message is used to provide a status on the deactivation instruction, especially to confirm the deactivation of a Corporate Action event or option.";
				messageSet_lazy = () -> Arrays.asList(IssuersAgentsCommunicationISOLatestversion.mmObject());
				xors_lazy = () -> Arrays.asList(com.tools20022.repository.area.seev.AgentCADeactivationStatusAdviceV01.DeactivationInstructionIDOrDeactivationCancellationRequestIDRule,
						com.tools20022.repository.area.seev.AgentCADeactivationStatusAdviceV01.DeactivationInstructionStatusOrDeactivationCancellationRequestStatusRule);
				rootElement = "Document";
				xmlTag = "AgtCADeactvtnStsAdvc";
				businessArea_lazy = () -> SecuritiesEventsLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.seev.AgentCADeactivationStatusAdviceV01.mmIdentification,
						com.tools20022.repository.area.seev.AgentCADeactivationStatusAdviceV01.mmAgentCADeactivationInstructionIdentification,
						com.tools20022.repository.area.seev.AgentCADeactivationStatusAdviceV01.mmAgentCADeactivationCancellationRequestIdentification,
						com.tools20022.repository.area.seev.AgentCADeactivationStatusAdviceV01.mmCorporateActionGeneralInformation, com.tools20022.repository.area.seev.AgentCADeactivationStatusAdviceV01.mmDeactivationInstructionStatus,
						com.tools20022.repository.area.seev.AgentCADeactivationStatusAdviceV01.mmDeactivationCancellationRequestStatus);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "seev";
						messageFunctionality = "030";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return AgentCADeactivationStatusAdviceV01.class;
			}
		});
		return mmObject_lazy.get();
	}

	public DocumentIdentification8 getIdentification() {
		return identification;
	}

	public AgentCADeactivationStatusAdviceV01 setIdentification(DocumentIdentification8 identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public DocumentIdentification8 getAgentCADeactivationInstructionIdentification() {
		return agentCADeactivationInstructionIdentification;
	}

	public AgentCADeactivationStatusAdviceV01 setAgentCADeactivationInstructionIdentification(DocumentIdentification8 agentCADeactivationInstructionIdentification) {
		this.agentCADeactivationInstructionIdentification = Objects.requireNonNull(agentCADeactivationInstructionIdentification);
		return this;
	}

	public DocumentIdentification8 getAgentCADeactivationCancellationRequestIdentification() {
		return agentCADeactivationCancellationRequestIdentification;
	}

	public AgentCADeactivationStatusAdviceV01 setAgentCADeactivationCancellationRequestIdentification(DocumentIdentification8 agentCADeactivationCancellationRequestIdentification) {
		this.agentCADeactivationCancellationRequestIdentification = Objects.requireNonNull(agentCADeactivationCancellationRequestIdentification);
		return this;
	}

	public CorporateActionInformation1 getCorporateActionGeneralInformation() {
		return corporateActionGeneralInformation;
	}

	public AgentCADeactivationStatusAdviceV01 setCorporateActionGeneralInformation(CorporateActionInformation1 corporateActionGeneralInformation) {
		this.corporateActionGeneralInformation = Objects.requireNonNull(corporateActionGeneralInformation);
		return this;
	}

	public List<CorporateActionDeactivationInstructionStatus1> getDeactivationInstructionStatus() {
		return deactivationInstructionStatus == null ? deactivationInstructionStatus = new ArrayList<>() : deactivationInstructionStatus;
	}

	public AgentCADeactivationStatusAdviceV01 setDeactivationInstructionStatus(List<CorporateActionDeactivationInstructionStatus1> deactivationInstructionStatus) {
		this.deactivationInstructionStatus = Objects.requireNonNull(deactivationInstructionStatus);
		return this;
	}

	public CorporateActionDeactivationCancellationStatus1Choice getDeactivationCancellationRequestStatus() {
		return deactivationCancellationRequestStatus;
	}

	public AgentCADeactivationStatusAdviceV01 setDeactivationCancellationRequestStatus(CorporateActionDeactivationCancellationStatus1Choice deactivationCancellationRequestStatus) {
		this.deactivationCancellationRequestStatus = Objects.requireNonNull(deactivationCancellationRequestStatus);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.030.001.01")
	static public class Document {
		@XmlElement(name = "AgtCADeactvtnStsAdvc", required = true)
		public AgentCADeactivationStatusAdviceV01 messageBody;
	}
}