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
import com.tools20022.repository.datatype.ISODate;
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
 * {@linkplain com.tools20022.repository.msg.CorporateActionNotificationSD6#mmPlaceAndName
 * CorporateActionNotificationSD6.mmPlaceAndName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNotificationSD6#mmEventStatus
 * CorporateActionNotificationSD6.mmEventStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNotificationSD6#mmApprovedDate
 * CorporateActionNotificationSD6.mmApprovedDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNotificationSD6#mmMatchDate
 * CorporateActionNotificationSD6.mmMatchDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNotificationSD6#mmActiveUntilDate
 * CorporateActionNotificationSD6.mmActiveUntilDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNotificationSD6#mmServiceLevelAgreementPeriod
 * CorporateActionNotificationSD6.mmServiceLevelAgreementPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNotificationSD6#mmValidationNotSupportedReason
 * CorporateActionNotificationSD6.mmValidationNotSupportedReason}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionNotificationSD6"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides additional information regarding notification general information details."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionNotificationSD6", propOrder = {"placeAndName", "eventStatus", "approvedDate", "matchDate", "activeUntilDate", "serviceLevelAgreementPeriod", "validationNotSupportedReason"})
public class CorporateActionNotificationSD6 {

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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNotificationSD6
	 * CorporateActionNotificationSD6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PlcAndNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceAndName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "xPath to the element that is being extended."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionNotificationSD6, Max350Text> mmPlaceAndName = new MMMessageAttribute<CorporateActionNotificationSD6, Max350Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionNotificationSD6.mmObject();
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
		public Max350Text getValue(CorporateActionNotificationSD6 obj) {
			return obj.getPlaceAndName();
		}

