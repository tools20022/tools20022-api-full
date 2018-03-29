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
import com.tools20022.repository.datatype.Max3000Binary;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.AlgorithmIdentification16;
import com.tools20022.repository.msg.AlgorithmIdentification17;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Entity who has signed the data and its digital signature.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Signer3#mmVersion
 * Signer3.mmVersion}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Signer3#mmSignerIdentification
 * Signer3.mmSignerIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Signer3#mmDigestAlgorithm
 * Signer3.mmDigestAlgorithm}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Signer3#mmSignatureAlgorithm
 * Signer3.mmSignatureAlgorithm}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Signer3#mmSignature
 * Signer3.mmSignature}</li>
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
 * "Signer3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Entity who has signed the data and its digital signature."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Signer4 Signer4}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.Signer2 Signer2}
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Signer3", propOrder = {"version", "signerIdentification", "digestAlgorithm", "signatureAlgorithm", "signature"})
public class Signer3 {

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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Signer3
	 * Signer3}</li>
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
	 * definition} =
	 * "Version of the Cryptographic Message Syntax (CMS) data structure."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Signer4#mmVersion
	 * Signer4.mmVersion}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Signer2#mmVersion
	 * Signer2.mmVersion}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Signer3, Optional<Number>> mmVersion = new MMMessageAttribute<Signer3, Optional<Number>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Signer3.mmObject();
			isDerived = false;
			xmlTag = "Vrsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Version";
			definition = "Version of the Cryptographic Message Syntax (CMS) data structure.";
			nextVersions_lazy = () -> Arrays.asList(Signer4.mmVersion);
			previousVersion_lazy = () -> Signer2.mmVersion;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Optional<Number> getValue(Signer3 obj) {
			return obj.getVersion();
		}

		@Override
		public void setValue(Signer3 obj, Optional<Number> value) {
			obj.setVersion(value.orElse(null));
		}
	};
	@XmlElement(name = "SgnrId")
	protected Recipient5Choice signerIdentification;
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Signer3
	 * Signer3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SgnrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SignerIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the entity who has signed the data."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Signer4#mmSignerIdentification
	 * Signer4.mmSignerIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Signer2#mmSignerIdentification
	 * Signer2.mmSignerIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Signer3, Optional<Recipient5Choice>> mmSignerIdentification = new MMMessageAssociationEnd<Signer3, Optional<Recipient5Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Signer3.mmObject();
			isDerived = false;
			xmlTag = "SgnrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SignerIdentification";
			definition = "Identification of the entity who has signed the data.";
			nextVersions_lazy = () -> Arrays.asList(Signer4.mmSignerIdentification);
			previousVersion_lazy = () -> Signer2.mmSignerIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Recipient5Choice.mmObject();
		}

		@Override
		public Optional<Recipient5Choice> getValue(Signer3 obj) {
			return obj.getSignerIdentification();
		}

		@Override
		public void setValue(Signer3 obj, Optional<Recipient5Choice> value) {
			obj.setSignerIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "DgstAlgo", required = true)
	protected AlgorithmIdentification16 digestAlgorithm;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AlgorithmIdentification16
	 * AlgorithmIdentification16}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Signer3
	 * Signer3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DgstAlgo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DigestAlgorithm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of a digest algorithm to apply before signature."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Signer4#mmDigestAlgorithm
	 * Signer4.mmDigestAlgorithm}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Signer2#mmDigestAlgorithm
	 * Signer2.mmDigestAlgorithm}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Signer3, AlgorithmIdentification16> mmDigestAlgorithm = new MMMessageAssociationEnd<Signer3, AlgorithmIdentification16>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Signer3.mmObject();
			isDerived = false;
			xmlTag = "DgstAlgo";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DigestAlgorithm";
			definition = "Identification of a digest algorithm to apply before signature.";
			nextVersions_lazy = () -> Arrays.asList(Signer4.mmDigestAlgorithm);
			previousVersion_lazy = () -> Signer2.mmDigestAlgorithm;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AlgorithmIdentification16.mmObject();
		}

		@Override
		public AlgorithmIdentification16 getValue(Signer3 obj) {
			return obj.getDigestAlgorithm();
		}

		@Override
		public void setValue(Signer3 obj, AlgorithmIdentification16 value) {
			obj.setDigestAlgorithm(value);
		}
	};
	@XmlElement(name = "SgntrAlgo", required = true)
	protected AlgorithmIdentification17 signatureAlgorithm;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AlgorithmIdentification17
	 * AlgorithmIdentification17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Signer3
	 * Signer3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SgntrAlgo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SignatureAlgorithm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cryptographic digital signature algorithm."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Signer4#mmSignatureAlgorithm
	 * Signer4.mmSignatureAlgorithm}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Signer2#mmSignatureAlgorithm
	 * Signer2.mmSignatureAlgorithm}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Signer3, AlgorithmIdentification17> mmSignatureAlgorithm = new MMMessageAssociationEnd<Signer3, AlgorithmIdentification17>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Signer3.mmObject();
			isDerived = false;
			xmlTag = "SgntrAlgo";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SignatureAlgorithm";
			definition = "Cryptographic digital signature algorithm.";
			nextVersions_lazy = () -> Arrays.asList(Signer4.mmSignatureAlgorithm);
			previousVersion_lazy = () -> Signer2.mmSignatureAlgorithm;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AlgorithmIdentification17.mmObject();
		}

		@Override
		public AlgorithmIdentification17 getValue(Signer3 obj) {
			return obj.getSignatureAlgorithm();
		}

		@Override
		public void setValue(Signer3 obj, AlgorithmIdentification17 value) {
			obj.setSignatureAlgorithm(value);
		}
	};
	@XmlElement(name = "Sgntr", required = true)
	protected Max3000Binary signature;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max3000Binary
	 * Max3000Binary}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Signer3
	 * Signer3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sgntr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Signature"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Digital signature."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Signer4#mmSignature
	 * Signer4.mmSignature}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Signer2#mmSignature
	 * Signer2.mmSignature}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Signer3, Max3000Binary> mmSignature = new MMMessageAttribute<Signer3, Max3000Binary>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Signer3.mmObject();
			isDerived = false;
			xmlTag = "Sgntr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Signature";
			definition = "Digital signature.";
			nextVersions_lazy = () -> Arrays.asList(Signer4.mmSignature);
			previousVersion_lazy = () -> Signer2.mmSignature;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max3000Binary.mmObject();
		}

		@Override
		public Max3000Binary getValue(Signer3 obj) {
			return obj.getSignature();
		}

		@Override
		public void setValue(Signer3 obj, Max3000Binary value) {
			obj.setSignature(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Signer3.mmVersion, com.tools20022.repository.msg.Signer3.mmSignerIdentification, com.tools20022.repository.msg.Signer3.mmDigestAlgorithm,
						com.tools20022.repository.msg.Signer3.mmSignatureAlgorithm, com.tools20022.repository.msg.Signer3.mmSignature);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Signer3";
				definition = "Entity who has signed the data and its digital signature.";
				nextVersions_lazy = () -> Arrays.asList(Signer4.mmObject());
				previousVersion_lazy = () -> Signer2.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Number> getVersion() {
		return version == null ? Optional.empty() : Optional.of(version);
	}

	public Signer3 setVersion(Number version) {
		this.version = version;
		return this;
	}

	public Optional<Recipient5Choice> getSignerIdentification() {
		return signerIdentification == null ? Optional.empty() : Optional.of(signerIdentification);
	}

	public Signer3 setSignerIdentification(Recipient5Choice signerIdentification) {
		this.signerIdentification = signerIdentification;
		return this;
	}

	public AlgorithmIdentification16 getDigestAlgorithm() {
		return digestAlgorithm;
	}

	public Signer3 setDigestAlgorithm(AlgorithmIdentification16 digestAlgorithm) {
		this.digestAlgorithm = Objects.requireNonNull(digestAlgorithm);
		return this;
	}

	public AlgorithmIdentification17 getSignatureAlgorithm() {
		return signatureAlgorithm;
	}

	public Signer3 setSignatureAlgorithm(AlgorithmIdentification17 signatureAlgorithm) {
		this.signatureAlgorithm = Objects.requireNonNull(signatureAlgorithm);
		return this;
	}

	public Max3000Binary getSignature() {
		return signature;
	}

	public Signer3 setSignature(Max3000Binary signature) {
		this.signature = Objects.requireNonNull(signature);
		return this;
	}
}