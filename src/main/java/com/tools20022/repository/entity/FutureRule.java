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
import com.tools20022.repository.codeset.TimeUnitCode;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.Future;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.Future1;
import com.tools20022.repository.msg.Future2;
import com.tools20022.repository.msg.Future3;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;

/**
 * Timing characteristics of the maturity of the future.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="FutureRule" src="doc-files/FutureRule.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.FutureRule#mmTimeType
 * FutureRule.mmTimeType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FutureRule#mmRelatedFutureInstrument
 * FutureRule.mmRelatedFutureInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FutureRule#mmMaximumTimeToMaturity
 * FutureRule.mmMaximumTimeToMaturity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FutureRule#mmMinimumTimeToMaturity
 * FutureRule.mmMinimumTimeToMaturity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FutureRule#mmBaseInterestRate
 * FutureRule.mmBaseInterestRate}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Future#mmFutureRule
 * Future.mmFutureRule}</li>
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
 * "FutureRule"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Timing characteristics of the maturity of the future."</li>
 * </ul>
 */
public class FutureRule {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected TimeUnitCode timeType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.TimeUnitCode
	 * TimeUnitCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Future1#mmTimeUnit
	 * Future1.mmTimeUnit}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Future2#mmTimeUnit
	 * Future2.mmTimeUnit}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Future3#mmTimeUnit
	 * Future3.mmTimeUnit}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.FutureRule FutureRule}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TimeType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the time to maturity is measured in months or years."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<FutureRule, TimeUnitCode> mmTimeType = new MMBusinessAttribute<FutureRule, TimeUnitCode>() {
		{
			derivation_lazy = () -> Arrays.asList(Future1.mmTimeUnit, Future2.mmTimeUnit, Future3.mmTimeUnit);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.FutureRule.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TimeType";
			definition = "Indicates whether the time to maturity is measured in months or years.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TimeUnitCode.mmObject();
		}

		@Override
		public TimeUnitCode getValue(FutureRule obj) {
			return obj.getTimeType();
		}

		@Override
		public void setValue(FutureRule obj, TimeUnitCode value) {
			obj.setTimeType(value);
		}
	};
	protected Future relatedFutureInstrument;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Future#mmFutureRule
	 * Future.mmFutureRule}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Future Future}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.FutureRule FutureRule}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedFutureInstrument"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Future instrument for which a rule is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<FutureRule, Optional<Future>> mmRelatedFutureInstrument = new MMBusinessAssociationEnd<FutureRule, Optional<Future>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.FutureRule.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedFutureInstrument";
			definition = "Future instrument for which a rule is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> Future.mmFutureRule;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Future.mmObject();
		}

		@Override
		public Optional<Future> getValue(FutureRule obj) {
			return obj.getRelatedFutureInstrument();
		}

		@Override
		public void setValue(FutureRule obj, Optional<Future> value) {
			obj.setRelatedFutureInstrument(value.orElse(null));
		}
	};
	protected Number maximumTimeToMaturity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.FutureRule FutureRule}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumTimeToMaturity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Maximum number of time types up to maturity or first redemption option."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<FutureRule, Number> mmMaximumTimeToMaturity = new MMBusinessAttribute<FutureRule, Number>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.FutureRule.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MaximumTimeToMaturity";
			definition = "Maximum number of time types up to maturity or first redemption option.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Number getValue(FutureRule obj) {
			return obj.getMaximumTimeToMaturity();
		}

		@Override
		public void setValue(FutureRule obj, Number value) {
			obj.setMaximumTimeToMaturity(value);
		}
	};
	protected Number minimumTimeToMaturity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.FutureRule FutureRule}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumTimeToMaturity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum number of time types up to maturity or first redemption option."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<FutureRule, Number> mmMinimumTimeToMaturity = new MMBusinessAttribute<FutureRule, Number>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.FutureRule.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MinimumTimeToMaturity";
			definition = "Minimum number of time types up to maturity or first redemption option.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Number getValue(FutureRule obj) {
			return obj.getMinimumTimeToMaturity();
		}

		@Override
		public void setValue(FutureRule obj, Number value) {
			obj.setMinimumTimeToMaturity(value);
		}
	};
	protected PercentageRate baseInterestRate;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.FutureRule FutureRule}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BaseInterestRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Nominal interest rate of synthetic bond."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<FutureRule, PercentageRate> mmBaseInterestRate = new MMBusinessAttribute<FutureRule, PercentageRate>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.FutureRule.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BaseInterestRate";
			definition = "Nominal interest rate of synthetic bond.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public PercentageRate getValue(FutureRule obj) {
			return obj.getBaseInterestRate();
		}

		@Override
		public void setValue(FutureRule obj, PercentageRate value) {
			obj.setBaseInterestRate(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FutureRule";
				definition = "Timing characteristics of the maturity of the future.";
				associationDomain_lazy = () -> Arrays.asList(Future.mmFutureRule);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.FutureRule.mmTimeType, com.tools20022.repository.entity.FutureRule.mmRelatedFutureInstrument,
						com.tools20022.repository.entity.FutureRule.mmMaximumTimeToMaturity, com.tools20022.repository.entity.FutureRule.mmMinimumTimeToMaturity, com.tools20022.repository.entity.FutureRule.mmBaseInterestRate);
			}

			@Override
			public Class<?> getInstanceClass() {
				return FutureRule.class;
			}
		});
		return mmObject_lazy.get();
	}

	public TimeUnitCode getTimeType() {
		return timeType;
	}

	public FutureRule setTimeType(TimeUnitCode timeType) {
		this.timeType = Objects.requireNonNull(timeType);
		return this;
	}

	public Optional<Future> getRelatedFutureInstrument() {
		return relatedFutureInstrument == null ? Optional.empty() : Optional.of(relatedFutureInstrument);
	}

	public FutureRule setRelatedFutureInstrument(Future relatedFutureInstrument) {
		this.relatedFutureInstrument = relatedFutureInstrument;
		return this;
	}

	public Number getMaximumTimeToMaturity() {
		return maximumTimeToMaturity;
	}

	public FutureRule setMaximumTimeToMaturity(Number maximumTimeToMaturity) {
		this.maximumTimeToMaturity = Objects.requireNonNull(maximumTimeToMaturity);
		return this;
	}

	public Number getMinimumTimeToMaturity() {
		return minimumTimeToMaturity;
	}

	public FutureRule setMinimumTimeToMaturity(Number minimumTimeToMaturity) {
		this.minimumTimeToMaturity = Objects.requireNonNull(minimumTimeToMaturity);
		return this;
	}

	public PercentageRate getBaseInterestRate() {
		return baseInterestRate;
	}

	public FutureRule setBaseInterestRate(PercentageRate baseInterestRate) {
		this.baseInterestRate = Objects.requireNonNull(baseInterestRate);
		return this;
	}
}