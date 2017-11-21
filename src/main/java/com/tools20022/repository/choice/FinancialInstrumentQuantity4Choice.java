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
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.InvestmentFundOrder;
import com.tools20022.repository.entity.SwitchSubscriptionLeg;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.FinancialInstrumentQuantity1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice between ways to express the quantity of the financial instrument to be
 * subscribed.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity4Choice#mmUnitsNumber
 * FinancialInstrumentQuantity4Choice.mmUnitsNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity4Choice#mmPercentageOfTotalRedemptionAmount
 * FinancialInstrumentQuantity4Choice.mmPercentageOfTotalRedemptionAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity4Choice#mmNetAmount
 * FinancialInstrumentQuantity4Choice.mmNetAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity4Choice#mmGrossAmount
 * FinancialInstrumentQuantity4Choice.mmGrossAmount}</li>
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
 * "FinancialInstrumentQuantity4Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice between ways to express the quantity of the financial instrument to be subscribed."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "FinancialInstrumentQuantity4Choice", propOrder = {"unitsNumber", "percentageOfTotalRedemptionAmount", "netAmount", "grossAmount"})
public class FinancialInstrumentQuantity4Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected FinancialInstrumentQuantity1 unitsNumber;
	/**
	 * Quantity of investment fund units to be subscribed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentQuantity1
	 * FinancialInstrumentQuantity1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmUnitsNumber
	 * InvestmentFundOrder.mmUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity4Choice
	 * FinancialInstrumentQuantity4Choice}</li>
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
	 * definition} = "Quantity of investment fund units to be subscribed."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmUnitsNumber = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrder.mmUnitsNumber;
			componentContext_lazy = () -> FinancialInstrumentQuantity4Choice.mmObject();
			isDerived = false;
			xmlTag = "UnitsNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnitsNumber";
			definition = "Quantity of investment fund units to be subscribed.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> FinancialInstrumentQuantity1.mmObject();
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
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity4Choice
	 * FinancialInstrumentQuantity4Choice}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmPercentageOfTotalRedemptionAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SwitchSubscriptionLeg.mmPercentageOfTotalRedemptionAmount;
			componentContext_lazy = () -> FinancialInstrumentQuantity4Choice.mmObject();
			isDerived = false;
			xmlTag = "PctgOfTtlRedAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PercentageOfTotalRedemptionAmount";
			definition = "Percentage of the total redemption amount used for the subscription in an investment fund or investment fund class.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	protected CurrencyAndAmount netAmount;
	/**
	 * Amount of money used to determine the quantity of investment fund units
	 * to be subscribed.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmNetAmount
	 * InvestmentFundOrder.mmNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity4Choice
	 * FinancialInstrumentQuantity4Choice}</li>
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
	 * "Amount of money used to determine the quantity of investment fund units to be subscribed."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNetAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrder.mmNetAmount;
			componentContext_lazy = () -> FinancialInstrumentQuantity4Choice.mmObject();
			isDerived = false;
			xmlTag = "NetAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetAmount";
			definition = "Amount of money used to determine the quantity of investment fund units to be subscribed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount grossAmount;
	/**
	 * Amount of money used to determine the quantity of investment fund units
	 * to be subscribed, including all charges, commissions, and tax.
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmGrossAmount
	 * InvestmentFundOrder.mmGrossAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity4Choice
	 * FinancialInstrumentQuantity4Choice}</li>
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
	 * "Amount of money used to determine the quantity of investment fund units to be subscribed, including all charges, commissions, and tax."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmGrossAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrder.mmGrossAmount;
			componentContext_lazy = () -> FinancialInstrumentQuantity4Choice.mmObject();
			isDerived = false;
			xmlTag = "GrssAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossAmount";
			definition = "Amount of money used to determine the quantity of investment fund units to be subscribed, including all charges, commissions, and tax.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(FinancialInstrumentQuantity4Choice.mmUnitsNumber, FinancialInstrumentQuantity4Choice.mmPercentageOfTotalRedemptionAmount, FinancialInstrumentQuantity4Choice.mmNetAmount,
						FinancialInstrumentQuantity4Choice.mmGrossAmount);
				trace_lazy = () -> InvestmentFundOrder.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FinancialInstrumentQuantity4Choice";
				definition = "Choice between ways to express the quantity of the financial instrument to be subscribed.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "UnitsNb", required = true)
	public FinancialInstrumentQuantity1 getUnitsNumber() {
		return unitsNumber;
	}

	public void setUnitsNumber(FinancialInstrumentQuantity1 unitsNumber) {
		this.unitsNumber = unitsNumber;
	}

	@XmlElement(name = "PctgOfTtlRedAmt", required = true)
	public PercentageRate getPercentageOfTotalRedemptionAmount() {
		return percentageOfTotalRedemptionAmount;
	}

	public void setPercentageOfTotalRedemptionAmount(PercentageRate percentageOfTotalRedemptionAmount) {
		this.percentageOfTotalRedemptionAmount = percentageOfTotalRedemptionAmount;
	}

	@XmlElement(name = "NetAmt", required = true)
	public CurrencyAndAmount getNetAmount() {
		return netAmount;
	}

	public void setNetAmount(CurrencyAndAmount netAmount) {
		this.netAmount = netAmount;
	}

	@XmlElement(name = "GrssAmt", required = true)
	public ActiveCurrencyAndAmount getGrossAmount() {
		return grossAmount;
	}

	public void setGrossAmount(ActiveCurrencyAndAmount grossAmount) {
		this.grossAmount = grossAmount;
	}
}