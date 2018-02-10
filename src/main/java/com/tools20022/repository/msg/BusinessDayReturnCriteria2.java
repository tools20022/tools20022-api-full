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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.RequestedIndicator;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Defines the criteria used to report on business day information.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BusinessDayReturnCriteria2#mmSystemDateIndicator
 * BusinessDayReturnCriteria2.mmSystemDateIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BusinessDayReturnCriteria2#mmSystemStatusIndicator
 * BusinessDayReturnCriteria2.mmSystemStatusIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BusinessDayReturnCriteria2#mmSystemCurrencyIndicator
 * BusinessDayReturnCriteria2.mmSystemCurrencyIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BusinessDayReturnCriteria2#mmClosurePeriodIndicator
 * BusinessDayReturnCriteria2.mmClosurePeriodIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BusinessDayReturnCriteria2#mmEventIndicator
 * BusinessDayReturnCriteria2.mmEventIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BusinessDayReturnCriteria2#mmSessionPeriodIndicator
 * BusinessDayReturnCriteria2.mmSessionPeriodIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BusinessDayReturnCriteria2#mmEventTypeIndicator
 * BusinessDayReturnCriteria2.mmEventTypeIndicator}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "BusinessDayReturnCriteria2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Defines the criteria used to report on business day information."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "BusinessDayReturnCriteria2", propOrder = {"systemDateIndicator", "systemStatusIndicator", "systemCurrencyIndicator", "closurePeriodIndicator", "eventIndicator", "sessionPeriodIndicator", "eventTypeIndicator"})
