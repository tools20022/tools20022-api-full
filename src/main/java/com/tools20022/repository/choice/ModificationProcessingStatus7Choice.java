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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestStatusAdviceV04;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.entity.SecuritiesTradeStatusReason;
import com.tools20022.repository.entity.Status;
import com.tools20022.repository.entity.StatusReason;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ProprietaryStatusAndReason6;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
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
 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus7Choice#mmAcknowledgedAccepted
 * ModificationProcessingStatus7Choice.mmAcknowledgedAccepted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus7Choice#mmPendingProcessing
 * ModificationProcessingStatus7Choice.mmPendingProcessing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus7Choice#mmDenied
 * ModificationProcessingStatus7Choice.mmDenied}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus7Choice#mmRejected
 * ModificationProcessingStatus7Choice.mmRejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus7Choice#mmRepaired
 * ModificationProcessingStatus7Choice.mmRepaired}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus7Choice#mmModified
 * ModificationProcessingStatus7Choice.mmModified}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus7Choice#mmProprietary
 * ModificationProcessingStatus7Choice.mmProprietary}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Status Status}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestStatusAdviceV04#mmModificationProcessingStatus
 * SecuritiesSettlementTransactionModificationRequestStatusAdviceV04.
 * mmModificationProcessingStatus}</li>
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
 * "ModificationProcessingStatus7Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice of format for the processing status."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus4Choice
 * ModificationProcessingStatus4Choice}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ModificationProcessingStatus7Choice", propOrder = {"acknowledgedAccepted", "pendingProcessing", "denied", "rejected", "repaired", "modified", "proprietary"})
