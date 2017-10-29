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

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMXor;
import com.tools20022.repository.area.SecuritiesEventsLatestVersion;
import com.tools20022.repository.choice.CorporateActionMovementStatus1Choice;
import com.tools20022.repository.msg.CorporateActionInformation1;
import com.tools20022.repository.msg.CorporateMovementStatus2;
import com.tools20022.repository.msg.DocumentIdentification8;
import com.tools20022.repository.msgset.IssuersAgentsCommunicationISOLatestversion;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesEventsLatestVersion
 * SecuritiesEventsLatestVersion}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.IssuersAgentsCommunicationISOLatestversion
 * IssuersAgentsCommunicationISOLatestversion}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "AgtCAMvmntStsAdvc"</li>
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
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAMovementStatusAdviceV01#Identification
 * AgentCAMovementStatusAdviceV01.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAMovementStatusAdviceV01#AgentCAElectionStatusAdviceIdentification
 * AgentCAMovementStatusAdviceV01.AgentCAElectionStatusAdviceIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAMovementStatusAdviceV01#AgentCAGlobalDistributionStatusAdviceIdentification
 * AgentCAMovementStatusAdviceV01.
 * AgentCAGlobalDistributionStatusAdviceIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAMovementStatusAdviceV01#AgentCAMovementInstructionIdentification
 * AgentCAMovementStatusAdviceV01.AgentCAMovementInstructionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAMovementStatusAdviceV01#AgentCAMovementCancellationRequestIdentification
 * AgentCAMovementStatusAdviceV01.
 * AgentCAMovementCancellationRequestIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAMovementStatusAdviceV01#CorporateActionGeneralInformation
 * AgentCAMovementStatusAdviceV01.CorporateActionGeneralInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAMovementStatusAdviceV01#MovementStatusDetails
 * AgentCAMovementStatusAdviceV01.MovementStatusDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAMovementStatusAdviceV01#MovementCancellationStatusDetails
 * AgentCAMovementStatusAdviceV01.MovementCancellationStatusDetails}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} =
 * {@linkplain com.tools20022.repository.area.seev.AgentCAMovementStatusAdviceV01#identifier
 * AgentCAMovementStatusAdviceV01.identifier}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMXor#getImpactedMessageBuildingBlocks
	 * impactedMessageBuildingBlocks} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.AgentCAMovementStatusAdviceV01#AgentCAElectionStatusAdviceIdentification
	 * AgentCAMovementStatusAdviceV01.AgentCAElectionStatusAdviceIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.AgentCAMovementStatusAdviceV01#AgentCAGlobalDistributionStatusAdviceIdentification
	 * AgentCAMovementStatusAdviceV01.
	 * AgentCAGlobalDistributionStatusAdviceIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.AgentCAMovementStatusAdviceV01#AgentCAMovementInstructionIdentification
	 * AgentCAMovementStatusAdviceV01.AgentCAMovementInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.AgentCAMovementStatusAdviceV01#AgentCAMovementCancellationRequestIdentification
	 * AgentCAMovementStatusAdviceV01.
	 * AgentCAMovementCancellationRequestIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageDefinition
	 * messageDefinition} =
	 * {@linkplain com.tools20022.repository.area.seev.AgentCAMovementStatusAdviceV01
	 * AgentCAMovementStatusAdviceV01}</li>
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
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusIdentificationRule";
			definition = "Either AgentCAElectionStatusAdviceIdentification or AgentCAGlobalDistributionStatusAdviceIdentification or AgentCAMovementInstructionIdentification or AgentCAMovementCancellationRequestIdentification must be present.";
			messageDefinition_lazy = () -> AgentCAMovementStatusAdviceV01.mmObject();
			impactedMessageBuildingBlocks_lazy = () -> Arrays.asList(com.tools20022.repository.area.seev.AgentCAMovementStatusAdviceV01.AgentCAElectionStatusAdviceIdentification,
					com.tools20022.repository.area.seev.AgentCAMovementStatusAdviceV01.AgentCAGlobalDistributionStatusAdviceIdentification,
					com.tools20022.repository.area.seev.AgentCAMovementStatusAdviceV01.AgentCAMovementInstructionIdentification,
					com.tools20022.repository.area.seev.AgentCAMovementStatusAdviceV01.AgentCAMovementCancellationRequestIdentification);
		}
	};
	/**
	 * Either MovementStatusDetails or MovementCancellationStatusDetails must be
	 * present but not both.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMXor#getImpactedMessageBuildingBlocks
	 * impactedMessageBuildingBlocks} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.AgentCAMovementStatusAdviceV01#MovementStatusDetails
	 * AgentCAMovementStatusAdviceV01.MovementStatusDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.AgentCAMovementStatusAdviceV01#MovementCancellationStatusDetails
	 * AgentCAMovementStatusAdviceV01.MovementCancellationStatusDetails}</li>
	 * </ul>
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageDefinition
	 * messageDefinition} =
	 * {@linkplain com.tools20022.repository.area.seev.AgentCAMovementStatusAdviceV01
	 * AgentCAMovementStatusAdviceV01}</li>
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
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MovementStatusDetailsOrMovementCancellationStatusDetailsRule";
			definition = "Either MovementStatusDetails or MovementCancellationStatusDetails must be present but not both.";
			messageDefinition_lazy = () -> AgentCAMovementStatusAdviceV01.mmObject();
			impactedMessageBuildingBlocks_lazy = () -> Arrays.asList(com.tools20022.repository.area.seev.AgentCAMovementStatusAdviceV01.MovementStatusDetails,
					com.tools20022.repository.area.seev.AgentCAMovementStatusAdviceV01.MovementCancellationStatusDetails);
		}
	};
	/**
	 * Identification assigned by the Sender to unambiguously identify the
	 * status advice.
	 * <p>
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
	public static final MMMessageBuildingBlock Identification = new MMMessageBuildingBlock() {
		{
			xmlTag = "Id";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Identification assigned by the Sender to unambiguously identify the status advice.";
			minOccurs = 1;
			maxOccurs = 1;
			complexType_lazy = () -> DocumentIdentification8.mmObject();
		}
	};
	/**
	 * Identification of the Agent Corporate Action Election Status Advice.
	 * <p>
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
	public static final MMMessageBuildingBlock AgentCAElectionStatusAdviceIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "AgtCAElctnStsAdvcId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgentCAElectionStatusAdviceIdentification";
			definition = "Identification of the Agent Corporate Action Election Status Advice.";
			minOccurs = 1;
			maxOccurs = 1;
			complexType_lazy = () -> DocumentIdentification8.mmObject();
		}
	};
	/**
	 * Identification of the Agent Corporate Action Global Distribution Status
	 * Advice.
	 * <p>
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
	public static final MMMessageBuildingBlock AgentCAGlobalDistributionStatusAdviceIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "AgtCAGblDstrbtnStsAdvcId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgentCAGlobalDistributionStatusAdviceIdentification";
			definition = "Identification of the Agent Corporate Action Global Distribution Status Advice.";
			minOccurs = 1;
			maxOccurs = 1;
			complexType_lazy = () -> DocumentIdentification8.mmObject();
		}
	};
	/**
	 * Identification of the linked Agent CA Movement Instruction for which a
	 * status is given.
	 * <p>
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
	public static final MMMessageBuildingBlock AgentCAMovementInstructionIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "AgtCAMvmntInstrId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgentCAMovementInstructionIdentification";
			definition = "Identification of the linked Agent CA Movement Instruction for which a status is given.";
			minOccurs = 1;
			maxOccurs = 1;
			complexType_lazy = () -> DocumentIdentification8.mmObject();
		}
	};
	/**
	 * Identification of the linked Agent CA Movement Cancellation Request for
	 * which a status is given.
	 * <p>
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
	public static final MMMessageBuildingBlock AgentCAMovementCancellationRequestIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "AgtCAMvmntCxlReqId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgentCAMovementCancellationRequestIdentification";
			definition = "Identification of the linked Agent CA Movement Cancellation Request for which a status is given.";
			minOccurs = 1;
			maxOccurs = 1;
			complexType_lazy = () -> DocumentIdentification8.mmObject();
		}
	};
	/**
	 * General information about the corporate action event.
	 * <p>
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
	public static final MMMessageBuildingBlock CorporateActionGeneralInformation = new MMMessageBuildingBlock() {
		{
			xmlTag = "CorpActnGnlInf";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionGeneralInformation";
			definition = "General information about the corporate action event.";
			minOccurs = 1;
			maxOccurs = 1;
			complexType_lazy = () -> CorporateActionInformation1.mmObject();
		}
	};
	/**
	 * Status of the movement instruction.
	 * <p>
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
	public static final MMMessageBuildingBlock MovementStatusDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "MvmntStsDtls";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MovementStatusDetails";
			definition = "Status of the movement instruction.";
			minOccurs = 1;
			maxOccurs = 1;
			complexType_lazy = () -> CorporateActionMovementStatus1Choice.mmObject();
		}
	};
	/**
	 * Status of the movement cancellation request.
	 * <p>
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
	public static final MMMessageBuildingBlock MovementCancellationStatusDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "MvmntCxlStsDtls";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MovementCancellationStatusDetails";
			definition = "Status of the movement cancellation request.";
			minOccurs = 1;
			maxOccurs = 1;
			complexType_lazy = () -> CorporateMovementStatus2.mmObject();
		}
	};
	/**
	 * An instance of MessageDefinitionIdentifier.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageDefinitionIdentifier#getVersion
	 * version} = "01"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageDefinitionIdentifier#getBusinessArea
	 * businessArea} = "seev"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageDefinitionIdentifier#getMessageFunctionality
	 * messageFunctionality} = "022"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageDefinitionIdentifier#getFlavour
	 * flavour} = "001"</li>
	 * </ul>
	 */
	public static final MMMessageDefinitionIdentifier identifier = new MMMessageDefinitionIdentifier() {
		{
			businessArea = "seev";
			messageFunctionality = "022";
			version = "01";
			flavour = "001";
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "AgentCAMovementStatusAdviceV01";
				definition = "Scope\r\nThis message is sent by a CSD to an issuer (or its agent) to report the status, or a change in status, of\r\n- a global distribution status advice released by an issuer (or its agent);\r\n- a movement instruction released by an issuer (or its agent);\r\n- a movement cancellation request sent by the issuer (or its agent); and\r\n- the non-settlement of the movements at the CSD.\r\nUsage\r\nThis message is used to report the status of:\r\n- the movements resulting from a movement instruction message, in which case, the Agent Corporate Action Movement Instruction Identification must be present;\r\n- the movements resulting from a global distribution status advice message (with the status, authorised), in which case, the Agent Corporate Action Global Distribution Status Advice Identification must be present;\r\n- the movement cancellation request, in which case, the Agent Corporate Action Movement Cancellation Request Identification must be present; and\r\n- the movements resulting from an election status advice (if the status of the election advice is rejected or if the status of the election cancellation request or amendment request is accepted) in case there is a settlement problem. The Election Status Advice Identification must be present.\r\nIn the case of a failed settlement, the message contains details of the movement, such as account details, securities or cash information and the reason of the failure.\r\nThis message should not be used to provide the confirmation of the settlement; the Agent Corporate Action Movement Confirmation message should be used instead.";
				messageSet_lazy = () -> Arrays.asList(IssuersAgentsCommunicationISOLatestversion.mmObject());
				xors_lazy = () -> Arrays.asList(com.tools20022.repository.area.seev.AgentCAMovementStatusAdviceV01.StatusIdentificationRule,
						com.tools20022.repository.area.seev.AgentCAMovementStatusAdviceV01.MovementStatusDetailsOrMovementCancellationStatusDetailsRule);
				rootElement = "Document";
				xmlTag = "AgtCAMvmntStsAdvc";
				businessArea_lazy = () -> SecuritiesEventsLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.seev.AgentCAMovementStatusAdviceV01.Identification,
						com.tools20022.repository.area.seev.AgentCAMovementStatusAdviceV01.AgentCAElectionStatusAdviceIdentification,
						com.tools20022.repository.area.seev.AgentCAMovementStatusAdviceV01.AgentCAGlobalDistributionStatusAdviceIdentification,
						com.tools20022.repository.area.seev.AgentCAMovementStatusAdviceV01.AgentCAMovementInstructionIdentification,
						com.tools20022.repository.area.seev.AgentCAMovementStatusAdviceV01.AgentCAMovementCancellationRequestIdentification,
						com.tools20022.repository.area.seev.AgentCAMovementStatusAdviceV01.CorporateActionGeneralInformation, com.tools20022.repository.area.seev.AgentCAMovementStatusAdviceV01.MovementStatusDetails,
						com.tools20022.repository.area.seev.AgentCAMovementStatusAdviceV01.MovementCancellationStatusDetails);
				messageDefinitionIdentifier_lazy = () -> com.tools20022.repository.area.seev.AgentCAMovementStatusAdviceV01.identifier;
			}
		});
		return mmObject_lazy.get();
	}
}