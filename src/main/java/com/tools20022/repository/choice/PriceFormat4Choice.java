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
import com.tools20022.repository.choice.PriceValueType5FormatChoice;
import com.tools20022.repository.datatype.DecimalNumber;
import com.tools20022.repository.entity.Index;
import com.tools20022.repository.entity.Price;
import com.tools20022.repository.entity.SecuritiesPricing;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.AmountPrice1;
import com.tools20022.repository.msg.PriceRate1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice of formats to express a price.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.PriceFormat4Choice#mmAmount
 * PriceFormat4Choice.mmAmount}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PriceFormat4Choice#mmRate
 * PriceFormat4Choice.mmRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PriceFormat4Choice#mmNotSpecified
 * PriceFormat4Choice.mmNotSpecified}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PriceFormat4Choice#mmIndexPoints
 * PriceFormat4Choice.mmIndexPoints}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesPricing
 * SecuritiesPricing}</li>
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
 * "PriceFormat4Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice of formats to express a price."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PriceFormat4Choice", propOrder = {"amount", "rate", "notSpecified", "indexPoints"})
public class PriceFormat4Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Amt", required = true)
	protected AmountPrice1 amount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.AmountPrice1
	 * AmountPrice1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Price#mmAmount
	 * Price.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PriceFormat4Choice
	 * PriceFormat4Choice}</li>
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
	 * definition} = "Price expressed as a currency and amount."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PriceFormat4Choice, AmountPrice1> mmAmount = new MMMessageAttribute<PriceFormat4Choice, AmountPrice1>() {
		{
			businessElementTrace_lazy = () -> Price.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.choice.PriceFormat4Choice.mmObject();
			isDerived = false;
			xmlTag = "Amt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Amount";
			definition = "Price expressed as a currency and amount.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> AmountPrice1.mmObject();
		}

		@Override
		public AmountPrice1 getValue(PriceFormat4Choice obj) {
			return obj.getAmount();
		}

		@Override
		public void setValue(PriceFormat4Choice obj, AmountPrice1 value) {
			obj.setAmount(value);
		}
	};
	@XmlElement(name = "Rate", required = true)
	protected PriceRate1 rate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.PriceRate1
	 * PriceRate1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmRate
	 * SecuritiesPricing.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PriceFormat4Choice
	 * PriceFormat4Choice}</li>
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
	 * definition} = "Price expressed as a rate, ie, percentage."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PriceFormat4Choice, PriceRate1> mmRate = new MMMessageAttribute<PriceFormat4Choice, PriceRate1>() {
		{
			businessElementTrace_lazy = () -> SecuritiesPricing.mmRate;
			componentContext_lazy = () -> com.tools20022.repository.choice.PriceFormat4Choice.mmObject();
			isDerived = false;
			xmlTag = "Rate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rate";
			definition = "Price expressed as a rate, ie, percentage.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> PriceRate1.mmObject();
		}

		@Override
		public PriceRate1 getValue(PriceFormat4Choice obj) {
			return obj.getRate();
		}

		@Override
		public void setValue(PriceFormat4Choice obj, PriceRate1 value) {
			obj.setRate(value);
		}
	};
	@XmlElement(name = "NotSpcfd", required = true)
	protected PriceValueType5FormatChoice notSpecified;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PriceValueType5FormatChoice
	 * PriceValueType5FormatChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PriceFormat4Choice
	 * PriceFormat4Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NotSpcfd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotSpecified"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The value of the price is not specified."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PriceFormat4Choice, PriceValueType5FormatChoice> mmNotSpecified = new MMMessageAttribute<PriceFormat4Choice, PriceValueType5FormatChoice>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.PriceFormat4Choice.mmObject();
			isDerived = false;
			xmlTag = "NotSpcfd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotSpecified";
			definition = "The value of the price is not specified.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> PriceValueType5FormatChoice.mmObject();
		}

		@Override
		public PriceValueType5FormatChoice getValue(PriceFormat4Choice obj) {
			return obj.getNotSpecified();
		}

		@Override
		public void setValue(PriceFormat4Choice obj, PriceValueType5FormatChoice value) {
			obj.setNotSpecified(value);
		}
	};
	@XmlElement(name = "IndxPts", required = true)
	protected DecimalNumber indexPoints;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Index#mmIndexPoints
	 * Index.mmIndexPoints}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PriceFormat4Choice
	 * PriceFormat4Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IndxPts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndexPoints"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Price expressed as index points."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PriceFormat4Choice, DecimalNumber> mmIndexPoints = new MMMessageAttribute<PriceFormat4Choice, DecimalNumber>() {
		{
			businessElementTrace_lazy = () -> Index.mmIndexPoints;
			componentContext_lazy = () -> com.tools20022.repository.choice.PriceFormat4Choice.mmObject();
			isDerived = false;
			xmlTag = "IndxPts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndexPoints";
			definition = "Price expressed as index points.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}

		@Override
		public DecimalNumber getValue(PriceFormat4Choice obj) {
			return obj.getIndexPoints();
		}

		@Override
		public void setValue(PriceFormat4Choice obj, DecimalNumber value) {
			obj.setIndexPoints(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.PriceFormat4Choice.mmAmount, com.tools20022.repository.choice.PriceFormat4Choice.mmRate,
						com.tools20022.repository.choice.PriceFormat4Choice.mmNotSpecified, com.tools20022.repository.choice.PriceFormat4Choice.mmIndexPoints);
				trace_lazy = () -> SecuritiesPricing.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PriceFormat4Choice";
				definition = "Choice of formats to express a price.";
			}
		});
		return mmObject_lazy.get();
	}

	public AmountPrice1 getAmount() {
		return amount;
	}

	public PriceFormat4Choice setAmount(AmountPrice1 amount) {
		this.amount = Objects.requireNonNull(amount);
		return this;
	}

	public PriceRate1 getRate() {
		return rate;
	}

	public PriceFormat4Choice setRate(PriceRate1 rate) {
		this.rate = Objects.requireNonNull(rate);
		return this;
	}

	public PriceValueType5FormatChoice getNotSpecified() {
		return notSpecified;
	}

	public PriceFormat4Choice setNotSpecified(PriceValueType5FormatChoice notSpecified) {
		this.notSpecified = Objects.requireNonNull(notSpecified);
		return this;
	}

	public DecimalNumber getIndexPoints() {
		return indexPoints;
	}

	public PriceFormat4Choice setIndexPoints(DecimalNumber indexPoints) {
		this.indexPoints = Objects.requireNonNull(indexPoints);
		return this;
	}
}