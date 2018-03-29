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

package com.tools20022.repository.area.fxtr;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.ForeignExchangeTradeLatestVersion;
import com.tools20022.repository.codeset.Status5Code;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.msg.AdditionalReferences;
import com.tools20022.repository.msg.MessageIdentification1;
import com.tools20022.repository.msg.SupplementaryData1;
import com.tools20022.repository.msgset.FXPostTradeTradeCapture;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The ForeignExchangeTradeCaptureReportAcknowledgement message is sent by
 * trading members to the trading system for notifying the trade capture report
 * is received.<br>
 * <br>
 * <b>Usage</b><br>
 * The acknowledgement is sent by the trading member to the trading system after
 * they received the trade capture report. <br>
 * Note that one capture acknowledgement responds to one capture report.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeCaptureReportAcknowledgementV01#mmAcknowledgementIdentification
 * ForeignExchangeTradeCaptureReportAcknowledgementV01.
 * mmAcknowledgementIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeCaptureReportAcknowledgementV01#mmTradeIdentification
 * ForeignExchangeTradeCaptureReportAcknowledgementV01.mmTradeIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeCaptureReportAcknowledgementV01#mmStatus
 * ForeignExchangeTradeCaptureReportAcknowledgementV01.mmStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeCaptureReportAcknowledgementV01#mmReference
 * ForeignExchangeTradeCaptureReportAcknowledgementV01.mmReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeCaptureReportAcknowledgementV01#mmSupplementaryData
 * ForeignExchangeTradeCaptureReportAcknowledgementV01.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msgset.FXPostTradeTradeCapture
 * FXPostTradeTradeCapture}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "FXTradCaptrRptAck"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.ForeignExchangeTradeLatestVersion
 * ForeignExchangeTradeLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code fxtr.033.001.01}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ForeignExchangeTradeCaptureReportAcknowledgementV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe ForeignExchangeTradeCaptureReportAcknowledgement message is sent by trading members to the trading system for notifying the trade capture report is received.\r\n\r\nUsage\r\nThe acknowledgement is sent by the trading member to the trading system after they received the trade capture report. \r\nNote that one capture acknowledgement responds to one capture report."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ForeignExchangeTradeCaptureReportAcknowledgementV01", propOrder = {"acknowledgementIdentification", "tradeIdentification", "status", "reference", "supplementaryData"})
