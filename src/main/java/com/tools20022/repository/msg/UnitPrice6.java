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
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.AmountPrice1Choice;
import com.tools20022.repository.codeset.PriceMethod1Code;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
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
 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice6#mmType
 * UnitPrice6.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice6#mmPriceMethod
 * UnitPrice6.mmPriceMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnitPrice6#mmValueInInvestmentCurrency
 * UnitPrice6.mmValueInInvestmentCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnitPrice6#mmValueInAlternativeCurrency
 * UnitPrice6.mmValueInAlternativeCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnitPrice6#mmForExecutionIndicator
 * UnitPrice6.mmForExecutionIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnitPrice6#mmCumDividendIndicator
 * UnitPrice6.mmCumDividendIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice6#mmCalculationBasis
 * UnitPrice6.mmCalculationBasis}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnitPrice6#mmNumberOfDaysAccrued
 * UnitPrice6.mmNumberOfDaysAccrued}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnitPrice6#mmTaxableIncomePerShare
 * UnitPrice6.mmTaxableIncomePerShare}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnitPrice6#mmTaxableIncomePerShareCalculated
 * UnitPrice6.mmTaxableIncomePerShareCalculated}</li>
 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice6#mmChargeDetails
 * UnitPrice6.mmChargeDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnitPrice6#mmTaxLiabilityDetails
 * UnitPrice6.mmTaxLiabilityDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice6#mmTaxRefundDetails
 * UnitPrice6.mmTaxRefundDetails}</li>
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
 * "UnitPrice6"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Amount of money for which goods or services are offered, sold, or bought."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCalculationBasisRule#forUnitPrice6
 * ConstraintCalculationBasisRule.forUnitPrice6}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "UnitPrice6", propOrder = {"type", "priceMethod", "valueInInvestmentCurrency", "valueInAlternativeCurrency", "forExecutionIndicator", "cumDividendIndicator", "calculationBasis", "numberOfDaysAccrued",
		"taxableIncomePerShare", "taxableIncomePerShareCalculated", "chargeDetails", "taxLiabilityDetails", "taxRefundDetails"})
