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
import com.tools20022.repository.entity.Undertaking;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ExpiryDetails1;
import com.tools20022.repository.msg.UndertakingAmount2;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Details related to the undertaking.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Undertaking10#mmNewUndertakingAmount
 * Undertaking10.mmNewUndertakingAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Undertaking10#mmNewExpiryDetails
 * Undertaking10.mmNewExpiryDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Undertaking
 * Undertaking}</li>
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
 * "Undertaking10"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Details related to the undertaking."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Undertaking10", propOrder = {"newUndertakingAmount", "newExpiryDetails"})
public class Undertaking10 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "NewUdrtkgAmt")
	protected UndertakingAmount2 newUndertakingAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.UndertakingAmount2
	 * UndertakingAmount2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking#mmUndertakingAmount
	 * Undertaking.mmUndertakingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Undertaking10 Undertaking10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NewUdrtkgAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewUndertakingAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Details related to the requested new amount for the counter-undertaking."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Undertaking10, Optional<UndertakingAmount2>> mmNewUndertakingAmount = new MMMessageAttribute<Undertaking10, Optional<UndertakingAmount2>>() {
		{
			businessElementTrace_lazy = () -> Undertaking.mmUndertakingAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.Undertaking10.mmObject();
			isDerived = false;
			xmlTag = "NewUdrtkgAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewUndertakingAmount";
			definition = "Details related to the requested new amount for the counter-undertaking.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> UndertakingAmount2.mmObject();
		}

		@Override
		public Optional<UndertakingAmount2> getValue(Undertaking10 obj) {
			return obj.getNewUndertakingAmount();
		}

		@Override
		public void setValue(Undertaking10 obj, Optional<UndertakingAmount2> value) {
			obj.setNewUndertakingAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "NewXpryDtls")
	protected ExpiryDetails1 newExpiryDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.ExpiryDetails1
	 * ExpiryDetails1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking#mmExpiry
	 * Undertaking.mmExpiry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Undertaking10 Undertaking10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NewXpryDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewExpiryDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Details related to the requested new expiry terms for the counter-undertaking."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Undertaking10, Optional<ExpiryDetails1>> mmNewExpiryDetails = new MMMessageAttribute<Undertaking10, Optional<ExpiryDetails1>>() {
		{
			businessElementTrace_lazy = () -> Undertaking.mmExpiry;
			componentContext_lazy = () -> com.tools20022.repository.msg.Undertaking10.mmObject();
			isDerived = false;
			xmlTag = "NewXpryDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewExpiryDetails";
			definition = "Details related to the requested new expiry terms for the counter-undertaking.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ExpiryDetails1.mmObject();
		}

		@Override
		public Optional<ExpiryDetails1> getValue(Undertaking10 obj) {
			return obj.getNewExpiryDetails();
		}

		@Override
		public void setValue(Undertaking10 obj, Optional<ExpiryDetails1> value) {
			obj.setNewExpiryDetails(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Undertaking10.mmNewUndertakingAmount, com.tools20022.repository.msg.Undertaking10.mmNewExpiryDetails);
				trace_lazy = () -> Undertaking.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Undertaking10";
				definition = "Details related to the undertaking.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<UndertakingAmount2> getNewUndertakingAmount() {
		return newUndertakingAmount == null ? Optional.empty() : Optional.of(newUndertakingAmount);
	}

	public Undertaking10 setNewUndertakingAmount(UndertakingAmount2 newUndertakingAmount) {
		this.newUndertakingAmount = newUndertakingAmount;
		return this;
	}

	public Optional<ExpiryDetails1> getNewExpiryDetails() {
		return newExpiryDetails == null ? Optional.empty() : Optional.of(newExpiryDetails);
	}

	public Undertaking10 setNewExpiryDetails(ExpiryDetails1 newExpiryDetails) {
		this.newExpiryDetails = newExpiryDetails;
		return this;
	}
}