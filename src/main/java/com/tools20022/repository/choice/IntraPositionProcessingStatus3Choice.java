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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.semt.IntraPositionMovementStatusAdviceV03;
import com.tools20022.repository.choice.AcknowledgedAcceptedStatus7Choice;
import com.tools20022.repository.choice.CancellationStatus7Choice;
import com.tools20022.repository.choice.RejectionOrRepairStatus15Choice;
import com.tools20022.repository.entity.SecuritiesTradeStatusReason;
import com.tools20022.repository.entity.StatusReason;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ProprietaryStatusAndReason1;
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
 * {@linkplain com.tools20022.repository.choice.IntraPositionProcessingStatus3Choice#mmRejected
 * IntraPositionProcessingStatus3Choice.mmRejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.IntraPositionProcessingStatus3Choice#mmRepair
 * IntraPositionProcessingStatus3Choice.mmRepair}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.IntraPositionProcessingStatus3Choice#mmCancelled
 * IntraPositionProcessingStatus3Choice.mmCancelled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.IntraPositionProcessingStatus3Choice#mmAcknowledgedAccepted
 * IntraPositionProcessingStatus3Choice.mmAcknowledgedAccepted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.IntraPositionProcessingStatus3Choice#mmProprietary
 * IntraPositionProcessingStatus3Choice.mmProprietary}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason
 * SecuritiesTradeStatusReason}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementStatusAdviceV03#mmProcessingStatus
 * IntraPositionMovementStatusAdviceV03.mmProcessingStatus}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "IntraPositionProcessingStatus3Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice of format for the processing status."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.IntraPositionProcessingStatus5Choice
 * IntraPositionProcessingStatus5Choice}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.choice.IntraPositionProcessingStatus1Choice
 * IntraPositionProcessingStatus1Choice}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "IntraPositionProcessingStatus3Choice", propOrder = {"rejected", "repair", "cancelled", "acknowledgedAccepted", "proprietary"})
