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
import com.tools20022.repository.msg.LiquidityCreditTransfer1;
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
 * The LiquidityCreditTransfer message is sent by a member to the transaction
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
 * The LiquidityCreditTransfer message can be used when the transactions to/from
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
 * positive. Based on the criteria received within the LiquidityCreditTransfer
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
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code camt.050.001.04}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.CashManagementLatestVersion
 * CashManagementLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.LiquidityCreditTransferV04#mmMessageHeader
 * LiquidityCreditTransferV04.mmMessageHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.LiquidityCreditTransferV04#mmLiquidityCreditTransfer
 * LiquidityCreditTransferV04.mmLiquidityCreditTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.LiquidityCreditTransferV04#mmSupplementaryData
 * LiquidityCreditTransferV04.mmSupplementaryData}</li>
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
 * xmlTag} = "LqdtyCdtTrf"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "LiquidityCreditTransferV04"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe LiquidityCreditTransfer message is sent by a member to the transaction administrator.\r\nIt is used to request a transfer of funds between two accounts belonging to the same member or the same group of accounts, and being held at the transaction administrator.\r\nUsage\r\nAt any time during the operating hours of the system, and to perform the appropriate liquidity management, the member can request the transaction administrator to execute the transfer of funds between two accounts that the transaction administrator maintains for the member. For instance, this may be an action resulting from a Get/Return Account pair of messages.\r\nThe LiquidityCreditTransfer message can be used when the transactions to/from the member are unbalanced in value for the business day, or to unlock pending transactions at the end of day.\r\nThe member can request the transfer by identifying the accounts stored at the transaction administrator:\r\n- If the accounts involved in the requested transfer are known without doubt to the transaction administrator, it is possible to indicate only the type of the account to be credited.\r\n- If, on the contrary, more clarity is desired, it is possible to identify the accounts from and to which the funds should be transferred.\r\nNote that transfers are processed only when the balance in the account to be debited is sufficient to pass the liquidity transfer instruction and remain positive. Based on the criteria received within the LiquidityCreditTransfer message, the transaction administrator will execute or reject the requested transfer.\r\nIn principle, the transaction administrator may send a Receipt message as a reply to the liquidity transfer request. To verify the outcome of the request, the member may submit a GetTransaction or GetAccount message with the appropriate search criteria."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "LiquidityCreditTransferV04", propOrder = {"messageHeader", "liquidityCreditTransfer", "supplementaryData"})
public class LiquidityCreditTransferV04 {

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
	public static final MMMessageBuildingBlock<LiquidityCreditTransferV04, MessageHeader1> mmMessageHeader = new MMMessageBuildingBlock<LiquidityCreditTransferV04, MessageHeader1>() {
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
		public MessageHeader1 getValue(LiquidityCreditTransferV04 obj) {
			return obj.getMessageHeader();
		}

		@Override
		public void setValue(LiquidityCreditTransferV04 obj, MessageHeader1 value) {
			obj.setMessageHeader(value);
		}
	};
	@XmlElement(name = "LqdtyCdtTrf", required = true)
	protected LiquidityCreditTransfer1 liquidityCreditTransfer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.LiquidityCreditTransfer1
	 * LiquidityCreditTransfer1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LqdtyCdtTrf"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LiquidityCreditTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details of the liquidity credit transfer."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<LiquidityCreditTransferV04, LiquidityCreditTransfer1> mmLiquidityCreditTransfer = new MMMessageBuildingBlock<LiquidityCreditTransferV04, LiquidityCreditTransfer1>() {
		{
			xmlTag = "LqdtyCdtTrf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LiquidityCreditTransfer";
			definition = "Details of the liquidity credit transfer.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> LiquidityCreditTransfer1.mmObject();
		}

		@Override
		public LiquidityCreditTransfer1 getValue(LiquidityCreditTransferV04 obj) {
			return obj.getLiquidityCreditTransfer();
		}

		@Override
		public void setValue(LiquidityCreditTransferV04 obj, LiquidityCreditTransfer1 value) {
			obj.setLiquidityCreditTransfer(value);
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
	public static final MMMessageBuildingBlock<LiquidityCreditTransferV04, List<SupplementaryData1>> mmSupplementaryData = new MMMessageBuildingBlock<LiquidityCreditTransferV04, List<SupplementaryData1>>() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(LiquidityCreditTransferV04 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(LiquidityCreditTransferV04 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "LiquidityCreditTransferV04";
				definition = "Scope\r\nThe LiquidityCreditTransfer message is sent by a member to the transaction administrator.\r\nIt is used to request a transfer of funds between two accounts belonging to the same member or the same group of accounts, and being held at the transaction administrator.\r\nUsage\r\nAt any time during the operating hours of the system, and to perform the appropriate liquidity management, the member can request the transaction administrator to execute the transfer of funds between two accounts that the transaction administrator maintains for the member. For instance, this may be an action resulting from a Get/Return Account pair of messages.\r\nThe LiquidityCreditTransfer message can be used when the transactions to/from the member are unbalanced in value for the business day, or to unlock pending transactions at the end of day.\r\nThe member can request the transfer by identifying the accounts stored at the transaction administrator:\r\n- If the accounts involved in the requested transfer are known without doubt to the transaction administrator, it is possible to indicate only the type of the account to be credited.\r\n- If, on the contrary, more clarity is desired, it is possible to identify the accounts from and to which the funds should be transferred.\r\nNote that transfers are processed only when the balance in the account to be debited is sufficient to pass the liquidity transfer instruction and remain positive. Based on the criteria received within the LiquidityCreditTransfer message, the transaction administrator will execute or reject the requested transfer.\r\nIn principle, the transaction administrator may send a Receipt message as a reply to the liquidity transfer request. To verify the outcome of the request, the member may submit a GetTransaction or GetAccount message with the appropriate search criteria.";
				messageSet_lazy = () -> Arrays.asList(_SR2018_MX_CashManagement_Maintenance.mmObject());
				rootElement = "Document";
				xmlTag = "LqdtyCdtTrf";
				businessArea_lazy = () -> CashManagementLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.camt.LiquidityCreditTransferV04.mmMessageHeader, com.tools20022.repository.area.camt.LiquidityCreditTransferV04.mmLiquidityCreditTransfer,
						com.tools20022.repository.area.camt.LiquidityCreditTransferV04.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "camt";
						messageFunctionality = "050";
						version = "04";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return LiquidityCreditTransferV04.class;
			}
		});
		return mmObject_lazy.get();
	}

	public MessageHeader1 getMessageHeader() {
		return messageHeader;
	}

	public LiquidityCreditTransferV04 setMessageHeader(MessageHeader1 messageHeader) {
		this.messageHeader = Objects.requireNonNull(messageHeader);
		return this;
	}

	public LiquidityCreditTransfer1 getLiquidityCreditTransfer() {
		return liquidityCreditTransfer;
	}

	public LiquidityCreditTransferV04 setLiquidityCreditTransfer(LiquidityCreditTransfer1 liquidityCreditTransfer) {
		this.liquidityCreditTransfer = Objects.requireNonNull(liquidityCreditTransfer);
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public LiquidityCreditTransferV04 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.050.001.04")
	static public class Document {
		@XmlElement(name = "LqdtyCdtTrf", required = true)
		public LiquidityCreditTransferV04 messageBody;
	}
}