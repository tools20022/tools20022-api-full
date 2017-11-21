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
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DateAndDateTimeSearchChoice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice between a date or a date time pattern as search selection criteria."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "DateAndDateTimeSearchChoice", propOrder = {"dateTimeSearch", "dateSearch"})
public class DateAndDateTimeSearchChoice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected DateTimePeriodChoice dateTimeSearch;
	/**
	 * Patterns to search a date time.
	 * <p>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmDateTimeSearch = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> DateAndDateTimeSearchChoice.mmObject();
			isDerived = false;
			xmlTag = "DtTmSch";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DateTimeSearch";
			definition = "Patterns to search a date time.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> com.tools20022.repository.choice.DateTimePeriodChoice.mmObject();
		}
	};
	protected DateSearchChoice dateSearch;
	/**
	 * Patterns to search a date.
	 * <p>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmDateSearch = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> DateAndDateTimeSearchChoice.mmObject();
			isDerived = false;
			xmlTag = "DtSch";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DateSearch";
			definition = "Patterns to search a date.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> com.tools20022.repository.choice.DateSearchChoice.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(DateAndDateTimeSearchChoice.mmDateTimeSearch, DateAndDateTimeSearchChoice.mmDateSearch);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DateAndDateTimeSearchChoice";
				definition = "Choice between a date or a date time pattern as search selection criteria.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "DtTmSch", required = true)
	public DateTimePeriodChoice getDateTimeSearch() {
		return dateTimeSearch;
	}

	public void setDateTimeSearch(com.tools20022.repository.choice.DateTimePeriodChoice dateTimeSearch) {
		this.dateTimeSearch = dateTimeSearch;
	}

	@XmlElement(name = "DtSch", required = true)
	public DateSearchChoice getDateSearch() {
		return dateSearch;
	}

	public void setDateSearch(com.tools20022.repository.choice.DateSearchChoice dateSearch) {
		this.dateSearch = dateSearch;
	}
}