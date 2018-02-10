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

package com.tools20022.repository.area.trea;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.TreasuryArchive;
import com.tools20022.repository.msg.*;
import com.tools20022.repository.msgset.ForexNotificationsISOArchive;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The NonDeliverableForwardNotification message is sent by a central system to
 * a participant to provide details of a non deliverable forward trade.<br>
 * <b>Usage</b><br>
 * The notification is sent by a central settlement system to the two trading
 * parties after it has received create, amend or cancel messages from both. The
 * message may also contain information on the settlement of the trade.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.trea.NonDeliverableForwardNotificationV02#mmTradingSideIdentification
 * NonDeliverableForwardNotificationV02.mmTradingSideIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.trea.NonDeliverableForwardNotificationV02#mmCounterpartySideIdentification
 * NonDeliverableForwardNotificationV02.mmCounterpartySideIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.trea.NonDeliverableForwardNotificationV02#mmOpeningData
 * NonDeliverableForwardNotificationV02.mmOpeningData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.trea.NonDeliverableForwardNotificationV02#mmValuationData
 * NonDeliverableForwardNotificationV02.mmValuationData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.trea.NonDeliverableForwardNotificationV02#mmTradeInformationAndStatus
 * NonDeliverableForwardNotificationV02.mmTradeInformationAndStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.trea.NonDeliverableForwardNotificationV02#mmSettlementData
 * NonDeliverableForwardNotificationV02.mmSettlementData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.ForexNotificationsISOArchive
 * ForexNotificationsISOArchive}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "NDFNtfctnV02"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} = {@linkplain com.tools20022.repository.area.TreasuryArchive
 * TreasuryArchive}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code trea.007.001.02}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "NonDeliverableForwardNotificationV02"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe NonDeliverableForwardNotification message is sent by a central system to a participant to provide details of a non deliverable forward trade.\r\nUsage\r\nThe notification is sent by a central settlement system to the two trading parties after it has received create, amend or cancel messages from both. The message may also contain information on the settlement of the trade."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "NonDeliverableForwardNotificationV02", propOrder = {"tradingSideIdentification", "counterpartySideIdentification", "openingData", "valuationData", "tradeInformationAndStatus", "settlementData"})
