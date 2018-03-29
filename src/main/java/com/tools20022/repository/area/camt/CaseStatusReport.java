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
import com.tools20022.repository.area.CashManagementArchive;
import com.tools20022.repository.msg.Case;
import com.tools20022.repository.msg.CaseAssignment;
import com.tools20022.repository.msg.CaseStatus;
import com.tools20022.repository.msg.ReportHeader;
import com.tools20022.repository.msgset.ISOArchive;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.*;

/**
 * Scope The Case Status Report message is sent by a case assignee to a case
 * creator or case assigner. This message is used to report on the status of a
 * case. Usage A Case Status Report message is sent in reply to a Case Status
 * Report Request message. This message - covers one and only one case at a
 * time. (If a case assignee needs to report on several cases, then multiple
 * Case Status Report messages must be sent.) - may be forwarded to subsequent
 * case assigner(s) until it reaches the end point - is able to indicate the
 * fact that a case has been assigned to a party downstream in the payment
 * processing chain - may not be used in place of a Resolution Of Investigation
 * (except for the condition given in the next bullet point) or Notification Of
 * Case Assignment message - may be skipped and replaced by a Resolution Of
 * Investigation message if at the moment when the request for a investigation
 * status arrives, the assignee has obtained a solution. (In this case a
 * Resolution Of Investigation message can be sent in lieu of a Case Status
 * Report and the case may be closed.).
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.CaseStatusReport#mmHeader
 * CaseStatusReport.mmHeader}</li>
 * <li>{@linkplain com.tools20022.repository.area.camt.CaseStatusReport#mmCase
 * CaseStatusReport.mmCase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.CaseStatusReport#mmStatus
 * CaseStatusReport.mmStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.CaseStatusReport#mmNewAssignment
 * CaseStatusReport.mmNewAssignment}</li>
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
 * xmlTag} = "camt.039.001.01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.CashManagementArchive
 * CashManagementArchive}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlName
 * xmlName} = "camt.039.001.01"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code camt.039.001.01}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CaseStatusReport"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\nThe Case Status Report message is sent by a case assignee to a case creator or case assigner.\nThis message is used to report on the status of a case.\nUsage\nA Case Status Report message is sent in reply to a Case Status Report Request message. This message\n- covers one and only one case at a time. (If a case assignee needs to report on several cases, then multiple Case Status Report messages must be sent.)\n- may be forwarded to subsequent case assigner(s) until it reaches the end point\n- is able to indicate the fact that a case has been assigned to a party downstream in the payment processing chain\n- may not be used in place of a Resolution Of Investigation (except for the condition given in the next bullet point) or Notification Of Case Assignment message\n- may be skipped and replaced by a Resolution Of Investigation message if at the moment when the request for a investigation status arrives, the assignee has obtained a solution. (In this case a Resolution Of Investigation message can be sent in lieu of a Case Status Report and the case may be closed.)."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "camt.039.001.01", propOrder = {"header", "case_", "status", "newAssignment"})
public class CaseStatusReport {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Hdr", required = true)
	protected ReportHeader header;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.ReportHeader
	 * ReportHeader}</li>
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
	public static final MMMessageBuildingBlock<CaseStatusReport, ReportHeader> mmHeader = new MMMessageBuildingBlock<CaseStatusReport, ReportHeader>() {
		{
			xmlTag = "Hdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Header";
			definition = "Specifies generic information about an investigation report.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> ReportHeader.mmObject();
		}

		@Override
		public ReportHeader getValue(CaseStatusReport obj) {
			return obj.getHeader();
		}

		@Override
		public void setValue(CaseStatusReport obj, ReportHeader value) {
			obj.setHeader(value);
		}
	};
	@XmlElement(name = "Case", required = true)
	protected Case case_;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Case Case}</li>
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
	 * definition} = "Identifies the case."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CaseStatusReport, Case> mmCase = new MMMessageBuildingBlock<CaseStatusReport, Case>() {
		{
			xmlTag = "Case";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Case";
			definition = "Identifies the case.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Case.mmObject();
		}

		@Override
		public Case getValue(CaseStatusReport obj) {
			return obj.getCase();
		}

		@Override
		public void setValue(CaseStatusReport obj, Case value) {
			obj.setCase(value);
		}
	};
	@XmlElement(name = "Sts", required = true)
	protected CaseStatus status;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.CaseStatus
	 * CaseStatus}</li>
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
	public static final MMMessageBuildingBlock<CaseStatusReport, CaseStatus> mmStatus = new MMMessageBuildingBlock<CaseStatusReport, CaseStatus>() {
		{
			xmlTag = "Sts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Status";
			definition = "Defines the status of the case.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CaseStatus.mmObject();
		}

		@Override
		public CaseStatus getValue(CaseStatusReport obj) {
			return obj.getStatus();
		}

		@Override
		public void setValue(CaseStatusReport obj, CaseStatus value) {
			obj.setStatus(value);
		}
	};
	@XmlElement(name = "NewAssgnmt")
	protected CaseAssignment newAssignment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.CaseAssignment
	 * CaseAssignment}</li>
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
	 * definition} = "Identifies the last assignment performed."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CaseStatusReport, Optional<CaseAssignment>> mmNewAssignment = new MMMessageBuildingBlock<CaseStatusReport, Optional<CaseAssignment>>() {
		{
			xmlTag = "NewAssgnmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewAssignment";
			definition = "Identifies the last assignment performed.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CaseAssignment.mmObject();
		}

		@Override
		public Optional<CaseAssignment> getValue(CaseStatusReport obj) {
			return obj.getNewAssignment();
		}

		@Override
		public void setValue(CaseStatusReport obj, Optional<CaseAssignment> value) {
			obj.setNewAssignment(value.orElse(null));
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CaseStatusReport";
				definition = "Scope\nThe Case Status Report message is sent by a case assignee to a case creator or case assigner.\nThis message is used to report on the status of a case.\nUsage\nA Case Status Report message is sent in reply to a Case Status Report Request message. This message\n- covers one and only one case at a time. (If a case assignee needs to report on several cases, then multiple Case Status Report messages must be sent.)\n- may be forwarded to subsequent case assigner(s) until it reaches the end point\n- is able to indicate the fact that a case has been assigned to a party downstream in the payment processing chain\n- may not be used in place of a Resolution Of Investigation (except for the condition given in the next bullet point) or Notification Of Case Assignment message\n- may be skipped and replaced by a Resolution Of Investigation message if at the moment when the request for a investigation status arrives, the assignee has obtained a solution. (In this case a Resolution Of Investigation message can be sent in lieu of a Case Status Report and the case may be closed.).";
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "camt.039.001.01";
				businessArea_lazy = () -> CashManagementArchive.mmObject();
				xmlName = "camt.039.001.01";
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.camt.CaseStatusReport.mmHeader, com.tools20022.repository.area.camt.CaseStatusReport.mmCase,
						com.tools20022.repository.area.camt.CaseStatusReport.mmStatus, com.tools20022.repository.area.camt.CaseStatusReport.mmNewAssignment);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "camt";
						messageFunctionality = "039";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return CaseStatusReport.class;
			}
		});
		return mmObject_lazy.get();
	}

	public ReportHeader getHeader() {
		return header;
	}

	public CaseStatusReport setHeader(ReportHeader header) {
		this.header = Objects.requireNonNull(header);
		return this;
	}

	public Case getCase() {
		return case_;
	}

	public CaseStatusReport setCase(Case case_) {
		this.case_ = Objects.requireNonNull(case_);
		return this;
	}

	public CaseStatus getStatus() {
		return status;
	}

	public CaseStatusReport setStatus(CaseStatus status) {
		this.status = Objects.requireNonNull(status);
		return this;
	}

	public Optional<CaseAssignment> getNewAssignment() {
		return newAssignment == null ? Optional.empty() : Optional.of(newAssignment);
	}

	public CaseStatusReport setNewAssignment(CaseAssignment newAssignment) {
		this.newAssignment = newAssignment;
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.039.001.01")
	static public class Document {
		@XmlElement(name = "camt.039.001.01", required = true)
		public CaseStatusReport messageBody;
	}
}