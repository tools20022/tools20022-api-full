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
import com.tools20022.repository.choice.OrganisationType1Choice;
import com.tools20022.repository.choice.PartyIdentification72Choice;
import com.tools20022.repository.codeset.CountryCode;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.LEIIdentifier;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.Organisation;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Organised structure that is set up for a particular purpose, for example, a
 * business, government body, department, charity, or financial institution.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Organisation24#Name
 * Organisation24.Name}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Organisation24#ShortName
 * Organisation24.ShortName}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Organisation24#Identification
 * Organisation24.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Organisation24#LegalEntityIdentifier
 * Organisation24.LegalEntityIdentifier}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Organisation24#Purpose
 * Organisation24.Purpose}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Organisation24#RegistrationCountry
 * Organisation24.RegistrationCountry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Organisation24#RegistrationDate
 * Organisation24.RegistrationDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Organisation24#PostalAddress
 * Organisation24.PostalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Organisation24#TypeOfOrganisation
 * Organisation24.TypeOfOrganisation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Organisation
 * Organisation}</li>
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
 * "Organisation24"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Organised structure that is set up for a particular purpose, for example, a business, government body, department, charity, or financial institution."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Organisation22 Organisation22}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Organisation23 Organisation23}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Organisation30 Organisation30}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.Organisation16
 * Organisation16}</li>
 * </ul>
 */
