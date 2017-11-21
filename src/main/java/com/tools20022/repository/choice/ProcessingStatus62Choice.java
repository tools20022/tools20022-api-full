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
import com.tools20022.repository.entity.SecuritiesTradeStatusReason;
import com.tools20022.repository.entity.StatusReason;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ProprietaryReason5;
import com.tools20022.repository.msg.ProprietaryStatusAndReason7;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice of format for the processing status.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus62Choice#mmAcknowledgedAccepted
 * ProcessingStatus62Choice.mmAcknowledgedAccepted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus62Choice#mmPendingProcessing
 * ProcessingStatus62Choice.mmPendingProcessing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus62Choice#mmRepair
 * ProcessingStatus62Choice.mmRepair}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus62Choice#mmPendingCancellation
 * ProcessingStatus62Choice.mmPendingCancellation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus62Choice#mmProprietary
 * ProcessingStatus62Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus62Choice#mmCancellationRequested
 * ProcessingStatus62Choice.mmCancellationRequested}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason
 * SecuritiesTradeStatusReason}</li>
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
 * "ProcessingStatus62Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice of format for the processing status."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "ProcessingStatus62Choice", propOrder = {"acknowledgedAccepted", "pendingProcessing", "repair", "pendingCancellation", "proprietary", "cancellationRequested"})
