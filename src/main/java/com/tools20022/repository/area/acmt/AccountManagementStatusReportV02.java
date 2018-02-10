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

package com.tools20022.repository.area.acmt;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.AccountManagementArchive;
import com.tools20022.repository.msg.AccountManagementStatusAndReason1;
import com.tools20022.repository.msg.AdditionalReference3;
import com.tools20022.repository.msg.MessageIdentification1;
import com.tools20022.repository.msgset.ISOArchive;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * An account servicer, eg, a registrar, transfer agent or custodian bank sends
 * the AccountManagementStatusReport message to an account owner or its
 * designated agent, eg, an investor to report on the receipt or the processing
 * status of a previously received AccountOpeningInstruction or
 * AccountModificationInstruction or GetAccountDetails message.<br>
 * <b>Usage</b><br>
 * The AccountManagementStatusReport message is used to provide the processing
 * status of a previously received AccountOpeningInstruction or of an
 * AccountModificationInstruction message.<br>
 * The AccountManagementStatusReport message is also used by an account servicer
 * to reject an AccountOpeningInstruction or AccountModificationInstruction or
 * GetAccountDetails message when the message is not compliant with the agreed
 * SLA or when the account cannot be uniquely identified.<br>
 * The account owner may report that the status of the instruction is either
 * rejected, accepted, that the instruction is being processed or that the
 * instruction has been forwarded to the next intermediary party for further
 * processing.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountManagementStatusReportV02#mmMessageIdentification
 * AccountManagementStatusReportV02.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountManagementStatusReportV02#mmRelatedReference
 * AccountManagementStatusReportV02.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountManagementStatusReportV02#mmStatusReport
 * AccountManagementStatusReportV02.mmStatusReport}</li>
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
 * xmlTag} = "AcctMgmtStsRptV02"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.AccountManagementArchive
 * AccountManagementArchive}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code acmt.006.001.02}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AccountManagementStatusReportV02"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nAn account servicer, eg, a registrar, transfer agent or custodian bank sends the AccountManagementStatusReport message to an account owner or its designated agent, eg, an investor to report on the receipt or the processing status of a previously received AccountOpeningInstruction or AccountModificationInstruction or GetAccountDetails message.\r\nUsage\r\nThe AccountManagementStatusReport message is used to provide the processing status of a previously received AccountOpeningInstruction or of an AccountModificationInstruction message.\r\nThe AccountManagementStatusReport message is also used by an account servicer to reject an AccountOpeningInstruction or AccountModificationInstruction or GetAccountDetails message when the message is not compliant with the agreed SLA or when the account cannot be uniquely identified.\r\nThe account owner may report that the status of the instruction is either rejected, accepted, that the instruction is being processed or that the instruction has been forwarded to the next intermediary party for further processing."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountManagementStatusReportV03
 * AccountManagementStatusReportV03}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AccountManagementStatusReportV02", propOrder = {"messageIdentification", "relatedReference", "statusReport"})
public class AccountManagementStatusReportV02 {

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
	 * definition} = "Identifies the message."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmMessageIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "MsgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageIdentification";
			definition = "Identifies the message.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageIdentification1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountManagementStatusReportV02.class.getMethod("getMessageIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "RltdRef", required = true)
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
	public static final MMMessageBuildingBlock mmRelatedReference = new MMMessageBuildingBlock() {
		{
			xmlTag = "RltdRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedReference";
			definition = "Reference to a linked message that was previously received.";
			maxOccurs = 2;
			minOccurs = 1;
			complexType_lazy = () -> AdditionalReference3.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountManagementStatusReportV02.class.getMethod("getRelatedReference", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "StsRpt", required = true)
	protected AccountManagementStatusAndReason1 statusReport;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AccountManagementStatusAndReason1
	 * AccountManagementStatusAndReason1}</li>
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
	 * definition} =
	 * "Status report details of an account opening instruction or account modification instruction that was previously received."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmStatusReport = new MMMessageBuildingBlock() {
		{
			xmlTag = "StsRpt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusReport";
			definition = "Status report details of an account opening instruction or account modification instruction that was previously received.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> AccountManagementStatusAndReason1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountManagementStatusReportV02.class.getMethod("getStatusReport", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AccountManagementStatusReportV02";
				definition = "Scope\r\nAn account servicer, eg, a registrar, transfer agent or custodian bank sends the AccountManagementStatusReport message to an account owner or its designated agent, eg, an investor to report on the receipt or the processing status of a previously received AccountOpeningInstruction or AccountModificationInstruction or GetAccountDetails message.\r\nUsage\r\nThe AccountManagementStatusReport message is used to provide the processing status of a previously received AccountOpeningInstruction or of an AccountModificationInstruction message.\r\nThe AccountManagementStatusReport message is also used by an account servicer to reject an AccountOpeningInstruction or AccountModificationInstruction or GetAccountDetails message when the message is not compliant with the agreed SLA or when the account cannot be uniquely identified.\r\nThe account owner may report that the status of the instruction is either rejected, accepted, that the instruction is being processed or that the instruction has been forwarded to the next intermediary party for further processing.";
				nextVersions_lazy = () -> Arrays.asList(AccountManagementStatusReportV03.mmObject());
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "AcctMgmtStsRptV02";
				businessArea_lazy = () -> AccountManagementArchive.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.acmt.AccountManagementStatusReportV02.mmMessageIdentification,
						com.tools20022.repository.area.acmt.AccountManagementStatusReportV02.mmRelatedReference, com.tools20022.repository.area.acmt.AccountManagementStatusReportV02.mmStatusReport);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "acmt";
						messageFunctionality = "006";
						version = "02";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return AccountManagementStatusReportV02.class;
			}
		});
		return mmObject_lazy.get();
	}

	public MessageIdentification1 getMessageIdentification() {
		return messageIdentification;
	}

	public AccountManagementStatusReportV02 setMessageIdentification(MessageIdentification1 messageIdentification) {
		this.messageIdentification = Objects.requireNonNull(messageIdentification);
		return this;
	}

	public List<AdditionalReference3> getRelatedReference() {
		return relatedReference == null ? relatedReference = new ArrayList<>() : relatedReference;
	}

	public AccountManagementStatusReportV02 setRelatedReference(List<AdditionalReference3> relatedReference) {
		this.relatedReference = Objects.requireNonNull(relatedReference);
		return this;
	}

	public AccountManagementStatusAndReason1 getStatusReport() {
		return statusReport;
	}

	public AccountManagementStatusReportV02 setStatusReport(AccountManagementStatusAndReason1 statusReport) {
		this.statusReport = Objects.requireNonNull(statusReport);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:acmt.006.001.02")
	static public class Document {
		@XmlElement(name = "AcctMgmtStsRptV02", required = true)
		public AccountManagementStatusReportV02 messageBody;
	}
}