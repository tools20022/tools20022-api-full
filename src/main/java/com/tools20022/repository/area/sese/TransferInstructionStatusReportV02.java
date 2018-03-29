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

import com.tools20022.metamodel.*;
import com.tools20022.repository.area.SecuritiesSettlementArchive;
import com.tools20022.repository.msg.AdditionalReference3;
import com.tools20022.repository.msg.Extension1;
import com.tools20022.repository.msg.MessageIdentification1;
import com.tools20022.repository.msg.TransferStatusAndReason2;
import com.tools20022.repository.msgset.ISOArchive;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * An executing party, eg, a transfer agent, sends the
 * TransferInstructionStatusReport message to the instructing party, eg, an
 * investment manager or one of its authorised representatives to provide the
 * status of a previously received transfer instruction.<br>
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
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInstructionStatusReportV02#RelatedReferenceOrOtherReferenceRule
 * TransferInstructionStatusReportV02.RelatedReferenceOrOtherReferenceRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInstructionStatusReportV02#mmMessageIdentification
 * TransferInstructionStatusReportV02.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInstructionStatusReportV02#mmRelatedReference
 * TransferInstructionStatusReportV02.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInstructionStatusReportV02#mmOtherReference
 * TransferInstructionStatusReportV02.mmOtherReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInstructionStatusReportV02#mmStatusReport
 * TransferInstructionStatusReportV02.mmStatusReport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInstructionStatusReportV02#mmExtension
 * TransferInstructionStatusReportV02.mmExtension}</li>
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
 * xmlTag} = "TrfInstrStsRptV02"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesSettlementArchive
 * SecuritiesSettlementArchive}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code sese.011.001.02}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintOtherReferenceRule#forTransferInstructionStatusReportV02
 * ConstraintOtherReferenceRule.forTransferInstructionStatusReportV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintRelatedReferenceRule#forTransferInstructionStatusReportV02
 * ConstraintRelatedReferenceRule.forTransferInstructionStatusReportV02}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TransferInstructionStatusReportV02"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nAn executing party, eg, a transfer agent, sends the TransferInstructionStatusReport message to the instructing party, eg, an investment manager or one of its authorised representatives to provide the status of a previously received transfer instruction.\r\nUsage\r\nThe TransferInstructionStatusReport message is used to report on the status of a transfer in or transfer out instruction. The reference of the transfer instruction for which the status is reported is identified in TransferReference.\r\nThe message identification of the transfer instruction message in which the transfer instruction was conveyed may also be quoted in RelatedReference.\r\nOne of the following statuses can be reported:\r\n- an accepted status, or,\r\n- an already executed status, or,\r\n- a sent to next party status, or,\r\n- a matched status, or,\r\n- a settled status, or,\r\n- a pending settlement status and the reason for the status, or,\r\n- an unmatched status and the reason for the status, or,\r\n- an in-repair status and the reason for the status, or,\r\n- a rejected status and the reason for the status, or,\r\n- a failed settlement status and the reason for the status, or,\r\n- a cancelled status and the reason for the status, or,\r\n- a cancelled status and the reason for the status, or,\r\n- a cancellation pending status and the reason for the status."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInstructionStatusReportV03
 * TransferInstructionStatusReportV03}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.sese.TransferInstructionStatusReport
 * TransferInstructionStatusReport}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TransferInstructionStatusReportV02", propOrder = {"messageIdentification", "relatedReference", "otherReference", "statusReport", "extension"})
