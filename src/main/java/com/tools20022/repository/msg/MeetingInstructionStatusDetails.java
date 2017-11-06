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
import com.tools20022.metamodel.MMXor;
import com.tools20022.repository.codeset.MeetingInstructionRejection1Code;
import com.tools20022.repository.codeset.Status1Code;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.entity.MeetingStatus;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Information about the status of an instruction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponent#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingInstructionStatusDetails#mmProcessingOrRejection
 * MeetingInstructionStatusDetails.mmProcessingOrRejection}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingInstructionStatusDetails#mmProcessingStatus
 * MeetingInstructionStatusDetails.mmProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingInstructionStatusDetails#mmRejectionStatus
 * MeetingInstructionStatusDetails.mmRejectionStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingInstructionStatusDetails#mmStatusReason
 * MeetingInstructionStatusDetails.mmStatusReason}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.MeetingStatus
 * MeetingStatus}</li>
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
 * "MeetingInstructionStatusDetails"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information about the status of an instruction."</li>
 * </ul>
 */
public class MeetingInstructionStatusDetails {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Status1Code processingStatus;
	/**
	 * Information on the processing of one instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.Status1Code
	 * Status1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Status#mmInstructionProcessingStatus
	 * Status.mmInstructionProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MeetingInstructionStatusDetails
	 * MeetingInstructionStatusDetails}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrcgSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProcessingStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information on the processing of one instruction."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmProcessingStatus = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Status.mmInstructionProcessingStatus;
			componentContext_lazy = () -> MeetingInstructionStatusDetails.mmObject();
			isDerived = false;
			xmlTag = "PrcgSts";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessingStatus";
			definition = "Information on the processing of one instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Status1Code.mmObject();
		}
	};
	protected MeetingInstructionRejection1Code rejectionStatus;
	/**
	 * Information on the rejection of one instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.MeetingInstructionRejection1Code
	 * MeetingInstructionRejection1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MeetingInstructionStatusDetails
	 * MeetingInstructionStatusDetails}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RjctnSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RejectionStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information on the rejection of one instruction."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRejectionStatus = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> MeetingInstructionStatusDetails.mmObject();
			isDerived = false;
			xmlTag = "RjctnSts";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RejectionStatus";
			definition = "Information on the rejection of one instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> MeetingInstructionRejection1Code.mmObject();
		}
	};
	protected Max350Text statusReason;
	/**
	 * Detailed information about the status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmReason
	 * StatusReason.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MeetingInstructionStatusDetails
	 * MeetingInstructionStatusDetails}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StsRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Detailed information about the status."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmStatusReason = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.StatusReason.mmReason;
			componentContext_lazy = () -> MeetingInstructionStatusDetails.mmObject();
			isDerived = false;
			xmlTag = "StsRsn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusReason";
			definition = "Detailed information about the status.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingInstructionStatusDetails#mmProcessingStatus
	 * MeetingInstructionStatusDetails.mmProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingInstructionStatusDetails#mmRejectionStatus
	 * MeetingInstructionStatusDetails.mmRejectionStatus}</li>
	 * </ul>
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.MeetingInstructionStatusDetails
	 * MeetingInstructionStatusDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProcessingOrRejection"</li>
	 * </ul>
	 */
	public static final MMXor mmProcessingOrRejection = new MMXor() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessingOrRejection";
			messageComponent_lazy = () -> MeetingInstructionStatusDetails.mmObject();
			impactedElements_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MeetingInstructionStatusDetails.mmProcessingStatus, com.tools20022.repository.msg.MeetingInstructionStatusDetails.mmRejectionStatus);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MeetingInstructionStatusDetails.mmProcessingStatus, com.tools20022.repository.msg.MeetingInstructionStatusDetails.mmRejectionStatus,
						com.tools20022.repository.msg.MeetingInstructionStatusDetails.mmStatusReason);
				trace_lazy = () -> MeetingStatus.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "MeetingInstructionStatusDetails";
				definition = "Information about the status of an instruction.";
				xors_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MeetingInstructionStatusDetails.mmProcessingOrRejection);
			}
		});
		return mmObject_lazy.get();
	}

	public Status1Code getProcessingStatus() {
		return processingStatus;
	}

	public void setProcessingStatus(Status1Code processingStatus) {
		this.processingStatus = processingStatus;
	}

	public MeetingInstructionRejection1Code getRejectionStatus() {
		return rejectionStatus;
	}

	public void setRejectionStatus(MeetingInstructionRejection1Code rejectionStatus) {
		this.rejectionStatus = rejectionStatus;
	}

	public Max350Text getStatusReason() {
		return statusReason;
	}

	public void setStatusReason(Max350Text statusReason) {
		this.statusReason = statusReason;
	}
}