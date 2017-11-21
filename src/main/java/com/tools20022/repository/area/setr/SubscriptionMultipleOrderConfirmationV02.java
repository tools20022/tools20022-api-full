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
import com.tools20022.repository.msg.*;
import com.tools20022.repository.msgset.ISOArchive;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The SubscriptionMultipleOrderConfirmation message is sent by an executing
 * party, eg, a transfer agent, to the instructing party, eg, an investment
 * manager or its authorised representative. There may be one or more
 * intermediary parties between the executing party and the instruction party.
 * The intermediary party is, for example, an intermediary or a concentrator.<br>
 * This message is used to confirm the details of the execution of a
 * SubscriptionMultipleOrder message.<br>
 * <b>Usage</b><br>
 * The SubscriptionMultipleOrderConfirmation message is sent, after the price
 * has been determined, to confirm the execution of the individual orders.<br>
 * A SubscriptionMultipleOrder may be responded to by more than one
 * SubscriptionMultipleOrderConfirmation message, as the valuation cycle of the
 * financial instruments in each individual order may be different.<br>
 * When the executing party sends several confirmations, there is no specific
 * indication in the message that it is an incomplete confirmation.
 * Reconciliation must be based on the references.<br>
 * A SubscriptionMultipleOrder must in all cases be responded to by a
 * SubscriptionMultipleOrderConfirmation message/s and in no circumstances by a
 * SubscriptionBulkOrderConfirmation message/s.<br>
 * If the executing party needs to confirm a SubscriptionBulkOrder message, then
 * a SubscriptionBulkOrderConfirmation message must be used.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesTradeArchive
 * SecuritiesTradeArchive}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msgset.ISOArchive ISOArchive}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlName
 * xmlName} = "setr.012.001.02"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "setr.012.001.02"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionMultipleOrderConfirmationV02#mmMasterReference
 * SubscriptionMultipleOrderConfirmationV02.mmMasterReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionMultipleOrderConfirmationV02#mmPoolReference
 * SubscriptionMultipleOrderConfirmationV02.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionMultipleOrderConfirmationV02#mmPreviousReference
 * SubscriptionMultipleOrderConfirmationV02.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionMultipleOrderConfirmationV02#mmRelatedReference
 * SubscriptionMultipleOrderConfirmationV02.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionMultipleOrderConfirmationV02#mmMultipleExecutionDetails
 * SubscriptionMultipleOrderConfirmationV02.mmMultipleExecutionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionMultipleOrderConfirmationV02#mmIntermediaryDetails
 * SubscriptionMultipleOrderConfirmationV02.mmIntermediaryDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionMultipleOrderConfirmationV02#mmCopyDetails
 * SubscriptionMultipleOrderConfirmationV02.mmCopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionMultipleOrderConfirmationV02#mmExtension
 * SubscriptionMultipleOrderConfirmationV02.mmExtension}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code setr.012.001.02}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SubscriptionMultipleOrderConfirmationV02"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe SubscriptionMultipleOrderConfirmation message is sent by an executing party, eg, a transfer agent, to the instructing party, eg, an investment manager or its authorised representative. There may be one or more intermediary parties between the executing party and the instruction party. The intermediary party is, for example, an intermediary or a concentrator.\r\nThis message is used to confirm the details of the execution of a SubscriptionMultipleOrder message.\r\nUsage\r\nThe SubscriptionMultipleOrderConfirmation message is sent, after the price has been determined, to confirm the execution of the individual orders.\r\nA SubscriptionMultipleOrder may be responded to by more than one SubscriptionMultipleOrderConfirmation message, as the valuation cycle of the financial instruments in each individual order may be different.\r\nWhen the executing party sends several confirmations, there is no specific indication in the message that it is an incomplete confirmation. Reconciliation must be based on the references.\r\nA SubscriptionMultipleOrder must in all cases be responded to by a SubscriptionMultipleOrderConfirmation message/s and in no circumstances by a SubscriptionBulkOrderConfirmation message/s.\r\nIf the executing party needs to confirm a SubscriptionBulkOrder message, then a SubscriptionBulkOrderConfirmation message must be used."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderConfirmationV03
 * SubscriptionOrderConfirmationV03}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "setr.012.001.02", propOrder = {"masterReference", "poolReference", "previousReference", "relatedReference", "multipleExecutionDetails", "intermediaryDetails", "copyDetails", "extension"})
