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
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.entity.DateTimePeriod;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.DateTimePeriod1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice between various date time patterns.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.DateTimePeriod1Choice#mmFromDateTime
 * DateTimePeriod1Choice.mmFromDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.DateTimePeriod1Choice#mmToDateTime
 * DateTimePeriod1Choice.mmToDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.DateTimePeriod1Choice#mmDateTimeRange
 * DateTimePeriod1Choice.mmDateTimeRange}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
 * DateTimePeriod}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DateTimePeriod1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice between various date time patterns."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.choice.DateTimePeriodChoice
 * DateTimePeriodChoice}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "DateTimePeriod1Choice", propOrder = {"fromDateTime", "toDateTime", "dateTimeRange"})
public class DateTimePeriod1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "FrDtTm", required = true)
	protected ISODateTime fromDateTime;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmFromDateTime
	 * DateTimePeriod.mmFromDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.DateTimePeriod1Choice
	 * DateTimePeriod1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FrDtTm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FromDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date and time at which the range starts."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.DateTimePeriodChoice#mmFromDateTime
	 * DateTimePeriodChoice.mmFromDateTime}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DateTimePeriod1Choice, ISODateTime> mmFromDateTime = new MMMessageAttribute<DateTimePeriod1Choice, ISODateTime>() {
		{
			businessElementTrace_lazy = () -> DateTimePeriod.mmFromDateTime;
			componentContext_lazy = () -> com.tools20022.repository.choice.DateTimePeriod1Choice.mmObject();
			isDerived = false;
			xmlTag = "FrDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FromDateTime";
			definition = "Date and time at which the range starts.";
			previousVersion_lazy = () -> DateTimePeriodChoice.mmFromDateTime;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(DateTimePeriod1Choice obj) {
			return obj.getFromDateTime();
		}

		@Override
		public void setValue(DateTimePeriod1Choice obj, ISODateTime value) {
			obj.setFromDateTime(value);
		}
	};
	@XmlElement(name = "ToDtTm", required = true)
	protected ISODateTime toDateTime;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmToDateTime
	 * DateTimePeriod.mmToDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.DateTimePeriod1Choice
	 * DateTimePeriod1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ToDtTm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ToDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date and time at which the range ends."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.DateTimePeriodChoice#mmToDateTime
	 * DateTimePeriodChoice.mmToDateTime}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DateTimePeriod1Choice, ISODateTime> mmToDateTime = new MMMessageAttribute<DateTimePeriod1Choice, ISODateTime>() {
		{
			businessElementTrace_lazy = () -> DateTimePeriod.mmToDateTime;
			componentContext_lazy = () -> com.tools20022.repository.choice.DateTimePeriod1Choice.mmObject();
			isDerived = false;
			xmlTag = "ToDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ToDateTime";
			definition = "Date and time at which the range ends.";
			previousVersion_lazy = () -> DateTimePeriodChoice.mmToDateTime;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(DateTimePeriod1Choice obj) {
			return obj.getToDateTime();
		}

		@Override
		public void setValue(DateTimePeriod1Choice obj, ISODateTime value) {
			obj.setToDateTime(value);
		}
	};
	@XmlElement(name = "DtTmRg", required = true)
	protected DateTimePeriod1 dateTimeRange;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.DateTimePeriod1
	 * DateTimePeriod1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.DateTimePeriod1Choice
	 * DateTimePeriod1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DtTmRg"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DateTimeRange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Range of time between a start date and time and an end date and time."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.DateTimePeriodChoice#mmDateTimeRange
	 * DateTimePeriodChoice.mmDateTimeRange}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DateTimePeriod1Choice, DateTimePeriod1> mmDateTimeRange = new MMMessageAttribute<DateTimePeriod1Choice, DateTimePeriod1>() {
		{
			businessComponentTrace_lazy = () -> DateTimePeriod.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.DateTimePeriod1Choice.mmObject();
			isDerived = false;
			xmlTag = "DtTmRg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DateTimeRange";
			definition = "Range of time between a start date and time and an end date and time.";
			previousVersion_lazy = () -> DateTimePeriodChoice.mmDateTimeRange;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DateTimePeriod1.mmObject();
		}

		@Override
		public DateTimePeriod1 getValue(DateTimePeriod1Choice obj) {
			return obj.getDateTimeRange();
		}

		@Override
		public void setValue(DateTimePeriod1Choice obj, DateTimePeriod1 value) {
			obj.setDateTimeRange(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.DateTimePeriod1Choice.mmFromDateTime, com.tools20022.repository.choice.DateTimePeriod1Choice.mmToDateTime,
						com.tools20022.repository.choice.DateTimePeriod1Choice.mmDateTimeRange);
				trace_lazy = () -> DateTimePeriod.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DateTimePeriod1Choice";
				definition = "Choice between various date time patterns.";
				previousVersion_lazy = () -> DateTimePeriodChoice.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public ISODateTime getFromDateTime() {
		return fromDateTime;
	}

	public DateTimePeriod1Choice setFromDateTime(ISODateTime fromDateTime) {
		this.fromDateTime = Objects.requireNonNull(fromDateTime);
		return this;
	}

	public ISODateTime getToDateTime() {
		return toDateTime;
	}

	public DateTimePeriod1Choice setToDateTime(ISODateTime toDateTime) {
		this.toDateTime = Objects.requireNonNull(toDateTime);
		return this;
	}

	public DateTimePeriod1 getDateTimeRange() {
		return dateTimeRange;
	}

	public DateTimePeriod1Choice setDateTimeRange(DateTimePeriod1 dateTimeRange) {
		this.dateTimeRange = Objects.requireNonNull(dateTimeRange);
		return this;
	}
}