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

import com.tools20022.metamodel.ext.OtherSemanticMarkup;
import com.tools20022.metamodel.*;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.AddressTypeCode;
import com.tools20022.repository.datatype.Max16Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Max70Text;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Information that locates and identifies a specific address.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="PostalAddress" src="doc-files/PostalAddress.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.ContactPoint
 * ContactPoint}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.PostalAddress#mmAddressType
 * PostalAddress.mmAddressType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PostalAddress#mmStreetName
 * PostalAddress.mmStreetName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PostalAddress#mmStreetBuildingIdentification
 * PostalAddress.mmStreetBuildingIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PostalAddress#mmPostCodeIdentification
 * PostalAddress.mmPostCodeIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PostalAddress#mmTownName
 * PostalAddress.mmTownName}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PostalAddress#mmState
 * PostalAddress.mmState}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PostalAddress#mmBuildingName
 * PostalAddress.mmBuildingName}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PostalAddress#mmFloor
 * PostalAddress.mmFloor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PostalAddress#mmDistrictName
 * PostalAddress.mmDistrictName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PostalAddress#mmRegionIdentification
 * PostalAddress.mmRegionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PostalAddress#mmCountyIdentification
 * PostalAddress.mmCountyIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PostalAddress#mmPostOfficeBox
 * PostalAddress.mmPostOfficeBox}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PostalAddress#mmProvince
 * PostalAddress.mmProvince}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PostalAddress#mmDepartment
 * PostalAddress.mmDepartment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PostalAddress#mmSubDepartment
 * PostalAddress.mmSubDepartment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PostalAddress#mmLocation
 * PostalAddress.mmLocation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PostalAddress#mmChequeIssue
 * PostalAddress.mmChequeIssue}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PostalAddress#mmCountry
 * PostalAddress.mmCountry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PostalAddress#mmValidityPeriod
 * PostalAddress.mmValidityPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PostalAddress#mmSuiteIdentification
 * PostalAddress.mmSuiteIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PostalAddress#mmBuildingIdentification
 * PostalAddress.mmBuildingIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PostalAddress#mmMailDeliverySubLocation
 * PostalAddress.mmMailDeliverySubLocation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PostalAddress#mmBlock
 * PostalAddress.mmBlock}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PostalAddress#mmLot
 * PostalAddress.mmLot}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PostalAddress#mmDistrictSubDivisionIdentification
 * PostalAddress.mmDistrictSubDivisionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PostalAddress#mmMailingInstructions
 * PostalAddress.mmMailingInstructions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PostalAddress#mmPhysicalDelivery
 * PostalAddress.mmPhysicalDelivery}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Country#mmPostalAddressSpecification
 * Country.mmPostalAddressSpecification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Location#mmAddress
 * Location.mmAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmRelatedPostalAddress
 * DateTimePeriod.mmRelatedPostalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MailingInstructions#mmRelatedPostalAddress
 * MailingInstructions.mmRelatedPostalAddress}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ChequeIssue#mmDeliverTo
 * ChequeIssue.mmDeliverTo}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PhysicalDelivery#mmAddress
 * PhysicalDelivery.mmAddress}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ContactDetails1#mmFundManagerPostalAddress
 * ContactDetails1.mmFundManagerPostalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OrderDeskContactDetails#mmPostalAddress
 * OrderDeskContactDetails.mmPostalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ContactAttributes1#mmPostalAddress
 * ContactAttributes1.mmPostalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.LongPostalAddress1Choice#mmUnstructured
 * LongPostalAddress1Choice.mmUnstructured}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.LongPostalAddress1Choice#mmStructured
 * LongPostalAddress1Choice.mmStructured}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NameAndAddress2#mmAddress
 * NameAndAddress2.mmAddress}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NameAndAddress5#mmAddress
 * NameAndAddress5.mmAddress}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NameAndAddress1#mmAddress
 * NameAndAddress1.mmAddress}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NameAndAddress4#mmAddress
 * NameAndAddress4.mmAddress}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Organisation2#mmPostalAddress
 * Organisation2.mmPostalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson5#mmPostalAddress
 * IndividualPerson5.mmPostalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson10#mmPostalAddress
 * IndividualPerson10.mmPostalAddress}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BranchData#mmPostalAddress
 * BranchData.mmPostalAddress}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Organisation13#mmPostalAddress
 * Organisation13.mmPostalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson20#mmPostalAddress
 * IndividualPerson20.mmPostalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson8#mmIndividualInvestorAddress
 * IndividualPerson8.mmIndividualInvestorAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Organisation4#mmCorporateInvestorAddress
 * Organisation4.mmCorporateInvestorAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Organisation3#mmModifiedPostalAddress
 * Organisation3.mmModifiedPostalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson6#mmModifiedPostalAddress
 * IndividualPerson6.mmModifiedPostalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson11#mmModifiedPostalAddress
 * IndividualPerson11.mmModifiedPostalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstitutionIdentification8#mmPostalAddress
 * FinancialInstitutionIdentification8.mmPostalAddress}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BranchData2#mmPostalAddress
 * BranchData2.mmPostalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification8#mmPostalAddress
 * PartyIdentification8.mmPostalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification32#mmPostalAddress
 * PartyIdentification32.mmPostalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification43#mmPostalAddress
 * PartyIdentification43.mmPostalAddress}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferOut3#mmInvestorAddress
 * TransferOut3.mmInvestorAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NameAndAddress7#mmPostalAddress
 * NameAndAddress7.mmPostalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstitutionIdentification3#mmPostalAddress
 * FinancialInstitutionIdentification3.mmPostalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstitutionIdentification7#mmPostalAddress
 * FinancialInstitutionIdentification7.mmPostalAddress}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NameAndAddress13#mmAddress
 * NameAndAddress13.mmAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification6Choice#mmPostalAddress
 * PartyIdentification6Choice.mmPostalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification41#mmPostalAddress
 * PartyIdentification41.mmPostalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification40#mmPostalAddress
 * PartyIdentification40.mmPostalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Organisation6#mmOperationalAddress
 * Organisation6.mmOperationalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Organisation6#mmBusinessAddress
 * Organisation6.mmBusinessAddress}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Organisation6#mmLegalAddress
 * Organisation6.mmLegalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Organisation12#mmBusinessAddress
 * Organisation12.mmBusinessAddress}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Organisation12#mmLegalAddress
 * Organisation12.mmLegalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Organisation12#mmBillingAddress
 * Organisation12.mmBillingAddress}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AddressModification1#mmAddress
 * AddressModification1.mmAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OrganisationModification1#mmBusinessAddress
 * OrganisationModification1.mmBusinessAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OrganisationModification1#mmLegalAddress
 * OrganisationModification1.mmLegalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OrganisationModification1#mmBillingAddress
 * OrganisationModification1.mmBillingAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Organisation7#mmOperationalAddress
 * Organisation7.mmOperationalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Organisation7#mmBusinessAddress
 * Organisation7.mmBusinessAddress}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Organisation7#mmLegalAddress
 * Organisation7.mmLegalAddress}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NameAndAddress3#mmAddress
 * NameAndAddress3.mmAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RemittanceLocation1#mmRemittanceLocationPostalAddress
 * RemittanceLocation1.mmRemittanceLocationPostalAddress}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NameAndAddress10#mmAddress
 * NameAndAddress10.mmAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RemittanceLocation2#mmRemittanceLocationPostalAddress
 * RemittanceLocation2.mmRemittanceLocationPostalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification42#mmPostalAddress
 * PartyIdentification42.mmPostalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NonExtension1#mmNotificationRecipientAddress
 * NonExtension1.mmNotificationRecipientAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommunicationChannel1#mmDeliverToAddress
 * CommunicationChannel1.mmDeliverToAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AddressOrParty1Choice#mmNewAddress
 * AddressOrParty1Choice.mmNewAddress}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NameAndAddress8#mmAddress
 * NameAndAddress8.mmAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification59#mmAddress
 * PartyIdentification59.mmAddress}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Organisation5#mmAddress
 * Organisation5.mmAddress}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Organisation8#mmAddress
 * Organisation8.mmAddress}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Organisation9#mmAddress
 * Organisation9.mmAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification1#mmPostalAddress
 * PartyIdentification1.mmPostalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstitutionIdentification1#mmPostalAddress
 * FinancialInstitutionIdentification1.mmPostalAddress}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson7#mmAddress
 * IndividualPerson7.mmAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingNotice1#mmProxyAppointmentNotificationAddress
 * MeetingNotice1.mmProxyAppointmentNotificationAddress}</li>
 * <li>{@linkplain com.tools20022.repository.msg.VoteMethods#mmVoteByMail
 * VoteMethods.mmVoteByMail}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.VoteParameters#mmVotingBallotRequestAddress
 * VoteParameters.mmVotingBallotRequestAddress}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson14#mmAddress
 * IndividualPerson14.mmAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingNotice2#mmProxyAppointmentNotificationAddress
 * MeetingNotice2.mmProxyAppointmentNotificationAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.LocationFormat1Choice#mmAddress
 * LocationFormat1Choice.mmAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.VoteParameters1#mmVotingBallotRequestAddress
 * VoteParameters1.mmVotingBallotRequestAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.LongPostalAddress2Choice#mmUnstructured
 * LongPostalAddress2Choice.mmUnstructured}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.LongPostalAddress2Choice#mmStructured
 * LongPostalAddress2Choice.mmStructured}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson16#mmAddress
 * IndividualPerson16.mmAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingNotice3#mmProxyAppointmentNotificationAddress
 * MeetingNotice3.mmProxyAppointmentNotificationAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.VoteParameters2#mmVotingBallotRequestAddress
 * VoteParameters2.mmVotingBallotRequestAddress}</li>
 * <li>{@linkplain com.tools20022.repository.msg.VoteMethods2#mmVoteByMail
 * VoteMethods2.mmVoteByMail}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.VoteParameters3#mmVotingBallotRequestAddress
 * VoteParameters3.mmVotingBallotRequestAddress}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MeetingReference1#mmLocation
 * MeetingReference1.mmLocation}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MeetingReference2#mmLocation
 * MeetingReference2.mmLocation}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MeetingReference5#mmLocation
 * MeetingReference5.mmLocation}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MeetingReference3#mmLocation
 * MeetingReference3.mmLocation}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MeetingReference4#mmLocation
 * MeetingReference4.mmLocation}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NameAndAddress9#mmAddress
 * NameAndAddress9.mmAddress}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson13#mmAddress
 * IndividualPerson13.mmAddress}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson17#mmAddress
 * IndividualPerson17.mmAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification45#mmPostalAddress
 * PartyIdentification45.mmPostalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification9#mmPostalAddress
 * PartyIdentification9.mmPostalAddress}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NameAndAddress6#mmAddress
 * NameAndAddress6.mmAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification26#mmPostalAddress
 * PartyIdentification26.mmPostalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommunicationAddressDetails#mmPostalAddress
 * CommunicationAddressDetails.mmPostalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification58#mmPostalAddress
 * PartyIdentification58.mmPostalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification19#mmPostalAddress
 * PartyIdentification19.mmPostalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification18#mmPostalAddress
 * PartyIdentification18.mmPostalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification20#mmPostalAddress
 * PartyIdentification20.mmPostalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification31#mmPostalAddress
 * PartyIdentification31.mmPostalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification13#mmPostalAddress
 * PartyIdentification13.mmPostalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification16#mmPostalAddress
 * PartyIdentification16.mmPostalAddress}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NameAndAddress11#mmAddress
 * NameAndAddress11.mmAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification5#mmPostalAddress
 * PartyIdentification5.mmPostalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification24#mmPostalAddress
 * PartyIdentification24.mmPostalAddress}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferOut4#mmInvestorAddress
 * TransferOut4.mmInvestorAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson21#mmModifiedPostalAddress
 * IndividualPerson21.mmModifiedPostalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson22#mmPostalAddress
 * IndividualPerson22.mmPostalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Organisation15#mmModifiedPostalAddress
 * Organisation15.mmModifiedPostalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RemittanceLocationDetails1#mmPostalAddress
 * RemittanceLocationDetails1.mmPostalAddress}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Organisation16#mmPostalAddress
 * Organisation16.mmPostalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Organisation17#mmModifiedPostalAddress
 * Organisation17.mmModifiedPostalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson23#mmPostalAddress
 * IndividualPerson23.mmPostalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson24#mmModifiedPostalAddress
 * IndividualPerson24.mmModifiedPostalAddress}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MeetingReference7#mmLocation
 * MeetingReference7.mmLocation}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MeetingReference6#mmLocation
 * MeetingReference6.mmLocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.VoteParameters4#mmVotingBallotRequestAddress
 * VoteParameters4.mmVotingBallotRequestAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingNotice4#mmProxyAppointmentNotificationAddress
 * MeetingNotice4.mmProxyAppointmentNotificationAddress}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson25#mmAddress
 * IndividualPerson25.mmAddress}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson26#mmAddress
 * IndividualPerson26.mmAddress}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Organisation18#mmLocation
 * Organisation18.mmLocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommunicationAddress5#mmPostalAddress
 * CommunicationAddress5.mmPostalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification77#mmPostalAddress
 * PartyIdentification77.mmPostalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Organisation20#mmBusinessAddress
 * Organisation20.mmBusinessAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Organisation20#mmOperationalAddress
 * Organisation20.mmOperationalAddress}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Organisation20#mmLegalAddress
 * Organisation20.mmLegalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Organisation21#mmCorporateInvestorAddress
 * Organisation21.mmCorporateInvestorAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Organisation22#mmModifiedPostalAddress
 * Organisation22.mmModifiedPostalAddress}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Organisation23#mmPostalAddress
 * Organisation23.mmPostalAddress}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Organisation24#mmPostalAddress
 * Organisation24.mmPostalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson27#mmPostalAddress
 * IndividualPerson27.mmPostalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ModificationScope34#mmPostalAddress
 * ModificationScope34.mmPostalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson29#mmPostalAddress
 * IndividualPerson29.mmPostalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NameAndAddress15#mmPostalAddress
 * NameAndAddress15.mmPostalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification112#mmPostalAddress
 * PartyIdentification112.mmPostalAddress}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Organisation27#mmPostalAddress
 * Organisation27.mmPostalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TaxOrganisationIdentification1#mmPostalAddress
 * TaxOrganisationIdentification1.mmPostalAddress}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Organisation30#mmPostalAddress
 * Organisation30.mmPostalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Organisation29#mmModifiedPostalAddress
 * Organisation29.mmModifiedPostalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson34#mmPostalAddress
 * IndividualPerson34.mmPostalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Organisation31#mmCorporateInvestorAddress
 * Organisation31.mmCorporateInvestorAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommunicationAddress8#mmPostalAddress
 * CommunicationAddress8.mmPostalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification125#mmPostalAddress
 * PartyIdentification125.mmPostalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommunicationAddress9#mmPostalAddress
 * CommunicationAddress9.mmPostalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification129#mmPostalAddress
 * PartyIdentification129.mmPostalAddress}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress1 PostalAddress1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StructuredLongPostalAddress1
 * StructuredLongPostalAddress1}</li>
 * <li>{@linkplain com.tools20022.repository.choice.LongPostalAddress1Choice
 * LongPostalAddress1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress3 PostalAddress3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress6 PostalAddress6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress8 PostalAddress8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AddressModification1
 * AddressModification1}</li>
 * <li>{@linkplain com.tools20022.repository.choice.CountrySubdivision1Choice
 * CountrySubdivision1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress12
 * PostalAddress12}</li>
 * <li>{@linkplain com.tools20022.repository.choice.LongPostalAddress2Choice
 * LongPostalAddress2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress2 PostalAddress2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress5 PostalAddress5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress11
 * PostalAddress11}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress4 PostalAddress4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress7 PostalAddress7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress10
 * PostalAddress10}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress9 PostalAddress9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress13
 * PostalAddress13}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress17
 * PostalAddress17}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress19
 * PostalAddress19}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress18
 * PostalAddress18}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress21
 * PostalAddress21}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ModificationScope34
 * ModificationScope34}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress22
 * PostalAddress22}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PostalAddress"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information that locates and identifies a specific address."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
