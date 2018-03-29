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
import com.tools20022.repository.choice.NotificationAdviceStatus1Choice;
import com.tools20022.repository.choice.NotificationCancellationRequestStatus1Choice;
import com.tools20022.repository.msg.CorporateActionInformation2;
import com.tools20022.repository.msg.DocumentIdentification8;
import com.tools20022.repository.msgset.IssuersAgentsCommunicationISOLatestversion;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * This message is sent by a CSD to an issuer (or its agent) to report the
 * status, or change in status, of a notification advice or notification
 * cancellation request.<br>
 * <b>Usage</b><br>
 * When this message is used to report the status of a notification advice then
 * the building block Agent Corporate Action Notification Advice Identification
 * must be present.<br>
 * When this message is used to provide the status of a notification
 * cancellation request then the building block Notification Cancellation
 * Request Identification must be present.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCANotificationStatusAdviceV01#NotificationCancellationRequestStatusOrNotificationAdviceStatusRule
 * AgentCANotificationStatusAdviceV01.
 * NotificationCancellationRequestStatusOrNotificationAdviceStatusRule}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCANotificationStatusAdviceV01#AgentCANotificationAdviceIDOrAgentCANotificationCancellationRequestIDRule
 * AgentCANotificationStatusAdviceV01.
 * AgentCANotificationAdviceIDOrAgentCANotificationCancellationRequestIDRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
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
 * {@linkplain com.tools20022.repository.area.seev.AgentCANotificationStatusAdviceV01#mmCorporateActionGeneralInformation
 * AgentCANotificationStatusAdviceV01.mmCorporateActionGeneralInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCANotificationStatusAdviceV01#mmNotificationCancellationRequestStatus
 * AgentCANotificationStatusAdviceV01.mmNotificationCancellationRequestStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCANotificationStatusAdviceV01#mmNotificationAdviceStatus
 * AgentCANotificationStatusAdviceV01.mmNotificationAdviceStatus}</li>
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
 * xmlTag} = "AgtCANtfctnStsAdvc"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesEventsLatestVersion
 * SecuritiesEventsLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code seev.011.001.01}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintNotificationAdviceStatusRule#forAgentCANotificationStatusAdviceV01
 * ConstraintNotificationAdviceStatusRule.forAgentCANotificationStatusAdviceV01}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintNotificationCancellationRequestStatusRule#forAgentCANotificationStatusAdviceV01
 * ConstraintNotificationCancellationRequestStatusRule.
 * forAgentCANotificationStatusAdviceV01}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AgentCANotificationStatusAdviceV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThis message is sent by a CSD to an issuer (or its agent) to report the status, or change in status, of a notification advice or notification cancellation request.\r\nUsage\r\nWhen this message is used to report the status of a notification advice then the building block Agent Corporate Action Notification Advice Identification must be present.\r\nWhen this message is used to provide the status of a notification cancellation request then the building block Notification Cancellation Request Identification must be present."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AgentCANotificationStatusAdviceV01", propOrder = {"identification", "agentCANotificationAdviceIdentification", "agentCANotificationCancellationRequestIdentification", "corporateActionGeneralInformation",
		"notificationCancellationRequestStatus", "notificationAdviceStatus"})
