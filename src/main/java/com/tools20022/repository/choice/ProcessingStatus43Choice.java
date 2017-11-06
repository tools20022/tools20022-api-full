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
import com.tools20022.repository.entity.SecuritiesTradeStatus;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Choice of formats for the specification of a status.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus43Choice#mmReceived
 * ProcessingStatus43Choice.mmReceived}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus43Choice#mmAccepted
 * ProcessingStatus43Choice.mmAccepted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus43Choice#mmPendingProcessing
 * ProcessingStatus43Choice.mmPendingProcessing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus43Choice#mmRejected
 * ProcessingStatus43Choice.mmRejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus43Choice#mmProprietaryStatus
 * ProcessingStatus43Choice.mmProprietaryStatus}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus
 * SecuritiesTradeStatus}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.StandingSettlementInstructionStatusAdviceV01#mmProcessingStatus
 * StandingSettlementInstructionStatusAdviceV01.mmProcessingStatus}</li>
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
 * "ProcessingStatus43Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice of formats for the specification of a status."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus36Choice
 * ProcessingStatus36Choice}</li>
 * </ul>
 */
public class ProcessingStatus43Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected ReceivedStatusReason1 received;
	/**
	 * Status of the standing settlement instruction, cancellation or deletion
	 * is received for further processing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ReceivedStatusReason1
	 * ReceivedStatusReason1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus#mmCorporateActionInstructionProcessingStatus
	 * CorporateActionStatus.mmCorporateActionInstructionProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus43Choice
	 * ProcessingStatus43Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rcvd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Received"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Status of the standing settlement instruction, cancellation or deletion is received for further processing."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmReceived = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CorporateActionStatus.mmCorporateActionInstructionProcessingStatus;
			componentContext_lazy = () -> ProcessingStatus43Choice.mmObject();
			isDerived = false;
			xmlTag = "Rcvd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Received";
			definition = "Status of the standing settlement instruction, cancellation or deletion is received for further processing.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ReceivedStatusReason1.mmObject();
		}
	};
	protected AcceptedStatusReason7 accepted;
	/**
	 * Status of the standing settlement instruction, cancellation or deletion
	 * is <br>
	 * acknowledged/accepted for further processing. The instruction has been
	 * received, is processable and has been validated for further processing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AcceptedStatusReason7
	 * AcceptedStatusReason7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus43Choice
	 * ProcessingStatus43Choice}</li>
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
	 * "Status of the standing settlement instruction, cancellation or deletion is \r\nacknowledged/accepted for further processing. The instruction has been received, is processable and has been validated for further processing."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus36Choice#mmAcknowledgedAccepted
	 * ProcessingStatus36Choice.mmAcknowledgedAccepted}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAccepted = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ProcessingStatus43Choice.mmObject();
			isDerived = false;
			xmlTag = "Accptd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Accepted";
			definition = "Status of the standing settlement instruction, cancellation or deletion is \r\nacknowledged/accepted for further processing. The instruction has been received, is processable and has been validated for further processing.";
			previousVersion_lazy = () -> com.tools20022.repository.choice.ProcessingStatus36Choice.mmAcknowledgedAccepted;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AcceptedStatusReason7.mmObject();
		}
	};
	protected PendingProcessingStatusReason1 pendingProcessing;
	/**
	 * Status of the standing settlement instruction, cancellation or deletion
	 * is pending.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PendingProcessingStatusReason1
	 * PendingProcessingStatusReason1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus43Choice
	 * ProcessingStatus43Choice}</li>
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
	 * definition} =
	 * "Status of the standing settlement instruction, cancellation or deletion is pending."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus36Choice#mmPendingProcessing
	 * ProcessingStatus36Choice.mmPendingProcessing}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPendingProcessing = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ProcessingStatus43Choice.mmObject();
			isDerived = false;
			xmlTag = "PdgPrcg";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingProcessing";
			definition = "Status of the standing settlement instruction, cancellation or deletion is pending.";
			previousVersion_lazy = () -> com.tools20022.repository.choice.ProcessingStatus36Choice.mmPendingProcessing;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PendingProcessingStatusReason1.mmObject();
		}
	};
	protected RejectedStatusReason12 rejected;
	/**
	 * Status of the standing settlement instruction, cancellation or deletion
	 * is rejected.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.RejectedStatusReason12
	 * RejectedStatusReason12}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus43Choice
	 * ProcessingStatus43Choice}</li>
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
	 * "Status of the standing settlement instruction, cancellation or deletion is rejected."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus36Choice#mmRejected
	 * ProcessingStatus36Choice.mmRejected}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRejected = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ProcessingStatus43Choice.mmObject();
			isDerived = false;
			xmlTag = "Rjctd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rejected";
			definition = "Status of the standing settlement instruction, cancellation or deletion is rejected.";
			previousVersion_lazy = () -> com.tools20022.repository.choice.ProcessingStatus36Choice.mmRejected;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> RejectedStatusReason12.mmObject();
		}
	};
	protected ProprietaryStatusAndReason5 proprietaryStatus;
	/**
	 * Status of the standing settlement instruction, cancellation or deletion
	 * is expressed in a bilaterally agreed manner.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ProprietaryStatusAndReason5
	 * ProprietaryStatusAndReason5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus43Choice
	 * ProcessingStatus43Choice}</li>
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
	 * "Status of the standing settlement instruction, cancellation or deletion is expressed in a bilaterally agreed manner."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus36Choice#mmProprietary
	 * ProcessingStatus36Choice.mmProprietary}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmProprietaryStatus = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ProcessingStatus43Choice.mmObject();
			isDerived = false;
			xmlTag = "PrtrySts";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProprietaryStatus";
			definition = "Status of the standing settlement instruction, cancellation or deletion is expressed in a bilaterally agreed manner.";
			previousVersion_lazy = () -> com.tools20022.repository.choice.ProcessingStatus36Choice.mmProprietary;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ProprietaryStatusAndReason5.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.ProcessingStatus43Choice.mmReceived, com.tools20022.repository.choice.ProcessingStatus43Choice.mmAccepted,
						com.tools20022.repository.choice.ProcessingStatus43Choice.mmPendingProcessing, com.tools20022.repository.choice.ProcessingStatus43Choice.mmRejected,
						com.tools20022.repository.choice.ProcessingStatus43Choice.mmProprietaryStatus);
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.reda.StandingSettlementInstructionStatusAdviceV01.mmProcessingStatus);
				trace_lazy = () -> SecuritiesTradeStatus.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ProcessingStatus43Choice";
				definition = "Choice of formats for the specification of a status.";
				previousVersion_lazy = () -> ProcessingStatus36Choice.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public ReceivedStatusReason1 getReceived() {
		return received;
	}

	public void setReceived(ReceivedStatusReason1 received) {
		this.received = received;
	}

	public AcceptedStatusReason7 getAccepted() {
		return accepted;
	}

	public void setAccepted(AcceptedStatusReason7 accepted) {
		this.accepted = accepted;
	}

	public PendingProcessingStatusReason1 getPendingProcessing() {
		return pendingProcessing;
	}

	public void setPendingProcessing(PendingProcessingStatusReason1 pendingProcessing) {
		this.pendingProcessing = pendingProcessing;
	}

	public RejectedStatusReason12 getRejected() {
		return rejected;
	}

	public void setRejected(RejectedStatusReason12 rejected) {
		this.rejected = rejected;
	}

	public ProprietaryStatusAndReason5 getProprietaryStatus() {
		return proprietaryStatus;
	}

	public void setProprietaryStatus(ProprietaryStatusAndReason5 proprietaryStatus) {
		this.proprietaryStatus = proprietaryStatus;
	}
}