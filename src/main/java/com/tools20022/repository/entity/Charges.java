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
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.Adjustment;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Amount of money associated with a service.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Charges" src="doc-files/Charges.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ChargeType2 ChargeType2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CalculationBasis1
 * CalculationBasis1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Charge9 Charge9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Charge15 Charge15}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ChargeTypeFormat2Choice
 * ChargeTypeFormat2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Charge4 Charge4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Charge20 Charge20}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ChargeTypeChoice
 * ChargeTypeChoice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ChargesInformation3
 * ChargesInformation3}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ChargeType2Choice
 * ChargeType2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ChargesInformation6
 * ChargesInformation6}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ChargeType3Choice
 * ChargeType3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ChargesRecord1 ChargesRecord1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Charges3 Charges3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ChargesRecord2 ChargesRecord2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Charges4 Charges4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ChargesInformation1
 * ChargesInformation1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ChargesInformation5
 * ChargesInformation5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ChargesInformation7
 * ChargesInformation7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Charges2 Charges2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Charge16 Charge16}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ChargeType1 ChargeType1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Charge11 Charge11}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Charge19 Charge19}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Charge8 Charge8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Charge17 Charge17}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Charge10 Charge10}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TotalCharges2 TotalCharges2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Charge18 Charge18}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TotalCharges3 TotalCharges3}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ChargeType2FormatChoice
 * ChargeType2FormatChoice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Charges1 Charges1}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ChargeTypeFormat3Choice
 * ChargeTypeFormat3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ChargesDetails2
 * ChargesDetails2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ChargesDetails1
 * ChargesDetails1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Charge12 Charge12}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Charge13 Charge13}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ChargeType1Choice
 * ChargeType1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.AmountRate1Choice
 * AmountRate1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Charge21 Charge21}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TotalCharges4 TotalCharges4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ChargesInformation2
 * ChargesInformation2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ChargesInformation4
 * ChargesInformation4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Charge23 Charge23}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TotalCharges5 TotalCharges5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Charge22 Charge22}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Charges5 Charges5}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ChargePaymentMethod1Choice
 * ChargePaymentMethod1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Charge24 Charge24}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ChargesDetails3
 * ChargesDetails3}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ChargesType1Choice
 * ChargesType1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Charge25 Charge25}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ChargesDetails4
 * ChargesDetails4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Charge26 Charge26}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Charge27 Charge27}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Charge29 Charge29}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Fee3 Fee3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Fee2 Fee2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Fee1 Fee1}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.CashAccount#mmCharges
 * CashAccount.mmCharges}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AccountService#mmAccountAdministrationCharge
 * AccountService.mmAccountAdministrationCharge}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashEntry#mmCharges
 * CashEntry.mmCharges}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#mmTransactionCharge
 * InvestmentFundTransaction.mmTransactionCharge}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmCharges
 * InterestCalculation.mmCharges}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Undertaking#mmCharges
 * Undertaking.mmCharges}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LineItem#mmLogisticsCharge
 * LineItem.mmLogisticsCharge}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LineItem#mmCharges
 * LineItem.mmCharges}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LineItem#mmNetPriceCharge
 * LineItem.mmNetPriceCharge}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Transport#mmTransportCharges
 * Transport.mmTransportCharges}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Charges3#mmRecord
 * Charges3.mmRecord}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ChargesRecord2#mmChargeIncludedIndicator
 * ChargesRecord2.mmChargeIncludedIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Charges4#mmRecord
 * Charges4.mmRecord}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation1#mmChargesInformation
 * PaymentTransactionInformation1.mmChargesInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation25#mmChargesInformation
 * PaymentTransactionInformation25.mmChargesInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction32#mmChargesInformation
 * PaymentTransaction32.mmChargesInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction46#mmChargesInformation
 * PaymentTransaction46.mmChargesInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation2#mmChargesInformation
 * CreditTransferTransactionInformation2.mmChargesInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation11#mmChargesInformation
 * CreditTransferTransactionInformation11.mmChargesInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction2#mmChargesInformation
 * CreditTransferTransaction2.mmChargesInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction7#mmChargesInformation
 * CreditTransferTransaction7.mmChargesInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation2#mmChargesInformation
 * DirectDebitTransactionInformation2.mmChargesInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation10#mmChargesInformation
 * DirectDebitTransactionInformation10.mmChargesInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation12#mmChargesInformation
 * DirectDebitTransactionInformation12.mmChargesInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation14#mmChargesInformation
 * DirectDebitTransactionInformation14.mmChargesInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation5#mmChargesInformation
 * PaymentTransactionInformation5.mmChargesInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation29#mmChargesInformation
 * PaymentTransactionInformation29.mmChargesInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction36#mmChargesInformation
 * PaymentTransaction36.mmChargesInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction45#mmChargesInformation
 * PaymentTransaction45.mmChargesInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation26#mmChargesInformation
 * PaymentTransactionInformation26.mmChargesInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction33#mmChargesInformation
 * PaymentTransaction33.mmChargesInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction43#mmChargesInformation
 * PaymentTransaction43.mmChargesInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation2#mmChargesInformation
 * PaymentTransactionInformation2.mmChargesInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation27#mmChargesInformation
 * PaymentTransactionInformation27.mmChargesInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction34#mmChargesInformation
 * PaymentTransaction34.mmChargesInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction44#mmChargesInformation
 * PaymentTransaction44.mmChargesInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation34#mmChargesInformation
 * PaymentTransactionInformation34.mmChargesInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction41#mmChargesInformation
 * PaymentTransaction41.mmChargesInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction49#mmChargesInformation
 * PaymentTransaction49.mmChargesInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RepairedConditions2#mmRepairedCharge
 * RepairedConditions2.mmRepairedCharge}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RepairedConditions3#mmRepairedCharge
 * RepairedConditions3.mmRepairedCharge}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TotalCharges2#mmChargeDetails
 * TotalCharges2.mmChargeDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TotalCharges3#mmChargeDetails
 * TotalCharges3.mmChargeDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashMovement1#mmCharges
 * CashMovement1.mmCharges}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Charge12#mmCharges
 * Charge12.mmCharges}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Charge13#mmCharges
 * Charge13.mmCharges}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Charge21#mmChargeAmountOrRate
 * Charge21.mmChargeAmountOrRate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TotalCharges4#mmChargeDetails
 * TotalCharges4.mmChargeDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation15#mmChargesInformation
 * PaymentTransactionInformation15.mmChargesInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation22#mmChargesInformation
 * PaymentTransactionInformation22.mmChargesInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation16#mmChargesInformation
 * PaymentTransactionInformation16.mmChargesInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation23#mmChargesInformation
 * PaymentTransactionInformation23.mmChargesInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation17#mmChargesInformation
 * PaymentTransactionInformation17.mmChargesInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation24#mmChargesInformation
 * PaymentTransactionInformation24.mmChargesInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation21#mmChargesInformation
 * PaymentTransactionInformation21.mmChargesInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation7#mmChargesInformation
 * CreditTransferTransactionInformation7.mmChargesInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation9#mmChargesInformation
 * CreditTransferTransactionInformation9.mmChargesInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation6#mmChargesInformation
 * DirectDebitTransactionInformation6.mmChargesInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation8#mmChargesInformation
 * DirectDebitTransactionInformation8.mmChargesInformation}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TotalCharges5#mmChargeDetails
 * TotalCharges5.mmChargeDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentObligation2#mmCharges
 * PaymentObligation2.mmCharges}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Charge24#mmCharges
 * Charge24.mmCharges}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Charge25#mmCharges
 * Charge25.mmCharges}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RecurringTransaction2#mmCharges
 * RecurringTransaction2.mmCharges}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction50#mmChargesInformation
 * PaymentTransaction50.mmChargesInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction19#mmChargesInformation
 * CreditTransferTransaction19.mmChargesInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation17#mmChargesInformation
 * DirectDebitTransactionInformation17.mmChargesInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction52#mmChargesInformation
 * PaymentTransaction52.mmChargesInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction51#mmChargesInformation
 * PaymentTransaction51.mmChargesInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction57#mmChargesInformation
 * PaymentTransaction57.mmChargesInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction59#mmChargesInformation
 * PaymentTransaction59.mmChargesInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction25#mmChargesInformation
 * CreditTransferTransaction25.mmChargesInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction65#mmChargesInformation
 * PaymentTransaction65.mmChargesInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation20#mmChargesInformation
 * DirectDebitTransactionInformation20.mmChargesInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction63#mmChargesInformation
 * PaymentTransaction63.mmChargesInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction60#mmChargesInformation
 * PaymentTransaction60.mmChargesInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction68#mmChargesInformation
 * PaymentTransaction68.mmChargesInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction69#mmChargesInformation
 * PaymentTransaction69.mmChargesInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason7#mmRepairedFee
 * IndividualOrderStatusAndReason7.mmRepairedFee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TotalFeesAndTaxes40#mmTotalFees
 * TotalFeesAndTaxes40.mmTotalFees}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TotalFeesAndTaxes40#mmIndividualFee
 * TotalFeesAndTaxes40.mmIndividualFee}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Fee2#mmDiscountDetails
 * Fee2.mmDiscountDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Fee1#mmDiscountDetails
 * Fee1.mmDiscountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwitchLegReferences2#mmRepairedFee
 * SwitchLegReferences2.mmRepairedFee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation21#mmChargesInformation
 * DirectDebitTransactionInformation21.mmChargesInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction80#mmChargesInformation
 * PaymentTransaction80.mmChargesInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction81#mmChargesInformation
 * PaymentTransaction81.mmChargesInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction76#mmChargesInformation
 * PaymentTransaction76.mmChargesInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction83#mmChargesInformation
 * PaymentTransaction83.mmChargesInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction82#mmChargesInformation
 * PaymentTransaction82.mmChargesInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Adjustment
 * Adjustment}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesRelatedFees
 * SecuritiesRelatedFees}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionFeesAndCharges
 * CorporateActionFeesAndCharges}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Charges#mmChargeType
 * Charges.mmChargeType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Charges#mmCalculationBasis
 * Charges.mmCalculationBasis}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Charges#mmBearerType
 * Charges.mmBearerType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Charges#mmChargesDebitAccount
 * Charges.mmChargesDebitAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Charges#mmCashEntry
 * Charges.mmCashEntry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Charges#mmCreditDebitIndicator
 * Charges.mmCreditDebitIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Charges#mmMaximumAmount
 * Charges.mmMaximumAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Charges#mmInvestmentFundTransaction
 * Charges.mmInvestmentFundTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Charges#mmLogisticsChargeLineItem
 * Charges.mmLogisticsChargeLineItem}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Charges#mmTransport
 * Charges.mmTransport}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Charges#mmServices
 * Charges.mmServices}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Charges#mmRelatedUndertaking
 * Charges.mmRelatedUndertaking}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Charges#mmLineItem
 * Charges.mmLineItem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Charges#mmNetPriceChargeLineItem
 * Charges.mmNetPriceChargeLineItem}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Charges#mmBaseAmount
 * Charges.mmBaseAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Charges#mmMaximumRate
 * Charges.mmMaximumRate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Charges#mmMinimumRate
 * Charges.mmMinimumRate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Charges#mmMinimumAmount
 * Charges.mmMinimumAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Charges#mmRelatedInterest
 * Charges.mmRelatedInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Charges#mmChargePaymentMethod
 * Charges.mmChargePaymentMethod}</li>
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
 * "Charges"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Amount of money associated with a service."</li>
 * </ul>
 */
