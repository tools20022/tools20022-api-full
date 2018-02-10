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
import com.tools20022.repository.choice.PaymentIdentification5Choice;
import com.tools20022.repository.msg.CashAccount24;
import com.tools20022.repository.msg.MessageHeader9;
import com.tools20022.repository.msg.PaymentCancellationReason4;
import com.tools20022.repository.msg.SupplementaryData1;
import com.tools20022.repository.msgset._SR2018_MX_CashManagement_Maintenance;
import java.lang.reflect.Method;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The CancelTransaction message is sent by a member to the transaction
 * administrator.<br>
 * It is used to request the cancellation of one payment instruction held at the
 * transaction administrator and sent by the member.<br>
 * <b>Usage</b><br>
 * Following normal business flows, transactions registered by the transaction
 * administrator may be queued for later settlement (because of insufficient
 * funds available, because of risk or liquidity limits, etc.). A transaction
 * may have a series of statuses. These can be transient (such as pending or
 * related types), final (such as rejected, revoked and/or settled) or the
 * status may even be defined as a proprietary status.<br>
 * Members of a system need to have information about the payments queue(s), and
 * must have the ability to take action (that is, to cancel or modify the
 * transaction(s) to be settled). Note, however, that actions by a member will
 * always concern transactions in a transient status.<br>
 * For this reason, at any time during the operating hours of the system, the
 * member can request the cancellation of a transaction that has not received a
 * final status.<br>
 * The member will submit a CancelTransaction message containing the
 * identification of the transaction to be cancelled.<br>
 * Based on the criteria received within the CancelTransaction message, the
 * transaction administrator will execute or reject the requested cancellation.<br>
 * The transaction administrator may send a Receipt message as a reply to the
 * CancelTransaction request.<br>
 * To verify the outcome of the request, the member may submit a GetTransaction
 * message with the appropriate search criteria.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.CancelTransactionV07#mmMessageHeader
 * CancelTransactionV07.mmMessageHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.CancelTransactionV07#mmPaymentIdentification
 * CancelTransactionV07.mmPaymentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.CancelTransactionV07#mmCashAccount
 * CancelTransactionV07.mmCashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.CancelTransactionV07#mmCancellationReason
 * CancelTransactionV07.mmCancellationReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.CancelTransactionV07#mmSupplementaryData
 * CancelTransactionV07.mmSupplementaryData}</li>
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
 * xmlTag} = "CclTx"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.CashManagementLatestVersion
 * CashManagementLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code camt.008.001.07}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CancelTransactionV07"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe CancelTransaction message is sent by a member to the transaction administrator.\r\nIt is used to request the cancellation of one payment instruction held at the transaction administrator and sent by the member.\r\nUsage\r\nFollowing normal business flows, transactions registered by the transaction administrator may be queued for later settlement (because of insufficient funds available, because of risk or liquidity limits, etc.). A transaction may have a series of statuses. These can be transient (such as pending or related types), final (such as rejected, revoked and/or settled) or the status may even be defined as a proprietary status.\r\nMembers of a system need to have information about the payments queue(s), and must have the ability to take action (that is, to cancel or modify the transaction(s) to be settled). Note, however, that actions by a member will always concern transactions in a transient status.\r\nFor this reason, at any time during the operating hours of the system, the member can request the cancellation of a transaction that has not received a final status.\r\nThe member will submit a CancelTransaction message containing the identification of the transaction to be cancelled.\r\nBased on the criteria received within the CancelTransaction message, the transaction administrator will execute or reject the requested cancellation.\r\nThe transaction administrator may send a Receipt message as a reply to the CancelTransaction request.\r\nTo verify the outcome of the request, the member may submit a GetTransaction message with the appropriate search criteria."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CancelTransactionV07", propOrder = {"messageHeader", "paymentIdentification", "cashAccount", "cancellationReason", "supplementaryData"})
