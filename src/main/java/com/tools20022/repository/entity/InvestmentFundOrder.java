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
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.SecuritiesOrder;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * An investor's instruction to either subscribe or redeem an amount of money or
 * its equivalent, for example other assets, into or out of an investment fund.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="InvestmentFundOrder" src="doc-files/InvestmentFundOrder.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#GrossAmountIndicator
 * InvestmentFundOrder.GrossAmountIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#RelatedTransaction
 * InvestmentFundOrder.RelatedTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#OrderType
 * InvestmentFundOrder.OrderType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#GrossAmount
 * InvestmentFundOrder.GrossAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#UnitsNumber
 * InvestmentFundOrder.UnitsNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#InvestmentFundOrderExecution
 * InvestmentFundOrder.InvestmentFundOrderExecution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#NetAmount
 * InvestmentFundOrder.NetAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#OrderDateTime
 * InvestmentFundOrder.OrderDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#ExpiryDateTime
 * InvestmentFundOrder.ExpiryDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#CancellationRight
 * InvestmentFundOrder.CancellationRight}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#RequestedSettlementCurrency
 * InvestmentFundOrder.RequestedSettlementCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#RequestedExecutionDateTime
 * InvestmentFundOrder.RequestedExecutionDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#FinancialAdvice
 * InvestmentFundOrder.FinancialAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#NegotiatedTrade
 * InvestmentFundOrder.NegotiatedTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#HoldingsRate
 * InvestmentFundOrder.HoldingsRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#OrderWaiverReason
 * InvestmentFundOrder.OrderWaiverReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#InitialOrderIndicator
 * InvestmentFundOrder.InitialOrderIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#OrderBookingDate
 * InvestmentFundOrder.OrderBookingDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#InvestmentPlan
 * InvestmentFundOrder.InvestmentPlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#OrderStatus
 * InvestmentFundOrder.OrderStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#TotalAmount
 * InvestmentFundOrder.TotalAmount}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentPlan#StandingOrder
 * InvestmentPlan.StandingOrder}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesQuantity#Order
 * SecuritiesQuantity.Order}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#InvestmentFundOrder
 * InvestmentFundTransaction.InvestmentFundOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#Order
 * InvestmentFundOrderExecution.Order}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus#InvestmentFundOrder
 * SecuritiesOrderStatus.InvestmentFundOrder}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BlockedStatusReason2#TransactionType
 * BlockedStatusReason2.TransactionType}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.RedemptionOrder
 * RedemptionOrder}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SwitchOrder SwitchOrder}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SubscriptionOrder
 * SubscriptionOrder}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.SecuritiesOrder
 * SecuritiesOrder}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentFundOrder4
 * InvestmentFundOrder4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FundOrderType1 FundOrderType1}</li>
 * <li>{@linkplain com.tools20022.repository.choice.FundOrderType1Choice
 * FundOrderType1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferReference3
 * TransferReference3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferReference2
 * TransferReference2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferReference1
 * TransferReference1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalOrderQuantityType1
 * OriginalOrderQuantityType1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason1
 * IndividualOrderConfirmationStatusAndReason1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FundOrderData1 FundOrderData1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SwitchLegReferences1
 * SwitchLegReferences1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentFundOrder5
 * InvestmentFundOrder5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentFundOrder1
 * InvestmentFundOrder1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FundOrderType2 FundOrderType2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentFundsOrderBreakdown1
 * InvestmentFundsOrderBreakdown1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FundOrderType3 FundOrderType3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OrderConfirmationDetails1
 * OrderConfirmationDetails1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentFundOrder3
 * InvestmentFundOrder3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentFundOrder2
 * InvestmentFundOrder2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity3Choice
 * FinancialInstrumentQuantity3Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity4Choice
 * FinancialInstrumentQuantity4Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity5Choice
 * FinancialInstrumentQuantity5Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity6Choice
 * FinancialInstrumentQuantity6Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity11Choice
 * FinancialInstrumentQuantity11Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FundOrderData3 FundOrderData3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity10Choice
 * FinancialInstrumentQuantity10Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.OrderWaiverReason1Choice
 * OrderWaiverReason1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AdditionalInformation2
 * AdditionalInformation2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity9Choice
 * FinancialInstrumentQuantity9Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity7Choice
 * FinancialInstrumentQuantity7Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity8Choice
 * FinancialInstrumentQuantity8Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity12Choice
 * FinancialInstrumentQuantity12Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity13Choice
 * FinancialInstrumentQuantity13Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentFundOrder6
 * InvestmentFundOrder6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferReference5
 * TransferReference5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferReference6
 * TransferReference6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferReference8
 * TransferReference8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferReference7
 * TransferReference7}</li>
 * <li>{@linkplain com.tools20022.repository.choice.OrderType2Choice
 * OrderType2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferReference9
 * TransferReference9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferReference10
 * TransferReference10}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason2
 * IndividualOrderConfirmationStatusAndReason2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentFundOrder11
 * InvestmentFundOrder11}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentFundOrder9
 * InvestmentFundOrder9}</li>
 * <li>{@linkplain com.tools20022.repository.choice.TransactionType5Choice
 * TransactionType5Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity26Choice
 * FinancialInstrumentQuantity26Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.FundOrderType4Choice
 * FundOrderType4Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OrderWaiver1 OrderWaiver1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentFundsOrderBreakdown2
 * InvestmentFundsOrderBreakdown2}</li>
 * <li>{@linkplain com.tools20022.repository.choice.OrderWaiverReason3Choice
 * OrderWaiverReason3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FundOrderData5 FundOrderData5}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity29Choice
 * FinancialInstrumentQuantity29Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentFundOrder8
 * InvestmentFundOrder8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SwitchLegReferences2
 * SwitchLegReferences2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BlockedStatusReason2
 * BlockedStatusReason2}</li>
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
 * "InvestmentFundOrder"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "An investor's instruction to either subscribe or redeem an amount of money or its equivalent, for example other assets, into or out of an investment fund."
 * </li>
 * </ul>
 */
