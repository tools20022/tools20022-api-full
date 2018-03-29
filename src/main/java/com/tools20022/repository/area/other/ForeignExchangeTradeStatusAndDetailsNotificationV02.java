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

package com.tools20022.repository.area.other;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.OtherMessages;
import com.tools20022.repository.msg.*;
import com.tools20022.repository.msgset.ISOArchive;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * Scope <br>
 * The ForeignExchangeTradeStatusAndDetails message is sent by a central system
 * to the participant to provide notification of the status and details of a
 * foreign exchange trade. <br>
 * Usage <br>
 * The notification is sent by a central settlement system to the two trading
 * parties after it has received foreign exchange trade instructions from both.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.other.ForeignExchangeTradeStatusAndDetailsNotificationV02#mmStatusDetails
 * ForeignExchangeTradeStatusAndDetailsNotificationV02.mmStatusDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.other.ForeignExchangeTradeStatusAndDetailsNotificationV02#mmTradeInformation
 * ForeignExchangeTradeStatusAndDetailsNotificationV02.mmTradeInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.other.ForeignExchangeTradeStatusAndDetailsNotificationV02#mmTradingSideIdentification
 * ForeignExchangeTradeStatusAndDetailsNotificationV02.
 * mmTradingSideIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.other.ForeignExchangeTradeStatusAndDetailsNotificationV02#mmCounterpartySideIdentification
 * ForeignExchangeTradeStatusAndDetailsNotificationV02.
 * mmCounterpartySideIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.other.ForeignExchangeTradeStatusAndDetailsNotificationV02#mmTradeAmounts
 * ForeignExchangeTradeStatusAndDetailsNotificationV02.mmTradeAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.other.ForeignExchangeTradeStatusAndDetailsNotificationV02#mmAgreedRate
 * ForeignExchangeTradeStatusAndDetailsNotificationV02.mmAgreedRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.other.ForeignExchangeTradeStatusAndDetailsNotificationV02#mmTradingSideSettlementInstructions
 * ForeignExchangeTradeStatusAndDetailsNotificationV02.
 * mmTradingSideSettlementInstructions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.other.ForeignExchangeTradeStatusAndDetailsNotificationV02#mmCounterpartySideSettlementInstructions
 * ForeignExchangeTradeStatusAndDetailsNotificationV02.
 * mmCounterpartySideSettlementInstructions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.other.ForeignExchangeTradeStatusAndDetailsNotificationV02#mmGeneralInformation
 * ForeignExchangeTradeStatusAndDetailsNotificationV02.mmGeneralInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.other.ForeignExchangeTradeStatusAndDetailsNotificationV02#mmSplitTradeInformation
 * ForeignExchangeTradeStatusAndDetailsNotificationV02.mmSplitTradeInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.other.ForeignExchangeTradeStatusAndDetailsNotificationV02#mmRegulatoryReporting
 * ForeignExchangeTradeStatusAndDetailsNotificationV02.mmRegulatoryReporting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.other.ForeignExchangeTradeStatusAndDetailsNotificationV02#mmSupplementaryData
 * ForeignExchangeTradeStatusAndDetailsNotificationV02.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msgset.ISOArchive ISOArchive}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "FXTradStsAndDtlsNtfctn"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} = {@linkplain com.tools20022.repository.area.OtherMessages
 * OtherMessages}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code fxtr.017.001.02}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSplitTradeFalsePresenceRule#forForeignExchangeTradeStatusAndDetailsNotificationV02
 * ConstraintSplitTradeFalsePresenceRule.
 * forForeignExchangeTradeStatusAndDetailsNotificationV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSplitTradeTruePresenceRule#forForeignExchangeTradeStatusAndDetailsNotificationV02
 * ConstraintSplitTradeTruePresenceRule.
 * forForeignExchangeTradeStatusAndDetailsNotificationV02}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ForeignExchangeTradeStatusAndDetailsNotificationV02"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\r\nThe ForeignExchangeTradeStatusAndDetails message is sent by a central system to the participant to provide notification of the status and details of a foreign exchange trade.\r\r\nUsage\r\r\nThe notification is sent by a central settlement system to the two trading parties after it has received foreign exchange trade instructions from both."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ForeignExchangeTradeStatusAndDetailsNotificationV02", propOrder = {"statusDetails", "tradeInformation", "tradingSideIdentification", "counterpartySideIdentification", "tradeAmounts", "agreedRate",
		"tradingSideSettlementInstructions", "counterpartySideSettlementInstructions", "generalInformation", "splitTradeInformation", "regulatoryReporting", "supplementaryData"})
