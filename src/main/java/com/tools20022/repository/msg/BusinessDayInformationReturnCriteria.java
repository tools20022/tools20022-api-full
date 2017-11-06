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
import com.tools20022.repository.datatype.RequestedIndicator;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * {@linkplain com.tools20022.repository.msg.BusinessDayInformationReturnCriteria#mmSystemStatusIndicator
 * BusinessDayInformationReturnCriteria.mmSystemStatusIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BusinessDayInformationReturnCriteria#mmEventIndicator
 * BusinessDayInformationReturnCriteria.mmEventIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BusinessDayInformationReturnCriteria#mmSessionPeriodIndicator
 * BusinessDayInformationReturnCriteria.mmSessionPeriodIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BusinessDayInformationReturnCriteria#mmClosureInformationIndicator
 * BusinessDayInformationReturnCriteria.mmClosureInformationIndicator}</li>
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
 * "BusinessDayInformationReturnCriteria"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Defines the criteria used to report on business day information."</li>
 * </ul>
 */
public class BusinessDayInformationReturnCriteria {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected RequestedIndicator systemStatusIndicator;
	/**
	 * Indicates whether the system status is requested.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.BusinessDayInformationReturnCriteria
	 * BusinessDayInformationReturnCriteria}</li>
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
			componentContext_lazy = () -> BusinessDayInformationReturnCriteria.mmObject();
			isDerived = false;
			xmlTag = "SysStsInd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SystemStatusIndicator";
			definition = "Indicates whether the system status is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	protected RequestedIndicator eventIndicator;
	/**
	 * Indicates whether the events are requested.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.BusinessDayInformationReturnCriteria
	 * BusinessDayInformationReturnCriteria}</li>
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
			componentContext_lazy = () -> BusinessDayInformationReturnCriteria.mmObject();
			isDerived = false;
			xmlTag = "EvtInd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventIndicator";
			definition = "Indicates whether the events are requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	protected RequestedIndicator sessionPeriodIndicator;
	/**
	 * Indicates whether the session period is requested.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.BusinessDayInformationReturnCriteria
	 * BusinessDayInformationReturnCriteria}</li>
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
			componentContext_lazy = () -> BusinessDayInformationReturnCriteria.mmObject();
			isDerived = false;
			xmlTag = "SsnPrdInd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SessionPeriodIndicator";
			definition = "Indicates whether the session period is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	protected RequestedIndicator closureInformationIndicator;
	/**
	 * Indicates whether the closure information is requested.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.BusinessDayInformationReturnCriteria
	 * BusinessDayInformationReturnCriteria}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClsrInfInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClosureInformationIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the closure information is requested."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmClosureInformationIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> BusinessDayInformationReturnCriteria.mmObject();
			isDerived = false;
			xmlTag = "ClsrInfInd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClosureInformationIndicator";
			definition = "Indicates whether the closure information is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.BusinessDayInformationReturnCriteria.mmSystemStatusIndicator, com.tools20022.repository.msg.BusinessDayInformationReturnCriteria.mmEventIndicator,
						com.tools20022.repository.msg.BusinessDayInformationReturnCriteria.mmSessionPeriodIndicator, com.tools20022.repository.msg.BusinessDayInformationReturnCriteria.mmClosureInformationIndicator);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "BusinessDayInformationReturnCriteria";
				definition = "Defines the criteria used to report on business day information.";
			}
		});
		return mmObject_lazy.get();
	}

	public RequestedIndicator getSystemStatusIndicator() {
		return systemStatusIndicator;
	}

	public void setSystemStatusIndicator(RequestedIndicator systemStatusIndicator) {
		this.systemStatusIndicator = systemStatusIndicator;
	}

	public RequestedIndicator getEventIndicator() {
		return eventIndicator;
	}

	public void setEventIndicator(RequestedIndicator eventIndicator) {
		this.eventIndicator = eventIndicator;
	}

	public RequestedIndicator getSessionPeriodIndicator() {
		return sessionPeriodIndicator;
	}

	public void setSessionPeriodIndicator(RequestedIndicator sessionPeriodIndicator) {
		this.sessionPeriodIndicator = sessionPeriodIndicator;
	}

	public RequestedIndicator getClosureInformationIndicator() {
		return closureInformationIndicator;
	}

	public void setClosureInformationIndicator(RequestedIndicator closureInformationIndicator) {
		this.closureInformationIndicator = closureInformationIndicator;
	}
}