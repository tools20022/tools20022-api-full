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
import com.tools20022.repository.choice.DateTimePeriodChoice;
import com.tools20022.repository.choice.SystemEventType2Choice;
import com.tools20022.repository.choice.SystemIdentification2Choice;
import com.tools20022.repository.codeset.ActiveCurrencyCode;
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
 * Defines the criteria used to search for system business day information.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BusinessDaySearchCriteria1#mmSystemDate
 * BusinessDaySearchCriteria1.mmSystemDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BusinessDaySearchCriteria1#mmSystemIdentification
 * BusinessDaySearchCriteria1.mmSystemIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BusinessDaySearchCriteria1#mmSystemCurrency
 * BusinessDaySearchCriteria1.mmSystemCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BusinessDaySearchCriteria1#mmEventType
 * BusinessDaySearchCriteria1.mmEventType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BusinessDaySearchCriteria1#mmClosurePeriod
 * BusinessDaySearchCriteria1.mmClosurePeriod}</li>
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
 * "BusinessDaySearchCriteria1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Defines the criteria used to search for system business day information."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "BusinessDaySearchCriteria1", propOrder = {"systemDate", "systemIdentification", "systemCurrency", "eventType", "closurePeriod"})
public class BusinessDaySearchCriteria1 {

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
	 * {@linkplain com.tools20022.repository.msg.BusinessDaySearchCriteria1
	 * BusinessDaySearchCriteria1}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmSystemDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> BusinessDaySearchCriteria1.mmObject();
			isDerived = false;
			xmlTag = "SysDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SystemDate";
			definition = "Date for which the availability information is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected List<SystemIdentification2Choice> systemIdentification;
	/**
	 * Unique and unambiguous identification of the system, as assigned by the
	 * system administrator.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.SystemIdentification2Choice
	 * SystemIdentification2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BusinessDaySearchCriteria1
	 * BusinessDaySearchCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SysId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SystemIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identification of the system, as assigned by the system administrator. "
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSystemIdentification = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> BusinessDaySearchCriteria1.mmObject();
			isDerived = false;
			xmlTag = "SysId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SystemIdentification";
			definition = "Unique and unambiguous identification of the system, as assigned by the system administrator. ";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SystemIdentification2Choice.mmObject();
		}
	};
	protected List<ActiveCurrencyCode> systemCurrency;
	/**
	 * Currency which may be processed by the system. A system may process
	 * transactions in a single currency or in multiple currencies.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.BusinessDaySearchCriteria1
	 * BusinessDaySearchCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SysCcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SystemCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Currency which may be processed by the system. A system may process transactions in a single currency or in multiple currencies."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSystemCurrency = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> BusinessDaySearchCriteria1.mmObject();
			isDerived = false;
			xmlTag = "SysCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SystemCurrency";
			definition = "Currency which may be processed by the system. A system may process transactions in a single currency or in multiple currencies.";
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyCode.mmObject();
		}
	};
	protected SystemEventType2Choice eventType;
	/**
	 * Nature of the event that has occurred.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.SystemEventType2Choice
	 * SystemEventType2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BusinessDaySearchCriteria1
	 * BusinessDaySearchCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EvtTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Nature of the event that has occurred."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmEventType = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> BusinessDaySearchCriteria1.mmObject();
			isDerived = false;
			xmlTag = "EvtTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventType";
			definition = "Nature of the event that has occurred.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SystemEventType2Choice.mmObject();
		}
	};
	protected DateTimePeriodChoice closurePeriod;
	/**
	 * Period of time when the system is closed/not operating.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateTimePeriodChoice
	 * DateTimePeriodChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BusinessDaySearchCriteria1
	 * BusinessDaySearchCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClsrPrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClosurePeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Period of time when the system is closed/not operating."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmClosurePeriod = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> BusinessDaySearchCriteria1.mmObject();
			isDerived = false;
			xmlTag = "ClsrPrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClosurePeriod";
			definition = "Period of time when the system is closed/not operating.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateTimePeriodChoice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(BusinessDaySearchCriteria1.mmSystemDate, BusinessDaySearchCriteria1.mmSystemIdentification, BusinessDaySearchCriteria1.mmSystemCurrency, BusinessDaySearchCriteria1.mmEventType,
						BusinessDaySearchCriteria1.mmClosurePeriod);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "BusinessDaySearchCriteria1";
				definition = "Defines the criteria used to search for system business day information.";
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

	@XmlElement(name = "SysId")
	public List<SystemIdentification2Choice> getSystemIdentification() {
		return systemIdentification;
	}

	public void setSystemIdentification(List<SystemIdentification2Choice> systemIdentification) {
		this.systemIdentification = systemIdentification;
	}

	@XmlElement(name = "SysCcy")
	public List<ActiveCurrencyCode> getSystemCurrency() {
		return systemCurrency;
	}

	public void setSystemCurrency(List<ActiveCurrencyCode> systemCurrency) {
		this.systemCurrency = systemCurrency;
	}

	@XmlElement(name = "EvtTp")
	public SystemEventType2Choice getEventType() {
		return eventType;
	}

	public void setEventType(SystemEventType2Choice eventType) {
		this.eventType = eventType;
	}

	@XmlElement(name = "ClsrPrd")
	public DateTimePeriodChoice getClosurePeriod() {
		return closurePeriod;
	}

	public void setClosurePeriod(DateTimePeriodChoice closurePeriod) {
		this.closurePeriod = closurePeriod;
	}
}