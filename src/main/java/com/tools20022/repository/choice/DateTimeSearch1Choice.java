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
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.DateTimePeriodDetails;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice between search criteria based on dates and date ranges.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.DateTimeSearch1Choice#mmFromDateTime
 * DateTimeSearch1Choice.mmFromDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.DateTimeSearch1Choice#mmToDateTime
 * DateTimeSearch1Choice.mmToDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.DateTimeSearch1Choice#mmFromToDateTime
 * DateTimeSearch1Choice.mmFromToDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.DateTimeSearch1Choice#mmEqualDateTime
 * DateTimeSearch1Choice.mmEqualDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.DateTimeSearch1Choice#mmNotEqualDateTime
 * DateTimeSearch1Choice.mmNotEqualDateTime}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DateTimeSearch1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice between search criteria based on dates and date ranges."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "DateTimeSearch1Choice", propOrder = {"fromDateTime", "toDateTime", "fromToDateTime", "equalDateTime", "notEqualDateTime"})
public class DateTimeSearch1Choice {

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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.DateTimeSearch1Choice
	 * DateTimeSearch1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FrDtTm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FromDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Start date of the range."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DateTimeSearch1Choice, ISODateTime> mmFromDateTime = new MMMessageAttribute<DateTimeSearch1Choice, ISODateTime>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.DateTimeSearch1Choice.mmObject();
			isDerived = false;
			xmlTag = "FrDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FromDateTime";
			definition = "Start date of the range.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(DateTimeSearch1Choice obj) {
			return obj.getFromDateTime();
		}

		@Override
		public void setValue(DateTimeSearch1Choice obj, ISODateTime value) {
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.DateTimeSearch1Choice
	 * DateTimeSearch1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ToDtTm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ToDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "End date of the range."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DateTimeSearch1Choice, ISODateTime> mmToDateTime = new MMMessageAttribute<DateTimeSearch1Choice, ISODateTime>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.DateTimeSearch1Choice.mmObject();
			isDerived = false;
			xmlTag = "ToDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ToDateTime";
			definition = "End date of the range.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(DateTimeSearch1Choice obj) {
			return obj.getToDateTime();
		}

		@Override
		public void setValue(DateTimeSearch1Choice obj, ISODateTime value) {
			obj.setToDateTime(value);
		}
	};
	@XmlElement(name = "FrToDtTm", required = true)
	protected DateTimePeriodDetails fromToDateTime;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.DateTimePeriodDetails
	 * DateTimePeriodDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.DateTimeSearch1Choice
	 * DateTimeSearch1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FrToDtTm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FromToDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Particular time span specified between a start date and an end date."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<DateTimeSearch1Choice, DateTimePeriodDetails> mmFromToDateTime = new MMMessageAssociationEnd<DateTimeSearch1Choice, DateTimePeriodDetails>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.DateTimeSearch1Choice.mmObject();
			isDerived = false;
			xmlTag = "FrToDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FromToDateTime";
			definition = "Particular time span specified between a start date and an end date.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> DateTimePeriodDetails.mmObject();
		}

		@Override
		public DateTimePeriodDetails getValue(DateTimeSearch1Choice obj) {
			return obj.getFromToDateTime();
		}

		@Override
		public void setValue(DateTimeSearch1Choice obj, DateTimePeriodDetails value) {
			obj.setFromToDateTime(value);
		}
	};
	@XmlElement(name = "EQDtTm", required = true)
	protected ISODateTime equalDateTime;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.DateTimeSearch1Choice
	 * DateTimeSearch1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EQDtTm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EqualDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specified date to match."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DateTimeSearch1Choice, ISODateTime> mmEqualDateTime = new MMMessageAttribute<DateTimeSearch1Choice, ISODateTime>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.DateTimeSearch1Choice.mmObject();
			isDerived = false;
			xmlTag = "EQDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EqualDateTime";
			definition = "Specified date to match.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(DateTimeSearch1Choice obj) {
			return obj.getEqualDateTime();
		}

		@Override
		public void setValue(DateTimeSearch1Choice obj, ISODateTime value) {
			obj.setEqualDateTime(value);
		}
	};
	@XmlElement(name = "NEQDtTm", required = true)
	protected ISODateTime notEqualDateTime;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.DateTimeSearch1Choice
	 * DateTimeSearch1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NEQDtTm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotEqualDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specified date to be excluded from the search."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DateTimeSearch1Choice, ISODateTime> mmNotEqualDateTime = new MMMessageAttribute<DateTimeSearch1Choice, ISODateTime>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.DateTimeSearch1Choice.mmObject();
			isDerived = false;
			xmlTag = "NEQDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotEqualDateTime";
			definition = "Specified date to be excluded from the search.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(DateTimeSearch1Choice obj) {
			return obj.getNotEqualDateTime();
		}

		@Override
		public void setValue(DateTimeSearch1Choice obj, ISODateTime value) {
			obj.setNotEqualDateTime(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.DateTimeSearch1Choice.mmFromDateTime, com.tools20022.repository.choice.DateTimeSearch1Choice.mmToDateTime,
						com.tools20022.repository.choice.DateTimeSearch1Choice.mmFromToDateTime, com.tools20022.repository.choice.DateTimeSearch1Choice.mmEqualDateTime,
						com.tools20022.repository.choice.DateTimeSearch1Choice.mmNotEqualDateTime);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "DateTimeSearch1Choice";
				definition = "Choice between search criteria based on dates and date ranges.";
			}
		});
		return mmObject_lazy.get();
	}

	public ISODateTime getFromDateTime() {
		return fromDateTime;
	}

	public DateTimeSearch1Choice setFromDateTime(ISODateTime fromDateTime) {
		this.fromDateTime = Objects.requireNonNull(fromDateTime);
		return this;
	}

	public ISODateTime getToDateTime() {
		return toDateTime;
	}

	public DateTimeSearch1Choice setToDateTime(ISODateTime toDateTime) {
		this.toDateTime = Objects.requireNonNull(toDateTime);
		return this;
	}

	public DateTimePeriodDetails getFromToDateTime() {
		return fromToDateTime;
	}

	public DateTimeSearch1Choice setFromToDateTime(DateTimePeriodDetails fromToDateTime) {
		this.fromToDateTime = Objects.requireNonNull(fromToDateTime);
		return this;
	}

	public ISODateTime getEqualDateTime() {
		return equalDateTime;
	}

	public DateTimeSearch1Choice setEqualDateTime(ISODateTime equalDateTime) {
		this.equalDateTime = Objects.requireNonNull(equalDateTime);
		return this;
	}

	public ISODateTime getNotEqualDateTime() {
		return notEqualDateTime;
	}

	public DateTimeSearch1Choice setNotEqualDateTime(ISODateTime notEqualDateTime) {
		this.notEqualDateTime = Objects.requireNonNull(notEqualDateTime);
		return this;
	}
}