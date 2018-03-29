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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.ISOYearMonth;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.Period2;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Period as a date, a month or a date time span for which the statement is
 * provided.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.DatePeriod1Choice#mmDate
 * DatePeriod1Choice.mmDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.DatePeriod1Choice#mmDateMonth
 * DatePeriod1Choice.mmDateMonth}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.DatePeriod1Choice#mmFromDateToDate
 * DatePeriod1Choice.mmFromDateToDate}</li>
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
 * "DatePeriod1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Period as a date, a month or a date time span for which the statement is provided."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "DatePeriod1Choice", propOrder = {"date", "dateMonth", "fromDateToDate"})
public class DatePeriod1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Dt", required = true)
	protected ISODate date;
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
	 * {@linkplain com.tools20022.repository.choice.DatePeriod1Choice
	 * DatePeriod1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Dt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Date"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Time span defined by a specific date."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DatePeriod1Choice, ISODate> mmDate = new MMMessageAttribute<DatePeriod1Choice, ISODate>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.DatePeriod1Choice.mmObject();
			isDerived = false;
			xmlTag = "Dt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Date";
			definition = "Time span defined by a specific date.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public ISODate getValue(DatePeriod1Choice obj) {
			return obj.getDate();
		}

		@Override
		public void setValue(DatePeriod1Choice obj, ISODate value) {
			obj.setDate(value);
		}
	};
	@XmlElement(name = "DtMnth", required = true)
	protected ISOYearMonth dateMonth;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ISOYearMonth ISOYearMonth}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.DatePeriod1Choice
	 * DatePeriod1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DtMnth"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DateMonth"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Time span defined by a month and a year."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DatePeriod1Choice, ISOYearMonth> mmDateMonth = new MMMessageAttribute<DatePeriod1Choice, ISOYearMonth>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.DatePeriod1Choice.mmObject();
			isDerived = false;
			xmlTag = "DtMnth";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DateMonth";
			definition = "Time span defined by a month and a year.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISOYearMonth.mmObject();
		}

		@Override
		public ISOYearMonth getValue(DatePeriod1Choice obj) {
			return obj.getDateMonth();
		}

		@Override
		public void setValue(DatePeriod1Choice obj, ISOYearMonth value) {
			obj.setDateMonth(value);
		}
	};
	@XmlElement(name = "FrDtToDt", required = true)
	protected Period2 fromDateToDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Period2 Period2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.DatePeriod1Choice
	 * DatePeriod1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FrDtToDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FromDateToDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Time span defined by a start date and an end date."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<DatePeriod1Choice, Period2> mmFromDateToDate = new MMMessageAssociationEnd<DatePeriod1Choice, Period2>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.DatePeriod1Choice.mmObject();
			isDerived = false;
			xmlTag = "FrDtToDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FromDateToDate";
			definition = "Time span defined by a start date and an end date.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Period2.mmObject();
		}

		@Override
		public Period2 getValue(DatePeriod1Choice obj) {
			return obj.getFromDateToDate();
		}

		@Override
		public void setValue(DatePeriod1Choice obj, Period2 value) {
			obj.setFromDateToDate(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.DatePeriod1Choice.mmDate, com.tools20022.repository.choice.DatePeriod1Choice.mmDateMonth,
						com.tools20022.repository.choice.DatePeriod1Choice.mmFromDateToDate);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DatePeriod1Choice";
				definition = "Period as a date, a month or a date time span for which the statement is provided.";
			}
		});
		return mmObject_lazy.get();
	}

	public ISODate getDate() {
		return date;
	}

	public DatePeriod1Choice setDate(ISODate date) {
		this.date = Objects.requireNonNull(date);
		return this;
	}

	public ISOYearMonth getDateMonth() {
		return dateMonth;
	}

	public DatePeriod1Choice setDateMonth(ISOYearMonth dateMonth) {
		this.dateMonth = Objects.requireNonNull(dateMonth);
		return this;
	}

	public Period2 getFromDateToDate() {
		return fromDateToDate;
	}

	public DatePeriod1Choice setFromDateToDate(Period2 fromDateToDate) {
		this.fromDateToDate = Objects.requireNonNull(fromDateToDate);
		return this;
	}
}