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
import com.tools20022.repository.choice.Recipient2Choice;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.EncryptedContent2;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Encrypted data with encryption key.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.EnvelopedData2#mmVersion
 * EnvelopedData2.mmVersion}</li>
 * <li>{@linkplain com.tools20022.repository.msg.EnvelopedData2#mmRecipient
 * EnvelopedData2.mmRecipient}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EnvelopedData2#mmEncryptedContent
 * EnvelopedData2.mmEncryptedContent}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "EnvelopedData2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Encrypted data with encryption key."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.EnvelopedData3 EnvelopedData3}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.EnvelopedData1
 * EnvelopedData1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "EnvelopedData2", propOrder = {"version", "recipient", "encryptedContent"})
public class EnvelopedData2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Vrsn")
	protected Number version;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EnvelopedData2 EnvelopedData2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Vrsn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Version"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Version of the data structure."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.EnvelopedData3#mmVersion
	 * EnvelopedData3.mmVersion}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<EnvelopedData2, Optional<Number>> mmVersion = new MMMessageAttribute<EnvelopedData2, Optional<Number>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.EnvelopedData2.mmObject();
			isDerived = false;
			xmlTag = "Vrsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Version";
			definition = "Version of the data structure.";
			nextVersions_lazy = () -> Arrays.asList(EnvelopedData3.mmVersion);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Optional<Number> getValue(EnvelopedData2 obj) {
			return obj.getVersion();
		}

		@Override
		public void setValue(EnvelopedData2 obj, Optional<Number> value) {
			obj.setVersion(value.orElse(null));
		}
	};
	@XmlElement(name = "Rcpt", required = true)
	protected List<Recipient2Choice> recipient;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Recipient2Choice
	 * Recipient2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EnvelopedData2 EnvelopedData2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rcpt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Recipient"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transport key or key encryption key (KEK) identification for the recipient."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.EnvelopedData3#mmRecipient
	 * EnvelopedData3.mmRecipient}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<EnvelopedData2, List<Recipient2Choice>> mmRecipient = new MMMessageAssociationEnd<EnvelopedData2, List<Recipient2Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.EnvelopedData2.mmObject();
			isDerived = false;
			xmlTag = "Rcpt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Recipient";
			definition = "Transport key or key encryption key (KEK) identification for the recipient.";
			nextVersions_lazy = () -> Arrays.asList(EnvelopedData3.mmRecipient);
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Recipient2Choice.mmObject();
		}

		@Override
		public List<Recipient2Choice> getValue(EnvelopedData2 obj) {
			return obj.getRecipient();
		}

		@Override
		public void setValue(EnvelopedData2 obj, List<Recipient2Choice> value) {
			obj.setRecipient(value);
		}
	};
	@XmlElement(name = "NcrptdCntt", required = true)
	protected EncryptedContent2 encryptedContent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.EncryptedContent2
	 * EncryptedContent2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EnvelopedData2 EnvelopedData2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NcrptdCntt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EncryptedContent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Encrypted data with an encryption key."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EnvelopedData3#mmEncryptedContent
	 * EnvelopedData3.mmEncryptedContent}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<EnvelopedData2, EncryptedContent2> mmEncryptedContent = new MMMessageAssociationEnd<EnvelopedData2, EncryptedContent2>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.EnvelopedData2.mmObject();
			isDerived = false;
			xmlTag = "NcrptdCntt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EncryptedContent";
			definition = "Encrypted data with an encryption key.";
			nextVersions_lazy = () -> Arrays.asList(EnvelopedData3.mmEncryptedContent);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> EncryptedContent2.mmObject();
		}

		@Override
		public EncryptedContent2 getValue(EnvelopedData2 obj) {
			return obj.getEncryptedContent();
		}

		@Override
		public void setValue(EnvelopedData2 obj, EncryptedContent2 value) {
			obj.setEncryptedContent(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.EnvelopedData2.mmVersion, com.tools20022.repository.msg.EnvelopedData2.mmRecipient, com.tools20022.repository.msg.EnvelopedData2.mmEncryptedContent);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "EnvelopedData2";
				definition = "Encrypted data with encryption key.";
				nextVersions_lazy = () -> Arrays.asList(EnvelopedData3.mmObject());
				previousVersion_lazy = () -> EnvelopedData1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Number> getVersion() {
		return version == null ? Optional.empty() : Optional.of(version);
	}

	public EnvelopedData2 setVersion(Number version) {
		this.version = version;
		return this;
	}

	public List<Recipient2Choice> getRecipient() {
		return recipient == null ? recipient = new ArrayList<>() : recipient;
	}

	public EnvelopedData2 setRecipient(List<Recipient2Choice> recipient) {
		this.recipient = Objects.requireNonNull(recipient);
		return this;
	}

	public EncryptedContent2 getEncryptedContent() {
		return encryptedContent;
	}

	public EnvelopedData2 setEncryptedContent(EncryptedContent2 encryptedContent) {
		this.encryptedContent = Objects.requireNonNull(encryptedContent);
		return this;
	}
}