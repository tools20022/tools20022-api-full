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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ContentInformationType10;
import com.tools20022.repository.msg.TRRelatedData2;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Element containing the key information.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.KeyChoiceValue2#mmEncryptedKeyValue
 * KeyChoiceValue2.mmEncryptedKeyValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.KeyChoiceValue2#mmTRRelatedData
 * KeyChoiceValue2.mmTRRelatedData}</li>
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
 * "KeyChoiceValue2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Element containing the key information."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.choice.KeyChoiceValue1 KeyChoiceValue1}
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "KeyChoiceValue2", propOrder = {"encryptedKeyValue", "tRRelatedData"})
public class KeyChoiceValue2 {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "NcrptdKeyVal")
	protected ContentInformationType10 encryptedKeyValue;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType10
	 * ContentInformationType10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.KeyChoiceValue2
	 * KeyChoiceValue2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NcrptdKeyVal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EncryptedKeyValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Encrypted value of the cryptographic key."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.KeyChoiceValue1#mmEncryptedKeyValue
	 * KeyChoiceValue1.mmEncryptedKeyValue}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<KeyChoiceValue2, Optional<ContentInformationType10>> mmEncryptedKeyValue = new MMMessageAssociationEnd<KeyChoiceValue2, Optional<ContentInformationType10>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.KeyChoiceValue2.mmObject();
			isDerived = false;
			xmlTag = "NcrptdKeyVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EncryptedKeyValue";
			definition = "Encrypted value of the cryptographic key.";
			previousVersion_lazy = () -> KeyChoiceValue1.mmEncryptedKeyValue;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ContentInformationType10.mmObject();
		}

		@Override
		public Optional<ContentInformationType10> getValue(KeyChoiceValue2 obj) {
			return obj.getEncryptedKeyValue();
		}

		@Override
		public void setValue(KeyChoiceValue2 obj, Optional<ContentInformationType10> value) {
			obj.setEncryptedKeyValue(value.orElse(null));
		}
	};
	@XmlElement(name = "TRRltdData")
	protected TRRelatedData2 tRRelatedData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TRRelatedData2
	 * TRRelatedData2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.KeyChoiceValue2
	 * KeyChoiceValue2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TRRltdData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TRRelatedData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Data block for a TR31 or TR34 block, where the block does not contain a key (for example the TR34 unbind which contains the signed authorization data)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.KeyChoiceValue1#mmTRRelatedData
	 * KeyChoiceValue1.mmTRRelatedData}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<KeyChoiceValue2, Optional<TRRelatedData2>> mmTRRelatedData = new MMMessageAssociationEnd<KeyChoiceValue2, Optional<TRRelatedData2>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.KeyChoiceValue2.mmObject();
			isDerived = false;
			xmlTag = "TRRltdData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TRRelatedData";
			definition = "Data block for a TR31 or TR34 block, where the block does not contain a key (for example the TR34 unbind which contains the signed authorization data).";
			previousVersion_lazy = () -> KeyChoiceValue1.mmTRRelatedData;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TRRelatedData2.mmObject();
		}

		@Override
		public Optional<TRRelatedData2> getValue(KeyChoiceValue2 obj) {
			return obj.getTRRelatedData();
		}

		@Override
		public void setValue(KeyChoiceValue2 obj, Optional<TRRelatedData2> value) {
			obj.setTRRelatedData(value.orElse(null));
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.KeyChoiceValue2.mmEncryptedKeyValue, com.tools20022.repository.choice.KeyChoiceValue2.mmTRRelatedData);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "KeyChoiceValue2";
				definition = "Element containing the key information.";
				previousVersion_lazy = () -> KeyChoiceValue1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<ContentInformationType10> getEncryptedKeyValue() {
		return encryptedKeyValue == null ? Optional.empty() : Optional.of(encryptedKeyValue);
	}

	public KeyChoiceValue2 setEncryptedKeyValue(ContentInformationType10 encryptedKeyValue) {
		this.encryptedKeyValue = encryptedKeyValue;
		return this;
	}

	public Optional<TRRelatedData2> getTRRelatedData() {
		return tRRelatedData == null ? Optional.empty() : Optional.of(tRRelatedData);
	}

	public KeyChoiceValue2 setTRRelatedData(TRRelatedData2 tRRelatedData) {
		this.tRRelatedData = tRRelatedData;
		return this;
	}
}