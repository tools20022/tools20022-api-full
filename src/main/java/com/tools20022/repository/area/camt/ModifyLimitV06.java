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
import com.tools20022.repository.msg.LimitStructure2;
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
 * Scope The ModifyLimit message is sent by a member to the transaction
 * administrator. It is used to request modifications in the details of one
 * particular, several or all limits set by the member and managed by the
 * transaction administrator. Each ModifyLimit message can alter only one type
 * of limit (current or default). Usage At any time during the operating hours
 * of the system, the member can request modifications in the limits it has set.
 * For example, the reason may be to unlock the payments queue regarding a
 * particular member, or following a risk management decision issued after an
 * exceptional event has occurred. The member will submit a message requesting
 * modifications in one or more of the following criteria: - type of limit
 * (current/default) - identification of the system - identification of the
 * counterparty - value of the limit(s) (default and/or current limit(s)) -
 * point in time when the limit becomes effective Based on the criteria received
 * within the ModifyLimit message, the transaction administrator will execute or
 * reject the requested modification. The transaction administrator may send a
 * Receipt message as a reply to the ModifyLimit request. To verify the outcome
 * of the request, the member may submit a GetLimit message with the appropriate
 * search criteria.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ModifyLimitV06#mmMessageHeader
 * ModifyLimitV06.mmMessageHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ModifyLimitV06#mmLimitDetails
 * ModifyLimitV06.mmLimitDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ModifyLimitV06#mmSupplementaryData
 * ModifyLimitV06.mmSupplementaryData}</li>
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
 * xmlTag} = "ModfyLmt"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.CashManagementLatestVersion
 * CashManagementLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code camt.011.001.06}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ModifyLimitV06"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\nThe ModifyLimit message is sent by a member to the transaction administrator.\nIt is used to request modifications in the details of one particular, several or all limits set by the member and managed by the transaction administrator.\nEach ModifyLimit message can alter only one type of limit (current or default).\nUsage\nAt any time during the operating hours of the system, the member can request modifications in the limits it has set. For example, the reason may be to unlock the payments queue regarding a particular member, or following a risk management decision issued after an exceptional event has occurred.\nThe member will submit a message requesting modifications in one or more of the following criteria: \n- type of limit (current/default)\n- identification of the system\n- identification of the counterparty\n- value of the limit(s) (default and/or current limit(s))\n- point in time when the limit becomes effective\nBased on the criteria received within the ModifyLimit message, the transaction administrator will execute or reject the requested modification. The transaction administrator may send a Receipt message as a reply to the ModifyLimit request. To verify the outcome of the request, the member may submit a GetLimit message with the appropriate search criteria."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ModifyLimitV06", propOrder = {"messageHeader", "limitDetails", "supplementaryData"})
public class ModifyLimitV06 {

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
				return ModifyLimitV06.class.getMethod("getMessageHeader", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "LmtDtls")
	protected List<LimitStructure2> limitDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.LimitStructure2
	 * LimitStructure2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LmtDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LimitDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies one particular limit set by the member and managed by the transaction administrator."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmLimitDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "LmtDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LimitDetails";
			definition = "Identifies one particular limit set by the member and managed by the transaction administrator.";
			minOccurs = 0;
			complexType_lazy = () -> LimitStructure2.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ModifyLimitV06.class.getMethod("getLimitDetails", new Class[]{});
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
				return ModifyLimitV06.class.getMethod("getSupplementaryData", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ModifyLimitV06";
				definition = "Scope\nThe ModifyLimit message is sent by a member to the transaction administrator.\nIt is used to request modifications in the details of one particular, several or all limits set by the member and managed by the transaction administrator.\nEach ModifyLimit message can alter only one type of limit (current or default).\nUsage\nAt any time during the operating hours of the system, the member can request modifications in the limits it has set. For example, the reason may be to unlock the payments queue regarding a particular member, or following a risk management decision issued after an exceptional event has occurred.\nThe member will submit a message requesting modifications in one or more of the following criteria: \n- type of limit (current/default)\n- identification of the system\n- identification of the counterparty\n- value of the limit(s) (default and/or current limit(s))\n- point in time when the limit becomes effective\nBased on the criteria received within the ModifyLimit message, the transaction administrator will execute or reject the requested modification. The transaction administrator may send a Receipt message as a reply to the ModifyLimit request. To verify the outcome of the request, the member may submit a GetLimit message with the appropriate search criteria.";
				messageSet_lazy = () -> Arrays.asList(_SR2018_MX_CashManagement_Maintenance.mmObject());
				rootElement = "Document";
				xmlTag = "ModfyLmt";
				businessArea_lazy = () -> CashManagementLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.camt.ModifyLimitV06.mmMessageHeader, com.tools20022.repository.area.camt.ModifyLimitV06.mmLimitDetails,
						com.tools20022.repository.area.camt.ModifyLimitV06.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "camt";
						messageFunctionality = "011";
						version = "06";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return ModifyLimitV06.class;
			}
		});
		return mmObject_lazy.get();
	}

	public MessageHeader1 getMessageHeader() {
		return messageHeader;
	}

	public ModifyLimitV06 setMessageHeader(MessageHeader1 messageHeader) {
		this.messageHeader = Objects.requireNonNull(messageHeader);
		return this;
	}

	public List<LimitStructure2> getLimitDetails() {
		return limitDetails == null ? limitDetails = new ArrayList<>() : limitDetails;
	}

	public ModifyLimitV06 setLimitDetails(List<LimitStructure2> limitDetails) {
		this.limitDetails = Objects.requireNonNull(limitDetails);
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public ModifyLimitV06 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.011.001.06")
	static public class Document {
		@XmlElement(name = "ModfyLmt", required = true)
		public ModifyLimitV06 messageBody;
	}
}