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
import com.tools20022.repository.choice.CivilStatus1Choice;
import com.tools20022.repository.choice.NamePrefix1Choice;
import com.tools20022.repository.choice.PoliticalExposureType1Choice;
import com.tools20022.repository.codeset.CountryCode;
import com.tools20022.repository.codeset.Gender1Code;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

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
 * {@linkplain com.tools20022.repository.msg.IndividualPerson33#mmNamePrefix
 * IndividualPerson33.mmNamePrefix}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson33#mmGivenName
 * IndividualPerson33.mmGivenName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson33#mmMiddleName
 * IndividualPerson33.mmMiddleName}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson33#mmName
 * IndividualPerson33.mmName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson33#mmNameSuffix
 * IndividualPerson33.mmNameSuffix}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson33#mmGender
 * IndividualPerson33.mmGender}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson33#mmBirthDate
 * IndividualPerson33.mmBirthDate}</li>
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
 * {@linkplain com.tools20022.repository.msg.IndividualPerson33#mmProfession
 * IndividualPerson33.mmProfession}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson33#mmModifiedPostalAddress
 * IndividualPerson33.mmModifiedPostalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson33#mmModifiedCitizenship
 * IndividualPerson33.mmModifiedCitizenship}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson33#mmEmployingCompany
 * IndividualPerson33.mmEmployingCompany}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson33#mmBusinessFunction
 * IndividualPerson33.mmBusinessFunction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson33#mmPoliticallyExposedPersonType
 * IndividualPerson33.mmPoliticallyExposedPersonType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson33#mmDeathDate
 * IndividualPerson33.mmDeathDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson33#mmCivilStatus
 * IndividualPerson33.mmCivilStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson33#mmEducationLevel
 * IndividualPerson33.mmEducationLevel}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson33#mmFamilyInformation
 * IndividualPerson33.mmFamilyInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Person Person}</li>
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
 * "IndividualPerson33"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Human entity, as distinguished from a corporate entity (which is sometimes referred to as an 'artificial person')."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.IndividualPerson28
 * IndividualPerson28}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "IndividualPerson33", propOrder = {"namePrefix", "givenName", "middleName", "name", "nameSuffix", "gender", "birthDate", "countryOfBirth", "provinceOfBirth", "cityOfBirth", "profession", "modifiedPostalAddress",
		"modifiedCitizenship", "employingCompany", "businessFunction", "politicallyExposedPersonType", "deathDate", "civilStatus", "educationLevel", "familyInformation"})
