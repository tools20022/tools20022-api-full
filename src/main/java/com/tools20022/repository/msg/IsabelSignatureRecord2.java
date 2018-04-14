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
import com.tools20022.repository.codeset.SignatureOriginType1Code;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.IsabelLRCIExtension1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies the individual record of the file signature.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IsabelSignatureRecord2#mmSignatureType
 * IsabelSignatureRecord2.mmSignatureType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IsabelSignatureRecord2#mmSerialNumber
 * IsabelSignatureRecord2.mmSerialNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IsabelSignatureRecord2#mmCertificate
 * IsabelSignatureRecord2.mmCertificate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IsabelSignatureRecord2#mmSignature
 * IsabelSignatureRecord2.mmSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IsabelSignatureRecord2#mmAlgorithm
 * IsabelSignatureRecord2.mmAlgorithm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IsabelSignatureRecord2#mmSignerIdentification
 * IsabelSignatureRecord2.mmSignerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IsabelSignatureRecord2#mmLRCIExtension
 * IsabelSignatureRecord2.mmLRCIExtension}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "IsabelSignatureRecord2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the individual record of the file signature."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.IsabelSignatureRecord1
 * IsabelSignatureRecord1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "IsabelSignatureRecord2", propOrder = {"signatureType", "serialNumber", "certificate", "signature", "algorithm", "signerIdentification", "lRCIExtension"})
