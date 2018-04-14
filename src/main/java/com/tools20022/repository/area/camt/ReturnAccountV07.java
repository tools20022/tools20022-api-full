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
import com.tools20022.repository.choice.AccountOrOperationalError3Choice;
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
 * Scope The ReturnAccount message is sent by the transaction administrator to a
 * member. It is used to provide information on the details of one or more
 * accounts held at the transaction administrator, including information on the
 * balances. The Return Account message can be sent as a response to a related
 * GetAccount message (pull mode) or initiated by the transaction administrator
 * (push mode). The push of information can take place either at prearranged
 * times or as a warning or alarm when a problem has occurred. Usage At any time
 * during the operating hours of the system, the member can query the
 * transaction administrator to get information about the account(s) that the
 * transaction administrator maintains for the member. For example, this may be
 * necessary in order to perform the appropriate liquidity management and the
 * necessary funds transfers between accounts. The member can request
 * information about accounts through a series of criteria, corresponding to the
 * known information stored at the transaction administrator. The query can
 * concern one or more specific accounts, accounts of a particular
 * identification, or a particular type. The purpose of the query may be to
 * obtain one or more types of balance. The transaction administrator may also
 * send a ReturnAccount message with pre-defined information, at times
 * previously agreed with the member, or to warn the member about a particular
 * problem that may have arisen and which needs attention. The message from the
 * transaction administrator can contain information based on the following
 * elements: - account identification - account name - account type (this is
 * used when the account identification represents, for example, a group of
 * accounts) - currency of the account (this is used for example when the
 * account identification represents a group of account in various currencies,
 * or when it is a multi-currency account with one single identifier) - type of
 * balance (if not present in the GetAccount message, all balances will be
 * reported) - bilateral or multilateral limits - related counterparty (when the
 * limit or balance is bilateral) - balance value date (if not present in the
 * GetAccount message, the ReturnAccount message will contain the latest
 * available balance) - number of payments to the additional account information
 * on the generic design of the Get/Return messages can be found in the section
 * How to Use the Cash Management Messages.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code camt.004.001.07}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.CashManagementLatestVersion
 * CashManagementLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ReturnAccountV07#mmMessageHeader
 * ReturnAccountV07.mmMessageHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ReturnAccountV07#mmReportOrError
 * ReturnAccountV07.mmReportOrError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ReturnAccountV07#mmSupplementaryData
 * ReturnAccountV07.mmSupplementaryData}</li>
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
 * xmlTag} = "RtrAcct"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ReturnAccountV07"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\nThe ReturnAccount message is sent by the transaction administrator to a member.\nIt is used to provide information on the details of one or more accounts held at the transaction administrator, including information on the balances.\nThe Return Account message can be sent as a response to a related GetAccount message (pull mode) or initiated by the transaction administrator (push mode). The push of information can take place either at prearranged times or as a warning or alarm when a problem has occurred.\nUsage\nAt any time during the operating hours of the system, the member can query the transaction administrator to get information about the account(s) that the transaction administrator maintains for the member.\nFor example, this may be necessary in order to perform the appropriate liquidity management and the necessary funds transfers between accounts.\nThe member can request information about accounts through a series of criteria, corresponding to the known information stored at the transaction administrator.\nThe query can concern one or more specific accounts, accounts of a particular identification, or a particular type. The purpose of the query may be to obtain one or more types of balance.\nThe transaction administrator may also send a ReturnAccount message with pre-defined information, at times previously agreed with the member, or to warn the member about a particular problem that may have arisen and which needs attention.\nThe message from the transaction administrator can contain information based on the following elements: \n- account identification\n- account name\n- account type (this is used when the account identification represents, for example, a group of accounts)\n- currency of the account (this is used for example when the account identification represents a group of account in various currencies, or when it is a multi-currency account with one single identifier)\n- type of balance (if not present in the GetAccount message, all balances will be reported)\n- bilateral or multilateral limits\n- related counterparty (when the limit or balance is bilateral)\n- balance value date (if not present in the GetAccount message, the ReturnAccount message will contain the latest available balance)\n- number of payments to the additional account information on the generic design of the Get/Return messages can be found in the section How to Use the Cash Management Messages."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ReturnAccountV07", propOrder = {"messageHeader", "reportOrError", "supplementaryData"})
