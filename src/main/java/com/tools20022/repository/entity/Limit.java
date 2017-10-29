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
import com.tools20022.repository.choice.CurrentLimitChoice;
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.codeset.FloorLimitTypeCode;
import com.tools20022.repository.codeset.FrequencyCode;
import com.tools20022.repository.codeset.LimitTypeCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.DecimalNumber;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Value used for risk containment in a system or towards counterparts. The
 * limit may be a current limit or a default limit.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Limit" src="doc-files/Limit.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Limit#Type Limit.Type}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Limit#Amount Limit.Amount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Limit#CreditDebitIndicator
 * Limit.CreditDebitIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Limit#UsedAmount
 * Limit.UsedAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Limit#UsedPercentage
 * Limit.UsedPercentage}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Limit#Currency
 * Limit.Currency}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Limit#LimitStatus
 * Limit.LimitStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Limit#Percentage
 * Limit.Percentage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Limit#RelatedDebitCreditFacility
 * Limit.RelatedDebitCreditFacility}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Limit#Periodicity
 * Limit.Periodicity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Limit#Quantity
 * Limit.Quantity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Limit#ValidityPeriod
 * Limit.ValidityPeriod}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Limit#RelatedPaymentCard
 * Limit.RelatedPaymentCard}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Limit#AvailableAmount
 * Limit.AvailableAmount}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.DateTimePeriod#RelatedLimit
 * DateTimePeriod.RelatedLimit}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentCard#Limit
 * PaymentCard.Limit}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LimitStatus#Limit
 * LimitStatus.Limit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DebitCreditFacility#CreditLine
 * DebitCreditFacility.CreditLine}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Limit1#Current Limit1.Current}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Limit1#Limit Limit1.Limit}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.RiskManagementLimit
 * RiskManagementLimit}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Reservation Reservation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LiquidityManagementLimit
 * LiquidityManagementLimit}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.LimitDetails2 LimitDetails2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LimitDetails4 LimitDetails4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LimitSearchCriteria1
 * LimitSearchCriteria1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LimitSearchCriteria2
 * LimitSearchCriteria2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LimitSearchCriteria3
 * LimitSearchCriteria3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Limit6 Limit6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LimitDetails LimitDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Limit5 Limit5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LimitDetails3 LimitDetails3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Limit4 Limit4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CreditLine1 CreditLine1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CreditLine2 CreditLine2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Limit2 Limit2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Limit1 Limit1}</li>
 * <li>{@linkplain com.tools20022.repository.choice.CurrentLimitChoice
 * CurrentLimitChoice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LimitAmount1 LimitAmount1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMTransactionAmounts4
 * ATMTransactionAmounts4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMTransactionAmounts2
 * ATMTransactionAmounts2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMTransactionAmounts3
 * ATMTransactionAmounts3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMTransactionAmounts8
 * ATMTransactionAmounts8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMTransactionAmounts9
 * ATMTransactionAmounts9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMTransactionAmounts6
 * ATMTransactionAmounts6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMTransactionAmounts7
 * ATMTransactionAmounts7}</li>
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
 * "Limit"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Value used for risk containment in a system or towards counterparts. The limit may be a current limit or a default limit."
 * </li>
 * </ul>
 */
