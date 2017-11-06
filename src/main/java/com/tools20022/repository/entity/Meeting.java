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

package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.choice.MeetingTypeClassification1Choice;
import com.tools20022.repository.codeset.MeetingDateStatusCode;
import com.tools20022.repository.codeset.MeetingTypeClassificationCode;
import com.tools20022.repository.codeset.MeetingTypeCode;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Specifies the physical parameters of a general meeting. Several dates and
 * places can be defined for a meeting.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Meeting" src="doc-files/Meeting.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Meeting#mmDateAndTime
 * Meeting.mmDateAndTime}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Meeting#mmDateStatus
 * Meeting.mmDateStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Meeting#mmMeetingLocation
 * Meeting.mmMeetingLocation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Meeting#mmIdentification
 * Meeting.mmIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Meeting#mmDeadline
 * Meeting.mmDeadline}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Meeting#mmMeetingServicing
 * Meeting.mmMeetingServicing}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Meeting#mmPerson
 * Meeting.mmPerson}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Meeting#mmPartyRole
 * Meeting.mmPartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Meeting#mmStatus
 * Meeting.mmStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Meeting#mmCorporateEvent
 * Meeting.mmCorporateEvent}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Meeting#mmQuorum
 * Meeting.mmQuorum}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Meeting#mmVotingCondition
 * Meeting.mmVotingCondition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Meeting#mmAttendanceRequired
 * Meeting.mmAttendanceRequired}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Meeting#mmAttendanceConfirmation
 * Meeting.mmAttendanceConfirmation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Meeting#mmIncentivePremium
 * Meeting.mmIncentivePremium}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Meeting#mmParticipation
 * Meeting.mmParticipation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Meeting#mmResolutionProposalConditions
 * Meeting.mmResolutionProposalConditions}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Meeting#mmAgendaItem
 * Meeting.mmAgendaItem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Meeting#mmProxyAppointmentConditions
 * Meeting.mmProxyAppointmentConditions}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Meeting#mmAdditionalRight
 * Meeting.mmAdditionalRight}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Meeting#mmType
 * Meeting.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Meeting#mmPowerOfAttorneyRequirements
 * Meeting.mmPowerOfAttorneyRequirements}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Meeting#mmMeetingEventClassification
 * Meeting.mmMeetingEventClassification}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.IssuerMeeting IssuerMeeting}
 * </li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ContactPoint#mmContactPointForMeeting
 * ContactPoint.mmContactPointForMeeting}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ContactPersonRole#mmMeeting
 * ContactPersonRole.mmMeeting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmRelatedMeeting
 * CorporateActionEvent.mmRelatedMeeting}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Deadline#mmRelatedMeeting
 * Deadline.mmRelatedMeeting}</li>
 * <li>{@linkplain com.tools20022.repository.entity.MeetingPartyRole#mmMeeting
 * MeetingPartyRole.mmMeeting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ResolutionProposal#mmMeeting
 * ResolutionProposal.mmMeeting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProxyAppointmentCondition#mmMeeting
 * ProxyAppointmentCondition.mmMeeting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MeetingParticipation#mmMeeting
 * MeetingParticipation.mmMeeting}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Quorum#mmMeeting
 * Quorum.mmMeeting}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Resolution#mmMeeting
 * Resolution.mmMeeting}</li>
 * <li>{@linkplain com.tools20022.repository.entity.MeetingStatus#mmMeeting
 * MeetingStatus.mmMeeting}</li>
 * <li>{@linkplain com.tools20022.repository.entity.VotingCondition#mmMeeting
 * VotingCondition.mmMeeting}</li>
 * <li>{@linkplain com.tools20022.repository.entity.IncentivePremium#mmMeeting
 * IncentivePremium.mmMeeting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PowerOfAttorneyRequirements#mmMeeting
 * PowerOfAttorneyRequirements.mmMeeting}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AdditionalRight#mmMeeting
 * AdditionalRight.mmMeeting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MeetingServicing#mmMeetingSpecification
 * MeetingServicing.mmMeetingSpecification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.MeetingContactPerson
 * MeetingContactPerson}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Meeting1 Meeting1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MeetingContactPerson1
 * MeetingContactPerson1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Meeting2 Meeting2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.MeetingTypeClassification1Choice
 * MeetingTypeClassification1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Meeting3 Meeting3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MeetingReference1
 * MeetingReference1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MeetingReference2
 * MeetingReference2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MeetingReference5
 * MeetingReference5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MeetingReference3
 * MeetingReference3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MeetingReference4
 * MeetingReference4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MeetingReference7
 * MeetingReference7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MeetingReference6
 * MeetingReference6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Meeting4 Meeting4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MeetingContactPerson2
 * MeetingContactPerson2}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Meeting"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the physical parameters of a general meeting. Several dates and places can be defined for a  meeting."
 * </li>
 * </ul>
 */
