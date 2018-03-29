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

import com.tools20022.metamodel.ext.FIXSynonym;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.LiquidityIndicatorType1Code;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.datatype.TrueFalseIndicator;
import com.tools20022.repository.entity.ExchangeForPhysicalTrade;
import com.tools20022.repository.entity.Liquidity;
import com.tools20022.repository.entity.ListTrading;
import com.tools20022.repository.entity.NonDisclosedListTrading;
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
 * Ability of a financial instrument to be easily traded and converted to cash,
 * at conditions that do not affect its price.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LiquidityAndStatistics1#mmGrossIndicator
 * LiquidityAndStatistics1.mmGrossIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LiquidityAndStatistics1#mmIndicatorType
 * LiquidityAndStatistics1.mmIndicatorType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LiquidityAndStatistics1#mmWeightedAverageLiquidity
 * LiquidityAndStatistics1.mmWeightedAverageLiquidity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LiquidityAndStatistics1#mmOutMainCountryIndex
 * LiquidityAndStatistics1.mmOutMainCountryIndex}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LiquidityAndStatistics1#mmCrossPercent
 * LiquidityAndStatistics1.mmCrossPercent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LiquidityAndStatistics1#mmSideValue1
 * LiquidityAndStatistics1.mmSideValue1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LiquidityAndStatistics1#mmSideValue2
 * LiquidityAndStatistics1.mmSideValue2}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Liquidity Liquidity}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "LiquidityAndStatistics1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Ability of a financial instrument to be easily traded and converted to cash, at conditions that do not affect its price."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "LiquidityAndStatistics1", propOrder = {"grossIndicator", "indicatorType", "weightedAverageLiquidity", "outMainCountryIndex", "crossPercent", "sideValue1", "sideValue2"})
