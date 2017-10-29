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
import com.tools20022.repository.choice.PartyAdditionalIdentification2Choice;
import com.tools20022.repository.codeset.CivilStatusCode;
import com.tools20022.repository.codeset.GenderCode;
import com.tools20022.repository.codeset.LanguageCode;
import com.tools20022.repository.codeset.ResidentialStatusCode;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Human entity, as distinguished from a corporate entity (which is sometimes
 * referred to as an 'artificial person').
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Person" src="doc-files/Person.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Person#Gender Person.Gender}
 * </li>
 * <li>{@linkplain com.tools20022.repository.entity.Person#Language
 * Person.Language}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Person#BirthDate
 * Person.BirthDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Person#PlaceOfBirth
 * Person.PlaceOfBirth}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Person#Profession
 * Person.Profession}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Person#ResidentialStatus
 * Person.ResidentialStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Person#Nationality
 * Person.Nationality}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Person#MinorIndicator
 * Person.MinorIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Person#BusinessFunctionTitle
 * Person.BusinessFunctionTitle}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Person#PersonIdentification
 * Person.PersonIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Person#EmployingParty
 * Person.EmployingParty}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Person#MeetingAttendee
 * Person.MeetingAttendee}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Person#RelatedRole
 * Person.RelatedRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Person#PreAssignedProxyPerson
 * Person.PreAssignedProxyPerson}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Person#PersonProfile
 * Person.PersonProfile}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Person#ContactPersonRole
 * Person.ContactPersonRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Person#Household
 * Person.Household}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Person#CivilStatus
 * Person.CivilStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Person#DeathDate
 * Person.DeathDate}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Country#Citizen
 * Country.Citizen}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Location#NativePerson
 * Location.NativePerson}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PersonIdentification#Person
 * PersonIdentification.Person}</li>
 * <li>{@linkplain com.tools20022.repository.entity.EmployingPartyRole#Employee
 * EmployingPartyRole.Employee}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ContactPersonRole#Person
 * ContactPersonRole.Person}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AssignedProxyRole#ProxyPerson
 * AssignedProxyRole.ProxyPerson}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AssignedProxyRole#PreAssignedProxyRole
 * AssignedProxyRole.PreAssignedProxyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.MeetingAttendeeRole#Person
 * MeetingAttendeeRole.Person}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PersonProfile#Person
 * PersonProfile.Person}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Household#Member
 * Household.Member}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation5#IndividualPerson
 * InvestmentAccountOwnershipInformation5.IndividualPerson}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation2#IndividualPerson
 * InvestmentAccountOwnershipInformation2.IndividualPerson}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Party14Choice#IndividualPerson
 * Party14Choice.IndividualPerson}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation3#IndividualPerson
 * InvestmentAccountOwnershipInformation3.IndividualPerson}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation4#IndividualPerson
 * InvestmentAccountOwnershipInformation4.IndividualPerson}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferOut3#Investor
 * TransferOut3.Investor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PEPISATransfer7#PrimaryIndividualInvestor
 * PEPISATransfer7.PrimaryIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PEPISATransfer7#SecondaryIndividualInvestor
 * PEPISATransfer7.SecondaryIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PEPISATransfer7#OtherIndividualInvestor
 * PEPISATransfer7.OtherIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PEPISATransfer11#PrimaryIndividualInvestor
 * PEPISATransfer11.PrimaryIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PEPISATransfer11#SecondaryIndividualInvestor
 * PEPISATransfer11.SecondaryIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PEPISATransfer11#OtherIndividualInvestor
 * PEPISATransfer11.OtherIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer9#PrimaryIndividualInvestor
 * ISATransfer9.PrimaryIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer9#SecondaryIndividualInvestor
 * ISATransfer9.SecondaryIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer9#OtherIndividualInvestor
 * ISATransfer9.OtherIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionOrder3#BeneficiaryDetails
 * RedemptionOrder3.BeneficiaryDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionOrder5#BeneficiaryDetails
 * RedemptionOrder5.BeneficiaryDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionExecution3#BeneficiaryDetails
 * RedemptionExecution3.BeneficiaryDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionExecution5#BeneficiaryDetails
 * RedemptionExecution5.BeneficiaryDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionOrder7#BeneficiaryDetails
 * RedemptionOrder7.BeneficiaryDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder2#BeneficiaryDetails
 * RedemptionMultipleOrder2.BeneficiaryDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder3#BeneficiaryDetails
 * RedemptionMultipleOrder3.BeneficiaryDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution2#BeneficiaryDetails
 * RedemptionMultipleExecution2.BeneficiaryDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution3#BeneficiaryDetails
 * RedemptionMultipleExecution3.BeneficiaryDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder4#BeneficiaryDetails
 * RedemptionMultipleOrder4.BeneficiaryDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder3#BeneficiaryDetails
 * SubscriptionOrder3.BeneficiaryDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder5#BeneficiaryDetails
 * SubscriptionOrder5.BeneficiaryDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution3#BeneficiaryDetails
 * SubscriptionExecution3.BeneficiaryDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution5#BeneficiaryDetails
 * SubscriptionExecution5.BeneficiaryDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder7#BeneficiaryDetails
 * SubscriptionOrder7.BeneficiaryDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder2#BeneficiaryDetails
 * SubscriptionMultipleOrder2.BeneficiaryDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder3#BeneficiaryDetails
 * SubscriptionMultipleOrder3.BeneficiaryDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleExecution2#BeneficiaryDetails
 * SubscriptionMultipleExecution2.BeneficiaryDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleExecution3#BeneficiaryDetails
 * SubscriptionMultipleExecution3.BeneficiaryDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder4#BeneficiaryDetails
 * SubscriptionMultipleOrder4.BeneficiaryDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Proxy#PreassignedProxy
 * Proxy.PreassignedProxy}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingNotice1#ContactPersonDetails
 * MeetingNotice1.ContactPersonDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingNotice2#ContactPersonDetails
 * MeetingNotice2.ContactPersonDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingNotice3#ContactPersonDetails
 * MeetingNotice3.ContactPersonDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.VotingPartyAndInstruction#PersonDetail
 * VotingPartyAndInstruction.PersonDetail}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecurityPosition1#Proxy
 * SecurityPosition1.Proxy}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Instruction1#MeetingAttendee
 * Instruction1.MeetingAttendee}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Instruction2#MeetingAttendee
 * Instruction2.MeetingAttendee}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MemberDetails#ContactReference
 * MemberDetails.ContactReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MemberDetails1#ContactReference
 * MemberDetails1.ContactReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionExecution10#BeneficiaryDetails
 * RedemptionExecution10.BeneficiaryDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionOrder9#BeneficiaryDetails
 * RedemptionOrder9.BeneficiaryDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BeneficiaryInformation2#BeneficiaryIdentification
 * BeneficiaryInformation2.BeneficiaryIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7#BeneficiaryDetails
 * SubscriptionExecution7.BeneficiaryDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BeneficiaryInformation1#BeneficiaryIdentification
 * BeneficiaryInformation1.BeneficiaryIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder9#BeneficiaryDetails
 * SubscriptionOrder9.BeneficiaryDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferOut4#Investor
 * TransferOut4.Investor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ContactInformation3#ContactPerson
 * ContactInformation3.ContactPerson}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Member1#ContactReference
 * Member1.ContactReference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Member2#ContactReference
 * Member2.ContactReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Party15Choice#IndividualPerson
 * Party15Choice.IndividualPerson}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Party16Choice#IndividualPerson
 * Party16Choice.IndividualPerson}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer12#PrimaryIndividualInvestor
 * ISATransfer12.PrimaryIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer12#SecondaryIndividualInvestor
 * ISATransfer12.SecondaryIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer12#OtherIndividualInvestor
 * ISATransfer12.OtherIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer19#PrimaryIndividualInvestor
 * ISATransfer19.PrimaryIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer19#SecondaryIndividualInvestor
 * ISATransfer19.SecondaryIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer19#OtherIndividualInvestor
 * ISATransfer19.OtherIndividualInvestor}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Instruction3#MeetingAttendee
 * Instruction3.MeetingAttendee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingNotice4#ContactPersonDetails
 * MeetingNotice4.ContactPersonDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Party24Choice#IndividualPerson
 * Party24Choice.IndividualPerson}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Party23Choice#IndividualPerson
 * Party23Choice.IndividualPerson}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Party30Choice#IndividualPerson
 * Party30Choice.IndividualPerson}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson28#FamilyInformation
 * IndividualPerson28.FamilyInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Party31Choice#IndividualPerson
 * Party31Choice.IndividualPerson}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson27#FamilyInformation
 * IndividualPerson27.FamilyInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer24#PrimaryIndividualInvestor
 * ISATransfer24.PrimaryIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer24#SecondaryIndividualInvestor
 * ISATransfer24.SecondaryIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer24#OtherIndividualInvestor
 * ISATransfer24.OtherIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution5#BeneficiaryDetails
 * RedemptionMultipleExecution5.BeneficiaryDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder6#BeneficiaryDetails
 * RedemptionMultipleOrder6.BeneficiaryDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder6#BeneficiaryDetails
 * SubscriptionMultipleOrder6.BeneficiaryDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleExecution5#BeneficiaryDetails
 * SubscriptionMultipleExecution5.BeneficiaryDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution12#BeneficiaryDetails
 * SubscriptionExecution12.BeneficiaryDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder15#BeneficiaryDetails
 * SubscriptionOrder15.BeneficiaryDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionOrder15#BeneficiaryDetails
 * RedemptionOrder15.BeneficiaryDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Party33Choice#IndividualPerson
 * Party33Choice.IndividualPerson}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson33#FamilyInformation
 * IndividualPerson33.FamilyInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Party32Choice#IndividualPerson
 * Party32Choice.IndividualPerson}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#BeneficiaryDetails
 * RedemptionExecution16.BeneficiaryDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTransactionReport4#ExecutingPerson
 * SecuritiesTransactionReport4.ExecutingPerson}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson34#FamilyInformation
 * IndividualPerson34.FamilyInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Party Party}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CitizenshipInformation
 * CitizenshipInformation}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson5
 * IndividualPerson5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson10
 * IndividualPerson10}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson20
 * IndividualPerson20}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson3
 * IndividualPerson3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson8
 * IndividualPerson8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson4
 * IndividualPerson4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson6
 * IndividualPerson6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson11
 * IndividualPerson11}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DateAndPlaceOfBirth
 * DateAndPlaceOfBirth}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentificationSD4
 * PartyIdentificationSD4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Contacts3 Contacts3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson2
 * IndividualPerson2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson12
 * IndividualPerson12}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson9
 * IndividualPerson9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson7
 * IndividualPerson7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson14
 * IndividualPerson14}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson16
 * IndividualPerson16}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyAdditionalIdentification2Choice
 * PartyAdditionalIdentification2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson13
 * IndividualPerson13}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson17
 * IndividualPerson17}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ContactIdentificationAndAddress
 * ContactIdentificationAndAddress}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson15
 * IndividualPerson15}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ContactInformation3
 * ContactInformation3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson21
 * IndividualPerson21}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson22
 * IndividualPerson22}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson23
 * IndividualPerson23}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson24
 * IndividualPerson24}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson25
 * IndividualPerson25}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson26
 * IndividualPerson26}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson30
 * IndividualPerson30}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson28
 * IndividualPerson28}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson27
 * IndividualPerson27}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson29
 * IndividualPerson29}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson32
 * IndividualPerson32}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson31
 * IndividualPerson31}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson33
 * IndividualPerson33}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson35
 * IndividualPerson35}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson34
 * IndividualPerson34}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CitizenshipInformation2
 * CitizenshipInformation2}</li>
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
 * "Person"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Human entity, as distinguished from a corporate entity (which is sometimes referred to as an 'artificial person')."
 * </li>
 * </ul>
 */
