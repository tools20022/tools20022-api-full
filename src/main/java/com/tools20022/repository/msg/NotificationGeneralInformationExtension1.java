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
import com.tools20022.repository.codeset.EventWorkflowStatus1Code;
import com.tools20022.repository.codeset.IssuerStatus1Code;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max4AlphaNumericText;
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
 * {@linkplain com.tools20022.repository.msg.NotificationGeneralInformationExtension1#PlaceAndName
 * NotificationGeneralInformationExtension1.PlaceAndName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NotificationGeneralInformationExtension1#EventStatus
 * NotificationGeneralInformationExtension1.EventStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NotificationGeneralInformationExtension1#CreateDateAndTime
 * NotificationGeneralInformationExtension1.CreateDateAndTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NotificationGeneralInformationExtension1#UpdateDateAndTime
 * NotificationGeneralInformationExtension1.UpdateDateAndTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NotificationGeneralInformationExtension1#ApprovedDate
 * NotificationGeneralInformationExtension1.ApprovedDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NotificationGeneralInformationExtension1#MatchDate
 * NotificationGeneralInformationExtension1.MatchDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NotificationGeneralInformationExtension1#ActiveUntilDate
 * NotificationGeneralInformationExtension1.ActiveUntilDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NotificationGeneralInformationExtension1#ServiceLevelAgreementPeriod
 * NotificationGeneralInformationExtension1.ServiceLevelAgreementPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NotificationGeneralInformationExtension1#IssuerStatus
 * NotificationGeneralInformationExtension1.IssuerStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NotificationGeneralInformationExtension1#ValidationNotSupportedReason
 * NotificationGeneralInformationExtension1.ValidationNotSupportedReason}</li>
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
 * "NotificationGeneralInformationExtension1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides additional information regarding notification general information details."
 * </li>
 * </ul>
 */
