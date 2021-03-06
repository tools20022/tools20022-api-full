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

import com.tools20022.metamodel.ext.OtherSemanticMarkup;
import com.tools20022.metamodel.*;
import com.tools20022.repository.choice.CurrentLimitChoice;
import com.tools20022.repository.choice.LimitType1Choice;
import com.tools20022.repository.choice.ReservationStatus1Choice;
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.codeset.FloorLimitTypeCode;
import com.tools20022.repository.codeset.FrequencyCode;
import com.tools20022.repository.codeset.LimitTypeCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.DecimalNumber;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.DateTimePeriod;
import com.tools20022.repository.entity.DebitCreditFacility;
import com.tools20022.repository.entity.LimitStatus;
import com.tools20022.repository.entity.PaymentCard;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
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
 * <li>{@linkplain com.tools20022.repository.msg.LimitSearchCriteria4
 * LimitSearchCriteria4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Limit7 Limit7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Limit8 Limit8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LimitSearchCriteria5
 * LimitSearchCriteria5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CreditLine3 CreditLine3}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Limit"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Value used for risk containment in a system or towards counterparts. The limit may be a current limit or a default limit."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
public class Limit {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected LimitTypeCode type;
	/**
	 * 
	 <p>
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
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LimitSearchCriteria4#mmDefaultLimitType
	 * LimitSearchCriteria4.mmDefaultLimitType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LimitSearchCriteria4#mmCurrentLimitType
	 * LimitSearchCriteria4.mmCurrentLimitType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LimitSearchCriteria5#mmDefaultLimitType
	 * LimitSearchCriteria5.mmDefaultLimitType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LimitSearchCriteria5#mmCurrentLimitType
	 * LimitSearchCriteria5.mmCurrentLimitType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Limit
	 * Limit}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Nature of the limit."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Limit, LimitTypeCode> mmType = new MMBusinessAttribute<Limit, LimitTypeCode>() {
		{
			derivation_lazy = () -> Arrays.asList(RiskManagementLimitIdentificationDetails.mmType, LimitIdentificationDetails1.mmType, LimitIdentificationDetails2.mmType, LimitIdentificationDetails3.mmType, LimitType1Choice.mmCode,
					LimitType1Choice.mmProprietary, LimitIdentification1.mmType, LimitIdentification2.mmType, LimitSearchCriteria1.mmDefaultLimitType, LimitSearchCriteria1.mmCurrentLimitType, LimitSearchCriteria2.mmDefaultLimitType,
					LimitSearchCriteria2.mmCurrentLimitType, LimitSearchCriteria3.mmDefaultLimitType, LimitSearchCriteria3.mmCurrentLimitType, LimitIdentification4.mmType, LimitUtilisationJournalSearchCriteria1.mmLimitType,
					ATMTransactionAmounts3.mmType, ATMTransactionAmounts9.mmMediaType, ATMTransactionAmounts7.mmType, LimitSearchCriteria4.mmDefaultLimitType, LimitSearchCriteria4.mmCurrentLimitType,
					LimitSearchCriteria5.mmDefaultLimitType, LimitSearchCriteria5.mmCurrentLimitType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Limit.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Nature of the limit.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> LimitTypeCode.mmObject();
		}

		@Override
		public LimitTypeCode getValue(Limit obj) {
			return obj.getType();
		}

		@Override
		public void setValue(Limit obj, LimitTypeCode value) {
			obj.setType(value);
		}
	};
	protected CurrencyAndAmount amount;
	/**
	 * 
	 <p>
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
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LimitSearchCriteria4#mmLimitAmount
	 * LimitSearchCriteria4.mmLimitAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BalanceTransfer1#mmBalanceTransferFundingLimit
	 * BalanceTransfer1.mmBalanceTransferFundingLimit}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Reservation4#mmAmount
	 * Reservation4.mmAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Reservation3#mmAmount
	 * Reservation3.mmAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Limit7#mmAmount
	 * Limit7.mmAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Limit7#mmRemainingAmount
	 * Limit7.mmRemainingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BilateralLimit2#mmLimitAmount
	 * BilateralLimit2.mmLimitAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Limit8#mmAmount
	 * Limit8.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LimitSearchCriteria5#mmLimitAmount
	 * LimitSearchCriteria5.mmLimitAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CreditLine3#mmAmount
	 * CreditLine3.mmAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Limit
	 * Limit}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of money of the limit, expressed in a currency."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = type=SampleData, SampleData=<?xml version="1.0"
	 * encoding="UTF-8"?> <InstanceInfo> <key KeyValue="Sample1"/> <key
	 * KeyValue="Sample2"/> <key KeyValue="Sample3"/> <key KeyValue="Sample4"/>
	 * <key KeyValue="Sample5"/> <key KeyValue="Sample6"/> <key
	 * KeyValue="Sample7"/> <key KeyValue="Sample8"/> <key KeyValue="Sample9"/>
	 * <key KeyValue="Sample10"/> </InstanceInfo>
	 * 
	 * 
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Limit, CurrencyAndAmount> mmAmount = new MMBusinessAttribute<Limit, CurrencyAndAmount>() {
		{
			derivation_lazy = () -> Arrays.asList(LimitDetails2.mmAmount, LimitDetails4.mmAmount, LimitSearchCriteria3.mmLimitAmount, Limit6.mmAmount, ReservationDetails2.mmAmount, Reservation2.mmAmount, LimitDetails.mmAmount,
					BilateralLimitDetails1.mmLimitAmount, BilateralLimitDetails2.mmLimitAmount, BilateralLimitDetails3.mmLimitAmount, Limit5.mmAmount, BilateralLimit1.mmLimitAmount, LimitDetails3.mmAmount, Limit4.mmAmount,
					Limit4.mmRemainingAmount, ReservationDetails1.mmAmount, Reservation1.mmAmount, CreditLine1.mmAmount, CreditLine2.mmAmount, CurrencyFactors1.mmShortPositionLimit, Limit2.mmAmount, FinancialCard1.mmCreditLimitAmount,
					LimitAmount1.mmAmount, ATMTransactionAmounts2.mmMinimumAllowedAmount, ATMTransactionAmounts2.mmMaximumAllowedAmount, ATMTransactionAmounts3.mmMinimumAmount, ATMTransactionAmounts3.mmMaximumAmount,
					ATMTransactionAmounts8.mmMinimumPossibleAmount, ATMTransactionAmounts6.mmMinimumPossibleAmount, ATMTransactionAmounts7.mmAmount, LimitSearchCriteria4.mmLimitAmount, BalanceTransfer1.mmBalanceTransferFundingLimit,
					Reservation4.mmAmount, Reservation3.mmAmount, Limit7.mmAmount, Limit7.mmRemainingAmount, BilateralLimit2.mmLimitAmount, Limit8.mmAmount, LimitSearchCriteria5.mmLimitAmount, CreditLine3.mmAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Limit.mmObject();
			semanticMarkup_lazy = () -> Arrays
					.asList(new OtherSemanticMarkup(
							this,
							"SampleData",
							new String[]{
									"SampleData",
									"<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<InstanceInfo>\n<key KeyValue=\"Sample1\"/>\n<key KeyValue=\"Sample2\"/>\n<key KeyValue=\"Sample3\"/>\n<key KeyValue=\"Sample4\"/>\n<key KeyValue=\"Sample5\"/>\n<key KeyValue=\"Sample6\"/>\n<key KeyValue=\"Sample7\"/>\n<key KeyValue=\"Sample8\"/>\n<key KeyValue=\"Sample9\"/>\n<key KeyValue=\"Sample10\"/>\n</InstanceInfo>\n\n\n"}));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Amount";
			definition = "Amount of money of the limit, expressed in a currency.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(Limit obj) {
			return obj.getAmount();
		}

		@Override
		public void setValue(Limit obj, CurrencyAndAmount value) {
			obj.setAmount(value);
		}
	};
	protected FloorLimitTypeCode creditDebitIndicator;
	/**
	 * 
	 <p>
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
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Limit7#mmCreditDebitIndicator
	 * Limit7.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Limit7#mmUsedAmountCreditDebitIndicator
	 * Limit7.mmUsedAmountCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BilateralLimit2#mmCreditDebitIndicator
	 * BilateralLimit2.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Limit8#mmCreditDebitIndicator
	 * Limit8.mmCreditDebitIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Limit
	 * Limit}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditDebitIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies if a limit is a debit limit or a credit limit."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = type=SampleData, SampleData=<?xml version="1.0"
	 * encoding="UTF-8"?> <InstanceInfo> <key KeyValue="Sample1"/> <key
	 * KeyValue="Sample2"/> <key KeyValue="Sample3"/> <key KeyValue="Sample4"/>
	 * <key KeyValue="Sample5"/> <key KeyValue="Sample6"/> <key
	 * KeyValue="Sample7"/> <key KeyValue="Sample8"/> <key KeyValue="Sample9"/>
	 * <key KeyValue="Sample10"/> </InstanceInfo>
	 * 
	 * 
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Limit, FloorLimitTypeCode> mmCreditDebitIndicator = new MMBusinessAttribute<Limit, FloorLimitTypeCode>() {
		{
			derivation_lazy = () -> Arrays.asList(LimitDetails2.mmCreditDebitIndicator, LimitDetails4.mmCreditDebitIndicator, Limit6.mmCreditDebitIndicator, LimitDetails.mmCreditDebitIndicator,
					BilateralLimitDetails1.mmCreditDebitIndicator, BilateralLimitDetails2.mmCreditDebitIndicator, BilateralLimitDetails3.mmCreditDebitIndicator, Limit5.mmCreditDebitIndicator, BilateralLimit1.mmCreditDebitIndicator,
					LimitDetails3.mmCreditDebitIndicator, Limit4.mmCreditDebitIndicator, Limit4.mmUsedAmountCreditDebitIndicator, Limit2.mmCreditDebitIndicator, Limit7.mmCreditDebitIndicator, Limit7.mmUsedAmountCreditDebitIndicator,
					BilateralLimit2.mmCreditDebitIndicator, Limit8.mmCreditDebitIndicator);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Limit.mmObject();
			semanticMarkup_lazy = () -> Arrays
					.asList(new OtherSemanticMarkup(
							this,
							"SampleData",
							new String[]{
									"SampleData",
									"<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<InstanceInfo>\n<key KeyValue=\"Sample1\"/>\n<key KeyValue=\"Sample2\"/>\n<key KeyValue=\"Sample3\"/>\n<key KeyValue=\"Sample4\"/>\n<key KeyValue=\"Sample5\"/>\n<key KeyValue=\"Sample6\"/>\n<key KeyValue=\"Sample7\"/>\n<key KeyValue=\"Sample8\"/>\n<key KeyValue=\"Sample9\"/>\n<key KeyValue=\"Sample10\"/>\n</InstanceInfo>\n\n\n"}));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CreditDebitIndicator";
			definition = "Specifies if a limit is a debit limit or a credit limit.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FloorLimitTypeCode.mmObject();
		}

		@Override
		public FloorLimitTypeCode getValue(Limit obj) {
			return obj.getCreditDebitIndicator();
		}

		@Override
		public void setValue(Limit obj, FloorLimitTypeCode value) {
			obj.setCreditDebitIndicator(value);
		}
	};
	protected CurrencyAndAmount usedAmount;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.LimitSearchCriteria3#mmUsedAmount
	 * LimitSearchCriteria3.mmUsedAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Limit4#mmUsedAmount
	 * Limit4.mmUsedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LimitAmount1#mmUtilisationAmount
	 * LimitAmount1.mmUtilisationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LimitSearchCriteria4#mmUsedAmount
	 * LimitSearchCriteria4.mmUsedAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Limit7#mmUsedAmount
	 * Limit7.mmUsedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LimitSearchCriteria5#mmUsedAmount
	 * LimitSearchCriteria5.mmUsedAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Limit
	 * Limit}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UsedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Actual usage of the limit expressed as an amount."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Limit, Optional<CurrencyAndAmount>> mmUsedAmount = new MMBusinessAttribute<Limit, Optional<CurrencyAndAmount>>() {
		{
			derivation_lazy = () -> Arrays.asList(LimitSearchCriteria3.mmUsedAmount, Limit4.mmUsedAmount, LimitAmount1.mmUtilisationAmount, LimitSearchCriteria4.mmUsedAmount, Limit7.mmUsedAmount, LimitSearchCriteria5.mmUsedAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Limit.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UsedAmount";
			definition = "Actual usage of the limit expressed as an amount.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<CurrencyAndAmount> getValue(Limit obj) {
			return obj.getUsedAmount();
		}

		@Override
		public void setValue(Limit obj, Optional<CurrencyAndAmount> value) {
			obj.setUsedAmount(value.orElse(null));
		}
	};
	protected PercentageRate usedPercentage;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.LimitSearchCriteria3#mmUsedPercentage
	 * LimitSearchCriteria3.mmUsedPercentage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LimitSearchCriteria4#mmUsedPercentage
	 * LimitSearchCriteria4.mmUsedPercentage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LimitSearchCriteria5#mmUsedPercentage
	 * LimitSearchCriteria5.mmUsedPercentage}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Limit
	 * Limit}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UsedPercentage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Actual usage of the limit expressed as a percentage."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Limit, Optional<PercentageRate>> mmUsedPercentage = new MMBusinessAttribute<Limit, Optional<PercentageRate>>() {
		{
			derivation_lazy = () -> Arrays.asList(LimitSearchCriteria3.mmUsedPercentage, LimitSearchCriteria4.mmUsedPercentage, LimitSearchCriteria5.mmUsedPercentage);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Limit.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UsedPercentage";
			definition = "Actual usage of the limit expressed as a percentage.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public Optional<PercentageRate> getValue(Limit obj) {
			return obj.getUsedPercentage();
		}

		@Override
		public void setValue(Limit obj, Optional<PercentageRate> value) {
			obj.setUsedPercentage(value.orElse(null));
		}
	};
	protected CurrencyCode currency;
	/**
	 * 
	 <p>
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
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LimitSearchCriteria4#mmLimitCurrency
	 * LimitSearchCriteria4.mmLimitCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LimitSearchCriteria5#mmLimitCurrency
	 * LimitSearchCriteria5.mmLimitCurrency}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Limit
	 * Limit}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Currency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency unit used to specify the limit amount."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Limit, CurrencyCode> mmCurrency = new MMBusinessAttribute<Limit, CurrencyCode>() {
		{
			derivation_lazy = () -> Arrays.asList(LimitSearchCriteria3.mmLimitCurrency, CurrencyFactors1.mmCurrency, LimitIdentification4.mmLimitCurrency, LimitUtilisationJournalSearchCriteria1.mmLimitCurrency,
					ATMTransactionAmounts2.mmCurrency, ATMTransactionAmounts3.mmCurrency, ATMTransactionAmounts8.mmCurrency, ATMTransactionAmounts9.mmCurrency, ATMTransactionAmounts6.mmCurrency, ATMTransactionAmounts7.mmCurrency,
					LimitSearchCriteria4.mmLimitCurrency, LimitSearchCriteria5.mmLimitCurrency);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Limit.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Currency";
			definition = "Currency unit used to specify the limit amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}

		@Override
		public CurrencyCode getValue(Limit obj) {
			return obj.getCurrency();
		}

		@Override
		public void setValue(Limit obj, CurrencyCode value) {
			obj.setCurrency(value);
		}
	};
	protected List<LimitStatus> limitStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.LimitStatus
	 * LimitStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.LimitStatus#mmLimit
	 * LimitStatus.mmLimit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
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
	 * <li>{@linkplain com.tools20022.repository.msg.Reservation3#mmStatus
	 * Reservation3.mmStatus}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Limit7#mmStatus
	 * Limit7.mmStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Limit
	 * Limit}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LimitStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Current status of the limit."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Limit, List<LimitStatus>> mmLimitStatus = new MMBusinessAssociationEnd<Limit, List<LimitStatus>>() {
		{
			derivation_lazy = () -> Arrays.asList(LimitDetails3.mmStatus, Limit4.mmStatus, ReservationDetails1.mmStatus, ReservationStatus1Choice.mmCode, ReservationStatus1Choice.mmProprietary, Reservation1.mmStatus, Reservation3.mmStatus,
					Limit7.mmStatus);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Limit.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LimitStatus";
			definition = "Current status of the limit.";
			minOccurs = 0;
			opposite_lazy = () -> LimitStatus.mmLimit;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> LimitStatus.mmObject();
		}

		@Override
		public List<LimitStatus> getValue(Limit obj) {
			return obj.getLimitStatus();
		}

		@Override
		public void setValue(Limit obj, List<LimitStatus> value) {
			obj.setLimitStatus(value);
		}
	};
	protected PercentageRate percentage;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.repository.msg.Limit4#mmUsedPercentage
	 * Limit4.mmUsedPercentage}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Limit7#mmUsedPercentage
	 * Limit7.mmUsedPercentage}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Limit
	 * Limit}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Percentage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies that the limit is a percentage of a related amount."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Limit, PercentageRate> mmPercentage = new MMBusinessAttribute<Limit, PercentageRate>() {
		{
			derivation_lazy = () -> Arrays.asList(Limit4.mmUsedPercentage, Limit7.mmUsedPercentage);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Limit.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Percentage";
			definition = "Specifies that the limit is a percentage of a related amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public PercentageRate getValue(Limit obj) {
			return obj.getPercentage();
		}

		@Override
		public void setValue(Limit obj, PercentageRate value) {
			obj.setPercentage(value);
		}
	};
	protected DebitCreditFacility relatedDebitCreditFacility;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DebitCreditFacility
	 * DebitCreditFacility}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DebitCreditFacility#mmCreditLine
	 * DebitCreditFacility.mmCreditLine}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Limit
	 * Limit}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedDebitCreditFacility"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Overdraft conditions for which limit parameters are specified."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Limit, DebitCreditFacility> mmRelatedDebitCreditFacility = new MMBusinessAssociationEnd<Limit, DebitCreditFacility>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Limit.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedDebitCreditFacility";
			definition = "Overdraft conditions for which limit parameters are specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> DebitCreditFacility.mmCreditLine;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> DebitCreditFacility.mmObject();
		}

		@Override
		public DebitCreditFacility getValue(Limit obj) {
			return obj.getRelatedDebitCreditFacility();
		}

		@Override
		public void setValue(Limit obj, DebitCreditFacility value) {
			obj.setRelatedDebitCreditFacility(value);
		}
	};
	protected FrequencyCode periodicity;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Periodicity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the periodicity linked to a limit for example the periodicity can indicate that the limit can be reached daily or monthly."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Limit, FrequencyCode> mmPeriodicity = new MMBusinessAttribute<Limit, FrequencyCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Limit.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Periodicity";
			definition = "Specifies the periodicity linked to a limit for example the periodicity can indicate that the limit can be reached daily or monthly.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FrequencyCode.mmObject();
		}

		@Override
		public FrequencyCode getValue(Limit obj) {
			return obj.getPeriodicity();
		}

		@Override
		public void setValue(Limit obj, FrequencyCode value) {
			obj.setPeriodicity(value);
		}
	};
	protected DecimalNumber quantity;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Quantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies that the limit is a quantity."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Limit, DecimalNumber> mmQuantity = new MMBusinessAttribute<Limit, DecimalNumber>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Limit.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Quantity";
			definition = "Specifies that the limit is a quantity.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}

		@Override
		public DecimalNumber getValue(Limit obj) {
			return obj.getQuantity();
		}

		@Override
		public void setValue(Limit obj, DecimalNumber value) {
			obj.setQuantity(value);
		}
	};
	protected List<DateTimePeriod> validityPeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmRelatedLimit
	 * DateTimePeriod.mmRelatedLimit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Limit
	 * Limit}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValidityPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Period at which the limit is effective."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Limit, List<DateTimePeriod>> mmValidityPeriod = new MMBusinessAssociationEnd<Limit, List<DateTimePeriod>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Limit.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ValidityPeriod";
			definition = "Period at which the limit is effective.";
			minOccurs = 0;
			opposite_lazy = () -> DateTimePeriod.mmRelatedLimit;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> DateTimePeriod.mmObject();
		}

		@Override
		public List<DateTimePeriod> getValue(Limit obj) {
			return obj.getValidityPeriod();
		}

		@Override
		public void setValue(Limit obj, List<DateTimePeriod> value) {
			obj.setValidityPeriod(value);
		}
	};
	protected PaymentCard relatedPaymentCard;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PaymentCard
	 * PaymentCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentCard#mmLimit
	 * PaymentCard.mmLimit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Limit
	 * Limit}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedPaymentCard"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Payment card for which a limit is specified."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Limit, PaymentCard> mmRelatedPaymentCard = new MMBusinessAssociationEnd<Limit, PaymentCard>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Limit.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedPaymentCard";
			definition = "Payment card for which a limit is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> PaymentCard.mmLimit;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> PaymentCard.mmObject();
		}

		@Override
		public PaymentCard getValue(Limit obj) {
			return obj.getRelatedPaymentCard();
		}

		@Override
		public void setValue(Limit obj, PaymentCard value) {
			obj.setRelatedPaymentCard(value);
		}
	};
	protected CurrencyAndAmount availableAmount;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Limit
	 * Limit}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AvailableAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Remaining amount of money of the limit."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Limit, CurrencyAndAmount> mmAvailableAmount = new MMBusinessAttribute<Limit, CurrencyAndAmount>() {
		{
			derivation_lazy = () -> Arrays.asList(LimitAmount1.mmAvailableAmount, ATMTransactionAmounts4.mmAvailableAmount, ATMTransactionAmounts2.mmMaximumAuthorisableAmount, ATMTransactionAmounts8.mmMaximumPossibleAmount,
					ATMTransactionAmounts6.mmMaximumPossibleAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Limit.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AvailableAmount";
			definition = "Remaining amount of money of the limit.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(Limit obj) {
			return obj.getAvailableAmount();
		}

		@Override
		public void setValue(Limit obj, CurrencyAndAmount value) {
			obj.setAvailableAmount(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Limit";
				definition = "Value used for risk containment in a system or towards counterparts. The limit may be a current limit or a default limit.";
				associationDomain_lazy = () -> Arrays.asList(DateTimePeriod.mmRelatedLimit, PaymentCard.mmLimit, LimitStatus.mmLimit, DebitCreditFacility.mmCreditLine);
				derivationElement_lazy = () -> Arrays.asList(Limit1.mmCurrent, Limit1.mmLimit);
				subType_lazy = () -> Arrays.asList(RiskManagementLimit.mmObject(), Reservation.mmObject(), LiquidityManagementLimit.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Limit.mmType, com.tools20022.repository.entity.Limit.mmAmount, com.tools20022.repository.entity.Limit.mmCreditDebitIndicator,
						com.tools20022.repository.entity.Limit.mmUsedAmount, com.tools20022.repository.entity.Limit.mmUsedPercentage, com.tools20022.repository.entity.Limit.mmCurrency, com.tools20022.repository.entity.Limit.mmLimitStatus,
						com.tools20022.repository.entity.Limit.mmPercentage, com.tools20022.repository.entity.Limit.mmRelatedDebitCreditFacility, com.tools20022.repository.entity.Limit.mmPeriodicity,
						com.tools20022.repository.entity.Limit.mmQuantity, com.tools20022.repository.entity.Limit.mmValidityPeriod, com.tools20022.repository.entity.Limit.mmRelatedPaymentCard,
						com.tools20022.repository.entity.Limit.mmAvailableAmount);
				derivationComponent_lazy = () -> Arrays.asList(LimitDetails2.mmObject(), LimitDetails4.mmObject(), LimitSearchCriteria1.mmObject(), LimitSearchCriteria2.mmObject(), LimitSearchCriteria3.mmObject(), Limit6.mmObject(),
						LimitDetails.mmObject(), Limit5.mmObject(), LimitDetails3.mmObject(), Limit4.mmObject(), CreditLine1.mmObject(), CreditLine2.mmObject(), Limit2.mmObject(), Limit1.mmObject(), CurrentLimitChoice.mmObject(),
						LimitAmount1.mmObject(), ATMTransactionAmounts4.mmObject(), ATMTransactionAmounts2.mmObject(), ATMTransactionAmounts3.mmObject(), ATMTransactionAmounts8.mmObject(), ATMTransactionAmounts9.mmObject(),
						ATMTransactionAmounts6.mmObject(), ATMTransactionAmounts7.mmObject(), LimitSearchCriteria4.mmObject(), Limit7.mmObject(), Limit8.mmObject(), LimitSearchCriteria5.mmObject(), CreditLine3.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return Limit.class;
			}
		});
		return mmObject_lazy.get();
	}

	public LimitTypeCode getType() {
		return type;
	}

	public Limit setType(LimitTypeCode type) {
		this.type = Objects.requireNonNull(type);
		return this;
	}

	public CurrencyAndAmount getAmount() {
		return amount;
	}

	public Limit setAmount(CurrencyAndAmount amount) {
		this.amount = Objects.requireNonNull(amount);
		return this;
	}

	public FloorLimitTypeCode getCreditDebitIndicator() {
		return creditDebitIndicator;
	}

	public Limit setCreditDebitIndicator(FloorLimitTypeCode creditDebitIndicator) {
		this.creditDebitIndicator = Objects.requireNonNull(creditDebitIndicator);
		return this;
	}

	public Optional<CurrencyAndAmount> getUsedAmount() {
		return usedAmount == null ? Optional.empty() : Optional.of(usedAmount);
	}

	public Limit setUsedAmount(CurrencyAndAmount usedAmount) {
		this.usedAmount = usedAmount;
		return this;
	}

	public Optional<PercentageRate> getUsedPercentage() {
		return usedPercentage == null ? Optional.empty() : Optional.of(usedPercentage);
	}

	public Limit setUsedPercentage(PercentageRate usedPercentage) {
		this.usedPercentage = usedPercentage;
		return this;
	}

	public CurrencyCode getCurrency() {
		return currency;
	}

	public Limit setCurrency(CurrencyCode currency) {
		this.currency = Objects.requireNonNull(currency);
		return this;
	}

	public List<LimitStatus> getLimitStatus() {
		return limitStatus == null ? limitStatus = new ArrayList<>() : limitStatus;
	}

	public Limit setLimitStatus(List<LimitStatus> limitStatus) {
		this.limitStatus = Objects.requireNonNull(limitStatus);
		return this;
	}

	public PercentageRate getPercentage() {
		return percentage;
	}

	public Limit setPercentage(PercentageRate percentage) {
		this.percentage = Objects.requireNonNull(percentage);
		return this;
	}

	public DebitCreditFacility getRelatedDebitCreditFacility() {
		return relatedDebitCreditFacility;
	}

	public Limit setRelatedDebitCreditFacility(DebitCreditFacility relatedDebitCreditFacility) {
		this.relatedDebitCreditFacility = Objects.requireNonNull(relatedDebitCreditFacility);
		return this;
	}

	public FrequencyCode getPeriodicity() {
		return periodicity;
	}

	public Limit setPeriodicity(FrequencyCode periodicity) {
		this.periodicity = Objects.requireNonNull(periodicity);
		return this;
	}

	public DecimalNumber getQuantity() {
		return quantity;
	}

	public Limit setQuantity(DecimalNumber quantity) {
		this.quantity = Objects.requireNonNull(quantity);
		return this;
	}

	public List<DateTimePeriod> getValidityPeriod() {
		return validityPeriod == null ? validityPeriod = new ArrayList<>() : validityPeriod;
	}

	public Limit setValidityPeriod(List<DateTimePeriod> validityPeriod) {
		this.validityPeriod = Objects.requireNonNull(validityPeriod);
		return this;
	}

	public PaymentCard getRelatedPaymentCard() {
		return relatedPaymentCard;
	}

	public Limit setRelatedPaymentCard(PaymentCard relatedPaymentCard) {
		this.relatedPaymentCard = Objects.requireNonNull(relatedPaymentCard);
		return this;
	}

	public CurrencyAndAmount getAvailableAmount() {
		return availableAmount;
	}

	public Limit setAvailableAmount(CurrencyAndAmount availableAmount) {
		this.availableAmount = Objects.requireNonNull(availableAmount);
		return this;
	}
}