public class TransferInstructionStatusReportV02 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	/**
	 * Occurrences of either RelatedReference or OtherReference may be present,
	 * but not occurrences of both.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageDefinition
	 * messageDefinition} =
	 * {@linkplain com.tools20022.repository.area.sese.TransferInstructionStatusReportV02
	 * TransferInstructionStatusReportV02}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMXor#getImpactedMessageBuildingBlocks
	 * impactedMessageBuildingBlocks} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.TransferInstructionStatusReportV02#mmRelatedReference
	 * TransferInstructionStatusReportV02.mmRelatedReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.TransferInstructionStatusReportV02#mmOtherReference
	 * TransferInstructionStatusReportV02.mmOtherReference}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedReferenceOrOtherReferenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Occurrences of either RelatedReference or OtherReference may be present, but not occurrences of both."
	 * </li>
	 * </ul>
	 */
	public static final MMXor RelatedReferenceOrOtherReferenceRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedReferenceOrOtherReferenceRule";
			definition = "Occurrences of either RelatedReference or OtherReference may be present, but not occurrences of both.";
			messageDefinition_lazy = () -> com.tools20022.repository.area.sese.TransferInstructionStatusReportV02.mmObject();
			impactedMessageBuildingBlocks_lazy = () -> Arrays.asList(com.tools20022.repository.area.sese.TransferInstructionStatusReportV02.mmRelatedReference,
					com.tools20022.repository.area.sese.TransferInstructionStatusReportV02.mmOtherReference);
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<TransferInstructionStatusReportV02, MessageIdentification1> mmMessageIdentification = new MMMessageBuildingBlock<TransferInstructionStatusReportV02, MessageIdentification1>() {
		{
			xmlTag = "MsgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageIdentification";
			definition = "Reference that uniquely identifies a message from a business application standpoint.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageIdentification1.mmObject();
		}

		@Override
		public MessageIdentification1 getValue(TransferInstructionStatusReportV02 obj) {
			return obj.getMessageIdentification();
		}

		@Override
		public void setValue(TransferInstructionStatusReportV02 obj, MessageIdentification1 value) {
			obj.setMessageIdentification(value);
		}
	};
	@XmlElement(name = "RltdRef")
	protected List<AdditionalReference3> relatedReference;
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
	public static final MMMessageBuildingBlock<TransferInstructionStatusReportV02, List<AdditionalReference3>> mmRelatedReference = new MMMessageBuildingBlock<TransferInstructionStatusReportV02, List<AdditionalReference3>>() {
		{
			xmlTag = "RltdRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedReference";
			definition = "Reference to a linked message that was previously received.";
			maxOccurs = 2;
			minOccurs = 0;
			complexType_lazy = () -> AdditionalReference3.mmObject();
		}

		@Override
		public List<AdditionalReference3> getValue(TransferInstructionStatusReportV02 obj) {
			return obj.getRelatedReference();
		}

		@Override
		public void setValue(TransferInstructionStatusReportV02 obj, List<AdditionalReference3> value) {
			obj.setRelatedReference(value);
		}
	};
	@XmlElement(name = "OthrRef")
	protected List<AdditionalReference3> otherReference;
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
	 * xmlTag} = "OthrRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference to a linked message sent in a proprietary way or the reference of a system."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<TransferInstructionStatusReportV02, List<AdditionalReference3>> mmOtherReference = new MMMessageBuildingBlock<TransferInstructionStatusReportV02, List<AdditionalReference3>>() {
		{
			xmlTag = "OthrRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherReference";
			definition = "Reference to a linked message sent in a proprietary way or the reference of a system.";
			maxOccurs = 2;
			minOccurs = 0;
			complexType_lazy = () -> AdditionalReference3.mmObject();
		}

		@Override
		public List<AdditionalReference3> getValue(TransferInstructionStatusReportV02 obj) {
			return obj.getOtherReference();
		}

		@Override
		public void setValue(TransferInstructionStatusReportV02 obj, List<AdditionalReference3> value) {
			obj.setOtherReference(value);
		}
	};
	@XmlElement(name = "StsRpt", required = true)
	protected TransferStatusAndReason2 statusReport;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason2
	 * TransferStatusAndReason2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StsRpt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusReport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of the transfer instruction."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<TransferInstructionStatusReportV02, TransferStatusAndReason2> mmStatusReport = new MMMessageBuildingBlock<TransferInstructionStatusReportV02, TransferStatusAndReason2>() {
		{
			xmlTag = "StsRpt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusReport";
			definition = "Status of the transfer instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> TransferStatusAndReason2.mmObject();
		}

		@Override
		public TransferStatusAndReason2 getValue(TransferInstructionStatusReportV02 obj) {
			return obj.getStatusReport();
		}

		@Override
		public void setValue(TransferInstructionStatusReportV02 obj, TransferStatusAndReason2 value) {
			obj.setStatusReport(value);
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
	public static final MMMessageBuildingBlock<TransferInstructionStatusReportV02, List<Extension1>> mmExtension = new MMMessageBuildingBlock<TransferInstructionStatusReportV02, List<Extension1>>() {
		{
			xmlTag = "Xtnsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Extension";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> Extension1.mmObject();
		}

		@Override
		public List<Extension1> getValue(TransferInstructionStatusReportV02 obj) {
			return obj.getExtension();
		}

		@Override
		public void setValue(TransferInstructionStatusReportV02 obj, List<Extension1> value) {
			obj.setExtension(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintOtherReferenceRule.forTransferInstructionStatusReportV02,
						com.tools20022.repository.constraints.ConstraintRelatedReferenceRule.forTransferInstructionStatusReportV02);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TransferInstructionStatusReportV02";
				definition = "Scope\r\nAn executing party, eg, a transfer agent, sends the TransferInstructionStatusReport message to the instructing party, eg, an investment manager or one of its authorised representatives to provide the status of a previously received transfer instruction.\r\nUsage\r\nThe TransferInstructionStatusReport message is used to report on the status of a transfer in or transfer out instruction. The reference of the transfer instruction for which the status is reported is identified in TransferReference.\r\nThe message identification of the transfer instruction message in which the transfer instruction was conveyed may also be quoted in RelatedReference.\r\nOne of the following statuses can be reported:\r\n- an accepted status, or,\r\n- an already executed status, or,\r\n- a sent to next party status, or,\r\n- a matched status, or,\r\n- a settled status, or,\r\n- a pending settlement status and the reason for the status, or,\r\n- an unmatched status and the reason for the status, or,\r\n- an in-repair status and the reason for the status, or,\r\n- a rejected status and the reason for the status, or,\r\n- a failed settlement status and the reason for the status, or,\r\n- a cancelled status and the reason for the status, or,\r\n- a cancelled status and the reason for the status, or,\r\n- a cancellation pending status and the reason for the status.";
				nextVersions_lazy = () -> Arrays.asList(TransferInstructionStatusReportV03.mmObject());
				previousVersion_lazy = () -> TransferInstructionStatusReport.mmObject();
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				xors_lazy = () -> Arrays.asList(com.tools20022.repository.area.sese.TransferInstructionStatusReportV02.RelatedReferenceOrOtherReferenceRule);
				rootElement = "Document";
				xmlTag = "TrfInstrStsRptV02";
				businessArea_lazy = () -> SecuritiesSettlementArchive.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.sese.TransferInstructionStatusReportV02.mmMessageIdentification,
						com.tools20022.repository.area.sese.TransferInstructionStatusReportV02.mmRelatedReference, com.tools20022.repository.area.sese.TransferInstructionStatusReportV02.mmOtherReference,
						com.tools20022.repository.area.sese.TransferInstructionStatusReportV02.mmStatusReport, com.tools20022.repository.area.sese.TransferInstructionStatusReportV02.mmExtension);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "sese";
						messageFunctionality = "011";
						version = "02";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return TransferInstructionStatusReportV02.class;
			}
		});
		return mmObject_lazy.get();
	}

	public MessageIdentification1 getMessageIdentification() {
		return messageIdentification;
	}

	public TransferInstructionStatusReportV02 setMessageIdentification(MessageIdentification1 messageIdentification) {
		this.messageIdentification = Objects.requireNonNull(messageIdentification);
		return this;
	}

	public List<AdditionalReference3> getRelatedReference() {
		return relatedReference == null ? relatedReference = new ArrayList<>() : relatedReference;
	}

	public TransferInstructionStatusReportV02 setRelatedReference(List<AdditionalReference3> relatedReference) {
		this.relatedReference = Objects.requireNonNull(relatedReference);
		return this;
	}

	public List<AdditionalReference3> getOtherReference() {
		return otherReference == null ? otherReference = new ArrayList<>() : otherReference;
	}

	public TransferInstructionStatusReportV02 setOtherReference(List<AdditionalReference3> otherReference) {
		this.otherReference = Objects.requireNonNull(otherReference);
		return this;
	}

	public TransferStatusAndReason2 getStatusReport() {
		return statusReport;
	}

	public TransferInstructionStatusReportV02 setStatusReport(TransferStatusAndReason2 statusReport) {
		this.statusReport = Objects.requireNonNull(statusReport);
		return this;
	}

	public List<Extension1> getExtension() {
		return extension == null ? extension = new ArrayList<>() : extension;
	}

	public TransferInstructionStatusReportV02 setExtension(List<Extension1> extension) {
		this.extension = Objects.requireNonNull(extension);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:sese.011.001.02")
	static public class Document {
		@XmlElement(name = "TrfInstrStsRptV02", required = true)
		public TransferInstructionStatusReportV02 messageBody;
	}
}