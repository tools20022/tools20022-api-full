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
import com.tools20022.repository.choice.CivilStatus1Choice;
import com.tools20022.repository.choice.NamePrefix1Choice;
import com.tools20022.repository.choice.PoliticalExposureType1Choice;
import com.tools20022.repository.codeset.CountryCode;
import com.tools20022.repository.codeset.GenderCode;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.EmployingPartyRole;
import com.tools20022.repository.entity.Person;
import com.tools20022.repository.entity.PostalAddress;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Human entity, as distinguished from a corporate entity (which is sometimes
 * referred to as an 'artificial person').
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson27#mmNamePrefix
 * IndividualPerson27.mmNamePrefix}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson27#mmGivenName
 * IndividualPerson27.mmGivenName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson27#mmMiddleName
 * IndividualPerson27.mmMiddleName}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson27#mmName
 * IndividualPerson27.mmName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson27#mmNameSuffix
 * IndividualPerson27.mmNameSuffix}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson27#mmGender
 * IndividualPerson27.mmGender}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson27#mmBirthDate
 * IndividualPerson27.mmBirthDate}</li>
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
 * {@linkplain com.tools20022.repository.msg.IndividualPerson27#mmProfession
 * IndividualPerson27.mmProfession}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson27#mmPostalAddress
 * IndividualPerson27.mmPostalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson27#mmCitizenship
 * IndividualPerson27.mmCitizenship}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson27#mmEmployingCompany
 * IndividualPerson27.mmEmployingCompany}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson27#mmBusinessFunction
 * IndividualPerson27.mmBusinessFunction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson27#mmPoliticallyExposedPersonType
 * IndividualPerson27.mmPoliticallyExposedPersonType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson27#mmDeathDate
 * IndividualPerson27.mmDeathDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson27#mmCivilStatus
 * IndividualPerson27.mmCivilStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson27#mmEducationLevel
 * IndividualPerson27.mmEducationLevel}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson27#mmFamilyInformation
 * IndividualPerson27.mmFamilyInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Person Person}</li>
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
 * "IndividualPerson27"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Human entity, as distinguished from a corporate entity (which is sometimes referred to as an 'artificial person')."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson28
 * IndividualPerson28}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson29
 * IndividualPerson29}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson34
 * IndividualPerson34}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.IndividualPerson23
 * IndividualPerson23}</li>
 * </ul>
 */
