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
import com.tools20022.repository.choice.CountrySubdivision1Choice;
import com.tools20022.repository.choice.LongPostalAddress1Choice;
import com.tools20022.repository.choice.LongPostalAddress2Choice;
import com.tools20022.repository.codeset.AddressTypeCode;
import com.tools20022.repository.datatype.Max16Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Max70Text;
import com.tools20022.repository.entity.ContactPoint;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Information that locates and identifies a specific address.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="PostalAddress" src="doc-files/PostalAddress.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
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
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.ContactPoint
 * ContactPoint}</li>
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
 * "PostalAddress"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information that locates and identifies a specific address."</li>
 * </ul>
 */
public class PostalAddress extends ContactPoint {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected AddressTypeCode addressType;
	/**
	 * Specifies the type of address.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AddressTypeCode
	 * AddressTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress PostalAddress}
	 * </li>
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
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AddressType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of address."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmAddressType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PostalAddress1.mmAddressType, com.tools20022.repository.msg.PostalAddress3.mmAddressType, com.tools20022.repository.msg.PostalAddress6.mmAddressType,
					com.tools20022.repository.msg.PostalAddress8.mmAddressType, com.tools20022.repository.msg.PostalAddress11.mmAddressType, com.tools20022.repository.msg.PostalAddress19.mmAddressType,
					com.tools20022.repository.msg.PostalAddress21.mmAddressType, com.tools20022.repository.msg.CommunicationAddress6.mmAddressType);
			elementContext_lazy = () -> PostalAddress.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AddressType";
			definition = "Specifies the type of address.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AddressTypeCode.mmObject();
		}
	};
	protected Max35Text streetName;
	/**
	 * Name of a street or thoroughfare.
	 * <p>
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
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StreetName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name of a street or thoroughfare."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmStreetName = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PostalAddress1.mmStreetName, com.tools20022.repository.msg.StructuredLongPostalAddress1.mmStreetName,
					com.tools20022.repository.msg.PostalAddress6.mmStreetName, com.tools20022.repository.msg.PostalAddress8.mmStreetName, com.tools20022.repository.msg.PostalAddress2.mmStreetName,
					com.tools20022.repository.msg.PostalAddress5.mmStreetName, com.tools20022.repository.msg.PostalAddress11.mmStreetName, com.tools20022.repository.msg.PostalAddress10.mmStreetName,
					com.tools20022.repository.msg.PostalAddress9.mmStreetName, com.tools20022.repository.msg.PostalAddress13.mmStreetName, com.tools20022.repository.msg.PostalAddress17.mmStreetName,
					com.tools20022.repository.msg.PostalAddress19.mmStreetName, com.tools20022.repository.msg.PostalAddress18.mmStreetName, com.tools20022.repository.msg.PostalAddress21.mmStreetName);
			elementContext_lazy = () -> PostalAddress.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StreetName";
			definition = "Name of a street or thoroughfare.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text streetBuildingIdentification;
	/**
	 * Number that identifies the position of a building on a street.
	 * <p>
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
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StreetBuildingIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number that identifies the position of a building on a street."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmStreetBuildingIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PostalAddress1.mmBuildingNumber, com.tools20022.repository.msg.StructuredLongPostalAddress1.mmStreetBuildingIdentification,
					com.tools20022.repository.msg.PostalAddress6.mmBuildingNumber, com.tools20022.repository.msg.PostalAddress8.mmBuildingNumber, com.tools20022.repository.msg.PostalAddress11.mmBuildingNumber,
					com.tools20022.repository.msg.PostalAddress10.mmBuildingNumber, com.tools20022.repository.msg.PostalAddress9.mmBuildingNumber, com.tools20022.repository.msg.PostalAddress13.mmBuildingNumber,
					com.tools20022.repository.msg.PostalAddress17.mmBuildingNumber, com.tools20022.repository.msg.PostalAddress19.mmBuildingNumber, com.tools20022.repository.msg.PostalAddress18.mmBuildingNumber,
					com.tools20022.repository.msg.PostalAddress21.mmBuildingNumber);
			elementContext_lazy = () -> PostalAddress.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StreetBuildingIdentification";
			definition = "Number that identifies the position of a building on a street.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max16Text postCodeIdentification;
	/**
	 * Identifier consisting of a group of letters and/or numbers that is added
	 * to a postal address to assist the sorting of mail.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max16Text
	 * Max16Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress PostalAddress}
	 * </li>
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
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PostCodeIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifier consisting of a group of letters and/or numbers that is added to a postal address to assist the sorting of mail."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmPostCodeIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PostalAddress1.mmPostCode, com.tools20022.repository.msg.StructuredLongPostalAddress1.mmPostCodeIdentification,
					com.tools20022.repository.msg.PostalAddress6.mmPostCode, com.tools20022.repository.msg.PostalAddress8.mmPostCode, com.tools20022.repository.msg.PostalAddress2.mmPostCodeIdentification,
					com.tools20022.repository.msg.PostalAddress5.mmPostCodeIdentification, com.tools20022.repository.msg.PostalAddress11.mmPostCode, com.tools20022.repository.msg.PostalAddress7.mmPostCode,
					com.tools20022.repository.msg.PostalAddress10.mmPostCode, com.tools20022.repository.msg.PostalAddress9.mmPostCode, com.tools20022.repository.msg.PostalAddress13.mmPostCode,
					com.tools20022.repository.msg.PostalAddress17.mmPostCode, com.tools20022.repository.msg.PostalAddress19.mmPostCode, com.tools20022.repository.msg.PostalAddress18.mmPostCode,
					com.tools20022.repository.msg.PostalAddress21.mmPostCode);
			elementContext_lazy = () -> PostalAddress.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PostCodeIdentification";
			definition = "Identifier consisting of a group of letters and/or numbers that is added to a postal address to assist the sorting of mail.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max16Text.mmObject();
		}
	};
	protected Max35Text townName;
	/**
	 * Name of a built-up area, with defined boundaries, and a local government.
	 * <p>
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
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TownName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Name of a built-up area, with defined boundaries, and a local government."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTownName = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PostalAddress1.mmTownName, com.tools20022.repository.msg.StructuredLongPostalAddress1.mmTownName,
					com.tools20022.repository.msg.IndividualPerson10.mmCityOfBirth, com.tools20022.repository.msg.IndividualPerson11.mmCityOfBirth, com.tools20022.repository.msg.PostalAddress6.mmTownName,
					com.tools20022.repository.msg.DateAndPlaceOfBirth.mmCityOfBirth, com.tools20022.repository.msg.PostalAddress8.mmTownName, com.tools20022.repository.msg.PostalAddress12.mmTownName,
					com.tools20022.repository.msg.PostalAddress2.mmTownName, com.tools20022.repository.msg.AirportDescription1.mmTown, com.tools20022.repository.msg.PostalAddress5.mmTownName,
					com.tools20022.repository.msg.PostalAddress11.mmTownName, com.tools20022.repository.msg.PostalAddress7.mmTownName, com.tools20022.repository.msg.PostalAddress10.mmTownName,
					com.tools20022.repository.msg.PostalAddress9.mmTownName, com.tools20022.repository.msg.PostalAddress13.mmTownName, com.tools20022.repository.msg.PostalAddress17.mmTownName,
					com.tools20022.repository.msg.PostalAddress19.mmTownName, com.tools20022.repository.msg.PostalAddress18.mmTownName, com.tools20022.repository.msg.PostalAddress21.mmVillage,
					com.tools20022.repository.msg.PostalAddress21.mmTownName, com.tools20022.repository.msg.MarketIdentification92.mmCity);
			elementContext_lazy = () -> PostalAddress.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TownName";
			definition = "Name of a built-up area, with defined boundaries, and a local government.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text state;
	/**
	 * Organised political community or area forming a part of a federation.
	 * <p>
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
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "State"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Organised political community or area forming a part of a federation."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmState = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PostalAddress1.mmCountrySubDivision, com.tools20022.repository.msg.StructuredLongPostalAddress1.mmState,
					com.tools20022.repository.msg.PostalAddress6.mmCountrySubDivision, com.tools20022.repository.msg.PostalAddress8.mmCountrySubDivision, com.tools20022.repository.msg.PostalAddress12.mmCountrySubDivision,
					com.tools20022.repository.msg.PostalAddress2.mmCountrySubDivision, com.tools20022.repository.msg.PostalAddress5.mmCountrySubDivision, com.tools20022.repository.msg.PostalAddress11.mmCountrySubDivision,
					com.tools20022.repository.msg.PostalAddress10.mmCountrySubDivision, com.tools20022.repository.msg.PostalAddress9.mmCountrySubDivision, com.tools20022.repository.msg.PostalAddress13.mmCountrySubDivision,
					com.tools20022.repository.msg.PostalAddress17.mmCountrySubDivision, com.tools20022.repository.msg.PostalAddress19.mmCountrySubDivision, com.tools20022.repository.msg.PostalAddress18.mmCountrySubDivision,
					com.tools20022.repository.choice.DerivativePartyIdentification1Choice.mmCountrySubDivision, com.tools20022.repository.msg.PostalAddress21.mmState, com.tools20022.repository.msg.GenericIdentification82.mmState);
			elementContext_lazy = () -> PostalAddress.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "State";
			definition = "Organised political community or area forming a part of a federation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text buildingName;
	/**
	 * Name of the building or house.
	 * <p>
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BuildingName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name of the building or house."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmBuildingName = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.StructuredLongPostalAddress1.mmBuildingName, com.tools20022.repository.msg.PostalAddress11.mmBuildingName,
					com.tools20022.repository.msg.PostalAddress21.mmBuildingName);
			elementContext_lazy = () -> PostalAddress.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BuildingName";
			definition = "Name of the building or house.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max16Text floor;
	/**
	 * Floor or storey within a building.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max16Text
	 * Max16Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress PostalAddress}
	 * </li>
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Floor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Floor or storey within a building."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmFloor = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.StructuredLongPostalAddress1.mmFloor, com.tools20022.repository.msg.PostalAddress11.mmFloor, com.tools20022.repository.msg.PostalAddress21.mmFloor);
			elementContext_lazy = () -> PostalAddress.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Floor";
			definition = "Floor or storey within a building.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max16Text.mmObject();
		}
	};
	protected Max35Text districtName;
	/**
	 * Name of a district, ie, a part of a town or region.
	 * <p>
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DistrictName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name of a district, ie, a part of a town or region."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmDistrictName = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.StructuredLongPostalAddress1.mmDistrictName, com.tools20022.repository.msg.PostalAddress19.mmDistrictName,
					com.tools20022.repository.msg.PostalAddress21.mmDistrictName);
			elementContext_lazy = () -> PostalAddress.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DistrictName";
			definition = "Name of a district, ie, a part of a town or region.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text regionIdentification;
	/**
	 * Identification of an administrative division of a country, state, or
	 * territory.
	 * <p>
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of an administrative division of a country, state, or territory."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmRegionIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.StructuredLongPostalAddress1.mmRegionIdentification, com.tools20022.repository.choice.ResidenceLocation1Choice.mmArea);
			elementContext_lazy = () -> PostalAddress.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RegionIdentification";
			definition = "Identification of an administrative division of a country, state, or territory.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text countyIdentification;
	/**
	 * Identifier of a county.
	 * <p>
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CountyIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifier of a county."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCountyIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.StructuredLongPostalAddress1.mmCountyIdentification, com.tools20022.repository.choice.CountrySubdivision1Choice.mmCode,
					com.tools20022.repository.choice.CountrySubdivision1Choice.mmProprietary, com.tools20022.repository.msg.Location1.mmCountrySubDivision, com.tools20022.repository.msg.Location2.mmCountrySubDivision,
					com.tools20022.repository.msg.PostalAddress19.mmTownLocationName);
			elementContext_lazy = () -> PostalAddress.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CountyIdentification";
			definition = "Identifier of a county.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max16Text postOfficeBox;
	/**
	 * Numbered box in a post office, assigned to a person or organisation,
	 * where letters are kept until called for.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max16Text
	 * Max16Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress PostalAddress}
	 * </li>
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PostOfficeBox"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Numbered box in a post office, assigned to a person or organisation, where letters are kept until called for."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmPostOfficeBox = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.StructuredLongPostalAddress1.mmPostOfficeBox, com.tools20022.repository.msg.PostalAddress11.mmPostBox, com.tools20022.repository.msg.PostalAddress21.mmPostBox);
			elementContext_lazy = () -> PostalAddress.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PostOfficeBox";
			definition = "Numbered box in a post office, assigned to a person or organisation, where letters are kept until called for.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max16Text.mmObject();
		}
	};
	protected Max35Text province;
	/**
	 * A territory governed as an administrative or political unit of a country.
	 * <p>
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
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Province"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "A territory governed as an administrative or political unit of a country."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmProvince = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IndividualPerson5.mmProvinceOfBirth, com.tools20022.repository.msg.IndividualPerson10.mmProvinceOfBirth,
					com.tools20022.repository.msg.IndividualPerson6.mmProvinceOfBirth, com.tools20022.repository.msg.IndividualPerson11.mmProvinceOfBirth, com.tools20022.repository.msg.DateAndPlaceOfBirth.mmProvinceOfBirth);
			elementContext_lazy = () -> PostalAddress.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Province";
			definition = "A territory governed as an administrative or political unit of a country.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max70Text department;
	/**
	 * Identification of a division of a large organisation or building.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress PostalAddress}
	 * </li>
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
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Department"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of a division of a large organisation or building."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmDepartment = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PostalAddress6.mmDepartment, com.tools20022.repository.msg.Contacts3.mmDepartment, com.tools20022.repository.msg.PostalAddress11.mmDepartment,
					com.tools20022.repository.msg.PostalAddress19.mmDepartment);
			elementContext_lazy = () -> PostalAddress.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Department";
			definition = "Identification of a division of a large organisation or building.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};
	protected Max70Text subDepartment;
	/**
	 * Identification of a sub-division of a large organisation or building.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress PostalAddress}
	 * </li>
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
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubDepartment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of a sub-division of a large organisation or building."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmSubDepartment = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PostalAddress6.mmSubDepartment, com.tools20022.repository.msg.PostalAddress11.mmSubDepartment, com.tools20022.repository.msg.PostalAddress19.mmSubDepartment);
			elementContext_lazy = () -> PostalAddress.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SubDepartment";
			definition = "Identification of a sub-division of a large organisation or building.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};
	protected Location location;
	/**
	 * Specifies a place.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Location#mmAddress
	 * Location.mmAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Location Location}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress PostalAddress}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Location"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies a place."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmLocation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PostalAddress.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Location";
			definition = "Specifies a place.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Location.mmAddress;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Location.mmObject();
		}
	};
	protected ChequeIssue chequeIssue;
	/**
	 * Cheque issue information for which a delivery address is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ChequeIssue#mmDeliverTo
	 * ChequeIssue.mmDeliverTo}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ChequeIssue
	 * ChequeIssue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress PostalAddress}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChequeIssue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cheque issue information for which a delivery address is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmChequeIssue = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PostalAddress.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ChequeIssue";
			definition = "Cheque issue information for which a delivery address is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.ChequeIssue.mmDeliverTo;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ChequeIssue.mmObject();
		}
	};
	protected Country country;
	/**
	 * Country of the address.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Country#mmPostalAddressSpecification
	 * Country.mmPostalAddressSpecification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Country Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress PostalAddress}
	 * </li>
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
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Country"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Country of the address."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCountry = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionOption10.mmValidDomicileCountry, com.tools20022.repository.msg.CorporateActionOption15.mmValidDomicileCountry,
					com.tools20022.repository.msg.CorporateActionOption20.mmValidDomicileCountry, com.tools20022.repository.msg.CorporateActionOption32.mmValidDomicileCountry,
					com.tools20022.repository.msg.CorporateActionOption35.mmValidDomicileCountry, com.tools20022.repository.msg.CorporateActionOption44.mmValidDomicileCountry,
					com.tools20022.repository.msg.CorporateActionOption52.mmValidDomicileCountry, com.tools20022.repository.msg.CorporateActionOption55.mmValidDomicileCountry,
					com.tools20022.repository.msg.CorporateActionOption3.mmValidDomicileCountry, com.tools20022.repository.msg.CorporateActionOption17.mmValidDomicileCountry,
					com.tools20022.repository.msg.CorporateActionOption19.mmValidDomicileCountry, com.tools20022.repository.msg.CorporateActionOption34.mmValidDomicileCountry,
					com.tools20022.repository.msg.CorporateActionOption36.mmValidDomicileCountry, com.tools20022.repository.msg.CorporateActionOption45.mmValidDomicileCountry,
					com.tools20022.repository.msg.CorporateActionOption51.mmValidDomicileCountry, com.tools20022.repository.msg.CorporateActionOption56.mmValidDomicileCountry,
					com.tools20022.repository.msg.CorporateActionOption100.mmValidDomicileCountry, com.tools20022.repository.msg.CorporateActionOption101.mmValidDomicileCountry,
					com.tools20022.repository.msg.CorporateActionOption108.mmValidDomicileCountry, com.tools20022.repository.msg.CorporateActionOption106.mmValidDomicileCountry, com.tools20022.repository.msg.Acquirer6.mmCountryCode,
					com.tools20022.repository.msg.SectorAndLocation1.mmLocation, com.tools20022.repository.msg.SecuritiesTransaction1.mmCountryOfBranch,
					com.tools20022.repository.choice.TradingVenueIdentification1Choice.mmNationalCompetentAuthority, com.tools20022.repository.msg.PartyIdentification76.mmCountryOfBranch,
					com.tools20022.repository.msg.TransactionCertificate1.mmBankAccountDomiciliationCountry, com.tools20022.repository.msg.ShipmentAttribute1.mmCountryOfCounterParty,
					com.tools20022.repository.msg.CorporateActionOption115.mmValidDomicileCountry, com.tools20022.repository.msg.CorporateActionOption114.mmValidDomicileCountry,
					com.tools20022.repository.choice.DerivativePartyIdentification1Choice.mmCountry, com.tools20022.repository.msg.CorporateActionOption125.mmValidDomicileCountry,
					com.tools20022.repository.msg.CorporateActionOption127.mmValidDomicileCountry, com.tools20022.repository.msg.ReportedPartyIdentification1.mmLocation,
					com.tools20022.repository.msg.CorporateActionOption130.mmValidDomicileCountry, com.tools20022.repository.msg.CorporateActionOption129.mmValidDomicileCountry,
					com.tools20022.repository.msg.CorporateActionOption135.mmValidDomicileCountry, com.tools20022.repository.msg.CorporateActionOption133.mmValidDomicileCountry, com.tools20022.repository.msg.NameAndLocation1.mmLocation);
			elementContext_lazy = () -> PostalAddress.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Country";
			definition = "Country of the address.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Country.mmPostalAddressSpecification;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Country.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.DateTimePeriod> validityPeriod;
	/**
	 * Specifies the period during which a postal address is valid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmRelatedPostalAddress
	 * DateTimePeriod.mmRelatedPostalAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress PostalAddress}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValidityPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the period during which a postal address is valid."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmValidityPeriod = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PostalAddress.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ValidityPeriod";
			definition = "Specifies the period during which a postal address is valid.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmRelatedPostalAddress;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
		}
	};
	protected Max35Text suiteIdentification;
	/**
	 * Identification of a suite or apartment.
	 * <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PostalAddress21#mmSuiteIdentification
	 * PostalAddress21.mmSuiteIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SuiteIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of a suite or apartment."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmSuiteIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PostalAddress21.mmSuiteIdentification);
			elementContext_lazy = () -> PostalAddress.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SuiteIdentification";
			definition = "Identification of a suite or apartment.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text buildingIdentification;
	/**
	 * Identification of a building, within a group of buildings, that have the
	 * same street number identifier.
	 * <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PostalAddress21#mmSideInBuilding
	 * PostalAddress21.mmSideInBuilding}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BuildingIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of a building, within a group of buildings, that have the same street number identifier."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmBuildingIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PostalAddress21.mmSideInBuilding);
			elementContext_lazy = () -> PostalAddress.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BuildingIdentification";
			definition = "Identification of a building, within a group of buildings, that have the same street number identifier.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text mailDeliverySubLocation;
	/**
	 * Specific place to deliver mail within a pre-defined postal address.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MailDeliverySubLocation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specific place to deliver mail within a pre-defined postal address."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmMailDeliverySubLocation = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> PostalAddress.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MailDeliverySubLocation";
			definition = "Specific place to deliver mail within a pre-defined postal address.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text block;
	/**
	 * Area of land bounded by streets.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Block"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Area of land bounded by streets."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmBlock = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> PostalAddress.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Block";
			definition = "Area of land bounded by streets.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text lot;
	/**
	 * Identification of an allotment of land.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Lot"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of an allotment of land."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmLot = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> PostalAddress.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Lot";
			definition = "Identification of an allotment of land.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text districtSubDivisionIdentification;
	/**
	 * Identification of a sub-division of a district.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DistrictSubDivisionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of a sub-division of a district."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmDistrictSubDivisionIdentification = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> PostalAddress.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DistrictSubDivisionIdentification";
			definition = "Identification of a sub-division of a district.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.MailingInstructions> mailingInstructions;
	/**
	 * Specifies the characteristics of an address.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.MailingInstructions#mmRelatedPostalAddress
	 * MailingInstructions.mmRelatedPostalAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.MailingInstructions
	 * MailingInstructions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress PostalAddress}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MailingInstructions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the characteristics of an address."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmMailingInstructions = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PostalAddress.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MailingInstructions";
			definition = "Specifies the characteristics of an address.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.MailingInstructions.mmRelatedPostalAddress;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.MailingInstructions.mmObject();
		}
	};
	protected PhysicalDelivery physicalDelivery;
	/**
	 * Physical delivery information related to an address.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PhysicalDelivery#mmAddress
	 * PhysicalDelivery.mmAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PhysicalDelivery
	 * PhysicalDelivery}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress PostalAddress}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalDelivery"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Physical delivery information related to an address."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPhysicalDelivery = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PostalAddress.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PhysicalDelivery";
			definition = "Physical delivery information related to an address.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PhysicalDelivery.mmAddress;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PhysicalDelivery.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PostalAddress";
				definition = "Information that locates and identifies a specific address.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Country.mmPostalAddressSpecification, com.tools20022.repository.entity.Location.mmAddress,
						com.tools20022.repository.entity.DateTimePeriod.mmRelatedPostalAddress, com.tools20022.repository.entity.MailingInstructions.mmRelatedPostalAddress, com.tools20022.repository.entity.ChequeIssue.mmDeliverTo,
						com.tools20022.repository.entity.PhysicalDelivery.mmAddress);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ContactDetails1.mmFundManagerPostalAddress, com.tools20022.repository.msg.OrderDeskContactDetails.mmPostalAddress,
						com.tools20022.repository.msg.ContactAttributes1.mmPostalAddress, com.tools20022.repository.choice.LongPostalAddress1Choice.mmUnstructured, com.tools20022.repository.choice.LongPostalAddress1Choice.mmStructured,
						com.tools20022.repository.msg.NameAndAddress2.mmAddress, com.tools20022.repository.msg.NameAndAddress5.mmAddress, com.tools20022.repository.msg.NameAndAddress1.mmAddress,
						com.tools20022.repository.msg.NameAndAddress4.mmAddress, com.tools20022.repository.msg.Organisation2.mmPostalAddress, com.tools20022.repository.msg.IndividualPerson5.mmPostalAddress,
						com.tools20022.repository.msg.IndividualPerson10.mmPostalAddress, com.tools20022.repository.msg.BranchData.mmPostalAddress, com.tools20022.repository.msg.Organisation13.mmPostalAddress,
						com.tools20022.repository.msg.IndividualPerson20.mmPostalAddress, com.tools20022.repository.msg.IndividualPerson8.mmIndividualInvestorAddress, com.tools20022.repository.msg.Organisation4.mmCorporateInvestorAddress,
						com.tools20022.repository.msg.Organisation3.mmModifiedPostalAddress, com.tools20022.repository.msg.IndividualPerson6.mmModifiedPostalAddress, com.tools20022.repository.msg.IndividualPerson11.mmModifiedPostalAddress,
						com.tools20022.repository.msg.FinancialInstitutionIdentification8.mmPostalAddress, com.tools20022.repository.msg.BranchData2.mmPostalAddress, com.tools20022.repository.msg.PartyIdentification8.mmPostalAddress,
						com.tools20022.repository.msg.PartyIdentification32.mmPostalAddress, com.tools20022.repository.msg.PartyIdentification43.mmPostalAddress, com.tools20022.repository.msg.TransferOut3.mmInvestorAddress,
						com.tools20022.repository.msg.NameAndAddress7.mmPostalAddress, com.tools20022.repository.msg.FinancialInstitutionIdentification3.mmPostalAddress,
						com.tools20022.repository.msg.FinancialInstitutionIdentification7.mmPostalAddress, com.tools20022.repository.msg.NameAndAddress13.mmAddress, com.tools20022.repository.msg.PartyIdentification6Choice.mmPostalAddress,
						com.tools20022.repository.msg.PartyIdentification41.mmPostalAddress, com.tools20022.repository.msg.PartyIdentification40.mmPostalAddress, com.tools20022.repository.msg.Organisation6.mmOperationalAddress,
						com.tools20022.repository.msg.Organisation6.mmBusinessAddress, com.tools20022.repository.msg.Organisation6.mmLegalAddress, com.tools20022.repository.msg.Organisation12.mmBusinessAddress,
						com.tools20022.repository.msg.Organisation12.mmLegalAddress, com.tools20022.repository.msg.Organisation12.mmBillingAddress, com.tools20022.repository.msg.AddressModification1.mmAddress,
						com.tools20022.repository.msg.OrganisationModification1.mmBusinessAddress, com.tools20022.repository.msg.OrganisationModification1.mmLegalAddress,
						com.tools20022.repository.msg.OrganisationModification1.mmBillingAddress, com.tools20022.repository.msg.Organisation7.mmOperationalAddress, com.tools20022.repository.msg.Organisation7.mmBusinessAddress,
						com.tools20022.repository.msg.Organisation7.mmLegalAddress, com.tools20022.repository.msg.NameAndAddress3.mmAddress, com.tools20022.repository.msg.RemittanceLocation1.mmRemittanceLocationPostalAddress,
						com.tools20022.repository.msg.NameAndAddress10.mmAddress, com.tools20022.repository.msg.RemittanceLocation2.mmRemittanceLocationPostalAddress, com.tools20022.repository.msg.PartyIdentification42.mmPostalAddress,
						com.tools20022.repository.msg.NonExtension1.mmNotificationRecipientAddress, com.tools20022.repository.msg.CommunicationChannel1.mmDeliverToAddress,
						com.tools20022.repository.choice.AddressOrParty1Choice.mmNewAddress, com.tools20022.repository.msg.NameAndAddress8.mmAddress, com.tools20022.repository.msg.PartyIdentification59.mmAddress,
						com.tools20022.repository.msg.Organisation5.mmAddress, com.tools20022.repository.msg.Organisation8.mmAddress, com.tools20022.repository.msg.Organisation9.mmAddress,
						com.tools20022.repository.msg.PartyIdentification1.mmPostalAddress, com.tools20022.repository.msg.FinancialInstitutionIdentification1.mmPostalAddress, com.tools20022.repository.msg.IndividualPerson7.mmAddress,
						com.tools20022.repository.msg.MeetingNotice1.mmProxyAppointmentNotificationAddress, com.tools20022.repository.msg.VoteMethods.mmVoteByMail, com.tools20022.repository.msg.VoteParameters.mmVotingBallotRequestAddress,
						com.tools20022.repository.msg.IndividualPerson14.mmAddress, com.tools20022.repository.msg.MeetingNotice2.mmProxyAppointmentNotificationAddress, com.tools20022.repository.choice.LocationFormat1Choice.mmAddress,
						com.tools20022.repository.msg.VoteParameters1.mmVotingBallotRequestAddress, com.tools20022.repository.choice.LongPostalAddress2Choice.mmUnstructured,
						com.tools20022.repository.choice.LongPostalAddress2Choice.mmStructured, com.tools20022.repository.msg.IndividualPerson16.mmAddress, com.tools20022.repository.msg.MeetingNotice3.mmProxyAppointmentNotificationAddress,
						com.tools20022.repository.msg.VoteParameters2.mmVotingBallotRequestAddress, com.tools20022.repository.msg.VoteMethods2.mmVoteByMail, com.tools20022.repository.msg.VoteParameters3.mmVotingBallotRequestAddress,
						com.tools20022.repository.msg.MeetingReference1.mmLocation, com.tools20022.repository.msg.MeetingReference2.mmLocation, com.tools20022.repository.msg.MeetingReference5.mmLocation,
						com.tools20022.repository.msg.MeetingReference3.mmLocation, com.tools20022.repository.msg.MeetingReference4.mmLocation, com.tools20022.repository.msg.NameAndAddress9.mmAddress,
						com.tools20022.repository.msg.IndividualPerson13.mmAddress, com.tools20022.repository.msg.IndividualPerson17.mmAddress, com.tools20022.repository.msg.PartyIdentification45.mmPostalAddress,
						com.tools20022.repository.msg.PartyIdentification9.mmPostalAddress, com.tools20022.repository.msg.NameAndAddress6.mmAddress, com.tools20022.repository.msg.PartyIdentification26.mmPostalAddress,
						com.tools20022.repository.msg.CommunicationAddressDetails.mmPostalAddress, com.tools20022.repository.msg.PartyIdentification58.mmPostalAddress, com.tools20022.repository.msg.PartyIdentification19.mmPostalAddress,
						com.tools20022.repository.msg.PartyIdentification18.mmPostalAddress, com.tools20022.repository.msg.PartyIdentification20.mmPostalAddress, com.tools20022.repository.msg.PartyIdentification31.mmPostalAddress,
						com.tools20022.repository.msg.PartyIdentification13.mmPostalAddress, com.tools20022.repository.msg.PartyIdentification16.mmPostalAddress, com.tools20022.repository.msg.NameAndAddress11.mmAddress,
						com.tools20022.repository.msg.PartyIdentification5.mmPostalAddress, com.tools20022.repository.msg.PartyIdentification24.mmPostalAddress, com.tools20022.repository.msg.TransferOut4.mmInvestorAddress,
						com.tools20022.repository.msg.IndividualPerson21.mmModifiedPostalAddress, com.tools20022.repository.msg.IndividualPerson22.mmPostalAddress, com.tools20022.repository.msg.Organisation15.mmModifiedPostalAddress,
						com.tools20022.repository.msg.RemittanceLocationDetails1.mmPostalAddress, com.tools20022.repository.msg.Organisation16.mmPostalAddress, com.tools20022.repository.msg.Organisation17.mmModifiedPostalAddress,
						com.tools20022.repository.msg.IndividualPerson23.mmPostalAddress, com.tools20022.repository.msg.IndividualPerson24.mmModifiedPostalAddress, com.tools20022.repository.msg.MeetingReference7.mmLocation,
						com.tools20022.repository.msg.MeetingReference6.mmLocation, com.tools20022.repository.msg.VoteParameters4.mmVotingBallotRequestAddress,
						com.tools20022.repository.msg.MeetingNotice4.mmProxyAppointmentNotificationAddress, com.tools20022.repository.msg.IndividualPerson25.mmAddress, com.tools20022.repository.msg.IndividualPerson26.mmAddress,
						com.tools20022.repository.msg.Organisation18.mmLocation, com.tools20022.repository.msg.CommunicationAddress5.mmPostalAddress, com.tools20022.repository.msg.PartyIdentification77.mmPostalAddress,
						com.tools20022.repository.msg.Organisation21.mmCorporateInvestorAddress, com.tools20022.repository.msg.Organisation22.mmModifiedPostalAddress, com.tools20022.repository.msg.Organisation23.mmPostalAddress,
						com.tools20022.repository.msg.Organisation24.mmPostalAddress, com.tools20022.repository.msg.IndividualPerson27.mmPostalAddress, com.tools20022.repository.msg.ModificationScope34.mmPostalAddress,
						com.tools20022.repository.msg.IndividualPerson29.mmPostalAddress, com.tools20022.repository.msg.NameAndAddress15.mmPostalAddress, com.tools20022.repository.msg.PartyIdentification112.mmPostalAddress,
						com.tools20022.repository.msg.TaxOrganisationIdentification1.mmPostalAddress, com.tools20022.repository.msg.Organisation30.mmPostalAddress, com.tools20022.repository.msg.Organisation29.mmModifiedPostalAddress,
						com.tools20022.repository.msg.IndividualPerson34.mmPostalAddress);
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
						PostalAddress17.mmObject(), PostalAddress19.mmObject(), PostalAddress18.mmObject(), PostalAddress21.mmObject(), ModificationScope34.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public AddressTypeCode getAddressType() {
		return addressType;
	}

	public void setAddressType(AddressTypeCode addressType) {
		this.addressType = addressType;
	}

	public Max35Text getStreetName() {
		return streetName;
	}

	public void setStreetName(Max35Text streetName) {
		this.streetName = streetName;
	}

	public Max35Text getStreetBuildingIdentification() {
		return streetBuildingIdentification;
	}

	public void setStreetBuildingIdentification(Max35Text streetBuildingIdentification) {
		this.streetBuildingIdentification = streetBuildingIdentification;
	}

	public Max16Text getPostCodeIdentification() {
		return postCodeIdentification;
	}

	public void setPostCodeIdentification(Max16Text postCodeIdentification) {
		this.postCodeIdentification = postCodeIdentification;
	}

	public Max35Text getTownName() {
		return townName;
	}

	public void setTownName(Max35Text townName) {
		this.townName = townName;
	}

	public Max35Text getState() {
		return state;
	}

	public void setState(Max35Text state) {
		this.state = state;
	}

	public Max35Text getBuildingName() {
		return buildingName;
	}

	public void setBuildingName(Max35Text buildingName) {
		this.buildingName = buildingName;
	}

	public Max16Text getFloor() {
		return floor;
	}

	public void setFloor(Max16Text floor) {
		this.floor = floor;
	}

	public Max35Text getDistrictName() {
		return districtName;
	}

	public void setDistrictName(Max35Text districtName) {
		this.districtName = districtName;
	}

	public Max35Text getRegionIdentification() {
		return regionIdentification;
	}

	public void setRegionIdentification(Max35Text regionIdentification) {
		this.regionIdentification = regionIdentification;
	}

	public Max35Text getCountyIdentification() {
		return countyIdentification;
	}

	public void setCountyIdentification(Max35Text countyIdentification) {
		this.countyIdentification = countyIdentification;
	}

	public Max16Text getPostOfficeBox() {
		return postOfficeBox;
	}

	public void setPostOfficeBox(Max16Text postOfficeBox) {
		this.postOfficeBox = postOfficeBox;
	}

	public Max35Text getProvince() {
		return province;
	}

	public void setProvince(Max35Text province) {
		this.province = province;
	}

	public Max70Text getDepartment() {
		return department;
	}

	public void setDepartment(Max70Text department) {
		this.department = department;
	}

	public Max70Text getSubDepartment() {
		return subDepartment;
	}

	public void setSubDepartment(Max70Text subDepartment) {
		this.subDepartment = subDepartment;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(com.tools20022.repository.entity.Location location) {
		this.location = location;
	}

	public ChequeIssue getChequeIssue() {
		return chequeIssue;
	}

	public void setChequeIssue(com.tools20022.repository.entity.ChequeIssue chequeIssue) {
		this.chequeIssue = chequeIssue;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(com.tools20022.repository.entity.Country country) {
		this.country = country;
	}

	public List<DateTimePeriod> getValidityPeriod() {
		return validityPeriod;
	}

	public void setValidityPeriod(List<com.tools20022.repository.entity.DateTimePeriod> validityPeriod) {
		this.validityPeriod = validityPeriod;
	}

	public Max35Text getSuiteIdentification() {
		return suiteIdentification;
	}

	public void setSuiteIdentification(Max35Text suiteIdentification) {
		this.suiteIdentification = suiteIdentification;
	}

	public Max35Text getBuildingIdentification() {
		return buildingIdentification;
	}

	public void setBuildingIdentification(Max35Text buildingIdentification) {
		this.buildingIdentification = buildingIdentification;
	}

	public Max35Text getMailDeliverySubLocation() {
		return mailDeliverySubLocation;
	}

	public void setMailDeliverySubLocation(Max35Text mailDeliverySubLocation) {
		this.mailDeliverySubLocation = mailDeliverySubLocation;
	}

	public Max35Text getBlock() {
		return block;
	}

	public void setBlock(Max35Text block) {
		this.block = block;
	}

	public Max35Text getLot() {
		return lot;
	}

	public void setLot(Max35Text lot) {
		this.lot = lot;
	}

	public Max35Text getDistrictSubDivisionIdentification() {
		return districtSubDivisionIdentification;
	}

	public void setDistrictSubDivisionIdentification(Max35Text districtSubDivisionIdentification) {
		this.districtSubDivisionIdentification = districtSubDivisionIdentification;
	}

	public List<MailingInstructions> getMailingInstructions() {
		return mailingInstructions;
	}

	public void setMailingInstructions(List<com.tools20022.repository.entity.MailingInstructions> mailingInstructions) {
		this.mailingInstructions = mailingInstructions;
	}

	public PhysicalDelivery getPhysicalDelivery() {
		return physicalDelivery;
	}

	public void setPhysicalDelivery(com.tools20022.repository.entity.PhysicalDelivery physicalDelivery) {
		this.physicalDelivery = physicalDelivery;
	}
}