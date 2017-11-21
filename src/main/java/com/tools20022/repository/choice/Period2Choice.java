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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.DateTimePeriod;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.DateTimePeriodDetails;
import com.tools20022.repository.msg.Period2;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice between date and date-time for the specification of a period.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Period2Choice#mmFromDateTimeToDateTime
 * Period2Choice.mmFromDateTimeToDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Period2Choice#mmFromDateToDate
 * Period2Choice.mmFromDateToDate}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
 * DateTimePeriod}</li>
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
 * "Period2Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice between date and date-time for the specification of a period."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "Period2Choice", propOrder = {"fromDateTimeToDateTime", "fromDateToDate"})
public class Period2Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected DateTimePeriodDetails fromDateTimeToDateTime;
	/**
	 * Time span defined by a start date and time, and an end date and time.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.DateTimePeriodDetails
	 * DateTimePeriodDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Period2Choice Period2Choice}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FrDtTmToDtTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FromDateTimeToDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Time span defined by a start date and time, and an end date and time."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFromDateTimeToDateTime = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> DateTimePeriod.mmObject();
			componentContext_lazy = () -> Period2Choice.mmObject();
			isDerived = false;
			xmlTag = "FrDtTmToDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FromDateTimeToDateTime";
			definition = "Time span defined by a start date and time, and an end date and time.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> DateTimePeriodDetails.mmObject();
		}
	};
	protected Period2 fromDateToDate;
	/**
	 * Time span defined by a start date and time, and an end date and time.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Period2 Period2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Period2Choice Period2Choice}
	 * </li>
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
	 * definition} =
	 * "Time span defined by a start date and time, and an end date and time."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFromDateToDate = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> DateTimePeriod.mmObject();
			componentContext_lazy = () -> Period2Choice.mmObject();
			isDerived = false;
			xmlTag = "FrDtToDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FromDateToDate";
			definition = "Time span defined by a start date and time, and an end date and time.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Period2.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(Period2Choice.mmFromDateTimeToDateTime, Period2Choice.mmFromDateToDate);
				trace_lazy = () -> DateTimePeriod.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Period2Choice";
				definition = "Choice between date and date-time for the specification of a period.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "FrDtTmToDtTm", required = true)
	public DateTimePeriodDetails getFromDateTimeToDateTime() {
		return fromDateTimeToDateTime;
	}

	public void setFromDateTimeToDateTime(DateTimePeriodDetails fromDateTimeToDateTime) {
		this.fromDateTimeToDateTime = fromDateTimeToDateTime;
	}

	@XmlElement(name = "FrDtToDt", required = true)
	public Period2 getFromDateToDate() {
		return fromDateToDate;
	}

	public void setFromDateToDate(Period2 fromDateToDate) {
		this.fromDateToDate = fromDateToDate;
	}
}