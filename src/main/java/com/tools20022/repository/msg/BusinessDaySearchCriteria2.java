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
import com.tools20022.repository.choice.DateTimePeriod1Choice;
import com.tools20022.repository.choice.SystemEventType2Choice;
import com.tools20022.repository.choice.SystemIdentification2Choice;
import com.tools20022.repository.codeset.ActiveCurrencyCode;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Defines the criteria used to search for system business day information.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BusinessDaySearchCriteria2#mmSystemDate
 * BusinessDaySearchCriteria2.mmSystemDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BusinessDaySearchCriteria2#mmSystemIdentification
 * BusinessDaySearchCriteria2.mmSystemIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BusinessDaySearchCriteria2#mmSystemCurrency
 * BusinessDaySearchCriteria2.mmSystemCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BusinessDaySearchCriteria2#mmEventType
 * BusinessDaySearchCriteria2.mmEventType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BusinessDaySearchCriteria2#mmClosurePeriod
 * BusinessDaySearchCriteria2.mmClosurePeriod}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "BusinessDaySearchCriteria2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Defines the criteria used to search for system business day information."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.BusinessDaySearchCriteria1
 * BusinessDaySearchCriteria1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "BusinessDaySearchCriteria2", propOrder = {"systemDate", "systemIdentification", "systemCurrency", "eventType", "closurePeriod"})
