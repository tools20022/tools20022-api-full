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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.AmountPrice1Choice;
import com.tools20022.repository.codeset.PriceMethod1Code;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.entity.DateTimePeriod;
import com.tools20022.repository.entity.SecuritiesPricing;
import com.tools20022.repository.entity.SecuritiesTax;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Amount of money for which goods or services are offered, sold, or bought.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice5#mmType
 * UnitPrice5.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice5#mmValue
 * UnitPrice5.mmValue}</li>
 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice5#mmPriceMethod
 * UnitPrice5.mmPriceMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnitPrice5#mmNumberOfDaysAccrued
 * UnitPrice5.mmNumberOfDaysAccrued}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnitPrice5#mmTaxableIncomePerShare
 * UnitPrice5.mmTaxableIncomePerShare}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnitPrice5#mmTaxableIncomePerShareCalculated
 * UnitPrice5.mmTaxableIncomePerShareCalculated}</li>
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
 * "UnitPrice5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Amount of money for which goods or services are offered, sold, or bought."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "UnitPrice5", propOrder = {"type", "value", "priceMethod", "numberOfDaysAccrued", "taxableIncomePerShare", "taxableIncomePerShareCalculated"})
public class UnitPrice5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Tp", required = true)
	protected PriceType1 type;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.PriceType1
	 * PriceType1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmPriceType
	 * SecuritiesPricing.mmPriceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.UnitPrice5
	 * UnitPrice5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type and information about a price."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesPricing.mmPriceType;
			componentContext_lazy = () -> com.tools20022.repository.msg.UnitPrice5.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Type and information about a price.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> com.tools20022.repository.msg.PriceType1.mmObject();
		}
	};
	@XmlElement(name = "Val", required = true)
	protected PriceValue1 value;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.PriceValue1
	 * PriceValue1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmPrice
	 * SecuritiesPricing.mmPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.UnitPrice5
	 * UnitPrice5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Val"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Value"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Value of the price, eg, as a currency and value."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmValue = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesPricing.mmPrice;
			componentContext_lazy = () -> com.tools20022.repository.msg.UnitPrice5.mmObject();
			isDerived = false;
			xmlTag = "Val";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Value";
			definition = "Value of the price, eg, as a currency and value.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> com.tools20022.repository.msg.PriceValue1.mmObject();
		}
	};
	@XmlElement(name = "PricMtd")
	protected PriceMethod1Code priceMethod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PriceMethod1Code
	 * PriceMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmPriceMethod
	 * SecuritiesPricing.mmPriceMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.UnitPrice5
	 * UnitPrice5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PricMtd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of pricing calculation method."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPriceMethod = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesPricing.mmPriceMethod;
			componentContext_lazy = () -> com.tools20022.repository.msg.UnitPrice5.mmObject();
			isDerived = false;
			xmlTag = "PricMtd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceMethod";
			definition = "Type of pricing calculation method.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PriceMethod1Code.mmObject();
		}
	};
	@XmlElement(name = "NbOfDaysAcrd")
	protected Number numberOfDaysAccrued;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmNumberOfDays
	 * DateTimePeriod.mmNumberOfDays}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.UnitPrice5
	 * UnitPrice5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NbOfDaysAcrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :99A::DAAC</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NumberOfDaysAccrued"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the number of days used for calculating the accrued interest amount."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNumberOfDaysAccrued = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> DateTimePeriod.mmNumberOfDays;
			componentContext_lazy = () -> com.tools20022.repository.msg.UnitPrice5.mmObject();
			isDerived = false;
			xmlTag = "NbOfDaysAcrd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":99A::DAAC"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NumberOfDaysAccrued";
			definition = "Specifies the number of days used for calculating the accrued interest amount.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	@XmlElement(name = "TaxblIncmPerShr")
	protected AmountPrice1Choice taxableIncomePerShare;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.AmountPrice1Choice
	 * AmountPrice1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTax#mmTaxableIncomePerShare
	 * SecuritiesTax.mmTaxableIncomePerShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.UnitPrice5
	 * UnitPrice5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxblIncmPerShr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxableIncomePerShare"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount included in the NAV that corresponds to gains directly or indirectly derived from interest payment in the scope of the European Directive on taxation of savings income in the form of interest payments."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTaxableIncomePerShare = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesTax.mmTaxableIncomePerShare;
			componentContext_lazy = () -> com.tools20022.repository.msg.UnitPrice5.mmObject();
			isDerived = false;
			xmlTag = "TaxblIncmPerShr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxableIncomePerShare";
			definition = "Amount included in the NAV that corresponds to gains directly or indirectly derived from interest payment in the scope of the European Directive on taxation of savings income in the form of interest payments.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AmountPrice1Choice.mmObject();
		}
	};
	@XmlElement(name = "TaxblIncmPerShrClctd")
	protected TaxableIncomePerShareCalculated1 taxableIncomePerShareCalculated;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.TaxableIncomePerShareCalculated1
	 * TaxableIncomePerShareCalculated1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTax#mmTaxableIncomePerShareCalculated
	 * SecuritiesTax.mmTaxableIncomePerShareCalculated}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.UnitPrice5
	 * UnitPrice5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxblIncmPerShrClctd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxableIncomePerShareCalculated"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the fund calculates a taxable interest per share (TIS)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTaxableIncomePerShareCalculated = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesTax.mmTaxableIncomePerShareCalculated;
			componentContext_lazy = () -> com.tools20022.repository.msg.UnitPrice5.mmObject();
			isDerived = false;
			xmlTag = "TaxblIncmPerShrClctd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxableIncomePerShareCalculated";
			definition = "Specifies whether the fund calculates a taxable interest per share (TIS).";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.TaxableIncomePerShareCalculated1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.UnitPrice5.mmType, com.tools20022.repository.msg.UnitPrice5.mmValue, com.tools20022.repository.msg.UnitPrice5.mmPriceMethod,
						com.tools20022.repository.msg.UnitPrice5.mmNumberOfDaysAccrued, com.tools20022.repository.msg.UnitPrice5.mmTaxableIncomePerShare, com.tools20022.repository.msg.UnitPrice5.mmTaxableIncomePerShareCalculated);
				trace_lazy = () -> SecuritiesPricing.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "UnitPrice5";
				definition = "Amount of money for which goods or services are offered, sold, or bought.";
			}
		});
		return mmObject_lazy.get();
	}

	public PriceType1 getType() {
		return type;
	}

	public UnitPrice5 setType(com.tools20022.repository.msg.PriceType1 type) {
		this.type = Objects.requireNonNull(type);
		return this;
	}

	public PriceValue1 getValue() {
		return value;
	}

	public UnitPrice5 setValue(com.tools20022.repository.msg.PriceValue1 value) {
		this.value = Objects.requireNonNull(value);
		return this;
	}

	public Optional<PriceMethod1Code> getPriceMethod() {
		return priceMethod == null ? Optional.empty() : Optional.of(priceMethod);
	}

	public UnitPrice5 setPriceMethod(PriceMethod1Code priceMethod) {
		this.priceMethod = priceMethod;
		return this;
	}

	public Optional<Number> getNumberOfDaysAccrued() {
		return numberOfDaysAccrued == null ? Optional.empty() : Optional.of(numberOfDaysAccrued);
	}

	public UnitPrice5 setNumberOfDaysAccrued(Number numberOfDaysAccrued) {
		this.numberOfDaysAccrued = numberOfDaysAccrued;
		return this;
	}

	public Optional<AmountPrice1Choice> getTaxableIncomePerShare() {
		return taxableIncomePerShare == null ? Optional.empty() : Optional.of(taxableIncomePerShare);
	}

	public UnitPrice5 setTaxableIncomePerShare(AmountPrice1Choice taxableIncomePerShare) {
		this.taxableIncomePerShare = taxableIncomePerShare;
		return this;
	}

	public Optional<TaxableIncomePerShareCalculated1> getTaxableIncomePerShareCalculated() {
		return taxableIncomePerShareCalculated == null ? Optional.empty() : Optional.of(taxableIncomePerShareCalculated);
	}

	public UnitPrice5 setTaxableIncomePerShareCalculated(com.tools20022.repository.msg.TaxableIncomePerShareCalculated1 taxableIncomePerShareCalculated) {
		this.taxableIncomePerShareCalculated = taxableIncomePerShareCalculated;
		return this;
	}
}