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
import com.tools20022.repository.choice.ElectionAdviceStatus1Choice;
import com.tools20022.repository.choice.ElectionAmendmentStatus1Choice;
import com.tools20022.repository.choice.ElectionCancellationStatus1Choice;
import com.tools20022.repository.msg.CorporateActionInformation1;
import com.tools20022.repository.msg.DocumentIdentification8;
import com.tools20022.repository.msgset.IssuersAgentsCommunicationISOLatestversion;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * <b>Scope</b><br>
 * This message is sent by an issuer (or its agent) to the CSD to report the
 * status, or a change in status, of:<br>
 * - a corporate action election advice;<br>
 * - an election cancellation request; or<br>
 * - an election amendment request.<br>
 * <b>Usage</b><br>
 * This message must be sent in response to an:<br>
 * - Agent Corporation Action Election Advice to provide the status of an
 * election advice in the case of a rejection. However, it may also be used in
 * all other situations, in which case, the building blocks Election Advice
 * Identification and the Election Advice Status must be present.<br>
 * - Agent Corporation Action Election Cancellation Request to provide the
 * status of the cancellation request, in which case, the building blocks
 * Election Cancellation Request Identification and the Election Cancellation
 * Request Status must be present.<br>
 * - Agent Corporation Action Election Amendment Request to provide the status
 * of the amendment request, in which case, the building blocks Election
 * Amendment Request Identification and the Election Amendment Request Status
 * must be present.
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
 * xmlTag} = "AgtCAElctnStsAdvc"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAElectionStatusAdviceV01#ElectionAdviceIDOrElectionCancellationRequestIDOrElectionAmendmentRequestIDRule
 * AgentCAElectionStatusAdviceV01.
 * ElectionAdviceIDOrElectionCancellationRequestIDOrElectionAmendmentRequestIDRule
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAElectionStatusAdviceV01#ElectionAdviceStatusOrCancellationRequestStatusOrAmendmentRequestStatusRule
 * AgentCAElectionStatusAdviceV01.
 * ElectionAdviceStatusOrCancellationRequestStatusOrAmendmentRequestStatusRule}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAElectionStatusAdviceV01#Identification
 * AgentCAElectionStatusAdviceV01.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAElectionStatusAdviceV01#AgentCAElectionAdviceIdentification
 * AgentCAElectionStatusAdviceV01.AgentCAElectionAdviceIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAElectionStatusAdviceV01#AgentCAElectionCancellationRequestIdentification
 * AgentCAElectionStatusAdviceV01.
 * AgentCAElectionCancellationRequestIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAElectionStatusAdviceV01#AgentCAElectionAmendmentRequestIdentification
 * AgentCAElectionStatusAdviceV01.AgentCAElectionAmendmentRequestIdentification}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAElectionStatusAdviceV01#CorporateActionGeneralInformation
 * AgentCAElectionStatusAdviceV01.CorporateActionGeneralInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAElectionStatusAdviceV01#ElectionAdviceStatus
 * AgentCAElectionStatusAdviceV01.ElectionAdviceStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAElectionStatusAdviceV01#ElectionCancellationRequestStatus
 * AgentCAElectionStatusAdviceV01.ElectionCancellationRequestStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAElectionStatusAdviceV01#ElectionAmendmentRequestStatus
 * AgentCAElectionStatusAdviceV01.ElectionAmendmentRequestStatus}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} =
 * {@linkplain com.tools20022.repository.area.seev.AgentCAElectionStatusAdviceV01#identifier
 * AgentCAElectionStatusAdviceV01.identifier}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AgentCAElectionStatusAdviceV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThis message is sent by an issuer (or its agent) to the CSD to report the status, or a change in status, of:\r\n- a corporate action election advice;\r\n- an election cancellation request; or\r\n- an election amendment request.\r\nUsage\r\nThis message must be sent in response to an:\r\n- Agent Corporation Action Election Advice to provide the status of an election advice in the case of a rejection. However, it may also be used in all other situations, in which case, the building blocks Election Advice Identification and the Election Advice Status must be present.\r\n- Agent Corporation Action Election Cancellation Request to provide the status of the cancellation request, in which case, the building blocks Election Cancellation Request Identification and the Election Cancellation Request Status must be present.\r\n- Agent Corporation Action Election Amendment Request to provide the status of the amendment request, in which case, the building blocks Election Amendment Request Identification and the Election Amendment Request Status must be present."
 * </li>
 * </ul>
 */
