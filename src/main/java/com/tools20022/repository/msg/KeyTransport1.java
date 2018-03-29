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
import com.tools20022.repository.datatype.Max140Binary;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.AlgorithmIdentification1;
import com.tools20022.repository.msg.CertificateIdentifier1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Key encryption key (KEK), encrypted previously distributed symmetric key.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.KeyTransport1#mmVersion
 * KeyTransport1.mmVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.KeyTransport1#mmRecipientIdentification
 * KeyTransport1.mmRecipientIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.KeyTransport1#mmKeyEncryptionAlgorithm
 * KeyTransport1.mmKeyEncryptionAlgorithm}</li>
 * <li>{@linkplain com.tools20022.repository.msg.KeyTransport1#mmEncryptedKey
 * KeyTransport1.mmEncryptedKey}</li>
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
 * "KeyTransport1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Key encryption key (KEK), encrypted previously distributed symmetric key."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.KeyTransport2 KeyTransport2}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "KeyTransport1", propOrder = {"version", "recipientIdentification", "keyEncryptionAlgorithm", "encryptedKey"})
public class KeyTransport1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Vrsn", required = true)
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
	 * {@linkplain com.tools20022.repository.msg.KeyTransport1 KeyTransport1}</li>
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
	 * definition} = "Version of the cryptographic key."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<KeyTransport1, Number> mmVersion = new MMMessageAttribute<KeyTransport1, Number>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.KeyTransport1.mmObject();
			isDerived = false;
			xmlTag = "Vrsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Version";
			definition = "Version of the cryptographic key.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Number getValue(KeyTransport1 obj) {
			return obj.getVersion();
		}

		@Override
		public void setValue(KeyTransport1 obj, Number value) {
			obj.setVersion(value);
		}
	};
	@XmlElement(name = "RcptId", required = true)
	protected CertificateIdentifier1 recipientIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CertificateIdentifier1
	 * CertificateIdentifier1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.KeyTransport1 KeyTransport1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcptId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RecipientIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transport key or key encryption key (KEK) for the recipient."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<KeyTransport1, CertificateIdentifier1> mmRecipientIdentification = new MMMessageAssociationEnd<KeyTransport1, CertificateIdentifier1>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.KeyTransport1.mmObject();
			isDerived = false;
			xmlTag = "RcptId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RecipientIdentification";
			definition = "Transport key or key encryption key (KEK) for the recipient.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CertificateIdentifier1.mmObject();
		}

		@Override
		public CertificateIdentifier1 getValue(KeyTransport1 obj) {
			return obj.getRecipientIdentification();
		}

		@Override
		public void setValue(KeyTransport1 obj, CertificateIdentifier1 value) {
			obj.setRecipientIdentification(value);
		}
	};
	@XmlElement(name = "KeyNcrptnAlgo", required = true)
	protected AlgorithmIdentification1 keyEncryptionAlgorithm;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AlgorithmIdentification1
	 * AlgorithmIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.KeyTransport1 KeyTransport1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "KeyNcrptnAlgo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KeyEncryptionAlgorithm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Algorithm to encrypt the key encryption key (KEK)."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<KeyTransport1, AlgorithmIdentification1> mmKeyEncryptionAlgorithm = new MMMessageAssociationEnd<KeyTransport1, AlgorithmIdentification1>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.KeyTransport1.mmObject();
			isDerived = false;
			xmlTag = "KeyNcrptnAlgo";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KeyEncryptionAlgorithm";
			definition = "Algorithm to encrypt the key encryption key (KEK).";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AlgorithmIdentification1.mmObject();
		}

		@Override
		public AlgorithmIdentification1 getValue(KeyTransport1 obj) {
			return obj.getKeyEncryptionAlgorithm();
		}

		@Override
		public void setValue(KeyTransport1 obj, AlgorithmIdentification1 value) {
			obj.setKeyEncryptionAlgorithm(value);
		}
	};
	@XmlElement(name = "NcrptdKey", required = true)
	protected Max140Binary encryptedKey;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max140Binary Max140Binary}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.KeyTransport1 KeyTransport1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NcrptdKey"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EncryptedKey"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Encrypted key encryption key (KEK)."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<KeyTransport1, Max140Binary> mmEncryptedKey = new MMMessageAttribute<KeyTransport1, Max140Binary>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.KeyTransport1.mmObject();
			isDerived = false;
			xmlTag = "NcrptdKey";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EncryptedKey";
			definition = "Encrypted key encryption key (KEK).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max140Binary.mmObject();
		}

		@Override
		public Max140Binary getValue(KeyTransport1 obj) {
			return obj.getEncryptedKey();
		}

		@Override
		public void setValue(KeyTransport1 obj, Max140Binary value) {
			obj.setEncryptedKey(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.KeyTransport1.mmVersion, com.tools20022.repository.msg.KeyTransport1.mmRecipientIdentification,
						com.tools20022.repository.msg.KeyTransport1.mmKeyEncryptionAlgorithm, com.tools20022.repository.msg.KeyTransport1.mmEncryptedKey);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "KeyTransport1";
				definition = "Key encryption key (KEK), encrypted previously distributed symmetric key.";
				nextVersions_lazy = () -> Arrays.asList(KeyTransport2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Number getVersion() {
		return version;
	}

	public KeyTransport1 setVersion(Number version) {
		this.version = Objects.requireNonNull(version);
		return this;
	}

	public CertificateIdentifier1 getRecipientIdentification() {
		return recipientIdentification;
	}

	public KeyTransport1 setRecipientIdentification(CertificateIdentifier1 recipientIdentification) {
		this.recipientIdentification = Objects.requireNonNull(recipientIdentification);
		return this;
	}

	public AlgorithmIdentification1 getKeyEncryptionAlgorithm() {
		return keyEncryptionAlgorithm;
	}

	public KeyTransport1 setKeyEncryptionAlgorithm(AlgorithmIdentification1 keyEncryptionAlgorithm) {
		this.keyEncryptionAlgorithm = Objects.requireNonNull(keyEncryptionAlgorithm);
		return this;
	}

	public Max140Binary getEncryptedKey() {
		return encryptedKey;
	}

	public KeyTransport1 setEncryptedKey(Max140Binary encryptedKey) {
		this.encryptedKey = Objects.requireNonNull(encryptedKey);
		return this;
	}
}