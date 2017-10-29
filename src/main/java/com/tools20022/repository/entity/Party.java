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
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.MoneyLaunderingCheckCode;
import com.tools20022.repository.entity.RolePlayer;
import com.tools20022.repository.msg.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Entity involved in an activity.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Party" src="doc-files/Party.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Party#ContactPoint
 * Party.ContactPoint}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Party#Identification
 * Party.Identification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Party#MoneyLaunderingCheck
 * Party.MoneyLaunderingCheck}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Party#TaxationConditions
 * Party.TaxationConditions}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Party#Domicile
 * Party.Domicile}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Party#Residence
 * Party.Residence}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Party#PowerOfAttorney
 * Party.PowerOfAttorney}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Party#Location
 * Party.Location}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Party#CloseLinkSecurity
 * Party.CloseLinkSecurity}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Security#CloseLink
 * Security.CloseLink}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ContactPoint#RelatedParty
 * ContactPoint.RelatedParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#IdentifiedParty
 * PartyIdentificationInformation.IdentifiedParty}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Location#DomiciledParty
 * Location.DomiciledParty}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Location#Party
 * Location.Party}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Location#TaxableParty
 * Location.TaxableParty}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#TaxableParty
 * Tax.TaxableParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PowerOfAttorney#AuthorisedParty
 * PowerOfAttorney.AuthorisedParty}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation6#Party
 * InvestmentAccountOwnershipInformation6.Party}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation7#Party
 * InvestmentAccountOwnershipInformation7.Party}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OperationMandate1#MandateHolder
 * OperationMandate1.MandateHolder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyAndAuthorisation1#PartyOrGroup
 * PartyAndAuthorisation1.PartyOrGroup}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyAndAuthorisation3#PartyOrGroup
 * PartyAndAuthorisation3.PartyOrGroup}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Report2#NonClearingMember
 * Report2.NonClearingMember}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NetPosition1#Depository
 * NetPosition1.Depository}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation8#Party
 * InvestmentAccountOwnershipInformation8.Party}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation9#Party
 * InvestmentAccountOwnershipInformation9.Party}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation10#Party
 * InvestmentAccountOwnershipInformation10.Party}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation11#Party
 * InvestmentAccountOwnershipInformation11.Party}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Report5#NonClearingMember
 * Report5.NonClearingMember}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12#Party
 * InvestmentAccountOwnershipInformation12.Party}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13#Party
 * InvestmentAccountOwnershipInformation13.Party}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15#Party
 * InvestmentAccountOwnershipInformation15.Party}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14#Party
 * InvestmentAccountOwnershipInformation14.Party}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Organisation Organisation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Person Person}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.RolePlayer
 * RolePlayer}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CountryAndResidentialStatusType1
 * CountryAndResidentialStatusType1}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Party14Choice Party14Choice}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount93
 * PartyIdentificationAndAccount93}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Counterparty1Choice
 * Counterparty1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Counterparty4Choice
 * Counterparty4Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount81
 * PartyIdentificationAndAccount81}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount86
 * PartyIdentificationAndAccount86}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Counterparty7Choice
 * Counterparty7Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount88
 * PartyIdentificationAndAccount88}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount92
 * PartyIdentificationAndAccount92}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Counterparty2Choice
 * Counterparty2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Counterparty3Choice
 * Counterparty3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Counterparty6Choice
 * Counterparty6Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.TradingPartyCapacity1Choice
 * TradingPartyCapacity1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.TradingPartyCapacity2Choice
 * TradingPartyCapacity2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyAndSignature1
 * PartyAndSignature1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyAndAuthorisation1
 * PartyAndAuthorisation1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyAndAuthorisation3
 * PartyAndAuthorisation3}</li>
 * <li>{@linkplain com.tools20022.repository.choice.AddressOrParty1Choice
 * AddressOrParty1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyAndType1 PartyAndType1}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Counterparty5Choice
 * Counterparty5Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyAndAccountIdentificationAndContactInformation1
 * PartyAndAccountIdentificationAndContactInformation1}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Counterparty8Choice
 * Counterparty8Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Party15Choice Party15Choice}
 * </li>
 * <li>{@linkplain com.tools20022.repository.choice.Party16Choice Party16Choice}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SingleQualifiedPartyIdentification1
 * SingleQualifiedPartyIdentification1}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Party24Choice Party24Choice}
 * </li>
 * <li>{@linkplain com.tools20022.repository.choice.Party23Choice Party23Choice}
 * </li>
 * <li>{@linkplain com.tools20022.repository.choice.Counterparty9Choice
 * Counterparty9Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount108
 * PartyIdentificationAndAccount108}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount109
 * PartyIdentificationAndAccount109}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Party30Choice Party30Choice}
 * </li>
 * <li>{@linkplain com.tools20022.repository.choice.Party31Choice Party31Choice}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CountryAndResidentialStatusType2
 * CountryAndResidentialStatusType2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount125
 * PartyIdentificationAndAccount125}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount135
 * PartyIdentificationAndAccount135}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount137
 * PartyIdentificationAndAccount137}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Counterparty10Choice
 * Counterparty10Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Party33Choice Party33Choice}
 * </li>
 * <li>{@linkplain com.tools20022.repository.choice.Party32Choice Party32Choice}
 * </li>
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
 * "Party"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Entity involved in an activity."</li>
 * </ul>
 */
