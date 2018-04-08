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
import java.util.Objects;
import javax.xml.bind.annotation.*;

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
 * xmlTag} = "AgtCAElctnStsAdvc"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesEventsLatestVersion
 * SecuritiesEventsLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code seev.015.001.01}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintElectionAdviceStatusRule#for_seev_AgentCAElectionStatusAdviceV01
 * ConstraintElectionAdviceStatusRule.for_seev_AgentCAElectionStatusAdviceV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintElectionAmendmentRequestStatusRule#for_seev_AgentCAElectionStatusAdviceV01
 * ConstraintElectionAmendmentRequestStatusRule.
 * for_seev_AgentCAElectionStatusAdviceV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintElectionCancellationRequestStatusRule#for_seev_AgentCAElectionStatusAdviceV01
 * ConstraintElectionCancellationRequestStatusRule.
 * for_seev_AgentCAElectionStatusAdviceV01}</li>
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
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AgentCAElectionStatusAdviceV01", propOrder = {"identification", "agentCAElectionAdviceIdentification", "agentCAElectionCancellationRequestIdentification", "agentCAElectionAmendmentRequestIdentification",
		"corporateActionGeneralInformation", "electionAdviceStatus", "electionCancellationRequestStatus", "electionAmendmentRequestStatus"})
public class AgentCAElectionStatusAdviceV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	/**
	 * Either AgentCAElectionAdviceIdentification or
	 * AgentCAElectionCancellationRequestIdentification or
	 * AgentCAElectionAmendmentRequestIdentification must be present.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageDefinition
	 * messageDefinition} =
	 * {@linkplain com.tools20022.repository.area.seev.AgentCAElectionStatusAdviceV01
	 * AgentCAElectionStatusAdviceV01}</li>
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ElectionAdviceIDOrElectionCancellationRequestIDOrElectionAmendmentRequestIDRule";
			definition = "Either AgentCAElectionAdviceIdentification or AgentCAElectionCancellationRequestIdentification or AgentCAElectionAmendmentRequestIdentification must be present.";
			impactedMessageBuildingBlocks_lazy = () -> Arrays.asList(com.tools20022.repository.area.seev.AgentCAElectionStatusAdviceV01.mmAgentCAElectionAdviceIdentification,
					com.tools20022.repository.area.seev.AgentCAElectionStatusAdviceV01.mmAgentCAElectionCancellationRequestIdentification,
					com.tools20022.repository.area.seev.AgentCAElectionStatusAdviceV01.mmAgentCAElectionAmendmentRequestIdentification);
			messageDefinition_lazy = () -> com.tools20022.repository.area.seev.AgentCAElectionStatusAdviceV01.mmObject();
		}
	};
	/**
	 * Either ElectionAdviceStatus or ElectionCancellationRequestStatus or
	 * ElectionAmendmentRequestStatus must be present.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageDefinition
	 * messageDefinition} =
	 * {@linkplain com.tools20022.repository.area.seev.AgentCAElectionStatusAdviceV01
	 * AgentCAElectionStatusAdviceV01}</li>
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ElectionAdviceStatusOrCancellationRequestStatusOrAmendmentRequestStatusRule";
			definition = "Either ElectionAdviceStatus or ElectionCancellationRequestStatus or ElectionAmendmentRequestStatus must be present.";
			impactedMessageBuildingBlocks_lazy = () -> Arrays.asList(com.tools20022.repository.area.seev.AgentCAElectionStatusAdviceV01.mmElectionAdviceStatus,
					com.tools20022.repository.area.seev.AgentCAElectionStatusAdviceV01.mmElectionCancellationRequestStatus, com.tools20022.repository.area.seev.AgentCAElectionStatusAdviceV01.mmElectionAmendmentRequestStatus);
			messageDefinition_lazy = () -> com.tools20022.repository.area.seev.AgentCAElectionStatusAdviceV01.mmObject();
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
	public static final MMMessageBuildingBlock<AgentCAElectionStatusAdviceV01, DocumentIdentification8> mmIdentification = new MMMessageBuildingBlock<AgentCAElectionStatusAdviceV01, DocumentIdentification8>() {
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
		public DocumentIdentification8 getValue(AgentCAElectionStatusAdviceV01 obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(AgentCAElectionStatusAdviceV01 obj, DocumentIdentification8 value) {
			obj.setIdentification(value);
		}
	};
	@XmlElement(name = "AgtCAElctnAdvcId", required = true)
	protected DocumentIdentification8 agentCAElectionAdviceIdentification;
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
	public static final MMMessageBuildingBlock<AgentCAElectionStatusAdviceV01, DocumentIdentification8> mmAgentCAElectionAdviceIdentification = new MMMessageBuildingBlock<AgentCAElectionStatusAdviceV01, DocumentIdentification8>() {
		{
			xmlTag = "AgtCAElctnAdvcId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgentCAElectionAdviceIdentification";
			definition = "Identification of the linked Agent CA Election Advice for which a status is given.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DocumentIdentification8.mmObject();
		}

		@Override
		public DocumentIdentification8 getValue(AgentCAElectionStatusAdviceV01 obj) {
			return obj.getAgentCAElectionAdviceIdentification();
		}

		@Override
		public void setValue(AgentCAElectionStatusAdviceV01 obj, DocumentIdentification8 value) {
			obj.setAgentCAElectionAdviceIdentification(value);
		}
	};
	@XmlElement(name = "AgtCAElctnCxlReqId", required = true)
	protected DocumentIdentification8 agentCAElectionCancellationRequestIdentification;
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
	public static final MMMessageBuildingBlock<AgentCAElectionStatusAdviceV01, DocumentIdentification8> mmAgentCAElectionCancellationRequestIdentification = new MMMessageBuildingBlock<AgentCAElectionStatusAdviceV01, DocumentIdentification8>() {
		{
			xmlTag = "AgtCAElctnCxlReqId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgentCAElectionCancellationRequestIdentification";
			definition = "Identification of the linked Agent CA Election Cancellation Request for which a status is given.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DocumentIdentification8.mmObject();
		}

		@Override
		public DocumentIdentification8 getValue(AgentCAElectionStatusAdviceV01 obj) {
			return obj.getAgentCAElectionCancellationRequestIdentification();
		}

		@Override
		public void setValue(AgentCAElectionStatusAdviceV01 obj, DocumentIdentification8 value) {
			obj.setAgentCAElectionCancellationRequestIdentification(value);
		}
	};
	@XmlElement(name = "AgtCAElctnAmdmntReqId", required = true)
	protected DocumentIdentification8 agentCAElectionAmendmentRequestIdentification;
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
	public static final MMMessageBuildingBlock<AgentCAElectionStatusAdviceV01, DocumentIdentification8> mmAgentCAElectionAmendmentRequestIdentification = new MMMessageBuildingBlock<AgentCAElectionStatusAdviceV01, DocumentIdentification8>() {
		{
			xmlTag = "AgtCAElctnAmdmntReqId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgentCAElectionAmendmentRequestIdentification";
			definition = "Identification of the linked Agent CA Election Amendment Request for which a status is given.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DocumentIdentification8.mmObject();
		}

		@Override
		public DocumentIdentification8 getValue(AgentCAElectionStatusAdviceV01 obj) {
			return obj.getAgentCAElectionAmendmentRequestIdentification();
		}

		@Override
		public void setValue(AgentCAElectionStatusAdviceV01 obj, DocumentIdentification8 value) {
			obj.setAgentCAElectionAmendmentRequestIdentification(value);
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
	public static final MMMessageBuildingBlock<AgentCAElectionStatusAdviceV01, CorporateActionInformation1> mmCorporateActionGeneralInformation = new MMMessageBuildingBlock<AgentCAElectionStatusAdviceV01, CorporateActionInformation1>() {
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
		public CorporateActionInformation1 getValue(AgentCAElectionStatusAdviceV01 obj) {
			return obj.getCorporateActionGeneralInformation();
		}

		@Override
		public void setValue(AgentCAElectionStatusAdviceV01 obj, CorporateActionInformation1 value) {
			obj.setCorporateActionGeneralInformation(value);
		}
	};
	@XmlElement(name = "ElctnAdvcSts", required = true)
	protected ElectionAdviceStatus1Choice electionAdviceStatus;
	/**
	 * 
	 <p>
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
	public static final MMMessageBuildingBlock<AgentCAElectionStatusAdviceV01, ElectionAdviceStatus1Choice> mmElectionAdviceStatus = new MMMessageBuildingBlock<AgentCAElectionStatusAdviceV01, ElectionAdviceStatus1Choice>() {
		{
			xmlTag = "ElctnAdvcSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ElectionAdviceStatus";
			definition = "Status of the election advice sent by the CSD.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> ElectionAdviceStatus1Choice.mmObject();
		}

		@Override
		public ElectionAdviceStatus1Choice getValue(AgentCAElectionStatusAdviceV01 obj) {
			return obj.getElectionAdviceStatus();
		}

		@Override
		public void setValue(AgentCAElectionStatusAdviceV01 obj, ElectionAdviceStatus1Choice value) {
			obj.setElectionAdviceStatus(value);
		}
	};
	@XmlElement(name = "ElctnCxlReqSts", required = true)
	protected ElectionCancellationStatus1Choice electionCancellationRequestStatus;
	/**
	 * 
	 <p>
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
	public static final MMMessageBuildingBlock<AgentCAElectionStatusAdviceV01, ElectionCancellationStatus1Choice> mmElectionCancellationRequestStatus = new MMMessageBuildingBlock<AgentCAElectionStatusAdviceV01, ElectionCancellationStatus1Choice>() {
		{
			xmlTag = "ElctnCxlReqSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ElectionCancellationRequestStatus";
			definition = "Status of the election cancellation request sent by the CSD.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> ElectionCancellationStatus1Choice.mmObject();
		}

		@Override
		public ElectionCancellationStatus1Choice getValue(AgentCAElectionStatusAdviceV01 obj) {
			return obj.getElectionCancellationRequestStatus();
		}

		@Override
		public void setValue(AgentCAElectionStatusAdviceV01 obj, ElectionCancellationStatus1Choice value) {
			obj.setElectionCancellationRequestStatus(value);
		}
	};
	@XmlElement(name = "ElctnAmdmntReqSts", required = true)
	protected ElectionAmendmentStatus1Choice electionAmendmentRequestStatus;
	/**
	 * 
	 <p>
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
	public static final MMMessageBuildingBlock<AgentCAElectionStatusAdviceV01, ElectionAmendmentStatus1Choice> mmElectionAmendmentRequestStatus = new MMMessageBuildingBlock<AgentCAElectionStatusAdviceV01, ElectionAmendmentStatus1Choice>() {
		{
			xmlTag = "ElctnAmdmntReqSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ElectionAmendmentRequestStatus";
			definition = "Status of the amendment request sent by the CSD.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> ElectionAmendmentStatus1Choice.mmObject();
		}

		@Override
		public ElectionAmendmentStatus1Choice getValue(AgentCAElectionStatusAdviceV01 obj) {
			return obj.getElectionAmendmentRequestStatus();
		}

		@Override
		public void setValue(AgentCAElectionStatusAdviceV01 obj, ElectionAmendmentStatus1Choice value) {
			obj.setElectionAmendmentRequestStatus(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintElectionAdviceStatusRule.for_seev_AgentCAElectionStatusAdviceV01,
						com.tools20022.repository.constraints.ConstraintElectionAmendmentRequestStatusRule.for_seev_AgentCAElectionStatusAdviceV01,
						com.tools20022.repository.constraints.ConstraintElectionCancellationRequestStatusRule.for_seev_AgentCAElectionStatusAdviceV01);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AgentCAElectionStatusAdviceV01";
				definition = "Scope\r\nThis message is sent by an issuer (or its agent) to the CSD to report the status, or a change in status, of:\r\n- a corporate action election advice;\r\n- an election cancellation request; or\r\n- an election amendment request.\r\nUsage\r\nThis message must be sent in response to an:\r\n- Agent Corporation Action Election Advice to provide the status of an election advice in the case of a rejection. However, it may also be used in all other situations, in which case, the building blocks Election Advice Identification and the Election Advice Status must be present.\r\n- Agent Corporation Action Election Cancellation Request to provide the status of the cancellation request, in which case, the building blocks Election Cancellation Request Identification and the Election Cancellation Request Status must be present.\r\n- Agent Corporation Action Election Amendment Request to provide the status of the amendment request, in which case, the building blocks Election Amendment Request Identification and the Election Amendment Request Status must be present.";
				messageSet_lazy = () -> Arrays.asList(IssuersAgentsCommunicationISOLatestversion.mmObject());
				xors_lazy = () -> Arrays.asList(com.tools20022.repository.area.seev.AgentCAElectionStatusAdviceV01.ElectionAdviceIDOrElectionCancellationRequestIDOrElectionAmendmentRequestIDRule,
						com.tools20022.repository.area.seev.AgentCAElectionStatusAdviceV01.ElectionAdviceStatusOrCancellationRequestStatusOrAmendmentRequestStatusRule);
				rootElement = "Document";
				xmlTag = "AgtCAElctnStsAdvc";
				businessArea_lazy = () -> SecuritiesEventsLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.seev.AgentCAElectionStatusAdviceV01.mmIdentification,
						com.tools20022.repository.area.seev.AgentCAElectionStatusAdviceV01.mmAgentCAElectionAdviceIdentification,
						com.tools20022.repository.area.seev.AgentCAElectionStatusAdviceV01.mmAgentCAElectionCancellationRequestIdentification,
						com.tools20022.repository.area.seev.AgentCAElectionStatusAdviceV01.mmAgentCAElectionAmendmentRequestIdentification,
						com.tools20022.repository.area.seev.AgentCAElectionStatusAdviceV01.mmCorporateActionGeneralInformation, com.tools20022.repository.area.seev.AgentCAElectionStatusAdviceV01.mmElectionAdviceStatus,
						com.tools20022.repository.area.seev.AgentCAElectionStatusAdviceV01.mmElectionCancellationRequestStatus, com.tools20022.repository.area.seev.AgentCAElectionStatusAdviceV01.mmElectionAmendmentRequestStatus);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "seev";
						messageFunctionality = "015";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return AgentCAElectionStatusAdviceV01.class;
			}
		});
		return mmObject_lazy.get();
	}

	public DocumentIdentification8 getIdentification() {
		return identification;
	}

	public AgentCAElectionStatusAdviceV01 setIdentification(DocumentIdentification8 identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public DocumentIdentification8 getAgentCAElectionAdviceIdentification() {
		return agentCAElectionAdviceIdentification;
	}

	public AgentCAElectionStatusAdviceV01 setAgentCAElectionAdviceIdentification(DocumentIdentification8 agentCAElectionAdviceIdentification) {
		this.agentCAElectionAdviceIdentification = Objects.requireNonNull(agentCAElectionAdviceIdentification);
		return this;
	}

	public DocumentIdentification8 getAgentCAElectionCancellationRequestIdentification() {
		return agentCAElectionCancellationRequestIdentification;
	}

	public AgentCAElectionStatusAdviceV01 setAgentCAElectionCancellationRequestIdentification(DocumentIdentification8 agentCAElectionCancellationRequestIdentification) {
		this.agentCAElectionCancellationRequestIdentification = Objects.requireNonNull(agentCAElectionCancellationRequestIdentification);
		return this;
	}

	public DocumentIdentification8 getAgentCAElectionAmendmentRequestIdentification() {
		return agentCAElectionAmendmentRequestIdentification;
	}

	public AgentCAElectionStatusAdviceV01 setAgentCAElectionAmendmentRequestIdentification(DocumentIdentification8 agentCAElectionAmendmentRequestIdentification) {
		this.agentCAElectionAmendmentRequestIdentification = Objects.requireNonNull(agentCAElectionAmendmentRequestIdentification);
		return this;
	}

	public CorporateActionInformation1 getCorporateActionGeneralInformation() {
		return corporateActionGeneralInformation;
	}

	public AgentCAElectionStatusAdviceV01 setCorporateActionGeneralInformation(CorporateActionInformation1 corporateActionGeneralInformation) {
		this.corporateActionGeneralInformation = Objects.requireNonNull(corporateActionGeneralInformation);
		return this;
	}

	public ElectionAdviceStatus1Choice getElectionAdviceStatus() {
		return electionAdviceStatus;
	}

	public AgentCAElectionStatusAdviceV01 setElectionAdviceStatus(ElectionAdviceStatus1Choice electionAdviceStatus) {
		this.electionAdviceStatus = Objects.requireNonNull(electionAdviceStatus);
		return this;
	}

	public ElectionCancellationStatus1Choice getElectionCancellationRequestStatus() {
		return electionCancellationRequestStatus;
	}

	public AgentCAElectionStatusAdviceV01 setElectionCancellationRequestStatus(ElectionCancellationStatus1Choice electionCancellationRequestStatus) {
		this.electionCancellationRequestStatus = Objects.requireNonNull(electionCancellationRequestStatus);
		return this;
	}

	public ElectionAmendmentStatus1Choice getElectionAmendmentRequestStatus() {
		return electionAmendmentRequestStatus;
	}

	public AgentCAElectionStatusAdviceV01 setElectionAmendmentRequestStatus(ElectionAmendmentStatus1Choice electionAmendmentRequestStatus) {
		this.electionAmendmentRequestStatus = Objects.requireNonNull(electionAmendmentRequestStatus);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.015.001.01")
	static public class Document {
		@XmlElement(name = "AgtCAElctnStsAdvc", required = true)
		public AgentCAElectionStatusAdviceV01 messageBody;
	}
}