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
import com.tools20022.repository.codeset.RateValueType6Code;
import com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAnd13DecimalAmount;
import com.tools20022.repository.entity.Dividend;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.RateTypeAndAmountAndStatus8;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice between an amount or an unspecified rate.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat4Choice#mmAmount
 * NetDividendRateFormat4Choice.mmAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat4Choice#mmRateTypeAndAmountAndRateStatus
 * NetDividendRateFormat4Choice.mmRateTypeAndAmountAndRateStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat4Choice#mmNotSpecifiedRate
 * NetDividendRateFormat4Choice.mmNotSpecifiedRate}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Dividend Dividend}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule#forNetDividendRateFormat4Choice
 * ConstraintCoexistenceAmountRule.forNetDividendRateFormat4Choice}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = May 5, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "NetDividendRateFormat4Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice between an amount or an unspecified rate."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "NetDividendRateFormat4Choice", propOrder = {"amount", "rateTypeAndAmountAndRateStatus", "notSpecifiedRate"})
public class NetDividendRateFormat4Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
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
	 * {@linkplain com.tools20022.repository.entity.Dividend#mmNetDividend
	 * Dividend.mmNetDividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat4Choice
	 * NetDividendRateFormat4Choice}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Dividend.mmNetDividend;
			componentContext_lazy = () -> com.tools20022.repository.choice.NetDividendRateFormat4Choice.mmObject();
			isDerived = false;
			xmlTag = "Amt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Amount";
			definition = "Number of monetary units specified in a currency.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAnd13DecimalAmount.mmObject();
		}
	};
	@XmlElement(name = "RateTpAndAmtAndRateSts", required = true)
	protected RateTypeAndAmountAndStatus8 rateTypeAndAmountAndRateStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus8
	 * RateTypeAndAmountAndStatus8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat4Choice
	 * NetDividendRateFormat4Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RateTpAndAmtAndRateSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :92J:</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RateTypeAndAmountAndRateStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies different formats for the net dividend rate."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRateTypeAndAmountAndRateStatus = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.NetDividendRateFormat4Choice.mmObject();
			isDerived = false;
			xmlTag = "RateTpAndAmtAndRateSts";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92J:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RateTypeAndAmountAndRateStatus";
			definition = "Specifies different formats for the net dividend rate.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> RateTypeAndAmountAndStatus8.mmObject();
		}
	};
	@XmlElement(name = "NotSpcfdRate", required = true)
	protected RateValueType6Code notSpecifiedRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.RateValueType6Code
	 * RateValueType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat4Choice
	 * NetDividendRateFormat4Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NotSpcfdRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :92K:</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotSpecifiedRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Value of the rate not specified."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNotSpecifiedRate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.NetDividendRateFormat4Choice.mmObject();
			isDerived = false;
			xmlTag = "NotSpcfdRate";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92K:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotSpecifiedRate";
			definition = "Value of the rate not specified.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RateValueType6Code.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.NetDividendRateFormat4Choice.mmAmount, com.tools20022.repository.choice.NetDividendRateFormat4Choice.mmRateTypeAndAmountAndRateStatus,
						com.tools20022.repository.choice.NetDividendRateFormat4Choice.mmNotSpecifiedRate);
				trace_lazy = () -> Dividend.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule.forNetDividendRateFormat4Choice);
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("May 5, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "NetDividendRateFormat4Choice";
				definition = "Choice between an amount or an unspecified rate.";
			}
		});
		return mmObject_lazy.get();
	}

	public RestrictedFINActiveCurrencyAnd13DecimalAmount getAmount() {
		return amount;
	}

	public NetDividendRateFormat4Choice setAmount(RestrictedFINActiveCurrencyAnd13DecimalAmount amount) {
		this.amount = Objects.requireNonNull(amount);
		return this;
	}

	public RateTypeAndAmountAndStatus8 getRateTypeAndAmountAndRateStatus() {
		return rateTypeAndAmountAndRateStatus;
	}

	public NetDividendRateFormat4Choice setRateTypeAndAmountAndRateStatus(RateTypeAndAmountAndStatus8 rateTypeAndAmountAndRateStatus) {
		this.rateTypeAndAmountAndRateStatus = Objects.requireNonNull(rateTypeAndAmountAndRateStatus);
		return this;
	}

	public RateValueType6Code getNotSpecifiedRate() {
		return notSpecifiedRate;
	}

	public NetDividendRateFormat4Choice setNotSpecifiedRate(RateValueType6Code notSpecifiedRate) {
		this.notSpecifiedRate = Objects.requireNonNull(notSpecifiedRate);
		return this;
	}
}