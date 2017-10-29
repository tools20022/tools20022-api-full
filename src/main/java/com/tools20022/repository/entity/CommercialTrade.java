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
import com.tools20022.repository.entity.Trade;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Commercial details of a trade transaction between a buyer and a seller.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="CommercialTrade" src="doc-files/CommercialTrade.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CommercialTrade#PurchaseAccount
 * CommercialTrade.PurchaseAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CommercialTrade#PaymentObligation
 * CommercialTrade.PaymentObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CommercialTrade#TotalAcceptedAmount
 * CommercialTrade.TotalAcceptedAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CommercialTrade#PartyRole
 * CommercialTrade.PartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CommercialTrade#TradeSettlement
 * CommercialTrade.TradeSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CommercialTrade#ProductDeliveryObligation
 * CommercialTrade.ProductDeliveryObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CommercialTrade#PurchaseOrder
 * CommercialTrade.PurchaseOrder}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CommercialTrade#Documents
 * CommercialTrade.Documents}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CommercialTrade#RelatedUndertaking
 * CommercialTrade.RelatedUndertaking}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CommercialTrade#TransactionStatus
 * CommercialTrade.TransactionStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CommercialTrade#Agreement
 * CommercialTrade.Agreement}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccount#RelatedCommercialTrade
 * CashAccount.RelatedCommercialTrade}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Agreement#Trade
 * Agreement.Trade}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Document#CommercialTrade
 * Document.CommercialTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#CommercialTrade
 * PaymentObligation.CommercialTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.UnderlyingTransaction#CommercialTrade
 * UnderlyingTransaction.CommercialTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CommercialTradePartyRole#CommercialTrade
 * CommercialTradePartyRole.CommercialTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CommercialTradeSettlement#CommercialTrade
 * CommercialTradeSettlement.CommercialTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BaselineStatus#CommercialTrade
 * BaselineStatus.CommercialTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PurchaseOrder#ResultingCommercialTrade
 * PurchaseOrder.ResultingCommercialTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProductDeliveryObligation#CommercialTrade
 * ProductDeliveryObligation.CommercialTrade}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Baseline2#Goods
 * Baseline2.Goods}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Baseline3#Goods
 * Baseline3.Goods}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.UnderlyingContract1Choice#Trade
 * UnderlyingContract1Choice.Trade}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Trade Trade}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.LineItem10 LineItem10}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LineItem5 LineItem5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Baseline2 Baseline2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LineItem7 LineItem7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Baseline3 Baseline3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LineItem4 LineItem4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CommercialDataSet2
 * CommercialDataSet2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LineItem9 LineItem9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CommercialDataSet3
 * CommercialDataSet3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Baseline4 Baseline4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CommercialDataSet4
 * CommercialDataSet4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LineItem11 LineItem11}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LineItem12 LineItem12}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentInvoice1
 * CardPaymentInvoice1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Baseline5 Baseline5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CommercialDataSet5
 * CommercialDataSet5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LineItem13 LineItem13}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LineItem15 LineItem15}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeSettlement2
 * TradeSettlement2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentInvoice2
 * CardPaymentInvoice2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LineItem16 LineItem16}</li>
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
 * "CommercialTrade"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Commercial details of a trade transaction between a buyer and a seller."</li>
 * </ul>
 */
