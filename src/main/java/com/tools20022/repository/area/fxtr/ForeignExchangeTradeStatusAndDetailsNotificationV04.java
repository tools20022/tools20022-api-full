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
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
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
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.ForeignExchangeTradeLatestVersion
 * ForeignExchangeTradeLatestVersion}</li>
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
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "FXTradStsAndDtlsNtfctn"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
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
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code fxtr.017.001.04}</li>
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
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "ForeignExchangeTradeStatusAndDetailsNotificationV04", propOrder = {"statusDetails", "tradeInformation", "tradingSideIdentification", "counterpartySideIdentification", "tradeAmounts", "agreedRate",
		"nonDeliverableForwardConditions", "tradingSideSettlementInstructions", "counterpartySideSettlementInstructions", "generalInformation", "splitTradeInformation", "regulatoryReporting", "supplementaryData"})
public class ForeignExchangeTradeStatusAndDetailsNotificationV04 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	protected TradeData14 statusDetails;
	/**
	 * Provides information on the status of a foreign exchange trade in the
	 * central system.
	 * <p>
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
	public static final MMMessageBuildingBlock mmStatusDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "StsDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusDetails";
			definition = "Provides information on the status of a foreign exchange trade in the central system.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> TradeData14.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ForeignExchangeTradeStatusAndDetailsNotificationV04.class.getMethod("getStatusDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected TradeAgreement12 tradeInformation;
	/**
	 * General information related to the foreign exchange trade.
	 * <p>
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
	public static final MMMessageBuildingBlock mmTradeInformation = new MMMessageBuildingBlock() {
		{
			xmlTag = "TradInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeInformation";
			definition = "General information related to the foreign exchange trade.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> TradeAgreement12.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ForeignExchangeTradeStatusAndDetailsNotificationV04.class.getMethod("getTradeInformation", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected TradePartyIdentification6 tradingSideIdentification;
	/**
	 * Party(ies) on the trading side of the foreign exchange trade.
	 * <p>
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
	public static final MMMessageBuildingBlock mmTradingSideIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "TradgSdId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingSideIdentification";
			definition = "Party(ies) on the trading side of the foreign exchange trade.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> TradePartyIdentification6.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ForeignExchangeTradeStatusAndDetailsNotificationV04.class.getMethod("getTradingSideIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected TradePartyIdentification6 counterpartySideIdentification;
	/**
	 * Party(ies) on the counterparty side of the foreign exchange trade.
	 * <p>
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
	public static final MMMessageBuildingBlock mmCounterpartySideIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "CtrPtySdId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartySideIdentification";
			definition = "Party(ies) on the counterparty side of the foreign exchange trade.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> TradePartyIdentification6.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ForeignExchangeTradeStatusAndDetailsNotificationV04.class.getMethod("getCounterpartySideIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected AmountsAndValueDate1 tradeAmounts;
	/**
	 * Amounts of the foreign exchange trade.
	 * <p>
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
	public static final MMMessageBuildingBlock mmTradeAmounts = new MMMessageBuildingBlock() {
		{
			xmlTag = "TradAmts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeAmounts";
			definition = "Amounts of the foreign exchange trade.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> AmountsAndValueDate1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ForeignExchangeTradeStatusAndDetailsNotificationV04.class.getMethod("getTradeAmounts", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected AgreedRate3 agreedRate;
	/**
	 * Exchange rate as agreed by the traders.
	 * <p>
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
	public static final MMMessageBuildingBlock mmAgreedRate = new MMMessageBuildingBlock() {
		{
			xmlTag = "AgrdRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgreedRate";
			definition = "Exchange rate as agreed by the traders.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> AgreedRate3.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ForeignExchangeTradeStatusAndDetailsNotificationV04.class.getMethod("getAgreedRate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected NonDeliverableForwardConditions2 nonDeliverableForwardConditions;
	/**
	 * Provides the opening and fixing information for an NDF trade.
	 * <p>
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
	public static final MMMessageBuildingBlock mmNonDeliverableForwardConditions = new MMMessageBuildingBlock() {
		{
			xmlTag = "NDFConds";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonDeliverableForwardConditions";
			definition = "Provides the opening and fixing information for an NDF trade.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> NonDeliverableForwardConditions2.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ForeignExchangeTradeStatusAndDetailsNotificationV04.class.getMethod("getNonDeliverableForwardConditions", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected SettlementParties29 tradingSideSettlementInstructions;
	/**
	 * Settlement instructions for the amounts received by the trading side.
	 * <p>
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
	public static final MMMessageBuildingBlock mmTradingSideSettlementInstructions = new MMMessageBuildingBlock() {
		{
			xmlTag = "TradgSdSttlmInstrs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingSideSettlementInstructions";
			definition = "Settlement instructions for the amounts received by the trading side.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SettlementParties29.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ForeignExchangeTradeStatusAndDetailsNotificationV04.class.getMethod("getTradingSideSettlementInstructions", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected SettlementParties29 counterpartySideSettlementInstructions;
	/**
	 * Settlement instructions for the amounts received by the counterparty.
	 * <p>
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
	public static final MMMessageBuildingBlock mmCounterpartySideSettlementInstructions = new MMMessageBuildingBlock() {
		{
			xmlTag = "CtrPtySdSttlmInstrs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartySideSettlementInstructions";
			definition = "Settlement instructions for the amounts received by the counterparty.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SettlementParties29.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ForeignExchangeTradeStatusAndDetailsNotificationV04.class.getMethod("getCounterpartySideSettlementInstructions", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected GeneralInformation5 generalInformation;
	/**
	 * Additional Information about the foreign exchange trade.
	 * <p>
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
	public static final MMMessageBuildingBlock mmGeneralInformation = new MMMessageBuildingBlock() {
		{
			xmlTag = "GnlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GeneralInformation";
			definition = "Additional Information about the foreign exchange trade.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> GeneralInformation5.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ForeignExchangeTradeStatusAndDetailsNotificationV04.class.getMethod("getGeneralInformation", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<SplitTradeDetails3> splitTradeInformation;
	/**
	 * Details of the split trade.
	 * <p>
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
	public static final MMMessageBuildingBlock mmSplitTradeInformation = new MMMessageBuildingBlock() {
		{
			xmlTag = "SpltTradInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SplitTradeInformation";
			definition = "Details of the split trade.";
			minOccurs = 0;
			complexType_lazy = () -> SplitTradeDetails3.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ForeignExchangeTradeStatusAndDetailsNotificationV04.class.getMethod("getSplitTradeInformation", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected RegulatoryReporting6 regulatoryReporting;
	/**
	 * Information that is to be provided to trade repositories in the context
	 * of the regulatory standards around over-the-counter (OTC) derivatives,
	 * central counterparties and trade repositories.
	 * <p>
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
	public static final MMMessageBuildingBlock mmRegulatoryReporting = new MMMessageBuildingBlock() {
		{
			xmlTag = "RgltryRptg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegulatoryReporting";
			definition = "Information that is to be provided to trade repositories in the context of the regulatory standards around over-the-counter (OTC) derivatives, central counterparties and trade repositories.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RegulatoryReporting6.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ForeignExchangeTradeStatusAndDetailsNotificationV04.class.getMethod("getRegulatoryReporting", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<SupplementaryData1> supplementaryData;
	/**
	 * Additional information that cannot be captured in the structured elements
	 * and/or any other specific block.
	 * <p>
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
				return ForeignExchangeTradeStatusAndDetailsNotificationV04.class.getMethod("getSupplementaryData", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
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

	@XmlElement(name = "StsDtls", required = true)
	public TradeData14 getStatusDetails() {
		return statusDetails;
	}

	public void setStatusDetails(TradeData14 statusDetails) {
		this.statusDetails = statusDetails;
	}

	@XmlElement(name = "TradInf", required = true)
	public TradeAgreement12 getTradeInformation() {
		return tradeInformation;
	}

	public void setTradeInformation(TradeAgreement12 tradeInformation) {
		this.tradeInformation = tradeInformation;
	}

	@XmlElement(name = "TradgSdId", required = true)
	public TradePartyIdentification6 getTradingSideIdentification() {
		return tradingSideIdentification;
	}

	public void setTradingSideIdentification(TradePartyIdentification6 tradingSideIdentification) {
		this.tradingSideIdentification = tradingSideIdentification;
	}

	@XmlElement(name = "CtrPtySdId", required = true)
	public TradePartyIdentification6 getCounterpartySideIdentification() {
		return counterpartySideIdentification;
	}

	public void setCounterpartySideIdentification(TradePartyIdentification6 counterpartySideIdentification) {
		this.counterpartySideIdentification = counterpartySideIdentification;
	}

	@XmlElement(name = "TradAmts", required = true)
	public AmountsAndValueDate1 getTradeAmounts() {
		return tradeAmounts;
	}

	public void setTradeAmounts(AmountsAndValueDate1 tradeAmounts) {
		this.tradeAmounts = tradeAmounts;
	}

	@XmlElement(name = "AgrdRate", required = true)
	public AgreedRate3 getAgreedRate() {
		return agreedRate;
	}

	public void setAgreedRate(AgreedRate3 agreedRate) {
		this.agreedRate = agreedRate;
	}

	@XmlElement(name = "NDFConds")
	public NonDeliverableForwardConditions2 getNonDeliverableForwardConditions() {
		return nonDeliverableForwardConditions;
	}

	public void setNonDeliverableForwardConditions(NonDeliverableForwardConditions2 nonDeliverableForwardConditions) {
		this.nonDeliverableForwardConditions = nonDeliverableForwardConditions;
	}

	@XmlElement(name = "TradgSdSttlmInstrs")
	public SettlementParties29 getTradingSideSettlementInstructions() {
		return tradingSideSettlementInstructions;
	}

	public void setTradingSideSettlementInstructions(SettlementParties29 tradingSideSettlementInstructions) {
		this.tradingSideSettlementInstructions = tradingSideSettlementInstructions;
	}

	@XmlElement(name = "CtrPtySdSttlmInstrs")
	public SettlementParties29 getCounterpartySideSettlementInstructions() {
		return counterpartySideSettlementInstructions;
	}

	public void setCounterpartySideSettlementInstructions(SettlementParties29 counterpartySideSettlementInstructions) {
		this.counterpartySideSettlementInstructions = counterpartySideSettlementInstructions;
	}

	@XmlElement(name = "GnlInf")
	public GeneralInformation5 getGeneralInformation() {
		return generalInformation;
	}

	public void setGeneralInformation(GeneralInformation5 generalInformation) {
		this.generalInformation = generalInformation;
	}

	@XmlElement(name = "SpltTradInf")
	public List<SplitTradeDetails3> getSplitTradeInformation() {
		return splitTradeInformation;
	}

	public void setSplitTradeInformation(List<SplitTradeDetails3> splitTradeInformation) {
		this.splitTradeInformation = splitTradeInformation;
	}

	@XmlElement(name = "RgltryRptg")
	public RegulatoryReporting6 getRegulatoryReporting() {
		return regulatoryReporting;
	}

	public void setRegulatoryReporting(RegulatoryReporting6 regulatoryReporting) {
		this.regulatoryReporting = regulatoryReporting;
	}

	@XmlElement(name = "SplmtryData")
	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData;
	}

	public void setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = supplementaryData;
	}

	@XmlRootElement(namespace = "urn:iso:std:iso:20022:tech:xsd:fxtr.017.04.04")
	static public class Document {
		@XmlElement(name = "FXTradStsAndDtlsNtfctn", required = true)
		public ForeignExchangeTradeStatusAndDetailsNotificationV04 messageBody;
	}
}