public class Party extends RolePlayer {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Number, physical or virtual address, used for communication.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ContactPoint#RelatedParty
	 * ContactPoint.RelatedParty}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LocalMarketAnnex#LocalOrderDesk
	 * LocalMarketAnnex.LocalOrderDesk}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LocalMarketAnnex2#LocalOrderDesk
	 * LocalMarketAnnex2.LocalOrderDesk}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundProcessingPassport1#FundManagementCompany
	 * FundProcessingPassport1.FundManagementCompany}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation2#PrimaryCommunicationAddress
	 * Organisation2.PrimaryCommunicationAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation2#SecondaryCommunicationAddress
	 * Organisation2.SecondaryCommunicationAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation3#PrimaryCommunicationAddress
	 * Organisation3.PrimaryCommunicationAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation3#SecondaryCommunicationAddress
	 * Organisation3.SecondaryCommunicationAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification32#ContactDetails
	 * PartyIdentification32.ContactDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification43#ContactDetails
	 * PartyIdentification43.ContactDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyTextInformation1#PartyContactDetails
	 * PartyTextInformation1.PartyContactDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyTextInformation2#PartyContactDetails
	 * PartyTextInformation2.PartyContactDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyTextInformation3#PartyContactDetails
	 * PartyTextInformation3.PartyContactDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyTextInformation4#PartyContactDetails
	 * PartyTextInformation4.PartyContactDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyTextInformation5#PartyContactDetails
	 * PartyTextInformation5.PartyContactDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification41#ContactDetails
	 * PartyIdentification41.ContactDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification40#ContactDetails
	 * PartyIdentification40.ContactDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExtendOrPayQuery1#BankContact
	 * ExtendOrPayQuery1.BankContact}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification42#ContactDetails
	 * PartyIdentification42.ContactDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GeneralInformation1#ContactInformation
	 * GeneralInformation1.ContactInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GeneralInformation4#ContactInformation
	 * GeneralInformation4.ContactInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GeneralInformation2#ContactInformation
	 * GeneralInformation2.ContactInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyAndAccountIdentificationAndContactInformation1#ContactInformation
	 * PartyAndAccountIdentificationAndContactInformation1.ContactInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification45#ContactDetails
	 * PartyIdentification45.ContactDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ContactIdentificationAndAddress#CommunicationAddress
	 * ContactIdentificationAndAddress.CommunicationAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MemberDetails#CommunicationAddress
	 * MemberDetails.CommunicationAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MemberDetails1#CommunicationAddress
	 * MemberDetails1.CommunicationAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ContactDetails3#PreferredMethod
	 * ContactDetails3.PreferredMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification58#ContactDetails
	 * PartyIdentification58.ContactDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountTax1#NonResidenceCountry
	 * AccountTax1.NonResidenceCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Intermediary16#CommunicationInformation
	 * Intermediary16.CommunicationInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Member1#CommunicationAddress
	 * Member1.CommunicationAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Member2#CommunicationAddress
	 * Member2.CommunicationAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification77#ContactDetails
	 * PartyIdentification77.ContactDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification112#ContactDetails
	 * PartyIdentification112.ContactDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrganisationIdentification28#ContactDetails
	 * OrganisationIdentification28.ContactDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GeneralInformation5#ContactInformation
	 * GeneralInformation5.ContactInformation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Party
	 * Party}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContactPoint"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number, physical or virtual address, used for communication."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ContactPoint = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.LocalMarketAnnex.LocalOrderDesk, com.tools20022.repository.msg.LocalMarketAnnex2.LocalOrderDesk,
					com.tools20022.repository.msg.FundProcessingPassport1.FundManagementCompany, com.tools20022.repository.msg.Organisation2.PrimaryCommunicationAddress,
					com.tools20022.repository.msg.Organisation2.SecondaryCommunicationAddress, com.tools20022.repository.msg.Organisation3.PrimaryCommunicationAddress,
					com.tools20022.repository.msg.Organisation3.SecondaryCommunicationAddress, com.tools20022.repository.msg.PartyIdentification32.ContactDetails, com.tools20022.repository.msg.PartyIdentification43.ContactDetails,
					com.tools20022.repository.msg.PartyTextInformation1.PartyContactDetails, com.tools20022.repository.msg.PartyTextInformation2.PartyContactDetails, com.tools20022.repository.msg.PartyTextInformation3.PartyContactDetails,
					com.tools20022.repository.msg.PartyTextInformation4.PartyContactDetails, com.tools20022.repository.msg.PartyTextInformation5.PartyContactDetails, com.tools20022.repository.msg.PartyIdentification41.ContactDetails,
					com.tools20022.repository.msg.PartyIdentification40.ContactDetails, com.tools20022.repository.msg.ExtendOrPayQuery1.BankContact, com.tools20022.repository.msg.PartyIdentification42.ContactDetails,
					com.tools20022.repository.msg.GeneralInformation1.ContactInformation, com.tools20022.repository.msg.GeneralInformation4.ContactInformation, com.tools20022.repository.msg.GeneralInformation2.ContactInformation,
					com.tools20022.repository.msg.PartyAndAccountIdentificationAndContactInformation1.ContactInformation, com.tools20022.repository.msg.PartyIdentification45.ContactDetails,
					com.tools20022.repository.msg.ContactIdentificationAndAddress.CommunicationAddress, com.tools20022.repository.msg.MemberDetails.CommunicationAddress, com.tools20022.repository.msg.MemberDetails1.CommunicationAddress,
					com.tools20022.repository.msg.ContactDetails3.PreferredMethod, com.tools20022.repository.msg.PartyIdentification58.ContactDetails, com.tools20022.repository.msg.AccountTax1.NonResidenceCountry,
					com.tools20022.repository.msg.Intermediary16.CommunicationInformation, com.tools20022.repository.msg.Member1.CommunicationAddress, com.tools20022.repository.msg.Member2.CommunicationAddress,
					com.tools20022.repository.msg.PartyIdentification77.ContactDetails, com.tools20022.repository.msg.PartyIdentification112.ContactDetails, com.tools20022.repository.msg.OrganisationIdentification28.ContactDetails,
					com.tools20022.repository.msg.GeneralInformation5.ContactInformation);
			elementContext_lazy = () -> Party.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ContactPoint";
			definition = "Number, physical or virtual address, used for communication.";
			minOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.ContactPoint.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ContactPoint.RelatedParty;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specific identification assigned to a party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#IdentifiedParty
	 * PartyIdentificationInformation.IdentifiedParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation
	 * PartyIdentificationInformation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} = List of 2363 elements</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Party
	 * Party}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specific identification assigned to a party."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Identification = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> ListBuilderForParty_00.addElems(new ArrayList<>());
			elementContext_lazy = () -> Party.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Specific identification assigned to a party.";
			minOccurs = 1;
			type_lazy = () -> PartyIdentificationInformation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PartyIdentificationInformation.IdentifiedParty;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Status of an identity check to prevent money laundering. This includes
	 * the counter-terrorism check.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.MoneyLaunderingCheckCode
	 * MoneyLaunderingCheckCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation5#MoneyLaunderingCheck
	 * InvestmentAccountOwnershipInformation5.MoneyLaunderingCheck}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation5#ExtendedMoneyLaunderingCheck
	 * InvestmentAccountOwnershipInformation5.ExtendedMoneyLaunderingCheck}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation2#MoneyLaunderingCheck
	 * InvestmentAccountOwnershipInformation2.MoneyLaunderingCheck}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation2#ExtendedMoneyLaunderingCheck
	 * InvestmentAccountOwnershipInformation2.ExtendedMoneyLaunderingCheck}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MoneyLaunderingCheck1Choice#Code
	 * MoneyLaunderingCheck1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MoneyLaunderingCheck1Choice#Proprietary
	 * MoneyLaunderingCheck1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation6#MoneyLaunderingCheck
	 * InvestmentAccountOwnershipInformation6.MoneyLaunderingCheck}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation3#MoneyLaunderingCheck
	 * InvestmentAccountOwnershipInformation3.MoneyLaunderingCheck}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation3#ExtendedMoneyLaunderingCheck
	 * InvestmentAccountOwnershipInformation3.ExtendedMoneyLaunderingCheck}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation4#MoneyLaunderingCheck
	 * InvestmentAccountOwnershipInformation4.MoneyLaunderingCheck}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation4#ExtendedMoneyLaunderingCheck
	 * InvestmentAccountOwnershipInformation4.ExtendedMoneyLaunderingCheck}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation7#MoneyLaunderingCheck
	 * InvestmentAccountOwnershipInformation7.MoneyLaunderingCheck}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrderParameters1#MoneyLaunderingStatus
	 * OrderParameters1.MoneyLaunderingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.List1#MoneyLaunderingStatus
	 * List1.MoneyLaunderingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation8#MoneyLaunderingCheck
	 * InvestmentAccountOwnershipInformation8.MoneyLaunderingCheck}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation9#MoneyLaunderingCheck
	 * InvestmentAccountOwnershipInformation9.MoneyLaunderingCheck}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation10#MoneyLaunderingCheck
	 * InvestmentAccountOwnershipInformation10.MoneyLaunderingCheck}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation11#MoneyLaunderingCheck
	 * InvestmentAccountOwnershipInformation11.MoneyLaunderingCheck}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12#MoneyLaunderingCheck
	 * InvestmentAccountOwnershipInformation12.MoneyLaunderingCheck}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13#MoneyLaunderingCheck
	 * InvestmentAccountOwnershipInformation13.MoneyLaunderingCheck}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15#MoneyLaunderingCheck
	 * InvestmentAccountOwnershipInformation15.MoneyLaunderingCheck}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14#MoneyLaunderingCheck
	 * InvestmentAccountOwnershipInformation14.MoneyLaunderingCheck}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Party
	 * Party}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MoneyLaunderingCheck"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Status of an identity check to prevent money laundering. This includes the counter-terrorism check."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute MoneyLaunderingCheck = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvestmentAccountOwnershipInformation5.MoneyLaunderingCheck, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation5.ExtendedMoneyLaunderingCheck,
					com.tools20022.repository.msg.InvestmentAccountOwnershipInformation2.MoneyLaunderingCheck, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation2.ExtendedMoneyLaunderingCheck,
					com.tools20022.repository.choice.MoneyLaunderingCheck1Choice.Code, com.tools20022.repository.choice.MoneyLaunderingCheck1Choice.Proprietary,
					com.tools20022.repository.msg.InvestmentAccountOwnershipInformation6.MoneyLaunderingCheck, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation3.MoneyLaunderingCheck,
					com.tools20022.repository.msg.InvestmentAccountOwnershipInformation3.ExtendedMoneyLaunderingCheck, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation4.MoneyLaunderingCheck,
					com.tools20022.repository.msg.InvestmentAccountOwnershipInformation4.ExtendedMoneyLaunderingCheck, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation7.MoneyLaunderingCheck,
					com.tools20022.repository.msg.OrderParameters1.MoneyLaunderingStatus, com.tools20022.repository.msg.List1.MoneyLaunderingStatus, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation8.MoneyLaunderingCheck,
					com.tools20022.repository.msg.InvestmentAccountOwnershipInformation9.MoneyLaunderingCheck, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation10.MoneyLaunderingCheck,
					com.tools20022.repository.msg.InvestmentAccountOwnershipInformation11.MoneyLaunderingCheck, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12.MoneyLaunderingCheck,
					com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13.MoneyLaunderingCheck, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15.MoneyLaunderingCheck,
					com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14.MoneyLaunderingCheck);
			elementContext_lazy = () -> Party.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MoneyLaunderingCheck";
			definition = "Status of an identity check to prevent money laundering. This includes the counter-terrorism check.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> MoneyLaunderingCheckCode.mmObject();
		}
	};
	/**
	 * Taxation parameters which apply to an individual person or to an
	 * organisation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Tax#TaxableParty
	 * Tax.TaxableParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax8#Country Tax8.Country}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax17#Country
	 * Tax17.Country}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax16#Country
	 * Tax16.Country}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax14#Country
	 * Tax14.Country}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax18#Country
	 * Tax18.Country}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax19#Country
	 * Tax19.Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxIdentification1#TaxationCountry
	 * TaxIdentification1.TaxationCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxIdentification2#IssuerCountry
	 * TaxIdentification2.IssuerCountry}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax32#Country
	 * Tax32.Country}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax30#Country
	 * Tax30.Country}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax31#Country
	 * Tax31.Country}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Party
	 * Party}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxationConditions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Taxation parameters which apply to an individual person or to an organisation."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd TaxationConditions = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Tax8.Country, com.tools20022.repository.msg.Tax17.Country, com.tools20022.repository.msg.Tax16.Country, com.tools20022.repository.msg.Tax14.Country,
					com.tools20022.repository.msg.Tax18.Country, com.tools20022.repository.msg.Tax19.Country, com.tools20022.repository.msg.TaxIdentification1.TaxationCountry, com.tools20022.repository.msg.TaxIdentification2.IssuerCountry,
					com.tools20022.repository.msg.Tax32.Country, com.tools20022.repository.msg.Tax30.Country, com.tools20022.repository.msg.Tax31.Country);
			elementContext_lazy = () -> Party.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TaxationConditions";
			definition = "Taxation parameters which apply to an individual person or to an organisation.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Tax.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Tax.TaxableParty;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Location in which a person is permanently domiciled (the place of a
	 * person's permanent home).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Location#DomiciledParty
	 * Location.DomiciledParty}</li>
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
	 * {@linkplain com.tools20022.repository.msg.BeneficialOwner1#DomicileCountry
	 * BeneficialOwner1.DomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BeneficialOwner2#DomicileCountry
	 * BeneficialOwner2.DomicileCountry}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Party
	 * Party}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Domicile"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Location in which a person is permanently domiciled (the place of a person's permanent home)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Domicile = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.BeneficialOwner1.DomicileCountry, com.tools20022.repository.msg.BeneficialOwner2.DomicileCountry);
			elementContext_lazy = () -> Party.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Domicile";
			definition = "Location in which a person is permanently domiciled (the place of a person's permanent home).";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Location.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Location.DomiciledParty;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Location from which the affairs of a company are directed or location in
	 * which a person resides (the place of a person's home).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Location#Party
	 * Location.Party}</li>
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
	 * {@linkplain com.tools20022.repository.msg.ReportSpecification4#BuyerCountry
	 * ReportSpecification4.BuyerCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportSpecification4#SellerCountry
	 * ReportSpecification4.SellerCountry}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Party
	 * Party}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Residence"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Location from which the affairs of a company are directed or location in which a person resides (the place of a person's home)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Residence = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ReportSpecification4.BuyerCountry, com.tools20022.repository.msg.ReportSpecification4.SellerCountry);
			elementContext_lazy = () -> Party.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Residence";
			definition = "Location from which the affairs of a company are directed or location in which a person resides (the place of a person's home).";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.Location.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Location.Party;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Power of attorney which is held by the party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PowerOfAttorney#AuthorisedParty
	 * PowerOfAttorney.AuthorisedParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PowerOfAttorney
	 * PowerOfAttorney}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Party
	 * Party}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PowerOfAttorney"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Power of attorney which is held by the party."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd PowerOfAttorney = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Party.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PowerOfAttorney";
			definition = "Power of attorney which is held by the party.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.PowerOfAttorney.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PowerOfAttorney.AuthorisedParty;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Location of the taxable party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Location#TaxableParty
	 * Location.TaxableParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Location Location}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Party
	 * Party}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Location"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Location of the taxable party."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Location = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Party.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Location";
			definition = "Location of the taxable party.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Location.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Location.TaxableParty;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Security for which a close link with a party is identified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Security#CloseLink
	 * Security.CloseLink}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Security Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Party
	 * Party}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CloseLinkSecurity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Security for which a close link with a party is identified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CloseLinkSecurity = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Party.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CloseLinkSecurity";
			definition = "Security for which a close link with a party is identified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Security.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Security.CloseLink;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Party";
				definition = "Entity involved in an activity.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Security.CloseLink, com.tools20022.repository.entity.ContactPoint.RelatedParty,
						com.tools20022.repository.entity.PartyIdentificationInformation.IdentifiedParty, com.tools20022.repository.entity.Location.DomiciledParty, com.tools20022.repository.entity.Location.Party,
						com.tools20022.repository.entity.Location.TaxableParty, com.tools20022.repository.entity.Tax.TaxableParty, com.tools20022.repository.entity.PowerOfAttorney.AuthorisedParty);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvestmentAccountOwnershipInformation6.Party, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation7.Party,
						com.tools20022.repository.msg.OperationMandate1.MandateHolder, com.tools20022.repository.msg.PartyAndAuthorisation1.PartyOrGroup, com.tools20022.repository.msg.PartyAndAuthorisation3.PartyOrGroup,
						com.tools20022.repository.msg.Report2.NonClearingMember, com.tools20022.repository.msg.NetPosition1.Depository, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation8.Party,
						com.tools20022.repository.msg.InvestmentAccountOwnershipInformation9.Party, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation10.Party,
						com.tools20022.repository.msg.InvestmentAccountOwnershipInformation11.Party, com.tools20022.repository.msg.Report5.NonClearingMember, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12.Party,
						com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13.Party, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15.Party,
						com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14.Party);
				subType_lazy = () -> Arrays.asList(Organisation.mmObject(), Person.mmObject());
				superType_lazy = () -> RolePlayer.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Party.ContactPoint, com.tools20022.repository.entity.Party.Identification, com.tools20022.repository.entity.Party.MoneyLaunderingCheck,
						com.tools20022.repository.entity.Party.TaxationConditions, com.tools20022.repository.entity.Party.Domicile, com.tools20022.repository.entity.Party.Residence, com.tools20022.repository.entity.Party.PowerOfAttorney,
						com.tools20022.repository.entity.Party.Location, com.tools20022.repository.entity.Party.CloseLinkSecurity);
				derivationComponent_lazy = () -> Arrays.asList(CountryAndResidentialStatusType1.mmObject(), Party14Choice.mmObject(), PartyIdentificationAndAccount93.mmObject(), Counterparty1Choice.mmObject(),
						Counterparty4Choice.mmObject(), PartyIdentificationAndAccount81.mmObject(), PartyIdentificationAndAccount86.mmObject(), Counterparty7Choice.mmObject(), PartyIdentificationAndAccount88.mmObject(),
						PartyIdentificationAndAccount92.mmObject(), Counterparty2Choice.mmObject(), Counterparty3Choice.mmObject(), Counterparty6Choice.mmObject(), TradingPartyCapacity1Choice.mmObject(),
						TradingPartyCapacity2Choice.mmObject(), PartyAndSignature1.mmObject(), PartyAndAuthorisation1.mmObject(), PartyAndAuthorisation3.mmObject(), AddressOrParty1Choice.mmObject(), PartyAndType1.mmObject(),
						Counterparty5Choice.mmObject(), PartyAndAccountIdentificationAndContactInformation1.mmObject(), Counterparty8Choice.mmObject(), Party15Choice.mmObject(), Party16Choice.mmObject(),
						SingleQualifiedPartyIdentification1.mmObject(), Party24Choice.mmObject(), Party23Choice.mmObject(), Counterparty9Choice.mmObject(), PartyIdentificationAndAccount108.mmObject(),
						PartyIdentificationAndAccount109.mmObject(), Party30Choice.mmObject(), Party31Choice.mmObject(), CountryAndResidentialStatusType2.mmObject(), PartyIdentificationAndAccount125.mmObject(),
						PartyIdentificationAndAccount135.mmObject(), PartyIdentificationAndAccount137.mmObject(), Counterparty10Choice.mmObject(), Party33Choice.mmObject(), Party32Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}