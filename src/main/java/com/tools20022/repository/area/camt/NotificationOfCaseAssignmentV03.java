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
import com.tools20022.repository.msg.CaseForwardingNotification3;
import com.tools20022.repository.msg.ReportHeader2;
import com.tools20022.repository.msgset.ISOArchive;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The Notification Of Case Assignment message is sent by a case assignee to a
 * case creator/case assigner.<br>
 * This message is used to inform the case assigner that:<br>
 * - the assignee is reassigning the case to the next agent in the transaction
 * processing chain for further action<br>
 * - the assignee will work on the case himself, without re-assigning it to
 * another party, and therefore indicating that the re-assignment has reached
 * its end-point<br>
 * <b>Usage</b><br>
 * The Notification Of Case Assignment message is used to notify the case
 * creator or case assigner of further action undertaken by the case assignee in
 * a:<br>
 * - request to cancel payment case<br>
 * - request to modify payment case<br>
 * - unable to apply case<br>
 * - claim non receipt case<br>
 * The Notification Of Case Assignment message<br>
 * - covers one and only one case at a time. If the case assignee needs to
 * inform a case creator or case assigner about several cases, then multiple
 * Notification Of Case Assignment messages must be sent<br>
 * - except in the case where it is used to indicate that an agent is doing the
 * correction himself, this message must be forwarded by all subsequent case
 * assigner(s) until it reaches the case creator<br>
 * - must not be used in place of a Resolution Of Investigation or a Case Status
 * Report message<br>
 * When the assignee does not reassign the case to another party (that is
 * responding with a Notification Of Case Assignment message with notification
 * MINE - The case is processed by the assignee), the case assignment should
 * contain the case assignment elements as received in the original query.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.CashManagementPreviousVersion
 * CashManagementPreviousVersion}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msgset.ISOArchive ISOArchive}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "NtfctnOfCaseAssgnmt"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.NotificationOfCaseAssignmentV03#mmHeader
 * NotificationOfCaseAssignmentV03.mmHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.NotificationOfCaseAssignmentV03#mmCase
 * NotificationOfCaseAssignmentV03.mmCase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.NotificationOfCaseAssignmentV03#mmAssignment
 * NotificationOfCaseAssignmentV03.mmAssignment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.NotificationOfCaseAssignmentV03#mmNotification
 * NotificationOfCaseAssignmentV03.mmNotification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code camt.030.001.03}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "NotificationOfCaseAssignmentV03"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe Notification Of Case Assignment message is sent by a case assignee to a case creator/case assigner.\r\nThis message is used to inform the case assigner that:\r\n- the assignee is reassigning the case to the next agent in the transaction processing chain for further action\r\n- the assignee will work on the case himself, without re-assigning it to another party, and therefore indicating that the re-assignment has reached its end-point\r\nUsage\r\nThe Notification Of Case Assignment message is used to notify the case creator or case assigner of further action undertaken by the case assignee in a:\r\n- request to cancel payment case\r\n- request to modify payment case\r\n- unable to apply case\r\n- claim non receipt case\r\nThe Notification Of Case Assignment message\r\n- covers one and only one case at a time. If the case assignee needs to inform a case creator or case assigner about several cases, then multiple Notification Of Case Assignment messages must be sent\r\n- except in the case where it is used to indicate that an agent is doing the correction himself, this message must be forwarded by all subsequent case assigner(s) until it reaches the case creator\r\n- must not be used in place of a Resolution Of Investigation or a Case Status Report message\r\nWhen the assignee does not reassign the case to another party (that is responding with a Notification Of Case Assignment message with notification MINE - The case is processed by the assignee), the case assignment should contain the case assignment elements as received in the original query."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.NotificationOfCaseAssignmentV04
 * NotificationOfCaseAssignmentV04}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "NotificationOfCaseAssignmentV03", propOrder = {"header", "case", "assignment", "notification"})
