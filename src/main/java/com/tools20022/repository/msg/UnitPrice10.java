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
import com.tools20022.metamodel.MMXor;
import com.tools20022.repository.codeset.PriceMethod1Code;
import com.tools20022.repository.codeset.TaxableIncomePerShareCalculated2Code;
import com.tools20022.repository.codeset.TypeOfPrice10Code;
import com.tools20022.repository.datatype.ActiveCurrencyAnd13DecimalAmount;
import com.tools20022.repository.datatype.Extended350Code;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.entity.DateTimePeriod;
import com.tools20022.repository.entity.SecuritiesPricing;
import com.tools20022.repository.entity.SecuritiesTax;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.PriceValue1;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
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
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponent#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnitPrice10#TypeOrExtendedTypeRule
 * UnitPrice10.TypeOrExtendedTypeRule}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnitPrice10#TISCalculatedOrExtendedTISCalculatedRule
 * UnitPrice10.TISCalculatedOrExtendedTISCalculatedRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice10#mmType
 * UnitPrice10.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice10#mmExtendedType
 * UnitPrice10.mmExtendedType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice10#mmValue
 * UnitPrice10.mmValue}</li>
 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice10#mmPriceMethod
 * UnitPrice10.mmPriceMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnitPrice10#mmNumberOfDaysAccrued
 * UnitPrice10.mmNumberOfDaysAccrued}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnitPrice10#mmTaxableIncomePerShare
 * UnitPrice10.mmTaxableIncomePerShare}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnitPrice10#mmTaxableIncomePerShareCalculated
 * UnitPrice10.mmTaxableIncomePerShareCalculated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnitPrice10#mmExtendedTaxableIncomePerShareCalculated
 * UnitPrice10.mmExtendedTaxableIncomePerShareCalculated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnitPrice10#mmPriceDifferenceReason
 * UnitPrice10.mmPriceDifferenceReason}</li>
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
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "UnitPrice10"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Amount of money for which goods or services are offered, sold, or bought."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice22 UnitPrice22}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "UnitPrice10", propOrder = {"type", "extendedType", "value", "priceMethod", "numberOfDaysAccrued", "taxableIncomePerShare", "taxableIncomePerShareCalculated", "extendedTaxableIncomePerShareCalculated",
		"priceDifferenceReason"})
