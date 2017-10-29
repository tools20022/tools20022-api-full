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
import com.tools20022.repository.choice.Purpose1Choice;
import com.tools20022.repository.choice.Purpose2Choice;
import com.tools20022.repository.choice.Purpose3Choice;
import com.tools20022.repository.choice.PurposeChoice;
import com.tools20022.repository.codeset.CountryCode;
import com.tools20022.repository.codeset.PaymentPurposeCode;
import com.tools20022.repository.codeset.RemittanceLocationMethodCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.Obligation;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Obligation for the debtor to pay the creditor an amount of cash.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="PaymentObligation" src="doc-files/PaymentObligation.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#PaymentOffset
 * PaymentObligation.PaymentOffset}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentObligation#Purpose
 * PaymentObligation.Purpose}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#RemittanceDeliveryMethod
 * PaymentObligation.RemittanceDeliveryMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#AssociatedDocument
 * PaymentObligation.AssociatedDocument}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentObligation#Amount
 * PaymentObligation.Amount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#RemittanceLocation
 * PaymentObligation.RemittanceLocation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentObligation#Interest
 * PaymentObligation.Interest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#CommercialTrade
 * PaymentObligation.CommercialTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#Percentage
 * PaymentObligation.Percentage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#MaximumAmount
 * PaymentObligation.MaximumAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#ExpiryDate
 * PaymentObligation.ExpiryDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#ApplicableLaw
 * PaymentObligation.ApplicableLaw}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#PaymentSourceBuyIn
 * PaymentObligation.PaymentSourceBuyIn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#RelatedCorporateAction
 * PaymentObligation.RelatedCorporateAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#RelatedCollateralMovement
 * PaymentObligation.RelatedCollateralMovement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#PaymentSourceUndertakingDemand
 * PaymentObligation.PaymentSourceUndertakingDemand}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentObligation#PartyRole
 * PaymentObligation.PartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#ExecutedSecuritiesTrade
 * PaymentObligation.ExecutedSecuritiesTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#RelatedAccountClosingTerms
 * PaymentObligation.RelatedAccountClosingTerms}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#PaymentSourcePortfolioTransfer
 * PaymentObligation.PaymentSourcePortfolioTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#PaymentSourceCurrencyOption
 * PaymentObligation.PaymentSourceCurrencyOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#ExchangeRateInformation
 * PaymentObligation.ExchangeRateInformation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentObligation#Dividend
 * PaymentObligation.Dividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#RepurchaseAgreement
 * PaymentObligation.RepurchaseAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#RelatedAssignment
 * PaymentObligation.RelatedAssignment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#BankingTransaction
 * PaymentObligation.BankingTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#PaymentTerms
 * PaymentObligation.PaymentTerms}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#PaymentDueDate
 * PaymentObligation.PaymentDueDate}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Dividend#Obligation
 * Dividend.Obligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ContactPoint#RemittanceRelatedPayment
 * ContactPoint.RemittanceRelatedPayment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Document#PaymentObligation
 * Document.PaymentObligation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#PaymentObligation
 * Payment.PaymentObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer#PaymentObligation
 * PortfolioTransfer.PaymentObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccountContract#BalanceTransfer
 * CashAccountContract.BalanceTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#PaymentObligation
 * SecuritiesTradeExecution.PaymentObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade#ResultingSettlement
 * ForeignExchangeTrade.ResultingSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction#CashProceedsMovement
 * CorporateActionProceedsDeliveryInstruction.CashProceedsMovement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligationPartyRole#PaymentObligation
 * PaymentObligationPartyRole.PaymentObligation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Demand#Payment
 * Demand.Payment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyOption#PremiumSettlement
 * CurrencyOption.PremiumSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CommercialTrade#PaymentObligation
 * CommercialTrade.PaymentObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralMovement#CashCollateralMovement
 * CollateralMovement.CashCollateralMovement}</li>
 * <li>{@linkplain com.tools20022.repository.entity.BuyIn#CashCompensation
 * BuyIn.CashCompensation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BankingTransaction#PaymentObligation
 * BankingTransaction.PaymentObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RepurchaseAgreement#PaymentObligation
 * RepurchaseAgreement.PaymentObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Assignment#PaymentObligation
 * Assignment.PaymentObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentTerms#RelatedPaymentObligation
 * PaymentTerms.RelatedPaymentObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InterestManagement#PaymentObligation
 * InterestManagement.PaymentObligation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentObligation1#PaymentTerms
 * PaymentObligation1.PaymentTerms}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentObligation2#PaymentTerms
 * PaymentObligation2.PaymentTerms}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Instalment Instalment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Garnishment Garnishment}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Obligation
 * Obligation}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.Purpose1Choice
 * Purpose1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Purpose2Choice
 * Purpose2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PurposeChoice PurposeChoice}
 * </li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementData1
 * SettlementData1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementData2
 * SettlementData2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTerms3 PaymentTerms3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTerms1 PaymentTerms1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTerms2 PaymentTerms2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentObligation1
 * PaymentObligation1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentObligation2
 * PaymentObligation2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTerms4 PaymentTerms4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTerms5 PaymentTerms5}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Purpose3Choice
 * Purpose3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTerms6 PaymentTerms6}</li>
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
 * "PaymentObligation"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Obligation for the debtor to pay the creditor an amount of cash."</li>
 * </ul>
 */
