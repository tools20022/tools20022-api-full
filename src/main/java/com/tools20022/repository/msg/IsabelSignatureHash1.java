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
import com.tools20022.repository.datatype.Max105Text;
import com.tools20022.repository.datatype.Max50Binary;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies the hash data for the file signature.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.IsabelSignatureHash1#mmHash
 * IsabelSignatureHash1.mmHash}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IsabelSignatureHash1#mmAlgorithm
 * IsabelSignatureHash1.mmAlgorithm}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "IsabelSignatureHash1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the hash data for the file signature."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "IsabelSignatureHash1", propOrder = {"hash", "algorithm"})
public class IsabelSignatureHash1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max50Binary hash;
	/**
	 * Arbitrary block of data defined as a fixed-size bit string, the
	 * (cryptographic) hash value, that allows the detection of an accidental or
	 * intentional change to the data.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max50Binary
	 * Max50Binary}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IsabelSignatureHash1
	 * IsabelSignatureHash1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Hash"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Hash"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Arbitrary block of data defined as a fixed-size bit string, the (cryptographic) hash value, that allows the detection of an accidental or intentional change to the data."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmHash = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> IsabelSignatureHash1.mmObject();
			isDerived = false;
			xmlTag = "Hash";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Hash";
			definition = "Arbitrary block of data defined as a fixed-size bit string, the (cryptographic) hash value, that allows the detection of an accidental or intentional change to the data.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max50Binary.mmObject();
		}
	};
	protected Max105Text algorithm;
	/**
	 * Effective method for calculating the signature hash using a finite
	 * sequence of instructions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max105Text
	 * Max105Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IsabelSignatureHash1
	 * IsabelSignatureHash1}</li>
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
	 * "Effective method for calculating the signature hash using a finite sequence of instructions."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAlgorithm = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> IsabelSignatureHash1.mmObject();
			isDerived = false;
			xmlTag = "Algo";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Algorithm";
			definition = "Effective method for calculating the signature hash using a finite sequence of instructions.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max105Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(IsabelSignatureHash1.mmHash, IsabelSignatureHash1.mmAlgorithm);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "IsabelSignatureHash1";
				definition = "Specifies the hash data for the file signature.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Hash", required = true)
	public Max50Binary getHash() {
		return hash;
	}

	public void setHash(Max50Binary hash) {
		this.hash = hash;
	}

	@XmlElement(name = "Algo", required = true)
	public Max105Text getAlgorithm() {
		return algorithm;
	}

	public void setAlgorithm(Max105Text algorithm) {
		this.algorithm = algorithm;
	}
}