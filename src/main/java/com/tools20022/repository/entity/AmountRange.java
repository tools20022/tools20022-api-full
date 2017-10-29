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
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.codeset.DebitCreditCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Range of amount values.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="AmountRange" src="doc-files/AmountRange.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.AmountRange#FromAmount
 * AmountRange.FromAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AmountRange#ToAmount
 * AmountRange.ToAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AmountRange#EqualAmount
 * AmountRange.EqualAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AmountRange#NotEqualAmount
 * AmountRange.NotEqualAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AmountRange#CreditDebitIndicator
 * AmountRange.CreditDebitIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AmountRange#Currency
 * AmountRange.Currency}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AmountRange#RelatedInterest
 * AmountRange.RelatedInterest}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AmountRangeBoundary#FromAmountRange
 * AmountRangeBoundary.FromAmountRange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AmountRangeBoundary#ToAmountRange
 * AmountRangeBoundary.ToAmountRange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InterestCalculation#RateValidityRange
 * InterestCalculation.RateValidityRange}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ImpliedCurrencyAmountRangeChoice#FromToAmount
 * ImpliedCurrencyAmountRangeChoice.FromToAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ImpliedCurrencyAndAmountRange#Amount
 * ImpliedCurrencyAndAmountRange.Amount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CurrencyAndAmountRange#Amount
 * CurrencyAndAmountRange.Amount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CurrencyAndAmountRange2#Amount
 * CurrencyAndAmountRange2.Amount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AmountRange2Choice#ImpliedCurrencyAndAmountRange
 * AmountRange2Choice.ImpliedCurrencyAndAmountRange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AmountRange2Choice#CurrencyAndAmountRange
 * AmountRange2Choice.CurrencyAndAmountRange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AmountRangeChoice#ImpliedCurrencyAndAmountRange
 * AmountRangeChoice.ImpliedCurrencyAndAmountRange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AmountRangeChoice#CurrencyAndAmountRange
 * AmountRangeChoice.CurrencyAndAmountRange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ActiveCurrencyAndAmountRange1#Amount
 * ActiveCurrencyAndAmountRange1.Amount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ActiveAmountRange1Choice#ImpliedCurrencyAndAmountRange
 * ActiveAmountRange1Choice.ImpliedCurrencyAndAmountRange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ActiveAmountRange1Choice#CurrencyAndAmountRange
 * ActiveAmountRange1Choice.CurrencyAndAmountRange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ActiveOrHistoricCurrencyAndAmountRange1#Amount
 * ActiveOrHistoricCurrencyAndAmountRange1.Amount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ActiveOrHistoricAmountRange1Choice#ImpliedCurrencyAndAmountRange
 * ActiveOrHistoricAmountRange1Choice.ImpliedCurrencyAndAmountRange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ActiveOrHistoricAmountRange1Choice#CurrencyAndAmountRange
 * ActiveOrHistoricAmountRange1Choice.CurrencyAndAmountRange}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.FromToAmountRange
 * FromToAmountRange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ImpliedCurrencyAmountRangeChoice
 * ImpliedCurrencyAmountRangeChoice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ImpliedCurrencyAndAmountRange
 * ImpliedCurrencyAndAmountRange}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CurrencyAndAmountRange
 * CurrencyAndAmountRange}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CurrencyAndAmountRange2
 * CurrencyAndAmountRange2}</li>
 * <li>{@linkplain com.tools20022.repository.choice.AmountRange2Choice
 * AmountRange2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.AmountRangeChoice
 * AmountRangeChoice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ActiveCurrencyAndAmountRange1
 * ActiveCurrencyAndAmountRange1}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ActiveAmountRange1Choice
 * ActiveAmountRange1Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ActiveOrHistoricCurrencyAndAmountRange1
 * ActiveOrHistoricCurrencyAndAmountRange1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ActiveOrHistoricAmountRange1Choice
 * ActiveOrHistoricAmountRange1Choice}</li>
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
 * "AmountRange"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Range of amount values."</li>
 * </ul>
 */
