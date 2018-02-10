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
import com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestStatusAdviceV03;
import com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestStatusAdviceV04;
import com.tools20022.repository.entity.CorporateActionStatus;
import com.tools20022.repository.entity.CorporateActionStatusReason;
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
 * Choice between different instruction cancellation request statuses.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus5Choice#mmCancellationCompleted
 * InstructionCancellationRequestStatus5Choice.mmCancellationCompleted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus5Choice#mmAccepted
 * InstructionCancellationRequestStatus5Choice.mmAccepted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus5Choice#mmRejected
 * InstructionCancellationRequestStatus5Choice.mmRejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus5Choice#mmPendingCancellation
 * InstructionCancellationRequestStatus5Choice.mmPendingCancellation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus5Choice#mmProprietaryStatus
 * InstructionCancellationRequestStatus5Choice.mmProprietaryStatus}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CorporateActionStatus
 * CorporateActionStatus}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestStatusAdviceV03#mmInstructionCancellationRequestStatus
 * CorporateActionInstructionCancellationRequestStatusAdviceV03.
 * mmInstructionCancellationRequestStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestStatusAdviceV04#mmInstructionCancellationRequestStatus
 * CorporateActionInstructionCancellationRequestStatusAdviceV04.
 * mmInstructionCancellationRequestStatus}</li>
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
 * "InstructionCancellationRequestStatus5Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice between different instruction cancellation request statuses."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus7Choice
 * InstructionCancellationRequestStatus7Choice}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus3Choice
 * InstructionCancellationRequestStatus3Choice}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "InstructionCancellationRequestStatus5Choice", propOrder = {"cancellationCompleted", "accepted", "rejected", "pendingCancellation", "proprietaryStatus"})
