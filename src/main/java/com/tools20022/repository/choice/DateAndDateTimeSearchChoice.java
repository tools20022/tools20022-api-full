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
import com.tools20022.repository.choice.DateSearchChoice;
import com.tools20022.repository.choice.DateTimePeriodChoice;
import com.tools20022.repository.GeneratedRepository;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
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
 * {@linkplain com.tools20022.repository.choice.DateAndDateTimeSearchChoice#mmDateTimeSearch
 * DateAndDateTimeSearchChoice.mmDateTimeSearch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.DateAndDateTimeSearchChoice#mmDateSearch
 * DateAndDateTimeSearchChoice.mmDateSearch}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = August 8, 2018</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DateAndDateTimeSearchChoice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice between a date or a date time pattern as search selection criteria."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.DateAndDateTimeSearch3Choice
 * DateAndDateTimeSearch3Choice}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "DateAndDateTimeSearchChoice", propOrder = {"dateTimeSearch", "dateSearch"})
public class DateAndDateTimeSearchChoice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "DtTmSch", required = true)
	protected DateTimePeriodChoice dateTimeSearch;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateTimePeriodChoice
	 * DateTimePeriodChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTimeSearchChoice
	 * DateAndDateTimeSearchChoice}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTimeSearch3Choice#mmDateTimeSearch
	 * DateAndDateTimeSearch3Choice.mmDateTimeSearch}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DateAndDateTimeSearchChoice, DateTimePeriodChoice> mmDateTimeSearch = new MMMessageAttribute<DateAndDateTimeSearchChoice, DateTimePeriodChoice>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.DateAndDateTimeSearchChoice.mmObject();
			isDerived = false;
			xmlTag = "DtTmSch";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DateTimeSearch";
			definition = "Patterns to search a date time.";
			nextVersions_lazy = () -> Arrays.asList(DateAndDateTimeSearch3Choice.mmDateTimeSearch);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DateTimePeriodChoice.mmObject();
		}

		@Override
		public DateTimePeriodChoice getValue(DateAndDateTimeSearchChoice obj) {
			return obj.getDateTimeSearch();
		}

		@Override
		public void setValue(DateAndDateTimeSearchChoice obj, DateTimePeriodChoice value) {
			obj.setDateTimeSearch(value);
		}
	};
	@XmlElement(name = "DtSch", required = true)
	protected DateSearchChoice dateSearch;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateSearchChoice
	 * DateSearchChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTimeSearchChoice
	 * DateAndDateTimeSearchChoice}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTimeSearch3Choice#mmDateSearch
	 * DateAndDateTimeSearch3Choice.mmDateSearch}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DateAndDateTimeSearchChoice, DateSearchChoice> mmDateSearch = new MMMessageAttribute<DateAndDateTimeSearchChoice, DateSearchChoice>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.DateAndDateTimeSearchChoice.mmObject();
			isDerived = false;
			xmlTag = "DtSch";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DateSearch";
			definition = "Patterns to search a date.";
			nextVersions_lazy = () -> Arrays.asList(DateAndDateTimeSearch3Choice.mmDateSearch);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DateSearchChoice.mmObject();
		}

		@Override
		public DateSearchChoice getValue(DateAndDateTimeSearchChoice obj) {
			return obj.getDateSearch();
		}

		@Override
		public void setValue(DateAndDateTimeSearchChoice obj, DateSearchChoice value) {
			obj.setDateSearch(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.DateAndDateTimeSearchChoice.mmDateTimeSearch, com.tools20022.repository.choice.DateAndDateTimeSearchChoice.mmDateSearch);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("August 8, 2018");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "DateAndDateTimeSearchChoice";
				definition = "Choice between a date or a date time pattern as search selection criteria.";
				nextVersions_lazy = () -> Arrays.asList(DateAndDateTimeSearch3Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public DateTimePeriodChoice getDateTimeSearch() {
		return dateTimeSearch;
	}

	public DateAndDateTimeSearchChoice setDateTimeSearch(DateTimePeriodChoice dateTimeSearch) {
		this.dateTimeSearch = Objects.requireNonNull(dateTimeSearch);
		return this;
	}

	public DateSearchChoice getDateSearch() {
		return dateSearch;
	}

	public DateAndDateTimeSearchChoice setDateSearch(DateSearchChoice dateSearch) {
		this.dateSearch = Objects.requireNonNull(dateSearch);
		return this;
	}
}