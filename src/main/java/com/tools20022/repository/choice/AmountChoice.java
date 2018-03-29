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
import com.tools20022.repository.datatype.CurrencyAndAmount;
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
 * Amount may be defined with or without the currency.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AmountChoice#mmAmountWithCurrency
 * AmountChoice.mmAmountWithCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AmountChoice#mmAmountWithoutCurrency
 * AmountChoice.mmAmountWithoutCurrency}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AmountChoice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Amount may be defined with or without the currency."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AmountChoice", propOrder = {"amountWithCurrency", "amountWithoutCurrency"})
public class AmountChoice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "AmtWthCcy", required = true)
	protected CurrencyAndAmount amountWithCurrency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AmountChoice AmountChoice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AmtWthCcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmountWithCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number of monetary units specified in a currency where the unit of currency is explicit."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AmountChoice, CurrencyAndAmount> mmAmountWithCurrency = new MMMessageAttribute<AmountChoice, CurrencyAndAmount>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.AmountChoice.mmObject();
			isDerived = false;
			xmlTag = "AmtWthCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmountWithCurrency";
			definition = "Number of monetary units specified in a currency where the unit of currency is explicit.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(AmountChoice obj) {
			return obj.getAmountWithCurrency();
		}

		@Override
		public void setValue(AmountChoice obj, CurrencyAndAmount value) {
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
	 * {@linkplain com.tools20022.repository.choice.AmountChoice AmountChoice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AmtWthtCcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmountWithoutCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number of monetary units specified in a currency where the unit of currency is implied by the context."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AmountChoice, ImpliedCurrencyAndAmount> mmAmountWithoutCurrency = new MMMessageAttribute<AmountChoice, ImpliedCurrencyAndAmount>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.AmountChoice.mmObject();
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
		public ImpliedCurrencyAndAmount getValue(AmountChoice obj) {
			return obj.getAmountWithoutCurrency();
		}

		@Override
		public void setValue(AmountChoice obj, ImpliedCurrencyAndAmount value) {
			obj.setAmountWithoutCurrency(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.AmountChoice.mmAmountWithCurrency, com.tools20022.repository.choice.AmountChoice.mmAmountWithoutCurrency);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "AmountChoice";
				definition = "Amount may be defined with or without the currency.";
			}
		});
		return mmObject_lazy.get();
	}

	public CurrencyAndAmount getAmountWithCurrency() {
		return amountWithCurrency;
	}

	public AmountChoice setAmountWithCurrency(CurrencyAndAmount amountWithCurrency) {
		this.amountWithCurrency = Objects.requireNonNull(amountWithCurrency);
		return this;
	}

	public ImpliedCurrencyAndAmount getAmountWithoutCurrency() {
		return amountWithoutCurrency;
	}

	public AmountChoice setAmountWithoutCurrency(ImpliedCurrencyAndAmount amountWithoutCurrency) {
		this.amountWithoutCurrency = Objects.requireNonNull(amountWithoutCurrency);
		return this;
	}
}