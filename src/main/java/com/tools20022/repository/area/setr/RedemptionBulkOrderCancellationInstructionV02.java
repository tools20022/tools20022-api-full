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

package com.tools20022.repository.area.setr;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.SecuritiesTradeArchive;
import com.tools20022.repository.msg.AdditionalReference3;
import com.tools20022.repository.msg.RedemptionBulkOrderInstruction1;
import com.tools20022.repository.msgset.ISOArchive;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The RedemptionBulkOrderCancellationInstruction message is sent by an
 * instructing party, eg, an investment manager or its authorised
 * representative, to an executing party, eg, a transfer agent. There may be one
 * or more intermediary parties between the instructing party and the executing
 * party. The intermediary party is, for example, an intermediary or a
 * concentrator.<br>
 * This message is sent to cancel a previously sent RedemptionBulkOrder
 * instruction.<br>
 * <b>Usage</b><br>
 * The RedemptionBulkOrderCancellationInstruction message is used to cancel the
 * entire previously sent RedemptionBulkOrder message and all the individual
 * orders that it contained. There is no amendment, but a cancellation and
 * re-instruct policy.<br>
 * This message must contain the reference of the message to be cancelled. This
 * message may also contain all the details of the message to be cancelled, but
 * this is not recommended.<br>
 * The deadline and acceptance of a cancellation instruction is subject to a
 * service level agreement (SLA). This cancellation message is a cancellation
 * instruction. There is no automatic acceptance of the cancellation
 * instruction.<br>
 * The rejection or acceptance of a cancellation message instruction is made
 * using an OrderCancellationStatusReport message.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderCancellationInstructionV02#mmMasterReference
 * RedemptionBulkOrderCancellationInstructionV02.mmMasterReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderCancellationInstructionV02#mmPoolReference
 * RedemptionBulkOrderCancellationInstructionV02.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderCancellationInstructionV02#mmPreviousReference
 * RedemptionBulkOrderCancellationInstructionV02.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderCancellationInstructionV02#mmOrderToBeCancelled
 * RedemptionBulkOrderCancellationInstructionV02.mmOrderToBeCancelled}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msgset.ISOArchive ISOArchive}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "setr.002.001.02"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesTradeArchive
 * SecuritiesTradeArchive}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlName
 * xmlName} = "setr.002.001.02"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code setr.002.001.02}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintAccountIdentificationRule#forRedemptionBulkOrderCancellationInstructionV02
 * ConstraintAccountIdentificationRule.
 * forRedemptionBulkOrderCancellationInstructionV02}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RedemptionBulkOrderCancellationInstructionV02"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe RedemptionBulkOrderCancellationInstruction message is sent by an instructing party, eg, an investment manager or its authorised representative, to an executing party, eg, a transfer agent. There may be one or more intermediary parties between the instructing party and the executing party. The intermediary party is, for example, an intermediary or a concentrator.\r\nThis message is sent to cancel a previously sent RedemptionBulkOrder instruction.\r\nUsage\r\nThe RedemptionBulkOrderCancellationInstruction message is used to cancel the entire previously sent RedemptionBulkOrder message and all the individual orders that it contained. There is no amendment, but a cancellation and re-instruct policy.\r\nThis message must contain the reference of the message to be cancelled. This message may also contain all the details of the message to be cancelled, but this is not recommended.\r\nThe deadline and acceptance of a cancellation instruction is subject to a service level agreement (SLA). This cancellation message is a cancellation instruction. There is no automatic acceptance of the cancellation instruction.\r\nThe rejection or acceptance of a cancellation message instruction is made using an OrderCancellationStatusReport message."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderCancellationRequestV03
 * RedemptionBulkOrderCancellationRequestV03}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "setr.002.001.02", propOrder = {"masterReference", "poolReference", "previousReference", "orderToBeCancelled"})
