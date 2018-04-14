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

import com.tools20022.metamodel.ext.DTCCSynonym;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.EventWorkflowStatus1Code;
import com.tools20022.repository.codeset.IssuerStatus1Code;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max4AlphaNumericText;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.Period3;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides additional information regarding notification general information
 * details.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NotificationGeneralInformationExtension1#mmPlaceAndName
 * NotificationGeneralInformationExtension1.mmPlaceAndName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NotificationGeneralInformationExtension1#mmEventStatus
 * NotificationGeneralInformationExtension1.mmEventStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NotificationGeneralInformationExtension1#mmCreateDateAndTime
 * NotificationGeneralInformationExtension1.mmCreateDateAndTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NotificationGeneralInformationExtension1#mmUpdateDateAndTime
 * NotificationGeneralInformationExtension1.mmUpdateDateAndTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NotificationGeneralInformationExtension1#mmApprovedDate
 * NotificationGeneralInformationExtension1.mmApprovedDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NotificationGeneralInformationExtension1#mmMatchDate
 * NotificationGeneralInformationExtension1.mmMatchDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NotificationGeneralInformationExtension1#mmActiveUntilDate
 * NotificationGeneralInformationExtension1.mmActiveUntilDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NotificationGeneralInformationExtension1#mmServiceLevelAgreementPeriod
 * NotificationGeneralInformationExtension1.mmServiceLevelAgreementPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NotificationGeneralInformationExtension1#mmIssuerStatus
 * NotificationGeneralInformationExtension1.mmIssuerStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NotificationGeneralInformationExtension1#mmValidationNotSupportedReason
 * NotificationGeneralInformationExtension1.mmValidationNotSupportedReason}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "NotificationGeneralInformationExtension1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides additional information regarding notification general information details."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "NotificationGeneralInformationExtension1", propOrder = {"placeAndName", "eventStatus", "createDateAndTime", "updateDateAndTime", "approvedDate", "matchDate", "activeUntilDate", "serviceLevelAgreementPeriod",
		"issuerStatus", "validationNotSupportedReason"})
