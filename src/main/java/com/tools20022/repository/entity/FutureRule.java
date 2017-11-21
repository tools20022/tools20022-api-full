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
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.Future1;
import com.tools20022.repository.msg.Future2;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
	 * Indicates whether the time to maturity is measured in months or years.
	 * <p>
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
	public static final MMBusinessAttribute mmTimeType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(Future1.mmTimeUnit, Future2.mmTimeUnit);
			elementContext_lazy = () -> com.tools20022.repository.entity.FutureRule.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TimeType";
			definition = "Indicates whether the time to maturity is measured in months or years.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TimeUnitCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return FutureRule.class.getMethod("getTimeType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Future relatedFutureInstrument;
	/**
	 * Future instrument for which a rule is specified.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmRelatedFutureInstrument = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.FutureRule.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedFutureInstrument";
			definition = "Future instrument for which a rule is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Future.mmFutureRule;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Future.mmObject();
		}
	};
	protected Number maximumTimeToMaturity;
	/**
	 * Maximum number of time types up to maturity or first redemption option.
	 * <p>
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
	public static final MMBusinessAttribute mmMaximumTimeToMaturity = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.FutureRule.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MaximumTimeToMaturity";
			definition = "Maximum number of time types up to maturity or first redemption option.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return FutureRule.class.getMethod("getMaximumTimeToMaturity", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Number minimumTimeToMaturity;
	/**
	 * Minimum number of time types up to maturity or first redemption option.
	 * <p>
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
	public static final MMBusinessAttribute mmMinimumTimeToMaturity = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.FutureRule.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MinimumTimeToMaturity";
			definition = "Minimum number of time types up to maturity or first redemption option.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return FutureRule.class.getMethod("getMinimumTimeToMaturity", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PercentageRate baseInterestRate;
	/**
	 * Nominal interest rate of synthetic bond.
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
	public static final MMBusinessAttribute mmBaseInterestRate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.FutureRule.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BaseInterestRate";
			definition = "Nominal interest rate of synthetic bond.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return FutureRule.class.getMethod("getBaseInterestRate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FutureRule";
				definition = "Timing characteristics of the maturity of the future.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Future.mmFutureRule);
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

	public void setTimeType(TimeUnitCode timeType) {
		this.timeType = timeType;
	}

	public Future getRelatedFutureInstrument() {
		return relatedFutureInstrument;
	}

	public void setRelatedFutureInstrument(com.tools20022.repository.entity.Future relatedFutureInstrument) {
		this.relatedFutureInstrument = relatedFutureInstrument;
	}

	public Number getMaximumTimeToMaturity() {
		return maximumTimeToMaturity;
	}

	public void setMaximumTimeToMaturity(Number maximumTimeToMaturity) {
		this.maximumTimeToMaturity = maximumTimeToMaturity;
	}

	public Number getMinimumTimeToMaturity() {
		return minimumTimeToMaturity;
	}

	public void setMinimumTimeToMaturity(Number minimumTimeToMaturity) {
		this.minimumTimeToMaturity = minimumTimeToMaturity;
	}

	public PercentageRate getBaseInterestRate() {
		return baseInterestRate;
	}

	public void setBaseInterestRate(PercentageRate baseInterestRate) {
		this.baseInterestRate = baseInterestRate;
	}
}