public class ForeignExchangeTradeStatusAndDetailsNotificationV02 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "StsDtls", required = true)
	protected TradeData9 statusDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.TradeData9
	 * TradeData9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StsDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information on the status of a foreign exchange trade in the system."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ForeignExchangeTradeStatusAndDetailsNotificationV02, TradeData9> mmStatusDetails = new MMMessageBuildingBlock<ForeignExchangeTradeStatusAndDetailsNotificationV02, TradeData9>() {
		{
			xmlTag = "StsDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusDetails";
			definition = "Provides information on the status of a foreign exchange trade in the system.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> TradeData9.mmObject();
		}

		@Override
		public TradeData9 getValue(ForeignExchangeTradeStatusAndDetailsNotificationV02 obj) {
			return obj.getStatusDetails();
		}

		@Override
		public void setValue(ForeignExchangeTradeStatusAndDetailsNotificationV02 obj, TradeData9 value) {
			obj.setStatusDetails(value);
		}
	};
	@XmlElement(name = "TradInf", required = true)
	protected TradeAgreement9 tradeInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.TradeAgreement9
	 * TradeAgreement9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "General information related to the foreign exchange trade."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ForeignExchangeTradeStatusAndDetailsNotificationV02, TradeAgreement9> mmTradeInformation = new MMMessageBuildingBlock<ForeignExchangeTradeStatusAndDetailsNotificationV02, TradeAgreement9>() {
		{
			xmlTag = "TradInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeInformation";
			definition = "General information related to the foreign exchange trade.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> TradeAgreement9.mmObject();
		}

		@Override
		public TradeAgreement9 getValue(ForeignExchangeTradeStatusAndDetailsNotificationV02 obj) {
			return obj.getTradeInformation();
		}

		@Override
		public void setValue(ForeignExchangeTradeStatusAndDetailsNotificationV02 obj, TradeAgreement9 value) {
			obj.setTradeInformation(value);
		}
	};
	@XmlElement(name = "TradgSdId", required = true)
	protected TradePartyIdentification6 tradingSideIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.TradePartyIdentification6
	 * TradePartyIdentification6}</li>
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
	 * "Party(ies) on the trading side of the foreign exchange trade."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ForeignExchangeTradeStatusAndDetailsNotificationV02, TradePartyIdentification6> mmTradingSideIdentification = new MMMessageBuildingBlock<ForeignExchangeTradeStatusAndDetailsNotificationV02, TradePartyIdentification6>() {
		{
			xmlTag = "TradgSdId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingSideIdentification";
			definition = "Party(ies) on the trading side of the foreign exchange trade.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> TradePartyIdentification6.mmObject();
		}

		@Override
		public TradePartyIdentification6 getValue(ForeignExchangeTradeStatusAndDetailsNotificationV02 obj) {
			return obj.getTradingSideIdentification();
		}

		@Override
		public void setValue(ForeignExchangeTradeStatusAndDetailsNotificationV02 obj, TradePartyIdentification6 value) {
			obj.setTradingSideIdentification(value);
		}
	};
	@XmlElement(name = "CtrPtySdId", required = true)
	protected TradePartyIdentification6 counterpartySideIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.TradePartyIdentification6
	 * TradePartyIdentification6}</li>
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
	 * "Party(ies) on the counterparty side of the foreign exchange trade."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ForeignExchangeTradeStatusAndDetailsNotificationV02, TradePartyIdentification6> mmCounterpartySideIdentification = new MMMessageBuildingBlock<ForeignExchangeTradeStatusAndDetailsNotificationV02, TradePartyIdentification6>() {
		{
			xmlTag = "CtrPtySdId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartySideIdentification";
			definition = "Party(ies) on the counterparty side of the foreign exchange trade.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> TradePartyIdentification6.mmObject();
		}

		@Override
		public TradePartyIdentification6 getValue(ForeignExchangeTradeStatusAndDetailsNotificationV02 obj) {
			return obj.getCounterpartySideIdentification();
		}

		@Override
		public void setValue(ForeignExchangeTradeStatusAndDetailsNotificationV02 obj, TradePartyIdentification6 value) {
			obj.setCounterpartySideIdentification(value);
		}
	};
	@XmlElement(name = "TradAmts", required = true)
	protected AmountsAndValueDate1 tradeAmounts;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountsAndValueDate1
	 * AmountsAndValueDate1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradAmts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeAmounts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amounts of the foreign exchange trade."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ForeignExchangeTradeStatusAndDetailsNotificationV02, AmountsAndValueDate1> mmTradeAmounts = new MMMessageBuildingBlock<ForeignExchangeTradeStatusAndDetailsNotificationV02, AmountsAndValueDate1>() {
		{
			xmlTag = "TradAmts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeAmounts";
			definition = "Amounts of the foreign exchange trade.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> AmountsAndValueDate1.mmObject();
		}

		@Override
		public AmountsAndValueDate1 getValue(ForeignExchangeTradeStatusAndDetailsNotificationV02 obj) {
			return obj.getTradeAmounts();
		}

		@Override
		public void setValue(ForeignExchangeTradeStatusAndDetailsNotificationV02 obj, AmountsAndValueDate1 value) {
			obj.setTradeAmounts(value);
		}
	};
	@XmlElement(name = "AgrdRate", required = true)
	protected AgreedRate1 agreedRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.AgreedRate1
	 * AgreedRate1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AgrdRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgreedRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Exchange rate as agreed by the traders."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ForeignExchangeTradeStatusAndDetailsNotificationV02, AgreedRate1> mmAgreedRate = new MMMessageBuildingBlock<ForeignExchangeTradeStatusAndDetailsNotificationV02, AgreedRate1>() {
		{
			xmlTag = "AgrdRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgreedRate";
			definition = "Exchange rate as agreed by the traders.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> AgreedRate1.mmObject();
		}

		@Override
		public AgreedRate1 getValue(ForeignExchangeTradeStatusAndDetailsNotificationV02 obj) {
			return obj.getAgreedRate();
		}

		@Override
		public void setValue(ForeignExchangeTradeStatusAndDetailsNotificationV02 obj, AgreedRate1 value) {
			obj.setAgreedRate(value);
		}
	};
	@XmlElement(name = "TradgSdSttlmInstrs")
	protected SettlementParties29 tradingSideSettlementInstructions;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SettlementParties29
	 * SettlementParties29}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradgSdSttlmInstrs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingSideSettlementInstructions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Settlement instructions for the amounts received by the trading side."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ForeignExchangeTradeStatusAndDetailsNotificationV02, Optional<SettlementParties29>> mmTradingSideSettlementInstructions = new MMMessageBuildingBlock<ForeignExchangeTradeStatusAndDetailsNotificationV02, Optional<SettlementParties29>>() {
		{
			xmlTag = "TradgSdSttlmInstrs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingSideSettlementInstructions";
			definition = "Settlement instructions for the amounts received by the trading side.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SettlementParties29.mmObject();
		}

		@Override
		public Optional<SettlementParties29> getValue(ForeignExchangeTradeStatusAndDetailsNotificationV02 obj) {
			return obj.getTradingSideSettlementInstructions();
		}

		@Override
		public void setValue(ForeignExchangeTradeStatusAndDetailsNotificationV02 obj, Optional<SettlementParties29> value) {
			obj.setTradingSideSettlementInstructions(value.orElse(null));
		}
	};
	@XmlElement(name = "CtrPtySdSttlmInstrs")
	protected SettlementParties29 counterpartySideSettlementInstructions;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SettlementParties29
	 * SettlementParties29}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtrPtySdSttlmInstrs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterpartySideSettlementInstructions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Settlement instructions for the amounts received by the counterparty."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ForeignExchangeTradeStatusAndDetailsNotificationV02, Optional<SettlementParties29>> mmCounterpartySideSettlementInstructions = new MMMessageBuildingBlock<ForeignExchangeTradeStatusAndDetailsNotificationV02, Optional<SettlementParties29>>() {
		{
			xmlTag = "CtrPtySdSttlmInstrs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartySideSettlementInstructions";
			definition = "Settlement instructions for the amounts received by the counterparty.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SettlementParties29.mmObject();
		}

		@Override
		public Optional<SettlementParties29> getValue(ForeignExchangeTradeStatusAndDetailsNotificationV02 obj) {
			return obj.getCounterpartySideSettlementInstructions();
		}

		@Override
		public void setValue(ForeignExchangeTradeStatusAndDetailsNotificationV02 obj, Optional<SettlementParties29> value) {
			obj.setCounterpartySideSettlementInstructions(value.orElse(null));
		}
	};
	@XmlElement(name = "GnlInf")
	protected GeneralInformation4 generalInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.GeneralInformation4
	 * GeneralInformation4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GnlInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GeneralInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Additional Information about the foreign exchange trade."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ForeignExchangeTradeStatusAndDetailsNotificationV02, Optional<GeneralInformation4>> mmGeneralInformation = new MMMessageBuildingBlock<ForeignExchangeTradeStatusAndDetailsNotificationV02, Optional<GeneralInformation4>>() {
		{
			xmlTag = "GnlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GeneralInformation";
			definition = "Additional Information about the foreign exchange trade.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> GeneralInformation4.mmObject();
		}

		@Override
		public Optional<GeneralInformation4> getValue(ForeignExchangeTradeStatusAndDetailsNotificationV02 obj) {
			return obj.getGeneralInformation();
		}

		@Override
		public void setValue(ForeignExchangeTradeStatusAndDetailsNotificationV02 obj, Optional<GeneralInformation4> value) {
			obj.setGeneralInformation(value.orElse(null));
		}
	};
	@XmlElement(name = "SpltTradInf")
	protected List<SplitTradeDetails1> splitTradeInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SplitTradeDetails1
	 * SplitTradeDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SpltTradInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SplitTradeInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details of the split trade."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ForeignExchangeTradeStatusAndDetailsNotificationV02, List<SplitTradeDetails1>> mmSplitTradeInformation = new MMMessageBuildingBlock<ForeignExchangeTradeStatusAndDetailsNotificationV02, List<SplitTradeDetails1>>() {
		{
			xmlTag = "SpltTradInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SplitTradeInformation";
			definition = "Details of the split trade.";
			minOccurs = 0;
			complexType_lazy = () -> SplitTradeDetails1.mmObject();
		}

		@Override
		public List<SplitTradeDetails1> getValue(ForeignExchangeTradeStatusAndDetailsNotificationV02 obj) {
			return obj.getSplitTradeInformation();
		}

		@Override
		public void setValue(ForeignExchangeTradeStatusAndDetailsNotificationV02 obj, List<SplitTradeDetails1> value) {
			obj.setSplitTradeInformation(value);
		}
	};
	@XmlElement(name = "RgltryRptg")
	protected RegulatoryReporting1 regulatoryReporting;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting1
	 * RegulatoryReporting1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RgltryRptg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegulatoryReporting"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "This is information that is to be provided to trade repositories in the context of the regulatory standards around OTC derivatives, central counterparties and trade repositories."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ForeignExchangeTradeStatusAndDetailsNotificationV02, Optional<RegulatoryReporting1>> mmRegulatoryReporting = new MMMessageBuildingBlock<ForeignExchangeTradeStatusAndDetailsNotificationV02, Optional<RegulatoryReporting1>>() {
		{
			xmlTag = "RgltryRptg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegulatoryReporting";
			definition = "This is information that is to be provided to trade repositories in the context of the regulatory standards around OTC derivatives, central counterparties and trade repositories.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RegulatoryReporting1.mmObject();
		}

		@Override
		public Optional<RegulatoryReporting1> getValue(ForeignExchangeTradeStatusAndDetailsNotificationV02 obj) {
			return obj.getRegulatoryReporting();
		}

		@Override
		public void setValue(ForeignExchangeTradeStatusAndDetailsNotificationV02 obj, Optional<RegulatoryReporting1> value) {
			obj.setRegulatoryReporting(value.orElse(null));
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
	public static final MMMessageBuildingBlock<ForeignExchangeTradeStatusAndDetailsNotificationV02, List<SupplementaryData1>> mmSupplementaryData = new MMMessageBuildingBlock<ForeignExchangeTradeStatusAndDetailsNotificationV02, List<SupplementaryData1>>() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(ForeignExchangeTradeStatusAndDetailsNotificationV02 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(ForeignExchangeTradeStatusAndDetailsNotificationV02 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSplitTradeFalsePresenceRule.forForeignExchangeTradeStatusAndDetailsNotificationV02,
						com.tools20022.repository.constraints.ConstraintSplitTradeTruePresenceRule.forForeignExchangeTradeStatusAndDetailsNotificationV02);
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "ForeignExchangeTradeStatusAndDetailsNotificationV02";
				definition = "Scope\r\r\nThe ForeignExchangeTradeStatusAndDetails message is sent by a central system to the participant to provide notification of the status and details of a foreign exchange trade.\r\r\nUsage\r\r\nThe notification is sent by a central settlement system to the two trading parties after it has received foreign exchange trade instructions from both.";
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "FXTradStsAndDtlsNtfctn";
				businessArea_lazy = () -> OtherMessages.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.other.ForeignExchangeTradeStatusAndDetailsNotificationV02.mmStatusDetails,
						com.tools20022.repository.area.other.ForeignExchangeTradeStatusAndDetailsNotificationV02.mmTradeInformation,
						com.tools20022.repository.area.other.ForeignExchangeTradeStatusAndDetailsNotificationV02.mmTradingSideIdentification,
						com.tools20022.repository.area.other.ForeignExchangeTradeStatusAndDetailsNotificationV02.mmCounterpartySideIdentification,
						com.tools20022.repository.area.other.ForeignExchangeTradeStatusAndDetailsNotificationV02.mmTradeAmounts, com.tools20022.repository.area.other.ForeignExchangeTradeStatusAndDetailsNotificationV02.mmAgreedRate,
						com.tools20022.repository.area.other.ForeignExchangeTradeStatusAndDetailsNotificationV02.mmTradingSideSettlementInstructions,
						com.tools20022.repository.area.other.ForeignExchangeTradeStatusAndDetailsNotificationV02.mmCounterpartySideSettlementInstructions,
						com.tools20022.repository.area.other.ForeignExchangeTradeStatusAndDetailsNotificationV02.mmGeneralInformation,
						com.tools20022.repository.area.other.ForeignExchangeTradeStatusAndDetailsNotificationV02.mmSplitTradeInformation,
						com.tools20022.repository.area.other.ForeignExchangeTradeStatusAndDetailsNotificationV02.mmRegulatoryReporting,
						com.tools20022.repository.area.other.ForeignExchangeTradeStatusAndDetailsNotificationV02.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "fxtr";
						messageFunctionality = "017";
						version = "02";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return ForeignExchangeTradeStatusAndDetailsNotificationV02.class;
			}
		});
		return mmObject_lazy.get();
	}

	public TradeData9 getStatusDetails() {
		return statusDetails;
	}

	public ForeignExchangeTradeStatusAndDetailsNotificationV02 setStatusDetails(TradeData9 statusDetails) {
		this.statusDetails = Objects.requireNonNull(statusDetails);
		return this;
	}

	public TradeAgreement9 getTradeInformation() {
		return tradeInformation;
	}

	public ForeignExchangeTradeStatusAndDetailsNotificationV02 setTradeInformation(TradeAgreement9 tradeInformation) {
		this.tradeInformation = Objects.requireNonNull(tradeInformation);
		return this;
	}

	public TradePartyIdentification6 getTradingSideIdentification() {
		return tradingSideIdentification;
	}

	public ForeignExchangeTradeStatusAndDetailsNotificationV02 setTradingSideIdentification(TradePartyIdentification6 tradingSideIdentification) {
		this.tradingSideIdentification = Objects.requireNonNull(tradingSideIdentification);
		return this;
	}

	public TradePartyIdentification6 getCounterpartySideIdentification() {
		return counterpartySideIdentification;
	}

	public ForeignExchangeTradeStatusAndDetailsNotificationV02 setCounterpartySideIdentification(TradePartyIdentification6 counterpartySideIdentification) {
		this.counterpartySideIdentification = Objects.requireNonNull(counterpartySideIdentification);
		return this;
	}

	public AmountsAndValueDate1 getTradeAmounts() {
		return tradeAmounts;
	}

	public ForeignExchangeTradeStatusAndDetailsNotificationV02 setTradeAmounts(AmountsAndValueDate1 tradeAmounts) {
		this.tradeAmounts = Objects.requireNonNull(tradeAmounts);
		return this;
	}

	public AgreedRate1 getAgreedRate() {
		return agreedRate;
	}

	public ForeignExchangeTradeStatusAndDetailsNotificationV02 setAgreedRate(AgreedRate1 agreedRate) {
		this.agreedRate = Objects.requireNonNull(agreedRate);
		return this;
	}

	public Optional<SettlementParties29> getTradingSideSettlementInstructions() {
		return tradingSideSettlementInstructions == null ? Optional.empty() : Optional.of(tradingSideSettlementInstructions);
	}

	public ForeignExchangeTradeStatusAndDetailsNotificationV02 setTradingSideSettlementInstructions(SettlementParties29 tradingSideSettlementInstructions) {
		this.tradingSideSettlementInstructions = tradingSideSettlementInstructions;
		return this;
	}

	public Optional<SettlementParties29> getCounterpartySideSettlementInstructions() {
		return counterpartySideSettlementInstructions == null ? Optional.empty() : Optional.of(counterpartySideSettlementInstructions);
	}

	public ForeignExchangeTradeStatusAndDetailsNotificationV02 setCounterpartySideSettlementInstructions(SettlementParties29 counterpartySideSettlementInstructions) {
		this.counterpartySideSettlementInstructions = counterpartySideSettlementInstructions;
		return this;
	}

	public Optional<GeneralInformation4> getGeneralInformation() {
		return generalInformation == null ? Optional.empty() : Optional.of(generalInformation);
	}

	public ForeignExchangeTradeStatusAndDetailsNotificationV02 setGeneralInformation(GeneralInformation4 generalInformation) {
		this.generalInformation = generalInformation;
		return this;
	}

	public List<SplitTradeDetails1> getSplitTradeInformation() {
		return splitTradeInformation == null ? splitTradeInformation = new ArrayList<>() : splitTradeInformation;
	}

	public ForeignExchangeTradeStatusAndDetailsNotificationV02 setSplitTradeInformation(List<SplitTradeDetails1> splitTradeInformation) {
		this.splitTradeInformation = Objects.requireNonNull(splitTradeInformation);
		return this;
	}

	public Optional<RegulatoryReporting1> getRegulatoryReporting() {
		return regulatoryReporting == null ? Optional.empty() : Optional.of(regulatoryReporting);
	}

	public ForeignExchangeTradeStatusAndDetailsNotificationV02 setRegulatoryReporting(RegulatoryReporting1 regulatoryReporting) {
		this.regulatoryReporting = regulatoryReporting;
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public ForeignExchangeTradeStatusAndDetailsNotificationV02 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:fxtr.017.001.02")
	static public class Document {
		@XmlElement(name = "FXTradStsAndDtlsNtfctn", required = true)
		public ForeignExchangeTradeStatusAndDetailsNotificationV02 messageBody;
	}
}