public class IntraPositionProcessingStatus3Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Rjctd", required = true)
	protected RejectionOrRepairStatus15Choice rejected;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus15Choice
	 * RejectionOrRepairStatus15Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason
	 * SecuritiesTradeStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.IntraPositionProcessingStatus3Choice
	 * IntraPositionProcessingStatus3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rjctd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rejected"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instruction/Request has been rejected for further processing."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :25D::IPRC//REJT</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IntraPositionProcessingStatus5Choice#mmRejected
	 * IntraPositionProcessingStatus5Choice.mmRejected}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<IntraPositionProcessingStatus3Choice, RejectionOrRepairStatus15Choice> mmRejected = new MMMessageAssociationEnd<IntraPositionProcessingStatus3Choice, RejectionOrRepairStatus15Choice>() {
		{
			businessComponentTrace_lazy = () -> SecuritiesTradeStatusReason.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.IntraPositionProcessingStatus3Choice.mmObject();
			isDerived = false;
			xmlTag = "Rjctd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":25D::IPRC//REJT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rejected";
			definition = "Instruction/Request has been rejected for further processing.";
			nextVersions_lazy = () -> Arrays.asList(IntraPositionProcessingStatus5Choice.mmRejected);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> RejectionOrRepairStatus15Choice.mmObject();
		}

		@Override
		public RejectionOrRepairStatus15Choice getValue(IntraPositionProcessingStatus3Choice obj) {
			return obj.getRejected();
		}

		@Override
		public void setValue(IntraPositionProcessingStatus3Choice obj, RejectionOrRepairStatus15Choice value) {
			obj.setRejected(value);
		}
	};
	@XmlElement(name = "Rpr", required = true)
	protected RejectionOrRepairStatus15Choice repair;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus15Choice
	 * RejectionOrRepairStatus15Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason
	 * SecuritiesTradeStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.IntraPositionProcessingStatus3Choice
	 * IntraPositionProcessingStatus3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rpr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Repair"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Instruction/Request is accepted but in repair."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :25D::IPRC//REPR</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IntraPositionProcessingStatus5Choice#mmRepair
	 * IntraPositionProcessingStatus5Choice.mmRepair}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<IntraPositionProcessingStatus3Choice, RejectionOrRepairStatus15Choice> mmRepair = new MMMessageAssociationEnd<IntraPositionProcessingStatus3Choice, RejectionOrRepairStatus15Choice>() {
		{
			businessComponentTrace_lazy = () -> SecuritiesTradeStatusReason.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.IntraPositionProcessingStatus3Choice.mmObject();
			isDerived = false;
			xmlTag = "Rpr";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":25D::IPRC//REPR"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Repair";
			definition = "Instruction/Request is accepted but in repair.";
			nextVersions_lazy = () -> Arrays.asList(IntraPositionProcessingStatus5Choice.mmRepair);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> RejectionOrRepairStatus15Choice.mmObject();
		}

		@Override
		public RejectionOrRepairStatus15Choice getValue(IntraPositionProcessingStatus3Choice obj) {
			return obj.getRepair();
		}

		@Override
		public void setValue(IntraPositionProcessingStatus3Choice obj, RejectionOrRepairStatus15Choice value) {
			obj.setRepair(value);
		}
	};
	@XmlElement(name = "Canc", required = true)
	protected CancellationStatus7Choice cancelled;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.CancellationStatus7Choice
	 * CancellationStatus7Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmCancellationReason
	 * StatusReason.mmCancellationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.IntraPositionProcessingStatus3Choice
	 * IntraPositionProcessingStatus3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Canc"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cancelled"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instruction has been cancelled (only as an response to an SecuritiesTransactionStatusQuery). The status on the processing of a cancellation request must be provided using a SecuritiesTransactionCancellationRequestStatusAdvice."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :25D::IPRC//CAND</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IntraPositionProcessingStatus5Choice#mmCancelled
	 * IntraPositionProcessingStatus5Choice.mmCancelled}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<IntraPositionProcessingStatus3Choice, CancellationStatus7Choice> mmCancelled = new MMMessageAssociationEnd<IntraPositionProcessingStatus3Choice, CancellationStatus7Choice>() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmCancellationReason;
			componentContext_lazy = () -> com.tools20022.repository.choice.IntraPositionProcessingStatus3Choice.mmObject();
			isDerived = false;
			xmlTag = "Canc";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":25D::IPRC//CAND"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cancelled";
			definition = "Instruction has been cancelled (only as an response to an SecuritiesTransactionStatusQuery). The status on the processing of a cancellation request must be provided using a SecuritiesTransactionCancellationRequestStatusAdvice.";
			nextVersions_lazy = () -> Arrays.asList(IntraPositionProcessingStatus5Choice.mmCancelled);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CancellationStatus7Choice.mmObject();
		}

		@Override
		public CancellationStatus7Choice getValue(IntraPositionProcessingStatus3Choice obj) {
			return obj.getCancelled();
		}

		@Override
		public void setValue(IntraPositionProcessingStatus3Choice obj, CancellationStatus7Choice value) {
			obj.setCancelled(value);
		}
	};
	@XmlElement(name = "AckdAccptd", required = true)
	protected AcknowledgedAcceptedStatus7Choice acknowledgedAccepted;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.AcknowledgedAcceptedStatus7Choice
	 * AcknowledgedAcceptedStatus7Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmAcknowledgedAcceptedReason
	 * StatusReason.mmAcknowledgedAcceptedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.IntraPositionProcessingStatus3Choice
	 * IntraPositionProcessingStatus3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AckdAccptd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcknowledgedAccepted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instruction has been acknowledged by the account servicer."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :25D::IPRC//PACK</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IntraPositionProcessingStatus5Choice#mmAcknowledgedAccepted
	 * IntraPositionProcessingStatus5Choice.mmAcknowledgedAccepted}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<IntraPositionProcessingStatus3Choice, AcknowledgedAcceptedStatus7Choice> mmAcknowledgedAccepted = new MMMessageAssociationEnd<IntraPositionProcessingStatus3Choice, AcknowledgedAcceptedStatus7Choice>() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmAcknowledgedAcceptedReason;
			componentContext_lazy = () -> com.tools20022.repository.choice.IntraPositionProcessingStatus3Choice.mmObject();
			isDerived = false;
			xmlTag = "AckdAccptd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":25D::IPRC//PACK"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcknowledgedAccepted";
			definition = "Instruction has been acknowledged by the account servicer.";
			nextVersions_lazy = () -> Arrays.asList(IntraPositionProcessingStatus5Choice.mmAcknowledgedAccepted);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AcknowledgedAcceptedStatus7Choice.mmObject();
		}

		@Override
		public AcknowledgedAcceptedStatus7Choice getValue(IntraPositionProcessingStatus3Choice obj) {
			return obj.getAcknowledgedAccepted();
		}

		@Override
		public void setValue(IntraPositionProcessingStatus3Choice obj, AcknowledgedAcceptedStatus7Choice value) {
			obj.setAcknowledgedAccepted(value);
		}
	};
	@XmlElement(name = "Prtry", required = true)
	protected ProprietaryStatusAndReason1 proprietary;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ProprietaryStatusAndReason1
	 * ProprietaryStatusAndReason1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmStatus
	 * StatusReason.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.IntraPositionProcessingStatus3Choice
	 * IntraPositionProcessingStatus3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Prtry"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Proprietary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies a choice of status for the processing of an intra-position movement."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :25D::IPRC/4!c[4c]/4!c</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IntraPositionProcessingStatus5Choice#mmProprietary
	 * IntraPositionProcessingStatus5Choice.mmProprietary}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<IntraPositionProcessingStatus3Choice, ProprietaryStatusAndReason1> mmProprietary = new MMMessageAssociationEnd<IntraPositionProcessingStatus3Choice, ProprietaryStatusAndReason1>() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmStatus;
			componentContext_lazy = () -> com.tools20022.repository.choice.IntraPositionProcessingStatus3Choice.mmObject();
			isDerived = false;
			xmlTag = "Prtry";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":25D::IPRC/4!c[4c]/4!c"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Proprietary";
			definition = "Specifies a choice of status for the processing of an intra-position movement.";
			nextVersions_lazy = () -> Arrays.asList(IntraPositionProcessingStatus5Choice.mmProprietary);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ProprietaryStatusAndReason1.mmObject();
		}

		@Override
		public ProprietaryStatusAndReason1 getValue(IntraPositionProcessingStatus3Choice obj) {
			return obj.getProprietary();
		}

		@Override
		public void setValue(IntraPositionProcessingStatus3Choice obj, ProprietaryStatusAndReason1 value) {
			obj.setProprietary(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.IntraPositionProcessingStatus3Choice.mmRejected, com.tools20022.repository.choice.IntraPositionProcessingStatus3Choice.mmRepair,
						com.tools20022.repository.choice.IntraPositionProcessingStatus3Choice.mmCancelled, com.tools20022.repository.choice.IntraPositionProcessingStatus3Choice.mmAcknowledgedAccepted,
						com.tools20022.repository.choice.IntraPositionProcessingStatus3Choice.mmProprietary);
				messageBuildingBlock_lazy = () -> Arrays.asList(IntraPositionMovementStatusAdviceV03.mmProcessingStatus);
				trace_lazy = () -> SecuritiesTradeStatusReason.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "IntraPositionProcessingStatus3Choice";
				definition = "Choice of format for the processing status.";
				nextVersions_lazy = () -> Arrays.asList(IntraPositionProcessingStatus5Choice.mmObject());
				previousVersion_lazy = () -> IntraPositionProcessingStatus1Choice.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public RejectionOrRepairStatus15Choice getRejected() {
		return rejected;
	}

	public IntraPositionProcessingStatus3Choice setRejected(RejectionOrRepairStatus15Choice rejected) {
		this.rejected = Objects.requireNonNull(rejected);
		return this;
	}

	public RejectionOrRepairStatus15Choice getRepair() {
		return repair;
	}

	public IntraPositionProcessingStatus3Choice setRepair(RejectionOrRepairStatus15Choice repair) {
		this.repair = Objects.requireNonNull(repair);
		return this;
	}

	public CancellationStatus7Choice getCancelled() {
		return cancelled;
	}

	public IntraPositionProcessingStatus3Choice setCancelled(CancellationStatus7Choice cancelled) {
		this.cancelled = Objects.requireNonNull(cancelled);
		return this;
	}

	public AcknowledgedAcceptedStatus7Choice getAcknowledgedAccepted() {
		return acknowledgedAccepted;
	}

	public IntraPositionProcessingStatus3Choice setAcknowledgedAccepted(AcknowledgedAcceptedStatus7Choice acknowledgedAccepted) {
		this.acknowledgedAccepted = Objects.requireNonNull(acknowledgedAccepted);
		return this;
	}

	public ProprietaryStatusAndReason1 getProprietary() {
		return proprietary;
	}

	public IntraPositionProcessingStatus3Choice setProprietary(ProprietaryStatusAndReason1 proprietary) {
		this.proprietary = Objects.requireNonNull(proprietary);
		return this;
	}
}