public class ModificationProcessingStatus7Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "AckdAccptd", required = true)
	protected AcknowledgedAcceptedStatus23Choice acknowledgedAccepted;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.AcknowledgedAcceptedStatus23Choice
	 * AcknowledgedAcceptedStatus23Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmAcknowledgedAcceptedReason
	 * StatusReason.mmAcknowledgedAcceptedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus7Choice
	 * ModificationProcessingStatus7Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AckdAccptd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :25D::CPRC//PACK</li>
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
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus4Choice#mmAcknowledgedAccepted
	 * ModificationProcessingStatus4Choice.mmAcknowledgedAccepted}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ModificationProcessingStatus7Choice, AcknowledgedAcceptedStatus23Choice> mmAcknowledgedAccepted = new MMMessageAssociationEnd<ModificationProcessingStatus7Choice, AcknowledgedAcceptedStatus23Choice>() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmAcknowledgedAcceptedReason;
			componentContext_lazy = () -> com.tools20022.repository.choice.ModificationProcessingStatus7Choice.mmObject();
			isDerived = false;
			xmlTag = "AckdAccptd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":25D::CPRC//PACK"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcknowledgedAccepted";
			definition = "Instruction has been acknowledged by the account servicer.";
			previousVersion_lazy = () -> ModificationProcessingStatus4Choice.mmAcknowledgedAccepted;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AcknowledgedAcceptedStatus23Choice.mmObject();
		}

		@Override
		public AcknowledgedAcceptedStatus23Choice getValue(ModificationProcessingStatus7Choice obj) {
			return obj.getAcknowledgedAccepted();
		}

		@Override
		public void setValue(ModificationProcessingStatus7Choice obj, AcknowledgedAcceptedStatus23Choice value) {
			obj.setAcknowledgedAccepted(value);
		}
	};
	@XmlElement(name = "PdgPrcg", required = true)
	protected PendingProcessingStatus13Choice pendingProcessing;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingStatus13Choice
	 * PendingProcessingStatus13Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmPendingReason
	 * StatusReason.mmPendingReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus7Choice
	 * ModificationProcessingStatus7Choice}</li>
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
	 * definition} = "Modification is pending processing."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus4Choice#mmPendingProcessing
	 * ModificationProcessingStatus4Choice.mmPendingProcessing}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ModificationProcessingStatus7Choice, PendingProcessingStatus13Choice> mmPendingProcessing = new MMMessageAssociationEnd<ModificationProcessingStatus7Choice, PendingProcessingStatus13Choice>() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmPendingReason;
			componentContext_lazy = () -> com.tools20022.repository.choice.ModificationProcessingStatus7Choice.mmObject();
			isDerived = false;
			xmlTag = "PdgPrcg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingProcessing";
			definition = "Modification is pending processing.";
			previousVersion_lazy = () -> ModificationProcessingStatus4Choice.mmPendingProcessing;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PendingProcessingStatus13Choice.mmObject();
		}

		@Override
		public PendingProcessingStatus13Choice getValue(ModificationProcessingStatus7Choice obj) {
			return obj.getPendingProcessing();
		}

		@Override
		public void setValue(ModificationProcessingStatus7Choice obj, PendingProcessingStatus13Choice value) {
			obj.setPendingProcessing(value);
		}
	};
	@XmlElement(name = "Dnd", required = true)
	protected DeniedStatus15Choice denied;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.DeniedStatus15Choice
	 * DeniedStatus15Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason#mmDeniedReason
	 * SecuritiesTradeStatusReason.mmDeniedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus7Choice
	 * ModificationProcessingStatus7Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Dnd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :25D::CPRC//DEND</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Denied"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Modification request will not be executed."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus4Choice#mmDenied
	 * ModificationProcessingStatus4Choice.mmDenied}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ModificationProcessingStatus7Choice, DeniedStatus15Choice> mmDenied = new MMMessageAssociationEnd<ModificationProcessingStatus7Choice, DeniedStatus15Choice>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeStatusReason.mmDeniedReason;
			componentContext_lazy = () -> com.tools20022.repository.choice.ModificationProcessingStatus7Choice.mmObject();
			isDerived = false;
			xmlTag = "Dnd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":25D::CPRC//DEND"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Denied";
			definition = "Modification request will not be executed.";
			previousVersion_lazy = () -> ModificationProcessingStatus4Choice.mmDenied;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> DeniedStatus15Choice.mmObject();
		}

		@Override
		public DeniedStatus15Choice getValue(ModificationProcessingStatus7Choice obj) {
			return obj.getDenied();
		}

		@Override
		public void setValue(ModificationProcessingStatus7Choice obj, DeniedStatus15Choice value) {
			obj.setDenied(value);
		}
	};
	@XmlElement(name = "Rjctd", required = true)
	protected RejectionStatus18Choice rejected;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.RejectionStatus18Choice
	 * RejectionStatus18Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmRejectionReason
	 * StatusReason.mmRejectionReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus7Choice
	 * ModificationProcessingStatus7Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rjctd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rejected"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Modification request has been rejected for further processing."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus4Choice#mmRejected
	 * ModificationProcessingStatus4Choice.mmRejected}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ModificationProcessingStatus7Choice, RejectionStatus18Choice> mmRejected = new MMMessageAssociationEnd<ModificationProcessingStatus7Choice, RejectionStatus18Choice>() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmRejectionReason;
			componentContext_lazy = () -> com.tools20022.repository.choice.ModificationProcessingStatus7Choice.mmObject();
			isDerived = false;
			xmlTag = "Rjctd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rejected";
			definition = "Modification request has been rejected for further processing.";
			previousVersion_lazy = () -> ModificationProcessingStatus4Choice.mmRejected;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> RejectionStatus18Choice.mmObject();
		}

		@Override
		public RejectionStatus18Choice getValue(ModificationProcessingStatus7Choice obj) {
			return obj.getRejected();
		}

		@Override
		public void setValue(ModificationProcessingStatus7Choice obj, RejectionStatus18Choice value) {
			obj.setRejected(value);
		}
	};
	@XmlElement(name = "Rprd", required = true)
	protected RepairStatus13Choice repaired;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.RepairStatus13Choice
	 * RepairStatus13Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason#mmRepairReason
	 * SecuritiesTradeStatusReason.mmRepairReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus7Choice
	 * ModificationProcessingStatus7Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rprd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Repaired"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Modification request is accepted but in repair."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus4Choice#mmRepaired
	 * ModificationProcessingStatus4Choice.mmRepaired}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ModificationProcessingStatus7Choice, RepairStatus13Choice> mmRepaired = new MMMessageAssociationEnd<ModificationProcessingStatus7Choice, RepairStatus13Choice>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeStatusReason.mmRepairReason;
			componentContext_lazy = () -> com.tools20022.repository.choice.ModificationProcessingStatus7Choice.mmObject();
			isDerived = false;
			xmlTag = "Rprd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Repaired";
			definition = "Modification request is accepted but in repair.";
			previousVersion_lazy = () -> ModificationProcessingStatus4Choice.mmRepaired;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> RepairStatus13Choice.mmObject();
		}

		@Override
		public RepairStatus13Choice getValue(ModificationProcessingStatus7Choice obj) {
			return obj.getRepaired();
		}

		@Override
		public void setValue(ModificationProcessingStatus7Choice obj, RepairStatus13Choice value) {
			obj.setRepaired(value);
		}
	};
	@XmlElement(name = "Modfd", required = true)
	protected ModificationStatus4Choice modified;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.ModificationStatus4Choice
	 * ModificationStatus4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason#mmModifiedStatusReason
	 * SecuritiesTradeStatusReason.mmModifiedStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus7Choice
	 * ModificationProcessingStatus7Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Modfd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :25D::CPRC//CAND</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Modified"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Instruction has been modified."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus4Choice#mmModified
	 * ModificationProcessingStatus4Choice.mmModified}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ModificationProcessingStatus7Choice, ModificationStatus4Choice> mmModified = new MMMessageAttribute<ModificationProcessingStatus7Choice, ModificationStatus4Choice>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeStatusReason.mmModifiedStatusReason;
			componentContext_lazy = () -> com.tools20022.repository.choice.ModificationProcessingStatus7Choice.mmObject();
			isDerived = false;
			xmlTag = "Modfd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":25D::CPRC//CAND"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Modified";
			definition = "Instruction has been modified.";
			previousVersion_lazy = () -> ModificationProcessingStatus4Choice.mmModified;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> ModificationStatus4Choice.mmObject();
		}

		@Override
		public ModificationStatus4Choice getValue(ModificationProcessingStatus7Choice obj) {
			return obj.getModified();
		}

		@Override
		public void setValue(ModificationProcessingStatus7Choice obj, ModificationStatus4Choice value) {
			obj.setModified(value);
		}
	};
	@XmlElement(name = "Prtry", required = true)
	protected ProprietaryStatusAndReason6 proprietary;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ProprietaryStatusAndReason6
	 * ProprietaryStatusAndReason6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Status Status}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus7Choice
	 * ModificationProcessingStatus7Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Prtry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :25D::CPRC/4!c[4c]/4!c</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Proprietary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Proprietary status."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus4Choice#mmProprietary
	 * ModificationProcessingStatus4Choice.mmProprietary}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ModificationProcessingStatus7Choice, ProprietaryStatusAndReason6> mmProprietary = new MMMessageAssociationEnd<ModificationProcessingStatus7Choice, ProprietaryStatusAndReason6>() {
		{
			businessComponentTrace_lazy = () -> Status.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.ModificationProcessingStatus7Choice.mmObject();
			isDerived = false;
			xmlTag = "Prtry";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":25D::CPRC/4!c[4c]/4!c"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Proprietary";
			definition = "Proprietary status.";
			previousVersion_lazy = () -> ModificationProcessingStatus4Choice.mmProprietary;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ProprietaryStatusAndReason6.mmObject();
		}

		@Override
		public ProprietaryStatusAndReason6 getValue(ModificationProcessingStatus7Choice obj) {
			return obj.getProprietary();
		}

		@Override
		public void setValue(ModificationProcessingStatus7Choice obj, ProprietaryStatusAndReason6 value) {
			obj.setProprietary(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.ModificationProcessingStatus7Choice.mmAcknowledgedAccepted,
						com.tools20022.repository.choice.ModificationProcessingStatus7Choice.mmPendingProcessing, com.tools20022.repository.choice.ModificationProcessingStatus7Choice.mmDenied,
						com.tools20022.repository.choice.ModificationProcessingStatus7Choice.mmRejected, com.tools20022.repository.choice.ModificationProcessingStatus7Choice.mmRepaired,
						com.tools20022.repository.choice.ModificationProcessingStatus7Choice.mmModified, com.tools20022.repository.choice.ModificationProcessingStatus7Choice.mmProprietary);
				messageBuildingBlock_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionModificationRequestStatusAdviceV04.mmModificationProcessingStatus);
				trace_lazy = () -> Status.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ModificationProcessingStatus7Choice";
				definition = "Choice of format for the processing status.";
				previousVersion_lazy = () -> ModificationProcessingStatus4Choice.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public AcknowledgedAcceptedStatus23Choice getAcknowledgedAccepted() {
		return acknowledgedAccepted;
	}

	public ModificationProcessingStatus7Choice setAcknowledgedAccepted(AcknowledgedAcceptedStatus23Choice acknowledgedAccepted) {
		this.acknowledgedAccepted = Objects.requireNonNull(acknowledgedAccepted);
		return this;
	}

	public PendingProcessingStatus13Choice getPendingProcessing() {
		return pendingProcessing;
	}

	public ModificationProcessingStatus7Choice setPendingProcessing(PendingProcessingStatus13Choice pendingProcessing) {
		this.pendingProcessing = Objects.requireNonNull(pendingProcessing);
		return this;
	}

	public DeniedStatus15Choice getDenied() {
		return denied;
	}

	public ModificationProcessingStatus7Choice setDenied(DeniedStatus15Choice denied) {
		this.denied = Objects.requireNonNull(denied);
		return this;
	}

	public RejectionStatus18Choice getRejected() {
		return rejected;
	}

	public ModificationProcessingStatus7Choice setRejected(RejectionStatus18Choice rejected) {
		this.rejected = Objects.requireNonNull(rejected);
		return this;
	}

	public RepairStatus13Choice getRepaired() {
		return repaired;
	}

	public ModificationProcessingStatus7Choice setRepaired(RepairStatus13Choice repaired) {
		this.repaired = Objects.requireNonNull(repaired);
		return this;
	}

	public ModificationStatus4Choice getModified() {
		return modified;
	}

	public ModificationProcessingStatus7Choice setModified(ModificationStatus4Choice modified) {
		this.modified = Objects.requireNonNull(modified);
		return this;
	}

	public ProprietaryStatusAndReason6 getProprietary() {
		return proprietary;
	}

	public ModificationProcessingStatus7Choice setProprietary(ProprietaryStatusAndReason6 proprietary) {
		this.proprietary = Objects.requireNonNull(proprietary);
		return this;
	}
}