public class Person extends Party {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies the gender of the person.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.GenderCode
	 * GenderCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson5#Gender
	 * IndividualPerson5.Gender}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson10#Gender
	 * IndividualPerson10.Gender}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson20#Gender
	 * IndividualPerson20.Gender}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson3#Gender
	 * IndividualPerson3.Gender}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson8#Gender
	 * IndividualPerson8.Gender}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson4#Gender
	 * IndividualPerson4.Gender}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson6#Gender
	 * IndividualPerson6.Gender}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson11#Gender
	 * IndividualPerson11.Gender}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson21#Gender
	 * IndividualPerson21.Gender}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson22#Gender
	 * IndividualPerson22.Gender}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson23#Gender
	 * IndividualPerson23.Gender}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson24#Gender
	 * IndividualPerson24.Gender}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson30#Gender
	 * IndividualPerson30.Gender}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson28#Gender
	 * IndividualPerson28.Gender}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson27#Gender
	 * IndividualPerson27.Gender}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson33#Gender
	 * IndividualPerson33.Gender}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson35#Gender
	 * IndividualPerson35.Gender}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson34#Gender
	 * IndividualPerson34.Gender}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Person
	 * Person}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Gender"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the gender of the person."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Gender = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IndividualPerson5.Gender, com.tools20022.repository.msg.IndividualPerson10.Gender, com.tools20022.repository.msg.IndividualPerson20.Gender,
					com.tools20022.repository.msg.IndividualPerson3.Gender, com.tools20022.repository.msg.IndividualPerson8.Gender, com.tools20022.repository.msg.IndividualPerson4.Gender,
					com.tools20022.repository.msg.IndividualPerson6.Gender, com.tools20022.repository.msg.IndividualPerson11.Gender, com.tools20022.repository.msg.IndividualPerson21.Gender,
					com.tools20022.repository.msg.IndividualPerson22.Gender, com.tools20022.repository.msg.IndividualPerson23.Gender, com.tools20022.repository.msg.IndividualPerson24.Gender,
					com.tools20022.repository.msg.IndividualPerson30.Gender, com.tools20022.repository.msg.IndividualPerson28.Gender, com.tools20022.repository.msg.IndividualPerson27.Gender,
					com.tools20022.repository.msg.IndividualPerson33.Gender, com.tools20022.repository.msg.IndividualPerson35.Gender, com.tools20022.repository.msg.IndividualPerson34.Gender);
			elementContext_lazy = () -> Person.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Gender";
			definition = "Specifies the gender of the person.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> GenderCode.mmObject();
		}
	};
	/**
	 * Language in which a person communicates.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.LanguageCode
	 * LanguageCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson5#Language
	 * IndividualPerson5.Language}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson10#Language
	 * IndividualPerson10.Language}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson20#Language
	 * IndividualPerson20.Language}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson6#Language
	 * IndividualPerson6.Language}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson11#Language
	 * IndividualPerson11.Language}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Cardholder1#Language
	 * Cardholder1.Language}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Cardholder3#Language
	 * Cardholder3.Language}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson21#Language
	 * IndividualPerson21.Language}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson22#Language
	 * IndividualPerson22.Language}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Cardholder5#Language
	 * Cardholder5.Language}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson23#Language
	 * IndividualPerson23.Language}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson24#Language
	 * IndividualPerson24.Language}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Cardholder7#Language
	 * Cardholder7.Language}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Cardholder9#Language
	 * Cardholder9.Language}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Cardholder10#Language
	 * Cardholder10.Language}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Cardholder12#Language
	 * Cardholder12.Language}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Person
	 * Person}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Language"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Language in which a person communicates."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Language = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IndividualPerson5.Language, com.tools20022.repository.msg.IndividualPerson10.Language, com.tools20022.repository.msg.IndividualPerson20.Language,
					com.tools20022.repository.msg.IndividualPerson6.Language, com.tools20022.repository.msg.IndividualPerson11.Language, com.tools20022.repository.msg.Cardholder1.Language,
					com.tools20022.repository.msg.Cardholder3.Language, com.tools20022.repository.msg.IndividualPerson21.Language, com.tools20022.repository.msg.IndividualPerson22.Language,
					com.tools20022.repository.msg.Cardholder5.Language, com.tools20022.repository.msg.IndividualPerson23.Language, com.tools20022.repository.msg.IndividualPerson24.Language,
					com.tools20022.repository.msg.Cardholder7.Language, com.tools20022.repository.msg.Cardholder9.Language, com.tools20022.repository.msg.Cardholder10.Language, com.tools20022.repository.msg.Cardholder12.Language);
			elementContext_lazy = () -> Person.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Language";
			definition = "Language in which a person communicates.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> LanguageCode.mmObject();
		}
	};
	/**
	 * Date on which a person is born.
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
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson5#BirthDate
	 * IndividualPerson5.BirthDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson10#BirthDate
	 * IndividualPerson10.BirthDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson20#BirthDate
	 * IndividualPerson20.BirthDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson3#BirthDate
	 * IndividualPerson3.BirthDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson8#BirthDate
	 * IndividualPerson8.BirthDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson4#BirthDate
	 * IndividualPerson4.BirthDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson6#BirthDate
	 * IndividualPerson6.BirthDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson11#BirthDate
	 * IndividualPerson11.BirthDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DateAndPlaceOfBirth#BirthDate
	 * DateAndPlaceOfBirth.BirthDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson2#BirthDate
	 * IndividualPerson2.BirthDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson12#BirthDate
	 * IndividualPerson12.BirthDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson9#BirthDate
	 * IndividualPerson9.BirthDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyAdditionalIdentification2Choice#BirthDate
	 * PartyAdditionalIdentification2Choice.BirthDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson15#BirthDate
	 * IndividualPerson15.BirthDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson21#BirthDate
	 * IndividualPerson21.BirthDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson22#BirthDate
	 * IndividualPerson22.BirthDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson23#BirthDate
	 * IndividualPerson23.BirthDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson24#BirthDate
	 * IndividualPerson24.BirthDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification10#BirthDate
	 * PersonIdentification10.BirthDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson30#BirthDate
	 * IndividualPerson30.BirthDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson28#BirthDate
	 * IndividualPerson28.BirthDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson27#BirthDate
	 * IndividualPerson27.BirthDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson32#BirthDate
	 * IndividualPerson32.BirthDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson31#BirthDate
	 * IndividualPerson31.BirthDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson33#BirthDate
	 * IndividualPerson33.BirthDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson35#BirthDate
	 * IndividualPerson35.BirthDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson34#BirthDate
	 * IndividualPerson34.BirthDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Person
	 * Person}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BirthDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date on which a person is born."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute BirthDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IndividualPerson5.BirthDate, com.tools20022.repository.msg.IndividualPerson10.BirthDate, com.tools20022.repository.msg.IndividualPerson20.BirthDate,
					com.tools20022.repository.msg.IndividualPerson3.BirthDate, com.tools20022.repository.msg.IndividualPerson8.BirthDate, com.tools20022.repository.msg.IndividualPerson4.BirthDate,
					com.tools20022.repository.msg.IndividualPerson6.BirthDate, com.tools20022.repository.msg.IndividualPerson11.BirthDate, com.tools20022.repository.msg.DateAndPlaceOfBirth.BirthDate,
					com.tools20022.repository.msg.IndividualPerson2.BirthDate, com.tools20022.repository.msg.IndividualPerson12.BirthDate, com.tools20022.repository.msg.IndividualPerson9.BirthDate,
					com.tools20022.repository.choice.PartyAdditionalIdentification2Choice.BirthDate, com.tools20022.repository.msg.IndividualPerson15.BirthDate, com.tools20022.repository.msg.IndividualPerson21.BirthDate,
					com.tools20022.repository.msg.IndividualPerson22.BirthDate, com.tools20022.repository.msg.IndividualPerson23.BirthDate, com.tools20022.repository.msg.IndividualPerson24.BirthDate,
					com.tools20022.repository.msg.PersonIdentification10.BirthDate, com.tools20022.repository.msg.IndividualPerson30.BirthDate, com.tools20022.repository.msg.IndividualPerson28.BirthDate,
					com.tools20022.repository.msg.IndividualPerson27.BirthDate, com.tools20022.repository.msg.IndividualPerson32.BirthDate, com.tools20022.repository.msg.IndividualPerson31.BirthDate,
					com.tools20022.repository.msg.IndividualPerson33.BirthDate, com.tools20022.repository.msg.IndividualPerson35.BirthDate, com.tools20022.repository.msg.IndividualPerson34.BirthDate);
			elementContext_lazy = () -> Person.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BirthDate";
			definition = "Date on which a person is born.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Place (for instance Country and City) where a person was born.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Location#NativePerson
	 * Location.NativePerson}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Location Location}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson5#CountryOfBirth
	 * IndividualPerson5.CountryOfBirth}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson5#CityOfBirth
	 * IndividualPerson5.CityOfBirth}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson10#CountryOfBirth
	 * IndividualPerson10.CountryOfBirth}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson20#CountryOfBirth
	 * IndividualPerson20.CountryOfBirth}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson20#ProvinceOfBirth
	 * IndividualPerson20.ProvinceOfBirth}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson20#CityOfBirth
	 * IndividualPerson20.CityOfBirth}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson6#CountryOfBirth
	 * IndividualPerson6.CountryOfBirth}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson6#CityOfBirth
	 * IndividualPerson6.CityOfBirth}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson11#CountryOfBirth
	 * IndividualPerson11.CountryOfBirth}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson21#CountryOfBirth
	 * IndividualPerson21.CountryOfBirth}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson21#ProvinceOfBirth
	 * IndividualPerson21.ProvinceOfBirth}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson21#CityOfBirth
	 * IndividualPerson21.CityOfBirth}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson22#CountryOfBirth
	 * IndividualPerson22.CountryOfBirth}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson22#ProvinceOfBirth
	 * IndividualPerson22.ProvinceOfBirth}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson22#CityOfBirth
	 * IndividualPerson22.CityOfBirth}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson23#CountryOfBirth
	 * IndividualPerson23.CountryOfBirth}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson23#ProvinceOfBirth
	 * IndividualPerson23.ProvinceOfBirth}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson23#CityOfBirth
	 * IndividualPerson23.CityOfBirth}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson24#CountryOfBirth
	 * IndividualPerson24.CountryOfBirth}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson24#ProvinceOfBirth
	 * IndividualPerson24.ProvinceOfBirth}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson24#CityOfBirth
	 * IndividualPerson24.CityOfBirth}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson28#CountryOfBirth
	 * IndividualPerson28.CountryOfBirth}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson28#ProvinceOfBirth
	 * IndividualPerson28.ProvinceOfBirth}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson28#CityOfBirth
	 * IndividualPerson28.CityOfBirth}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson27#CountryOfBirth
	 * IndividualPerson27.CountryOfBirth}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson27#ProvinceOfBirth
	 * IndividualPerson27.ProvinceOfBirth}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson27#CityOfBirth
	 * IndividualPerson27.CityOfBirth}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson33#CountryOfBirth
	 * IndividualPerson33.CountryOfBirth}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson33#ProvinceOfBirth
	 * IndividualPerson33.ProvinceOfBirth}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson33#CityOfBirth
	 * IndividualPerson33.CityOfBirth}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson34#CountryOfBirth
	 * IndividualPerson34.CountryOfBirth}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson34#ProvinceOfBirth
	 * IndividualPerson34.ProvinceOfBirth}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson34#CityOfBirth
	 * IndividualPerson34.CityOfBirth}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Person
	 * Person}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfBirth"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Place (for instance Country and City) where a person was born."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd PlaceOfBirth = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IndividualPerson5.CountryOfBirth, com.tools20022.repository.msg.IndividualPerson5.CityOfBirth, com.tools20022.repository.msg.IndividualPerson10.CountryOfBirth,
					com.tools20022.repository.msg.IndividualPerson20.CountryOfBirth, com.tools20022.repository.msg.IndividualPerson20.ProvinceOfBirth, com.tools20022.repository.msg.IndividualPerson20.CityOfBirth,
					com.tools20022.repository.msg.IndividualPerson6.CountryOfBirth, com.tools20022.repository.msg.IndividualPerson6.CityOfBirth, com.tools20022.repository.msg.IndividualPerson11.CountryOfBirth,
					com.tools20022.repository.msg.IndividualPerson21.CountryOfBirth, com.tools20022.repository.msg.IndividualPerson21.ProvinceOfBirth, com.tools20022.repository.msg.IndividualPerson21.CityOfBirth,
					com.tools20022.repository.msg.IndividualPerson22.CountryOfBirth, com.tools20022.repository.msg.IndividualPerson22.ProvinceOfBirth, com.tools20022.repository.msg.IndividualPerson22.CityOfBirth,
					com.tools20022.repository.msg.IndividualPerson23.CountryOfBirth, com.tools20022.repository.msg.IndividualPerson23.ProvinceOfBirth, com.tools20022.repository.msg.IndividualPerson23.CityOfBirth,
					com.tools20022.repository.msg.IndividualPerson24.CountryOfBirth, com.tools20022.repository.msg.IndividualPerson24.ProvinceOfBirth, com.tools20022.repository.msg.IndividualPerson24.CityOfBirth,
					com.tools20022.repository.msg.IndividualPerson28.CountryOfBirth, com.tools20022.repository.msg.IndividualPerson28.ProvinceOfBirth, com.tools20022.repository.msg.IndividualPerson28.CityOfBirth,
					com.tools20022.repository.msg.IndividualPerson27.CountryOfBirth, com.tools20022.repository.msg.IndividualPerson27.ProvinceOfBirth, com.tools20022.repository.msg.IndividualPerson27.CityOfBirth,
					com.tools20022.repository.msg.IndividualPerson33.CountryOfBirth, com.tools20022.repository.msg.IndividualPerson33.ProvinceOfBirth, com.tools20022.repository.msg.IndividualPerson33.CityOfBirth,
					com.tools20022.repository.msg.IndividualPerson34.CountryOfBirth, com.tools20022.repository.msg.IndividualPerson34.ProvinceOfBirth, com.tools20022.repository.msg.IndividualPerson34.CityOfBirth);
			elementContext_lazy = () -> Person.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PlaceOfBirth";
			definition = "Place (for instance Country and City) where a person was born.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Location.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Location.NativePerson;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Name of the occupation or job of a person.
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
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson5#Profession
	 * IndividualPerson5.Profession}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson10#Profession
	 * IndividualPerson10.Profession}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson20#Profession
	 * IndividualPerson20.Profession}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson6#Profession
	 * IndividualPerson6.Profession}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson11#Profession
	 * IndividualPerson11.Profession}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson21#Profession
	 * IndividualPerson21.Profession}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson22#Profession
	 * IndividualPerson22.Profession}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson23#Profession
	 * IndividualPerson23.Profession}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson24#Profession
	 * IndividualPerson24.Profession}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson28#Profession
	 * IndividualPerson28.Profession}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson27#Profession
	 * IndividualPerson27.Profession}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson33#Profession
	 * IndividualPerson33.Profession}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson34#Profession
	 * IndividualPerson34.Profession}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Person
	 * Person}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Profession"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name of the occupation or job of a person."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Profession = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IndividualPerson5.Profession, com.tools20022.repository.msg.IndividualPerson10.Profession, com.tools20022.repository.msg.IndividualPerson20.Profession,
					com.tools20022.repository.msg.IndividualPerson6.Profession, com.tools20022.repository.msg.IndividualPerson11.Profession, com.tools20022.repository.msg.IndividualPerson21.Profession,
					com.tools20022.repository.msg.IndividualPerson22.Profession, com.tools20022.repository.msg.IndividualPerson23.Profession, com.tools20022.repository.msg.IndividualPerson24.Profession,
					com.tools20022.repository.msg.IndividualPerson28.Profession, com.tools20022.repository.msg.IndividualPerson27.Profession, com.tools20022.repository.msg.IndividualPerson33.Profession,
					com.tools20022.repository.msg.IndividualPerson34.Profession);
			elementContext_lazy = () -> Person.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Profession";
			definition = "Name of the occupation or job of a person.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Residential status of an individual, for example, non-permanent resident.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ResidentialStatusCode
	 * ResidentialStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CountryAndResidentialStatusType1#ResidentialStatus
	 * CountryAndResidentialStatusType1.ResidentialStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson5#CountryAndResidentialStatus
	 * IndividualPerson5.CountryAndResidentialStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson10#CountryAndResidentialStatus
	 * IndividualPerson10.CountryAndResidentialStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson20#CountryAndResidentialStatus
	 * IndividualPerson20.CountryAndResidentialStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson6#CountryAndResidentialStatus
	 * IndividualPerson6.CountryAndResidentialStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson11#CountryAndResidentialStatus
	 * IndividualPerson11.CountryAndResidentialStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson2#CountryAndResidentialStatus
	 * IndividualPerson2.CountryAndResidentialStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson12#CountryAndResidentialStatus
	 * IndividualPerson12.CountryAndResidentialStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson9#CountryAndResidentialStatus
	 * IndividualPerson9.CountryAndResidentialStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson15#CountryAndResidentialStatus
	 * IndividualPerson15.CountryAndResidentialStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson21#CountryAndResidentialStatus
	 * IndividualPerson21.CountryAndResidentialStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson22#CountryAndResidentialStatus
	 * IndividualPerson22.CountryAndResidentialStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson23#CountryAndResidentialStatus
	 * IndividualPerson23.CountryAndResidentialStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson24#CountryAndResidentialStatus
	 * IndividualPerson24.CountryAndResidentialStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12#CountryAndResidentialStatus
	 * InvestmentAccountOwnershipInformation12.CountryAndResidentialStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CountryAndResidentialStatusType2#ResidentialStatus
	 * CountryAndResidentialStatusType2.ResidentialStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13#CountryAndResidentialStatus
	 * InvestmentAccountOwnershipInformation13.CountryAndResidentialStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson32#CountryAndResidentialStatus
	 * IndividualPerson32.CountryAndResidentialStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson31#CountryAndResidentialStatus
	 * IndividualPerson31.CountryAndResidentialStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15#CountryAndResidentialStatus
	 * InvestmentAccountOwnershipInformation15.CountryAndResidentialStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14#CountryAndResidentialStatus
	 * InvestmentAccountOwnershipInformation14.CountryAndResidentialStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Person
	 * Person}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResidentialStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Residential status of an individual, for example, non-permanent resident."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ResidentialStatus = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CountryAndResidentialStatusType1.ResidentialStatus, com.tools20022.repository.msg.IndividualPerson5.CountryAndResidentialStatus,
					com.tools20022.repository.msg.IndividualPerson10.CountryAndResidentialStatus, com.tools20022.repository.msg.IndividualPerson20.CountryAndResidentialStatus,
					com.tools20022.repository.msg.IndividualPerson6.CountryAndResidentialStatus, com.tools20022.repository.msg.IndividualPerson11.CountryAndResidentialStatus,
					com.tools20022.repository.msg.IndividualPerson2.CountryAndResidentialStatus, com.tools20022.repository.msg.IndividualPerson12.CountryAndResidentialStatus,
					com.tools20022.repository.msg.IndividualPerson9.CountryAndResidentialStatus, com.tools20022.repository.msg.IndividualPerson15.CountryAndResidentialStatus,
					com.tools20022.repository.msg.IndividualPerson21.CountryAndResidentialStatus, com.tools20022.repository.msg.IndividualPerson22.CountryAndResidentialStatus,
					com.tools20022.repository.msg.IndividualPerson23.CountryAndResidentialStatus, com.tools20022.repository.msg.IndividualPerson24.CountryAndResidentialStatus,
					com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12.CountryAndResidentialStatus, com.tools20022.repository.msg.CountryAndResidentialStatusType2.ResidentialStatus,
					com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13.CountryAndResidentialStatus, com.tools20022.repository.msg.IndividualPerson32.CountryAndResidentialStatus,
					com.tools20022.repository.msg.IndividualPerson31.CountryAndResidentialStatus, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15.CountryAndResidentialStatus,
					com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14.CountryAndResidentialStatus);
			elementContext_lazy = () -> Person.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ResidentialStatus";
			definition = "Residential status of an individual, for example, non-permanent resident.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ResidentialStatusCode.mmObject();
		}
	};
	/**
	 * Specifies the country where a person was born or is legally accepted as
	 * belonging to the country.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Country#Citizen
	 * Country.Citizen}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CitizenshipInformation#Nationality
	 * CitizenshipInformation.Nationality}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson5#Citizenship
	 * IndividualPerson5.Citizenship}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson10#Citizenship
	 * IndividualPerson10.Citizenship}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson20#Citizenship
	 * IndividualPerson20.Citizenship}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson6#ModifiedCitizenship
	 * IndividualPerson6.ModifiedCitizenship}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson11#ModifiedCitizenship
	 * IndividualPerson11.ModifiedCitizenship}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount10#AccountOwnerNationality
	 * SecuritiesAccount10.AccountOwnerNationality}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson21#ModifiedCitizenship
	 * IndividualPerson21.ModifiedCitizenship}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson22#Citizenship
	 * IndividualPerson22.Citizenship}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson23#Citizenship
	 * IndividualPerson23.Citizenship}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson24#ModifiedCitizenship
	 * IndividualPerson24.ModifiedCitizenship}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson28#ModifiedCitizenship
	 * IndividualPerson28.ModifiedCitizenship}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson27#Citizenship
	 * IndividualPerson27.Citizenship}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson33#ModifiedCitizenship
	 * IndividualPerson33.ModifiedCitizenship}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson34#Citizenship
	 * IndividualPerson34.Citizenship}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CitizenshipInformation2#Nationality
	 * CitizenshipInformation2.Nationality}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Person
	 * Person}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Nationality"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the country where a person was born or is legally accepted as belonging to the country."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Nationality = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CitizenshipInformation.Nationality, com.tools20022.repository.msg.IndividualPerson5.Citizenship, com.tools20022.repository.msg.IndividualPerson10.Citizenship,
					com.tools20022.repository.msg.IndividualPerson20.Citizenship, com.tools20022.repository.msg.IndividualPerson6.ModifiedCitizenship, com.tools20022.repository.msg.IndividualPerson11.ModifiedCitizenship,
					com.tools20022.repository.msg.SecuritiesAccount10.AccountOwnerNationality, com.tools20022.repository.msg.IndividualPerson21.ModifiedCitizenship, com.tools20022.repository.msg.IndividualPerson22.Citizenship,
					com.tools20022.repository.msg.IndividualPerson23.Citizenship, com.tools20022.repository.msg.IndividualPerson24.ModifiedCitizenship, com.tools20022.repository.msg.IndividualPerson28.ModifiedCitizenship,
					com.tools20022.repository.msg.IndividualPerson27.Citizenship, com.tools20022.repository.msg.IndividualPerson33.ModifiedCitizenship, com.tools20022.repository.msg.IndividualPerson34.Citizenship,
					com.tools20022.repository.msg.CitizenshipInformation2.Nationality);
			elementContext_lazy = () -> Person.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Nationality";
			definition = "Specifies the country where a person was born or is legally accepted as belonging to the country.";
			minOccurs = 0;
			type_lazy = () -> Country.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Country.Citizen;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Indicates whether the person is a legal minor. It may depend on the
	 * nationality, the domicile country or the transaction in which the person
	 * is involved.
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
	 * {@linkplain com.tools20022.repository.msg.CitizenshipInformation#MinorIndicator
	 * CitizenshipInformation.MinorIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CitizenshipInformation2#MinorIndicator
	 * CitizenshipInformation2.MinorIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Person
	 * Person}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinorIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the person is a legal minor. It may depend on the nationality, the domicile country or the transaction in which the person is involved."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute MinorIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CitizenshipInformation.MinorIndicator, com.tools20022.repository.msg.CitizenshipInformation2.MinorIndicator);
			elementContext_lazy = () -> Person.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MinorIndicator";
			definition = "Indicates whether the person is a legal minor. It may depend on the nationality, the domicile country or the transaction in which the person is involved.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Title of the function in an organisation.
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
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson10#BusinessFunction
	 * IndividualPerson10.BusinessFunction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson20#BusinessFunction
	 * IndividualPerson20.BusinessFunction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson11#BusinessFunction
	 * IndividualPerson11.BusinessFunction}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TaxAuthorisation1#Title
	 * TaxAuthorisation1.Title}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Contacts3#JobTitle
	 * Contacts3.JobTitle}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson21#BusinessFunction
	 * IndividualPerson21.BusinessFunction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson22#BusinessFunction
	 * IndividualPerson22.BusinessFunction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson23#BusinessFunction
	 * IndividualPerson23.BusinessFunction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson24#BusinessFunction
	 * IndividualPerson24.BusinessFunction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson28#BusinessFunction
	 * IndividualPerson28.BusinessFunction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson27#BusinessFunction
	 * IndividualPerson27.BusinessFunction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson33#BusinessFunction
	 * IndividualPerson33.BusinessFunction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson34#BusinessFunction
	 * IndividualPerson34.BusinessFunction}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Person
	 * Person}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BusinessFunctionTitle"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Title of the function in an organisation."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute BusinessFunctionTitle = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IndividualPerson10.BusinessFunction, com.tools20022.repository.msg.IndividualPerson20.BusinessFunction,
					com.tools20022.repository.msg.IndividualPerson11.BusinessFunction, com.tools20022.repository.msg.TaxAuthorisation1.Title, com.tools20022.repository.msg.Contacts3.JobTitle,
					com.tools20022.repository.msg.IndividualPerson21.BusinessFunction, com.tools20022.repository.msg.IndividualPerson22.BusinessFunction, com.tools20022.repository.msg.IndividualPerson23.BusinessFunction,
					com.tools20022.repository.msg.IndividualPerson24.BusinessFunction, com.tools20022.repository.msg.IndividualPerson28.BusinessFunction, com.tools20022.repository.msg.IndividualPerson27.BusinessFunction,
					com.tools20022.repository.msg.IndividualPerson33.BusinessFunction, com.tools20022.repository.msg.IndividualPerson34.BusinessFunction);
			elementContext_lazy = () -> Person.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BusinessFunctionTitle";
			definition = "Title of the function in an organisation.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Specific identification assigned to a person. It is derived from the
	 * association between Party and PartyIdentification.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PersonIdentification#Person
	 * PersonIdentification.Person}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.PersonIdentification
	 * PersonIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount19#IndividualOwnerIdentification
	 * InvestmentAccount19.IndividualOwnerIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount29#IndividualOwnerIdentification
	 * InvestmentAccount29.IndividualOwnerIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount14#IndividualOwnerIdentification
	 * InvestmentAccount14.IndividualOwnerIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson7#Identification
	 * IndividualPerson7.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson14#Identification
	 * IndividualPerson14.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson16#Identification
	 * IndividualPerson16.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson13#Identification
	 * IndividualPerson13.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson17#Identification
	 * IndividualPerson17.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics1#AccountServicerContact
	 * CashAccountCharacteristics1.AccountServicerContact}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingTaxIdentification1#TaxContact
	 * BillingTaxIdentification1.TaxContact}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OwnerIdentification1Choice#IndividualOwnerIdentification
	 * OwnerIdentification1Choice.IndividualOwnerIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson25#Identification
	 * IndividualPerson25.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson26#Identification
	 * IndividualPerson26.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics2#AccountServicerContact
	 * CashAccountCharacteristics2.AccountServicerContact}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AccountOwner1Choice#IndividualOwnerIdentification
	 * AccountOwner1Choice.IndividualOwnerIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OwnerIdentification2Choice#IndividualOwnerIdentification
	 * OwnerIdentification2Choice.IndividualOwnerIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ParticipantAndStatus1#ParticipantContactDetails
	 * ParticipantAndStatus1.ParticipantContactDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AccountOwner2Choice#IndividualOwnerIdentification
	 * AccountOwner2Choice.IndividualOwnerIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Person
	 * Person}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PersonIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specific identification assigned to a person. It is derived from the association between Party and PartyIdentification."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd PersonIdentification = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvestmentAccount19.IndividualOwnerIdentification, com.tools20022.repository.msg.InvestmentAccount29.IndividualOwnerIdentification,
					com.tools20022.repository.msg.InvestmentAccount14.IndividualOwnerIdentification, com.tools20022.repository.msg.IndividualPerson7.Identification, com.tools20022.repository.msg.IndividualPerson14.Identification,
					com.tools20022.repository.msg.IndividualPerson16.Identification, com.tools20022.repository.msg.IndividualPerson13.Identification, com.tools20022.repository.msg.IndividualPerson17.Identification,
					com.tools20022.repository.msg.CashAccountCharacteristics1.AccountServicerContact, com.tools20022.repository.msg.BillingTaxIdentification1.TaxContact,
					com.tools20022.repository.choice.OwnerIdentification1Choice.IndividualOwnerIdentification, com.tools20022.repository.msg.IndividualPerson25.Identification,
					com.tools20022.repository.msg.IndividualPerson26.Identification, com.tools20022.repository.msg.CashAccountCharacteristics2.AccountServicerContact,
					com.tools20022.repository.choice.AccountOwner1Choice.IndividualOwnerIdentification, com.tools20022.repository.choice.OwnerIdentification2Choice.IndividualOwnerIdentification,
					com.tools20022.repository.msg.ParticipantAndStatus1.ParticipantContactDetails, com.tools20022.repository.choice.AccountOwner2Choice.IndividualOwnerIdentification);
			elementContext_lazy = () -> Person.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PersonIdentification";
			definition = "Specific identification assigned to a person. It is derived from the association between Party and PartyIdentification.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.PersonIdentification.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PersonIdentification.Person;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Party which is the employer of a person.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.EmployingPartyRole#Employee
	 * EmployingPartyRole.Employee}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.EmployingPartyRole
	 * EmployingPartyRole}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingContactPerson#EmployingParty
	 * MeetingContactPerson.EmployingParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ContactInformation3#EmployingParty
	 * ContactInformation3.EmployingParty}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Person
	 * Person}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EmployingParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party which is the employer of a person."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd EmployingParty = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MeetingContactPerson.EmployingParty, com.tools20022.repository.msg.ContactInformation3.EmployingParty);
			elementContext_lazy = () -> Person.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EmployingParty";
			definition = "Party which is the employer of a person.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> EmployingPartyRole.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.EmployingPartyRole.Employee;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the meeting attendee which is an individual person.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.MeetingAttendeeRole#Person
	 * MeetingAttendeeRole.Person}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.MeetingAttendeeRole
	 * MeetingAttendeeRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Person
	 * Person}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MeetingAttendee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the meeting attendee which is an individual person."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd MeetingAttendee = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Person.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MeetingAttendee";
			definition = "Specifies the meeting attendee which is an individual person.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> MeetingAttendeeRole.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.MeetingAttendeeRole.Person;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Role performed by the person for the proxy voting process.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AssignedProxyRole#ProxyPerson
	 * AssignedProxyRole.ProxyPerson}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.AssignedProxyRole
	 * AssignedProxyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Person
	 * Person}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Role performed by the person for the proxy voting process."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedRole = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Person.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedRole";
			definition = "Role performed by the person for the proxy voting process.";
			minOccurs = 0;
			type_lazy = () -> AssignedProxyRole.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.AssignedProxyRole.ProxyPerson;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the person who is the pre-assigned proxy for a meeting.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AssignedProxyRole#PreAssignedProxyRole
	 * AssignedProxyRole.PreAssignedProxyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.AssignedProxyRole
	 * AssignedProxyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Person
	 * Person}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreAssignedProxyPerson"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the person who is the pre-assigned proxy for a meeting."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd PreAssignedProxyPerson = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Person.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PreAssignedProxyPerson";
			definition = "Specifies the person who is the pre-assigned proxy for a meeting.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> AssignedProxyRole.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.AssignedProxyRole.PreAssignedProxyRole;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Information to support the Know Your Customer processes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PersonProfile#Person
	 * PersonProfile.Person}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PersonProfile
	 * PersonProfile}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Person
	 * Person}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PersonProfile"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information to support the Know Your Customer processes."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd PersonProfile = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Person.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PersonProfile";
			definition = "Information to support the Know Your Customer processes.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.PersonProfile.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PersonProfile.Person;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Contact role played by a person.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ContactPersonRole#Person
	 * ContactPersonRole.Person}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ContactPersonRole
	 * ContactPersonRole}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndContactInformation1#ContactInformation
	 * PartyIdentificationAndContactInformation1.ContactInformation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Person
	 * Person}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContactPersonRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Contact role played by a person."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ContactPersonRole = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PartyIdentificationAndContactInformation1.ContactInformation);
			elementContext_lazy = () -> Person.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ContactPersonRole";
			definition = "Contact role played by a person.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.ContactPersonRole.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ContactPersonRole.Person;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the members of a household in relation with the ownership of an
	 * account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Household#Member
	 * Household.Member}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Household Household}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Person
	 * Person}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Household"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the members of a household in relation with the ownership of an account."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Household = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Person.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Household";
			definition = "Specifies the members of a household in relation with the ownership of an account.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Household.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Household.Member;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the civil status of a person.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CivilStatusCode
	 * CivilStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson28#CivilStatus
	 * IndividualPerson28.CivilStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson27#CivilStatus
	 * IndividualPerson27.CivilStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson33#CivilStatus
	 * IndividualPerson33.CivilStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson34#CivilStatus
	 * IndividualPerson34.CivilStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Person
	 * Person}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CivilStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the civil status of a person."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CivilStatus = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IndividualPerson28.CivilStatus, com.tools20022.repository.msg.IndividualPerson27.CivilStatus, com.tools20022.repository.msg.IndividualPerson33.CivilStatus,
					com.tools20022.repository.msg.IndividualPerson34.CivilStatus);
			elementContext_lazy = () -> Person.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CivilStatus";
			definition = "Specifies the civil status of a person.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CivilStatusCode.mmObject();
		}
	};
	/**
	 * Date on which a person is dead.
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
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson28#DeathDate
	 * IndividualPerson28.DeathDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson27#DeathDate
	 * IndividualPerson27.DeathDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson33#DeathDate
	 * IndividualPerson33.DeathDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson34#DeathDate
	 * IndividualPerson34.DeathDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Person
	 * Person}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeathDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date on which a person is dead."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute DeathDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IndividualPerson28.DeathDate, com.tools20022.repository.msg.IndividualPerson27.DeathDate, com.tools20022.repository.msg.IndividualPerson33.DeathDate,
					com.tools20022.repository.msg.IndividualPerson34.DeathDate);
			elementContext_lazy = () -> Person.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DeathDate";
			definition = "Date on which a person is dead.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Person";
				definition = "Human entity, as distinguished from a corporate entity (which is sometimes referred to as an 'artificial person').";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Country.Citizen, com.tools20022.repository.entity.Location.NativePerson, com.tools20022.repository.entity.PersonIdentification.Person,
						com.tools20022.repository.entity.EmployingPartyRole.Employee, com.tools20022.repository.entity.ContactPersonRole.Person, com.tools20022.repository.entity.AssignedProxyRole.ProxyPerson,
						com.tools20022.repository.entity.AssignedProxyRole.PreAssignedProxyRole, com.tools20022.repository.entity.MeetingAttendeeRole.Person, com.tools20022.repository.entity.PersonProfile.Person,
						com.tools20022.repository.entity.Household.Member);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvestmentAccountOwnershipInformation5.IndividualPerson, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation2.IndividualPerson,
						com.tools20022.repository.choice.Party14Choice.IndividualPerson, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation3.IndividualPerson,
						com.tools20022.repository.msg.InvestmentAccountOwnershipInformation4.IndividualPerson, com.tools20022.repository.msg.TransferOut3.Investor, com.tools20022.repository.msg.PEPISATransfer7.PrimaryIndividualInvestor,
						com.tools20022.repository.msg.PEPISATransfer7.SecondaryIndividualInvestor, com.tools20022.repository.msg.PEPISATransfer7.OtherIndividualInvestor,
						com.tools20022.repository.msg.PEPISATransfer11.PrimaryIndividualInvestor, com.tools20022.repository.msg.PEPISATransfer11.SecondaryIndividualInvestor,
						com.tools20022.repository.msg.PEPISATransfer11.OtherIndividualInvestor, com.tools20022.repository.msg.ISATransfer9.PrimaryIndividualInvestor, com.tools20022.repository.msg.ISATransfer9.SecondaryIndividualInvestor,
						com.tools20022.repository.msg.ISATransfer9.OtherIndividualInvestor, com.tools20022.repository.msg.RedemptionOrder3.BeneficiaryDetails, com.tools20022.repository.msg.RedemptionOrder5.BeneficiaryDetails,
						com.tools20022.repository.msg.RedemptionExecution3.BeneficiaryDetails, com.tools20022.repository.msg.RedemptionExecution5.BeneficiaryDetails, com.tools20022.repository.msg.RedemptionOrder7.BeneficiaryDetails,
						com.tools20022.repository.msg.RedemptionMultipleOrder2.BeneficiaryDetails, com.tools20022.repository.msg.RedemptionMultipleOrder3.BeneficiaryDetails,
						com.tools20022.repository.msg.RedemptionMultipleExecution2.BeneficiaryDetails, com.tools20022.repository.msg.RedemptionMultipleExecution3.BeneficiaryDetails,
						com.tools20022.repository.msg.RedemptionMultipleOrder4.BeneficiaryDetails, com.tools20022.repository.msg.SubscriptionOrder3.BeneficiaryDetails, com.tools20022.repository.msg.SubscriptionOrder5.BeneficiaryDetails,
						com.tools20022.repository.msg.SubscriptionExecution3.BeneficiaryDetails, com.tools20022.repository.msg.SubscriptionExecution5.BeneficiaryDetails, com.tools20022.repository.msg.SubscriptionOrder7.BeneficiaryDetails,
						com.tools20022.repository.msg.SubscriptionMultipleOrder2.BeneficiaryDetails, com.tools20022.repository.msg.SubscriptionMultipleOrder3.BeneficiaryDetails,
						com.tools20022.repository.msg.SubscriptionMultipleExecution2.BeneficiaryDetails, com.tools20022.repository.msg.SubscriptionMultipleExecution3.BeneficiaryDetails,
						com.tools20022.repository.msg.SubscriptionMultipleOrder4.BeneficiaryDetails, com.tools20022.repository.msg.Proxy.PreassignedProxy, com.tools20022.repository.msg.MeetingNotice1.ContactPersonDetails,
						com.tools20022.repository.msg.MeetingNotice2.ContactPersonDetails, com.tools20022.repository.msg.MeetingNotice3.ContactPersonDetails, com.tools20022.repository.msg.VotingPartyAndInstruction.PersonDetail,
						com.tools20022.repository.msg.SecurityPosition1.Proxy, com.tools20022.repository.msg.Instruction1.MeetingAttendee, com.tools20022.repository.msg.Instruction2.MeetingAttendee,
						com.tools20022.repository.msg.MemberDetails.ContactReference, com.tools20022.repository.msg.MemberDetails1.ContactReference, com.tools20022.repository.msg.RedemptionExecution10.BeneficiaryDetails,
						com.tools20022.repository.msg.RedemptionOrder9.BeneficiaryDetails, com.tools20022.repository.msg.BeneficiaryInformation2.BeneficiaryIdentification,
						com.tools20022.repository.msg.SubscriptionExecution7.BeneficiaryDetails, com.tools20022.repository.msg.BeneficiaryInformation1.BeneficiaryIdentification,
						com.tools20022.repository.msg.SubscriptionOrder9.BeneficiaryDetails, com.tools20022.repository.msg.TransferOut4.Investor, com.tools20022.repository.msg.ContactInformation3.ContactPerson,
						com.tools20022.repository.msg.Member1.ContactReference, com.tools20022.repository.msg.Member2.ContactReference, com.tools20022.repository.choice.Party15Choice.IndividualPerson,
						com.tools20022.repository.choice.Party16Choice.IndividualPerson, com.tools20022.repository.msg.ISATransfer12.PrimaryIndividualInvestor, com.tools20022.repository.msg.ISATransfer12.SecondaryIndividualInvestor,
						com.tools20022.repository.msg.ISATransfer12.OtherIndividualInvestor, com.tools20022.repository.msg.ISATransfer19.PrimaryIndividualInvestor, com.tools20022.repository.msg.ISATransfer19.SecondaryIndividualInvestor,
						com.tools20022.repository.msg.ISATransfer19.OtherIndividualInvestor, com.tools20022.repository.msg.Instruction3.MeetingAttendee, com.tools20022.repository.msg.MeetingNotice4.ContactPersonDetails,
						com.tools20022.repository.choice.Party24Choice.IndividualPerson, com.tools20022.repository.choice.Party23Choice.IndividualPerson, com.tools20022.repository.choice.Party30Choice.IndividualPerson,
						com.tools20022.repository.msg.IndividualPerson28.FamilyInformation, com.tools20022.repository.choice.Party31Choice.IndividualPerson, com.tools20022.repository.msg.IndividualPerson27.FamilyInformation,
						com.tools20022.repository.msg.ISATransfer24.PrimaryIndividualInvestor, com.tools20022.repository.msg.ISATransfer24.SecondaryIndividualInvestor, com.tools20022.repository.msg.ISATransfer24.OtherIndividualInvestor,
						com.tools20022.repository.msg.RedemptionMultipleExecution5.BeneficiaryDetails, com.tools20022.repository.msg.RedemptionMultipleOrder6.BeneficiaryDetails,
						com.tools20022.repository.msg.SubscriptionMultipleOrder6.BeneficiaryDetails, com.tools20022.repository.msg.SubscriptionMultipleExecution5.BeneficiaryDetails,
						com.tools20022.repository.msg.SubscriptionExecution12.BeneficiaryDetails, com.tools20022.repository.msg.SubscriptionOrder15.BeneficiaryDetails, com.tools20022.repository.msg.RedemptionOrder15.BeneficiaryDetails,
						com.tools20022.repository.choice.Party33Choice.IndividualPerson, com.tools20022.repository.msg.IndividualPerson33.FamilyInformation, com.tools20022.repository.choice.Party32Choice.IndividualPerson,
						com.tools20022.repository.msg.RedemptionExecution16.BeneficiaryDetails, com.tools20022.repository.msg.SecuritiesTransactionReport4.ExecutingPerson, com.tools20022.repository.msg.IndividualPerson34.FamilyInformation);
				superType_lazy = () -> Party.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Person.Gender, com.tools20022.repository.entity.Person.Language, com.tools20022.repository.entity.Person.BirthDate,
						com.tools20022.repository.entity.Person.PlaceOfBirth, com.tools20022.repository.entity.Person.Profession, com.tools20022.repository.entity.Person.ResidentialStatus,
						com.tools20022.repository.entity.Person.Nationality, com.tools20022.repository.entity.Person.MinorIndicator, com.tools20022.repository.entity.Person.BusinessFunctionTitle,
						com.tools20022.repository.entity.Person.PersonIdentification, com.tools20022.repository.entity.Person.EmployingParty, com.tools20022.repository.entity.Person.MeetingAttendee,
						com.tools20022.repository.entity.Person.RelatedRole, com.tools20022.repository.entity.Person.PreAssignedProxyPerson, com.tools20022.repository.entity.Person.PersonProfile,
						com.tools20022.repository.entity.Person.ContactPersonRole, com.tools20022.repository.entity.Person.Household, com.tools20022.repository.entity.Person.CivilStatus, com.tools20022.repository.entity.Person.DeathDate);
				derivationComponent_lazy = () -> Arrays.asList(CitizenshipInformation.mmObject(), IndividualPerson5.mmObject(), IndividualPerson10.mmObject(), IndividualPerson20.mmObject(), IndividualPerson3.mmObject(),
						IndividualPerson8.mmObject(), IndividualPerson4.mmObject(), IndividualPerson6.mmObject(), IndividualPerson11.mmObject(), DateAndPlaceOfBirth.mmObject(), PartyIdentificationSD4.mmObject(), Contacts3.mmObject(),
						IndividualPerson2.mmObject(), IndividualPerson12.mmObject(), IndividualPerson9.mmObject(), IndividualPerson7.mmObject(), IndividualPerson14.mmObject(), IndividualPerson16.mmObject(),
						PartyAdditionalIdentification2Choice.mmObject(), IndividualPerson13.mmObject(), IndividualPerson17.mmObject(), ContactIdentificationAndAddress.mmObject(), IndividualPerson15.mmObject(),
						ContactInformation3.mmObject(), IndividualPerson21.mmObject(), IndividualPerson22.mmObject(), IndividualPerson23.mmObject(), IndividualPerson24.mmObject(), IndividualPerson25.mmObject(),
						IndividualPerson26.mmObject(), IndividualPerson30.mmObject(), IndividualPerson28.mmObject(), IndividualPerson27.mmObject(), IndividualPerson29.mmObject(), IndividualPerson32.mmObject(),
						IndividualPerson31.mmObject(), IndividualPerson33.mmObject(), IndividualPerson35.mmObject(), IndividualPerson34.mmObject(), CitizenshipInformation2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}