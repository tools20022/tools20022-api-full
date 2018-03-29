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
import com.tools20022.repository.msg.AccountQuery2;
import com.tools20022.repository.msg.MessageHeader9;
import com.tools20022.repository.msg.SupplementaryData1;
import com.tools20022.repository.msgset._SR2018_MX_CashManagement_Maintenance;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The GetAccount message is sent by a member to the transaction administrator.<br>
 * It is used to request information on the details of one or more accounts held
 * at the transaction administrator, including information on the balances.<br>
 * <b>Usage</b><br>
 * At any time during the operating hours of the system, the member can query
 * the transaction administrator to get information about the account(s) that
 * the transaction administrator maintains for the member.<br>
 * For example, this may be necessary in order to perform the appropriate
 * liquidity management and the funds transfers between accounts.<br>
 * The member can request information about accounts through a series of
 * criteria, corresponding to the known information stored at the transaction
 * administrator.<br>
 * The query can concern one or more specific accounts, accounts of a particular
 * identification, or a particular type. The purpose of the query may be to
 * obtain one or more types of balance.<br>
 * The member can request information based on the following elements:<br>
 * - account identification<br>
 * - account type (this element can be used to refine the query when the account
 * identification represents, for example, a group of accounts)<br>
 * - balance type (if not present, all balances are requested)<br>
 * - type of counterparty: bilateral or multilateral (note that, by default, a
 * balance is multilateral unless a particular counterparty is specified)<br>
 * - identification of the counterparty when a bilateral balance is requested<br>
 * - balance value date (if not present in the GetAccount message, the
 * ReturnAccount message will contain the latest available balance)<br>
 * This message will be answered by a ReturnAccount message.<br>
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
 * {@linkplain com.tools20022.repository.area.camt.GetAccountV06#mmMessageHeader
 * GetAccountV06.mmMessageHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.GetAccountV06#mmAccountQueryDefinition
 * GetAccountV06.mmAccountQueryDefinition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.GetAccountV06#mmSupplementaryData
 * GetAccountV06.mmSupplementaryData}</li>
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
 * xmlTag} = "GetAcct"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.CashManagementLatestVersion
 * CashManagementLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code camt.003.001.06}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "GetAccountV06"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe GetAccount message is sent by a member to the transaction administrator.\r\nIt is used to request information on the details of one or more accounts held at the transaction administrator, including information on the balances.\r\nUsage\r\nAt any time during the operating hours of the system, the member can query the transaction administrator to get information about the account(s) that the transaction administrator maintains for the member.\r\nFor example, this may be necessary in order to perform the appropriate liquidity management and the funds transfers between accounts.\r\nThe member can request information about accounts through a series of criteria, corresponding to the known information stored at the transaction administrator.\r\nThe query can concern one or more specific accounts, accounts of a particular identification, or a particular type. The purpose of the query may be to obtain one or more types of balance.\r\nThe member can request information based on the following elements:\r\n- account identification\r\n- account type (this element can be used to refine the query when the account identification represents, for example, a group of accounts)\r\n- balance type (if not present, all balances are requested)\r\n- type of counterparty: bilateral or multilateral (note that, by default, a balance is multilateral unless a particular counterparty is specified)\r\n- identification of the counterparty when a bilateral balance is requested\r\n- balance value date (if not present in the GetAccount message, the ReturnAccount message will contain the latest available balance)\r\nThis message will be answered by a ReturnAccount message.\r\nAdditional information on the generic design of the Get/Return messages can be found in the section How to Use the Cash Management Messages."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "GetAccountV06", propOrder = {"messageHeader", "accountQueryDefinition", "supplementaryData"})
