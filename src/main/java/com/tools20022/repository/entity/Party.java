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

import com.tools20022.metamodel.*;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.CreditQualityCode;
import com.tools20022.repository.codeset.MoneyLaunderingCheckCode;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
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
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.RolePlayer
 * RolePlayer}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Party#mmContactPoint
 * Party.mmContactPoint}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Party#mmIdentification
 * Party.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Party#mmMoneyLaunderingCheck
 * Party.mmMoneyLaunderingCheck}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Party#mmTaxationConditions
 * Party.mmTaxationConditions}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Party#mmDomicile
 * Party.mmDomicile}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Party#mmResidence
 * Party.mmResidence}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Party#mmPowerOfAttorney
 * Party.mmPowerOfAttorney}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Party#mmLocation
 * Party.mmLocation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Party#mmCloseLinkSecurity
 * Party.mmCloseLinkSecurity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Party#mmCreditQuality
 * Party.mmCreditQuality}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmCloseLink
 * Security.mmCloseLink}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ContactPoint#mmRelatedParty
 * ContactPoint.mmRelatedParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmIdentifiedParty
 * PartyIdentificationInformation.mmIdentifiedParty}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Location#mmDomiciledParty
 * Location.mmDomiciledParty}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Location#mmParty
 * Location.mmParty}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Location#mmTaxableParty
 * Location.mmTaxableParty}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmTaxableParty
 * Tax.mmTaxableParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PowerOfAttorney#mmAuthorisedParty
 * PowerOfAttorney.mmAuthorisedParty}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation6#mmParty
 * InvestmentAccountOwnershipInformation6.mmParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation7#mmParty
 * InvestmentAccountOwnershipInformation7.mmParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OperationMandate1#mmMandateHolder
 * OperationMandate1.mmMandateHolder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyAndAuthorisation1#mmPartyOrGroup
 * PartyAndAuthorisation1.mmPartyOrGroup}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyAndAuthorisation3#mmPartyOrGroup
 * PartyAndAuthorisation3.mmPartyOrGroup}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Report2#mmNonClearingMember
 * Report2.mmNonClearingMember}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NetPosition1#mmDepository
 * NetPosition1.mmDepository}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation8#mmParty
 * InvestmentAccountOwnershipInformation8.mmParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation9#mmParty
 * InvestmentAccountOwnershipInformation9.mmParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation10#mmParty
 * InvestmentAccountOwnershipInformation10.mmParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation11#mmParty
 * InvestmentAccountOwnershipInformation11.mmParty}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Report5#mmNonClearingMember
 * Report5.mmNonClearingMember}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12#mmParty
 * InvestmentAccountOwnershipInformation12.mmParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13#mmParty
 * InvestmentAccountOwnershipInformation13.mmParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15#mmParty
 * InvestmentAccountOwnershipInformation15.mmParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14#mmParty
 * InvestmentAccountOwnershipInformation14.mmParty}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Organisation Organisation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Person Person}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
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
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount156
 * PartyIdentificationAndAccount156}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Counterparty11Choice
 * Counterparty11Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Counterparty12Choice
 * Counterparty12Choice}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Party"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Entity involved in an activity."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
