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
import com.tools20022.repository.msg.LiquidityDebitTransfer1;
import com.tools20022.repository.msg.MessageHeader1;
import com.tools20022.repository.msg.SupplementaryData1;
import com.tools20022.repository.msgset._SR2018_MX_CashManagement_Maintenance;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The LiquidityDebitTransfer message is sent by a member to the transaction
 * administrator.<br>
 * It is used to request a transfer of funds between two accounts belonging to
 * the same member or the same group of accounts, and being held at the
 * transaction administrator.<br>
 * <b>Usage</b><br>
 * At any time during the operating hours of the system, and to perform the
 * appropriate liquidity management, the member can request the transaction
 * administrator to execute the transfer of funds between two accounts that the
 * transaction administrator maintains for the member. For instance, this may be
 * an action resulting from a Get/Return Account pair of messages.<br>
 * The LiquidityDebitTransfer message can be used when the transactions to/from
 * the member are unbalanced in value for the business day, or to unlock pending
 * transactions at the end of day.<br>
 * The member can request the transfer by identifying the accounts stored at the
 * transaction administrator:<br>
 * - If the accounts involved in the requested transfer are known without doubt
 * to the transaction administrator, it is possible to indicate only the type of
 * the account to be credited.<br>
 * - If, on the contrary, more clarity is desired, it is possible to identify
 * the accounts from and to which the funds should be transferred.<br>
 * Note that transfers are processed only when the balance in the account to be
 * debited is sufficient to pass the liquidity transfer instruction and remain
 * positive. Based on the criteria received within the LiquidityDebitTransfer
 * message, the transaction administrator will execute or reject the requested
 * transfer.<br>
 * In principle, the transaction administrator may send a Receipt message as a
 * reply to the liquidity transfer request. To verify the outcome of the
 * request, the member may submit a GetTransaction or GetAccount message with
 * the appropriate search criteria.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.LiquidityDebitTransferV04#mmMessageHeader
 * LiquidityDebitTransferV04.mmMessageHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.LiquidityDebitTransferV04#mmLiquidityDebitTransfer
 * LiquidityDebitTransferV04.mmLiquidityDebitTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.LiquidityDebitTransferV04#mmSupplementaryData
 * LiquidityDebitTransferV04.mmSupplementaryData}</li>
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
 * xmlTag} = "LqdtyDbtTrf"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.CashManagementLatestVersion
 * CashManagementLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code camt.051.001.04}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "LiquidityDebitTransferV04"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe LiquidityDebitTransfer message is sent by a member to the transaction administrator.\r\nIt is used to request a transfer of funds between two accounts belonging to the same member or the same group of accounts, and being held at the transaction administrator.\r\nUsage\r\nAt any time during the operating hours of the system, and to perform the appropriate liquidity management, the member can request the transaction administrator to execute the transfer of funds between two accounts that the transaction administrator maintains for the member. For instance, this may be an action resulting from a Get/Return Account pair of messages.\r\nThe LiquidityDebitTransfer message can be used when the transactions to/from the member are unbalanced in value for the business day, or to unlock pending transactions at the end of day.\r\nThe member can request the transfer by identifying the accounts stored at the transaction administrator:\r\n- If the accounts involved in the requested transfer are known without doubt to the transaction administrator, it is possible to indicate only the type of the account to be credited.\r\n- If, on the contrary, more clarity is desired, it is possible to identify the accounts from and to which the funds should be transferred.\r\nNote that transfers are processed only when the balance in the account to be debited is sufficient to pass the liquidity transfer instruction and remain positive. Based on the criteria received within the LiquidityDebitTransfer message, the transaction administrator will execute or reject the requested transfer.\r\nIn principle, the transaction administrator may send a Receipt message as a reply to the liquidity transfer request. To verify the outcome of the request, the member may submit a GetTransaction or GetAccount message with the appropriate search criteria."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "LiquidityDebitTransferV04", propOrder = {"messageHeader", "liquidityDebitTransfer", "supplementaryData"})
