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
import com.tools20022.repository.choice.TransactionReportOrError3Choice;
import com.tools20022.repository.msg.MessageHeader8;
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
 * The ReturnTransaction message is sent by the transaction administrator to a
 * member of the system.<br>
 * It is used to provide information on transactions and booked entries held at
 * the transaction administrator.<br>
 * The Return Transaction message can be sent as a response to a related
 * GetTransaction message (pull mode) or initiated by the transaction
 * administrator (push mode). The push of information can take place either at
 * prearranged times or as a warning or alarm when a problem has occurred.<br>
 * <b>Usage</b><br>
 * Following normal business flows, transactions registered by the transaction
 * administrator may be queued for later settlement (because of insufficient
 * funds available, because of risk or liquidity limits, etc.). A transaction
 * may have a series of statuses. These can be transient (such as pending or
 * related types) and final (such as rejected or settled).<br>
 * Members of a system need to receive information about the payments queue(s)
 * and must have the ability to take action (that is, cancel or modify the
 * transaction(s) to be settled). Note, however, that actions by a member will
 * always concern transactions in a transient status.<br>
 * At any time during operating hours of the system, the member can query the
 * transaction administrator to get information about transactions, whatever
 * their status.<br>
 * These requests will concern either all transactions, all transactions within
 * a particular status or a specific transaction.<br>
 * The member can request information about transactions through a series of
 * criteria, corresponding to the known information stored within the
 * transaction administrator. Based on the criteria received within the request,
 * the transaction administrator will select items that match the request and
 * report them to the requester.<br>
 * The transaction administrator may also send a ReturnTransaction message with
 * pre-defined information at times previously agreed with the member or to warn
 * the member about a particular problem that may have arisen and which needs
 * attention.<br>
 * The message from the transaction administrator can contain information based
 * on the following elements:<br>
 * - provenance or destination of the payment (payment to/payment from)<br>
 * - transaction reference<br>
 * - transfer value date<br>
 * - payment instruction reference<br>
 * - payment instruction status, as registered at the transaction administrator<br>
 * - instructed amount and/or currency<br>
 * - interbank settlement amount and/or currency<br>
 * - credit/debit indicator of the payment instruction/transaction<br>
 * - message used for the payment instruction<br>
 * - priority of the payment transaction<br>
 * - period in which the payment instruction should be processed (processing
 * validity time)<br>
 * - instructions given, related to the processing of the transaction<br>
 * - type of payment instructed<br>
 * - account identification (entries booked to a specific account)<br>
 * - entry amount and/or currency<br>
 * - entry debit/credit indicator (if absent, all entries should be reported)<br>
 * - status of the entry (pending, booked.)<br>
 * - entry date and time<br>
 * - currency of the account<br>
 * - type of the account<br>
 * - entry reference<br>
 * - entry date<br>
 * - transfer reason<br>
 * - details related to the status of the payment instruction<br>
 * An element that is particular to the Get/Return Transaction pair is the
 * Statement Report. When a GetTransaction message is sent requesting a
 * statement report, the related ReturnTransaction message will provide a
 * pre-defined set of return criteria per transaction. The information returned
 * contains the following details for each transaction:<br>
 * - value date<br>
 * - entry date<br>
 * - debit/credit code<br>
 * - entry amount<br>
 * - method of payment (payment instrument or message type)<br>
 * - entry reference<br>
 * - transaction reference<br>
 * - supplementary details<br>
 * Additional information on the generic design of the Get/Return messages can
 * be found in the section How to Use the Cash Management Messages.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ReturnTransactionV07#mmMessageHeader
 * ReturnTransactionV07.mmMessageHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ReturnTransactionV07#mmReportOrError
 * ReturnTransactionV07.mmReportOrError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ReturnTransactionV07#mmSupplementaryData
 * ReturnTransactionV07.mmSupplementaryData}</li>
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
 * xmlTag} = "RtrTx"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.CashManagementLatestVersion
 * CashManagementLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code camt.006.001.07}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCurrencyGuideline#forReturnTransactionV07
 * ConstraintCurrencyGuideline.forReturnTransactionV07}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ReturnTransactionV07"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe ReturnTransaction message is sent by the transaction administrator to a member of the system.\r\nIt is used to provide information on transactions and booked entries held at the transaction administrator.\r\nThe Return Transaction message can be sent as a response to a related GetTransaction message (pull mode) or initiated by the transaction administrator (push mode). The push of information can take place either at prearranged times or as a warning or alarm when a problem has occurred.\r\nUsage\r\nFollowing normal business flows, transactions registered by the transaction administrator may be queued for later settlement (because of insufficient funds available, because of risk or liquidity limits, etc.). A transaction may have a series of statuses. These can be transient (such as pending or related types) and final (such as rejected or settled).\r\nMembers of a system need to receive information about the payments queue(s) and must have the ability to take action (that is, cancel or modify the transaction(s) to be settled). Note, however, that actions by a member will always concern transactions in a transient status.\r\nAt any time during operating hours of the system, the member can query the transaction administrator to get information about transactions, whatever their status.\r\nThese requests will concern either all transactions, all transactions within a particular status or a specific transaction.\r\nThe member can request information about transactions through a series of criteria, corresponding to the known information stored within the transaction administrator. Based on the criteria received within the request, the transaction administrator will select items that match the request and report them to the requester.\r\nThe transaction administrator may also send a ReturnTransaction message with pre-defined information at times previously agreed with the member or to warn the member about a particular problem that may have arisen and which needs attention.\r\nThe message from the transaction administrator can contain information based on the following elements:\r\n- provenance or destination of the payment (payment to/payment from)\r\n- transaction reference\r\n- transfer value date\r\n- payment instruction reference\r\n- payment instruction status, as registered at the transaction administrator\r\n- instructed amount and/or currency\r\n- interbank settlement amount and/or currency\r\n- credit/debit indicator of the payment instruction/transaction\r\n- message used for the payment instruction\r\n- priority of the payment transaction\r\n- period in which the payment instruction should be processed (processing validity time)\r\n- instructions given, related to the processing of the transaction\r\n- type of payment instructed\r\n- account identification (entries booked to a specific account)\r\n- entry amount and/or currency\r\n- entry debit/credit indicator (if absent, all entries should be reported)\r\n- status of the entry (pending, booked.)\r\n- entry date and time\r\n- currency of the account\r\n- type of the account\r\n- entry reference\r\n- entry date\r\n- transfer reason\r\n- details related to the status of the payment instruction\r\nAn element that is particular to the Get/Return Transaction pair is the Statement Report. When a GetTransaction message is sent requesting a statement report, the related ReturnTransaction message will provide a pre-defined set of return criteria per transaction. The information returned contains the following details for each transaction:\r\n- value date\r\n- entry date\r\n- debit/credit code\r\n- entry amount\r\n- method of payment (payment instrument or message type)\r\n- entry reference\r\n- transaction reference\r\n- supplementary details\r\nAdditional information on the generic design of the Get/Return messages can be found in the section How to Use the Cash Management Messages."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ReturnTransactionV07", propOrder = {"messageHeader", "reportOrError", "supplementaryData"})
