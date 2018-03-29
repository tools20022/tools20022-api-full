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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.SecuritiesTransactionPrice2Choice;
import com.tools20022.repository.entity.Price;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.SecuritiesTransactionPrice1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice element capturing strike price related descriptive information.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionPrice4Choice#mmPrice
 * SecuritiesTransactionPrice4Choice.mmPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionPrice4Choice#mmNoPrice
 * SecuritiesTransactionPrice4Choice.mmNoPrice}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Price Price}</li>
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
 * "SecuritiesTransactionPrice4Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice element capturing strike price related descriptive information."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SecuritiesTransactionPrice4Choice", propOrder = {"price", "noPrice"})
public class SecuritiesTransactionPrice4Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Pric", required = true)
	protected SecuritiesTransactionPrice2Choice price;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionPrice2Choice
	 * SecuritiesTransactionPrice2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Price#mmSecuritiesPricing
	 * Price.mmSecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionPrice4Choice
	 * SecuritiesTransactionPrice4Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Pric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Price"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Predetermined price at which the holder will have to buy or sell the underlying instrument."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesTransactionPrice4Choice, SecuritiesTransactionPrice2Choice> mmPrice = new MMMessageAssociationEnd<SecuritiesTransactionPrice4Choice, SecuritiesTransactionPrice2Choice>() {
		{
			businessElementTrace_lazy = () -> Price.mmSecuritiesPricing;
			componentContext_lazy = () -> com.tools20022.repository.choice.SecuritiesTransactionPrice4Choice.mmObject();
			isDerived = false;
			xmlTag = "Pric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Price";
			definition = "Predetermined price at which the holder will have to buy or sell the underlying instrument.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SecuritiesTransactionPrice2Choice.mmObject();
		}

		@Override
		public SecuritiesTransactionPrice2Choice getValue(SecuritiesTransactionPrice4Choice obj) {
			return obj.getPrice();
		}

		@Override
		public void setValue(SecuritiesTransactionPrice4Choice obj, SecuritiesTransactionPrice2Choice value) {
			obj.setPrice(value);
		}
	};
	@XmlElement(name = "NoPric", required = true)
	protected SecuritiesTransactionPrice1 noPrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTransactionPrice1
	 * SecuritiesTransactionPrice1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionPrice4Choice
	 * SecuritiesTransactionPrice4Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NoPric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Captures where no price is yet known."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesTransactionPrice4Choice, SecuritiesTransactionPrice1> mmNoPrice = new MMMessageAssociationEnd<SecuritiesTransactionPrice4Choice, SecuritiesTransactionPrice1>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.SecuritiesTransactionPrice4Choice.mmObject();
			isDerived = false;
			xmlTag = "NoPric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoPrice";
			definition = "Captures where no price is yet known.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SecuritiesTransactionPrice1.mmObject();
		}

		@Override
		public SecuritiesTransactionPrice1 getValue(SecuritiesTransactionPrice4Choice obj) {
			return obj.getNoPrice();
		}

		@Override
		public void setValue(SecuritiesTransactionPrice4Choice obj, SecuritiesTransactionPrice1 value) {
			obj.setNoPrice(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.SecuritiesTransactionPrice4Choice.mmPrice, com.tools20022.repository.choice.SecuritiesTransactionPrice4Choice.mmNoPrice);
				trace_lazy = () -> Price.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesTransactionPrice4Choice";
				definition = "Choice element capturing strike price related descriptive information.";
			}
		});
		return mmObject_lazy.get();
	}

	public SecuritiesTransactionPrice2Choice getPrice() {
		return price;
	}

	public SecuritiesTransactionPrice4Choice setPrice(SecuritiesTransactionPrice2Choice price) {
		this.price = Objects.requireNonNull(price);
		return this;
	}

	public SecuritiesTransactionPrice1 getNoPrice() {
		return noPrice;
	}

	public SecuritiesTransactionPrice4Choice setNoPrice(SecuritiesTransactionPrice1 noPrice) {
		this.noPrice = Objects.requireNonNull(noPrice);
		return this;
	}
}