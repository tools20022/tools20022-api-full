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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.EventWorkflowStatus1Code;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max4AlphaNumericText;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
public class CorporateActionNotificationSD6 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max350Text placeAndName;
	/**
	 * xPath to the element that is being extended.
	 * <p>
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
	public static final MMMessageAttribute mmPlaceAndName = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionNotificationSD6.mmObject();
			isDerived = false;
			xmlTag = "PlcAndNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceAndName";
			definition = "xPath to the element that is being extended.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	protected EventWorkflowStatus1Code eventStatus;
	/**
	 * Workflow status of the event.
	 * <p>
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
	public static final MMMessageAttribute mmEventStatus = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionNotificationSD6.mmObject();
			isDerived = false;
			xmlTag = "EvtSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventStatus";
			definition = "Workflow status of the event.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> EventWorkflowStatus1Code.mmObject();
		}
	};
	protected ISODate approvedDate;
	/**
	 * Date by which the announcement is set to approve event status.
	 * <p>
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
	public static final MMMessageAttribute mmApprovedDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionNotificationSD6.mmObject();
			isDerived = false;
			xmlTag = "ApprvdDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ApprovedDate";
			definition = "Date by which the announcement is set to approve event status.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected ISODate matchDate;
	/**
	 * Date used to match records from multiple vendors to the same event. It is
	 * typically the first key date on the event.
	 * <p>
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
	public static final MMMessageAttribute mmMatchDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionNotificationSD6.mmObject();
			isDerived = false;
			xmlTag = "MtchDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MatchDate";
			definition = "Date used to match records from multiple vendors to the same event. It is typically the first key date on the event.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected ISODate activeUntilDate;
	/**
	 * Date until which the event will remain in an active status on DTCC (The
	 * Depository Trust and Clearing Corporation) system.
	 * <p>
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ActiveUntilDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date until which the event will remain in an active status on DTCC  (The Depository Trust and Clearing Corporation) system."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmActiveUntilDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionNotificationSD6.mmObject();
			isDerived = false;
			xmlTag = "ActvUntilDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ActiveUntilDate";
			definition = "Date until which the event will remain in an active status on DTCC  (The Depository Trust and Clearing Corporation) system.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected Period3 serviceLevelAgreementPeriod;
	/**
	 * Start date and end date of the service level agreement.
	 * <p>
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
	public static final MMMessageAttribute mmServiceLevelAgreementPeriod = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionNotificationSD6.mmObject();
			isDerived = false;
			xmlTag = "SvcLvlAgrmtPrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ServiceLevelAgreementPeriod";
			definition = "Start date and end date of the service level agreement.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.Period3.mmObject();
		}
	};
	protected Max4AlphaNumericText validationNotSupportedReason;
	/**
	 * Specifies a reason why a corporate action will not be supported by the
	 * validation service. This is usually due to the event type or the product
	 * (security) type. The list of values will be provided externally to the
	 * schema.
	 * <p>
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
	public static final MMMessageAttribute mmValidationNotSupportedReason = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionNotificationSD6.mmObject();
			isDerived = false;
			xmlTag = "VldtnNotSpprtdRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValidationNotSupportedReason";
			definition = "Specifies a reason why a corporate action will not be supported by the validation service. This is usually due to the event type or the product (security) type. The list of values will be provided externally to the schema.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max4AlphaNumericText.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CorporateActionNotificationSD6.mmPlaceAndName, CorporateActionNotificationSD6.mmEventStatus, CorporateActionNotificationSD6.mmApprovedDate,
						CorporateActionNotificationSD6.mmMatchDate, CorporateActionNotificationSD6.mmActiveUntilDate, CorporateActionNotificationSD6.mmServiceLevelAgreementPeriod,
						CorporateActionNotificationSD6.mmValidationNotSupportedReason);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
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

	public void setPlaceAndName(Max350Text placeAndName) {
		this.placeAndName = placeAndName;
	}

	public EventWorkflowStatus1Code getEventStatus() {
		return eventStatus;
	}

	public void setEventStatus(EventWorkflowStatus1Code eventStatus) {
		this.eventStatus = eventStatus;
	}

	public ISODate getApprovedDate() {
		return approvedDate;
	}

	public void setApprovedDate(ISODate approvedDate) {
		this.approvedDate = approvedDate;
	}

	public ISODate getMatchDate() {
		return matchDate;
	}

	public void setMatchDate(ISODate matchDate) {
		this.matchDate = matchDate;
	}

	public ISODate getActiveUntilDate() {
		return activeUntilDate;
	}

	public void setActiveUntilDate(ISODate activeUntilDate) {
		this.activeUntilDate = activeUntilDate;
	}

	public Period3 getServiceLevelAgreementPeriod() {
		return serviceLevelAgreementPeriod;
	}

	public void setServiceLevelAgreementPeriod(com.tools20022.repository.msg.Period3 serviceLevelAgreementPeriod) {
		this.serviceLevelAgreementPeriod = serviceLevelAgreementPeriod;
	}

	public Max4AlphaNumericText getValidationNotSupportedReason() {
		return validationNotSupportedReason;
	}

	public void setValidationNotSupportedReason(Max4AlphaNumericText validationNotSupportedReason) {
		this.validationNotSupportedReason = validationNotSupportedReason;
	}
}