public class AgentCAElectionStatusAdviceV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	/**
	 * Either AgentCAElectionAdviceIdentification or
	 * AgentCAElectionCancellationRequestIdentification or
	 * AgentCAElectionAmendmentRequestIdentification must be present.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMXor#getImpactedMessageBuildingBlocks
	 * impactedMessageBuildingBlocks} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.AgentCAElectionStatusAdviceV01#AgentCAElectionAdviceIdentification
	 * AgentCAElectionStatusAdviceV01.AgentCAElectionAdviceIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.AgentCAElectionStatusAdviceV01#AgentCAElectionCancellationRequestIdentification
	 * AgentCAElectionStatusAdviceV01.
	 * AgentCAElectionCancellationRequestIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.AgentCAElectionStatusAdviceV01#AgentCAElectionAmendmentRequestIdentification
	 * AgentCAElectionStatusAdviceV01.
	 * AgentCAElectionAmendmentRequestIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageDefinition
	 * messageDefinition} =
	 * {@linkplain com.tools20022.repository.area.seev.AgentCAElectionStatusAdviceV01
	 * AgentCAElectionStatusAdviceV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} =
	 * "ElectionAdviceIDOrElectionCancellationRequestIDOrElectionAmendmentRequestIDRule"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either AgentCAElectionAdviceIdentification or AgentCAElectionCancellationRequestIdentification or AgentCAElectionAmendmentRequestIdentification must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMXor ElectionAdviceIDOrElectionCancellationRequestIDOrElectionAmendmentRequestIDRule = new MMXor() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ElectionAdviceIDOrElectionCancellationRequestIDOrElectionAmendmentRequestIDRule";
			definition = "Either AgentCAElectionAdviceIdentification or AgentCAElectionCancellationRequestIdentification or AgentCAElectionAmendmentRequestIdentification must be present.";
			messageDefinition_lazy = () -> AgentCAElectionStatusAdviceV01.mmObject();
			impactedMessageBuildingBlocks_lazy = () -> Arrays.asList(com.tools20022.repository.area.seev.AgentCAElectionStatusAdviceV01.AgentCAElectionAdviceIdentification,
					com.tools20022.repository.area.seev.AgentCAElectionStatusAdviceV01.AgentCAElectionCancellationRequestIdentification,
					com.tools20022.repository.area.seev.AgentCAElectionStatusAdviceV01.AgentCAElectionAmendmentRequestIdentification);
		}
	};
	/**
	 * Either ElectionAdviceStatus or ElectionCancellationRequestStatus or
	 * ElectionAmendmentRequestStatus must be present.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMXor#getImpactedMessageBuildingBlocks
	 * impactedMessageBuildingBlocks} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.AgentCAElectionStatusAdviceV01#ElectionAdviceStatus
	 * AgentCAElectionStatusAdviceV01.ElectionAdviceStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.AgentCAElectionStatusAdviceV01#ElectionCancellationRequestStatus
	 * AgentCAElectionStatusAdviceV01.ElectionCancellationRequestStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.AgentCAElectionStatusAdviceV01#ElectionAmendmentRequestStatus
	 * AgentCAElectionStatusAdviceV01.ElectionAmendmentRequestStatus}</li>
	 * </ul>
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageDefinition
	 * messageDefinition} =
	 * {@linkplain com.tools20022.repository.area.seev.AgentCAElectionStatusAdviceV01
	 * AgentCAElectionStatusAdviceV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} =
	 * "ElectionAdviceStatusOrCancellationRequestStatusOrAmendmentRequestStatusRule"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either ElectionAdviceStatus or ElectionCancellationRequestStatus or ElectionAmendmentRequestStatus must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMXor ElectionAdviceStatusOrCancellationRequestStatusOrAmendmentRequestStatusRule = new MMXor() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ElectionAdviceStatusOrCancellationRequestStatusOrAmendmentRequestStatusRule";
			definition = "Either ElectionAdviceStatus or ElectionCancellationRequestStatus or ElectionAmendmentRequestStatus must be present.";
			messageDefinition_lazy = () -> AgentCAElectionStatusAdviceV01.mmObject();
			impactedMessageBuildingBlocks_lazy = () -> Arrays.asList(com.tools20022.repository.area.seev.AgentCAElectionStatusAdviceV01.ElectionAdviceStatus,
					com.tools20022.repository.area.seev.AgentCAElectionStatusAdviceV01.ElectionCancellationRequestStatus, com.tools20022.repository.area.seev.AgentCAElectionStatusAdviceV01.ElectionAmendmentRequestStatus);
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
	 * Identification of the linked Agent CA Election Advice for which a status
	 * is given.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification8
	 * DocumentIdentification8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AgtCAElctnAdvcId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgentCAElectionAdviceIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the linked Agent CA Election Advice for which a status is given."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock AgentCAElectionAdviceIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "AgtCAElctnAdvcId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgentCAElectionAdviceIdentification";
			definition = "Identification of the linked Agent CA Election Advice for which a status is given.";
			minOccurs = 1;
			maxOccurs = 1;
			complexType_lazy = () -> DocumentIdentification8.mmObject();
		}
	};
	/**
	 * Identification of the linked Agent CA Election Cancellation Request for
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
	 * xmlTag} = "AgtCAElctnCxlReqId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgentCAElectionCancellationRequestIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the linked Agent CA Election Cancellation Request for which a status is given."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock AgentCAElectionCancellationRequestIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "AgtCAElctnCxlReqId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgentCAElectionCancellationRequestIdentification";
			definition = "Identification of the linked Agent CA Election Cancellation Request for which a status is given.";
			minOccurs = 1;
			maxOccurs = 1;
			complexType_lazy = () -> DocumentIdentification8.mmObject();
		}
	};
	/**
	 * Identification of the linked Agent CA Election Amendment Request for
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
	 * xmlTag} = "AgtCAElctnAmdmntReqId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgentCAElectionAmendmentRequestIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the linked Agent CA Election Amendment Request for which a status is given."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock AgentCAElectionAmendmentRequestIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "AgtCAElctnAmdmntReqId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgentCAElectionAmendmentRequestIdentification";
			definition = "Identification of the linked Agent CA Election Amendment Request for which a status is given.";
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
	 * Status of the election advice sent by the CSD.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.ElectionAdviceStatus1Choice
	 * ElectionAdviceStatus1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ElctnAdvcSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ElectionAdviceStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of the election advice sent by the CSD."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock ElectionAdviceStatus = new MMMessageBuildingBlock() {
		{
			xmlTag = "ElctnAdvcSts";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ElectionAdviceStatus";
			definition = "Status of the election advice sent by the CSD.";
			minOccurs = 1;
			maxOccurs = 1;
			complexType_lazy = () -> ElectionAdviceStatus1Choice.mmObject();
		}
	};
	/**
	 * Status of the election cancellation request sent by the CSD.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.ElectionCancellationStatus1Choice
	 * ElectionCancellationStatus1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ElctnCxlReqSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ElectionCancellationRequestStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Status of the election cancellation request sent by the CSD."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock ElectionCancellationRequestStatus = new MMMessageBuildingBlock() {
		{
			xmlTag = "ElctnCxlReqSts";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ElectionCancellationRequestStatus";
			definition = "Status of the election cancellation request sent by the CSD.";
			minOccurs = 1;
			maxOccurs = 1;
			complexType_lazy = () -> ElectionCancellationStatus1Choice.mmObject();
		}
	};
	/**
	 * Status of the amendment request sent by the CSD.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.ElectionAmendmentStatus1Choice
	 * ElectionAmendmentStatus1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ElctnAmdmntReqSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ElectionAmendmentRequestStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of the amendment request sent by the CSD."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock ElectionAmendmentRequestStatus = new MMMessageBuildingBlock() {
		{
			xmlTag = "ElctnAmdmntReqSts";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ElectionAmendmentRequestStatus";
			definition = "Status of the amendment request sent by the CSD.";
			minOccurs = 1;
			maxOccurs = 1;
			complexType_lazy = () -> ElectionAmendmentStatus1Choice.mmObject();
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
	 * messageFunctionality} = "015"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageDefinitionIdentifier#getFlavour
	 * flavour} = "001"</li>
	 * </ul>
	 */
	public static final MMMessageDefinitionIdentifier identifier = new MMMessageDefinitionIdentifier() {
		{
			businessArea = "seev";
			messageFunctionality = "015";
			version = "01";
			flavour = "001";
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "AgentCAElectionStatusAdviceV01";
				definition = "Scope\r\nThis message is sent by an issuer (or its agent) to the CSD to report the status, or a change in status, of:\r\n- a corporate action election advice;\r\n- an election cancellation request; or\r\n- an election amendment request.\r\nUsage\r\nThis message must be sent in response to an:\r\n- Agent Corporation Action Election Advice to provide the status of an election advice in the case of a rejection. However, it may also be used in all other situations, in which case, the building blocks Election Advice Identification and the Election Advice Status must be present.\r\n- Agent Corporation Action Election Cancellation Request to provide the status of the cancellation request, in which case, the building blocks Election Cancellation Request Identification and the Election Cancellation Request Status must be present.\r\n- Agent Corporation Action Election Amendment Request to provide the status of the amendment request, in which case, the building blocks Election Amendment Request Identification and the Election Amendment Request Status must be present.";
				messageSet_lazy = () -> Arrays.asList(IssuersAgentsCommunicationISOLatestversion.mmObject());
				xors_lazy = () -> Arrays.asList(com.tools20022.repository.area.seev.AgentCAElectionStatusAdviceV01.ElectionAdviceIDOrElectionCancellationRequestIDOrElectionAmendmentRequestIDRule,
						com.tools20022.repository.area.seev.AgentCAElectionStatusAdviceV01.ElectionAdviceStatusOrCancellationRequestStatusOrAmendmentRequestStatusRule);
				rootElement = "Document";
				xmlTag = "AgtCAElctnStsAdvc";
				businessArea_lazy = () -> SecuritiesEventsLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.seev.AgentCAElectionStatusAdviceV01.Identification,
						com.tools20022.repository.area.seev.AgentCAElectionStatusAdviceV01.AgentCAElectionAdviceIdentification,
						com.tools20022.repository.area.seev.AgentCAElectionStatusAdviceV01.AgentCAElectionCancellationRequestIdentification,
						com.tools20022.repository.area.seev.AgentCAElectionStatusAdviceV01.AgentCAElectionAmendmentRequestIdentification, com.tools20022.repository.area.seev.AgentCAElectionStatusAdviceV01.CorporateActionGeneralInformation,
						com.tools20022.repository.area.seev.AgentCAElectionStatusAdviceV01.ElectionAdviceStatus, com.tools20022.repository.area.seev.AgentCAElectionStatusAdviceV01.ElectionCancellationRequestStatus,
						com.tools20022.repository.area.seev.AgentCAElectionStatusAdviceV01.ElectionAmendmentRequestStatus);
				messageDefinitionIdentifier_lazy = () -> com.tools20022.repository.area.seev.AgentCAElectionStatusAdviceV01.identifier;
			}
		});
		return mmObject_lazy.get();
	}
}