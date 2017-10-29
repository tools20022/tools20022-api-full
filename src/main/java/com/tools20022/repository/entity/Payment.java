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
import com.tools20022.repository.datatype.ImpliedCurrencyAndAmount;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.entity.ObligationFulfilment;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Payment information and processes required to transfer cash end to end from
 * the debtor to the creditor.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Payment" src="doc-files/Payment.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#PaymentObligation
 * Payment.PaymentObligation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#CurrencyOfTransfer
 * Payment.CurrencyOfTransfer}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#CreditMethod
 * Payment.CreditMethod}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#Type Payment.Type}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#InstructedAmount
 * Payment.InstructedAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#Priority
 * Payment.Priority}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#ValueDate
 * Payment.ValueDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#PaymentStatus
 * Payment.PaymentStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#PartyRole
 * Payment.PartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#TaxOnPayment
 * Payment.TaxOnPayment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#PaymentExecution
 * Payment.PaymentExecution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Payment#PoolingAdjustmentDate
 * Payment.PoolingAdjustmentDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#EquivalentAmount
 * Payment.EquivalentAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#CurrencyExchange
 * Payment.CurrencyExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Payment#InstructionForCreditorAgent
 * Payment.InstructionForCreditorAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Payment#InstructionForDebtorAgent
 * Payment.InstructionForDebtorAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Payment#PaymentRelatedIdentifications
 * Payment.PaymentRelatedIdentifications}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Payment#RelatedInvestigationCase
 * Payment.RelatedInvestigationCase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Payment#SettlementTimeRequest
 * Payment.SettlementTimeRequest}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#Amount
 * Payment.Amount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#TradeSettlement
 * Payment.TradeSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Payment#StandardSettlementInstructions
 * Payment.StandardSettlementInstructions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Payment#RelatedDebitAuthorisation
 * Payment.RelatedDebitAuthorisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Payment#RelatedInvestigationCaseResolution
 * Payment.RelatedInvestigationCaseResolution}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#OriginalPayment
 * Payment.OriginalPayment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#ReturnPayment
 * Payment.ReturnPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Payment#RelatedSecuritiesSettlement
 * Payment.RelatedSecuritiesSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Payment#InvoiceReconciliation
 * Payment.InvoiceReconciliation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#PaymentInstrument
 * Payment.PaymentInstrument}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#Account
 * Payment.Account}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#Adjustments
 * Payment.Adjustments}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Payment#ContractRegistration
 * Payment.ContractRegistration}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.CashAccount#Payment
 * CashAccount.Payment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Tax#RelatedPaymentSettlement
 * Tax.RelatedPaymentSettlement}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Adjustment#Payment
 * Adjustment.Payment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#PaymentOffset
 * PaymentObligation.PaymentOffset}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#OriginalPayment
 * Payment.OriginalPayment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#ReturnPayment
 * Payment.ReturnPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CreditInstrument#RelatedPayment
 * CreditInstrument.RelatedPayment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentExecution#Payment
 * PaymentExecution.Payment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentIdentification#Payment
 * PaymentIdentification.Payment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentPartyRole#Payment
 * PaymentPartyRole.Payment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentStatus#Payment
 * PaymentStatus.Payment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#Payment
 * SecuritiesSettlement.Payment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#RelatedPayment
 * CurrencyExchange.RelatedPayment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Invoice#Payment
 * Invoice.Payment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCase#UnderlyingPayment
 * PaymentInvestigationCase.UnderlyingPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SettlementTimeRequest#Payment
 * SettlementTimeRequest.Payment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DebitAuthorisation#AuthorisedReturn
 * DebitAuthorisation.AuthorisedReturn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseResolution#PaymentCorrection
 * PaymentInvestigationCaseResolution.PaymentCorrection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CommercialTradeSettlement#Payment
 * CommercialTradeSettlement.Payment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RegisteredContract#RelatedPayment
 * RegisteredContract.RelatedPayment}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation1#SubscriptionPaymentInstrument
 * InvestmentFundCashSettlementInformation1.SubscriptionPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation1#RedemptionPaymentInstrument
 * InvestmentFundCashSettlementInformation1.RedemptionPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation1#DividendPaymentInstrument
 * InvestmentFundCashSettlementInformation1.DividendPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation1#SavingsPlanPaymentInstrument
 * InvestmentFundCashSettlementInformation1.SavingsPlanPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation3#SubscriptionPaymentInstrument
 * InvestmentFundCashSettlementInformation3.SubscriptionPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation3#RedemptionPaymentInstrument
 * InvestmentFundCashSettlementInformation3.RedemptionPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation3#DividendPaymentInstrument
 * InvestmentFundCashSettlementInformation3.DividendPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation3#SavingsPlanPaymentInstrument
 * InvestmentFundCashSettlementInformation3.SavingsPlanPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation5#SubscriptionPaymentInstrument
 * InvestmentFundCashSettlementInformation5.SubscriptionPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation5#RedemptionPaymentInstrument
 * InvestmentFundCashSettlementInformation5.RedemptionPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation5#DividendPaymentInstrument
 * InvestmentFundCashSettlementInformation5.DividendPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation5#SavingsPlanPaymentInstrument
 * InvestmentFundCashSettlementInformation5.SavingsPlanPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation5#InterestPaymentInstrument
 * InvestmentFundCashSettlementInformation5.InterestPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation2#SubscriptionPaymentInstrument
 * InvestmentFundCashSettlementInformation2.SubscriptionPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation2#RedemptionPaymentInstrument
 * InvestmentFundCashSettlementInformation2.RedemptionPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation2#DividendPaymentInstrument
 * InvestmentFundCashSettlementInformation2.DividendPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation2#SavingsPlanPaymentInstrument
 * InvestmentFundCashSettlementInformation2.SavingsPlanPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation4#SubscriptionPaymentInstrument
 * InvestmentFundCashSettlementInformation4.SubscriptionPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation4#RedemptionPaymentInstrument
 * InvestmentFundCashSettlementInformation4.RedemptionPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation4#DividendPaymentInstrument
 * InvestmentFundCashSettlementInformation4.DividendPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation4#SavingsPlanPaymentInstrument
 * InvestmentFundCashSettlementInformation4.SavingsPlanPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation6#SubscriptionPaymentInstrument
 * InvestmentFundCashSettlementInformation6.SubscriptionPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation6#RedemptionPaymentInstrument
 * InvestmentFundCashSettlementInformation6.RedemptionPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation6#DividendPaymentInstrument
 * InvestmentFundCashSettlementInformation6.DividendPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation6#SavingsPlanPaymentInstrument
 * InvestmentFundCashSettlementInformation6.SavingsPlanPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation6#InterestPaymentInstrument
 * InvestmentFundCashSettlementInformation6.InterestPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionReportDetails3#Transaction
 * TransactionReportDetails3.Transaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionReportDetails4#Transaction
 * TransactionReportDetails4.Transaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionReportDetails5#Transaction
 * TransactionReportDetails5.Transaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation3#OriginalTransactionReference
 * PaymentTransactionInformation3.OriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation30#OriginalTransactionReference
 * PaymentTransactionInformation30.OriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInformation4#OriginalGroupInformation
 * OriginalPaymentInformation4.OriginalGroupInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInformation4#TransactionInformation
 * OriginalPaymentInformation4.TransactionInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction37#OriginalTransactionReference
 * PaymentTransaction37.OriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction4#OriginalGroupInformation
 * OriginalPaymentInstruction4.OriginalGroupInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction4#TransactionInformation
 * OriginalPaymentInstruction4.TransactionInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction47#OriginalTransactionReference
 * PaymentTransaction47.OriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction8#OriginalGroupInformation
 * OriginalPaymentInstruction8.OriginalGroupInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction8#TransactionInformation
 * OriginalPaymentInstruction8.TransactionInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation4#OriginalTransactionReference
 * PaymentTransactionInformation4.OriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation28#OriginalTransactionReference
 * PaymentTransactionInformation28.OriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInformation2#TransactionInformation
 * OriginalPaymentInformation2.TransactionInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction35#OriginalTransactionReference
 * PaymentTransaction35.OriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction2#TransactionInformation
 * OriginalPaymentInstruction2.TransactionInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction42#OriginalTransactionReference
 * PaymentTransaction42.OriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction7#TransactionInformation
 * OriginalPaymentInstruction7.TransactionInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation1#OriginalTransactionReference
 * PaymentTransactionInformation1.OriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation25#OriginalTransactionReference
 * PaymentTransactionInformation25.OriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInformation1#TransactionInformationAndStatus
 * OriginalPaymentInformation1.TransactionInformationAndStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction32#OriginalTransactionReference
 * PaymentTransaction32.OriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction1#TransactionInformationAndStatus
 * OriginalPaymentInstruction1.TransactionInformationAndStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction46#OriginalTransactionReference
 * PaymentTransaction46.OriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction6#TransactionInformationAndStatus
 * OriginalPaymentInstruction6.TransactionInformationAndStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation31#OriginalTransactionReference
 * PaymentTransactionInformation31.OriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction38#OriginalTransactionReference
 * PaymentTransaction38.OriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction48#OriginalTransactionReference
 * PaymentTransaction48.OriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation5#OriginalTransactionReference
 * PaymentTransactionInformation5.OriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation29#OriginalTransactionReference
 * PaymentTransactionInformation29.OriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction36#OriginalTransactionReference
 * PaymentTransaction36.OriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction45#OriginalTransactionReference
 * PaymentTransaction45.OriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation26#OriginalTransactionReference
 * PaymentTransactionInformation26.OriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction33#OriginalTransactionReference
 * PaymentTransaction33.OriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction43#OriginalTransactionReference
 * PaymentTransaction43.OriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation2#OriginalTransactionReference
 * PaymentTransactionInformation2.OriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation27#OriginalTransactionReference
 * PaymentTransactionInformation27.OriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction34#OriginalTransactionReference
 * PaymentTransaction34.OriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction44#OriginalTransactionReference
 * PaymentTransaction44.OriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation34#OriginalTransactionReference
 * PaymentTransactionInformation34.OriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInformation5#TransactionInformationAndStatus
 * OriginalPaymentInformation5.TransactionInformationAndStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction41#OriginalTransactionReference
 * PaymentTransaction41.OriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction5#TransactionInformationAndStatus
 * OriginalPaymentInstruction5.TransactionInformationAndStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction49#OriginalTransactionReference
 * PaymentTransaction49.OriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction9#TransactionInformationAndStatus
 * OriginalPaymentInstruction9.TransactionInformationAndStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction18#PaymentInstrument
 * PaymentTransaction18.PaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction15#PaymentInstrument
 * PaymentTransaction15.PaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction21#PaymentInstrument
 * PaymentTransaction21.PaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction22#PaymentInstrument
 * PaymentTransaction22.PaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction17#PaymentInstrument
 * PaymentTransaction17.PaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction19#PaymentInstrument
 * PaymentTransaction19.PaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction23#PaymentInstrument
 * PaymentTransaction23.PaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction16#PaymentInstrument
 * PaymentTransaction16.PaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction13#PaymentInstrument
 * PaymentTransaction13.PaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction24#PaymentInstrument
 * PaymentTransaction24.PaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CashInOrOut4Choice#CashInPaymentInstrument
 * CashInOrOut4Choice.CashInPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CashInOrOut4Choice#CashOutPaymentInstrument
 * CashInOrOut4Choice.CashOutPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction20#CashInOrOut
 * PaymentTransaction20.CashInOrOut}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CashInOrOut5Choice#CashInPaymentInstrument
 * CashInOrOut5Choice.CashInPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CashInOrOut5Choice#CashOutPaymentInstrument
 * CashInOrOut5Choice.CashOutPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction25#CashInOrOut
 * PaymentTransaction25.CashInOrOut}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CashInOrOut3Choice#CashInPaymentInstrument
 * CashInOrOut3Choice.CashInPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CashInOrOut3Choice#CashOutPaymentInstrument
 * CashInOrOut3Choice.CashOutPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction14#CashInOrOutChoice
 * PaymentTransaction14.CashInOrOutChoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CashInOrOut6Choice#CashInPaymentInstrument
 * CashInOrOut6Choice.CashInPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CashInOrOut6Choice#CashOutPaymentInstrument
 * CashInOrOut6Choice.CashOutPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction26#CashInOrOut
 * PaymentTransaction26.CashInOrOut}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference14#OriginalTransaction
 * OriginalTransactionReference14.OriginalTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference18#OriginalTransaction
 * OriginalTransactionReference18.OriginalTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalItem2#OriginalItemReference
 * OriginalItem2.OriginalItemReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalItemAndStatus2#OriginalItemReference
 * OriginalItemAndStatus2.OriginalItemReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.UnderlyingTransaction1Choice#Interbank
 * UnderlyingTransaction1Choice.Interbank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation32#OriginalTransactionReference
 * PaymentTransactionInformation32.OriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInformation3#OriginalGroupInformation
 * OriginalPaymentInformation3.OriginalGroupInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInformation3#TransactionInformationAndStatus
 * OriginalPaymentInformation3.TransactionInformationAndStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation33#OriginalTransactionReference
 * PaymentTransactionInformation33.OriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorrectiveTransaction1Choice#Interbank
 * CorrectiveTransaction1Choice.Interbank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.UnderlyingTransaction2Choice#Interbank
 * UnderlyingTransaction2Choice.Interbank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction39#OriginalTransactionReference
 * PaymentTransaction39.OriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction3#OriginalGroupInformation
 * OriginalPaymentInstruction3.OriginalGroupInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction3#TransactionInformationAndStatus
 * OriginalPaymentInstruction3.TransactionInformationAndStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction40#OriginalTransactionReference
 * PaymentTransaction40.OriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalItem3#OriginalItemReference
 * OriginalItem3.OriginalItemReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalItemAndStatus3#OriginalItemReference
 * OriginalItemAndStatus3.OriginalItemReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation13#OriginalTransactionReference
 * PaymentTransactionInformation13.OriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation18#OriginalTransactionReference
 * PaymentTransactionInformation18.OriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation15#OriginalTransactionReference
 * PaymentTransactionInformation15.OriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation22#OriginalTransactionReference
 * PaymentTransactionInformation22.OriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation12#OriginalTransactionReference
 * PaymentTransactionInformation12.OriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation19#OriginalTransactionReference
 * PaymentTransactionInformation19.OriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation14#OriginalTransactionReference
 * PaymentTransactionInformation14.OriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation20#OriginalTransactionReference
 * PaymentTransactionInformation20.OriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation16#OriginalTransactionReference
 * PaymentTransactionInformation16.OriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation23#OriginalTransactionReference
 * PaymentTransactionInformation23.OriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation17#OriginalTransactionReference
 * PaymentTransactionInformation17.OriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation24#OriginalTransactionReference
 * PaymentTransactionInformation24.OriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation21#OriginalTransactionReference
 * PaymentTransactionInformation21.OriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction30#PaymentInstrument
 * PaymentTransaction30.PaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction28#PaymentInstrument
 * PaymentTransaction28.PaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction31#PaymentInstrument
 * PaymentTransaction31.PaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation7#SubscriptionPaymentInstrument
 * InvestmentFundCashSettlementInformation7.SubscriptionPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation7#RedemptionPaymentInstrument
 * InvestmentFundCashSettlementInformation7.RedemptionPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation7#DividendPaymentInstrument
 * InvestmentFundCashSettlementInformation7.DividendPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation7#SavingsPlanPaymentInstrument
 * InvestmentFundCashSettlementInformation7.SavingsPlanPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation7#InterestPaymentInstrument
 * InvestmentFundCashSettlementInformation7.InterestPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation8#SubscriptionPaymentInstrument
 * InvestmentFundCashSettlementInformation8.SubscriptionPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation8#RedemptionPaymentInstrument
 * InvestmentFundCashSettlementInformation8.RedemptionPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation8#DividendPaymentInstrument
 * InvestmentFundCashSettlementInformation8.DividendPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation8#SavingsPlanPaymentInstrument
 * InvestmentFundCashSettlementInformation8.SavingsPlanPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation8#InterestPaymentInstrument
 * InvestmentFundCashSettlementInformation8.InterestPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentCodeOrOther1Choice#PaymentCode
 * PaymentCodeOrOther1Choice.PaymentCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInformation6#Amount
 * OriginalPaymentInformation6.Amount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction50#OriginalTransactionReference
 * PaymentTransaction50.OriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction12#TransactionInformationAndStatus
 * OriginalPaymentInstruction12.TransactionInformationAndStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction11#TransactionInformation
 * OriginalPaymentInstruction11.TransactionInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction52#OriginalTransactionReference
 * PaymentTransaction52.OriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction51#OriginalTransactionReference
 * PaymentTransaction51.OriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalItem4#OriginalItemReference
 * OriginalItem4.OriginalItemReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction13#OriginalGroupInformation
 * OriginalPaymentInstruction13.OriginalGroupInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction13#TransactionInformation
 * OriginalPaymentInstruction13.TransactionInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction58#OriginalTransactionReference
 * PaymentTransaction58.OriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction10#OriginalGroupInformation
 * OriginalPaymentInstruction10.OriginalGroupInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction10#TransactionInformationAndStatus
 * OriginalPaymentInstruction10.TransactionInformationAndStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction54#OriginalTransactionReference
 * PaymentTransaction54.OriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalItemAndStatus4#OriginalItemReference
 * OriginalItemAndStatus4.OriginalItemReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction53#OriginalTransactionReference
 * PaymentTransaction53.OriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction57#OriginalTransactionReference
 * PaymentTransaction57.OriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction56#OriginalTransactionReference
 * PaymentTransaction56.OriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction55#OriginalTransactionReference
 * PaymentTransaction55.OriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction14#TransactionInformationAndStatus
 * OriginalPaymentInstruction14.TransactionInformationAndStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction59#OriginalTransactionReference
 * PaymentTransaction59.OriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ContractRegistrationStatement1#TransactionJournal
 * ContractRegistrationStatement1.TransactionJournal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionCertificateRecord1#Transaction
 * TransactionCertificateRecord1.Transaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction16#TransactionInformation
 * OriginalPaymentInstruction16.TransactionInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction18#TransactionInformationAndStatus
 * OriginalPaymentInstruction18.TransactionInformationAndStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction65#OriginalTransactionReference
 * PaymentTransaction65.OriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction63#OriginalTransactionReference
 * PaymentTransaction63.OriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction60#OriginalTransactionReference
 * PaymentTransaction60.OriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction68#OriginalTransactionReference
 * PaymentTransaction68.OriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction61#OriginalTransactionReference
 * PaymentTransaction61.OriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction15#OriginalGroupInformation
 * OriginalPaymentInstruction15.OriginalGroupInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction15#TransactionInformation
 * OriginalPaymentInstruction15.TransactionInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalItem5#OriginalItemReference
 * OriginalItem5.OriginalItemReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalItemAndStatus5#OriginalItemReference
 * OriginalItemAndStatus5.OriginalItemReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction66#OriginalTransactionReference
 * PaymentTransaction66.OriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction67#OriginalTransactionReference
 * PaymentTransaction67.OriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction62#OriginalTransactionReference
 * PaymentTransaction62.OriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction64#OriginalTransactionReference
 * PaymentTransaction64.OriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction17#OriginalGroupInformation
 * OriginalPaymentInstruction17.OriginalGroupInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction17#TransactionInformationAndStatus
 * OriginalPaymentInstruction17.TransactionInformationAndStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashSettlement1#OtherCashSettlementDetails
 * CashSettlement1.OtherCashSettlementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashSettlement2#OtherCashSettlementDetails
 * CashSettlement2.OtherCashSettlementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstrument13#SubscriptionPaymentInstrument
 * PaymentInstrument13.SubscriptionPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstrument13#RedemptionPaymentInstrument
 * PaymentInstrument13.RedemptionPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstrument13#DividendPaymentInstrument
 * PaymentInstrument13.DividendPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstrument13#SavingsPlanPaymentInstrument
 * PaymentInstrument13.SavingsPlanPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstrument13#InterestPaymentInstrument
 * PaymentInstrument13.InterestPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction19#TransactionInformationAndStatus
 * OriginalPaymentInstruction19.TransactionInformationAndStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction69#OriginalTransactionReference
 * PaymentTransaction69.OriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction72#PaymentInstrument
 * PaymentTransaction72.PaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction70#PaymentInstrument
 * PaymentTransaction70.PaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction71#CashInOrOut
 * PaymentTransaction71.CashInOrOut}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CashInOrOut7Choice#CashInPaymentInstrument
 * CashInOrOut7Choice.CashInPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CashInOrOut7Choice#CashOutPaymentInstrument
 * CashInOrOut7Choice.CashOutPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.UnderlyingTransaction3Choice#Interbank
 * UnderlyingTransaction3Choice.Interbank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction80#OriginalTransactionReference
 * PaymentTransaction80.OriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction81#OriginalTransactionReference
 * PaymentTransaction81.OriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction23#TransactionInformationAndStatus
 * OriginalPaymentInstruction23.TransactionInformationAndStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction21#TransactionInformation
 * OriginalPaymentInstruction21.TransactionInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction24#TransactionInformationAndStatus
 * OriginalPaymentInstruction24.TransactionInformationAndStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction76#OriginalTransactionReference
 * PaymentTransaction76.OriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorrectiveTransaction2Choice#Interbank
 * CorrectiveTransaction2Choice.Interbank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction22#OriginalGroupInformation
 * OriginalPaymentInstruction22.OriginalGroupInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction22#TransactionInformationAndStatus
 * OriginalPaymentInstruction22.TransactionInformationAndStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction78#OriginalTransactionReference
 * PaymentTransaction78.OriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction20#OriginalGroupInformation
 * OriginalPaymentInstruction20.OriginalGroupInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction20#TransactionInformation
 * OriginalPaymentInstruction20.TransactionInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction74#OriginalTransactionReference
 * PaymentTransaction74.OriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInformation7#Amount
 * OriginalPaymentInformation7.Amount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction83#OriginalTransactionReference
 * PaymentTransaction83.OriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction77#OriginalTransactionReference
 * PaymentTransaction77.OriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction75#OriginalTransactionReference
 * PaymentTransaction75.OriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction82#OriginalTransactionReference
 * PaymentTransaction82.OriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction79#OriginalTransactionReference
 * PaymentTransaction79.OriginalTransactionReference}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.IndividualPayment
 * IndividualPayment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.BulkPayment BulkPayment}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.ObligationFulfilment
 * ObligationFulfilment}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentInstrument7
 * PaymentInstrument7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentInstrument6
 * PaymentInstrument6}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation1
 * InvestmentFundCashSettlementInformation1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentInstrument8
 * PaymentInstrument8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentInstrument9
 * PaymentInstrument9}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation3
 * InvestmentFundCashSettlementInformation3}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PaymentInstrument17Choice
 * PaymentInstrument17Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentInstrument11
 * PaymentInstrument11}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PaymentInstrument16Choice
 * PaymentInstrument16Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentInstrument10
 * PaymentInstrument10}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation5
 * InvestmentFundCashSettlementInformation5}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation2
 * InvestmentFundCashSettlementInformation2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation4
 * InvestmentFundCashSettlementInformation4}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation6
 * InvestmentFundCashSettlementInformation6}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PaymentType2Choice
 * PaymentType2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PaymentType3Choice
 * PaymentType3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PaymentOrigin1Choice
 * PaymentOrigin1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LiquidityCreditTransfer1
 * LiquidityCreditTransfer1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LiquidityDebitTransfer1
 * LiquidityDebitTransfer1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transaction3 Transaction3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionReportDetails3
 * TransactionReportDetails3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transaction4 Transaction4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionReportDetails4
 * TransactionReportDetails4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transaction5 Transaction5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionReportDetails5
 * TransactionReportDetails5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transaction24 Transaction24}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GroupHeader23 GroupHeader23}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GroupHeader42 GroupHeader42}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GroupHeader58 GroupHeader58}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GroupHeader1 GroupHeader1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.EquivalentAmount
 * EquivalentAmount}</li>
 * <li>{@linkplain com.tools20022.repository.choice.AmountType1Choice
 * AmountType1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.AmountType2Choice
 * AmountType2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InstructionForCreditorAgent1
 * InstructionForCreditorAgent1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GroupHeader32 GroupHeader32}</li>
 * <li>{@linkplain com.tools20022.repository.choice.CategoryPurpose1Choice
 * CategoryPurpose1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.EquivalentAmount2
 * EquivalentAmount2}</li>
 * <li>{@linkplain com.tools20022.repository.choice.AmountType3Choice
 * AmountType3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GroupHeader48 GroupHeader48}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GroupHeader39 GroupHeader39}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GroupHeader55 GroupHeader55}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GroupHeader7 GroupHeader7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalGroupInformation4
 * OriginalGroupInformation4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalTransactionReference1
 * OriginalTransactionReference1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTransactionInformation3
 * PaymentTransactionInformation3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalGroupInformation23
 * OriginalGroupInformation23}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalGroupInformation3
 * OriginalGroupInformation3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalTransactionReference13
 * OriginalTransactionReference13}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation30
 * PaymentTransactionInformation30}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalPaymentInformation4
 * OriginalPaymentInformation4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalTransactionReference16
 * OriginalTransactionReference16}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTransaction37
 * PaymentTransaction37}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction4
 * OriginalPaymentInstruction4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTransaction47
 * PaymentTransaction47}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction8
 * OriginalPaymentInstruction8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GroupHeader8 GroupHeader8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalGroupInformation5
 * OriginalGroupInformation5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTransactionInformation4
 * PaymentTransactionInformation4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GroupHeader40 GroupHeader40}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalGroupInformation22
 * OriginalGroupInformation22}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation28
 * PaymentTransactionInformation28}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalPaymentInformation2
 * OriginalPaymentInformation2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GroupHeader56 GroupHeader56}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTransaction35
 * PaymentTransaction35}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction2
 * OriginalPaymentInstruction2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTransaction42
 * PaymentTransaction42}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction7
 * OriginalPaymentInstruction7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GroupHeader5 GroupHeader5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalGroupInformation1
 * OriginalGroupInformation1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTransactionInformation1
 * PaymentTransactionInformation1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GroupHeader36 GroupHeader36}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalGroupInformation20
 * OriginalGroupInformation20}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation25
 * PaymentTransactionInformation25}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalPaymentInformation1
 * OriginalPaymentInformation1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GroupHeader52 GroupHeader52}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTransaction32
 * PaymentTransaction32}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction1
 * OriginalPaymentInstruction1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTransaction46
 * PaymentTransaction46}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction6
 * OriginalPaymentInstruction6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GroupHeader2 GroupHeader2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GroupHeader33 GroupHeader33}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GroupHeader49 GroupHeader49}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GroupHeader3 GroupHeader3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GroupHeader34 GroupHeader34}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GroupHeader50 GroupHeader50}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation31
 * PaymentTransactionInformation31}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTransaction38
 * PaymentTransaction38}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTransaction48
 * PaymentTransaction48}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GroupHeader9 GroupHeader9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTransactionInformation5
 * PaymentTransactionInformation5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GroupHeader41 GroupHeader41}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation29
 * PaymentTransactionInformation29}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GroupHeader57 GroupHeader57}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTransaction36
 * PaymentTransaction36}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTransaction45
 * PaymentTransaction45}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GroupHeader37 GroupHeader37}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation26
 * PaymentTransactionInformation26}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GroupHeader53 GroupHeader53}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTransaction33
 * PaymentTransaction33}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTransaction43
 * PaymentTransaction43}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GroupHeader4 GroupHeader4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InstructionForCreditorAgent2
 * InstructionForCreditorAgent2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GroupHeader35 GroupHeader35}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GroupHeader51 GroupHeader51}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GroupHeader31 GroupHeader31}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GroupHeader47 GroupHeader47}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GroupHeader6 GroupHeader6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalGroupInformation2
 * OriginalGroupInformation2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTransactionInformation2
 * PaymentTransactionInformation2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GroupHeader38 GroupHeader38}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalGroupInformation21
 * OriginalGroupInformation21}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation27
 * PaymentTransactionInformation27}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GroupHeader54 GroupHeader54}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTransaction34
 * PaymentTransaction34}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTransaction44
 * PaymentTransaction44}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Percentage1 Percentage1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GroupHeader46 GroupHeader46}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalGroupInformation25
 * OriginalGroupInformation25}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalTransactionReference15
 * OriginalTransactionReference15}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation34
 * PaymentTransactionInformation34}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalPaymentInformation5
 * OriginalPaymentInformation5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalTransactionReference17
 * OriginalTransactionReference17}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTransaction41
 * PaymentTransaction41}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction5
 * OriginalPaymentInstruction5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalTransactionReference19
 * OriginalTransactionReference19}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTransaction49
 * PaymentTransaction49}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction9
 * OriginalPaymentInstruction9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GroupHeader45 GroupHeader45}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PaymentInstrument7Choice
 * PaymentInstrument7Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTransaction18
 * PaymentTransaction18}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTransaction15
 * PaymentTransaction15}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PaymentInstrument11Choice
 * PaymentInstrument11Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTransaction21
 * PaymentTransaction21}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTransaction22
 * PaymentTransaction22}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PaymentInstrument9Choice
 * PaymentInstrument9Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTransaction17
 * PaymentTransaction17}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PaymentInstrument10Choice
 * PaymentInstrument10Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTransaction19
 * PaymentTransaction19}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PaymentInstrument6Choice
 * PaymentInstrument6Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PaymentInstrument8Choice
 * PaymentInstrument8Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PaymentInstrument12Choice
 * PaymentInstrument12Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTransaction23
 * PaymentTransaction23}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTransaction16
 * PaymentTransaction16}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTransaction13
 * PaymentTransaction13}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTransaction24
 * PaymentTransaction24}</li>
 * <li>{@linkplain com.tools20022.repository.choice.CashInOrOut4Choice
 * CashInOrOut4Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTransaction20
 * PaymentTransaction20}</li>
 * <li>{@linkplain com.tools20022.repository.choice.CashInOrOut5Choice
 * CashInOrOut5Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTransaction25
 * PaymentTransaction25}</li>
 * <li>{@linkplain com.tools20022.repository.choice.CashInOrOut3Choice
 * CashInOrOut3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTransaction14
 * PaymentTransaction14}</li>
 * <li>{@linkplain com.tools20022.repository.choice.CashInOrOut6Choice
 * CashInOrOut6Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTransaction26
 * PaymentTransaction26}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InstructionForFinalAgent
 * InstructionForFinalAgent}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashMovement1 CashMovement1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashMovement2 CashMovement2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashMovement3 CashMovement3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalTransactionReference14
 * OriginalTransactionReference14}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalTransactionReference18
 * OriginalTransactionReference18}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GroupHeader43 GroupHeader43}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GroupHeader59 GroupHeader59}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NotificationItem3
 * NotificationItem3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalItem1 OriginalItem1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalItemReference1
 * OriginalItemReference1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalItem2 OriginalItem2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GroupHeader44 GroupHeader44}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalItemAndStatus1
 * OriginalItemAndStatus1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalItemAndStatus2
 * OriginalItemAndStatus2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.UnderlyingTransaction1Choice
 * UnderlyingTransaction1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalGroupInformation24
 * OriginalGroupInformation24}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation32
 * PaymentTransactionInformation32}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalPaymentInformation3
 * OriginalPaymentInformation3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation33
 * PaymentTransactionInformation33}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorrectiveInterbankTransaction1
 * CorrectiveInterbankTransaction1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorrectiveTransaction1Choice
 * CorrectiveTransaction1Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InstalmentFinancingInformation1
 * InstalmentFinancingInformation1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentMeans1 PaymentMeans1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IntentToPay1 IntentToPay1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.UnderlyingTransaction2Choice
 * UnderlyingTransaction2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTransaction39
 * PaymentTransaction39}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction3
 * OriginalPaymentInstruction3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTransaction40
 * PaymentTransaction40}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NotificationItem4
 * NotificationItem4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalItemReference2
 * OriginalItemReference2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalItem3 OriginalItem3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GroupHeader60 GroupHeader60}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalItemAndStatus3
 * OriginalItemAndStatus3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentInstrumentType1
 * PaymentInstrumentType1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GroupHeader63 GroupHeader63}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CreditTransferTransaction9
 * CreditTransferTransaction9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalGroupInformation13
 * OriginalGroupInformation13}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalGroupInformation17
 * OriginalGroupInformation17}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalGroupInformation15
 * OriginalGroupInformation15}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalGroupInformation19
 * OriginalGroupInformation19}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalGroupInformation11
 * OriginalGroupInformation11}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalGroupInformation18
 * OriginalGroupInformation18}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalGroupInformation8
 * OriginalGroupInformation8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalTransactionReference7
 * OriginalTransactionReference7}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation13
 * PaymentTransactionInformation13}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalTransactionReference10
 * OriginalTransactionReference10}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation18
 * PaymentTransactionInformation18}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalTransactionReference9
 * OriginalTransactionReference9}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation15
 * PaymentTransactionInformation15}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalTransactionReference12
 * OriginalTransactionReference12}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation22
 * PaymentTransactionInformation22}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalTransactionReference8
 * OriginalTransactionReference8}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation12
 * PaymentTransactionInformation12}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalTransactionReference11
 * OriginalTransactionReference11}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation19
 * PaymentTransactionInformation19}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation14
 * PaymentTransactionInformation14}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation20
 * PaymentTransactionInformation20}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation16
 * PaymentTransactionInformation16}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation23
 * PaymentTransactionInformation23}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation17
 * PaymentTransactionInformation17}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation24
 * PaymentTransactionInformation24}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation21
 * PaymentTransactionInformation21}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GroupHeader19 GroupHeader19}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GroupHeader24 GroupHeader24}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GroupHeader20 GroupHeader20}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GroupHeader25 GroupHeader25}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GroupHeader15 GroupHeader15}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GroupHeader26 GroupHeader26}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GroupHeader17 GroupHeader17}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GroupHeader27 GroupHeader27}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GroupHeader22 GroupHeader22}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GroupHeader28 GroupHeader28}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GroupHeader16 GroupHeader16}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GroupHeader29 GroupHeader29}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GroupHeader18 GroupHeader18}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GroupHeader30 GroupHeader30}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalGroupInformation16
 * OriginalGroupInformation16}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalGroupInformation14
 * OriginalGroupInformation14}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalGroupInformation7
 * OriginalGroupInformation7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GroupHeader12 GroupHeader12}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GroupHeader21 GroupHeader21}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PaymentInstrument13Choice
 * PaymentInstrument13Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTransaction30
 * PaymentTransaction30}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PaymentInstrument14Choice
 * PaymentInstrument14Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTransaction28
 * PaymentTransaction28}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTransaction31
 * PaymentTransaction31}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation7
 * InvestmentFundCashSettlementInformation7}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation8
 * InvestmentFundCashSettlementInformation8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentInstrument12
 * PaymentInstrument12}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PaymentType4Choice
 * PaymentType4Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transaction33 Transaction33}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalPaymentInformation6
 * OriginalPaymentInformation6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GroupHeader62 GroupHeader62}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IntentToPay2 IntentToPay2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InstructionForCreditorAgent4
 * InstructionForCreditorAgent4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTransaction50
 * PaymentTransaction50}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction12
 * OriginalPaymentInstruction12}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction11
 * OriginalPaymentInstruction11}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTransaction52
 * PaymentTransaction52}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTransaction51
 * PaymentTransaction51}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalItem4 OriginalItem4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalItemReference3
 * OriginalItemReference3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction13
 * OriginalPaymentInstruction13}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTransaction58
 * PaymentTransaction58}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction10
 * OriginalPaymentInstruction10}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTransaction54
 * PaymentTransaction54}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalItemAndStatus4
 * OriginalItemAndStatus4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTransaction53
 * PaymentTransaction53}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalTransactionReference20
 * OriginalTransactionReference20}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTransaction57
 * PaymentTransaction57}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTransaction56
 * PaymentTransaction56}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTransaction55
 * PaymentTransaction55}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NotificationItem5
 * NotificationItem5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction14
 * OriginalPaymentInstruction14}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalTransactionReference21
 * OriginalTransactionReference21}</li>
 * <li>{@linkplain com.tools20022.repository.choice.AmountType4Choice
 * AmountType4Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTransaction59
 * PaymentTransaction59}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RelatedReference1
 * RelatedReference1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionCertificate2
 * TransactionCertificate2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SpecialCondition1
 * SpecialCondition1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GroupHeader70 GroupHeader70}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction16
 * OriginalPaymentInstruction16}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction18
 * OriginalPaymentInstruction18}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GroupHeader72 GroupHeader72}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTransaction65
 * PaymentTransaction65}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTransaction63
 * PaymentTransaction63}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTransaction60
 * PaymentTransaction60}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GroupHeader71 GroupHeader71}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTransaction68
 * PaymentTransaction68}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTransaction61
 * PaymentTransaction61}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalTransactionReference22
 * OriginalTransactionReference22}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction15
 * OriginalPaymentInstruction15}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalItem5 OriginalItem5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalItemAndStatus5
 * OriginalItemAndStatus5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalItemReference4
 * OriginalItemReference4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTransaction66
 * PaymentTransaction66}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTransaction67
 * PaymentTransaction67}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTransaction62
 * PaymentTransaction62}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTransaction64
 * PaymentTransaction64}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction17
 * OriginalPaymentInstruction17}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NotificationItem6
 * NotificationItem6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalMessage2
 * OriginalMessage2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashSettlement1
 * CashSettlement1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashSettlement2
 * CashSettlement2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentInstrument13
 * PaymentInstrument13}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PaymentInstrument18Choice
 * PaymentInstrument18Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PaymentInstrument19Choice
 * PaymentInstrument19Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction19
 * OriginalPaymentInstruction19}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTransaction69
 * PaymentTransaction69}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalTransactionReference23
 * OriginalTransactionReference23}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalMessage3
 * OriginalMessage3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.EarlyPayment1 EarlyPayment1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GroupHeader69 GroupHeader69}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalGroupInformation27
 * OriginalGroupInformation27}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTransaction72
 * PaymentTransaction72}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTransaction70
 * PaymentTransaction70}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTransaction71
 * PaymentTransaction71}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PaymentInstrument21Choice
 * PaymentInstrument21Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PaymentInstrument20Choice
 * PaymentInstrument20Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.CashInOrOut7Choice
 * CashInOrOut7Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTransaction73
 * PaymentTransaction73}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.UnderlyingTransaction3Choice
 * UnderlyingTransaction3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTransaction80
 * PaymentTransaction80}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTransaction81
 * PaymentTransaction81}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction23
 * OriginalPaymentInstruction23}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction21
 * OriginalPaymentInstruction21}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction24
 * OriginalPaymentInstruction24}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalGroupInformation28
 * OriginalGroupInformation28}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTransaction76
 * PaymentTransaction76}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorrectiveTransaction2Choice
 * CorrectiveTransaction2Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.MandateClassification1Choice
 * MandateClassification1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction22
 * OriginalPaymentInstruction22}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTransaction78
 * PaymentTransaction78}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalTransactionReference24
 * OriginalTransactionReference24}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction20
 * OriginalPaymentInstruction20}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTransaction74
 * PaymentTransaction74}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalPaymentInformation7
 * OriginalPaymentInformation7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTransaction83
 * PaymentTransaction83}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalTransactionReference26
 * OriginalTransactionReference26}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTransaction77
 * PaymentTransaction77}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTransaction75
 * PaymentTransaction75}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTransaction82
 * PaymentTransaction82}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTransaction79
 * PaymentTransaction79}</li>
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
 * "Payment"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Payment information and processes required to transfer cash end to end from the debtor to the creditor."
 * </li>
 * </ul>
 */
