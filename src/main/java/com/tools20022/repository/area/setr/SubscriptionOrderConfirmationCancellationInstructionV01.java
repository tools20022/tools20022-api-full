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
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * An executing party, for example, a transfer agent, sends the
 * SubscriptionOrderConfirmationCancellationInstruction message to the
 * instructing party, for example, an investment manager or its authorised
 * representative to cancel a previously sent SubscriptionOrderConfirmation.<br>
 * <b>Usage</b><br>
 * The SubscriptionOrderConfirmationCancellationInstruction message is used to
 * cancel one or more previously sent subscription order confirmations. The
 * amendment indicator element is used to specify whether the subscription order
 * confirmation cancellation is to be followed by a
 * SubscriptionOrderConfirmationAmendment.<br>
 * The SubscriptionOrderConfirmationCancellationInstruction message is used to
 * either:<br>
 * - cancel an entire SubscriptionOrderConfirmation message, that is, all the
 * individual order confirmations that it contained, or,<br>
 * - request the cancellation of one or more individual confirmations.<br>
 * There are two ways to use the message.<br>
 * (1) When the SubscriptionOrderConfirmationCancellationInstruction message is
 * used to cancel an entire message, this can be done by either:<br>
 * - quoting the business references, for example, OrderReference, Deal
 * Reference, of all the individual order confirmations listed in the
 * SubscriptionOrderConfirmation message, or,<br>
 * - quoting the details of all the individual order confirmations (this
 * includes the OrderReference and DealReference) listed in
 * SubscriptionOrderConfirmation message but this is not recommended.<br>
 * The message identification of the SubscriptionOrderConfirmation message may
 * also be quoted in PreviousReference.<br>
 * It is also possible to instruct the cancellation of an entire confirmation
 * message by quoting its message identification in PreviousReference.<br>
 * (2) When the SubscriptionOrderConfirmationCancellationInstruction message is
 * used to cancel one or more individual order confirmations, this can be done
 * by either:<br>
 * - quoting the "business" references, for example, OrderReference, Deal
 * Reference, of each individual order confirmation listed in the
 * SubscriptionOrderConfirmation message, or,<br>
 * - quoting the details of each individual order execution (this includes the
 * OrderReference and DealReference) listed in SubscriptionOrderConfirmation
 * message but this is not recommended.<br>
 * The message identification of the SubscriptionOrderConfirmation message in
 * which the individual order confirmation was conveyed may also be quoted in
 * PreviousReference.<br>
 * The rejection or acceptance of a
 * SubscriptionOrderConfirmationCancellationInstruction is made using an
 * OrderConfirmationStatusReport message.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderConfirmationCancellationInstructionV01#CancellationByReferenceOrByOrderConfirmationDetailsRule
 * SubscriptionOrderConfirmationCancellationInstructionV01.
 * CancellationByReferenceOrByOrderConfirmationDetailsRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderConfirmationCancellationInstructionV01#mmMessageIdentification
 * SubscriptionOrderConfirmationCancellationInstructionV01.
 * mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderConfirmationCancellationInstructionV01#mmPoolReference
 * SubscriptionOrderConfirmationCancellationInstructionV01.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderConfirmationCancellationInstructionV01#mmPreviousReference
 * SubscriptionOrderConfirmationCancellationInstructionV01.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderConfirmationCancellationInstructionV01#mmRelatedReference
 * SubscriptionOrderConfirmationCancellationInstructionV01.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderConfirmationCancellationInstructionV01#mmCancellationByReference
 * SubscriptionOrderConfirmationCancellationInstructionV01.
 * mmCancellationByReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderConfirmationCancellationInstructionV01#mmCancellationByOrderConfirmationDetails
 * SubscriptionOrderConfirmationCancellationInstructionV01.
 * mmCancellationByOrderConfirmationDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderConfirmationCancellationInstructionV01#mmCopyDetails
 * SubscriptionOrderConfirmationCancellationInstructionV01.mmCopyDetails}</li>
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
 * xmlTag} = "SbcptOrdrConfCxlInstrV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesTradePreviousVersion
 * SecuritiesTradePreviousVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code setr.047.001.01}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintAccountIdentificationRule#forSubscriptionOrderConfirmationCancellationInstructionV01
 * ConstraintAccountIdentificationRule.
 * forSubscriptionOrderConfirmationCancellationInstructionV01}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SubscriptionOrderConfirmationCancellationInstructionV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nAn executing party, for example, a transfer agent, sends the SubscriptionOrderConfirmationCancellationInstruction message to the instructing party, for example, an investment manager or its authorised representative to cancel a previously sent SubscriptionOrderConfirmation.\r\nUsage\r\nThe SubscriptionOrderConfirmationCancellationInstruction message is used to cancel one or more previously sent subscription order confirmations. The amendment indicator element is used to specify whether the subscription order confirmation cancellation is to be followed by a SubscriptionOrderConfirmationAmendment.\r\nThe SubscriptionOrderConfirmationCancellationInstruction message is used to either:\r\n- cancel an entire SubscriptionOrderConfirmation message, that is, all the individual order confirmations that it contained, or,\r\n- request the cancellation of one or more individual confirmations.\r\nThere are two ways to use the message.\r\n(1) When the SubscriptionOrderConfirmationCancellationInstruction message is used to cancel an entire message, this can be done by either:\r\n- quoting the business references, for example, OrderReference, Deal Reference, of all the individual order confirmations listed in the SubscriptionOrderConfirmation message, or,\r\n- quoting the details of all the individual order confirmations (this includes the OrderReference and DealReference) listed in SubscriptionOrderConfirmation message but this is not recommended.\r\nThe message identification of the SubscriptionOrderConfirmation message may also be quoted in PreviousReference.\r\nIt is also possible to instruct the cancellation of an entire confirmation message by quoting its message identification in PreviousReference.\r\n(2) When the SubscriptionOrderConfirmationCancellationInstruction message is used to cancel one or more individual order confirmations, this can be done by either:\r\n- quoting the \"business\" references, for example, OrderReference, Deal Reference, of each individual order confirmation listed in the SubscriptionOrderConfirmation message, or,\r\n- quoting the details of each individual order execution (this includes the OrderReference and DealReference) listed in SubscriptionOrderConfirmation message but this is not recommended.\r\nThe message identification of the SubscriptionOrderConfirmation message in which the individual order confirmation was conveyed may also be quoted in PreviousReference.\r\nThe rejection or acceptance of a SubscriptionOrderConfirmationCancellationInstruction is made using an OrderConfirmationStatusReport message."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderConfirmationCancellationInstructionV02
 * SubscriptionOrderConfirmationCancellationInstructionV02}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SubscriptionOrderConfirmationCancellationInstructionV01", propOrder = {"messageIdentification", "poolReference", "previousReference", "relatedReference", "cancellationByReference", "cancellationByOrderConfirmationDetails",
		"copyDetails"})
