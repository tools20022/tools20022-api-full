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
import com.tools20022.repository.msg.BusinessInformationQueryDefinition3;
import com.tools20022.repository.msg.MessageHeader1;
import com.tools20022.repository.msg.SupplementaryData1;
import com.tools20022.repository.msgset._SR2018_MX_CashManagement_Maintenance;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The GetGeneralBusinessInformation message is sent by a member to the
 * transaction administrator.<br>
 * It is used to request information on a broadcast-type message previously sent
 * by the transaction administrator to all or some of the members, giving
 * information related to the processing business.<br>
 * <b>Usage</b><br>
 * The transaction administrator can send general business information messages
 * to the members, which may request further action from them. General business
 * information can contain either static data announcing foreseen events
 * affecting the system operations, or dynamic data warning or notifying about
 * unexpected events.<br>
 * This type of information can be transmitted in either of the two following
 * ways:<br>
 * - non-solicited reports are pushed by the transaction administrator to the
 * (selected) members together with a reference, a qualifier and a subject line<br>
 * - upon request from the members (pull mode), the transaction administrator
 * delivers the full text/content of the message back to the user<br>
 * The Get General Business Information message is used in this second context.
 * At any time during the operating hours of the system, the member can query
 * the transaction administrator to get information about a report of general
 * business information previously sent.<br>
 * The member can request information based on the following elements:<br>
 * - reference of the report previously delivered<br>
 * - subject of the report previously delivered, detailing the purpose and
 * content of the message<br>
 * - priority of the report previously sent, and indication of its format. (Note
 * that if the format is indicated, the subject refers to a set of pre-agreed
 * texts. This enumeration has to be agreed upon by the transaction
 * administrator and the members of the system.)<br>
 * - details of the previously sent message<br>
 * This message will be replied to by a ReturnGeneralBusinessInformation
 * message.<br>
 * Additional information on the generic design of the Get/Return messages can
 * be found in the section How to Use the Cash Management Messages.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code camt.020.001.03}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.CashManagementLatestVersion
 * CashManagementLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.GetGeneralBusinessInformationV03#mmMessageHeader
 * GetGeneralBusinessInformationV03.mmMessageHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.GetGeneralBusinessInformationV03#mmGeneralBusinessInformationQueryDefinition
 * GetGeneralBusinessInformationV03.mmGeneralBusinessInformationQueryDefinition}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.GetGeneralBusinessInformationV03#mmSupplementaryData
 * GetGeneralBusinessInformationV03.mmSupplementaryData}</li>
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
 * xmlTag} = "GetGnlBizInf"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "GetGeneralBusinessInformationV03"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe GetGeneralBusinessInformation message is sent by a member to the transaction administrator.\r\nIt is used to request information on a broadcast-type message previously sent by the transaction administrator to all or some of the members, giving information related to the processing business.\r\nUsage\r\nThe transaction administrator can send general business information messages to the members, which may request further action from them. General business information can contain either static data announcing foreseen events affecting the system operations, or dynamic data warning or notifying about unexpected events.\r\nThis type of information can be transmitted in either of the two following ways:\r\n- non-solicited reports are pushed by the transaction administrator to the (selected) members together with a reference, a qualifier and a subject line\r\n- upon request from the members (pull mode), the transaction administrator delivers the full text/content of the message back to the user\r\nThe Get General Business Information message is used in this second context. At any time during the operating hours of the system, the member can query the transaction administrator to get information about a report of general business information previously sent.\r\nThe member can request information based on the following elements:\r\n- reference of the report previously delivered\r\n- subject of the report previously delivered, detailing the purpose and content of the message\r\n- priority of the report previously sent, and indication of its format. (Note that if the format is indicated, the subject refers to a set of pre-agreed texts. This enumeration has to be agreed upon by the transaction administrator and the members of the system.)\r\n- details of the previously sent message\r\nThis message will be replied to by a ReturnGeneralBusinessInformation message.\r\nAdditional information on the generic design of the Get/Return messages can be found in the section How to Use the Cash Management Messages."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "GetGeneralBusinessInformationV03", propOrder = {"messageHeader", "generalBusinessInformationQueryDefinition", "supplementaryData"})
