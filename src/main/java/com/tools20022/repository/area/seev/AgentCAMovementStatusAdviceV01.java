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
import com.tools20022.repository.choice.CorporateActionMovementStatus1Choice;
import com.tools20022.repository.msg.CorporateActionInformation1;
import com.tools20022.repository.msg.CorporateMovementStatus2;
import com.tools20022.repository.msg.DocumentIdentification8;
import com.tools20022.repository.msgset.IssuersAgentsCommunicationISOLatestversion;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * This message is sent by a CSD to an issuer (or its agent) to report the
 * status, or a change in status, of<br>
 * - a global distribution status advice released by an issuer (or its agent);<br>
 * - a movement instruction released by an issuer (or its agent);<br>
 * - a movement cancellation request sent by the issuer (or its agent); and<br>
 * - the non-settlement of the movements at the CSD.<br>
 * <b>Usage</b><br>
 * This message is used to report the status of:<br>
 * - the movements resulting from a movement instruction message, in which case,
 * the Agent Corporate Action Movement Instruction Identification must be
 * present;<br>
 * - the movements resulting from a global distribution status advice message
 * (with the status, authorised), in which case, the Agent Corporate Action
 * Global Distribution Status Advice Identification must be present;<br>
 * - the movement cancellation request, in which case, the Agent Corporate
 * Action Movement Cancellation Request Identification must be present; and<br>
 * - the movements resulting from an election status advice (if the status of
 * the election advice is rejected or if the status of the election cancellation
 * request or amendment request is accepted) in case there is a settlement
 * problem. The Election Status Advice Identification must be present.<br>
 * In the case of a failed settlement, the message contains details of the
 * movement, such as account details, securities or cash information and the
 * reason of the failure.<br>
 * This message should not be used to provide the confirmation of the
 * settlement; the Agent Corporate Action Movement Confirmation message should
 * be used instead.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAMovementStatusAdviceV01#StatusIdentificationRule
 * AgentCAMovementStatusAdviceV01.StatusIdentificationRule}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAMovementStatusAdviceV01#MovementStatusDetailsOrMovementCancellationStatusDetailsRule
 * AgentCAMovementStatusAdviceV01.
 * MovementStatusDetailsOrMovementCancellationStatusDetailsRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
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
 * {@linkplain com.tools20022.repository.area.seev.AgentCAMovementStatusAdviceV01#mmCorporateActionGeneralInformation
 * AgentCAMovementStatusAdviceV01.mmCorporateActionGeneralInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAMovementStatusAdviceV01#mmMovementStatusDetails
 * AgentCAMovementStatusAdviceV01.mmMovementStatusDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAMovementStatusAdviceV01#mmMovementCancellationStatusDetails
 * AgentCAMovementStatusAdviceV01.mmMovementCancellationStatusDetails}</li>
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
 * xmlTag} = "AgtCAMvmntStsAdvc"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesEventsLatestVersion
 * SecuritiesEventsLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code seev.022.001.01}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintMovementStatusDetailsRule#for_seev_AgentCAMovementStatusAdviceV01
 * ConstraintMovementStatusDetailsRule.for_seev_AgentCAMovementStatusAdviceV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintMovementCancellationStatusDetailsRule#for_seev_AgentCAMovementStatusAdviceV01
 * ConstraintMovementCancellationStatusDetailsRule.
 * for_seev_AgentCAMovementStatusAdviceV01}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AgentCAMovementStatusAdviceV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThis message is sent by a CSD to an issuer (or its agent) to report the status, or a change in status, of\r\n- a global distribution status advice released by an issuer (or its agent);\r\n- a movement instruction released by an issuer (or its agent);\r\n- a movement cancellation request sent by the issuer (or its agent); and\r\n- the non-settlement of the movements at the CSD.\r\nUsage\r\nThis message is used to report the status of:\r\n- the movements resulting from a movement instruction message, in which case, the Agent Corporate Action Movement Instruction Identification must be present;\r\n- the movements resulting from a global distribution status advice message (with the status, authorised), in which case, the Agent Corporate Action Global Distribution Status Advice Identification must be present;\r\n- the movement cancellation request, in which case, the Agent Corporate Action Movement Cancellation Request Identification must be present; and\r\n- the movements resulting from an election status advice (if the status of the election advice is rejected or if the status of the election cancellation request or amendment request is accepted) in case there is a settlement problem. The Election Status Advice Identification must be present.\r\nIn the case of a failed settlement, the message contains details of the movement, such as account details, securities or cash information and the reason of the failure.\r\nThis message should not be used to provide the confirmation of the settlement; the Agent Corporate Action Movement Confirmation message should be used instead."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AgentCAMovementStatusAdviceV01", propOrder = {"identification", "agentCAElectionStatusAdviceIdentification", "agentCAGlobalDistributionStatusAdviceIdentification", "agentCAMovementInstructionIdentification",
		"agentCAMovementCancellationRequestIdentification", "corporateActionGeneralInformation", "movementStatusDetails", "movementCancellationStatusDetails"})
