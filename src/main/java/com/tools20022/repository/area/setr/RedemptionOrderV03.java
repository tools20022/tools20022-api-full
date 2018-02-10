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
import com.tools20022.repository.area.SecuritiesTradePreviousVersion;
import com.tools20022.repository.msg.*;
import com.tools20022.repository.msgset.InvestmentFundsISOPreviousversion;
import java.lang.reflect.Method;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * An instructing party, for example, an investment manager or its authorised
 * representative, sends the RedemptionOrder message to the executing party, for
 * example, a transfer agent, to instruct the redemption of one or more
 * financial instruments for one investment fund account.<br>
 * <b>Usage</b><br>
 * The RedemptionOrder message is used to instruct single redemption orders,
 * that is, a message containing one order for one financial instrument and
 * related to one investment account. The RedemptionOrder message may also be
 * used for multiple orders, that is, a message containing several orders
 * related to the same investment account for different financial instruments.<br>
 * For a single redemption order, the RedemptionOrder message, not the
 * RedemptionBulkOrder message, must be used.<br>
 * If there are redemption orders for the same financial instrument but for
 * different accounts, then the RedemptionBulkOrder message must be used.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderV03#mmMessageIdentification
 * RedemptionOrderV03.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderV03#mmPoolReference
 * RedemptionOrderV03.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderV03#mmPreviousReference
 * RedemptionOrderV03.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderV03#mmMultipleOrderDetails
 * RedemptionOrderV03.mmMultipleOrderDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderV03#mmRelatedPartyDetails
 * RedemptionOrderV03.mmRelatedPartyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderV03#mmCopyDetails
 * RedemptionOrderV03.mmCopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderV03#mmExtension
 * RedemptionOrderV03.mmExtension}</li>
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
 * xmlTag} = "RedOrdrV03"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesTradePreviousVersion
 * SecuritiesTradePreviousVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code setr.004.001.03}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintAccountIdentificationRule#forRedemptionOrderV03
 * ConstraintAccountIdentificationRule.forRedemptionOrderV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintRelatedPartiesDetailsRule#forRedemptionOrderV03
 * ConstraintRelatedPartiesDetailsRule.forRedemptionOrderV03}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RedemptionOrderV03"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nAn instructing party, for example, an investment manager or its authorised representative, sends the RedemptionOrder message to the executing party, for example, a transfer agent, to instruct the redemption of one or more financial instruments for one investment fund account.\r\nUsage\r\nThe RedemptionOrder message is used to instruct single redemption orders, that is, a message containing one order for one financial instrument and related to one investment account. The RedemptionOrder message may also be used for multiple orders, that is, a message containing several orders related to the same investment account for different financial instruments.\r\nFor a single redemption order, the RedemptionOrder message, not the RedemptionBulkOrder message, must be used.\r\nIf there are redemption orders for the same financial instrument but for different accounts, then the RedemptionBulkOrder message must be used."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.area.setr.RedemptionOrderV04
 * RedemptionOrderV04}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.setr.RedemptionMultipleOrderV02
 * RedemptionMultipleOrderV02}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "RedemptionOrderV03", propOrder = {"messageIdentification", "poolReference", "previousReference", "multipleOrderDetails", "relatedPartyDetails", "copyDetails", "extension"})