public class ProcessingStatus62Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected AcknowledgedAcceptedStatus25Choice acknowledgedAccepted;
	/**
	 * Instruction has been acknowledged by the account servicer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.AcknowledgedAcceptedStatus25Choice
	 * AcknowledgedAcceptedStatus25Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmAcknowledgedAcceptedReason
	 * StatusReason.mmAcknowledgedAcceptedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus62Choice
	 * ProcessingStatus62Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AckdAccptd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcknowledgedAccepted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instruction has been acknowledged by the account servicer."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAcknowledgedAccepted = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmAcknowledgedAcceptedReason;
			componentContext_lazy = () -> ProcessingStatus62Choice.mmObject();
			isDerived = false;
			xmlTag = "AckdAccptd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcknowledgedAccepted";
			definition = "Instruction has been acknowledged by the account servicer.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.AcknowledgedAcceptedStatus25Choice.mmObject();
		}
	};
	protected PendingProcessingStatus15Choice pendingProcessing;
	/**
	 * Processing of the instruction/request is pending.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingStatus15Choice
	 * PendingProcessingStatus15Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmPendingReason
	 * StatusReason.mmPendingReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus62Choice
	 * ProcessingStatus62Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PdgPrcg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingProcessing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Processing of the instruction/request is pending."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPendingProcessing = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmPendingReason;
			componentContext_lazy = () -> ProcessingStatus62Choice.mmObject();
			isDerived = false;
			xmlTag = "PdgPrcg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingProcessing";
			definition = "Processing of the instruction/request is pending.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.PendingProcessingStatus15Choice.mmObject();
		}
	};
	protected RepairStatus16Choice repair;
	/**
	 * Instruction/Request is accepted but in repair.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.RepairStatus16Choice
	 * RepairStatus16Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason#mmRepairReason
	 * SecuritiesTradeStatusReason.mmRepairReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus62Choice
	 * ProcessingStatus62Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rpr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Repair"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Instruction/Request is accepted but in repair."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRepair = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeStatusReason.mmRepairReason;
			componentContext_lazy = () -> ProcessingStatus62Choice.mmObject();
			isDerived = false;
			xmlTag = "Rpr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Repair";
			definition = "Instruction/Request is accepted but in repair.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.RepairStatus16Choice.mmObject();
		}
	};
	protected PendingStatus46Choice pendingCancellation;
	/**
	 * A cancellation request from yourself for this instruction is pending
	 * waiting for further processing (only as an response to an
	 * SecuritiesTransactionStatusQuery). The pending status on the processing
	 * of a cancellation request must be provided using a
	 * SecuritiesTransactionCancellationRequestStatusAdvice.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PendingStatus46Choice
	 * PendingStatus46Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmPendingReason
	 * StatusReason.mmPendingReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus62Choice
	 * ProcessingStatus62Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PdgCxl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingCancellation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "A cancellation request from yourself for this instruction is pending waiting for further processing (only as an response to an SecuritiesTransactionStatusQuery). The pending status on the processing of a cancellation request must be provided using a SecuritiesTransactionCancellationRequestStatusAdvice."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPendingCancellation = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmPendingReason;
			componentContext_lazy = () -> ProcessingStatus62Choice.mmObject();
			isDerived = false;
			xmlTag = "PdgCxl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingCancellation";
			definition = "A cancellation request from yourself for this instruction is pending waiting for further processing (only as an response to an SecuritiesTransactionStatusQuery). The pending status on the processing of a cancellation request must be provided using a SecuritiesTransactionCancellationRequestStatusAdvice.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.PendingStatus46Choice.mmObject();
		}
	};
	protected ProprietaryStatusAndReason7 proprietary;
	/**
	 * Status that cannot be reported using one of the available standard
	 * status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ProprietaryStatusAndReason7
	 * ProprietaryStatusAndReason7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason
	 * SecuritiesTradeStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus62Choice
	 * ProcessingStatus62Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Prtry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Proprietary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Status that cannot be reported using one of the available standard status."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmProprietary = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> SecuritiesTradeStatusReason.mmObject();
			componentContext_lazy = () -> ProcessingStatus62Choice.mmObject();
			isDerived = false;
			xmlTag = "Prtry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Proprietary";
			definition = "Status that cannot be reported using one of the available standard status.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ProprietaryStatusAndReason7.mmObject();
		}
	};
	protected ProprietaryReason5 cancellationRequested;
	/**
	 * Cancellation request from your counterparty for this transaction is
	 * pending waiting for your cancellation request.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ProprietaryReason5
	 * ProprietaryReason5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason
	 * SecuritiesTradeStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus62Choice
	 * ProcessingStatus62Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CxlReqd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationRequested"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cancellation request from your counterparty for this transaction is pending waiting for your cancellation request."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCancellationRequested = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> SecuritiesTradeStatusReason.mmObject();
			componentContext_lazy = () -> ProcessingStatus62Choice.mmObject();
			isDerived = false;
			xmlTag = "CxlReqd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationRequested";
			definition = "Cancellation request from your counterparty for this transaction is pending waiting for your cancellation request.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ProprietaryReason5.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(ProcessingStatus62Choice.mmAcknowledgedAccepted, ProcessingStatus62Choice.mmPendingProcessing, ProcessingStatus62Choice.mmRepair, ProcessingStatus62Choice.mmPendingCancellation,
						ProcessingStatus62Choice.mmProprietary, ProcessingStatus62Choice.mmCancellationRequested);
				trace_lazy = () -> SecuritiesTradeStatusReason.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ProcessingStatus62Choice";
				definition = "Choice of format for the processing status.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "AckdAccptd", required = true)
	public AcknowledgedAcceptedStatus25Choice getAcknowledgedAccepted() {
		return acknowledgedAccepted;
	}

	public void setAcknowledgedAccepted(com.tools20022.repository.choice.AcknowledgedAcceptedStatus25Choice acknowledgedAccepted) {
		this.acknowledgedAccepted = acknowledgedAccepted;
	}

	@XmlElement(name = "PdgPrcg", required = true)
	public PendingProcessingStatus15Choice getPendingProcessing() {
		return pendingProcessing;
	}

	public void setPendingProcessing(com.tools20022.repository.choice.PendingProcessingStatus15Choice pendingProcessing) {
		this.pendingProcessing = pendingProcessing;
	}

	@XmlElement(name = "Rpr", required = true)
	public RepairStatus16Choice getRepair() {
		return repair;
	}

	public void setRepair(com.tools20022.repository.choice.RepairStatus16Choice repair) {
		this.repair = repair;
	}

	@XmlElement(name = "PdgCxl", required = true)
	public PendingStatus46Choice getPendingCancellation() {
		return pendingCancellation;
	}

	public void setPendingCancellation(com.tools20022.repository.choice.PendingStatus46Choice pendingCancellation) {
		this.pendingCancellation = pendingCancellation;
	}

	@XmlElement(name = "Prtry", required = true)
	public ProprietaryStatusAndReason7 getProprietary() {
		return proprietary;
	}

	public void setProprietary(ProprietaryStatusAndReason7 proprietary) {
		this.proprietary = proprietary;
	}

	@XmlElement(name = "CxlReqd", required = true)
	public ProprietaryReason5 getCancellationRequested() {
		return cancellationRequested;
	}

	public void setCancellationRequested(ProprietaryReason5 cancellationRequested) {
		this.cancellationRequested = cancellationRequested;
	}
}