public class NonDeliverableForwardNotificationV02 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TradgSdId", required = true)
	protected TradePartyIdentification3 tradingSideIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.TradePartyIdentification3
	 * TradePartyIdentification3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradgSdId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingSideIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the trading side of the non deliverable trade which is reported."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmTradingSideIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "TradgSdId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingSideIdentification";
			definition = "Specifies the trading side of the non deliverable trade which is reported.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> TradePartyIdentification3.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return NonDeliverableForwardNotificationV02.class.getMethod("getTradingSideIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "CtrPtySdId", required = true)
	protected TradePartyIdentification3 counterpartySideIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.TradePartyIdentification3
	 * TradePartyIdentification3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtrPtySdId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterpartySideIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the counterparty of the non deliverable trade which is reported."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmCounterpartySideIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "CtrPtySdId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartySideIdentification";
			definition = "Specifies the counterparty of the non deliverable trade which is reported.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> TradePartyIdentification3.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return NonDeliverableForwardNotificationV02.class.getMethod("getCounterpartySideIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "OpngData")
	protected OpeningData2 openingData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.OpeningData2
	 * OpeningData2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OpngData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OpeningData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of data specified for the opening of a non deliverable trade."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmOpeningData = new MMMessageBuildingBlock() {
		{
			xmlTag = "OpngData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OpeningData";
			definition = "Set of data specified for the opening of a non deliverable trade.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> OpeningData2.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return NonDeliverableForwardNotificationV02.class.getMethod("getOpeningData", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "ValtnData")
	protected ClosingData2 valuationData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.ClosingData2
	 * ClosingData2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ValtnData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValuationData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of data specified for the valuation of a non deliverable trade."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmValuationData = new MMMessageBuildingBlock() {
		{
			xmlTag = "ValtnData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValuationData";
			definition = "Set of data specified for the valuation of a non deliverable trade.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ClosingData2.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return NonDeliverableForwardNotificationV02.class.getMethod("getValuationData", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "TradInfAndSts", required = true)
	protected TradeStatus1 tradeInformationAndStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.TradeStatus1
	 * TradeStatus1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradInfAndSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeInformationAndStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information on the status of a trade in a central system."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmTradeInformationAndStatus = new MMMessageBuildingBlock() {
		{
			xmlTag = "TradInfAndSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeInformationAndStatus";
			definition = "Provides information on the status of a trade in a central system.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> TradeStatus1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return NonDeliverableForwardNotificationV02.class.getMethod("getTradeInformationAndStatus", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "SttlmData")
	protected SettlementData2 settlementData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.SettlementData2
	 * SettlementData2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides information on the settlement of a trade."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSettlementData = new MMMessageBuildingBlock() {
		{
			xmlTag = "SttlmData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementData";
			definition = "Provides information on the settlement of a trade.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SettlementData2.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return NonDeliverableForwardNotificationV02.class.getMethod("getSettlementData", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "NonDeliverableForwardNotificationV02";
				definition = "Scope\r\nThe NonDeliverableForwardNotification message is sent by a central system to a participant to provide details of a non deliverable forward trade.\r\nUsage\r\nThe notification is sent by a central settlement system to the two trading parties after it has received create, amend or cancel messages from both. The message may also contain information on the settlement of the trade.";
				messageSet_lazy = () -> Arrays.asList(ForexNotificationsISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "NDFNtfctnV02";
				businessArea_lazy = () -> TreasuryArchive.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.trea.NonDeliverableForwardNotificationV02.mmTradingSideIdentification,
						com.tools20022.repository.area.trea.NonDeliverableForwardNotificationV02.mmCounterpartySideIdentification, com.tools20022.repository.area.trea.NonDeliverableForwardNotificationV02.mmOpeningData,
						com.tools20022.repository.area.trea.NonDeliverableForwardNotificationV02.mmValuationData, com.tools20022.repository.area.trea.NonDeliverableForwardNotificationV02.mmTradeInformationAndStatus,
						com.tools20022.repository.area.trea.NonDeliverableForwardNotificationV02.mmSettlementData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "trea";
						messageFunctionality = "007";
						version = "02";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return NonDeliverableForwardNotificationV02.class;
			}
		});
		return mmObject_lazy.get();
	}

	public TradePartyIdentification3 getTradingSideIdentification() {
		return tradingSideIdentification;
	}

	public NonDeliverableForwardNotificationV02 setTradingSideIdentification(TradePartyIdentification3 tradingSideIdentification) {
		this.tradingSideIdentification = Objects.requireNonNull(tradingSideIdentification);
		return this;
	}

	public TradePartyIdentification3 getCounterpartySideIdentification() {
		return counterpartySideIdentification;
	}

	public NonDeliverableForwardNotificationV02 setCounterpartySideIdentification(TradePartyIdentification3 counterpartySideIdentification) {
		this.counterpartySideIdentification = Objects.requireNonNull(counterpartySideIdentification);
		return this;
	}

	public Optional<OpeningData2> getOpeningData() {
		return openingData == null ? Optional.empty() : Optional.of(openingData);
	}

	public NonDeliverableForwardNotificationV02 setOpeningData(OpeningData2 openingData) {
		this.openingData = openingData;
		return this;
	}

	public Optional<ClosingData2> getValuationData() {
		return valuationData == null ? Optional.empty() : Optional.of(valuationData);
	}

	public NonDeliverableForwardNotificationV02 setValuationData(ClosingData2 valuationData) {
		this.valuationData = valuationData;
		return this;
	}

	public TradeStatus1 getTradeInformationAndStatus() {
		return tradeInformationAndStatus;
	}

	public NonDeliverableForwardNotificationV02 setTradeInformationAndStatus(TradeStatus1 tradeInformationAndStatus) {
		this.tradeInformationAndStatus = Objects.requireNonNull(tradeInformationAndStatus);
		return this;
	}

	public Optional<SettlementData2> getSettlementData() {
		return settlementData == null ? Optional.empty() : Optional.of(settlementData);
	}

	public NonDeliverableForwardNotificationV02 setSettlementData(SettlementData2 settlementData) {
		this.settlementData = settlementData;
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:trea.007.001.02")
	static public class Document {
		@XmlElement(name = "NDFNtfctnV02", required = true)
		public NonDeliverableForwardNotificationV02 messageBody;
	}
}