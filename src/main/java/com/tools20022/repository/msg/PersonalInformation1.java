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
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.PartyName;
import com.tools20022.repository.entity.PersonName;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information related to the identification of a person.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PersonalInformation1#mmNameOfFather
 * PersonalInformation1.mmNameOfFather}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PersonalInformation1#mmMaidenNameOfMother
 * PersonalInformation1.mmMaidenNameOfMother}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PersonalInformation1#mmNameOfPartner
 * PersonalInformation1.mmNameOfPartner}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.PersonName PersonName}</li>
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
 * "PersonalInformation1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information related to the identification of a person."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PersonalInformation1", propOrder = {"nameOfFather", "maidenNameOfMother", "nameOfPartner"})
public class PersonalInformation1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "NmOfFthr")
	protected Max35Text nameOfFather;
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
	 * {@linkplain com.tools20022.repository.entity.PersonName#mmBirthName
	 * PersonName.mmBirthName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PersonalInformation1
	 * PersonalInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NmOfFthr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NameOfFather"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name of the father of the individual person."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PersonalInformation1, Optional<Max35Text>> mmNameOfFather = new MMMessageAttribute<PersonalInformation1, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> PersonName.mmBirthName;
			componentContext_lazy = () -> com.tools20022.repository.msg.PersonalInformation1.mmObject();
			isDerived = false;
			xmlTag = "NmOfFthr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NameOfFather";
			definition = "Name of the father of the individual person.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(PersonalInformation1 obj) {
			return obj.getNameOfFather();
		}

		@Override
		public void setValue(PersonalInformation1 obj, Optional<Max35Text> value) {
			obj.setNameOfFather(value.orElse(null));
		}
	};
	@XmlElement(name = "MdnNmOfMthr")
	protected Max35Text maidenNameOfMother;
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
	 * {@linkplain com.tools20022.repository.entity.PartyName#mmName
	 * PartyName.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PersonalInformation1
	 * PersonalInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MdnNmOfMthr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaidenNameOfMother"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Maiden (unmarried) name of the mother of the individual person."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PersonalInformation1, Optional<Max35Text>> mmMaidenNameOfMother = new MMMessageAttribute<PersonalInformation1, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> PartyName.mmName;
			componentContext_lazy = () -> com.tools20022.repository.msg.PersonalInformation1.mmObject();
			isDerived = false;
			xmlTag = "MdnNmOfMthr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaidenNameOfMother";
			definition = "Maiden (unmarried) name of the mother of the individual person.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(PersonalInformation1 obj) {
			return obj.getMaidenNameOfMother();
		}

		@Override
		public void setValue(PersonalInformation1 obj, Optional<Max35Text> value) {
			obj.setMaidenNameOfMother(value.orElse(null));
		}
	};
	@XmlElement(name = "NmOfPrtnr")
	protected Max35Text nameOfPartner;
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
	 * {@linkplain com.tools20022.repository.msg.PersonalInformation1
	 * PersonalInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NmOfPrtnr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NameOfPartner"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name of the partner of the individual person."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PersonalInformation1, Optional<Max35Text>> mmNameOfPartner = new MMMessageAttribute<PersonalInformation1, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> PersonName.mmGivenName;
			componentContext_lazy = () -> com.tools20022.repository.msg.PersonalInformation1.mmObject();
			isDerived = false;
			xmlTag = "NmOfPrtnr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NameOfPartner";
			definition = "Name of the partner of the individual person.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(PersonalInformation1 obj) {
			return obj.getNameOfPartner();
		}

		@Override
		public void setValue(PersonalInformation1 obj, Optional<Max35Text> value) {
			obj.setNameOfPartner(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PersonalInformation1.mmNameOfFather, com.tools20022.repository.msg.PersonalInformation1.mmMaidenNameOfMother,
						com.tools20022.repository.msg.PersonalInformation1.mmNameOfPartner);
				trace_lazy = () -> PersonName.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PersonalInformation1";
				definition = "Information related to the identification of a person.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max35Text> getNameOfFather() {
		return nameOfFather == null ? Optional.empty() : Optional.of(nameOfFather);
	}

	public PersonalInformation1 setNameOfFather(Max35Text nameOfFather) {
		this.nameOfFather = nameOfFather;
		return this;
	}

	public Optional<Max35Text> getMaidenNameOfMother() {
		return maidenNameOfMother == null ? Optional.empty() : Optional.of(maidenNameOfMother);
	}

	public PersonalInformation1 setMaidenNameOfMother(Max35Text maidenNameOfMother) {
		this.maidenNameOfMother = maidenNameOfMother;
		return this;
	}

	public Optional<Max35Text> getNameOfPartner() {
		return nameOfPartner == null ? Optional.empty() : Optional.of(nameOfPartner);
	}

	public PersonalInformation1 setNameOfPartner(Max35Text nameOfPartner) {
		this.nameOfPartner = nameOfPartner;
		return this;
	}
}