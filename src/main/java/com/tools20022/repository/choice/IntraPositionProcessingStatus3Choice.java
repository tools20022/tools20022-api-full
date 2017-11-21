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
import com.tools20022.repository.area.semt.IntraPositionMovementStatusAdviceV03;
import com.tools20022.repository.entity.SecuritiesTradeStatusReason;
import com.tools20022.repository.entity.StatusReason;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ProprietaryStatusAndReason1;
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "IntraPositionProcessingStatus3Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice of format for the processing status."</li>
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
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "IntraPositionProcessingStatus3Choice", propOrder = {"rejected", "repair", "cancelled", "acknowledgedAccepted", "proprietary"})
public class IntraPositionProcessingStatus3Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected RejectionOrRepairStatus15Choice rejected;
	/**
	 * Instruction/Request has been rejected for further processing.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rejected"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instruction/Request has been rejected for further processing."</li>
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
	public static final MMMessageAssociationEnd mmRejected = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> SecuritiesTradeStatusReason.mmObject();
			componentContext_lazy = () -> IntraPositionProcessingStatus3Choice.mmObject();
			isDerived = false;
			xmlTag = "Rjctd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rejected";
			definition = "Instruction/Request has been rejected for further processing.";
			nextVersions_lazy = () -> Arrays.asList(IntraPositionProcessingStatus5Choice.mmRejected);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.RejectionOrRepairStatus15Choice.mmObject();
		}
	};
	protected RejectionOrRepairStatus15Choice repair;
	/**
	 * Instruction/Request is accepted but in repair.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Repair"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Instruction/Request is accepted but in repair."</li>
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
	public static final MMMessageAssociationEnd mmRepair = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> SecuritiesTradeStatusReason.mmObject();
			componentContext_lazy = () -> IntraPositionProcessingStatus3Choice.mmObject();
			isDerived = false;
			xmlTag = "Rpr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Repair";
			definition = "Instruction/Request is accepted but in repair.";
			nextVersions_lazy = () -> Arrays.asList(IntraPositionProcessingStatus5Choice.mmRepair);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.RejectionOrRepairStatus15Choice.mmObject();
		}
	};
	protected CancellationStatus7Choice cancelled;
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
	public static final MMMessageAssociationEnd mmCancelled = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmCancellationReason;
			componentContext_lazy = () -> IntraPositionProcessingStatus3Choice.mmObject();
			isDerived = false;
			xmlTag = "Canc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cancelled";
			definition = "Instruction has been cancelled (only as an response to an SecuritiesTransactionStatusQuery). The status on the processing of a cancellation request must be provided using a SecuritiesTransactionCancellationRequestStatusAdvice.";
			nextVersions_lazy = () -> Arrays.asList(IntraPositionProcessingStatus5Choice.mmCancelled);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.CancellationStatus7Choice.mmObject();
		}
	};
	protected AcknowledgedAcceptedStatus7Choice acknowledgedAccepted;
	/**
	 * Instruction has been acknowledged by the account servicer.
	 * <p>
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
	public static final MMMessageAssociationEnd mmAcknowledgedAccepted = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmAcknowledgedAcceptedReason;
			componentContext_lazy = () -> IntraPositionProcessingStatus3Choice.mmObject();
			isDerived = false;
			xmlTag = "AckdAccptd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcknowledgedAccepted";
			definition = "Instruction has been acknowledged by the account servicer.";
			nextVersions_lazy = () -> Arrays.asList(IntraPositionProcessingStatus5Choice.mmAcknowledgedAccepted);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.AcknowledgedAcceptedStatus7Choice.mmObject();
		}
	};
	protected ProprietaryStatusAndReason1 proprietary;
	/**
	 * Specifies a choice of status for the processing of an intra-position
	 * movement.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Proprietary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies a choice of status for the processing of an intra-position movement."
	 * </li>
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
	public static final MMMessageAssociationEnd mmProprietary = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmStatus;
			componentContext_lazy = () -> IntraPositionProcessingStatus3Choice.mmObject();
			isDerived = false;
			xmlTag = "Prtry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Proprietary";
			definition = "Specifies a choice of status for the processing of an intra-position movement.";
			nextVersions_lazy = () -> Arrays.asList(IntraPositionProcessingStatus5Choice.mmProprietary);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ProprietaryStatusAndReason1.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(IntraPositionProcessingStatus3Choice.mmRejected, IntraPositionProcessingStatus3Choice.mmRepair, IntraPositionProcessingStatus3Choice.mmCancelled,
						IntraPositionProcessingStatus3Choice.mmAcknowledgedAccepted, IntraPositionProcessingStatus3Choice.mmProprietary);
				messageBuildingBlock_lazy = () -> Arrays.asList(IntraPositionMovementStatusAdviceV03.mmProcessingStatus);
				trace_lazy = () -> SecuritiesTradeStatusReason.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "IntraPositionProcessingStatus3Choice";
				definition = "Choice of format for the processing status.";
				nextVersions_lazy = () -> Arrays.asList(IntraPositionProcessingStatus5Choice.mmObject());
				previousVersion_lazy = () -> IntraPositionProcessingStatus1Choice.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Rjctd", required = true)
	public RejectionOrRepairStatus15Choice getRejected() {
		return rejected;
	}

	public void setRejected(com.tools20022.repository.choice.RejectionOrRepairStatus15Choice rejected) {
		this.rejected = rejected;
	}

	@XmlElement(name = "Rpr", required = true)
	public RejectionOrRepairStatus15Choice getRepair() {
		return repair;
	}

	public void setRepair(com.tools20022.repository.choice.RejectionOrRepairStatus15Choice repair) {
		this.repair = repair;
	}

	@XmlElement(name = "Canc", required = true)
	public CancellationStatus7Choice getCancelled() {
		return cancelled;
	}

	public void setCancelled(com.tools20022.repository.choice.CancellationStatus7Choice cancelled) {
		this.cancelled = cancelled;
	}

	@XmlElement(name = "AckdAccptd", required = true)
	public AcknowledgedAcceptedStatus7Choice getAcknowledgedAccepted() {
		return acknowledgedAccepted;
	}

	public void setAcknowledgedAccepted(com.tools20022.repository.choice.AcknowledgedAcceptedStatus7Choice acknowledgedAccepted) {
		this.acknowledgedAccepted = acknowledgedAccepted;
	}

	@XmlElement(name = "Prtry", required = true)
	public ProprietaryStatusAndReason1 getProprietary() {
		return proprietary;
	}

	public void setProprietary(ProprietaryStatusAndReason1 proprietary) {
		this.proprietary = proprietary;
	}
}