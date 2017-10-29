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

package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.entity.InvestmentFundOrder;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Transfer from one investment fund/fund class to another investment fund or
 * investment fund class by the investor. A switch is composed of one or several
 * subscription legs, and one or several redemption legs.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SwitchOrder" src="doc-files/SwitchOrder.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SwitchOrder#AdditionalCashIn
 * SwitchOrder.AdditionalCashIn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SwitchOrder#ResultingCashOut
 * SwitchOrder.ResultingCashOut}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SwitchOrder#TotalRedemptionAmount
 * SwitchOrder.TotalRedemptionAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SwitchOrder#TotalSubscriptionAmount
 * SwitchOrder.TotalSubscriptionAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SwitchOrder#RedemptionLeg
 * SwitchOrder.RedemptionLeg}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SwitchOrder#SubscriptionLeg
 * SwitchOrder.SubscriptionLeg}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SwitchRedemptionLeg#RedemptionRelatedSwitchOrder
 * SwitchRedemptionLeg.RedemptionRelatedSwitchOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SwitchSubscriptionLeg#SubscriptionRelatedSwitchOrder
 * SwitchSubscriptionLeg.SubscriptionRelatedSwitchOrder}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwitchOrderStatusAndReason1#OrderData
 * SwitchOrderStatusAndReason1.OrderData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwitchOrderInstruction1#SwitchOrderDetails
 * SwitchOrderInstruction1.SwitchOrderDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwitchOrderInstruction2#SwitchOrderDetails
 * SwitchOrderInstruction2.SwitchOrderDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SubscriptionOrRedemptionOrSwitchOrderDataChoice#SwitchDetails
 * SubscriptionOrRedemptionOrSwitchOrderDataChoice.SwitchDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwitchOrderStatusAndReason2#OrderData
 * SwitchOrderStatusAndReason2.OrderData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder
 * InvestmentFundOrder}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.FundOrderData2 FundOrderData2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SwitchOrderStatusAndReason1
 * SwitchOrderStatusAndReason1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SwitchOrder2 SwitchOrder2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SwitchOrderInstruction1
 * SwitchOrderInstruction1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SwitchOrder3 SwitchOrder3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SwitchOrderInstruction2
 * SwitchOrderInstruction2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SwitchOrder4 SwitchOrder4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SwitchOrder5 SwitchOrder5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SwitchOrder7 SwitchOrder7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SwitchOrderStatusAndReason2
 * SwitchOrderStatusAndReason2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FundOrderData6 FundOrderData6}</li>
 * </ul>
 * </li>
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
 * "SwitchOrder"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Transfer from one investment fund/fund class to another investment fund or investment fund class by the investor. A switch is composed of one or several subscription legs, and one or several redemption legs."
 * </li>
 * </ul>
 */
