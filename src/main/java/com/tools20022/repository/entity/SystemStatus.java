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

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.choice.ClosureReason2Choice;
import com.tools20022.repository.choice.ClosureReasonChoice;
import com.tools20022.repository.choice.SystemStatus2Choice;
import com.tools20022.repository.codeset.MemberStatusCode;
import com.tools20022.repository.codeset.SystemStatusCode;
import com.tools20022.repository.entity.Status;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Status of a system and the period of time during which the status is valid.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SystemStatus" src="doc-files/SystemStatus.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.SystemStatus#Status
 * SystemStatus.Status}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SystemStatus#MemberStatus
 * SystemStatus.MemberStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SystemStatus#System
 * SystemStatus.System}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SystemStatus#SystemMemberRole
 * SystemStatus.SystemMemberRole}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.System#Status System.Status}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SystemMemberRole#MemberStatus
 * SystemMemberRole.MemberStatus}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SystemAvailabilityAndEvents1#ClosureInformation
 * SystemAvailabilityAndEvents1.ClosureInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponent3#Status
 * PointOfInteractionComponent3.Status}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponent4#Status
 * PointOfInteractionComponent4.Status}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponent5#Status
 * PointOfInteractionComponent5.Status}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponent6#Status
 * PointOfInteractionComponent6.Status}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponent7#Status
 * PointOfInteractionComponent7.Status}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Status Status}</li>
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
 * <li>{@linkplain com.tools20022.repository.choice.ClosureReason2Choice
 * ClosureReason2Choice}</li>
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
 * "SystemStatus"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Status of a system and the period of time during which the status is valid."
 * </li>
 * </ul>
 */
public class SystemStatus extends Status {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Current status of a system.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.SystemStatusDetails1#Status
	 * SystemStatusDetails1.Status}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SystemStatus1Choice#Code
	 * SystemStatus1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SystemStatus1Choice#Proprietary
	 * SystemStatus1Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SystemStatus1#Status
	 * SystemStatus1.Status}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponentStatus1#Status
	 * PointOfInteractionComponentStatus1.Status}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SystemStatus2#Status
	 * SystemStatus2.Status}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SystemStatus2Choice#Code
	 * SystemStatus2Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SystemStatus2Choice#Proprietary
	 * SystemStatus2Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponentStatus2#Status
	 * PointOfInteractionComponentStatus2.Status}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponentStatus3#Status
	 * PointOfInteractionComponentStatus3.Status}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SystemStatus SystemStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Status"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Current status of a system."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Status = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SystemStatusDetails1.Status, com.tools20022.repository.msg.SystemStatus1Choice.Code, com.tools20022.repository.msg.SystemStatus1Choice.Proprietary,
					com.tools20022.repository.msg.SystemStatus1.Status, com.tools20022.repository.msg.PointOfInteractionComponentStatus1.Status, com.tools20022.repository.msg.SystemStatus2.Status,
					com.tools20022.repository.choice.SystemStatus2Choice.Code, com.tools20022.repository.choice.SystemStatus2Choice.Proprietary, com.tools20022.repository.msg.PointOfInteractionComponentStatus2.Status,
					com.tools20022.repository.msg.PointOfInteractionComponentStatus3.Status);
			elementContext_lazy = () -> SystemStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Status";
			definition = "Current status of a system.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> SystemStatusCode.mmObject();
		}
	};
	/**
	 * Status of a member in a system, eg, enabled or deleted.
	 * <p>
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
	 * <li>{@linkplain com.tools20022.repository.msg.MemberDetails#Status
	 * MemberDetails.Status}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Member1#Status
	 * Member1.Status}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SystemStatus SystemStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MemberStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of a member in a system, eg, enabled or deleted."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute MemberStatus = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MemberDetails.Status, com.tools20022.repository.msg.Member1.Status);
			elementContext_lazy = () -> SystemStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MemberStatus";
			definition = "Status of a member in a system, eg, enabled or deleted.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> MemberStatusCode.mmObject();
		}
	};
	/**
	 * System for which a status is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.System#Status
	 * System.Status}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.System System}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SystemStatus SystemStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "System"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "System for which a status is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd System = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SystemStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "System";
			definition = "System for which a status is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.System.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.System.Status;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * System member role for which a member status is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SystemMemberRole#MemberStatus
	 * SystemMemberRole.MemberStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SystemMemberRole
	 * SystemMemberRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SystemStatus SystemStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SystemMemberRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "System member role for which a member status is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SystemMemberRole = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SystemStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SystemMemberRole";
			definition = "System member role for which a member status is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.SystemMemberRole.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SystemMemberRole.MemberStatus;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SystemStatus";
				definition = "Status of a system and the period of time during which the status is valid.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.System.Status, com.tools20022.repository.entity.SystemMemberRole.MemberStatus);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SystemAvailabilityAndEvents1.ClosureInformation, com.tools20022.repository.msg.PointOfInteractionComponent3.Status,
						com.tools20022.repository.msg.PointOfInteractionComponent4.Status, com.tools20022.repository.msg.PointOfInteractionComponent5.Status, com.tools20022.repository.msg.PointOfInteractionComponent6.Status,
						com.tools20022.repository.msg.PointOfInteractionComponent7.Status);
				superType_lazy = () -> com.tools20022.repository.entity.Status.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SystemStatus.Status, com.tools20022.repository.entity.SystemStatus.MemberStatus, com.tools20022.repository.entity.SystemStatus.System,
						com.tools20022.repository.entity.SystemStatus.SystemMemberRole);
				derivationComponent_lazy = () -> Arrays.asList(SystemStatusDetails1.mmObject(), ClosureReasonChoice.mmObject(), SystemStatus1Choice.mmObject(), SystemStatus1.mmObject(), ClosureReason2Choice.mmObject(),
						PointOfInteractionComponentStatus1.mmObject(), SystemStatus2.mmObject(), SystemStatus2Choice.mmObject(), PointOfInteractionComponentStatus2.mmObject(), PointOfInteractionComponentStatus3.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}