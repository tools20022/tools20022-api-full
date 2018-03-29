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
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.SystemAvailabilityAndEventsDetails1;
import com.tools20022.repository.msg.SystemStatusDetails1;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Payment system operational information, eg, opening, closure, session period
 * or events. given per currency.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BusinessDayInformationDetails1#mmSystemStatus
 * BusinessDayInformationDetails1.mmSystemStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BusinessDayInformationDetails1#mmSystemInformationPerCurrency
 * BusinessDayInformationDetails1.mmSystemInformationPerCurrency}</li>
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
 * "BusinessDayInformationDetails1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Payment system operational information, eg, opening, closure, session period or events. given per currency."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "BusinessDayInformationDetails1", propOrder = {"systemStatus", "systemInformationPerCurrency"})
public class BusinessDayInformationDetails1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "SysSts")
	protected SystemStatusDetails1 systemStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SystemStatusDetails1
	 * SystemStatusDetails1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BusinessDayInformationDetails1
	 * BusinessDayInformationDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SysSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SystemStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Status of a system and the period of time during which the status is valid."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<BusinessDayInformationDetails1, Optional<SystemStatusDetails1>> mmSystemStatus = new MMMessageAssociationEnd<BusinessDayInformationDetails1, Optional<SystemStatusDetails1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.BusinessDayInformationDetails1.mmObject();
			isDerived = false;
			xmlTag = "SysSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SystemStatus";
			definition = "Status of a system and the period of time during which the status is valid.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SystemStatusDetails1.mmObject();
		}

		@Override
		public Optional<SystemStatusDetails1> getValue(BusinessDayInformationDetails1 obj) {
			return obj.getSystemStatus();
		}

		@Override
		public void setValue(BusinessDayInformationDetails1 obj, Optional<SystemStatusDetails1> value) {
			obj.setSystemStatus(value.orElse(null));
		}
	};
	@XmlElement(name = "SysInfPerCcy")
	protected List<SystemAvailabilityAndEventsDetails1> systemInformationPerCurrency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SystemAvailabilityAndEventsDetails1
	 * SystemAvailabilityAndEventsDetails1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BusinessDayInformationDetails1
	 * BusinessDayInformationDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SysInfPerCcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SystemInformationPerCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information relating to system operations and foreseen events relating to the operation of the system."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<BusinessDayInformationDetails1, List<SystemAvailabilityAndEventsDetails1>> mmSystemInformationPerCurrency = new MMMessageAssociationEnd<BusinessDayInformationDetails1, List<SystemAvailabilityAndEventsDetails1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.BusinessDayInformationDetails1.mmObject();
			isDerived = false;
			xmlTag = "SysInfPerCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SystemInformationPerCurrency";
			definition = "Information relating to system operations and foreseen events relating to the operation of the system.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SystemAvailabilityAndEventsDetails1.mmObject();
		}

		@Override
		public List<SystemAvailabilityAndEventsDetails1> getValue(BusinessDayInformationDetails1 obj) {
			return obj.getSystemInformationPerCurrency();
		}

		@Override
		public void setValue(BusinessDayInformationDetails1 obj, List<SystemAvailabilityAndEventsDetails1> value) {
			obj.setSystemInformationPerCurrency(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.BusinessDayInformationDetails1.mmSystemStatus, com.tools20022.repository.msg.BusinessDayInformationDetails1.mmSystemInformationPerCurrency);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "BusinessDayInformationDetails1";
				definition = "Payment system operational information, eg, opening, closure, session period or events. given per currency.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<SystemStatusDetails1> getSystemStatus() {
		return systemStatus == null ? Optional.empty() : Optional.of(systemStatus);
	}

	public BusinessDayInformationDetails1 setSystemStatus(SystemStatusDetails1 systemStatus) {
		this.systemStatus = systemStatus;
		return this;
	}

	public List<SystemAvailabilityAndEventsDetails1> getSystemInformationPerCurrency() {
		return systemInformationPerCurrency == null ? systemInformationPerCurrency = new ArrayList<>() : systemInformationPerCurrency;
	}

	public BusinessDayInformationDetails1 setSystemInformationPerCurrency(List<SystemAvailabilityAndEventsDetails1> systemInformationPerCurrency) {
		this.systemInformationPerCurrency = Objects.requireNonNull(systemInformationPerCurrency);
		return this;
	}
}