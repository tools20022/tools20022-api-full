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

package com.tools20022.repository.entity;

import com.tools20022.metamodel.ext.OtherSemanticMarkup;
import com.tools20022.metamodel.*;
import com.tools20022.repository.choice.ClosureReasonChoice;
import com.tools20022.repository.choice.SystemStatus2Choice;
import com.tools20022.repository.codeset.MemberStatusCode;
import com.tools20022.repository.codeset.SystemStatusCode;
import com.tools20022.repository.entity.Status;
import com.tools20022.repository.entity.System;
import com.tools20022.repository.entity.SystemMemberRole;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;

/**
 * Status of a system and the period of time during which the status is valid.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SystemStatus" src="doc-files/SystemStatus.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Status Status}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.SystemStatus#mmStatus
 * SystemStatus.mmStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SystemStatus#mmMemberStatus
 * SystemStatus.mmMemberStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SystemStatus#mmSystem
 * SystemStatus.mmSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SystemStatus#mmSystemMemberRole
 * SystemStatus.mmSystemMemberRole}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.System#mmStatus
 * System.mmStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SystemMemberRole#mmMemberStatus
 * SystemMemberRole.mmMemberStatus}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SystemAvailabilityAndEvents1#mmClosureInformation
 * SystemAvailabilityAndEvents1.mmClosureInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponent3#mmStatus
 * PointOfInteractionComponent3.mmStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponent4#mmStatus
 * PointOfInteractionComponent4.mmStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponent5#mmStatus
 * PointOfInteractionComponent5.mmStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponent6#mmStatus
 * PointOfInteractionComponent6.mmStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponent7#mmStatus
 * PointOfInteractionComponent7.mmStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SystemAvailabilityAndEvents2#mmClosureInformation
 * SystemAvailabilityAndEvents2.mmClosureInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponent8#mmStatus
 * PointOfInteractionComponent8.mmStatus}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.SystemStatusDetails1
 * SystemStatusDetails1}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ClosureReasonChoice
 * ClosureReasonChoice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SystemStatus1Choice
 * SystemStatus1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SystemStatus1 SystemStatus1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponentStatus1
 * PointOfInteractionComponentStatus1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SystemStatus2 SystemStatus2}</li>
 * <li>{@linkplain com.tools20022.repository.choice.SystemStatus2Choice
 * SystemStatus2Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponentStatus2
 * PointOfInteractionComponentStatus2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponentStatus3
 * PointOfInteractionComponentStatus3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SystemStatus3 SystemStatus3}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SystemStatus"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Status of a system and the period of time during which the status is valid."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
public class SystemStatus extends Status {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected SystemStatusCode status;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SystemStatusCode
	 * SystemStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SystemStatusDetails1#mmStatus
	 * SystemStatusDetails1.mmStatus}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SystemStatus1Choice#mmCode
	 * SystemStatus1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SystemStatus1Choice#mmProprietary
	 * SystemStatus1Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SystemStatus1#mmStatus
	 * SystemStatus1.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponentStatus1#mmStatus
	 * PointOfInteractionComponentStatus1.mmStatus}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SystemStatus2#mmStatus
	 * SystemStatus2.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SystemStatus2Choice#mmCode
	 * SystemStatus2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SystemStatus2Choice#mmProprietary
	 * SystemStatus2Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponentStatus2#mmStatus
	 * PointOfInteractionComponentStatus2.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponentStatus3#mmStatus
	 * PointOfInteractionComponentStatus3.mmStatus}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SystemStatus3#mmStatus
	 * SystemStatus3.mmStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SystemStatus SystemStatus}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Status"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Current status of a system."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = type=SampleData, SampleData=<?xml version="1.0"
	 * encoding="UTF-8"?> <InstanceInfo> <key KeyValue="Sample1"/> <key
	 * KeyValue="Sample2"/> <key KeyValue="Sample3"/> <key KeyValue="Sample4"/>
	 * <key KeyValue="Sample5"/> <key KeyValue="Sample6"/> <key
	 * KeyValue="Sample7"/> <key KeyValue="Sample8"/> <key KeyValue="Sample9"/>
	 * <key KeyValue="Sample10"/> </InstanceInfo>
	 * 
	 * 
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SystemStatus, SystemStatusCode> mmStatus = new MMBusinessAttribute<SystemStatus, SystemStatusCode>() {
		{
			derivation_lazy = () -> Arrays.asList(SystemStatusDetails1.mmStatus, SystemStatus1Choice.mmCode, SystemStatus1Choice.mmProprietary, SystemStatus1.mmStatus, PointOfInteractionComponentStatus1.mmStatus, SystemStatus2.mmStatus,
					SystemStatus2Choice.mmCode, SystemStatus2Choice.mmProprietary, PointOfInteractionComponentStatus2.mmStatus, PointOfInteractionComponentStatus3.mmStatus, SystemStatus3.mmStatus);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SystemStatus.mmObject();
			semanticMarkup_lazy = () -> Arrays
					.asList(new OtherSemanticMarkup(
							this,
							"SampleData",
							new String[]{
									"SampleData",
									"<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<InstanceInfo>\n<key KeyValue=\"Sample1\"/>\n<key KeyValue=\"Sample2\"/>\n<key KeyValue=\"Sample3\"/>\n<key KeyValue=\"Sample4\"/>\n<key KeyValue=\"Sample5\"/>\n<key KeyValue=\"Sample6\"/>\n<key KeyValue=\"Sample7\"/>\n<key KeyValue=\"Sample8\"/>\n<key KeyValue=\"Sample9\"/>\n<key KeyValue=\"Sample10\"/>\n</InstanceInfo>\n\n\n"}));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Status";
			definition = "Current status of a system.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SystemStatusCode.mmObject();
		}

		@Override
		public SystemStatusCode getValue(SystemStatus obj) {
			return obj.getStatus();
		}

		@Override
		public void setValue(SystemStatus obj, SystemStatusCode value) {
			obj.setStatus(value);
		}
	};
	protected MemberStatusCode memberStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.MemberStatusCode
	 * MemberStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.MemberDetails#mmStatus
	 * MemberDetails.mmStatus}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Member1#mmStatus
	 * Member1.mmStatus}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Member4#mmStatus
	 * Member4.mmStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SystemStatus SystemStatus}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MemberStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of a member in a system, eg, enabled or deleted."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SystemStatus, MemberStatusCode> mmMemberStatus = new MMBusinessAttribute<SystemStatus, MemberStatusCode>() {
		{
			derivation_lazy = () -> Arrays.asList(MemberDetails.mmStatus, Member1.mmStatus, Member4.mmStatus);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SystemStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MemberStatus";
			definition = "Status of a member in a system, eg, enabled or deleted.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> MemberStatusCode.mmObject();
		}

		@Override
		public MemberStatusCode getValue(SystemStatus obj) {
			return obj.getMemberStatus();
		}

		@Override
		public void setValue(SystemStatus obj, MemberStatusCode value) {
			obj.setMemberStatus(value);
		}
	};
	protected System system;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.System System}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.System#mmStatus
	 * System.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SystemStatus SystemStatus}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "System"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "System for which a status is specified."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SystemStatus, com.tools20022.repository.entity.System> mmSystem = new MMBusinessAssociationEnd<SystemStatus, com.tools20022.repository.entity.System>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SystemStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "System";
			definition = "System for which a status is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.System.mmStatus;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.System.mmObject();
		}

		@Override
		public com.tools20022.repository.entity.System getValue(SystemStatus obj) {
			return obj.getSystem();
		}

		@Override
		public void setValue(SystemStatus obj, com.tools20022.repository.entity.System value) {
			obj.setSystem(value);
		}
	};
	protected SystemMemberRole systemMemberRole;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SystemMemberRole
	 * SystemMemberRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SystemMemberRole#mmMemberStatus
	 * SystemMemberRole.mmMemberStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SystemStatus SystemStatus}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SystemMemberRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "System member role for which a member status is specified."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SystemStatus, Optional<SystemMemberRole>> mmSystemMemberRole = new MMBusinessAssociationEnd<SystemStatus, Optional<SystemMemberRole>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SystemStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SystemMemberRole";
			definition = "System member role for which a member status is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SystemMemberRole.mmMemberStatus;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SystemMemberRole.mmObject();
		}

		@Override
		public Optional<SystemMemberRole> getValue(SystemStatus obj) {
			return obj.getSystemMemberRole();
		}

		@Override
		public void setValue(SystemStatus obj, Optional<SystemMemberRole> value) {
			obj.setSystemMemberRole(value.orElse(null));
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SystemStatus";
				definition = "Status of a system and the period of time during which the status is valid.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.System.mmStatus, com.tools20022.repository.entity.SystemMemberRole.mmMemberStatus);
				derivationElement_lazy = () -> Arrays.asList(SystemAvailabilityAndEvents1.mmClosureInformation, PointOfInteractionComponent3.mmStatus, PointOfInteractionComponent4.mmStatus, PointOfInteractionComponent5.mmStatus,
						PointOfInteractionComponent6.mmStatus, PointOfInteractionComponent7.mmStatus, SystemAvailabilityAndEvents2.mmClosureInformation, PointOfInteractionComponent8.mmStatus);
				superType_lazy = () -> com.tools20022.repository.entity.Status.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SystemStatus.mmStatus, com.tools20022.repository.entity.SystemStatus.mmMemberStatus, com.tools20022.repository.entity.SystemStatus.mmSystem,
						com.tools20022.repository.entity.SystemStatus.mmSystemMemberRole);
				derivationComponent_lazy = () -> Arrays.asList(SystemStatusDetails1.mmObject(), ClosureReasonChoice.mmObject(), SystemStatus1Choice.mmObject(), SystemStatus1.mmObject(), PointOfInteractionComponentStatus1.mmObject(),
						SystemStatus2.mmObject(), SystemStatus2Choice.mmObject(), PointOfInteractionComponentStatus2.mmObject(), PointOfInteractionComponentStatus3.mmObject(), SystemStatus3.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return SystemStatus.class;
			}
		});
		return mmObject_lazy.get();
	}

	public SystemStatusCode getStatus() {
		return status;
	}

	public SystemStatus setStatus(SystemStatusCode status) {
		this.status = Objects.requireNonNull(status);
		return this;
	}

	public MemberStatusCode getMemberStatus() {
		return memberStatus;
	}

	public SystemStatus setMemberStatus(MemberStatusCode memberStatus) {
		this.memberStatus = Objects.requireNonNull(memberStatus);
		return this;
	}

	public System getSystem() {
		return system;
	}

	public SystemStatus setSystem(com.tools20022.repository.entity.System system) {
		this.system = Objects.requireNonNull(system);
		return this;
	}

	public Optional<SystemMemberRole> getSystemMemberRole() {
		return systemMemberRole == null ? Optional.empty() : Optional.of(systemMemberRole);
	}

	public SystemStatus setSystemMemberRole(com.tools20022.repository.entity.SystemMemberRole systemMemberRole) {
		this.systemMemberRole = systemMemberRole;
		return this;
	}
}