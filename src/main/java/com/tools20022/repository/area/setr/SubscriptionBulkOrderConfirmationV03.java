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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * An executing party, for example, a transfer agent sends the
 * SubscriptionBulkOrderConfirmation message to the instructing party, for
 * example, an investment manager or its authorised representative to confirm
 * the details of the execution of a SubscriptionBulkOrder instruction.<br>
 * <b>Usage</b><br>
 * The SubscriptionBulkOrderConfirmation message is used to confirm the
 * execution of all individual orders.<br>
 * There is usually one bulk confirmation message for one bulk order message.<br>
 * Each individual order confirmation specified is identified in DealReference.
 * The reference of the original individual order is specified in
 * OrderReference. The message identification of the SubscriptionBulkOrder
 * message in which the individual order was conveyed may also be quoted in
 * RelatedReference.<br>
 * A SubscriptionBulkOrder must in all cases be responded to by a
 * SubscriptionBulkOrderConfirmation and in no circumstances by a
 * SubscriptionOrderConfirmation.<br>
 * If the executing party needs to confirm a SubscriptionOrder instruction, then
 * the SubscriptionOrderConfirmation must be used.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesTradePreviousVersion
 * SecuritiesTradePreviousVersion}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.InvestmentFundsISOPreviousversion
 * InvestmentFundsISOPreviousversion}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "SbcptBlkOrdrConfV03"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationV03#mmMessageIdentification
 * SubscriptionBulkOrderConfirmationV03.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationV03#mmPoolReference
 * SubscriptionBulkOrderConfirmationV03.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationV03#mmPreviousReference
 * SubscriptionBulkOrderConfirmationV03.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationV03#mmRelatedReference
 * SubscriptionBulkOrderConfirmationV03.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationV03#mmBulkExecutionDetails
 * SubscriptionBulkOrderConfirmationV03.mmBulkExecutionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationV03#mmRelatedPartyDetails
 * SubscriptionBulkOrderConfirmationV03.mmRelatedPartyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationV03#mmCopyDetails
 * SubscriptionBulkOrderConfirmationV03.mmCopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationV03#mmExtension
 * SubscriptionBulkOrderConfirmationV03.mmExtension}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code setr.009.001.03}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SubscriptionBulkOrderConfirmationV03"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nAn executing party, for example, a transfer agent sends the SubscriptionBulkOrderConfirmation message to the instructing party, for example, an investment manager or its authorised representative to confirm the details of the execution of a SubscriptionBulkOrder instruction.\r\nUsage\r\nThe SubscriptionBulkOrderConfirmation message is used to confirm the execution of all individual orders.\r\nThere is usually one bulk confirmation message for one bulk order message.\r\nEach individual order confirmation specified is identified in DealReference. The reference of the original individual order is specified in OrderReference. The message identification of the SubscriptionBulkOrder message in which the individual order was conveyed may also be quoted in RelatedReference.\r\nA SubscriptionBulkOrder must in all cases be responded to by a SubscriptionBulkOrderConfirmation and in no circumstances by a SubscriptionOrderConfirmation.\r\nIf the executing party needs to confirm a SubscriptionOrder instruction, then the SubscriptionOrderConfirmation must be used."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationV04
 * SubscriptionBulkOrderConfirmationV04}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationV02
 * SubscriptionBulkOrderConfirmationV02}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "SubscriptionBulkOrderConfirmationV03", propOrder = {"messageIdentification", "poolReference", "previousReference", "relatedReference", "bulkExecutionDetails", "relatedPartyDetails", "copyDetails", "extension"})
