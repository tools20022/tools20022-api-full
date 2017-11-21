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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Payment system operational information, such as opening, closure, session
 * period or events, given per currency.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.BusinessDay2#mmSystemDate
 * BusinessDay2.mmSystemDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BusinessDay2#mmSystemStatus
 * BusinessDay2.mmSystemStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BusinessDay2#mmSystemInformationPerCurrency
 * BusinessDay2.mmSystemInformationPerCurrency}</li>
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
 * "BusinessDay2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Payment system operational information, such as opening, closure, session period or events, given per currency."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.BusinessDay4 BusinessDay4}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "BusinessDay2", propOrder = {"systemDate", "systemStatus", "systemInformationPerCurrency"})
public class BusinessDay2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected ISODate systemDate;
	/**
	 * Date for which the availability information is provided.
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
	 * {@linkplain com.tools20022.repository.msg.BusinessDay2 BusinessDay2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SysDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SystemDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date for which the availability information is provided."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.BusinessDay4#mmSystemDate
	 * BusinessDay4.mmSystemDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSystemDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> BusinessDay2.mmObject();
			isDerived = false;
			xmlTag = "SysDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SystemDate";
			definition = "Date for which the availability information is provided.";
			nextVersions_lazy = () -> Arrays.asList(BusinessDay4.mmSystemDate);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected SystemStatus1 systemStatus;
	/**
	 * Status of a system and the period of time during which the status is
	 * valid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SystemStatus1
	 * SystemStatus1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BusinessDay2 BusinessDay2}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BusinessDay4#mmSystemStatus
	 * BusinessDay4.mmSystemStatus}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSystemStatus = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> BusinessDay2.mmObject();
			isDerived = false;
			xmlTag = "SysSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SystemStatus";
			definition = "Status of a system and the period of time during which the status is valid.";
			nextVersions_lazy = () -> Arrays.asList(BusinessDay4.mmSystemStatus);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SystemStatus1.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.SystemAvailabilityAndEvents1> systemInformationPerCurrency;
	/**
	 * Information relating to system operations and foreseen events relating to
	 * the operation of the system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SystemAvailabilityAndEvents1
	 * SystemAvailabilityAndEvents1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BusinessDay2 BusinessDay2}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BusinessDay4#mmSystemInformationPerCurrency
	 * BusinessDay4.mmSystemInformationPerCurrency}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSystemInformationPerCurrency = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> BusinessDay2.mmObject();
			isDerived = false;
			xmlTag = "SysInfPerCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SystemInformationPerCurrency";
			definition = "Information relating to system operations and foreseen events relating to the operation of the system.";
			nextVersions_lazy = () -> Arrays.asList(BusinessDay4.mmSystemInformationPerCurrency);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SystemAvailabilityAndEvents1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(BusinessDay2.mmSystemDate, BusinessDay2.mmSystemStatus, BusinessDay2.mmSystemInformationPerCurrency);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "BusinessDay2";
				definition = "Payment system operational information, such as opening, closure, session period or events, given per currency.";
				nextVersions_lazy = () -> Arrays.asList(BusinessDay4.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "SysDt")
	public ISODate getSystemDate() {
		return systemDate;
	}

	public void setSystemDate(ISODate systemDate) {
		this.systemDate = systemDate;
	}

	@XmlElement(name = "SysSts")
	public SystemStatus1 getSystemStatus() {
		return systemStatus;
	}

	public void setSystemStatus(com.tools20022.repository.msg.SystemStatus1 systemStatus) {
		this.systemStatus = systemStatus;
	}

	@XmlElement(name = "SysInfPerCcy")
	public List<SystemAvailabilityAndEvents1> getSystemInformationPerCurrency() {
		return systemInformationPerCurrency;
	}

	public void setSystemInformationPerCurrency(List<com.tools20022.repository.msg.SystemAvailabilityAndEvents1> systemInformationPerCurrency) {
		this.systemInformationPerCurrency = systemInformationPerCurrency;
	}
}