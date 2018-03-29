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

import com.tools20022.metamodel.*;
import com.tools20022.repository.area.seev.AgentCAGlobalDistributionStatusAdviceV01;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.DistributionRejectionStatus1;
import com.tools20022.repository.msg.MovementProcessingStatus1;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides information about the processing status.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponent#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualMovementStatus1#ProcessedStatusOrRejectedStatusRule
 * IndividualMovementStatus1.ProcessedStatusOrRejectedStatusRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualMovementStatus1#mmMovementIdentification
 * IndividualMovementStatus1.mmMovementIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualMovementStatus1#mmProcessedStatus
 * IndividualMovementStatus1.mmProcessedStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualMovementStatus1#mmRejectedStatus
 * IndividualMovementStatus1.mmRejectedStatus}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAGlobalDistributionStatusAdviceV01#mmIndividualMovementStatus
 * AgentCAGlobalDistributionStatusAdviceV01.mmIndividualMovementStatus}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "IndividualMovementStatus1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides information about the processing status."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "IndividualMovementStatus1", propOrder = {"movementIdentification", "processedStatus", "rejectedStatus"})
public class IndividualMovementStatus1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "MvmntId")
	protected Max35Text movementIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IndividualMovementStatus1
	 * IndividualMovementStatus1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MvmntId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MovementIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the movement."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IndividualMovementStatus1, Optional<Max35Text>> mmMovementIdentification = new MMMessageAttribute<IndividualMovementStatus1, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IndividualMovementStatus1.mmObject();
			isDerived = false;
			xmlTag = "MvmntId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MovementIdentification";
			definition = "Identification of the movement.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(IndividualMovementStatus1 obj) {
			return obj.getMovementIdentification();
		}

		@Override
		public void setValue(IndividualMovementStatus1 obj, Optional<Max35Text> value) {
			obj.setMovementIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "PrcdSts", required = true)
	protected MovementProcessingStatus1 processedStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.MovementProcessingStatus1
	 * MovementProcessingStatus1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IndividualMovementStatus1
	 * IndividualMovementStatus1}</li>
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
	 * "Provides information about the processing status of individual movement."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<IndividualMovementStatus1, MovementProcessingStatus1> mmProcessedStatus = new MMMessageAssociationEnd<IndividualMovementStatus1, MovementProcessingStatus1>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IndividualMovementStatus1.mmObject();
			isDerived = false;
			xmlTag = "PrcdSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessedStatus";
			definition = "Provides information about the processing status of individual movement.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> MovementProcessingStatus1.mmObject();
		}

		@Override
		public MovementProcessingStatus1 getValue(IndividualMovementStatus1 obj) {
			return obj.getProcessedStatus();
		}

		@Override
		public void setValue(IndividualMovementStatus1 obj, MovementProcessingStatus1 value) {
			obj.setProcessedStatus(value);
		}
	};
	@XmlElement(name = "RjctdSts", required = true)
	protected DistributionRejectionStatus1 rejectedStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.DistributionRejectionStatus1
	 * DistributionRejectionStatus1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IndividualMovementStatus1
	 * IndividualMovementStatus1}</li>
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
	public static final MMMessageAssociationEnd<IndividualMovementStatus1, DistributionRejectionStatus1> mmRejectedStatus = new MMMessageAssociationEnd<IndividualMovementStatus1, DistributionRejectionStatus1>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IndividualMovementStatus1.mmObject();
			isDerived = false;
			xmlTag = "RjctdSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RejectedStatus";
			definition = "Provides information about the rejection status.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> DistributionRejectionStatus1.mmObject();
		}

		@Override
		public DistributionRejectionStatus1 getValue(IndividualMovementStatus1 obj) {
			return obj.getRejectedStatus();
		}

		@Override
		public void setValue(IndividualMovementStatus1 obj, DistributionRejectionStatus1 value) {
			obj.setRejectedStatus(value);
		}
	};
	/**
	 * Either ProcessedStatus or RejectedStatus.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.IndividualMovementStatus1
	 * IndividualMovementStatus1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualMovementStatus1#mmProcessedStatus
	 * IndividualMovementStatus1.mmProcessedStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualMovementStatus1#mmRejectedStatus
	 * IndividualMovementStatus1.mmRejectedStatus}</li>
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
	public static final MMXor ProcessedStatusOrRejectedStatusRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessedStatusOrRejectedStatusRule";
			definition = "Either ProcessedStatus or RejectedStatus.";
			messageComponent_lazy = () -> com.tools20022.repository.msg.IndividualMovementStatus1.mmObject();
			impactedElements_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IndividualMovementStatus1.mmProcessedStatus, com.tools20022.repository.msg.IndividualMovementStatus1.mmRejectedStatus);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IndividualMovementStatus1.mmMovementIdentification, com.tools20022.repository.msg.IndividualMovementStatus1.mmProcessedStatus,
						com.tools20022.repository.msg.IndividualMovementStatus1.mmRejectedStatus);
				messageBuildingBlock_lazy = () -> Arrays.asList(AgentCAGlobalDistributionStatusAdviceV01.mmIndividualMovementStatus);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "IndividualMovementStatus1";
				definition = "Provides information about the processing status.";
				xors_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IndividualMovementStatus1.ProcessedStatusOrRejectedStatusRule);
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max35Text> getMovementIdentification() {
		return movementIdentification == null ? Optional.empty() : Optional.of(movementIdentification);
	}

	public IndividualMovementStatus1 setMovementIdentification(Max35Text movementIdentification) {
		this.movementIdentification = movementIdentification;
		return this;
	}

	public MovementProcessingStatus1 getProcessedStatus() {
		return processedStatus;
	}

	public IndividualMovementStatus1 setProcessedStatus(MovementProcessingStatus1 processedStatus) {
		this.processedStatus = Objects.requireNonNull(processedStatus);
		return this;
	}

	public DistributionRejectionStatus1 getRejectedStatus() {
		return rejectedStatus;
	}

	public IndividualMovementStatus1 setRejectedStatus(DistributionRejectionStatus1 rejectedStatus) {
		this.rejectedStatus = Objects.requireNonNull(rejectedStatus);
		return this;
	}
}