public class PostalAddress extends ContactPoint {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected AddressTypeCode addressType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AddressTypeCode
	 * AddressTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PostalAddress1#mmAddressType
	 * PostalAddress1.mmAddressType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PostalAddress3#mmAddressType
	 * PostalAddress3.mmAddressType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PostalAddress6#mmAddressType
	 * PostalAddress6.mmAddressType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PostalAddress8#mmAddressType
	 * PostalAddress8.mmAddressType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PostalAddress11#mmAddressType
	 * PostalAddress11.mmAddressType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PostalAddress19#mmAddressType
	 * PostalAddress19.mmAddressType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PostalAddress21#mmAddressType
	 * PostalAddress21.mmAddressType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommunicationAddress6#mmAddressType
	 * CommunicationAddress6.mmAddressType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PostalAddress22#mmAddressType
	 * PostalAddress22.mmAddressType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress PostalAddress}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AddressType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of address."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<PostalAddress, AddressTypeCode> mmAddressType = new MMBusinessAttribute<PostalAddress, AddressTypeCode>() {
		{
			derivation_lazy = () -> Arrays.asList(PostalAddress1.mmAddressType, PostalAddress3.mmAddressType, PostalAddress6.mmAddressType, PostalAddress8.mmAddressType, PostalAddress11.mmAddressType, PostalAddress19.mmAddressType,
					PostalAddress21.mmAddressType, CommunicationAddress6.mmAddressType, PostalAddress22.mmAddressType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PostalAddress.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AddressType";
			definition = "Specifies the type of address.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AddressTypeCode.mmObject();
		}

		@Override
		public AddressTypeCode getValue(PostalAddress obj) {
			return obj.getAddressType();
		}

		@Override
		public void setValue(PostalAddress obj, AddressTypeCode value) {
			obj.setAddressType(value);
		}
	};
	protected Max35Text streetName;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.PostalAddress1#mmStreetName
	 * PostalAddress1.mmStreetName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StructuredLongPostalAddress1#mmStreetName
	 * StructuredLongPostalAddress1.mmStreetName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PostalAddress6#mmStreetName
	 * PostalAddress6.mmStreetName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PostalAddress8#mmStreetName
	 * PostalAddress8.mmStreetName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PostalAddress2#mmStreetName
	 * PostalAddress2.mmStreetName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PostalAddress5#mmStreetName
	 * PostalAddress5.mmStreetName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PostalAddress11#mmStreetName
	 * PostalAddress11.mmStreetName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PostalAddress10#mmStreetName
	 * PostalAddress10.mmStreetName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PostalAddress9#mmStreetName
	 * PostalAddress9.mmStreetName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PostalAddress13#mmStreetName
	 * PostalAddress13.mmStreetName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PostalAddress17#mmStreetName
	 * PostalAddress17.mmStreetName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PostalAddress19#mmStreetName
	 * PostalAddress19.mmStreetName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PostalAddress18#mmStreetName
	 * PostalAddress18.mmStreetName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PostalAddress21#mmStreetName
	 * PostalAddress21.mmStreetName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PostalAddress22#mmStreetName
	 * PostalAddress22.mmStreetName}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress PostalAddress}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StreetName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name of a street or thoroughfare."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = type=Synonym, name=road, context=ebXML</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<PostalAddress, Max35Text> mmStreetName = new MMBusinessAttribute<PostalAddress, Max35Text>() {
		{
			derivation_lazy = () -> Arrays.asList(PostalAddress1.mmStreetName, StructuredLongPostalAddress1.mmStreetName, PostalAddress6.mmStreetName, PostalAddress8.mmStreetName, PostalAddress2.mmStreetName, PostalAddress5.mmStreetName,
					PostalAddress11.mmStreetName, PostalAddress10.mmStreetName, PostalAddress9.mmStreetName, PostalAddress13.mmStreetName, PostalAddress17.mmStreetName, PostalAddress19.mmStreetName, PostalAddress18.mmStreetName,
					PostalAddress21.mmStreetName, PostalAddress22.mmStreetName);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PostalAddress.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new OtherSemanticMarkup(this, "Synonym", new String[]{"name", "road"}, new String[]{"context", "ebXML"}));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "StreetName";
			definition = "Name of a street or thoroughfare.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(PostalAddress obj) {
			return obj.getStreetName();
		}

		@Override
		public void setValue(PostalAddress obj, Max35Text value) {
			obj.setStreetName(value);
		}
	};
	protected Max35Text streetBuildingIdentification;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.PostalAddress1#mmBuildingNumber
	 * PostalAddress1.mmBuildingNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StructuredLongPostalAddress1#mmStreetBuildingIdentification
	 * StructuredLongPostalAddress1.mmStreetBuildingIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PostalAddress6#mmBuildingNumber
	 * PostalAddress6.mmBuildingNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PostalAddress8#mmBuildingNumber
	 * PostalAddress8.mmBuildingNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PostalAddress11#mmBuildingNumber
	 * PostalAddress11.mmBuildingNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PostalAddress10#mmBuildingNumber
	 * PostalAddress10.mmBuildingNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PostalAddress9#mmBuildingNumber
	 * PostalAddress9.mmBuildingNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PostalAddress13#mmBuildingNumber
	 * PostalAddress13.mmBuildingNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PostalAddress17#mmBuildingNumber
	 * PostalAddress17.mmBuildingNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PostalAddress19#mmBuildingNumber
	 * PostalAddress19.mmBuildingNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PostalAddress18#mmBuildingNumber
	 * PostalAddress18.mmBuildingNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PostalAddress21#mmBuildingNumber
	 * PostalAddress21.mmBuildingNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PostalAddress22#mmBuildingNumber
	 * PostalAddress22.mmBuildingNumber}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress PostalAddress}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StreetBuildingIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number that identifies the position of a building on a street."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<PostalAddress, Max35Text> mmStreetBuildingIdentification = new MMBusinessAttribute<PostalAddress, Max35Text>() {
		{
			derivation_lazy = () -> Arrays.asList(PostalAddress1.mmBuildingNumber, StructuredLongPostalAddress1.mmStreetBuildingIdentification, PostalAddress6.mmBuildingNumber, PostalAddress8.mmBuildingNumber,
					PostalAddress11.mmBuildingNumber, PostalAddress10.mmBuildingNumber, PostalAddress9.mmBuildingNumber, PostalAddress13.mmBuildingNumber, PostalAddress17.mmBuildingNumber, PostalAddress19.mmBuildingNumber,
					PostalAddress18.mmBuildingNumber, PostalAddress21.mmBuildingNumber, PostalAddress22.mmBuildingNumber);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PostalAddress.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "StreetBuildingIdentification";
			definition = "Number that identifies the position of a building on a street.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(PostalAddress obj) {
			return obj.getStreetBuildingIdentification();
		}

		@Override
		public void setValue(PostalAddress obj, Max35Text value) {
			obj.setStreetBuildingIdentification(value);
		}
	};
	protected Max16Text postCodeIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max16Text
	 * Max16Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress1#mmPostCode
	 * PostalAddress1.mmPostCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StructuredLongPostalAddress1#mmPostCodeIdentification
	 * StructuredLongPostalAddress1.mmPostCodeIdentification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress6#mmPostCode
	 * PostalAddress6.mmPostCode}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress8#mmPostCode
	 * PostalAddress8.mmPostCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PostalAddress2#mmPostCodeIdentification
	 * PostalAddress2.mmPostCodeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PostalAddress5#mmPostCodeIdentification
	 * PostalAddress5.mmPostCodeIdentification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress11#mmPostCode
	 * PostalAddress11.mmPostCode}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress7#mmPostCode
	 * PostalAddress7.mmPostCode}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress10#mmPostCode
	 * PostalAddress10.mmPostCode}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress9#mmPostCode
	 * PostalAddress9.mmPostCode}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress13#mmPostCode
	 * PostalAddress13.mmPostCode}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress17#mmPostCode
	 * PostalAddress17.mmPostCode}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress19#mmPostCode
	 * PostalAddress19.mmPostCode}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress18#mmPostCode
	 * PostalAddress18.mmPostCode}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress21#mmPostCode
	 * PostalAddress21.mmPostCode}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress22#mmPostCode
	 * PostalAddress22.mmPostCode}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress PostalAddress}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PostCodeIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifier consisting of a group of letters and/or numbers that is added to a postal address to assist the sorting of mail."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<PostalAddress, Max16Text> mmPostCodeIdentification = new MMBusinessAttribute<PostalAddress, Max16Text>() {
		{
			derivation_lazy = () -> Arrays.asList(PostalAddress1.mmPostCode, StructuredLongPostalAddress1.mmPostCodeIdentification, PostalAddress6.mmPostCode, PostalAddress8.mmPostCode, PostalAddress2.mmPostCodeIdentification,
					PostalAddress5.mmPostCodeIdentification, PostalAddress11.mmPostCode, PostalAddress7.mmPostCode, PostalAddress10.mmPostCode, PostalAddress9.mmPostCode, PostalAddress13.mmPostCode, PostalAddress17.mmPostCode,
					PostalAddress19.mmPostCode, PostalAddress18.mmPostCode, PostalAddress21.mmPostCode, PostalAddress22.mmPostCode);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PostalAddress.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PostCodeIdentification";
			definition = "Identifier consisting of a group of letters and/or numbers that is added to a postal address to assist the sorting of mail.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max16Text.mmObject();
		}

		@Override
		public Max16Text getValue(PostalAddress obj) {
			return obj.getPostCodeIdentification();
		}

		@Override
		public void setValue(PostalAddress obj, Max16Text value) {
			obj.setPostCodeIdentification(value);
		}
	};
	protected Max35Text townName;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress1#mmTownName
	 * PostalAddress1.mmTownName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StructuredLongPostalAddress1#mmTownName
	 * StructuredLongPostalAddress1.mmTownName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson10#mmCityOfBirth
	 * IndividualPerson10.mmCityOfBirth}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson11#mmCityOfBirth
	 * IndividualPerson11.mmCityOfBirth}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress6#mmTownName
	 * PostalAddress6.mmTownName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DateAndPlaceOfBirth#mmCityOfBirth
	 * DateAndPlaceOfBirth.mmCityOfBirth}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress8#mmTownName
	 * PostalAddress8.mmTownName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress12#mmTownName
	 * PostalAddress12.mmTownName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress2#mmTownName
	 * PostalAddress2.mmTownName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AirportDescription1#mmTown
	 * AirportDescription1.mmTown}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress5#mmTownName
	 * PostalAddress5.mmTownName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress11#mmTownName
	 * PostalAddress11.mmTownName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress7#mmTownName
	 * PostalAddress7.mmTownName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress10#mmTownName
	 * PostalAddress10.mmTownName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress9#mmTownName
	 * PostalAddress9.mmTownName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress13#mmTownName
	 * PostalAddress13.mmTownName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress17#mmTownName
	 * PostalAddress17.mmTownName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress19#mmTownName
	 * PostalAddress19.mmTownName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress18#mmTownName
	 * PostalAddress18.mmTownName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress21#mmVillage
	 * PostalAddress21.mmVillage}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress21#mmTownName
	 * PostalAddress21.mmTownName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MarketIdentification92#mmCity
	 * MarketIdentification92.mmCity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DateAndPlaceOfBirth1#mmCityOfBirth
	 * DateAndPlaceOfBirth1.mmCityOfBirth}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress22#mmTownName
	 * PostalAddress22.mmTownName}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress PostalAddress}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TownName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Name of a built-up area, with defined boundaries, and a local government."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<PostalAddress, Max35Text> mmTownName = new MMBusinessAttribute<PostalAddress, Max35Text>() {
		{
			derivation_lazy = () -> Arrays.asList(PostalAddress1.mmTownName, StructuredLongPostalAddress1.mmTownName, IndividualPerson10.mmCityOfBirth, IndividualPerson11.mmCityOfBirth, PostalAddress6.mmTownName,
					DateAndPlaceOfBirth.mmCityOfBirth, PostalAddress8.mmTownName, PostalAddress12.mmTownName, PostalAddress2.mmTownName, AirportDescription1.mmTown, PostalAddress5.mmTownName, PostalAddress11.mmTownName,
					PostalAddress7.mmTownName, PostalAddress10.mmTownName, PostalAddress9.mmTownName, PostalAddress13.mmTownName, PostalAddress17.mmTownName, PostalAddress19.mmTownName, PostalAddress18.mmTownName,
					PostalAddress21.mmVillage, PostalAddress21.mmTownName, MarketIdentification92.mmCity, DateAndPlaceOfBirth1.mmCityOfBirth, PostalAddress22.mmTownName);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PostalAddress.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TownName";
			definition = "Name of a built-up area, with defined boundaries, and a local government.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(PostalAddress obj) {
			return obj.getTownName();
		}

		@Override
		public void setValue(PostalAddress obj, Max35Text value) {
			obj.setTownName(value);
		}
	};
	protected Max35Text state;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.PostalAddress1#mmCountrySubDivision
	 * PostalAddress1.mmCountrySubDivision}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StructuredLongPostalAddress1#mmState
	 * StructuredLongPostalAddress1.mmState}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PostalAddress6#mmCountrySubDivision
	 * PostalAddress6.mmCountrySubDivision}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PostalAddress8#mmCountrySubDivision
	 * PostalAddress8.mmCountrySubDivision}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PostalAddress12#mmCountrySubDivision
	 * PostalAddress12.mmCountrySubDivision}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PostalAddress2#mmCountrySubDivision
	 * PostalAddress2.mmCountrySubDivision}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PostalAddress5#mmCountrySubDivision
	 * PostalAddress5.mmCountrySubDivision}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PostalAddress11#mmCountrySubDivision
	 * PostalAddress11.mmCountrySubDivision}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PostalAddress10#mmCountrySubDivision
	 * PostalAddress10.mmCountrySubDivision}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PostalAddress9#mmCountrySubDivision
	 * PostalAddress9.mmCountrySubDivision}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PostalAddress13#mmCountrySubDivision
	 * PostalAddress13.mmCountrySubDivision}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PostalAddress17#mmCountrySubDivision
	 * PostalAddress17.mmCountrySubDivision}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PostalAddress19#mmCountrySubDivision
	 * PostalAddress19.mmCountrySubDivision}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PostalAddress18#mmCountrySubDivision
	 * PostalAddress18.mmCountrySubDivision}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DerivativePartyIdentification1Choice#mmCountrySubDivision
	 * DerivativePartyIdentification1Choice.mmCountrySubDivision}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress21#mmState
	 * PostalAddress21.mmState}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification82#mmState
	 * GenericIdentification82.mmState}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PostalAddress22#mmCountrySubDivision
	 * PostalAddress22.mmCountrySubDivision}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress PostalAddress}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "State"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Organised political community or area forming a part of a federation."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<PostalAddress, Max35Text> mmState = new MMBusinessAttribute<PostalAddress, Max35Text>() {
		{
			derivation_lazy = () -> Arrays.asList(PostalAddress1.mmCountrySubDivision, StructuredLongPostalAddress1.mmState, PostalAddress6.mmCountrySubDivision, PostalAddress8.mmCountrySubDivision, PostalAddress12.mmCountrySubDivision,
					PostalAddress2.mmCountrySubDivision, PostalAddress5.mmCountrySubDivision, PostalAddress11.mmCountrySubDivision, PostalAddress10.mmCountrySubDivision, PostalAddress9.mmCountrySubDivision,
					PostalAddress13.mmCountrySubDivision, PostalAddress17.mmCountrySubDivision, PostalAddress19.mmCountrySubDivision, PostalAddress18.mmCountrySubDivision, DerivativePartyIdentification1Choice.mmCountrySubDivision,
					PostalAddress21.mmState, GenericIdentification82.mmState, PostalAddress22.mmCountrySubDivision);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PostalAddress.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "State";
			definition = "Organised political community or area forming a part of a federation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(PostalAddress obj) {
			return obj.getState();
		}

		@Override
		public void setValue(PostalAddress obj, Max35Text value) {
			obj.setState(value);
		}
	};
	protected Max35Text buildingName;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.StructuredLongPostalAddress1#mmBuildingName
	 * StructuredLongPostalAddress1.mmBuildingName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PostalAddress11#mmBuildingName
	 * PostalAddress11.mmBuildingName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PostalAddress21#mmBuildingName
	 * PostalAddress21.mmBuildingName}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress PostalAddress}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BuildingName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name of the building or house."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<PostalAddress, Max35Text> mmBuildingName = new MMBusinessAttribute<PostalAddress, Max35Text>() {
		{
			derivation_lazy = () -> Arrays.asList(StructuredLongPostalAddress1.mmBuildingName, PostalAddress11.mmBuildingName, PostalAddress21.mmBuildingName);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PostalAddress.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BuildingName";
			definition = "Name of the building or house.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(PostalAddress obj) {
			return obj.getBuildingName();
		}

		@Override
		public void setValue(PostalAddress obj, Max35Text value) {
			obj.setBuildingName(value);
		}
	};
	protected Max16Text floor;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max16Text
	 * Max16Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StructuredLongPostalAddress1#mmFloor
	 * StructuredLongPostalAddress1.mmFloor}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress11#mmFloor
	 * PostalAddress11.mmFloor}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress21#mmFloor
	 * PostalAddress21.mmFloor}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress PostalAddress}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Floor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Floor or storey within a building."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<PostalAddress, Max16Text> mmFloor = new MMBusinessAttribute<PostalAddress, Max16Text>() {
		{
			derivation_lazy = () -> Arrays.asList(StructuredLongPostalAddress1.mmFloor, PostalAddress11.mmFloor, PostalAddress21.mmFloor);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PostalAddress.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Floor";
			definition = "Floor or storey within a building.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max16Text.mmObject();
		}

		@Override
		public Max16Text getValue(PostalAddress obj) {
			return obj.getFloor();
		}

		@Override
		public void setValue(PostalAddress obj, Max16Text value) {
			obj.setFloor(value);
		}
	};
	protected Max35Text districtName;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.StructuredLongPostalAddress1#mmDistrictName
	 * StructuredLongPostalAddress1.mmDistrictName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PostalAddress19#mmDistrictName
	 * PostalAddress19.mmDistrictName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PostalAddress21#mmDistrictName
	 * PostalAddress21.mmDistrictName}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress PostalAddress}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DistrictName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name of a district, ie, a part of a town or region."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<PostalAddress, Max35Text> mmDistrictName = new MMBusinessAttribute<PostalAddress, Max35Text>() {
		{
			derivation_lazy = () -> Arrays.asList(StructuredLongPostalAddress1.mmDistrictName, PostalAddress19.mmDistrictName, PostalAddress21.mmDistrictName);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PostalAddress.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DistrictName";
			definition = "Name of a district, ie, a part of a town or region.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(PostalAddress obj) {
			return obj.getDistrictName();
		}

		@Override
		public void setValue(PostalAddress obj, Max35Text value) {
			obj.setDistrictName(value);
		}
	};
	protected Max35Text regionIdentification;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.StructuredLongPostalAddress1#mmRegionIdentification
	 * StructuredLongPostalAddress1.mmRegionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ResidenceLocation1Choice#mmArea
	 * ResidenceLocation1Choice.mmArea}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress PostalAddress}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of an administrative division of a country, state, or territory."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<PostalAddress, Max35Text> mmRegionIdentification = new MMBusinessAttribute<PostalAddress, Max35Text>() {
		{
			derivation_lazy = () -> Arrays.asList(StructuredLongPostalAddress1.mmRegionIdentification, ResidenceLocation1Choice.mmArea);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PostalAddress.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RegionIdentification";
			definition = "Identification of an administrative division of a country, state, or territory.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(PostalAddress obj) {
			return obj.getRegionIdentification();
		}

		@Override
		public void setValue(PostalAddress obj, Max35Text value) {
			obj.setRegionIdentification(value);
		}
	};
	protected Max35Text countyIdentification;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.StructuredLongPostalAddress1#mmCountyIdentification
	 * StructuredLongPostalAddress1.mmCountyIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CountrySubdivision1Choice#mmCode
	 * CountrySubdivision1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CountrySubdivision1Choice#mmProprietary
	 * CountrySubdivision1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Location1#mmCountrySubDivision
	 * Location1.mmCountrySubDivision}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Location2#mmCountrySubDivision
	 * Location2.mmCountrySubDivision}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PostalAddress19#mmTownLocationName
	 * PostalAddress19.mmTownLocationName}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress PostalAddress}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CountyIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifier of a county."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<PostalAddress, Max35Text> mmCountyIdentification = new MMBusinessAttribute<PostalAddress, Max35Text>() {
		{
			derivation_lazy = () -> Arrays.asList(StructuredLongPostalAddress1.mmCountyIdentification, CountrySubdivision1Choice.mmCode, CountrySubdivision1Choice.mmProprietary, Location1.mmCountrySubDivision,
					Location2.mmCountrySubDivision, PostalAddress19.mmTownLocationName);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PostalAddress.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CountyIdentification";
			definition = "Identifier of a county.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(PostalAddress obj) {
			return obj.getCountyIdentification();
		}

		@Override
		public void setValue(PostalAddress obj, Max35Text value) {
			obj.setCountyIdentification(value);
		}
	};
	protected Max16Text postOfficeBox;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max16Text
	 * Max16Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StructuredLongPostalAddress1#mmPostOfficeBox
	 * StructuredLongPostalAddress1.mmPostOfficeBox}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress11#mmPostBox
	 * PostalAddress11.mmPostBox}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress21#mmPostBox
	 * PostalAddress21.mmPostBox}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress PostalAddress}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PostOfficeBox"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Numbered box in a post office, assigned to a person or organisation, where letters are kept until called for."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<PostalAddress, Max16Text> mmPostOfficeBox = new MMBusinessAttribute<PostalAddress, Max16Text>() {
		{
			derivation_lazy = () -> Arrays.asList(StructuredLongPostalAddress1.mmPostOfficeBox, PostalAddress11.mmPostBox, PostalAddress21.mmPostBox);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PostalAddress.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PostOfficeBox";
			definition = "Numbered box in a post office, assigned to a person or organisation, where letters are kept until called for.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max16Text.mmObject();
		}

		@Override
		public Max16Text getValue(PostalAddress obj) {
			return obj.getPostOfficeBox();
		}

		@Override
		public void setValue(PostalAddress obj, Max16Text value) {
			obj.setPostOfficeBox(value);
		}
	};
	protected Max35Text province;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson5#mmProvinceOfBirth
	 * IndividualPerson5.mmProvinceOfBirth}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson10#mmProvinceOfBirth
	 * IndividualPerson10.mmProvinceOfBirth}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson6#mmProvinceOfBirth
	 * IndividualPerson6.mmProvinceOfBirth}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson11#mmProvinceOfBirth
	 * IndividualPerson11.mmProvinceOfBirth}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DateAndPlaceOfBirth#mmProvinceOfBirth
	 * DateAndPlaceOfBirth.mmProvinceOfBirth}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson19#mmProvinceOfBirth
	 * IndividualPerson19.mmProvinceOfBirth}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DateAndPlaceOfBirth1#mmProvinceOfBirth
	 * DateAndPlaceOfBirth1.mmProvinceOfBirth}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress PostalAddress}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Province"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "A territory governed as an administrative or political unit of a country."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<PostalAddress, Max35Text> mmProvince = new MMBusinessAttribute<PostalAddress, Max35Text>() {
		{
			derivation_lazy = () -> Arrays.asList(IndividualPerson5.mmProvinceOfBirth, IndividualPerson10.mmProvinceOfBirth, IndividualPerson6.mmProvinceOfBirth, IndividualPerson11.mmProvinceOfBirth, DateAndPlaceOfBirth.mmProvinceOfBirth,
					IndividualPerson19.mmProvinceOfBirth, DateAndPlaceOfBirth1.mmProvinceOfBirth);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PostalAddress.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Province";
			definition = "A territory governed as an administrative or political unit of a country.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(PostalAddress obj) {
			return obj.getProvince();
		}

		@Override
		public void setValue(PostalAddress obj, Max35Text value) {
			obj.setProvince(value);
		}
	};
	protected Max70Text department;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PostalAddress6#mmDepartment
	 * PostalAddress6.mmDepartment}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Contacts3#mmDepartment
	 * Contacts3.mmDepartment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PostalAddress11#mmDepartment
	 * PostalAddress11.mmDepartment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PostalAddress19#mmDepartment
	 * PostalAddress19.mmDepartment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PostalAddress22#mmDepartment
	 * PostalAddress22.mmDepartment}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress PostalAddress}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Department"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of a division of a large organisation or building."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<PostalAddress, Max70Text> mmDepartment = new MMBusinessAttribute<PostalAddress, Max70Text>() {
		{
			derivation_lazy = () -> Arrays.asList(PostalAddress6.mmDepartment, Contacts3.mmDepartment, PostalAddress11.mmDepartment, PostalAddress19.mmDepartment, PostalAddress22.mmDepartment);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PostalAddress.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Department";
			definition = "Identification of a division of a large organisation or building.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max70Text.mmObject();
		}

		@Override
		public Max70Text getValue(PostalAddress obj) {
			return obj.getDepartment();
		}

		@Override
		public void setValue(PostalAddress obj, Max70Text value) {
			obj.setDepartment(value);
		}
	};
	protected Max70Text subDepartment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PostalAddress6#mmSubDepartment
	 * PostalAddress6.mmSubDepartment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PostalAddress11#mmSubDepartment
	 * PostalAddress11.mmSubDepartment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PostalAddress19#mmSubDepartment
	 * PostalAddress19.mmSubDepartment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PostalAddress22#mmSubDepartment
	 * PostalAddress22.mmSubDepartment}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress PostalAddress}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubDepartment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of a sub-division of a large organisation or building."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<PostalAddress, Max70Text> mmSubDepartment = new MMBusinessAttribute<PostalAddress, Max70Text>() {
		{
			derivation_lazy = () -> Arrays.asList(PostalAddress6.mmSubDepartment, PostalAddress11.mmSubDepartment, PostalAddress19.mmSubDepartment, PostalAddress22.mmSubDepartment);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PostalAddress.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SubDepartment";
			definition = "Identification of a sub-division of a large organisation or building.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max70Text.mmObject();
		}

		@Override
		public Max70Text getValue(PostalAddress obj) {
			return obj.getSubDepartment();
		}

		@Override
		public void setValue(PostalAddress obj, Max70Text value) {
			obj.setSubDepartment(value);
		}
	};
	protected Location location;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Location Location}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Location#mmAddress
	 * Location.mmAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress PostalAddress}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Location"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies a place."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<PostalAddress, com.tools20022.repository.entity.Location> mmLocation = new MMBusinessAssociationEnd<PostalAddress, com.tools20022.repository.entity.Location>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PostalAddress.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Location";
			definition = "Specifies a place.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Location.mmAddress;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Location.mmObject();
		}

		@Override
		public com.tools20022.repository.entity.Location getValue(PostalAddress obj) {
			return obj.getLocation();
		}

		@Override
		public void setValue(PostalAddress obj, com.tools20022.repository.entity.Location value) {
			obj.setLocation(value);
		}
	};
	protected ChequeIssue chequeIssue;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ChequeIssue
	 * ChequeIssue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ChequeIssue#mmDeliverTo
	 * ChequeIssue.mmDeliverTo}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress PostalAddress}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChequeIssue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cheque issue information for which a delivery address is specified."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<PostalAddress, com.tools20022.repository.entity.ChequeIssue> mmChequeIssue = new MMBusinessAssociationEnd<PostalAddress, com.tools20022.repository.entity.ChequeIssue>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PostalAddress.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ChequeIssue";
			definition = "Cheque issue information for which a delivery address is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.ChequeIssue.mmDeliverTo;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ChequeIssue.mmObject();
		}

		@Override
		public com.tools20022.repository.entity.ChequeIssue getValue(PostalAddress obj) {
			return obj.getChequeIssue();
		}

		@Override
		public void setValue(PostalAddress obj, com.tools20022.repository.entity.ChequeIssue value) {
			obj.setChequeIssue(value);
		}
	};
	protected Country country;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Country Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Country#mmPostalAddressSpecification
	 * Country.mmPostalAddressSpecification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption10#mmValidDomicileCountry
	 * CorporateActionOption10.mmValidDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption15#mmValidDomicileCountry
	 * CorporateActionOption15.mmValidDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption20#mmValidDomicileCountry
	 * CorporateActionOption20.mmValidDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption32#mmValidDomicileCountry
	 * CorporateActionOption32.mmValidDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption35#mmValidDomicileCountry
	 * CorporateActionOption35.mmValidDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption44#mmValidDomicileCountry
	 * CorporateActionOption44.mmValidDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption52#mmValidDomicileCountry
	 * CorporateActionOption52.mmValidDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption55#mmValidDomicileCountry
	 * CorporateActionOption55.mmValidDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption3#mmValidDomicileCountry
	 * CorporateActionOption3.mmValidDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption17#mmValidDomicileCountry
	 * CorporateActionOption17.mmValidDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption19#mmValidDomicileCountry
	 * CorporateActionOption19.mmValidDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption34#mmValidDomicileCountry
	 * CorporateActionOption34.mmValidDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption36#mmValidDomicileCountry
	 * CorporateActionOption36.mmValidDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption45#mmValidDomicileCountry
	 * CorporateActionOption45.mmValidDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption51#mmValidDomicileCountry
	 * CorporateActionOption51.mmValidDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption56#mmValidDomicileCountry
	 * CorporateActionOption56.mmValidDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption100#mmValidDomicileCountry
	 * CorporateActionOption100.mmValidDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption101#mmValidDomicileCountry
	 * CorporateActionOption101.mmValidDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption108#mmValidDomicileCountry
	 * CorporateActionOption108.mmValidDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption106#mmValidDomicileCountry
	 * CorporateActionOption106.mmValidDomicileCountry}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Acquirer6#mmCountryCode
	 * Acquirer6.mmCountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SectorAndLocation1#mmLocation
	 * SectorAndLocation1.mmLocation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTransaction1#mmCountryOfBranch
	 * SecuritiesTransaction1.mmCountryOfBranch}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TradingVenueIdentification1Choice#mmNationalCompetentAuthority
	 * TradingVenueIdentification1Choice.mmNationalCompetentAuthority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification76#mmCountryOfBranch
	 * PartyIdentification76.mmCountryOfBranch}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Counterparty2#mmCountry
	 * Counterparty2.mmCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionCertificate1#mmBankAccountDomiciliationCountry
	 * TransactionCertificate1.mmBankAccountDomiciliationCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ShipmentAttribute1#mmCountryOfCounterParty
	 * ShipmentAttribute1.mmCountryOfCounterParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption115#mmValidDomicileCountry
	 * CorporateActionOption115.mmValidDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption114#mmValidDomicileCountry
	 * CorporateActionOption114.mmValidDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DerivativePartyIdentification1Choice#mmCountry
	 * DerivativePartyIdentification1Choice.mmCountry}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Counterparty3#mmCountry
	 * Counterparty3.mmCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption125#mmValidDomicileCountry
	 * CorporateActionOption125.mmValidDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption127#mmValidDomicileCountry
	 * CorporateActionOption127.mmValidDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportedPartyIdentification1#mmLocation
	 * ReportedPartyIdentification1.mmLocation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption130#mmValidDomicileCountry
	 * CorporateActionOption130.mmValidDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption129#mmValidDomicileCountry
	 * CorporateActionOption129.mmValidDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption135#mmValidDomicileCountry
	 * CorporateActionOption135.mmValidDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption133#mmValidDomicileCountry
	 * CorporateActionOption133.mmValidDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NameAndLocation1#mmLocation
	 * NameAndLocation1.mmLocation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption138#mmValidDomicileCountry
	 * CorporateActionOption138.mmValidDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption139#mmValidDomicileCountry
	 * CorporateActionOption139.mmValidDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption148#mmValidDomicileCountry
	 * CorporateActionOption148.mmValidDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption150#mmValidDomicileCountry
	 * CorporateActionOption150.mmValidDomicileCountry}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress PostalAddress}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Country"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Country of the address."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<PostalAddress, com.tools20022.repository.entity.Country> mmCountry = new MMBusinessAssociationEnd<PostalAddress, com.tools20022.repository.entity.Country>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionOption10.mmValidDomicileCountry, CorporateActionOption15.mmValidDomicileCountry, CorporateActionOption20.mmValidDomicileCountry,
					CorporateActionOption32.mmValidDomicileCountry, CorporateActionOption35.mmValidDomicileCountry, CorporateActionOption44.mmValidDomicileCountry, CorporateActionOption52.mmValidDomicileCountry,
					CorporateActionOption55.mmValidDomicileCountry, CorporateActionOption3.mmValidDomicileCountry, CorporateActionOption17.mmValidDomicileCountry, CorporateActionOption19.mmValidDomicileCountry,
					CorporateActionOption34.mmValidDomicileCountry, CorporateActionOption36.mmValidDomicileCountry, CorporateActionOption45.mmValidDomicileCountry, CorporateActionOption51.mmValidDomicileCountry,
					CorporateActionOption56.mmValidDomicileCountry, CorporateActionOption100.mmValidDomicileCountry, CorporateActionOption101.mmValidDomicileCountry, CorporateActionOption108.mmValidDomicileCountry,
					CorporateActionOption106.mmValidDomicileCountry, Acquirer6.mmCountryCode, SectorAndLocation1.mmLocation, SecuritiesTransaction1.mmCountryOfBranch, TradingVenueIdentification1Choice.mmNationalCompetentAuthority,
					PartyIdentification76.mmCountryOfBranch, Counterparty2.mmCountry, TransactionCertificate1.mmBankAccountDomiciliationCountry, ShipmentAttribute1.mmCountryOfCounterParty, CorporateActionOption115.mmValidDomicileCountry,
					CorporateActionOption114.mmValidDomicileCountry, DerivativePartyIdentification1Choice.mmCountry, Counterparty3.mmCountry, CorporateActionOption125.mmValidDomicileCountry, CorporateActionOption127.mmValidDomicileCountry,
					ReportedPartyIdentification1.mmLocation, CorporateActionOption130.mmValidDomicileCountry, CorporateActionOption129.mmValidDomicileCountry, CorporateActionOption135.mmValidDomicileCountry,
					CorporateActionOption133.mmValidDomicileCountry, NameAndLocation1.mmLocation, CorporateActionOption138.mmValidDomicileCountry, CorporateActionOption139.mmValidDomicileCountry,
					CorporateActionOption148.mmValidDomicileCountry, CorporateActionOption150.mmValidDomicileCountry);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PostalAddress.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Country";
			definition = "Country of the address.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Country.mmPostalAddressSpecification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Country.mmObject();
		}

		@Override
		public com.tools20022.repository.entity.Country getValue(PostalAddress obj) {
			return obj.getCountry();
		}

		@Override
		public void setValue(PostalAddress obj, com.tools20022.repository.entity.Country value) {
			obj.setCountry(value);
		}
	};
	protected List<DateTimePeriod> validityPeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmRelatedPostalAddress
	 * DateTimePeriod.mmRelatedPostalAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress PostalAddress}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValidityPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the period during which a postal address is valid."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<PostalAddress, List<DateTimePeriod>> mmValidityPeriod = new MMBusinessAssociationEnd<PostalAddress, List<DateTimePeriod>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PostalAddress.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ValidityPeriod";
			definition = "Specifies the period during which a postal address is valid.";
			minOccurs = 0;
			opposite_lazy = () -> DateTimePeriod.mmRelatedPostalAddress;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> DateTimePeriod.mmObject();
		}

		@Override
		public List<DateTimePeriod> getValue(PostalAddress obj) {
			return obj.getValidityPeriod();
		}

		@Override
		public void setValue(PostalAddress obj, List<DateTimePeriod> value) {
			obj.setValidityPeriod(value);
		}
	};
	protected Max35Text suiteIdentification;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.PostalAddress21#mmSuiteIdentification
	 * PostalAddress21.mmSuiteIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress PostalAddress}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SuiteIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of a suite or apartment."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<PostalAddress, Max35Text> mmSuiteIdentification = new MMBusinessAttribute<PostalAddress, Max35Text>() {
		{
			derivation_lazy = () -> Arrays.asList(PostalAddress21.mmSuiteIdentification);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PostalAddress.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SuiteIdentification";
			definition = "Identification of a suite or apartment.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(PostalAddress obj) {
			return obj.getSuiteIdentification();
		}

		@Override
		public void setValue(PostalAddress obj, Max35Text value) {
			obj.setSuiteIdentification(value);
		}
	};
	protected Max35Text buildingIdentification;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.PostalAddress21#mmSideInBuilding
	 * PostalAddress21.mmSideInBuilding}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress PostalAddress}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BuildingIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of a building, within a group of buildings, that have the same street number identifier."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<PostalAddress, Max35Text> mmBuildingIdentification = new MMBusinessAttribute<PostalAddress, Max35Text>() {
		{
			derivation_lazy = () -> Arrays.asList(PostalAddress21.mmSideInBuilding);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PostalAddress.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BuildingIdentification";
			definition = "Identification of a building, within a group of buildings, that have the same street number identifier.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(PostalAddress obj) {
			return obj.getBuildingIdentification();
		}

		@Override
		public void setValue(PostalAddress obj, Max35Text value) {
			obj.setBuildingIdentification(value);
		}
	};
	protected Max35Text mailDeliverySubLocation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress PostalAddress}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MailDeliverySubLocation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specific place to deliver mail within a pre-defined postal address."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<PostalAddress, Max35Text> mmMailDeliverySubLocation = new MMBusinessAttribute<PostalAddress, Max35Text>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PostalAddress.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MailDeliverySubLocation";
			definition = "Specific place to deliver mail within a pre-defined postal address.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(PostalAddress obj) {
			return obj.getMailDeliverySubLocation();
		}

		@Override
		public void setValue(PostalAddress obj, Max35Text value) {
			obj.setMailDeliverySubLocation(value);
		}
	};
	protected Max35Text block;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress PostalAddress}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Block"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Area of land bounded by streets."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<PostalAddress, Max35Text> mmBlock = new MMBusinessAttribute<PostalAddress, Max35Text>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PostalAddress.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Block";
			definition = "Area of land bounded by streets.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(PostalAddress obj) {
			return obj.getBlock();
		}

		@Override
		public void setValue(PostalAddress obj, Max35Text value) {
			obj.setBlock(value);
		}
	};
	protected Max35Text lot;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress PostalAddress}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Lot"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of an allotment of land."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<PostalAddress, Max35Text> mmLot = new MMBusinessAttribute<PostalAddress, Max35Text>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PostalAddress.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Lot";
			definition = "Identification of an allotment of land.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(PostalAddress obj) {
			return obj.getLot();
		}

		@Override
		public void setValue(PostalAddress obj, Max35Text value) {
			obj.setLot(value);
		}
	};
	protected Max35Text districtSubDivisionIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress PostalAddress}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DistrictSubDivisionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of a sub-division of a district."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<PostalAddress, Max35Text> mmDistrictSubDivisionIdentification = new MMBusinessAttribute<PostalAddress, Max35Text>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PostalAddress.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DistrictSubDivisionIdentification";
			definition = "Identification of a sub-division of a district.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(PostalAddress obj) {
			return obj.getDistrictSubDivisionIdentification();
		}

		@Override
		public void setValue(PostalAddress obj, Max35Text value) {
			obj.setDistrictSubDivisionIdentification(value);
		}
	};
	protected List<com.tools20022.repository.entity.MailingInstructions> mailingInstructions;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.MailingInstructions
	 * MailingInstructions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.MailingInstructions#mmRelatedPostalAddress
	 * MailingInstructions.mmRelatedPostalAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress PostalAddress}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MailingInstructions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the characteristics of an address."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<PostalAddress, List<MailingInstructions>> mmMailingInstructions = new MMBusinessAssociationEnd<PostalAddress, List<MailingInstructions>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PostalAddress.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MailingInstructions";
			definition = "Specifies the characteristics of an address.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.MailingInstructions.mmRelatedPostalAddress;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.MailingInstructions.mmObject();
		}

		@Override
		public List<MailingInstructions> getValue(PostalAddress obj) {
			return obj.getMailingInstructions();
		}

		@Override
		public void setValue(PostalAddress obj, List<MailingInstructions> value) {
			obj.setMailingInstructions(value);
		}
	};
	protected PhysicalDelivery physicalDelivery;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PhysicalDelivery
	 * PhysicalDelivery}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PhysicalDelivery#mmAddress
	 * PhysicalDelivery.mmAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress PostalAddress}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalDelivery"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Physical delivery information related to an address."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<PostalAddress, Optional<PhysicalDelivery>> mmPhysicalDelivery = new MMBusinessAssociationEnd<PostalAddress, Optional<PhysicalDelivery>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PostalAddress.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PhysicalDelivery";
			definition = "Physical delivery information related to an address.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PhysicalDelivery.mmAddress;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PhysicalDelivery.mmObject();
		}

		@Override
		public Optional<PhysicalDelivery> getValue(PostalAddress obj) {
			return obj.getPhysicalDelivery();
		}

		@Override
		public void setValue(PostalAddress obj, Optional<PhysicalDelivery> value) {
			obj.setPhysicalDelivery(value.orElse(null));
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PostalAddress";
				definition = "Information that locates and identifies a specific address.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Country.mmPostalAddressSpecification, com.tools20022.repository.entity.Location.mmAddress, DateTimePeriod.mmRelatedPostalAddress,
						com.tools20022.repository.entity.MailingInstructions.mmRelatedPostalAddress, com.tools20022.repository.entity.ChequeIssue.mmDeliverTo, com.tools20022.repository.entity.PhysicalDelivery.mmAddress);
				derivationElement_lazy = () -> Arrays.asList(ContactDetails1.mmFundManagerPostalAddress, OrderDeskContactDetails.mmPostalAddress, ContactAttributes1.mmPostalAddress, LongPostalAddress1Choice.mmUnstructured,
						LongPostalAddress1Choice.mmStructured, NameAndAddress2.mmAddress, NameAndAddress5.mmAddress, NameAndAddress1.mmAddress, NameAndAddress4.mmAddress, Organisation2.mmPostalAddress, IndividualPerson5.mmPostalAddress,
						IndividualPerson10.mmPostalAddress, BranchData.mmPostalAddress, Organisation13.mmPostalAddress, IndividualPerson20.mmPostalAddress, IndividualPerson8.mmIndividualInvestorAddress,
						Organisation4.mmCorporateInvestorAddress, Organisation3.mmModifiedPostalAddress, IndividualPerson6.mmModifiedPostalAddress, IndividualPerson11.mmModifiedPostalAddress,
						FinancialInstitutionIdentification8.mmPostalAddress, BranchData2.mmPostalAddress, PartyIdentification8.mmPostalAddress, PartyIdentification32.mmPostalAddress, PartyIdentification43.mmPostalAddress,
						TransferOut3.mmInvestorAddress, NameAndAddress7.mmPostalAddress, FinancialInstitutionIdentification3.mmPostalAddress, FinancialInstitutionIdentification7.mmPostalAddress, NameAndAddress13.mmAddress,
						PartyIdentification6Choice.mmPostalAddress, PartyIdentification41.mmPostalAddress, PartyIdentification40.mmPostalAddress, Organisation6.mmOperationalAddress, Organisation6.mmBusinessAddress,
						Organisation6.mmLegalAddress, Organisation12.mmBusinessAddress, Organisation12.mmLegalAddress, Organisation12.mmBillingAddress, AddressModification1.mmAddress, OrganisationModification1.mmBusinessAddress,
						OrganisationModification1.mmLegalAddress, OrganisationModification1.mmBillingAddress, Organisation7.mmOperationalAddress, Organisation7.mmBusinessAddress, Organisation7.mmLegalAddress, NameAndAddress3.mmAddress,
						RemittanceLocation1.mmRemittanceLocationPostalAddress, NameAndAddress10.mmAddress, RemittanceLocation2.mmRemittanceLocationPostalAddress, PartyIdentification42.mmPostalAddress,
						NonExtension1.mmNotificationRecipientAddress, CommunicationChannel1.mmDeliverToAddress, AddressOrParty1Choice.mmNewAddress, NameAndAddress8.mmAddress, PartyIdentification59.mmAddress, Organisation5.mmAddress,
						Organisation8.mmAddress, Organisation9.mmAddress, PartyIdentification1.mmPostalAddress, FinancialInstitutionIdentification1.mmPostalAddress, IndividualPerson7.mmAddress,
						MeetingNotice1.mmProxyAppointmentNotificationAddress, VoteMethods.mmVoteByMail, VoteParameters.mmVotingBallotRequestAddress, IndividualPerson14.mmAddress, MeetingNotice2.mmProxyAppointmentNotificationAddress,
						LocationFormat1Choice.mmAddress, VoteParameters1.mmVotingBallotRequestAddress, LongPostalAddress2Choice.mmUnstructured, LongPostalAddress2Choice.mmStructured, IndividualPerson16.mmAddress,
						MeetingNotice3.mmProxyAppointmentNotificationAddress, VoteParameters2.mmVotingBallotRequestAddress, VoteMethods2.mmVoteByMail, VoteParameters3.mmVotingBallotRequestAddress, MeetingReference1.mmLocation,
						MeetingReference2.mmLocation, MeetingReference5.mmLocation, MeetingReference3.mmLocation, MeetingReference4.mmLocation, NameAndAddress9.mmAddress, IndividualPerson13.mmAddress, IndividualPerson17.mmAddress,
						PartyIdentification45.mmPostalAddress, PartyIdentification9.mmPostalAddress, NameAndAddress6.mmAddress, PartyIdentification26.mmPostalAddress, CommunicationAddressDetails.mmPostalAddress,
						PartyIdentification58.mmPostalAddress, PartyIdentification19.mmPostalAddress, PartyIdentification18.mmPostalAddress, PartyIdentification20.mmPostalAddress, PartyIdentification31.mmPostalAddress,
						PartyIdentification13.mmPostalAddress, PartyIdentification16.mmPostalAddress, NameAndAddress11.mmAddress, PartyIdentification5.mmPostalAddress, PartyIdentification24.mmPostalAddress, TransferOut4.mmInvestorAddress,
						IndividualPerson21.mmModifiedPostalAddress, IndividualPerson22.mmPostalAddress, Organisation15.mmModifiedPostalAddress, RemittanceLocationDetails1.mmPostalAddress, Organisation16.mmPostalAddress,
						Organisation17.mmModifiedPostalAddress, IndividualPerson23.mmPostalAddress, IndividualPerson24.mmModifiedPostalAddress, MeetingReference7.mmLocation, MeetingReference6.mmLocation,
						VoteParameters4.mmVotingBallotRequestAddress, MeetingNotice4.mmProxyAppointmentNotificationAddress, IndividualPerson25.mmAddress, IndividualPerson26.mmAddress, Organisation18.mmLocation,
						CommunicationAddress5.mmPostalAddress, PartyIdentification77.mmPostalAddress, Organisation20.mmBusinessAddress, Organisation20.mmOperationalAddress, Organisation20.mmLegalAddress,
						Organisation21.mmCorporateInvestorAddress, Organisation22.mmModifiedPostalAddress, Organisation23.mmPostalAddress, Organisation24.mmPostalAddress, IndividualPerson27.mmPostalAddress,
						ModificationScope34.mmPostalAddress, IndividualPerson29.mmPostalAddress, NameAndAddress15.mmPostalAddress, PartyIdentification112.mmPostalAddress, Organisation27.mmPostalAddress,
						TaxOrganisationIdentification1.mmPostalAddress, Organisation30.mmPostalAddress, Organisation29.mmModifiedPostalAddress, IndividualPerson34.mmPostalAddress, Organisation31.mmCorporateInvestorAddress,
						CommunicationAddress8.mmPostalAddress, PartyIdentification125.mmPostalAddress, CommunicationAddress9.mmPostalAddress, PartyIdentification129.mmPostalAddress);
				superType_lazy = () -> ContactPoint.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PostalAddress.mmAddressType, com.tools20022.repository.entity.PostalAddress.mmStreetName,
						com.tools20022.repository.entity.PostalAddress.mmStreetBuildingIdentification, com.tools20022.repository.entity.PostalAddress.mmPostCodeIdentification, com.tools20022.repository.entity.PostalAddress.mmTownName,
						com.tools20022.repository.entity.PostalAddress.mmState, com.tools20022.repository.entity.PostalAddress.mmBuildingName, com.tools20022.repository.entity.PostalAddress.mmFloor,
						com.tools20022.repository.entity.PostalAddress.mmDistrictName, com.tools20022.repository.entity.PostalAddress.mmRegionIdentification, com.tools20022.repository.entity.PostalAddress.mmCountyIdentification,
						com.tools20022.repository.entity.PostalAddress.mmPostOfficeBox, com.tools20022.repository.entity.PostalAddress.mmProvince, com.tools20022.repository.entity.PostalAddress.mmDepartment,
						com.tools20022.repository.entity.PostalAddress.mmSubDepartment, com.tools20022.repository.entity.PostalAddress.mmLocation, com.tools20022.repository.entity.PostalAddress.mmChequeIssue,
						com.tools20022.repository.entity.PostalAddress.mmCountry, com.tools20022.repository.entity.PostalAddress.mmValidityPeriod, com.tools20022.repository.entity.PostalAddress.mmSuiteIdentification,
						com.tools20022.repository.entity.PostalAddress.mmBuildingIdentification, com.tools20022.repository.entity.PostalAddress.mmMailDeliverySubLocation, com.tools20022.repository.entity.PostalAddress.mmBlock,
						com.tools20022.repository.entity.PostalAddress.mmLot, com.tools20022.repository.entity.PostalAddress.mmDistrictSubDivisionIdentification, com.tools20022.repository.entity.PostalAddress.mmMailingInstructions,
						com.tools20022.repository.entity.PostalAddress.mmPhysicalDelivery);
				derivationComponent_lazy = () -> Arrays.asList(PostalAddress1.mmObject(), StructuredLongPostalAddress1.mmObject(), LongPostalAddress1Choice.mmObject(), PostalAddress3.mmObject(), PostalAddress6.mmObject(),
						PostalAddress8.mmObject(), AddressModification1.mmObject(), CountrySubdivision1Choice.mmObject(), PostalAddress12.mmObject(), LongPostalAddress2Choice.mmObject(), PostalAddress2.mmObject(),
						PostalAddress5.mmObject(), PostalAddress11.mmObject(), PostalAddress4.mmObject(), PostalAddress7.mmObject(), PostalAddress10.mmObject(), PostalAddress9.mmObject(), PostalAddress13.mmObject(),
						PostalAddress17.mmObject(), PostalAddress19.mmObject(), PostalAddress18.mmObject(), PostalAddress21.mmObject(), ModificationScope34.mmObject(), PostalAddress22.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return PostalAddress.class;
			}
		});
		return mmObject_lazy.get();
	}

	public AddressTypeCode getAddressType() {
		return addressType;
	}

	public PostalAddress setAddressType(AddressTypeCode addressType) {
		this.addressType = Objects.requireNonNull(addressType);
		return this;
	}

	public Max35Text getStreetName() {
		return streetName;
	}

	public PostalAddress setStreetName(Max35Text streetName) {
		this.streetName = Objects.requireNonNull(streetName);
		return this;
	}

	public Max35Text getStreetBuildingIdentification() {
		return streetBuildingIdentification;
	}

	public PostalAddress setStreetBuildingIdentification(Max35Text streetBuildingIdentification) {
		this.streetBuildingIdentification = Objects.requireNonNull(streetBuildingIdentification);
		return this;
	}

	public Max16Text getPostCodeIdentification() {
		return postCodeIdentification;
	}

	public PostalAddress setPostCodeIdentification(Max16Text postCodeIdentification) {
		this.postCodeIdentification = Objects.requireNonNull(postCodeIdentification);
		return this;
	}

	public Max35Text getTownName() {
		return townName;
	}

	public PostalAddress setTownName(Max35Text townName) {
		this.townName = Objects.requireNonNull(townName);
		return this;
	}

	public Max35Text getState() {
		return state;
	}

	public PostalAddress setState(Max35Text state) {
		this.state = Objects.requireNonNull(state);
		return this;
	}

	public Max35Text getBuildingName() {
		return buildingName;
	}

	public PostalAddress setBuildingName(Max35Text buildingName) {
		this.buildingName = Objects.requireNonNull(buildingName);
		return this;
	}

	public Max16Text getFloor() {
		return floor;
	}

	public PostalAddress setFloor(Max16Text floor) {
		this.floor = Objects.requireNonNull(floor);
		return this;
	}

	public Max35Text getDistrictName() {
		return districtName;
	}

	public PostalAddress setDistrictName(Max35Text districtName) {
		this.districtName = Objects.requireNonNull(districtName);
		return this;
	}

	public Max35Text getRegionIdentification() {
		return regionIdentification;
	}

	public PostalAddress setRegionIdentification(Max35Text regionIdentification) {
		this.regionIdentification = Objects.requireNonNull(regionIdentification);
		return this;
	}

	public Max35Text getCountyIdentification() {
		return countyIdentification;
	}

	public PostalAddress setCountyIdentification(Max35Text countyIdentification) {
		this.countyIdentification = Objects.requireNonNull(countyIdentification);
		return this;
	}

	public Max16Text getPostOfficeBox() {
		return postOfficeBox;
	}

	public PostalAddress setPostOfficeBox(Max16Text postOfficeBox) {
		this.postOfficeBox = Objects.requireNonNull(postOfficeBox);
		return this;
	}

	public Max35Text getProvince() {
		return province;
	}

	public PostalAddress setProvince(Max35Text province) {
		this.province = Objects.requireNonNull(province);
		return this;
	}

	public Max70Text getDepartment() {
		return department;
	}

	public PostalAddress setDepartment(Max70Text department) {
		this.department = Objects.requireNonNull(department);
		return this;
	}

	public Max70Text getSubDepartment() {
		return subDepartment;
	}

	public PostalAddress setSubDepartment(Max70Text subDepartment) {
		this.subDepartment = Objects.requireNonNull(subDepartment);
		return this;
	}

	public Location getLocation() {
		return location;
	}

	public PostalAddress setLocation(com.tools20022.repository.entity.Location location) {
		this.location = Objects.requireNonNull(location);
		return this;
	}

	public ChequeIssue getChequeIssue() {
		return chequeIssue;
	}

	public PostalAddress setChequeIssue(com.tools20022.repository.entity.ChequeIssue chequeIssue) {
		this.chequeIssue = Objects.requireNonNull(chequeIssue);
		return this;
	}

	public Country getCountry() {
		return country;
	}

	public PostalAddress setCountry(com.tools20022.repository.entity.Country country) {
		this.country = Objects.requireNonNull(country);
		return this;
	}

	public List<DateTimePeriod> getValidityPeriod() {
		return validityPeriod == null ? validityPeriod = new ArrayList<>() : validityPeriod;
	}

	public PostalAddress setValidityPeriod(List<DateTimePeriod> validityPeriod) {
		this.validityPeriod = Objects.requireNonNull(validityPeriod);
		return this;
	}

	public Max35Text getSuiteIdentification() {
		return suiteIdentification;
	}

	public PostalAddress setSuiteIdentification(Max35Text suiteIdentification) {
		this.suiteIdentification = Objects.requireNonNull(suiteIdentification);
		return this;
	}

	public Max35Text getBuildingIdentification() {
		return buildingIdentification;
	}

	public PostalAddress setBuildingIdentification(Max35Text buildingIdentification) {
		this.buildingIdentification = Objects.requireNonNull(buildingIdentification);
		return this;
	}

	public Max35Text getMailDeliverySubLocation() {
		return mailDeliverySubLocation;
	}

	public PostalAddress setMailDeliverySubLocation(Max35Text mailDeliverySubLocation) {
		this.mailDeliverySubLocation = Objects.requireNonNull(mailDeliverySubLocation);
		return this;
	}

	public Max35Text getBlock() {
		return block;
	}

	public PostalAddress setBlock(Max35Text block) {
		this.block = Objects.requireNonNull(block);
		return this;
	}

	public Max35Text getLot() {
		return lot;
	}

	public PostalAddress setLot(Max35Text lot) {
		this.lot = Objects.requireNonNull(lot);
		return this;
	}

	public Max35Text getDistrictSubDivisionIdentification() {
		return districtSubDivisionIdentification;
	}

	public PostalAddress setDistrictSubDivisionIdentification(Max35Text districtSubDivisionIdentification) {
		this.districtSubDivisionIdentification = Objects.requireNonNull(districtSubDivisionIdentification);
		return this;
	}

	public List<MailingInstructions> getMailingInstructions() {
		return mailingInstructions == null ? mailingInstructions = new ArrayList<>() : mailingInstructions;
	}

	public PostalAddress setMailingInstructions(List<com.tools20022.repository.entity.MailingInstructions> mailingInstructions) {
		this.mailingInstructions = Objects.requireNonNull(mailingInstructions);
		return this;
	}

	public Optional<PhysicalDelivery> getPhysicalDelivery() {
		return physicalDelivery == null ? Optional.empty() : Optional.of(physicalDelivery);
	}

	public PostalAddress setPhysicalDelivery(com.tools20022.repository.entity.PhysicalDelivery physicalDelivery) {
		this.physicalDelivery = physicalDelivery;
		return this;
	}
}