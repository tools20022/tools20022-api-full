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
import java.util.Optional;
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SystemMigration1", propOrder = {"nPSParticipantIndicator", "plannedMigrationDate", "balanceReceivedIndicator", "migrated", "lastDate"})
public class SystemMigration1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "NPSPtcptInd")
	protected YesNoIndicator nPSParticipantIndicator;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<SystemMigration1, Optional<YesNoIndicator>> mmNPSParticipantIndicator = new MMMessageAttribute<SystemMigration1, Optional<YesNoIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SystemMigration1.mmObject();
			isDerived = false;
			xmlTag = "NPSPtcptInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NPSParticipantIndicator";
			definition = "Indicates whether the participant is a member of a new payment system.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(SystemMigration1 obj) {
			return obj.getNPSParticipantIndicator();
		}

		@Override
		public void setValue(SystemMigration1 obj, Optional<YesNoIndicator> value) {
			obj.setNPSParticipantIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "PlandMgrtnDt")
	protected ISODateTime plannedMigrationDate;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<SystemMigration1, Optional<ISODateTime>> mmPlannedMigrationDate = new MMMessageAttribute<SystemMigration1, Optional<ISODateTime>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SystemMigration1.mmObject();
			isDerived = false;
			xmlTag = "PlandMgrtnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlannedMigrationDate";
			definition = "Planned migration date.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public Optional<ISODateTime> getValue(SystemMigration1 obj) {
			return obj.getPlannedMigrationDate();
		}

		@Override
		public void setValue(SystemMigration1 obj, Optional<ISODateTime> value) {
			obj.setPlannedMigrationDate(value.orElse(null));
		}
	};
	@XmlElement(name = "BalRcvdInd")
	protected YesNoIndicator balanceReceivedIndicator;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<SystemMigration1, Optional<YesNoIndicator>> mmBalanceReceivedIndicator = new MMMessageAttribute<SystemMigration1, Optional<YesNoIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SystemMigration1.mmObject();
			isDerived = false;
			xmlTag = "BalRcvdInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceReceivedIndicator";
			definition = "Indicates whether the balance was received.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(SystemMigration1 obj) {
			return obj.getBalanceReceivedIndicator();
		}

		@Override
		public void setValue(SystemMigration1 obj, Optional<YesNoIndicator> value) {
			obj.setBalanceReceivedIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "Mgrtd")
	protected YesNoIndicator migrated;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<SystemMigration1, Optional<YesNoIndicator>> mmMigrated = new MMMessageAttribute<SystemMigration1, Optional<YesNoIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SystemMigration1.mmObject();
			isDerived = false;
			xmlTag = "Mgrtd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Migrated";
			definition = "Indicates whether the participant was migrated.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(SystemMigration1 obj) {
			return obj.getMigrated();
		}

		@Override
		public void setValue(SystemMigration1 obj, Optional<YesNoIndicator> value) {
			obj.setMigrated(value.orElse(null));
		}
	};
	@XmlElement(name = "LastDt")
	protected ISODateTime lastDate;
	/**
	 * 
	 <p>
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
	 * definition} = "Date of the latest RABIS service."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SystemMigration1, Optional<ISODateTime>> mmLastDate = new MMMessageAttribute<SystemMigration1, Optional<ISODateTime>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SystemMigration1.mmObject();
			isDerived = false;
			xmlTag = "LastDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LastDate";
			definition = "Date of the latest RABIS service.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public Optional<ISODateTime> getValue(SystemMigration1 obj) {
			return obj.getLastDate();
		}

		@Override
		public void setValue(SystemMigration1 obj, Optional<ISODateTime> value) {
			obj.setLastDate(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SystemMigration1.mmNPSParticipantIndicator, com.tools20022.repository.msg.SystemMigration1.mmPlannedMigrationDate,
						com.tools20022.repository.msg.SystemMigration1.mmBalanceReceivedIndicator, com.tools20022.repository.msg.SystemMigration1.mmMigrated, com.tools20022.repository.msg.SystemMigration1.mmLastDate);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "SystemMigration1";
				definition = "Data about participant migration to new payment system process.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<YesNoIndicator> getNPSParticipantIndicator() {
		return nPSParticipantIndicator == null ? Optional.empty() : Optional.of(nPSParticipantIndicator);
	}

	public SystemMigration1 setNPSParticipantIndicator(YesNoIndicator nPSParticipantIndicator) {
		this.nPSParticipantIndicator = nPSParticipantIndicator;
		return this;
	}

	public Optional<ISODateTime> getPlannedMigrationDate() {
		return plannedMigrationDate == null ? Optional.empty() : Optional.of(plannedMigrationDate);
	}

	public SystemMigration1 setPlannedMigrationDate(ISODateTime plannedMigrationDate) {
		this.plannedMigrationDate = plannedMigrationDate;
		return this;
	}

	public Optional<YesNoIndicator> getBalanceReceivedIndicator() {
		return balanceReceivedIndicator == null ? Optional.empty() : Optional.of(balanceReceivedIndicator);
	}

	public SystemMigration1 setBalanceReceivedIndicator(YesNoIndicator balanceReceivedIndicator) {
		this.balanceReceivedIndicator = balanceReceivedIndicator;
		return this;
	}

	public Optional<YesNoIndicator> getMigrated() {
		return migrated == null ? Optional.empty() : Optional.of(migrated);
	}

	public SystemMigration1 setMigrated(YesNoIndicator migrated) {
		this.migrated = migrated;
		return this;
	}

	public Optional<ISODateTime> getLastDate() {
		return lastDate == null ? Optional.empty() : Optional.of(lastDate);
	}

	public SystemMigration1 setLastDate(ISODateTime lastDate) {
		this.lastDate = lastDate;
		return this;
	}
}