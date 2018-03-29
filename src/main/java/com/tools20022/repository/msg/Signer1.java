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
import com.tools20022.repository.datatype.Max500Binary;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.AlgorithmIdentification1;
import com.tools20022.repository.msg.CertificateIdentifier1;
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
 * <li>{@linkplain com.tools20022.repository.msg.Signer1#mmVersion
 * Signer1.mmVersion}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Signer1#mmSignerIdentification
 * Signer1.mmSignerIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Signer1#mmDigestAlgorithm
 * Signer1.mmDigestAlgorithm}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Signer1#mmSignatureAlgorithm
 * Signer1.mmSignatureAlgorithm}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Signer1#mmSignature
 * Signer1.mmSignature}</li>
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
 * "Signer1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Entity who has signed the data and its digital signature."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Signer2 Signer2}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Signer1", propOrder = {"version", "signerIdentification", "digestAlgorithm", "signatureAlgorithm", "signature"})
public class Signer1 {

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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Signer1
	 * Signer1}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute<Signer1, Optional<Number>> mmVersion = new MMMessageAttribute<Signer1, Optional<Number>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Signer1.mmObject();
			isDerived = false;
			xmlTag = "Vrsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Version";
			definition = "Version of the Cryptographic Message Syntax (CMS) data structure.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Optional<Number> getValue(Signer1 obj) {
			return obj.getVersion();
		}

		@Override
		public void setValue(Signer1 obj, Optional<Number> value) {
			obj.setVersion(value.orElse(null));
		}
	};
	@XmlElement(name = "SgnrId", required = true)
	protected CertificateIdentifier1 signerIdentification;
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Signer1
	 * Signer1}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Signer1, CertificateIdentifier1> mmSignerIdentification = new MMMessageAssociationEnd<Signer1, CertificateIdentifier1>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Signer1.mmObject();
			isDerived = false;
			xmlTag = "SgnrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SignerIdentification";
			definition = "Identification of the entity who has signed the data.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CertificateIdentifier1.mmObject();
		}

		@Override
		public CertificateIdentifier1 getValue(Signer1 obj) {
			return obj.getSignerIdentification();
		}

		@Override
		public void setValue(Signer1 obj, CertificateIdentifier1 value) {
			obj.setSignerIdentification(value);
		}
	};
	@XmlElement(name = "DgstAlgo", required = true)
	protected AlgorithmIdentification1 digestAlgorithm;
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Signer1
	 * Signer1}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Signer1, AlgorithmIdentification1> mmDigestAlgorithm = new MMMessageAssociationEnd<Signer1, AlgorithmIdentification1>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Signer1.mmObject();
			isDerived = false;
			xmlTag = "DgstAlgo";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DigestAlgorithm";
			definition = "Identification of a digest algorithm to apply before signature.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AlgorithmIdentification1.mmObject();
		}

		@Override
		public AlgorithmIdentification1 getValue(Signer1 obj) {
			return obj.getDigestAlgorithm();
		}

		@Override
		public void setValue(Signer1 obj, AlgorithmIdentification1 value) {
			obj.setDigestAlgorithm(value);
		}
	};
	@XmlElement(name = "SgntrAlgo", required = true)
	protected AlgorithmIdentification1 signatureAlgorithm;
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Signer1
	 * Signer1}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Signer1, AlgorithmIdentification1> mmSignatureAlgorithm = new MMMessageAssociationEnd<Signer1, AlgorithmIdentification1>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Signer1.mmObject();
			isDerived = false;
			xmlTag = "SgntrAlgo";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SignatureAlgorithm";
			definition = "Cryptographic digital signature algorithm.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AlgorithmIdentification1.mmObject();
		}

		@Override
		public AlgorithmIdentification1 getValue(Signer1 obj) {
			return obj.getSignatureAlgorithm();
		}

		@Override
		public void setValue(Signer1 obj, AlgorithmIdentification1 value) {
			obj.setSignatureAlgorithm(value);
		}
	};
	@XmlElement(name = "Sgntr", required = true)
	protected Max500Binary signature;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max500Binary Max500Binary}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Signer1
	 * Signer1}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute<Signer1, Max500Binary> mmSignature = new MMMessageAttribute<Signer1, Max500Binary>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Signer1.mmObject();
			isDerived = false;
			xmlTag = "Sgntr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Signature";
			definition = "Digital signature.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max500Binary.mmObject();
		}

		@Override
		public Max500Binary getValue(Signer1 obj) {
			return obj.getSignature();
		}

		@Override
		public void setValue(Signer1 obj, Max500Binary value) {
			obj.setSignature(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Signer1.mmVersion, com.tools20022.repository.msg.Signer1.mmSignerIdentification, com.tools20022.repository.msg.Signer1.mmDigestAlgorithm,
						com.tools20022.repository.msg.Signer1.mmSignatureAlgorithm, com.tools20022.repository.msg.Signer1.mmSignature);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Signer1";
				definition = "Entity who has signed the data and its digital signature.";
				nextVersions_lazy = () -> Arrays.asList(Signer2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Number> getVersion() {
		return version == null ? Optional.empty() : Optional.of(version);
	}

	public Signer1 setVersion(Number version) {
		this.version = version;
		return this;
	}

	public CertificateIdentifier1 getSignerIdentification() {
		return signerIdentification;
	}

	public Signer1 setSignerIdentification(CertificateIdentifier1 signerIdentification) {
		this.signerIdentification = Objects.requireNonNull(signerIdentification);
		return this;
	}

	public AlgorithmIdentification1 getDigestAlgorithm() {
		return digestAlgorithm;
	}

	public Signer1 setDigestAlgorithm(AlgorithmIdentification1 digestAlgorithm) {
		this.digestAlgorithm = Objects.requireNonNull(digestAlgorithm);
		return this;
	}

	public AlgorithmIdentification1 getSignatureAlgorithm() {
		return signatureAlgorithm;
	}

	public Signer1 setSignatureAlgorithm(AlgorithmIdentification1 signatureAlgorithm) {
		this.signatureAlgorithm = Objects.requireNonNull(signatureAlgorithm);
		return this;
	}

	public Max500Binary getSignature() {
		return signature;
	}

	public Signer1 setSignature(Max500Binary signature) {
		this.signature = Objects.requireNonNull(signature);
		return this;
	}
}