public class LiquidityAndStatistics1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "GrssInd", required = true)
	protected TrueFalseIndicator grossIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ListTrading#mmGrossAmountIndicator
	 * ListTrading.mmGrossAmountIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LiquidityAndStatistics1
	 * LiquidityAndStatistics1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GrssInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 416</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether an amount is a gross amount (including all charges, commissions and tax), or a net amount."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<LiquidityAndStatistics1, TrueFalseIndicator> mmGrossIndicator = new MMMessageAttribute<LiquidityAndStatistics1, TrueFalseIndicator>() {
		{
			businessElementTrace_lazy = () -> ListTrading.mmGrossAmountIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.LiquidityAndStatistics1.mmObject();
			isDerived = false;
			xmlTag = "GrssInd";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "416"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossIndicator";
			definition = "Indicates whether an amount is a gross amount (including all charges, commissions and tax), or a net amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}

		@Override
		public TrueFalseIndicator getValue(LiquidityAndStatistics1 obj) {
			return obj.getGrossIndicator();
		}

		@Override
		public void setValue(LiquidityAndStatistics1 obj, TrueFalseIndicator value) {
			obj.setGrossIndicator(value);
		}
	};
	@XmlElement(name = "IndTp", required = true)
	protected LiquidityIndicatorType1Code indicatorType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.LiquidityIndicatorType1Code
	 * LiquidityIndicatorType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Liquidity#mmIndicatorType
	 * Liquidity.mmIndicatorType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LiquidityAndStatistics1
	 * LiquidityAndStatistics1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IndTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 409</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndicatorType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Type of liquidity measure, of a financial instrument, on a market."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<LiquidityAndStatistics1, LiquidityIndicatorType1Code> mmIndicatorType = new MMMessageAttribute<LiquidityAndStatistics1, LiquidityIndicatorType1Code>() {
		{
			businessElementTrace_lazy = () -> Liquidity.mmIndicatorType;
			componentContext_lazy = () -> com.tools20022.repository.msg.LiquidityAndStatistics1.mmObject();
			isDerived = false;
			xmlTag = "IndTp";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "409"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndicatorType";
			definition = "Type of liquidity measure, of a financial instrument, on a market.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> LiquidityIndicatorType1Code.mmObject();
		}

		@Override
		public LiquidityIndicatorType1Code getValue(LiquidityAndStatistics1 obj) {
			return obj.getIndicatorType();
		}

		@Override
		public void setValue(LiquidityAndStatistics1 obj, LiquidityIndicatorType1Code value) {
			obj.setIndicatorType(value);
		}
	};
	@XmlElement(name = "WghtdAvrgLqdty", required = true)
	protected PercentageRate weightedAverageLiquidity;
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
	 * {@linkplain com.tools20022.repository.entity.Liquidity#mmWeightedAverageLiquidity
	 * Liquidity.mmWeightedAverageLiquidity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LiquidityAndStatistics1
	 * LiquidityAndStatistics1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "WghtdAvrgLqdty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 410</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WeightedAverageLiquidity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the overall weighted average liquidity expressed as a percentage of average daily volume."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<LiquidityAndStatistics1, PercentageRate> mmWeightedAverageLiquidity = new MMMessageAttribute<LiquidityAndStatistics1, PercentageRate>() {
		{
			businessElementTrace_lazy = () -> Liquidity.mmWeightedAverageLiquidity;
			componentContext_lazy = () -> com.tools20022.repository.msg.LiquidityAndStatistics1.mmObject();
			isDerived = false;
			xmlTag = "WghtdAvrgLqdty";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "410"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WeightedAverageLiquidity";
			definition = "Indicates the overall weighted average liquidity expressed as a percentage of average daily volume.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public PercentageRate getValue(LiquidityAndStatistics1 obj) {
			return obj.getWeightedAverageLiquidity();
		}

		@Override
		public void setValue(LiquidityAndStatistics1 obj, PercentageRate value) {
			obj.setWeightedAverageLiquidity(value);
		}
	};
	@XmlElement(name = "OutMainCtryIndx", required = true)
	protected ActiveCurrencyAndAmount outMainCountryIndex;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.entity.ExchangeForPhysicalTrade#mmOutMainCountryIndex
	 * ExchangeForPhysicalTrade.mmOutMainCountryIndex}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LiquidityAndStatistics1
	 * LiquidityAndStatistics1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OutMainCtryIndx"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 412</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OutMainCountryIndex"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Accepted value of stocks composing an index located outside its country of origin."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<LiquidityAndStatistics1, ActiveCurrencyAndAmount> mmOutMainCountryIndex = new MMMessageAttribute<LiquidityAndStatistics1, ActiveCurrencyAndAmount>() {
		{
			businessElementTrace_lazy = () -> ExchangeForPhysicalTrade.mmOutMainCountryIndex;
			componentContext_lazy = () -> com.tools20022.repository.msg.LiquidityAndStatistics1.mmObject();
			isDerived = false;
			xmlTag = "OutMainCtryIndx";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "412"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OutMainCountryIndex";
			definition = "Accepted value of stocks composing an index located outside its country of origin.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public ActiveCurrencyAndAmount getValue(LiquidityAndStatistics1 obj) {
			return obj.getOutMainCountryIndex();
		}

		@Override
		public void setValue(LiquidityAndStatistics1 obj, ActiveCurrencyAndAmount value) {
			obj.setOutMainCountryIndex(value);
		}
	};
	@XmlElement(name = "CrossPct")
	protected PercentageRate crossPercent;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LiquidityAndStatistics1
	 * LiquidityAndStatistics1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CrossPct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 413</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CrossPercent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Percentage of program that crosses in Currency."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<LiquidityAndStatistics1, Optional<PercentageRate>> mmCrossPercent = new MMMessageAttribute<LiquidityAndStatistics1, Optional<PercentageRate>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.LiquidityAndStatistics1.mmObject();
			isDerived = false;
			xmlTag = "CrossPct";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "413"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CrossPercent";
			definition = "Percentage of program that crosses in Currency.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public Optional<PercentageRate> getValue(LiquidityAndStatistics1 obj) {
			return obj.getCrossPercent();
		}

		@Override
		public void setValue(LiquidityAndStatistics1 obj, Optional<PercentageRate> value) {
			obj.setCrossPercent(value.orElse(null));
		}
	};
	@XmlElement(name = "SdVal1")
	protected ActiveCurrencyAndAmount sideValue1;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.entity.NonDisclosedListTrading#mmSideValue
	 * NonDisclosedListTrading.mmSideValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LiquidityAndStatistics1
	 * LiquidityAndStatistics1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SdVal1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 396, FIXSynonym: 15</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SideValue1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "SideValue1 is used to show the monetary total value in either direction (buy or sell) of the transaction without revealing whether it is the buy-side institutions intention to buy or sell."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<LiquidityAndStatistics1, Optional<ActiveCurrencyAndAmount>> mmSideValue1 = new MMMessageAttribute<LiquidityAndStatistics1, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> NonDisclosedListTrading.mmSideValue;
			componentContext_lazy = () -> com.tools20022.repository.msg.LiquidityAndStatistics1.mmObject();
			isDerived = false;
			xmlTag = "SdVal1";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "396"), new FIXSynonym(this, "15"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SideValue1";
			definition = "SideValue1 is used to show the monetary total value in either direction (buy or sell) of the transaction without revealing whether it is the buy-side institutions intention to buy or sell.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(LiquidityAndStatistics1 obj) {
			return obj.getSideValue1();
		}

		@Override
		public void setValue(LiquidityAndStatistics1 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setSideValue1(value.orElse(null));
		}
	};
	@XmlElement(name = "SdVal2")
	protected ActiveCurrencyAndAmount sideValue2;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.entity.NonDisclosedListTrading#mmSideValue
	 * NonDisclosedListTrading.mmSideValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LiquidityAndStatistics1
	 * LiquidityAndStatistics1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SdVal2"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 397, FIXSynonym: 15</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SideValue2"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "SideValue2 is used to show the monetary total value in either direction (buy or sell) of the transaction without revealing whether it is the buy-side institutions intention to buy or sell."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<LiquidityAndStatistics1, Optional<ActiveCurrencyAndAmount>> mmSideValue2 = new MMMessageAttribute<LiquidityAndStatistics1, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> NonDisclosedListTrading.mmSideValue;
			componentContext_lazy = () -> com.tools20022.repository.msg.LiquidityAndStatistics1.mmObject();
			isDerived = false;
			xmlTag = "SdVal2";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "397"), new FIXSynonym(this, "15"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SideValue2";
			definition = "SideValue2 is used to show the monetary total value in either direction (buy or sell) of the transaction without revealing whether it is the buy-side institutions intention to buy or sell.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(LiquidityAndStatistics1 obj) {
			return obj.getSideValue2();
		}

		@Override
		public void setValue(LiquidityAndStatistics1 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setSideValue2(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.LiquidityAndStatistics1.mmGrossIndicator, com.tools20022.repository.msg.LiquidityAndStatistics1.mmIndicatorType,
						com.tools20022.repository.msg.LiquidityAndStatistics1.mmWeightedAverageLiquidity, com.tools20022.repository.msg.LiquidityAndStatistics1.mmOutMainCountryIndex,
						com.tools20022.repository.msg.LiquidityAndStatistics1.mmCrossPercent, com.tools20022.repository.msg.LiquidityAndStatistics1.mmSideValue1, com.tools20022.repository.msg.LiquidityAndStatistics1.mmSideValue2);
				trace_lazy = () -> Liquidity.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "LiquidityAndStatistics1";
				definition = "Ability of a financial instrument to be easily traded and converted to cash, at conditions that do not affect its price.";
			}
		});
		return mmObject_lazy.get();
	}

	public TrueFalseIndicator getGrossIndicator() {
		return grossIndicator;
	}

	public LiquidityAndStatistics1 setGrossIndicator(TrueFalseIndicator grossIndicator) {
		this.grossIndicator = Objects.requireNonNull(grossIndicator);
		return this;
	}

	public LiquidityIndicatorType1Code getIndicatorType() {
		return indicatorType;
	}

	public LiquidityAndStatistics1 setIndicatorType(LiquidityIndicatorType1Code indicatorType) {
		this.indicatorType = Objects.requireNonNull(indicatorType);
		return this;
	}

	public PercentageRate getWeightedAverageLiquidity() {
		return weightedAverageLiquidity;
	}

	public LiquidityAndStatistics1 setWeightedAverageLiquidity(PercentageRate weightedAverageLiquidity) {
		this.weightedAverageLiquidity = Objects.requireNonNull(weightedAverageLiquidity);
		return this;
	}

	public ActiveCurrencyAndAmount getOutMainCountryIndex() {
		return outMainCountryIndex;
	}

	public LiquidityAndStatistics1 setOutMainCountryIndex(ActiveCurrencyAndAmount outMainCountryIndex) {
		this.outMainCountryIndex = Objects.requireNonNull(outMainCountryIndex);
		return this;
	}

	public Optional<PercentageRate> getCrossPercent() {
		return crossPercent == null ? Optional.empty() : Optional.of(crossPercent);
	}

	public LiquidityAndStatistics1 setCrossPercent(PercentageRate crossPercent) {
		this.crossPercent = crossPercent;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getSideValue1() {
		return sideValue1 == null ? Optional.empty() : Optional.of(sideValue1);
	}

	public LiquidityAndStatistics1 setSideValue1(ActiveCurrencyAndAmount sideValue1) {
		this.sideValue1 = sideValue1;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getSideValue2() {
		return sideValue2 == null ? Optional.empty() : Optional.of(sideValue2);
	}

	public LiquidityAndStatistics1 setSideValue2(ActiveCurrencyAndAmount sideValue2) {
		this.sideValue2 = sideValue2;
		return this;
	}
}