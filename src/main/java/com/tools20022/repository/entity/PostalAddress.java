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
 * <li>{@linkplain com.tools20022.repository.entity.PostalAddress#AddressType
 * PostalAddress.AddressType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PostalAddress#StreetName
 * PostalAddress.StreetName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PostalAddress#StreetBuildingIdentification
 * PostalAddress.StreetBuildingIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PostalAddress#PostCodeIdentification
 * PostalAddress.PostCodeIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PostalAddress#TownName
 * PostalAddress.TownName}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PostalAddress#State
 * PostalAddress.State}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PostalAddress#BuildingName
 * PostalAddress.BuildingName}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PostalAddress#Floor
 * PostalAddress.Floor}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PostalAddress#DistrictName
 * PostalAddress.DistrictName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PostalAddress#RegionIdentification
 * PostalAddress.RegionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PostalAddress#CountyIdentification
 * PostalAddress.CountyIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PostalAddress#PostOfficeBox
 * PostalAddress.PostOfficeBox}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PostalAddress#Province
 * PostalAddress.Province}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PostalAddress#Department
 * PostalAddress.Department}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PostalAddress#SubDepartment
 * PostalAddress.SubDepartment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PostalAddress#Location
 * PostalAddress.Location}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PostalAddress#ChequeIssue
 * PostalAddress.ChequeIssue}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PostalAddress#Country
 * PostalAddress.Country}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PostalAddress#ValidityPeriod
 * PostalAddress.ValidityPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PostalAddress#SuiteIdentification
 * PostalAddress.SuiteIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PostalAddress#BuildingIdentification
 * PostalAddress.BuildingIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PostalAddress#MailDeliverySubLocation
 * PostalAddress.MailDeliverySubLocation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PostalAddress#Block
 * PostalAddress.Block}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PostalAddress#Lot
 * PostalAddress.Lot}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PostalAddress#DistrictSubDivisionIdentification
 * PostalAddress.DistrictSubDivisionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PostalAddress#MailingInstructions
 * PostalAddress.MailingInstructions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PostalAddress#PhysicalDelivery
 * PostalAddress.PhysicalDelivery}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Country#PostalAddressSpecification
 * Country.PostalAddressSpecification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Location#Address
 * Location.Address}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#RelatedPostalAddress
 * DateTimePeriod.RelatedPostalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MailingInstructions#RelatedPostalAddress
 * MailingInstructions.RelatedPostalAddress}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ChequeIssue#DeliverTo
 * ChequeIssue.DeliverTo}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PhysicalDelivery#Address
 * PhysicalDelivery.Address}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ContactDetails1#FundManagerPostalAddress
 * ContactDetails1.FundManagerPostalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OrderDeskContactDetails#PostalAddress
 * OrderDeskContactDetails.PostalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ContactAttributes1#PostalAddress
 * ContactAttributes1.PostalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.LongPostalAddress1Choice#Unstructured
 * LongPostalAddress1Choice.Unstructured}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.LongPostalAddress1Choice#Structured
 * LongPostalAddress1Choice.Structured}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NameAndAddress2#Address
 * NameAndAddress2.Address}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NameAndAddress5#Address
 * NameAndAddress5.Address}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NameAndAddress1#Address
 * NameAndAddress1.Address}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NameAndAddress4#Address
 * NameAndAddress4.Address}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Organisation2#PostalAddress
 * Organisation2.PostalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson5#PostalAddress
 * IndividualPerson5.PostalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson10#PostalAddress
 * IndividualPerson10.PostalAddress}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BranchData#PostalAddress
 * BranchData.PostalAddress}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Organisation13#PostalAddress
 * Organisation13.PostalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson20#PostalAddress
 * IndividualPerson20.PostalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson8#IndividualInvestorAddress
 * IndividualPerson8.IndividualInvestorAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Organisation4#CorporateInvestorAddress
 * Organisation4.CorporateInvestorAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Organisation3#ModifiedPostalAddress
 * Organisation3.ModifiedPostalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson6#ModifiedPostalAddress
 * IndividualPerson6.ModifiedPostalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson11#ModifiedPostalAddress
 * IndividualPerson11.ModifiedPostalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstitutionIdentification8#PostalAddress
 * FinancialInstitutionIdentification8.PostalAddress}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BranchData2#PostalAddress
 * BranchData2.PostalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification8#PostalAddress
 * PartyIdentification8.PostalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification32#PostalAddress
 * PartyIdentification32.PostalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification43#PostalAddress
 * PartyIdentification43.PostalAddress}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferOut3#InvestorAddress
 * TransferOut3.InvestorAddress}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NameAndAddress7#PostalAddress
 * NameAndAddress7.PostalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstitutionIdentification3#PostalAddress
 * FinancialInstitutionIdentification3.PostalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstitutionIdentification7#PostalAddress
 * FinancialInstitutionIdentification7.PostalAddress}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NameAndAddress13#Address
 * NameAndAddress13.Address}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification6Choice#PostalAddress
 * PartyIdentification6Choice.PostalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification41#PostalAddress
 * PartyIdentification41.PostalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification40#PostalAddress
 * PartyIdentification40.PostalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Organisation6#OperationalAddress
 * Organisation6.OperationalAddress}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Organisation6#BusinessAddress
 * Organisation6.BusinessAddress}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Organisation6#LegalAddress
 * Organisation6.LegalAddress}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Organisation12#BusinessAddress
 * Organisation12.BusinessAddress}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Organisation12#LegalAddress
 * Organisation12.LegalAddress}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Organisation12#BillingAddress
 * Organisation12.BillingAddress}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AddressModification1#Address
 * AddressModification1.Address}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OrganisationModification1#BusinessAddress
 * OrganisationModification1.BusinessAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OrganisationModification1#LegalAddress
 * OrganisationModification1.LegalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OrganisationModification1#BillingAddress
 * OrganisationModification1.BillingAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Organisation7#OperationalAddress
 * Organisation7.OperationalAddress}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Organisation7#BusinessAddress
 * Organisation7.BusinessAddress}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Organisation7#LegalAddress
 * Organisation7.LegalAddress}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NameAndAddress3#Address
 * NameAndAddress3.Address}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RemittanceLocation1#RemittanceLocationPostalAddress
 * RemittanceLocation1.RemittanceLocationPostalAddress}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NameAndAddress10#Address
 * NameAndAddress10.Address}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RemittanceLocation2#RemittanceLocationPostalAddress
 * RemittanceLocation2.RemittanceLocationPostalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification42#PostalAddress
 * PartyIdentification42.PostalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NonExtension1#NotificationRecipientAddress
 * NonExtension1.NotificationRecipientAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommunicationChannel1#DeliverToAddress
 * CommunicationChannel1.DeliverToAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AddressOrParty1Choice#NewAddress
 * AddressOrParty1Choice.NewAddress}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NameAndAddress8#Address
 * NameAndAddress8.Address}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification59#Address
 * PartyIdentification59.Address}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Organisation5#Address
 * Organisation5.Address}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Organisation8#Address
 * Organisation8.Address}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Organisation9#Address
 * Organisation9.Address}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification1#PostalAddress
 * PartyIdentification1.PostalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstitutionIdentification1#PostalAddress
 * FinancialInstitutionIdentification1.PostalAddress}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson7#Address
 * IndividualPerson7.Address}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingNotice1#ProxyAppointmentNotificationAddress
 * MeetingNotice1.ProxyAppointmentNotificationAddress}</li>
 * <li>{@linkplain com.tools20022.repository.msg.VoteMethods#VoteByMail
 * VoteMethods.VoteByMail}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.VoteParameters#VotingBallotRequestAddress
 * VoteParameters.VotingBallotRequestAddress}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson14#Address
 * IndividualPerson14.Address}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingNotice2#ProxyAppointmentNotificationAddress
 * MeetingNotice2.ProxyAppointmentNotificationAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.LocationFormat1Choice#Address
 * LocationFormat1Choice.Address}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.VoteParameters1#VotingBallotRequestAddress
 * VoteParameters1.VotingBallotRequestAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.LongPostalAddress2Choice#Unstructured
 * LongPostalAddress2Choice.Unstructured}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.LongPostalAddress2Choice#Structured
 * LongPostalAddress2Choice.Structured}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson16#Address
 * IndividualPerson16.Address}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingNotice3#ProxyAppointmentNotificationAddress
 * MeetingNotice3.ProxyAppointmentNotificationAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.VoteParameters2#VotingBallotRequestAddress
 * VoteParameters2.VotingBallotRequestAddress}</li>
 * <li>{@linkplain com.tools20022.repository.msg.VoteMethods2#VoteByMail
 * VoteMethods2.VoteByMail}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.VoteParameters3#VotingBallotRequestAddress
 * VoteParameters3.VotingBallotRequestAddress}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MeetingReference1#Location
 * MeetingReference1.Location}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MeetingReference2#Location
 * MeetingReference2.Location}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MeetingReference5#Location
 * MeetingReference5.Location}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MeetingReference3#Location
 * MeetingReference3.Location}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MeetingReference4#Location
 * MeetingReference4.Location}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NameAndAddress9#Address
 * NameAndAddress9.Address}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson13#Address
 * IndividualPerson13.Address}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson17#Address
 * IndividualPerson17.Address}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification45#PostalAddress
 * PartyIdentification45.PostalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification9#PostalAddress
 * PartyIdentification9.PostalAddress}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NameAndAddress6#Address
 * NameAndAddress6.Address}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification26#PostalAddress
 * PartyIdentification26.PostalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommunicationAddressDetails#PostalAddress
 * CommunicationAddressDetails.PostalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification58#PostalAddress
 * PartyIdentification58.PostalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification19#PostalAddress
 * PartyIdentification19.PostalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification18#PostalAddress
 * PartyIdentification18.PostalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification20#PostalAddress
 * PartyIdentification20.PostalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification31#PostalAddress
 * PartyIdentification31.PostalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification13#PostalAddress
 * PartyIdentification13.PostalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification16#PostalAddress
 * PartyIdentification16.PostalAddress}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NameAndAddress11#Address
 * NameAndAddress11.Address}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification5#PostalAddress
 * PartyIdentification5.PostalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification24#PostalAddress
 * PartyIdentification24.PostalAddress}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferOut4#InvestorAddress
 * TransferOut4.InvestorAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson21#ModifiedPostalAddress
 * IndividualPerson21.ModifiedPostalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson22#PostalAddress
 * IndividualPerson22.PostalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Organisation15#ModifiedPostalAddress
 * Organisation15.ModifiedPostalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RemittanceLocationDetails1#PostalAddress
 * RemittanceLocationDetails1.PostalAddress}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Organisation16#PostalAddress
 * Organisation16.PostalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Organisation17#ModifiedPostalAddress
 * Organisation17.ModifiedPostalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson23#PostalAddress
 * IndividualPerson23.PostalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson24#ModifiedPostalAddress
 * IndividualPerson24.ModifiedPostalAddress}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MeetingReference7#Location
 * MeetingReference7.Location}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MeetingReference6#Location
 * MeetingReference6.Location}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.VoteParameters4#VotingBallotRequestAddress
 * VoteParameters4.VotingBallotRequestAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingNotice4#ProxyAppointmentNotificationAddress
 * MeetingNotice4.ProxyAppointmentNotificationAddress}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson25#Address
 * IndividualPerson25.Address}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson26#Address
 * IndividualPerson26.Address}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Organisation18#Location
 * Organisation18.Location}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommunicationAddress5#PostalAddress
 * CommunicationAddress5.PostalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification77#PostalAddress
 * PartyIdentification77.PostalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Organisation21#CorporateInvestorAddress
 * Organisation21.CorporateInvestorAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Organisation22#ModifiedPostalAddress
 * Organisation22.ModifiedPostalAddress}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Organisation23#PostalAddress
 * Organisation23.PostalAddress}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Organisation24#PostalAddress
 * Organisation24.PostalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson27#PostalAddress
 * IndividualPerson27.PostalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ModificationScope34#PostalAddress
 * ModificationScope34.PostalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson29#PostalAddress
 * IndividualPerson29.PostalAddress}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NameAndAddress15#PostalAddress
 * NameAndAddress15.PostalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification112#PostalAddress
 * PartyIdentification112.PostalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TaxOrganisationIdentification1#PostalAddress
 * TaxOrganisationIdentification1.PostalAddress}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Organisation30#PostalAddress
 * Organisation30.PostalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Organisation29#ModifiedPostalAddress
 * Organisation29.ModifiedPostalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson34#PostalAddress
 * IndividualPerson34.PostalAddress}</li>
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress1#AddressType
	 * PostalAddress1.AddressType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress3#AddressType
	 * PostalAddress3.AddressType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress6#AddressType
	 * PostalAddress6.AddressType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress8#AddressType
	 * PostalAddress8.AddressType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PostalAddress11#AddressType
	 * PostalAddress11.AddressType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PostalAddress19#AddressType
	 * PostalAddress19.AddressType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PostalAddress21#AddressType
	 * PostalAddress21.AddressType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommunicationAddress6#AddressType
	 * CommunicationAddress6.AddressType}</li>
	 * </ul>
	 * </li>
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
	 * name} = "AddressType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of address."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute AddressType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PostalAddress1.AddressType, com.tools20022.repository.msg.PostalAddress3.AddressType, com.tools20022.repository.msg.PostalAddress6.AddressType,
					com.tools20022.repository.msg.PostalAddress8.AddressType, com.tools20022.repository.msg.PostalAddress11.AddressType, com.tools20022.repository.msg.PostalAddress19.AddressType,
					com.tools20022.repository.msg.PostalAddress21.AddressType, com.tools20022.repository.msg.CommunicationAddress6.AddressType);
			elementContext_lazy = () -> PostalAddress.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AddressType";
			definition = "Specifies the type of address.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> AddressTypeCode.mmObject();
		}
	};
	/**
	 * Name of a street or thoroughfare.
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
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress1#StreetName
	 * PostalAddress1.StreetName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StructuredLongPostalAddress1#StreetName
	 * StructuredLongPostalAddress1.StreetName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress6#StreetName
	 * PostalAddress6.StreetName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress8#StreetName
	 * PostalAddress8.StreetName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress2#StreetName
	 * PostalAddress2.StreetName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress5#StreetName
	 * PostalAddress5.StreetName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress11#StreetName
	 * PostalAddress11.StreetName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress10#StreetName
	 * PostalAddress10.StreetName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress9#StreetName
	 * PostalAddress9.StreetName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress13#StreetName
	 * PostalAddress13.StreetName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress17#StreetName
	 * PostalAddress17.StreetName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress19#StreetName
	 * PostalAddress19.StreetName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress18#StreetName
	 * PostalAddress18.StreetName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress21#StreetName
	 * PostalAddress21.StreetName}</li>
	 * </ul>
	 * </li>
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
	 * name} = "StreetName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name of a street or thoroughfare."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute StreetName = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PostalAddress1.StreetName, com.tools20022.repository.msg.StructuredLongPostalAddress1.StreetName, com.tools20022.repository.msg.PostalAddress6.StreetName,
					com.tools20022.repository.msg.PostalAddress8.StreetName, com.tools20022.repository.msg.PostalAddress2.StreetName, com.tools20022.repository.msg.PostalAddress5.StreetName,
					com.tools20022.repository.msg.PostalAddress11.StreetName, com.tools20022.repository.msg.PostalAddress10.StreetName, com.tools20022.repository.msg.PostalAddress9.StreetName,
					com.tools20022.repository.msg.PostalAddress13.StreetName, com.tools20022.repository.msg.PostalAddress17.StreetName, com.tools20022.repository.msg.PostalAddress19.StreetName,
					com.tools20022.repository.msg.PostalAddress18.StreetName, com.tools20022.repository.msg.PostalAddress21.StreetName);
			elementContext_lazy = () -> PostalAddress.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StreetName";
			definition = "Name of a street or thoroughfare.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Number that identifies the position of a building on a street.
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
	 * {@linkplain com.tools20022.repository.msg.PostalAddress1#BuildingNumber
	 * PostalAddress1.BuildingNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StructuredLongPostalAddress1#StreetBuildingIdentification
	 * StructuredLongPostalAddress1.StreetBuildingIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PostalAddress6#BuildingNumber
	 * PostalAddress6.BuildingNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PostalAddress8#BuildingNumber
	 * PostalAddress8.BuildingNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PostalAddress11#BuildingNumber
	 * PostalAddress11.BuildingNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PostalAddress10#BuildingNumber
	 * PostalAddress10.BuildingNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PostalAddress9#BuildingNumber
	 * PostalAddress9.BuildingNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PostalAddress13#BuildingNumber
	 * PostalAddress13.BuildingNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PostalAddress17#BuildingNumber
	 * PostalAddress17.BuildingNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PostalAddress19#BuildingNumber
	 * PostalAddress19.BuildingNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PostalAddress18#BuildingNumber
	 * PostalAddress18.BuildingNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PostalAddress21#BuildingNumber
	 * PostalAddress21.BuildingNumber}</li>
	 * </ul>
	 * </li>
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
	 * name} = "StreetBuildingIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number that identifies the position of a building on a street."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute StreetBuildingIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PostalAddress1.BuildingNumber, com.tools20022.repository.msg.StructuredLongPostalAddress1.StreetBuildingIdentification,
					com.tools20022.repository.msg.PostalAddress6.BuildingNumber, com.tools20022.repository.msg.PostalAddress8.BuildingNumber, com.tools20022.repository.msg.PostalAddress11.BuildingNumber,
					com.tools20022.repository.msg.PostalAddress10.BuildingNumber, com.tools20022.repository.msg.PostalAddress9.BuildingNumber, com.tools20022.repository.msg.PostalAddress13.BuildingNumber,
					com.tools20022.repository.msg.PostalAddress17.BuildingNumber, com.tools20022.repository.msg.PostalAddress19.BuildingNumber, com.tools20022.repository.msg.PostalAddress18.BuildingNumber,
					com.tools20022.repository.msg.PostalAddress21.BuildingNumber);
			elementContext_lazy = () -> PostalAddress.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StreetBuildingIdentification";
			definition = "Number that identifies the position of a building on a street.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress1#PostCode
	 * PostalAddress1.PostCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StructuredLongPostalAddress1#PostCodeIdentification
	 * StructuredLongPostalAddress1.PostCodeIdentification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress6#PostCode
	 * PostalAddress6.PostCode}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress8#PostCode
	 * PostalAddress8.PostCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PostalAddress2#PostCodeIdentification
	 * PostalAddress2.PostCodeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PostalAddress5#PostCodeIdentification
	 * PostalAddress5.PostCodeIdentification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress11#PostCode
	 * PostalAddress11.PostCode}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress7#PostCode
	 * PostalAddress7.PostCode}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress10#PostCode
	 * PostalAddress10.PostCode}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress9#PostCode
	 * PostalAddress9.PostCode}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress13#PostCode
	 * PostalAddress13.PostCode}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress17#PostCode
	 * PostalAddress17.PostCode}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress19#PostCode
	 * PostalAddress19.PostCode}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress18#PostCode
	 * PostalAddress18.PostCode}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress21#PostCode
	 * PostalAddress21.PostCode}</li>
	 * </ul>
	 * </li>
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
	 * name} = "PostCodeIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifier consisting of a group of letters and/or numbers that is added to a postal address to assist the sorting of mail."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PostCodeIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PostalAddress1.PostCode, com.tools20022.repository.msg.StructuredLongPostalAddress1.PostCodeIdentification,
					com.tools20022.repository.msg.PostalAddress6.PostCode, com.tools20022.repository.msg.PostalAddress8.PostCode, com.tools20022.repository.msg.PostalAddress2.PostCodeIdentification,
					com.tools20022.repository.msg.PostalAddress5.PostCodeIdentification, com.tools20022.repository.msg.PostalAddress11.PostCode, com.tools20022.repository.msg.PostalAddress7.PostCode,
					com.tools20022.repository.msg.PostalAddress10.PostCode, com.tools20022.repository.msg.PostalAddress9.PostCode, com.tools20022.repository.msg.PostalAddress13.PostCode,
					com.tools20022.repository.msg.PostalAddress17.PostCode, com.tools20022.repository.msg.PostalAddress19.PostCode, com.tools20022.repository.msg.PostalAddress18.PostCode,
					com.tools20022.repository.msg.PostalAddress21.PostCode);
			elementContext_lazy = () -> PostalAddress.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PostCodeIdentification";
			definition = "Identifier consisting of a group of letters and/or numbers that is added to a postal address to assist the sorting of mail.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max16Text.mmObject();
		}
	};
	/**
	 * Name of a built-up area, with defined boundaries, and a local government.
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
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress1#TownName
	 * PostalAddress1.TownName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StructuredLongPostalAddress1#TownName
	 * StructuredLongPostalAddress1.TownName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson10#CityOfBirth
	 * IndividualPerson10.CityOfBirth}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson11#CityOfBirth
	 * IndividualPerson11.CityOfBirth}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress6#TownName
	 * PostalAddress6.TownName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DateAndPlaceOfBirth#CityOfBirth
	 * DateAndPlaceOfBirth.CityOfBirth}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress8#TownName
	 * PostalAddress8.TownName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress12#TownName
	 * PostalAddress12.TownName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress2#TownName
	 * PostalAddress2.TownName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AirportDescription1#Town
	 * AirportDescription1.Town}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress5#TownName
	 * PostalAddress5.TownName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress11#TownName
	 * PostalAddress11.TownName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress7#TownName
	 * PostalAddress7.TownName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress10#TownName
	 * PostalAddress10.TownName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress9#TownName
	 * PostalAddress9.TownName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress13#TownName
	 * PostalAddress13.TownName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress17#TownName
	 * PostalAddress17.TownName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress19#TownName
	 * PostalAddress19.TownName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress18#TownName
	 * PostalAddress18.TownName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress21#Village
	 * PostalAddress21.Village}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress21#TownName
	 * PostalAddress21.TownName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MarketIdentification92#City
	 * MarketIdentification92.City}</li>
	 * </ul>
	 * </li>
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
	 * name} = "TownName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Name of a built-up area, with defined boundaries, and a local government."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TownName = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PostalAddress1.TownName, com.tools20022.repository.msg.StructuredLongPostalAddress1.TownName, com.tools20022.repository.msg.IndividualPerson10.CityOfBirth,
					com.tools20022.repository.msg.IndividualPerson11.CityOfBirth, com.tools20022.repository.msg.PostalAddress6.TownName, com.tools20022.repository.msg.DateAndPlaceOfBirth.CityOfBirth,
					com.tools20022.repository.msg.PostalAddress8.TownName, com.tools20022.repository.msg.PostalAddress12.TownName, com.tools20022.repository.msg.PostalAddress2.TownName,
					com.tools20022.repository.msg.AirportDescription1.Town, com.tools20022.repository.msg.PostalAddress5.TownName, com.tools20022.repository.msg.PostalAddress11.TownName,
					com.tools20022.repository.msg.PostalAddress7.TownName, com.tools20022.repository.msg.PostalAddress10.TownName, com.tools20022.repository.msg.PostalAddress9.TownName,
					com.tools20022.repository.msg.PostalAddress13.TownName, com.tools20022.repository.msg.PostalAddress17.TownName, com.tools20022.repository.msg.PostalAddress19.TownName,
					com.tools20022.repository.msg.PostalAddress18.TownName, com.tools20022.repository.msg.PostalAddress21.Village, com.tools20022.repository.msg.PostalAddress21.TownName,
					com.tools20022.repository.msg.MarketIdentification92.City);
			elementContext_lazy = () -> PostalAddress.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TownName";
			definition = "Name of a built-up area, with defined boundaries, and a local government.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Organised political community or area forming a part of a federation.
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
	 * {@linkplain com.tools20022.repository.msg.PostalAddress1#CountrySubDivision
	 * PostalAddress1.CountrySubDivision}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StructuredLongPostalAddress1#State
	 * StructuredLongPostalAddress1.State}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PostalAddress6#CountrySubDivision
	 * PostalAddress6.CountrySubDivision}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PostalAddress8#CountrySubDivision
	 * PostalAddress8.CountrySubDivision}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PostalAddress12#CountrySubDivision
	 * PostalAddress12.CountrySubDivision}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PostalAddress2#CountrySubDivision
	 * PostalAddress2.CountrySubDivision}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PostalAddress5#CountrySubDivision
	 * PostalAddress5.CountrySubDivision}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PostalAddress11#CountrySubDivision
	 * PostalAddress11.CountrySubDivision}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PostalAddress10#CountrySubDivision
	 * PostalAddress10.CountrySubDivision}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PostalAddress9#CountrySubDivision
	 * PostalAddress9.CountrySubDivision}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PostalAddress13#CountrySubDivision
	 * PostalAddress13.CountrySubDivision}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PostalAddress17#CountrySubDivision
	 * PostalAddress17.CountrySubDivision}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PostalAddress19#CountrySubDivision
	 * PostalAddress19.CountrySubDivision}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PostalAddress18#CountrySubDivision
	 * PostalAddress18.CountrySubDivision}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DerivativePartyIdentification1Choice#CountrySubDivision
	 * DerivativePartyIdentification1Choice.CountrySubDivision}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress21#State
	 * PostalAddress21.State}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification82#State
	 * GenericIdentification82.State}</li>
	 * </ul>
	 * </li>
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
	 * name} = "State"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Organised political community or area forming a part of a federation."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute State = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PostalAddress1.CountrySubDivision, com.tools20022.repository.msg.StructuredLongPostalAddress1.State,
					com.tools20022.repository.msg.PostalAddress6.CountrySubDivision, com.tools20022.repository.msg.PostalAddress8.CountrySubDivision, com.tools20022.repository.msg.PostalAddress12.CountrySubDivision,
					com.tools20022.repository.msg.PostalAddress2.CountrySubDivision, com.tools20022.repository.msg.PostalAddress5.CountrySubDivision, com.tools20022.repository.msg.PostalAddress11.CountrySubDivision,
					com.tools20022.repository.msg.PostalAddress10.CountrySubDivision, com.tools20022.repository.msg.PostalAddress9.CountrySubDivision, com.tools20022.repository.msg.PostalAddress13.CountrySubDivision,
					com.tools20022.repository.msg.PostalAddress17.CountrySubDivision, com.tools20022.repository.msg.PostalAddress19.CountrySubDivision, com.tools20022.repository.msg.PostalAddress18.CountrySubDivision,
					com.tools20022.repository.choice.DerivativePartyIdentification1Choice.CountrySubDivision, com.tools20022.repository.msg.PostalAddress21.State, com.tools20022.repository.msg.GenericIdentification82.State);
			elementContext_lazy = () -> PostalAddress.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "State";
			definition = "Organised political community or area forming a part of a federation.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Name of the building or house.
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
	 * {@linkplain com.tools20022.repository.msg.StructuredLongPostalAddress1#BuildingName
	 * StructuredLongPostalAddress1.BuildingName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PostalAddress11#BuildingName
	 * PostalAddress11.BuildingName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PostalAddress21#BuildingName
	 * PostalAddress21.BuildingName}</li>
	 * </ul>
	 * </li>
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
	 * name} = "BuildingName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name of the building or house."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute BuildingName = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.StructuredLongPostalAddress1.BuildingName, com.tools20022.repository.msg.PostalAddress11.BuildingName,
					com.tools20022.repository.msg.PostalAddress21.BuildingName);
			elementContext_lazy = () -> PostalAddress.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BuildingName";
			definition = "Name of the building or house.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Floor or storey within a building.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.StructuredLongPostalAddress1#Floor
	 * StructuredLongPostalAddress1.Floor}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress11#Floor
	 * PostalAddress11.Floor}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress21#Floor
	 * PostalAddress21.Floor}</li>
	 * </ul>
	 * </li>
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
	 * name} = "Floor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Floor or storey within a building."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Floor = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.StructuredLongPostalAddress1.Floor, com.tools20022.repository.msg.PostalAddress11.Floor, com.tools20022.repository.msg.PostalAddress21.Floor);
			elementContext_lazy = () -> PostalAddress.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Floor";
			definition = "Floor or storey within a building.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max16Text.mmObject();
		}
	};
	/**
	 * Name of a district, ie, a part of a town or region.
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
	 * {@linkplain com.tools20022.repository.msg.StructuredLongPostalAddress1#DistrictName
	 * StructuredLongPostalAddress1.DistrictName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PostalAddress19#DistrictName
	 * PostalAddress19.DistrictName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PostalAddress21#DistrictName
	 * PostalAddress21.DistrictName}</li>
	 * </ul>
	 * </li>
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
	 * name} = "DistrictName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name of a district, ie, a part of a town or region."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute DistrictName = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.StructuredLongPostalAddress1.DistrictName, com.tools20022.repository.msg.PostalAddress19.DistrictName,
					com.tools20022.repository.msg.PostalAddress21.DistrictName);
			elementContext_lazy = () -> PostalAddress.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DistrictName";
			definition = "Name of a district, ie, a part of a town or region.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StructuredLongPostalAddress1#RegionIdentification
	 * StructuredLongPostalAddress1.RegionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ResidenceLocation1Choice#Area
	 * ResidenceLocation1Choice.Area}</li>
	 * </ul>
	 * </li>
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
	 * name} = "RegionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of an administrative division of a country, state, or territory."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute RegionIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.StructuredLongPostalAddress1.RegionIdentification, com.tools20022.repository.choice.ResidenceLocation1Choice.Area);
			elementContext_lazy = () -> PostalAddress.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RegionIdentification";
			definition = "Identification of an administrative division of a country, state, or territory.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Identifier of a county.
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
	 * {@linkplain com.tools20022.repository.msg.StructuredLongPostalAddress1#CountyIdentification
	 * StructuredLongPostalAddress1.CountyIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CountrySubdivision1Choice#Code
	 * CountrySubdivision1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CountrySubdivision1Choice#Proprietary
	 * CountrySubdivision1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Location1#CountrySubDivision
	 * Location1.CountrySubDivision}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Location2#CountrySubDivision
	 * Location2.CountrySubDivision}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PostalAddress19#TownLocationName
	 * PostalAddress19.TownLocationName}</li>
	 * </ul>
	 * </li>
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
	 * name} = "CountyIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifier of a county."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CountyIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.StructuredLongPostalAddress1.CountyIdentification, com.tools20022.repository.choice.CountrySubdivision1Choice.Code,
					com.tools20022.repository.choice.CountrySubdivision1Choice.Proprietary, com.tools20022.repository.msg.Location1.CountrySubDivision, com.tools20022.repository.msg.Location2.CountrySubDivision,
					com.tools20022.repository.msg.PostalAddress19.TownLocationName);
			elementContext_lazy = () -> PostalAddress.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CountyIdentification";
			definition = "Identifier of a county.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StructuredLongPostalAddress1#PostOfficeBox
	 * StructuredLongPostalAddress1.PostOfficeBox}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress11#PostBox
	 * PostalAddress11.PostBox}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress21#PostBox
	 * PostalAddress21.PostBox}</li>
	 * </ul>
	 * </li>
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
	 * name} = "PostOfficeBox"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Numbered box in a post office, assigned to a person or organisation, where letters are kept until called for."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PostOfficeBox = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.StructuredLongPostalAddress1.PostOfficeBox, com.tools20022.repository.msg.PostalAddress11.PostBox, com.tools20022.repository.msg.PostalAddress21.PostBox);
			elementContext_lazy = () -> PostalAddress.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PostOfficeBox";
			definition = "Numbered box in a post office, assigned to a person or organisation, where letters are kept until called for.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max16Text.mmObject();
		}
	};
	/**
	 * A territory governed as an administrative or political unit of a country.
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
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson5#ProvinceOfBirth
	 * IndividualPerson5.ProvinceOfBirth}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson10#ProvinceOfBirth
	 * IndividualPerson10.ProvinceOfBirth}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson6#ProvinceOfBirth
	 * IndividualPerson6.ProvinceOfBirth}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson11#ProvinceOfBirth
	 * IndividualPerson11.ProvinceOfBirth}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DateAndPlaceOfBirth#ProvinceOfBirth
	 * DateAndPlaceOfBirth.ProvinceOfBirth}</li>
	 * </ul>
	 * </li>
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
	 * name} = "Province"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "A territory governed as an administrative or political unit of a country."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Province = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IndividualPerson5.ProvinceOfBirth, com.tools20022.repository.msg.IndividualPerson10.ProvinceOfBirth,
					com.tools20022.repository.msg.IndividualPerson6.ProvinceOfBirth, com.tools20022.repository.msg.IndividualPerson11.ProvinceOfBirth, com.tools20022.repository.msg.DateAndPlaceOfBirth.ProvinceOfBirth);
			elementContext_lazy = () -> PostalAddress.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Province";
			definition = "A territory governed as an administrative or political unit of a country.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Identification of a division of a large organisation or building.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress6#Department
	 * PostalAddress6.Department}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Contacts3#Department
	 * Contacts3.Department}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress11#Department
	 * PostalAddress11.Department}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress19#Department
	 * PostalAddress19.Department}</li>
	 * </ul>
	 * </li>
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
	 * name} = "Department"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of a division of a large organisation or building."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Department = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PostalAddress6.Department, com.tools20022.repository.msg.Contacts3.Department, com.tools20022.repository.msg.PostalAddress11.Department,
					com.tools20022.repository.msg.PostalAddress19.Department);
			elementContext_lazy = () -> PostalAddress.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Department";
			definition = "Identification of a division of a large organisation or building.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};
	/**
	 * Identification of a sub-division of a large organisation or building.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.PostalAddress6#SubDepartment
	 * PostalAddress6.SubDepartment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PostalAddress11#SubDepartment
	 * PostalAddress11.SubDepartment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PostalAddress19#SubDepartment
	 * PostalAddress19.SubDepartment}</li>
	 * </ul>
	 * </li>
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
	 * name} = "SubDepartment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of a sub-division of a large organisation or building."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute SubDepartment = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PostalAddress6.SubDepartment, com.tools20022.repository.msg.PostalAddress11.SubDepartment, com.tools20022.repository.msg.PostalAddress19.SubDepartment);
			elementContext_lazy = () -> PostalAddress.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SubDepartment";
			definition = "Identification of a sub-division of a large organisation or building.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};
	/**
	 * Specifies a place.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Location#Address
	 * Location.Address}</li>
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
	public static final MMBusinessAssociationEnd Location = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PostalAddress.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Location";
			definition = "Specifies a place.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Location.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Location.Address;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Cheque issue information for which a delivery address is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ChequeIssue#DeliverTo
	 * ChequeIssue.DeliverTo}</li>
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
	public static final MMBusinessAssociationEnd ChequeIssue = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PostalAddress.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ChequeIssue";
			definition = "Cheque issue information for which a delivery address is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.ChequeIssue.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ChequeIssue.DeliverTo;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Country of the address.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Country#PostalAddressSpecification
	 * Country.PostalAddressSpecification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Country Country}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption10#ValidDomicileCountry
	 * CorporateActionOption10.ValidDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption15#ValidDomicileCountry
	 * CorporateActionOption15.ValidDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption20#ValidDomicileCountry
	 * CorporateActionOption20.ValidDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption32#ValidDomicileCountry
	 * CorporateActionOption32.ValidDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption35#ValidDomicileCountry
	 * CorporateActionOption35.ValidDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption44#ValidDomicileCountry
	 * CorporateActionOption44.ValidDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption52#ValidDomicileCountry
	 * CorporateActionOption52.ValidDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption55#ValidDomicileCountry
	 * CorporateActionOption55.ValidDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption3#ValidDomicileCountry
	 * CorporateActionOption3.ValidDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption17#ValidDomicileCountry
	 * CorporateActionOption17.ValidDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption19#ValidDomicileCountry
	 * CorporateActionOption19.ValidDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption34#ValidDomicileCountry
	 * CorporateActionOption34.ValidDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption36#ValidDomicileCountry
	 * CorporateActionOption36.ValidDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption45#ValidDomicileCountry
	 * CorporateActionOption45.ValidDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption51#ValidDomicileCountry
	 * CorporateActionOption51.ValidDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption56#ValidDomicileCountry
	 * CorporateActionOption56.ValidDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption100#ValidDomicileCountry
	 * CorporateActionOption100.ValidDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption101#ValidDomicileCountry
	 * CorporateActionOption101.ValidDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption108#ValidDomicileCountry
	 * CorporateActionOption108.ValidDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption106#ValidDomicileCountry
	 * CorporateActionOption106.ValidDomicileCountry}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Acquirer6#CountryCode
	 * Acquirer6.CountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SectorAndLocation1#Location
	 * SectorAndLocation1.Location}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTransaction1#CountryOfBranch
	 * SecuritiesTransaction1.CountryOfBranch}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TradingVenueIdentification1Choice#NationalCompetentAuthority
	 * TradingVenueIdentification1Choice.NationalCompetentAuthority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification76#CountryOfBranch
	 * PartyIdentification76.CountryOfBranch}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionCertificate1#BankAccountDomiciliationCountry
	 * TransactionCertificate1.BankAccountDomiciliationCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ShipmentAttribute1#CountryOfCounterParty
	 * ShipmentAttribute1.CountryOfCounterParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption115#ValidDomicileCountry
	 * CorporateActionOption115.ValidDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption114#ValidDomicileCountry
	 * CorporateActionOption114.ValidDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DerivativePartyIdentification1Choice#Country
	 * DerivativePartyIdentification1Choice.Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption125#ValidDomicileCountry
	 * CorporateActionOption125.ValidDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption127#ValidDomicileCountry
	 * CorporateActionOption127.ValidDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportedPartyIdentification1#Location
	 * ReportedPartyIdentification1.Location}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption130#ValidDomicileCountry
	 * CorporateActionOption130.ValidDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption129#ValidDomicileCountry
	 * CorporateActionOption129.ValidDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption135#ValidDomicileCountry
	 * CorporateActionOption135.ValidDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption133#ValidDomicileCountry
	 * CorporateActionOption133.ValidDomicileCountry}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.NameAndLocation1#Location
	 * NameAndLocation1.Location}</li>
	 * </ul>
	 * </li>
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
	 * name} = "Country"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Country of the address."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Country = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionOption10.ValidDomicileCountry, com.tools20022.repository.msg.CorporateActionOption15.ValidDomicileCountry,
					com.tools20022.repository.msg.CorporateActionOption20.ValidDomicileCountry, com.tools20022.repository.msg.CorporateActionOption32.ValidDomicileCountry,
					com.tools20022.repository.msg.CorporateActionOption35.ValidDomicileCountry, com.tools20022.repository.msg.CorporateActionOption44.ValidDomicileCountry,
					com.tools20022.repository.msg.CorporateActionOption52.ValidDomicileCountry, com.tools20022.repository.msg.CorporateActionOption55.ValidDomicileCountry,
					com.tools20022.repository.msg.CorporateActionOption3.ValidDomicileCountry, com.tools20022.repository.msg.CorporateActionOption17.ValidDomicileCountry,
					com.tools20022.repository.msg.CorporateActionOption19.ValidDomicileCountry, com.tools20022.repository.msg.CorporateActionOption34.ValidDomicileCountry,
					com.tools20022.repository.msg.CorporateActionOption36.ValidDomicileCountry, com.tools20022.repository.msg.CorporateActionOption45.ValidDomicileCountry,
					com.tools20022.repository.msg.CorporateActionOption51.ValidDomicileCountry, com.tools20022.repository.msg.CorporateActionOption56.ValidDomicileCountry,
					com.tools20022.repository.msg.CorporateActionOption100.ValidDomicileCountry, com.tools20022.repository.msg.CorporateActionOption101.ValidDomicileCountry,
					com.tools20022.repository.msg.CorporateActionOption108.ValidDomicileCountry, com.tools20022.repository.msg.CorporateActionOption106.ValidDomicileCountry, com.tools20022.repository.msg.Acquirer6.CountryCode,
					com.tools20022.repository.msg.SectorAndLocation1.Location, com.tools20022.repository.msg.SecuritiesTransaction1.CountryOfBranch,
					com.tools20022.repository.choice.TradingVenueIdentification1Choice.NationalCompetentAuthority, com.tools20022.repository.msg.PartyIdentification76.CountryOfBranch,
					com.tools20022.repository.msg.TransactionCertificate1.BankAccountDomiciliationCountry, com.tools20022.repository.msg.ShipmentAttribute1.CountryOfCounterParty,
					com.tools20022.repository.msg.CorporateActionOption115.ValidDomicileCountry, com.tools20022.repository.msg.CorporateActionOption114.ValidDomicileCountry,
					com.tools20022.repository.choice.DerivativePartyIdentification1Choice.Country, com.tools20022.repository.msg.CorporateActionOption125.ValidDomicileCountry,
					com.tools20022.repository.msg.CorporateActionOption127.ValidDomicileCountry, com.tools20022.repository.msg.ReportedPartyIdentification1.Location,
					com.tools20022.repository.msg.CorporateActionOption130.ValidDomicileCountry, com.tools20022.repository.msg.CorporateActionOption129.ValidDomicileCountry,
					com.tools20022.repository.msg.CorporateActionOption135.ValidDomicileCountry, com.tools20022.repository.msg.CorporateActionOption133.ValidDomicileCountry, com.tools20022.repository.msg.NameAndLocation1.Location);
			elementContext_lazy = () -> PostalAddress.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Country";
			definition = "Country of the address.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Country.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Country.PostalAddressSpecification;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the period during which a postal address is valid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#RelatedPostalAddress
	 * DateTimePeriod.RelatedPostalAddress}</li>
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
	public static final MMBusinessAssociationEnd ValidityPeriod = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PostalAddress.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ValidityPeriod";
			definition = "Specifies the period during which a postal address is valid.";
			minOccurs = 0;
			type_lazy = () -> DateTimePeriod.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.RelatedPostalAddress;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Identification of a suite or apartment.
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
	 * {@linkplain com.tools20022.repository.msg.PostalAddress21#SuiteIdentification
	 * PostalAddress21.SuiteIdentification}</li>
	 * </ul>
	 * </li>
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
	 * name} = "SuiteIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of a suite or apartment."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute SuiteIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PostalAddress21.SuiteIdentification);
			elementContext_lazy = () -> PostalAddress.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SuiteIdentification";
			definition = "Identification of a suite or apartment.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PostalAddress21#SideInBuilding
	 * PostalAddress21.SideInBuilding}</li>
	 * </ul>
	 * </li>
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
	 * name} = "BuildingIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of a building, within a group of buildings, that have the same street number identifier."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute BuildingIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PostalAddress21.SideInBuilding);
			elementContext_lazy = () -> PostalAddress.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BuildingIdentification";
			definition = "Identification of a building, within a group of buildings, that have the same street number identifier.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
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
	public static final MMBusinessAttribute MailDeliverySubLocation = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> PostalAddress.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MailDeliverySubLocation";
			definition = "Specific place to deliver mail within a pre-defined postal address.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
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
	public static final MMBusinessAttribute Block = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> PostalAddress.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Block";
			definition = "Area of land bounded by streets.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
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
	public static final MMBusinessAttribute Lot = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> PostalAddress.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Lot";
			definition = "Identification of an allotment of land.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
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
	public static final MMBusinessAttribute DistrictSubDivisionIdentification = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> PostalAddress.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DistrictSubDivisionIdentification";
			definition = "Identification of a sub-division of a district.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Specifies the characteristics of an address.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.MailingInstructions#RelatedPostalAddress
	 * MailingInstructions.RelatedPostalAddress}</li>
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
	public static final MMBusinessAssociationEnd MailingInstructions = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PostalAddress.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MailingInstructions";
			definition = "Specifies the characteristics of an address.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.MailingInstructions.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.MailingInstructions.RelatedPostalAddress;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Physical delivery information related to an address.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PhysicalDelivery#Address
	 * PhysicalDelivery.Address}</li>
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
	public static final MMBusinessAssociationEnd PhysicalDelivery = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PostalAddress.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PhysicalDelivery";
			definition = "Physical delivery information related to an address.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.PhysicalDelivery.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PhysicalDelivery.Address;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PostalAddress";
				definition = "Information that locates and identifies a specific address.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Country.PostalAddressSpecification, com.tools20022.repository.entity.Location.Address,
						com.tools20022.repository.entity.DateTimePeriod.RelatedPostalAddress, com.tools20022.repository.entity.MailingInstructions.RelatedPostalAddress, com.tools20022.repository.entity.ChequeIssue.DeliverTo,
						com.tools20022.repository.entity.PhysicalDelivery.Address);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ContactDetails1.FundManagerPostalAddress, com.tools20022.repository.msg.OrderDeskContactDetails.PostalAddress,
						com.tools20022.repository.msg.ContactAttributes1.PostalAddress, com.tools20022.repository.choice.LongPostalAddress1Choice.Unstructured, com.tools20022.repository.choice.LongPostalAddress1Choice.Structured,
						com.tools20022.repository.msg.NameAndAddress2.Address, com.tools20022.repository.msg.NameAndAddress5.Address, com.tools20022.repository.msg.NameAndAddress1.Address,
						com.tools20022.repository.msg.NameAndAddress4.Address, com.tools20022.repository.msg.Organisation2.PostalAddress, com.tools20022.repository.msg.IndividualPerson5.PostalAddress,
						com.tools20022.repository.msg.IndividualPerson10.PostalAddress, com.tools20022.repository.msg.BranchData.PostalAddress, com.tools20022.repository.msg.Organisation13.PostalAddress,
						com.tools20022.repository.msg.IndividualPerson20.PostalAddress, com.tools20022.repository.msg.IndividualPerson8.IndividualInvestorAddress, com.tools20022.repository.msg.Organisation4.CorporateInvestorAddress,
						com.tools20022.repository.msg.Organisation3.ModifiedPostalAddress, com.tools20022.repository.msg.IndividualPerson6.ModifiedPostalAddress, com.tools20022.repository.msg.IndividualPerson11.ModifiedPostalAddress,
						com.tools20022.repository.msg.FinancialInstitutionIdentification8.PostalAddress, com.tools20022.repository.msg.BranchData2.PostalAddress, com.tools20022.repository.msg.PartyIdentification8.PostalAddress,
						com.tools20022.repository.msg.PartyIdentification32.PostalAddress, com.tools20022.repository.msg.PartyIdentification43.PostalAddress, com.tools20022.repository.msg.TransferOut3.InvestorAddress,
						com.tools20022.repository.msg.NameAndAddress7.PostalAddress, com.tools20022.repository.msg.FinancialInstitutionIdentification3.PostalAddress,
						com.tools20022.repository.msg.FinancialInstitutionIdentification7.PostalAddress, com.tools20022.repository.msg.NameAndAddress13.Address, com.tools20022.repository.msg.PartyIdentification6Choice.PostalAddress,
						com.tools20022.repository.msg.PartyIdentification41.PostalAddress, com.tools20022.repository.msg.PartyIdentification40.PostalAddress, com.tools20022.repository.msg.Organisation6.OperationalAddress,
						com.tools20022.repository.msg.Organisation6.BusinessAddress, com.tools20022.repository.msg.Organisation6.LegalAddress, com.tools20022.repository.msg.Organisation12.BusinessAddress,
						com.tools20022.repository.msg.Organisation12.LegalAddress, com.tools20022.repository.msg.Organisation12.BillingAddress, com.tools20022.repository.msg.AddressModification1.Address,
						com.tools20022.repository.msg.OrganisationModification1.BusinessAddress, com.tools20022.repository.msg.OrganisationModification1.LegalAddress, com.tools20022.repository.msg.OrganisationModification1.BillingAddress,
						com.tools20022.repository.msg.Organisation7.OperationalAddress, com.tools20022.repository.msg.Organisation7.BusinessAddress, com.tools20022.repository.msg.Organisation7.LegalAddress,
						com.tools20022.repository.msg.NameAndAddress3.Address, com.tools20022.repository.msg.RemittanceLocation1.RemittanceLocationPostalAddress, com.tools20022.repository.msg.NameAndAddress10.Address,
						com.tools20022.repository.msg.RemittanceLocation2.RemittanceLocationPostalAddress, com.tools20022.repository.msg.PartyIdentification42.PostalAddress,
						com.tools20022.repository.msg.NonExtension1.NotificationRecipientAddress, com.tools20022.repository.msg.CommunicationChannel1.DeliverToAddress, com.tools20022.repository.choice.AddressOrParty1Choice.NewAddress,
						com.tools20022.repository.msg.NameAndAddress8.Address, com.tools20022.repository.msg.PartyIdentification59.Address, com.tools20022.repository.msg.Organisation5.Address,
						com.tools20022.repository.msg.Organisation8.Address, com.tools20022.repository.msg.Organisation9.Address, com.tools20022.repository.msg.PartyIdentification1.PostalAddress,
						com.tools20022.repository.msg.FinancialInstitutionIdentification1.PostalAddress, com.tools20022.repository.msg.IndividualPerson7.Address,
						com.tools20022.repository.msg.MeetingNotice1.ProxyAppointmentNotificationAddress, com.tools20022.repository.msg.VoteMethods.VoteByMail, com.tools20022.repository.msg.VoteParameters.VotingBallotRequestAddress,
						com.tools20022.repository.msg.IndividualPerson14.Address, com.tools20022.repository.msg.MeetingNotice2.ProxyAppointmentNotificationAddress, com.tools20022.repository.choice.LocationFormat1Choice.Address,
						com.tools20022.repository.msg.VoteParameters1.VotingBallotRequestAddress, com.tools20022.repository.choice.LongPostalAddress2Choice.Unstructured, com.tools20022.repository.choice.LongPostalAddress2Choice.Structured,
						com.tools20022.repository.msg.IndividualPerson16.Address, com.tools20022.repository.msg.MeetingNotice3.ProxyAppointmentNotificationAddress, com.tools20022.repository.msg.VoteParameters2.VotingBallotRequestAddress,
						com.tools20022.repository.msg.VoteMethods2.VoteByMail, com.tools20022.repository.msg.VoteParameters3.VotingBallotRequestAddress, com.tools20022.repository.msg.MeetingReference1.Location,
						com.tools20022.repository.msg.MeetingReference2.Location, com.tools20022.repository.msg.MeetingReference5.Location, com.tools20022.repository.msg.MeetingReference3.Location,
						com.tools20022.repository.msg.MeetingReference4.Location, com.tools20022.repository.msg.NameAndAddress9.Address, com.tools20022.repository.msg.IndividualPerson13.Address,
						com.tools20022.repository.msg.IndividualPerson17.Address, com.tools20022.repository.msg.PartyIdentification45.PostalAddress, com.tools20022.repository.msg.PartyIdentification9.PostalAddress,
						com.tools20022.repository.msg.NameAndAddress6.Address, com.tools20022.repository.msg.PartyIdentification26.PostalAddress, com.tools20022.repository.msg.CommunicationAddressDetails.PostalAddress,
						com.tools20022.repository.msg.PartyIdentification58.PostalAddress, com.tools20022.repository.msg.PartyIdentification19.PostalAddress, com.tools20022.repository.msg.PartyIdentification18.PostalAddress,
						com.tools20022.repository.msg.PartyIdentification20.PostalAddress, com.tools20022.repository.msg.PartyIdentification31.PostalAddress, com.tools20022.repository.msg.PartyIdentification13.PostalAddress,
						com.tools20022.repository.msg.PartyIdentification16.PostalAddress, com.tools20022.repository.msg.NameAndAddress11.Address, com.tools20022.repository.msg.PartyIdentification5.PostalAddress,
						com.tools20022.repository.msg.PartyIdentification24.PostalAddress, com.tools20022.repository.msg.TransferOut4.InvestorAddress, com.tools20022.repository.msg.IndividualPerson21.ModifiedPostalAddress,
						com.tools20022.repository.msg.IndividualPerson22.PostalAddress, com.tools20022.repository.msg.Organisation15.ModifiedPostalAddress, com.tools20022.repository.msg.RemittanceLocationDetails1.PostalAddress,
						com.tools20022.repository.msg.Organisation16.PostalAddress, com.tools20022.repository.msg.Organisation17.ModifiedPostalAddress, com.tools20022.repository.msg.IndividualPerson23.PostalAddress,
						com.tools20022.repository.msg.IndividualPerson24.ModifiedPostalAddress, com.tools20022.repository.msg.MeetingReference7.Location, com.tools20022.repository.msg.MeetingReference6.Location,
						com.tools20022.repository.msg.VoteParameters4.VotingBallotRequestAddress, com.tools20022.repository.msg.MeetingNotice4.ProxyAppointmentNotificationAddress, com.tools20022.repository.msg.IndividualPerson25.Address,
						com.tools20022.repository.msg.IndividualPerson26.Address, com.tools20022.repository.msg.Organisation18.Location, com.tools20022.repository.msg.CommunicationAddress5.PostalAddress,
						com.tools20022.repository.msg.PartyIdentification77.PostalAddress, com.tools20022.repository.msg.Organisation21.CorporateInvestorAddress, com.tools20022.repository.msg.Organisation22.ModifiedPostalAddress,
						com.tools20022.repository.msg.Organisation23.PostalAddress, com.tools20022.repository.msg.Organisation24.PostalAddress, com.tools20022.repository.msg.IndividualPerson27.PostalAddress,
						com.tools20022.repository.msg.ModificationScope34.PostalAddress, com.tools20022.repository.msg.IndividualPerson29.PostalAddress, com.tools20022.repository.msg.NameAndAddress15.PostalAddress,
						com.tools20022.repository.msg.PartyIdentification112.PostalAddress, com.tools20022.repository.msg.TaxOrganisationIdentification1.PostalAddress, com.tools20022.repository.msg.Organisation30.PostalAddress,
						com.tools20022.repository.msg.Organisation29.ModifiedPostalAddress, com.tools20022.repository.msg.IndividualPerson34.PostalAddress);
				superType_lazy = () -> ContactPoint.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PostalAddress.AddressType, com.tools20022.repository.entity.PostalAddress.StreetName,
						com.tools20022.repository.entity.PostalAddress.StreetBuildingIdentification, com.tools20022.repository.entity.PostalAddress.PostCodeIdentification, com.tools20022.repository.entity.PostalAddress.TownName,
						com.tools20022.repository.entity.PostalAddress.State, com.tools20022.repository.entity.PostalAddress.BuildingName, com.tools20022.repository.entity.PostalAddress.Floor,
						com.tools20022.repository.entity.PostalAddress.DistrictName, com.tools20022.repository.entity.PostalAddress.RegionIdentification, com.tools20022.repository.entity.PostalAddress.CountyIdentification,
						com.tools20022.repository.entity.PostalAddress.PostOfficeBox, com.tools20022.repository.entity.PostalAddress.Province, com.tools20022.repository.entity.PostalAddress.Department,
						com.tools20022.repository.entity.PostalAddress.SubDepartment, com.tools20022.repository.entity.PostalAddress.Location, com.tools20022.repository.entity.PostalAddress.ChequeIssue,
						com.tools20022.repository.entity.PostalAddress.Country, com.tools20022.repository.entity.PostalAddress.ValidityPeriod, com.tools20022.repository.entity.PostalAddress.SuiteIdentification,
						com.tools20022.repository.entity.PostalAddress.BuildingIdentification, com.tools20022.repository.entity.PostalAddress.MailDeliverySubLocation, com.tools20022.repository.entity.PostalAddress.Block,
						com.tools20022.repository.entity.PostalAddress.Lot, com.tools20022.repository.entity.PostalAddress.DistrictSubDivisionIdentification, com.tools20022.repository.entity.PostalAddress.MailingInstructions,
						com.tools20022.repository.entity.PostalAddress.PhysicalDelivery);
				derivationComponent_lazy = () -> Arrays.asList(PostalAddress1.mmObject(), StructuredLongPostalAddress1.mmObject(), LongPostalAddress1Choice.mmObject(), PostalAddress3.mmObject(), PostalAddress6.mmObject(),
						PostalAddress8.mmObject(), AddressModification1.mmObject(), CountrySubdivision1Choice.mmObject(), PostalAddress12.mmObject(), LongPostalAddress2Choice.mmObject(), PostalAddress2.mmObject(),
						PostalAddress5.mmObject(), PostalAddress11.mmObject(), PostalAddress4.mmObject(), PostalAddress7.mmObject(), PostalAddress10.mmObject(), PostalAddress9.mmObject(), PostalAddress13.mmObject(),
						PostalAddress17.mmObject(), PostalAddress19.mmObject(), PostalAddress18.mmObject(), PostalAddress21.mmObject(), ModificationScope34.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}