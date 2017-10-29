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
import com.tools20022.repository.choice.CancellationRejectionStatus1Choice;
import com.tools20022.repository.choice.InstructionRejectionStatus1Choice;
import com.tools20022.repository.choice.MeetingCancellationReason1Choice;
import com.tools20022.repository.codeset.MeetingCancellationReasonCode;
import com.tools20022.repository.codeset.RejectionReasonCode;
import com.tools20022.repository.entity.StatusReason;
import com.tools20022.repository.msg.CancellationRejectionStatus1;
import com.tools20022.repository.msg.MeetingCancellationReason1;
import com.tools20022.repository.msg.MeetingCancellationReason2;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the underlying reason for a status of a meeting or related
 * instructions.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="MeetingStatusReason" src="doc-files/MeetingStatusReason.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MeetingStatusReason#MeetingCancellationReason
 * MeetingStatusReason.MeetingCancellationReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MeetingStatusReason#MeetingStatus
 * MeetingStatusReason.MeetingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MeetingStatusReason#InstructionRejectionReason
 * MeetingStatusReason.InstructionRejectionReason}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.MeetingStatus#Reason
 * MeetingStatus.Reason}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.StatusReason
 * StatusReason}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.MeetingCancellationReason
 * MeetingCancellationReason}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MeetingCancellationReason1
 * MeetingCancellationReason1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.MeetingCancellationReason1Choice
 * MeetingCancellationReason1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MeetingCancellationReason2
 * MeetingCancellationReason2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CancellationRejectionStatus1
 * CancellationRejectionStatus1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionRejectionStatus1Choice
 * InstructionRejectionStatus1Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CancellationRejectionStatus1Choice
 * CancellationRejectionStatus1Choice}</li>
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
 * "MeetingStatusReason"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the underlying reason for a status of a meeting or related instructions."
 * </li>
 * </ul>
 */
public class MeetingStatusReason extends StatusReason {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies the reason for cancelling a meeting.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.MeetingCancellationReasonCode
	 * MeetingCancellationReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingCancellationReason#Code
	 * MeetingCancellationReason.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingCancellationReason1#Code
	 * MeetingCancellationReason1.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingCancellationReason1#ExtendedCode
	 * MeetingCancellationReason1.ExtendedCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MeetingCancellationReason1Choice#Code
	 * MeetingCancellationReason1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MeetingCancellationReason1Choice#Proprietary
	 * MeetingCancellationReason1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingCancellationReason2#CancellationReasonCode
	 * MeetingCancellationReason2.CancellationReasonCode}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MeetingStatusReason
	 * MeetingStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MeetingCancellationReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the reason for cancelling a meeting."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute MeetingCancellationReason = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MeetingCancellationReason.Code, com.tools20022.repository.msg.MeetingCancellationReason1.Code,
					com.tools20022.repository.msg.MeetingCancellationReason1.ExtendedCode, com.tools20022.repository.choice.MeetingCancellationReason1Choice.Code,
					com.tools20022.repository.choice.MeetingCancellationReason1Choice.Proprietary, com.tools20022.repository.msg.MeetingCancellationReason2.CancellationReasonCode);
			elementContext_lazy = () -> MeetingStatusReason.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MeetingCancellationReason";
			definition = "Specifies the reason for cancelling a meeting.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> MeetingCancellationReasonCode.mmObject();
		}
	};
	/**
	 * Status for which a reason is provided. It is derived from the association
	 * between StatusReason and Status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.MeetingStatus#Reason
	 * MeetingStatus.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.MeetingStatus
	 * MeetingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MeetingStatusReason
	 * MeetingStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MeetingStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Status for which a reason is provided. It is derived from the association between StatusReason and Status."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd MeetingStatus = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> MeetingStatusReason.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MeetingStatus";
			definition = "Status for which a reason is provided. It is derived from the association between StatusReason and Status.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.MeetingStatus.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.MeetingStatus.Reason;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Reason of the rejection of the instruction or of the cancellation
	 * request.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
	 * RejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancellationRejectionStatus1#Reason
	 * CancellationRejectionStatus1.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionRejectionStatus1Choice#Code
	 * InstructionRejectionStatus1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionRejectionStatus1Choice#Proprietary
	 * InstructionRejectionStatus1Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AdditionalStatus1#Reason
	 * AdditionalStatus1.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionStatus4Choice#RejectionStatus
	 * InstructionStatus4Choice.RejectionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationRejectionStatus1Choice#Code
	 * CancellationRejectionStatus1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationRejectionStatus1Choice#Proprietary
	 * CancellationRejectionStatus1Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AdditionalStatus2#Reason
	 * AdditionalStatus2.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionStatus6Choice#RejectionStatus
	 * InstructionStatus6Choice.RejectionStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MeetingStatusReason
	 * MeetingStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionRejectionReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reason of the rejection of the instruction or of the cancellation request."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute InstructionRejectionReason = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CancellationRejectionStatus1.Reason, com.tools20022.repository.choice.InstructionRejectionStatus1Choice.Code,
					com.tools20022.repository.choice.InstructionRejectionStatus1Choice.Proprietary, com.tools20022.repository.msg.AdditionalStatus1.Reason, com.tools20022.repository.choice.InstructionStatus4Choice.RejectionStatus,
					com.tools20022.repository.choice.CancellationRejectionStatus1Choice.Code, com.tools20022.repository.choice.CancellationRejectionStatus1Choice.Proprietary, com.tools20022.repository.msg.AdditionalStatus2.Reason,
					com.tools20022.repository.choice.InstructionStatus6Choice.RejectionStatus);
			elementContext_lazy = () -> MeetingStatusReason.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InstructionRejectionReason";
			definition = "Reason of the rejection of the instruction or of the cancellation request.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> RejectionReasonCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "MeetingStatusReason";
				definition = "Specifies the underlying reason for a status of a meeting or related instructions.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.MeetingStatus.Reason);
				superType_lazy = () -> StatusReason.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.MeetingStatusReason.MeetingCancellationReason, com.tools20022.repository.entity.MeetingStatusReason.MeetingStatus,
						com.tools20022.repository.entity.MeetingStatusReason.InstructionRejectionReason);
				derivationComponent_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MeetingCancellationReason.mmObject(), MeetingCancellationReason1.mmObject(), MeetingCancellationReason1Choice.mmObject(),
						MeetingCancellationReason2.mmObject(), CancellationRejectionStatus1.mmObject(), InstructionRejectionStatus1Choice.mmObject(), CancellationRejectionStatus1Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}