public class Limit {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Nature of the limit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.LimitTypeCode
	 * LimitTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RiskManagementLimitIdentificationDetails#Type
	 * RiskManagementLimitIdentificationDetails.Type}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LimitIdentificationDetails1#Type
	 * LimitIdentificationDetails1.Type}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LimitIdentificationDetails2#Type
	 * LimitIdentificationDetails2.Type}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LimitIdentificationDetails3#Type
	 * LimitIdentificationDetails3.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.LimitType1Choice#Code
	 * LimitType1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.LimitType1Choice#Proprietary
	 * LimitType1Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LimitIdentification1#Type
	 * LimitIdentification1.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LimitIdentification2#Type
	 * LimitIdentification2.Type}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LimitSearchCriteria1#DefaultLimitType
	 * LimitSearchCriteria1.DefaultLimitType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LimitSearchCriteria1#CurrentLimitType
	 * LimitSearchCriteria1.CurrentLimitType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LimitSearchCriteria2#DefaultLimitType
	 * LimitSearchCriteria2.DefaultLimitType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LimitSearchCriteria2#CurrentLimitType
	 * LimitSearchCriteria2.CurrentLimitType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LimitSearchCriteria3#DefaultLimitType
	 * LimitSearchCriteria3.DefaultLimitType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LimitSearchCriteria3#CurrentLimitType
	 * LimitSearchCriteria3.CurrentLimitType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LimitIdentification4#Type
	 * LimitIdentification4.Type}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LimitUtilisationJournalSearchCriteria1#LimitType
	 * LimitUtilisationJournalSearchCriteria1.LimitType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransactionAmounts3#Type
	 * ATMTransactionAmounts3.Type}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransactionAmounts9#MediaType
	 * ATMTransactionAmounts9.MediaType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransactionAmounts7#Type
	 * ATMTransactionAmounts7.Type}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Limit
	 * Limit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Nature of the limit."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Type = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RiskManagementLimitIdentificationDetails.Type, com.tools20022.repository.msg.LimitIdentificationDetails1.Type,
					com.tools20022.repository.msg.LimitIdentificationDetails2.Type, com.tools20022.repository.msg.LimitIdentificationDetails3.Type, com.tools20022.repository.choice.LimitType1Choice.Code,
					com.tools20022.repository.choice.LimitType1Choice.Proprietary, com.tools20022.repository.msg.LimitIdentification1.Type, com.tools20022.repository.msg.LimitIdentification2.Type,
					com.tools20022.repository.msg.LimitSearchCriteria1.DefaultLimitType, com.tools20022.repository.msg.LimitSearchCriteria1.CurrentLimitType, com.tools20022.repository.msg.LimitSearchCriteria2.DefaultLimitType,
					com.tools20022.repository.msg.LimitSearchCriteria2.CurrentLimitType, com.tools20022.repository.msg.LimitSearchCriteria3.DefaultLimitType, com.tools20022.repository.msg.LimitSearchCriteria3.CurrentLimitType,
					com.tools20022.repository.msg.LimitIdentification4.Type, com.tools20022.repository.msg.LimitUtilisationJournalSearchCriteria1.LimitType, com.tools20022.repository.msg.ATMTransactionAmounts3.Type,
					com.tools20022.repository.msg.ATMTransactionAmounts9.MediaType, com.tools20022.repository.msg.ATMTransactionAmounts7.Type);
			elementContext_lazy = () -> Limit.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Nature of the limit.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> LimitTypeCode.mmObject();
		}
	};
	/**
	 * Amount of money of the limit, expressed in a currency.
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
	 * <li>{@linkplain com.tools20022.repository.msg.LimitDetails2#Amount
	 * LimitDetails2.Amount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LimitDetails4#Amount
	 * LimitDetails4.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LimitSearchCriteria3#LimitAmount
	 * LimitSearchCriteria3.LimitAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Limit6#Amount
	 * Limit6.Amount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReservationDetails2#Amount
	 * ReservationDetails2.Amount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Reservation2#Amount
	 * Reservation2.Amount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LimitDetails#Amount
	 * LimitDetails.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BilateralLimitDetails1#LimitAmount
	 * BilateralLimitDetails1.LimitAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BilateralLimitDetails2#LimitAmount
	 * BilateralLimitDetails2.LimitAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BilateralLimitDetails3#LimitAmount
	 * BilateralLimitDetails3.LimitAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Limit5#Amount
	 * Limit5.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BilateralLimit1#LimitAmount
	 * BilateralLimit1.LimitAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LimitDetails3#Amount
	 * LimitDetails3.Amount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Limit4#Amount
	 * Limit4.Amount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Limit4#RemainingAmount
	 * Limit4.RemainingAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReservationDetails1#Amount
	 * ReservationDetails1.Amount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Reservation1#Amount
	 * Reservation1.Amount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CreditLine1#Amount
	 * CreditLine1.Amount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CreditLine2#Amount
	 * CreditLine2.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyFactors1#ShortPositionLimit
	 * CurrencyFactors1.ShortPositionLimit}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Limit2#Amount
	 * Limit2.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialCard1#CreditLimitAmount
	 * FinancialCard1.CreditLimitAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LimitAmount1#Amount
	 * LimitAmount1.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransactionAmounts2#MinimumAllowedAmount
	 * ATMTransactionAmounts2.MinimumAllowedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransactionAmounts2#MaximumAllowedAmount
	 * ATMTransactionAmounts2.MaximumAllowedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransactionAmounts3#MinimumAmount
	 * ATMTransactionAmounts3.MinimumAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransactionAmounts3#MaximumAmount
	 * ATMTransactionAmounts3.MaximumAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransactionAmounts8#MinimumPossibleAmount
	 * ATMTransactionAmounts8.MinimumPossibleAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransactionAmounts6#MinimumPossibleAmount
	 * ATMTransactionAmounts6.MinimumPossibleAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransactionAmounts7#Amount
	 * ATMTransactionAmounts7.Amount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Limit
	 * Limit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of money of the limit, expressed in a currency."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Amount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.LimitDetails2.Amount, com.tools20022.repository.msg.LimitDetails4.Amount, com.tools20022.repository.msg.LimitSearchCriteria3.LimitAmount,
					com.tools20022.repository.msg.Limit6.Amount, com.tools20022.repository.msg.ReservationDetails2.Amount, com.tools20022.repository.msg.Reservation2.Amount, com.tools20022.repository.msg.LimitDetails.Amount,
					com.tools20022.repository.msg.BilateralLimitDetails1.LimitAmount, com.tools20022.repository.msg.BilateralLimitDetails2.LimitAmount, com.tools20022.repository.msg.BilateralLimitDetails3.LimitAmount,
					com.tools20022.repository.msg.Limit5.Amount, com.tools20022.repository.msg.BilateralLimit1.LimitAmount, com.tools20022.repository.msg.LimitDetails3.Amount, com.tools20022.repository.msg.Limit4.Amount,
					com.tools20022.repository.msg.Limit4.RemainingAmount, com.tools20022.repository.msg.ReservationDetails1.Amount, com.tools20022.repository.msg.Reservation1.Amount, com.tools20022.repository.msg.CreditLine1.Amount,
					com.tools20022.repository.msg.CreditLine2.Amount, com.tools20022.repository.msg.CurrencyFactors1.ShortPositionLimit, com.tools20022.repository.msg.Limit2.Amount,
					com.tools20022.repository.msg.FinancialCard1.CreditLimitAmount, com.tools20022.repository.msg.LimitAmount1.Amount, com.tools20022.repository.msg.ATMTransactionAmounts2.MinimumAllowedAmount,
					com.tools20022.repository.msg.ATMTransactionAmounts2.MaximumAllowedAmount, com.tools20022.repository.msg.ATMTransactionAmounts3.MinimumAmount, com.tools20022.repository.msg.ATMTransactionAmounts3.MaximumAmount,
					com.tools20022.repository.msg.ATMTransactionAmounts8.MinimumPossibleAmount, com.tools20022.repository.msg.ATMTransactionAmounts6.MinimumPossibleAmount, com.tools20022.repository.msg.ATMTransactionAmounts7.Amount);
			elementContext_lazy = () -> Limit.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Amount";
			definition = "Amount of money of the limit, expressed in a currency.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Specifies if a limit is a debit limit or a credit limit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FloorLimitTypeCode
	 * FloorLimitTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LimitDetails2#CreditDebitIndicator
	 * LimitDetails2.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LimitDetails4#CreditDebitIndicator
	 * LimitDetails4.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Limit6#CreditDebitIndicator
	 * Limit6.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LimitDetails#CreditDebitIndicator
	 * LimitDetails.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BilateralLimitDetails1#CreditDebitIndicator
	 * BilateralLimitDetails1.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BilateralLimitDetails2#CreditDebitIndicator
	 * BilateralLimitDetails2.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BilateralLimitDetails3#CreditDebitIndicator
	 * BilateralLimitDetails3.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Limit5#CreditDebitIndicator
	 * Limit5.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BilateralLimit1#CreditDebitIndicator
	 * BilateralLimit1.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LimitDetails3#CreditDebitIndicator
	 * LimitDetails3.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Limit4#CreditDebitIndicator
	 * Limit4.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Limit4#UsedAmountCreditDebitIndicator
	 * Limit4.UsedAmountCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Limit2#CreditDebitIndicator
	 * Limit2.CreditDebitIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Limit
	 * Limit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditDebitIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies if a limit is a debit limit or a credit limit."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CreditDebitIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.LimitDetails2.CreditDebitIndicator, com.tools20022.repository.msg.LimitDetails4.CreditDebitIndicator,
					com.tools20022.repository.msg.Limit6.CreditDebitIndicator, com.tools20022.repository.msg.LimitDetails.CreditDebitIndicator, com.tools20022.repository.msg.BilateralLimitDetails1.CreditDebitIndicator,
					com.tools20022.repository.msg.BilateralLimitDetails2.CreditDebitIndicator, com.tools20022.repository.msg.BilateralLimitDetails3.CreditDebitIndicator, com.tools20022.repository.msg.Limit5.CreditDebitIndicator,
					com.tools20022.repository.msg.BilateralLimit1.CreditDebitIndicator, com.tools20022.repository.msg.LimitDetails3.CreditDebitIndicator, com.tools20022.repository.msg.Limit4.CreditDebitIndicator,
					com.tools20022.repository.msg.Limit4.UsedAmountCreditDebitIndicator, com.tools20022.repository.msg.Limit2.CreditDebitIndicator);
			elementContext_lazy = () -> Limit.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CreditDebitIndicator";
			definition = "Specifies if a limit is a debit limit or a credit limit.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> FloorLimitTypeCode.mmObject();
		}
	};
	/**
	 * Actual usage of the limit expressed as an amount.
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
	 * {@linkplain com.tools20022.repository.msg.LimitSearchCriteria3#UsedAmount
	 * LimitSearchCriteria3.UsedAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Limit4#UsedAmount
	 * Limit4.UsedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LimitAmount1#UtilisationAmount
	 * LimitAmount1.UtilisationAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Limit
	 * Limit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UsedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Actual usage of the limit expressed as an amount."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute UsedAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.LimitSearchCriteria3.UsedAmount, com.tools20022.repository.msg.Limit4.UsedAmount, com.tools20022.repository.msg.LimitAmount1.UtilisationAmount);
			elementContext_lazy = () -> Limit.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UsedAmount";
			definition = "Actual usage of the limit expressed as an amount.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Actual usage of the limit expressed as a percentage.
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
	 * {@linkplain com.tools20022.repository.msg.LimitSearchCriteria3#UsedPercentage
	 * LimitSearchCriteria3.UsedPercentage}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Limit
	 * Limit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UsedPercentage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Actual usage of the limit expressed as a percentage."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute UsedPercentage = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.LimitSearchCriteria3.UsedPercentage);
			elementContext_lazy = () -> Limit.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UsedPercentage";
			definition = "Actual usage of the limit expressed as a percentage.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Currency unit used to specify the limit amount.
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
	 * {@linkplain com.tools20022.repository.msg.LimitSearchCriteria3#LimitCurrency
	 * LimitSearchCriteria3.LimitCurrency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CurrencyFactors1#Currency
	 * CurrencyFactors1.Currency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LimitIdentification4#LimitCurrency
	 * LimitIdentification4.LimitCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LimitUtilisationJournalSearchCriteria1#LimitCurrency
	 * LimitUtilisationJournalSearchCriteria1.LimitCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransactionAmounts2#Currency
	 * ATMTransactionAmounts2.Currency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransactionAmounts3#Currency
	 * ATMTransactionAmounts3.Currency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransactionAmounts8#Currency
	 * ATMTransactionAmounts8.Currency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransactionAmounts9#Currency
	 * ATMTransactionAmounts9.Currency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransactionAmounts6#Currency
	 * ATMTransactionAmounts6.Currency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransactionAmounts7#Currency
	 * ATMTransactionAmounts7.Currency}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Limit
	 * Limit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Currency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency unit used to specify the limit amount."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Currency = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.LimitSearchCriteria3.LimitCurrency, com.tools20022.repository.msg.CurrencyFactors1.Currency, com.tools20022.repository.msg.LimitIdentification4.LimitCurrency,
					com.tools20022.repository.msg.LimitUtilisationJournalSearchCriteria1.LimitCurrency, com.tools20022.repository.msg.ATMTransactionAmounts2.Currency, com.tools20022.repository.msg.ATMTransactionAmounts3.Currency,
					com.tools20022.repository.msg.ATMTransactionAmounts8.Currency, com.tools20022.repository.msg.ATMTransactionAmounts9.Currency, com.tools20022.repository.msg.ATMTransactionAmounts6.Currency,
					com.tools20022.repository.msg.ATMTransactionAmounts7.Currency);
			elementContext_lazy = () -> Limit.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Currency";
			definition = "Currency unit used to specify the limit amount.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	/**
	 * Current status of the limit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.LimitStatus#Limit
	 * LimitStatus.Limit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.LimitStatus
	 * LimitStatus}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.LimitDetails3#Status
	 * LimitDetails3.Status}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Limit4#Status
	 * Limit4.Status}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReservationDetails1#Status
	 * ReservationDetails1.Status}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReservationStatus1Choice#Code
	 * ReservationStatus1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReservationStatus1Choice#Proprietary
	 * ReservationStatus1Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Reservation1#Status
	 * Reservation1.Status}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Limit
	 * Limit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LimitStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Current status of the limit."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd LimitStatus = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.LimitDetails3.Status, com.tools20022.repository.msg.Limit4.Status, com.tools20022.repository.msg.ReservationDetails1.Status,
					com.tools20022.repository.choice.ReservationStatus1Choice.Code, com.tools20022.repository.choice.ReservationStatus1Choice.Proprietary, com.tools20022.repository.msg.Reservation1.Status);
			elementContext_lazy = () -> Limit.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LimitStatus";
			definition = "Current status of the limit.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.LimitStatus.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.LimitStatus.Limit;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies that the limit is a percentage of a related amount.
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
	 * <li>{@linkplain com.tools20022.repository.msg.Limit4#UsedPercentage
	 * Limit4.UsedPercentage}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Limit
	 * Limit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Percentage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies that the limit is a percentage of a related amount."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Percentage = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Limit4.UsedPercentage);
			elementContext_lazy = () -> Limit.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Percentage";
			definition = "Specifies that the limit is a percentage of a related amount.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Overdraft conditions for which limit parameters are specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DebitCreditFacility#CreditLine
	 * DebitCreditFacility.CreditLine}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DebitCreditFacility
	 * DebitCreditFacility}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Limit
	 * Limit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedDebitCreditFacility"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Overdraft conditions for which limit parameters are specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedDebitCreditFacility = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Limit.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedDebitCreditFacility";
			definition = "Overdraft conditions for which limit parameters are specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> DebitCreditFacility.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.DebitCreditFacility.CreditLine;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the periodicity linked to a limit for example the periodicity
	 * can indicate that the limit can be reached daily or monthly.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FrequencyCode
	 * FrequencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Limit
	 * Limit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Periodicity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the periodicity linked to a limit for example the periodicity can indicate that the limit can be reached daily or monthly."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Periodicity = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Limit.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Periodicity";
			definition = "Specifies the periodicity linked to a limit for example the periodicity can indicate that the limit can be reached daily or monthly.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> FrequencyCode.mmObject();
		}
	};
	/**
	 * Specifies that the limit is a quantity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Limit
	 * Limit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Quantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies that the limit is a quantity."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Quantity = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Limit.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Quantity";
			definition = "Specifies that the limit is a quantity.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	/**
	 * Period at which the limit is effective.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#RelatedLimit
	 * DateTimePeriod.RelatedLimit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Limit
	 * Limit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValidityPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Period at which the limit is effective."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ValidityPeriod = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Limit.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ValidityPeriod";
			definition = "Period at which the limit is effective.";
			minOccurs = 0;
			type_lazy = () -> DateTimePeriod.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.RelatedLimit;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Payment card for which a limit is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentCard#Limit
	 * PaymentCard.Limit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PaymentCard
	 * PaymentCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Limit
	 * Limit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedPaymentCard"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Payment card for which a limit is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedPaymentCard = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Limit.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedPaymentCard";
			definition = "Payment card for which a limit is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> PaymentCard.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentCard.Limit;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Remaining amount of money of the limit.
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
	 * {@linkplain com.tools20022.repository.msg.LimitAmount1#AvailableAmount
	 * LimitAmount1.AvailableAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransactionAmounts4#AvailableAmount
	 * ATMTransactionAmounts4.AvailableAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransactionAmounts2#MaximumAuthorisableAmount
	 * ATMTransactionAmounts2.MaximumAuthorisableAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransactionAmounts8#MaximumPossibleAmount
	 * ATMTransactionAmounts8.MaximumPossibleAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransactionAmounts6#MaximumPossibleAmount
	 * ATMTransactionAmounts6.MaximumPossibleAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Limit
	 * Limit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AvailableAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Remaining amount of money of the limit."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute AvailableAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.LimitAmount1.AvailableAmount, com.tools20022.repository.msg.ATMTransactionAmounts4.AvailableAmount,
					com.tools20022.repository.msg.ATMTransactionAmounts2.MaximumAuthorisableAmount, com.tools20022.repository.msg.ATMTransactionAmounts8.MaximumPossibleAmount,
					com.tools20022.repository.msg.ATMTransactionAmounts6.MaximumPossibleAmount);
			elementContext_lazy = () -> Limit.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AvailableAmount";
			definition = "Remaining amount of money of the limit.";
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
				name = "Limit";
				definition = "Value used for risk containment in a system or towards counterparts. The limit may be a current limit or a default limit.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.DateTimePeriod.RelatedLimit, com.tools20022.repository.entity.PaymentCard.Limit, com.tools20022.repository.entity.LimitStatus.Limit,
						com.tools20022.repository.entity.DebitCreditFacility.CreditLine);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Limit1.Current, com.tools20022.repository.msg.Limit1.Limit);
				subType_lazy = () -> Arrays.asList(RiskManagementLimit.mmObject(), Reservation.mmObject(), LiquidityManagementLimit.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Limit.Type, com.tools20022.repository.entity.Limit.Amount, com.tools20022.repository.entity.Limit.CreditDebitIndicator,
						com.tools20022.repository.entity.Limit.UsedAmount, com.tools20022.repository.entity.Limit.UsedPercentage, com.tools20022.repository.entity.Limit.Currency, com.tools20022.repository.entity.Limit.LimitStatus,
						com.tools20022.repository.entity.Limit.Percentage, com.tools20022.repository.entity.Limit.RelatedDebitCreditFacility, com.tools20022.repository.entity.Limit.Periodicity,
						com.tools20022.repository.entity.Limit.Quantity, com.tools20022.repository.entity.Limit.ValidityPeriod, com.tools20022.repository.entity.Limit.RelatedPaymentCard,
						com.tools20022.repository.entity.Limit.AvailableAmount);
				derivationComponent_lazy = () -> Arrays.asList(LimitDetails2.mmObject(), LimitDetails4.mmObject(), LimitSearchCriteria1.mmObject(), LimitSearchCriteria2.mmObject(), LimitSearchCriteria3.mmObject(), Limit6.mmObject(),
						LimitDetails.mmObject(), Limit5.mmObject(), LimitDetails3.mmObject(), Limit4.mmObject(), CreditLine1.mmObject(), CreditLine2.mmObject(), Limit2.mmObject(), Limit1.mmObject(), CurrentLimitChoice.mmObject(),
						LimitAmount1.mmObject(), ATMTransactionAmounts4.mmObject(), ATMTransactionAmounts2.mmObject(), ATMTransactionAmounts3.mmObject(), ATMTransactionAmounts8.mmObject(), ATMTransactionAmounts9.mmObject(),
						ATMTransactionAmounts6.mmObject(), ATMTransactionAmounts7.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}