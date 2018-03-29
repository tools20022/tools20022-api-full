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
import com.tools20022.repository.datatype.Max5000Binary;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
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
 * <li>{@linkplain com.tools20022.repository.msg.PublicRSAKey1#mmModulus
 * PublicRSAKey1.mmModulus}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PublicRSAKey1#mmExponent
 * PublicRSAKey1.mmExponent}</li>
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
 * "PublicRSAKey1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Value of the public component of a RSA key."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.PublicRSAKey2 PublicRSAKey2}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PublicRSAKey1", propOrder = {"modulus", "exponent"})
public class PublicRSAKey1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Mdlus", required = true)
	protected Max5000Binary modulus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max5000Binary
	 * Max5000Binary}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PublicRSAKey1 PublicRSAKey1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Mdlus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Modulus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Modulus of the RSA key."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PublicRSAKey1, Max5000Binary> mmModulus = new MMMessageAttribute<PublicRSAKey1, Max5000Binary>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PublicRSAKey1.mmObject();
			isDerived = false;
			xmlTag = "Mdlus";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Modulus";
			definition = "Modulus of the RSA key.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max5000Binary.mmObject();
		}

		@Override
		public Max5000Binary getValue(PublicRSAKey1 obj) {
			return obj.getModulus();
		}

		@Override
		public void setValue(PublicRSAKey1 obj, Max5000Binary value) {
			obj.setModulus(value);
		}
	};
	@XmlElement(name = "Expnt", required = true)
	protected Max5000Binary exponent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max5000Binary
	 * Max5000Binary}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PublicRSAKey1 PublicRSAKey1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Expnt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Exponent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Public exponent of the RSA key."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PublicRSAKey1, Max5000Binary> mmExponent = new MMMessageAttribute<PublicRSAKey1, Max5000Binary>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PublicRSAKey1.mmObject();
			isDerived = false;
			xmlTag = "Expnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Exponent";
			definition = "Public exponent of the RSA key.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max5000Binary.mmObject();
		}

		@Override
		public Max5000Binary getValue(PublicRSAKey1 obj) {
			return obj.getExponent();
		}

		@Override
		public void setValue(PublicRSAKey1 obj, Max5000Binary value) {
			obj.setExponent(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PublicRSAKey1.mmModulus, com.tools20022.repository.msg.PublicRSAKey1.mmExponent);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PublicRSAKey1";
				definition = "Value of the public component of a RSA key.";
				nextVersions_lazy = () -> Arrays.asList(PublicRSAKey2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Max5000Binary getModulus() {
		return modulus;
	}

	public PublicRSAKey1 setModulus(Max5000Binary modulus) {
		this.modulus = Objects.requireNonNull(modulus);
		return this;
	}

	public Max5000Binary getExponent() {
		return exponent;
	}

	public PublicRSAKey1 setExponent(Max5000Binary exponent) {
		this.exponent = Objects.requireNonNull(exponent);
		return this;
	}
}