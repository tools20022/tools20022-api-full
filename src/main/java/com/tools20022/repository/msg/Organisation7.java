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

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.acmt.AccountOpeningRequestV01;
import com.tools20022.repository.codeset.CountryCode;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.entity.Organisation;
import com.tools20022.repository.entity.OrganisationName;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.entity.PostalAddress;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information which describes the organisation.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Organisation7#mmFullLegalName
 * Organisation7.mmFullLegalName}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Organisation7#mmTradingName
 * Organisation7.mmTradingName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Organisation7#mmCountryOfOperation
 * Organisation7.mmCountryOfOperation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Organisation7#mmRegistrationDate
 * Organisation7.mmRegistrationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Organisation7#mmOperationalAddress
 * Organisation7.mmOperationalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Organisation7#mmBusinessAddress
 * Organisation7.mmBusinessAddress}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Organisation7#mmLegalAddress
 * Organisation7.mmLegalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Organisation7#mmOrganisationIdentification
 * Organisation7.mmOrganisationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Organisation7#mmRepresentativeOfficer
 * Organisation7.mmRepresentativeOfficer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Organisation7#mmTreasuryManager
 * Organisation7.mmTreasuryManager}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Organisation7#mmMainMandateHolder
 * Organisation7.mmMainMandateHolder}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Organisation7#mmSender
 * Organisation7.mmSender}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Organisation
 * Organisation}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningRequestV01#mmOrganisation
 * AccountOpeningRequestV01.mmOrganisation}</li>
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
 * "Organisation7"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information which describes the organisation."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "Organisation7", propOrder = {"fullLegalName", "tradingName", "countryOfOperation", "registrationDate", "operationalAddress", "businessAddress", "legalAddress", "organisationIdentification", "representativeOfficer",
		"treasuryManager", "mainMandateHolder", "sender"})