public class CommercialTrade extends Trade {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specific purchase account for recording debits and credits for accounting
	 * purposes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount#RelatedCommercialTrade
	 * CashAccount.RelatedCommercialTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashAccount
	 * CashAccount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeSettlement1#PurchaseAccountingAccount
	 * TradeSettlement1.PurchaseAccountingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem10#PurchaseAccountingAccount
	 * LineItem10.PurchaseAccountingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem16#PurchaseAccountingAccount
	 * LineItem16.PurchaseAccountingAccount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CommercialTrade
	 * CommercialTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PurchaseAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specific purchase account for recording debits and credits for accounting purposes."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd PurchaseAccount = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TradeSettlement1.PurchaseAccountingAccount, com.tools20022.repository.msg.LineItem10.PurchaseAccountingAccount,
					com.tools20022.repository.msg.LineItem16.PurchaseAccountingAccount);
			elementContext_lazy = () -> CommercialTrade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PurchaseAccount";
			definition = "Specific purchase account for recording debits and credits for accounting purposes.";
			minOccurs = 0;
			type_lazy = () -> CashAccount.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CashAccount.RelatedCommercialTrade;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Obligation for the buyer to settle the value of the products bought.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation#CommercialTrade
	 * PaymentObligation.CommercialTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PaymentObligation
	 * PaymentObligation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Baseline2#PaymentTerms
	 * Baseline2.PaymentTerms}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Baseline3#PaymentTerms
	 * Baseline3.PaymentTerms}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Baseline3#PaymentObligation
	 * Baseline3.PaymentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommercialDataSet2#PaymentTerms
	 * CommercialDataSet2.PaymentTerms}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommercialDataSet3#PaymentTerms
	 * CommercialDataSet3.PaymentTerms}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Baseline4#PaymentTerms
	 * Baseline4.PaymentTerms}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Baseline4#PaymentObligation
	 * Baseline4.PaymentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommercialDataSet4#PaymentTerms
	 * CommercialDataSet4.PaymentTerms}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Baseline5#PaymentTerms
	 * Baseline5.PaymentTerms}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Baseline5#PaymentObligation
	 * Baseline5.PaymentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommercialDataSet5#PaymentTerms
	 * CommercialDataSet5.PaymentTerms}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CommercialTrade
	 * CommercialTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentObligation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Obligation for the buyer to settle the value of the products bought."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd PaymentObligation = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Baseline2.PaymentTerms, com.tools20022.repository.msg.Baseline3.PaymentTerms, com.tools20022.repository.msg.Baseline3.PaymentObligation,
					com.tools20022.repository.msg.CommercialDataSet2.PaymentTerms, com.tools20022.repository.msg.CommercialDataSet3.PaymentTerms, com.tools20022.repository.msg.Baseline4.PaymentTerms,
					com.tools20022.repository.msg.Baseline4.PaymentObligation, com.tools20022.repository.msg.CommercialDataSet4.PaymentTerms, com.tools20022.repository.msg.Baseline5.PaymentTerms,
					com.tools20022.repository.msg.Baseline5.PaymentObligation, com.tools20022.repository.msg.CommercialDataSet5.PaymentTerms);
			elementContext_lazy = () -> CommercialTrade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PaymentObligation";
			definition = "Obligation for the buyer to settle the value of the products bought.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentObligation.CommercialTrade;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Total amount of a trade, that is the sum of the accepted items.
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
	 * {@linkplain com.tools20022.repository.msg.LineItem6#AcceptedLineItemsTotalAmount
	 * LineItem6.AcceptedLineItemsTotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem8#AcceptedLineItemsTotalAmount
	 * LineItem8.AcceptedLineItemsTotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem14#AcceptedLineItemsTotalAmount
	 * LineItem14.AcceptedLineItemsTotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeSettlement2#TaxTotalAmount
	 * TradeSettlement2.TaxTotalAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CommercialTrade
	 * CommercialTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalAcceptedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total amount of a trade, that is the sum of the accepted items."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TotalAcceptedAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.LineItem6.AcceptedLineItemsTotalAmount, com.tools20022.repository.msg.LineItem8.AcceptedLineItemsTotalAmount,
					com.tools20022.repository.msg.LineItem14.AcceptedLineItemsTotalAmount, com.tools20022.repository.msg.TradeSettlement2.TaxTotalAmount);
			elementContext_lazy = () -> CommercialTrade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TotalAcceptedAmount";
			definition = "Total amount of a trade, that is the sum of the accepted items.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Role played by a party in the context of a trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CommercialTradePartyRole#CommercialTrade
	 * CommercialTradePartyRole.CommercialTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CommercialTradePartyRole
	 * CommercialTradePartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CommercialTrade
	 * CommercialTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Role played by a party in the context of a trade."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd PartyRole = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CommercialTrade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PartyRole";
			definition = "Role played by a party in the context of a trade.";
			minOccurs = 0;
			type_lazy = () -> CommercialTradePartyRole.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CommercialTradePartyRole.CommercialTrade;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Process of settling a commercial trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CommercialTradeSettlement#CommercialTrade
	 * CommercialTradeSettlement.CommercialTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CommercialTradeSettlement
	 * CommercialTradeSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CommercialTrade
	 * CommercialTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Process of settling a commercial trade."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd TradeSettlement = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CommercialTrade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TradeSettlement";
			definition = "Process of settling a commercial trade.";
			minOccurs = 0;
			type_lazy = () -> CommercialTradeSettlement.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CommercialTradeSettlement.CommercialTrade;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Obligation for the seller to deliver the products to the buyer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ProductDeliveryObligation#CommercialTrade
	 * ProductDeliveryObligation.CommercialTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.ProductDeliveryObligation
	 * ProductDeliveryObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CommercialTrade
	 * CommercialTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProductDeliveryObligation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Obligation for the seller to deliver the products to the buyer."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ProductDeliveryObligation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CommercialTrade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ProductDeliveryObligation";
			definition = "Obligation for the seller to deliver the products to the buyer.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.ProductDeliveryObligation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ProductDeliveryObligation.CommercialTrade;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the purchase order related to a commercial trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PurchaseOrder#ResultingCommercialTrade
	 * PurchaseOrder.ResultingCommercialTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PurchaseOrder
	 * PurchaseOrder}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemAndPOIdentification1#PurchaseOrderReference
	 * LineItemAndPOIdentification1.PurchaseOrderReference}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CommercialTrade
	 * CommercialTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PurchaseOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the purchase order related to a commercial trade."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd PurchaseOrder = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.LineItemAndPOIdentification1.PurchaseOrderReference);
			elementContext_lazy = () -> CommercialTrade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PurchaseOrder";
			definition = "Specifies the purchase order related to a commercial trade.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.PurchaseOrder.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PurchaseOrder.ResultingCommercialTrade;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Documents related to a commercial trade transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Document#CommercialTrade
	 * Document.CommercialTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Document Document}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CommercialTrade
	 * CommercialTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Documents"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Documents related to                             a commercial trade transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Documents = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CommercialTrade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Documents";
			definition = "Documents related to                             a commercial trade transaction.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Document.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Document.CommercialTrade;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Undertaking related to the commercial trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.UnderlyingTransaction#CommercialTrade
	 * UnderlyingTransaction.CommercialTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.UnderlyingTransaction
	 * UnderlyingTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CommercialTrade
	 * CommercialTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedUndertaking"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Undertaking related to the commercial trade."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedUndertaking = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CommercialTrade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedUndertaking";
			definition = "Undertaking related to the commercial trade.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> UnderlyingTransaction.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.UnderlyingTransaction.CommercialTrade;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Status of a commercial trade processed in a central system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BaselineStatus#CommercialTrade
	 * BaselineStatus.CommercialTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.BaselineStatus
	 * BaselineStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CommercialTrade
	 * CommercialTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Status of a commercial trade processed in a central system."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd TransactionStatus = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CommercialTrade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransactionStatus";
			definition = "Status of a commercial trade processed in a central system.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> BaselineStatus.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.BaselineStatus.CommercialTrade;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Agreement between trade parties which describes the conditions under
	 * which they agree to execute trades amongst themselves.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Agreement#Trade
	 * Agreement.Trade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Agreement Agreement}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CommercialTrade
	 * CommercialTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Agreement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Agreement between trade parties which describes the conditions under which they agree to execute trades amongst themselves."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Agreement = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CommercialTrade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Agreement";
			definition = "Agreement between trade parties which describes the conditions under which they agree to execute trades amongst themselves.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Agreement.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Agreement.Trade;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CommercialTrade";
				definition = "Commercial details of a trade transaction between a buyer and a seller.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashAccount.RelatedCommercialTrade, com.tools20022.repository.entity.Agreement.Trade, com.tools20022.repository.entity.Document.CommercialTrade,
						com.tools20022.repository.entity.PaymentObligation.CommercialTrade, com.tools20022.repository.entity.UnderlyingTransaction.CommercialTrade, com.tools20022.repository.entity.CommercialTradePartyRole.CommercialTrade,
						com.tools20022.repository.entity.CommercialTradeSettlement.CommercialTrade, com.tools20022.repository.entity.BaselineStatus.CommercialTrade, com.tools20022.repository.entity.PurchaseOrder.ResultingCommercialTrade,
						com.tools20022.repository.entity.ProductDeliveryObligation.CommercialTrade);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Baseline2.Goods, com.tools20022.repository.msg.Baseline3.Goods, com.tools20022.repository.choice.UnderlyingContract1Choice.Trade);
				superType_lazy = () -> Trade.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CommercialTrade.PurchaseAccount, com.tools20022.repository.entity.CommercialTrade.PaymentObligation,
						com.tools20022.repository.entity.CommercialTrade.TotalAcceptedAmount, com.tools20022.repository.entity.CommercialTrade.PartyRole, com.tools20022.repository.entity.CommercialTrade.TradeSettlement,
						com.tools20022.repository.entity.CommercialTrade.ProductDeliveryObligation, com.tools20022.repository.entity.CommercialTrade.PurchaseOrder, com.tools20022.repository.entity.CommercialTrade.Documents,
						com.tools20022.repository.entity.CommercialTrade.RelatedUndertaking, com.tools20022.repository.entity.CommercialTrade.TransactionStatus, com.tools20022.repository.entity.CommercialTrade.Agreement);
				derivationComponent_lazy = () -> Arrays.asList(LineItem10.mmObject(), LineItem5.mmObject(), Baseline2.mmObject(), LineItem7.mmObject(), Baseline3.mmObject(), LineItem4.mmObject(), CommercialDataSet2.mmObject(),
						LineItem9.mmObject(), CommercialDataSet3.mmObject(), Baseline4.mmObject(), CommercialDataSet4.mmObject(), LineItem11.mmObject(), LineItem12.mmObject(), CardPaymentInvoice1.mmObject(), Baseline5.mmObject(),
						CommercialDataSet5.mmObject(), LineItem13.mmObject(), LineItem15.mmObject(), TradeSettlement2.mmObject(), CardPaymentInvoice2.mmObject(), LineItem16.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}