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
import com.tools20022.repository.msg.ProprietaryReason2;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice of format for the instruction processing status.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus17Choice#mmPendingProcessing
 * InstructionProcessingStatus17Choice.mmPendingProcessing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus17Choice#mmCancellationRequested
 * InstructionProcessingStatus17Choice.mmCancellationRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus17Choice#mmAcknowledgedAccepted
 * InstructionProcessingStatus17Choice.mmAcknowledgedAccepted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus17Choice#mmCancelled
 * InstructionProcessingStatus17Choice.mmCancelled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus17Choice#mmGenerated
 * InstructionProcessingStatus17Choice.mmGenerated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus17Choice#mmRepair
 * InstructionProcessingStatus17Choice.mmRepair}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus17Choice#mmPendingCancellation
 * InstructionProcessingStatus17Choice.mmPendingCancellation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus17Choice#mmModificationRequested
 * InstructionProcessingStatus17Choice.mmModificationRequested}</li>
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
 * "InstructionProcessingStatus17Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice of format for the instruction processing status."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "InstructionProcessingStatus17Choice", propOrder = {"pendingProcessing", "cancellationRequested", "acknowledgedAccepted", "cancelled", "generated", "repair", "pendingCancellation", "modificationRequested"})
public class InstructionProcessingStatus17Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected PendingProcessingStatus9Choice pendingProcessing;
	/**
	 * Processing of the instruction/request is pending.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingStatus9Choice
	 * PendingProcessingStatus9Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmPendingReason
	 * StatusReason.mmPendingReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus17Choice
	 * InstructionProcessingStatus17Choice}</li>
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
			componentContext_lazy = () -> InstructionProcessingStatus17Choice.mmObject();
			isDerived = false;
			xmlTag = "PdgPrcg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingProcessing";
			definition = "Processing of the instruction/request is pending.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.PendingProcessingStatus9Choice.mmObject();
		}
	};
	protected ProprietaryReason2 cancellationRequested;
	/**
	 * Cancellation request from your counterparty for this transaction is
	 * pending waiting for your cancellation request.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ProprietaryReason2
	 * ProprietaryReason2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmCancellationReason
	 * StatusReason.mmCancellationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus17Choice
	 * InstructionProcessingStatus17Choice}</li>
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
			businessElementTrace_lazy = () -> StatusReason.mmCancellationReason;
			componentContext_lazy = () -> InstructionProcessingStatus17Choice.mmObject();
			isDerived = false;
			xmlTag = "CxlReqd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationRequested";
			definition = "Cancellation request from your counterparty for this transaction is pending waiting for your cancellation request.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ProprietaryReason2.mmObject();
		}
	};
	protected AcknowledgedAcceptedStatus20Choice acknowledgedAccepted;
	/**
	 * Instruction has been acknowledged by the account servicer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.AcknowledgedAcceptedStatus20Choice
	 * AcknowledgedAcceptedStatus20Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmAcknowledgedAcceptedReason
	 * StatusReason.mmAcknowledgedAcceptedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus17Choice
	 * InstructionProcessingStatus17Choice}</li>
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
			componentContext_lazy = () -> InstructionProcessingStatus17Choice.mmObject();
			isDerived = false;
			xmlTag = "AckdAccptd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcknowledgedAccepted";
			definition = "Instruction has been acknowledged by the account servicer.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.AcknowledgedAcceptedStatus20Choice.mmObject();
		}
	};
	protected CancellationStatus11Choice cancelled;
	/**
	 * Instruction has been cancelled (only as an response to an
	 * SecuritiesTransactionStatusQuery). The status on the processing of a
	 * cancellation request must be provided using a
	 * SecuritiesTransactionCancellationRequestStatusAdvice.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.CancellationStatus11Choice
	 * CancellationStatus11Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmCancellationReason
	 * StatusReason.mmCancellationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus17Choice
	 * InstructionProcessingStatus17Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Canc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cancelled"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instruction has been cancelled (only as an response to an SecuritiesTransactionStatusQuery). The status on the processing of a cancellation request must be provided using a SecuritiesTransactionCancellationRequestStatusAdvice."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCancelled = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmCancellationReason;
			componentContext_lazy = () -> InstructionProcessingStatus17Choice.mmObject();
			isDerived = false;
			xmlTag = "Canc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cancelled";
			definition = "Instruction has been cancelled (only as an response to an SecuritiesTransactionStatusQuery). The status on the processing of a cancellation request must be provided using a SecuritiesTransactionCancellationRequestStatusAdvice.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.CancellationStatus11Choice.mmObject();
		}
	};
	protected GeneratedStatus6Choice generated;
	/**
	 * The transaction was created by the account servicer or a third party. It
	 * was not instructed directly by the account owner.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.GeneratedStatus6Choice
	 * GeneratedStatus6Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason#mmGeneratedReason
	 * SecuritiesTradeStatusReason.mmGeneratedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus17Choice
	 * InstructionProcessingStatus17Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Gnrtd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Generated"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The transaction was created by the account servicer or a third party. It was not instructed directly by the account owner."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmGenerated = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeStatusReason.mmGeneratedReason;
			componentContext_lazy = () -> InstructionProcessingStatus17Choice.mmObject();
			isDerived = false;
			xmlTag = "Gnrtd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Generated";
			definition = "The transaction was created by the account servicer or a third party. It was not instructed directly by the account owner.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.GeneratedStatus6Choice.mmObject();
		}
	};
	protected RepairStatus10Choice repair;
	/**
	 * Instruction/Request is accepted but in repair.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.RepairStatus10Choice
	 * RepairStatus10Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason#mmRepairReason
	 * SecuritiesTradeStatusReason.mmRepairReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus17Choice
	 * InstructionProcessingStatus17Choice}</li>
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
			componentContext_lazy = () -> InstructionProcessingStatus17Choice.mmObject();
			isDerived = false;
			xmlTag = "Rpr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Repair";
			definition = "Instruction/Request is accepted but in repair.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.RepairStatus10Choice.mmObject();
		}
	};
	protected PendingStatus24Choice pendingCancellation;
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
	 * {@linkplain com.tools20022.repository.choice.PendingStatus24Choice
	 * PendingStatus24Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmPendingReason
	 * StatusReason.mmPendingReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus17Choice
	 * InstructionProcessingStatus17Choice}</li>
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
			componentContext_lazy = () -> InstructionProcessingStatus17Choice.mmObject();
			isDerived = false;
			xmlTag = "PdgCxl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingCancellation";
			definition = "A cancellation request from yourself for this instruction is pending waiting for further processing (only as an response to an SecuritiesTransactionStatusQuery). The pending status on the processing of a cancellation request must be provided using a SecuritiesTransactionCancellationRequestStatusAdvice.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.PendingStatus24Choice.mmObject();
		}
	};
	protected ProprietaryReason2 modificationRequested;
	/**
	 * Modification request from your counterparty for this transaction is
	 * pending waiting for your cancellation request or your consent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ProprietaryReason2
	 * ProprietaryReason2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason
	 * SecuritiesTradeStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus17Choice
	 * InstructionProcessingStatus17Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ModReqd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ModificationRequested"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Modification request from your counterparty for this transaction is pending waiting for your cancellation request or your consent."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmModificationRequested = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> SecuritiesTradeStatusReason.mmObject();
			componentContext_lazy = () -> InstructionProcessingStatus17Choice.mmObject();
			isDerived = false;
			xmlTag = "ModReqd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ModificationRequested";
			definition = "Modification request from your counterparty for this transaction is pending waiting for your cancellation request or your consent.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ProprietaryReason2.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(InstructionProcessingStatus17Choice.mmPendingProcessing, InstructionProcessingStatus17Choice.mmCancellationRequested, InstructionProcessingStatus17Choice.mmAcknowledgedAccepted,
						InstructionProcessingStatus17Choice.mmCancelled, InstructionProcessingStatus17Choice.mmGenerated, InstructionProcessingStatus17Choice.mmRepair, InstructionProcessingStatus17Choice.mmPendingCancellation,
						InstructionProcessingStatus17Choice.mmModificationRequested);
				trace_lazy = () -> SecuritiesTradeStatusReason.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InstructionProcessingStatus17Choice";
				definition = "Choice of format for the instruction processing status.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "PdgPrcg", required = true)
	public PendingProcessingStatus9Choice getPendingProcessing() {
		return pendingProcessing;
	}

	public void setPendingProcessing(com.tools20022.repository.choice.PendingProcessingStatus9Choice pendingProcessing) {
		this.pendingProcessing = pendingProcessing;
	}

	@XmlElement(name = "CxlReqd", required = true)
	public ProprietaryReason2 getCancellationRequested() {
		return cancellationRequested;
	}

	public void setCancellationRequested(ProprietaryReason2 cancellationRequested) {
		this.cancellationRequested = cancellationRequested;
	}

	@XmlElement(name = "AckdAccptd", required = true)
	public AcknowledgedAcceptedStatus20Choice getAcknowledgedAccepted() {
		return acknowledgedAccepted;
	}

	public void setAcknowledgedAccepted(com.tools20022.repository.choice.AcknowledgedAcceptedStatus20Choice acknowledgedAccepted) {
		this.acknowledgedAccepted = acknowledgedAccepted;
	}

	@XmlElement(name = "Canc", required = true)
	public CancellationStatus11Choice getCancelled() {
		return cancelled;
	}

	public void setCancelled(com.tools20022.repository.choice.CancellationStatus11Choice cancelled) {
		this.cancelled = cancelled;
	}

	@XmlElement(name = "Gnrtd", required = true)
	public GeneratedStatus6Choice getGenerated() {
		return generated;
	}

	public void setGenerated(com.tools20022.repository.choice.GeneratedStatus6Choice generated) {
		this.generated = generated;
	}

	@XmlElement(name = "Rpr", required = true)
	public RepairStatus10Choice getRepair() {
		return repair;
	}

	public void setRepair(com.tools20022.repository.choice.RepairStatus10Choice repair) {
		this.repair = repair;
	}

	@XmlElement(name = "PdgCxl", required = true)
	public PendingStatus24Choice getPendingCancellation() {
		return pendingCancellation;
	}

	public void setPendingCancellation(com.tools20022.repository.choice.PendingStatus24Choice pendingCancellation) {
		this.pendingCancellation = pendingCancellation;
	}

	@XmlElement(name = "ModReqd", required = true)
	public ProprietaryReason2 getModificationRequested() {
		return modificationRequested;
	}

	public void setModificationRequested(ProprietaryReason2 modificationRequested) {
		this.modificationRequested = modificationRequested;
	}
}