public class Organisation24 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
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
	 * {@linkplain com.tools20022.repository.entity.PartyName#Name
	 * PartyName.Name}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Organisation24 Organisation24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Nm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Name"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Name by which a party is known and which is usually used to identify that party."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Organisation22#Name
	 * Organisation22.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Organisation23#Name
	 * Organisation23.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Organisation30#Name
	 * Organisation30.Name}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Organisation16#Name
	 * Organisation16.Name}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute Name = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Organisation24.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PartyName.Name;
			isDerived = false;
			xmlTag = "Nm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Name";
			definition = "Name by which a party is known and which is usually used to identify that party.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.Organisation16.Name;
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Organisation22.Name, com.tools20022.repository.msg.Organisation23.Name, com.tools20022.repository.msg.Organisation30.Name);
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	/**
	 * Name of the organisation in short form.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationName#ShortName
	 * OrganisationName.ShortName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Organisation24 Organisation24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ShrtNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShortName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name of the organisation in short form."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Organisation23#ShortName
	 * Organisation23.ShortName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Organisation30#ShortName
	 * Organisation30.ShortName}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute ShortName = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Organisation24.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.OrganisationName.ShortName;
			isDerived = false;
			xmlTag = "ShrtNm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShortName";
			definition = "Name of the organisation in short form.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Organisation23.ShortName, com.tools20022.repository.msg.Organisation30.ShortName);
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Unique and unambiguous identifier for the organisation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification72Choice
	 * PartyIdentification72Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#Identification
	 * Party.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Organisation24 Organisation24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Id"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unique and unambiguous identifier for the organisation."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation22#Identification
	 * Organisation22.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation30#Identification
	 * Organisation30.Identification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Organisation16#Identification
	 * Organisation16.Identification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute Identification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Organisation24.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Party.Identification;
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Unique and unambiguous identifier for the organisation.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.Organisation16.Identification;
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Organisation22.Identification, com.tools20022.repository.msg.Organisation30.Identification);
			minOccurs = 0;
			maxOccurs = 1;
			complexType_lazy = () -> PartyIdentification72Choice.mmObject();
		}
	};
	/**
	 * Identification of the organisation with a Legal Entity Identifier. This
	 * is a code allocated to a party as described in ISO 17442
	 * "Financial Services - Legal Entity Identifier (LEI)".
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.LEIIdentifier
	 * LEIIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#LEI
	 * PartyIdentificationInformation.LEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Organisation24 Organisation24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LglNttyIdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LegalEntityIdentifier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the organisation with a Legal Entity Identifier. This is a code allocated to a party as described in ISO 17442 \"Financial Services - Legal Entity Identifier (LEI)\"."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation22#LegalEntityIdentifier
	 * Organisation22.LegalEntityIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation30#LegalEntityIdentifier
	 * Organisation30.LegalEntityIdentifier}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute LegalEntityIdentifier = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Organisation24.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PartyIdentificationInformation.LEI;
			isDerived = false;
			xmlTag = "LglNttyIdr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegalEntityIdentifier";
			definition = "Identification of the organisation with a Legal Entity Identifier. This is a code allocated to a party as described in ISO 17442 \"Financial Services - Legal Entity Identifier (LEI)\".";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Organisation22.LegalEntityIdentifier, com.tools20022.repository.msg.Organisation30.LegalEntityIdentifier);
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> LEIIdentifier.mmObject();
		}
	};
	/**
	 * Purpose of the organisation, for example, charity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#Purpose
	 * Organisation.Purpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Organisation24 Organisation24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Purp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Purpose"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Purpose of the organisation, for example, charity."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Organisation22#Purpose
	 * Organisation22.Purpose}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Organisation30#Purpose
	 * Organisation30.Purpose}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Organisation16#Purpose
	 * Organisation16.Purpose}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute Purpose = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Organisation24.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Organisation.Purpose;
			isDerived = false;
			xmlTag = "Purp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Purpose";
			definition = "Purpose of the organisation, for example, charity.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.Organisation16.Purpose;
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Organisation22.Purpose, com.tools20022.repository.msg.Organisation30.Purpose);
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Country in which the organisation is registered.
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
	 * {@linkplain com.tools20022.repository.entity.Country#Code Country.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Organisation24 Organisation24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RegnCtry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegistrationCountry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Country in which the organisation is registered."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation22#RegistrationCountry
	 * Organisation22.RegistrationCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation30#RegistrationCountry
	 * Organisation30.RegistrationCountry}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Organisation16#RegistrationCountry
	 * Organisation16.RegistrationCountry}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute RegistrationCountry = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Organisation24.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Country.Code;
			isDerived = false;
			xmlTag = "RegnCtry";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegistrationCountry";
			definition = "Country in which the organisation is registered.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.Organisation16.RegistrationCountry;
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Organisation22.RegistrationCountry, com.tools20022.repository.msg.Organisation30.RegistrationCountry);
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> CountryCode.mmObject();
		}
	};
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
	 * {@linkplain com.tools20022.repository.entity.Organisation#RegistrationDate
	 * Organisation.RegistrationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Organisation24 Organisation24}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation22#RegistrationDate
	 * Organisation22.RegistrationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation30#RegistrationDate
	 * Organisation30.RegistrationDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Organisation16#RegistrationDate
	 * Organisation16.RegistrationDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute RegistrationDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Organisation24.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Organisation.RegistrationDate;
			isDerived = false;
			xmlTag = "RegnDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegistrationDate";
			definition = "Date and time at which a given organisation was officially registered.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.Organisation16.RegistrationDate;
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Organisation22.RegistrationDate, com.tools20022.repository.msg.Organisation30.RegistrationDate);
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Information that locates and identifies a specific address, as defined by
	 * postal services.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PostalAddress21
	 * PostalAddress21}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress PostalAddress}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Organisation24 Organisation24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PstlAdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PostalAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information that locates and identifies a specific address, as defined by postal services."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation23#PostalAddress
	 * Organisation23.PostalAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation30#PostalAddress
	 * Organisation30.PostalAddress}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Organisation16#PostalAddress
	 * Organisation16.PostalAddress}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd PostalAddress = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> Organisation24.mmObject();
			businessComponentTrace_lazy = () -> com.tools20022.repository.entity.PostalAddress.mmObject();
			isDerived = false;
			xmlTag = "PstlAdr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PostalAddress";
			definition = "Information that locates and identifies a specific address, as defined by postal services.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.Organisation16.PostalAddress;
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Organisation23.PostalAddress, com.tools20022.repository.msg.Organisation30.PostalAddress);
			minOccurs = 1;
			maxOccurs = 10;
			type_lazy = () -> PostalAddress21.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Type of organisation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.OrganisationType1Choice
	 * OrganisationType1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Organisation24 Organisation24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TpOfOrg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TypeOfOrganisation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of organisation."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation22#TypeOfOrganisation
	 * Organisation22.TypeOfOrganisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation30#TypeOfOrganisation
	 * Organisation30.TypeOfOrganisation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd TypeOfOrganisation = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> Organisation24.mmObject();
			isDerived = false;
			xmlTag = "TpOfOrg";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TypeOfOrganisation";
			definition = "Type of organisation.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Organisation22.TypeOfOrganisation, com.tools20022.repository.msg.Organisation30.TypeOfOrganisation);
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> OrganisationType1Choice.mmObject();
			isComposite = true;
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Organisation24.Name, com.tools20022.repository.msg.Organisation24.ShortName, com.tools20022.repository.msg.Organisation24.Identification,
						com.tools20022.repository.msg.Organisation24.LegalEntityIdentifier, com.tools20022.repository.msg.Organisation24.Purpose, com.tools20022.repository.msg.Organisation24.RegistrationCountry,
						com.tools20022.repository.msg.Organisation24.RegistrationDate, com.tools20022.repository.msg.Organisation24.PostalAddress, com.tools20022.repository.msg.Organisation24.TypeOfOrganisation);
				trace_lazy = () -> Organisation.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Organisation24";
				definition = "Organised structure that is set up for a particular purpose, for example, a business, government body, department, charity, or financial institution.";
				previousVersion_lazy = () -> Organisation16.mmObject();
				nextVersions_lazy = () -> Arrays.asList(Organisation22.mmObject(), Organisation23.mmObject(), Organisation30.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}