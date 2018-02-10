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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.SignatureOriginType1Code;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
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
 * {@linkplain com.tools20022.repository.msg.IsabelSignatureRecord1#mmSignatureType
 * IsabelSignatureRecord1.mmSignatureType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IsabelSignatureRecord1#mmSerialNumber
 * IsabelSignatureRecord1.mmSerialNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IsabelSignatureRecord1#mmCertificate
 * IsabelSignatureRecord1.mmCertificate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IsabelSignatureRecord1#mmSignature
 * IsabelSignatureRecord1.mmSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IsabelSignatureRecord1#mmAlgorithm
 * IsabelSignatureRecord1.mmAlgorithm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IsabelSignatureRecord1#mmSignerIdentification
 * IsabelSignatureRecord1.mmSignerIdentification}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "IsabelSignatureRecord1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the individual record of the file signature."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.IsabelSignatureRecord2
 * IsabelSignatureRecord2}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "IsabelSignatureRecord1", propOrder = {"signatureType", "serialNumber", "certificate", "signature", "algorithm", "signerIdentification"})
public class IsabelSignatureRecord1 {

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
	 * {@linkplain com.tools20022.repository.msg.IsabelSignatureRecord1
	 * IsabelSignatureRecord1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SgntrTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SignatureType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of the signature."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IsabelSignatureRecord2#mmSignatureType
	 * IsabelSignatureRecord2.mmSignatureType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSignatureType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IsabelSignatureRecord1.mmObject();
			isDerived = false;
			xmlTag = "SgntrTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SignatureType";
			definition = "Type of the signature.";
			nextVersions_lazy = () -> Arrays.asList(IsabelSignatureRecord2.mmSignatureType);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SignatureOriginType1Code.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.IsabelSignatureRecord1
	 * IsabelSignatureRecord1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SrlNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SerialNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Serial number of the certificate."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IsabelSignatureRecord2#mmSerialNumber
	 * IsabelSignatureRecord2.mmSerialNumber}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSerialNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IsabelSignatureRecord1.mmObject();
			isDerived = false;
			xmlTag = "SrlNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SerialNumber";
			definition = "Serial number of the certificate.";
			nextVersions_lazy = () -> Arrays.asList(IsabelSignatureRecord2.mmSerialNumber);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max20AlphaNumericText.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.IsabelSignatureRecord1
	 * IsabelSignatureRecord1}</li>
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
	 * "Electronic document which uses a digital signature to bind together a public key with an identity."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IsabelSignatureRecord2#mmCertificate
	 * IsabelSignatureRecord2.mmCertificate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCertificate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IsabelSignatureRecord1.mmObject();
			isDerived = false;
			xmlTag = "Cert";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Certificate";
			definition = "Electronic document which uses a digital signature to bind together a public key with an identity.";
			nextVersions_lazy = () -> Arrays.asList(IsabelSignatureRecord2.mmCertificate);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max4kBinary.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.IsabelSignatureRecord1
	 * IsabelSignatureRecord1}</li>
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
	 * definition} =
	 * "Mathematical scheme for demonstrating the authenticity of a digital message or document."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IsabelSignatureRecord2#mmSignature
	 * IsabelSignatureRecord2.mmSignature}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSignature = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IsabelSignatureRecord1.mmObject();
			isDerived = false;
			xmlTag = "Sgntr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Signature";
			definition = "Mathematical scheme for demonstrating the authenticity of a digital message or document.";
			nextVersions_lazy = () -> Arrays.asList(IsabelSignatureRecord2.mmSignature);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max1kBinary.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.IsabelSignatureRecord1
	 * IsabelSignatureRecord1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Algo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Algorithm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Effective method for calculating the signature using a finite sequence of instructions."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IsabelSignatureRecord2#mmAlgorithm
	 * IsabelSignatureRecord2.mmAlgorithm}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAlgorithm = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IsabelSignatureRecord1.mmObject();
			isDerived = false;
			xmlTag = "Algo";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Algorithm";
			definition = "Effective method for calculating the signature using a finite sequence of instructions.";
			nextVersions_lazy = () -> Arrays.asList(IsabelSignatureRecord2.mmAlgorithm);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max105Text.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.IsabelSignatureRecord1
	 * IsabelSignatureRecord1}</li>
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
	 * definition} =
	 * "Unique identification of the signer that issued the signature."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IsabelSignatureRecord2#mmSignerIdentification
	 * IsabelSignatureRecord2.mmSignerIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSignerIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IsabelSignatureRecord1.mmObject();
			isDerived = false;
			xmlTag = "SgnrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SignerIdentification";
			definition = "Unique identification of the signer that issued the signature.";
			nextVersions_lazy = () -> Arrays.asList(IsabelSignatureRecord2.mmSignerIdentification);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max13AlphaNumericText.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IsabelSignatureRecord1.mmSignatureType, com.tools20022.repository.msg.IsabelSignatureRecord1.mmSerialNumber,
						com.tools20022.repository.msg.IsabelSignatureRecord1.mmCertificate, com.tools20022.repository.msg.IsabelSignatureRecord1.mmSignature, com.tools20022.repository.msg.IsabelSignatureRecord1.mmAlgorithm,
						com.tools20022.repository.msg.IsabelSignatureRecord1.mmSignerIdentification);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "IsabelSignatureRecord1";
				definition = "Specifies the individual record of the file signature.";
				nextVersions_lazy = () -> Arrays.asList(IsabelSignatureRecord2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public SignatureOriginType1Code getSignatureType() {
		return signatureType;
	}

	public IsabelSignatureRecord1 setSignatureType(SignatureOriginType1Code signatureType) {
		this.signatureType = Objects.requireNonNull(signatureType);
		return this;
	}

	public Max20AlphaNumericText getSerialNumber() {
		return serialNumber;
	}

	public IsabelSignatureRecord1 setSerialNumber(Max20AlphaNumericText serialNumber) {
		this.serialNumber = Objects.requireNonNull(serialNumber);
		return this;
	}

	public Max4kBinary getCertificate() {
		return certificate;
	}

	public IsabelSignatureRecord1 setCertificate(Max4kBinary certificate) {
		this.certificate = Objects.requireNonNull(certificate);
		return this;
	}

	public Max1kBinary getSignature() {
		return signature;
	}

	public IsabelSignatureRecord1 setSignature(Max1kBinary signature) {
		this.signature = Objects.requireNonNull(signature);
		return this;
	}

	public Max105Text getAlgorithm() {
		return algorithm;
	}

	public IsabelSignatureRecord1 setAlgorithm(Max105Text algorithm) {
		this.algorithm = Objects.requireNonNull(algorithm);
		return this;
	}

	public Max13AlphaNumericText getSignerIdentification() {
		return signerIdentification;
	}

	public IsabelSignatureRecord1 setSignerIdentification(Max13AlphaNumericText signerIdentification) {
		this.signerIdentification = Objects.requireNonNull(signerIdentification);
		return this;
	}
}