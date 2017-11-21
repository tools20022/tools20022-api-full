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
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.entity.Dividend;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.GrossDividendRate2;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice of format to express a gross dividend.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.GrossDividendRate1Choice#mmNotSpecifiedRate
 * GrossDividendRate1Choice.mmNotSpecifiedRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.GrossDividendRate1Choice#mmAmount
 * GrossDividendRate1Choice.mmAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.GrossDividendRate1Choice#mmRateTypeAmount
 * GrossDividendRate1Choice.mmRateTypeAmount}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Dividend Dividend}</li>
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
 * "GrossDividendRate1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice of format to express a gross dividend."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "GrossDividendRate1Choice", propOrder = {"notSpecifiedRate", "amount", "rateTypeAmount"})
public class GrossDividendRate1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected RateValueType2FormatChoice notSpecifiedRate;
	/**
	 * The value of the rate is not specified, eg, the rate is unknown.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.RateValueType2FormatChoice
	 * RateValueType2FormatChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.GrossDividendRate1Choice
	 * GrossDividendRate1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NotSpcfdRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotSpecifiedRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The value of the rate is not specified, eg, the rate is unknown."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNotSpecifiedRate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> GrossDividendRate1Choice.mmObject();
			isDerived = false;
			xmlTag = "NotSpcfdRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotSpecifiedRate";
			definition = "The value of the rate is not specified, eg, the rate is unknown.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> com.tools20022.repository.choice.RateValueType2FormatChoice.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount amount;
	/**
	 * Value expressed as an amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Dividend#mmFinalDividend
	 * Dividend.mmFinalDividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.GrossDividendRate1Choice
	 * GrossDividendRate1Choice}</li>
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
	 * definition} = "Value expressed as an amount."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Dividend.mmFinalDividend;
			componentContext_lazy = () -> GrossDividendRate1Choice.mmObject();
			isDerived = false;
			xmlTag = "Amt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Amount";
			definition = "Value expressed as an amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected GrossDividendRate2 rateTypeAmount;
	/**
	 * Value is expressed as an amount related to an underlying securities, eg,
	 * underlying security for which an interest is paid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.GrossDividendRate2
	 * GrossDividendRate2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Dividend Dividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.GrossDividendRate1Choice
	 * GrossDividendRate1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RateTpAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RateTypeAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Value is expressed as an amount related to an underlying securities, eg, underlying security for which an interest is paid."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRateTypeAmount = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> Dividend.mmObject();
			componentContext_lazy = () -> GrossDividendRate1Choice.mmObject();
			isDerived = false;
			xmlTag = "RateTpAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RateTypeAmount";
			definition = "Value is expressed as an amount related to an underlying securities, eg, underlying security for which an interest is paid.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> GrossDividendRate2.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(GrossDividendRate1Choice.mmNotSpecifiedRate, GrossDividendRate1Choice.mmAmount, GrossDividendRate1Choice.mmRateTypeAmount);
				trace_lazy = () -> Dividend.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "GrossDividendRate1Choice";
				definition = "Choice of format to express a gross dividend.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "NotSpcfdRate", required = true)
	public RateValueType2FormatChoice getNotSpecifiedRate() {
		return notSpecifiedRate;
	}

	public void setNotSpecifiedRate(com.tools20022.repository.choice.RateValueType2FormatChoice notSpecifiedRate) {
		this.notSpecifiedRate = notSpecifiedRate;
	}

	@XmlElement(name = "Amt", required = true)
	public ActiveCurrencyAndAmount getAmount() {
		return amount;
	}

	public void setAmount(ActiveCurrencyAndAmount amount) {
		this.amount = amount;
	}

	@XmlElement(name = "RateTpAmt", required = true)
	public GrossDividendRate2 getRateTypeAmount() {
		return rateTypeAmount;
	}

	public void setRateTypeAmount(GrossDividendRate2 rateTypeAmount) {
		this.rateTypeAmount = rateTypeAmount;
	}
}