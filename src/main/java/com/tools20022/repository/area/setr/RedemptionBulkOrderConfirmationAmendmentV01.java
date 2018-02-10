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
import com.tools20022.repository.area.SecuritiesTradeLatestVersion;
import com.tools20022.repository.msg.*;
import com.tools20022.repository.msgset.InvestmentFundsISOPreviousversion;
import java.lang.reflect.Method;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * An executing party, for example, a transfer agent, sends the
 * RedemptionBulkOrderConfirmationAmendment message to the instructing party,
 * for example, an investment manager or its authorised representative to amend
 * a previously sent RedemptionBulkOrderConfirmation message.<br>
 * <b>Usage</b><br>
 * The RedemptionBulkOrderConfirmationAmendment message is used to amend one or
 * more previously sent redemption bulk order confirmations.<br>
 * Each bulk order confirmation amendment specified is identified in
 * DealReference. The reference of the original individual order is specified in
 * OrderReference.<br>
 * The message identification of the RedemptionBulkOrder message in which the
 * orders were conveyed may also be quoted in RelatedReference. The message
 * identification of the RedemptionBulkOrderConfirmation message in which the
 * original order confirmations were conveyed may also be quoted in
 * PreviousReference.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationAmendmentV01#mmMessageIdentification
 * RedemptionBulkOrderConfirmationAmendmentV01.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationAmendmentV01#mmPoolReference
 * RedemptionBulkOrderConfirmationAmendmentV01.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationAmendmentV01#mmPreviousReference
 * RedemptionBulkOrderConfirmationAmendmentV01.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationAmendmentV01#mmRelatedReference
 * RedemptionBulkOrderConfirmationAmendmentV01.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationAmendmentV01#mmBulkExecutionDetails
 * RedemptionBulkOrderConfirmationAmendmentV01.mmBulkExecutionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationAmendmentV01#mmRelatedPartyDetails
 * RedemptionBulkOrderConfirmationAmendmentV01.mmRelatedPartyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationAmendmentV01#mmCopyDetails
 * RedemptionBulkOrderConfirmationAmendmentV01.mmCopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationAmendmentV01#mmExtension
 * RedemptionBulkOrderConfirmationAmendmentV01.mmExtension}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.InvestmentFundsISOPreviousversion
 * InvestmentFundsISOPreviousversion}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "RedBlkOrdrConfAmdmntV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesTradeLatestVersion
 * SecuritiesTradeLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code setr.054.001.01}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintAccountIdentificationRule#forRedemptionBulkOrderConfirmationAmendmentV01
 * ConstraintAccountIdentificationRule.
 * forRedemptionBulkOrderConfirmationAmendmentV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintOrderReferenceRule#forRedemptionBulkOrderConfirmationAmendmentV01
 * ConstraintOrderReferenceRule.forRedemptionBulkOrderConfirmationAmendmentV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintRelatedPartiesDetailsRule#forRedemptionBulkOrderConfirmationAmendmentV01
 * ConstraintRelatedPartiesDetailsRule.
 * forRedemptionBulkOrderConfirmationAmendmentV01}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RedemptionBulkOrderConfirmationAmendmentV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nAn executing party, for example,  a transfer agent, sends the RedemptionBulkOrderConfirmationAmendment message to the instructing party, for example, an investment manager or its authorised representative to amend a previously sent RedemptionBulkOrderConfirmation message.\r\nUsage\r\nThe RedemptionBulkOrderConfirmationAmendment message is used to amend one or more previously sent redemption bulk order confirmations.\r\nEach bulk order confirmation amendment specified is identified in DealReference. The reference of the original individual order is specified in OrderReference.\r\nThe message identification of the RedemptionBulkOrder message in which the orders were conveyed may also be quoted in RelatedReference. The message identification of the RedemptionBulkOrderConfirmation message in which the original order confirmations were conveyed may also be quoted in PreviousReference."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "RedemptionBulkOrderConfirmationAmendmentV01", propOrder = {"messageIdentification", "poolReference", "previousReference", "relatedReference", "bulkExecutionDetails", "relatedPartyDetails", "copyDetails", "extension"})
