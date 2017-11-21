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

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.metamodel.MMXor;
import com.tools20022.repository.area.seev.AgentCAGlobalDistributionStatusAdviceV01;
import com.tools20022.repository.GeneratedRepository;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides information about the status of the global movement.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponent#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GlobalDistributionStatus1#mmProcessedStatusOrRejectedStatusRule
 * GlobalDistributionStatus1.mmProcessedStatusOrRejectedStatusRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GlobalDistributionStatus1#mmProcessedStatus
 * GlobalDistributionStatus1.mmProcessedStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GlobalDistributionStatus1#mmRejectedStatus
 * GlobalDistributionStatus1.mmRejectedStatus}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAGlobalDistributionStatusAdviceV01#mmGlobalMovementStatus
 * AgentCAGlobalDistributionStatusAdviceV01.mmGlobalMovementStatus}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "GlobalDistributionStatus1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides information about the status of the global movement."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "GlobalDistributionStatus1", propOrder = {"processedStatus", "rejectedStatus"})
public class GlobalDistributionStatus1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected DistributionProcessingStatus1 processedStatus;
	/**
	 * Provides information about the processing status of the global movement
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.DistributionProcessingStatus1
	 * DistributionProcessingStatus1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.GlobalDistributionStatus1
	 * GlobalDistributionStatus1}</li>
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
	 * "Provides information about the processing status of the global movement"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmProcessedStatus = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> GlobalDistributionStatus1.mmObject();
			isDerived = false;
			xmlTag = "PrcdSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessedStatus";
			definition = "Provides information about the processing status of the global movement";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.DistributionProcessingStatus1.mmObject();
		}
	};
	protected DistributionRejectionStatus1 rejectedStatus;
	/**
	 * Provides information about the rejection status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.DistributionRejectionStatus1
	 * DistributionRejectionStatus1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.GlobalDistributionStatus1
	 * GlobalDistributionStatus1}</li>
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
			componentContext_lazy = () -> GlobalDistributionStatus1.mmObject();
			isDerived = false;
			xmlTag = "RjctdSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RejectedStatus";
			definition = "Provides information about the rejection status.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.DistributionRejectionStatus1.mmObject();
		}
	};
	/**
	 * Either ProcessedStatus or RejectedStatus.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.GlobalDistributionStatus1
	 * GlobalDistributionStatus1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GlobalDistributionStatus1#mmProcessedStatus
	 * GlobalDistributionStatus1.mmProcessedStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GlobalDistributionStatus1#mmRejectedStatus
	 * GlobalDistributionStatus1.mmRejectedStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProcessedStatusOrRejectedStatusRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Either ProcessedStatus or RejectedStatus."</li>
	 * </ul>
	 */
	public static final MMXor mmProcessedStatusOrRejectedStatusRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessedStatusOrRejectedStatusRule";
			definition = "Either ProcessedStatus or RejectedStatus.";
			messageComponent_lazy = () -> GlobalDistributionStatus1.mmObject();
			impactedElements_lazy = () -> Arrays.asList(GlobalDistributionStatus1.mmProcessedStatus, GlobalDistributionStatus1.mmRejectedStatus);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(GlobalDistributionStatus1.mmProcessedStatus, GlobalDistributionStatus1.mmRejectedStatus);
				messageBuildingBlock_lazy = () -> Arrays.asList(AgentCAGlobalDistributionStatusAdviceV01.mmGlobalMovementStatus);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "GlobalDistributionStatus1";
				definition = "Provides information about the status of the global movement.";
				xors_lazy = () -> Arrays.asList(GlobalDistributionStatus1.mmProcessedStatusOrRejectedStatusRule);
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "PrcdSts", required = true)
	public DistributionProcessingStatus1 getProcessedStatus() {
		return processedStatus;
	}

	public void setProcessedStatus(com.tools20022.repository.msg.DistributionProcessingStatus1 processedStatus) {
		this.processedStatus = processedStatus;
	}

	@XmlElement(name = "RjctdSts", required = true)
	public DistributionRejectionStatus1 getRejectedStatus() {
		return rejectedStatus;
	}

	public void setRejectedStatus(com.tools20022.repository.msg.DistributionRejectionStatus1 rejectedStatus) {
		this.rejectedStatus = rejectedStatus;
	}
}