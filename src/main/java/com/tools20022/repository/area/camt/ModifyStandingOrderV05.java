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
import com.tools20022.repository.msg.StandingOrder5;
import com.tools20022.repository.msg.StandingOrderIdentification2;
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
 * The ModifyStandingOrder message is sent by a member to the transaction
 * administrator.<br>
 * It is used to request a change in the features of a permanent order for the
 * transfer of funds between two accounts belonging to the same member and being
 * held at the transaction administrator.<br>
 * <b>Usage</b><br>
 * There should be one standing order per (direct) member and per business day.
 * The ModifyStandingOrder message must not be used to request a transfer of
 * funds between accounts during the working day. The liquidity transfer
 * messages must be used for this purpose. There is no need to have a standing
 * order to empty the settlement account at the end of the day and transfer the
 * funds to the current account. For liquidity savings purposes, systems will
 * effect the necessary transfers automatically when and where relevant.<br>
 * The ModifyStandingOrder message first identifies the standing order to be
 * modified and then provide the details of the new standing order. The elements
 * that can be modified are:<br>
 * - amount<br>
 * - account to be credited<br>
 * - account to be debited<br>
 * - account owner (for on behalf scenario)<br>
 * - frequency of payment<br>
 * - daytime or overnight processing<br>
 * - dates when the standing order begins and ceases to be effective<br>
 * Based on the criteria received within the ModifyStandingOrder message, the
 * transaction administrator will execute or reject the requested modifications.<br>
 * The transaction administrator may send a Receipt message as a reply to the
 * Modify Standing Order request. To verify the outcome of the request, the
 * member may submit a GetStandingOrder message with the appropriate search
 * criteria.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code camt.024.001.05}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.CashManagementLatestVersion
 * CashManagementLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ModifyStandingOrderV05#mmMessageHeader
 * ModifyStandingOrderV05.mmMessageHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ModifyStandingOrderV05#mmStandingOrderIdentification
 * ModifyStandingOrderV05.mmStandingOrderIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ModifyStandingOrderV05#mmNewStandingOrderValueSet
 * ModifyStandingOrderV05.mmNewStandingOrderValueSet}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ModifyStandingOrderV05#mmSupplementaryData
 * ModifyStandingOrderV05.mmSupplementaryData}</li>
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
 * xmlTag} = "ModfyStgOrdr"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ModifyStandingOrderV05"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe ModifyStandingOrder message is sent by a member to the transaction administrator.\r\nIt is used to request a change in the features of a permanent order for the transfer of funds between two accounts belonging to the same member and being held at the transaction administrator.\r\nUsage\r\nThere should be one standing order per (direct) member and per business day. The ModifyStandingOrder message must not be used to request a transfer of funds between accounts during the working day. The liquidity transfer messages must be used for this purpose. There is no need to have a standing order to empty the settlement account at the end of the day and transfer the funds to the current account. For liquidity savings purposes, systems will effect the necessary transfers automatically when and where relevant.\r\nThe ModifyStandingOrder message first identifies the standing order to be modified and then provide the details of the new standing order. The elements that can be modified are:\r\n- amount\r\n- account to be credited\r\n- account to be debited\r\n- account owner (for on behalf scenario)\r\n- frequency of payment\r\n- daytime or overnight processing\r\n- dates when the standing order begins and ceases to be effective\r\nBased on the criteria received within the ModifyStandingOrder message, the transaction administrator will execute or reject the requested modifications.\r\nThe transaction administrator may send a Receipt message as a reply to the Modify Standing Order request. To verify the outcome of the request, the member may submit a GetStandingOrder message with the appropriate search criteria."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintModifyStandingOrderRules#for_camt_ModifyStandingOrderV05
 * ConstraintModifyStandingOrderRules.for_camt_ModifyStandingOrderV05}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ModifyStandingOrderV05", propOrder = {"messageHeader", "standingOrderIdentification", "newStandingOrderValueSet", "supplementaryData"})
public class ModifyStandingOrderV05 {

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
	public static final MMMessageBuildingBlock<ModifyStandingOrderV05, MessageHeader1> mmMessageHeader = new MMMessageBuildingBlock<ModifyStandingOrderV05, MessageHeader1>() {
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
		public MessageHeader1 getValue(ModifyStandingOrderV05 obj) {
			return obj.getMessageHeader();
		}

		@Override
		public void setValue(ModifyStandingOrderV05 obj, MessageHeader1 value) {
			obj.setMessageHeader(value);
		}
	};
	@XmlElement(name = "StgOrdrId", required = true)
	protected StandingOrderIdentification2 standingOrderIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.StandingOrderIdentification2
	 * StandingOrderIdentification2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StgOrdrId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StandingOrderIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the standing order."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ModifyStandingOrderV05, StandingOrderIdentification2> mmStandingOrderIdentification = new MMMessageBuildingBlock<ModifyStandingOrderV05, StandingOrderIdentification2>() {
		{
			xmlTag = "StgOrdrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StandingOrderIdentification";
			definition = "Identifies the standing order.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> StandingOrderIdentification2.mmObject();
		}

