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
import com.tools20022.repository.msg.*;
import com.tools20022.repository.msgset.PostTradeForeignExchangeISOLatestversion;
import com.tools20022.repository.msgset.PostTradeForeignExchangeMaintenance20162017;
import com.tools20022.repository.msgset.PostTradeForeignExchangeMaintenance20162017andSupplement;
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
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeStatusAndDetailsNotificationV04#mmStatusDetails
 * ForeignExchangeTradeStatusAndDetailsNotificationV04.mmStatusDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeStatusAndDetailsNotificationV04#mmTradeInformation
 * ForeignExchangeTradeStatusAndDetailsNotificationV04.mmTradeInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeStatusAndDetailsNotificationV04#mmTradingSideIdentification
 * ForeignExchangeTradeStatusAndDetailsNotificationV04.
 * mmTradingSideIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeStatusAndDetailsNotificationV04#mmCounterpartySideIdentification
 * ForeignExchangeTradeStatusAndDetailsNotificationV04.
 * mmCounterpartySideIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeStatusAndDetailsNotificationV04#mmTradeAmounts
 * ForeignExchangeTradeStatusAndDetailsNotificationV04.mmTradeAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeStatusAndDetailsNotificationV04#mmAgreedRate
 * ForeignExchangeTradeStatusAndDetailsNotificationV04.mmAgreedRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeStatusAndDetailsNotificationV04#mmNonDeliverableForwardConditions
 * ForeignExchangeTradeStatusAndDetailsNotificationV04.
 * mmNonDeliverableForwardConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeStatusAndDetailsNotificationV04#mmTradingSideSettlementInstructions
 * ForeignExchangeTradeStatusAndDetailsNotificationV04.
 * mmTradingSideSettlementInstructions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeStatusAndDetailsNotificationV04#mmCounterpartySideSettlementInstructions
 * ForeignExchangeTradeStatusAndDetailsNotificationV04.
 * mmCounterpartySideSettlementInstructions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeStatusAndDetailsNotificationV04#mmGeneralInformation
 * ForeignExchangeTradeStatusAndDetailsNotificationV04.mmGeneralInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeStatusAndDetailsNotificationV04#mmSplitTradeInformation
 * ForeignExchangeTradeStatusAndDetailsNotificationV04.mmSplitTradeInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeStatusAndDetailsNotificationV04#mmRegulatoryReporting
 * ForeignExchangeTradeStatusAndDetailsNotificationV04.mmRegulatoryReporting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeStatusAndDetailsNotificationV04#mmSupplementaryData
 * ForeignExchangeTradeStatusAndDetailsNotificationV04.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.PostTradeForeignExchangeISOLatestversion
 * PostTradeForeignExchangeISOLatestversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.PostTradeForeignExchangeMaintenance20162017
 * PostTradeForeignExchangeMaintenance20162017}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.PostTradeForeignExchangeMaintenance20162017andSupplement
 * PostTradeForeignExchangeMaintenance20162017andSupplement}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "FXTradStsAndDtlsNtfctn"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.ForeignExchangeTradeLatestVersion
 * ForeignExchangeTradeLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code fxtr.017.001.04}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSplitTradeFalsePresenceRule#for_fxtr_ForeignExchangeTradeStatusAndDetailsNotificationV04
 * ConstraintSplitTradeFalsePresenceRule.
 * for_fxtr_ForeignExchangeTradeStatusAndDetailsNotificationV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSplitTradeTruePresenceRule#for_fxtr_ForeignExchangeTradeStatusAndDetailsNotificationV04
 * ConstraintSplitTradeTruePresenceRule.
 * for_fxtr_ForeignExchangeTradeStatusAndDetailsNotificationV04}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ForeignExchangeTradeStatusAndDetailsNotificationV04"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\r\nThe ForeignExchangeTradeStatusAndDetails message is sent by a central system to the participant to provide notification of the status and details of a foreign exchange trade.\r\r\nUsage\r\r\nThe notification is sent by a central settlement system to the two trading parties after it has received foreign exchange trade instructions from both."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ForeignExchangeTradeStatusAndDetailsNotificationV04", propOrder = {"statusDetails", "tradeInformation", "tradingSideIdentification", "counterpartySideIdentification", "tradeAmounts", "agreedRate",
		"nonDeliverableForwardConditions", "tradingSideSettlementInstructions", "counterpartySideSettlementInstructions", "generalInformation", "splitTradeInformation", "regulatoryReporting", "supplementaryData"})
