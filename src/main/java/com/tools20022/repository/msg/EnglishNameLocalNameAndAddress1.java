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
import com.tools20022.repository.datatype.Max210Text;
import com.tools20022.repository.datatype.Max256Text;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.PartyIdentification77;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Name and address details.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EnglishNameLocalNameAndAddress1#mmEnglishName
 * EnglishNameLocalNameAndAddress1.mmEnglishName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EnglishNameLocalNameAndAddress1#mmNameAndAddress
 * EnglishNameLocalNameAndAddress1.mmNameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EnglishNameLocalNameAndAddress1#mmLongAddressLine
 * EnglishNameLocalNameAndAddress1.mmLongAddressLine}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "EnglishNameLocalNameAndAddress1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Name and address details."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "EnglishNameLocalNameAndAddress1", propOrder = {"englishName", "nameAndAddress", "longAddressLine"})
public class EnglishNameLocalNameAndAddress1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "EnNm")
	protected Max210Text englishName;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max210Text
	 * Max210Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EnglishNameLocalNameAndAddress1
	 * EnglishNameLocalNameAndAddress1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EnNm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EnglishName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<EnglishNameLocalNameAndAddress1, Optional<Max210Text>> mmEnglishName = new MMMessageAttribute<EnglishNameLocalNameAndAddress1, Optional<Max210Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.EnglishNameLocalNameAndAddress1.mmObject();
			isDerived = false;
			xmlTag = "EnNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EnglishName";
			definition = "Name.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max210Text.mmObject();
		}

		@Override
		public Optional<Max210Text> getValue(EnglishNameLocalNameAndAddress1 obj) {
			return obj.getEnglishName();
		}

		@Override
		public void setValue(EnglishNameLocalNameAndAddress1 obj, Optional<Max210Text> value) {
			obj.setEnglishName(value.orElse(null));
		}
	};
	@XmlElement(name = "NmAndAdr", required = true)
	protected PartyIdentification77 nameAndAddress;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification77
	 * PartyIdentification77}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EnglishNameLocalNameAndAddress1
	 * EnglishNameLocalNameAndAddress1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NmAndAdr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NameAndAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name and address details of a participant."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<EnglishNameLocalNameAndAddress1, PartyIdentification77> mmNameAndAddress = new MMMessageAssociationEnd<EnglishNameLocalNameAndAddress1, PartyIdentification77>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.EnglishNameLocalNameAndAddress1.mmObject();
			isDerived = false;
			xmlTag = "NmAndAdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NameAndAddress";
			definition = "Name and address details of a participant.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PartyIdentification77.mmObject();
		}

		@Override
		public PartyIdentification77 getValue(EnglishNameLocalNameAndAddress1 obj) {
			return obj.getNameAndAddress();
		}

		@Override
		public void setValue(EnglishNameLocalNameAndAddress1 obj, PartyIdentification77 value) {
			obj.setNameAndAddress(value);
		}
	};
	@XmlElement(name = "LngAdrLine")
	protected List<Max256Text> longAddressLine;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max256Text
	 * Max256Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EnglishNameLocalNameAndAddress1
	 * EnglishNameLocalNameAndAddress1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LngAdrLine"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LongAddressLine"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information that locates and identifies a specific address in long text format."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<EnglishNameLocalNameAndAddress1, List<Max256Text>> mmLongAddressLine = new MMMessageAttribute<EnglishNameLocalNameAndAddress1, List<Max256Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.EnglishNameLocalNameAndAddress1.mmObject();
			isDerived = false;
			xmlTag = "LngAdrLine";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LongAddressLine";
			definition = "Information that locates and identifies a specific address in long text format.";
			maxOccurs = 2;
			minOccurs = 0;
			simpleType_lazy = () -> Max256Text.mmObject();
		}

		@Override
		public List<Max256Text> getValue(EnglishNameLocalNameAndAddress1 obj) {
			return obj.getLongAddressLine();
		}

		@Override
		public void setValue(EnglishNameLocalNameAndAddress1 obj, List<Max256Text> value) {
			obj.setLongAddressLine(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.EnglishNameLocalNameAndAddress1.mmEnglishName, com.tools20022.repository.msg.EnglishNameLocalNameAndAddress1.mmNameAndAddress,
						com.tools20022.repository.msg.EnglishNameLocalNameAndAddress1.mmLongAddressLine);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "EnglishNameLocalNameAndAddress1";
				definition = "Name and address details.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max210Text> getEnglishName() {
		return englishName == null ? Optional.empty() : Optional.of(englishName);
	}

	public EnglishNameLocalNameAndAddress1 setEnglishName(Max210Text englishName) {
		this.englishName = englishName;
		return this;
	}

	public PartyIdentification77 getNameAndAddress() {
		return nameAndAddress;
	}

	public EnglishNameLocalNameAndAddress1 setNameAndAddress(PartyIdentification77 nameAndAddress) {
		this.nameAndAddress = Objects.requireNonNull(nameAndAddress);
		return this;
	}

	public List<Max256Text> getLongAddressLine() {
		return longAddressLine == null ? longAddressLine = new ArrayList<>() : longAddressLine;
	}

	public EnglishNameLocalNameAndAddress1 setLongAddressLine(List<Max256Text> longAddressLine) {
		this.longAddressLine = Objects.requireNonNull(longAddressLine);
		return this;
	}
}