		@Override
		public void setValue(CorporateActionNotificationSD6 obj, Max350Text value) {
			obj.setPlaceAndName(value);
		}
	};
	@XmlElement(name = "EvtSts")
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNotificationSD6
	 * CorporateActionNotificationSD6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EvtSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Declared Event Status</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Workflow status of the event."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionNotificationSD6, Optional<EventWorkflowStatus1Code>> mmEventStatus = new MMMessageAttribute<CorporateActionNotificationSD6, Optional<EventWorkflowStatus1Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionNotificationSD6.mmObject();
			isDerived = false;
			xmlTag = "EvtSts";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Declared Event Status"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventStatus";
			definition = "Workflow status of the event.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> EventWorkflowStatus1Code.mmObject();
		}

		@Override
		public Optional<EventWorkflowStatus1Code> getValue(CorporateActionNotificationSD6 obj) {
			return obj.getEventStatus();
		}

		@Override
		public void setValue(CorporateActionNotificationSD6 obj, Optional<EventWorkflowStatus1Code> value) {
			obj.setEventStatus(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNotificationSD6
	 * CorporateActionNotificationSD6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ApprvdDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Approved Date</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ApprovedDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date by which the announcement is set to approve event status."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionNotificationSD6, Optional<ISODate>> mmApprovedDate = new MMMessageAttribute<CorporateActionNotificationSD6, Optional<ISODate>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionNotificationSD6.mmObject();
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
		public Optional<ISODate> getValue(CorporateActionNotificationSD6 obj) {
			return obj.getApprovedDate();
		}

		@Override
		public void setValue(CorporateActionNotificationSD6 obj, Optional<ISODate> value) {
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNotificationSD6
	 * CorporateActionNotificationSD6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MtchDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Match Date</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MatchDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date used to match records from multiple vendors to the same event. It is typically the first key date on the event."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionNotificationSD6, Optional<ISODate>> mmMatchDate = new MMMessageAttribute<CorporateActionNotificationSD6, Optional<ISODate>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionNotificationSD6.mmObject();
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
		public Optional<ISODate> getValue(CorporateActionNotificationSD6 obj) {
			return obj.getMatchDate();
		}

		@Override
		public void setValue(CorporateActionNotificationSD6 obj, Optional<ISODate> value) {
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNotificationSD6
	 * CorporateActionNotificationSD6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ActvUntilDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Active Until Date</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ActiveUntilDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date until which the event will remain in an active status on DTCC (The Depository Trust and Clearing Corporation) system."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionNotificationSD6, Optional<ISODate>> mmActiveUntilDate = new MMMessageAttribute<CorporateActionNotificationSD6, Optional<ISODate>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionNotificationSD6.mmObject();
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
		public Optional<ISODate> getValue(CorporateActionNotificationSD6 obj) {
			return obj.getActiveUntilDate();
		}

		@Override
		public void setValue(CorporateActionNotificationSD6 obj, Optional<ISODate> value) {
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNotificationSD6
	 * CorporateActionNotificationSD6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SvcLvlAgrmtPrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: SLA Begin Date, DTCCSynonym: SLA End Date</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ServiceLevelAgreementPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Start date and end date of the service level agreement."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionNotificationSD6, Optional<Period3>> mmServiceLevelAgreementPeriod = new MMMessageAttribute<CorporateActionNotificationSD6, Optional<Period3>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionNotificationSD6.mmObject();
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
		public Optional<Period3> getValue(CorporateActionNotificationSD6 obj) {
			return obj.getServiceLevelAgreementPeriod();
		}

		@Override
		public void setValue(CorporateActionNotificationSD6 obj, Optional<Period3> value) {
			obj.setServiceLevelAgreementPeriod(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNotificationSD6
	 * CorporateActionNotificationSD6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VldtnNotSpprtdRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Validation Not Supported Reason Code</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValidationNotSupportedReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies a reason why a corporate action will not be supported by the validation service. This is usually due to the event type or the product (security) type. The list of values will be provided externally to the schema."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionNotificationSD6, Optional<Max4AlphaNumericText>> mmValidationNotSupportedReason = new MMMessageAttribute<CorporateActionNotificationSD6, Optional<Max4AlphaNumericText>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionNotificationSD6.mmObject();
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
		public Optional<Max4AlphaNumericText> getValue(CorporateActionNotificationSD6 obj) {
			return obj.getValidationNotSupportedReason();
		}

		@Override
		public void setValue(CorporateActionNotificationSD6 obj, Optional<Max4AlphaNumericText> value) {
			obj.setValidationNotSupportedReason(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionNotificationSD6.mmPlaceAndName, com.tools20022.repository.msg.CorporateActionNotificationSD6.mmEventStatus,
						com.tools20022.repository.msg.CorporateActionNotificationSD6.mmApprovedDate, com.tools20022.repository.msg.CorporateActionNotificationSD6.mmMatchDate,
						com.tools20022.repository.msg.CorporateActionNotificationSD6.mmActiveUntilDate, com.tools20022.repository.msg.CorporateActionNotificationSD6.mmServiceLevelAgreementPeriod,
						com.tools20022.repository.msg.CorporateActionNotificationSD6.mmValidationNotSupportedReason);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "CorporateActionNotificationSD6";
				definition = "Provides additional information regarding notification general information details.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max350Text getPlaceAndName() {
		return placeAndName;
	}

	public CorporateActionNotificationSD6 setPlaceAndName(Max350Text placeAndName) {
		this.placeAndName = Objects.requireNonNull(placeAndName);
		return this;
	}

	public Optional<EventWorkflowStatus1Code> getEventStatus() {
		return eventStatus == null ? Optional.empty() : Optional.of(eventStatus);
	}

	public CorporateActionNotificationSD6 setEventStatus(EventWorkflowStatus1Code eventStatus) {
		this.eventStatus = eventStatus;
		return this;
	}

	public Optional<ISODate> getApprovedDate() {
		return approvedDate == null ? Optional.empty() : Optional.of(approvedDate);
	}

	public CorporateActionNotificationSD6 setApprovedDate(ISODate approvedDate) {
		this.approvedDate = approvedDate;
		return this;
	}

	public Optional<ISODate> getMatchDate() {
		return matchDate == null ? Optional.empty() : Optional.of(matchDate);
	}

	public CorporateActionNotificationSD6 setMatchDate(ISODate matchDate) {
		this.matchDate = matchDate;
		return this;
	}

	public Optional<ISODate> getActiveUntilDate() {
		return activeUntilDate == null ? Optional.empty() : Optional.of(activeUntilDate);
	}

	public CorporateActionNotificationSD6 setActiveUntilDate(ISODate activeUntilDate) {
		this.activeUntilDate = activeUntilDate;
		return this;
	}

	public Optional<Period3> getServiceLevelAgreementPeriod() {
		return serviceLevelAgreementPeriod == null ? Optional.empty() : Optional.of(serviceLevelAgreementPeriod);
	}

	public CorporateActionNotificationSD6 setServiceLevelAgreementPeriod(Period3 serviceLevelAgreementPeriod) {
		this.serviceLevelAgreementPeriod = serviceLevelAgreementPeriod;
		return this;
	}

	public Optional<Max4AlphaNumericText> getValidationNotSupportedReason() {
		return validationNotSupportedReason == null ? Optional.empty() : Optional.of(validationNotSupportedReason);
	}

	public CorporateActionNotificationSD6 setValidationNotSupportedReason(Max4AlphaNumericText validationNotSupportedReason) {
		this.validationNotSupportedReason = validationNotSupportedReason;
		return this;
	}
}