public class InvestmentFundOrder extends SecuritiesOrder {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Indicates whether an ordered amount is a gross amount (including all
	 * charges, commissions, tax). If it is not a gross amount, the ordered
	 * amount is a net amount (amount to be invested or redeemed from the fund
	 * to which other elements will be added).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan2#GrossAmountIndicator
	 * InvestmentPlan2.GrossAmountIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan4#GrossAmountIndicator
	 * InvestmentPlan4.GrossAmountIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan6#GrossAmountIndicator
	 * InvestmentPlan6.GrossAmountIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan5#GrossAmountIndicator
	 * InvestmentPlan5.GrossAmountIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan3#GrossAmountIndicator
	 * InvestmentPlan3.GrossAmountIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan7#GrossAmountIndicator
	 * InvestmentPlan7.GrossAmountIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan9#GrossAmountIndicator
	 * InvestmentPlan9.GrossAmountIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan8#GrossAmountIndicator
	 * InvestmentPlan8.GrossAmountIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan10#GrossAmountIndicator
	 * InvestmentPlan10.GrossAmountIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan11#GrossAmountIndicator
	 * InvestmentPlan11.GrossAmountIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan12#GrossAmountIndicator
	 * InvestmentPlan12.GrossAmountIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan13#GrossAmountIndicator
	 * InvestmentPlan13.GrossAmountIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan14#GrossAmountIndicator
	 * InvestmentPlan14.GrossAmountIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan15#GrossAmountIndicator
	 * InvestmentPlan15.GrossAmountIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder
	 * InvestmentFundOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossAmountIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether an ordered amount is a gross amount (including all charges, commissions, tax). If it is not a gross amount, the ordered amount is a net amount (amount to be invested or redeemed from the fund to which other elements will be added)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute GrossAmountIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvestmentPlan2.GrossAmountIndicator, com.tools20022.repository.msg.InvestmentPlan4.GrossAmountIndicator,
					com.tools20022.repository.msg.InvestmentPlan6.GrossAmountIndicator, com.tools20022.repository.msg.InvestmentPlan5.GrossAmountIndicator, com.tools20022.repository.msg.InvestmentPlan3.GrossAmountIndicator,
					com.tools20022.repository.msg.InvestmentPlan7.GrossAmountIndicator, com.tools20022.repository.msg.InvestmentPlan9.GrossAmountIndicator, com.tools20022.repository.msg.InvestmentPlan8.GrossAmountIndicator,
					com.tools20022.repository.msg.InvestmentPlan10.GrossAmountIndicator, com.tools20022.repository.msg.InvestmentPlan11.GrossAmountIndicator, com.tools20022.repository.msg.InvestmentPlan12.GrossAmountIndicator,
					com.tools20022.repository.msg.InvestmentPlan13.GrossAmountIndicator, com.tools20022.repository.msg.InvestmentPlan14.GrossAmountIndicator, com.tools20022.repository.msg.InvestmentPlan15.GrossAmountIndicator);
			elementContext_lazy = () -> InvestmentFundOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GrossAmountIndicator";
			definition = "Indicates whether an ordered amount is a gross amount (including all charges, commissions, tax). If it is not a gross amount, the ordered amount is a net amount (amount to be invested or redeemed from the fund to which other elements will be added).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Transaction which is the source of the order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#InvestmentFundOrder
	 * InvestmentFundTransaction.InvestmentFundOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction
	 * InvestmentFundTransaction}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason1#InvestmentAccountOrFinancialInstrument
	 * IndividualOrderStatusAndReason1.InvestmentAccountOrFinancialInstrument}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrder6#OrderDetails
	 * InvestmentFundOrder6.OrderDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder
	 * InvestmentFundOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction which is the source of the order."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedTransaction = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IndividualOrderStatusAndReason1.InvestmentAccountOrFinancialInstrument, com.tools20022.repository.msg.InvestmentFundOrder6.OrderDetails);
			elementContext_lazy = () -> InvestmentFundOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedTransaction";
			definition = "Transaction which is the source of the order.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> InvestmentFundTransaction.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundTransaction.InvestmentFundOrder;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the category of the investment fund order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FundOrderTypeCode
	 * FundOrderTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FundOrderType1Choice#Type
	 * FundOrderType1Choice.Type}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FundOrderType1Choice#Proprietary
	 * FundOrderType1Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RedemptionOrder3#OrderType
	 * RedemptionOrder3.OrderType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.FundOrderType2#OrderType
	 * FundOrderType2.OrderType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundOrderType2#ExtendedOrderType
	 * FundOrderType2.ExtendedOrderType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundsOrderBreakdown1#OrderBreakdownType
	 * InvestmentFundsOrderBreakdown1.OrderBreakdownType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundsOrderBreakdown1#ExtendedOrderBreakdownType
	 * InvestmentFundsOrderBreakdown1.ExtendedOrderBreakdownType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RedemptionOrder5#OrderType
	 * RedemptionOrder5.OrderType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution3#OrderType
	 * RedemptionExecution3.OrderType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.FundOrderType3#OrderType
	 * FundOrderType3.OrderType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundOrderType3#ExtendedOrderType
	 * FundOrderType3.ExtendedOrderType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution5#OrderType
	 * RedemptionExecution5.OrderType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RedemptionOrder7#OrderType
	 * RedemptionOrder7.OrderType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RedemptionOrder4#OrderType
	 * RedemptionOrder4.OrderType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RedemptionOrder6#OrderType
	 * RedemptionOrder6.OrderType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution4#OrderType
	 * RedemptionExecution4.OrderType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#OrderType
	 * RedemptionExecution6.OrderType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RedemptionOrder8#OrderType
	 * RedemptionOrder8.OrderType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder3#OrderType
	 * SubscriptionOrder3.OrderType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder5#OrderType
	 * SubscriptionOrder5.OrderType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution3#OrderType
	 * SubscriptionExecution3.OrderType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution5#OrderType
	 * SubscriptionExecution5.OrderType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder7#OrderType
	 * SubscriptionOrder7.OrderType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder4#OrderType
	 * SubscriptionOrder4.OrderType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder6#OrderType
	 * SubscriptionOrder6.OrderType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution4#OrderType
	 * SubscriptionExecution4.OrderType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#OrderType
	 * SubscriptionExecution6.OrderType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder8#OrderType
	 * SubscriptionOrder8.OrderType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution10#HedgeFundOrderType
	 * RedemptionExecution10.HedgeFundOrderType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder9#HedgeFundOrderType
	 * RedemptionOrder9.HedgeFundOrderType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7#HedgeFundOrderType
	 * SubscriptionExecution7.HedgeFundOrderType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder9#HedgeFundOrderType
	 * SubscriptionOrder9.HedgeFundOrderType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrderExecution3#ConfirmationType
	 * InvestmentFundOrderExecution3.ConfirmationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrder6#OrderType
	 * InvestmentFundOrder6.OrderType}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.OrderType2Choice#Type
	 * OrderType2Choice.Type}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OrderType2Choice#Proprietary
	 * OrderType2Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OrderBreakdownType1Choice#Code
	 * OrderBreakdownType1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OrderBreakdownType1Choice#Proprietary
	 * OrderBreakdownType1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder14#OrderType
	 * RedemptionOrder14.OrderType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TransactionType5Choice#Code
	 * TransactionType5Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TransactionType5Choice#Proprietary
	 * TransactionType5Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FundOrderType4Choice#Code
	 * FundOrderType4Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FundOrderType4Choice#Proprietary
	 * FundOrderType4Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#OrderType
	 * SubscriptionExecution13.OrderType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundsOrderBreakdown2#OrderBreakdownType
	 * InvestmentFundsOrderBreakdown2.OrderBreakdownType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution12#OrderType
	 * SubscriptionExecution12.OrderType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder15#OrderType
	 * SubscriptionOrder15.OrderType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder15#OrderType
	 * RedemptionOrder15.OrderType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#OrderType
	 * RedemptionExecution16.OrderType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder14#OrderType
	 * SubscriptionOrder14.OrderType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#OrderType
	 * RedemptionExecution15.OrderType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder
	 * InvestmentFundOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the category of the investment fund order."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute OrderType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.FundOrderType1Choice.Type, com.tools20022.repository.choice.FundOrderType1Choice.Proprietary, com.tools20022.repository.msg.RedemptionOrder3.OrderType,
					com.tools20022.repository.msg.FundOrderType2.OrderType, com.tools20022.repository.msg.FundOrderType2.ExtendedOrderType, com.tools20022.repository.msg.InvestmentFundsOrderBreakdown1.OrderBreakdownType,
					com.tools20022.repository.msg.InvestmentFundsOrderBreakdown1.ExtendedOrderBreakdownType, com.tools20022.repository.msg.RedemptionOrder5.OrderType, com.tools20022.repository.msg.RedemptionExecution3.OrderType,
					com.tools20022.repository.msg.FundOrderType3.OrderType, com.tools20022.repository.msg.FundOrderType3.ExtendedOrderType, com.tools20022.repository.msg.RedemptionExecution5.OrderType,
					com.tools20022.repository.msg.RedemptionOrder7.OrderType, com.tools20022.repository.msg.RedemptionOrder4.OrderType, com.tools20022.repository.msg.RedemptionOrder6.OrderType,
					com.tools20022.repository.msg.RedemptionExecution4.OrderType, com.tools20022.repository.msg.RedemptionExecution6.OrderType, com.tools20022.repository.msg.RedemptionOrder8.OrderType,
					com.tools20022.repository.msg.SubscriptionOrder3.OrderType, com.tools20022.repository.msg.SubscriptionOrder5.OrderType, com.tools20022.repository.msg.SubscriptionExecution3.OrderType,
					com.tools20022.repository.msg.SubscriptionExecution5.OrderType, com.tools20022.repository.msg.SubscriptionOrder7.OrderType, com.tools20022.repository.msg.SubscriptionOrder4.OrderType,
					com.tools20022.repository.msg.SubscriptionOrder6.OrderType, com.tools20022.repository.msg.SubscriptionExecution4.OrderType, com.tools20022.repository.msg.SubscriptionExecution6.OrderType,
					com.tools20022.repository.msg.SubscriptionOrder8.OrderType, com.tools20022.repository.msg.RedemptionExecution10.HedgeFundOrderType, com.tools20022.repository.msg.RedemptionOrder9.HedgeFundOrderType,
					com.tools20022.repository.msg.SubscriptionExecution7.HedgeFundOrderType, com.tools20022.repository.msg.SubscriptionOrder9.HedgeFundOrderType, com.tools20022.repository.msg.InvestmentFundOrderExecution3.ConfirmationType,
					com.tools20022.repository.msg.InvestmentFundOrder6.OrderType, com.tools20022.repository.choice.OrderType2Choice.Type, com.tools20022.repository.choice.OrderType2Choice.Proprietary,
					com.tools20022.repository.choice.OrderBreakdownType1Choice.Code, com.tools20022.repository.choice.OrderBreakdownType1Choice.Proprietary, com.tools20022.repository.msg.RedemptionOrder14.OrderType,
					com.tools20022.repository.choice.TransactionType5Choice.Code, com.tools20022.repository.choice.TransactionType5Choice.Proprietary, com.tools20022.repository.choice.FundOrderType4Choice.Code,
					com.tools20022.repository.choice.FundOrderType4Choice.Proprietary, com.tools20022.repository.msg.SubscriptionExecution13.OrderType, com.tools20022.repository.msg.InvestmentFundsOrderBreakdown2.OrderBreakdownType,
					com.tools20022.repository.msg.SubscriptionExecution12.OrderType, com.tools20022.repository.msg.SubscriptionOrder15.OrderType, com.tools20022.repository.msg.RedemptionOrder15.OrderType,
					com.tools20022.repository.msg.RedemptionExecution16.OrderType, com.tools20022.repository.msg.SubscriptionOrder14.OrderType, com.tools20022.repository.msg.RedemptionExecution15.OrderType);
			elementContext_lazy = () -> InvestmentFundOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OrderType";
			definition = "Specifies the category of the investment fund order.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> FundOrderTypeCode.mmObject();
		}
	};
	/**
	 * Amount of money used to derive the quantity of investment fund units sold
	 * or subscribed, before deduction of charges, commissions, and taxes,
	 * expressed in the currency requested by the investor.<br>
	 * [Quantity * Price] + (Charges + Commissions +Taxes)]
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
	 * <li>{@linkplain com.tools20022.repository.msg.FundOrderData1#GrossAmount
	 * FundOrderData1.GrossAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder3#GrossAmount
	 * RedemptionOrder3.GrossAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder5#GrossAmount
	 * RedemptionOrder5.GrossAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution3#GrossAmount
	 * RedemptionExecution3.GrossAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution5#GrossAmount
	 * RedemptionExecution5.GrossAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder7#GrossAmount
	 * RedemptionOrder7.GrossAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder4#GrossAmount
	 * RedemptionOrder4.GrossAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder6#GrossAmount
	 * RedemptionOrder6.GrossAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution4#GrossAmount
	 * RedemptionExecution4.GrossAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#GrossAmount
	 * RedemptionExecution6.GrossAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder8#GrossAmount
	 * RedemptionOrder8.GrossAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder3#GrossAmount
	 * SubscriptionOrder3.GrossAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder5#GrossAmount
	 * SubscriptionOrder5.GrossAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution3#GrossAmount
	 * SubscriptionExecution3.GrossAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution5#GrossAmount
	 * SubscriptionExecution5.GrossAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder7#GrossAmount
	 * SubscriptionOrder7.GrossAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder4#GrossAmount
	 * SubscriptionOrder4.GrossAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder6#GrossAmount
	 * SubscriptionOrder6.GrossAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution4#GrossAmount
	 * SubscriptionExecution4.GrossAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#GrossAmount
	 * SubscriptionExecution6.GrossAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder8#GrossAmount
	 * SubscriptionOrder8.GrossAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity3Choice#GrossAmount
	 * FinancialInstrumentQuantity3Choice.GrossAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity4Choice#GrossAmount
	 * FinancialInstrumentQuantity4Choice.GrossAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity5Choice#GrossAmount
	 * FinancialInstrumentQuantity5Choice.GrossAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity6Choice#GrossAmount
	 * FinancialInstrumentQuantity6Choice.GrossAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution2#GrossAmount
	 * SwitchRedemptionLegExecution2.GrossAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution2#GrossAmount
	 * SwitchSubscriptionLegExecution2.GrossAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution3#GrossAmount
	 * SwitchRedemptionLegExecution3.GrossAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution3#GrossAmount
	 * SwitchSubscriptionLegExecution3.GrossAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentQuantity2#GrossAmount
	 * FinancialInstrumentQuantity2.GrossAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentQuantity3#GrossAmount
	 * FinancialInstrumentQuantity3.GrossAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity7Choice#GrossAmount
	 * FinancialInstrumentQuantity7Choice.GrossAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity8Choice#GrossAmount
	 * FinancialInstrumentQuantity8Choice.GrossAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity12Choice#GrossAmount
	 * FinancialInstrumentQuantity12Choice.GrossAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity13Choice#GrossAmount
	 * FinancialInstrumentQuantity13Choice.GrossAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder11#GrossAmount
	 * RedemptionOrder11.GrossAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution12#GrossAmount
	 * RedemptionExecution12.GrossAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder11#GrossAmount
	 * SubscriptionOrder11.GrossAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution9#GrossAmount
	 * SubscriptionExecution9.GrossAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity26Choice#GrossAmount
	 * FinancialInstrumentQuantity26Choice.GrossAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#GrossAmount
	 * SubscriptionExecution13.GrossAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution12#GrossAmount
	 * SubscriptionExecution12.GrossAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.FundOrderData5#GrossAmount
	 * FundOrderData5.GrossAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity29Choice#GrossAmount
	 * FinancialInstrumentQuantity29Choice.GrossAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity28Choice#GrossAmount
	 * FinancialInstrumentQuantity28Choice.GrossAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#GrossAmount
	 * RedemptionExecution16.GrossAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution4#GrossAmount
	 * SwitchSubscriptionLegExecution4.GrossAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity27Choice#GrossAmount
	 * FinancialInstrumentQuantity27Choice.GrossAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#GrossAmount
	 * RedemptionExecution15.GrossAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution4#GrossAmount
	 * SwitchRedemptionLegExecution4.GrossAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder
	 * InvestmentFundOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money used to derive the quantity of investment fund units sold or subscribed, before deduction of charges, commissions, and taxes, expressed in the currency requested by the investor.\r\n[Quantity * Price] + (Charges + Commissions +Taxes)]"
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute GrossAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FundOrderData1.GrossAmount, com.tools20022.repository.msg.RedemptionOrder3.GrossAmount, com.tools20022.repository.msg.RedemptionOrder5.GrossAmount,
					com.tools20022.repository.msg.RedemptionExecution3.GrossAmount, com.tools20022.repository.msg.RedemptionExecution5.GrossAmount, com.tools20022.repository.msg.RedemptionOrder7.GrossAmount,
					com.tools20022.repository.msg.RedemptionOrder4.GrossAmount, com.tools20022.repository.msg.RedemptionOrder6.GrossAmount, com.tools20022.repository.msg.RedemptionExecution4.GrossAmount,
					com.tools20022.repository.msg.RedemptionExecution6.GrossAmount, com.tools20022.repository.msg.RedemptionOrder8.GrossAmount, com.tools20022.repository.msg.SubscriptionOrder3.GrossAmount,
					com.tools20022.repository.msg.SubscriptionOrder5.GrossAmount, com.tools20022.repository.msg.SubscriptionExecution3.GrossAmount, com.tools20022.repository.msg.SubscriptionExecution5.GrossAmount,
					com.tools20022.repository.msg.SubscriptionOrder7.GrossAmount, com.tools20022.repository.msg.SubscriptionOrder4.GrossAmount, com.tools20022.repository.msg.SubscriptionOrder6.GrossAmount,
					com.tools20022.repository.msg.SubscriptionExecution4.GrossAmount, com.tools20022.repository.msg.SubscriptionExecution6.GrossAmount, com.tools20022.repository.msg.SubscriptionOrder8.GrossAmount,
					com.tools20022.repository.choice.FinancialInstrumentQuantity3Choice.GrossAmount, com.tools20022.repository.choice.FinancialInstrumentQuantity4Choice.GrossAmount,
					com.tools20022.repository.choice.FinancialInstrumentQuantity5Choice.GrossAmount, com.tools20022.repository.choice.FinancialInstrumentQuantity6Choice.GrossAmount,
					com.tools20022.repository.msg.SwitchRedemptionLegExecution2.GrossAmount, com.tools20022.repository.msg.SwitchSubscriptionLegExecution2.GrossAmount,
					com.tools20022.repository.msg.SwitchRedemptionLegExecution3.GrossAmount, com.tools20022.repository.msg.SwitchSubscriptionLegExecution3.GrossAmount, com.tools20022.repository.msg.FinancialInstrumentQuantity2.GrossAmount,
					com.tools20022.repository.msg.FinancialInstrumentQuantity3.GrossAmount, com.tools20022.repository.choice.FinancialInstrumentQuantity7Choice.GrossAmount,
					com.tools20022.repository.choice.FinancialInstrumentQuantity8Choice.GrossAmount, com.tools20022.repository.choice.FinancialInstrumentQuantity12Choice.GrossAmount,
					com.tools20022.repository.choice.FinancialInstrumentQuantity13Choice.GrossAmount, com.tools20022.repository.msg.RedemptionOrder11.GrossAmount, com.tools20022.repository.msg.RedemptionExecution12.GrossAmount,
					com.tools20022.repository.msg.SubscriptionOrder11.GrossAmount, com.tools20022.repository.msg.SubscriptionExecution9.GrossAmount, com.tools20022.repository.choice.FinancialInstrumentQuantity26Choice.GrossAmount,
					com.tools20022.repository.msg.SubscriptionExecution13.GrossAmount, com.tools20022.repository.msg.SubscriptionExecution12.GrossAmount, com.tools20022.repository.msg.FundOrderData5.GrossAmount,
					com.tools20022.repository.choice.FinancialInstrumentQuantity29Choice.GrossAmount, com.tools20022.repository.choice.FinancialInstrumentQuantity28Choice.GrossAmount,
					com.tools20022.repository.msg.RedemptionExecution16.GrossAmount, com.tools20022.repository.msg.SwitchSubscriptionLegExecution4.GrossAmount,
					com.tools20022.repository.choice.FinancialInstrumentQuantity27Choice.GrossAmount, com.tools20022.repository.msg.RedemptionExecution15.GrossAmount, com.tools20022.repository.msg.SwitchRedemptionLegExecution4.GrossAmount);
			elementContext_lazy = () -> InvestmentFundOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GrossAmount";
			definition = "Amount of money used to derive the quantity of investment fund units sold or subscribed, before deduction of charges, commissions, and taxes, expressed in the currency requested by the investor.\r\n[Quantity * Price] + (Charges + Commissions +Taxes)]";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Quantity of investment fund units to be subscribed or redeemed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#Order
	 * SecuritiesQuantity.Order}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.FundOrderData1#UnitsNumber
	 * FundOrderData1.UnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder3#UnitsNumber
	 * RedemptionOrder3.UnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder5#UnitsNumber
	 * RedemptionOrder5.UnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder7#UnitsNumber
	 * RedemptionOrder7.UnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder4#UnitsNumber
	 * RedemptionOrder4.UnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder6#UnitsNumber
	 * RedemptionOrder6.UnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder8#UnitsNumber
	 * RedemptionOrder8.UnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder3#UnitsNumber
	 * SubscriptionOrder3.UnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder5#UnitsNumber
	 * SubscriptionOrder5.UnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder7#UnitsNumber
	 * SubscriptionOrder7.UnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder4#UnitsNumber
	 * SubscriptionOrder4.UnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder6#UnitsNumber
	 * SubscriptionOrder6.UnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder8#UnitsNumber
	 * SubscriptionOrder8.UnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity3Choice#UnitsNumber
	 * FinancialInstrumentQuantity3Choice.UnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegOrder2#FinancialInstrumentQuantityChoice
	 * SwitchRedemptionLegOrder2.FinancialInstrumentQuantityChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity4Choice#UnitsNumber
	 * FinancialInstrumentQuantity4Choice.UnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder2#FinancialInstrumentQuantityChoice
	 * SwitchSubscriptionLegOrder2.FinancialInstrumentQuantityChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity5Choice#UnitsNumber
	 * FinancialInstrumentQuantity5Choice.UnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegOrder3#FinancialInstrumentQuantityChoice
	 * SwitchRedemptionLegOrder3.FinancialInstrumentQuantityChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity6Choice#UnitsNumber
	 * FinancialInstrumentQuantity6Choice.UnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder3#FinancialInstrumentQuantityChoice
	 * SwitchSubscriptionLegOrder3.FinancialInstrumentQuantityChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity11Choice#UnitsNumber
	 * FinancialInstrumentQuantity11Choice.UnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundOrderData3#FinancialInstrumentQuantity
	 * FundOrderData3.FinancialInstrumentQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity10Choice#UnitsNumber
	 * FinancialInstrumentQuantity10Choice.UnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder9#FinancialInstrumentQuantity
	 * RedemptionOrder9.FinancialInstrumentQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity9Choice#UnitsNumber
	 * FinancialInstrumentQuantity9Choice.UnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder9#FinancialInstrumentQuantity
	 * SubscriptionOrder9.FinancialInstrumentQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution8#FinancialInstrumentQuantity
	 * SubscriptionExecution8.FinancialInstrumentQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution11#FinancialInstrumentQuantity
	 * RedemptionExecution11.FinancialInstrumentQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecutionRedemptionLeg4#FinancialInstrumentQuantity
	 * SwitchExecutionRedemptionLeg4.FinancialInstrumentQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecutionSubscriptionLeg4#FinancialInstrumentQuantity
	 * SwitchExecutionSubscriptionLeg4.FinancialInstrumentQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity7Choice#UnitsNumber
	 * FinancialInstrumentQuantity7Choice.UnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder10#FinancialInstrumentQuantity
	 * SubscriptionOrder10.FinancialInstrumentQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity8Choice#UnitsNumber
	 * FinancialInstrumentQuantity8Choice.UnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder10#FinancialInstrumentQuantity
	 * RedemptionOrder10.FinancialInstrumentQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity12Choice#UnitsNumber
	 * FinancialInstrumentQuantity12Choice.UnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegOrder4#FinancialInstrumentQuantity
	 * SwitchRedemptionLegOrder4.FinancialInstrumentQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity13Choice#UnitsNumber
	 * FinancialInstrumentQuantity13Choice.UnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder4#FinancialInstrumentQuantity
	 * SwitchSubscriptionLegOrder4.FinancialInstrumentQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder11#UnitsNumber
	 * RedemptionOrder11.UnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder11#UnitsNumber
	 * SubscriptionOrder11.UnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder6#FinancialInstrumentQuantityChoice
	 * SwitchSubscriptionLegOrder6.FinancialInstrumentQuantityChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity26Choice#UnitsNumber
	 * FinancialInstrumentQuantity26Choice.UnitsNumber}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.FundOrderData5#UnitsNumber
	 * FundOrderData5.UnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegOrder6#FinancialInstrumentQuantityChoice
	 * SwitchRedemptionLegOrder6.FinancialInstrumentQuantityChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity29Choice#UnitsNumber
	 * FinancialInstrumentQuantity29Choice.UnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity28Choice#UnitsNumber
	 * FinancialInstrumentQuantity28Choice.UnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity27Choice#UnitsNumber
	 * FinancialInstrumentQuantity27Choice.UnitsNumber}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder
	 * InvestmentFundOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnitsNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity of investment fund units to be subscribed or redeemed."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd UnitsNumber = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FundOrderData1.UnitsNumber, com.tools20022.repository.msg.RedemptionOrder3.UnitsNumber, com.tools20022.repository.msg.RedemptionOrder5.UnitsNumber,
					com.tools20022.repository.msg.RedemptionOrder7.UnitsNumber, com.tools20022.repository.msg.RedemptionOrder4.UnitsNumber, com.tools20022.repository.msg.RedemptionOrder6.UnitsNumber,
					com.tools20022.repository.msg.RedemptionOrder8.UnitsNumber, com.tools20022.repository.msg.SubscriptionOrder3.UnitsNumber, com.tools20022.repository.msg.SubscriptionOrder5.UnitsNumber,
					com.tools20022.repository.msg.SubscriptionOrder7.UnitsNumber, com.tools20022.repository.msg.SubscriptionOrder4.UnitsNumber, com.tools20022.repository.msg.SubscriptionOrder6.UnitsNumber,
					com.tools20022.repository.msg.SubscriptionOrder8.UnitsNumber, com.tools20022.repository.choice.FinancialInstrumentQuantity3Choice.UnitsNumber,
					com.tools20022.repository.msg.SwitchRedemptionLegOrder2.FinancialInstrumentQuantityChoice, com.tools20022.repository.choice.FinancialInstrumentQuantity4Choice.UnitsNumber,
					com.tools20022.repository.msg.SwitchSubscriptionLegOrder2.FinancialInstrumentQuantityChoice, com.tools20022.repository.choice.FinancialInstrumentQuantity5Choice.UnitsNumber,
					com.tools20022.repository.msg.SwitchRedemptionLegOrder3.FinancialInstrumentQuantityChoice, com.tools20022.repository.choice.FinancialInstrumentQuantity6Choice.UnitsNumber,
					com.tools20022.repository.msg.SwitchSubscriptionLegOrder3.FinancialInstrumentQuantityChoice, com.tools20022.repository.choice.FinancialInstrumentQuantity11Choice.UnitsNumber,
					com.tools20022.repository.msg.FundOrderData3.FinancialInstrumentQuantity, com.tools20022.repository.choice.FinancialInstrumentQuantity10Choice.UnitsNumber,
					com.tools20022.repository.msg.RedemptionOrder9.FinancialInstrumentQuantity, com.tools20022.repository.choice.FinancialInstrumentQuantity9Choice.UnitsNumber,
					com.tools20022.repository.msg.SubscriptionOrder9.FinancialInstrumentQuantity, com.tools20022.repository.msg.SubscriptionExecution8.FinancialInstrumentQuantity,
					com.tools20022.repository.msg.RedemptionExecution11.FinancialInstrumentQuantity, com.tools20022.repository.msg.SwitchExecutionRedemptionLeg4.FinancialInstrumentQuantity,
					com.tools20022.repository.msg.SwitchExecutionSubscriptionLeg4.FinancialInstrumentQuantity, com.tools20022.repository.choice.FinancialInstrumentQuantity7Choice.UnitsNumber,
					com.tools20022.repository.msg.SubscriptionOrder10.FinancialInstrumentQuantity, com.tools20022.repository.choice.FinancialInstrumentQuantity8Choice.UnitsNumber,
					com.tools20022.repository.msg.RedemptionOrder10.FinancialInstrumentQuantity, com.tools20022.repository.choice.FinancialInstrumentQuantity12Choice.UnitsNumber,
					com.tools20022.repository.msg.SwitchRedemptionLegOrder4.FinancialInstrumentQuantity, com.tools20022.repository.choice.FinancialInstrumentQuantity13Choice.UnitsNumber,
					com.tools20022.repository.msg.SwitchSubscriptionLegOrder4.FinancialInstrumentQuantity, com.tools20022.repository.msg.RedemptionOrder11.UnitsNumber, com.tools20022.repository.msg.SubscriptionOrder11.UnitsNumber,
					com.tools20022.repository.msg.SwitchSubscriptionLegOrder6.FinancialInstrumentQuantityChoice, com.tools20022.repository.choice.FinancialInstrumentQuantity26Choice.UnitsNumber,
					com.tools20022.repository.msg.FundOrderData5.UnitsNumber, com.tools20022.repository.msg.SwitchRedemptionLegOrder6.FinancialInstrumentQuantityChoice,
					com.tools20022.repository.choice.FinancialInstrumentQuantity29Choice.UnitsNumber, com.tools20022.repository.choice.FinancialInstrumentQuantity28Choice.UnitsNumber,
					com.tools20022.repository.choice.FinancialInstrumentQuantity27Choice.UnitsNumber);
			elementContext_lazy = () -> InvestmentFundOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UnitsNumber";
			definition = "Quantity of investment fund units to be subscribed or redeemed.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesQuantity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.Order;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Execution of an investment fund order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#Order
	 * InvestmentFundOrderExecution.Order}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution
	 * InvestmentFundOrderExecution}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason1#NewDetails
	 * IndividualOrderStatusAndReason1.NewDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason2#NewDetails
	 * IndividualOrderStatusAndReason2.NewDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrderStatusAndReason1#NewDetails
	 * SwitchOrderStatusAndReason1.NewDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason3#NewDetails
	 * IndividualOrderStatusAndReason3.NewDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason7#NewDetails
	 * IndividualOrderStatusAndReason7.NewDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrderStatusAndReason2#NewDetails
	 * SwitchOrderStatusAndReason2.NewDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder
	 * InvestmentFundOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentFundOrderExecution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Execution of an investment fund order."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd InvestmentFundOrderExecution = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IndividualOrderStatusAndReason1.NewDetails, com.tools20022.repository.msg.IndividualOrderStatusAndReason2.NewDetails,
					com.tools20022.repository.msg.SwitchOrderStatusAndReason1.NewDetails, com.tools20022.repository.msg.IndividualOrderStatusAndReason3.NewDetails, com.tools20022.repository.msg.IndividualOrderStatusAndReason7.NewDetails,
					com.tools20022.repository.msg.SwitchOrderStatusAndReason2.NewDetails);
			elementContext_lazy = () -> InvestmentFundOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestmentFundOrderExecution";
			definition = "Execution of an investment fund order.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrderExecution.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrderExecution.Order;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Amount of money used to determine the quantity of investment fund units
	 * to be subscribed or to be sold.
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
	 * <li>{@linkplain com.tools20022.repository.msg.FundOrderData1#NetAmount
	 * FundOrderData1.NetAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RedemptionOrder3#NetAmount
	 * RedemptionOrder3.NetAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RedemptionOrder5#NetAmount
	 * RedemptionOrder5.NetAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RedemptionOrder7#NetAmount
	 * RedemptionOrder7.NetAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RedemptionOrder4#NetAmount
	 * RedemptionOrder4.NetAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RedemptionOrder6#NetAmount
	 * RedemptionOrder6.NetAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RedemptionOrder8#NetAmount
	 * RedemptionOrder8.NetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder3#NetAmount
	 * SubscriptionOrder3.NetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder5#NetAmount
	 * SubscriptionOrder5.NetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder7#NetAmount
	 * SubscriptionOrder7.NetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder4#NetAmount
	 * SubscriptionOrder4.NetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder6#NetAmount
	 * SubscriptionOrder6.NetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder8#NetAmount
	 * SubscriptionOrder8.NetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity3Choice#NetAmount
	 * FinancialInstrumentQuantity3Choice.NetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity4Choice#NetAmount
	 * FinancialInstrumentQuantity4Choice.NetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity5Choice#NetAmount
	 * FinancialInstrumentQuantity5Choice.NetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity6Choice#NetAmount
	 * FinancialInstrumentQuantity6Choice.NetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentQuantity2#OrderedAmount
	 * FinancialInstrumentQuantity2.OrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentQuantity2#NetAmount
	 * FinancialInstrumentQuantity2.NetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentQuantity3#NetAmount
	 * FinancialInstrumentQuantity3.NetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity7Choice#NetAmount
	 * FinancialInstrumentQuantity7Choice.NetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity8Choice#NetAmount
	 * FinancialInstrumentQuantity8Choice.NetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity12Choice#NetAmount
	 * FinancialInstrumentQuantity12Choice.NetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity13Choice#NetAmount
	 * FinancialInstrumentQuantity13Choice.NetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder11#NetAmount
	 * RedemptionOrder11.NetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder11#NetAmount
	 * SubscriptionOrder11.NetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity26Choice#NetAmount
	 * FinancialInstrumentQuantity26Choice.NetAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.FundOrderData5#NetAmount
	 * FundOrderData5.NetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity29Choice#NetAmount
	 * FinancialInstrumentQuantity29Choice.NetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity28Choice#NetAmount
	 * FinancialInstrumentQuantity28Choice.NetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity27Choice#NetAmount
	 * FinancialInstrumentQuantity27Choice.NetAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder
	 * InvestmentFundOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money used to determine the quantity of investment fund units to be subscribed or to be sold."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute NetAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FundOrderData1.NetAmount, com.tools20022.repository.msg.RedemptionOrder3.NetAmount, com.tools20022.repository.msg.RedemptionOrder5.NetAmount,
					com.tools20022.repository.msg.RedemptionOrder7.NetAmount, com.tools20022.repository.msg.RedemptionOrder4.NetAmount, com.tools20022.repository.msg.RedemptionOrder6.NetAmount,
					com.tools20022.repository.msg.RedemptionOrder8.NetAmount, com.tools20022.repository.msg.SubscriptionOrder3.NetAmount, com.tools20022.repository.msg.SubscriptionOrder5.NetAmount,
					com.tools20022.repository.msg.SubscriptionOrder7.NetAmount, com.tools20022.repository.msg.SubscriptionOrder4.NetAmount, com.tools20022.repository.msg.SubscriptionOrder6.NetAmount,
					com.tools20022.repository.msg.SubscriptionOrder8.NetAmount, com.tools20022.repository.choice.FinancialInstrumentQuantity3Choice.NetAmount, com.tools20022.repository.choice.FinancialInstrumentQuantity4Choice.NetAmount,
					com.tools20022.repository.choice.FinancialInstrumentQuantity5Choice.NetAmount, com.tools20022.repository.choice.FinancialInstrumentQuantity6Choice.NetAmount,
					com.tools20022.repository.msg.FinancialInstrumentQuantity2.OrderedAmount, com.tools20022.repository.msg.FinancialInstrumentQuantity2.NetAmount, com.tools20022.repository.msg.FinancialInstrumentQuantity3.NetAmount,
					com.tools20022.repository.choice.FinancialInstrumentQuantity7Choice.NetAmount, com.tools20022.repository.choice.FinancialInstrumentQuantity8Choice.NetAmount,
					com.tools20022.repository.choice.FinancialInstrumentQuantity12Choice.NetAmount, com.tools20022.repository.choice.FinancialInstrumentQuantity13Choice.NetAmount, com.tools20022.repository.msg.RedemptionOrder11.NetAmount,
					com.tools20022.repository.msg.SubscriptionOrder11.NetAmount, com.tools20022.repository.choice.FinancialInstrumentQuantity26Choice.NetAmount, com.tools20022.repository.msg.FundOrderData5.NetAmount,
					com.tools20022.repository.choice.FinancialInstrumentQuantity29Choice.NetAmount, com.tools20022.repository.choice.FinancialInstrumentQuantity28Choice.NetAmount,
					com.tools20022.repository.choice.FinancialInstrumentQuantity27Choice.NetAmount);
			elementContext_lazy = () -> InvestmentFundOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NetAmount";
			definition = "Amount of money used to determine the quantity of investment fund units to be subscribed or to be sold.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Date and time at which the order was placed by the investor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkOrder2#OrderDateTime
	 * RedemptionBulkOrder2.OrderDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkOrder3#OrderDateTime
	 * RedemptionBulkOrder3.OrderDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkExecution2#OrderDateTime
	 * RedemptionBulkExecution2.OrderDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkExecution3#OrderDateTime
	 * RedemptionBulkExecution3.OrderDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkOrder4#OrderDateTime
	 * RedemptionBulkOrder4.OrderDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder2#OrderDateTime
	 * RedemptionMultipleOrder2.OrderDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder3#OrderDateTime
	 * RedemptionMultipleOrder3.OrderDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution2#OrderDateTime
	 * RedemptionMultipleExecution2.OrderDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution3#OrderDateTime
	 * RedemptionMultipleExecution3.OrderDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder4#OrderDateTime
	 * RedemptionMultipleOrder4.OrderDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction2#OrderDateTime
	 * InvestmentFundTransaction2.OrderDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction3#OrderDateTime
	 * InvestmentFundTransaction3.OrderDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkOrder2#OrderDateTime
	 * SubscriptionBulkOrder2.OrderDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkOrder3#OrderDateTime
	 * SubscriptionBulkOrder3.OrderDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkExecution2#OrderDateTime
	 * SubscriptionBulkExecution2.OrderDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkExecution3#OrderDateTime
	 * SubscriptionBulkExecution3.OrderDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkOrder4#OrderDateTime
	 * SubscriptionBulkOrder4.OrderDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder2#OrderDateTime
	 * SubscriptionMultipleOrder2.OrderDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder3#OrderDateTime
	 * SubscriptionMultipleOrder3.OrderDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleExecution2#OrderDateTime
	 * SubscriptionMultipleExecution2.OrderDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleExecution3#OrderDateTime
	 * SubscriptionMultipleExecution3.OrderDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder4#OrderDateTime
	 * SubscriptionMultipleOrder4.OrderDateTime}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SwitchOrder2#OrderDateTime
	 * SwitchOrder2.OrderDateTime}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SwitchOrder3#OrderDateTime
	 * SwitchOrder3.OrderDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution3#OrderDateTime
	 * SwitchExecution3.OrderDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution4#OrderDateTime
	 * SwitchExecution4.OrderDateTime}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SwitchOrder4#OrderDateTime
	 * SwitchOrder4.OrderDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction4#OrderDateTime
	 * InvestmentFundTransaction4.OrderDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution7#OrderDateTime
	 * SwitchExecution7.OrderDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkOrder5#OrderDateTime
	 * SubscriptionBulkOrder5.OrderDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkExecution5#OrderDateTime
	 * RedemptionBulkExecution5.OrderDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution5#OrderDateTime
	 * RedemptionMultipleExecution5.OrderDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder6#OrderDateTime
	 * RedemptionMultipleOrder6.OrderDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder6#OrderDateTime
	 * SubscriptionMultipleOrder6.OrderDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkExecution4#OrderDateTime
	 * SubscriptionBulkExecution4.OrderDateTime}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SwitchOrder7#OrderDateTime
	 * SwitchOrder7.OrderDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkOrder6#OrderDateTime
	 * RedemptionBulkOrder6.OrderDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleExecution5#OrderDateTime
	 * SubscriptionMultipleExecution5.OrderDateTime}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder
	 * InvestmentFundOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time at which the order was placed by the investor."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute OrderDateTime = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RedemptionBulkOrder2.OrderDateTime, com.tools20022.repository.msg.RedemptionBulkOrder3.OrderDateTime,
					com.tools20022.repository.msg.RedemptionBulkExecution2.OrderDateTime, com.tools20022.repository.msg.RedemptionBulkExecution3.OrderDateTime, com.tools20022.repository.msg.RedemptionBulkOrder4.OrderDateTime,
					com.tools20022.repository.msg.RedemptionMultipleOrder2.OrderDateTime, com.tools20022.repository.msg.RedemptionMultipleOrder3.OrderDateTime, com.tools20022.repository.msg.RedemptionMultipleExecution2.OrderDateTime,
					com.tools20022.repository.msg.RedemptionMultipleExecution3.OrderDateTime, com.tools20022.repository.msg.RedemptionMultipleOrder4.OrderDateTime, com.tools20022.repository.msg.InvestmentFundTransaction2.OrderDateTime,
					com.tools20022.repository.msg.InvestmentFundTransaction3.OrderDateTime, com.tools20022.repository.msg.SubscriptionBulkOrder2.OrderDateTime, com.tools20022.repository.msg.SubscriptionBulkOrder3.OrderDateTime,
					com.tools20022.repository.msg.SubscriptionBulkExecution2.OrderDateTime, com.tools20022.repository.msg.SubscriptionBulkExecution3.OrderDateTime, com.tools20022.repository.msg.SubscriptionBulkOrder4.OrderDateTime,
					com.tools20022.repository.msg.SubscriptionMultipleOrder2.OrderDateTime, com.tools20022.repository.msg.SubscriptionMultipleOrder3.OrderDateTime, com.tools20022.repository.msg.SubscriptionMultipleExecution2.OrderDateTime,
					com.tools20022.repository.msg.SubscriptionMultipleExecution3.OrderDateTime, com.tools20022.repository.msg.SubscriptionMultipleOrder4.OrderDateTime, com.tools20022.repository.msg.SwitchOrder2.OrderDateTime,
					com.tools20022.repository.msg.SwitchOrder3.OrderDateTime, com.tools20022.repository.msg.SwitchExecution3.OrderDateTime, com.tools20022.repository.msg.SwitchExecution4.OrderDateTime,
					com.tools20022.repository.msg.SwitchOrder4.OrderDateTime, com.tools20022.repository.msg.InvestmentFundTransaction4.OrderDateTime, com.tools20022.repository.msg.SwitchExecution7.OrderDateTime,
					com.tools20022.repository.msg.SubscriptionBulkOrder5.OrderDateTime, com.tools20022.repository.msg.RedemptionBulkExecution5.OrderDateTime, com.tools20022.repository.msg.RedemptionMultipleExecution5.OrderDateTime,
					com.tools20022.repository.msg.RedemptionMultipleOrder6.OrderDateTime, com.tools20022.repository.msg.SubscriptionMultipleOrder6.OrderDateTime, com.tools20022.repository.msg.SubscriptionBulkExecution4.OrderDateTime,
					com.tools20022.repository.msg.SwitchOrder7.OrderDateTime, com.tools20022.repository.msg.RedemptionBulkOrder6.OrderDateTime, com.tools20022.repository.msg.SubscriptionMultipleExecution5.OrderDateTime);
			elementContext_lazy = () -> InvestmentFundOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OrderDateTime";
			definition = "Date and time at which the order was placed by the investor.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Date on which the order expires.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkOrder2#ExpiryDateTime
	 * RedemptionBulkOrder2.ExpiryDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkOrder3#ExpiryDateTime
	 * RedemptionBulkOrder3.ExpiryDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkOrder4#ExpiryDateTime
	 * RedemptionBulkOrder4.ExpiryDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder2#ExpiryDateTime
	 * RedemptionMultipleOrder2.ExpiryDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder3#ExpiryDateTime
	 * RedemptionMultipleOrder3.ExpiryDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder4#ExpiryDateTime
	 * RedemptionMultipleOrder4.ExpiryDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkOrder2#ExpiryDateTime
	 * SubscriptionBulkOrder2.ExpiryDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkOrder3#ExpiryDateTime
	 * SubscriptionBulkOrder3.ExpiryDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkOrder4#ExpiryDateTime
	 * SubscriptionBulkOrder4.ExpiryDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder2#ExpiryDateTime
	 * SubscriptionMultipleOrder2.ExpiryDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder3#ExpiryDateTime
	 * SubscriptionMultipleOrder3.ExpiryDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder4#ExpiryDateTime
	 * SubscriptionMultipleOrder4.ExpiryDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder2#ExpiryDateTime
	 * SwitchOrder2.ExpiryDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder3#ExpiryDateTime
	 * SwitchOrder3.ExpiryDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder4#ExpiryDateTime
	 * SwitchOrder4.ExpiryDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder5#ExpiryDateTime
	 * RedemptionMultipleOrder5.ExpiryDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder5#ExpiryDateTime
	 * SubscriptionMultipleOrder5.ExpiryDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkOrder5#ExpiryDateTime
	 * SubscriptionBulkOrder5.ExpiryDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder6#ExpiryDateTime
	 * RedemptionMultipleOrder6.ExpiryDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder6#ExpiryDateTime
	 * SubscriptionMultipleOrder6.ExpiryDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder7#ExpiryDateTime
	 * SwitchOrder7.ExpiryDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkOrder6#ExpiryDateTime
	 * RedemptionBulkOrder6.ExpiryDateTime}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder
	 * InvestmentFundOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpiryDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date on which the order expires."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ExpiryDateTime = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RedemptionBulkOrder2.ExpiryDateTime, com.tools20022.repository.msg.RedemptionBulkOrder3.ExpiryDateTime,
					com.tools20022.repository.msg.RedemptionBulkOrder4.ExpiryDateTime, com.tools20022.repository.msg.RedemptionMultipleOrder2.ExpiryDateTime, com.tools20022.repository.msg.RedemptionMultipleOrder3.ExpiryDateTime,
					com.tools20022.repository.msg.RedemptionMultipleOrder4.ExpiryDateTime, com.tools20022.repository.msg.SubscriptionBulkOrder2.ExpiryDateTime, com.tools20022.repository.msg.SubscriptionBulkOrder3.ExpiryDateTime,
					com.tools20022.repository.msg.SubscriptionBulkOrder4.ExpiryDateTime, com.tools20022.repository.msg.SubscriptionMultipleOrder2.ExpiryDateTime, com.tools20022.repository.msg.SubscriptionMultipleOrder3.ExpiryDateTime,
					com.tools20022.repository.msg.SubscriptionMultipleOrder4.ExpiryDateTime, com.tools20022.repository.msg.SwitchOrder2.ExpiryDateTime, com.tools20022.repository.msg.SwitchOrder3.ExpiryDateTime,
					com.tools20022.repository.msg.SwitchOrder4.ExpiryDateTime, com.tools20022.repository.msg.RedemptionMultipleOrder5.ExpiryDateTime, com.tools20022.repository.msg.SubscriptionMultipleOrder5.ExpiryDateTime,
					com.tools20022.repository.msg.SubscriptionBulkOrder5.ExpiryDateTime, com.tools20022.repository.msg.RedemptionMultipleOrder6.ExpiryDateTime, com.tools20022.repository.msg.SubscriptionMultipleOrder6.ExpiryDateTime,
					com.tools20022.repository.msg.SwitchOrder7.ExpiryDateTime, com.tools20022.repository.msg.RedemptionBulkOrder6.ExpiryDateTime);
			elementContext_lazy = () -> InvestmentFundOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExpiryDateTime";
			definition = "Date on which the order expires.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Cancellation right of an investor with respect to an investment fund
	 * order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CancellationRightCode
	 * CancellationRightCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkOrder2#CancellationRight
	 * RedemptionBulkOrder2.CancellationRight}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkOrder3#CancellationRight
	 * RedemptionBulkOrder3.CancellationRight}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkOrder3#ExtendedCancellationRight
	 * RedemptionBulkOrder3.ExtendedCancellationRight}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkExecution2#CancellationRight
	 * RedemptionBulkExecution2.CancellationRight}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkExecution3#CancellationRight
	 * RedemptionBulkExecution3.CancellationRight}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkExecution3#ExtendedCancellationRight
	 * RedemptionBulkExecution3.ExtendedCancellationRight}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkOrder4#CancellationRight
	 * RedemptionBulkOrder4.CancellationRight}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkOrder4#ExtendedCancellationRight
	 * RedemptionBulkOrder4.ExtendedCancellationRight}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder2#CancellationRight
	 * RedemptionMultipleOrder2.CancellationRight}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder3#CancellationRight
	 * RedemptionMultipleOrder3.CancellationRight}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder3#ExtendedCancellationRight
	 * RedemptionMultipleOrder3.ExtendedCancellationRight}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution2#CancellationRight
	 * RedemptionMultipleExecution2.CancellationRight}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution3#CancellationRight
	 * RedemptionMultipleExecution3.CancellationRight}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution3#ExtendedCancellationRight
	 * RedemptionMultipleExecution3.ExtendedCancellationRight}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder4#CancellationRight
	 * RedemptionMultipleOrder4.CancellationRight}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder4#ExtendedCancellationRight
	 * RedemptionMultipleOrder4.ExtendedCancellationRight}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkOrder2#CancellationRight
	 * SubscriptionBulkOrder2.CancellationRight}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkOrder3#CancellationRight
	 * SubscriptionBulkOrder3.CancellationRight}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkOrder3#ExtendedCancellationRight
	 * SubscriptionBulkOrder3.ExtendedCancellationRight}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkExecution2#CancellationRight
	 * SubscriptionBulkExecution2.CancellationRight}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkExecution3#CancellationRight
	 * SubscriptionBulkExecution3.CancellationRight}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkExecution3#ExtendedCancellationRight
	 * SubscriptionBulkExecution3.ExtendedCancellationRight}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkOrder4#CancellationRight
	 * SubscriptionBulkOrder4.CancellationRight}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkOrder4#ExtendedCancellationRight
	 * SubscriptionBulkOrder4.ExtendedCancellationRight}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder2#CancellationRight
	 * SubscriptionMultipleOrder2.CancellationRight}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder3#CancellationRight
	 * SubscriptionMultipleOrder3.CancellationRight}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder3#ExtendedCancellationRight
	 * SubscriptionMultipleOrder3.ExtendedCancellationRight}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleExecution2#CancellationRight
	 * SubscriptionMultipleExecution2.CancellationRight}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleExecution3#CancellationRight
	 * SubscriptionMultipleExecution3.CancellationRight}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleExecution3#ExtendedCancellationRight
	 * SubscriptionMultipleExecution3.ExtendedCancellationRight}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder4#CancellationRight
	 * SubscriptionMultipleOrder4.CancellationRight}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder4#ExtendedCancellationRight
	 * SubscriptionMultipleOrder4.ExtendedCancellationRight}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder2#CancellationRight
	 * SwitchOrder2.CancellationRight}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder3#CancellationRight
	 * SwitchOrder3.CancellationRight}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder3#ExtendedCancellationRight
	 * SwitchOrder3.ExtendedCancellationRight}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder4#CancellationRight
	 * SwitchOrder4.CancellationRight}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder4#ExtendedCancellationRight
	 * SwitchOrder4.ExtendedCancellationRight}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution7#CancellationRight
	 * SwitchExecution7.CancellationRight}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkOrder5#CancellationRight
	 * SubscriptionBulkOrder5.CancellationRight}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkExecution5#CancellationRight
	 * RedemptionBulkExecution5.CancellationRight}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution5#CancellationRight
	 * RedemptionMultipleExecution5.CancellationRight}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder6#CancellationRight
	 * RedemptionMultipleOrder6.CancellationRight}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder6#CancellationRight
	 * SubscriptionMultipleOrder6.CancellationRight}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkExecution4#CancellationRight
	 * SubscriptionBulkExecution4.CancellationRight}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder7#CancellationRight
	 * SwitchOrder7.CancellationRight}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkOrder6#CancellationRight
	 * RedemptionBulkOrder6.CancellationRight}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleExecution5#CancellationRight
	 * SubscriptionMultipleExecution5.CancellationRight}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationRight1Choice#Code
	 * CancellationRight1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationRight1Choice#Proprietary
	 * CancellationRight1Choice.Proprietary}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder
	 * InvestmentFundOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationRight"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cancellation right of an investor with respect to an investment fund order."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CancellationRight = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RedemptionBulkOrder2.CancellationRight, com.tools20022.repository.msg.RedemptionBulkOrder3.CancellationRight,
					com.tools20022.repository.msg.RedemptionBulkOrder3.ExtendedCancellationRight, com.tools20022.repository.msg.RedemptionBulkExecution2.CancellationRight,
					com.tools20022.repository.msg.RedemptionBulkExecution3.CancellationRight, com.tools20022.repository.msg.RedemptionBulkExecution3.ExtendedCancellationRight,
					com.tools20022.repository.msg.RedemptionBulkOrder4.CancellationRight, com.tools20022.repository.msg.RedemptionBulkOrder4.ExtendedCancellationRight,
					com.tools20022.repository.msg.RedemptionMultipleOrder2.CancellationRight, com.tools20022.repository.msg.RedemptionMultipleOrder3.CancellationRight,
					com.tools20022.repository.msg.RedemptionMultipleOrder3.ExtendedCancellationRight, com.tools20022.repository.msg.RedemptionMultipleExecution2.CancellationRight,
					com.tools20022.repository.msg.RedemptionMultipleExecution3.CancellationRight, com.tools20022.repository.msg.RedemptionMultipleExecution3.ExtendedCancellationRight,
					com.tools20022.repository.msg.RedemptionMultipleOrder4.CancellationRight, com.tools20022.repository.msg.RedemptionMultipleOrder4.ExtendedCancellationRight,
					com.tools20022.repository.msg.SubscriptionBulkOrder2.CancellationRight, com.tools20022.repository.msg.SubscriptionBulkOrder3.CancellationRight,
					com.tools20022.repository.msg.SubscriptionBulkOrder3.ExtendedCancellationRight, com.tools20022.repository.msg.SubscriptionBulkExecution2.CancellationRight,
					com.tools20022.repository.msg.SubscriptionBulkExecution3.CancellationRight, com.tools20022.repository.msg.SubscriptionBulkExecution3.ExtendedCancellationRight,
					com.tools20022.repository.msg.SubscriptionBulkOrder4.CancellationRight, com.tools20022.repository.msg.SubscriptionBulkOrder4.ExtendedCancellationRight,
					com.tools20022.repository.msg.SubscriptionMultipleOrder2.CancellationRight, com.tools20022.repository.msg.SubscriptionMultipleOrder3.CancellationRight,
					com.tools20022.repository.msg.SubscriptionMultipleOrder3.ExtendedCancellationRight, com.tools20022.repository.msg.SubscriptionMultipleExecution2.CancellationRight,
					com.tools20022.repository.msg.SubscriptionMultipleExecution3.CancellationRight, com.tools20022.repository.msg.SubscriptionMultipleExecution3.ExtendedCancellationRight,
					com.tools20022.repository.msg.SubscriptionMultipleOrder4.CancellationRight, com.tools20022.repository.msg.SubscriptionMultipleOrder4.ExtendedCancellationRight,
					com.tools20022.repository.msg.SwitchOrder2.CancellationRight, com.tools20022.repository.msg.SwitchOrder3.CancellationRight, com.tools20022.repository.msg.SwitchOrder3.ExtendedCancellationRight,
					com.tools20022.repository.msg.SwitchOrder4.CancellationRight, com.tools20022.repository.msg.SwitchOrder4.ExtendedCancellationRight, com.tools20022.repository.msg.SwitchExecution7.CancellationRight,
					com.tools20022.repository.msg.SubscriptionBulkOrder5.CancellationRight, com.tools20022.repository.msg.RedemptionBulkExecution5.CancellationRight,
					com.tools20022.repository.msg.RedemptionMultipleExecution5.CancellationRight, com.tools20022.repository.msg.RedemptionMultipleOrder6.CancellationRight,
					com.tools20022.repository.msg.SubscriptionMultipleOrder6.CancellationRight, com.tools20022.repository.msg.SubscriptionBulkExecution4.CancellationRight, com.tools20022.repository.msg.SwitchOrder7.CancellationRight,
					com.tools20022.repository.msg.RedemptionBulkOrder6.CancellationRight, com.tools20022.repository.msg.SubscriptionMultipleExecution5.CancellationRight, com.tools20022.repository.choice.CancellationRight1Choice.Code,
					com.tools20022.repository.choice.CancellationRight1Choice.Proprietary);
			elementContext_lazy = () -> InvestmentFundOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CancellationRight";
			definition = "Cancellation right of an investor with respect to an investment fund order.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CancellationRightCode.mmObject();
		}
	};
	/**
	 * Currency requested for settlement of cash proceeds.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkOrder2#RequestedSettlementCurrency
	 * RedemptionBulkOrder2.RequestedSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkOrder3#RequestedSettlementCurrency
	 * RedemptionBulkOrder3.RequestedSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkExecution2#RequestedSettlementCurrency
	 * RedemptionBulkExecution2.RequestedSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkExecution3#RequestedSettlementCurrency
	 * RedemptionBulkExecution3.RequestedSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkOrder4#RequestedSettlementCurrency
	 * RedemptionBulkOrder4.RequestedSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder4#RequestedSettlementCurrency
	 * RedemptionOrder4.RequestedSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder6#RequestedSettlementCurrency
	 * RedemptionOrder6.RequestedSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution4#RequestedSettlementCurrency
	 * RedemptionExecution4.RequestedSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#RequestedSettlementCurrency
	 * RedemptionExecution6.RequestedSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder8#RequestedSettlementCurrency
	 * RedemptionOrder8.RequestedSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkOrder2#RequestedSettlementCurrency
	 * SubscriptionBulkOrder2.RequestedSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkOrder3#RequestedSettlementCurrency
	 * SubscriptionBulkOrder3.RequestedSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkExecution2#RequestedSettlementCurrency
	 * SubscriptionBulkExecution2.RequestedSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkExecution3#RequestedSettlementCurrency
	 * SubscriptionBulkExecution3.RequestedSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkOrder4#RequestedSettlementCurrency
	 * SubscriptionBulkOrder4.RequestedSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder4#RequestedSettlementCurrency
	 * SubscriptionOrder4.RequestedSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder6#RequestedSettlementCurrency
	 * SubscriptionOrder6.RequestedSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution4#RequestedSettlementCurrency
	 * SubscriptionExecution4.RequestedSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#RequestedSettlementCurrency
	 * SubscriptionExecution6.RequestedSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder8#RequestedSettlementCurrency
	 * SubscriptionOrder8.RequestedSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegOrder2#RequestedSettlementCurrency
	 * SwitchRedemptionLegOrder2.RequestedSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder2#RequestedSettlementCurrency
	 * SwitchSubscriptionLegOrder2.RequestedSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegOrder3#RequestedSettlementCurrency
	 * SwitchRedemptionLegOrder3.RequestedSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder3#RequestedSettlementCurrency
	 * SwitchSubscriptionLegOrder3.RequestedSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution2#RequestedSettlementCurrency
	 * SwitchRedemptionLegExecution2.RequestedSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution2#RequestedSettlementCurrency
	 * SwitchSubscriptionLegExecution2.RequestedSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution3#RequestedSettlementCurrency
	 * SwitchRedemptionLegExecution3.RequestedSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution3#RequestedSettlementCurrency
	 * SwitchSubscriptionLegExecution3.RequestedSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution10#RequestedSettlementCurrency
	 * RedemptionExecution10.RequestedSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder9#RequestedSettlementCurrency
	 * RedemptionOrder9.RequestedSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7#RequestedSettlementCurrency
	 * SubscriptionExecution7.RequestedSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder9#RequestedSettlementCurrency
	 * SubscriptionOrder9.RequestedSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder11#RequestedSettlementCurrency
	 * RedemptionOrder11.RequestedSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution12#RequestedSettlementCurrency
	 * RedemptionExecution12.RequestedSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder11#RequestedSettlementCurrency
	 * SubscriptionOrder11.RequestedSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution9#RequestedSettlementCurrency
	 * SubscriptionExecution9.RequestedSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkOrder5#RequestedSettlementCurrency
	 * SubscriptionBulkOrder5.RequestedSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkExecution5#RequestedSettlementCurrency
	 * RedemptionBulkExecution5.RequestedSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkExecution4#RequestedSettlementCurrency
	 * SubscriptionBulkExecution4.RequestedSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkOrder6#RequestedSettlementCurrency
	 * RedemptionBulkOrder6.RequestedSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder14#RequestedSettlementCurrency
	 * RedemptionOrder14.RequestedSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder6#RequestedSettlementCurrency
	 * SwitchSubscriptionLegOrder6.RequestedSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#RequestedSettlementCurrency
	 * SubscriptionExecution13.RequestedSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegOrder6#RequestedSettlementCurrency
	 * SwitchRedemptionLegOrder6.RequestedSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder14#RequestedSettlementCurrency
	 * SubscriptionOrder14.RequestedSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution4#RequestedSettlementCurrency
	 * SwitchSubscriptionLegExecution4.RequestedSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#RequestedSettlementCurrency
	 * RedemptionExecution15.RequestedSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution4#RequestedSettlementCurrency
	 * SwitchRedemptionLegExecution4.RequestedSettlementCurrency}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder
	 * InvestmentFundOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedSettlementCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency requested for settlement of cash proceeds."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute RequestedSettlementCurrency = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RedemptionBulkOrder2.RequestedSettlementCurrency, com.tools20022.repository.msg.RedemptionBulkOrder3.RequestedSettlementCurrency,
					com.tools20022.repository.msg.RedemptionBulkExecution2.RequestedSettlementCurrency, com.tools20022.repository.msg.RedemptionBulkExecution3.RequestedSettlementCurrency,
					com.tools20022.repository.msg.RedemptionBulkOrder4.RequestedSettlementCurrency, com.tools20022.repository.msg.RedemptionOrder4.RequestedSettlementCurrency,
					com.tools20022.repository.msg.RedemptionOrder6.RequestedSettlementCurrency, com.tools20022.repository.msg.RedemptionExecution4.RequestedSettlementCurrency,
					com.tools20022.repository.msg.RedemptionExecution6.RequestedSettlementCurrency, com.tools20022.repository.msg.RedemptionOrder8.RequestedSettlementCurrency,
					com.tools20022.repository.msg.SubscriptionBulkOrder2.RequestedSettlementCurrency, com.tools20022.repository.msg.SubscriptionBulkOrder3.RequestedSettlementCurrency,
					com.tools20022.repository.msg.SubscriptionBulkExecution2.RequestedSettlementCurrency, com.tools20022.repository.msg.SubscriptionBulkExecution3.RequestedSettlementCurrency,
					com.tools20022.repository.msg.SubscriptionBulkOrder4.RequestedSettlementCurrency, com.tools20022.repository.msg.SubscriptionOrder4.RequestedSettlementCurrency,
					com.tools20022.repository.msg.SubscriptionOrder6.RequestedSettlementCurrency, com.tools20022.repository.msg.SubscriptionExecution4.RequestedSettlementCurrency,
					com.tools20022.repository.msg.SubscriptionExecution6.RequestedSettlementCurrency, com.tools20022.repository.msg.SubscriptionOrder8.RequestedSettlementCurrency,
					com.tools20022.repository.msg.SwitchRedemptionLegOrder2.RequestedSettlementCurrency, com.tools20022.repository.msg.SwitchSubscriptionLegOrder2.RequestedSettlementCurrency,
					com.tools20022.repository.msg.SwitchRedemptionLegOrder3.RequestedSettlementCurrency, com.tools20022.repository.msg.SwitchSubscriptionLegOrder3.RequestedSettlementCurrency,
					com.tools20022.repository.msg.SwitchRedemptionLegExecution2.RequestedSettlementCurrency, com.tools20022.repository.msg.SwitchSubscriptionLegExecution2.RequestedSettlementCurrency,
					com.tools20022.repository.msg.SwitchRedemptionLegExecution3.RequestedSettlementCurrency, com.tools20022.repository.msg.SwitchSubscriptionLegExecution3.RequestedSettlementCurrency,
					com.tools20022.repository.msg.RedemptionExecution10.RequestedSettlementCurrency, com.tools20022.repository.msg.RedemptionOrder9.RequestedSettlementCurrency,
					com.tools20022.repository.msg.SubscriptionExecution7.RequestedSettlementCurrency, com.tools20022.repository.msg.SubscriptionOrder9.RequestedSettlementCurrency,
					com.tools20022.repository.msg.RedemptionOrder11.RequestedSettlementCurrency, com.tools20022.repository.msg.RedemptionExecution12.RequestedSettlementCurrency,
					com.tools20022.repository.msg.SubscriptionOrder11.RequestedSettlementCurrency, com.tools20022.repository.msg.SubscriptionExecution9.RequestedSettlementCurrency,
					com.tools20022.repository.msg.SubscriptionBulkOrder5.RequestedSettlementCurrency, com.tools20022.repository.msg.RedemptionBulkExecution5.RequestedSettlementCurrency,
					com.tools20022.repository.msg.SubscriptionBulkExecution4.RequestedSettlementCurrency, com.tools20022.repository.msg.RedemptionBulkOrder6.RequestedSettlementCurrency,
					com.tools20022.repository.msg.RedemptionOrder14.RequestedSettlementCurrency, com.tools20022.repository.msg.SwitchSubscriptionLegOrder6.RequestedSettlementCurrency,
					com.tools20022.repository.msg.SubscriptionExecution13.RequestedSettlementCurrency, com.tools20022.repository.msg.SwitchRedemptionLegOrder6.RequestedSettlementCurrency,
					com.tools20022.repository.msg.SubscriptionOrder14.RequestedSettlementCurrency, com.tools20022.repository.msg.SwitchSubscriptionLegExecution4.RequestedSettlementCurrency,
					com.tools20022.repository.msg.RedemptionExecution15.RequestedSettlementCurrency, com.tools20022.repository.msg.SwitchRedemptionLegExecution4.RequestedSettlementCurrency);
			elementContext_lazy = () -> InvestmentFundOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RequestedSettlementCurrency";
			definition = "Currency requested for settlement of cash proceeds.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	/**
	 * Date and time at which the investor requests the order to be executed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkOrder3#RequestedFutureTradeDate
	 * RedemptionBulkOrder3.RequestedFutureTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkExecution3#RequestedFutureTradeDate
	 * RedemptionBulkExecution3.RequestedFutureTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkOrder4#RequestedFutureTradeDate
	 * RedemptionBulkOrder4.RequestedFutureTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder3#RequestedFutureTradeDate
	 * RedemptionMultipleOrder3.RequestedFutureTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution3#RequestedFutureTradeDate
	 * RedemptionMultipleExecution3.RequestedFutureTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder4#RequestedFutureTradeDate
	 * RedemptionMultipleOrder4.RequestedFutureTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkOrder3#RequestedFutureTradeDate
	 * SubscriptionBulkOrder3.RequestedFutureTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkExecution3#RequestedFutureTradeDate
	 * SubscriptionBulkExecution3.RequestedFutureTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkOrder4#RequestedFutureTradeDate
	 * SubscriptionBulkOrder4.RequestedFutureTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder3#RequestedFutureTradeDate
	 * SubscriptionMultipleOrder3.RequestedFutureTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleExecution3#RequestedFutureTradeDate
	 * SubscriptionMultipleExecution3.RequestedFutureTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder4#RequestedFutureTradeDate
	 * SubscriptionMultipleOrder4.RequestedFutureTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder3#RequestedFutureTradeDate
	 * SwitchOrder3.RequestedFutureTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution4#RequestedFutureTradeDate
	 * SwitchExecution4.RequestedFutureTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder4#RequestedFutureTradeDate
	 * SwitchOrder4.RequestedFutureTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundOrderData3#RequestedTradeDate
	 * FundOrderData3.RequestedTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution10#RequestedTradeDate
	 * RedemptionExecution10.RequestedTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder9#RequestedTradeDate
	 * RedemptionOrder9.RequestedTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7#RequestedTradeDate
	 * SubscriptionExecution7.RequestedTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder9#RequestedTradeDate
	 * SubscriptionOrder9.RequestedTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution7#RequestedFutureTradeDate
	 * SwitchExecution7.RequestedFutureTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkOrder5#RequestedFutureTradeDate
	 * SubscriptionBulkOrder5.RequestedFutureTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkExecution5#RequestedFutureTradeDate
	 * RedemptionBulkExecution5.RequestedFutureTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution5#RequestedFutureTradeDate
	 * RedemptionMultipleExecution5.RequestedFutureTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder6#RequestedFutureTradeDate
	 * RedemptionMultipleOrder6.RequestedFutureTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder6#RequestedFutureTradeDate
	 * SubscriptionMultipleOrder6.RequestedFutureTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkExecution4#RequestedFutureTradeDate
	 * SubscriptionBulkExecution4.RequestedFutureTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder7#RequestedFutureTradeDate
	 * SwitchOrder7.RequestedFutureTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkOrder6#RequestedFutureTradeDate
	 * RedemptionBulkOrder6.RequestedFutureTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleExecution5#RequestedFutureTradeDate
	 * SubscriptionMultipleExecution5.RequestedFutureTradeDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder
	 * InvestmentFundOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedExecutionDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time at which the investor requests the order to be executed."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute RequestedExecutionDateTime = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RedemptionBulkOrder3.RequestedFutureTradeDate, com.tools20022.repository.msg.RedemptionBulkExecution3.RequestedFutureTradeDate,
					com.tools20022.repository.msg.RedemptionBulkOrder4.RequestedFutureTradeDate, com.tools20022.repository.msg.RedemptionMultipleOrder3.RequestedFutureTradeDate,
					com.tools20022.repository.msg.RedemptionMultipleExecution3.RequestedFutureTradeDate, com.tools20022.repository.msg.RedemptionMultipleOrder4.RequestedFutureTradeDate,
					com.tools20022.repository.msg.SubscriptionBulkOrder3.RequestedFutureTradeDate, com.tools20022.repository.msg.SubscriptionBulkExecution3.RequestedFutureTradeDate,
					com.tools20022.repository.msg.SubscriptionBulkOrder4.RequestedFutureTradeDate, com.tools20022.repository.msg.SubscriptionMultipleOrder3.RequestedFutureTradeDate,
					com.tools20022.repository.msg.SubscriptionMultipleExecution3.RequestedFutureTradeDate, com.tools20022.repository.msg.SubscriptionMultipleOrder4.RequestedFutureTradeDate,
					com.tools20022.repository.msg.SwitchOrder3.RequestedFutureTradeDate, com.tools20022.repository.msg.SwitchExecution4.RequestedFutureTradeDate, com.tools20022.repository.msg.SwitchOrder4.RequestedFutureTradeDate,
					com.tools20022.repository.msg.FundOrderData3.RequestedTradeDate, com.tools20022.repository.msg.RedemptionExecution10.RequestedTradeDate, com.tools20022.repository.msg.RedemptionOrder9.RequestedTradeDate,
					com.tools20022.repository.msg.SubscriptionExecution7.RequestedTradeDate, com.tools20022.repository.msg.SubscriptionOrder9.RequestedTradeDate, com.tools20022.repository.msg.SwitchExecution7.RequestedFutureTradeDate,
					com.tools20022.repository.msg.SubscriptionBulkOrder5.RequestedFutureTradeDate, com.tools20022.repository.msg.RedemptionBulkExecution5.RequestedFutureTradeDate,
					com.tools20022.repository.msg.RedemptionMultipleExecution5.RequestedFutureTradeDate, com.tools20022.repository.msg.RedemptionMultipleOrder6.RequestedFutureTradeDate,
					com.tools20022.repository.msg.SubscriptionMultipleOrder6.RequestedFutureTradeDate, com.tools20022.repository.msg.SubscriptionBulkExecution4.RequestedFutureTradeDate,
					com.tools20022.repository.msg.SwitchOrder7.RequestedFutureTradeDate, com.tools20022.repository.msg.RedemptionBulkOrder6.RequestedFutureTradeDate,
					com.tools20022.repository.msg.SubscriptionMultipleExecution5.RequestedFutureTradeDate);
			elementContext_lazy = () -> InvestmentFundOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RequestedExecutionDateTime";
			definition = "Date and time at which the investor requests the order to be executed.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Specifies if advice has been received from an independent financial
	 * advisor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAdviceCode
	 * FinancialAdviceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder5#FinancialAdvice
	 * RedemptionOrder5.FinancialAdvice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution5#FinancialAdvice
	 * RedemptionExecution5.FinancialAdvice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder7#FinancialAdvice
	 * RedemptionOrder7.FinancialAdvice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder6#FinancialAdvice
	 * RedemptionOrder6.FinancialAdvice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#FinancialAdvice
	 * RedemptionExecution6.FinancialAdvice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder8#FinancialAdvice
	 * RedemptionOrder8.FinancialAdvice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder5#FinancialAdvice
	 * SubscriptionOrder5.FinancialAdvice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution5#FinancialAdvice
	 * SubscriptionExecution5.FinancialAdvice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder7#FinancialAdvice
	 * SubscriptionOrder7.FinancialAdvice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder6#FinancialAdvice
	 * SubscriptionOrder6.FinancialAdvice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#FinancialAdvice
	 * SubscriptionExecution6.FinancialAdvice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder8#FinancialAdvice
	 * SubscriptionOrder8.FinancialAdvice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder3#FinancialAdvice
	 * SwitchOrder3.FinancialAdvice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution4#FinancialAdvice
	 * SwitchExecution4.FinancialAdvice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder4#FinancialAdvice
	 * SwitchOrder4.FinancialAdvice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution7#FinancialAdvice
	 * SwitchExecution7.FinancialAdvice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder7#FinancialAdvice
	 * SwitchOrder7.FinancialAdvice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder14#FinancialAdvice
	 * RedemptionOrder14.FinancialAdvice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#FinancialAdvice
	 * SubscriptionExecution13.FinancialAdvice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution12#FinancialAdvice
	 * SubscriptionExecution12.FinancialAdvice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder15#FinancialAdvice
	 * SubscriptionOrder15.FinancialAdvice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder15#FinancialAdvice
	 * RedemptionOrder15.FinancialAdvice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#FinancialAdvice
	 * RedemptionExecution16.FinancialAdvice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder14#FinancialAdvice
	 * SubscriptionOrder14.FinancialAdvice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#FinancialAdvice
	 * RedemptionExecution15.FinancialAdvice}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder
	 * InvestmentFundOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialAdvice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies if advice has been received from an independent financial advisor."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute FinancialAdvice = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RedemptionOrder5.FinancialAdvice, com.tools20022.repository.msg.RedemptionExecution5.FinancialAdvice,
					com.tools20022.repository.msg.RedemptionOrder7.FinancialAdvice, com.tools20022.repository.msg.RedemptionOrder6.FinancialAdvice, com.tools20022.repository.msg.RedemptionExecution6.FinancialAdvice,
					com.tools20022.repository.msg.RedemptionOrder8.FinancialAdvice, com.tools20022.repository.msg.SubscriptionOrder5.FinancialAdvice, com.tools20022.repository.msg.SubscriptionExecution5.FinancialAdvice,
					com.tools20022.repository.msg.SubscriptionOrder7.FinancialAdvice, com.tools20022.repository.msg.SubscriptionOrder6.FinancialAdvice, com.tools20022.repository.msg.SubscriptionExecution6.FinancialAdvice,
					com.tools20022.repository.msg.SubscriptionOrder8.FinancialAdvice, com.tools20022.repository.msg.SwitchOrder3.FinancialAdvice, com.tools20022.repository.msg.SwitchExecution4.FinancialAdvice,
					com.tools20022.repository.msg.SwitchOrder4.FinancialAdvice, com.tools20022.repository.msg.SwitchExecution7.FinancialAdvice, com.tools20022.repository.msg.SwitchOrder7.FinancialAdvice,
					com.tools20022.repository.msg.RedemptionOrder14.FinancialAdvice, com.tools20022.repository.msg.SubscriptionExecution13.FinancialAdvice, com.tools20022.repository.msg.SubscriptionExecution12.FinancialAdvice,
					com.tools20022.repository.msg.SubscriptionOrder15.FinancialAdvice, com.tools20022.repository.msg.RedemptionOrder15.FinancialAdvice, com.tools20022.repository.msg.RedemptionExecution16.FinancialAdvice,
					com.tools20022.repository.msg.SubscriptionOrder14.FinancialAdvice, com.tools20022.repository.msg.RedemptionExecution15.FinancialAdvice);
			elementContext_lazy = () -> InvestmentFundOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FinancialAdvice";
			definition = "Specifies if advice has been received from an independent financial advisor.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> FinancialAdviceCode.mmObject();
		}
	};
	/**
	 * Specifies whether the trade is negotiated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.NegotiatedTradeCode
	 * NegotiatedTradeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder5#NegotiatedTrade
	 * RedemptionOrder5.NegotiatedTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution5#NegotiatedTrade
	 * RedemptionExecution5.NegotiatedTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder7#NegotiatedTrade
	 * RedemptionOrder7.NegotiatedTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder6#NegotiatedTrade
	 * RedemptionOrder6.NegotiatedTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#NegotiatedTrade
	 * RedemptionExecution6.NegotiatedTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder8#NegotiatedTrade
	 * RedemptionOrder8.NegotiatedTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder5#NegotiatedTrade
	 * SubscriptionOrder5.NegotiatedTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution5#NegotiatedTrade
	 * SubscriptionExecution5.NegotiatedTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder7#NegotiatedTrade
	 * SubscriptionOrder7.NegotiatedTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder6#NegotiatedTrade
	 * SubscriptionOrder6.NegotiatedTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#NegotiatedTrade
	 * SubscriptionExecution6.NegotiatedTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder8#NegotiatedTrade
	 * SubscriptionOrder8.NegotiatedTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder3#NegotiatedTrade
	 * SwitchOrder3.NegotiatedTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution4#NegotiatedTrade
	 * SwitchExecution4.NegotiatedTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder4#NegotiatedTrade
	 * SwitchOrder4.NegotiatedTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution7#NegotiatedTrade
	 * SwitchExecution7.NegotiatedTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder7#NegotiatedTrade
	 * SwitchOrder7.NegotiatedTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder14#NegotiatedTrade
	 * RedemptionOrder14.NegotiatedTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#NegotiatedTrade
	 * SubscriptionExecution13.NegotiatedTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution12#NegotiatedTrade
	 * SubscriptionExecution12.NegotiatedTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder15#NegotiatedTrade
	 * SubscriptionOrder15.NegotiatedTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder15#NegotiatedTrade
	 * RedemptionOrder15.NegotiatedTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#NegotiatedTrade
	 * RedemptionExecution16.NegotiatedTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder14#NegotiatedTrade
	 * SubscriptionOrder14.NegotiatedTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#NegotiatedTrade
	 * RedemptionExecution15.NegotiatedTrade}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder
	 * InvestmentFundOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NegotiatedTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies whether the trade is negotiated."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute NegotiatedTrade = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RedemptionOrder5.NegotiatedTrade, com.tools20022.repository.msg.RedemptionExecution5.NegotiatedTrade,
					com.tools20022.repository.msg.RedemptionOrder7.NegotiatedTrade, com.tools20022.repository.msg.RedemptionOrder6.NegotiatedTrade, com.tools20022.repository.msg.RedemptionExecution6.NegotiatedTrade,
					com.tools20022.repository.msg.RedemptionOrder8.NegotiatedTrade, com.tools20022.repository.msg.SubscriptionOrder5.NegotiatedTrade, com.tools20022.repository.msg.SubscriptionExecution5.NegotiatedTrade,
					com.tools20022.repository.msg.SubscriptionOrder7.NegotiatedTrade, com.tools20022.repository.msg.SubscriptionOrder6.NegotiatedTrade, com.tools20022.repository.msg.SubscriptionExecution6.NegotiatedTrade,
					com.tools20022.repository.msg.SubscriptionOrder8.NegotiatedTrade, com.tools20022.repository.msg.SwitchOrder3.NegotiatedTrade, com.tools20022.repository.msg.SwitchExecution4.NegotiatedTrade,
					com.tools20022.repository.msg.SwitchOrder4.NegotiatedTrade, com.tools20022.repository.msg.SwitchExecution7.NegotiatedTrade, com.tools20022.repository.msg.SwitchOrder7.NegotiatedTrade,
					com.tools20022.repository.msg.RedemptionOrder14.NegotiatedTrade, com.tools20022.repository.msg.SubscriptionExecution13.NegotiatedTrade, com.tools20022.repository.msg.SubscriptionExecution12.NegotiatedTrade,
					com.tools20022.repository.msg.SubscriptionOrder15.NegotiatedTrade, com.tools20022.repository.msg.RedemptionOrder15.NegotiatedTrade, com.tools20022.repository.msg.RedemptionExecution16.NegotiatedTrade,
					com.tools20022.repository.msg.SubscriptionOrder14.NegotiatedTrade, com.tools20022.repository.msg.RedemptionExecution15.NegotiatedTrade);
			elementContext_lazy = () -> InvestmentFundOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NegotiatedTrade";
			definition = "Specifies whether the trade is negotiated.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> NegotiatedTradeCode.mmObject();
		}
	};
	/**
	 * Percentage of the financial quantity to be invested or redeemed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity11Choice#HoldingsRate
	 * FinancialInstrumentQuantity11Choice.HoldingsRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SidePocketQuantityAndAmount1#HoldingsRate
	 * SidePocketQuantityAndAmount1.HoldingsRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity10Choice#HoldingsRate
	 * FinancialInstrumentQuantity10Choice.HoldingsRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SidePocketUnitsOrAmountOrRate1Choice#HoldingsRate
	 * SidePocketUnitsOrAmountOrRate1Choice.HoldingsRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity8Choice#HoldingsRate
	 * FinancialInstrumentQuantity8Choice.HoldingsRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity12Choice#HoldingsRate
	 * FinancialInstrumentQuantity12Choice.HoldingsRate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder
	 * InvestmentFundOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HoldingsRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Percentage of the financial quantity to be invested or redeemed."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute HoldingsRate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.FinancialInstrumentQuantity11Choice.HoldingsRate, com.tools20022.repository.msg.SidePocketQuantityAndAmount1.HoldingsRate,
					com.tools20022.repository.choice.FinancialInstrumentQuantity10Choice.HoldingsRate, com.tools20022.repository.choice.SidePocketUnitsOrAmountOrRate1Choice.HoldingsRate,
					com.tools20022.repository.choice.FinancialInstrumentQuantity8Choice.HoldingsRate, com.tools20022.repository.choice.FinancialInstrumentQuantity12Choice.HoldingsRate);
			elementContext_lazy = () -> InvestmentFundOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "HoldingsRate";
			definition = "Percentage of the financial quantity to be invested or redeemed.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Reason why an order has to be handled differently, probably in a manual
	 * fashion, because for example, the investment manager has agreed a waiver
	 * to the extended terms.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.OrderWaiverReasonCode
	 * OrderWaiverReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OrderWaiverReason1Choice#Reason
	 * OrderWaiverReason1Choice.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OrderWaiverReason1Choice#Proprietary
	 * OrderWaiverReason1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation2#OrderWaiverReason
	 * AdditionalInformation2.OrderWaiverReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder9#OrderWaiverDetails
	 * RedemptionOrder9.OrderWaiverDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder9#OrderWaiverDetails
	 * SubscriptionOrder9.OrderWaiverDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution7#OrderWaiverDetails
	 * SwitchExecution7.OrderWaiverDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder7#OrderWaiverDetails
	 * SwitchOrder7.OrderWaiverDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder14#OrderWaiverDetails
	 * RedemptionOrder14.OrderWaiverDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#OrderWaiverDetails
	 * SubscriptionExecution13.OrderWaiverDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrderWaiver1#OrderWaiverReason
	 * OrderWaiver1.OrderWaiverReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution12#OrderWaiverDetails
	 * SubscriptionExecution12.OrderWaiverDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder15#OrderWaiverDetails
	 * SubscriptionOrder15.OrderWaiverDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OrderWaiverReason3Choice#Code
	 * OrderWaiverReason3Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OrderWaiverReason3Choice#Proprietary
	 * OrderWaiverReason3Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder15#OrderWaiverDetails
	 * RedemptionOrder15.OrderWaiverDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#OrderWaiverDetails
	 * RedemptionExecution16.OrderWaiverDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder14#OrderWaiverDetails
	 * SubscriptionOrder14.OrderWaiverDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#OrderWaiverDetails
	 * RedemptionExecution15.OrderWaiverDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder
	 * InvestmentFundOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderWaiverReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reason why an order has to be handled differently, probably in a manual fashion, because for example, the investment manager has agreed a waiver to the extended terms."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute OrderWaiverReason = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.OrderWaiverReason1Choice.Reason, com.tools20022.repository.choice.OrderWaiverReason1Choice.Proprietary,
					com.tools20022.repository.msg.AdditionalInformation2.OrderWaiverReason, com.tools20022.repository.msg.RedemptionOrder9.OrderWaiverDetails, com.tools20022.repository.msg.SubscriptionOrder9.OrderWaiverDetails,
					com.tools20022.repository.msg.SwitchExecution7.OrderWaiverDetails, com.tools20022.repository.msg.SwitchOrder7.OrderWaiverDetails, com.tools20022.repository.msg.RedemptionOrder14.OrderWaiverDetails,
					com.tools20022.repository.msg.SubscriptionExecution13.OrderWaiverDetails, com.tools20022.repository.msg.OrderWaiver1.OrderWaiverReason, com.tools20022.repository.msg.SubscriptionExecution12.OrderWaiverDetails,
					com.tools20022.repository.msg.SubscriptionOrder15.OrderWaiverDetails, com.tools20022.repository.choice.OrderWaiverReason3Choice.Code, com.tools20022.repository.choice.OrderWaiverReason3Choice.Proprietary,
					com.tools20022.repository.msg.RedemptionOrder15.OrderWaiverDetails, com.tools20022.repository.msg.RedemptionExecution16.OrderWaiverDetails, com.tools20022.repository.msg.SubscriptionOrder14.OrderWaiverDetails,
					com.tools20022.repository.msg.RedemptionExecution15.OrderWaiverDetails);
			elementContext_lazy = () -> InvestmentFundOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OrderWaiverReason";
			definition = "Reason why an order has to be handled differently, probably in a manual fashion, because for example, the investment manager has agreed a waiver to the extended terms.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> OrderWaiverReasonCode.mmObject();
		}
	};
	/**
	 * Indicates whether the subscription order is an initial order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder9#InitialOrderIndicator
	 * SubscriptionOrder9.InitialOrderIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder
	 * InvestmentFundOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InitialOrderIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the subscription order is an initial order."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute InitialOrderIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SubscriptionOrder9.InitialOrderIndicator);
			elementContext_lazy = () -> InvestmentFundOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InitialOrderIndicator";
			definition = "Indicates whether the subscription order is an initial order.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Date and time an investment fund order is registered on the books of
	 * either the fund or its designated agent, eg, transfer agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder
	 * InvestmentFundOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderBookingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time an investment fund order is registered on the books of either the fund or its designated agent, eg, transfer agent."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute OrderBookingDate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> InvestmentFundOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OrderBookingDate";
			definition = "Date and time an investment fund order is registered on the books of either the fund or its designated agent, eg, transfer agent.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Investment plan which triggers the standing orders.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentPlan#StandingOrder
	 * InvestmentPlan.StandingOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.InvestmentPlan
	 * InvestmentPlan}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder
	 * InvestmentFundOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentPlan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Investment plan which triggers the standing orders."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd InvestmentPlan = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> InvestmentFundOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestmentPlan";
			definition = "Investment plan which triggers the standing orders.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentPlan.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentPlan.StandingOrder;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Status of an investment fund order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus#InvestmentFundOrder
	 * SecuritiesOrderStatus.InvestmentFundOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus
	 * SecuritiesOrderStatus}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason1#ConfirmationRejected
	 * IndividualOrderConfirmationStatusAndReason1.ConfirmationRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason1#AmendmentRejected
	 * IndividualOrderConfirmationStatusAndReason1.AmendmentRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchLegReferences1#RepairedConditions
	 * SwitchLegReferences1.RepairedConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrderStatusAndReason1#Rejected
	 * SwitchOrderStatusAndReason1.Rejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrderStatusAndReason1#InRepair
	 * SwitchOrderStatusAndReason1.InRepair}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder
	 * InvestmentFundOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of an investment fund order."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd OrderStatus = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason1.ConfirmationRejected, com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason1.AmendmentRejected,
					com.tools20022.repository.msg.SwitchLegReferences1.RepairedConditions, com.tools20022.repository.msg.SwitchOrderStatusAndReason1.Rejected, com.tools20022.repository.msg.SwitchOrderStatusAndReason1.InRepair);
			elementContext_lazy = () -> InvestmentFundOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OrderStatus";
			definition = "Status of an investment fund order.";
			minOccurs = 0;
			type_lazy = () -> SecuritiesOrderStatus.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderStatus.InvestmentFundOrder;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Total amount subscribed in the current tax year.
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
	 * {@linkplain com.tools20022.repository.msg.SubscriptionInformation#TotalAmountYearToDate
	 * SubscriptionInformation.TotalAmountYearToDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionInformation1#TotalAmountYearToDate
	 * SubscriptionInformation1.TotalAmountYearToDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder
	 * InvestmentFundOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total amount subscribed in the current tax year."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TotalAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SubscriptionInformation.TotalAmountYearToDate, com.tools20022.repository.msg.SubscriptionInformation1.TotalAmountYearToDate);
			elementContext_lazy = () -> InvestmentFundOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TotalAmount";
			definition = "Total amount subscribed in the current tax year.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "InvestmentFundOrder";
				definition = "An investor's instruction to either subscribe or redeem an amount of money or its equivalent, for example other assets, into or out of an investment fund.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentPlan.StandingOrder, com.tools20022.repository.entity.SecuritiesQuantity.Order,
						com.tools20022.repository.entity.InvestmentFundTransaction.InvestmentFundOrder, com.tools20022.repository.entity.InvestmentFundOrderExecution.Order,
						com.tools20022.repository.entity.SecuritiesOrderStatus.InvestmentFundOrder);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.BlockedStatusReason2.TransactionType);
				subType_lazy = () -> Arrays.asList(RedemptionOrder.mmObject(), SwitchOrder.mmObject(), SubscriptionOrder.mmObject());
				superType_lazy = () -> SecuritiesOrder.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentFundOrder.GrossAmountIndicator, com.tools20022.repository.entity.InvestmentFundOrder.RelatedTransaction,
						com.tools20022.repository.entity.InvestmentFundOrder.OrderType, com.tools20022.repository.entity.InvestmentFundOrder.GrossAmount, com.tools20022.repository.entity.InvestmentFundOrder.UnitsNumber,
						com.tools20022.repository.entity.InvestmentFundOrder.InvestmentFundOrderExecution, com.tools20022.repository.entity.InvestmentFundOrder.NetAmount, com.tools20022.repository.entity.InvestmentFundOrder.OrderDateTime,
						com.tools20022.repository.entity.InvestmentFundOrder.ExpiryDateTime, com.tools20022.repository.entity.InvestmentFundOrder.CancellationRight,
						com.tools20022.repository.entity.InvestmentFundOrder.RequestedSettlementCurrency, com.tools20022.repository.entity.InvestmentFundOrder.RequestedExecutionDateTime,
						com.tools20022.repository.entity.InvestmentFundOrder.FinancialAdvice, com.tools20022.repository.entity.InvestmentFundOrder.NegotiatedTrade, com.tools20022.repository.entity.InvestmentFundOrder.HoldingsRate,
						com.tools20022.repository.entity.InvestmentFundOrder.OrderWaiverReason, com.tools20022.repository.entity.InvestmentFundOrder.InitialOrderIndicator,
						com.tools20022.repository.entity.InvestmentFundOrder.OrderBookingDate, com.tools20022.repository.entity.InvestmentFundOrder.InvestmentPlan, com.tools20022.repository.entity.InvestmentFundOrder.OrderStatus,
						com.tools20022.repository.entity.InvestmentFundOrder.TotalAmount);
				derivationComponent_lazy = () -> Arrays.asList(InvestmentFundOrder4.mmObject(), FundOrderType1.mmObject(), FundOrderType1Choice.mmObject(), TransferReference3.mmObject(), TransferReference2.mmObject(),
						TransferReference1.mmObject(), OriginalOrderQuantityType1.mmObject(), IndividualOrderConfirmationStatusAndReason1.mmObject(), FundOrderData1.mmObject(), SwitchLegReferences1.mmObject(),
						InvestmentFundOrder5.mmObject(), InvestmentFundOrder1.mmObject(), FundOrderType2.mmObject(), InvestmentFundsOrderBreakdown1.mmObject(), FundOrderType3.mmObject(), OrderConfirmationDetails1.mmObject(),
						InvestmentFundOrder3.mmObject(), InvestmentFundOrder2.mmObject(), FinancialInstrumentQuantity3Choice.mmObject(), FinancialInstrumentQuantity4Choice.mmObject(), FinancialInstrumentQuantity5Choice.mmObject(),
						FinancialInstrumentQuantity6Choice.mmObject(), FinancialInstrumentQuantity11Choice.mmObject(), FundOrderData3.mmObject(), FinancialInstrumentQuantity10Choice.mmObject(), OrderWaiverReason1Choice.mmObject(),
						AdditionalInformation2.mmObject(), FinancialInstrumentQuantity9Choice.mmObject(), FinancialInstrumentQuantity7Choice.mmObject(), FinancialInstrumentQuantity8Choice.mmObject(),
						FinancialInstrumentQuantity12Choice.mmObject(), FinancialInstrumentQuantity13Choice.mmObject(), InvestmentFundOrder6.mmObject(), TransferReference5.mmObject(), TransferReference6.mmObject(),
						TransferReference8.mmObject(), TransferReference7.mmObject(), OrderType2Choice.mmObject(), TransferReference9.mmObject(), TransferReference10.mmObject(), IndividualOrderConfirmationStatusAndReason2.mmObject(),
						InvestmentFundOrder11.mmObject(), InvestmentFundOrder9.mmObject(), TransactionType5Choice.mmObject(), FinancialInstrumentQuantity26Choice.mmObject(), FundOrderType4Choice.mmObject(), OrderWaiver1.mmObject(),
						InvestmentFundsOrderBreakdown2.mmObject(), OrderWaiverReason3Choice.mmObject(), FundOrderData5.mmObject(), FinancialInstrumentQuantity29Choice.mmObject(), InvestmentFundOrder8.mmObject(),
						SwitchLegReferences2.mmObject(), BlockedStatusReason2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}