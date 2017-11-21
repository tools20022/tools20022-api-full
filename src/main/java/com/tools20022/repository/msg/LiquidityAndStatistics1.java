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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "LiquidityAndStatistics1", propOrder = {"grossIndicator", "indicatorType", "weightedAverageLiquidity", "outMainCountryIndex", "crossPercent", "sideValue1", "sideValue2"})
public class LiquidityAndStatistics1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected TrueFalseIndicator grossIndicator;
	/**
	 * Indicates whether an amount is a gross amount (including all charges,
	 * commissions and tax), or a net amount.
	 * <p>
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
	public static final MMMessageAttribute mmGrossIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ListTrading.mmGrossAmountIndicator;
			componentContext_lazy = () -> LiquidityAndStatistics1.mmObject();
			isDerived = false;
			xmlTag = "GrssInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossIndicator";
			definition = "Indicates whether an amount is a gross amount (including all charges, commissions and tax), or a net amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	protected LiquidityIndicatorType1Code indicatorType;
	/**
	 * Type of liquidity measure, of a financial instrument, on a market.
	 * <p>
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
	public static final MMMessageAttribute mmIndicatorType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Liquidity.mmIndicatorType;
			componentContext_lazy = () -> LiquidityAndStatistics1.mmObject();
			isDerived = false;
			xmlTag = "IndTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndicatorType";
			definition = "Type of liquidity measure, of a financial instrument, on a market.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> LiquidityIndicatorType1Code.mmObject();
		}
	};
	protected PercentageRate weightedAverageLiquidity;
	/**
	 * Indicates the overall weighted average liquidity expressed as a
	 * percentage of average daily volume.
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
	public static final MMMessageAttribute mmWeightedAverageLiquidity = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Liquidity.mmWeightedAverageLiquidity;
			componentContext_lazy = () -> LiquidityAndStatistics1.mmObject();
			isDerived = false;
			xmlTag = "WghtdAvrgLqdty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WeightedAverageLiquidity";
			definition = "Indicates the overall weighted average liquidity expressed as a percentage of average daily volume.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount outMainCountryIndex;
	/**
	 * Accepted value of stocks composing an index located outside its country
	 * of origin.
	 * <p>
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
	public static final MMMessageAttribute mmOutMainCountryIndex = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ExchangeForPhysicalTrade.mmOutMainCountryIndex;
			componentContext_lazy = () -> LiquidityAndStatistics1.mmObject();
			isDerived = false;
			xmlTag = "OutMainCtryIndx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OutMainCountryIndex";
			definition = "Accepted value of stocks composing an index located outside its country of origin.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected PercentageRate crossPercent;
	/**
	 * Percentage of program that crosses in Currency.
	 * <p>
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
	public static final MMMessageAttribute mmCrossPercent = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> LiquidityAndStatistics1.mmObject();
			isDerived = false;
			xmlTag = "CrossPct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CrossPercent";
			definition = "Percentage of program that crosses in Currency.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount sideValue1;
	/**
	 * SideValue1 is used to show the monetary total value in either direction
	 * (buy or sell) of the transaction without revealing whether it is the
	 * buy-side institutions intention to buy or sell.
	 * <p>
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
	public static final MMMessageAttribute mmSideValue1 = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> NonDisclosedListTrading.mmSideValue;
			componentContext_lazy = () -> LiquidityAndStatistics1.mmObject();
			isDerived = false;
			xmlTag = "SdVal1";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SideValue1";
			definition = "SideValue1 is used to show the monetary total value in either direction (buy or sell) of the transaction without revealing whether it is the buy-side institutions intention to buy or sell.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount sideValue2;
	/**
	 * SideValue2 is used to show the monetary total value in either direction
	 * (buy or sell) of the transaction without revealing whether it is the
	 * buy-side institutions intention to buy or sell.
	 * <p>
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
	public static final MMMessageAttribute mmSideValue2 = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> NonDisclosedListTrading.mmSideValue;
			componentContext_lazy = () -> LiquidityAndStatistics1.mmObject();
			isDerived = false;
			xmlTag = "SdVal2";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SideValue2";
			definition = "SideValue2 is used to show the monetary total value in either direction (buy or sell) of the transaction without revealing whether it is the buy-side institutions intention to buy or sell.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(LiquidityAndStatistics1.mmGrossIndicator, LiquidityAndStatistics1.mmIndicatorType, LiquidityAndStatistics1.mmWeightedAverageLiquidity, LiquidityAndStatistics1.mmOutMainCountryIndex,
						LiquidityAndStatistics1.mmCrossPercent, LiquidityAndStatistics1.mmSideValue1, LiquidityAndStatistics1.mmSideValue2);
				trace_lazy = () -> Liquidity.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "LiquidityAndStatistics1";
				definition = "Ability of a financial instrument to be easily traded and converted to cash, at conditions that do not affect its price.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "GrssInd", required = true)
	public TrueFalseIndicator getGrossIndicator() {
		return grossIndicator;
	}

	public void setGrossIndicator(TrueFalseIndicator grossIndicator) {
		this.grossIndicator = grossIndicator;
	}

	@XmlElement(name = "IndTp", required = true)
	public LiquidityIndicatorType1Code getIndicatorType() {
		return indicatorType;
	}

	public void setIndicatorType(LiquidityIndicatorType1Code indicatorType) {
		this.indicatorType = indicatorType;
	}

	@XmlElement(name = "WghtdAvrgLqdty", required = true)
	public PercentageRate getWeightedAverageLiquidity() {
		return weightedAverageLiquidity;
	}

	public void setWeightedAverageLiquidity(PercentageRate weightedAverageLiquidity) {
		this.weightedAverageLiquidity = weightedAverageLiquidity;
	}

	@XmlElement(name = "OutMainCtryIndx", required = true)
	public ActiveCurrencyAndAmount getOutMainCountryIndex() {
		return outMainCountryIndex;
	}

	public void setOutMainCountryIndex(ActiveCurrencyAndAmount outMainCountryIndex) {
		this.outMainCountryIndex = outMainCountryIndex;
	}

	@XmlElement(name = "CrossPct")
	public PercentageRate getCrossPercent() {
		return crossPercent;
	}

	public void setCrossPercent(PercentageRate crossPercent) {
		this.crossPercent = crossPercent;
	}

	@XmlElement(name = "SdVal1")
	public ActiveCurrencyAndAmount getSideValue1() {
		return sideValue1;
	}

	public void setSideValue1(ActiveCurrencyAndAmount sideValue1) {
		this.sideValue1 = sideValue1;
	}

	@XmlElement(name = "SdVal2")
	public ActiveCurrencyAndAmount getSideValue2() {
		return sideValue2;
	}

	public void setSideValue2(ActiveCurrencyAndAmount sideValue2) {
		this.sideValue2 = sideValue2;
	}
}