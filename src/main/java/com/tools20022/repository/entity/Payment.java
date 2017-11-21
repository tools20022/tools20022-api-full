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
import com.tools20022.repository.datatype.ImpliedCurrencyAndAmount;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.entity.ObligationFulfilment;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * <li>{@linkplain com.tools20022.repository.entity.Payment#mmPaymentObligation
 * Payment.mmPaymentObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Payment#mmCurrencyOfTransfer
 * Payment.mmCurrencyOfTransfer}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#mmCreditMethod
 * Payment.mmCreditMethod}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#mmType
 * Payment.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#mmInstructedAmount
 * Payment.mmInstructedAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#mmPriority
 * Payment.mmPriority}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#mmValueDate
 * Payment.mmValueDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#mmPaymentStatus
 * Payment.mmPaymentStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#mmPartyRole
 * Payment.mmPartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#mmTaxOnPayment
 * Payment.mmTaxOnPayment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#mmPaymentExecution
 * Payment.mmPaymentExecution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Payment#mmPoolingAdjustmentDate
 * Payment.mmPoolingAdjustmentDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#mmEquivalentAmount
 * Payment.mmEquivalentAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#mmCurrencyExchange
 * Payment.mmCurrencyExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Payment#mmInstructionForCreditorAgent
 * Payment.mmInstructionForCreditorAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Payment#mmInstructionForDebtorAgent
 * Payment.mmInstructionForDebtorAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Payment#mmPaymentRelatedIdentifications
 * Payment.mmPaymentRelatedIdentifications}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Payment#mmRelatedInvestigationCase
 * Payment.mmRelatedInvestigationCase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Payment#mmSettlementTimeRequest
 * Payment.mmSettlementTimeRequest}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#mmAmount
 * Payment.mmAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#mmTradeSettlement
 * Payment.mmTradeSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Payment#mmStandardSettlementInstructions
 * Payment.mmStandardSettlementInstructions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Payment#mmRelatedDebitAuthorisation
 * Payment.mmRelatedDebitAuthorisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Payment#mmRelatedInvestigationCaseResolution
 * Payment.mmRelatedInvestigationCaseResolution}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#mmOriginalPayment
 * Payment.mmOriginalPayment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#mmReturnPayment
 * Payment.mmReturnPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Payment#mmRelatedSecuritiesSettlement
 * Payment.mmRelatedSecuritiesSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Payment#mmInvoiceReconciliation
 * Payment.mmInvoiceReconciliation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#mmPaymentInstrument
 * Payment.mmPaymentInstrument}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#mmAccount
 * Payment.mmAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#mmAdjustments
 * Payment.mmAdjustments}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Payment#mmContractRegistration
 * Payment.mmContractRegistration}</li>
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
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.CashAccount#mmPayment
 * CashAccount.mmPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Tax#mmRelatedPaymentSettlement
 * Tax.mmRelatedPaymentSettlement}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Adjustment#mmPayment
 * Adjustment.mmPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmPaymentOffset
 * PaymentObligation.mmPaymentOffset}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#mmOriginalPayment
 * Payment.mmOriginalPayment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#mmReturnPayment
 * Payment.mmReturnPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CreditInstrument#mmRelatedPayment
 * CreditInstrument.mmRelatedPayment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentExecution#mmPayment
 * PaymentExecution.mmPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentIdentification#mmPayment
 * PaymentIdentification.mmPayment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentPartyRole#mmPayment
 * PaymentPartyRole.mmPayment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentStatus#mmPayment
 * PaymentStatus.mmPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmPayment
 * SecuritiesSettlement.mmPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmRelatedPayment
 * CurrencyExchange.mmRelatedPayment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Invoice#mmPayment
 * Invoice.mmPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCase#mmUnderlyingPayment
 * PaymentInvestigationCase.mmUnderlyingPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SettlementTimeRequest#mmPayment
 * SettlementTimeRequest.mmPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DebitAuthorisation#mmAuthorisedReturn
 * DebitAuthorisation.mmAuthorisedReturn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseResolution#mmPaymentCorrection
 * PaymentInvestigationCaseResolution.mmPaymentCorrection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CommercialTradeSettlement#mmPayment
 * CommercialTradeSettlement.mmPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RegisteredContract#mmRelatedPayment
 * RegisteredContract.mmRelatedPayment}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation1#mmSubscriptionPaymentInstrument
 * InvestmentFundCashSettlementInformation1.mmSubscriptionPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation1#mmRedemptionPaymentInstrument
 * InvestmentFundCashSettlementInformation1.mmRedemptionPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation1#mmDividendPaymentInstrument
 * InvestmentFundCashSettlementInformation1.mmDividendPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation1#mmSavingsPlanPaymentInstrument
 * InvestmentFundCashSettlementInformation1.mmSavingsPlanPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation3#mmSubscriptionPaymentInstrument
 * InvestmentFundCashSettlementInformation3.mmSubscriptionPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation3#mmRedemptionPaymentInstrument
 * InvestmentFundCashSettlementInformation3.mmRedemptionPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation3#mmDividendPaymentInstrument
 * InvestmentFundCashSettlementInformation3.mmDividendPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation3#mmSavingsPlanPaymentInstrument
 * InvestmentFundCashSettlementInformation3.mmSavingsPlanPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation5#mmSubscriptionPaymentInstrument
 * InvestmentFundCashSettlementInformation5.mmSubscriptionPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation5#mmRedemptionPaymentInstrument
 * InvestmentFundCashSettlementInformation5.mmRedemptionPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation5#mmDividendPaymentInstrument
 * InvestmentFundCashSettlementInformation5.mmDividendPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation5#mmSavingsPlanPaymentInstrument
 * InvestmentFundCashSettlementInformation5.mmSavingsPlanPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation5#mmInterestPaymentInstrument
 * InvestmentFundCashSettlementInformation5.mmInterestPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation2#mmSubscriptionPaymentInstrument
 * InvestmentFundCashSettlementInformation2.mmSubscriptionPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation2#mmRedemptionPaymentInstrument
 * InvestmentFundCashSettlementInformation2.mmRedemptionPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation2#mmDividendPaymentInstrument
 * InvestmentFundCashSettlementInformation2.mmDividendPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation2#mmSavingsPlanPaymentInstrument
 * InvestmentFundCashSettlementInformation2.mmSavingsPlanPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation4#mmSubscriptionPaymentInstrument
 * InvestmentFundCashSettlementInformation4.mmSubscriptionPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation4#mmRedemptionPaymentInstrument
 * InvestmentFundCashSettlementInformation4.mmRedemptionPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation4#mmDividendPaymentInstrument
 * InvestmentFundCashSettlementInformation4.mmDividendPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation4#mmSavingsPlanPaymentInstrument
 * InvestmentFundCashSettlementInformation4.mmSavingsPlanPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation6#mmSubscriptionPaymentInstrument
 * InvestmentFundCashSettlementInformation6.mmSubscriptionPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation6#mmRedemptionPaymentInstrument
 * InvestmentFundCashSettlementInformation6.mmRedemptionPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation6#mmDividendPaymentInstrument
 * InvestmentFundCashSettlementInformation6.mmDividendPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation6#mmSavingsPlanPaymentInstrument
 * InvestmentFundCashSettlementInformation6.mmSavingsPlanPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation6#mmInterestPaymentInstrument
 * InvestmentFundCashSettlementInformation6.mmInterestPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionReportDetails3#mmTransaction
 * TransactionReportDetails3.mmTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionReportDetails4#mmTransaction
 * TransactionReportDetails4.mmTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionReportDetails5#mmTransaction
 * TransactionReportDetails5.mmTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation3#mmOriginalTransactionReference
 * PaymentTransactionInformation3.mmOriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation30#mmOriginalTransactionReference
 * PaymentTransactionInformation30.mmOriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInformation4#mmOriginalGroupInformation
 * OriginalPaymentInformation4.mmOriginalGroupInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInformation4#mmTransactionInformation
 * OriginalPaymentInformation4.mmTransactionInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction37#mmOriginalTransactionReference
 * PaymentTransaction37.mmOriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction4#mmOriginalGroupInformation
 * OriginalPaymentInstruction4.mmOriginalGroupInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction4#mmTransactionInformation
 * OriginalPaymentInstruction4.mmTransactionInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction47#mmOriginalTransactionReference
 * PaymentTransaction47.mmOriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction8#mmOriginalGroupInformation
 * OriginalPaymentInstruction8.mmOriginalGroupInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction8#mmTransactionInformation
 * OriginalPaymentInstruction8.mmTransactionInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation4#mmOriginalTransactionReference
 * PaymentTransactionInformation4.mmOriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation28#mmOriginalTransactionReference
 * PaymentTransactionInformation28.mmOriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInformation2#mmTransactionInformation
 * OriginalPaymentInformation2.mmTransactionInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction35#mmOriginalTransactionReference
 * PaymentTransaction35.mmOriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction2#mmTransactionInformation
 * OriginalPaymentInstruction2.mmTransactionInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction42#mmOriginalTransactionReference
 * PaymentTransaction42.mmOriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction7#mmTransactionInformation
 * OriginalPaymentInstruction7.mmTransactionInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation1#mmOriginalTransactionReference
 * PaymentTransactionInformation1.mmOriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation25#mmOriginalTransactionReference
 * PaymentTransactionInformation25.mmOriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInformation1#mmTransactionInformationAndStatus
 * OriginalPaymentInformation1.mmTransactionInformationAndStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction32#mmOriginalTransactionReference
 * PaymentTransaction32.mmOriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction1#mmTransactionInformationAndStatus
 * OriginalPaymentInstruction1.mmTransactionInformationAndStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction46#mmOriginalTransactionReference
 * PaymentTransaction46.mmOriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction6#mmTransactionInformationAndStatus
 * OriginalPaymentInstruction6.mmTransactionInformationAndStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation31#mmOriginalTransactionReference
 * PaymentTransactionInformation31.mmOriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction38#mmOriginalTransactionReference
 * PaymentTransaction38.mmOriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction48#mmOriginalTransactionReference
 * PaymentTransaction48.mmOriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation5#mmOriginalTransactionReference
 * PaymentTransactionInformation5.mmOriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation29#mmOriginalTransactionReference
 * PaymentTransactionInformation29.mmOriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction36#mmOriginalTransactionReference
 * PaymentTransaction36.mmOriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction45#mmOriginalTransactionReference
 * PaymentTransaction45.mmOriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation26#mmOriginalTransactionReference
 * PaymentTransactionInformation26.mmOriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction33#mmOriginalTransactionReference
 * PaymentTransaction33.mmOriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction43#mmOriginalTransactionReference
 * PaymentTransaction43.mmOriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation2#mmOriginalTransactionReference
 * PaymentTransactionInformation2.mmOriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation27#mmOriginalTransactionReference
 * PaymentTransactionInformation27.mmOriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction34#mmOriginalTransactionReference
 * PaymentTransaction34.mmOriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction44#mmOriginalTransactionReference
 * PaymentTransaction44.mmOriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation34#mmOriginalTransactionReference
 * PaymentTransactionInformation34.mmOriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInformation5#mmTransactionInformationAndStatus
 * OriginalPaymentInformation5.mmTransactionInformationAndStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction41#mmOriginalTransactionReference
 * PaymentTransaction41.mmOriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction5#mmTransactionInformationAndStatus
 * OriginalPaymentInstruction5.mmTransactionInformationAndStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction49#mmOriginalTransactionReference
 * PaymentTransaction49.mmOriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction9#mmTransactionInformationAndStatus
 * OriginalPaymentInstruction9.mmTransactionInformationAndStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction18#mmPaymentInstrument
 * PaymentTransaction18.mmPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction15#mmPaymentInstrument
 * PaymentTransaction15.mmPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction21#mmPaymentInstrument
 * PaymentTransaction21.mmPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction22#mmPaymentInstrument
 * PaymentTransaction22.mmPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction17#mmPaymentInstrument
 * PaymentTransaction17.mmPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction19#mmPaymentInstrument
 * PaymentTransaction19.mmPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction23#mmPaymentInstrument
 * PaymentTransaction23.mmPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction16#mmPaymentInstrument
 * PaymentTransaction16.mmPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction13#mmPaymentInstrument
 * PaymentTransaction13.mmPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction24#mmPaymentInstrument
 * PaymentTransaction24.mmPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CashInOrOut4Choice#mmCashInPaymentInstrument
 * CashInOrOut4Choice.mmCashInPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CashInOrOut4Choice#mmCashOutPaymentInstrument
 * CashInOrOut4Choice.mmCashOutPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction20#mmCashInOrOut
 * PaymentTransaction20.mmCashInOrOut}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CashInOrOut5Choice#mmCashInPaymentInstrument
 * CashInOrOut5Choice.mmCashInPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CashInOrOut5Choice#mmCashOutPaymentInstrument
 * CashInOrOut5Choice.mmCashOutPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction25#mmCashInOrOut
 * PaymentTransaction25.mmCashInOrOut}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CashInOrOut3Choice#mmCashInPaymentInstrument
 * CashInOrOut3Choice.mmCashInPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CashInOrOut3Choice#mmCashOutPaymentInstrument
 * CashInOrOut3Choice.mmCashOutPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction14#mmCashInOrOutChoice
 * PaymentTransaction14.mmCashInOrOutChoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CashInOrOut6Choice#mmCashInPaymentInstrument
 * CashInOrOut6Choice.mmCashInPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CashInOrOut6Choice#mmCashOutPaymentInstrument
 * CashInOrOut6Choice.mmCashOutPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction26#mmCashInOrOut
 * PaymentTransaction26.mmCashInOrOut}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference14#mmOriginalTransaction
 * OriginalTransactionReference14.mmOriginalTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference18#mmOriginalTransaction
 * OriginalTransactionReference18.mmOriginalTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalItem2#mmOriginalItemReference
 * OriginalItem2.mmOriginalItemReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalItemAndStatus2#mmOriginalItemReference
 * OriginalItemAndStatus2.mmOriginalItemReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.UnderlyingTransaction1Choice#mmInterbank
 * UnderlyingTransaction1Choice.mmInterbank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation32#mmOriginalTransactionReference
 * PaymentTransactionInformation32.mmOriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInformation3#mmOriginalGroupInformation
 * OriginalPaymentInformation3.mmOriginalGroupInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInformation3#mmTransactionInformationAndStatus
 * OriginalPaymentInformation3.mmTransactionInformationAndStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation33#mmOriginalTransactionReference
 * PaymentTransactionInformation33.mmOriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorrectiveTransaction1Choice#mmInterbank
 * CorrectiveTransaction1Choice.mmInterbank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.UnderlyingTransaction2Choice#mmInterbank
 * UnderlyingTransaction2Choice.mmInterbank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction39#mmOriginalTransactionReference
 * PaymentTransaction39.mmOriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction3#mmOriginalGroupInformation
 * OriginalPaymentInstruction3.mmOriginalGroupInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction3#mmTransactionInformationAndStatus
 * OriginalPaymentInstruction3.mmTransactionInformationAndStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction40#mmOriginalTransactionReference
 * PaymentTransaction40.mmOriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalItem3#mmOriginalItemReference
 * OriginalItem3.mmOriginalItemReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalItemAndStatus3#mmOriginalItemReference
 * OriginalItemAndStatus3.mmOriginalItemReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation13#mmOriginalTransactionReference
 * PaymentTransactionInformation13.mmOriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation18#mmOriginalTransactionReference
 * PaymentTransactionInformation18.mmOriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation15#mmOriginalTransactionReference
 * PaymentTransactionInformation15.mmOriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation22#mmOriginalTransactionReference
 * PaymentTransactionInformation22.mmOriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation12#mmOriginalTransactionReference
 * PaymentTransactionInformation12.mmOriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation19#mmOriginalTransactionReference
 * PaymentTransactionInformation19.mmOriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation14#mmOriginalTransactionReference
 * PaymentTransactionInformation14.mmOriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation20#mmOriginalTransactionReference
 * PaymentTransactionInformation20.mmOriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation16#mmOriginalTransactionReference
 * PaymentTransactionInformation16.mmOriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation23#mmOriginalTransactionReference
 * PaymentTransactionInformation23.mmOriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation17#mmOriginalTransactionReference
 * PaymentTransactionInformation17.mmOriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation24#mmOriginalTransactionReference
 * PaymentTransactionInformation24.mmOriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation21#mmOriginalTransactionReference
 * PaymentTransactionInformation21.mmOriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction30#mmPaymentInstrument
 * PaymentTransaction30.mmPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction28#mmPaymentInstrument
 * PaymentTransaction28.mmPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction31#mmPaymentInstrument
 * PaymentTransaction31.mmPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation7#mmSubscriptionPaymentInstrument
 * InvestmentFundCashSettlementInformation7.mmSubscriptionPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation7#mmRedemptionPaymentInstrument
 * InvestmentFundCashSettlementInformation7.mmRedemptionPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation7#mmDividendPaymentInstrument
 * InvestmentFundCashSettlementInformation7.mmDividendPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation7#mmSavingsPlanPaymentInstrument
 * InvestmentFundCashSettlementInformation7.mmSavingsPlanPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation7#mmInterestPaymentInstrument
 * InvestmentFundCashSettlementInformation7.mmInterestPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation8#mmSubscriptionPaymentInstrument
 * InvestmentFundCashSettlementInformation8.mmSubscriptionPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation8#mmRedemptionPaymentInstrument
 * InvestmentFundCashSettlementInformation8.mmRedemptionPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation8#mmDividendPaymentInstrument
 * InvestmentFundCashSettlementInformation8.mmDividendPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation8#mmSavingsPlanPaymentInstrument
 * InvestmentFundCashSettlementInformation8.mmSavingsPlanPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation8#mmInterestPaymentInstrument
 * InvestmentFundCashSettlementInformation8.mmInterestPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentCodeOrOther1Choice#mmPaymentCode
 * PaymentCodeOrOther1Choice.mmPaymentCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInformation6#mmAmount
 * OriginalPaymentInformation6.mmAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction50#mmOriginalTransactionReference
 * PaymentTransaction50.mmOriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction12#mmTransactionInformationAndStatus
 * OriginalPaymentInstruction12.mmTransactionInformationAndStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction11#mmTransactionInformation
 * OriginalPaymentInstruction11.mmTransactionInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction52#mmOriginalTransactionReference
 * PaymentTransaction52.mmOriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction51#mmOriginalTransactionReference
 * PaymentTransaction51.mmOriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalItem4#mmOriginalItemReference
 * OriginalItem4.mmOriginalItemReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction13#mmOriginalGroupInformation
 * OriginalPaymentInstruction13.mmOriginalGroupInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction13#mmTransactionInformation
 * OriginalPaymentInstruction13.mmTransactionInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction58#mmOriginalTransactionReference
 * PaymentTransaction58.mmOriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction10#mmOriginalGroupInformation
 * OriginalPaymentInstruction10.mmOriginalGroupInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction10#mmTransactionInformationAndStatus
 * OriginalPaymentInstruction10.mmTransactionInformationAndStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction54#mmOriginalTransactionReference
 * PaymentTransaction54.mmOriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalItemAndStatus4#mmOriginalItemReference
 * OriginalItemAndStatus4.mmOriginalItemReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction53#mmOriginalTransactionReference
 * PaymentTransaction53.mmOriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction57#mmOriginalTransactionReference
 * PaymentTransaction57.mmOriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction56#mmOriginalTransactionReference
 * PaymentTransaction56.mmOriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction55#mmOriginalTransactionReference
 * PaymentTransaction55.mmOriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction14#mmTransactionInformationAndStatus
 * OriginalPaymentInstruction14.mmTransactionInformationAndStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction59#mmOriginalTransactionReference
 * PaymentTransaction59.mmOriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ContractRegistrationStatement1#mmTransactionJournal
 * ContractRegistrationStatement1.mmTransactionJournal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionCertificateRecord1#mmTransaction
 * TransactionCertificateRecord1.mmTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction16#mmTransactionInformation
 * OriginalPaymentInstruction16.mmTransactionInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction18#mmTransactionInformationAndStatus
 * OriginalPaymentInstruction18.mmTransactionInformationAndStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction65#mmOriginalTransactionReference
 * PaymentTransaction65.mmOriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction63#mmOriginalTransactionReference
 * PaymentTransaction63.mmOriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction60#mmOriginalTransactionReference
 * PaymentTransaction60.mmOriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction68#mmOriginalTransactionReference
 * PaymentTransaction68.mmOriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction61#mmOriginalTransactionReference
 * PaymentTransaction61.mmOriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction15#mmOriginalGroupInformation
 * OriginalPaymentInstruction15.mmOriginalGroupInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction15#mmTransactionInformation
 * OriginalPaymentInstruction15.mmTransactionInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalItem5#mmOriginalItemReference
 * OriginalItem5.mmOriginalItemReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalItemAndStatus5#mmOriginalItemReference
 * OriginalItemAndStatus5.mmOriginalItemReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction66#mmOriginalTransactionReference
 * PaymentTransaction66.mmOriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction67#mmOriginalTransactionReference
 * PaymentTransaction67.mmOriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction62#mmOriginalTransactionReference
 * PaymentTransaction62.mmOriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction64#mmOriginalTransactionReference
 * PaymentTransaction64.mmOriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction17#mmOriginalGroupInformation
 * OriginalPaymentInstruction17.mmOriginalGroupInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction17#mmTransactionInformationAndStatus
 * OriginalPaymentInstruction17.mmTransactionInformationAndStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashSettlement1#mmOtherCashSettlementDetails
 * CashSettlement1.mmOtherCashSettlementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashSettlement2#mmOtherCashSettlementDetails
 * CashSettlement2.mmOtherCashSettlementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstrument13#mmSubscriptionPaymentInstrument
 * PaymentInstrument13.mmSubscriptionPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstrument13#mmRedemptionPaymentInstrument
 * PaymentInstrument13.mmRedemptionPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstrument13#mmDividendPaymentInstrument
 * PaymentInstrument13.mmDividendPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstrument13#mmSavingsPlanPaymentInstrument
 * PaymentInstrument13.mmSavingsPlanPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstrument13#mmInterestPaymentInstrument
 * PaymentInstrument13.mmInterestPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction19#mmTransactionInformationAndStatus
 * OriginalPaymentInstruction19.mmTransactionInformationAndStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction69#mmOriginalTransactionReference
 * PaymentTransaction69.mmOriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction72#mmPaymentInstrument
 * PaymentTransaction72.mmPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction70#mmPaymentInstrument
 * PaymentTransaction70.mmPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction71#mmCashInOrOut
 * PaymentTransaction71.mmCashInOrOut}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CashInOrOut7Choice#mmCashInPaymentInstrument
 * CashInOrOut7Choice.mmCashInPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CashInOrOut7Choice#mmCashOutPaymentInstrument
 * CashInOrOut7Choice.mmCashOutPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.UnderlyingTransaction3Choice#mmInterbank
 * UnderlyingTransaction3Choice.mmInterbank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction80#mmOriginalTransactionReference
 * PaymentTransaction80.mmOriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction81#mmOriginalTransactionReference
 * PaymentTransaction81.mmOriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction23#mmTransactionInformationAndStatus
 * OriginalPaymentInstruction23.mmTransactionInformationAndStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction21#mmTransactionInformation
 * OriginalPaymentInstruction21.mmTransactionInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction24#mmTransactionInformationAndStatus
 * OriginalPaymentInstruction24.mmTransactionInformationAndStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction76#mmOriginalTransactionReference
 * PaymentTransaction76.mmOriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorrectiveTransaction2Choice#mmInterbank
 * CorrectiveTransaction2Choice.mmInterbank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction22#mmOriginalGroupInformation
 * OriginalPaymentInstruction22.mmOriginalGroupInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction22#mmTransactionInformationAndStatus
 * OriginalPaymentInstruction22.mmTransactionInformationAndStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction78#mmOriginalTransactionReference
 * PaymentTransaction78.mmOriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction20#mmOriginalGroupInformation
 * OriginalPaymentInstruction20.mmOriginalGroupInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction20#mmTransactionInformation
 * OriginalPaymentInstruction20.mmTransactionInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction74#mmOriginalTransactionReference
 * PaymentTransaction74.mmOriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInformation7#mmAmount
 * OriginalPaymentInformation7.mmAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction83#mmOriginalTransactionReference
 * PaymentTransaction83.mmOriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction77#mmOriginalTransactionReference
 * PaymentTransaction77.mmOriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction75#mmOriginalTransactionReference
 * PaymentTransaction75.mmOriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction82#mmOriginalTransactionReference
 * PaymentTransaction82.mmOriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction79#mmOriginalTransactionReference
 * PaymentTransaction79.mmOriginalTransactionReference}</li>
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
 * "Payment"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Payment information and processes required to transfer cash end to end from the debtor to the creditor."
 * </li>
 * </ul>
 */