public class SubscriptionOrderConfirmationCancellationInstructionV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	/**
	 * Either CancellationByOrderConfirmationDetails or CancellationByReference
	 * may be present, but not both.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageDefinition
	 * messageDefinition} =
	 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderConfirmationCancellationInstructionV01
	 * SubscriptionOrderConfirmationCancellationInstructionV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMXor#getImpactedMessageBuildingBlocks
	 * impactedMessageBuildingBlocks} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderConfirmationCancellationInstructionV01#mmCancellationByReference
	 * SubscriptionOrderConfirmationCancellationInstructionV01.
	 * mmCancellationByReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderConfirmationCancellationInstructionV01#mmCancellationByOrderConfirmationDetails
	 * SubscriptionOrderConfirmationCancellationInstructionV01.
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
	public static final MMXor CancellationByReferenceOrByOrderConfirmationDetailsRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationByReferenceOrByOrderConfirmationDetailsRule";
			definition = "Either CancellationByOrderConfirmationDetails or CancellationByReference may be present, but not both.";
			messageDefinition_lazy = () -> com.tools20022.repository.area.setr.SubscriptionOrderConfirmationCancellationInstructionV01.mmObject();
			impactedMessageBuildingBlocks_lazy = () -> Arrays.asList(com.tools20022.repository.area.setr.SubscriptionOrderConfirmationCancellationInstructionV01.mmCancellationByReference,
					com.tools20022.repository.area.setr.SubscriptionOrderConfirmationCancellationInstructionV01.mmCancellationByOrderConfirmationDetails);
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
	 * "Reference that uniquely identifies a message from a business application standpoint. "
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderConfirmationCancellationInstructionV02#mmMessageIdentification
	 * SubscriptionOrderConfirmationCancellationInstructionV02.
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
			nextVersions_lazy = () -> Arrays.asList(SubscriptionOrderConfirmationCancellationInstructionV02.mmMessageIdentification);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageIdentification1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SubscriptionOrderConfirmationCancellationInstructionV01.class.getMethod("getMessageIdentification", new Class[]{});
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
	 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderConfirmationCancellationInstructionV02#mmPoolReference
	 * SubscriptionOrderConfirmationCancellationInstructionV02.mmPoolReference}</li>
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
			nextVersions_lazy = () -> Arrays.asList(SubscriptionOrderConfirmationCancellationInstructionV02.mmPoolReference);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AdditionalReference3.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SubscriptionOrderConfirmationCancellationInstructionV01.class.getMethod("getPoolReference", new Class[]{});
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
	 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderConfirmationCancellationInstructionV02#mmPreviousReference
	 * SubscriptionOrderConfirmationCancellationInstructionV02.
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
			nextVersions_lazy = () -> Arrays.asList(SubscriptionOrderConfirmationCancellationInstructionV02.mmPreviousReference);
			minOccurs = 0;
			complexType_lazy = () -> AdditionalReference3.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SubscriptionOrderConfirmationCancellationInstructionV01.class.getMethod("getPreviousReference", new Class[]{});
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderConfirmationCancellationInstructionV02#mmRelatedReference
	 * SubscriptionOrderConfirmationCancellationInstructionV02.
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
			nextVersions_lazy = () -> Arrays.asList(SubscriptionOrderConfirmationCancellationInstructionV02.mmRelatedReference);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AdditionalReference3.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SubscriptionOrderConfirmationCancellationInstructionV01.class.getMethod("getRelatedReference", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "CxlByRef")
	protected InvestmentFundOrderExecution1 cancellationByReference;
	/**
	 * 
	 <p>
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
	 * definition} = "References of the orders confirmations to be cancelled."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmCancellationByReference = new MMMessageBuildingBlock() {
		{
			xmlTag = "CxlByRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationByReference";
			definition = "References of the orders confirmations to be cancelled.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> InvestmentFundOrderExecution1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SubscriptionOrderConfirmationCancellationInstructionV01.class.getMethod("getCancellationByReference", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "CxlByOrdrConfDtls")
	protected SubscriptionOrderConfirmation1 cancellationByOrderConfirmationDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrderConfirmation1
	 * SubscriptionOrderConfirmation1}</li>
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
	 * "Common information related to all the orders confirmations to be cancelled."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmCancellationByOrderConfirmationDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "CxlByOrdrConfDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationByOrderConfirmationDetails";
			definition = "Common information related to all the orders confirmations to be cancelled.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SubscriptionOrderConfirmation1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SubscriptionOrderConfirmationCancellationInstructionV01.class.getMethod("getCancellationByOrderConfirmationDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "CpyDtls")
	protected CopyInformation1 copyDetails;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderConfirmationCancellationInstructionV02#mmCopyDetails
	 * SubscriptionOrderConfirmationCancellationInstructionV02.mmCopyDetails}</li>
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
			nextVersions_lazy = () -> Arrays.asList(SubscriptionOrderConfirmationCancellationInstructionV02.mmCopyDetails);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CopyInformation1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SubscriptionOrderConfirmationCancellationInstructionV01.class.getMethod("getCopyDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAccountIdentificationRule.forSubscriptionOrderConfirmationCancellationInstructionV01);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SubscriptionOrderConfirmationCancellationInstructionV01";
				definition = "Scope\r\nAn executing party, for example, a transfer agent, sends the SubscriptionOrderConfirmationCancellationInstruction message to the instructing party, for example, an investment manager or its authorised representative to cancel a previously sent SubscriptionOrderConfirmation.\r\nUsage\r\nThe SubscriptionOrderConfirmationCancellationInstruction message is used to cancel one or more previously sent subscription order confirmations. The amendment indicator element is used to specify whether the subscription order confirmation cancellation is to be followed by a SubscriptionOrderConfirmationAmendment.\r\nThe SubscriptionOrderConfirmationCancellationInstruction message is used to either:\r\n- cancel an entire SubscriptionOrderConfirmation message, that is, all the individual order confirmations that it contained, or,\r\n- request the cancellation of one or more individual confirmations.\r\nThere are two ways to use the message.\r\n(1) When the SubscriptionOrderConfirmationCancellationInstruction message is used to cancel an entire message, this can be done by either:\r\n- quoting the business references, for example, OrderReference, Deal Reference, of all the individual order confirmations listed in the SubscriptionOrderConfirmation message, or,\r\n- quoting the details of all the individual order confirmations (this includes the OrderReference and DealReference) listed in SubscriptionOrderConfirmation message but this is not recommended.\r\nThe message identification of the SubscriptionOrderConfirmation message may also be quoted in PreviousReference.\r\nIt is also possible to instruct the cancellation of an entire confirmation message by quoting its message identification in PreviousReference.\r\n(2) When the SubscriptionOrderConfirmationCancellationInstruction message is used to cancel one or more individual order confirmations, this can be done by either:\r\n- quoting the \"business\" references, for example, OrderReference, Deal Reference, of each individual order confirmation listed in the SubscriptionOrderConfirmation message, or,\r\n- quoting the details of each individual order execution (this includes the OrderReference and DealReference) listed in SubscriptionOrderConfirmation message but this is not recommended.\r\nThe message identification of the SubscriptionOrderConfirmation message in which the individual order confirmation was conveyed may also be quoted in PreviousReference.\r\nThe rejection or acceptance of a SubscriptionOrderConfirmationCancellationInstruction is made using an OrderConfirmationStatusReport message.";
				nextVersions_lazy = () -> Arrays.asList(SubscriptionOrderConfirmationCancellationInstructionV02.mmObject());
				messageSet_lazy = () -> Arrays.asList(InvestmentFundsISOPreviousversion.mmObject());
				xors_lazy = () -> Arrays.asList(com.tools20022.repository.area.setr.SubscriptionOrderConfirmationCancellationInstructionV01.CancellationByReferenceOrByOrderConfirmationDetailsRule);
				rootElement = "Document";
				xmlTag = "SbcptOrdrConfCxlInstrV01";
				businessArea_lazy = () -> SecuritiesTradePreviousVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.setr.SubscriptionOrderConfirmationCancellationInstructionV01.mmMessageIdentification,
						com.tools20022.repository.area.setr.SubscriptionOrderConfirmationCancellationInstructionV01.mmPoolReference,
						com.tools20022.repository.area.setr.SubscriptionOrderConfirmationCancellationInstructionV01.mmPreviousReference,
						com.tools20022.repository.area.setr.SubscriptionOrderConfirmationCancellationInstructionV01.mmRelatedReference,
						com.tools20022.repository.area.setr.SubscriptionOrderConfirmationCancellationInstructionV01.mmCancellationByReference,
						com.tools20022.repository.area.setr.SubscriptionOrderConfirmationCancellationInstructionV01.mmCancellationByOrderConfirmationDetails,
						com.tools20022.repository.area.setr.SubscriptionOrderConfirmationCancellationInstructionV01.mmCopyDetails);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "setr";
						messageFunctionality = "047";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return SubscriptionOrderConfirmationCancellationInstructionV01.class;
			}
		});
		return mmObject_lazy.get();
	}

	public MessageIdentification1 getMessageIdentification() {
		return messageIdentification;
	}

	public SubscriptionOrderConfirmationCancellationInstructionV01 setMessageIdentification(MessageIdentification1 messageIdentification) {
		this.messageIdentification = Objects.requireNonNull(messageIdentification);
		return this;
	}

	public Optional<AdditionalReference3> getPoolReference() {
		return poolReference == null ? Optional.empty() : Optional.of(poolReference);
	}

	public SubscriptionOrderConfirmationCancellationInstructionV01 setPoolReference(AdditionalReference3 poolReference) {
		this.poolReference = poolReference;
		return this;
	}

	public List<AdditionalReference3> getPreviousReference() {
		return previousReference == null ? previousReference = new ArrayList<>() : previousReference;
	}

	public SubscriptionOrderConfirmationCancellationInstructionV01 setPreviousReference(List<AdditionalReference3> previousReference) {
		this.previousReference = Objects.requireNonNull(previousReference);
		return this;
	}

	public Optional<AdditionalReference3> getRelatedReference() {
		return relatedReference == null ? Optional.empty() : Optional.of(relatedReference);
	}

	public SubscriptionOrderConfirmationCancellationInstructionV01 setRelatedReference(AdditionalReference3 relatedReference) {
		this.relatedReference = relatedReference;
		return this;
	}

	public Optional<InvestmentFundOrderExecution1> getCancellationByReference() {
		return cancellationByReference == null ? Optional.empty() : Optional.of(cancellationByReference);
	}

	public SubscriptionOrderConfirmationCancellationInstructionV01 setCancellationByReference(InvestmentFundOrderExecution1 cancellationByReference) {
		this.cancellationByReference = cancellationByReference;
		return this;
	}

	public Optional<SubscriptionOrderConfirmation1> getCancellationByOrderConfirmationDetails() {
		return cancellationByOrderConfirmationDetails == null ? Optional.empty() : Optional.of(cancellationByOrderConfirmationDetails);
	}

	public SubscriptionOrderConfirmationCancellationInstructionV01 setCancellationByOrderConfirmationDetails(SubscriptionOrderConfirmation1 cancellationByOrderConfirmationDetails) {
		this.cancellationByOrderConfirmationDetails = cancellationByOrderConfirmationDetails;
		return this;
	}

	public Optional<CopyInformation1> getCopyDetails() {
		return copyDetails == null ? Optional.empty() : Optional.of(copyDetails);
	}

	public SubscriptionOrderConfirmationCancellationInstructionV01 setCopyDetails(CopyInformation1 copyDetails) {
		this.copyDetails = copyDetails;
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:setr.047.001.01")
	static public class Document {
		@XmlElement(name = "SbcptOrdrConfCxlInstrV01", required = true)
		public SubscriptionOrderConfirmationCancellationInstructionV01 messageBody;
	}
}