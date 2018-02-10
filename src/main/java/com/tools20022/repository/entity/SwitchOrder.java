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

import com.tools20022.metamodel.*;
import com.tools20022.repository.choice.AdditionalAmount1Choice;
import com.tools20022.repository.choice.SubscriptionOrRedemptionOrSwitchOrderDataChoice;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.entity.InvestmentFundOrder;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;

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
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder
 * InvestmentFundOrder}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SwitchOrder#mmAdditionalCashIn
 * SwitchOrder.mmAdditionalCashIn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SwitchOrder#mmResultingCashOut
 * SwitchOrder.mmResultingCashOut}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SwitchOrder#mmTotalRedemptionAmount
 * SwitchOrder.mmTotalRedemptionAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SwitchOrder#mmTotalSubscriptionAmount
 * SwitchOrder.mmTotalSubscriptionAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SwitchOrder#mmRedemptionLeg
 * SwitchOrder.mmRedemptionLeg}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SwitchOrder#mmSubscriptionLeg
 * SwitchOrder.mmSubscriptionLeg}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SwitchRedemptionLeg#mmRedemptionRelatedSwitchOrder
 * SwitchRedemptionLeg.mmRedemptionRelatedSwitchOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SwitchSubscriptionLeg#mmSubscriptionRelatedSwitchOrder
 * SwitchSubscriptionLeg.mmSubscriptionRelatedSwitchOrder}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwitchOrderStatusAndReason1#mmOrderData
 * SwitchOrderStatusAndReason1.mmOrderData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwitchOrderInstruction1#mmSwitchOrderDetails
 * SwitchOrderInstruction1.mmSwitchOrderDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwitchOrderInstruction2#mmSwitchOrderDetails
 * SwitchOrderInstruction2.mmSwitchOrderDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SubscriptionOrRedemptionOrSwitchOrderDataChoice#mmSwitchDetails
 * SubscriptionOrRedemptionOrSwitchOrderDataChoice.mmSwitchDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwitchOrderStatusAndReason2#mmOrderData
 * SwitchOrderStatusAndReason2.mmOrderData}</li>
 * </ul>
 * </li>
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
	protected CurrencyAndAmount additionalCashIn;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.FundOrderData2#mmAdditionalCashIn
	 * FundOrderData2.mmAdditionalCashIn}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder2#mmAdditionalCashIn
	 * SwitchOrder2.mmAdditionalCashIn}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder3#mmAdditionalCashIn
	 * SwitchOrder3.mmAdditionalCashIn}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution3#mmAdditionalCashIn
	 * SwitchExecution3.mmAdditionalCashIn}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution4#mmAdditionalCashIn
	 * SwitchExecution4.mmAdditionalCashIn}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder4#mmAdditionalCashIn
	 * SwitchOrder4.mmAdditionalCashIn}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution7#mmAdditionalAmount
	 * SwitchExecution7.mmAdditionalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder7#mmAdditionalAmount
	 * SwitchOrder7.mmAdditionalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AdditionalAmount1Choice#mmAdditionalCashIn
	 * AdditionalAmount1Choice.mmAdditionalCashIn}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundOrderData6#mmAdditionalAmount
	 * FundOrderData6.mmAdditionalAmount}</li>
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
	public static final MMBusinessAttribute mmAdditionalCashIn = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(FundOrderData2.mmAdditionalCashIn, SwitchOrder2.mmAdditionalCashIn, SwitchOrder3.mmAdditionalCashIn, SwitchExecution3.mmAdditionalCashIn, SwitchExecution4.mmAdditionalCashIn,
					SwitchOrder4.mmAdditionalCashIn, SwitchExecution7.mmAdditionalAmount, SwitchOrder7.mmAdditionalAmount, AdditionalAmount1Choice.mmAdditionalCashIn, FundOrderData6.mmAdditionalAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SwitchOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AdditionalCashIn";
			definition = "Additional amount of money paid by the investor in addition to the switch redemption amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SwitchOrder.class.getMethod("getAdditionalCashIn", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyAndAmount resultingCashOut;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.FundOrderData2#mmResultingCashOut
	 * FundOrderData2.mmResultingCashOut}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder2#mmResultingCashOut
	 * SwitchOrder2.mmResultingCashOut}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder3#mmResultingCashOut
	 * SwitchOrder3.mmResultingCashOut}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution3#mmResultingCashOut
	 * SwitchExecution3.mmResultingCashOut}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution4#mmResultingCashOut
	 * SwitchExecution4.mmResultingCashOut}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder4#mmResultingCashOut
	 * SwitchOrder4.mmResultingCashOut}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AdditionalAmount1Choice#mmResultingCashOut
	 * AdditionalAmount1Choice.mmResultingCashOut}</li>
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
	public static final MMBusinessAttribute mmResultingCashOut = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(FundOrderData2.mmResultingCashOut, SwitchOrder2.mmResultingCashOut, SwitchOrder3.mmResultingCashOut, SwitchExecution3.mmResultingCashOut, SwitchExecution4.mmResultingCashOut,
					SwitchOrder4.mmResultingCashOut, AdditionalAmount1Choice.mmResultingCashOut);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SwitchOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ResultingCashOut";
			definition = "Amount of money that results from a switch-out, that is not reinvested in another investment fund, and is repaid to the investor.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SwitchOrder.class.getMethod("getResultingCashOut", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyAndAmount totalRedemptionAmount;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.FundOrderData2#mmTotalRedemptionAmount
	 * FundOrderData2.mmTotalRedemptionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder2#mmTotalRedemptionAmount
	 * SwitchOrder2.mmTotalRedemptionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder3#mmTotalRedemptionAmount
	 * SwitchOrder3.mmTotalRedemptionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution3#mmTotalRedemptionAmount
	 * SwitchExecution3.mmTotalRedemptionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution4#mmTotalRedemptionAmount
	 * SwitchExecution4.mmTotalRedemptionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder4#mmTotalRedemptionAmount
	 * SwitchOrder4.mmTotalRedemptionAmount}</li>
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
	public static final MMBusinessAttribute mmTotalRedemptionAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(FundOrderData2.mmTotalRedemptionAmount, SwitchOrder2.mmTotalRedemptionAmount, SwitchOrder3.mmTotalRedemptionAmount, SwitchExecution3.mmTotalRedemptionAmount,
					SwitchExecution4.mmTotalRedemptionAmount, SwitchOrder4.mmTotalRedemptionAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SwitchOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TotalRedemptionAmount";
			definition = "Amount of money used to derive the quantity of investment fund units to be redeemed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SwitchOrder.class.getMethod("getTotalRedemptionAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyAndAmount totalSubscriptionAmount;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.FundOrderData2#mmTotalSubscriptionAmount
	 * FundOrderData2.mmTotalSubscriptionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder2#mmTotalSubscriptionAmount
	 * SwitchOrder2.mmTotalSubscriptionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder3#mmTotalSubscriptionAmount
	 * SwitchOrder3.mmTotalSubscriptionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution3#mmTotalSubscriptionAmount
	 * SwitchExecution3.mmTotalSubscriptionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution4#mmTotalSubscriptionAmount
	 * SwitchExecution4.mmTotalSubscriptionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder4#mmTotalSubscriptionAmount
	 * SwitchOrder4.mmTotalSubscriptionAmount}</li>
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
	public static final MMBusinessAttribute mmTotalSubscriptionAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(FundOrderData2.mmTotalSubscriptionAmount, SwitchOrder2.mmTotalSubscriptionAmount, SwitchOrder3.mmTotalSubscriptionAmount, SwitchExecution3.mmTotalSubscriptionAmount,
					SwitchExecution4.mmTotalSubscriptionAmount, SwitchOrder4.mmTotalSubscriptionAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SwitchOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TotalSubscriptionAmount";
			definition = "Amount of money used to derive the quantity of investment fund units to be subscribed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SwitchOrder.class.getMethod("getTotalSubscriptionAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.SwitchRedemptionLeg> redemptionLeg;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SwitchRedemptionLeg#mmRedemptionRelatedSwitchOrder
	 * SwitchRedemptionLeg.mmRedemptionRelatedSwitchOrder}</li>
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
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder2#mmRedemptionLegDetails
	 * SwitchOrder2.mmRedemptionLegDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder3#mmRedemptionLegDetails
	 * SwitchOrder3.mmRedemptionLegDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder4#mmRedemptionLegDetails
	 * SwitchOrder4.mmRedemptionLegDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder5#mmRedemptionLeg
	 * SwitchOrder5.mmRedemptionLeg}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder7#mmRedemptionLegDetails
	 * SwitchOrder7.mmRedemptionLegDetails}</li>
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
	public static final MMBusinessAssociationEnd mmRedemptionLeg = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(SwitchOrder2.mmRedemptionLegDetails, SwitchOrder3.mmRedemptionLegDetails, SwitchOrder4.mmRedemptionLegDetails, SwitchOrder5.mmRedemptionLeg, SwitchOrder7.mmRedemptionLegDetails);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SwitchOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RedemptionLeg";
			definition = "Part of an investment fund switch order that is a redemption.";
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SwitchRedemptionLeg.mmRedemptionRelatedSwitchOrder;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SwitchRedemptionLeg.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.SwitchSubscriptionLeg> subscriptionLeg;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SwitchSubscriptionLeg#mmSubscriptionRelatedSwitchOrder
	 * SwitchSubscriptionLeg.mmSubscriptionRelatedSwitchOrder}</li>
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
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder2#mmSubscriptionLegDetails
	 * SwitchOrder2.mmSubscriptionLegDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder3#mmSubscriptionLegDetails
	 * SwitchOrder3.mmSubscriptionLegDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder4#mmSubscriptionLegDetails
	 * SwitchOrder4.mmSubscriptionLegDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder5#mmSubscriptionLeg
	 * SwitchOrder5.mmSubscriptionLeg}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder7#mmSubscriptionLegDetails
	 * SwitchOrder7.mmSubscriptionLegDetails}</li>
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
	public static final MMBusinessAssociationEnd mmSubscriptionLeg = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(SwitchOrder2.mmSubscriptionLegDetails, SwitchOrder3.mmSubscriptionLegDetails, SwitchOrder4.mmSubscriptionLegDetails, SwitchOrder5.mmSubscriptionLeg, SwitchOrder7.mmSubscriptionLegDetails);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SwitchOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SubscriptionLeg";
			definition = "Part of an investment fund switch order that is a subscription.";
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SwitchSubscriptionLeg.mmSubscriptionRelatedSwitchOrder;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SwitchSubscriptionLeg.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SwitchOrder";
				definition = "Transfer from one investment fund/fund class to another investment fund or investment fund class by the investor. A switch is composed of one or several subscription legs, and one or several redemption legs.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SwitchRedemptionLeg.mmRedemptionRelatedSwitchOrder, com.tools20022.repository.entity.SwitchSubscriptionLeg.mmSubscriptionRelatedSwitchOrder);
				derivationElement_lazy = () -> Arrays.asList(SwitchOrderStatusAndReason1.mmOrderData, SwitchOrderInstruction1.mmSwitchOrderDetails, SwitchOrderInstruction2.mmSwitchOrderDetails,
						SubscriptionOrRedemptionOrSwitchOrderDataChoice.mmSwitchDetails, SwitchOrderStatusAndReason2.mmOrderData);
				superType_lazy = () -> InvestmentFundOrder.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SwitchOrder.mmAdditionalCashIn, com.tools20022.repository.entity.SwitchOrder.mmResultingCashOut,
						com.tools20022.repository.entity.SwitchOrder.mmTotalRedemptionAmount, com.tools20022.repository.entity.SwitchOrder.mmTotalSubscriptionAmount, com.tools20022.repository.entity.SwitchOrder.mmRedemptionLeg,
						com.tools20022.repository.entity.SwitchOrder.mmSubscriptionLeg);
				derivationComponent_lazy = () -> Arrays.asList(FundOrderData2.mmObject(), SwitchOrderStatusAndReason1.mmObject(), SwitchOrder2.mmObject(), SwitchOrderInstruction1.mmObject(), SwitchOrder3.mmObject(),
						SwitchOrderInstruction2.mmObject(), SwitchOrder4.mmObject(), SwitchOrder5.mmObject(), SwitchOrder7.mmObject(), SwitchOrderStatusAndReason2.mmObject(), FundOrderData6.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return SwitchOrder.class;
			}
		});
		return mmObject_lazy.get();
	}

	public CurrencyAndAmount getAdditionalCashIn() {
		return additionalCashIn;
	}

	public SwitchOrder setAdditionalCashIn(CurrencyAndAmount additionalCashIn) {
		this.additionalCashIn = Objects.requireNonNull(additionalCashIn);
		return this;
	}

	public CurrencyAndAmount getResultingCashOut() {
		return resultingCashOut;
	}

	public SwitchOrder setResultingCashOut(CurrencyAndAmount resultingCashOut) {
		this.resultingCashOut = Objects.requireNonNull(resultingCashOut);
		return this;
	}

	public CurrencyAndAmount getTotalRedemptionAmount() {
		return totalRedemptionAmount;
	}

	public SwitchOrder setTotalRedemptionAmount(CurrencyAndAmount totalRedemptionAmount) {
		this.totalRedemptionAmount = Objects.requireNonNull(totalRedemptionAmount);
		return this;
	}

	public CurrencyAndAmount getTotalSubscriptionAmount() {
		return totalSubscriptionAmount;
	}

	public SwitchOrder setTotalSubscriptionAmount(CurrencyAndAmount totalSubscriptionAmount) {
		this.totalSubscriptionAmount = Objects.requireNonNull(totalSubscriptionAmount);
		return this;
	}

	public List<SwitchRedemptionLeg> getRedemptionLeg() {
		return redemptionLeg == null ? redemptionLeg = new ArrayList<>() : redemptionLeg;
	}

	public SwitchOrder setRedemptionLeg(List<com.tools20022.repository.entity.SwitchRedemptionLeg> redemptionLeg) {
		this.redemptionLeg = Objects.requireNonNull(redemptionLeg);
		return this;
	}

	public List<SwitchSubscriptionLeg> getSubscriptionLeg() {
		return subscriptionLeg == null ? subscriptionLeg = new ArrayList<>() : subscriptionLeg;
	}

	public SwitchOrder setSubscriptionLeg(List<com.tools20022.repository.entity.SwitchSubscriptionLeg> subscriptionLeg) {
		this.subscriptionLeg = Objects.requireNonNull(subscriptionLeg);
		return this;
	}
}