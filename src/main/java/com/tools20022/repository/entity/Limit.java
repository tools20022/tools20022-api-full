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
import java.util.List;

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
 * <li>{@linkplain com.tools20022.repository.entity.Limit#mmType Limit.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Limit#mmAmount
 * Limit.mmAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Limit#mmCreditDebitIndicator
 * Limit.mmCreditDebitIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Limit#mmUsedAmount
 * Limit.mmUsedAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Limit#mmUsedPercentage
 * Limit.mmUsedPercentage}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Limit#mmCurrency
 * Limit.mmCurrency}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Limit#mmLimitStatus
 * Limit.mmLimitStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Limit#mmPercentage
 * Limit.mmPercentage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Limit#mmRelatedDebitCreditFacility
 * Limit.mmRelatedDebitCreditFacility}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Limit#mmPeriodicity
 * Limit.mmPeriodicity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Limit#mmQuantity
 * Limit.mmQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Limit#mmValidityPeriod
 * Limit.mmValidityPeriod}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Limit#mmRelatedPaymentCard
 * Limit.mmRelatedPaymentCard}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Limit#mmAvailableAmount
 * Limit.mmAvailableAmount}</li>
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
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmRelatedLimit
 * DateTimePeriod.mmRelatedLimit}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentCard#mmLimit
 * PaymentCard.mmLimit}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LimitStatus#mmLimit
 * LimitStatus.mmLimit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DebitCreditFacility#mmCreditLine
 * DebitCreditFacility.mmCreditLine}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Limit1#mmCurrent
 * Limit1.mmCurrent}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Limit1#mmLimit Limit1.mmLimit}</li>
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
	protected LimitTypeCode type;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Limit
	 * Limit}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RiskManagementLimitIdentificationDetails#mmType
	 * RiskManagementLimitIdentificationDetails.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LimitIdentificationDetails1#mmType
	 * LimitIdentificationDetails1.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LimitIdentificationDetails2#mmType
	 * LimitIdentificationDetails2.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LimitIdentificationDetails3#mmType
	 * LimitIdentificationDetails3.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.LimitType1Choice#mmCode
	 * LimitType1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.LimitType1Choice#mmProprietary
	 * LimitType1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LimitIdentification1#mmType
	 * LimitIdentification1.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LimitIdentification2#mmType
	 * LimitIdentification2.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LimitSearchCriteria1#mmDefaultLimitType
	 * LimitSearchCriteria1.mmDefaultLimitType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LimitSearchCriteria1#mmCurrentLimitType
	 * LimitSearchCriteria1.mmCurrentLimitType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LimitSearchCriteria2#mmDefaultLimitType
	 * LimitSearchCriteria2.mmDefaultLimitType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LimitSearchCriteria2#mmCurrentLimitType
	 * LimitSearchCriteria2.mmCurrentLimitType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LimitSearchCriteria3#mmDefaultLimitType
	 * LimitSearchCriteria3.mmDefaultLimitType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LimitSearchCriteria3#mmCurrentLimitType
	 * LimitSearchCriteria3.mmCurrentLimitType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LimitIdentification4#mmType
	 * LimitIdentification4.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LimitUtilisationJournalSearchCriteria1#mmLimitType
	 * LimitUtilisationJournalSearchCriteria1.mmLimitType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransactionAmounts3#mmType
	 * ATMTransactionAmounts3.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransactionAmounts9#mmMediaType
	 * ATMTransactionAmounts9.mmMediaType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransactionAmounts7#mmType
	 * ATMTransactionAmounts7.mmType}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RiskManagementLimitIdentificationDetails.mmType, com.tools20022.repository.msg.LimitIdentificationDetails1.mmType,
					com.tools20022.repository.msg.LimitIdentificationDetails2.mmType, com.tools20022.repository.msg.LimitIdentificationDetails3.mmType, com.tools20022.repository.choice.LimitType1Choice.mmCode,
					com.tools20022.repository.choice.LimitType1Choice.mmProprietary, com.tools20022.repository.msg.LimitIdentification1.mmType, com.tools20022.repository.msg.LimitIdentification2.mmType,
					com.tools20022.repository.msg.LimitSearchCriteria1.mmDefaultLimitType, com.tools20022.repository.msg.LimitSearchCriteria1.mmCurrentLimitType, com.tools20022.repository.msg.LimitSearchCriteria2.mmDefaultLimitType,
					com.tools20022.repository.msg.LimitSearchCriteria2.mmCurrentLimitType, com.tools20022.repository.msg.LimitSearchCriteria3.mmDefaultLimitType, com.tools20022.repository.msg.LimitSearchCriteria3.mmCurrentLimitType,
					com.tools20022.repository.msg.LimitIdentification4.mmType, com.tools20022.repository.msg.LimitUtilisationJournalSearchCriteria1.mmLimitType, com.tools20022.repository.msg.ATMTransactionAmounts3.mmType,
					com.tools20022.repository.msg.ATMTransactionAmounts9.mmMediaType, com.tools20022.repository.msg.ATMTransactionAmounts7.mmType);
			elementContext_lazy = () -> Limit.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Nature of the limit.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> LimitTypeCode.mmObject();
		}
	};
	protected CurrencyAndAmount amount;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Limit
	 * Limit}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.LimitDetails2#mmAmount
	 * LimitDetails2.mmAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LimitDetails4#mmAmount
	 * LimitDetails4.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LimitSearchCriteria3#mmLimitAmount
	 * LimitSearchCriteria3.mmLimitAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Limit6#mmAmount
	 * Limit6.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReservationDetails2#mmAmount
	 * ReservationDetails2.mmAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Reservation2#mmAmount
	 * Reservation2.mmAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LimitDetails#mmAmount
	 * LimitDetails.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BilateralLimitDetails1#mmLimitAmount
	 * BilateralLimitDetails1.mmLimitAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BilateralLimitDetails2#mmLimitAmount
	 * BilateralLimitDetails2.mmLimitAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BilateralLimitDetails3#mmLimitAmount
	 * BilateralLimitDetails3.mmLimitAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Limit5#mmAmount
	 * Limit5.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BilateralLimit1#mmLimitAmount
	 * BilateralLimit1.mmLimitAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LimitDetails3#mmAmount
	 * LimitDetails3.mmAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Limit4#mmAmount
	 * Limit4.mmAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Limit4#mmRemainingAmount
	 * Limit4.mmRemainingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReservationDetails1#mmAmount
	 * ReservationDetails1.mmAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Reservation1#mmAmount
	 * Reservation1.mmAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CreditLine1#mmAmount
	 * CreditLine1.mmAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CreditLine2#mmAmount
	 * CreditLine2.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyFactors1#mmShortPositionLimit
	 * CurrencyFactors1.mmShortPositionLimit}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Limit2#mmAmount
	 * Limit2.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialCard1#mmCreditLimitAmount
	 * FinancialCard1.mmCreditLimitAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LimitAmount1#mmAmount
	 * LimitAmount1.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransactionAmounts2#mmMinimumAllowedAmount
	 * ATMTransactionAmounts2.mmMinimumAllowedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransactionAmounts2#mmMaximumAllowedAmount
	 * ATMTransactionAmounts2.mmMaximumAllowedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransactionAmounts3#mmMinimumAmount
	 * ATMTransactionAmounts3.mmMinimumAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransactionAmounts3#mmMaximumAmount
	 * ATMTransactionAmounts3.mmMaximumAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransactionAmounts8#mmMinimumPossibleAmount
	 * ATMTransactionAmounts8.mmMinimumPossibleAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransactionAmounts6#mmMinimumPossibleAmount
	 * ATMTransactionAmounts6.mmMinimumPossibleAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransactionAmounts7#mmAmount
	 * ATMTransactionAmounts7.mmAmount}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.LimitDetails2.mmAmount, com.tools20022.repository.msg.LimitDetails4.mmAmount, com.tools20022.repository.msg.LimitSearchCriteria3.mmLimitAmount,
					com.tools20022.repository.msg.Limit6.mmAmount, com.tools20022.repository.msg.ReservationDetails2.mmAmount, com.tools20022.repository.msg.Reservation2.mmAmount, com.tools20022.repository.msg.LimitDetails.mmAmount,
					com.tools20022.repository.msg.BilateralLimitDetails1.mmLimitAmount, com.tools20022.repository.msg.BilateralLimitDetails2.mmLimitAmount, com.tools20022.repository.msg.BilateralLimitDetails3.mmLimitAmount,
					com.tools20022.repository.msg.Limit5.mmAmount, com.tools20022.repository.msg.BilateralLimit1.mmLimitAmount, com.tools20022.repository.msg.LimitDetails3.mmAmount, com.tools20022.repository.msg.Limit4.mmAmount,
					com.tools20022.repository.msg.Limit4.mmRemainingAmount, com.tools20022.repository.msg.ReservationDetails1.mmAmount, com.tools20022.repository.msg.Reservation1.mmAmount,
					com.tools20022.repository.msg.CreditLine1.mmAmount, com.tools20022.repository.msg.CreditLine2.mmAmount, com.tools20022.repository.msg.CurrencyFactors1.mmShortPositionLimit, com.tools20022.repository.msg.Limit2.mmAmount,
					com.tools20022.repository.msg.FinancialCard1.mmCreditLimitAmount, com.tools20022.repository.msg.LimitAmount1.mmAmount, com.tools20022.repository.msg.ATMTransactionAmounts2.mmMinimumAllowedAmount,
					com.tools20022.repository.msg.ATMTransactionAmounts2.mmMaximumAllowedAmount, com.tools20022.repository.msg.ATMTransactionAmounts3.mmMinimumAmount, com.tools20022.repository.msg.ATMTransactionAmounts3.mmMaximumAmount,
					com.tools20022.repository.msg.ATMTransactionAmounts8.mmMinimumPossibleAmount, com.tools20022.repository.msg.ATMTransactionAmounts6.mmMinimumPossibleAmount, com.tools20022.repository.msg.ATMTransactionAmounts7.mmAmount);
			elementContext_lazy = () -> Limit.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Amount";
			definition = "Amount of money of the limit, expressed in a currency.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	protected FloorLimitTypeCode creditDebitIndicator;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Limit
	 * Limit}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LimitDetails2#mmCreditDebitIndicator
	 * LimitDetails2.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LimitDetails4#mmCreditDebitIndicator
	 * LimitDetails4.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Limit6#mmCreditDebitIndicator
	 * Limit6.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LimitDetails#mmCreditDebitIndicator
	 * LimitDetails.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BilateralLimitDetails1#mmCreditDebitIndicator
	 * BilateralLimitDetails1.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BilateralLimitDetails2#mmCreditDebitIndicator
	 * BilateralLimitDetails2.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BilateralLimitDetails3#mmCreditDebitIndicator
	 * BilateralLimitDetails3.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Limit5#mmCreditDebitIndicator
	 * Limit5.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BilateralLimit1#mmCreditDebitIndicator
	 * BilateralLimit1.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LimitDetails3#mmCreditDebitIndicator
	 * LimitDetails3.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Limit4#mmCreditDebitIndicator
	 * Limit4.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Limit4#mmUsedAmountCreditDebitIndicator
	 * Limit4.mmUsedAmountCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Limit2#mmCreditDebitIndicator
	 * Limit2.mmCreditDebitIndicator}</li>
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
	 * definition} = "Specifies if a limit is a debit limit or a credit limit."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCreditDebitIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.LimitDetails2.mmCreditDebitIndicator, com.tools20022.repository.msg.LimitDetails4.mmCreditDebitIndicator,
					com.tools20022.repository.msg.Limit6.mmCreditDebitIndicator, com.tools20022.repository.msg.LimitDetails.mmCreditDebitIndicator, com.tools20022.repository.msg.BilateralLimitDetails1.mmCreditDebitIndicator,
					com.tools20022.repository.msg.BilateralLimitDetails2.mmCreditDebitIndicator, com.tools20022.repository.msg.BilateralLimitDetails3.mmCreditDebitIndicator, com.tools20022.repository.msg.Limit5.mmCreditDebitIndicator,
					com.tools20022.repository.msg.BilateralLimit1.mmCreditDebitIndicator, com.tools20022.repository.msg.LimitDetails3.mmCreditDebitIndicator, com.tools20022.repository.msg.Limit4.mmCreditDebitIndicator,
					com.tools20022.repository.msg.Limit4.mmUsedAmountCreditDebitIndicator, com.tools20022.repository.msg.Limit2.mmCreditDebitIndicator);
			elementContext_lazy = () -> Limit.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CreditDebitIndicator";
			definition = "Specifies if a limit is a debit limit or a credit limit.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FloorLimitTypeCode.mmObject();
		}
	};
	protected CurrencyAndAmount usedAmount;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Limit
	 * Limit}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LimitSearchCriteria3#mmUsedAmount
	 * LimitSearchCriteria3.mmUsedAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Limit4#mmUsedAmount
	 * Limit4.mmUsedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LimitAmount1#mmUtilisationAmount
	 * LimitAmount1.mmUtilisationAmount}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmUsedAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.LimitSearchCriteria3.mmUsedAmount, com.tools20022.repository.msg.Limit4.mmUsedAmount, com.tools20022.repository.msg.LimitAmount1.mmUtilisationAmount);
			elementContext_lazy = () -> Limit.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UsedAmount";
			definition = "Actual usage of the limit expressed as an amount.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	protected PercentageRate usedPercentage;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Limit
	 * Limit}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LimitSearchCriteria3#mmUsedPercentage
	 * LimitSearchCriteria3.mmUsedPercentage}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmUsedPercentage = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.LimitSearchCriteria3.mmUsedPercentage);
			elementContext_lazy = () -> Limit.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UsedPercentage";
			definition = "Actual usage of the limit expressed as a percentage.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	protected CurrencyCode currency;
	/**
	 * Currency unit used to specify the limit amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Limit
	 * Limit}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LimitSearchCriteria3#mmLimitCurrency
	 * LimitSearchCriteria3.mmLimitCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyFactors1#mmCurrency
	 * CurrencyFactors1.mmCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LimitIdentification4#mmLimitCurrency
	 * LimitIdentification4.mmLimitCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LimitUtilisationJournalSearchCriteria1#mmLimitCurrency
	 * LimitUtilisationJournalSearchCriteria1.mmLimitCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransactionAmounts2#mmCurrency
	 * ATMTransactionAmounts2.mmCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransactionAmounts3#mmCurrency
	 * ATMTransactionAmounts3.mmCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransactionAmounts8#mmCurrency
	 * ATMTransactionAmounts8.mmCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransactionAmounts9#mmCurrency
	 * ATMTransactionAmounts9.mmCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransactionAmounts6#mmCurrency
	 * ATMTransactionAmounts6.mmCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransactionAmounts7#mmCurrency
	 * ATMTransactionAmounts7.mmCurrency}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmCurrency = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.LimitSearchCriteria3.mmLimitCurrency, com.tools20022.repository.msg.CurrencyFactors1.mmCurrency,
					com.tools20022.repository.msg.LimitIdentification4.mmLimitCurrency, com.tools20022.repository.msg.LimitUtilisationJournalSearchCriteria1.mmLimitCurrency, com.tools20022.repository.msg.ATMTransactionAmounts2.mmCurrency,
					com.tools20022.repository.msg.ATMTransactionAmounts3.mmCurrency, com.tools20022.repository.msg.ATMTransactionAmounts8.mmCurrency, com.tools20022.repository.msg.ATMTransactionAmounts9.mmCurrency,
					com.tools20022.repository.msg.ATMTransactionAmounts6.mmCurrency, com.tools20022.repository.msg.ATMTransactionAmounts7.mmCurrency);
			elementContext_lazy = () -> Limit.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Currency";
			definition = "Currency unit used to specify the limit amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.LimitStatus> limitStatus;
	/**
	 * Current status of the limit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.LimitStatus#mmLimit
	 * LimitStatus.mmLimit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.LimitStatus
	 * LimitStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Limit
	 * Limit}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.LimitDetails3#mmStatus
	 * LimitDetails3.mmStatus}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Limit4#mmStatus
	 * Limit4.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReservationDetails1#mmStatus
	 * ReservationDetails1.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReservationStatus1Choice#mmCode
	 * ReservationStatus1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReservationStatus1Choice#mmProprietary
	 * ReservationStatus1Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Reservation1#mmStatus
	 * Reservation1.mmStatus}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAssociationEnd mmLimitStatus = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.LimitDetails3.mmStatus, com.tools20022.repository.msg.Limit4.mmStatus, com.tools20022.repository.msg.ReservationDetails1.mmStatus,
					com.tools20022.repository.choice.ReservationStatus1Choice.mmCode, com.tools20022.repository.choice.ReservationStatus1Choice.mmProprietary, com.tools20022.repository.msg.Reservation1.mmStatus);
			elementContext_lazy = () -> Limit.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LimitStatus";
			definition = "Current status of the limit.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.LimitStatus.mmLimit;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.LimitStatus.mmObject();
		}
	};
	protected PercentageRate percentage;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Limit
	 * Limit}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Limit4#mmUsedPercentage
	 * Limit4.mmUsedPercentage}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmPercentage = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Limit4.mmUsedPercentage);
			elementContext_lazy = () -> Limit.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Percentage";
			definition = "Specifies that the limit is a percentage of a related amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	protected DebitCreditFacility relatedDebitCreditFacility;
	/**
	 * Overdraft conditions for which limit parameters are specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DebitCreditFacility#mmCreditLine
	 * DebitCreditFacility.mmCreditLine}</li>
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
	public static final MMBusinessAssociationEnd mmRelatedDebitCreditFacility = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Limit.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedDebitCreditFacility";
			definition = "Overdraft conditions for which limit parameters are specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DebitCreditFacility.mmCreditLine;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.DebitCreditFacility.mmObject();
		}
	};
	protected FrequencyCode periodicity;
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
	public static final MMBusinessAttribute mmPeriodicity = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Limit.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Periodicity";
			definition = "Specifies the periodicity linked to a limit for example the periodicity can indicate that the limit can be reached daily or monthly.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FrequencyCode.mmObject();
		}
	};
	protected DecimalNumber quantity;
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
	public static final MMBusinessAttribute mmQuantity = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Limit.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Quantity";
			definition = "Specifies that the limit is a quantity.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.DateTimePeriod> validityPeriod;
	/**
	 * Period at which the limit is effective.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmRelatedLimit
	 * DateTimePeriod.mmRelatedLimit}</li>
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
	public static final MMBusinessAssociationEnd mmValidityPeriod = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Limit.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ValidityPeriod";
			definition = "Period at which the limit is effective.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmRelatedLimit;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
		}
	};
	protected PaymentCard relatedPaymentCard;
	/**
	 * Payment card for which a limit is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentCard#mmLimit
	 * PaymentCard.mmLimit}</li>
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
	public static final MMBusinessAssociationEnd mmRelatedPaymentCard = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Limit.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedPaymentCard";
			definition = "Payment card for which a limit is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentCard.mmLimit;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PaymentCard.mmObject();
		}
	};
	protected CurrencyAndAmount availableAmount;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Limit
	 * Limit}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LimitAmount1#mmAvailableAmount
	 * LimitAmount1.mmAvailableAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransactionAmounts4#mmAvailableAmount
	 * ATMTransactionAmounts4.mmAvailableAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransactionAmounts2#mmMaximumAuthorisableAmount
	 * ATMTransactionAmounts2.mmMaximumAuthorisableAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransactionAmounts8#mmMaximumPossibleAmount
	 * ATMTransactionAmounts8.mmMaximumPossibleAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransactionAmounts6#mmMaximumPossibleAmount
	 * ATMTransactionAmounts6.mmMaximumPossibleAmount}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmAvailableAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.LimitAmount1.mmAvailableAmount, com.tools20022.repository.msg.ATMTransactionAmounts4.mmAvailableAmount,
					com.tools20022.repository.msg.ATMTransactionAmounts2.mmMaximumAuthorisableAmount, com.tools20022.repository.msg.ATMTransactionAmounts8.mmMaximumPossibleAmount,
					com.tools20022.repository.msg.ATMTransactionAmounts6.mmMaximumPossibleAmount);
			elementContext_lazy = () -> Limit.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AvailableAmount";
			definition = "Remaining amount of money of the limit.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Limit";
				definition = "Value used for risk containment in a system or towards counterparts. The limit may be a current limit or a default limit.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.DateTimePeriod.mmRelatedLimit, com.tools20022.repository.entity.PaymentCard.mmLimit, com.tools20022.repository.entity.LimitStatus.mmLimit,
						com.tools20022.repository.entity.DebitCreditFacility.mmCreditLine);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Limit1.mmCurrent, com.tools20022.repository.msg.Limit1.mmLimit);
				subType_lazy = () -> Arrays.asList(RiskManagementLimit.mmObject(), Reservation.mmObject(), LiquidityManagementLimit.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Limit.mmType, com.tools20022.repository.entity.Limit.mmAmount, com.tools20022.repository.entity.Limit.mmCreditDebitIndicator,
						com.tools20022.repository.entity.Limit.mmUsedAmount, com.tools20022.repository.entity.Limit.mmUsedPercentage, com.tools20022.repository.entity.Limit.mmCurrency, com.tools20022.repository.entity.Limit.mmLimitStatus,
						com.tools20022.repository.entity.Limit.mmPercentage, com.tools20022.repository.entity.Limit.mmRelatedDebitCreditFacility, com.tools20022.repository.entity.Limit.mmPeriodicity,
						com.tools20022.repository.entity.Limit.mmQuantity, com.tools20022.repository.entity.Limit.mmValidityPeriod, com.tools20022.repository.entity.Limit.mmRelatedPaymentCard,
						com.tools20022.repository.entity.Limit.mmAvailableAmount);
				derivationComponent_lazy = () -> Arrays.asList(LimitDetails2.mmObject(), LimitDetails4.mmObject(), LimitSearchCriteria1.mmObject(), LimitSearchCriteria2.mmObject(), LimitSearchCriteria3.mmObject(), Limit6.mmObject(),
						LimitDetails.mmObject(), Limit5.mmObject(), LimitDetails3.mmObject(), Limit4.mmObject(), CreditLine1.mmObject(), CreditLine2.mmObject(), Limit2.mmObject(), Limit1.mmObject(), CurrentLimitChoice.mmObject(),
						LimitAmount1.mmObject(), ATMTransactionAmounts4.mmObject(), ATMTransactionAmounts2.mmObject(), ATMTransactionAmounts3.mmObject(), ATMTransactionAmounts8.mmObject(), ATMTransactionAmounts9.mmObject(),
						ATMTransactionAmounts6.mmObject(), ATMTransactionAmounts7.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public LimitTypeCode getType() {
		return type;
	}

	public void setType(LimitTypeCode type) {
		this.type = type;
	}

	public CurrencyAndAmount getAmount() {
		return amount;
	}

	public void setAmount(CurrencyAndAmount amount) {
		this.amount = amount;
	}

	public FloorLimitTypeCode getCreditDebitIndicator() {
		return creditDebitIndicator;
	}

	public void setCreditDebitIndicator(FloorLimitTypeCode creditDebitIndicator) {
		this.creditDebitIndicator = creditDebitIndicator;
	}

	public CurrencyAndAmount getUsedAmount() {
		return usedAmount;
	}

	public void setUsedAmount(CurrencyAndAmount usedAmount) {
		this.usedAmount = usedAmount;
	}

	public PercentageRate getUsedPercentage() {
		return usedPercentage;
	}

	public void setUsedPercentage(PercentageRate usedPercentage) {
		this.usedPercentage = usedPercentage;
	}

	public CurrencyCode getCurrency() {
		return currency;
	}

	public void setCurrency(CurrencyCode currency) {
		this.currency = currency;
	}

	public List<LimitStatus> getLimitStatus() {
		return limitStatus;
	}

	public void setLimitStatus(List<com.tools20022.repository.entity.LimitStatus> limitStatus) {
		this.limitStatus = limitStatus;
	}

	public PercentageRate getPercentage() {
		return percentage;
	}

	public void setPercentage(PercentageRate percentage) {
		this.percentage = percentage;
	}

	public DebitCreditFacility getRelatedDebitCreditFacility() {
		return relatedDebitCreditFacility;
	}

	public void setRelatedDebitCreditFacility(com.tools20022.repository.entity.DebitCreditFacility relatedDebitCreditFacility) {
		this.relatedDebitCreditFacility = relatedDebitCreditFacility;
	}

	public FrequencyCode getPeriodicity() {
		return periodicity;
	}

	public void setPeriodicity(FrequencyCode periodicity) {
		this.periodicity = periodicity;
	}

	public DecimalNumber getQuantity() {
		return quantity;
	}

	public void setQuantity(DecimalNumber quantity) {
		this.quantity = quantity;
	}

	public List<DateTimePeriod> getValidityPeriod() {
		return validityPeriod;
	}

	public void setValidityPeriod(List<com.tools20022.repository.entity.DateTimePeriod> validityPeriod) {
		this.validityPeriod = validityPeriod;
	}

	public PaymentCard getRelatedPaymentCard() {
		return relatedPaymentCard;
	}

	public void setRelatedPaymentCard(com.tools20022.repository.entity.PaymentCard relatedPaymentCard) {
		this.relatedPaymentCard = relatedPaymentCard;
	}

	public CurrencyAndAmount getAvailableAmount() {
		return availableAmount;
	}

	public void setAvailableAmount(CurrencyAndAmount availableAmount) {
		this.availableAmount = availableAmount;
	}
}