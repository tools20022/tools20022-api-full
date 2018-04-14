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
import com.tools20022.repository.msg.MemberQueryDefinition3;
import com.tools20022.repository.msg.MessageHeader9;
import com.tools20022.repository.msg.SupplementaryData1;
import com.tools20022.repository.msgset._SR2018_MX_CashManagement_Maintenance;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The GetMember message is sent by a member to the transaction administrator.<br>
 * It is used to request information on static data maintained by the
 * transaction administrator and related to the participants in the system and
 * their membership status vis-a-vis this system.<br>
 * <b>Usage</b><br>
 * The transaction administrator is in charge of providing the members with
 * business information. The term business information covers all information
 * related to the management of the system, that is, not related to the
 * transactions entered into the system. The type of business information
 * available can vary depending on the system. Among other things, it can refer
 * to information about the membership of the system.<br>
 * At any time during the operating hours of the system, the member can query
 * the transaction administrator to get information about the static data
 * related to the members of the system.<br>
 * The member can request information based on the following elements:<br>
 * - identification of the member within the system<br>
 * - membership status<br>
 * - type of member<br>
 * - contact details for the member: name, address<br>
 * - account number of the member<br>
 * - identification of contact persons for the member<br>
 * This message will be replied to by a ReturnMember message.<br>
 * Additional information on the generic design of the Get/Return messages can
 * be found in the MDR Part 1 section How to Use the Cash Management Messages.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code camt.013.001.03}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.CashManagementLatestVersion
 * CashManagementLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.GetMemberV03#mmMessageHeader
 * GetMemberV03.mmMessageHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.GetMemberV03#mmMemberQueryDefinition
 * GetMemberV03.mmMemberQueryDefinition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.GetMemberV03#mmSupplementaryData
 * GetMemberV03.mmSupplementaryData}</li>
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
 * xmlTag} = "GetMmb"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "GetMemberV03"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe GetMember message is sent by a member to the transaction administrator.\r\nIt is used to request information on static data maintained by the transaction administrator and related to the participants in the system and their membership status vis-a-vis this system.\r\nUsage\r\nThe transaction administrator is in charge of providing the members with business information. The term business information covers all information related to the management of the system, that is, not related to the transactions entered into the system. The type of business information available can vary depending on the system. Among other things, it can refer to information about the membership of the system.\r\nAt any time during the operating hours of the system, the member can query the transaction administrator to get information about the static data related to the members of the system.\r\nThe member can request information based on the following elements:\r\n- identification of the member within the system\r\n- membership status\r\n- type of member\r\n- contact details for the member: name, address\r\n- account number of the member\r\n- identification of contact persons for the member\r\nThis message will be replied to by a ReturnMember message.\r\nAdditional information on the generic design of the Get/Return messages can be found in the MDR Part 1 section How to Use the Cash Management Messages."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "GetMemberV03", propOrder = {"messageHeader", "memberQueryDefinition", "supplementaryData"})
public class GetMemberV03 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "MsgHdr", required = true)
	protected MessageHeader9 messageHeader;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.MessageHeader9
	 * MessageHeader9}</li>
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
	public static final MMMessageBuildingBlock<GetMemberV03, MessageHeader9> mmMessageHeader = new MMMessageBuildingBlock<GetMemberV03, MessageHeader9>() {
		{
			xmlTag = "MsgHdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageHeader";
			definition = "Common business identification for the message.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageHeader9.mmObject();
		}

		@Override
		public MessageHeader9 getValue(GetMemberV03 obj) {
			return obj.getMessageHeader();
		}

		@Override
		public void setValue(GetMemberV03 obj, MessageHeader9 value) {
			obj.setMessageHeader(value);
		}
	};
	@XmlElement(name = "MmbQryDef")
	protected MemberQueryDefinition3 memberQueryDefinition;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.MemberQueryDefinition3
	 * MemberQueryDefinition3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MmbQryDef"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MemberQueryDefinition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Definition of the member query."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<GetMemberV03, Optional<MemberQueryDefinition3>> mmMemberQueryDefinition = new MMMessageBuildingBlock<GetMemberV03, Optional<MemberQueryDefinition3>>() {
		{
			xmlTag = "MmbQryDef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MemberQueryDefinition";
			definition = "Definition of the member query.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> MemberQueryDefinition3.mmObject();
		}

		@Override
		public Optional<MemberQueryDefinition3> getValue(GetMemberV03 obj) {
			return obj.getMemberQueryDefinition();
		}

		@Override
		public void setValue(GetMemberV03 obj, Optional<MemberQueryDefinition3> value) {
			obj.setMemberQueryDefinition(value.orElse(null));
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
	public static final MMMessageBuildingBlock<GetMemberV03, List<SupplementaryData1>> mmSupplementaryData = new MMMessageBuildingBlock<GetMemberV03, List<SupplementaryData1>>() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(GetMemberV03 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(GetMemberV03 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "GetMemberV03";
				definition = "Scope\r\nThe GetMember message is sent by a member to the transaction administrator.\r\nIt is used to request information on static data maintained by the transaction administrator and related to the participants in the system and their membership status vis-a-vis this system.\r\nUsage\r\nThe transaction administrator is in charge of providing the members with business information. The term business information covers all information related to the management of the system, that is, not related to the transactions entered into the system. The type of business information available can vary depending on the system. Among other things, it can refer to information about the membership of the system.\r\nAt any time during the operating hours of the system, the member can query the transaction administrator to get information about the static data related to the members of the system.\r\nThe member can request information based on the following elements:\r\n- identification of the member within the system\r\n- membership status\r\n- type of member\r\n- contact details for the member: name, address\r\n- account number of the member\r\n- identification of contact persons for the member\r\nThis message will be replied to by a ReturnMember message.\r\nAdditional information on the generic design of the Get/Return messages can be found in the MDR Part 1 section How to Use the Cash Management Messages.";
				messageSet_lazy = () -> Arrays.asList(_SR2018_MX_CashManagement_Maintenance.mmObject());
				rootElement = "Document";
				xmlTag = "GetMmb";
				businessArea_lazy = () -> CashManagementLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.camt.GetMemberV03.mmMessageHeader, com.tools20022.repository.area.camt.GetMemberV03.mmMemberQueryDefinition,
						com.tools20022.repository.area.camt.GetMemberV03.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "camt";
						messageFunctionality = "013";
						version = "03";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return GetMemberV03.class;
			}
		});
		return mmObject_lazy.get();
	}

	public MessageHeader9 getMessageHeader() {
		return messageHeader;
	}

	public GetMemberV03 setMessageHeader(MessageHeader9 messageHeader) {
		this.messageHeader = Objects.requireNonNull(messageHeader);
		return this;
	}

	public Optional<MemberQueryDefinition3> getMemberQueryDefinition() {
		return memberQueryDefinition == null ? Optional.empty() : Optional.of(memberQueryDefinition);
	}

	public GetMemberV03 setMemberQueryDefinition(MemberQueryDefinition3 memberQueryDefinition) {
		this.memberQueryDefinition = memberQueryDefinition;
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public GetMemberV03 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.013.001.03")
	static public class Document {
		@XmlElement(name = "GetMmb", required = true)
		public GetMemberV03 messageBody;
	}
}