public class RedemptionBulkOrderConfirmationAmendmentV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "MsgId", required = true)
	protected MessageIdentification1 messageIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.MessageIdentification1
	 * MessageIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference that uniquely identifies a message from a business application standpoint. "
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmMessageIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "MsgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageIdentification";
			definition = "Reference that uniquely identifies a message from a business application standpoint. ";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageIdentification1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return RedemptionBulkOrderConfirmationAmendmentV01.class.getMethod("getMessageIdentification", new Class[]{});
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
				return RedemptionBulkOrderConfirmationAmendmentV01.class.getMethod("getPoolReference", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "PrvsRef")
	protected List<AdditionalReference3> previousReference;
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
			minOccurs = 0;
			complexType_lazy = () -> AdditionalReference3.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return RedemptionBulkOrderConfirmationAmendmentV01.class.getMethod("getPreviousReference", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "RltdRef")
	protected AdditionalReference3 relatedReference;
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
			minOccurs = 0;
			complexType_lazy = () -> AdditionalReference3.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return RedemptionBulkOrderConfirmationAmendmentV01.class.getMethod("getRelatedReference", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "BlkExctnDtls", required = true)
	protected RedemptionBulkExecution3 bulkExecutionDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkExecution3
	 * RedemptionBulkExecution3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BlkExctnDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BulkExecutionDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "General information related to the execution of investment fund orders."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmBulkExecutionDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "BlkExctnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BulkExecutionDetails";
			definition = "General information related to the execution of investment fund orders.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> RedemptionBulkExecution3.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return RedemptionBulkOrderConfirmationAmendmentV01.class.getMethod("getBulkExecutionDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "RltdPtyDtls")
	protected List<Intermediary9> relatedPartyDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Intermediary9
	 * Intermediary9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RltdPtyDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedPartyDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information about parties related to the transaction."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmRelatedPartyDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "RltdPtyDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedPartyDetails";
			definition = "Information about parties related to the transaction.";
			maxOccurs = 10;
			minOccurs = 0;
			complexType_lazy = () -> Intermediary9.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return RedemptionBulkOrderConfirmationAmendmentV01.class.getMethod("getRelatedPartyDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "CpyDtls")
	protected CopyInformation2 copyDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CopyInformation2
	 * CopyInformation2}</li>
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
			complexType_lazy = () -> CopyInformation2.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return RedemptionBulkOrderConfirmationAmendmentV01.class.getMethod("getCopyDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "Xtnsn")
	protected List<Extension1> extension;
	/**
	 * 
	 <p>
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
				return RedemptionBulkOrderConfirmationAmendmentV01.class.getMethod("getExtension", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAccountIdentificationRule.forRedemptionBulkOrderConfirmationAmendmentV01,
						com.tools20022.repository.constraints.ConstraintOrderReferenceRule.forRedemptionBulkOrderConfirmationAmendmentV01,
						com.tools20022.repository.constraints.ConstraintRelatedPartiesDetailsRule.forRedemptionBulkOrderConfirmationAmendmentV01);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RedemptionBulkOrderConfirmationAmendmentV01";
				definition = "Scope\r\nAn executing party, for example,  a transfer agent, sends the RedemptionBulkOrderConfirmationAmendment message to the instructing party, for example, an investment manager or its authorised representative to amend a previously sent RedemptionBulkOrderConfirmation message.\r\nUsage\r\nThe RedemptionBulkOrderConfirmationAmendment message is used to amend one or more previously sent redemption bulk order confirmations.\r\nEach bulk order confirmation amendment specified is identified in DealReference. The reference of the original individual order is specified in OrderReference.\r\nThe message identification of the RedemptionBulkOrder message in which the orders were conveyed may also be quoted in RelatedReference. The message identification of the RedemptionBulkOrderConfirmation message in which the original order confirmations were conveyed may also be quoted in PreviousReference.";
				messageSet_lazy = () -> Arrays.asList(InvestmentFundsISOPreviousversion.mmObject());
				rootElement = "Document";
				xmlTag = "RedBlkOrdrConfAmdmntV01";
				businessArea_lazy = () -> SecuritiesTradeLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationAmendmentV01.mmMessageIdentification,
						com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationAmendmentV01.mmPoolReference, com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationAmendmentV01.mmPreviousReference,
						com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationAmendmentV01.mmRelatedReference, com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationAmendmentV01.mmBulkExecutionDetails,
						com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationAmendmentV01.mmRelatedPartyDetails, com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationAmendmentV01.mmCopyDetails,
						com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationAmendmentV01.mmExtension);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "setr";
						messageFunctionality = "054";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return RedemptionBulkOrderConfirmationAmendmentV01.class;
			}
		});
		return mmObject_lazy.get();
	}

	public MessageIdentification1 getMessageIdentification() {
		return messageIdentification;
	}

	public RedemptionBulkOrderConfirmationAmendmentV01 setMessageIdentification(MessageIdentification1 messageIdentification) {
		this.messageIdentification = Objects.requireNonNull(messageIdentification);
		return this;
	}

	public Optional<AdditionalReference3> getPoolReference() {
		return poolReference == null ? Optional.empty() : Optional.of(poolReference);
	}

	public RedemptionBulkOrderConfirmationAmendmentV01 setPoolReference(AdditionalReference3 poolReference) {
		this.poolReference = poolReference;
		return this;
	}

	public List<AdditionalReference3> getPreviousReference() {
		return previousReference == null ? previousReference = new ArrayList<>() : previousReference;
	}

	public RedemptionBulkOrderConfirmationAmendmentV01 setPreviousReference(List<AdditionalReference3> previousReference) {
		this.previousReference = Objects.requireNonNull(previousReference);
		return this;
	}

	public Optional<AdditionalReference3> getRelatedReference() {
		return relatedReference == null ? Optional.empty() : Optional.of(relatedReference);
	}

	public RedemptionBulkOrderConfirmationAmendmentV01 setRelatedReference(AdditionalReference3 relatedReference) {
		this.relatedReference = relatedReference;
		return this;
	}

	public RedemptionBulkExecution3 getBulkExecutionDetails() {
		return bulkExecutionDetails;
	}

	public RedemptionBulkOrderConfirmationAmendmentV01 setBulkExecutionDetails(RedemptionBulkExecution3 bulkExecutionDetails) {
		this.bulkExecutionDetails = Objects.requireNonNull(bulkExecutionDetails);
		return this;
	}

	public List<Intermediary9> getRelatedPartyDetails() {
		return relatedPartyDetails == null ? relatedPartyDetails = new ArrayList<>() : relatedPartyDetails;
	}

	public RedemptionBulkOrderConfirmationAmendmentV01 setRelatedPartyDetails(List<Intermediary9> relatedPartyDetails) {
		this.relatedPartyDetails = Objects.requireNonNull(relatedPartyDetails);
		return this;
	}

	public Optional<CopyInformation2> getCopyDetails() {
		return copyDetails == null ? Optional.empty() : Optional.of(copyDetails);
	}

	public RedemptionBulkOrderConfirmationAmendmentV01 setCopyDetails(CopyInformation2 copyDetails) {
		this.copyDetails = copyDetails;
		return this;
	}

	public List<Extension1> getExtension() {
		return extension == null ? extension = new ArrayList<>() : extension;
	}

	public RedemptionBulkOrderConfirmationAmendmentV01 setExtension(List<Extension1> extension) {
		this.extension = Objects.requireNonNull(extension);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:setr.054.001.01")
	static public class Document {
		@XmlElement(name = "RedBlkOrdrConfAmdmntV01", required = true)
		public RedemptionBulkOrderConfirmationAmendmentV01 messageBody;
	}
}