		@Override
		public StandingOrderIdentification2 getValue(ModifyStandingOrderV05 obj) {
			return obj.getStandingOrderIdentification();
		}

		@Override
		public void setValue(ModifyStandingOrderV05 obj, StandingOrderIdentification2 value) {
			obj.setStandingOrderIdentification(value);
		}
	};
	@XmlElement(name = "NewStgOrdrValSet", required = true)
	protected StandingOrder5 newStandingOrderValueSet;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.StandingOrder5
	 * StandingOrder5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NewStgOrdrValSet"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewStandingOrderValueSet"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "New set of values for the standing order."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ModifyStandingOrderV05, StandingOrder5> mmNewStandingOrderValueSet = new MMMessageBuildingBlock<ModifyStandingOrderV05, StandingOrder5>() {
		{
			xmlTag = "NewStgOrdrValSet";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewStandingOrderValueSet";
			definition = "New set of values for the standing order.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> StandingOrder5.mmObject();
		}

		@Override
		public StandingOrder5 getValue(ModifyStandingOrderV05 obj) {
			return obj.getNewStandingOrderValueSet();
		}

		@Override
		public void setValue(ModifyStandingOrderV05 obj, StandingOrder5 value) {
			obj.setNewStandingOrderValueSet(value);
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
	public static final MMMessageBuildingBlock<ModifyStandingOrderV05, List<SupplementaryData1>> mmSupplementaryData = new MMMessageBuildingBlock<ModifyStandingOrderV05, List<SupplementaryData1>>() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(ModifyStandingOrderV05 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(ModifyStandingOrderV05 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintModifyStandingOrderRules.for_camt_ModifyStandingOrderV05);
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "ModifyStandingOrderV05";
				definition = "Scope\r\nThe ModifyStandingOrder message is sent by a member to the transaction administrator.\r\nIt is used to request a change in the features of a permanent order for the transfer of funds between two accounts belonging to the same member and being held at the transaction administrator.\r\nUsage\r\nThere should be one standing order per (direct) member and per business day. The ModifyStandingOrder message must not be used to request a transfer of funds between accounts during the working day. The liquidity transfer messages must be used for this purpose. There is no need to have a standing order to empty the settlement account at the end of the day and transfer the funds to the current account. For liquidity savings purposes, systems will effect the necessary transfers automatically when and where relevant.\r\nThe ModifyStandingOrder message first identifies the standing order to be modified and then provide the details of the new standing order. The elements that can be modified are:\r\n- amount\r\n- account to be credited\r\n- account to be debited\r\n- account owner (for on behalf scenario)\r\n- frequency of payment\r\n- daytime or overnight processing\r\n- dates when the standing order begins and ceases to be effective\r\nBased on the criteria received within the ModifyStandingOrder message, the transaction administrator will execute or reject the requested modifications.\r\nThe transaction administrator may send a Receipt message as a reply to the Modify Standing Order request. To verify the outcome of the request, the member may submit a GetStandingOrder message with the appropriate search criteria.";
				messageSet_lazy = () -> Arrays.asList(_SR2018_MX_CashManagement_Maintenance.mmObject());
				rootElement = "Document";
				xmlTag = "ModfyStgOrdr";
				businessArea_lazy = () -> CashManagementLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.camt.ModifyStandingOrderV05.mmMessageHeader, com.tools20022.repository.area.camt.ModifyStandingOrderV05.mmStandingOrderIdentification,
						com.tools20022.repository.area.camt.ModifyStandingOrderV05.mmNewStandingOrderValueSet, com.tools20022.repository.area.camt.ModifyStandingOrderV05.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "camt";
						messageFunctionality = "024";
						version = "05";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return ModifyStandingOrderV05.class;
			}
		});
		return mmObject_lazy.get();
	}

	public MessageHeader1 getMessageHeader() {
		return messageHeader;
	}

	public ModifyStandingOrderV05 setMessageHeader(MessageHeader1 messageHeader) {
		this.messageHeader = Objects.requireNonNull(messageHeader);
		return this;
	}

	public StandingOrderIdentification2 getStandingOrderIdentification() {
		return standingOrderIdentification;
	}

	public ModifyStandingOrderV05 setStandingOrderIdentification(StandingOrderIdentification2 standingOrderIdentification) {
		this.standingOrderIdentification = Objects.requireNonNull(standingOrderIdentification);
		return this;
	}

	public StandingOrder5 getNewStandingOrderValueSet() {
		return newStandingOrderValueSet;
	}

	public ModifyStandingOrderV05 setNewStandingOrderValueSet(StandingOrder5 newStandingOrderValueSet) {
		this.newStandingOrderValueSet = Objects.requireNonNull(newStandingOrderValueSet);
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public ModifyStandingOrderV05 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.024.001.05")
	static public class Document {
		@XmlElement(name = "ModfyStgOrdr", required = true)
		public ModifyStandingOrderV05 messageBody;
	}
}