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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.GenderCode;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.Person;
import com.tools20022.repository.entity.PersonName;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
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
 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson30#mmGivenName
 * IndividualPerson30.mmGivenName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson30#mmMiddleName
 * IndividualPerson30.mmMiddleName}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson30#mmName
 * IndividualPerson30.mmName}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson30#mmGender
 * IndividualPerson30.mmGender}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson30#mmBirthDate
 * IndividualPerson30.mmBirthDate}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Person Person}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "IndividualPerson30"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Human entity, as distinguished from a corporate entity (which is sometimes referred to as an 'artificial person')."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson35
 * IndividualPerson35}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.IndividualPerson4
 * IndividualPerson4}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "IndividualPerson30", propOrder = {"givenName", "middleName", "name", "gender", "birthDate"})
public class IndividualPerson30 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
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
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson30
	 * IndividualPerson30}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GvnNm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GivenName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "First name of the person."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson35#mmGivenName
	 * IndividualPerson35.mmGivenName}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson4#mmGivenName
	 * IndividualPerson4.mmGivenName}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IndividualPerson30, Optional<Max35Text>> mmGivenName = new MMMessageAttribute<IndividualPerson30, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> PersonName.mmGivenName;
			componentContext_lazy = () -> com.tools20022.repository.msg.IndividualPerson30.mmObject();
			isDerived = false;
			xmlTag = "GvnNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GivenName";
			definition = "First name of the person.";
			nextVersions_lazy = () -> Arrays.asList(IndividualPerson35.mmGivenName);
			previousVersion_lazy = () -> IndividualPerson4.mmGivenName;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(IndividualPerson30 obj) {
			return obj.getGivenName();
		}

		@Override
		public void setValue(IndividualPerson30 obj, Optional<Max35Text> value) {
			obj.setGivenName(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson30
	 * IndividualPerson30}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MddlNm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MiddleName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Second name of the person."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson35#mmMiddleName
	 * IndividualPerson35.mmMiddleName}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson4#mmMiddleName
	 * IndividualPerson4.mmMiddleName}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IndividualPerson30, Optional<Max35Text>> mmMiddleName = new MMMessageAttribute<IndividualPerson30, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> PersonName.mmMiddleName;
			componentContext_lazy = () -> com.tools20022.repository.msg.IndividualPerson30.mmObject();
			isDerived = false;
			xmlTag = "MddlNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MiddleName";
			definition = "Second name of the person.";
			nextVersions_lazy = () -> Arrays.asList(IndividualPerson35.mmMiddleName);
			previousVersion_lazy = () -> IndividualPerson4.mmMiddleName;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(IndividualPerson30 obj) {
			return obj.getMiddleName();
		}

		@Override
		public void setValue(IndividualPerson30 obj, Optional<Max35Text> value) {
			obj.setMiddleName(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson30
	 * IndividualPerson30}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Nm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Name"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Name by which the party is known and which is usually used to identify that party."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson35#mmName
	 * IndividualPerson35.mmName}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson4#mmName
	 * IndividualPerson4.mmName}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IndividualPerson30, Max350Text> mmName = new MMMessageAttribute<IndividualPerson30, Max350Text>() {
		{
			businessElementTrace_lazy = () -> PersonName.mmBirthName;
			componentContext_lazy = () -> com.tools20022.repository.msg.IndividualPerson30.mmObject();
			isDerived = false;
			xmlTag = "Nm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Name";
			definition = "Name by which the party is known and which is usually used to identify that party.";
			nextVersions_lazy = () -> Arrays.asList(IndividualPerson35.mmName);
			previousVersion_lazy = () -> IndividualPerson4.mmName;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Max350Text getValue(IndividualPerson30 obj) {
			return obj.getName();
		}

		@Override
		public void setValue(IndividualPerson30 obj, Max350Text value) {
			obj.setName(value);
		}
	};
	@XmlElement(name = "Gndr")
	protected GenderCode gender;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson30
	 * IndividualPerson30}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Gndr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Gender"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Gender of the person."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson35#mmGender
	 * IndividualPerson35.mmGender}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson4#mmGender
	 * IndividualPerson4.mmGender}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IndividualPerson30, Optional<GenderCode>> mmGender = new MMMessageAttribute<IndividualPerson30, Optional<GenderCode>>() {
		{
			businessElementTrace_lazy = () -> Person.mmGender;
			componentContext_lazy = () -> com.tools20022.repository.msg.IndividualPerson30.mmObject();
			isDerived = false;
			xmlTag = "Gndr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Gender";
			definition = "Gender of the person.";
			nextVersions_lazy = () -> Arrays.asList(IndividualPerson35.mmGender);
			previousVersion_lazy = () -> IndividualPerson4.mmGender;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> GenderCode.mmObject();
		}

		@Override
		public Optional<GenderCode> getValue(IndividualPerson30 obj) {
			return obj.getGender();
		}

		@Override
		public void setValue(IndividualPerson30 obj, Optional<GenderCode> value) {
			obj.setGender(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson30
	 * IndividualPerson30}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BirthDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BirthDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date on which the person is born."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson35#mmBirthDate
	 * IndividualPerson35.mmBirthDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson4#mmBirthDate
	 * IndividualPerson4.mmBirthDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IndividualPerson30, Optional<ISODate>> mmBirthDate = new MMMessageAttribute<IndividualPerson30, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> Person.mmBirthDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.IndividualPerson30.mmObject();
			isDerived = false;
			xmlTag = "BirthDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BirthDate";
			definition = "Date on which the person is born.";
			nextVersions_lazy = () -> Arrays.asList(IndividualPerson35.mmBirthDate);
			previousVersion_lazy = () -> IndividualPerson4.mmBirthDate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(IndividualPerson30 obj) {
			return obj.getBirthDate();
		}

		@Override
		public void setValue(IndividualPerson30 obj, Optional<ISODate> value) {
			obj.setBirthDate(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IndividualPerson30.mmGivenName, com.tools20022.repository.msg.IndividualPerson30.mmMiddleName, com.tools20022.repository.msg.IndividualPerson30.mmName,
						com.tools20022.repository.msg.IndividualPerson30.mmGender, com.tools20022.repository.msg.IndividualPerson30.mmBirthDate);
				trace_lazy = () -> Person.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "IndividualPerson30";
				definition = "Human entity, as distinguished from a corporate entity (which is sometimes referred to as an 'artificial person').";
				nextVersions_lazy = () -> Arrays.asList(IndividualPerson35.mmObject());
				previousVersion_lazy = () -> IndividualPerson4.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max35Text> getGivenName() {
		return givenName == null ? Optional.empty() : Optional.of(givenName);
	}

	public IndividualPerson30 setGivenName(Max35Text givenName) {
		this.givenName = givenName;
		return this;
	}

	public Optional<Max35Text> getMiddleName() {
		return middleName == null ? Optional.empty() : Optional.of(middleName);
	}

	public IndividualPerson30 setMiddleName(Max35Text middleName) {
		this.middleName = middleName;
		return this;
	}

	public Max350Text getName() {
		return name;
	}

	public IndividualPerson30 setName(Max350Text name) {
		this.name = Objects.requireNonNull(name);
		return this;
	}

	public Optional<GenderCode> getGender() {
		return gender == null ? Optional.empty() : Optional.of(gender);
	}

	public IndividualPerson30 setGender(GenderCode gender) {
		this.gender = gender;
		return this;
	}

	public Optional<ISODate> getBirthDate() {
		return birthDate == null ? Optional.empty() : Optional.of(birthDate);
	}

	public IndividualPerson30 setBirthDate(ISODate birthDate) {
		this.birthDate = birthDate;
		return this;
	}
}