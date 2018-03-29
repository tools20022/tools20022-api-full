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

import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.CreditDefaultSwapsDerivative3Choice;
import com.tools20022.repository.choice.Derivative2Choice;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.ISOYearMonth;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.entity.Swaps;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CreditDefaultSwapDerivative4;
import com.tools20022.repository.msg.CreditDefaultSwapIndex2;
import com.tools20022.repository.msg.CreditDefaultSwapSingleName2;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;

/**
 * Credit default swap is a particular type of swap designed to transfer the
 * credit exposure of fixed income products between two or more parties.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="CreditDefaultSwap" src="doc-files/CreditDefaultSwap.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Swaps Swaps}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CreditDefaultSwap#mmRollDate
 * CreditDefaultSwap.mmRollDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CreditDefaultSwap#mmRollMonth
 * CreditDefaultSwap.mmRollMonth}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CreditDefaultSwap#mmSeries
 * CreditDefaultSwap.mmSeries}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditDefaultSwapDerivative4#mmSingleName
 * CreditDefaultSwapDerivative4.mmSingleName}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Derivative2Choice#mmCredit
 * Derivative2Choice.mmCredit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CreditDefaultSwapsDerivative3Choice#mmSingleNameCreditDefaultSwap
 * CreditDefaultSwapsDerivative3Choice.mmSingleNameCreditDefaultSwap}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CreditDefaultSwapsDerivative3Choice#mmCreditDefaultSwapIndex
 * CreditDefaultSwapsDerivative3Choice.mmCreditDefaultSwapIndex}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CreditDefaultSwapsDerivative3Choice#mmSingleNameCreditDefaultSwapDerivative
 * CreditDefaultSwapsDerivative3Choice.mmSingleNameCreditDefaultSwapDerivative}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CreditDefaultSwapsDerivative3Choice#mmCreditDefaultSwapIndexDerivative
 * CreditDefaultSwapsDerivative3Choice.mmCreditDefaultSwapIndexDerivative}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CreditDefaultSwapSingleName2
 * CreditDefaultSwapSingleName2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CreditDefaultSwapIndex2
 * CreditDefaultSwapIndex2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CreditDefaultSwapDerivative4
 * CreditDefaultSwapDerivative4}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CreditDefaultSwapsDerivative3Choice
 * CreditDefaultSwapsDerivative3Choice}</li>
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
 * "CreditDefaultSwap"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Credit default swap is a particular type of swap designed to transfer the credit exposure of fixed income products between two or more parties. "
 * </li>
 * </ul>
 */
public class CreditDefaultSwap extends Swaps {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected ISODate rollDate;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CreditDefaultSwapIndex2#mmNextRollDate
	 * CreditDefaultSwapIndex2.mmNextRollDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CreditDefaultSwap
	 * CreditDefaultSwap}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RollDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Roll date of the underlying asset as established by the asset issuer."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CreditDefaultSwap, ISODate> mmRollDate = new MMBusinessAttribute<CreditDefaultSwap, ISODate>() {
		{
			derivation_lazy = () -> Arrays.asList(CreditDefaultSwapIndex2.mmNextRollDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CreditDefaultSwap.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RollDate";
			definition = "Roll date of the underlying asset as established by the asset issuer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public ISODate getValue(CreditDefaultSwap obj) {
			return obj.getRollDate();
		}

		@Override
		public void setValue(CreditDefaultSwap obj, ISODate value) {
			obj.setRollDate(value);
		}
	};
	protected ISOYearMonth rollMonth;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ISOYearMonth ISOYearMonth}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CreditDefaultSwap
	 * CreditDefaultSwap}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RollMonth"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Roll month of the underlying asset as established by the asset issuer."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CreditDefaultSwap, ISOYearMonth> mmRollMonth = new MMBusinessAttribute<CreditDefaultSwap, ISOYearMonth>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CreditDefaultSwap.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RollMonth";
			definition = "Roll month of the underlying asset as established by the asset issuer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISOYearMonth.mmObject();
		}

		@Override
		public ISOYearMonth getValue(CreditDefaultSwap obj) {
			return obj.getRollMonth();
		}

		@Override
		public void setValue(CreditDefaultSwap obj, ISOYearMonth value) {
			obj.setRollMonth(value);
		}
	};
	protected Number series;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditDefaultSwapIndex2#mmSeries
	 * CreditDefaultSwapIndex2.mmSeries}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CreditDefaultSwap
	 * CreditDefaultSwap}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Series"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Series number of the composition of the derivative if applicable."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CreditDefaultSwap, Number> mmSeries = new MMBusinessAttribute<CreditDefaultSwap, Number>() {
		{
			derivation_lazy = () -> Arrays.asList(CreditDefaultSwapIndex2.mmSeries);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CreditDefaultSwap.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Series";
			definition = "Series number of the composition of the derivative if applicable.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Number getValue(CreditDefaultSwap obj) {
			return obj.getSeries();
		}

		@Override
		public void setValue(CreditDefaultSwap obj, Number value) {
			obj.setSeries(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CreditDefaultSwap";
				definition = "Credit default swap is a particular type of swap designed to transfer the credit exposure of fixed income products between two or more parties. ";
				derivationElement_lazy = () -> Arrays.asList(CreditDefaultSwapDerivative4.mmSingleName, Derivative2Choice.mmCredit, CreditDefaultSwapsDerivative3Choice.mmSingleNameCreditDefaultSwap,
						CreditDefaultSwapsDerivative3Choice.mmCreditDefaultSwapIndex, CreditDefaultSwapsDerivative3Choice.mmSingleNameCreditDefaultSwapDerivative, CreditDefaultSwapsDerivative3Choice.mmCreditDefaultSwapIndexDerivative);
				superType_lazy = () -> Swaps.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CreditDefaultSwap.mmRollDate, com.tools20022.repository.entity.CreditDefaultSwap.mmRollMonth, com.tools20022.repository.entity.CreditDefaultSwap.mmSeries);
				derivationComponent_lazy = () -> Arrays.asList(CreditDefaultSwapSingleName2.mmObject(), CreditDefaultSwapIndex2.mmObject(), CreditDefaultSwapDerivative4.mmObject(), CreditDefaultSwapsDerivative3Choice.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return CreditDefaultSwap.class;
			}
		});
		return mmObject_lazy.get();
	}

	public ISODate getRollDate() {
		return rollDate;
	}

	public CreditDefaultSwap setRollDate(ISODate rollDate) {
		this.rollDate = Objects.requireNonNull(rollDate);
		return this;
	}

	public ISOYearMonth getRollMonth() {
		return rollMonth;
	}

	public CreditDefaultSwap setRollMonth(ISOYearMonth rollMonth) {
		this.rollMonth = Objects.requireNonNull(rollMonth);
		return this;
	}

	public Number getSeries() {
		return series;
	}

	public CreditDefaultSwap setSeries(Number series) {
		this.series = Objects.requireNonNull(series);
		return this;
	}
}