public class AgentCAMovementStatusAdviceV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	/**
	 * Either AgentCAElectionStatusAdviceIdentification or
	 * AgentCAGlobalDistributionStatusAdviceIdentification or
	 * AgentCAMovementInstructionIdentification or
	 * AgentCAMovementCancellationRequestIdentification must be present.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageDefinition
	 * messageDefinition} =
	 * {@linkplain com.tools20022.repository.area.seev.AgentCAMovementStatusAdviceV01
	 * AgentCAMovementStatusAdviceV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMXor#getImpactedMessageBuildingBlocks
	 * impactedMessageBuildingBlocks} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.AgentCAMovementStatusAdviceV01#mmAgentCAElectionStatusAdviceIdentification
	 * AgentCAMovementStatusAdviceV01.
	 * mmAgentCAElectionStatusAdviceIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.AgentCAMovementStatusAdviceV01#mmAgentCAGlobalDistributionStatusAdviceIdentification
	 * AgentCAMovementStatusAdviceV01.
	 * mmAgentCAGlobalDistributionStatusAdviceIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.AgentCAMovementStatusAdviceV01#mmAgentCAMovementInstructionIdentification
	 * AgentCAMovementStatusAdviceV01.mmAgentCAMovementInstructionIdentification
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.AgentCAMovementStatusAdviceV01#mmAgentCAMovementCancellationRequestIdentification
	 * AgentCAMovementStatusAdviceV01.
	 * mmAgentCAMovementCancellationRequestIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either AgentCAElectionStatusAdviceIdentification or AgentCAGlobalDistributionStatusAdviceIdentification or AgentCAMovementInstructionIdentification or AgentCAMovementCancellationRequestIdentification must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMXor StatusIdentificationRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusIdentificationRule";
			definition = "Either AgentCAElectionStatusAdviceIdentification or AgentCAGlobalDistributionStatusAdviceIdentification or AgentCAMovementInstructionIdentification or AgentCAMovementCancellationRequestIdentification must be present.";
			impactedMessageBuildingBlocks_lazy = () -> Arrays.asList(com.tools20022.repository.area.seev.AgentCAMovementStatusAdviceV01.mmAgentCAElectionStatusAdviceIdentification,
					com.tools20022.repository.area.seev.AgentCAMovementStatusAdviceV01.mmAgentCAGlobalDistributionStatusAdviceIdentification,
					com.tools20022.repository.area.seev.AgentCAMovementStatusAdviceV01.mmAgentCAMovementInstructionIdentification,
					com.tools20022.repository.area.seev.AgentCAMovementStatusAdviceV01.mmAgentCAMovementCancellationRequestIdentification);
			messageDefinition_lazy = () -> com.tools20022.repository.area.seev.AgentCAMovementStatusAdviceV01.mmObject();
		}
	};
	/**
	 * Either MovementStatusDetails or MovementCancellationStatusDetails must be
	 * present but not both.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageDefinition
	 * messageDefinition} =
	 * {@linkplain com.tools20022.repository.area.seev.AgentCAMovementStatusAdviceV01
	 * AgentCAMovementStatusAdviceV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMXor#getImpactedMessageBuildingBlocks
	 * impactedMessageBuildingBlocks} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.AgentCAMovementStatusAdviceV01#mmMovementStatusDetails
	 * AgentCAMovementStatusAdviceV01.mmMovementStatusDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.AgentCAMovementStatusAdviceV01#mmMovementCancellationStatusDetails
	 * AgentCAMovementStatusAdviceV01.mmMovementCancellationStatusDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MovementStatusDetailsOrMovementCancellationStatusDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either MovementStatusDetails or MovementCancellationStatusDetails must be present but not both."
	 * </li>
	 * </ul>
	 */
	public static final MMXor MovementStatusDetailsOrMovementCancellationStatusDetailsRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MovementStatusDetailsOrMovementCancellationStatusDetailsRule";
			definition = "Either MovementStatusDetails or MovementCancellationStatusDetails must be present but not both.";
			impactedMessageBuildingBlocks_lazy = () -> Arrays.asList(com.tools20022.repository.area.seev.AgentCAMovementStatusAdviceV01.mmMovementStatusDetails,
					com.tools20022.repository.area.seev.AgentCAMovementStatusAdviceV01.mmMovementCancellationStatusDetails);
			messageDefinition_lazy = () -> com.tools20022.repository.area.seev.AgentCAMovementStatusAdviceV01.mmObject();
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
	public static final MMMessageBuildingBlock<AgentCAMovementStatusAdviceV01, DocumentIdentification8> mmIdentification = new MMMessageBuildingBlock<AgentCAMovementStatusAdviceV01, DocumentIdentification8>() {
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
		public DocumentIdentification8 getValue(AgentCAMovementStatusAdviceV01 obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(AgentCAMovementStatusAdviceV01 obj, DocumentIdentification8 value) {
			obj.setIdentification(value);
		}
	};
	@XmlElement(name = "AgtCAElctnStsAdvcId", required = true)
	protected DocumentIdentification8 agentCAElectionStatusAdviceIdentification;
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
	 * xmlTag} = "AgtCAElctnStsAdvcId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgentCAElectionStatusAdviceIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the Agent Corporate Action Election Status Advice."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AgentCAMovementStatusAdviceV01, DocumentIdentification8> mmAgentCAElectionStatusAdviceIdentification = new MMMessageBuildingBlock<AgentCAMovementStatusAdviceV01, DocumentIdentification8>() {
		{
			xmlTag = "AgtCAElctnStsAdvcId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgentCAElectionStatusAdviceIdentification";
			definition = "Identification of the Agent Corporate Action Election Status Advice.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DocumentIdentification8.mmObject();
		}

		@Override
		public DocumentIdentification8 getValue(AgentCAMovementStatusAdviceV01 obj) {
			return obj.getAgentCAElectionStatusAdviceIdentification();
		}

		@Override
		public void setValue(AgentCAMovementStatusAdviceV01 obj, DocumentIdentification8 value) {
			obj.setAgentCAElectionStatusAdviceIdentification(value);
		}
	};
	@XmlElement(name = "AgtCAGblDstrbtnStsAdvcId", required = true)
	protected DocumentIdentification8 agentCAGlobalDistributionStatusAdviceIdentification;
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
	 * xmlTag} = "AgtCAGblDstrbtnStsAdvcId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgentCAGlobalDistributionStatusAdviceIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the Agent Corporate Action Global Distribution Status Advice."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AgentCAMovementStatusAdviceV01, DocumentIdentification8> mmAgentCAGlobalDistributionStatusAdviceIdentification = new MMMessageBuildingBlock<AgentCAMovementStatusAdviceV01, DocumentIdentification8>() {
		{
			xmlTag = "AgtCAGblDstrbtnStsAdvcId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgentCAGlobalDistributionStatusAdviceIdentification";
			definition = "Identification of the Agent Corporate Action Global Distribution Status Advice.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DocumentIdentification8.mmObject();
		}

		@Override
		public DocumentIdentification8 getValue(AgentCAMovementStatusAdviceV01 obj) {
			return obj.getAgentCAGlobalDistributionStatusAdviceIdentification();
		}

		@Override
		public void setValue(AgentCAMovementStatusAdviceV01 obj, DocumentIdentification8 value) {
			obj.setAgentCAGlobalDistributionStatusAdviceIdentification(value);
		}
	};
	@XmlElement(name = "AgtCAMvmntInstrId", required = true)
	protected DocumentIdentification8 agentCAMovementInstructionIdentification;
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
	 * xmlTag} = "AgtCAMvmntInstrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgentCAMovementInstructionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the linked Agent CA Movement Instruction for which a status is given."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AgentCAMovementStatusAdviceV01, DocumentIdentification8> mmAgentCAMovementInstructionIdentification = new MMMessageBuildingBlock<AgentCAMovementStatusAdviceV01, DocumentIdentification8>() {
		{
			xmlTag = "AgtCAMvmntInstrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgentCAMovementInstructionIdentification";
			definition = "Identification of the linked Agent CA Movement Instruction for which a status is given.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DocumentIdentification8.mmObject();
		}

		@Override
		public DocumentIdentification8 getValue(AgentCAMovementStatusAdviceV01 obj) {
			return obj.getAgentCAMovementInstructionIdentification();
		}

		@Override
		public void setValue(AgentCAMovementStatusAdviceV01 obj, DocumentIdentification8 value) {
			obj.setAgentCAMovementInstructionIdentification(value);
		}
	};
	@XmlElement(name = "AgtCAMvmntCxlReqId", required = true)
	protected DocumentIdentification8 agentCAMovementCancellationRequestIdentification;
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
	 * xmlTag} = "AgtCAMvmntCxlReqId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgentCAMovementCancellationRequestIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the linked Agent CA Movement Cancellation Request for which a status is given."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AgentCAMovementStatusAdviceV01, DocumentIdentification8> mmAgentCAMovementCancellationRequestIdentification = new MMMessageBuildingBlock<AgentCAMovementStatusAdviceV01, DocumentIdentification8>() {
		{
			xmlTag = "AgtCAMvmntCxlReqId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgentCAMovementCancellationRequestIdentification";
			definition = "Identification of the linked Agent CA Movement Cancellation Request for which a status is given.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DocumentIdentification8.mmObject();
		}

		@Override
		public DocumentIdentification8 getValue(AgentCAMovementStatusAdviceV01 obj) {
			return obj.getAgentCAMovementCancellationRequestIdentification();
		}

		@Override
		public void setValue(AgentCAMovementStatusAdviceV01 obj, DocumentIdentification8 value) {
			obj.setAgentCAMovementCancellationRequestIdentification(value);
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
	public static final MMMessageBuildingBlock<AgentCAMovementStatusAdviceV01, CorporateActionInformation1> mmCorporateActionGeneralInformation = new MMMessageBuildingBlock<AgentCAMovementStatusAdviceV01, CorporateActionInformation1>() {
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
		public CorporateActionInformation1 getValue(AgentCAMovementStatusAdviceV01 obj) {
			return obj.getCorporateActionGeneralInformation();
		}

		@Override
		public void setValue(AgentCAMovementStatusAdviceV01 obj, CorporateActionInformation1 value) {
			obj.setCorporateActionGeneralInformation(value);
		}
	};
	@XmlElement(name = "MvmntStsDtls", required = true)
	protected CorporateActionMovementStatus1Choice movementStatusDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionMovementStatus1Choice
	 * CorporateActionMovementStatus1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MvmntStsDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MovementStatusDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of the movement instruction."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AgentCAMovementStatusAdviceV01, CorporateActionMovementStatus1Choice> mmMovementStatusDetails = new MMMessageBuildingBlock<AgentCAMovementStatusAdviceV01, CorporateActionMovementStatus1Choice>() {
		{
			xmlTag = "MvmntStsDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MovementStatusDetails";
			definition = "Status of the movement instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CorporateActionMovementStatus1Choice.mmObject();
		}

		@Override
		public CorporateActionMovementStatus1Choice getValue(AgentCAMovementStatusAdviceV01 obj) {
			return obj.getMovementStatusDetails();
		}

		@Override
		public void setValue(AgentCAMovementStatusAdviceV01 obj, CorporateActionMovementStatus1Choice value) {
			obj.setMovementStatusDetails(value);
		}
	};
	@XmlElement(name = "MvmntCxlStsDtls", required = true)
	protected CorporateMovementStatus2 movementCancellationStatusDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CorporateMovementStatus2
	 * CorporateMovementStatus2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MvmntCxlStsDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MovementCancellationStatusDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of the movement cancellation request."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AgentCAMovementStatusAdviceV01, CorporateMovementStatus2> mmMovementCancellationStatusDetails = new MMMessageBuildingBlock<AgentCAMovementStatusAdviceV01, CorporateMovementStatus2>() {
		{
			xmlTag = "MvmntCxlStsDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MovementCancellationStatusDetails";
			definition = "Status of the movement cancellation request.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CorporateMovementStatus2.mmObject();
		}

		@Override
		public CorporateMovementStatus2 getValue(AgentCAMovementStatusAdviceV01 obj) {
			return obj.getMovementCancellationStatusDetails();
		}

		@Override
		public void setValue(AgentCAMovementStatusAdviceV01 obj, CorporateMovementStatus2 value) {
			obj.setMovementCancellationStatusDetails(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintMovementStatusDetailsRule.for_seev_AgentCAMovementStatusAdviceV01,
						com.tools20022.repository.constraints.ConstraintMovementCancellationStatusDetailsRule.for_seev_AgentCAMovementStatusAdviceV01);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AgentCAMovementStatusAdviceV01";
				definition = "Scope\r\nThis message is sent by a CSD to an issuer (or its agent) to report the status, or a change in status, of\r\n- a global distribution status advice released by an issuer (or its agent);\r\n- a movement instruction released by an issuer (or its agent);\r\n- a movement cancellation request sent by the issuer (or its agent); and\r\n- the non-settlement of the movements at the CSD.\r\nUsage\r\nThis message is used to report the status of:\r\n- the movements resulting from a movement instruction message, in which case, the Agent Corporate Action Movement Instruction Identification must be present;\r\n- the movements resulting from a global distribution status advice message (with the status, authorised), in which case, the Agent Corporate Action Global Distribution Status Advice Identification must be present;\r\n- the movement cancellation request, in which case, the Agent Corporate Action Movement Cancellation Request Identification must be present; and\r\n- the movements resulting from an election status advice (if the status of the election advice is rejected or if the status of the election cancellation request or amendment request is accepted) in case there is a settlement problem. The Election Status Advice Identification must be present.\r\nIn the case of a failed settlement, the message contains details of the movement, such as account details, securities or cash information and the reason of the failure.\r\nThis message should not be used to provide the confirmation of the settlement; the Agent Corporate Action Movement Confirmation message should be used instead.";
				messageSet_lazy = () -> Arrays.asList(IssuersAgentsCommunicationISOLatestversion.mmObject());
				xors_lazy = () -> Arrays.asList(com.tools20022.repository.area.seev.AgentCAMovementStatusAdviceV01.StatusIdentificationRule,
						com.tools20022.repository.area.seev.AgentCAMovementStatusAdviceV01.MovementStatusDetailsOrMovementCancellationStatusDetailsRule);
				rootElement = "Document";
				xmlTag = "AgtCAMvmntStsAdvc";
				businessArea_lazy = () -> SecuritiesEventsLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.seev.AgentCAMovementStatusAdviceV01.mmIdentification,
						com.tools20022.repository.area.seev.AgentCAMovementStatusAdviceV01.mmAgentCAElectionStatusAdviceIdentification,
						com.tools20022.repository.area.seev.AgentCAMovementStatusAdviceV01.mmAgentCAGlobalDistributionStatusAdviceIdentification,
						com.tools20022.repository.area.seev.AgentCAMovementStatusAdviceV01.mmAgentCAMovementInstructionIdentification,
						com.tools20022.repository.area.seev.AgentCAMovementStatusAdviceV01.mmAgentCAMovementCancellationRequestIdentification,
						com.tools20022.repository.area.seev.AgentCAMovementStatusAdviceV01.mmCorporateActionGeneralInformation, com.tools20022.repository.area.seev.AgentCAMovementStatusAdviceV01.mmMovementStatusDetails,
						com.tools20022.repository.area.seev.AgentCAMovementStatusAdviceV01.mmMovementCancellationStatusDetails);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "seev";
						messageFunctionality = "022";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return AgentCAMovementStatusAdviceV01.class;
			}
		});
		return mmObject_lazy.get();
	}

	public DocumentIdentification8 getIdentification() {
		return identification;
	}

	public AgentCAMovementStatusAdviceV01 setIdentification(DocumentIdentification8 identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public DocumentIdentification8 getAgentCAElectionStatusAdviceIdentification() {
		return agentCAElectionStatusAdviceIdentification;
	}

	public AgentCAMovementStatusAdviceV01 setAgentCAElectionStatusAdviceIdentification(DocumentIdentification8 agentCAElectionStatusAdviceIdentification) {
		this.agentCAElectionStatusAdviceIdentification = Objects.requireNonNull(agentCAElectionStatusAdviceIdentification);
		return this;
	}

	public DocumentIdentification8 getAgentCAGlobalDistributionStatusAdviceIdentification() {
		return agentCAGlobalDistributionStatusAdviceIdentification;
	}

	public AgentCAMovementStatusAdviceV01 setAgentCAGlobalDistributionStatusAdviceIdentification(DocumentIdentification8 agentCAGlobalDistributionStatusAdviceIdentification) {
		this.agentCAGlobalDistributionStatusAdviceIdentification = Objects.requireNonNull(agentCAGlobalDistributionStatusAdviceIdentification);
		return this;
	}

	public DocumentIdentification8 getAgentCAMovementInstructionIdentification() {
		return agentCAMovementInstructionIdentification;
	}

	public AgentCAMovementStatusAdviceV01 setAgentCAMovementInstructionIdentification(DocumentIdentification8 agentCAMovementInstructionIdentification) {
		this.agentCAMovementInstructionIdentification = Objects.requireNonNull(agentCAMovementInstructionIdentification);
		return this;
	}

	public DocumentIdentification8 getAgentCAMovementCancellationRequestIdentification() {
		return agentCAMovementCancellationRequestIdentification;
	}

	public AgentCAMovementStatusAdviceV01 setAgentCAMovementCancellationRequestIdentification(DocumentIdentification8 agentCAMovementCancellationRequestIdentification) {
		this.agentCAMovementCancellationRequestIdentification = Objects.requireNonNull(agentCAMovementCancellationRequestIdentification);
		return this;
	}

	public CorporateActionInformation1 getCorporateActionGeneralInformation() {
		return corporateActionGeneralInformation;
	}

	public AgentCAMovementStatusAdviceV01 setCorporateActionGeneralInformation(CorporateActionInformation1 corporateActionGeneralInformation) {
		this.corporateActionGeneralInformation = Objects.requireNonNull(corporateActionGeneralInformation);
		return this;
	}

	public CorporateActionMovementStatus1Choice getMovementStatusDetails() {
		return movementStatusDetails;
	}

	public AgentCAMovementStatusAdviceV01 setMovementStatusDetails(CorporateActionMovementStatus1Choice movementStatusDetails) {
		this.movementStatusDetails = Objects.requireNonNull(movementStatusDetails);
		return this;
	}

	public CorporateMovementStatus2 getMovementCancellationStatusDetails() {
		return movementCancellationStatusDetails;
	}

	public AgentCAMovementStatusAdviceV01 setMovementCancellationStatusDetails(CorporateMovementStatus2 movementCancellationStatusDetails) {
		this.movementCancellationStatusDetails = Objects.requireNonNull(movementCancellationStatusDetails);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.022.001.01")
	static public class Document {
		@XmlElement(name = "AgtCAMvmntStsAdvc", required = true)
		public AgentCAMovementStatusAdviceV01 messageBody;
	}
}