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
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * An instructing party, for example, an investment manager or its authorised
 * representative, sends the SubscriptionOrderCancellationRequest message to the
 * executing party, for example, a transfer agent, to request the cancellation
 * of a previously sent SubscriptionOrder.<br>
 * <b>Usage</b><br>
 * The SubscriptionOrderCancellationRequest message is used to either:<br>
 * - request the cancellation of an entire SubscriptionOrder message, that is,
 * all the individual orders that it contained, or,<br>
 * - request the cancellation of one or more individual orders.<br>
 * There is no amendment, but a cancellation and re-instruct policy.<br>
 * There are two ways to use the message:<br>
 * (1) When the SubscriptionOrderCancellationRequest message is used to request
 * the cancellation of an entire SubscriptionOrder message, this can be done by
 * either:<br>
 * - quoting the order references of all the individual orders listed in the
 * SubscriptionOrder message, or,<br>
 * - quoting the details of all the individual orders (this includes the
 * OrderReference) listed in SubscriptionOrder message, but this is not
 * recommended.<br>
 * The message identification of the SubscriptionOrder message may also be
 * quoted in PreviousReference.<br>
 * It is also possible to request the cancellation of an entire
 * SubscriptionOrder message by quoting its message identification in
 * PreviousReference, but this is not recommended.<br>
 * (2) When the SubscriptionOrderCancellationRequest message is used to request
 * the cancellation of one or more individual orders, this can be done by
 * either:<br>
 * - quoting the OrderReference of each individual order listed in the
 * SubscriptionOrder message, or,<br>
 * - quoting the details of each individual order (including the OrderReference)
 * listed in SubscriptionOrder message, but this is not recommended.<br>
 * The message identification of the SubscriptionOrder message in which the
 * individual order was conveyed may also be quoted in PreviousReference.<br>
 * The deadline and acceptance of a cancellation request is subject to a service
 * level agreement (SLA). This cancellation message is a cancellation request.
 * There is no automatic acceptance of the cancellation.<br>
 * The rejection or acceptance of a SubscriptionOrderCancellationRequest is made
 * using an OrderCancellationStatusReport message.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderCancellationRequestV03#CancellationByReferenceOrByOrderDetailsRule
 * SubscriptionOrderCancellationRequestV03.
 * CancellationByReferenceOrByOrderDetailsRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderCancellationRequestV03#mmMessageIdentification
 * SubscriptionOrderCancellationRequestV03.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderCancellationRequestV03#mmPoolReference
 * SubscriptionOrderCancellationRequestV03.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderCancellationRequestV03#mmPreviousReference
 * SubscriptionOrderCancellationRequestV03.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderCancellationRequestV03#mmCancellationByReference
 * SubscriptionOrderCancellationRequestV03.mmCancellationByReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderCancellationRequestV03#mmCancellationByOrderDetails
 * SubscriptionOrderCancellationRequestV03.mmCancellationByOrderDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderCancellationRequestV03#mmCopyDetails
 * SubscriptionOrderCancellationRequestV03.mmCopyDetails}</li>
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
 * xmlTag} = "SbcptOrdrCxlReqV03"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesTradePreviousVersion
 * SecuritiesTradePreviousVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code setr.011.001.03}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintAccountIdentificationRule#forSubscriptionOrderCancellationRequestV03
 * ConstraintAccountIdentificationRule.
 * forSubscriptionOrderCancellationRequestV03}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SubscriptionOrderCancellationRequestV03"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nAn instructing party, for example, an investment manager or its authorised representative, sends the SubscriptionOrderCancellationRequest message to the executing party, for example, a transfer agent, to request the cancellation of a previously sent SubscriptionOrder.\r\nUsage\r\nThe SubscriptionOrderCancellationRequest message is used to either:\r\n- request the cancellation of an entire SubscriptionOrder message, that is, all the individual orders that it contained, or,\r\n- request the cancellation of one or more individual orders.\r\nThere is no amendment, but a cancellation and re-instruct policy.\r\nThere are two ways to use the message:\r\n(1) When the SubscriptionOrderCancellationRequest message is used to request the cancellation of an entire SubscriptionOrder message, this can be done by either:\r\n- quoting the order references of all the individual orders listed in the SubscriptionOrder message, or,\r\n- quoting the details of all the individual orders (this includes the OrderReference) listed in SubscriptionOrder message, but this is not recommended.\r\nThe message identification of the SubscriptionOrder message may also be quoted in PreviousReference.\r\nIt is also possible to request the cancellation of an entire SubscriptionOrder message by quoting its message identification in PreviousReference, but this is not recommended.\r\n(2) When the SubscriptionOrderCancellationRequest message is used to request the cancellation of one or more individual orders, this can be done by either:\r\n- quoting the OrderReference of each individual order listed in the SubscriptionOrder message, or,\r\n- quoting the details of each individual order (including the OrderReference) listed in SubscriptionOrder message, but this is not recommended.\r\nThe message identification of the SubscriptionOrder message in which the individual order was conveyed may also be quoted in PreviousReference.\r\nThe deadline and acceptance of a cancellation request is subject to a service level agreement (SLA). This cancellation message is a cancellation request. There is no automatic acceptance of the cancellation.\r\nThe rejection or acceptance of a SubscriptionOrderCancellationRequest is made using an OrderCancellationStatusReport message."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderCancellationRequestV04
 * SubscriptionOrderCancellationRequestV04}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionMultipleOrderCancellationInstructionV02
 * SubscriptionMultipleOrderCancellationInstructionV02}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SubscriptionOrderCancellationRequestV03", propOrder = {"messageIdentification", "poolReference", "previousReference", "cancellationByReference", "cancellationByOrderDetails", "copyDetails"})
