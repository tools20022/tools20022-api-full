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
import com.tools20022.repository.area.AccountManagementPreviousVersion;
import com.tools20022.repository.msg.IdentificationAssignment1;
import com.tools20022.repository.msg.MessageIdentification4;
import com.tools20022.repository.msg.VerificationReport1;
import com.tools20022.repository.msgset.ChangeorVerifyAccountIdentificationISOPreviousversion;
import com.tools20022.repository.msgset.ISOArchive;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The IdentificationVerificationReport message is sent by an assigner to an
 * assignee. It is used to confirm whether or not the presented party and/or
 * account identification information is correct.<br>
 * <b>Usage</b><br>
 * The IdentificationVerificationReport message is sent as a response to an
 * IdentificationVerificationRequest message.<br>
 * The IdentificationVerificationReport message can contain one or more reports.<br>
 * The IdentificationVerificationReport message may include a reason if the
 * presented party and/or account identification information is confirmed to be
 * incorrect.<br>
 * The IdentificationVerificationReport message may include the correct party
 * and/or account identification information.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.IdentificationVerificationReportV01#mmAssignment
 * IdentificationVerificationReportV01.mmAssignment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.IdentificationVerificationReportV01#mmOriginalAssignment
 * IdentificationVerificationReportV01.mmOriginalAssignment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.IdentificationVerificationReportV01#mmReport
 * IdentificationVerificationReportV01.mmReport}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.ChangeorVerifyAccountIdentificationISOPreviousversion
 * ChangeorVerifyAccountIdentificationISOPreviousversion}</li>
 * <li>{@linkplain com.tools20022.repository.msgset.ISOArchive ISOArchive}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "IdVrfctnRpt"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.AccountManagementPreviousVersion
 * AccountManagementPreviousVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code acmt.024.001.01}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "IdentificationVerificationReportV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe IdentificationVerificationReport message is sent by an assigner to an assignee. It is used to confirm whether or not the presented party and/or account identification information is correct.\r\nUsage\r\nThe IdentificationVerificationReport message is sent as a response to an IdentificationVerificationRequest message.\r\nThe IdentificationVerificationReport message can contain one or more reports.\r\nThe IdentificationVerificationReport message may include a reason if the presented party and/or account identification information is confirmed to be incorrect.\r\nThe IdentificationVerificationReport message may include the correct party and/or account identification information."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.IdentificationVerificationReportV02
 * IdentificationVerificationReportV02}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "IdentificationVerificationReportV01", propOrder = {"assignment", "originalAssignment", "report"})
public class IdentificationVerificationReportV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Assgnmt", required = true)
	protected IdentificationAssignment1 assignment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.IdentificationAssignment1
	 * IdentificationAssignment1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Assgnmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Assignment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the identification assignment."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<IdentificationVerificationReportV01, IdentificationAssignment1> mmAssignment = new MMMessageBuildingBlock<IdentificationVerificationReportV01, IdentificationAssignment1>() {
		{
			xmlTag = "Assgnmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Assignment";
			definition = "Identifies the identification assignment.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> IdentificationAssignment1.mmObject();
		}

		@Override
		public IdentificationAssignment1 getValue(IdentificationVerificationReportV01 obj) {
			return obj.getAssignment();
		}

		@Override
		public void setValue(IdentificationVerificationReportV01 obj, IdentificationAssignment1 value) {
			obj.setAssignment(value);
		}
	};
	@XmlElement(name = "OrgnlAssgnmt")
	protected MessageIdentification4 originalAssignment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.MessageIdentification4
	 * MessageIdentification4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlAssgnmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalAssignment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides for the reference to the original identification assignment."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<IdentificationVerificationReportV01, Optional<MessageIdentification4>> mmOriginalAssignment = new MMMessageBuildingBlock<IdentificationVerificationReportV01, Optional<MessageIdentification4>>() {
		{
			xmlTag = "OrgnlAssgnmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalAssignment";
			definition = "Provides for the reference to the original identification assignment.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> MessageIdentification4.mmObject();
		}

		@Override
		public Optional<MessageIdentification4> getValue(IdentificationVerificationReportV01 obj) {
			return obj.getOriginalAssignment();
		}

		@Override
		public void setValue(IdentificationVerificationReportV01 obj, Optional<MessageIdentification4> value) {
			obj.setOriginalAssignment(value.orElse(null));
		}
	};
	@XmlElement(name = "Rpt", required = true)
	protected List<VerificationReport1> report;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.VerificationReport1
	 * VerificationReport1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rpt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Report"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information concerning the verification of the identification data for which verification was requested."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<IdentificationVerificationReportV01, List<VerificationReport1>> mmReport = new MMMessageBuildingBlock<IdentificationVerificationReportV01, List<VerificationReport1>>() {
		{
			xmlTag = "Rpt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Report";
			definition = "Information concerning the verification of the identification data for which verification was requested.";
			minOccurs = 1;
			complexType_lazy = () -> VerificationReport1.mmObject();
		}

		@Override
		public List<VerificationReport1> getValue(IdentificationVerificationReportV01 obj) {
			return obj.getReport();
		}

		@Override
		public void setValue(IdentificationVerificationReportV01 obj, List<VerificationReport1> value) {
			obj.setReport(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "IdentificationVerificationReportV01";
				definition = "Scope\r\nThe IdentificationVerificationReport message is sent by an assigner to an assignee. It is used to confirm whether or not the presented party and/or account identification information is correct.\r\nUsage\r\nThe IdentificationVerificationReport message is sent as a response to an IdentificationVerificationRequest message.\r\nThe IdentificationVerificationReport message can contain one or more reports.\r\nThe IdentificationVerificationReport message may include a reason if the presented party and/or account identification information is confirmed to be incorrect.\r\nThe IdentificationVerificationReport message may include the correct party and/or account identification information.";
				nextVersions_lazy = () -> Arrays.asList(IdentificationVerificationReportV02.mmObject());
				messageSet_lazy = () -> Arrays.asList(ChangeorVerifyAccountIdentificationISOPreviousversion.mmObject(), ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "IdVrfctnRpt";
				businessArea_lazy = () -> AccountManagementPreviousVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.acmt.IdentificationVerificationReportV01.mmAssignment,
						com.tools20022.repository.area.acmt.IdentificationVerificationReportV01.mmOriginalAssignment, com.tools20022.repository.area.acmt.IdentificationVerificationReportV01.mmReport);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "acmt";
						messageFunctionality = "024";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return IdentificationVerificationReportV01.class;
			}
		});
		return mmObject_lazy.get();
	}

	public IdentificationAssignment1 getAssignment() {
		return assignment;
	}

	public IdentificationVerificationReportV01 setAssignment(IdentificationAssignment1 assignment) {
		this.assignment = Objects.requireNonNull(assignment);
		return this;
	}

	public Optional<MessageIdentification4> getOriginalAssignment() {
		return originalAssignment == null ? Optional.empty() : Optional.of(originalAssignment);
	}

	public IdentificationVerificationReportV01 setOriginalAssignment(MessageIdentification4 originalAssignment) {
		this.originalAssignment = originalAssignment;
		return this;
	}

	public List<VerificationReport1> getReport() {
		return report == null ? report = new ArrayList<>() : report;
	}

	public IdentificationVerificationReportV01 setReport(List<VerificationReport1> report) {
		this.report = Objects.requireNonNull(report);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:acmt.024.001.01")
	static public class Document {
		@XmlElement(name = "IdVrfctnRpt", required = true)
		public IdentificationVerificationReportV01 messageBody;
	}
}