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
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.SecuritiesOrder;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmGrossAmountIndicator
 * InvestmentFundOrder.mmGrossAmountIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmRelatedTransaction
 * InvestmentFundOrder.mmRelatedTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmOrderType
 * InvestmentFundOrder.mmOrderType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmGrossAmount
 * InvestmentFundOrder.mmGrossAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmUnitsNumber
 * InvestmentFundOrder.mmUnitsNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmInvestmentFundOrderExecution
 * InvestmentFundOrder.mmInvestmentFundOrderExecution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmNetAmount
 * InvestmentFundOrder.mmNetAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmOrderDateTime
 * InvestmentFundOrder.mmOrderDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmExpiryDateTime
 * InvestmentFundOrder.mmExpiryDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmCancellationRight
 * InvestmentFundOrder.mmCancellationRight}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmRequestedSettlementCurrency
 * InvestmentFundOrder.mmRequestedSettlementCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmRequestedExecutionDateTime
 * InvestmentFundOrder.mmRequestedExecutionDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmFinancialAdvice
 * InvestmentFundOrder.mmFinancialAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmNegotiatedTrade
 * InvestmentFundOrder.mmNegotiatedTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmHoldingsRate
 * InvestmentFundOrder.mmHoldingsRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmOrderWaiverReason
 * InvestmentFundOrder.mmOrderWaiverReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmInitialOrderIndicator
 * InvestmentFundOrder.mmInitialOrderIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmOrderBookingDate
 * InvestmentFundOrder.mmOrderBookingDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmInvestmentPlan
 * InvestmentFundOrder.mmInvestmentPlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmOrderStatus
 * InvestmentFundOrder.mmOrderStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmTotalAmount
 * InvestmentFundOrder.mmTotalAmount}</li>
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
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentPlan#mmStandingOrder
 * InvestmentPlan.mmStandingOrder}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmOrder
 * SecuritiesQuantity.mmOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#mmInvestmentFundOrder
 * InvestmentFundTransaction.mmInvestmentFundOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmOrder
 * InvestmentFundOrderExecution.mmOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus#mmInvestmentFundOrder
 * SecuritiesOrderStatus.mmInvestmentFundOrder}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BlockedStatusReason2#mmTransactionType
 * BlockedStatusReason2.mmTransactionType}</li>
 * </ul>
 * </li>
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
 * "InvestmentFundOrder"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "An investor's instruction to either subscribe or redeem an amount of money or its equivalent, for example other assets, into or out of an investment fund."
 * </li>
 * </ul>
 */
