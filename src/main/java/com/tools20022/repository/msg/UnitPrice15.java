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
import com.tools20022.metamodel.*;
import com.tools20022.repository.codeset.EUDividendStatus1Code;
import com.tools20022.repository.codeset.PriceMethod1Code;
import com.tools20022.repository.codeset.TaxableIncomePerShareCalculated2Code;
import com.tools20022.repository.codeset.TypeOfPrice9Code;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.Charge15;
import com.tools20022.repository.msg.PriceValue1;
import com.tools20022.repository.msg.Tax17;
import java.text.DateFormat;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;
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
 * {@linkplain com.tools20022.repository.msg.UnitPrice15#TypeOrExtendedTypeRule
 * UnitPrice15.TypeOrExtendedTypeRule}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnitPrice15#TaxableIncomePerShareCalculatedOrExtendedTaxableIncomePerShareCalculatedRule
 * UnitPrice15.
 * TaxableIncomePerShareCalculatedOrExtendedTaxableIncomePerShareCalculatedRule}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnitPrice15#EUDividendStatusOrExtendedEUDividendStatusRule
 * UnitPrice15.EUDividendStatusOrExtendedEUDividendStatusRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice15#mmType
 * UnitPrice15.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice15#mmExtendedType
 * UnitPrice15.mmExtendedType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice15#mmPriceMethod
 * UnitPrice15.mmPriceMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnitPrice15#mmValueInInvestmentCurrency
 * UnitPrice15.mmValueInInvestmentCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnitPrice15#mmValueInAlternativeCurrency
 * UnitPrice15.mmValueInAlternativeCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnitPrice15#mmForExecutionIndicator
 * UnitPrice15.mmForExecutionIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnitPrice15#mmCumDividendIndicator
 * UnitPrice15.mmCumDividendIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice15#mmCalculationBasis
 * UnitPrice15.mmCalculationBasis}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnitPrice15#mmEstimatedPriceIndicator
 * UnitPrice15.mmEstimatedPriceIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnitPrice15#mmNumberOfDaysAccrued
 * UnitPrice15.mmNumberOfDaysAccrued}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnitPrice15#mmTaxableIncomePerShare
 * UnitPrice15.mmTaxableIncomePerShare}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnitPrice15#mmTaxableIncomePerShareCalculated
 * UnitPrice15.mmTaxableIncomePerShareCalculated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnitPrice15#mmExtendedTaxableIncomePerShareCalculated
 * UnitPrice15.mmExtendedTaxableIncomePerShareCalculated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnitPrice15#mmTaxableIncomePerDividend
 * UnitPrice15.mmTaxableIncomePerDividend}</li>
 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice15#mmEUDividendStatus
 * UnitPrice15.mmEUDividendStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnitPrice15#mmExtendedEUDividendStatus
 * UnitPrice15.mmExtendedEUDividendStatus}</li>
 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice15#mmChargeDetails
 * UnitPrice15.mmChargeDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnitPrice15#mmTaxLiabilityDetails
 * UnitPrice15.mmTaxLiabilityDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice15#mmTaxRefundDetails
 * UnitPrice15.mmTaxRefundDetails}</li>
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
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCalculationBasisRule#forUnitPrice15
 * ConstraintCalculationBasisRule.forUnitPrice15}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "UnitPrice15"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Amount of money for which goods or services are offered, sold, or bought."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "UnitPrice15", propOrder = {"type", "extendedType", "priceMethod", "valueInInvestmentCurrency", "valueInAlternativeCurrency", "forExecutionIndicator", "cumDividendIndicator", "calculationBasis", "estimatedPriceIndicator",
		"numberOfDaysAccrued", "taxableIncomePerShare", "taxableIncomePerShareCalculated", "extendedTaxableIncomePerShareCalculated", "taxableIncomePerDividend", "eUDividendStatus", "extendedEUDividendStatus", "chargeDetails",
		"taxLiabilityDetails", "taxRefundDetails"})