public class NotificationOfCaseAssignmentV03 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	protected ReportHeader2 header;
	/**
	 * Specifies generic information about the notification. The receiver of a
	 * notification must be the party which assigned the case to the sender.
	 * <p>
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
	 * "Specifies generic information about the notification.\nThe receiver of a notification must be the party which assigned the case to the sender."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmHeader = new MMMessageBuildingBlock() {
		{
			xmlTag = "Hdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Header";
			definition = "Specifies generic information about the notification.\nThe receiver of a notification must be the party which assigned the case to the sender.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> ReportHeader2.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return NotificationOfCaseAssignmentV03.class.getMethod("getHeader", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Case2 case_;
	/**
	 * Identifies the investigation case.
	 * <p>
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
				return NotificationOfCaseAssignmentV03.class.getMethod("getCase", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CaseAssignment2 assignment;
	/**
	 * Identifies the assignment of an investigation case from an assigner to an
	 * assignee. Usage: The Assigner must be the sender of this confirmation and
	 * the Assignee must be the receiver.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.CaseAssignment2
	 * CaseAssignment2}</li>
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
	 * definition} =
	 * "Identifies the assignment of an investigation case from an assigner to an assignee.\nUsage: The Assigner must be the sender of this confirmation and the Assignee must be the receiver."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmAssignment = new MMMessageBuildingBlock() {
		{
			xmlTag = "Assgnmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Assignment";
			definition = "Identifies the assignment of an investigation case from an assigner to an assignee.\nUsage: The Assigner must be the sender of this confirmation and the Assignee must be the receiver.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CaseAssignment2.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return NotificationOfCaseAssignmentV03.class.getMethod("getAssignment", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CaseForwardingNotification3 notification;
	/**
	 * Information about the type of action taken.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CaseForwardingNotification3
	 * CaseForwardingNotification3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ntfctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Notification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information about the type of action taken."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmNotification = new MMMessageBuildingBlock() {
		{
			xmlTag = "Ntfctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Notification";
			definition = "Information about the type of action taken.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CaseForwardingNotification3.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return NotificationOfCaseAssignmentV03.class.getMethod("getNotification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "NotificationOfCaseAssignmentV03";
				definition = "Scope\r\nThe Notification Of Case Assignment message is sent by a case assignee to a case creator/case assigner.\r\nThis message is used to inform the case assigner that:\r\n- the assignee is reassigning the case to the next agent in the transaction processing chain for further action\r\n- the assignee will work on the case himself, without re-assigning it to another party, and therefore indicating that the re-assignment has reached its end-point\r\nUsage\r\nThe Notification Of Case Assignment message is used to notify the case creator or case assigner of further action undertaken by the case assignee in a:\r\n- request to cancel payment case\r\n- request to modify payment case\r\n- unable to apply case\r\n- claim non receipt case\r\nThe Notification Of Case Assignment message\r\n- covers one and only one case at a time. If the case assignee needs to inform a case creator or case assigner about several cases, then multiple Notification Of Case Assignment messages must be sent\r\n- except in the case where it is used to indicate that an agent is doing the correction himself, this message must be forwarded by all subsequent case assigner(s) until it reaches the case creator\r\n- must not be used in place of a Resolution Of Investigation or a Case Status Report message\r\nWhen the assignee does not reassign the case to another party (that is responding with a Notification Of Case Assignment message with notification MINE - The case is processed by the assignee), the case assignment should contain the case assignment elements as received in the original query.";
				nextVersions_lazy = () -> Arrays.asList(NotificationOfCaseAssignmentV04.mmObject());
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "NtfctnOfCaseAssgnmt";
				businessArea_lazy = () -> CashManagementPreviousVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.camt.NotificationOfCaseAssignmentV03.mmHeader, com.tools20022.repository.area.camt.NotificationOfCaseAssignmentV03.mmCase,
						com.tools20022.repository.area.camt.NotificationOfCaseAssignmentV03.mmAssignment, com.tools20022.repository.area.camt.NotificationOfCaseAssignmentV03.mmNotification);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "camt";
						messageFunctionality = "030";
						version = "03";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return NotificationOfCaseAssignmentV03.class;
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Hdr", required = true)
	public ReportHeader2 getHeader() {
		return header;
	}

	public void setHeader(ReportHeader2 header) {
		this.header = header;
	}

	@XmlElement(name = "Case", required = true)
	public Case2 getCase() {
		return case_;
	}

	public void setCase(Case2 case_) {
		this.case_ = case_;
	}

	@XmlElement(name = "Assgnmt", required = true)
	public CaseAssignment2 getAssignment() {
		return assignment;
	}

	public void setAssignment(CaseAssignment2 assignment) {
		this.assignment = assignment;
	}

	@XmlElement(name = "Ntfctn", required = true)
	public CaseForwardingNotification3 getNotification() {
		return notification;
	}

	public void setNotification(CaseForwardingNotification3 notification) {
		this.notification = notification;
	}

	@XmlRootElement(namespace = "urn:iso:std:iso:20022:tech:xsd:camt.030.03.03")
	static public class Document {
		@XmlElement(name = "NtfctnOfCaseAssgnmt", required = true)
		public NotificationOfCaseAssignmentV03 messageBody;
	}
}