public class ForeignExchangeTradeCaptureReportAcknowledgementV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "AckId")
	protected MessageIdentification1 acknowledgementIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.MessageIdentification1
	 * MessageIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AckId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcknowledgementIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the acknowledgement message."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ForeignExchangeTradeCaptureReportAcknowledgementV01, Optional<MessageIdentification1>> mmAcknowledgementIdentification = new MMMessageBuildingBlock<ForeignExchangeTradeCaptureReportAcknowledgementV01, Optional<MessageIdentification1>>() {
		{
			xmlTag = "AckId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcknowledgementIdentification";
			definition = "Identifies the acknowledgement message.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> MessageIdentification1.mmObject();
		}

		@Override
		public Optional<MessageIdentification1> getValue(ForeignExchangeTradeCaptureReportAcknowledgementV01 obj) {
			return obj.getAcknowledgementIdentification();
		}

		@Override
		public void setValue(ForeignExchangeTradeCaptureReportAcknowledgementV01 obj, Optional<MessageIdentification1> value) {
			obj.setAcknowledgementIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "TradId", required = true)
	protected Max35Text tradeIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique reference identification assigned to the trade by the instructing party. This reference will be used throughout the trade life cycle to identify the particular trade."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ForeignExchangeTradeCaptureReportAcknowledgementV01, Max35Text> mmTradeIdentification = new MMMessageBuildingBlock<ForeignExchangeTradeCaptureReportAcknowledgementV01, Max35Text>() {
		{
			xmlTag = "TradId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeIdentification";
			definition = "Unique reference identification assigned to the trade by the instructing party. This reference will be used throughout the trade life cycle to identify the particular trade.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(ForeignExchangeTradeCaptureReportAcknowledgementV01 obj) {
			return obj.getTradeIdentification();
		}

		@Override
		public void setValue(ForeignExchangeTradeCaptureReportAcknowledgementV01 obj, Max35Text value) {
			obj.setTradeIdentification(value);
		}
	};
	@XmlElement(name = "Sts", required = true)
	protected Status5Code status;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.Status5Code
	 * Status5Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Status"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Acknowlegement status of recevied trade capture report."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ForeignExchangeTradeCaptureReportAcknowledgementV01, Status5Code> mmStatus = new MMMessageBuildingBlock<ForeignExchangeTradeCaptureReportAcknowledgementV01, Status5Code>() {
		{
			xmlTag = "Sts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Status";
			definition = "Acknowlegement status of recevied trade capture report.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Status5Code.mmObject();
		}

		@Override
		public Status5Code getValue(ForeignExchangeTradeCaptureReportAcknowledgementV01 obj) {
			return obj.getStatus();
		}

		@Override
		public void setValue(ForeignExchangeTradeCaptureReportAcknowledgementV01 obj, Status5Code value) {
			obj.setStatus(value);
		}
	};
	@XmlElement(name = "Ref")
	protected AdditionalReferences reference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReferences
	 * AdditionalReferences}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ref"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference of the acknowledge, specifies the message this acknowledge responds to."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ForeignExchangeTradeCaptureReportAcknowledgementV01, Optional<AdditionalReferences>> mmReference = new MMMessageBuildingBlock<ForeignExchangeTradeCaptureReportAcknowledgementV01, Optional<AdditionalReferences>>() {
		{
			xmlTag = "Ref";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reference";
			definition = "Reference of the acknowledge, specifies the message this acknowledge responds to.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AdditionalReferences.mmObject();
		}

		@Override
		public Optional<AdditionalReferences> getValue(ForeignExchangeTradeCaptureReportAcknowledgementV01 obj) {
			return obj.getReference();
		}

		@Override
		public void setValue(ForeignExchangeTradeCaptureReportAcknowledgementV01 obj, Optional<AdditionalReferences> value) {
			obj.setReference(value.orElse(null));
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
	public static final MMMessageBuildingBlock<ForeignExchangeTradeCaptureReportAcknowledgementV01, List<SupplementaryData1>> mmSupplementaryData = new MMMessageBuildingBlock<ForeignExchangeTradeCaptureReportAcknowledgementV01, List<SupplementaryData1>>() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(ForeignExchangeTradeCaptureReportAcknowledgementV01 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(ForeignExchangeTradeCaptureReportAcknowledgementV01 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ForeignExchangeTradeCaptureReportAcknowledgementV01";
				definition = "Scope\r\nThe ForeignExchangeTradeCaptureReportAcknowledgement message is sent by trading members to the trading system for notifying the trade capture report is received.\r\n\r\nUsage\r\nThe acknowledgement is sent by the trading member to the trading system after they received the trade capture report. \r\nNote that one capture acknowledgement responds to one capture report.";
				messageSet_lazy = () -> Arrays.asList(FXPostTradeTradeCapture.mmObject());
				rootElement = "Document";
				xmlTag = "FXTradCaptrRptAck";
				businessArea_lazy = () -> ForeignExchangeTradeLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.fxtr.ForeignExchangeTradeCaptureReportAcknowledgementV01.mmAcknowledgementIdentification,
						com.tools20022.repository.area.fxtr.ForeignExchangeTradeCaptureReportAcknowledgementV01.mmTradeIdentification, com.tools20022.repository.area.fxtr.ForeignExchangeTradeCaptureReportAcknowledgementV01.mmStatus,
						com.tools20022.repository.area.fxtr.ForeignExchangeTradeCaptureReportAcknowledgementV01.mmReference, com.tools20022.repository.area.fxtr.ForeignExchangeTradeCaptureReportAcknowledgementV01.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "fxtr";
						messageFunctionality = "033";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return ForeignExchangeTradeCaptureReportAcknowledgementV01.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<MessageIdentification1> getAcknowledgementIdentification() {
		return acknowledgementIdentification == null ? Optional.empty() : Optional.of(acknowledgementIdentification);
	}

	public ForeignExchangeTradeCaptureReportAcknowledgementV01 setAcknowledgementIdentification(MessageIdentification1 acknowledgementIdentification) {
		this.acknowledgementIdentification = acknowledgementIdentification;
		return this;
	}

	public Max35Text getTradeIdentification() {
		return tradeIdentification;
	}

	public ForeignExchangeTradeCaptureReportAcknowledgementV01 setTradeIdentification(Max35Text tradeIdentification) {
		this.tradeIdentification = Objects.requireNonNull(tradeIdentification);
		return this;
	}

	public Status5Code getStatus() {
		return status;
	}

	public ForeignExchangeTradeCaptureReportAcknowledgementV01 setStatus(Status5Code status) {
		this.status = Objects.requireNonNull(status);
		return this;
	}

	public Optional<AdditionalReferences> getReference() {
		return reference == null ? Optional.empty() : Optional.of(reference);
	}

	public ForeignExchangeTradeCaptureReportAcknowledgementV01 setReference(AdditionalReferences reference) {
		this.reference = reference;
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public ForeignExchangeTradeCaptureReportAcknowledgementV01 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:fxtr.033.001.01")
	static public class Document {
		@XmlElement(name = "FXTradCaptrRptAck", required = true)
		public ForeignExchangeTradeCaptureReportAcknowledgementV01 messageBody;
	}
}