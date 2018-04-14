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
import com.tools20022.repository.choice.MemberIdentification2Choice;
import com.tools20022.repository.msg.Member3;
import com.tools20022.repository.msg.MessageHeader1;
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
 * The ModifyMember message is sent by a member to the transaction
 * administrator.<br>
 * It is used to request modifications to the static data related to the profile
 * of a member that the transaction administrator maintains.<br>
 * <b>Usage</b><br>
 * The transaction administrator is in charge of providing the members with
 * business information. The term business information covers all information
 * related to the management of the system, that is, not related to the
 * transactions entered into the system. The type of business information
 * available can vary depending on the system. Among other things, it can, refer
 * to information about the membership of the system.<br>
 * At any time during the operating hours of the system, the member can request
 * the transaction administrator to modify the information it maintains about
 * the member.<br>
 * The member will submit a message requesting modifications in one or more of
 * the following criteria:<br>
 * - identification of the member<br>
 * - contact information for the member organization: postal address, e-mail
 * address, telephone or fax number<br>
 * - identification of contact persons for the member, their role and/or details
 * (postal address, e-mail address, telephone or fax number)<br>
 * Based on the criteria received within the Modify Member message, the
 * transaction administrator will execute or reject the requested modifications.<br>
 * In principle, the transaction administrator may send a Receipt message as a
 * reply to the ModifyMember request. To verify the outcome of the request, the
 * member may submit a GetMember message with the appropriate search criteria.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code camt.015.001.03}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.CashManagementLatestVersion
 * CashManagementLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ModifyMemberV03#mmMessageHeader
 * ModifyMemberV03.mmMessageHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ModifyMemberV03#mmMemberIdentification
 * ModifyMemberV03.mmMemberIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ModifyMemberV03#mmNewMemberValueSet
 * ModifyMemberV03.mmNewMemberValueSet}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ModifyMemberV03#mmSupplementaryData
 * ModifyMemberV03.mmSupplementaryData}</li>
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
 * xmlTag} = "ModfyMmb"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ModifyMemberV03"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe ModifyMember message is sent by a member to the transaction administrator.\r\nIt is used to request modifications to the static data related to the profile of a member that the transaction administrator maintains.\r\nUsage\r\nThe transaction administrator is in charge of providing the members with business information. The term business information covers all information related to the management of the system, that is, not related to the transactions entered into the system. The type of business information available can vary depending on the system. Among other things, it can, refer to information about the membership of the system.\r\nAt any time during the operating hours of the system, the member can request the transaction administrator to modify the information it maintains about the member.\r\nThe member will submit a message requesting modifications in one or more of the following criteria:\r\n- identification of the member\r\n- contact information for the member organization: postal address, e-mail address, telephone or fax number\r\n- identification of contact persons for the member, their role and/or details (postal address, e-mail address, telephone or fax number)\r\nBased on the criteria received within the Modify Member message, the transaction administrator will execute or reject the requested modifications.\r\nIn principle, the transaction administrator may send a Receipt message as a reply to the ModifyMember request. To verify the outcome of the request, the member may submit a GetMember message with the appropriate search criteria."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintMandatoryValueRule#for_camt_ModifyMemberV03
 * ConstraintMandatoryValueRule.for_camt_ModifyMemberV03}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ModifyMemberV03", propOrder = {"messageHeader", "memberIdentification", "newMemberValueSet", "supplementaryData"})
public class ModifyMemberV03 {

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
	public static final MMMessageBuildingBlock<ModifyMemberV03, MessageHeader1> mmMessageHeader = new MMMessageBuildingBlock<ModifyMemberV03, MessageHeader1>() {
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
		public MessageHeader1 getValue(ModifyMemberV03 obj) {
			return obj.getMessageHeader();
		}

		@Override
		public void setValue(ModifyMemberV03 obj, MessageHeader1 value) {
			obj.setMessageHeader(value);
		}
	};
	@XmlElement(name = "MmbId", required = true)
	protected MemberIdentification2Choice memberIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.MemberIdentification2Choice
	 * MemberIdentification2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MmbId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MemberIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier of a system member, as assigned by the system, or the system administrator."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ModifyMemberV03, MemberIdentification2Choice> mmMemberIdentification = new MMMessageBuildingBlock<ModifyMemberV03, MemberIdentification2Choice>() {
		{
			xmlTag = "MmbId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MemberIdentification";
			definition = "Unique and unambiguous identifier of a system member, as assigned by the system, or the system administrator.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MemberIdentification2Choice.mmObject();
		}

