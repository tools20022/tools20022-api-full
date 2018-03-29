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
import com.tools20022.repository.msg.BusinessDayQuery2;
import com.tools20022.repository.msg.MessageHeader9;
import com.tools20022.repository.msg.SupplementaryData1;
import com.tools20022.repository.msgset._SR2018_MX_CashManagement_Maintenance;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The GetBusinessDayInformation message is sent by a member to the transaction
 * administrator.<br>
 * It is used to request information on different types of administrative data
 * linked to the system.<br>
 * <b>Usage</b><br>
 * The transaction administrator is in charge of providing the members with
 * business information. The term business day information covers all
 * information related to the management of the system, not related to the
 * transactions created in the system. The type of business day information
 * available can vary depending on the system.<br>
 * At any time during the operating hours of the system, the member can query
 * the transaction administrator to get information about the static data of the
 * system.<br>
 * The member can request information based on the following elements:<br>
 * - identification of the system<br>
 * - currency within the system concerned<br>
 * - status of the system<br>
 * - period of availability of a given currency linked to the system concerned
 * (in case the system handles more than one currency)<br>
 * - closure information (dates when the system will be inactive and reasons for
 * this inactivity)<br>
 * - event indicator (types of event and precise timing of their occurrence
 * within the system concerned)<br>
 * This message will be replied to by a ReturnBusinessDayInformation message.
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
 * {@linkplain com.tools20022.repository.area.camt.GetBusinessDayInformationV04#mmMessageHeader
 * GetBusinessDayInformationV04.mmMessageHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.GetBusinessDayInformationV04#mmBusinessDayInformationQueryDefinition
 * GetBusinessDayInformationV04.mmBusinessDayInformationQueryDefinition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.GetBusinessDayInformationV04#mmSupplementaryData
 * GetBusinessDayInformationV04.mmSupplementaryData}</li>
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
 * xmlTag} = "GetBizDayInf"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.CashManagementLatestVersion
 * CashManagementLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code camt.018.001.04}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "GetBusinessDayInformationV04"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe GetBusinessDayInformation message is sent by a member to the transaction administrator.\r\nIt is used to request information on different types of administrative data linked to the system.\r\nUsage\r\nThe transaction administrator is in charge of providing the members with business information. The term business day information covers all information related to the management of the system, not related to the transactions created in the system. The type of business day information available can vary depending on the system.\r\nAt any time during the operating hours of the system, the member can query the transaction administrator to get information about the static data of the system.\r\nThe member can request information based on the following elements:\r\n- identification of the system\r\n- currency within the system concerned\r\n- status of the system\r\n- period of availability of a given currency linked to the system concerned (in case the system handles more than one currency)\r\n- closure information (dates when the system will be inactive and reasons for this inactivity)\r\n- event indicator (types of event and precise timing of their occurrence within the system concerned)\r\nThis message will be replied to by a ReturnBusinessDayInformation message. Additional information on the generic design of the Get/Return messages can be found in the section How to Use the Cash Management Messages."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "GetBusinessDayInformationV04", propOrder = {"messageHeader", "businessDayInformationQueryDefinition", "supplementaryData"})
public class GetBusinessDayInformationV04 {

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
	public static final MMMessageBuildingBlock<GetBusinessDayInformationV04, MessageHeader9> mmMessageHeader = new MMMessageBuildingBlock<GetBusinessDayInformationV04, MessageHeader9>() {
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
		public MessageHeader9 getValue(GetBusinessDayInformationV04 obj) {
			return obj.getMessageHeader();
		}

		@Override
		public void setValue(GetBusinessDayInformationV04 obj, MessageHeader9 value) {
			obj.setMessageHeader(value);
		}
	};
	@XmlElement(name = "BizDayInfQryDef")
	protected BusinessDayQuery2 businessDayInformationQueryDefinition;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.BusinessDayQuery2
	 * BusinessDayQuery2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BizDayInfQryDef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BusinessDayInformationQueryDefinition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Defines the business day information query criteria."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<GetBusinessDayInformationV04, Optional<BusinessDayQuery2>> mmBusinessDayInformationQueryDefinition = new MMMessageBuildingBlock<GetBusinessDayInformationV04, Optional<BusinessDayQuery2>>() {
		{
			xmlTag = "BizDayInfQryDef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BusinessDayInformationQueryDefinition";
			definition = "Defines the business day information query criteria.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> BusinessDayQuery2.mmObject();
		}

