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
import com.tools20022.repository.codeset.CountryCode;
import com.tools20022.repository.codeset.PaymentPurposeCode;
import com.tools20022.repository.codeset.RemittanceLocationMethodCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.Obligation;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmPaymentOffset
 * PaymentObligation.mmPaymentOffset}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentObligation#mmPurpose
 * PaymentObligation.mmPurpose}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmRemittanceDeliveryMethod
 * PaymentObligation.mmRemittanceDeliveryMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmAssociatedDocument
 * PaymentObligation.mmAssociatedDocument}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentObligation#mmAmount
 * PaymentObligation.mmAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmRemittanceLocation
 * PaymentObligation.mmRemittanceLocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmInterest
 * PaymentObligation.mmInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmCommercialTrade
 * PaymentObligation.mmCommercialTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmPercentage
 * PaymentObligation.mmPercentage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmMaximumAmount
 * PaymentObligation.mmMaximumAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmExpiryDate
 * PaymentObligation.mmExpiryDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmApplicableLaw
 * PaymentObligation.mmApplicableLaw}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmPaymentSourceBuyIn
 * PaymentObligation.mmPaymentSourceBuyIn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmRelatedCorporateAction
 * PaymentObligation.mmRelatedCorporateAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmRelatedCollateralMovement
 * PaymentObligation.mmRelatedCollateralMovement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmPaymentSourceUndertakingDemand
 * PaymentObligation.mmPaymentSourceUndertakingDemand}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmPartyRole
 * PaymentObligation.mmPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmExecutedSecuritiesTrade
 * PaymentObligation.mmExecutedSecuritiesTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmRelatedAccountClosingTerms
 * PaymentObligation.mmRelatedAccountClosingTerms}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmPaymentSourcePortfolioTransfer
 * PaymentObligation.mmPaymentSourcePortfolioTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmPaymentSourceCurrencyOption
 * PaymentObligation.mmPaymentSourceCurrencyOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmExchangeRateInformation
 * PaymentObligation.mmExchangeRateInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmDividend
 * PaymentObligation.mmDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmRepurchaseAgreement
 * PaymentObligation.mmRepurchaseAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmRelatedAssignment
 * PaymentObligation.mmRelatedAssignment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmBankingTransaction
 * PaymentObligation.mmBankingTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmPaymentTerms
 * PaymentObligation.mmPaymentTerms}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmPaymentDueDate
 * PaymentObligation.mmPaymentDueDate}</li>
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
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Dividend#mmObligation
 * Dividend.mmObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ContactPoint#mmRemittanceRelatedPayment
 * ContactPoint.mmRemittanceRelatedPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Document#mmPaymentObligation
 * Document.mmPaymentObligation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#mmPaymentObligation
 * Payment.mmPaymentObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer#mmPaymentObligation
 * PortfolioTransfer.mmPaymentObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccountContract#mmBalanceTransfer
 * CashAccountContract.mmBalanceTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#mmPaymentObligation
 * SecuritiesTradeExecution.mmPaymentObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade#mmResultingSettlement
 * ForeignExchangeTrade.mmResultingSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction#mmCashProceedsMovement
 * CorporateActionProceedsDeliveryInstruction.mmCashProceedsMovement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligationPartyRole#mmPaymentObligation
 * PaymentObligationPartyRole.mmPaymentObligation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Demand#mmPayment
 * Demand.mmPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyOption#mmPremiumSettlement
 * CurrencyOption.mmPremiumSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CommercialTrade#mmPaymentObligation
 * CommercialTrade.mmPaymentObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralMovement#mmCashCollateralMovement
 * CollateralMovement.mmCashCollateralMovement}</li>
 * <li>{@linkplain com.tools20022.repository.entity.BuyIn#mmCashCompensation
 * BuyIn.mmCashCompensation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BankingTransaction#mmPaymentObligation
 * BankingTransaction.mmPaymentObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RepurchaseAgreement#mmPaymentObligation
 * RepurchaseAgreement.mmPaymentObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Assignment#mmPaymentObligation
 * Assignment.mmPaymentObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentTerms#mmRelatedPaymentObligation
 * PaymentTerms.mmRelatedPaymentObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InterestManagement#mmPaymentObligation
 * InterestManagement.mmPaymentObligation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentObligation1#mmPaymentTerms
 * PaymentObligation1.mmPaymentTerms}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentObligation2#mmPaymentTerms
 * PaymentObligation2.mmPaymentTerms}</li>
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
 * "PaymentObligation"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Obligation for the debtor to pay the creditor an amount of cash."</li>
 * </ul>
 */
