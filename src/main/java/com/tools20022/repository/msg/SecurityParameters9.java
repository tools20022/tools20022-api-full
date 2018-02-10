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
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Max5000Binary;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Security parameters of the ATM for the initiated key download.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.SecurityParameters9#mmKey
 * SecurityParameters9.mmKey}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityParameters9#mmSignatureChoice
 * SecurityParameters9.mmSignatureChoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityParameters9#mmCertificate
 * SecurityParameters9.mmCertificate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityParameters9#mmATMChallenge
 * SecurityParameters9.mmATMChallenge}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityParameters9#mmRequestedKey
 * SecurityParameters9.mmRequestedKey}</li>
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
 * "SecurityParameters9"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Security parameters of the ATM for the initiated key download."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.SecurityParameters7
 * SecurityParameters7}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SecurityParameters9", propOrder = {"key", "signatureChoice", "certificate", "aTMChallenge", "requestedKey"})
public class SecurityParameters9 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Key")
	protected CryptographicKey12 key;
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
	 * {@linkplain com.tools20022.repository.msg.SecurityParameters9
	 * SecurityParameters9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Key"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Key"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cryptographic key used to protect the key download."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecurityParameters7#mmKey
	 * SecurityParameters7.mmKey}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmKey = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecurityParameters9.mmObject();
			isDerived = false;
			xmlTag = "Key";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Key";
			definition = "Cryptographic key used to protect the key download.";
			previousVersion_lazy = () -> SecurityParameters7.mmKey;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.CryptographicKey12.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.SecurityParameters9
	 * SecurityParameters9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SgntrChc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SignatureChoice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Element containing the signature."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecurityParameters7#mmSignatureChoice
	 * SecurityParameters7.mmSignatureChoice}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSignatureChoice = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecurityParameters9.mmObject();
			isDerived = false;
			xmlTag = "SgntrChc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SignatureChoice";
			definition = "Element containing the signature.";
			previousVersion_lazy = () -> SecurityParameters7.mmSignatureChoice;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ATMSignature2Choice.mmObject();
		}
	};
	@XmlElement(name = "Cert")
	protected List<Max5000Binary> certificate;
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
	 * {@linkplain com.tools20022.repository.msg.SecurityParameters9
	 * SecurityParameters9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cert"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Certificate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Ordered certificate chain of the asymmetric key encryption key, starting with the ATM certificate."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecurityParameters7#mmCertificate
	 * SecurityParameters7.mmCertificate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCertificate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecurityParameters9.mmObject();
			isDerived = false;
			xmlTag = "Cert";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Certificate";
			definition = "Ordered certificate chain of the asymmetric key encryption key, starting with the ATM certificate.";
			previousVersion_lazy = () -> SecurityParameters7.mmCertificate;
			minOccurs = 0;
			simpleType_lazy = () -> Max5000Binary.mmObject();
		}
	};
	@XmlElement(name = "ATMChllng")
	protected Max140Binary aTMChallenge;
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
	 * {@linkplain com.tools20022.repository.msg.SecurityParameters9
	 * SecurityParameters9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ATMChllng"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMChallenge"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Random value from the ATM to avoid message replay."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecurityParameters7#mmATMChallenge
	 * SecurityParameters7.mmATMChallenge}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmATMChallenge = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecurityParameters9.mmObject();
			isDerived = false;
			xmlTag = "ATMChllng";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMChallenge";
			definition = "Random value from the ATM to avoid message replay.";
			previousVersion_lazy = () -> SecurityParameters7.mmATMChallenge;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Binary.mmObject();
		}
	};
	@XmlElement(name = "ReqdKey")
	protected Max35Text requestedKey;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecurityParameters9
	 * SecurityParameters9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ReqdKey"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedKey"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Requested key for downloading, depending on the key hierarchy used by the host."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecurityParameters7#mmRequestedKey
	 * SecurityParameters7.mmRequestedKey}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRequestedKey = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecurityParameters9.mmObject();
			isDerived = false;
			xmlTag = "ReqdKey";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedKey";
			definition = "Requested key for downloading, depending on the key hierarchy used by the host.";
			previousVersion_lazy = () -> SecurityParameters7.mmRequestedKey;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecurityParameters9.mmKey, com.tools20022.repository.msg.SecurityParameters9.mmSignatureChoice,
						com.tools20022.repository.msg.SecurityParameters9.mmCertificate, com.tools20022.repository.msg.SecurityParameters9.mmATMChallenge, com.tools20022.repository.msg.SecurityParameters9.mmRequestedKey);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecurityParameters9";
				definition = "Security parameters of the ATM for the initiated key download.";
				previousVersion_lazy = () -> SecurityParameters7.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<CryptographicKey12> getKey() {
		return key == null ? Optional.empty() : Optional.of(key);
	}

	public SecurityParameters9 setKey(com.tools20022.repository.msg.CryptographicKey12 key) {
		this.key = key;
		return this;
	}

	public Optional<ATMSignature2Choice> getSignatureChoice() {
		return signatureChoice == null ? Optional.empty() : Optional.of(signatureChoice);
	}

	public SecurityParameters9 setSignatureChoice(ATMSignature2Choice signatureChoice) {
		this.signatureChoice = signatureChoice;
		return this;
	}

	public List<Max5000Binary> getCertificate() {
		return certificate == null ? certificate = new ArrayList<>() : certificate;
	}

	public SecurityParameters9 setCertificate(List<Max5000Binary> certificate) {
		this.certificate = Objects.requireNonNull(certificate);
		return this;
	}

	public Optional<Max140Binary> getATMChallenge() {
		return aTMChallenge == null ? Optional.empty() : Optional.of(aTMChallenge);
	}

	public SecurityParameters9 setATMChallenge(Max140Binary aTMChallenge) {
		this.aTMChallenge = aTMChallenge;
		return this;
	}

	public Optional<Max35Text> getRequestedKey() {
		return requestedKey == null ? Optional.empty() : Optional.of(requestedKey);
	}

	public SecurityParameters9 setRequestedKey(Max35Text requestedKey) {
		this.requestedKey = requestedKey;
		return this;
	}
}