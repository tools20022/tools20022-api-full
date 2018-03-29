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
import com.tools20022.repository.choice.ExchangeRateReportOrError1Choice;
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
 * <b>Scope</b><br>
 * The ReturnCurrencyExchangeRate message is sent by the transaction
 * administrator to a member of the system.<br>
 * It is used to provide information on static data and related to currency
 * exchange details as maintained for system operations by the transaction
 * administrator.<br>
 * The ReturnCurrencyExchangeRate message can be sent as a response to a related
 * GetCurrencyExchangeRate message (pull mode) or initiated by the account
 * servicer (push mode). The push of information can take place either at
 * prearranged times or as a warning or alarm when a problem has occurred.<br>
 * <b>Usage</b><br>
 * The transaction administrator is in charge of providing the members with
 * business information. The term business information covers all information
 * related to the management of the system, that is, not related to the
 * transactions or requests created in the system. The type of business
 * information available can vary depending on the system.<br>
 * When a system manages a pool of accounts in various currencies for a member,
 * it needs to maintain currency exchange details between the various currencies
 * and the reporting on base currency. The reporting on base currency is used to
 * calculate the actual position of the members in terms of aggregate limits and
 * balances. It also allows the system to contain risk within defined and agreed
 * boundaries.<br>
 * The currency exchange details can be fixed for the entire operational day or
 * regularly updated according to near real-time market feeds.<br>
 * The member can request information about a currency exchange operation
 * through a series of criteria, corresponding to the known information stored
 * within the transaction administrator. Based on the criteria received within
 * the request, the transaction administrator will select items that will match
 * with the request and report them to the requestor.<br>
 * The transaction administrator may also send a Return Currency Exchange Rate
 * message with pre-defined information at times previously agreed with the
 * member or to warn the member about a particular problem that may have arisen
 * and which needs the member(s) attention.<br>
 * The message from the transaction administrator will contain information based
 * on the following elements:<br>
 * - the currency to be converted (source currency)<br>
 * - the currency into which the amount is converted (target currency)<br>
 * - the exchange rate<br>
 * - the quotation date and currency<br>
 * Additional information on the generic design of the Get/Return messages can
 * be found in the MDR Part 1 section How to Use the Cash Management Messages.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ReturnCurrencyExchangeRateV03#mmMessageHeader
 * ReturnCurrencyExchangeRateV03.mmMessageHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ReturnCurrencyExchangeRateV03#mmReportOrError
 * ReturnCurrencyExchangeRateV03.mmReportOrError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ReturnCurrencyExchangeRateV03#mmSupplementaryData
 * ReturnCurrencyExchangeRateV03.mmSupplementaryData}</li>
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
 * xmlTag} = "RtrCcyXchgRate"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.CashManagementLatestVersion
 * CashManagementLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code camt.017.001.03}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ReturnCurrencyExchangeRateV03"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe ReturnCurrencyExchangeRate message is sent by the transaction administrator to a member of the system.\r\nIt is used to provide information on static data and related to currency exchange details as maintained for system operations by the transaction administrator.\r\nThe ReturnCurrencyExchangeRate message can be sent as a response to a related GetCurrencyExchangeRate message (pull mode) or initiated by the account servicer (push mode). The push of information can take place either at prearranged times or as a warning or alarm when a problem has occurred.\r\nUsage\r\nThe transaction administrator is in charge of providing the members with business information. The term business information covers all information related to the management of the system, that is, not related to the transactions or requests created in the system. The type of business information available can vary depending on the system.\r\nWhen a system manages a pool of accounts in various currencies for a member, it needs to maintain currency exchange details between the various currencies and the reporting on base currency. The reporting on base currency is used to calculate the actual position of the members in terms of aggregate limits and balances. It also allows the system to contain risk within defined and agreed boundaries.\r\nThe currency exchange details can be fixed for the entire operational day or regularly updated according to near real-time market feeds.\r\nThe member can request information about a currency exchange operation through a series of criteria, corresponding to the known information stored within the transaction administrator. Based on the criteria received within the request, the transaction administrator will select items that will match with the request and report them to the requestor.\r\nThe transaction administrator may also send a Return Currency Exchange Rate message with pre-defined information at times previously agreed with the member or to warn the member about a particular problem that may have arisen and which needs the member(s) attention.\r\nThe message from the transaction administrator will contain information based on the following elements:\r\n- the currency to be converted (source currency)\r\n- the currency into which the amount is converted (target currency)\r\n- the exchange rate\r\n- the quotation date and currency\r\nAdditional information on the generic design of the Get/Return messages can be found in the MDR Part 1 section How to Use the Cash Management Messages."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ReturnCurrencyExchangeRateV03", propOrder = {"messageHeader", "reportOrError", "supplementaryData"})
