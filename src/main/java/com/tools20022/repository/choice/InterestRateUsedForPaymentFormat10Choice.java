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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.RateType13Code;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAnd13DecimalAmount;
import com.tools20022.repository.entity.Interest;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.RateTypeAndAmountAndStatus32;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
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
 * {@linkplain com.tools20022.repository.choice.InterestRateUsedForPaymentFormat10Choice#mmRate
 * InterestRateUsedForPaymentFormat10Choice.mmRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InterestRateUsedForPaymentFormat10Choice#mmAmount
 * InterestRateUsedForPaymentFormat10Choice.mmAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InterestRateUsedForPaymentFormat10Choice#mmRateTypeAndAmountAndRateStatus
 * InterestRateUsedForPaymentFormat10Choice.mmRateTypeAndAmountAndRateStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InterestRateUsedForPaymentFormat10Choice#mmNotSpecifiedRate
 * InterestRateUsedForPaymentFormat10Choice.mmNotSpecifiedRate}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Interest Interest}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "InterestRateUsedForPaymentFormat10Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice between an amount or a rate or an unspecified rate."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "InterestRateUsedForPaymentFormat10Choice", propOrder = {"rate", "amount", "rateTypeAndAmountAndRateStatus", "notSpecifiedRate"})
public class InterestRateUsedForPaymentFormat10Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Rate", required = true)
	protected PercentageRate rate;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.choice.InterestRateUsedForPaymentFormat10Choice
	 * InterestRateUsedForPaymentFormat10Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rate"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Value is expressed as a rate."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :92A:</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InterestRateUsedForPaymentFormat10Choice, PercentageRate> mmRate = new MMMessageAttribute<InterestRateUsedForPaymentFormat10Choice, PercentageRate>() {
		{
			businessElementTrace_lazy = () -> Interest.mmRate;
			componentContext_lazy = () -> com.tools20022.repository.choice.InterestRateUsedForPaymentFormat10Choice.mmObject();
			isDerived = false;
			xmlTag = "Rate";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92A:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rate";
			definition = "Value is expressed as a rate.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public PercentageRate getValue(InterestRateUsedForPaymentFormat10Choice obj) {
			return obj.getRate();
		}

		@Override
		public void setValue(InterestRateUsedForPaymentFormat10Choice obj, PercentageRate value) {
			obj.setRate(value);
		}
	};
	@XmlElement(name = "Amt", required = true)
	protected RestrictedFINActiveCurrencyAnd13DecimalAmount amount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAnd13DecimalAmount
	 * RestrictedFINActiveCurrencyAnd13DecimalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Interest#mmAmount
	 * Interest.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.InterestRateUsedForPaymentFormat10Choice
	 * InterestRateUsedForPaymentFormat10Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Amt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of monetary units specified in a currency."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19B:</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InterestRateUsedForPaymentFormat10Choice, RestrictedFINActiveCurrencyAnd13DecimalAmount> mmAmount = new MMMessageAttribute<InterestRateUsedForPaymentFormat10Choice, RestrictedFINActiveCurrencyAnd13DecimalAmount>() {
		{
			businessElementTrace_lazy = () -> Interest.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.choice.InterestRateUsedForPaymentFormat10Choice.mmObject();
			isDerived = false;
			xmlTag = "Amt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19B:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Amount";
			definition = "Number of monetary units specified in a currency.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAnd13DecimalAmount.mmObject();
		}

		@Override
		public RestrictedFINActiveCurrencyAnd13DecimalAmount getValue(InterestRateUsedForPaymentFormat10Choice obj) {
			return obj.getAmount();
		}

		@Override
		public void setValue(InterestRateUsedForPaymentFormat10Choice obj, RestrictedFINActiveCurrencyAnd13DecimalAmount value) {
			obj.setAmount(value);
		}
	};
	@XmlElement(name = "RateTpAndAmtAndRateSts", required = true)
	protected RateTypeAndAmountAndStatus32 rateTypeAndAmountAndRateStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus32
	 * RateTypeAndAmountAndStatus32}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Interest Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.InterestRateUsedForPaymentFormat10Choice
	 * InterestRateUsedForPaymentFormat10Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RateTpAndAmtAndRateSts"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RateTypeAndAmountAndRateStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies different formats for interest rate used for payment."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :92J:</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InterestRateUsedForPaymentFormat10Choice, RateTypeAndAmountAndStatus32> mmRateTypeAndAmountAndRateStatus = new MMMessageAssociationEnd<InterestRateUsedForPaymentFormat10Choice, RateTypeAndAmountAndStatus32>() {
		{
			businessComponentTrace_lazy = () -> Interest.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.InterestRateUsedForPaymentFormat10Choice.mmObject();
			isDerived = false;
			xmlTag = "RateTpAndAmtAndRateSts";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92J:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RateTypeAndAmountAndRateStatus";
			definition = "Specifies different formats for interest rate used for payment.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> RateTypeAndAmountAndStatus32.mmObject();
		}

		@Override
		public RateTypeAndAmountAndStatus32 getValue(InterestRateUsedForPaymentFormat10Choice obj) {
			return obj.getRateTypeAndAmountAndRateStatus();
		}

		@Override
		public void setValue(InterestRateUsedForPaymentFormat10Choice obj, RateTypeAndAmountAndStatus32 value) {
			obj.setRateTypeAndAmountAndRateStatus(value);
		}
	};
	@XmlElement(name = "NotSpcfdRate", required = true)
	protected RateType13Code notSpecifiedRate;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.choice.InterestRateUsedForPaymentFormat10Choice
	 * InterestRateUsedForPaymentFormat10Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NotSpcfdRate"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotSpecifiedRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Value of the rate not specified."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :92K:</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InterestRateUsedForPaymentFormat10Choice, RateType13Code> mmNotSpecifiedRate = new MMMessageAttribute<InterestRateUsedForPaymentFormat10Choice, RateType13Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.InterestRateUsedForPaymentFormat10Choice.mmObject();
			isDerived = false;
			xmlTag = "NotSpcfdRate";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92K:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotSpecifiedRate";
			definition = "Value of the rate not specified.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RateType13Code.mmObject();
		}

		@Override
		public RateType13Code getValue(InterestRateUsedForPaymentFormat10Choice obj) {
			return obj.getNotSpecifiedRate();
		}

		@Override
		public void setValue(InterestRateUsedForPaymentFormat10Choice obj, RateType13Code value) {
			obj.setNotSpecifiedRate(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.InterestRateUsedForPaymentFormat10Choice.mmRate, com.tools20022.repository.choice.InterestRateUsedForPaymentFormat10Choice.mmAmount,
						com.tools20022.repository.choice.InterestRateUsedForPaymentFormat10Choice.mmRateTypeAndAmountAndRateStatus, com.tools20022.repository.choice.InterestRateUsedForPaymentFormat10Choice.mmNotSpecifiedRate);
				trace_lazy = () -> Interest.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InterestRateUsedForPaymentFormat10Choice";
				definition = "Choice between an amount or a rate or an unspecified rate.";
			}
		});
		return mmObject_lazy.get();
	}

	public PercentageRate getRate() {
		return rate;
	}

	public InterestRateUsedForPaymentFormat10Choice setRate(PercentageRate rate) {
		this.rate = Objects.requireNonNull(rate);
		return this;
	}

	public RestrictedFINActiveCurrencyAnd13DecimalAmount getAmount() {
		return amount;
	}

	public InterestRateUsedForPaymentFormat10Choice setAmount(RestrictedFINActiveCurrencyAnd13DecimalAmount amount) {
		this.amount = Objects.requireNonNull(amount);
		return this;
	}

	public RateTypeAndAmountAndStatus32 getRateTypeAndAmountAndRateStatus() {
		return rateTypeAndAmountAndRateStatus;
	}

	public InterestRateUsedForPaymentFormat10Choice setRateTypeAndAmountAndRateStatus(RateTypeAndAmountAndStatus32 rateTypeAndAmountAndRateStatus) {
		this.rateTypeAndAmountAndRateStatus = Objects.requireNonNull(rateTypeAndAmountAndRateStatus);
		return this;
	}

	public RateType13Code getNotSpecifiedRate() {
		return notSpecifiedRate;
	}

	public InterestRateUsedForPaymentFormat10Choice setNotSpecifiedRate(RateType13Code notSpecifiedRate) {
		this.notSpecifiedRate = Objects.requireNonNull(notSpecifiedRate);
		return this;
	}
}