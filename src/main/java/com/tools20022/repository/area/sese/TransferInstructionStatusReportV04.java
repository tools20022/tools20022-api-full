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

package com.tools20022.repository.area.sese;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.SecuritiesSettlementArchive;
import com.tools20022.repository.choice.References40Choice;
import com.tools20022.repository.msg.*;
import com.tools20022.repository.msgset.ISOArchive;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * An executing party, for example, a transfer agent, sends the
 * TransferInstructionStatusReport message to the instructing party, for
 * example, an investment manager or one of its authorised representatives to
 * provide the status of a previously received transfer instruction.<br>
 * <b>Usage</b><br>
 * The TransferInstructionStatusReport message is used to report on the status
 * of a transfer in or transfer out instruction. The reference of the transfer
 * instruction for which the status is reported is identified in
 * TransferReference.<br>
 * The message identification of the transfer instruction message in which the
 * transfer instruction was conveyed may also be quoted in RelatedReference.<br>
 * One of the following statuses can be reported:<br>
 * - an accepted status, or,<br>
 * - an already executed status, or,<br>
 * - a sent to next party status, or,<br>
 * - a matched status, or,<br>
 * - a settled status, or,<br>
 * - a pending settlement status and the reason for the status, or,<br>
 * - an unmatched status and the reason for the status, or,<br>
 * - an in-repair status and the reason for the status, or,<br>
 * - a rejected status and the reason for the status, or,<br>
 * - a failed settlement status and the reason for the status, or,<br>
 * - a cancelled status and the reason for the status, or,<br>
 * - a cancelled status and the reason for the status, or,<br>
 * - a cancellation pending status and the reason for the status.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code sese.011.001.04}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesSettlementArchive
 * SecuritiesSettlementArchive}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInstructionStatusReportV04#mmMessageIdentification
 * TransferInstructionStatusReportV04.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInstructionStatusReportV04#mmCounterpartyReference
 * TransferInstructionStatusReportV04.mmCounterpartyReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInstructionStatusReportV04#mmReference
 * TransferInstructionStatusReportV04.mmReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInstructionStatusReportV04#mmStatusReport
 * TransferInstructionStatusReportV04.mmStatusReport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInstructionStatusReportV04#mmMarketPracticeVersion
 * TransferInstructionStatusReportV04.mmMarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInstructionStatusReportV04#mmExtension
 * TransferInstructionStatusReportV04.mmExtension}</li>
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
 * xmlTag} = "TrfInstrStsRpt"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TransferInstructionStatusReportV04"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nAn executing party, for example, a transfer agent, sends the TransferInstructionStatusReport message to the instructing party, for example, an investment manager or one of its authorised representatives to provide the status of a previously received transfer instruction.\r\nUsage\r\nThe TransferInstructionStatusReport message is used to report on the status of a transfer in or transfer out instruction. The reference of the transfer instruction for which the status is reported is identified in TransferReference.\r\nThe message identification of the transfer instruction message in which the transfer instruction was conveyed may also be quoted in RelatedReference.\r\nOne of the following statuses can be reported:\r\n- an accepted status, or,\r\n- an already executed status, or,\r\n- a sent to next party status, or,\r\n- a matched status, or,\r\n- a settled status, or,\r\n- a pending settlement status and the reason for the status, or,\r\n- an unmatched status and the reason for the status, or,\r\n- an in-repair status and the reason for the status, or,\r\n- a rejected status and the reason for the status, or,\r\n- a failed settlement status and the reason for the status, or,\r\n- a cancelled status and the reason for the status, or,\r\n- a cancelled status and the reason for the status, or,\r\n- a cancellation pending status and the reason for the status."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintOtherReferenceRule#for_sese_TransferInstructionStatusReportV04
 * ConstraintOtherReferenceRule.for_sese_TransferInstructionStatusReportV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintRelatedReferenceRule#for_sese_TransferInstructionStatusReportV04
 * ConstraintRelatedReferenceRule.for_sese_TransferInstructionStatusReportV04}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInstructionStatusReportV05
 * TransferInstructionStatusReportV05}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.sese.TransferInstructionStatusReportV03
 * TransferInstructionStatusReportV03}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TransferInstructionStatusReportV04", propOrder = {"messageIdentification", "counterpartyReference", "reference", "statusReport", "marketPracticeVersion", "extension"})