public class IndividualPerson27 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected NamePrefix1Choice namePrefix;
	/**
	 * Term used to address the person.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.NamePrefix1Choice
	 * NamePrefix1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PersonName#mmNamePrefix
	 * PersonName.mmNamePrefix}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson27
	 * IndividualPerson27}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NmPrfx"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NamePrefix"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Term used to address the person."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson28#mmNamePrefix
	 * IndividualPerson28.mmNamePrefix}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson29#mmNamePrefix
	 * IndividualPerson29.mmNamePrefix}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson34#mmNamePrefix
	 * IndividualPerson34.mmNamePrefix}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson23#mmNamePrefix
	 * IndividualPerson23.mmNamePrefix}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNamePrefix = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PersonName.mmNamePrefix;
			componentContext_lazy = () -> IndividualPerson27.mmObject();
			isDerived = false;
			xmlTag = "NmPrfx";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NamePrefix";
			definition = "Term used to address the person.";
			nextVersions_lazy = () -> Arrays
					.asList(com.tools20022.repository.msg.IndividualPerson28.mmNamePrefix, com.tools20022.repository.msg.IndividualPerson29.mmNamePrefix, com.tools20022.repository.msg.IndividualPerson34.mmNamePrefix);
			previousVersion_lazy = () -> com.tools20022.repository.msg.IndividualPerson23.mmNamePrefix;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> NamePrefix1Choice.mmObject();
		}
	};
	protected Max35Text givenName;
	/**
	 * First name of the person.
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
	 * {@linkplain com.tools20022.repository.entity.PersonName#mmGivenName
	 * PersonName.mmGivenName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson27
	 * IndividualPerson27}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GvnNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GivenName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "First name of the person."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson28#mmGivenName
	 * IndividualPerson28.mmGivenName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson29#mmGivenName
	 * IndividualPerson29.mmGivenName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson34#mmGivenName
	 * IndividualPerson34.mmGivenName}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson23#mmGivenName
	 * IndividualPerson23.mmGivenName}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmGivenName = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PersonName.mmGivenName;
			componentContext_lazy = () -> IndividualPerson27.mmObject();
			isDerived = false;
			xmlTag = "GvnNm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GivenName";
			definition = "First name of the person.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IndividualPerson28.mmGivenName, com.tools20022.repository.msg.IndividualPerson29.mmGivenName, com.tools20022.repository.msg.IndividualPerson34.mmGivenName);
			previousVersion_lazy = () -> com.tools20022.repository.msg.IndividualPerson23.mmGivenName;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text middleName;
	/**
	 * Second name of the person.
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
	 * {@linkplain com.tools20022.repository.entity.PersonName#mmMiddleName
	 * PersonName.mmMiddleName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson27
	 * IndividualPerson27}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MddlNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MiddleName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Second name of the person."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson28#mmMiddleName
	 * IndividualPerson28.mmMiddleName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson29#mmMiddleName
	 * IndividualPerson29.mmMiddleName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson34#mmMiddleName
	 * IndividualPerson34.mmMiddleName}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson23#mmMiddleName
	 * IndividualPerson23.mmMiddleName}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMiddleName = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PersonName.mmMiddleName;
			componentContext_lazy = () -> IndividualPerson27.mmObject();
			isDerived = false;
			xmlTag = "MddlNm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MiddleName";
			definition = "Second name of the person.";
			nextVersions_lazy = () -> Arrays
					.asList(com.tools20022.repository.msg.IndividualPerson28.mmMiddleName, com.tools20022.repository.msg.IndividualPerson29.mmMiddleName, com.tools20022.repository.msg.IndividualPerson34.mmMiddleName);
			previousVersion_lazy = () -> com.tools20022.repository.msg.IndividualPerson23.mmMiddleName;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max350Text name;
	/**
	 * Name by which the party is known and which is usually used to identify
	 * that person.
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
	 * {@linkplain com.tools20022.repository.entity.PersonName#mmBirthName
	 * PersonName.mmBirthName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson27
	 * IndividualPerson27}</li>
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
	 * "Name by which the party is known and which is usually used to identify that person."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson28#mmName
	 * IndividualPerson28.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson29#mmName
	 * IndividualPerson29.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson34#mmName
	 * IndividualPerson34.mmName}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson23#mmName
	 * IndividualPerson23.mmName}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmName = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PersonName.mmBirthName;
			componentContext_lazy = () -> IndividualPerson27.mmObject();
			isDerived = false;
			xmlTag = "Nm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Name";
			definition = "Name by which the party is known and which is usually used to identify that person.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IndividualPerson28.mmName, com.tools20022.repository.msg.IndividualPerson29.mmName, com.tools20022.repository.msg.IndividualPerson34.mmName);
			previousVersion_lazy = () -> com.tools20022.repository.msg.IndividualPerson23.mmName;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	protected Max35Text nameSuffix;
	/**
	 * Additional information about the person that follows a person's name, for
	 * example, qualification such as Doctor of Philosophy (PhD).
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
	 * {@linkplain com.tools20022.repository.entity.PersonName#mmNameSuffix
	 * PersonName.mmNameSuffix}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson27
	 * IndividualPerson27}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NmSfx"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NameSuffix"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information about the person that follows a person's name, for example, qualification such as Doctor of Philosophy (PhD)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson28#mmNameSuffix
	 * IndividualPerson28.mmNameSuffix}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson34#mmNameSuffix
	 * IndividualPerson34.mmNameSuffix}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson23#mmNameSuffix
	 * IndividualPerson23.mmNameSuffix}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNameSuffix = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PersonName.mmNameSuffix;
			componentContext_lazy = () -> IndividualPerson27.mmObject();
			isDerived = false;
			xmlTag = "NmSfx";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NameSuffix";
			definition = "Additional information about the person that follows a person's name, for example, qualification such as Doctor of Philosophy (PhD).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IndividualPerson28.mmNameSuffix, com.tools20022.repository.msg.IndividualPerson34.mmNameSuffix);
			previousVersion_lazy = () -> com.tools20022.repository.msg.IndividualPerson23.mmNameSuffix;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected GenderCode gender;
	/**
	 * Gender of the person.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.GenderCode
	 * GenderCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Person#mmGender
	 * Person.mmGender}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson27
	 * IndividualPerson27}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Gndr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Gender"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Gender of the person."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson28#mmGender
	 * IndividualPerson28.mmGender}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson34#mmGender
	 * IndividualPerson34.mmGender}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson23#mmGender
	 * IndividualPerson23.mmGender}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmGender = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Person.mmGender;
			componentContext_lazy = () -> IndividualPerson27.mmObject();
			isDerived = false;
			xmlTag = "Gndr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Gender";
			definition = "Gender of the person.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IndividualPerson28.mmGender, com.tools20022.repository.msg.IndividualPerson34.mmGender);
			previousVersion_lazy = () -> com.tools20022.repository.msg.IndividualPerson23.mmGender;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> GenderCode.mmObject();
		}
	};
	protected ISODate birthDate;
	/**
	 * Date on which the person was born.
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
	 * {@linkplain com.tools20022.repository.entity.Person#mmBirthDate
	 * Person.mmBirthDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson27
	 * IndividualPerson27}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BirthDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BirthDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date on which the person was born."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson28#mmBirthDate
	 * IndividualPerson28.mmBirthDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson34#mmBirthDate
	 * IndividualPerson34.mmBirthDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson23#mmBirthDate
	 * IndividualPerson23.mmBirthDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBirthDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Person.mmBirthDate;
			componentContext_lazy = () -> IndividualPerson27.mmObject();
			isDerived = false;
			xmlTag = "BirthDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BirthDate";
			definition = "Date on which the person was born.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IndividualPerson28.mmBirthDate, com.tools20022.repository.msg.IndividualPerson34.mmBirthDate);
			previousVersion_lazy = () -> com.tools20022.repository.msg.IndividualPerson23.mmBirthDate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected CountryCode countryOfBirth;
	/**
	 * Country where the person was born.
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
	 * {@linkplain com.tools20022.repository.entity.Person#mmPlaceOfBirth
	 * Person.mmPlaceOfBirth}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson27
	 * IndividualPerson27}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtryOfBirth"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CountryOfBirth"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Country where the person was born."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson28#mmCountryOfBirth
	 * IndividualPerson28.mmCountryOfBirth}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson34#mmCountryOfBirth
	 * IndividualPerson34.mmCountryOfBirth}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson23#mmCountryOfBirth
	 * IndividualPerson23.mmCountryOfBirth}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCountryOfBirth = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Person.mmPlaceOfBirth;
			componentContext_lazy = () -> IndividualPerson27.mmObject();
			isDerived = false;
			xmlTag = "CtryOfBirth";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CountryOfBirth";
			definition = "Country where the person was born.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IndividualPerson28.mmCountryOfBirth, com.tools20022.repository.msg.IndividualPerson34.mmCountryOfBirth);
			previousVersion_lazy = () -> com.tools20022.repository.msg.IndividualPerson23.mmCountryOfBirth;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CountryCode.mmObject();
		}
	};
	protected Max35Text provinceOfBirth;
	/**
	 * Province where the person was born.
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
	 * {@linkplain com.tools20022.repository.entity.Person#mmPlaceOfBirth
	 * Person.mmPlaceOfBirth}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson27
	 * IndividualPerson27}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrvcOfBirth"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProvinceOfBirth"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Province where the person was born."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson28#mmProvinceOfBirth
	 * IndividualPerson28.mmProvinceOfBirth}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson34#mmProvinceOfBirth
	 * IndividualPerson34.mmProvinceOfBirth}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson23#mmProvinceOfBirth
	 * IndividualPerson23.mmProvinceOfBirth}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmProvinceOfBirth = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Person.mmPlaceOfBirth;
			componentContext_lazy = () -> IndividualPerson27.mmObject();
			isDerived = false;
			xmlTag = "PrvcOfBirth";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProvinceOfBirth";
			definition = "Province where the person was born.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IndividualPerson28.mmProvinceOfBirth, com.tools20022.repository.msg.IndividualPerson34.mmProvinceOfBirth);
			previousVersion_lazy = () -> com.tools20022.repository.msg.IndividualPerson23.mmProvinceOfBirth;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text cityOfBirth;
	/**
	 * City where the person was born.
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
	 * {@linkplain com.tools20022.repository.entity.Person#mmPlaceOfBirth
	 * Person.mmPlaceOfBirth}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson27
	 * IndividualPerson27}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CityOfBirth"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CityOfBirth"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "City where the person was born."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson28#mmCityOfBirth
	 * IndividualPerson28.mmCityOfBirth}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson34#mmCityOfBirth
	 * IndividualPerson34.mmCityOfBirth}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson23#mmCityOfBirth
	 * IndividualPerson23.mmCityOfBirth}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCityOfBirth = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Person.mmPlaceOfBirth;
			componentContext_lazy = () -> IndividualPerson27.mmObject();
			isDerived = false;
			xmlTag = "CityOfBirth";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CityOfBirth";
			definition = "City where the person was born.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IndividualPerson28.mmCityOfBirth, com.tools20022.repository.msg.IndividualPerson34.mmCityOfBirth);
			previousVersion_lazy = () -> com.tools20022.repository.msg.IndividualPerson23.mmCityOfBirth;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text profession;
	/**
	 * Name of the occupation or job of the person.
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
	 * {@linkplain com.tools20022.repository.entity.Person#mmProfession
	 * Person.mmProfession}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson27
	 * IndividualPerson27}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Prfssn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Profession"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name of the occupation or job of the person."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson28#mmProfession
	 * IndividualPerson28.mmProfession}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson34#mmProfession
	 * IndividualPerson34.mmProfession}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson23#mmProfession
	 * IndividualPerson23.mmProfession}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmProfession = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Person.mmProfession;
			componentContext_lazy = () -> IndividualPerson27.mmObject();
			isDerived = false;
			xmlTag = "Prfssn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Profession";
			definition = "Name of the occupation or job of the person.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IndividualPerson28.mmProfession, com.tools20022.repository.msg.IndividualPerson34.mmProfession);
			previousVersion_lazy = () -> com.tools20022.repository.msg.IndividualPerson23.mmProfession;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.PostalAddress21> postalAddress;
	/**
	 * Address of the person.
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
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson27
	 * IndividualPerson27}</li>
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
	 * definition} = "Address of the person."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson29#mmPostalAddress
	 * IndividualPerson29.mmPostalAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson34#mmPostalAddress
	 * IndividualPerson34.mmPostalAddress}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson23#mmPostalAddress
	 * IndividualPerson23.mmPostalAddress}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPostalAddress = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> PostalAddress.mmObject();
			componentContext_lazy = () -> IndividualPerson27.mmObject();
			isDerived = false;
			xmlTag = "PstlAdr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PostalAddress";
			definition = "Address of the person.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IndividualPerson29.mmPostalAddress, com.tools20022.repository.msg.IndividualPerson34.mmPostalAddress);
			previousVersion_lazy = () -> com.tools20022.repository.msg.IndividualPerson23.mmPostalAddress;
			maxOccurs = 10;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PostalAddress21.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.CitizenshipInformation> citizenship;
	/**
	 * Nationality and legal status (minor or major) or rights that an
	 * individual may possess.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CitizenshipInformation
	 * CitizenshipInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Person#mmNationality
	 * Person.mmNationality}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson27
	 * IndividualPerson27}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ctznsh"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Citizenship"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Nationality and legal status (minor or major) or rights that an individual may possess."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson34#mmCitizenship
	 * IndividualPerson34.mmCitizenship}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson23#mmCitizenship
	 * IndividualPerson23.mmCitizenship}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCitizenship = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Person.mmNationality;
			componentContext_lazy = () -> IndividualPerson27.mmObject();
			isDerived = false;
			xmlTag = "Ctznsh";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Citizenship";
			definition = "Nationality and legal status (minor or major) or rights that an individual may possess.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IndividualPerson34.mmCitizenship);
			previousVersion_lazy = () -> com.tools20022.repository.msg.IndividualPerson23.mmCitizenship;
			maxOccurs = 3;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CitizenshipInformation.mmObject();
		}
	};
	protected Max140Text employingCompany;
	/**
	 * Organisation represented by a person, or for which a person works.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.EmployingPartyRole
	 * EmployingPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson27
	 * IndividualPerson27}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EmplngCpny"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EmployingCompany"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Organisation represented by a person, or for which a person works."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson28#mmEmployingCompany
	 * IndividualPerson28.mmEmployingCompany}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson34#mmEmployingCompany
	 * IndividualPerson34.mmEmployingCompany}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson23#mmEmployingCompany
	 * IndividualPerson23.mmEmployingCompany}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEmployingCompany = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> EmployingPartyRole.mmObject();
			componentContext_lazy = () -> IndividualPerson27.mmObject();
			isDerived = false;
			xmlTag = "EmplngCpny";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EmployingCompany";
			definition = "Organisation represented by a person, or for which a person works.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IndividualPerson28.mmEmployingCompany, com.tools20022.repository.msg.IndividualPerson34.mmEmployingCompany);
			previousVersion_lazy = () -> com.tools20022.repository.msg.IndividualPerson23.mmEmployingCompany;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};
	protected Max35Text businessFunction;
	/**
	 * Title of the function.
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
	 * {@linkplain com.tools20022.repository.entity.Person#mmBusinessFunctionTitle
	 * Person.mmBusinessFunctionTitle}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson27
	 * IndividualPerson27}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BizFctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BusinessFunction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Title of the function."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson28#mmBusinessFunction
	 * IndividualPerson28.mmBusinessFunction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson34#mmBusinessFunction
	 * IndividualPerson34.mmBusinessFunction}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson23#mmBusinessFunction
	 * IndividualPerson23.mmBusinessFunction}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBusinessFunction = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Person.mmBusinessFunctionTitle;
			componentContext_lazy = () -> IndividualPerson27.mmObject();
			isDerived = false;
			xmlTag = "BizFctn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BusinessFunction";
			definition = "Title of the function.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IndividualPerson28.mmBusinessFunction, com.tools20022.repository.msg.IndividualPerson34.mmBusinessFunction);
			previousVersion_lazy = () -> com.tools20022.repository.msg.IndividualPerson23.mmBusinessFunction;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected PoliticalExposureType1Choice politicallyExposedPersonType;
	/**
	 * Specifies if due diligence checks on the political exposure of the
	 * investor or account servicer have been carried out and whether these
	 * checks are national or foreign. (A politically exposed person is someone
	 * who has been entrusted with a prominent public function, or an individual
	 * who is closely related to such a person.)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PoliticalExposureType1Choice
	 * PoliticalExposureType1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PersonProfile#mmPoliticalExposureType
	 * PersonProfile.mmPoliticalExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson27
	 * IndividualPerson27}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PltclyXpsdPrsnTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PoliticallyExposedPersonType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies if due diligence checks on the political exposure of the investor or account servicer have been carried out and whether these checks are national or foreign. (A politically exposed person is someone who has been entrusted with a prominent public function, or an individual who is closely related to such a person.)"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson28#mmPoliticallyExposedPersonType
	 * IndividualPerson28.mmPoliticallyExposedPersonType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson34#mmPoliticallyExposedPersonType
	 * IndividualPerson34.mmPoliticallyExposedPersonType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson23#mmPoliticallyExposedPersonType
	 * IndividualPerson23.mmPoliticallyExposedPersonType}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPoliticallyExposedPersonType = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PersonProfile.mmPoliticalExposureType;
			componentContext_lazy = () -> IndividualPerson27.mmObject();
			isDerived = false;
			xmlTag = "PltclyXpsdPrsnTp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PoliticallyExposedPersonType";
			definition = "Specifies if due diligence checks on the political exposure of the investor or account servicer have been carried out and whether these checks are national or foreign. (A politically exposed person is someone who has been entrusted with a prominent public function, or an individual who is closely related to such a person.)";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IndividualPerson28.mmPoliticallyExposedPersonType, com.tools20022.repository.msg.IndividualPerson34.mmPoliticallyExposedPersonType);
			previousVersion_lazy = () -> com.tools20022.repository.msg.IndividualPerson23.mmPoliticallyExposedPersonType;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PoliticalExposureType1Choice.mmObject();
		}
	};
	protected ISODate deathDate;
	/**
	 * Date of death.
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
	 * {@linkplain com.tools20022.repository.entity.Person#mmDeathDate
	 * Person.mmDeathDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson27
	 * IndividualPerson27}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DthDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeathDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date of death."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson28#mmDeathDate
	 * IndividualPerson28.mmDeathDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson34#mmDeathDate
	 * IndividualPerson34.mmDeathDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDeathDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Person.mmDeathDate;
			componentContext_lazy = () -> IndividualPerson27.mmObject();
			isDerived = false;
			xmlTag = "DthDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeathDate";
			definition = "Date of death.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IndividualPerson28.mmDeathDate, com.tools20022.repository.msg.IndividualPerson34.mmDeathDate);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected CivilStatus1Choice civilStatus;
	/**
	 * Civil status of the individual person.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.CivilStatus1Choice
	 * CivilStatus1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Person#mmCivilStatus
	 * Person.mmCivilStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson27
	 * IndividualPerson27}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CvlSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CivilStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Civil status of the individual person."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson28#mmCivilStatus
	 * IndividualPerson28.mmCivilStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson34#mmCivilStatus
	 * IndividualPerson34.mmCivilStatus}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCivilStatus = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Person.mmCivilStatus;
			componentContext_lazy = () -> IndividualPerson27.mmObject();
			isDerived = false;
			xmlTag = "CvlSts";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CivilStatus";
			definition = "Civil status of the individual person.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IndividualPerson28.mmCivilStatus, com.tools20022.repository.msg.IndividualPerson34.mmCivilStatus);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CivilStatus1Choice.mmObject();
		}
	};
	protected Max35Text educationLevel;
	/**
	 * Highest level of education reached by the individual person.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson27
	 * IndividualPerson27}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EdctnLvl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EducationLevel"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Highest level of education reached by the individual person."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson28#mmEducationLevel
	 * IndividualPerson28.mmEducationLevel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson34#mmEducationLevel
	 * IndividualPerson34.mmEducationLevel}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEducationLevel = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> IndividualPerson27.mmObject();
			isDerived = false;
			xmlTag = "EdctnLvl";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EducationLevel";
			definition = "Highest level of education reached by the individual person.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IndividualPerson28.mmEducationLevel, com.tools20022.repository.msg.IndividualPerson34.mmEducationLevel);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected PersonalInformation1 familyInformation;
	/**
	 * Information related to the person.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PersonalInformation1
	 * PersonalInformation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Person Person}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson27
	 * IndividualPerson27}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FmlyInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FamilyInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information related to the person."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson28#mmFamilyInformation
	 * IndividualPerson28.mmFamilyInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson34#mmFamilyInformation
	 * IndividualPerson34.mmFamilyInformation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFamilyInformation = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Person.mmObject();
			componentContext_lazy = () -> IndividualPerson27.mmObject();
			isDerived = false;
			xmlTag = "FmlyInf";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FamilyInformation";
			definition = "Information related to the person.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IndividualPerson28.mmFamilyInformation, com.tools20022.repository.msg.IndividualPerson34.mmFamilyInformation);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PersonalInformation1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IndividualPerson27.mmNamePrefix, com.tools20022.repository.msg.IndividualPerson27.mmGivenName,
						com.tools20022.repository.msg.IndividualPerson27.mmMiddleName, com.tools20022.repository.msg.IndividualPerson27.mmName, com.tools20022.repository.msg.IndividualPerson27.mmNameSuffix,
						com.tools20022.repository.msg.IndividualPerson27.mmGender, com.tools20022.repository.msg.IndividualPerson27.mmBirthDate, com.tools20022.repository.msg.IndividualPerson27.mmCountryOfBirth,
						com.tools20022.repository.msg.IndividualPerson27.mmProvinceOfBirth, com.tools20022.repository.msg.IndividualPerson27.mmCityOfBirth, com.tools20022.repository.msg.IndividualPerson27.mmProfession,
						com.tools20022.repository.msg.IndividualPerson27.mmPostalAddress, com.tools20022.repository.msg.IndividualPerson27.mmCitizenship, com.tools20022.repository.msg.IndividualPerson27.mmEmployingCompany,
						com.tools20022.repository.msg.IndividualPerson27.mmBusinessFunction, com.tools20022.repository.msg.IndividualPerson27.mmPoliticallyExposedPersonType, com.tools20022.repository.msg.IndividualPerson27.mmDeathDate,
						com.tools20022.repository.msg.IndividualPerson27.mmCivilStatus, com.tools20022.repository.msg.IndividualPerson27.mmEducationLevel, com.tools20022.repository.msg.IndividualPerson27.mmFamilyInformation);
				trace_lazy = () -> Person.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "IndividualPerson27";
				definition = "Human entity, as distinguished from a corporate entity (which is sometimes referred to as an 'artificial person').";
				nextVersions_lazy = () -> Arrays.asList(IndividualPerson28.mmObject(), IndividualPerson29.mmObject(), IndividualPerson34.mmObject());
				previousVersion_lazy = () -> IndividualPerson23.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public NamePrefix1Choice getNamePrefix() {
		return namePrefix;
	}

	public void setNamePrefix(NamePrefix1Choice namePrefix) {
		this.namePrefix = namePrefix;
	}

	public Max35Text getGivenName() {
		return givenName;
	}

	public void setGivenName(Max35Text givenName) {
		this.givenName = givenName;
	}

	public Max35Text getMiddleName() {
		return middleName;
	}

	public void setMiddleName(Max35Text middleName) {
		this.middleName = middleName;
	}

	public Max350Text getName() {
		return name;
	}

	public void setName(Max350Text name) {
		this.name = name;
	}

	public Max35Text getNameSuffix() {
		return nameSuffix;
	}

	public void setNameSuffix(Max35Text nameSuffix) {
		this.nameSuffix = nameSuffix;
	}

	public GenderCode getGender() {
		return gender;
	}

	public void setGender(GenderCode gender) {
		this.gender = gender;
	}

	public ISODate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(ISODate birthDate) {
		this.birthDate = birthDate;
	}

	public CountryCode getCountryOfBirth() {
		return countryOfBirth;
	}

	public void setCountryOfBirth(CountryCode countryOfBirth) {
		this.countryOfBirth = countryOfBirth;
	}

	public Max35Text getProvinceOfBirth() {
		return provinceOfBirth;
	}

	public void setProvinceOfBirth(Max35Text provinceOfBirth) {
		this.provinceOfBirth = provinceOfBirth;
	}

	public Max35Text getCityOfBirth() {
		return cityOfBirth;
	}

	public void setCityOfBirth(Max35Text cityOfBirth) {
		this.cityOfBirth = cityOfBirth;
	}

	public Max35Text getProfession() {
		return profession;
	}

	public void setProfession(Max35Text profession) {
		this.profession = profession;
	}

	public List<PostalAddress21> getPostalAddress() {
		return postalAddress;
	}

	public void setPostalAddress(List<com.tools20022.repository.msg.PostalAddress21> postalAddress) {
		this.postalAddress = postalAddress;
	}

	public List<CitizenshipInformation> getCitizenship() {
		return citizenship;
	}

	public void setCitizenship(List<com.tools20022.repository.msg.CitizenshipInformation> citizenship) {
		this.citizenship = citizenship;
	}

	public Max140Text getEmployingCompany() {
		return employingCompany;
	}

	public void setEmployingCompany(Max140Text employingCompany) {
		this.employingCompany = employingCompany;
	}

	public Max35Text getBusinessFunction() {
		return businessFunction;
	}

	public void setBusinessFunction(Max35Text businessFunction) {
		this.businessFunction = businessFunction;
	}

	public PoliticalExposureType1Choice getPoliticallyExposedPersonType() {
		return politicallyExposedPersonType;
	}

	public void setPoliticallyExposedPersonType(PoliticalExposureType1Choice politicallyExposedPersonType) {
		this.politicallyExposedPersonType = politicallyExposedPersonType;
	}

	public ISODate getDeathDate() {
		return deathDate;
	}

	public void setDeathDate(ISODate deathDate) {
		this.deathDate = deathDate;
	}

	public CivilStatus1Choice getCivilStatus() {
		return civilStatus;
	}

	public void setCivilStatus(CivilStatus1Choice civilStatus) {
		this.civilStatus = civilStatus;
	}

	public Max35Text getEducationLevel() {
		return educationLevel;
	}

	public void setEducationLevel(Max35Text educationLevel) {
		this.educationLevel = educationLevel;
	}

	public PersonalInformation1 getFamilyInformation() {
		return familyInformation;
	}

	public void setFamilyInformation(com.tools20022.repository.msg.PersonalInformation1 familyInformation) {
		this.familyInformation = familyInformation;
	}
}