public class Organisation7 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max350Text fullLegalName;
	/**
	 * Name by which a party is known and which is usually used to identify that
	 * party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationName#mmLegalName
	 * OrganisationName.mmLegalName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Organisation7 Organisation7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FullLglNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FullLegalName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Name by which a party is known and which is usually used to identify that party."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFullLegalName = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> OrganisationName.mmLegalName;
			componentContext_lazy = () -> Organisation7.mmObject();
			isDerived = false;
			xmlTag = "FullLglNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FullLegalName";
			definition = "Name by which a party is known and which is usually used to identify that party.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	protected Max350Text tradingName;
	/**
	 * Name used by a business for commercial purposes, although its registered
	 * legal name, used for contracts and other formal situations, may be
	 * another.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationName#mmTradingName
	 * OrganisationName.mmTradingName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Organisation7 Organisation7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradgNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Name used by a business for commercial purposes, although its registered legal name, used for contracts and other formal situations, may be another."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTradingName = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> OrganisationName.mmTradingName;
			componentContext_lazy = () -> Organisation7.mmObject();
			isDerived = false;
			xmlTag = "TradgNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingName";
			definition = "Name used by a business for commercial purposes, although its registered legal name, used for contracts and other formal situations, may be another.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	protected CountryCode countryOfOperation;
	/**
	 * Country in which the organisation has its business activity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CountryCode
	 * CountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmPlaceOfOperation
	 * Organisation.mmPlaceOfOperation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Organisation7 Organisation7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtryOfOpr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CountryOfOperation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Country in which the organisation has its business activity."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCountryOfOperation = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Organisation.mmPlaceOfOperation;
			componentContext_lazy = () -> Organisation7.mmObject();
			isDerived = false;
			xmlTag = "CtryOfOpr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CountryOfOperation";
			definition = "Country in which the organisation has its business activity.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CountryCode.mmObject();
		}
	};
	protected ISODate registrationDate;
	/**
	 * Date and time at which a given organisation was officially registered.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmRegistrationDate
	 * Organisation.mmRegistrationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Organisation7 Organisation7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RegnDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegistrationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time at which a given organisation was officially registered."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRegistrationDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Organisation.mmRegistrationDate;
			componentContext_lazy = () -> Organisation7.mmObject();
			isDerived = false;
			xmlTag = "RegnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegistrationDate";
			definition = "Date and time at which a given organisation was officially registered.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected PostalAddress6 operationalAddress;
	/**
	 * Is an operational address, for example, of a shared services center.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PostalAddress6
	 * PostalAddress6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress PostalAddress}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Organisation7 Organisation7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OprlAdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OperationalAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Is an operational address, for example, of a shared services center."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOperationalAddress = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> PostalAddress.mmObject();
			componentContext_lazy = () -> Organisation7.mmObject();
			isDerived = false;
			xmlTag = "OprlAdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OperationalAddress";
			definition = "Is an operational address, for example, of a shared services center.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PostalAddress6.mmObject();
		}
	};
	protected PostalAddress6 businessAddress;
	/**
	 * Is the address where the business activity is taking place.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PostalAddress6
	 * PostalAddress6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress PostalAddress}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Organisation7 Organisation7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BizAdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BusinessAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Is the address where the business activity is taking place."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmBusinessAddress = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> PostalAddress.mmObject();
			componentContext_lazy = () -> Organisation7.mmObject();
			isDerived = false;
			xmlTag = "BizAdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BusinessAddress";
			definition = "Is the address where the business activity is taking place.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PostalAddress6.mmObject();
		}
	};
	protected PostalAddress6 legalAddress;
	/**
	 * Is the address where the entity resides and is registered. More
	 * generically, it is the home address (Residential address).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PostalAddress6
	 * PostalAddress6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress PostalAddress}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Organisation7 Organisation7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LglAdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LegalAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Is the address where the entity resides and is registered. More generically, it is the home address (Residential address)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmLegalAddress = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> PostalAddress.mmObject();
			componentContext_lazy = () -> Organisation7.mmObject();
			isDerived = false;
			xmlTag = "LglAdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegalAddress";
			definition = "Is the address where the entity resides and is registered. More generically, it is the home address (Residential address).";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PostalAddress6.mmObject();
		}
	};
	protected OrganisationIdentification6 organisationIdentification;
	/**
	 * Unique and unambiguous way of identifying an organisation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.OrganisationIdentification6
	 * OrganisationIdentification6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationIdentification
	 * Organisation.mmOrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Organisation7 Organisation7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrganisationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous way of identifying an organisation."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOrganisationIdentification = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> Organisation7.mmObject();
			isDerived = false;
			xmlTag = "OrgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrganisationIdentification";
			definition = "Unique and unambiguous way of identifying an organisation.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.OrganisationIdentification6.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.PartyIdentification40> representativeOfficer;
	/**
	 * Person in the customer's organisation who can be contacted by the account
	 * servicer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification40
	 * PartyIdentification40}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Organisation7 Organisation7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RprtvOffcr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepresentativeOfficer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Person in the customer's organisation who can be contacted by the account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRepresentativeOfficer = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> Organisation7.mmObject();
			isDerived = false;
			xmlTag = "RprtvOffcr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepresentativeOfficer";
			definition = "Person in the customer's organisation who can be contacted by the account servicer.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentification40.mmObject();
		}
	};
	protected PartyIdentification40 treasuryManager;
	/**
	 * Identification of the person responsible of the treasury department
	 * within an organisation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification40
	 * PartyIdentification40}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Organisation7 Organisation7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrsrMgr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TreasuryManager"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the person responsible of the treasury department within an organisation."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTreasuryManager = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> Organisation7.mmObject();
			isDerived = false;
			xmlTag = "TrsrMgr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TreasuryManager";
			definition = "Identification of the person responsible of the treasury department within an organisation.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentification40.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.PartyIdentification40> mainMandateHolder;
	/**
	 * Is the main mandate holder that will delegate some authority to other
	 * individuals (mandate holders) to perform some specific bank operations on
	 * the account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification40
	 * PartyIdentification40}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Organisation7 Organisation7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MainMndtHldr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MainMandateHolder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Is the main mandate holder that will delegate some authority to other individuals (mandate holders) to perform some specific bank operations on the account."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmMainMandateHolder = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> Organisation7.mmObject();
			isDerived = false;
			xmlTag = "MainMndtHldr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MainMandateHolder";
			definition = "Is the main mandate holder that will delegate some authority to other individuals (mandate holders) to perform some specific bank operations on the account.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentification40.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.PartyIdentification40> sender;
	/**
	 * Potential sender of a message related to the life cyle of an account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification40
	 * PartyIdentification40}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Organisation7 Organisation7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sndr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Sender"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Potential sender of a message related to the life cyle of an account."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSender = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> Organisation7.mmObject();
			isDerived = false;
			xmlTag = "Sndr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Sender";
			definition = "Potential sender of a message related to the life cyle of an account.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentification40.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(Organisation7.mmFullLegalName, Organisation7.mmTradingName, Organisation7.mmCountryOfOperation, Organisation7.mmRegistrationDate, Organisation7.mmOperationalAddress,
						Organisation7.mmBusinessAddress, Organisation7.mmLegalAddress, Organisation7.mmOrganisationIdentification, Organisation7.mmRepresentativeOfficer, Organisation7.mmTreasuryManager, Organisation7.mmMainMandateHolder,
						Organisation7.mmSender);
				messageBuildingBlock_lazy = () -> Arrays.asList(AccountOpeningRequestV01.mmOrganisation);
				trace_lazy = () -> Organisation.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Organisation7";
				definition = "Information which describes the organisation.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "FullLglNm", required = true)
	public Max350Text getFullLegalName() {
		return fullLegalName;
	}

	public void setFullLegalName(Max350Text fullLegalName) {
		this.fullLegalName = fullLegalName;
	}

	@XmlElement(name = "TradgNm")
	public Max350Text getTradingName() {
		return tradingName;
	}

	public void setTradingName(Max350Text tradingName) {
		this.tradingName = tradingName;
	}

	@XmlElement(name = "CtryOfOpr", required = true)
	public CountryCode getCountryOfOperation() {
		return countryOfOperation;
	}

	public void setCountryOfOperation(CountryCode countryOfOperation) {
		this.countryOfOperation = countryOfOperation;
	}

	@XmlElement(name = "RegnDt", required = true)
	public ISODate getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(ISODate registrationDate) {
		this.registrationDate = registrationDate;
	}

	@XmlElement(name = "OprlAdr")
	public PostalAddress6 getOperationalAddress() {
		return operationalAddress;
	}

	public void setOperationalAddress(com.tools20022.repository.msg.PostalAddress6 operationalAddress) {
		this.operationalAddress = operationalAddress;
	}

	@XmlElement(name = "BizAdr")
	public PostalAddress6 getBusinessAddress() {
		return businessAddress;
	}

	public void setBusinessAddress(com.tools20022.repository.msg.PostalAddress6 businessAddress) {
		this.businessAddress = businessAddress;
	}

	@XmlElement(name = "LglAdr", required = true)
	public PostalAddress6 getLegalAddress() {
		return legalAddress;
	}

	public void setLegalAddress(com.tools20022.repository.msg.PostalAddress6 legalAddress) {
		this.legalAddress = legalAddress;
	}

	@XmlElement(name = "OrgId", required = true)
	public OrganisationIdentification6 getOrganisationIdentification() {
		return organisationIdentification;
	}

	public void setOrganisationIdentification(com.tools20022.repository.msg.OrganisationIdentification6 organisationIdentification) {
		this.organisationIdentification = organisationIdentification;
	}

	@XmlElement(name = "RprtvOffcr")
	public List<PartyIdentification40> getRepresentativeOfficer() {
		return representativeOfficer;
	}

	public void setRepresentativeOfficer(List<com.tools20022.repository.msg.PartyIdentification40> representativeOfficer) {
		this.representativeOfficer = representativeOfficer;
	}

	@XmlElement(name = "TrsrMgr")
	public PartyIdentification40 getTreasuryManager() {
		return treasuryManager;
	}

	public void setTreasuryManager(com.tools20022.repository.msg.PartyIdentification40 treasuryManager) {
		this.treasuryManager = treasuryManager;
	}

	@XmlElement(name = "MainMndtHldr")
	public List<PartyIdentification40> getMainMandateHolder() {
		return mainMandateHolder;
	}

	public void setMainMandateHolder(List<com.tools20022.repository.msg.PartyIdentification40> mainMandateHolder) {
		this.mainMandateHolder = mainMandateHolder;
	}

	@XmlElement(name = "Sndr")
	public List<PartyIdentification40> getSender() {
		return sender;
	}

	public void setSender(List<com.tools20022.repository.msg.PartyIdentification40> sender) {
		this.sender = sender;
	}
}