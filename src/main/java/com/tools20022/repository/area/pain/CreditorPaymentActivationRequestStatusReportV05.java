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

package com.tools20022.repository.area.pain;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.PaymentsInitiationPreviousVersion;
import com.tools20022.repository.msg.GroupHeader46;
import com.tools20022.repository.msg.OriginalGroupInformation25;
import com.tools20022.repository.msg.OriginalPaymentInstruction19;
import com.tools20022.repository.msg.SupplementaryData1;
import com.tools20022.repository.msgset.CreditorPaymentActivationRequestISOPreviousversion;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.*;

/**
 * The CreditorPaymentActivationRequestStatusReport message is sent by a party
 * to the next party in the creditor payment activation request chain. It is
 * used to inform the latter about the positive or negative status of a creditor
 * payment activation request (either single or file).
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.CreditorPaymentActivationRequestStatusReportV05#mmGroupHeader
 * CreditorPaymentActivationRequestStatusReportV05.mmGroupHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.CreditorPaymentActivationRequestStatusReportV05#mmOriginalGroupInformationAndStatus
 * CreditorPaymentActivationRequestStatusReportV05.
 * mmOriginalGroupInformationAndStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.CreditorPaymentActivationRequestStatusReportV05#mmOriginalPaymentInformationAndStatus
 * CreditorPaymentActivationRequestStatusReportV05.
 * mmOriginalPaymentInformationAndStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.CreditorPaymentActivationRequestStatusReportV05#mmSupplementaryData
 * CreditorPaymentActivationRequestStatusReportV05.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.CreditorPaymentActivationRequestISOPreviousversion
 * CreditorPaymentActivationRequestISOPreviousversion}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "CdtrPmtActvtnReqStsRpt"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.PaymentsInitiationPreviousVersion
 * PaymentsInitiationPreviousVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code pain.014.001.05}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupAndTransactionStatus1Rule#for_pain_CreditorPaymentActivationRequestStatusReportV05
 * ConstraintGroupAndTransactionStatus1Rule.
 * for_pain_CreditorPaymentActivationRequestStatusReportV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupAndTransactionStatus2Rule#for_pain_CreditorPaymentActivationRequestStatusReportV05
 * ConstraintGroupAndTransactionStatus2Rule.
 * for_pain_CreditorPaymentActivationRequestStatusReportV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupAndTransactionStatus3Rule#for_pain_CreditorPaymentActivationRequestStatusReportV05
 * ConstraintGroupAndTransactionStatus3Rule.
 * for_pain_CreditorPaymentActivationRequestStatusReportV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupAndTransactionStatus4Rule#for_pain_CreditorPaymentActivationRequestStatusReportV05
 * ConstraintGroupAndTransactionStatus4Rule.
 * for_pain_CreditorPaymentActivationRequestStatusReportV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_pain_CreditorPaymentActivationRequestStatusReportV05
 * ConstraintSupplementaryDataRule.
 * for_pain_CreditorPaymentActivationRequestStatusReportV05}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CreditorPaymentActivationRequestStatusReportV05"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "The CreditorPaymentActivationRequestStatusReport message is sent by a party to the next party in the creditor payment activation request chain. It is used to inform the latter about the positive or negative status of a creditor payment activation request (either single or file)."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.CreditorPaymentActivationRequestStatusReportV06
 * CreditorPaymentActivationRequestStatusReportV06}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.pain.CreditorPaymentActivationRequestStatusReportV04
 * CreditorPaymentActivationRequestStatusReportV04}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CreditorPaymentActivationRequestStatusReportV05", propOrder = {"groupHeader", "originalGroupInformationAndStatus", "originalPaymentInformationAndStatus", "supplementaryData"})
public class CreditorPaymentActivationRequestStatusReportV05 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "GrpHdr", required = true)
	protected GroupHeader46 groupHeader;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.GroupHeader46
	 * GroupHeader46}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GrpHdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupHeader"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of characteristics shared by all individual transactions included in the message."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.pain.CreditorPaymentActivationRequestStatusReportV06#mmGroupHeader
	 * CreditorPaymentActivationRequestStatusReportV06.mmGroupHeader}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.pain.CreditorPaymentActivationRequestStatusReportV04#mmGroupHeader
	 * CreditorPaymentActivationRequestStatusReportV04.mmGroupHeader}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CreditorPaymentActivationRequestStatusReportV05, GroupHeader46> mmGroupHeader = new MMMessageBuildingBlock<CreditorPaymentActivationRequestStatusReportV05, GroupHeader46>() {
		{
			xmlTag = "GrpHdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupHeader";
			definition = "Set of characteristics shared by all individual transactions included in the message.";
			nextVersions_lazy = () -> Arrays.asList(CreditorPaymentActivationRequestStatusReportV06.mmGroupHeader);
			previousVersion_lazy = () -> CreditorPaymentActivationRequestStatusReportV04.mmGroupHeader;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> GroupHeader46.mmObject();
		}

		@Override
		public GroupHeader46 getValue(CreditorPaymentActivationRequestStatusReportV05 obj) {
			return obj.getGroupHeader();
		}

		@Override
		public void setValue(CreditorPaymentActivationRequestStatusReportV05 obj, GroupHeader46 value) {
			obj.setGroupHeader(value);
		}
	};
	@XmlElement(name = "OrgnlGrpInfAndSts", required = true)
	protected OriginalGroupInformation25 originalGroupInformationAndStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation25
	 * OriginalGroupInformation25}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlGrpInfAndSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalGroupInformationAndStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Original group information concerning the group of transactions, to which the status report message refers to."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.pain.CreditorPaymentActivationRequestStatusReportV06#mmOriginalGroupInformationAndStatus
	 * CreditorPaymentActivationRequestStatusReportV06.
	 * mmOriginalGroupInformationAndStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.pain.CreditorPaymentActivationRequestStatusReportV04#mmOriginalGroupInformationAndStatus
	 * CreditorPaymentActivationRequestStatusReportV04.
	 * mmOriginalGroupInformationAndStatus}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CreditorPaymentActivationRequestStatusReportV05, OriginalGroupInformation25> mmOriginalGroupInformationAndStatus = new MMMessageBuildingBlock<CreditorPaymentActivationRequestStatusReportV05, OriginalGroupInformation25>() {
		{
			xmlTag = "OrgnlGrpInfAndSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalGroupInformationAndStatus";
			definition = "Original group information concerning the group of transactions, to which the status report message refers to.";
			nextVersions_lazy = () -> Arrays.asList(CreditorPaymentActivationRequestStatusReportV06.mmOriginalGroupInformationAndStatus);
			previousVersion_lazy = () -> CreditorPaymentActivationRequestStatusReportV04.mmOriginalGroupInformationAndStatus;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> OriginalGroupInformation25.mmObject();
		}

		@Override
		public OriginalGroupInformation25 getValue(CreditorPaymentActivationRequestStatusReportV05 obj) {
			return obj.getOriginalGroupInformationAndStatus();
		}

		@Override
		public void setValue(CreditorPaymentActivationRequestStatusReportV05 obj, OriginalGroupInformation25 value) {
			obj.setOriginalGroupInformationAndStatus(value);
		}
	};
	@XmlElement(name = "OrgnlPmtInfAndSts")
	protected List<OriginalPaymentInstruction19> originalPaymentInformationAndStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction19
	 * OriginalPaymentInstruction19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlPmtInfAndSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalPaymentInformationAndStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information concerning the original payment information, to which the status report message refers."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.pain.CreditorPaymentActivationRequestStatusReportV06#mmOriginalPaymentInformationAndStatus
	 * CreditorPaymentActivationRequestStatusReportV06.
	 * mmOriginalPaymentInformationAndStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.pain.CreditorPaymentActivationRequestStatusReportV04#mmOriginalPaymentInformationAndStatus
	 * CreditorPaymentActivationRequestStatusReportV04.
	 * mmOriginalPaymentInformationAndStatus}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CreditorPaymentActivationRequestStatusReportV05, List<OriginalPaymentInstruction19>> mmOriginalPaymentInformationAndStatus = new MMMessageBuildingBlock<CreditorPaymentActivationRequestStatusReportV05, List<OriginalPaymentInstruction19>>() {
		{
			xmlTag = "OrgnlPmtInfAndSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalPaymentInformationAndStatus";
			definition = "Information concerning the original payment information, to which the status report message refers.";
			nextVersions_lazy = () -> Arrays.asList(CreditorPaymentActivationRequestStatusReportV06.mmOriginalPaymentInformationAndStatus);
			previousVersion_lazy = () -> CreditorPaymentActivationRequestStatusReportV04.mmOriginalPaymentInformationAndStatus;
			minOccurs = 0;
			complexType_lazy = () -> OriginalPaymentInstruction19.mmObject();
		}

		@Override
		public List<OriginalPaymentInstruction19> getValue(CreditorPaymentActivationRequestStatusReportV05 obj) {
			return obj.getOriginalPaymentInformationAndStatus();
		}

		@Override
		public void setValue(CreditorPaymentActivationRequestStatusReportV05 obj, List<OriginalPaymentInstruction19> value) {
			obj.setOriginalPaymentInformationAndStatus(value);
		}
	};
	@XmlElement(name = "SplmtryData")
	protected List<SupplementaryData1> supplementaryData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SupplementaryData1
	 * SupplementaryData1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SplmtryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information that cannot be captured in the structured elements and/or any other specific block."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.pain.CreditorPaymentActivationRequestStatusReportV06#mmSupplementaryData
	 * CreditorPaymentActivationRequestStatusReportV06.mmSupplementaryData}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.pain.CreditorPaymentActivationRequestStatusReportV04#mmSupplementaryData
	 * CreditorPaymentActivationRequestStatusReportV04.mmSupplementaryData}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CreditorPaymentActivationRequestStatusReportV05, List<SupplementaryData1>> mmSupplementaryData = new MMMessageBuildingBlock<CreditorPaymentActivationRequestStatusReportV05, List<SupplementaryData1>>() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			nextVersions_lazy = () -> Arrays.asList(CreditorPaymentActivationRequestStatusReportV06.mmSupplementaryData);
			previousVersion_lazy = () -> CreditorPaymentActivationRequestStatusReportV04.mmSupplementaryData;
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(CreditorPaymentActivationRequestStatusReportV05 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(CreditorPaymentActivationRequestStatusReportV05 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGroupAndTransactionStatus1Rule.for_pain_CreditorPaymentActivationRequestStatusReportV05,
						com.tools20022.repository.constraints.ConstraintGroupAndTransactionStatus2Rule.for_pain_CreditorPaymentActivationRequestStatusReportV05,
						com.tools20022.repository.constraints.ConstraintGroupAndTransactionStatus3Rule.for_pain_CreditorPaymentActivationRequestStatusReportV05,
						com.tools20022.repository.constraints.ConstraintGroupAndTransactionStatus4Rule.for_pain_CreditorPaymentActivationRequestStatusReportV05,
						com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_pain_CreditorPaymentActivationRequestStatusReportV05);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CreditorPaymentActivationRequestStatusReportV05";
				definition = "The CreditorPaymentActivationRequestStatusReport message is sent by a party to the next party in the creditor payment activation request chain. It is used to inform the latter about the positive or negative status of a creditor payment activation request (either single or file).";
				nextVersions_lazy = () -> Arrays.asList(CreditorPaymentActivationRequestStatusReportV06.mmObject());
				previousVersion_lazy = () -> CreditorPaymentActivationRequestStatusReportV04.mmObject();
				messageSet_lazy = () -> Arrays.asList(CreditorPaymentActivationRequestISOPreviousversion.mmObject());
				rootElement = "Document";
				xmlTag = "CdtrPmtActvtnReqStsRpt";
				businessArea_lazy = () -> PaymentsInitiationPreviousVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.pain.CreditorPaymentActivationRequestStatusReportV05.mmGroupHeader,
						com.tools20022.repository.area.pain.CreditorPaymentActivationRequestStatusReportV05.mmOriginalGroupInformationAndStatus,
						com.tools20022.repository.area.pain.CreditorPaymentActivationRequestStatusReportV05.mmOriginalPaymentInformationAndStatus,
						com.tools20022.repository.area.pain.CreditorPaymentActivationRequestStatusReportV05.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "pain";
						messageFunctionality = "014";
						version = "05";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return CreditorPaymentActivationRequestStatusReportV05.class;
			}
		});
		return mmObject_lazy.get();
	}

	public GroupHeader46 getGroupHeader() {
		return groupHeader;
	}

	public CreditorPaymentActivationRequestStatusReportV05 setGroupHeader(GroupHeader46 groupHeader) {
		this.groupHeader = Objects.requireNonNull(groupHeader);
		return this;
	}

	public OriginalGroupInformation25 getOriginalGroupInformationAndStatus() {
		return originalGroupInformationAndStatus;
	}

	public CreditorPaymentActivationRequestStatusReportV05 setOriginalGroupInformationAndStatus(OriginalGroupInformation25 originalGroupInformationAndStatus) {
		this.originalGroupInformationAndStatus = Objects.requireNonNull(originalGroupInformationAndStatus);
		return this;
	}

	public List<OriginalPaymentInstruction19> getOriginalPaymentInformationAndStatus() {
		return originalPaymentInformationAndStatus == null ? originalPaymentInformationAndStatus = new ArrayList<>() : originalPaymentInformationAndStatus;
	}

	public CreditorPaymentActivationRequestStatusReportV05 setOriginalPaymentInformationAndStatus(List<OriginalPaymentInstruction19> originalPaymentInformationAndStatus) {
		this.originalPaymentInformationAndStatus = Objects.requireNonNull(originalPaymentInformationAndStatus);
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public CreditorPaymentActivationRequestStatusReportV05 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:pain.014.001.05")
	static public class Document {
		@XmlElement(name = "CdtrPmtActvtnReqStsRpt", required = true)
		public CreditorPaymentActivationRequestStatusReportV05 messageBody;
	}
}