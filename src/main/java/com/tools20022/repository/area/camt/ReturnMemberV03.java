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
import com.tools20022.repository.area.CashManagementLatestVersion;
import com.tools20022.repository.choice.MemberReportOrError3Choice;
import com.tools20022.repository.msg.MessageHeader7;
import com.tools20022.repository.msg.SupplementaryData1;
import com.tools20022.repository.msgset._SR2018_MX_CashManagement_Maintenance;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The ReturnMember message is sent by the transaction administrator to a member
 * of the system.<br>
 * It is used to provide information on static data maintained by the
 * transaction administrator and related to the participants in the system and
 * their membership status vis-a-vis this system.<br>
 * The ReturnMember message can be sent as a response to a related GetMember
 * message (pull mode) or initiated by the transaction administrator (push
 * mode). The push of information can take place either at prearranged times or
 * as a warning or alarm when a problem has occurred.<br>
 * <b>Usage</b><br>
 * The transaction administrator is in charge of providing the members with
 * business information. The term business information covers all information
 * related to the management of the system, that is, not related to the
 * transactions entered into in the system. The type of business information
 * available can vary depending on the system. Among other things, it can refer
 * to information about the membership of the system.<br>
 * The member can request information about the members of the system through a
 * series of criteria, corresponding to the known information stored within the
 * transaction administrator. Based on the criteria received within the request,
 * the transaction administrator will select items that will match with the
 * request and report them to the requestor.<br>
 * The transaction administrator may also send a Return Member message with
 * pre-defined information at times previously agreed with the member or to warn
 * the member about a particular problem that may have arisen and which needs
 * the member(s) attention.<br>
 * The message from the transaction administrator can contain information based
 * on the following elements:<br>
 * - identification of the member within the system<br>
 * - membership status<br>
 * - type of member<br>
 * - contact details for the member: name, address<br>
 * - identification of the member's account<br>
 * - identification of contact persons for the member, their role and details.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ReturnMemberV03#mmMessageHeader
 * ReturnMemberV03.mmMessageHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ReturnMemberV03#mmReportOrError
 * ReturnMemberV03.mmReportOrError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ReturnMemberV03#mmSupplementaryData
 * ReturnMemberV03.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset._SR2018_MX_CashManagement_Maintenance
 * _SR2018_MX_CashManagement_Maintenance}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "RtrMmb"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.CashManagementLatestVersion
 * CashManagementLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code camt.014.001.03}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ReturnMemberV03"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe ReturnMember message is sent by the transaction administrator to a member of the system.\r\nIt is used to provide information on static data maintained by the transaction administrator and related to the participants in the system and their membership status vis-a-vis this system.\r\nThe ReturnMember message can be sent as a response to a related GetMember message (pull mode) or initiated by the transaction administrator (push mode). The push of information can take place either at prearranged times or as a warning or alarm when a problem has occurred.\r\nUsage\r\nThe transaction administrator is in charge of providing the members with business information. The term business information covers all information related to the management of the system, that is, not related to the transactions entered into in the system. The type of business information available can vary depending on the system. Among other things, it can refer to information about the membership of the system.\r\nThe member can request information about the members of the system through a series of criteria, corresponding to the known information stored within the transaction administrator. Based on the criteria received within the request, the transaction administrator will select items that will match with the request and report them to the requestor.\r\nThe transaction administrator may also send a Return Member message with pre-defined information at times previously agreed with the member or to warn the member about a particular problem that may have arisen and which needs the member(s) attention.\r\nThe message from the transaction administrator can contain information based on the following elements:\r\n- identification of the member within the system\r\n- membership status\r\n- type of member\r\n- contact details for the member: name, address\r\n- identification of the member's account\r\n- identification of contact persons for the member, their role and details."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ReturnMemberV03", propOrder = {"messageHeader", "reportOrError", "supplementaryData"})
