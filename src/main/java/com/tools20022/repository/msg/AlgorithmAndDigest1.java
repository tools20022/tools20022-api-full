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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "AlgorithmAndDigest1", propOrder = {"digestAlgorithm", "digest"})
public class AlgorithmAndDigest1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Algorithm5Code digestAlgorithm;
	/**
	 * Digest algorithm used to create the digest.
	 * <p>
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
	public static final MMMessageAttribute mmDigestAlgorithm = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AlgorithmAndDigest1.mmObject();
			isDerived = false;
			xmlTag = "DgstAlgo";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DigestAlgorithm";
			definition = "Digest algorithm used to create the digest.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Algorithm5Code.mmObject();
		}
	};
	protected Max140Text digest;
	/**
	 * Result of data-digesting process.
	 * <p>
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
	public static final MMMessageAttribute mmDigest = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AlgorithmAndDigest1.mmObject();
			isDerived = false;
			xmlTag = "Dgst";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Digest";
			definition = "Result of data-digesting process.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(AlgorithmAndDigest1.mmDigestAlgorithm, AlgorithmAndDigest1.mmDigest);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AlgorithmAndDigest1";
				definition = "Defines a cryptographic digest algorithm and value.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "DgstAlgo", required = true)
	public Algorithm5Code getDigestAlgorithm() {
		return digestAlgorithm;
	}

	public void setDigestAlgorithm(Algorithm5Code digestAlgorithm) {
		this.digestAlgorithm = digestAlgorithm;
	}

	@XmlElement(name = "Dgst", required = true)
	public Max140Text getDigest() {
		return digest;
	}

	public void setDigest(Max140Text digest) {
		this.digest = digest;
	}
}