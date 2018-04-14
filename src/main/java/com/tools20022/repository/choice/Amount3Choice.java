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
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount;
import com.tools20022.repository.datatype.ImpliedCurrencyAndAmount;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice between an amount with or without the currency.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Amount3Choice#mmAmountWithCurrency
 * Amount3Choice.mmAmountWithCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Amount3Choice#mmAmountWithoutCurrency
 * Amount3Choice.mmAmountWithoutCurrency}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Amount3Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice between an amount with or without the currency."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Amount3Choice", propOrder = {"amountWithCurrency", "amountWithoutCurrency"})
public class Amount3Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "AmtWthCcy", required = true)
	protected ActiveOrHistoricCurrencyAndAmount amountWithCurrency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount
	 * ActiveOrHistoricCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Amount3Choice Amount3Choice}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AmtWthCcy"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmountWithCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number of monetary units specified in a currency where the unit of currency is explicit."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Amount3Choice, ActiveOrHistoricCurrencyAndAmount> mmAmountWithCurrency = new MMMessageAttribute<Amount3Choice, ActiveOrHistoricCurrencyAndAmount>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.Amount3Choice.mmObject();
			isDerived = false;
			xmlTag = "AmtWthCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmountWithCurrency";
			definition = "Number of monetary units specified in a currency where the unit of currency is explicit.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}

		@Override
		public ActiveOrHistoricCurrencyAndAmount getValue(Amount3Choice obj) {
			return obj.getAmountWithCurrency();
		}

		@Override
		public void setValue(Amount3Choice obj, ActiveOrHistoricCurrencyAndAmount value) {
			obj.setAmountWithCurrency(value);
		}
	};
	@XmlElement(name = "AmtWthtCcy", required = true)
	protected ImpliedCurrencyAndAmount amountWithoutCurrency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ImpliedCurrencyAndAmount
	 * ImpliedCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Amount3Choice Amount3Choice}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AmtWthtCcy"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmountWithoutCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number of monetary units specified in a currency where the unit of currency is implied by the context."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Amount3Choice, ImpliedCurrencyAndAmount> mmAmountWithoutCurrency = new MMMessageAttribute<Amount3Choice, ImpliedCurrencyAndAmount>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.Amount3Choice.mmObject();
			isDerived = false;
			xmlTag = "AmtWthtCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmountWithoutCurrency";
			definition = "Number of monetary units specified in a currency where the unit of currency is implied by the context.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}

		@Override
		public ImpliedCurrencyAndAmount getValue(Amount3Choice obj) {
			return obj.getAmountWithoutCurrency();
		}

		@Override
		public void setValue(Amount3Choice obj, ImpliedCurrencyAndAmount value) {
			obj.setAmountWithoutCurrency(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.Amount3Choice.mmAmountWithCurrency, com.tools20022.repository.choice.Amount3Choice.mmAmountWithoutCurrency);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Amount3Choice";
				definition = "Choice between an amount with or without the currency.";
			}
		});
		return mmObject_lazy.get();
	}

	public ActiveOrHistoricCurrencyAndAmount getAmountWithCurrency() {
		return amountWithCurrency;
	}

	public Amount3Choice setAmountWithCurrency(ActiveOrHistoricCurrencyAndAmount amountWithCurrency) {
		this.amountWithCurrency = Objects.requireNonNull(amountWithCurrency);
		return this;
	}

	public ImpliedCurrencyAndAmount getAmountWithoutCurrency() {
		return amountWithoutCurrency;
	}

	public Amount3Choice setAmountWithoutCurrency(ImpliedCurrencyAndAmount amountWithoutCurrency) {
		this.amountWithoutCurrency = Objects.requireNonNull(amountWithoutCurrency);
		return this;
	}
}