public class ReturnTransactionV07 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "MsgHdr", required = true)
	protected MessageHeader8 messageHeader;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.MessageHeader8
	 * MessageHeader8}</li>
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
	public static final MMMessageBuildingBlock<ReturnTransactionV07, MessageHeader8> mmMessageHeader = new MMMessageBuildingBlock<ReturnTransactionV07, MessageHeader8>() {
		{
			xmlTag = "MsgHdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageHeader";
			definition = "Common business identification for the message.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageHeader8.mmObject();
		}

		@Override
		public MessageHeader8 getValue(ReturnTransactionV07 obj) {
			return obj.getMessageHeader();
		}

		@Override
		public void setValue(ReturnTransactionV07 obj, MessageHeader8 value) {
			obj.setMessageHeader(value);
		}
	};
	@XmlElement(name = "RptOrErr", required = true)
	protected TransactionReportOrError3Choice reportOrError;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.TransactionReportOrError3Choice
	 * TransactionReportOrError3Choice}</li>
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
	 * definition} = "Reports on transactions."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ReturnTransactionV07, TransactionReportOrError3Choice> mmReportOrError = new MMMessageBuildingBlock<ReturnTransactionV07, TransactionReportOrError3Choice>() {
		{
			xmlTag = "RptOrErr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportOrError";
			definition = "Reports on transactions.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> TransactionReportOrError3Choice.mmObject();
		}

		@Override
		public TransactionReportOrError3Choice getValue(ReturnTransactionV07 obj) {
			return obj.getReportOrError();
		}

		@Override
		public void setValue(ReturnTransactionV07 obj, TransactionReportOrError3Choice value) {
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
	public static final MMMessageBuildingBlock<ReturnTransactionV07, List<SupplementaryData1>> mmSupplementaryData = new MMMessageBuildingBlock<ReturnTransactionV07, List<SupplementaryData1>>() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(ReturnTransactionV07 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(ReturnTransactionV07 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCurrencyGuideline.forReturnTransactionV07);
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "ReturnTransactionV07";
				definition = "Scope\r\nThe ReturnTransaction message is sent by the transaction administrator to a member of the system.\r\nIt is used to provide information on transactions and booked entries held at the transaction administrator.\r\nThe Return Transaction message can be sent as a response to a related GetTransaction message (pull mode) or initiated by the transaction administrator (push mode). The push of information can take place either at prearranged times or as a warning or alarm when a problem has occurred.\r\nUsage\r\nFollowing normal business flows, transactions registered by the transaction administrator may be queued for later settlement (because of insufficient funds available, because of risk or liquidity limits, etc.). A transaction may have a series of statuses. These can be transient (such as pending or related types) and final (such as rejected or settled).\r\nMembers of a system need to receive information about the payments queue(s) and must have the ability to take action (that is, cancel or modify the transaction(s) to be settled). Note, however, that actions by a member will always concern transactions in a transient status.\r\nAt any time during operating hours of the system, the member can query the transaction administrator to get information about transactions, whatever their status.\r\nThese requests will concern either all transactions, all transactions within a particular status or a specific transaction.\r\nThe member can request information about transactions through a series of criteria, corresponding to the known information stored within the transaction administrator. Based on the criteria received within the request, the transaction administrator will select items that match the request and report them to the requester.\r\nThe transaction administrator may also send a ReturnTransaction message with pre-defined information at times previously agreed with the member or to warn the member about a particular problem that may have arisen and which needs attention.\r\nThe message from the transaction administrator can contain information based on the following elements:\r\n- provenance or destination of the payment (payment to/payment from)\r\n- transaction reference\r\n- transfer value date\r\n- payment instruction reference\r\n- payment instruction status, as registered at the transaction administrator\r\n- instructed amount and/or currency\r\n- interbank settlement amount and/or currency\r\n- credit/debit indicator of the payment instruction/transaction\r\n- message used for the payment instruction\r\n- priority of the payment transaction\r\n- period in which the payment instruction should be processed (processing validity time)\r\n- instructions given, related to the processing of the transaction\r\n- type of payment instructed\r\n- account identification (entries booked to a specific account)\r\n- entry amount and/or currency\r\n- entry debit/credit indicator (if absent, all entries should be reported)\r\n- status of the entry (pending, booked.)\r\n- entry date and time\r\n- currency of the account\r\n- type of the account\r\n- entry reference\r\n- entry date\r\n- transfer reason\r\n- details related to the status of the payment instruction\r\nAn element that is particular to the Get/Return Transaction pair is the Statement Report. When a GetTransaction message is sent requesting a statement report, the related ReturnTransaction message will provide a pre-defined set of return criteria per transaction. The information returned contains the following details for each transaction:\r\n- value date\r\n- entry date\r\n- debit/credit code\r\n- entry amount\r\n- method of payment (payment instrument or message type)\r\n- entry reference\r\n- transaction reference\r\n- supplementary details\r\nAdditional information on the generic design of the Get/Return messages can be found in the section How to Use the Cash Management Messages.";
				messageSet_lazy = () -> Arrays.asList(_SR2018_MX_CashManagement_Maintenance.mmObject());
				rootElement = "Document";
				xmlTag = "RtrTx";
				businessArea_lazy = () -> CashManagementLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.camt.ReturnTransactionV07.mmMessageHeader, com.tools20022.repository.area.camt.ReturnTransactionV07.mmReportOrError,
						com.tools20022.repository.area.camt.ReturnTransactionV07.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "camt";
						messageFunctionality = "006";
						version = "07";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return ReturnTransactionV07.class;
			}
		});
		return mmObject_lazy.get();
	}

	public MessageHeader8 getMessageHeader() {
		return messageHeader;
	}

	public ReturnTransactionV07 setMessageHeader(MessageHeader8 messageHeader) {
		this.messageHeader = Objects.requireNonNull(messageHeader);
		return this;
	}

	public TransactionReportOrError3Choice getReportOrError() {
		return reportOrError;
	}

	public ReturnTransactionV07 setReportOrError(TransactionReportOrError3Choice reportOrError) {
		this.reportOrError = Objects.requireNonNull(reportOrError);
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public ReturnTransactionV07 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.006.001.07")
	static public class Document {
		@XmlElement(name = "RtrTx", required = true)
		public ReturnTransactionV07 messageBody;
	}
}