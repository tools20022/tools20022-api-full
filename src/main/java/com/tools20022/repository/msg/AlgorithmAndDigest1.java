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
import com.tools20022.repository.codeset.Algorithm5Code;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Defines a cryptographic digest algorithm and value.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AlgorithmAndDigest1#mmDigestAlgorithm
 * AlgorithmAndDigest1.mmDigestAlgorithm}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AlgorithmAndDigest1#mmDigest
 * AlgorithmAndDigest1.mmDigest}</li>
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
 * "AlgorithmAndDigest1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Defines a cryptographic digest algorithm and value."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AlgorithmAndDigest1", propOrder = {"digestAlgorithm", "digest"})
public class AlgorithmAndDigest1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "DgstAlgo", required = true)
	protected Algorithm5Code digestAlgorithm;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.Algorithm5Code
	 * Algorithm5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AlgorithmAndDigest1
	 * AlgorithmAndDigest1}</li>
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
	 * definition} = "Digest algorithm used to create the digest."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AlgorithmAndDigest1, Algorithm5Code> mmDigestAlgorithm = new MMMessageAttribute<AlgorithmAndDigest1, Algorithm5Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AlgorithmAndDigest1.mmObject();
			isDerived = false;
			xmlTag = "DgstAlgo";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DigestAlgorithm";
			definition = "Digest algorithm used to create the digest.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Algorithm5Code.mmObject();
		}

		@Override
		public Algorithm5Code getValue(AlgorithmAndDigest1 obj) {
			return obj.getDigestAlgorithm();
		}

		@Override
		public void setValue(AlgorithmAndDigest1 obj, Algorithm5Code value) {
			obj.setDigestAlgorithm(value);
		}
	};
	@XmlElement(name = "Dgst", required = true)
	protected Max140Text digest;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AlgorithmAndDigest1
	 * AlgorithmAndDigest1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Dgst"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Digest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Result of data-digesting process."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AlgorithmAndDigest1, Max140Text> mmDigest = new MMMessageAttribute<AlgorithmAndDigest1, Max140Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AlgorithmAndDigest1.mmObject();
			isDerived = false;
			xmlTag = "Dgst";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Digest";
			definition = "Result of data-digesting process.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max140Text.mmObject();
		}

		@Override
		public Max140Text getValue(AlgorithmAndDigest1 obj) {
			return obj.getDigest();
		}

		@Override
		public void setValue(AlgorithmAndDigest1 obj, Max140Text value) {
			obj.setDigest(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AlgorithmAndDigest1.mmDigestAlgorithm, com.tools20022.repository.msg.AlgorithmAndDigest1.mmDigest);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AlgorithmAndDigest1";
				definition = "Defines a cryptographic digest algorithm and value.";
			}
		});
		return mmObject_lazy.get();
	}

	public Algorithm5Code getDigestAlgorithm() {
		return digestAlgorithm;
	}

	public AlgorithmAndDigest1 setDigestAlgorithm(Algorithm5Code digestAlgorithm) {
		this.digestAlgorithm = Objects.requireNonNull(digestAlgorithm);
		return this;
	}

	public Max140Text getDigest() {
		return digest;
	}

	public AlgorithmAndDigest1 setDigest(Max140Text digest) {
		this.digest = Objects.requireNonNull(digest);
		return this;
	}
}