		@Override
		public MemberIdentification2Choice getValue(ModifyMemberV03 obj) {
			return obj.getMemberIdentification();
		}

		@Override
		public void setValue(ModifyMemberV03 obj, MemberIdentification2Choice value) {
			obj.setMemberIdentification(value);
		}
	};
	@XmlElement(name = "NewMmbValSet", required = true)
	protected Member3 newMemberValueSet;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Member3 Member3}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NewMmbValSet"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewMemberValueSet"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "New member values."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ModifyMemberV03, Member3> mmNewMemberValueSet = new MMMessageBuildingBlock<ModifyMemberV03, Member3>() {
		{
			xmlTag = "NewMmbValSet";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewMemberValueSet";
			definition = "New member values.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Member3.mmObject();
		}

		@Override
		public Member3 getValue(ModifyMemberV03 obj) {
			return obj.getNewMemberValueSet();
		}

		@Override
		public void setValue(ModifyMemberV03 obj, Member3 value) {
			obj.setNewMemberValueSet(value);
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
	public static final MMMessageBuildingBlock<ModifyMemberV03, List<SupplementaryData1>> mmSupplementaryData = new MMMessageBuildingBlock<ModifyMemberV03, List<SupplementaryData1>>() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(ModifyMemberV03 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(ModifyMemberV03 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintMandatoryValueRule.for_camt_ModifyMemberV03);
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "ModifyMemberV03";
				definition = "Scope\r\nThe ModifyMember message is sent by a member to the transaction administrator.\r\nIt is used to request modifications to the static data related to the profile of a member that the transaction administrator maintains.\r\nUsage\r\nThe transaction administrator is in charge of providing the members with business information. The term business information covers all information related to the management of the system, that is, not related to the transactions entered into the system. The type of business information available can vary depending on the system. Among other things, it can, refer to information about the membership of the system.\r\nAt any time during the operating hours of the system, the member can request the transaction administrator to modify the information it maintains about the member.\r\nThe member will submit a message requesting modifications in one or more of the following criteria:\r\n- identification of the member\r\n- contact information for the member organization: postal address, e-mail address, telephone or fax number\r\n- identification of contact persons for the member, their role and/or details (postal address, e-mail address, telephone or fax number)\r\nBased on the criteria received within the Modify Member message, the transaction administrator will execute or reject the requested modifications.\r\nIn principle, the transaction administrator may send a Receipt message as a reply to the ModifyMember request. To verify the outcome of the request, the member may submit a GetMember message with the appropriate search criteria.";
				messageSet_lazy = () -> Arrays.asList(_SR2018_MX_CashManagement_Maintenance.mmObject());
				rootElement = "Document";
				xmlTag = "ModfyMmb";
				businessArea_lazy = () -> CashManagementLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.camt.ModifyMemberV03.mmMessageHeader, com.tools20022.repository.area.camt.ModifyMemberV03.mmMemberIdentification,
						com.tools20022.repository.area.camt.ModifyMemberV03.mmNewMemberValueSet, com.tools20022.repository.area.camt.ModifyMemberV03.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "camt";
						messageFunctionality = "015";
						version = "03";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return ModifyMemberV03.class;
			}
		});
		return mmObject_lazy.get();
	}

	public MessageHeader1 getMessageHeader() {
		return messageHeader;
	}

	public ModifyMemberV03 setMessageHeader(MessageHeader1 messageHeader) {
		this.messageHeader = Objects.requireNonNull(messageHeader);
		return this;
	}

	public MemberIdentification2Choice getMemberIdentification() {
		return memberIdentification;
	}

	public ModifyMemberV03 setMemberIdentification(MemberIdentification2Choice memberIdentification) {
		this.memberIdentification = Objects.requireNonNull(memberIdentification);
		return this;
	}

	public Member3 getNewMemberValueSet() {
		return newMemberValueSet;
	}

	public ModifyMemberV03 setNewMemberValueSet(Member3 newMemberValueSet) {
		this.newMemberValueSet = Objects.requireNonNull(newMemberValueSet);
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public ModifyMemberV03 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.015.001.03")
	static public class Document {
		@XmlElement(name = "ModfyMmb", required = true)
		public ModifyMemberV03 messageBody;
	}
}