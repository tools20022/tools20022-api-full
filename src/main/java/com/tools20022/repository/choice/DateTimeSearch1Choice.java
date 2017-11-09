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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DateTimeSearch1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice between search criteria based on dates and date ranges."</li>
 * </ul>
 */
public class DateTimeSearch1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected ISODateTime fromDateTime;
	/**
	 * Start date of the range.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FromDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Start date of the range."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFromDateTime = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> DateTimeSearch1Choice.mmObject();
			isDerived = false;
			xmlTag = "FrDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FromDateTime";
			definition = "Start date of the range.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected ISODateTime toDateTime;
	/**
	 * End date of the range.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ToDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "End date of the range."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmToDateTime = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> DateTimeSearch1Choice.mmObject();
			isDerived = false;
			xmlTag = "ToDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ToDateTime";
			definition = "End date of the range.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected DateTimePeriodDetails fromToDateTime;
	/**
	 * Particular time span specified between a start date and an end date.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FromToDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Particular time span specified between a start date and an end date."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFromToDateTime = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> DateTimeSearch1Choice.mmObject();
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
	};
	protected ISODateTime equalDateTime;
	/**
	 * Specified date to match.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EqualDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specified date to match."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEqualDateTime = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> DateTimeSearch1Choice.mmObject();
			isDerived = false;
			xmlTag = "EQDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EqualDateTime";
			definition = "Specified date to match.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected ISODateTime notEqualDateTime;
	/**
	 * Specified date to be excluded from the search.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotEqualDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specified date to be excluded from the search."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNotEqualDateTime = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> DateTimeSearch1Choice.mmObject();
			isDerived = false;
			xmlTag = "NEQDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotEqualDateTime";
			definition = "Specified date to be excluded from the search.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(DateTimeSearch1Choice.mmFromDateTime, DateTimeSearch1Choice.mmToDateTime, DateTimeSearch1Choice.mmFromToDateTime, DateTimeSearch1Choice.mmEqualDateTime,
						DateTimeSearch1Choice.mmNotEqualDateTime);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
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

	public void setFromDateTime(ISODateTime fromDateTime) {
		this.fromDateTime = fromDateTime;
	}

	public ISODateTime getToDateTime() {
		return toDateTime;
	}

	public void setToDateTime(ISODateTime toDateTime) {
		this.toDateTime = toDateTime;
	}

	public DateTimePeriodDetails getFromToDateTime() {
		return fromToDateTime;
	}

	public void setFromToDateTime(DateTimePeriodDetails fromToDateTime) {
		this.fromToDateTime = fromToDateTime;
	}

	public ISODateTime getEqualDateTime() {
		return equalDateTime;
	}

	public void setEqualDateTime(ISODateTime equalDateTime) {
		this.equalDateTime = equalDateTime;
	}

	public ISODateTime getNotEqualDateTime() {
		return notEqualDateTime;
	}

	public void setNotEqualDateTime(ISODateTime notEqualDateTime) {
		this.notEqualDateTime = notEqualDateTime;
	}
}