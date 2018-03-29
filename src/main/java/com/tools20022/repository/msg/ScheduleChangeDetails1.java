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

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ScheduleChangeEntry1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Changes in the schedule.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ScheduleChangeDetails1#mmScheduleChangeEffectiveDate
 * ScheduleChangeDetails1.mmScheduleChangeEffectiveDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ScheduleChangeDetails1#mmScheduleEntry
 * ScheduleChangeDetails1.mmScheduleEntry}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ScheduleChangeDetails1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Changes in the schedule."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ScheduleChangeDetails1", propOrder = {"scheduleChangeEffectiveDate", "scheduleEntry"})
public class ScheduleChangeDetails1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "SchdlChngFctvDt", required = true)
	protected ISODate scheduleChangeEffectiveDate;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ScheduleChangeDetails1
	 * ScheduleChangeDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SchdlChngFctvDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ScheduleChangeEffectiveDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date on which the schedule changes became effective."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ScheduleChangeDetails1, ISODate> mmScheduleChangeEffectiveDate = new MMMessageAttribute<ScheduleChangeDetails1, ISODate>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ScheduleChangeDetails1.mmObject();
			isDerived = false;
			xmlTag = "SchdlChngFctvDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ScheduleChangeEffectiveDate";
			definition = "Date on which the schedule changes became effective.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public ISODate getValue(ScheduleChangeDetails1 obj) {
			return obj.getScheduleChangeEffectiveDate();
		}

		@Override
		public void setValue(ScheduleChangeDetails1 obj, ISODate value) {
			obj.setScheduleChangeEffectiveDate(value);
		}
	};
	@XmlElement(name = "SchdlNtry", required = true)
	protected List<ScheduleChangeEntry1> scheduleEntry;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ScheduleChangeEntry1
	 * ScheduleChangeEntry1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ScheduleChangeDetails1
	 * ScheduleChangeDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SchdlNtry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ScheduleEntry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information about schedule."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ScheduleChangeDetails1, List<ScheduleChangeEntry1>> mmScheduleEntry = new MMMessageAssociationEnd<ScheduleChangeDetails1, List<ScheduleChangeEntry1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ScheduleChangeDetails1.mmObject();
			isDerived = false;
			xmlTag = "SchdlNtry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ScheduleEntry";
			definition = "Information about schedule.";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ScheduleChangeEntry1.mmObject();
		}

		@Override
		public List<ScheduleChangeEntry1> getValue(ScheduleChangeDetails1 obj) {
			return obj.getScheduleEntry();
		}

		@Override
		public void setValue(ScheduleChangeDetails1 obj, List<ScheduleChangeEntry1> value) {
			obj.setScheduleEntry(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ScheduleChangeDetails1.mmScheduleChangeEffectiveDate, com.tools20022.repository.msg.ScheduleChangeDetails1.mmScheduleEntry);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "ScheduleChangeDetails1";
				definition = "Changes in the schedule.";
			}
		});
		return mmObject_lazy.get();
	}

	public ISODate getScheduleChangeEffectiveDate() {
		return scheduleChangeEffectiveDate;
	}

	public ScheduleChangeDetails1 setScheduleChangeEffectiveDate(ISODate scheduleChangeEffectiveDate) {
		this.scheduleChangeEffectiveDate = Objects.requireNonNull(scheduleChangeEffectiveDate);
		return this;
	}

	public List<ScheduleChangeEntry1> getScheduleEntry() {
		return scheduleEntry == null ? scheduleEntry = new ArrayList<>() : scheduleEntry;
	}

	public ScheduleChangeDetails1 setScheduleEntry(List<ScheduleChangeEntry1> scheduleEntry) {
		this.scheduleEntry = Objects.requireNonNull(scheduleEntry);
		return this;
	}
}