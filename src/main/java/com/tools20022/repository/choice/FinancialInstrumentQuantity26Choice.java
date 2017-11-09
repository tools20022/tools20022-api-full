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
import com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount;
import com.tools20022.repository.datatype.DecimalNumber;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.InvestmentFundOrder;
import com.tools20022.repository.entity.SwitchSubscriptionLeg;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Choice between formats for the specification of the number of units, amount
 * of money or percentage.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity26Choice#mmUnitsNumber
 * FinancialInstrumentQuantity26Choice.mmUnitsNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity26Choice#mmPercentageOfTotalRedemptionAmount
 * FinancialInstrumentQuantity26Choice.mmPercentageOfTotalRedemptionAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity26Choice#mmNetAmount
 * FinancialInstrumentQuantity26Choice.mmNetAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity26Choice#mmGrossAmount
 * FinancialInstrumentQuantity26Choice.mmGrossAmount}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.InvestmentFundOrder
 * InvestmentFundOrder}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FinancialInstrumentQuantity26Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice between formats for the specification of the number of units, amount of money or percentage."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity6Choice
 * FinancialInstrumentQuantity6Choice}</li>
 * </ul>
 */
public class FinancialInstrumentQuantity26Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected DecimalNumber unitsNumber;
	/**
	 * Number of investment fund units to be subscribed.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmUnitsNumber
	 * InvestmentFundOrder.mmUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity26Choice
	 * FinancialInstrumentQuantity26Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UnitsNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnitsNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of investment fund units to be subscribed."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity6Choice#mmUnitsNumber
	 * FinancialInstrumentQuantity6Choice.mmUnitsNumber}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmUnitsNumber = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrder.mmUnitsNumber;
			componentContext_lazy = () -> FinancialInstrumentQuantity26Choice.mmObject();
			isDerived = false;
			xmlTag = "UnitsNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnitsNumber";
			definition = "Number of investment fund units to be subscribed.";
			previousVersion_lazy = () -> FinancialInstrumentQuantity6Choice.mmUnitsNumber;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	protected PercentageRate percentageOfTotalRedemptionAmount;
	/**
	 * Percentage of the total redemption amount used for the subscription in an
	 * investment fund or investment fund class.
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
	 * {@linkplain com.tools20022.repository.entity.SwitchSubscriptionLeg#mmPercentageOfTotalRedemptionAmount
	 * SwitchSubscriptionLeg.mmPercentageOfTotalRedemptionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity26Choice
	 * FinancialInstrumentQuantity26Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PctgOfTtlRedAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PercentageOfTotalRedemptionAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Percentage of the total redemption amount used for the subscription in an investment fund or investment fund class."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity6Choice#mmPercentageOfTotalRedemptionAmount
	 * FinancialInstrumentQuantity6Choice.mmPercentageOfTotalRedemptionAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPercentageOfTotalRedemptionAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SwitchSubscriptionLeg.mmPercentageOfTotalRedemptionAmount;
			componentContext_lazy = () -> FinancialInstrumentQuantity26Choice.mmObject();
			isDerived = false;
			xmlTag = "PctgOfTtlRedAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PercentageOfTotalRedemptionAmount";
			definition = "Percentage of the total redemption amount used for the subscription in an investment fund or investment fund class.";
			previousVersion_lazy = () -> FinancialInstrumentQuantity6Choice.mmPercentageOfTotalRedemptionAmount;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	protected ActiveOrHistoricCurrencyAndAmount netAmount;
	/**
	 * Amount of money to be invested in the fund. <br>
	 * Net Amount = Quantity * Price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount
	 * ActiveOrHistoricCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmNetAmount
	 * InvestmentFundOrder.mmNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity26Choice
	 * FinancialInstrumentQuantity26Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NetAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money to be invested in the fund. \r\nNet Amount = Quantity * Price."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity6Choice#mmNetAmount
	 * FinancialInstrumentQuantity6Choice.mmNetAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNetAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrder.mmNetAmount;
			componentContext_lazy = () -> FinancialInstrumentQuantity26Choice.mmObject();
			isDerived = false;
			xmlTag = "NetAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetAmount";
			definition = "Amount of money to be invested in the fund. \r\nNet Amount = Quantity * Price.";
			previousVersion_lazy = () -> FinancialInstrumentQuantity6Choice.mmNetAmount;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}
	};
	protected ActiveOrHistoricCurrencyAndAmount grossAmount;
	/**
	 * Amount of money to be paid by the investor when subscribing to fund
	 * units. <br>
	 * Gross amount = (Quantity * Price) + (Fees + Taxes).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount
	 * ActiveOrHistoricCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmGrossAmount
	 * InvestmentFundOrder.mmGrossAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity26Choice
	 * FinancialInstrumentQuantity26Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GrssAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money to be paid by the investor when subscribing to fund units. \r\nGross amount = (Quantity * Price) + (Fees + Taxes). "
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity6Choice#mmGrossAmount
	 * FinancialInstrumentQuantity6Choice.mmGrossAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmGrossAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrder.mmGrossAmount;
			componentContext_lazy = () -> FinancialInstrumentQuantity26Choice.mmObject();
			isDerived = false;
			xmlTag = "GrssAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossAmount";
			definition = "Amount of money to be paid by the investor when subscribing to fund units. \r\nGross amount = (Quantity * Price) + (Fees + Taxes). ";
			previousVersion_lazy = () -> FinancialInstrumentQuantity6Choice.mmGrossAmount;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(FinancialInstrumentQuantity26Choice.mmUnitsNumber, FinancialInstrumentQuantity26Choice.mmPercentageOfTotalRedemptionAmount, FinancialInstrumentQuantity26Choice.mmNetAmount,
						FinancialInstrumentQuantity26Choice.mmGrossAmount);
				trace_lazy = () -> InvestmentFundOrder.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FinancialInstrumentQuantity26Choice";
				definition = "Choice between formats for the specification of the number of units, amount of money or percentage.";
				previousVersion_lazy = () -> FinancialInstrumentQuantity6Choice.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public DecimalNumber getUnitsNumber() {
		return unitsNumber;
	}

	public void setUnitsNumber(DecimalNumber unitsNumber) {
		this.unitsNumber = unitsNumber;
	}

	public PercentageRate getPercentageOfTotalRedemptionAmount() {
		return percentageOfTotalRedemptionAmount;
	}

	public void setPercentageOfTotalRedemptionAmount(PercentageRate percentageOfTotalRedemptionAmount) {
		this.percentageOfTotalRedemptionAmount = percentageOfTotalRedemptionAmount;
	}

	public ActiveOrHistoricCurrencyAndAmount getNetAmount() {
		return netAmount;
	}

	public void setNetAmount(ActiveOrHistoricCurrencyAndAmount netAmount) {
		this.netAmount = netAmount;
	}

	public ActiveOrHistoricCurrencyAndAmount getGrossAmount() {
		return grossAmount;
	}

	public void setGrossAmount(ActiveOrHistoricCurrencyAndAmount grossAmount) {
		this.grossAmount = grossAmount;
	}
}