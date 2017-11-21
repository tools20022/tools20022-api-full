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
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Data about participant migration to new payment system process.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SystemMigration1#mmNPSParticipantIndicator
 * SystemMigration1.mmNPSParticipantIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SystemMigration1#mmPlannedMigrationDate
 * SystemMigration1.mmPlannedMigrationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SystemMigration1#mmBalanceReceivedIndicator
 * SystemMigration1.mmBalanceReceivedIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SystemMigration1#mmMigrated
 * SystemMigration1.mmMigrated}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SystemMigration1#mmLastDate
 * SystemMigration1.mmLastDate}</li>
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
 * "SystemMigration1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Data about participant migration to new payment system process."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "SystemMigration1", propOrder = {"NPSParticipantIndicator", "plannedMigrationDate", "balanceReceivedIndicator", "migrated", "lastDate"})
public class SystemMigration1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected YesNoIndicator nPSParticipantIndicator;
	/**
	 * Indicates whether the participant is a member of a new payment system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SystemMigration1
	 * SystemMigration1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NPSPtcptInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NPSParticipantIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the participant is a member of a new payment system."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNPSParticipantIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SystemMigration1.mmObject();
			isDerived = false;
			xmlTag = "NPSPtcptInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NPSParticipantIndicator";
			definition = "Indicates whether the participant is a member of a new payment system.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected ISODateTime plannedMigrationDate;
	/**
	 * Planned migration date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SystemMigration1
	 * SystemMigration1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PlandMgrtnDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlannedMigrationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Planned migration date."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPlannedMigrationDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SystemMigration1.mmObject();
			isDerived = false;
			xmlTag = "PlandMgrtnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlannedMigrationDate";
			definition = "Planned migration date.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected YesNoIndicator balanceReceivedIndicator;
	/**
	 * Indicates whether the balance was received.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SystemMigration1
	 * SystemMigration1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BalRcvdInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceReceivedIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the balance was received."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBalanceReceivedIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SystemMigration1.mmObject();
			isDerived = false;
			xmlTag = "BalRcvdInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceReceivedIndicator";
			definition = "Indicates whether the balance was received.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator migrated;
	/**
	 * Indicates whether the participant was migrated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SystemMigration1
	 * SystemMigration1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Mgrtd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Migrated"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the participant was migrated."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMigrated = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SystemMigration1.mmObject();
			isDerived = false;
			xmlTag = "Mgrtd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Migrated";
			definition = "Indicates whether the participant was migrated.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected ISODateTime lastDate;
	/**
	 * Date of the latest RABIS service
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SystemMigration1
	 * SystemMigration1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LastDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LastDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date of the latest RABIS service"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLastDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SystemMigration1.mmObject();
			isDerived = false;
			xmlTag = "LastDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LastDate";
			definition = "Date of the latest RABIS service";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(SystemMigration1.mmNPSParticipantIndicator, SystemMigration1.mmPlannedMigrationDate, SystemMigration1.mmBalanceReceivedIndicator, SystemMigration1.mmMigrated,
						SystemMigration1.mmLastDate);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "SystemMigration1";
				definition = "Data about participant migration to new payment system process.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "NPSPtcptInd")
	public YesNoIndicator getNPSParticipantIndicator() {
		return nPSParticipantIndicator;
	}

	public void setNPSParticipantIndicator(YesNoIndicator nPSParticipantIndicator) {
		this.nPSParticipantIndicator = nPSParticipantIndicator;
	}

	@XmlElement(name = "PlandMgrtnDt")
	public ISODateTime getPlannedMigrationDate() {
		return plannedMigrationDate;
	}

	public void setPlannedMigrationDate(ISODateTime plannedMigrationDate) {
		this.plannedMigrationDate = plannedMigrationDate;
	}

	@XmlElement(name = "BalRcvdInd")
	public YesNoIndicator getBalanceReceivedIndicator() {
		return balanceReceivedIndicator;
	}

	public void setBalanceReceivedIndicator(YesNoIndicator balanceReceivedIndicator) {
		this.balanceReceivedIndicator = balanceReceivedIndicator;
	}

	@XmlElement(name = "Mgrtd")
	public YesNoIndicator getMigrated() {
		return migrated;
	}

	public void setMigrated(YesNoIndicator migrated) {
		this.migrated = migrated;
	}

	@XmlElement(name = "LastDt")
	public ISODateTime getLastDate() {
		return lastDate;
	}

	public void setLastDate(ISODateTime lastDate) {
		this.lastDate = lastDate;
	}
}