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
import com.tools20022.repository.entity.DateTimePeriod;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.DatePeriodDetails;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
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
 * <li>{@linkplain com.tools20022.repository.choice.DateSearchChoice#mmFromDate
 * DateSearchChoice.mmFromDate}</li>
 * <li>{@linkplain com.tools20022.repository.choice.DateSearchChoice#mmToDate
 * DateSearchChoice.mmToDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.DateSearchChoice#mmFromToDate
 * DateSearchChoice.mmFromToDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.DateSearchChoice#mmEqualDate
 * DateSearchChoice.mmEqualDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.DateSearchChoice#mmNotEqualDate
 * DateSearchChoice.mmNotEqualDate}</li>
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
 * "DateSearchChoice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice between search criteria based on dates and date ranges."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "DateSearchChoice", propOrder = {"fromDate", "toDate", "fromToDate", "equalDate", "notEqualDate"})
public class DateSearchChoice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected ISODate fromDate;
	/**
	 * Start date of the range.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmFromDateTime
	 * DateTimePeriod.mmFromDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.DateSearchChoice
	 * DateSearchChoice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FrDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FromDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Start date of the range."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFromDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> DateTimePeriod.mmFromDateTime;
			componentContext_lazy = () -> DateSearchChoice.mmObject();
			isDerived = false;
			xmlTag = "FrDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FromDate";
			definition = "Start date of the range.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected ISODate toDate;
	/**
	 * End date of the range.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmToDateTime
	 * DateTimePeriod.mmToDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.DateSearchChoice
	 * DateSearchChoice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ToDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ToDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "End date of the range."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmToDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> DateTimePeriod.mmToDateTime;
			componentContext_lazy = () -> DateSearchChoice.mmObject();
			isDerived = false;
			xmlTag = "ToDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ToDate";
			definition = "End date of the range.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected DatePeriodDetails fromToDate;
	/**
	 * Particular time span specified between a start date and an end date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DatePeriodDetails
	 * DatePeriodDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.DateSearchChoice
	 * DateSearchChoice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FrToDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FromToDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Particular time span specified between a start date and an end date."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFromToDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> DateSearchChoice.mmObject();
			isDerived = false;
			xmlTag = "FrToDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FromToDate";
			definition = "Particular time span specified between a start date and an end date.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DatePeriodDetails.mmObject();
		}
	};
	protected ISODate equalDate;
	/**
	 * Specified date to match.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.DateSearchChoice
	 * DateSearchChoice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EQDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EqualDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specified date to match."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEqualDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> DateSearchChoice.mmObject();
			isDerived = false;
			xmlTag = "EQDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EqualDate";
			definition = "Specified date to match.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected ISODate notEqualDate;
	/**
	 * Specified date to be excluded from the search.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.DateSearchChoice
	 * DateSearchChoice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NEQDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotEqualDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specified date to be excluded from the search."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNotEqualDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> DateSearchChoice.mmObject();
			isDerived = false;
			xmlTag = "NEQDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotEqualDate";
			definition = "Specified date to be excluded from the search.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(DateSearchChoice.mmFromDate, DateSearchChoice.mmToDate, DateSearchChoice.mmFromToDate, DateSearchChoice.mmEqualDate, DateSearchChoice.mmNotEqualDate);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DateSearchChoice";
				definition = "Choice between search criteria based on dates and date ranges.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "FrDt", required = true)
	public ISODate getFromDate() {
		return fromDate;
	}

	public void setFromDate(ISODate fromDate) {
		this.fromDate = fromDate;
	}

	@XmlElement(name = "ToDt", required = true)
	public ISODate getToDate() {
		return toDate;
	}

	public void setToDate(ISODate toDate) {
		this.toDate = toDate;
	}

	@XmlElement(name = "FrToDt", required = true)
	public DatePeriodDetails getFromToDate() {
		return fromToDate;
	}

	public void setFromToDate(DatePeriodDetails fromToDate) {
		this.fromToDate = fromToDate;
	}

	@XmlElement(name = "EQDt", required = true)
	public ISODate getEqualDate() {
		return equalDate;
	}

	public void setEqualDate(ISODate equalDate) {
		this.equalDate = equalDate;
	}

	@XmlElement(name = "NEQDt", required = true)
	public ISODate getNotEqualDate() {
		return notEqualDate;
	}

	public void setNotEqualDate(ISODate notEqualDate) {
		this.notEqualDate = notEqualDate;
	}
}