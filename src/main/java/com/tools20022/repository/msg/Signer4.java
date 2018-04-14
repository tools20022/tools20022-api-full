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
import com.tools20022.repository.msg.AlgorithmIdentification20;
import com.tools20022.repository.msg.AlgorithmIdentification21;
import com.tools20022.repository.msg.GenericInformation1;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
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
 * <li>{@linkplain com.tools20022.repository.msg.Signer4#mmVersion
 * Signer4.mmVersion}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Signer4#mmSignerIdentification
 * Signer4.mmSignerIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Signer4#mmDigestAlgorithm
 * Signer4.mmDigestAlgorithm}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Signer4#mmSignedAttributes
 * Signer4.mmSignedAttributes}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Signer4#mmSignatureAlgorithm
 * Signer4.mmSignatureAlgorithm}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Signer4#mmSignature
 * Signer4.mmSignature}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Signer4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Entity who has signed the data and its digital signature."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.Signer3 Signer3}
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Signer4", propOrder = {"version", "signerIdentification", "digestAlgorithm", "signedAttributes", "signatureAlgorithm", "signature"})
public class Signer4 {

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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Signer4
	 * Signer4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Vrsn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Version"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Version of the Cryptographic Message Syntax (CMS) data structure."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Signer3#mmVersion
	 * Signer3.mmVersion}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Signer4, Optional<Number>> mmVersion = new MMMessageAttribute<Signer4, Optional<Number>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Signer4.mmObject();
			isDerived = false;
			xmlTag = "Vrsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Version";
			definition = "Version of the Cryptographic Message Syntax (CMS) data structure.";
			previousVersion_lazy = () -> Signer3.mmVersion;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Optional<Number> getValue(Signer4 obj) {
			return obj.getVersion();
		}

		@Override
		public void setValue(Signer4 obj, Optional<Number> value) {
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Signer4
	 * Signer4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SgnrId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SignerIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the entity who has signed the data."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Signer3#mmSignerIdentification
	 * Signer3.mmSignerIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Signer4, Optional<Recipient5Choice>> mmSignerIdentification = new MMMessageAssociationEnd<Signer4, Optional<Recipient5Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Signer4.mmObject();
			isDerived = false;
			xmlTag = "SgnrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SignerIdentification";
			definition = "Identification of the entity who has signed the data.";
			previousVersion_lazy = () -> Signer3.mmSignerIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Recipient5Choice.mmObject();
		}

		@Override
		public Optional<Recipient5Choice> getValue(Signer4 obj) {
			return obj.getSignerIdentification();
		}

		@Override
		public void setValue(Signer4 obj, Optional<Recipient5Choice> value) {
			obj.setSignerIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "DgstAlgo", required = true)
	protected AlgorithmIdentification21 digestAlgorithm;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AlgorithmIdentification21
	 * AlgorithmIdentification21}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Signer4
	 * Signer4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DgstAlgo"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DigestAlgorithm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of a digest algorithm to apply before signature."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Signer3#mmDigestAlgorithm
	 * Signer3.mmDigestAlgorithm}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Signer4, AlgorithmIdentification21> mmDigestAlgorithm = new MMMessageAssociationEnd<Signer4, AlgorithmIdentification21>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Signer4.mmObject();
			isDerived = false;
			xmlTag = "DgstAlgo";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DigestAlgorithm";
			definition = "Identification of a digest algorithm to apply before signature.";
			previousVersion_lazy = () -> Signer3.mmDigestAlgorithm;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AlgorithmIdentification21.mmObject();
		}

		@Override
		public AlgorithmIdentification21 getValue(Signer4 obj) {
			return obj.getDigestAlgorithm();
		}

		@Override
		public void setValue(Signer4 obj, AlgorithmIdentification21 value) {
			obj.setDigestAlgorithm(value);
		}
	};
	@XmlElement(name = "SgndAttrbts")
	protected List<GenericInformation1> signedAttributes;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.GenericInformation1
	 * GenericInformation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Signer4
	 * Signer4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SgndAttrbts"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SignedAttributes"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Collection of attributes that are signed."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Signer4, List<GenericInformation1>> mmSignedAttributes = new MMMessageAssociationEnd<Signer4, List<GenericInformation1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Signer4.mmObject();
			isDerived = false;
			xmlTag = "SgndAttrbts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SignedAttributes";
			definition = "Collection of attributes that are signed.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> GenericInformation1.mmObject();
		}

		@Override
		public List<GenericInformation1> getValue(Signer4 obj) {
			return obj.getSignedAttributes();
		}

		@Override
		public void setValue(Signer4 obj, List<GenericInformation1> value) {
			obj.setSignedAttributes(value);
		}
	};
	@XmlElement(name = "SgntrAlgo", required = true)
	protected AlgorithmIdentification20 signatureAlgorithm;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AlgorithmIdentification20
	 * AlgorithmIdentification20}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Signer4
	 * Signer4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SgntrAlgo"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SignatureAlgorithm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cryptographic digital signature algorithm."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Signer3#mmSignatureAlgorithm
	 * Signer3.mmSignatureAlgorithm}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Signer4, AlgorithmIdentification20> mmSignatureAlgorithm = new MMMessageAssociationEnd<Signer4, AlgorithmIdentification20>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Signer4.mmObject();
			isDerived = false;
			xmlTag = "SgntrAlgo";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SignatureAlgorithm";
			definition = "Cryptographic digital signature algorithm.";
			previousVersion_lazy = () -> Signer3.mmSignatureAlgorithm;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AlgorithmIdentification20.mmObject();
		}

		@Override
		public AlgorithmIdentification20 getValue(Signer4 obj) {
			return obj.getSignatureAlgorithm();
		}

		@Override
		public void setValue(Signer4 obj, AlgorithmIdentification20 value) {
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Signer4
	 * Signer4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sgntr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Signature"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Digital signature."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Signer3#mmSignature
	 * Signer3.mmSignature}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Signer4, Max3000Binary> mmSignature = new MMMessageAttribute<Signer4, Max3000Binary>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Signer4.mmObject();
			isDerived = false;
			xmlTag = "Sgntr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Signature";
			definition = "Digital signature.";
			previousVersion_lazy = () -> Signer3.mmSignature;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max3000Binary.mmObject();
		}

		@Override
		public Max3000Binary getValue(Signer4 obj) {
			return obj.getSignature();
		}

		@Override
		public void setValue(Signer4 obj, Max3000Binary value) {
			obj.setSignature(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Signer4.mmVersion, com.tools20022.repository.msg.Signer4.mmSignerIdentification, com.tools20022.repository.msg.Signer4.mmDigestAlgorithm,
						com.tools20022.repository.msg.Signer4.mmSignedAttributes, com.tools20022.repository.msg.Signer4.mmSignatureAlgorithm, com.tools20022.repository.msg.Signer4.mmSignature);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Signer4";
				definition = "Entity who has signed the data and its digital signature.";
				previousVersion_lazy = () -> Signer3.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Number> getVersion() {
		return version == null ? Optional.empty() : Optional.of(version);
	}

	public Signer4 setVersion(Number version) {
		this.version = version;
		return this;
	}

	public Optional<Recipient5Choice> getSignerIdentification() {
		return signerIdentification == null ? Optional.empty() : Optional.of(signerIdentification);
	}

	public Signer4 setSignerIdentification(Recipient5Choice signerIdentification) {
		this.signerIdentification = signerIdentification;
		return this;
	}

	public AlgorithmIdentification21 getDigestAlgorithm() {
		return digestAlgorithm;
	}

	public Signer4 setDigestAlgorithm(AlgorithmIdentification21 digestAlgorithm) {
		this.digestAlgorithm = Objects.requireNonNull(digestAlgorithm);
		return this;
	}

	public List<GenericInformation1> getSignedAttributes() {
		return signedAttributes == null ? signedAttributes = new ArrayList<>() : signedAttributes;
	}

	public Signer4 setSignedAttributes(List<GenericInformation1> signedAttributes) {
		this.signedAttributes = Objects.requireNonNull(signedAttributes);
		return this;
	}

	public AlgorithmIdentification20 getSignatureAlgorithm() {
		return signatureAlgorithm;
	}

	public Signer4 setSignatureAlgorithm(AlgorithmIdentification20 signatureAlgorithm) {
		this.signatureAlgorithm = Objects.requireNonNull(signatureAlgorithm);
		return this;
	}

	public Max3000Binary getSignature() {
		return signature;
	}

	public Signer4 setSignature(Max3000Binary signature) {
		this.signature = Objects.requireNonNull(signature);
		return this;
	}
}