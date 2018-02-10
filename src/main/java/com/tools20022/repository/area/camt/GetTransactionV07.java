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
import com.tools20022.repository.msg.MessageHeader9;
import com.tools20022.repository.msg.SupplementaryData1;
import com.tools20022.repository.msg.TransactionQuery4;
import com.tools20022.repository.msgset._SR2018_MX_CashManagement_Maintenance;
import java.lang.reflect.Method;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The GetTransaction message is sent by a member to the transaction
 * administrator.<br>
 * It is used to request information about payment instructions held at the
 * transaction administrator. Payment instructions are either sent by the
 * member, debiting or crediting its account at the transaction administrator or
 * received by the transaction administrator, crediting or debiting the member's
 * account.<br>
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
 * At any time during the operating hours of the system, the member can query
 * the transaction administrator to get information about transactions, whatever
 * their status.<br>
 * These requests will concern either all transactions, all transactions with a
 * particular status or a specific transaction.<br>
 * The member can request information about transactions through a series of
 * criteria, corresponding to the known information stored at the transaction
 * administrator, based on the following elements:<br>
 * - provenance or destination of the payment (payment to/payment from)<br>
 * - transaction reference<br>
 * - transfer value date<br>
 * - payment instruction reference<br>
 * - payment instruction status, as registered at the transaction administrator<br>
 * - instructed amount and/or currency<br>
 * - interbank settlement amount and/or currency<br>
 * - credit/debit indicator of the payment instruction/transaction<br>
 * - SWIFT FIN payment message used for the payment instruction<br>
 * - priority of the payment transaction<br>
 * - period in which the payment instruction should be processed (processing
 * validity time)<br>
 * - instructions given, related to the processing of the transaction<br>
 * - type of payment instructed<br>
 * - account identification (entries booked to a specific account)<br>
 * - entry amount and/or currency<br>
 * - entry debit/credit indicator (if absent, all entries should be reported).
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.GetTransactionV07#mmMessageHeader
 * GetTransactionV07.mmMessageHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.GetTransactionV07#mmTransactionQueryDefinition
 * GetTransactionV07.mmTransactionQueryDefinition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.GetTransactionV07#mmSupplementaryData
 * GetTransactionV07.mmSupplementaryData}</li>
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
 * xmlTag} = "GetTx"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.CashManagementLatestVersion
 * CashManagementLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code camt.005.001.07}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "GetTransactionV07"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe GetTransaction message is sent by a member to the transaction administrator.\r\nIt is used to request information about payment instructions held at the transaction administrator. Payment instructions are either sent by the member, debiting or crediting its account at the transaction administrator or received by the transaction administrator, crediting or debiting the member's account.\r\nUsage\r\nFollowing normal business flows, transactions registered by the transaction administrator may be queued for later settlement (because of insufficient funds available, or because of risk or liquidity limits, etc.). A transaction may have a series of statuses. These can be transient (such as pending or related types) and final (such as rejected, revoked and/or settled).\r\nMembers of a system need to have information about the payments queue(s) and must have the ability to take action (that is, to cancel or modify the transaction(s) to be settled). Note, however, that actions by a member will always concern transactions in a transient status.\r\nAt any time during the operating hours of the system, the member can query the transaction administrator to get information about transactions, whatever their status.\r\nThese requests will concern either all transactions, all transactions with a particular status or a specific transaction.\r\nThe member can request information about transactions through a series of criteria, corresponding to the known information stored at the transaction administrator, based on the following elements:\r\n- provenance or destination of the payment (payment to/payment from)\r\n- transaction reference\r\n- transfer value date\r\n- payment instruction reference\r\n- payment instruction status, as registered at the transaction administrator\r\n- instructed amount and/or currency\r\n- interbank settlement amount and/or currency\r\n- credit/debit indicator of the payment instruction/transaction\r\n- SWIFT FIN payment message used for the payment instruction\r\n- priority of the payment transaction\r\n- period in which the payment instruction should be processed (processing validity time)\r\n- instructions given, related to the processing of the transaction\r\n- type of payment instructed\r\n- account identification (entries booked to a specific account)\r\n- entry amount and/or currency\r\n- entry debit/credit indicator (if absent, all entries should be reported)."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "GetTransactionV07", propOrder = {"messageHeader", "transactionQueryDefinition", "supplementaryData"})
