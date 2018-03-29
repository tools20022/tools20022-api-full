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
import com.tools20022.repository.choice.DatePeriodSearch1Choice;
import com.tools20022.repository.choice.DateTimePeriod1Choice;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice between a date or a date time pattern as search selection criteria.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.DateAndDateTimeSearch3Choice#mmDateTimeSearch
 * DateAndDateTimeSearch3Choice.mmDateTimeSearch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.DateAndDateTimeSearch3Choice#mmDateSearch
 * DateAndDateTimeSearch3Choice.mmDateSearch}</li>
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
 * "DateAndDateTimeSearch3Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice between a date or a date time pattern as search selection criteria."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.choice.DateAndDateTimeSearchChoice
 * DateAndDateTimeSearchChoice}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "DateAndDateTimeSearch3Choice", propOrder = {"dateTimeSearch", "dateSearch"})
public class DateAndDateTimeSearch3Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "DtTmSch", required = true)
	protected DateTimePeriod1Choice dateTimeSearch;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateTimePeriod1Choice
	 * DateTimePeriod1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTimeSearch3Choice
	 * DateAndDateTimeSearch3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DtTmSch"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DateTimeSearch"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Patterns to search a date time."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTimeSearchChoice#mmDateTimeSearch
	 * DateAndDateTimeSearchChoice.mmDateTimeSearch}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DateAndDateTimeSearch3Choice, DateTimePeriod1Choice> mmDateTimeSearch = new MMMessageAttribute<DateAndDateTimeSearch3Choice, DateTimePeriod1Choice>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.DateAndDateTimeSearch3Choice.mmObject();
			isDerived = false;
			xmlTag = "DtTmSch";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DateTimeSearch";
			definition = "Patterns to search a date time.";
			previousVersion_lazy = () -> DateAndDateTimeSearchChoice.mmDateTimeSearch;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DateTimePeriod1Choice.mmObject();
		}

		@Override
		public DateTimePeriod1Choice getValue(DateAndDateTimeSearch3Choice obj) {
			return obj.getDateTimeSearch();
		}

		@Override
		public void setValue(DateAndDateTimeSearch3Choice obj, DateTimePeriod1Choice value) {
			obj.setDateTimeSearch(value);
		}
	};
	@XmlElement(name = "DtSch", required = true)
	protected DatePeriodSearch1Choice dateSearch;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DatePeriodSearch1Choice
	 * DatePeriodSearch1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTimeSearch3Choice
	 * DateAndDateTimeSearch3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DtSch"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DateSearch"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Patterns to search a date."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTimeSearchChoice#mmDateSearch
	 * DateAndDateTimeSearchChoice.mmDateSearch}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DateAndDateTimeSearch3Choice, DatePeriodSearch1Choice> mmDateSearch = new MMMessageAttribute<DateAndDateTimeSearch3Choice, DatePeriodSearch1Choice>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.DateAndDateTimeSearch3Choice.mmObject();
			isDerived = false;
			xmlTag = "DtSch";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DateSearch";
			definition = "Patterns to search a date.";
			previousVersion_lazy = () -> DateAndDateTimeSearchChoice.mmDateSearch;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DatePeriodSearch1Choice.mmObject();
		}

		@Override
		public DatePeriodSearch1Choice getValue(DateAndDateTimeSearch3Choice obj) {
			return obj.getDateSearch();
		}

		@Override
		public void setValue(DateAndDateTimeSearch3Choice obj, DatePeriodSearch1Choice value) {
			obj.setDateSearch(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.DateAndDateTimeSearch3Choice.mmDateTimeSearch, com.tools20022.repository.choice.DateAndDateTimeSearch3Choice.mmDateSearch);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DateAndDateTimeSearch3Choice";
				definition = "Choice between a date or a date time pattern as search selection criteria.";
				previousVersion_lazy = () -> DateAndDateTimeSearchChoice.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public DateTimePeriod1Choice getDateTimeSearch() {
		return dateTimeSearch;
	}

	public DateAndDateTimeSearch3Choice setDateTimeSearch(DateTimePeriod1Choice dateTimeSearch) {
		this.dateTimeSearch = Objects.requireNonNull(dateTimeSearch);
		return this;
	}

	public DatePeriodSearch1Choice getDateSearch() {
		return dateSearch;
	}

	public DateAndDateTimeSearch3Choice setDateSearch(DatePeriodSearch1Choice dateSearch) {
		this.dateSearch = Objects.requireNonNull(dateSearch);
		return this;
	}
}