public class UnitPrice6 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Tp", required = true)
	protected PriceType2 type;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.PriceType2
	 * PriceType2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmPriceType
	 * SecuritiesPricing.mmPriceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.UnitPrice6
	 * UnitPrice6}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute<UnitPrice6, PriceType2> mmType = new MMMessageAttribute<UnitPrice6, PriceType2>() {
		{
			businessElementTrace_lazy = () -> SecuritiesPricing.mmPriceType;
			componentContext_lazy = () -> com.tools20022.repository.msg.UnitPrice6.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Type and information about a price.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> PriceType2.mmObject();
		}

		@Override
		public PriceType2 getValue(UnitPrice6 obj) {
			return obj.getType();
		}

		@Override
		public void setValue(UnitPrice6 obj, PriceType2 value) {
			obj.setType(value);
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.UnitPrice6
	 * UnitPrice6}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute<UnitPrice6, Optional<PriceMethod1Code>> mmPriceMethod = new MMMessageAttribute<UnitPrice6, Optional<PriceMethod1Code>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesPricing.mmPriceMethod;
			componentContext_lazy = () -> com.tools20022.repository.msg.UnitPrice6.mmObject();
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
		public Optional<PriceMethod1Code> getValue(UnitPrice6 obj) {
			return obj.getPriceMethod();
		}

		@Override
		public void setValue(UnitPrice6 obj, Optional<PriceMethod1Code> value) {
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.UnitPrice6
	 * UnitPrice6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ValInInvstmtCcy"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValueInInvestmentCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Value of the price, eg, as a currency and value."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<UnitPrice6, List<PriceValue1>> mmValueInInvestmentCurrency = new MMMessageAttribute<UnitPrice6, List<PriceValue1>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesPricing.mmPrice;
			componentContext_lazy = () -> com.tools20022.repository.msg.UnitPrice6.mmObject();
			isDerived = false;
			xmlTag = "ValInInvstmtCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValueInInvestmentCurrency";
			definition = "Value of the price, eg, as a currency and value.";
			minOccurs = 1;
			complexType_lazy = () -> PriceValue1.mmObject();
		}

		@Override
		public List<PriceValue1> getValue(UnitPrice6 obj) {
			return obj.getValueInInvestmentCurrency();
		}

		@Override
		public void setValue(UnitPrice6 obj, List<PriceValue1> value) {
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.UnitPrice6
	 * UnitPrice6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ValInAltrntvCcy"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValueInAlternativeCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Value of the price, eg, as a currency and value."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<UnitPrice6, List<PriceValue1>> mmValueInAlternativeCurrency = new MMMessageAttribute<UnitPrice6, List<PriceValue1>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesPricing.mmPrice;
			componentContext_lazy = () -> com.tools20022.repository.msg.UnitPrice6.mmObject();
			isDerived = false;
			xmlTag = "ValInAltrntvCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValueInAlternativeCurrency";
			definition = "Value of the price, eg, as a currency and value.";
			minOccurs = 0;
			complexType_lazy = () -> PriceValue1.mmObject();
		}

		@Override
		public List<PriceValue1> getValue(UnitPrice6 obj) {
			return obj.getValueInAlternativeCurrency();
		}

		@Override
		public void setValue(UnitPrice6 obj, List<PriceValue1> value) {
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.UnitPrice6
	 * UnitPrice6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ForExctnInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForExecutionIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the price information can be used for the execution of a transaction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<UnitPrice6, YesNoIndicator> mmForExecutionIndicator = new MMMessageAttribute<UnitPrice6, YesNoIndicator>() {
		{
			businessElementTrace_lazy = () -> NetAssetValueCalculation.mmForExecutionIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.UnitPrice6.mmObject();
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
		public YesNoIndicator getValue(UnitPrice6 obj) {
			return obj.getForExecutionIndicator();
		}

		@Override
		public void setValue(UnitPrice6 obj, YesNoIndicator value) {
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.UnitPrice6
	 * UnitPrice6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CumDvddInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CumDividendIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the dividend is included, ie, cum-dividend, in the price. When the dividend is not included, the price will be ex-dividend."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<UnitPrice6, YesNoIndicator> mmCumDividendIndicator = new MMMessageAttribute<UnitPrice6, YesNoIndicator>() {
		{
			businessElementTrace_lazy = () -> SecuritiesPricing.mmCumDividendIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.UnitPrice6.mmObject();
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
		public YesNoIndicator getValue(UnitPrice6 obj) {
			return obj.getCumDividendIndicator();
		}

		@Override
		public void setValue(UnitPrice6 obj, YesNoIndicator value) {
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.UnitPrice6
	 * UnitPrice6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClctnBsis"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CalculationBasis"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Ratio applied on the non-adjusted price."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<UnitPrice6, Optional<PercentageRate>> mmCalculationBasis = new MMMessageAttribute<UnitPrice6, Optional<PercentageRate>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesPricing.mmCalculationBasis;
			componentContext_lazy = () -> com.tools20022.repository.msg.UnitPrice6.mmObject();
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
		public Optional<PercentageRate> getValue(UnitPrice6 obj) {
			return obj.getCalculationBasis();
		}

		@Override
		public void setValue(UnitPrice6 obj, Optional<PercentageRate> value) {
			obj.setCalculationBasis(value.orElse(null));
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.UnitPrice6
	 * UnitPrice6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NbOfDaysAcrd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NumberOfDaysAccrued"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the number of days from trade date that the counterparty on the other side of the trade should \"given up\" or divulged."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :99A::DAAC</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<UnitPrice6, Optional<Number>> mmNumberOfDaysAccrued = new MMMessageAttribute<UnitPrice6, Optional<Number>>() {
		{
			businessElementTrace_lazy = () -> DateTimePeriod.mmNumberOfDays;
			componentContext_lazy = () -> com.tools20022.repository.msg.UnitPrice6.mmObject();
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
		public Optional<Number> getValue(UnitPrice6 obj) {
			return obj.getNumberOfDaysAccrued();
		}

		@Override
		public void setValue(UnitPrice6 obj, Optional<Number> value) {
			obj.setNumberOfDaysAccrued(value.orElse(null));
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.UnitPrice6
	 * UnitPrice6}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute<UnitPrice6, Optional<AmountPrice1Choice>> mmTaxableIncomePerShare = new MMMessageAttribute<UnitPrice6, Optional<AmountPrice1Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTax.mmTaxableIncomePerShare;
			componentContext_lazy = () -> com.tools20022.repository.msg.UnitPrice6.mmObject();
			isDerived = false;
			xmlTag = "TaxblIncmPerShr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxableIncomePerShare";
			definition = "Amount included in the NAV that corresponds to gains directly or indirectly derived from interest payment in the scope of the European Directive on taxation of savings income in the form of interest payments.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AmountPrice1Choice.mmObject();
		}

		@Override
		public Optional<AmountPrice1Choice> getValue(UnitPrice6 obj) {
			return obj.getTaxableIncomePerShare();
		}

		@Override
		public void setValue(UnitPrice6 obj, Optional<AmountPrice1Choice> value) {
			obj.setTaxableIncomePerShare(value.orElse(null));
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.UnitPrice6
	 * UnitPrice6}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute<UnitPrice6, Optional<TaxableIncomePerShareCalculated1>> mmTaxableIncomePerShareCalculated = new MMMessageAttribute<UnitPrice6, Optional<TaxableIncomePerShareCalculated1>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTax.mmTaxableIncomePerShareCalculated;
			componentContext_lazy = () -> com.tools20022.repository.msg.UnitPrice6.mmObject();
			isDerived = false;
			xmlTag = "TaxblIncmPerShrClctd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxableIncomePerShareCalculated";
			definition = "Specifies whether the fund calculates a taxable interest per share (TIS).";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> TaxableIncomePerShareCalculated1.mmObject();
		}

		@Override
		public Optional<TaxableIncomePerShareCalculated1> getValue(UnitPrice6 obj) {
			return obj.getTaxableIncomePerShareCalculated();
		}

		@Override
		public void setValue(UnitPrice6 obj, Optional<TaxableIncomePerShareCalculated1> value) {
			obj.setTaxableIncomePerShareCalculated(value.orElse(null));
		}
	};
	@XmlElement(name = "ChrgDtls")
	protected List<Charge9> chargeDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Charge9 Charge9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmFees
	 * Security.mmFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.UnitPrice6
	 * UnitPrice6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ChrgDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargeDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of money associated with a service."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<UnitPrice6, List<Charge9>> mmChargeDetails = new MMMessageAssociationEnd<UnitPrice6, List<Charge9>>() {
		{
			businessElementTrace_lazy = () -> Security.mmFees;
			componentContext_lazy = () -> com.tools20022.repository.msg.UnitPrice6.mmObject();
			isDerived = false;
			xmlTag = "ChrgDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargeDetails";
			definition = "Amount of money associated with a service.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Charge9.mmObject();
		}

		@Override
		public List<Charge9> getValue(UnitPrice6 obj) {
			return obj.getChargeDetails();
		}

		@Override
		public void setValue(UnitPrice6 obj, List<Charge9> value) {
			obj.setChargeDetails(value);
		}
	};
	@XmlElement(name = "TaxLbltyDtls")
	protected List<Tax8> taxLiabilityDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Tax8 Tax8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#mmTaxLiability
	 * NetAssetValueCalculation.mmTaxLiability}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.UnitPrice6
	 * UnitPrice6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxLbltyDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxLiabilityDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information related to taxes that are due."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<UnitPrice6, List<Tax8>> mmTaxLiabilityDetails = new MMMessageAssociationEnd<UnitPrice6, List<Tax8>>() {
		{
			businessElementTrace_lazy = () -> NetAssetValueCalculation.mmTaxLiability;
			componentContext_lazy = () -> com.tools20022.repository.msg.UnitPrice6.mmObject();
			isDerived = false;
			xmlTag = "TaxLbltyDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxLiabilityDetails";
			definition = "Information related to taxes that are due.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Tax8.mmObject();
		}

		@Override
		public List<Tax8> getValue(UnitPrice6 obj) {
			return obj.getTaxLiabilityDetails();
		}

		@Override
		public void setValue(UnitPrice6 obj, List<Tax8> value) {
			obj.setTaxLiabilityDetails(value);
		}
	};
	@XmlElement(name = "TaxRfndDtls")
	protected List<Tax8> taxRefundDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Tax8 Tax8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#mmTaxRefund
	 * NetAssetValueCalculation.mmTaxRefund}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.UnitPrice6
	 * UnitPrice6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxRfndDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxRefundDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information related to taxes that are paid back."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<UnitPrice6, List<Tax8>> mmTaxRefundDetails = new MMMessageAssociationEnd<UnitPrice6, List<Tax8>>() {
		{
			businessElementTrace_lazy = () -> NetAssetValueCalculation.mmTaxRefund;
			componentContext_lazy = () -> com.tools20022.repository.msg.UnitPrice6.mmObject();
			isDerived = false;
			xmlTag = "TaxRfndDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxRefundDetails";
			definition = "Information related to taxes that are paid back.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Tax8.mmObject();
		}

		@Override
		public List<Tax8> getValue(UnitPrice6 obj) {
			return obj.getTaxRefundDetails();
		}

		@Override
		public void setValue(UnitPrice6 obj, List<Tax8> value) {
			obj.setTaxRefundDetails(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.UnitPrice6.mmType, com.tools20022.repository.msg.UnitPrice6.mmPriceMethod, com.tools20022.repository.msg.UnitPrice6.mmValueInInvestmentCurrency,
						com.tools20022.repository.msg.UnitPrice6.mmValueInAlternativeCurrency, com.tools20022.repository.msg.UnitPrice6.mmForExecutionIndicator, com.tools20022.repository.msg.UnitPrice6.mmCumDividendIndicator,
						com.tools20022.repository.msg.UnitPrice6.mmCalculationBasis, com.tools20022.repository.msg.UnitPrice6.mmNumberOfDaysAccrued, com.tools20022.repository.msg.UnitPrice6.mmTaxableIncomePerShare,
						com.tools20022.repository.msg.UnitPrice6.mmTaxableIncomePerShareCalculated, com.tools20022.repository.msg.UnitPrice6.mmChargeDetails, com.tools20022.repository.msg.UnitPrice6.mmTaxLiabilityDetails,
						com.tools20022.repository.msg.UnitPrice6.mmTaxRefundDetails);
				trace_lazy = () -> SecuritiesPricing.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCalculationBasisRule.forUnitPrice6);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "UnitPrice6";
				definition = "Amount of money for which goods or services are offered, sold, or bought.";
			}
		});
		return mmObject_lazy.get();
	}

	public PriceType2 getType() {
		return type;
	}

	public UnitPrice6 setType(PriceType2 type) {
		this.type = Objects.requireNonNull(type);
		return this;
	}

	public Optional<PriceMethod1Code> getPriceMethod() {
		return priceMethod == null ? Optional.empty() : Optional.of(priceMethod);
	}

	public UnitPrice6 setPriceMethod(PriceMethod1Code priceMethod) {
		this.priceMethod = priceMethod;
		return this;
	}

	public List<PriceValue1> getValueInInvestmentCurrency() {
		return valueInInvestmentCurrency == null ? valueInInvestmentCurrency = new ArrayList<>() : valueInInvestmentCurrency;
	}

	public UnitPrice6 setValueInInvestmentCurrency(List<PriceValue1> valueInInvestmentCurrency) {
		this.valueInInvestmentCurrency = Objects.requireNonNull(valueInInvestmentCurrency);
		return this;
	}

	public List<PriceValue1> getValueInAlternativeCurrency() {
		return valueInAlternativeCurrency == null ? valueInAlternativeCurrency = new ArrayList<>() : valueInAlternativeCurrency;
	}

	public UnitPrice6 setValueInAlternativeCurrency(List<PriceValue1> valueInAlternativeCurrency) {
		this.valueInAlternativeCurrency = Objects.requireNonNull(valueInAlternativeCurrency);
		return this;
	}

	public YesNoIndicator getForExecutionIndicator() {
		return forExecutionIndicator;
	}

	public UnitPrice6 setForExecutionIndicator(YesNoIndicator forExecutionIndicator) {
		this.forExecutionIndicator = Objects.requireNonNull(forExecutionIndicator);
		return this;
	}

	public YesNoIndicator getCumDividendIndicator() {
		return cumDividendIndicator;
	}

	public UnitPrice6 setCumDividendIndicator(YesNoIndicator cumDividendIndicator) {
		this.cumDividendIndicator = Objects.requireNonNull(cumDividendIndicator);
		return this;
	}

	public Optional<PercentageRate> getCalculationBasis() {
		return calculationBasis == null ? Optional.empty() : Optional.of(calculationBasis);
	}

	public UnitPrice6 setCalculationBasis(PercentageRate calculationBasis) {
		this.calculationBasis = calculationBasis;
		return this;
	}

	public Optional<Number> getNumberOfDaysAccrued() {
		return numberOfDaysAccrued == null ? Optional.empty() : Optional.of(numberOfDaysAccrued);
	}

	public UnitPrice6 setNumberOfDaysAccrued(Number numberOfDaysAccrued) {
		this.numberOfDaysAccrued = numberOfDaysAccrued;
		return this;
	}

	public Optional<AmountPrice1Choice> getTaxableIncomePerShare() {
		return taxableIncomePerShare == null ? Optional.empty() : Optional.of(taxableIncomePerShare);
	}

	public UnitPrice6 setTaxableIncomePerShare(AmountPrice1Choice taxableIncomePerShare) {
		this.taxableIncomePerShare = taxableIncomePerShare;
		return this;
	}

	public Optional<TaxableIncomePerShareCalculated1> getTaxableIncomePerShareCalculated() {
		return taxableIncomePerShareCalculated == null ? Optional.empty() : Optional.of(taxableIncomePerShareCalculated);
	}

	public UnitPrice6 setTaxableIncomePerShareCalculated(TaxableIncomePerShareCalculated1 taxableIncomePerShareCalculated) {
		this.taxableIncomePerShareCalculated = taxableIncomePerShareCalculated;
		return this;
	}

	public List<Charge9> getChargeDetails() {
		return chargeDetails == null ? chargeDetails = new ArrayList<>() : chargeDetails;
	}

	public UnitPrice6 setChargeDetails(List<Charge9> chargeDetails) {
		this.chargeDetails = Objects.requireNonNull(chargeDetails);
		return this;
	}

	public List<Tax8> getTaxLiabilityDetails() {
		return taxLiabilityDetails == null ? taxLiabilityDetails = new ArrayList<>() : taxLiabilityDetails;
	}

	public UnitPrice6 setTaxLiabilityDetails(List<Tax8> taxLiabilityDetails) {
		this.taxLiabilityDetails = Objects.requireNonNull(taxLiabilityDetails);
		return this;
	}

	public List<Tax8> getTaxRefundDetails() {
		return taxRefundDetails == null ? taxRefundDetails = new ArrayList<>() : taxRefundDetails;
	}

	public UnitPrice6 setTaxRefundDetails(List<Tax8> taxRefundDetails) {
		this.taxRefundDetails = Objects.requireNonNull(taxRefundDetails);
		return this;
	}
}