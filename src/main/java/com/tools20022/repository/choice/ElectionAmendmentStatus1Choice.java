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
import com.tools20022.repository.area.seev.AgentCAElectionStatusAdviceV01;
import com.tools20022.repository.entity.CorporateActionStatus;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CorporateActionAmendmentProcessingStatus1;
import com.tools20022.repository.msg.CorporateActionAmendmentRejectionStatus1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice between the different statuses of an election amendment request.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ElectionAmendmentStatus1Choice#mmProcessedStatus
 * ElectionAmendmentStatus1Choice.mmProcessedStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ElectionAmendmentStatus1Choice#mmRejectedStatus
 * ElectionAmendmentStatus1Choice.mmRejectedStatus}</li>
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
 * {@linkplain com.tools20022.repository.area.seev.AgentCAElectionStatusAdviceV01#mmElectionAmendmentRequestStatus
 * AgentCAElectionStatusAdviceV01.mmElectionAmendmentRequestStatus}</li>
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
 * "ElectionAmendmentStatus1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice between the different statuses of an election amendment request."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "ElectionAmendmentStatus1Choice", propOrder = {"processedStatus", "rejectedStatus"})
public class ElectionAmendmentStatus1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected CorporateActionAmendmentProcessingStatus1 processedStatus;
	/**
	 * Provides information about the processing status of the request.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmendmentProcessingStatus1
	 * CorporateActionAmendmentProcessingStatus1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus
	 * CorporateActionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ElectionAmendmentStatus1Choice
	 * ElectionAmendmentStatus1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrcdSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProcessedStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information about the processing status of the request."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmProcessedStatus = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> CorporateActionStatus.mmObject();
			componentContext_lazy = () -> ElectionAmendmentStatus1Choice.mmObject();
			isDerived = false;
			xmlTag = "PrcdSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessedStatus";
			definition = "Provides information about the processing status of the request.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CorporateActionAmendmentProcessingStatus1.mmObject();
		}
	};
	protected CorporateActionAmendmentRejectionStatus1 rejectedStatus;
	/**
	 * Provides information about the rejection status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmendmentRejectionStatus1
	 * CorporateActionAmendmentRejectionStatus1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus
	 * CorporateActionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ElectionAmendmentStatus1Choice
	 * ElectionAmendmentStatus1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RjctdSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RejectedStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides information about the rejection status."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRejectedStatus = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> CorporateActionStatus.mmObject();
			componentContext_lazy = () -> ElectionAmendmentStatus1Choice.mmObject();
			isDerived = false;
			xmlTag = "RjctdSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RejectedStatus";
			definition = "Provides information about the rejection status.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CorporateActionAmendmentRejectionStatus1.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(ElectionAmendmentStatus1Choice.mmProcessedStatus, ElectionAmendmentStatus1Choice.mmRejectedStatus);
				messageBuildingBlock_lazy = () -> Arrays.asList(AgentCAElectionStatusAdviceV01.mmElectionAmendmentRequestStatus);
				trace_lazy = () -> CorporateActionStatus.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ElectionAmendmentStatus1Choice";
				definition = "Choice between the different statuses of an election amendment request.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "PrcdSts", required = true)
	public CorporateActionAmendmentProcessingStatus1 getProcessedStatus() {
		return processedStatus;
	}

	public void setProcessedStatus(CorporateActionAmendmentProcessingStatus1 processedStatus) {
		this.processedStatus = processedStatus;
	}

	@XmlElement(name = "RjctdSts", required = true)
	public CorporateActionAmendmentRejectionStatus1 getRejectedStatus() {
		return rejectedStatus;
	}

	public void setRejectedStatus(CorporateActionAmendmentRejectionStatus1 rejectedStatus) {
		this.rejectedStatus = rejectedStatus;
	}
}