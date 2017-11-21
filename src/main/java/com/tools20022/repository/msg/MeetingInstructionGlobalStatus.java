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
import com.tools20022.metamodel.MMXor;
import com.tools20022.repository.codeset.MeetingInstructionCancellationStatus1Code;
import com.tools20022.repository.codeset.MeetingInstructionRejection1Code;
import com.tools20022.repository.codeset.Status1Code;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.entity.MeetingStatus;
import com.tools20022.repository.entity.Status;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Unique status applying to a meeting instruction message and therefore to each
 * instruction contained in the message.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponent#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingInstructionGlobalStatus#mmProcessingOrRejectionOrCancellationStatus
 * MeetingInstructionGlobalStatus.mmProcessingOrRejectionOrCancellationStatus}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingInstructionGlobalStatus#mmProcessingStatus
 * MeetingInstructionGlobalStatus.mmProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingInstructionGlobalStatus#mmRejectionStatus
 * MeetingInstructionGlobalStatus.mmRejectionStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingInstructionGlobalStatus#mmCancellationStatus
 * MeetingInstructionGlobalStatus.mmCancellationStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingInstructionGlobalStatus#mmStatusReason
 * MeetingInstructionGlobalStatus.mmStatusReason}</li>
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
 * "MeetingInstructionGlobalStatus"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Unique status applying to a meeting instruction message and therefore to each instruction contained in the message."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "MeetingInstructionGlobalStatus", propOrder = {"processingStatus", "rejectionStatus", "cancellationStatus", "statusReason"})
public class MeetingInstructionGlobalStatus {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Status1Code processingStatus;
	/**
	 * Status on the processing of the instructions.
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
	 * {@linkplain com.tools20022.repository.msg.MeetingInstructionGlobalStatus
	 * MeetingInstructionGlobalStatus}</li>
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
	 * definition} = "Status on the processing of the instructions."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmProcessingStatus = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Status.mmInstructionProcessingStatus;
			componentContext_lazy = () -> MeetingInstructionGlobalStatus.mmObject();
			isDerived = false;
			xmlTag = "PrcgSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessingStatus";
			definition = "Status on the processing of the instructions.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Status1Code.mmObject();
		}
	};
	protected MeetingInstructionRejection1Code rejectionStatus;
	/**
	 * Status advising the rejection of the meeting instruction message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.MeetingInstructionRejection1Code
	 * MeetingInstructionRejection1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.MeetingStatus MeetingStatus}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MeetingInstructionGlobalStatus
	 * MeetingInstructionGlobalStatus}</li>
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
	 * definition} =
	 * "Status advising the rejection of the meeting instruction message."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRejectionStatus = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> MeetingStatus.mmObject();
			componentContext_lazy = () -> MeetingInstructionGlobalStatus.mmObject();
			isDerived = false;
			xmlTag = "RjctnSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RejectionStatus";
			definition = "Status advising the rejection of the meeting instruction message.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> MeetingInstructionRejection1Code.mmObject();
		}
	};
	protected MeetingInstructionCancellationStatus1Code cancellationStatus;
	/**
	 * Status of the request for cancellation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.MeetingInstructionCancellationStatus1Code
	 * MeetingInstructionCancellationStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.MeetingStatus MeetingStatus}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MeetingInstructionGlobalStatus
	 * MeetingInstructionGlobalStatus}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CxlSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of the request for cancellation."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCancellationStatus = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> MeetingStatus.mmObject();
			componentContext_lazy = () -> MeetingInstructionGlobalStatus.mmObject();
			isDerived = false;
			xmlTag = "CxlSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationStatus";
			definition = "Status of the request for cancellation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> MeetingInstructionCancellationStatus1Code.mmObject();
		}
	};
	protected Max350Text statusReason;
	/**
	 * Additional information about the status.
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
	 * {@linkplain com.tools20022.repository.entity.Status#mmStatusReason
	 * Status.mmStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MeetingInstructionGlobalStatus
	 * MeetingInstructionGlobalStatus}</li>
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
	 * definition} = "Additional information about the status."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmStatusReason = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Status.mmStatusReason;
			componentContext_lazy = () -> MeetingInstructionGlobalStatus.mmObject();
			isDerived = false;
			xmlTag = "StsRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusReason";
			definition = "Additional information about the status.";
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
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.MeetingInstructionGlobalStatus
	 * MeetingInstructionGlobalStatus}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingInstructionGlobalStatus#mmProcessingStatus
	 * MeetingInstructionGlobalStatus.mmProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingInstructionGlobalStatus#mmRejectionStatus
	 * MeetingInstructionGlobalStatus.mmRejectionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingInstructionGlobalStatus#mmCancellationStatus
	 * MeetingInstructionGlobalStatus.mmCancellationStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProcessingOrRejectionOrCancellationStatus"</li>
	 * </ul>
	 */
	public static final MMXor mmProcessingOrRejectionOrCancellationStatus = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessingOrRejectionOrCancellationStatus";
			messageComponent_lazy = () -> MeetingInstructionGlobalStatus.mmObject();
			impactedElements_lazy = () -> Arrays.asList(MeetingInstructionGlobalStatus.mmProcessingStatus, MeetingInstructionGlobalStatus.mmRejectionStatus, MeetingInstructionGlobalStatus.mmCancellationStatus);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(MeetingInstructionGlobalStatus.mmProcessingStatus, MeetingInstructionGlobalStatus.mmRejectionStatus, MeetingInstructionGlobalStatus.mmCancellationStatus,
						MeetingInstructionGlobalStatus.mmStatusReason);
				trace_lazy = () -> MeetingStatus.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "MeetingInstructionGlobalStatus";
				definition = "Unique status applying to a meeting instruction message and therefore to each instruction contained in the message.";
				xors_lazy = () -> Arrays.asList(MeetingInstructionGlobalStatus.mmProcessingOrRejectionOrCancellationStatus);
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "PrcgSts", required = true)
	public Status1Code getProcessingStatus() {
		return processingStatus;
	}

	public void setProcessingStatus(Status1Code processingStatus) {
		this.processingStatus = processingStatus;
	}

	@XmlElement(name = "RjctnSts", required = true)
	public MeetingInstructionRejection1Code getRejectionStatus() {
		return rejectionStatus;
	}

	public void setRejectionStatus(MeetingInstructionRejection1Code rejectionStatus) {
		this.rejectionStatus = rejectionStatus;
	}

	@XmlElement(name = "CxlSts", required = true)
	public MeetingInstructionCancellationStatus1Code getCancellationStatus() {
		return cancellationStatus;
	}

	public void setCancellationStatus(MeetingInstructionCancellationStatus1Code cancellationStatus) {
		this.cancellationStatus = cancellationStatus;
	}

	@XmlElement(name = "StsRsn")
	public Max350Text getStatusReason() {
		return statusReason;
	}

	public void setStatusReason(Max350Text statusReason) {
		this.statusReason = statusReason;
	}
}