public class GetTransactionV07 {

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
	public static final MMMessageBuildingBlock mmMessageHeader = new MMMessageBuildingBlock() {
		{
			xmlTag = "MsgHdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageHeader";
			definition = "Common business identification for the message.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageHeader9.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return GetTransactionV07.class.getMethod("getMessageHeader", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "TxQryDef")
	protected TransactionQuery4 transactionQueryDefinition;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.TransactionQuery4
	 * TransactionQuery4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxQryDef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionQueryDefinition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Defines the transaction query criteria."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmTransactionQueryDefinition = new MMMessageBuildingBlock() {
		{
			xmlTag = "TxQryDef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionQueryDefinition";
			definition = "Defines the transaction query criteria.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> TransactionQuery4.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return GetTransactionV07.class.getMethod("getTransactionQueryDefinition", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
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
	public static final MMMessageBuildingBlock mmSupplementaryData = new MMMessageBuildingBlock() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return GetTransactionV07.class.getMethod("getSupplementaryData", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "GetTransactionV07";
				definition = "Scope\r\nThe GetTransaction message is sent by a member to the transaction administrator.\r\nIt is used to request information about payment instructions held at the transaction administrator. Payment instructions are either sent by the member, debiting or crediting its account at the transaction administrator or received by the transaction administrator, crediting or debiting the member's account.\r\nUsage\r\nFollowing normal business flows, transactions registered by the transaction administrator may be queued for later settlement (because of insufficient funds available, or because of risk or liquidity limits, etc.). A transaction may have a series of statuses. These can be transient (such as pending or related types) and final (such as rejected, revoked and/or settled).\r\nMembers of a system need to have information about the payments queue(s) and must have the ability to take action (that is, to cancel or modify the transaction(s) to be settled). Note, however, that actions by a member will always concern transactions in a transient status.\r\nAt any time during the operating hours of the system, the member can query the transaction administrator to get information about transactions, whatever their status.\r\nThese requests will concern either all transactions, all transactions with a particular status or a specific transaction.\r\nThe member can request information about transactions through a series of criteria, corresponding to the known information stored at the transaction administrator, based on the following elements:\r\n- provenance or destination of the payment (payment to/payment from)\r\n- transaction reference\r\n- transfer value date\r\n- payment instruction reference\r\n- payment instruction status, as registered at the transaction administrator\r\n- instructed amount and/or currency\r\n- interbank settlement amount and/or currency\r\n- credit/debit indicator of the payment instruction/transaction\r\n- SWIFT FIN payment message used for the payment instruction\r\n- priority of the payment transaction\r\n- period in which the payment instruction should be processed (processing validity time)\r\n- instructions given, related to the processing of the transaction\r\n- type of payment instructed\r\n- account identification (entries booked to a specific account)\r\n- entry amount and/or currency\r\n- entry debit/credit indicator (if absent, all entries should be reported).";
				messageSet_lazy = () -> Arrays.asList(_SR2018_MX_CashManagement_Maintenance.mmObject());
				rootElement = "Document";
				xmlTag = "GetTx";
				businessArea_lazy = () -> CashManagementLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.camt.GetTransactionV07.mmMessageHeader, com.tools20022.repository.area.camt.GetTransactionV07.mmTransactionQueryDefinition,
						com.tools20022.repository.area.camt.GetTransactionV07.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "camt";
						messageFunctionality = "005";
						version = "07";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return GetTransactionV07.class;
			}
		});
		return mmObject_lazy.get();
	}

	public MessageHeader9 getMessageHeader() {
		return messageHeader;
	}

	public GetTransactionV07 setMessageHeader(MessageHeader9 messageHeader) {
		this.messageHeader = Objects.requireNonNull(messageHeader);
		return this;
	}

	public Optional<TransactionQuery4> getTransactionQueryDefinition() {
		return transactionQueryDefinition == null ? Optional.empty() : Optional.of(transactionQueryDefinition);
	}

	public GetTransactionV07 setTransactionQueryDefinition(TransactionQuery4 transactionQueryDefinition) {
		this.transactionQueryDefinition = transactionQueryDefinition;
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public GetTransactionV07 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.005.001.07")
	static public class Document {
		@XmlElement(name = "GetTx", required = true)
		public GetTransactionV07 messageBody;
	}
}