public class RedemptionOrderV03 {

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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderV04#mmMessageIdentification
	 * RedemptionOrderV04.mmMessageIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmMessageIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "MsgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageIdentification";
			definition = "Reference that uniquely identifies a message from a business application standpoint. ";
			nextVersions_lazy = () -> Arrays.asList(RedemptionOrderV04.mmMessageIdentification);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageIdentification1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return RedemptionOrderV03.class.getMethod("getMessageIdentification", new Class[]{});
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderV04#mmPoolReference
	 * RedemptionOrderV04.mmPoolReference}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmPoolReference = new MMMessageBuildingBlock() {
		{
			xmlTag = "PoolRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PoolReference";
			definition = "Collective reference identifying a set of messages.";
			nextVersions_lazy = () -> Arrays.asList(RedemptionOrderV04.mmPoolReference);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AdditionalReference3.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return RedemptionOrderV03.class.getMethod("getPoolReference", new Class[]{});
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderV04#mmPreviousReference
	 * RedemptionOrderV04.mmPreviousReference}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmPreviousReference = new MMMessageBuildingBlock() {
		{
			xmlTag = "PrvsRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousReference";
			definition = "Reference to a linked message that was previously sent.";
			nextVersions_lazy = () -> Arrays.asList(RedemptionOrderV04.mmPreviousReference);
			minOccurs = 0;
			complexType_lazy = () -> AdditionalReference3.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return RedemptionOrderV03.class.getMethod("getPreviousReference", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "MltplOrdrDtls", required = true)
	protected RedemptionMultipleOrder4 multipleOrderDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder4
	 * RedemptionMultipleOrder4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MltplOrdrDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MultipleOrderDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "General information related to the order."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderV04#mmMultipleOrderDetails
	 * RedemptionOrderV04.mmMultipleOrderDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmMultipleOrderDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "MltplOrdrDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MultipleOrderDetails";
			definition = "General information related to the order.";
			nextVersions_lazy = () -> Arrays.asList(RedemptionOrderV04.mmMultipleOrderDetails);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> RedemptionMultipleOrder4.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return RedemptionOrderV03.class.getMethod("getMultipleOrderDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "RltdPtyDtls")
	protected List<Intermediary8> relatedPartyDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Intermediary8
	 * Intermediary8}</li>
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
			complexType_lazy = () -> Intermediary8.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return RedemptionOrderV03.class.getMethod("getRelatedPartyDetails", new Class[]{});
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderV04#mmCopyDetails
	 * RedemptionOrderV04.mmCopyDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmCopyDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "CpyDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CopyDetails";
			definition = "Information provided when the message is a copy of a previous message.";
			nextVersions_lazy = () -> Arrays.asList(RedemptionOrderV04.mmCopyDetails);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CopyInformation2.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return RedemptionOrderV03.class.getMethod("getCopyDetails", new Class[]{});
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderV04#mmExtension
	 * RedemptionOrderV04.mmExtension}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmExtension = new MMMessageBuildingBlock() {
		{
			xmlTag = "Xtnsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Extension";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			nextVersions_lazy = () -> Arrays.asList(RedemptionOrderV04.mmExtension);
			minOccurs = 0;
			complexType_lazy = () -> Extension1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return RedemptionOrderV03.class.getMethod("getExtension", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAccountIdentificationRule.forRedemptionOrderV03,
						com.tools20022.repository.constraints.ConstraintRelatedPartiesDetailsRule.forRedemptionOrderV03);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RedemptionOrderV03";
				definition = "Scope\r\nAn instructing party, for example, an investment manager or its authorised representative, sends the RedemptionOrder message to the executing party, for example, a transfer agent, to instruct the redemption of one or more financial instruments for one investment fund account.\r\nUsage\r\nThe RedemptionOrder message is used to instruct single redemption orders, that is, a message containing one order for one financial instrument and related to one investment account. The RedemptionOrder message may also be used for multiple orders, that is, a message containing several orders related to the same investment account for different financial instruments.\r\nFor a single redemption order, the RedemptionOrder message, not the RedemptionBulkOrder message, must be used.\r\nIf there are redemption orders for the same financial instrument but for different accounts, then the RedemptionBulkOrder message must be used.";
				nextVersions_lazy = () -> Arrays.asList(RedemptionOrderV04.mmObject());
				previousVersion_lazy = () -> RedemptionMultipleOrderV02.mmObject();
				messageSet_lazy = () -> Arrays.asList(InvestmentFundsISOPreviousversion.mmObject());
				rootElement = "Document";
				xmlTag = "RedOrdrV03";
				businessArea_lazy = () -> SecuritiesTradePreviousVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.setr.RedemptionOrderV03.mmMessageIdentification, com.tools20022.repository.area.setr.RedemptionOrderV03.mmPoolReference,
						com.tools20022.repository.area.setr.RedemptionOrderV03.mmPreviousReference, com.tools20022.repository.area.setr.RedemptionOrderV03.mmMultipleOrderDetails,
						com.tools20022.repository.area.setr.RedemptionOrderV03.mmRelatedPartyDetails, com.tools20022.repository.area.setr.RedemptionOrderV03.mmCopyDetails, com.tools20022.repository.area.setr.RedemptionOrderV03.mmExtension);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "setr";
						messageFunctionality = "004";
						version = "03";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return RedemptionOrderV03.class;
			}
		});
		return mmObject_lazy.get();
	}

	public MessageIdentification1 getMessageIdentification() {
		return messageIdentification;
	}

	public RedemptionOrderV03 setMessageIdentification(MessageIdentification1 messageIdentification) {
		this.messageIdentification = Objects.requireNonNull(messageIdentification);
		return this;
	}

	public Optional<AdditionalReference3> getPoolReference() {
		return poolReference == null ? Optional.empty() : Optional.of(poolReference);
	}

	public RedemptionOrderV03 setPoolReference(AdditionalReference3 poolReference) {
		this.poolReference = poolReference;
		return this;
	}

	public List<AdditionalReference3> getPreviousReference() {
		return previousReference == null ? previousReference = new ArrayList<>() : previousReference;
	}

	public RedemptionOrderV03 setPreviousReference(List<AdditionalReference3> previousReference) {
		this.previousReference = Objects.requireNonNull(previousReference);
		return this;
	}

	public RedemptionMultipleOrder4 getMultipleOrderDetails() {
		return multipleOrderDetails;
	}

	public RedemptionOrderV03 setMultipleOrderDetails(RedemptionMultipleOrder4 multipleOrderDetails) {
		this.multipleOrderDetails = Objects.requireNonNull(multipleOrderDetails);
		return this;
	}

	public List<Intermediary8> getRelatedPartyDetails() {
		return relatedPartyDetails == null ? relatedPartyDetails = new ArrayList<>() : relatedPartyDetails;
	}

	public RedemptionOrderV03 setRelatedPartyDetails(List<Intermediary8> relatedPartyDetails) {
		this.relatedPartyDetails = Objects.requireNonNull(relatedPartyDetails);
		return this;
	}

	public Optional<CopyInformation2> getCopyDetails() {
		return copyDetails == null ? Optional.empty() : Optional.of(copyDetails);
	}

	public RedemptionOrderV03 setCopyDetails(CopyInformation2 copyDetails) {
		this.copyDetails = copyDetails;
		return this;
	}

	public List<Extension1> getExtension() {
		return extension == null ? extension = new ArrayList<>() : extension;
	}

	public RedemptionOrderV03 setExtension(List<Extension1> extension) {
		this.extension = Objects.requireNonNull(extension);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:setr.004.001.03")
	static public class Document {
		@XmlElement(name = "RedOrdrV03", required = true)
		public RedemptionOrderV03 messageBody;
	}
}