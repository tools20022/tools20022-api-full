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
import com.tools20022.repository.codeset.RateType13Code;
import com.tools20022.repository.datatype.ActiveCurrencyAnd13DecimalAmount;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.Interest;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.RateTypeAndAmountAndStatus24;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice between an amount or a rate or an unspecified rate.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InterestRateUsedForPaymentFormat8Choice#mmRate
 * InterestRateUsedForPaymentFormat8Choice.mmRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InterestRateUsedForPaymentFormat8Choice#mmAmount
 * InterestRateUsedForPaymentFormat8Choice.mmAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InterestRateUsedForPaymentFormat8Choice#mmRateTypeAndAmountAndRateStatus
 * InterestRateUsedForPaymentFormat8Choice.mmRateTypeAndAmountAndRateStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InterestRateUsedForPaymentFormat8Choice#mmNotSpecifiedRate
 * InterestRateUsedForPaymentFormat8Choice.mmNotSpecifiedRate}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Interest Interest}</li>
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
 * "InterestRateUsedForPaymentFormat8Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice between an amount or a rate or an unspecified rate."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.choice.InterestRateUsedForPaymentFormat5Choice
 * InterestRateUsedForPaymentFormat5Choice}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "InterestRateUsedForPaymentFormat8Choice", propOrder = {"rate", "amount", "rateTypeAndAmountAndRateStatus", "notSpecifiedRate"})
public class InterestRateUsedForPaymentFormat8Choice {

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
	 * {@linkplain com.tools20022.repository.entity.Interest#mmRate
	 * Interest.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.InterestRateUsedForPaymentFormat8Choice
	 * InterestRateUsedForPaymentFormat8Choice}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.InterestRateUsedForPaymentFormat5Choice#mmRate
	 * InterestRateUsedForPaymentFormat5Choice.mmRate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Interest.mmRate;
			componentContext_lazy = () -> InterestRateUsedForPaymentFormat8Choice.mmObject();
			isDerived = false;
			xmlTag = "Rate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rate";
			definition = "Value is expressed as a rate.";
			previousVersion_lazy = () -> InterestRateUsedForPaymentFormat5Choice.mmRate;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	protected ActiveCurrencyAnd13DecimalAmount amount;
	/**
	 * Number of monetary units specified in a currency.
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
	 * {@linkplain com.tools20022.repository.entity.Interest#mmAmount
	 * Interest.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.InterestRateUsedForPaymentFormat8Choice
	 * InterestRateUsedForPaymentFormat8Choice}</li>
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
	 * definition} = "Number of monetary units specified in a currency."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.InterestRateUsedForPaymentFormat5Choice#mmAmount
	 * InterestRateUsedForPaymentFormat5Choice.mmAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Interest.mmAmount;
			componentContext_lazy = () -> InterestRateUsedForPaymentFormat8Choice.mmObject();
			isDerived = false;
			xmlTag = "Amt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Amount";
			definition = "Number of monetary units specified in a currency.";
			previousVersion_lazy = () -> InterestRateUsedForPaymentFormat5Choice.mmAmount;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAnd13DecimalAmount.mmObject();
		}
	};
	protected RateTypeAndAmountAndStatus24 rateTypeAndAmountAndRateStatus;
	/**
	 * Specifies different formats for interest rate used for payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus24
	 * RateTypeAndAmountAndStatus24}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Interest Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.InterestRateUsedForPaymentFormat8Choice
	 * InterestRateUsedForPaymentFormat8Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RateTpAndAmtAndRateSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RateTypeAndAmountAndRateStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies different formats for interest rate used for payment."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.InterestRateUsedForPaymentFormat5Choice#mmRateTypeAndAmountAndRateStatus
	 * InterestRateUsedForPaymentFormat5Choice.mmRateTypeAndAmountAndRateStatus}
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRateTypeAndAmountAndRateStatus = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Interest.mmObject();
			componentContext_lazy = () -> InterestRateUsedForPaymentFormat8Choice.mmObject();
			isDerived = false;
			xmlTag = "RateTpAndAmtAndRateSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RateTypeAndAmountAndRateStatus";
			definition = "Specifies different formats for interest rate used for payment.";
			previousVersion_lazy = () -> InterestRateUsedForPaymentFormat5Choice.mmRateTypeAndAmountAndRateStatus;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> RateTypeAndAmountAndStatus24.mmObject();
		}
	};
	protected RateType13Code notSpecifiedRate;
	/**
	 * Value of the rate not specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.RateType13Code
	 * RateType13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.InterestRateUsedForPaymentFormat8Choice
	 * InterestRateUsedForPaymentFormat8Choice}</li>
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
	 * definition} = "Value of the rate not specified."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.InterestRateUsedForPaymentFormat5Choice#mmNotSpecifiedRate
	 * InterestRateUsedForPaymentFormat5Choice.mmNotSpecifiedRate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNotSpecifiedRate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> InterestRateUsedForPaymentFormat8Choice.mmObject();
			isDerived = false;
			xmlTag = "NotSpcfdRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotSpecifiedRate";
			definition = "Value of the rate not specified.";
			previousVersion_lazy = () -> InterestRateUsedForPaymentFormat5Choice.mmNotSpecifiedRate;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RateType13Code.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(InterestRateUsedForPaymentFormat8Choice.mmRate, InterestRateUsedForPaymentFormat8Choice.mmAmount, InterestRateUsedForPaymentFormat8Choice.mmRateTypeAndAmountAndRateStatus,
						InterestRateUsedForPaymentFormat8Choice.mmNotSpecifiedRate);
				trace_lazy = () -> Interest.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InterestRateUsedForPaymentFormat8Choice";
				definition = "Choice between an amount or a rate or an unspecified rate.";
				previousVersion_lazy = () -> InterestRateUsedForPaymentFormat5Choice.mmObject();
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

	@XmlElement(name = "Amt", required = true)
	public ActiveCurrencyAnd13DecimalAmount getAmount() {
		return amount;
	}

	public void setAmount(ActiveCurrencyAnd13DecimalAmount amount) {
		this.amount = amount;
	}

	@XmlElement(name = "RateTpAndAmtAndRateSts", required = true)
	public RateTypeAndAmountAndStatus24 getRateTypeAndAmountAndRateStatus() {
		return rateTypeAndAmountAndRateStatus;
	}

	public void setRateTypeAndAmountAndRateStatus(RateTypeAndAmountAndStatus24 rateTypeAndAmountAndRateStatus) {
		this.rateTypeAndAmountAndRateStatus = rateTypeAndAmountAndRateStatus;
	}

	@XmlElement(name = "NotSpcfdRate", required = true)
	public RateType13Code getNotSpecifiedRate() {
		return notSpecifiedRate;
	}

	public void setNotSpecifiedRate(RateType13Code notSpecifiedRate) {
		this.notSpecifiedRate = notSpecifiedRate;
	}
}