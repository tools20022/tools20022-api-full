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

import com.tools20022.metamodel.*;
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
 * RedemptionBulkOrderConfirmationCancellationInstruction message to the
 * instructing party, for example, an investment manager or its authorised
 * representative to cancel a previously sent RedemptionBulkOrderConfirmation.<br>
 * <b>Usage</b><br>
 * The RedemptionBulkOrderConfirmationCancellationInstruction message is used to
 * cancel one or more previously sent subscription order confirmations. The
 * amendment indicator element is used to specify whether the subscription order
 * confirmation cancellation is to be followed by a
 * RedemptionBulkOrderConfirmationAmendment.<br>
 * The RedemptionBulkOrderConfirmationCancellationInstruction message is used to
 * either:<br>
 * - cancel an entire RedemptionBulkOrderConfirmation message, that is, all the
 * individual order confirmations that it contained, or,<br>
 * - request the cancellation of one or more individual confirmations.<br>
 * There are two ways to use the message.<br>
 * (1) When the RedemptionBulkOrderConfirmationCancellationInstruction message
 * is used to cancel an entire message, this can be done by either:<br>
 * - quoting the business references, for example, OrderReference, Deal
 * Reference, of all the individual order confirmations listed in the
 * SubscriptionOrderConfirmation message, or,<br>
 * - quoting the details of all the individual order confirmations (this
 * includes the OrderReference and DealReference) listed in
 * SubscriptionOrderConfirmation message but this is not recommended.<br>
 * The message identification of the RedemptionBulkOrderConfirmation message may
 * also be quoted in PreviousReference.<br>
 * It is also possible to instruct the cancellation of an entire confirmation
 * message by quoting its message identification in PreviousReference, but this
 * is not recommended.<br>
 * (2) When the RedemptionBulkOrderConfirmationCancellationInstruction message
 * is used to cancel one or more individual order confirmations, this can be
 * done by either:<br>
 * - quoting the business references, for example, OrderReference, Deal
 * Reference, of each individual order confirmation listed in the
 * RedemptionBulkOrderConfirmation message, or,<br>
 * - quoting the details of each individual order execution (this includes the
 * OrderReference and DealReference) listed in RedemptionBulkOrderConfirmation
 * message but this is not recommended.<br>
 * The message identification of the RedemptionBulkOrderConfirmation message in
 * which the individual order confirmation was conveyed may also be quoted in
 * PreviousReference.
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
 * xmlTag} = "RedBlkOrdrConfCxlInstrV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationCancellationInstructionV01#mmCancellationByReferenceOrByOrderConfirmationDetailsRule
 * RedemptionBulkOrderConfirmationCancellationInstructionV01.
 * mmCancellationByReferenceOrByOrderConfirmationDetailsRule}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationCancellationInstructionV01#mmMessageIdentification
 * RedemptionBulkOrderConfirmationCancellationInstructionV01.
 * mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationCancellationInstructionV01#mmPoolReference
 * RedemptionBulkOrderConfirmationCancellationInstructionV01.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationCancellationInstructionV01#mmPreviousReference
 * RedemptionBulkOrderConfirmationCancellationInstructionV01.mmPreviousReference
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationCancellationInstructionV01#mmRelatedReference
 * RedemptionBulkOrderConfirmationCancellationInstructionV01.mmRelatedReference}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationCancellationInstructionV01#mmCancellationByReference
 * RedemptionBulkOrderConfirmationCancellationInstructionV01.
 * mmCancellationByReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationCancellationInstructionV01#mmCancellationByOrderConfirmationDetails
 * RedemptionBulkOrderConfirmationCancellationInstructionV01.
 * mmCancellationByOrderConfirmationDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationCancellationInstructionV01#mmCopyDetails
 * RedemptionBulkOrderConfirmationCancellationInstructionV01.mmCopyDetails}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code setr.053.001.01}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RedemptionBulkOrderConfirmationCancellationInstructionV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nAn executing party, for example, a transfer agent sends the RedemptionBulkOrderConfirmationCancellationInstruction message to the instructing party, for example, an investment manager or its authorised representative to cancel a previously sent RedemptionBulkOrderConfirmation.\r\nUsage\r\nThe RedemptionBulkOrderConfirmationCancellationInstruction message is used to cancel one or more previously sent subscription order confirmations. The amendment indicator element is used to specify whether the subscription order confirmation cancellation is to be followed by a RedemptionBulkOrderConfirmationAmendment.\r\nThe RedemptionBulkOrderConfirmationCancellationInstruction message is used to either:\r\n- cancel an entire RedemptionBulkOrderConfirmation message, that is, all the individual order confirmations that it contained, or,\r\n- request the cancellation of one or more individual confirmations.\r\nThere are two ways to use the message.\r\n(1) When the RedemptionBulkOrderConfirmationCancellationInstruction message is used to cancel an entire message, this can be done by either:\r\n- quoting the business references, for example, OrderReference, Deal Reference, of all the individual order confirmations listed in the SubscriptionOrderConfirmation message, or,\r\n- quoting the details of all the individual order confirmations (this includes the OrderReference and DealReference) listed in SubscriptionOrderConfirmation message but this is not recommended.\r\nThe message identification of the RedemptionBulkOrderConfirmation message may also be quoted in PreviousReference.\r\nIt is also possible to instruct the cancellation of an entire confirmation message by quoting its message identification in PreviousReference, but this is not recommended.\r\n(2) When the RedemptionBulkOrderConfirmationCancellationInstruction message is used to cancel one or more individual order confirmations, this can be done by either:\r\n- quoting the business references, for example, OrderReference, Deal Reference, of each individual order confirmation listed in the RedemptionBulkOrderConfirmation message, or,\r\n- quoting the details of each individual order execution (this includes the OrderReference and DealReference) listed in RedemptionBulkOrderConfirmation message but this is not recommended.\r\nThe message identification of the RedemptionBulkOrderConfirmation message in which the individual order confirmation was conveyed may also be quoted in PreviousReference."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationCancellationInstructionV02
 * RedemptionBulkOrderConfirmationCancellationInstructionV02}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "RedemptionBulkOrderConfirmationCancellationInstructionV01", propOrder = {"messageIdentification", "poolReference", "previousReference", "relatedReference", "cancellationByReference",
		"cancellationByOrderConfirmationDetails", "copyDetails"})
