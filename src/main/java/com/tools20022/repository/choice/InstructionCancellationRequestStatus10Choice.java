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
import com.tools20022.repository.entity.CorporateActionStatus;
import com.tools20022.repository.entity.CorporateActionStatusReason;
import com.tools20022.repository.entity.StatusReason;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.NoSpecifiedReason1;
import com.tools20022.repository.msg.ProprietaryStatusAndReason7;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
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
 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus10Choice#mmCancellationCompleted
 * InstructionCancellationRequestStatus10Choice.mmCancellationCompleted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus10Choice#mmAccepted
 * InstructionCancellationRequestStatus10Choice.mmAccepted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus10Choice#mmRejected
 * InstructionCancellationRequestStatus10Choice.mmRejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus10Choice#mmPendingCancellation
 * InstructionCancellationRequestStatus10Choice.mmPendingCancellation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus10Choice#mmProprietaryStatus
 * InstructionCancellationRequestStatus10Choice.mmProprietaryStatus}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CorporateActionStatus
 * CorporateActionStatus}</li>
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
 * "InstructionCancellationRequestStatus10Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice between different instruction cancellation request statuses."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "InstructionCancellationRequestStatus10Choice", propOrder = {"cancellationCompleted", "accepted", "rejected", "pendingCancellation", "proprietaryStatus"})
public class InstructionCancellationRequestStatus10Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected CancelledStatus14Choice cancellationCompleted;
	/**
	 * Provides status information related to a instruction cancellation request
	 * completed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.CancelledStatus14Choice
	 * CancelledStatus14Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmCancellationReason
	 * StatusReason.mmCancellationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus10Choice
	 * InstructionCancellationRequestStatus10Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CxlCmpltd"</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCancellationCompleted = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmCancellationReason;
			componentContext_lazy = () -> InstructionCancellationRequestStatus10Choice.mmObject();
			isDerived = false;
			xmlTag = "CxlCmpltd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationCompleted";
			definition = "Provides status information related to a instruction cancellation request completed.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.CancelledStatus14Choice.mmObject();
		}
	};
	protected NoSpecifiedReason1 accepted;
	/**
	 * Provides status information related to a cancellation request accepted
	 * for further processing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.NoSpecifiedReason1
	 * NoSpecifiedReason1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionStatusReason#mmAcceptedReason
	 * CorporateActionStatusReason.mmAcceptedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus10Choice
	 * InstructionCancellationRequestStatus10Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Accptd"</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAccepted = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionStatusReason.mmAcceptedReason;
			componentContext_lazy = () -> InstructionCancellationRequestStatus10Choice.mmObject();
			isDerived = false;
			xmlTag = "Accptd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Accepted";
			definition = "Provides status information related to a cancellation request accepted for further processing.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> NoSpecifiedReason1.mmObject();
		}
	};
	protected RejectedStatus20Choice rejected;
	/**
	 * Provides status information related to a cancellation request rejected
	 * for further processing due to system (data) reasons.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.RejectedStatus20Choice
	 * RejectedStatus20Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmRejectionReason
	 * StatusReason.mmRejectionReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus10Choice
	 * InstructionCancellationRequestStatus10Choice}</li>
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
	 * "Provides status information related to a cancellation request rejected for further processing due to system (data) reasons."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRejected = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmRejectionReason;
			componentContext_lazy = () -> InstructionCancellationRequestStatus10Choice.mmObject();
			isDerived = false;
			xmlTag = "Rjctd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rejected";
			definition = "Provides status information related to a cancellation request rejected for further processing due to system (data) reasons.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.RejectedStatus20Choice.mmObject();
		}
	};
	protected PendingCancellationStatus6Choice pendingCancellation;
	/**
	 * Provides status information related to a pending cancellation request.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PendingCancellationStatus6Choice
	 * PendingCancellationStatus6Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmPendingReason
	 * StatusReason.mmPendingReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus10Choice
	 * InstructionCancellationRequestStatus10Choice}</li>
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
	 * "Provides status information related to a pending cancellation request."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPendingCancellation = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmPendingReason;
			componentContext_lazy = () -> InstructionCancellationRequestStatus10Choice.mmObject();
			isDerived = false;
			xmlTag = "PdgCxl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingCancellation";
			definition = "Provides status information related to a pending cancellation request.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.PendingCancellationStatus6Choice.mmObject();
		}
	};
	protected ProprietaryStatusAndReason7 proprietaryStatus;
	/**
	 * Proprietary status related to an instruction cancellation request.
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
	 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus
	 * CorporateActionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus10Choice
	 * InstructionCancellationRequestStatus10Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtrySts"</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmProprietaryStatus = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> CorporateActionStatus.mmObject();
			componentContext_lazy = () -> InstructionCancellationRequestStatus10Choice.mmObject();
			isDerived = false;
			xmlTag = "PrtrySts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProprietaryStatus";
			definition = "Proprietary status related to an instruction cancellation request.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ProprietaryStatusAndReason7.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(InstructionCancellationRequestStatus10Choice.mmCancellationCompleted, InstructionCancellationRequestStatus10Choice.mmAccepted,
						InstructionCancellationRequestStatus10Choice.mmRejected, InstructionCancellationRequestStatus10Choice.mmPendingCancellation, InstructionCancellationRequestStatus10Choice.mmProprietaryStatus);
				trace_lazy = () -> CorporateActionStatus.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InstructionCancellationRequestStatus10Choice";
				definition = "Choice between different instruction cancellation request statuses.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "CxlCmpltd", required = true)
	public CancelledStatus14Choice getCancellationCompleted() {
		return cancellationCompleted;
	}

	public void setCancellationCompleted(com.tools20022.repository.choice.CancelledStatus14Choice cancellationCompleted) {
		this.cancellationCompleted = cancellationCompleted;
	}

	@XmlElement(name = "Accptd", required = true)
	public NoSpecifiedReason1 getAccepted() {
		return accepted;
	}

	public void setAccepted(NoSpecifiedReason1 accepted) {
		this.accepted = accepted;
	}

	@XmlElement(name = "Rjctd", required = true)
	public RejectedStatus20Choice getRejected() {
		return rejected;
	}

	public void setRejected(com.tools20022.repository.choice.RejectedStatus20Choice rejected) {
		this.rejected = rejected;
	}

	@XmlElement(name = "PdgCxl", required = true)
	public PendingCancellationStatus6Choice getPendingCancellation() {
		return pendingCancellation;
	}

	public void setPendingCancellation(com.tools20022.repository.choice.PendingCancellationStatus6Choice pendingCancellation) {
		this.pendingCancellation = pendingCancellation;
	}

	@XmlElement(name = "PrtrySts", required = true)
	public ProprietaryStatusAndReason7 getProprietaryStatus() {
		return proprietaryStatus;
	}

	public void setProprietaryStatus(ProprietaryStatusAndReason7 proprietaryStatus) {
		this.proprietaryStatus = proprietaryStatus;
	}
}