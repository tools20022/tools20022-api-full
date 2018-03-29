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
import com.tools20022.repository.choice.SystemStatus2Choice;
import com.tools20022.repository.entity.Status;
import com.tools20022.repository.entity.SystemStatus;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Status of a system and the period of time during which the status is valid.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.SystemStatus3#mmStatus
 * SystemStatus3.mmStatus}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SystemStatus3#mmValidityTime
 * SystemStatus3.mmValidityTime}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SystemStatus
 * SystemStatus}</li>
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
 * "SystemStatus3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Status of a system and the period of time during which the status is valid."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.SystemStatus2
 * SystemStatus2}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SystemStatus3", propOrder = {"status", "validityTime"})
public class SystemStatus3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Sts", required = true)
	protected SystemStatus2Choice status;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.SystemStatus2Choice
	 * SystemStatus2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SystemStatus#mmStatus
	 * SystemStatus.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SystemStatus3 SystemStatus3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Status"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Current status of a system."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SystemStatus2#mmStatus
	 * SystemStatus2.mmStatus}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SystemStatus3, SystemStatus2Choice> mmStatus = new MMMessageAssociationEnd<SystemStatus3, SystemStatus2Choice>() {
		{
			businessElementTrace_lazy = () -> SystemStatus.mmStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.SystemStatus3.mmObject();
			isDerived = false;
			xmlTag = "Sts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Status";
			definition = "Current status of a system.";
			previousVersion_lazy = () -> SystemStatus2.mmStatus;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SystemStatus2Choice.mmObject();
		}

		@Override
		public SystemStatus2Choice getValue(SystemStatus3 obj) {
			return obj.getStatus();
		}

		@Override
		public void setValue(SystemStatus3 obj, SystemStatus2Choice value) {
			obj.setStatus(value);
		}
	};
	@XmlElement(name = "VldtyTm")
	protected DateTimePeriod1Choice validityTime;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Status#mmValidityTime
	 * Status.mmValidityTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SystemStatus3 SystemStatus3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VldtyTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValidityTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period of time during which the status of the system is valid."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SystemStatus2#mmValidityTime
	 * SystemStatus2.mmValidityTime}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SystemStatus3, Optional<DateTimePeriod1Choice>> mmValidityTime = new MMMessageAttribute<SystemStatus3, Optional<DateTimePeriod1Choice>>() {
		{
			businessElementTrace_lazy = () -> Status.mmValidityTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.SystemStatus3.mmObject();
			isDerived = false;
			xmlTag = "VldtyTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValidityTime";
			definition = "Period of time during which the status of the system is valid.";
			previousVersion_lazy = () -> SystemStatus2.mmValidityTime;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateTimePeriod1Choice.mmObject();
		}

		@Override
		public Optional<DateTimePeriod1Choice> getValue(SystemStatus3 obj) {
			return obj.getValidityTime();
		}

		@Override
		public void setValue(SystemStatus3 obj, Optional<DateTimePeriod1Choice> value) {
			obj.setValidityTime(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SystemStatus3.mmStatus, com.tools20022.repository.msg.SystemStatus3.mmValidityTime);
				trace_lazy = () -> SystemStatus.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SystemStatus3";
				definition = "Status of a system and the period of time during which the status is valid.";
				previousVersion_lazy = () -> SystemStatus2.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public SystemStatus2Choice getStatus() {
		return status;
	}

	public SystemStatus3 setStatus(SystemStatus2Choice status) {
		this.status = Objects.requireNonNull(status);
		return this;
	}

	public Optional<DateTimePeriod1Choice> getValidityTime() {
		return validityTime == null ? Optional.empty() : Optional.of(validityTime);
	}

	public SystemStatus3 setValidityTime(DateTimePeriod1Choice validityTime) {
		this.validityTime = validityTime;
		return this;
	}
}