public class AgentCANotificationStatusAdviceV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	/**
	 * Either NotificationCancellationRequestStatus or NotificationAdviceStatus
	 * must be present but not both.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageDefinition
	 * messageDefinition} =
	 * {@linkplain com.tools20022.repository.area.seev.AgentCANotificationStatusAdviceV01
	 * AgentCANotificationStatusAdviceV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMXor#getImpactedMessageBuildingBlocks
	 * impactedMessageBuildingBlocks} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.AgentCANotificationStatusAdviceV01#mmNotificationCancellationRequestStatus
	 * AgentCANotificationStatusAdviceV01.
	 * mmNotificationCancellationRequestStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.AgentCANotificationStatusAdviceV01#mmNotificationAdviceStatus
	 * AgentCANotificationStatusAdviceV01.mmNotificationAdviceStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} =
	 * "NotificationCancellationRequestStatusOrNotificationAdviceStatusRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either NotificationCancellationRequestStatus or NotificationAdviceStatus must be present but not both."
	 * </li>
	 * </ul>
	 */
	public static final MMXor NotificationCancellationRequestStatusOrNotificationAdviceStatusRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotificationCancellationRequestStatusOrNotificationAdviceStatusRule";
			definition = "Either NotificationCancellationRequestStatus or NotificationAdviceStatus must be present but not both.";
			messageDefinition_lazy = () -> com.tools20022.repository.area.seev.AgentCANotificationStatusAdviceV01.mmObject();
			impactedMessageBuildingBlocks_lazy = () -> Arrays.asList(com.tools20022.repository.area.seev.AgentCANotificationStatusAdviceV01.mmNotificationCancellationRequestStatus,
					com.tools20022.repository.area.seev.AgentCANotificationStatusAdviceV01.mmNotificationAdviceStatus);
		}
	};
	/**
	 * Either AgentCANotificationAdviceIdentification or
	 * AgentCANotificationCancellationRequestIdentification must be present, but
	 * not both.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageDefinition
	 * messageDefinition} =
	 * {@linkplain com.tools20022.repository.area.seev.AgentCANotificationStatusAdviceV01
	 * AgentCANotificationStatusAdviceV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMXor#getImpactedMessageBuildingBlocks
	 * impactedMessageBuildingBlocks} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.AgentCANotificationStatusAdviceV01#mmAgentCANotificationAdviceIdentification
	 * AgentCANotificationStatusAdviceV01.
	 * mmAgentCANotificationAdviceIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.AgentCANotificationStatusAdviceV01#mmAgentCANotificationCancellationRequestIdentification
	 * AgentCANotificationStatusAdviceV01.
	 * mmAgentCANotificationCancellationRequestIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} =
	 * "AgentCANotificationAdviceIDOrAgentCANotificationCancellationRequestIDRule"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either AgentCANotificationAdviceIdentification or AgentCANotificationCancellationRequestIdentification must be present, but not both."
	 * </li>
	 * </ul>
	 */
	public static final MMXor AgentCANotificationAdviceIDOrAgentCANotificationCancellationRequestIDRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgentCANotificationAdviceIDOrAgentCANotificationCancellationRequestIDRule";
			definition = "Either AgentCANotificationAdviceIdentification or AgentCANotificationCancellationRequestIdentification must be present, but not both.";
			messageDefinition_lazy = () -> com.tools20022.repository.area.seev.AgentCANotificationStatusAdviceV01.mmObject();
			impactedMessageBuildingBlocks_lazy = () -> Arrays.asList(com.tools20022.repository.area.seev.AgentCANotificationStatusAdviceV01.mmAgentCANotificationAdviceIdentification,
					com.tools20022.repository.area.seev.AgentCANotificationStatusAdviceV01.mmAgentCANotificationCancellationRequestIdentification);
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
	public static final MMMessageBuildingBlock<AgentCANotificationStatusAdviceV01, DocumentIdentification8> mmIdentification = new MMMessageBuildingBlock<AgentCANotificationStatusAdviceV01, DocumentIdentification8>() {
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
		public DocumentIdentification8 getValue(AgentCANotificationStatusAdviceV01 obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(AgentCANotificationStatusAdviceV01 obj, DocumentIdentification8 value) {
			obj.setIdentification(value);
		}
	};
	@XmlElement(name = "AgtCANtfctnAdvcId", required = true)
	protected DocumentIdentification8 agentCANotificationAdviceIdentification;
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
	 * xmlTag} = "AgtCANtfctnAdvcId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgentCANotificationAdviceIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the linked Agent CA Notification Advice for which a status is given."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AgentCANotificationStatusAdviceV01, DocumentIdentification8> mmAgentCANotificationAdviceIdentification = new MMMessageBuildingBlock<AgentCANotificationStatusAdviceV01, DocumentIdentification8>() {
		{
			xmlTag = "AgtCANtfctnAdvcId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgentCANotificationAdviceIdentification";
			definition = "Identification of the linked Agent CA Notification Advice for which a status is given.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DocumentIdentification8.mmObject();
		}

		@Override
		public DocumentIdentification8 getValue(AgentCANotificationStatusAdviceV01 obj) {
			return obj.getAgentCANotificationAdviceIdentification();
		}

		@Override
		public void setValue(AgentCANotificationStatusAdviceV01 obj, DocumentIdentification8 value) {
			obj.setAgentCANotificationAdviceIdentification(value);
		}
	};
	@XmlElement(name = "AgtCANtfctnCxlReqId", required = true)
	protected DocumentIdentification8 agentCANotificationCancellationRequestIdentification;
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
	 * xmlTag} = "AgtCANtfctnCxlReqId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgentCANotificationCancellationRequestIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the linked Agent CA Notification Cancellation Request for which a status is given."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AgentCANotificationStatusAdviceV01, DocumentIdentification8> mmAgentCANotificationCancellationRequestIdentification = new MMMessageBuildingBlock<AgentCANotificationStatusAdviceV01, DocumentIdentification8>() {
		{
			xmlTag = "AgtCANtfctnCxlReqId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgentCANotificationCancellationRequestIdentification";
			definition = "Identification of the linked Agent CA Notification Cancellation Request for which a status is given.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DocumentIdentification8.mmObject();
		}

		@Override
		public DocumentIdentification8 getValue(AgentCANotificationStatusAdviceV01 obj) {
			return obj.getAgentCANotificationCancellationRequestIdentification();
		}

		@Override
		public void setValue(AgentCANotificationStatusAdviceV01 obj, DocumentIdentification8 value) {
			obj.setAgentCANotificationCancellationRequestIdentification(value);
		}
	};
	@XmlElement(name = "CorpActnGnlInf", required = true)
	protected CorporateActionInformation2 corporateActionGeneralInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInformation2
	 * CorporateActionInformation2}</li>
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
	public static final MMMessageBuildingBlock<AgentCANotificationStatusAdviceV01, CorporateActionInformation2> mmCorporateActionGeneralInformation = new MMMessageBuildingBlock<AgentCANotificationStatusAdviceV01, CorporateActionInformation2>() {
		{
			xmlTag = "CorpActnGnlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionGeneralInformation";
			definition = "General information about the corporate action event.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CorporateActionInformation2.mmObject();
		}

		@Override
		public CorporateActionInformation2 getValue(AgentCANotificationStatusAdviceV01 obj) {
			return obj.getCorporateActionGeneralInformation();
		}

		@Override
		public void setValue(AgentCANotificationStatusAdviceV01 obj, CorporateActionInformation2 value) {
			obj.setCorporateActionGeneralInformation(value);
		}
	};
	@XmlElement(name = "NtfctnCxlReqSts", required = true)
	protected NotificationCancellationRequestStatus1Choice notificationCancellationRequestStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.NotificationCancellationRequestStatus1Choice
	 * NotificationCancellationRequestStatus1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NtfctnCxlReqSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotificationCancellationRequestStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Status of the Notification Cancellation Request sent by the issuer (agent)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AgentCANotificationStatusAdviceV01, NotificationCancellationRequestStatus1Choice> mmNotificationCancellationRequestStatus = new MMMessageBuildingBlock<AgentCANotificationStatusAdviceV01, NotificationCancellationRequestStatus1Choice>() {
		{
			xmlTag = "NtfctnCxlReqSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotificationCancellationRequestStatus";
			definition = "Status of the Notification Cancellation Request sent by the issuer (agent).";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> NotificationCancellationRequestStatus1Choice.mmObject();
		}

		@Override
		public NotificationCancellationRequestStatus1Choice getValue(AgentCANotificationStatusAdviceV01 obj) {
			return obj.getNotificationCancellationRequestStatus();
		}

		@Override
		public void setValue(AgentCANotificationStatusAdviceV01 obj, NotificationCancellationRequestStatus1Choice value) {
			obj.setNotificationCancellationRequestStatus(value);
		}
	};
	@XmlElement(name = "NtfctnAdvcSts", required = true)
	protected NotificationAdviceStatus1Choice notificationAdviceStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.NotificationAdviceStatus1Choice
	 * NotificationAdviceStatus1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NtfctnAdvcSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotificationAdviceStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Status of the notification advice sent by the issuer (agent)."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AgentCANotificationStatusAdviceV01, NotificationAdviceStatus1Choice> mmNotificationAdviceStatus = new MMMessageBuildingBlock<AgentCANotificationStatusAdviceV01, NotificationAdviceStatus1Choice>() {
		{
			xmlTag = "NtfctnAdvcSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotificationAdviceStatus";
			definition = "Status of the notification advice sent by the issuer (agent).";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> NotificationAdviceStatus1Choice.mmObject();
		}

		@Override
		public NotificationAdviceStatus1Choice getValue(AgentCANotificationStatusAdviceV01 obj) {
			return obj.getNotificationAdviceStatus();
		}

		@Override
		public void setValue(AgentCANotificationStatusAdviceV01 obj, NotificationAdviceStatus1Choice value) {
			obj.setNotificationAdviceStatus(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintNotificationAdviceStatusRule.forAgentCANotificationStatusAdviceV01,
						com.tools20022.repository.constraints.ConstraintNotificationCancellationRequestStatusRule.forAgentCANotificationStatusAdviceV01);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AgentCANotificationStatusAdviceV01";
				definition = "Scope\r\nThis message is sent by a CSD to an issuer (or its agent) to report the status, or change in status, of a notification advice or notification cancellation request.\r\nUsage\r\nWhen this message is used to report the status of a notification advice then the building block Agent Corporate Action Notification Advice Identification must be present.\r\nWhen this message is used to provide the status of a notification cancellation request then the building block Notification Cancellation Request Identification must be present.";
				messageSet_lazy = () -> Arrays.asList(IssuersAgentsCommunicationISOLatestversion.mmObject());
				xors_lazy = () -> Arrays.asList(com.tools20022.repository.area.seev.AgentCANotificationStatusAdviceV01.NotificationCancellationRequestStatusOrNotificationAdviceStatusRule,
						com.tools20022.repository.area.seev.AgentCANotificationStatusAdviceV01.AgentCANotificationAdviceIDOrAgentCANotificationCancellationRequestIDRule);
				rootElement = "Document";
				xmlTag = "AgtCANtfctnStsAdvc";
				businessArea_lazy = () -> SecuritiesEventsLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.seev.AgentCANotificationStatusAdviceV01.mmIdentification,
						com.tools20022.repository.area.seev.AgentCANotificationStatusAdviceV01.mmAgentCANotificationAdviceIdentification,
						com.tools20022.repository.area.seev.AgentCANotificationStatusAdviceV01.mmAgentCANotificationCancellationRequestIdentification,
						com.tools20022.repository.area.seev.AgentCANotificationStatusAdviceV01.mmCorporateActionGeneralInformation,
						com.tools20022.repository.area.seev.AgentCANotificationStatusAdviceV01.mmNotificationCancellationRequestStatus, com.tools20022.repository.area.seev.AgentCANotificationStatusAdviceV01.mmNotificationAdviceStatus);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "seev";
						messageFunctionality = "011";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return AgentCANotificationStatusAdviceV01.class;
			}
		});
		return mmObject_lazy.get();
	}

	public DocumentIdentification8 getIdentification() {
		return identification;
	}

	public AgentCANotificationStatusAdviceV01 setIdentification(DocumentIdentification8 identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public DocumentIdentification8 getAgentCANotificationAdviceIdentification() {
		return agentCANotificationAdviceIdentification;
	}

	public AgentCANotificationStatusAdviceV01 setAgentCANotificationAdviceIdentification(DocumentIdentification8 agentCANotificationAdviceIdentification) {
		this.agentCANotificationAdviceIdentification = Objects.requireNonNull(agentCANotificationAdviceIdentification);
		return this;
	}

	public DocumentIdentification8 getAgentCANotificationCancellationRequestIdentification() {
		return agentCANotificationCancellationRequestIdentification;
	}

	public AgentCANotificationStatusAdviceV01 setAgentCANotificationCancellationRequestIdentification(DocumentIdentification8 agentCANotificationCancellationRequestIdentification) {
		this.agentCANotificationCancellationRequestIdentification = Objects.requireNonNull(agentCANotificationCancellationRequestIdentification);
		return this;
	}

	public CorporateActionInformation2 getCorporateActionGeneralInformation() {
		return corporateActionGeneralInformation;
	}

	public AgentCANotificationStatusAdviceV01 setCorporateActionGeneralInformation(CorporateActionInformation2 corporateActionGeneralInformation) {
		this.corporateActionGeneralInformation = Objects.requireNonNull(corporateActionGeneralInformation);
		return this;
	}

	public NotificationCancellationRequestStatus1Choice getNotificationCancellationRequestStatus() {
		return notificationCancellationRequestStatus;
	}

	public AgentCANotificationStatusAdviceV01 setNotificationCancellationRequestStatus(NotificationCancellationRequestStatus1Choice notificationCancellationRequestStatus) {
		this.notificationCancellationRequestStatus = Objects.requireNonNull(notificationCancellationRequestStatus);
		return this;
	}

	public NotificationAdviceStatus1Choice getNotificationAdviceStatus() {
		return notificationAdviceStatus;
	}

	public AgentCANotificationStatusAdviceV01 setNotificationAdviceStatus(NotificationAdviceStatus1Choice notificationAdviceStatus) {
		this.notificationAdviceStatus = Objects.requireNonNull(notificationAdviceStatus);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.011.001.01")
	static public class Document {
		@XmlElement(name = "AgtCANtfctnStsAdvc", required = true)
		public AgentCANotificationStatusAdviceV01 messageBody;
	}
}