public class RedemptionBulkOrderCancellationInstructionV02 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "MstrRef")
	protected AdditionalReference3 masterReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference3
	 * AdditionalReference3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MstrRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MasterReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference assigned to a set of orders or trades in order to link them together."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmMasterReference = new MMMessageBuildingBlock() {
		{
			xmlTag = "MstrRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MasterReference";
			definition = "Reference assigned to a set of orders or trades in order to link them together.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AdditionalReference3.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return RedemptionBulkOrderCancellationInstructionV02.class.getMethod("getMasterReference", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "PoolRef")
	protected AdditionalReference3 poolReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference3
	 * AdditionalReference3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PoolRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PoolReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Collective reference identifying a set of messages."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmPoolReference = new MMMessageBuildingBlock() {
		{
			xmlTag = "PoolRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PoolReference";
			definition = "Collective reference identifying a set of messages.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AdditionalReference3.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return RedemptionBulkOrderCancellationInstructionV02.class.getMethod("getPoolReference", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "PrvsRef", required = true)
	protected AdditionalReference3 previousReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference3
	 * AdditionalReference3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrvsRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reference to a linked message that was previously sent."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmPreviousReference = new MMMessageBuildingBlock() {
		{
			xmlTag = "PrvsRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousReference";
			definition = "Reference to a linked message that was previously sent.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> AdditionalReference3.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return RedemptionBulkOrderCancellationInstructionV02.class.getMethod("getPreviousReference", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "OrdrToBeCanc")
	protected RedemptionBulkOrderInstruction1 orderToBeCancelled;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkOrderInstruction1
	 * RedemptionBulkOrderInstruction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrdrToBeCanc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderToBeCancelled"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Common information related to all the orders to be cancelled."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmOrderToBeCancelled = new MMMessageBuildingBlock() {
		{
			xmlTag = "OrdrToBeCanc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderToBeCancelled";
			definition = "Common information related to all the orders to be cancelled.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RedemptionBulkOrderInstruction1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return RedemptionBulkOrderCancellationInstructionV02.class.getMethod("getOrderToBeCancelled", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAccountIdentificationRule.forRedemptionBulkOrderCancellationInstructionV02);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RedemptionBulkOrderCancellationInstructionV02";
				definition = "Scope\r\nThe RedemptionBulkOrderCancellationInstruction message is sent by an instructing party, eg, an investment manager or its authorised representative, to an executing party, eg, a transfer agent. There may be one or more intermediary parties between the instructing party and the executing party. The intermediary party is, for example, an intermediary or a concentrator.\r\nThis message is sent to cancel a previously sent RedemptionBulkOrder instruction.\r\nUsage\r\nThe RedemptionBulkOrderCancellationInstruction message is used to cancel the entire previously sent RedemptionBulkOrder message and all the individual orders that it contained. There is no amendment, but a cancellation and re-instruct policy.\r\nThis message must contain the reference of the message to be cancelled. This message may also contain all the details of the message to be cancelled, but this is not recommended.\r\nThe deadline and acceptance of a cancellation instruction is subject to a service level agreement (SLA). This cancellation message is a cancellation instruction. There is no automatic acceptance of the cancellation instruction.\r\nThe rejection or acceptance of a cancellation message instruction is made using an OrderCancellationStatusReport message.";
				nextVersions_lazy = () -> Arrays.asList(RedemptionBulkOrderCancellationRequestV03.mmObject());
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "setr.002.001.02";
				businessArea_lazy = () -> SecuritiesTradeArchive.mmObject();
				xmlName = "setr.002.001.02";
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.setr.RedemptionBulkOrderCancellationInstructionV02.mmMasterReference,
						com.tools20022.repository.area.setr.RedemptionBulkOrderCancellationInstructionV02.mmPoolReference, com.tools20022.repository.area.setr.RedemptionBulkOrderCancellationInstructionV02.mmPreviousReference,
						com.tools20022.repository.area.setr.RedemptionBulkOrderCancellationInstructionV02.mmOrderToBeCancelled);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "setr";
						messageFunctionality = "002";
						version = "02";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return RedemptionBulkOrderCancellationInstructionV02.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<AdditionalReference3> getMasterReference() {
		return masterReference == null ? Optional.empty() : Optional.of(masterReference);
	}

	public RedemptionBulkOrderCancellationInstructionV02 setMasterReference(AdditionalReference3 masterReference) {
		this.masterReference = masterReference;
		return this;
	}

	public Optional<AdditionalReference3> getPoolReference() {
		return poolReference == null ? Optional.empty() : Optional.of(poolReference);
	}

	public RedemptionBulkOrderCancellationInstructionV02 setPoolReference(AdditionalReference3 poolReference) {
		this.poolReference = poolReference;
		return this;
	}

	public AdditionalReference3 getPreviousReference() {
		return previousReference;
	}

	public RedemptionBulkOrderCancellationInstructionV02 setPreviousReference(AdditionalReference3 previousReference) {
		this.previousReference = Objects.requireNonNull(previousReference);
		return this;
	}

	public Optional<RedemptionBulkOrderInstruction1> getOrderToBeCancelled() {
		return orderToBeCancelled == null ? Optional.empty() : Optional.of(orderToBeCancelled);
	}

	public RedemptionBulkOrderCancellationInstructionV02 setOrderToBeCancelled(RedemptionBulkOrderInstruction1 orderToBeCancelled) {
		this.orderToBeCancelled = orderToBeCancelled;
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:setr.002.001.02")
	static public class Document {
		@XmlElement(name = "setr.002.001.02", required = true)
		public RedemptionBulkOrderCancellationInstructionV02 messageBody;
	}
}