public class ForeignExchangeTradeStatusAndDetailsNotificationV04 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "StsDtls", required = true)
	protected TradeData14 statusDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.TradeData14
	 * TradeData14}</li>
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
	 * "Provides information on the status of a foreign exchange trade in the central system."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ForeignExchangeTradeStatusAndDetailsNotificationV04, TradeData14> mmStatusDetails = new MMMessageBuildingBlock<ForeignExchangeTradeStatusAndDetailsNotificationV04, TradeData14>() {
		{
			xmlTag = "StsDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusDetails";
			definition = "Provides information on the status of a foreign exchange trade in the central system.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> TradeData14.mmObject();
		}

		@Override
		public TradeData14 getValue(ForeignExchangeTradeStatusAndDetailsNotificationV04 obj) {
			return obj.getStatusDetails();
		}

		@Override
		public void setValue(ForeignExchangeTradeStatusAndDetailsNotificationV04 obj, TradeData14 value) {
			obj.setStatusDetails(value);
		}
	};
	@XmlElement(name = "TradInf", required = true)
	protected TradeAgreement12 tradeInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement12
	 * TradeAgreement12}</li>
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
	public static final MMMessageBuildingBlock<ForeignExchangeTradeStatusAndDetailsNotificationV04, TradeAgreement12> mmTradeInformation = new MMMessageBuildingBlock<ForeignExchangeTradeStatusAndDetailsNotificationV04, TradeAgreement12>() {
		{
			xmlTag = "TradInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeInformation";
			definition = "General information related to the foreign exchange trade.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> TradeAgreement12.mmObject();
		}

		@Override
		public TradeAgreement12 getValue(ForeignExchangeTradeStatusAndDetailsNotificationV04 obj) {
			return obj.getTradeInformation();
		}

		@Override
		public void setValue(ForeignExchangeTradeStatusAndDetailsNotificationV04 obj, TradeAgreement12 value) {
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
	public static final MMMessageBuildingBlock<ForeignExchangeTradeStatusAndDetailsNotificationV04, TradePartyIdentification6> mmTradingSideIdentification = new MMMessageBuildingBlock<ForeignExchangeTradeStatusAndDetailsNotificationV04, TradePartyIdentification6>() {
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
		public TradePartyIdentification6 getValue(ForeignExchangeTradeStatusAndDetailsNotificationV04 obj) {
			return obj.getTradingSideIdentification();
		}

		@Override
		public void setValue(ForeignExchangeTradeStatusAndDetailsNotificationV04 obj, TradePartyIdentification6 value) {
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
	public static final MMMessageBuildingBlock<ForeignExchangeTradeStatusAndDetailsNotificationV04, TradePartyIdentification6> mmCounterpartySideIdentification = new MMMessageBuildingBlock<ForeignExchangeTradeStatusAndDetailsNotificationV04, TradePartyIdentification6>() {
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
		public TradePartyIdentification6 getValue(ForeignExchangeTradeStatusAndDetailsNotificationV04 obj) {
			return obj.getCounterpartySideIdentification();
		}

		@Override
		public void setValue(ForeignExchangeTradeStatusAndDetailsNotificationV04 obj, TradePartyIdentification6 value) {
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
	public static final MMMessageBuildingBlock<ForeignExchangeTradeStatusAndDetailsNotificationV04, AmountsAndValueDate1> mmTradeAmounts = new MMMessageBuildingBlock<ForeignExchangeTradeStatusAndDetailsNotificationV04, AmountsAndValueDate1>() {
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
		public AmountsAndValueDate1 getValue(ForeignExchangeTradeStatusAndDetailsNotificationV04 obj) {
			return obj.getTradeAmounts();
		}

		@Override
		public void setValue(ForeignExchangeTradeStatusAndDetailsNotificationV04 obj, AmountsAndValueDate1 value) {
			obj.setTradeAmounts(value);
		}
	};
	@XmlElement(name = "AgrdRate", required = true)
	protected AgreedRate3 agreedRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.AgreedRate3
	 * AgreedRate3}</li>
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
	public static final MMMessageBuildingBlock<ForeignExchangeTradeStatusAndDetailsNotificationV04, AgreedRate3> mmAgreedRate = new MMMessageBuildingBlock<ForeignExchangeTradeStatusAndDetailsNotificationV04, AgreedRate3>() {
		{
			xmlTag = "AgrdRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgreedRate";
			definition = "Exchange rate as agreed by the traders.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> AgreedRate3.mmObject();
		}

		@Override
		public AgreedRate3 getValue(ForeignExchangeTradeStatusAndDetailsNotificationV04 obj) {
			return obj.getAgreedRate();
		}

		@Override
		public void setValue(ForeignExchangeTradeStatusAndDetailsNotificationV04 obj, AgreedRate3 value) {
			obj.setAgreedRate(value);
		}
	};
	@XmlElement(name = "NDFConds")
	protected NonDeliverableForwardConditions2 nonDeliverableForwardConditions;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.NonDeliverableForwardConditions2
	 * NonDeliverableForwardConditions2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NDFConds"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonDeliverableForwardConditions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the opening and fixing information for an NDF trade."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ForeignExchangeTradeStatusAndDetailsNotificationV04, Optional<NonDeliverableForwardConditions2>> mmNonDeliverableForwardConditions = new MMMessageBuildingBlock<ForeignExchangeTradeStatusAndDetailsNotificationV04, Optional<NonDeliverableForwardConditions2>>() {
		{
			xmlTag = "NDFConds";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonDeliverableForwardConditions";
			definition = "Provides the opening and fixing information for an NDF trade.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> NonDeliverableForwardConditions2.mmObject();
		}

		@Override
		public Optional<NonDeliverableForwardConditions2> getValue(ForeignExchangeTradeStatusAndDetailsNotificationV04 obj) {
			return obj.getNonDeliverableForwardConditions();
		}

		@Override
		public void setValue(ForeignExchangeTradeStatusAndDetailsNotificationV04 obj, Optional<NonDeliverableForwardConditions2> value) {
			obj.setNonDeliverableForwardConditions(value.orElse(null));
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
	public static final MMMessageBuildingBlock<ForeignExchangeTradeStatusAndDetailsNotificationV04, Optional<SettlementParties29>> mmTradingSideSettlementInstructions = new MMMessageBuildingBlock<ForeignExchangeTradeStatusAndDetailsNotificationV04, Optional<SettlementParties29>>() {
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
		public Optional<SettlementParties29> getValue(ForeignExchangeTradeStatusAndDetailsNotificationV04 obj) {
			return obj.getTradingSideSettlementInstructions();
		}

		@Override
		public void setValue(ForeignExchangeTradeStatusAndDetailsNotificationV04 obj, Optional<SettlementParties29> value) {
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
	public static final MMMessageBuildingBlock<ForeignExchangeTradeStatusAndDetailsNotificationV04, Optional<SettlementParties29>> mmCounterpartySideSettlementInstructions = new MMMessageBuildingBlock<ForeignExchangeTradeStatusAndDetailsNotificationV04, Optional<SettlementParties29>>() {
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
		public Optional<SettlementParties29> getValue(ForeignExchangeTradeStatusAndDetailsNotificationV04 obj) {
			return obj.getCounterpartySideSettlementInstructions();
		}

		@Override
		public void setValue(ForeignExchangeTradeStatusAndDetailsNotificationV04 obj, Optional<SettlementParties29> value) {
			obj.setCounterpartySideSettlementInstructions(value.orElse(null));
		}
	};
	@XmlElement(name = "GnlInf")
	protected GeneralInformation5 generalInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.GeneralInformation5
	 * GeneralInformation5}</li>
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
	public static final MMMessageBuildingBlock<ForeignExchangeTradeStatusAndDetailsNotificationV04, Optional<GeneralInformation5>> mmGeneralInformation = new MMMessageBuildingBlock<ForeignExchangeTradeStatusAndDetailsNotificationV04, Optional<GeneralInformation5>>() {
		{
			xmlTag = "GnlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GeneralInformation";
			definition = "Additional Information about the foreign exchange trade.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> GeneralInformation5.mmObject();
		}

		@Override
		public Optional<GeneralInformation5> getValue(ForeignExchangeTradeStatusAndDetailsNotificationV04 obj) {
			return obj.getGeneralInformation();
		}

		@Override
		public void setValue(ForeignExchangeTradeStatusAndDetailsNotificationV04 obj, Optional<GeneralInformation5> value) {
			obj.setGeneralInformation(value.orElse(null));
		}
	};
	@XmlElement(name = "SpltTradInf")
	protected List<SplitTradeDetails3> splitTradeInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SplitTradeDetails3
	 * SplitTradeDetails3}</li>
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
	public static final MMMessageBuildingBlock<ForeignExchangeTradeStatusAndDetailsNotificationV04, List<SplitTradeDetails3>> mmSplitTradeInformation = new MMMessageBuildingBlock<ForeignExchangeTradeStatusAndDetailsNotificationV04, List<SplitTradeDetails3>>() {
		{
			xmlTag = "SpltTradInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SplitTradeInformation";
			definition = "Details of the split trade.";
			minOccurs = 0;
			complexType_lazy = () -> SplitTradeDetails3.mmObject();
		}

		@Override
		public List<SplitTradeDetails3> getValue(ForeignExchangeTradeStatusAndDetailsNotificationV04 obj) {
			return obj.getSplitTradeInformation();
		}

		@Override
		public void setValue(ForeignExchangeTradeStatusAndDetailsNotificationV04 obj, List<SplitTradeDetails3> value) {
			obj.setSplitTradeInformation(value);
		}
	};
	@XmlElement(name = "RgltryRptg")
	protected RegulatoryReporting6 regulatoryReporting;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting6
	 * RegulatoryReporting6}</li>
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
	 * "Information that is to be provided to trade repositories in the context of the regulatory standards around over-the-counter (OTC) derivatives, central counterparties and trade repositories."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ForeignExchangeTradeStatusAndDetailsNotificationV04, Optional<RegulatoryReporting6>> mmRegulatoryReporting = new MMMessageBuildingBlock<ForeignExchangeTradeStatusAndDetailsNotificationV04, Optional<RegulatoryReporting6>>() {
		{
			xmlTag = "RgltryRptg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegulatoryReporting";
			definition = "Information that is to be provided to trade repositories in the context of the regulatory standards around over-the-counter (OTC) derivatives, central counterparties and trade repositories.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RegulatoryReporting6.mmObject();
		}

		@Override
		public Optional<RegulatoryReporting6> getValue(ForeignExchangeTradeStatusAndDetailsNotificationV04 obj) {
			return obj.getRegulatoryReporting();
		}

		@Override
		public void setValue(ForeignExchangeTradeStatusAndDetailsNotificationV04 obj, Optional<RegulatoryReporting6> value) {
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
	public static final MMMessageBuildingBlock<ForeignExchangeTradeStatusAndDetailsNotificationV04, List<SupplementaryData1>> mmSupplementaryData = new MMMessageBuildingBlock<ForeignExchangeTradeStatusAndDetailsNotificationV04, List<SupplementaryData1>>() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(ForeignExchangeTradeStatusAndDetailsNotificationV04 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(ForeignExchangeTradeStatusAndDetailsNotificationV04 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSplitTradeFalsePresenceRule.for_fxtr_ForeignExchangeTradeStatusAndDetailsNotificationV04,
						com.tools20022.repository.constraints.ConstraintSplitTradeTruePresenceRule.for_fxtr_ForeignExchangeTradeStatusAndDetailsNotificationV04);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ForeignExchangeTradeStatusAndDetailsNotificationV04";
				definition = "Scope\r\r\nThe ForeignExchangeTradeStatusAndDetails message is sent by a central system to the participant to provide notification of the status and details of a foreign exchange trade.\r\r\nUsage\r\r\nThe notification is sent by a central settlement system to the two trading parties after it has received foreign exchange trade instructions from both.";
				messageSet_lazy = () -> Arrays.asList(PostTradeForeignExchangeISOLatestversion.mmObject(), PostTradeForeignExchangeMaintenance20162017.mmObject(), PostTradeForeignExchangeMaintenance20162017andSupplement.mmObject());
				rootElement = "Document";
				xmlTag = "FXTradStsAndDtlsNtfctn";
				businessArea_lazy = () -> ForeignExchangeTradeLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.fxtr.ForeignExchangeTradeStatusAndDetailsNotificationV04.mmStatusDetails,
						com.tools20022.repository.area.fxtr.ForeignExchangeTradeStatusAndDetailsNotificationV04.mmTradeInformation,
						com.tools20022.repository.area.fxtr.ForeignExchangeTradeStatusAndDetailsNotificationV04.mmTradingSideIdentification,
						com.tools20022.repository.area.fxtr.ForeignExchangeTradeStatusAndDetailsNotificationV04.mmCounterpartySideIdentification,
						com.tools20022.repository.area.fxtr.ForeignExchangeTradeStatusAndDetailsNotificationV04.mmTradeAmounts, com.tools20022.repository.area.fxtr.ForeignExchangeTradeStatusAndDetailsNotificationV04.mmAgreedRate,
						com.tools20022.repository.area.fxtr.ForeignExchangeTradeStatusAndDetailsNotificationV04.mmNonDeliverableForwardConditions,
						com.tools20022.repository.area.fxtr.ForeignExchangeTradeStatusAndDetailsNotificationV04.mmTradingSideSettlementInstructions,
						com.tools20022.repository.area.fxtr.ForeignExchangeTradeStatusAndDetailsNotificationV04.mmCounterpartySideSettlementInstructions,
						com.tools20022.repository.area.fxtr.ForeignExchangeTradeStatusAndDetailsNotificationV04.mmGeneralInformation,
						com.tools20022.repository.area.fxtr.ForeignExchangeTradeStatusAndDetailsNotificationV04.mmSplitTradeInformation,
						com.tools20022.repository.area.fxtr.ForeignExchangeTradeStatusAndDetailsNotificationV04.mmRegulatoryReporting,
						com.tools20022.repository.area.fxtr.ForeignExchangeTradeStatusAndDetailsNotificationV04.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "fxtr";
						messageFunctionality = "017";
						version = "04";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return ForeignExchangeTradeStatusAndDetailsNotificationV04.class;
			}
		});
		return mmObject_lazy.get();
	}

	public TradeData14 getStatusDetails() {
		return statusDetails;
	}

	public ForeignExchangeTradeStatusAndDetailsNotificationV04 setStatusDetails(TradeData14 statusDetails) {
		this.statusDetails = Objects.requireNonNull(statusDetails);
		return this;
	}

	public TradeAgreement12 getTradeInformation() {
		return tradeInformation;
	}

	public ForeignExchangeTradeStatusAndDetailsNotificationV04 setTradeInformation(TradeAgreement12 tradeInformation) {
		this.tradeInformation = Objects.requireNonNull(tradeInformation);
		return this;
	}

	public TradePartyIdentification6 getTradingSideIdentification() {
		return tradingSideIdentification;
	}

	public ForeignExchangeTradeStatusAndDetailsNotificationV04 setTradingSideIdentification(TradePartyIdentification6 tradingSideIdentification) {
		this.tradingSideIdentification = Objects.requireNonNull(tradingSideIdentification);
		return this;
	}

	public TradePartyIdentification6 getCounterpartySideIdentification() {
		return counterpartySideIdentification;
	}

	public ForeignExchangeTradeStatusAndDetailsNotificationV04 setCounterpartySideIdentification(TradePartyIdentification6 counterpartySideIdentification) {
		this.counterpartySideIdentification = Objects.requireNonNull(counterpartySideIdentification);
		return this;
	}

	public AmountsAndValueDate1 getTradeAmounts() {
		return tradeAmounts;
	}

	public ForeignExchangeTradeStatusAndDetailsNotificationV04 setTradeAmounts(AmountsAndValueDate1 tradeAmounts) {
		this.tradeAmounts = Objects.requireNonNull(tradeAmounts);
		return this;
	}

	public AgreedRate3 getAgreedRate() {
		return agreedRate;
	}

	public ForeignExchangeTradeStatusAndDetailsNotificationV04 setAgreedRate(AgreedRate3 agreedRate) {
		this.agreedRate = Objects.requireNonNull(agreedRate);
		return this;
	}

	public Optional<NonDeliverableForwardConditions2> getNonDeliverableForwardConditions() {
		return nonDeliverableForwardConditions == null ? Optional.empty() : Optional.of(nonDeliverableForwardConditions);
	}

	public ForeignExchangeTradeStatusAndDetailsNotificationV04 setNonDeliverableForwardConditions(NonDeliverableForwardConditions2 nonDeliverableForwardConditions) {
		this.nonDeliverableForwardConditions = nonDeliverableForwardConditions;
		return this;
	}

	public Optional<SettlementParties29> getTradingSideSettlementInstructions() {
		return tradingSideSettlementInstructions == null ? Optional.empty() : Optional.of(tradingSideSettlementInstructions);
	}

	public ForeignExchangeTradeStatusAndDetailsNotificationV04 setTradingSideSettlementInstructions(SettlementParties29 tradingSideSettlementInstructions) {
		this.tradingSideSettlementInstructions = tradingSideSettlementInstructions;
		return this;
	}

	public Optional<SettlementParties29> getCounterpartySideSettlementInstructions() {
		return counterpartySideSettlementInstructions == null ? Optional.empty() : Optional.of(counterpartySideSettlementInstructions);
	}

	public ForeignExchangeTradeStatusAndDetailsNotificationV04 setCounterpartySideSettlementInstructions(SettlementParties29 counterpartySideSettlementInstructions) {
		this.counterpartySideSettlementInstructions = counterpartySideSettlementInstructions;
		return this;
	}

	public Optional<GeneralInformation5> getGeneralInformation() {
		return generalInformation == null ? Optional.empty() : Optional.of(generalInformation);
	}

	public ForeignExchangeTradeStatusAndDetailsNotificationV04 setGeneralInformation(GeneralInformation5 generalInformation) {
		this.generalInformation = generalInformation;
		return this;
	}

	public List<SplitTradeDetails3> getSplitTradeInformation() {
		return splitTradeInformation == null ? splitTradeInformation = new ArrayList<>() : splitTradeInformation;
	}

	public ForeignExchangeTradeStatusAndDetailsNotificationV04 setSplitTradeInformation(List<SplitTradeDetails3> splitTradeInformation) {
		this.splitTradeInformation = Objects.requireNonNull(splitTradeInformation);
		return this;
	}

	public Optional<RegulatoryReporting6> getRegulatoryReporting() {
		return regulatoryReporting == null ? Optional.empty() : Optional.of(regulatoryReporting);
	}

	public ForeignExchangeTradeStatusAndDetailsNotificationV04 setRegulatoryReporting(RegulatoryReporting6 regulatoryReporting) {
		this.regulatoryReporting = regulatoryReporting;
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public ForeignExchangeTradeStatusAndDetailsNotificationV04 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:fxtr.017.001.04")
	static public class Document {
		@XmlElement(name = "FXTradStsAndDtlsNtfctn", required = true)
		public ForeignExchangeTradeStatusAndDetailsNotificationV04 messageBody;
	}
}