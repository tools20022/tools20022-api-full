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

import com.tools20022.metamodel.*;
import com.tools20022.repository.area.seev.*;
import com.tools20022.repository.codeset.MeetingType2Code;
import com.tools20022.repository.codeset.MeetingTypeClassification1Code;
import com.tools20022.repository.datatype.Extended350Code;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.IssuerMeeting;
import com.tools20022.repository.entity.Meeting;
import com.tools20022.repository.entity.PostalAddress;
import com.tools20022.repository.GeneratedRepository;
import java.text.DateFormat;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Elements which allow to identify a meeting.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponent#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingReference3#ClassificationOrExtendedClassificationRule
 * MeetingReference3.ClassificationOrExtendedClassificationRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingReference3#mmMeetingIdentification
 * MeetingReference3.mmMeetingIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingReference3#mmIssuerMeetingIdentification
 * MeetingReference3.mmIssuerMeetingIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingReference3#mmMeetingDateAndTime
 * MeetingReference3.mmMeetingDateAndTime}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MeetingReference3#mmType
 * MeetingReference3.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingReference3#mmClassification
 * MeetingReference3.mmClassification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingReference3#mmExtendedClassification
 * MeetingReference3.mmExtendedClassification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MeetingReference3#mmLocation
 * MeetingReference3.mmLocation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Meeting Meeting}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingEntitlementNotificationV02#mmMeetingReference
 * MeetingEntitlementNotificationV02.mmMeetingReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingInstructionV02#mmMeetingReference
 * MeetingInstructionV02.mmMeetingReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingInstructionCancellationRequestV02#mmMeetingReference
 * MeetingInstructionCancellationRequestV02.mmMeetingReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingInstructionStatusV02#mmMeetingReference
 * MeetingInstructionStatusV02.mmMeetingReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingVoteExecutionConfirmationV02#mmMeetingReference
 * MeetingVoteExecutionConfirmationV02.mmMeetingReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingResultDisseminationV02#mmMeetingReference
 * MeetingResultDisseminationV02.mmMeetingReference}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MeetingReference3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Elements which allow to identify a meeting."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "MeetingReference3", propOrder = {"meetingIdentification", "issuerMeetingIdentification", "meetingDateAndTime", "type", "classification", "extendedClassification", "location"})