public class Party extends RolePlayer {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected List<com.tools20022.repository.entity.ContactPoint> contactPoint;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ContactPoint
	 * ContactPoint}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ContactPoint#mmRelatedParty
	 * ContactPoint.mmRelatedParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LocalMarketAnnex#mmLocalOrderDesk
	 * LocalMarketAnnex.mmLocalOrderDesk}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LocalMarketAnnex2#mmLocalOrderDesk
	 * LocalMarketAnnex2.mmLocalOrderDesk}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundProcessingPassport1#mmFundManagementCompany
	 * FundProcessingPassport1.mmFundManagementCompany}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation2#mmPrimaryCommunicationAddress
	 * Organisation2.mmPrimaryCommunicationAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation2#mmSecondaryCommunicationAddress
	 * Organisation2.mmSecondaryCommunicationAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation3#mmPrimaryCommunicationAddress
	 * Organisation3.mmPrimaryCommunicationAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation3#mmSecondaryCommunicationAddress
	 * Organisation3.mmSecondaryCommunicationAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification32#mmContactDetails
	 * PartyIdentification32.mmContactDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification43#mmContactDetails
	 * PartyIdentification43.mmContactDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyTextInformation1#mmPartyContactDetails
	 * PartyTextInformation1.mmPartyContactDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyTextInformation2#mmPartyContactDetails
	 * PartyTextInformation2.mmPartyContactDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyTextInformation3#mmPartyContactDetails
	 * PartyTextInformation3.mmPartyContactDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyTextInformation4#mmPartyContactDetails
	 * PartyTextInformation4.mmPartyContactDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyTextInformation5#mmPartyContactDetails
	 * PartyTextInformation5.mmPartyContactDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification41#mmContactDetails
	 * PartyIdentification41.mmContactDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification40#mmContactDetails
	 * PartyIdentification40.mmContactDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExtendOrPayQuery1#mmBankContact
	 * ExtendOrPayQuery1.mmBankContact}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification42#mmContactDetails
	 * PartyIdentification42.mmContactDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GeneralInformation1#mmContactInformation
	 * GeneralInformation1.mmContactInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GeneralInformation4#mmContactInformation
	 * GeneralInformation4.mmContactInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GeneralInformation2#mmContactInformation
	 * GeneralInformation2.mmContactInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyAndAccountIdentificationAndContactInformation1#mmContactInformation
	 * PartyAndAccountIdentificationAndContactInformation1.mmContactInformation}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification45#mmContactDetails
	 * PartyIdentification45.mmContactDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ContactIdentificationAndAddress#mmCommunicationAddress
	 * ContactIdentificationAndAddress.mmCommunicationAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MemberDetails#mmCommunicationAddress
	 * MemberDetails.mmCommunicationAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MemberDetails1#mmCommunicationAddress
	 * MemberDetails1.mmCommunicationAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ContactDetails3#mmPreferredMethod
	 * ContactDetails3.mmPreferredMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification58#mmContactDetails
	 * PartyIdentification58.mmContactDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountTax1#mmNonResidenceCountry
	 * AccountTax1.mmNonResidenceCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Intermediary16#mmCommunicationInformation
	 * Intermediary16.mmCommunicationInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Member1#mmCommunicationAddress
	 * Member1.mmCommunicationAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Member2#mmCommunicationAddress
	 * Member2.mmCommunicationAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification77#mmContactDetails
	 * PartyIdentification77.mmContactDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification112#mmContactDetails
	 * PartyIdentification112.mmContactDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation27#mmPrimaryCommunicationAddress
	 * Organisation27.mmPrimaryCommunicationAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation27#mmSecondaryCommunicationAddress
	 * Organisation27.mmSecondaryCommunicationAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrganisationIdentification28#mmContactDetails
	 * OrganisationIdentification28.mmContactDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GeneralInformation5#mmContactInformation
	 * GeneralInformation5.mmContactInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Member3#mmCommunicationAddress
	 * Member3.mmCommunicationAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ContactIdentificationAndAddress1#mmCommunicationAddress
	 * ContactIdentificationAndAddress1.mmCommunicationAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Member4#mmCommunicationAddress
	 * Member4.mmCommunicationAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification125#mmContactDetails
	 * PartyIdentification125.mmContactDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification129#mmContactDetails
	 * PartyIdentification129.mmContactDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Party
	 * Party}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContactPoint"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number, physical or virtual address, used for communication."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Party, List<ContactPoint>> mmContactPoint = new MMBusinessAssociationEnd<Party, List<ContactPoint>>() {
		{
			derivation_lazy = () -> Arrays.asList(LocalMarketAnnex.mmLocalOrderDesk, LocalMarketAnnex2.mmLocalOrderDesk, FundProcessingPassport1.mmFundManagementCompany, Organisation2.mmPrimaryCommunicationAddress,
					Organisation2.mmSecondaryCommunicationAddress, Organisation3.mmPrimaryCommunicationAddress, Organisation3.mmSecondaryCommunicationAddress, PartyIdentification32.mmContactDetails, PartyIdentification43.mmContactDetails,
					PartyTextInformation1.mmPartyContactDetails, PartyTextInformation2.mmPartyContactDetails, PartyTextInformation3.mmPartyContactDetails, PartyTextInformation4.mmPartyContactDetails,
					PartyTextInformation5.mmPartyContactDetails, PartyIdentification41.mmContactDetails, PartyIdentification40.mmContactDetails, ExtendOrPayQuery1.mmBankContact, PartyIdentification42.mmContactDetails,
					GeneralInformation1.mmContactInformation, GeneralInformation4.mmContactInformation, GeneralInformation2.mmContactInformation, PartyAndAccountIdentificationAndContactInformation1.mmContactInformation,
					PartyIdentification45.mmContactDetails, ContactIdentificationAndAddress.mmCommunicationAddress, MemberDetails.mmCommunicationAddress, MemberDetails1.mmCommunicationAddress, ContactDetails3.mmPreferredMethod,
					PartyIdentification58.mmContactDetails, AccountTax1.mmNonResidenceCountry, Intermediary16.mmCommunicationInformation, Member1.mmCommunicationAddress, Member2.mmCommunicationAddress,
					PartyIdentification77.mmContactDetails, PartyIdentification112.mmContactDetails, Organisation27.mmPrimaryCommunicationAddress, Organisation27.mmSecondaryCommunicationAddress,
					OrganisationIdentification28.mmContactDetails, GeneralInformation5.mmContactInformation, Member3.mmCommunicationAddress, ContactIdentificationAndAddress1.mmCommunicationAddress, Member4.mmCommunicationAddress,
					PartyIdentification125.mmContactDetails, PartyIdentification129.mmContactDetails);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Party.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ContactPoint";
			definition = "Number, physical or virtual address, used for communication.";
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.ContactPoint.mmRelatedParty;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ContactPoint.mmObject();
		}

		@Override
		public List<ContactPoint> getValue(Party obj) {
			return obj.getContactPoint();
		}

		@Override
		public void setValue(Party obj, List<ContactPoint> value) {
			obj.setContactPoint(value);
		}
	};
	protected List<PartyIdentificationInformation> identification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation
	 * PartyIdentificationInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmIdentifiedParty
	 * PartyIdentificationInformation.mmIdentifiedParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} = List of 2555 elements</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Party
	 * Party}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specific identification assigned to a party."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Party, List<PartyIdentificationInformation>> mmIdentification = new MMBusinessAssociationEnd<Party, List<PartyIdentificationInformation>>() {
		{
			derivation_lazy = () -> ListBuilderForParty_00.addElems(new ArrayList<>());
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Party.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Specific identification assigned to a party.";
			minOccurs = 1;
			opposite_lazy = () -> PartyIdentificationInformation.mmIdentifiedParty;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> PartyIdentificationInformation.mmObject();
		}

		@Override
		public List<PartyIdentificationInformation> getValue(Party obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(Party obj, List<PartyIdentificationInformation> value) {
			obj.setIdentification(value);
		}
	};
	protected MoneyLaunderingCheckCode moneyLaunderingCheck;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation5#mmMoneyLaunderingCheck
	 * InvestmentAccountOwnershipInformation5.mmMoneyLaunderingCheck}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation5#mmExtendedMoneyLaunderingCheck
	 * InvestmentAccountOwnershipInformation5.mmExtendedMoneyLaunderingCheck}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation2#mmMoneyLaunderingCheck
	 * InvestmentAccountOwnershipInformation2.mmMoneyLaunderingCheck}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation2#mmExtendedMoneyLaunderingCheck
	 * InvestmentAccountOwnershipInformation2.mmExtendedMoneyLaunderingCheck}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MoneyLaunderingCheck1Choice#mmCode
	 * MoneyLaunderingCheck1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MoneyLaunderingCheck1Choice#mmProprietary
	 * MoneyLaunderingCheck1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation6#mmMoneyLaunderingCheck
	 * InvestmentAccountOwnershipInformation6.mmMoneyLaunderingCheck}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation3#mmMoneyLaunderingCheck
	 * InvestmentAccountOwnershipInformation3.mmMoneyLaunderingCheck}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation3#mmExtendedMoneyLaunderingCheck
	 * InvestmentAccountOwnershipInformation3.mmExtendedMoneyLaunderingCheck}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation4#mmMoneyLaunderingCheck
	 * InvestmentAccountOwnershipInformation4.mmMoneyLaunderingCheck}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation4#mmExtendedMoneyLaunderingCheck
	 * InvestmentAccountOwnershipInformation4.mmExtendedMoneyLaunderingCheck}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation7#mmMoneyLaunderingCheck
	 * InvestmentAccountOwnershipInformation7.mmMoneyLaunderingCheck}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrderParameters1#mmMoneyLaunderingStatus
	 * OrderParameters1.mmMoneyLaunderingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.List1#mmMoneyLaunderingStatus
	 * List1.mmMoneyLaunderingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation8#mmMoneyLaunderingCheck
	 * InvestmentAccountOwnershipInformation8.mmMoneyLaunderingCheck}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation9#mmMoneyLaunderingCheck
	 * InvestmentAccountOwnershipInformation9.mmMoneyLaunderingCheck}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation10#mmMoneyLaunderingCheck
	 * InvestmentAccountOwnershipInformation10.mmMoneyLaunderingCheck}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation11#mmMoneyLaunderingCheck
	 * InvestmentAccountOwnershipInformation11.mmMoneyLaunderingCheck}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12#mmMoneyLaunderingCheck
	 * InvestmentAccountOwnershipInformation12.mmMoneyLaunderingCheck}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13#mmMoneyLaunderingCheck
	 * InvestmentAccountOwnershipInformation13.mmMoneyLaunderingCheck}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15#mmMoneyLaunderingCheck
	 * InvestmentAccountOwnershipInformation15.mmMoneyLaunderingCheck}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14#mmMoneyLaunderingCheck
	 * InvestmentAccountOwnershipInformation14.mmMoneyLaunderingCheck}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Party
	 * Party}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MoneyLaunderingCheck"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Status of an identity check to prevent money laundering. This includes the counter-terrorism check."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Party, MoneyLaunderingCheckCode> mmMoneyLaunderingCheck = new MMBusinessAttribute<Party, MoneyLaunderingCheckCode>() {
		{
			derivation_lazy = () -> Arrays.asList(InvestmentAccountOwnershipInformation5.mmMoneyLaunderingCheck, InvestmentAccountOwnershipInformation5.mmExtendedMoneyLaunderingCheck,
					InvestmentAccountOwnershipInformation2.mmMoneyLaunderingCheck, InvestmentAccountOwnershipInformation2.mmExtendedMoneyLaunderingCheck, MoneyLaunderingCheck1Choice.mmCode, MoneyLaunderingCheck1Choice.mmProprietary,
					InvestmentAccountOwnershipInformation6.mmMoneyLaunderingCheck, InvestmentAccountOwnershipInformation3.mmMoneyLaunderingCheck, InvestmentAccountOwnershipInformation3.mmExtendedMoneyLaunderingCheck,
					InvestmentAccountOwnershipInformation4.mmMoneyLaunderingCheck, InvestmentAccountOwnershipInformation4.mmExtendedMoneyLaunderingCheck, InvestmentAccountOwnershipInformation7.mmMoneyLaunderingCheck,
					OrderParameters1.mmMoneyLaunderingStatus, List1.mmMoneyLaunderingStatus, InvestmentAccountOwnershipInformation8.mmMoneyLaunderingCheck, InvestmentAccountOwnershipInformation9.mmMoneyLaunderingCheck,
					InvestmentAccountOwnershipInformation10.mmMoneyLaunderingCheck, InvestmentAccountOwnershipInformation11.mmMoneyLaunderingCheck, InvestmentAccountOwnershipInformation12.mmMoneyLaunderingCheck,
					InvestmentAccountOwnershipInformation13.mmMoneyLaunderingCheck, InvestmentAccountOwnershipInformation15.mmMoneyLaunderingCheck, InvestmentAccountOwnershipInformation14.mmMoneyLaunderingCheck);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Party.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MoneyLaunderingCheck";
			definition = "Status of an identity check to prevent money laundering. This includes the counter-terrorism check.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> MoneyLaunderingCheckCode.mmObject();
		}

		@Override
		public MoneyLaunderingCheckCode getValue(Party obj) {
			return obj.getMoneyLaunderingCheck();
		}

		@Override
		public void setValue(Party obj, MoneyLaunderingCheckCode value) {
			obj.setMoneyLaunderingCheck(value);
		}
	};
	protected Tax taxationConditions;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmTaxableParty
	 * Tax.mmTaxableParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax8#mmCountry
	 * Tax8.mmCountry}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax17#mmCountry
	 * Tax17.mmCountry}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax16#mmCountry
	 * Tax16.mmCountry}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax14#mmCountry
	 * Tax14.mmCountry}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax18#mmCountry
	 * Tax18.mmCountry}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax19#mmCountry
	 * Tax19.mmCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxIdentification1#mmTaxationCountry
	 * TaxIdentification1.mmTaxationCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxIdentification2#mmIssuerCountry
	 * TaxIdentification2.mmIssuerCountry}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax32#mmCountry
	 * Tax32.mmCountry}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax30#mmCountry
	 * Tax30.mmCountry}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax31#mmCountry
	 * Tax31.mmCountry}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax34#mmCountry
	 * Tax34.mmCountry}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Party
	 * Party}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxationConditions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Taxation parameters which apply to an individual person or to an organisation."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Party, Tax> mmTaxationConditions = new MMBusinessAssociationEnd<Party, Tax>() {
		{
			derivation_lazy = () -> Arrays.asList(Tax8.mmCountry, Tax17.mmCountry, Tax16.mmCountry, Tax14.mmCountry, Tax18.mmCountry, Tax19.mmCountry, TaxIdentification1.mmTaxationCountry, TaxIdentification2.mmIssuerCountry,
					Tax32.mmCountry, Tax30.mmCountry, Tax31.mmCountry, Tax34.mmCountry);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Party.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TaxationConditions";
			definition = "Taxation parameters which apply to an individual person or to an organisation.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Tax.mmTaxableParty;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Tax.mmObject();
		}

		@Override
		public Tax getValue(Party obj) {
			return obj.getTaxationConditions();
		}

		@Override
		public void setValue(Party obj, Tax value) {
			obj.setTaxationConditions(value);
		}
	};
	protected Location domicile;
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
	 * {@linkplain com.tools20022.repository.entity.Location#mmDomiciledParty
	 * Location.mmDomiciledParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BeneficialOwner1#mmDomicileCountry
	 * BeneficialOwner1.mmDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BeneficialOwner2#mmDomicileCountry
	 * BeneficialOwner2.mmDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrganisationIdentification27#mmDomicile
	 * OrganisationIdentification27.mmDomicile}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Party
	 * Party}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Domicile"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Location in which a person is permanently domiciled (the place of a person's permanent home)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Party, com.tools20022.repository.entity.Location> mmDomicile = new MMBusinessAssociationEnd<Party, com.tools20022.repository.entity.Location>() {
		{
			derivation_lazy = () -> Arrays.asList(BeneficialOwner1.mmDomicileCountry, BeneficialOwner2.mmDomicileCountry, OrganisationIdentification27.mmDomicile);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Party.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Domicile";
			definition = "Location in which a person is permanently domiciled (the place of a person's permanent home).";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Location.mmDomiciledParty;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Location.mmObject();
		}

		@Override
		public com.tools20022.repository.entity.Location getValue(Party obj) {
			return obj.getDomicile();
		}

		@Override
		public void setValue(Party obj, com.tools20022.repository.entity.Location value) {
			obj.setDomicile(value);
		}
	};
	protected List<com.tools20022.repository.entity.Location> residence;
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
	 * {@linkplain com.tools20022.repository.entity.Location#mmParty
	 * Location.mmParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportSpecification4#mmBuyerCountry
	 * ReportSpecification4.mmBuyerCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportSpecification4#mmSellerCountry
	 * ReportSpecification4.mmSellerCountry}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Party
	 * Party}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Residence"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Location from which the affairs of a company are directed or location in which a person resides (the place of a person's home)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Party, List<Location>> mmResidence = new MMBusinessAssociationEnd<Party, List<Location>>() {
		{
			derivation_lazy = () -> Arrays.asList(ReportSpecification4.mmBuyerCountry, ReportSpecification4.mmSellerCountry);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Party.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Residence";
			definition = "Location from which the affairs of a company are directed or location in which a person resides (the place of a person's home).";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Location.mmParty;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Location.mmObject();
		}

		@Override
		public List<Location> getValue(Party obj) {
			return obj.getResidence();
		}

		@Override
		public void setValue(Party obj, List<Location> value) {
			obj.setResidence(value);
		}
	};
	protected PowerOfAttorney powerOfAttorney;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PowerOfAttorney
	 * PowerOfAttorney}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PowerOfAttorney#mmAuthorisedParty
	 * PowerOfAttorney.mmAuthorisedParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Party
	 * Party}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PowerOfAttorney"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Power of attorney which is held by the party."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Party, Optional<PowerOfAttorney>> mmPowerOfAttorney = new MMBusinessAssociationEnd<Party, Optional<PowerOfAttorney>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Party.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PowerOfAttorney";
			definition = "Power of attorney which is held by the party.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PowerOfAttorney.mmAuthorisedParty;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PowerOfAttorney.mmObject();
		}

		@Override
		public Optional<PowerOfAttorney> getValue(Party obj) {
			return obj.getPowerOfAttorney();
		}

		@Override
		public void setValue(Party obj, Optional<PowerOfAttorney> value) {
			obj.setPowerOfAttorney(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.entity.Location#mmTaxableParty
	 * Location.mmTaxableParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Party
	 * Party}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Location"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Location of the taxable party."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Party, com.tools20022.repository.entity.Location> mmLocation = new MMBusinessAssociationEnd<Party, com.tools20022.repository.entity.Location>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Party.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Location";
			definition = "Location of the taxable party.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Location.mmTaxableParty;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Location.mmObject();
		}

		@Override
		public com.tools20022.repository.entity.Location getValue(Party obj) {
			return obj.getLocation();
		}

		@Override
		public void setValue(Party obj, com.tools20022.repository.entity.Location value) {
			obj.setLocation(value);
		}
	};
	protected Security closeLinkSecurity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Security Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmCloseLink
	 * Security.mmCloseLink}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Party
	 * Party}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CloseLinkSecurity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Security for which a close link with a party is identified."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Party, Security> mmCloseLinkSecurity = new MMBusinessAssociationEnd<Party, Security>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Party.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CloseLinkSecurity";
			definition = "Security for which a close link with a party is identified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Security.mmCloseLink;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Security.mmObject();
		}

		@Override
		public Security getValue(Party obj) {
			return obj.getCloseLinkSecurity();
		}

		@Override
		public void setValue(Party obj, Security value) {
			obj.setCloseLinkSecurity(value);
		}
	};
	protected CreditQualityCode creditQuality;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CreditQualityCode
	 * CreditQualityCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ClearingMember1#mmCreditQuality
	 * ClearingMember1.mmCreditQuality}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Party
	 * Party}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditQuality"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Credit quality for the clearing member."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Party, CreditQualityCode> mmCreditQuality = new MMBusinessAttribute<Party, CreditQualityCode>() {
		{
			derivation_lazy = () -> Arrays.asList(ClearingMember1.mmCreditQuality);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Party.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CreditQuality";
			definition = "Credit quality for the clearing member.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CreditQualityCode.mmObject();
		}

		@Override
		public CreditQualityCode getValue(Party obj) {
			return obj.getCreditQuality();
		}

		@Override
		public void setValue(Party obj, CreditQualityCode value) {
			obj.setCreditQuality(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Party";
				definition = "Entity involved in an activity.";
				associationDomain_lazy = () -> Arrays.asList(Security.mmCloseLink, com.tools20022.repository.entity.ContactPoint.mmRelatedParty, PartyIdentificationInformation.mmIdentifiedParty,
						com.tools20022.repository.entity.Location.mmDomiciledParty, com.tools20022.repository.entity.Location.mmParty, com.tools20022.repository.entity.Location.mmTaxableParty, Tax.mmTaxableParty,
						com.tools20022.repository.entity.PowerOfAttorney.mmAuthorisedParty);
				derivationElement_lazy = () -> Arrays.asList(InvestmentAccountOwnershipInformation6.mmParty, InvestmentAccountOwnershipInformation7.mmParty, OperationMandate1.mmMandateHolder, PartyAndAuthorisation1.mmPartyOrGroup,
						PartyAndAuthorisation3.mmPartyOrGroup, Report2.mmNonClearingMember, NetPosition1.mmDepository, InvestmentAccountOwnershipInformation8.mmParty, InvestmentAccountOwnershipInformation9.mmParty,
						InvestmentAccountOwnershipInformation10.mmParty, InvestmentAccountOwnershipInformation11.mmParty, Report5.mmNonClearingMember, InvestmentAccountOwnershipInformation12.mmParty,
						InvestmentAccountOwnershipInformation13.mmParty, InvestmentAccountOwnershipInformation15.mmParty, InvestmentAccountOwnershipInformation14.mmParty);
				subType_lazy = () -> Arrays.asList(Organisation.mmObject(), Person.mmObject());
				superType_lazy = () -> RolePlayer.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Party.mmContactPoint, com.tools20022.repository.entity.Party.mmIdentification, com.tools20022.repository.entity.Party.mmMoneyLaunderingCheck,
						com.tools20022.repository.entity.Party.mmTaxationConditions, com.tools20022.repository.entity.Party.mmDomicile, com.tools20022.repository.entity.Party.mmResidence,
						com.tools20022.repository.entity.Party.mmPowerOfAttorney, com.tools20022.repository.entity.Party.mmLocation, com.tools20022.repository.entity.Party.mmCloseLinkSecurity,
						com.tools20022.repository.entity.Party.mmCreditQuality);
				derivationComponent_lazy = () -> Arrays.asList(Party14Choice.mmObject(), PartyIdentificationAndAccount93.mmObject(), Counterparty1Choice.mmObject(), Counterparty4Choice.mmObject(),
						PartyIdentificationAndAccount81.mmObject(), PartyIdentificationAndAccount86.mmObject(), Counterparty7Choice.mmObject(), PartyIdentificationAndAccount88.mmObject(), PartyIdentificationAndAccount92.mmObject(),
						Counterparty2Choice.mmObject(), Counterparty3Choice.mmObject(), Counterparty6Choice.mmObject(), TradingPartyCapacity1Choice.mmObject(), TradingPartyCapacity2Choice.mmObject(), PartyAndSignature1.mmObject(),
						PartyAndAuthorisation1.mmObject(), PartyAndAuthorisation3.mmObject(), AddressOrParty1Choice.mmObject(), PartyAndType1.mmObject(), Counterparty5Choice.mmObject(),
						PartyAndAccountIdentificationAndContactInformation1.mmObject(), Counterparty8Choice.mmObject(), Party15Choice.mmObject(), Party16Choice.mmObject(), SingleQualifiedPartyIdentification1.mmObject(),
						Party24Choice.mmObject(), Party23Choice.mmObject(), Counterparty9Choice.mmObject(), PartyIdentificationAndAccount108.mmObject(), PartyIdentificationAndAccount109.mmObject(), Party30Choice.mmObject(),
						Party31Choice.mmObject(), CountryAndResidentialStatusType2.mmObject(), PartyIdentificationAndAccount125.mmObject(), PartyIdentificationAndAccount135.mmObject(), PartyIdentificationAndAccount137.mmObject(),
						Counterparty10Choice.mmObject(), Party33Choice.mmObject(), Party32Choice.mmObject(), PartyIdentificationAndAccount156.mmObject(), Counterparty11Choice.mmObject(), Counterparty12Choice.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return Party.class;
			}
		});
		return mmObject_lazy.get();
	}

	public List<ContactPoint> getContactPoint() {
		return contactPoint == null ? contactPoint = new ArrayList<>() : contactPoint;
	}

	public Party setContactPoint(List<com.tools20022.repository.entity.ContactPoint> contactPoint) {
		this.contactPoint = Objects.requireNonNull(contactPoint);
		return this;
	}

	public List<PartyIdentificationInformation> getIdentification() {
		return identification == null ? identification = new ArrayList<>() : identification;
	}

	public Party setIdentification(List<PartyIdentificationInformation> identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public MoneyLaunderingCheckCode getMoneyLaunderingCheck() {
		return moneyLaunderingCheck;
	}

	public Party setMoneyLaunderingCheck(MoneyLaunderingCheckCode moneyLaunderingCheck) {
		this.moneyLaunderingCheck = Objects.requireNonNull(moneyLaunderingCheck);
		return this;
	}

	public Tax getTaxationConditions() {
		return taxationConditions;
	}

	public Party setTaxationConditions(Tax taxationConditions) {
		this.taxationConditions = Objects.requireNonNull(taxationConditions);
		return this;
	}

	public Location getDomicile() {
		return domicile;
	}

	public Party setDomicile(com.tools20022.repository.entity.Location domicile) {
		this.domicile = Objects.requireNonNull(domicile);
		return this;
	}

	public List<Location> getResidence() {
		return residence == null ? residence = new ArrayList<>() : residence;
	}

	public Party setResidence(List<com.tools20022.repository.entity.Location> residence) {
		this.residence = Objects.requireNonNull(residence);
		return this;
	}

	public Optional<PowerOfAttorney> getPowerOfAttorney() {
		return powerOfAttorney == null ? Optional.empty() : Optional.of(powerOfAttorney);
	}

	public Party setPowerOfAttorney(com.tools20022.repository.entity.PowerOfAttorney powerOfAttorney) {
		this.powerOfAttorney = powerOfAttorney;
		return this;
	}

	public Location getLocation() {
		return location;
	}

	public Party setLocation(com.tools20022.repository.entity.Location location) {
		this.location = Objects.requireNonNull(location);
		return this;
	}

	public Security getCloseLinkSecurity() {
		return closeLinkSecurity;
	}

	public Party setCloseLinkSecurity(Security closeLinkSecurity) {
		this.closeLinkSecurity = Objects.requireNonNull(closeLinkSecurity);
		return this;
	}

	public CreditQualityCode getCreditQuality() {
		return creditQuality;
	}

	public Party setCreditQuality(CreditQualityCode creditQuality) {
		this.creditQuality = Objects.requireNonNull(creditQuality);
		return this;
	}
}