public class NotificationGeneralInformationExtension1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PlcAndNm", required = true)
	protected Max350Text placeAndName;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NotificationGeneralInformationExtension1
	 * NotificationGeneralInformationExtension1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PlcAndNm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceAndName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "xPath to the element that is being extended."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<NotificationGeneralInformationExtension1, Max350Text> mmPlaceAndName = new MMMessageAttribute<NotificationGeneralInformationExtension1, Max350Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.NotificationGeneralInformationExtension1.mmObject();
			isDerived = false;
			xmlTag = "PlcAndNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceAndName";
			definition = "xPath to the element that is being extended.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Max350Text getValue(NotificationGeneralInformationExtension1 obj) {
			return obj.getPlaceAndName();
		}

		@Override
		public void setValue(NotificationGeneralInformationExtension1 obj, Max350Text value) {
			obj.setPlaceAndName(value);
		}
	};
	@XmlElement(name = "EvtSts", required = true)
	protected EventWorkflowStatus1Code eventStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.EventWorkflowStatus1Code
	 * EventWorkflowStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NotificationGeneralInformationExtension1
	 * NotificationGeneralInformationExtension1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EvtSts"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Workflow status of the event."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Event Status</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<NotificationGeneralInformationExtension1, EventWorkflowStatus1Code> mmEventStatus = new MMMessageAttribute<NotificationGeneralInformationExtension1, EventWorkflowStatus1Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.NotificationGeneralInformationExtension1.mmObject();
			isDerived = false;
			xmlTag = "EvtSts";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Event Status"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventStatus";
			definition = "Workflow status of the event.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> EventWorkflowStatus1Code.mmObject();
		}

		@Override
		public EventWorkflowStatus1Code getValue(NotificationGeneralInformationExtension1 obj) {
			return obj.getEventStatus();
		}

		@Override
		public void setValue(NotificationGeneralInformationExtension1 obj, EventWorkflowStatus1Code value) {
			obj.setEventStatus(value);
		}
	};
	@XmlElement(name = "CretDtAndTm", required = true)
	protected ISODateTime createDateAndTime;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NotificationGeneralInformationExtension1
	 * NotificationGeneralInformationExtension1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CretDtAndTm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreateDateAndTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time when DTCC (The Depository Trust and Clearing Corporation) created the announcement record."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Create Date and Time</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<NotificationGeneralInformationExtension1, ISODateTime> mmCreateDateAndTime = new MMMessageAttribute<NotificationGeneralInformationExtension1, ISODateTime>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.NotificationGeneralInformationExtension1.mmObject();
			isDerived = false;
			xmlTag = "CretDtAndTm";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Create Date and Time"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreateDateAndTime";
			definition = "Date and time when DTCC (The Depository Trust and Clearing Corporation) created the announcement record.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(NotificationGeneralInformationExtension1 obj) {
			return obj.getCreateDateAndTime();
		}

		@Override
		public void setValue(NotificationGeneralInformationExtension1 obj, ISODateTime value) {
			obj.setCreateDateAndTime(value);
		}
	};
	@XmlElement(name = "UpdDtAndTm")
	protected ISODateTime updateDateAndTime;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NotificationGeneralInformationExtension1
	 * NotificationGeneralInformationExtension1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UpdDtAndTm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UpdateDateAndTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time when DTCC (The Depository Trust and Clearing Corporation) last updated the announcement."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Update Date and Time</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<NotificationGeneralInformationExtension1, Optional<ISODateTime>> mmUpdateDateAndTime = new MMMessageAttribute<NotificationGeneralInformationExtension1, Optional<ISODateTime>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.NotificationGeneralInformationExtension1.mmObject();
			isDerived = false;
			xmlTag = "UpdDtAndTm";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Update Date and Time"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UpdateDateAndTime";
			definition = "Date and time when DTCC (The Depository Trust and Clearing Corporation) last updated the announcement.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public Optional<ISODateTime> getValue(NotificationGeneralInformationExtension1 obj) {
			return obj.getUpdateDateAndTime();
		}

		@Override
		public void setValue(NotificationGeneralInformationExtension1 obj, Optional<ISODateTime> value) {
			obj.setUpdateDateAndTime(value.orElse(null));
		}
	};
	@XmlElement(name = "ApprvdDt")
	protected ISODate approvedDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NotificationGeneralInformationExtension1
	 * NotificationGeneralInformationExtension1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ApprvdDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ApprovedDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date by which the announcement is set to approve event status."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Approved Date</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<NotificationGeneralInformationExtension1, Optional<ISODate>> mmApprovedDate = new MMMessageAttribute<NotificationGeneralInformationExtension1, Optional<ISODate>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.NotificationGeneralInformationExtension1.mmObject();
			isDerived = false;
			xmlTag = "ApprvdDt";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Approved Date"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ApprovedDate";
			definition = "Date by which the announcement is set to approve event status.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(NotificationGeneralInformationExtension1 obj) {
			return obj.getApprovedDate();
		}

		@Override
		public void setValue(NotificationGeneralInformationExtension1 obj, Optional<ISODate> value) {
			obj.setApprovedDate(value.orElse(null));
		}
	};
	@XmlElement(name = "MtchDt")
	protected ISODate matchDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NotificationGeneralInformationExtension1
	 * NotificationGeneralInformationExtension1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MtchDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MatchDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date used to match records from multiple vendors to the same event. It is typically the first key date on the event."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Match Date</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<NotificationGeneralInformationExtension1, Optional<ISODate>> mmMatchDate = new MMMessageAttribute<NotificationGeneralInformationExtension1, Optional<ISODate>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.NotificationGeneralInformationExtension1.mmObject();
			isDerived = false;
			xmlTag = "MtchDt";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Match Date"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MatchDate";
			definition = "Date used to match records from multiple vendors to the same event. It is typically the first key date on the event.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(NotificationGeneralInformationExtension1 obj) {
			return obj.getMatchDate();
		}

		@Override
		public void setValue(NotificationGeneralInformationExtension1 obj, Optional<ISODate> value) {
			obj.setMatchDate(value.orElse(null));
		}
	};
	@XmlElement(name = "ActvUntilDt")
	protected ISODate activeUntilDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NotificationGeneralInformationExtension1
	 * NotificationGeneralInformationExtension1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ActvUntilDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ActiveUntilDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date until which the event will remain in an active status on DTCC (The Depository Trust and Clearing Corporation) system."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Active Until Date</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<NotificationGeneralInformationExtension1, Optional<ISODate>> mmActiveUntilDate = new MMMessageAttribute<NotificationGeneralInformationExtension1, Optional<ISODate>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.NotificationGeneralInformationExtension1.mmObject();
			isDerived = false;
			xmlTag = "ActvUntilDt";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Active Until Date"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ActiveUntilDate";
			definition = "Date until which the event will remain in an active status on DTCC (The Depository Trust and Clearing Corporation) system.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(NotificationGeneralInformationExtension1 obj) {
			return obj.getActiveUntilDate();
		}

		@Override
		public void setValue(NotificationGeneralInformationExtension1 obj, Optional<ISODate> value) {
			obj.setActiveUntilDate(value.orElse(null));
		}
	};
	@XmlElement(name = "SvcLvlAgrmtPrd")
	protected Period3 serviceLevelAgreementPeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Period3 Period3}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NotificationGeneralInformationExtension1
	 * NotificationGeneralInformationExtension1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SvcLvlAgrmtPrd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ServiceLevelAgreementPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Start date and end date of the service level agreement."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: SLA Begin Date, DTCCSynonym: SLA End Date</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<NotificationGeneralInformationExtension1, Optional<Period3>> mmServiceLevelAgreementPeriod = new MMMessageAttribute<NotificationGeneralInformationExtension1, Optional<Period3>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.NotificationGeneralInformationExtension1.mmObject();
			isDerived = false;
			xmlTag = "SvcLvlAgrmtPrd";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "SLA Begin Date"), new DTCCSynonym(this, "SLA End Date"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ServiceLevelAgreementPeriod";
			definition = "Start date and end date of the service level agreement.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Period3.mmObject();
		}

		@Override
		public Optional<Period3> getValue(NotificationGeneralInformationExtension1 obj) {
			return obj.getServiceLevelAgreementPeriod();
		}

		@Override
		public void setValue(NotificationGeneralInformationExtension1 obj, Optional<Period3> value) {
			obj.setServiceLevelAgreementPeriod(value.orElse(null));
		}
	};
	@XmlElement(name = "IssrSts")
	protected IssuerStatus1Code issuerStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.IssuerStatus1Code
	 * IssuerStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NotificationGeneralInformationExtension1
	 * NotificationGeneralInformationExtension1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IssrSts"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of the event as announced by the issuer/offeror."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Issuer Status</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<NotificationGeneralInformationExtension1, Optional<IssuerStatus1Code>> mmIssuerStatus = new MMMessageAttribute<NotificationGeneralInformationExtension1, Optional<IssuerStatus1Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.NotificationGeneralInformationExtension1.mmObject();
			isDerived = false;
			xmlTag = "IssrSts";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Issuer Status"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerStatus";
			definition = "Status of the event as announced by the issuer/offeror.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> IssuerStatus1Code.mmObject();
		}

		@Override
		public Optional<IssuerStatus1Code> getValue(NotificationGeneralInformationExtension1 obj) {
			return obj.getIssuerStatus();
		}

		@Override
		public void setValue(NotificationGeneralInformationExtension1 obj, Optional<IssuerStatus1Code> value) {
			obj.setIssuerStatus(value.orElse(null));
		}
	};
	@XmlElement(name = "VldtnNotSpprtdRsn")
	protected Max4AlphaNumericText validationNotSupportedReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max4AlphaNumericText
	 * Max4AlphaNumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NotificationGeneralInformationExtension1
	 * NotificationGeneralInformationExtension1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VldtnNotSpprtdRsn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValidationNotSupportedReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies a reason why a corporate action will not be supported by the validation service. This is usually due to the event type or the product (security) type. The list of values will be provided externally to the schema."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Validation Not Supported Reason Code</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<NotificationGeneralInformationExtension1, Optional<Max4AlphaNumericText>> mmValidationNotSupportedReason = new MMMessageAttribute<NotificationGeneralInformationExtension1, Optional<Max4AlphaNumericText>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.NotificationGeneralInformationExtension1.mmObject();
			isDerived = false;
			xmlTag = "VldtnNotSpprtdRsn";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Validation Not Supported Reason Code"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValidationNotSupportedReason";
			definition = "Specifies a reason why a corporate action will not be supported by the validation service. This is usually due to the event type or the product (security) type. The list of values will be provided externally to the schema.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max4AlphaNumericText.mmObject();
		}

		@Override
		public Optional<Max4AlphaNumericText> getValue(NotificationGeneralInformationExtension1 obj) {
			return obj.getValidationNotSupportedReason();
		}

		@Override
		public void setValue(NotificationGeneralInformationExtension1 obj, Optional<Max4AlphaNumericText> value) {
			obj.setValidationNotSupportedReason(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.NotificationGeneralInformationExtension1.mmPlaceAndName, com.tools20022.repository.msg.NotificationGeneralInformationExtension1.mmEventStatus,
						com.tools20022.repository.msg.NotificationGeneralInformationExtension1.mmCreateDateAndTime, com.tools20022.repository.msg.NotificationGeneralInformationExtension1.mmUpdateDateAndTime,
						com.tools20022.repository.msg.NotificationGeneralInformationExtension1.mmApprovedDate, com.tools20022.repository.msg.NotificationGeneralInformationExtension1.mmMatchDate,
						com.tools20022.repository.msg.NotificationGeneralInformationExtension1.mmActiveUntilDate, com.tools20022.repository.msg.NotificationGeneralInformationExtension1.mmServiceLevelAgreementPeriod,
						com.tools20022.repository.msg.NotificationGeneralInformationExtension1.mmIssuerStatus, com.tools20022.repository.msg.NotificationGeneralInformationExtension1.mmValidationNotSupportedReason);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "NotificationGeneralInformationExtension1";
				definition = "Provides additional information regarding notification general information details.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max350Text getPlaceAndName() {
		return placeAndName;
	}

	public NotificationGeneralInformationExtension1 setPlaceAndName(Max350Text placeAndName) {
		this.placeAndName = Objects.requireNonNull(placeAndName);
		return this;
	}

	public EventWorkflowStatus1Code getEventStatus() {
		return eventStatus;
	}

	public NotificationGeneralInformationExtension1 setEventStatus(EventWorkflowStatus1Code eventStatus) {
		this.eventStatus = Objects.requireNonNull(eventStatus);
		return this;
	}

	public ISODateTime getCreateDateAndTime() {
		return createDateAndTime;
	}

	public NotificationGeneralInformationExtension1 setCreateDateAndTime(ISODateTime createDateAndTime) {
		this.createDateAndTime = Objects.requireNonNull(createDateAndTime);
		return this;
	}

	public Optional<ISODateTime> getUpdateDateAndTime() {
		return updateDateAndTime == null ? Optional.empty() : Optional.of(updateDateAndTime);
	}

	public NotificationGeneralInformationExtension1 setUpdateDateAndTime(ISODateTime updateDateAndTime) {
		this.updateDateAndTime = updateDateAndTime;
		return this;
	}

	public Optional<ISODate> getApprovedDate() {
		return approvedDate == null ? Optional.empty() : Optional.of(approvedDate);
	}

	public NotificationGeneralInformationExtension1 setApprovedDate(ISODate approvedDate) {
		this.approvedDate = approvedDate;
		return this;
	}

	public Optional<ISODate> getMatchDate() {
		return matchDate == null ? Optional.empty() : Optional.of(matchDate);
	}

	public NotificationGeneralInformationExtension1 setMatchDate(ISODate matchDate) {
		this.matchDate = matchDate;
		return this;
	}

	public Optional<ISODate> getActiveUntilDate() {
		return activeUntilDate == null ? Optional.empty() : Optional.of(activeUntilDate);
	}

	public NotificationGeneralInformationExtension1 setActiveUntilDate(ISODate activeUntilDate) {
		this.activeUntilDate = activeUntilDate;
		return this;
	}

	public Optional<Period3> getServiceLevelAgreementPeriod() {
		return serviceLevelAgreementPeriod == null ? Optional.empty() : Optional.of(serviceLevelAgreementPeriod);
	}

	public NotificationGeneralInformationExtension1 setServiceLevelAgreementPeriod(Period3 serviceLevelAgreementPeriod) {
		this.serviceLevelAgreementPeriod = serviceLevelAgreementPeriod;
		return this;
	}

	public Optional<IssuerStatus1Code> getIssuerStatus() {
		return issuerStatus == null ? Optional.empty() : Optional.of(issuerStatus);
	}

	public NotificationGeneralInformationExtension1 setIssuerStatus(IssuerStatus1Code issuerStatus) {
		this.issuerStatus = issuerStatus;
		return this;
	}

	public Optional<Max4AlphaNumericText> getValidationNotSupportedReason() {
		return validationNotSupportedReason == null ? Optional.empty() : Optional.of(validationNotSupportedReason);
	}

	public NotificationGeneralInformationExtension1 setValidationNotSupportedReason(Max4AlphaNumericText validationNotSupportedReason) {
		this.validationNotSupportedReason = validationNotSupportedReason;
		return this;
	}
}