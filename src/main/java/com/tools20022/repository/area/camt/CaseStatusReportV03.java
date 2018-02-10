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

package com.tools20022.repository.area.camt;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.CashManagementPreviousVersion;
import com.tools20022.repository.msg.Case2;
import com.tools20022.repository.msg.CaseAssignment2;
import com.tools20022.repository.msg.CaseStatus2;
import com.tools20022.repository.msg.ReportHeader2;
import com.tools20022.repository.msgset.ISOArchive;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The Case Status Report message is sent by a case assignee to a case creator
 * or case assigner.<br>
 * This message is used to report on the status of a case.<br>
 * <b>Usage</b><br>
 * A Case Status Report message is sent in reply to a Case Status Report Request
 * message. This message<br>
 * - covers one and only one case at a time. (If a case assignee needs to report
 * on several cases, then multiple Case Status Report messages must be sent.)<br>
 * - may be forwarded to subsequent case assigner(s) until it reaches the end
 * point<br>
 * - is able to indicate the fact that a case has been assigned to a party
 * downstream in the payment processing chain<br>
 * - may not be used in place of a Resolution Of Investigation (except for the
 * condition given in the next bullet point) or Notification Of Case Assignment
 * message<br>
 * - may be skipped and replaced by a Resolution Of Investigation message when
 * the request for a investigation status is received at the time the assigner
 * has resolved the case. (In this case a Resolution Of Investigation message
 * can be sent instead of a Case Status Report and the case may be closed.)
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.CaseStatusReportV03#mmHeader
 * CaseStatusReportV03.mmHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.CaseStatusReportV03#mmCase
 * CaseStatusReportV03.mmCase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.CaseStatusReportV03#mmStatus
 * CaseStatusReportV03.mmStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.CaseStatusReportV03#mmNewAssignment
 * CaseStatusReportV03.mmNewAssignment}</li>
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
 * xmlTag} = "CaseStsRpt"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.CashManagementPreviousVersion
 * CashManagementPreviousVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code camt.039.001.03}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CaseStatusReportV03"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe Case Status Report message is sent by a case assignee to a case creator or case assigner.\r\nThis message is used to report on the status of a case.\r\nUsage\r\nA Case Status Report message is sent in reply to a Case Status Report Request message. This message\r\n- covers one and only one case at a time. (If a case assignee needs to report on several cases, then multiple Case Status Report messages must be sent.)\r\n- may be forwarded to subsequent case assigner(s) until it reaches the end point\r\n- is able to indicate the fact that a case has been assigned to a party downstream in the payment processing chain\r\n- may not be used in place of a Resolution Of Investigation (except for the condition given in the next bullet point) or Notification Of Case Assignment message\r\n- may be skipped and replaced by a Resolution Of Investigation message when the request for a investigation status is received at the time the assigner has resolved the case. (In this case a Resolution Of Investigation message can be sent instead of a Case Status Report and the case may be closed.)"
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.area.camt.CaseStatusReportV04
 * CaseStatusReportV04}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CaseStatusReportV03", propOrder = {"header", "case_", "status", "newAssignment"})
public class CaseStatusReportV03 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Hdr", required = true)
	protected ReportHeader2 header;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.ReportHeader2
	 * ReportHeader2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Hdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Header"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies generic information about an investigation report."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmHeader = new MMMessageBuildingBlock() {
		{
			xmlTag = "Hdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Header";
			definition = "Specifies generic information about an investigation report.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> ReportHeader2.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CaseStatusReportV03.class.getMethod("getHeader", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "Case", required = true)
	protected Case2 case_;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Case2 Case2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Case"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Case"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the investigation case."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmCase = new MMMessageBuildingBlock() {
		{
			xmlTag = "Case";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Case";
			definition = "Identifies the investigation case.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Case2.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CaseStatusReportV03.class.getMethod("getCase", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "Sts", required = true)
	protected CaseStatus2 status;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.CaseStatus2
	 * CaseStatus2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Status"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Defines the status of the case."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmStatus = new MMMessageBuildingBlock() {
		{
			xmlTag = "Sts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Status";
			definition = "Defines the status of the case.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CaseStatus2.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CaseStatusReportV03.class.getMethod("getStatus", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "NewAssgnmt")
	protected CaseAssignment2 newAssignment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.CaseAssignment2
	 * CaseAssignment2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NewAssgnmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewAssignment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the change of an assignment for an investigation case from an assigner to a new assignee.\nUsage: The Assigner must be the sender of this confirmation and the Assignee must be the receiver."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmNewAssignment = new MMMessageBuildingBlock() {
		{
			xmlTag = "NewAssgnmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewAssignment";
			definition = "Identifies the change of an assignment for an investigation case from an assigner to a new assignee.\nUsage: The Assigner must be the sender of this confirmation and the Assignee must be the receiver.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CaseAssignment2.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CaseStatusReportV03.class.getMethod("getNewAssignment", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CaseStatusReportV03";
				definition = "Scope\r\nThe Case Status Report message is sent by a case assignee to a case creator or case assigner.\r\nThis message is used to report on the status of a case.\r\nUsage\r\nA Case Status Report message is sent in reply to a Case Status Report Request message. This message\r\n- covers one and only one case at a time. (If a case assignee needs to report on several cases, then multiple Case Status Report messages must be sent.)\r\n- may be forwarded to subsequent case assigner(s) until it reaches the end point\r\n- is able to indicate the fact that a case has been assigned to a party downstream in the payment processing chain\r\n- may not be used in place of a Resolution Of Investigation (except for the condition given in the next bullet point) or Notification Of Case Assignment message\r\n- may be skipped and replaced by a Resolution Of Investigation message when the request for a investigation status is received at the time the assigner has resolved the case. (In this case a Resolution Of Investigation message can be sent instead of a Case Status Report and the case may be closed.)";
				nextVersions_lazy = () -> Arrays.asList(CaseStatusReportV04.mmObject());
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "CaseStsRpt";
				businessArea_lazy = () -> CashManagementPreviousVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.camt.CaseStatusReportV03.mmHeader, com.tools20022.repository.area.camt.CaseStatusReportV03.mmCase,
						com.tools20022.repository.area.camt.CaseStatusReportV03.mmStatus, com.tools20022.repository.area.camt.CaseStatusReportV03.mmNewAssignment);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "camt";
						messageFunctionality = "039";
						version = "03";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return CaseStatusReportV03.class;
			}
		});
		return mmObject_lazy.get();
	}

	public ReportHeader2 getHeader() {
		return header;
	}

	public CaseStatusReportV03 setHeader(ReportHeader2 header) {
		this.header = Objects.requireNonNull(header);
		return this;
	}

	public Case2 getCase() {
		return case_;
	}

	public CaseStatusReportV03 setCase(Case2 case_) {
		this.case_ = Objects.requireNonNull(case_);
		return this;
	}

	public CaseStatus2 getStatus() {
		return status;
	}

	public CaseStatusReportV03 setStatus(CaseStatus2 status) {
		this.status = Objects.requireNonNull(status);
		return this;
	}

	public Optional<CaseAssignment2> getNewAssignment() {
		return newAssignment == null ? Optional.empty() : Optional.of(newAssignment);
	}

	public CaseStatusReportV03 setNewAssignment(CaseAssignment2 newAssignment) {
		this.newAssignment = newAssignment;
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.039.001.03")
	static public class Document {
		@XmlElement(name = "CaseStsRpt", required = true)
		public CaseStatusReportV03 messageBody;
	}
}