public class BusinessDaySearchCriteria2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "SysDt")
	protected ISODate systemDate;
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
	 * {@linkplain com.tools20022.repository.msg.BusinessDaySearchCriteria2
	 * BusinessDaySearchCriteria2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SysDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SystemDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date for which the availability information is provided."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.BusinessDaySearchCriteria1#mmSystemDate
	 * BusinessDaySearchCriteria1.mmSystemDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<BusinessDaySearchCriteria2, Optional<ISODate>> mmSystemDate = new MMMessageAttribute<BusinessDaySearchCriteria2, Optional<ISODate>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.BusinessDaySearchCriteria2.mmObject();
			isDerived = false;
			xmlTag = "SysDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SystemDate";
			definition = "Date for which the availability information is provided.";
			previousVersion_lazy = () -> BusinessDaySearchCriteria1.mmSystemDate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(BusinessDaySearchCriteria2 obj) {
			return obj.getSystemDate();
		}

		@Override
		public void setValue(BusinessDaySearchCriteria2 obj, Optional<ISODate> value) {
			obj.setSystemDate(value.orElse(null));
		}
	};
	@XmlElement(name = "SysId")
	protected List<SystemIdentification2Choice> systemIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.SystemIdentification2Choice
	 * SystemIdentification2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BusinessDaySearchCriteria2
	 * BusinessDaySearchCriteria2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SysId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SystemIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identification of the system, as assigned by the system administrator."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.BusinessDaySearchCriteria1#mmSystemIdentification
	 * BusinessDaySearchCriteria1.mmSystemIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<BusinessDaySearchCriteria2, List<SystemIdentification2Choice>> mmSystemIdentification = new MMMessageAssociationEnd<BusinessDaySearchCriteria2, List<SystemIdentification2Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.BusinessDaySearchCriteria2.mmObject();
			isDerived = false;
			xmlTag = "SysId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SystemIdentification";
			definition = "Unique and unambiguous identification of the system, as assigned by the system administrator.";
			previousVersion_lazy = () -> BusinessDaySearchCriteria1.mmSystemIdentification;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SystemIdentification2Choice.mmObject();
		}

		@Override
		public List<SystemIdentification2Choice> getValue(BusinessDaySearchCriteria2 obj) {
			return obj.getSystemIdentification();
		}

		@Override
		public void setValue(BusinessDaySearchCriteria2 obj, List<SystemIdentification2Choice> value) {
			obj.setSystemIdentification(value);
		}
	};
	@XmlElement(name = "SysCcy")
	protected List<ActiveCurrencyCode> systemCurrency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ActiveCurrencyCode
	 * ActiveCurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BusinessDaySearchCriteria2
	 * BusinessDaySearchCriteria2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SysCcy"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SystemCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Currency which may be processed by the system. A system may process transactions in a single currency or in multiple currencies."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.BusinessDaySearchCriteria1#mmSystemCurrency
	 * BusinessDaySearchCriteria1.mmSystemCurrency}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<BusinessDaySearchCriteria2, List<ActiveCurrencyCode>> mmSystemCurrency = new MMMessageAttribute<BusinessDaySearchCriteria2, List<ActiveCurrencyCode>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.BusinessDaySearchCriteria2.mmObject();
			isDerived = false;
			xmlTag = "SysCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SystemCurrency";
			definition = "Currency which may be processed by the system. A system may process transactions in a single currency or in multiple currencies.";
			previousVersion_lazy = () -> BusinessDaySearchCriteria1.mmSystemCurrency;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyCode.mmObject();
		}

		@Override
		public List<ActiveCurrencyCode> getValue(BusinessDaySearchCriteria2 obj) {
			return obj.getSystemCurrency();
		}

		@Override
		public void setValue(BusinessDaySearchCriteria2 obj, List<ActiveCurrencyCode> value) {
			obj.setSystemCurrency(value);
		}
	};
	@XmlElement(name = "EvtTp")
	protected SystemEventType2Choice eventType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.SystemEventType2Choice
	 * SystemEventType2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BusinessDaySearchCriteria2
	 * BusinessDaySearchCriteria2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EvtTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Nature of the event that has occurred."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.BusinessDaySearchCriteria1#mmEventType
	 * BusinessDaySearchCriteria1.mmEventType}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<BusinessDaySearchCriteria2, Optional<SystemEventType2Choice>> mmEventType = new MMMessageAssociationEnd<BusinessDaySearchCriteria2, Optional<SystemEventType2Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.BusinessDaySearchCriteria2.mmObject();
			isDerived = false;
			xmlTag = "EvtTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventType";
			definition = "Nature of the event that has occurred.";
			previousVersion_lazy = () -> BusinessDaySearchCriteria1.mmEventType;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SystemEventType2Choice.mmObject();
		}

		@Override
		public Optional<SystemEventType2Choice> getValue(BusinessDaySearchCriteria2 obj) {
			return obj.getEventType();
		}

		@Override
		public void setValue(BusinessDaySearchCriteria2 obj, Optional<SystemEventType2Choice> value) {
			obj.setEventType(value.orElse(null));
		}
	};
	@XmlElement(name = "ClsrPrd")
	protected DateTimePeriod1Choice closurePeriod;
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
	 * {@linkplain com.tools20022.repository.msg.BusinessDaySearchCriteria2
	 * BusinessDaySearchCriteria2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClsrPrd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClosurePeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Period of time when the system is closed/not operating."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.BusinessDaySearchCriteria1#mmClosurePeriod
	 * BusinessDaySearchCriteria1.mmClosurePeriod}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<BusinessDaySearchCriteria2, Optional<DateTimePeriod1Choice>> mmClosurePeriod = new MMMessageAttribute<BusinessDaySearchCriteria2, Optional<DateTimePeriod1Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.BusinessDaySearchCriteria2.mmObject();
			isDerived = false;
			xmlTag = "ClsrPrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClosurePeriod";
			definition = "Period of time when the system is closed/not operating.";
			previousVersion_lazy = () -> BusinessDaySearchCriteria1.mmClosurePeriod;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateTimePeriod1Choice.mmObject();
		}

		@Override
		public Optional<DateTimePeriod1Choice> getValue(BusinessDaySearchCriteria2 obj) {
			return obj.getClosurePeriod();
		}

		@Override
		public void setValue(BusinessDaySearchCriteria2 obj, Optional<DateTimePeriod1Choice> value) {
			obj.setClosurePeriod(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.BusinessDaySearchCriteria2.mmSystemDate, com.tools20022.repository.msg.BusinessDaySearchCriteria2.mmSystemIdentification,
						com.tools20022.repository.msg.BusinessDaySearchCriteria2.mmSystemCurrency, com.tools20022.repository.msg.BusinessDaySearchCriteria2.mmEventType,
						com.tools20022.repository.msg.BusinessDaySearchCriteria2.mmClosurePeriod);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BusinessDaySearchCriteria2";
				definition = "Defines the criteria used to search for system business day information.";
				previousVersion_lazy = () -> BusinessDaySearchCriteria1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<ISODate> getSystemDate() {
		return systemDate == null ? Optional.empty() : Optional.of(systemDate);
	}

	public BusinessDaySearchCriteria2 setSystemDate(ISODate systemDate) {
		this.systemDate = systemDate;
		return this;
	}

	public List<SystemIdentification2Choice> getSystemIdentification() {
		return systemIdentification == null ? systemIdentification = new ArrayList<>() : systemIdentification;
	}

	public BusinessDaySearchCriteria2 setSystemIdentification(List<SystemIdentification2Choice> systemIdentification) {
		this.systemIdentification = Objects.requireNonNull(systemIdentification);
		return this;
	}

	public List<ActiveCurrencyCode> getSystemCurrency() {
		return systemCurrency == null ? systemCurrency = new ArrayList<>() : systemCurrency;
	}

	public BusinessDaySearchCriteria2 setSystemCurrency(List<ActiveCurrencyCode> systemCurrency) {
		this.systemCurrency = Objects.requireNonNull(systemCurrency);
		return this;
	}

	public Optional<SystemEventType2Choice> getEventType() {
		return eventType == null ? Optional.empty() : Optional.of(eventType);
	}

	public BusinessDaySearchCriteria2 setEventType(SystemEventType2Choice eventType) {
		this.eventType = eventType;
		return this;
	}

	public Optional<DateTimePeriod1Choice> getClosurePeriod() {
		return closurePeriod == null ? Optional.empty() : Optional.of(closurePeriod);
	}

	public BusinessDaySearchCriteria2 setClosurePeriod(DateTimePeriod1Choice closurePeriod) {
		this.closurePeriod = closurePeriod;
		return this;
	}
}