public class GetGeneralBusinessInformationV03 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "MsgHdr", required = true)
	protected MessageHeader1 messageHeader;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.MessageHeader1
	 * MessageHeader1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgHdr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageHeader"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Common business identification for the message."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<GetGeneralBusinessInformationV03, MessageHeader1> mmMessageHeader = new MMMessageBuildingBlock<GetGeneralBusinessInformationV03, MessageHeader1>() {
		{
			xmlTag = "MsgHdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageHeader";
			definition = "Common business identification for the message.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageHeader1.mmObject();
		}

		@Override
		public MessageHeader1 getValue(GetGeneralBusinessInformationV03 obj) {
			return obj.getMessageHeader();
		}

		@Override
		public void setValue(GetGeneralBusinessInformationV03 obj, MessageHeader1 value) {
			obj.setMessageHeader(value);
		}
	};
	@XmlElement(name = "GnlBizInfQryDef")
	protected BusinessInformationQueryDefinition3 generalBusinessInformationQueryDefinition;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.BusinessInformationQueryDefinition3
	 * BusinessInformationQueryDefinition3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GnlBizInfQryDef"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GeneralBusinessInformationQueryDefinition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Definition of the general business information query."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<GetGeneralBusinessInformationV03, Optional<BusinessInformationQueryDefinition3>> mmGeneralBusinessInformationQueryDefinition = new MMMessageBuildingBlock<GetGeneralBusinessInformationV03, Optional<BusinessInformationQueryDefinition3>>() {
		{
			xmlTag = "GnlBizInfQryDef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GeneralBusinessInformationQueryDefinition";
			definition = "Definition of the general business information query.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> BusinessInformationQueryDefinition3.mmObject();
		}

		@Override
		public Optional<BusinessInformationQueryDefinition3> getValue(GetGeneralBusinessInformationV03 obj) {
			return obj.getGeneralBusinessInformationQueryDefinition();
		}

		@Override
		public void setValue(GetGeneralBusinessInformationV03 obj, Optional<BusinessInformationQueryDefinition3> value) {
			obj.setGeneralBusinessInformationQueryDefinition(value.orElse(null));
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information that cannot be captured in the structured elements and/or any other specific block."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<GetGeneralBusinessInformationV03, List<SupplementaryData1>> mmSupplementaryData = new MMMessageBuildingBlock<GetGeneralBusinessInformationV03, List<SupplementaryData1>>() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(GetGeneralBusinessInformationV03 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(GetGeneralBusinessInformationV03 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "GetGeneralBusinessInformationV03";
				definition = "Scope\r\nThe GetGeneralBusinessInformation message is sent by a member to the transaction administrator.\r\nIt is used to request information on a broadcast-type message previously sent by the transaction administrator to all or some of the members, giving information related to the processing business.\r\nUsage\r\nThe transaction administrator can send general business information messages to the members, which may request further action from them. General business information can contain either static data announcing foreseen events affecting the system operations, or dynamic data warning or notifying about unexpected events.\r\nThis type of information can be transmitted in either of the two following ways:\r\n- non-solicited reports are pushed by the transaction administrator to the (selected) members together with a reference, a qualifier and a subject line\r\n- upon request from the members (pull mode), the transaction administrator delivers the full text/content of the message back to the user\r\nThe Get General Business Information message is used in this second context. At any time during the operating hours of the system, the member can query the transaction administrator to get information about a report of general business information previously sent.\r\nThe member can request information based on the following elements:\r\n- reference of the report previously delivered\r\n- subject of the report previously delivered, detailing the purpose and content of the message\r\n- priority of the report previously sent, and indication of its format. (Note that if the format is indicated, the subject refers to a set of pre-agreed texts. This enumeration has to be agreed upon by the transaction administrator and the members of the system.)\r\n- details of the previously sent message\r\nThis message will be replied to by a ReturnGeneralBusinessInformation message.\r\nAdditional information on the generic design of the Get/Return messages can be found in the section How to Use the Cash Management Messages.";
				messageSet_lazy = () -> Arrays.asList(_SR2018_MX_CashManagement_Maintenance.mmObject());
				rootElement = "Document";
				xmlTag = "GetGnlBizInf";
				businessArea_lazy = () -> CashManagementLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.camt.GetGeneralBusinessInformationV03.mmMessageHeader,
						com.tools20022.repository.area.camt.GetGeneralBusinessInformationV03.mmGeneralBusinessInformationQueryDefinition, com.tools20022.repository.area.camt.GetGeneralBusinessInformationV03.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "camt";
						messageFunctionality = "020";
						version = "03";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return GetGeneralBusinessInformationV03.class;
			}
		});
		return mmObject_lazy.get();
	}

	public MessageHeader1 getMessageHeader() {
		return messageHeader;
	}

	public GetGeneralBusinessInformationV03 setMessageHeader(MessageHeader1 messageHeader) {
		this.messageHeader = Objects.requireNonNull(messageHeader);
		return this;
	}

	public Optional<BusinessInformationQueryDefinition3> getGeneralBusinessInformationQueryDefinition() {
		return generalBusinessInformationQueryDefinition == null ? Optional.empty() : Optional.of(generalBusinessInformationQueryDefinition);
	}

	public GetGeneralBusinessInformationV03 setGeneralBusinessInformationQueryDefinition(BusinessInformationQueryDefinition3 generalBusinessInformationQueryDefinition) {
		this.generalBusinessInformationQueryDefinition = generalBusinessInformationQueryDefinition;
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public GetGeneralBusinessInformationV03 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.020.001.03")
	static public class Document {
		@XmlElement(name = "GetGnlBizInf", required = true)
		public GetGeneralBusinessInformationV03 messageBody;
	}
}