public class IndividualPerson33 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "NmPrfx")
	protected NamePrefix1Choice namePrefix;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson33
	 * IndividualPerson33}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson28#mmNamePrefix
	 * IndividualPerson28.mmNamePrefix}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNamePrefix = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PersonName.mmNamePrefix;
			componentContext_lazy = () -> com.tools20022.repository.msg.IndividualPerson33.mmObject();
			isDerived = false;
			xmlTag = "NmPrfx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NamePrefix";
			definition = "Term used to address the person.";
			previousVersion_lazy = () -> IndividualPerson28.mmNamePrefix;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> NamePrefix1Choice.mmObject();
		}
	};
	@XmlElement(name = "GvnNm")
	protected Max35Text givenName;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson33
	 * IndividualPerson33}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson28#mmGivenName
	 * IndividualPerson28.mmGivenName}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmGivenName = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PersonName.mmGivenName;
			componentContext_lazy = () -> com.tools20022.repository.msg.IndividualPerson33.mmObject();
			isDerived = false;
			xmlTag = "GvnNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GivenName";
			definition = "First name of the person.";
			previousVersion_lazy = () -> IndividualPerson28.mmGivenName;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "MddlNm")
	protected Max35Text middleName;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson33
	 * IndividualPerson33}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson28#mmMiddleName
	 * IndividualPerson28.mmMiddleName}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMiddleName = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PersonName.mmMiddleName;
			componentContext_lazy = () -> com.tools20022.repository.msg.IndividualPerson33.mmObject();
			isDerived = false;
			xmlTag = "MddlNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MiddleName";
			definition = "Second name of the person.";
			previousVersion_lazy = () -> IndividualPerson28.mmMiddleName;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "Nm", required = true)
	protected Max350Text name;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson33
	 * IndividualPerson33}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson28#mmName
	 * IndividualPerson28.mmName}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmName = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PersonName.mmBirthName;
			componentContext_lazy = () -> com.tools20022.repository.msg.IndividualPerson33.mmObject();
			isDerived = false;
			xmlTag = "Nm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Name";
			definition = "Name by which the party is known and which is usually used to identify that person.";
			previousVersion_lazy = () -> IndividualPerson28.mmName;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	@XmlElement(name = "NmSfx")
	protected Max35Text nameSuffix;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson33
	 * IndividualPerson33}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson28#mmNameSuffix
	 * IndividualPerson28.mmNameSuffix}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNameSuffix = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PersonName.mmNameSuffix;
			componentContext_lazy = () -> com.tools20022.repository.msg.IndividualPerson33.mmObject();
			isDerived = false;
			xmlTag = "NmSfx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NameSuffix";
			definition = "Additional information about the person that follows a person's name, for example, qualification such as Doctor of Philosophy (PhD).";
			previousVersion_lazy = () -> IndividualPerson28.mmNameSuffix;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "Gndr")
	protected Gender1Code gender;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.Gender1Code
	 * Gender1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Person#mmGender
	 * Person.mmGender}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson33
	 * IndividualPerson33}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson28#mmGender
	 * IndividualPerson28.mmGender}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmGender = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Person.mmGender;
			componentContext_lazy = () -> com.tools20022.repository.msg.IndividualPerson33.mmObject();
			isDerived = false;
			xmlTag = "Gndr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Gender";
			definition = "Gender of the person.";
			previousVersion_lazy = () -> IndividualPerson28.mmGender;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Gender1Code.mmObject();
		}
	};
	@XmlElement(name = "BirthDt")
	protected ISODate birthDate;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson33
	 * IndividualPerson33}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson28#mmBirthDate
	 * IndividualPerson28.mmBirthDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBirthDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Person.mmBirthDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.IndividualPerson33.mmObject();
			isDerived = false;
			xmlTag = "BirthDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BirthDate";
			definition = "Date on which the person was born.";
			previousVersion_lazy = () -> IndividualPerson28.mmBirthDate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	@XmlElement(name = "CtryOfBirth")
	protected CountryCode countryOfBirth;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson33
	 * IndividualPerson33}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson28#mmCountryOfBirth
	 * IndividualPerson28.mmCountryOfBirth}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCountryOfBirth = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Person.mmPlaceOfBirth;
			componentContext_lazy = () -> com.tools20022.repository.msg.IndividualPerson33.mmObject();
			isDerived = false;
			xmlTag = "CtryOfBirth";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CountryOfBirth";
			definition = "Country where the person was born.";
			previousVersion_lazy = () -> IndividualPerson28.mmCountryOfBirth;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CountryCode.mmObject();
		}
	};
	@XmlElement(name = "PrvcOfBirth")
	protected Max35Text provinceOfBirth;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson33
	 * IndividualPerson33}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson28#mmProvinceOfBirth
	 * IndividualPerson28.mmProvinceOfBirth}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmProvinceOfBirth = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Person.mmPlaceOfBirth;
			componentContext_lazy = () -> com.tools20022.repository.msg.IndividualPerson33.mmObject();
			isDerived = false;
			xmlTag = "PrvcOfBirth";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProvinceOfBirth";
			definition = "Province where the person was born.";
			previousVersion_lazy = () -> IndividualPerson28.mmProvinceOfBirth;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "CityOfBirth")
	protected Max35Text cityOfBirth;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson33
	 * IndividualPerson33}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson28#mmCityOfBirth
	 * IndividualPerson28.mmCityOfBirth}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCityOfBirth = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Person.mmPlaceOfBirth;
			componentContext_lazy = () -> com.tools20022.repository.msg.IndividualPerson33.mmObject();
			isDerived = false;
			xmlTag = "CityOfBirth";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CityOfBirth";
			definition = "City where the person was born.";
			previousVersion_lazy = () -> IndividualPerson28.mmCityOfBirth;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "Prfssn")
	protected Max35Text profession;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson33
	 * IndividualPerson33}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson28#mmProfession
	 * IndividualPerson28.mmProfession}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmProfession = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Person.mmProfession;
			componentContext_lazy = () -> com.tools20022.repository.msg.IndividualPerson33.mmObject();
			isDerived = false;
			xmlTag = "Prfssn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Profession";
			definition = "Name of the occupation or job of the person.";
			previousVersion_lazy = () -> IndividualPerson28.mmProfession;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "ModfdPstlAdr")
	protected List<com.tools20022.repository.msg.ModificationScope34> modifiedPostalAddress;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ModificationScope34
	 * ModificationScope34}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Location#mmAddress
	 * Location.mmAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson33
	 * IndividualPerson33}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ModfdPstlAdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ModifiedPostalAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information related to an address to be inserted, updated or deleted."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson28#mmModifiedPostalAddress
	 * IndividualPerson28.mmModifiedPostalAddress}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmModifiedPostalAddress = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Location.mmAddress;
			componentContext_lazy = () -> com.tools20022.repository.msg.IndividualPerson33.mmObject();
			isDerived = false;
			xmlTag = "ModfdPstlAdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ModifiedPostalAddress";
			definition = "Information related to an address to be inserted, updated or deleted.";
			previousVersion_lazy = () -> IndividualPerson28.mmModifiedPostalAddress;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ModificationScope34.mmObject();
		}
	};
	@XmlElement(name = "ModfdCtznsh")
	protected List<com.tools20022.repository.msg.ModificationScope39> modifiedCitizenship;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ModificationScope39
	 * ModificationScope39}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Person#mmNationality
	 * Person.mmNationality}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson33
	 * IndividualPerson33}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ModfdCtznsh"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ModifiedCitizenship"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Citizenship information to be inserted or deleted."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson28#mmModifiedCitizenship
	 * IndividualPerson28.mmModifiedCitizenship}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmModifiedCitizenship = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Person.mmNationality;
			componentContext_lazy = () -> com.tools20022.repository.msg.IndividualPerson33.mmObject();
			isDerived = false;
			xmlTag = "ModfdCtznsh";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ModifiedCitizenship";
			definition = "Citizenship information to be inserted or deleted.";
			previousVersion_lazy = () -> IndividualPerson28.mmModifiedCitizenship;
			maxOccurs = 3;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ModificationScope39.mmObject();
		}
	};
	@XmlElement(name = "EmplngCpny")
	protected Max140Text employingCompany;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson33
	 * IndividualPerson33}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson28#mmEmployingCompany
	 * IndividualPerson28.mmEmployingCompany}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEmployingCompany = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> EmployingPartyRole.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.IndividualPerson33.mmObject();
			isDerived = false;
			xmlTag = "EmplngCpny";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EmployingCompany";
			definition = "Organisation represented by a person, or for which a person works.";
			previousVersion_lazy = () -> IndividualPerson28.mmEmployingCompany;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};
	@XmlElement(name = "BizFctn")
	protected Max35Text businessFunction;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson33
	 * IndividualPerson33}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson28#mmBusinessFunction
	 * IndividualPerson28.mmBusinessFunction}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBusinessFunction = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Person.mmBusinessFunctionTitle;
			componentContext_lazy = () -> com.tools20022.repository.msg.IndividualPerson33.mmObject();
			isDerived = false;
			xmlTag = "BizFctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BusinessFunction";
			definition = "Title of the function.";
			previousVersion_lazy = () -> IndividualPerson28.mmBusinessFunction;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "PltclyXpsdPrsnTp")
	protected PoliticalExposureType1Choice politicallyExposedPersonType;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson33
	 * IndividualPerson33}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson28#mmPoliticallyExposedPersonType
	 * IndividualPerson28.mmPoliticallyExposedPersonType}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPoliticallyExposedPersonType = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> PersonProfile.mmPoliticalExposureType;
			componentContext_lazy = () -> com.tools20022.repository.msg.IndividualPerson33.mmObject();
			isDerived = false;
			xmlTag = "PltclyXpsdPrsnTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PoliticallyExposedPersonType";
			definition = "Specifies if due diligence checks on the political exposure of the investor or account servicer have been carried out and whether these checks are national or foreign. (A politically exposed person is someone who has been entrusted with a prominent public function, or an individual who is closely related to such a person.)";
			previousVersion_lazy = () -> IndividualPerson28.mmPoliticallyExposedPersonType;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PoliticalExposureType1Choice.mmObject();
		}
	};
	@XmlElement(name = "DthDt")
	protected ISODate deathDate;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson33
	 * IndividualPerson33}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson28#mmDeathDate
	 * IndividualPerson28.mmDeathDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDeathDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Person.mmDeathDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.IndividualPerson33.mmObject();
			isDerived = false;
			xmlTag = "DthDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeathDate";
			definition = "Date of death.";
			previousVersion_lazy = () -> IndividualPerson28.mmDeathDate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	@XmlElement(name = "CvlSts")
	protected CivilStatus1Choice civilStatus;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson33
	 * IndividualPerson33}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson28#mmCivilStatus
	 * IndividualPerson28.mmCivilStatus}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCivilStatus = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Person.mmCivilStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.IndividualPerson33.mmObject();
			isDerived = false;
			xmlTag = "CvlSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CivilStatus";
			definition = "Civil status of the individual person.";
			previousVersion_lazy = () -> IndividualPerson28.mmCivilStatus;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CivilStatus1Choice.mmObject();
		}
	};
	@XmlElement(name = "EdctnLvl")
	protected Max35Text educationLevel;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson33
	 * IndividualPerson33}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson28#mmEducationLevel
	 * IndividualPerson28.mmEducationLevel}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEducationLevel = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IndividualPerson33.mmObject();
			isDerived = false;
			xmlTag = "EdctnLvl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EducationLevel";
			definition = "Highest level of education reached by the individual person.";
			previousVersion_lazy = () -> IndividualPerson28.mmEducationLevel;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "FmlyInf")
	protected PersonalInformation1 familyInformation;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson33
	 * IndividualPerson33}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson28#mmFamilyInformation
	 * IndividualPerson28.mmFamilyInformation}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFamilyInformation = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Person.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.IndividualPerson33.mmObject();
			isDerived = false;
			xmlTag = "FmlyInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FamilyInformation";
			definition = "Information related to the person.";
			previousVersion_lazy = () -> IndividualPerson28.mmFamilyInformation;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PersonalInformation1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IndividualPerson33.mmNamePrefix, com.tools20022.repository.msg.IndividualPerson33.mmGivenName,
						com.tools20022.repository.msg.IndividualPerson33.mmMiddleName, com.tools20022.repository.msg.IndividualPerson33.mmName, com.tools20022.repository.msg.IndividualPerson33.mmNameSuffix,
						com.tools20022.repository.msg.IndividualPerson33.mmGender, com.tools20022.repository.msg.IndividualPerson33.mmBirthDate, com.tools20022.repository.msg.IndividualPerson33.mmCountryOfBirth,
						com.tools20022.repository.msg.IndividualPerson33.mmProvinceOfBirth, com.tools20022.repository.msg.IndividualPerson33.mmCityOfBirth, com.tools20022.repository.msg.IndividualPerson33.mmProfession,
						com.tools20022.repository.msg.IndividualPerson33.mmModifiedPostalAddress, com.tools20022.repository.msg.IndividualPerson33.mmModifiedCitizenship, com.tools20022.repository.msg.IndividualPerson33.mmEmployingCompany,
						com.tools20022.repository.msg.IndividualPerson33.mmBusinessFunction, com.tools20022.repository.msg.IndividualPerson33.mmPoliticallyExposedPersonType, com.tools20022.repository.msg.IndividualPerson33.mmDeathDate,
						com.tools20022.repository.msg.IndividualPerson33.mmCivilStatus, com.tools20022.repository.msg.IndividualPerson33.mmEducationLevel, com.tools20022.repository.msg.IndividualPerson33.mmFamilyInformation);
				trace_lazy = () -> Person.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "IndividualPerson33";
				definition = "Human entity, as distinguished from a corporate entity (which is sometimes referred to as an 'artificial person').";
				previousVersion_lazy = () -> IndividualPerson28.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<NamePrefix1Choice> getNamePrefix() {
		return namePrefix == null ? Optional.empty() : Optional.of(namePrefix);
	}

	public IndividualPerson33 setNamePrefix(NamePrefix1Choice namePrefix) {
		this.namePrefix = namePrefix;
		return this;
	}

	public Optional<Max35Text> getGivenName() {
		return givenName == null ? Optional.empty() : Optional.of(givenName);
	}

	public IndividualPerson33 setGivenName(Max35Text givenName) {
		this.givenName = givenName;
		return this;
	}

	public Optional<Max35Text> getMiddleName() {
		return middleName == null ? Optional.empty() : Optional.of(middleName);
	}

	public IndividualPerson33 setMiddleName(Max35Text middleName) {
		this.middleName = middleName;
		return this;
	}

	public Max350Text getName() {
		return name;
	}

	public IndividualPerson33 setName(Max350Text name) {
		this.name = Objects.requireNonNull(name);
		return this;
	}

	public Optional<Max35Text> getNameSuffix() {
		return nameSuffix == null ? Optional.empty() : Optional.of(nameSuffix);
	}

	public IndividualPerson33 setNameSuffix(Max35Text nameSuffix) {
		this.nameSuffix = nameSuffix;
		return this;
	}

	public Optional<Gender1Code> getGender() {
		return gender == null ? Optional.empty() : Optional.of(gender);
	}

	public IndividualPerson33 setGender(Gender1Code gender) {
		this.gender = gender;
		return this;
	}

	public Optional<ISODate> getBirthDate() {
		return birthDate == null ? Optional.empty() : Optional.of(birthDate);
	}

	public IndividualPerson33 setBirthDate(ISODate birthDate) {
		this.birthDate = birthDate;
		return this;
	}

	public Optional<CountryCode> getCountryOfBirth() {
		return countryOfBirth == null ? Optional.empty() : Optional.of(countryOfBirth);
	}

	public IndividualPerson33 setCountryOfBirth(CountryCode countryOfBirth) {
		this.countryOfBirth = countryOfBirth;
		return this;
	}

	public Optional<Max35Text> getProvinceOfBirth() {
		return provinceOfBirth == null ? Optional.empty() : Optional.of(provinceOfBirth);
	}

	public IndividualPerson33 setProvinceOfBirth(Max35Text provinceOfBirth) {
		this.provinceOfBirth = provinceOfBirth;
		return this;
	}

	public Optional<Max35Text> getCityOfBirth() {
		return cityOfBirth == null ? Optional.empty() : Optional.of(cityOfBirth);
	}

	public IndividualPerson33 setCityOfBirth(Max35Text cityOfBirth) {
		this.cityOfBirth = cityOfBirth;
		return this;
	}

	public Optional<Max35Text> getProfession() {
		return profession == null ? Optional.empty() : Optional.of(profession);
	}

	public IndividualPerson33 setProfession(Max35Text profession) {
		this.profession = profession;
		return this;
	}

	public List<ModificationScope34> getModifiedPostalAddress() {
		return modifiedPostalAddress == null ? modifiedPostalAddress = new ArrayList<>() : modifiedPostalAddress;
	}

	public IndividualPerson33 setModifiedPostalAddress(List<com.tools20022.repository.msg.ModificationScope34> modifiedPostalAddress) {
		this.modifiedPostalAddress = Objects.requireNonNull(modifiedPostalAddress);
		return this;
	}

	public List<ModificationScope39> getModifiedCitizenship() {
		return modifiedCitizenship == null ? modifiedCitizenship = new ArrayList<>() : modifiedCitizenship;
	}

	public IndividualPerson33 setModifiedCitizenship(List<com.tools20022.repository.msg.ModificationScope39> modifiedCitizenship) {
		this.modifiedCitizenship = Objects.requireNonNull(modifiedCitizenship);
		return this;
	}

	public Optional<Max140Text> getEmployingCompany() {
		return employingCompany == null ? Optional.empty() : Optional.of(employingCompany);
	}

	public IndividualPerson33 setEmployingCompany(Max140Text employingCompany) {
		this.employingCompany = employingCompany;
		return this;
	}

	public Optional<Max35Text> getBusinessFunction() {
		return businessFunction == null ? Optional.empty() : Optional.of(businessFunction);
	}

	public IndividualPerson33 setBusinessFunction(Max35Text businessFunction) {
		this.businessFunction = businessFunction;
		return this;
	}

	public Optional<PoliticalExposureType1Choice> getPoliticallyExposedPersonType() {
		return politicallyExposedPersonType == null ? Optional.empty() : Optional.of(politicallyExposedPersonType);
	}

	public IndividualPerson33 setPoliticallyExposedPersonType(PoliticalExposureType1Choice politicallyExposedPersonType) {
		this.politicallyExposedPersonType = politicallyExposedPersonType;
		return this;
	}

	public Optional<ISODate> getDeathDate() {
		return deathDate == null ? Optional.empty() : Optional.of(deathDate);
	}

	public IndividualPerson33 setDeathDate(ISODate deathDate) {
		this.deathDate = deathDate;
		return this;
	}

	public Optional<CivilStatus1Choice> getCivilStatus() {
		return civilStatus == null ? Optional.empty() : Optional.of(civilStatus);
	}

	public IndividualPerson33 setCivilStatus(CivilStatus1Choice civilStatus) {
		this.civilStatus = civilStatus;
		return this;
	}

	public Optional<Max35Text> getEducationLevel() {
		return educationLevel == null ? Optional.empty() : Optional.of(educationLevel);
	}

	public IndividualPerson33 setEducationLevel(Max35Text educationLevel) {
		this.educationLevel = educationLevel;
		return this;
	}

	public Optional<PersonalInformation1> getFamilyInformation() {
		return familyInformation == null ? Optional.empty() : Optional.of(familyInformation);
	}

	public IndividualPerson33 setFamilyInformation(com.tools20022.repository.msg.PersonalInformation1 familyInformation) {
		this.familyInformation = familyInformation;
		return this;
	}
}