public class SubscriptionBulkOrderConfirmationV03 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	protected MessageIdentification1 messageIdentification;
	/**
	 * Reference that uniquely identifies a message from a business application
	 * standpoint.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationV04#mmMessageIdentification
	 * SubscriptionBulkOrderConfirmationV04.mmMessageIdentification}</li>
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
			nextVersions_lazy = () -> Arrays.asList(SubscriptionBulkOrderConfirmationV04.mmMessageIdentification);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageIdentification1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SubscriptionBulkOrderConfirmationV03.class.getMethod("getMessageIdentification", new Class[]{});
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationV04#mmPoolReference
	 * SubscriptionBulkOrderConfirmationV04.mmPoolReference}</li>
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
			nextVersions_lazy = () -> Arrays.asList(SubscriptionBulkOrderConfirmationV04.mmPoolReference);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AdditionalReference3.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SubscriptionBulkOrderConfirmationV03.class.getMethod("getPoolReference", new Class[]{});
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationV04#mmPreviousReference
	 * SubscriptionBulkOrderConfirmationV04.mmPreviousReference}</li>
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
			nextVersions_lazy = () -> Arrays.asList(SubscriptionBulkOrderConfirmationV04.mmPreviousReference);
			minOccurs = 0;
			complexType_lazy = () -> AdditionalReference3.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SubscriptionBulkOrderConfirmationV03.class.getMethod("getPreviousReference", new Class[]{});
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationV04#mmRelatedReference
	 * SubscriptionBulkOrderConfirmationV04.mmRelatedReference}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmRelatedReference = new MMMessageBuildingBlock() {
		{
			xmlTag = "RltdRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedReference";
			definition = "Reference to a linked message that was previously received.";
			nextVersions_lazy = () -> Arrays.asList(SubscriptionBulkOrderConfirmationV04.mmRelatedReference);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AdditionalReference3.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SubscriptionBulkOrderConfirmationV03.class.getMethod("getRelatedReference", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected SubscriptionBulkExecution3 bulkExecutionDetails;
	/**
	 * General information related to the execution of investment orders.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkExecution3
	 * SubscriptionBulkExecution3}</li>
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
	 * "General information related to the execution of investment orders."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationV04#mmBulkExecutionDetails
	 * SubscriptionBulkOrderConfirmationV04.mmBulkExecutionDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmBulkExecutionDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "BlkExctnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BulkExecutionDetails";
			definition = "General information related to the execution of investment orders.";
			nextVersions_lazy = () -> Arrays.asList(SubscriptionBulkOrderConfirmationV04.mmBulkExecutionDetails);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SubscriptionBulkExecution3.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SubscriptionBulkOrderConfirmationV03.class.getMethod("getBulkExecutionDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<Intermediary9> relatedPartyDetails;
	/**
	 * Information about parties related to the transaction.
	 * <p>
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
				return SubscriptionBulkOrderConfirmationV03.class.getMethod("getRelatedPartyDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CopyInformation2 copyDetails;
	/**
	 * Information provided when the message is a copy of a previous message.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationV04#mmCopyDetails
	 * SubscriptionBulkOrderConfirmationV04.mmCopyDetails}</li>
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
			nextVersions_lazy = () -> Arrays.asList(SubscriptionBulkOrderConfirmationV04.mmCopyDetails);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CopyInformation2.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SubscriptionBulkOrderConfirmationV03.class.getMethod("getCopyDetails", new Class[]{});
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationV04#mmExtension
	 * SubscriptionBulkOrderConfirmationV04.mmExtension}</li>
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
			nextVersions_lazy = () -> Arrays.asList(SubscriptionBulkOrderConfirmationV04.mmExtension);
			minOccurs = 0;
			complexType_lazy = () -> Extension1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SubscriptionBulkOrderConfirmationV03.class.getMethod("getExtension", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SubscriptionBulkOrderConfirmationV03";
				definition = "Scope\r\nAn executing party, for example, a transfer agent sends the SubscriptionBulkOrderConfirmation message to the instructing party, for example, an investment manager or its authorised representative to confirm the details of the execution of a SubscriptionBulkOrder instruction.\r\nUsage\r\nThe SubscriptionBulkOrderConfirmation message is used to confirm the execution of all individual orders.\r\nThere is usually one bulk confirmation message for one bulk order message.\r\nEach individual order confirmation specified is identified in DealReference. The reference of the original individual order is specified in OrderReference. The message identification of the SubscriptionBulkOrder message in which the individual order was conveyed may also be quoted in RelatedReference.\r\nA SubscriptionBulkOrder must in all cases be responded to by a SubscriptionBulkOrderConfirmation and in no circumstances by a SubscriptionOrderConfirmation.\r\nIf the executing party needs to confirm a SubscriptionOrder instruction, then the SubscriptionOrderConfirmation must be used.";
				nextVersions_lazy = () -> Arrays.asList(SubscriptionBulkOrderConfirmationV04.mmObject());
				previousVersion_lazy = () -> SubscriptionBulkOrderConfirmationV02.mmObject();
				messageSet_lazy = () -> Arrays.asList(InvestmentFundsISOPreviousversion.mmObject());
				rootElement = "Document";
				xmlTag = "SbcptBlkOrdrConfV03";
				businessArea_lazy = () -> SecuritiesTradePreviousVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationV03.mmMessageIdentification,
						com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationV03.mmPoolReference, com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationV03.mmPreviousReference,
						com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationV03.mmRelatedReference, com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationV03.mmBulkExecutionDetails,
						com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationV03.mmRelatedPartyDetails, com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationV03.mmCopyDetails,
						com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationV03.mmExtension);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "setr";
						messageFunctionality = "009";
						version = "03";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return SubscriptionBulkOrderConfirmationV03.class;
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "MsgId", required = true)
	public MessageIdentification1 getMessageIdentification() {
		return messageIdentification;
	}

	public void setMessageIdentification(MessageIdentification1 messageIdentification) {
		this.messageIdentification = messageIdentification;
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

	@XmlElement(name = "RltdRef")
	public AdditionalReference3 getRelatedReference() {
		return relatedReference;
	}

	public void setRelatedReference(AdditionalReference3 relatedReference) {
		this.relatedReference = relatedReference;
	}

	@XmlElement(name = "BlkExctnDtls", required = true)
	public SubscriptionBulkExecution3 getBulkExecutionDetails() {
		return bulkExecutionDetails;
	}

	public void setBulkExecutionDetails(SubscriptionBulkExecution3 bulkExecutionDetails) {
		this.bulkExecutionDetails = bulkExecutionDetails;
	}

	@XmlElement(name = "RltdPtyDtls")
	public List<Intermediary9> getRelatedPartyDetails() {
		return relatedPartyDetails;
	}

	public void setRelatedPartyDetails(List<Intermediary9> relatedPartyDetails) {
		this.relatedPartyDetails = relatedPartyDetails;
	}

	@XmlElement(name = "CpyDtls")
	public CopyInformation2 getCopyDetails() {
		return copyDetails;
	}

	public void setCopyDetails(CopyInformation2 copyDetails) {
		this.copyDetails = copyDetails;
	}

	@XmlElement(name = "Xtnsn")
	public List<Extension1> getExtension() {
		return extension;
	}

	public void setExtension(List<Extension1> extension) {
		this.extension = extension;
	}

	@XmlRootElement(namespace = "urn:iso:std:iso:20022:tech:xsd:setr.009.03.03")
	static public class Document {
		@XmlElement(name = "SbcptBlkOrdrConfV03", required = true)
		public SubscriptionBulkOrderConfirmationV03 messageBody;
	}
}