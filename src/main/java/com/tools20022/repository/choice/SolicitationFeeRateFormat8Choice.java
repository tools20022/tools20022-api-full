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
import com.tools20022.repository.datatype.ActiveCurrencyAnd13DecimalAmount;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.AmountAndQuantity;
import com.tools20022.repository.entity.RateAndAmount;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.AmountAndQuantityRatio4;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice between a rate or an unspecified rate.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SolicitationFeeRateFormat8Choice#mmRate
 * SolicitationFeeRateFormat8Choice.mmRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SolicitationFeeRateFormat8Choice#mmAmountToQuantity
 * SolicitationFeeRateFormat8Choice.mmAmountToQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SolicitationFeeRateFormat8Choice#mmAmount
 * SolicitationFeeRateFormat8Choice.mmAmount}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.RateAndAmount
 * RateAndAmount}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SolicitationFeeRateFormat8Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice between a rate or an unspecified rate."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "SolicitationFeeRateFormat8Choice", propOrder = {"rate", "amountToQuantity", "amount"})
public class SolicitationFeeRateFormat8Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected PercentageRate rate;
	/**
	 * Value is expressed as a rate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.RateAndAmount#mmRate
	 * RateAndAmount.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SolicitationFeeRateFormat8Choice
	 * SolicitationFeeRateFormat8Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Value is expressed as a rate."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> RateAndAmount.mmRate;
			componentContext_lazy = () -> SolicitationFeeRateFormat8Choice.mmObject();
			isDerived = false;
			xmlTag = "Rate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rate";
			definition = "Value is expressed as a rate.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	protected AmountAndQuantityRatio4 amountToQuantity;
	/**
	 * Ratio expressed as an amount to quantity ratio.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndQuantityRatio4
	 * AmountAndQuantityRatio4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.AmountAndQuantity
	 * AmountAndQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SolicitationFeeRateFormat8Choice
	 * SolicitationFeeRateFormat8Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AmtToQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmountToQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Ratio expressed as an amount to quantity ratio."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAmountToQuantity = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> AmountAndQuantity.mmObject();
			componentContext_lazy = () -> SolicitationFeeRateFormat8Choice.mmObject();
			isDerived = false;
			xmlTag = "AmtToQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmountToQuantity";
			definition = "Ratio expressed as an amount to quantity ratio.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AmountAndQuantityRatio4.mmObject();
		}
	};
	protected ActiveCurrencyAnd13DecimalAmount amount;
	/**
	 * Cash amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAnd13DecimalAmount
	 * ActiveCurrencyAnd13DecimalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.RateAndAmount#mmAmount
	 * RateAndAmount.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SolicitationFeeRateFormat8Choice
	 * SolicitationFeeRateFormat8Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Amt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cash amount."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> RateAndAmount.mmAmount;
			componentContext_lazy = () -> SolicitationFeeRateFormat8Choice.mmObject();
			isDerived = false;
			xmlTag = "Amt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Amount";
			definition = "Cash amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAnd13DecimalAmount.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(SolicitationFeeRateFormat8Choice.mmRate, SolicitationFeeRateFormat8Choice.mmAmountToQuantity, SolicitationFeeRateFormat8Choice.mmAmount);
				trace_lazy = () -> RateAndAmount.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SolicitationFeeRateFormat8Choice";
				definition = "Choice between a rate or an unspecified rate.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Rate", required = true)
	public PercentageRate getRate() {
		return rate;
	}

	public void setRate(PercentageRate rate) {
		this.rate = rate;
	}

	@XmlElement(name = "AmtToQty", required = true)
	public AmountAndQuantityRatio4 getAmountToQuantity() {
		return amountToQuantity;
	}

	public void setAmountToQuantity(AmountAndQuantityRatio4 amountToQuantity) {
		this.amountToQuantity = amountToQuantity;
	}

	@XmlElement(name = "Amt", required = true)
	public ActiveCurrencyAnd13DecimalAmount getAmount() {
		return amount;
	}

	public void setAmount(ActiveCurrencyAnd13DecimalAmount amount) {
		this.amount = amount;
	}
}