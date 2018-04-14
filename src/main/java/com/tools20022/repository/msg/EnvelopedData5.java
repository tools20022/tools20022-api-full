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
import com.tools20022.repository.choice.Recipient6Choice;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.EncryptedContent4;
import com.tools20022.repository.msg.OriginatorInformation1;
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
 * <li>{@linkplain com.tools20022.repository.msg.EnvelopedData5#mmVersion
 * EnvelopedData5.mmVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EnvelopedData5#mmOriginatorInformation
 * EnvelopedData5.mmOriginatorInformation}</li>
 * <li>{@linkplain com.tools20022.repository.msg.EnvelopedData5#mmRecipient
 * EnvelopedData5.mmRecipient}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EnvelopedData5#mmEncryptedContent
 * EnvelopedData5.mmEncryptedContent}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "EnvelopedData5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Encrypted data with encryption key."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.EnvelopedData4
 * EnvelopedData4}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "EnvelopedData5", propOrder = {"version", "originatorInformation", "recipient", "encryptedContent"})
public class EnvelopedData5 {

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
	 * {@linkplain com.tools20022.repository.msg.EnvelopedData5 EnvelopedData5}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.EnvelopedData4#mmVersion
	 * EnvelopedData4.mmVersion}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<EnvelopedData5, Optional<Number>> mmVersion = new MMMessageAttribute<EnvelopedData5, Optional<Number>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.EnvelopedData5.mmObject();
			isDerived = false;
			xmlTag = "Vrsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Version";
			definition = "Version of the data structure.";
			previousVersion_lazy = () -> EnvelopedData4.mmVersion;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Optional<Number> getValue(EnvelopedData5 obj) {
			return obj.getVersion();
		}

		@Override
		public void setValue(EnvelopedData5 obj, Optional<Number> value) {
			obj.setVersion(value.orElse(null));
		}
	};
	@XmlElement(name = "OrgtrInf")
	protected OriginatorInformation1 originatorInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.OriginatorInformation1
	 * OriginatorInformation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EnvelopedData5 EnvelopedData5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgtrInf"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginatorInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides certificates of the originator."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<EnvelopedData5, Optional<OriginatorInformation1>> mmOriginatorInformation = new MMMessageAssociationEnd<EnvelopedData5, Optional<OriginatorInformation1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.EnvelopedData5.mmObject();
			isDerived = false;
			xmlTag = "OrgtrInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginatorInformation";
			definition = "Provides certificates of the originator.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> OriginatorInformation1.mmObject();
		}

		@Override
		public Optional<OriginatorInformation1> getValue(EnvelopedData5 obj) {
			return obj.getOriginatorInformation();
		}

		@Override
		public void setValue(EnvelopedData5 obj, Optional<OriginatorInformation1> value) {
			obj.setOriginatorInformation(value.orElse(null));
		}
	};
	@XmlElement(name = "Rcpt", required = true)
	protected List<Recipient6Choice> recipient;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Recipient6Choice
	 * Recipient6Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EnvelopedData5 EnvelopedData5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rcpt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Recipient"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Session key or identification of the protection key used by the recipient."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.EnvelopedData4#mmRecipient
	 * EnvelopedData4.mmRecipient}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<EnvelopedData5, List<Recipient6Choice>> mmRecipient = new MMMessageAssociationEnd<EnvelopedData5, List<Recipient6Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.EnvelopedData5.mmObject();
			isDerived = false;
			xmlTag = "Rcpt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Recipient";
			definition = "Session key or identification of the protection key used by the recipient.";
			previousVersion_lazy = () -> EnvelopedData4.mmRecipient;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Recipient6Choice.mmObject();
		}

		@Override
		public List<Recipient6Choice> getValue(EnvelopedData5 obj) {
			return obj.getRecipient();
		}

		@Override
		public void setValue(EnvelopedData5 obj, List<Recipient6Choice> value) {
			obj.setRecipient(value);
		}
	};
	@XmlElement(name = "NcrptdCntt")
	protected EncryptedContent4 encryptedContent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.EncryptedContent4
	 * EncryptedContent4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EnvelopedData5 EnvelopedData5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NcrptdCntt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EncryptedContent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Data protection by encryption (digital envelope), with an encryption key."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.EnvelopedData4#mmEncryptedContent
	 * EnvelopedData4.mmEncryptedContent}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<EnvelopedData5, Optional<EncryptedContent4>> mmEncryptedContent = new MMMessageAssociationEnd<EnvelopedData5, Optional<EncryptedContent4>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.EnvelopedData5.mmObject();
			isDerived = false;
			xmlTag = "NcrptdCntt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EncryptedContent";
			definition = "Data protection by encryption (digital envelope), with an encryption key.";
			previousVersion_lazy = () -> EnvelopedData4.mmEncryptedContent;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> EncryptedContent4.mmObject();
		}

		@Override
		public Optional<EncryptedContent4> getValue(EnvelopedData5 obj) {
			return obj.getEncryptedContent();
		}

		@Override
		public void setValue(EnvelopedData5 obj, Optional<EncryptedContent4> value) {
			obj.setEncryptedContent(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.EnvelopedData5.mmVersion, com.tools20022.repository.msg.EnvelopedData5.mmOriginatorInformation,
						com.tools20022.repository.msg.EnvelopedData5.mmRecipient, com.tools20022.repository.msg.EnvelopedData5.mmEncryptedContent);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "EnvelopedData5";
				definition = "Encrypted data with encryption key.";
				previousVersion_lazy = () -> EnvelopedData4.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Number> getVersion() {
		return version == null ? Optional.empty() : Optional.of(version);
	}

	public EnvelopedData5 setVersion(Number version) {
		this.version = version;
		return this;
	}

	public Optional<OriginatorInformation1> getOriginatorInformation() {
		return originatorInformation == null ? Optional.empty() : Optional.of(originatorInformation);
	}

	public EnvelopedData5 setOriginatorInformation(OriginatorInformation1 originatorInformation) {
		this.originatorInformation = originatorInformation;
		return this;
	}

	public List<Recipient6Choice> getRecipient() {
		return recipient == null ? recipient = new ArrayList<>() : recipient;
	}

	public EnvelopedData5 setRecipient(List<Recipient6Choice> recipient) {
		this.recipient = Objects.requireNonNull(recipient);
		return this;
	}

	public Optional<EncryptedContent4> getEncryptedContent() {
		return encryptedContent == null ? Optional.empty() : Optional.of(encryptedContent);
	}

	public EnvelopedData5 setEncryptedContent(EncryptedContent4 encryptedContent) {
		this.encryptedContent = encryptedContent;
		return this;
	}
}