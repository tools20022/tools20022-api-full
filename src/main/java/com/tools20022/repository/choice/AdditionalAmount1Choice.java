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
import com.tools20022.repository.entity.SwitchOrder;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice between additional cash in or resulting cash out.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AdditionalAmount1Choice#mmAdditionalCashIn
 * AdditionalAmount1Choice.mmAdditionalCashIn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AdditionalAmount1Choice#mmResultingCashOut
 * AdditionalAmount1Choice.mmResultingCashOut}</li>
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
 * "AdditionalAmount1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice between additional cash in or resulting cash out."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AdditionalAmount1Choice", propOrder = {"additionalCashIn", "resultingCashOut"})
public class AdditionalAmount1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "AddtlCshIn", required = true)
	protected ActiveOrHistoricCurrencyAndAmount additionalCashIn;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SwitchOrder#mmAdditionalCashIn
	 * SwitchOrder.mmAdditionalCashIn}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AdditionalAmount1Choice
	 * AdditionalAmount1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlCshIn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalCashIn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional amount of money paid by the investor in addition to the switch redemption amount."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AdditionalAmount1Choice, ActiveOrHistoricCurrencyAndAmount> mmAdditionalCashIn = new MMMessageAttribute<AdditionalAmount1Choice, ActiveOrHistoricCurrencyAndAmount>() {
		{
			businessElementTrace_lazy = () -> SwitchOrder.mmAdditionalCashIn;
			componentContext_lazy = () -> com.tools20022.repository.choice.AdditionalAmount1Choice.mmObject();
			isDerived = false;
			xmlTag = "AddtlCshIn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalCashIn";
			definition = "Additional amount of money paid by the investor in addition to the switch redemption amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}

		@Override
		public ActiveOrHistoricCurrencyAndAmount getValue(AdditionalAmount1Choice obj) {
			return obj.getAdditionalCashIn();
		}

		@Override
		public void setValue(AdditionalAmount1Choice obj, ActiveOrHistoricCurrencyAndAmount value) {
			obj.setAdditionalCashIn(value);
		}
	};
	@XmlElement(name = "RsltgCshOut", required = true)
	protected ActiveOrHistoricCurrencyAndAmount resultingCashOut;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SwitchOrder#mmResultingCashOut
	 * SwitchOrder.mmResultingCashOut}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AdditionalAmount1Choice
	 * AdditionalAmount1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RsltgCshOut"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResultingCashOut"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money that results from a switch-out, that is not reinvested in another investment fund, and is repaid to the investor."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AdditionalAmount1Choice, ActiveOrHistoricCurrencyAndAmount> mmResultingCashOut = new MMMessageAttribute<AdditionalAmount1Choice, ActiveOrHistoricCurrencyAndAmount>() {
		{
			businessElementTrace_lazy = () -> SwitchOrder.mmResultingCashOut;
			componentContext_lazy = () -> com.tools20022.repository.choice.AdditionalAmount1Choice.mmObject();
			isDerived = false;
			xmlTag = "RsltgCshOut";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResultingCashOut";
			definition = "Amount of money that results from a switch-out, that is not reinvested in another investment fund, and is repaid to the investor.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}

		@Override
		public ActiveOrHistoricCurrencyAndAmount getValue(AdditionalAmount1Choice obj) {
			return obj.getResultingCashOut();
		}

		@Override
		public void setValue(AdditionalAmount1Choice obj, ActiveOrHistoricCurrencyAndAmount value) {
			obj.setResultingCashOut(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.AdditionalAmount1Choice.mmAdditionalCashIn, com.tools20022.repository.choice.AdditionalAmount1Choice.mmResultingCashOut);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AdditionalAmount1Choice";
				definition = "Choice between additional cash in or resulting cash out.";
			}
		});
		return mmObject_lazy.get();
	}

	public ActiveOrHistoricCurrencyAndAmount getAdditionalCashIn() {
		return additionalCashIn;
	}

	public AdditionalAmount1Choice setAdditionalCashIn(ActiveOrHistoricCurrencyAndAmount additionalCashIn) {
		this.additionalCashIn = Objects.requireNonNull(additionalCashIn);
		return this;
	}

	public ActiveOrHistoricCurrencyAndAmount getResultingCashOut() {
		return resultingCashOut;
	}

	public AdditionalAmount1Choice setResultingCashOut(ActiveOrHistoricCurrencyAndAmount resultingCashOut) {
		this.resultingCashOut = Objects.requireNonNull(resultingCashOut);
		return this;
	}
}