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
import com.tools20022.repository.msg.MessageHeader1;
import com.tools20022.repository.msg.SupplementaryData1;
import com.tools20022.repository.msg.TransactionModification4;
import com.tools20022.repository.msgset._SR2018_MX_CashManagement_Maintenance;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The ModifyTransaction message is sent by a member to the transaction
 * administrator.<br>
 * It is used to request one modification in one payment instruction held at the
 * transaction administrator and sent by the member, debiting or crediting its
 * account at the transaction administrator.<br>
 * <b>Usage</b><br>
 * Following normal business flows, transactions registered by the transaction
 * administrator may be queued for later settlement (because of insufficient
 * funds available, or because of risk or liquidity limits, etc.). A transaction
 * may have a series of statuses. These can be transient (such as pending or
 * related types) and final (such as rejected, revoked and/or settled).<br>
 * Members of a system need to have information about the payments queue(s) and
 * must have the ability to take action (that is, to cancel or modify the
 * transaction(s) to be settled). Note, however, that actions by a member will
 * always concern transactions in a transient status.<br>
 * For this reason, at any time during the operating hours of the system, the
 * member can request modifications to the features of transient transactions.<br>
 * The member will submit a message requesting modifications in one or more of
 * the following criteria:<br>
 * - instruction given, related to the processing of the transaction<br>
 * - type of payment instructed<br>
 * - priority of payment period in which the payment instruction should be
 * processed (processing validity time)<br>
 * The ModifyTransaction message will contain the new values that the member
 * wants to see applied to the features of the transaction identified in the
 * message.<br>
 * Based on the criteria received within the ModifyTransaction message, the
 * transaction administrator will execute or reject the requested modifications.<br>
 * The transaction administrator may send a Receipt message as a reply to the
 * ModifyTransaction request.<br>
 * To verify the outcome of the request, the member may submit a GetTransaction
 * message with the appropriate search criteria.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code camt.007.001.07}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.CashManagementLatestVersion
 * CashManagementLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ModifyTransactionV07#mmMessageHeader
 * ModifyTransactionV07.mmMessageHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ModifyTransactionV07#mmModification
 * ModifyTransactionV07.mmModification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ModifyTransactionV07#mmSupplementaryData
 * ModifyTransactionV07.mmSupplementaryData}</li>
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
 * xmlTag} = "ModfyTx"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ModifyTransactionV07"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe ModifyTransaction message is sent by a member to the transaction administrator.\r\nIt is used to request one modification in one payment instruction held at the transaction administrator and sent by the member, debiting or crediting its account at the transaction administrator.\r\nUsage\r\nFollowing normal business flows, transactions registered by the transaction administrator may be queued for later settlement (because of insufficient funds available, or because of risk or liquidity limits, etc.). A transaction may have a series of statuses. These can be transient (such as pending or related types) and final (such as rejected, revoked and/or settled).\r\nMembers of a system need to have information about the payments queue(s) and must have the ability to take action (that is, to cancel or modify the transaction(s) to be settled). Note, however, that actions by a member will always concern transactions in a transient status.\r\nFor this reason, at any time during the operating hours of the system, the member can request modifications to the features of transient transactions.\r\nThe member will submit a message requesting modifications in one or more of the following criteria:\r\n- instruction given, related to the processing of the transaction\r\n- type of payment instructed\r\n- priority of payment period in which the payment instruction should be processed (processing validity time)\r\nThe ModifyTransaction message will contain the new values that the member wants to see applied to the features of the transaction identified in the message.\r\nBased on the criteria received within the ModifyTransaction message, the transaction administrator will execute or reject the requested modifications.\r\nThe transaction administrator may send a Receipt message as a reply to the ModifyTransaction request.\r\nTo verify the outcome of the request, the member may submit a GetTransaction message with the appropriate search criteria."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ModifyTransactionV07", propOrder = {"messageHeader", "modification", "supplementaryData"})