		@Override
		public Optional<BusinessDayQuery2> getValue(GetBusinessDayInformationV04 obj) {
			return obj.getBusinessDayInformationQueryDefinition();
		}

		@Override
		public void setValue(GetBusinessDayInformationV04 obj, Optional<BusinessDayQuery2> value) {
			obj.setBusinessDayInformationQueryDefinition(value.orElse(null));
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
	public static final MMMessageBuildingBlock<GetBusinessDayInformationV04, List<SupplementaryData1>> mmSupplementaryData = new MMMessageBuildingBlock<GetBusinessDayInformationV04, List<SupplementaryData1>>() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(GetBusinessDayInformationV04 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(GetBusinessDayInformationV04 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "GetBusinessDayInformationV04";
				definition = "Scope\r\nThe GetBusinessDayInformation message is sent by a member to the transaction administrator.\r\nIt is used to request information on different types of administrative data linked to the system.\r\nUsage\r\nThe transaction administrator is in charge of providing the members with business information. The term business day information covers all information related to the management of the system, not related to the transactions created in the system. The type of business day information available can vary depending on the system.\r\nAt any time during the operating hours of the system, the member can query the transaction administrator to get information about the static data of the system.\r\nThe member can request information based on the following elements:\r\n- identification of the system\r\n- currency within the system concerned\r\n- status of the system\r\n- period of availability of a given currency linked to the system concerned (in case the system handles more than one currency)\r\n- closure information (dates when the system will be inactive and reasons for this inactivity)\r\n- event indicator (types of event and precise timing of their occurrence within the system concerned)\r\nThis message will be replied to by a ReturnBusinessDayInformation message. Additional information on the generic design of the Get/Return messages can be found in the section How to Use the Cash Management Messages.";
				messageSet_lazy = () -> Arrays.asList(_SR2018_MX_CashManagement_Maintenance.mmObject());
				rootElement = "Document";
				xmlTag = "GetBizDayInf";
				businessArea_lazy = () -> CashManagementLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.camt.GetBusinessDayInformationV04.mmMessageHeader,
						com.tools20022.repository.area.camt.GetBusinessDayInformationV04.mmBusinessDayInformationQueryDefinition, com.tools20022.repository.area.camt.GetBusinessDayInformationV04.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "camt";
						messageFunctionality = "018";
						version = "04";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return GetBusinessDayInformationV04.class;
			}
		});
		return mmObject_lazy.get();
	}

	public MessageHeader9 getMessageHeader() {
		return messageHeader;
	}

	public GetBusinessDayInformationV04 setMessageHeader(MessageHeader9 messageHeader) {
		this.messageHeader = Objects.requireNonNull(messageHeader);
		return this;
	}

	public Optional<BusinessDayQuery2> getBusinessDayInformationQueryDefinition() {
		return businessDayInformationQueryDefinition == null ? Optional.empty() : Optional.of(businessDayInformationQueryDefinition);
	}

	public GetBusinessDayInformationV04 setBusinessDayInformationQueryDefinition(BusinessDayQuery2 businessDayInformationQueryDefinition) {
		this.businessDayInformationQueryDefinition = businessDayInformationQueryDefinition;
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public GetBusinessDayInformationV04 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.018.001.04")
	static public class Document {
		@XmlElement(name = "GetBizDayInf", required = true)
		public GetBusinessDayInformationV04 messageBody;
	}
}