public class Meeting {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected ISODateTime dateAndTime;
	/**
	 * Date and time at which the meeting will take place.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Meeting
	 * Meeting}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate1#mmMeetingDate
	 * CorporateActionDate1.mmMeetingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate13#mmMeetingDate
	 * CorporateActionDate13.mmMeetingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate14#mmMeetingDate
	 * CorporateActionDate14.mmMeetingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate21#mmMeetingDate
	 * CorporateActionDate21.mmMeetingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate22#mmMeetingDate
	 * CorporateActionDate22.mmMeetingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate25#mmMeetingDate
	 * CorporateActionDate25.mmMeetingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate27#mmMeetingDate
	 * CorporateActionDate27.mmMeetingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate28#mmMeetingDate
	 * CorporateActionDate28.mmMeetingDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Meeting1#mmDateAndTime
	 * Meeting1.mmDateAndTime}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Meeting2#mmDateAndTime
	 * Meeting2.mmDateAndTime}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Meeting3#mmDateAndTime
	 * Meeting3.mmDateAndTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingReference1#mmMeetingDateAndTime
	 * MeetingReference1.mmMeetingDateAndTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingReference2#mmMeetingDateAndTime
	 * MeetingReference2.mmMeetingDateAndTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingReference5#mmMeetingDateAndTime
	 * MeetingReference5.mmMeetingDateAndTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingReference3#mmMeetingDateAndTime
	 * MeetingReference3.mmMeetingDateAndTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingReference4#mmMeetingDateAndTime
	 * MeetingReference4.mmMeetingDateAndTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingReference7#mmMeetingDateAndTime
	 * MeetingReference7.mmMeetingDateAndTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingReference6#mmMeetingDateAndTime
	 * MeetingReference6.mmMeetingDateAndTime}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Meeting4#mmDateAndTime
	 * Meeting4.mmDateAndTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44#mmMeetingDate
	 * CorporateActionDate44.mmMeetingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58#mmMeetingDate
	 * CorporateActionDate58.mmMeetingDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DateAndTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date and time at which the meeting will take place."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmDateAndTime = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionDate1.mmMeetingDate, com.tools20022.repository.msg.CorporateActionDate13.mmMeetingDate,
					com.tools20022.repository.msg.CorporateActionDate14.mmMeetingDate, com.tools20022.repository.msg.CorporateActionDate21.mmMeetingDate, com.tools20022.repository.msg.CorporateActionDate22.mmMeetingDate,
					com.tools20022.repository.msg.CorporateActionDate25.mmMeetingDate, com.tools20022.repository.msg.CorporateActionDate27.mmMeetingDate, com.tools20022.repository.msg.CorporateActionDate28.mmMeetingDate,
					com.tools20022.repository.msg.Meeting1.mmDateAndTime, com.tools20022.repository.msg.Meeting2.mmDateAndTime, com.tools20022.repository.msg.Meeting3.mmDateAndTime,
					com.tools20022.repository.msg.MeetingReference1.mmMeetingDateAndTime, com.tools20022.repository.msg.MeetingReference2.mmMeetingDateAndTime, com.tools20022.repository.msg.MeetingReference5.mmMeetingDateAndTime,
					com.tools20022.repository.msg.MeetingReference3.mmMeetingDateAndTime, com.tools20022.repository.msg.MeetingReference4.mmMeetingDateAndTime, com.tools20022.repository.msg.MeetingReference7.mmMeetingDateAndTime,
					com.tools20022.repository.msg.MeetingReference6.mmMeetingDateAndTime, com.tools20022.repository.msg.Meeting4.mmDateAndTime, com.tools20022.repository.msg.CorporateActionDate44.mmMeetingDate,
					com.tools20022.repository.msg.CorporateActionDate58.mmMeetingDate);
			elementContext_lazy = () -> Meeting.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DateAndTime";
			definition = "Date and time at which the meeting will take place.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected MeetingDateStatusCode dateStatus;
	/**
	 * Indicates the status of a meeting date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.MeetingDateStatusCode
	 * MeetingDateStatusCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Meeting
	 * Meeting}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Meeting1#mmDateStatus
	 * Meeting1.mmDateStatus}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Meeting2#mmDateStatus
	 * Meeting2.mmDateStatus}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Meeting3#mmDateStatus
	 * Meeting3.mmDateStatus}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Meeting4#mmDateStatus
	 * Meeting4.mmDateStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DateStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the status of a meeting date."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmDateStatus = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Meeting1.mmDateStatus, com.tools20022.repository.msg.Meeting2.mmDateStatus, com.tools20022.repository.msg.Meeting3.mmDateStatus,
					com.tools20022.repository.msg.Meeting4.mmDateStatus);
			elementContext_lazy = () -> Meeting.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DateStatus";
			definition = "Indicates the status of a meeting date.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> MeetingDateStatusCode.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.ContactPoint> meetingLocation;
	/**
	 * Place of the company meeting for the scheduled meeting date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ContactPoint#mmContactPointForMeeting
	 * ContactPoint.mmContactPointForMeeting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ContactPoint
	 * ContactPoint}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Meeting
	 * Meeting}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Meeting1#mmLocation
	 * Meeting1.mmLocation}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Meeting2#mmLocation
	 * Meeting2.mmLocation}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Meeting3#mmLocation
	 * Meeting3.mmLocation}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Meeting4#mmLocation
	 * Meeting4.mmLocation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MeetingLocation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Place of the company meeting for the scheduled meeting date."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmMeetingLocation = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Meeting1.mmLocation, com.tools20022.repository.msg.Meeting2.mmLocation, com.tools20022.repository.msg.Meeting3.mmLocation,
					com.tools20022.repository.msg.Meeting4.mmLocation);
			elementContext_lazy = () -> Meeting.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MeetingLocation";
			definition = "Place of the company meeting for the scheduled meeting date.";
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.ContactPoint.mmContactPointForMeeting;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ContactPoint.mmObject();
		}
	};
	protected Max35Text identification;
	/**
	 * Identification assigned to a general meeting by the party notifying the
	 * meeting. It must be unique for the party notifying the meeting.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Meeting
	 * Meeting}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice1#mmMeetingIdentification
	 * MeetingNotice1.mmMeetingIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice2#mmMeetingIdentification
	 * MeetingNotice2.mmMeetingIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice3#mmMeetingIdentification
	 * MeetingNotice3.mmMeetingIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingReference1#mmMeetingIdentification
	 * MeetingReference1.mmMeetingIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingReference2#mmMeetingIdentification
	 * MeetingReference2.mmMeetingIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingReference5#mmMeetingIdentification
	 * MeetingReference5.mmMeetingIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingReference3#mmMeetingIdentification
	 * MeetingReference3.mmMeetingIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingReference4#mmMeetingIdentification
	 * MeetingReference4.mmMeetingIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingReference7#mmMeetingIdentification
	 * MeetingReference7.mmMeetingIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingReference6#mmMeetingIdentification
	 * MeetingReference6.mmMeetingIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice4#mmMeetingIdentification
	 * MeetingNotice4.mmMeetingIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification assigned to a general meeting by the party notifying the meeting. It must be unique for the party notifying the meeting."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MeetingNotice1.mmMeetingIdentification, com.tools20022.repository.msg.MeetingNotice2.mmMeetingIdentification,
					com.tools20022.repository.msg.MeetingNotice3.mmMeetingIdentification, com.tools20022.repository.msg.MeetingReference1.mmMeetingIdentification, com.tools20022.repository.msg.MeetingReference2.mmMeetingIdentification,
					com.tools20022.repository.msg.MeetingReference5.mmMeetingIdentification, com.tools20022.repository.msg.MeetingReference3.mmMeetingIdentification, com.tools20022.repository.msg.MeetingReference4.mmMeetingIdentification,
					com.tools20022.repository.msg.MeetingReference7.mmMeetingIdentification, com.tools20022.repository.msg.MeetingReference6.mmMeetingIdentification, com.tools20022.repository.msg.MeetingNotice4.mmMeetingIdentification);
			elementContext_lazy = () -> Meeting.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Identification assigned to a general meeting by the party notifying the meeting. It must be unique for the party notifying the meeting.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Deadline> deadline;
	/**
	 * Specifies the different deadlines available for the different processes
	 * related to meeting attendance, proxy voting and entitlement assessment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Deadline#mmRelatedMeeting
	 * Deadline.mmRelatedMeeting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Deadline Deadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Meeting
	 * Meeting}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalRights1#mmAdditionalRightDeadline
	 * AdditionalRights1.mmAdditionalRightDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalRights2#mmAdditionalRightDeadline
	 * AdditionalRights2.mmAdditionalRightDeadline}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Deadline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the different deadlines available for the different processes related to meeting attendance, proxy voting and entitlement assessment."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmDeadline = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AdditionalRights1.mmAdditionalRightDeadline, com.tools20022.repository.msg.AdditionalRights2.mmAdditionalRightDeadline);
			elementContext_lazy = () -> Meeting.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Deadline";
			definition = "Specifies the different deadlines available for the different processes related to meeting attendance, proxy voting and entitlement assessment.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Deadline.mmRelatedMeeting;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Deadline.mmObject();
		}
	};
	protected MeetingServicing meetingServicing;
	/**
	 * Servicing processes related to the organisation of a meeting.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.MeetingServicing#mmMeetingSpecification
	 * MeetingServicing.mmMeetingSpecification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.MeetingServicing
	 * MeetingServicing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Meeting
	 * Meeting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MeetingServicing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Servicing processes related to the organisation of a meeting."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmMeetingServicing = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Meeting.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MeetingServicing";
			definition = "Servicing processes related to the organisation of a meeting.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.MeetingServicing.mmMeetingSpecification;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.MeetingServicing.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.ContactPersonRole> person;
	/**
	 * Specifies the person who is the contact for a meeting.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ContactPersonRole#mmMeeting
	 * ContactPersonRole.mmMeeting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ContactPersonRole
	 * ContactPersonRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Meeting
	 * Meeting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Person"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the person who is the contact for a meeting."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPerson = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Meeting.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Person";
			definition = "Specifies the person who is the contact for a meeting.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ContactPersonRole.mmMeeting;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ContactPersonRole.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.MeetingPartyRole> partyRole;
	/**
	 * Specifies the role played by a party in the context of a meeting.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.MeetingPartyRole#mmMeeting
	 * MeetingPartyRole.mmMeeting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.MeetingPartyRole
	 * MeetingPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Meeting
	 * Meeting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the role played by a party in the context of a meeting."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPartyRole = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Meeting.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PartyRole";
			definition = "Specifies the role played by a party in the context of a meeting.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.MeetingPartyRole.mmMeeting;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.MeetingPartyRole.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.MeetingStatus> status;
	/**
	 * Status of the imeeting and of the related nstructions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.MeetingStatus#mmMeeting
	 * MeetingStatus.mmMeeting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.MeetingStatus
	 * MeetingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Meeting
	 * Meeting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Status"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of the imeeting and of the related nstructions."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmStatus = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Meeting.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Status";
			definition = "Status of the imeeting and of the related nstructions.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.MeetingStatus.mmMeeting;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.MeetingStatus.mmObject();
		}
	};
	protected CorporateActionEvent corporateEvent;
	/**
	 * Corporate event for which a meeting is organised.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmRelatedMeeting
	 * CorporateActionEvent.mmRelatedMeeting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Meeting
	 * Meeting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateEvent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Corporate event for which a meeting is organised."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCorporateEvent = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Meeting.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CorporateEvent";
			definition = "Corporate event for which a meeting is organised.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmRelatedMeeting;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Quorum> quorum;
	/**
	 * Specifies whether a quorum is required or not together with the quorum
	 * parameters.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Quorum#mmMeeting
	 * Quorum.mmMeeting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Quorum Quorum}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Meeting
	 * Meeting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Quorum"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether a quorum is required or not together with the quorum parameters."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmQuorum = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Meeting.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Quorum";
			definition = "Specifies whether a quorum is required or not together with the quorum parameters.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Quorum.mmMeeting;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Quorum.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.VotingCondition> votingCondition;
	/**
	 * Specifies the different voting types, channels and premium.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.VotingCondition#mmMeeting
	 * VotingCondition.mmMeeting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.VotingCondition
	 * VotingCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Meeting
	 * Meeting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VotingCondition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the different voting types, channels and premium."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmVotingCondition = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Meeting.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "VotingCondition";
			definition = "Specifies the different voting types, channels and premium.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.VotingCondition.mmMeeting;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.VotingCondition.mmObject();
		}
	};
	protected YesNoIndicator attendanceRequired;
	/**
	 * Indicates whether physical participation to a meeting is required in
	 * order to be allowed to vote.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Meeting
	 * Meeting}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice1#mmAttendanceRequired
	 * MeetingNotice1.mmAttendanceRequired}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice2#mmAttendanceRequired
	 * MeetingNotice2.mmAttendanceRequired}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice3#mmAttendanceRequired
	 * MeetingNotice3.mmAttendanceRequired}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice4#mmAttendanceRequired
	 * MeetingNotice4.mmAttendanceRequired}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AttendanceRequired"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether physical participation to a meeting is required in order to be allowed to vote."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmAttendanceRequired = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MeetingNotice1.mmAttendanceRequired, com.tools20022.repository.msg.MeetingNotice2.mmAttendanceRequired,
					com.tools20022.repository.msg.MeetingNotice3.mmAttendanceRequired, com.tools20022.repository.msg.MeetingNotice4.mmAttendanceRequired);
			elementContext_lazy = () -> Meeting.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AttendanceRequired";
			definition = "Indicates whether physical participation to a meeting is required in order to be allowed to vote.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected Max350Text attendanceConfirmation;
	/**
	 * Indicates how to order the attendance card or to give notice of
	 * attendance.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Meeting
	 * Meeting}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice1#mmAttendanceConfirmationInformation
	 * MeetingNotice1.mmAttendanceConfirmationInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice2#mmAttendanceConfirmationInformation
	 * MeetingNotice2.mmAttendanceConfirmationInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice3#mmAttendanceConfirmationInformation
	 * MeetingNotice3.mmAttendanceConfirmationInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice4#mmAttendanceConfirmationInformation
	 * MeetingNotice4.mmAttendanceConfirmationInformation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AttendanceConfirmation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates how to order the attendance card or to give notice of attendance."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmAttendanceConfirmation = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MeetingNotice1.mmAttendanceConfirmationInformation, com.tools20022.repository.msg.MeetingNotice2.mmAttendanceConfirmationInformation,
					com.tools20022.repository.msg.MeetingNotice3.mmAttendanceConfirmationInformation, com.tools20022.repository.msg.MeetingNotice4.mmAttendanceConfirmationInformation);
			elementContext_lazy = () -> Meeting.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AttendanceConfirmation";
			definition = "Indicates how to order the attendance card or to give notice of attendance.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	protected IncentivePremium incentivePremium;
	/**
	 * Cash premium made available to encourage participation by a certain
	 * deadline (avoids to have a second call).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.IncentivePremium#mmMeeting
	 * IncentivePremium.mmMeeting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.IncentivePremium
	 * IncentivePremium}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Meeting
	 * Meeting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncentivePremium"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash premium made available to encourage participation by a certain deadline (avoids to have a second call)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmIncentivePremium = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Meeting.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IncentivePremium";
			definition = "Cash premium made available to encourage participation by a certain deadline (avoids to have a second call).";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.IncentivePremium.mmMeeting;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.IncentivePremium.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.MeetingParticipation> participation;
	/**
	 * Potential participation to the voting process.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.MeetingParticipation#mmMeeting
	 * MeetingParticipation.mmMeeting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.MeetingParticipation
	 * MeetingParticipation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Meeting
	 * Meeting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Participation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Potential participation to the voting process."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmParticipation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Meeting.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Participation";
			definition = "Potential participation to the voting process.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.MeetingParticipation.mmMeeting;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.MeetingParticipation.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.ResolutionProposal> resolutionProposalConditions;
	/**
	 * Specifies the conditions to fulfill in order to be able to propose a
	 * resolution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ResolutionProposal#mmMeeting
	 * ResolutionProposal.mmMeeting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ResolutionProposal
	 * ResolutionProposal}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Meeting
	 * Meeting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResolutionProposalConditions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the conditions to fulfill in order to be able to propose a resolution."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmResolutionProposalConditions = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Meeting.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ResolutionProposalConditions";
			definition = "Specifies the conditions to fulfill in order to be able to propose a resolution.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ResolutionProposal.mmMeeting;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ResolutionProposal.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Resolution> agendaItem;
	/**
	 * Item proposed for the vote or presented for information only.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Resolution#mmMeeting
	 * Resolution.mmMeeting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Resolution
	 * Resolution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Meeting
	 * Meeting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgendaItem"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Item proposed for the vote or presented for information only."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmAgendaItem = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Meeting.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AgendaItem";
			definition = "Item proposed for the vote or presented for information only.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Resolution.mmMeeting;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Resolution.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.ProxyAppointmentCondition> proxyAppointmentConditions;
	/**
	 * Information on how to appoint proxy.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ProxyAppointmentCondition#mmMeeting
	 * ProxyAppointmentCondition.mmMeeting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.ProxyAppointmentCondition
	 * ProxyAppointmentCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Meeting
	 * Meeting}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.MeetingNotice1#mmProxy
	 * MeetingNotice1.mmProxy}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.MeetingNotice2#mmProxy
	 * MeetingNotice2.mmProxy}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice3#mmProxyChoice
	 * MeetingNotice3.mmProxyChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice4#mmProxyChoice
	 * MeetingNotice4.mmProxyChoice}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProxyAppointmentConditions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information on how to appoint proxy."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmProxyAppointmentConditions = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MeetingNotice1.mmProxy, com.tools20022.repository.msg.MeetingNotice2.mmProxy, com.tools20022.repository.msg.MeetingNotice3.mmProxyChoice,
					com.tools20022.repository.msg.MeetingNotice4.mmProxyChoice);
			elementContext_lazy = () -> Meeting.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ProxyAppointmentConditions";
			definition = "Information on how to appoint proxy.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ProxyAppointmentCondition.mmMeeting;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ProxyAppointmentCondition.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.AdditionalRight> additionalRight;
	/**
	 * Specifies how the additional rights can be granted to the shareholder.
	 * These rights can be exercised at shareholders meetings (for example, the
	 * right to ask questions, the right to add items to the agenda or table
	 * draft resolutions).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AdditionalRight#mmMeeting
	 * AdditionalRight.mmMeeting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.AdditionalRight
	 * AdditionalRight}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Meeting
	 * Meeting}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice3#mmAdditionalProcedureDetails
	 * MeetingNotice3.mmAdditionalProcedureDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice4#mmAdditionalProcedureDetails
	 * MeetingNotice4.mmAdditionalProcedureDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalRight"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies how the additional rights can be granted to the shareholder. These rights can be exercised at shareholders meetings (for example, the right to ask questions, the right to add items to the agenda or table draft resolutions)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmAdditionalRight = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MeetingNotice3.mmAdditionalProcedureDetails, com.tools20022.repository.msg.MeetingNotice4.mmAdditionalProcedureDetails);
			elementContext_lazy = () -> Meeting.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AdditionalRight";
			definition = "Specifies how the additional rights can be granted to the shareholder. These rights can be exercised at shareholders meetings (for example, the right to ask questions, the right to add items to the agenda or table draft resolutions).";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.AdditionalRight.mmMeeting;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.AdditionalRight.mmObject();
		}
	};
	protected MeetingTypeCode type;
	/**
	 * Specifies the type of meeting for which an invitation is sent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.MeetingTypeCode
	 * MeetingTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Meeting
	 * Meeting}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.MeetingNotice1#mmType
	 * MeetingNotice1.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.MeetingNotice2#mmType
	 * MeetingNotice2.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.MeetingNotice3#mmType
	 * MeetingNotice3.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.MeetingReference1#mmType
	 * MeetingReference1.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.MeetingReference2#mmType
	 * MeetingReference2.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.MeetingReference5#mmType
	 * MeetingReference5.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.MeetingReference3#mmType
	 * MeetingReference3.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.MeetingReference4#mmType
	 * MeetingReference4.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.MeetingReference7#mmType
	 * MeetingReference7.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.MeetingReference6#mmType
	 * MeetingReference6.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.MeetingNotice4#mmType
	 * MeetingNotice4.mmType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of meeting for which an invitation is sent."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MeetingNotice1.mmType, com.tools20022.repository.msg.MeetingNotice2.mmType, com.tools20022.repository.msg.MeetingNotice3.mmType,
					com.tools20022.repository.msg.MeetingReference1.mmType, com.tools20022.repository.msg.MeetingReference2.mmType, com.tools20022.repository.msg.MeetingReference5.mmType,
					com.tools20022.repository.msg.MeetingReference3.mmType, com.tools20022.repository.msg.MeetingReference4.mmType, com.tools20022.repository.msg.MeetingReference7.mmType,
					com.tools20022.repository.msg.MeetingReference6.mmType, com.tools20022.repository.msg.MeetingNotice4.mmType);
			elementContext_lazy = () -> Meeting.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Specifies the type of meeting for which an invitation is sent.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> MeetingTypeCode.mmObject();
		}
	};
	protected PowerOfAttorneyRequirements powerOfAttorneyRequirements;
	/**
	 * Specifies the conditions to be filled in to obtain a valid power of
	 * attorney.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PowerOfAttorneyRequirements#mmMeeting
	 * PowerOfAttorneyRequirements.mmMeeting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.PowerOfAttorneyRequirements
	 * PowerOfAttorneyRequirements}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Meeting
	 * Meeting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PowerOfAttorneyRequirements"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the conditions to be filled in to obtain a valid power of attorney."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPowerOfAttorneyRequirements = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Meeting.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PowerOfAttorneyRequirements";
			definition = "Specifies the conditions to be filled in to obtain a valid power of attorney.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.PowerOfAttorneyRequirements.mmMeeting;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PowerOfAttorneyRequirements.mmObject();
		}
	};
	protected MeetingTypeClassificationCode meetingEventClassification;
	/**
	 * Classifies the meeting.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.MeetingTypeClassificationCode
	 * MeetingTypeClassificationCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Meeting
	 * Meeting}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice2#mmClassification
	 * MeetingNotice2.mmClassification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice2#mmExtendedClassification
	 * MeetingNotice2.mmExtendedClassification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MeetingTypeClassification1Choice#mmCode
	 * MeetingTypeClassification1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MeetingTypeClassification1Choice#mmProprietary
	 * MeetingTypeClassification1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice3#mmClassification
	 * MeetingNotice3.mmClassification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingReference2#mmClassification
	 * MeetingReference2.mmClassification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingReference2#mmExtendedClassification
	 * MeetingReference2.mmExtendedClassification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingReference5#mmClassification
	 * MeetingReference5.mmClassification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingReference3#mmClassification
	 * MeetingReference3.mmClassification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingReference3#mmExtendedClassification
	 * MeetingReference3.mmExtendedClassification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingReference4#mmClassification
	 * MeetingReference4.mmClassification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingReference7#mmClassification
	 * MeetingReference7.mmClassification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingReference6#mmClassification
	 * MeetingReference6.mmClassification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice4#mmClassification
	 * MeetingNotice4.mmClassification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MeetingEventClassification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Classifies the meeting."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmMeetingEventClassification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MeetingNotice2.mmClassification, com.tools20022.repository.msg.MeetingNotice2.mmExtendedClassification,
					com.tools20022.repository.choice.MeetingTypeClassification1Choice.mmCode, com.tools20022.repository.choice.MeetingTypeClassification1Choice.mmProprietary, com.tools20022.repository.msg.MeetingNotice3.mmClassification,
					com.tools20022.repository.msg.MeetingReference2.mmClassification, com.tools20022.repository.msg.MeetingReference2.mmExtendedClassification, com.tools20022.repository.msg.MeetingReference5.mmClassification,
					com.tools20022.repository.msg.MeetingReference3.mmClassification, com.tools20022.repository.msg.MeetingReference3.mmExtendedClassification, com.tools20022.repository.msg.MeetingReference4.mmClassification,
					com.tools20022.repository.msg.MeetingReference7.mmClassification, com.tools20022.repository.msg.MeetingReference6.mmClassification, com.tools20022.repository.msg.MeetingNotice4.mmClassification);
			elementContext_lazy = () -> Meeting.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MeetingEventClassification";
			definition = "Classifies the meeting.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> MeetingTypeClassificationCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Meeting";
				definition = "Specifies the physical parameters of a general meeting. Several dates and places can be defined for a  meeting.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ContactPoint.mmContactPointForMeeting, com.tools20022.repository.entity.ContactPersonRole.mmMeeting,
						com.tools20022.repository.entity.CorporateActionEvent.mmRelatedMeeting, com.tools20022.repository.entity.Deadline.mmRelatedMeeting, com.tools20022.repository.entity.MeetingPartyRole.mmMeeting,
						com.tools20022.repository.entity.ResolutionProposal.mmMeeting, com.tools20022.repository.entity.ProxyAppointmentCondition.mmMeeting, com.tools20022.repository.entity.MeetingParticipation.mmMeeting,
						com.tools20022.repository.entity.Quorum.mmMeeting, com.tools20022.repository.entity.Resolution.mmMeeting, com.tools20022.repository.entity.MeetingStatus.mmMeeting,
						com.tools20022.repository.entity.VotingCondition.mmMeeting, com.tools20022.repository.entity.IncentivePremium.mmMeeting, com.tools20022.repository.entity.PowerOfAttorneyRequirements.mmMeeting,
						com.tools20022.repository.entity.AdditionalRight.mmMeeting, com.tools20022.repository.entity.MeetingServicing.mmMeetingSpecification);
				subType_lazy = () -> Arrays.asList(IssuerMeeting.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Meeting.mmDateAndTime, com.tools20022.repository.entity.Meeting.mmDateStatus, com.tools20022.repository.entity.Meeting.mmMeetingLocation,
						com.tools20022.repository.entity.Meeting.mmIdentification, com.tools20022.repository.entity.Meeting.mmDeadline, com.tools20022.repository.entity.Meeting.mmMeetingServicing,
						com.tools20022.repository.entity.Meeting.mmPerson, com.tools20022.repository.entity.Meeting.mmPartyRole, com.tools20022.repository.entity.Meeting.mmStatus, com.tools20022.repository.entity.Meeting.mmCorporateEvent,
						com.tools20022.repository.entity.Meeting.mmQuorum, com.tools20022.repository.entity.Meeting.mmVotingCondition, com.tools20022.repository.entity.Meeting.mmAttendanceRequired,
						com.tools20022.repository.entity.Meeting.mmAttendanceConfirmation, com.tools20022.repository.entity.Meeting.mmIncentivePremium, com.tools20022.repository.entity.Meeting.mmParticipation,
						com.tools20022.repository.entity.Meeting.mmResolutionProposalConditions, com.tools20022.repository.entity.Meeting.mmAgendaItem, com.tools20022.repository.entity.Meeting.mmProxyAppointmentConditions,
						com.tools20022.repository.entity.Meeting.mmAdditionalRight, com.tools20022.repository.entity.Meeting.mmType, com.tools20022.repository.entity.Meeting.mmPowerOfAttorneyRequirements,
						com.tools20022.repository.entity.Meeting.mmMeetingEventClassification);
				derivationComponent_lazy = () -> Arrays.asList(MeetingContactPerson.mmObject(), Meeting1.mmObject(), MeetingContactPerson1.mmObject(), Meeting2.mmObject(), MeetingTypeClassification1Choice.mmObject(), Meeting3.mmObject(),
						MeetingReference1.mmObject(), MeetingReference2.mmObject(), MeetingReference5.mmObject(), MeetingReference3.mmObject(), MeetingReference4.mmObject(), MeetingReference7.mmObject(), MeetingReference6.mmObject(),
						Meeting4.mmObject(), MeetingContactPerson2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public ISODateTime getDateAndTime() {
		return dateAndTime;
	}

	public void setDateAndTime(ISODateTime dateAndTime) {
		this.dateAndTime = dateAndTime;
	}

	public MeetingDateStatusCode getDateStatus() {
		return dateStatus;
	}

	public void setDateStatus(MeetingDateStatusCode dateStatus) {
		this.dateStatus = dateStatus;
	}

	public List<ContactPoint> getMeetingLocation() {
		return meetingLocation;
	}

	public void setMeetingLocation(List<com.tools20022.repository.entity.ContactPoint> meetingLocation) {
		this.meetingLocation = meetingLocation;
	}

	public Max35Text getIdentification() {
		return identification;
	}

	public void setIdentification(Max35Text identification) {
		this.identification = identification;
	}

	public List<Deadline> getDeadline() {
		return deadline;
	}

	public void setDeadline(List<com.tools20022.repository.entity.Deadline> deadline) {
		this.deadline = deadline;
	}

	public MeetingServicing getMeetingServicing() {
		return meetingServicing;
	}

	public void setMeetingServicing(com.tools20022.repository.entity.MeetingServicing meetingServicing) {
		this.meetingServicing = meetingServicing;
	}

	public List<ContactPersonRole> getPerson() {
		return person;
	}

	public void setPerson(List<com.tools20022.repository.entity.ContactPersonRole> person) {
		this.person = person;
	}

	public List<MeetingPartyRole> getPartyRole() {
		return partyRole;
	}

	public void setPartyRole(List<com.tools20022.repository.entity.MeetingPartyRole> partyRole) {
		this.partyRole = partyRole;
	}

	public List<MeetingStatus> getStatus() {
		return status;
	}

	public void setStatus(List<com.tools20022.repository.entity.MeetingStatus> status) {
		this.status = status;
	}

	public CorporateActionEvent getCorporateEvent() {
		return corporateEvent;
	}

	public void setCorporateEvent(com.tools20022.repository.entity.CorporateActionEvent corporateEvent) {
		this.corporateEvent = corporateEvent;
	}

	public List<Quorum> getQuorum() {
		return quorum;
	}

	public void setQuorum(List<com.tools20022.repository.entity.Quorum> quorum) {
		this.quorum = quorum;
	}

	public List<VotingCondition> getVotingCondition() {
		return votingCondition;
	}

	public void setVotingCondition(List<com.tools20022.repository.entity.VotingCondition> votingCondition) {
		this.votingCondition = votingCondition;
	}

	public YesNoIndicator getAttendanceRequired() {
		return attendanceRequired;
	}

	public void setAttendanceRequired(YesNoIndicator attendanceRequired) {
		this.attendanceRequired = attendanceRequired;
	}

	public Max350Text getAttendanceConfirmation() {
		return attendanceConfirmation;
	}

	public void setAttendanceConfirmation(Max350Text attendanceConfirmation) {
		this.attendanceConfirmation = attendanceConfirmation;
	}

	public IncentivePremium getIncentivePremium() {
		return incentivePremium;
	}

	public void setIncentivePremium(com.tools20022.repository.entity.IncentivePremium incentivePremium) {
		this.incentivePremium = incentivePremium;
	}

	public List<MeetingParticipation> getParticipation() {
		return participation;
	}

	public void setParticipation(List<com.tools20022.repository.entity.MeetingParticipation> participation) {
		this.participation = participation;
	}

	public List<ResolutionProposal> getResolutionProposalConditions() {
		return resolutionProposalConditions;
	}

	public void setResolutionProposalConditions(List<com.tools20022.repository.entity.ResolutionProposal> resolutionProposalConditions) {
		this.resolutionProposalConditions = resolutionProposalConditions;
	}

	public List<Resolution> getAgendaItem() {
		return agendaItem;
	}

	public void setAgendaItem(List<com.tools20022.repository.entity.Resolution> agendaItem) {
		this.agendaItem = agendaItem;
	}

	public List<ProxyAppointmentCondition> getProxyAppointmentConditions() {
		return proxyAppointmentConditions;
	}

	public void setProxyAppointmentConditions(List<com.tools20022.repository.entity.ProxyAppointmentCondition> proxyAppointmentConditions) {
		this.proxyAppointmentConditions = proxyAppointmentConditions;
	}

	public List<AdditionalRight> getAdditionalRight() {
		return additionalRight;
	}

	public void setAdditionalRight(List<com.tools20022.repository.entity.AdditionalRight> additionalRight) {
		this.additionalRight = additionalRight;
	}

	public MeetingTypeCode getType() {
		return type;
	}

	public void setType(MeetingTypeCode type) {
		this.type = type;
	}

	public PowerOfAttorneyRequirements getPowerOfAttorneyRequirements() {
		return powerOfAttorneyRequirements;
	}

	public void setPowerOfAttorneyRequirements(com.tools20022.repository.entity.PowerOfAttorneyRequirements powerOfAttorneyRequirements) {
		this.powerOfAttorneyRequirements = powerOfAttorneyRequirements;
	}

	public MeetingTypeClassificationCode getMeetingEventClassification() {
		return meetingEventClassification;
	}

	public void setMeetingEventClassification(MeetingTypeClassificationCode meetingEventClassification) {
		this.meetingEventClassification = meetingEventClassification;
	}
}