public class ReturnMemberV03 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "MsgHdr", required = true)
	protected MessageHeader7 messageHeader;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.MessageHeader7
	 * MessageHeader7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgHdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageHeader"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Common business identification for the message."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ReturnMemberV03, MessageHeader7> mmMessageHeader = new MMMessageBuildingBlock<ReturnMemberV03, MessageHeader7>() {
		{
			xmlTag = "MsgHdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageHeader";
			definition = "Common business identification for the message.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageHeader7.mmObject();
		}

		@Override
		public MessageHeader7 getValue(ReturnMemberV03 obj) {
			return obj.getMessageHeader();
		}

		@Override
		public void setValue(ReturnMemberV03 obj, MessageHeader7 value) {
			obj.setMessageHeader(value);
		}
	};
	@XmlElement(name = "RptOrErr", required = true)
	protected MemberReportOrError3Choice reportOrError;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.MemberReportOrError3Choice
	 * MemberReportOrError3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptOrErr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportOrError"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reports on members."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ReturnMemberV03, MemberReportOrError3Choice> mmReportOrError = new MMMessageBuildingBlock<ReturnMemberV03, MemberReportOrError3Choice>() {
		{
			xmlTag = "RptOrErr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportOrError";
			definition = "Reports on members.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MemberReportOrError3Choice.mmObject();
		}

		@Override
		public MemberReportOrError3Choice getValue(ReturnMemberV03 obj) {
			return obj.getReportOrError();
		}

		@Override
		public void setValue(ReturnMemberV03 obj, MemberReportOrError3Choice value) {
			obj.setReportOrError(value);
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ReturnMemberV03, List<SupplementaryData1>> mmSupplementaryData = new MMMessageBuildingBlock<ReturnMemberV03, List<SupplementaryData1>>() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(ReturnMemberV03 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(ReturnMemberV03 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "ReturnMemberV03";
				definition = "Scope\r\nThe ReturnMember message is sent by the transaction administrator to a member of the system.\r\nIt is used to provide information on static data maintained by the transaction administrator and related to the participants in the system and their membership status vis-a-vis this system.\r\nThe ReturnMember message can be sent as a response to a related GetMember message (pull mode) or initiated by the transaction administrator (push mode). The push of information can take place either at prearranged times or as a warning or alarm when a problem has occurred.\r\nUsage\r\nThe transaction administrator is in charge of providing the members with business information. The term business information covers all information related to the management of the system, that is, not related to the transactions entered into in the system. The type of business information available can vary depending on the system. Among other things, it can refer to information about the membership of the system.\r\nThe member can request information about the members of the system through a series of criteria, corresponding to the known information stored within the transaction administrator. Based on the criteria received within the request, the transaction administrator will select items that will match with the request and report them to the requestor.\r\nThe transaction administrator may also send a Return Member message with pre-defined information at times previously agreed with the member or to warn the member about a particular problem that may have arisen and which needs the member(s) attention.\r\nThe message from the transaction administrator can contain information based on the following elements:\r\n- identification of the member within the system\r\n- membership status\r\n- type of member\r\n- contact details for the member: name, address\r\n- identification of the member's account\r\n- identification of contact persons for the member, their role and details.";
				messageSet_lazy = () -> Arrays.asList(_SR2018_MX_CashManagement_Maintenance.mmObject());
				rootElement = "Document";
				xmlTag = "RtrMmb";
				businessArea_lazy = () -> CashManagementLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.camt.ReturnMemberV03.mmMessageHeader, com.tools20022.repository.area.camt.ReturnMemberV03.mmReportOrError,
						com.tools20022.repository.area.camt.ReturnMemberV03.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "camt";
						messageFunctionality = "014";
						version = "03";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return ReturnMemberV03.class;
			}
		});
		return mmObject_lazy.get();
	}

	public MessageHeader7 getMessageHeader() {
		return messageHeader;
	}

	public ReturnMemberV03 setMessageHeader(MessageHeader7 messageHeader) {
		this.messageHeader = Objects.requireNonNull(messageHeader);
		return this;
	}

	public MemberReportOrError3Choice getReportOrError() {
		return reportOrError;
	}

	public ReturnMemberV03 setReportOrError(MemberReportOrError3Choice reportOrError) {
		this.reportOrError = Objects.requireNonNull(reportOrError);
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public ReturnMemberV03 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.014.001.03")
	static public class Document {
		@XmlElement(name = "RtrMmb", required = true)
		public ReturnMemberV03 messageBody;
	}
}