public class InstructionCancellationRequestStatus5Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "CxlCmpltd", required = true)
	protected CancelledStatus3Choice cancellationCompleted;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.CancelledStatus3Choice
	 * CancelledStatus3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmCancellationReason
	 * StatusReason.mmCancellationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus5Choice
	 * InstructionCancellationRequestStatus5Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CxlCmpltd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :25D::CPRC//CAND</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationCompleted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides status information related to a instruction cancellation request completed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus7Choice#mmCancellationCompleted
	 * InstructionCancellationRequestStatus7Choice.mmCancellationCompleted}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCancellationCompleted = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmCancellationReason;
			componentContext_lazy = () -> com.tools20022.repository.choice.InstructionCancellationRequestStatus5Choice.mmObject();
			isDerived = false;
			xmlTag = "CxlCmpltd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":25D::CPRC//CAND"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationCompleted";
			definition = "Provides status information related to a instruction cancellation request completed.";
			nextVersions_lazy = () -> Arrays.asList(InstructionCancellationRequestStatus7Choice.mmCancellationCompleted);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.CancelledStatus3Choice.mmObject();
		}
	};
	@XmlElement(name = "Accptd", required = true)
	protected AcceptedStatus1Choice accepted;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.AcceptedStatus1Choice
	 * AcceptedStatus1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionStatusReason#mmAcceptedReason
	 * CorporateActionStatusReason.mmAcceptedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus5Choice
	 * InstructionCancellationRequestStatus5Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Accptd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :25D::CPRC//PACK</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Accepted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides status information related to a cancellation request accepted for further processing."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus7Choice#mmAccepted
	 * InstructionCancellationRequestStatus7Choice.mmAccepted}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAccepted = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionStatusReason.mmAcceptedReason;
			componentContext_lazy = () -> com.tools20022.repository.choice.InstructionCancellationRequestStatus5Choice.mmObject();
			isDerived = false;
			xmlTag = "Accptd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":25D::CPRC//PACK"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Accepted";
			definition = "Provides status information related to a cancellation request accepted for further processing.";
			nextVersions_lazy = () -> Arrays.asList(InstructionCancellationRequestStatus7Choice.mmAccepted);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.AcceptedStatus1Choice.mmObject();
		}
	};
	@XmlElement(name = "Rjctd", required = true)
	protected RejectedStatus1Choice rejected;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.RejectedStatus1Choice
	 * RejectedStatus1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmRejectionReason
	 * StatusReason.mmRejectionReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus5Choice
	 * InstructionCancellationRequestStatus5Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rjctd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :25D::CPRC//REJT</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rejected"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides status information related to a cancellation request rejected for further processing due to system (data) reasons."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus7Choice#mmRejected
	 * InstructionCancellationRequestStatus7Choice.mmRejected}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRejected = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmRejectionReason;
			componentContext_lazy = () -> com.tools20022.repository.choice.InstructionCancellationRequestStatus5Choice.mmObject();
			isDerived = false;
			xmlTag = "Rjctd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":25D::CPRC//REJT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rejected";
			definition = "Provides status information related to a cancellation request rejected for further processing due to system (data) reasons.";
			nextVersions_lazy = () -> Arrays.asList(InstructionCancellationRequestStatus7Choice.mmRejected);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.RejectedStatus1Choice.mmObject();
		}
	};
	@XmlElement(name = "PdgCxl", required = true)
	protected PendingCancellationStatus3Choice pendingCancellation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PendingCancellationStatus3Choice
	 * PendingCancellationStatus3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmPendingReason
	 * StatusReason.mmPendingReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus5Choice
	 * InstructionCancellationRequestStatus5Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PdgCxl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :25D::CPRC//CANP</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingCancellation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides status information related to a pending cancellation request."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus7Choice#mmPendingCancellation
	 * InstructionCancellationRequestStatus7Choice.mmPendingCancellation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPendingCancellation = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmPendingReason;
			componentContext_lazy = () -> com.tools20022.repository.choice.InstructionCancellationRequestStatus5Choice.mmObject();
			isDerived = false;
			xmlTag = "PdgCxl";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":25D::CPRC//CANP"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingCancellation";
			definition = "Provides status information related to a pending cancellation request.";
			nextVersions_lazy = () -> Arrays.asList(InstructionCancellationRequestStatus7Choice.mmPendingCancellation);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.PendingCancellationStatus3Choice.mmObject();
		}
	};
	@XmlElement(name = "PrtrySts", required = true)
	protected ProprietaryStatusAndReason1 proprietaryStatus;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus
	 * CorporateActionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus5Choice
	 * InstructionCancellationRequestStatus5Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtrySts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :25D::CPRC/[8c]/4!c</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProprietaryStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Proprietary status related to an instruction cancellation request."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus7Choice#mmProprietaryStatus
	 * InstructionCancellationRequestStatus7Choice.mmProprietaryStatus}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmProprietaryStatus = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> CorporateActionStatus.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.InstructionCancellationRequestStatus5Choice.mmObject();
			isDerived = false;
			xmlTag = "PrtrySts";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":25D::CPRC/[8c]/4!c"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProprietaryStatus";
			definition = "Proprietary status related to an instruction cancellation request.";
			nextVersions_lazy = () -> Arrays.asList(InstructionCancellationRequestStatus7Choice.mmProprietaryStatus);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ProprietaryStatusAndReason1.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.InstructionCancellationRequestStatus5Choice.mmCancellationCompleted,
						com.tools20022.repository.choice.InstructionCancellationRequestStatus5Choice.mmAccepted, com.tools20022.repository.choice.InstructionCancellationRequestStatus5Choice.mmRejected,
						com.tools20022.repository.choice.InstructionCancellationRequestStatus5Choice.mmPendingCancellation, com.tools20022.repository.choice.InstructionCancellationRequestStatus5Choice.mmProprietaryStatus);
				messageBuildingBlock_lazy = () -> Arrays.asList(CorporateActionInstructionCancellationRequestStatusAdviceV03.mmInstructionCancellationRequestStatus,
						CorporateActionInstructionCancellationRequestStatusAdviceV04.mmInstructionCancellationRequestStatus);
				trace_lazy = () -> CorporateActionStatus.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InstructionCancellationRequestStatus5Choice";
				definition = "Choice between different instruction cancellation request statuses.";
				nextVersions_lazy = () -> Arrays.asList(InstructionCancellationRequestStatus7Choice.mmObject());
				previousVersion_lazy = () -> InstructionCancellationRequestStatus3Choice.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public CancelledStatus3Choice getCancellationCompleted() {
		return cancellationCompleted;
	}

	public InstructionCancellationRequestStatus5Choice setCancellationCompleted(com.tools20022.repository.choice.CancelledStatus3Choice cancellationCompleted) {
		this.cancellationCompleted = Objects.requireNonNull(cancellationCompleted);
		return this;
	}

	public AcceptedStatus1Choice getAccepted() {
		return accepted;
	}

	public InstructionCancellationRequestStatus5Choice setAccepted(com.tools20022.repository.choice.AcceptedStatus1Choice accepted) {
		this.accepted = Objects.requireNonNull(accepted);
		return this;
	}

	public RejectedStatus1Choice getRejected() {
		return rejected;
	}

	public InstructionCancellationRequestStatus5Choice setRejected(com.tools20022.repository.choice.RejectedStatus1Choice rejected) {
		this.rejected = Objects.requireNonNull(rejected);
		return this;
	}

	public PendingCancellationStatus3Choice getPendingCancellation() {
		return pendingCancellation;
	}

	public InstructionCancellationRequestStatus5Choice setPendingCancellation(com.tools20022.repository.choice.PendingCancellationStatus3Choice pendingCancellation) {
		this.pendingCancellation = Objects.requireNonNull(pendingCancellation);
		return this;
	}

	public ProprietaryStatusAndReason1 getProprietaryStatus() {
		return proprietaryStatus;
	}

	public InstructionCancellationRequestStatus5Choice setProprietaryStatus(ProprietaryStatusAndReason1 proprietaryStatus) {
		this.proprietaryStatus = Objects.requireNonNull(proprietaryStatus);
		return this;
	}
}