public class AmountRange {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Lower boundary of a range of amount values.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AmountRangeBoundary#FromAmountRange
	 * AmountRangeBoundary.FromAmountRange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.AmountRangeBoundary
	 * AmountRangeBoundary}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FromToAmountRange#FromAmount
	 * FromToAmountRange.FromAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ImpliedCurrencyAmountRangeChoice#FromAmount
	 * ImpliedCurrencyAmountRangeChoice.FromAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AmountRange AmountRange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FromAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Lower boundary of a range of amount values."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd FromAmount = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FromToAmountRange.FromAmount, com.tools20022.repository.choice.ImpliedCurrencyAmountRangeChoice.FromAmount);
			elementContext_lazy = () -> AmountRange.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FromAmount";
			definition = "Lower boundary of a range of amount values.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> AmountRangeBoundary.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.AmountRangeBoundary.FromAmountRange;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Upper boundary of a range of amount values.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AmountRangeBoundary#ToAmountRange
	 * AmountRangeBoundary.ToAmountRange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.AmountRangeBoundary
	 * AmountRangeBoundary}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.FromToAmountRange#ToAmount
	 * FromToAmountRange.ToAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ImpliedCurrencyAmountRangeChoice#ToAmount
	 * ImpliedCurrencyAmountRangeChoice.ToAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AmountRange AmountRange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ToAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Upper boundary of a range of amount values."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ToAmount = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FromToAmountRange.ToAmount, com.tools20022.repository.choice.ImpliedCurrencyAmountRangeChoice.ToAmount);
			elementContext_lazy = () -> AmountRange.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ToAmount";
			definition = "Upper boundary of a range of amount values.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> AmountRangeBoundary.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.AmountRangeBoundary.ToAmountRange;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Exact value an amount must match to be considered valid.
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
	 * {@linkplain com.tools20022.repository.choice.ImpliedCurrencyAmountRangeChoice#EqualAmount
	 * ImpliedCurrencyAmountRangeChoice.EqualAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AmountRange AmountRange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EqualAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Exact value an amount must match to be considered valid."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute EqualAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.ImpliedCurrencyAmountRangeChoice.EqualAmount);
			elementContext_lazy = () -> AmountRange.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EqualAmount";
			definition = "Exact value an amount must match to be considered valid.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Value that an amount must not match to be considered valid.
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
	 * {@linkplain com.tools20022.repository.choice.ImpliedCurrencyAmountRangeChoice#NotEqualAmount
	 * ImpliedCurrencyAmountRangeChoice.NotEqualAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AmountRange AmountRange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotEqualAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Value that an amount must not match to be considered valid."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute NotEqualAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.ImpliedCurrencyAmountRangeChoice.NotEqualAmount);
			elementContext_lazy = () -> AmountRange.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NotEqualAmount";
			definition = "Value that an amount must not match to be considered valid.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Indicates whether the amount is a credited or debited amount.
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
	 * {@linkplain com.tools20022.repository.msg.ImpliedCurrencyAndAmountRange#CreditDebitIndicator
	 * ImpliedCurrencyAndAmountRange.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyAndAmountRange#CreditDebitIndicator
	 * CurrencyAndAmountRange.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyAndAmountRange2#CreditDebitIndicator
	 * CurrencyAndAmountRange2.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ActiveCurrencyAndAmountRange1#CreditDebitIndicator
	 * ActiveCurrencyAndAmountRange1.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ActiveOrHistoricCurrencyAndAmountRange1#CreditDebitIndicator
	 * ActiveOrHistoricCurrencyAndAmountRange1.CreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestRecord1#CreditDebitIndicator
	 * InterestRecord1.CreditDebitIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AmountRange AmountRange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditDebitIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the amount is a credited or debited amount."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CreditDebitIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ImpliedCurrencyAndAmountRange.CreditDebitIndicator, com.tools20022.repository.msg.CurrencyAndAmountRange.CreditDebitIndicator,
					com.tools20022.repository.msg.CurrencyAndAmountRange2.CreditDebitIndicator, com.tools20022.repository.msg.ActiveCurrencyAndAmountRange1.CreditDebitIndicator,
					com.tools20022.repository.msg.ActiveOrHistoricCurrencyAndAmountRange1.CreditDebitIndicator, com.tools20022.repository.msg.InterestRecord1.CreditDebitIndicator);
			elementContext_lazy = () -> AmountRange.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CreditDebitIndicator";
			definition = "Indicates whether the amount is a credited or debited amount.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> DebitCreditCode.mmObject();
		}
	};
	/**
	 * Medium of exchange of value, used to qualify an amount.
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
	 * {@linkplain com.tools20022.repository.msg.CurrencyAndAmountRange#Currency
	 * CurrencyAndAmountRange.Currency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyAndAmountRange2#Currency
	 * CurrencyAndAmountRange2.Currency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ActiveCurrencyAndAmountRange1#Currency
	 * ActiveCurrencyAndAmountRange1.Currency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ActiveOrHistoricCurrencyAndAmountRange1#Currency
	 * ActiveOrHistoricCurrencyAndAmountRange1.Currency}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AmountRange AmountRange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Currency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Medium of exchange of value, used to qualify an amount."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Currency = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CurrencyAndAmountRange.Currency, com.tools20022.repository.msg.CurrencyAndAmountRange2.Currency,
					com.tools20022.repository.msg.ActiveCurrencyAndAmountRange1.Currency, com.tools20022.repository.msg.ActiveOrHistoricCurrencyAndAmountRange1.Currency);
			elementContext_lazy = () -> AmountRange.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Currency";
			definition = "Medium of exchange of value, used to qualify an amount.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	/**
	 * Interest which applies on a specific amount range.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation#RateValidityRange
	 * InterestCalculation.RateValidityRange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.InterestCalculation
	 * InterestCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AmountRange AmountRange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedInterest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Interest which applies on a specific amount range."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedInterest = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> AmountRange.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedInterest";
			definition = "Interest which applies on a specific amount range.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> InterestCalculation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InterestCalculation.RateValidityRange;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "AmountRange";
				definition = "Range of amount values.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.AmountRangeBoundary.FromAmountRange, com.tools20022.repository.entity.AmountRangeBoundary.ToAmountRange,
						com.tools20022.repository.entity.InterestCalculation.RateValidityRange);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.ImpliedCurrencyAmountRangeChoice.FromToAmount, com.tools20022.repository.msg.ImpliedCurrencyAndAmountRange.Amount,
						com.tools20022.repository.msg.CurrencyAndAmountRange.Amount, com.tools20022.repository.msg.CurrencyAndAmountRange2.Amount, com.tools20022.repository.choice.AmountRange2Choice.ImpliedCurrencyAndAmountRange,
						com.tools20022.repository.choice.AmountRange2Choice.CurrencyAndAmountRange, com.tools20022.repository.choice.AmountRangeChoice.ImpliedCurrencyAndAmountRange,
						com.tools20022.repository.choice.AmountRangeChoice.CurrencyAndAmountRange, com.tools20022.repository.msg.ActiveCurrencyAndAmountRange1.Amount,
						com.tools20022.repository.choice.ActiveAmountRange1Choice.ImpliedCurrencyAndAmountRange, com.tools20022.repository.choice.ActiveAmountRange1Choice.CurrencyAndAmountRange,
						com.tools20022.repository.msg.ActiveOrHistoricCurrencyAndAmountRange1.Amount, com.tools20022.repository.choice.ActiveOrHistoricAmountRange1Choice.ImpliedCurrencyAndAmountRange,
						com.tools20022.repository.choice.ActiveOrHistoricAmountRange1Choice.CurrencyAndAmountRange);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.AmountRange.FromAmount, com.tools20022.repository.entity.AmountRange.ToAmount, com.tools20022.repository.entity.AmountRange.EqualAmount,
						com.tools20022.repository.entity.AmountRange.NotEqualAmount, com.tools20022.repository.entity.AmountRange.CreditDebitIndicator, com.tools20022.repository.entity.AmountRange.Currency,
						com.tools20022.repository.entity.AmountRange.RelatedInterest);
				derivationComponent_lazy = () -> Arrays.asList(FromToAmountRange.mmObject(), ImpliedCurrencyAmountRangeChoice.mmObject(), ImpliedCurrencyAndAmountRange.mmObject(), CurrencyAndAmountRange.mmObject(),
						CurrencyAndAmountRange2.mmObject(), AmountRange2Choice.mmObject(), AmountRangeChoice.mmObject(), ActiveCurrencyAndAmountRange1.mmObject(), ActiveAmountRange1Choice.mmObject(),
						ActiveOrHistoricCurrencyAndAmountRange1.mmObject(), ActiveOrHistoricAmountRange1Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}