public class GetAccountV06 {

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
	public static final MMMessageBuildingBlock<GetAccountV06, MessageHeader9> mmMessageHeader = new MMMessageBuildingBlock<GetAccountV06, MessageHeader9>() {
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
		public MessageHeader9 getValue(GetAccountV06 obj) {
			return obj.getMessageHeader();
		}

		@Override
		public void setValue(GetAccountV06 obj, MessageHeader9 value) {
			obj.setMessageHeader(value);
		}
	};
	@XmlElement(name = "AcctQryDef")
	protected AccountQuery2 accountQueryDefinition;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.AccountQuery2
	 * AccountQuery2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctQryDef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountQueryDefinition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Defines the account query criteria."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<GetAccountV06, Optional<AccountQuery2>> mmAccountQueryDefinition = new MMMessageBuildingBlock<GetAccountV06, Optional<AccountQuery2>>() {
		{
			xmlTag = "AcctQryDef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountQueryDefinition";
			definition = "Defines the account query criteria.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AccountQuery2.mmObject();
		}

		@Override
		public Optional<AccountQuery2> getValue(GetAccountV06 obj) {
			return obj.getAccountQueryDefinition();
		}

		@Override
		public void setValue(GetAccountV06 obj, Optional<AccountQuery2> value) {
			obj.setAccountQueryDefinition(value.orElse(null));
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
	public static final MMMessageBuildingBlock<GetAccountV06, List<SupplementaryData1>> mmSupplementaryData = new MMMessageBuildingBlock<GetAccountV06, List<SupplementaryData1>>() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(GetAccountV06 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(GetAccountV06 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "GetAccountV06";
				definition = "Scope\r\nThe GetAccount message is sent by a member to the transaction administrator.\r\nIt is used to request information on the details of one or more accounts held at the transaction administrator, including information on the balances.\r\nUsage\r\nAt any time during the operating hours of the system, the member can query the transaction administrator to get information about the account(s) that the transaction administrator maintains for the member.\r\nFor example, this may be necessary in order to perform the appropriate liquidity management and the funds transfers between accounts.\r\nThe member can request information about accounts through a series of criteria, corresponding to the known information stored at the transaction administrator.\r\nThe query can concern one or more specific accounts, accounts of a particular identification, or a particular type. The purpose of the query may be to obtain one or more types of balance.\r\nThe member can request information based on the following elements:\r\n- account identification\r\n- account type (this element can be used to refine the query when the account identification represents, for example, a group of accounts)\r\n- balance type (if not present, all balances are requested)\r\n- type of counterparty: bilateral or multilateral (note that, by default, a balance is multilateral unless a particular counterparty is specified)\r\n- identification of the counterparty when a bilateral balance is requested\r\n- balance value date (if not present in the GetAccount message, the ReturnAccount message will contain the latest available balance)\r\nThis message will be answered by a ReturnAccount message.\r\nAdditional information on the generic design of the Get/Return messages can be found in the section How to Use the Cash Management Messages.";
				messageSet_lazy = () -> Arrays.asList(_SR2018_MX_CashManagement_Maintenance.mmObject());
				rootElement = "Document";
				xmlTag = "GetAcct";
				businessArea_lazy = () -> CashManagementLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.camt.GetAccountV06.mmMessageHeader, com.tools20022.repository.area.camt.GetAccountV06.mmAccountQueryDefinition,
						com.tools20022.repository.area.camt.GetAccountV06.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "camt";
						messageFunctionality = "003";
						version = "06";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return GetAccountV06.class;
			}
		});
		return mmObject_lazy.get();
	}

	public MessageHeader9 getMessageHeader() {
		return messageHeader;
	}

	public GetAccountV06 setMessageHeader(MessageHeader9 messageHeader) {
		this.messageHeader = Objects.requireNonNull(messageHeader);
		return this;
	}

	public Optional<AccountQuery2> getAccountQueryDefinition() {
		return accountQueryDefinition == null ? Optional.empty() : Optional.of(accountQueryDefinition);
	}

	public GetAccountV06 setAccountQueryDefinition(AccountQuery2 accountQueryDefinition) {
		this.accountQueryDefinition = accountQueryDefinition;
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public GetAccountV06 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.003.001.06")
	static public class Document {
		@XmlElement(name = "GetAcct", required = true)
		public GetAccountV06 messageBody;
	}
}