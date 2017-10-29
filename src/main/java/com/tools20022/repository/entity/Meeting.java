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
 * <li>{@linkplain com.tools20022.repository.entity.Meeting#DateAndTime
 * Meeting.DateAndTime}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Meeting#DateStatus
 * Meeting.DateStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Meeting#MeetingLocation
 * Meeting.MeetingLocation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Meeting#Identification
 * Meeting.Identification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Meeting#Deadline
 * Meeting.Deadline}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Meeting#MeetingServicing
 * Meeting.MeetingServicing}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Meeting#Person
 * Meeting.Person}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Meeting#PartyRole
 * Meeting.PartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Meeting#Status
 * Meeting.Status}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Meeting#CorporateEvent
 * Meeting.CorporateEvent}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Meeting#Quorum
 * Meeting.Quorum}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Meeting#VotingCondition
 * Meeting.VotingCondition}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Meeting#AttendanceRequired
 * Meeting.AttendanceRequired}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Meeting#AttendanceConfirmation
 * Meeting.AttendanceConfirmation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Meeting#IncentivePremium
 * Meeting.IncentivePremium}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Meeting#Participation
 * Meeting.Participation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Meeting#ResolutionProposalConditions
 * Meeting.ResolutionProposalConditions}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Meeting#AgendaItem
 * Meeting.AgendaItem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Meeting#ProxyAppointmentConditions
 * Meeting.ProxyAppointmentConditions}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Meeting#AdditionalRight
 * Meeting.AdditionalRight}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Meeting#Type Meeting.Type}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Meeting#PowerOfAttorneyRequirements
 * Meeting.PowerOfAttorneyRequirements}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Meeting#MeetingEventClassification
 * Meeting.MeetingEventClassification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ContactPoint#ContactPointForMeeting
 * ContactPoint.ContactPointForMeeting}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ContactPersonRole#Meeting
 * ContactPersonRole.Meeting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#RelatedMeeting
 * CorporateActionEvent.RelatedMeeting}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Deadline#RelatedMeeting
 * Deadline.RelatedMeeting}</li>
 * <li>{@linkplain com.tools20022.repository.entity.MeetingPartyRole#Meeting
 * MeetingPartyRole.Meeting}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ResolutionProposal#Meeting
 * ResolutionProposal.Meeting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProxyAppointmentCondition#Meeting
 * ProxyAppointmentCondition.Meeting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MeetingParticipation#Meeting
 * MeetingParticipation.Meeting}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Quorum#Meeting
 * Quorum.Meeting}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Resolution#Meeting
 * Resolution.Meeting}</li>
 * <li>{@linkplain com.tools20022.repository.entity.MeetingStatus#Meeting
 * MeetingStatus.Meeting}</li>
 * <li>{@linkplain com.tools20022.repository.entity.VotingCondition#Meeting
 * VotingCondition.Meeting}</li>
 * <li>{@linkplain com.tools20022.repository.entity.IncentivePremium#Meeting
 * IncentivePremium.Meeting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PowerOfAttorneyRequirements#Meeting
 * PowerOfAttorneyRequirements.Meeting}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AdditionalRight#Meeting
 * AdditionalRight.Meeting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MeetingServicing#MeetingSpecification
 * MeetingServicing.MeetingSpecification}</li>
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
	/**
	 * Date and time at which the meeting will take place.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate1#MeetingDate
	 * CorporateActionDate1.MeetingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate13#MeetingDate
	 * CorporateActionDate13.MeetingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate14#MeetingDate
	 * CorporateActionDate14.MeetingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate21#MeetingDate
	 * CorporateActionDate21.MeetingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate22#MeetingDate
	 * CorporateActionDate22.MeetingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate25#MeetingDate
	 * CorporateActionDate25.MeetingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate27#MeetingDate
	 * CorporateActionDate27.MeetingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate28#MeetingDate
	 * CorporateActionDate28.MeetingDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Meeting1#DateAndTime
	 * Meeting1.DateAndTime}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Meeting2#DateAndTime
	 * Meeting2.DateAndTime}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Meeting3#DateAndTime
	 * Meeting3.DateAndTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingReference1#MeetingDateAndTime
	 * MeetingReference1.MeetingDateAndTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingReference2#MeetingDateAndTime
	 * MeetingReference2.MeetingDateAndTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingReference5#MeetingDateAndTime
	 * MeetingReference5.MeetingDateAndTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingReference3#MeetingDateAndTime
	 * MeetingReference3.MeetingDateAndTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingReference4#MeetingDateAndTime
	 * MeetingReference4.MeetingDateAndTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingReference7#MeetingDateAndTime
	 * MeetingReference7.MeetingDateAndTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingReference6#MeetingDateAndTime
	 * MeetingReference6.MeetingDateAndTime}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Meeting4#DateAndTime
	 * Meeting4.DateAndTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44#MeetingDate
	 * CorporateActionDate44.MeetingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58#MeetingDate
	 * CorporateActionDate58.MeetingDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Meeting
	 * Meeting}</li>
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
	public static final MMBusinessAttribute DateAndTime = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionDate1.MeetingDate, com.tools20022.repository.msg.CorporateActionDate13.MeetingDate,
					com.tools20022.repository.msg.CorporateActionDate14.MeetingDate, com.tools20022.repository.msg.CorporateActionDate21.MeetingDate, com.tools20022.repository.msg.CorporateActionDate22.MeetingDate,
					com.tools20022.repository.msg.CorporateActionDate25.MeetingDate, com.tools20022.repository.msg.CorporateActionDate27.MeetingDate, com.tools20022.repository.msg.CorporateActionDate28.MeetingDate,
					com.tools20022.repository.msg.Meeting1.DateAndTime, com.tools20022.repository.msg.Meeting2.DateAndTime, com.tools20022.repository.msg.Meeting3.DateAndTime,
					com.tools20022.repository.msg.MeetingReference1.MeetingDateAndTime, com.tools20022.repository.msg.MeetingReference2.MeetingDateAndTime, com.tools20022.repository.msg.MeetingReference5.MeetingDateAndTime,
					com.tools20022.repository.msg.MeetingReference3.MeetingDateAndTime, com.tools20022.repository.msg.MeetingReference4.MeetingDateAndTime, com.tools20022.repository.msg.MeetingReference7.MeetingDateAndTime,
					com.tools20022.repository.msg.MeetingReference6.MeetingDateAndTime, com.tools20022.repository.msg.Meeting4.DateAndTime, com.tools20022.repository.msg.CorporateActionDate44.MeetingDate,
					com.tools20022.repository.msg.CorporateActionDate58.MeetingDate);
			elementContext_lazy = () -> Meeting.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DateAndTime";
			definition = "Date and time at which the meeting will take place.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Meeting1#DateStatus
	 * Meeting1.DateStatus}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Meeting2#DateStatus
	 * Meeting2.DateStatus}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Meeting3#DateStatus
	 * Meeting3.DateStatus}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Meeting4#DateStatus
	 * Meeting4.DateStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Meeting
	 * Meeting}</li>
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
	public static final MMBusinessAttribute DateStatus = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Meeting1.DateStatus, com.tools20022.repository.msg.Meeting2.DateStatus, com.tools20022.repository.msg.Meeting3.DateStatus,
					com.tools20022.repository.msg.Meeting4.DateStatus);
			elementContext_lazy = () -> Meeting.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DateStatus";
			definition = "Indicates the status of a meeting date.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> MeetingDateStatusCode.mmObject();
		}
	};
	/**
	 * Place of the company meeting for the scheduled meeting date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ContactPoint#ContactPointForMeeting
	 * ContactPoint.ContactPointForMeeting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ContactPoint
	 * ContactPoint}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Meeting1#Location
	 * Meeting1.Location}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Meeting2#Location
	 * Meeting2.Location}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Meeting3#Location
	 * Meeting3.Location}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Meeting4#Location
	 * Meeting4.Location}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Meeting
	 * Meeting}</li>
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
	public static final MMBusinessAssociationEnd MeetingLocation = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Meeting1.Location, com.tools20022.repository.msg.Meeting2.Location, com.tools20022.repository.msg.Meeting3.Location,
					com.tools20022.repository.msg.Meeting4.Location);
			elementContext_lazy = () -> Meeting.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MeetingLocation";
			definition = "Place of the company meeting for the scheduled meeting date.";
			minOccurs = 1;
			type_lazy = () -> ContactPoint.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ContactPoint.ContactPointForMeeting;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice1#MeetingIdentification
	 * MeetingNotice1.MeetingIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice2#MeetingIdentification
	 * MeetingNotice2.MeetingIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice3#MeetingIdentification
	 * MeetingNotice3.MeetingIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingReference1#MeetingIdentification
	 * MeetingReference1.MeetingIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingReference2#MeetingIdentification
	 * MeetingReference2.MeetingIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingReference5#MeetingIdentification
	 * MeetingReference5.MeetingIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingReference3#MeetingIdentification
	 * MeetingReference3.MeetingIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingReference4#MeetingIdentification
	 * MeetingReference4.MeetingIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingReference7#MeetingIdentification
	 * MeetingReference7.MeetingIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingReference6#MeetingIdentification
	 * MeetingReference6.MeetingIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice4#MeetingIdentification
	 * MeetingNotice4.MeetingIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Meeting
	 * Meeting}</li>
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
	public static final MMBusinessAttribute Identification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MeetingNotice1.MeetingIdentification, com.tools20022.repository.msg.MeetingNotice2.MeetingIdentification,
					com.tools20022.repository.msg.MeetingNotice3.MeetingIdentification, com.tools20022.repository.msg.MeetingReference1.MeetingIdentification, com.tools20022.repository.msg.MeetingReference2.MeetingIdentification,
					com.tools20022.repository.msg.MeetingReference5.MeetingIdentification, com.tools20022.repository.msg.MeetingReference3.MeetingIdentification, com.tools20022.repository.msg.MeetingReference4.MeetingIdentification,
					com.tools20022.repository.msg.MeetingReference7.MeetingIdentification, com.tools20022.repository.msg.MeetingReference6.MeetingIdentification, com.tools20022.repository.msg.MeetingNotice4.MeetingIdentification);
			elementContext_lazy = () -> Meeting.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Identification assigned to a general meeting by the party notifying the meeting. It must be unique for the party notifying the meeting.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Specifies the different deadlines available for the different processes
	 * related to meeting attendance, proxy voting and entitlement assessment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Deadline#RelatedMeeting
	 * Deadline.RelatedMeeting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Deadline Deadline}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalRights1#AdditionalRightDeadline
	 * AdditionalRights1.AdditionalRightDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalRights2#AdditionalRightDeadline
	 * AdditionalRights2.AdditionalRightDeadline}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Meeting
	 * Meeting}</li>
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
	public static final MMBusinessAssociationEnd Deadline = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AdditionalRights1.AdditionalRightDeadline, com.tools20022.repository.msg.AdditionalRights2.AdditionalRightDeadline);
			elementContext_lazy = () -> Meeting.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Deadline";
			definition = "Specifies the different deadlines available for the different processes related to meeting attendance, proxy voting and entitlement assessment.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.Deadline.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Deadline.RelatedMeeting;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Servicing processes related to the organisation of a meeting.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.MeetingServicing#MeetingSpecification
	 * MeetingServicing.MeetingSpecification}</li>
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
	public static final MMBusinessAssociationEnd MeetingServicing = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Meeting.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MeetingServicing";
			definition = "Servicing processes related to the organisation of a meeting.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.MeetingServicing.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.MeetingServicing.MeetingSpecification;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the person who is the contact for a meeting.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ContactPersonRole#Meeting
	 * ContactPersonRole.Meeting}</li>
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
	public static final MMBusinessAssociationEnd Person = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Meeting.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Person";
			definition = "Specifies the person who is the contact for a meeting.";
			minOccurs = 0;
			type_lazy = () -> ContactPersonRole.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ContactPersonRole.Meeting;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the role played by a party in the context of a meeting.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.MeetingPartyRole#Meeting
	 * MeetingPartyRole.Meeting}</li>
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
	public static final MMBusinessAssociationEnd PartyRole = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Meeting.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PartyRole";
			definition = "Specifies the role played by a party in the context of a meeting.";
			minOccurs = 0;
			type_lazy = () -> MeetingPartyRole.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.MeetingPartyRole.Meeting;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Status of the imeeting and of the related nstructions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.MeetingStatus#Meeting
	 * MeetingStatus.Meeting}</li>
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
	public static final MMBusinessAssociationEnd Status = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Meeting.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Status";
			definition = "Status of the imeeting and of the related nstructions.";
			minOccurs = 0;
			type_lazy = () -> MeetingStatus.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.MeetingStatus.Meeting;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Corporate event for which a meeting is organised.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#RelatedMeeting
	 * CorporateActionEvent.RelatedMeeting}</li>
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
	public static final MMBusinessAssociationEnd CorporateEvent = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Meeting.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CorporateEvent";
			definition = "Corporate event for which a meeting is organised.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> CorporateActionEvent.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.RelatedMeeting;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies whether a quorum is required or not together with the quorum
	 * parameters.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Quorum#Meeting
	 * Quorum.Meeting}</li>
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
	public static final MMBusinessAssociationEnd Quorum = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Meeting.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Quorum";
			definition = "Specifies whether a quorum is required or not together with the quorum parameters.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.Quorum.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Quorum.Meeting;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the different voting types, channels and premium.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.VotingCondition#Meeting
	 * VotingCondition.Meeting}</li>
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
	public static final MMBusinessAssociationEnd VotingCondition = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Meeting.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "VotingCondition";
			definition = "Specifies the different voting types, channels and premium.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.VotingCondition.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.VotingCondition.Meeting;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice1#AttendanceRequired
	 * MeetingNotice1.AttendanceRequired}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice2#AttendanceRequired
	 * MeetingNotice2.AttendanceRequired}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice3#AttendanceRequired
	 * MeetingNotice3.AttendanceRequired}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice4#AttendanceRequired
	 * MeetingNotice4.AttendanceRequired}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Meeting
	 * Meeting}</li>
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
	public static final MMBusinessAttribute AttendanceRequired = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MeetingNotice1.AttendanceRequired, com.tools20022.repository.msg.MeetingNotice2.AttendanceRequired,
					com.tools20022.repository.msg.MeetingNotice3.AttendanceRequired, com.tools20022.repository.msg.MeetingNotice4.AttendanceRequired);
			elementContext_lazy = () -> Meeting.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AttendanceRequired";
			definition = "Indicates whether physical participation to a meeting is required in order to be allowed to vote.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice1#AttendanceConfirmationInformation
	 * MeetingNotice1.AttendanceConfirmationInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice2#AttendanceConfirmationInformation
	 * MeetingNotice2.AttendanceConfirmationInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice3#AttendanceConfirmationInformation
	 * MeetingNotice3.AttendanceConfirmationInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice4#AttendanceConfirmationInformation
	 * MeetingNotice4.AttendanceConfirmationInformation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Meeting
	 * Meeting}</li>
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
	public static final MMBusinessAttribute AttendanceConfirmation = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MeetingNotice1.AttendanceConfirmationInformation, com.tools20022.repository.msg.MeetingNotice2.AttendanceConfirmationInformation,
					com.tools20022.repository.msg.MeetingNotice3.AttendanceConfirmationInformation, com.tools20022.repository.msg.MeetingNotice4.AttendanceConfirmationInformation);
			elementContext_lazy = () -> Meeting.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AttendanceConfirmation";
			definition = "Indicates how to order the attendance card or to give notice of attendance.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	/**
	 * Cash premium made available to encourage participation by a certain
	 * deadline (avoids to have a second call).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.IncentivePremium#Meeting
	 * IncentivePremium.Meeting}</li>
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
	public static final MMBusinessAssociationEnd IncentivePremium = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Meeting.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IncentivePremium";
			definition = "Cash premium made available to encourage participation by a certain deadline (avoids to have a second call).";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.IncentivePremium.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.IncentivePremium.Meeting;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Potential participation to the voting process.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.MeetingParticipation#Meeting
	 * MeetingParticipation.Meeting}</li>
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
	public static final MMBusinessAssociationEnd Participation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Meeting.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Participation";
			definition = "Potential participation to the voting process.";
			minOccurs = 0;
			type_lazy = () -> MeetingParticipation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.MeetingParticipation.Meeting;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the conditions to fulfill in order to be able to propose a
	 * resolution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ResolutionProposal#Meeting
	 * ResolutionProposal.Meeting}</li>
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
	public static final MMBusinessAssociationEnd ResolutionProposalConditions = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Meeting.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ResolutionProposalConditions";
			definition = "Specifies the conditions to fulfill in order to be able to propose a resolution.";
			minOccurs = 0;
			type_lazy = () -> ResolutionProposal.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ResolutionProposal.Meeting;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Item proposed for the vote or presented for information only.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Resolution#Meeting
	 * Resolution.Meeting}</li>
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
	public static final MMBusinessAssociationEnd AgendaItem = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Meeting.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AgendaItem";
			definition = "Item proposed for the vote or presented for information only.";
			minOccurs = 0;
			type_lazy = () -> Resolution.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Resolution.Meeting;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Information on how to appoint proxy.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ProxyAppointmentCondition#Meeting
	 * ProxyAppointmentCondition.Meeting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.ProxyAppointmentCondition
	 * ProxyAppointmentCondition}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.MeetingNotice1#Proxy
	 * MeetingNotice1.Proxy}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.MeetingNotice2#Proxy
	 * MeetingNotice2.Proxy}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.MeetingNotice3#ProxyChoice
	 * MeetingNotice3.ProxyChoice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.MeetingNotice4#ProxyChoice
	 * MeetingNotice4.ProxyChoice}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Meeting
	 * Meeting}</li>
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
	public static final MMBusinessAssociationEnd ProxyAppointmentConditions = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MeetingNotice1.Proxy, com.tools20022.repository.msg.MeetingNotice2.Proxy, com.tools20022.repository.msg.MeetingNotice3.ProxyChoice,
					com.tools20022.repository.msg.MeetingNotice4.ProxyChoice);
			elementContext_lazy = () -> Meeting.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ProxyAppointmentConditions";
			definition = "Information on how to appoint proxy.";
			minOccurs = 0;
			type_lazy = () -> ProxyAppointmentCondition.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ProxyAppointmentCondition.Meeting;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
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
	 * {@linkplain com.tools20022.repository.entity.AdditionalRight#Meeting
	 * AdditionalRight.Meeting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.AdditionalRight
	 * AdditionalRight}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice3#AdditionalProcedureDetails
	 * MeetingNotice3.AdditionalProcedureDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice4#AdditionalProcedureDetails
	 * MeetingNotice4.AdditionalProcedureDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Meeting
	 * Meeting}</li>
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
	public static final MMBusinessAssociationEnd AdditionalRight = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MeetingNotice3.AdditionalProcedureDetails, com.tools20022.repository.msg.MeetingNotice4.AdditionalProcedureDetails);
			elementContext_lazy = () -> Meeting.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AdditionalRight";
			definition = "Specifies how the additional rights can be granted to the shareholder. These rights can be exercised at shareholders meetings (for example, the right to ask questions, the right to add items to the agenda or table draft resolutions).";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.AdditionalRight.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.AdditionalRight.Meeting;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.MeetingNotice1#Type
	 * MeetingNotice1.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.MeetingNotice2#Type
	 * MeetingNotice2.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.MeetingNotice3#Type
	 * MeetingNotice3.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.MeetingReference1#Type
	 * MeetingReference1.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.MeetingReference2#Type
	 * MeetingReference2.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.MeetingReference5#Type
	 * MeetingReference5.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.MeetingReference3#Type
	 * MeetingReference3.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.MeetingReference4#Type
	 * MeetingReference4.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.MeetingReference7#Type
	 * MeetingReference7.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.MeetingReference6#Type
	 * MeetingReference6.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.MeetingNotice4#Type
	 * MeetingNotice4.Type}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Meeting
	 * Meeting}</li>
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
	public static final MMBusinessAttribute Type = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MeetingNotice1.Type, com.tools20022.repository.msg.MeetingNotice2.Type, com.tools20022.repository.msg.MeetingNotice3.Type,
					com.tools20022.repository.msg.MeetingReference1.Type, com.tools20022.repository.msg.MeetingReference2.Type, com.tools20022.repository.msg.MeetingReference5.Type, com.tools20022.repository.msg.MeetingReference3.Type,
					com.tools20022.repository.msg.MeetingReference4.Type, com.tools20022.repository.msg.MeetingReference7.Type, com.tools20022.repository.msg.MeetingReference6.Type, com.tools20022.repository.msg.MeetingNotice4.Type);
			elementContext_lazy = () -> Meeting.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Specifies the type of meeting for which an invitation is sent.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> MeetingTypeCode.mmObject();
		}
	};
	/**
	 * Specifies the conditions to be filled in to obtain a valid power of
	 * attorney.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PowerOfAttorneyRequirements#Meeting
	 * PowerOfAttorneyRequirements.Meeting}</li>
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
	public static final MMBusinessAssociationEnd PowerOfAttorneyRequirements = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Meeting.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PowerOfAttorneyRequirements";
			definition = "Specifies the conditions to be filled in to obtain a valid power of attorney.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.PowerOfAttorneyRequirements.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PowerOfAttorneyRequirements.Meeting;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice2#Classification
	 * MeetingNotice2.Classification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice2#ExtendedClassification
	 * MeetingNotice2.ExtendedClassification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MeetingTypeClassification1Choice#Code
	 * MeetingTypeClassification1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MeetingTypeClassification1Choice#Proprietary
	 * MeetingTypeClassification1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice3#Classification
	 * MeetingNotice3.Classification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingReference2#Classification
	 * MeetingReference2.Classification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingReference2#ExtendedClassification
	 * MeetingReference2.ExtendedClassification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingReference5#Classification
	 * MeetingReference5.Classification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingReference3#Classification
	 * MeetingReference3.Classification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingReference3#ExtendedClassification
	 * MeetingReference3.ExtendedClassification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingReference4#Classification
	 * MeetingReference4.Classification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingReference7#Classification
	 * MeetingReference7.Classification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingReference6#Classification
	 * MeetingReference6.Classification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice4#Classification
	 * MeetingNotice4.Classification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Meeting
	 * Meeting}</li>
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
	public static final MMBusinessAttribute MeetingEventClassification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MeetingNotice2.Classification, com.tools20022.repository.msg.MeetingNotice2.ExtendedClassification,
					com.tools20022.repository.choice.MeetingTypeClassification1Choice.Code, com.tools20022.repository.choice.MeetingTypeClassification1Choice.Proprietary, com.tools20022.repository.msg.MeetingNotice3.Classification,
					com.tools20022.repository.msg.MeetingReference2.Classification, com.tools20022.repository.msg.MeetingReference2.ExtendedClassification, com.tools20022.repository.msg.MeetingReference5.Classification,
					com.tools20022.repository.msg.MeetingReference3.Classification, com.tools20022.repository.msg.MeetingReference3.ExtendedClassification, com.tools20022.repository.msg.MeetingReference4.Classification,
					com.tools20022.repository.msg.MeetingReference7.Classification, com.tools20022.repository.msg.MeetingReference6.Classification, com.tools20022.repository.msg.MeetingNotice4.Classification);
			elementContext_lazy = () -> Meeting.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MeetingEventClassification";
			definition = "Classifies the meeting.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> MeetingTypeClassificationCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Meeting";
				definition = "Specifies the physical parameters of a general meeting. Several dates and places can be defined for a  meeting.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ContactPoint.ContactPointForMeeting, com.tools20022.repository.entity.ContactPersonRole.Meeting,
						com.tools20022.repository.entity.CorporateActionEvent.RelatedMeeting, com.tools20022.repository.entity.Deadline.RelatedMeeting, com.tools20022.repository.entity.MeetingPartyRole.Meeting,
						com.tools20022.repository.entity.ResolutionProposal.Meeting, com.tools20022.repository.entity.ProxyAppointmentCondition.Meeting, com.tools20022.repository.entity.MeetingParticipation.Meeting,
						com.tools20022.repository.entity.Quorum.Meeting, com.tools20022.repository.entity.Resolution.Meeting, com.tools20022.repository.entity.MeetingStatus.Meeting, com.tools20022.repository.entity.VotingCondition.Meeting,
						com.tools20022.repository.entity.IncentivePremium.Meeting, com.tools20022.repository.entity.PowerOfAttorneyRequirements.Meeting, com.tools20022.repository.entity.AdditionalRight.Meeting,
						com.tools20022.repository.entity.MeetingServicing.MeetingSpecification);
				subType_lazy = () -> Arrays.asList(IssuerMeeting.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Meeting.DateAndTime, com.tools20022.repository.entity.Meeting.DateStatus, com.tools20022.repository.entity.Meeting.MeetingLocation,
						com.tools20022.repository.entity.Meeting.Identification, com.tools20022.repository.entity.Meeting.Deadline, com.tools20022.repository.entity.Meeting.MeetingServicing, com.tools20022.repository.entity.Meeting.Person,
						com.tools20022.repository.entity.Meeting.PartyRole, com.tools20022.repository.entity.Meeting.Status, com.tools20022.repository.entity.Meeting.CorporateEvent, com.tools20022.repository.entity.Meeting.Quorum,
						com.tools20022.repository.entity.Meeting.VotingCondition, com.tools20022.repository.entity.Meeting.AttendanceRequired, com.tools20022.repository.entity.Meeting.AttendanceConfirmation,
						com.tools20022.repository.entity.Meeting.IncentivePremium, com.tools20022.repository.entity.Meeting.Participation, com.tools20022.repository.entity.Meeting.ResolutionProposalConditions,
						com.tools20022.repository.entity.Meeting.AgendaItem, com.tools20022.repository.entity.Meeting.ProxyAppointmentConditions, com.tools20022.repository.entity.Meeting.AdditionalRight,
						com.tools20022.repository.entity.Meeting.Type, com.tools20022.repository.entity.Meeting.PowerOfAttorneyRequirements, com.tools20022.repository.entity.Meeting.MeetingEventClassification);
				derivationComponent_lazy = () -> Arrays.asList(MeetingContactPerson.mmObject(), Meeting1.mmObject(), MeetingContactPerson1.mmObject(), Meeting2.mmObject(), MeetingTypeClassification1Choice.mmObject(), Meeting3.mmObject(),
						MeetingReference1.mmObject(), MeetingReference2.mmObject(), MeetingReference5.mmObject(), MeetingReference3.mmObject(), MeetingReference4.mmObject(), MeetingReference7.mmObject(), MeetingReference6.mmObject(),
						Meeting4.mmObject(), MeetingContactPerson2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}