public class TransferInstructionStatusReportV04 {

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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference that uniquely identifies a message from a business application standpoint."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.TransferInstructionStatusReportV05#mmMessageIdentification
	 * TransferInstructionStatusReportV05.mmMessageIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.TransferInstructionStatusReportV03#mmMessageIdentification
	 * TransferInstructionStatusReportV03.mmMessageIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<TransferInstructionStatusReportV04, MessageIdentification1> mmMessageIdentification = new MMMessageBuildingBlock<TransferInstructionStatusReportV04, MessageIdentification1>() {
		{
			xmlTag = "MsgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageIdentification";
			definition = "Reference that uniquely identifies a message from a business application standpoint.";
			nextVersions_lazy = () -> Arrays.asList(TransferInstructionStatusReportV05.mmMessageIdentification);
			previousVersion_lazy = () -> TransferInstructionStatusReportV03.mmMessageIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageIdentification1.mmObject();
		}

		@Override
		public MessageIdentification1 getValue(TransferInstructionStatusReportV04 obj) {
			return obj.getMessageIdentification();
		}

		@Override
		public void setValue(TransferInstructionStatusReportV04 obj, MessageIdentification1 value) {
			obj.setMessageIdentification(value);
		}
	};
	@XmlElement(name = "CtrPtyRef")
	protected AdditionalReference2 counterpartyReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference2
	 * AdditionalReference2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtrPtyRef"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterpartyReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the transfer allocated by the counterparty."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.TransferInstructionStatusReportV05#mmCounterpartyReference
	 * TransferInstructionStatusReportV05.mmCounterpartyReference}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.TransferInstructionStatusReportV03#mmCounterpartyReference
	 * TransferInstructionStatusReportV03.mmCounterpartyReference}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<TransferInstructionStatusReportV04, Optional<AdditionalReference2>> mmCounterpartyReference = new MMMessageBuildingBlock<TransferInstructionStatusReportV04, Optional<AdditionalReference2>>() {
		{
			xmlTag = "CtrPtyRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartyReference";
			definition = "Unambiguous identification of the transfer allocated by the counterparty.";
			nextVersions_lazy = () -> Arrays.asList(TransferInstructionStatusReportV05.mmCounterpartyReference);
			previousVersion_lazy = () -> TransferInstructionStatusReportV03.mmCounterpartyReference;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AdditionalReference2.mmObject();
		}

		@Override
		public Optional<AdditionalReference2> getValue(TransferInstructionStatusReportV04 obj) {
			return obj.getCounterpartyReference();
		}

		@Override
		public void setValue(TransferInstructionStatusReportV04 obj, Optional<AdditionalReference2> value) {
			obj.setCounterpartyReference(value.orElse(null));
		}
	};
	@XmlElement(name = "Ref")
	protected References40Choice reference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.References40Choice
	 * References40Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ref"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference to the message or communication that was previously received."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.TransferInstructionStatusReportV05#mmReference
	 * TransferInstructionStatusReportV05.mmReference}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<TransferInstructionStatusReportV04, Optional<References40Choice>> mmReference = new MMMessageBuildingBlock<TransferInstructionStatusReportV04, Optional<References40Choice>>() {
		{
			xmlTag = "Ref";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reference";
			definition = "Reference to the message or communication that was previously received.";
			nextVersions_lazy = () -> Arrays.asList(TransferInstructionStatusReportV05.mmReference);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> References40Choice.mmObject();
		}

		@Override
		public Optional<References40Choice> getValue(TransferInstructionStatusReportV04 obj) {
			return obj.getReference();
		}

		@Override
		public void setValue(TransferInstructionStatusReportV04 obj, Optional<References40Choice> value) {
			obj.setReference(value.orElse(null));
		}
	};
	@XmlElement(name = "StsRpt", required = true)
	protected TransferStatusAndReason3 statusReport;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason3
	 * TransferStatusAndReason3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StsRpt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusReport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of the transfer instruction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.TransferInstructionStatusReportV05#mmStatusReport
	 * TransferInstructionStatusReportV05.mmStatusReport}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.TransferInstructionStatusReportV03#mmStatusReport
	 * TransferInstructionStatusReportV03.mmStatusReport}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<TransferInstructionStatusReportV04, TransferStatusAndReason3> mmStatusReport = new MMMessageBuildingBlock<TransferInstructionStatusReportV04, TransferStatusAndReason3>() {
		{
			xmlTag = "StsRpt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusReport";
			definition = "Status of the transfer instruction.";
			nextVersions_lazy = () -> Arrays.asList(TransferInstructionStatusReportV05.mmStatusReport);
			previousVersion_lazy = () -> TransferInstructionStatusReportV03.mmStatusReport;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> TransferStatusAndReason3.mmObject();
		}

		@Override
		public TransferStatusAndReason3 getValue(TransferInstructionStatusReportV04 obj) {
			return obj.getStatusReport();
		}

		@Override
		public void setValue(TransferInstructionStatusReportV04 obj, TransferStatusAndReason3 value) {
			obj.setStatusReport(value);
		}
	};
	@XmlElement(name = "MktPrctcVrsn")
	protected MarketPracticeVersion1 marketPracticeVersion;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.MarketPracticeVersion1
	 * MarketPracticeVersion1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MktPrctcVrsn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketPracticeVersion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the market practice to which the message conforms."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.TransferInstructionStatusReportV05#mmMarketPracticeVersion
	 * TransferInstructionStatusReportV05.mmMarketPracticeVersion}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<TransferInstructionStatusReportV04, Optional<MarketPracticeVersion1>> mmMarketPracticeVersion = new MMMessageBuildingBlock<TransferInstructionStatusReportV04, Optional<MarketPracticeVersion1>>() {
		{
			xmlTag = "MktPrctcVrsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketPracticeVersion";
			definition = "Identifies the market practice to which the message conforms.";
			nextVersions_lazy = () -> Arrays.asList(TransferInstructionStatusReportV05.mmMarketPracticeVersion);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> MarketPracticeVersion1.mmObject();
		}

		@Override
		public Optional<MarketPracticeVersion1> getValue(TransferInstructionStatusReportV04 obj) {
			return obj.getMarketPracticeVersion();
		}

		@Override
		public void setValue(TransferInstructionStatusReportV04 obj, Optional<MarketPracticeVersion1> value) {
			obj.setMarketPracticeVersion(value.orElse(null));
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Extension"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information that cannot be captured in the structured elements and/or any other specific block."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.TransferInstructionStatusReportV05#mmExtension
	 * TransferInstructionStatusReportV05.mmExtension}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.TransferInstructionStatusReportV03#mmExtension
	 * TransferInstructionStatusReportV03.mmExtension}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<TransferInstructionStatusReportV04, List<Extension1>> mmExtension = new MMMessageBuildingBlock<TransferInstructionStatusReportV04, List<Extension1>>() {
		{
			xmlTag = "Xtnsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Extension";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			nextVersions_lazy = () -> Arrays.asList(TransferInstructionStatusReportV05.mmExtension);
			previousVersion_lazy = () -> TransferInstructionStatusReportV03.mmExtension;
			minOccurs = 0;
			complexType_lazy = () -> Extension1.mmObject();
		}

		@Override
		public List<Extension1> getValue(TransferInstructionStatusReportV04 obj) {
			return obj.getExtension();
		}

		@Override
		public void setValue(TransferInstructionStatusReportV04 obj, List<Extension1> value) {
			obj.setExtension(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintOtherReferenceRule.for_sese_TransferInstructionStatusReportV04,
						com.tools20022.repository.constraints.ConstraintRelatedReferenceRule.for_sese_TransferInstructionStatusReportV04);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TransferInstructionStatusReportV04";
				definition = "Scope\r\nAn executing party, for example, a transfer agent, sends the TransferInstructionStatusReport message to the instructing party, for example, an investment manager or one of its authorised representatives to provide the status of a previously received transfer instruction.\r\nUsage\r\nThe TransferInstructionStatusReport message is used to report on the status of a transfer in or transfer out instruction. The reference of the transfer instruction for which the status is reported is identified in TransferReference.\r\nThe message identification of the transfer instruction message in which the transfer instruction was conveyed may also be quoted in RelatedReference.\r\nOne of the following statuses can be reported:\r\n- an accepted status, or,\r\n- an already executed status, or,\r\n- a sent to next party status, or,\r\n- a matched status, or,\r\n- a settled status, or,\r\n- a pending settlement status and the reason for the status, or,\r\n- an unmatched status and the reason for the status, or,\r\n- an in-repair status and the reason for the status, or,\r\n- a rejected status and the reason for the status, or,\r\n- a failed settlement status and the reason for the status, or,\r\n- a cancelled status and the reason for the status, or,\r\n- a cancelled status and the reason for the status, or,\r\n- a cancellation pending status and the reason for the status.";
				nextVersions_lazy = () -> Arrays.asList(TransferInstructionStatusReportV05.mmObject());
				previousVersion_lazy = () -> TransferInstructionStatusReportV03.mmObject();
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "TrfInstrStsRpt";
				businessArea_lazy = () -> SecuritiesSettlementArchive.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.sese.TransferInstructionStatusReportV04.mmMessageIdentification,
						com.tools20022.repository.area.sese.TransferInstructionStatusReportV04.mmCounterpartyReference, com.tools20022.repository.area.sese.TransferInstructionStatusReportV04.mmReference,
						com.tools20022.repository.area.sese.TransferInstructionStatusReportV04.mmStatusReport, com.tools20022.repository.area.sese.TransferInstructionStatusReportV04.mmMarketPracticeVersion,
						com.tools20022.repository.area.sese.TransferInstructionStatusReportV04.mmExtension);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "sese";
						messageFunctionality = "011";
						version = "04";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return TransferInstructionStatusReportV04.class;
			}
		});
		return mmObject_lazy.get();
	}

	public MessageIdentification1 getMessageIdentification() {
		return messageIdentification;
	}

	public TransferInstructionStatusReportV04 setMessageIdentification(MessageIdentification1 messageIdentification) {
		this.messageIdentification = Objects.requireNonNull(messageIdentification);
		return this;
	}

	public Optional<AdditionalReference2> getCounterpartyReference() {
		return counterpartyReference == null ? Optional.empty() : Optional.of(counterpartyReference);
	}

	public TransferInstructionStatusReportV04 setCounterpartyReference(AdditionalReference2 counterpartyReference) {
		this.counterpartyReference = counterpartyReference;
		return this;
	}

	public Optional<References40Choice> getReference() {
		return reference == null ? Optional.empty() : Optional.of(reference);
	}

	public TransferInstructionStatusReportV04 setReference(References40Choice reference) {
		this.reference = reference;
		return this;
	}

	public TransferStatusAndReason3 getStatusReport() {
		return statusReport;
	}

	public TransferInstructionStatusReportV04 setStatusReport(TransferStatusAndReason3 statusReport) {
		this.statusReport = Objects.requireNonNull(statusReport);
		return this;
	}

	public Optional<MarketPracticeVersion1> getMarketPracticeVersion() {
		return marketPracticeVersion == null ? Optional.empty() : Optional.of(marketPracticeVersion);
	}

	public TransferInstructionStatusReportV04 setMarketPracticeVersion(MarketPracticeVersion1 marketPracticeVersion) {
		this.marketPracticeVersion = marketPracticeVersion;
		return this;
	}

	public List<Extension1> getExtension() {
		return extension == null ? extension = new ArrayList<>() : extension;
	}

	public TransferInstructionStatusReportV04 setExtension(List<Extension1> extension) {
		this.extension = Objects.requireNonNull(extension);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:sese.011.001.04")
	static public class Document {
		@XmlElement(name = "TrfInstrStsRpt", required = true)
		public TransferInstructionStatusReportV04 messageBody;
	}
}