public class Charges extends Adjustment {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected ChargeTypeCode chargeType;
	/**
	 * Type of service for which a charge is asked or paid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeTypeCode
	 * ChargeTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Charges
	 * Charges}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.ChargeType2#mmStructured
	 * ChargeType2.mmStructured}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ChargeType2#mmAdditionalInformation
	 * ChargeType2.mmAdditionalInformation}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge9#mmType
	 * Charge9.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge15#mmType
	 * Charge15.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge15#mmExtendedType
	 * Charge15.mmExtendedType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ChargeTypeFormat2Choice#mmUnstructured
	 * ChargeTypeFormat2Choice.mmUnstructured}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ChargeTypeFormat2Choice#mmStructured
	 * ChargeTypeFormat2Choice.mmStructured}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge4#mmType
	 * Charge4.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge20#mmType
	 * Charge20.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge20#mmExtendedType
	 * Charge20.mmExtendedType}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.ChargeTypeChoice#mmCode
	 * ChargeTypeChoice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ChargeTypeChoice#mmProprietaryCode
	 * ChargeTypeChoice.mmProprietaryCode}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ChargesInformation3#mmType
	 * ChargesInformation3.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ChargeType2Choice#mmCode
	 * ChargeType2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ChargeType2Choice#mmProprietary
	 * ChargeType2Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ChargesInformation6#mmType
	 * ChargesInformation6.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ChargeType3Choice#mmCode
	 * ChargeType3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ChargeType3Choice#mmProprietary
	 * ChargeType3Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ChargesRecord1#mmType
	 * ChargesRecord1.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ChargesRecord2#mmType
	 * ChargesRecord2.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge16#mmType
	 * Charge16.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge16#mmExtendedType
	 * Charge16.mmExtendedType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ChargeType1#mmStructured
	 * ChargeType1.mmStructured}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ChargeType1#mmAdditionalInformation
	 * ChargeType1.mmAdditionalInformation}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge11#mmType
	 * Charge11.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge19#mmType
	 * Charge19.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge19#mmExtendedType
	 * Charge19.mmExtendedType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge8#mmType
	 * Charge8.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge17#mmType
	 * Charge17.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge17#mmExtendedType
	 * Charge17.mmExtendedType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge10#mmType
	 * Charge10.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge18#mmType
	 * Charge18.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge18#mmExtendedType
	 * Charge18.mmExtendedType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ChargeType2FormatChoice#mmCode
	 * ChargeType2FormatChoice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ChargeType2FormatChoice#mmProprietary
	 * ChargeType2FormatChoice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charges1#mmType
	 * Charges1.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ChargeTypeFormat3Choice#mmCode
	 * ChargeTypeFormat3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ChargeTypeFormat3Choice#mmProprietary
	 * ChargeTypeFormat3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DiscountOrChargeType1Choice#mmChargeType
	 * DiscountOrChargeType1Choice.mmChargeType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ChargesDetails2#mmType
	 * ChargesDetails2.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ChargesDetails2#mmOtherChargesType
	 * ChargesDetails2.mmOtherChargesType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ChargesDetails1#mmType
	 * ChargesDetails1.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ChargesDetails1#mmOtherChargesType
	 * ChargesDetails1.mmOtherChargesType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ChargeType1Choice#mmType
	 * ChargeType1Choice.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ChargeType1Choice#mmProprietary
	 * ChargeType1Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge21#mmChargeType
	 * Charge21.mmChargeType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge23#mmType
	 * Charge23.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge22#mmType
	 * Charge22.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charges5#mmType
	 * Charges5.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ChargesDetails3#mmType
	 * ChargesDetails3.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ChargesType1Choice#mmType
	 * ChargesType1Choice.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ChargesType1Choice#mmOtherChargesType
	 * ChargesType1Choice.mmOtherChargesType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ChargesDetails4#mmChargesType
	 * ChargesDetails4.mmChargesType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge26#mmType
	 * Charge26.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ChargeType4Choice#mmCode
	 * ChargeType4Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ChargeType4Choice#mmProprietary
	 * ChargeType4Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge27#mmType
	 * Charge27.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge29#mmType
	 * Charge29.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ChargeType5Choice#mmCode
	 * ChargeType5Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ChargeType5Choice#mmProprietary
	 * ChargeType5Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Fee3#mmType Fee3.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Fee2#mmType Fee2.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Fee1#mmType Fee1.mmType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargeType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of service for which a charge is asked or paid."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmChargeType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(ChargeType2.mmStructured, ChargeType2.mmAdditionalInformation, Charge9.mmType, Charge15.mmType, Charge15.mmExtendedType, ChargeTypeFormat2Choice.mmUnstructured,
					ChargeTypeFormat2Choice.mmStructured, Charge4.mmType, Charge20.mmType, Charge20.mmExtendedType, ChargeTypeChoice.mmCode, ChargeTypeChoice.mmProprietaryCode, ChargesInformation3.mmType, ChargeType2Choice.mmCode,
					ChargeType2Choice.mmProprietary, ChargesInformation6.mmType, ChargeType3Choice.mmCode, ChargeType3Choice.mmProprietary, ChargesRecord1.mmType, ChargesRecord2.mmType, Charge16.mmType, Charge16.mmExtendedType,
					ChargeType1.mmStructured, ChargeType1.mmAdditionalInformation, Charge11.mmType, Charge19.mmType, Charge19.mmExtendedType, Charge8.mmType, Charge17.mmType, Charge17.mmExtendedType, Charge10.mmType, Charge18.mmType,
					Charge18.mmExtendedType, ChargeType2FormatChoice.mmCode, ChargeType2FormatChoice.mmProprietary, Charges1.mmType, ChargeTypeFormat3Choice.mmCode, ChargeTypeFormat3Choice.mmProprietary,
					DiscountOrChargeType1Choice.mmChargeType, ChargesDetails2.mmType, ChargesDetails2.mmOtherChargesType, ChargesDetails1.mmType, ChargesDetails1.mmOtherChargesType, ChargeType1Choice.mmType,
					ChargeType1Choice.mmProprietary, Charge21.mmChargeType, Charge23.mmType, Charge22.mmType, Charges5.mmType, ChargesDetails3.mmType, ChargesType1Choice.mmType, ChargesType1Choice.mmOtherChargesType,
					ChargesDetails4.mmChargesType, Charge26.mmType, ChargeType4Choice.mmCode, ChargeType4Choice.mmProprietary, Charge27.mmType, Charge29.mmType, ChargeType5Choice.mmCode, ChargeType5Choice.mmProprietary, Fee3.mmType,
					Fee2.mmType, Fee1.mmType);
			elementContext_lazy = () -> Charges.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ChargeType";
			definition = "Type of service for which a charge is asked or paid.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ChargeTypeCode.mmObject();
		}
	};
	protected CalculationBasisCode calculationBasis;
	/**
	 * Calculation basis for the charge or fee.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationBasisCode
	 * CalculationBasisCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Charges
	 * Charges}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CalculationBasis1#mmStructured
	 * CalculationBasis1.mmStructured}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CalculationBasis1#mmAdditionalInformation
	 * CalculationBasis1.mmAdditionalInformation}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge9#mmCalculationBasis
	 * Charge9.mmCalculationBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Charge15#mmCalculationBasis
	 * Charge15.mmCalculationBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Charge15#mmExtendedCalculationBasis
	 * Charge15.mmExtendedCalculationBasis}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CalculationBasis"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Calculation basis for the charge or fee."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCalculationBasis = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CalculationBasis1.mmStructured, CalculationBasis1.mmAdditionalInformation, Charge9.mmCalculationBasis, Charge15.mmCalculationBasis, Charge15.mmExtendedCalculationBasis);
			elementContext_lazy = () -> Charges.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CalculationBasis";
			definition = "Calculation basis for the charge or fee.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CalculationBasisCode.mmObject();
		}
	};
	protected ChargeBearerTypeCode bearerType;
	/**
	 * Specifies which party/parties will bear the charges associated with the
	 * processing of the payment transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeBearerTypeCode
	 * ChargeBearerTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Charges
	 * Charges}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge4#mmChargeBearer
	 * Charge4.mmChargeBearer}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge20#mmChargeBearer
	 * Charge20.mmChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ChargesInformation3#mmBearer
	 * ChargesInformation3.mmBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ChargesInformation6#mmBearer
	 * ChargesInformation6.mmBearer}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ChargesRecord1#mmBearer
	 * ChargesRecord1.mmBearer}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ChargesRecord2#mmBearer
	 * ChargesRecord2.mmBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation1#mmChargeBearer
	 * CreditTransferTransactionInformation1.mmChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionInformation1#mmChargeBearer
	 * PaymentInstructionInformation1.mmChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation10#mmChargeBearer
	 * CreditTransferTransactionInformation10.mmChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionInformation3#mmChargeBearer
	 * PaymentInstructionInformation3.mmChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction1#mmChargeBearer
	 * CreditTransferTransaction1.mmChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction6#mmChargeBearer
	 * PaymentInstruction6.mmChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction6#mmChargeBearer
	 * CreditTransferTransaction6.mmChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction9#mmChargeBearer
	 * PaymentInstruction9.mmChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation1#mmChargeBearer
	 * DirectDebitTransactionInformation1.mmChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionInformation2#mmChargeBearer
	 * PaymentInstructionInformation2.mmChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation9#mmChargeBearer
	 * DirectDebitTransactionInformation9.mmChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionInformation4#mmChargeBearer
	 * PaymentInstructionInformation4.mmChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation11#mmChargeBearer
	 * DirectDebitTransactionInformation11.mmChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction7#mmChargeBearer
	 * PaymentInstruction7.mmChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation13#mmChargeBearer
	 * DirectDebitTransactionInformation13.mmChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction10#mmChargeBearer
	 * PaymentInstruction10.mmChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation4#mmChargeBearer
	 * PaymentTransactionInformation4.mmChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation28#mmChargeBearer
	 * PaymentTransactionInformation28.mmChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction35#mmChargeBearer
	 * PaymentTransaction35.mmChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction42#mmChargeBearer
	 * PaymentTransaction42.mmChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation2#mmChargeBearer
	 * CreditTransferTransactionInformation2.mmChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation11#mmChargeBearer
	 * CreditTransferTransactionInformation11.mmChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction2#mmChargeBearer
	 * CreditTransferTransaction2.mmChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction7#mmChargeBearer
	 * CreditTransferTransaction7.mmChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation2#mmChargeBearer
	 * DirectDebitTransactionInformation2.mmChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation10#mmChargeBearer
	 * DirectDebitTransactionInformation10.mmChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation12#mmChargeBearer
	 * DirectDebitTransactionInformation12.mmChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation14#mmChargeBearer
	 * DirectDebitTransactionInformation14.mmChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation5#mmChargeBearer
	 * PaymentTransactionInformation5.mmChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation29#mmChargeBearer
	 * PaymentTransactionInformation29.mmChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction36#mmChargeBearer
	 * PaymentTransaction36.mmChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction45#mmChargeBearer
	 * PaymentTransaction45.mmChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation2#mmChargeBearer
	 * PaymentTransactionInformation2.mmChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation27#mmChargeBearer
	 * PaymentTransactionInformation27.mmChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction34#mmChargeBearer
	 * PaymentTransaction34.mmChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction44#mmChargeBearer
	 * PaymentTransaction44.mmChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation14#mmChargeBearer
	 * CreditTransferTransactionInformation14.mmChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction5#mmChargeBearer
	 * PaymentInstruction5.mmChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction5#mmChargeBearer
	 * CreditTransferTransaction5.mmChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction8#mmChargeBearer
	 * PaymentInstruction8.mmChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction10#mmChargeBearer
	 * CreditTransferTransaction10.mmChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction11#mmChargeBearer
	 * PaymentInstruction11.mmChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification2#mmChargeBearer
	 * RequestedModification2.mmChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation2#mmChargeBearer
	 * PaymentComplementaryInformation2.mmChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation3#mmChargeBearer
	 * PaymentComplementaryInformation3.mmChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification3#mmChargeBearer
	 * RequestedModification3.mmChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation13#mmChargeBearer
	 * PaymentTransactionInformation13.mmChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation18#mmChargeBearer
	 * PaymentTransactionInformation18.mmChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation14#mmChargeBearer
	 * PaymentTransactionInformation14.mmChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation20#mmChargeBearer
	 * PaymentTransactionInformation20.mmChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation16#mmChargeBearer
	 * PaymentTransactionInformation16.mmChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation23#mmChargeBearer
	 * PaymentTransactionInformation23.mmChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation17#mmChargeBearer
	 * PaymentTransactionInformation17.mmChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation24#mmChargeBearer
	 * PaymentTransactionInformation24.mmChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation21#mmChargeBearer
	 * PaymentTransactionInformation21.mmChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation6#mmChargeBearer
	 * CreditTransferTransactionInformation6.mmChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation8#mmChargeBearer
	 * CreditTransferTransactionInformation8.mmChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation7#mmChargeBearer
	 * CreditTransferTransactionInformation7.mmChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation9#mmChargeBearer
	 * CreditTransferTransactionInformation9.mmChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation5#mmChargeBearer
	 * DirectDebitTransactionInformation5.mmChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation7#mmChargeBearer
	 * DirectDebitTransactionInformation7.mmChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation6#mmChargeBearer
	 * DirectDebitTransactionInformation6.mmChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation8#mmChargeBearer
	 * DirectDebitTransactionInformation8.mmChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction16#mmChargeBearer
	 * PaymentInstruction16.mmChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation4#mmChargeBearer
	 * PaymentComplementaryInformation4.mmChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction50#mmChargeBearer
	 * PaymentTransaction50.mmChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction19#mmChargeBearer
	 * CreditTransferTransaction19.mmChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation17#mmChargeBearer
	 * DirectDebitTransactionInformation17.mmChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction15#mmChargeBearer
	 * PaymentInstruction15.mmChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction51#mmChargeBearer
	 * PaymentTransaction51.mmChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification4#mmChargeBearer
	 * RequestedModification4.mmChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction56#mmChargeBearer
	 * PaymentTransaction56.mmChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation18#mmChargeBearer
	 * DirectDebitTransactionInformation18.mmChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction20#mmChargeBearer
	 * CreditTransferTransaction20.mmChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction17#mmChargeBearer
	 * PaymentInstruction17.mmChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction21#mmChargeBearer
	 * CreditTransferTransaction21.mmChargeBearer}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge27#mmChargeBearer
	 * Charge27.mmChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction18#mmChargeBearer
	 * PaymentInstruction18.mmChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification5#mmChargeBearer
	 * RequestedModification5.mmChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction25#mmChargeBearer
	 * CreditTransferTransaction25.mmChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction19#mmChargeBearer
	 * PaymentInstruction19.mmChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction65#mmChargeBearer
	 * PaymentTransaction65.mmChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation5#mmChargeBearer
	 * PaymentComplementaryInformation5.mmChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction20#mmChargeBearer
	 * PaymentInstruction20.mmChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation20#mmChargeBearer
	 * DirectDebitTransactionInformation20.mmChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction60#mmChargeBearer
	 * PaymentTransaction60.mmChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction26#mmChargeBearer
	 * CreditTransferTransaction26.mmChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation19#mmChargeBearer
	 * DirectDebitTransactionInformation19.mmChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction22#mmChargeBearer
	 * CreditTransferTransaction22.mmChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction64#mmChargeBearer
	 * PaymentTransaction64.mmChargeBearer}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge29#mmChargeBearer
	 * Charge29.mmChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction21#mmChargeBearer
	 * PaymentInstruction21.mmChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation21#mmChargeBearer
	 * DirectDebitTransactionInformation21.mmChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction81#mmChargeBearer
	 * PaymentTransaction81.mmChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification6#mmChargeBearer
	 * RequestedModification6.mmChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction23#mmChargeBearer
	 * PaymentInstruction23.mmChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction76#mmChargeBearer
	 * PaymentTransaction76.mmChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction22#mmChargeBearer
	 * PaymentInstruction22.mmChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction77#mmChargeBearer
	 * PaymentTransaction77.mmChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation22#mmChargeBearer
	 * DirectDebitTransactionInformation22.mmChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation6#mmChargeBearer
	 * PaymentComplementaryInformation6.mmChargeBearer}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BearerType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies which party/parties will bear the charges associated with the processing of the payment transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmBearerType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(Charge4.mmChargeBearer, Charge20.mmChargeBearer, ChargesInformation3.mmBearer, ChargesInformation6.mmBearer, ChargesRecord1.mmBearer, ChargesRecord2.mmBearer,
					CreditTransferTransactionInformation1.mmChargeBearer, PaymentInstructionInformation1.mmChargeBearer, CreditTransferTransactionInformation10.mmChargeBearer, PaymentInstructionInformation3.mmChargeBearer,
					CreditTransferTransaction1.mmChargeBearer, PaymentInstruction6.mmChargeBearer, CreditTransferTransaction6.mmChargeBearer, PaymentInstruction9.mmChargeBearer, DirectDebitTransactionInformation1.mmChargeBearer,
					PaymentInstructionInformation2.mmChargeBearer, DirectDebitTransactionInformation9.mmChargeBearer, PaymentInstructionInformation4.mmChargeBearer, DirectDebitTransactionInformation11.mmChargeBearer,
					PaymentInstruction7.mmChargeBearer, DirectDebitTransactionInformation13.mmChargeBearer, PaymentInstruction10.mmChargeBearer, PaymentTransactionInformation4.mmChargeBearer, PaymentTransactionInformation28.mmChargeBearer,
					PaymentTransaction35.mmChargeBearer, PaymentTransaction42.mmChargeBearer, CreditTransferTransactionInformation2.mmChargeBearer, CreditTransferTransactionInformation11.mmChargeBearer,
					CreditTransferTransaction2.mmChargeBearer, CreditTransferTransaction7.mmChargeBearer, DirectDebitTransactionInformation2.mmChargeBearer, DirectDebitTransactionInformation10.mmChargeBearer,
					DirectDebitTransactionInformation12.mmChargeBearer, DirectDebitTransactionInformation14.mmChargeBearer, PaymentTransactionInformation5.mmChargeBearer, PaymentTransactionInformation29.mmChargeBearer,
					PaymentTransaction36.mmChargeBearer, PaymentTransaction45.mmChargeBearer, PaymentTransactionInformation2.mmChargeBearer, PaymentTransactionInformation27.mmChargeBearer, PaymentTransaction34.mmChargeBearer,
					PaymentTransaction44.mmChargeBearer, CreditTransferTransactionInformation14.mmChargeBearer, PaymentInstruction5.mmChargeBearer, CreditTransferTransaction5.mmChargeBearer, PaymentInstruction8.mmChargeBearer,
					CreditTransferTransaction10.mmChargeBearer, PaymentInstruction11.mmChargeBearer, RequestedModification2.mmChargeBearer, PaymentComplementaryInformation2.mmChargeBearer, PaymentComplementaryInformation3.mmChargeBearer,
					RequestedModification3.mmChargeBearer, PaymentTransactionInformation13.mmChargeBearer, PaymentTransactionInformation18.mmChargeBearer, PaymentTransactionInformation14.mmChargeBearer,
					PaymentTransactionInformation20.mmChargeBearer, PaymentTransactionInformation16.mmChargeBearer, PaymentTransactionInformation23.mmChargeBearer, PaymentTransactionInformation17.mmChargeBearer,
					PaymentTransactionInformation24.mmChargeBearer, PaymentTransactionInformation21.mmChargeBearer, CreditTransferTransactionInformation6.mmChargeBearer, CreditTransferTransactionInformation8.mmChargeBearer,
					CreditTransferTransactionInformation7.mmChargeBearer, CreditTransferTransactionInformation9.mmChargeBearer, DirectDebitTransactionInformation5.mmChargeBearer, DirectDebitTransactionInformation7.mmChargeBearer,
					DirectDebitTransactionInformation6.mmChargeBearer, DirectDebitTransactionInformation8.mmChargeBearer, PaymentInstruction16.mmChargeBearer, PaymentComplementaryInformation4.mmChargeBearer,
					PaymentTransaction50.mmChargeBearer, CreditTransferTransaction19.mmChargeBearer, DirectDebitTransactionInformation17.mmChargeBearer, PaymentInstruction15.mmChargeBearer, PaymentTransaction51.mmChargeBearer,
					RequestedModification4.mmChargeBearer, PaymentTransaction56.mmChargeBearer, DirectDebitTransactionInformation18.mmChargeBearer, CreditTransferTransaction20.mmChargeBearer, PaymentInstruction17.mmChargeBearer,
					CreditTransferTransaction21.mmChargeBearer, Charge27.mmChargeBearer, PaymentInstruction18.mmChargeBearer, RequestedModification5.mmChargeBearer, CreditTransferTransaction25.mmChargeBearer,
					PaymentInstruction19.mmChargeBearer, PaymentTransaction65.mmChargeBearer, PaymentComplementaryInformation5.mmChargeBearer, PaymentInstruction20.mmChargeBearer, DirectDebitTransactionInformation20.mmChargeBearer,
					PaymentTransaction60.mmChargeBearer, CreditTransferTransaction26.mmChargeBearer, DirectDebitTransactionInformation19.mmChargeBearer, CreditTransferTransaction22.mmChargeBearer, PaymentTransaction64.mmChargeBearer,
					Charge29.mmChargeBearer, PaymentInstruction21.mmChargeBearer, DirectDebitTransactionInformation21.mmChargeBearer, PaymentTransaction81.mmChargeBearer, RequestedModification6.mmChargeBearer,
					PaymentInstruction23.mmChargeBearer, PaymentTransaction76.mmChargeBearer, PaymentInstruction22.mmChargeBearer, PaymentTransaction77.mmChargeBearer, DirectDebitTransactionInformation22.mmChargeBearer,
					PaymentComplementaryInformation6.mmChargeBearer);
			elementContext_lazy = () -> Charges.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BearerType";
			definition = "Specifies which party/parties will bear the charges associated with the processing of the payment transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ChargeBearerTypeCode.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.CashAccount> chargesDebitAccount;
	/**
	 * Account from which a charge is debited.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount#mmCharges
	 * CashAccount.mmCharges}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashAccount
	 * CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Charges
	 * Charges}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Account8Choice#mmChargesAccount
	 * Account8Choice.mmChargesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Account9Choice#mmChargesAccount
	 * Account9Choice.mmChargesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionInformation1#mmChargesAccount
	 * PaymentInstructionInformation1.mmChargesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionInformation3#mmChargesAccount
	 * PaymentInstructionInformation3.mmChargesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction6#mmChargesAccount
	 * PaymentInstruction6.mmChargesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction9#mmChargesAccount
	 * PaymentInstruction9.mmChargesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionInformation2#mmChargesAccount
	 * PaymentInstructionInformation2.mmChargesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionInformation4#mmChargesAccount
	 * PaymentInstructionInformation4.mmChargesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction7#mmChargesAccount
	 * PaymentInstruction7.mmChargesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction10#mmChargesAccount
	 * PaymentInstruction10.mmChargesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction16#mmChargesAccount
	 * PaymentInstruction16.mmChargesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction15#mmChargesAccount
	 * PaymentInstruction15.mmChargesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction18#mmChargesAccount
	 * PaymentInstruction18.mmChargesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction20#mmChargesAccount
	 * PaymentInstruction20.mmChargesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction21#mmChargesAccount
	 * PaymentInstruction21.mmChargesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction22#mmChargesAccount
	 * PaymentInstruction22.mmChargesAccount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargesDebitAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account from which a charge is debited."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmChargesDebitAccount = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(Account8Choice.mmChargesAccount, Account9Choice.mmChargesAccount, PaymentInstructionInformation1.mmChargesAccount, PaymentInstructionInformation3.mmChargesAccount,
					PaymentInstruction6.mmChargesAccount, PaymentInstruction9.mmChargesAccount, PaymentInstructionInformation2.mmChargesAccount, PaymentInstructionInformation4.mmChargesAccount, PaymentInstruction7.mmChargesAccount,
					PaymentInstruction10.mmChargesAccount, PaymentInstruction16.mmChargesAccount, PaymentInstruction15.mmChargesAccount, PaymentInstruction18.mmChargesAccount, PaymentInstruction20.mmChargesAccount,
					PaymentInstruction21.mmChargesAccount, PaymentInstruction22.mmChargesAccount);
			elementContext_lazy = () -> Charges.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ChargesDebitAccount";
			definition = "Account from which a charge is debited.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CashAccount.mmCharges;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashAccount.mmObject();
		}
	};
	protected CashEntry cashEntry;
	/**
	 * Entry which contains the charges.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashEntry#mmCharges
	 * CashEntry.mmCharges}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashEntry CashEntry}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Charges
	 * Charges}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashEntry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Entry which contains the charges."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCashEntry = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Charges.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashEntry";
			definition = "Entry which contains the charges.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CashEntry.mmCharges;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashEntry.mmObject();
		}
	};
	protected DebitCreditCode creditDebitIndicator;
	/**
	 * Indicates whether a charge is a credit or a debit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DebitCreditCode
	 * DebitCreditCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Charges
	 * Charges}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ChargesInformation6#mmCreditDebitIndicator
	 * ChargesInformation6.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ChargesRecord1#mmCreditDebitIndicator
	 * ChargesRecord1.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ChargesRecord2#mmCreditDebitIndicator
	 * ChargesRecord2.mmCreditDebitIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditDebitIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether a charge is a credit or a debit."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCreditDebitIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(ChargesInformation6.mmCreditDebitIndicator, ChargesRecord1.mmCreditDebitIndicator, ChargesRecord2.mmCreditDebitIndicator);
			elementContext_lazy = () -> Charges.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CreditDebitIndicator";
			definition = "Indicates whether a charge is a credit or a debit.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DebitCreditCode.mmObject();
		}
	};
	protected CurrencyAndAmount maximumAmount;
	/**
	 * Maximum amount of money asked or paid for the charge for example
	 * depending on the type of investors.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Charges
	 * Charges}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Maximum amount of money asked or paid for the charge for example depending on the type of investors."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmMaximumAmount = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Charges.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MaximumAmount";
			definition = "Maximum amount of money asked or paid for the charge for example depending on the type of investors.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	protected InvestmentFundTransaction investmentFundTransaction;
	/**
	 * Investment fund transaction for which charges are specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#mmTransactionCharge
	 * InvestmentFundTransaction.mmTransactionCharge}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction
	 * InvestmentFundTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Charges
	 * Charges}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentFundTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Investment fund transaction for which charges are specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmInvestmentFundTransaction = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Charges.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvestmentFundTransaction";
			definition = "Investment fund transaction for which charges are specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundTransaction.mmTransactionCharge;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentFundTransaction.mmObject();
		}
	};
	protected LineItem logisticsChargeLineItem;
	/**
	 * Specifies the line item to which the logistics charge applies.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.LineItem#mmLogisticsCharge
	 * LineItem.mmLogisticsCharge}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.LineItem LineItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Charges
	 * Charges}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LogisticsChargeLineItem"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the line item to which the logistics charge applies."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmLogisticsChargeLineItem = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Charges.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LogisticsChargeLineItem";
			definition = "Specifies the line item to which the logistics charge applies.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.LineItem.mmLogisticsCharge;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.LineItem.mmObject();
		}
	};
	protected Transport transport;
	/**
	 * Specifies the transport process to which the charges apply.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Transport#mmTransportCharges
	 * Transport.mmTransportCharges}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Transport Transport}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Charges
	 * Charges}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Transport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the transport process to which the charges apply."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmTransport = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Charges.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Transport";
			definition = "Specifies the transport process to which the charges apply.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Transport.mmTransportCharges;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Transport.mmObject();
		}
	};
	protected AccountService services;
	/**
	 * Account services for which account administration charges are specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AccountService#mmAccountAdministrationCharge
	 * AccountService.mmAccountAdministrationCharge}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.AccountService
	 * AccountService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Charges
	 * Charges}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Services"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account services for which account administration charges are specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmServices = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Charges.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Services";
			definition = "Account services for which account administration charges are specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.AccountService.mmAccountAdministrationCharge;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.AccountService.mmObject();
		}
	};
	protected Undertaking relatedUndertaking;
	/**
	 * Undertaking for which charges are specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking#mmCharges
	 * Undertaking.mmCharges}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Undertaking
	 * Undertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Charges
	 * Charges}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedUndertaking"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Undertaking for which charges are specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedUndertaking = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Charges.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedUndertaking";
			definition = "Undertaking for which charges are specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Undertaking.mmCharges;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Undertaking.mmObject();
		}
	};
	protected LineItem lineItem;
	/**
	 * Line item for which charges are specified
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.LineItem#mmCharges
	 * LineItem.mmCharges}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.LineItem LineItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Charges
	 * Charges}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LineItem"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Line item for which charges are specified"</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmLineItem = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Charges.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LineItem";
			definition = "Line item for which charges are specified";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.LineItem.mmCharges;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.LineItem.mmObject();
		}
	};
	protected LineItem netPriceChargeLineItem;
	/**
	 * Specifies the line item to which the net price charge applies.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.LineItem#mmNetPriceCharge
	 * LineItem.mmNetPriceCharge}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.LineItem LineItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Charges
	 * Charges}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetPriceChargeLineItem"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the line item to which the net price charge applies."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmNetPriceChargeLineItem = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Charges.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NetPriceChargeLineItem";
			definition = "Specifies the line item to which the net price charge applies.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.LineItem.mmNetPriceCharge;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.LineItem.mmObject();
		}
	};
	protected CurrencyAndAmount baseAmount;
	/**
	 * Amount on which the charges are calculated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Charges
	 * Charges}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BaseAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount on which the charges are calculated."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmBaseAmount = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Charges.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BaseAmount";
			definition = "Amount on which the charges are calculated.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	protected PercentageRate maximumRate;
	/**
	 * Maximum rate used to calculate the amount of the charge or fee for
	 * example depending on the type of investors.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Charges
	 * Charges}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Maximum rate used to calculate the amount of the charge or fee for example depending on the type of investors."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmMaximumRate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Charges.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MaximumRate";
			definition = "Maximum rate used to calculate the amount of the charge or fee for example depending on the type of investors.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	protected PercentageRate minimumRate;
	/**
	 * Minimum rate used to calculate the amount of the charge or fee for
	 * example depending on the type of investors.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Charges
	 * Charges}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum rate used to calculate the amount of the charge or fee for example depending on the type of investors."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmMinimumRate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Charges.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MinimumRate";
			definition = "Minimum rate used to calculate the amount of the charge or fee for example depending on the type of investors.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	protected CurrencyAndAmount minimumAmount;
	/**
	 * Minimum amount of money asked or paid for the charge for example
	 * depending on the type of investors.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Charges
	 * Charges}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum amount of money asked or paid for the charge for example depending on the type of investors."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmMinimumAmount = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Charges.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MinimumAmount";
			definition = "Minimum amount of money asked or paid for the charge for example depending on the type of investors.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.InterestCalculation> relatedInterest;
	/**
	 * Interest on which charges are applied.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmCharges
	 * InterestCalculation.mmCharges}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.InterestCalculation
	 * InterestCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Charges
	 * Charges}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedInterest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Interest on which charges are applied."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedInterest = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Charges.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedInterest";
			definition = "Interest on which charges are applied.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InterestCalculation.mmCharges;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InterestCalculation.mmObject();
		}
	};
	protected ChargePaymentMethodCode chargePaymentMethod;
	/**
	 * Specifies how charges are paid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ChargePaymentMethodCode
	 * ChargePaymentMethodCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Charges
	 * Charges}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer27#mmTransferExpensesPaymentType
	 * Transfer27.mmTransferExpensesPaymentType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer28#mmTransferExpensesPaymentType
	 * Transfer28.mmTransferExpensesPaymentType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer29#mmTransferExpensesPaymentType
	 * Transfer29.mmTransferExpensesPaymentType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ChargePaymentMethod1Choice#mmCode
	 * ChargePaymentMethod1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ChargePaymentMethod1Choice#mmProprietary
	 * ChargePaymentMethod1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer31#mmTransferExpensesPaymentType
	 * Transfer31.mmTransferExpensesPaymentType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer30#mmTransferExpensesPaymentType
	 * Transfer30.mmTransferExpensesPaymentType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer33#mmTransferExpensesPaymentType
	 * Transfer33.mmTransferExpensesPaymentType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargePaymentMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies how charges are paid."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmChargePaymentMethod = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(Transfer27.mmTransferExpensesPaymentType, Transfer28.mmTransferExpensesPaymentType, Transfer29.mmTransferExpensesPaymentType, ChargePaymentMethod1Choice.mmCode,
					ChargePaymentMethod1Choice.mmProprietary, Transfer31.mmTransferExpensesPaymentType, Transfer30.mmTransferExpensesPaymentType, Transfer33.mmTransferExpensesPaymentType);
			elementContext_lazy = () -> Charges.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ChargePaymentMethod";
			definition = "Specifies how charges are paid.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ChargePaymentMethodCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Charges";
				definition = "Amount of money associated with a service.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashAccount.mmCharges, com.tools20022.repository.entity.AccountService.mmAccountAdministrationCharge,
						com.tools20022.repository.entity.CashEntry.mmCharges, com.tools20022.repository.entity.InvestmentFundTransaction.mmTransactionCharge, com.tools20022.repository.entity.InterestCalculation.mmCharges,
						com.tools20022.repository.entity.Undertaking.mmCharges, com.tools20022.repository.entity.LineItem.mmLogisticsCharge, com.tools20022.repository.entity.LineItem.mmCharges,
						com.tools20022.repository.entity.LineItem.mmNetPriceCharge, com.tools20022.repository.entity.Transport.mmTransportCharges);
				derivationElement_lazy = () -> Arrays.asList(Charges3.mmRecord, ChargesRecord2.mmChargeIncludedIndicator, Charges4.mmRecord, PaymentTransactionInformation1.mmChargesInformation,
						PaymentTransactionInformation25.mmChargesInformation, PaymentTransaction32.mmChargesInformation, PaymentTransaction46.mmChargesInformation, CreditTransferTransactionInformation2.mmChargesInformation,
						CreditTransferTransactionInformation11.mmChargesInformation, CreditTransferTransaction2.mmChargesInformation, CreditTransferTransaction7.mmChargesInformation, DirectDebitTransactionInformation2.mmChargesInformation,
						DirectDebitTransactionInformation10.mmChargesInformation, DirectDebitTransactionInformation12.mmChargesInformation, DirectDebitTransactionInformation14.mmChargesInformation,
						PaymentTransactionInformation5.mmChargesInformation, PaymentTransactionInformation29.mmChargesInformation, PaymentTransaction36.mmChargesInformation, PaymentTransaction45.mmChargesInformation,
						PaymentTransactionInformation26.mmChargesInformation, PaymentTransaction33.mmChargesInformation, PaymentTransaction43.mmChargesInformation, PaymentTransactionInformation2.mmChargesInformation,
						PaymentTransactionInformation27.mmChargesInformation, PaymentTransaction34.mmChargesInformation, PaymentTransaction44.mmChargesInformation, PaymentTransactionInformation34.mmChargesInformation,
						PaymentTransaction41.mmChargesInformation, PaymentTransaction49.mmChargesInformation, RepairedConditions2.mmRepairedCharge, RepairedConditions3.mmRepairedCharge, TotalCharges2.mmChargeDetails,
						TotalCharges3.mmChargeDetails, CashMovement1.mmCharges, Charge12.mmCharges, Charge13.mmCharges, Charge21.mmChargeAmountOrRate, TotalCharges4.mmChargeDetails, PaymentTransactionInformation15.mmChargesInformation,
						PaymentTransactionInformation22.mmChargesInformation, PaymentTransactionInformation16.mmChargesInformation, PaymentTransactionInformation23.mmChargesInformation, PaymentTransactionInformation17.mmChargesInformation,
						PaymentTransactionInformation24.mmChargesInformation, PaymentTransactionInformation21.mmChargesInformation, CreditTransferTransactionInformation7.mmChargesInformation,
						CreditTransferTransactionInformation9.mmChargesInformation, DirectDebitTransactionInformation6.mmChargesInformation, DirectDebitTransactionInformation8.mmChargesInformation, TotalCharges5.mmChargeDetails,
						PaymentObligation2.mmCharges, Charge24.mmCharges, Charge25.mmCharges, RecurringTransaction2.mmCharges, PaymentTransaction50.mmChargesInformation, CreditTransferTransaction19.mmChargesInformation,
						DirectDebitTransactionInformation17.mmChargesInformation, PaymentTransaction52.mmChargesInformation, PaymentTransaction51.mmChargesInformation, PaymentTransaction57.mmChargesInformation,
						PaymentTransaction59.mmChargesInformation, CreditTransferTransaction25.mmChargesInformation, PaymentTransaction65.mmChargesInformation, DirectDebitTransactionInformation20.mmChargesInformation,
						PaymentTransaction63.mmChargesInformation, PaymentTransaction60.mmChargesInformation, PaymentTransaction68.mmChargesInformation, PaymentTransaction69.mmChargesInformation,
						IndividualOrderStatusAndReason7.mmRepairedFee, TotalFeesAndTaxes40.mmTotalFees, TotalFeesAndTaxes40.mmIndividualFee, Fee2.mmDiscountDetails, Fee1.mmDiscountDetails, SwitchLegReferences2.mmRepairedFee,
						DirectDebitTransactionInformation21.mmChargesInformation, PaymentTransaction80.mmChargesInformation, PaymentTransaction81.mmChargesInformation, PaymentTransaction76.mmChargesInformation,
						PaymentTransaction83.mmChargesInformation, PaymentTransaction82.mmChargesInformation);
				subType_lazy = () -> Arrays.asList(SecuritiesRelatedFees.mmObject(), CorporateActionFeesAndCharges.mmObject());
				superType_lazy = () -> Adjustment.mmObject();
				element_lazy = () -> Arrays.asList(Charges.mmChargeType, Charges.mmCalculationBasis, Charges.mmBearerType, Charges.mmChargesDebitAccount, Charges.mmCashEntry, Charges.mmCreditDebitIndicator, Charges.mmMaximumAmount,
						Charges.mmInvestmentFundTransaction, Charges.mmLogisticsChargeLineItem, Charges.mmTransport, Charges.mmServices, Charges.mmRelatedUndertaking, Charges.mmLineItem, Charges.mmNetPriceChargeLineItem,
						Charges.mmBaseAmount, Charges.mmMaximumRate, Charges.mmMinimumRate, Charges.mmMinimumAmount, Charges.mmRelatedInterest, Charges.mmChargePaymentMethod);
				derivationComponent_lazy = () -> Arrays.asList(ChargeType2.mmObject(), CalculationBasis1.mmObject(), Charge9.mmObject(), Charge15.mmObject(), ChargeTypeFormat2Choice.mmObject(), Charge4.mmObject(), Charge20.mmObject(),
						ChargeTypeChoice.mmObject(), ChargesInformation3.mmObject(), ChargeType2Choice.mmObject(), ChargesInformation6.mmObject(), ChargeType3Choice.mmObject(), ChargesRecord1.mmObject(), Charges3.mmObject(),
						ChargesRecord2.mmObject(), Charges4.mmObject(), ChargesInformation1.mmObject(), ChargesInformation5.mmObject(), ChargesInformation7.mmObject(), Charges2.mmObject(), Charge16.mmObject(), ChargeType1.mmObject(),
						Charge11.mmObject(), Charge19.mmObject(), Charge8.mmObject(), Charge17.mmObject(), Charge10.mmObject(), TotalCharges2.mmObject(), Charge18.mmObject(), TotalCharges3.mmObject(), ChargeType2FormatChoice.mmObject(),
						Charges1.mmObject(), ChargeTypeFormat3Choice.mmObject(), ChargesDetails2.mmObject(), ChargesDetails1.mmObject(), Charge12.mmObject(), Charge13.mmObject(), ChargeType1Choice.mmObject(), AmountRate1Choice.mmObject(),
						Charge21.mmObject(), TotalCharges4.mmObject(), ChargesInformation2.mmObject(), ChargesInformation4.mmObject(), Charge23.mmObject(), TotalCharges5.mmObject(), Charge22.mmObject(), Charges5.mmObject(),
						ChargePaymentMethod1Choice.mmObject(), Charge24.mmObject(), ChargesDetails3.mmObject(), ChargesType1Choice.mmObject(), Charge25.mmObject(), ChargesDetails4.mmObject(), Charge26.mmObject(), Charge27.mmObject(),
						Charge29.mmObject(), Fee3.mmObject(), Fee2.mmObject(), Fee1.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public ChargeTypeCode getChargeType() {
		return chargeType;
	}

	public void setChargeType(ChargeTypeCode chargeType) {
		this.chargeType = chargeType;
	}

	public CalculationBasisCode getCalculationBasis() {
		return calculationBasis;
	}

	public void setCalculationBasis(CalculationBasisCode calculationBasis) {
		this.calculationBasis = calculationBasis;
	}

	public ChargeBearerTypeCode getBearerType() {
		return bearerType;
	}

	public void setBearerType(ChargeBearerTypeCode bearerType) {
		this.bearerType = bearerType;
	}

	public List<CashAccount> getChargesDebitAccount() {
		return chargesDebitAccount;
	}

	public void setChargesDebitAccount(List<com.tools20022.repository.entity.CashAccount> chargesDebitAccount) {
		this.chargesDebitAccount = chargesDebitAccount;
	}

	public CashEntry getCashEntry() {
		return cashEntry;
	}

	public void setCashEntry(com.tools20022.repository.entity.CashEntry cashEntry) {
		this.cashEntry = cashEntry;
	}

	public DebitCreditCode getCreditDebitIndicator() {
		return creditDebitIndicator;
	}

	public void setCreditDebitIndicator(DebitCreditCode creditDebitIndicator) {
		this.creditDebitIndicator = creditDebitIndicator;
	}

	public CurrencyAndAmount getMaximumAmount() {
		return maximumAmount;
	}

	public void setMaximumAmount(CurrencyAndAmount maximumAmount) {
		this.maximumAmount = maximumAmount;
	}

	public InvestmentFundTransaction getInvestmentFundTransaction() {
		return investmentFundTransaction;
	}

	public void setInvestmentFundTransaction(com.tools20022.repository.entity.InvestmentFundTransaction investmentFundTransaction) {
		this.investmentFundTransaction = investmentFundTransaction;
	}

	public LineItem getLogisticsChargeLineItem() {
		return logisticsChargeLineItem;
	}

	public void setLogisticsChargeLineItem(com.tools20022.repository.entity.LineItem logisticsChargeLineItem) {
		this.logisticsChargeLineItem = logisticsChargeLineItem;
	}

	public Transport getTransport() {
		return transport;
	}

	public void setTransport(com.tools20022.repository.entity.Transport transport) {
		this.transport = transport;
	}

	public AccountService getServices() {
		return services;
	}

	public void setServices(com.tools20022.repository.entity.AccountService services) {
		this.services = services;
	}

	public Undertaking getRelatedUndertaking() {
		return relatedUndertaking;
	}

	public void setRelatedUndertaking(com.tools20022.repository.entity.Undertaking relatedUndertaking) {
		this.relatedUndertaking = relatedUndertaking;
	}

	public LineItem getLineItem() {
		return lineItem;
	}

	public void setLineItem(com.tools20022.repository.entity.LineItem lineItem) {
		this.lineItem = lineItem;
	}

	public LineItem getNetPriceChargeLineItem() {
		return netPriceChargeLineItem;
	}

	public void setNetPriceChargeLineItem(com.tools20022.repository.entity.LineItem netPriceChargeLineItem) {
		this.netPriceChargeLineItem = netPriceChargeLineItem;
	}

	public CurrencyAndAmount getBaseAmount() {
		return baseAmount;
	}

	public void setBaseAmount(CurrencyAndAmount baseAmount) {
		this.baseAmount = baseAmount;
	}

	public PercentageRate getMaximumRate() {
		return maximumRate;
	}

	public void setMaximumRate(PercentageRate maximumRate) {
		this.maximumRate = maximumRate;
	}

	public PercentageRate getMinimumRate() {
		return minimumRate;
	}

	public void setMinimumRate(PercentageRate minimumRate) {
		this.minimumRate = minimumRate;
	}

	public CurrencyAndAmount getMinimumAmount() {
		return minimumAmount;
	}

	public void setMinimumAmount(CurrencyAndAmount minimumAmount) {
		this.minimumAmount = minimumAmount;
	}

	public List<InterestCalculation> getRelatedInterest() {
		return relatedInterest;
	}

	public void setRelatedInterest(List<com.tools20022.repository.entity.InterestCalculation> relatedInterest) {
		this.relatedInterest = relatedInterest;
	}

	public ChargePaymentMethodCode getChargePaymentMethod() {
		return chargePaymentMethod;
	}

	public void setChargePaymentMethod(ChargePaymentMethodCode chargePaymentMethod) {
		this.chargePaymentMethod = chargePaymentMethod;
	}
}