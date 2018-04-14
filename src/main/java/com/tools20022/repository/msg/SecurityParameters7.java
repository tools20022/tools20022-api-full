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
import com.tools20022.repository.choice.ATMSignature1Choice;
import com.tools20022.repository.datatype.Max140Binary;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Max5000Binary;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CryptographicKey10;
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
 * <li>{@linkplain com.tools20022.repository.msg.SecurityParameters7#mmKey
 * SecurityParameters7.mmKey}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityParameters7#mmSignatureChoice
 * SecurityParameters7.mmSignatureChoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityParameters7#mmCertificate
 * SecurityParameters7.mmCertificate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityParameters7#mmATMChallenge
 * SecurityParameters7.mmATMChallenge}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityParameters7#mmRequestedKey
 * SecurityParameters7.mmRequestedKey}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecurityParameters7"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Security parameters of the ATM for the initiated key download."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.SecurityParameters9
 * SecurityParameters9}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.SecurityParameters4
 * SecurityParameters4}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SecurityParameters7", propOrder = {"key", "signatureChoice", "certificate", "aTMChallenge", "requestedKey"})
public class SecurityParameters7 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Key")
	protected CryptographicKey10 key;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CryptographicKey10
	 * CryptographicKey10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecurityParameters7
	 * SecurityParameters7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Key"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Key"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cryptographic key used to protect the key download."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.SecurityParameters9#mmKey
	 * SecurityParameters9.mmKey}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecurityParameters4#mmKey
	 * SecurityParameters4.mmKey}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecurityParameters7, Optional<CryptographicKey10>> mmKey = new MMMessageAttribute<SecurityParameters7, Optional<CryptographicKey10>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecurityParameters7.mmObject();
			isDerived = false;
			xmlTag = "Key";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Key";
			definition = "Cryptographic key used to protect the key download.";
			nextVersions_lazy = () -> Arrays.asList(SecurityParameters9.mmKey);
			previousVersion_lazy = () -> SecurityParameters4.mmKey;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CryptographicKey10.mmObject();
		}

		@Override
		public Optional<CryptographicKey10> getValue(SecurityParameters7 obj) {
			return obj.getKey();
		}

		@Override
		public void setValue(SecurityParameters7 obj, Optional<CryptographicKey10> value) {
			obj.setKey(value.orElse(null));
		}
	};
	@XmlElement(name = "SgntrChc", required = true)
	protected ATMSignature1Choice signatureChoice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.ATMSignature1Choice
	 * ATMSignature1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecurityParameters7
	 * SecurityParameters7}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityParameters9#mmSignatureChoice
	 * SecurityParameters9.mmSignatureChoice}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecurityParameters7, ATMSignature1Choice> mmSignatureChoice = new MMMessageAssociationEnd<SecurityParameters7, ATMSignature1Choice>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecurityParameters7.mmObject();
			isDerived = false;
			xmlTag = "SgntrChc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SignatureChoice";
			definition = "Element containing the signature.";
			nextVersions_lazy = () -> Arrays.asList(SecurityParameters9.mmSignatureChoice);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ATMSignature1Choice.mmObject();
		}

		@Override
		public ATMSignature1Choice getValue(SecurityParameters7 obj) {
			return obj.getSignatureChoice();
		}

		@Override
		public void setValue(SecurityParameters7 obj, ATMSignature1Choice value) {
			obj.setSignatureChoice(value);
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
	 * {@linkplain com.tools20022.repository.msg.SecurityParameters7
	 * SecurityParameters7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cert"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Certificate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Ordered certificate chain of the asymmetric key encryption key, starting with the ATM certificate."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityParameters9#mmCertificate
	 * SecurityParameters9.mmCertificate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecurityParameters4#mmCertificate
	 * SecurityParameters4.mmCertificate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecurityParameters7, List<Max5000Binary>> mmCertificate = new MMMessageAttribute<SecurityParameters7, List<Max5000Binary>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecurityParameters7.mmObject();
			isDerived = false;
			xmlTag = "Cert";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Certificate";
			definition = "Ordered certificate chain of the asymmetric key encryption key, starting with the ATM certificate.";
			nextVersions_lazy = () -> Arrays.asList(SecurityParameters9.mmCertificate);
			previousVersion_lazy = () -> SecurityParameters4.mmCertificate;
			minOccurs = 0;
			simpleType_lazy = () -> Max5000Binary.mmObject();
		}

		@Override
		public List<Max5000Binary> getValue(SecurityParameters7 obj) {
			return obj.getCertificate();
		}

		@Override
		public void setValue(SecurityParameters7 obj, List<Max5000Binary> value) {
			obj.setCertificate(value);
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
	 * {@linkplain com.tools20022.repository.msg.SecurityParameters7
	 * SecurityParameters7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ATMChllng"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMChallenge"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Random value from the ATM to avoid message replay."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityParameters9#mmATMChallenge
	 * SecurityParameters9.mmATMChallenge}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecurityParameters4#mmATMChallenge
	 * SecurityParameters4.mmATMChallenge}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecurityParameters7, Optional<Max140Binary>> mmATMChallenge = new MMMessageAttribute<SecurityParameters7, Optional<Max140Binary>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecurityParameters7.mmObject();
			isDerived = false;
			xmlTag = "ATMChllng";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMChallenge";
			definition = "Random value from the ATM to avoid message replay.";
			nextVersions_lazy = () -> Arrays.asList(SecurityParameters9.mmATMChallenge);
			previousVersion_lazy = () -> SecurityParameters4.mmATMChallenge;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Binary.mmObject();
		}

		@Override
		public Optional<Max140Binary> getValue(SecurityParameters7 obj) {
			return obj.getATMChallenge();
		}

		@Override
		public void setValue(SecurityParameters7 obj, Optional<Max140Binary> value) {
			obj.setATMChallenge(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.SecurityParameters7
	 * SecurityParameters7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ReqdKey"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedKey"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Requested key for downloading, depending on the key hierarchy used by the host."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityParameters9#mmRequestedKey
	 * SecurityParameters9.mmRequestedKey}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecurityParameters4#mmRequestedKey
	 * SecurityParameters4.mmRequestedKey}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecurityParameters7, Optional<Max35Text>> mmRequestedKey = new MMMessageAttribute<SecurityParameters7, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecurityParameters7.mmObject();
			isDerived = false;
			xmlTag = "ReqdKey";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedKey";
			definition = "Requested key for downloading, depending on the key hierarchy used by the host.";
			nextVersions_lazy = () -> Arrays.asList(SecurityParameters9.mmRequestedKey);
			previousVersion_lazy = () -> SecurityParameters4.mmRequestedKey;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(SecurityParameters7 obj) {
			return obj.getRequestedKey();
		}

		@Override
		public void setValue(SecurityParameters7 obj, Optional<Max35Text> value) {
			obj.setRequestedKey(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecurityParameters7.mmKey, com.tools20022.repository.msg.SecurityParameters7.mmSignatureChoice,
						com.tools20022.repository.msg.SecurityParameters7.mmCertificate, com.tools20022.repository.msg.SecurityParameters7.mmATMChallenge, com.tools20022.repository.msg.SecurityParameters7.mmRequestedKey);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "SecurityParameters7";
				definition = "Security parameters of the ATM for the initiated key download.";
				nextVersions_lazy = () -> Arrays.asList(SecurityParameters9.mmObject());
				previousVersion_lazy = () -> SecurityParameters4.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<CryptographicKey10> getKey() {
		return key == null ? Optional.empty() : Optional.of(key);
	}

	public SecurityParameters7 setKey(CryptographicKey10 key) {
		this.key = key;
		return this;
	}

	public ATMSignature1Choice getSignatureChoice() {
		return signatureChoice;
	}

	public SecurityParameters7 setSignatureChoice(ATMSignature1Choice signatureChoice) {
		this.signatureChoice = Objects.requireNonNull(signatureChoice);
		return this;
	}

	public List<Max5000Binary> getCertificate() {
		return certificate == null ? certificate = new ArrayList<>() : certificate;
	}

	public SecurityParameters7 setCertificate(List<Max5000Binary> certificate) {
		this.certificate = Objects.requireNonNull(certificate);
		return this;
	}

	public Optional<Max140Binary> getATMChallenge() {
		return aTMChallenge == null ? Optional.empty() : Optional.of(aTMChallenge);
	}

	public SecurityParameters7 setATMChallenge(Max140Binary aTMChallenge) {
		this.aTMChallenge = aTMChallenge;
		return this;
	}

	public Optional<Max35Text> getRequestedKey() {
		return requestedKey == null ? Optional.empty() : Optional.of(requestedKey);
	}

	public SecurityParameters7 setRequestedKey(Max35Text requestedKey) {
		this.requestedKey = requestedKey;
		return this;
	}
}