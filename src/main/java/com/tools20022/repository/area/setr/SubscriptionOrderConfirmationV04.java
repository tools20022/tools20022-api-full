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
import com.tools20022.repository.msgset.InvestmentFundsISOLatestversion;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The SubscriptionOrderConfirmation message is sent by an executing party, for
 * example, a transfer agent, to the instructing party, for example, an
 * investment manager or its authorised representative, to confirm the details
 * of the execution of a SubscriptionOrder instruction.<br>
 * <b>Usage</b><br>
 * The SubscriptionOrderConfirmation message is used to confirm the execution of
 * one or more individual orders.<br>
 * A SubscriptionOrder message containing more than one individual order may be
 * responded to by more than one SubscriptionOrderConfirmation message, as the
 * valuation cycle of the financial instruments in each individual order may be
 * different. When a SubscriptionOrderConfirmation message contains fewer
 * confirmations that originally instructed in the original SubscriptionOrder
 * message, there is no specification indication in the confirmation for this.
 * Reconciliation must be based on the references.<br>
 * Each individual order confirmation specified is identified in DealReference.
 * The reference of the original individual order is specified in
 * OrderReference. The message identification of the SubscriptionOrder message
 * in which the individual orders was conveyed may also be quoted in
 * RelatedReference but this is not recommended.<br>
 * <br>
 * A SubscriptionOrder must in all cases be responded to by a
 * SubscriptionOrderConfirmation message and in no circumstances by a
 * SubscriptionBulkOrderConfirmation message.<br>
 * If the executing party needs to confirm one or more subscription orders for
 * the same financial instrument, then a SubscriptionBulkOrderConfirmation
 * message must be used.<br>
 * When the message is used to convey a confirmation amendment/s, the
 * AmendmentIndicator must be present with the value ‘true’ or ‘1’. When this is
 * the case, the message must only contain a confirmation amendment/s and not
 * contain both a confirmation amendment/s and a ‘new’ confirmation/s.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesTradeLatestVersion
 * SecuritiesTradeLatestVersion}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.InvestmentFundsISOLatestversion
 * InvestmentFundsISOLatestversion}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "SbcptOrdrConf"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderConfirmationV04#mmMessageIdentification
 * SubscriptionOrderConfirmationV04.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderConfirmationV04#mmPoolReference
 * SubscriptionOrderConfirmationV04.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderConfirmationV04#mmPreviousReference
 * SubscriptionOrderConfirmationV04.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderConfirmationV04#mmRelatedReference
 * SubscriptionOrderConfirmationV04.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderConfirmationV04#mmMultipleExecutionDetails
 * SubscriptionOrderConfirmationV04.mmMultipleExecutionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderConfirmationV04#mmCopyDetails
 * SubscriptionOrderConfirmationV04.mmCopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderConfirmationV04#mmExtension
 * SubscriptionOrderConfirmationV04.mmExtension}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code setr.012.001.04}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SubscriptionOrderConfirmationV04"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe SubscriptionOrderConfirmation message is sent by an executing party, for example, a transfer agent, to the instructing party, for example, an investment manager or its authorised representative, to confirm the details of the execution of a SubscriptionOrder instruction.\r\nUsage\r\nThe SubscriptionOrderConfirmation message is used to confirm the execution of one or more individual orders.\r\nA SubscriptionOrder message containing more than one individual order may be responded to by more than one SubscriptionOrderConfirmation message, as the valuation cycle of the financial instruments in each individual order may be different. When a SubscriptionOrderConfirmation message contains fewer confirmations that originally instructed in the original SubscriptionOrder message, there is no specification indication in the confirmation for this. Reconciliation must be based on the references.\r\nEach individual order confirmation specified is identified in DealReference. The reference of the original individual order is specified in OrderReference. The message identification of the SubscriptionOrder message in which the individual orders was conveyed may also be quoted in RelatedReference but this is not recommended.\r\n\r\nA SubscriptionOrder must in all cases be responded to by a SubscriptionOrderConfirmation message and in no circumstances by a SubscriptionBulkOrderConfirmation message.\r\nIf the executing party needs to confirm one or more subscription orders for the same financial instrument, then a SubscriptionBulkOrderConfirmation message must be used.\r\nWhen the message is used to convey a confirmation amendment/s, the AmendmentIndicator must be present with the value ‘true’ or ‘1’. When this is the case, the message must only contain a confirmation amendment/s and not contain both a confirmation amendment/s and a ‘new’ confirmation/s."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderConfirmationV03
 * SubscriptionOrderConfirmationV03}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "SubscriptionOrderConfirmationV04", propOrder = {"messageIdentification", "poolReference", "previousReference", "relatedReference", "multipleExecutionDetails", "copyDetails", "extension"})