public class SwitchOrder extends InvestmentFundOrder {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Additional amount of money paid by the investor in addition to the switch
	 * redemption amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundOrderData2#AdditionalCashIn
	 * FundOrderData2.AdditionalCashIn}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder2#AdditionalCashIn
	 * SwitchOrder2.AdditionalCashIn}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder3#AdditionalCashIn
	 * SwitchOrder3.AdditionalCashIn}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution3#AdditionalCashIn
	 * SwitchExecution3.AdditionalCashIn}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution4#AdditionalCashIn
	 * SwitchExecution4.AdditionalCashIn}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder4#AdditionalCashIn
	 * SwitchOrder4.AdditionalCashIn}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution7#AdditionalAmount
	 * SwitchExecution7.AdditionalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder7#AdditionalAmount
	 * SwitchOrder7.AdditionalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AdditionalAmount1Choice#AdditionalCashIn
	 * AdditionalAmount1Choice.AdditionalCashIn}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundOrderData6#AdditionalAmount
	 * FundOrderData6.AdditionalAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SwitchOrder SwitchOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalCashIn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional amount of money paid by the investor in addition to the switch redemption amount."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute AdditionalCashIn = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FundOrderData2.AdditionalCashIn, com.tools20022.repository.msg.SwitchOrder2.AdditionalCashIn, com.tools20022.repository.msg.SwitchOrder3.AdditionalCashIn,
					com.tools20022.repository.msg.SwitchExecution3.AdditionalCashIn, com.tools20022.repository.msg.SwitchExecution4.AdditionalCashIn, com.tools20022.repository.msg.SwitchOrder4.AdditionalCashIn,
					com.tools20022.repository.msg.SwitchExecution7.AdditionalAmount, com.tools20022.repository.msg.SwitchOrder7.AdditionalAmount, com.tools20022.repository.choice.AdditionalAmount1Choice.AdditionalCashIn,
					com.tools20022.repository.msg.FundOrderData6.AdditionalAmount);
			elementContext_lazy = () -> SwitchOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AdditionalCashIn";
			definition = "Additional amount of money paid by the investor in addition to the switch redemption amount.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Amount of money that results from a switch-out, that is not reinvested in
	 * another investment fund, and is repaid to the investor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundOrderData2#ResultingCashOut
	 * FundOrderData2.ResultingCashOut}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder2#ResultingCashOut
	 * SwitchOrder2.ResultingCashOut}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder3#ResultingCashOut
	 * SwitchOrder3.ResultingCashOut}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution3#ResultingCashOut
	 * SwitchExecution3.ResultingCashOut}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution4#ResultingCashOut
	 * SwitchExecution4.ResultingCashOut}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder4#ResultingCashOut
	 * SwitchOrder4.ResultingCashOut}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AdditionalAmount1Choice#ResultingCashOut
	 * AdditionalAmount1Choice.ResultingCashOut}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SwitchOrder SwitchOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResultingCashOut"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money that results from a switch-out, that is not reinvested in another investment fund, and is repaid to the investor."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ResultingCashOut = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FundOrderData2.ResultingCashOut, com.tools20022.repository.msg.SwitchOrder2.ResultingCashOut, com.tools20022.repository.msg.SwitchOrder3.ResultingCashOut,
					com.tools20022.repository.msg.SwitchExecution3.ResultingCashOut, com.tools20022.repository.msg.SwitchExecution4.ResultingCashOut, com.tools20022.repository.msg.SwitchOrder4.ResultingCashOut,
					com.tools20022.repository.choice.AdditionalAmount1Choice.ResultingCashOut);
			elementContext_lazy = () -> SwitchOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ResultingCashOut";
			definition = "Amount of money that results from a switch-out, that is not reinvested in another investment fund, and is repaid to the investor.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Amount of money used to derive the quantity of investment fund units to
	 * be redeemed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundOrderData2#TotalRedemptionAmount
	 * FundOrderData2.TotalRedemptionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder2#TotalRedemptionAmount
	 * SwitchOrder2.TotalRedemptionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder3#TotalRedemptionAmount
	 * SwitchOrder3.TotalRedemptionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution3#TotalRedemptionAmount
	 * SwitchExecution3.TotalRedemptionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution4#TotalRedemptionAmount
	 * SwitchExecution4.TotalRedemptionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder4#TotalRedemptionAmount
	 * SwitchOrder4.TotalRedemptionAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SwitchOrder SwitchOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalRedemptionAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money used to derive the quantity of investment fund units to be redeemed."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TotalRedemptionAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FundOrderData2.TotalRedemptionAmount, com.tools20022.repository.msg.SwitchOrder2.TotalRedemptionAmount,
					com.tools20022.repository.msg.SwitchOrder3.TotalRedemptionAmount, com.tools20022.repository.msg.SwitchExecution3.TotalRedemptionAmount, com.tools20022.repository.msg.SwitchExecution4.TotalRedemptionAmount,
					com.tools20022.repository.msg.SwitchOrder4.TotalRedemptionAmount);
			elementContext_lazy = () -> SwitchOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TotalRedemptionAmount";
			definition = "Amount of money used to derive the quantity of investment fund units to be redeemed.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Amount of money used to derive the quantity of investment fund units to
	 * be subscribed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundOrderData2#TotalSubscriptionAmount
	 * FundOrderData2.TotalSubscriptionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder2#TotalSubscriptionAmount
	 * SwitchOrder2.TotalSubscriptionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder3#TotalSubscriptionAmount
	 * SwitchOrder3.TotalSubscriptionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution3#TotalSubscriptionAmount
	 * SwitchExecution3.TotalSubscriptionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution4#TotalSubscriptionAmount
	 * SwitchExecution4.TotalSubscriptionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder4#TotalSubscriptionAmount
	 * SwitchOrder4.TotalSubscriptionAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SwitchOrder SwitchOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalSubscriptionAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money used to derive the quantity of investment fund units to be subscribed."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TotalSubscriptionAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FundOrderData2.TotalSubscriptionAmount, com.tools20022.repository.msg.SwitchOrder2.TotalSubscriptionAmount,
					com.tools20022.repository.msg.SwitchOrder3.TotalSubscriptionAmount, com.tools20022.repository.msg.SwitchExecution3.TotalSubscriptionAmount, com.tools20022.repository.msg.SwitchExecution4.TotalSubscriptionAmount,
					com.tools20022.repository.msg.SwitchOrder4.TotalSubscriptionAmount);
			elementContext_lazy = () -> SwitchOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TotalSubscriptionAmount";
			definition = "Amount of money used to derive the quantity of investment fund units to be subscribed.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Part of an investment fund switch order that is a redemption.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SwitchRedemptionLeg#RedemptionRelatedSwitchOrder
	 * SwitchRedemptionLeg.RedemptionRelatedSwitchOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SwitchRedemptionLeg
	 * SwitchRedemptionLeg}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder2#RedemptionLegDetails
	 * SwitchOrder2.RedemptionLegDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder3#RedemptionLegDetails
	 * SwitchOrder3.RedemptionLegDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder4#RedemptionLegDetails
	 * SwitchOrder4.RedemptionLegDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SwitchOrder5#RedemptionLeg
	 * SwitchOrder5.RedemptionLeg}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder7#RedemptionLegDetails
	 * SwitchOrder7.RedemptionLegDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SwitchOrder SwitchOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RedemptionLeg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Part of an investment fund switch order that is a redemption."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RedemptionLeg = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SwitchOrder2.RedemptionLegDetails, com.tools20022.repository.msg.SwitchOrder3.RedemptionLegDetails,
					com.tools20022.repository.msg.SwitchOrder4.RedemptionLegDetails, com.tools20022.repository.msg.SwitchOrder5.RedemptionLeg, com.tools20022.repository.msg.SwitchOrder7.RedemptionLegDetails);
			elementContext_lazy = () -> SwitchOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RedemptionLeg";
			definition = "Part of an investment fund switch order that is a redemption.";
			minOccurs = 1;
			type_lazy = () -> SwitchRedemptionLeg.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SwitchRedemptionLeg.RedemptionRelatedSwitchOrder;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Part of an investment fund switch order that is a subscription.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SwitchSubscriptionLeg#SubscriptionRelatedSwitchOrder
	 * SwitchSubscriptionLeg.SubscriptionRelatedSwitchOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SwitchSubscriptionLeg
	 * SwitchSubscriptionLeg}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder2#SubscriptionLegDetails
	 * SwitchOrder2.SubscriptionLegDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder3#SubscriptionLegDetails
	 * SwitchOrder3.SubscriptionLegDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder4#SubscriptionLegDetails
	 * SwitchOrder4.SubscriptionLegDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder5#SubscriptionLeg
	 * SwitchOrder5.SubscriptionLeg}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder7#SubscriptionLegDetails
	 * SwitchOrder7.SubscriptionLegDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SwitchOrder SwitchOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubscriptionLeg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Part of an investment fund switch order that is a subscription."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SubscriptionLeg = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SwitchOrder2.SubscriptionLegDetails, com.tools20022.repository.msg.SwitchOrder3.SubscriptionLegDetails,
					com.tools20022.repository.msg.SwitchOrder4.SubscriptionLegDetails, com.tools20022.repository.msg.SwitchOrder5.SubscriptionLeg, com.tools20022.repository.msg.SwitchOrder7.SubscriptionLegDetails);
			elementContext_lazy = () -> SwitchOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SubscriptionLeg";
			definition = "Part of an investment fund switch order that is a subscription.";
			minOccurs = 1;
			type_lazy = () -> SwitchSubscriptionLeg.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SwitchSubscriptionLeg.SubscriptionRelatedSwitchOrder;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SwitchOrder";
				definition = "Transfer from one investment fund/fund class to another investment fund or investment fund class by the investor. A switch is composed of one or several subscription legs, and one or several redemption legs.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SwitchRedemptionLeg.RedemptionRelatedSwitchOrder, com.tools20022.repository.entity.SwitchSubscriptionLeg.SubscriptionRelatedSwitchOrder);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SwitchOrderStatusAndReason1.OrderData, com.tools20022.repository.msg.SwitchOrderInstruction1.SwitchOrderDetails,
						com.tools20022.repository.msg.SwitchOrderInstruction2.SwitchOrderDetails, com.tools20022.repository.choice.SubscriptionOrRedemptionOrSwitchOrderDataChoice.SwitchDetails,
						com.tools20022.repository.msg.SwitchOrderStatusAndReason2.OrderData);
				superType_lazy = () -> InvestmentFundOrder.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SwitchOrder.AdditionalCashIn, com.tools20022.repository.entity.SwitchOrder.ResultingCashOut,
						com.tools20022.repository.entity.SwitchOrder.TotalRedemptionAmount, com.tools20022.repository.entity.SwitchOrder.TotalSubscriptionAmount, com.tools20022.repository.entity.SwitchOrder.RedemptionLeg,
						com.tools20022.repository.entity.SwitchOrder.SubscriptionLeg);
				derivationComponent_lazy = () -> Arrays.asList(FundOrderData2.mmObject(), SwitchOrderStatusAndReason1.mmObject(), SwitchOrder2.mmObject(), SwitchOrderInstruction1.mmObject(), SwitchOrder3.mmObject(),
						SwitchOrderInstruction2.mmObject(), SwitchOrder4.mmObject(), SwitchOrder5.mmObject(), SwitchOrder7.mmObject(), SwitchOrderStatusAndReason2.mmObject(), FundOrderData6.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}