public class CancelTransactionV07 {

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
				return CancelTransactionV07.class.getMethod("getMessageHeader", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "PmtId", required = true)
	protected PaymentIdentification5Choice paymentIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PaymentIdentification5Choice
	 * PaymentIdentification5Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference to the instruction related to the payment for which information is requested."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmPaymentIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "PmtId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentIdentification";
			definition = "Reference to the instruction related to the payment for which information is requested.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> PaymentIdentification5Choice.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CancelTransactionV07.class.getMethod("getPaymentIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "CshAcct")
	protected CashAccount24 cashAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.CashAccount24
	 * CashAccount24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account to or from which a cash entry is made."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmCashAccount = new MMMessageBuildingBlock() {
		{
			xmlTag = "CshAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashAccount";
			definition = "Account to or from which a cash entry is made.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CashAccount24.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CancelTransactionV07.class.getMethod("getCashAccount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "CxlRsn")
	protected PaymentCancellationReason4 cancellationReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PaymentCancellationReason4
	 * PaymentCancellationReason4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CxlRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides detailed information on the cancellation reason."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmCancellationReason = new MMMessageBuildingBlock() {
		{
			xmlTag = "CxlRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationReason";
			definition = "Provides detailed information on the cancellation reason.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PaymentCancellationReason4.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CancelTransactionV07.class.getMethod("getCancellationReason", new Class[]{});
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
				return CancelTransactionV07.class.getMethod("getSupplementaryData", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CancelTransactionV07";
				definition = "Scope\r\nThe CancelTransaction message is sent by a member to the transaction administrator.\r\nIt is used to request the cancellation of one payment instruction held at the transaction administrator and sent by the member.\r\nUsage\r\nFollowing normal business flows, transactions registered by the transaction administrator may be queued for later settlement (because of insufficient funds available, because of risk or liquidity limits, etc.). A transaction may have a series of statuses. These can be transient (such as pending or related types), final (such as rejected, revoked and/or settled) or the status may even be defined as a proprietary status.\r\nMembers of a system need to have information about the payments queue(s), and must have the ability to take action (that is, to cancel or modify the transaction(s) to be settled). Note, however, that actions by a member will always concern transactions in a transient status.\r\nFor this reason, at any time during the operating hours of the system, the member can request the cancellation of a transaction that has not received a final status.\r\nThe member will submit a CancelTransaction message containing the identification of the transaction to be cancelled.\r\nBased on the criteria received within the CancelTransaction message, the transaction administrator will execute or reject the requested cancellation.\r\nThe transaction administrator may send a Receipt message as a reply to the CancelTransaction request.\r\nTo verify the outcome of the request, the member may submit a GetTransaction message with the appropriate search criteria.";
				messageSet_lazy = () -> Arrays.asList(_SR2018_MX_CashManagement_Maintenance.mmObject());
				rootElement = "Document";
				xmlTag = "CclTx";
				businessArea_lazy = () -> CashManagementLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.camt.CancelTransactionV07.mmMessageHeader, com.tools20022.repository.area.camt.CancelTransactionV07.mmPaymentIdentification,
						com.tools20022.repository.area.camt.CancelTransactionV07.mmCashAccount, com.tools20022.repository.area.camt.CancelTransactionV07.mmCancellationReason,
						com.tools20022.repository.area.camt.CancelTransactionV07.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "camt";
						messageFunctionality = "008";
						version = "07";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return CancelTransactionV07.class;
			}
		});
		return mmObject_lazy.get();
	}

	public MessageHeader9 getMessageHeader() {
		return messageHeader;
	}

	public CancelTransactionV07 setMessageHeader(MessageHeader9 messageHeader) {
		this.messageHeader = Objects.requireNonNull(messageHeader);
		return this;
	}

	public PaymentIdentification5Choice getPaymentIdentification() {
		return paymentIdentification;
	}

	public CancelTransactionV07 setPaymentIdentification(PaymentIdentification5Choice paymentIdentification) {
		this.paymentIdentification = Objects.requireNonNull(paymentIdentification);
		return this;
	}

	public Optional<CashAccount24> getCashAccount() {
		return cashAccount == null ? Optional.empty() : Optional.of(cashAccount);
	}

	public CancelTransactionV07 setCashAccount(CashAccount24 cashAccount) {
		this.cashAccount = cashAccount;
		return this;
	}

	public Optional<PaymentCancellationReason4> getCancellationReason() {
		return cancellationReason == null ? Optional.empty() : Optional.of(cancellationReason);
	}

	public CancelTransactionV07 setCancellationReason(PaymentCancellationReason4 cancellationReason) {
		this.cancellationReason = cancellationReason;
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public CancelTransactionV07 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.008.001.07")
	static public class Document {
		@XmlElement(name = "CclTx", required = true)
		public CancelTransactionV07 messageBody;
	}
}