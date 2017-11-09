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
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code seev.015.001.01}</li>
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
 * {@linkplain com.tools20022.repository.area.seev.AgentCAElectionStatusAdviceV01#mmElectionAdviceIDOrElectionCancellationRequestIDOrElectionAmendmentRequestIDRule
 * AgentCAElectionStatusAdviceV01.
 * mmElectionAdviceIDOrElectionCancellationRequestIDOrElectionAmendmentRequestIDRule
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAElectionStatusAdviceV01#mmElectionAdviceStatusOrCancellationRequestStatusOrAmendmentRequestStatusRule
 * AgentCAElectionStatusAdviceV01.
 * mmElectionAdviceStatusOrCancellationRequestStatusOrAmendmentRequestStatusRule
 * }</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
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
 * {@linkplain com.tools20022.repository.area.seev.AgentCAElectionStatusAdviceV01#mmCorporateActionGeneralInformation
 * AgentCAElectionStatusAdviceV01.mmCorporateActionGeneralInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAElectionStatusAdviceV01#mmElectionAdviceStatus
 * AgentCAElectionStatusAdviceV01.mmElectionAdviceStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAElectionStatusAdviceV01#mmElectionCancellationRequestStatus
 * AgentCAElectionStatusAdviceV01.mmElectionCancellationRequestStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAElectionStatusAdviceV01#mmElectionAmendmentRequestStatus
 * AgentCAElectionStatusAdviceV01.mmElectionAmendmentRequestStatus}</li>
 * </ul>
 * </li>
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
	public static final MMXor mmElectionAdviceIDOrElectionCancellationRequestIDOrElectionAmendmentRequestIDRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ElectionAdviceIDOrElectionCancellationRequestIDOrElectionAmendmentRequestIDRule";
			definition = "Either AgentCAElectionAdviceIdentification or AgentCAElectionCancellationRequestIdentification or AgentCAElectionAmendmentRequestIdentification must be present.";
			messageDefinition_lazy = () -> AgentCAElectionStatusAdviceV01.mmObject();
			impactedMessageBuildingBlocks_lazy = () -> Arrays.asList(AgentCAElectionStatusAdviceV01.mmAgentCAElectionAdviceIdentification, AgentCAElectionStatusAdviceV01.mmAgentCAElectionCancellationRequestIdentification,
					AgentCAElectionStatusAdviceV01.mmAgentCAElectionAmendmentRequestIdentification);
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
	 * {@linkplain com.tools20022.repository.area.seev.AgentCAElectionStatusAdviceV01#mmElectionAdviceStatus
	 * AgentCAElectionStatusAdviceV01.mmElectionAdviceStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.AgentCAElectionStatusAdviceV01#mmElectionCancellationRequestStatus
	 * AgentCAElectionStatusAdviceV01.mmElectionCancellationRequestStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.AgentCAElectionStatusAdviceV01#mmElectionAmendmentRequestStatus
	 * AgentCAElectionStatusAdviceV01.mmElectionAmendmentRequestStatus}</li>
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
	public static final MMXor mmElectionAdviceStatusOrCancellationRequestStatusOrAmendmentRequestStatusRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ElectionAdviceStatusOrCancellationRequestStatusOrAmendmentRequestStatusRule";
			definition = "Either ElectionAdviceStatus or ElectionCancellationRequestStatus or ElectionAmendmentRequestStatus must be present.";
			messageDefinition_lazy = () -> AgentCAElectionStatusAdviceV01.mmObject();
			impactedMessageBuildingBlocks_lazy = () -> Arrays.asList(AgentCAElectionStatusAdviceV01.mmElectionAdviceStatus, AgentCAElectionStatusAdviceV01.mmElectionCancellationRequestStatus,
					AgentCAElectionStatusAdviceV01.mmElectionAmendmentRequestStatus);
		}
	};
	protected DocumentIdentification8 identification;
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
	};
	protected DocumentIdentification8 agentCAElectionAdviceIdentification;
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
	public static final MMMessageBuildingBlock mmAgentCAElectionAdviceIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "AgtCAElctnAdvcId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgentCAElectionAdviceIdentification";
			definition = "Identification of the linked Agent CA Election Advice for which a status is given.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DocumentIdentification8.mmObject();
		}
	};
	protected DocumentIdentification8 agentCAElectionCancellationRequestIdentification;
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
	public static final MMMessageBuildingBlock mmAgentCAElectionCancellationRequestIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "AgtCAElctnCxlReqId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgentCAElectionCancellationRequestIdentification";
			definition = "Identification of the linked Agent CA Election Cancellation Request for which a status is given.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DocumentIdentification8.mmObject();
		}
	};
	protected DocumentIdentification8 agentCAElectionAmendmentRequestIdentification;
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
	public static final MMMessageBuildingBlock mmAgentCAElectionAmendmentRequestIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "AgtCAElctnAmdmntReqId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgentCAElectionAmendmentRequestIdentification";
			definition = "Identification of the linked Agent CA Election Amendment Request for which a status is given.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DocumentIdentification8.mmObject();
		}
	};
	protected CorporateActionInformation1 corporateActionGeneralInformation;
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
	public static final MMMessageBuildingBlock mmCorporateActionGeneralInformation = new MMMessageBuildingBlock() {
		{
			xmlTag = "CorpActnGnlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionGeneralInformation";
			definition = "General information about the corporate action event.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CorporateActionInformation1.mmObject();
		}
	};
	protected ElectionAdviceStatus1Choice electionAdviceStatus;
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
	public static final MMMessageBuildingBlock mmElectionAdviceStatus = new MMMessageBuildingBlock() {
		{
			xmlTag = "ElctnAdvcSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ElectionAdviceStatus";
			definition = "Status of the election advice sent by the CSD.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> ElectionAdviceStatus1Choice.mmObject();
		}
	};
	protected ElectionCancellationStatus1Choice electionCancellationRequestStatus;
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
	public static final MMMessageBuildingBlock mmElectionCancellationRequestStatus = new MMMessageBuildingBlock() {
		{
			xmlTag = "ElctnCxlReqSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ElectionCancellationRequestStatus";
			definition = "Status of the election cancellation request sent by the CSD.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> ElectionCancellationStatus1Choice.mmObject();
		}
	};
	protected ElectionAmendmentStatus1Choice electionAmendmentRequestStatus;
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
	public static final MMMessageBuildingBlock mmElectionAmendmentRequestStatus = new MMMessageBuildingBlock() {
		{
			xmlTag = "ElctnAmdmntReqSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ElectionAmendmentRequestStatus";
			definition = "Status of the amendment request sent by the CSD.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> ElectionAmendmentStatus1Choice.mmObject();
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AgentCAElectionStatusAdviceV01";
				definition = "Scope\r\nThis message is sent by an issuer (or its agent) to the CSD to report the status, or a change in status, of:\r\n- a corporate action election advice;\r\n- an election cancellation request; or\r\n- an election amendment request.\r\nUsage\r\nThis message must be sent in response to an:\r\n- Agent Corporation Action Election Advice to provide the status of an election advice in the case of a rejection. However, it may also be used in all other situations, in which case, the building blocks Election Advice Identification and the Election Advice Status must be present.\r\n- Agent Corporation Action Election Cancellation Request to provide the status of the cancellation request, in which case, the building blocks Election Cancellation Request Identification and the Election Cancellation Request Status must be present.\r\n- Agent Corporation Action Election Amendment Request to provide the status of the amendment request, in which case, the building blocks Election Amendment Request Identification and the Election Amendment Request Status must be present.";
				messageSet_lazy = () -> Arrays.asList(IssuersAgentsCommunicationISOLatestversion.mmObject());
				xors_lazy = () -> Arrays.asList(AgentCAElectionStatusAdviceV01.mmElectionAdviceIDOrElectionCancellationRequestIDOrElectionAmendmentRequestIDRule,
						AgentCAElectionStatusAdviceV01.mmElectionAdviceStatusOrCancellationRequestStatusOrAmendmentRequestStatusRule);
				rootElement = "Document";
				xmlTag = "AgtCAElctnStsAdvc";
				businessArea_lazy = () -> SecuritiesEventsLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(AgentCAElectionStatusAdviceV01.mmIdentification, AgentCAElectionStatusAdviceV01.mmAgentCAElectionAdviceIdentification,
						AgentCAElectionStatusAdviceV01.mmAgentCAElectionCancellationRequestIdentification, AgentCAElectionStatusAdviceV01.mmAgentCAElectionAmendmentRequestIdentification,
						AgentCAElectionStatusAdviceV01.mmCorporateActionGeneralInformation, AgentCAElectionStatusAdviceV01.mmElectionAdviceStatus, AgentCAElectionStatusAdviceV01.mmElectionCancellationRequestStatus,
						AgentCAElectionStatusAdviceV01.mmElectionAmendmentRequestStatus);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "seev";
						messageFunctionality = "015";
						version = "01";
						flavour = "001";
					}
				};
			}
		});
		return mmObject_lazy.get();
	}

	public DocumentIdentification8 getIdentification() {
		return identification;
	}

	public void setIdentification(DocumentIdentification8 identification) {
		this.identification = identification;
	}

	public DocumentIdentification8 getAgentCAElectionAdviceIdentification() {
		return agentCAElectionAdviceIdentification;
	}

	public void setAgentCAElectionAdviceIdentification(DocumentIdentification8 agentCAElectionAdviceIdentification) {
		this.agentCAElectionAdviceIdentification = agentCAElectionAdviceIdentification;
	}

	public DocumentIdentification8 getAgentCAElectionCancellationRequestIdentification() {
		return agentCAElectionCancellationRequestIdentification;
	}

	public void setAgentCAElectionCancellationRequestIdentification(DocumentIdentification8 agentCAElectionCancellationRequestIdentification) {
		this.agentCAElectionCancellationRequestIdentification = agentCAElectionCancellationRequestIdentification;
	}

	public DocumentIdentification8 getAgentCAElectionAmendmentRequestIdentification() {
		return agentCAElectionAmendmentRequestIdentification;
	}

	public void setAgentCAElectionAmendmentRequestIdentification(DocumentIdentification8 agentCAElectionAmendmentRequestIdentification) {
		this.agentCAElectionAmendmentRequestIdentification = agentCAElectionAmendmentRequestIdentification;
	}

	public CorporateActionInformation1 getCorporateActionGeneralInformation() {
		return corporateActionGeneralInformation;
	}

	public void setCorporateActionGeneralInformation(CorporateActionInformation1 corporateActionGeneralInformation) {
		this.corporateActionGeneralInformation = corporateActionGeneralInformation;
	}

	public ElectionAdviceStatus1Choice getElectionAdviceStatus() {
		return electionAdviceStatus;
	}

	public void setElectionAdviceStatus(ElectionAdviceStatus1Choice electionAdviceStatus) {
		this.electionAdviceStatus = electionAdviceStatus;
	}

	public ElectionCancellationStatus1Choice getElectionCancellationRequestStatus() {
		return electionCancellationRequestStatus;
	}

	public void setElectionCancellationRequestStatus(ElectionCancellationStatus1Choice electionCancellationRequestStatus) {
		this.electionCancellationRequestStatus = electionCancellationRequestStatus;
	}

	public ElectionAmendmentStatus1Choice getElectionAmendmentRequestStatus() {
		return electionAmendmentRequestStatus;
	}

	public void setElectionAmendmentRequestStatus(ElectionAmendmentStatus1Choice electionAmendmentRequestStatus) {
		this.electionAmendmentRequestStatus = electionAmendmentRequestStatus;
	}
}