public class BusinessDayReturnCriteria2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "SysDtInd")
	protected RequestedIndicator systemDateIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BusinessDayReturnCriteria2
	 * BusinessDayReturnCriteria2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SysDtInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SystemDateIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the system date is requested."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSystemDateIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.BusinessDayReturnCriteria2.mmObject();
			isDerived = false;
			xmlTag = "SysDtInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SystemDateIndicator";
			definition = "Indicates whether the system date is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	@XmlElement(name = "SysStsInd")
	protected RequestedIndicator systemStatusIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BusinessDayReturnCriteria2
	 * BusinessDayReturnCriteria2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SysStsInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SystemStatusIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the system status is requested."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSystemStatusIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.BusinessDayReturnCriteria2.mmObject();
			isDerived = false;
			xmlTag = "SysStsInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SystemStatusIndicator";
			definition = "Indicates whether the system status is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	@XmlElement(name = "SysCcyInd")
	protected RequestedIndicator systemCurrencyIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BusinessDayReturnCriteria2
	 * BusinessDayReturnCriteria2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SysCcyInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SystemCurrencyIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the system currency is requested."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSystemCurrencyIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.BusinessDayReturnCriteria2.mmObject();
			isDerived = false;
			xmlTag = "SysCcyInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SystemCurrencyIndicator";
			definition = "Indicates whether the system currency is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	@XmlElement(name = "ClsrPrdInd")
	protected RequestedIndicator closurePeriodIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BusinessDayReturnCriteria2
	 * BusinessDayReturnCriteria2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClsrPrdInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClosurePeriodIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the closure information is requested."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmClosurePeriodIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.BusinessDayReturnCriteria2.mmObject();
			isDerived = false;
			xmlTag = "ClsrPrdInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClosurePeriodIndicator";
			definition = "Indicates whether the closure information is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	@XmlElement(name = "EvtInd")
	protected RequestedIndicator eventIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BusinessDayReturnCriteria2
	 * BusinessDayReturnCriteria2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EvtInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the events are requested."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEventIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.BusinessDayReturnCriteria2.mmObject();
			isDerived = false;
			xmlTag = "EvtInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventIndicator";
			definition = "Indicates whether the events are requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	@XmlElement(name = "SsnPrdInd")
	protected RequestedIndicator sessionPeriodIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BusinessDayReturnCriteria2
	 * BusinessDayReturnCriteria2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SsnPrdInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SessionPeriodIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the session period is requested."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSessionPeriodIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.BusinessDayReturnCriteria2.mmObject();
			isDerived = false;
			xmlTag = "SsnPrdInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SessionPeriodIndicator";
			definition = "Indicates whether the session period is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	@XmlElement(name = "EvtTpInd")
	protected RequestedIndicator eventTypeIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BusinessDayReturnCriteria2
	 * BusinessDayReturnCriteria2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EvtTpInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventTypeIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the system event type is requested."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEventTypeIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.BusinessDayReturnCriteria2.mmObject();
			isDerived = false;
			xmlTag = "EvtTpInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventTypeIndicator";
			definition = "Indicates whether the system event type is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.BusinessDayReturnCriteria2.mmSystemDateIndicator, com.tools20022.repository.msg.BusinessDayReturnCriteria2.mmSystemStatusIndicator,
						com.tools20022.repository.msg.BusinessDayReturnCriteria2.mmSystemCurrencyIndicator, com.tools20022.repository.msg.BusinessDayReturnCriteria2.mmClosurePeriodIndicator,
						com.tools20022.repository.msg.BusinessDayReturnCriteria2.mmEventIndicator, com.tools20022.repository.msg.BusinessDayReturnCriteria2.mmSessionPeriodIndicator,
						com.tools20022.repository.msg.BusinessDayReturnCriteria2.mmEventTypeIndicator);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BusinessDayReturnCriteria2";
				definition = "Defines the criteria used to report on business day information.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<RequestedIndicator> getSystemDateIndicator() {
		return systemDateIndicator == null ? Optional.empty() : Optional.of(systemDateIndicator);
	}

	public BusinessDayReturnCriteria2 setSystemDateIndicator(RequestedIndicator systemDateIndicator) {
		this.systemDateIndicator = systemDateIndicator;
		return this;
	}

	public Optional<RequestedIndicator> getSystemStatusIndicator() {
		return systemStatusIndicator == null ? Optional.empty() : Optional.of(systemStatusIndicator);
	}

	public BusinessDayReturnCriteria2 setSystemStatusIndicator(RequestedIndicator systemStatusIndicator) {
		this.systemStatusIndicator = systemStatusIndicator;
		return this;
	}

	public Optional<RequestedIndicator> getSystemCurrencyIndicator() {
		return systemCurrencyIndicator == null ? Optional.empty() : Optional.of(systemCurrencyIndicator);
	}

	public BusinessDayReturnCriteria2 setSystemCurrencyIndicator(RequestedIndicator systemCurrencyIndicator) {
		this.systemCurrencyIndicator = systemCurrencyIndicator;
		return this;
	}

	public Optional<RequestedIndicator> getClosurePeriodIndicator() {
		return closurePeriodIndicator == null ? Optional.empty() : Optional.of(closurePeriodIndicator);
	}

	public BusinessDayReturnCriteria2 setClosurePeriodIndicator(RequestedIndicator closurePeriodIndicator) {
		this.closurePeriodIndicator = closurePeriodIndicator;
		return this;
	}

	public Optional<RequestedIndicator> getEventIndicator() {
		return eventIndicator == null ? Optional.empty() : Optional.of(eventIndicator);
	}

	public BusinessDayReturnCriteria2 setEventIndicator(RequestedIndicator eventIndicator) {
		this.eventIndicator = eventIndicator;
		return this;
	}

	public Optional<RequestedIndicator> getSessionPeriodIndicator() {
		return sessionPeriodIndicator == null ? Optional.empty() : Optional.of(sessionPeriodIndicator);
	}

	public BusinessDayReturnCriteria2 setSessionPeriodIndicator(RequestedIndicator sessionPeriodIndicator) {
		this.sessionPeriodIndicator = sessionPeriodIndicator;
		return this;
	}

	public Optional<RequestedIndicator> getEventTypeIndicator() {
		return eventTypeIndicator == null ? Optional.empty() : Optional.of(eventTypeIndicator);
	}

	public BusinessDayReturnCriteria2 setEventTypeIndicator(RequestedIndicator eventTypeIndicator) {
		this.eventTypeIndicator = eventTypeIndicator;
		return this;
	}
}