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
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.Max52Text;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ExchangeRateBasis2;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides information about the exchange rate basis for a foreign exchange
 * transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ExchangeRateBasis2Choice#mmCurrencyPair
 * ExchangeRateBasis2Choice.mmCurrencyPair}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ExchangeRateBasis2Choice#mmProprietary
 * ExchangeRateBasis2Choice.mmProprietary}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ExchangeRateBasis2Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides information about the exchange rate basis for a foreign exchange transaction."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ExchangeRateBasis2Choice", propOrder = {"currencyPair", "proprietary"})
public class ExchangeRateBasis2Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "CcyPair", required = true)
	protected ExchangeRateBasis2 currencyPair;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ExchangeRateBasis2
	 * ExchangeRateBasis2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ExchangeRateBasis2Choice
	 * ExchangeRateBasis2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CcyPair"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyPair"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Exchange rate basis expressed as a currency pair."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ExchangeRateBasis2Choice, ExchangeRateBasis2> mmCurrencyPair = new MMMessageAssociationEnd<ExchangeRateBasis2Choice, ExchangeRateBasis2>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.ExchangeRateBasis2Choice.mmObject();
			isDerived = false;
			xmlTag = "CcyPair";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyPair";
			definition = "Exchange rate basis expressed as a currency pair.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ExchangeRateBasis2.mmObject();
		}

		@Override
		public ExchangeRateBasis2 getValue(ExchangeRateBasis2Choice obj) {
			return obj.getCurrencyPair();
		}

		@Override
		public void setValue(ExchangeRateBasis2Choice obj, ExchangeRateBasis2 value) {
			obj.setCurrencyPair(value);
		}
	};
	@XmlElement(name = "Prtry", required = true)
	protected Max52Text proprietary;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max52Text
	 * Max52Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ExchangeRateBasis2Choice
	 * ExchangeRateBasis2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Prtry"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Proprietary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Exchange rate basis expressed in a proprietary notation."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ExchangeRateBasis2Choice, Max52Text> mmProprietary = new MMMessageAttribute<ExchangeRateBasis2Choice, Max52Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.ExchangeRateBasis2Choice.mmObject();
			isDerived = false;
			xmlTag = "Prtry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Proprietary";
			definition = "Exchange rate basis expressed in a proprietary notation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max52Text.mmObject();
		}

		@Override
		public Max52Text getValue(ExchangeRateBasis2Choice obj) {
			return obj.getProprietary();
		}

		@Override
		public void setValue(ExchangeRateBasis2Choice obj, Max52Text value) {
			obj.setProprietary(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.ExchangeRateBasis2Choice.mmCurrencyPair, com.tools20022.repository.choice.ExchangeRateBasis2Choice.mmProprietary);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "ExchangeRateBasis2Choice";
				definition = "Provides information about the exchange rate basis for a foreign exchange transaction.";
			}
		});
		return mmObject_lazy.get();
	}

	public ExchangeRateBasis2 getCurrencyPair() {
		return currencyPair;
	}

	public ExchangeRateBasis2Choice setCurrencyPair(ExchangeRateBasis2 currencyPair) {
		this.currencyPair = Objects.requireNonNull(currencyPair);
		return this;
	}

	public Max52Text getProprietary() {
		return proprietary;
	}

	public ExchangeRateBasis2Choice setProprietary(Max52Text proprietary) {
		this.proprietary = Objects.requireNonNull(proprietary);
		return this;
	}
}