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
import com.tools20022.repository.choice.Recipient5Choice;
import com.tools20022.repository.datatype.Max5000Binary;
import com.tools20022.repository.datatype.Number;
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
 * Key encryption key (KEK), encrypted with a previously distributed asymmetric
 * public key.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.KeyTransport4#mmVersion
 * KeyTransport4.mmVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.KeyTransport4#mmRecipientIdentification
 * KeyTransport4.mmRecipientIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.KeyTransport4#mmKeyEncryptionAlgorithm
 * KeyTransport4.mmKeyEncryptionAlgorithm}</li>
 * <li>{@linkplain com.tools20022.repository.msg.KeyTransport4#mmEncryptedKey
 * KeyTransport4.mmEncryptedKey}</li>
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
 * "KeyTransport4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Key encryption key (KEK), encrypted with a previously distributed asymmetric public key."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.KeyTransport5 KeyTransport5}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.KeyTransport3
 * KeyTransport3}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "KeyTransport4", propOrder = {"version", "recipientIdentification", "keyEncryptionAlgorithm", "encryptedKey"})
public class KeyTransport4 {

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
	 * {@linkplain com.tools20022.repository.msg.KeyTransport4 KeyTransport4}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.KeyTransport5#mmVersion
	 * KeyTransport5.mmVersion}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.KeyTransport3#mmVersion
	 * KeyTransport3.mmVersion}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmVersion = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.KeyTransport4.mmObject();
			isDerived = false;
			xmlTag = "Vrsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Version";
			definition = "Version of the data structure.";
			nextVersions_lazy = () -> Arrays.asList(KeyTransport5.mmVersion);
			previousVersion_lazy = () -> KeyTransport3.mmVersion;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	@XmlElement(name = "RcptId", required = true)
	protected Recipient5Choice recipientIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Recipient5Choice
	 * Recipient5Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.KeyTransport4 KeyTransport4}</li>
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
	 * "Identification of a cryptographic asymmetric key for the recipient."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.KeyTransport5#mmRecipientIdentification
	 * KeyTransport5.mmRecipientIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.KeyTransport3#mmRecipientIdentification
	 * KeyTransport3.mmRecipientIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRecipientIdentification = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.KeyTransport4.mmObject();
			isDerived = false;
			xmlTag = "RcptId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RecipientIdentification";
			definition = "Identification of a cryptographic asymmetric key for the recipient.";
			nextVersions_lazy = () -> Arrays.asList(KeyTransport5.mmRecipientIdentification);
			previousVersion_lazy = () -> KeyTransport3.mmRecipientIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Recipient5Choice.mmObject();
		}
	};
	@XmlElement(name = "KeyNcrptnAlgo", required = true)
	protected AlgorithmIdentification11 keyEncryptionAlgorithm;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AlgorithmIdentification11
	 * AlgorithmIdentification11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.KeyTransport4 KeyTransport4}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.KeyTransport5#mmKeyEncryptionAlgorithm
	 * KeyTransport5.mmKeyEncryptionAlgorithm}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.KeyTransport3#mmKeyEncryptionAlgorithm
	 * KeyTransport3.mmKeyEncryptionAlgorithm}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmKeyEncryptionAlgorithm = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.KeyTransport4.mmObject();
			isDerived = false;
			xmlTag = "KeyNcrptnAlgo";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KeyEncryptionAlgorithm";
			definition = "Algorithm to encrypt the key encryption key (KEK).";
			nextVersions_lazy = () -> Arrays.asList(KeyTransport5.mmKeyEncryptionAlgorithm);
			previousVersion_lazy = () -> KeyTransport3.mmKeyEncryptionAlgorithm;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AlgorithmIdentification11.mmObject();
		}
	};
	@XmlElement(name = "NcrptdKey", required = true)
	protected Max5000Binary encryptedKey;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max5000Binary
	 * Max5000Binary}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.KeyTransport4 KeyTransport4}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.KeyTransport5#mmEncryptedKey
	 * KeyTransport5.mmEncryptedKey}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.KeyTransport3#mmEncryptedKey
	 * KeyTransport3.mmEncryptedKey}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEncryptedKey = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.KeyTransport4.mmObject();
			isDerived = false;
			xmlTag = "NcrptdKey";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EncryptedKey";
			definition = "Encrypted key encryption key (KEK).";
			nextVersions_lazy = () -> Arrays.asList(KeyTransport5.mmEncryptedKey);
			previousVersion_lazy = () -> KeyTransport3.mmEncryptedKey;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max5000Binary.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.KeyTransport4.mmVersion, com.tools20022.repository.msg.KeyTransport4.mmRecipientIdentification,
						com.tools20022.repository.msg.KeyTransport4.mmKeyEncryptionAlgorithm, com.tools20022.repository.msg.KeyTransport4.mmEncryptedKey);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "KeyTransport4";
				definition = "Key encryption key (KEK), encrypted with a previously distributed asymmetric public key.";
				nextVersions_lazy = () -> Arrays.asList(KeyTransport5.mmObject());
				previousVersion_lazy = () -> KeyTransport3.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Number> getVersion() {
		return version == null ? Optional.empty() : Optional.of(version);
	}

	public KeyTransport4 setVersion(Number version) {
		this.version = version;
		return this;
	}

	public Recipient5Choice getRecipientIdentification() {
		return recipientIdentification;
	}

	public KeyTransport4 setRecipientIdentification(Recipient5Choice recipientIdentification) {
		this.recipientIdentification = Objects.requireNonNull(recipientIdentification);
		return this;
	}

	public AlgorithmIdentification11 getKeyEncryptionAlgorithm() {
		return keyEncryptionAlgorithm;
	}

	public KeyTransport4 setKeyEncryptionAlgorithm(com.tools20022.repository.msg.AlgorithmIdentification11 keyEncryptionAlgorithm) {
		this.keyEncryptionAlgorithm = Objects.requireNonNull(keyEncryptionAlgorithm);
		return this;
	}

	public Max5000Binary getEncryptedKey() {
		return encryptedKey;
	}

	public KeyTransport4 setEncryptedKey(Max5000Binary encryptedKey) {
		this.encryptedKey = Objects.requireNonNull(encryptedKey);
		return this;
	}
}