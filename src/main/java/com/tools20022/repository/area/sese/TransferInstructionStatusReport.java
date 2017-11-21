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
import com.tools20022.repository.msg.AdditionalReference2;
import com.tools20022.repository.msg.TransferStatusAndReason;
import com.tools20022.repository.msgset.ISOArchive;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The TransferInstructionStatusReport message is sent by an instructing party
 * to the executing party. The instructing party may be an investor, a transfer
 * agent, or an intermediary, etc. The executing party may be a transfer agent,
 * or an intermediary, etc.<br>
 * This message gives the status of a transfer instruction, and can be used from
 * the time the executing party receives the transfer instruction until its
 * execution.<br>
 * <b>Usage</b><br>
 * The TransferInstructionStatusReport message is sent by an executing party to
 * the instructing party. The message can be used to report one of the following<br>
 * - the status of the transfer instruction (using a code)or<br>
 * - the repair status or<br>
 * - the unmatched status or<br>
 * - the rejection status or<br>
 * - the pending settlement status.<br>
 * Further information about repair, unmatched, rejected or pending settlement
 * statuses must be specified using either codes or unstructured information.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesSettlementArchive
 * SecuritiesSettlementArchive}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msgset.ISOArchive ISOArchive}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlName
 * xmlName} = "sese.011.001.01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "sese.011.001.01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInstructionStatusReport#mmRelatedReferenceOrOtherReferenceRule
 * TransferInstructionStatusReport.mmRelatedReferenceOrOtherReferenceRule}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInstructionStatusReport#mmRelatedReference
 * TransferInstructionStatusReport.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInstructionStatusReport#mmOtherReference
 * TransferInstructionStatusReport.mmOtherReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInstructionStatusReport#mmStatusReport
 * TransferInstructionStatusReport.mmStatusReport}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code sese.011.001.01}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TransferInstructionStatusReport"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe TransferInstructionStatusReport message is sent by an instructing party to the executing party. The instructing party may be an investor, a transfer agent, or an intermediary, etc. The executing party may be a transfer agent, or an intermediary, etc.\r\nThis message gives the status of a transfer instruction, and can be used from the time the executing party receives the transfer instruction until its execution.\r\nUsage\r\nThe TransferInstructionStatusReport message is sent by an executing party to the instructing party. The message can be used to report one of the following\r\n- the status of the transfer instruction (using a code)or\r\n- the repair status or\r\n- the unmatched status or\r\n- the rejection status or\r\n- the pending settlement status.\r\nFurther information about repair, unmatched, rejected or pending settlement statuses must be specified using either codes or unstructured information."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInstructionStatusReportV02
 * TransferInstructionStatusReportV02}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "sese.011.001.01", propOrder = {"relatedReference", "otherReference", "statusReport"})
