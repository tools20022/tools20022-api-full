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
import com.tools20022.repository.msg.ProprietaryReason4;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
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
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus22Choice#mmPendingProcessing
 * InstructionProcessingStatus22Choice.mmPendingProcessing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus22Choice#mmCancellationRequested
 * InstructionProcessingStatus22Choice.mmCancellationRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus22Choice#mmAcknowledgedAccepted
 * InstructionProcessingStatus22Choice.mmAcknowledgedAccepted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus22Choice#mmCancelled
 * InstructionProcessingStatus22Choice.mmCancelled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus22Choice#mmGenerated
 * InstructionProcessingStatus22Choice.mmGenerated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus22Choice#mmRepair
 * InstructionProcessingStatus22Choice.mmRepair}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus22Choice#mmPendingCancellation
 * InstructionProcessingStatus22Choice.mmPendingCancellation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus22Choice#mmModificationRequested
 * InstructionProcessingStatus22Choice.mmModificationRequested}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason
 * SecuritiesTradeStatusReason}</li>
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
 * "InstructionProcessingStatus22Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice of format for the instruction processing status."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus14Choice
 * InstructionProcessingStatus14Choice}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "InstructionProcessingStatus22Choice", propOrder = {"pendingProcessing", "cancellationRequested", "acknowledgedAccepted", "cancelled", "generated", "repair", "pendingCancellation", "modificationRequested"})
