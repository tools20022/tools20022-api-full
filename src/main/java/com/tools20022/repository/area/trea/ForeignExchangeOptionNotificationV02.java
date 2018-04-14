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
import com.tools20022.repository.msg.OptionData2;
import com.tools20022.repository.msg.SettlementData2;
import com.tools20022.repository.msg.TradePartyIdentification4;
import com.tools20022.repository.msg.TradeStatus1;
import com.tools20022.repository.msgset.ForexNotificationsISOArchive;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The ForeignExchangeOptionNotification message is sent by a central system to
 * a participant to provide details of a foreign exchange option trade.<br>
 * <b>Usage</b><br>
 * The notification is sent by the central settlement system to the two trading
 * parties after it has received Create, Amend or Cancel messages from both. The
 * message may also contain information on the settlement of the trade and/or
 * premium.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code trea.012.001.02}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} = {@linkplain com.tools20022.repository.area.TreasuryArchive
 * TreasuryArchive}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.trea.ForeignExchangeOptionNotificationV02#mmTradingSideIdentification
 * ForeignExchangeOptionNotificationV02.mmTradingSideIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.trea.ForeignExchangeOptionNotificationV02#mmCounterpartySideIdentification
 * ForeignExchangeOptionNotificationV02.mmCounterpartySideIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.trea.ForeignExchangeOptionNotificationV02#mmOptionData
 * ForeignExchangeOptionNotificationV02.mmOptionData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.trea.ForeignExchangeOptionNotificationV02#mmTradeStatus
 * ForeignExchangeOptionNotificationV02.mmTradeStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.trea.ForeignExchangeOptionNotificationV02#mmSettlementData
 * ForeignExchangeOptionNotificationV02.mmSettlementData}</li>
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
 * xmlTag} = "FXOptnNtfctnV02"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ForeignExchangeOptionNotificationV02"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe ForeignExchangeOptionNotification message is sent by a central system to a participant to provide details of a foreign exchange option trade.\r\nUsage\r\nThe notification is sent by the central settlement system to the two trading parties after it has received Create, Amend or Cancel messages from both. The message may also contain information on the settlement of the trade and/or premium."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ForeignExchangeOptionNotificationV02", propOrder = {"tradingSideIdentification", "counterpartySideIdentification", "optionData", "tradeStatus", "settlementData"})
