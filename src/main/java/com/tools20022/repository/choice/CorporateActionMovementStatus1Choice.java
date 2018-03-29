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
import com.tools20022.repository.area.seev.AgentCAMovementStatusAdviceV01;
import com.tools20022.repository.entity.CorporateActionStatus;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CorporateActionMovementFailedStatus1;
import com.tools20022.repository.msg.CorporateActionMovementProcessingStatus1;
import com.tools20022.repository.msg.CorporateActionMovementRejectionStatus1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice between the different statuses of a movement.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionMovementStatus1Choice#mmProcessedStatus
 * CorporateActionMovementStatus1Choice.mmProcessedStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionMovementStatus1Choice#mmFailedStatus
 * CorporateActionMovementStatus1Choice.mmFailedStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionMovementStatus1Choice#mmRejectedStatus
 * CorporateActionMovementStatus1Choice.mmRejectedStatus}</li>
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
 * {@linkplain com.tools20022.repository.area.seev.AgentCAMovementStatusAdviceV01#mmMovementStatusDetails
 * AgentCAMovementStatusAdviceV01.mmMovementStatusDetails}</li>
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
 * "CorporateActionMovementStatus1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice between the different statuses of a movement."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionMovementStatus1Choice", propOrder = {"processedStatus", "failedStatus", "rejectedStatus"})
public class CorporateActionMovementStatus1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PrcdSts", required = true)
	protected CorporateActionMovementProcessingStatus1 processedStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementProcessingStatus1
	 * CorporateActionMovementProcessingStatus1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus
	 * CorporateActionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionMovementStatus1Choice
	 * CorporateActionMovementStatus1Choice}</li>
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
	 * "Provides information about the processing status of the movement."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionMovementStatus1Choice, CorporateActionMovementProcessingStatus1> mmProcessedStatus = new MMMessageAssociationEnd<CorporateActionMovementStatus1Choice, CorporateActionMovementProcessingStatus1>() {
		{
			businessComponentTrace_lazy = () -> CorporateActionStatus.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.CorporateActionMovementStatus1Choice.mmObject();
			isDerived = false;
			xmlTag = "PrcdSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessedStatus";
			definition = "Provides information about the processing status of the movement.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CorporateActionMovementProcessingStatus1.mmObject();
		}

		@Override
		public CorporateActionMovementProcessingStatus1 getValue(CorporateActionMovementStatus1Choice obj) {
			return obj.getProcessedStatus();
		}

		@Override
		public void setValue(CorporateActionMovementStatus1Choice obj, CorporateActionMovementProcessingStatus1 value) {
			obj.setProcessedStatus(value);
		}
	};
	@XmlElement(name = "FaildSts", required = true)
	protected CorporateActionMovementFailedStatus1 failedStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementFailedStatus1
	 * CorporateActionMovementFailedStatus1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus
	 * CorporateActionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionMovementStatus1Choice
	 * CorporateActionMovementStatus1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FaildSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FailedStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides information about the settlement failure."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionMovementStatus1Choice, CorporateActionMovementFailedStatus1> mmFailedStatus = new MMMessageAssociationEnd<CorporateActionMovementStatus1Choice, CorporateActionMovementFailedStatus1>() {
		{
			businessComponentTrace_lazy = () -> CorporateActionStatus.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.CorporateActionMovementStatus1Choice.mmObject();
			isDerived = false;
			xmlTag = "FaildSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FailedStatus";
			definition = "Provides information about the settlement failure.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CorporateActionMovementFailedStatus1.mmObject();
		}

		@Override
		public CorporateActionMovementFailedStatus1 getValue(CorporateActionMovementStatus1Choice obj) {
			return obj.getFailedStatus();
		}

		@Override
		public void setValue(CorporateActionMovementStatus1Choice obj, CorporateActionMovementFailedStatus1 value) {
			obj.setFailedStatus(value);
		}
	};
	@XmlElement(name = "RjctdSts", required = true)
	protected CorporateActionMovementRejectionStatus1 rejectedStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementRejectionStatus1
	 * CorporateActionMovementRejectionStatus1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus
	 * CorporateActionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionMovementStatus1Choice
	 * CorporateActionMovementStatus1Choice}</li>
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
	public static final MMMessageAssociationEnd<CorporateActionMovementStatus1Choice, CorporateActionMovementRejectionStatus1> mmRejectedStatus = new MMMessageAssociationEnd<CorporateActionMovementStatus1Choice, CorporateActionMovementRejectionStatus1>() {
		{
			businessComponentTrace_lazy = () -> CorporateActionStatus.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.CorporateActionMovementStatus1Choice.mmObject();
			isDerived = false;
			xmlTag = "RjctdSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RejectedStatus";
			definition = "Provides information about the rejection status.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CorporateActionMovementRejectionStatus1.mmObject();
		}

		@Override
		public CorporateActionMovementRejectionStatus1 getValue(CorporateActionMovementStatus1Choice obj) {
			return obj.getRejectedStatus();
		}

		@Override
		public void setValue(CorporateActionMovementStatus1Choice obj, CorporateActionMovementRejectionStatus1 value) {
			obj.setRejectedStatus(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.CorporateActionMovementStatus1Choice.mmProcessedStatus, com.tools20022.repository.choice.CorporateActionMovementStatus1Choice.mmFailedStatus,
						com.tools20022.repository.choice.CorporateActionMovementStatus1Choice.mmRejectedStatus);
				messageBuildingBlock_lazy = () -> Arrays.asList(AgentCAMovementStatusAdviceV01.mmMovementStatusDetails);
				trace_lazy = () -> CorporateActionStatus.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionMovementStatus1Choice";
				definition = "Choice between the different statuses of a movement.";
			}
		});
		return mmObject_lazy.get();
	}

	public CorporateActionMovementProcessingStatus1 getProcessedStatus() {
		return processedStatus;
	}

	public CorporateActionMovementStatus1Choice setProcessedStatus(CorporateActionMovementProcessingStatus1 processedStatus) {
		this.processedStatus = Objects.requireNonNull(processedStatus);
		return this;
	}

	public CorporateActionMovementFailedStatus1 getFailedStatus() {
		return failedStatus;
	}

	public CorporateActionMovementStatus1Choice setFailedStatus(CorporateActionMovementFailedStatus1 failedStatus) {
		this.failedStatus = Objects.requireNonNull(failedStatus);
		return this;
	}

	public CorporateActionMovementRejectionStatus1 getRejectedStatus() {
		return rejectedStatus;
	}

	public CorporateActionMovementStatus1Choice setRejectedStatus(CorporateActionMovementRejectionStatus1 rejectedStatus) {
		this.rejectedStatus = Objects.requireNonNull(rejectedStatus);
		return this;
	}
}