public class UnitPrice10 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Tp", required = true)
	protected TypeOfPrice10Code type;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfPrice10Code
	 * TypeOfPrice10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmPriceType
	 * SecuritiesPricing.mmPriceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UnitPrice10 UnitPrice10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type and information about a price."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice22#mmType
	 * UnitPrice22.mmType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<UnitPrice10, TypeOfPrice10Code> mmType = new MMMessageAttribute<UnitPrice10, TypeOfPrice10Code>() {
		{
			businessElementTrace_lazy = () -> SecuritiesPricing.mmPriceType;
			componentContext_lazy = () -> com.tools20022.repository.msg.UnitPrice10.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Type and information about a price.";
			nextVersions_lazy = () -> Arrays.asList(UnitPrice22.mmType);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TypeOfPrice10Code.mmObject();
		}

		@Override
		public TypeOfPrice10Code getValue(UnitPrice10 obj) {
			return obj.getType();
		}

		@Override
		public void setValue(UnitPrice10 obj, TypeOfPrice10Code value) {
			obj.setType(value);
		}
	};
	@XmlElement(name = "XtndedTp", required = true)
	protected Extended350Code extendedType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Extended350Code
	 * Extended350Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmPriceType
	 * SecuritiesPricing.mmPriceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UnitPrice10 UnitPrice10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XtndedTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExtendedType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type and information about a price."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<UnitPrice10, Extended350Code> mmExtendedType = new MMMessageAttribute<UnitPrice10, Extended350Code>() {
		{
			businessElementTrace_lazy = () -> SecuritiesPricing.mmPriceType;
			componentContext_lazy = () -> com.tools20022.repository.msg.UnitPrice10.mmObject();
			isDerived = false;
			xmlTag = "XtndedTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExtendedType";
			definition = "Type and information about a price.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Extended350Code.mmObject();
		}

		@Override
		public Extended350Code getValue(UnitPrice10 obj) {
			return obj.getExtendedType();
		}

		@Override
		public void setValue(UnitPrice10 obj, Extended350Code value) {
			obj.setExtendedType(value);
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
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UnitPrice10 UnitPrice10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Val"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Value"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Value of the price, eg, as a currency and value."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice22#mmValue
	 * UnitPrice22.mmValue}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<UnitPrice10, PriceValue1> mmValue = new MMMessageAttribute<UnitPrice10, PriceValue1>() {
		{
			businessElementTrace_lazy = () -> SecuritiesPricing.mmPrice;
			componentContext_lazy = () -> com.tools20022.repository.msg.UnitPrice10.mmObject();
			isDerived = false;
			xmlTag = "Val";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Value";
			definition = "Value of the price, eg, as a currency and value.";
			nextVersions_lazy = () -> Arrays.asList(UnitPrice22.mmValue);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> PriceValue1.mmObject();
		}

		@Override
		public PriceValue1 getValue(UnitPrice10 obj) {
			return obj.getValue();
		}

		@Override
		public void setValue(UnitPrice10 obj, PriceValue1 value) {
			obj.setValue(value);
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
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UnitPrice10 UnitPrice10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PricMtd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of pricing calculation method."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice22#mmPriceMethod
	 * UnitPrice22.mmPriceMethod}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<UnitPrice10, Optional<PriceMethod1Code>> mmPriceMethod = new MMMessageAttribute<UnitPrice10, Optional<PriceMethod1Code>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesPricing.mmPriceMethod;
			componentContext_lazy = () -> com.tools20022.repository.msg.UnitPrice10.mmObject();
			isDerived = false;
			xmlTag = "PricMtd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceMethod";
			definition = "Type of pricing calculation method.";
			nextVersions_lazy = () -> Arrays.asList(UnitPrice22.mmPriceMethod);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PriceMethod1Code.mmObject();
		}

		@Override
		public Optional<PriceMethod1Code> getValue(UnitPrice10 obj) {
			return obj.getPriceMethod();
		}

		@Override
		public void setValue(UnitPrice10 obj, Optional<PriceMethod1Code> value) {
			obj.setPriceMethod(value.orElse(null));
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
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UnitPrice10 UnitPrice10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NbOfDaysAcrd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NumberOfDaysAccrued"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the number of days used for calculating the accrued interest amount."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :99A::DAAC</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnitPrice22#mmNumberOfDaysAccrued
	 * UnitPrice22.mmNumberOfDaysAccrued}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<UnitPrice10, Optional<Number>> mmNumberOfDaysAccrued = new MMMessageAttribute<UnitPrice10, Optional<Number>>() {
		{
			businessElementTrace_lazy = () -> DateTimePeriod.mmNumberOfDays;
			componentContext_lazy = () -> com.tools20022.repository.msg.UnitPrice10.mmObject();
			isDerived = false;
			xmlTag = "NbOfDaysAcrd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":99A::DAAC"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NumberOfDaysAccrued";
			definition = "Specifies the number of days used for calculating the accrued interest amount.";
			nextVersions_lazy = () -> Arrays.asList(UnitPrice22.mmNumberOfDaysAccrued);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Optional<Number> getValue(UnitPrice10 obj) {
			return obj.getNumberOfDaysAccrued();
		}

		@Override
		public void setValue(UnitPrice10 obj, Optional<Number> value) {
			obj.setNumberOfDaysAccrued(value.orElse(null));
		}
	};
	@XmlElement(name = "TaxblIncmPerShr")
	protected ActiveCurrencyAnd13DecimalAmount taxableIncomePerShare;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTax#mmTaxableIncomePerShare
	 * SecuritiesTax.mmTaxableIncomePerShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UnitPrice10 UnitPrice10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxblIncmPerShr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxableIncomePerShare"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount included in the NAV that corresponds to gains directly or indirectly derived from interest payment in the scope of the European Directive on taxation of savings income in the form of interest payments."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnitPrice22#mmTaxableIncomePerShare
	 * UnitPrice22.mmTaxableIncomePerShare}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<UnitPrice10, Optional<ActiveCurrencyAnd13DecimalAmount>> mmTaxableIncomePerShare = new MMMessageAttribute<UnitPrice10, Optional<ActiveCurrencyAnd13DecimalAmount>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTax.mmTaxableIncomePerShare;
			componentContext_lazy = () -> com.tools20022.repository.msg.UnitPrice10.mmObject();
			isDerived = false;
			xmlTag = "TaxblIncmPerShr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxableIncomePerShare";
			definition = "Amount included in the NAV that corresponds to gains directly or indirectly derived from interest payment in the scope of the European Directive on taxation of savings income in the form of interest payments.";
			nextVersions_lazy = () -> Arrays.asList(UnitPrice22.mmTaxableIncomePerShare);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAnd13DecimalAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAnd13DecimalAmount> getValue(UnitPrice10 obj) {
			return obj.getTaxableIncomePerShare();
		}

		@Override
		public void setValue(UnitPrice10 obj, Optional<ActiveCurrencyAnd13DecimalAmount> value) {
			obj.setTaxableIncomePerShare(value.orElse(null));
		}
	};
	@XmlElement(name = "TaxblIncmPerShrClctd")
	protected TaxableIncomePerShareCalculated2Code taxableIncomePerShareCalculated;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TaxableIncomePerShareCalculated2Code
	 * TaxableIncomePerShareCalculated2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTax#mmTaxableIncomePerShareCalculated
	 * SecuritiesTax.mmTaxableIncomePerShareCalculated}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UnitPrice10 UnitPrice10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxblIncmPerShrClctd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxableIncomePerShareCalculated"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the fund calculates a taxable interest per share (TIS)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnitPrice22#mmTaxableIncomePerShareCalculated
	 * UnitPrice22.mmTaxableIncomePerShareCalculated}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<UnitPrice10, Optional<TaxableIncomePerShareCalculated2Code>> mmTaxableIncomePerShareCalculated = new MMMessageAttribute<UnitPrice10, Optional<TaxableIncomePerShareCalculated2Code>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTax.mmTaxableIncomePerShareCalculated;
			componentContext_lazy = () -> com.tools20022.repository.msg.UnitPrice10.mmObject();
			isDerived = false;
			xmlTag = "TaxblIncmPerShrClctd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxableIncomePerShareCalculated";
			definition = "Specifies whether the fund calculates a taxable interest per share (TIS).";
			nextVersions_lazy = () -> Arrays.asList(UnitPrice22.mmTaxableIncomePerShareCalculated);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TaxableIncomePerShareCalculated2Code.mmObject();
		}

		@Override
		public Optional<TaxableIncomePerShareCalculated2Code> getValue(UnitPrice10 obj) {
			return obj.getTaxableIncomePerShareCalculated();
		}

		@Override
		public void setValue(UnitPrice10 obj, Optional<TaxableIncomePerShareCalculated2Code> value) {
			obj.setTaxableIncomePerShareCalculated(value.orElse(null));
		}
	};
	@XmlElement(name = "XtndedTaxblIncmPerShrClctd")
	protected Extended350Code extendedTaxableIncomePerShareCalculated;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Extended350Code
	 * Extended350Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTax#mmTaxableIncomePerShareCalculated
	 * SecuritiesTax.mmTaxableIncomePerShareCalculated}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UnitPrice10 UnitPrice10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XtndedTaxblIncmPerShrClctd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExtendedTaxableIncomePerShareCalculated"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the fund calculates a taxable interest per share (TIS)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<UnitPrice10, Optional<Extended350Code>> mmExtendedTaxableIncomePerShareCalculated = new MMMessageAttribute<UnitPrice10, Optional<Extended350Code>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTax.mmTaxableIncomePerShareCalculated;
			componentContext_lazy = () -> com.tools20022.repository.msg.UnitPrice10.mmObject();
			isDerived = false;
			xmlTag = "XtndedTaxblIncmPerShrClctd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExtendedTaxableIncomePerShareCalculated";
			definition = "Specifies whether the fund calculates a taxable interest per share (TIS).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Extended350Code.mmObject();
		}

		@Override
		public Optional<Extended350Code> getValue(UnitPrice10 obj) {
			return obj.getExtendedTaxableIncomePerShareCalculated();
		}

		@Override
		public void setValue(UnitPrice10 obj, Optional<Extended350Code> value) {
			obj.setExtendedTaxableIncomePerShareCalculated(value.orElse(null));
		}
	};
	@XmlElement(name = "PricDiffRsn")
	protected Max350Text priceDifferenceReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UnitPrice10 UnitPrice10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PricDiffRsn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceDifferenceReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the reason why the price is different from the current market price."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnitPrice22#mmPriceDifferenceReason
	 * UnitPrice22.mmPriceDifferenceReason}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<UnitPrice10, Optional<Max350Text>> mmPriceDifferenceReason = new MMMessageAttribute<UnitPrice10, Optional<Max350Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.UnitPrice10.mmObject();
			isDerived = false;
			xmlTag = "PricDiffRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceDifferenceReason";
			definition = "Specifies the reason why the price is different from the current market price.";
			nextVersions_lazy = () -> Arrays.asList(UnitPrice22.mmPriceDifferenceReason);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Optional<Max350Text> getValue(UnitPrice10 obj) {
			return obj.getPriceDifferenceReason();
		}

		@Override
		public void setValue(UnitPrice10 obj, Optional<Max350Text> value) {
			obj.setPriceDifferenceReason(value.orElse(null));
		}
	};
	/**
	 * Either Type or ExtendedType must be present, but not both.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.UnitPrice10 UnitPrice10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice10#mmType
	 * UnitPrice10.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice10#mmExtendedType
	 * UnitPrice10.mmExtendedType}</li>
	 * </ul>
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TypeOrExtendedTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either Type or ExtendedType must be present, but not both."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMXor TypeOrExtendedTypeRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TypeOrExtendedTypeRule";
			definition = "Either Type or ExtendedType must be present, but not both.";
			messageComponent_lazy = () -> com.tools20022.repository.msg.UnitPrice10.mmObject();
			impactedElements_lazy = () -> Arrays.asList(com.tools20022.repository.msg.UnitPrice10.mmType, com.tools20022.repository.msg.UnitPrice10.mmExtendedType);
		}
	};
	/**
	 * Either TaxableIncomePerShareCalculated or
	 * ExtendedTaxableIncomePerShareCalculated may be present, but not both.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.UnitPrice10 UnitPrice10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnitPrice10#mmTaxableIncomePerShareCalculated
	 * UnitPrice10.mmTaxableIncomePerShareCalculated}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnitPrice10#mmExtendedTaxableIncomePerShareCalculated
	 * UnitPrice10.mmExtendedTaxableIncomePerShareCalculated}</li>
	 * </ul>
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TISCalculatedOrExtendedTISCalculatedRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either TaxableIncomePerShareCalculated or ExtendedTaxableIncomePerShareCalculated may be present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMXor TISCalculatedOrExtendedTISCalculatedRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TISCalculatedOrExtendedTISCalculatedRule";
			definition = "Either TaxableIncomePerShareCalculated or ExtendedTaxableIncomePerShareCalculated may be present, but not both.";
			messageComponent_lazy = () -> com.tools20022.repository.msg.UnitPrice10.mmObject();
			impactedElements_lazy = () -> Arrays.asList(com.tools20022.repository.msg.UnitPrice10.mmTaxableIncomePerShareCalculated, com.tools20022.repository.msg.UnitPrice10.mmExtendedTaxableIncomePerShareCalculated);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.UnitPrice10.mmType, com.tools20022.repository.msg.UnitPrice10.mmExtendedType, com.tools20022.repository.msg.UnitPrice10.mmValue,
						com.tools20022.repository.msg.UnitPrice10.mmPriceMethod, com.tools20022.repository.msg.UnitPrice10.mmNumberOfDaysAccrued, com.tools20022.repository.msg.UnitPrice10.mmTaxableIncomePerShare,
						com.tools20022.repository.msg.UnitPrice10.mmTaxableIncomePerShareCalculated, com.tools20022.repository.msg.UnitPrice10.mmExtendedTaxableIncomePerShareCalculated,
						com.tools20022.repository.msg.UnitPrice10.mmPriceDifferenceReason);
				trace_lazy = () -> SecuritiesPricing.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "UnitPrice10";
				definition = "Amount of money for which goods or services are offered, sold, or bought.";
				nextVersions_lazy = () -> Arrays.asList(UnitPrice22.mmObject());
				xors_lazy = () -> Arrays.asList(com.tools20022.repository.msg.UnitPrice10.TypeOrExtendedTypeRule, com.tools20022.repository.msg.UnitPrice10.TISCalculatedOrExtendedTISCalculatedRule);
			}
		});
		return mmObject_lazy.get();
	}

	public TypeOfPrice10Code getType() {
		return type;
	}

	public UnitPrice10 setType(TypeOfPrice10Code type) {
		this.type = Objects.requireNonNull(type);
		return this;
	}

	public Extended350Code getExtendedType() {
		return extendedType;
	}

	public UnitPrice10 setExtendedType(Extended350Code extendedType) {
		this.extendedType = Objects.requireNonNull(extendedType);
		return this;
	}

	public PriceValue1 getValue() {
		return value;
	}

	public UnitPrice10 setValue(PriceValue1 value) {
		this.value = Objects.requireNonNull(value);
		return this;
	}

	public Optional<PriceMethod1Code> getPriceMethod() {
		return priceMethod == null ? Optional.empty() : Optional.of(priceMethod);
	}

	public UnitPrice10 setPriceMethod(PriceMethod1Code priceMethod) {
		this.priceMethod = priceMethod;
		return this;
	}

	public Optional<Number> getNumberOfDaysAccrued() {
		return numberOfDaysAccrued == null ? Optional.empty() : Optional.of(numberOfDaysAccrued);
	}

	public UnitPrice10 setNumberOfDaysAccrued(Number numberOfDaysAccrued) {
		this.numberOfDaysAccrued = numberOfDaysAccrued;
		return this;
	}

	public Optional<ActiveCurrencyAnd13DecimalAmount> getTaxableIncomePerShare() {
		return taxableIncomePerShare == null ? Optional.empty() : Optional.of(taxableIncomePerShare);
	}

	public UnitPrice10 setTaxableIncomePerShare(ActiveCurrencyAnd13DecimalAmount taxableIncomePerShare) {
		this.taxableIncomePerShare = taxableIncomePerShare;
		return this;
	}

	public Optional<TaxableIncomePerShareCalculated2Code> getTaxableIncomePerShareCalculated() {
		return taxableIncomePerShareCalculated == null ? Optional.empty() : Optional.of(taxableIncomePerShareCalculated);
	}

	public UnitPrice10 setTaxableIncomePerShareCalculated(TaxableIncomePerShareCalculated2Code taxableIncomePerShareCalculated) {
		this.taxableIncomePerShareCalculated = taxableIncomePerShareCalculated;
		return this;
	}

	public Optional<Extended350Code> getExtendedTaxableIncomePerShareCalculated() {
		return extendedTaxableIncomePerShareCalculated == null ? Optional.empty() : Optional.of(extendedTaxableIncomePerShareCalculated);
	}

	public UnitPrice10 setExtendedTaxableIncomePerShareCalculated(Extended350Code extendedTaxableIncomePerShareCalculated) {
		this.extendedTaxableIncomePerShareCalculated = extendedTaxableIncomePerShareCalculated;
		return this;
	}

	public Optional<Max350Text> getPriceDifferenceReason() {
		return priceDifferenceReason == null ? Optional.empty() : Optional.of(priceDifferenceReason);
	}

	public UnitPrice10 setPriceDifferenceReason(Max350Text priceDifferenceReason) {
		this.priceDifferenceReason = priceDifferenceReason;
		return this;
	}
}