public class ModifyTransactionV07 {

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
	public static final MMMessageBuildingBlock<ModifyTransactionV07, MessageHeader1> mmMessageHeader = new MMMessageBuildingBlock<ModifyTransactionV07, MessageHeader1>() {
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
		public MessageHeader1 getValue(ModifyTransactionV07 obj) {
			return obj.getMessageHeader();
		}

		@Override
		public void setValue(ModifyTransactionV07 obj, MessageHeader1 value) {
			obj.setMessageHeader(value);
		}
	};
	@XmlElement(name = "Mod", required = true)
	protected List<TransactionModification4> modification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.TransactionModification4
	 * TransactionModification4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Mod"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Modification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the list of modifications to be executed."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ModifyTransactionV07, List<TransactionModification4>> mmModification = new MMMessageBuildingBlock<ModifyTransactionV07, List<TransactionModification4>>() {
		{
			xmlTag = "Mod";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Modification";
			definition = "Identifies the list of modifications to be executed.";
			minOccurs = 1;
			complexType_lazy = () -> TransactionModification4.mmObject();
		}

		@Override
		public List<TransactionModification4> getValue(ModifyTransactionV07 obj) {
			return obj.getModification();
		}

		@Override
		public void setValue(ModifyTransactionV07 obj, List<TransactionModification4> value) {
			obj.setModification(value);
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
	public static final MMMessageBuildingBlock<ModifyTransactionV07, List<SupplementaryData1>> mmSupplementaryData = new MMMessageBuildingBlock<ModifyTransactionV07, List<SupplementaryData1>>() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(ModifyTransactionV07 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(ModifyTransactionV07 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "ModifyTransactionV07";
				definition = "Scope\r\nThe ModifyTransaction message is sent by a member to the transaction administrator.\r\nIt is used to request one modification in one payment instruction held at the transaction administrator and sent by the member, debiting or crediting its account at the transaction administrator.\r\nUsage\r\nFollowing normal business flows, transactions registered by the transaction administrator may be queued for later settlement (because of insufficient funds available, or because of risk or liquidity limits, etc.). A transaction may have a series of statuses. These can be transient (such as pending or related types) and final (such as rejected, revoked and/or settled).\r\nMembers of a system need to have information about the payments queue(s) and must have the ability to take action (that is, to cancel or modify the transaction(s) to be settled). Note, however, that actions by a member will always concern transactions in a transient status.\r\nFor this reason, at any time during the operating hours of the system, the member can request modifications to the features of transient transactions.\r\nThe member will submit a message requesting modifications in one or more of the following criteria:\r\n- instruction given, related to the processing of the transaction\r\n- type of payment instructed\r\n- priority of payment period in which the payment instruction should be processed (processing validity time)\r\nThe ModifyTransaction message will contain the new values that the member wants to see applied to the features of the transaction identified in the message.\r\nBased on the criteria received within the ModifyTransaction message, the transaction administrator will execute or reject the requested modifications.\r\nThe transaction administrator may send a Receipt message as a reply to the ModifyTransaction request.\r\nTo verify the outcome of the request, the member may submit a GetTransaction message with the appropriate search criteria.";
				messageSet_lazy = () -> Arrays.asList(_SR2018_MX_CashManagement_Maintenance.mmObject());
				rootElement = "Document";
				xmlTag = "ModfyTx";
				businessArea_lazy = () -> CashManagementLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.camt.ModifyTransactionV07.mmMessageHeader, com.tools20022.repository.area.camt.ModifyTransactionV07.mmModification,
						com.tools20022.repository.area.camt.ModifyTransactionV07.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "camt";
						messageFunctionality = "007";
						version = "07";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return ModifyTransactionV07.class;
			}
		});
		return mmObject_lazy.get();
	}

	public MessageHeader1 getMessageHeader() {
		return messageHeader;
	}

	public ModifyTransactionV07 setMessageHeader(MessageHeader1 messageHeader) {
		this.messageHeader = Objects.requireNonNull(messageHeader);
		return this;
	}

	public List<TransactionModification4> getModification() {
		return modification == null ? modification = new ArrayList<>() : modification;
	}

	public ModifyTransactionV07 setModification(List<TransactionModification4> modification) {
		this.modification = Objects.requireNonNull(modification);
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public ModifyTransactionV07 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.007.001.07")
	static public class Document {
		@XmlElement(name = "ModfyTx", required = true)
		public ModifyTransactionV07 messageBody;
	}
}