public class SubscriptionMultipleOrderConfirmationV02 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	protected AdditionalReference3 masterReference;
	/**
	 * Reference assigned to a set of orders or trades in order to link them
	 * together.
	 * <p>
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
				return SubscriptionMultipleOrderConfirmationV02.class.getMethod("getMasterReference", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected AdditionalReference3 poolReference;
	/**
	 * Collective reference identifying a set of messages.
	 * <p>
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
				return SubscriptionMultipleOrderConfirmationV02.class.getMethod("getPoolReference", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<AdditionalReference3> previousReference;
	/**
	 * Reference to a linked message that was previously sent.
	 * <p>
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
			minOccurs = 0;
			complexType_lazy = () -> AdditionalReference3.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SubscriptionMultipleOrderConfirmationV02.class.getMethod("getPreviousReference", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected AdditionalReference3 relatedReference;
	/**
	 * Reference to a linked message that was previously received.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference3
	 * AdditionalReference3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RltdRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference to a linked message that was previously received."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmRelatedReference = new MMMessageBuildingBlock() {
		{
			xmlTag = "RltdRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedReference";
			definition = "Reference to a linked message that was previously received.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> AdditionalReference3.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SubscriptionMultipleOrderConfirmationV02.class.getMethod("getRelatedReference", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected SubscriptionMultipleExecution2 multipleExecutionDetails;
	/**
	 * General information related to the execution of investment fund order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleExecution2
	 * SubscriptionMultipleExecution2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MltplExctnDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MultipleExecutionDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "General information related to the execution of investment fund order."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmMultipleExecutionDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "MltplExctnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MultipleExecutionDetails";
			definition = "General information related to the execution of investment fund order.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SubscriptionMultipleExecution2.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SubscriptionMultipleOrderConfirmationV02.class.getMethod("getMultipleExecutionDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<Intermediary4> intermediaryDetails;
	/**
	 * Confirmation of the information related to an intermediary.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Intermediary4
	 * Intermediary4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrmyDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Confirmation of the information related to an intermediary."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmIntermediaryDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "IntrmyDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediaryDetails";
			definition = "Confirmation of the information related to an intermediary.";
			maxOccurs = 10;
			minOccurs = 0;
			complexType_lazy = () -> Intermediary4.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SubscriptionMultipleOrderConfirmationV02.class.getMethod("getIntermediaryDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CopyInformation1 copyDetails;
	/**
	 * Information provided when the message is a copy of a previous message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CopyInformation1
	 * CopyInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CpyDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CopyDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information provided when the message is a copy of a previous message."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmCopyDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "CpyDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CopyDetails";
			definition = "Information provided when the message is a copy of a previous message.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CopyInformation1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SubscriptionMultipleOrderConfirmationV02.class.getMethod("getCopyDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<Extension1> extension;
	/**
	 * Additional information that cannot be captured in the structured elements
	 * and/or any other specific block.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Extension1
	 * Extension1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Xtnsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Extension"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information that cannot be captured in the structured elements and/or any other specific block."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmExtension = new MMMessageBuildingBlock() {
		{
			xmlTag = "Xtnsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Extension";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> Extension1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SubscriptionMultipleOrderConfirmationV02.class.getMethod("getExtension", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SubscriptionMultipleOrderConfirmationV02";
				definition = "Scope\r\nThe SubscriptionMultipleOrderConfirmation message is sent by an executing party, eg, a transfer agent, to the instructing party, eg, an investment manager or its authorised representative. There may be one or more intermediary parties between the executing party and the instruction party. The intermediary party is, for example, an intermediary or a concentrator.\r\nThis message is used to confirm the details of the execution of a SubscriptionMultipleOrder message.\r\nUsage\r\nThe SubscriptionMultipleOrderConfirmation message is sent, after the price has been determined, to confirm the execution of the individual orders.\r\nA SubscriptionMultipleOrder may be responded to by more than one SubscriptionMultipleOrderConfirmation message, as the valuation cycle of the financial instruments in each individual order may be different.\r\nWhen the executing party sends several confirmations, there is no specific indication in the message that it is an incomplete confirmation. Reconciliation must be based on the references.\r\nA SubscriptionMultipleOrder must in all cases be responded to by a SubscriptionMultipleOrderConfirmation message/s and in no circumstances by a SubscriptionBulkOrderConfirmation message/s.\r\nIf the executing party needs to confirm a SubscriptionBulkOrder message, then a SubscriptionBulkOrderConfirmation message must be used.";
				nextVersions_lazy = () -> Arrays.asList(SubscriptionOrderConfirmationV03.mmObject());
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "setr.012.001.02";
				businessArea_lazy = () -> SecuritiesTradeArchive.mmObject();
				xmlName = "setr.012.001.02";
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.setr.SubscriptionMultipleOrderConfirmationV02.mmMasterReference,
						com.tools20022.repository.area.setr.SubscriptionMultipleOrderConfirmationV02.mmPoolReference, com.tools20022.repository.area.setr.SubscriptionMultipleOrderConfirmationV02.mmPreviousReference,
						com.tools20022.repository.area.setr.SubscriptionMultipleOrderConfirmationV02.mmRelatedReference, com.tools20022.repository.area.setr.SubscriptionMultipleOrderConfirmationV02.mmMultipleExecutionDetails,
						com.tools20022.repository.area.setr.SubscriptionMultipleOrderConfirmationV02.mmIntermediaryDetails, com.tools20022.repository.area.setr.SubscriptionMultipleOrderConfirmationV02.mmCopyDetails,
						com.tools20022.repository.area.setr.SubscriptionMultipleOrderConfirmationV02.mmExtension);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "setr";
						messageFunctionality = "012";
						version = "02";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return SubscriptionMultipleOrderConfirmationV02.class;
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "MstrRef")
	public AdditionalReference3 getMasterReference() {
		return masterReference;
	}

	public void setMasterReference(AdditionalReference3 masterReference) {
		this.masterReference = masterReference;
	}

	@XmlElement(name = "PoolRef")
	public AdditionalReference3 getPoolReference() {
		return poolReference;
	}

	public void setPoolReference(AdditionalReference3 poolReference) {
		this.poolReference = poolReference;
	}

	@XmlElement(name = "PrvsRef")
	public List<AdditionalReference3> getPreviousReference() {
		return previousReference;
	}

	public void setPreviousReference(List<AdditionalReference3> previousReference) {
		this.previousReference = previousReference;
	}

	@XmlElement(name = "RltdRef", required = true)
	public AdditionalReference3 getRelatedReference() {
		return relatedReference;
	}

	public void setRelatedReference(AdditionalReference3 relatedReference) {
		this.relatedReference = relatedReference;
	}

	@XmlElement(name = "MltplExctnDtls", required = true)
	public SubscriptionMultipleExecution2 getMultipleExecutionDetails() {
		return multipleExecutionDetails;
	}

	public void setMultipleExecutionDetails(SubscriptionMultipleExecution2 multipleExecutionDetails) {
		this.multipleExecutionDetails = multipleExecutionDetails;
	}

	@XmlElement(name = "IntrmyDtls")
	public List<Intermediary4> getIntermediaryDetails() {
		return intermediaryDetails;
	}

	public void setIntermediaryDetails(List<Intermediary4> intermediaryDetails) {
		this.intermediaryDetails = intermediaryDetails;
	}

	@XmlElement(name = "CpyDtls")
	public CopyInformation1 getCopyDetails() {
		return copyDetails;
	}

	public void setCopyDetails(CopyInformation1 copyDetails) {
		this.copyDetails = copyDetails;
	}

	@XmlElement(name = "Xtnsn")
	public List<Extension1> getExtension() {
		return extension;
	}

	public void setExtension(List<Extension1> extension) {
		this.extension = extension;
	}

	@XmlRootElement(namespace = "urn:iso:std:iso:20022:tech:xsd:setr.012.02.02")
	static public class Document {
		@XmlElement(name = "setr.012.001.02", required = true)
		public SubscriptionMultipleOrderConfirmationV02 messageBody;
	}
}