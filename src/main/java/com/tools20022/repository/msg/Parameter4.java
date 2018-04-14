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
import com.tools20022.repository.codeset.EncryptionFormat1Code;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.AlgorithmIdentification12;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Parameters of the asymmetric encryption algorithm.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Parameter4#mmEncryptionFormat
 * Parameter4.mmEncryptionFormat}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Parameter4#mmDigestAlgorithm
 * Parameter4.mmDigestAlgorithm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Parameter4#mmMaskGeneratorAlgorithm
 * Parameter4.mmMaskGeneratorAlgorithm}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Parameter4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Parameters of the asymmetric encryption algorithm."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Parameter8 Parameter8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Parameter10 Parameter10}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.Parameter2
 * Parameter2}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Parameter4", propOrder = {"encryptionFormat", "digestAlgorithm", "maskGeneratorAlgorithm"})
public class Parameter4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "NcrptnFrmt")
	protected EncryptionFormat1Code encryptionFormat;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.EncryptionFormat1Code
	 * EncryptionFormat1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Parameter4
	 * Parameter4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NcrptnFrmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EncryptionFormat"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Format of data before encryption, if the format is not plaintext or implicit."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Parameter10#mmEncryptionFormat
	 * Parameter10.mmEncryptionFormat}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Parameter4, Optional<EncryptionFormat1Code>> mmEncryptionFormat = new MMMessageAttribute<Parameter4, Optional<EncryptionFormat1Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Parameter4.mmObject();
			isDerived = false;
			xmlTag = "NcrptnFrmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EncryptionFormat";
			definition = "Format of data before encryption, if the format is not plaintext or implicit.";
			nextVersions_lazy = () -> Arrays.asList(Parameter10.mmEncryptionFormat);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> EncryptionFormat1Code.mmObject();
		}

		@Override
		public Optional<EncryptionFormat1Code> getValue(Parameter4 obj) {
			return obj.getEncryptionFormat();
		}

		@Override
		public void setValue(Parameter4 obj, Optional<EncryptionFormat1Code> value) {
			obj.setEncryptionFormat(value.orElse(null));
		}
	};
	@XmlElement(name = "DgstAlgo")
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Parameter4
	 * Parameter4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DgstAlgo"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DigestAlgorithm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the digest algorithm."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Parameter8#mmDigestAlgorithm
	 * Parameter8.mmDigestAlgorithm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Parameter10#mmDigestAlgorithm
	 * Parameter10.mmDigestAlgorithm}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Parameter2#mmDigestAlgorithm
	 * Parameter2.mmDigestAlgorithm}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Parameter4, Optional<Algorithm11Code>> mmDigestAlgorithm = new MMMessageAttribute<Parameter4, Optional<Algorithm11Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Parameter4.mmObject();
			isDerived = false;
			xmlTag = "DgstAlgo";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DigestAlgorithm";
			definition = "Identification of the digest algorithm.";
			nextVersions_lazy = () -> Arrays.asList(Parameter8.mmDigestAlgorithm, Parameter10.mmDigestAlgorithm);
			previousVersion_lazy = () -> Parameter2.mmDigestAlgorithm;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Algorithm11Code.mmObject();
		}

		@Override
		public Optional<Algorithm11Code> getValue(Parameter4 obj) {
			return obj.getDigestAlgorithm();
		}

		@Override
		public void setValue(Parameter4 obj, Optional<Algorithm11Code> value) {
			obj.setDigestAlgorithm(value.orElse(null));
		}
	};
	@XmlElement(name = "MskGnrtrAlgo")
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Parameter4
	 * Parameter4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MskGnrtrAlgo"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaskGeneratorAlgorithm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Mask generator function cryptographic algorithm and parameters."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Parameter8#mmMaskGeneratorAlgorithm
	 * Parameter8.mmMaskGeneratorAlgorithm}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Parameter10#mmMaskGeneratorAlgorithm
	 * Parameter10.mmMaskGeneratorAlgorithm}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Parameter2#mmMaskGeneratorAlgorithm
	 * Parameter2.mmMaskGeneratorAlgorithm}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Parameter4, Optional<AlgorithmIdentification12>> mmMaskGeneratorAlgorithm = new MMMessageAttribute<Parameter4, Optional<AlgorithmIdentification12>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Parameter4.mmObject();
			isDerived = false;
			xmlTag = "MskGnrtrAlgo";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaskGeneratorAlgorithm";
			definition = "Mask generator function cryptographic algorithm and parameters.";
			nextVersions_lazy = () -> Arrays.asList(Parameter8.mmMaskGeneratorAlgorithm, Parameter10.mmMaskGeneratorAlgorithm);
			previousVersion_lazy = () -> Parameter2.mmMaskGeneratorAlgorithm;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AlgorithmIdentification12.mmObject();
		}

		@Override
		public Optional<AlgorithmIdentification12> getValue(Parameter4 obj) {
			return obj.getMaskGeneratorAlgorithm();
		}

		@Override
		public void setValue(Parameter4 obj, Optional<AlgorithmIdentification12> value) {
			obj.setMaskGeneratorAlgorithm(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Parameter4.mmEncryptionFormat, com.tools20022.repository.msg.Parameter4.mmDigestAlgorithm,
						com.tools20022.repository.msg.Parameter4.mmMaskGeneratorAlgorithm);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Parameter4";
				definition = "Parameters of the asymmetric encryption algorithm.";
				nextVersions_lazy = () -> Arrays.asList(Parameter8.mmObject(), Parameter10.mmObject());
				previousVersion_lazy = () -> Parameter2.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<EncryptionFormat1Code> getEncryptionFormat() {
		return encryptionFormat == null ? Optional.empty() : Optional.of(encryptionFormat);
	}

	public Parameter4 setEncryptionFormat(EncryptionFormat1Code encryptionFormat) {
		this.encryptionFormat = encryptionFormat;
		return this;
	}

	public Optional<Algorithm11Code> getDigestAlgorithm() {
		return digestAlgorithm == null ? Optional.empty() : Optional.of(digestAlgorithm);
	}

	public Parameter4 setDigestAlgorithm(Algorithm11Code digestAlgorithm) {
		this.digestAlgorithm = digestAlgorithm;
		return this;
	}

	public Optional<AlgorithmIdentification12> getMaskGeneratorAlgorithm() {
		return maskGeneratorAlgorithm == null ? Optional.empty() : Optional.of(maskGeneratorAlgorithm);
	}

	public Parameter4 setMaskGeneratorAlgorithm(AlgorithmIdentification12 maskGeneratorAlgorithm) {
		this.maskGeneratorAlgorithm = maskGeneratorAlgorithm;
		return this;
	}
}