public class PaymentObligation extends Obligation {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Fulfilment of a payment obligation through a payment and its execution.
	 * It is derived from the association between Obligation and Obligation
	 * fulfillment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Payment#PaymentObligation
	 * Payment.PaymentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan2#CashSettlement
	 * InvestmentPlan2.CashSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan4#CashSettlement
	 * InvestmentPlan4.CashSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan6#CashSettlement
	 * InvestmentPlan6.CashSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan5#ModifiedCashSettlement
	 * InvestmentPlan5.ModifiedCashSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan3#ModifiedCashSettlement
	 * InvestmentPlan3.ModifiedCashSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan7#ModifiedCashSettlement
	 * InvestmentPlan7.ModifiedCashSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder3#CashSettlementDetails
	 * RedemptionOrder3.CashSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder5#CashSettlementDetails
	 * RedemptionOrder5.CashSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution3#CashSettlementDetails
	 * RedemptionExecution3.CashSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution5#CashSettlementDetails
	 * RedemptionExecution5.CashSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder7#CashSettlementDetails
	 * RedemptionOrder7.CashSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder4#CashSettlementDetails
	 * RedemptionOrder4.CashSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder6#CashSettlementDetails
	 * RedemptionOrder6.CashSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution4#CashSettlementDetails
	 * RedemptionExecution4.CashSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#CashSettlementDetails
	 * RedemptionExecution6.CashSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder8#CashSettlementDetails
	 * RedemptionOrder8.CashSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder3#CashSettlementDetails
	 * SubscriptionOrder3.CashSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder5#CashSettlementDetails
	 * SubscriptionOrder5.CashSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution3#CashSettlementDetails
	 * SubscriptionExecution3.CashSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution5#CashSettlementDetails
	 * SubscriptionExecution5.CashSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder7#CashSettlementDetails
	 * SubscriptionOrder7.CashSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder4#CashSettlementDetails
	 * SubscriptionOrder4.CashSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder6#CashSettlementDetails
	 * SubscriptionOrder6.CashSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution4#CashSettlementDetails
	 * SubscriptionExecution4.CashSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#CashSettlementDetails
	 * SubscriptionExecution6.CashSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder8#CashSettlementDetails
	 * SubscriptionOrder8.CashSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder2#CashSettlementDetails
	 * SwitchOrder2.CashSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder3#CashSettlementDetails
	 * SwitchOrder3.CashSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution3#CashSettlementDetails
	 * SwitchExecution3.CashSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution4#CashSettlementDetails
	 * SwitchExecution4.CashSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder4#CashSettlementDetails
	 * SwitchOrder4.CashSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder11#CashSettlementDetails
	 * RedemptionOrder11.CashSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution12#CashSettlementDetails
	 * RedemptionExecution12.CashSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder11#CashSettlementDetails
	 * SubscriptionOrder11.CashSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution9#CashSettlementDetails
	 * SubscriptionExecution9.CashSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan9#CashSettlement
	 * InvestmentPlan9.CashSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan8#ModifiedCashSettlement
	 * InvestmentPlan8.ModifiedCashSettlement}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentTerms4#PaymentTerms
	 * PaymentTerms4.PaymentTerms}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentTerms5#PaymentTerms
	 * PaymentTerms5.PaymentTerms}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan10#CashSettlement
	 * InvestmentPlan10.CashSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan11#ModifiedCashSettlement
	 * InvestmentPlan11.ModifiedCashSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Instalment2#PaymentInstrument
	 * Instalment2.PaymentInstrument}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan12#CashSettlement
	 * InvestmentPlan12.CashSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan13#ModifiedCashSettlement
	 * InvestmentPlan13.ModifiedCashSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan14#CashSettlement
	 * InvestmentPlan14.CashSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution7#CashSettlementDetails
	 * SwitchExecution7.CashSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder7#CashSettlementDetails
	 * SwitchOrder7.CashSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder14#CashSettlementDetails
	 * RedemptionOrder14.CashSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan15#ModifiedCashSettlement
	 * InvestmentPlan15.ModifiedCashSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#CashSettlementDetails
	 * SubscriptionExecution13.CashSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution12#CashSettlementDetails
	 * SubscriptionExecution12.CashSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder15#CashSettlementDetails
	 * SubscriptionOrder15.CashSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder15#CashSettlementDetails
	 * RedemptionOrder15.CashSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#CashSettlementDetails
	 * RedemptionExecution16.CashSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder14#CashSettlementDetails
	 * SubscriptionOrder14.CashSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#CashSettlementDetails
	 * RedemptionExecution15.CashSettlementDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation
	 * PaymentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentOffset"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Fulfilment of a payment obligation through a payment and its execution. It is derived from the association between Obligation and Obligation fulfillment."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd PaymentOffset = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvestmentPlan2.CashSettlement, com.tools20022.repository.msg.InvestmentPlan4.CashSettlement, com.tools20022.repository.msg.InvestmentPlan6.CashSettlement,
					com.tools20022.repository.msg.InvestmentPlan5.ModifiedCashSettlement, com.tools20022.repository.msg.InvestmentPlan3.ModifiedCashSettlement, com.tools20022.repository.msg.InvestmentPlan7.ModifiedCashSettlement,
					com.tools20022.repository.msg.RedemptionOrder3.CashSettlementDetails, com.tools20022.repository.msg.RedemptionOrder5.CashSettlementDetails, com.tools20022.repository.msg.RedemptionExecution3.CashSettlementDetails,
					com.tools20022.repository.msg.RedemptionExecution5.CashSettlementDetails, com.tools20022.repository.msg.RedemptionOrder7.CashSettlementDetails, com.tools20022.repository.msg.RedemptionOrder4.CashSettlementDetails,
					com.tools20022.repository.msg.RedemptionOrder6.CashSettlementDetails, com.tools20022.repository.msg.RedemptionExecution4.CashSettlementDetails, com.tools20022.repository.msg.RedemptionExecution6.CashSettlementDetails,
					com.tools20022.repository.msg.RedemptionOrder8.CashSettlementDetails, com.tools20022.repository.msg.SubscriptionOrder3.CashSettlementDetails, com.tools20022.repository.msg.SubscriptionOrder5.CashSettlementDetails,
					com.tools20022.repository.msg.SubscriptionExecution3.CashSettlementDetails, com.tools20022.repository.msg.SubscriptionExecution5.CashSettlementDetails,
					com.tools20022.repository.msg.SubscriptionOrder7.CashSettlementDetails, com.tools20022.repository.msg.SubscriptionOrder4.CashSettlementDetails, com.tools20022.repository.msg.SubscriptionOrder6.CashSettlementDetails,
					com.tools20022.repository.msg.SubscriptionExecution4.CashSettlementDetails, com.tools20022.repository.msg.SubscriptionExecution6.CashSettlementDetails,
					com.tools20022.repository.msg.SubscriptionOrder8.CashSettlementDetails, com.tools20022.repository.msg.SwitchOrder2.CashSettlementDetails, com.tools20022.repository.msg.SwitchOrder3.CashSettlementDetails,
					com.tools20022.repository.msg.SwitchExecution3.CashSettlementDetails, com.tools20022.repository.msg.SwitchExecution4.CashSettlementDetails, com.tools20022.repository.msg.SwitchOrder4.CashSettlementDetails,
					com.tools20022.repository.msg.RedemptionOrder11.CashSettlementDetails, com.tools20022.repository.msg.RedemptionExecution12.CashSettlementDetails, com.tools20022.repository.msg.SubscriptionOrder11.CashSettlementDetails,
					com.tools20022.repository.msg.SubscriptionExecution9.CashSettlementDetails, com.tools20022.repository.msg.InvestmentPlan9.CashSettlement, com.tools20022.repository.msg.InvestmentPlan8.ModifiedCashSettlement,
					com.tools20022.repository.msg.PaymentTerms4.PaymentTerms, com.tools20022.repository.msg.PaymentTerms5.PaymentTerms, com.tools20022.repository.msg.InvestmentPlan10.CashSettlement,
					com.tools20022.repository.msg.InvestmentPlan11.ModifiedCashSettlement, com.tools20022.repository.msg.Instalment2.PaymentInstrument, com.tools20022.repository.msg.InvestmentPlan12.CashSettlement,
					com.tools20022.repository.msg.InvestmentPlan13.ModifiedCashSettlement, com.tools20022.repository.msg.InvestmentPlan14.CashSettlement, com.tools20022.repository.msg.SwitchExecution7.CashSettlementDetails,
					com.tools20022.repository.msg.SwitchOrder7.CashSettlementDetails, com.tools20022.repository.msg.RedemptionOrder14.CashSettlementDetails, com.tools20022.repository.msg.InvestmentPlan15.ModifiedCashSettlement,
					com.tools20022.repository.msg.SubscriptionExecution13.CashSettlementDetails, com.tools20022.repository.msg.SubscriptionExecution12.CashSettlementDetails,
					com.tools20022.repository.msg.SubscriptionOrder15.CashSettlementDetails, com.tools20022.repository.msg.RedemptionOrder15.CashSettlementDetails, com.tools20022.repository.msg.RedemptionExecution16.CashSettlementDetails,
					com.tools20022.repository.msg.SubscriptionOrder14.CashSettlementDetails, com.tools20022.repository.msg.RedemptionExecution15.CashSettlementDetails);
			elementContext_lazy = () -> PaymentObligation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PaymentOffset";
			definition = "Fulfilment of a payment obligation through a payment and its execution. It is derived from the association between Obligation and Obligation fulfillment.";
			minOccurs = 0;
			type_lazy = () -> Payment.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Payment.PaymentObligation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Underlying reason for the payment obligation
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode
	 * PaymentPurposeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionReference2Details#Purpose
	 * PaymentInstructionReference2Details.Purpose}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentDetails5#Purpose
	 * PaymentDetails5.Purpose}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentDetails6#Purpose
	 * PaymentDetails6.Purpose}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentDetails7#Purpose
	 * PaymentDetails7.Purpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction1#Purpose
	 * PaymentInstruction1.Purpose}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.Purpose1Choice#Code
	 * Purpose1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Purpose1Choice#Proprietary
	 * Purpose1Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.EntryTransaction1#Purpose
	 * EntryTransaction1.Purpose}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.Purpose2Choice#Code
	 * Purpose2Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Purpose2Choice#Proprietary
	 * Purpose2Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.EntryTransaction2#Purpose
	 * EntryTransaction2.Purpose}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.EntryTransaction3#Purpose
	 * EntryTransaction3.Purpose}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.EntryTransaction4#Purpose
	 * EntryTransaction4.Purpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation1#Purpose
	 * CreditTransferTransactionInformation1.Purpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation10#Purpose
	 * CreditTransferTransactionInformation10.Purpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction1#Purpose
	 * CreditTransferTransaction1.Purpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction6#Purpose
	 * CreditTransferTransaction6.Purpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation2#Purpose
	 * CreditTransferTransactionInformation2.Purpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation11#Purpose
	 * CreditTransferTransactionInformation11.Purpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction2#Purpose
	 * CreditTransferTransaction2.Purpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction7#Purpose
	 * CreditTransferTransaction7.Purpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation14#Purpose
	 * CreditTransferTransactionInformation14.Purpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction5#Purpose
	 * CreditTransferTransaction5.Purpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction10#Purpose
	 * CreditTransferTransaction10.Purpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PurposeChoice#Proprietary
	 * PurposeChoice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.PurposeChoice#Code
	 * PurposeChoice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification#Purpose
	 * RequestedModification.Purpose}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.NotificationItem3#Purpose
	 * NotificationItem3.Purpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItemReference1#Purpose
	 * OriginalItemReference1.Purpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation2#Purpose
	 * PaymentComplementaryInformation2.Purpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatementResolutionEntry1#Purpose
	 * StatementResolutionEntry1.Purpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation3#Purpose
	 * PaymentComplementaryInformation3.Purpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatementResolutionEntry2#Purpose
	 * StatementResolutionEntry2.Purpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification3#Purpose
	 * RequestedModification3.Purpose}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.NotificationItem4#Purpose
	 * NotificationItem4.Purpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItemReference2#Purpose
	 * OriginalItemReference2.Purpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation8#Purpose
	 * CreditTransferTransactionInformation8.Purpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation7#Purpose
	 * CreditTransferTransactionInformation7.Purpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation9#Purpose
	 * CreditTransferTransactionInformation9.Purpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction14#Purpose
	 * PaymentInstruction14.Purpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Purpose3Choice#SecuritiesPurposeCode
	 * Purpose3Choice.SecuritiesPurposeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Purpose3Choice#Proprietary
	 * Purpose3Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation4#Purpose
	 * PaymentComplementaryInformation4.Purpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction19#Purpose
	 * CreditTransferTransaction19.Purpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItemReference3#Purpose
	 * OriginalItemReference3.Purpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification4#Purpose
	 * RequestedModification4.Purpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction20#Purpose
	 * CreditTransferTransaction20.Purpose}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.NotificationItem5#Purpose
	 * NotificationItem5.Purpose}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.EntryTransaction7#Purpose
	 * EntryTransaction7.Purpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction21#Purpose
	 * CreditTransferTransaction21.Purpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification5#Purpose
	 * RequestedModification5.Purpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction25#Purpose
	 * CreditTransferTransaction25.Purpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation5#Purpose
	 * PaymentComplementaryInformation5.Purpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction26#Purpose
	 * CreditTransferTransaction26.Purpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItemReference4#Purpose
	 * OriginalItemReference4.Purpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction22#Purpose
	 * CreditTransferTransaction22.Purpose}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.EntryTransaction8#Purpose
	 * EntryTransaction8.Purpose}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.NotificationItem6#Purpose
	 * NotificationItem6.Purpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification6#Purpose
	 * RequestedModification6.Purpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation6#Purpose
	 * PaymentComplementaryInformation6.Purpose}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation
	 * PaymentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Purpose"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Underlying reason for the payment obligation"</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Purpose = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentInstructionReference2Details.Purpose, com.tools20022.repository.msg.PaymentDetails5.Purpose, com.tools20022.repository.msg.PaymentDetails6.Purpose,
					com.tools20022.repository.msg.PaymentDetails7.Purpose, com.tools20022.repository.msg.PaymentInstruction1.Purpose, com.tools20022.repository.choice.Purpose1Choice.Code,
					com.tools20022.repository.choice.Purpose1Choice.Proprietary, com.tools20022.repository.msg.EntryTransaction1.Purpose, com.tools20022.repository.choice.Purpose2Choice.Code,
					com.tools20022.repository.choice.Purpose2Choice.Proprietary, com.tools20022.repository.msg.EntryTransaction2.Purpose, com.tools20022.repository.msg.EntryTransaction3.Purpose,
					com.tools20022.repository.msg.EntryTransaction4.Purpose, com.tools20022.repository.msg.CreditTransferTransactionInformation1.Purpose, com.tools20022.repository.msg.CreditTransferTransactionInformation10.Purpose,
					com.tools20022.repository.msg.CreditTransferTransaction1.Purpose, com.tools20022.repository.msg.CreditTransferTransaction6.Purpose, com.tools20022.repository.msg.CreditTransferTransactionInformation2.Purpose,
					com.tools20022.repository.msg.CreditTransferTransactionInformation11.Purpose, com.tools20022.repository.msg.CreditTransferTransaction2.Purpose, com.tools20022.repository.msg.CreditTransferTransaction7.Purpose,
					com.tools20022.repository.msg.CreditTransferTransactionInformation14.Purpose, com.tools20022.repository.msg.CreditTransferTransaction5.Purpose, com.tools20022.repository.msg.CreditTransferTransaction10.Purpose,
					com.tools20022.repository.choice.PurposeChoice.Proprietary, com.tools20022.repository.choice.PurposeChoice.Code, com.tools20022.repository.msg.RequestedModification.Purpose,
					com.tools20022.repository.msg.NotificationItem3.Purpose, com.tools20022.repository.msg.OriginalItemReference1.Purpose, com.tools20022.repository.msg.PaymentComplementaryInformation2.Purpose,
					com.tools20022.repository.msg.StatementResolutionEntry1.Purpose, com.tools20022.repository.msg.PaymentComplementaryInformation3.Purpose, com.tools20022.repository.msg.StatementResolutionEntry2.Purpose,
					com.tools20022.repository.msg.RequestedModification3.Purpose, com.tools20022.repository.msg.NotificationItem4.Purpose, com.tools20022.repository.msg.OriginalItemReference2.Purpose,
					com.tools20022.repository.msg.CreditTransferTransactionInformation8.Purpose, com.tools20022.repository.msg.CreditTransferTransactionInformation7.Purpose,
					com.tools20022.repository.msg.CreditTransferTransactionInformation9.Purpose, com.tools20022.repository.msg.PaymentInstruction14.Purpose, com.tools20022.repository.choice.Purpose3Choice.SecuritiesPurposeCode,
					com.tools20022.repository.choice.Purpose3Choice.Proprietary, com.tools20022.repository.msg.PaymentComplementaryInformation4.Purpose, com.tools20022.repository.msg.CreditTransferTransaction19.Purpose,
					com.tools20022.repository.msg.OriginalItemReference3.Purpose, com.tools20022.repository.msg.RequestedModification4.Purpose, com.tools20022.repository.msg.CreditTransferTransaction20.Purpose,
					com.tools20022.repository.msg.NotificationItem5.Purpose, com.tools20022.repository.msg.EntryTransaction7.Purpose, com.tools20022.repository.msg.CreditTransferTransaction21.Purpose,
					com.tools20022.repository.msg.RequestedModification5.Purpose, com.tools20022.repository.msg.CreditTransferTransaction25.Purpose, com.tools20022.repository.msg.PaymentComplementaryInformation5.Purpose,
					com.tools20022.repository.msg.CreditTransferTransaction26.Purpose, com.tools20022.repository.msg.OriginalItemReference4.Purpose, com.tools20022.repository.msg.CreditTransferTransaction22.Purpose,
					com.tools20022.repository.msg.EntryTransaction8.Purpose, com.tools20022.repository.msg.NotificationItem6.Purpose, com.tools20022.repository.msg.RequestedModification6.Purpose,
					com.tools20022.repository.msg.PaymentComplementaryInformation6.Purpose);
			elementContext_lazy = () -> PaymentObligation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Purpose";
			definition = "Underlying reason for the payment obligation";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PaymentPurposeCode.mmObject();
		}
	};
	/**
	 * Specifies the method to be used by the first agent (debtor agent in the
	 * case of a credit transfer, creditor agent in the case of a direct debit)
	 * to deliver the remittance advice information, which may be sent
	 * separately from the payment instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.RemittanceLocationMethodCode
	 * RemittanceLocationMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RemittanceLocation1#RemittanceLocationMethod
	 * RemittanceLocation1.RemittanceLocationMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RemittanceLocation2#RemittanceLocationMethod
	 * RemittanceLocation2.RemittanceLocationMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RemittanceLocationDetails1#Method
	 * RemittanceLocationDetails1.Method}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation
	 * PaymentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RemittanceDeliveryMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the method to be used by the first agent (debtor agent in the case of a credit transfer, creditor agent in the case of a direct debit) to deliver the remittance advice information, which may be sent separately from the payment instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute RemittanceDeliveryMethod = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RemittanceLocation1.RemittanceLocationMethod, com.tools20022.repository.msg.RemittanceLocation2.RemittanceLocationMethod,
					com.tools20022.repository.msg.RemittanceLocationDetails1.Method);
			elementContext_lazy = () -> PaymentObligation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RemittanceDeliveryMethod";
			definition = "Specifies the method to be used by the first agent (debtor agent in the case of a credit transfer, creditor agent in the case of a direct debit) to deliver the remittance advice information, which may be sent separately from the payment instruction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> RemittanceLocationMethodCode.mmObject();
		}
	};
	/**
	 * Specifies the referred document/transaction, eg, invoice or credit note.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Document#PaymentObligation
	 * Document.PaymentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Document Document}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction1#RemittanceInformation
	 * EntryTransaction1.RemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction2#RemittanceInformation
	 * EntryTransaction2.RemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction3#RemittanceInformation
	 * EntryTransaction3.RemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction4#RemittanceInformation
	 * EntryTransaction4.RemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation1#RemittanceInformation
	 * CreditTransferTransactionInformation1.RemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation10#RemittanceInformation
	 * CreditTransferTransactionInformation10.RemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction1#RemittanceInformation
	 * CreditTransferTransaction1.RemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction6#RemittanceInformation
	 * CreditTransferTransaction6.RemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation1#RemittanceInformation
	 * DirectDebitTransactionInformation1.RemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation9#RemittanceInformation
	 * DirectDebitTransactionInformation9.RemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation11#RemittanceInformation
	 * DirectDebitTransactionInformation11.RemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation13#RemittanceInformation
	 * DirectDebitTransactionInformation13.RemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference1#RemittanceInformation
	 * OriginalTransactionReference1.RemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference13#RemittanceInformation
	 * OriginalTransactionReference13.RemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference16#RemittanceInformation
	 * OriginalTransactionReference16.RemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation2#RemittanceInformation
	 * CreditTransferTransactionInformation2.RemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation11#RemittanceInformation
	 * CreditTransferTransactionInformation11.RemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction2#RemittanceInformation
	 * CreditTransferTransaction2.RemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction7#RemittanceInformation
	 * CreditTransferTransaction7.RemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation2#RemittanceInformation
	 * DirectDebitTransactionInformation2.RemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation10#RemittanceInformation
	 * DirectDebitTransactionInformation10.RemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation12#RemittanceInformation
	 * DirectDebitTransactionInformation12.RemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation14#RemittanceInformation
	 * DirectDebitTransactionInformation14.RemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation3#RemittanceInformation
	 * CreditTransferTransactionInformation3.RemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation12#RemittanceInformation
	 * CreditTransferTransactionInformation12.RemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation13#RemittanceInformation
	 * CreditTransferTransactionInformation13.RemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction3#RemittanceInformation
	 * CreditTransferTransaction3.RemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction4#RemittanceInformation
	 * CreditTransferTransaction4.RemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction8#RemittanceInformation
	 * CreditTransferTransaction8.RemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference15#RemittanceInformation
	 * OriginalTransactionReference15.RemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference17#RemittanceInformation
	 * OriginalTransactionReference17.RemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference19#RemittanceInformation
	 * OriginalTransactionReference19.RemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation14#RemittanceInformation
	 * CreditTransferTransactionInformation14.RemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction5#RemittanceInformation
	 * CreditTransferTransaction5.RemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction10#RemittanceInformation
	 * CreditTransferTransaction10.RemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation#RemittanceChoice
	 * PaymentComplementaryInformation.RemittanceChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NotificationItem3#RemittanceInformation
	 * NotificationItem3.RemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItemReference1#RemittanceInformation
	 * OriginalItemReference1.RemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation2#RemittanceInformation
	 * PaymentComplementaryInformation2.RemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation3#RemittanceInformation
	 * PaymentComplementaryInformation3.RemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NotificationItem4#RemittanceInformation
	 * NotificationItem4.RemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItemReference2#RemittanceInformation
	 * OriginalItemReference2.RemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation15#RemittanceInformation
	 * DirectDebitTransactionInformation15.RemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference7#RemittanceInformation
	 * OriginalTransactionReference7.RemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference10#RemittanceInformation
	 * OriginalTransactionReference10.RemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference9#RemittanceInformation
	 * OriginalTransactionReference9.RemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference12#RemittanceInformation
	 * OriginalTransactionReference12.RemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference8#RemittanceInformation
	 * OriginalTransactionReference8.RemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference11#RemittanceInformation
	 * OriginalTransactionReference11.RemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation6#RemittanceInformation
	 * CreditTransferTransactionInformation6.RemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation8#RemittanceInformation
	 * CreditTransferTransactionInformation8.RemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation7#RemittanceInformation
	 * CreditTransferTransactionInformation7.RemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation9#RemittanceInformation
	 * CreditTransferTransactionInformation9.RemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation5#RemittanceInformation
	 * DirectDebitTransactionInformation5.RemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation7#RemittanceInformation
	 * DirectDebitTransactionInformation7.RemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation6#RemittanceInformation
	 * DirectDebitTransactionInformation6.RemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation8#RemittanceInformation
	 * DirectDebitTransactionInformation8.RemittanceInformation}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Garnishment1#Type
	 * Garnishment1.Type}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation4#RemittanceInformation
	 * PaymentComplementaryInformation4.RemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction17#RemittanceInformation
	 * CreditTransferTransaction17.RemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction19#RemittanceInformation
	 * CreditTransferTransaction19.RemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation17#RemittanceInformation
	 * DirectDebitTransactionInformation17.RemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItemReference3#RemittanceInformation
	 * OriginalItemReference3.RemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference20#RemittanceInformation
	 * OriginalTransactionReference20.RemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction18#RemittanceInformation
	 * CreditTransferTransaction18.RemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation18#RemittanceInformation
	 * DirectDebitTransactionInformation18.RemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction20#RemittanceInformation
	 * CreditTransferTransaction20.RemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NotificationItem5#RemittanceInformation
	 * NotificationItem5.RemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction7#RemittanceInformation
	 * EntryTransaction7.RemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference21#RemittanceInformation
	 * OriginalTransactionReference21.RemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction21#RemittanceInformation
	 * CreditTransferTransaction21.RemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction23#RemittanceInformation
	 * CreditTransferTransaction23.RemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction25#RemittanceInformation
	 * CreditTransferTransaction25.RemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation5#RemittanceInformation
	 * PaymentComplementaryInformation5.RemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation20#RemittanceInformation
	 * DirectDebitTransactionInformation20.RemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference22#RemittanceInformation
	 * OriginalTransactionReference22.RemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction24#RemittanceInformation
	 * CreditTransferTransaction24.RemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction26#RemittanceInformation
	 * CreditTransferTransaction26.RemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItemReference4#RemittanceInformation
	 * OriginalItemReference4.RemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation19#RemittanceInformation
	 * DirectDebitTransactionInformation19.RemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction22#RemittanceInformation
	 * CreditTransferTransaction22.RemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction8#RemittanceInformation
	 * EntryTransaction8.RemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NotificationItem6#RemittanceInformation
	 * NotificationItem6.RemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference23#RemittanceInformation
	 * OriginalTransactionReference23.RemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation21#RemittanceInformation
	 * DirectDebitTransactionInformation21.RemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference24#RemittanceInformation
	 * OriginalTransactionReference24.RemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference26#RemittanceInformation
	 * OriginalTransactionReference26.RemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation22#RemittanceInformation
	 * DirectDebitTransactionInformation22.RemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation6#RemittanceInformation
	 * PaymentComplementaryInformation6.RemittanceInformation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation
	 * PaymentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AssociatedDocument"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the referred document/transaction, eg, invoice or credit note."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd AssociatedDocument = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.EntryTransaction1.RemittanceInformation, com.tools20022.repository.msg.EntryTransaction2.RemittanceInformation,
					com.tools20022.repository.msg.EntryTransaction3.RemittanceInformation, com.tools20022.repository.msg.EntryTransaction4.RemittanceInformation,
					com.tools20022.repository.msg.CreditTransferTransactionInformation1.RemittanceInformation, com.tools20022.repository.msg.CreditTransferTransactionInformation10.RemittanceInformation,
					com.tools20022.repository.msg.CreditTransferTransaction1.RemittanceInformation, com.tools20022.repository.msg.CreditTransferTransaction6.RemittanceInformation,
					com.tools20022.repository.msg.DirectDebitTransactionInformation1.RemittanceInformation, com.tools20022.repository.msg.DirectDebitTransactionInformation9.RemittanceInformation,
					com.tools20022.repository.msg.DirectDebitTransactionInformation11.RemittanceInformation, com.tools20022.repository.msg.DirectDebitTransactionInformation13.RemittanceInformation,
					com.tools20022.repository.msg.OriginalTransactionReference1.RemittanceInformation, com.tools20022.repository.msg.OriginalTransactionReference13.RemittanceInformation,
					com.tools20022.repository.msg.OriginalTransactionReference16.RemittanceInformation, com.tools20022.repository.msg.CreditTransferTransactionInformation2.RemittanceInformation,
					com.tools20022.repository.msg.CreditTransferTransactionInformation11.RemittanceInformation, com.tools20022.repository.msg.CreditTransferTransaction2.RemittanceInformation,
					com.tools20022.repository.msg.CreditTransferTransaction7.RemittanceInformation, com.tools20022.repository.msg.DirectDebitTransactionInformation2.RemittanceInformation,
					com.tools20022.repository.msg.DirectDebitTransactionInformation10.RemittanceInformation, com.tools20022.repository.msg.DirectDebitTransactionInformation12.RemittanceInformation,
					com.tools20022.repository.msg.DirectDebitTransactionInformation14.RemittanceInformation, com.tools20022.repository.msg.CreditTransferTransactionInformation3.RemittanceInformation,
					com.tools20022.repository.msg.CreditTransferTransactionInformation12.RemittanceInformation, com.tools20022.repository.msg.CreditTransferTransactionInformation13.RemittanceInformation,
					com.tools20022.repository.msg.CreditTransferTransaction3.RemittanceInformation, com.tools20022.repository.msg.CreditTransferTransaction4.RemittanceInformation,
					com.tools20022.repository.msg.CreditTransferTransaction8.RemittanceInformation, com.tools20022.repository.msg.OriginalTransactionReference15.RemittanceInformation,
					com.tools20022.repository.msg.OriginalTransactionReference17.RemittanceInformation, com.tools20022.repository.msg.OriginalTransactionReference19.RemittanceInformation,
					com.tools20022.repository.msg.CreditTransferTransactionInformation14.RemittanceInformation, com.tools20022.repository.msg.CreditTransferTransaction5.RemittanceInformation,
					com.tools20022.repository.msg.CreditTransferTransaction10.RemittanceInformation, com.tools20022.repository.msg.PaymentComplementaryInformation.RemittanceChoice,
					com.tools20022.repository.msg.NotificationItem3.RemittanceInformation, com.tools20022.repository.msg.OriginalItemReference1.RemittanceInformation,
					com.tools20022.repository.msg.PaymentComplementaryInformation2.RemittanceInformation, com.tools20022.repository.msg.PaymentComplementaryInformation3.RemittanceInformation,
					com.tools20022.repository.msg.NotificationItem4.RemittanceInformation, com.tools20022.repository.msg.OriginalItemReference2.RemittanceInformation,
					com.tools20022.repository.msg.DirectDebitTransactionInformation15.RemittanceInformation, com.tools20022.repository.msg.OriginalTransactionReference7.RemittanceInformation,
					com.tools20022.repository.msg.OriginalTransactionReference10.RemittanceInformation, com.tools20022.repository.msg.OriginalTransactionReference9.RemittanceInformation,
					com.tools20022.repository.msg.OriginalTransactionReference12.RemittanceInformation, com.tools20022.repository.msg.OriginalTransactionReference8.RemittanceInformation,
					com.tools20022.repository.msg.OriginalTransactionReference11.RemittanceInformation, com.tools20022.repository.msg.CreditTransferTransactionInformation6.RemittanceInformation,
					com.tools20022.repository.msg.CreditTransferTransactionInformation8.RemittanceInformation, com.tools20022.repository.msg.CreditTransferTransactionInformation7.RemittanceInformation,
					com.tools20022.repository.msg.CreditTransferTransactionInformation9.RemittanceInformation, com.tools20022.repository.msg.DirectDebitTransactionInformation5.RemittanceInformation,
					com.tools20022.repository.msg.DirectDebitTransactionInformation7.RemittanceInformation, com.tools20022.repository.msg.DirectDebitTransactionInformation6.RemittanceInformation,
					com.tools20022.repository.msg.DirectDebitTransactionInformation8.RemittanceInformation, com.tools20022.repository.msg.Garnishment1.Type,
					com.tools20022.repository.msg.PaymentComplementaryInformation4.RemittanceInformation, com.tools20022.repository.msg.CreditTransferTransaction17.RemittanceInformation,
					com.tools20022.repository.msg.CreditTransferTransaction19.RemittanceInformation, com.tools20022.repository.msg.DirectDebitTransactionInformation17.RemittanceInformation,
					com.tools20022.repository.msg.OriginalItemReference3.RemittanceInformation, com.tools20022.repository.msg.OriginalTransactionReference20.RemittanceInformation,
					com.tools20022.repository.msg.CreditTransferTransaction18.RemittanceInformation, com.tools20022.repository.msg.DirectDebitTransactionInformation18.RemittanceInformation,
					com.tools20022.repository.msg.CreditTransferTransaction20.RemittanceInformation, com.tools20022.repository.msg.NotificationItem5.RemittanceInformation,
					com.tools20022.repository.msg.EntryTransaction7.RemittanceInformation, com.tools20022.repository.msg.OriginalTransactionReference21.RemittanceInformation,
					com.tools20022.repository.msg.CreditTransferTransaction21.RemittanceInformation, com.tools20022.repository.msg.CreditTransferTransaction23.RemittanceInformation,
					com.tools20022.repository.msg.CreditTransferTransaction25.RemittanceInformation, com.tools20022.repository.msg.PaymentComplementaryInformation5.RemittanceInformation,
					com.tools20022.repository.msg.DirectDebitTransactionInformation20.RemittanceInformation, com.tools20022.repository.msg.OriginalTransactionReference22.RemittanceInformation,
					com.tools20022.repository.msg.CreditTransferTransaction24.RemittanceInformation, com.tools20022.repository.msg.CreditTransferTransaction26.RemittanceInformation,
					com.tools20022.repository.msg.OriginalItemReference4.RemittanceInformation, com.tools20022.repository.msg.DirectDebitTransactionInformation19.RemittanceInformation,
					com.tools20022.repository.msg.CreditTransferTransaction22.RemittanceInformation, com.tools20022.repository.msg.EntryTransaction8.RemittanceInformation,
					com.tools20022.repository.msg.NotificationItem6.RemittanceInformation, com.tools20022.repository.msg.OriginalTransactionReference23.RemittanceInformation,
					com.tools20022.repository.msg.DirectDebitTransactionInformation21.RemittanceInformation, com.tools20022.repository.msg.OriginalTransactionReference24.RemittanceInformation,
					com.tools20022.repository.msg.OriginalTransactionReference26.RemittanceInformation, com.tools20022.repository.msg.DirectDebitTransactionInformation22.RemittanceInformation,
					com.tools20022.repository.msg.PaymentComplementaryInformation6.RemittanceInformation);
			elementContext_lazy = () -> PaymentObligation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AssociatedDocument";
			definition = "Specifies the referred document/transaction, eg, invoice or credit note.";
			minOccurs = 0;
			type_lazy = () -> Document.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Document.PaymentObligation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Amount payable to the creditor.
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
	 * {@linkplain com.tools20022.repository.choice.ReferredDocumentAmount1Choice#DuePayableAmount
	 * ReferredDocumentAmount1Choice.DuePayableAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RemittanceAmount1#DuePayableAmount
	 * RemittanceAmount1.DuePayableAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RemittanceAmount2#DuePayableAmount
	 * RemittanceAmount2.DuePayableAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.FailedMovement1#CashAmount
	 * FailedMovement1.CashAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PremiumAmount1#Amount
	 * PremiumAmount1.Amount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PremiumAmount2#Amount
	 * PremiumAmount2.Amount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Instalment1#Amount
	 * Instalment1.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeSettlement1#DuePayableAmount
	 * TradeSettlement1.DuePayableAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashCompensation1#SettlementAmount
	 * CashCompensation1.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PEPISACashTransfer1#AmountToBeTransferred
	 * PEPISACashTransfer1.AmountToBeTransferred}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PEPISACashTransfer2#AmountToBeTransferred
	 * PEPISACashTransfer2.AmountToBeTransferred}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RemittanceAmount3#DuePayableAmount
	 * RemittanceAmount3.DuePayableAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Instalment2#Amount
	 * Instalment2.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction1#TransactionNominalAmount
	 * UnsecuredMarketTransaction1.TransactionNominalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OvernightIndexSwapTransaction1#TransactionNominalAmount
	 * OvernightIndexSwapTransaction1.TransactionNominalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction1#TransactionNominalAmount
	 * SecuredMarketTransaction1.TransactionNominalAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeContract1#Amount
	 * TradeContract1.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InitialAmount1Choice#Amount
	 * InitialAmount1Choice.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction2#TransactionNominalAmount
	 * UnsecuredMarketTransaction2.TransactionNominalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction2#TransactionNominalAmount
	 * SecuredMarketTransaction2.TransactionNominalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction3#TransactionNominalAmount
	 * UnsecuredMarketTransaction3.TransactionNominalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OvernightIndexSwapTransaction3#TransactionNominalAmount
	 * OvernightIndexSwapTransaction3.TransactionNominalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction3#TransactionNominalAmount
	 * SecuredMarketTransaction3.TransactionNominalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeSettlement2#DuePayableAmount
	 * TradeSettlement2.DuePayableAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction4#TransactionNominalAmount
	 * SecuredMarketTransaction4.TransactionNominalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OvernightIndexSwapTransaction4#TransactionNominalAmount
	 * OvernightIndexSwapTransaction4.TransactionNominalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction4#TransactionNominalAmount
	 * UnsecuredMarketTransaction4.TransactionNominalAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation
	 * PaymentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount payable to the creditor."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Amount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.ReferredDocumentAmount1Choice.DuePayableAmount, com.tools20022.repository.msg.RemittanceAmount1.DuePayableAmount,
					com.tools20022.repository.msg.RemittanceAmount2.DuePayableAmount, com.tools20022.repository.msg.FailedMovement1.CashAmount, com.tools20022.repository.msg.PremiumAmount1.Amount,
					com.tools20022.repository.msg.PremiumAmount2.Amount, com.tools20022.repository.msg.Instalment1.Amount, com.tools20022.repository.msg.TradeSettlement1.DuePayableAmount,
					com.tools20022.repository.msg.CashCompensation1.SettlementAmount, com.tools20022.repository.msg.PEPISACashTransfer1.AmountToBeTransferred, com.tools20022.repository.msg.PEPISACashTransfer2.AmountToBeTransferred,
					com.tools20022.repository.msg.RemittanceAmount3.DuePayableAmount, com.tools20022.repository.msg.Instalment2.Amount, com.tools20022.repository.msg.UnsecuredMarketTransaction1.TransactionNominalAmount,
					com.tools20022.repository.msg.OvernightIndexSwapTransaction1.TransactionNominalAmount, com.tools20022.repository.msg.SecuredMarketTransaction1.TransactionNominalAmount,
					com.tools20022.repository.msg.TradeContract1.Amount, com.tools20022.repository.choice.InitialAmount1Choice.Amount, com.tools20022.repository.msg.UnsecuredMarketTransaction2.TransactionNominalAmount,
					com.tools20022.repository.msg.SecuredMarketTransaction2.TransactionNominalAmount, com.tools20022.repository.msg.UnsecuredMarketTransaction3.TransactionNominalAmount,
					com.tools20022.repository.msg.OvernightIndexSwapTransaction3.TransactionNominalAmount, com.tools20022.repository.msg.SecuredMarketTransaction3.TransactionNominalAmount,
					com.tools20022.repository.msg.TradeSettlement2.DuePayableAmount, com.tools20022.repository.msg.SecuredMarketTransaction4.TransactionNominalAmount,
					com.tools20022.repository.msg.OvernightIndexSwapTransaction4.TransactionNominalAmount, com.tools20022.repository.msg.UnsecuredMarketTransaction4.TransactionNominalAmount);
			elementContext_lazy = () -> PaymentObligation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Amount";
			definition = "Amount payable to the creditor.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Address to which the first agent is to send the remittance information.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ContactPoint#RemittanceRelatedPayment
	 * ContactPoint.RemittanceRelatedPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ContactPoint
	 * ContactPoint}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation1#RelatedRemittanceInformation
	 * CreditTransferTransactionInformation1.RelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation10#RelatedRemittanceInformation
	 * CreditTransferTransactionInformation10.RelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction1#RelatedRemittanceInformation
	 * CreditTransferTransaction1.RelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction6#RelatedRemittanceInformation
	 * CreditTransferTransaction6.RelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation2#RelatedRemittanceInformation
	 * CreditTransferTransactionInformation2.RelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation11#RelatedRemittanceInformation
	 * CreditTransferTransactionInformation11.RelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction2#RelatedRemittanceInformation
	 * CreditTransferTransaction2.RelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction7#RelatedRemittanceInformation
	 * CreditTransferTransaction7.RelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation14#RelatedRemittanceInformation
	 * CreditTransferTransactionInformation14.RelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction5#RelatedRemittanceInformation
	 * CreditTransferTransaction5.RelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction10#RelatedRemittanceInformation
	 * CreditTransferTransaction10.RelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation7#RelatedRemittanceInformation
	 * CreditTransferTransactionInformation7.RelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation9#RelatedRemittanceInformation
	 * CreditTransferTransactionInformation9.RelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction19#RelatedRemittanceInformation
	 * CreditTransferTransaction19.RelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction20#RelatedRemittanceInformation
	 * CreditTransferTransaction20.RelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction21#RelatedRemittanceInformation
	 * CreditTransferTransaction21.RelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction25#RelatedRemittanceInformation
	 * CreditTransferTransaction25.RelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction26#RelatedRemittanceInformation
	 * CreditTransferTransaction26.RelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction22#RelatedRemittanceInformation
	 * CreditTransferTransaction22.RelatedRemittanceInformation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation
	 * PaymentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RemittanceLocation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Address to which the first agent is to send the remittance information."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RemittanceLocation = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CreditTransferTransactionInformation1.RelatedRemittanceInformation,
					com.tools20022.repository.msg.CreditTransferTransactionInformation10.RelatedRemittanceInformation, com.tools20022.repository.msg.CreditTransferTransaction1.RelatedRemittanceInformation,
					com.tools20022.repository.msg.CreditTransferTransaction6.RelatedRemittanceInformation, com.tools20022.repository.msg.CreditTransferTransactionInformation2.RelatedRemittanceInformation,
					com.tools20022.repository.msg.CreditTransferTransactionInformation11.RelatedRemittanceInformation, com.tools20022.repository.msg.CreditTransferTransaction2.RelatedRemittanceInformation,
					com.tools20022.repository.msg.CreditTransferTransaction7.RelatedRemittanceInformation, com.tools20022.repository.msg.CreditTransferTransactionInformation14.RelatedRemittanceInformation,
					com.tools20022.repository.msg.CreditTransferTransaction5.RelatedRemittanceInformation, com.tools20022.repository.msg.CreditTransferTransaction10.RelatedRemittanceInformation,
					com.tools20022.repository.msg.CreditTransferTransactionInformation7.RelatedRemittanceInformation, com.tools20022.repository.msg.CreditTransferTransactionInformation9.RelatedRemittanceInformation,
					com.tools20022.repository.msg.CreditTransferTransaction19.RelatedRemittanceInformation, com.tools20022.repository.msg.CreditTransferTransaction20.RelatedRemittanceInformation,
					com.tools20022.repository.msg.CreditTransferTransaction21.RelatedRemittanceInformation, com.tools20022.repository.msg.CreditTransferTransaction25.RelatedRemittanceInformation,
					com.tools20022.repository.msg.CreditTransferTransaction26.RelatedRemittanceInformation, com.tools20022.repository.msg.CreditTransferTransaction22.RelatedRemittanceInformation);
			elementContext_lazy = () -> PaymentObligation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RemittanceLocation";
			definition = "Address to which the first agent is to send the remittance information.";
			minOccurs = 0;
			type_lazy = () -> ContactPoint.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ContactPoint.RemittanceRelatedPayment;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Process which calculates the interest to be paid. It may also specify the
	 * interest charged on instalment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InterestManagement#PaymentObligation
	 * InterestManagement.PaymentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.InterestManagement
	 * InterestManagement}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RecurringTransaction1#InterestCharges
	 * RecurringTransaction1.InterestCharges}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation
	 * PaymentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Interest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Process which calculates the interest to be paid. It may also specify the interest charged on instalment."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Interest = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RecurringTransaction1.InterestCharges);
			elementContext_lazy = () -> PaymentObligation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Interest";
			definition = "Process which calculates the interest to be paid. It may also specify the interest charged on instalment.";
			minOccurs = 0;
			type_lazy = () -> InterestManagement.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InterestManagement.PaymentObligation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Commercial trade which creates the payment obligation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CommercialTrade#PaymentObligation
	 * CommercialTrade.PaymentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CommercialTrade
	 * CommercialTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation
	 * PaymentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommercialTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Commercial trade which creates the payment obligation."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CommercialTrade = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PaymentObligation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CommercialTrade";
			definition = "Commercial trade which creates the payment obligation.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.CommercialTrade.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CommercialTrade.PaymentObligation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Maximum amount that a financial institution guarantees to pay for a
	 * specific commercial trade, expressed as a percentage of the purchase
	 * order net amount.
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
	 * {@linkplain com.tools20022.repository.msg.PaymentObligation1#Percentage
	 * PaymentObligation1.Percentage}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation
	 * PaymentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Percentage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Maximum amount that a financial institution guarantees to pay for a specific commercial trade, expressed as a percentage of the purchase order net amount."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Percentage = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentObligation1.Percentage);
			elementContext_lazy = () -> PaymentObligation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Percentage";
			definition = "Maximum amount that a financial institution guarantees to pay for a specific commercial trade, expressed as a percentage of the purchase order net amount.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Maximum amount that a financial institution guarantees to pay for a
	 * specific commercial trade.
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
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentObligation1#Amount
	 * PaymentObligation1.Amount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation
	 * PaymentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Maximum amount that a financial institution guarantees to pay for a specific commercial trade."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute MaximumAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentObligation1.Amount);
			elementContext_lazy = () -> PaymentObligation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MaximumAmount";
			definition = "Maximum amount that a financial institution guarantees to pay for a specific commercial trade.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Date at which the obligation will expire. For instance, it is the
	 * transaction authorisation deadline to complete a payment by card.
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
	 * {@linkplain com.tools20022.repository.msg.PaymentObligation1#ExpiryDate
	 * PaymentObligation1.ExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentObligation2#ExpiryDate
	 * PaymentObligation2.ExpiryDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation
	 * PaymentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpiryDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date at which the obligation will expire. For instance, it is the transaction authorisation deadline to complete a payment by card."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ExpiryDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentObligation1.ExpiryDate, com.tools20022.repository.msg.PaymentObligation2.ExpiryDate);
			elementContext_lazy = () -> PaymentObligation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExpiryDate";
			definition = "Date at which the obligation will expire. For instance, it is the transaction authorisation deadline to complete a payment by card.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Country of which the law governs the payment obligation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CountryCode
	 * CountryCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentObligation1#ApplicableLaw
	 * PaymentObligation1.ApplicableLaw}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentObligation2#ApplicableLaw
	 * PaymentObligation2.ApplicableLaw}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation
	 * PaymentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ApplicableLaw"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Country of which the law governs the payment obligation."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ApplicableLaw = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentObligation1.ApplicableLaw, com.tools20022.repository.msg.PaymentObligation2.ApplicableLaw);
			elementContext_lazy = () -> PaymentObligation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ApplicableLaw";
			definition = "Country of which the law governs the payment obligation.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CountryCode.mmObject();
		}
	};
	/**
	 * Buy-in process which created the payment obligation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BuyIn#CashCompensation
	 * BuyIn.CashCompensation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.BuyIn BuyIn}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation
	 * PaymentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentSourceBuyIn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Buy-in process which created the payment obligation."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd PaymentSourceBuyIn = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PaymentObligation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PaymentSourceBuyIn";
			definition = "Buy-in process which created the payment obligation.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> BuyIn.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.BuyIn.CashCompensation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Corporate action processes which are the source of the payment
	 * obligation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction#CashProceedsMovement
	 * CorporateActionProceedsDeliveryInstruction.CashProceedsMovement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction
	 * CorporateActionProceedsDeliveryInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation
	 * PaymentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedCorporateAction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Corporate action processes which are the source of the payment obligation."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedCorporateAction = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PaymentObligation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedCorporateAction";
			definition = "Corporate action processes which are the source of the payment obligation.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> CorporateActionProceedsDeliveryInstruction.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction.CashProceedsMovement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Collateral movement which is the source of the obligation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CollateralMovement#CashCollateralMovement
	 * CollateralMovement.CashCollateralMovement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CollateralMovement
	 * CollateralMovement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation
	 * PaymentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedCollateralMovement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Collateral movement which is the source of the obligation."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedCollateralMovement = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PaymentObligation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedCollateralMovement";
			definition = "Collateral movement which is the source of the obligation.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> CollateralMovement.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CollateralMovement.CashCollateralMovement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Undertaking demand which is the source of a payment obligation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Demand#Payment
	 * Demand.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Demand Demand}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation
	 * PaymentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentSourceUndertakingDemand"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Undertaking demand which is the source of a payment obligation."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd PaymentSourceUndertakingDemand = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PaymentObligation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentSourceUndertakingDemand";
			definition = "Undertaking demand which is the source of a payment obligation.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Demand.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Demand.Payment;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies each role linked to a payment obligation and played by a party
	 * at that step in a payment flow.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligationPartyRole#PaymentObligation
	 * PaymentObligationPartyRole.PaymentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligationPartyRole
	 * PaymentObligationPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation
	 * PaymentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies each role linked to a payment obligation and played by a party at that step in a payment flow."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd PartyRole = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PaymentObligation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PartyRole";
			definition = "Specifies each role linked to a payment obligation and played by a party at that step in a payment flow.";
			minOccurs = 0;
			type_lazy = () -> PaymentObligationPartyRole.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentObligationPartyRole.PaymentObligation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Securities trade which created a payment flow.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#PaymentObligation
	 * SecuritiesTradeExecution.PaymentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution
	 * SecuritiesTradeExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation
	 * PaymentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExecutedSecuritiesTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Securities trade which created a payment flow."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ExecutedSecuritiesTrade = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PaymentObligation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExecutedSecuritiesTrade";
			definition = "Securities trade which created a payment flow.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesTradeExecution.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeExecution.PaymentObligation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Contract which authorises the transfer of funds resulting in a payment
	 * obligation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashAccountContract#BalanceTransfer
	 * CashAccountContract.BalanceTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashAccountContract
	 * CashAccountContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation
	 * PaymentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedAccountClosingTerms"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Contract which authorises the transfer of funds resulting in a payment obligation."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedAccountClosingTerms = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PaymentObligation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedAccountClosingTerms";
			definition = "Contract which authorises the transfer of funds resulting in a payment obligation.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> CashAccountContract.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CashAccountContract.BalanceTransfer;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * The PaymentObligation that specifies the payment resulting from charges
	 * due by one party to another.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer#PaymentObligation
	 * PortfolioTransfer.PaymentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PortfolioTransfer
	 * PortfolioTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation
	 * PaymentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentSourcePortfolioTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The PaymentObligation that specifies the payment resulting from charges due by one party to another."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd PaymentSourcePortfolioTransfer = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PaymentObligation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PaymentSourcePortfolioTransfer";
			definition = "The PaymentObligation that specifies the payment resulting from charges due by one party to another.";
			minOccurs = 0;
			type_lazy = () -> PortfolioTransfer.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PortfolioTransfer.PaymentObligation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * The PaymentObligation that specifies the amount of the premium paid by
	 * the buyer of the option and its settlement place.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyOption#PremiumSettlement
	 * CurrencyOption.PremiumSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CurrencyOption
	 * CurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation
	 * PaymentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentSourceCurrencyOption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The PaymentObligation that specifies the amount of the premium paid by the buyer of the option and its settlement place."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd PaymentSourceCurrencyOption = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PaymentObligation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PaymentSourceCurrencyOption";
			definition = "The PaymentObligation that specifies the amount of the premium paid by the buyer of the option and its settlement place.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> CurrencyOption.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CurrencyOption.PremiumSettlement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Foreign exchange trade which is the source of the payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade#ResultingSettlement
	 * ForeignExchangeTrade.ResultingSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade
	 * ForeignExchangeTrade}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails25#FXAdditionalDetails
	 * SecuritiesTradeDetails25.FXAdditionalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails26#FXAdditionalDetails
	 * SecuritiesTradeDetails26.FXAdditionalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails27#FXAdditionalDetails
	 * SecuritiesTradeDetails27.FXAdditionalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails28#FXAdditionalDetails
	 * SecuritiesTradeDetails28.FXAdditionalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails6#FXAdditionalDetails
	 * SecuritiesTradeDetails6.FXAdditionalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails13#FXAdditionalDetails
	 * SecuritiesTradeDetails13.FXAdditionalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails3#FXAdditionalDetails
	 * SecuritiesTradeDetails3.FXAdditionalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails11#FXAdditionalDetails
	 * SecuritiesTradeDetails11.FXAdditionalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails2#FXAdditionalDetails
	 * SecuritiesTradeDetails2.FXAdditionalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails16#FXAdditionalDetails
	 * SecuritiesTradeDetails16.FXAdditionalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails1#FXAdditionalDetails
	 * SecuritiesTradeDetails1.FXAdditionalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails15#FXAdditionalDetails
	 * SecuritiesTradeDetails15.FXAdditionalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails31#FXAdditionalDetails
	 * SecuritiesTradeDetails31.FXAdditionalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails33#FXAdditionalDetails
	 * SecuritiesTradeDetails33.FXAdditionalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails38#FXAdditionalDetails
	 * SecuritiesTradeDetails38.FXAdditionalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails37#FXAdditionalDetails
	 * SecuritiesTradeDetails37.FXAdditionalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails34#FXAdditionalDetails
	 * SecuritiesTradeDetails34.FXAdditionalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails32#FXAdditionalDetails
	 * SecuritiesTradeDetails32.FXAdditionalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails44#FXAdditionalDetails
	 * SecuritiesTradeDetails44.FXAdditionalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails39#FXAdditionalDetails
	 * SecuritiesTradeDetails39.FXAdditionalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails43#FXAdditionalDetails
	 * SecuritiesTradeDetails43.FXAdditionalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails40#FXAdditionalDetails
	 * SecuritiesTradeDetails40.FXAdditionalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails46#FXAdditionalDetails
	 * SecuritiesTradeDetails46.FXAdditionalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails47#FXAdditionalDetails
	 * SecuritiesTradeDetails47.FXAdditionalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeContract1#ExchangeRateInformation
	 * TradeContract1.ExchangeRateInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SyndicatedLoan1#ExchangeRateInformation
	 * SyndicatedLoan1.ExchangeRateInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails51#FXAdditionalDetails
	 * SecuritiesTradeDetails51.FXAdditionalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails53#FXAdditionalDetails
	 * SecuritiesTradeDetails53.FXAdditionalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails55#FXAdditionalDetails
	 * SecuritiesTradeDetails55.FXAdditionalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails56#FXAdditionalDetails
	 * SecuritiesTradeDetails56.FXAdditionalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails52#FXAdditionalDetails
	 * SecuritiesTradeDetails52.FXAdditionalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails50#FXAdditionalDetails
	 * SecuritiesTradeDetails50.FXAdditionalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails59#FXAdditionalDetails
	 * SecuritiesTradeDetails59.FXAdditionalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails58#FXAdditionalDetails
	 * SecuritiesTradeDetails58.FXAdditionalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails63#FXAdditionalDetails
	 * SecuritiesTradeDetails63.FXAdditionalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails62#FXAdditionalDetails
	 * SecuritiesTradeDetails62.FXAdditionalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails65#FXAdditionalDetails
	 * SecuritiesTradeDetails65.FXAdditionalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails66#FXAdditionalDetails
	 * SecuritiesTradeDetails66.FXAdditionalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails67#FXAdditionalDetails
	 * SecuritiesTradeDetails67.FXAdditionalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails70#FXAdditionalDetails
	 * SecuritiesTradeDetails70.FXAdditionalDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation
	 * PaymentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExchangeRateInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Foreign exchange trade which is the source of the payment."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ExchangeRateInformation = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesTradeDetails25.FXAdditionalDetails, com.tools20022.repository.msg.SecuritiesTradeDetails26.FXAdditionalDetails,
					com.tools20022.repository.msg.SecuritiesTradeDetails27.FXAdditionalDetails, com.tools20022.repository.msg.SecuritiesTradeDetails28.FXAdditionalDetails,
					com.tools20022.repository.msg.SecuritiesTradeDetails6.FXAdditionalDetails, com.tools20022.repository.msg.SecuritiesTradeDetails13.FXAdditionalDetails,
					com.tools20022.repository.msg.SecuritiesTradeDetails3.FXAdditionalDetails, com.tools20022.repository.msg.SecuritiesTradeDetails11.FXAdditionalDetails,
					com.tools20022.repository.msg.SecuritiesTradeDetails2.FXAdditionalDetails, com.tools20022.repository.msg.SecuritiesTradeDetails16.FXAdditionalDetails,
					com.tools20022.repository.msg.SecuritiesTradeDetails1.FXAdditionalDetails, com.tools20022.repository.msg.SecuritiesTradeDetails15.FXAdditionalDetails,
					com.tools20022.repository.msg.SecuritiesTradeDetails31.FXAdditionalDetails, com.tools20022.repository.msg.SecuritiesTradeDetails33.FXAdditionalDetails,
					com.tools20022.repository.msg.SecuritiesTradeDetails38.FXAdditionalDetails, com.tools20022.repository.msg.SecuritiesTradeDetails37.FXAdditionalDetails,
					com.tools20022.repository.msg.SecuritiesTradeDetails34.FXAdditionalDetails, com.tools20022.repository.msg.SecuritiesTradeDetails32.FXAdditionalDetails,
					com.tools20022.repository.msg.SecuritiesTradeDetails44.FXAdditionalDetails, com.tools20022.repository.msg.SecuritiesTradeDetails39.FXAdditionalDetails,
					com.tools20022.repository.msg.SecuritiesTradeDetails43.FXAdditionalDetails, com.tools20022.repository.msg.SecuritiesTradeDetails40.FXAdditionalDetails,
					com.tools20022.repository.msg.SecuritiesTradeDetails46.FXAdditionalDetails, com.tools20022.repository.msg.SecuritiesTradeDetails47.FXAdditionalDetails,
					com.tools20022.repository.msg.TradeContract1.ExchangeRateInformation, com.tools20022.repository.msg.SyndicatedLoan1.ExchangeRateInformation, com.tools20022.repository.msg.SecuritiesTradeDetails51.FXAdditionalDetails,
					com.tools20022.repository.msg.SecuritiesTradeDetails53.FXAdditionalDetails, com.tools20022.repository.msg.SecuritiesTradeDetails55.FXAdditionalDetails,
					com.tools20022.repository.msg.SecuritiesTradeDetails56.FXAdditionalDetails, com.tools20022.repository.msg.SecuritiesTradeDetails52.FXAdditionalDetails,
					com.tools20022.repository.msg.SecuritiesTradeDetails50.FXAdditionalDetails, com.tools20022.repository.msg.SecuritiesTradeDetails59.FXAdditionalDetails,
					com.tools20022.repository.msg.SecuritiesTradeDetails58.FXAdditionalDetails, com.tools20022.repository.msg.SecuritiesTradeDetails63.FXAdditionalDetails,
					com.tools20022.repository.msg.SecuritiesTradeDetails62.FXAdditionalDetails, com.tools20022.repository.msg.SecuritiesTradeDetails65.FXAdditionalDetails,
					com.tools20022.repository.msg.SecuritiesTradeDetails66.FXAdditionalDetails, com.tools20022.repository.msg.SecuritiesTradeDetails67.FXAdditionalDetails,
					com.tools20022.repository.msg.SecuritiesTradeDetails70.FXAdditionalDetails);
			elementContext_lazy = () -> PaymentObligation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExchangeRateInformation";
			definition = "Foreign exchange trade which is the source of the payment.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> ForeignExchangeTrade.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ForeignExchangeTrade.ResultingSettlement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Dividend for which payment terms are specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Dividend#Obligation
	 * Dividend.Obligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Dividend Dividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation
	 * PaymentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Dividend"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Dividend for which payment terms are specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Dividend = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PaymentObligation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Dividend";
			definition = "Dividend for which payment terms are specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Dividend.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Dividend.Obligation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Repurchase agreement which covers the delivery of cash by the buyer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RepurchaseAgreement#PaymentObligation
	 * RepurchaseAgreement.PaymentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.RepurchaseAgreement
	 * RepurchaseAgreement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation
	 * PaymentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepurchaseAgreement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Repurchase agreement which covers the delivery of cash by the buyer."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RepurchaseAgreement = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PaymentObligation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RepurchaseAgreement";
			definition = "Repurchase agreement which covers the delivery of cash by the buyer.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.RepurchaseAgreement.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.RepurchaseAgreement.PaymentObligation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Assignment which contains one or more payment obligations.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Assignment#PaymentObligation
	 * Assignment.PaymentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Assignment
	 * Assignment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation
	 * PaymentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedAssignment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Assignment which contains one or more payment obligations."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedAssignment = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PaymentObligation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedAssignment";
			definition = "Assignment which contains one or more payment obligations.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Assignment.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Assignment.PaymentObligation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Transaction executed by the client of a financial institution from/to the
	 * account serviced by the financial institution, such as mortgage payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BankingTransaction#PaymentObligation
	 * BankingTransaction.PaymentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.BankingTransaction
	 * BankingTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation
	 * PaymentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BankingTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction executed by the client of a financial institution from/to the account serviced by the financial institution, such as mortgage payment."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd BankingTransaction = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PaymentObligation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BankingTransaction";
			definition = "Transaction executed by the client of a financial institution from/to the account serviced by the financial institution, such as mortgage payment.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.BankingTransaction.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.BankingTransaction.PaymentObligation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the payment terms of the obligation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentTerms#RelatedPaymentObligation
	 * PaymentTerms.RelatedPaymentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PaymentTerms
	 * PaymentTerms}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTerms1#OtherPaymentTerms
	 * PaymentTerms1.OtherPaymentTerms}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentTerms1#PaymentCode
	 * PaymentTerms1.PaymentCode}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentTerms2#PaymentCode
	 * PaymentTerms2.PaymentCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeContract1#PaymentSchedule
	 * TradeContract1.PaymentSchedule}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LoanContract1#PaymentSchedule
	 * LoanContract1.PaymentSchedule}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation
	 * PaymentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentTerms"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the payment terms of the obligation."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd PaymentTerms = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentTerms1.OtherPaymentTerms, com.tools20022.repository.msg.PaymentTerms1.PaymentCode, com.tools20022.repository.msg.PaymentTerms2.PaymentCode,
					com.tools20022.repository.msg.TradeContract1.PaymentSchedule, com.tools20022.repository.msg.LoanContract1.PaymentSchedule);
			elementContext_lazy = () -> PaymentObligation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PaymentTerms";
			definition = "Specifies the payment terms of the obligation.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.PaymentTerms.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentTerms.RelatedPaymentObligation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Due date for the payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PremiumAmount1#SettlementDate
	 * PremiumAmount1.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PremiumAmount2#SettlementDate
	 * PremiumAmount2.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvoiceTotals1#PaymentDueDate
	 * InvoiceTotals1.PaymentDueDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Instalment1#PaymentDueDate
	 * Instalment1.PaymentDueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalInvoiceInformation1#PaymentDueDate
	 * OriginalInvoiceInformation1.PaymentDueDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentTerms3#DueDate
	 * PaymentTerms3.DueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvoiceTotals2#PaymentDueDate
	 * InvoiceTotals2.PaymentDueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentCodeOrOther2Choice#PaymentDueDate
	 * PaymentCodeOrOther2Choice.PaymentDueDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Instalment2#PaymentDueDate
	 * Instalment2.PaymentDueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionCertificateContract1#ExpectedAdvancePaymentReturnDate
	 * TransactionCertificateContract1.ExpectedAdvancePaymentReturnDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation
	 * PaymentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentDueDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Due date for the payment."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PaymentDueDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PremiumAmount1.SettlementDate, com.tools20022.repository.msg.PremiumAmount2.SettlementDate, com.tools20022.repository.msg.InvoiceTotals1.PaymentDueDate,
					com.tools20022.repository.msg.Instalment1.PaymentDueDate, com.tools20022.repository.msg.OriginalInvoiceInformation1.PaymentDueDate, com.tools20022.repository.msg.PaymentTerms3.DueDate,
					com.tools20022.repository.msg.InvoiceTotals2.PaymentDueDate, com.tools20022.repository.choice.PaymentCodeOrOther2Choice.PaymentDueDate, com.tools20022.repository.msg.Instalment2.PaymentDueDate,
					com.tools20022.repository.msg.TransactionCertificateContract1.ExpectedAdvancePaymentReturnDate);
			elementContext_lazy = () -> PaymentObligation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PaymentDueDate";
			definition = "Due date for the payment.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PaymentObligation";
				definition = "Obligation for the debtor to pay the creditor an amount of cash.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Dividend.Obligation, com.tools20022.repository.entity.ContactPoint.RemittanceRelatedPayment,
						com.tools20022.repository.entity.Document.PaymentObligation, com.tools20022.repository.entity.Payment.PaymentObligation, com.tools20022.repository.entity.PortfolioTransfer.PaymentObligation,
						com.tools20022.repository.entity.CashAccountContract.BalanceTransfer, com.tools20022.repository.entity.SecuritiesTradeExecution.PaymentObligation,
						com.tools20022.repository.entity.ForeignExchangeTrade.ResultingSettlement, com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction.CashProceedsMovement,
						com.tools20022.repository.entity.PaymentObligationPartyRole.PaymentObligation, com.tools20022.repository.entity.Demand.Payment, com.tools20022.repository.entity.CurrencyOption.PremiumSettlement,
						com.tools20022.repository.entity.CommercialTrade.PaymentObligation, com.tools20022.repository.entity.CollateralMovement.CashCollateralMovement, com.tools20022.repository.entity.BuyIn.CashCompensation,
						com.tools20022.repository.entity.BankingTransaction.PaymentObligation, com.tools20022.repository.entity.RepurchaseAgreement.PaymentObligation, com.tools20022.repository.entity.Assignment.PaymentObligation,
						com.tools20022.repository.entity.PaymentTerms.RelatedPaymentObligation, com.tools20022.repository.entity.InterestManagement.PaymentObligation);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentObligation1.PaymentTerms, com.tools20022.repository.msg.PaymentObligation2.PaymentTerms);
				subType_lazy = () -> Arrays.asList(Instalment.mmObject(), Garnishment.mmObject());
				superType_lazy = () -> Obligation.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PaymentObligation.PaymentOffset, com.tools20022.repository.entity.PaymentObligation.Purpose,
						com.tools20022.repository.entity.PaymentObligation.RemittanceDeliveryMethod, com.tools20022.repository.entity.PaymentObligation.AssociatedDocument, com.tools20022.repository.entity.PaymentObligation.Amount,
						com.tools20022.repository.entity.PaymentObligation.RemittanceLocation, com.tools20022.repository.entity.PaymentObligation.Interest, com.tools20022.repository.entity.PaymentObligation.CommercialTrade,
						com.tools20022.repository.entity.PaymentObligation.Percentage, com.tools20022.repository.entity.PaymentObligation.MaximumAmount, com.tools20022.repository.entity.PaymentObligation.ExpiryDate,
						com.tools20022.repository.entity.PaymentObligation.ApplicableLaw, com.tools20022.repository.entity.PaymentObligation.PaymentSourceBuyIn, com.tools20022.repository.entity.PaymentObligation.RelatedCorporateAction,
						com.tools20022.repository.entity.PaymentObligation.RelatedCollateralMovement, com.tools20022.repository.entity.PaymentObligation.PaymentSourceUndertakingDemand,
						com.tools20022.repository.entity.PaymentObligation.PartyRole, com.tools20022.repository.entity.PaymentObligation.ExecutedSecuritiesTrade,
						com.tools20022.repository.entity.PaymentObligation.RelatedAccountClosingTerms, com.tools20022.repository.entity.PaymentObligation.PaymentSourcePortfolioTransfer,
						com.tools20022.repository.entity.PaymentObligation.PaymentSourceCurrencyOption, com.tools20022.repository.entity.PaymentObligation.ExchangeRateInformation,
						com.tools20022.repository.entity.PaymentObligation.Dividend, com.tools20022.repository.entity.PaymentObligation.RepurchaseAgreement, com.tools20022.repository.entity.PaymentObligation.RelatedAssignment,
						com.tools20022.repository.entity.PaymentObligation.BankingTransaction, com.tools20022.repository.entity.PaymentObligation.PaymentTerms, com.tools20022.repository.entity.PaymentObligation.PaymentDueDate);
				derivationComponent_lazy = () -> Arrays.asList(Purpose1Choice.mmObject(), Purpose2Choice.mmObject(), PurposeChoice.mmObject(), SettlementData1.mmObject(), SettlementData2.mmObject(), PaymentTerms3.mmObject(),
						PaymentTerms1.mmObject(), PaymentTerms2.mmObject(), PaymentObligation1.mmObject(), PaymentObligation2.mmObject(), PaymentTerms4.mmObject(), PaymentTerms5.mmObject(), Purpose3Choice.mmObject(),
						PaymentTerms6.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}