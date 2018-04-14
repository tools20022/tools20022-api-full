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
import com.tools20022.repository.choice.ATMSignature2Choice;
import com.tools20022.repository.datatype.Max140Binary;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CryptographicKey12;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Security parameters of the host downloading the key.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityParameters10#mmHostChallenge
 * SecurityParameters10.mmHostChallenge}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecurityParameters10#mmKey
 * SecurityParameters10.mmKey}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityParameters10#mmSignatureChoice
 * SecurityParameters10.mmSignatureChoice}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecurityParameters10"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Security parameters of the host downloading the key."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.SecurityParameters8
 * SecurityParameters8}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SecurityParameters10", propOrder = {"hostChallenge", "key", "signatureChoice"})
public class SecurityParameters10 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "HstChllng")
	protected Max140Binary hostChallenge;
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
	 * {@linkplain com.tools20022.repository.msg.SecurityParameters10
	 * SecurityParameters10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "HstChllng"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HostChallenge"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Random value from the host."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecurityParameters8#mmHostChallenge
	 * SecurityParameters8.mmHostChallenge}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecurityParameters10, Optional<Max140Binary>> mmHostChallenge = new MMMessageAttribute<SecurityParameters10, Optional<Max140Binary>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecurityParameters10.mmObject();
			isDerived = false;
			xmlTag = "HstChllng";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HostChallenge";
			definition = "Random value from the host.";
			previousVersion_lazy = () -> SecurityParameters8.mmHostChallenge;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Binary.mmObject();
		}

		@Override
		public Optional<Max140Binary> getValue(SecurityParameters10 obj) {
			return obj.getHostChallenge();
		}

		@Override
		public void setValue(SecurityParameters10 obj, Optional<Max140Binary> value) {
			obj.setHostChallenge(value.orElse(null));
		}
	};
	@XmlElement(name = "Key")
	protected List<CryptographicKey12> key;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CryptographicKey12
	 * CryptographicKey12}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecurityParameters10
	 * SecurityParameters10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Key"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Key"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cryptographic key used to store in the ATM."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecurityParameters8#mmKey
	 * SecurityParameters8.mmKey}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecurityParameters10, List<CryptographicKey12>> mmKey = new MMMessageAttribute<SecurityParameters10, List<CryptographicKey12>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecurityParameters10.mmObject();
			isDerived = false;
			xmlTag = "Key";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Key";
			definition = "Cryptographic key used to store in the ATM.";
			previousVersion_lazy = () -> SecurityParameters8.mmKey;
			minOccurs = 0;
			complexType_lazy = () -> CryptographicKey12.mmObject();
		}

		@Override
		public List<CryptographicKey12> getValue(SecurityParameters10 obj) {
			return obj.getKey();
		}

		@Override
		public void setValue(SecurityParameters10 obj, List<CryptographicKey12> value) {
			obj.setKey(value);
		}
	};
	@XmlElement(name = "SgntrChc")
	protected ATMSignature2Choice signatureChoice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.ATMSignature2Choice
	 * ATMSignature2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecurityParameters10
	 * SecurityParameters10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SgntrChc"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SignatureChoice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Element containing the signature."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecurityParameters8#mmSignatureChoice
	 * SecurityParameters8.mmSignatureChoice}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecurityParameters10, Optional<ATMSignature2Choice>> mmSignatureChoice = new MMMessageAssociationEnd<SecurityParameters10, Optional<ATMSignature2Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecurityParameters10.mmObject();
			isDerived = false;
			xmlTag = "SgntrChc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SignatureChoice";
			definition = "Element containing the signature.";
			previousVersion_lazy = () -> SecurityParameters8.mmSignatureChoice;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ATMSignature2Choice.mmObject();
		}

		@Override
		public Optional<ATMSignature2Choice> getValue(SecurityParameters10 obj) {
			return obj.getSignatureChoice();
		}

		@Override
		public void setValue(SecurityParameters10 obj, Optional<ATMSignature2Choice> value) {
			obj.setSignatureChoice(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecurityParameters10.mmHostChallenge, com.tools20022.repository.msg.SecurityParameters10.mmKey,
						com.tools20022.repository.msg.SecurityParameters10.mmSignatureChoice);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecurityParameters10";
				definition = "Security parameters of the host downloading the key.";
				previousVersion_lazy = () -> SecurityParameters8.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max140Binary> getHostChallenge() {
		return hostChallenge == null ? Optional.empty() : Optional.of(hostChallenge);
	}

	public SecurityParameters10 setHostChallenge(Max140Binary hostChallenge) {
		this.hostChallenge = hostChallenge;
		return this;
	}

	public List<CryptographicKey12> getKey() {
		return key == null ? key = new ArrayList<>() : key;
	}

	public SecurityParameters10 setKey(List<CryptographicKey12> key) {
		this.key = Objects.requireNonNull(key);
		return this;
	}

	public Optional<ATMSignature2Choice> getSignatureChoice() {
		return signatureChoice == null ? Optional.empty() : Optional.of(signatureChoice);
	}

	public SecurityParameters10 setSignatureChoice(ATMSignature2Choice signatureChoice) {
		this.signatureChoice = signatureChoice;
		return this;
	}
}