public class LiquidityDebitTransferV04 {

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
			complexType_lazy = () -> MessageHeader1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return LiquidityDebitTransferV04.class.getMethod("getMessageHeader", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "LqdtyDbtTrf", required = true)
	protected LiquidityDebitTransfer1 liquidityDebitTransfer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.LiquidityDebitTransfer1
	 * LiquidityDebitTransfer1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LqdtyDbtTrf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LiquidityDebitTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details of the liquidity debit transfer."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmLiquidityDebitTransfer = new MMMessageBuildingBlock() {
		{
			xmlTag = "LqdtyDbtTrf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LiquidityDebitTransfer";
			definition = "Details of the liquidity debit transfer.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> LiquidityDebitTransfer1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return LiquidityDebitTransferV04.class.getMethod("getLiquidityDebitTransfer", new Class[]{});
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
				return LiquidityDebitTransferV04.class.getMethod("getSupplementaryData", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "LiquidityDebitTransferV04";
				definition = "Scope\r\nThe LiquidityDebitTransfer message is sent by a member to the transaction administrator.\r\nIt is used to request a transfer of funds between two accounts belonging to the same member or the same group of accounts, and being held at the transaction administrator.\r\nUsage\r\nAt any time during the operating hours of the system, and to perform the appropriate liquidity management, the member can request the transaction administrator to execute the transfer of funds between two accounts that the transaction administrator maintains for the member. For instance, this may be an action resulting from a Get/Return Account pair of messages.\r\nThe LiquidityDebitTransfer message can be used when the transactions to/from the member are unbalanced in value for the business day, or to unlock pending transactions at the end of day.\r\nThe member can request the transfer by identifying the accounts stored at the transaction administrator:\r\n- If the accounts involved in the requested transfer are known without doubt to the transaction administrator, it is possible to indicate only the type of the account to be credited.\r\n- If, on the contrary, more clarity is desired, it is possible to identify the accounts from and to which the funds should be transferred.\r\nNote that transfers are processed only when the balance in the account to be debited is sufficient to pass the liquidity transfer instruction and remain positive. Based on the criteria received within the LiquidityDebitTransfer message, the transaction administrator will execute or reject the requested transfer.\r\nIn principle, the transaction administrator may send a Receipt message as a reply to the liquidity transfer request. To verify the outcome of the request, the member may submit a GetTransaction or GetAccount message with the appropriate search criteria.";
				messageSet_lazy = () -> Arrays.asList(_SR2018_MX_CashManagement_Maintenance.mmObject());
				rootElement = "Document";
				xmlTag = "LqdtyDbtTrf";
				businessArea_lazy = () -> CashManagementLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.camt.LiquidityDebitTransferV04.mmMessageHeader, com.tools20022.repository.area.camt.LiquidityDebitTransferV04.mmLiquidityDebitTransfer,
						com.tools20022.repository.area.camt.LiquidityDebitTransferV04.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "camt";
						messageFunctionality = "051";
						version = "04";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return LiquidityDebitTransferV04.class;
			}
		});
		return mmObject_lazy.get();
	}

	public MessageHeader1 getMessageHeader() {
		return messageHeader;
	}

	public LiquidityDebitTransferV04 setMessageHeader(MessageHeader1 messageHeader) {
		this.messageHeader = Objects.requireNonNull(messageHeader);
		return this;
	}

	public LiquidityDebitTransfer1 getLiquidityDebitTransfer() {
		return liquidityDebitTransfer;
	}

	public LiquidityDebitTransferV04 setLiquidityDebitTransfer(LiquidityDebitTransfer1 liquidityDebitTransfer) {
		this.liquidityDebitTransfer = Objects.requireNonNull(liquidityDebitTransfer);
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public LiquidityDebitTransferV04 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.051.001.04")
	static public class Document {
		@XmlElement(name = "LqdtyDbtTrf", required = true)
		public LiquidityDebitTransferV04 messageBody;
	}
}