public class Payment extends ObligationFulfilment {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected List<com.tools20022.repository.entity.PaymentObligation> paymentObligation;
	/**
	 * Specifies the obligation which created the payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmPaymentOffset
	 * PaymentObligation.mmPaymentOffset}</li>
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
	 * {@linkplain com.tools20022.repository.msg.TradeSettlement1#mmPaymentTerms
	 * TradeSettlement1.mmPaymentTerms}</li>
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
	public static final MMBusinessAssociationEnd mmPaymentObligation = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(TradeSettlement1.mmPaymentTerms);
			elementContext_lazy = () -> com.tools20022.repository.entity.Payment.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PaymentObligation";
			definition = "Specifies the obligation which created the payment.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmPaymentOffset;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmObject();
		}
	};
	protected CurrencyCode currencyOfTransfer;
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
	 * {@linkplain com.tools20022.repository.msg.PaymentInstrument7#mmSettlementCurrency
	 * PaymentInstrument7.mmSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstrument6#mmSettlementCurrency
	 * PaymentInstrument6.mmSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstrument8#mmSettlementCurrency
	 * PaymentInstrument8.mmSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstrument9#mmSettlementCurrency
	 * PaymentInstrument9.mmSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstrument11#mmSettlementCurrency
	 * PaymentInstrument11.mmSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstrument10#mmSettlementCurrency
	 * PaymentInstrument10.mmSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EquivalentAmount#mmCurrencyOfTransfer
	 * EquivalentAmount.mmCurrencyOfTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EquivalentAmount2#mmCurrencyOfTransfer
	 * EquivalentAmount2.mmCurrencyOfTransfer}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CommonData1#mmCurrency
	 * CommonData1.mmCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails4#mmCurrency
	 * CardPaymentTransactionDetails4.mmCurrency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CommonData2#mmCurrency
	 * CommonData2.mmCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails7#mmCurrency
	 * CardPaymentTransactionDetails7.mmCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails9#mmCurrency
	 * CardPaymentTransactionDetails9.mmCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails1#mmCurrency
	 * CardPaymentTransactionDetails1.mmCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails10#mmCurrency
	 * CardPaymentTransactionDetails10.mmCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails2#mmCurrency
	 * CardPaymentTransactionDetails2.mmCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails11#mmCurrency
	 * CardPaymentTransactionDetails11.mmCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction9#mmCurrency
	 * CardPaymentTransaction9.mmCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction18#mmCurrency
	 * CardPaymentTransaction18.mmCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails5#mmCurrency
	 * CardPaymentTransactionDetails5.mmCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails6#mmCurrency
	 * CardPaymentTransactionDetails6.mmCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails3#mmCurrency
	 * CardPaymentTransactionDetails3.mmCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstrument12#mmSettlementCurrency
	 * PaymentInstrument12.mmSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails12#mmCurrency
	 * CardPaymentTransactionDetails12.mmCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails13#mmCurrency
	 * CardPaymentTransactionDetails13.mmCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails18#mmCurrency
	 * CardPaymentTransactionDetails18.mmCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails16#mmCurrency
	 * CardPaymentTransactionDetails16.mmCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails14#mmCurrency
	 * CardPaymentTransactionDetails14.mmCurrency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CommonData3#mmCurrency
	 * CommonData3.mmCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails15#mmCurrency
	 * CardPaymentTransactionDetails15.mmCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails17#mmCurrency
	 * CardPaymentTransactionDetails17.mmCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails20#mmCurrency
	 * CardPaymentTransactionDetails20.mmCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails25#mmCurrency
	 * CardPaymentTransactionDetails25.mmCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails23#mmCurrency
	 * CardPaymentTransactionDetails23.mmCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails21#mmCurrency
	 * CardPaymentTransactionDetails21.mmCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails26#mmCurrency
	 * CardPaymentTransactionDetails26.mmCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails19#mmCurrency
	 * CardPaymentTransactionDetails19.mmCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails24#mmCurrency
	 * CardPaymentTransactionDetails24.mmCurrency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CommonData4#mmCurrency
	 * CommonData4.mmCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails22#mmCurrency
	 * CardPaymentTransactionDetails22.mmCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AutomatedTellerMachine4#mmBaseCurrency
	 * AutomatedTellerMachine4.mmBaseCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PremiumAmount3#mmPremiumCurrency
	 * PremiumAmount3.mmPremiumCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails32#mmCurrency
	 * CardPaymentTransactionDetails32.mmCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails33#mmCurrency
	 * CardPaymentTransactionDetails33.mmCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails28#mmCurrency
	 * CardPaymentTransactionDetails28.mmCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails29#mmCurrency
	 * CardPaymentTransactionDetails29.mmCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails30#mmCurrency
	 * CardPaymentTransactionDetails30.mmCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails27#mmCurrency
	 * CardPaymentTransactionDetails27.mmCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails31#mmCurrency
	 * CardPaymentTransactionDetails31.mmCurrency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CommonData5#mmCurrency
	 * CommonData5.mmCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails35#mmCurrency
	 * CardPaymentTransactionDetails35.mmCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails34#mmCurrency
	 * CardPaymentTransactionDetails34.mmCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AutomatedTellerMachine10#mmBaseCurrency
	 * AutomatedTellerMachine10.mmBaseCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails39#mmCurrency
	 * CardPaymentTransactionDetails39.mmCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails38#mmCurrency
	 * CardPaymentTransactionDetails38.mmCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails41#mmCurrency
	 * CardPaymentTransactionDetails41.mmCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails37#mmCurrency
	 * CardPaymentTransactionDetails37.mmCurrency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CommonData6#mmCurrency
	 * CommonData6.mmCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails40#mmCurrency
	 * CardPaymentTransactionDetails40.mmCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails42#mmCurrency
	 * CardPaymentTransactionDetails42.mmCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails43#mmCurrency
	 * CardPaymentTransactionDetails43.mmCurrency}</li>
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
	public static final MMBusinessAttribute mmCurrencyOfTransfer = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(PaymentInstrument7.mmSettlementCurrency, PaymentInstrument6.mmSettlementCurrency, PaymentInstrument8.mmSettlementCurrency, PaymentInstrument9.mmSettlementCurrency,
					PaymentInstrument11.mmSettlementCurrency, PaymentInstrument10.mmSettlementCurrency, com.tools20022.repository.msg.EquivalentAmount.mmCurrencyOfTransfer, EquivalentAmount2.mmCurrencyOfTransfer, CommonData1.mmCurrency,
					CardPaymentTransactionDetails4.mmCurrency, CommonData2.mmCurrency, CardPaymentTransactionDetails7.mmCurrency, CardPaymentTransactionDetails9.mmCurrency, CardPaymentTransactionDetails1.mmCurrency,
					CardPaymentTransactionDetails10.mmCurrency, CardPaymentTransactionDetails2.mmCurrency, CardPaymentTransactionDetails11.mmCurrency, CardPaymentTransaction9.mmCurrency, CardPaymentTransaction18.mmCurrency,
					CardPaymentTransactionDetails5.mmCurrency, CardPaymentTransactionDetails6.mmCurrency, CardPaymentTransactionDetails3.mmCurrency, PaymentInstrument12.mmSettlementCurrency, CardPaymentTransactionDetails12.mmCurrency,
					CardPaymentTransactionDetails13.mmCurrency, CardPaymentTransactionDetails18.mmCurrency, CardPaymentTransactionDetails16.mmCurrency, CardPaymentTransactionDetails14.mmCurrency, CommonData3.mmCurrency,
					CardPaymentTransactionDetails15.mmCurrency, CardPaymentTransactionDetails17.mmCurrency, CardPaymentTransactionDetails20.mmCurrency, CardPaymentTransactionDetails25.mmCurrency, CardPaymentTransactionDetails23.mmCurrency,
					CardPaymentTransactionDetails21.mmCurrency, CardPaymentTransactionDetails26.mmCurrency, CardPaymentTransactionDetails19.mmCurrency, CardPaymentTransactionDetails24.mmCurrency, CommonData4.mmCurrency,
					CardPaymentTransactionDetails22.mmCurrency, AutomatedTellerMachine4.mmBaseCurrency, PremiumAmount3.mmPremiumCurrency, CardPaymentTransactionDetails32.mmCurrency, CardPaymentTransactionDetails33.mmCurrency,
					CardPaymentTransactionDetails28.mmCurrency, CardPaymentTransactionDetails29.mmCurrency, CardPaymentTransactionDetails30.mmCurrency, CardPaymentTransactionDetails27.mmCurrency, CardPaymentTransactionDetails31.mmCurrency,
					CommonData5.mmCurrency, CardPaymentTransactionDetails35.mmCurrency, CardPaymentTransactionDetails34.mmCurrency, AutomatedTellerMachine10.mmBaseCurrency, CardPaymentTransactionDetails39.mmCurrency,
					CardPaymentTransactionDetails38.mmCurrency, CardPaymentTransactionDetails41.mmCurrency, CardPaymentTransactionDetails37.mmCurrency, CommonData6.mmCurrency, CardPaymentTransactionDetails40.mmCurrency,
					CardPaymentTransactionDetails42.mmCurrency, CardPaymentTransactionDetails43.mmCurrency);
			elementContext_lazy = () -> com.tools20022.repository.entity.Payment.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CurrencyOfTransfer";
			definition = "Specifies the currency of the amount to be transferred which may be different from the currency of the debtor's account.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Payment.class.getMethod("getCurrencyOfTransfer", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.CreditInstrument> creditMethod;
	/**
	 * Specifies the transfer method to be used for the credit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CreditInstrument#mmRelatedPayment
	 * CreditInstrument.mmRelatedPayment}</li>
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
	 * {@linkplain com.tools20022.repository.msg.PaymentInstrument11#mmPaymentInstrument
	 * PaymentInstrument11.mmPaymentInstrument}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstrument10#mmPaymentInstrument
	 * PaymentInstrument10.mmPaymentInstrument}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch2#mmPaymentMethod
	 * PaymentSearch2.mmPaymentMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch3#mmPaymentMethod
	 * PaymentSearch3.mmPaymentMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference19#mmPaymentMethod
	 * OriginalTransactionReference19.mmPaymentMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstrument12#mmPaymentInstrument
	 * PaymentInstrument12.mmPaymentInstrument}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference21#mmPaymentMethod
	 * OriginalTransactionReference21.mmPaymentMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference23#mmPaymentMethod
	 * OriginalTransactionReference23.mmPaymentMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference26#mmPaymentMethod
	 * OriginalTransactionReference26.mmPaymentMethod}</li>
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
	public static final MMBusinessAssociationEnd mmCreditMethod = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(PaymentInstrument11.mmPaymentInstrument, PaymentInstrument10.mmPaymentInstrument, PaymentSearch2.mmPaymentMethod, PaymentSearch3.mmPaymentMethod,
					OriginalTransactionReference19.mmPaymentMethod, PaymentInstrument12.mmPaymentInstrument, OriginalTransactionReference21.mmPaymentMethod, OriginalTransactionReference23.mmPaymentMethod,
					OriginalTransactionReference26.mmPaymentMethod);
			elementContext_lazy = () -> com.tools20022.repository.entity.Payment.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CreditMethod";
			definition = "Specifies the transfer method to be used for the credit.";
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CreditInstrument.mmRelatedPayment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CreditInstrument.mmObject();
		}
	};
	protected PaymentTypeCode type;
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
	 * {@linkplain com.tools20022.repository.choice.PaymentType2Choice#mmPaymentType
	 * PaymentType2Choice.mmPaymentType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentType2Choice#mmProprietaryPaymentType
	 * PaymentType2Choice.mmProprietaryPaymentType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentType3Choice#mmCode
	 * PaymentType3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentType3Choice#mmProprietary
	 * PaymentType3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction3#mmPaymentType
	 * PaymentInstruction3.mmPaymentType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentDetails2#mmPaymentType
	 * PaymentDetails2.mmPaymentType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentDetails4#mmPaymentType
	 * PaymentDetails4.mmPaymentType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentInstruction2#mmType
	 * PaymentInstruction2.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentDetails5#mmPaymentType
	 * PaymentDetails5.mmPaymentType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentDetails6#mmPaymentType
	 * PaymentDetails6.mmPaymentType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentDetails7#mmPaymentType
	 * PaymentDetails7.mmPaymentType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentInstruction1#mmType
	 * PaymentInstruction1.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardAggregated1#mmTransactionCategory
	 * CardAggregated1.mmTransactionCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardIndividualTransaction1#mmTransactionCategory
	 * CardIndividualTransaction1.mmTransactionCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction13#mmPaymentType
	 * PaymentInstruction13.mmPaymentType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction12#mmType
	 * PaymentInstruction12.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentType4Choice#mmCode
	 * PaymentType4Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentType4Choice#mmProprietary
	 * PaymentType4Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction14#mmType
	 * PaymentInstruction14.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardIndividualTransaction2#mmTransactionCategory
	 * CardIndividualTransaction2.mmTransactionCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancingAgreementItem1#mmPaymentInstrument
	 * FinancingAgreementItem1.mmPaymentInstrument}</li>
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
	public static final MMBusinessAttribute mmType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(PaymentType2Choice.mmPaymentType, PaymentType2Choice.mmProprietaryPaymentType, PaymentType3Choice.mmCode, PaymentType3Choice.mmProprietary, PaymentInstruction3.mmPaymentType,
					PaymentDetails2.mmPaymentType, PaymentDetails4.mmPaymentType, PaymentInstruction2.mmType, PaymentDetails5.mmPaymentType, PaymentDetails6.mmPaymentType, PaymentDetails7.mmPaymentType, PaymentInstruction1.mmType,
					CardAggregated1.mmTransactionCategory, CardIndividualTransaction1.mmTransactionCategory, PaymentInstruction13.mmPaymentType, PaymentInstruction12.mmType, PaymentType4Choice.mmCode, PaymentType4Choice.mmProprietary,
					PaymentInstruction14.mmType, CardIndividualTransaction2.mmTransactionCategory, FinancingAgreementItem1.mmPaymentInstrument);
			elementContext_lazy = () -> com.tools20022.repository.entity.Payment.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Type, or nature, of the payment, eg, express payment.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PaymentTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Payment.class.getMethod("getType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyAndAmount instructedAmount;
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
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch2#mmInstructedAmount
	 * PaymentSearch2.mmInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch3#mmInstructedAmount
	 * PaymentSearch3.mmInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch4#mmInstructedAmount
	 * PaymentSearch4.mmInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentDetails5#mmInstructedAmount
	 * PaymentDetails5.mmInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentDetails6#mmInstructedAmount
	 * PaymentDetails6.mmInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentDetails7#mmInstructedAmount
	 * PaymentDetails7.mmInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction1#mmInstructedAmount
	 * PaymentInstruction1.mmInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndCurrencyExchange2#mmInstructedAmount
	 * AmountAndCurrencyExchange2.mmInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndCurrencyExchange3#mmInstructedAmount
	 * AmountAndCurrencyExchange3.mmInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AmountType1Choice#mmInstructedAmount
	 * AmountType1Choice.mmInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AmountType2Choice#mmInstructedAmount
	 * AmountType2Choice.mmInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation1#mmAmount
	 * CreditTransferTransactionInformation1.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AmountType3Choice#mmInstructedAmount
	 * AmountType3Choice.mmInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation10#mmAmount
	 * CreditTransferTransactionInformation10.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction1#mmAmount
	 * CreditTransferTransaction1.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction6#mmAmount
	 * CreditTransferTransaction6.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation1#mmInstructedAmount
	 * DirectDebitTransactionInformation1.mmInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation9#mmInstructedAmount
	 * DirectDebitTransactionInformation9.mmInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation11#mmInstructedAmount
	 * DirectDebitTransactionInformation11.mmInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation13#mmInstructedAmount
	 * DirectDebitTransactionInformation13.mmInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference1#mmAmount
	 * OriginalTransactionReference1.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation3#mmOriginalInstructedAmount
	 * PaymentTransactionInformation3.mmOriginalInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference13#mmAmount
	 * OriginalTransactionReference13.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation30#mmOriginalInstructedAmount
	 * PaymentTransactionInformation30.mmOriginalInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference16#mmAmount
	 * OriginalTransactionReference16.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction37#mmOriginalInstructedAmount
	 * PaymentTransaction37.mmOriginalInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction47#mmOriginalInstructedAmount
	 * PaymentTransaction47.mmOriginalInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation4#mmOriginalInstructedAmount
	 * PaymentTransactionInformation4.mmOriginalInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation4#mmReversedInstructedAmount
	 * PaymentTransactionInformation4.mmReversedInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation28#mmOriginalInstructedAmount
	 * PaymentTransactionInformation28.mmOriginalInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation28#mmReversedInstructedAmount
	 * PaymentTransactionInformation28.mmReversedInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction35#mmOriginalInstructedAmount
	 * PaymentTransaction35.mmOriginalInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction35#mmReversedInstructedAmount
	 * PaymentTransaction35.mmReversedInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction42#mmOriginalInstructedAmount
	 * PaymentTransaction42.mmOriginalInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction42#mmReversedInstructedAmount
	 * PaymentTransaction42.mmReversedInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation2#mmInstructedAmount
	 * CreditTransferTransactionInformation2.mmInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation11#mmInstructedAmount
	 * CreditTransferTransactionInformation11.mmInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction2#mmInstructedAmount
	 * CreditTransferTransaction2.mmInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction7#mmInstructedAmount
	 * CreditTransferTransaction7.mmInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation2#mmInstructedAmount
	 * DirectDebitTransactionInformation2.mmInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation10#mmInstructedAmount
	 * DirectDebitTransactionInformation10.mmInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation12#mmInstructedAmount
	 * DirectDebitTransactionInformation12.mmInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation14#mmInstructedAmount
	 * DirectDebitTransactionInformation14.mmInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation5#mmReversedInstructedAmount
	 * PaymentTransactionInformation5.mmReversedInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation29#mmReversedInstructedAmount
	 * PaymentTransactionInformation29.mmReversedInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction36#mmReversedInstructedAmount
	 * PaymentTransaction36.mmReversedInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction45#mmReversedInstructedAmount
	 * PaymentTransaction45.mmReversedInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation12#mmInstructedAmount
	 * CreditTransferTransactionInformation12.mmInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction3#mmInstructedAmount
	 * CreditTransferTransaction3.mmInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation2#mmReturnedInstructedAmount
	 * PaymentTransactionInformation2.mmReturnedInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation27#mmReturnedInstructedAmount
	 * PaymentTransactionInformation27.mmReturnedInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction34#mmReturnedInstructedAmount
	 * PaymentTransaction34.mmReturnedInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction44#mmReturnedInstructedAmount
	 * PaymentTransaction44.mmReturnedInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference15#mmAmount
	 * OriginalTransactionReference15.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference17#mmAmount
	 * OriginalTransactionReference17.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation14#mmAmount
	 * CreditTransferTransactionInformation14.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction5#mmAmount
	 * CreditTransferTransaction5.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction10#mmAmount
	 * CreditTransferTransaction10.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails4#mmTotalAmount
	 * CardPaymentTransactionDetails4.mmTotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails7#mmTotalAmount
	 * CardPaymentTransactionDetails7.mmTotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails9#mmTotalAmount
	 * CardPaymentTransactionDetails9.mmTotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails1#mmTotalAmount
	 * CardPaymentTransactionDetails1.mmTotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails10#mmTotalAmount
	 * CardPaymentTransactionDetails10.mmTotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails2#mmTotalAmount
	 * CardPaymentTransactionDetails2.mmTotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails11#mmTotalAmount
	 * CardPaymentTransactionDetails11.mmTotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails5#mmTotalAmount
	 * CardPaymentTransactionDetails5.mmTotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails6#mmTotalAmount
	 * CardPaymentTransactionDetails6.mmTotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails3#mmTotalAmount
	 * CardPaymentTransactionDetails3.mmTotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundOrderData1#mmSettlementAmount
	 * FundOrderData1.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundOrderData2#mmSettlementAmount
	 * FundOrderData2.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction18#mmSettlementAmount
	 * PaymentTransaction18.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction15#mmSettlementAmount
	 * PaymentTransaction15.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkOrder3#mmTotalSettlementAmount
	 * RedemptionBulkOrder3.mmTotalSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution5#mmSettlementAmount
	 * RedemptionExecution5.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkExecution3#mmTotalSettlementAmount
	 * RedemptionBulkExecution3.mmTotalSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkOrder4#mmTotalSettlementAmount
	 * RedemptionBulkOrder4.mmTotalSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder3#mmTotalSettlementAmount
	 * RedemptionMultipleOrder3.mmTotalSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#mmSettlementAmount
	 * RedemptionExecution6.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution3#mmTotalSettlementAmount
	 * RedemptionMultipleExecution3.mmTotalSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder4#mmTotalSettlementAmount
	 * RedemptionMultipleOrder4.mmTotalSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction2#mmGrossSettlementAmount
	 * InvestmentFundTransaction2.mmGrossSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction17#mmSettlementAmount
	 * PaymentTransaction17.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction19#mmSettlementAmount
	 * PaymentTransaction19.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkOrder3#mmTotalSettlementAmount
	 * SubscriptionBulkOrder3.mmTotalSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction16#mmSettlementAmount
	 * PaymentTransaction16.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction13#mmSettlementAmount
	 * PaymentTransaction13.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkExecution3#mmTotalSettlementAmount
	 * SubscriptionBulkExecution3.mmTotalSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkOrder4#mmTotalSettlementAmount
	 * SubscriptionBulkOrder4.mmTotalSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder3#mmTotalSettlementAmount
	 * SubscriptionMultipleOrder3.mmTotalSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleExecution3#mmTotalSettlementAmount
	 * SubscriptionMultipleExecution3.mmTotalSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder4#mmTotalSettlementAmount
	 * SubscriptionMultipleOrder4.mmTotalSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction20#mmSettlementAmount
	 * PaymentTransaction20.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction14#mmSettlementAmount
	 * PaymentTransaction14.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionExtract#mmCurrencyAmount
	 * PaymentInstructionExtract.mmCurrencyAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionExtract2#mmInstructedAmount
	 * PaymentInstructionExtract2.mmInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation#mmAmount
	 * PaymentComplementaryInformation.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorrectivePaymentInstructionExtract#mmInstructedAmount
	 * CorrectivePaymentInstructionExtract.mmInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentInstruction1#mmOriginalInstructedAmount
	 * UnderlyingPaymentInstruction1.mmOriginalInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification2#mmAmount
	 * RequestedModification2.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation2#mmAmount
	 * PaymentComplementaryInformation2.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation32#mmOriginalInstructedAmount
	 * PaymentTransactionInformation32.mmOriginalInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorrectivePaymentInitiation1#mmInstructedAmount
	 * CorrectivePaymentInitiation1.mmInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementData1#mmSettlementAmount
	 * SettlementData1.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementData2#mmSettlementAmount
	 * SettlementData2.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementData2#mmSettledAmount
	 * SettlementData2.mmSettledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstalmentFinancingInformation1#mmInstalmentTotalAmount
	 * InstalmentFinancingInformation1.mmInstalmentTotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentInstruction2#mmOriginalInstructedAmount
	 * UnderlyingPaymentInstruction2.mmOriginalInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation3#mmAmount
	 * PaymentComplementaryInformation3.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction39#mmOriginalInstructedAmount
	 * PaymentTransaction39.mmOriginalInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification3#mmAmount
	 * RequestedModification3.mmAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OriginalItem3#mmAmount
	 * OriginalItem3.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference9#mmAmount
	 * OriginalTransactionReference9.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference12#mmAmount
	 * OriginalTransactionReference12.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference11#mmAmount
	 * OriginalTransactionReference11.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation16#mmReturnedInstructedAmount
	 * PaymentTransactionInformation16.mmReturnedInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation23#mmReturnedInstructedAmount
	 * PaymentTransactionInformation23.mmReturnedInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation17#mmReversedInstructedAmount
	 * PaymentTransactionInformation17.mmReversedInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation24#mmReversedInstructedAmount
	 * PaymentTransactionInformation24.mmReversedInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation21#mmReturnedInstructedAmount
	 * PaymentTransactionInformation21.mmReturnedInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation7#mmInstructedAmount
	 * CreditTransferTransactionInformation7.mmInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation9#mmInstructedAmount
	 * CreditTransferTransactionInformation9.mmInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation6#mmInstructedAmount
	 * DirectDebitTransactionInformation6.mmInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation8#mmInstructedAmount
	 * DirectDebitTransactionInformation8.mmInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution12#mmSettlementAmount
	 * RedemptionExecution12.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch5#mmInstructedAmount
	 * PaymentSearch5.mmInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction14#mmInstructedAmount
	 * PaymentInstruction14.mmInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails12#mmTotalAmount
	 * CardPaymentTransactionDetails12.mmTotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails13#mmTotalAmount
	 * CardPaymentTransactionDetails13.mmTotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails18#mmTotalAmount
	 * CardPaymentTransactionDetails18.mmTotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails16#mmTotalAmount
	 * CardPaymentTransactionDetails16.mmTotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails14#mmTotalAmount
	 * CardPaymentTransactionDetails14.mmTotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails15#mmTotalAmount
	 * CardPaymentTransactionDetails15.mmTotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails17#mmTotalAmount
	 * CardPaymentTransactionDetails17.mmTotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation4#mmAmount
	 * PaymentComplementaryInformation4.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction50#mmReturnedInstructedAmount
	 * PaymentTransaction50.mmReturnedInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction19#mmInstructedAmount
	 * CreditTransferTransaction19.mmInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation17#mmInstructedAmount
	 * DirectDebitTransactionInformation17.mmInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction51#mmReversedInstructedAmount
	 * PaymentTransaction51.mmReversedInstructedAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OriginalItem4#mmAmount
	 * OriginalItem4.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification4#mmAmount
	 * RequestedModification4.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction58#mmOriginalInstructedAmount
	 * PaymentTransaction58.mmOriginalInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction54#mmOriginalInstructedAmount
	 * PaymentTransaction54.mmOriginalInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference20#mmAmount
	 * OriginalTransactionReference20.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction18#mmInstructedAmount
	 * CreditTransferTransaction18.mmInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction56#mmOriginalInstructedAmount
	 * PaymentTransaction56.mmOriginalInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction56#mmReversedInstructedAmount
	 * PaymentTransaction56.mmReversedInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation18#mmInstructedAmount
	 * DirectDebitTransactionInformation18.mmInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction20#mmAmount
	 * CreditTransferTransaction20.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AmountType4Choice#mmInstructedAmount
	 * AmountType4Choice.mmInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction21#mmAmount
	 * CreditTransferTransaction21.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails20#mmTotalAmount
	 * CardPaymentTransactionDetails20.mmTotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails25#mmTotalAmount
	 * CardPaymentTransactionDetails25.mmTotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails23#mmTotalAmount
	 * CardPaymentTransactionDetails23.mmTotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails21#mmTotalAmount
	 * CardPaymentTransactionDetails21.mmTotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails26#mmTotalAmount
	 * CardPaymentTransactionDetails26.mmTotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails19#mmTotalAmount
	 * CardPaymentTransactionDetails19.mmTotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails24#mmTotalAmount
	 * CardPaymentTransactionDetails24.mmTotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails22#mmTotalAmount
	 * CardPaymentTransactionDetails22.mmTotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionDetail5#mmTransactionAmounts
	 * CardTransactionDetail5.mmTransactionAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionDetail1#mmTransactionAmounts
	 * CardTransactionDetail1.mmTransactionAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionDetail6#mmTransactionAmounts
	 * CardTransactionDetail6.mmTransactionAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionDetail3#mmTransactionAmounts
	 * CardTransactionDetail3.mmTransactionAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SpecialCondition1#mmIncomingAmount
	 * SpecialCondition1.mmIncomingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SpecialCondition1#mmOutgoingAmount
	 * SpecialCondition1.mmOutgoingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SpecialCondition1#mmIncomingAmountToOtherAccount
	 * SpecialCondition1.mmIncomingAmountToOtherAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SpecialCondition1#mmPaymentFromOtherAccount
	 * SpecialCondition1.mmPaymentFromOtherAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification5#mmAmount
	 * RequestedModification5.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction25#mmInstructedAmount
	 * CreditTransferTransaction25.mmInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction65#mmReturnedInstructedAmount
	 * PaymentTransaction65.mmReturnedInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation5#mmAmount
	 * PaymentComplementaryInformation5.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation20#mmInstructedAmount
	 * DirectDebitTransactionInformation20.mmInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction60#mmReversedInstructedAmount
	 * PaymentTransaction60.mmReversedInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction61#mmOriginalInstructedAmount
	 * PaymentTransaction61.mmOriginalInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference22#mmAmount
	 * OriginalTransactionReference22.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction24#mmInstructedAmount
	 * CreditTransferTransaction24.mmInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction26#mmAmount
	 * CreditTransferTransaction26.mmAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OriginalItem5#mmAmount
	 * OriginalItem5.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation19#mmInstructedAmount
	 * DirectDebitTransactionInformation19.mmInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction66#mmOriginalInstructedAmount
	 * PaymentTransaction66.mmOriginalInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction22#mmAmount
	 * CreditTransferTransaction22.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction64#mmOriginalInstructedAmount
	 * PaymentTransaction64.mmOriginalInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction64#mmReversedInstructedAmount
	 * PaymentTransaction64.mmReversedInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails32#mmTotalAmount
	 * CardPaymentTransactionDetails32.mmTotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails33#mmTotalAmount
	 * CardPaymentTransactionDetails33.mmTotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails28#mmTotalAmount
	 * CardPaymentTransactionDetails28.mmTotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails29#mmTotalAmount
	 * CardPaymentTransactionDetails29.mmTotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails30#mmTotalAmount
	 * CardPaymentTransactionDetails30.mmTotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails27#mmTotalAmount
	 * CardPaymentTransactionDetails27.mmTotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails31#mmTotalAmount
	 * CardPaymentTransactionDetails31.mmTotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails35#mmTotalAmount
	 * CardPaymentTransactionDetails35.mmTotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails34#mmTotalAmount
	 * CardPaymentTransactionDetails34.mmTotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkOrder5#mmTotalSettlementAmount
	 * SubscriptionBulkOrder5.mmTotalSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkExecution5#mmTotalSettlementAmount
	 * RedemptionBulkExecution5.mmTotalSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution5#mmTotalSettlementAmount
	 * RedemptionMultipleExecution5.mmTotalSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder6#mmTotalSettlementAmount
	 * RedemptionMultipleOrder6.mmTotalSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder6#mmTotalSettlementAmount
	 * SubscriptionMultipleOrder6.mmTotalSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkExecution4#mmTotalSettlementAmount
	 * SubscriptionBulkExecution4.mmTotalSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkOrder6#mmTotalSettlementAmount
	 * RedemptionBulkOrder6.mmTotalSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleExecution5#mmTotalSettlementAmount
	 * SubscriptionMultipleExecution5.mmTotalSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundOrderData5#mmSettlementAmount
	 * FundOrderData5.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#mmSettlementAmount
	 * RedemptionExecution16.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundOrderData6#mmSettlementAmount
	 * FundOrderData6.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#mmSettlementAmount
	 * RedemptionExecution15.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation21#mmInstructedAmount
	 * DirectDebitTransactionInformation21.mmInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction81#mmReversedInstructedAmount
	 * PaymentTransaction81.mmReversedInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification6#mmAmount
	 * RequestedModification6.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction76#mmReturnedInstructedAmount
	 * PaymentTransaction76.mmReturnedInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction78#mmOriginalInstructedAmount
	 * PaymentTransaction78.mmOriginalInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference24#mmAmount
	 * OriginalTransactionReference24.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction74#mmOriginalInstructedAmount
	 * PaymentTransaction74.mmOriginalInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction77#mmOriginalInstructedAmount
	 * PaymentTransaction77.mmOriginalInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction77#mmReversedInstructedAmount
	 * PaymentTransaction77.mmReversedInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation22#mmInstructedAmount
	 * DirectDebitTransactionInformation22.mmInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorrectivePaymentInitiation2#mmInstructedAmount
	 * CorrectivePaymentInitiation2.mmInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentInstruction3#mmOriginalInstructedAmount
	 * UnderlyingPaymentInstruction3.mmOriginalInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation6#mmAmount
	 * PaymentComplementaryInformation6.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails39#mmTotalAmount
	 * CardPaymentTransactionDetails39.mmTotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails38#mmTotalAmount
	 * CardPaymentTransactionDetails38.mmTotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails41#mmTotalAmount
	 * CardPaymentTransactionDetails41.mmTotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails37#mmTotalAmount
	 * CardPaymentTransactionDetails37.mmTotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails40#mmTotalAmount
	 * CardPaymentTransactionDetails40.mmTotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails42#mmTotalAmount
	 * CardPaymentTransactionDetails42.mmTotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails43#mmTotalAmount
	 * CardPaymentTransactionDetails43.mmTotalAmount}</li>
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
	public static final MMBusinessAttribute mmInstructedAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(PaymentSearch2.mmInstructedAmount, PaymentSearch3.mmInstructedAmount, PaymentSearch4.mmInstructedAmount, PaymentDetails5.mmInstructedAmount, PaymentDetails6.mmInstructedAmount,
					PaymentDetails7.mmInstructedAmount, PaymentInstruction1.mmInstructedAmount, AmountAndCurrencyExchange2.mmInstructedAmount, AmountAndCurrencyExchange3.mmInstructedAmount, AmountType1Choice.mmInstructedAmount,
					AmountType2Choice.mmInstructedAmount, CreditTransferTransactionInformation1.mmAmount, AmountType3Choice.mmInstructedAmount, CreditTransferTransactionInformation10.mmAmount, CreditTransferTransaction1.mmAmount,
					CreditTransferTransaction6.mmAmount, DirectDebitTransactionInformation1.mmInstructedAmount, DirectDebitTransactionInformation9.mmInstructedAmount, DirectDebitTransactionInformation11.mmInstructedAmount,
					DirectDebitTransactionInformation13.mmInstructedAmount, OriginalTransactionReference1.mmAmount, PaymentTransactionInformation3.mmOriginalInstructedAmount, OriginalTransactionReference13.mmAmount,
					PaymentTransactionInformation30.mmOriginalInstructedAmount, OriginalTransactionReference16.mmAmount, PaymentTransaction37.mmOriginalInstructedAmount, PaymentTransaction47.mmOriginalInstructedAmount,
					PaymentTransactionInformation4.mmOriginalInstructedAmount, PaymentTransactionInformation4.mmReversedInstructedAmount, PaymentTransactionInformation28.mmOriginalInstructedAmount,
					PaymentTransactionInformation28.mmReversedInstructedAmount, PaymentTransaction35.mmOriginalInstructedAmount, PaymentTransaction35.mmReversedInstructedAmount, PaymentTransaction42.mmOriginalInstructedAmount,
					PaymentTransaction42.mmReversedInstructedAmount, CreditTransferTransactionInformation2.mmInstructedAmount, CreditTransferTransactionInformation11.mmInstructedAmount, CreditTransferTransaction2.mmInstructedAmount,
					CreditTransferTransaction7.mmInstructedAmount, DirectDebitTransactionInformation2.mmInstructedAmount, DirectDebitTransactionInformation10.mmInstructedAmount, DirectDebitTransactionInformation12.mmInstructedAmount,
					DirectDebitTransactionInformation14.mmInstructedAmount, PaymentTransactionInformation5.mmReversedInstructedAmount, PaymentTransactionInformation29.mmReversedInstructedAmount,
					PaymentTransaction36.mmReversedInstructedAmount, PaymentTransaction45.mmReversedInstructedAmount, CreditTransferTransactionInformation12.mmInstructedAmount, CreditTransferTransaction3.mmInstructedAmount,
					PaymentTransactionInformation2.mmReturnedInstructedAmount, PaymentTransactionInformation27.mmReturnedInstructedAmount, PaymentTransaction34.mmReturnedInstructedAmount, PaymentTransaction44.mmReturnedInstructedAmount,
					OriginalTransactionReference15.mmAmount, OriginalTransactionReference17.mmAmount, CreditTransferTransactionInformation14.mmAmount, CreditTransferTransaction5.mmAmount, CreditTransferTransaction10.mmAmount,
					CardPaymentTransactionDetails4.mmTotalAmount, CardPaymentTransactionDetails7.mmTotalAmount, CardPaymentTransactionDetails9.mmTotalAmount, CardPaymentTransactionDetails1.mmTotalAmount,
					CardPaymentTransactionDetails10.mmTotalAmount, CardPaymentTransactionDetails2.mmTotalAmount, CardPaymentTransactionDetails11.mmTotalAmount, CardPaymentTransactionDetails5.mmTotalAmount,
					CardPaymentTransactionDetails6.mmTotalAmount, CardPaymentTransactionDetails3.mmTotalAmount, FundOrderData1.mmSettlementAmount, FundOrderData2.mmSettlementAmount, PaymentTransaction18.mmSettlementAmount,
					PaymentTransaction15.mmSettlementAmount, RedemptionBulkOrder3.mmTotalSettlementAmount, RedemptionExecution5.mmSettlementAmount, RedemptionBulkExecution3.mmTotalSettlementAmount,
					RedemptionBulkOrder4.mmTotalSettlementAmount, RedemptionMultipleOrder3.mmTotalSettlementAmount, RedemptionExecution6.mmSettlementAmount, RedemptionMultipleExecution3.mmTotalSettlementAmount,
					RedemptionMultipleOrder4.mmTotalSettlementAmount, InvestmentFundTransaction2.mmGrossSettlementAmount, PaymentTransaction17.mmSettlementAmount, PaymentTransaction19.mmSettlementAmount,
					SubscriptionBulkOrder3.mmTotalSettlementAmount, PaymentTransaction16.mmSettlementAmount, PaymentTransaction13.mmSettlementAmount, SubscriptionBulkExecution3.mmTotalSettlementAmount,
					SubscriptionBulkOrder4.mmTotalSettlementAmount, SubscriptionMultipleOrder3.mmTotalSettlementAmount, SubscriptionMultipleExecution3.mmTotalSettlementAmount, SubscriptionMultipleOrder4.mmTotalSettlementAmount,
					PaymentTransaction20.mmSettlementAmount, PaymentTransaction14.mmSettlementAmount, PaymentInstructionExtract.mmCurrencyAmount, PaymentInstructionExtract2.mmInstructedAmount, PaymentComplementaryInformation.mmAmount,
					CorrectivePaymentInstructionExtract.mmInstructedAmount, UnderlyingPaymentInstruction1.mmOriginalInstructedAmount, RequestedModification2.mmAmount, PaymentComplementaryInformation2.mmAmount,
					PaymentTransactionInformation32.mmOriginalInstructedAmount, CorrectivePaymentInitiation1.mmInstructedAmount, SettlementData1.mmSettlementAmount, SettlementData2.mmSettlementAmount, SettlementData2.mmSettledAmount,
					InstalmentFinancingInformation1.mmInstalmentTotalAmount, UnderlyingPaymentInstruction2.mmOriginalInstructedAmount, PaymentComplementaryInformation3.mmAmount, PaymentTransaction39.mmOriginalInstructedAmount,
					RequestedModification3.mmAmount, OriginalItem3.mmAmount, OriginalTransactionReference9.mmAmount, OriginalTransactionReference12.mmAmount, OriginalTransactionReference11.mmAmount,
					PaymentTransactionInformation16.mmReturnedInstructedAmount, PaymentTransactionInformation23.mmReturnedInstructedAmount, PaymentTransactionInformation17.mmReversedInstructedAmount,
					PaymentTransactionInformation24.mmReversedInstructedAmount, PaymentTransactionInformation21.mmReturnedInstructedAmount, CreditTransferTransactionInformation7.mmInstructedAmount,
					CreditTransferTransactionInformation9.mmInstructedAmount, DirectDebitTransactionInformation6.mmInstructedAmount, DirectDebitTransactionInformation8.mmInstructedAmount, RedemptionExecution12.mmSettlementAmount,
					PaymentSearch5.mmInstructedAmount, PaymentInstruction14.mmInstructedAmount, CardPaymentTransactionDetails12.mmTotalAmount, CardPaymentTransactionDetails13.mmTotalAmount, CardPaymentTransactionDetails18.mmTotalAmount,
					CardPaymentTransactionDetails16.mmTotalAmount, CardPaymentTransactionDetails14.mmTotalAmount, CardPaymentTransactionDetails15.mmTotalAmount, CardPaymentTransactionDetails17.mmTotalAmount,
					PaymentComplementaryInformation4.mmAmount, PaymentTransaction50.mmReturnedInstructedAmount, CreditTransferTransaction19.mmInstructedAmount, DirectDebitTransactionInformation17.mmInstructedAmount,
					PaymentTransaction51.mmReversedInstructedAmount, OriginalItem4.mmAmount, RequestedModification4.mmAmount, PaymentTransaction58.mmOriginalInstructedAmount, PaymentTransaction54.mmOriginalInstructedAmount,
					OriginalTransactionReference20.mmAmount, CreditTransferTransaction18.mmInstructedAmount, PaymentTransaction56.mmOriginalInstructedAmount, PaymentTransaction56.mmReversedInstructedAmount,
					DirectDebitTransactionInformation18.mmInstructedAmount, CreditTransferTransaction20.mmAmount, AmountType4Choice.mmInstructedAmount, CreditTransferTransaction21.mmAmount, CardPaymentTransactionDetails20.mmTotalAmount,
					CardPaymentTransactionDetails25.mmTotalAmount, CardPaymentTransactionDetails23.mmTotalAmount, CardPaymentTransactionDetails21.mmTotalAmount, CardPaymentTransactionDetails26.mmTotalAmount,
					CardPaymentTransactionDetails19.mmTotalAmount, CardPaymentTransactionDetails24.mmTotalAmount, CardPaymentTransactionDetails22.mmTotalAmount, CardTransactionDetail5.mmTransactionAmounts,
					CardTransactionDetail1.mmTransactionAmounts, CardTransactionDetail6.mmTransactionAmounts, CardTransactionDetail3.mmTransactionAmounts, SpecialCondition1.mmIncomingAmount, SpecialCondition1.mmOutgoingAmount,
					SpecialCondition1.mmIncomingAmountToOtherAccount, SpecialCondition1.mmPaymentFromOtherAccount, RequestedModification5.mmAmount, CreditTransferTransaction25.mmInstructedAmount,
					PaymentTransaction65.mmReturnedInstructedAmount, PaymentComplementaryInformation5.mmAmount, DirectDebitTransactionInformation20.mmInstructedAmount, PaymentTransaction60.mmReversedInstructedAmount,
					PaymentTransaction61.mmOriginalInstructedAmount, OriginalTransactionReference22.mmAmount, CreditTransferTransaction24.mmInstructedAmount, CreditTransferTransaction26.mmAmount, OriginalItem5.mmAmount,
					DirectDebitTransactionInformation19.mmInstructedAmount, PaymentTransaction66.mmOriginalInstructedAmount, CreditTransferTransaction22.mmAmount, PaymentTransaction64.mmOriginalInstructedAmount,
					PaymentTransaction64.mmReversedInstructedAmount, CardPaymentTransactionDetails32.mmTotalAmount, CardPaymentTransactionDetails33.mmTotalAmount, CardPaymentTransactionDetails28.mmTotalAmount,
					CardPaymentTransactionDetails29.mmTotalAmount, CardPaymentTransactionDetails30.mmTotalAmount, CardPaymentTransactionDetails27.mmTotalAmount, CardPaymentTransactionDetails31.mmTotalAmount,
					CardPaymentTransactionDetails35.mmTotalAmount, CardPaymentTransactionDetails34.mmTotalAmount, SubscriptionBulkOrder5.mmTotalSettlementAmount, RedemptionBulkExecution5.mmTotalSettlementAmount,
					RedemptionMultipleExecution5.mmTotalSettlementAmount, RedemptionMultipleOrder6.mmTotalSettlementAmount, SubscriptionMultipleOrder6.mmTotalSettlementAmount, SubscriptionBulkExecution4.mmTotalSettlementAmount,
					RedemptionBulkOrder6.mmTotalSettlementAmount, SubscriptionMultipleExecution5.mmTotalSettlementAmount, FundOrderData5.mmSettlementAmount, RedemptionExecution16.mmSettlementAmount, FundOrderData6.mmSettlementAmount,
					RedemptionExecution15.mmSettlementAmount, DirectDebitTransactionInformation21.mmInstructedAmount, PaymentTransaction81.mmReversedInstructedAmount, RequestedModification6.mmAmount,
					PaymentTransaction76.mmReturnedInstructedAmount, PaymentTransaction78.mmOriginalInstructedAmount, OriginalTransactionReference24.mmAmount, PaymentTransaction74.mmOriginalInstructedAmount,
					PaymentTransaction77.mmOriginalInstructedAmount, PaymentTransaction77.mmReversedInstructedAmount, DirectDebitTransactionInformation22.mmInstructedAmount, CorrectivePaymentInitiation2.mmInstructedAmount,
					UnderlyingPaymentInstruction3.mmOriginalInstructedAmount, PaymentComplementaryInformation6.mmAmount, CardPaymentTransactionDetails39.mmTotalAmount, CardPaymentTransactionDetails38.mmTotalAmount,
					CardPaymentTransactionDetails41.mmTotalAmount, CardPaymentTransactionDetails37.mmTotalAmount, CardPaymentTransactionDetails40.mmTotalAmount, CardPaymentTransactionDetails42.mmTotalAmount,
					CardPaymentTransactionDetails43.mmTotalAmount);
			elementContext_lazy = () -> com.tools20022.repository.entity.Payment.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InstructedAmount";
			definition = "Amount of money to be moved between the debtor and creditor, before deduction of charges, expressed in the currency as ordered by the initiating party.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Payment.class.getMethod("getInstructedAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PriorityCode priority;
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
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriorityCodeChoice#mmCode
	 * PriorityCodeChoice.mmCode}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentSearch2#mmPriority
	 * PaymentSearch2.mmPriority}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentSearch3#mmPriority
	 * PaymentSearch3.mmPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriorityCode2Choice#mmCode
	 * PriorityCode2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriorityCode2Choice#mmProprietary
	 * PriorityCode2Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentSearch4#mmPriority
	 * PaymentSearch4.mmPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction2#mmPriority
	 * PaymentInstruction2.mmPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction1#mmPriority
	 * PaymentInstruction1.mmPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Cheque5#mmInstructionPriority
	 * Cheque5.mmInstructionPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Cheque6#mmInstructionPriority
	 * Cheque6.mmInstructionPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Cheque7#mmInstructionPriority
	 * Cheque7.mmInstructionPriority}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.IntraBalance1#mmPriority
	 * IntraBalance1.mmPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction12#mmPriority
	 * PaymentInstruction12.mmPriority}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentSearch5#mmPriority
	 * PaymentSearch5.mmPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriorityCode3Choice#mmCode
	 * PriorityCode3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriorityCode3Choice#mmProprietary
	 * PriorityCode3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction14#mmPriority
	 * PaymentInstruction14.mmPriority}</li>
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
	public static final MMBusinessAttribute mmPriority = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(PriorityCodeChoice.mmCode, PaymentSearch2.mmPriority, PaymentSearch3.mmPriority, PriorityCode2Choice.mmCode, PriorityCode2Choice.mmProprietary, PaymentSearch4.mmPriority,
					PaymentInstruction2.mmPriority, PaymentInstruction1.mmPriority, Cheque5.mmInstructionPriority, Cheque6.mmInstructionPriority, Cheque7.mmInstructionPriority, IntraBalance1.mmPriority, PaymentInstruction12.mmPriority,
					PaymentSearch5.mmPriority, PriorityCode3Choice.mmCode, PriorityCode3Choice.mmProprietary, PaymentInstruction14.mmPriority);
			elementContext_lazy = () -> com.tools20022.repository.entity.Payment.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Priority";
			definition = "Urgency or order of importance that the originator would like the recipient of the payment  to apply to its processing.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PriorityCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Payment.class.getMethod("getPriority", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODate valueDate;
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
	 * {@linkplain com.tools20022.repository.msg.PaymentDetails5#mmTransferValueDate
	 * PaymentDetails5.mmTransferValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection32#mmValueDate
	 * AmountAndDirection32.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection33#mmValueDate
	 * AmountAndDirection33.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection2#mmValueDate
	 * AmountAndDirection2.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection16#mmValueDate
	 * AmountAndDirection16.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails5#mmExpectedValueDate
	 * TransactionDetails5.mmExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails9#mmExpectedValueDate
	 * TransactionDetails9.mmExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails22#mmExpectedValueDate
	 * TransactionDetails22.mmExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails23#mmExpectedValueDate
	 * TransactionDetails23.mmExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails36#mmExpectedValueDate
	 * TransactionDetails36.mmExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails47#mmExpectedValueDate
	 * TransactionDetails47.mmExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails53#mmExpectedValueDate
	 * TransactionDetails53.mmExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails58#mmExpectedValueDate
	 * TransactionDetails58.mmExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails7#mmExpectedValueDate
	 * TransactionDetails7.mmExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails8#mmExpectedValueDate
	 * TransactionDetails8.mmExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails16#mmExpectedValueDate
	 * TransactionDetails16.mmExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails17#mmExpectedValueDate
	 * TransactionDetails17.mmExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails26#mmExpectedValueDate
	 * TransactionDetails26.mmExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails25#mmExpectedValueDate
	 * TransactionDetails25.mmExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails27#mmExpectedValueDate
	 * TransactionDetails27.mmExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails33#mmExpectedValueDate
	 * TransactionDetails33.mmExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails39#mmExpectedValueDate
	 * TransactionDetails39.mmExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails50#mmExpectedValueDate
	 * TransactionDetails50.mmExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails56#mmExpectedValueDate
	 * TransactionDetails56.mmExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails59#mmExpectedValueDate
	 * TransactionDetails59.mmExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection28#mmValueDate
	 * AmountAndDirection28.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NetCashForecast1#mmSettlementDate
	 * NetCashForecast1.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NetCashForecast2#mmCashSettlementDate
	 * NetCashForecast2.mmCashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction18#mmSettlementDate
	 * PaymentTransaction18.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction15#mmSettlementDate
	 * PaymentTransaction15.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder5#mmCashSettlementDate
	 * RedemptionOrder5.mmCashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkOrder3#mmCashSettlementDate
	 * RedemptionBulkOrder3.mmCashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution5#mmCashSettlementDate
	 * RedemptionExecution5.mmCashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkExecution3#mmCashSettlementDate
	 * RedemptionBulkExecution3.mmCashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder7#mmCashSettlementDate
	 * RedemptionOrder7.mmCashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkOrder4#mmCashSettlementDate
	 * RedemptionBulkOrder4.mmCashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder6#mmCashSettlementDate
	 * RedemptionOrder6.mmCashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder3#mmCashSettlementDate
	 * RedemptionMultipleOrder3.mmCashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#mmCashSettlementDate
	 * RedemptionExecution6.mmCashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution3#mmCashSettlementDate
	 * RedemptionMultipleExecution3.mmCashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder8#mmCashSettlementDate
	 * RedemptionOrder8.mmCashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder4#mmCashSettlementDate
	 * RedemptionMultipleOrder4.mmCashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction17#mmSettlementDate
	 * PaymentTransaction17.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction19#mmSettlementDate
	 * PaymentTransaction19.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder5#mmCashSettlementDate
	 * SubscriptionOrder5.mmCashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkOrder3#mmCashSettlementDate
	 * SubscriptionBulkOrder3.mmCashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction16#mmSettlementDate
	 * PaymentTransaction16.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction13#mmSettlementDate
	 * PaymentTransaction13.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution5#mmCashSettlementDate
	 * SubscriptionExecution5.mmCashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkExecution3#mmCashSettlementDate
	 * SubscriptionBulkExecution3.mmCashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder7#mmCashSettlementDate
	 * SubscriptionOrder7.mmCashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkOrder4#mmCashSettlementDate
	 * SubscriptionBulkOrder4.mmCashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder6#mmCashSettlementDate
	 * SubscriptionOrder6.mmCashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder3#mmCashSettlementDate
	 * SubscriptionMultipleOrder3.mmCashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#mmCashSettlementDate
	 * SubscriptionExecution6.mmCashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleExecution3#mmCashSettlementDate
	 * SubscriptionMultipleExecution3.mmCashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder8#mmCashSettlementDate
	 * SubscriptionOrder8.mmCashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder4#mmCashSettlementDate
	 * SubscriptionMultipleOrder4.mmCashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction20#mmSettlementDate
	 * PaymentTransaction20.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder3#mmCashSettlementDate
	 * SwitchOrder3.mmCashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction14#mmSettlementDate
	 * PaymentTransaction14.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution4#mmCashSettlementDate
	 * SwitchExecution4.mmCashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder4#mmCashSettlementDate
	 * SwitchOrder4.mmCashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionExtract#mmValueDate
	 * PaymentInstructionExtract.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification#mmValueDate
	 * RequestedModification.mmValueDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashMovement3#mmValueDate
	 * CashMovement3.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails2#mmExpectedValueDate
	 * SecuritiesFinancingTransactionDetails2.mmExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails8#mmExpectedValueDate
	 * SecuritiesFinancingTransactionDetails8.mmExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection22#mmValueDate
	 * AmountAndDirection22.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NotificationEntry2#mmExpectedValueDate
	 * NotificationEntry2.mmExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NotificationItem3#mmExpectedValueDate
	 * NotificationItem3.mmExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountNotification4#mmExpectedValueDate
	 * AccountNotification4.mmExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItem1#mmExpectedValueDate
	 * OriginalItem1.mmExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItem2#mmExpectedValueDate
	 * OriginalItem2.mmExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference1#mmExpectedValueDate
	 * OriginalNotificationReference1.mmExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItemAndStatus1#mmExpectedValueDate
	 * OriginalItemAndStatus1.mmExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItemAndStatus2#mmExpectedValueDate
	 * OriginalItemAndStatus2.mmExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference2#mmExpectedValueDate
	 * OriginalNotificationReference2.mmExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementData1#mmSettlementDate
	 * SettlementData1.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementData2#mmSettlementDate
	 * SettlementData2.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails6#mmExpectedValueDate
	 * SecuritiesFinancingTransactionDetails6.mmExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails10#mmExpectedValueDate
	 * SecuritiesFinancingTransactionDetails10.mmExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails17#mmExpectedValueDate
	 * SecuritiesFinancingTransactionDetails17.mmExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails18#mmExpectedValueDate
	 * SecuritiesFinancingTransactionDetails18.mmExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection25#mmValueDate
	 * AmountAndDirection25.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NotificationItem4#mmExpectedValueDate
	 * NotificationItem4.mmExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountNotification6#mmExpectedValueDate
	 * AccountNotification6.mmExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItem3#mmExpectedValueDate
	 * OriginalItem3.mmExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference4#mmExpectedValueDate
	 * OriginalNotificationReference4.mmExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItemAndStatus3#mmExpectedValueDate
	 * OriginalItemAndStatus3.mmExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference3#mmExpectedValueDate
	 * OriginalNotificationReference3.mmExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashCompensation1#mmValueDate
	 * CashCompensation1.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution10#mmCashSettlementDate
	 * RedemptionExecution10.mmCashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder9#mmCashSettlementDate
	 * RedemptionOrder9.mmCashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7#mmCashSettlementDate
	 * SubscriptionExecution7.mmCashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder9#mmCashSettlementDate
	 * SubscriptionOrder9.mmCashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution12#mmCashSettlementDate
	 * RedemptionExecution12.mmCashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution9#mmCashSettlementDate
	 * SubscriptionExecution9.mmCashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails61#mmExpectedValueDate
	 * TransactionDetails61.mmExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection36#mmValueDate
	 * AmountAndDirection36.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails21#mmExpectedValueDate
	 * SecuritiesFinancingTransactionDetails21.mmExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails62#mmExpectedValueDate
	 * TransactionDetails62.mmExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection37#mmValueDate
	 * AmountAndDirection37.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection38#mmValueDate
	 * AmountAndDirection38.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails22#mmExpectedValueDate
	 * SecuritiesFinancingTransactionDetails22.mmExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails66#mmExpectedValueDate
	 * TransactionDetails66.mmExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails67#mmExpectedValueDate
	 * TransactionDetails67.mmExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection40#mmValueDate
	 * AmountAndDirection40.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregationTransaction1#mmFirstPaymentDateTime
	 * AggregationTransaction1.mmFirstPaymentDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregationTransaction1#mmLastPaymentDateTime
	 * AggregationTransaction1.mmLastPaymentDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NetCashForecast4#mmCashSettlementDate
	 * NetCashForecast4.mmCashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountNotification10#mmExpectedValueDate
	 * AccountNotification10.mmExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference6#mmExpectedValueDate
	 * OriginalNotificationReference6.mmExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItem4#mmExpectedValueDate
	 * OriginalItem4.mmExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItemAndStatus4#mmExpectedValueDate
	 * OriginalItemAndStatus4.mmExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference5#mmExpectedValueDate
	 * OriginalNotificationReference5.mmExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NotificationItem5#mmExpectedValueDate
	 * NotificationItem5.mmExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails24#mmExpectedValueDate
	 * SecuritiesFinancingTransactionDetails24.mmExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails70#mmExpectedValueDate
	 * TransactionDetails70.mmExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails69#mmExpectedValueDate
	 * TransactionDetails69.mmExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NetCashForecast5#mmCashSettlementDate
	 * NetCashForecast5.mmCashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails71#mmExpectedValueDate
	 * TransactionDetails71.mmExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails25#mmExpectedValueDate
	 * SecuritiesFinancingTransactionDetails25.mmExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails72#mmExpectedValueDate
	 * TransactionDetails72.mmExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMAccountStatement2#mmValueDate
	 * ATMAccountStatement2.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26#mmExpectedValueDate
	 * SecuritiesFinancingTransactionDetails26.mmExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails79#mmExpectedValueDate
	 * TransactionDetails79.mmExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails75#mmExpectedValueDate
	 * TransactionDetails75.mmExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection46#mmValueDate
	 * AmountAndDirection46.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection48#mmValueDate
	 * AmountAndDirection48.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection45#mmValueDate
	 * AmountAndDirection45.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountNotification13#mmExpectedValueDate
	 * AccountNotification13.mmExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference8#mmExpectedValueDate
	 * OriginalNotificationReference8.mmExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItem5#mmExpectedValueDate
	 * OriginalItem5.mmExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItemAndStatus5#mmExpectedValueDate
	 * OriginalItemAndStatus5.mmExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference7#mmExpectedValueDate
	 * OriginalNotificationReference7.mmExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NotificationItem6#mmExpectedValueDate
	 * NotificationItem6.mmExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33#mmExpectedValueDate
	 * SecuritiesFinancingTransactionDetails33.mmExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection60#mmValueDate
	 * AmountAndDirection60.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails87#mmExpectedValueDate
	 * TransactionDetails87.mmExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection71#mmValueDate
	 * AmountAndDirection71.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection85#mmValueDate
	 * AmountAndDirection85.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails90#mmExpectedValueDate
	 * TransactionDetails90.mmExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregationTransaction2#mmFirstPaymentDateTime
	 * AggregationTransaction2.mmFirstPaymentDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregationTransaction2#mmLastPaymentDateTime
	 * AggregationTransaction2.mmLastPaymentDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution7#mmCashSettlementDate
	 * SwitchExecution7.mmCashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder7#mmCashSettlementDate
	 * SwitchOrder7.mmCashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder14#mmCashSettlementDate
	 * RedemptionOrder14.mmCashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmCashSettlementDate
	 * SubscriptionExecution13.mmCashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution12#mmCashSettlementDate
	 * SubscriptionExecution12.mmCashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder15#mmCashSettlementDate
	 * SubscriptionOrder15.mmCashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder15#mmCashSettlementDate
	 * RedemptionOrder15.mmCashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#mmCashSettlementDate
	 * RedemptionExecution16.mmCashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder14#mmCashSettlementDate
	 * SubscriptionOrder14.mmCashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#mmCashSettlementDate
	 * RedemptionExecution15.mmCashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails97#mmExpectedValueDate
	 * TransactionDetails97.mmExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35#mmExpectedValueDate
	 * SecuritiesFinancingTransactionDetails35.mmExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails96#mmExpectedValueDate
	 * TransactionDetails96.mmExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails36#mmExpectedValueDate
	 * SecuritiesFinancingTransactionDetails36.mmExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails100#mmExpectedValueDate
	 * TransactionDetails100.mmExpectedValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails99#mmExpectedValueDate
	 * TransactionDetails99.mmExpectedValueDate}</li>
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
	public static final MMBusinessAttribute mmValueDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(PaymentDetails5.mmTransferValueDate, AmountAndDirection32.mmValueDate, AmountAndDirection33.mmValueDate, AmountAndDirection2.mmValueDate, AmountAndDirection16.mmValueDate,
					TransactionDetails5.mmExpectedValueDate, TransactionDetails9.mmExpectedValueDate, TransactionDetails22.mmExpectedValueDate, TransactionDetails23.mmExpectedValueDate, TransactionDetails36.mmExpectedValueDate,
					TransactionDetails47.mmExpectedValueDate, TransactionDetails53.mmExpectedValueDate, TransactionDetails58.mmExpectedValueDate, TransactionDetails7.mmExpectedValueDate, TransactionDetails8.mmExpectedValueDate,
					TransactionDetails16.mmExpectedValueDate, TransactionDetails17.mmExpectedValueDate, TransactionDetails26.mmExpectedValueDate, TransactionDetails25.mmExpectedValueDate, TransactionDetails27.mmExpectedValueDate,
					TransactionDetails33.mmExpectedValueDate, TransactionDetails39.mmExpectedValueDate, TransactionDetails50.mmExpectedValueDate, TransactionDetails56.mmExpectedValueDate, TransactionDetails59.mmExpectedValueDate,
					AmountAndDirection28.mmValueDate, NetCashForecast1.mmSettlementDate, NetCashForecast2.mmCashSettlementDate, PaymentTransaction18.mmSettlementDate, PaymentTransaction15.mmSettlementDate,
					RedemptionOrder5.mmCashSettlementDate, RedemptionBulkOrder3.mmCashSettlementDate, RedemptionExecution5.mmCashSettlementDate, RedemptionBulkExecution3.mmCashSettlementDate, RedemptionOrder7.mmCashSettlementDate,
					RedemptionBulkOrder4.mmCashSettlementDate, RedemptionOrder6.mmCashSettlementDate, RedemptionMultipleOrder3.mmCashSettlementDate, RedemptionExecution6.mmCashSettlementDate,
					RedemptionMultipleExecution3.mmCashSettlementDate, RedemptionOrder8.mmCashSettlementDate, RedemptionMultipleOrder4.mmCashSettlementDate, PaymentTransaction17.mmSettlementDate, PaymentTransaction19.mmSettlementDate,
					SubscriptionOrder5.mmCashSettlementDate, SubscriptionBulkOrder3.mmCashSettlementDate, PaymentTransaction16.mmSettlementDate, PaymentTransaction13.mmSettlementDate, SubscriptionExecution5.mmCashSettlementDate,
					SubscriptionBulkExecution3.mmCashSettlementDate, SubscriptionOrder7.mmCashSettlementDate, SubscriptionBulkOrder4.mmCashSettlementDate, SubscriptionOrder6.mmCashSettlementDate,
					SubscriptionMultipleOrder3.mmCashSettlementDate, SubscriptionExecution6.mmCashSettlementDate, SubscriptionMultipleExecution3.mmCashSettlementDate, SubscriptionOrder8.mmCashSettlementDate,
					SubscriptionMultipleOrder4.mmCashSettlementDate, PaymentTransaction20.mmSettlementDate, SwitchOrder3.mmCashSettlementDate, PaymentTransaction14.mmSettlementDate, SwitchExecution4.mmCashSettlementDate,
					SwitchOrder4.mmCashSettlementDate, PaymentInstructionExtract.mmValueDate, RequestedModification.mmValueDate, CashMovement3.mmValueDate, SecuritiesFinancingTransactionDetails2.mmExpectedValueDate,
					SecuritiesFinancingTransactionDetails8.mmExpectedValueDate, AmountAndDirection22.mmValueDate, NotificationEntry2.mmExpectedValueDate, NotificationItem3.mmExpectedValueDate, AccountNotification4.mmExpectedValueDate,
					OriginalItem1.mmExpectedValueDate, OriginalItem2.mmExpectedValueDate, OriginalNotificationReference1.mmExpectedValueDate, OriginalItemAndStatus1.mmExpectedValueDate, OriginalItemAndStatus2.mmExpectedValueDate,
					OriginalNotificationReference2.mmExpectedValueDate, SettlementData1.mmSettlementDate, SettlementData2.mmSettlementDate, SecuritiesFinancingTransactionDetails6.mmExpectedValueDate,
					SecuritiesFinancingTransactionDetails10.mmExpectedValueDate, SecuritiesFinancingTransactionDetails17.mmExpectedValueDate, SecuritiesFinancingTransactionDetails18.mmExpectedValueDate, AmountAndDirection25.mmValueDate,
					NotificationItem4.mmExpectedValueDate, AccountNotification6.mmExpectedValueDate, OriginalItem3.mmExpectedValueDate, OriginalNotificationReference4.mmExpectedValueDate, OriginalItemAndStatus3.mmExpectedValueDate,
					OriginalNotificationReference3.mmExpectedValueDate, CashCompensation1.mmValueDate, RedemptionExecution10.mmCashSettlementDate, RedemptionOrder9.mmCashSettlementDate, SubscriptionExecution7.mmCashSettlementDate,
					SubscriptionOrder9.mmCashSettlementDate, RedemptionExecution12.mmCashSettlementDate, SubscriptionExecution9.mmCashSettlementDate, TransactionDetails61.mmExpectedValueDate, AmountAndDirection36.mmValueDate,
					SecuritiesFinancingTransactionDetails21.mmExpectedValueDate, TransactionDetails62.mmExpectedValueDate, AmountAndDirection37.mmValueDate, AmountAndDirection38.mmValueDate,
					SecuritiesFinancingTransactionDetails22.mmExpectedValueDate, TransactionDetails66.mmExpectedValueDate, TransactionDetails67.mmExpectedValueDate, AmountAndDirection40.mmValueDate,
					AggregationTransaction1.mmFirstPaymentDateTime, AggregationTransaction1.mmLastPaymentDateTime, NetCashForecast4.mmCashSettlementDate, AccountNotification10.mmExpectedValueDate,
					OriginalNotificationReference6.mmExpectedValueDate, OriginalItem4.mmExpectedValueDate, OriginalItemAndStatus4.mmExpectedValueDate, OriginalNotificationReference5.mmExpectedValueDate,
					NotificationItem5.mmExpectedValueDate, SecuritiesFinancingTransactionDetails24.mmExpectedValueDate, TransactionDetails70.mmExpectedValueDate, TransactionDetails69.mmExpectedValueDate,
					NetCashForecast5.mmCashSettlementDate, TransactionDetails71.mmExpectedValueDate, SecuritiesFinancingTransactionDetails25.mmExpectedValueDate, TransactionDetails72.mmExpectedValueDate, ATMAccountStatement2.mmValueDate,
					SecuritiesFinancingTransactionDetails26.mmExpectedValueDate, TransactionDetails79.mmExpectedValueDate, TransactionDetails75.mmExpectedValueDate, AmountAndDirection46.mmValueDate, AmountAndDirection48.mmValueDate,
					AmountAndDirection45.mmValueDate, AccountNotification13.mmExpectedValueDate, OriginalNotificationReference8.mmExpectedValueDate, OriginalItem5.mmExpectedValueDate, OriginalItemAndStatus5.mmExpectedValueDate,
					OriginalNotificationReference7.mmExpectedValueDate, NotificationItem6.mmExpectedValueDate, SecuritiesFinancingTransactionDetails33.mmExpectedValueDate, AmountAndDirection60.mmValueDate,
					TransactionDetails87.mmExpectedValueDate, AmountAndDirection71.mmValueDate, AmountAndDirection85.mmValueDate, TransactionDetails90.mmExpectedValueDate, AggregationTransaction2.mmFirstPaymentDateTime,
					AggregationTransaction2.mmLastPaymentDateTime, SwitchExecution7.mmCashSettlementDate, SwitchOrder7.mmCashSettlementDate, RedemptionOrder14.mmCashSettlementDate, SubscriptionExecution13.mmCashSettlementDate,
					SubscriptionExecution12.mmCashSettlementDate, SubscriptionOrder15.mmCashSettlementDate, RedemptionOrder15.mmCashSettlementDate, RedemptionExecution16.mmCashSettlementDate, SubscriptionOrder14.mmCashSettlementDate,
					RedemptionExecution15.mmCashSettlementDate, TransactionDetails97.mmExpectedValueDate, SecuritiesFinancingTransactionDetails35.mmExpectedValueDate, TransactionDetails96.mmExpectedValueDate,
					SecuritiesFinancingTransactionDetails36.mmExpectedValueDate, TransactionDetails100.mmExpectedValueDate, TransactionDetails99.mmExpectedValueDate);
			elementContext_lazy = () -> com.tools20022.repository.entity.Payment.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ValueDate";
			definition = "Date on which a payment must be executed";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Payment.class.getMethod("getValueDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.PaymentStatus> paymentStatus;
	/**
	 * Specifies the status of a payment at a specified time.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentStatus#mmPayment
	 * PaymentStatus.mmPayment}</li>
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
	 * {@linkplain com.tools20022.repository.msg.PaymentCommonDetails2#mmPaymentInstructionStatus
	 * PaymentCommonDetails2.mmPaymentInstructionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentDetails5#mmInstructionStatus
	 * PaymentDetails5.mmInstructionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCommonDetails3#mmPaymentInstructionStatus
	 * PaymentCommonDetails3.mmPaymentInstructionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentDetails6#mmInstructionStatus
	 * PaymentDetails6.mmInstructionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCommonDetails4#mmCommonInstructionStatus
	 * PaymentCommonDetails4.mmCommonInstructionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentDetails7#mmInstructionStatus
	 * PaymentDetails7.mmInstructionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCommon1#mmCommonStatus
	 * PaymentCommon1.mmCommonStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction1#mmStatus
	 * PaymentInstruction1.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReturnReasonInformation5#mmReturnReason
	 * ReturnReasonInformation5.mmReturnReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction1#mmReturnInformation
	 * EntryTransaction1.mmReturnInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction2#mmReturnInformation
	 * EntryTransaction2.mmReturnInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction3#mmReturnInformation
	 * EntryTransaction3.mmReturnInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction4#mmReturnInformation
	 * EntryTransaction4.mmReturnInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInformation4#mmCancellationReasonInformation
	 * OriginalPaymentInformation4.mmCancellationReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation4#mmReversalReasonInformation
	 * PaymentTransactionInformation4.mmReversalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation28#mmReversalReasonInformation
	 * PaymentTransactionInformation28.mmReversalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader3#mmReversalReasonInformation
	 * OriginalGroupHeader3.mmReversalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction32#mmTransactionStatus
	 * PaymentTransaction32.mmTransactionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction46#mmTransactionStatus
	 * PaymentTransaction46.mmTransactionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation5#mmReversalReasonInformation
	 * PaymentTransactionInformation5.mmReversalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation29#mmReversalReasonInformation
	 * PaymentTransactionInformation29.mmReversalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction33#mmTransactionStatus
	 * PaymentTransaction33.mmTransactionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction43#mmTransactionStatus
	 * PaymentTransaction43.mmTransactionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation2#mmReturnReasonInformation
	 * PaymentTransactionInformation2.mmReturnReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation27#mmReturnReasonInformation
	 * PaymentTransactionInformation27.mmReturnReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction41#mmTransactionStatus
	 * PaymentTransaction41.mmTransactionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction49#mmTransactionStatus
	 * PaymentTransaction49.mmTransactionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInformation3#mmCancellationStatusReasonInformation
	 * OriginalPaymentInformation3.mmCancellationStatusReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction39#mmTransactionCancellationStatus
	 * PaymentTransaction39.mmTransactionCancellationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction40#mmTransactionCancellationStatus
	 * PaymentTransaction40.mmTransactionCancellationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation13#mmReturnReasonInformation
	 * PaymentTransactionInformation13.mmReturnReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation18#mmReturnReasonInformation
	 * PaymentTransactionInformation18.mmReturnReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation14#mmReversalReasonInformation
	 * PaymentTransactionInformation14.mmReversalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation20#mmReversalReasonInformation
	 * PaymentTransactionInformation20.mmReversalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation16#mmReturnReasonInformation
	 * PaymentTransactionInformation16.mmReturnReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation23#mmReturnReasonInformation
	 * PaymentTransactionInformation23.mmReturnReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation17#mmReversalReasonInformation
	 * PaymentTransactionInformation17.mmReversalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation24#mmReversalReasonInformation
	 * PaymentTransactionInformation24.mmReversalReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation21#mmReturnReasonInformation
	 * PaymentTransactionInformation21.mmReturnReasonInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceMovement1#mmStatusAndReason
	 * IntraBalanceMovement1.mmStatusAndReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceMovements1#mmStatusAndReason
	 * IntraBalanceMovements1.mmStatusAndReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalancePending2#mmStatusAndReason
	 * IntraBalancePending2.mmStatusAndReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalancePending1#mmStatusAndReason
	 * IntraBalancePending1.mmStatusAndReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCommon2#mmCommonStatus
	 * PaymentCommon2.mmCommonStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction14#mmStatus
	 * PaymentInstruction14.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction52#mmTransactionStatus
	 * PaymentTransaction52.mmTransactionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction54#mmTransactionCancellationStatus
	 * PaymentTransaction54.mmTransactionCancellationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction53#mmTransactionCancellationStatus
	 * PaymentTransaction53.mmTransactionCancellationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction57#mmTransactionStatus
	 * PaymentTransaction57.mmTransactionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction7#mmReturnInformation
	 * EntryTransaction7.mmReturnInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction59#mmTransactionStatus
	 * PaymentTransaction59.mmTransactionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction63#mmTransactionStatus
	 * PaymentTransaction63.mmTransactionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction68#mmTransactionStatus
	 * PaymentTransaction68.mmTransactionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction66#mmTransactionCancellationStatus
	 * PaymentTransaction66.mmTransactionCancellationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction67#mmTransactionCancellationStatus
	 * PaymentTransaction67.mmTransactionCancellationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction8#mmReturnInformation
	 * EntryTransaction8.mmReturnInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction69#mmTransactionStatus
	 * PaymentTransaction69.mmTransactionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction80#mmTransactionStatus
	 * PaymentTransaction80.mmTransactionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction78#mmTransactionCancellationStatus
	 * PaymentTransaction78.mmTransactionCancellationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction83#mmTransactionStatus
	 * PaymentTransaction83.mmTransactionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction82#mmTransactionStatus
	 * PaymentTransaction82.mmTransactionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction79#mmTransactionCancellationStatus
	 * PaymentTransaction79.mmTransactionCancellationStatus}</li>
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
	public static final MMBusinessAssociationEnd mmPaymentStatus = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(PaymentCommonDetails2.mmPaymentInstructionStatus, PaymentDetails5.mmInstructionStatus, PaymentCommonDetails3.mmPaymentInstructionStatus, PaymentDetails6.mmInstructionStatus,
					PaymentCommonDetails4.mmCommonInstructionStatus, PaymentDetails7.mmInstructionStatus, PaymentCommon1.mmCommonStatus, PaymentInstruction1.mmStatus, ReturnReasonInformation5.mmReturnReason,
					EntryTransaction1.mmReturnInformation, EntryTransaction2.mmReturnInformation, EntryTransaction3.mmReturnInformation, EntryTransaction4.mmReturnInformation, OriginalPaymentInformation4.mmCancellationReasonInformation,
					PaymentTransactionInformation4.mmReversalReasonInformation, PaymentTransactionInformation28.mmReversalReasonInformation, OriginalGroupHeader3.mmReversalReasonInformation, PaymentTransaction32.mmTransactionStatus,
					PaymentTransaction46.mmTransactionStatus, PaymentTransactionInformation5.mmReversalReasonInformation, PaymentTransactionInformation29.mmReversalReasonInformation, PaymentTransaction33.mmTransactionStatus,
					PaymentTransaction43.mmTransactionStatus, PaymentTransactionInformation2.mmReturnReasonInformation, PaymentTransactionInformation27.mmReturnReasonInformation, PaymentTransaction41.mmTransactionStatus,
					PaymentTransaction49.mmTransactionStatus, OriginalPaymentInformation3.mmCancellationStatusReasonInformation, PaymentTransaction39.mmTransactionCancellationStatus, PaymentTransaction40.mmTransactionCancellationStatus,
					PaymentTransactionInformation13.mmReturnReasonInformation, PaymentTransactionInformation18.mmReturnReasonInformation, PaymentTransactionInformation14.mmReversalReasonInformation,
					PaymentTransactionInformation20.mmReversalReasonInformation, PaymentTransactionInformation16.mmReturnReasonInformation, PaymentTransactionInformation23.mmReturnReasonInformation,
					PaymentTransactionInformation17.mmReversalReasonInformation, PaymentTransactionInformation24.mmReversalReasonInformation, PaymentTransactionInformation21.mmReturnReasonInformation,
					IntraBalanceMovement1.mmStatusAndReason, IntraBalanceMovements1.mmStatusAndReason, IntraBalancePending2.mmStatusAndReason, IntraBalancePending1.mmStatusAndReason, PaymentCommon2.mmCommonStatus,
					PaymentInstruction14.mmStatus, PaymentTransaction52.mmTransactionStatus, PaymentTransaction54.mmTransactionCancellationStatus, PaymentTransaction53.mmTransactionCancellationStatus,
					PaymentTransaction57.mmTransactionStatus, EntryTransaction7.mmReturnInformation, PaymentTransaction59.mmTransactionStatus, PaymentTransaction63.mmTransactionStatus, PaymentTransaction68.mmTransactionStatus,
					PaymentTransaction66.mmTransactionCancellationStatus, PaymentTransaction67.mmTransactionCancellationStatus, EntryTransaction8.mmReturnInformation, PaymentTransaction69.mmTransactionStatus,
					PaymentTransaction80.mmTransactionStatus, PaymentTransaction78.mmTransactionCancellationStatus, PaymentTransaction83.mmTransactionStatus, PaymentTransaction82.mmTransactionStatus,
					PaymentTransaction79.mmTransactionCancellationStatus);
			elementContext_lazy = () -> com.tools20022.repository.entity.Payment.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PaymentStatus";
			definition = "Specifies the status of a payment at a specified time.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentStatus.mmPayment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PaymentStatus.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.PaymentPartyRole> partyRole;
	/**
	 * Specifies each role linked to a payment and played by a party at that
	 * step in a payment flow.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentPartyRole#mmPayment
	 * PaymentPartyRole.mmPayment}</li>
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
	 * {@linkplain com.tools20022.repository.msg.PaymentDetails5#mmPaymentTransactionParty
	 * PaymentDetails5.mmPaymentTransactionParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentDetails6#mmPaymentTransactionParty
	 * PaymentDetails6.mmPaymentTransactionParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentDetails7#mmPaymentTransactionParty
	 * PaymentDetails7.mmPaymentTransactionParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction1#mmParties
	 * PaymentInstruction1.mmParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails3#mmCashParties
	 * SecuritiesSettlementTransactionDetails3.mmCashParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails4#mmCashParties
	 * SecuritiesSettlementTransactionDetails4.mmCashParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails2#mmCashParties
	 * SecuritiesSettlementTransactionDetails2.mmCashParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails5#mmCashParties
	 * SecuritiesSettlementTransactionDetails5.mmCashParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails6#mmCashParties
	 * SecuritiesSettlementTransactionDetails6.mmCashParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails7#mmCashParties
	 * SecuritiesSettlementTransactionDetails7.mmCashParties}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption2#mmCashParties
	 * CashOption2.mmCashParties}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption9#mmCashParties
	 * CashOption9.mmCashParties}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption12#mmCashParties
	 * CashOption12.mmCashParties}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption13#mmCashParties
	 * CashOption13.mmCashParties}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption18#mmCashParties
	 * CashOption18.mmCashParties}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption22#mmCashParties
	 * CashOption22.mmCashParties}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption26#mmCashParties
	 * CashOption26.mmCashParties}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption27#mmCashParties
	 * CashOption27.mmCashParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails8#mmCashParties
	 * SecuritiesSettlementTransactionDetails8.mmCashParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails9#mmCashParties
	 * SecuritiesSettlementTransactionDetails9.mmCashParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails10#mmCashParties
	 * SecuritiesSettlementTransactionDetails10.mmCashParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails11#mmCashParties
	 * SecuritiesSettlementTransactionDetails11.mmCashParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails12#mmCashParties
	 * SecuritiesSettlementTransactionDetails12.mmCashParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails13#mmCashParties
	 * SecuritiesSettlementTransactionDetails13.mmCashParties}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order3#mmCashParties
	 * Order3.mmCashParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction1#mmRelatedParties
	 * EntryTransaction1.mmRelatedParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction1#mmRelatedAgents
	 * EntryTransaction1.mmRelatedAgents}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction2#mmRelatedParties
	 * EntryTransaction2.mmRelatedParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction2#mmRelatedAgents
	 * EntryTransaction2.mmRelatedAgents}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction3#mmRelatedParties
	 * EntryTransaction3.mmRelatedParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction3#mmRelatedAgents
	 * EntryTransaction3.mmRelatedAgents}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction4#mmRelatedParties
	 * EntryTransaction4.mmRelatedParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction4#mmRelatedAgents
	 * EntryTransaction4.mmRelatedAgents}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrderStatusAndReason5#mmCashParties
	 * OrderStatusAndReason5.mmCashParties}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order9#mmCashParties
	 * Order9.mmCashParties}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.MassQuote1#mmCashParties
	 * MassQuote1.mmCashParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndicationOfInterest1#mmCashParties
	 * IndicationOfInterest1.mmCashParties}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order6#mmCashParties
	 * Order6.mmCashParties}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order11#mmCashParties
	 * Order11.mmCashParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction14#mmParties
	 * PaymentInstruction14.mmParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails16#mmCashParties
	 * SecuritiesSettlementTransactionDetails16.mmCashParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails14#mmCashParties
	 * SecuritiesSettlementTransactionDetails14.mmCashParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails15#mmCashParties
	 * SecuritiesSettlementTransactionDetails15.mmCashParties}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption30#mmCashParties
	 * CashOption30.mmCashParties}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption38#mmCashParties
	 * CashOption38.mmCashParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails17#mmCashParties
	 * SecuritiesSettlementTransactionDetails17.mmCashParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails18#mmCashParties
	 * SecuritiesSettlementTransactionDetails18.mmCashParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails19#mmCashParties
	 * SecuritiesSettlementTransactionDetails19.mmCashParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction7#mmRelatedParties
	 * EntryTransaction7.mmRelatedParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction7#mmRelatedAgents
	 * EntryTransaction7.mmRelatedAgents}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption39#mmCashParties
	 * CashOption39.mmCashParties}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption41#mmCashParties
	 * CashOption41.mmCashParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails21#mmCashParties
	 * SecuritiesSettlementTransactionDetails21.mmCashParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails22#mmCashParties
	 * SecuritiesSettlementTransactionDetails22.mmCashParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails20#mmCashParties
	 * SecuritiesSettlementTransactionDetails20.mmCashParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction8#mmRelatedParties
	 * EntryTransaction8.mmRelatedParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction8#mmRelatedAgents
	 * EntryTransaction8.mmRelatedAgents}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption44#mmCashParties
	 * CashOption44.mmCashParties}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption46#mmCashParties
	 * CashOption46.mmCashParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails23#mmCashParties
	 * SecuritiesSettlementTransactionDetails23.mmCashParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails25#mmCashParties
	 * SecuritiesSettlementTransactionDetails25.mmCashParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails24#mmCashParties
	 * SecuritiesSettlementTransactionDetails24.mmCashParties}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption52#mmCashParties
	 * CashOption52.mmCashParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails27#mmCashParties
	 * SecuritiesSettlementTransactionDetails27.mmCashParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails28#mmCashParties
	 * SecuritiesSettlementTransactionDetails28.mmCashParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails26#mmCashParties
	 * SecuritiesSettlementTransactionDetails26.mmCashParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails30#mmCashParties
	 * SecuritiesSettlementTransactionDetails30.mmCashParties}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption55#mmCashParties
	 * CashOption55.mmCashParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails29#mmCashParties
	 * SecuritiesSettlementTransactionDetails29.mmCashParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails31#mmCashParties
	 * SecuritiesSettlementTransactionDetails31.mmCashParties}</li>
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
	public static final MMBusinessAssociationEnd mmPartyRole = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(PaymentDetails5.mmPaymentTransactionParty, PaymentDetails6.mmPaymentTransactionParty, PaymentDetails7.mmPaymentTransactionParty, PaymentInstruction1.mmParties,
					SecuritiesSettlementTransactionDetails3.mmCashParties, SecuritiesSettlementTransactionDetails4.mmCashParties, SecuritiesSettlementTransactionDetails2.mmCashParties, SecuritiesSettlementTransactionDetails5.mmCashParties,
					SecuritiesSettlementTransactionDetails6.mmCashParties, SecuritiesSettlementTransactionDetails7.mmCashParties, CashOption2.mmCashParties, CashOption9.mmCashParties, CashOption12.mmCashParties, CashOption13.mmCashParties,
					CashOption18.mmCashParties, CashOption22.mmCashParties, CashOption26.mmCashParties, CashOption27.mmCashParties, SecuritiesSettlementTransactionDetails8.mmCashParties,
					SecuritiesSettlementTransactionDetails9.mmCashParties, SecuritiesSettlementTransactionDetails10.mmCashParties, SecuritiesSettlementTransactionDetails11.mmCashParties,
					SecuritiesSettlementTransactionDetails12.mmCashParties, SecuritiesSettlementTransactionDetails13.mmCashParties, Order3.mmCashParties, EntryTransaction1.mmRelatedParties, EntryTransaction1.mmRelatedAgents,
					EntryTransaction2.mmRelatedParties, EntryTransaction2.mmRelatedAgents, EntryTransaction3.mmRelatedParties, EntryTransaction3.mmRelatedAgents, EntryTransaction4.mmRelatedParties, EntryTransaction4.mmRelatedAgents,
					OrderStatusAndReason5.mmCashParties, Order9.mmCashParties, MassQuote1.mmCashParties, IndicationOfInterest1.mmCashParties, Order6.mmCashParties, Order11.mmCashParties, PaymentInstruction14.mmParties,
					SecuritiesSettlementTransactionDetails16.mmCashParties, SecuritiesSettlementTransactionDetails14.mmCashParties, SecuritiesSettlementTransactionDetails15.mmCashParties, CashOption30.mmCashParties,
					CashOption38.mmCashParties, SecuritiesSettlementTransactionDetails17.mmCashParties, SecuritiesSettlementTransactionDetails18.mmCashParties, SecuritiesSettlementTransactionDetails19.mmCashParties,
					EntryTransaction7.mmRelatedParties, EntryTransaction7.mmRelatedAgents, CashOption39.mmCashParties, CashOption41.mmCashParties, SecuritiesSettlementTransactionDetails21.mmCashParties,
					SecuritiesSettlementTransactionDetails22.mmCashParties, SecuritiesSettlementTransactionDetails20.mmCashParties, EntryTransaction8.mmRelatedParties, EntryTransaction8.mmRelatedAgents, CashOption44.mmCashParties,
					CashOption46.mmCashParties, SecuritiesSettlementTransactionDetails23.mmCashParties, SecuritiesSettlementTransactionDetails25.mmCashParties, SecuritiesSettlementTransactionDetails24.mmCashParties,
					CashOption52.mmCashParties, SecuritiesSettlementTransactionDetails27.mmCashParties, SecuritiesSettlementTransactionDetails28.mmCashParties, SecuritiesSettlementTransactionDetails26.mmCashParties,
					SecuritiesSettlementTransactionDetails30.mmCashParties, CashOption55.mmCashParties, SecuritiesSettlementTransactionDetails29.mmCashParties, SecuritiesSettlementTransactionDetails31.mmCashParties);
			elementContext_lazy = () -> com.tools20022.repository.entity.Payment.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PartyRole";
			definition = "Specifies each role linked to a payment and played by a party at that step in a payment flow.";
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentPartyRole.mmPayment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PaymentPartyRole.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Tax> taxOnPayment;
	/**
	 * Payment levy tax.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmRelatedPaymentSettlement
	 * Tax.mmRelatedPaymentSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.EntryTransaction1#mmTax
	 * EntryTransaction1.mmTax}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.EntryTransaction2#mmTax
	 * EntryTransaction2.mmTax}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.EntryTransaction3#mmTax
	 * EntryTransaction3.mmTax}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.EntryTransaction4#mmTax
	 * EntryTransaction4.mmTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation1#mmTax
	 * CreditTransferTransactionInformation1.mmTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation10#mmTax
	 * CreditTransferTransactionInformation10.mmTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction1#mmTax
	 * CreditTransferTransaction1.mmTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction6#mmTax
	 * CreditTransferTransaction6.mmTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation1#mmTax
	 * DirectDebitTransactionInformation1.mmTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation9#mmTax
	 * DirectDebitTransactionInformation9.mmTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation11#mmTax
	 * DirectDebitTransactionInformation11.mmTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation13#mmTax
	 * DirectDebitTransactionInformation13.mmTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation14#mmTax
	 * CreditTransferTransactionInformation14.mmTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction5#mmTax
	 * CreditTransferTransaction5.mmTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction10#mmTax
	 * CreditTransferTransaction10.mmTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation10#mmTaxRemittance
	 * StructuredRemittanceInformation10.mmTaxRemittance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction19#mmTax
	 * CreditTransferTransaction19.mmTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation12#mmTaxRemittance
	 * StructuredRemittanceInformation12.mmTaxRemittance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction18#mmTax
	 * CreditTransferTransaction18.mmTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation18#mmTax
	 * DirectDebitTransactionInformation18.mmTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction20#mmTax
	 * CreditTransferTransaction20.mmTax}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.EntryTransaction7#mmTax
	 * EntryTransaction7.mmTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction21#mmTax
	 * CreditTransferTransaction21.mmTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction25#mmTax
	 * CreditTransferTransaction25.mmTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction24#mmTax
	 * CreditTransferTransaction24.mmTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction26#mmTax
	 * CreditTransferTransaction26.mmTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation13#mmTaxRemittance
	 * StructuredRemittanceInformation13.mmTaxRemittance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation19#mmTax
	 * DirectDebitTransactionInformation19.mmTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction22#mmTax
	 * CreditTransferTransaction22.mmTax}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.EntryTransaction8#mmTax
	 * EntryTransaction8.mmTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation22#mmTax
	 * DirectDebitTransactionInformation22.mmTax}</li>
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
	public static final MMBusinessAssociationEnd mmTaxOnPayment = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(EntryTransaction1.mmTax, EntryTransaction2.mmTax, EntryTransaction3.mmTax, EntryTransaction4.mmTax, CreditTransferTransactionInformation1.mmTax,
					CreditTransferTransactionInformation10.mmTax, CreditTransferTransaction1.mmTax, CreditTransferTransaction6.mmTax, DirectDebitTransactionInformation1.mmTax, DirectDebitTransactionInformation9.mmTax,
					DirectDebitTransactionInformation11.mmTax, DirectDebitTransactionInformation13.mmTax, CreditTransferTransactionInformation14.mmTax, CreditTransferTransaction5.mmTax, CreditTransferTransaction10.mmTax,
					StructuredRemittanceInformation10.mmTaxRemittance, CreditTransferTransaction19.mmTax, StructuredRemittanceInformation12.mmTaxRemittance, CreditTransferTransaction18.mmTax, DirectDebitTransactionInformation18.mmTax,
					CreditTransferTransaction20.mmTax, EntryTransaction7.mmTax, CreditTransferTransaction21.mmTax, CreditTransferTransaction25.mmTax, CreditTransferTransaction24.mmTax, CreditTransferTransaction26.mmTax,
					StructuredRemittanceInformation13.mmTaxRemittance, DirectDebitTransactionInformation19.mmTax, CreditTransferTransaction22.mmTax, EntryTransaction8.mmTax, DirectDebitTransactionInformation22.mmTax);
			elementContext_lazy = () -> com.tools20022.repository.entity.Payment.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TaxOnPayment";
			definition = "Payment levy tax.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Tax.mmRelatedPaymentSettlement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.PaymentExecution> paymentExecution;
	/**
	 * Describes the processes necessary to execute a payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentExecution#mmPayment
	 * PaymentExecution.mmPayment}</li>
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
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction1#mmRelatedDates
	 * EntryTransaction1.mmRelatedDates}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction2#mmRelatedDates
	 * EntryTransaction2.mmRelatedDates}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction3#mmRelatedDates
	 * EntryTransaction3.mmRelatedDates}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction4#mmRelatedDates
	 * EntryTransaction4.mmRelatedDates}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation1#mmPaymentTypeInformation
	 * DirectDebitTransactionInformation1.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation9#mmPaymentTypeInformation
	 * DirectDebitTransactionInformation9.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation11#mmPaymentTypeInformation
	 * DirectDebitTransactionInformation11.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation13#mmPaymentTypeInformation
	 * DirectDebitTransactionInformation13.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation2#mmPaymentTypeInformation
	 * DirectDebitTransactionInformation2.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation10#mmPaymentTypeInformation
	 * DirectDebitTransactionInformation10.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation12#mmPaymentTypeInformation
	 * DirectDebitTransactionInformation12.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation14#mmPaymentTypeInformation
	 * DirectDebitTransactionInformation14.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation31#mmOriginalGroupInformation
	 * PaymentTransactionInformation31.mmOriginalGroupInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction38#mmOriginalGroupInformation
	 * PaymentTransaction38.mmOriginalGroupInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction48#mmOriginalGroupInformation
	 * PaymentTransaction48.mmOriginalGroupInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation2#mmOriginalGroupInformation
	 * PaymentTransactionInformation2.mmOriginalGroupInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation27#mmOriginalGroupInformation
	 * PaymentTransactionInformation27.mmOriginalGroupInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction34#mmOriginalGroupInformation
	 * PaymentTransaction34.mmOriginalGroupInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction44#mmOriginalGroupInformation
	 * PaymentTransaction44.mmOriginalGroupInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification2#mmPaymentTypeInformation
	 * RequestedModification2.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation33#mmOriginalGroupInformation
	 * PaymentTransactionInformation33.mmOriginalGroupInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorrectiveTransaction1Choice#mmInitiation
	 * CorrectiveTransaction1Choice.mmInitiation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction40#mmOriginalGroupInformation
	 * PaymentTransaction40.mmOriginalGroupInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation15#mmPaymentTypeInformation
	 * DirectDebitTransactionInformation15.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation13#mmOriginalGroupInformation
	 * PaymentTransactionInformation13.mmOriginalGroupInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation18#mmOriginalGroupInformation
	 * PaymentTransactionInformation18.mmOriginalGroupInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation16#mmOriginalGroupInformation
	 * PaymentTransactionInformation16.mmOriginalGroupInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation23#mmOriginalGroupInformation
	 * PaymentTransactionInformation23.mmOriginalGroupInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation21#mmOriginalGroupInformation
	 * PaymentTransactionInformation21.mmOriginalGroupInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation5#mmPaymentTypeInformation
	 * DirectDebitTransactionInformation5.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation7#mmPaymentTypeInformation
	 * DirectDebitTransactionInformation7.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation6#mmPaymentTypeInformation
	 * DirectDebitTransactionInformation6.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation8#mmPaymentTypeInformation
	 * DirectDebitTransactionInformation8.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction50#mmOriginalGroupInformation
	 * PaymentTransaction50.mmOriginalGroupInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation17#mmPaymentTypeInformation
	 * DirectDebitTransactionInformation17.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction51#mmOriginalGroupInformation
	 * PaymentTransaction51.mmOriginalGroupInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction53#mmOriginalGroupInformation
	 * PaymentTransaction53.mmOriginalGroupInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation18#mmPaymentTypeInformation
	 * DirectDebitTransactionInformation18.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction55#mmOriginalGroupInformation
	 * PaymentTransaction55.mmOriginalGroupInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction7#mmRelatedDates
	 * EntryTransaction7.mmRelatedDates}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyControlGroupStatus1#mmOriginalReferences
	 * CurrencyControlGroupStatus1.mmOriginalReferences}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction65#mmOriginalGroupInformation
	 * PaymentTransaction65.mmOriginalGroupInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation20#mmPaymentTypeInformation
	 * DirectDebitTransactionInformation20.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction60#mmOriginalGroupInformation
	 * PaymentTransaction60.mmOriginalGroupInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation19#mmPaymentTypeInformation
	 * DirectDebitTransactionInformation19.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction67#mmOriginalGroupInformation
	 * PaymentTransaction67.mmOriginalGroupInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction62#mmOriginalGroupInformation
	 * PaymentTransaction62.mmOriginalGroupInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction8#mmRelatedDates
	 * EntryTransaction8.mmRelatedDates}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation21#mmPaymentTypeInformation
	 * DirectDebitTransactionInformation21.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction81#mmOriginalGroupInformation
	 * PaymentTransaction81.mmOriginalGroupInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction76#mmOriginalGroupInformation
	 * PaymentTransaction76.mmOriginalGroupInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorrectiveTransaction2Choice#mmInitiation
	 * CorrectiveTransaction2Choice.mmInitiation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation22#mmPaymentTypeInformation
	 * DirectDebitTransactionInformation22.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction75#mmOriginalGroupInformation
	 * PaymentTransaction75.mmOriginalGroupInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction79#mmOriginalGroupInformation
	 * PaymentTransaction79.mmOriginalGroupInformation}</li>
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
	public static final MMBusinessAssociationEnd mmPaymentExecution = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(EntryTransaction1.mmRelatedDates, EntryTransaction2.mmRelatedDates, EntryTransaction3.mmRelatedDates, EntryTransaction4.mmRelatedDates,
					DirectDebitTransactionInformation1.mmPaymentTypeInformation, DirectDebitTransactionInformation9.mmPaymentTypeInformation, DirectDebitTransactionInformation11.mmPaymentTypeInformation,
					DirectDebitTransactionInformation13.mmPaymentTypeInformation, DirectDebitTransactionInformation2.mmPaymentTypeInformation, DirectDebitTransactionInformation10.mmPaymentTypeInformation,
					DirectDebitTransactionInformation12.mmPaymentTypeInformation, DirectDebitTransactionInformation14.mmPaymentTypeInformation, PaymentTransactionInformation31.mmOriginalGroupInformation,
					PaymentTransaction38.mmOriginalGroupInformation, PaymentTransaction48.mmOriginalGroupInformation, PaymentTransactionInformation2.mmOriginalGroupInformation, PaymentTransactionInformation27.mmOriginalGroupInformation,
					PaymentTransaction34.mmOriginalGroupInformation, PaymentTransaction44.mmOriginalGroupInformation, RequestedModification2.mmPaymentTypeInformation, PaymentTransactionInformation33.mmOriginalGroupInformation,
					CorrectiveTransaction1Choice.mmInitiation, PaymentTransaction40.mmOriginalGroupInformation, DirectDebitTransactionInformation15.mmPaymentTypeInformation, PaymentTransactionInformation13.mmOriginalGroupInformation,
					PaymentTransactionInformation18.mmOriginalGroupInformation, PaymentTransactionInformation16.mmOriginalGroupInformation, PaymentTransactionInformation23.mmOriginalGroupInformation,
					PaymentTransactionInformation21.mmOriginalGroupInformation, DirectDebitTransactionInformation5.mmPaymentTypeInformation, DirectDebitTransactionInformation7.mmPaymentTypeInformation,
					DirectDebitTransactionInformation6.mmPaymentTypeInformation, DirectDebitTransactionInformation8.mmPaymentTypeInformation, PaymentTransaction50.mmOriginalGroupInformation,
					DirectDebitTransactionInformation17.mmPaymentTypeInformation, PaymentTransaction51.mmOriginalGroupInformation, PaymentTransaction53.mmOriginalGroupInformation,
					DirectDebitTransactionInformation18.mmPaymentTypeInformation, PaymentTransaction55.mmOriginalGroupInformation, EntryTransaction7.mmRelatedDates, CurrencyControlGroupStatus1.mmOriginalReferences,
					PaymentTransaction65.mmOriginalGroupInformation, DirectDebitTransactionInformation20.mmPaymentTypeInformation, PaymentTransaction60.mmOriginalGroupInformation,
					DirectDebitTransactionInformation19.mmPaymentTypeInformation, PaymentTransaction67.mmOriginalGroupInformation, PaymentTransaction62.mmOriginalGroupInformation, EntryTransaction8.mmRelatedDates,
					DirectDebitTransactionInformation21.mmPaymentTypeInformation, PaymentTransaction81.mmOriginalGroupInformation, PaymentTransaction76.mmOriginalGroupInformation, CorrectiveTransaction2Choice.mmInitiation,
					DirectDebitTransactionInformation22.mmPaymentTypeInformation, PaymentTransaction75.mmOriginalGroupInformation, PaymentTransaction79.mmOriginalGroupInformation);
			elementContext_lazy = () -> com.tools20022.repository.entity.Payment.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PaymentExecution";
			definition = "Describes the processes necessary to execute a payment.";
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentExecution.mmPayment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PaymentExecution.mmObject();
		}
	};
	protected ISODate poolingAdjustmentDate;
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
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionInformation1#mmPoolingAdjustmentDate
	 * PaymentInstructionInformation1.mmPoolingAdjustmentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionInformation3#mmPoolingAdjustmentDate
	 * PaymentInstructionInformation3.mmPoolingAdjustmentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction6#mmPoolingAdjustmentDate
	 * PaymentInstruction6.mmPoolingAdjustmentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction9#mmPoolingAdjustmentDate
	 * PaymentInstruction9.mmPoolingAdjustmentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation2#mmPoolingAdjustmentDate
	 * CreditTransferTransactionInformation2.mmPoolingAdjustmentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation11#mmPoolingAdjustmentDate
	 * CreditTransferTransactionInformation11.mmPoolingAdjustmentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction2#mmPoolingAdjustmentDate
	 * CreditTransferTransaction2.mmPoolingAdjustmentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction7#mmPoolingAdjustmentDate
	 * CreditTransferTransaction7.mmPoolingAdjustmentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation7#mmPoolingAdjustmentDate
	 * CreditTransferTransactionInformation7.mmPoolingAdjustmentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation9#mmPoolingAdjustmentDate
	 * CreditTransferTransactionInformation9.mmPoolingAdjustmentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction16#mmPoolingAdjustmentDate
	 * PaymentInstruction16.mmPoolingAdjustmentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction19#mmPoolingAdjustmentDate
	 * CreditTransferTransaction19.mmPoolingAdjustmentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction25#mmPoolingAdjustmentDate
	 * CreditTransferTransaction25.mmPoolingAdjustmentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction20#mmPoolingAdjustmentDate
	 * PaymentInstruction20.mmPoolingAdjustmentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction22#mmPoolingAdjustmentDate
	 * PaymentInstruction22.mmPoolingAdjustmentDate}</li>
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
	public static final MMBusinessAttribute mmPoolingAdjustmentDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(PaymentInstructionInformation1.mmPoolingAdjustmentDate, PaymentInstructionInformation3.mmPoolingAdjustmentDate, PaymentInstruction6.mmPoolingAdjustmentDate,
					PaymentInstruction9.mmPoolingAdjustmentDate, CreditTransferTransactionInformation2.mmPoolingAdjustmentDate, CreditTransferTransactionInformation11.mmPoolingAdjustmentDate,
					CreditTransferTransaction2.mmPoolingAdjustmentDate, CreditTransferTransaction7.mmPoolingAdjustmentDate, CreditTransferTransactionInformation7.mmPoolingAdjustmentDate,
					CreditTransferTransactionInformation9.mmPoolingAdjustmentDate, PaymentInstruction16.mmPoolingAdjustmentDate, CreditTransferTransaction19.mmPoolingAdjustmentDate, CreditTransferTransaction25.mmPoolingAdjustmentDate,
					PaymentInstruction20.mmPoolingAdjustmentDate, PaymentInstruction22.mmPoolingAdjustmentDate);
			elementContext_lazy = () -> com.tools20022.repository.entity.Payment.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PoolingAdjustmentDate";
			definition = "Date used for the correction of the value date of a cash pool movement that has been posted with a different value date.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Payment.class.getMethod("getPoolingAdjustmentDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ImpliedCurrencyAndAmount equivalentAmount;
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
	 * <li>{@linkplain com.tools20022.repository.msg.EquivalentAmount#mmAmount
	 * EquivalentAmount.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AmountType1Choice#mmEquivalentAmount
	 * AmountType1Choice.mmEquivalentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AmountType2Choice#mmEquivalentAmount
	 * AmountType2Choice.mmEquivalentAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.EquivalentAmount2#mmAmount
	 * EquivalentAmount2.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AmountType3Choice#mmEquivalentAmount
	 * AmountType3Choice.mmEquivalentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AmountType4Choice#mmEquivalentAmount
	 * AmountType4Choice.mmEquivalentAmount}</li>
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
	public static final MMBusinessAttribute mmEquivalentAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.EquivalentAmount.mmAmount, AmountType1Choice.mmEquivalentAmount, AmountType2Choice.mmEquivalentAmount, EquivalentAmount2.mmAmount,
					AmountType3Choice.mmEquivalentAmount, AmountType4Choice.mmEquivalentAmount);
			elementContext_lazy = () -> com.tools20022.repository.entity.Payment.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EquivalentAmount";
			definition = "Amount of money to be transferred between debtor and creditor, before deduction of charges, expressed in the currency of the debtor's account, and to be transferred in a different currency.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Payment.class.getMethod("getEquivalentAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.CurrencyExchange> currencyExchange;
	/**
	 * Information on the exchange rate and amounts used in the payment
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmRelatedPayment
	 * CurrencyExchange.mmRelatedPayment}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation1#mmExchangeRateInformation
	 * CreditTransferTransactionInformation1.mmExchangeRateInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation10#mmExchangeRateInformation
	 * CreditTransferTransactionInformation10.mmExchangeRateInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction1#mmExchangeRateInformation
	 * CreditTransferTransaction1.mmExchangeRateInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction6#mmExchangeRateInformation
	 * CreditTransferTransaction6.mmExchangeRateInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation2#mmExchangeRate
	 * CreditTransferTransactionInformation2.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation11#mmExchangeRate
	 * CreditTransferTransactionInformation11.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction7#mmExchangeRate
	 * CreditTransferTransaction7.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeSettlement1#mmPaymentCurrencyExchange
	 * TradeSettlement1.mmPaymentCurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation7#mmExchangeRate
	 * CreditTransferTransactionInformation7.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation9#mmExchangeRate
	 * CreditTransferTransactionInformation9.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInformation6#mmExchangeRateInformation
	 * OriginalPaymentInformation6.mmExchangeRateInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorCurrencyConversionResponse1#mmCurrencyConversion
	 * AcceptorCurrencyConversionResponse1.mmCurrencyConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails12#mmCurrencyConversion
	 * CardPaymentTransactionDetails12.mmCurrencyConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction24#mmCurrencyConversion
	 * CardPaymentTransaction24.mmCurrencyConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails14#mmCurrencyConversion
	 * CardPaymentTransactionDetails14.mmCurrencyConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction33#mmCurrencyConversion
	 * CardPaymentTransaction33.mmCurrencyConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails15#mmCurrencyConversion
	 * CardPaymentTransactionDetails15.mmCurrencyConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction19#mmExchangeRate
	 * CreditTransferTransaction19.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction20#mmExchangeRateInformation
	 * CreditTransferTransaction20.mmExchangeRateInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorCurrencyConversionResponse2#mmCurrencyConversion
	 * AcceptorCurrencyConversionResponse2.mmCurrencyConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction39#mmCurrencyConversion
	 * CardPaymentTransaction39.mmCurrencyConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction50#mmCurrencyConversion
	 * CardPaymentTransaction50.mmCurrencyConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails23#mmCurrencyConversion
	 * CardPaymentTransactionDetails23.mmCurrencyConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails21#mmCurrencyConversion
	 * CardPaymentTransactionDetails21.mmCurrencyConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails19#mmCurrencyConversion
	 * CardPaymentTransactionDetails19.mmCurrencyConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMAccountStatement2#mmCurrency
	 * ATMAccountStatement2.mmCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction1#mmCurrencyConversion
	 * ATMTransaction1.mmCurrencyConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndCurrency1#mmCurrency
	 * AmountAndCurrency1.mmCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DetailedAmount12#mmCurrency
	 * DetailedAmount12.mmCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction2#mmCurrencyConversion
	 * ATMTransaction2.mmCurrencyConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction7#mmCurrencyConversion
	 * ATMTransaction7.mmCurrencyConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction7#mmCurrencyExchange
	 * ATMTransaction7.mmCurrencyExchange}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ATMTransaction8#mmCurrency
	 * ATMTransaction8.mmCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction3#mmCurrencyConversion
	 * ATMTransaction3.mmCurrencyConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DetailedAmount13#mmCurrency
	 * DetailedAmount13.mmCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction25#mmExchangeRate
	 * CreditTransferTransaction25.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction26#mmExchangeRateInformation
	 * CreditTransferTransaction26.mmExchangeRateInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorCurrencyConversionResponse3#mmCurrencyConversionResult
	 * AcceptorCurrencyConversionResponse3.mmCurrencyConversionResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction65#mmCurrencyConversion
	 * CardPaymentTransaction65.mmCurrencyConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails29#mmCurrencyConversionResult
	 * CardPaymentTransactionDetails29.mmCurrencyConversionResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails30#mmCurrencyConversionResult
	 * CardPaymentTransactionDetails30.mmCurrencyConversionResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails27#mmCurrencyConversionResult
	 * CardPaymentTransactionDetails27.mmCurrencyConversionResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction54#mmCurrencyConversionEligibility
	 * CardPaymentTransaction54.mmCurrencyConversionEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction14#mmCurrencyConversionEligibility
	 * ATMTransaction14.mmCurrencyConversionEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction17#mmCurrencyConversionResult
	 * ATMTransaction17.mmCurrencyConversionResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DetailedAmount18#mmCurrency
	 * DetailedAmount18.mmCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction13#mmCurrencyConversionResult
	 * ATMTransaction13.mmCurrencyConversionResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DetailedAmount16#mmCurrency
	 * DetailedAmount16.mmCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction21#mmCurrencyConversion
	 * ATMTransaction21.mmCurrencyConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction21#mmCurrencyExchange
	 * ATMTransaction21.mmCurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DetailedAmount17#mmCurrency
	 * DetailedAmount17.mmCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInformation7#mmExchangeRateInformation
	 * OriginalPaymentInformation7.mmExchangeRateInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorCurrencyConversionResponse4#mmCurrencyConversionResult
	 * AcceptorCurrencyConversionResponse4.mmCurrencyConversionResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails38#mmCurrencyConversionResult
	 * CardPaymentTransactionDetails38.mmCurrencyConversionResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails41#mmCurrencyConversionResult
	 * CardPaymentTransactionDetails41.mmCurrencyConversionResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction67#mmCurrencyConversionEligibility
	 * CardPaymentTransaction67.mmCurrencyConversionEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction73#mmCurrencyConversion
	 * CardPaymentTransaction73.mmCurrencyConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails37#mmCurrencyConversionResult
	 * CardPaymentTransactionDetails37.mmCurrencyConversionResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorCurrencyConversionAdvice1#mmCurrencyConversionResult
	 * AcceptorCurrencyConversionAdvice1.mmCurrencyConversionResult}</li>
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
	public static final MMBusinessAssociationEnd mmCurrencyExchange = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(CreditTransferTransactionInformation1.mmExchangeRateInformation, CreditTransferTransactionInformation10.mmExchangeRateInformation, CreditTransferTransaction1.mmExchangeRateInformation,
					CreditTransferTransaction6.mmExchangeRateInformation, CreditTransferTransactionInformation2.mmExchangeRate, CreditTransferTransactionInformation11.mmExchangeRate, CreditTransferTransaction7.mmExchangeRate,
					TradeSettlement1.mmPaymentCurrencyExchange, CreditTransferTransactionInformation7.mmExchangeRate, CreditTransferTransactionInformation9.mmExchangeRate, OriginalPaymentInformation6.mmExchangeRateInformation,
					AcceptorCurrencyConversionResponse1.mmCurrencyConversion, CardPaymentTransactionDetails12.mmCurrencyConversion, CardPaymentTransaction24.mmCurrencyConversion, CardPaymentTransactionDetails14.mmCurrencyConversion,
					CardPaymentTransaction33.mmCurrencyConversion, CardPaymentTransactionDetails15.mmCurrencyConversion, CreditTransferTransaction19.mmExchangeRate, CreditTransferTransaction20.mmExchangeRateInformation,
					AcceptorCurrencyConversionResponse2.mmCurrencyConversion, CardPaymentTransaction39.mmCurrencyConversion, CardPaymentTransaction50.mmCurrencyConversion, CardPaymentTransactionDetails23.mmCurrencyConversion,
					CardPaymentTransactionDetails21.mmCurrencyConversion, CardPaymentTransactionDetails19.mmCurrencyConversion, ATMAccountStatement2.mmCurrency, ATMTransaction1.mmCurrencyConversion, AmountAndCurrency1.mmCurrency,
					DetailedAmount12.mmCurrency, ATMTransaction2.mmCurrencyConversion, ATMTransaction7.mmCurrencyConversion, ATMTransaction7.mmCurrencyExchange, ATMTransaction8.mmCurrency, ATMTransaction3.mmCurrencyConversion,
					DetailedAmount13.mmCurrency, CreditTransferTransaction25.mmExchangeRate, CreditTransferTransaction26.mmExchangeRateInformation, AcceptorCurrencyConversionResponse3.mmCurrencyConversionResult,
					CardPaymentTransaction65.mmCurrencyConversion, CardPaymentTransactionDetails29.mmCurrencyConversionResult, CardPaymentTransactionDetails30.mmCurrencyConversionResult,
					CardPaymentTransactionDetails27.mmCurrencyConversionResult, CardPaymentTransaction54.mmCurrencyConversionEligibility, ATMTransaction14.mmCurrencyConversionEligibility, ATMTransaction17.mmCurrencyConversionResult,
					DetailedAmount18.mmCurrency, ATMTransaction13.mmCurrencyConversionResult, DetailedAmount16.mmCurrency, ATMTransaction21.mmCurrencyConversion, ATMTransaction21.mmCurrencyExchange, DetailedAmount17.mmCurrency,
					OriginalPaymentInformation7.mmExchangeRateInformation, AcceptorCurrencyConversionResponse4.mmCurrencyConversionResult, CardPaymentTransactionDetails38.mmCurrencyConversionResult,
					CardPaymentTransactionDetails41.mmCurrencyConversionResult, CardPaymentTransaction67.mmCurrencyConversionEligibility, CardPaymentTransaction73.mmCurrencyConversion,
					CardPaymentTransactionDetails37.mmCurrencyConversionResult, AcceptorCurrencyConversionAdvice1.mmCurrencyConversionResult);
			elementContext_lazy = () -> com.tools20022.repository.entity.Payment.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CurrencyExchange";
			definition = "Information on the exchange rate and amounts used in the payment";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmRelatedPayment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmObject();
		}
	};
	protected InstructionCode instructionForCreditorAgent;
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
	 * {@linkplain com.tools20022.repository.msg.InstructionForCreditorAgent1#mmCode
	 * InstructionForCreditorAgent1.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation1#mmInstructionForCreditorAgent
	 * CreditTransferTransactionInformation1.mmInstructionForCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation10#mmInstructionForCreditorAgent
	 * CreditTransferTransactionInformation10.mmInstructionForCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction1#mmInstructionForCreditorAgent
	 * CreditTransferTransaction1.mmInstructionForCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction6#mmInstructionForCreditorAgent
	 * CreditTransferTransaction6.mmInstructionForCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation1#mmInstructionForCreditorAgent
	 * DirectDebitTransactionInformation1.mmInstructionForCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation9#mmInstructionForCreditorAgent
	 * DirectDebitTransactionInformation9.mmInstructionForCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation11#mmInstructionForCreditorAgent
	 * DirectDebitTransactionInformation11.mmInstructionForCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation13#mmInstructionForCreditorAgent
	 * DirectDebitTransactionInformation13.mmInstructionForCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation2#mmInstructionForCreditorAgent
	 * CreditTransferTransactionInformation2.mmInstructionForCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation11#mmInstructionForCreditorAgent
	 * CreditTransferTransactionInformation11.mmInstructionForCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction2#mmInstructionForCreditorAgent
	 * CreditTransferTransaction2.mmInstructionForCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction7#mmInstructionForCreditorAgent
	 * CreditTransferTransaction7.mmInstructionForCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructionForCreditorAgent2#mmCode
	 * InstructionForCreditorAgent2.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation3#mmInstructionForCreditorAgent
	 * CreditTransferTransactionInformation3.mmInstructionForCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation13#mmInstructionForCreditorAgent
	 * CreditTransferTransactionInformation13.mmInstructionForCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction4#mmInstructionForCreditorAgent
	 * CreditTransferTransaction4.mmInstructionForCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction8#mmInstructionForCreditorAgent
	 * CreditTransferTransaction8.mmInstructionForCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation14#mmInstructionForCreditorAgent
	 * CreditTransferTransactionInformation14.mmInstructionForCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction5#mmInstructionForCreditorAgent
	 * CreditTransferTransaction5.mmInstructionForCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction10#mmInstructionForCreditorAgent
	 * CreditTransferTransaction10.mmInstructionForCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructionForFinalAgent#mmCode
	 * InstructionForFinalAgent.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructionForFinalAgent#mmProprietary
	 * InstructionForFinalAgent.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification#mmInstructionForFinalAgent
	 * RequestedModification.mmInstructionForFinalAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification2#mmInstructionForCreditorAgent
	 * RequestedModification2.mmInstructionForCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation2#mmInstructionForCreditorAgent
	 * PaymentComplementaryInformation2.mmInstructionForCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation3#mmInstructionForCreditorAgent
	 * PaymentComplementaryInformation3.mmInstructionForCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification3#mmInstructionForCreditorAgent
	 * RequestedModification3.mmInstructionForCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction9#mmInstructionForCreditorAgent
	 * CreditTransferTransaction9.mmInstructionForCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation7#mmInstructionForCreditorAgent
	 * CreditTransferTransactionInformation7.mmInstructionForCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation9#mmInstructionForCreditorAgent
	 * CreditTransferTransactionInformation9.mmInstructionForCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation4#mmInstructionForCreditorAgent
	 * PaymentComplementaryInformation4.mmInstructionForCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction17#mmInstructionForCreditorAgent
	 * CreditTransferTransaction17.mmInstructionForCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction19#mmInstructionForCreditorAgent
	 * CreditTransferTransaction19.mmInstructionForCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification4#mmInstructionForCreditorAgent
	 * RequestedModification4.mmInstructionForCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction18#mmInstructionForCreditorAgent
	 * CreditTransferTransaction18.mmInstructionForCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation18#mmInstructionForCreditorAgent
	 * DirectDebitTransactionInformation18.mmInstructionForCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction20#mmInstructionForCreditorAgent
	 * CreditTransferTransaction20.mmInstructionForCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction21#mmInstructionForCreditorAgent
	 * CreditTransferTransaction21.mmInstructionForCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction23#mmInstructionForCreditorAgent
	 * CreditTransferTransaction23.mmInstructionForCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification5#mmInstructionForCreditorAgent
	 * RequestedModification5.mmInstructionForCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction25#mmInstructionForCreditorAgent
	 * CreditTransferTransaction25.mmInstructionForCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation5#mmInstructionForCreditorAgent
	 * PaymentComplementaryInformation5.mmInstructionForCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction24#mmInstructionForCreditorAgent
	 * CreditTransferTransaction24.mmInstructionForCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction26#mmInstructionForCreditorAgent
	 * CreditTransferTransaction26.mmInstructionForCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation19#mmInstructionForCreditorAgent
	 * DirectDebitTransactionInformation19.mmInstructionForCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction22#mmInstructionForCreditorAgent
	 * CreditTransferTransaction22.mmInstructionForCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification6#mmInstructionForCreditorAgent
	 * RequestedModification6.mmInstructionForCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation22#mmInstructionForCreditorAgent
	 * DirectDebitTransactionInformation22.mmInstructionForCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation6#mmInstructionForCreditorAgent
	 * PaymentComplementaryInformation6.mmInstructionForCreditorAgent}</li>
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
	public static final MMBusinessAttribute mmInstructionForCreditorAgent = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(InstructionForCreditorAgent1.mmCode, CreditTransferTransactionInformation1.mmInstructionForCreditorAgent, CreditTransferTransactionInformation10.mmInstructionForCreditorAgent,
					CreditTransferTransaction1.mmInstructionForCreditorAgent, CreditTransferTransaction6.mmInstructionForCreditorAgent, DirectDebitTransactionInformation1.mmInstructionForCreditorAgent,
					DirectDebitTransactionInformation9.mmInstructionForCreditorAgent, DirectDebitTransactionInformation11.mmInstructionForCreditorAgent, DirectDebitTransactionInformation13.mmInstructionForCreditorAgent,
					CreditTransferTransactionInformation2.mmInstructionForCreditorAgent, CreditTransferTransactionInformation11.mmInstructionForCreditorAgent, CreditTransferTransaction2.mmInstructionForCreditorAgent,
					CreditTransferTransaction7.mmInstructionForCreditorAgent, InstructionForCreditorAgent2.mmCode, CreditTransferTransactionInformation3.mmInstructionForCreditorAgent,
					CreditTransferTransactionInformation13.mmInstructionForCreditorAgent, CreditTransferTransaction4.mmInstructionForCreditorAgent, CreditTransferTransaction8.mmInstructionForCreditorAgent,
					CreditTransferTransactionInformation14.mmInstructionForCreditorAgent, CreditTransferTransaction5.mmInstructionForCreditorAgent, CreditTransferTransaction10.mmInstructionForCreditorAgent, InstructionForFinalAgent.mmCode,
					InstructionForFinalAgent.mmProprietary, RequestedModification.mmInstructionForFinalAgent, RequestedModification2.mmInstructionForCreditorAgent, PaymentComplementaryInformation2.mmInstructionForCreditorAgent,
					PaymentComplementaryInformation3.mmInstructionForCreditorAgent, RequestedModification3.mmInstructionForCreditorAgent, CreditTransferTransaction9.mmInstructionForCreditorAgent,
					CreditTransferTransactionInformation7.mmInstructionForCreditorAgent, CreditTransferTransactionInformation9.mmInstructionForCreditorAgent, PaymentComplementaryInformation4.mmInstructionForCreditorAgent,
					CreditTransferTransaction17.mmInstructionForCreditorAgent, CreditTransferTransaction19.mmInstructionForCreditorAgent, RequestedModification4.mmInstructionForCreditorAgent,
					CreditTransferTransaction18.mmInstructionForCreditorAgent, DirectDebitTransactionInformation18.mmInstructionForCreditorAgent, CreditTransferTransaction20.mmInstructionForCreditorAgent,
					CreditTransferTransaction21.mmInstructionForCreditorAgent, CreditTransferTransaction23.mmInstructionForCreditorAgent, RequestedModification5.mmInstructionForCreditorAgent,
					CreditTransferTransaction25.mmInstructionForCreditorAgent, PaymentComplementaryInformation5.mmInstructionForCreditorAgent, CreditTransferTransaction24.mmInstructionForCreditorAgent,
					CreditTransferTransaction26.mmInstructionForCreditorAgent, DirectDebitTransactionInformation19.mmInstructionForCreditorAgent, CreditTransferTransaction22.mmInstructionForCreditorAgent,
					RequestedModification6.mmInstructionForCreditorAgent, DirectDebitTransactionInformation22.mmInstructionForCreditorAgent, PaymentComplementaryInformation6.mmInstructionForCreditorAgent);
			elementContext_lazy = () -> com.tools20022.repository.entity.Payment.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InstructionForCreditorAgent";
			definition = "Further information related to the processing of the payment instruction that may need to be acted upon by the creditor agent. \nUsage: The instruction can relate to a level of service, can be an instruction to be executed by the creditor's agent, or can be information required by the creditor's agent to process the instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> InstructionCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Payment.class.getMethod("getInstructionForCreditorAgent", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected InstructionCode instructionForDebtorAgent;
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
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation1#mmInstructionForDebtorAgent
	 * CreditTransferTransactionInformation1.mmInstructionForDebtorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation10#mmInstructionForDebtorAgent
	 * CreditTransferTransactionInformation10.mmInstructionForDebtorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction1#mmInstructionForDebtorAgent
	 * CreditTransferTransaction1.mmInstructionForDebtorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction6#mmInstructionForDebtorAgent
	 * PaymentInstruction6.mmInstructionForDebtorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction6#mmInstructionForDebtorAgent
	 * CreditTransferTransaction6.mmInstructionForDebtorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction9#mmInstructionForDebtorAgent
	 * PaymentInstruction9.mmInstructionForDebtorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification2#mmInstructionForDebtorAgent
	 * RequestedModification2.mmInstructionForDebtorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation2#mmInstructionForDebtorAgent
	 * PaymentComplementaryInformation2.mmInstructionForDebtorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation3#mmInstructionForDebtorAgent
	 * PaymentComplementaryInformation3.mmInstructionForDebtorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification3#mmInstructionForDebtorAgent
	 * RequestedModification3.mmInstructionForDebtorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation15#mmInstructionForDebtorAgent
	 * DirectDebitTransactionInformation15.mmInstructionForDebtorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction16#mmInstructionForDebtorAgent
	 * PaymentInstruction16.mmInstructionForDebtorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation4#mmInstructionForDebtorAgent
	 * PaymentComplementaryInformation4.mmInstructionForDebtorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification4#mmInstructionForDebtorAgent
	 * RequestedModification4.mmInstructionForDebtorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction20#mmInstructionForDebtorAgent
	 * CreditTransferTransaction20.mmInstructionForDebtorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification5#mmInstructionForDebtorAgent
	 * RequestedModification5.mmInstructionForDebtorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation5#mmInstructionForDebtorAgent
	 * PaymentComplementaryInformation5.mmInstructionForDebtorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction20#mmInstructionForDebtorAgent
	 * PaymentInstruction20.mmInstructionForDebtorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction26#mmInstructionForDebtorAgent
	 * CreditTransferTransaction26.mmInstructionForDebtorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification6#mmInstructionForDebtorAgent
	 * RequestedModification6.mmInstructionForDebtorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction22#mmInstructionForDebtorAgent
	 * PaymentInstruction22.mmInstructionForDebtorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation6#mmInstructionForDebtorAgent
	 * PaymentComplementaryInformation6.mmInstructionForDebtorAgent}</li>
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
	public static final MMBusinessAttribute mmInstructionForDebtorAgent = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays
					.asList(CreditTransferTransactionInformation1.mmInstructionForDebtorAgent, CreditTransferTransactionInformation10.mmInstructionForDebtorAgent, CreditTransferTransaction1.mmInstructionForDebtorAgent,
							PaymentInstruction6.mmInstructionForDebtorAgent, CreditTransferTransaction6.mmInstructionForDebtorAgent, PaymentInstruction9.mmInstructionForDebtorAgent, RequestedModification2.mmInstructionForDebtorAgent,
							PaymentComplementaryInformation2.mmInstructionForDebtorAgent, PaymentComplementaryInformation3.mmInstructionForDebtorAgent, RequestedModification3.mmInstructionForDebtorAgent,
							DirectDebitTransactionInformation15.mmInstructionForDebtorAgent, PaymentInstruction16.mmInstructionForDebtorAgent, PaymentComplementaryInformation4.mmInstructionForDebtorAgent,
							RequestedModification4.mmInstructionForDebtorAgent, CreditTransferTransaction20.mmInstructionForDebtorAgent, RequestedModification5.mmInstructionForDebtorAgent,
							PaymentComplementaryInformation5.mmInstructionForDebtorAgent, PaymentInstruction20.mmInstructionForDebtorAgent, CreditTransferTransaction26.mmInstructionForDebtorAgent,
							RequestedModification6.mmInstructionForDebtorAgent, PaymentInstruction22.mmInstructionForDebtorAgent, PaymentComplementaryInformation6.mmInstructionForDebtorAgent);
			elementContext_lazy = () -> com.tools20022.repository.entity.Payment.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InstructionForDebtorAgent";
			definition = "Further information related to the processing of the payment instruction that may need to be acted upon by the debtor's agent.  \nUsage: The instruction can relate to a level of service, can be an instruction to be executed by the debtor's agent, or can be information required by the debtor's agent to process the instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> InstructionCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Payment.class.getMethod("getInstructionForDebtorAgent", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.PaymentIdentification> paymentRelatedIdentifications;
	/**
	 * Identifications provided to identify a payment at different processing
	 * levels.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentIdentification#mmPayment
	 * PaymentIdentification.mmPayment}</li>
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
	 * {@linkplain com.tools20022.repository.msg.TransactionReportDetails3#mmInstructionReference
	 * TransactionReportDetails3.mmInstructionReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionReportDetails4#mmInstructionReference
	 * TransactionReportDetails4.mmInstructionReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionReportDetails5#mmInstructionReference
	 * TransactionReportDetails5.mmInstructionReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation1#mmPaymentIdentification
	 * CreditTransferTransactionInformation1.mmPaymentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation10#mmPaymentIdentification
	 * CreditTransferTransactionInformation10.mmPaymentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction1#mmPaymentIdentification
	 * CreditTransferTransaction1.mmPaymentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction6#mmPaymentIdentification
	 * CreditTransferTransaction6.mmPaymentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation1#mmPaymentIdentification
	 * DirectDebitTransactionInformation1.mmPaymentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation9#mmPaymentIdentification
	 * DirectDebitTransactionInformation9.mmPaymentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation11#mmPaymentIdentification
	 * DirectDebitTransactionInformation11.mmPaymentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation13#mmPaymentIdentification
	 * DirectDebitTransactionInformation13.mmPaymentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation2#mmPaymentIdentification
	 * CreditTransferTransactionInformation2.mmPaymentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation11#mmPaymentIdentification
	 * CreditTransferTransactionInformation11.mmPaymentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction2#mmPaymentIdentification
	 * CreditTransferTransaction2.mmPaymentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction7#mmPaymentIdentification
	 * CreditTransferTransaction7.mmPaymentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation2#mmPaymentIdentification
	 * DirectDebitTransactionInformation2.mmPaymentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation10#mmPaymentIdentification
	 * DirectDebitTransactionInformation10.mmPaymentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation12#mmPaymentIdentification
	 * DirectDebitTransactionInformation12.mmPaymentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation14#mmPaymentIdentification
	 * DirectDebitTransactionInformation14.mmPaymentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation3#mmPaymentIdentification
	 * CreditTransferTransactionInformation3.mmPaymentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation13#mmPaymentIdentification
	 * CreditTransferTransactionInformation13.mmPaymentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction4#mmPaymentIdentification
	 * CreditTransferTransaction4.mmPaymentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction8#mmPaymentIdentification
	 * CreditTransferTransaction8.mmPaymentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation14#mmPaymentIdentification
	 * CreditTransferTransactionInformation14.mmPaymentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction5#mmPaymentIdentification
	 * CreditTransferTransaction5.mmPaymentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction10#mmPaymentIdentification
	 * CreditTransferTransaction10.mmPaymentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation15#mmPaymentIdentification
	 * DirectDebitTransactionInformation15.mmPaymentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation6#mmPaymentIdentification
	 * CreditTransferTransactionInformation6.mmPaymentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation8#mmPaymentIdentification
	 * CreditTransferTransactionInformation8.mmPaymentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation7#mmPaymentIdentification
	 * CreditTransferTransactionInformation7.mmPaymentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation9#mmPaymentIdentification
	 * CreditTransferTransactionInformation9.mmPaymentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation5#mmPaymentIdentification
	 * DirectDebitTransactionInformation5.mmPaymentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation7#mmPaymentIdentification
	 * DirectDebitTransactionInformation7.mmPaymentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation6#mmPaymentIdentification
	 * DirectDebitTransactionInformation6.mmPaymentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation8#mmPaymentIdentification
	 * DirectDebitTransactionInformation8.mmPaymentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInformation6#mmReferences
	 * OriginalPaymentInformation6.mmReferences}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RemittanceLocation3#mmReferences
	 * RemittanceLocation3.mmReferences}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction17#mmPaymentIdentification
	 * CreditTransferTransaction17.mmPaymentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction19#mmPaymentIdentification
	 * CreditTransferTransaction19.mmPaymentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation17#mmPaymentIdentification
	 * DirectDebitTransactionInformation17.mmPaymentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation18#mmPaymentIdentification
	 * DirectDebitTransactionInformation18.mmPaymentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction20#mmPaymentIdentification
	 * CreditTransferTransaction20.mmPaymentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction21#mmPaymentIdentification
	 * CreditTransferTransaction21.mmPaymentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReconciliationList1#mmPaymentReference
	 * ReconciliationList1.mmPaymentReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction23#mmPaymentIdentification
	 * CreditTransferTransaction23.mmPaymentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction25#mmPaymentIdentification
	 * CreditTransferTransaction25.mmPaymentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation20#mmPaymentIdentification
	 * DirectDebitTransactionInformation20.mmPaymentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction26#mmPaymentIdentification
	 * CreditTransferTransaction26.mmPaymentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation19#mmPaymentIdentification
	 * DirectDebitTransactionInformation19.mmPaymentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction22#mmPaymentIdentification
	 * CreditTransferTransaction22.mmPaymentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation21#mmPaymentIdentification
	 * DirectDebitTransactionInformation21.mmPaymentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInformation7#mmReferences
	 * OriginalPaymentInformation7.mmReferences}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation22#mmPaymentIdentification
	 * DirectDebitTransactionInformation22.mmPaymentIdentification}</li>
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
	public static final MMBusinessAssociationEnd mmPaymentRelatedIdentifications = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(TransactionReportDetails3.mmInstructionReference, TransactionReportDetails4.mmInstructionReference, TransactionReportDetails5.mmInstructionReference,
					CreditTransferTransactionInformation1.mmPaymentIdentification, CreditTransferTransactionInformation10.mmPaymentIdentification, CreditTransferTransaction1.mmPaymentIdentification,
					CreditTransferTransaction6.mmPaymentIdentification, DirectDebitTransactionInformation1.mmPaymentIdentification, DirectDebitTransactionInformation9.mmPaymentIdentification,
					DirectDebitTransactionInformation11.mmPaymentIdentification, DirectDebitTransactionInformation13.mmPaymentIdentification, CreditTransferTransactionInformation2.mmPaymentIdentification,
					CreditTransferTransactionInformation11.mmPaymentIdentification, CreditTransferTransaction2.mmPaymentIdentification, CreditTransferTransaction7.mmPaymentIdentification,
					DirectDebitTransactionInformation2.mmPaymentIdentification, DirectDebitTransactionInformation10.mmPaymentIdentification, DirectDebitTransactionInformation12.mmPaymentIdentification,
					DirectDebitTransactionInformation14.mmPaymentIdentification, CreditTransferTransactionInformation3.mmPaymentIdentification, CreditTransferTransactionInformation13.mmPaymentIdentification,
					CreditTransferTransaction4.mmPaymentIdentification, CreditTransferTransaction8.mmPaymentIdentification, CreditTransferTransactionInformation14.mmPaymentIdentification, CreditTransferTransaction5.mmPaymentIdentification,
					CreditTransferTransaction10.mmPaymentIdentification, DirectDebitTransactionInformation15.mmPaymentIdentification, CreditTransferTransactionInformation6.mmPaymentIdentification,
					CreditTransferTransactionInformation8.mmPaymentIdentification, CreditTransferTransactionInformation7.mmPaymentIdentification, CreditTransferTransactionInformation9.mmPaymentIdentification,
					DirectDebitTransactionInformation5.mmPaymentIdentification, DirectDebitTransactionInformation7.mmPaymentIdentification, DirectDebitTransactionInformation6.mmPaymentIdentification,
					DirectDebitTransactionInformation8.mmPaymentIdentification, OriginalPaymentInformation6.mmReferences, RemittanceLocation3.mmReferences, CreditTransferTransaction17.mmPaymentIdentification,
					CreditTransferTransaction19.mmPaymentIdentification, DirectDebitTransactionInformation17.mmPaymentIdentification, DirectDebitTransactionInformation18.mmPaymentIdentification,
					CreditTransferTransaction20.mmPaymentIdentification, CreditTransferTransaction21.mmPaymentIdentification, ReconciliationList1.mmPaymentReference, CreditTransferTransaction23.mmPaymentIdentification,
					CreditTransferTransaction25.mmPaymentIdentification, DirectDebitTransactionInformation20.mmPaymentIdentification, CreditTransferTransaction26.mmPaymentIdentification,
					DirectDebitTransactionInformation19.mmPaymentIdentification, CreditTransferTransaction22.mmPaymentIdentification, DirectDebitTransactionInformation21.mmPaymentIdentification, OriginalPaymentInformation7.mmReferences,
					DirectDebitTransactionInformation22.mmPaymentIdentification);
			elementContext_lazy = () -> com.tools20022.repository.entity.Payment.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PaymentRelatedIdentifications";
			definition = "Identifications provided to identify a payment at different processing levels.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentIdentification.mmPayment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PaymentIdentification.mmObject();
		}
	};
	protected PaymentInvestigationCase relatedInvestigationCase;
	/**
	 * Investigation case assigned to the payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCase#mmUnderlyingPayment
	 * PaymentInvestigationCase.mmUnderlyingPayment}</li>
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
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation30#mmCase
	 * PaymentTransactionInformation30.mmCase}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInformation4#mmCase
	 * OriginalPaymentInformation4.mmCase}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction37#mmCase
	 * PaymentTransaction37.mmCase}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction47#mmCase
	 * PaymentTransaction47.mmCase}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation31#mmCase
	 * PaymentTransactionInformation31.mmCase}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction38#mmCase
	 * PaymentTransaction38.mmCase}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction48#mmCase
	 * PaymentTransaction48.mmCase}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation32#mmResolvedCase
	 * PaymentTransactionInformation32.mmResolvedCase}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInformation3#mmResolvedCase
	 * OriginalPaymentInformation3.mmResolvedCase}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation33#mmResolvedCase
	 * PaymentTransactionInformation33.mmResolvedCase}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction39#mmResolvedCase
	 * PaymentTransaction39.mmResolvedCase}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction40#mmResolvedCase
	 * PaymentTransaction40.mmResolvedCase}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction58#mmCase
	 * PaymentTransaction58.mmCase}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction54#mmResolvedCase
	 * PaymentTransaction54.mmResolvedCase}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction53#mmResolvedCase
	 * PaymentTransaction53.mmResolvedCase}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction55#mmCase
	 * PaymentTransaction55.mmCase}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction61#mmCase
	 * PaymentTransaction61.mmCase}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction66#mmResolvedCase
	 * PaymentTransaction66.mmResolvedCase}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction67#mmResolvedCase
	 * PaymentTransaction67.mmResolvedCase}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction62#mmCase
	 * PaymentTransaction62.mmCase}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction78#mmResolvedCase
	 * PaymentTransaction78.mmResolvedCase}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction74#mmCase
	 * PaymentTransaction74.mmCase}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction75#mmCase
	 * PaymentTransaction75.mmCase}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction79#mmResolvedCase
	 * PaymentTransaction79.mmResolvedCase}</li>
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
	public static final MMBusinessAssociationEnd mmRelatedInvestigationCase = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(PaymentTransactionInformation30.mmCase, OriginalPaymentInformation4.mmCase, PaymentTransaction37.mmCase, PaymentTransaction47.mmCase, PaymentTransactionInformation31.mmCase,
					PaymentTransaction38.mmCase, PaymentTransaction48.mmCase, PaymentTransactionInformation32.mmResolvedCase, OriginalPaymentInformation3.mmResolvedCase, PaymentTransactionInformation33.mmResolvedCase,
					PaymentTransaction39.mmResolvedCase, PaymentTransaction40.mmResolvedCase, PaymentTransaction58.mmCase, PaymentTransaction54.mmResolvedCase, PaymentTransaction53.mmResolvedCase, PaymentTransaction55.mmCase,
					PaymentTransaction61.mmCase, PaymentTransaction66.mmResolvedCase, PaymentTransaction67.mmResolvedCase, PaymentTransaction62.mmCase, PaymentTransaction78.mmResolvedCase, PaymentTransaction74.mmCase,
					PaymentTransaction75.mmCase, PaymentTransaction79.mmResolvedCase);
			elementContext_lazy = () -> com.tools20022.repository.entity.Payment.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedInvestigationCase";
			definition = "Investigation case assigned to the payment.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentInvestigationCase.mmUnderlyingPayment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PaymentInvestigationCase.mmObject();
		}
	};
	protected SettlementTimeRequest settlementTimeRequest;
	/**
	 * Information on the requested settlement time of the instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SettlementTimeRequest#mmPayment
	 * SettlementTimeRequest.mmPayment}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation2#mmSettlementTimeRequest
	 * CreditTransferTransactionInformation2.mmSettlementTimeRequest}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation11#mmSettlementTimeRequest
	 * CreditTransferTransactionInformation11.mmSettlementTimeRequest}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction2#mmSettlementTimeRequest
	 * CreditTransferTransaction2.mmSettlementTimeRequest}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction7#mmSettlementTimeRequest
	 * CreditTransferTransaction7.mmSettlementTimeRequest}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation3#mmSettlementTimeRequest
	 * CreditTransferTransactionInformation3.mmSettlementTimeRequest}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation13#mmSettlementTimeRequest
	 * CreditTransferTransactionInformation13.mmSettlementTimeRequest}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction4#mmSettlementTimeRequest
	 * CreditTransferTransaction4.mmSettlementTimeRequest}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction8#mmSettlementTimeRequest
	 * CreditTransferTransaction8.mmSettlementTimeRequest}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation15#mmSettlementTimeRequest
	 * DirectDebitTransactionInformation15.mmSettlementTimeRequest}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation7#mmSettlementTimeRequest
	 * CreditTransferTransactionInformation7.mmSettlementTimeRequest}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation9#mmSettlementTimeRequest
	 * CreditTransferTransactionInformation9.mmSettlementTimeRequest}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction17#mmSettlementTimeRequest
	 * CreditTransferTransaction17.mmSettlementTimeRequest}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction19#mmSettlementTimeRequest
	 * CreditTransferTransaction19.mmSettlementTimeRequest}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction23#mmSettlementTimeRequest
	 * CreditTransferTransaction23.mmSettlementTimeRequest}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction25#mmSettlementTimeRequest
	 * CreditTransferTransaction25.mmSettlementTimeRequest}</li>
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
	public static final MMBusinessAssociationEnd mmSettlementTimeRequest = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(CreditTransferTransactionInformation2.mmSettlementTimeRequest, CreditTransferTransactionInformation11.mmSettlementTimeRequest, CreditTransferTransaction2.mmSettlementTimeRequest,
					CreditTransferTransaction7.mmSettlementTimeRequest, CreditTransferTransactionInformation3.mmSettlementTimeRequest, CreditTransferTransactionInformation13.mmSettlementTimeRequest,
					CreditTransferTransaction4.mmSettlementTimeRequest, CreditTransferTransaction8.mmSettlementTimeRequest, DirectDebitTransactionInformation15.mmSettlementTimeRequest,
					CreditTransferTransactionInformation7.mmSettlementTimeRequest, CreditTransferTransactionInformation9.mmSettlementTimeRequest, CreditTransferTransaction17.mmSettlementTimeRequest,
					CreditTransferTransaction19.mmSettlementTimeRequest, CreditTransferTransaction23.mmSettlementTimeRequest, CreditTransferTransaction25.mmSettlementTimeRequest);
			elementContext_lazy = () -> com.tools20022.repository.entity.Payment.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SettlementTimeRequest";
			definition = "Information on the requested settlement time of the instruction.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SettlementTimeRequest.mmPayment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SettlementTimeRequest.mmObject();
		}
	};
	protected CurrencyAndAmount amount;
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
	 * {@linkplain com.tools20022.repository.msg.CardAmountAndCurrencyExchange1#mmAmount
	 * CardAmountAndCurrencyExchange1.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference19#mmAmount
	 * OriginalTransactionReference19.mmAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashMovement1#mmAmount
	 * CashMovement1.mmAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashMovement2#mmAmount
	 * CashMovement2.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashProceeds1#mmPostingAmount
	 * CashProceeds1.mmPostingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashMovement3#mmPostingAmount
	 * CashMovement3.mmPostingAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.NotificationItem3#mmAmount
	 * NotificationItem3.mmAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OriginalItem1#mmAmount
	 * OriginalItem1.mmAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OriginalItem2#mmAmount
	 * OriginalItem2.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItemAndStatus1#mmAmount
	 * OriginalItemAndStatus1.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItemAndStatus2#mmAmount
	 * OriginalItemAndStatus2.mmAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.NotificationItem4#mmAmount
	 * NotificationItem4.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItemAndStatus3#mmAmount
	 * OriginalItemAndStatus3.mmAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount6#mmAmount
	 * DetailedAmount6.mmAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount4#mmAmount
	 * DetailedAmount4.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItemAndStatus4#mmAmount
	 * OriginalItemAndStatus4.mmAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.NotificationItem5#mmAmount
	 * NotificationItem5.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference21#mmAmount
	 * OriginalTransactionReference21.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReconciliationList1#mmPaymentAmount
	 * ReconciliationList1.mmPaymentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMAccountStatement2#mmAmount
	 * ATMAccountStatement2.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction1#mmTotalRequestedAmount
	 * ATMTransaction1.mmTotalRequestedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction1#mmDetailedRequestedAmount
	 * ATMTransaction1.mmDetailedRequestedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndCurrency1#mmAmount
	 * AmountAndCurrency1.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DetailedAmount12#mmAmountToDispense
	 * DetailedAmount12.mmAmountToDispense}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ATMTransaction8#mmAmount
	 * ATMTransaction8.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction3#mmBundlePresentedAmount
	 * ATMTransaction3.mmBundlePresentedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction3#mmTotalPresentedAmount
	 * ATMTransaction3.mmTotalPresentedAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount13#mmAmount
	 * DetailedAmount13.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction6#mmTotalRequestedAmount
	 * ATMTransaction6.mmTotalRequestedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction6#mmDetailedRequestedAmount
	 * ATMTransaction6.mmDetailedRequestedAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount11#mmAmount
	 * DetailedAmount11.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DetailedAmount11#mmOriginalAmount
	 * DetailedAmount11.mmOriginalAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount10#mmAmount
	 * DetailedAmount10.mmAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount9#mmAmount
	 * DetailedAmount9.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction10#mmAmountNetReconciliation
	 * CardTransaction10.mmAmountNetReconciliation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionAmount2#mmTotalAmount
	 * CardTransactionAmount2.mmTotalAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount8#mmAmount
	 * DetailedAmount8.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionAmount1#mmTotalAmount
	 * CardTransactionAmount1.mmTotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction9#mmAmountNetReconciliation
	 * CardTransaction9.mmAmountNetReconciliation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionDetail5#mmTransactionFees
	 * CardTransactionDetail5.mmTransactionFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionDetail2#mmTransactionAmounts
	 * CardTransactionDetail2.mmTransactionAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionDetail4#mmTransactionAmounts
	 * CardTransactionDetail4.mmTransactionAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionDetail6#mmTransactionFees
	 * CardTransactionDetail6.mmTransactionFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionAmount5#mmTotalAmount
	 * CardTransactionAmount5.mmTotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionAmount3#mmTotalAmount
	 * CardTransactionAmount3.mmTotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionAmount4#mmTotalAmount
	 * CardTransactionAmount4.mmTotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionDetail3#mmTransactionFees
	 * CardTransactionDetail3.mmTransactionFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionCertificate2#mmAmount
	 * TransactionCertificate2.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItemAndStatus5#mmAmount
	 * OriginalItemAndStatus5.mmAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.NotificationItem6#mmAmount
	 * NotificationItem6.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference23#mmAmount
	 * OriginalTransactionReference23.mmAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount14#mmAmount
	 * DetailedAmount14.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction17#mmBundlePresentedAmount
	 * ATMTransaction17.mmBundlePresentedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction17#mmTotalPresentedAmount
	 * ATMTransaction17.mmTotalPresentedAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount18#mmAmount
	 * DetailedAmount18.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction13#mmTotalRequestedAmount
	 * ATMTransaction13.mmTotalRequestedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction13#mmDetailedRequestedAmount
	 * ATMTransaction13.mmDetailedRequestedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction16#mmTotalAuthorisedAmount
	 * ATMTransaction16.mmTotalAuthorisedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction16#mmDetailedRequestedAmount
	 * ATMTransaction16.mmDetailedRequestedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction19#mmTotalAuthorisedAmount
	 * ATMTransaction19.mmTotalAuthorisedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction19#mmDetailedRequestedAmount
	 * ATMTransaction19.mmDetailedRequestedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DetailedAmount16#mmAmountToDeposit
	 * DetailedAmount16.mmAmountToDeposit}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction15#mmTotalAmount
	 * ATMTransaction15.mmTotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction15#mmDetailedRequestedAmount
	 * ATMTransaction15.mmDetailedRequestedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction24#mmDetailedRequestedAmount
	 * ATMTransaction24.mmDetailedRequestedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DetailedAmount17#mmAmountToTransfer
	 * DetailedAmount17.mmAmountToTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction23#mmDetailedRequestedAmount
	 * ATMTransaction23.mmDetailedRequestedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction29#mmTotalRequestedAmount
	 * ATMTransaction29.mmTotalRequestedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction29#mmDetailedRequestedAmount
	 * ATMTransaction29.mmDetailedRequestedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference26#mmAmount
	 * OriginalTransactionReference26.mmAmount}</li>
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
	public static final MMBusinessAttribute mmAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CardAmountAndCurrencyExchange1.mmAmount, OriginalTransactionReference19.mmAmount, CashMovement1.mmAmount, CashMovement2.mmAmount, CashProceeds1.mmPostingAmount,
					CashMovement3.mmPostingAmount, NotificationItem3.mmAmount, OriginalItem1.mmAmount, OriginalItem2.mmAmount, OriginalItemAndStatus1.mmAmount, OriginalItemAndStatus2.mmAmount, NotificationItem4.mmAmount,
					OriginalItemAndStatus3.mmAmount, DetailedAmount6.mmAmount, DetailedAmount4.mmAmount, OriginalItemAndStatus4.mmAmount, NotificationItem5.mmAmount, OriginalTransactionReference21.mmAmount,
					ReconciliationList1.mmPaymentAmount, ATMAccountStatement2.mmAmount, ATMTransaction1.mmTotalRequestedAmount, ATMTransaction1.mmDetailedRequestedAmount, AmountAndCurrency1.mmAmount, DetailedAmount12.mmAmountToDispense,
					ATMTransaction8.mmAmount, ATMTransaction3.mmBundlePresentedAmount, ATMTransaction3.mmTotalPresentedAmount, DetailedAmount13.mmAmount, ATMTransaction6.mmTotalRequestedAmount, ATMTransaction6.mmDetailedRequestedAmount,
					DetailedAmount11.mmAmount, DetailedAmount11.mmOriginalAmount, DetailedAmount10.mmAmount, DetailedAmount9.mmAmount, CardTransaction10.mmAmountNetReconciliation, CardTransactionAmount2.mmTotalAmount,
					DetailedAmount8.mmAmount, CardTransactionAmount1.mmTotalAmount, CardTransaction9.mmAmountNetReconciliation, CardTransactionDetail5.mmTransactionFees, CardTransactionDetail2.mmTransactionAmounts,
					CardTransactionDetail4.mmTransactionAmounts, CardTransactionDetail6.mmTransactionFees, CardTransactionAmount5.mmTotalAmount, CardTransactionAmount3.mmTotalAmount, CardTransactionAmount4.mmTotalAmount,
					CardTransactionDetail3.mmTransactionFees, TransactionCertificate2.mmAmount, OriginalItemAndStatus5.mmAmount, NotificationItem6.mmAmount, OriginalTransactionReference23.mmAmount, DetailedAmount14.mmAmount,
					ATMTransaction17.mmBundlePresentedAmount, ATMTransaction17.mmTotalPresentedAmount, DetailedAmount18.mmAmount, ATMTransaction13.mmTotalRequestedAmount, ATMTransaction13.mmDetailedRequestedAmount,
					ATMTransaction16.mmTotalAuthorisedAmount, ATMTransaction16.mmDetailedRequestedAmount, ATMTransaction19.mmTotalAuthorisedAmount, ATMTransaction19.mmDetailedRequestedAmount, DetailedAmount16.mmAmountToDeposit,
					ATMTransaction15.mmTotalAmount, ATMTransaction15.mmDetailedRequestedAmount, ATMTransaction24.mmDetailedRequestedAmount, DetailedAmount17.mmAmountToTransfer, ATMTransaction23.mmDetailedRequestedAmount,
					ATMTransaction29.mmTotalRequestedAmount, ATMTransaction29.mmDetailedRequestedAmount, OriginalTransactionReference26.mmAmount);
			elementContext_lazy = () -> com.tools20022.repository.entity.Payment.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Amount";
			definition = "Amount of the payment.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Payment.class.getMethod("getAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.CommercialTradeSettlement> tradeSettlement;
	/**
	 * Specifies the settlement operation which originates the payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CommercialTradeSettlement#mmPayment
	 * CommercialTradeSettlement.mmPayment}</li>
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
	 * {@linkplain com.tools20022.repository.msg.EarlyPayment1#mmEarlyPaymentTaxSpecification
	 * EarlyPayment1.mmEarlyPaymentTaxSpecification}</li>
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
	public static final MMBusinessAssociationEnd mmTradeSettlement = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(EarlyPayment1.mmEarlyPaymentTaxSpecification);
			elementContext_lazy = () -> com.tools20022.repository.entity.Payment.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TradeSettlement";
			definition = "Specifies the settlement operation which originates the payment.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CommercialTradeSettlement.mmPayment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CommercialTradeSettlement.mmObject();
		}
	};
	protected Max140Text standardSettlementInstructions;
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
	public static final MMBusinessAttribute mmStandardSettlementInstructions = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.Payment.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "StandardSettlementInstructions";
			definition = "Identifies the standard settlement instructions.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max140Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Payment.class.getMethod("getStandardSettlementInstructions", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected DebitAuthorisation relatedDebitAuthorisation;
	/**
	 * Payment which is the result of the debit authorisation
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DebitAuthorisation#mmAuthorisedReturn
	 * DebitAuthorisation.mmAuthorisedReturn}</li>
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
	public static final MMBusinessAssociationEnd mmRelatedDebitAuthorisation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.Payment.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedDebitAuthorisation";
			definition = "Payment which is the result of the debit authorisation";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.DebitAuthorisation.mmAuthorisedReturn;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.DebitAuthorisation.mmObject();
		}
	};
	protected PaymentInvestigationCaseResolution relatedInvestigationCaseResolution;
	/**
	 * Case resolution related to a specific payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseResolution#mmPaymentCorrection
	 * PaymentInvestigationCaseResolution.mmPaymentCorrection}</li>
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
	public static final MMBusinessAssociationEnd mmRelatedInvestigationCaseResolution = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.Payment.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedInvestigationCaseResolution";
			definition = "Case resolution related to a specific payment.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentInvestigationCaseResolution.mmPaymentCorrection;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PaymentInvestigationCaseResolution.mmObject();
		}
	};
	protected Payment originalPayment;
	/**
	 * Original payment which is returned.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmReturnPayment
	 * Payment.mmReturnPayment}</li>
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
	public static final MMBusinessAssociationEnd mmOriginalPayment = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.Payment.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OriginalPayment";
			definition = "Original payment which is returned.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Payment.mmReturnPayment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Payment.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Payment> returnPayment;
	/**
	 * Payment which offsets an original payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmOriginalPayment
	 * Payment.mmOriginalPayment}</li>
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
	public static final MMBusinessAssociationEnd mmReturnPayment = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.Payment.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ReturnPayment";
			definition = "Payment which offsets an original payment.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Payment.mmOriginalPayment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Payment.mmObject();
		}
	};
	protected SecuritiesSettlement relatedSecuritiesSettlement;
	/**
	 * Securities settlement process which is the source of the payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmPayment
	 * SecuritiesSettlement.mmPayment}</li>
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
	public static final MMBusinessAssociationEnd mmRelatedSecuritiesSettlement = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.Payment.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedSecuritiesSettlement";
			definition = "Securities settlement process which is the source of the payment.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmPayment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Invoice> invoiceReconciliation;
	/**
	 * Reconciliation of the amounts of an invoice with the amounts included in
	 * one or more payments.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Invoice#mmPayment
	 * Invoice.mmPayment}</li>
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
	public static final MMBusinessAssociationEnd mmInvoiceReconciliation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.Payment.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvoiceReconciliation";
			definition = "Reconciliation of the amounts of an invoice with the amounts included in one or more payments.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Invoice.mmPayment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Invoice.mmObject();
		}
	};
	protected PaymentInstrumentCode paymentInstrument;
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
	 * {@linkplain com.tools20022.repository.choice.PaymentOrigin1Choice#mmInstrument
	 * PaymentOrigin1Choice.mmInstrument}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionReferenceDetails3#mmPaymentMethod
	 * PaymentInstructionReferenceDetails3.mmPaymentMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionReferenceDetails4#mmPaymentMethod
	 * PaymentInstructionReferenceDetails4.mmPaymentMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionCertificate2#mmTransactionType
	 * TransactionCertificate2.mmTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionCertificate2#mmLocalInstrument
	 * TransactionCertificate2.mmLocalInstrument}</li>
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
	public static final MMBusinessAttribute mmPaymentInstrument = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(PaymentOrigin1Choice.mmInstrument, PaymentInstructionReferenceDetails3.mmPaymentMethod, PaymentInstructionReferenceDetails4.mmPaymentMethod, TransactionCertificate2.mmTransactionType,
					TransactionCertificate2.mmLocalInstrument);
			elementContext_lazy = () -> com.tools20022.repository.entity.Payment.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PaymentInstrument";
			definition = "Payment type at the origin of the cash entry eg, a cheque.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PaymentInstrumentCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Payment.class.getMethod("getPaymentInstrument", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CashAccount account;
	/**
	 * Account debited for the payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount#mmPayment
	 * CashAccount.mmPayment}</li>
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
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction1#mmAccountData
	 * ATMTransaction1.mmAccountData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction2#mmAccountData
	 * ATMTransaction2.mmAccountData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction7#mmAccountInformation
	 * ATMTransaction7.mmAccountInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction3#mmAccountData
	 * ATMTransaction3.mmAccountData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction6#mmAccountData
	 * ATMTransaction6.mmAccountData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionDetail1#mmAccountFrom
	 * CardTransactionDetail1.mmAccountFrom}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionDetail1#mmAccountTo
	 * CardTransactionDetail1.mmAccountTo}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionDetail3#mmAccountFrom
	 * CardTransactionDetail3.mmAccountFrom}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionDetail3#mmAccountTo
	 * CardTransactionDetail3.mmAccountTo}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction14#mmAccountData
	 * ATMTransaction14.mmAccountData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction17#mmAccountData
	 * ATMTransaction17.mmAccountData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction13#mmAccountData
	 * ATMTransaction13.mmAccountData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction16#mmAccountData
	 * ATMTransaction16.mmAccountData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction19#mmAccountData
	 * ATMTransaction19.mmAccountData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction15#mmAccountData
	 * ATMTransaction15.mmAccountData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction21#mmAccountInformation
	 * ATMTransaction21.mmAccountInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction24#mmAccountFrom
	 * ATMTransaction24.mmAccountFrom}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction23#mmAccountFrom
	 * ATMTransaction23.mmAccountFrom}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction29#mmAccountData
	 * ATMTransaction29.mmAccountData}</li>
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
	public static final MMBusinessAssociationEnd mmAccount = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(ATMTransaction1.mmAccountData, ATMTransaction2.mmAccountData, ATMTransaction7.mmAccountInformation, ATMTransaction3.mmAccountData, ATMTransaction6.mmAccountData,
					CardTransactionDetail1.mmAccountFrom, CardTransactionDetail1.mmAccountTo, CardTransactionDetail3.mmAccountFrom, CardTransactionDetail3.mmAccountTo, ATMTransaction14.mmAccountData, ATMTransaction17.mmAccountData,
					ATMTransaction13.mmAccountData, ATMTransaction16.mmAccountData, ATMTransaction19.mmAccountData, ATMTransaction15.mmAccountData, ATMTransaction21.mmAccountInformation, ATMTransaction24.mmAccountFrom,
					ATMTransaction23.mmAccountFrom, ATMTransaction29.mmAccountData);
			elementContext_lazy = () -> com.tools20022.repository.entity.Payment.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Account";
			definition = "Account debited for the payment.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CashAccount.mmPayment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashAccount.mmObject();
		}
	};
	protected Adjustment adjustments;
	/**
	 * Specifies the charges or the allowance related to a payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment#mmPayment
	 * Adjustment.mmPayment}</li>
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
	 * {@linkplain com.tools20022.repository.msg.RemittanceAmount1#mmAdjustmentAmountAndReason
	 * RemittanceAmount1.mmAdjustmentAmountAndReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RemittanceAmount2#mmAdjustmentAmountAndReason
	 * RemittanceAmount2.mmAdjustmentAmountAndReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction36#mmCompensationAmount
	 * PaymentTransaction36.mmCompensationAmount}</li>
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
	public static final MMBusinessAssociationEnd mmAdjustments = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(RemittanceAmount1.mmAdjustmentAmountAndReason, RemittanceAmount2.mmAdjustmentAmountAndReason, PaymentTransaction36.mmCompensationAmount);
			elementContext_lazy = () -> com.tools20022.repository.entity.Payment.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Adjustments";
			definition = "Specifies the charges or the allowance related to a payment.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Adjustment.mmPayment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Adjustment.mmObject();
		}
	};
	protected RegisteredContract contractRegistration;
	/**
	 * Provides the payment of the registered contract.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RegisteredContract#mmRelatedPayment
	 * RegisteredContract.mmRelatedPayment}</li>
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
	public static final MMBusinessAssociationEnd mmContractRegistration = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.Payment.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ContractRegistration";
			definition = "Provides the payment of the registered contract.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.RegisteredContract.mmRelatedPayment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.RegisteredContract.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Payment";
				definition = "Payment information and processes required to transfer cash end to end from the debtor to the creditor.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashAccount.mmPayment, com.tools20022.repository.entity.Tax.mmRelatedPaymentSettlement, com.tools20022.repository.entity.Adjustment.mmPayment,
						com.tools20022.repository.entity.PaymentObligation.mmPaymentOffset, com.tools20022.repository.entity.Payment.mmOriginalPayment, com.tools20022.repository.entity.Payment.mmReturnPayment,
						com.tools20022.repository.entity.CreditInstrument.mmRelatedPayment, com.tools20022.repository.entity.PaymentExecution.mmPayment, com.tools20022.repository.entity.PaymentIdentification.mmPayment,
						com.tools20022.repository.entity.PaymentPartyRole.mmPayment, com.tools20022.repository.entity.PaymentStatus.mmPayment, com.tools20022.repository.entity.SecuritiesSettlement.mmPayment,
						com.tools20022.repository.entity.CurrencyExchange.mmRelatedPayment, com.tools20022.repository.entity.Invoice.mmPayment, com.tools20022.repository.entity.PaymentInvestigationCase.mmUnderlyingPayment,
						com.tools20022.repository.entity.SettlementTimeRequest.mmPayment, com.tools20022.repository.entity.DebitAuthorisation.mmAuthorisedReturn,
						com.tools20022.repository.entity.PaymentInvestigationCaseResolution.mmPaymentCorrection, com.tools20022.repository.entity.CommercialTradeSettlement.mmPayment,
						com.tools20022.repository.entity.RegisteredContract.mmRelatedPayment);
				derivationElement_lazy = () -> Arrays.asList(InvestmentFundCashSettlementInformation1.mmSubscriptionPaymentInstrument, InvestmentFundCashSettlementInformation1.mmRedemptionPaymentInstrument,
						InvestmentFundCashSettlementInformation1.mmDividendPaymentInstrument, InvestmentFundCashSettlementInformation1.mmSavingsPlanPaymentInstrument,
						InvestmentFundCashSettlementInformation3.mmSubscriptionPaymentInstrument, InvestmentFundCashSettlementInformation3.mmRedemptionPaymentInstrument, InvestmentFundCashSettlementInformation3.mmDividendPaymentInstrument,
						InvestmentFundCashSettlementInformation3.mmSavingsPlanPaymentInstrument, InvestmentFundCashSettlementInformation5.mmSubscriptionPaymentInstrument,
						InvestmentFundCashSettlementInformation5.mmRedemptionPaymentInstrument, InvestmentFundCashSettlementInformation5.mmDividendPaymentInstrument, InvestmentFundCashSettlementInformation5.mmSavingsPlanPaymentInstrument,
						InvestmentFundCashSettlementInformation5.mmInterestPaymentInstrument, InvestmentFundCashSettlementInformation2.mmSubscriptionPaymentInstrument, InvestmentFundCashSettlementInformation2.mmRedemptionPaymentInstrument,
						InvestmentFundCashSettlementInformation2.mmDividendPaymentInstrument, InvestmentFundCashSettlementInformation2.mmSavingsPlanPaymentInstrument,
						InvestmentFundCashSettlementInformation4.mmSubscriptionPaymentInstrument, InvestmentFundCashSettlementInformation4.mmRedemptionPaymentInstrument, InvestmentFundCashSettlementInformation4.mmDividendPaymentInstrument,
						InvestmentFundCashSettlementInformation4.mmSavingsPlanPaymentInstrument, InvestmentFundCashSettlementInformation6.mmSubscriptionPaymentInstrument,
						InvestmentFundCashSettlementInformation6.mmRedemptionPaymentInstrument, InvestmentFundCashSettlementInformation6.mmDividendPaymentInstrument, InvestmentFundCashSettlementInformation6.mmSavingsPlanPaymentInstrument,
						InvestmentFundCashSettlementInformation6.mmInterestPaymentInstrument, TransactionReportDetails3.mmTransaction, TransactionReportDetails4.mmTransaction, TransactionReportDetails5.mmTransaction,
						PaymentTransactionInformation3.mmOriginalTransactionReference, PaymentTransactionInformation30.mmOriginalTransactionReference, OriginalPaymentInformation4.mmOriginalGroupInformation,
						OriginalPaymentInformation4.mmTransactionInformation, PaymentTransaction37.mmOriginalTransactionReference, OriginalPaymentInstruction4.mmOriginalGroupInformation,
						OriginalPaymentInstruction4.mmTransactionInformation, PaymentTransaction47.mmOriginalTransactionReference, OriginalPaymentInstruction8.mmOriginalGroupInformation,
						OriginalPaymentInstruction8.mmTransactionInformation, PaymentTransactionInformation4.mmOriginalTransactionReference, PaymentTransactionInformation28.mmOriginalTransactionReference,
						OriginalPaymentInformation2.mmTransactionInformation, PaymentTransaction35.mmOriginalTransactionReference, OriginalPaymentInstruction2.mmTransactionInformation, PaymentTransaction42.mmOriginalTransactionReference,
						OriginalPaymentInstruction7.mmTransactionInformation, PaymentTransactionInformation1.mmOriginalTransactionReference, PaymentTransactionInformation25.mmOriginalTransactionReference,
						OriginalPaymentInformation1.mmTransactionInformationAndStatus, PaymentTransaction32.mmOriginalTransactionReference, OriginalPaymentInstruction1.mmTransactionInformationAndStatus,
						PaymentTransaction46.mmOriginalTransactionReference, OriginalPaymentInstruction6.mmTransactionInformationAndStatus, PaymentTransactionInformation31.mmOriginalTransactionReference,
						PaymentTransaction38.mmOriginalTransactionReference, PaymentTransaction48.mmOriginalTransactionReference, PaymentTransactionInformation5.mmOriginalTransactionReference,
						PaymentTransactionInformation29.mmOriginalTransactionReference, PaymentTransaction36.mmOriginalTransactionReference, PaymentTransaction45.mmOriginalTransactionReference,
						PaymentTransactionInformation26.mmOriginalTransactionReference, PaymentTransaction33.mmOriginalTransactionReference, PaymentTransaction43.mmOriginalTransactionReference,
						PaymentTransactionInformation2.mmOriginalTransactionReference, PaymentTransactionInformation27.mmOriginalTransactionReference, PaymentTransaction34.mmOriginalTransactionReference,
						PaymentTransaction44.mmOriginalTransactionReference, PaymentTransactionInformation34.mmOriginalTransactionReference, OriginalPaymentInformation5.mmTransactionInformationAndStatus,
						PaymentTransaction41.mmOriginalTransactionReference, OriginalPaymentInstruction5.mmTransactionInformationAndStatus, PaymentTransaction49.mmOriginalTransactionReference,
						OriginalPaymentInstruction9.mmTransactionInformationAndStatus, PaymentTransaction18.mmPaymentInstrument, PaymentTransaction15.mmPaymentInstrument, PaymentTransaction21.mmPaymentInstrument,
						PaymentTransaction22.mmPaymentInstrument, PaymentTransaction17.mmPaymentInstrument, PaymentTransaction19.mmPaymentInstrument, PaymentTransaction23.mmPaymentInstrument, PaymentTransaction16.mmPaymentInstrument,
						PaymentTransaction13.mmPaymentInstrument, PaymentTransaction24.mmPaymentInstrument, CashInOrOut4Choice.mmCashInPaymentInstrument, CashInOrOut4Choice.mmCashOutPaymentInstrument, PaymentTransaction20.mmCashInOrOut,
						CashInOrOut5Choice.mmCashInPaymentInstrument, CashInOrOut5Choice.mmCashOutPaymentInstrument, PaymentTransaction25.mmCashInOrOut, CashInOrOut3Choice.mmCashInPaymentInstrument,
						CashInOrOut3Choice.mmCashOutPaymentInstrument, PaymentTransaction14.mmCashInOrOutChoice, CashInOrOut6Choice.mmCashInPaymentInstrument, CashInOrOut6Choice.mmCashOutPaymentInstrument,
						PaymentTransaction26.mmCashInOrOut, OriginalTransactionReference14.mmOriginalTransaction, OriginalTransactionReference18.mmOriginalTransaction, OriginalItem2.mmOriginalItemReference,
						OriginalItemAndStatus2.mmOriginalItemReference, UnderlyingTransaction1Choice.mmInterbank, PaymentTransactionInformation32.mmOriginalTransactionReference, OriginalPaymentInformation3.mmOriginalGroupInformation,
						OriginalPaymentInformation3.mmTransactionInformationAndStatus, PaymentTransactionInformation33.mmOriginalTransactionReference, CorrectiveTransaction1Choice.mmInterbank, UnderlyingTransaction2Choice.mmInterbank,
						PaymentTransaction39.mmOriginalTransactionReference, OriginalPaymentInstruction3.mmOriginalGroupInformation, OriginalPaymentInstruction3.mmTransactionInformationAndStatus,
						PaymentTransaction40.mmOriginalTransactionReference, OriginalItem3.mmOriginalItemReference, OriginalItemAndStatus3.mmOriginalItemReference, PaymentTransactionInformation13.mmOriginalTransactionReference,
						PaymentTransactionInformation18.mmOriginalTransactionReference, PaymentTransactionInformation15.mmOriginalTransactionReference, PaymentTransactionInformation22.mmOriginalTransactionReference,
						PaymentTransactionInformation12.mmOriginalTransactionReference, PaymentTransactionInformation19.mmOriginalTransactionReference, PaymentTransactionInformation14.mmOriginalTransactionReference,
						PaymentTransactionInformation20.mmOriginalTransactionReference, PaymentTransactionInformation16.mmOriginalTransactionReference, PaymentTransactionInformation23.mmOriginalTransactionReference,
						PaymentTransactionInformation17.mmOriginalTransactionReference, PaymentTransactionInformation24.mmOriginalTransactionReference, PaymentTransactionInformation21.mmOriginalTransactionReference,
						PaymentTransaction30.mmPaymentInstrument, PaymentTransaction28.mmPaymentInstrument, PaymentTransaction31.mmPaymentInstrument, InvestmentFundCashSettlementInformation7.mmSubscriptionPaymentInstrument,
						InvestmentFundCashSettlementInformation7.mmRedemptionPaymentInstrument, InvestmentFundCashSettlementInformation7.mmDividendPaymentInstrument, InvestmentFundCashSettlementInformation7.mmSavingsPlanPaymentInstrument,
						InvestmentFundCashSettlementInformation7.mmInterestPaymentInstrument, InvestmentFundCashSettlementInformation8.mmSubscriptionPaymentInstrument, InvestmentFundCashSettlementInformation8.mmRedemptionPaymentInstrument,
						InvestmentFundCashSettlementInformation8.mmDividendPaymentInstrument, InvestmentFundCashSettlementInformation8.mmSavingsPlanPaymentInstrument, InvestmentFundCashSettlementInformation8.mmInterestPaymentInstrument,
						PaymentCodeOrOther1Choice.mmPaymentCode, OriginalPaymentInformation6.mmAmount, PaymentTransaction50.mmOriginalTransactionReference, OriginalPaymentInstruction12.mmTransactionInformationAndStatus,
						OriginalPaymentInstruction11.mmTransactionInformation, PaymentTransaction52.mmOriginalTransactionReference, PaymentTransaction51.mmOriginalTransactionReference, OriginalItem4.mmOriginalItemReference,
						OriginalPaymentInstruction13.mmOriginalGroupInformation, OriginalPaymentInstruction13.mmTransactionInformation, PaymentTransaction58.mmOriginalTransactionReference,
						OriginalPaymentInstruction10.mmOriginalGroupInformation, OriginalPaymentInstruction10.mmTransactionInformationAndStatus, PaymentTransaction54.mmOriginalTransactionReference,
						OriginalItemAndStatus4.mmOriginalItemReference, PaymentTransaction53.mmOriginalTransactionReference, PaymentTransaction57.mmOriginalTransactionReference, PaymentTransaction56.mmOriginalTransactionReference,
						PaymentTransaction55.mmOriginalTransactionReference, OriginalPaymentInstruction14.mmTransactionInformationAndStatus, PaymentTransaction59.mmOriginalTransactionReference,
						ContractRegistrationStatement1.mmTransactionJournal, TransactionCertificateRecord1.mmTransaction, OriginalPaymentInstruction16.mmTransactionInformation,
						OriginalPaymentInstruction18.mmTransactionInformationAndStatus, PaymentTransaction65.mmOriginalTransactionReference, PaymentTransaction63.mmOriginalTransactionReference,
						PaymentTransaction60.mmOriginalTransactionReference, PaymentTransaction68.mmOriginalTransactionReference, PaymentTransaction61.mmOriginalTransactionReference, OriginalPaymentInstruction15.mmOriginalGroupInformation,
						OriginalPaymentInstruction15.mmTransactionInformation, OriginalItem5.mmOriginalItemReference, OriginalItemAndStatus5.mmOriginalItemReference, PaymentTransaction66.mmOriginalTransactionReference,
						PaymentTransaction67.mmOriginalTransactionReference, PaymentTransaction62.mmOriginalTransactionReference, PaymentTransaction64.mmOriginalTransactionReference, OriginalPaymentInstruction17.mmOriginalGroupInformation,
						OriginalPaymentInstruction17.mmTransactionInformationAndStatus, CashSettlement1.mmOtherCashSettlementDetails, CashSettlement2.mmOtherCashSettlementDetails, PaymentInstrument13.mmSubscriptionPaymentInstrument,
						PaymentInstrument13.mmRedemptionPaymentInstrument, PaymentInstrument13.mmDividendPaymentInstrument, PaymentInstrument13.mmSavingsPlanPaymentInstrument, PaymentInstrument13.mmInterestPaymentInstrument,
						OriginalPaymentInstruction19.mmTransactionInformationAndStatus, PaymentTransaction69.mmOriginalTransactionReference, PaymentTransaction72.mmPaymentInstrument, PaymentTransaction70.mmPaymentInstrument,
						PaymentTransaction71.mmCashInOrOut, CashInOrOut7Choice.mmCashInPaymentInstrument, CashInOrOut7Choice.mmCashOutPaymentInstrument, UnderlyingTransaction3Choice.mmInterbank,
						PaymentTransaction80.mmOriginalTransactionReference, PaymentTransaction81.mmOriginalTransactionReference, OriginalPaymentInstruction23.mmTransactionInformationAndStatus,
						OriginalPaymentInstruction21.mmTransactionInformation, OriginalPaymentInstruction24.mmTransactionInformationAndStatus, PaymentTransaction76.mmOriginalTransactionReference, CorrectiveTransaction2Choice.mmInterbank,
						OriginalPaymentInstruction22.mmOriginalGroupInformation, OriginalPaymentInstruction22.mmTransactionInformationAndStatus, PaymentTransaction78.mmOriginalTransactionReference,
						OriginalPaymentInstruction20.mmOriginalGroupInformation, OriginalPaymentInstruction20.mmTransactionInformation, PaymentTransaction74.mmOriginalTransactionReference, OriginalPaymentInformation7.mmAmount,
						PaymentTransaction83.mmOriginalTransactionReference, PaymentTransaction77.mmOriginalTransactionReference, PaymentTransaction75.mmOriginalTransactionReference, PaymentTransaction82.mmOriginalTransactionReference,
						PaymentTransaction79.mmOriginalTransactionReference);
				subType_lazy = () -> Arrays.asList(IndividualPayment.mmObject(), BulkPayment.mmObject());
				superType_lazy = () -> ObligationFulfilment.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Payment.mmPaymentObligation, com.tools20022.repository.entity.Payment.mmCurrencyOfTransfer, com.tools20022.repository.entity.Payment.mmCreditMethod,
						com.tools20022.repository.entity.Payment.mmType, com.tools20022.repository.entity.Payment.mmInstructedAmount, com.tools20022.repository.entity.Payment.mmPriority,
						com.tools20022.repository.entity.Payment.mmValueDate, com.tools20022.repository.entity.Payment.mmPaymentStatus, com.tools20022.repository.entity.Payment.mmPartyRole,
						com.tools20022.repository.entity.Payment.mmTaxOnPayment, com.tools20022.repository.entity.Payment.mmPaymentExecution, com.tools20022.repository.entity.Payment.mmPoolingAdjustmentDate,
						com.tools20022.repository.entity.Payment.mmEquivalentAmount, com.tools20022.repository.entity.Payment.mmCurrencyExchange, com.tools20022.repository.entity.Payment.mmInstructionForCreditorAgent,
						com.tools20022.repository.entity.Payment.mmInstructionForDebtorAgent, com.tools20022.repository.entity.Payment.mmPaymentRelatedIdentifications, com.tools20022.repository.entity.Payment.mmRelatedInvestigationCase,
						com.tools20022.repository.entity.Payment.mmSettlementTimeRequest, com.tools20022.repository.entity.Payment.mmAmount, com.tools20022.repository.entity.Payment.mmTradeSettlement,
						com.tools20022.repository.entity.Payment.mmStandardSettlementInstructions, com.tools20022.repository.entity.Payment.mmRelatedDebitAuthorisation,
						com.tools20022.repository.entity.Payment.mmRelatedInvestigationCaseResolution, com.tools20022.repository.entity.Payment.mmOriginalPayment, com.tools20022.repository.entity.Payment.mmReturnPayment,
						com.tools20022.repository.entity.Payment.mmRelatedSecuritiesSettlement, com.tools20022.repository.entity.Payment.mmInvoiceReconciliation, com.tools20022.repository.entity.Payment.mmPaymentInstrument,
						com.tools20022.repository.entity.Payment.mmAccount, com.tools20022.repository.entity.Payment.mmAdjustments, com.tools20022.repository.entity.Payment.mmContractRegistration);
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

			@Override
			public Class<?> getInstanceClass() {
				return Payment.class;
			}
		});
		return mmObject_lazy.get();
	}

	public List<PaymentObligation> getPaymentObligation() {
		return paymentObligation;
	}

	public void setPaymentObligation(List<com.tools20022.repository.entity.PaymentObligation> paymentObligation) {
		this.paymentObligation = paymentObligation;
	}

	public CurrencyCode getCurrencyOfTransfer() {
		return currencyOfTransfer;
	}

	public void setCurrencyOfTransfer(CurrencyCode currencyOfTransfer) {
		this.currencyOfTransfer = currencyOfTransfer;
	}

	public List<CreditInstrument> getCreditMethod() {
		return creditMethod;
	}

	public void setCreditMethod(List<com.tools20022.repository.entity.CreditInstrument> creditMethod) {
		this.creditMethod = creditMethod;
	}

	public PaymentTypeCode getType() {
		return type;
	}

	public void setType(PaymentTypeCode type) {
		this.type = type;
	}

	public CurrencyAndAmount getInstructedAmount() {
		return instructedAmount;
	}

	public void setInstructedAmount(CurrencyAndAmount instructedAmount) {
		this.instructedAmount = instructedAmount;
	}

	public PriorityCode getPriority() {
		return priority;
	}

	public void setPriority(PriorityCode priority) {
		this.priority = priority;
	}

	public ISODate getValueDate() {
		return valueDate;
	}

	public void setValueDate(ISODate valueDate) {
		this.valueDate = valueDate;
	}

	public List<PaymentStatus> getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(List<com.tools20022.repository.entity.PaymentStatus> paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public List<PaymentPartyRole> getPartyRole() {
		return partyRole;
	}

	public void setPartyRole(List<com.tools20022.repository.entity.PaymentPartyRole> partyRole) {
		this.partyRole = partyRole;
	}

	public List<Tax> getTaxOnPayment() {
		return taxOnPayment;
	}

	public void setTaxOnPayment(List<com.tools20022.repository.entity.Tax> taxOnPayment) {
		this.taxOnPayment = taxOnPayment;
	}

	public List<PaymentExecution> getPaymentExecution() {
		return paymentExecution;
	}

	public void setPaymentExecution(List<com.tools20022.repository.entity.PaymentExecution> paymentExecution) {
		this.paymentExecution = paymentExecution;
	}

	public ISODate getPoolingAdjustmentDate() {
		return poolingAdjustmentDate;
	}

	public void setPoolingAdjustmentDate(ISODate poolingAdjustmentDate) {
		this.poolingAdjustmentDate = poolingAdjustmentDate;
	}

	public ImpliedCurrencyAndAmount getEquivalentAmount() {
		return equivalentAmount;
	}

	public void setEquivalentAmount(ImpliedCurrencyAndAmount equivalentAmount) {
		this.equivalentAmount = equivalentAmount;
	}

	public List<CurrencyExchange> getCurrencyExchange() {
		return currencyExchange;
	}

	public void setCurrencyExchange(List<com.tools20022.repository.entity.CurrencyExchange> currencyExchange) {
		this.currencyExchange = currencyExchange;
	}

	public InstructionCode getInstructionForCreditorAgent() {
		return instructionForCreditorAgent;
	}

	public void setInstructionForCreditorAgent(InstructionCode instructionForCreditorAgent) {
		this.instructionForCreditorAgent = instructionForCreditorAgent;
	}

	public InstructionCode getInstructionForDebtorAgent() {
		return instructionForDebtorAgent;
	}

	public void setInstructionForDebtorAgent(InstructionCode instructionForDebtorAgent) {
		this.instructionForDebtorAgent = instructionForDebtorAgent;
	}

	public List<PaymentIdentification> getPaymentRelatedIdentifications() {
		return paymentRelatedIdentifications;
	}

	public void setPaymentRelatedIdentifications(List<com.tools20022.repository.entity.PaymentIdentification> paymentRelatedIdentifications) {
		this.paymentRelatedIdentifications = paymentRelatedIdentifications;
	}

	public PaymentInvestigationCase getRelatedInvestigationCase() {
		return relatedInvestigationCase;
	}

	public void setRelatedInvestigationCase(com.tools20022.repository.entity.PaymentInvestigationCase relatedInvestigationCase) {
		this.relatedInvestigationCase = relatedInvestigationCase;
	}

	public SettlementTimeRequest getSettlementTimeRequest() {
		return settlementTimeRequest;
	}

	public void setSettlementTimeRequest(com.tools20022.repository.entity.SettlementTimeRequest settlementTimeRequest) {
		this.settlementTimeRequest = settlementTimeRequest;
	}

	public CurrencyAndAmount getAmount() {
		return amount;
	}

	public void setAmount(CurrencyAndAmount amount) {
		this.amount = amount;
	}

	public List<CommercialTradeSettlement> getTradeSettlement() {
		return tradeSettlement;
	}

	public void setTradeSettlement(List<com.tools20022.repository.entity.CommercialTradeSettlement> tradeSettlement) {
		this.tradeSettlement = tradeSettlement;
	}

	public Max140Text getStandardSettlementInstructions() {
		return standardSettlementInstructions;
	}

	public void setStandardSettlementInstructions(Max140Text standardSettlementInstructions) {
		this.standardSettlementInstructions = standardSettlementInstructions;
	}

	public DebitAuthorisation getRelatedDebitAuthorisation() {
		return relatedDebitAuthorisation;
	}

	public void setRelatedDebitAuthorisation(com.tools20022.repository.entity.DebitAuthorisation relatedDebitAuthorisation) {
		this.relatedDebitAuthorisation = relatedDebitAuthorisation;
	}

	public PaymentInvestigationCaseResolution getRelatedInvestigationCaseResolution() {
		return relatedInvestigationCaseResolution;
	}

	public void setRelatedInvestigationCaseResolution(com.tools20022.repository.entity.PaymentInvestigationCaseResolution relatedInvestigationCaseResolution) {
		this.relatedInvestigationCaseResolution = relatedInvestigationCaseResolution;
	}

	public Payment getOriginalPayment() {
		return originalPayment;
	}

	public void setOriginalPayment(com.tools20022.repository.entity.Payment originalPayment) {
		this.originalPayment = originalPayment;
	}

	public List<Payment> getReturnPayment() {
		return returnPayment;
	}

	public void setReturnPayment(List<com.tools20022.repository.entity.Payment> returnPayment) {
		this.returnPayment = returnPayment;
	}

	public SecuritiesSettlement getRelatedSecuritiesSettlement() {
		return relatedSecuritiesSettlement;
	}

	public void setRelatedSecuritiesSettlement(com.tools20022.repository.entity.SecuritiesSettlement relatedSecuritiesSettlement) {
		this.relatedSecuritiesSettlement = relatedSecuritiesSettlement;
	}

	public List<Invoice> getInvoiceReconciliation() {
		return invoiceReconciliation;
	}

	public void setInvoiceReconciliation(List<com.tools20022.repository.entity.Invoice> invoiceReconciliation) {
		this.invoiceReconciliation = invoiceReconciliation;
	}

	public PaymentInstrumentCode getPaymentInstrument() {
		return paymentInstrument;
	}

	public void setPaymentInstrument(PaymentInstrumentCode paymentInstrument) {
		this.paymentInstrument = paymentInstrument;
	}

	public CashAccount getAccount() {
		return account;
	}

	public void setAccount(com.tools20022.repository.entity.CashAccount account) {
		this.account = account;
	}

	public Adjustment getAdjustments() {
		return adjustments;
	}

	public void setAdjustments(com.tools20022.repository.entity.Adjustment adjustments) {
		this.adjustments = adjustments;
	}

	public RegisteredContract getContractRegistration() {
		return contractRegistration;
	}

	public void setContractRegistration(com.tools20022.repository.entity.RegisteredContract contractRegistration) {
		this.contractRegistration = contractRegistration;
	}
}