public class RedemptionBulkOrderConfirmationCancellationInstructionV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	/**
	 * Either CancellationByOrderConfirmationDetails or CancellationByReference
	 * may be present, but not both.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageDefinition
	 * messageDefinition} =
	 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationCancellationInstructionV01
	 * RedemptionBulkOrderConfirmationCancellationInstructionV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMXor#getImpactedMessageBuildingBlocks
	 * impactedMessageBuildingBlocks} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationCancellationInstructionV01#mmCancellationByReference
	 * RedemptionBulkOrderConfirmationCancellationInstructionV01.
	 * mmCancellationByReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationCancellationInstructionV01#mmCancellationByOrderConfirmationDetails
	 * RedemptionBulkOrderConfirmationCancellationInstructionV01.
	 * mmCancellationByOrderConfirmationDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationByReferenceOrByOrderConfirmationDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either CancellationByOrderConfirmationDetails or CancellationByReference may be present, but not both."
	 * </li>
	 * </ul>
	 */
	public static final MMXor mmCancellationByReferenceOrByOrderConfirmationDetailsRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationByReferenceOrByOrderConfirmationDetailsRule";
			definition = "Either CancellationByOrderConfirmationDetails or CancellationByReference may be present, but not both.";
			messageDefinition_lazy = () -> com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationCancellationInstructionV01.mmObject();
			impactedMessageBuildingBlocks_lazy = () -> Arrays.asList(com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationCancellationInstructionV01.mmCancellationByReference,
					com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationCancellationInstructionV01.mmCancellationByOrderConfirmationDetails);
		}
	};
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
	 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationCancellationInstructionV02#mmMessageIdentification
	 * RedemptionBulkOrderConfirmationCancellationInstructionV02.
	 * mmMessageIdentification}</li>
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
			nextVersions_lazy = () -> Arrays.asList(RedemptionBulkOrderConfirmationCancellationInstructionV02.mmMessageIdentification);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageIdentification1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return RedemptionBulkOrderConfirmationCancellationInstructionV01.class.getMethod("getMessageIdentification", new Class[]{});
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
	 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationCancellationInstructionV02#mmPoolReference
	 * RedemptionBulkOrderConfirmationCancellationInstructionV02.mmPoolReference
	 * }</li>
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
			nextVersions_lazy = () -> Arrays.asList(RedemptionBulkOrderConfirmationCancellationInstructionV02.mmPoolReference);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AdditionalReference3.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return RedemptionBulkOrderConfirmationCancellationInstructionV01.class.getMethod("getPoolReference", new Class[]{});
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
	 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationCancellationInstructionV02#mmPreviousReference
	 * RedemptionBulkOrderConfirmationCancellationInstructionV02.
	 * mmPreviousReference}</li>
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
			nextVersions_lazy = () -> Arrays.asList(RedemptionBulkOrderConfirmationCancellationInstructionV02.mmPreviousReference);
			minOccurs = 0;
			complexType_lazy = () -> AdditionalReference3.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return RedemptionBulkOrderConfirmationCancellationInstructionV01.class.getMethod("getPreviousReference", new Class[]{});
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
	 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationCancellationInstructionV02#mmRelatedReference
	 * RedemptionBulkOrderConfirmationCancellationInstructionV02.
	 * mmRelatedReference}</li>
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
			nextVersions_lazy = () -> Arrays.asList(RedemptionBulkOrderConfirmationCancellationInstructionV02.mmRelatedReference);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AdditionalReference3.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return RedemptionBulkOrderConfirmationCancellationInstructionV01.class.getMethod("getRelatedReference", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected InvestmentFundOrderExecution1 cancellationByReference;
	/**
	 * References of the orders to be cancelled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrderExecution1
	 * InvestmentFundOrderExecution1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CxlByRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationByReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "References of the orders to be cancelled."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmCancellationByReference = new MMMessageBuildingBlock() {
		{
			xmlTag = "CxlByRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationByReference";
			definition = "References of the orders to be cancelled.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> InvestmentFundOrderExecution1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return RedemptionBulkOrderConfirmationCancellationInstructionV01.class.getMethod("getCancellationByReference", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected OrderConfirmationDetails1 cancellationByOrderConfirmationDetails;
	/**
	 * Common information related to all the orders to be cancelled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.OrderConfirmationDetails1
	 * OrderConfirmationDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CxlByOrdrConfDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationByOrderConfirmationDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Common information related to all the orders to be cancelled."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmCancellationByOrderConfirmationDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "CxlByOrdrConfDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationByOrderConfirmationDetails";
			definition = "Common information related to all the orders to be cancelled.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> OrderConfirmationDetails1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return RedemptionBulkOrderConfirmationCancellationInstructionV01.class.getMethod("getCancellationByOrderConfirmationDetails", new Class[]{});
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
	 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationCancellationInstructionV02#mmCopyDetails
	 * RedemptionBulkOrderConfirmationCancellationInstructionV02.mmCopyDetails}</li>
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
			nextVersions_lazy = () -> Arrays.asList(RedemptionBulkOrderConfirmationCancellationInstructionV02.mmCopyDetails);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CopyInformation2.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return RedemptionBulkOrderConfirmationCancellationInstructionV01.class.getMethod("getCopyDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RedemptionBulkOrderConfirmationCancellationInstructionV01";
				definition = "Scope\r\nAn executing party, for example, a transfer agent sends the RedemptionBulkOrderConfirmationCancellationInstruction message to the instructing party, for example, an investment manager or its authorised representative to cancel a previously sent RedemptionBulkOrderConfirmation.\r\nUsage\r\nThe RedemptionBulkOrderConfirmationCancellationInstruction message is used to cancel one or more previously sent subscription order confirmations. The amendment indicator element is used to specify whether the subscription order confirmation cancellation is to be followed by a RedemptionBulkOrderConfirmationAmendment.\r\nThe RedemptionBulkOrderConfirmationCancellationInstruction message is used to either:\r\n- cancel an entire RedemptionBulkOrderConfirmation message, that is, all the individual order confirmations that it contained, or,\r\n- request the cancellation of one or more individual confirmations.\r\nThere are two ways to use the message.\r\n(1) When the RedemptionBulkOrderConfirmationCancellationInstruction message is used to cancel an entire message, this can be done by either:\r\n- quoting the business references, for example, OrderReference, Deal Reference, of all the individual order confirmations listed in the SubscriptionOrderConfirmation message, or,\r\n- quoting the details of all the individual order confirmations (this includes the OrderReference and DealReference) listed in SubscriptionOrderConfirmation message but this is not recommended.\r\nThe message identification of the RedemptionBulkOrderConfirmation message may also be quoted in PreviousReference.\r\nIt is also possible to instruct the cancellation of an entire confirmation message by quoting its message identification in PreviousReference, but this is not recommended.\r\n(2) When the RedemptionBulkOrderConfirmationCancellationInstruction message is used to cancel one or more individual order confirmations, this can be done by either:\r\n- quoting the business references, for example, OrderReference, Deal Reference, of each individual order confirmation listed in the RedemptionBulkOrderConfirmation message, or,\r\n- quoting the details of each individual order execution (this includes the OrderReference and DealReference) listed in RedemptionBulkOrderConfirmation message but this is not recommended.\r\nThe message identification of the RedemptionBulkOrderConfirmation message in which the individual order confirmation was conveyed may also be quoted in PreviousReference.";
				nextVersions_lazy = () -> Arrays.asList(RedemptionBulkOrderConfirmationCancellationInstructionV02.mmObject());
				messageSet_lazy = () -> Arrays.asList(InvestmentFundsISOPreviousversion.mmObject());
				xors_lazy = () -> Arrays.asList(com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationCancellationInstructionV01.mmCancellationByReferenceOrByOrderConfirmationDetailsRule);
				rootElement = "Document";
				xmlTag = "RedBlkOrdrConfCxlInstrV01";
				businessArea_lazy = () -> SecuritiesTradePreviousVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationCancellationInstructionV01.mmMessageIdentification,
						com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationCancellationInstructionV01.mmPoolReference,
						com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationCancellationInstructionV01.mmPreviousReference,
						com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationCancellationInstructionV01.mmRelatedReference,
						com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationCancellationInstructionV01.mmCancellationByReference,
						com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationCancellationInstructionV01.mmCancellationByOrderConfirmationDetails,
						com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationCancellationInstructionV01.mmCopyDetails);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "setr";
						messageFunctionality = "053";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return RedemptionBulkOrderConfirmationCancellationInstructionV01.class;
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

	@XmlElement(name = "CxlByRef")
	public InvestmentFundOrderExecution1 getCancellationByReference() {
		return cancellationByReference;
	}

	public void setCancellationByReference(InvestmentFundOrderExecution1 cancellationByReference) {
		this.cancellationByReference = cancellationByReference;
	}

	@XmlElement(name = "CxlByOrdrConfDtls")
	public OrderConfirmationDetails1 getCancellationByOrderConfirmationDetails() {
		return cancellationByOrderConfirmationDetails;
	}

	public void setCancellationByOrderConfirmationDetails(OrderConfirmationDetails1 cancellationByOrderConfirmationDetails) {
		this.cancellationByOrderConfirmationDetails = cancellationByOrderConfirmationDetails;
	}

	@XmlElement(name = "CpyDtls")
	public CopyInformation2 getCopyDetails() {
		return copyDetails;
	}

	public void setCopyDetails(CopyInformation2 copyDetails) {
		this.copyDetails = copyDetails;
	}

	@XmlRootElement(namespace = "urn:iso:std:iso:20022:tech:xsd:setr.053.01.01")
	static public class Document {
		@XmlElement(name = "RedBlkOrdrConfCxlInstrV01", required = true)
		public RedemptionBulkOrderConfirmationCancellationInstructionV01 messageBody;
	}
}