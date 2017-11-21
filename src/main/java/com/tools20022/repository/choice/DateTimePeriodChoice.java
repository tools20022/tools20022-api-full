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
import com.tools20022.repository.msg.DateTimePeriodDetails;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
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
 * {@linkplain com.tools20022.repository.choice.DateTimePeriodChoice#mmFromDateTime
 * DateTimePeriodChoice.mmFromDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.DateTimePeriodChoice#mmToDateTime
 * DateTimePeriodChoice.mmToDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.DateTimePeriodChoice#mmDateTimeRange
 * DateTimePeriodChoice.mmDateTimeRange}</li>
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
 * "DateTimePeriodChoice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice between various date time patterns."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "DateTimePeriodChoice", propOrder = {"fromDateTime", "toDateTime", "dateTimeRange"})
public class DateTimePeriodChoice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected ISODateTime fromDateTime;
	/**
	 * Date and time at which the range starts.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.choice.DateTimePeriodChoice
	 * DateTimePeriodChoice}</li>
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
	 * definition} = "Date and time at which the range starts."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFromDateTime = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> DateTimePeriod.mmFromDateTime;
			componentContext_lazy = () -> DateTimePeriodChoice.mmObject();
			isDerived = false;
			xmlTag = "FrDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FromDateTime";
			definition = "Date and time at which the range starts.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected ISODateTime toDateTime;
	/**
	 * Date and time at which the range ends.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.choice.DateTimePeriodChoice
	 * DateTimePeriodChoice}</li>
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
	 * definition} = "Date and time at which the range ends."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmToDateTime = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> DateTimePeriod.mmToDateTime;
			componentContext_lazy = () -> DateTimePeriodChoice.mmObject();
			isDerived = false;
			xmlTag = "ToDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ToDateTime";
			definition = "Date and time at which the range ends.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected DateTimePeriodDetails dateTimeRange;
	/**
	 * Range of time between a start date and time and an end date and time.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DateTimePeriodDetails
	 * DateTimePeriodDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.DateTimePeriodChoice
	 * DateTimePeriodChoice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DtTmRg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DateTimeRange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Range of time between a start date and time and an end date and time."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDateTimeRange = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> DateTimePeriod.mmObject();
			componentContext_lazy = () -> DateTimePeriodChoice.mmObject();
			isDerived = false;
			xmlTag = "DtTmRg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DateTimeRange";
			definition = "Range of time between a start date and time and an end date and time.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DateTimePeriodDetails.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(DateTimePeriodChoice.mmFromDateTime, DateTimePeriodChoice.mmToDateTime, DateTimePeriodChoice.mmDateTimeRange);
				trace_lazy = () -> DateTimePeriod.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DateTimePeriodChoice";
				definition = "Choice between various date time patterns.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "FrDtTm", required = true)
	public ISODateTime getFromDateTime() {
		return fromDateTime;
	}

	public void setFromDateTime(ISODateTime fromDateTime) {
		this.fromDateTime = fromDateTime;
	}

	@XmlElement(name = "ToDtTm", required = true)
	public ISODateTime getToDateTime() {
		return toDateTime;
	}

	public void setToDateTime(ISODateTime toDateTime) {
		this.toDateTime = toDateTime;
	}

	@XmlElement(name = "DtTmRg", required = true)
	public DateTimePeriodDetails getDateTimeRange() {
		return dateTimeRange;
	}

	public void setDateTimeRange(DateTimePeriodDetails dateTimeRange) {
		this.dateTimeRange = dateTimeRange;
	}
}