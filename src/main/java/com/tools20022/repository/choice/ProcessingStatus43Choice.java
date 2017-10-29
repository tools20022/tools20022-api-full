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
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus43Choice#Received
 * ProcessingStatus43Choice.Received}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus43Choice#Accepted
 * ProcessingStatus43Choice.Accepted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus43Choice#PendingProcessing
 * ProcessingStatus43Choice.PendingProcessing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus43Choice#Rejected
 * ProcessingStatus43Choice.Rejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus43Choice#ProprietaryStatus
 * ProcessingStatus43Choice.ProprietaryStatus}</li>
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
 * {@linkplain com.tools20022.repository.area.reda.StandingSettlementInstructionStatusAdviceV01#ProcessingStatus
 * StandingSettlementInstructionStatusAdviceV01.ProcessingStatus}</li>
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
	 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus#CorporateActionInstructionProcessingStatus
	 * CorporateActionStatus.CorporateActionInstructionProcessingStatus}</li>
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
	public static final MMMessageAssociationEnd Received = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ProcessingStatus43Choice.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CorporateActionStatus.CorporateActionInstructionProcessingStatus;
			isDerived = false;
			xmlTag = "Rcvd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Received";
			definition = "Status of the standing settlement instruction, cancellation or deletion is received for further processing.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> ReceivedStatusReason1.mmObject();
			isComposite = true;
		}
	};
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
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus36Choice#AcknowledgedAccepted
	 * ProcessingStatus36Choice.AcknowledgedAccepted}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Accepted = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ProcessingStatus43Choice.mmObject();
			isDerived = false;
			xmlTag = "Accptd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Accepted";
			definition = "Status of the standing settlement instruction, cancellation or deletion is \r\nacknowledged/accepted for further processing. The instruction has been received, is processable and has been validated for further processing.";
			previousVersion_lazy = () -> com.tools20022.repository.choice.ProcessingStatus36Choice.AcknowledgedAccepted;
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> AcceptedStatusReason7.mmObject();
			isComposite = true;
		}
	};
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
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus36Choice#PendingProcessing
	 * ProcessingStatus36Choice.PendingProcessing}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd PendingProcessing = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ProcessingStatus43Choice.mmObject();
			isDerived = false;
			xmlTag = "PdgPrcg";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingProcessing";
			definition = "Status of the standing settlement instruction, cancellation or deletion is pending.";
			previousVersion_lazy = () -> com.tools20022.repository.choice.ProcessingStatus36Choice.PendingProcessing;
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> PendingProcessingStatusReason1.mmObject();
			isComposite = true;
		}
	};
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
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus36Choice#Rejected
	 * ProcessingStatus36Choice.Rejected}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Rejected = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ProcessingStatus43Choice.mmObject();
			isDerived = false;
			xmlTag = "Rjctd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rejected";
			definition = "Status of the standing settlement instruction, cancellation or deletion is rejected.";
			previousVersion_lazy = () -> com.tools20022.repository.choice.ProcessingStatus36Choice.Rejected;
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> RejectedStatusReason12.mmObject();
			isComposite = true;
		}
	};
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
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus36Choice#Proprietary
	 * ProcessingStatus36Choice.Proprietary}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd ProprietaryStatus = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ProcessingStatus43Choice.mmObject();
			isDerived = false;
			xmlTag = "PrtrySts";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProprietaryStatus";
			definition = "Status of the standing settlement instruction, cancellation or deletion is expressed in a bilaterally agreed manner.";
			previousVersion_lazy = () -> com.tools20022.repository.choice.ProcessingStatus36Choice.Proprietary;
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> ProprietaryStatusAndReason5.mmObject();
			isComposite = true;
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.ProcessingStatus43Choice.Received, com.tools20022.repository.choice.ProcessingStatus43Choice.Accepted,
						com.tools20022.repository.choice.ProcessingStatus43Choice.PendingProcessing, com.tools20022.repository.choice.ProcessingStatus43Choice.Rejected,
						com.tools20022.repository.choice.ProcessingStatus43Choice.ProprietaryStatus);
				trace_lazy = () -> SecuritiesTradeStatus.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.reda.StandingSettlementInstructionStatusAdviceV01.ProcessingStatus);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ProcessingStatus43Choice";
				definition = "Choice of formats for the specification of a status.";
				previousVersion_lazy = () -> ProcessingStatus36Choice.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}