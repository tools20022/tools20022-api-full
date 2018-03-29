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

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.Frequency3Code;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.entity.Instalment;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Financial loan (instalment) or a recurring transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RecurringTransaction3#mmStartDate
 * RecurringTransaction3.mmStartDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RecurringTransaction3#mmNumberOfOccurrences
 * RecurringTransaction3.mmNumberOfOccurrences}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RecurringTransaction3#mmEndDate
 * RecurringTransaction3.mmEndDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RecurringTransaction3#mmPeriodUnit
 * RecurringTransaction3.mmPeriodUnit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RecurringTransaction3#mmIntervalDay
 * RecurringTransaction3.mmIntervalDay}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Instalment Instalment}</li>
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
 * "RecurringTransaction3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Financial loan (instalment) or a recurring transaction."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "RecurringTransaction3", propOrder = {"startDate", "numberOfOccurrences", "endDate", "periodUnit", "intervalDay"})
public class RecurringTransaction3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "StartDt", required = true)
	protected ISODate startDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Instalment#mmFirstPaymentDate
	 * Instalment.mmFirstPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RecurringTransaction3
	 * RecurringTransaction3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StartDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StartDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date of first transfer."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RecurringTransaction3, ISODate> mmStartDate = new MMMessageAttribute<RecurringTransaction3, ISODate>() {
		{
			businessElementTrace_lazy = () -> Instalment.mmFirstPaymentDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.RecurringTransaction3.mmObject();
			isDerived = false;
			xmlTag = "StartDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StartDate";
			definition = "Date of first transfer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public ISODate getValue(RecurringTransaction3 obj) {
			return obj.getStartDate();
		}

		@Override
		public void setValue(RecurringTransaction3 obj, ISODate value) {
			obj.setStartDate(value);
		}
	};
	@XmlElement(name = "NbOfOcrncs")
	protected Number numberOfOccurrences;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Instalment#mmTotalNumberOfInstalment
	 * Instalment.mmTotalNumberOfInstalment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RecurringTransaction3
	 * RecurringTransaction3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NbOfOcrncs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NumberOfOccurrences"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of transfers to perform."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RecurringTransaction3, Optional<Number>> mmNumberOfOccurrences = new MMMessageAttribute<RecurringTransaction3, Optional<Number>>() {
		{
			businessElementTrace_lazy = () -> Instalment.mmTotalNumberOfInstalment;
			componentContext_lazy = () -> com.tools20022.repository.msg.RecurringTransaction3.mmObject();
			isDerived = false;
			xmlTag = "NbOfOcrncs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NumberOfOccurrences";
			definition = "Number of transfers to perform.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Optional<Number> getValue(RecurringTransaction3 obj) {
			return obj.getNumberOfOccurrences();
		}

		@Override
		public void setValue(RecurringTransaction3 obj, Optional<Number> value) {
			obj.setNumberOfOccurrences(value.orElse(null));
		}
	};
	@XmlElement(name = "EndDt", required = true)
	protected ISODate endDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RecurringTransaction3
	 * RecurringTransaction3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EndDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EndDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date of last transfer."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RecurringTransaction3, ISODate> mmEndDate = new MMMessageAttribute<RecurringTransaction3, ISODate>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.RecurringTransaction3.mmObject();
			isDerived = false;
			xmlTag = "EndDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndDate";
			definition = "Date of last transfer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public ISODate getValue(RecurringTransaction3 obj) {
			return obj.getEndDate();
		}

		@Override
		public void setValue(RecurringTransaction3 obj, ISODate value) {
			obj.setEndDate(value);
		}
	};
	@XmlElement(name = "PrdUnit")
	protected Frequency3Code periodUnit;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.Frequency3Code
	 * Frequency3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Instalment#mmPeriodUnit
	 * Instalment.mmPeriodUnit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RecurringTransaction3
	 * RecurringTransaction3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrdUnit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PeriodUnit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Period of the recurring transfer."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RecurringTransaction3, Optional<Frequency3Code>> mmPeriodUnit = new MMMessageAttribute<RecurringTransaction3, Optional<Frequency3Code>>() {
		{
			businessElementTrace_lazy = () -> Instalment.mmPeriodUnit;
			componentContext_lazy = () -> com.tools20022.repository.msg.RecurringTransaction3.mmObject();
			isDerived = false;
			xmlTag = "PrdUnit";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PeriodUnit";
			definition = "Period of the recurring transfer.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Frequency3Code.mmObject();
		}

		@Override
		public Optional<Frequency3Code> getValue(RecurringTransaction3 obj) {
			return obj.getPeriodUnit();
		}

		@Override
		public void setValue(RecurringTransaction3 obj, Optional<Frequency3Code> value) {
			obj.setPeriodUnit(value.orElse(null));
		}
	};
	@XmlElement(name = "IntrvlDay")
	protected Number intervalDay;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Instalment#mmNumberOfUnits
	 * Instalment.mmNumberOfUnits}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RecurringTransaction3
	 * RecurringTransaction3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrvlDay"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntervalDay"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Day of the period when the transfer will be performed."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RecurringTransaction3, Optional<Number>> mmIntervalDay = new MMMessageAttribute<RecurringTransaction3, Optional<Number>>() {
		{
			businessElementTrace_lazy = () -> Instalment.mmNumberOfUnits;
			componentContext_lazy = () -> com.tools20022.repository.msg.RecurringTransaction3.mmObject();
			isDerived = false;
			xmlTag = "IntrvlDay";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntervalDay";
			definition = "Day of the period when the transfer will be performed.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Optional<Number> getValue(RecurringTransaction3 obj) {
			return obj.getIntervalDay();
		}

		@Override
		public void setValue(RecurringTransaction3 obj, Optional<Number> value) {
			obj.setIntervalDay(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RecurringTransaction3.mmStartDate, com.tools20022.repository.msg.RecurringTransaction3.mmNumberOfOccurrences,
						com.tools20022.repository.msg.RecurringTransaction3.mmEndDate, com.tools20022.repository.msg.RecurringTransaction3.mmPeriodUnit, com.tools20022.repository.msg.RecurringTransaction3.mmIntervalDay);
				trace_lazy = () -> Instalment.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RecurringTransaction3";
				definition = "Financial loan (instalment) or a recurring transaction.";
			}
		});
		return mmObject_lazy.get();
	}

	public ISODate getStartDate() {
		return startDate;
	}

	public RecurringTransaction3 setStartDate(ISODate startDate) {
		this.startDate = Objects.requireNonNull(startDate);
		return this;
	}

	public Optional<Number> getNumberOfOccurrences() {
		return numberOfOccurrences == null ? Optional.empty() : Optional.of(numberOfOccurrences);
	}

	public RecurringTransaction3 setNumberOfOccurrences(Number numberOfOccurrences) {
		this.numberOfOccurrences = numberOfOccurrences;
		return this;
	}

	public ISODate getEndDate() {
		return endDate;
	}

	public RecurringTransaction3 setEndDate(ISODate endDate) {
		this.endDate = Objects.requireNonNull(endDate);
		return this;
	}

	public Optional<Frequency3Code> getPeriodUnit() {
		return periodUnit == null ? Optional.empty() : Optional.of(periodUnit);
	}

	public RecurringTransaction3 setPeriodUnit(Frequency3Code periodUnit) {
		this.periodUnit = periodUnit;
		return this;
	}

	public Optional<Number> getIntervalDay() {
		return intervalDay == null ? Optional.empty() : Optional.of(intervalDay);
	}

	public RecurringTransaction3 setIntervalDay(Number intervalDay) {
		this.intervalDay = intervalDay;
		return this;
	}
}