public class Payment extends ObligationFulfilment {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies the obligation which created the payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation#PaymentOffset
	 * PaymentObligation.PaymentOffset}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeSettlement1#PaymentTerms
	 * TradeSettlement1.PaymentTerms}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Payment
	 * Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentObligation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the obligation which created the payment."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd PaymentObligation = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TradeSettlement1.PaymentTerms);
			elementContext_lazy = () -> Payment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PaymentObligation";
			definition = "Specifies the obligation which created the payment.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentObligation.PaymentOffset;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the currency of the amount to be transferred which may be
	 * different from the currency of the debtor's account.
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
	 * {@linkplain com.tools20022.repository.msg.PaymentInstrument7#SettlementCurrency
	 * PaymentInstrument7.SettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstrument6#SettlementCurrency
	 * PaymentInstrument6.SettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstrument8#SettlementCurrency
	 * PaymentInstrument8.SettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstrument9#SettlementCurrency
	 * PaymentInstrument9.SettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstrument11#SettlementCurrency
	 * PaymentInstrument11.SettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstrument10#SettlementCurrency
	 * PaymentInstrument10.SettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EquivalentAmount#CurrencyOfTransfer
	 * EquivalentAmount.CurrencyOfTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EquivalentAmount2#CurrencyOfTransfer
	 * EquivalentAmount2.CurrencyOfTransfer}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CommonData1#Currency
	 * CommonData1.Currency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails4#Currency
	 * CardPaymentTransactionDetails4.Currency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CommonData2#Currency
	 * CommonData2.Currency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails7#Currency
	 * CardPaymentTransactionDetails7.Currency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails9#Currency
	 * CardPaymentTransactionDetails9.Currency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails1#Currency
	 * CardPaymentTransactionDetails1.Currency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails10#Currency
	 * CardPaymentTransactionDetails10.Currency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails2#Currency
	 * CardPaymentTransactionDetails2.Currency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails11#Currency
	 * CardPaymentTransactionDetails11.Currency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction9#Currency
	 * CardPaymentTransaction9.Currency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction18#Currency
	 * CardPaymentTransaction18.Currency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails5#Currency
	 * CardPaymentTransactionDetails5.Currency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails6#Currency
	 * CardPaymentTransactionDetails6.Currency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails3#Currency
	 * CardPaymentTransactionDetails3.Currency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstrument12#SettlementCurrency
	 * PaymentInstrument12.SettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails12#Currency
	 * CardPaymentTransactionDetails12.Currency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails13#Currency
	 * CardPaymentTransactionDetails13.Currency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails18#Currency
	 * CardPaymentTransactionDetails18.Currency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails16#Currency
	 * CardPaymentTransactionDetails16.Currency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails14#Currency
	 * CardPaymentTransactionDetails14.Currency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CommonData3#Currency
	 * CommonData3.Currency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails15#Currency
	 * CardPaymentTransactionDetails15.Currency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails17#Currency
	 * CardPaymentTransactionDetails17.Currency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails20#Currency
	 * CardPaymentTransactionDetails20.Currency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails25#Currency
	 * CardPaymentTransactionDetails25.Currency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails23#Currency
	 * CardPaymentTransactionDetails23.Currency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails21#Currency
	 * CardPaymentTransactionDetails21.Currency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails26#Currency
	 * CardPaymentTransactionDetails26.Currency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails19#Currency
	 * CardPaymentTransactionDetails19.Currency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails24#Currency
	 * CardPaymentTransactionDetails24.Currency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CommonData4#Currency
	 * CommonData4.Currency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails22#Currency
	 * CardPaymentTransactionDetails22.Currency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AutomatedTellerMachine4#BaseCurrency
	 * AutomatedTellerMachine4.BaseCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PremiumAmount3#PremiumCurrency
	 * PremiumAmount3.PremiumCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails32#Currency
	 * CardPaymentTransactionDetails32.Currency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails33#Currency
	 * CardPaymentTransactionDetails33.Currency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails28#Currency
	 * CardPaymentTransactionDetails28.Currency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails29#Currency
	 * CardPaymentTransactionDetails29.Currency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails30#Currency
	 * CardPaymentTransactionDetails30.Currency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails27#Currency
	 * CardPaymentTransactionDetails27.Currency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails31#Currency
	 * CardPaymentTransactionDetails31.Currency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CommonData5#Currency
	 * CommonData5.Currency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails35#Currency
	 * CardPaymentTransactionDetails35.Currency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails34#Currency
	 * CardPaymentTransactionDetails34.Currency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AutomatedTellerMachine10#BaseCurrency
	 * AutomatedTellerMachine10.BaseCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails39#Currency
	 * CardPaymentTransactionDetails39.Currency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails38#Currency
	 * CardPaymentTransactionDetails38.Currency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails41#Currency
	 * CardPaymentTransactionDetails41.Currency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails37#Currency
	 * CardPaymentTransactionDetails37.Currency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CommonData6#Currency
	 * CommonData6.Currency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails40#Currency
	 * CardPaymentTransactionDetails40.Currency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails42#Currency
	 * CardPaymentTransactionDetails42.Currency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails43#Currency
	 * CardPaymentTransactionDetails43.Currency}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Payment
	 * Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyOfTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the currency of the amount to be transferred which may be different from the currency of the debtor's account."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CurrencyOfTransfer = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentInstrument7.SettlementCurrency, com.tools20022.repository.msg.PaymentInstrument6.SettlementCurrency,
					com.tools20022.repository.msg.PaymentInstrument8.SettlementCurrency, com.tools20022.repository.msg.PaymentInstrument9.SettlementCurrency, com.tools20022.repository.msg.PaymentInstrument11.SettlementCurrency,
					com.tools20022.repository.msg.PaymentInstrument10.SettlementCurrency, com.tools20022.repository.msg.EquivalentAmount.CurrencyOfTransfer, com.tools20022.repository.msg.EquivalentAmount2.CurrencyOfTransfer,
					com.tools20022.repository.msg.CommonData1.Currency, com.tools20022.repository.msg.CardPaymentTransactionDetails4.Currency, com.tools20022.repository.msg.CommonData2.Currency,
					com.tools20022.repository.msg.CardPaymentTransactionDetails7.Currency, com.tools20022.repository.msg.CardPaymentTransactionDetails9.Currency, com.tools20022.repository.msg.CardPaymentTransactionDetails1.Currency,
					com.tools20022.repository.msg.CardPaymentTransactionDetails10.Currency, com.tools20022.repository.msg.CardPaymentTransactionDetails2.Currency, com.tools20022.repository.msg.CardPaymentTransactionDetails11.Currency,
					com.tools20022.repository.msg.CardPaymentTransaction9.Currency, com.tools20022.repository.msg.CardPaymentTransaction18.Currency, com.tools20022.repository.msg.CardPaymentTransactionDetails5.Currency,
					com.tools20022.repository.msg.CardPaymentTransactionDetails6.Currency, com.tools20022.repository.msg.CardPaymentTransactionDetails3.Currency, com.tools20022.repository.msg.PaymentInstrument12.SettlementCurrency,
					com.tools20022.repository.msg.CardPaymentTransactionDetails12.Currency, com.tools20022.repository.msg.CardPaymentTransactionDetails13.Currency, com.tools20022.repository.msg.CardPaymentTransactionDetails18.Currency,
					com.tools20022.repository.msg.CardPaymentTransactionDetails16.Currency, com.tools20022.repository.msg.CardPaymentTransactionDetails14.Currency, com.tools20022.repository.msg.CommonData3.Currency,
					com.tools20022.repository.msg.CardPaymentTransactionDetails15.Currency, com.tools20022.repository.msg.CardPaymentTransactionDetails17.Currency, com.tools20022.repository.msg.CardPaymentTransactionDetails20.Currency,
					com.tools20022.repository.msg.CardPaymentTransactionDetails25.Currency, com.tools20022.repository.msg.CardPaymentTransactionDetails23.Currency, com.tools20022.repository.msg.CardPaymentTransactionDetails21.Currency,
					com.tools20022.repository.msg.CardPaymentTransactionDetails26.Currency, com.tools20022.repository.msg.CardPaymentTransactionDetails19.Currency, com.tools20022.repository.msg.CardPaymentTransactionDetails24.Currency,
					com.tools20022.repository.msg.CommonData4.Currency, com.tools20022.repository.msg.CardPaymentTransactionDetails22.Currency, com.tools20022.repository.msg.AutomatedTellerMachine4.BaseCurrency,
					com.tools20022.repository.msg.PremiumAmount3.PremiumCurrency, com.tools20022.repository.msg.CardPaymentTransactionDetails32.Currency, com.tools20022.repository.msg.CardPaymentTransactionDetails33.Currency,
					com.tools20022.repository.msg.CardPaymentTransactionDetails28.Currency, com.tools20022.repository.msg.CardPaymentTransactionDetails29.Currency, com.tools20022.repository.msg.CardPaymentTransactionDetails30.Currency,
					com.tools20022.repository.msg.CardPaymentTransactionDetails27.Currency, com.tools20022.repository.msg.CardPaymentTransactionDetails31.Currency, com.tools20022.repository.msg.CommonData5.Currency,
					com.tools20022.repository.msg.CardPaymentTransactionDetails35.Currency, com.tools20022.repository.msg.CardPaymentTransactionDetails34.Currency, com.tools20022.repository.msg.AutomatedTellerMachine10.BaseCurrency,
					com.tools20022.repository.msg.CardPaymentTransactionDetails39.Currency, com.tools20022.repository.msg.CardPaymentTransactionDetails38.Currency, com.tools20022.repository.msg.CardPaymentTransactionDetails41.Currency,
					com.tools20022.repository.msg.CardPaymentTransactionDetails37.Currency, com.tools20022.repository.msg.CommonData6.Currency, com.tools20022.repository.msg.CardPaymentTransactionDetails40.Currency,
					com.tools20022.repository.msg.CardPaymentTransactionDetails42.Currency, com.tools20022.repository.msg.CardPaymentTransactionDetails43.Currency);
			elementContext_lazy = () -> Payment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CurrencyOfTransfer";
			definition = "Specifies the currency of the amount to be transferred which may be different from the currency of the debtor's account.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	/**
	 * Specifies the transfer method to be used for the credit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CreditInstrument#RelatedPayment
	 * CreditInstrument.RelatedPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CreditInstrument
	 * CreditInstrument}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstrument11#PaymentInstrument
	 * PaymentInstrument11.PaymentInstrument}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstrument10#PaymentInstrument
	 * PaymentInstrument10.PaymentInstrument}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch2#PaymentMethod
	 * PaymentSearch2.PaymentMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch3#PaymentMethod
	 * PaymentSearch3.PaymentMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference19#PaymentMethod
	 * OriginalTransactionReference19.PaymentMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstrument12#PaymentInstrument
	 * PaymentInstrument12.PaymentInstrument}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference21#PaymentMethod
	 * OriginalTransactionReference21.PaymentMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference23#PaymentMethod
	 * OriginalTransactionReference23.PaymentMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference26#PaymentMethod
	 * OriginalTransactionReference26.PaymentMethod}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Payment
	 * Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the transfer method to be used for the credit."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CreditMethod = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentInstrument11.PaymentInstrument, com.tools20022.repository.msg.PaymentInstrument10.PaymentInstrument,
					com.tools20022.repository.msg.PaymentSearch2.PaymentMethod, com.tools20022.repository.msg.PaymentSearch3.PaymentMethod, com.tools20022.repository.msg.OriginalTransactionReference19.PaymentMethod,
					com.tools20022.repository.msg.PaymentInstrument12.PaymentInstrument, com.tools20022.repository.msg.OriginalTransactionReference21.PaymentMethod,
					com.tools20022.repository.msg.OriginalTransactionReference23.PaymentMethod, com.tools20022.repository.msg.OriginalTransactionReference26.PaymentMethod);
			elementContext_lazy = () -> Payment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CreditMethod";
			definition = "Specifies the transfer method to be used for the credit.";
			minOccurs = 1;
			type_lazy = () -> CreditInstrument.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CreditInstrument.RelatedPayment;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Type, or nature, of the payment, eg, express payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode
	 * PaymentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentType2Choice#PaymentType
	 * PaymentType2Choice.PaymentType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentType2Choice#ProprietaryPaymentType
	 * PaymentType2Choice.ProprietaryPaymentType}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.PaymentType3Choice#Code
	 * PaymentType3Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentType3Choice#Proprietary
	 * PaymentType3Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction3#PaymentType
	 * PaymentInstruction3.PaymentType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentDetails2#PaymentType
	 * PaymentDetails2.PaymentType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentDetails4#PaymentType
	 * PaymentDetails4.PaymentType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentInstruction2#Type
	 * PaymentInstruction2.Type}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentDetails5#PaymentType
	 * PaymentDetails5.PaymentType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentDetails6#PaymentType
	 * PaymentDetails6.PaymentType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentDetails7#PaymentType
	 * PaymentDetails7.PaymentType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentInstruction1#Type
	 * PaymentInstruction1.Type}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardAggregated1#TransactionCategory
	 * CardAggregated1.TransactionCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardIndividualTransaction1#TransactionCategory
	 * CardIndividualTransaction1.TransactionCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction13#PaymentType
	 * PaymentInstruction13.PaymentType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentInstruction12#Type
	 * PaymentInstruction12.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.PaymentType4Choice#Code
	 * PaymentType4Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentType4Choice#Proprietary
	 * PaymentType4Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentInstruction14#Type
	 * PaymentInstruction14.Type}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardIndividualTransaction2#TransactionCategory
	 * CardIndividualTransaction2.TransactionCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancingAgreementItem1#PaymentInstrument
	 * FinancingAgreementItem1.PaymentInstrument}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Payment
	 * Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type, or nature, of the payment, eg, express payment."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Type = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.PaymentType2Choice.PaymentType, com.tools20022.repository.choice.PaymentType2Choice.ProprietaryPaymentType,
					com.tools20022.repository.choice.PaymentType3Choice.Code, com.tools20022.repository.choice.PaymentType3Choice.Proprietary, com.tools20022.repository.msg.PaymentInstruction3.PaymentType,
					com.tools20022.repository.msg.PaymentDetails2.PaymentType, com.tools20022.repository.msg.PaymentDetails4.PaymentType, com.tools20022.repository.msg.PaymentInstruction2.Type,
					com.tools20022.repository.msg.PaymentDetails5.PaymentType, com.tools20022.repository.msg.PaymentDetails6.PaymentType, com.tools20022.repository.msg.PaymentDetails7.PaymentType,
					com.tools20022.repository.msg.PaymentInstruction1.Type, com.tools20022.repository.msg.CardAggregated1.TransactionCategory, com.tools20022.repository.msg.CardIndividualTransaction1.TransactionCategory,
					com.tools20022.repository.msg.PaymentInstruction13.PaymentType, com.tools20022.repository.msg.PaymentInstruction12.Type, com.tools20022.repository.choice.PaymentType4Choice.Code,
					com.tools20022.repository.choice.PaymentType4Choice.Proprietary, com.tools20022.repository.msg.PaymentInstruction14.Type, com.tools20022.repository.msg.CardIndividualTransaction2.TransactionCategory,
					com.tools20022.repository.msg.FinancingAgreementItem1.PaymentInstrument);
			elementContext_lazy = () -> Payment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Type, or nature, of the payment, eg, express payment.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PaymentTypeCode.mmObject();
		}
	};
	/**
	 * Amount of money to be moved between the debtor and creditor, before
	 * deduction of charges, expressed in the currency as ordered by the
	 * initiating party.
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
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch2#InstructedAmount
	 * PaymentSearch2.InstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch3#InstructedAmount
	 * PaymentSearch3.InstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch4#InstructedAmount
	 * PaymentSearch4.InstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentDetails5#InstructedAmount
	 * PaymentDetails5.InstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentDetails6#InstructedAmount
	 * PaymentDetails6.InstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentDetails7#InstructedAmount
	 * PaymentDetails7.InstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction1#InstructedAmount
	 * PaymentInstruction1.InstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndCurrencyExchange2#InstructedAmount
	 * AmountAndCurrencyExchange2.InstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndCurrencyExchange3#InstructedAmount
	 * AmountAndCurrencyExchange3.InstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AmountType1Choice#InstructedAmount
	 * AmountType1Choice.InstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AmountType2Choice#InstructedAmount
	 * AmountType2Choice.InstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation1#Amount
	 * CreditTransferTransactionInformation1.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AmountType3Choice#InstructedAmount
	 * AmountType3Choice.InstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation10#Amount
	 * CreditTransferTransactionInformation10.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction1#Amount
	 * CreditTransferTransaction1.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction6#Amount
	 * CreditTransferTransaction6.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation1#InstructedAmount
	 * DirectDebitTransactionInformation1.InstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation9#InstructedAmount
	 * DirectDebitTransactionInformation9.InstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation11#InstructedAmount
	 * DirectDebitTransactionInformation11.InstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation13#InstructedAmount
	 * DirectDebitTransactionInformation13.InstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference1#Amount
	 * OriginalTransactionReference1.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation3#OriginalInstructedAmount
	 * PaymentTransactionInformation3.OriginalInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference13#Amount
	 * OriginalTransactionReference13.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation30#OriginalInstructedAmount
	 * PaymentTransactionInformation30.OriginalInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference16#Amount
	 * OriginalTransactionReference16.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction37#OriginalInstructedAmount
	 * PaymentTransaction37.OriginalInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction47#OriginalInstructedAmount
	 * PaymentTransaction47.OriginalInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation4#OriginalInstructedAmount
	 * PaymentTransactionInformation4.OriginalInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation4#ReversedInstructedAmount
	 * PaymentTransactionInformation4.ReversedInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation28#OriginalInstructedAmount
	 * PaymentTransactionInformation28.OriginalInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation28#ReversedInstructedAmount
	 * PaymentTransactionInformation28.ReversedInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction35#OriginalInstructedAmount
	 * PaymentTransaction35.OriginalInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction35#ReversedInstructedAmount
	 * PaymentTransaction35.ReversedInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction42#OriginalInstructedAmount
	 * PaymentTransaction42.OriginalInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction42#ReversedInstructedAmount
	 * PaymentTransaction42.ReversedInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation2#InstructedAmount
	 * CreditTransferTransactionInformation2.InstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation11#InstructedAmount
	 * CreditTransferTransactionInformation11.InstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction2#InstructedAmount
	 * CreditTransferTransaction2.InstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction7#InstructedAmount
	 * CreditTransferTransaction7.InstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation2#InstructedAmount
	 * DirectDebitTransactionInformation2.InstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation10#InstructedAmount
	 * DirectDebitTransactionInformation10.InstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation12#InstructedAmount
	 * DirectDebitTransactionInformation12.InstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation14#InstructedAmount
	 * DirectDebitTransactionInformation14.InstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation5#ReversedInstructedAmount
	 * PaymentTransactionInformation5.ReversedInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation29#ReversedInstructedAmount
	 * PaymentTransactionInformation29.ReversedInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction36#ReversedInstructedAmount
	 * PaymentTransaction36.ReversedInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction45#ReversedInstructedAmount
	 * PaymentTransaction45.ReversedInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation12#InstructedAmount
	 * CreditTransferTransactionInformation12.InstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction3#InstructedAmount
	 * CreditTransferTransaction3.InstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation2#ReturnedInstructedAmount
	 * PaymentTransactionInformation2.ReturnedInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation27#ReturnedInstructedAmount
	 * PaymentTransactionInformation27.ReturnedInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction34#ReturnedInstructedAmount
	 * PaymentTransaction34.ReturnedInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction44#ReturnedInstructedAmount
	 * PaymentTransaction44.ReturnedInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference15#Amount
	 * OriginalTransactionReference15.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference17#Amount
	 * OriginalTransactionReference17.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation14#Amount
	 * CreditTransferTransactionInformation14.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction5#Amount
	 * CreditTransferTransaction5.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction10#Amount
	 * CreditTransferTransaction10.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails4#TotalAmount
	 * CardPaymentTransactionDetails4.TotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails7#TotalAmount
	 * CardPaymentTransactionDetails7.TotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails9#TotalAmount
	 * CardPaymentTransactionDetails9.TotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails1#TotalAmount
	 * CardPaymentTransactionDetails1.TotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails10#TotalAmount
	 * CardPaymentTransactionDetails10.TotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails2#TotalAmount
	 * CardPaymentTransactionDetails2.TotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails11#TotalAmount
	 * CardPaymentTransactionDetails11.TotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails5#TotalAmount
	 * CardPaymentTransactionDetails5.TotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails6#TotalAmount
	 * CardPaymentTransactionDetails6.TotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails3#TotalAmount
	 * CardPaymentTransactionDetails3.TotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundOrderData1#SettlementAmount
	 * FundOrderData1.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundOrderData2#SettlementAmount
	 * FundOrderData2.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction18#SettlementAmount
	 * PaymentTransaction18.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction15#SettlementAmount
	 * PaymentTransaction15.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkOrder3#TotalSettlementAmount
	 * RedemptionBulkOrder3.TotalSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution5#SettlementAmount
	 * RedemptionExecution5.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkExecution3#TotalSettlementAmount
	 * RedemptionBulkExecution3.TotalSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkOrder4#TotalSettlementAmount
	 * RedemptionBulkOrder4.TotalSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder3#TotalSettlementAmount
	 * RedemptionMultipleOrder3.TotalSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#SettlementAmount
	 * RedemptionExecution6.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution3#TotalSettlementAmount
	 * RedemptionMultipleExecution3.TotalSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder4#TotalSettlementAmount
	 * RedemptionMultipleOrder4.TotalSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction2#GrossSettlementAmount
	 * InvestmentFundTransaction2.GrossSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction17#SettlementAmount
	 * PaymentTransaction17.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction19#SettlementAmount
	 * PaymentTransaction19.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkOrder3#TotalSettlementAmount
	 * SubscriptionBulkOrder3.TotalSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction16#SettlementAmount
	 * PaymentTransaction16.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction13#SettlementAmount
	 * PaymentTransaction13.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkExecution3#TotalSettlementAmount
	 * SubscriptionBulkExecution3.TotalSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkOrder4#TotalSettlementAmount
	 * SubscriptionBulkOrder4.TotalSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder3#TotalSettlementAmount
	 * SubscriptionMultipleOrder3.TotalSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleExecution3#TotalSettlementAmount
	 * SubscriptionMultipleExecution3.TotalSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder4#TotalSettlementAmount
	 * SubscriptionMultipleOrder4.TotalSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction20#SettlementAmount
	 * PaymentTransaction20.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction14#SettlementAmount
	 * PaymentTransaction14.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionExtract#CurrencyAmount
	 * PaymentInstructionExtract.CurrencyAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionExtract2#InstructedAmount
	 * PaymentInstructionExtract2.InstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation#Amount
	 * PaymentComplementaryInformation.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorrectivePaymentInstructionExtract#InstructedAmount
	 * CorrectivePaymentInstructionExtract.InstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentInstruction1#OriginalInstructedAmount
	 * UnderlyingPaymentInstruction1.OriginalInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification2#Amount
	 * RequestedModification2.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation2#Amount
	 * PaymentComplementaryInformation2.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation32#OriginalInstructedAmount
	 * PaymentTransactionInformation32.OriginalInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorrectivePaymentInitiation1#InstructedAmount
	 * CorrectivePaymentInitiation1.InstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementData1#SettlementAmount
	 * SettlementData1.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementData2#SettlementAmount
	 * SettlementData2.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementData2#SettledAmount
	 * SettlementData2.SettledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstalmentFinancingInformation1#InstalmentTotalAmount
	 * InstalmentFinancingInformation1.InstalmentTotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentInstruction2#OriginalInstructedAmount
	 * UnderlyingPaymentInstruction2.OriginalInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation3#Amount
	 * PaymentComplementaryInformation3.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction39#OriginalInstructedAmount
	 * PaymentTransaction39.OriginalInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification3#Amount
	 * RequestedModification3.Amount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OriginalItem3#Amount
	 * OriginalItem3.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference9#Amount
	 * OriginalTransactionReference9.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference12#Amount
	 * OriginalTransactionReference12.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference11#Amount
	 * OriginalTransactionReference11.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation16#ReturnedInstructedAmount
	 * PaymentTransactionInformation16.ReturnedInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation23#ReturnedInstructedAmount
	 * PaymentTransactionInformation23.ReturnedInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation17#ReversedInstructedAmount
	 * PaymentTransactionInformation17.ReversedInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation24#ReversedInstructedAmount
	 * PaymentTransactionInformation24.ReversedInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation21#ReturnedInstructedAmount
	 * PaymentTransactionInformation21.ReturnedInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation7#InstructedAmount
	 * CreditTransferTransactionInformation7.InstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation9#InstructedAmount
	 * CreditTransferTransactionInformation9.InstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation6#InstructedAmount
	 * DirectDebitTransactionInformation6.InstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation8#InstructedAmount
	 * DirectDebitTransactionInformation8.InstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution12#SettlementAmount
	 * RedemptionExecution12.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch5#InstructedAmount
	 * PaymentSearch5.InstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction14#InstructedAmount
	 * PaymentInstruction14.InstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails12#TotalAmount
	 * CardPaymentTransactionDetails12.TotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails13#TotalAmount
	 * CardPaymentTransactionDetails13.TotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails18#TotalAmount
	 * CardPaymentTransactionDetails18.TotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails16#TotalAmount
	 * CardPaymentTransactionDetails16.TotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails14#TotalAmount
	 * CardPaymentTransactionDetails14.TotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails15#TotalAmount
	 * CardPaymentTransactionDetails15.TotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails17#TotalAmount
	 * CardPaymentTransactionDetails17.TotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation4#Amount
	 * PaymentComplementaryInformation4.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction50#ReturnedInstructedAmount
	 * PaymentTransaction50.ReturnedInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction19#InstructedAmount
	 * CreditTransferTransaction19.InstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation17#InstructedAmount
	 * DirectDebitTransactionInformation17.InstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction51#ReversedInstructedAmount
	 * PaymentTransaction51.ReversedInstructedAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OriginalItem4#Amount
	 * OriginalItem4.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification4#Amount
	 * RequestedModification4.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction58#OriginalInstructedAmount
	 * PaymentTransaction58.OriginalInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction54#OriginalInstructedAmount
	 * PaymentTransaction54.OriginalInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference20#Amount
	 * OriginalTransactionReference20.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction18#InstructedAmount
	 * CreditTransferTransaction18.InstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction56#OriginalInstructedAmount
	 * PaymentTransaction56.OriginalInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction56#ReversedInstructedAmount
	 * PaymentTransaction56.ReversedInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation18#InstructedAmount
	 * DirectDebitTransactionInformation18.InstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction20#Amount
	 * CreditTransferTransaction20.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AmountType4Choice#InstructedAmount
	 * AmountType4Choice.InstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction21#Amount
	 * CreditTransferTransaction21.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails20#TotalAmount
	 * CardPaymentTransactionDetails20.TotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails25#TotalAmount
	 * CardPaymentTransactionDetails25.TotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails23#TotalAmount
	 * CardPaymentTransactionDetails23.TotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails21#TotalAmount
	 * CardPaymentTransactionDetails21.TotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails26#TotalAmount
	 * CardPaymentTransactionDetails26.TotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails19#TotalAmount
	 * CardPaymentTransactionDetails19.TotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails24#TotalAmount
	 * CardPaymentTransactionDetails24.TotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails22#TotalAmount
	 * CardPaymentTransactionDetails22.TotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionDetail5#TransactionAmounts
	 * CardTransactionDetail5.TransactionAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionDetail1#TransactionAmounts
	 * CardTransactionDetail1.TransactionAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionDetail6#TransactionAmounts
	 * CardTransactionDetail6.TransactionAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionDetail3#TransactionAmounts
	 * CardTransactionDetail3.TransactionAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SpecialCondition1#IncomingAmount
	 * SpecialCondition1.IncomingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SpecialCondition1#OutgoingAmount
	 * SpecialCondition1.OutgoingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SpecialCondition1#IncomingAmountToOtherAccount
	 * SpecialCondition1.IncomingAmountToOtherAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SpecialCondition1#PaymentFromOtherAccount
	 * SpecialCondition1.PaymentFromOtherAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification5#Amount
	 * RequestedModification5.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction25#InstructedAmount
	 * CreditTransferTransaction25.InstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction65#ReturnedInstructedAmount
	 * PaymentTransaction65.ReturnedInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation5#Amount
	 * PaymentComplementaryInformation5.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation20#InstructedAmount
	 * DirectDebitTransactionInformation20.InstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction60#ReversedInstructedAmount
	 * PaymentTransaction60.ReversedInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction61#OriginalInstructedAmount
	 * PaymentTransaction61.OriginalInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference22#Amount
	 * OriginalTransactionReference22.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction24#InstructedAmount
	 * CreditTransferTransaction24.InstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction26#Amount
	 * CreditTransferTransaction26.Amount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OriginalItem5#Amount
	 * OriginalItem5.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation19#InstructedAmount
	 * DirectDebitTransactionInformation19.InstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction66#OriginalInstructedAmount
	 * PaymentTransaction66.OriginalInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction22#Amount
	 * CreditTransferTransaction22.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction64#OriginalInstructedAmount
	 * PaymentTransaction64.OriginalInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction64#ReversedInstructedAmount
	 * PaymentTransaction64.ReversedInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails32#TotalAmount
	 * CardPaymentTransactionDetails32.TotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails33#TotalAmount
	 * CardPaymentTransactionDetails33.TotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails28#TotalAmount
	 * CardPaymentTransactionDetails28.TotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails29#TotalAmount
	 * CardPaymentTransactionDetails29.TotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails30#TotalAmount
	 * CardPaymentTransactionDetails30.TotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails27#TotalAmount
	 * CardPaymentTransactionDetails27.TotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails31#TotalAmount
	 * CardPaymentTransactionDetails31.TotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails35#TotalAmount
	 * CardPaymentTransactionDetails35.TotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails34#TotalAmount
	 * CardPaymentTransactionDetails34.TotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkOrder5#TotalSettlementAmount
	 * SubscriptionBulkOrder5.TotalSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkExecution5#TotalSettlementAmount
	 * RedemptionBulkExecution5.TotalSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution5#TotalSettlementAmount
	 * RedemptionMultipleExecution5.TotalSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder6#TotalSettlementAmount
	 * RedemptionMultipleOrder6.TotalSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder6#TotalSettlementAmount
	 * SubscriptionMultipleOrder6.TotalSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkExecution4#TotalSettlementAmount
	 * SubscriptionBulkExecution4.TotalSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkOrder6#TotalSettlementAmount
	 * RedemptionBulkOrder6.TotalSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleExecution5#TotalSettlementAmount
	 * SubscriptionMultipleExecution5.TotalSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundOrderData5#SettlementAmount
	 * FundOrderData5.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#SettlementAmount
	 * RedemptionExecution16.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundOrderData6#SettlementAmount
	 * FundOrderData6.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#SettlementAmount
	 * RedemptionExecution15.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation21#InstructedAmount
	 * DirectDebitTransactionInformation21.InstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction81#ReversedInstructedAmount
	 * PaymentTransaction81.ReversedInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification6#Amount
	 * RequestedModification6.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction76#ReturnedInstructedAmount
	 * PaymentTransaction76.ReturnedInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction78#OriginalInstructedAmount
	 * PaymentTransaction78.OriginalInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference24#Amount
	 * OriginalTransactionReference24.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction74#OriginalInstructedAmount
	 * PaymentTransaction74.OriginalInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction77#OriginalInstructedAmount
	 * PaymentTransaction77.OriginalInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction77#ReversedInstructedAmount
	 * PaymentTransaction77.ReversedInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation22#InstructedAmount
	 * DirectDebitTransactionInformation22.InstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorrectivePaymentInitiation2#InstructedAmount
	 * CorrectivePaymentInitiation2.InstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentInstruction3#OriginalInstructedAmount
	 * UnderlyingPaymentInstruction3.OriginalInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation6#Amount
	 * PaymentComplementaryInformation6.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails39#TotalAmount
	 * CardPaymentTransactionDetails39.TotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails38#TotalAmount
	 * CardPaymentTransactionDetails38.TotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails41#TotalAmount
	 * CardPaymentTransactionDetails41.TotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails37#TotalAmount
	 * CardPaymentTransactionDetails37.TotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails40#TotalAmount
	 * CardPaymentTransactionDetails40.TotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails42#TotalAmount
	 * CardPaymentTransactionDetails42.TotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails43#TotalAmount
	 * CardPaymentTransactionDetails43.TotalAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Payment
	 * Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money to be moved between the debtor and creditor, before deduction of charges, expressed in the currency as ordered by the initiating party."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute InstructedAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentSearch2.InstructedAmount, com.tools20022.repository.msg.PaymentSearch3.InstructedAmount, com.tools20022.repository.msg.PaymentSearch4.InstructedAmount,
					com.tools20022.repository.msg.PaymentDetails5.InstructedAmount, com.tools20022.repository.msg.PaymentDetails6.InstructedAmount, com.tools20022.repository.msg.PaymentDetails7.InstructedAmount,
					com.tools20022.repository.msg.PaymentInstruction1.InstructedAmount, com.tools20022.repository.msg.AmountAndCurrencyExchange2.InstructedAmount, com.tools20022.repository.msg.AmountAndCurrencyExchange3.InstructedAmount,
					com.tools20022.repository.choice.AmountType1Choice.InstructedAmount, com.tools20022.repository.choice.AmountType2Choice.InstructedAmount, com.tools20022.repository.msg.CreditTransferTransactionInformation1.Amount,
					com.tools20022.repository.choice.AmountType3Choice.InstructedAmount, com.tools20022.repository.msg.CreditTransferTransactionInformation10.Amount, com.tools20022.repository.msg.CreditTransferTransaction1.Amount,
					com.tools20022.repository.msg.CreditTransferTransaction6.Amount, com.tools20022.repository.msg.DirectDebitTransactionInformation1.InstructedAmount,
					com.tools20022.repository.msg.DirectDebitTransactionInformation9.InstructedAmount, com.tools20022.repository.msg.DirectDebitTransactionInformation11.InstructedAmount,
					com.tools20022.repository.msg.DirectDebitTransactionInformation13.InstructedAmount, com.tools20022.repository.msg.OriginalTransactionReference1.Amount,
					com.tools20022.repository.msg.PaymentTransactionInformation3.OriginalInstructedAmount, com.tools20022.repository.msg.OriginalTransactionReference13.Amount,
					com.tools20022.repository.msg.PaymentTransactionInformation30.OriginalInstructedAmount, com.tools20022.repository.msg.OriginalTransactionReference16.Amount,
					com.tools20022.repository.msg.PaymentTransaction37.OriginalInstructedAmount, com.tools20022.repository.msg.PaymentTransaction47.OriginalInstructedAmount,
					com.tools20022.repository.msg.PaymentTransactionInformation4.OriginalInstructedAmount, com.tools20022.repository.msg.PaymentTransactionInformation4.ReversedInstructedAmount,
					com.tools20022.repository.msg.PaymentTransactionInformation28.OriginalInstructedAmount, com.tools20022.repository.msg.PaymentTransactionInformation28.ReversedInstructedAmount,
					com.tools20022.repository.msg.PaymentTransaction35.OriginalInstructedAmount, com.tools20022.repository.msg.PaymentTransaction35.ReversedInstructedAmount,
					com.tools20022.repository.msg.PaymentTransaction42.OriginalInstructedAmount, com.tools20022.repository.msg.PaymentTransaction42.ReversedInstructedAmount,
					com.tools20022.repository.msg.CreditTransferTransactionInformation2.InstructedAmount, com.tools20022.repository.msg.CreditTransferTransactionInformation11.InstructedAmount,
					com.tools20022.repository.msg.CreditTransferTransaction2.InstructedAmount, com.tools20022.repository.msg.CreditTransferTransaction7.InstructedAmount,
					com.tools20022.repository.msg.DirectDebitTransactionInformation2.InstructedAmount, com.tools20022.repository.msg.DirectDebitTransactionInformation10.InstructedAmount,
					com.tools20022.repository.msg.DirectDebitTransactionInformation12.InstructedAmount, com.tools20022.repository.msg.DirectDebitTransactionInformation14.InstructedAmount,
					com.tools20022.repository.msg.PaymentTransactionInformation5.ReversedInstructedAmount, com.tools20022.repository.msg.PaymentTransactionInformation29.ReversedInstructedAmount,
					com.tools20022.repository.msg.PaymentTransaction36.ReversedInstructedAmount, com.tools20022.repository.msg.PaymentTransaction45.ReversedInstructedAmount,
					com.tools20022.repository.msg.CreditTransferTransactionInformation12.InstructedAmount, com.tools20022.repository.msg.CreditTransferTransaction3.InstructedAmount,
					com.tools20022.repository.msg.PaymentTransactionInformation2.ReturnedInstructedAmount, com.tools20022.repository.msg.PaymentTransactionInformation27.ReturnedInstructedAmount,
					com.tools20022.repository.msg.PaymentTransaction34.ReturnedInstructedAmount, com.tools20022.repository.msg.PaymentTransaction44.ReturnedInstructedAmount,
					com.tools20022.repository.msg.OriginalTransactionReference15.Amount, com.tools20022.repository.msg.OriginalTransactionReference17.Amount, com.tools20022.repository.msg.CreditTransferTransactionInformation14.Amount,
					com.tools20022.repository.msg.CreditTransferTransaction5.Amount, com.tools20022.repository.msg.CreditTransferTransaction10.Amount, com.tools20022.repository.msg.CardPaymentTransactionDetails4.TotalAmount,
					com.tools20022.repository.msg.CardPaymentTransactionDetails7.TotalAmount, com.tools20022.repository.msg.CardPaymentTransactionDetails9.TotalAmount,
					com.tools20022.repository.msg.CardPaymentTransactionDetails1.TotalAmount, com.tools20022.repository.msg.CardPaymentTransactionDetails10.TotalAmount,
					com.tools20022.repository.msg.CardPaymentTransactionDetails2.TotalAmount, com.tools20022.repository.msg.CardPaymentTransactionDetails11.TotalAmount,
					com.tools20022.repository.msg.CardPaymentTransactionDetails5.TotalAmount, com.tools20022.repository.msg.CardPaymentTransactionDetails6.TotalAmount,
					com.tools20022.repository.msg.CardPaymentTransactionDetails3.TotalAmount, com.tools20022.repository.msg.FundOrderData1.SettlementAmount, com.tools20022.repository.msg.FundOrderData2.SettlementAmount,
					com.tools20022.repository.msg.PaymentTransaction18.SettlementAmount, com.tools20022.repository.msg.PaymentTransaction15.SettlementAmount, com.tools20022.repository.msg.RedemptionBulkOrder3.TotalSettlementAmount,
					com.tools20022.repository.msg.RedemptionExecution5.SettlementAmount, com.tools20022.repository.msg.RedemptionBulkExecution3.TotalSettlementAmount,
					com.tools20022.repository.msg.RedemptionBulkOrder4.TotalSettlementAmount, com.tools20022.repository.msg.RedemptionMultipleOrder3.TotalSettlementAmount,
					com.tools20022.repository.msg.RedemptionExecution6.SettlementAmount, com.tools20022.repository.msg.RedemptionMultipleExecution3.TotalSettlementAmount,
					com.tools20022.repository.msg.RedemptionMultipleOrder4.TotalSettlementAmount, com.tools20022.repository.msg.InvestmentFundTransaction2.GrossSettlementAmount,
					com.tools20022.repository.msg.PaymentTransaction17.SettlementAmount, com.tools20022.repository.msg.PaymentTransaction19.SettlementAmount, com.tools20022.repository.msg.SubscriptionBulkOrder3.TotalSettlementAmount,
					com.tools20022.repository.msg.PaymentTransaction16.SettlementAmount, com.tools20022.repository.msg.PaymentTransaction13.SettlementAmount, com.tools20022.repository.msg.SubscriptionBulkExecution3.TotalSettlementAmount,
					com.tools20022.repository.msg.SubscriptionBulkOrder4.TotalSettlementAmount, com.tools20022.repository.msg.SubscriptionMultipleOrder3.TotalSettlementAmount,
					com.tools20022.repository.msg.SubscriptionMultipleExecution3.TotalSettlementAmount, com.tools20022.repository.msg.SubscriptionMultipleOrder4.TotalSettlementAmount,
					com.tools20022.repository.msg.PaymentTransaction20.SettlementAmount, com.tools20022.repository.msg.PaymentTransaction14.SettlementAmount, com.tools20022.repository.msg.PaymentInstructionExtract.CurrencyAmount,
					com.tools20022.repository.msg.PaymentInstructionExtract2.InstructedAmount, com.tools20022.repository.msg.PaymentComplementaryInformation.Amount,
					com.tools20022.repository.msg.CorrectivePaymentInstructionExtract.InstructedAmount, com.tools20022.repository.msg.UnderlyingPaymentInstruction1.OriginalInstructedAmount,
					com.tools20022.repository.msg.RequestedModification2.Amount, com.tools20022.repository.msg.PaymentComplementaryInformation2.Amount, com.tools20022.repository.msg.PaymentTransactionInformation32.OriginalInstructedAmount,
					com.tools20022.repository.msg.CorrectivePaymentInitiation1.InstructedAmount, com.tools20022.repository.msg.SettlementData1.SettlementAmount, com.tools20022.repository.msg.SettlementData2.SettlementAmount,
					com.tools20022.repository.msg.SettlementData2.SettledAmount, com.tools20022.repository.msg.InstalmentFinancingInformation1.InstalmentTotalAmount,
					com.tools20022.repository.msg.UnderlyingPaymentInstruction2.OriginalInstructedAmount, com.tools20022.repository.msg.PaymentComplementaryInformation3.Amount,
					com.tools20022.repository.msg.PaymentTransaction39.OriginalInstructedAmount, com.tools20022.repository.msg.RequestedModification3.Amount, com.tools20022.repository.msg.OriginalItem3.Amount,
					com.tools20022.repository.msg.OriginalTransactionReference9.Amount, com.tools20022.repository.msg.OriginalTransactionReference12.Amount, com.tools20022.repository.msg.OriginalTransactionReference11.Amount,
					com.tools20022.repository.msg.PaymentTransactionInformation16.ReturnedInstructedAmount, com.tools20022.repository.msg.PaymentTransactionInformation23.ReturnedInstructedAmount,
					com.tools20022.repository.msg.PaymentTransactionInformation17.ReversedInstructedAmount, com.tools20022.repository.msg.PaymentTransactionInformation24.ReversedInstructedAmount,
					com.tools20022.repository.msg.PaymentTransactionInformation21.ReturnedInstructedAmount, com.tools20022.repository.msg.CreditTransferTransactionInformation7.InstructedAmount,
					com.tools20022.repository.msg.CreditTransferTransactionInformation9.InstructedAmount, com.tools20022.repository.msg.DirectDebitTransactionInformation6.InstructedAmount,
					com.tools20022.repository.msg.DirectDebitTransactionInformation8.InstructedAmount, com.tools20022.repository.msg.RedemptionExecution12.SettlementAmount, com.tools20022.repository.msg.PaymentSearch5.InstructedAmount,
					com.tools20022.repository.msg.PaymentInstruction14.InstructedAmount, com.tools20022.repository.msg.CardPaymentTransactionDetails12.TotalAmount, com.tools20022.repository.msg.CardPaymentTransactionDetails13.TotalAmount,
					com.tools20022.repository.msg.CardPaymentTransactionDetails18.TotalAmount, com.tools20022.repository.msg.CardPaymentTransactionDetails16.TotalAmount,
					com.tools20022.repository.msg.CardPaymentTransactionDetails14.TotalAmount, com.tools20022.repository.msg.CardPaymentTransactionDetails15.TotalAmount,
					com.tools20022.repository.msg.CardPaymentTransactionDetails17.TotalAmount, com.tools20022.repository.msg.PaymentComplementaryInformation4.Amount,
					com.tools20022.repository.msg.PaymentTransaction50.ReturnedInstructedAmount, com.tools20022.repository.msg.CreditTransferTransaction19.InstructedAmount,
					com.tools20022.repository.msg.DirectDebitTransactionInformation17.InstructedAmount, com.tools20022.repository.msg.PaymentTransaction51.ReversedInstructedAmount, com.tools20022.repository.msg.OriginalItem4.Amount,
					com.tools20022.repository.msg.RequestedModification4.Amount, com.tools20022.repository.msg.PaymentTransaction58.OriginalInstructedAmount, com.tools20022.repository.msg.PaymentTransaction54.OriginalInstructedAmount,
					com.tools20022.repository.msg.OriginalTransactionReference20.Amount, com.tools20022.repository.msg.CreditTransferTransaction18.InstructedAmount,
					com.tools20022.repository.msg.PaymentTransaction56.OriginalInstructedAmount, com.tools20022.repository.msg.PaymentTransaction56.ReversedInstructedAmount,
					com.tools20022.repository.msg.DirectDebitTransactionInformation18.InstructedAmount, com.tools20022.repository.msg.CreditTransferTransaction20.Amount, com.tools20022.repository.choice.AmountType4Choice.InstructedAmount,
					com.tools20022.repository.msg.CreditTransferTransaction21.Amount, com.tools20022.repository.msg.CardPaymentTransactionDetails20.TotalAmount, com.tools20022.repository.msg.CardPaymentTransactionDetails25.TotalAmount,
					com.tools20022.repository.msg.CardPaymentTransactionDetails23.TotalAmount, com.tools20022.repository.msg.CardPaymentTransactionDetails21.TotalAmount,
					com.tools20022.repository.msg.CardPaymentTransactionDetails26.TotalAmount, com.tools20022.repository.msg.CardPaymentTransactionDetails19.TotalAmount,
					com.tools20022.repository.msg.CardPaymentTransactionDetails24.TotalAmount, com.tools20022.repository.msg.CardPaymentTransactionDetails22.TotalAmount,
					com.tools20022.repository.msg.CardTransactionDetail5.TransactionAmounts, com.tools20022.repository.msg.CardTransactionDetail1.TransactionAmounts, com.tools20022.repository.msg.CardTransactionDetail6.TransactionAmounts,
					com.tools20022.repository.msg.CardTransactionDetail3.TransactionAmounts, com.tools20022.repository.msg.SpecialCondition1.IncomingAmount, com.tools20022.repository.msg.SpecialCondition1.OutgoingAmount,
					com.tools20022.repository.msg.SpecialCondition1.IncomingAmountToOtherAccount, com.tools20022.repository.msg.SpecialCondition1.PaymentFromOtherAccount, com.tools20022.repository.msg.RequestedModification5.Amount,
					com.tools20022.repository.msg.CreditTransferTransaction25.InstructedAmount, com.tools20022.repository.msg.PaymentTransaction65.ReturnedInstructedAmount,
					com.tools20022.repository.msg.PaymentComplementaryInformation5.Amount, com.tools20022.repository.msg.DirectDebitTransactionInformation20.InstructedAmount,
					com.tools20022.repository.msg.PaymentTransaction60.ReversedInstructedAmount, com.tools20022.repository.msg.PaymentTransaction61.OriginalInstructedAmount,
					com.tools20022.repository.msg.OriginalTransactionReference22.Amount, com.tools20022.repository.msg.CreditTransferTransaction24.InstructedAmount, com.tools20022.repository.msg.CreditTransferTransaction26.Amount,
					com.tools20022.repository.msg.OriginalItem5.Amount, com.tools20022.repository.msg.DirectDebitTransactionInformation19.InstructedAmount, com.tools20022.repository.msg.PaymentTransaction66.OriginalInstructedAmount,
					com.tools20022.repository.msg.CreditTransferTransaction22.Amount, com.tools20022.repository.msg.PaymentTransaction64.OriginalInstructedAmount, com.tools20022.repository.msg.PaymentTransaction64.ReversedInstructedAmount,
					com.tools20022.repository.msg.CardPaymentTransactionDetails32.TotalAmount, com.tools20022.repository.msg.CardPaymentTransactionDetails33.TotalAmount,
					com.tools20022.repository.msg.CardPaymentTransactionDetails28.TotalAmount, com.tools20022.repository.msg.CardPaymentTransactionDetails29.TotalAmount,
					com.tools20022.repository.msg.CardPaymentTransactionDetails30.TotalAmount, com.tools20022.repository.msg.CardPaymentTransactionDetails27.TotalAmount,
					com.tools20022.repository.msg.CardPaymentTransactionDetails31.TotalAmount, com.tools20022.repository.msg.CardPaymentTransactionDetails35.TotalAmount,
					com.tools20022.repository.msg.CardPaymentTransactionDetails34.TotalAmount, com.tools20022.repository.msg.SubscriptionBulkOrder5.TotalSettlementAmount,
					com.tools20022.repository.msg.RedemptionBulkExecution5.TotalSettlementAmount, com.tools20022.repository.msg.RedemptionMultipleExecution5.TotalSettlementAmount,
					com.tools20022.repository.msg.RedemptionMultipleOrder6.TotalSettlementAmount, com.tools20022.repository.msg.SubscriptionMultipleOrder6.TotalSettlementAmount,
					com.tools20022.repository.msg.SubscriptionBulkExecution4.TotalSettlementAmount, com.tools20022.repository.msg.RedemptionBulkOrder6.TotalSettlementAmount,
					com.tools20022.repository.msg.SubscriptionMultipleExecution5.TotalSettlementAmount, com.tools20022.repository.msg.FundOrderData5.SettlementAmount, com.tools20022.repository.msg.RedemptionExecution16.SettlementAmount,
					com.tools20022.repository.msg.FundOrderData6.SettlementAmount, com.tools20022.repository.msg.RedemptionExecution15.SettlementAmount, com.tools20022.repository.msg.DirectDebitTransactionInformation21.InstructedAmount,
					com.tools20022.repository.msg.PaymentTransaction81.ReversedInstructedAmount, com.tools20022.repository.msg.RequestedModification6.Amount, com.tools20022.repository.msg.PaymentTransaction76.ReturnedInstructedAmount,
					com.tools20022.repository.msg.PaymentTransaction78.OriginalInstructedAmount, com.tools20022.repository.msg.OriginalTransactionReference24.Amount,
					com.tools20022.repository.msg.PaymentTransaction74.OriginalInstructedAmount, com.tools20022.repository.msg.PaymentTransaction77.OriginalInstructedAmount,
					com.tools20022.repository.msg.PaymentTransaction77.ReversedInstructedAmount, com.tools20022.repository.msg.DirectDebitTransactionInformation22.InstructedAmount,
					com.tools20022.repository.msg.CorrectivePaymentInitiation2.InstructedAmount, com.tools20022.repository.msg.UnderlyingPaymentInstruction3.OriginalInstructedAmount,
					com.tools20022.repository.msg.PaymentComplementaryInformation6.Amount, com.tools20022.repository.msg.CardPaymentTransactionDetails39.TotalAmount,
					com.tools20022.repository.msg.CardPaymentTransactionDetails38.TotalAmount, com.tools20022.repository.msg.CardPaymentTransactionDetails41.TotalAmount,
					com.tools20022.repository.msg.CardPaymentTransactionDetails37.TotalAmount, com.tools20022.repository.msg.CardPaymentTransactionDetails40.TotalAmount,
					com.tools20022.repository.msg.CardPaymentTransactionDetails42.TotalAmount, com.tools20022.repository.msg.CardPaymentTransactionDetails43.TotalAmount);
			elementContext_lazy = () -> Payment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InstructedAmount";
			definition = "Amount of money to be moved between the debtor and creditor, before deduction of charges, expressed in the currency as ordered by the initiating party.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Urgency or order of importance that the originator would like the
	 * recipient of the payment to apply to its processing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.PriorityCode
	 * PriorityCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.choice.PriorityCodeChoice#Code
	 * PriorityCodeChoice.Code}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentSearch2#Priority
	 * PaymentSearch2.Priority}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentSearch3#Priority
	 * PaymentSearch3.Priority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriorityCode2Choice#Code
	 * PriorityCode2Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriorityCode2Choice#Proprietary
	 * PriorityCode2Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentSearch4#Priority
	 * PaymentSearch4.Priority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction2#Priority
	 * PaymentInstruction2.Priority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction1#Priority
	 * PaymentInstruction1.Priority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Cheque5#InstructionPriority
	 * Cheque5.InstructionPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Cheque6#InstructionPriority
	 * Cheque6.InstructionPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Cheque7#InstructionPriority
	 * Cheque7.InstructionPriority}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.IntraBalance1#Priority
	 * IntraBalance1.Priority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction12#Priority
	 * PaymentInstruction12.Priority}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentSearch5#Priority
	 * PaymentSearch5.Priority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriorityCode3Choice#Code
	 * PriorityCode3Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriorityCode3Choice#Proprietary
	 * PriorityCode3Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction14#Priority
	 * PaymentInstruction14.Priority}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Payment
	 * Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Priority"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Urgency or order of importance that the originator would like the recipient of the payment  to apply to its processing."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Priority = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.PriorityCodeChoice.Code, com.tools20022.repository.msg.PaymentSearch2.Priority, com.tools20022.repository.msg.PaymentSearch3.Priority,
					com.tools20022.repository.choice.PriorityCode2Choice.Code, com.tools20022.repository.choice.PriorityCode2Choice.Proprietary, com.tools20022.repository.msg.PaymentSearch4.Priority,
					com.tools20022.repository.msg.PaymentInstruction2.Priority, com.tools20022.repository.msg.PaymentInstruction1.Priority, com.tools20022.repository.msg.Cheque5.InstructionPriority,
					com.tools20022.repository.msg.Cheque6.InstructionPriority, com.tools20022.repository.msg.Cheque7.InstructionPriority, com.tools20022.repository.msg.IntraBalance1.Priority,
					com.tools20022.repository.msg.PaymentInstruction12.Priority, com.tools20022.repository.msg.PaymentSearch5.Priority, com.tools20022.repository.choice.PriorityCode3Choice.Code,
					com.tools20022.repository.choice.PriorityCode3Choice.Proprietary, com.tools20022.repository.msg.PaymentInstruction14.Priority);
			elementContext_lazy = () -> Payment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Priority";
			definition = "Urgency or order of importance that the originator would like the recipient of the payment  to apply to its processing.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PriorityCode.mmObject();
		}
	};
	/**
	 * Date on which a payment must be executed
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
	 * {@linkplain com.tools20022.repository.msg.PaymentDetails5#TransferValueDate
	 * PaymentDetails5.TransferValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection32#ValueDate
	 * AmountAndDirection32.ValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection33#ValueDate
	 * AmountAndDirection33.ValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection2#ValueDate
	 * AmountAndDirection2.ValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection16#ValueDate
	 * AmountAndDirection16.ValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails5#ExpectedValueDate
	 * TransactionDetails5.ExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails9#ExpectedValueDate
	 * TransactionDetails9.ExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails22#ExpectedValueDate
	 * TransactionDetails22.ExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails23#ExpectedValueDate
	 * TransactionDetails23.ExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails36#ExpectedValueDate
	 * TransactionDetails36.ExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails47#ExpectedValueDate
	 * TransactionDetails47.ExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails53#ExpectedValueDate
	 * TransactionDetails53.ExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails58#ExpectedValueDate
	 * TransactionDetails58.ExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails7#ExpectedValueDate
	 * TransactionDetails7.ExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails8#ExpectedValueDate
	 * TransactionDetails8.ExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails16#ExpectedValueDate
	 * TransactionDetails16.ExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails17#ExpectedValueDate
	 * TransactionDetails17.ExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails26#ExpectedValueDate
	 * TransactionDetails26.ExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails25#ExpectedValueDate
	 * TransactionDetails25.ExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails27#ExpectedValueDate
	 * TransactionDetails27.ExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails33#ExpectedValueDate
	 * TransactionDetails33.ExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails39#ExpectedValueDate
	 * TransactionDetails39.ExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails50#ExpectedValueDate
	 * TransactionDetails50.ExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails56#ExpectedValueDate
	 * TransactionDetails56.ExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails59#ExpectedValueDate
	 * TransactionDetails59.ExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection28#ValueDate
	 * AmountAndDirection28.ValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NetCashForecast1#SettlementDate
	 * NetCashForecast1.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NetCashForecast2#CashSettlementDate
	 * NetCashForecast2.CashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction18#SettlementDate
	 * PaymentTransaction18.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction15#SettlementDate
	 * PaymentTransaction15.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder5#CashSettlementDate
	 * RedemptionOrder5.CashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkOrder3#CashSettlementDate
	 * RedemptionBulkOrder3.CashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution5#CashSettlementDate
	 * RedemptionExecution5.CashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkExecution3#CashSettlementDate
	 * RedemptionBulkExecution3.CashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder7#CashSettlementDate
	 * RedemptionOrder7.CashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkOrder4#CashSettlementDate
	 * RedemptionBulkOrder4.CashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder6#CashSettlementDate
	 * RedemptionOrder6.CashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder3#CashSettlementDate
	 * RedemptionMultipleOrder3.CashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#CashSettlementDate
	 * RedemptionExecution6.CashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution3#CashSettlementDate
	 * RedemptionMultipleExecution3.CashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder8#CashSettlementDate
	 * RedemptionOrder8.CashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder4#CashSettlementDate
	 * RedemptionMultipleOrder4.CashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction17#SettlementDate
	 * PaymentTransaction17.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction19#SettlementDate
	 * PaymentTransaction19.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder5#CashSettlementDate
	 * SubscriptionOrder5.CashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkOrder3#CashSettlementDate
	 * SubscriptionBulkOrder3.CashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction16#SettlementDate
	 * PaymentTransaction16.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction13#SettlementDate
	 * PaymentTransaction13.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution5#CashSettlementDate
	 * SubscriptionExecution5.CashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkExecution3#CashSettlementDate
	 * SubscriptionBulkExecution3.CashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder7#CashSettlementDate
	 * SubscriptionOrder7.CashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkOrder4#CashSettlementDate
	 * SubscriptionBulkOrder4.CashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder6#CashSettlementDate
	 * SubscriptionOrder6.CashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder3#CashSettlementDate
	 * SubscriptionMultipleOrder3.CashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#CashSettlementDate
	 * SubscriptionExecution6.CashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleExecution3#CashSettlementDate
	 * SubscriptionMultipleExecution3.CashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder8#CashSettlementDate
	 * SubscriptionOrder8.CashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder4#CashSettlementDate
	 * SubscriptionMultipleOrder4.CashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction20#SettlementDate
	 * PaymentTransaction20.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder3#CashSettlementDate
	 * SwitchOrder3.CashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction14#SettlementDate
	 * PaymentTransaction14.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution4#CashSettlementDate
	 * SwitchExecution4.CashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder4#CashSettlementDate
	 * SwitchOrder4.CashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionExtract#ValueDate
	 * PaymentInstructionExtract.ValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification#ValueDate
	 * RequestedModification.ValueDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashMovement3#ValueDate
	 * CashMovement3.ValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails2#ExpectedValueDate
	 * SecuritiesFinancingTransactionDetails2.ExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails8#ExpectedValueDate
	 * SecuritiesFinancingTransactionDetails8.ExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection22#ValueDate
	 * AmountAndDirection22.ValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NotificationEntry2#ExpectedValueDate
	 * NotificationEntry2.ExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NotificationItem3#ExpectedValueDate
	 * NotificationItem3.ExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountNotification4#ExpectedValueDate
	 * AccountNotification4.ExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItem1#ExpectedValueDate
	 * OriginalItem1.ExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItem2#ExpectedValueDate
	 * OriginalItem2.ExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference1#ExpectedValueDate
	 * OriginalNotificationReference1.ExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItemAndStatus1#ExpectedValueDate
	 * OriginalItemAndStatus1.ExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItemAndStatus2#ExpectedValueDate
	 * OriginalItemAndStatus2.ExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference2#ExpectedValueDate
	 * OriginalNotificationReference2.ExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementData1#SettlementDate
	 * SettlementData1.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementData2#SettlementDate
	 * SettlementData2.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails6#ExpectedValueDate
	 * SecuritiesFinancingTransactionDetails6.ExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails10#ExpectedValueDate
	 * SecuritiesFinancingTransactionDetails10.ExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails17#ExpectedValueDate
	 * SecuritiesFinancingTransactionDetails17.ExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails18#ExpectedValueDate
	 * SecuritiesFinancingTransactionDetails18.ExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection25#ValueDate
	 * AmountAndDirection25.ValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NotificationItem4#ExpectedValueDate
	 * NotificationItem4.ExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountNotification6#ExpectedValueDate
	 * AccountNotification6.ExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItem3#ExpectedValueDate
	 * OriginalItem3.ExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference4#ExpectedValueDate
	 * OriginalNotificationReference4.ExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItemAndStatus3#ExpectedValueDate
	 * OriginalItemAndStatus3.ExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference3#ExpectedValueDate
	 * OriginalNotificationReference3.ExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashCompensation1#ValueDate
	 * CashCompensation1.ValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution10#CashSettlementDate
	 * RedemptionExecution10.CashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder9#CashSettlementDate
	 * RedemptionOrder9.CashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7#CashSettlementDate
	 * SubscriptionExecution7.CashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder9#CashSettlementDate
	 * SubscriptionOrder9.CashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution12#CashSettlementDate
	 * RedemptionExecution12.CashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution9#CashSettlementDate
	 * SubscriptionExecution9.CashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails61#ExpectedValueDate
	 * TransactionDetails61.ExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection36#ValueDate
	 * AmountAndDirection36.ValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails21#ExpectedValueDate
	 * SecuritiesFinancingTransactionDetails21.ExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails62#ExpectedValueDate
	 * TransactionDetails62.ExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection37#ValueDate
	 * AmountAndDirection37.ValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection38#ValueDate
	 * AmountAndDirection38.ValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails22#ExpectedValueDate
	 * SecuritiesFinancingTransactionDetails22.ExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails66#ExpectedValueDate
	 * TransactionDetails66.ExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails67#ExpectedValueDate
	 * TransactionDetails67.ExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection40#ValueDate
	 * AmountAndDirection40.ValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregationTransaction1#FirstPaymentDateTime
	 * AggregationTransaction1.FirstPaymentDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregationTransaction1#LastPaymentDateTime
	 * AggregationTransaction1.LastPaymentDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NetCashForecast4#CashSettlementDate
	 * NetCashForecast4.CashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountNotification10#ExpectedValueDate
	 * AccountNotification10.ExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference6#ExpectedValueDate
	 * OriginalNotificationReference6.ExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItem4#ExpectedValueDate
	 * OriginalItem4.ExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItemAndStatus4#ExpectedValueDate
	 * OriginalItemAndStatus4.ExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference5#ExpectedValueDate
	 * OriginalNotificationReference5.ExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NotificationItem5#ExpectedValueDate
	 * NotificationItem5.ExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails24#ExpectedValueDate
	 * SecuritiesFinancingTransactionDetails24.ExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails70#ExpectedValueDate
	 * TransactionDetails70.ExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails69#ExpectedValueDate
	 * TransactionDetails69.ExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NetCashForecast5#CashSettlementDate
	 * NetCashForecast5.CashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails71#ExpectedValueDate
	 * TransactionDetails71.ExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails25#ExpectedValueDate
	 * SecuritiesFinancingTransactionDetails25.ExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails72#ExpectedValueDate
	 * TransactionDetails72.ExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMAccountStatement2#ValueDate
	 * ATMAccountStatement2.ValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26#ExpectedValueDate
	 * SecuritiesFinancingTransactionDetails26.ExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails79#ExpectedValueDate
	 * TransactionDetails79.ExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails75#ExpectedValueDate
	 * TransactionDetails75.ExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection46#ValueDate
	 * AmountAndDirection46.ValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection48#ValueDate
	 * AmountAndDirection48.ValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection45#ValueDate
	 * AmountAndDirection45.ValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountNotification13#ExpectedValueDate
	 * AccountNotification13.ExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference8#ExpectedValueDate
	 * OriginalNotificationReference8.ExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItem5#ExpectedValueDate
	 * OriginalItem5.ExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItemAndStatus5#ExpectedValueDate
	 * OriginalItemAndStatus5.ExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference7#ExpectedValueDate
	 * OriginalNotificationReference7.ExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NotificationItem6#ExpectedValueDate
	 * NotificationItem6.ExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33#ExpectedValueDate
	 * SecuritiesFinancingTransactionDetails33.ExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection60#ValueDate
	 * AmountAndDirection60.ValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails87#ExpectedValueDate
	 * TransactionDetails87.ExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection71#ValueDate
	 * AmountAndDirection71.ValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection85#ValueDate
	 * AmountAndDirection85.ValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails90#ExpectedValueDate
	 * TransactionDetails90.ExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregationTransaction2#FirstPaymentDateTime
	 * AggregationTransaction2.FirstPaymentDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregationTransaction2#LastPaymentDateTime
	 * AggregationTransaction2.LastPaymentDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution7#CashSettlementDate
	 * SwitchExecution7.CashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder7#CashSettlementDate
	 * SwitchOrder7.CashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder14#CashSettlementDate
	 * RedemptionOrder14.CashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#CashSettlementDate
	 * SubscriptionExecution13.CashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution12#CashSettlementDate
	 * SubscriptionExecution12.CashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder15#CashSettlementDate
	 * SubscriptionOrder15.CashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder15#CashSettlementDate
	 * RedemptionOrder15.CashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#CashSettlementDate
	 * RedemptionExecution16.CashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder14#CashSettlementDate
	 * SubscriptionOrder14.CashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#CashSettlementDate
	 * RedemptionExecution15.CashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails97#ExpectedValueDate
	 * TransactionDetails97.ExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35#ExpectedValueDate
	 * SecuritiesFinancingTransactionDetails35.ExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails96#ExpectedValueDate
	 * TransactionDetails96.ExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails36#ExpectedValueDate
	 * SecuritiesFinancingTransactionDetails36.ExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails100#ExpectedValueDate
	 * TransactionDetails100.ExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails99#ExpectedValueDate
	 * TransactionDetails99.ExpectedValueDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Payment
	 * Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValueDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date on which a payment must be executed"</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ValueDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentDetails5.TransferValueDate, com.tools20022.repository.msg.AmountAndDirection32.ValueDate, com.tools20022.repository.msg.AmountAndDirection33.ValueDate,
					com.tools20022.repository.msg.AmountAndDirection2.ValueDate, com.tools20022.repository.msg.AmountAndDirection16.ValueDate, com.tools20022.repository.msg.TransactionDetails5.ExpectedValueDate,
					com.tools20022.repository.msg.TransactionDetails9.ExpectedValueDate, com.tools20022.repository.msg.TransactionDetails22.ExpectedValueDate, com.tools20022.repository.msg.TransactionDetails23.ExpectedValueDate,
					com.tools20022.repository.msg.TransactionDetails36.ExpectedValueDate, com.tools20022.repository.msg.TransactionDetails47.ExpectedValueDate, com.tools20022.repository.msg.TransactionDetails53.ExpectedValueDate,
					com.tools20022.repository.msg.TransactionDetails58.ExpectedValueDate, com.tools20022.repository.msg.TransactionDetails7.ExpectedValueDate, com.tools20022.repository.msg.TransactionDetails8.ExpectedValueDate,
					com.tools20022.repository.msg.TransactionDetails16.ExpectedValueDate, com.tools20022.repository.msg.TransactionDetails17.ExpectedValueDate, com.tools20022.repository.msg.TransactionDetails26.ExpectedValueDate,
					com.tools20022.repository.msg.TransactionDetails25.ExpectedValueDate, com.tools20022.repository.msg.TransactionDetails27.ExpectedValueDate, com.tools20022.repository.msg.TransactionDetails33.ExpectedValueDate,
					com.tools20022.repository.msg.TransactionDetails39.ExpectedValueDate, com.tools20022.repository.msg.TransactionDetails50.ExpectedValueDate, com.tools20022.repository.msg.TransactionDetails56.ExpectedValueDate,
					com.tools20022.repository.msg.TransactionDetails59.ExpectedValueDate, com.tools20022.repository.msg.AmountAndDirection28.ValueDate, com.tools20022.repository.msg.NetCashForecast1.SettlementDate,
					com.tools20022.repository.msg.NetCashForecast2.CashSettlementDate, com.tools20022.repository.msg.PaymentTransaction18.SettlementDate, com.tools20022.repository.msg.PaymentTransaction15.SettlementDate,
					com.tools20022.repository.msg.RedemptionOrder5.CashSettlementDate, com.tools20022.repository.msg.RedemptionBulkOrder3.CashSettlementDate, com.tools20022.repository.msg.RedemptionExecution5.CashSettlementDate,
					com.tools20022.repository.msg.RedemptionBulkExecution3.CashSettlementDate, com.tools20022.repository.msg.RedemptionOrder7.CashSettlementDate, com.tools20022.repository.msg.RedemptionBulkOrder4.CashSettlementDate,
					com.tools20022.repository.msg.RedemptionOrder6.CashSettlementDate, com.tools20022.repository.msg.RedemptionMultipleOrder3.CashSettlementDate, com.tools20022.repository.msg.RedemptionExecution6.CashSettlementDate,
					com.tools20022.repository.msg.RedemptionMultipleExecution3.CashSettlementDate, com.tools20022.repository.msg.RedemptionOrder8.CashSettlementDate,
					com.tools20022.repository.msg.RedemptionMultipleOrder4.CashSettlementDate, com.tools20022.repository.msg.PaymentTransaction17.SettlementDate, com.tools20022.repository.msg.PaymentTransaction19.SettlementDate,
					com.tools20022.repository.msg.SubscriptionOrder5.CashSettlementDate, com.tools20022.repository.msg.SubscriptionBulkOrder3.CashSettlementDate, com.tools20022.repository.msg.PaymentTransaction16.SettlementDate,
					com.tools20022.repository.msg.PaymentTransaction13.SettlementDate, com.tools20022.repository.msg.SubscriptionExecution5.CashSettlementDate, com.tools20022.repository.msg.SubscriptionBulkExecution3.CashSettlementDate,
					com.tools20022.repository.msg.SubscriptionOrder7.CashSettlementDate, com.tools20022.repository.msg.SubscriptionBulkOrder4.CashSettlementDate, com.tools20022.repository.msg.SubscriptionOrder6.CashSettlementDate,
					com.tools20022.repository.msg.SubscriptionMultipleOrder3.CashSettlementDate, com.tools20022.repository.msg.SubscriptionExecution6.CashSettlementDate,
					com.tools20022.repository.msg.SubscriptionMultipleExecution3.CashSettlementDate, com.tools20022.repository.msg.SubscriptionOrder8.CashSettlementDate,
					com.tools20022.repository.msg.SubscriptionMultipleOrder4.CashSettlementDate, com.tools20022.repository.msg.PaymentTransaction20.SettlementDate, com.tools20022.repository.msg.SwitchOrder3.CashSettlementDate,
					com.tools20022.repository.msg.PaymentTransaction14.SettlementDate, com.tools20022.repository.msg.SwitchExecution4.CashSettlementDate, com.tools20022.repository.msg.SwitchOrder4.CashSettlementDate,
					com.tools20022.repository.msg.PaymentInstructionExtract.ValueDate, com.tools20022.repository.msg.RequestedModification.ValueDate, com.tools20022.repository.msg.CashMovement3.ValueDate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails2.ExpectedValueDate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails8.ExpectedValueDate,
					com.tools20022.repository.msg.AmountAndDirection22.ValueDate, com.tools20022.repository.msg.NotificationEntry2.ExpectedValueDate, com.tools20022.repository.msg.NotificationItem3.ExpectedValueDate,
					com.tools20022.repository.msg.AccountNotification4.ExpectedValueDate, com.tools20022.repository.msg.OriginalItem1.ExpectedValueDate, com.tools20022.repository.msg.OriginalItem2.ExpectedValueDate,
					com.tools20022.repository.msg.OriginalNotificationReference1.ExpectedValueDate, com.tools20022.repository.msg.OriginalItemAndStatus1.ExpectedValueDate,
					com.tools20022.repository.msg.OriginalItemAndStatus2.ExpectedValueDate, com.tools20022.repository.msg.OriginalNotificationReference2.ExpectedValueDate, com.tools20022.repository.msg.SettlementData1.SettlementDate,
					com.tools20022.repository.msg.SettlementData2.SettlementDate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails6.ExpectedValueDate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails10.ExpectedValueDate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails17.ExpectedValueDate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails18.ExpectedValueDate, com.tools20022.repository.msg.AmountAndDirection25.ValueDate, com.tools20022.repository.msg.NotificationItem4.ExpectedValueDate,
					com.tools20022.repository.msg.AccountNotification6.ExpectedValueDate, com.tools20022.repository.msg.OriginalItem3.ExpectedValueDate, com.tools20022.repository.msg.OriginalNotificationReference4.ExpectedValueDate,
					com.tools20022.repository.msg.OriginalItemAndStatus3.ExpectedValueDate, com.tools20022.repository.msg.OriginalNotificationReference3.ExpectedValueDate, com.tools20022.repository.msg.CashCompensation1.ValueDate,
					com.tools20022.repository.msg.RedemptionExecution10.CashSettlementDate, com.tools20022.repository.msg.RedemptionOrder9.CashSettlementDate, com.tools20022.repository.msg.SubscriptionExecution7.CashSettlementDate,
					com.tools20022.repository.msg.SubscriptionOrder9.CashSettlementDate, com.tools20022.repository.msg.RedemptionExecution12.CashSettlementDate, com.tools20022.repository.msg.SubscriptionExecution9.CashSettlementDate,
					com.tools20022.repository.msg.TransactionDetails61.ExpectedValueDate, com.tools20022.repository.msg.AmountAndDirection36.ValueDate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails21.ExpectedValueDate, com.tools20022.repository.msg.TransactionDetails62.ExpectedValueDate,
					com.tools20022.repository.msg.AmountAndDirection37.ValueDate, com.tools20022.repository.msg.AmountAndDirection38.ValueDate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails22.ExpectedValueDate,
					com.tools20022.repository.msg.TransactionDetails66.ExpectedValueDate, com.tools20022.repository.msg.TransactionDetails67.ExpectedValueDate, com.tools20022.repository.msg.AmountAndDirection40.ValueDate,
					com.tools20022.repository.msg.AggregationTransaction1.FirstPaymentDateTime, com.tools20022.repository.msg.AggregationTransaction1.LastPaymentDateTime, com.tools20022.repository.msg.NetCashForecast4.CashSettlementDate,
					com.tools20022.repository.msg.AccountNotification10.ExpectedValueDate, com.tools20022.repository.msg.OriginalNotificationReference6.ExpectedValueDate, com.tools20022.repository.msg.OriginalItem4.ExpectedValueDate,
					com.tools20022.repository.msg.OriginalItemAndStatus4.ExpectedValueDate, com.tools20022.repository.msg.OriginalNotificationReference5.ExpectedValueDate, com.tools20022.repository.msg.NotificationItem5.ExpectedValueDate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails24.ExpectedValueDate, com.tools20022.repository.msg.TransactionDetails70.ExpectedValueDate,
					com.tools20022.repository.msg.TransactionDetails69.ExpectedValueDate, com.tools20022.repository.msg.NetCashForecast5.CashSettlementDate, com.tools20022.repository.msg.TransactionDetails71.ExpectedValueDate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails25.ExpectedValueDate, com.tools20022.repository.msg.TransactionDetails72.ExpectedValueDate,
					com.tools20022.repository.msg.ATMAccountStatement2.ValueDate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26.ExpectedValueDate,
					com.tools20022.repository.msg.TransactionDetails79.ExpectedValueDate, com.tools20022.repository.msg.TransactionDetails75.ExpectedValueDate, com.tools20022.repository.msg.AmountAndDirection46.ValueDate,
					com.tools20022.repository.msg.AmountAndDirection48.ValueDate, com.tools20022.repository.msg.AmountAndDirection45.ValueDate, com.tools20022.repository.msg.AccountNotification13.ExpectedValueDate,
					com.tools20022.repository.msg.OriginalNotificationReference8.ExpectedValueDate, com.tools20022.repository.msg.OriginalItem5.ExpectedValueDate, com.tools20022.repository.msg.OriginalItemAndStatus5.ExpectedValueDate,
					com.tools20022.repository.msg.OriginalNotificationReference7.ExpectedValueDate, com.tools20022.repository.msg.NotificationItem6.ExpectedValueDate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33.ExpectedValueDate, com.tools20022.repository.msg.AmountAndDirection60.ValueDate,
					com.tools20022.repository.msg.TransactionDetails87.ExpectedValueDate, com.tools20022.repository.msg.AmountAndDirection71.ValueDate, com.tools20022.repository.msg.AmountAndDirection85.ValueDate,
					com.tools20022.repository.msg.TransactionDetails90.ExpectedValueDate, com.tools20022.repository.msg.AggregationTransaction2.FirstPaymentDateTime,
					com.tools20022.repository.msg.AggregationTransaction2.LastPaymentDateTime, com.tools20022.repository.msg.SwitchExecution7.CashSettlementDate, com.tools20022.repository.msg.SwitchOrder7.CashSettlementDate,
					com.tools20022.repository.msg.RedemptionOrder14.CashSettlementDate, com.tools20022.repository.msg.SubscriptionExecution13.CashSettlementDate, com.tools20022.repository.msg.SubscriptionExecution12.CashSettlementDate,
					com.tools20022.repository.msg.SubscriptionOrder15.CashSettlementDate, com.tools20022.repository.msg.RedemptionOrder15.CashSettlementDate, com.tools20022.repository.msg.RedemptionExecution16.CashSettlementDate,
					com.tools20022.repository.msg.SubscriptionOrder14.CashSettlementDate, com.tools20022.repository.msg.RedemptionExecution15.CashSettlementDate, com.tools20022.repository.msg.TransactionDetails97.ExpectedValueDate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35.ExpectedValueDate, com.tools20022.repository.msg.TransactionDetails96.ExpectedValueDate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails36.ExpectedValueDate, com.tools20022.repository.msg.TransactionDetails100.ExpectedValueDate,
					com.tools20022.repository.msg.TransactionDetails99.ExpectedValueDate);
			elementContext_lazy = () -> Payment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ValueDate";
			definition = "Date on which a payment must be executed";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Specifies the status of a payment at a specified time.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentStatus#Payment
	 * PaymentStatus.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PaymentStatus
	 * PaymentStatus}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCommonDetails2#PaymentInstructionStatus
	 * PaymentCommonDetails2.PaymentInstructionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentDetails5#InstructionStatus
	 * PaymentDetails5.InstructionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCommonDetails3#PaymentInstructionStatus
	 * PaymentCommonDetails3.PaymentInstructionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentDetails6#InstructionStatus
	 * PaymentDetails6.InstructionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCommonDetails4#CommonInstructionStatus
	 * PaymentCommonDetails4.CommonInstructionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentDetails7#InstructionStatus
	 * PaymentDetails7.InstructionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCommon1#CommonStatus
	 * PaymentCommon1.CommonStatus}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentInstruction1#Status
	 * PaymentInstruction1.Status}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReturnReasonInformation5#ReturnReason
	 * ReturnReasonInformation5.ReturnReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction1#ReturnInformation
	 * EntryTransaction1.ReturnInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction2#ReturnInformation
	 * EntryTransaction2.ReturnInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction3#ReturnInformation
	 * EntryTransaction3.ReturnInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction4#ReturnInformation
	 * EntryTransaction4.ReturnInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInformation4#CancellationReasonInformation
	 * OriginalPaymentInformation4.CancellationReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation4#ReversalReasonInformation
	 * PaymentTransactionInformation4.ReversalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation28#ReversalReasonInformation
	 * PaymentTransactionInformation28.ReversalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader3#ReversalReasonInformation
	 * OriginalGroupHeader3.ReversalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction32#TransactionStatus
	 * PaymentTransaction32.TransactionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction46#TransactionStatus
	 * PaymentTransaction46.TransactionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation5#ReversalReasonInformation
	 * PaymentTransactionInformation5.ReversalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation29#ReversalReasonInformation
	 * PaymentTransactionInformation29.ReversalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction33#TransactionStatus
	 * PaymentTransaction33.TransactionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction43#TransactionStatus
	 * PaymentTransaction43.TransactionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation2#ReturnReasonInformation
	 * PaymentTransactionInformation2.ReturnReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation27#ReturnReasonInformation
	 * PaymentTransactionInformation27.ReturnReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction41#TransactionStatus
	 * PaymentTransaction41.TransactionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction49#TransactionStatus
	 * PaymentTransaction49.TransactionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInformation3#CancellationStatusReasonInformation
	 * OriginalPaymentInformation3.CancellationStatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction39#TransactionCancellationStatus
	 * PaymentTransaction39.TransactionCancellationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction40#TransactionCancellationStatus
	 * PaymentTransaction40.TransactionCancellationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation13#ReturnReasonInformation
	 * PaymentTransactionInformation13.ReturnReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation18#ReturnReasonInformation
	 * PaymentTransactionInformation18.ReturnReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation14#ReversalReasonInformation
	 * PaymentTransactionInformation14.ReversalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation20#ReversalReasonInformation
	 * PaymentTransactionInformation20.ReversalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation16#ReturnReasonInformation
	 * PaymentTransactionInformation16.ReturnReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation23#ReturnReasonInformation
	 * PaymentTransactionInformation23.ReturnReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation17#ReversalReasonInformation
	 * PaymentTransactionInformation17.ReversalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation24#ReversalReasonInformation
	 * PaymentTransactionInformation24.ReversalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation21#ReturnReasonInformation
	 * PaymentTransactionInformation21.ReturnReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceMovement1#StatusAndReason
	 * IntraBalanceMovement1.StatusAndReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceMovements1#StatusAndReason
	 * IntraBalanceMovements1.StatusAndReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalancePending2#StatusAndReason
	 * IntraBalancePending2.StatusAndReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalancePending1#StatusAndReason
	 * IntraBalancePending1.StatusAndReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCommon2#CommonStatus
	 * PaymentCommon2.CommonStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction14#Status
	 * PaymentInstruction14.Status}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction52#TransactionStatus
	 * PaymentTransaction52.TransactionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction54#TransactionCancellationStatus
	 * PaymentTransaction54.TransactionCancellationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction53#TransactionCancellationStatus
	 * PaymentTransaction53.TransactionCancellationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction57#TransactionStatus
	 * PaymentTransaction57.TransactionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction7#ReturnInformation
	 * EntryTransaction7.ReturnInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction59#TransactionStatus
	 * PaymentTransaction59.TransactionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction63#TransactionStatus
	 * PaymentTransaction63.TransactionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction68#TransactionStatus
	 * PaymentTransaction68.TransactionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction66#TransactionCancellationStatus
	 * PaymentTransaction66.TransactionCancellationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction67#TransactionCancellationStatus
	 * PaymentTransaction67.TransactionCancellationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction8#ReturnInformation
	 * EntryTransaction8.ReturnInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction69#TransactionStatus
	 * PaymentTransaction69.TransactionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction80#TransactionStatus
	 * PaymentTransaction80.TransactionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction78#TransactionCancellationStatus
	 * PaymentTransaction78.TransactionCancellationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction83#TransactionStatus
	 * PaymentTransaction83.TransactionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction82#TransactionStatus
	 * PaymentTransaction82.TransactionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction79#TransactionCancellationStatus
	 * PaymentTransaction79.TransactionCancellationStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Payment
	 * Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the status of a payment at a specified time."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd PaymentStatus = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentCommonDetails2.PaymentInstructionStatus, com.tools20022.repository.msg.PaymentDetails5.InstructionStatus,
					com.tools20022.repository.msg.PaymentCommonDetails3.PaymentInstructionStatus, com.tools20022.repository.msg.PaymentDetails6.InstructionStatus, com.tools20022.repository.msg.PaymentCommonDetails4.CommonInstructionStatus,
					com.tools20022.repository.msg.PaymentDetails7.InstructionStatus, com.tools20022.repository.msg.PaymentCommon1.CommonStatus, com.tools20022.repository.msg.PaymentInstruction1.Status,
					com.tools20022.repository.msg.ReturnReasonInformation5.ReturnReason, com.tools20022.repository.msg.EntryTransaction1.ReturnInformation, com.tools20022.repository.msg.EntryTransaction2.ReturnInformation,
					com.tools20022.repository.msg.EntryTransaction3.ReturnInformation, com.tools20022.repository.msg.EntryTransaction4.ReturnInformation,
					com.tools20022.repository.msg.OriginalPaymentInformation4.CancellationReasonInformation, com.tools20022.repository.msg.PaymentTransactionInformation4.ReversalReasonInformation,
					com.tools20022.repository.msg.PaymentTransactionInformation28.ReversalReasonInformation, com.tools20022.repository.msg.OriginalGroupHeader3.ReversalReasonInformation,
					com.tools20022.repository.msg.PaymentTransaction32.TransactionStatus, com.tools20022.repository.msg.PaymentTransaction46.TransactionStatus,
					com.tools20022.repository.msg.PaymentTransactionInformation5.ReversalReasonInformation, com.tools20022.repository.msg.PaymentTransactionInformation29.ReversalReasonInformation,
					com.tools20022.repository.msg.PaymentTransaction33.TransactionStatus, com.tools20022.repository.msg.PaymentTransaction43.TransactionStatus,
					com.tools20022.repository.msg.PaymentTransactionInformation2.ReturnReasonInformation, com.tools20022.repository.msg.PaymentTransactionInformation27.ReturnReasonInformation,
					com.tools20022.repository.msg.PaymentTransaction41.TransactionStatus, com.tools20022.repository.msg.PaymentTransaction49.TransactionStatus,
					com.tools20022.repository.msg.OriginalPaymentInformation3.CancellationStatusReasonInformation, com.tools20022.repository.msg.PaymentTransaction39.TransactionCancellationStatus,
					com.tools20022.repository.msg.PaymentTransaction40.TransactionCancellationStatus, com.tools20022.repository.msg.PaymentTransactionInformation13.ReturnReasonInformation,
					com.tools20022.repository.msg.PaymentTransactionInformation18.ReturnReasonInformation, com.tools20022.repository.msg.PaymentTransactionInformation14.ReversalReasonInformation,
					com.tools20022.repository.msg.PaymentTransactionInformation20.ReversalReasonInformation, com.tools20022.repository.msg.PaymentTransactionInformation16.ReturnReasonInformation,
					com.tools20022.repository.msg.PaymentTransactionInformation23.ReturnReasonInformation, com.tools20022.repository.msg.PaymentTransactionInformation17.ReversalReasonInformation,
					com.tools20022.repository.msg.PaymentTransactionInformation24.ReversalReasonInformation, com.tools20022.repository.msg.PaymentTransactionInformation21.ReturnReasonInformation,
					com.tools20022.repository.msg.IntraBalanceMovement1.StatusAndReason, com.tools20022.repository.msg.IntraBalanceMovements1.StatusAndReason, com.tools20022.repository.msg.IntraBalancePending2.StatusAndReason,
					com.tools20022.repository.msg.IntraBalancePending1.StatusAndReason, com.tools20022.repository.msg.PaymentCommon2.CommonStatus, com.tools20022.repository.msg.PaymentInstruction14.Status,
					com.tools20022.repository.msg.PaymentTransaction52.TransactionStatus, com.tools20022.repository.msg.PaymentTransaction54.TransactionCancellationStatus,
					com.tools20022.repository.msg.PaymentTransaction53.TransactionCancellationStatus, com.tools20022.repository.msg.PaymentTransaction57.TransactionStatus, com.tools20022.repository.msg.EntryTransaction7.ReturnInformation,
					com.tools20022.repository.msg.PaymentTransaction59.TransactionStatus, com.tools20022.repository.msg.PaymentTransaction63.TransactionStatus, com.tools20022.repository.msg.PaymentTransaction68.TransactionStatus,
					com.tools20022.repository.msg.PaymentTransaction66.TransactionCancellationStatus, com.tools20022.repository.msg.PaymentTransaction67.TransactionCancellationStatus,
					com.tools20022.repository.msg.EntryTransaction8.ReturnInformation, com.tools20022.repository.msg.PaymentTransaction69.TransactionStatus, com.tools20022.repository.msg.PaymentTransaction80.TransactionStatus,
					com.tools20022.repository.msg.PaymentTransaction78.TransactionCancellationStatus, com.tools20022.repository.msg.PaymentTransaction83.TransactionStatus,
					com.tools20022.repository.msg.PaymentTransaction82.TransactionStatus, com.tools20022.repository.msg.PaymentTransaction79.TransactionCancellationStatus);
			elementContext_lazy = () -> Payment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PaymentStatus";
			definition = "Specifies the status of a payment at a specified time.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.PaymentStatus.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentStatus.Payment;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies each role linked to a payment and played by a party at that
	 * step in a payment flow.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentPartyRole#Payment
	 * PaymentPartyRole.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PaymentPartyRole
	 * PaymentPartyRole}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentDetails5#PaymentTransactionParty
	 * PaymentDetails5.PaymentTransactionParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentDetails6#PaymentTransactionParty
	 * PaymentDetails6.PaymentTransactionParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentDetails7#PaymentTransactionParty
	 * PaymentDetails7.PaymentTransactionParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction1#Parties
	 * PaymentInstruction1.Parties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails3#CashParties
	 * SecuritiesSettlementTransactionDetails3.CashParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails4#CashParties
	 * SecuritiesSettlementTransactionDetails4.CashParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails2#CashParties
	 * SecuritiesSettlementTransactionDetails2.CashParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails5#CashParties
	 * SecuritiesSettlementTransactionDetails5.CashParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails6#CashParties
	 * SecuritiesSettlementTransactionDetails6.CashParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails7#CashParties
	 * SecuritiesSettlementTransactionDetails7.CashParties}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption2#CashParties
	 * CashOption2.CashParties}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption9#CashParties
	 * CashOption9.CashParties}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption12#CashParties
	 * CashOption12.CashParties}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption13#CashParties
	 * CashOption13.CashParties}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption18#CashParties
	 * CashOption18.CashParties}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption22#CashParties
	 * CashOption22.CashParties}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption26#CashParties
	 * CashOption26.CashParties}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption27#CashParties
	 * CashOption27.CashParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails8#CashParties
	 * SecuritiesSettlementTransactionDetails8.CashParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails9#CashParties
	 * SecuritiesSettlementTransactionDetails9.CashParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails10#CashParties
	 * SecuritiesSettlementTransactionDetails10.CashParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails11#CashParties
	 * SecuritiesSettlementTransactionDetails11.CashParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails12#CashParties
	 * SecuritiesSettlementTransactionDetails12.CashParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails13#CashParties
	 * SecuritiesSettlementTransactionDetails13.CashParties}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order3#CashParties
	 * Order3.CashParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction1#RelatedParties
	 * EntryTransaction1.RelatedParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction1#RelatedAgents
	 * EntryTransaction1.RelatedAgents}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction2#RelatedParties
	 * EntryTransaction2.RelatedParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction2#RelatedAgents
	 * EntryTransaction2.RelatedAgents}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction3#RelatedParties
	 * EntryTransaction3.RelatedParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction3#RelatedAgents
	 * EntryTransaction3.RelatedAgents}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction4#RelatedParties
	 * EntryTransaction4.RelatedParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction4#RelatedAgents
	 * EntryTransaction4.RelatedAgents}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrderStatusAndReason5#CashParties
	 * OrderStatusAndReason5.CashParties}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order9#CashParties
	 * Order9.CashParties}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.MassQuote1#CashParties
	 * MassQuote1.CashParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndicationOfInterest1#CashParties
	 * IndicationOfInterest1.CashParties}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order6#CashParties
	 * Order6.CashParties}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order11#CashParties
	 * Order11.CashParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction14#Parties
	 * PaymentInstruction14.Parties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails16#CashParties
	 * SecuritiesSettlementTransactionDetails16.CashParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails14#CashParties
	 * SecuritiesSettlementTransactionDetails14.CashParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails15#CashParties
	 * SecuritiesSettlementTransactionDetails15.CashParties}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption30#CashParties
	 * CashOption30.CashParties}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption38#CashParties
	 * CashOption38.CashParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails17#CashParties
	 * SecuritiesSettlementTransactionDetails17.CashParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails18#CashParties
	 * SecuritiesSettlementTransactionDetails18.CashParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails19#CashParties
	 * SecuritiesSettlementTransactionDetails19.CashParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction7#RelatedParties
	 * EntryTransaction7.RelatedParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction7#RelatedAgents
	 * EntryTransaction7.RelatedAgents}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption39#CashParties
	 * CashOption39.CashParties}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption41#CashParties
	 * CashOption41.CashParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails21#CashParties
	 * SecuritiesSettlementTransactionDetails21.CashParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails22#CashParties
	 * SecuritiesSettlementTransactionDetails22.CashParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails20#CashParties
	 * SecuritiesSettlementTransactionDetails20.CashParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction8#RelatedParties
	 * EntryTransaction8.RelatedParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction8#RelatedAgents
	 * EntryTransaction8.RelatedAgents}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption44#CashParties
	 * CashOption44.CashParties}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption46#CashParties
	 * CashOption46.CashParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails23#CashParties
	 * SecuritiesSettlementTransactionDetails23.CashParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails25#CashParties
	 * SecuritiesSettlementTransactionDetails25.CashParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails24#CashParties
	 * SecuritiesSettlementTransactionDetails24.CashParties}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption52#CashParties
	 * CashOption52.CashParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails27#CashParties
	 * SecuritiesSettlementTransactionDetails27.CashParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails28#CashParties
	 * SecuritiesSettlementTransactionDetails28.CashParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails26#CashParties
	 * SecuritiesSettlementTransactionDetails26.CashParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails30#CashParties
	 * SecuritiesSettlementTransactionDetails30.CashParties}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption55#CashParties
	 * CashOption55.CashParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails29#CashParties
	 * SecuritiesSettlementTransactionDetails29.CashParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails31#CashParties
	 * SecuritiesSettlementTransactionDetails31.CashParties}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Payment
	 * Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies each role linked to a payment and played by a party at that step in a payment flow."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd PartyRole = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentDetails5.PaymentTransactionParty, com.tools20022.repository.msg.PaymentDetails6.PaymentTransactionParty,
					com.tools20022.repository.msg.PaymentDetails7.PaymentTransactionParty, com.tools20022.repository.msg.PaymentInstruction1.Parties, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails3.CashParties,
					com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails4.CashParties, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails2.CashParties,
					com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails5.CashParties, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails6.CashParties,
					com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails7.CashParties, com.tools20022.repository.msg.CashOption2.CashParties, com.tools20022.repository.msg.CashOption9.CashParties,
					com.tools20022.repository.msg.CashOption12.CashParties, com.tools20022.repository.msg.CashOption13.CashParties, com.tools20022.repository.msg.CashOption18.CashParties,
					com.tools20022.repository.msg.CashOption22.CashParties, com.tools20022.repository.msg.CashOption26.CashParties, com.tools20022.repository.msg.CashOption27.CashParties,
					com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails8.CashParties, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails9.CashParties,
					com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails10.CashParties, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails11.CashParties,
					com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails12.CashParties, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails13.CashParties, com.tools20022.repository.msg.Order3.CashParties,
					com.tools20022.repository.msg.EntryTransaction1.RelatedParties, com.tools20022.repository.msg.EntryTransaction1.RelatedAgents, com.tools20022.repository.msg.EntryTransaction2.RelatedParties,
					com.tools20022.repository.msg.EntryTransaction2.RelatedAgents, com.tools20022.repository.msg.EntryTransaction3.RelatedParties, com.tools20022.repository.msg.EntryTransaction3.RelatedAgents,
					com.tools20022.repository.msg.EntryTransaction4.RelatedParties, com.tools20022.repository.msg.EntryTransaction4.RelatedAgents, com.tools20022.repository.msg.OrderStatusAndReason5.CashParties,
					com.tools20022.repository.msg.Order9.CashParties, com.tools20022.repository.msg.MassQuote1.CashParties, com.tools20022.repository.msg.IndicationOfInterest1.CashParties, com.tools20022.repository.msg.Order6.CashParties,
					com.tools20022.repository.msg.Order11.CashParties, com.tools20022.repository.msg.PaymentInstruction14.Parties, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails16.CashParties,
					com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails14.CashParties, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails15.CashParties,
					com.tools20022.repository.msg.CashOption30.CashParties, com.tools20022.repository.msg.CashOption38.CashParties, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails17.CashParties,
					com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails18.CashParties, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails19.CashParties,
					com.tools20022.repository.msg.EntryTransaction7.RelatedParties, com.tools20022.repository.msg.EntryTransaction7.RelatedAgents, com.tools20022.repository.msg.CashOption39.CashParties,
					com.tools20022.repository.msg.CashOption41.CashParties, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails21.CashParties,
					com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails22.CashParties, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails20.CashParties,
					com.tools20022.repository.msg.EntryTransaction8.RelatedParties, com.tools20022.repository.msg.EntryTransaction8.RelatedAgents, com.tools20022.repository.msg.CashOption44.CashParties,
					com.tools20022.repository.msg.CashOption46.CashParties, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails23.CashParties,
					com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails25.CashParties, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails24.CashParties,
					com.tools20022.repository.msg.CashOption52.CashParties, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails27.CashParties,
					com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails28.CashParties, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails26.CashParties,
					com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails30.CashParties, com.tools20022.repository.msg.CashOption55.CashParties,
					com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails29.CashParties, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails31.CashParties);
			elementContext_lazy = () -> Payment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PartyRole";
			definition = "Specifies each role linked to a payment and played by a party at that step in a payment flow.";
			minOccurs = 1;
			type_lazy = () -> PaymentPartyRole.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentPartyRole.Payment;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Payment levy tax.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Tax#RelatedPaymentSettlement
	 * Tax.RelatedPaymentSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.EntryTransaction1#Tax
	 * EntryTransaction1.Tax}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.EntryTransaction2#Tax
	 * EntryTransaction2.Tax}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.EntryTransaction3#Tax
	 * EntryTransaction3.Tax}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.EntryTransaction4#Tax
	 * EntryTransaction4.Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation1#Tax
	 * CreditTransferTransactionInformation1.Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation10#Tax
	 * CreditTransferTransactionInformation10.Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction1#Tax
	 * CreditTransferTransaction1.Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction6#Tax
	 * CreditTransferTransaction6.Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation1#Tax
	 * DirectDebitTransactionInformation1.Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation9#Tax
	 * DirectDebitTransactionInformation9.Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation11#Tax
	 * DirectDebitTransactionInformation11.Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation13#Tax
	 * DirectDebitTransactionInformation13.Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation14#Tax
	 * CreditTransferTransactionInformation14.Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction5#Tax
	 * CreditTransferTransaction5.Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction10#Tax
	 * CreditTransferTransaction10.Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation10#TaxRemittance
	 * StructuredRemittanceInformation10.TaxRemittance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction19#Tax
	 * CreditTransferTransaction19.Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation12#TaxRemittance
	 * StructuredRemittanceInformation12.TaxRemittance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction18#Tax
	 * CreditTransferTransaction18.Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation18#Tax
	 * DirectDebitTransactionInformation18.Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction20#Tax
	 * CreditTransferTransaction20.Tax}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.EntryTransaction7#Tax
	 * EntryTransaction7.Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction21#Tax
	 * CreditTransferTransaction21.Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction25#Tax
	 * CreditTransferTransaction25.Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction24#Tax
	 * CreditTransferTransaction24.Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction26#Tax
	 * CreditTransferTransaction26.Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation13#TaxRemittance
	 * StructuredRemittanceInformation13.TaxRemittance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation19#Tax
	 * DirectDebitTransactionInformation19.Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction22#Tax
	 * CreditTransferTransaction22.Tax}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.EntryTransaction8#Tax
	 * EntryTransaction8.Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation22#Tax
	 * DirectDebitTransactionInformation22.Tax}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Payment
	 * Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxOnPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Payment levy tax."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd TaxOnPayment = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.EntryTransaction1.Tax, com.tools20022.repository.msg.EntryTransaction2.Tax, com.tools20022.repository.msg.EntryTransaction3.Tax,
					com.tools20022.repository.msg.EntryTransaction4.Tax, com.tools20022.repository.msg.CreditTransferTransactionInformation1.Tax, com.tools20022.repository.msg.CreditTransferTransactionInformation10.Tax,
					com.tools20022.repository.msg.CreditTransferTransaction1.Tax, com.tools20022.repository.msg.CreditTransferTransaction6.Tax, com.tools20022.repository.msg.DirectDebitTransactionInformation1.Tax,
					com.tools20022.repository.msg.DirectDebitTransactionInformation9.Tax, com.tools20022.repository.msg.DirectDebitTransactionInformation11.Tax, com.tools20022.repository.msg.DirectDebitTransactionInformation13.Tax,
					com.tools20022.repository.msg.CreditTransferTransactionInformation14.Tax, com.tools20022.repository.msg.CreditTransferTransaction5.Tax, com.tools20022.repository.msg.CreditTransferTransaction10.Tax,
					com.tools20022.repository.msg.StructuredRemittanceInformation10.TaxRemittance, com.tools20022.repository.msg.CreditTransferTransaction19.Tax,
					com.tools20022.repository.msg.StructuredRemittanceInformation12.TaxRemittance, com.tools20022.repository.msg.CreditTransferTransaction18.Tax, com.tools20022.repository.msg.DirectDebitTransactionInformation18.Tax,
					com.tools20022.repository.msg.CreditTransferTransaction20.Tax, com.tools20022.repository.msg.EntryTransaction7.Tax, com.tools20022.repository.msg.CreditTransferTransaction21.Tax,
					com.tools20022.repository.msg.CreditTransferTransaction25.Tax, com.tools20022.repository.msg.CreditTransferTransaction24.Tax, com.tools20022.repository.msg.CreditTransferTransaction26.Tax,
					com.tools20022.repository.msg.StructuredRemittanceInformation13.TaxRemittance, com.tools20022.repository.msg.DirectDebitTransactionInformation19.Tax, com.tools20022.repository.msg.CreditTransferTransaction22.Tax,
					com.tools20022.repository.msg.EntryTransaction8.Tax, com.tools20022.repository.msg.DirectDebitTransactionInformation22.Tax);
			elementContext_lazy = () -> Payment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TaxOnPayment";
			definition = "Payment levy tax.";
			minOccurs = 0;
			type_lazy = () -> Tax.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Tax.RelatedPaymentSettlement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Describes the processes necessary to execute a payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentExecution#Payment
	 * PaymentExecution.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PaymentExecution
	 * PaymentExecution}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction1#RelatedDates
	 * EntryTransaction1.RelatedDates}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction2#RelatedDates
	 * EntryTransaction2.RelatedDates}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction3#RelatedDates
	 * EntryTransaction3.RelatedDates}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction4#RelatedDates
	 * EntryTransaction4.RelatedDates}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation1#PaymentTypeInformation
	 * DirectDebitTransactionInformation1.PaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation9#PaymentTypeInformation
	 * DirectDebitTransactionInformation9.PaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation11#PaymentTypeInformation
	 * DirectDebitTransactionInformation11.PaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation13#PaymentTypeInformation
	 * DirectDebitTransactionInformation13.PaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation2#PaymentTypeInformation
	 * DirectDebitTransactionInformation2.PaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation10#PaymentTypeInformation
	 * DirectDebitTransactionInformation10.PaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation12#PaymentTypeInformation
	 * DirectDebitTransactionInformation12.PaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation14#PaymentTypeInformation
	 * DirectDebitTransactionInformation14.PaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation31#OriginalGroupInformation
	 * PaymentTransactionInformation31.OriginalGroupInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction38#OriginalGroupInformation
	 * PaymentTransaction38.OriginalGroupInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction48#OriginalGroupInformation
	 * PaymentTransaction48.OriginalGroupInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation2#OriginalGroupInformation
	 * PaymentTransactionInformation2.OriginalGroupInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation27#OriginalGroupInformation
	 * PaymentTransactionInformation27.OriginalGroupInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction34#OriginalGroupInformation
	 * PaymentTransaction34.OriginalGroupInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction44#OriginalGroupInformation
	 * PaymentTransaction44.OriginalGroupInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification2#PaymentTypeInformation
	 * RequestedModification2.PaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation33#OriginalGroupInformation
	 * PaymentTransactionInformation33.OriginalGroupInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorrectiveTransaction1Choice#Initiation
	 * CorrectiveTransaction1Choice.Initiation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction40#OriginalGroupInformation
	 * PaymentTransaction40.OriginalGroupInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation15#PaymentTypeInformation
	 * DirectDebitTransactionInformation15.PaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation13#OriginalGroupInformation
	 * PaymentTransactionInformation13.OriginalGroupInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation18#OriginalGroupInformation
	 * PaymentTransactionInformation18.OriginalGroupInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation16#OriginalGroupInformation
	 * PaymentTransactionInformation16.OriginalGroupInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation23#OriginalGroupInformation
	 * PaymentTransactionInformation23.OriginalGroupInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation21#OriginalGroupInformation
	 * PaymentTransactionInformation21.OriginalGroupInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation5#PaymentTypeInformation
	 * DirectDebitTransactionInformation5.PaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation7#PaymentTypeInformation
	 * DirectDebitTransactionInformation7.PaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation6#PaymentTypeInformation
	 * DirectDebitTransactionInformation6.PaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation8#PaymentTypeInformation
	 * DirectDebitTransactionInformation8.PaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction50#OriginalGroupInformation
	 * PaymentTransaction50.OriginalGroupInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation17#PaymentTypeInformation
	 * DirectDebitTransactionInformation17.PaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction51#OriginalGroupInformation
	 * PaymentTransaction51.OriginalGroupInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction53#OriginalGroupInformation
	 * PaymentTransaction53.OriginalGroupInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation18#PaymentTypeInformation
	 * DirectDebitTransactionInformation18.PaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction55#OriginalGroupInformation
	 * PaymentTransaction55.OriginalGroupInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction7#RelatedDates
	 * EntryTransaction7.RelatedDates}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyControlGroupStatus1#OriginalReferences
	 * CurrencyControlGroupStatus1.OriginalReferences}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction65#OriginalGroupInformation
	 * PaymentTransaction65.OriginalGroupInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation20#PaymentTypeInformation
	 * DirectDebitTransactionInformation20.PaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction60#OriginalGroupInformation
	 * PaymentTransaction60.OriginalGroupInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation19#PaymentTypeInformation
	 * DirectDebitTransactionInformation19.PaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction67#OriginalGroupInformation
	 * PaymentTransaction67.OriginalGroupInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction62#OriginalGroupInformation
	 * PaymentTransaction62.OriginalGroupInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction8#RelatedDates
	 * EntryTransaction8.RelatedDates}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation21#PaymentTypeInformation
	 * DirectDebitTransactionInformation21.PaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction81#OriginalGroupInformation
	 * PaymentTransaction81.OriginalGroupInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction76#OriginalGroupInformation
	 * PaymentTransaction76.OriginalGroupInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorrectiveTransaction2Choice#Initiation
	 * CorrectiveTransaction2Choice.Initiation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation22#PaymentTypeInformation
	 * DirectDebitTransactionInformation22.PaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction75#OriginalGroupInformation
	 * PaymentTransaction75.OriginalGroupInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction79#OriginalGroupInformation
	 * PaymentTransaction79.OriginalGroupInformation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Payment
	 * Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentExecution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Describes the processes necessary to execute a payment."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd PaymentExecution = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.EntryTransaction1.RelatedDates, com.tools20022.repository.msg.EntryTransaction2.RelatedDates, com.tools20022.repository.msg.EntryTransaction3.RelatedDates,
					com.tools20022.repository.msg.EntryTransaction4.RelatedDates, com.tools20022.repository.msg.DirectDebitTransactionInformation1.PaymentTypeInformation,
					com.tools20022.repository.msg.DirectDebitTransactionInformation9.PaymentTypeInformation, com.tools20022.repository.msg.DirectDebitTransactionInformation11.PaymentTypeInformation,
					com.tools20022.repository.msg.DirectDebitTransactionInformation13.PaymentTypeInformation, com.tools20022.repository.msg.DirectDebitTransactionInformation2.PaymentTypeInformation,
					com.tools20022.repository.msg.DirectDebitTransactionInformation10.PaymentTypeInformation, com.tools20022.repository.msg.DirectDebitTransactionInformation12.PaymentTypeInformation,
					com.tools20022.repository.msg.DirectDebitTransactionInformation14.PaymentTypeInformation, com.tools20022.repository.msg.PaymentTransactionInformation31.OriginalGroupInformation,
					com.tools20022.repository.msg.PaymentTransaction38.OriginalGroupInformation, com.tools20022.repository.msg.PaymentTransaction48.OriginalGroupInformation,
					com.tools20022.repository.msg.PaymentTransactionInformation2.OriginalGroupInformation, com.tools20022.repository.msg.PaymentTransactionInformation27.OriginalGroupInformation,
					com.tools20022.repository.msg.PaymentTransaction34.OriginalGroupInformation, com.tools20022.repository.msg.PaymentTransaction44.OriginalGroupInformation,
					com.tools20022.repository.msg.RequestedModification2.PaymentTypeInformation, com.tools20022.repository.msg.PaymentTransactionInformation33.OriginalGroupInformation,
					com.tools20022.repository.choice.CorrectiveTransaction1Choice.Initiation, com.tools20022.repository.msg.PaymentTransaction40.OriginalGroupInformation,
					com.tools20022.repository.msg.DirectDebitTransactionInformation15.PaymentTypeInformation, com.tools20022.repository.msg.PaymentTransactionInformation13.OriginalGroupInformation,
					com.tools20022.repository.msg.PaymentTransactionInformation18.OriginalGroupInformation, com.tools20022.repository.msg.PaymentTransactionInformation16.OriginalGroupInformation,
					com.tools20022.repository.msg.PaymentTransactionInformation23.OriginalGroupInformation, com.tools20022.repository.msg.PaymentTransactionInformation21.OriginalGroupInformation,
					com.tools20022.repository.msg.DirectDebitTransactionInformation5.PaymentTypeInformation, com.tools20022.repository.msg.DirectDebitTransactionInformation7.PaymentTypeInformation,
					com.tools20022.repository.msg.DirectDebitTransactionInformation6.PaymentTypeInformation, com.tools20022.repository.msg.DirectDebitTransactionInformation8.PaymentTypeInformation,
					com.tools20022.repository.msg.PaymentTransaction50.OriginalGroupInformation, com.tools20022.repository.msg.DirectDebitTransactionInformation17.PaymentTypeInformation,
					com.tools20022.repository.msg.PaymentTransaction51.OriginalGroupInformation, com.tools20022.repository.msg.PaymentTransaction53.OriginalGroupInformation,
					com.tools20022.repository.msg.DirectDebitTransactionInformation18.PaymentTypeInformation, com.tools20022.repository.msg.PaymentTransaction55.OriginalGroupInformation,
					com.tools20022.repository.msg.EntryTransaction7.RelatedDates, com.tools20022.repository.msg.CurrencyControlGroupStatus1.OriginalReferences, com.tools20022.repository.msg.PaymentTransaction65.OriginalGroupInformation,
					com.tools20022.repository.msg.DirectDebitTransactionInformation20.PaymentTypeInformation, com.tools20022.repository.msg.PaymentTransaction60.OriginalGroupInformation,
					com.tools20022.repository.msg.DirectDebitTransactionInformation19.PaymentTypeInformation, com.tools20022.repository.msg.PaymentTransaction67.OriginalGroupInformation,
					com.tools20022.repository.msg.PaymentTransaction62.OriginalGroupInformation, com.tools20022.repository.msg.EntryTransaction8.RelatedDates,
					com.tools20022.repository.msg.DirectDebitTransactionInformation21.PaymentTypeInformation, com.tools20022.repository.msg.PaymentTransaction81.OriginalGroupInformation,
					com.tools20022.repository.msg.PaymentTransaction76.OriginalGroupInformation, com.tools20022.repository.choice.CorrectiveTransaction2Choice.Initiation,
					com.tools20022.repository.msg.DirectDebitTransactionInformation22.PaymentTypeInformation, com.tools20022.repository.msg.PaymentTransaction75.OriginalGroupInformation,
					com.tools20022.repository.msg.PaymentTransaction79.OriginalGroupInformation);
			elementContext_lazy = () -> Payment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PaymentExecution";
			definition = "Describes the processes necessary to execute a payment.";
			minOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.PaymentExecution.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentExecution.Payment;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Date used for the correction of the value date of a cash pool movement
	 * that has been posted with a different value date.
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
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionInformation1#PoolingAdjustmentDate
	 * PaymentInstructionInformation1.PoolingAdjustmentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionInformation3#PoolingAdjustmentDate
	 * PaymentInstructionInformation3.PoolingAdjustmentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction6#PoolingAdjustmentDate
	 * PaymentInstruction6.PoolingAdjustmentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction9#PoolingAdjustmentDate
	 * PaymentInstruction9.PoolingAdjustmentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation2#PoolingAdjustmentDate
	 * CreditTransferTransactionInformation2.PoolingAdjustmentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation11#PoolingAdjustmentDate
	 * CreditTransferTransactionInformation11.PoolingAdjustmentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction2#PoolingAdjustmentDate
	 * CreditTransferTransaction2.PoolingAdjustmentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction7#PoolingAdjustmentDate
	 * CreditTransferTransaction7.PoolingAdjustmentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation7#PoolingAdjustmentDate
	 * CreditTransferTransactionInformation7.PoolingAdjustmentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation9#PoolingAdjustmentDate
	 * CreditTransferTransactionInformation9.PoolingAdjustmentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction16#PoolingAdjustmentDate
	 * PaymentInstruction16.PoolingAdjustmentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction19#PoolingAdjustmentDate
	 * CreditTransferTransaction19.PoolingAdjustmentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction25#PoolingAdjustmentDate
	 * CreditTransferTransaction25.PoolingAdjustmentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction20#PoolingAdjustmentDate
	 * PaymentInstruction20.PoolingAdjustmentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction22#PoolingAdjustmentDate
	 * PaymentInstruction22.PoolingAdjustmentDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Payment
	 * Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PoolingAdjustmentDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date used for the correction of the value date of a cash pool movement that has been posted with a different value date."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PoolingAdjustmentDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentInstructionInformation1.PoolingAdjustmentDate, com.tools20022.repository.msg.PaymentInstructionInformation3.PoolingAdjustmentDate,
					com.tools20022.repository.msg.PaymentInstruction6.PoolingAdjustmentDate, com.tools20022.repository.msg.PaymentInstruction9.PoolingAdjustmentDate,
					com.tools20022.repository.msg.CreditTransferTransactionInformation2.PoolingAdjustmentDate, com.tools20022.repository.msg.CreditTransferTransactionInformation11.PoolingAdjustmentDate,
					com.tools20022.repository.msg.CreditTransferTransaction2.PoolingAdjustmentDate, com.tools20022.repository.msg.CreditTransferTransaction7.PoolingAdjustmentDate,
					com.tools20022.repository.msg.CreditTransferTransactionInformation7.PoolingAdjustmentDate, com.tools20022.repository.msg.CreditTransferTransactionInformation9.PoolingAdjustmentDate,
					com.tools20022.repository.msg.PaymentInstruction16.PoolingAdjustmentDate, com.tools20022.repository.msg.CreditTransferTransaction19.PoolingAdjustmentDate,
					com.tools20022.repository.msg.CreditTransferTransaction25.PoolingAdjustmentDate, com.tools20022.repository.msg.PaymentInstruction20.PoolingAdjustmentDate,
					com.tools20022.repository.msg.PaymentInstruction22.PoolingAdjustmentDate);
			elementContext_lazy = () -> Payment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PoolingAdjustmentDate";
			definition = "Date used for the correction of the value date of a cash pool movement that has been posted with a different value date.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Amount of money to be transferred between debtor and creditor, before
	 * deduction of charges, expressed in the currency of the debtor's account,
	 * and to be transferred in a different currency.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ImpliedCurrencyAndAmount
	 * ImpliedCurrencyAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.EquivalentAmount#Amount
	 * EquivalentAmount.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AmountType1Choice#EquivalentAmount
	 * AmountType1Choice.EquivalentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AmountType2Choice#EquivalentAmount
	 * AmountType2Choice.EquivalentAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.EquivalentAmount2#Amount
	 * EquivalentAmount2.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AmountType3Choice#EquivalentAmount
	 * AmountType3Choice.EquivalentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AmountType4Choice#EquivalentAmount
	 * AmountType4Choice.EquivalentAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Payment
	 * Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EquivalentAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money to be transferred between debtor and creditor, before deduction of charges, expressed in the currency of the debtor's account, and to be transferred in a different currency."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute EquivalentAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.EquivalentAmount.Amount, com.tools20022.repository.choice.AmountType1Choice.EquivalentAmount,
					com.tools20022.repository.choice.AmountType2Choice.EquivalentAmount, com.tools20022.repository.msg.EquivalentAmount2.Amount, com.tools20022.repository.choice.AmountType3Choice.EquivalentAmount,
					com.tools20022.repository.choice.AmountType4Choice.EquivalentAmount);
			elementContext_lazy = () -> Payment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EquivalentAmount";
			definition = "Amount of money to be transferred between debtor and creditor, before deduction of charges, expressed in the currency of the debtor's account, and to be transferred in a different currency.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Information on the exchange rate and amounts used in the payment
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#RelatedPayment
	 * CurrencyExchange.RelatedPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CurrencyExchange
	 * CurrencyExchange}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation1#ExchangeRateInformation
	 * CreditTransferTransactionInformation1.ExchangeRateInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation10#ExchangeRateInformation
	 * CreditTransferTransactionInformation10.ExchangeRateInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction1#ExchangeRateInformation
	 * CreditTransferTransaction1.ExchangeRateInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction6#ExchangeRateInformation
	 * CreditTransferTransaction6.ExchangeRateInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation2#ExchangeRate
	 * CreditTransferTransactionInformation2.ExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation11#ExchangeRate
	 * CreditTransferTransactionInformation11.ExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction7#ExchangeRate
	 * CreditTransferTransaction7.ExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeSettlement1#PaymentCurrencyExchange
	 * TradeSettlement1.PaymentCurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation7#ExchangeRate
	 * CreditTransferTransactionInformation7.ExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation9#ExchangeRate
	 * CreditTransferTransactionInformation9.ExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInformation6#ExchangeRateInformation
	 * OriginalPaymentInformation6.ExchangeRateInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorCurrencyConversionResponse1#CurrencyConversion
	 * AcceptorCurrencyConversionResponse1.CurrencyConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails12#CurrencyConversion
	 * CardPaymentTransactionDetails12.CurrencyConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction24#CurrencyConversion
	 * CardPaymentTransaction24.CurrencyConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails14#CurrencyConversion
	 * CardPaymentTransactionDetails14.CurrencyConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction33#CurrencyConversion
	 * CardPaymentTransaction33.CurrencyConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails15#CurrencyConversion
	 * CardPaymentTransactionDetails15.CurrencyConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction19#ExchangeRate
	 * CreditTransferTransaction19.ExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction20#ExchangeRateInformation
	 * CreditTransferTransaction20.ExchangeRateInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorCurrencyConversionResponse2#CurrencyConversion
	 * AcceptorCurrencyConversionResponse2.CurrencyConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction39#CurrencyConversion
	 * CardPaymentTransaction39.CurrencyConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction50#CurrencyConversion
	 * CardPaymentTransaction50.CurrencyConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails23#CurrencyConversion
	 * CardPaymentTransactionDetails23.CurrencyConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails21#CurrencyConversion
	 * CardPaymentTransactionDetails21.CurrencyConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails19#CurrencyConversion
	 * CardPaymentTransactionDetails19.CurrencyConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMAccountStatement2#Currency
	 * ATMAccountStatement2.Currency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction1#CurrencyConversion
	 * ATMTransaction1.CurrencyConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndCurrency1#Currency
	 * AmountAndCurrency1.Currency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount12#Currency
	 * DetailedAmount12.Currency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction2#CurrencyConversion
	 * ATMTransaction2.CurrencyConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction7#CurrencyConversion
	 * ATMTransaction7.CurrencyConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction7#CurrencyExchange
	 * ATMTransaction7.CurrencyExchange}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ATMTransaction8#Currency
	 * ATMTransaction8.Currency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction3#CurrencyConversion
	 * ATMTransaction3.CurrencyConversion}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount13#Currency
	 * DetailedAmount13.Currency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction25#ExchangeRate
	 * CreditTransferTransaction25.ExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction26#ExchangeRateInformation
	 * CreditTransferTransaction26.ExchangeRateInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorCurrencyConversionResponse3#CurrencyConversionResult
	 * AcceptorCurrencyConversionResponse3.CurrencyConversionResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction65#CurrencyConversion
	 * CardPaymentTransaction65.CurrencyConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails29#CurrencyConversionResult
	 * CardPaymentTransactionDetails29.CurrencyConversionResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails30#CurrencyConversionResult
	 * CardPaymentTransactionDetails30.CurrencyConversionResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails27#CurrencyConversionResult
	 * CardPaymentTransactionDetails27.CurrencyConversionResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction54#CurrencyConversionEligibility
	 * CardPaymentTransaction54.CurrencyConversionEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction14#CurrencyConversionEligibility
	 * ATMTransaction14.CurrencyConversionEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction17#CurrencyConversionResult
	 * ATMTransaction17.CurrencyConversionResult}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount18#Currency
	 * DetailedAmount18.Currency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction13#CurrencyConversionResult
	 * ATMTransaction13.CurrencyConversionResult}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount16#Currency
	 * DetailedAmount16.Currency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction21#CurrencyConversion
	 * ATMTransaction21.CurrencyConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction21#CurrencyExchange
	 * ATMTransaction21.CurrencyExchange}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount17#Currency
	 * DetailedAmount17.Currency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInformation7#ExchangeRateInformation
	 * OriginalPaymentInformation7.ExchangeRateInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorCurrencyConversionResponse4#CurrencyConversionResult
	 * AcceptorCurrencyConversionResponse4.CurrencyConversionResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails38#CurrencyConversionResult
	 * CardPaymentTransactionDetails38.CurrencyConversionResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails41#CurrencyConversionResult
	 * CardPaymentTransactionDetails41.CurrencyConversionResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction67#CurrencyConversionEligibility
	 * CardPaymentTransaction67.CurrencyConversionEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction73#CurrencyConversion
	 * CardPaymentTransaction73.CurrencyConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails37#CurrencyConversionResult
	 * CardPaymentTransactionDetails37.CurrencyConversionResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorCurrencyConversionAdvice1#CurrencyConversionResult
	 * AcceptorCurrencyConversionAdvice1.CurrencyConversionResult}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Payment
	 * Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyExchange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information on the exchange rate and amounts used in the payment"</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CurrencyExchange = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CreditTransferTransactionInformation1.ExchangeRateInformation, com.tools20022.repository.msg.CreditTransferTransactionInformation10.ExchangeRateInformation,
					com.tools20022.repository.msg.CreditTransferTransaction1.ExchangeRateInformation, com.tools20022.repository.msg.CreditTransferTransaction6.ExchangeRateInformation,
					com.tools20022.repository.msg.CreditTransferTransactionInformation2.ExchangeRate, com.tools20022.repository.msg.CreditTransferTransactionInformation11.ExchangeRate,
					com.tools20022.repository.msg.CreditTransferTransaction7.ExchangeRate, com.tools20022.repository.msg.TradeSettlement1.PaymentCurrencyExchange,
					com.tools20022.repository.msg.CreditTransferTransactionInformation7.ExchangeRate, com.tools20022.repository.msg.CreditTransferTransactionInformation9.ExchangeRate,
					com.tools20022.repository.msg.OriginalPaymentInformation6.ExchangeRateInformation, com.tools20022.repository.msg.AcceptorCurrencyConversionResponse1.CurrencyConversion,
					com.tools20022.repository.msg.CardPaymentTransactionDetails12.CurrencyConversion, com.tools20022.repository.msg.CardPaymentTransaction24.CurrencyConversion,
					com.tools20022.repository.msg.CardPaymentTransactionDetails14.CurrencyConversion, com.tools20022.repository.msg.CardPaymentTransaction33.CurrencyConversion,
					com.tools20022.repository.msg.CardPaymentTransactionDetails15.CurrencyConversion, com.tools20022.repository.msg.CreditTransferTransaction19.ExchangeRate,
					com.tools20022.repository.msg.CreditTransferTransaction20.ExchangeRateInformation, com.tools20022.repository.msg.AcceptorCurrencyConversionResponse2.CurrencyConversion,
					com.tools20022.repository.msg.CardPaymentTransaction39.CurrencyConversion, com.tools20022.repository.msg.CardPaymentTransaction50.CurrencyConversion,
					com.tools20022.repository.msg.CardPaymentTransactionDetails23.CurrencyConversion, com.tools20022.repository.msg.CardPaymentTransactionDetails21.CurrencyConversion,
					com.tools20022.repository.msg.CardPaymentTransactionDetails19.CurrencyConversion, com.tools20022.repository.msg.ATMAccountStatement2.Currency, com.tools20022.repository.msg.ATMTransaction1.CurrencyConversion,
					com.tools20022.repository.msg.AmountAndCurrency1.Currency, com.tools20022.repository.msg.DetailedAmount12.Currency, com.tools20022.repository.msg.ATMTransaction2.CurrencyConversion,
					com.tools20022.repository.msg.ATMTransaction7.CurrencyConversion, com.tools20022.repository.msg.ATMTransaction7.CurrencyExchange, com.tools20022.repository.msg.ATMTransaction8.Currency,
					com.tools20022.repository.msg.ATMTransaction3.CurrencyConversion, com.tools20022.repository.msg.DetailedAmount13.Currency, com.tools20022.repository.msg.CreditTransferTransaction25.ExchangeRate,
					com.tools20022.repository.msg.CreditTransferTransaction26.ExchangeRateInformation, com.tools20022.repository.msg.AcceptorCurrencyConversionResponse3.CurrencyConversionResult,
					com.tools20022.repository.msg.CardPaymentTransaction65.CurrencyConversion, com.tools20022.repository.msg.CardPaymentTransactionDetails29.CurrencyConversionResult,
					com.tools20022.repository.msg.CardPaymentTransactionDetails30.CurrencyConversionResult, com.tools20022.repository.msg.CardPaymentTransactionDetails27.CurrencyConversionResult,
					com.tools20022.repository.msg.CardPaymentTransaction54.CurrencyConversionEligibility, com.tools20022.repository.msg.ATMTransaction14.CurrencyConversionEligibility,
					com.tools20022.repository.msg.ATMTransaction17.CurrencyConversionResult, com.tools20022.repository.msg.DetailedAmount18.Currency, com.tools20022.repository.msg.ATMTransaction13.CurrencyConversionResult,
					com.tools20022.repository.msg.DetailedAmount16.Currency, com.tools20022.repository.msg.ATMTransaction21.CurrencyConversion, com.tools20022.repository.msg.ATMTransaction21.CurrencyExchange,
					com.tools20022.repository.msg.DetailedAmount17.Currency, com.tools20022.repository.msg.OriginalPaymentInformation7.ExchangeRateInformation,
					com.tools20022.repository.msg.AcceptorCurrencyConversionResponse4.CurrencyConversionResult, com.tools20022.repository.msg.CardPaymentTransactionDetails38.CurrencyConversionResult,
					com.tools20022.repository.msg.CardPaymentTransactionDetails41.CurrencyConversionResult, com.tools20022.repository.msg.CardPaymentTransaction67.CurrencyConversionEligibility,
					com.tools20022.repository.msg.CardPaymentTransaction73.CurrencyConversion, com.tools20022.repository.msg.CardPaymentTransactionDetails37.CurrencyConversionResult,
					com.tools20022.repository.msg.AcceptorCurrencyConversionAdvice1.CurrencyConversionResult);
			elementContext_lazy = () -> Payment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CurrencyExchange";
			definition = "Information on the exchange rate and amounts used in the payment";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.RelatedPayment;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Further information related to the processing of the payment instruction
	 * that may need to be acted upon by the creditor agent. Usage: The
	 * instruction can relate to a level of service, can be an instruction to be
	 * executed by the creditor's agent, or can be information required by the
	 * creditor's agent to process the instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionCode
	 * InstructionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructionForCreditorAgent1#Code
	 * InstructionForCreditorAgent1.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation1#InstructionForCreditorAgent
	 * CreditTransferTransactionInformation1.InstructionForCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation10#InstructionForCreditorAgent
	 * CreditTransferTransactionInformation10.InstructionForCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction1#InstructionForCreditorAgent
	 * CreditTransferTransaction1.InstructionForCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction6#InstructionForCreditorAgent
	 * CreditTransferTransaction6.InstructionForCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation1#InstructionForCreditorAgent
	 * DirectDebitTransactionInformation1.InstructionForCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation9#InstructionForCreditorAgent
	 * DirectDebitTransactionInformation9.InstructionForCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation11#InstructionForCreditorAgent
	 * DirectDebitTransactionInformation11.InstructionForCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation13#InstructionForCreditorAgent
	 * DirectDebitTransactionInformation13.InstructionForCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation2#InstructionForCreditorAgent
	 * CreditTransferTransactionInformation2.InstructionForCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation11#InstructionForCreditorAgent
	 * CreditTransferTransactionInformation11.InstructionForCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction2#InstructionForCreditorAgent
	 * CreditTransferTransaction2.InstructionForCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction7#InstructionForCreditorAgent
	 * CreditTransferTransaction7.InstructionForCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructionForCreditorAgent2#Code
	 * InstructionForCreditorAgent2.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation3#InstructionForCreditorAgent
	 * CreditTransferTransactionInformation3.InstructionForCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation13#InstructionForCreditorAgent
	 * CreditTransferTransactionInformation13.InstructionForCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction4#InstructionForCreditorAgent
	 * CreditTransferTransaction4.InstructionForCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction8#InstructionForCreditorAgent
	 * CreditTransferTransaction8.InstructionForCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation14#InstructionForCreditorAgent
	 * CreditTransferTransactionInformation14.InstructionForCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction5#InstructionForCreditorAgent
	 * CreditTransferTransaction5.InstructionForCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction10#InstructionForCreditorAgent
	 * CreditTransferTransaction10.InstructionForCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructionForFinalAgent#Code
	 * InstructionForFinalAgent.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructionForFinalAgent#Proprietary
	 * InstructionForFinalAgent.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification#InstructionForFinalAgent
	 * RequestedModification.InstructionForFinalAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification2#InstructionForCreditorAgent
	 * RequestedModification2.InstructionForCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation2#InstructionForCreditorAgent
	 * PaymentComplementaryInformation2.InstructionForCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation3#InstructionForCreditorAgent
	 * PaymentComplementaryInformation3.InstructionForCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification3#InstructionForCreditorAgent
	 * RequestedModification3.InstructionForCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction9#InstructionForCreditorAgent
	 * CreditTransferTransaction9.InstructionForCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation7#InstructionForCreditorAgent
	 * CreditTransferTransactionInformation7.InstructionForCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation9#InstructionForCreditorAgent
	 * CreditTransferTransactionInformation9.InstructionForCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation4#InstructionForCreditorAgent
	 * PaymentComplementaryInformation4.InstructionForCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction17#InstructionForCreditorAgent
	 * CreditTransferTransaction17.InstructionForCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction19#InstructionForCreditorAgent
	 * CreditTransferTransaction19.InstructionForCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification4#InstructionForCreditorAgent
	 * RequestedModification4.InstructionForCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction18#InstructionForCreditorAgent
	 * CreditTransferTransaction18.InstructionForCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation18#InstructionForCreditorAgent
	 * DirectDebitTransactionInformation18.InstructionForCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction20#InstructionForCreditorAgent
	 * CreditTransferTransaction20.InstructionForCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction21#InstructionForCreditorAgent
	 * CreditTransferTransaction21.InstructionForCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction23#InstructionForCreditorAgent
	 * CreditTransferTransaction23.InstructionForCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification5#InstructionForCreditorAgent
	 * RequestedModification5.InstructionForCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction25#InstructionForCreditorAgent
	 * CreditTransferTransaction25.InstructionForCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation5#InstructionForCreditorAgent
	 * PaymentComplementaryInformation5.InstructionForCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction24#InstructionForCreditorAgent
	 * CreditTransferTransaction24.InstructionForCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction26#InstructionForCreditorAgent
	 * CreditTransferTransaction26.InstructionForCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation19#InstructionForCreditorAgent
	 * DirectDebitTransactionInformation19.InstructionForCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction22#InstructionForCreditorAgent
	 * CreditTransferTransaction22.InstructionForCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification6#InstructionForCreditorAgent
	 * RequestedModification6.InstructionForCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation22#InstructionForCreditorAgent
	 * DirectDebitTransactionInformation22.InstructionForCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation6#InstructionForCreditorAgent
	 * PaymentComplementaryInformation6.InstructionForCreditorAgent}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Payment
	 * Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionForCreditorAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Further information related to the processing of the payment instruction that may need to be acted upon by the creditor agent. \nUsage: The instruction can relate to a level of service, can be an instruction to be executed by the creditor's agent, or can be information required by the creditor's agent to process the instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute InstructionForCreditorAgent = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InstructionForCreditorAgent1.Code, com.tools20022.repository.msg.CreditTransferTransactionInformation1.InstructionForCreditorAgent,
					com.tools20022.repository.msg.CreditTransferTransactionInformation10.InstructionForCreditorAgent, com.tools20022.repository.msg.CreditTransferTransaction1.InstructionForCreditorAgent,
					com.tools20022.repository.msg.CreditTransferTransaction6.InstructionForCreditorAgent, com.tools20022.repository.msg.DirectDebitTransactionInformation1.InstructionForCreditorAgent,
					com.tools20022.repository.msg.DirectDebitTransactionInformation9.InstructionForCreditorAgent, com.tools20022.repository.msg.DirectDebitTransactionInformation11.InstructionForCreditorAgent,
					com.tools20022.repository.msg.DirectDebitTransactionInformation13.InstructionForCreditorAgent, com.tools20022.repository.msg.CreditTransferTransactionInformation2.InstructionForCreditorAgent,
					com.tools20022.repository.msg.CreditTransferTransactionInformation11.InstructionForCreditorAgent, com.tools20022.repository.msg.CreditTransferTransaction2.InstructionForCreditorAgent,
					com.tools20022.repository.msg.CreditTransferTransaction7.InstructionForCreditorAgent, com.tools20022.repository.msg.InstructionForCreditorAgent2.Code,
					com.tools20022.repository.msg.CreditTransferTransactionInformation3.InstructionForCreditorAgent, com.tools20022.repository.msg.CreditTransferTransactionInformation13.InstructionForCreditorAgent,
					com.tools20022.repository.msg.CreditTransferTransaction4.InstructionForCreditorAgent, com.tools20022.repository.msg.CreditTransferTransaction8.InstructionForCreditorAgent,
					com.tools20022.repository.msg.CreditTransferTransactionInformation14.InstructionForCreditorAgent, com.tools20022.repository.msg.CreditTransferTransaction5.InstructionForCreditorAgent,
					com.tools20022.repository.msg.CreditTransferTransaction10.InstructionForCreditorAgent, com.tools20022.repository.msg.InstructionForFinalAgent.Code, com.tools20022.repository.msg.InstructionForFinalAgent.Proprietary,
					com.tools20022.repository.msg.RequestedModification.InstructionForFinalAgent, com.tools20022.repository.msg.RequestedModification2.InstructionForCreditorAgent,
					com.tools20022.repository.msg.PaymentComplementaryInformation2.InstructionForCreditorAgent, com.tools20022.repository.msg.PaymentComplementaryInformation3.InstructionForCreditorAgent,
					com.tools20022.repository.msg.RequestedModification3.InstructionForCreditorAgent, com.tools20022.repository.msg.CreditTransferTransaction9.InstructionForCreditorAgent,
					com.tools20022.repository.msg.CreditTransferTransactionInformation7.InstructionForCreditorAgent, com.tools20022.repository.msg.CreditTransferTransactionInformation9.InstructionForCreditorAgent,
					com.tools20022.repository.msg.PaymentComplementaryInformation4.InstructionForCreditorAgent, com.tools20022.repository.msg.CreditTransferTransaction17.InstructionForCreditorAgent,
					com.tools20022.repository.msg.CreditTransferTransaction19.InstructionForCreditorAgent, com.tools20022.repository.msg.RequestedModification4.InstructionForCreditorAgent,
					com.tools20022.repository.msg.CreditTransferTransaction18.InstructionForCreditorAgent, com.tools20022.repository.msg.DirectDebitTransactionInformation18.InstructionForCreditorAgent,
					com.tools20022.repository.msg.CreditTransferTransaction20.InstructionForCreditorAgent, com.tools20022.repository.msg.CreditTransferTransaction21.InstructionForCreditorAgent,
					com.tools20022.repository.msg.CreditTransferTransaction23.InstructionForCreditorAgent, com.tools20022.repository.msg.RequestedModification5.InstructionForCreditorAgent,
					com.tools20022.repository.msg.CreditTransferTransaction25.InstructionForCreditorAgent, com.tools20022.repository.msg.PaymentComplementaryInformation5.InstructionForCreditorAgent,
					com.tools20022.repository.msg.CreditTransferTransaction24.InstructionForCreditorAgent, com.tools20022.repository.msg.CreditTransferTransaction26.InstructionForCreditorAgent,
					com.tools20022.repository.msg.DirectDebitTransactionInformation19.InstructionForCreditorAgent, com.tools20022.repository.msg.CreditTransferTransaction22.InstructionForCreditorAgent,
					com.tools20022.repository.msg.RequestedModification6.InstructionForCreditorAgent, com.tools20022.repository.msg.DirectDebitTransactionInformation22.InstructionForCreditorAgent,
					com.tools20022.repository.msg.PaymentComplementaryInformation6.InstructionForCreditorAgent);
			elementContext_lazy = () -> Payment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InstructionForCreditorAgent";
			definition = "Further information related to the processing of the payment instruction that may need to be acted upon by the creditor agent. \nUsage: The instruction can relate to a level of service, can be an instruction to be executed by the creditor's agent, or can be information required by the creditor's agent to process the instruction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> InstructionCode.mmObject();
		}
	};
	/**
	 * Further information related to the processing of the payment instruction
	 * that may need to be acted upon by the debtor's agent. Usage: The
	 * instruction can relate to a level of service, can be an instruction to be
	 * executed by the debtor's agent, or can be information required by the
	 * debtor's agent to process the instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionCode
	 * InstructionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation1#InstructionForDebtorAgent
	 * CreditTransferTransactionInformation1.InstructionForDebtorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation10#InstructionForDebtorAgent
	 * CreditTransferTransactionInformation10.InstructionForDebtorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction1#InstructionForDebtorAgent
	 * CreditTransferTransaction1.InstructionForDebtorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction6#InstructionForDebtorAgent
	 * PaymentInstruction6.InstructionForDebtorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction6#InstructionForDebtorAgent
	 * CreditTransferTransaction6.InstructionForDebtorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction9#InstructionForDebtorAgent
	 * PaymentInstruction9.InstructionForDebtorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification2#InstructionForDebtorAgent
	 * RequestedModification2.InstructionForDebtorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation2#InstructionForDebtorAgent
	 * PaymentComplementaryInformation2.InstructionForDebtorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation3#InstructionForDebtorAgent
	 * PaymentComplementaryInformation3.InstructionForDebtorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification3#InstructionForDebtorAgent
	 * RequestedModification3.InstructionForDebtorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation15#InstructionForDebtorAgent
	 * DirectDebitTransactionInformation15.InstructionForDebtorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction16#InstructionForDebtorAgent
	 * PaymentInstruction16.InstructionForDebtorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation4#InstructionForDebtorAgent
	 * PaymentComplementaryInformation4.InstructionForDebtorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification4#InstructionForDebtorAgent
	 * RequestedModification4.InstructionForDebtorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction20#InstructionForDebtorAgent
	 * CreditTransferTransaction20.InstructionForDebtorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification5#InstructionForDebtorAgent
	 * RequestedModification5.InstructionForDebtorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation5#InstructionForDebtorAgent
	 * PaymentComplementaryInformation5.InstructionForDebtorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction20#InstructionForDebtorAgent
	 * PaymentInstruction20.InstructionForDebtorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction26#InstructionForDebtorAgent
	 * CreditTransferTransaction26.InstructionForDebtorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification6#InstructionForDebtorAgent
	 * RequestedModification6.InstructionForDebtorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction22#InstructionForDebtorAgent
	 * PaymentInstruction22.InstructionForDebtorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation6#InstructionForDebtorAgent
	 * PaymentComplementaryInformation6.InstructionForDebtorAgent}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Payment
	 * Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionForDebtorAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Further information related to the processing of the payment instruction that may need to be acted upon by the debtor's agent.  \nUsage: The instruction can relate to a level of service, can be an instruction to be executed by the debtor's agent, or can be information required by the debtor's agent to process the instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute InstructionForDebtorAgent = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CreditTransferTransactionInformation1.InstructionForDebtorAgent,
					com.tools20022.repository.msg.CreditTransferTransactionInformation10.InstructionForDebtorAgent, com.tools20022.repository.msg.CreditTransferTransaction1.InstructionForDebtorAgent,
					com.tools20022.repository.msg.PaymentInstruction6.InstructionForDebtorAgent, com.tools20022.repository.msg.CreditTransferTransaction6.InstructionForDebtorAgent,
					com.tools20022.repository.msg.PaymentInstruction9.InstructionForDebtorAgent, com.tools20022.repository.msg.RequestedModification2.InstructionForDebtorAgent,
					com.tools20022.repository.msg.PaymentComplementaryInformation2.InstructionForDebtorAgent, com.tools20022.repository.msg.PaymentComplementaryInformation3.InstructionForDebtorAgent,
					com.tools20022.repository.msg.RequestedModification3.InstructionForDebtorAgent, com.tools20022.repository.msg.DirectDebitTransactionInformation15.InstructionForDebtorAgent,
					com.tools20022.repository.msg.PaymentInstruction16.InstructionForDebtorAgent, com.tools20022.repository.msg.PaymentComplementaryInformation4.InstructionForDebtorAgent,
					com.tools20022.repository.msg.RequestedModification4.InstructionForDebtorAgent, com.tools20022.repository.msg.CreditTransferTransaction20.InstructionForDebtorAgent,
					com.tools20022.repository.msg.RequestedModification5.InstructionForDebtorAgent, com.tools20022.repository.msg.PaymentComplementaryInformation5.InstructionForDebtorAgent,
					com.tools20022.repository.msg.PaymentInstruction20.InstructionForDebtorAgent, com.tools20022.repository.msg.CreditTransferTransaction26.InstructionForDebtorAgent,
					com.tools20022.repository.msg.RequestedModification6.InstructionForDebtorAgent, com.tools20022.repository.msg.PaymentInstruction22.InstructionForDebtorAgent,
					com.tools20022.repository.msg.PaymentComplementaryInformation6.InstructionForDebtorAgent);
			elementContext_lazy = () -> Payment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InstructionForDebtorAgent";
			definition = "Further information related to the processing of the payment instruction that may need to be acted upon by the debtor's agent.  \nUsage: The instruction can relate to a level of service, can be an instruction to be executed by the debtor's agent, or can be information required by the debtor's agent to process the instruction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> InstructionCode.mmObject();
		}
	};
	/**
	 * Identifications provided to identify a payment at different processing
	 * levels.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentIdentification#Payment
	 * PaymentIdentification.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.PaymentIdentification
	 * PaymentIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionReportDetails3#InstructionReference
	 * TransactionReportDetails3.InstructionReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionReportDetails4#InstructionReference
	 * TransactionReportDetails4.InstructionReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionReportDetails5#InstructionReference
	 * TransactionReportDetails5.InstructionReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation1#PaymentIdentification
	 * CreditTransferTransactionInformation1.PaymentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation10#PaymentIdentification
	 * CreditTransferTransactionInformation10.PaymentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction1#PaymentIdentification
	 * CreditTransferTransaction1.PaymentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction6#PaymentIdentification
	 * CreditTransferTransaction6.PaymentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation1#PaymentIdentification
	 * DirectDebitTransactionInformation1.PaymentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation9#PaymentIdentification
	 * DirectDebitTransactionInformation9.PaymentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation11#PaymentIdentification
	 * DirectDebitTransactionInformation11.PaymentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation13#PaymentIdentification
	 * DirectDebitTransactionInformation13.PaymentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation2#PaymentIdentification
	 * CreditTransferTransactionInformation2.PaymentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation11#PaymentIdentification
	 * CreditTransferTransactionInformation11.PaymentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction2#PaymentIdentification
	 * CreditTransferTransaction2.PaymentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction7#PaymentIdentification
	 * CreditTransferTransaction7.PaymentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation2#PaymentIdentification
	 * DirectDebitTransactionInformation2.PaymentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation10#PaymentIdentification
	 * DirectDebitTransactionInformation10.PaymentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation12#PaymentIdentification
	 * DirectDebitTransactionInformation12.PaymentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation14#PaymentIdentification
	 * DirectDebitTransactionInformation14.PaymentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation3#PaymentIdentification
	 * CreditTransferTransactionInformation3.PaymentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation13#PaymentIdentification
	 * CreditTransferTransactionInformation13.PaymentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction4#PaymentIdentification
	 * CreditTransferTransaction4.PaymentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction8#PaymentIdentification
	 * CreditTransferTransaction8.PaymentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation14#PaymentIdentification
	 * CreditTransferTransactionInformation14.PaymentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction5#PaymentIdentification
	 * CreditTransferTransaction5.PaymentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction10#PaymentIdentification
	 * CreditTransferTransaction10.PaymentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation15#PaymentIdentification
	 * DirectDebitTransactionInformation15.PaymentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation6#PaymentIdentification
	 * CreditTransferTransactionInformation6.PaymentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation8#PaymentIdentification
	 * CreditTransferTransactionInformation8.PaymentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation7#PaymentIdentification
	 * CreditTransferTransactionInformation7.PaymentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation9#PaymentIdentification
	 * CreditTransferTransactionInformation9.PaymentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation5#PaymentIdentification
	 * DirectDebitTransactionInformation5.PaymentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation7#PaymentIdentification
	 * DirectDebitTransactionInformation7.PaymentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation6#PaymentIdentification
	 * DirectDebitTransactionInformation6.PaymentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation8#PaymentIdentification
	 * DirectDebitTransactionInformation8.PaymentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInformation6#References
	 * OriginalPaymentInformation6.References}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RemittanceLocation3#References
	 * RemittanceLocation3.References}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction17#PaymentIdentification
	 * CreditTransferTransaction17.PaymentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction19#PaymentIdentification
	 * CreditTransferTransaction19.PaymentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation17#PaymentIdentification
	 * DirectDebitTransactionInformation17.PaymentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation18#PaymentIdentification
	 * DirectDebitTransactionInformation18.PaymentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction20#PaymentIdentification
	 * CreditTransferTransaction20.PaymentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction21#PaymentIdentification
	 * CreditTransferTransaction21.PaymentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReconciliationList1#PaymentReference
	 * ReconciliationList1.PaymentReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction23#PaymentIdentification
	 * CreditTransferTransaction23.PaymentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction25#PaymentIdentification
	 * CreditTransferTransaction25.PaymentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation20#PaymentIdentification
	 * DirectDebitTransactionInformation20.PaymentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction26#PaymentIdentification
	 * CreditTransferTransaction26.PaymentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation19#PaymentIdentification
	 * DirectDebitTransactionInformation19.PaymentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction22#PaymentIdentification
	 * CreditTransferTransaction22.PaymentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation21#PaymentIdentification
	 * DirectDebitTransactionInformation21.PaymentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInformation7#References
	 * OriginalPaymentInformation7.References}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation22#PaymentIdentification
	 * DirectDebitTransactionInformation22.PaymentIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Payment
	 * Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentRelatedIdentifications"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifications provided to identify a payment at different processing levels."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd PaymentRelatedIdentifications = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransactionReportDetails3.InstructionReference, com.tools20022.repository.msg.TransactionReportDetails4.InstructionReference,
					com.tools20022.repository.msg.TransactionReportDetails5.InstructionReference, com.tools20022.repository.msg.CreditTransferTransactionInformation1.PaymentIdentification,
					com.tools20022.repository.msg.CreditTransferTransactionInformation10.PaymentIdentification, com.tools20022.repository.msg.CreditTransferTransaction1.PaymentIdentification,
					com.tools20022.repository.msg.CreditTransferTransaction6.PaymentIdentification, com.tools20022.repository.msg.DirectDebitTransactionInformation1.PaymentIdentification,
					com.tools20022.repository.msg.DirectDebitTransactionInformation9.PaymentIdentification, com.tools20022.repository.msg.DirectDebitTransactionInformation11.PaymentIdentification,
					com.tools20022.repository.msg.DirectDebitTransactionInformation13.PaymentIdentification, com.tools20022.repository.msg.CreditTransferTransactionInformation2.PaymentIdentification,
					com.tools20022.repository.msg.CreditTransferTransactionInformation11.PaymentIdentification, com.tools20022.repository.msg.CreditTransferTransaction2.PaymentIdentification,
					com.tools20022.repository.msg.CreditTransferTransaction7.PaymentIdentification, com.tools20022.repository.msg.DirectDebitTransactionInformation2.PaymentIdentification,
					com.tools20022.repository.msg.DirectDebitTransactionInformation10.PaymentIdentification, com.tools20022.repository.msg.DirectDebitTransactionInformation12.PaymentIdentification,
					com.tools20022.repository.msg.DirectDebitTransactionInformation14.PaymentIdentification, com.tools20022.repository.msg.CreditTransferTransactionInformation3.PaymentIdentification,
					com.tools20022.repository.msg.CreditTransferTransactionInformation13.PaymentIdentification, com.tools20022.repository.msg.CreditTransferTransaction4.PaymentIdentification,
					com.tools20022.repository.msg.CreditTransferTransaction8.PaymentIdentification, com.tools20022.repository.msg.CreditTransferTransactionInformation14.PaymentIdentification,
					com.tools20022.repository.msg.CreditTransferTransaction5.PaymentIdentification, com.tools20022.repository.msg.CreditTransferTransaction10.PaymentIdentification,
					com.tools20022.repository.msg.DirectDebitTransactionInformation15.PaymentIdentification, com.tools20022.repository.msg.CreditTransferTransactionInformation6.PaymentIdentification,
					com.tools20022.repository.msg.CreditTransferTransactionInformation8.PaymentIdentification, com.tools20022.repository.msg.CreditTransferTransactionInformation7.PaymentIdentification,
					com.tools20022.repository.msg.CreditTransferTransactionInformation9.PaymentIdentification, com.tools20022.repository.msg.DirectDebitTransactionInformation5.PaymentIdentification,
					com.tools20022.repository.msg.DirectDebitTransactionInformation7.PaymentIdentification, com.tools20022.repository.msg.DirectDebitTransactionInformation6.PaymentIdentification,
					com.tools20022.repository.msg.DirectDebitTransactionInformation8.PaymentIdentification, com.tools20022.repository.msg.OriginalPaymentInformation6.References, com.tools20022.repository.msg.RemittanceLocation3.References,
					com.tools20022.repository.msg.CreditTransferTransaction17.PaymentIdentification, com.tools20022.repository.msg.CreditTransferTransaction19.PaymentIdentification,
					com.tools20022.repository.msg.DirectDebitTransactionInformation17.PaymentIdentification, com.tools20022.repository.msg.DirectDebitTransactionInformation18.PaymentIdentification,
					com.tools20022.repository.msg.CreditTransferTransaction20.PaymentIdentification, com.tools20022.repository.msg.CreditTransferTransaction21.PaymentIdentification,
					com.tools20022.repository.msg.ReconciliationList1.PaymentReference, com.tools20022.repository.msg.CreditTransferTransaction23.PaymentIdentification,
					com.tools20022.repository.msg.CreditTransferTransaction25.PaymentIdentification, com.tools20022.repository.msg.DirectDebitTransactionInformation20.PaymentIdentification,
					com.tools20022.repository.msg.CreditTransferTransaction26.PaymentIdentification, com.tools20022.repository.msg.DirectDebitTransactionInformation19.PaymentIdentification,
					com.tools20022.repository.msg.CreditTransferTransaction22.PaymentIdentification, com.tools20022.repository.msg.DirectDebitTransactionInformation21.PaymentIdentification,
					com.tools20022.repository.msg.OriginalPaymentInformation7.References, com.tools20022.repository.msg.DirectDebitTransactionInformation22.PaymentIdentification);
			elementContext_lazy = () -> Payment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PaymentRelatedIdentifications";
			definition = "Identifications provided to identify a payment at different processing levels.";
			minOccurs = 0;
			type_lazy = () -> PaymentIdentification.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentIdentification.Payment;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Investigation case assigned to the payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCase#UnderlyingPayment
	 * PaymentInvestigationCase.UnderlyingPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCase
	 * PaymentInvestigationCase}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation30#Case
	 * PaymentTransactionInformation30.Case}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInformation4#Case
	 * OriginalPaymentInformation4.Case}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentTransaction37#Case
	 * PaymentTransaction37.Case}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentTransaction47#Case
	 * PaymentTransaction47.Case}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation31#Case
	 * PaymentTransactionInformation31.Case}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentTransaction38#Case
	 * PaymentTransaction38.Case}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentTransaction48#Case
	 * PaymentTransaction48.Case}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation32#ResolvedCase
	 * PaymentTransactionInformation32.ResolvedCase}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInformation3#ResolvedCase
	 * OriginalPaymentInformation3.ResolvedCase}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation33#ResolvedCase
	 * PaymentTransactionInformation33.ResolvedCase}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction39#ResolvedCase
	 * PaymentTransaction39.ResolvedCase}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction40#ResolvedCase
	 * PaymentTransaction40.ResolvedCase}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentTransaction58#Case
	 * PaymentTransaction58.Case}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction54#ResolvedCase
	 * PaymentTransaction54.ResolvedCase}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction53#ResolvedCase
	 * PaymentTransaction53.ResolvedCase}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentTransaction55#Case
	 * PaymentTransaction55.Case}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentTransaction61#Case
	 * PaymentTransaction61.Case}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction66#ResolvedCase
	 * PaymentTransaction66.ResolvedCase}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction67#ResolvedCase
	 * PaymentTransaction67.ResolvedCase}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentTransaction62#Case
	 * PaymentTransaction62.Case}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction78#ResolvedCase
	 * PaymentTransaction78.ResolvedCase}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentTransaction74#Case
	 * PaymentTransaction74.Case}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentTransaction75#Case
	 * PaymentTransaction75.Case}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction79#ResolvedCase
	 * PaymentTransaction79.ResolvedCase}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Payment
	 * Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedInvestigationCase"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Investigation case assigned to the payment."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedInvestigationCase = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentTransactionInformation30.Case, com.tools20022.repository.msg.OriginalPaymentInformation4.Case, com.tools20022.repository.msg.PaymentTransaction37.Case,
					com.tools20022.repository.msg.PaymentTransaction47.Case, com.tools20022.repository.msg.PaymentTransactionInformation31.Case, com.tools20022.repository.msg.PaymentTransaction38.Case,
					com.tools20022.repository.msg.PaymentTransaction48.Case, com.tools20022.repository.msg.PaymentTransactionInformation32.ResolvedCase, com.tools20022.repository.msg.OriginalPaymentInformation3.ResolvedCase,
					com.tools20022.repository.msg.PaymentTransactionInformation33.ResolvedCase, com.tools20022.repository.msg.PaymentTransaction39.ResolvedCase, com.tools20022.repository.msg.PaymentTransaction40.ResolvedCase,
					com.tools20022.repository.msg.PaymentTransaction58.Case, com.tools20022.repository.msg.PaymentTransaction54.ResolvedCase, com.tools20022.repository.msg.PaymentTransaction53.ResolvedCase,
					com.tools20022.repository.msg.PaymentTransaction55.Case, com.tools20022.repository.msg.PaymentTransaction61.Case, com.tools20022.repository.msg.PaymentTransaction66.ResolvedCase,
					com.tools20022.repository.msg.PaymentTransaction67.ResolvedCase, com.tools20022.repository.msg.PaymentTransaction62.Case, com.tools20022.repository.msg.PaymentTransaction78.ResolvedCase,
					com.tools20022.repository.msg.PaymentTransaction74.Case, com.tools20022.repository.msg.PaymentTransaction75.Case, com.tools20022.repository.msg.PaymentTransaction79.ResolvedCase);
			elementContext_lazy = () -> Payment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedInvestigationCase";
			definition = "Investigation case assigned to the payment.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> PaymentInvestigationCase.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentInvestigationCase.UnderlyingPayment;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Information on the requested settlement time of the instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SettlementTimeRequest#Payment
	 * SettlementTimeRequest.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SettlementTimeRequest
	 * SettlementTimeRequest}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation2#SettlementTimeRequest
	 * CreditTransferTransactionInformation2.SettlementTimeRequest}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation11#SettlementTimeRequest
	 * CreditTransferTransactionInformation11.SettlementTimeRequest}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction2#SettlementTimeRequest
	 * CreditTransferTransaction2.SettlementTimeRequest}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction7#SettlementTimeRequest
	 * CreditTransferTransaction7.SettlementTimeRequest}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation3#SettlementTimeRequest
	 * CreditTransferTransactionInformation3.SettlementTimeRequest}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation13#SettlementTimeRequest
	 * CreditTransferTransactionInformation13.SettlementTimeRequest}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction4#SettlementTimeRequest
	 * CreditTransferTransaction4.SettlementTimeRequest}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction8#SettlementTimeRequest
	 * CreditTransferTransaction8.SettlementTimeRequest}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation15#SettlementTimeRequest
	 * DirectDebitTransactionInformation15.SettlementTimeRequest}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation7#SettlementTimeRequest
	 * CreditTransferTransactionInformation7.SettlementTimeRequest}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation9#SettlementTimeRequest
	 * CreditTransferTransactionInformation9.SettlementTimeRequest}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction17#SettlementTimeRequest
	 * CreditTransferTransaction17.SettlementTimeRequest}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction19#SettlementTimeRequest
	 * CreditTransferTransaction19.SettlementTimeRequest}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction23#SettlementTimeRequest
	 * CreditTransferTransaction23.SettlementTimeRequest}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction25#SettlementTimeRequest
	 * CreditTransferTransaction25.SettlementTimeRequest}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Payment
	 * Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementTimeRequest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information on the requested settlement time of the instruction."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SettlementTimeRequest = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CreditTransferTransactionInformation2.SettlementTimeRequest, com.tools20022.repository.msg.CreditTransferTransactionInformation11.SettlementTimeRequest,
					com.tools20022.repository.msg.CreditTransferTransaction2.SettlementTimeRequest, com.tools20022.repository.msg.CreditTransferTransaction7.SettlementTimeRequest,
					com.tools20022.repository.msg.CreditTransferTransactionInformation3.SettlementTimeRequest, com.tools20022.repository.msg.CreditTransferTransactionInformation13.SettlementTimeRequest,
					com.tools20022.repository.msg.CreditTransferTransaction4.SettlementTimeRequest, com.tools20022.repository.msg.CreditTransferTransaction8.SettlementTimeRequest,
					com.tools20022.repository.msg.DirectDebitTransactionInformation15.SettlementTimeRequest, com.tools20022.repository.msg.CreditTransferTransactionInformation7.SettlementTimeRequest,
					com.tools20022.repository.msg.CreditTransferTransactionInformation9.SettlementTimeRequest, com.tools20022.repository.msg.CreditTransferTransaction17.SettlementTimeRequest,
					com.tools20022.repository.msg.CreditTransferTransaction19.SettlementTimeRequest, com.tools20022.repository.msg.CreditTransferTransaction23.SettlementTimeRequest,
					com.tools20022.repository.msg.CreditTransferTransaction25.SettlementTimeRequest);
			elementContext_lazy = () -> Payment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettlementTimeRequest";
			definition = "Information on the requested settlement time of the instruction.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.SettlementTimeRequest.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SettlementTimeRequest.Payment;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Amount of the payment.
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
	 * {@linkplain com.tools20022.repository.msg.CardAmountAndCurrencyExchange1#Amount
	 * CardAmountAndCurrencyExchange1.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference19#Amount
	 * OriginalTransactionReference19.Amount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashMovement1#Amount
	 * CashMovement1.Amount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashMovement2#Amount
	 * CashMovement2.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashProceeds1#PostingAmount
	 * CashProceeds1.PostingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashMovement3#PostingAmount
	 * CashMovement3.PostingAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.NotificationItem3#Amount
	 * NotificationItem3.Amount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OriginalItem1#Amount
	 * OriginalItem1.Amount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OriginalItem2#Amount
	 * OriginalItem2.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItemAndStatus1#Amount
	 * OriginalItemAndStatus1.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItemAndStatus2#Amount
	 * OriginalItemAndStatus2.Amount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.NotificationItem4#Amount
	 * NotificationItem4.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItemAndStatus3#Amount
	 * OriginalItemAndStatus3.Amount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount6#Amount
	 * DetailedAmount6.Amount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount4#Amount
	 * DetailedAmount4.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItemAndStatus4#Amount
	 * OriginalItemAndStatus4.Amount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.NotificationItem5#Amount
	 * NotificationItem5.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference21#Amount
	 * OriginalTransactionReference21.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReconciliationList1#PaymentAmount
	 * ReconciliationList1.PaymentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMAccountStatement2#Amount
	 * ATMAccountStatement2.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction1#TotalRequestedAmount
	 * ATMTransaction1.TotalRequestedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction1#DetailedRequestedAmount
	 * ATMTransaction1.DetailedRequestedAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AmountAndCurrency1#Amount
	 * AmountAndCurrency1.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DetailedAmount12#AmountToDispense
	 * DetailedAmount12.AmountToDispense}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ATMTransaction8#Amount
	 * ATMTransaction8.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction3#BundlePresentedAmount
	 * ATMTransaction3.BundlePresentedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction3#TotalPresentedAmount
	 * ATMTransaction3.TotalPresentedAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount13#Amount
	 * DetailedAmount13.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction6#TotalRequestedAmount
	 * ATMTransaction6.TotalRequestedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction6#DetailedRequestedAmount
	 * ATMTransaction6.DetailedRequestedAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount11#Amount
	 * DetailedAmount11.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DetailedAmount11#OriginalAmount
	 * DetailedAmount11.OriginalAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount10#Amount
	 * DetailedAmount10.Amount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount9#Amount
	 * DetailedAmount9.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction10#AmountNetReconciliation
	 * CardTransaction10.AmountNetReconciliation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionAmount2#TotalAmount
	 * CardTransactionAmount2.TotalAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount8#Amount
	 * DetailedAmount8.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionAmount1#TotalAmount
	 * CardTransactionAmount1.TotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction9#AmountNetReconciliation
	 * CardTransaction9.AmountNetReconciliation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionDetail5#TransactionFees
	 * CardTransactionDetail5.TransactionFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionDetail2#TransactionAmounts
	 * CardTransactionDetail2.TransactionAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionDetail4#TransactionAmounts
	 * CardTransactionDetail4.TransactionAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionDetail6#TransactionFees
	 * CardTransactionDetail6.TransactionFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionAmount5#TotalAmount
	 * CardTransactionAmount5.TotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionAmount3#TotalAmount
	 * CardTransactionAmount3.TotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionAmount4#TotalAmount
	 * CardTransactionAmount4.TotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionDetail3#TransactionFees
	 * CardTransactionDetail3.TransactionFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionCertificate2#Amount
	 * TransactionCertificate2.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItemAndStatus5#Amount
	 * OriginalItemAndStatus5.Amount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.NotificationItem6#Amount
	 * NotificationItem6.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference23#Amount
	 * OriginalTransactionReference23.Amount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount14#Amount
	 * DetailedAmount14.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction17#BundlePresentedAmount
	 * ATMTransaction17.BundlePresentedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction17#TotalPresentedAmount
	 * ATMTransaction17.TotalPresentedAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount18#Amount
	 * DetailedAmount18.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction13#TotalRequestedAmount
	 * ATMTransaction13.TotalRequestedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction13#DetailedRequestedAmount
	 * ATMTransaction13.DetailedRequestedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction16#TotalAuthorisedAmount
	 * ATMTransaction16.TotalAuthorisedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction16#DetailedRequestedAmount
	 * ATMTransaction16.DetailedRequestedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction19#TotalAuthorisedAmount
	 * ATMTransaction19.TotalAuthorisedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction19#DetailedRequestedAmount
	 * ATMTransaction19.DetailedRequestedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DetailedAmount16#AmountToDeposit
	 * DetailedAmount16.AmountToDeposit}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction15#TotalAmount
	 * ATMTransaction15.TotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction15#DetailedRequestedAmount
	 * ATMTransaction15.DetailedRequestedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction24#DetailedRequestedAmount
	 * ATMTransaction24.DetailedRequestedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DetailedAmount17#AmountToTransfer
	 * DetailedAmount17.AmountToTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction23#DetailedRequestedAmount
	 * ATMTransaction23.DetailedRequestedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction29#TotalRequestedAmount
	 * ATMTransaction29.TotalRequestedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction29#DetailedRequestedAmount
	 * ATMTransaction29.DetailedRequestedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference26#Amount
	 * OriginalTransactionReference26.Amount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Payment
	 * Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of the payment."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Amount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardAmountAndCurrencyExchange1.Amount, com.tools20022.repository.msg.OriginalTransactionReference19.Amount, com.tools20022.repository.msg.CashMovement1.Amount,
					com.tools20022.repository.msg.CashMovement2.Amount, com.tools20022.repository.msg.CashProceeds1.PostingAmount, com.tools20022.repository.msg.CashMovement3.PostingAmount,
					com.tools20022.repository.msg.NotificationItem3.Amount, com.tools20022.repository.msg.OriginalItem1.Amount, com.tools20022.repository.msg.OriginalItem2.Amount,
					com.tools20022.repository.msg.OriginalItemAndStatus1.Amount, com.tools20022.repository.msg.OriginalItemAndStatus2.Amount, com.tools20022.repository.msg.NotificationItem4.Amount,
					com.tools20022.repository.msg.OriginalItemAndStatus3.Amount, com.tools20022.repository.msg.DetailedAmount6.Amount, com.tools20022.repository.msg.DetailedAmount4.Amount,
					com.tools20022.repository.msg.OriginalItemAndStatus4.Amount, com.tools20022.repository.msg.NotificationItem5.Amount, com.tools20022.repository.msg.OriginalTransactionReference21.Amount,
					com.tools20022.repository.msg.ReconciliationList1.PaymentAmount, com.tools20022.repository.msg.ATMAccountStatement2.Amount, com.tools20022.repository.msg.ATMTransaction1.TotalRequestedAmount,
					com.tools20022.repository.msg.ATMTransaction1.DetailedRequestedAmount, com.tools20022.repository.msg.AmountAndCurrency1.Amount, com.tools20022.repository.msg.DetailedAmount12.AmountToDispense,
					com.tools20022.repository.msg.ATMTransaction8.Amount, com.tools20022.repository.msg.ATMTransaction3.BundlePresentedAmount, com.tools20022.repository.msg.ATMTransaction3.TotalPresentedAmount,
					com.tools20022.repository.msg.DetailedAmount13.Amount, com.tools20022.repository.msg.ATMTransaction6.TotalRequestedAmount, com.tools20022.repository.msg.ATMTransaction6.DetailedRequestedAmount,
					com.tools20022.repository.msg.DetailedAmount11.Amount, com.tools20022.repository.msg.DetailedAmount11.OriginalAmount, com.tools20022.repository.msg.DetailedAmount10.Amount,
					com.tools20022.repository.msg.DetailedAmount9.Amount, com.tools20022.repository.msg.CardTransaction10.AmountNetReconciliation, com.tools20022.repository.msg.CardTransactionAmount2.TotalAmount,
					com.tools20022.repository.msg.DetailedAmount8.Amount, com.tools20022.repository.msg.CardTransactionAmount1.TotalAmount, com.tools20022.repository.msg.CardTransaction9.AmountNetReconciliation,
					com.tools20022.repository.msg.CardTransactionDetail5.TransactionFees, com.tools20022.repository.msg.CardTransactionDetail2.TransactionAmounts, com.tools20022.repository.msg.CardTransactionDetail4.TransactionAmounts,
					com.tools20022.repository.msg.CardTransactionDetail6.TransactionFees, com.tools20022.repository.msg.CardTransactionAmount5.TotalAmount, com.tools20022.repository.msg.CardTransactionAmount3.TotalAmount,
					com.tools20022.repository.msg.CardTransactionAmount4.TotalAmount, com.tools20022.repository.msg.CardTransactionDetail3.TransactionFees, com.tools20022.repository.msg.TransactionCertificate2.Amount,
					com.tools20022.repository.msg.OriginalItemAndStatus5.Amount, com.tools20022.repository.msg.NotificationItem6.Amount, com.tools20022.repository.msg.OriginalTransactionReference23.Amount,
					com.tools20022.repository.msg.DetailedAmount14.Amount, com.tools20022.repository.msg.ATMTransaction17.BundlePresentedAmount, com.tools20022.repository.msg.ATMTransaction17.TotalPresentedAmount,
					com.tools20022.repository.msg.DetailedAmount18.Amount, com.tools20022.repository.msg.ATMTransaction13.TotalRequestedAmount, com.tools20022.repository.msg.ATMTransaction13.DetailedRequestedAmount,
					com.tools20022.repository.msg.ATMTransaction16.TotalAuthorisedAmount, com.tools20022.repository.msg.ATMTransaction16.DetailedRequestedAmount, com.tools20022.repository.msg.ATMTransaction19.TotalAuthorisedAmount,
					com.tools20022.repository.msg.ATMTransaction19.DetailedRequestedAmount, com.tools20022.repository.msg.DetailedAmount16.AmountToDeposit, com.tools20022.repository.msg.ATMTransaction15.TotalAmount,
					com.tools20022.repository.msg.ATMTransaction15.DetailedRequestedAmount, com.tools20022.repository.msg.ATMTransaction24.DetailedRequestedAmount, com.tools20022.repository.msg.DetailedAmount17.AmountToTransfer,
					com.tools20022.repository.msg.ATMTransaction23.DetailedRequestedAmount, com.tools20022.repository.msg.ATMTransaction29.TotalRequestedAmount, com.tools20022.repository.msg.ATMTransaction29.DetailedRequestedAmount,
					com.tools20022.repository.msg.OriginalTransactionReference26.Amount);
			elementContext_lazy = () -> Payment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Amount";
			definition = "Amount of the payment.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Specifies the settlement operation which originates the payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CommercialTradeSettlement#Payment
	 * CommercialTradeSettlement.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CommercialTradeSettlement
	 * CommercialTradeSettlement}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EarlyPayment1#EarlyPaymentTaxSpecification
	 * EarlyPayment1.EarlyPaymentTaxSpecification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Payment
	 * Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the settlement operation which originates the payment."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd TradeSettlement = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.EarlyPayment1.EarlyPaymentTaxSpecification);
			elementContext_lazy = () -> Payment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TradeSettlement";
			definition = "Specifies the settlement operation which originates the payment.";
			minOccurs = 0;
			type_lazy = () -> CommercialTradeSettlement.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CommercialTradeSettlement.Payment;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Identifies the standard settlement instructions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Payment
	 * Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StandardSettlementInstructions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the standard settlement instructions."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute StandardSettlementInstructions = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Payment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StandardSettlementInstructions";
			definition = "Identifies the standard settlement instructions.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};
	/**
	 * Payment which is the result of the debit authorisation
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DebitAuthorisation#AuthorisedReturn
	 * DebitAuthorisation.AuthorisedReturn}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DebitAuthorisation
	 * DebitAuthorisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Payment
	 * Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedDebitAuthorisation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Payment which is the result of the debit authorisation"</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedDebitAuthorisation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Payment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedDebitAuthorisation";
			definition = "Payment which is the result of the debit authorisation";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> DebitAuthorisation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.DebitAuthorisation.AuthorisedReturn;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Case resolution related to a specific payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseResolution#PaymentCorrection
	 * PaymentInvestigationCaseResolution.PaymentCorrection}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseResolution
	 * PaymentInvestigationCaseResolution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Payment
	 * Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedInvestigationCaseResolution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Case resolution related to a specific payment."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedInvestigationCaseResolution = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Payment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedInvestigationCaseResolution";
			definition = "Case resolution related to a specific payment.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> PaymentInvestigationCaseResolution.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentInvestigationCaseResolution.PaymentCorrection;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Original payment which is returned.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Payment#ReturnPayment
	 * Payment.ReturnPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Payment
	 * Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Original payment which is returned."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd OriginalPayment = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Payment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OriginalPayment";
			definition = "Original payment which is returned.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Payment.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Payment.ReturnPayment;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Payment which offsets an original payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Payment#OriginalPayment
	 * Payment.OriginalPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Payment
	 * Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReturnPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Payment which offsets an original payment."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ReturnPayment = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Payment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ReturnPayment";
			definition = "Payment which offsets an original payment.";
			minOccurs = 0;
			type_lazy = () -> Payment.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Payment.OriginalPayment;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Securities settlement process which is the source of the payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#Payment
	 * SecuritiesSettlement.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Payment
	 * Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedSecuritiesSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities settlement process which is the source of the payment."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedSecuritiesSettlement = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Payment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedSecuritiesSettlement";
			definition = "Securities settlement process which is the source of the payment.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesSettlement.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.Payment;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Reconciliation of the amounts of an invoice with the amounts included in
	 * one or more payments.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Invoice#Payment
	 * Invoice.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Invoice Invoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Payment
	 * Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvoiceReconciliation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reconciliation of the amounts of an invoice with the amounts included in one or more payments."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd InvoiceReconciliation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Payment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvoiceReconciliation";
			definition = "Reconciliation of the amounts of an invoice with the amounts included in one or more payments.";
			minOccurs = 0;
			type_lazy = () -> Invoice.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Invoice.Payment;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Payment type at the origin of the cash entry eg, a cheque.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentInstrumentCode
	 * PaymentInstrumentCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentOrigin1Choice#Instrument
	 * PaymentOrigin1Choice.Instrument}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionReferenceDetails3#PaymentMethod
	 * PaymentInstructionReferenceDetails3.PaymentMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionReferenceDetails4#PaymentMethod
	 * PaymentInstructionReferenceDetails4.PaymentMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionCertificate2#TransactionType
	 * TransactionCertificate2.TransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionCertificate2#LocalInstrument
	 * TransactionCertificate2.LocalInstrument}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Payment
	 * Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentInstrument"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Payment type at the origin of the cash entry eg, a cheque."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PaymentInstrument = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.PaymentOrigin1Choice.Instrument, com.tools20022.repository.msg.PaymentInstructionReferenceDetails3.PaymentMethod,
					com.tools20022.repository.msg.PaymentInstructionReferenceDetails4.PaymentMethod, com.tools20022.repository.msg.TransactionCertificate2.TransactionType,
					com.tools20022.repository.msg.TransactionCertificate2.LocalInstrument);
			elementContext_lazy = () -> Payment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PaymentInstrument";
			definition = "Payment type at the origin of the cash entry eg, a cheque.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PaymentInstrumentCode.mmObject();
		}
	};
	/**
	 * Account debited for the payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount#Payment
	 * CashAccount.Payment}</li>
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
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction1#AccountData
	 * ATMTransaction1.AccountData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction2#AccountData
	 * ATMTransaction2.AccountData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction7#AccountInformation
	 * ATMTransaction7.AccountInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction3#AccountData
	 * ATMTransaction3.AccountData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction6#AccountData
	 * ATMTransaction6.AccountData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionDetail1#AccountFrom
	 * CardTransactionDetail1.AccountFrom}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionDetail1#AccountTo
	 * CardTransactionDetail1.AccountTo}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionDetail3#AccountFrom
	 * CardTransactionDetail3.AccountFrom}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionDetail3#AccountTo
	 * CardTransactionDetail3.AccountTo}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction14#AccountData
	 * ATMTransaction14.AccountData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction17#AccountData
	 * ATMTransaction17.AccountData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction13#AccountData
	 * ATMTransaction13.AccountData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction16#AccountData
	 * ATMTransaction16.AccountData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction19#AccountData
	 * ATMTransaction19.AccountData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction15#AccountData
	 * ATMTransaction15.AccountData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction21#AccountInformation
	 * ATMTransaction21.AccountInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction24#AccountFrom
	 * ATMTransaction24.AccountFrom}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction23#AccountFrom
	 * ATMTransaction23.AccountFrom}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction29#AccountData
	 * ATMTransaction29.AccountData}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Payment
	 * Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Account"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account debited for the payment."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Account = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMTransaction1.AccountData, com.tools20022.repository.msg.ATMTransaction2.AccountData, com.tools20022.repository.msg.ATMTransaction7.AccountInformation,
					com.tools20022.repository.msg.ATMTransaction3.AccountData, com.tools20022.repository.msg.ATMTransaction6.AccountData, com.tools20022.repository.msg.CardTransactionDetail1.AccountFrom,
					com.tools20022.repository.msg.CardTransactionDetail1.AccountTo, com.tools20022.repository.msg.CardTransactionDetail3.AccountFrom, com.tools20022.repository.msg.CardTransactionDetail3.AccountTo,
					com.tools20022.repository.msg.ATMTransaction14.AccountData, com.tools20022.repository.msg.ATMTransaction17.AccountData, com.tools20022.repository.msg.ATMTransaction13.AccountData,
					com.tools20022.repository.msg.ATMTransaction16.AccountData, com.tools20022.repository.msg.ATMTransaction19.AccountData, com.tools20022.repository.msg.ATMTransaction15.AccountData,
					com.tools20022.repository.msg.ATMTransaction21.AccountInformation, com.tools20022.repository.msg.ATMTransaction24.AccountFrom, com.tools20022.repository.msg.ATMTransaction23.AccountFrom,
					com.tools20022.repository.msg.ATMTransaction29.AccountData);
			elementContext_lazy = () -> Payment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Account";
			definition = "Account debited for the payment.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> CashAccount.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CashAccount.Payment;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the charges or the allowance related to a payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment#Payment
	 * Adjustment.Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Adjustment
	 * Adjustment}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RemittanceAmount1#AdjustmentAmountAndReason
	 * RemittanceAmount1.AdjustmentAmountAndReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RemittanceAmount2#AdjustmentAmountAndReason
	 * RemittanceAmount2.AdjustmentAmountAndReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction36#CompensationAmount
	 * PaymentTransaction36.CompensationAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Payment
	 * Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Adjustments"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the charges or the allowance related to a payment."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Adjustments = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RemittanceAmount1.AdjustmentAmountAndReason, com.tools20022.repository.msg.RemittanceAmount2.AdjustmentAmountAndReason,
					com.tools20022.repository.msg.PaymentTransaction36.CompensationAmount);
			elementContext_lazy = () -> Payment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Adjustments";
			definition = "Specifies the charges or the allowance related to a payment.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Adjustment.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Adjustment.Payment;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Provides the payment of the registered contract.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RegisteredContract#RelatedPayment
	 * RegisteredContract.RelatedPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.RegisteredContract
	 * RegisteredContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Payment
	 * Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContractRegistration"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the payment of the registered contract."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ContractRegistration = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Payment.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ContractRegistration";
			definition = "Provides the payment of the registered contract.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> RegisteredContract.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.RegisteredContract.RelatedPayment;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Payment";
				definition = "Payment information and processes required to transfer cash end to end from the debtor to the creditor.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashAccount.Payment, com.tools20022.repository.entity.Tax.RelatedPaymentSettlement, com.tools20022.repository.entity.Adjustment.Payment,
						com.tools20022.repository.entity.PaymentObligation.PaymentOffset, com.tools20022.repository.entity.Payment.OriginalPayment, com.tools20022.repository.entity.Payment.ReturnPayment,
						com.tools20022.repository.entity.CreditInstrument.RelatedPayment, com.tools20022.repository.entity.PaymentExecution.Payment, com.tools20022.repository.entity.PaymentIdentification.Payment,
						com.tools20022.repository.entity.PaymentPartyRole.Payment, com.tools20022.repository.entity.PaymentStatus.Payment, com.tools20022.repository.entity.SecuritiesSettlement.Payment,
						com.tools20022.repository.entity.CurrencyExchange.RelatedPayment, com.tools20022.repository.entity.Invoice.Payment, com.tools20022.repository.entity.PaymentInvestigationCase.UnderlyingPayment,
						com.tools20022.repository.entity.SettlementTimeRequest.Payment, com.tools20022.repository.entity.DebitAuthorisation.AuthorisedReturn,
						com.tools20022.repository.entity.PaymentInvestigationCaseResolution.PaymentCorrection, com.tools20022.repository.entity.CommercialTradeSettlement.Payment,
						com.tools20022.repository.entity.RegisteredContract.RelatedPayment);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvestmentFundCashSettlementInformation1.SubscriptionPaymentInstrument,
						com.tools20022.repository.msg.InvestmentFundCashSettlementInformation1.RedemptionPaymentInstrument, com.tools20022.repository.msg.InvestmentFundCashSettlementInformation1.DividendPaymentInstrument,
						com.tools20022.repository.msg.InvestmentFundCashSettlementInformation1.SavingsPlanPaymentInstrument, com.tools20022.repository.msg.InvestmentFundCashSettlementInformation3.SubscriptionPaymentInstrument,
						com.tools20022.repository.msg.InvestmentFundCashSettlementInformation3.RedemptionPaymentInstrument, com.tools20022.repository.msg.InvestmentFundCashSettlementInformation3.DividendPaymentInstrument,
						com.tools20022.repository.msg.InvestmentFundCashSettlementInformation3.SavingsPlanPaymentInstrument, com.tools20022.repository.msg.InvestmentFundCashSettlementInformation5.SubscriptionPaymentInstrument,
						com.tools20022.repository.msg.InvestmentFundCashSettlementInformation5.RedemptionPaymentInstrument, com.tools20022.repository.msg.InvestmentFundCashSettlementInformation5.DividendPaymentInstrument,
						com.tools20022.repository.msg.InvestmentFundCashSettlementInformation5.SavingsPlanPaymentInstrument, com.tools20022.repository.msg.InvestmentFundCashSettlementInformation5.InterestPaymentInstrument,
						com.tools20022.repository.msg.InvestmentFundCashSettlementInformation2.SubscriptionPaymentInstrument, com.tools20022.repository.msg.InvestmentFundCashSettlementInformation2.RedemptionPaymentInstrument,
						com.tools20022.repository.msg.InvestmentFundCashSettlementInformation2.DividendPaymentInstrument, com.tools20022.repository.msg.InvestmentFundCashSettlementInformation2.SavingsPlanPaymentInstrument,
						com.tools20022.repository.msg.InvestmentFundCashSettlementInformation4.SubscriptionPaymentInstrument, com.tools20022.repository.msg.InvestmentFundCashSettlementInformation4.RedemptionPaymentInstrument,
						com.tools20022.repository.msg.InvestmentFundCashSettlementInformation4.DividendPaymentInstrument, com.tools20022.repository.msg.InvestmentFundCashSettlementInformation4.SavingsPlanPaymentInstrument,
						com.tools20022.repository.msg.InvestmentFundCashSettlementInformation6.SubscriptionPaymentInstrument, com.tools20022.repository.msg.InvestmentFundCashSettlementInformation6.RedemptionPaymentInstrument,
						com.tools20022.repository.msg.InvestmentFundCashSettlementInformation6.DividendPaymentInstrument, com.tools20022.repository.msg.InvestmentFundCashSettlementInformation6.SavingsPlanPaymentInstrument,
						com.tools20022.repository.msg.InvestmentFundCashSettlementInformation6.InterestPaymentInstrument, com.tools20022.repository.msg.TransactionReportDetails3.Transaction,
						com.tools20022.repository.msg.TransactionReportDetails4.Transaction, com.tools20022.repository.msg.TransactionReportDetails5.Transaction,
						com.tools20022.repository.msg.PaymentTransactionInformation3.OriginalTransactionReference, com.tools20022.repository.msg.PaymentTransactionInformation30.OriginalTransactionReference,
						com.tools20022.repository.msg.OriginalPaymentInformation4.OriginalGroupInformation, com.tools20022.repository.msg.OriginalPaymentInformation4.TransactionInformation,
						com.tools20022.repository.msg.PaymentTransaction37.OriginalTransactionReference, com.tools20022.repository.msg.OriginalPaymentInstruction4.OriginalGroupInformation,
						com.tools20022.repository.msg.OriginalPaymentInstruction4.TransactionInformation, com.tools20022.repository.msg.PaymentTransaction47.OriginalTransactionReference,
						com.tools20022.repository.msg.OriginalPaymentInstruction8.OriginalGroupInformation, com.tools20022.repository.msg.OriginalPaymentInstruction8.TransactionInformation,
						com.tools20022.repository.msg.PaymentTransactionInformation4.OriginalTransactionReference, com.tools20022.repository.msg.PaymentTransactionInformation28.OriginalTransactionReference,
						com.tools20022.repository.msg.OriginalPaymentInformation2.TransactionInformation, com.tools20022.repository.msg.PaymentTransaction35.OriginalTransactionReference,
						com.tools20022.repository.msg.OriginalPaymentInstruction2.TransactionInformation, com.tools20022.repository.msg.PaymentTransaction42.OriginalTransactionReference,
						com.tools20022.repository.msg.OriginalPaymentInstruction7.TransactionInformation, com.tools20022.repository.msg.PaymentTransactionInformation1.OriginalTransactionReference,
						com.tools20022.repository.msg.PaymentTransactionInformation25.OriginalTransactionReference, com.tools20022.repository.msg.OriginalPaymentInformation1.TransactionInformationAndStatus,
						com.tools20022.repository.msg.PaymentTransaction32.OriginalTransactionReference, com.tools20022.repository.msg.OriginalPaymentInstruction1.TransactionInformationAndStatus,
						com.tools20022.repository.msg.PaymentTransaction46.OriginalTransactionReference, com.tools20022.repository.msg.OriginalPaymentInstruction6.TransactionInformationAndStatus,
						com.tools20022.repository.msg.PaymentTransactionInformation31.OriginalTransactionReference, com.tools20022.repository.msg.PaymentTransaction38.OriginalTransactionReference,
						com.tools20022.repository.msg.PaymentTransaction48.OriginalTransactionReference, com.tools20022.repository.msg.PaymentTransactionInformation5.OriginalTransactionReference,
						com.tools20022.repository.msg.PaymentTransactionInformation29.OriginalTransactionReference, com.tools20022.repository.msg.PaymentTransaction36.OriginalTransactionReference,
						com.tools20022.repository.msg.PaymentTransaction45.OriginalTransactionReference, com.tools20022.repository.msg.PaymentTransactionInformation26.OriginalTransactionReference,
						com.tools20022.repository.msg.PaymentTransaction33.OriginalTransactionReference, com.tools20022.repository.msg.PaymentTransaction43.OriginalTransactionReference,
						com.tools20022.repository.msg.PaymentTransactionInformation2.OriginalTransactionReference, com.tools20022.repository.msg.PaymentTransactionInformation27.OriginalTransactionReference,
						com.tools20022.repository.msg.PaymentTransaction34.OriginalTransactionReference, com.tools20022.repository.msg.PaymentTransaction44.OriginalTransactionReference,
						com.tools20022.repository.msg.PaymentTransactionInformation34.OriginalTransactionReference, com.tools20022.repository.msg.OriginalPaymentInformation5.TransactionInformationAndStatus,
						com.tools20022.repository.msg.PaymentTransaction41.OriginalTransactionReference, com.tools20022.repository.msg.OriginalPaymentInstruction5.TransactionInformationAndStatus,
						com.tools20022.repository.msg.PaymentTransaction49.OriginalTransactionReference, com.tools20022.repository.msg.OriginalPaymentInstruction9.TransactionInformationAndStatus,
						com.tools20022.repository.msg.PaymentTransaction18.PaymentInstrument, com.tools20022.repository.msg.PaymentTransaction15.PaymentInstrument, com.tools20022.repository.msg.PaymentTransaction21.PaymentInstrument,
						com.tools20022.repository.msg.PaymentTransaction22.PaymentInstrument, com.tools20022.repository.msg.PaymentTransaction17.PaymentInstrument, com.tools20022.repository.msg.PaymentTransaction19.PaymentInstrument,
						com.tools20022.repository.msg.PaymentTransaction23.PaymentInstrument, com.tools20022.repository.msg.PaymentTransaction16.PaymentInstrument, com.tools20022.repository.msg.PaymentTransaction13.PaymentInstrument,
						com.tools20022.repository.msg.PaymentTransaction24.PaymentInstrument, com.tools20022.repository.choice.CashInOrOut4Choice.CashInPaymentInstrument,
						com.tools20022.repository.choice.CashInOrOut4Choice.CashOutPaymentInstrument, com.tools20022.repository.msg.PaymentTransaction20.CashInOrOut,
						com.tools20022.repository.choice.CashInOrOut5Choice.CashInPaymentInstrument, com.tools20022.repository.choice.CashInOrOut5Choice.CashOutPaymentInstrument,
						com.tools20022.repository.msg.PaymentTransaction25.CashInOrOut, com.tools20022.repository.choice.CashInOrOut3Choice.CashInPaymentInstrument,
						com.tools20022.repository.choice.CashInOrOut3Choice.CashOutPaymentInstrument, com.tools20022.repository.msg.PaymentTransaction14.CashInOrOutChoice,
						com.tools20022.repository.choice.CashInOrOut6Choice.CashInPaymentInstrument, com.tools20022.repository.choice.CashInOrOut6Choice.CashOutPaymentInstrument,
						com.tools20022.repository.msg.PaymentTransaction26.CashInOrOut, com.tools20022.repository.msg.OriginalTransactionReference14.OriginalTransaction,
						com.tools20022.repository.msg.OriginalTransactionReference18.OriginalTransaction, com.tools20022.repository.msg.OriginalItem2.OriginalItemReference,
						com.tools20022.repository.msg.OriginalItemAndStatus2.OriginalItemReference, com.tools20022.repository.choice.UnderlyingTransaction1Choice.Interbank,
						com.tools20022.repository.msg.PaymentTransactionInformation32.OriginalTransactionReference, com.tools20022.repository.msg.OriginalPaymentInformation3.OriginalGroupInformation,
						com.tools20022.repository.msg.OriginalPaymentInformation3.TransactionInformationAndStatus, com.tools20022.repository.msg.PaymentTransactionInformation33.OriginalTransactionReference,
						com.tools20022.repository.choice.CorrectiveTransaction1Choice.Interbank, com.tools20022.repository.choice.UnderlyingTransaction2Choice.Interbank,
						com.tools20022.repository.msg.PaymentTransaction39.OriginalTransactionReference, com.tools20022.repository.msg.OriginalPaymentInstruction3.OriginalGroupInformation,
						com.tools20022.repository.msg.OriginalPaymentInstruction3.TransactionInformationAndStatus, com.tools20022.repository.msg.PaymentTransaction40.OriginalTransactionReference,
						com.tools20022.repository.msg.OriginalItem3.OriginalItemReference, com.tools20022.repository.msg.OriginalItemAndStatus3.OriginalItemReference,
						com.tools20022.repository.msg.PaymentTransactionInformation13.OriginalTransactionReference, com.tools20022.repository.msg.PaymentTransactionInformation18.OriginalTransactionReference,
						com.tools20022.repository.msg.PaymentTransactionInformation15.OriginalTransactionReference, com.tools20022.repository.msg.PaymentTransactionInformation22.OriginalTransactionReference,
						com.tools20022.repository.msg.PaymentTransactionInformation12.OriginalTransactionReference, com.tools20022.repository.msg.PaymentTransactionInformation19.OriginalTransactionReference,
						com.tools20022.repository.msg.PaymentTransactionInformation14.OriginalTransactionReference, com.tools20022.repository.msg.PaymentTransactionInformation20.OriginalTransactionReference,
						com.tools20022.repository.msg.PaymentTransactionInformation16.OriginalTransactionReference, com.tools20022.repository.msg.PaymentTransactionInformation23.OriginalTransactionReference,
						com.tools20022.repository.msg.PaymentTransactionInformation17.OriginalTransactionReference, com.tools20022.repository.msg.PaymentTransactionInformation24.OriginalTransactionReference,
						com.tools20022.repository.msg.PaymentTransactionInformation21.OriginalTransactionReference, com.tools20022.repository.msg.PaymentTransaction30.PaymentInstrument,
						com.tools20022.repository.msg.PaymentTransaction28.PaymentInstrument, com.tools20022.repository.msg.PaymentTransaction31.PaymentInstrument,
						com.tools20022.repository.msg.InvestmentFundCashSettlementInformation7.SubscriptionPaymentInstrument, com.tools20022.repository.msg.InvestmentFundCashSettlementInformation7.RedemptionPaymentInstrument,
						com.tools20022.repository.msg.InvestmentFundCashSettlementInformation7.DividendPaymentInstrument, com.tools20022.repository.msg.InvestmentFundCashSettlementInformation7.SavingsPlanPaymentInstrument,
						com.tools20022.repository.msg.InvestmentFundCashSettlementInformation7.InterestPaymentInstrument, com.tools20022.repository.msg.InvestmentFundCashSettlementInformation8.SubscriptionPaymentInstrument,
						com.tools20022.repository.msg.InvestmentFundCashSettlementInformation8.RedemptionPaymentInstrument, com.tools20022.repository.msg.InvestmentFundCashSettlementInformation8.DividendPaymentInstrument,
						com.tools20022.repository.msg.InvestmentFundCashSettlementInformation8.SavingsPlanPaymentInstrument, com.tools20022.repository.msg.InvestmentFundCashSettlementInformation8.InterestPaymentInstrument,
						com.tools20022.repository.choice.PaymentCodeOrOther1Choice.PaymentCode, com.tools20022.repository.msg.OriginalPaymentInformation6.Amount,
						com.tools20022.repository.msg.PaymentTransaction50.OriginalTransactionReference, com.tools20022.repository.msg.OriginalPaymentInstruction12.TransactionInformationAndStatus,
						com.tools20022.repository.msg.OriginalPaymentInstruction11.TransactionInformation, com.tools20022.repository.msg.PaymentTransaction52.OriginalTransactionReference,
						com.tools20022.repository.msg.PaymentTransaction51.OriginalTransactionReference, com.tools20022.repository.msg.OriginalItem4.OriginalItemReference,
						com.tools20022.repository.msg.OriginalPaymentInstruction13.OriginalGroupInformation, com.tools20022.repository.msg.OriginalPaymentInstruction13.TransactionInformation,
						com.tools20022.repository.msg.PaymentTransaction58.OriginalTransactionReference, com.tools20022.repository.msg.OriginalPaymentInstruction10.OriginalGroupInformation,
						com.tools20022.repository.msg.OriginalPaymentInstruction10.TransactionInformationAndStatus, com.tools20022.repository.msg.PaymentTransaction54.OriginalTransactionReference,
						com.tools20022.repository.msg.OriginalItemAndStatus4.OriginalItemReference, com.tools20022.repository.msg.PaymentTransaction53.OriginalTransactionReference,
						com.tools20022.repository.msg.PaymentTransaction57.OriginalTransactionReference, com.tools20022.repository.msg.PaymentTransaction56.OriginalTransactionReference,
						com.tools20022.repository.msg.PaymentTransaction55.OriginalTransactionReference, com.tools20022.repository.msg.OriginalPaymentInstruction14.TransactionInformationAndStatus,
						com.tools20022.repository.msg.PaymentTransaction59.OriginalTransactionReference, com.tools20022.repository.msg.ContractRegistrationStatement1.TransactionJournal,
						com.tools20022.repository.msg.TransactionCertificateRecord1.Transaction, com.tools20022.repository.msg.OriginalPaymentInstruction16.TransactionInformation,
						com.tools20022.repository.msg.OriginalPaymentInstruction18.TransactionInformationAndStatus, com.tools20022.repository.msg.PaymentTransaction65.OriginalTransactionReference,
						com.tools20022.repository.msg.PaymentTransaction63.OriginalTransactionReference, com.tools20022.repository.msg.PaymentTransaction60.OriginalTransactionReference,
						com.tools20022.repository.msg.PaymentTransaction68.OriginalTransactionReference, com.tools20022.repository.msg.PaymentTransaction61.OriginalTransactionReference,
						com.tools20022.repository.msg.OriginalPaymentInstruction15.OriginalGroupInformation, com.tools20022.repository.msg.OriginalPaymentInstruction15.TransactionInformation,
						com.tools20022.repository.msg.OriginalItem5.OriginalItemReference, com.tools20022.repository.msg.OriginalItemAndStatus5.OriginalItemReference,
						com.tools20022.repository.msg.PaymentTransaction66.OriginalTransactionReference, com.tools20022.repository.msg.PaymentTransaction67.OriginalTransactionReference,
						com.tools20022.repository.msg.PaymentTransaction62.OriginalTransactionReference, com.tools20022.repository.msg.PaymentTransaction64.OriginalTransactionReference,
						com.tools20022.repository.msg.OriginalPaymentInstruction17.OriginalGroupInformation, com.tools20022.repository.msg.OriginalPaymentInstruction17.TransactionInformationAndStatus,
						com.tools20022.repository.msg.CashSettlement1.OtherCashSettlementDetails, com.tools20022.repository.msg.CashSettlement2.OtherCashSettlementDetails,
						com.tools20022.repository.msg.PaymentInstrument13.SubscriptionPaymentInstrument, com.tools20022.repository.msg.PaymentInstrument13.RedemptionPaymentInstrument,
						com.tools20022.repository.msg.PaymentInstrument13.DividendPaymentInstrument, com.tools20022.repository.msg.PaymentInstrument13.SavingsPlanPaymentInstrument,
						com.tools20022.repository.msg.PaymentInstrument13.InterestPaymentInstrument, com.tools20022.repository.msg.OriginalPaymentInstruction19.TransactionInformationAndStatus,
						com.tools20022.repository.msg.PaymentTransaction69.OriginalTransactionReference, com.tools20022.repository.msg.PaymentTransaction72.PaymentInstrument,
						com.tools20022.repository.msg.PaymentTransaction70.PaymentInstrument, com.tools20022.repository.msg.PaymentTransaction71.CashInOrOut, com.tools20022.repository.choice.CashInOrOut7Choice.CashInPaymentInstrument,
						com.tools20022.repository.choice.CashInOrOut7Choice.CashOutPaymentInstrument, com.tools20022.repository.choice.UnderlyingTransaction3Choice.Interbank,
						com.tools20022.repository.msg.PaymentTransaction80.OriginalTransactionReference, com.tools20022.repository.msg.PaymentTransaction81.OriginalTransactionReference,
						com.tools20022.repository.msg.OriginalPaymentInstruction23.TransactionInformationAndStatus, com.tools20022.repository.msg.OriginalPaymentInstruction21.TransactionInformation,
						com.tools20022.repository.msg.OriginalPaymentInstruction24.TransactionInformationAndStatus, com.tools20022.repository.msg.PaymentTransaction76.OriginalTransactionReference,
						com.tools20022.repository.choice.CorrectiveTransaction2Choice.Interbank, com.tools20022.repository.msg.OriginalPaymentInstruction22.OriginalGroupInformation,
						com.tools20022.repository.msg.OriginalPaymentInstruction22.TransactionInformationAndStatus, com.tools20022.repository.msg.PaymentTransaction78.OriginalTransactionReference,
						com.tools20022.repository.msg.OriginalPaymentInstruction20.OriginalGroupInformation, com.tools20022.repository.msg.OriginalPaymentInstruction20.TransactionInformation,
						com.tools20022.repository.msg.PaymentTransaction74.OriginalTransactionReference, com.tools20022.repository.msg.OriginalPaymentInformation7.Amount,
						com.tools20022.repository.msg.PaymentTransaction83.OriginalTransactionReference, com.tools20022.repository.msg.PaymentTransaction77.OriginalTransactionReference,
						com.tools20022.repository.msg.PaymentTransaction75.OriginalTransactionReference, com.tools20022.repository.msg.PaymentTransaction82.OriginalTransactionReference,
						com.tools20022.repository.msg.PaymentTransaction79.OriginalTransactionReference);
				subType_lazy = () -> Arrays.asList(IndividualPayment.mmObject(), BulkPayment.mmObject());
				superType_lazy = () -> ObligationFulfilment.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Payment.PaymentObligation, com.tools20022.repository.entity.Payment.CurrencyOfTransfer, com.tools20022.repository.entity.Payment.CreditMethod,
						com.tools20022.repository.entity.Payment.Type, com.tools20022.repository.entity.Payment.InstructedAmount, com.tools20022.repository.entity.Payment.Priority, com.tools20022.repository.entity.Payment.ValueDate,
						com.tools20022.repository.entity.Payment.PaymentStatus, com.tools20022.repository.entity.Payment.PartyRole, com.tools20022.repository.entity.Payment.TaxOnPayment,
						com.tools20022.repository.entity.Payment.PaymentExecution, com.tools20022.repository.entity.Payment.PoolingAdjustmentDate, com.tools20022.repository.entity.Payment.EquivalentAmount,
						com.tools20022.repository.entity.Payment.CurrencyExchange, com.tools20022.repository.entity.Payment.InstructionForCreditorAgent, com.tools20022.repository.entity.Payment.InstructionForDebtorAgent,
						com.tools20022.repository.entity.Payment.PaymentRelatedIdentifications, com.tools20022.repository.entity.Payment.RelatedInvestigationCase, com.tools20022.repository.entity.Payment.SettlementTimeRequest,
						com.tools20022.repository.entity.Payment.Amount, com.tools20022.repository.entity.Payment.TradeSettlement, com.tools20022.repository.entity.Payment.StandardSettlementInstructions,
						com.tools20022.repository.entity.Payment.RelatedDebitAuthorisation, com.tools20022.repository.entity.Payment.RelatedInvestigationCaseResolution, com.tools20022.repository.entity.Payment.OriginalPayment,
						com.tools20022.repository.entity.Payment.ReturnPayment, com.tools20022.repository.entity.Payment.RelatedSecuritiesSettlement, com.tools20022.repository.entity.Payment.InvoiceReconciliation,
						com.tools20022.repository.entity.Payment.PaymentInstrument, com.tools20022.repository.entity.Payment.Account, com.tools20022.repository.entity.Payment.Adjustments,
						com.tools20022.repository.entity.Payment.ContractRegistration);
				derivationComponent_lazy = () -> Arrays.asList(PaymentInstrument7.mmObject(), PaymentInstrument6.mmObject(), InvestmentFundCashSettlementInformation1.mmObject(), PaymentInstrument8.mmObject(), PaymentInstrument9.mmObject(),
						InvestmentFundCashSettlementInformation3.mmObject(), PaymentInstrument17Choice.mmObject(), PaymentInstrument11.mmObject(), PaymentInstrument16Choice.mmObject(), PaymentInstrument10.mmObject(),
						InvestmentFundCashSettlementInformation5.mmObject(), InvestmentFundCashSettlementInformation2.mmObject(), InvestmentFundCashSettlementInformation4.mmObject(), InvestmentFundCashSettlementInformation6.mmObject(),
						PaymentType2Choice.mmObject(), PaymentType3Choice.mmObject(), PaymentOrigin1Choice.mmObject(), LiquidityCreditTransfer1.mmObject(), LiquidityDebitTransfer1.mmObject(), Transaction3.mmObject(),
						TransactionReportDetails3.mmObject(), Transaction4.mmObject(), TransactionReportDetails4.mmObject(), Transaction5.mmObject(), TransactionReportDetails5.mmObject(), Transaction24.mmObject(), GroupHeader23.mmObject(),
						GroupHeader42.mmObject(), GroupHeader58.mmObject(), GroupHeader1.mmObject(), com.tools20022.repository.msg.EquivalentAmount.mmObject(), AmountType1Choice.mmObject(), AmountType2Choice.mmObject(),
						InstructionForCreditorAgent1.mmObject(), GroupHeader32.mmObject(), CategoryPurpose1Choice.mmObject(), EquivalentAmount2.mmObject(), AmountType3Choice.mmObject(), GroupHeader48.mmObject(), GroupHeader39.mmObject(),
						GroupHeader55.mmObject(), GroupHeader7.mmObject(), OriginalGroupInformation4.mmObject(), OriginalTransactionReference1.mmObject(), PaymentTransactionInformation3.mmObject(), OriginalGroupInformation23.mmObject(),
						OriginalGroupInformation3.mmObject(), OriginalTransactionReference13.mmObject(), PaymentTransactionInformation30.mmObject(), OriginalPaymentInformation4.mmObject(), OriginalTransactionReference16.mmObject(),
						PaymentTransaction37.mmObject(), OriginalPaymentInstruction4.mmObject(), PaymentTransaction47.mmObject(), OriginalPaymentInstruction8.mmObject(), GroupHeader8.mmObject(), OriginalGroupInformation5.mmObject(),
						PaymentTransactionInformation4.mmObject(), GroupHeader40.mmObject(), OriginalGroupInformation22.mmObject(), PaymentTransactionInformation28.mmObject(), OriginalPaymentInformation2.mmObject(),
						GroupHeader56.mmObject(), PaymentTransaction35.mmObject(), OriginalPaymentInstruction2.mmObject(), PaymentTransaction42.mmObject(), OriginalPaymentInstruction7.mmObject(), GroupHeader5.mmObject(),
						OriginalGroupInformation1.mmObject(), PaymentTransactionInformation1.mmObject(), GroupHeader36.mmObject(), OriginalGroupInformation20.mmObject(), PaymentTransactionInformation25.mmObject(),
						OriginalPaymentInformation1.mmObject(), GroupHeader52.mmObject(), PaymentTransaction32.mmObject(), OriginalPaymentInstruction1.mmObject(), PaymentTransaction46.mmObject(), OriginalPaymentInstruction6.mmObject(),
						GroupHeader2.mmObject(), GroupHeader33.mmObject(), GroupHeader49.mmObject(), GroupHeader3.mmObject(), GroupHeader34.mmObject(), GroupHeader50.mmObject(), PaymentTransactionInformation31.mmObject(),
						PaymentTransaction38.mmObject(), PaymentTransaction48.mmObject(), GroupHeader9.mmObject(), PaymentTransactionInformation5.mmObject(), GroupHeader41.mmObject(), PaymentTransactionInformation29.mmObject(),
						GroupHeader57.mmObject(), PaymentTransaction36.mmObject(), PaymentTransaction45.mmObject(), GroupHeader37.mmObject(), PaymentTransactionInformation26.mmObject(), GroupHeader53.mmObject(),
						PaymentTransaction33.mmObject(), PaymentTransaction43.mmObject(), GroupHeader4.mmObject(), InstructionForCreditorAgent2.mmObject(), GroupHeader35.mmObject(), GroupHeader51.mmObject(), GroupHeader31.mmObject(),
						GroupHeader47.mmObject(), GroupHeader6.mmObject(), OriginalGroupInformation2.mmObject(), PaymentTransactionInformation2.mmObject(), GroupHeader38.mmObject(), OriginalGroupInformation21.mmObject(),
						PaymentTransactionInformation27.mmObject(), GroupHeader54.mmObject(), PaymentTransaction34.mmObject(), PaymentTransaction44.mmObject(), Percentage1.mmObject(), GroupHeader46.mmObject(),
						OriginalGroupInformation25.mmObject(), OriginalTransactionReference15.mmObject(), PaymentTransactionInformation34.mmObject(), OriginalPaymentInformation5.mmObject(), OriginalTransactionReference17.mmObject(),
						PaymentTransaction41.mmObject(), OriginalPaymentInstruction5.mmObject(), OriginalTransactionReference19.mmObject(), PaymentTransaction49.mmObject(), OriginalPaymentInstruction9.mmObject(), GroupHeader45.mmObject(),
						PaymentInstrument7Choice.mmObject(), PaymentTransaction18.mmObject(), PaymentTransaction15.mmObject(), PaymentInstrument11Choice.mmObject(), PaymentTransaction21.mmObject(), PaymentTransaction22.mmObject(),
						PaymentInstrument9Choice.mmObject(), PaymentTransaction17.mmObject(), PaymentInstrument10Choice.mmObject(), PaymentTransaction19.mmObject(), PaymentInstrument6Choice.mmObject(), PaymentInstrument8Choice.mmObject(),
						PaymentInstrument12Choice.mmObject(), PaymentTransaction23.mmObject(), PaymentTransaction16.mmObject(), PaymentTransaction13.mmObject(), PaymentTransaction24.mmObject(), CashInOrOut4Choice.mmObject(),
						PaymentTransaction20.mmObject(), CashInOrOut5Choice.mmObject(), PaymentTransaction25.mmObject(), CashInOrOut3Choice.mmObject(), PaymentTransaction14.mmObject(), CashInOrOut6Choice.mmObject(),
						PaymentTransaction26.mmObject(), InstructionForFinalAgent.mmObject(), CashMovement1.mmObject(), CashMovement2.mmObject(), CashMovement3.mmObject(), OriginalTransactionReference14.mmObject(),
						OriginalTransactionReference18.mmObject(), GroupHeader43.mmObject(), GroupHeader59.mmObject(), NotificationItem3.mmObject(), OriginalItem1.mmObject(), OriginalItemReference1.mmObject(), OriginalItem2.mmObject(),
						GroupHeader44.mmObject(), OriginalItemAndStatus1.mmObject(), OriginalItemAndStatus2.mmObject(), UnderlyingTransaction1Choice.mmObject(), OriginalGroupInformation24.mmObject(),
						PaymentTransactionInformation32.mmObject(), OriginalPaymentInformation3.mmObject(), PaymentTransactionInformation33.mmObject(), CorrectiveInterbankTransaction1.mmObject(), CorrectiveTransaction1Choice.mmObject(),
						InstalmentFinancingInformation1.mmObject(), PaymentMeans1.mmObject(), IntentToPay1.mmObject(), UnderlyingTransaction2Choice.mmObject(), PaymentTransaction39.mmObject(), OriginalPaymentInstruction3.mmObject(),
						PaymentTransaction40.mmObject(), NotificationItem4.mmObject(), OriginalItemReference2.mmObject(), OriginalItem3.mmObject(), GroupHeader60.mmObject(), OriginalItemAndStatus3.mmObject(),
						PaymentInstrumentType1.mmObject(), GroupHeader63.mmObject(), CreditTransferTransaction9.mmObject(), OriginalGroupInformation13.mmObject(), OriginalGroupInformation17.mmObject(),
						OriginalGroupInformation15.mmObject(), OriginalGroupInformation19.mmObject(), OriginalGroupInformation11.mmObject(), OriginalGroupInformation18.mmObject(), OriginalGroupInformation8.mmObject(),
						OriginalTransactionReference7.mmObject(), PaymentTransactionInformation13.mmObject(), OriginalTransactionReference10.mmObject(), PaymentTransactionInformation18.mmObject(), OriginalTransactionReference9.mmObject(),
						PaymentTransactionInformation15.mmObject(), OriginalTransactionReference12.mmObject(), PaymentTransactionInformation22.mmObject(), OriginalTransactionReference8.mmObject(),
						PaymentTransactionInformation12.mmObject(), OriginalTransactionReference11.mmObject(), PaymentTransactionInformation19.mmObject(), PaymentTransactionInformation14.mmObject(),
						PaymentTransactionInformation20.mmObject(), PaymentTransactionInformation16.mmObject(), PaymentTransactionInformation23.mmObject(), PaymentTransactionInformation17.mmObject(),
						PaymentTransactionInformation24.mmObject(), PaymentTransactionInformation21.mmObject(), GroupHeader19.mmObject(), GroupHeader24.mmObject(), GroupHeader20.mmObject(), GroupHeader25.mmObject(),
						GroupHeader15.mmObject(), GroupHeader26.mmObject(), GroupHeader17.mmObject(), GroupHeader27.mmObject(), GroupHeader22.mmObject(), GroupHeader28.mmObject(), GroupHeader16.mmObject(), GroupHeader29.mmObject(),
						GroupHeader18.mmObject(), GroupHeader30.mmObject(), OriginalGroupInformation16.mmObject(), OriginalGroupInformation14.mmObject(), OriginalGroupInformation7.mmObject(), GroupHeader12.mmObject(),
						GroupHeader21.mmObject(), PaymentInstrument13Choice.mmObject(), PaymentTransaction30.mmObject(), PaymentInstrument14Choice.mmObject(), PaymentTransaction28.mmObject(), PaymentTransaction31.mmObject(),
						InvestmentFundCashSettlementInformation7.mmObject(), InvestmentFundCashSettlementInformation8.mmObject(), PaymentInstrument12.mmObject(), PaymentType4Choice.mmObject(), Transaction33.mmObject(),
						OriginalPaymentInformation6.mmObject(), GroupHeader62.mmObject(), IntentToPay2.mmObject(), InstructionForCreditorAgent4.mmObject(), PaymentTransaction50.mmObject(), OriginalPaymentInstruction12.mmObject(),
						OriginalPaymentInstruction11.mmObject(), PaymentTransaction52.mmObject(), PaymentTransaction51.mmObject(), OriginalItem4.mmObject(), OriginalItemReference3.mmObject(), OriginalPaymentInstruction13.mmObject(),
						PaymentTransaction58.mmObject(), OriginalPaymentInstruction10.mmObject(), PaymentTransaction54.mmObject(), OriginalItemAndStatus4.mmObject(), PaymentTransaction53.mmObject(),
						OriginalTransactionReference20.mmObject(), PaymentTransaction57.mmObject(), PaymentTransaction56.mmObject(), PaymentTransaction55.mmObject(), NotificationItem5.mmObject(), OriginalPaymentInstruction14.mmObject(),
						OriginalTransactionReference21.mmObject(), AmountType4Choice.mmObject(), PaymentTransaction59.mmObject(), RelatedReference1.mmObject(), TransactionCertificate2.mmObject(), SpecialCondition1.mmObject(),
						GroupHeader70.mmObject(), OriginalPaymentInstruction16.mmObject(), OriginalPaymentInstruction18.mmObject(), GroupHeader72.mmObject(), PaymentTransaction65.mmObject(), PaymentTransaction63.mmObject(),
						PaymentTransaction60.mmObject(), GroupHeader71.mmObject(), PaymentTransaction68.mmObject(), PaymentTransaction61.mmObject(), OriginalTransactionReference22.mmObject(), OriginalPaymentInstruction15.mmObject(),
						OriginalItem5.mmObject(), OriginalItemAndStatus5.mmObject(), OriginalItemReference4.mmObject(), PaymentTransaction66.mmObject(), PaymentTransaction67.mmObject(), PaymentTransaction62.mmObject(),
						PaymentTransaction64.mmObject(), OriginalPaymentInstruction17.mmObject(), NotificationItem6.mmObject(), OriginalMessage2.mmObject(), CashSettlement1.mmObject(), CashSettlement2.mmObject(),
						PaymentInstrument13.mmObject(), PaymentInstrument18Choice.mmObject(), PaymentInstrument19Choice.mmObject(), OriginalPaymentInstruction19.mmObject(), PaymentTransaction69.mmObject(),
						OriginalTransactionReference23.mmObject(), OriginalMessage3.mmObject(), EarlyPayment1.mmObject(), GroupHeader69.mmObject(), OriginalGroupInformation27.mmObject(), PaymentTransaction72.mmObject(),
						PaymentTransaction70.mmObject(), PaymentTransaction71.mmObject(), PaymentInstrument21Choice.mmObject(), PaymentInstrument20Choice.mmObject(), CashInOrOut7Choice.mmObject(), PaymentTransaction73.mmObject(),
						UnderlyingTransaction3Choice.mmObject(), PaymentTransaction80.mmObject(), PaymentTransaction81.mmObject(), OriginalPaymentInstruction23.mmObject(), OriginalPaymentInstruction21.mmObject(),
						OriginalPaymentInstruction24.mmObject(), OriginalGroupInformation28.mmObject(), PaymentTransaction76.mmObject(), CorrectiveTransaction2Choice.mmObject(), MandateClassification1Choice.mmObject(),
						OriginalPaymentInstruction22.mmObject(), PaymentTransaction78.mmObject(), OriginalTransactionReference24.mmObject(), OriginalPaymentInstruction20.mmObject(), PaymentTransaction74.mmObject(),
						OriginalPaymentInformation7.mmObject(), PaymentTransaction83.mmObject(), OriginalTransactionReference26.mmObject(), PaymentTransaction77.mmObject(), PaymentTransaction75.mmObject(), PaymentTransaction82.mmObject(),
						PaymentTransaction79.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}