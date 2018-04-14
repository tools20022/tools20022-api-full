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
import com.tools20022.repository.msg.CurrencyQueryDefinition3;
import com.tools20022.repository.msg.MessageHeader1;
import com.tools20022.repository.msg.SupplementaryData1;
import com.tools20022.repository.msgset._SR2018_MX_CashManagement_Maintenance;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The GetCurrencyExchangeRate message is sent by a member to the transaction
 * administrator.<br>
 * It is used to request information on static data maintained by the
 * transaction administrator and related to currency exchange details as
 * maintained for the system operations by the transaction administrator.<br>
 * <b>Usage</b><br>
 * The transaction administrator is in charge of providing the members with
 * business information. The term business information covers all information
 * related to the management of the system, i.e., not related to the
 * transactions created into the system. The type of business information
 * available can vary depending on the system.<br>
 * When a system manages a pool of accounts in various currencies for a member,
 * there is a need to maintain currency exchange details in between the various
 * currencies and the reporting or base currency. The reporting or base currency
 * is used to calculate the actual position of the members in terms of aggregate
 * limits and balances and allow the system to contain risk within the defined
 * and agreed boundaries. The currency exchange details can be fixed for the
 * entire operational day, or regularly updated according to near real time
 * market feeds.<br>
 * At any point in time during operating hours of the system, the member can
 * query the transaction administrator to get information about the static data
 * related to a currency exchange details.<br>
 * The member can request information based on the following elements:<br>
 * - the currency to be converted (source currency)<br>
 * - the currency into which the amount is converted (target currency)<br>
 * This message will be replied to by a ReturnCurrencyExchangeRate message.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code camt.016.001.03}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.CashManagementLatestVersion
 * CashManagementLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.GetCurrencyExchangeRateV03#mmMessageHeader
 * GetCurrencyExchangeRateV03.mmMessageHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.GetCurrencyExchangeRateV03#mmCurrencyQueryDefinition
 * GetCurrencyExchangeRateV03.mmCurrencyQueryDefinition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.GetCurrencyExchangeRateV03#mmSupplementaryData
 * GetCurrencyExchangeRateV03.mmSupplementaryData}</li>
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
 * xmlTag} = "GetCcyXchgRate"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "GetCurrencyExchangeRateV03"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe GetCurrencyExchangeRate message is sent by a member to the transaction administrator.\r\nIt is used to request information on static data maintained by the transaction administrator and related to currency exchange details as maintained for the system operations by the transaction administrator.\r\nUsage\r\nThe transaction administrator is in charge of providing the members with business information. The term business information covers all information related to the management of the system, i.e., not related to the transactions created into the system. The type of business information available can vary depending on the system.\r\nWhen a system manages a pool of accounts in various currencies for a member, there is a need to maintain currency exchange details in between the various currencies and the reporting or base currency. The reporting or base currency is used to calculate the actual position of the members in terms of aggregate limits and balances and allow the system to contain risk within the defined and agreed boundaries. The currency exchange details can be fixed for the entire operational day, or regularly updated according to near real time market feeds.\r\nAt any point in time during operating hours of the system, the member can query the transaction administrator to get information about the static data related to a currency exchange details.\r\nThe member can request information based on the following elements:\r\n- the currency to be converted (source currency)\r\n- the currency into which the amount is converted (target currency)\r\nThis message will be replied to by a ReturnCurrencyExchangeRate message."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "GetCurrencyExchangeRateV03", propOrder = {"messageHeader", "currencyQueryDefinition", "supplementaryData"})