public class TransferInstructionStatusReport {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	/**
	 * If OtherReference is present, then RelatedReference is not allowed. If
	 * OtherReference is not present, then RelatedReference is mandatory.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageDefinition
	 * messageDefinition} =
	 * {@linkplain com.tools20022.repository.area.sese.TransferInstructionStatusReport
	 * TransferInstructionStatusReport}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMXor#getImpactedMessageBuildingBlocks
	 * impactedMessageBuildingBlocks} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.TransferInstructionStatusReport#mmRelatedReference
	 * TransferInstructionStatusReport.mmRelatedReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.TransferInstructionStatusReport#mmOtherReference
	 * TransferInstructionStatusReport.mmOtherReference}</li>
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
	 * "If OtherReference is present, then RelatedReference is not allowed. If OtherReference is not present, then RelatedReference is mandatory."
	 * </li>
	 * </ul>
	 */
	public static final MMXor mmRelatedReferenceOrOtherReferenceRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedReferenceOrOtherReferenceRule";
			definition = "If OtherReference is present, then RelatedReference is not allowed. If OtherReference is not present, then RelatedReference is mandatory.";
			messageDefinition_lazy = () -> com.tools20022.repository.area.sese.TransferInstructionStatusReport.mmObject();
			impactedMessageBuildingBlocks_lazy = () -> Arrays.asList(com.tools20022.repository.area.sese.TransferInstructionStatusReport.mmRelatedReference,
					com.tools20022.repository.area.sese.TransferInstructionStatusReport.mmOtherReference);
		}
	};
	protected AdditionalReference2 relatedReference;
	/**
	 * Reference to a linked message that was previously received.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference2
	 * AdditionalReference2}</li>
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
			complexType_lazy = () -> AdditionalReference2.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return TransferInstructionStatusReport.class.getMethod("getRelatedReference", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected AdditionalReference2 otherReference;
	/**
	 * Reference to a linked message sent in a proprietary way or the reference
	 * of a system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference2
	 * AdditionalReference2}</li>
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
	public static final MMMessageBuildingBlock mmOtherReference = new MMMessageBuildingBlock() {
		{
			xmlTag = "OthrRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherReference";
			definition = "Reference to a linked message sent in a proprietary way or the reference of a system.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> AdditionalReference2.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return TransferInstructionStatusReport.class.getMethod("getOtherReference", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected TransferStatusAndReason statusReport;
	/**
	 * Status of the transfer instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason
	 * TransferStatusAndReason}</li>
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
	public static final MMMessageBuildingBlock mmStatusReport = new MMMessageBuildingBlock() {
		{
			xmlTag = "StsRpt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusReport";
			definition = "Status of the transfer instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> TransferStatusAndReason.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return TransferInstructionStatusReport.class.getMethod("getStatusReport", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TransferInstructionStatusReport";
				definition = "Scope\r\nThe TransferInstructionStatusReport message is sent by an instructing party to the executing party. The instructing party may be an investor, a transfer agent, or an intermediary, etc. The executing party may be a transfer agent, or an intermediary, etc.\r\nThis message gives the status of a transfer instruction, and can be used from the time the executing party receives the transfer instruction until its execution.\r\nUsage\r\nThe TransferInstructionStatusReport message is sent by an executing party to the instructing party. The message can be used to report one of the following\r\n- the status of the transfer instruction (using a code)or\r\n- the repair status or\r\n- the unmatched status or\r\n- the rejection status or\r\n- the pending settlement status.\r\nFurther information about repair, unmatched, rejected or pending settlement statuses must be specified using either codes or unstructured information.";
				nextVersions_lazy = () -> Arrays.asList(TransferInstructionStatusReportV02.mmObject());
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				xors_lazy = () -> Arrays.asList(com.tools20022.repository.area.sese.TransferInstructionStatusReport.mmRelatedReferenceOrOtherReferenceRule);
				rootElement = "Document";
				xmlTag = "sese.011.001.01";
				businessArea_lazy = () -> SecuritiesSettlementArchive.mmObject();
				xmlName = "sese.011.001.01";
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.sese.TransferInstructionStatusReport.mmRelatedReference, com.tools20022.repository.area.sese.TransferInstructionStatusReport.mmOtherReference,
						com.tools20022.repository.area.sese.TransferInstructionStatusReport.mmStatusReport);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "sese";
						messageFunctionality = "011";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return TransferInstructionStatusReport.class;
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "RltdRef", required = true)
	public AdditionalReference2 getRelatedReference() {
		return relatedReference;
	}

	public void setRelatedReference(AdditionalReference2 relatedReference) {
		this.relatedReference = relatedReference;
	}

	@XmlElement(name = "OthrRef", required = true)
	public AdditionalReference2 getOtherReference() {
		return otherReference;
	}

	public void setOtherReference(AdditionalReference2 otherReference) {
		this.otherReference = otherReference;
	}

	@XmlElement(name = "StsRpt", required = true)
	public TransferStatusAndReason getStatusReport() {
		return statusReport;
	}

	public void setStatusReport(TransferStatusAndReason statusReport) {
		this.statusReport = statusReport;
	}

	@XmlRootElement(namespace = "urn:iso:std:iso:20022:tech:xsd:sese.011.01.01")
	static public class Document {
		@XmlElement(name = "sese.011.001.01", required = true)
		public TransferInstructionStatusReport messageBody;
	}
}