public class MeetingReference3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "MtgId")
	protected Max35Text meetingIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Meeting#mmIdentification
	 * Meeting.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MeetingReference3
	 * MeetingReference3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MtgId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MeetingIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification assigned to a general meeting by the party notifying the meeting. It must be unique for the party notifying the meeting."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMeetingIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Meeting.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.MeetingReference3.mmObject();
			isDerived = false;
			xmlTag = "MtgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MeetingIdentification";
			definition = "Identification assigned to a general meeting by the party notifying the meeting. It must be unique for the party notifying the meeting.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "IssrMtgId")
	protected Max35Text issuerMeetingIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.IssuerMeeting#mmIssuerMeetingIdentification
	 * IssuerMeeting.mmIssuerMeetingIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MeetingReference3
	 * MeetingReference3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IssrMtgId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerMeetingIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification assigned to a meeting by the issuer. It must be unique for the issuer."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIssuerMeetingIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> IssuerMeeting.mmIssuerMeetingIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.MeetingReference3.mmObject();
			isDerived = false;
			xmlTag = "IssrMtgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerMeetingIdentification";
			definition = "Identification assigned to a meeting by the issuer. It must be unique for the issuer.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "MtgDtAndTm", required = true)
	protected ISODateTime meetingDateAndTime;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Meeting#mmDateAndTime
	 * Meeting.mmDateAndTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MeetingReference3
	 * MeetingReference3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MtgDtAndTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MeetingDateAndTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date and time at which the meeting will take place."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMeetingDateAndTime = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Meeting.mmDateAndTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.MeetingReference3.mmObject();
			isDerived = false;
			xmlTag = "MtgDtAndTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MeetingDateAndTime";
			definition = "Date and time at which the meeting will take place.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	@XmlElement(name = "Tp", required = true)
	protected MeetingType2Code type;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.MeetingType2Code
	 * MeetingType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Meeting#mmType
	 * Meeting.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MeetingReference3
	 * MeetingReference3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of meeting for which instructions are sent."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Meeting.mmType;
			componentContext_lazy = () -> com.tools20022.repository.msg.MeetingReference3.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Specifies the type of meeting for which instructions are sent.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> MeetingType2Code.mmObject();
		}
	};
	@XmlElement(name = "Clssfctn")
	protected MeetingTypeClassification1Code classification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.MeetingTypeClassification1Code
	 * MeetingTypeClassification1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Meeting#mmMeetingEventClassification
	 * Meeting.mmMeetingEventClassification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MeetingReference3
	 * MeetingReference3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Clssfctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Classification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Classifies the type of meeting."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmClassification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Meeting.mmMeetingEventClassification;
			componentContext_lazy = () -> com.tools20022.repository.msg.MeetingReference3.mmObject();
			isDerived = false;
			xmlTag = "Clssfctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Classification";
			definition = "Classifies the type of meeting.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> MeetingTypeClassification1Code.mmObject();
		}
	};
	@XmlElement(name = "XtndedClssfctn")
	protected Extended350Code extendedClassification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Extended350Code
	 * Extended350Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Meeting#mmMeetingEventClassification
	 * Meeting.mmMeetingEventClassification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MeetingReference3
	 * MeetingReference3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XtndedClssfctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExtendedClassification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "This code can be used in case another meeting classifications is required."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExtendedClassification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Meeting.mmMeetingEventClassification;
			componentContext_lazy = () -> com.tools20022.repository.msg.MeetingReference3.mmObject();
			isDerived = false;
			xmlTag = "XtndedClssfctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExtendedClassification";
			definition = "This code can be used in case another meeting classifications is required.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Extended350Code.mmObject();
		}
	};
	@XmlElement(name = "Lctn")
	protected List<com.tools20022.repository.msg.PostalAddress1> location;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PostalAddress1
	 * PostalAddress1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress PostalAddress}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MeetingReference3
	 * MeetingReference3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Lctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Location"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Place of the company meeting for the scheduled meeting date."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmLocation = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> PostalAddress.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.MeetingReference3.mmObject();
			isDerived = false;
			xmlTag = "Lctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Location";
			definition = "Place of the company meeting for the scheduled meeting date.";
			maxOccurs = 5;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PostalAddress1.mmObject();
		}
	};
	/**
	 * Either Classification or ExtendedClassification may be present, but not
	 * both.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.MeetingReference3
	 * MeetingReference3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingReference3#mmClassification
	 * MeetingReference3.mmClassification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingReference3#mmExtendedClassification
	 * MeetingReference3.mmExtendedClassification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClassificationOrExtendedClassificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either Classification or ExtendedClassification may be present, but not both."
	 * </li>
	 * </ul>
	 */
	public static final MMXor ClassificationOrExtendedClassificationRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClassificationOrExtendedClassificationRule";
			definition = "Either Classification or ExtendedClassification may be present, but not both.";
			messageComponent_lazy = () -> com.tools20022.repository.msg.MeetingReference3.mmObject();
			impactedElements_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MeetingReference3.mmClassification, com.tools20022.repository.msg.MeetingReference3.mmExtendedClassification);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MeetingReference3.mmMeetingIdentification, com.tools20022.repository.msg.MeetingReference3.mmIssuerMeetingIdentification,
						com.tools20022.repository.msg.MeetingReference3.mmMeetingDateAndTime, com.tools20022.repository.msg.MeetingReference3.mmType, com.tools20022.repository.msg.MeetingReference3.mmClassification,
						com.tools20022.repository.msg.MeetingReference3.mmExtendedClassification, com.tools20022.repository.msg.MeetingReference3.mmLocation);
				messageBuildingBlock_lazy = () -> Arrays.asList(MeetingEntitlementNotificationV02.mmMeetingReference, MeetingInstructionV02.mmMeetingReference, MeetingInstructionCancellationRequestV02.mmMeetingReference,
						MeetingInstructionStatusV02.mmMeetingReference, MeetingVoteExecutionConfirmationV02.mmMeetingReference, MeetingResultDisseminationV02.mmMeetingReference);
				trace_lazy = () -> Meeting.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "MeetingReference3";
				definition = "Elements which allow to identify a meeting.";
				xors_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MeetingReference3.ClassificationOrExtendedClassificationRule);
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max35Text> getMeetingIdentification() {
		return meetingIdentification == null ? Optional.empty() : Optional.of(meetingIdentification);
	}

	public MeetingReference3 setMeetingIdentification(Max35Text meetingIdentification) {
		this.meetingIdentification = meetingIdentification;
		return this;
	}

	public Optional<Max35Text> getIssuerMeetingIdentification() {
		return issuerMeetingIdentification == null ? Optional.empty() : Optional.of(issuerMeetingIdentification);
	}

	public MeetingReference3 setIssuerMeetingIdentification(Max35Text issuerMeetingIdentification) {
		this.issuerMeetingIdentification = issuerMeetingIdentification;
		return this;
	}

	public ISODateTime getMeetingDateAndTime() {
		return meetingDateAndTime;
	}

	public MeetingReference3 setMeetingDateAndTime(ISODateTime meetingDateAndTime) {
		this.meetingDateAndTime = Objects.requireNonNull(meetingDateAndTime);
		return this;
	}

	public MeetingType2Code getType() {
		return type;
	}

	public MeetingReference3 setType(MeetingType2Code type) {
		this.type = Objects.requireNonNull(type);
		return this;
	}

	public Optional<MeetingTypeClassification1Code> getClassification() {
		return classification == null ? Optional.empty() : Optional.of(classification);
	}

	public MeetingReference3 setClassification(MeetingTypeClassification1Code classification) {
		this.classification = classification;
		return this;
	}

	public Optional<Extended350Code> getExtendedClassification() {
		return extendedClassification == null ? Optional.empty() : Optional.of(extendedClassification);
	}

	public MeetingReference3 setExtendedClassification(Extended350Code extendedClassification) {
		this.extendedClassification = extendedClassification;
		return this;
	}

	public List<PostalAddress1> getLocation() {
		return location == null ? location = new ArrayList<>() : location;
	}

	public MeetingReference3 setLocation(List<com.tools20022.repository.msg.PostalAddress1> location) {
		this.location = Objects.requireNonNull(location);
		return this;
	}
}