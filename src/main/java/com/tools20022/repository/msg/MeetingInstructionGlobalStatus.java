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
import java.util.Objects;
import java.util.Optional;
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
 * {@linkplain com.tools20022.repository.msg.MeetingInstructionGlobalStatus#ProcessingOrRejectionOrCancellationStatus
 * MeetingInstructionGlobalStatus.ProcessingOrRejectionOrCancellationStatus}</li>
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MeetingInstructionGlobalStatus"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Unique status applying to a meeting instruction message and therefore to each instruction contained in the message."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "MeetingInstructionGlobalStatus", propOrder = {"processingStatus", "rejectionStatus", "cancellationStatus", "statusReason"})
public class MeetingInstructionGlobalStatus {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PrcgSts", required = true)
	protected Status1Code processingStatus;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProcessingStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status on the processing of the instructions."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MeetingInstructionGlobalStatus, Status1Code> mmProcessingStatus = new MMMessageAttribute<MeetingInstructionGlobalStatus, Status1Code>() {
		{
			businessElementTrace_lazy = () -> Status.mmInstructionProcessingStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.MeetingInstructionGlobalStatus.mmObject();
			isDerived = false;
			xmlTag = "PrcgSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessingStatus";
			definition = "Status on the processing of the instructions.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Status1Code.mmObject();
		}

		@Override
		public Status1Code getValue(MeetingInstructionGlobalStatus obj) {
			return obj.getProcessingStatus();
		}

		@Override
		public void setValue(MeetingInstructionGlobalStatus obj, Status1Code value) {
			obj.setProcessingStatus(value);
		}
	};
	@XmlElement(name = "RjctnSts", required = true)
	protected MeetingInstructionRejection1Code rejectionStatus;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RejectionStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Status advising the rejection of the meeting instruction message."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MeetingInstructionGlobalStatus, MeetingInstructionRejection1Code> mmRejectionStatus = new MMMessageAttribute<MeetingInstructionGlobalStatus, MeetingInstructionRejection1Code>() {
		{
			businessComponentTrace_lazy = () -> MeetingStatus.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.MeetingInstructionGlobalStatus.mmObject();
			isDerived = false;
			xmlTag = "RjctnSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RejectionStatus";
			definition = "Status advising the rejection of the meeting instruction message.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> MeetingInstructionRejection1Code.mmObject();
		}

		@Override
		public MeetingInstructionRejection1Code getValue(MeetingInstructionGlobalStatus obj) {
			return obj.getRejectionStatus();
		}

		@Override
		public void setValue(MeetingInstructionGlobalStatus obj, MeetingInstructionRejection1Code value) {
			obj.setRejectionStatus(value);
		}
	};
	@XmlElement(name = "CxlSts", required = true)
	protected MeetingInstructionCancellationStatus1Code cancellationStatus;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of the request for cancellation."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MeetingInstructionGlobalStatus, MeetingInstructionCancellationStatus1Code> mmCancellationStatus = new MMMessageAttribute<MeetingInstructionGlobalStatus, MeetingInstructionCancellationStatus1Code>() {
		{
			businessComponentTrace_lazy = () -> MeetingStatus.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.MeetingInstructionGlobalStatus.mmObject();
			isDerived = false;
			xmlTag = "CxlSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationStatus";
			definition = "Status of the request for cancellation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> MeetingInstructionCancellationStatus1Code.mmObject();
		}

		@Override
		public MeetingInstructionCancellationStatus1Code getValue(MeetingInstructionGlobalStatus obj) {
			return obj.getCancellationStatus();
		}

		@Override
		public void setValue(MeetingInstructionGlobalStatus obj, MeetingInstructionCancellationStatus1Code value) {
			obj.setCancellationStatus(value);
		}
	};
	@XmlElement(name = "StsRsn")
	protected Max350Text statusReason;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Additional information about the status."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MeetingInstructionGlobalStatus, Optional<Max350Text>> mmStatusReason = new MMMessageAttribute<MeetingInstructionGlobalStatus, Optional<Max350Text>>() {
		{
			businessElementTrace_lazy = () -> Status.mmStatusReason;
			componentContext_lazy = () -> com.tools20022.repository.msg.MeetingInstructionGlobalStatus.mmObject();
			isDerived = false;
			xmlTag = "StsRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusReason";
			definition = "Additional information about the status.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Optional<Max350Text> getValue(MeetingInstructionGlobalStatus obj) {
			return obj.getStatusReason();
		}

		@Override
		public void setValue(MeetingInstructionGlobalStatus obj, Optional<Max350Text> value) {
			obj.setStatusReason(value.orElse(null));
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProcessingOrRejectionOrCancellationStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMXor ProcessingOrRejectionOrCancellationStatus = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessingOrRejectionOrCancellationStatus";
			messageComponent_lazy = () -> com.tools20022.repository.msg.MeetingInstructionGlobalStatus.mmObject();
			impactedElements_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MeetingInstructionGlobalStatus.mmProcessingStatus, com.tools20022.repository.msg.MeetingInstructionGlobalStatus.mmRejectionStatus,
					com.tools20022.repository.msg.MeetingInstructionGlobalStatus.mmCancellationStatus);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MeetingInstructionGlobalStatus.mmProcessingStatus, com.tools20022.repository.msg.MeetingInstructionGlobalStatus.mmRejectionStatus,
						com.tools20022.repository.msg.MeetingInstructionGlobalStatus.mmCancellationStatus, com.tools20022.repository.msg.MeetingInstructionGlobalStatus.mmStatusReason);
				trace_lazy = () -> MeetingStatus.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "MeetingInstructionGlobalStatus";
				definition = "Unique status applying to a meeting instruction message and therefore to each instruction contained in the message.";
				xors_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MeetingInstructionGlobalStatus.ProcessingOrRejectionOrCancellationStatus);
			}
		});
		return mmObject_lazy.get();
	}

	public Status1Code getProcessingStatus() {
		return processingStatus;
	}

	public MeetingInstructionGlobalStatus setProcessingStatus(Status1Code processingStatus) {
		this.processingStatus = Objects.requireNonNull(processingStatus);
		return this;
	}

	public MeetingInstructionRejection1Code getRejectionStatus() {
		return rejectionStatus;
	}

	public MeetingInstructionGlobalStatus setRejectionStatus(MeetingInstructionRejection1Code rejectionStatus) {
		this.rejectionStatus = Objects.requireNonNull(rejectionStatus);
		return this;
	}

	public MeetingInstructionCancellationStatus1Code getCancellationStatus() {
		return cancellationStatus;
	}

	public MeetingInstructionGlobalStatus setCancellationStatus(MeetingInstructionCancellationStatus1Code cancellationStatus) {
		this.cancellationStatus = Objects.requireNonNull(cancellationStatus);
		return this;
	}

	public Optional<Max350Text> getStatusReason() {
		return statusReason == null ? Optional.empty() : Optional.of(statusReason);
	}

	public MeetingInstructionGlobalStatus setStatusReason(Max350Text statusReason) {
		this.statusReason = statusReason;
		return this;
	}
}