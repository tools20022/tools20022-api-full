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
import com.tools20022.repository.datatype.Max140Text;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * <li>{@linkplain com.tools20022.repository.entity.PartyName#Name
 * PartyName.Name}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PartyName#PartyIdentification
 * PartyName.PartyIdentification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#PartyName
 * PartyIdentificationInformation.PartyName}</li>
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
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PartyName"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Name by which a party is known and which is usually used to identify that party."
 * </li>
 * </ul>
 */
public class PartyName {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Name by which a party is known and which is usually used to identify that
	 * party. This name is derived from the concatenation of the elements that
	 * compose the name of a person or from the legal name of an organisation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.ContactDetails1#Name
	 * ContactDetails1.Name}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrderDeskContactDetails#Name
	 * OrderDeskContactDetails.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ContactAttributes1#Name
	 * ContactAttributes1.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.NameAndAddress2#Name
	 * NameAndAddress2.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.NameAndAddress5#Name
	 * NameAndAddress5.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.NameAndAddress1#Name
	 * NameAndAddress1.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.NameAndAddress4#Name
	 * NameAndAddress4.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.BranchData#Name
	 * BranchData.Name}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCard2#CardIssuerName
	 * PaymentCard2.CardIssuerName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Organisation13#Name
	 * Organisation13.Name}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstitutionIdentification8#Name
	 * FinancialInstitutionIdentification8.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.BranchData2#Name
	 * BranchData2.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification8#Name
	 * PartyIdentification8.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ContactDetails2#Name
	 * ContactDetails2.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification32#Name
	 * PartyIdentification32.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification43#Name
	 * PartyIdentification43.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification#Name
	 * PartyIdentification.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.NameAndAddress7#Name
	 * NameAndAddress7.Name}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstitutionIdentification3#Name
	 * FinancialInstitutionIdentification3.Name}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstitutionIdentification7#Name
	 * FinancialInstitutionIdentification7.Name}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ContactIdentification2#Name
	 * ContactIdentification2.Name}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationSource1Choice#Proprietary
	 * IdentificationSource1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationSource3Choice#Proprietary
	 * IdentificationSource3Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.NameAndAddress12#Name
	 * NameAndAddress12.Name}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationSource4Choice#Proprietary
	 * IdentificationSource4Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationSource2Choice#Proprietary
	 * IdentificationSource2Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ContactIdentification1#Name
	 * ContactIdentification1.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.NameAndAddress13#Name
	 * NameAndAddress13.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification41#Name
	 * PartyIdentification41.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification40#Name
	 * PartyIdentification40.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.NameAndAddress3#Name
	 * NameAndAddress3.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.NameAndAddress10#Name
	 * NameAndAddress10.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TaxAuthorisation1#Name
	 * TaxAuthorisation1.Name}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegulatoryAuthority#AuthorityName
	 * RegulatoryAuthority.AuthorityName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RegulatoryAuthority2#Name
	 * RegulatoryAuthority2.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Contacts3#Name
	 * Contacts3.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification42#Name
	 * PartyIdentification42.Name}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NonExtension1#NotificationRecipientName
	 * NonExtension1.NotificationRecipientName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommunicationChannel1#DeliverToName
	 * CommunicationChannel1.DeliverToName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.NameAndAddress8#Name
	 * NameAndAddress8.Name}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification59#PartyName
	 * PartyIdentification59.PartyName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ContactInformation1#Name
	 * ContactInformation1.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Organisation5#CommonName
	 * Organisation5.CommonName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Organisation8#CommonName
	 * Organisation8.CommonName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Organisation9#CommonName
	 * Organisation9.CommonName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification1#Name
	 * PartyIdentification1.Name}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstitutionIdentification1#Name
	 * FinancialInstitutionIdentification1.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.NameAndAddress9#Name
	 * NameAndAddress9.Name}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ContactIdentification4#Name
	 * ContactIdentification4.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification25#Name
	 * PartyIdentification25.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification45#Name
	 * PartyIdentification45.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LegalOrganisation1#Name
	 * LegalOrganisation1.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification9#Name
	 * PartyIdentification9.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.NameAndAddress6#Name
	 * NameAndAddress6.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification26#Name
	 * PartyIdentification26.Name}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByAir3#AirCarrierName
	 * TransportByAir3.AirCarrierName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByRoad3#RoadCarrierName
	 * TransportByRoad3.RoadCarrierName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByRail3#RailCarrierName
	 * TransportByRail3.RailCarrierName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification27#Name
	 * PartyIdentification27.Name}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ContactIdentification3#Name
	 * ContactIdentification3.Name}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByAir2#AirCarrierName
	 * TransportByAir2.AirCarrierName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByRoad2#RoadCarrierName
	 * TransportByRoad2.RoadCarrierName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByRail2#RailCarrierName
	 * TransportByRail2.RailCarrierName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MultimodalTransport2#AirCarrierName
	 * MultimodalTransport2.AirCarrierName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MultimodalTransport2#RoadCarrierName
	 * MultimodalTransport2.RoadCarrierName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MultimodalTransport2#RailCarrierName
	 * MultimodalTransport2.RailCarrierName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification28#Name
	 * PartyIdentification28.Name}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ContactIdentificationAndAddress#Name
	 * ContactIdentificationAndAddress.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.MemberDetails#Name
	 * MemberDetails.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ContactDetails3#Name
	 * ContactDetails3.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification58#Name
	 * PartyIdentification58.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification14#Name
	 * PartyIdentification14.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification17#Name
	 * PartyIdentification17.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification12#Name
	 * PartyIdentification12.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification19#Name
	 * PartyIdentification19.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification30#Name
	 * PartyIdentification30.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification18#Name
	 * PartyIdentification18.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification20#Name
	 * PartyIdentification20.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification31#Name
	 * PartyIdentification31.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification13#Name
	 * PartyIdentification13.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification16#Name
	 * PartyIdentification16.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.NameAndAddress11#Name
	 * NameAndAddress11.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification5#Name
	 * PartyIdentification5.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification24#Name
	 * PartyIdentification24.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Member1#Name Member1.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Organisation15#Name
	 * Organisation15.Name}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByRail4#RailCarrierName
	 * TransportByRail4.RailCarrierName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByRail4#CarrierAgentName
	 * TransportByRail4.CarrierAgentName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByAir4#AirCarrierName
	 * TransportByAir4.AirCarrierName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByAir4#CarrierAgentName
	 * TransportByAir4.CarrierAgentName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByRoad4#RoadCarrierName
	 * TransportByRoad4.RoadCarrierName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByRoad4#CarrierAgentName
	 * TransportByRoad4.CarrierAgentName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportBySea5#CarrierAgentName
	 * TransportBySea5.CarrierAgentName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByAir5#AirCarrierName
	 * TransportByAir5.AirCarrierName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByAir5#CarrierAgentName
	 * TransportByAir5.CarrierAgentName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportBySea6#SeaCarrierName
	 * TransportBySea6.SeaCarrierName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportBySea6#CarrierAgentName
	 * TransportBySea6.CarrierAgentName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByRail5#RailCarrierName
	 * TransportByRail5.RailCarrierName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByRail5#CarrierAgentName
	 * TransportByRail5.CarrierAgentName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByRoad5#RoadCarrierName
	 * TransportByRoad5.RoadCarrierName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByRoad5#CarrierAgentName
	 * TransportByRoad5.CarrierAgentName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Organisation16#Name
	 * Organisation16.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Organisation17#Name
	 * Organisation17.Name}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationSource5Choice#ProprietaryIdentificationSource
	 * IdentificationSource5Choice.ProprietaryIdentificationSource}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification10#Name
	 * PersonIdentification10.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification77#Name
	 * PartyIdentification77.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LegalOrganisation2#Name
	 * LegalOrganisation2.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Organisation22#Name
	 * Organisation22.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Organisation23#Name
	 * Organisation23.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Organisation24#Name
	 * Organisation24.Name}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonalInformation1#MaidenNameOfMother
	 * PersonalInformation1.MaidenNameOfMother}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCard18#CardIssuerName
	 * PaymentCard18.CardIssuerName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.NameAndAddress15#Name
	 * NameAndAddress15.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Organisation25#CommonName
	 * Organisation25.CommonName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Organisation26#CommonName
	 * Organisation26.CommonName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification112#Name
	 * PartyIdentification112.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Organisation30#Name
	 * Organisation30.Name}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCard25#CardIssuerName
	 * PaymentCard25.CardIssuerName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Organisation29#Name
	 * Organisation29.Name}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MarketIdentification92#InstitutionName
	 * MarketIdentification92.InstitutionName}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.PartyName
	 * PartyName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Name"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Name by which a party is known and which is usually used to identify that party. This name is derived from the concatenation of the elements that compose the name of a person or from the legal name of an organisation."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Name = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ContactDetails1.Name, com.tools20022.repository.msg.OrderDeskContactDetails.Name, com.tools20022.repository.msg.ContactAttributes1.Name,
					com.tools20022.repository.msg.NameAndAddress2.Name, com.tools20022.repository.msg.NameAndAddress5.Name, com.tools20022.repository.msg.NameAndAddress1.Name, com.tools20022.repository.msg.NameAndAddress4.Name,
					com.tools20022.repository.msg.BranchData.Name, com.tools20022.repository.msg.PaymentCard2.CardIssuerName, com.tools20022.repository.msg.Organisation13.Name,
					com.tools20022.repository.msg.FinancialInstitutionIdentification8.Name, com.tools20022.repository.msg.BranchData2.Name, com.tools20022.repository.msg.PartyIdentification8.Name,
					com.tools20022.repository.msg.ContactDetails2.Name, com.tools20022.repository.msg.PartyIdentification32.Name, com.tools20022.repository.msg.PartyIdentification43.Name,
					com.tools20022.repository.msg.PartyIdentification.Name, com.tools20022.repository.msg.NameAndAddress7.Name, com.tools20022.repository.msg.FinancialInstitutionIdentification3.Name,
					com.tools20022.repository.msg.FinancialInstitutionIdentification7.Name, com.tools20022.repository.msg.ContactIdentification2.Name, com.tools20022.repository.choice.IdentificationSource1Choice.Proprietary,
					com.tools20022.repository.choice.IdentificationSource3Choice.Proprietary, com.tools20022.repository.msg.NameAndAddress12.Name, com.tools20022.repository.choice.IdentificationSource4Choice.Proprietary,
					com.tools20022.repository.choice.IdentificationSource2Choice.Proprietary, com.tools20022.repository.msg.ContactIdentification1.Name, com.tools20022.repository.msg.NameAndAddress13.Name,
					com.tools20022.repository.msg.PartyIdentification41.Name, com.tools20022.repository.msg.PartyIdentification40.Name, com.tools20022.repository.msg.NameAndAddress3.Name,
					com.tools20022.repository.msg.NameAndAddress10.Name, com.tools20022.repository.msg.TaxAuthorisation1.Name, com.tools20022.repository.msg.RegulatoryAuthority.AuthorityName,
					com.tools20022.repository.msg.RegulatoryAuthority2.Name, com.tools20022.repository.msg.Contacts3.Name, com.tools20022.repository.msg.PartyIdentification42.Name,
					com.tools20022.repository.msg.NonExtension1.NotificationRecipientName, com.tools20022.repository.msg.CommunicationChannel1.DeliverToName, com.tools20022.repository.msg.NameAndAddress8.Name,
					com.tools20022.repository.msg.PartyIdentification59.PartyName, com.tools20022.repository.msg.ContactInformation1.Name, com.tools20022.repository.msg.Organisation5.CommonName,
					com.tools20022.repository.msg.Organisation8.CommonName, com.tools20022.repository.msg.Organisation9.CommonName, com.tools20022.repository.msg.PartyIdentification1.Name,
					com.tools20022.repository.msg.FinancialInstitutionIdentification1.Name, com.tools20022.repository.msg.NameAndAddress9.Name, com.tools20022.repository.msg.ContactIdentification4.Name,
					com.tools20022.repository.msg.PartyIdentification25.Name, com.tools20022.repository.msg.PartyIdentification45.Name, com.tools20022.repository.msg.LegalOrganisation1.Name,
					com.tools20022.repository.msg.PartyIdentification9.Name, com.tools20022.repository.msg.NameAndAddress6.Name, com.tools20022.repository.msg.PartyIdentification26.Name,
					com.tools20022.repository.msg.TransportByAir3.AirCarrierName, com.tools20022.repository.msg.TransportByRoad3.RoadCarrierName, com.tools20022.repository.msg.TransportByRail3.RailCarrierName,
					com.tools20022.repository.msg.PartyIdentification27.Name, com.tools20022.repository.msg.ContactIdentification3.Name, com.tools20022.repository.msg.TransportByAir2.AirCarrierName,
					com.tools20022.repository.msg.TransportByRoad2.RoadCarrierName, com.tools20022.repository.msg.TransportByRail2.RailCarrierName, com.tools20022.repository.msg.MultimodalTransport2.AirCarrierName,
					com.tools20022.repository.msg.MultimodalTransport2.RoadCarrierName, com.tools20022.repository.msg.MultimodalTransport2.RailCarrierName, com.tools20022.repository.msg.PartyIdentification28.Name,
					com.tools20022.repository.msg.ContactIdentificationAndAddress.Name, com.tools20022.repository.msg.MemberDetails.Name, com.tools20022.repository.msg.ContactDetails3.Name,
					com.tools20022.repository.msg.PartyIdentification58.Name, com.tools20022.repository.msg.PartyIdentification14.Name, com.tools20022.repository.msg.PartyIdentification17.Name,
					com.tools20022.repository.msg.PartyIdentification12.Name, com.tools20022.repository.msg.PartyIdentification19.Name, com.tools20022.repository.msg.PartyIdentification30.Name,
					com.tools20022.repository.msg.PartyIdentification18.Name, com.tools20022.repository.msg.PartyIdentification20.Name, com.tools20022.repository.msg.PartyIdentification31.Name,
					com.tools20022.repository.msg.PartyIdentification13.Name, com.tools20022.repository.msg.PartyIdentification16.Name, com.tools20022.repository.msg.NameAndAddress11.Name,
					com.tools20022.repository.msg.PartyIdentification5.Name, com.tools20022.repository.msg.PartyIdentification24.Name, com.tools20022.repository.msg.Member1.Name, com.tools20022.repository.msg.Organisation15.Name,
					com.tools20022.repository.msg.TransportByRail4.RailCarrierName, com.tools20022.repository.msg.TransportByRail4.CarrierAgentName, com.tools20022.repository.msg.TransportByAir4.AirCarrierName,
					com.tools20022.repository.msg.TransportByAir4.CarrierAgentName, com.tools20022.repository.msg.TransportByRoad4.RoadCarrierName, com.tools20022.repository.msg.TransportByRoad4.CarrierAgentName,
					com.tools20022.repository.msg.TransportBySea5.CarrierAgentName, com.tools20022.repository.msg.TransportByAir5.AirCarrierName, com.tools20022.repository.msg.TransportByAir5.CarrierAgentName,
					com.tools20022.repository.msg.TransportBySea6.SeaCarrierName, com.tools20022.repository.msg.TransportBySea6.CarrierAgentName, com.tools20022.repository.msg.TransportByRail5.RailCarrierName,
					com.tools20022.repository.msg.TransportByRail5.CarrierAgentName, com.tools20022.repository.msg.TransportByRoad5.RoadCarrierName, com.tools20022.repository.msg.TransportByRoad5.CarrierAgentName,
					com.tools20022.repository.msg.Organisation16.Name, com.tools20022.repository.msg.Organisation17.Name, com.tools20022.repository.choice.IdentificationSource5Choice.ProprietaryIdentificationSource,
					com.tools20022.repository.msg.PersonIdentification10.Name, com.tools20022.repository.msg.PartyIdentification77.Name, com.tools20022.repository.msg.LegalOrganisation2.Name,
					com.tools20022.repository.msg.Organisation22.Name, com.tools20022.repository.msg.Organisation23.Name, com.tools20022.repository.msg.Organisation24.Name,
					com.tools20022.repository.msg.PersonalInformation1.MaidenNameOfMother, com.tools20022.repository.msg.PaymentCard18.CardIssuerName, com.tools20022.repository.msg.NameAndAddress15.Name,
					com.tools20022.repository.msg.Organisation25.CommonName, com.tools20022.repository.msg.Organisation26.CommonName, com.tools20022.repository.msg.PartyIdentification112.Name,
					com.tools20022.repository.msg.Organisation30.Name, com.tools20022.repository.msg.PaymentCard25.CardIssuerName, com.tools20022.repository.msg.Organisation29.Name,
					com.tools20022.repository.msg.MarketIdentification92.InstitutionName);
			elementContext_lazy = () -> PartyName.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Name";
			definition = "Name by which a party is known and which is usually used to identify that party. This name is derived from the concatenation of the elements that compose the name of a person or from the legal name of an organisation.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};
	/**
	 * Party identification which contains a name.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#PartyName
	 * PartyIdentificationInformation.PartyName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation
	 * PartyIdentificationInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.PartyName
	 * PartyName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartyIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party identification which contains a name."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd PartyIdentification = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PartyName.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PartyIdentification";
			definition = "Party identification which contains a name.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> PartyIdentificationInformation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PartyIdentificationInformation.PartyName;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PartyName";
				definition = "Name by which a party is known and which is usually used to identify that party.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PartyIdentificationInformation.PartyName);
				subType_lazy = () -> Arrays.asList(PersonName.mmObject(), OrganisationName.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PartyName.Name, com.tools20022.repository.entity.PartyName.PartyIdentification);
			}
		});
		return mmObject_lazy.get();
	}
}