public class PaymentObligation extends Obligation {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected List<com.tools20022.repository.entity.Payment> paymentOffset;
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
	 * {@linkplain com.tools20022.repository.entity.Payment#mmPaymentObligation
	 * Payment.mmPaymentObligation}</li>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan2#mmCashSettlement
	 * InvestmentPlan2.mmCashSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan4#mmCashSettlement
	 * InvestmentPlan4.mmCashSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan6#mmCashSettlement
	 * InvestmentPlan6.mmCashSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan5#mmModifiedCashSettlement
	 * InvestmentPlan5.mmModifiedCashSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan3#mmModifiedCashSettlement
	 * InvestmentPlan3.mmModifiedCashSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan7#mmModifiedCashSettlement
	 * InvestmentPlan7.mmModifiedCashSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder3#mmCashSettlementDetails
	 * RedemptionOrder3.mmCashSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder5#mmCashSettlementDetails
	 * RedemptionOrder5.mmCashSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution3#mmCashSettlementDetails
	 * RedemptionExecution3.mmCashSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution5#mmCashSettlementDetails
	 * RedemptionExecution5.mmCashSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder7#mmCashSettlementDetails
	 * RedemptionOrder7.mmCashSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder4#mmCashSettlementDetails
	 * RedemptionOrder4.mmCashSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder6#mmCashSettlementDetails
	 * RedemptionOrder6.mmCashSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution4#mmCashSettlementDetails
	 * RedemptionExecution4.mmCashSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#mmCashSettlementDetails
	 * RedemptionExecution6.mmCashSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder8#mmCashSettlementDetails
	 * RedemptionOrder8.mmCashSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder3#mmCashSettlementDetails
	 * SubscriptionOrder3.mmCashSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder5#mmCashSettlementDetails
	 * SubscriptionOrder5.mmCashSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution3#mmCashSettlementDetails
	 * SubscriptionExecution3.mmCashSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution5#mmCashSettlementDetails
	 * SubscriptionExecution5.mmCashSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder7#mmCashSettlementDetails
	 * SubscriptionOrder7.mmCashSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder4#mmCashSettlementDetails
	 * SubscriptionOrder4.mmCashSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder6#mmCashSettlementDetails
	 * SubscriptionOrder6.mmCashSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution4#mmCashSettlementDetails
	 * SubscriptionExecution4.mmCashSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#mmCashSettlementDetails
	 * SubscriptionExecution6.mmCashSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder8#mmCashSettlementDetails
	 * SubscriptionOrder8.mmCashSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder2#mmCashSettlementDetails
	 * SwitchOrder2.mmCashSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder3#mmCashSettlementDetails
	 * SwitchOrder3.mmCashSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution3#mmCashSettlementDetails
	 * SwitchExecution3.mmCashSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution4#mmCashSettlementDetails
	 * SwitchExecution4.mmCashSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder4#mmCashSettlementDetails
	 * SwitchOrder4.mmCashSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder11#mmCashSettlementDetails
	 * RedemptionOrder11.mmCashSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution12#mmCashSettlementDetails
	 * RedemptionExecution12.mmCashSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder11#mmCashSettlementDetails
	 * SubscriptionOrder11.mmCashSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution9#mmCashSettlementDetails
	 * SubscriptionExecution9.mmCashSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan9#mmCashSettlement
	 * InvestmentPlan9.mmCashSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan8#mmModifiedCashSettlement
	 * InvestmentPlan8.mmModifiedCashSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTerms4#mmPaymentTerms
	 * PaymentTerms4.mmPaymentTerms}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTerms5#mmPaymentTerms
	 * PaymentTerms5.mmPaymentTerms}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan10#mmCashSettlement
	 * InvestmentPlan10.mmCashSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan11#mmModifiedCashSettlement
	 * InvestmentPlan11.mmModifiedCashSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Instalment2#mmPaymentInstrument
	 * Instalment2.mmPaymentInstrument}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan12#mmCashSettlement
	 * InvestmentPlan12.mmCashSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan13#mmModifiedCashSettlement
	 * InvestmentPlan13.mmModifiedCashSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan14#mmCashSettlement
	 * InvestmentPlan14.mmCashSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution7#mmCashSettlementDetails
	 * SwitchExecution7.mmCashSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder7#mmCashSettlementDetails
	 * SwitchOrder7.mmCashSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder14#mmCashSettlementDetails
	 * RedemptionOrder14.mmCashSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan15#mmModifiedCashSettlement
	 * InvestmentPlan15.mmModifiedCashSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmCashSettlementDetails
	 * SubscriptionExecution13.mmCashSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution12#mmCashSettlementDetails
	 * SubscriptionExecution12.mmCashSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder15#mmCashSettlementDetails
	 * SubscriptionOrder15.mmCashSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder15#mmCashSettlementDetails
	 * RedemptionOrder15.mmCashSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#mmCashSettlementDetails
	 * RedemptionExecution16.mmCashSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder14#mmCashSettlementDetails
	 * SubscriptionOrder14.mmCashSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#mmCashSettlementDetails
	 * RedemptionExecution15.mmCashSettlementDetails}</li>
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
	public static final MMBusinessAssociationEnd mmPaymentOffset = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(InvestmentPlan2.mmCashSettlement, InvestmentPlan4.mmCashSettlement, InvestmentPlan6.mmCashSettlement, InvestmentPlan5.mmModifiedCashSettlement, InvestmentPlan3.mmModifiedCashSettlement,
					InvestmentPlan7.mmModifiedCashSettlement, RedemptionOrder3.mmCashSettlementDetails, RedemptionOrder5.mmCashSettlementDetails, RedemptionExecution3.mmCashSettlementDetails, RedemptionExecution5.mmCashSettlementDetails,
					RedemptionOrder7.mmCashSettlementDetails, RedemptionOrder4.mmCashSettlementDetails, RedemptionOrder6.mmCashSettlementDetails, RedemptionExecution4.mmCashSettlementDetails, RedemptionExecution6.mmCashSettlementDetails,
					RedemptionOrder8.mmCashSettlementDetails, SubscriptionOrder3.mmCashSettlementDetails, SubscriptionOrder5.mmCashSettlementDetails, SubscriptionExecution3.mmCashSettlementDetails,
					SubscriptionExecution5.mmCashSettlementDetails, SubscriptionOrder7.mmCashSettlementDetails, SubscriptionOrder4.mmCashSettlementDetails, SubscriptionOrder6.mmCashSettlementDetails,
					SubscriptionExecution4.mmCashSettlementDetails, SubscriptionExecution6.mmCashSettlementDetails, SubscriptionOrder8.mmCashSettlementDetails, SwitchOrder2.mmCashSettlementDetails, SwitchOrder3.mmCashSettlementDetails,
					SwitchExecution3.mmCashSettlementDetails, SwitchExecution4.mmCashSettlementDetails, SwitchOrder4.mmCashSettlementDetails, RedemptionOrder11.mmCashSettlementDetails, RedemptionExecution12.mmCashSettlementDetails,
					SubscriptionOrder11.mmCashSettlementDetails, SubscriptionExecution9.mmCashSettlementDetails, InvestmentPlan9.mmCashSettlement, InvestmentPlan8.mmModifiedCashSettlement, PaymentTerms4.mmPaymentTerms,
					PaymentTerms5.mmPaymentTerms, InvestmentPlan10.mmCashSettlement, InvestmentPlan11.mmModifiedCashSettlement, Instalment2.mmPaymentInstrument, InvestmentPlan12.mmCashSettlement, InvestmentPlan13.mmModifiedCashSettlement,
					InvestmentPlan14.mmCashSettlement, SwitchExecution7.mmCashSettlementDetails, SwitchOrder7.mmCashSettlementDetails, RedemptionOrder14.mmCashSettlementDetails, InvestmentPlan15.mmModifiedCashSettlement,
					SubscriptionExecution13.mmCashSettlementDetails, SubscriptionExecution12.mmCashSettlementDetails, SubscriptionOrder15.mmCashSettlementDetails, RedemptionOrder15.mmCashSettlementDetails,
					RedemptionExecution16.mmCashSettlementDetails, SubscriptionOrder14.mmCashSettlementDetails, RedemptionExecution15.mmCashSettlementDetails);
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PaymentOffset";
			definition = "Fulfilment of a payment obligation through a payment and its execution. It is derived from the association between Obligation and Obligation fulfillment.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Payment.mmPaymentObligation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Payment.mmObject();
		}
	};
	protected PaymentPurposeCode purpose;
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
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionReference2Details#mmPurpose
	 * PaymentInstructionReference2Details.mmPurpose}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentDetails5#mmPurpose
	 * PaymentDetails5.mmPurpose}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentDetails6#mmPurpose
	 * PaymentDetails6.mmPurpose}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentDetails7#mmPurpose
	 * PaymentDetails7.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction1#mmPurpose
	 * PaymentInstruction1.mmPurpose}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.Purpose1Choice#mmCode
	 * Purpose1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Purpose1Choice#mmProprietary
	 * Purpose1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction1#mmPurpose
	 * EntryTransaction1.mmPurpose}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.Purpose2Choice#mmCode
	 * Purpose2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Purpose2Choice#mmProprietary
	 * Purpose2Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction2#mmPurpose
	 * EntryTransaction2.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction3#mmPurpose
	 * EntryTransaction3.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction4#mmPurpose
	 * EntryTransaction4.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation1#mmPurpose
	 * CreditTransferTransactionInformation1.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation10#mmPurpose
	 * CreditTransferTransactionInformation10.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction1#mmPurpose
	 * CreditTransferTransaction1.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction6#mmPurpose
	 * CreditTransferTransaction6.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation2#mmPurpose
	 * CreditTransferTransactionInformation2.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation11#mmPurpose
	 * CreditTransferTransactionInformation11.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction2#mmPurpose
	 * CreditTransferTransaction2.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction7#mmPurpose
	 * CreditTransferTransaction7.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation14#mmPurpose
	 * CreditTransferTransactionInformation14.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction5#mmPurpose
	 * CreditTransferTransaction5.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction10#mmPurpose
	 * CreditTransferTransaction10.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PurposeChoice#mmProprietary
	 * PurposeChoice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.PurposeChoice#mmCode
	 * PurposeChoice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification#mmPurpose
	 * RequestedModification.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NotificationItem3#mmPurpose
	 * NotificationItem3.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItemReference1#mmPurpose
	 * OriginalItemReference1.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation2#mmPurpose
	 * PaymentComplementaryInformation2.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatementResolutionEntry1#mmPurpose
	 * StatementResolutionEntry1.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation3#mmPurpose
	 * PaymentComplementaryInformation3.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatementResolutionEntry2#mmPurpose
	 * StatementResolutionEntry2.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification3#mmPurpose
	 * RequestedModification3.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NotificationItem4#mmPurpose
	 * NotificationItem4.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItemReference2#mmPurpose
	 * OriginalItemReference2.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation8#mmPurpose
	 * CreditTransferTransactionInformation8.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation7#mmPurpose
	 * CreditTransferTransactionInformation7.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation9#mmPurpose
	 * CreditTransferTransactionInformation9.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction14#mmPurpose
	 * PaymentInstruction14.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Purpose3Choice#mmSecuritiesPurposeCode
	 * Purpose3Choice.mmSecuritiesPurposeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Purpose3Choice#mmProprietary
	 * Purpose3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation4#mmPurpose
	 * PaymentComplementaryInformation4.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction19#mmPurpose
	 * CreditTransferTransaction19.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItemReference3#mmPurpose
	 * OriginalItemReference3.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification4#mmPurpose
	 * RequestedModification4.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction20#mmPurpose
	 * CreditTransferTransaction20.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NotificationItem5#mmPurpose
	 * NotificationItem5.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction7#mmPurpose
	 * EntryTransaction7.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction21#mmPurpose
	 * CreditTransferTransaction21.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification5#mmPurpose
	 * RequestedModification5.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction25#mmPurpose
	 * CreditTransferTransaction25.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation5#mmPurpose
	 * PaymentComplementaryInformation5.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction26#mmPurpose
	 * CreditTransferTransaction26.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItemReference4#mmPurpose
	 * OriginalItemReference4.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction22#mmPurpose
	 * CreditTransferTransaction22.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction8#mmPurpose
	 * EntryTransaction8.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NotificationItem6#mmPurpose
	 * NotificationItem6.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification6#mmPurpose
	 * RequestedModification6.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation6#mmPurpose
	 * PaymentComplementaryInformation6.mmPurpose}</li>
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
	public static final MMBusinessAttribute mmPurpose = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(PaymentInstructionReference2Details.mmPurpose, PaymentDetails5.mmPurpose, PaymentDetails6.mmPurpose, PaymentDetails7.mmPurpose, PaymentInstruction1.mmPurpose, Purpose1Choice.mmCode,
					Purpose1Choice.mmProprietary, EntryTransaction1.mmPurpose, Purpose2Choice.mmCode, Purpose2Choice.mmProprietary, EntryTransaction2.mmPurpose, EntryTransaction3.mmPurpose, EntryTransaction4.mmPurpose,
					CreditTransferTransactionInformation1.mmPurpose, CreditTransferTransactionInformation10.mmPurpose, CreditTransferTransaction1.mmPurpose, CreditTransferTransaction6.mmPurpose,
					CreditTransferTransactionInformation2.mmPurpose, CreditTransferTransactionInformation11.mmPurpose, CreditTransferTransaction2.mmPurpose, CreditTransferTransaction7.mmPurpose,
					CreditTransferTransactionInformation14.mmPurpose, CreditTransferTransaction5.mmPurpose, CreditTransferTransaction10.mmPurpose, PurposeChoice.mmProprietary, PurposeChoice.mmCode, RequestedModification.mmPurpose,
					NotificationItem3.mmPurpose, OriginalItemReference1.mmPurpose, PaymentComplementaryInformation2.mmPurpose, StatementResolutionEntry1.mmPurpose, PaymentComplementaryInformation3.mmPurpose,
					StatementResolutionEntry2.mmPurpose, RequestedModification3.mmPurpose, NotificationItem4.mmPurpose, OriginalItemReference2.mmPurpose, CreditTransferTransactionInformation8.mmPurpose,
					CreditTransferTransactionInformation7.mmPurpose, CreditTransferTransactionInformation9.mmPurpose, PaymentInstruction14.mmPurpose, Purpose3Choice.mmSecuritiesPurposeCode, Purpose3Choice.mmProprietary,
					PaymentComplementaryInformation4.mmPurpose, CreditTransferTransaction19.mmPurpose, OriginalItemReference3.mmPurpose, RequestedModification4.mmPurpose, CreditTransferTransaction20.mmPurpose, NotificationItem5.mmPurpose,
					EntryTransaction7.mmPurpose, CreditTransferTransaction21.mmPurpose, RequestedModification5.mmPurpose, CreditTransferTransaction25.mmPurpose, PaymentComplementaryInformation5.mmPurpose,
					CreditTransferTransaction26.mmPurpose, OriginalItemReference4.mmPurpose, CreditTransferTransaction22.mmPurpose, EntryTransaction8.mmPurpose, NotificationItem6.mmPurpose, RequestedModification6.mmPurpose,
					PaymentComplementaryInformation6.mmPurpose);
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Purpose";
			definition = "Underlying reason for the payment obligation";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PaymentPurposeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PaymentObligation.class.getMethod("getPurpose", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected RemittanceLocationMethodCode remittanceDeliveryMethod;
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
	 * {@linkplain com.tools20022.repository.msg.RemittanceLocation1#mmRemittanceLocationMethod
	 * RemittanceLocation1.mmRemittanceLocationMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RemittanceLocation2#mmRemittanceLocationMethod
	 * RemittanceLocation2.mmRemittanceLocationMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RemittanceLocationDetails1#mmMethod
	 * RemittanceLocationDetails1.mmMethod}</li>
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
	public static final MMBusinessAttribute mmRemittanceDeliveryMethod = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(RemittanceLocation1.mmRemittanceLocationMethod, RemittanceLocation2.mmRemittanceLocationMethod, RemittanceLocationDetails1.mmMethod);
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RemittanceDeliveryMethod";
			definition = "Specifies the method to be used by the first agent (debtor agent in the case of a credit transfer, creditor agent in the case of a direct debit) to deliver the remittance advice information, which may be sent separately from the payment instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RemittanceLocationMethodCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PaymentObligation.class.getMethod("getRemittanceDeliveryMethod", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.Document> associatedDocument;
	/**
	 * Specifies the referred document/transaction, eg, invoice or credit note.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Document#mmPaymentObligation
	 * Document.mmPaymentObligation}</li>
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
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction1#mmRemittanceInformation
	 * EntryTransaction1.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction2#mmRemittanceInformation
	 * EntryTransaction2.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction3#mmRemittanceInformation
	 * EntryTransaction3.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction4#mmRemittanceInformation
	 * EntryTransaction4.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation1#mmRemittanceInformation
	 * CreditTransferTransactionInformation1.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation10#mmRemittanceInformation
	 * CreditTransferTransactionInformation10.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction1#mmRemittanceInformation
	 * CreditTransferTransaction1.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction6#mmRemittanceInformation
	 * CreditTransferTransaction6.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation1#mmRemittanceInformation
	 * DirectDebitTransactionInformation1.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation9#mmRemittanceInformation
	 * DirectDebitTransactionInformation9.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation11#mmRemittanceInformation
	 * DirectDebitTransactionInformation11.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation13#mmRemittanceInformation
	 * DirectDebitTransactionInformation13.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference1#mmRemittanceInformation
	 * OriginalTransactionReference1.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference13#mmRemittanceInformation
	 * OriginalTransactionReference13.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference16#mmRemittanceInformation
	 * OriginalTransactionReference16.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation2#mmRemittanceInformation
	 * CreditTransferTransactionInformation2.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation11#mmRemittanceInformation
	 * CreditTransferTransactionInformation11.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction2#mmRemittanceInformation
	 * CreditTransferTransaction2.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction7#mmRemittanceInformation
	 * CreditTransferTransaction7.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation2#mmRemittanceInformation
	 * DirectDebitTransactionInformation2.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation10#mmRemittanceInformation
	 * DirectDebitTransactionInformation10.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation12#mmRemittanceInformation
	 * DirectDebitTransactionInformation12.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation14#mmRemittanceInformation
	 * DirectDebitTransactionInformation14.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation3#mmRemittanceInformation
	 * CreditTransferTransactionInformation3.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation12#mmRemittanceInformation
	 * CreditTransferTransactionInformation12.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation13#mmRemittanceInformation
	 * CreditTransferTransactionInformation13.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction3#mmRemittanceInformation
	 * CreditTransferTransaction3.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction4#mmRemittanceInformation
	 * CreditTransferTransaction4.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction8#mmRemittanceInformation
	 * CreditTransferTransaction8.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference15#mmRemittanceInformation
	 * OriginalTransactionReference15.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference17#mmRemittanceInformation
	 * OriginalTransactionReference17.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference19#mmRemittanceInformation
	 * OriginalTransactionReference19.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation14#mmRemittanceInformation
	 * CreditTransferTransactionInformation14.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction5#mmRemittanceInformation
	 * CreditTransferTransaction5.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction10#mmRemittanceInformation
	 * CreditTransferTransaction10.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation#mmRemittanceChoice
	 * PaymentComplementaryInformation.mmRemittanceChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NotificationItem3#mmRemittanceInformation
	 * NotificationItem3.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItemReference1#mmRemittanceInformation
	 * OriginalItemReference1.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation2#mmRemittanceInformation
	 * PaymentComplementaryInformation2.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation3#mmRemittanceInformation
	 * PaymentComplementaryInformation3.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NotificationItem4#mmRemittanceInformation
	 * NotificationItem4.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItemReference2#mmRemittanceInformation
	 * OriginalItemReference2.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation15#mmRemittanceInformation
	 * DirectDebitTransactionInformation15.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference7#mmRemittanceInformation
	 * OriginalTransactionReference7.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference10#mmRemittanceInformation
	 * OriginalTransactionReference10.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference9#mmRemittanceInformation
	 * OriginalTransactionReference9.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference12#mmRemittanceInformation
	 * OriginalTransactionReference12.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference8#mmRemittanceInformation
	 * OriginalTransactionReference8.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference11#mmRemittanceInformation
	 * OriginalTransactionReference11.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation6#mmRemittanceInformation
	 * CreditTransferTransactionInformation6.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation8#mmRemittanceInformation
	 * CreditTransferTransactionInformation8.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation7#mmRemittanceInformation
	 * CreditTransferTransactionInformation7.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation9#mmRemittanceInformation
	 * CreditTransferTransactionInformation9.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation5#mmRemittanceInformation
	 * DirectDebitTransactionInformation5.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation7#mmRemittanceInformation
	 * DirectDebitTransactionInformation7.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation6#mmRemittanceInformation
	 * DirectDebitTransactionInformation6.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation8#mmRemittanceInformation
	 * DirectDebitTransactionInformation8.mmRemittanceInformation}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Garnishment1#mmType
	 * Garnishment1.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation4#mmRemittanceInformation
	 * PaymentComplementaryInformation4.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction17#mmRemittanceInformation
	 * CreditTransferTransaction17.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction19#mmRemittanceInformation
	 * CreditTransferTransaction19.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation17#mmRemittanceInformation
	 * DirectDebitTransactionInformation17.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItemReference3#mmRemittanceInformation
	 * OriginalItemReference3.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference20#mmRemittanceInformation
	 * OriginalTransactionReference20.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction18#mmRemittanceInformation
	 * CreditTransferTransaction18.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation18#mmRemittanceInformation
	 * DirectDebitTransactionInformation18.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction20#mmRemittanceInformation
	 * CreditTransferTransaction20.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NotificationItem5#mmRemittanceInformation
	 * NotificationItem5.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction7#mmRemittanceInformation
	 * EntryTransaction7.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference21#mmRemittanceInformation
	 * OriginalTransactionReference21.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction21#mmRemittanceInformation
	 * CreditTransferTransaction21.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction23#mmRemittanceInformation
	 * CreditTransferTransaction23.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction25#mmRemittanceInformation
	 * CreditTransferTransaction25.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation5#mmRemittanceInformation
	 * PaymentComplementaryInformation5.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation20#mmRemittanceInformation
	 * DirectDebitTransactionInformation20.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference22#mmRemittanceInformation
	 * OriginalTransactionReference22.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction24#mmRemittanceInformation
	 * CreditTransferTransaction24.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction26#mmRemittanceInformation
	 * CreditTransferTransaction26.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItemReference4#mmRemittanceInformation
	 * OriginalItemReference4.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation19#mmRemittanceInformation
	 * DirectDebitTransactionInformation19.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction22#mmRemittanceInformation
	 * CreditTransferTransaction22.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction8#mmRemittanceInformation
	 * EntryTransaction8.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NotificationItem6#mmRemittanceInformation
	 * NotificationItem6.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference23#mmRemittanceInformation
	 * OriginalTransactionReference23.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation21#mmRemittanceInformation
	 * DirectDebitTransactionInformation21.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference24#mmRemittanceInformation
	 * OriginalTransactionReference24.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference26#mmRemittanceInformation
	 * OriginalTransactionReference26.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation22#mmRemittanceInformation
	 * DirectDebitTransactionInformation22.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation6#mmRemittanceInformation
	 * PaymentComplementaryInformation6.mmRemittanceInformation}</li>
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
	public static final MMBusinessAssociationEnd mmAssociatedDocument = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(EntryTransaction1.mmRemittanceInformation, EntryTransaction2.mmRemittanceInformation, EntryTransaction3.mmRemittanceInformation, EntryTransaction4.mmRemittanceInformation,
					CreditTransferTransactionInformation1.mmRemittanceInformation, CreditTransferTransactionInformation10.mmRemittanceInformation, CreditTransferTransaction1.mmRemittanceInformation,
					CreditTransferTransaction6.mmRemittanceInformation, DirectDebitTransactionInformation1.mmRemittanceInformation, DirectDebitTransactionInformation9.mmRemittanceInformation,
					DirectDebitTransactionInformation11.mmRemittanceInformation, DirectDebitTransactionInformation13.mmRemittanceInformation, OriginalTransactionReference1.mmRemittanceInformation,
					OriginalTransactionReference13.mmRemittanceInformation, OriginalTransactionReference16.mmRemittanceInformation, CreditTransferTransactionInformation2.mmRemittanceInformation,
					CreditTransferTransactionInformation11.mmRemittanceInformation, CreditTransferTransaction2.mmRemittanceInformation, CreditTransferTransaction7.mmRemittanceInformation,
					DirectDebitTransactionInformation2.mmRemittanceInformation, DirectDebitTransactionInformation10.mmRemittanceInformation, DirectDebitTransactionInformation12.mmRemittanceInformation,
					DirectDebitTransactionInformation14.mmRemittanceInformation, CreditTransferTransactionInformation3.mmRemittanceInformation, CreditTransferTransactionInformation12.mmRemittanceInformation,
					CreditTransferTransactionInformation13.mmRemittanceInformation, CreditTransferTransaction3.mmRemittanceInformation, CreditTransferTransaction4.mmRemittanceInformation, CreditTransferTransaction8.mmRemittanceInformation,
					OriginalTransactionReference15.mmRemittanceInformation, OriginalTransactionReference17.mmRemittanceInformation, OriginalTransactionReference19.mmRemittanceInformation,
					CreditTransferTransactionInformation14.mmRemittanceInformation, CreditTransferTransaction5.mmRemittanceInformation, CreditTransferTransaction10.mmRemittanceInformation,
					PaymentComplementaryInformation.mmRemittanceChoice, NotificationItem3.mmRemittanceInformation, OriginalItemReference1.mmRemittanceInformation, PaymentComplementaryInformation2.mmRemittanceInformation,
					PaymentComplementaryInformation3.mmRemittanceInformation, NotificationItem4.mmRemittanceInformation, OriginalItemReference2.mmRemittanceInformation, DirectDebitTransactionInformation15.mmRemittanceInformation,
					OriginalTransactionReference7.mmRemittanceInformation, OriginalTransactionReference10.mmRemittanceInformation, OriginalTransactionReference9.mmRemittanceInformation,
					OriginalTransactionReference12.mmRemittanceInformation, OriginalTransactionReference8.mmRemittanceInformation, OriginalTransactionReference11.mmRemittanceInformation,
					CreditTransferTransactionInformation6.mmRemittanceInformation, CreditTransferTransactionInformation8.mmRemittanceInformation, CreditTransferTransactionInformation7.mmRemittanceInformation,
					CreditTransferTransactionInformation9.mmRemittanceInformation, DirectDebitTransactionInformation5.mmRemittanceInformation, DirectDebitTransactionInformation7.mmRemittanceInformation,
					DirectDebitTransactionInformation6.mmRemittanceInformation, DirectDebitTransactionInformation8.mmRemittanceInformation, Garnishment1.mmType, PaymentComplementaryInformation4.mmRemittanceInformation,
					CreditTransferTransaction17.mmRemittanceInformation, CreditTransferTransaction19.mmRemittanceInformation, DirectDebitTransactionInformation17.mmRemittanceInformation, OriginalItemReference3.mmRemittanceInformation,
					OriginalTransactionReference20.mmRemittanceInformation, CreditTransferTransaction18.mmRemittanceInformation, DirectDebitTransactionInformation18.mmRemittanceInformation,
					CreditTransferTransaction20.mmRemittanceInformation, NotificationItem5.mmRemittanceInformation, EntryTransaction7.mmRemittanceInformation, OriginalTransactionReference21.mmRemittanceInformation,
					CreditTransferTransaction21.mmRemittanceInformation, CreditTransferTransaction23.mmRemittanceInformation, CreditTransferTransaction25.mmRemittanceInformation, PaymentComplementaryInformation5.mmRemittanceInformation,
					DirectDebitTransactionInformation20.mmRemittanceInformation, OriginalTransactionReference22.mmRemittanceInformation, CreditTransferTransaction24.mmRemittanceInformation,
					CreditTransferTransaction26.mmRemittanceInformation, OriginalItemReference4.mmRemittanceInformation, DirectDebitTransactionInformation19.mmRemittanceInformation, CreditTransferTransaction22.mmRemittanceInformation,
					EntryTransaction8.mmRemittanceInformation, NotificationItem6.mmRemittanceInformation, OriginalTransactionReference23.mmRemittanceInformation, DirectDebitTransactionInformation21.mmRemittanceInformation,
					OriginalTransactionReference24.mmRemittanceInformation, OriginalTransactionReference26.mmRemittanceInformation, DirectDebitTransactionInformation22.mmRemittanceInformation,
					PaymentComplementaryInformation6.mmRemittanceInformation);
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AssociatedDocument";
			definition = "Specifies the referred document/transaction, eg, invoice or credit note.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Document.mmPaymentObligation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
		}
	};
	protected CurrencyAndAmount amount;
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
	 * {@linkplain com.tools20022.repository.choice.ReferredDocumentAmount1Choice#mmDuePayableAmount
	 * ReferredDocumentAmount1Choice.mmDuePayableAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RemittanceAmount1#mmDuePayableAmount
	 * RemittanceAmount1.mmDuePayableAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RemittanceAmount2#mmDuePayableAmount
	 * RemittanceAmount2.mmDuePayableAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FailedMovement1#mmCashAmount
	 * FailedMovement1.mmCashAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PremiumAmount1#mmAmount
	 * PremiumAmount1.mmAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PremiumAmount2#mmAmount
	 * PremiumAmount2.mmAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Instalment1#mmAmount
	 * Instalment1.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeSettlement1#mmDuePayableAmount
	 * TradeSettlement1.mmDuePayableAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashCompensation1#mmSettlementAmount
	 * CashCompensation1.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PEPISACashTransfer1#mmAmountToBeTransferred
	 * PEPISACashTransfer1.mmAmountToBeTransferred}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PEPISACashTransfer2#mmAmountToBeTransferred
	 * PEPISACashTransfer2.mmAmountToBeTransferred}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RemittanceAmount3#mmDuePayableAmount
	 * RemittanceAmount3.mmDuePayableAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Instalment2#mmAmount
	 * Instalment2.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction1#mmTransactionNominalAmount
	 * UnsecuredMarketTransaction1.mmTransactionNominalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OvernightIndexSwapTransaction1#mmTransactionNominalAmount
	 * OvernightIndexSwapTransaction1.mmTransactionNominalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction1#mmTransactionNominalAmount
	 * SecuredMarketTransaction1.mmTransactionNominalAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeContract1#mmAmount
	 * TradeContract1.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InitialAmount1Choice#mmAmount
	 * InitialAmount1Choice.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction2#mmTransactionNominalAmount
	 * UnsecuredMarketTransaction2.mmTransactionNominalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction2#mmTransactionNominalAmount
	 * SecuredMarketTransaction2.mmTransactionNominalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction3#mmTransactionNominalAmount
	 * UnsecuredMarketTransaction3.mmTransactionNominalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OvernightIndexSwapTransaction3#mmTransactionNominalAmount
	 * OvernightIndexSwapTransaction3.mmTransactionNominalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction3#mmTransactionNominalAmount
	 * SecuredMarketTransaction3.mmTransactionNominalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeSettlement2#mmDuePayableAmount
	 * TradeSettlement2.mmDuePayableAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction4#mmTransactionNominalAmount
	 * SecuredMarketTransaction4.mmTransactionNominalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OvernightIndexSwapTransaction4#mmTransactionNominalAmount
	 * OvernightIndexSwapTransaction4.mmTransactionNominalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction4#mmTransactionNominalAmount
	 * UnsecuredMarketTransaction4.mmTransactionNominalAmount}</li>
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
	public static final MMBusinessAttribute mmAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(ReferredDocumentAmount1Choice.mmDuePayableAmount, RemittanceAmount1.mmDuePayableAmount, RemittanceAmount2.mmDuePayableAmount, FailedMovement1.mmCashAmount, PremiumAmount1.mmAmount,
					PremiumAmount2.mmAmount, Instalment1.mmAmount, TradeSettlement1.mmDuePayableAmount, CashCompensation1.mmSettlementAmount, PEPISACashTransfer1.mmAmountToBeTransferred, PEPISACashTransfer2.mmAmountToBeTransferred,
					RemittanceAmount3.mmDuePayableAmount, Instalment2.mmAmount, UnsecuredMarketTransaction1.mmTransactionNominalAmount, OvernightIndexSwapTransaction1.mmTransactionNominalAmount,
					SecuredMarketTransaction1.mmTransactionNominalAmount, TradeContract1.mmAmount, InitialAmount1Choice.mmAmount, UnsecuredMarketTransaction2.mmTransactionNominalAmount, SecuredMarketTransaction2.mmTransactionNominalAmount,
					UnsecuredMarketTransaction3.mmTransactionNominalAmount, OvernightIndexSwapTransaction3.mmTransactionNominalAmount, SecuredMarketTransaction3.mmTransactionNominalAmount, TradeSettlement2.mmDuePayableAmount,
					SecuredMarketTransaction4.mmTransactionNominalAmount, OvernightIndexSwapTransaction4.mmTransactionNominalAmount, UnsecuredMarketTransaction4.mmTransactionNominalAmount);
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Amount";
			definition = "Amount payable to the creditor.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PaymentObligation.class.getMethod("getAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.ContactPoint> remittanceLocation;
	/**
	 * Address to which the first agent is to send the remittance information.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ContactPoint#mmRemittanceRelatedPayment
	 * ContactPoint.mmRemittanceRelatedPayment}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation1#mmRelatedRemittanceInformation
	 * CreditTransferTransactionInformation1.mmRelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation10#mmRelatedRemittanceInformation
	 * CreditTransferTransactionInformation10.mmRelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction1#mmRelatedRemittanceInformation
	 * CreditTransferTransaction1.mmRelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction6#mmRelatedRemittanceInformation
	 * CreditTransferTransaction6.mmRelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation2#mmRelatedRemittanceInformation
	 * CreditTransferTransactionInformation2.mmRelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation11#mmRelatedRemittanceInformation
	 * CreditTransferTransactionInformation11.mmRelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction2#mmRelatedRemittanceInformation
	 * CreditTransferTransaction2.mmRelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction7#mmRelatedRemittanceInformation
	 * CreditTransferTransaction7.mmRelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation14#mmRelatedRemittanceInformation
	 * CreditTransferTransactionInformation14.mmRelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction5#mmRelatedRemittanceInformation
	 * CreditTransferTransaction5.mmRelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction10#mmRelatedRemittanceInformation
	 * CreditTransferTransaction10.mmRelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation7#mmRelatedRemittanceInformation
	 * CreditTransferTransactionInformation7.mmRelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation9#mmRelatedRemittanceInformation
	 * CreditTransferTransactionInformation9.mmRelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction19#mmRelatedRemittanceInformation
	 * CreditTransferTransaction19.mmRelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction20#mmRelatedRemittanceInformation
	 * CreditTransferTransaction20.mmRelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction21#mmRelatedRemittanceInformation
	 * CreditTransferTransaction21.mmRelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction25#mmRelatedRemittanceInformation
	 * CreditTransferTransaction25.mmRelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction26#mmRelatedRemittanceInformation
	 * CreditTransferTransaction26.mmRelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction22#mmRelatedRemittanceInformation
	 * CreditTransferTransaction22.mmRelatedRemittanceInformation}</li>
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
	public static final MMBusinessAssociationEnd mmRemittanceLocation = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(CreditTransferTransactionInformation1.mmRelatedRemittanceInformation, CreditTransferTransactionInformation10.mmRelatedRemittanceInformation,
					CreditTransferTransaction1.mmRelatedRemittanceInformation, CreditTransferTransaction6.mmRelatedRemittanceInformation, CreditTransferTransactionInformation2.mmRelatedRemittanceInformation,
					CreditTransferTransactionInformation11.mmRelatedRemittanceInformation, CreditTransferTransaction2.mmRelatedRemittanceInformation, CreditTransferTransaction7.mmRelatedRemittanceInformation,
					CreditTransferTransactionInformation14.mmRelatedRemittanceInformation, CreditTransferTransaction5.mmRelatedRemittanceInformation, CreditTransferTransaction10.mmRelatedRemittanceInformation,
					CreditTransferTransactionInformation7.mmRelatedRemittanceInformation, CreditTransferTransactionInformation9.mmRelatedRemittanceInformation, CreditTransferTransaction19.mmRelatedRemittanceInformation,
					CreditTransferTransaction20.mmRelatedRemittanceInformation, CreditTransferTransaction21.mmRelatedRemittanceInformation, CreditTransferTransaction25.mmRelatedRemittanceInformation,
					CreditTransferTransaction26.mmRelatedRemittanceInformation, CreditTransferTransaction22.mmRelatedRemittanceInformation);
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RemittanceLocation";
			definition = "Address to which the first agent is to send the remittance information.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ContactPoint.mmRemittanceRelatedPayment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ContactPoint.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.InterestManagement> interest;
	/**
	 * Process which calculates the interest to be paid. It may also specify the
	 * interest charged on instalment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InterestManagement#mmPaymentObligation
	 * InterestManagement.mmPaymentObligation}</li>
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
	 * {@linkplain com.tools20022.repository.msg.RecurringTransaction1#mmInterestCharges
	 * RecurringTransaction1.mmInterestCharges}</li>
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
	public static final MMBusinessAssociationEnd mmInterest = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(RecurringTransaction1.mmInterestCharges);
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Interest";
			definition = "Process which calculates the interest to be paid. It may also specify the interest charged on instalment.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InterestManagement.mmPaymentObligation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InterestManagement.mmObject();
		}
	};
	protected CommercialTrade commercialTrade;
	/**
	 * Commercial trade which creates the payment obligation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CommercialTrade#mmPaymentObligation
	 * CommercialTrade.mmPaymentObligation}</li>
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
	public static final MMBusinessAssociationEnd mmCommercialTrade = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CommercialTrade";
			definition = "Commercial trade which creates the payment obligation.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CommercialTrade.mmPaymentObligation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CommercialTrade.mmObject();
		}
	};
	protected PercentageRate percentage;
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
	 * {@linkplain com.tools20022.repository.msg.PaymentObligation1#mmPercentage
	 * PaymentObligation1.mmPercentage}</li>
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
	public static final MMBusinessAttribute mmPercentage = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(PaymentObligation1.mmPercentage);
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Percentage";
			definition = "Maximum amount that a financial institution guarantees to pay for a specific commercial trade, expressed as a percentage of the purchase order net amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PaymentObligation.class.getMethod("getPercentage", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyAndAmount maximumAmount;
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
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentObligation1#mmAmount
	 * PaymentObligation1.mmAmount}</li>
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
	public static final MMBusinessAttribute mmMaximumAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(PaymentObligation1.mmAmount);
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MaximumAmount";
			definition = "Maximum amount that a financial institution guarantees to pay for a specific commercial trade.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PaymentObligation.class.getMethod("getMaximumAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODateTime expiryDate;
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
	 * {@linkplain com.tools20022.repository.msg.PaymentObligation1#mmExpiryDate
	 * PaymentObligation1.mmExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentObligation2#mmExpiryDate
	 * PaymentObligation2.mmExpiryDate}</li>
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
	public static final MMBusinessAttribute mmExpiryDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(PaymentObligation1.mmExpiryDate, PaymentObligation2.mmExpiryDate);
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExpiryDate";
			definition = "Date at which the obligation will expire. For instance, it is the transaction authorisation deadline to complete a payment by card.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PaymentObligation.class.getMethod("getExpiryDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CountryCode applicableLaw;
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
	 * {@linkplain com.tools20022.repository.msg.PaymentObligation1#mmApplicableLaw
	 * PaymentObligation1.mmApplicableLaw}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentObligation2#mmApplicableLaw
	 * PaymentObligation2.mmApplicableLaw}</li>
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
	public static final MMBusinessAttribute mmApplicableLaw = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(PaymentObligation1.mmApplicableLaw, PaymentObligation2.mmApplicableLaw);
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ApplicableLaw";
			definition = "Country of which the law governs the payment obligation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CountryCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PaymentObligation.class.getMethod("getApplicableLaw", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected BuyIn paymentSourceBuyIn;
	/**
	 * Buy-in process which created the payment obligation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BuyIn#mmCashCompensation
	 * BuyIn.mmCashCompensation}</li>
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
	public static final MMBusinessAssociationEnd mmPaymentSourceBuyIn = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PaymentSourceBuyIn";
			definition = "Buy-in process which created the payment obligation.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.BuyIn.mmCashCompensation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.BuyIn.mmObject();
		}
	};
	protected CorporateActionProceedsDeliveryInstruction relatedCorporateAction;
	/**
	 * Corporate action processes which are the source of the payment
	 * obligation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction#mmCashProceedsMovement
	 * CorporateActionProceedsDeliveryInstruction.mmCashProceedsMovement}</li>
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
	public static final MMBusinessAssociationEnd mmRelatedCorporateAction = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedCorporateAction";
			definition = "Corporate action processes which are the source of the payment obligation.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction.mmCashProceedsMovement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction.mmObject();
		}
	};
	protected CollateralMovement relatedCollateralMovement;
	/**
	 * Collateral movement which is the source of the obligation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CollateralMovement#mmCashCollateralMovement
	 * CollateralMovement.mmCashCollateralMovement}</li>
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
	public static final MMBusinessAssociationEnd mmRelatedCollateralMovement = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedCollateralMovement";
			definition = "Collateral movement which is the source of the obligation.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CollateralMovement.mmCashCollateralMovement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CollateralMovement.mmObject();
		}
	};
	protected Demand paymentSourceUndertakingDemand;
	/**
	 * Undertaking demand which is the source of a payment obligation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Demand#mmPayment
	 * Demand.mmPayment}</li>
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
	public static final MMBusinessAssociationEnd mmPaymentSourceUndertakingDemand = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentSourceUndertakingDemand";
			definition = "Undertaking demand which is the source of a payment obligation.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Demand.mmPayment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Demand.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.PaymentObligationPartyRole> partyRole;
	/**
	 * Specifies each role linked to a payment obligation and played by a party
	 * at that step in a payment flow.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligationPartyRole#mmPaymentObligation
	 * PaymentObligationPartyRole.mmPaymentObligation}</li>
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
	public static final MMBusinessAssociationEnd mmPartyRole = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PartyRole";
			definition = "Specifies each role linked to a payment obligation and played by a party at that step in a payment flow.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentObligationPartyRole.mmPaymentObligation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PaymentObligationPartyRole.mmObject();
		}
	};
	protected SecuritiesTradeExecution executedSecuritiesTrade;
	/**
	 * Securities trade which created a payment flow.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#mmPaymentObligation
	 * SecuritiesTradeExecution.mmPaymentObligation}</li>
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
	public static final MMBusinessAssociationEnd mmExecutedSecuritiesTrade = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExecutedSecuritiesTrade";
			definition = "Securities trade which created a payment flow.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeExecution.mmPaymentObligation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeExecution.mmObject();
		}
	};
	protected CashAccountContract relatedAccountClosingTerms;
	/**
	 * Contract which authorises the transfer of funds resulting in a payment
	 * obligation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashAccountContract#mmBalanceTransfer
	 * CashAccountContract.mmBalanceTransfer}</li>
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
	public static final MMBusinessAssociationEnd mmRelatedAccountClosingTerms = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedAccountClosingTerms";
			definition = "Contract which authorises the transfer of funds resulting in a payment obligation.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CashAccountContract.mmBalanceTransfer;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashAccountContract.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.PortfolioTransfer> paymentSourcePortfolioTransfer;
	/**
	 * The PaymentObligation that specifies the payment resulting from charges
	 * due by one party to another.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer#mmPaymentObligation
	 * PortfolioTransfer.mmPaymentObligation}</li>
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
	public static final MMBusinessAssociationEnd mmPaymentSourcePortfolioTransfer = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PaymentSourcePortfolioTransfer";
			definition = "The PaymentObligation that specifies the payment resulting from charges due by one party to another.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PortfolioTransfer.mmPaymentObligation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PortfolioTransfer.mmObject();
		}
	};
	protected CurrencyOption paymentSourceCurrencyOption;
	/**
	 * The PaymentObligation that specifies the amount of the premium paid by
	 * the buyer of the option and its settlement place.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyOption#mmPremiumSettlement
	 * CurrencyOption.mmPremiumSettlement}</li>
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
	public static final MMBusinessAssociationEnd mmPaymentSourceCurrencyOption = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PaymentSourceCurrencyOption";
			definition = "The PaymentObligation that specifies the amount of the premium paid by the buyer of the option and its settlement place.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CurrencyOption.mmPremiumSettlement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CurrencyOption.mmObject();
		}
	};
	protected ForeignExchangeTrade exchangeRateInformation;
	/**
	 * Foreign exchange trade which is the source of the payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade#mmResultingSettlement
	 * ForeignExchangeTrade.mmResultingSettlement}</li>
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails25#mmFXAdditionalDetails
	 * SecuritiesTradeDetails25.mmFXAdditionalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails26#mmFXAdditionalDetails
	 * SecuritiesTradeDetails26.mmFXAdditionalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails27#mmFXAdditionalDetails
	 * SecuritiesTradeDetails27.mmFXAdditionalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails28#mmFXAdditionalDetails
	 * SecuritiesTradeDetails28.mmFXAdditionalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails6#mmFXAdditionalDetails
	 * SecuritiesTradeDetails6.mmFXAdditionalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails13#mmFXAdditionalDetails
	 * SecuritiesTradeDetails13.mmFXAdditionalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails3#mmFXAdditionalDetails
	 * SecuritiesTradeDetails3.mmFXAdditionalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails11#mmFXAdditionalDetails
	 * SecuritiesTradeDetails11.mmFXAdditionalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails2#mmFXAdditionalDetails
	 * SecuritiesTradeDetails2.mmFXAdditionalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails16#mmFXAdditionalDetails
	 * SecuritiesTradeDetails16.mmFXAdditionalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails1#mmFXAdditionalDetails
	 * SecuritiesTradeDetails1.mmFXAdditionalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails15#mmFXAdditionalDetails
	 * SecuritiesTradeDetails15.mmFXAdditionalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails31#mmFXAdditionalDetails
	 * SecuritiesTradeDetails31.mmFXAdditionalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails33#mmFXAdditionalDetails
	 * SecuritiesTradeDetails33.mmFXAdditionalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails38#mmFXAdditionalDetails
	 * SecuritiesTradeDetails38.mmFXAdditionalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails37#mmFXAdditionalDetails
	 * SecuritiesTradeDetails37.mmFXAdditionalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails34#mmFXAdditionalDetails
	 * SecuritiesTradeDetails34.mmFXAdditionalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails32#mmFXAdditionalDetails
	 * SecuritiesTradeDetails32.mmFXAdditionalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails44#mmFXAdditionalDetails
	 * SecuritiesTradeDetails44.mmFXAdditionalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails39#mmFXAdditionalDetails
	 * SecuritiesTradeDetails39.mmFXAdditionalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails43#mmFXAdditionalDetails
	 * SecuritiesTradeDetails43.mmFXAdditionalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails40#mmFXAdditionalDetails
	 * SecuritiesTradeDetails40.mmFXAdditionalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails46#mmFXAdditionalDetails
	 * SecuritiesTradeDetails46.mmFXAdditionalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails47#mmFXAdditionalDetails
	 * SecuritiesTradeDetails47.mmFXAdditionalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeContract1#mmExchangeRateInformation
	 * TradeContract1.mmExchangeRateInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SyndicatedLoan1#mmExchangeRateInformation
	 * SyndicatedLoan1.mmExchangeRateInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails51#mmFXAdditionalDetails
	 * SecuritiesTradeDetails51.mmFXAdditionalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails53#mmFXAdditionalDetails
	 * SecuritiesTradeDetails53.mmFXAdditionalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails55#mmFXAdditionalDetails
	 * SecuritiesTradeDetails55.mmFXAdditionalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails56#mmFXAdditionalDetails
	 * SecuritiesTradeDetails56.mmFXAdditionalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails52#mmFXAdditionalDetails
	 * SecuritiesTradeDetails52.mmFXAdditionalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails50#mmFXAdditionalDetails
	 * SecuritiesTradeDetails50.mmFXAdditionalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails59#mmFXAdditionalDetails
	 * SecuritiesTradeDetails59.mmFXAdditionalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails58#mmFXAdditionalDetails
	 * SecuritiesTradeDetails58.mmFXAdditionalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails63#mmFXAdditionalDetails
	 * SecuritiesTradeDetails63.mmFXAdditionalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails62#mmFXAdditionalDetails
	 * SecuritiesTradeDetails62.mmFXAdditionalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails65#mmFXAdditionalDetails
	 * SecuritiesTradeDetails65.mmFXAdditionalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails66#mmFXAdditionalDetails
	 * SecuritiesTradeDetails66.mmFXAdditionalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails67#mmFXAdditionalDetails
	 * SecuritiesTradeDetails67.mmFXAdditionalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails70#mmFXAdditionalDetails
	 * SecuritiesTradeDetails70.mmFXAdditionalDetails}</li>
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
	public static final MMBusinessAssociationEnd mmExchangeRateInformation = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(SecuritiesTradeDetails25.mmFXAdditionalDetails, SecuritiesTradeDetails26.mmFXAdditionalDetails, SecuritiesTradeDetails27.mmFXAdditionalDetails,
					SecuritiesTradeDetails28.mmFXAdditionalDetails, SecuritiesTradeDetails6.mmFXAdditionalDetails, SecuritiesTradeDetails13.mmFXAdditionalDetails, SecuritiesTradeDetails3.mmFXAdditionalDetails,
					SecuritiesTradeDetails11.mmFXAdditionalDetails, SecuritiesTradeDetails2.mmFXAdditionalDetails, SecuritiesTradeDetails16.mmFXAdditionalDetails, SecuritiesTradeDetails1.mmFXAdditionalDetails,
					SecuritiesTradeDetails15.mmFXAdditionalDetails, SecuritiesTradeDetails31.mmFXAdditionalDetails, SecuritiesTradeDetails33.mmFXAdditionalDetails, SecuritiesTradeDetails38.mmFXAdditionalDetails,
					SecuritiesTradeDetails37.mmFXAdditionalDetails, SecuritiesTradeDetails34.mmFXAdditionalDetails, SecuritiesTradeDetails32.mmFXAdditionalDetails, SecuritiesTradeDetails44.mmFXAdditionalDetails,
					SecuritiesTradeDetails39.mmFXAdditionalDetails, SecuritiesTradeDetails43.mmFXAdditionalDetails, SecuritiesTradeDetails40.mmFXAdditionalDetails, SecuritiesTradeDetails46.mmFXAdditionalDetails,
					SecuritiesTradeDetails47.mmFXAdditionalDetails, TradeContract1.mmExchangeRateInformation, SyndicatedLoan1.mmExchangeRateInformation, SecuritiesTradeDetails51.mmFXAdditionalDetails,
					SecuritiesTradeDetails53.mmFXAdditionalDetails, SecuritiesTradeDetails55.mmFXAdditionalDetails, SecuritiesTradeDetails56.mmFXAdditionalDetails, SecuritiesTradeDetails52.mmFXAdditionalDetails,
					SecuritiesTradeDetails50.mmFXAdditionalDetails, SecuritiesTradeDetails59.mmFXAdditionalDetails, SecuritiesTradeDetails58.mmFXAdditionalDetails, SecuritiesTradeDetails63.mmFXAdditionalDetails,
					SecuritiesTradeDetails62.mmFXAdditionalDetails, SecuritiesTradeDetails65.mmFXAdditionalDetails, SecuritiesTradeDetails66.mmFXAdditionalDetails, SecuritiesTradeDetails67.mmFXAdditionalDetails,
					SecuritiesTradeDetails70.mmFXAdditionalDetails);
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExchangeRateInformation";
			definition = "Foreign exchange trade which is the source of the payment.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ForeignExchangeTrade.mmResultingSettlement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ForeignExchangeTrade.mmObject();
		}
	};
	protected Dividend dividend;
	/**
	 * Dividend for which payment terms are specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Dividend#mmObligation
	 * Dividend.mmObligation}</li>
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
	public static final MMBusinessAssociationEnd mmDividend = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Dividend";
			definition = "Dividend for which payment terms are specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Dividend.mmObligation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Dividend.mmObject();
		}
	};
	protected RepurchaseAgreement repurchaseAgreement;
	/**
	 * Repurchase agreement which covers the delivery of cash by the buyer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RepurchaseAgreement#mmPaymentObligation
	 * RepurchaseAgreement.mmPaymentObligation}</li>
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
	public static final MMBusinessAssociationEnd mmRepurchaseAgreement = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RepurchaseAgreement";
			definition = "Repurchase agreement which covers the delivery of cash by the buyer.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.RepurchaseAgreement.mmPaymentObligation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.RepurchaseAgreement.mmObject();
		}
	};
	protected Assignment relatedAssignment;
	/**
	 * Assignment which contains one or more payment obligations.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Assignment#mmPaymentObligation
	 * Assignment.mmPaymentObligation}</li>
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
	public static final MMBusinessAssociationEnd mmRelatedAssignment = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedAssignment";
			definition = "Assignment which contains one or more payment obligations.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Assignment.mmPaymentObligation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Assignment.mmObject();
		}
	};
	protected BankingTransaction bankingTransaction;
	/**
	 * Transaction executed by the client of a financial institution from/to the
	 * account serviced by the financial institution, such as mortgage payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BankingTransaction#mmPaymentObligation
	 * BankingTransaction.mmPaymentObligation}</li>
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
	public static final MMBusinessAssociationEnd mmBankingTransaction = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BankingTransaction";
			definition = "Transaction executed by the client of a financial institution from/to the account serviced by the financial institution, such as mortgage payment.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.BankingTransaction.mmPaymentObligation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.BankingTransaction.mmObject();
		}
	};
	protected PaymentTerms paymentTerms;
	/**
	 * Specifies the payment terms of the obligation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentTerms#mmRelatedPaymentObligation
	 * PaymentTerms.mmRelatedPaymentObligation}</li>
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
	 * {@linkplain com.tools20022.repository.msg.PaymentTerms1#mmOtherPaymentTerms
	 * PaymentTerms1.mmOtherPaymentTerms}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTerms1#mmPaymentCode
	 * PaymentTerms1.mmPaymentCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTerms2#mmPaymentCode
	 * PaymentTerms2.mmPaymentCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeContract1#mmPaymentSchedule
	 * TradeContract1.mmPaymentSchedule}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LoanContract1#mmPaymentSchedule
	 * LoanContract1.mmPaymentSchedule}</li>
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
	public static final MMBusinessAssociationEnd mmPaymentTerms = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(PaymentTerms1.mmOtherPaymentTerms, PaymentTerms1.mmPaymentCode, PaymentTerms2.mmPaymentCode, TradeContract1.mmPaymentSchedule, LoanContract1.mmPaymentSchedule);
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PaymentTerms";
			definition = "Specifies the payment terms of the obligation.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentTerms.mmRelatedPaymentObligation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PaymentTerms.mmObject();
		}
	};
	protected ISODate paymentDueDate;
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
	 * {@linkplain com.tools20022.repository.msg.PremiumAmount1#mmSettlementDate
	 * PremiumAmount1.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PremiumAmount2#mmSettlementDate
	 * PremiumAmount2.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvoiceTotals1#mmPaymentDueDate
	 * InvoiceTotals1.mmPaymentDueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Instalment1#mmPaymentDueDate
	 * Instalment1.mmPaymentDueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalInvoiceInformation1#mmPaymentDueDate
	 * OriginalInvoiceInformation1.mmPaymentDueDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentTerms3#mmDueDate
	 * PaymentTerms3.mmDueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvoiceTotals2#mmPaymentDueDate
	 * InvoiceTotals2.mmPaymentDueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentCodeOrOther2Choice#mmPaymentDueDate
	 * PaymentCodeOrOther2Choice.mmPaymentDueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Instalment2#mmPaymentDueDate
	 * Instalment2.mmPaymentDueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionCertificateContract1#mmExpectedAdvancePaymentReturnDate
	 * TransactionCertificateContract1.mmExpectedAdvancePaymentReturnDate}</li>
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
	public static final MMBusinessAttribute mmPaymentDueDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(PremiumAmount1.mmSettlementDate, PremiumAmount2.mmSettlementDate, InvoiceTotals1.mmPaymentDueDate, Instalment1.mmPaymentDueDate, OriginalInvoiceInformation1.mmPaymentDueDate,
					PaymentTerms3.mmDueDate, InvoiceTotals2.mmPaymentDueDate, PaymentCodeOrOther2Choice.mmPaymentDueDate, Instalment2.mmPaymentDueDate, TransactionCertificateContract1.mmExpectedAdvancePaymentReturnDate);
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PaymentDueDate";
			definition = "Due date for the payment.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PaymentObligation.class.getMethod("getPaymentDueDate", new Class[]{});
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
				name = "PaymentObligation";
				definition = "Obligation for the debtor to pay the creditor an amount of cash.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Dividend.mmObligation, com.tools20022.repository.entity.ContactPoint.mmRemittanceRelatedPayment,
						com.tools20022.repository.entity.Document.mmPaymentObligation, com.tools20022.repository.entity.Payment.mmPaymentObligation, com.tools20022.repository.entity.PortfolioTransfer.mmPaymentObligation,
						com.tools20022.repository.entity.CashAccountContract.mmBalanceTransfer, com.tools20022.repository.entity.SecuritiesTradeExecution.mmPaymentObligation,
						com.tools20022.repository.entity.ForeignExchangeTrade.mmResultingSettlement, com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction.mmCashProceedsMovement,
						com.tools20022.repository.entity.PaymentObligationPartyRole.mmPaymentObligation, com.tools20022.repository.entity.Demand.mmPayment, com.tools20022.repository.entity.CurrencyOption.mmPremiumSettlement,
						com.tools20022.repository.entity.CommercialTrade.mmPaymentObligation, com.tools20022.repository.entity.CollateralMovement.mmCashCollateralMovement, com.tools20022.repository.entity.BuyIn.mmCashCompensation,
						com.tools20022.repository.entity.BankingTransaction.mmPaymentObligation, com.tools20022.repository.entity.RepurchaseAgreement.mmPaymentObligation, com.tools20022.repository.entity.Assignment.mmPaymentObligation,
						com.tools20022.repository.entity.PaymentTerms.mmRelatedPaymentObligation, com.tools20022.repository.entity.InterestManagement.mmPaymentObligation);
				derivationElement_lazy = () -> Arrays.asList(PaymentObligation1.mmPaymentTerms, PaymentObligation2.mmPaymentTerms);
				subType_lazy = () -> Arrays.asList(Instalment.mmObject(), Garnishment.mmObject());
				superType_lazy = () -> Obligation.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PaymentObligation.mmPaymentOffset, com.tools20022.repository.entity.PaymentObligation.mmPurpose,
						com.tools20022.repository.entity.PaymentObligation.mmRemittanceDeliveryMethod, com.tools20022.repository.entity.PaymentObligation.mmAssociatedDocument, com.tools20022.repository.entity.PaymentObligation.mmAmount,
						com.tools20022.repository.entity.PaymentObligation.mmRemittanceLocation, com.tools20022.repository.entity.PaymentObligation.mmInterest, com.tools20022.repository.entity.PaymentObligation.mmCommercialTrade,
						com.tools20022.repository.entity.PaymentObligation.mmPercentage, com.tools20022.repository.entity.PaymentObligation.mmMaximumAmount, com.tools20022.repository.entity.PaymentObligation.mmExpiryDate,
						com.tools20022.repository.entity.PaymentObligation.mmApplicableLaw, com.tools20022.repository.entity.PaymentObligation.mmPaymentSourceBuyIn,
						com.tools20022.repository.entity.PaymentObligation.mmRelatedCorporateAction, com.tools20022.repository.entity.PaymentObligation.mmRelatedCollateralMovement,
						com.tools20022.repository.entity.PaymentObligation.mmPaymentSourceUndertakingDemand, com.tools20022.repository.entity.PaymentObligation.mmPartyRole,
						com.tools20022.repository.entity.PaymentObligation.mmExecutedSecuritiesTrade, com.tools20022.repository.entity.PaymentObligation.mmRelatedAccountClosingTerms,
						com.tools20022.repository.entity.PaymentObligation.mmPaymentSourcePortfolioTransfer, com.tools20022.repository.entity.PaymentObligation.mmPaymentSourceCurrencyOption,
						com.tools20022.repository.entity.PaymentObligation.mmExchangeRateInformation, com.tools20022.repository.entity.PaymentObligation.mmDividend, com.tools20022.repository.entity.PaymentObligation.mmRepurchaseAgreement,
						com.tools20022.repository.entity.PaymentObligation.mmRelatedAssignment, com.tools20022.repository.entity.PaymentObligation.mmBankingTransaction, com.tools20022.repository.entity.PaymentObligation.mmPaymentTerms,
						com.tools20022.repository.entity.PaymentObligation.mmPaymentDueDate);
				derivationComponent_lazy = () -> Arrays.asList(Purpose1Choice.mmObject(), Purpose2Choice.mmObject(), PurposeChoice.mmObject(), SettlementData1.mmObject(), SettlementData2.mmObject(), PaymentTerms3.mmObject(),
						PaymentTerms1.mmObject(), PaymentTerms2.mmObject(), PaymentObligation1.mmObject(), PaymentObligation2.mmObject(), PaymentTerms4.mmObject(), PaymentTerms5.mmObject(), Purpose3Choice.mmObject(),
						PaymentTerms6.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return PaymentObligation.class;
			}
		});
		return mmObject_lazy.get();
	}

	public List<Payment> getPaymentOffset() {
		return paymentOffset;
	}

	public void setPaymentOffset(List<com.tools20022.repository.entity.Payment> paymentOffset) {
		this.paymentOffset = paymentOffset;
	}

	public PaymentPurposeCode getPurpose() {
		return purpose;
	}

	public void setPurpose(PaymentPurposeCode purpose) {
		this.purpose = purpose;
	}

	public RemittanceLocationMethodCode getRemittanceDeliveryMethod() {
		return remittanceDeliveryMethod;
	}

	public void setRemittanceDeliveryMethod(RemittanceLocationMethodCode remittanceDeliveryMethod) {
		this.remittanceDeliveryMethod = remittanceDeliveryMethod;
	}

	public List<Document> getAssociatedDocument() {
		return associatedDocument;
	}

	public void setAssociatedDocument(List<com.tools20022.repository.entity.Document> associatedDocument) {
		this.associatedDocument = associatedDocument;
	}

	public CurrencyAndAmount getAmount() {
		return amount;
	}

	public void setAmount(CurrencyAndAmount amount) {
		this.amount = amount;
	}

	public List<ContactPoint> getRemittanceLocation() {
		return remittanceLocation;
	}

	public void setRemittanceLocation(List<com.tools20022.repository.entity.ContactPoint> remittanceLocation) {
		this.remittanceLocation = remittanceLocation;
	}

	public List<InterestManagement> getInterest() {
		return interest;
	}

	public void setInterest(List<com.tools20022.repository.entity.InterestManagement> interest) {
		this.interest = interest;
	}

	public CommercialTrade getCommercialTrade() {
		return commercialTrade;
	}

	public void setCommercialTrade(com.tools20022.repository.entity.CommercialTrade commercialTrade) {
		this.commercialTrade = commercialTrade;
	}

	public PercentageRate getPercentage() {
		return percentage;
	}

	public void setPercentage(PercentageRate percentage) {
		this.percentage = percentage;
	}

	public CurrencyAndAmount getMaximumAmount() {
		return maximumAmount;
	}

	public void setMaximumAmount(CurrencyAndAmount maximumAmount) {
		this.maximumAmount = maximumAmount;
	}

	public ISODateTime getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(ISODateTime expiryDate) {
		this.expiryDate = expiryDate;
	}

	public CountryCode getApplicableLaw() {
		return applicableLaw;
	}

	public void setApplicableLaw(CountryCode applicableLaw) {
		this.applicableLaw = applicableLaw;
	}

	public BuyIn getPaymentSourceBuyIn() {
		return paymentSourceBuyIn;
	}

	public void setPaymentSourceBuyIn(com.tools20022.repository.entity.BuyIn paymentSourceBuyIn) {
		this.paymentSourceBuyIn = paymentSourceBuyIn;
	}

	public CorporateActionProceedsDeliveryInstruction getRelatedCorporateAction() {
		return relatedCorporateAction;
	}

	public void setRelatedCorporateAction(com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction relatedCorporateAction) {
		this.relatedCorporateAction = relatedCorporateAction;
	}

	public CollateralMovement getRelatedCollateralMovement() {
		return relatedCollateralMovement;
	}

	public void setRelatedCollateralMovement(com.tools20022.repository.entity.CollateralMovement relatedCollateralMovement) {
		this.relatedCollateralMovement = relatedCollateralMovement;
	}

	public Demand getPaymentSourceUndertakingDemand() {
		return paymentSourceUndertakingDemand;
	}

	public void setPaymentSourceUndertakingDemand(com.tools20022.repository.entity.Demand paymentSourceUndertakingDemand) {
		this.paymentSourceUndertakingDemand = paymentSourceUndertakingDemand;
	}

	public List<PaymentObligationPartyRole> getPartyRole() {
		return partyRole;
	}

	public void setPartyRole(List<com.tools20022.repository.entity.PaymentObligationPartyRole> partyRole) {
		this.partyRole = partyRole;
	}

	public SecuritiesTradeExecution getExecutedSecuritiesTrade() {
		return executedSecuritiesTrade;
	}

	public void setExecutedSecuritiesTrade(com.tools20022.repository.entity.SecuritiesTradeExecution executedSecuritiesTrade) {
		this.executedSecuritiesTrade = executedSecuritiesTrade;
	}

	public CashAccountContract getRelatedAccountClosingTerms() {
		return relatedAccountClosingTerms;
	}

	public void setRelatedAccountClosingTerms(com.tools20022.repository.entity.CashAccountContract relatedAccountClosingTerms) {
		this.relatedAccountClosingTerms = relatedAccountClosingTerms;
	}

	public List<PortfolioTransfer> getPaymentSourcePortfolioTransfer() {
		return paymentSourcePortfolioTransfer;
	}

	public void setPaymentSourcePortfolioTransfer(List<com.tools20022.repository.entity.PortfolioTransfer> paymentSourcePortfolioTransfer) {
		this.paymentSourcePortfolioTransfer = paymentSourcePortfolioTransfer;
	}

	public CurrencyOption getPaymentSourceCurrencyOption() {
		return paymentSourceCurrencyOption;
	}

	public void setPaymentSourceCurrencyOption(com.tools20022.repository.entity.CurrencyOption paymentSourceCurrencyOption) {
		this.paymentSourceCurrencyOption = paymentSourceCurrencyOption;
	}

	public ForeignExchangeTrade getExchangeRateInformation() {
		return exchangeRateInformation;
	}

	public void setExchangeRateInformation(com.tools20022.repository.entity.ForeignExchangeTrade exchangeRateInformation) {
		this.exchangeRateInformation = exchangeRateInformation;
	}

	public Dividend getDividend() {
		return dividend;
	}

	public void setDividend(com.tools20022.repository.entity.Dividend dividend) {
		this.dividend = dividend;
	}

	public RepurchaseAgreement getRepurchaseAgreement() {
		return repurchaseAgreement;
	}

	public void setRepurchaseAgreement(com.tools20022.repository.entity.RepurchaseAgreement repurchaseAgreement) {
		this.repurchaseAgreement = repurchaseAgreement;
	}

	public Assignment getRelatedAssignment() {
		return relatedAssignment;
	}

	public void setRelatedAssignment(com.tools20022.repository.entity.Assignment relatedAssignment) {
		this.relatedAssignment = relatedAssignment;
	}

	public BankingTransaction getBankingTransaction() {
		return bankingTransaction;
	}

	public void setBankingTransaction(com.tools20022.repository.entity.BankingTransaction bankingTransaction) {
		this.bankingTransaction = bankingTransaction;
	}

	public PaymentTerms getPaymentTerms() {
		return paymentTerms;
	}

	public void setPaymentTerms(com.tools20022.repository.entity.PaymentTerms paymentTerms) {
		this.paymentTerms = paymentTerms;
	}

	public ISODate getPaymentDueDate() {
		return paymentDueDate;
	}

	public void setPaymentDueDate(ISODate paymentDueDate) {
		this.paymentDueDate = paymentDueDate;
	}
}