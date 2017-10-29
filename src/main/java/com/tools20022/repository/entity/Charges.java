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
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.Adjustment;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Amount of money associated with a service.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Charges" src="doc-files/Charges.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Charges#ChargeType
 * Charges.ChargeType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Charges#CalculationBasis
 * Charges.CalculationBasis}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Charges#BearerType
 * Charges.BearerType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Charges#ChargesDebitAccount
 * Charges.ChargesDebitAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Charges#CashEntry
 * Charges.CashEntry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Charges#CreditDebitIndicator
 * Charges.CreditDebitIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Charges#MaximumAmount
 * Charges.MaximumAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Charges#InvestmentFundTransaction
 * Charges.InvestmentFundTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Charges#LogisticsChargeLineItem
 * Charges.LogisticsChargeLineItem}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Charges#Transport
 * Charges.Transport}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Charges#Services
 * Charges.Services}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Charges#RelatedUndertaking
 * Charges.RelatedUndertaking}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Charges#LineItem
 * Charges.LineItem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Charges#NetPriceChargeLineItem
 * Charges.NetPriceChargeLineItem}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Charges#BaseAmount
 * Charges.BaseAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Charges#MaximumRate
 * Charges.MaximumRate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Charges#MinimumRate
 * Charges.MinimumRate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Charges#MinimumAmount
 * Charges.MinimumAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Charges#RelatedInterest
 * Charges.RelatedInterest}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Charges#ChargePaymentMethod
 * Charges.ChargePaymentMethod}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.CashAccount#Charges
 * CashAccount.Charges}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AccountService#AccountAdministrationCharge
 * AccountService.AccountAdministrationCharge}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashEntry#Charges
 * CashEntry.Charges}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#TransactionCharge
 * InvestmentFundTransaction.TransactionCharge}</li>
 * <li>{@linkplain com.tools20022.repository.entity.InterestCalculation#Charges
 * InterestCalculation.Charges}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Undertaking#Charges
 * Undertaking.Charges}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LineItem#LogisticsCharge
 * LineItem.LogisticsCharge}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LineItem#Charges
 * LineItem.Charges}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LineItem#NetPriceCharge
 * LineItem.NetPriceCharge}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Transport#TransportCharges
 * Transport.TransportCharges}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Charges3#Record
 * Charges3.Record}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ChargesRecord2#ChargeIncludedIndicator
 * ChargesRecord2.ChargeIncludedIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Charges4#Record
 * Charges4.Record}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation1#ChargesInformation
 * PaymentTransactionInformation1.ChargesInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation25#ChargesInformation
 * PaymentTransactionInformation25.ChargesInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction32#ChargesInformation
 * PaymentTransaction32.ChargesInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction46#ChargesInformation
 * PaymentTransaction46.ChargesInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation2#ChargesInformation
 * CreditTransferTransactionInformation2.ChargesInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation11#ChargesInformation
 * CreditTransferTransactionInformation11.ChargesInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction2#ChargesInformation
 * CreditTransferTransaction2.ChargesInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction7#ChargesInformation
 * CreditTransferTransaction7.ChargesInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation2#ChargesInformation
 * DirectDebitTransactionInformation2.ChargesInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation10#ChargesInformation
 * DirectDebitTransactionInformation10.ChargesInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation12#ChargesInformation
 * DirectDebitTransactionInformation12.ChargesInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation14#ChargesInformation
 * DirectDebitTransactionInformation14.ChargesInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation5#ChargesInformation
 * PaymentTransactionInformation5.ChargesInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation29#ChargesInformation
 * PaymentTransactionInformation29.ChargesInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction36#ChargesInformation
 * PaymentTransaction36.ChargesInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction45#ChargesInformation
 * PaymentTransaction45.ChargesInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation26#ChargesInformation
 * PaymentTransactionInformation26.ChargesInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction33#ChargesInformation
 * PaymentTransaction33.ChargesInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction43#ChargesInformation
 * PaymentTransaction43.ChargesInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation2#ChargesInformation
 * PaymentTransactionInformation2.ChargesInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation27#ChargesInformation
 * PaymentTransactionInformation27.ChargesInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction34#ChargesInformation
 * PaymentTransaction34.ChargesInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction44#ChargesInformation
 * PaymentTransaction44.ChargesInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation34#ChargesInformation
 * PaymentTransactionInformation34.ChargesInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction41#ChargesInformation
 * PaymentTransaction41.ChargesInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction49#ChargesInformation
 * PaymentTransaction49.ChargesInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RepairedConditions2#RepairedCharge
 * RepairedConditions2.RepairedCharge}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RepairedConditions3#RepairedCharge
 * RepairedConditions3.RepairedCharge}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TotalCharges2#ChargeDetails
 * TotalCharges2.ChargeDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TotalCharges3#ChargeDetails
 * TotalCharges3.ChargeDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashMovement1#Charges
 * CashMovement1.Charges}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Charge12#Charges
 * Charge12.Charges}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Charge13#Charges
 * Charge13.Charges}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Charge21#ChargeAmountOrRate
 * Charge21.ChargeAmountOrRate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TotalCharges4#ChargeDetails
 * TotalCharges4.ChargeDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation15#ChargesInformation
 * PaymentTransactionInformation15.ChargesInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation22#ChargesInformation
 * PaymentTransactionInformation22.ChargesInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation16#ChargesInformation
 * PaymentTransactionInformation16.ChargesInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation23#ChargesInformation
 * PaymentTransactionInformation23.ChargesInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation17#ChargesInformation
 * PaymentTransactionInformation17.ChargesInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation24#ChargesInformation
 * PaymentTransactionInformation24.ChargesInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation21#ChargesInformation
 * PaymentTransactionInformation21.ChargesInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation7#ChargesInformation
 * CreditTransferTransactionInformation7.ChargesInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation9#ChargesInformation
 * CreditTransferTransactionInformation9.ChargesInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation6#ChargesInformation
 * DirectDebitTransactionInformation6.ChargesInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation8#ChargesInformation
 * DirectDebitTransactionInformation8.ChargesInformation}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TotalCharges5#ChargeDetails
 * TotalCharges5.ChargeDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentObligation2#Charges
 * PaymentObligation2.Charges}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Charge24#Charges
 * Charge24.Charges}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Charge25#Charges
 * Charge25.Charges}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RecurringTransaction2#Charges
 * RecurringTransaction2.Charges}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction50#ChargesInformation
 * PaymentTransaction50.ChargesInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction19#ChargesInformation
 * CreditTransferTransaction19.ChargesInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation17#ChargesInformation
 * DirectDebitTransactionInformation17.ChargesInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction52#ChargesInformation
 * PaymentTransaction52.ChargesInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction51#ChargesInformation
 * PaymentTransaction51.ChargesInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction57#ChargesInformation
 * PaymentTransaction57.ChargesInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction59#ChargesInformation
 * PaymentTransaction59.ChargesInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction25#ChargesInformation
 * CreditTransferTransaction25.ChargesInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction65#ChargesInformation
 * PaymentTransaction65.ChargesInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation20#ChargesInformation
 * DirectDebitTransactionInformation20.ChargesInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction63#ChargesInformation
 * PaymentTransaction63.ChargesInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction60#ChargesInformation
 * PaymentTransaction60.ChargesInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction68#ChargesInformation
 * PaymentTransaction68.ChargesInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction69#ChargesInformation
 * PaymentTransaction69.ChargesInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason7#RepairedFee
 * IndividualOrderStatusAndReason7.RepairedFee}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TotalFeesAndTaxes40#TotalFees
 * TotalFeesAndTaxes40.TotalFees}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TotalFeesAndTaxes40#IndividualFee
 * TotalFeesAndTaxes40.IndividualFee}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Fee2#DiscountDetails
 * Fee2.DiscountDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Fee1#DiscountDetails
 * Fee1.DiscountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwitchLegReferences2#RepairedFee
 * SwitchLegReferences2.RepairedFee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation21#ChargesInformation
 * DirectDebitTransactionInformation21.ChargesInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction80#ChargesInformation
 * PaymentTransaction80.ChargesInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction81#ChargesInformation
 * PaymentTransaction81.ChargesInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction76#ChargesInformation
 * PaymentTransaction76.ChargesInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction83#ChargesInformation
 * PaymentTransaction83.ChargesInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction82#ChargesInformation
 * PaymentTransaction82.ChargesInformation}</li>
 * </ul>
 * </li>
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
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Adjustment
 * Adjustment}</li>
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
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.ChargeType2#Structured
	 * ChargeType2.Structured}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ChargeType2#AdditionalInformation
	 * ChargeType2.AdditionalInformation}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge9#Type Charge9.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge15#Type
	 * Charge15.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge15#ExtendedType
	 * Charge15.ExtendedType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ChargeTypeFormat2Choice#Unstructured
	 * ChargeTypeFormat2Choice.Unstructured}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ChargeTypeFormat2Choice#Structured
	 * ChargeTypeFormat2Choice.Structured}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge4#Type Charge4.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge20#Type
	 * Charge20.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge20#ExtendedType
	 * Charge20.ExtendedType}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.ChargeTypeChoice#Code
	 * ChargeTypeChoice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ChargeTypeChoice#ProprietaryCode
	 * ChargeTypeChoice.ProprietaryCode}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ChargesInformation3#Type
	 * ChargesInformation3.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.ChargeType2Choice#Code
	 * ChargeType2Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ChargeType2Choice#Proprietary
	 * ChargeType2Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ChargesInformation6#Type
	 * ChargesInformation6.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.ChargeType3Choice#Code
	 * ChargeType3Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ChargeType3Choice#Proprietary
	 * ChargeType3Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ChargesRecord1#Type
	 * ChargesRecord1.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ChargesRecord2#Type
	 * ChargesRecord2.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge16#Type
	 * Charge16.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge16#ExtendedType
	 * Charge16.ExtendedType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ChargeType1#Structured
	 * ChargeType1.Structured}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ChargeType1#AdditionalInformation
	 * ChargeType1.AdditionalInformation}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge11#Type
	 * Charge11.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge19#Type
	 * Charge19.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge19#ExtendedType
	 * Charge19.ExtendedType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge8#Type Charge8.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge17#Type
	 * Charge17.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge17#ExtendedType
	 * Charge17.ExtendedType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge10#Type
	 * Charge10.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge18#Type
	 * Charge18.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge18#ExtendedType
	 * Charge18.ExtendedType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ChargeType2FormatChoice#Code
	 * ChargeType2FormatChoice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ChargeType2FormatChoice#Proprietary
	 * ChargeType2FormatChoice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charges1#Type
	 * Charges1.Type}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ChargeTypeFormat3Choice#Code
	 * ChargeTypeFormat3Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ChargeTypeFormat3Choice#Proprietary
	 * ChargeTypeFormat3Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DiscountOrChargeType1Choice#ChargeType
	 * DiscountOrChargeType1Choice.ChargeType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ChargesDetails2#Type
	 * ChargesDetails2.Type}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ChargesDetails2#OtherChargesType
	 * ChargesDetails2.OtherChargesType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ChargesDetails1#Type
	 * ChargesDetails1.Type}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ChargesDetails1#OtherChargesType
	 * ChargesDetails1.OtherChargesType}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.ChargeType1Choice#Type
	 * ChargeType1Choice.Type}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ChargeType1Choice#Proprietary
	 * ChargeType1Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge21#ChargeType
	 * Charge21.ChargeType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge23#Type
	 * Charge23.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge22#Type
	 * Charge22.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charges5#Type
	 * Charges5.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ChargesDetails3#Type
	 * ChargesDetails3.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.ChargesType1Choice#Type
	 * ChargesType1Choice.Type}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ChargesType1Choice#OtherChargesType
	 * ChargesType1Choice.OtherChargesType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ChargesDetails4#ChargesType
	 * ChargesDetails4.ChargesType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge26#Type
	 * Charge26.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.ChargeType4Choice#Code
	 * ChargeType4Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ChargeType4Choice#Proprietary
	 * ChargeType4Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge27#Type
	 * Charge27.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge29#Type
	 * Charge29.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.ChargeType5Choice#Code
	 * ChargeType5Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ChargeType5Choice#Proprietary
	 * ChargeType5Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Fee3#Type Fee3.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Fee2#Type Fee2.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Fee1#Type Fee1.Type}</li>
	 * </ul>
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
	 * name} = "ChargeType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of service for which a charge is asked or paid."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ChargeType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ChargeType2.Structured, com.tools20022.repository.msg.ChargeType2.AdditionalInformation, com.tools20022.repository.msg.Charge9.Type,
					com.tools20022.repository.msg.Charge15.Type, com.tools20022.repository.msg.Charge15.ExtendedType, com.tools20022.repository.choice.ChargeTypeFormat2Choice.Unstructured,
					com.tools20022.repository.choice.ChargeTypeFormat2Choice.Structured, com.tools20022.repository.msg.Charge4.Type, com.tools20022.repository.msg.Charge20.Type, com.tools20022.repository.msg.Charge20.ExtendedType,
					com.tools20022.repository.choice.ChargeTypeChoice.Code, com.tools20022.repository.choice.ChargeTypeChoice.ProprietaryCode, com.tools20022.repository.msg.ChargesInformation3.Type,
					com.tools20022.repository.choice.ChargeType2Choice.Code, com.tools20022.repository.choice.ChargeType2Choice.Proprietary, com.tools20022.repository.msg.ChargesInformation6.Type,
					com.tools20022.repository.choice.ChargeType3Choice.Code, com.tools20022.repository.choice.ChargeType3Choice.Proprietary, com.tools20022.repository.msg.ChargesRecord1.Type,
					com.tools20022.repository.msg.ChargesRecord2.Type, com.tools20022.repository.msg.Charge16.Type, com.tools20022.repository.msg.Charge16.ExtendedType, com.tools20022.repository.msg.ChargeType1.Structured,
					com.tools20022.repository.msg.ChargeType1.AdditionalInformation, com.tools20022.repository.msg.Charge11.Type, com.tools20022.repository.msg.Charge19.Type, com.tools20022.repository.msg.Charge19.ExtendedType,
					com.tools20022.repository.msg.Charge8.Type, com.tools20022.repository.msg.Charge17.Type, com.tools20022.repository.msg.Charge17.ExtendedType, com.tools20022.repository.msg.Charge10.Type,
					com.tools20022.repository.msg.Charge18.Type, com.tools20022.repository.msg.Charge18.ExtendedType, com.tools20022.repository.choice.ChargeType2FormatChoice.Code,
					com.tools20022.repository.choice.ChargeType2FormatChoice.Proprietary, com.tools20022.repository.msg.Charges1.Type, com.tools20022.repository.choice.ChargeTypeFormat3Choice.Code,
					com.tools20022.repository.choice.ChargeTypeFormat3Choice.Proprietary, com.tools20022.repository.choice.DiscountOrChargeType1Choice.ChargeType, com.tools20022.repository.msg.ChargesDetails2.Type,
					com.tools20022.repository.msg.ChargesDetails2.OtherChargesType, com.tools20022.repository.msg.ChargesDetails1.Type, com.tools20022.repository.msg.ChargesDetails1.OtherChargesType,
					com.tools20022.repository.choice.ChargeType1Choice.Type, com.tools20022.repository.choice.ChargeType1Choice.Proprietary, com.tools20022.repository.msg.Charge21.ChargeType, com.tools20022.repository.msg.Charge23.Type,
					com.tools20022.repository.msg.Charge22.Type, com.tools20022.repository.msg.Charges5.Type, com.tools20022.repository.msg.ChargesDetails3.Type, com.tools20022.repository.choice.ChargesType1Choice.Type,
					com.tools20022.repository.choice.ChargesType1Choice.OtherChargesType, com.tools20022.repository.msg.ChargesDetails4.ChargesType, com.tools20022.repository.msg.Charge26.Type,
					com.tools20022.repository.choice.ChargeType4Choice.Code, com.tools20022.repository.choice.ChargeType4Choice.Proprietary, com.tools20022.repository.msg.Charge27.Type, com.tools20022.repository.msg.Charge29.Type,
					com.tools20022.repository.choice.ChargeType5Choice.Code, com.tools20022.repository.choice.ChargeType5Choice.Proprietary, com.tools20022.repository.msg.Fee3.Type, com.tools20022.repository.msg.Fee2.Type,
					com.tools20022.repository.msg.Fee1.Type);
			elementContext_lazy = () -> Charges.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ChargeType";
			definition = "Type of service for which a charge is asked or paid.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ChargeTypeCode.mmObject();
		}
	};
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CalculationBasis1#Structured
	 * CalculationBasis1.Structured}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CalculationBasis1#AdditionalInformation
	 * CalculationBasis1.AdditionalInformation}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge9#CalculationBasis
	 * Charge9.CalculationBasis}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge15#CalculationBasis
	 * Charge15.CalculationBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Charge15#ExtendedCalculationBasis
	 * Charge15.ExtendedCalculationBasis}</li>
	 * </ul>
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
	 * name} = "CalculationBasis"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Calculation basis for the charge or fee."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CalculationBasis = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CalculationBasis1.Structured, com.tools20022.repository.msg.CalculationBasis1.AdditionalInformation, com.tools20022.repository.msg.Charge9.CalculationBasis,
					com.tools20022.repository.msg.Charge15.CalculationBasis, com.tools20022.repository.msg.Charge15.ExtendedCalculationBasis);
			elementContext_lazy = () -> Charges.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CalculationBasis";
			definition = "Calculation basis for the charge or fee.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CalculationBasisCode.mmObject();
		}
	};
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge4#ChargeBearer
	 * Charge4.ChargeBearer}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge20#ChargeBearer
	 * Charge20.ChargeBearer}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ChargesInformation3#Bearer
	 * ChargesInformation3.Bearer}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ChargesInformation6#Bearer
	 * ChargesInformation6.Bearer}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ChargesRecord1#Bearer
	 * ChargesRecord1.Bearer}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ChargesRecord2#Bearer
	 * ChargesRecord2.Bearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation1#ChargeBearer
	 * CreditTransferTransactionInformation1.ChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionInformation1#ChargeBearer
	 * PaymentInstructionInformation1.ChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation10#ChargeBearer
	 * CreditTransferTransactionInformation10.ChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionInformation3#ChargeBearer
	 * PaymentInstructionInformation3.ChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction1#ChargeBearer
	 * CreditTransferTransaction1.ChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction6#ChargeBearer
	 * PaymentInstruction6.ChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction6#ChargeBearer
	 * CreditTransferTransaction6.ChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction9#ChargeBearer
	 * PaymentInstruction9.ChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation1#ChargeBearer
	 * DirectDebitTransactionInformation1.ChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionInformation2#ChargeBearer
	 * PaymentInstructionInformation2.ChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation9#ChargeBearer
	 * DirectDebitTransactionInformation9.ChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionInformation4#ChargeBearer
	 * PaymentInstructionInformation4.ChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation11#ChargeBearer
	 * DirectDebitTransactionInformation11.ChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction7#ChargeBearer
	 * PaymentInstruction7.ChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation13#ChargeBearer
	 * DirectDebitTransactionInformation13.ChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction10#ChargeBearer
	 * PaymentInstruction10.ChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation4#ChargeBearer
	 * PaymentTransactionInformation4.ChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation28#ChargeBearer
	 * PaymentTransactionInformation28.ChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction35#ChargeBearer
	 * PaymentTransaction35.ChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction42#ChargeBearer
	 * PaymentTransaction42.ChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation2#ChargeBearer
	 * CreditTransferTransactionInformation2.ChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation11#ChargeBearer
	 * CreditTransferTransactionInformation11.ChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction2#ChargeBearer
	 * CreditTransferTransaction2.ChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction7#ChargeBearer
	 * CreditTransferTransaction7.ChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation2#ChargeBearer
	 * DirectDebitTransactionInformation2.ChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation10#ChargeBearer
	 * DirectDebitTransactionInformation10.ChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation12#ChargeBearer
	 * DirectDebitTransactionInformation12.ChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation14#ChargeBearer
	 * DirectDebitTransactionInformation14.ChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation5#ChargeBearer
	 * PaymentTransactionInformation5.ChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation29#ChargeBearer
	 * PaymentTransactionInformation29.ChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction36#ChargeBearer
	 * PaymentTransaction36.ChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction45#ChargeBearer
	 * PaymentTransaction45.ChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation2#ChargeBearer
	 * PaymentTransactionInformation2.ChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation27#ChargeBearer
	 * PaymentTransactionInformation27.ChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction34#ChargeBearer
	 * PaymentTransaction34.ChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction44#ChargeBearer
	 * PaymentTransaction44.ChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation14#ChargeBearer
	 * CreditTransferTransactionInformation14.ChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction5#ChargeBearer
	 * PaymentInstruction5.ChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction5#ChargeBearer
	 * CreditTransferTransaction5.ChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction8#ChargeBearer
	 * PaymentInstruction8.ChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction10#ChargeBearer
	 * CreditTransferTransaction10.ChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction11#ChargeBearer
	 * PaymentInstruction11.ChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification2#ChargeBearer
	 * RequestedModification2.ChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation2#ChargeBearer
	 * PaymentComplementaryInformation2.ChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation3#ChargeBearer
	 * PaymentComplementaryInformation3.ChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification3#ChargeBearer
	 * RequestedModification3.ChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation13#ChargeBearer
	 * PaymentTransactionInformation13.ChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation18#ChargeBearer
	 * PaymentTransactionInformation18.ChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation14#ChargeBearer
	 * PaymentTransactionInformation14.ChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation20#ChargeBearer
	 * PaymentTransactionInformation20.ChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation16#ChargeBearer
	 * PaymentTransactionInformation16.ChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation23#ChargeBearer
	 * PaymentTransactionInformation23.ChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation17#ChargeBearer
	 * PaymentTransactionInformation17.ChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation24#ChargeBearer
	 * PaymentTransactionInformation24.ChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation21#ChargeBearer
	 * PaymentTransactionInformation21.ChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation6#ChargeBearer
	 * CreditTransferTransactionInformation6.ChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation8#ChargeBearer
	 * CreditTransferTransactionInformation8.ChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation7#ChargeBearer
	 * CreditTransferTransactionInformation7.ChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation9#ChargeBearer
	 * CreditTransferTransactionInformation9.ChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation5#ChargeBearer
	 * DirectDebitTransactionInformation5.ChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation7#ChargeBearer
	 * DirectDebitTransactionInformation7.ChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation6#ChargeBearer
	 * DirectDebitTransactionInformation6.ChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation8#ChargeBearer
	 * DirectDebitTransactionInformation8.ChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction16#ChargeBearer
	 * PaymentInstruction16.ChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation4#ChargeBearer
	 * PaymentComplementaryInformation4.ChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction50#ChargeBearer
	 * PaymentTransaction50.ChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction19#ChargeBearer
	 * CreditTransferTransaction19.ChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation17#ChargeBearer
	 * DirectDebitTransactionInformation17.ChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction15#ChargeBearer
	 * PaymentInstruction15.ChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction51#ChargeBearer
	 * PaymentTransaction51.ChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification4#ChargeBearer
	 * RequestedModification4.ChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction56#ChargeBearer
	 * PaymentTransaction56.ChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation18#ChargeBearer
	 * DirectDebitTransactionInformation18.ChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction20#ChargeBearer
	 * CreditTransferTransaction20.ChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction17#ChargeBearer
	 * PaymentInstruction17.ChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction21#ChargeBearer
	 * CreditTransferTransaction21.ChargeBearer}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge27#ChargeBearer
	 * Charge27.ChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction18#ChargeBearer
	 * PaymentInstruction18.ChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification5#ChargeBearer
	 * RequestedModification5.ChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction25#ChargeBearer
	 * CreditTransferTransaction25.ChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction19#ChargeBearer
	 * PaymentInstruction19.ChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction65#ChargeBearer
	 * PaymentTransaction65.ChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation5#ChargeBearer
	 * PaymentComplementaryInformation5.ChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction20#ChargeBearer
	 * PaymentInstruction20.ChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation20#ChargeBearer
	 * DirectDebitTransactionInformation20.ChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction60#ChargeBearer
	 * PaymentTransaction60.ChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction26#ChargeBearer
	 * CreditTransferTransaction26.ChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation19#ChargeBearer
	 * DirectDebitTransactionInformation19.ChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction22#ChargeBearer
	 * CreditTransferTransaction22.ChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction64#ChargeBearer
	 * PaymentTransaction64.ChargeBearer}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge29#ChargeBearer
	 * Charge29.ChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction21#ChargeBearer
	 * PaymentInstruction21.ChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation21#ChargeBearer
	 * DirectDebitTransactionInformation21.ChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction81#ChargeBearer
	 * PaymentTransaction81.ChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification6#ChargeBearer
	 * RequestedModification6.ChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction23#ChargeBearer
	 * PaymentInstruction23.ChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction76#ChargeBearer
	 * PaymentTransaction76.ChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction22#ChargeBearer
	 * PaymentInstruction22.ChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction77#ChargeBearer
	 * PaymentTransaction77.ChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation22#ChargeBearer
	 * DirectDebitTransactionInformation22.ChargeBearer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation6#ChargeBearer
	 * PaymentComplementaryInformation6.ChargeBearer}</li>
	 * </ul>
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
	 * name} = "BearerType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies which party/parties will bear the charges associated with the processing of the payment transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute BearerType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Charge4.ChargeBearer, com.tools20022.repository.msg.Charge20.ChargeBearer, com.tools20022.repository.msg.ChargesInformation3.Bearer,
					com.tools20022.repository.msg.ChargesInformation6.Bearer, com.tools20022.repository.msg.ChargesRecord1.Bearer, com.tools20022.repository.msg.ChargesRecord2.Bearer,
					com.tools20022.repository.msg.CreditTransferTransactionInformation1.ChargeBearer, com.tools20022.repository.msg.PaymentInstructionInformation1.ChargeBearer,
					com.tools20022.repository.msg.CreditTransferTransactionInformation10.ChargeBearer, com.tools20022.repository.msg.PaymentInstructionInformation3.ChargeBearer,
					com.tools20022.repository.msg.CreditTransferTransaction1.ChargeBearer, com.tools20022.repository.msg.PaymentInstruction6.ChargeBearer, com.tools20022.repository.msg.CreditTransferTransaction6.ChargeBearer,
					com.tools20022.repository.msg.PaymentInstruction9.ChargeBearer, com.tools20022.repository.msg.DirectDebitTransactionInformation1.ChargeBearer, com.tools20022.repository.msg.PaymentInstructionInformation2.ChargeBearer,
					com.tools20022.repository.msg.DirectDebitTransactionInformation9.ChargeBearer, com.tools20022.repository.msg.PaymentInstructionInformation4.ChargeBearer,
					com.tools20022.repository.msg.DirectDebitTransactionInformation11.ChargeBearer, com.tools20022.repository.msg.PaymentInstruction7.ChargeBearer,
					com.tools20022.repository.msg.DirectDebitTransactionInformation13.ChargeBearer, com.tools20022.repository.msg.PaymentInstruction10.ChargeBearer, com.tools20022.repository.msg.PaymentTransactionInformation4.ChargeBearer,
					com.tools20022.repository.msg.PaymentTransactionInformation28.ChargeBearer, com.tools20022.repository.msg.PaymentTransaction35.ChargeBearer, com.tools20022.repository.msg.PaymentTransaction42.ChargeBearer,
					com.tools20022.repository.msg.CreditTransferTransactionInformation2.ChargeBearer, com.tools20022.repository.msg.CreditTransferTransactionInformation11.ChargeBearer,
					com.tools20022.repository.msg.CreditTransferTransaction2.ChargeBearer, com.tools20022.repository.msg.CreditTransferTransaction7.ChargeBearer,
					com.tools20022.repository.msg.DirectDebitTransactionInformation2.ChargeBearer, com.tools20022.repository.msg.DirectDebitTransactionInformation10.ChargeBearer,
					com.tools20022.repository.msg.DirectDebitTransactionInformation12.ChargeBearer, com.tools20022.repository.msg.DirectDebitTransactionInformation14.ChargeBearer,
					com.tools20022.repository.msg.PaymentTransactionInformation5.ChargeBearer, com.tools20022.repository.msg.PaymentTransactionInformation29.ChargeBearer, com.tools20022.repository.msg.PaymentTransaction36.ChargeBearer,
					com.tools20022.repository.msg.PaymentTransaction45.ChargeBearer, com.tools20022.repository.msg.PaymentTransactionInformation2.ChargeBearer, com.tools20022.repository.msg.PaymentTransactionInformation27.ChargeBearer,
					com.tools20022.repository.msg.PaymentTransaction34.ChargeBearer, com.tools20022.repository.msg.PaymentTransaction44.ChargeBearer, com.tools20022.repository.msg.CreditTransferTransactionInformation14.ChargeBearer,
					com.tools20022.repository.msg.PaymentInstruction5.ChargeBearer, com.tools20022.repository.msg.CreditTransferTransaction5.ChargeBearer, com.tools20022.repository.msg.PaymentInstruction8.ChargeBearer,
					com.tools20022.repository.msg.CreditTransferTransaction10.ChargeBearer, com.tools20022.repository.msg.PaymentInstruction11.ChargeBearer, com.tools20022.repository.msg.RequestedModification2.ChargeBearer,
					com.tools20022.repository.msg.PaymentComplementaryInformation2.ChargeBearer, com.tools20022.repository.msg.PaymentComplementaryInformation3.ChargeBearer,
					com.tools20022.repository.msg.RequestedModification3.ChargeBearer, com.tools20022.repository.msg.PaymentTransactionInformation13.ChargeBearer, com.tools20022.repository.msg.PaymentTransactionInformation18.ChargeBearer,
					com.tools20022.repository.msg.PaymentTransactionInformation14.ChargeBearer, com.tools20022.repository.msg.PaymentTransactionInformation20.ChargeBearer,
					com.tools20022.repository.msg.PaymentTransactionInformation16.ChargeBearer, com.tools20022.repository.msg.PaymentTransactionInformation23.ChargeBearer,
					com.tools20022.repository.msg.PaymentTransactionInformation17.ChargeBearer, com.tools20022.repository.msg.PaymentTransactionInformation24.ChargeBearer,
					com.tools20022.repository.msg.PaymentTransactionInformation21.ChargeBearer, com.tools20022.repository.msg.CreditTransferTransactionInformation6.ChargeBearer,
					com.tools20022.repository.msg.CreditTransferTransactionInformation8.ChargeBearer, com.tools20022.repository.msg.CreditTransferTransactionInformation7.ChargeBearer,
					com.tools20022.repository.msg.CreditTransferTransactionInformation9.ChargeBearer, com.tools20022.repository.msg.DirectDebitTransactionInformation5.ChargeBearer,
					com.tools20022.repository.msg.DirectDebitTransactionInformation7.ChargeBearer, com.tools20022.repository.msg.DirectDebitTransactionInformation6.ChargeBearer,
					com.tools20022.repository.msg.DirectDebitTransactionInformation8.ChargeBearer, com.tools20022.repository.msg.PaymentInstruction16.ChargeBearer,
					com.tools20022.repository.msg.PaymentComplementaryInformation4.ChargeBearer, com.tools20022.repository.msg.PaymentTransaction50.ChargeBearer, com.tools20022.repository.msg.CreditTransferTransaction19.ChargeBearer,
					com.tools20022.repository.msg.DirectDebitTransactionInformation17.ChargeBearer, com.tools20022.repository.msg.PaymentInstruction15.ChargeBearer, com.tools20022.repository.msg.PaymentTransaction51.ChargeBearer,
					com.tools20022.repository.msg.RequestedModification4.ChargeBearer, com.tools20022.repository.msg.PaymentTransaction56.ChargeBearer, com.tools20022.repository.msg.DirectDebitTransactionInformation18.ChargeBearer,
					com.tools20022.repository.msg.CreditTransferTransaction20.ChargeBearer, com.tools20022.repository.msg.PaymentInstruction17.ChargeBearer, com.tools20022.repository.msg.CreditTransferTransaction21.ChargeBearer,
					com.tools20022.repository.msg.Charge27.ChargeBearer, com.tools20022.repository.msg.PaymentInstruction18.ChargeBearer, com.tools20022.repository.msg.RequestedModification5.ChargeBearer,
					com.tools20022.repository.msg.CreditTransferTransaction25.ChargeBearer, com.tools20022.repository.msg.PaymentInstruction19.ChargeBearer, com.tools20022.repository.msg.PaymentTransaction65.ChargeBearer,
					com.tools20022.repository.msg.PaymentComplementaryInformation5.ChargeBearer, com.tools20022.repository.msg.PaymentInstruction20.ChargeBearer,
					com.tools20022.repository.msg.DirectDebitTransactionInformation20.ChargeBearer, com.tools20022.repository.msg.PaymentTransaction60.ChargeBearer, com.tools20022.repository.msg.CreditTransferTransaction26.ChargeBearer,
					com.tools20022.repository.msg.DirectDebitTransactionInformation19.ChargeBearer, com.tools20022.repository.msg.CreditTransferTransaction22.ChargeBearer, com.tools20022.repository.msg.PaymentTransaction64.ChargeBearer,
					com.tools20022.repository.msg.Charge29.ChargeBearer, com.tools20022.repository.msg.PaymentInstruction21.ChargeBearer, com.tools20022.repository.msg.DirectDebitTransactionInformation21.ChargeBearer,
					com.tools20022.repository.msg.PaymentTransaction81.ChargeBearer, com.tools20022.repository.msg.RequestedModification6.ChargeBearer, com.tools20022.repository.msg.PaymentInstruction23.ChargeBearer,
					com.tools20022.repository.msg.PaymentTransaction76.ChargeBearer, com.tools20022.repository.msg.PaymentInstruction22.ChargeBearer, com.tools20022.repository.msg.PaymentTransaction77.ChargeBearer,
					com.tools20022.repository.msg.DirectDebitTransactionInformation22.ChargeBearer, com.tools20022.repository.msg.PaymentComplementaryInformation6.ChargeBearer);
			elementContext_lazy = () -> Charges.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BearerType";
			definition = "Specifies which party/parties will bear the charges associated with the processing of the payment transaction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ChargeBearerTypeCode.mmObject();
		}
	};
	/**
	 * Account from which a charge is debited.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount#Charges
	 * CashAccount.Charges}</li>
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
	 * {@linkplain com.tools20022.repository.choice.Account8Choice#ChargesAccount
	 * Account8Choice.ChargesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Account9Choice#ChargesAccount
	 * Account9Choice.ChargesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionInformation1#ChargesAccount
	 * PaymentInstructionInformation1.ChargesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionInformation3#ChargesAccount
	 * PaymentInstructionInformation3.ChargesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction6#ChargesAccount
	 * PaymentInstruction6.ChargesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction9#ChargesAccount
	 * PaymentInstruction9.ChargesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionInformation2#ChargesAccount
	 * PaymentInstructionInformation2.ChargesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionInformation4#ChargesAccount
	 * PaymentInstructionInformation4.ChargesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction7#ChargesAccount
	 * PaymentInstruction7.ChargesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction10#ChargesAccount
	 * PaymentInstruction10.ChargesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction16#ChargesAccount
	 * PaymentInstruction16.ChargesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction15#ChargesAccount
	 * PaymentInstruction15.ChargesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction18#ChargesAccount
	 * PaymentInstruction18.ChargesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction20#ChargesAccount
	 * PaymentInstruction20.ChargesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction21#ChargesAccount
	 * PaymentInstruction21.ChargesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction22#ChargesAccount
	 * PaymentInstruction22.ChargesAccount}</li>
	 * </ul>
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
	 * name} = "ChargesDebitAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account from which a charge is debited."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ChargesDebitAccount = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.Account8Choice.ChargesAccount, com.tools20022.repository.choice.Account9Choice.ChargesAccount,
					com.tools20022.repository.msg.PaymentInstructionInformation1.ChargesAccount, com.tools20022.repository.msg.PaymentInstructionInformation3.ChargesAccount, com.tools20022.repository.msg.PaymentInstruction6.ChargesAccount,
					com.tools20022.repository.msg.PaymentInstruction9.ChargesAccount, com.tools20022.repository.msg.PaymentInstructionInformation2.ChargesAccount, com.tools20022.repository.msg.PaymentInstructionInformation4.ChargesAccount,
					com.tools20022.repository.msg.PaymentInstruction7.ChargesAccount, com.tools20022.repository.msg.PaymentInstruction10.ChargesAccount, com.tools20022.repository.msg.PaymentInstruction16.ChargesAccount,
					com.tools20022.repository.msg.PaymentInstruction15.ChargesAccount, com.tools20022.repository.msg.PaymentInstruction18.ChargesAccount, com.tools20022.repository.msg.PaymentInstruction20.ChargesAccount,
					com.tools20022.repository.msg.PaymentInstruction21.ChargesAccount, com.tools20022.repository.msg.PaymentInstruction22.ChargesAccount);
			elementContext_lazy = () -> Charges.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ChargesDebitAccount";
			definition = "Account from which a charge is debited.";
			minOccurs = 0;
			type_lazy = () -> CashAccount.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CashAccount.Charges;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Entry which contains the charges.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashEntry#Charges
	 * CashEntry.Charges}</li>
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
	public static final MMBusinessAssociationEnd CashEntry = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Charges.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashEntry";
			definition = "Entry which contains the charges.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.CashEntry.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CashEntry.Charges;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ChargesInformation6#CreditDebitIndicator
	 * ChargesInformation6.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ChargesRecord1#CreditDebitIndicator
	 * ChargesRecord1.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ChargesRecord2#CreditDebitIndicator
	 * ChargesRecord2.CreditDebitIndicator}</li>
	 * </ul>
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
	 * name} = "CreditDebitIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether a charge is a credit or a debit."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CreditDebitIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ChargesInformation6.CreditDebitIndicator, com.tools20022.repository.msg.ChargesRecord1.CreditDebitIndicator,
					com.tools20022.repository.msg.ChargesRecord2.CreditDebitIndicator);
			elementContext_lazy = () -> Charges.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CreditDebitIndicator";
			definition = "Indicates whether a charge is a credit or a debit.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> DebitCreditCode.mmObject();
		}
	};
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
	public static final MMBusinessAttribute MaximumAmount = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Charges.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MaximumAmount";
			definition = "Maximum amount of money asked or paid for the charge for example depending on the type of investors.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Investment fund transaction for which charges are specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#TransactionCharge
	 * InvestmentFundTransaction.TransactionCharge}</li>
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
	public static final MMBusinessAssociationEnd InvestmentFundTransaction = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Charges.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestmentFundTransaction";
			definition = "Investment fund transaction for which charges are specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentFundTransaction.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundTransaction.TransactionCharge;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the line item to which the logistics charge applies.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.LineItem#LogisticsCharge
	 * LineItem.LogisticsCharge}</li>
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
	public static final MMBusinessAssociationEnd LogisticsChargeLineItem = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Charges.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LogisticsChargeLineItem";
			definition = "Specifies the line item to which the logistics charge applies.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.LineItem.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.LineItem.LogisticsCharge;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the transport process to which the charges apply.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Transport#TransportCharges
	 * Transport.TransportCharges}</li>
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
	public static final MMBusinessAssociationEnd Transport = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Charges.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Transport";
			definition = "Specifies the transport process to which the charges apply.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Transport.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Transport.TransportCharges;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Account services for which account administration charges are specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AccountService#AccountAdministrationCharge
	 * AccountService.AccountAdministrationCharge}</li>
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
	public static final MMBusinessAssociationEnd Services = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Charges.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Services";
			definition = "Account services for which account administration charges are specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> AccountService.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.AccountService.AccountAdministrationCharge;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Undertaking for which charges are specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking#Charges
	 * Undertaking.Charges}</li>
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
	public static final MMBusinessAssociationEnd RelatedUndertaking = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Charges.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedUndertaking";
			definition = "Undertaking for which charges are specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Undertaking.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Undertaking.Charges;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Line item for which charges are specified
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.LineItem#Charges
	 * LineItem.Charges}</li>
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
	public static final MMBusinessAssociationEnd LineItem = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Charges.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LineItem";
			definition = "Line item for which charges are specified";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.LineItem.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.LineItem.Charges;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the line item to which the net price charge applies.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.LineItem#NetPriceCharge
	 * LineItem.NetPriceCharge}</li>
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
	public static final MMBusinessAssociationEnd NetPriceChargeLineItem = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Charges.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NetPriceChargeLineItem";
			definition = "Specifies the line item to which the net price charge applies.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.LineItem.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.LineItem.NetPriceCharge;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
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
	public static final MMBusinessAttribute BaseAmount = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Charges.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BaseAmount";
			definition = "Amount on which the charges are calculated.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
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
	public static final MMBusinessAttribute MaximumRate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Charges.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MaximumRate";
			definition = "Maximum rate used to calculate the amount of the charge or fee for example depending on the type of investors.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
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
	public static final MMBusinessAttribute MinimumRate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Charges.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MinimumRate";
			definition = "Minimum rate used to calculate the amount of the charge or fee for example depending on the type of investors.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
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
	public static final MMBusinessAttribute MinimumAmount = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Charges.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MinimumAmount";
			definition = "Minimum amount of money asked or paid for the charge for example depending on the type of investors.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Interest on which charges are applied.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation#Charges
	 * InterestCalculation.Charges}</li>
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
	public static final MMBusinessAssociationEnd RelatedInterest = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Charges.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedInterest";
			definition = "Interest on which charges are applied.";
			minOccurs = 0;
			type_lazy = () -> InterestCalculation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InterestCalculation.Charges;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer27#TransferExpensesPaymentType
	 * Transfer27.TransferExpensesPaymentType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer28#TransferExpensesPaymentType
	 * Transfer28.TransferExpensesPaymentType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer29#TransferExpensesPaymentType
	 * Transfer29.TransferExpensesPaymentType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ChargePaymentMethod1Choice#Code
	 * ChargePaymentMethod1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ChargePaymentMethod1Choice#Proprietary
	 * ChargePaymentMethod1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer31#TransferExpensesPaymentType
	 * Transfer31.TransferExpensesPaymentType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer30#TransferExpensesPaymentType
	 * Transfer30.TransferExpensesPaymentType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer33#TransferExpensesPaymentType
	 * Transfer33.TransferExpensesPaymentType}</li>
	 * </ul>
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
	 * name} = "ChargePaymentMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies how charges are paid."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ChargePaymentMethod = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Transfer27.TransferExpensesPaymentType, com.tools20022.repository.msg.Transfer28.TransferExpensesPaymentType,
					com.tools20022.repository.msg.Transfer29.TransferExpensesPaymentType, com.tools20022.repository.choice.ChargePaymentMethod1Choice.Code, com.tools20022.repository.choice.ChargePaymentMethod1Choice.Proprietary,
					com.tools20022.repository.msg.Transfer31.TransferExpensesPaymentType, com.tools20022.repository.msg.Transfer30.TransferExpensesPaymentType, com.tools20022.repository.msg.Transfer33.TransferExpensesPaymentType);
			elementContext_lazy = () -> Charges.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ChargePaymentMethod";
			definition = "Specifies how charges are paid.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ChargePaymentMethodCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Charges";
				definition = "Amount of money associated with a service.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashAccount.Charges, com.tools20022.repository.entity.AccountService.AccountAdministrationCharge,
						com.tools20022.repository.entity.CashEntry.Charges, com.tools20022.repository.entity.InvestmentFundTransaction.TransactionCharge, com.tools20022.repository.entity.InterestCalculation.Charges,
						com.tools20022.repository.entity.Undertaking.Charges, com.tools20022.repository.entity.LineItem.LogisticsCharge, com.tools20022.repository.entity.LineItem.Charges,
						com.tools20022.repository.entity.LineItem.NetPriceCharge, com.tools20022.repository.entity.Transport.TransportCharges);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Charges3.Record, com.tools20022.repository.msg.ChargesRecord2.ChargeIncludedIndicator, com.tools20022.repository.msg.Charges4.Record,
						com.tools20022.repository.msg.PaymentTransactionInformation1.ChargesInformation, com.tools20022.repository.msg.PaymentTransactionInformation25.ChargesInformation,
						com.tools20022.repository.msg.PaymentTransaction32.ChargesInformation, com.tools20022.repository.msg.PaymentTransaction46.ChargesInformation,
						com.tools20022.repository.msg.CreditTransferTransactionInformation2.ChargesInformation, com.tools20022.repository.msg.CreditTransferTransactionInformation11.ChargesInformation,
						com.tools20022.repository.msg.CreditTransferTransaction2.ChargesInformation, com.tools20022.repository.msg.CreditTransferTransaction7.ChargesInformation,
						com.tools20022.repository.msg.DirectDebitTransactionInformation2.ChargesInformation, com.tools20022.repository.msg.DirectDebitTransactionInformation10.ChargesInformation,
						com.tools20022.repository.msg.DirectDebitTransactionInformation12.ChargesInformation, com.tools20022.repository.msg.DirectDebitTransactionInformation14.ChargesInformation,
						com.tools20022.repository.msg.PaymentTransactionInformation5.ChargesInformation, com.tools20022.repository.msg.PaymentTransactionInformation29.ChargesInformation,
						com.tools20022.repository.msg.PaymentTransaction36.ChargesInformation, com.tools20022.repository.msg.PaymentTransaction45.ChargesInformation,
						com.tools20022.repository.msg.PaymentTransactionInformation26.ChargesInformation, com.tools20022.repository.msg.PaymentTransaction33.ChargesInformation,
						com.tools20022.repository.msg.PaymentTransaction43.ChargesInformation, com.tools20022.repository.msg.PaymentTransactionInformation2.ChargesInformation,
						com.tools20022.repository.msg.PaymentTransactionInformation27.ChargesInformation, com.tools20022.repository.msg.PaymentTransaction34.ChargesInformation,
						com.tools20022.repository.msg.PaymentTransaction44.ChargesInformation, com.tools20022.repository.msg.PaymentTransactionInformation34.ChargesInformation,
						com.tools20022.repository.msg.PaymentTransaction41.ChargesInformation, com.tools20022.repository.msg.PaymentTransaction49.ChargesInformation, com.tools20022.repository.msg.RepairedConditions2.RepairedCharge,
						com.tools20022.repository.msg.RepairedConditions3.RepairedCharge, com.tools20022.repository.msg.TotalCharges2.ChargeDetails, com.tools20022.repository.msg.TotalCharges3.ChargeDetails,
						com.tools20022.repository.msg.CashMovement1.Charges, com.tools20022.repository.msg.Charge12.Charges, com.tools20022.repository.msg.Charge13.Charges, com.tools20022.repository.msg.Charge21.ChargeAmountOrRate,
						com.tools20022.repository.msg.TotalCharges4.ChargeDetails, com.tools20022.repository.msg.PaymentTransactionInformation15.ChargesInformation,
						com.tools20022.repository.msg.PaymentTransactionInformation22.ChargesInformation, com.tools20022.repository.msg.PaymentTransactionInformation16.ChargesInformation,
						com.tools20022.repository.msg.PaymentTransactionInformation23.ChargesInformation, com.tools20022.repository.msg.PaymentTransactionInformation17.ChargesInformation,
						com.tools20022.repository.msg.PaymentTransactionInformation24.ChargesInformation, com.tools20022.repository.msg.PaymentTransactionInformation21.ChargesInformation,
						com.tools20022.repository.msg.CreditTransferTransactionInformation7.ChargesInformation, com.tools20022.repository.msg.CreditTransferTransactionInformation9.ChargesInformation,
						com.tools20022.repository.msg.DirectDebitTransactionInformation6.ChargesInformation, com.tools20022.repository.msg.DirectDebitTransactionInformation8.ChargesInformation,
						com.tools20022.repository.msg.TotalCharges5.ChargeDetails, com.tools20022.repository.msg.PaymentObligation2.Charges, com.tools20022.repository.msg.Charge24.Charges, com.tools20022.repository.msg.Charge25.Charges,
						com.tools20022.repository.msg.RecurringTransaction2.Charges, com.tools20022.repository.msg.PaymentTransaction50.ChargesInformation, com.tools20022.repository.msg.CreditTransferTransaction19.ChargesInformation,
						com.tools20022.repository.msg.DirectDebitTransactionInformation17.ChargesInformation, com.tools20022.repository.msg.PaymentTransaction52.ChargesInformation,
						com.tools20022.repository.msg.PaymentTransaction51.ChargesInformation, com.tools20022.repository.msg.PaymentTransaction57.ChargesInformation, com.tools20022.repository.msg.PaymentTransaction59.ChargesInformation,
						com.tools20022.repository.msg.CreditTransferTransaction25.ChargesInformation, com.tools20022.repository.msg.PaymentTransaction65.ChargesInformation,
						com.tools20022.repository.msg.DirectDebitTransactionInformation20.ChargesInformation, com.tools20022.repository.msg.PaymentTransaction63.ChargesInformation,
						com.tools20022.repository.msg.PaymentTransaction60.ChargesInformation, com.tools20022.repository.msg.PaymentTransaction68.ChargesInformation, com.tools20022.repository.msg.PaymentTransaction69.ChargesInformation,
						com.tools20022.repository.msg.IndividualOrderStatusAndReason7.RepairedFee, com.tools20022.repository.msg.TotalFeesAndTaxes40.TotalFees, com.tools20022.repository.msg.TotalFeesAndTaxes40.IndividualFee,
						com.tools20022.repository.msg.Fee2.DiscountDetails, com.tools20022.repository.msg.Fee1.DiscountDetails, com.tools20022.repository.msg.SwitchLegReferences2.RepairedFee,
						com.tools20022.repository.msg.DirectDebitTransactionInformation21.ChargesInformation, com.tools20022.repository.msg.PaymentTransaction80.ChargesInformation,
						com.tools20022.repository.msg.PaymentTransaction81.ChargesInformation, com.tools20022.repository.msg.PaymentTransaction76.ChargesInformation, com.tools20022.repository.msg.PaymentTransaction83.ChargesInformation,
						com.tools20022.repository.msg.PaymentTransaction82.ChargesInformation);
				subType_lazy = () -> Arrays.asList(SecuritiesRelatedFees.mmObject(), CorporateActionFeesAndCharges.mmObject());
				superType_lazy = () -> Adjustment.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Charges.ChargeType, com.tools20022.repository.entity.Charges.CalculationBasis, com.tools20022.repository.entity.Charges.BearerType,
						com.tools20022.repository.entity.Charges.ChargesDebitAccount, com.tools20022.repository.entity.Charges.CashEntry, com.tools20022.repository.entity.Charges.CreditDebitIndicator,
						com.tools20022.repository.entity.Charges.MaximumAmount, com.tools20022.repository.entity.Charges.InvestmentFundTransaction, com.tools20022.repository.entity.Charges.LogisticsChargeLineItem,
						com.tools20022.repository.entity.Charges.Transport, com.tools20022.repository.entity.Charges.Services, com.tools20022.repository.entity.Charges.RelatedUndertaking, com.tools20022.repository.entity.Charges.LineItem,
						com.tools20022.repository.entity.Charges.NetPriceChargeLineItem, com.tools20022.repository.entity.Charges.BaseAmount, com.tools20022.repository.entity.Charges.MaximumRate,
						com.tools20022.repository.entity.Charges.MinimumRate, com.tools20022.repository.entity.Charges.MinimumAmount, com.tools20022.repository.entity.Charges.RelatedInterest,
						com.tools20022.repository.entity.Charges.ChargePaymentMethod);
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
}