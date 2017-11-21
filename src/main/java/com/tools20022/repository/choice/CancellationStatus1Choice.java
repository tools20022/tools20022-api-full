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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.seev.MeetingInstructionStatusV02;
import com.tools20022.repository.entity.MeetingStatus;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CancellationProcessingStatus1;
import com.tools20022.repository.msg.CancellationRejectionStatus1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Status applying to the instruction cancellation request received.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CancellationStatus1Choice#mmProcessingStatus
 * CancellationStatus1Choice.mmProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CancellationStatus1Choice#mmRejectionStatus
 * CancellationStatus1Choice.mmRejectionStatus}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.MeetingStatus
 * MeetingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingInstructionStatusV02#mmCancellationStatus
 * MeetingInstructionStatusV02.mmCancellationStatus}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CancellationStatus1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Status applying to the instruction cancellation request received."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CancellationStatus1Choice", propOrder = {"processingStatus", "rejectionStatus"})
public class CancellationStatus1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected CancellationProcessingStatus1 processingStatus;
	/**
	 * Status advising on the processing of the cancellation request.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CancellationProcessingStatus1
	 * CancellationProcessingStatus1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.MeetingStatus#mmInstructionCancellationStatus
	 * MeetingStatus.mmInstructionCancellationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.CancellationStatus1Choice
	 * CancellationStatus1Choice}</li>
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
	 * definition} =
	 * "Status advising on the processing of the cancellation request."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmProcessingStatus = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> MeetingStatus.mmInstructionCancellationStatus;
			componentContext_lazy = () -> CancellationStatus1Choice.mmObject();
			isDerived = false;
			xmlTag = "PrcgSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessingStatus";
			definition = "Status advising on the processing of the cancellation request.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CancellationProcessingStatus1.mmObject();
		}
	};
	protected CancellationRejectionStatus1 rejectionStatus;
	/**
	 * Status advising on the rejection of the cancellation request.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CancellationRejectionStatus1
	 * CancellationRejectionStatus1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.MeetingStatus#mmReason
	 * MeetingStatus.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.CancellationStatus1Choice
	 * CancellationStatus1Choice}</li>
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
	 * "Status advising on the rejection of the cancellation request."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRejectionStatus = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> MeetingStatus.mmReason;
			componentContext_lazy = () -> CancellationStatus1Choice.mmObject();
			isDerived = false;
			xmlTag = "RjctnSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RejectionStatus";
			definition = "Status advising on the rejection of the cancellation request.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CancellationRejectionStatus1.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CancellationStatus1Choice.mmProcessingStatus, CancellationStatus1Choice.mmRejectionStatus);
				messageBuildingBlock_lazy = () -> Arrays.asList(MeetingInstructionStatusV02.mmCancellationStatus);
				trace_lazy = () -> MeetingStatus.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CancellationStatus1Choice";
				definition = "Status applying to the instruction cancellation request received.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "PrcgSts", required = true)
	public CancellationProcessingStatus1 getProcessingStatus() {
		return processingStatus;
	}

	public void setProcessingStatus(CancellationProcessingStatus1 processingStatus) {
		this.processingStatus = processingStatus;
	}

	@XmlElement(name = "RjctnSts", required = true)
	public CancellationRejectionStatus1 getRejectionStatus() {
		return rejectionStatus;
	}

	public void setRejectionStatus(CancellationRejectionStatus1 rejectionStatus) {
		this.rejectionStatus = rejectionStatus;
	}
}