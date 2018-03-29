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
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.ISOYearMonth;
import com.tools20022.repository.entity.InvestmentFundClass;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice of formats for a date.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.DateFormat42Choice#mmYearMonth
 * DateFormat42Choice.mmYearMonth}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.DateFormat42Choice#mmYearMonthDay
 * DateFormat42Choice.mmYearMonthDay}</li>
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
 * "DateFormat42Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice of formats for a date."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "DateFormat42Choice", propOrder = {"yearMonth", "yearMonthDay"})
public class DateFormat42Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "YrMnth", required = true)
	protected ISOYearMonth yearMonth;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmSeriesIssueIdentificationDate
	 * InvestmentFundClass.mmSeriesIssueIdentificationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat42Choice
	 * DateFormat42Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "YrMnth"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "YearMonth"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Year and month."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DateFormat42Choice, ISOYearMonth> mmYearMonth = new MMMessageAttribute<DateFormat42Choice, ISOYearMonth>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundClass.mmSeriesIssueIdentificationDate;
			componentContext_lazy = () -> com.tools20022.repository.choice.DateFormat42Choice.mmObject();
			isDerived = false;
			xmlTag = "YrMnth";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "YearMonth";
			definition = "Year and month.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISOYearMonth.mmObject();
		}

		@Override
		public ISOYearMonth getValue(DateFormat42Choice obj) {
			return obj.getYearMonth();
		}

		@Override
		public void setValue(DateFormat42Choice obj, ISOYearMonth value) {
			obj.setYearMonth(value);
		}
	};
	@XmlElement(name = "YrMnthDay", required = true)
	protected ISODate yearMonthDay;
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmSeriesIssueIdentificationDate
	 * InvestmentFundClass.mmSeriesIssueIdentificationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat42Choice
	 * DateFormat42Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "YrMnthDay"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "YearMonthDay"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Year, month and day."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DateFormat42Choice, ISODate> mmYearMonthDay = new MMMessageAttribute<DateFormat42Choice, ISODate>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundClass.mmSeriesIssueIdentificationDate;
			componentContext_lazy = () -> com.tools20022.repository.choice.DateFormat42Choice.mmObject();
			isDerived = false;
			xmlTag = "YrMnthDay";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "YearMonthDay";
			definition = "Year, month and day.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public ISODate getValue(DateFormat42Choice obj) {
			return obj.getYearMonthDay();
		}

		@Override
		public void setValue(DateFormat42Choice obj, ISODate value) {
			obj.setYearMonthDay(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.DateFormat42Choice.mmYearMonth, com.tools20022.repository.choice.DateFormat42Choice.mmYearMonthDay);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DateFormat42Choice";
				definition = "Choice of formats for a date.";
			}
		});
		return mmObject_lazy.get();
	}

	public ISOYearMonth getYearMonth() {
		return yearMonth;
	}

	public DateFormat42Choice setYearMonth(ISOYearMonth yearMonth) {
		this.yearMonth = Objects.requireNonNull(yearMonth);
		return this;
	}

	public ISODate getYearMonthDay() {
		return yearMonthDay;
	}

	public DateFormat42Choice setYearMonthDay(ISODate yearMonthDay) {
		this.yearMonthDay = Objects.requireNonNull(yearMonthDay);
		return this;
	}
}