public class GetCurrencyExchangeRateV03 {

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
	public static final MMMessageBuildingBlock<GetCurrencyExchangeRateV03, MessageHeader1> mmMessageHeader = new MMMessageBuildingBlock<GetCurrencyExchangeRateV03, MessageHeader1>() {
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
		public MessageHeader1 getValue(GetCurrencyExchangeRateV03 obj) {
			return obj.getMessageHeader();
		}

		@Override
		public void setValue(GetCurrencyExchangeRateV03 obj, MessageHeader1 value) {
			obj.setMessageHeader(value);
		}
	};
	@XmlElement(name = "CcyQryDef")
	protected CurrencyQueryDefinition3 currencyQueryDefinition;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyQueryDefinition3
	 * CurrencyQueryDefinition3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CcyQryDef"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyQueryDefinition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Definition of the currency exchange query."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<GetCurrencyExchangeRateV03, Optional<CurrencyQueryDefinition3>> mmCurrencyQueryDefinition = new MMMessageBuildingBlock<GetCurrencyExchangeRateV03, Optional<CurrencyQueryDefinition3>>() {
		{
			xmlTag = "CcyQryDef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyQueryDefinition";
			definition = "Definition of the currency exchange query.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CurrencyQueryDefinition3.mmObject();
		}

		@Override
		public Optional<CurrencyQueryDefinition3> getValue(GetCurrencyExchangeRateV03 obj) {
			return obj.getCurrencyQueryDefinition();
		}

		@Override
		public void setValue(GetCurrencyExchangeRateV03 obj, Optional<CurrencyQueryDefinition3> value) {
			obj.setCurrencyQueryDefinition(value.orElse(null));
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
	public static final MMMessageBuildingBlock<GetCurrencyExchangeRateV03, List<SupplementaryData1>> mmSupplementaryData = new MMMessageBuildingBlock<GetCurrencyExchangeRateV03, List<SupplementaryData1>>() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(GetCurrencyExchangeRateV03 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(GetCurrencyExchangeRateV03 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "GetCurrencyExchangeRateV03";
				definition = "Scope\r\nThe GetCurrencyExchangeRate message is sent by a member to the transaction administrator.\r\nIt is used to request information on static data maintained by the transaction administrator and related to currency exchange details as maintained for the system operations by the transaction administrator.\r\nUsage\r\nThe transaction administrator is in charge of providing the members with business information. The term business information covers all information related to the management of the system, i.e., not related to the transactions created into the system. The type of business information available can vary depending on the system.\r\nWhen a system manages a pool of accounts in various currencies for a member, there is a need to maintain currency exchange details in between the various currencies and the reporting or base currency. The reporting or base currency is used to calculate the actual position of the members in terms of aggregate limits and balances and allow the system to contain risk within the defined and agreed boundaries. The currency exchange details can be fixed for the entire operational day, or regularly updated according to near real time market feeds.\r\nAt any point in time during operating hours of the system, the member can query the transaction administrator to get information about the static data related to a currency exchange details.\r\nThe member can request information based on the following elements:\r\n- the currency to be converted (source currency)\r\n- the currency into which the amount is converted (target currency)\r\nThis message will be replied to by a ReturnCurrencyExchangeRate message.";
				messageSet_lazy = () -> Arrays.asList(_SR2018_MX_CashManagement_Maintenance.mmObject());
				rootElement = "Document";
				xmlTag = "GetCcyXchgRate";
				businessArea_lazy = () -> CashManagementLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.camt.GetCurrencyExchangeRateV03.mmMessageHeader, com.tools20022.repository.area.camt.GetCurrencyExchangeRateV03.mmCurrencyQueryDefinition,
						com.tools20022.repository.area.camt.GetCurrencyExchangeRateV03.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "camt";
						messageFunctionality = "016";
						version = "03";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return GetCurrencyExchangeRateV03.class;
			}
		});
		return mmObject_lazy.get();
	}

	public MessageHeader1 getMessageHeader() {
		return messageHeader;
	}

	public GetCurrencyExchangeRateV03 setMessageHeader(MessageHeader1 messageHeader) {
		this.messageHeader = Objects.requireNonNull(messageHeader);
		return this;
	}

	public Optional<CurrencyQueryDefinition3> getCurrencyQueryDefinition() {
		return currencyQueryDefinition == null ? Optional.empty() : Optional.of(currencyQueryDefinition);
	}

	public GetCurrencyExchangeRateV03 setCurrencyQueryDefinition(CurrencyQueryDefinition3 currencyQueryDefinition) {
		this.currencyQueryDefinition = currencyQueryDefinition;
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public GetCurrencyExchangeRateV03 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.016.001.03")
	static public class Document {
		@XmlElement(name = "GetCcyXchgRate", required = true)
		public GetCurrencyExchangeRateV03 messageBody;
	}
}