public class IsabelSignatureRecord2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "SgntrTp", required = true)
	protected SignatureOriginType1Code signatureType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SignatureOriginType1Code
	 * SignatureOriginType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IsabelSignatureRecord2
	 * IsabelSignatureRecord2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SgntrTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SignatureType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of the signature."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IsabelSignatureRecord1#mmSignatureType
	 * IsabelSignatureRecord1.mmSignatureType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IsabelSignatureRecord2, SignatureOriginType1Code> mmSignatureType = new MMMessageAttribute<IsabelSignatureRecord2, SignatureOriginType1Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IsabelSignatureRecord2.mmObject();
			isDerived = false;
			xmlTag = "SgntrTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SignatureType";
			definition = "Type of the signature.";
			previousVersion_lazy = () -> IsabelSignatureRecord1.mmSignatureType;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SignatureOriginType1Code.mmObject();
		}

		@Override
		public SignatureOriginType1Code getValue(IsabelSignatureRecord2 obj) {
			return obj.getSignatureType();
		}

		@Override
		public void setValue(IsabelSignatureRecord2 obj, SignatureOriginType1Code value) {
			obj.setSignatureType(value);
		}
	};
	@XmlElement(name = "SrlNb", required = true)
	protected Max20AlphaNumericText serialNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max20AlphaNumericText
	 * Max20AlphaNumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IsabelSignatureRecord2
	 * IsabelSignatureRecord2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SrlNb"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SerialNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Serial number of the certificate."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IsabelSignatureRecord1#mmSerialNumber
	 * IsabelSignatureRecord1.mmSerialNumber}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IsabelSignatureRecord2, Max20AlphaNumericText> mmSerialNumber = new MMMessageAttribute<IsabelSignatureRecord2, Max20AlphaNumericText>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IsabelSignatureRecord2.mmObject();
			isDerived = false;
			xmlTag = "SrlNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SerialNumber";
			definition = "Serial number of the certificate.";
			previousVersion_lazy = () -> IsabelSignatureRecord1.mmSerialNumber;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max20AlphaNumericText.mmObject();
		}

		@Override
		public Max20AlphaNumericText getValue(IsabelSignatureRecord2 obj) {
			return obj.getSerialNumber();
		}

		@Override
		public void setValue(IsabelSignatureRecord2 obj, Max20AlphaNumericText value) {
			obj.setSerialNumber(value);
		}
	};
	@XmlElement(name = "Cert", required = true)
	protected Max4kBinary certificate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max4kBinary
	 * Max4kBinary}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IsabelSignatureRecord2
	 * IsabelSignatureRecord2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cert"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Certificate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Electronic document which uses a digital signature to bind together a public key with an identity."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IsabelSignatureRecord1#mmCertificate
	 * IsabelSignatureRecord1.mmCertificate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IsabelSignatureRecord2, Max4kBinary> mmCertificate = new MMMessageAttribute<IsabelSignatureRecord2, Max4kBinary>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IsabelSignatureRecord2.mmObject();
			isDerived = false;
			xmlTag = "Cert";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Certificate";
			definition = "Electronic document which uses a digital signature to bind together a public key with an identity.";
			previousVersion_lazy = () -> IsabelSignatureRecord1.mmCertificate;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max4kBinary.mmObject();
		}

		@Override
		public Max4kBinary getValue(IsabelSignatureRecord2 obj) {
			return obj.getCertificate();
		}

		@Override
		public void setValue(IsabelSignatureRecord2 obj, Max4kBinary value) {
			obj.setCertificate(value);
		}
	};
	@XmlElement(name = "Sgntr", required = true)
	protected Max1kBinary signature;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max1kBinary
	 * Max1kBinary}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IsabelSignatureRecord2
	 * IsabelSignatureRecord2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sgntr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Signature"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Mathematical scheme for demonstrating the authenticity of a digital message or document."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IsabelSignatureRecord1#mmSignature
	 * IsabelSignatureRecord1.mmSignature}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IsabelSignatureRecord2, Max1kBinary> mmSignature = new MMMessageAttribute<IsabelSignatureRecord2, Max1kBinary>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IsabelSignatureRecord2.mmObject();
			isDerived = false;
			xmlTag = "Sgntr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Signature";
			definition = "Mathematical scheme for demonstrating the authenticity of a digital message or document.";
			previousVersion_lazy = () -> IsabelSignatureRecord1.mmSignature;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max1kBinary.mmObject();
		}

		@Override
		public Max1kBinary getValue(IsabelSignatureRecord2 obj) {
			return obj.getSignature();
		}

		@Override
		public void setValue(IsabelSignatureRecord2 obj, Max1kBinary value) {
			obj.setSignature(value);
		}
	};
	@XmlElement(name = "Algo", required = true)
	protected Max105Text algorithm;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max105Text
	 * Max105Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IsabelSignatureRecord2
	 * IsabelSignatureRecord2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Algo"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Algorithm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Effective method for calculating the signature using a finite sequence of instructions."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IsabelSignatureRecord1#mmAlgorithm
	 * IsabelSignatureRecord1.mmAlgorithm}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IsabelSignatureRecord2, Max105Text> mmAlgorithm = new MMMessageAttribute<IsabelSignatureRecord2, Max105Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IsabelSignatureRecord2.mmObject();
			isDerived = false;
			xmlTag = "Algo";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Algorithm";
			definition = "Effective method for calculating the signature using a finite sequence of instructions.";
			previousVersion_lazy = () -> IsabelSignatureRecord1.mmAlgorithm;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max105Text.mmObject();
		}

		@Override
		public Max105Text getValue(IsabelSignatureRecord2 obj) {
			return obj.getAlgorithm();
		}

		@Override
		public void setValue(IsabelSignatureRecord2 obj, Max105Text value) {
			obj.setAlgorithm(value);
		}
	};
	@XmlElement(name = "SgnrId", required = true)
	protected Max13AlphaNumericText signerIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max13AlphaNumericText
	 * Max13AlphaNumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IsabelSignatureRecord2
	 * IsabelSignatureRecord2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SgnrId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SignerIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification of the signer that issued the signature."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IsabelSignatureRecord1#mmSignerIdentification
	 * IsabelSignatureRecord1.mmSignerIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IsabelSignatureRecord2, Max13AlphaNumericText> mmSignerIdentification = new MMMessageAttribute<IsabelSignatureRecord2, Max13AlphaNumericText>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IsabelSignatureRecord2.mmObject();
			isDerived = false;
			xmlTag = "SgnrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SignerIdentification";
			definition = "Unique identification of the signer that issued the signature.";
			previousVersion_lazy = () -> IsabelSignatureRecord1.mmSignerIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max13AlphaNumericText.mmObject();
		}

		@Override
		public Max13AlphaNumericText getValue(IsabelSignatureRecord2 obj) {
			return obj.getSignerIdentification();
		}

		@Override
		public void setValue(IsabelSignatureRecord2 obj, Max13AlphaNumericText value) {
			obj.setSignerIdentification(value);
		}
	};
	@XmlElement(name = "LRCIXtnsn")
	protected IsabelLRCIExtension1 lRCIExtension;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.IsabelLRCIExtension1
	 * IsabelLRCIExtension1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IsabelSignatureRecord2
	 * IsabelSignatureRecord2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LRCIXtnsn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LRCIExtension"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Block of signature related data in case the LRCI protocol is used during the signature process of a set of payment files."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<IsabelSignatureRecord2, Optional<IsabelLRCIExtension1>> mmLRCIExtension = new MMMessageAssociationEnd<IsabelSignatureRecord2, Optional<IsabelLRCIExtension1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IsabelSignatureRecord2.mmObject();
			isDerived = false;
			xmlTag = "LRCIXtnsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LRCIExtension";
			definition = "Block of signature related data in case the LRCI protocol is used during the signature process of a set of payment files.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> IsabelLRCIExtension1.mmObject();
		}

		@Override
		public Optional<IsabelLRCIExtension1> getValue(IsabelSignatureRecord2 obj) {
			return obj.getLRCIExtension();
		}

		@Override
		public void setValue(IsabelSignatureRecord2 obj, Optional<IsabelLRCIExtension1> value) {
			obj.setLRCIExtension(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IsabelSignatureRecord2.mmSignatureType, com.tools20022.repository.msg.IsabelSignatureRecord2.mmSerialNumber,
						com.tools20022.repository.msg.IsabelSignatureRecord2.mmCertificate, com.tools20022.repository.msg.IsabelSignatureRecord2.mmSignature, com.tools20022.repository.msg.IsabelSignatureRecord2.mmAlgorithm,
						com.tools20022.repository.msg.IsabelSignatureRecord2.mmSignerIdentification, com.tools20022.repository.msg.IsabelSignatureRecord2.mmLRCIExtension);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "IsabelSignatureRecord2";
				definition = "Specifies the individual record of the file signature.";
				previousVersion_lazy = () -> IsabelSignatureRecord1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public SignatureOriginType1Code getSignatureType() {
		return signatureType;
	}

	public IsabelSignatureRecord2 setSignatureType(SignatureOriginType1Code signatureType) {
		this.signatureType = Objects.requireNonNull(signatureType);
		return this;
	}

	public Max20AlphaNumericText getSerialNumber() {
		return serialNumber;
	}

	public IsabelSignatureRecord2 setSerialNumber(Max20AlphaNumericText serialNumber) {
		this.serialNumber = Objects.requireNonNull(serialNumber);
		return this;
	}

	public Max4kBinary getCertificate() {
		return certificate;
	}

	public IsabelSignatureRecord2 setCertificate(Max4kBinary certificate) {
		this.certificate = Objects.requireNonNull(certificate);
		return this;
	}

	public Max1kBinary getSignature() {
		return signature;
	}

	public IsabelSignatureRecord2 setSignature(Max1kBinary signature) {
		this.signature = Objects.requireNonNull(signature);
		return this;
	}

	public Max105Text getAlgorithm() {
		return algorithm;
	}

	public IsabelSignatureRecord2 setAlgorithm(Max105Text algorithm) {
		this.algorithm = Objects.requireNonNull(algorithm);
		return this;
	}

	public Max13AlphaNumericText getSignerIdentification() {
		return signerIdentification;
	}

	public IsabelSignatureRecord2 setSignerIdentification(Max13AlphaNumericText signerIdentification) {
		this.signerIdentification = Objects.requireNonNull(signerIdentification);
		return this;
	}

	public Optional<IsabelLRCIExtension1> getLRCIExtension() {
		return lRCIExtension == null ? Optional.empty() : Optional.of(lRCIExtension);
	}

	public IsabelSignatureRecord2 setLRCIExtension(IsabelLRCIExtension1 lRCIExtension) {
		this.lRCIExtension = lRCIExtension;
		return this;
	}
}