public class ReturnAccountV07 {

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
	public static final MMMessageBuildingBlock<ReturnAccountV07, MessageHeader7> mmMessageHeader = new MMMessageBuildingBlock<ReturnAccountV07, MessageHeader7>() {
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
		public MessageHeader7 getValue(ReturnAccountV07 obj) {
			return obj.getMessageHeader();
		}

		@Override
		public void setValue(ReturnAccountV07 obj, MessageHeader7 value) {
			obj.setMessageHeader(value);
		}
	};
	@XmlElement(name = "RptOrErr", required = true)
	protected AccountOrOperationalError3Choice reportOrError;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.AccountOrOperationalError3Choice
	 * AccountOrOperationalError3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptOrErr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportOrError"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reports on accounts."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ReturnAccountV07, AccountOrOperationalError3Choice> mmReportOrError = new MMMessageBuildingBlock<ReturnAccountV07, AccountOrOperationalError3Choice>() {
		{
			xmlTag = "RptOrErr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportOrError";
			definition = "Reports on accounts.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> AccountOrOperationalError3Choice.mmObject();
		}

		@Override
		public AccountOrOperationalError3Choice getValue(ReturnAccountV07 obj) {
			return obj.getReportOrError();
		}

		@Override
		public void setValue(ReturnAccountV07 obj, AccountOrOperationalError3Choice value) {
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
	public static final MMMessageBuildingBlock<ReturnAccountV07, List<SupplementaryData1>> mmSupplementaryData = new MMMessageBuildingBlock<ReturnAccountV07, List<SupplementaryData1>>() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(ReturnAccountV07 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(ReturnAccountV07 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "ReturnAccountV07";
				definition = "Scope\nThe ReturnAccount message is sent by the transaction administrator to a member.\nIt is used to provide information on the details of one or more accounts held at the transaction administrator, including information on the balances.\nThe Return Account message can be sent as a response to a related GetAccount message (pull mode) or initiated by the transaction administrator (push mode). The push of information can take place either at prearranged times or as a warning or alarm when a problem has occurred.\nUsage\nAt any time during the operating hours of the system, the member can query the transaction administrator to get information about the account(s) that the transaction administrator maintains for the member.\nFor example, this may be necessary in order to perform the appropriate liquidity management and the necessary funds transfers between accounts.\nThe member can request information about accounts through a series of criteria, corresponding to the known information stored at the transaction administrator.\nThe query can concern one or more specific accounts, accounts of a particular identification, or a particular type. The purpose of the query may be to obtain one or more types of balance.\nThe transaction administrator may also send a ReturnAccount message with pre-defined information, at times previously agreed with the member, or to warn the member about a particular problem that may have arisen and which needs attention.\nThe message from the transaction administrator can contain information based on the following elements: \n- account identification\n- account name\n- account type (this is used when the account identification represents, for example, a group of accounts)\n- currency of the account (this is used for example when the account identification represents a group of account in various currencies, or when it is a multi-currency account with one single identifier)\n- type of balance (if not present in the GetAccount message, all balances will be reported)\n- bilateral or multilateral limits\n- related counterparty (when the limit or balance is bilateral)\n- balance value date (if not present in the GetAccount message, the ReturnAccount message will contain the latest available balance)\n- number of payments to the additional account information on the generic design of the Get/Return messages can be found in the section How to Use the Cash Management Messages.";
				messageSet_lazy = () -> Arrays.asList(_SR2018_MX_CashManagement_Maintenance.mmObject());
				rootElement = "Document";
				xmlTag = "RtrAcct";
				businessArea_lazy = () -> CashManagementLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.camt.ReturnAccountV07.mmMessageHeader, com.tools20022.repository.area.camt.ReturnAccountV07.mmReportOrError,
						com.tools20022.repository.area.camt.ReturnAccountV07.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "camt";
						messageFunctionality = "004";
						version = "07";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return ReturnAccountV07.class;
			}
		});
		return mmObject_lazy.get();
	}

	public MessageHeader7 getMessageHeader() {
		return messageHeader;
	}

	public ReturnAccountV07 setMessageHeader(MessageHeader7 messageHeader) {
		this.messageHeader = Objects.requireNonNull(messageHeader);
		return this;
	}

	public AccountOrOperationalError3Choice getReportOrError() {
		return reportOrError;
	}

	public ReturnAccountV07 setReportOrError(AccountOrOperationalError3Choice reportOrError) {
		this.reportOrError = Objects.requireNonNull(reportOrError);
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public ReturnAccountV07 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.004.001.07")
	static public class Document {
		@XmlElement(name = "RtrAcct", required = true)
		public ReturnAccountV07 messageBody;
	}
}