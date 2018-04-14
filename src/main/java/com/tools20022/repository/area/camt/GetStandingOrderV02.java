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
import com.tools20022.repository.msg.MessageHeader4;
import com.tools20022.repository.msg.StandingOrderQuery2;
import com.tools20022.repository.msg.SupplementaryData1;
import com.tools20022.repository.msgset._SR2018_MX_CashManagement_Maintenance;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * Scope The GetStandingOrder message is sent by a member to the transaction
 * administrator. It is used to request information on the details of one or
 * more standing orders, based on specific request criteria, especially to query
 * the amount of the overall liquidity available. It will allow to query both
 * reserved liquidity and liquidity available for normal operations. Usage The
 * member can request information based on the following elements: - individual
 * standing orders (predefined or standing liquidity transfer orders) - amount -
 * account to be credited - account to be debited - account owner (for on behalf
 * scenario) - frequency of payment - daytime or overnight processing - dates
 * when the standing order begins and ceases to be effective This message will
 * be answered by a ReturnStandingOrder message.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code camt.069.001.02}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.CashManagementLatestVersion
 * CashManagementLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.GetStandingOrderV02#mmMessageHeader
 * GetStandingOrderV02.mmMessageHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.GetStandingOrderV02#mmStandingOrderQueryDefinition
 * GetStandingOrderV02.mmStandingOrderQueryDefinition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.GetStandingOrderV02#mmSupplementaryData
 * GetStandingOrderV02.mmSupplementaryData}</li>
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
 * xmlTag} = "GetStgOrdr"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "GetStandingOrderV02"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\nThe GetStandingOrder message is sent by a member to the transaction administrator.\nIt is used to request information on the details of one or more standing orders, based on specific request criteria, especially to query the amount of the overall liquidity available. It will allow to query both reserved liquidity and liquidity available for normal operations.\nUsage\nThe member can request information based on the following elements: \n- individual standing orders (predefined or standing liquidity transfer orders)\n- amount\n- account to be credited\n- account to be debited\n- account owner (for on behalf scenario)\n- frequency of payment\n- daytime or overnight processing\n- dates when the standing order begins and ceases to be effective\nThis message will be answered by a ReturnStandingOrder message."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "GetStandingOrderV02", propOrder = {"messageHeader", "standingOrderQueryDefinition", "supplementaryData"})
public class GetStandingOrderV02 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "MsgHdr", required = true)
	protected MessageHeader4 messageHeader;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.MessageHeader4
	 * MessageHeader4}</li>
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
	public static final MMMessageBuildingBlock<GetStandingOrderV02, MessageHeader4> mmMessageHeader = new MMMessageBuildingBlock<GetStandingOrderV02, MessageHeader4>() {
		{
			xmlTag = "MsgHdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageHeader";
			definition = "Common business identification for the message.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageHeader4.mmObject();
		}

		@Override
		public MessageHeader4 getValue(GetStandingOrderV02 obj) {
			return obj.getMessageHeader();
		}

		@Override
		public void setValue(GetStandingOrderV02 obj, MessageHeader4 value) {
			obj.setMessageHeader(value);
		}
	};
	@XmlElement(name = "StgOrdrQryDef")
	protected StandingOrderQuery2 standingOrderQueryDefinition;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.StandingOrderQuery2
	 * StandingOrderQuery2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StgOrdrQryDef"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StandingOrderQueryDefinition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Defines the account query criteria."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<GetStandingOrderV02, Optional<StandingOrderQuery2>> mmStandingOrderQueryDefinition = new MMMessageBuildingBlock<GetStandingOrderV02, Optional<StandingOrderQuery2>>() {
		{
			xmlTag = "StgOrdrQryDef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StandingOrderQueryDefinition";
			definition = "Defines the account query criteria.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> StandingOrderQuery2.mmObject();
		}

		@Override
		public Optional<StandingOrderQuery2> getValue(GetStandingOrderV02 obj) {
			return obj.getStandingOrderQueryDefinition();
		}

		@Override
		public void setValue(GetStandingOrderV02 obj, Optional<StandingOrderQuery2> value) {
			obj.setStandingOrderQueryDefinition(value.orElse(null));
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
	public static final MMMessageBuildingBlock<GetStandingOrderV02, List<SupplementaryData1>> mmSupplementaryData = new MMMessageBuildingBlock<GetStandingOrderV02, List<SupplementaryData1>>() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(GetStandingOrderV02 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(GetStandingOrderV02 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "GetStandingOrderV02";
				definition = "Scope\nThe GetStandingOrder message is sent by a member to the transaction administrator.\nIt is used to request information on the details of one or more standing orders, based on specific request criteria, especially to query the amount of the overall liquidity available. It will allow to query both reserved liquidity and liquidity available for normal operations.\nUsage\nThe member can request information based on the following elements: \n- individual standing orders (predefined or standing liquidity transfer orders)\n- amount\n- account to be credited\n- account to be debited\n- account owner (for on behalf scenario)\n- frequency of payment\n- daytime or overnight processing\n- dates when the standing order begins and ceases to be effective\nThis message will be answered by a ReturnStandingOrder message.";
				messageSet_lazy = () -> Arrays.asList(_SR2018_MX_CashManagement_Maintenance.mmObject());
				rootElement = "Document";
				xmlTag = "GetStgOrdr";
				businessArea_lazy = () -> CashManagementLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.camt.GetStandingOrderV02.mmMessageHeader, com.tools20022.repository.area.camt.GetStandingOrderV02.mmStandingOrderQueryDefinition,
						com.tools20022.repository.area.camt.GetStandingOrderV02.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "camt";
						messageFunctionality = "069";
						version = "02";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return GetStandingOrderV02.class;
			}
		});
		return mmObject_lazy.get();
	}

	public MessageHeader4 getMessageHeader() {
		return messageHeader;
	}

	public GetStandingOrderV02 setMessageHeader(MessageHeader4 messageHeader) {
		this.messageHeader = Objects.requireNonNull(messageHeader);
		return this;
	}

	public Optional<StandingOrderQuery2> getStandingOrderQueryDefinition() {
		return standingOrderQueryDefinition == null ? Optional.empty() : Optional.of(standingOrderQueryDefinition);
	}

	public GetStandingOrderV02 setStandingOrderQueryDefinition(StandingOrderQuery2 standingOrderQueryDefinition) {
		this.standingOrderQueryDefinition = standingOrderQueryDefinition;
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public GetStandingOrderV02 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.069.001.02")
	static public class Document {
		@XmlElement(name = "GetStgOrdr", required = true)
		public GetStandingOrderV02 messageBody;
	}
}