public class SubscriptionOrderConfirmationV04 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	protected MessageIdentification1 messageIdentification;
	/**
	 * Reference that uniquely identifies the message from a business
	 * application standpoint.
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
	 * "Reference that uniquely identifies the message from a business application standpoint. "
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderConfirmationV03#mmMessageIdentification
	 * SubscriptionOrderConfirmationV03.mmMessageIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmMessageIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "MsgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageIdentification";
			definition = "Reference that uniquely identifies the message from a business application standpoint. ";
			previousVersion_lazy = () -> SubscriptionOrderConfirmationV03.mmMessageIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageIdentification1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SubscriptionOrderConfirmationV04.class.getMethod("getMessageIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected AdditionalReference9 poolReference;
	/**
	 * Collective reference identifying a set of messages.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference9
	 * AdditionalReference9}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderConfirmationV03#mmPoolReference
	 * SubscriptionOrderConfirmationV03.mmPoolReference}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmPoolReference = new MMMessageBuildingBlock() {
		{
			xmlTag = "PoolRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PoolReference";
			definition = "Collective reference identifying a set of messages.";
			previousVersion_lazy = () -> SubscriptionOrderConfirmationV03.mmPoolReference;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AdditionalReference9.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SubscriptionOrderConfirmationV04.class.getMethod("getPoolReference", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<AdditionalReference8> previousReference;
	/**
	 * Reference to a linked message that was previously sent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference8
	 * AdditionalReference8}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderConfirmationV03#mmPreviousReference
	 * SubscriptionOrderConfirmationV03.mmPreviousReference}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmPreviousReference = new MMMessageBuildingBlock() {
		{
			xmlTag = "PrvsRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousReference";
			definition = "Reference to a linked message that was previously sent.";
			previousVersion_lazy = () -> SubscriptionOrderConfirmationV03.mmPreviousReference;
			minOccurs = 0;
			complexType_lazy = () -> AdditionalReference8.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SubscriptionOrderConfirmationV04.class.getMethod("getPreviousReference", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected AdditionalReference8 relatedReference;
	/**
	 * Reference to a linked message that was previously received.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference8
	 * AdditionalReference8}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderConfirmationV03#mmRelatedReference
	 * SubscriptionOrderConfirmationV03.mmRelatedReference}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmRelatedReference = new MMMessageBuildingBlock() {
		{
			xmlTag = "RltdRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedReference";
			definition = "Reference to a linked message that was previously received.";
			previousVersion_lazy = () -> SubscriptionOrderConfirmationV03.mmRelatedReference;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AdditionalReference8.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SubscriptionOrderConfirmationV04.class.getMethod("getRelatedReference", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected SubscriptionMultipleExecution5 multipleExecutionDetails;
	/**
	 * General information related to the execution of the orders.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleExecution5
	 * SubscriptionMultipleExecution5}</li>
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
	 * "General information related to the execution of the orders."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderConfirmationV03#mmMultipleExecutionDetails
	 * SubscriptionOrderConfirmationV03.mmMultipleExecutionDetails}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmMultipleExecutionDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "MltplExctnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MultipleExecutionDetails";
			definition = "General information related to the execution of the orders.";
			previousVersion_lazy = () -> SubscriptionOrderConfirmationV03.mmMultipleExecutionDetails;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SubscriptionMultipleExecution5.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SubscriptionOrderConfirmationV04.class.getMethod("getMultipleExecutionDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CopyInformation4 copyDetails;
	/**
	 * Information provided when the message is a copy of a previous message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CopyInformation4
	 * CopyInformation4}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderConfirmationV03#mmCopyDetails
	 * SubscriptionOrderConfirmationV03.mmCopyDetails}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmCopyDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "CpyDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CopyDetails";
			definition = "Information provided when the message is a copy of a previous message.";
			previousVersion_lazy = () -> SubscriptionOrderConfirmationV03.mmCopyDetails;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CopyInformation4.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SubscriptionOrderConfirmationV04.class.getMethod("getCopyDetails", new Class[]{});
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderConfirmationV03#mmExtension
	 * SubscriptionOrderConfirmationV03.mmExtension}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmExtension = new MMMessageBuildingBlock() {
		{
			xmlTag = "Xtnsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Extension";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			previousVersion_lazy = () -> SubscriptionOrderConfirmationV03.mmExtension;
			minOccurs = 0;
			complexType_lazy = () -> Extension1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SubscriptionOrderConfirmationV04.class.getMethod("getExtension", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SubscriptionOrderConfirmationV04";
				definition = "Scope\r\nThe SubscriptionOrderConfirmation message is sent by an executing party, for example, a transfer agent, to the instructing party, for example, an investment manager or its authorised representative, to confirm the details of the execution of a SubscriptionOrder instruction.\r\nUsage\r\nThe SubscriptionOrderConfirmation message is used to confirm the execution of one or more individual orders.\r\nA SubscriptionOrder message containing more than one individual order may be responded to by more than one SubscriptionOrderConfirmation message, as the valuation cycle of the financial instruments in each individual order may be different. When a SubscriptionOrderConfirmation message contains fewer confirmations that originally instructed in the original SubscriptionOrder message, there is no specification indication in the confirmation for this. Reconciliation must be based on the references.\r\nEach individual order confirmation specified is identified in DealReference. The reference of the original individual order is specified in OrderReference. The message identification of the SubscriptionOrder message in which the individual orders was conveyed may also be quoted in RelatedReference but this is not recommended.\r\n\r\nA SubscriptionOrder must in all cases be responded to by a SubscriptionOrderConfirmation message and in no circumstances by a SubscriptionBulkOrderConfirmation message.\r\nIf the executing party needs to confirm one or more subscription orders for the same financial instrument, then a SubscriptionBulkOrderConfirmation message must be used.\r\nWhen the message is used to convey a confirmation amendment/s, the AmendmentIndicator must be present with the value ‘true’ or ‘1’. When this is the case, the message must only contain a confirmation amendment/s and not contain both a confirmation amendment/s and a ‘new’ confirmation/s.";
				previousVersion_lazy = () -> SubscriptionOrderConfirmationV03.mmObject();
				messageSet_lazy = () -> Arrays.asList(InvestmentFundsISOLatestversion.mmObject());
				rootElement = "Document";
				xmlTag = "SbcptOrdrConf";
				businessArea_lazy = () -> SecuritiesTradeLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.setr.SubscriptionOrderConfirmationV04.mmMessageIdentification,
						com.tools20022.repository.area.setr.SubscriptionOrderConfirmationV04.mmPoolReference, com.tools20022.repository.area.setr.SubscriptionOrderConfirmationV04.mmPreviousReference,
						com.tools20022.repository.area.setr.SubscriptionOrderConfirmationV04.mmRelatedReference, com.tools20022.repository.area.setr.SubscriptionOrderConfirmationV04.mmMultipleExecutionDetails,
						com.tools20022.repository.area.setr.SubscriptionOrderConfirmationV04.mmCopyDetails, com.tools20022.repository.area.setr.SubscriptionOrderConfirmationV04.mmExtension);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "setr";
						messageFunctionality = "012";
						version = "04";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return SubscriptionOrderConfirmationV04.class;
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
	public AdditionalReference9 getPoolReference() {
		return poolReference;
	}

	public void setPoolReference(AdditionalReference9 poolReference) {
		this.poolReference = poolReference;
	}

	@XmlElement(name = "PrvsRef")
	public List<AdditionalReference8> getPreviousReference() {
		return previousReference;
	}

	public void setPreviousReference(List<AdditionalReference8> previousReference) {
		this.previousReference = previousReference;
	}

	@XmlElement(name = "RltdRef")
	public AdditionalReference8 getRelatedReference() {
		return relatedReference;
	}

	public void setRelatedReference(AdditionalReference8 relatedReference) {
		this.relatedReference = relatedReference;
	}

	@XmlElement(name = "MltplExctnDtls", required = true)
	public SubscriptionMultipleExecution5 getMultipleExecutionDetails() {
		return multipleExecutionDetails;
	}

	public void setMultipleExecutionDetails(SubscriptionMultipleExecution5 multipleExecutionDetails) {
		this.multipleExecutionDetails = multipleExecutionDetails;
	}

	@XmlElement(name = "CpyDtls")
	public CopyInformation4 getCopyDetails() {
		return copyDetails;
	}

	public void setCopyDetails(CopyInformation4 copyDetails) {
		this.copyDetails = copyDetails;
	}

	@XmlElement(name = "Xtnsn")
	public List<Extension1> getExtension() {
		return extension;
	}

	public void setExtension(List<Extension1> extension) {
		this.extension = extension;
	}

	@XmlRootElement(namespace = "urn:iso:std:iso:20022:tech:xsd:setr.012.04.04")
	static public class Document {
		@XmlElement(name = "SbcptOrdrConf", required = true)
		public SubscriptionOrderConfirmationV04 messageBody;
	}
}