public class ReturnCurrencyExchangeRateV03 {

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
	public static final MMMessageBuildingBlock<ReturnCurrencyExchangeRateV03, MessageHeader7> mmMessageHeader = new MMMessageBuildingBlock<ReturnCurrencyExchangeRateV03, MessageHeader7>() {
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
		public MessageHeader7 getValue(ReturnCurrencyExchangeRateV03 obj) {
			return obj.getMessageHeader();
		}

		@Override
		public void setValue(ReturnCurrencyExchangeRateV03 obj, MessageHeader7 value) {
			obj.setMessageHeader(value);
		}
	};
	@XmlElement(name = "RptOrErr", required = true)
	protected ExchangeRateReportOrError1Choice reportOrError;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.ExchangeRateReportOrError1Choice
	 * ExchangeRateReportOrError1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptOrErr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportOrError"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reports on currency exchange information."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ReturnCurrencyExchangeRateV03, ExchangeRateReportOrError1Choice> mmReportOrError = new MMMessageBuildingBlock<ReturnCurrencyExchangeRateV03, ExchangeRateReportOrError1Choice>() {
		{
			xmlTag = "RptOrErr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportOrError";
			definition = "Reports on currency exchange information.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> ExchangeRateReportOrError1Choice.mmObject();
		}

		@Override
		public ExchangeRateReportOrError1Choice getValue(ReturnCurrencyExchangeRateV03 obj) {
			return obj.getReportOrError();
		}

		@Override
		public void setValue(ReturnCurrencyExchangeRateV03 obj, ExchangeRateReportOrError1Choice value) {
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
	public static final MMMessageBuildingBlock<ReturnCurrencyExchangeRateV03, List<SupplementaryData1>> mmSupplementaryData = new MMMessageBuildingBlock<ReturnCurrencyExchangeRateV03, List<SupplementaryData1>>() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(ReturnCurrencyExchangeRateV03 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(ReturnCurrencyExchangeRateV03 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "ReturnCurrencyExchangeRateV03";
				definition = "Scope\r\nThe ReturnCurrencyExchangeRate message is sent by the transaction administrator to a member of the system.\r\nIt is used to provide information on static data and related to currency exchange details as maintained for system operations by the transaction administrator.\r\nThe ReturnCurrencyExchangeRate message can be sent as a response to a related GetCurrencyExchangeRate message (pull mode) or initiated by the account servicer (push mode). The push of information can take place either at prearranged times or as a warning or alarm when a problem has occurred.\r\nUsage\r\nThe transaction administrator is in charge of providing the members with business information. The term business information covers all information related to the management of the system, that is, not related to the transactions or requests created in the system. The type of business information available can vary depending on the system.\r\nWhen a system manages a pool of accounts in various currencies for a member, it needs to maintain currency exchange details between the various currencies and the reporting on base currency. The reporting on base currency is used to calculate the actual position of the members in terms of aggregate limits and balances. It also allows the system to contain risk within defined and agreed boundaries.\r\nThe currency exchange details can be fixed for the entire operational day or regularly updated according to near real-time market feeds.\r\nThe member can request information about a currency exchange operation through a series of criteria, corresponding to the known information stored within the transaction administrator. Based on the criteria received within the request, the transaction administrator will select items that will match with the request and report them to the requestor.\r\nThe transaction administrator may also send a Return Currency Exchange Rate message with pre-defined information at times previously agreed with the member or to warn the member about a particular problem that may have arisen and which needs the member(s) attention.\r\nThe message from the transaction administrator will contain information based on the following elements:\r\n- the currency to be converted (source currency)\r\n- the currency into which the amount is converted (target currency)\r\n- the exchange rate\r\n- the quotation date and currency\r\nAdditional information on the generic design of the Get/Return messages can be found in the MDR Part 1 section How to Use the Cash Management Messages.";
				messageSet_lazy = () -> Arrays.asList(_SR2018_MX_CashManagement_Maintenance.mmObject());
				rootElement = "Document";
				xmlTag = "RtrCcyXchgRate";
				businessArea_lazy = () -> CashManagementLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.camt.ReturnCurrencyExchangeRateV03.mmMessageHeader, com.tools20022.repository.area.camt.ReturnCurrencyExchangeRateV03.mmReportOrError,
						com.tools20022.repository.area.camt.ReturnCurrencyExchangeRateV03.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "camt";
						messageFunctionality = "017";
						version = "03";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return ReturnCurrencyExchangeRateV03.class;
			}
		});
		return mmObject_lazy.get();
	}

	public MessageHeader7 getMessageHeader() {
		return messageHeader;
	}

	public ReturnCurrencyExchangeRateV03 setMessageHeader(MessageHeader7 messageHeader) {
		this.messageHeader = Objects.requireNonNull(messageHeader);
		return this;
	}

	public ExchangeRateReportOrError1Choice getReportOrError() {
		return reportOrError;
	}

	public ReturnCurrencyExchangeRateV03 setReportOrError(ExchangeRateReportOrError1Choice reportOrError) {
		this.reportOrError = Objects.requireNonNull(reportOrError);
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public ReturnCurrencyExchangeRateV03 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.017.001.03")
	static public class Document {
		@XmlElement(name = "RtrCcyXchgRate", required = true)
		public ReturnCurrencyExchangeRateV03 messageBody;
	}
}