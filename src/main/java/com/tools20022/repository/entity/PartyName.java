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
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.entity.PartyIdentificationInformation;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;

/**
 * Name by which a party is known and which is usually used to identify that
 * party.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="PartyName" src="doc-files/PartyName.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.PartyName#mmName
 * PartyName.mmName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PartyName#mmPartyIdentification
 * PartyName.mmPartyIdentification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmPartyName
 * PartyIdentificationInformation.mmPartyName}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.PersonName PersonName}</li>
 * <li>{@linkplain com.tools20022.repository.entity.OrganisationName
 * OrganisationName}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PartyName"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Name by which a party is known and which is usually used to identify that party."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
public class PartyName {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected Max140Text name;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.ContactDetails1#mmName
	 * ContactDetails1.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrderDeskContactDetails#mmName
	 * OrderDeskContactDetails.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ContactAttributes1#mmName
	 * ContactAttributes1.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.NameAndAddress2#mmName
	 * NameAndAddress2.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.NameAndAddress5#mmName
	 * NameAndAddress5.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.NameAndAddress1#mmName
	 * NameAndAddress1.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.NameAndAddress4#mmName
	 * NameAndAddress4.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.BranchData#mmName
	 * BranchData.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCard2#mmCardIssuerName
	 * PaymentCard2.mmCardIssuerName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Organisation13#mmName
	 * Organisation13.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstitutionIdentification8#mmName
	 * FinancialInstitutionIdentification8.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.BranchData2#mmName
	 * BranchData2.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification8#mmName
	 * PartyIdentification8.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ContactDetails2#mmName
	 * ContactDetails2.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification32#mmName
	 * PartyIdentification32.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification43#mmName
	 * PartyIdentification43.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification#mmName
	 * PartyIdentification.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.NameAndAddress7#mmName
	 * NameAndAddress7.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstitutionIdentification3#mmName
	 * FinancialInstitutionIdentification3.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstitutionIdentification7#mmName
	 * FinancialInstitutionIdentification7.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ContactIdentification2#mmName
	 * ContactIdentification2.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationSource1Choice#mmProprietary
	 * IdentificationSource1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationSource3Choice#mmProprietary
	 * IdentificationSource3Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.NameAndAddress12#mmName
	 * NameAndAddress12.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationSource4Choice#mmProprietary
	 * IdentificationSource4Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationSource2Choice#mmProprietary
	 * IdentificationSource2Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ContactIdentification1#mmName
	 * ContactIdentification1.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.NameAndAddress13#mmName
	 * NameAndAddress13.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification41#mmName
	 * PartyIdentification41.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification40#mmName
	 * PartyIdentification40.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.NameAndAddress3#mmName
	 * NameAndAddress3.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.NameAndAddress10#mmName
	 * NameAndAddress10.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TaxAuthorisation1#mmName
	 * TaxAuthorisation1.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegulatoryAuthority#mmAuthorityName
	 * RegulatoryAuthority.mmAuthorityName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegulatoryAuthority2#mmName
	 * RegulatoryAuthority2.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Contacts3#mmName
	 * Contacts3.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification42#mmName
	 * PartyIdentification42.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NonExtension1#mmNotificationRecipientName
	 * NonExtension1.mmNotificationRecipientName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommunicationChannel1#mmDeliverToName
	 * CommunicationChannel1.mmDeliverToName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.NameAndAddress8#mmName
	 * NameAndAddress8.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification59#mmPartyName
	 * PartyIdentification59.mmPartyName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ContactInformation1#mmName
	 * ContactInformation1.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Organisation5#mmCommonName
	 * Organisation5.mmCommonName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Organisation8#mmCommonName
	 * Organisation8.mmCommonName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Organisation9#mmCommonName
	 * Organisation9.mmCommonName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification1#mmName
	 * PartyIdentification1.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstitutionIdentification1#mmName
	 * FinancialInstitutionIdentification1.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.NameAndAddress9#mmName
	 * NameAndAddress9.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ContactIdentification4#mmName
	 * ContactIdentification4.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification25#mmName
	 * PartyIdentification25.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification45#mmName
	 * PartyIdentification45.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LegalOrganisation1#mmName
	 * LegalOrganisation1.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification9#mmName
	 * PartyIdentification9.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.NameAndAddress6#mmName
	 * NameAndAddress6.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification26#mmName
	 * PartyIdentification26.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByAir3#mmAirCarrierName
	 * TransportByAir3.mmAirCarrierName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByRoad3#mmRoadCarrierName
	 * TransportByRoad3.mmRoadCarrierName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByRail3#mmRailCarrierName
	 * TransportByRail3.mmRailCarrierName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification27#mmName
	 * PartyIdentification27.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ContactIdentification3#mmName
	 * ContactIdentification3.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByAir2#mmAirCarrierName
	 * TransportByAir2.mmAirCarrierName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByRoad2#mmRoadCarrierName
	 * TransportByRoad2.mmRoadCarrierName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByRail2#mmRailCarrierName
	 * TransportByRail2.mmRailCarrierName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MultimodalTransport2#mmAirCarrierName
	 * MultimodalTransport2.mmAirCarrierName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MultimodalTransport2#mmRoadCarrierName
	 * MultimodalTransport2.mmRoadCarrierName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MultimodalTransport2#mmRailCarrierName
	 * MultimodalTransport2.mmRailCarrierName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification28#mmName
	 * PartyIdentification28.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ContactIdentificationAndAddress#mmName
	 * ContactIdentificationAndAddress.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.MemberDetails#mmName
	 * MemberDetails.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ContactDetails3#mmName
	 * ContactDetails3.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification58#mmName
	 * PartyIdentification58.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification14#mmName
	 * PartyIdentification14.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification17#mmName
	 * PartyIdentification17.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification12#mmName
	 * PartyIdentification12.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification19#mmName
	 * PartyIdentification19.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification30#mmName
	 * PartyIdentification30.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification18#mmName
	 * PartyIdentification18.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification20#mmName
	 * PartyIdentification20.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification31#mmName
	 * PartyIdentification31.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification13#mmName
	 * PartyIdentification13.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification16#mmName
	 * PartyIdentification16.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.NameAndAddress11#mmName
	 * NameAndAddress11.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification5#mmName
	 * PartyIdentification5.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification24#mmName
	 * PartyIdentification24.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Member1#mmName
	 * Member1.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Organisation15#mmName
	 * Organisation15.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByRail4#mmRailCarrierName
	 * TransportByRail4.mmRailCarrierName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByRail4#mmCarrierAgentName
	 * TransportByRail4.mmCarrierAgentName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByAir4#mmAirCarrierName
	 * TransportByAir4.mmAirCarrierName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByAir4#mmCarrierAgentName
	 * TransportByAir4.mmCarrierAgentName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByRoad4#mmRoadCarrierName
	 * TransportByRoad4.mmRoadCarrierName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByRoad4#mmCarrierAgentName
	 * TransportByRoad4.mmCarrierAgentName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportBySea5#mmCarrierAgentName
	 * TransportBySea5.mmCarrierAgentName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByAir5#mmAirCarrierName
	 * TransportByAir5.mmAirCarrierName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByAir5#mmCarrierAgentName
	 * TransportByAir5.mmCarrierAgentName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportBySea6#mmSeaCarrierName
	 * TransportBySea6.mmSeaCarrierName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportBySea6#mmCarrierAgentName
	 * TransportBySea6.mmCarrierAgentName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByRail5#mmRailCarrierName
	 * TransportByRail5.mmRailCarrierName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByRail5#mmCarrierAgentName
	 * TransportByRail5.mmCarrierAgentName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByRoad5#mmRoadCarrierName
	 * TransportByRoad5.mmRoadCarrierName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByRoad5#mmCarrierAgentName
	 * TransportByRoad5.mmCarrierAgentName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Organisation16#mmName
	 * Organisation16.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Organisation17#mmName
	 * Organisation17.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationSource5Choice#mmProprietaryIdentificationSource
	 * IdentificationSource5Choice.mmProprietaryIdentificationSource}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification10#mmName
	 * PersonIdentification10.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification77#mmName
	 * PartyIdentification77.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LegalOrganisation2#mmName
	 * LegalOrganisation2.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPersonNameLong1#mmSurname
	 * IndividualPersonNameLong1.mmSurname}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPersonNameLong1#mmMiddleName
	 * IndividualPersonNameLong1.mmMiddleName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPersonNameLong1#mmName
	 * IndividualPersonNameLong1.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson19#mmCurrentName
	 * IndividualPerson19.mmCurrentName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson19#mmPreviousName
	 * IndividualPerson19.mmPreviousName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Organisation22#mmName
	 * Organisation22.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Organisation23#mmName
	 * Organisation23.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Organisation24#mmName
	 * Organisation24.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonalInformation1#mmMaidenNameOfMother
	 * PersonalInformation1.mmMaidenNameOfMother}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCard18#mmCardIssuerName
	 * PaymentCard18.mmCardIssuerName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.NameAndAddress15#mmName
	 * NameAndAddress15.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation25#mmCommonName
	 * Organisation25.mmCommonName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation26#mmCommonName
	 * Organisation26.mmCommonName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification112#mmName
	 * PartyIdentification112.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OrganisationIdentification3Choice#mmClientIdentification
	 * OrganisationIdentification3Choice.mmClientIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OrganisationIdentification2Choice#mmClientIdentification
	 * OrganisationIdentification2Choice.mmClientIdentification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Organisation30#mmName
	 * Organisation30.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCard25#mmCardIssuerName
	 * PaymentCard25.mmCardIssuerName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Organisation29#mmName
	 * Organisation29.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MarketIdentification92#mmInstitutionName
	 * MarketIdentification92.mmInstitutionName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ContactIdentificationAndAddress1#mmName
	 * ContactIdentificationAndAddress1.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Member4#mmName
	 * Member4.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification125#mmName
	 * PartyIdentification125.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ContactIdentification5#mmName
	 * ContactIdentification5.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeceasedStatusSD1#mmBeneficialOwnerName
	 * DeceasedStatusSD1.mmBeneficialOwnerName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation32#mmCommonName
	 * Organisation32.mmCommonName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification129#mmName
	 * PartyIdentification129.mmName}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.PartyName
	 * PartyName}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Name"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Name by which a party is known and which is usually used to identify that party. This name is derived from the concatenation of the elements that compose the name of a person or from the legal name of an organisation."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<PartyName, Max140Text> mmName = new MMBusinessAttribute<PartyName, Max140Text>() {
		{
			derivation_lazy = () -> Arrays.asList(ContactDetails1.mmName, OrderDeskContactDetails.mmName, ContactAttributes1.mmName, NameAndAddress2.mmName, NameAndAddress5.mmName, NameAndAddress1.mmName, NameAndAddress4.mmName,
					BranchData.mmName, PaymentCard2.mmCardIssuerName, Organisation13.mmName, FinancialInstitutionIdentification8.mmName, BranchData2.mmName, PartyIdentification8.mmName, ContactDetails2.mmName, PartyIdentification32.mmName,
					PartyIdentification43.mmName, PartyIdentification.mmName, NameAndAddress7.mmName, FinancialInstitutionIdentification3.mmName, FinancialInstitutionIdentification7.mmName, ContactIdentification2.mmName,
					IdentificationSource1Choice.mmProprietary, IdentificationSource3Choice.mmProprietary, NameAndAddress12.mmName, IdentificationSource4Choice.mmProprietary, IdentificationSource2Choice.mmProprietary,
					ContactIdentification1.mmName, NameAndAddress13.mmName, PartyIdentification41.mmName, PartyIdentification40.mmName, NameAndAddress3.mmName, NameAndAddress10.mmName, TaxAuthorisation1.mmName,
					RegulatoryAuthority.mmAuthorityName, RegulatoryAuthority2.mmName, Contacts3.mmName, PartyIdentification42.mmName, NonExtension1.mmNotificationRecipientName, CommunicationChannel1.mmDeliverToName, NameAndAddress8.mmName,
					PartyIdentification59.mmPartyName, ContactInformation1.mmName, Organisation5.mmCommonName, Organisation8.mmCommonName, Organisation9.mmCommonName, PartyIdentification1.mmName, FinancialInstitutionIdentification1.mmName,
					NameAndAddress9.mmName, ContactIdentification4.mmName, PartyIdentification25.mmName, PartyIdentification45.mmName, LegalOrganisation1.mmName, PartyIdentification9.mmName, NameAndAddress6.mmName,
					PartyIdentification26.mmName, TransportByAir3.mmAirCarrierName, TransportByRoad3.mmRoadCarrierName, TransportByRail3.mmRailCarrierName, PartyIdentification27.mmName, ContactIdentification3.mmName,
					TransportByAir2.mmAirCarrierName, TransportByRoad2.mmRoadCarrierName, TransportByRail2.mmRailCarrierName, MultimodalTransport2.mmAirCarrierName, MultimodalTransport2.mmRoadCarrierName,
					MultimodalTransport2.mmRailCarrierName, PartyIdentification28.mmName, ContactIdentificationAndAddress.mmName, MemberDetails.mmName, ContactDetails3.mmName, PartyIdentification58.mmName, PartyIdentification14.mmName,
					PartyIdentification17.mmName, PartyIdentification12.mmName, PartyIdentification19.mmName, PartyIdentification30.mmName, PartyIdentification18.mmName, PartyIdentification20.mmName, PartyIdentification31.mmName,
					PartyIdentification13.mmName, PartyIdentification16.mmName, NameAndAddress11.mmName, PartyIdentification5.mmName, PartyIdentification24.mmName, Member1.mmName, Organisation15.mmName, TransportByRail4.mmRailCarrierName,
					TransportByRail4.mmCarrierAgentName, TransportByAir4.mmAirCarrierName, TransportByAir4.mmCarrierAgentName, TransportByRoad4.mmRoadCarrierName, TransportByRoad4.mmCarrierAgentName, TransportBySea5.mmCarrierAgentName,
					TransportByAir5.mmAirCarrierName, TransportByAir5.mmCarrierAgentName, TransportBySea6.mmSeaCarrierName, TransportBySea6.mmCarrierAgentName, TransportByRail5.mmRailCarrierName, TransportByRail5.mmCarrierAgentName,
					TransportByRoad5.mmRoadCarrierName, TransportByRoad5.mmCarrierAgentName, Organisation16.mmName, Organisation17.mmName, IdentificationSource5Choice.mmProprietaryIdentificationSource, PersonIdentification10.mmName,
					PartyIdentification77.mmName, LegalOrganisation2.mmName, IndividualPersonNameLong1.mmSurname, IndividualPersonNameLong1.mmMiddleName, IndividualPersonNameLong1.mmName, IndividualPerson19.mmCurrentName,
					IndividualPerson19.mmPreviousName, Organisation22.mmName, Organisation23.mmName, Organisation24.mmName, PersonalInformation1.mmMaidenNameOfMother, PaymentCard18.mmCardIssuerName, NameAndAddress15.mmName,
					Organisation25.mmCommonName, Organisation26.mmCommonName, PartyIdentification112.mmName, OrganisationIdentification3Choice.mmClientIdentification, OrganisationIdentification2Choice.mmClientIdentification,
					Organisation30.mmName, PaymentCard25.mmCardIssuerName, Organisation29.mmName, MarketIdentification92.mmInstitutionName, ContactIdentificationAndAddress1.mmName, Member4.mmName, PartyIdentification125.mmName,
					ContactIdentification5.mmName, DeceasedStatusSD1.mmBeneficialOwnerName, Organisation32.mmCommonName, PartyIdentification129.mmName);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PartyName.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Name";
			definition = "Name by which a party is known and which is usually used to identify that party. This name is derived from the concatenation of the elements that compose the name of a person or from the legal name of an organisation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max140Text.mmObject();
		}

		@Override
		public Max140Text getValue(PartyName obj) {
			return obj.getName();
		}

		@Override
		public void setValue(PartyName obj, Max140Text value) {
			obj.setName(value);
		}
	};
	protected PartyIdentificationInformation partyIdentification;
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
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmPartyName
	 * PartyIdentificationInformation.mmPartyName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.PartyName
	 * PartyName}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartyIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party identification which contains a name."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<PartyName, Optional<PartyIdentificationInformation>> mmPartyIdentification = new MMBusinessAssociationEnd<PartyName, Optional<PartyIdentificationInformation>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PartyName.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PartyIdentification";
			definition = "Party identification which contains a name.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> PartyIdentificationInformation.mmPartyName;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> PartyIdentificationInformation.mmObject();
		}

		@Override
		public Optional<PartyIdentificationInformation> getValue(PartyName obj) {
			return obj.getPartyIdentification();
		}

		@Override
		public void setValue(PartyName obj, Optional<PartyIdentificationInformation> value) {
			obj.setPartyIdentification(value.orElse(null));
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PartyName";
				definition = "Name by which a party is known and which is usually used to identify that party.";
				associationDomain_lazy = () -> Arrays.asList(PartyIdentificationInformation.mmPartyName);
				subType_lazy = () -> Arrays.asList(PersonName.mmObject(), OrganisationName.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PartyName.mmName, com.tools20022.repository.entity.PartyName.mmPartyIdentification);
			}

			@Override
			public Class<?> getInstanceClass() {
				return PartyName.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Max140Text getName() {
		return name;
	}

	public PartyName setName(Max140Text name) {
		this.name = Objects.requireNonNull(name);
		return this;
	}

	public Optional<PartyIdentificationInformation> getPartyIdentification() {
		return partyIdentification == null ? Optional.empty() : Optional.of(partyIdentification);
	}

	public PartyName setPartyIdentification(PartyIdentificationInformation partyIdentification) {
		this.partyIdentification = partyIdentification;
		return this;
	}
}