public class ForeignExchangeOptionNotificationV02 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TradgSdId", required = true)
	protected TradePartyIdentification4 tradingSideIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.TradePartyIdentification4
	 * TradePartyIdentification4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradgSdId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingSideIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the trading side of the currency option trade which is reported."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ForeignExchangeOptionNotificationV02, TradePartyIdentification4> mmTradingSideIdentification = new MMMessageBuildingBlock<ForeignExchangeOptionNotificationV02, TradePartyIdentification4>() {
		{
			xmlTag = "TradgSdId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingSideIdentification";
			definition = "Specifies the trading side of the currency option trade which is reported.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> TradePartyIdentification4.mmObject();
		}

		@Override
		public TradePartyIdentification4 getValue(ForeignExchangeOptionNotificationV02 obj) {
			return obj.getTradingSideIdentification();
		}

		@Override
		public void setValue(ForeignExchangeOptionNotificationV02 obj, TradePartyIdentification4 value) {
			obj.setTradingSideIdentification(value);
		}
	};
	@XmlElement(name = "CtrPtySdId", required = true)
	protected TradePartyIdentification4 counterpartySideIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.TradePartyIdentification4
	 * TradePartyIdentification4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtrPtySdId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterpartySideIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the counterparty of the non deliverable trade which is reported."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ForeignExchangeOptionNotificationV02, TradePartyIdentification4> mmCounterpartySideIdentification = new MMMessageBuildingBlock<ForeignExchangeOptionNotificationV02, TradePartyIdentification4>() {
		{
			xmlTag = "CtrPtySdId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartySideIdentification";
			definition = "Specifies the counterparty of the non deliverable trade which is reported.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> TradePartyIdentification4.mmObject();
		}

		@Override
		public TradePartyIdentification4 getValue(ForeignExchangeOptionNotificationV02 obj) {
			return obj.getCounterpartySideIdentification();
		}

		@Override
		public void setValue(ForeignExchangeOptionNotificationV02 obj, TradePartyIdentification4 value) {
			obj.setCounterpartySideIdentification(value);
		}
	};
	@XmlElement(name = "OptnData", required = true)
	protected OptionData2 optionData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.OptionData2
	 * OptionData2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OptnData"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides information on the conditions of the option."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ForeignExchangeOptionNotificationV02, OptionData2> mmOptionData = new MMMessageBuildingBlock<ForeignExchangeOptionNotificationV02, OptionData2>() {
		{
			xmlTag = "OptnData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionData";
			definition = "Provides information on the conditions of the option.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> OptionData2.mmObject();
		}

		@Override
		public OptionData2 getValue(ForeignExchangeOptionNotificationV02 obj) {
			return obj.getOptionData();
		}

		@Override
		public void setValue(ForeignExchangeOptionNotificationV02 obj, OptionData2 value) {
			obj.setOptionData(value);
		}
	};
	@XmlElement(name = "TradSts", required = true)
	protected TradeStatus1 tradeStatus;
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
	 * xmlTag} = "TradSts"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information on the status of a trade in a settlement system."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ForeignExchangeOptionNotificationV02, TradeStatus1> mmTradeStatus = new MMMessageBuildingBlock<ForeignExchangeOptionNotificationV02, TradeStatus1>() {
		{
			xmlTag = "TradSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeStatus";
			definition = "Provides information on the status of a trade in a settlement system.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> TradeStatus1.mmObject();
		}

		@Override
		public TradeStatus1 getValue(ForeignExchangeOptionNotificationV02 obj) {
			return obj.getTradeStatus();
		}

		@Override
		public void setValue(ForeignExchangeOptionNotificationV02 obj, TradeStatus1 value) {
			obj.setTradeStatus(value);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides information on the settlement of a trade."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ForeignExchangeOptionNotificationV02, Optional<SettlementData2>> mmSettlementData = new MMMessageBuildingBlock<ForeignExchangeOptionNotificationV02, Optional<SettlementData2>>() {
		{
			xmlTag = "SttlmData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementData";
			definition = "Provides information on the settlement of a trade.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SettlementData2.mmObject();
		}

		@Override
		public Optional<SettlementData2> getValue(ForeignExchangeOptionNotificationV02 obj) {
			return obj.getSettlementData();
		}

		@Override
		public void setValue(ForeignExchangeOptionNotificationV02 obj, Optional<SettlementData2> value) {
			obj.setSettlementData(value.orElse(null));
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ForeignExchangeOptionNotificationV02";
				definition = "Scope\r\nThe ForeignExchangeOptionNotification message is sent by a central system to a participant to provide details of a foreign exchange option trade.\r\nUsage\r\nThe notification is sent by the central settlement system to the two trading parties after it has received Create, Amend or Cancel messages from both. The message may also contain information on the settlement of the trade and/or premium.";
				messageSet_lazy = () -> Arrays.asList(ForexNotificationsISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "FXOptnNtfctnV02";
				businessArea_lazy = () -> TreasuryArchive.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.trea.ForeignExchangeOptionNotificationV02.mmTradingSideIdentification,
						com.tools20022.repository.area.trea.ForeignExchangeOptionNotificationV02.mmCounterpartySideIdentification, com.tools20022.repository.area.trea.ForeignExchangeOptionNotificationV02.mmOptionData,
						com.tools20022.repository.area.trea.ForeignExchangeOptionNotificationV02.mmTradeStatus, com.tools20022.repository.area.trea.ForeignExchangeOptionNotificationV02.mmSettlementData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "trea";
						messageFunctionality = "012";
						version = "02";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return ForeignExchangeOptionNotificationV02.class;
			}
		});
		return mmObject_lazy.get();
	}

	public TradePartyIdentification4 getTradingSideIdentification() {
		return tradingSideIdentification;
	}

	public ForeignExchangeOptionNotificationV02 setTradingSideIdentification(TradePartyIdentification4 tradingSideIdentification) {
		this.tradingSideIdentification = Objects.requireNonNull(tradingSideIdentification);
		return this;
	}

	public TradePartyIdentification4 getCounterpartySideIdentification() {
		return counterpartySideIdentification;
	}

	public ForeignExchangeOptionNotificationV02 setCounterpartySideIdentification(TradePartyIdentification4 counterpartySideIdentification) {
		this.counterpartySideIdentification = Objects.requireNonNull(counterpartySideIdentification);
		return this;
	}

	public OptionData2 getOptionData() {
		return optionData;
	}

	public ForeignExchangeOptionNotificationV02 setOptionData(OptionData2 optionData) {
		this.optionData = Objects.requireNonNull(optionData);
		return this;
	}

	public TradeStatus1 getTradeStatus() {
		return tradeStatus;
	}

	public ForeignExchangeOptionNotificationV02 setTradeStatus(TradeStatus1 tradeStatus) {
		this.tradeStatus = Objects.requireNonNull(tradeStatus);
		return this;
	}

	public Optional<SettlementData2> getSettlementData() {
		return settlementData == null ? Optional.empty() : Optional.of(settlementData);
	}

	public ForeignExchangeOptionNotificationV02 setSettlementData(SettlementData2 settlementData) {
		this.settlementData = settlementData;
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:trea.012.001.02")
	static public class Document {
		@XmlElement(name = "FXOptnNtfctnV02", required = true)
		public ForeignExchangeOptionNotificationV02 messageBody;
	}
}