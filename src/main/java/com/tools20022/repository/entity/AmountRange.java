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
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.codeset.DebitCreditCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;

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
 * <li>{@linkplain com.tools20022.repository.entity.AmountRange#mmFromAmount
 * AmountRange.mmFromAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AmountRange#mmToAmount
 * AmountRange.mmToAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AmountRange#mmEqualAmount
 * AmountRange.mmEqualAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AmountRange#mmNotEqualAmount
 * AmountRange.mmNotEqualAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AmountRange#mmCreditDebitIndicator
 * AmountRange.mmCreditDebitIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AmountRange#mmCurrency
 * AmountRange.mmCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AmountRange#mmRelatedInterest
 * AmountRange.mmRelatedInterest}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AmountRangeBoundary#mmFromAmountRange
 * AmountRangeBoundary.mmFromAmountRange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AmountRangeBoundary#mmToAmountRange
 * AmountRangeBoundary.mmToAmountRange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmRateValidityRange
 * InterestCalculation.mmRateValidityRange}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ImpliedCurrencyAmountRangeChoice#mmFromToAmount
 * ImpliedCurrencyAmountRangeChoice.mmFromToAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ImpliedCurrencyAndAmountRange#mmAmount
 * ImpliedCurrencyAndAmountRange.mmAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyAndAmountRange#mmAmount
 * CurrencyAndAmountRange.mmAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyAndAmountRange2#mmAmount
 * CurrencyAndAmountRange2.mmAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AmountRange2Choice#mmImpliedCurrencyAndAmountRange
 * AmountRange2Choice.mmImpliedCurrencyAndAmountRange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AmountRange2Choice#mmCurrencyAndAmountRange
 * AmountRange2Choice.mmCurrencyAndAmountRange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AmountRangeChoice#mmImpliedCurrencyAndAmountRange
 * AmountRangeChoice.mmImpliedCurrencyAndAmountRange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AmountRangeChoice#mmCurrencyAndAmountRange
 * AmountRangeChoice.mmCurrencyAndAmountRange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ActiveCurrencyAndAmountRange1#mmAmount
 * ActiveCurrencyAndAmountRange1.mmAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ActiveAmountRange1Choice#mmImpliedCurrencyAndAmountRange
 * ActiveAmountRange1Choice.mmImpliedCurrencyAndAmountRange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ActiveAmountRange1Choice#mmCurrencyAndAmountRange
 * ActiveAmountRange1Choice.mmCurrencyAndAmountRange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ActiveOrHistoricCurrencyAndAmountRange1#mmAmount
 * ActiveOrHistoricCurrencyAndAmountRange1.mmAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ActiveOrHistoricAmountRange1Choice#mmImpliedCurrencyAndAmountRange
 * ActiveOrHistoricAmountRange1Choice.mmImpliedCurrencyAndAmountRange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ActiveOrHistoricAmountRange1Choice#mmCurrencyAndAmountRange
 * ActiveOrHistoricAmountRange1Choice.mmCurrencyAndAmountRange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ActiveCurrencyAndAmountRange2#mmAmount
 * ActiveCurrencyAndAmountRange2.mmAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ActiveAmountRange2Choice#mmImpliedCurrencyAndAmountRange
 * ActiveAmountRange2Choice.mmImpliedCurrencyAndAmountRange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ActiveAmountRange2Choice#mmCurrencyAndAmountRange
 * ActiveAmountRange2Choice.mmCurrencyAndAmountRange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ImpliedCurrencyAndAmountRange1#mmAmount
 * ImpliedCurrencyAndAmountRange1.mmAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ImpliedCurrencyAmountRange1Choice#mmFromToAmount
 * ImpliedCurrencyAmountRange1Choice.mmFromToAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ActiveOrHistoricCurrencyAndAmountRange2#mmAmount
 * ActiveOrHistoricCurrencyAndAmountRange2.mmAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ActiveAmountRange3Choice#mmImpliedCurrencyAndAmountRange
 * ActiveAmountRange3Choice.mmImpliedCurrencyAndAmountRange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ActiveAmountRange3Choice#mmCurrencyAndAmountRange
 * ActiveAmountRange3Choice.mmCurrencyAndAmountRange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ActiveCurrencyAndAmountRange3#mmAmount
 * ActiveCurrencyAndAmountRange3.mmAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ActiveOrHistoricAmountRange2Choice#mmImpliedCurrencyAndAmountRange
 * ActiveOrHistoricAmountRange2Choice.mmImpliedCurrencyAndAmountRange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ActiveOrHistoricAmountRange2Choice#mmCurrencyAndAmountRange
 * ActiveOrHistoricAmountRange2Choice.mmCurrencyAndAmountRange}</li>
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
 * <li>{@linkplain com.tools20022.repository.msg.ActiveCurrencyAndAmountRange2
 * ActiveCurrencyAndAmountRange2}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ActiveAmountRange2Choice
 * ActiveAmountRange2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ImpliedCurrencyAndAmountRange1
 * ImpliedCurrencyAndAmountRange1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ImpliedCurrencyAmountRange1Choice
 * ImpliedCurrencyAmountRange1Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ActiveOrHistoricCurrencyAndAmountRange2
 * ActiveOrHistoricCurrencyAndAmountRange2}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ActiveAmountRange3Choice
 * ActiveAmountRange3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ActiveCurrencyAndAmountRange3
 * ActiveCurrencyAndAmountRange3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ActiveOrHistoricAmountRange2Choice
 * ActiveOrHistoricAmountRange2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FromToAmountRange1
 * FromToAmountRange1}</li>
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
	protected AmountRangeBoundary fromAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AmountRangeBoundary#mmFromAmountRange
	 * AmountRangeBoundary.mmFromAmountRange}</li>
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
	 * {@linkplain com.tools20022.repository.msg.FromToAmountRange#mmFromAmount
	 * FromToAmountRange.mmFromAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ImpliedCurrencyAmountRangeChoice#mmFromAmount
	 * ImpliedCurrencyAmountRangeChoice.mmFromAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ImpliedCurrencyAmountRange1Choice#mmFromAmount
	 * ImpliedCurrencyAmountRange1Choice.mmFromAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FromToAmountRange1#mmFromAmount
	 * FromToAmountRange1.mmFromAmount}</li>
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
	public static final MMBusinessAssociationEnd mmFromAmount = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(FromToAmountRange.mmFromAmount, ImpliedCurrencyAmountRangeChoice.mmFromAmount, ImpliedCurrencyAmountRange1Choice.mmFromAmount, FromToAmountRange1.mmFromAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AmountRange.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FromAmount";
			definition = "Lower boundary of a range of amount values.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.AmountRangeBoundary.mmFromAmountRange;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.AmountRangeBoundary.mmObject();
		}
	};
	protected AmountRangeBoundary toAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AmountRangeBoundary#mmToAmountRange
	 * AmountRangeBoundary.mmToAmountRange}</li>
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
	 * {@linkplain com.tools20022.repository.msg.FromToAmountRange#mmToAmount
	 * FromToAmountRange.mmToAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ImpliedCurrencyAmountRangeChoice#mmToAmount
	 * ImpliedCurrencyAmountRangeChoice.mmToAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ImpliedCurrencyAmountRange1Choice#mmToAmount
	 * ImpliedCurrencyAmountRange1Choice.mmToAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FromToAmountRange1#mmToAmount
	 * FromToAmountRange1.mmToAmount}</li>
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
	public static final MMBusinessAssociationEnd mmToAmount = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(FromToAmountRange.mmToAmount, ImpliedCurrencyAmountRangeChoice.mmToAmount, ImpliedCurrencyAmountRange1Choice.mmToAmount, FromToAmountRange1.mmToAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AmountRange.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ToAmount";
			definition = "Upper boundary of a range of amount values.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.AmountRangeBoundary.mmToAmountRange;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.AmountRangeBoundary.mmObject();
		}
	};
	protected CurrencyAndAmount equalAmount;
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
	 * {@linkplain com.tools20022.repository.choice.ImpliedCurrencyAmountRangeChoice#mmEqualAmount
	 * ImpliedCurrencyAmountRangeChoice.mmEqualAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ImpliedCurrencyAmountRange1Choice#mmEqualAmount
	 * ImpliedCurrencyAmountRange1Choice.mmEqualAmount}</li>
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
	public static final MMBusinessAttribute mmEqualAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(ImpliedCurrencyAmountRangeChoice.mmEqualAmount, ImpliedCurrencyAmountRange1Choice.mmEqualAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AmountRange.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EqualAmount";
			definition = "Exact value an amount must match to be considered valid.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AmountRange.class.getMethod("getEqualAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyAndAmount notEqualAmount;
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
	 * {@linkplain com.tools20022.repository.choice.ImpliedCurrencyAmountRangeChoice#mmNotEqualAmount
	 * ImpliedCurrencyAmountRangeChoice.mmNotEqualAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ImpliedCurrencyAmountRange1Choice#mmNotEqualAmount
	 * ImpliedCurrencyAmountRange1Choice.mmNotEqualAmount}</li>
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
	public static final MMBusinessAttribute mmNotEqualAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(ImpliedCurrencyAmountRangeChoice.mmNotEqualAmount, ImpliedCurrencyAmountRange1Choice.mmNotEqualAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AmountRange.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NotEqualAmount";
			definition = "Value that an amount must not match to be considered valid.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AmountRange.class.getMethod("getNotEqualAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected DebitCreditCode creditDebitIndicator;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.ImpliedCurrencyAndAmountRange#mmCreditDebitIndicator
	 * ImpliedCurrencyAndAmountRange.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyAndAmountRange#mmCreditDebitIndicator
	 * CurrencyAndAmountRange.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyAndAmountRange2#mmCreditDebitIndicator
	 * CurrencyAndAmountRange2.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ActiveCurrencyAndAmountRange1#mmCreditDebitIndicator
	 * ActiveCurrencyAndAmountRange1.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ActiveOrHistoricCurrencyAndAmountRange1#mmCreditDebitIndicator
	 * ActiveOrHistoricCurrencyAndAmountRange1.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestRecord1#mmCreditDebitIndicator
	 * InterestRecord1.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ActiveCurrencyAndAmountRange2#mmCreditDebitIndicator
	 * ActiveCurrencyAndAmountRange2.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ImpliedCurrencyAndAmountRange1#mmCreditDebitIndicator
	 * ImpliedCurrencyAndAmountRange1.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ActiveOrHistoricCurrencyAndAmountRange2#mmCreditDebitIndicator
	 * ActiveOrHistoricCurrencyAndAmountRange2.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestRecord2#mmCreditDebitIndicator
	 * InterestRecord2.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ActiveCurrencyAndAmountRange3#mmCreditDebitIndicator
	 * ActiveCurrencyAndAmountRange3.mmCreditDebitIndicator}</li>
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
	public static final MMBusinessAttribute mmCreditDebitIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(ImpliedCurrencyAndAmountRange.mmCreditDebitIndicator, CurrencyAndAmountRange.mmCreditDebitIndicator, CurrencyAndAmountRange2.mmCreditDebitIndicator,
					ActiveCurrencyAndAmountRange1.mmCreditDebitIndicator, ActiveOrHistoricCurrencyAndAmountRange1.mmCreditDebitIndicator, InterestRecord1.mmCreditDebitIndicator, ActiveCurrencyAndAmountRange2.mmCreditDebitIndicator,
					ImpliedCurrencyAndAmountRange1.mmCreditDebitIndicator, ActiveOrHistoricCurrencyAndAmountRange2.mmCreditDebitIndicator, InterestRecord2.mmCreditDebitIndicator, ActiveCurrencyAndAmountRange3.mmCreditDebitIndicator);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AmountRange.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CreditDebitIndicator";
			definition = "Indicates whether the amount is a credited or debited amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DebitCreditCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AmountRange.class.getMethod("getCreditDebitIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
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
	 * {@linkplain com.tools20022.repository.msg.CurrencyAndAmountRange#mmCurrency
	 * CurrencyAndAmountRange.mmCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyAndAmountRange2#mmCurrency
	 * CurrencyAndAmountRange2.mmCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ActiveCurrencyAndAmountRange1#mmCurrency
	 * ActiveCurrencyAndAmountRange1.mmCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ActiveOrHistoricCurrencyAndAmountRange1#mmCurrency
	 * ActiveOrHistoricCurrencyAndAmountRange1.mmCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ActiveCurrencyAndAmountRange2#mmCurrency
	 * ActiveCurrencyAndAmountRange2.mmCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ActiveOrHistoricCurrencyAndAmountRange2#mmCurrency
	 * ActiveOrHistoricCurrencyAndAmountRange2.mmCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ActiveCurrencyAndAmountRange3#mmCurrency
	 * ActiveCurrencyAndAmountRange3.mmCurrency}</li>
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
	public static final MMBusinessAttribute mmCurrency = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CurrencyAndAmountRange.mmCurrency, CurrencyAndAmountRange2.mmCurrency, ActiveCurrencyAndAmountRange1.mmCurrency, ActiveOrHistoricCurrencyAndAmountRange1.mmCurrency,
					ActiveCurrencyAndAmountRange2.mmCurrency, ActiveOrHistoricCurrencyAndAmountRange2.mmCurrency, ActiveCurrencyAndAmountRange3.mmCurrency);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AmountRange.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Currency";
			definition = "Medium of exchange of value, used to qualify an amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AmountRange.class.getMethod("getCurrency", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected InterestCalculation relatedInterest;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmRateValidityRange
	 * InterestCalculation.mmRateValidityRange}</li>
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
	public static final MMBusinessAssociationEnd mmRelatedInterest = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AmountRange.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedInterest";
			definition = "Interest which applies on a specific amount range.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InterestCalculation.mmRateValidityRange;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InterestCalculation.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AmountRange";
				definition = "Range of amount values.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.AmountRangeBoundary.mmFromAmountRange, com.tools20022.repository.entity.AmountRangeBoundary.mmToAmountRange,
						com.tools20022.repository.entity.InterestCalculation.mmRateValidityRange);
				derivationElement_lazy = () -> Arrays.asList(ImpliedCurrencyAmountRangeChoice.mmFromToAmount, ImpliedCurrencyAndAmountRange.mmAmount, CurrencyAndAmountRange.mmAmount, CurrencyAndAmountRange2.mmAmount,
						AmountRange2Choice.mmImpliedCurrencyAndAmountRange, AmountRange2Choice.mmCurrencyAndAmountRange, AmountRangeChoice.mmImpliedCurrencyAndAmountRange, AmountRangeChoice.mmCurrencyAndAmountRange,
						ActiveCurrencyAndAmountRange1.mmAmount, ActiveAmountRange1Choice.mmImpliedCurrencyAndAmountRange, ActiveAmountRange1Choice.mmCurrencyAndAmountRange, ActiveOrHistoricCurrencyAndAmountRange1.mmAmount,
						ActiveOrHistoricAmountRange1Choice.mmImpliedCurrencyAndAmountRange, ActiveOrHistoricAmountRange1Choice.mmCurrencyAndAmountRange, ActiveCurrencyAndAmountRange2.mmAmount,
						ActiveAmountRange2Choice.mmImpliedCurrencyAndAmountRange, ActiveAmountRange2Choice.mmCurrencyAndAmountRange, ImpliedCurrencyAndAmountRange1.mmAmount, ImpliedCurrencyAmountRange1Choice.mmFromToAmount,
						ActiveOrHistoricCurrencyAndAmountRange2.mmAmount, ActiveAmountRange3Choice.mmImpliedCurrencyAndAmountRange, ActiveAmountRange3Choice.mmCurrencyAndAmountRange, ActiveCurrencyAndAmountRange3.mmAmount,
						ActiveOrHistoricAmountRange2Choice.mmImpliedCurrencyAndAmountRange, ActiveOrHistoricAmountRange2Choice.mmCurrencyAndAmountRange);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.AmountRange.mmFromAmount, com.tools20022.repository.entity.AmountRange.mmToAmount, com.tools20022.repository.entity.AmountRange.mmEqualAmount,
						com.tools20022.repository.entity.AmountRange.mmNotEqualAmount, com.tools20022.repository.entity.AmountRange.mmCreditDebitIndicator, com.tools20022.repository.entity.AmountRange.mmCurrency,
						com.tools20022.repository.entity.AmountRange.mmRelatedInterest);
				derivationComponent_lazy = () -> Arrays.asList(FromToAmountRange.mmObject(), ImpliedCurrencyAmountRangeChoice.mmObject(), ImpliedCurrencyAndAmountRange.mmObject(), CurrencyAndAmountRange.mmObject(),
						CurrencyAndAmountRange2.mmObject(), AmountRange2Choice.mmObject(), AmountRangeChoice.mmObject(), ActiveCurrencyAndAmountRange1.mmObject(), ActiveAmountRange1Choice.mmObject(),
						ActiveOrHistoricCurrencyAndAmountRange1.mmObject(), ActiveOrHistoricAmountRange1Choice.mmObject(), ActiveCurrencyAndAmountRange2.mmObject(), ActiveAmountRange2Choice.mmObject(),
						ImpliedCurrencyAndAmountRange1.mmObject(), ImpliedCurrencyAmountRange1Choice.mmObject(), ActiveOrHistoricCurrencyAndAmountRange2.mmObject(), ActiveAmountRange3Choice.mmObject(),
						ActiveCurrencyAndAmountRange3.mmObject(), ActiveOrHistoricAmountRange2Choice.mmObject(), FromToAmountRange1.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return AmountRange.class;
			}
		});
		return mmObject_lazy.get();
	}

	public AmountRangeBoundary getFromAmount() {
		return fromAmount;
	}

	public AmountRange setFromAmount(com.tools20022.repository.entity.AmountRangeBoundary fromAmount) {
		this.fromAmount = Objects.requireNonNull(fromAmount);
		return this;
	}

	public AmountRangeBoundary getToAmount() {
		return toAmount;
	}

	public AmountRange setToAmount(com.tools20022.repository.entity.AmountRangeBoundary toAmount) {
		this.toAmount = Objects.requireNonNull(toAmount);
		return this;
	}

	public CurrencyAndAmount getEqualAmount() {
		return equalAmount;
	}

	public AmountRange setEqualAmount(CurrencyAndAmount equalAmount) {
		this.equalAmount = Objects.requireNonNull(equalAmount);
		return this;
	}

	public CurrencyAndAmount getNotEqualAmount() {
		return notEqualAmount;
	}

	public AmountRange setNotEqualAmount(CurrencyAndAmount notEqualAmount) {
		this.notEqualAmount = Objects.requireNonNull(notEqualAmount);
		return this;
	}

	public DebitCreditCode getCreditDebitIndicator() {
		return creditDebitIndicator;
	}

	public AmountRange setCreditDebitIndicator(DebitCreditCode creditDebitIndicator) {
		this.creditDebitIndicator = Objects.requireNonNull(creditDebitIndicator);
		return this;
	}

	public CurrencyCode getCurrency() {
		return currency;
	}

	public AmountRange setCurrency(CurrencyCode currency) {
		this.currency = Objects.requireNonNull(currency);
		return this;
	}

	public Optional<InterestCalculation> getRelatedInterest() {
		return relatedInterest == null ? Optional.empty() : Optional.of(relatedInterest);
	}

	public AmountRange setRelatedInterest(com.tools20022.repository.entity.InterestCalculation relatedInterest) {
		this.relatedInterest = relatedInterest;
		return this;
	}
}