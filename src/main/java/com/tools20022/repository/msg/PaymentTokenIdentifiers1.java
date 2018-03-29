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
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Identifier of a token provider requestor.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTokenIdentifiers1#mmProviderIdentification
 * PaymentTokenIdentifiers1.mmProviderIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTokenIdentifiers1#mmRequestorIdentification
 * PaymentTokenIdentifiers1.mmRequestorIdentification}</li>
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
 * "PaymentTokenIdentifiers1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Identifier of a token provider requestor."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PaymentTokenIdentifiers1", propOrder = {"providerIdentification", "requestorIdentification"})
public class PaymentTokenIdentifiers1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PrvdrId", required = true)
	protected Max35Text providerIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTokenIdentifiers1
	 * PaymentTokenIdentifiers1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrvdrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProviderIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifier of the token provider."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentTokenIdentifiers1, Max35Text> mmProviderIdentification = new MMMessageAttribute<PaymentTokenIdentifiers1, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentTokenIdentifiers1.mmObject();
			isDerived = false;
			xmlTag = "PrvdrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProviderIdentification";
			definition = "Identifier of the token provider.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(PaymentTokenIdentifiers1 obj) {
			return obj.getProviderIdentification();
		}

		@Override
		public void setValue(PaymentTokenIdentifiers1 obj, Max35Text value) {
			obj.setProviderIdentification(value);
		}
	};
	@XmlElement(name = "RqstrId", required = true)
	protected Max35Text requestorIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTokenIdentifiers1
	 * PaymentTokenIdentifiers1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RqstrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestorIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifier of the token requestor."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentTokenIdentifiers1, Max35Text> mmRequestorIdentification = new MMMessageAttribute<PaymentTokenIdentifiers1, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentTokenIdentifiers1.mmObject();
			isDerived = false;
			xmlTag = "RqstrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestorIdentification";
			definition = "Identifier of the token requestor.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(PaymentTokenIdentifiers1 obj) {
			return obj.getRequestorIdentification();
		}

		@Override
		public void setValue(PaymentTokenIdentifiers1 obj, Max35Text value) {
			obj.setRequestorIdentification(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentTokenIdentifiers1.mmProviderIdentification, com.tools20022.repository.msg.PaymentTokenIdentifiers1.mmRequestorIdentification);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PaymentTokenIdentifiers1";
				definition = "Identifier of a token provider requestor.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getProviderIdentification() {
		return providerIdentification;
	}

	public PaymentTokenIdentifiers1 setProviderIdentification(Max35Text providerIdentification) {
		this.providerIdentification = Objects.requireNonNull(providerIdentification);
		return this;
	}

	public Max35Text getRequestorIdentification() {
		return requestorIdentification;
	}

	public PaymentTokenIdentifiers1 setRequestorIdentification(Max35Text requestorIdentification) {
		this.requestorIdentification = Objects.requireNonNull(requestorIdentification);
		return this;
	}
}