public class SubscriptionOrderCancellationRequestV03 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	/**
	 * Either CancellationByOrderDetails or CancellationByReference may be
	 * present, but not both.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageDefinition
	 * messageDefinition} =
	 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderCancellationRequestV03
	 * SubscriptionOrderCancellationRequestV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMXor#getImpactedMessageBuildingBlocks
	 * impactedMessageBuildingBlocks} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderCancellationRequestV03#mmCancellationByReference
	 * SubscriptionOrderCancellationRequestV03.mmCancellationByReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderCancellationRequestV03#mmCancellationByOrderDetails
	 * SubscriptionOrderCancellationRequestV03.mmCancellationByOrderDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationByReferenceOrByOrderDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either CancellationByOrderDetails or CancellationByReference may be present, but not both."
	 * </li>
	 * </ul>
	 */
	public static final MMXor CancellationByReferenceOrByOrderDetailsRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationByReferenceOrByOrderDetailsRule";
			definition = "Either CancellationByOrderDetails or CancellationByReference may be present, but not both.";
			messageDefinition_lazy = () -> com.tools20022.repository.area.setr.SubscriptionOrderCancellationRequestV03.mmObject();
			impactedMessageBuildingBlocks_lazy = () -> Arrays.asList(com.tools20022.repository.area.setr.SubscriptionOrderCancellationRequestV03.mmCancellationByReference,
					com.tools20022.repository.area.setr.SubscriptionOrderCancellationRequestV03.mmCancellationByOrderDetails);
		}
	};
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
	 * "Reference that uniquely identifies a message from a business application standpoint."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderCancellationRequestV04#mmMessageIdentification
	 * SubscriptionOrderCancellationRequestV04.mmMessageIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmMessageIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "MsgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageIdentification";
			definition = "Reference that uniquely identifies a message from a business application standpoint.";
			nextVersions_lazy = () -> Arrays.asList(SubscriptionOrderCancellationRequestV04.mmMessageIdentification);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageIdentification1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SubscriptionOrderCancellationRequestV03.class.getMethod("getMessageIdentification", new Class[]{});
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
	 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderCancellationRequestV04#mmPoolReference
	 * SubscriptionOrderCancellationRequestV04.mmPoolReference}</li>
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
			nextVersions_lazy = () -> Arrays.asList(SubscriptionOrderCancellationRequestV04.mmPoolReference);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AdditionalReference3.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SubscriptionOrderCancellationRequestV03.class.getMethod("getPoolReference", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "PrvsRef")
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderCancellationRequestV04#mmPreviousReference
	 * SubscriptionOrderCancellationRequestV04.mmPreviousReference}</li>
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
			nextVersions_lazy = () -> Arrays.asList(SubscriptionOrderCancellationRequestV04.mmPreviousReference);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AdditionalReference3.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SubscriptionOrderCancellationRequestV03.class.getMethod("getPreviousReference", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "CxlByRef")
	protected InvestmentFundOrder1 cancellationByReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrder1
	 * InvestmentFundOrder1}</li>
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
			complexType_lazy = () -> InvestmentFundOrder1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SubscriptionOrderCancellationRequestV03.class.getMethod("getCancellationByReference", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "CxlByOrdrDtls")
	protected SubscriptionMultipleOrderInstruction2 cancellationByOrderDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrderInstruction2
	 * SubscriptionMultipleOrderInstruction2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CxlByOrdrDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationByOrderDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Common information related to all the orders to be cancelled."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmCancellationByOrderDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "CxlByOrdrDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationByOrderDetails";
			definition = "Common information related to all the orders to be cancelled.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SubscriptionMultipleOrderInstruction2.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SubscriptionOrderCancellationRequestV03.class.getMethod("getCancellationByOrderDetails", new Class[]{});
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
	 * definition} = "Message is a copy."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderCancellationRequestV04#mmCopyDetails
	 * SubscriptionOrderCancellationRequestV04.mmCopyDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmCopyDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "CpyDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CopyDetails";
			definition = "Message is a copy.";
			nextVersions_lazy = () -> Arrays.asList(SubscriptionOrderCancellationRequestV04.mmCopyDetails);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CopyInformation2.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SubscriptionOrderCancellationRequestV03.class.getMethod("getCopyDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAccountIdentificationRule.forSubscriptionOrderCancellationRequestV03);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SubscriptionOrderCancellationRequestV03";
				definition = "Scope\r\nAn instructing party, for example, an investment manager or its authorised representative, sends the SubscriptionOrderCancellationRequest message to the executing party, for example, a transfer agent, to request the cancellation of a previously sent SubscriptionOrder.\r\nUsage\r\nThe SubscriptionOrderCancellationRequest message is used to either:\r\n- request the cancellation of an entire SubscriptionOrder message, that is, all the individual orders that it contained, or,\r\n- request the cancellation of one or more individual orders.\r\nThere is no amendment, but a cancellation and re-instruct policy.\r\nThere are two ways to use the message:\r\n(1) When the SubscriptionOrderCancellationRequest message is used to request the cancellation of an entire SubscriptionOrder message, this can be done by either:\r\n- quoting the order references of all the individual orders listed in the SubscriptionOrder message, or,\r\n- quoting the details of all the individual orders (this includes the OrderReference) listed in SubscriptionOrder message, but this is not recommended.\r\nThe message identification of the SubscriptionOrder message may also be quoted in PreviousReference.\r\nIt is also possible to request the cancellation of an entire SubscriptionOrder message by quoting its message identification in PreviousReference, but this is not recommended.\r\n(2) When the SubscriptionOrderCancellationRequest message is used to request the cancellation of one or more individual orders, this can be done by either:\r\n- quoting the OrderReference of each individual order listed in the SubscriptionOrder message, or,\r\n- quoting the details of each individual order (including the OrderReference) listed in SubscriptionOrder message, but this is not recommended.\r\nThe message identification of the SubscriptionOrder message in which the individual order was conveyed may also be quoted in PreviousReference.\r\nThe deadline and acceptance of a cancellation request is subject to a service level agreement (SLA). This cancellation message is a cancellation request. There is no automatic acceptance of the cancellation.\r\nThe rejection or acceptance of a SubscriptionOrderCancellationRequest is made using an OrderCancellationStatusReport message.";
				nextVersions_lazy = () -> Arrays.asList(SubscriptionOrderCancellationRequestV04.mmObject());
				previousVersion_lazy = () -> SubscriptionMultipleOrderCancellationInstructionV02.mmObject();
				messageSet_lazy = () -> Arrays.asList(InvestmentFundsISOPreviousversion.mmObject());
				xors_lazy = () -> Arrays.asList(com.tools20022.repository.area.setr.SubscriptionOrderCancellationRequestV03.CancellationByReferenceOrByOrderDetailsRule);
				rootElement = "Document";
				xmlTag = "SbcptOrdrCxlReqV03";
				businessArea_lazy = () -> SecuritiesTradePreviousVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.setr.SubscriptionOrderCancellationRequestV03.mmMessageIdentification,
						com.tools20022.repository.area.setr.SubscriptionOrderCancellationRequestV03.mmPoolReference, com.tools20022.repository.area.setr.SubscriptionOrderCancellationRequestV03.mmPreviousReference,
						com.tools20022.repository.area.setr.SubscriptionOrderCancellationRequestV03.mmCancellationByReference, com.tools20022.repository.area.setr.SubscriptionOrderCancellationRequestV03.mmCancellationByOrderDetails,
						com.tools20022.repository.area.setr.SubscriptionOrderCancellationRequestV03.mmCopyDetails);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "setr";
						messageFunctionality = "011";
						version = "03";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return SubscriptionOrderCancellationRequestV03.class;
			}
		});
		return mmObject_lazy.get();
	}

	public MessageIdentification1 getMessageIdentification() {
		return messageIdentification;
	}

	public SubscriptionOrderCancellationRequestV03 setMessageIdentification(MessageIdentification1 messageIdentification) {
		this.messageIdentification = Objects.requireNonNull(messageIdentification);
		return this;
	}

	public Optional<AdditionalReference3> getPoolReference() {
		return poolReference == null ? Optional.empty() : Optional.of(poolReference);
	}

	public SubscriptionOrderCancellationRequestV03 setPoolReference(AdditionalReference3 poolReference) {
		this.poolReference = poolReference;
		return this;
	}

	public Optional<AdditionalReference3> getPreviousReference() {
		return previousReference == null ? Optional.empty() : Optional.of(previousReference);
	}

	public SubscriptionOrderCancellationRequestV03 setPreviousReference(AdditionalReference3 previousReference) {
		this.previousReference = previousReference;
		return this;
	}

	public Optional<InvestmentFundOrder1> getCancellationByReference() {
		return cancellationByReference == null ? Optional.empty() : Optional.of(cancellationByReference);
	}

	public SubscriptionOrderCancellationRequestV03 setCancellationByReference(InvestmentFundOrder1 cancellationByReference) {
		this.cancellationByReference = cancellationByReference;
		return this;
	}

	public Optional<SubscriptionMultipleOrderInstruction2> getCancellationByOrderDetails() {
		return cancellationByOrderDetails == null ? Optional.empty() : Optional.of(cancellationByOrderDetails);
	}

	public SubscriptionOrderCancellationRequestV03 setCancellationByOrderDetails(SubscriptionMultipleOrderInstruction2 cancellationByOrderDetails) {
		this.cancellationByOrderDetails = cancellationByOrderDetails;
		return this;
	}

	public Optional<CopyInformation2> getCopyDetails() {
		return copyDetails == null ? Optional.empty() : Optional.of(copyDetails);
	}

	public SubscriptionOrderCancellationRequestV03 setCopyDetails(CopyInformation2 copyDetails) {
		this.copyDetails = copyDetails;
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:setr.011.001.03")
	static public class Document {
		@XmlElement(name = "SbcptOrdrCxlReqV03", required = true)
		public SubscriptionOrderCancellationRequestV03 messageBody;
	}
}