public class NotificationGeneralInformationExtension1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
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
	 * {@linkplain com.tools20022.repository.msg.NotificationGeneralInformationExtension1
	 * NotificationGeneralInformationExtension1}</li>
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
	public static final MMMessageAttribute PlaceAndName = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> NotificationGeneralInformationExtension1.mmObject();
			isDerived = false;
			xmlTag = "PlcAndNm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceAndName";
			definition = "xPath to the element that is being extended.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
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
	 * {@linkplain com.tools20022.repository.msg.NotificationGeneralInformationExtension1
	 * NotificationGeneralInformationExtension1}</li>
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
	public static final MMMessageAttribute EventStatus = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> NotificationGeneralInformationExtension1.mmObject();
			isDerived = false;
			xmlTag = "EvtSts";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventStatus";
			definition = "Workflow status of the event.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> EventWorkflowStatus1Code.mmObject();
		}
	};
	/**
	 * Date and time when DTCC (The Depository Trust and Clearing Corporation)
	 * created the announcement record.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreateDateAndTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time when DTCC  (The Depository Trust and Clearing Corporation) created the announcement record."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute CreateDateAndTime = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> NotificationGeneralInformationExtension1.mmObject();
			isDerived = false;
			xmlTag = "CretDtAndTm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreateDateAndTime";
			definition = "Date and time when DTCC  (The Depository Trust and Clearing Corporation) created the announcement record.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Date and time when DTCC (The Depository Trust and Clearing Corporation)
	 * last updated the announcement.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UpdateDateAndTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time when DTCC  (The Depository Trust and Clearing Corporation) last updated the announcement."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute UpdateDateAndTime = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> NotificationGeneralInformationExtension1.mmObject();
			isDerived = false;
			xmlTag = "UpdDtAndTm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UpdateDateAndTime";
			definition = "Date and time when DTCC  (The Depository Trust and Clearing Corporation) last updated the announcement.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
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
	 * {@linkplain com.tools20022.repository.msg.NotificationGeneralInformationExtension1
	 * NotificationGeneralInformationExtension1}</li>
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
	public static final MMMessageAttribute ApprovedDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> NotificationGeneralInformationExtension1.mmObject();
			isDerived = false;
			xmlTag = "ApprvdDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ApprovedDate";
			definition = "Date by which the announcement is set to approve event status.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
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
	 * {@linkplain com.tools20022.repository.msg.NotificationGeneralInformationExtension1
	 * NotificationGeneralInformationExtension1}</li>
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
	public static final MMMessageAttribute MatchDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> NotificationGeneralInformationExtension1.mmObject();
			isDerived = false;
			xmlTag = "MtchDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MatchDate";
			definition = "Date used to match records from multiple vendors to the same event. It is typically the first key date on the event.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
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
	 * {@linkplain com.tools20022.repository.msg.NotificationGeneralInformationExtension1
	 * NotificationGeneralInformationExtension1}</li>
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
	public static final MMMessageAttribute ActiveUntilDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> NotificationGeneralInformationExtension1.mmObject();
			isDerived = false;
			xmlTag = "ActvUntilDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ActiveUntilDate";
			definition = "Date until which the event will remain in an active status on DTCC  (The Depository Trust and Clearing Corporation) system.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
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
	 * {@linkplain com.tools20022.repository.msg.NotificationGeneralInformationExtension1
	 * NotificationGeneralInformationExtension1}</li>
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
	public static final MMMessageAttribute ServiceLevelAgreementPeriod = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> NotificationGeneralInformationExtension1.mmObject();
			isDerived = false;
			xmlTag = "SvcLvlAgrmtPrd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ServiceLevelAgreementPeriod";
			definition = "Start date and end date of the service level agreement.";
			minOccurs = 0;
			maxOccurs = 1;
			complexType_lazy = () -> Period3.mmObject();
		}
	};
	/**
	 * Status of the event as announced by the issuer/offeror.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of the event as announced by the issuer/offeror."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute IssuerStatus = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> NotificationGeneralInformationExtension1.mmObject();
			isDerived = false;
			xmlTag = "IssrSts";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerStatus";
			definition = "Status of the event as announced by the issuer/offeror.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> IssuerStatus1Code.mmObject();
		}
	};
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
	 * {@linkplain com.tools20022.repository.msg.NotificationGeneralInformationExtension1
	 * NotificationGeneralInformationExtension1}</li>
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
	public static final MMMessageAttribute ValidationNotSupportedReason = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> NotificationGeneralInformationExtension1.mmObject();
			isDerived = false;
			xmlTag = "VldtnNotSpprtdRsn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValidationNotSupportedReason";
			definition = "Specifies a reason why a corporate action will not be supported by the validation service. This is usually due to the event type or the product (security) type. The list of values will be provided externally to the schema.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> Max4AlphaNumericText.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.NotificationGeneralInformationExtension1.PlaceAndName, com.tools20022.repository.msg.NotificationGeneralInformationExtension1.EventStatus,
						com.tools20022.repository.msg.NotificationGeneralInformationExtension1.CreateDateAndTime, com.tools20022.repository.msg.NotificationGeneralInformationExtension1.UpdateDateAndTime,
						com.tools20022.repository.msg.NotificationGeneralInformationExtension1.ApprovedDate, com.tools20022.repository.msg.NotificationGeneralInformationExtension1.MatchDate,
						com.tools20022.repository.msg.NotificationGeneralInformationExtension1.ActiveUntilDate, com.tools20022.repository.msg.NotificationGeneralInformationExtension1.ServiceLevelAgreementPeriod,
						com.tools20022.repository.msg.NotificationGeneralInformationExtension1.IssuerStatus, com.tools20022.repository.msg.NotificationGeneralInformationExtension1.ValidationNotSupportedReason);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "NotificationGeneralInformationExtension1";
				definition = "Provides additional information regarding notification general information details.";
			}
		});
		return mmObject_lazy.get();
	}
}