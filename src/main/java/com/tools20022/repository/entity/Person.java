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
import java.util.List;

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
 * <li>{@linkplain com.tools20022.repository.entity.Person#mmGender
 * Person.mmGender}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Person#mmLanguage
 * Person.mmLanguage}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Person#mmBirthDate
 * Person.mmBirthDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Person#mmPlaceOfBirth
 * Person.mmPlaceOfBirth}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Person#mmProfession
 * Person.mmProfession}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Person#mmResidentialStatus
 * Person.mmResidentialStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Person#mmNationality
 * Person.mmNationality}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Person#mmMinorIndicator
 * Person.mmMinorIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Person#mmBusinessFunctionTitle
 * Person.mmBusinessFunctionTitle}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Person#mmPersonIdentification
 * Person.mmPersonIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Person#mmEmployingParty
 * Person.mmEmployingParty}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Person#mmMeetingAttendee
 * Person.mmMeetingAttendee}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Person#mmRelatedRole
 * Person.mmRelatedRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Person#mmPreAssignedProxyPerson
 * Person.mmPreAssignedProxyPerson}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Person#mmPersonProfile
 * Person.mmPersonProfile}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Person#mmContactPersonRole
 * Person.mmContactPersonRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Person#mmHousehold
 * Person.mmHousehold}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Person#mmCivilStatus
 * Person.mmCivilStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Person#mmDeathDate
 * Person.mmDeathDate}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Country#mmCitizen
 * Country.mmCitizen}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Location#mmNativePerson
 * Location.mmNativePerson}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PersonIdentification#mmPerson
 * PersonIdentification.mmPerson}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.EmployingPartyRole#mmEmployee
 * EmployingPartyRole.mmEmployee}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ContactPersonRole#mmPerson
 * ContactPersonRole.mmPerson}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AssignedProxyRole#mmProxyPerson
 * AssignedProxyRole.mmProxyPerson}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AssignedProxyRole#mmPreAssignedProxyRole
 * AssignedProxyRole.mmPreAssignedProxyRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MeetingAttendeeRole#mmPerson
 * MeetingAttendeeRole.mmPerson}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PersonProfile#mmPerson
 * PersonProfile.mmPerson}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Household#mmMember
 * Household.mmMember}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation5#mmIndividualPerson
 * InvestmentAccountOwnershipInformation5.mmIndividualPerson}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation2#mmIndividualPerson
 * InvestmentAccountOwnershipInformation2.mmIndividualPerson}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Party14Choice#mmIndividualPerson
 * Party14Choice.mmIndividualPerson}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation3#mmIndividualPerson
 * InvestmentAccountOwnershipInformation3.mmIndividualPerson}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation4#mmIndividualPerson
 * InvestmentAccountOwnershipInformation4.mmIndividualPerson}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferOut3#mmInvestor
 * TransferOut3.mmInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PEPISATransfer7#mmPrimaryIndividualInvestor
 * PEPISATransfer7.mmPrimaryIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PEPISATransfer7#mmSecondaryIndividualInvestor
 * PEPISATransfer7.mmSecondaryIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PEPISATransfer7#mmOtherIndividualInvestor
 * PEPISATransfer7.mmOtherIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PEPISATransfer11#mmPrimaryIndividualInvestor
 * PEPISATransfer11.mmPrimaryIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PEPISATransfer11#mmSecondaryIndividualInvestor
 * PEPISATransfer11.mmSecondaryIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PEPISATransfer11#mmOtherIndividualInvestor
 * PEPISATransfer11.mmOtherIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer9#mmPrimaryIndividualInvestor
 * ISATransfer9.mmPrimaryIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer9#mmSecondaryIndividualInvestor
 * ISATransfer9.mmSecondaryIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer9#mmOtherIndividualInvestor
 * ISATransfer9.mmOtherIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionOrder3#mmBeneficiaryDetails
 * RedemptionOrder3.mmBeneficiaryDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionOrder5#mmBeneficiaryDetails
 * RedemptionOrder5.mmBeneficiaryDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionExecution3#mmBeneficiaryDetails
 * RedemptionExecution3.mmBeneficiaryDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionExecution5#mmBeneficiaryDetails
 * RedemptionExecution5.mmBeneficiaryDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionOrder7#mmBeneficiaryDetails
 * RedemptionOrder7.mmBeneficiaryDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder2#mmBeneficiaryDetails
 * RedemptionMultipleOrder2.mmBeneficiaryDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder3#mmBeneficiaryDetails
 * RedemptionMultipleOrder3.mmBeneficiaryDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution2#mmBeneficiaryDetails
 * RedemptionMultipleExecution2.mmBeneficiaryDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution3#mmBeneficiaryDetails
 * RedemptionMultipleExecution3.mmBeneficiaryDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder4#mmBeneficiaryDetails
 * RedemptionMultipleOrder4.mmBeneficiaryDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder3#mmBeneficiaryDetails
 * SubscriptionOrder3.mmBeneficiaryDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder5#mmBeneficiaryDetails
 * SubscriptionOrder5.mmBeneficiaryDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution3#mmBeneficiaryDetails
 * SubscriptionExecution3.mmBeneficiaryDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution5#mmBeneficiaryDetails
 * SubscriptionExecution5.mmBeneficiaryDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder7#mmBeneficiaryDetails
 * SubscriptionOrder7.mmBeneficiaryDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder2#mmBeneficiaryDetails
 * SubscriptionMultipleOrder2.mmBeneficiaryDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder3#mmBeneficiaryDetails
 * SubscriptionMultipleOrder3.mmBeneficiaryDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleExecution2#mmBeneficiaryDetails
 * SubscriptionMultipleExecution2.mmBeneficiaryDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleExecution3#mmBeneficiaryDetails
 * SubscriptionMultipleExecution3.mmBeneficiaryDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder4#mmBeneficiaryDetails
 * SubscriptionMultipleOrder4.mmBeneficiaryDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Proxy#mmPreassignedProxy
 * Proxy.mmPreassignedProxy}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingNotice1#mmContactPersonDetails
 * MeetingNotice1.mmContactPersonDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingNotice2#mmContactPersonDetails
 * MeetingNotice2.mmContactPersonDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingNotice3#mmContactPersonDetails
 * MeetingNotice3.mmContactPersonDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.VotingPartyAndInstruction#mmPersonDetail
 * VotingPartyAndInstruction.mmPersonDetail}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecurityPosition1#mmProxy
 * SecurityPosition1.mmProxy}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Instruction1#mmMeetingAttendee
 * Instruction1.mmMeetingAttendee}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Instruction2#mmMeetingAttendee
 * Instruction2.mmMeetingAttendee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MemberDetails#mmContactReference
 * MemberDetails.mmContactReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MemberDetails1#mmContactReference
 * MemberDetails1.mmContactReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionExecution10#mmBeneficiaryDetails
 * RedemptionExecution10.mmBeneficiaryDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionOrder9#mmBeneficiaryDetails
 * RedemptionOrder9.mmBeneficiaryDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BeneficiaryInformation2#mmBeneficiaryIdentification
 * BeneficiaryInformation2.mmBeneficiaryIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7#mmBeneficiaryDetails
 * SubscriptionExecution7.mmBeneficiaryDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BeneficiaryInformation1#mmBeneficiaryIdentification
 * BeneficiaryInformation1.mmBeneficiaryIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder9#mmBeneficiaryDetails
 * SubscriptionOrder9.mmBeneficiaryDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferOut4#mmInvestor
 * TransferOut4.mmInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ContactInformation3#mmContactPerson
 * ContactInformation3.mmContactPerson}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Member1#mmContactReference
 * Member1.mmContactReference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Member2#mmContactReference
 * Member2.mmContactReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Party15Choice#mmIndividualPerson
 * Party15Choice.mmIndividualPerson}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Party16Choice#mmIndividualPerson
 * Party16Choice.mmIndividualPerson}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer12#mmPrimaryIndividualInvestor
 * ISATransfer12.mmPrimaryIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer12#mmSecondaryIndividualInvestor
 * ISATransfer12.mmSecondaryIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer12#mmOtherIndividualInvestor
 * ISATransfer12.mmOtherIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer19#mmPrimaryIndividualInvestor
 * ISATransfer19.mmPrimaryIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer19#mmSecondaryIndividualInvestor
 * ISATransfer19.mmSecondaryIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer19#mmOtherIndividualInvestor
 * ISATransfer19.mmOtherIndividualInvestor}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Instruction3#mmMeetingAttendee
 * Instruction3.mmMeetingAttendee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingNotice4#mmContactPersonDetails
 * MeetingNotice4.mmContactPersonDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Party24Choice#mmIndividualPerson
 * Party24Choice.mmIndividualPerson}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Party23Choice#mmIndividualPerson
 * Party23Choice.mmIndividualPerson}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Party30Choice#mmIndividualPerson
 * Party30Choice.mmIndividualPerson}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson28#mmFamilyInformation
 * IndividualPerson28.mmFamilyInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Party31Choice#mmIndividualPerson
 * Party31Choice.mmIndividualPerson}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson27#mmFamilyInformation
 * IndividualPerson27.mmFamilyInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer24#mmPrimaryIndividualInvestor
 * ISATransfer24.mmPrimaryIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer24#mmSecondaryIndividualInvestor
 * ISATransfer24.mmSecondaryIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer24#mmOtherIndividualInvestor
 * ISATransfer24.mmOtherIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution5#mmBeneficiaryDetails
 * RedemptionMultipleExecution5.mmBeneficiaryDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder6#mmBeneficiaryDetails
 * RedemptionMultipleOrder6.mmBeneficiaryDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder6#mmBeneficiaryDetails
 * SubscriptionMultipleOrder6.mmBeneficiaryDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleExecution5#mmBeneficiaryDetails
 * SubscriptionMultipleExecution5.mmBeneficiaryDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution12#mmBeneficiaryDetails
 * SubscriptionExecution12.mmBeneficiaryDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder15#mmBeneficiaryDetails
 * SubscriptionOrder15.mmBeneficiaryDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionOrder15#mmBeneficiaryDetails
 * RedemptionOrder15.mmBeneficiaryDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Party33Choice#mmIndividualPerson
 * Party33Choice.mmIndividualPerson}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson33#mmFamilyInformation
 * IndividualPerson33.mmFamilyInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Party32Choice#mmIndividualPerson
 * Party32Choice.mmIndividualPerson}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#mmBeneficiaryDetails
 * RedemptionExecution16.mmBeneficiaryDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTransactionReport4#mmExecutingPerson
 * SecuritiesTransactionReport4.mmExecutingPerson}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson34#mmFamilyInformation
 * IndividualPerson34.mmFamilyInformation}</li>
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
	protected GenderCode gender;
	/**
	 * Specifies the gender of the person.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.GenderCode
	 * GenderCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Person
	 * Person}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson5#mmGender
	 * IndividualPerson5.mmGender}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson10#mmGender
	 * IndividualPerson10.mmGender}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson20#mmGender
	 * IndividualPerson20.mmGender}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson3#mmGender
	 * IndividualPerson3.mmGender}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson8#mmGender
	 * IndividualPerson8.mmGender}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson4#mmGender
	 * IndividualPerson4.mmGender}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson6#mmGender
	 * IndividualPerson6.mmGender}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson11#mmGender
	 * IndividualPerson11.mmGender}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson21#mmGender
	 * IndividualPerson21.mmGender}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson22#mmGender
	 * IndividualPerson22.mmGender}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson23#mmGender
	 * IndividualPerson23.mmGender}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson24#mmGender
	 * IndividualPerson24.mmGender}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson30#mmGender
	 * IndividualPerson30.mmGender}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson28#mmGender
	 * IndividualPerson28.mmGender}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson27#mmGender
	 * IndividualPerson27.mmGender}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson33#mmGender
	 * IndividualPerson33.mmGender}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson35#mmGender
	 * IndividualPerson35.mmGender}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson34#mmGender
	 * IndividualPerson34.mmGender}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmGender = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IndividualPerson5.mmGender, com.tools20022.repository.msg.IndividualPerson10.mmGender, com.tools20022.repository.msg.IndividualPerson20.mmGender,
					com.tools20022.repository.msg.IndividualPerson3.mmGender, com.tools20022.repository.msg.IndividualPerson8.mmGender, com.tools20022.repository.msg.IndividualPerson4.mmGender,
					com.tools20022.repository.msg.IndividualPerson6.mmGender, com.tools20022.repository.msg.IndividualPerson11.mmGender, com.tools20022.repository.msg.IndividualPerson21.mmGender,
					com.tools20022.repository.msg.IndividualPerson22.mmGender, com.tools20022.repository.msg.IndividualPerson23.mmGender, com.tools20022.repository.msg.IndividualPerson24.mmGender,
					com.tools20022.repository.msg.IndividualPerson30.mmGender, com.tools20022.repository.msg.IndividualPerson28.mmGender, com.tools20022.repository.msg.IndividualPerson27.mmGender,
					com.tools20022.repository.msg.IndividualPerson33.mmGender, com.tools20022.repository.msg.IndividualPerson35.mmGender, com.tools20022.repository.msg.IndividualPerson34.mmGender);
			elementContext_lazy = () -> Person.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Gender";
			definition = "Specifies the gender of the person.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> GenderCode.mmObject();
		}
	};
	protected LanguageCode language;
	/**
	 * Language in which a person communicates.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.LanguageCode
	 * LanguageCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Person
	 * Person}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson5#mmLanguage
	 * IndividualPerson5.mmLanguage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson10#mmLanguage
	 * IndividualPerson10.mmLanguage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson20#mmLanguage
	 * IndividualPerson20.mmLanguage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson6#mmLanguage
	 * IndividualPerson6.mmLanguage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson11#mmLanguage
	 * IndividualPerson11.mmLanguage}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Cardholder1#mmLanguage
	 * Cardholder1.mmLanguage}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Cardholder3#mmLanguage
	 * Cardholder3.mmLanguage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson21#mmLanguage
	 * IndividualPerson21.mmLanguage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson22#mmLanguage
	 * IndividualPerson22.mmLanguage}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Cardholder5#mmLanguage
	 * Cardholder5.mmLanguage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson23#mmLanguage
	 * IndividualPerson23.mmLanguage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson24#mmLanguage
	 * IndividualPerson24.mmLanguage}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Cardholder7#mmLanguage
	 * Cardholder7.mmLanguage}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Cardholder9#mmLanguage
	 * Cardholder9.mmLanguage}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Cardholder10#mmLanguage
	 * Cardholder10.mmLanguage}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Cardholder12#mmLanguage
	 * Cardholder12.mmLanguage}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmLanguage = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IndividualPerson5.mmLanguage, com.tools20022.repository.msg.IndividualPerson10.mmLanguage, com.tools20022.repository.msg.IndividualPerson20.mmLanguage,
					com.tools20022.repository.msg.IndividualPerson6.mmLanguage, com.tools20022.repository.msg.IndividualPerson11.mmLanguage, com.tools20022.repository.msg.Cardholder1.mmLanguage,
					com.tools20022.repository.msg.Cardholder3.mmLanguage, com.tools20022.repository.msg.IndividualPerson21.mmLanguage, com.tools20022.repository.msg.IndividualPerson22.mmLanguage,
					com.tools20022.repository.msg.Cardholder5.mmLanguage, com.tools20022.repository.msg.IndividualPerson23.mmLanguage, com.tools20022.repository.msg.IndividualPerson24.mmLanguage,
					com.tools20022.repository.msg.Cardholder7.mmLanguage, com.tools20022.repository.msg.Cardholder9.mmLanguage, com.tools20022.repository.msg.Cardholder10.mmLanguage, com.tools20022.repository.msg.Cardholder12.mmLanguage);
			elementContext_lazy = () -> Person.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Language";
			definition = "Language in which a person communicates.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> LanguageCode.mmObject();
		}
	};
	protected ISODateTime birthDate;
	/**
	 * Date on which a person is born.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Person
	 * Person}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson5#mmBirthDate
	 * IndividualPerson5.mmBirthDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson10#mmBirthDate
	 * IndividualPerson10.mmBirthDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson20#mmBirthDate
	 * IndividualPerson20.mmBirthDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson3#mmBirthDate
	 * IndividualPerson3.mmBirthDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson8#mmBirthDate
	 * IndividualPerson8.mmBirthDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson4#mmBirthDate
	 * IndividualPerson4.mmBirthDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson6#mmBirthDate
	 * IndividualPerson6.mmBirthDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson11#mmBirthDate
	 * IndividualPerson11.mmBirthDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DateAndPlaceOfBirth#mmBirthDate
	 * DateAndPlaceOfBirth.mmBirthDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson2#mmBirthDate
	 * IndividualPerson2.mmBirthDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson12#mmBirthDate
	 * IndividualPerson12.mmBirthDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson9#mmBirthDate
	 * IndividualPerson9.mmBirthDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyAdditionalIdentification2Choice#mmBirthDate
	 * PartyAdditionalIdentification2Choice.mmBirthDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson15#mmBirthDate
	 * IndividualPerson15.mmBirthDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson21#mmBirthDate
	 * IndividualPerson21.mmBirthDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson22#mmBirthDate
	 * IndividualPerson22.mmBirthDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson23#mmBirthDate
	 * IndividualPerson23.mmBirthDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson24#mmBirthDate
	 * IndividualPerson24.mmBirthDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification10#mmBirthDate
	 * PersonIdentification10.mmBirthDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson30#mmBirthDate
	 * IndividualPerson30.mmBirthDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson28#mmBirthDate
	 * IndividualPerson28.mmBirthDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson27#mmBirthDate
	 * IndividualPerson27.mmBirthDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson32#mmBirthDate
	 * IndividualPerson32.mmBirthDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson31#mmBirthDate
	 * IndividualPerson31.mmBirthDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson33#mmBirthDate
	 * IndividualPerson33.mmBirthDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson35#mmBirthDate
	 * IndividualPerson35.mmBirthDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson34#mmBirthDate
	 * IndividualPerson34.mmBirthDate}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmBirthDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IndividualPerson5.mmBirthDate, com.tools20022.repository.msg.IndividualPerson10.mmBirthDate, com.tools20022.repository.msg.IndividualPerson20.mmBirthDate,
					com.tools20022.repository.msg.IndividualPerson3.mmBirthDate, com.tools20022.repository.msg.IndividualPerson8.mmBirthDate, com.tools20022.repository.msg.IndividualPerson4.mmBirthDate,
					com.tools20022.repository.msg.IndividualPerson6.mmBirthDate, com.tools20022.repository.msg.IndividualPerson11.mmBirthDate, com.tools20022.repository.msg.DateAndPlaceOfBirth.mmBirthDate,
					com.tools20022.repository.msg.IndividualPerson2.mmBirthDate, com.tools20022.repository.msg.IndividualPerson12.mmBirthDate, com.tools20022.repository.msg.IndividualPerson9.mmBirthDate,
					com.tools20022.repository.choice.PartyAdditionalIdentification2Choice.mmBirthDate, com.tools20022.repository.msg.IndividualPerson15.mmBirthDate, com.tools20022.repository.msg.IndividualPerson21.mmBirthDate,
					com.tools20022.repository.msg.IndividualPerson22.mmBirthDate, com.tools20022.repository.msg.IndividualPerson23.mmBirthDate, com.tools20022.repository.msg.IndividualPerson24.mmBirthDate,
					com.tools20022.repository.msg.PersonIdentification10.mmBirthDate, com.tools20022.repository.msg.IndividualPerson30.mmBirthDate, com.tools20022.repository.msg.IndividualPerson28.mmBirthDate,
					com.tools20022.repository.msg.IndividualPerson27.mmBirthDate, com.tools20022.repository.msg.IndividualPerson32.mmBirthDate, com.tools20022.repository.msg.IndividualPerson31.mmBirthDate,
					com.tools20022.repository.msg.IndividualPerson33.mmBirthDate, com.tools20022.repository.msg.IndividualPerson35.mmBirthDate, com.tools20022.repository.msg.IndividualPerson34.mmBirthDate);
			elementContext_lazy = () -> Person.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BirthDate";
			definition = "Date on which a person is born.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected Location placeOfBirth;
	/**
	 * Place (for instance Country and City) where a person was born.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Location#mmNativePerson
	 * Location.mmNativePerson}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Location Location}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Person
	 * Person}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson5#mmCountryOfBirth
	 * IndividualPerson5.mmCountryOfBirth}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson5#mmCityOfBirth
	 * IndividualPerson5.mmCityOfBirth}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson10#mmCountryOfBirth
	 * IndividualPerson10.mmCountryOfBirth}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson20#mmCountryOfBirth
	 * IndividualPerson20.mmCountryOfBirth}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson20#mmProvinceOfBirth
	 * IndividualPerson20.mmProvinceOfBirth}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson20#mmCityOfBirth
	 * IndividualPerson20.mmCityOfBirth}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson6#mmCountryOfBirth
	 * IndividualPerson6.mmCountryOfBirth}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson6#mmCityOfBirth
	 * IndividualPerson6.mmCityOfBirth}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson11#mmCountryOfBirth
	 * IndividualPerson11.mmCountryOfBirth}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson21#mmCountryOfBirth
	 * IndividualPerson21.mmCountryOfBirth}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson21#mmProvinceOfBirth
	 * IndividualPerson21.mmProvinceOfBirth}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson21#mmCityOfBirth
	 * IndividualPerson21.mmCityOfBirth}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson22#mmCountryOfBirth
	 * IndividualPerson22.mmCountryOfBirth}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson22#mmProvinceOfBirth
	 * IndividualPerson22.mmProvinceOfBirth}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson22#mmCityOfBirth
	 * IndividualPerson22.mmCityOfBirth}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson23#mmCountryOfBirth
	 * IndividualPerson23.mmCountryOfBirth}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson23#mmProvinceOfBirth
	 * IndividualPerson23.mmProvinceOfBirth}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson23#mmCityOfBirth
	 * IndividualPerson23.mmCityOfBirth}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson24#mmCountryOfBirth
	 * IndividualPerson24.mmCountryOfBirth}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson24#mmProvinceOfBirth
	 * IndividualPerson24.mmProvinceOfBirth}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson24#mmCityOfBirth
	 * IndividualPerson24.mmCityOfBirth}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson28#mmCountryOfBirth
	 * IndividualPerson28.mmCountryOfBirth}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson28#mmProvinceOfBirth
	 * IndividualPerson28.mmProvinceOfBirth}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson28#mmCityOfBirth
	 * IndividualPerson28.mmCityOfBirth}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson27#mmCountryOfBirth
	 * IndividualPerson27.mmCountryOfBirth}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson27#mmProvinceOfBirth
	 * IndividualPerson27.mmProvinceOfBirth}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson27#mmCityOfBirth
	 * IndividualPerson27.mmCityOfBirth}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson33#mmCountryOfBirth
	 * IndividualPerson33.mmCountryOfBirth}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson33#mmProvinceOfBirth
	 * IndividualPerson33.mmProvinceOfBirth}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson33#mmCityOfBirth
	 * IndividualPerson33.mmCityOfBirth}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson34#mmCountryOfBirth
	 * IndividualPerson34.mmCountryOfBirth}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson34#mmProvinceOfBirth
	 * IndividualPerson34.mmProvinceOfBirth}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson34#mmCityOfBirth
	 * IndividualPerson34.mmCityOfBirth}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAssociationEnd mmPlaceOfBirth = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IndividualPerson5.mmCountryOfBirth, com.tools20022.repository.msg.IndividualPerson5.mmCityOfBirth,
					com.tools20022.repository.msg.IndividualPerson10.mmCountryOfBirth, com.tools20022.repository.msg.IndividualPerson20.mmCountryOfBirth, com.tools20022.repository.msg.IndividualPerson20.mmProvinceOfBirth,
					com.tools20022.repository.msg.IndividualPerson20.mmCityOfBirth, com.tools20022.repository.msg.IndividualPerson6.mmCountryOfBirth, com.tools20022.repository.msg.IndividualPerson6.mmCityOfBirth,
					com.tools20022.repository.msg.IndividualPerson11.mmCountryOfBirth, com.tools20022.repository.msg.IndividualPerson21.mmCountryOfBirth, com.tools20022.repository.msg.IndividualPerson21.mmProvinceOfBirth,
					com.tools20022.repository.msg.IndividualPerson21.mmCityOfBirth, com.tools20022.repository.msg.IndividualPerson22.mmCountryOfBirth, com.tools20022.repository.msg.IndividualPerson22.mmProvinceOfBirth,
					com.tools20022.repository.msg.IndividualPerson22.mmCityOfBirth, com.tools20022.repository.msg.IndividualPerson23.mmCountryOfBirth, com.tools20022.repository.msg.IndividualPerson23.mmProvinceOfBirth,
					com.tools20022.repository.msg.IndividualPerson23.mmCityOfBirth, com.tools20022.repository.msg.IndividualPerson24.mmCountryOfBirth, com.tools20022.repository.msg.IndividualPerson24.mmProvinceOfBirth,
					com.tools20022.repository.msg.IndividualPerson24.mmCityOfBirth, com.tools20022.repository.msg.IndividualPerson28.mmCountryOfBirth, com.tools20022.repository.msg.IndividualPerson28.mmProvinceOfBirth,
					com.tools20022.repository.msg.IndividualPerson28.mmCityOfBirth, com.tools20022.repository.msg.IndividualPerson27.mmCountryOfBirth, com.tools20022.repository.msg.IndividualPerson27.mmProvinceOfBirth,
					com.tools20022.repository.msg.IndividualPerson27.mmCityOfBirth, com.tools20022.repository.msg.IndividualPerson33.mmCountryOfBirth, com.tools20022.repository.msg.IndividualPerson33.mmProvinceOfBirth,
					com.tools20022.repository.msg.IndividualPerson33.mmCityOfBirth, com.tools20022.repository.msg.IndividualPerson34.mmCountryOfBirth, com.tools20022.repository.msg.IndividualPerson34.mmProvinceOfBirth,
					com.tools20022.repository.msg.IndividualPerson34.mmCityOfBirth);
			elementContext_lazy = () -> Person.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PlaceOfBirth";
			definition = "Place (for instance Country and City) where a person was born.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Location.mmNativePerson;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Location.mmObject();
		}
	};
	protected Max35Text profession;
	/**
	 * Name of the occupation or job of a person.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Person
	 * Person}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson5#mmProfession
	 * IndividualPerson5.mmProfession}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson10#mmProfession
	 * IndividualPerson10.mmProfession}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson20#mmProfession
	 * IndividualPerson20.mmProfession}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson6#mmProfession
	 * IndividualPerson6.mmProfession}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson11#mmProfession
	 * IndividualPerson11.mmProfession}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson21#mmProfession
	 * IndividualPerson21.mmProfession}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson22#mmProfession
	 * IndividualPerson22.mmProfession}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson23#mmProfession
	 * IndividualPerson23.mmProfession}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson24#mmProfession
	 * IndividualPerson24.mmProfession}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson28#mmProfession
	 * IndividualPerson28.mmProfession}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson27#mmProfession
	 * IndividualPerson27.mmProfession}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson33#mmProfession
	 * IndividualPerson33.mmProfession}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson34#mmProfession
	 * IndividualPerson34.mmProfession}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmProfession = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IndividualPerson5.mmProfession, com.tools20022.repository.msg.IndividualPerson10.mmProfession, com.tools20022.repository.msg.IndividualPerson20.mmProfession,
					com.tools20022.repository.msg.IndividualPerson6.mmProfession, com.tools20022.repository.msg.IndividualPerson11.mmProfession, com.tools20022.repository.msg.IndividualPerson21.mmProfession,
					com.tools20022.repository.msg.IndividualPerson22.mmProfession, com.tools20022.repository.msg.IndividualPerson23.mmProfession, com.tools20022.repository.msg.IndividualPerson24.mmProfession,
					com.tools20022.repository.msg.IndividualPerson28.mmProfession, com.tools20022.repository.msg.IndividualPerson27.mmProfession, com.tools20022.repository.msg.IndividualPerson33.mmProfession,
					com.tools20022.repository.msg.IndividualPerson34.mmProfession);
			elementContext_lazy = () -> Person.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Profession";
			definition = "Name of the occupation or job of a person.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected ResidentialStatusCode residentialStatus;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Person
	 * Person}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CountryAndResidentialStatusType1#mmResidentialStatus
	 * CountryAndResidentialStatusType1.mmResidentialStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson5#mmCountryAndResidentialStatus
	 * IndividualPerson5.mmCountryAndResidentialStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson10#mmCountryAndResidentialStatus
	 * IndividualPerson10.mmCountryAndResidentialStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson20#mmCountryAndResidentialStatus
	 * IndividualPerson20.mmCountryAndResidentialStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson6#mmCountryAndResidentialStatus
	 * IndividualPerson6.mmCountryAndResidentialStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson11#mmCountryAndResidentialStatus
	 * IndividualPerson11.mmCountryAndResidentialStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson2#mmCountryAndResidentialStatus
	 * IndividualPerson2.mmCountryAndResidentialStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson12#mmCountryAndResidentialStatus
	 * IndividualPerson12.mmCountryAndResidentialStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson9#mmCountryAndResidentialStatus
	 * IndividualPerson9.mmCountryAndResidentialStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson15#mmCountryAndResidentialStatus
	 * IndividualPerson15.mmCountryAndResidentialStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson21#mmCountryAndResidentialStatus
	 * IndividualPerson21.mmCountryAndResidentialStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson22#mmCountryAndResidentialStatus
	 * IndividualPerson22.mmCountryAndResidentialStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson23#mmCountryAndResidentialStatus
	 * IndividualPerson23.mmCountryAndResidentialStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson24#mmCountryAndResidentialStatus
	 * IndividualPerson24.mmCountryAndResidentialStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12#mmCountryAndResidentialStatus
	 * InvestmentAccountOwnershipInformation12.mmCountryAndResidentialStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CountryAndResidentialStatusType2#mmResidentialStatus
	 * CountryAndResidentialStatusType2.mmResidentialStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13#mmCountryAndResidentialStatus
	 * InvestmentAccountOwnershipInformation13.mmCountryAndResidentialStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson32#mmCountryAndResidentialStatus
	 * IndividualPerson32.mmCountryAndResidentialStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson31#mmCountryAndResidentialStatus
	 * IndividualPerson31.mmCountryAndResidentialStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15#mmCountryAndResidentialStatus
	 * InvestmentAccountOwnershipInformation15.mmCountryAndResidentialStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14#mmCountryAndResidentialStatus
	 * InvestmentAccountOwnershipInformation14.mmCountryAndResidentialStatus}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmResidentialStatus = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CountryAndResidentialStatusType1.mmResidentialStatus, com.tools20022.repository.msg.IndividualPerson5.mmCountryAndResidentialStatus,
					com.tools20022.repository.msg.IndividualPerson10.mmCountryAndResidentialStatus, com.tools20022.repository.msg.IndividualPerson20.mmCountryAndResidentialStatus,
					com.tools20022.repository.msg.IndividualPerson6.mmCountryAndResidentialStatus, com.tools20022.repository.msg.IndividualPerson11.mmCountryAndResidentialStatus,
					com.tools20022.repository.msg.IndividualPerson2.mmCountryAndResidentialStatus, com.tools20022.repository.msg.IndividualPerson12.mmCountryAndResidentialStatus,
					com.tools20022.repository.msg.IndividualPerson9.mmCountryAndResidentialStatus, com.tools20022.repository.msg.IndividualPerson15.mmCountryAndResidentialStatus,
					com.tools20022.repository.msg.IndividualPerson21.mmCountryAndResidentialStatus, com.tools20022.repository.msg.IndividualPerson22.mmCountryAndResidentialStatus,
					com.tools20022.repository.msg.IndividualPerson23.mmCountryAndResidentialStatus, com.tools20022.repository.msg.IndividualPerson24.mmCountryAndResidentialStatus,
					com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12.mmCountryAndResidentialStatus, com.tools20022.repository.msg.CountryAndResidentialStatusType2.mmResidentialStatus,
					com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13.mmCountryAndResidentialStatus, com.tools20022.repository.msg.IndividualPerson32.mmCountryAndResidentialStatus,
					com.tools20022.repository.msg.IndividualPerson31.mmCountryAndResidentialStatus, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15.mmCountryAndResidentialStatus,
					com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14.mmCountryAndResidentialStatus);
			elementContext_lazy = () -> Person.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ResidentialStatus";
			definition = "Residential status of an individual, for example, non-permanent resident.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ResidentialStatusCode.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Country> nationality;
	/**
	 * Specifies the country where a person was born or is legally accepted as
	 * belonging to the country.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Country#mmCitizen
	 * Country.mmCitizen}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Country Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Person
	 * Person}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CitizenshipInformation#mmNationality
	 * CitizenshipInformation.mmNationality}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson5#mmCitizenship
	 * IndividualPerson5.mmCitizenship}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson10#mmCitizenship
	 * IndividualPerson10.mmCitizenship}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson20#mmCitizenship
	 * IndividualPerson20.mmCitizenship}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson6#mmModifiedCitizenship
	 * IndividualPerson6.mmModifiedCitizenship}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson11#mmModifiedCitizenship
	 * IndividualPerson11.mmModifiedCitizenship}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount10#mmAccountOwnerNationality
	 * SecuritiesAccount10.mmAccountOwnerNationality}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson21#mmModifiedCitizenship
	 * IndividualPerson21.mmModifiedCitizenship}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson22#mmCitizenship
	 * IndividualPerson22.mmCitizenship}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson23#mmCitizenship
	 * IndividualPerson23.mmCitizenship}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson24#mmModifiedCitizenship
	 * IndividualPerson24.mmModifiedCitizenship}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson28#mmModifiedCitizenship
	 * IndividualPerson28.mmModifiedCitizenship}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson27#mmCitizenship
	 * IndividualPerson27.mmCitizenship}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson33#mmModifiedCitizenship
	 * IndividualPerson33.mmModifiedCitizenship}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson34#mmCitizenship
	 * IndividualPerson34.mmCitizenship}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CitizenshipInformation2#mmNationality
	 * CitizenshipInformation2.mmNationality}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAssociationEnd mmNationality = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CitizenshipInformation.mmNationality, com.tools20022.repository.msg.IndividualPerson5.mmCitizenship,
					com.tools20022.repository.msg.IndividualPerson10.mmCitizenship, com.tools20022.repository.msg.IndividualPerson20.mmCitizenship, com.tools20022.repository.msg.IndividualPerson6.mmModifiedCitizenship,
					com.tools20022.repository.msg.IndividualPerson11.mmModifiedCitizenship, com.tools20022.repository.msg.SecuritiesAccount10.mmAccountOwnerNationality,
					com.tools20022.repository.msg.IndividualPerson21.mmModifiedCitizenship, com.tools20022.repository.msg.IndividualPerson22.mmCitizenship, com.tools20022.repository.msg.IndividualPerson23.mmCitizenship,
					com.tools20022.repository.msg.IndividualPerson24.mmModifiedCitizenship, com.tools20022.repository.msg.IndividualPerson28.mmModifiedCitizenship, com.tools20022.repository.msg.IndividualPerson27.mmCitizenship,
					com.tools20022.repository.msg.IndividualPerson33.mmModifiedCitizenship, com.tools20022.repository.msg.IndividualPerson34.mmCitizenship, com.tools20022.repository.msg.CitizenshipInformation2.mmNationality);
			elementContext_lazy = () -> Person.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Nationality";
			definition = "Specifies the country where a person was born or is legally accepted as belonging to the country.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Country.mmCitizen;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Country.mmObject();
		}
	};
	protected YesNoIndicator minorIndicator;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Person
	 * Person}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CitizenshipInformation#mmMinorIndicator
	 * CitizenshipInformation.mmMinorIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CitizenshipInformation2#mmMinorIndicator
	 * CitizenshipInformation2.mmMinorIndicator}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmMinorIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CitizenshipInformation.mmMinorIndicator, com.tools20022.repository.msg.CitizenshipInformation2.mmMinorIndicator);
			elementContext_lazy = () -> Person.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MinorIndicator";
			definition = "Indicates whether the person is a legal minor. It may depend on the nationality, the domicile country or the transaction in which the person is involved.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected Max35Text businessFunctionTitle;
	/**
	 * Title of the function in an organisation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Person
	 * Person}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson10#mmBusinessFunction
	 * IndividualPerson10.mmBusinessFunction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson20#mmBusinessFunction
	 * IndividualPerson20.mmBusinessFunction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson11#mmBusinessFunction
	 * IndividualPerson11.mmBusinessFunction}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TaxAuthorisation1#mmTitle
	 * TaxAuthorisation1.mmTitle}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Contacts3#mmJobTitle
	 * Contacts3.mmJobTitle}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson21#mmBusinessFunction
	 * IndividualPerson21.mmBusinessFunction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson22#mmBusinessFunction
	 * IndividualPerson22.mmBusinessFunction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson23#mmBusinessFunction
	 * IndividualPerson23.mmBusinessFunction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson24#mmBusinessFunction
	 * IndividualPerson24.mmBusinessFunction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson28#mmBusinessFunction
	 * IndividualPerson28.mmBusinessFunction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson27#mmBusinessFunction
	 * IndividualPerson27.mmBusinessFunction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson33#mmBusinessFunction
	 * IndividualPerson33.mmBusinessFunction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson34#mmBusinessFunction
	 * IndividualPerson34.mmBusinessFunction}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmBusinessFunctionTitle = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IndividualPerson10.mmBusinessFunction, com.tools20022.repository.msg.IndividualPerson20.mmBusinessFunction,
					com.tools20022.repository.msg.IndividualPerson11.mmBusinessFunction, com.tools20022.repository.msg.TaxAuthorisation1.mmTitle, com.tools20022.repository.msg.Contacts3.mmJobTitle,
					com.tools20022.repository.msg.IndividualPerson21.mmBusinessFunction, com.tools20022.repository.msg.IndividualPerson22.mmBusinessFunction, com.tools20022.repository.msg.IndividualPerson23.mmBusinessFunction,
					com.tools20022.repository.msg.IndividualPerson24.mmBusinessFunction, com.tools20022.repository.msg.IndividualPerson28.mmBusinessFunction, com.tools20022.repository.msg.IndividualPerson27.mmBusinessFunction,
					com.tools20022.repository.msg.IndividualPerson33.mmBusinessFunction, com.tools20022.repository.msg.IndividualPerson34.mmBusinessFunction);
			elementContext_lazy = () -> Person.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BusinessFunctionTitle";
			definition = "Title of the function in an organisation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.PersonIdentification> personIdentification;
	/**
	 * Specific identification assigned to a person. It is derived from the
	 * association between Party and PartyIdentification.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PersonIdentification#mmPerson
	 * PersonIdentification.mmPerson}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.PersonIdentification
	 * PersonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Person
	 * Person}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount19#mmIndividualOwnerIdentification
	 * InvestmentAccount19.mmIndividualOwnerIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount29#mmIndividualOwnerIdentification
	 * InvestmentAccount29.mmIndividualOwnerIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount14#mmIndividualOwnerIdentification
	 * InvestmentAccount14.mmIndividualOwnerIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson7#mmIdentification
	 * IndividualPerson7.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson14#mmIdentification
	 * IndividualPerson14.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson16#mmIdentification
	 * IndividualPerson16.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson13#mmIdentification
	 * IndividualPerson13.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson17#mmIdentification
	 * IndividualPerson17.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics1#mmAccountServicerContact
	 * CashAccountCharacteristics1.mmAccountServicerContact}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingTaxIdentification1#mmTaxContact
	 * BillingTaxIdentification1.mmTaxContact}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OwnerIdentification1Choice#mmIndividualOwnerIdentification
	 * OwnerIdentification1Choice.mmIndividualOwnerIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson25#mmIdentification
	 * IndividualPerson25.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson26#mmIdentification
	 * IndividualPerson26.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics2#mmAccountServicerContact
	 * CashAccountCharacteristics2.mmAccountServicerContact}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AccountOwner1Choice#mmIndividualOwnerIdentification
	 * AccountOwner1Choice.mmIndividualOwnerIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OwnerIdentification2Choice#mmIndividualOwnerIdentification
	 * OwnerIdentification2Choice.mmIndividualOwnerIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ParticipantAndStatus1#mmParticipantContactDetails
	 * ParticipantAndStatus1.mmParticipantContactDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AccountOwner2Choice#mmIndividualOwnerIdentification
	 * AccountOwner2Choice.mmIndividualOwnerIdentification}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAssociationEnd mmPersonIdentification = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvestmentAccount19.mmIndividualOwnerIdentification, com.tools20022.repository.msg.InvestmentAccount29.mmIndividualOwnerIdentification,
					com.tools20022.repository.msg.InvestmentAccount14.mmIndividualOwnerIdentification, com.tools20022.repository.msg.IndividualPerson7.mmIdentification, com.tools20022.repository.msg.IndividualPerson14.mmIdentification,
					com.tools20022.repository.msg.IndividualPerson16.mmIdentification, com.tools20022.repository.msg.IndividualPerson13.mmIdentification, com.tools20022.repository.msg.IndividualPerson17.mmIdentification,
					com.tools20022.repository.msg.CashAccountCharacteristics1.mmAccountServicerContact, com.tools20022.repository.msg.BillingTaxIdentification1.mmTaxContact,
					com.tools20022.repository.choice.OwnerIdentification1Choice.mmIndividualOwnerIdentification, com.tools20022.repository.msg.IndividualPerson25.mmIdentification,
					com.tools20022.repository.msg.IndividualPerson26.mmIdentification, com.tools20022.repository.msg.CashAccountCharacteristics2.mmAccountServicerContact,
					com.tools20022.repository.choice.AccountOwner1Choice.mmIndividualOwnerIdentification, com.tools20022.repository.choice.OwnerIdentification2Choice.mmIndividualOwnerIdentification,
					com.tools20022.repository.msg.ParticipantAndStatus1.mmParticipantContactDetails, com.tools20022.repository.choice.AccountOwner2Choice.mmIndividualOwnerIdentification);
			elementContext_lazy = () -> Person.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PersonIdentification";
			definition = "Specific identification assigned to a person. It is derived from the association between Party and PartyIdentification.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PersonIdentification.mmPerson;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PersonIdentification.mmObject();
		}
	};
	protected EmployingPartyRole employingParty;
	/**
	 * Party which is the employer of a person.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.EmployingPartyRole#mmEmployee
	 * EmployingPartyRole.mmEmployee}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.EmployingPartyRole
	 * EmployingPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Person
	 * Person}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingContactPerson#mmEmployingParty
	 * MeetingContactPerson.mmEmployingParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ContactInformation3#mmEmployingParty
	 * ContactInformation3.mmEmployingParty}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAssociationEnd mmEmployingParty = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MeetingContactPerson.mmEmployingParty, com.tools20022.repository.msg.ContactInformation3.mmEmployingParty);
			elementContext_lazy = () -> Person.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EmployingParty";
			definition = "Party which is the employer of a person.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.EmployingPartyRole.mmEmployee;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.EmployingPartyRole.mmObject();
		}
	};
	protected MeetingAttendeeRole meetingAttendee;
	/**
	 * Specifies the meeting attendee which is an individual person.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.MeetingAttendeeRole#mmPerson
	 * MeetingAttendeeRole.mmPerson}</li>
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
	public static final MMBusinessAssociationEnd mmMeetingAttendee = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Person.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MeetingAttendee";
			definition = "Specifies the meeting attendee which is an individual person.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.MeetingAttendeeRole.mmPerson;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.MeetingAttendeeRole.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.AssignedProxyRole> relatedRole;
	/**
	 * Role performed by the person for the proxy voting process.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AssignedProxyRole#mmProxyPerson
	 * AssignedProxyRole.mmProxyPerson}</li>
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
	public static final MMBusinessAssociationEnd mmRelatedRole = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Person.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedRole";
			definition = "Role performed by the person for the proxy voting process.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.AssignedProxyRole.mmProxyPerson;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.AssignedProxyRole.mmObject();
		}
	};
	protected AssignedProxyRole preAssignedProxyPerson;
	/**
	 * Specifies the person who is the pre-assigned proxy for a meeting.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AssignedProxyRole#mmPreAssignedProxyRole
	 * AssignedProxyRole.mmPreAssignedProxyRole}</li>
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
	public static final MMBusinessAssociationEnd mmPreAssignedProxyPerson = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Person.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PreAssignedProxyPerson";
			definition = "Specifies the person who is the pre-assigned proxy for a meeting.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.AssignedProxyRole.mmPreAssignedProxyRole;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.AssignedProxyRole.mmObject();
		}
	};
	protected PersonProfile personProfile;
	/**
	 * Information to support the Know Your Customer processes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PersonProfile#mmPerson
	 * PersonProfile.mmPerson}</li>
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
	public static final MMBusinessAssociationEnd mmPersonProfile = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Person.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PersonProfile";
			definition = "Information to support the Know Your Customer processes.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.PersonProfile.mmPerson;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PersonProfile.mmObject();
		}
	};
	protected ContactPersonRole contactPersonRole;
	/**
	 * Contact role played by a person.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ContactPersonRole#mmPerson
	 * ContactPersonRole.mmPerson}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ContactPersonRole
	 * ContactPersonRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Person
	 * Person}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndContactInformation1#mmContactInformation
	 * PartyIdentificationAndContactInformation1.mmContactInformation}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAssociationEnd mmContactPersonRole = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PartyIdentificationAndContactInformation1.mmContactInformation);
			elementContext_lazy = () -> Person.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ContactPersonRole";
			definition = "Contact role played by a person.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.ContactPersonRole.mmPerson;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ContactPersonRole.mmObject();
		}
	};
	protected Household household;
	/**
	 * Specifies the members of a household in relation with the ownership of an
	 * account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Household#mmMember
	 * Household.mmMember}</li>
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
	public static final MMBusinessAssociationEnd mmHousehold = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Person.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Household";
			definition = "Specifies the members of a household in relation with the ownership of an account.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Household.mmMember;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Household.mmObject();
		}
	};
	protected CivilStatusCode civilStatus;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Person
	 * Person}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson28#mmCivilStatus
	 * IndividualPerson28.mmCivilStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson27#mmCivilStatus
	 * IndividualPerson27.mmCivilStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson33#mmCivilStatus
	 * IndividualPerson33.mmCivilStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson34#mmCivilStatus
	 * IndividualPerson34.mmCivilStatus}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmCivilStatus = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IndividualPerson28.mmCivilStatus, com.tools20022.repository.msg.IndividualPerson27.mmCivilStatus,
					com.tools20022.repository.msg.IndividualPerson33.mmCivilStatus, com.tools20022.repository.msg.IndividualPerson34.mmCivilStatus);
			elementContext_lazy = () -> Person.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CivilStatus";
			definition = "Specifies the civil status of a person.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CivilStatusCode.mmObject();
		}
	};
	protected ISODateTime deathDate;
	/**
	 * Date on which a person is dead.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Person
	 * Person}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson28#mmDeathDate
	 * IndividualPerson28.mmDeathDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson27#mmDeathDate
	 * IndividualPerson27.mmDeathDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson33#mmDeathDate
	 * IndividualPerson33.mmDeathDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson34#mmDeathDate
	 * IndividualPerson34.mmDeathDate}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmDeathDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IndividualPerson28.mmDeathDate, com.tools20022.repository.msg.IndividualPerson27.mmDeathDate, com.tools20022.repository.msg.IndividualPerson33.mmDeathDate,
					com.tools20022.repository.msg.IndividualPerson34.mmDeathDate);
			elementContext_lazy = () -> Person.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DeathDate";
			definition = "Date on which a person is dead.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Person";
				definition = "Human entity, as distinguished from a corporate entity (which is sometimes referred to as an 'artificial person').";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Country.mmCitizen, com.tools20022.repository.entity.Location.mmNativePerson, com.tools20022.repository.entity.PersonIdentification.mmPerson,
						com.tools20022.repository.entity.EmployingPartyRole.mmEmployee, com.tools20022.repository.entity.ContactPersonRole.mmPerson, com.tools20022.repository.entity.AssignedProxyRole.mmProxyPerson,
						com.tools20022.repository.entity.AssignedProxyRole.mmPreAssignedProxyRole, com.tools20022.repository.entity.MeetingAttendeeRole.mmPerson, com.tools20022.repository.entity.PersonProfile.mmPerson,
						com.tools20022.repository.entity.Household.mmMember);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvestmentAccountOwnershipInformation5.mmIndividualPerson, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation2.mmIndividualPerson,
						com.tools20022.repository.choice.Party14Choice.mmIndividualPerson, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation3.mmIndividualPerson,
						com.tools20022.repository.msg.InvestmentAccountOwnershipInformation4.mmIndividualPerson, com.tools20022.repository.msg.TransferOut3.mmInvestor,
						com.tools20022.repository.msg.PEPISATransfer7.mmPrimaryIndividualInvestor, com.tools20022.repository.msg.PEPISATransfer7.mmSecondaryIndividualInvestor,
						com.tools20022.repository.msg.PEPISATransfer7.mmOtherIndividualInvestor, com.tools20022.repository.msg.PEPISATransfer11.mmPrimaryIndividualInvestor,
						com.tools20022.repository.msg.PEPISATransfer11.mmSecondaryIndividualInvestor, com.tools20022.repository.msg.PEPISATransfer11.mmOtherIndividualInvestor,
						com.tools20022.repository.msg.ISATransfer9.mmPrimaryIndividualInvestor, com.tools20022.repository.msg.ISATransfer9.mmSecondaryIndividualInvestor, com.tools20022.repository.msg.ISATransfer9.mmOtherIndividualInvestor,
						com.tools20022.repository.msg.RedemptionOrder3.mmBeneficiaryDetails, com.tools20022.repository.msg.RedemptionOrder5.mmBeneficiaryDetails, com.tools20022.repository.msg.RedemptionExecution3.mmBeneficiaryDetails,
						com.tools20022.repository.msg.RedemptionExecution5.mmBeneficiaryDetails, com.tools20022.repository.msg.RedemptionOrder7.mmBeneficiaryDetails,
						com.tools20022.repository.msg.RedemptionMultipleOrder2.mmBeneficiaryDetails, com.tools20022.repository.msg.RedemptionMultipleOrder3.mmBeneficiaryDetails,
						com.tools20022.repository.msg.RedemptionMultipleExecution2.mmBeneficiaryDetails, com.tools20022.repository.msg.RedemptionMultipleExecution3.mmBeneficiaryDetails,
						com.tools20022.repository.msg.RedemptionMultipleOrder4.mmBeneficiaryDetails, com.tools20022.repository.msg.SubscriptionOrder3.mmBeneficiaryDetails,
						com.tools20022.repository.msg.SubscriptionOrder5.mmBeneficiaryDetails, com.tools20022.repository.msg.SubscriptionExecution3.mmBeneficiaryDetails,
						com.tools20022.repository.msg.SubscriptionExecution5.mmBeneficiaryDetails, com.tools20022.repository.msg.SubscriptionOrder7.mmBeneficiaryDetails,
						com.tools20022.repository.msg.SubscriptionMultipleOrder2.mmBeneficiaryDetails, com.tools20022.repository.msg.SubscriptionMultipleOrder3.mmBeneficiaryDetails,
						com.tools20022.repository.msg.SubscriptionMultipleExecution2.mmBeneficiaryDetails, com.tools20022.repository.msg.SubscriptionMultipleExecution3.mmBeneficiaryDetails,
						com.tools20022.repository.msg.SubscriptionMultipleOrder4.mmBeneficiaryDetails, com.tools20022.repository.msg.Proxy.mmPreassignedProxy, com.tools20022.repository.msg.MeetingNotice1.mmContactPersonDetails,
						com.tools20022.repository.msg.MeetingNotice2.mmContactPersonDetails, com.tools20022.repository.msg.MeetingNotice3.mmContactPersonDetails, com.tools20022.repository.msg.VotingPartyAndInstruction.mmPersonDetail,
						com.tools20022.repository.msg.SecurityPosition1.mmProxy, com.tools20022.repository.msg.Instruction1.mmMeetingAttendee, com.tools20022.repository.msg.Instruction2.mmMeetingAttendee,
						com.tools20022.repository.msg.MemberDetails.mmContactReference, com.tools20022.repository.msg.MemberDetails1.mmContactReference, com.tools20022.repository.msg.RedemptionExecution10.mmBeneficiaryDetails,
						com.tools20022.repository.msg.RedemptionOrder9.mmBeneficiaryDetails, com.tools20022.repository.msg.BeneficiaryInformation2.mmBeneficiaryIdentification,
						com.tools20022.repository.msg.SubscriptionExecution7.mmBeneficiaryDetails, com.tools20022.repository.msg.BeneficiaryInformation1.mmBeneficiaryIdentification,
						com.tools20022.repository.msg.SubscriptionOrder9.mmBeneficiaryDetails, com.tools20022.repository.msg.TransferOut4.mmInvestor, com.tools20022.repository.msg.ContactInformation3.mmContactPerson,
						com.tools20022.repository.msg.Member1.mmContactReference, com.tools20022.repository.msg.Member2.mmContactReference, com.tools20022.repository.choice.Party15Choice.mmIndividualPerson,
						com.tools20022.repository.choice.Party16Choice.mmIndividualPerson, com.tools20022.repository.msg.ISATransfer12.mmPrimaryIndividualInvestor, com.tools20022.repository.msg.ISATransfer12.mmSecondaryIndividualInvestor,
						com.tools20022.repository.msg.ISATransfer12.mmOtherIndividualInvestor, com.tools20022.repository.msg.ISATransfer19.mmPrimaryIndividualInvestor,
						com.tools20022.repository.msg.ISATransfer19.mmSecondaryIndividualInvestor, com.tools20022.repository.msg.ISATransfer19.mmOtherIndividualInvestor, com.tools20022.repository.msg.Instruction3.mmMeetingAttendee,
						com.tools20022.repository.msg.MeetingNotice4.mmContactPersonDetails, com.tools20022.repository.choice.Party24Choice.mmIndividualPerson, com.tools20022.repository.choice.Party23Choice.mmIndividualPerson,
						com.tools20022.repository.choice.Party30Choice.mmIndividualPerson, com.tools20022.repository.msg.IndividualPerson28.mmFamilyInformation, com.tools20022.repository.choice.Party31Choice.mmIndividualPerson,
						com.tools20022.repository.msg.IndividualPerson27.mmFamilyInformation, com.tools20022.repository.msg.ISATransfer24.mmPrimaryIndividualInvestor,
						com.tools20022.repository.msg.ISATransfer24.mmSecondaryIndividualInvestor, com.tools20022.repository.msg.ISATransfer24.mmOtherIndividualInvestor,
						com.tools20022.repository.msg.RedemptionMultipleExecution5.mmBeneficiaryDetails, com.tools20022.repository.msg.RedemptionMultipleOrder6.mmBeneficiaryDetails,
						com.tools20022.repository.msg.SubscriptionMultipleOrder6.mmBeneficiaryDetails, com.tools20022.repository.msg.SubscriptionMultipleExecution5.mmBeneficiaryDetails,
						com.tools20022.repository.msg.SubscriptionExecution12.mmBeneficiaryDetails, com.tools20022.repository.msg.SubscriptionOrder15.mmBeneficiaryDetails,
						com.tools20022.repository.msg.RedemptionOrder15.mmBeneficiaryDetails, com.tools20022.repository.choice.Party33Choice.mmIndividualPerson, com.tools20022.repository.msg.IndividualPerson33.mmFamilyInformation,
						com.tools20022.repository.choice.Party32Choice.mmIndividualPerson, com.tools20022.repository.msg.RedemptionExecution16.mmBeneficiaryDetails,
						com.tools20022.repository.msg.SecuritiesTransactionReport4.mmExecutingPerson, com.tools20022.repository.msg.IndividualPerson34.mmFamilyInformation);
				superType_lazy = () -> Party.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Person.mmGender, com.tools20022.repository.entity.Person.mmLanguage, com.tools20022.repository.entity.Person.mmBirthDate,
						com.tools20022.repository.entity.Person.mmPlaceOfBirth, com.tools20022.repository.entity.Person.mmProfession, com.tools20022.repository.entity.Person.mmResidentialStatus,
						com.tools20022.repository.entity.Person.mmNationality, com.tools20022.repository.entity.Person.mmMinorIndicator, com.tools20022.repository.entity.Person.mmBusinessFunctionTitle,
						com.tools20022.repository.entity.Person.mmPersonIdentification, com.tools20022.repository.entity.Person.mmEmployingParty, com.tools20022.repository.entity.Person.mmMeetingAttendee,
						com.tools20022.repository.entity.Person.mmRelatedRole, com.tools20022.repository.entity.Person.mmPreAssignedProxyPerson, com.tools20022.repository.entity.Person.mmPersonProfile,
						com.tools20022.repository.entity.Person.mmContactPersonRole, com.tools20022.repository.entity.Person.mmHousehold, com.tools20022.repository.entity.Person.mmCivilStatus,
						com.tools20022.repository.entity.Person.mmDeathDate);
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

	public GenderCode getGender() {
		return gender;
	}

	public void setGender(GenderCode gender) {
		this.gender = gender;
	}

	public LanguageCode getLanguage() {
		return language;
	}

	public void setLanguage(LanguageCode language) {
		this.language = language;
	}

	public ISODateTime getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(ISODateTime birthDate) {
		this.birthDate = birthDate;
	}

	public Location getPlaceOfBirth() {
		return placeOfBirth;
	}

	public void setPlaceOfBirth(com.tools20022.repository.entity.Location placeOfBirth) {
		this.placeOfBirth = placeOfBirth;
	}

	public Max35Text getProfession() {
		return profession;
	}

	public void setProfession(Max35Text profession) {
		this.profession = profession;
	}

	public ResidentialStatusCode getResidentialStatus() {
		return residentialStatus;
	}

	public void setResidentialStatus(ResidentialStatusCode residentialStatus) {
		this.residentialStatus = residentialStatus;
	}

	public List<Country> getNationality() {
		return nationality;
	}

	public void setNationality(List<com.tools20022.repository.entity.Country> nationality) {
		this.nationality = nationality;
	}

	public YesNoIndicator getMinorIndicator() {
		return minorIndicator;
	}

	public void setMinorIndicator(YesNoIndicator minorIndicator) {
		this.minorIndicator = minorIndicator;
	}

	public Max35Text getBusinessFunctionTitle() {
		return businessFunctionTitle;
	}

	public void setBusinessFunctionTitle(Max35Text businessFunctionTitle) {
		this.businessFunctionTitle = businessFunctionTitle;
	}

	public List<PersonIdentification> getPersonIdentification() {
		return personIdentification;
	}

	public void setPersonIdentification(List<com.tools20022.repository.entity.PersonIdentification> personIdentification) {
		this.personIdentification = personIdentification;
	}

	public EmployingPartyRole getEmployingParty() {
		return employingParty;
	}

	public void setEmployingParty(com.tools20022.repository.entity.EmployingPartyRole employingParty) {
		this.employingParty = employingParty;
	}

	public MeetingAttendeeRole getMeetingAttendee() {
		return meetingAttendee;
	}

	public void setMeetingAttendee(com.tools20022.repository.entity.MeetingAttendeeRole meetingAttendee) {
		this.meetingAttendee = meetingAttendee;
	}

	public List<AssignedProxyRole> getRelatedRole() {
		return relatedRole;
	}

	public void setRelatedRole(List<com.tools20022.repository.entity.AssignedProxyRole> relatedRole) {
		this.relatedRole = relatedRole;
	}

	public AssignedProxyRole getPreAssignedProxyPerson() {
		return preAssignedProxyPerson;
	}

	public void setPreAssignedProxyPerson(com.tools20022.repository.entity.AssignedProxyRole preAssignedProxyPerson) {
		this.preAssignedProxyPerson = preAssignedProxyPerson;
	}

	public PersonProfile getPersonProfile() {
		return personProfile;
	}

	public void setPersonProfile(com.tools20022.repository.entity.PersonProfile personProfile) {
		this.personProfile = personProfile;
	}

	public ContactPersonRole getContactPersonRole() {
		return contactPersonRole;
	}

	public void setContactPersonRole(com.tools20022.repository.entity.ContactPersonRole contactPersonRole) {
		this.contactPersonRole = contactPersonRole;
	}

	public Household getHousehold() {
		return household;
	}

	public void setHousehold(com.tools20022.repository.entity.Household household) {
		this.household = household;
	}

	public CivilStatusCode getCivilStatus() {
		return civilStatus;
	}

	public void setCivilStatus(CivilStatusCode civilStatus) {
		this.civilStatus = civilStatus;
	}

	public ISODateTime getDeathDate() {
		return deathDate;
	}

	public void setDeathDate(ISODateTime deathDate) {
		this.deathDate = deathDate;
	}
}