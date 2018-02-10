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
import com.tools20022.repository.codeset.Algorithm11Code;
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
 * Parameters of the RSASSA-PSS digital signature algorithm (RSA signature
 * algorithm with appendix: Probabilistic Signature Scheme).
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Parameter8#mmDigestAlgorithm
 * Parameter8.mmDigestAlgorithm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Parameter8#mmMaskGeneratorAlgorithm
 * Parameter8.mmMaskGeneratorAlgorithm}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Parameter8#mmSaltLength
 * Parameter8.mmSaltLength}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Parameter8#mmTrailerField
 * Parameter8.mmTrailerField}</li>
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
 * "Parameter8"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Parameters of the RSASSA-PSS digital signature algorithm (RSA signature algorithm with appendix: Probabilistic Signature Scheme)."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.Parameter4
 * Parameter4}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Parameter8", propOrder = {"digestAlgorithm", "maskGeneratorAlgorithm", "saltLength", "trailerField"})
public class Parameter8 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "DgstAlgo", required = true)
	protected Algorithm11Code digestAlgorithm;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.Algorithm11Code
	 * Algorithm11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Parameter8
	 * Parameter8}</li>
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
	 * definition} = "Identification of the digest algorithm."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Parameter4#mmDigestAlgorithm
	 * Parameter4.mmDigestAlgorithm}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDigestAlgorithm = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Parameter8.mmObject();
			isDerived = false;
			xmlTag = "DgstAlgo";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DigestAlgorithm";
			definition = "Identification of the digest algorithm.";
			previousVersion_lazy = () -> Parameter4.mmDigestAlgorithm;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Algorithm11Code.mmObject();
		}
	};
	@XmlElement(name = "MskGnrtrAlgo", required = true)
	protected AlgorithmIdentification12 maskGeneratorAlgorithm;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AlgorithmIdentification12
	 * AlgorithmIdentification12}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Parameter8
	 * Parameter8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MskGnrtrAlgo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaskGeneratorAlgorithm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Mask generator function cryptographic algorithm and parameters."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Parameter4#mmMaskGeneratorAlgorithm
	 * Parameter4.mmMaskGeneratorAlgorithm}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMaskGeneratorAlgorithm = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Parameter8.mmObject();
			isDerived = false;
			xmlTag = "MskGnrtrAlgo";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaskGeneratorAlgorithm";
			definition = "Mask generator function cryptographic algorithm and parameters.";
			previousVersion_lazy = () -> Parameter4.mmMaskGeneratorAlgorithm;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> com.tools20022.repository.msg.AlgorithmIdentification12.mmObject();
		}
	};
	@XmlElement(name = "SaltLngth", required = true)
	protected Number saltLength;
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Parameter8
	 * Parameter8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SaltLngth"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SaltLength"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Length of the salt to include in the signature."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSaltLength = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Parameter8.mmObject();
			isDerived = false;
			xmlTag = "SaltLngth";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SaltLength";
			definition = "Length of the salt to include in the signature.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	@XmlElement(name = "TrlrFld")
	protected Number trailerField;
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Parameter8
	 * Parameter8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrlrFld"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TrailerField"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trailer field number."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTrailerField = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Parameter8.mmObject();
			isDerived = false;
			xmlTag = "TrlrFld";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TrailerField";
			definition = "Trailer field number.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Parameter8.mmDigestAlgorithm, com.tools20022.repository.msg.Parameter8.mmMaskGeneratorAlgorithm, com.tools20022.repository.msg.Parameter8.mmSaltLength,
						com.tools20022.repository.msg.Parameter8.mmTrailerField);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Parameter8";
				definition = "Parameters of the RSASSA-PSS digital signature algorithm (RSA signature algorithm with appendix: Probabilistic Signature Scheme).";
				previousVersion_lazy = () -> Parameter4.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Algorithm11Code getDigestAlgorithm() {
		return digestAlgorithm;
	}

	public Parameter8 setDigestAlgorithm(Algorithm11Code digestAlgorithm) {
		this.digestAlgorithm = Objects.requireNonNull(digestAlgorithm);
		return this;
	}

	public AlgorithmIdentification12 getMaskGeneratorAlgorithm() {
		return maskGeneratorAlgorithm;
	}

	public Parameter8 setMaskGeneratorAlgorithm(com.tools20022.repository.msg.AlgorithmIdentification12 maskGeneratorAlgorithm) {
		this.maskGeneratorAlgorithm = Objects.requireNonNull(maskGeneratorAlgorithm);
		return this;
	}

	public Number getSaltLength() {
		return saltLength;
	}

	public Parameter8 setSaltLength(Number saltLength) {
		this.saltLength = Objects.requireNonNull(saltLength);
		return this;
	}

	public Optional<Number> getTrailerField() {
		return trailerField == null ? Optional.empty() : Optional.of(trailerField);
	}

	public Parameter8 setTrailerField(Number trailerField) {
		this.trailerField = trailerField;
		return this;
	}
}