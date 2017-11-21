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
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Encrypted data with an encryption key identified with a name.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NamedKeyEncryptedData1#mmVersion
 * NamedKeyEncryptedData1.mmVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NamedKeyEncryptedData1#mmKeyName
 * NamedKeyEncryptedData1.mmKeyName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NamedKeyEncryptedData1#mmEncryptedContent
 * NamedKeyEncryptedData1.mmEncryptedContent}</li>
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
 * "NamedKeyEncryptedData1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Encrypted data with an encryption key identified with a name."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.NamedKeyEncryptedData2
 * NamedKeyEncryptedData2}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "NamedKeyEncryptedData1", propOrder = {"version", "keyName", "encryptedContent"})
public class NamedKeyEncryptedData1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Number version;
	/**
	 * Version of the data structure.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NamedKeyEncryptedData1
	 * NamedKeyEncryptedData1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Vrsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Version"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Version of the data structure."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmVersion = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> NamedKeyEncryptedData1.mmObject();
			isDerived = false;
			xmlTag = "Vrsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Version";
			definition = "Version of the data structure.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	protected Max140Text keyName;
	/**
	 * Name of the key encryption key (KEK).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NamedKeyEncryptedData1
	 * NamedKeyEncryptedData1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "KeyNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KeyName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name of the key encryption key (KEK)."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmKeyName = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> NamedKeyEncryptedData1.mmObject();
			isDerived = false;
			xmlTag = "KeyNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KeyName";
			definition = "Name of the key encryption key (KEK).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};
	protected EncryptedContent1 encryptedContent;
	/**
	 * Encrypted data with an encryption key.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.EncryptedContent1
	 * EncryptedContent1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NamedKeyEncryptedData1
	 * NamedKeyEncryptedData1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NcrptdCntt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EncryptedContent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Encrypted data with an encryption key."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmEncryptedContent = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> NamedKeyEncryptedData1.mmObject();
			isDerived = false;
			xmlTag = "NcrptdCntt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EncryptedContent";
			definition = "Encrypted data with an encryption key.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.EncryptedContent1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(NamedKeyEncryptedData1.mmVersion, NamedKeyEncryptedData1.mmKeyName, NamedKeyEncryptedData1.mmEncryptedContent);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "NamedKeyEncryptedData1";
				definition = "Encrypted data with an encryption key identified with a name.";
				nextVersions_lazy = () -> Arrays.asList(NamedKeyEncryptedData2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Vrsn")
	public Number getVersion() {
		return version;
	}

	public void setVersion(Number version) {
		this.version = version;
	}

	@XmlElement(name = "KeyNm")
	public Max140Text getKeyName() {
		return keyName;
	}

	public void setKeyName(Max140Text keyName) {
		this.keyName = keyName;
	}

	@XmlElement(name = "NcrptdCntt", required = true)
	public EncryptedContent1 getEncryptedContent() {
		return encryptedContent;
	}

	public void setEncryptedContent(com.tools20022.repository.msg.EncryptedContent1 encryptedContent) {
		this.encryptedContent = encryptedContent;
	}
}