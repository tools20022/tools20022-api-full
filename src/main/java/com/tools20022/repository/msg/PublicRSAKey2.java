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
import com.tools20022.repository.codeset.Algorithm7Code;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.PublicRSAKey1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Value of the public component of a RSA key.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.PublicRSAKey2#mmAlgorithm
 * PublicRSAKey2.mmAlgorithm}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PublicRSAKey2#mmPublicKeyValue
 * PublicRSAKey2.mmPublicKeyValue}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PublicRSAKey2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Value of the public component of a RSA key."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.PublicRSAKey1
 * PublicRSAKey1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PublicRSAKey2", propOrder = {"algorithm", "publicKeyValue"})
public class PublicRSAKey2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Algo")
	protected Algorithm7Code algorithm;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.Algorithm7Code
	 * Algorithm7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PublicRSAKey2 PublicRSAKey2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Algo"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Algorithm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Asymmetric cryptographic algorithm."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PublicRSAKey2, Optional<Algorithm7Code>> mmAlgorithm = new MMMessageAttribute<PublicRSAKey2, Optional<Algorithm7Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PublicRSAKey2.mmObject();
			isDerived = false;
			xmlTag = "Algo";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Algorithm";
			definition = "Asymmetric cryptographic algorithm.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Algorithm7Code.mmObject();
		}

		@Override
		public Optional<Algorithm7Code> getValue(PublicRSAKey2 obj) {
			return obj.getAlgorithm();
		}

		@Override
		public void setValue(PublicRSAKey2 obj, Optional<Algorithm7Code> value) {
			obj.setAlgorithm(value.orElse(null));
		}
	};
	@XmlElement(name = "PblcKeyVal", required = true)
	protected PublicRSAKey1 publicKeyValue;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PublicRSAKey1
	 * PublicRSAKey1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PublicRSAKey2 PublicRSAKey2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PblcKeyVal"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PublicKeyValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Public key value."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PublicRSAKey2, PublicRSAKey1> mmPublicKeyValue = new MMMessageAssociationEnd<PublicRSAKey2, PublicRSAKey1>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PublicRSAKey2.mmObject();
			isDerived = false;
			xmlTag = "PblcKeyVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PublicKeyValue";
			definition = "Public key value.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PublicRSAKey1.mmObject();
		}

		@Override
		public PublicRSAKey1 getValue(PublicRSAKey2 obj) {
			return obj.getPublicKeyValue();
		}

		@Override
		public void setValue(PublicRSAKey2 obj, PublicRSAKey1 value) {
			obj.setPublicKeyValue(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PublicRSAKey2.mmAlgorithm, com.tools20022.repository.msg.PublicRSAKey2.mmPublicKeyValue);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PublicRSAKey2";
				definition = "Value of the public component of a RSA key.";
				previousVersion_lazy = () -> PublicRSAKey1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Algorithm7Code> getAlgorithm() {
		return algorithm == null ? Optional.empty() : Optional.of(algorithm);
	}

	public PublicRSAKey2 setAlgorithm(Algorithm7Code algorithm) {
		this.algorithm = algorithm;
		return this;
	}

	public PublicRSAKey1 getPublicKeyValue() {
		return publicKeyValue;
	}

	public PublicRSAKey2 setPublicKeyValue(PublicRSAKey1 publicKeyValue) {
		this.publicKeyValue = Objects.requireNonNull(publicKeyValue);
		return this;
	}
}