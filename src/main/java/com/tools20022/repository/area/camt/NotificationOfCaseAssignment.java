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
import com.tools20022.repository.msg.CaseForwardingNotification;
import com.tools20022.repository.msg.ReportHeader;
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
 * Report message.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.CashManagementArchive
 * CashManagementArchive}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msgset.ISOArchive ISOArchive}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlName
 * xmlName} = "camt.030.001.01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "camt.030.001.01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.NotificationOfCaseAssignment#mmHeader
 * NotificationOfCaseAssignment.mmHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.NotificationOfCaseAssignment#mmCase
 * NotificationOfCaseAssignment.mmCase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.NotificationOfCaseAssignment#mmAssignment
 * NotificationOfCaseAssignment.mmAssignment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.NotificationOfCaseAssignment#mmNotification
 * NotificationOfCaseAssignment.mmNotification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code camt.030.001.01}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "NotificationOfCaseAssignment"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe Notification Of Case Assignment message is sent by a case assignee to a case creator/case assigner.\r\nThis message is used to inform the case assigner that:\r\n- the assignee is reassigning the case to the next agent in the transaction processing chain for further action\r\n- the assignee will work on the case himself, without re-assigning it to another party, and therefore indicating that the re-assignment has reached its end-point\r\nUsage\r\nThe Notification Of Case Assignment message is used to notify the case creator or case assigner of further action undertaken by the case assignee in a:\r\n- request to cancel payment case\r\n- request to modify payment case\r\n- unable to apply case\r\n- claim non receipt case\r\nThe Notification Of Case Assignment message\r\n- covers one and only one case at a time. If the case assignee needs to inform a case creator or case assigner about several cases, then multiple Notification Of Case Assignment messages must be sent\r\n- except in the case where it is used to indicate that an agent is doing the correction himself, this message must be forwarded by all subsequent case assigner(s) until it reaches the case creator\r\n- must not be used in place of a Resolution Of Investigation or a Case Status Report message."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "camt.030.001.01", propOrder = {"header", "case", "assignment", "notification"})
public class NotificationOfCaseAssignment {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	protected ReportHeader header;
	/**
	 * Specifies generic information about the notification. The receiver of a
	 * notification is necessarily the party which assigned the case to the
	 * sender.
	 * <p>
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
	 * "Specifies generic information about the notification.\nThe receiver of a notification is necessarily the party which assigned the case to the sender."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmHeader = new MMMessageBuildingBlock() {
		{
			xmlTag = "Hdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Header";
			definition = "Specifies generic information about the notification.\nThe receiver of a notification is necessarily the party which assigned the case to the sender.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> ReportHeader.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return NotificationOfCaseAssignment.class.getMethod("getHeader", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Case case_;
	/**
	 * Identifies the case.
	 * <p>
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
	public static final MMMessageBuildingBlock mmCase = new MMMessageBuildingBlock() {
		{
			xmlTag = "Case";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Case";
			definition = "Identifies the case.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Case.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return NotificationOfCaseAssignment.class.getMethod("getCase", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CaseAssignment assignment;
	/**
	 * Identifies the current assignment of the case.
	 * 
	 * The Assigner must be the emitter of the notification. The Assignee must
	 * be another Party in the payment chain.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.CaseAssignment
	 * CaseAssignment}</li>
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
	 * "Identifies the current assignment of the case. \n\nThe Assigner must be the emitter of the notification.\nThe Assignee must be another Party in the payment chain."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmAssignment = new MMMessageBuildingBlock() {
		{
			xmlTag = "Assgnmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Assignment";
			definition = "Identifies the current assignment of the case. \n\nThe Assigner must be the emitter of the notification.\nThe Assignee must be another Party in the payment chain.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CaseAssignment.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return NotificationOfCaseAssignment.class.getMethod("getAssignment", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CaseForwardingNotification notification;
	/**
	 * Information about the type of action taken.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CaseForwardingNotification
	 * CaseForwardingNotification}</li>
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
			complexType_lazy = () -> CaseForwardingNotification.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return NotificationOfCaseAssignment.class.getMethod("getNotification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "NotificationOfCaseAssignment";
				definition = "Scope\r\nThe Notification Of Case Assignment message is sent by a case assignee to a case creator/case assigner.\r\nThis message is used to inform the case assigner that:\r\n- the assignee is reassigning the case to the next agent in the transaction processing chain for further action\r\n- the assignee will work on the case himself, without re-assigning it to another party, and therefore indicating that the re-assignment has reached its end-point\r\nUsage\r\nThe Notification Of Case Assignment message is used to notify the case creator or case assigner of further action undertaken by the case assignee in a:\r\n- request to cancel payment case\r\n- request to modify payment case\r\n- unable to apply case\r\n- claim non receipt case\r\nThe Notification Of Case Assignment message\r\n- covers one and only one case at a time. If the case assignee needs to inform a case creator or case assigner about several cases, then multiple Notification Of Case Assignment messages must be sent\r\n- except in the case where it is used to indicate that an agent is doing the correction himself, this message must be forwarded by all subsequent case assigner(s) until it reaches the case creator\r\n- must not be used in place of a Resolution Of Investigation or a Case Status Report message.";
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "camt.030.001.01";
				businessArea_lazy = () -> CashManagementArchive.mmObject();
				xmlName = "camt.030.001.01";
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.camt.NotificationOfCaseAssignment.mmHeader, com.tools20022.repository.area.camt.NotificationOfCaseAssignment.mmCase,
						com.tools20022.repository.area.camt.NotificationOfCaseAssignment.mmAssignment, com.tools20022.repository.area.camt.NotificationOfCaseAssignment.mmNotification);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "camt";
						messageFunctionality = "030";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return NotificationOfCaseAssignment.class;
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Hdr", required = true)
	public ReportHeader getHeader() {
		return header;
	}

	public void setHeader(ReportHeader header) {
		this.header = header;
	}

	@XmlElement(name = "Case", required = true)
	public Case getCase() {
		return case_;
	}

	public void setCase(Case case_) {
		this.case_ = case_;
	}

	@XmlElement(name = "Assgnmt", required = true)
	public CaseAssignment getAssignment() {
		return assignment;
	}

	public void setAssignment(CaseAssignment assignment) {
		this.assignment = assignment;
	}

	@XmlElement(name = "Ntfctn", required = true)
	public CaseForwardingNotification getNotification() {
		return notification;
	}

	public void setNotification(CaseForwardingNotification notification) {
		this.notification = notification;
	}

	@XmlRootElement(namespace = "urn:iso:std:iso:20022:tech:xsd:camt.030.01.01")
	static public class Document {
		@XmlElement(name = "camt.030.001.01", required = true)
		public NotificationOfCaseAssignment messageBody;
	}
}