public class InstructionProcessingStatus22Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PdgPrcg", required = true)
	protected PendingProcessingStatus11Choice pendingProcessing;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingStatus11Choice
	 * PendingProcessingStatus11Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmPendingReason
	 * StatusReason.mmPendingReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus22Choice
	 * InstructionProcessingStatus22Choice}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus14Choice#mmPendingProcessing
	 * InstructionProcessingStatus14Choice.mmPendingProcessing}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPendingProcessing = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmPendingReason;
			componentContext_lazy = () -> com.tools20022.repository.choice.InstructionProcessingStatus22Choice.mmObject();
			isDerived = false;
			xmlTag = "PdgPrcg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingProcessing";
			definition = "Processing of the instruction/request is pending.";
			previousVersion_lazy = () -> InstructionProcessingStatus14Choice.mmPendingProcessing;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.PendingProcessingStatus11Choice.mmObject();
		}
	};
	@XmlElement(name = "CxlReqd", required = true)
	protected ProprietaryReason4 cancellationRequested;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ProprietaryReason4
	 * ProprietaryReason4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmCancellationReason
	 * StatusReason.mmCancellationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus22Choice
	 * InstructionProcessingStatus22Choice}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus14Choice#mmCancellationRequested
	 * InstructionProcessingStatus14Choice.mmCancellationRequested}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCancellationRequested = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmCancellationReason;
			componentContext_lazy = () -> com.tools20022.repository.choice.InstructionProcessingStatus22Choice.mmObject();
			isDerived = false;
			xmlTag = "CxlReqd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationRequested";
			definition = "Cancellation request from your counterparty for this transaction is pending waiting for your cancellation request.";
			previousVersion_lazy = () -> InstructionProcessingStatus14Choice.mmCancellationRequested;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ProprietaryReason4.mmObject();
		}
	};
	@XmlElement(name = "AckdAccptd", required = true)
	protected AcknowledgedAcceptedStatus21Choice acknowledgedAccepted;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.AcknowledgedAcceptedStatus21Choice
	 * AcknowledgedAcceptedStatus21Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmAcknowledgedAcceptedReason
	 * StatusReason.mmAcknowledgedAcceptedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus22Choice
	 * InstructionProcessingStatus22Choice}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus14Choice#mmAcknowledgedAccepted
	 * InstructionProcessingStatus14Choice.mmAcknowledgedAccepted}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAcknowledgedAccepted = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmAcknowledgedAcceptedReason;
			componentContext_lazy = () -> com.tools20022.repository.choice.InstructionProcessingStatus22Choice.mmObject();
			isDerived = false;
			xmlTag = "AckdAccptd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcknowledgedAccepted";
			definition = "Instruction has been acknowledged by the account servicer.";
			previousVersion_lazy = () -> InstructionProcessingStatus14Choice.mmAcknowledgedAccepted;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.AcknowledgedAcceptedStatus21Choice.mmObject();
		}
	};
	@XmlElement(name = "Canc", required = true)
	protected CancellationStatus14Choice cancelled;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.CancellationStatus14Choice
	 * CancellationStatus14Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmCancellationReason
	 * StatusReason.mmCancellationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus22Choice
	 * InstructionProcessingStatus22Choice}</li>
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
	 * definition} = "Instruction has been cancelled."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus14Choice#mmCancelled
	 * InstructionProcessingStatus14Choice.mmCancelled}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCancelled = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmCancellationReason;
			componentContext_lazy = () -> com.tools20022.repository.choice.InstructionProcessingStatus22Choice.mmObject();
			isDerived = false;
			xmlTag = "Canc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cancelled";
			definition = "Instruction has been cancelled.";
			previousVersion_lazy = () -> InstructionProcessingStatus14Choice.mmCancelled;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.CancellationStatus14Choice.mmObject();
		}
	};
	@XmlElement(name = "Gnrtd", required = true)
	protected GeneratedStatus7Choice generated;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.GeneratedStatus7Choice
	 * GeneratedStatus7Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason#mmGeneratedReason
	 * SecuritiesTradeStatusReason.mmGeneratedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus22Choice
	 * InstructionProcessingStatus22Choice}</li>
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
	 * "Transaction was created by the account servicer or a third party. It was not instructed directly by the account owner."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus14Choice#mmGenerated
	 * InstructionProcessingStatus14Choice.mmGenerated}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmGenerated = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeStatusReason.mmGeneratedReason;
			componentContext_lazy = () -> com.tools20022.repository.choice.InstructionProcessingStatus22Choice.mmObject();
			isDerived = false;
			xmlTag = "Gnrtd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Generated";
			definition = "Transaction was created by the account servicer or a third party. It was not instructed directly by the account owner.";
			previousVersion_lazy = () -> InstructionProcessingStatus14Choice.mmGenerated;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.GeneratedStatus7Choice.mmObject();
		}
	};
	@XmlElement(name = "Rpr", required = true)
	protected RepairStatus12Choice repair;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.RepairStatus12Choice
	 * RepairStatus12Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason#mmRepairReason
	 * SecuritiesTradeStatusReason.mmRepairReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus22Choice
	 * InstructionProcessingStatus22Choice}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus14Choice#mmRepair
	 * InstructionProcessingStatus14Choice.mmRepair}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRepair = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeStatusReason.mmRepairReason;
			componentContext_lazy = () -> com.tools20022.repository.choice.InstructionProcessingStatus22Choice.mmObject();
			isDerived = false;
			xmlTag = "Rpr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Repair";
			definition = "Instruction/Request is accepted but in repair.";
			previousVersion_lazy = () -> InstructionProcessingStatus14Choice.mmRepair;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.RepairStatus12Choice.mmObject();
		}
	};
	@XmlElement(name = "PdgCxl", required = true)
	protected PendingStatus38Choice pendingCancellation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PendingStatus38Choice
	 * PendingStatus38Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmPendingReason
	 * StatusReason.mmPendingReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus22Choice
	 * InstructionProcessingStatus22Choice}</li>
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
	 * "Cancellation request from yourself for this instruction is pending waiting for further processing."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus14Choice#mmPendingCancellation
	 * InstructionProcessingStatus14Choice.mmPendingCancellation}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPendingCancellation = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmPendingReason;
			componentContext_lazy = () -> com.tools20022.repository.choice.InstructionProcessingStatus22Choice.mmObject();
			isDerived = false;
			xmlTag = "PdgCxl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingCancellation";
			definition = "Cancellation request from yourself for this instruction is pending waiting for further processing.";
			previousVersion_lazy = () -> InstructionProcessingStatus14Choice.mmPendingCancellation;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.PendingStatus38Choice.mmObject();
		}
	};
	@XmlElement(name = "ModReqd", required = true)
	protected ProprietaryReason4 modificationRequested;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ProprietaryReason4
	 * ProprietaryReason4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason
	 * SecuritiesTradeStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus22Choice
	 * InstructionProcessingStatus22Choice}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus14Choice#mmModificationRequested
	 * InstructionProcessingStatus14Choice.mmModificationRequested}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmModificationRequested = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> SecuritiesTradeStatusReason.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.InstructionProcessingStatus22Choice.mmObject();
			isDerived = false;
			xmlTag = "ModReqd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ModificationRequested";
			definition = "Modification request from your counterparty for this transaction is pending waiting for your cancellation request or your consent.";
			previousVersion_lazy = () -> InstructionProcessingStatus14Choice.mmModificationRequested;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ProprietaryReason4.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.InstructionProcessingStatus22Choice.mmPendingProcessing,
						com.tools20022.repository.choice.InstructionProcessingStatus22Choice.mmCancellationRequested, com.tools20022.repository.choice.InstructionProcessingStatus22Choice.mmAcknowledgedAccepted,
						com.tools20022.repository.choice.InstructionProcessingStatus22Choice.mmCancelled, com.tools20022.repository.choice.InstructionProcessingStatus22Choice.mmGenerated,
						com.tools20022.repository.choice.InstructionProcessingStatus22Choice.mmRepair, com.tools20022.repository.choice.InstructionProcessingStatus22Choice.mmPendingCancellation,
						com.tools20022.repository.choice.InstructionProcessingStatus22Choice.mmModificationRequested);
				trace_lazy = () -> SecuritiesTradeStatusReason.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InstructionProcessingStatus22Choice";
				definition = "Choice of format for the instruction processing status.";
				previousVersion_lazy = () -> InstructionProcessingStatus14Choice.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public PendingProcessingStatus11Choice getPendingProcessing() {
		return pendingProcessing;
	}

	public InstructionProcessingStatus22Choice setPendingProcessing(com.tools20022.repository.choice.PendingProcessingStatus11Choice pendingProcessing) {
		this.pendingProcessing = Objects.requireNonNull(pendingProcessing);
		return this;
	}

	public ProprietaryReason4 getCancellationRequested() {
		return cancellationRequested;
	}

	public InstructionProcessingStatus22Choice setCancellationRequested(ProprietaryReason4 cancellationRequested) {
		this.cancellationRequested = Objects.requireNonNull(cancellationRequested);
		return this;
	}

	public AcknowledgedAcceptedStatus21Choice getAcknowledgedAccepted() {
		return acknowledgedAccepted;
	}

	public InstructionProcessingStatus22Choice setAcknowledgedAccepted(com.tools20022.repository.choice.AcknowledgedAcceptedStatus21Choice acknowledgedAccepted) {
		this.acknowledgedAccepted = Objects.requireNonNull(acknowledgedAccepted);
		return this;
	}

	public CancellationStatus14Choice getCancelled() {
		return cancelled;
	}

	public InstructionProcessingStatus22Choice setCancelled(com.tools20022.repository.choice.CancellationStatus14Choice cancelled) {
		this.cancelled = Objects.requireNonNull(cancelled);
		return this;
	}

	public GeneratedStatus7Choice getGenerated() {
		return generated;
	}

	public InstructionProcessingStatus22Choice setGenerated(com.tools20022.repository.choice.GeneratedStatus7Choice generated) {
		this.generated = Objects.requireNonNull(generated);
		return this;
	}

	public RepairStatus12Choice getRepair() {
		return repair;
	}

	public InstructionProcessingStatus22Choice setRepair(com.tools20022.repository.choice.RepairStatus12Choice repair) {
		this.repair = Objects.requireNonNull(repair);
		return this;
	}

	public PendingStatus38Choice getPendingCancellation() {
		return pendingCancellation;
	}

	public InstructionProcessingStatus22Choice setPendingCancellation(com.tools20022.repository.choice.PendingStatus38Choice pendingCancellation) {
		this.pendingCancellation = Objects.requireNonNull(pendingCancellation);
		return this;
	}

	public ProprietaryReason4 getModificationRequested() {
		return modificationRequested;
	}

	public InstructionProcessingStatus22Choice setModificationRequested(ProprietaryReason4 modificationRequested) {
		this.modificationRequested = Objects.requireNonNull(modificationRequested);
		return this;
	}
}