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

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.metamodel.MMXor;
import com.tools20022.repository.codeset.TaxType9Code;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.Tax;
import com.tools20022.repository.GeneratedRepository;
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
 * Amount of money due to the government or tax authority, according to various
 * pre-defined parameters such as thresholds or income.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponent#getXors xors} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Tax13#AmountOrRateRule
 * Tax13.AmountOrRateRule}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Tax13#TypeOrOtherTaxTypeRule
 * Tax13.TypeOrOtherTaxTypeRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Tax13#mmType Tax13.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Tax13#mmOtherTaxType
 * Tax13.mmOtherTaxType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Tax13#mmAmount Tax13.mmAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Tax13#mmRate Tax13.mmRate}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Tax13"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Amount of money due to the government or tax authority, according to various pre-defined parameters such as thresholds or income."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Tax23 Tax23}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Tax13", propOrder = {"type", "otherTaxType", "amount", "rate"})
public class Tax13 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Tp", required = true)
	protected TaxType9Code type;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.TaxType9Code
	 * TaxType9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmType Tax.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Tax13
	 * Tax13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of tax applied."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Tax13, TaxType9Code> mmType = new MMMessageAttribute<Tax13, TaxType9Code>() {
		{
			businessElementTrace_lazy = () -> Tax.mmType;
			componentContext_lazy = () -> com.tools20022.repository.msg.Tax13.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Type of tax applied.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TaxType9Code.mmObject();
		}

		@Override
		public TaxType9Code getValue(Tax13 obj) {
			return obj.getType();
		}

		@Override
		public void setValue(Tax13 obj, TaxType9Code value) {
			obj.setType(value);
		}
	};
	@XmlElement(name = "OthrTaxTp", required = true)
	protected Max35Text otherTaxType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmType Tax.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Tax13
	 * Tax13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrTaxTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherTaxType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies types of tax not present in a code list."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Tax13, Max35Text> mmOtherTaxType = new MMMessageAttribute<Tax13, Max35Text>() {
		{
			businessElementTrace_lazy = () -> Tax.mmType;
			componentContext_lazy = () -> com.tools20022.repository.msg.Tax13.mmObject();
			isDerived = false;
			xmlTag = "OthrTaxTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherTaxType";
			definition = "Specifies types of tax not present in a code list.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(Tax13 obj) {
			return obj.getOtherTaxType();
		}

		@Override
		public void setValue(Tax13 obj, Max35Text value) {
			obj.setOtherTaxType(value);
		}
	};
	@XmlElement(name = "Amt", required = true)
	protected CurrencyAndAmount amount;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Tax13
	 * Tax13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Amt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money resulting from the calculation of the tax."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Tax13, CurrencyAndAmount> mmAmount = new MMMessageAttribute<Tax13, CurrencyAndAmount>() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.Tax13.mmObject();
			isDerived = false;
			xmlTag = "Amt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Amount";
			definition = "Amount of money resulting from the calculation of the tax.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(Tax13 obj) {
			return obj.getAmount();
		}

		@Override
		public void setValue(Tax13 obj, CurrencyAndAmount value) {
			obj.setAmount(value);
		}
	};
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
	 * {@linkplain com.tools20022.repository.entity.Tax#mmRate Tax.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Tax13
	 * Tax13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rate"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Rate used to calculate the tax."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Tax13, PercentageRate> mmRate = new MMMessageAttribute<Tax13, PercentageRate>() {
		{
			businessElementTrace_lazy = () -> Tax.mmRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.Tax13.mmObject();
			isDerived = false;
			xmlTag = "Rate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rate";
			definition = "Rate used to calculate the tax.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public PercentageRate getValue(Tax13 obj) {
			return obj.getRate();
		}

		@Override
		public void setValue(Tax13 obj, PercentageRate value) {
			obj.setRate(value);
		}
	};
	/**
	 * If Rate is present, then Amount is not allowed. If Rate is not present,
	 * then Amount is mandatory.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} = {@linkplain com.tools20022.repository.msg.Tax13
	 * Tax13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax13#mmAmount
	 * Tax13.mmAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax13#mmRate Tax13.mmRate}</li>
	 * </ul>
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmountOrRateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Rate is present, then Amount is not allowed. If Rate is not present, then Amount is mandatory."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMXor AmountOrRateRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmountOrRateRule";
			definition = "If Rate is present, then Amount is not allowed. If Rate is not present, then Amount is mandatory.";
			messageComponent_lazy = () -> com.tools20022.repository.msg.Tax13.mmObject();
			impactedElements_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Tax13.mmAmount, com.tools20022.repository.msg.Tax13.mmRate);
		}
	};
	/**
	 * If Type is present, then OtherTaxType is not allowed. If Type is not
	 * present, then OtherTaxType is mandatory.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} = {@linkplain com.tools20022.repository.msg.Tax13
	 * Tax13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax13#mmType Tax13.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax13#mmOtherTaxType
	 * Tax13.mmOtherTaxType}</li>
	 * </ul>
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TypeOrOtherTaxTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Type is present, then OtherTaxType is not allowed. If Type is not present, then OtherTaxType is mandatory."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMXor TypeOrOtherTaxTypeRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TypeOrOtherTaxTypeRule";
			definition = "If Type is present, then OtherTaxType is not allowed. If Type is not present, then OtherTaxType is mandatory.";
			messageComponent_lazy = () -> com.tools20022.repository.msg.Tax13.mmObject();
			impactedElements_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Tax13.mmType, com.tools20022.repository.msg.Tax13.mmOtherTaxType);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Tax13.mmType, com.tools20022.repository.msg.Tax13.mmOtherTaxType, com.tools20022.repository.msg.Tax13.mmAmount,
						com.tools20022.repository.msg.Tax13.mmRate);
				trace_lazy = () -> Tax.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "Tax13";
				definition = "Amount of money due to the government or tax authority, according to various pre-defined parameters such as thresholds or income.";
				nextVersions_lazy = () -> Arrays.asList(Tax23.mmObject());
				xors_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Tax13.AmountOrRateRule, com.tools20022.repository.msg.Tax13.TypeOrOtherTaxTypeRule);
			}
		});
		return mmObject_lazy.get();
	}

	public TaxType9Code getType() {
		return type;
	}

	public Tax13 setType(TaxType9Code type) {
		this.type = Objects.requireNonNull(type);
		return this;
	}

	public Max35Text getOtherTaxType() {
		return otherTaxType;
	}

	public Tax13 setOtherTaxType(Max35Text otherTaxType) {
		this.otherTaxType = Objects.requireNonNull(otherTaxType);
		return this;
	}

	public CurrencyAndAmount getAmount() {
		return amount;
	}

	public Tax13 setAmount(CurrencyAndAmount amount) {
		this.amount = Objects.requireNonNull(amount);
		return this;
	}

	public PercentageRate getRate() {
		return rate;
	}

	public Tax13 setRate(PercentageRate rate) {
		this.rate = Objects.requireNonNull(rate);
		return this;
	}
}