public class UnitPrice15 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Tp", required = true)
	protected TypeOfPrice9Code type;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfPrice9Code
	 * TypeOfPrice9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmPriceType
	 * SecuritiesPricing.mmPriceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UnitPrice15 UnitPrice15}</li>
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
	public static final MMMessageAttribute<UnitPrice15, TypeOfPrice9Code> mmType = new MMMessageAttribute<UnitPrice15, TypeOfPrice9Code>() {
		{
			businessElementTrace_lazy = () -> SecuritiesPricing.mmPriceType;
			componentContext_lazy = () -> com.tools20022.repository.msg.UnitPrice15.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Type and information about a price.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TypeOfPrice9Code.mmObject();
		}

		@Override
		public TypeOfPrice9Code getValue(UnitPrice15 obj) {
			return obj.getType();
		}

		@Override
		public void setValue(UnitPrice15 obj, TypeOfPrice9Code value) {
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
	 * {@linkplain com.tools20022.repository.msg.UnitPrice15 UnitPrice15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XtndedTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExtendedType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type and information about a price."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<UnitPrice15, Extended350Code> mmExtendedType = new MMMessageAttribute<UnitPrice15, Extended350Code>() {
		{
			businessElementTrace_lazy = () -> SecuritiesPricing.mmPriceType;
			componentContext_lazy = () -> com.tools20022.repository.msg.UnitPrice15.mmObject();
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
		public Extended350Code getValue(UnitPrice15 obj) {
			return obj.getExtendedType();
		}

		@Override
		public void setValue(UnitPrice15 obj, Extended350Code value) {
			obj.setExtendedType(value);
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
	 * {@linkplain com.tools20022.repository.msg.UnitPrice15 UnitPrice15}</li>
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
	public static final MMMessageAttribute<UnitPrice15, Optional<PriceMethod1Code>> mmPriceMethod = new MMMessageAttribute<UnitPrice15, Optional<PriceMethod1Code>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesPricing.mmPriceMethod;
			componentContext_lazy = () -> com.tools20022.repository.msg.UnitPrice15.mmObject();
			isDerived = false;
			xmlTag = "PricMtd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceMethod";
			definition = "Type of pricing calculation method.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PriceMethod1Code.mmObject();
		}

		@Override
		public Optional<PriceMethod1Code> getValue(UnitPrice15 obj) {
			return obj.getPriceMethod();
		}

		@Override
		public void setValue(UnitPrice15 obj, Optional<PriceMethod1Code> value) {
			obj.setPriceMethod(value.orElse(null));
		}
	};
	@XmlElement(name = "ValInInvstmtCcy", required = true)
	protected List<PriceValue1> valueInInvestmentCurrency;
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
	 * {@linkplain com.tools20022.repository.msg.UnitPrice15 UnitPrice15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ValInInvstmtCcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValueInInvestmentCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Value of the price, eg, as a currency and value."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<UnitPrice15, List<PriceValue1>> mmValueInInvestmentCurrency = new MMMessageAttribute<UnitPrice15, List<PriceValue1>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesPricing.mmPrice;
			componentContext_lazy = () -> com.tools20022.repository.msg.UnitPrice15.mmObject();
			isDerived = false;
			xmlTag = "ValInInvstmtCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValueInInvestmentCurrency";
			definition = "Value of the price, eg, as a currency and value.";
			minOccurs = 1;
			complexType_lazy = () -> PriceValue1.mmObject();
		}

		@Override
		public List<PriceValue1> getValue(UnitPrice15 obj) {
			return obj.getValueInInvestmentCurrency();
		}

		@Override
		public void setValue(UnitPrice15 obj, List<PriceValue1> value) {
			obj.setValueInInvestmentCurrency(value);
		}
	};
	@XmlElement(name = "ValInAltrntvCcy")
	protected List<PriceValue1> valueInAlternativeCurrency;
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
	 * {@linkplain com.tools20022.repository.msg.UnitPrice15 UnitPrice15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ValInAltrntvCcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValueInAlternativeCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Value of the price, eg, as a currency and value."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<UnitPrice15, List<PriceValue1>> mmValueInAlternativeCurrency = new MMMessageAttribute<UnitPrice15, List<PriceValue1>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesPricing.mmPrice;
			componentContext_lazy = () -> com.tools20022.repository.msg.UnitPrice15.mmObject();
			isDerived = false;
			xmlTag = "ValInAltrntvCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValueInAlternativeCurrency";
			definition = "Value of the price, eg, as a currency and value.";
			minOccurs = 0;
			complexType_lazy = () -> PriceValue1.mmObject();
		}

		@Override
		public List<PriceValue1> getValue(UnitPrice15 obj) {
			return obj.getValueInAlternativeCurrency();
		}

		@Override
		public void setValue(UnitPrice15 obj, List<PriceValue1> value) {
			obj.setValueInAlternativeCurrency(value);
		}
	};
	@XmlElement(name = "ForExctnInd", required = true)
	protected YesNoIndicator forExecutionIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#mmForExecutionIndicator
	 * NetAssetValueCalculation.mmForExecutionIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UnitPrice15 UnitPrice15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ForExctnInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForExecutionIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the price information can be used for the execution of a transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<UnitPrice15, YesNoIndicator> mmForExecutionIndicator = new MMMessageAttribute<UnitPrice15, YesNoIndicator>() {
		{
			businessElementTrace_lazy = () -> NetAssetValueCalculation.mmForExecutionIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.UnitPrice15.mmObject();
			isDerived = false;
			xmlTag = "ForExctnInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForExecutionIndicator";
			definition = "Indicates whether the price information can be used for the execution of a transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(UnitPrice15 obj) {
			return obj.getForExecutionIndicator();
		}

		@Override
		public void setValue(UnitPrice15 obj, YesNoIndicator value) {
			obj.setForExecutionIndicator(value);
		}
	};
	@XmlElement(name = "CumDvddInd", required = true)
	protected YesNoIndicator cumDividendIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmCumDividendIndicator
	 * SecuritiesPricing.mmCumDividendIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UnitPrice15 UnitPrice15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CumDvddInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CumDividendIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the dividend is included, ie, cum-dividend, in the price. When the dividend is not included, the price will be ex-dividend."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<UnitPrice15, YesNoIndicator> mmCumDividendIndicator = new MMMessageAttribute<UnitPrice15, YesNoIndicator>() {
		{
			businessElementTrace_lazy = () -> SecuritiesPricing.mmCumDividendIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.UnitPrice15.mmObject();
			isDerived = false;
			xmlTag = "CumDvddInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CumDividendIndicator";
			definition = "Indicates whether the dividend is included, ie, cum-dividend, in the price. When the dividend is not included, the price will be ex-dividend.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(UnitPrice15 obj) {
			return obj.getCumDividendIndicator();
		}

		@Override
		public void setValue(UnitPrice15 obj, YesNoIndicator value) {
			obj.setCumDividendIndicator(value);
		}
	};
	@XmlElement(name = "ClctnBsis")
	protected PercentageRate calculationBasis;
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmCalculationBasis
	 * SecuritiesPricing.mmCalculationBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UnitPrice15 UnitPrice15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClctnBsis"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CalculationBasis"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Ratio applied on the non-adjusted price."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<UnitPrice15, Optional<PercentageRate>> mmCalculationBasis = new MMMessageAttribute<UnitPrice15, Optional<PercentageRate>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesPricing.mmCalculationBasis;
			componentContext_lazy = () -> com.tools20022.repository.msg.UnitPrice15.mmObject();
			isDerived = false;
			xmlTag = "ClctnBsis";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CalculationBasis";
			definition = "Ratio applied on the non-adjusted price.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public Optional<PercentageRate> getValue(UnitPrice15 obj) {
			return obj.getCalculationBasis();
		}

		@Override
		public void setValue(UnitPrice15 obj, Optional<PercentageRate> value) {
			obj.setCalculationBasis(value.orElse(null));
		}
	};
	@XmlElement(name = "EstmtdPricInd", required = true)
	protected YesNoIndicator estimatedPriceIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#mmEstimatedPriceIndicator
	 * NetAssetValueCalculation.mmEstimatedPriceIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UnitPrice15 UnitPrice15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EstmtdPricInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EstimatedPriceIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the price is an estimated price."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<UnitPrice15, YesNoIndicator> mmEstimatedPriceIndicator = new MMMessageAttribute<UnitPrice15, YesNoIndicator>() {
		{
			businessElementTrace_lazy = () -> NetAssetValueCalculation.mmEstimatedPriceIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.UnitPrice15.mmObject();
			isDerived = false;
			xmlTag = "EstmtdPricInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EstimatedPriceIndicator";
			definition = "Indicates whether the price is an estimated price.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(UnitPrice15 obj) {
			return obj.getEstimatedPriceIndicator();
		}

		@Override
		public void setValue(UnitPrice15 obj, YesNoIndicator value) {
			obj.setEstimatedPriceIndicator(value);
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
	 * {@linkplain com.tools20022.repository.msg.UnitPrice15 UnitPrice15}</li>
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
	 * "Specifies the number of days from trade date that the counterparty on the other side of the trade should \"given up\" or divulged."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<UnitPrice15, Optional<Number>> mmNumberOfDaysAccrued = new MMMessageAttribute<UnitPrice15, Optional<Number>>() {
		{
			businessElementTrace_lazy = () -> DateTimePeriod.mmNumberOfDays;
			componentContext_lazy = () -> com.tools20022.repository.msg.UnitPrice15.mmObject();
			isDerived = false;
			xmlTag = "NbOfDaysAcrd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":99A::DAAC"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NumberOfDaysAccrued";
			definition = "Specifies the number of days from trade date that the counterparty on the other side of the trade should \"given up\" or divulged.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Optional<Number> getValue(UnitPrice15 obj) {
			return obj.getNumberOfDaysAccrued();
		}

		@Override
		public void setValue(UnitPrice15 obj, Optional<Number> value) {
			obj.setNumberOfDaysAccrued(value.orElse(null));
		}
	};
	@XmlElement(name = "TaxblIncmPerShr")
	protected ActiveOrHistoricCurrencyAnd13DecimalAmount taxableIncomePerShare;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAnd13DecimalAmount
	 * ActiveOrHistoricCurrencyAnd13DecimalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTax#mmTaxableIncomePerShare
	 * SecuritiesTax.mmTaxableIncomePerShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UnitPrice15 UnitPrice15}</li>
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
	public static final MMMessageAttribute<UnitPrice15, Optional<ActiveOrHistoricCurrencyAnd13DecimalAmount>> mmTaxableIncomePerShare = new MMMessageAttribute<UnitPrice15, Optional<ActiveOrHistoricCurrencyAnd13DecimalAmount>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTax.mmTaxableIncomePerShare;
			componentContext_lazy = () -> com.tools20022.repository.msg.UnitPrice15.mmObject();
			isDerived = false;
			xmlTag = "TaxblIncmPerShr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxableIncomePerShare";
			definition = "Amount included in the NAV that corresponds to gains directly or indirectly derived from interest payment in the scope of the European Directive on taxation of savings income in the form of interest payments.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAnd13DecimalAmount.mmObject();
		}

		@Override
		public Optional<ActiveOrHistoricCurrencyAnd13DecimalAmount> getValue(UnitPrice15 obj) {
			return obj.getTaxableIncomePerShare();
		}

		@Override
		public void setValue(UnitPrice15 obj, Optional<ActiveOrHistoricCurrencyAnd13DecimalAmount> value) {
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
	 * {@linkplain com.tools20022.repository.msg.UnitPrice15 UnitPrice15}</li>
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
	public static final MMMessageAttribute<UnitPrice15, Optional<TaxableIncomePerShareCalculated2Code>> mmTaxableIncomePerShareCalculated = new MMMessageAttribute<UnitPrice15, Optional<TaxableIncomePerShareCalculated2Code>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTax.mmTaxableIncomePerShareCalculated;
			componentContext_lazy = () -> com.tools20022.repository.msg.UnitPrice15.mmObject();
			isDerived = false;
			xmlTag = "TaxblIncmPerShrClctd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxableIncomePerShareCalculated";
			definition = "Specifies whether the fund calculates a taxable interest per share (TIS).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TaxableIncomePerShareCalculated2Code.mmObject();
		}

		@Override
		public Optional<TaxableIncomePerShareCalculated2Code> getValue(UnitPrice15 obj) {
			return obj.getTaxableIncomePerShareCalculated();
		}

		@Override
		public void setValue(UnitPrice15 obj, Optional<TaxableIncomePerShareCalculated2Code> value) {
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
	 * {@linkplain com.tools20022.repository.msg.UnitPrice15 UnitPrice15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XtndedTaxblIncmPerShrClctd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExtendedTaxableIncomePerShareCalculated"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the fund calculates a taxable interest per share (TIS)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<UnitPrice15, Optional<Extended350Code>> mmExtendedTaxableIncomePerShareCalculated = new MMMessageAttribute<UnitPrice15, Optional<Extended350Code>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTax.mmTaxableIncomePerShareCalculated;
			componentContext_lazy = () -> com.tools20022.repository.msg.UnitPrice15.mmObject();
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
		public Optional<Extended350Code> getValue(UnitPrice15 obj) {
			return obj.getExtendedTaxableIncomePerShareCalculated();
		}

		@Override
		public void setValue(UnitPrice15 obj, Optional<Extended350Code> value) {
			obj.setExtendedTaxableIncomePerShareCalculated(value.orElse(null));
		}
	};
	@XmlElement(name = "TaxblIncmPerDvdd")
	protected ActiveOrHistoricCurrencyAnd13DecimalAmount taxableIncomePerDividend;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAnd13DecimalAmount
	 * ActiveOrHistoricCurrencyAnd13DecimalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTax#mmTaxableIncomePerDividend
	 * SecuritiesTax.mmTaxableIncomePerDividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UnitPrice15 UnitPrice15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxblIncmPerDvdd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxableIncomePerDividend"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount included in the dividend that corresponds to gains directly or indirectly derived from interest payment in the scope of the European Directive on taxation of savings income in the form of interest payments."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<UnitPrice15, Optional<ActiveOrHistoricCurrencyAnd13DecimalAmount>> mmTaxableIncomePerDividend = new MMMessageAttribute<UnitPrice15, Optional<ActiveOrHistoricCurrencyAnd13DecimalAmount>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTax.mmTaxableIncomePerDividend;
			componentContext_lazy = () -> com.tools20022.repository.msg.UnitPrice15.mmObject();
			isDerived = false;
			xmlTag = "TaxblIncmPerDvdd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxableIncomePerDividend";
			definition = "Amount included in the dividend that corresponds to gains directly or indirectly derived from interest payment in the scope of the European Directive on taxation of savings income in the form of interest payments.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAnd13DecimalAmount.mmObject();
		}

		@Override
		public Optional<ActiveOrHistoricCurrencyAnd13DecimalAmount> getValue(UnitPrice15 obj) {
			return obj.getTaxableIncomePerDividend();
		}

		@Override
		public void setValue(UnitPrice15 obj, Optional<ActiveOrHistoricCurrencyAnd13DecimalAmount> value) {
			obj.setTaxableIncomePerDividend(value.orElse(null));
		}
	};
	@XmlElement(name = "EUDvddSts")
	protected EUDividendStatus1Code eUDividendStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.EUDividendStatus1Code
	 * EUDividendStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTax#mmEUDividendStatus
	 * SecuritiesTax.mmEUDividendStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UnitPrice15 UnitPrice15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EUDvddSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EUDividendStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether dividend is in the scope of the European directive on taxation of savings income in the form of interest payments (Council Directive 2003/48/EC 3 June), or an income realised upon sale, a refund or redemption of shares and units, etc."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<UnitPrice15, Optional<EUDividendStatus1Code>> mmEUDividendStatus = new MMMessageAttribute<UnitPrice15, Optional<EUDividendStatus1Code>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTax.mmEUDividendStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.UnitPrice15.mmObject();
			isDerived = false;
			xmlTag = "EUDvddSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EUDividendStatus";
			definition = "Specifies whether dividend is in the scope of the European directive on taxation of savings income in the form of interest payments (Council Directive 2003/48/EC 3 June), or an income realised upon sale, a refund or redemption of shares and units, etc.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> EUDividendStatus1Code.mmObject();
		}

		@Override
		public Optional<EUDividendStatus1Code> getValue(UnitPrice15 obj) {
			return obj.getEUDividendStatus();
		}

		@Override
		public void setValue(UnitPrice15 obj, Optional<EUDividendStatus1Code> value) {
			obj.setEUDividendStatus(value.orElse(null));
		}
	};
	@XmlElement(name = "XtndedEUDvddSts")
	protected Extended350Code extendedEUDividendStatus;
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTax#mmEUDividendStatus
	 * SecuritiesTax.mmEUDividendStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UnitPrice15 UnitPrice15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XtndedEUDvddSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExtendedEUDividendStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether dividend is in the scope of the European directive on taxation of savings income in the form of interest payments (Council Directive 2003/48/EC 3 June), or an income realised upon sale, a refund or redemption of shares and units, etc."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<UnitPrice15, Optional<Extended350Code>> mmExtendedEUDividendStatus = new MMMessageAttribute<UnitPrice15, Optional<Extended350Code>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTax.mmEUDividendStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.UnitPrice15.mmObject();
			isDerived = false;
			xmlTag = "XtndedEUDvddSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExtendedEUDividendStatus";
			definition = "Specifies whether dividend is in the scope of the European directive on taxation of savings income in the form of interest payments (Council Directive 2003/48/EC 3 June), or an income realised upon sale, a refund or redemption of shares and units, etc.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Extended350Code.mmObject();
		}

		@Override
		public Optional<Extended350Code> getValue(UnitPrice15 obj) {
			return obj.getExtendedEUDividendStatus();
		}

		@Override
		public void setValue(UnitPrice15 obj, Optional<Extended350Code> value) {
			obj.setExtendedEUDividendStatus(value.orElse(null));
		}
	};
	@XmlElement(name = "ChrgDtls")
	protected List<Charge15> chargeDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Charge15 Charge15}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmFees
	 * Security.mmFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UnitPrice15 UnitPrice15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ChrgDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargeDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of money associated with a service."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<UnitPrice15, List<Charge15>> mmChargeDetails = new MMMessageAssociationEnd<UnitPrice15, List<Charge15>>() {
		{
			businessElementTrace_lazy = () -> Security.mmFees;
			componentContext_lazy = () -> com.tools20022.repository.msg.UnitPrice15.mmObject();
			isDerived = false;
			xmlTag = "ChrgDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargeDetails";
			definition = "Amount of money associated with a service.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Charge15.mmObject();
		}

		@Override
		public List<Charge15> getValue(UnitPrice15 obj) {
			return obj.getChargeDetails();
		}

		@Override
		public void setValue(UnitPrice15 obj, List<Charge15> value) {
			obj.setChargeDetails(value);
		}
	};
	@XmlElement(name = "TaxLbltyDtls")
	protected List<Tax17> taxLiabilityDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Tax17 Tax17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#mmTaxLiability
	 * NetAssetValueCalculation.mmTaxLiability}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UnitPrice15 UnitPrice15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxLbltyDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxLiabilityDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information related to taxes that are due."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<UnitPrice15, List<Tax17>> mmTaxLiabilityDetails = new MMMessageAssociationEnd<UnitPrice15, List<Tax17>>() {
		{
			businessElementTrace_lazy = () -> NetAssetValueCalculation.mmTaxLiability;
			componentContext_lazy = () -> com.tools20022.repository.msg.UnitPrice15.mmObject();
			isDerived = false;
			xmlTag = "TaxLbltyDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxLiabilityDetails";
			definition = "Information related to taxes that are due.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Tax17.mmObject();
		}

		@Override
		public List<Tax17> getValue(UnitPrice15 obj) {
			return obj.getTaxLiabilityDetails();
		}

		@Override
		public void setValue(UnitPrice15 obj, List<Tax17> value) {
			obj.setTaxLiabilityDetails(value);
		}
	};
	@XmlElement(name = "TaxRfndDtls")
	protected List<Tax17> taxRefundDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Tax17 Tax17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#mmTaxRefund
	 * NetAssetValueCalculation.mmTaxRefund}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UnitPrice15 UnitPrice15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxRfndDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxRefundDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information related to taxes that are paid back."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<UnitPrice15, List<Tax17>> mmTaxRefundDetails = new MMMessageAssociationEnd<UnitPrice15, List<Tax17>>() {
		{
			businessElementTrace_lazy = () -> NetAssetValueCalculation.mmTaxRefund;
			componentContext_lazy = () -> com.tools20022.repository.msg.UnitPrice15.mmObject();
			isDerived = false;
			xmlTag = "TaxRfndDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxRefundDetails";
			definition = "Information related to taxes that are paid back.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Tax17.mmObject();
		}

		@Override
		public List<Tax17> getValue(UnitPrice15 obj) {
			return obj.getTaxRefundDetails();
		}

		@Override
		public void setValue(UnitPrice15 obj, List<Tax17> value) {
			obj.setTaxRefundDetails(value);
		}
	};
	/**
	 * Either Type or ExtendedType must be present, but not both.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.UnitPrice15 UnitPrice15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice15#mmType
	 * UnitPrice15.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice15#mmExtendedType
	 * UnitPrice15.mmExtendedType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TypeOrExtendedTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either Type or ExtendedType must be present, but not both."</li>
	 * </ul>
	 */
	public static final MMXor TypeOrExtendedTypeRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TypeOrExtendedTypeRule";
			definition = "Either Type or ExtendedType must be present, but not both.";
			messageComponent_lazy = () -> com.tools20022.repository.msg.UnitPrice15.mmObject();
			impactedElements_lazy = () -> Arrays.asList(com.tools20022.repository.msg.UnitPrice15.mmType, com.tools20022.repository.msg.UnitPrice15.mmExtendedType);
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
	 * {@linkplain com.tools20022.repository.msg.UnitPrice15 UnitPrice15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnitPrice15#mmTaxableIncomePerShareCalculated
	 * UnitPrice15.mmTaxableIncomePerShareCalculated}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnitPrice15#mmExtendedTaxableIncomePerShareCalculated
	 * UnitPrice15.mmExtendedTaxableIncomePerShareCalculated}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} =
	 * "TaxableIncomePerShareCalculatedOrExtendedTaxableIncomePerShareCalculatedRule"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either TaxableIncomePerShareCalculated or ExtendedTaxableIncomePerShareCalculated may be present, but not both."
	 * </li>
	 * </ul>
	 */
	public static final MMXor TaxableIncomePerShareCalculatedOrExtendedTaxableIncomePerShareCalculatedRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxableIncomePerShareCalculatedOrExtendedTaxableIncomePerShareCalculatedRule";
			definition = "Either TaxableIncomePerShareCalculated or ExtendedTaxableIncomePerShareCalculated may be present, but not both.";
			messageComponent_lazy = () -> com.tools20022.repository.msg.UnitPrice15.mmObject();
			impactedElements_lazy = () -> Arrays.asList(com.tools20022.repository.msg.UnitPrice15.mmTaxableIncomePerShareCalculated, com.tools20022.repository.msg.UnitPrice15.mmExtendedTaxableIncomePerShareCalculated);
		}
	};
	/**
	 * Either EUDividendStatus or ExtendedEUDividendStatus may be present, but
	 * not both.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.UnitPrice15 UnitPrice15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnitPrice15#mmEUDividendStatus
	 * UnitPrice15.mmEUDividendStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnitPrice15#mmExtendedEUDividendStatus
	 * UnitPrice15.mmExtendedEUDividendStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EUDividendStatusOrExtendedEUDividendStatusRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either EUDividendStatus or ExtendedEUDividendStatus may be present, but not both."
	 * </li>
	 * </ul>
	 */
	public static final MMXor EUDividendStatusOrExtendedEUDividendStatusRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EUDividendStatusOrExtendedEUDividendStatusRule";
			definition = "Either EUDividendStatus or ExtendedEUDividendStatus may be present, but not both.";
			messageComponent_lazy = () -> com.tools20022.repository.msg.UnitPrice15.mmObject();
			impactedElements_lazy = () -> Arrays.asList(com.tools20022.repository.msg.UnitPrice15.mmEUDividendStatus, com.tools20022.repository.msg.UnitPrice15.mmExtendedEUDividendStatus);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.UnitPrice15.mmType, com.tools20022.repository.msg.UnitPrice15.mmExtendedType, com.tools20022.repository.msg.UnitPrice15.mmPriceMethod,
						com.tools20022.repository.msg.UnitPrice15.mmValueInInvestmentCurrency, com.tools20022.repository.msg.UnitPrice15.mmValueInAlternativeCurrency, com.tools20022.repository.msg.UnitPrice15.mmForExecutionIndicator,
						com.tools20022.repository.msg.UnitPrice15.mmCumDividendIndicator, com.tools20022.repository.msg.UnitPrice15.mmCalculationBasis, com.tools20022.repository.msg.UnitPrice15.mmEstimatedPriceIndicator,
						com.tools20022.repository.msg.UnitPrice15.mmNumberOfDaysAccrued, com.tools20022.repository.msg.UnitPrice15.mmTaxableIncomePerShare, com.tools20022.repository.msg.UnitPrice15.mmTaxableIncomePerShareCalculated,
						com.tools20022.repository.msg.UnitPrice15.mmExtendedTaxableIncomePerShareCalculated, com.tools20022.repository.msg.UnitPrice15.mmTaxableIncomePerDividend,
						com.tools20022.repository.msg.UnitPrice15.mmEUDividendStatus, com.tools20022.repository.msg.UnitPrice15.mmExtendedEUDividendStatus, com.tools20022.repository.msg.UnitPrice15.mmChargeDetails,
						com.tools20022.repository.msg.UnitPrice15.mmTaxLiabilityDetails, com.tools20022.repository.msg.UnitPrice15.mmTaxRefundDetails);
				trace_lazy = () -> SecuritiesPricing.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCalculationBasisRule.forUnitPrice15);
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "UnitPrice15";
				definition = "Amount of money for which goods or services are offered, sold, or bought.";
				xors_lazy = () -> Arrays.asList(com.tools20022.repository.msg.UnitPrice15.TypeOrExtendedTypeRule, com.tools20022.repository.msg.UnitPrice15.TaxableIncomePerShareCalculatedOrExtendedTaxableIncomePerShareCalculatedRule,
						com.tools20022.repository.msg.UnitPrice15.EUDividendStatusOrExtendedEUDividendStatusRule);
			}
		});
		return mmObject_lazy.get();
	}

	public TypeOfPrice9Code getType() {
		return type;
	}

	public UnitPrice15 setType(TypeOfPrice9Code type) {
		this.type = Objects.requireNonNull(type);
		return this;
	}

	public Extended350Code getExtendedType() {
		return extendedType;
	}

	public UnitPrice15 setExtendedType(Extended350Code extendedType) {
		this.extendedType = Objects.requireNonNull(extendedType);
		return this;
	}

	public Optional<PriceMethod1Code> getPriceMethod() {
		return priceMethod == null ? Optional.empty() : Optional.of(priceMethod);
	}

	public UnitPrice15 setPriceMethod(PriceMethod1Code priceMethod) {
		this.priceMethod = priceMethod;
		return this;
	}

	public List<PriceValue1> getValueInInvestmentCurrency() {
		return valueInInvestmentCurrency == null ? valueInInvestmentCurrency = new ArrayList<>() : valueInInvestmentCurrency;
	}

	public UnitPrice15 setValueInInvestmentCurrency(List<PriceValue1> valueInInvestmentCurrency) {
		this.valueInInvestmentCurrency = Objects.requireNonNull(valueInInvestmentCurrency);
		return this;
	}

	public List<PriceValue1> getValueInAlternativeCurrency() {
		return valueInAlternativeCurrency == null ? valueInAlternativeCurrency = new ArrayList<>() : valueInAlternativeCurrency;
	}

	public UnitPrice15 setValueInAlternativeCurrency(List<PriceValue1> valueInAlternativeCurrency) {
		this.valueInAlternativeCurrency = Objects.requireNonNull(valueInAlternativeCurrency);
		return this;
	}

	public YesNoIndicator getForExecutionIndicator() {
		return forExecutionIndicator;
	}

	public UnitPrice15 setForExecutionIndicator(YesNoIndicator forExecutionIndicator) {
		this.forExecutionIndicator = Objects.requireNonNull(forExecutionIndicator);
		return this;
	}

	public YesNoIndicator getCumDividendIndicator() {
		return cumDividendIndicator;
	}

	public UnitPrice15 setCumDividendIndicator(YesNoIndicator cumDividendIndicator) {
		this.cumDividendIndicator = Objects.requireNonNull(cumDividendIndicator);
		return this;
	}

	public Optional<PercentageRate> getCalculationBasis() {
		return calculationBasis == null ? Optional.empty() : Optional.of(calculationBasis);
	}

	public UnitPrice15 setCalculationBasis(PercentageRate calculationBasis) {
		this.calculationBasis = calculationBasis;
		return this;
	}

	public YesNoIndicator getEstimatedPriceIndicator() {
		return estimatedPriceIndicator;
	}

	public UnitPrice15 setEstimatedPriceIndicator(YesNoIndicator estimatedPriceIndicator) {
		this.estimatedPriceIndicator = Objects.requireNonNull(estimatedPriceIndicator);
		return this;
	}

	public Optional<Number> getNumberOfDaysAccrued() {
		return numberOfDaysAccrued == null ? Optional.empty() : Optional.of(numberOfDaysAccrued);
	}

	public UnitPrice15 setNumberOfDaysAccrued(Number numberOfDaysAccrued) {
		this.numberOfDaysAccrued = numberOfDaysAccrued;
		return this;
	}

	public Optional<ActiveOrHistoricCurrencyAnd13DecimalAmount> getTaxableIncomePerShare() {
		return taxableIncomePerShare == null ? Optional.empty() : Optional.of(taxableIncomePerShare);
	}

	public UnitPrice15 setTaxableIncomePerShare(ActiveOrHistoricCurrencyAnd13DecimalAmount taxableIncomePerShare) {
		this.taxableIncomePerShare = taxableIncomePerShare;
		return this;
	}

	public Optional<TaxableIncomePerShareCalculated2Code> getTaxableIncomePerShareCalculated() {
		return taxableIncomePerShareCalculated == null ? Optional.empty() : Optional.of(taxableIncomePerShareCalculated);
	}

	public UnitPrice15 setTaxableIncomePerShareCalculated(TaxableIncomePerShareCalculated2Code taxableIncomePerShareCalculated) {
		this.taxableIncomePerShareCalculated = taxableIncomePerShareCalculated;
		return this;
	}

	public Optional<Extended350Code> getExtendedTaxableIncomePerShareCalculated() {
		return extendedTaxableIncomePerShareCalculated == null ? Optional.empty() : Optional.of(extendedTaxableIncomePerShareCalculated);
	}

	public UnitPrice15 setExtendedTaxableIncomePerShareCalculated(Extended350Code extendedTaxableIncomePerShareCalculated) {
		this.extendedTaxableIncomePerShareCalculated = extendedTaxableIncomePerShareCalculated;
		return this;
	}

	public Optional<ActiveOrHistoricCurrencyAnd13DecimalAmount> getTaxableIncomePerDividend() {
		return taxableIncomePerDividend == null ? Optional.empty() : Optional.of(taxableIncomePerDividend);
	}

	public UnitPrice15 setTaxableIncomePerDividend(ActiveOrHistoricCurrencyAnd13DecimalAmount taxableIncomePerDividend) {
		this.taxableIncomePerDividend = taxableIncomePerDividend;
		return this;
	}

	public Optional<EUDividendStatus1Code> getEUDividendStatus() {
		return eUDividendStatus == null ? Optional.empty() : Optional.of(eUDividendStatus);
	}

	public UnitPrice15 setEUDividendStatus(EUDividendStatus1Code eUDividendStatus) {
		this.eUDividendStatus = eUDividendStatus;
		return this;
	}

	public Optional<Extended350Code> getExtendedEUDividendStatus() {
		return extendedEUDividendStatus == null ? Optional.empty() : Optional.of(extendedEUDividendStatus);
	}

	public UnitPrice15 setExtendedEUDividendStatus(Extended350Code extendedEUDividendStatus) {
		this.extendedEUDividendStatus = extendedEUDividendStatus;
		return this;
	}

	public List<Charge15> getChargeDetails() {
		return chargeDetails == null ? chargeDetails = new ArrayList<>() : chargeDetails;
	}

	public UnitPrice15 setChargeDetails(List<Charge15> chargeDetails) {
		this.chargeDetails = Objects.requireNonNull(chargeDetails);
		return this;
	}

	public List<Tax17> getTaxLiabilityDetails() {
		return taxLiabilityDetails == null ? taxLiabilityDetails = new ArrayList<>() : taxLiabilityDetails;
	}

	public UnitPrice15 setTaxLiabilityDetails(List<Tax17> taxLiabilityDetails) {
		this.taxLiabilityDetails = Objects.requireNonNull(taxLiabilityDetails);
		return this;
	}

	public List<Tax17> getTaxRefundDetails() {
		return taxRefundDetails == null ? taxRefundDetails = new ArrayList<>() : taxRefundDetails;
	}

	public UnitPrice15 setTaxRefundDetails(List<Tax17> taxRefundDetails) {
		this.taxRefundDetails = Objects.requireNonNull(taxRefundDetails);
		return this;
	}
}