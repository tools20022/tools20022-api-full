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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "KeyTransport1", propOrder = {"version", "recipientIdentification", "keyEncryptionAlgorithm", "encryptedKey"})
public class KeyTransport1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Number version;
	/**
	 * Version of the cryptographic key.
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
	public static final MMMessageAttribute mmVersion = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> KeyTransport1.mmObject();
			isDerived = false;
			xmlTag = "Vrsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Version";
			definition = "Version of the cryptographic key.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	protected CertificateIdentifier1 recipientIdentification;
	/**
	 * Transport key or key encryption key (KEK) for the recipient.
	 * <p>
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
	public static final MMMessageAssociationEnd mmRecipientIdentification = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> KeyTransport1.mmObject();
			isDerived = false;
			xmlTag = "RcptId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RecipientIdentification";
			definition = "Transport key or key encryption key (KEK) for the recipient.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CertificateIdentifier1.mmObject();
		}
	};
	protected AlgorithmIdentification1 keyEncryptionAlgorithm;
	/**
	 * Algorithm to encrypt the key encryption key (KEK).
	 * <p>
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
	public static final MMMessageAssociationEnd mmKeyEncryptionAlgorithm = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> KeyTransport1.mmObject();
			isDerived = false;
			xmlTag = "KeyNcrptnAlgo";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KeyEncryptionAlgorithm";
			definition = "Algorithm to encrypt the key encryption key (KEK).";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AlgorithmIdentification1.mmObject();
		}
	};
	protected Max140Binary encryptedKey;
	/**
	 * Encrypted key encryption key (KEK).
	 * <p>
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
	public static final MMMessageAttribute mmEncryptedKey = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> KeyTransport1.mmObject();
			isDerived = false;
			xmlTag = "NcrptdKey";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EncryptedKey";
			definition = "Encrypted key encryption key (KEK).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max140Binary.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(KeyTransport1.mmVersion, KeyTransport1.mmRecipientIdentification, KeyTransport1.mmKeyEncryptionAlgorithm, KeyTransport1.mmEncryptedKey);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "KeyTransport1";
				definition = "Key encryption key (KEK), encrypted previously distributed symmetric key.";
				nextVersions_lazy = () -> Arrays.asList(KeyTransport2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Vrsn", required = true)
	public Number getVersion() {
		return version;
	}

	public void setVersion(Number version) {
		this.version = version;
	}

	@XmlElement(name = "RcptId", required = true)
	public CertificateIdentifier1 getRecipientIdentification() {
		return recipientIdentification;
	}

	public void setRecipientIdentification(com.tools20022.repository.msg.CertificateIdentifier1 recipientIdentification) {
		this.recipientIdentification = recipientIdentification;
	}

	@XmlElement(name = "KeyNcrptnAlgo", required = true)
	public AlgorithmIdentification1 getKeyEncryptionAlgorithm() {
		return keyEncryptionAlgorithm;
	}

	public void setKeyEncryptionAlgorithm(com.tools20022.repository.msg.AlgorithmIdentification1 keyEncryptionAlgorithm) {
		this.keyEncryptionAlgorithm = keyEncryptionAlgorithm;
	}

	@XmlElement(name = "NcrptdKey", required = true)
	public Max140Binary getEncryptedKey() {
		return encryptedKey;
	}

	public void setEncryptedKey(Max140Binary encryptedKey) {
		this.encryptedKey = encryptedKey;
	}
}