public class InvestmentFundOrder extends SecuritiesOrder {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected YesNoIndicator grossAmountIndicator;
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan2#mmGrossAmountIndicator
	 * InvestmentPlan2.mmGrossAmountIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan4#mmGrossAmountIndicator
	 * InvestmentPlan4.mmGrossAmountIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan6#mmGrossAmountIndicator
	 * InvestmentPlan6.mmGrossAmountIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan5#mmGrossAmountIndicator
	 * InvestmentPlan5.mmGrossAmountIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan3#mmGrossAmountIndicator
	 * InvestmentPlan3.mmGrossAmountIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan7#mmGrossAmountIndicator
	 * InvestmentPlan7.mmGrossAmountIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan9#mmGrossAmountIndicator
	 * InvestmentPlan9.mmGrossAmountIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan8#mmGrossAmountIndicator
	 * InvestmentPlan8.mmGrossAmountIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan10#mmGrossAmountIndicator
	 * InvestmentPlan10.mmGrossAmountIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan11#mmGrossAmountIndicator
	 * InvestmentPlan11.mmGrossAmountIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan12#mmGrossAmountIndicator
	 * InvestmentPlan12.mmGrossAmountIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan13#mmGrossAmountIndicator
	 * InvestmentPlan13.mmGrossAmountIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan14#mmGrossAmountIndicator
	 * InvestmentPlan14.mmGrossAmountIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan15#mmGrossAmountIndicator
	 * InvestmentPlan15.mmGrossAmountIndicator}</li>
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
	public static final MMBusinessAttribute mmGrossAmountIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(InvestmentPlan2.mmGrossAmountIndicator, InvestmentPlan4.mmGrossAmountIndicator, InvestmentPlan6.mmGrossAmountIndicator, InvestmentPlan5.mmGrossAmountIndicator,
					InvestmentPlan3.mmGrossAmountIndicator, InvestmentPlan7.mmGrossAmountIndicator, InvestmentPlan9.mmGrossAmountIndicator, InvestmentPlan8.mmGrossAmountIndicator, InvestmentPlan10.mmGrossAmountIndicator,
					InvestmentPlan11.mmGrossAmountIndicator, InvestmentPlan12.mmGrossAmountIndicator, InvestmentPlan13.mmGrossAmountIndicator, InvestmentPlan14.mmGrossAmountIndicator, InvestmentPlan15.mmGrossAmountIndicator);
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrder.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GrossAmountIndicator";
			definition = "Indicates whether an ordered amount is a gross amount (including all charges, commissions, tax). If it is not a gross amount, the ordered amount is a net amount (amount to be invested or redeemed from the fund to which other elements will be added).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundOrder.class.getMethod("getGrossAmountIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected InvestmentFundTransaction relatedTransaction;
	/**
	 * Transaction which is the source of the order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#mmInvestmentFundOrder
	 * InvestmentFundTransaction.mmInvestmentFundOrder}</li>
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
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason1#mmInvestmentAccountOrFinancialInstrument
	 * IndividualOrderStatusAndReason1.mmInvestmentAccountOrFinancialInstrument}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrder6#mmOrderDetails
	 * InvestmentFundOrder6.mmOrderDetails}</li>
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
	public static final MMBusinessAssociationEnd mmRelatedTransaction = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(IndividualOrderStatusAndReason1.mmInvestmentAccountOrFinancialInstrument, InvestmentFundOrder6.mmOrderDetails);
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrder.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedTransaction";
			definition = "Transaction which is the source of the order.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundTransaction.mmInvestmentFundOrder;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentFundTransaction.mmObject();
		}
	};
	protected FundOrderTypeCode orderType;
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
	 * {@linkplain com.tools20022.repository.choice.FundOrderType1Choice#mmType
	 * FundOrderType1Choice.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FundOrderType1Choice#mmProprietary
	 * FundOrderType1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder3#mmOrderType
	 * RedemptionOrder3.mmOrderType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.FundOrderType2#mmOrderType
	 * FundOrderType2.mmOrderType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundOrderType2#mmExtendedOrderType
	 * FundOrderType2.mmExtendedOrderType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundsOrderBreakdown1#mmOrderBreakdownType
	 * InvestmentFundsOrderBreakdown1.mmOrderBreakdownType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundsOrderBreakdown1#mmExtendedOrderBreakdownType
	 * InvestmentFundsOrderBreakdown1.mmExtendedOrderBreakdownType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder5#mmOrderType
	 * RedemptionOrder5.mmOrderType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution3#mmOrderType
	 * RedemptionExecution3.mmOrderType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.FundOrderType3#mmOrderType
	 * FundOrderType3.mmOrderType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundOrderType3#mmExtendedOrderType
	 * FundOrderType3.mmExtendedOrderType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution5#mmOrderType
	 * RedemptionExecution5.mmOrderType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder7#mmOrderType
	 * RedemptionOrder7.mmOrderType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder4#mmOrderType
	 * RedemptionOrder4.mmOrderType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder6#mmOrderType
	 * RedemptionOrder6.mmOrderType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution4#mmOrderType
	 * RedemptionExecution4.mmOrderType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#mmOrderType
	 * RedemptionExecution6.mmOrderType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder8#mmOrderType
	 * RedemptionOrder8.mmOrderType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder3#mmOrderType
	 * SubscriptionOrder3.mmOrderType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder5#mmOrderType
	 * SubscriptionOrder5.mmOrderType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution3#mmOrderType
	 * SubscriptionExecution3.mmOrderType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution5#mmOrderType
	 * SubscriptionExecution5.mmOrderType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder7#mmOrderType
	 * SubscriptionOrder7.mmOrderType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder4#mmOrderType
	 * SubscriptionOrder4.mmOrderType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder6#mmOrderType
	 * SubscriptionOrder6.mmOrderType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution4#mmOrderType
	 * SubscriptionExecution4.mmOrderType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#mmOrderType
	 * SubscriptionExecution6.mmOrderType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder8#mmOrderType
	 * SubscriptionOrder8.mmOrderType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution10#mmHedgeFundOrderType
	 * RedemptionExecution10.mmHedgeFundOrderType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder9#mmHedgeFundOrderType
	 * RedemptionOrder9.mmHedgeFundOrderType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7#mmHedgeFundOrderType
	 * SubscriptionExecution7.mmHedgeFundOrderType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder9#mmHedgeFundOrderType
	 * SubscriptionOrder9.mmHedgeFundOrderType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrderExecution3#mmConfirmationType
	 * InvestmentFundOrderExecution3.mmConfirmationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrder6#mmOrderType
	 * InvestmentFundOrder6.mmOrderType}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.OrderType2Choice#mmType
	 * OrderType2Choice.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OrderType2Choice#mmProprietary
	 * OrderType2Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OrderBreakdownType1Choice#mmCode
	 * OrderBreakdownType1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OrderBreakdownType1Choice#mmProprietary
	 * OrderBreakdownType1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder14#mmOrderType
	 * RedemptionOrder14.mmOrderType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TransactionType5Choice#mmCode
	 * TransactionType5Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TransactionType5Choice#mmProprietary
	 * TransactionType5Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FundOrderType4Choice#mmCode
	 * FundOrderType4Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FundOrderType4Choice#mmProprietary
	 * FundOrderType4Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmOrderType
	 * SubscriptionExecution13.mmOrderType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundsOrderBreakdown2#mmOrderBreakdownType
	 * InvestmentFundsOrderBreakdown2.mmOrderBreakdownType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution12#mmOrderType
	 * SubscriptionExecution12.mmOrderType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder15#mmOrderType
	 * SubscriptionOrder15.mmOrderType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder15#mmOrderType
	 * RedemptionOrder15.mmOrderType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#mmOrderType
	 * RedemptionExecution16.mmOrderType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder14#mmOrderType
	 * SubscriptionOrder14.mmOrderType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#mmOrderType
	 * RedemptionExecution15.mmOrderType}</li>
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
	public static final MMBusinessAttribute mmOrderType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(FundOrderType1Choice.mmType, FundOrderType1Choice.mmProprietary, RedemptionOrder3.mmOrderType, FundOrderType2.mmOrderType, FundOrderType2.mmExtendedOrderType,
					InvestmentFundsOrderBreakdown1.mmOrderBreakdownType, InvestmentFundsOrderBreakdown1.mmExtendedOrderBreakdownType, RedemptionOrder5.mmOrderType, RedemptionExecution3.mmOrderType, FundOrderType3.mmOrderType,
					FundOrderType3.mmExtendedOrderType, RedemptionExecution5.mmOrderType, RedemptionOrder7.mmOrderType, RedemptionOrder4.mmOrderType, RedemptionOrder6.mmOrderType, RedemptionExecution4.mmOrderType,
					RedemptionExecution6.mmOrderType, RedemptionOrder8.mmOrderType, SubscriptionOrder3.mmOrderType, SubscriptionOrder5.mmOrderType, SubscriptionExecution3.mmOrderType, SubscriptionExecution5.mmOrderType,
					SubscriptionOrder7.mmOrderType, SubscriptionOrder4.mmOrderType, SubscriptionOrder6.mmOrderType, SubscriptionExecution4.mmOrderType, SubscriptionExecution6.mmOrderType, SubscriptionOrder8.mmOrderType,
					RedemptionExecution10.mmHedgeFundOrderType, RedemptionOrder9.mmHedgeFundOrderType, SubscriptionExecution7.mmHedgeFundOrderType, SubscriptionOrder9.mmHedgeFundOrderType, InvestmentFundOrderExecution3.mmConfirmationType,
					InvestmentFundOrder6.mmOrderType, OrderType2Choice.mmType, OrderType2Choice.mmProprietary, OrderBreakdownType1Choice.mmCode, OrderBreakdownType1Choice.mmProprietary, RedemptionOrder14.mmOrderType,
					TransactionType5Choice.mmCode, TransactionType5Choice.mmProprietary, FundOrderType4Choice.mmCode, FundOrderType4Choice.mmProprietary, SubscriptionExecution13.mmOrderType,
					InvestmentFundsOrderBreakdown2.mmOrderBreakdownType, SubscriptionExecution12.mmOrderType, SubscriptionOrder15.mmOrderType, RedemptionOrder15.mmOrderType, RedemptionExecution16.mmOrderType,
					SubscriptionOrder14.mmOrderType, RedemptionExecution15.mmOrderType);
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrder.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OrderType";
			definition = "Specifies the category of the investment fund order.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FundOrderTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundOrder.class.getMethod("getOrderType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyAndAmount grossAmount;
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
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundOrderData1#mmGrossAmount
	 * FundOrderData1.mmGrossAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder3#mmGrossAmount
	 * RedemptionOrder3.mmGrossAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder5#mmGrossAmount
	 * RedemptionOrder5.mmGrossAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution3#mmGrossAmount
	 * RedemptionExecution3.mmGrossAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution5#mmGrossAmount
	 * RedemptionExecution5.mmGrossAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder7#mmGrossAmount
	 * RedemptionOrder7.mmGrossAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder4#mmGrossAmount
	 * RedemptionOrder4.mmGrossAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder6#mmGrossAmount
	 * RedemptionOrder6.mmGrossAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution4#mmGrossAmount
	 * RedemptionExecution4.mmGrossAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#mmGrossAmount
	 * RedemptionExecution6.mmGrossAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder8#mmGrossAmount
	 * RedemptionOrder8.mmGrossAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder3#mmGrossAmount
	 * SubscriptionOrder3.mmGrossAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder5#mmGrossAmount
	 * SubscriptionOrder5.mmGrossAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution3#mmGrossAmount
	 * SubscriptionExecution3.mmGrossAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution5#mmGrossAmount
	 * SubscriptionExecution5.mmGrossAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder7#mmGrossAmount
	 * SubscriptionOrder7.mmGrossAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder4#mmGrossAmount
	 * SubscriptionOrder4.mmGrossAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder6#mmGrossAmount
	 * SubscriptionOrder6.mmGrossAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution4#mmGrossAmount
	 * SubscriptionExecution4.mmGrossAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#mmGrossAmount
	 * SubscriptionExecution6.mmGrossAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder8#mmGrossAmount
	 * SubscriptionOrder8.mmGrossAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity3Choice#mmGrossAmount
	 * FinancialInstrumentQuantity3Choice.mmGrossAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity4Choice#mmGrossAmount
	 * FinancialInstrumentQuantity4Choice.mmGrossAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity5Choice#mmGrossAmount
	 * FinancialInstrumentQuantity5Choice.mmGrossAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity6Choice#mmGrossAmount
	 * FinancialInstrumentQuantity6Choice.mmGrossAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution2#mmGrossAmount
	 * SwitchRedemptionLegExecution2.mmGrossAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution2#mmGrossAmount
	 * SwitchSubscriptionLegExecution2.mmGrossAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution3#mmGrossAmount
	 * SwitchRedemptionLegExecution3.mmGrossAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution3#mmGrossAmount
	 * SwitchSubscriptionLegExecution3.mmGrossAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentQuantity2#mmGrossAmount
	 * FinancialInstrumentQuantity2.mmGrossAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentQuantity3#mmGrossAmount
	 * FinancialInstrumentQuantity3.mmGrossAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity7Choice#mmGrossAmount
	 * FinancialInstrumentQuantity7Choice.mmGrossAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity8Choice#mmGrossAmount
	 * FinancialInstrumentQuantity8Choice.mmGrossAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity12Choice#mmGrossAmount
	 * FinancialInstrumentQuantity12Choice.mmGrossAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity13Choice#mmGrossAmount
	 * FinancialInstrumentQuantity13Choice.mmGrossAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder11#mmGrossAmount
	 * RedemptionOrder11.mmGrossAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution12#mmGrossAmount
	 * RedemptionExecution12.mmGrossAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder11#mmGrossAmount
	 * SubscriptionOrder11.mmGrossAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution9#mmGrossAmount
	 * SubscriptionExecution9.mmGrossAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity26Choice#mmGrossAmount
	 * FinancialInstrumentQuantity26Choice.mmGrossAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmGrossAmount
	 * SubscriptionExecution13.mmGrossAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution12#mmGrossAmount
	 * SubscriptionExecution12.mmGrossAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundOrderData5#mmGrossAmount
	 * FundOrderData5.mmGrossAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity29Choice#mmGrossAmount
	 * FinancialInstrumentQuantity29Choice.mmGrossAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity28Choice#mmGrossAmount
	 * FinancialInstrumentQuantity28Choice.mmGrossAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#mmGrossAmount
	 * RedemptionExecution16.mmGrossAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution4#mmGrossAmount
	 * SwitchSubscriptionLegExecution4.mmGrossAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity27Choice#mmGrossAmount
	 * FinancialInstrumentQuantity27Choice.mmGrossAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#mmGrossAmount
	 * RedemptionExecution15.mmGrossAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution4#mmGrossAmount
	 * SwitchRedemptionLegExecution4.mmGrossAmount}</li>
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
	public static final MMBusinessAttribute mmGrossAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(FundOrderData1.mmGrossAmount, RedemptionOrder3.mmGrossAmount, RedemptionOrder5.mmGrossAmount, RedemptionExecution3.mmGrossAmount, RedemptionExecution5.mmGrossAmount,
					RedemptionOrder7.mmGrossAmount, RedemptionOrder4.mmGrossAmount, RedemptionOrder6.mmGrossAmount, RedemptionExecution4.mmGrossAmount, RedemptionExecution6.mmGrossAmount, RedemptionOrder8.mmGrossAmount,
					SubscriptionOrder3.mmGrossAmount, SubscriptionOrder5.mmGrossAmount, SubscriptionExecution3.mmGrossAmount, SubscriptionExecution5.mmGrossAmount, SubscriptionOrder7.mmGrossAmount, SubscriptionOrder4.mmGrossAmount,
					SubscriptionOrder6.mmGrossAmount, SubscriptionExecution4.mmGrossAmount, SubscriptionExecution6.mmGrossAmount, SubscriptionOrder8.mmGrossAmount, FinancialInstrumentQuantity3Choice.mmGrossAmount,
					FinancialInstrumentQuantity4Choice.mmGrossAmount, FinancialInstrumentQuantity5Choice.mmGrossAmount, FinancialInstrumentQuantity6Choice.mmGrossAmount, SwitchRedemptionLegExecution2.mmGrossAmount,
					SwitchSubscriptionLegExecution2.mmGrossAmount, SwitchRedemptionLegExecution3.mmGrossAmount, SwitchSubscriptionLegExecution3.mmGrossAmount, FinancialInstrumentQuantity2.mmGrossAmount,
					FinancialInstrumentQuantity3.mmGrossAmount, FinancialInstrumentQuantity7Choice.mmGrossAmount, FinancialInstrumentQuantity8Choice.mmGrossAmount, FinancialInstrumentQuantity12Choice.mmGrossAmount,
					FinancialInstrumentQuantity13Choice.mmGrossAmount, RedemptionOrder11.mmGrossAmount, RedemptionExecution12.mmGrossAmount, SubscriptionOrder11.mmGrossAmount, SubscriptionExecution9.mmGrossAmount,
					FinancialInstrumentQuantity26Choice.mmGrossAmount, SubscriptionExecution13.mmGrossAmount, SubscriptionExecution12.mmGrossAmount, FundOrderData5.mmGrossAmount, FinancialInstrumentQuantity29Choice.mmGrossAmount,
					FinancialInstrumentQuantity28Choice.mmGrossAmount, RedemptionExecution16.mmGrossAmount, SwitchSubscriptionLegExecution4.mmGrossAmount, FinancialInstrumentQuantity27Choice.mmGrossAmount,
					RedemptionExecution15.mmGrossAmount, SwitchRedemptionLegExecution4.mmGrossAmount);
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrder.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GrossAmount";
			definition = "Amount of money used to derive the quantity of investment fund units sold or subscribed, before deduction of charges, commissions, and taxes, expressed in the currency requested by the investor.\r\n[Quantity * Price] + (Charges + Commissions +Taxes)]";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundOrder.class.getMethod("getGrossAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected SecuritiesQuantity unitsNumber;
	/**
	 * Quantity of investment fund units to be subscribed or redeemed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmOrder
	 * SecuritiesQuantity.mmOrder}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundOrderData1#mmUnitsNumber
	 * FundOrderData1.mmUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder3#mmUnitsNumber
	 * RedemptionOrder3.mmUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder5#mmUnitsNumber
	 * RedemptionOrder5.mmUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder7#mmUnitsNumber
	 * RedemptionOrder7.mmUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder4#mmUnitsNumber
	 * RedemptionOrder4.mmUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder6#mmUnitsNumber
	 * RedemptionOrder6.mmUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder8#mmUnitsNumber
	 * RedemptionOrder8.mmUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder3#mmUnitsNumber
	 * SubscriptionOrder3.mmUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder5#mmUnitsNumber
	 * SubscriptionOrder5.mmUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder7#mmUnitsNumber
	 * SubscriptionOrder7.mmUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder4#mmUnitsNumber
	 * SubscriptionOrder4.mmUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder6#mmUnitsNumber
	 * SubscriptionOrder6.mmUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder8#mmUnitsNumber
	 * SubscriptionOrder8.mmUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity3Choice#mmUnitsNumber
	 * FinancialInstrumentQuantity3Choice.mmUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegOrder2#mmFinancialInstrumentQuantityChoice
	 * SwitchRedemptionLegOrder2.mmFinancialInstrumentQuantityChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity4Choice#mmUnitsNumber
	 * FinancialInstrumentQuantity4Choice.mmUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder2#mmFinancialInstrumentQuantityChoice
	 * SwitchSubscriptionLegOrder2.mmFinancialInstrumentQuantityChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity5Choice#mmUnitsNumber
	 * FinancialInstrumentQuantity5Choice.mmUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegOrder3#mmFinancialInstrumentQuantityChoice
	 * SwitchRedemptionLegOrder3.mmFinancialInstrumentQuantityChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity6Choice#mmUnitsNumber
	 * FinancialInstrumentQuantity6Choice.mmUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder3#mmFinancialInstrumentQuantityChoice
	 * SwitchSubscriptionLegOrder3.mmFinancialInstrumentQuantityChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity11Choice#mmUnitsNumber
	 * FinancialInstrumentQuantity11Choice.mmUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundOrderData3#mmFinancialInstrumentQuantity
	 * FundOrderData3.mmFinancialInstrumentQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity10Choice#mmUnitsNumber
	 * FinancialInstrumentQuantity10Choice.mmUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder9#mmFinancialInstrumentQuantity
	 * RedemptionOrder9.mmFinancialInstrumentQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity9Choice#mmUnitsNumber
	 * FinancialInstrumentQuantity9Choice.mmUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder9#mmFinancialInstrumentQuantity
	 * SubscriptionOrder9.mmFinancialInstrumentQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution8#mmFinancialInstrumentQuantity
	 * SubscriptionExecution8.mmFinancialInstrumentQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution11#mmFinancialInstrumentQuantity
	 * RedemptionExecution11.mmFinancialInstrumentQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecutionRedemptionLeg4#mmFinancialInstrumentQuantity
	 * SwitchExecutionRedemptionLeg4.mmFinancialInstrumentQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecutionSubscriptionLeg4#mmFinancialInstrumentQuantity
	 * SwitchExecutionSubscriptionLeg4.mmFinancialInstrumentQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity7Choice#mmUnitsNumber
	 * FinancialInstrumentQuantity7Choice.mmUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder10#mmFinancialInstrumentQuantity
	 * SubscriptionOrder10.mmFinancialInstrumentQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity8Choice#mmUnitsNumber
	 * FinancialInstrumentQuantity8Choice.mmUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder10#mmFinancialInstrumentQuantity
	 * RedemptionOrder10.mmFinancialInstrumentQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity12Choice#mmUnitsNumber
	 * FinancialInstrumentQuantity12Choice.mmUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegOrder4#mmFinancialInstrumentQuantity
	 * SwitchRedemptionLegOrder4.mmFinancialInstrumentQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity13Choice#mmUnitsNumber
	 * FinancialInstrumentQuantity13Choice.mmUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder4#mmFinancialInstrumentQuantity
	 * SwitchSubscriptionLegOrder4.mmFinancialInstrumentQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder11#mmUnitsNumber
	 * RedemptionOrder11.mmUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder11#mmUnitsNumber
	 * SubscriptionOrder11.mmUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder6#mmFinancialInstrumentQuantityChoice
	 * SwitchSubscriptionLegOrder6.mmFinancialInstrumentQuantityChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity26Choice#mmUnitsNumber
	 * FinancialInstrumentQuantity26Choice.mmUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundOrderData5#mmUnitsNumber
	 * FundOrderData5.mmUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegOrder6#mmFinancialInstrumentQuantityChoice
	 * SwitchRedemptionLegOrder6.mmFinancialInstrumentQuantityChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity29Choice#mmUnitsNumber
	 * FinancialInstrumentQuantity29Choice.mmUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity28Choice#mmUnitsNumber
	 * FinancialInstrumentQuantity28Choice.mmUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity27Choice#mmUnitsNumber
	 * FinancialInstrumentQuantity27Choice.mmUnitsNumber}</li>
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
	public static final MMBusinessAssociationEnd mmUnitsNumber = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(FundOrderData1.mmUnitsNumber, RedemptionOrder3.mmUnitsNumber, RedemptionOrder5.mmUnitsNumber, RedemptionOrder7.mmUnitsNumber, RedemptionOrder4.mmUnitsNumber, RedemptionOrder6.mmUnitsNumber,
					RedemptionOrder8.mmUnitsNumber, SubscriptionOrder3.mmUnitsNumber, SubscriptionOrder5.mmUnitsNumber, SubscriptionOrder7.mmUnitsNumber, SubscriptionOrder4.mmUnitsNumber, SubscriptionOrder6.mmUnitsNumber,
					SubscriptionOrder8.mmUnitsNumber, FinancialInstrumentQuantity3Choice.mmUnitsNumber, SwitchRedemptionLegOrder2.mmFinancialInstrumentQuantityChoice, FinancialInstrumentQuantity4Choice.mmUnitsNumber,
					SwitchSubscriptionLegOrder2.mmFinancialInstrumentQuantityChoice, FinancialInstrumentQuantity5Choice.mmUnitsNumber, SwitchRedemptionLegOrder3.mmFinancialInstrumentQuantityChoice,
					FinancialInstrumentQuantity6Choice.mmUnitsNumber, SwitchSubscriptionLegOrder3.mmFinancialInstrumentQuantityChoice, FinancialInstrumentQuantity11Choice.mmUnitsNumber, FundOrderData3.mmFinancialInstrumentQuantity,
					FinancialInstrumentQuantity10Choice.mmUnitsNumber, RedemptionOrder9.mmFinancialInstrumentQuantity, FinancialInstrumentQuantity9Choice.mmUnitsNumber, SubscriptionOrder9.mmFinancialInstrumentQuantity,
					SubscriptionExecution8.mmFinancialInstrumentQuantity, RedemptionExecution11.mmFinancialInstrumentQuantity, SwitchExecutionRedemptionLeg4.mmFinancialInstrumentQuantity,
					SwitchExecutionSubscriptionLeg4.mmFinancialInstrumentQuantity, FinancialInstrumentQuantity7Choice.mmUnitsNumber, SubscriptionOrder10.mmFinancialInstrumentQuantity, FinancialInstrumentQuantity8Choice.mmUnitsNumber,
					RedemptionOrder10.mmFinancialInstrumentQuantity, FinancialInstrumentQuantity12Choice.mmUnitsNumber, SwitchRedemptionLegOrder4.mmFinancialInstrumentQuantity, FinancialInstrumentQuantity13Choice.mmUnitsNumber,
					SwitchSubscriptionLegOrder4.mmFinancialInstrumentQuantity, RedemptionOrder11.mmUnitsNumber, SubscriptionOrder11.mmUnitsNumber, SwitchSubscriptionLegOrder6.mmFinancialInstrumentQuantityChoice,
					FinancialInstrumentQuantity26Choice.mmUnitsNumber, FundOrderData5.mmUnitsNumber, SwitchRedemptionLegOrder6.mmFinancialInstrumentQuantityChoice, FinancialInstrumentQuantity29Choice.mmUnitsNumber,
					FinancialInstrumentQuantity28Choice.mmUnitsNumber, FinancialInstrumentQuantity27Choice.mmUnitsNumber);
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrder.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UnitsNumber";
			definition = "Quantity of investment fund units to be subscribed or redeemed.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmOrder;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
		}
	};
	protected InvestmentFundOrderExecution investmentFundOrderExecution;
	/**
	 * Execution of an investment fund order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmOrder
	 * InvestmentFundOrderExecution.mmOrder}</li>
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
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason1#mmNewDetails
	 * IndividualOrderStatusAndReason1.mmNewDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason2#mmNewDetails
	 * IndividualOrderStatusAndReason2.mmNewDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrderStatusAndReason1#mmNewDetails
	 * SwitchOrderStatusAndReason1.mmNewDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason3#mmNewDetails
	 * IndividualOrderStatusAndReason3.mmNewDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason7#mmNewDetails
	 * IndividualOrderStatusAndReason7.mmNewDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrderStatusAndReason2#mmNewDetails
	 * SwitchOrderStatusAndReason2.mmNewDetails}</li>
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
	public static final MMBusinessAssociationEnd mmInvestmentFundOrderExecution = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(IndividualOrderStatusAndReason1.mmNewDetails, IndividualOrderStatusAndReason2.mmNewDetails, SwitchOrderStatusAndReason1.mmNewDetails, IndividualOrderStatusAndReason3.mmNewDetails,
					IndividualOrderStatusAndReason7.mmNewDetails, SwitchOrderStatusAndReason2.mmNewDetails);
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrder.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvestmentFundOrderExecution";
			definition = "Execution of an investment fund order.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrderExecution.mmOrder;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrderExecution.mmObject();
		}
	};
	protected CurrencyAndAmount netAmount;
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
	 * <li>{@linkplain com.tools20022.repository.msg.FundOrderData1#mmNetAmount
	 * FundOrderData1.mmNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder3#mmNetAmount
	 * RedemptionOrder3.mmNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder5#mmNetAmount
	 * RedemptionOrder5.mmNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder7#mmNetAmount
	 * RedemptionOrder7.mmNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder4#mmNetAmount
	 * RedemptionOrder4.mmNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder6#mmNetAmount
	 * RedemptionOrder6.mmNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder8#mmNetAmount
	 * RedemptionOrder8.mmNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder3#mmNetAmount
	 * SubscriptionOrder3.mmNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder5#mmNetAmount
	 * SubscriptionOrder5.mmNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder7#mmNetAmount
	 * SubscriptionOrder7.mmNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder4#mmNetAmount
	 * SubscriptionOrder4.mmNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder6#mmNetAmount
	 * SubscriptionOrder6.mmNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder8#mmNetAmount
	 * SubscriptionOrder8.mmNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity3Choice#mmNetAmount
	 * FinancialInstrumentQuantity3Choice.mmNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity4Choice#mmNetAmount
	 * FinancialInstrumentQuantity4Choice.mmNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity5Choice#mmNetAmount
	 * FinancialInstrumentQuantity5Choice.mmNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity6Choice#mmNetAmount
	 * FinancialInstrumentQuantity6Choice.mmNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentQuantity2#mmOrderedAmount
	 * FinancialInstrumentQuantity2.mmOrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentQuantity2#mmNetAmount
	 * FinancialInstrumentQuantity2.mmNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentQuantity3#mmNetAmount
	 * FinancialInstrumentQuantity3.mmNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity7Choice#mmNetAmount
	 * FinancialInstrumentQuantity7Choice.mmNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity8Choice#mmNetAmount
	 * FinancialInstrumentQuantity8Choice.mmNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity12Choice#mmNetAmount
	 * FinancialInstrumentQuantity12Choice.mmNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity13Choice#mmNetAmount
	 * FinancialInstrumentQuantity13Choice.mmNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder11#mmNetAmount
	 * RedemptionOrder11.mmNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder11#mmNetAmount
	 * SubscriptionOrder11.mmNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity26Choice#mmNetAmount
	 * FinancialInstrumentQuantity26Choice.mmNetAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.FundOrderData5#mmNetAmount
	 * FundOrderData5.mmNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity29Choice#mmNetAmount
	 * FinancialInstrumentQuantity29Choice.mmNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity28Choice#mmNetAmount
	 * FinancialInstrumentQuantity28Choice.mmNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity27Choice#mmNetAmount
	 * FinancialInstrumentQuantity27Choice.mmNetAmount}</li>
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
	public static final MMBusinessAttribute mmNetAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(FundOrderData1.mmNetAmount, RedemptionOrder3.mmNetAmount, RedemptionOrder5.mmNetAmount, RedemptionOrder7.mmNetAmount, RedemptionOrder4.mmNetAmount, RedemptionOrder6.mmNetAmount,
					RedemptionOrder8.mmNetAmount, SubscriptionOrder3.mmNetAmount, SubscriptionOrder5.mmNetAmount, SubscriptionOrder7.mmNetAmount, SubscriptionOrder4.mmNetAmount, SubscriptionOrder6.mmNetAmount,
					SubscriptionOrder8.mmNetAmount, FinancialInstrumentQuantity3Choice.mmNetAmount, FinancialInstrumentQuantity4Choice.mmNetAmount, FinancialInstrumentQuantity5Choice.mmNetAmount,
					FinancialInstrumentQuantity6Choice.mmNetAmount, FinancialInstrumentQuantity2.mmOrderedAmount, FinancialInstrumentQuantity2.mmNetAmount, FinancialInstrumentQuantity3.mmNetAmount,
					FinancialInstrumentQuantity7Choice.mmNetAmount, FinancialInstrumentQuantity8Choice.mmNetAmount, FinancialInstrumentQuantity12Choice.mmNetAmount, FinancialInstrumentQuantity13Choice.mmNetAmount,
					RedemptionOrder11.mmNetAmount, SubscriptionOrder11.mmNetAmount, FinancialInstrumentQuantity26Choice.mmNetAmount, FundOrderData5.mmNetAmount, FinancialInstrumentQuantity29Choice.mmNetAmount,
					FinancialInstrumentQuantity28Choice.mmNetAmount, FinancialInstrumentQuantity27Choice.mmNetAmount);
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrder.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NetAmount";
			definition = "Amount of money used to determine the quantity of investment fund units to be subscribed or to be sold.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundOrder.class.getMethod("getNetAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODateTime orderDateTime;
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
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkOrder2#mmOrderDateTime
	 * RedemptionBulkOrder2.mmOrderDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkOrder3#mmOrderDateTime
	 * RedemptionBulkOrder3.mmOrderDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkExecution2#mmOrderDateTime
	 * RedemptionBulkExecution2.mmOrderDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkExecution3#mmOrderDateTime
	 * RedemptionBulkExecution3.mmOrderDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkOrder4#mmOrderDateTime
	 * RedemptionBulkOrder4.mmOrderDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder2#mmOrderDateTime
	 * RedemptionMultipleOrder2.mmOrderDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder3#mmOrderDateTime
	 * RedemptionMultipleOrder3.mmOrderDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution2#mmOrderDateTime
	 * RedemptionMultipleExecution2.mmOrderDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution3#mmOrderDateTime
	 * RedemptionMultipleExecution3.mmOrderDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder4#mmOrderDateTime
	 * RedemptionMultipleOrder4.mmOrderDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction2#mmOrderDateTime
	 * InvestmentFundTransaction2.mmOrderDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction3#mmOrderDateTime
	 * InvestmentFundTransaction3.mmOrderDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkOrder2#mmOrderDateTime
	 * SubscriptionBulkOrder2.mmOrderDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkOrder3#mmOrderDateTime
	 * SubscriptionBulkOrder3.mmOrderDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkExecution2#mmOrderDateTime
	 * SubscriptionBulkExecution2.mmOrderDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkExecution3#mmOrderDateTime
	 * SubscriptionBulkExecution3.mmOrderDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkOrder4#mmOrderDateTime
	 * SubscriptionBulkOrder4.mmOrderDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder2#mmOrderDateTime
	 * SubscriptionMultipleOrder2.mmOrderDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder3#mmOrderDateTime
	 * SubscriptionMultipleOrder3.mmOrderDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleExecution2#mmOrderDateTime
	 * SubscriptionMultipleExecution2.mmOrderDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleExecution3#mmOrderDateTime
	 * SubscriptionMultipleExecution3.mmOrderDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder4#mmOrderDateTime
	 * SubscriptionMultipleOrder4.mmOrderDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder2#mmOrderDateTime
	 * SwitchOrder2.mmOrderDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder3#mmOrderDateTime
	 * SwitchOrder3.mmOrderDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution3#mmOrderDateTime
	 * SwitchExecution3.mmOrderDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution4#mmOrderDateTime
	 * SwitchExecution4.mmOrderDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder4#mmOrderDateTime
	 * SwitchOrder4.mmOrderDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction4#mmOrderDateTime
	 * InvestmentFundTransaction4.mmOrderDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution7#mmOrderDateTime
	 * SwitchExecution7.mmOrderDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkOrder5#mmOrderDateTime
	 * SubscriptionBulkOrder5.mmOrderDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkExecution5#mmOrderDateTime
	 * RedemptionBulkExecution5.mmOrderDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution5#mmOrderDateTime
	 * RedemptionMultipleExecution5.mmOrderDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder6#mmOrderDateTime
	 * RedemptionMultipleOrder6.mmOrderDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder6#mmOrderDateTime
	 * SubscriptionMultipleOrder6.mmOrderDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkExecution4#mmOrderDateTime
	 * SubscriptionBulkExecution4.mmOrderDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder7#mmOrderDateTime
	 * SwitchOrder7.mmOrderDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkOrder6#mmOrderDateTime
	 * RedemptionBulkOrder6.mmOrderDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleExecution5#mmOrderDateTime
	 * SubscriptionMultipleExecution5.mmOrderDateTime}</li>
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
	public static final MMBusinessAttribute mmOrderDateTime = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(RedemptionBulkOrder2.mmOrderDateTime, RedemptionBulkOrder3.mmOrderDateTime, RedemptionBulkExecution2.mmOrderDateTime, RedemptionBulkExecution3.mmOrderDateTime,
					RedemptionBulkOrder4.mmOrderDateTime, RedemptionMultipleOrder2.mmOrderDateTime, RedemptionMultipleOrder3.mmOrderDateTime, RedemptionMultipleExecution2.mmOrderDateTime, RedemptionMultipleExecution3.mmOrderDateTime,
					RedemptionMultipleOrder4.mmOrderDateTime, InvestmentFundTransaction2.mmOrderDateTime, InvestmentFundTransaction3.mmOrderDateTime, SubscriptionBulkOrder2.mmOrderDateTime, SubscriptionBulkOrder3.mmOrderDateTime,
					SubscriptionBulkExecution2.mmOrderDateTime, SubscriptionBulkExecution3.mmOrderDateTime, SubscriptionBulkOrder4.mmOrderDateTime, SubscriptionMultipleOrder2.mmOrderDateTime, SubscriptionMultipleOrder3.mmOrderDateTime,
					SubscriptionMultipleExecution2.mmOrderDateTime, SubscriptionMultipleExecution3.mmOrderDateTime, SubscriptionMultipleOrder4.mmOrderDateTime, SwitchOrder2.mmOrderDateTime, SwitchOrder3.mmOrderDateTime,
					SwitchExecution3.mmOrderDateTime, SwitchExecution4.mmOrderDateTime, SwitchOrder4.mmOrderDateTime, InvestmentFundTransaction4.mmOrderDateTime, SwitchExecution7.mmOrderDateTime, SubscriptionBulkOrder5.mmOrderDateTime,
					RedemptionBulkExecution5.mmOrderDateTime, RedemptionMultipleExecution5.mmOrderDateTime, RedemptionMultipleOrder6.mmOrderDateTime, SubscriptionMultipleOrder6.mmOrderDateTime, SubscriptionBulkExecution4.mmOrderDateTime,
					SwitchOrder7.mmOrderDateTime, RedemptionBulkOrder6.mmOrderDateTime, SubscriptionMultipleExecution5.mmOrderDateTime);
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrder.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OrderDateTime";
			definition = "Date and time at which the order was placed by the investor.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundOrder.class.getMethod("getOrderDateTime", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODateTime expiryDateTime;
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
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkOrder2#mmExpiryDateTime
	 * RedemptionBulkOrder2.mmExpiryDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkOrder3#mmExpiryDateTime
	 * RedemptionBulkOrder3.mmExpiryDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkOrder4#mmExpiryDateTime
	 * RedemptionBulkOrder4.mmExpiryDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder2#mmExpiryDateTime
	 * RedemptionMultipleOrder2.mmExpiryDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder3#mmExpiryDateTime
	 * RedemptionMultipleOrder3.mmExpiryDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder4#mmExpiryDateTime
	 * RedemptionMultipleOrder4.mmExpiryDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkOrder2#mmExpiryDateTime
	 * SubscriptionBulkOrder2.mmExpiryDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkOrder3#mmExpiryDateTime
	 * SubscriptionBulkOrder3.mmExpiryDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkOrder4#mmExpiryDateTime
	 * SubscriptionBulkOrder4.mmExpiryDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder2#mmExpiryDateTime
	 * SubscriptionMultipleOrder2.mmExpiryDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder3#mmExpiryDateTime
	 * SubscriptionMultipleOrder3.mmExpiryDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder4#mmExpiryDateTime
	 * SubscriptionMultipleOrder4.mmExpiryDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder2#mmExpiryDateTime
	 * SwitchOrder2.mmExpiryDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder3#mmExpiryDateTime
	 * SwitchOrder3.mmExpiryDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder4#mmExpiryDateTime
	 * SwitchOrder4.mmExpiryDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder5#mmExpiryDateTime
	 * RedemptionMultipleOrder5.mmExpiryDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder5#mmExpiryDateTime
	 * SubscriptionMultipleOrder5.mmExpiryDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkOrder5#mmExpiryDateTime
	 * SubscriptionBulkOrder5.mmExpiryDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder6#mmExpiryDateTime
	 * RedemptionMultipleOrder6.mmExpiryDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder6#mmExpiryDateTime
	 * SubscriptionMultipleOrder6.mmExpiryDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder7#mmExpiryDateTime
	 * SwitchOrder7.mmExpiryDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkOrder6#mmExpiryDateTime
	 * RedemptionBulkOrder6.mmExpiryDateTime}</li>
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
	public static final MMBusinessAttribute mmExpiryDateTime = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(RedemptionBulkOrder2.mmExpiryDateTime, RedemptionBulkOrder3.mmExpiryDateTime, RedemptionBulkOrder4.mmExpiryDateTime, RedemptionMultipleOrder2.mmExpiryDateTime,
					RedemptionMultipleOrder3.mmExpiryDateTime, RedemptionMultipleOrder4.mmExpiryDateTime, SubscriptionBulkOrder2.mmExpiryDateTime, SubscriptionBulkOrder3.mmExpiryDateTime, SubscriptionBulkOrder4.mmExpiryDateTime,
					SubscriptionMultipleOrder2.mmExpiryDateTime, SubscriptionMultipleOrder3.mmExpiryDateTime, SubscriptionMultipleOrder4.mmExpiryDateTime, SwitchOrder2.mmExpiryDateTime, SwitchOrder3.mmExpiryDateTime,
					SwitchOrder4.mmExpiryDateTime, RedemptionMultipleOrder5.mmExpiryDateTime, SubscriptionMultipleOrder5.mmExpiryDateTime, SubscriptionBulkOrder5.mmExpiryDateTime, RedemptionMultipleOrder6.mmExpiryDateTime,
					SubscriptionMultipleOrder6.mmExpiryDateTime, SwitchOrder7.mmExpiryDateTime, RedemptionBulkOrder6.mmExpiryDateTime);
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrder.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExpiryDateTime";
			definition = "Date on which the order expires.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundOrder.class.getMethod("getExpiryDateTime", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CancellationRightCode cancellationRight;
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
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkOrder2#mmCancellationRight
	 * RedemptionBulkOrder2.mmCancellationRight}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkOrder3#mmCancellationRight
	 * RedemptionBulkOrder3.mmCancellationRight}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkOrder3#mmExtendedCancellationRight
	 * RedemptionBulkOrder3.mmExtendedCancellationRight}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkExecution2#mmCancellationRight
	 * RedemptionBulkExecution2.mmCancellationRight}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkExecution3#mmCancellationRight
	 * RedemptionBulkExecution3.mmCancellationRight}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkExecution3#mmExtendedCancellationRight
	 * RedemptionBulkExecution3.mmExtendedCancellationRight}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkOrder4#mmCancellationRight
	 * RedemptionBulkOrder4.mmCancellationRight}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkOrder4#mmExtendedCancellationRight
	 * RedemptionBulkOrder4.mmExtendedCancellationRight}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder2#mmCancellationRight
	 * RedemptionMultipleOrder2.mmCancellationRight}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder3#mmCancellationRight
	 * RedemptionMultipleOrder3.mmCancellationRight}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder3#mmExtendedCancellationRight
	 * RedemptionMultipleOrder3.mmExtendedCancellationRight}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution2#mmCancellationRight
	 * RedemptionMultipleExecution2.mmCancellationRight}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution3#mmCancellationRight
	 * RedemptionMultipleExecution3.mmCancellationRight}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution3#mmExtendedCancellationRight
	 * RedemptionMultipleExecution3.mmExtendedCancellationRight}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder4#mmCancellationRight
	 * RedemptionMultipleOrder4.mmCancellationRight}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder4#mmExtendedCancellationRight
	 * RedemptionMultipleOrder4.mmExtendedCancellationRight}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkOrder2#mmCancellationRight
	 * SubscriptionBulkOrder2.mmCancellationRight}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkOrder3#mmCancellationRight
	 * SubscriptionBulkOrder3.mmCancellationRight}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkOrder3#mmExtendedCancellationRight
	 * SubscriptionBulkOrder3.mmExtendedCancellationRight}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkExecution2#mmCancellationRight
	 * SubscriptionBulkExecution2.mmCancellationRight}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkExecution3#mmCancellationRight
	 * SubscriptionBulkExecution3.mmCancellationRight}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkExecution3#mmExtendedCancellationRight
	 * SubscriptionBulkExecution3.mmExtendedCancellationRight}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkOrder4#mmCancellationRight
	 * SubscriptionBulkOrder4.mmCancellationRight}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkOrder4#mmExtendedCancellationRight
	 * SubscriptionBulkOrder4.mmExtendedCancellationRight}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder2#mmCancellationRight
	 * SubscriptionMultipleOrder2.mmCancellationRight}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder3#mmCancellationRight
	 * SubscriptionMultipleOrder3.mmCancellationRight}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder3#mmExtendedCancellationRight
	 * SubscriptionMultipleOrder3.mmExtendedCancellationRight}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleExecution2#mmCancellationRight
	 * SubscriptionMultipleExecution2.mmCancellationRight}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleExecution3#mmCancellationRight
	 * SubscriptionMultipleExecution3.mmCancellationRight}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleExecution3#mmExtendedCancellationRight
	 * SubscriptionMultipleExecution3.mmExtendedCancellationRight}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder4#mmCancellationRight
	 * SubscriptionMultipleOrder4.mmCancellationRight}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder4#mmExtendedCancellationRight
	 * SubscriptionMultipleOrder4.mmExtendedCancellationRight}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder2#mmCancellationRight
	 * SwitchOrder2.mmCancellationRight}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder3#mmCancellationRight
	 * SwitchOrder3.mmCancellationRight}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder3#mmExtendedCancellationRight
	 * SwitchOrder3.mmExtendedCancellationRight}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder4#mmCancellationRight
	 * SwitchOrder4.mmCancellationRight}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder4#mmExtendedCancellationRight
	 * SwitchOrder4.mmExtendedCancellationRight}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution7#mmCancellationRight
	 * SwitchExecution7.mmCancellationRight}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkOrder5#mmCancellationRight
	 * SubscriptionBulkOrder5.mmCancellationRight}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkExecution5#mmCancellationRight
	 * RedemptionBulkExecution5.mmCancellationRight}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution5#mmCancellationRight
	 * RedemptionMultipleExecution5.mmCancellationRight}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder6#mmCancellationRight
	 * RedemptionMultipleOrder6.mmCancellationRight}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder6#mmCancellationRight
	 * SubscriptionMultipleOrder6.mmCancellationRight}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkExecution4#mmCancellationRight
	 * SubscriptionBulkExecution4.mmCancellationRight}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder7#mmCancellationRight
	 * SwitchOrder7.mmCancellationRight}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkOrder6#mmCancellationRight
	 * RedemptionBulkOrder6.mmCancellationRight}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleExecution5#mmCancellationRight
	 * SubscriptionMultipleExecution5.mmCancellationRight}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationRight1Choice#mmCode
	 * CancellationRight1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationRight1Choice#mmProprietary
	 * CancellationRight1Choice.mmProprietary}</li>
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
	public static final MMBusinessAttribute mmCancellationRight = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(RedemptionBulkOrder2.mmCancellationRight, RedemptionBulkOrder3.mmCancellationRight, RedemptionBulkOrder3.mmExtendedCancellationRight, RedemptionBulkExecution2.mmCancellationRight,
					RedemptionBulkExecution3.mmCancellationRight, RedemptionBulkExecution3.mmExtendedCancellationRight, RedemptionBulkOrder4.mmCancellationRight, RedemptionBulkOrder4.mmExtendedCancellationRight,
					RedemptionMultipleOrder2.mmCancellationRight, RedemptionMultipleOrder3.mmCancellationRight, RedemptionMultipleOrder3.mmExtendedCancellationRight, RedemptionMultipleExecution2.mmCancellationRight,
					RedemptionMultipleExecution3.mmCancellationRight, RedemptionMultipleExecution3.mmExtendedCancellationRight, RedemptionMultipleOrder4.mmCancellationRight, RedemptionMultipleOrder4.mmExtendedCancellationRight,
					SubscriptionBulkOrder2.mmCancellationRight, SubscriptionBulkOrder3.mmCancellationRight, SubscriptionBulkOrder3.mmExtendedCancellationRight, SubscriptionBulkExecution2.mmCancellationRight,
					SubscriptionBulkExecution3.mmCancellationRight, SubscriptionBulkExecution3.mmExtendedCancellationRight, SubscriptionBulkOrder4.mmCancellationRight, SubscriptionBulkOrder4.mmExtendedCancellationRight,
					SubscriptionMultipleOrder2.mmCancellationRight, SubscriptionMultipleOrder3.mmCancellationRight, SubscriptionMultipleOrder3.mmExtendedCancellationRight, SubscriptionMultipleExecution2.mmCancellationRight,
					SubscriptionMultipleExecution3.mmCancellationRight, SubscriptionMultipleExecution3.mmExtendedCancellationRight, SubscriptionMultipleOrder4.mmCancellationRight, SubscriptionMultipleOrder4.mmExtendedCancellationRight,
					SwitchOrder2.mmCancellationRight, SwitchOrder3.mmCancellationRight, SwitchOrder3.mmExtendedCancellationRight, SwitchOrder4.mmCancellationRight, SwitchOrder4.mmExtendedCancellationRight,
					SwitchExecution7.mmCancellationRight, SubscriptionBulkOrder5.mmCancellationRight, RedemptionBulkExecution5.mmCancellationRight, RedemptionMultipleExecution5.mmCancellationRight,
					RedemptionMultipleOrder6.mmCancellationRight, SubscriptionMultipleOrder6.mmCancellationRight, SubscriptionBulkExecution4.mmCancellationRight, SwitchOrder7.mmCancellationRight, RedemptionBulkOrder6.mmCancellationRight,
					SubscriptionMultipleExecution5.mmCancellationRight, CancellationRight1Choice.mmCode, CancellationRight1Choice.mmProprietary);
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrder.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CancellationRight";
			definition = "Cancellation right of an investor with respect to an investment fund order.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CancellationRightCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundOrder.class.getMethod("getCancellationRight", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyCode requestedSettlementCurrency;
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
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkOrder2#mmRequestedSettlementCurrency
	 * RedemptionBulkOrder2.mmRequestedSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkOrder3#mmRequestedSettlementCurrency
	 * RedemptionBulkOrder3.mmRequestedSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkExecution2#mmRequestedSettlementCurrency
	 * RedemptionBulkExecution2.mmRequestedSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkExecution3#mmRequestedSettlementCurrency
	 * RedemptionBulkExecution3.mmRequestedSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkOrder4#mmRequestedSettlementCurrency
	 * RedemptionBulkOrder4.mmRequestedSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder4#mmRequestedSettlementCurrency
	 * RedemptionOrder4.mmRequestedSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder6#mmRequestedSettlementCurrency
	 * RedemptionOrder6.mmRequestedSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution4#mmRequestedSettlementCurrency
	 * RedemptionExecution4.mmRequestedSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#mmRequestedSettlementCurrency
	 * RedemptionExecution6.mmRequestedSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder8#mmRequestedSettlementCurrency
	 * RedemptionOrder8.mmRequestedSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkOrder2#mmRequestedSettlementCurrency
	 * SubscriptionBulkOrder2.mmRequestedSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkOrder3#mmRequestedSettlementCurrency
	 * SubscriptionBulkOrder3.mmRequestedSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkExecution2#mmRequestedSettlementCurrency
	 * SubscriptionBulkExecution2.mmRequestedSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkExecution3#mmRequestedSettlementCurrency
	 * SubscriptionBulkExecution3.mmRequestedSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkOrder4#mmRequestedSettlementCurrency
	 * SubscriptionBulkOrder4.mmRequestedSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder4#mmRequestedSettlementCurrency
	 * SubscriptionOrder4.mmRequestedSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder6#mmRequestedSettlementCurrency
	 * SubscriptionOrder6.mmRequestedSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution4#mmRequestedSettlementCurrency
	 * SubscriptionExecution4.mmRequestedSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#mmRequestedSettlementCurrency
	 * SubscriptionExecution6.mmRequestedSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder8#mmRequestedSettlementCurrency
	 * SubscriptionOrder8.mmRequestedSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegOrder2#mmRequestedSettlementCurrency
	 * SwitchRedemptionLegOrder2.mmRequestedSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder2#mmRequestedSettlementCurrency
	 * SwitchSubscriptionLegOrder2.mmRequestedSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegOrder3#mmRequestedSettlementCurrency
	 * SwitchRedemptionLegOrder3.mmRequestedSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder3#mmRequestedSettlementCurrency
	 * SwitchSubscriptionLegOrder3.mmRequestedSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution2#mmRequestedSettlementCurrency
	 * SwitchRedemptionLegExecution2.mmRequestedSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution2#mmRequestedSettlementCurrency
	 * SwitchSubscriptionLegExecution2.mmRequestedSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution3#mmRequestedSettlementCurrency
	 * SwitchRedemptionLegExecution3.mmRequestedSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution3#mmRequestedSettlementCurrency
	 * SwitchSubscriptionLegExecution3.mmRequestedSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution10#mmRequestedSettlementCurrency
	 * RedemptionExecution10.mmRequestedSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder9#mmRequestedSettlementCurrency
	 * RedemptionOrder9.mmRequestedSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7#mmRequestedSettlementCurrency
	 * SubscriptionExecution7.mmRequestedSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder9#mmRequestedSettlementCurrency
	 * SubscriptionOrder9.mmRequestedSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder11#mmRequestedSettlementCurrency
	 * RedemptionOrder11.mmRequestedSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution12#mmRequestedSettlementCurrency
	 * RedemptionExecution12.mmRequestedSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder11#mmRequestedSettlementCurrency
	 * SubscriptionOrder11.mmRequestedSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution9#mmRequestedSettlementCurrency
	 * SubscriptionExecution9.mmRequestedSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkOrder5#mmRequestedSettlementCurrency
	 * SubscriptionBulkOrder5.mmRequestedSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkExecution5#mmRequestedSettlementCurrency
	 * RedemptionBulkExecution5.mmRequestedSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkExecution4#mmRequestedSettlementCurrency
	 * SubscriptionBulkExecution4.mmRequestedSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkOrder6#mmRequestedSettlementCurrency
	 * RedemptionBulkOrder6.mmRequestedSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder14#mmRequestedSettlementCurrency
	 * RedemptionOrder14.mmRequestedSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder6#mmRequestedSettlementCurrency
	 * SwitchSubscriptionLegOrder6.mmRequestedSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmRequestedSettlementCurrency
	 * SubscriptionExecution13.mmRequestedSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegOrder6#mmRequestedSettlementCurrency
	 * SwitchRedemptionLegOrder6.mmRequestedSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder14#mmRequestedSettlementCurrency
	 * SubscriptionOrder14.mmRequestedSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution4#mmRequestedSettlementCurrency
	 * SwitchSubscriptionLegExecution4.mmRequestedSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#mmRequestedSettlementCurrency
	 * RedemptionExecution15.mmRequestedSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution4#mmRequestedSettlementCurrency
	 * SwitchRedemptionLegExecution4.mmRequestedSettlementCurrency}</li>
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
	public static final MMBusinessAttribute mmRequestedSettlementCurrency = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(RedemptionBulkOrder2.mmRequestedSettlementCurrency, RedemptionBulkOrder3.mmRequestedSettlementCurrency, RedemptionBulkExecution2.mmRequestedSettlementCurrency,
					RedemptionBulkExecution3.mmRequestedSettlementCurrency, RedemptionBulkOrder4.mmRequestedSettlementCurrency, RedemptionOrder4.mmRequestedSettlementCurrency, RedemptionOrder6.mmRequestedSettlementCurrency,
					RedemptionExecution4.mmRequestedSettlementCurrency, RedemptionExecution6.mmRequestedSettlementCurrency, RedemptionOrder8.mmRequestedSettlementCurrency, SubscriptionBulkOrder2.mmRequestedSettlementCurrency,
					SubscriptionBulkOrder3.mmRequestedSettlementCurrency, SubscriptionBulkExecution2.mmRequestedSettlementCurrency, SubscriptionBulkExecution3.mmRequestedSettlementCurrency,
					SubscriptionBulkOrder4.mmRequestedSettlementCurrency, SubscriptionOrder4.mmRequestedSettlementCurrency, SubscriptionOrder6.mmRequestedSettlementCurrency, SubscriptionExecution4.mmRequestedSettlementCurrency,
					SubscriptionExecution6.mmRequestedSettlementCurrency, SubscriptionOrder8.mmRequestedSettlementCurrency, SwitchRedemptionLegOrder2.mmRequestedSettlementCurrency, SwitchSubscriptionLegOrder2.mmRequestedSettlementCurrency,
					SwitchRedemptionLegOrder3.mmRequestedSettlementCurrency, SwitchSubscriptionLegOrder3.mmRequestedSettlementCurrency, SwitchRedemptionLegExecution2.mmRequestedSettlementCurrency,
					SwitchSubscriptionLegExecution2.mmRequestedSettlementCurrency, SwitchRedemptionLegExecution3.mmRequestedSettlementCurrency, SwitchSubscriptionLegExecution3.mmRequestedSettlementCurrency,
					RedemptionExecution10.mmRequestedSettlementCurrency, RedemptionOrder9.mmRequestedSettlementCurrency, SubscriptionExecution7.mmRequestedSettlementCurrency, SubscriptionOrder9.mmRequestedSettlementCurrency,
					RedemptionOrder11.mmRequestedSettlementCurrency, RedemptionExecution12.mmRequestedSettlementCurrency, SubscriptionOrder11.mmRequestedSettlementCurrency, SubscriptionExecution9.mmRequestedSettlementCurrency,
					SubscriptionBulkOrder5.mmRequestedSettlementCurrency, RedemptionBulkExecution5.mmRequestedSettlementCurrency, SubscriptionBulkExecution4.mmRequestedSettlementCurrency, RedemptionBulkOrder6.mmRequestedSettlementCurrency,
					RedemptionOrder14.mmRequestedSettlementCurrency, SwitchSubscriptionLegOrder6.mmRequestedSettlementCurrency, SubscriptionExecution13.mmRequestedSettlementCurrency, SwitchRedemptionLegOrder6.mmRequestedSettlementCurrency,
					SubscriptionOrder14.mmRequestedSettlementCurrency, SwitchSubscriptionLegExecution4.mmRequestedSettlementCurrency, RedemptionExecution15.mmRequestedSettlementCurrency,
					SwitchRedemptionLegExecution4.mmRequestedSettlementCurrency);
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrder.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RequestedSettlementCurrency";
			definition = "Currency requested for settlement of cash proceeds.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundOrder.class.getMethod("getRequestedSettlementCurrency", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODateTime requestedExecutionDateTime;
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
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkOrder3#mmRequestedFutureTradeDate
	 * RedemptionBulkOrder3.mmRequestedFutureTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkExecution3#mmRequestedFutureTradeDate
	 * RedemptionBulkExecution3.mmRequestedFutureTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkOrder4#mmRequestedFutureTradeDate
	 * RedemptionBulkOrder4.mmRequestedFutureTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder3#mmRequestedFutureTradeDate
	 * RedemptionMultipleOrder3.mmRequestedFutureTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution3#mmRequestedFutureTradeDate
	 * RedemptionMultipleExecution3.mmRequestedFutureTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder4#mmRequestedFutureTradeDate
	 * RedemptionMultipleOrder4.mmRequestedFutureTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkOrder3#mmRequestedFutureTradeDate
	 * SubscriptionBulkOrder3.mmRequestedFutureTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkExecution3#mmRequestedFutureTradeDate
	 * SubscriptionBulkExecution3.mmRequestedFutureTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkOrder4#mmRequestedFutureTradeDate
	 * SubscriptionBulkOrder4.mmRequestedFutureTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder3#mmRequestedFutureTradeDate
	 * SubscriptionMultipleOrder3.mmRequestedFutureTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleExecution3#mmRequestedFutureTradeDate
	 * SubscriptionMultipleExecution3.mmRequestedFutureTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder4#mmRequestedFutureTradeDate
	 * SubscriptionMultipleOrder4.mmRequestedFutureTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder3#mmRequestedFutureTradeDate
	 * SwitchOrder3.mmRequestedFutureTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution4#mmRequestedFutureTradeDate
	 * SwitchExecution4.mmRequestedFutureTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder4#mmRequestedFutureTradeDate
	 * SwitchOrder4.mmRequestedFutureTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundOrderData3#mmRequestedTradeDate
	 * FundOrderData3.mmRequestedTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution10#mmRequestedTradeDate
	 * RedemptionExecution10.mmRequestedTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder9#mmRequestedTradeDate
	 * RedemptionOrder9.mmRequestedTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7#mmRequestedTradeDate
	 * SubscriptionExecution7.mmRequestedTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder9#mmRequestedTradeDate
	 * SubscriptionOrder9.mmRequestedTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution7#mmRequestedFutureTradeDate
	 * SwitchExecution7.mmRequestedFutureTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkOrder5#mmRequestedFutureTradeDate
	 * SubscriptionBulkOrder5.mmRequestedFutureTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkExecution5#mmRequestedFutureTradeDate
	 * RedemptionBulkExecution5.mmRequestedFutureTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution5#mmRequestedFutureTradeDate
	 * RedemptionMultipleExecution5.mmRequestedFutureTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder6#mmRequestedFutureTradeDate
	 * RedemptionMultipleOrder6.mmRequestedFutureTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder6#mmRequestedFutureTradeDate
	 * SubscriptionMultipleOrder6.mmRequestedFutureTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkExecution4#mmRequestedFutureTradeDate
	 * SubscriptionBulkExecution4.mmRequestedFutureTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder7#mmRequestedFutureTradeDate
	 * SwitchOrder7.mmRequestedFutureTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkOrder6#mmRequestedFutureTradeDate
	 * RedemptionBulkOrder6.mmRequestedFutureTradeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleExecution5#mmRequestedFutureTradeDate
	 * SubscriptionMultipleExecution5.mmRequestedFutureTradeDate}</li>
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
	public static final MMBusinessAttribute mmRequestedExecutionDateTime = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(RedemptionBulkOrder3.mmRequestedFutureTradeDate, RedemptionBulkExecution3.mmRequestedFutureTradeDate, RedemptionBulkOrder4.mmRequestedFutureTradeDate,
					RedemptionMultipleOrder3.mmRequestedFutureTradeDate, RedemptionMultipleExecution3.mmRequestedFutureTradeDate, RedemptionMultipleOrder4.mmRequestedFutureTradeDate, SubscriptionBulkOrder3.mmRequestedFutureTradeDate,
					SubscriptionBulkExecution3.mmRequestedFutureTradeDate, SubscriptionBulkOrder4.mmRequestedFutureTradeDate, SubscriptionMultipleOrder3.mmRequestedFutureTradeDate, SubscriptionMultipleExecution3.mmRequestedFutureTradeDate,
					SubscriptionMultipleOrder4.mmRequestedFutureTradeDate, SwitchOrder3.mmRequestedFutureTradeDate, SwitchExecution4.mmRequestedFutureTradeDate, SwitchOrder4.mmRequestedFutureTradeDate, FundOrderData3.mmRequestedTradeDate,
					RedemptionExecution10.mmRequestedTradeDate, RedemptionOrder9.mmRequestedTradeDate, SubscriptionExecution7.mmRequestedTradeDate, SubscriptionOrder9.mmRequestedTradeDate, SwitchExecution7.mmRequestedFutureTradeDate,
					SubscriptionBulkOrder5.mmRequestedFutureTradeDate, RedemptionBulkExecution5.mmRequestedFutureTradeDate, RedemptionMultipleExecution5.mmRequestedFutureTradeDate, RedemptionMultipleOrder6.mmRequestedFutureTradeDate,
					SubscriptionMultipleOrder6.mmRequestedFutureTradeDate, SubscriptionBulkExecution4.mmRequestedFutureTradeDate, SwitchOrder7.mmRequestedFutureTradeDate, RedemptionBulkOrder6.mmRequestedFutureTradeDate,
					SubscriptionMultipleExecution5.mmRequestedFutureTradeDate);
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrder.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RequestedExecutionDateTime";
			definition = "Date and time at which the investor requests the order to be executed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundOrder.class.getMethod("getRequestedExecutionDateTime", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected FinancialAdviceCode financialAdvice;
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
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder5#mmFinancialAdvice
	 * RedemptionOrder5.mmFinancialAdvice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution5#mmFinancialAdvice
	 * RedemptionExecution5.mmFinancialAdvice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder7#mmFinancialAdvice
	 * RedemptionOrder7.mmFinancialAdvice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder6#mmFinancialAdvice
	 * RedemptionOrder6.mmFinancialAdvice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#mmFinancialAdvice
	 * RedemptionExecution6.mmFinancialAdvice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder8#mmFinancialAdvice
	 * RedemptionOrder8.mmFinancialAdvice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder5#mmFinancialAdvice
	 * SubscriptionOrder5.mmFinancialAdvice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution5#mmFinancialAdvice
	 * SubscriptionExecution5.mmFinancialAdvice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder7#mmFinancialAdvice
	 * SubscriptionOrder7.mmFinancialAdvice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder6#mmFinancialAdvice
	 * SubscriptionOrder6.mmFinancialAdvice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#mmFinancialAdvice
	 * SubscriptionExecution6.mmFinancialAdvice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder8#mmFinancialAdvice
	 * SubscriptionOrder8.mmFinancialAdvice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder3#mmFinancialAdvice
	 * SwitchOrder3.mmFinancialAdvice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution4#mmFinancialAdvice
	 * SwitchExecution4.mmFinancialAdvice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder4#mmFinancialAdvice
	 * SwitchOrder4.mmFinancialAdvice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution7#mmFinancialAdvice
	 * SwitchExecution7.mmFinancialAdvice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder7#mmFinancialAdvice
	 * SwitchOrder7.mmFinancialAdvice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder14#mmFinancialAdvice
	 * RedemptionOrder14.mmFinancialAdvice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmFinancialAdvice
	 * SubscriptionExecution13.mmFinancialAdvice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution12#mmFinancialAdvice
	 * SubscriptionExecution12.mmFinancialAdvice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder15#mmFinancialAdvice
	 * SubscriptionOrder15.mmFinancialAdvice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder15#mmFinancialAdvice
	 * RedemptionOrder15.mmFinancialAdvice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#mmFinancialAdvice
	 * RedemptionExecution16.mmFinancialAdvice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder14#mmFinancialAdvice
	 * SubscriptionOrder14.mmFinancialAdvice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#mmFinancialAdvice
	 * RedemptionExecution15.mmFinancialAdvice}</li>
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
	public static final MMBusinessAttribute mmFinancialAdvice = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(RedemptionOrder5.mmFinancialAdvice, RedemptionExecution5.mmFinancialAdvice, RedemptionOrder7.mmFinancialAdvice, RedemptionOrder6.mmFinancialAdvice, RedemptionExecution6.mmFinancialAdvice,
					RedemptionOrder8.mmFinancialAdvice, SubscriptionOrder5.mmFinancialAdvice, SubscriptionExecution5.mmFinancialAdvice, SubscriptionOrder7.mmFinancialAdvice, SubscriptionOrder6.mmFinancialAdvice,
					SubscriptionExecution6.mmFinancialAdvice, SubscriptionOrder8.mmFinancialAdvice, SwitchOrder3.mmFinancialAdvice, SwitchExecution4.mmFinancialAdvice, SwitchOrder4.mmFinancialAdvice, SwitchExecution7.mmFinancialAdvice,
					SwitchOrder7.mmFinancialAdvice, RedemptionOrder14.mmFinancialAdvice, SubscriptionExecution13.mmFinancialAdvice, SubscriptionExecution12.mmFinancialAdvice, SubscriptionOrder15.mmFinancialAdvice,
					RedemptionOrder15.mmFinancialAdvice, RedemptionExecution16.mmFinancialAdvice, SubscriptionOrder14.mmFinancialAdvice, RedemptionExecution15.mmFinancialAdvice);
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrder.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FinancialAdvice";
			definition = "Specifies if advice has been received from an independent financial advisor.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FinancialAdviceCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundOrder.class.getMethod("getFinancialAdvice", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected NegotiatedTradeCode negotiatedTrade;
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
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder5#mmNegotiatedTrade
	 * RedemptionOrder5.mmNegotiatedTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution5#mmNegotiatedTrade
	 * RedemptionExecution5.mmNegotiatedTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder7#mmNegotiatedTrade
	 * RedemptionOrder7.mmNegotiatedTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder6#mmNegotiatedTrade
	 * RedemptionOrder6.mmNegotiatedTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#mmNegotiatedTrade
	 * RedemptionExecution6.mmNegotiatedTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder8#mmNegotiatedTrade
	 * RedemptionOrder8.mmNegotiatedTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder5#mmNegotiatedTrade
	 * SubscriptionOrder5.mmNegotiatedTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution5#mmNegotiatedTrade
	 * SubscriptionExecution5.mmNegotiatedTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder7#mmNegotiatedTrade
	 * SubscriptionOrder7.mmNegotiatedTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder6#mmNegotiatedTrade
	 * SubscriptionOrder6.mmNegotiatedTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#mmNegotiatedTrade
	 * SubscriptionExecution6.mmNegotiatedTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder8#mmNegotiatedTrade
	 * SubscriptionOrder8.mmNegotiatedTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder3#mmNegotiatedTrade
	 * SwitchOrder3.mmNegotiatedTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution4#mmNegotiatedTrade
	 * SwitchExecution4.mmNegotiatedTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder4#mmNegotiatedTrade
	 * SwitchOrder4.mmNegotiatedTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution7#mmNegotiatedTrade
	 * SwitchExecution7.mmNegotiatedTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder7#mmNegotiatedTrade
	 * SwitchOrder7.mmNegotiatedTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder14#mmNegotiatedTrade
	 * RedemptionOrder14.mmNegotiatedTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmNegotiatedTrade
	 * SubscriptionExecution13.mmNegotiatedTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution12#mmNegotiatedTrade
	 * SubscriptionExecution12.mmNegotiatedTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder15#mmNegotiatedTrade
	 * SubscriptionOrder15.mmNegotiatedTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder15#mmNegotiatedTrade
	 * RedemptionOrder15.mmNegotiatedTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#mmNegotiatedTrade
	 * RedemptionExecution16.mmNegotiatedTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder14#mmNegotiatedTrade
	 * SubscriptionOrder14.mmNegotiatedTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#mmNegotiatedTrade
	 * RedemptionExecution15.mmNegotiatedTrade}</li>
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
	public static final MMBusinessAttribute mmNegotiatedTrade = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(RedemptionOrder5.mmNegotiatedTrade, RedemptionExecution5.mmNegotiatedTrade, RedemptionOrder7.mmNegotiatedTrade, RedemptionOrder6.mmNegotiatedTrade, RedemptionExecution6.mmNegotiatedTrade,
					RedemptionOrder8.mmNegotiatedTrade, SubscriptionOrder5.mmNegotiatedTrade, SubscriptionExecution5.mmNegotiatedTrade, SubscriptionOrder7.mmNegotiatedTrade, SubscriptionOrder6.mmNegotiatedTrade,
					SubscriptionExecution6.mmNegotiatedTrade, SubscriptionOrder8.mmNegotiatedTrade, SwitchOrder3.mmNegotiatedTrade, SwitchExecution4.mmNegotiatedTrade, SwitchOrder4.mmNegotiatedTrade, SwitchExecution7.mmNegotiatedTrade,
					SwitchOrder7.mmNegotiatedTrade, RedemptionOrder14.mmNegotiatedTrade, SubscriptionExecution13.mmNegotiatedTrade, SubscriptionExecution12.mmNegotiatedTrade, SubscriptionOrder15.mmNegotiatedTrade,
					RedemptionOrder15.mmNegotiatedTrade, RedemptionExecution16.mmNegotiatedTrade, SubscriptionOrder14.mmNegotiatedTrade, RedemptionExecution15.mmNegotiatedTrade);
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrder.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NegotiatedTrade";
			definition = "Specifies whether the trade is negotiated.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> NegotiatedTradeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundOrder.class.getMethod("getNegotiatedTrade", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PercentageRate holdingsRate;
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
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity11Choice#mmHoldingsRate
	 * FinancialInstrumentQuantity11Choice.mmHoldingsRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SidePocketQuantityAndAmount1#mmHoldingsRate
	 * SidePocketQuantityAndAmount1.mmHoldingsRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity10Choice#mmHoldingsRate
	 * FinancialInstrumentQuantity10Choice.mmHoldingsRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SidePocketUnitsOrAmountOrRate1Choice#mmHoldingsRate
	 * SidePocketUnitsOrAmountOrRate1Choice.mmHoldingsRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity8Choice#mmHoldingsRate
	 * FinancialInstrumentQuantity8Choice.mmHoldingsRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity12Choice#mmHoldingsRate
	 * FinancialInstrumentQuantity12Choice.mmHoldingsRate}</li>
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
	public static final MMBusinessAttribute mmHoldingsRate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(FinancialInstrumentQuantity11Choice.mmHoldingsRate, SidePocketQuantityAndAmount1.mmHoldingsRate, FinancialInstrumentQuantity10Choice.mmHoldingsRate,
					SidePocketUnitsOrAmountOrRate1Choice.mmHoldingsRate, FinancialInstrumentQuantity8Choice.mmHoldingsRate, FinancialInstrumentQuantity12Choice.mmHoldingsRate);
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrder.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "HoldingsRate";
			definition = "Percentage of the financial quantity to be invested or redeemed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundOrder.class.getMethod("getHoldingsRate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected OrderWaiverReasonCode orderWaiverReason;
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
	 * {@linkplain com.tools20022.repository.choice.OrderWaiverReason1Choice#mmReason
	 * OrderWaiverReason1Choice.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OrderWaiverReason1Choice#mmProprietary
	 * OrderWaiverReason1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation2#mmOrderWaiverReason
	 * AdditionalInformation2.mmOrderWaiverReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder9#mmOrderWaiverDetails
	 * RedemptionOrder9.mmOrderWaiverDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder9#mmOrderWaiverDetails
	 * SubscriptionOrder9.mmOrderWaiverDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution7#mmOrderWaiverDetails
	 * SwitchExecution7.mmOrderWaiverDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder7#mmOrderWaiverDetails
	 * SwitchOrder7.mmOrderWaiverDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder14#mmOrderWaiverDetails
	 * RedemptionOrder14.mmOrderWaiverDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmOrderWaiverDetails
	 * SubscriptionExecution13.mmOrderWaiverDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrderWaiver1#mmOrderWaiverReason
	 * OrderWaiver1.mmOrderWaiverReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution12#mmOrderWaiverDetails
	 * SubscriptionExecution12.mmOrderWaiverDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder15#mmOrderWaiverDetails
	 * SubscriptionOrder15.mmOrderWaiverDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OrderWaiverReason3Choice#mmCode
	 * OrderWaiverReason3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OrderWaiverReason3Choice#mmProprietary
	 * OrderWaiverReason3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder15#mmOrderWaiverDetails
	 * RedemptionOrder15.mmOrderWaiverDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#mmOrderWaiverDetails
	 * RedemptionExecution16.mmOrderWaiverDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder14#mmOrderWaiverDetails
	 * SubscriptionOrder14.mmOrderWaiverDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#mmOrderWaiverDetails
	 * RedemptionExecution15.mmOrderWaiverDetails}</li>
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
	public static final MMBusinessAttribute mmOrderWaiverReason = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(OrderWaiverReason1Choice.mmReason, OrderWaiverReason1Choice.mmProprietary, AdditionalInformation2.mmOrderWaiverReason, RedemptionOrder9.mmOrderWaiverDetails,
					SubscriptionOrder9.mmOrderWaiverDetails, SwitchExecution7.mmOrderWaiverDetails, SwitchOrder7.mmOrderWaiverDetails, RedemptionOrder14.mmOrderWaiverDetails, SubscriptionExecution13.mmOrderWaiverDetails,
					OrderWaiver1.mmOrderWaiverReason, SubscriptionExecution12.mmOrderWaiverDetails, SubscriptionOrder15.mmOrderWaiverDetails, OrderWaiverReason3Choice.mmCode, OrderWaiverReason3Choice.mmProprietary,
					RedemptionOrder15.mmOrderWaiverDetails, RedemptionExecution16.mmOrderWaiverDetails, SubscriptionOrder14.mmOrderWaiverDetails, RedemptionExecution15.mmOrderWaiverDetails);
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrder.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OrderWaiverReason";
			definition = "Reason why an order has to be handled differently, probably in a manual fashion, because for example, the investment manager has agreed a waiver to the extended terms.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> OrderWaiverReasonCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundOrder.class.getMethod("getOrderWaiverReason", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator initialOrderIndicator;
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
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder9#mmInitialOrderIndicator
	 * SubscriptionOrder9.mmInitialOrderIndicator}</li>
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
	public static final MMBusinessAttribute mmInitialOrderIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(SubscriptionOrder9.mmInitialOrderIndicator);
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrder.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InitialOrderIndicator";
			definition = "Indicates whether the subscription order is an initial order.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundOrder.class.getMethod("getInitialOrderIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODateTime orderBookingDate;
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
	public static final MMBusinessAttribute mmOrderBookingDate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrder.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OrderBookingDate";
			definition = "Date and time an investment fund order is registered on the books of either the fund or its designated agent, eg, transfer agent.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundOrder.class.getMethod("getOrderBookingDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected InvestmentPlan investmentPlan;
	/**
	 * Investment plan which triggers the standing orders.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentPlan#mmStandingOrder
	 * InvestmentPlan.mmStandingOrder}</li>
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
	public static final MMBusinessAssociationEnd mmInvestmentPlan = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrder.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvestmentPlan";
			definition = "Investment plan which triggers the standing orders.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentPlan.mmStandingOrder;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentPlan.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesOrderStatus> orderStatus;
	/**
	 * Status of an investment fund order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus#mmInvestmentFundOrder
	 * SecuritiesOrderStatus.mmInvestmentFundOrder}</li>
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
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason1#mmConfirmationRejected
	 * IndividualOrderConfirmationStatusAndReason1.mmConfirmationRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason1#mmAmendmentRejected
	 * IndividualOrderConfirmationStatusAndReason1.mmAmendmentRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchLegReferences1#mmRepairedConditions
	 * SwitchLegReferences1.mmRepairedConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrderStatusAndReason1#mmRejected
	 * SwitchOrderStatusAndReason1.mmRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrderStatusAndReason1#mmInRepair
	 * SwitchOrderStatusAndReason1.mmInRepair}</li>
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
	public static final MMBusinessAssociationEnd mmOrderStatus = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(IndividualOrderConfirmationStatusAndReason1.mmConfirmationRejected, IndividualOrderConfirmationStatusAndReason1.mmAmendmentRejected, SwitchLegReferences1.mmRepairedConditions,
					SwitchOrderStatusAndReason1.mmRejected, SwitchOrderStatusAndReason1.mmInRepair);
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrder.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OrderStatus";
			definition = "Status of an investment fund order.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderStatus.mmInvestmentFundOrder;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderStatus.mmObject();
		}
	};
	protected CurrencyAndAmount totalAmount;
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
	 * {@linkplain com.tools20022.repository.msg.SubscriptionInformation#mmTotalAmountYearToDate
	 * SubscriptionInformation.mmTotalAmountYearToDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionInformation1#mmTotalAmountYearToDate
	 * SubscriptionInformation1.mmTotalAmountYearToDate}</li>
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
	public static final MMBusinessAttribute mmTotalAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(SubscriptionInformation.mmTotalAmountYearToDate, SubscriptionInformation1.mmTotalAmountYearToDate);
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrder.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TotalAmount";
			definition = "Total amount subscribed in the current tax year.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundOrder.class.getMethod("getTotalAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InvestmentFundOrder";
				definition = "An investor's instruction to either subscribe or redeem an amount of money or its equivalent, for example other assets, into or out of an investment fund.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentPlan.mmStandingOrder, com.tools20022.repository.entity.SecuritiesQuantity.mmOrder,
						com.tools20022.repository.entity.InvestmentFundTransaction.mmInvestmentFundOrder, com.tools20022.repository.entity.InvestmentFundOrderExecution.mmOrder,
						com.tools20022.repository.entity.SecuritiesOrderStatus.mmInvestmentFundOrder);
				derivationElement_lazy = () -> Arrays.asList(BlockedStatusReason2.mmTransactionType);
				subType_lazy = () -> Arrays.asList(RedemptionOrder.mmObject(), SwitchOrder.mmObject(), SubscriptionOrder.mmObject());
				superType_lazy = () -> SecuritiesOrder.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentFundOrder.mmGrossAmountIndicator, com.tools20022.repository.entity.InvestmentFundOrder.mmRelatedTransaction,
						com.tools20022.repository.entity.InvestmentFundOrder.mmOrderType, com.tools20022.repository.entity.InvestmentFundOrder.mmGrossAmount, com.tools20022.repository.entity.InvestmentFundOrder.mmUnitsNumber,
						com.tools20022.repository.entity.InvestmentFundOrder.mmInvestmentFundOrderExecution, com.tools20022.repository.entity.InvestmentFundOrder.mmNetAmount,
						com.tools20022.repository.entity.InvestmentFundOrder.mmOrderDateTime, com.tools20022.repository.entity.InvestmentFundOrder.mmExpiryDateTime, com.tools20022.repository.entity.InvestmentFundOrder.mmCancellationRight,
						com.tools20022.repository.entity.InvestmentFundOrder.mmRequestedSettlementCurrency, com.tools20022.repository.entity.InvestmentFundOrder.mmRequestedExecutionDateTime,
						com.tools20022.repository.entity.InvestmentFundOrder.mmFinancialAdvice, com.tools20022.repository.entity.InvestmentFundOrder.mmNegotiatedTrade, com.tools20022.repository.entity.InvestmentFundOrder.mmHoldingsRate,
						com.tools20022.repository.entity.InvestmentFundOrder.mmOrderWaiverReason, com.tools20022.repository.entity.InvestmentFundOrder.mmInitialOrderIndicator,
						com.tools20022.repository.entity.InvestmentFundOrder.mmOrderBookingDate, com.tools20022.repository.entity.InvestmentFundOrder.mmInvestmentPlan, com.tools20022.repository.entity.InvestmentFundOrder.mmOrderStatus,
						com.tools20022.repository.entity.InvestmentFundOrder.mmTotalAmount);
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

			@Override
			public Class<?> getInstanceClass() {
				return InvestmentFundOrder.class;
			}
		});
		return mmObject_lazy.get();
	}

	public YesNoIndicator getGrossAmountIndicator() {
		return grossAmountIndicator;
	}

	public void setGrossAmountIndicator(YesNoIndicator grossAmountIndicator) {
		this.grossAmountIndicator = grossAmountIndicator;
	}

	public InvestmentFundTransaction getRelatedTransaction() {
		return relatedTransaction;
	}

	public void setRelatedTransaction(com.tools20022.repository.entity.InvestmentFundTransaction relatedTransaction) {
		this.relatedTransaction = relatedTransaction;
	}

	public FundOrderTypeCode getOrderType() {
		return orderType;
	}

	public void setOrderType(FundOrderTypeCode orderType) {
		this.orderType = orderType;
	}

	public CurrencyAndAmount getGrossAmount() {
		return grossAmount;
	}

	public void setGrossAmount(CurrencyAndAmount grossAmount) {
		this.grossAmount = grossAmount;
	}

	public SecuritiesQuantity getUnitsNumber() {
		return unitsNumber;
	}

	public void setUnitsNumber(com.tools20022.repository.entity.SecuritiesQuantity unitsNumber) {
		this.unitsNumber = unitsNumber;
	}

	public InvestmentFundOrderExecution getInvestmentFundOrderExecution() {
		return investmentFundOrderExecution;
	}

	public void setInvestmentFundOrderExecution(com.tools20022.repository.entity.InvestmentFundOrderExecution investmentFundOrderExecution) {
		this.investmentFundOrderExecution = investmentFundOrderExecution;
	}

	public CurrencyAndAmount getNetAmount() {
		return netAmount;
	}

	public void setNetAmount(CurrencyAndAmount netAmount) {
		this.netAmount = netAmount;
	}

	public ISODateTime getOrderDateTime() {
		return orderDateTime;
	}

	public void setOrderDateTime(ISODateTime orderDateTime) {
		this.orderDateTime = orderDateTime;
	}

	public ISODateTime getExpiryDateTime() {
		return expiryDateTime;
	}

	public void setExpiryDateTime(ISODateTime expiryDateTime) {
		this.expiryDateTime = expiryDateTime;
	}

	public CancellationRightCode getCancellationRight() {
		return cancellationRight;
	}

	public void setCancellationRight(CancellationRightCode cancellationRight) {
		this.cancellationRight = cancellationRight;
	}

	public CurrencyCode getRequestedSettlementCurrency() {
		return requestedSettlementCurrency;
	}

	public void setRequestedSettlementCurrency(CurrencyCode requestedSettlementCurrency) {
		this.requestedSettlementCurrency = requestedSettlementCurrency;
	}

	public ISODateTime getRequestedExecutionDateTime() {
		return requestedExecutionDateTime;
	}

	public void setRequestedExecutionDateTime(ISODateTime requestedExecutionDateTime) {
		this.requestedExecutionDateTime = requestedExecutionDateTime;
	}

	public FinancialAdviceCode getFinancialAdvice() {
		return financialAdvice;
	}

	public void setFinancialAdvice(FinancialAdviceCode financialAdvice) {
		this.financialAdvice = financialAdvice;
	}

	public NegotiatedTradeCode getNegotiatedTrade() {
		return negotiatedTrade;
	}

	public void setNegotiatedTrade(NegotiatedTradeCode negotiatedTrade) {
		this.negotiatedTrade = negotiatedTrade;
	}

	public PercentageRate getHoldingsRate() {
		return holdingsRate;
	}

	public void setHoldingsRate(PercentageRate holdingsRate) {
		this.holdingsRate = holdingsRate;
	}

	public OrderWaiverReasonCode getOrderWaiverReason() {
		return orderWaiverReason;
	}

	public void setOrderWaiverReason(OrderWaiverReasonCode orderWaiverReason) {
		this.orderWaiverReason = orderWaiverReason;
	}

	public YesNoIndicator getInitialOrderIndicator() {
		return initialOrderIndicator;
	}

	public void setInitialOrderIndicator(YesNoIndicator initialOrderIndicator) {
		this.initialOrderIndicator = initialOrderIndicator;
	}

	public ISODateTime getOrderBookingDate() {
		return orderBookingDate;
	}

	public void setOrderBookingDate(ISODateTime orderBookingDate) {
		this.orderBookingDate = orderBookingDate;
	}

	public InvestmentPlan getInvestmentPlan() {
		return investmentPlan;
	}

	public void setInvestmentPlan(com.tools20022.repository.entity.InvestmentPlan investmentPlan) {
		this.investmentPlan = investmentPlan;
	}

	public List<SecuritiesOrderStatus> getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(List<com.tools20022.repository.entity.SecuritiesOrderStatus> orderStatus) {
		this.orderStatus = orderStatus;
	}

	public CurrencyAndAmount getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(CurrencyAndAmount totalAmount) {
		this.totalAmount = totalAmount;
	}
}