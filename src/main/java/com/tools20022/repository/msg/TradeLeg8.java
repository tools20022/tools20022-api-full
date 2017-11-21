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

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.secl.TradeLegNotificationCancellationV03;
import com.tools20022.repository.area.secl.TradeLegNotificationV03;
import com.tools20022.repository.choice.DateFormat15Choice;
import com.tools20022.repository.choice.FinancialInstrumentQuantity1Choice;
import com.tools20022.repository.choice.PartyIdentification35Choice;
import com.tools20022.repository.choice.SafekeepingPlaceFormat7Choice;
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides the trade leg details.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeLeg8#mmTradeLegIdentification
 * TradeLeg8.mmTradeLegIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeLeg8#mmTradeIdentification
 * TradeLeg8.mmTradeIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeLeg8#mmTradeExecutionIdentification
 * TradeLeg8.mmTradeExecutionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeLeg8#mmOrderIdentification
 * TradeLeg8.mmOrderIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeLeg8#mmAllocationIdentification
 * TradeLeg8.mmAllocationIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg8#mmStatus
 * TradeLeg8.mmStatus}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg8#mmTradeDate
 * TradeLeg8.mmTradeDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeLeg8#mmTransactionDateTime
 * TradeLeg8.mmTransactionDateTime}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg8#mmSettlementDate
 * TradeLeg8.mmSettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeLeg8#mmFinancialInstrumentIdentification
 * TradeLeg8.mmFinancialInstrumentIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg8#mmTradingCurrency
 * TradeLeg8.mmTradingCurrency}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg8#mmBuySellIndicator
 * TradeLeg8.mmBuySellIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg8#mmTradeQuantity
 * TradeLeg8.mmTradeQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg8#mmDealPrice
 * TradeLeg8.mmDealPrice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg8#mmGrossAmount
 * TradeLeg8.mmGrossAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeLeg8#mmAccruedInterestAmount
 * TradeLeg8.mmAccruedInterestAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg8#mmPlaceOfTrade
 * TradeLeg8.mmPlaceOfTrade}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg8#mmPlaceOfListing
 * TradeLeg8.mmPlaceOfListing}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg8#mmTradeType
 * TradeLeg8.mmTradeType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeLeg8#mmDerivativeRelatedTrade
 * TradeLeg8.mmDerivativeRelatedTrade}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg8#mmBroker
 * TradeLeg8.mmBroker}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg8#mmTradingParty
 * TradeLeg8.mmTradingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeLeg8#mmTradeRegistrationOrigin
 * TradeLeg8.mmTradeRegistrationOrigin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeLeg8#mmTradingPartyAccount
 * TradeLeg8.mmTradingPartyAccount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg8#mmTradingCapacity
 * TradeLeg8.mmTradingCapacity}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg8#mmTradePostingCode
 * TradeLeg8.mmTradePostingCode}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg8#mmSafekeepingPlace
 * TradeLeg8.mmSafekeepingPlace}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg8#mmSafekeepingAccount
 * TradeLeg8.mmSafekeepingAccount}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesTrade
 * SecuritiesTrade}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.secl.TradeLegNotificationV03#mmTradeLegDetails
 * TradeLegNotificationV03.mmTradeLegDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.secl.TradeLegNotificationCancellationV03#mmTradeLegDetails
 * TradeLegNotificationCancellationV03.mmTradeLegDetails}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TradeLeg8"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides the trade leg details."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.TradeLeg5
 * TradeLeg5}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "TradeLeg8", propOrder = {"tradeLegIdentification", "tradeIdentification", "tradeExecutionIdentification", "orderIdentification", "allocationIdentification", "status", "tradeDate", "transactionDateTime", "settlementDate",
		"financialInstrumentIdentification", "tradingCurrency", "buySellIndicator", "tradeQuantity", "dealPrice", "grossAmount", "accruedInterestAmount", "placeOfTrade", "placeOfListing", "tradeType", "derivativeRelatedTrade", "broker",
		"tradingParty", "tradeRegistrationOrigin", "tradingPartyAccount", "tradingCapacity", "tradePostingCode", "safekeepingPlace", "safekeepingAccount"})
public class TradeLeg8 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text tradeLegIdentification;
	/**
	 * Unambiguous identification of the transaction (that is the trade leg) as
	 * known by the instructing party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TradeIdentification#mmIdentification
	 * TradeIdentification.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TradeLeg8
	 * TradeLeg8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradLegId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeLegIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the transaction (that is the trade leg) as known by the instructing party."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TradeLeg5#mmTradeLegIdentification
	 * TradeLeg5.mmTradeLegIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTradeLegIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> TradeIdentification.mmIdentification;
			componentContext_lazy = () -> TradeLeg8.mmObject();
			isDerived = false;
			xmlTag = "TradLegId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeLegIdentification";
			definition = "Unambiguous identification of the transaction (that is the trade leg) as known by the instructing party.";
			previousVersion_lazy = () -> TradeLeg5.mmTradeLegIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text tradeIdentification;
	/**
	 * Reference allocated by the broker dealer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TradeLeg8
	 * TradeLeg8}</li>
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
	 * definition} = "Reference allocated by the broker dealer."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TradeLeg5#mmTradeIdentification
	 * TradeLeg5.mmTradeIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTradeIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TradeLeg8.mmObject();
			isDerived = false;
			xmlTag = "TradId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeIdentification";
			definition = "Reference allocated by the broker dealer.";
			previousVersion_lazy = () -> TradeLeg5.mmTradeIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text tradeExecutionIdentification;
	/**
	 * Unique reference assigned by the trading venue when the trade is
	 * executed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TradeLeg8
	 * TradeLeg8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradExctnId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeExecutionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique reference assigned by the trading venue when the trade is executed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TradeLeg5#mmTradeExecutionIdentification
	 * TradeLeg5.mmTradeExecutionIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTradeExecutionIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TradeLeg8.mmObject();
			isDerived = false;
			xmlTag = "TradExctnId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeExecutionIdentification";
			definition = "Unique reference assigned by the trading venue when the trade is executed.";
			previousVersion_lazy = () -> TradeLeg5.mmTradeExecutionIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text orderIdentification;
	/**
	 * Identifies the order sent by the final investor to an intermediary in
	 * order to initiate a trade in the former's name. This identification is
	 * then matched with the equivalent trade by the clearing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmIdentification
	 * SecuritiesOrder.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TradeLeg8
	 * TradeLeg8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrdrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the order sent by the final investor to an intermediary in order to initiate a trade in the former's name. This identification is then matched with the equivalent trade by the clearing."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOrderIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmIdentification;
			componentContext_lazy = () -> TradeLeg8.mmObject();
			isDerived = false;
			xmlTag = "OrdrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderIdentification";
			definition = "Identifies the order sent by the final investor to an intermediary in order to initiate a trade in the former's name. This identification is then matched with the equivalent trade by the clearing.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text allocationIdentification;
	/**
	 * Identifies the portion of assets within a determined trade that shall be
	 * allocated to different clients.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification#mmAllocationIdentification
	 * SecuritiesTradeIdentification.mmAllocationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TradeLeg8
	 * TradeLeg8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AllcnId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllocationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the portion of assets within a determined trade that shall be allocated to different clients."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAllocationIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeIdentification.mmAllocationIdentification;
			componentContext_lazy = () -> TradeLeg8.mmObject();
			isDerived = false;
			xmlTag = "AllcnId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllocationIdentification";
			definition = "Identifies the portion of assets within a determined trade that shall be allocated to different clients.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Status5Code status;
	/**
	 * Provides the status of the trade leg.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.Status5Code
	 * Status5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Status#mmInstructionProcessingStatus
	 * Status.mmInstructionProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TradeLeg8
	 * TradeLeg8}</li>
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
	 * definition} = "Provides the status of the trade leg."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TradeLeg5#mmStatus
	 * TradeLeg5.mmStatus}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmStatus = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Status.mmInstructionProcessingStatus;
			componentContext_lazy = () -> TradeLeg8.mmObject();
			isDerived = false;
			xmlTag = "Sts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Status";
			definition = "Provides the status of the trade leg.";
			previousVersion_lazy = () -> TradeLeg5.mmStatus;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Status5Code.mmObject();
		}
	};
	protected ISODateTime tradeDate;
	/**
	 * Provides the date and time of trade transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Trade#mmTradeDateTime
	 * Trade.mmTradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TradeLeg8
	 * TradeLeg8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the date and time of trade transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TradeLeg5#mmTradeDate
	 * TradeLeg5.mmTradeDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTradeDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Trade.mmTradeDateTime;
			componentContext_lazy = () -> TradeLeg8.mmObject();
			isDerived = false;
			xmlTag = "TradDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDate";
			definition = "Provides the date and time of trade transaction.";
			previousVersion_lazy = () -> TradeLeg5.mmTradeDate;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected ISODateTime transactionDateTime;
	/**
	 * Date and time used to determine the price applicable to a trade. If the
	 * trade is registered "after market" hours, the trading price will the
	 * price of the day but the actual trade date will be the next working day.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Trade#mmTradeDateTime
	 * Trade.mmTradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TradeLeg8
	 * TradeLeg8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxDtTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time used to determine the price applicable to a trade. If the trade is registered \"after market\" hours, the trading price will the price of the day but the actual trade date will be the next working day."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTransactionDateTime = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Trade.mmTradeDateTime;
			componentContext_lazy = () -> TradeLeg8.mmObject();
			isDerived = false;
			xmlTag = "TxDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionDateTime";
			definition = "Date and time used to determine the price applicable to a trade. If the trade is registered \"after market\" hours, the trading price will the price of the day but the actual trade date will be the next working day.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected DateFormat15Choice settlementDate;
	/**
	 * Provides the contractual settlement date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat15Choice
	 * DateFormat15Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Obligation#mmRequestedSettlementDate
	 * Obligation.mmRequestedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TradeLeg8
	 * TradeLeg8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the contractual settlement date."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TradeLeg5#mmSettlementDate
	 * TradeLeg5.mmSettlementDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSettlementDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Obligation.mmRequestedSettlementDate;
			componentContext_lazy = () -> TradeLeg8.mmObject();
			isDerived = false;
			xmlTag = "SttlmDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDate";
			definition = "Provides the contractual settlement date.";
			previousVersion_lazy = () -> TradeLeg5.mmSettlementDate;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat15Choice.mmObject();
		}
	};
	protected SecurityIdentification14 financialInstrumentIdentification;
	/**
	 * Provides details about the security identification.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification14
	 * SecurityIdentification14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmIdentification
	 * Security.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TradeLeg8
	 * TradeLeg8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinInstrmId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides details about the security identification."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TradeLeg5#mmFinancialInstrumentIdentification
	 * TradeLeg5.mmFinancialInstrumentIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFinancialInstrumentIdentification = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Security.mmIdentification;
			componentContext_lazy = () -> TradeLeg8.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentification";
			definition = "Provides details about the security identification.";
			previousVersion_lazy = () -> TradeLeg5.mmFinancialInstrumentIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SecurityIdentification14.mmObject();
		}
	};
	protected CurrencyCode tradingCurrency;
	/**
	 * Specifies the ISO code of the trade currency.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TradingMarket#mmTradingCurrency
	 * TradingMarket.mmTradingCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TradeLeg8
	 * TradeLeg8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradgCcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the ISO code of the trade currency."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TradeLeg5#mmTradingCurrency
	 * TradeLeg5.mmTradingCurrency}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTradingCurrency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> TradingMarket.mmTradingCurrency;
			componentContext_lazy = () -> TradeLeg8.mmObject();
			isDerived = false;
			xmlTag = "TradgCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingCurrency";
			definition = "Specifies the ISO code of the trade currency.";
			previousVersion_lazy = () -> TradeLeg5.mmTradingCurrency;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	protected Side1Code buySellIndicator;
	/**
	 * Identifies the trade leg indicator which gives the trade side (buy or
	 * sell).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.Side1Code
	 * Side1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmSide
	 * SecuritiesOrder.mmSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TradeLeg8
	 * TradeLeg8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BuySellInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BuySellIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the trade leg indicator which gives the trade side (buy or sell)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TradeLeg5#mmBuySellIndicator
	 * TradeLeg5.mmBuySellIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBuySellIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmSide;
			componentContext_lazy = () -> TradeLeg8.mmObject();
			isDerived = false;
			xmlTag = "BuySellInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BuySellIndicator";
			definition = "Identifies the trade leg indicator which gives the trade side (buy or sell).";
			previousVersion_lazy = () -> TradeLeg5.mmBuySellIndicator;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Side1Code.mmObject();
		}
	};
	protected FinancialInstrumentQuantity1Choice tradeQuantity;
	/**
	 * Identifies the quantity of the trade leg.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity1Choice
	 * FinancialInstrumentQuantity1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmTradeQuantity
	 * SecuritiesTrade.mmTradeQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TradeLeg8
	 * TradeLeg8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the quantity of the trade leg."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TradeLeg5#mmTradeQuantity
	 * TradeLeg5.mmTradeQuantity}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTradeQuantity = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesTrade.mmTradeQuantity;
			componentContext_lazy = () -> TradeLeg8.mmObject();
			isDerived = false;
			xmlTag = "TradQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeQuantity";
			definition = "Identifies the quantity of the trade leg.";
			previousVersion_lazy = () -> TradeLeg5.mmTradeQuantity;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity1Choice.mmObject();
		}
	};
	protected Price4 dealPrice;
	/**
	 * Specifies the price of the traded financial instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Price4 Price4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#mmDealPrice
	 * SecuritiesTradeExecution.mmDealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TradeLeg8
	 * TradeLeg8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DealPric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DealPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the price of the traded financial instrument."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TradeLeg5#mmDealPrice
	 * TradeLeg5.mmDealPrice}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDealPrice = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeExecution.mmDealPrice;
			componentContext_lazy = () -> TradeLeg8.mmObject();
			isDerived = false;
			xmlTag = "DealPric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DealPrice";
			definition = "Specifies the price of the traded financial instrument.";
			previousVersion_lazy = () -> TradeLeg5.mmDealPrice;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Price4.mmObject();
		}
	};
	protected AmountAndDirection21 grossAmount;
	/**
	 * Principal amount of a trade (price multiplied by quantity).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection21
	 * AmountAndDirection21}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmOrderedAmount
	 * SecuritiesOrder.mmOrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TradeLeg8
	 * TradeLeg8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GrssAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Principal amount of a trade (price multiplied by quantity)."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmGrossAmount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmOrderedAmount;
			componentContext_lazy = () -> TradeLeg8.mmObject();
			isDerived = false;
			xmlTag = "GrssAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossAmount";
			definition = "Principal amount of a trade (price multiplied by quantity).";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AmountAndDirection21.mmObject();
		}
	};
	protected AmountAndDirection21 accruedInterestAmount;
	/**
	 * Interest that has accumulated on a bond since the last interest payment
	 * up to, but not including, the settlement date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection21
	 * AmountAndDirection21}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Interest#mmAccruedInterestAmount
	 * Interest.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TradeLeg8
	 * TradeLeg8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcrdIntrstAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccruedInterestAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Interest that has accumulated on a bond since the last interest payment up to, but not including, the settlement date."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TradeLeg5#mmAccruedInterestAmount
	 * TradeLeg5.mmAccruedInterestAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAccruedInterestAmount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Interest.mmAccruedInterestAmount;
			componentContext_lazy = () -> TradeLeg8.mmObject();
			isDerived = false;
			xmlTag = "AcrdIntrstAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccruedInterestAmount";
			definition = "Interest that has accumulated on a bond since the last interest payment up to, but not including, the settlement date.";
			previousVersion_lazy = () -> TradeLeg5.mmAccruedInterestAmount;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AmountAndDirection21.mmObject();
		}
	};
	protected MarketIdentification84 placeOfTrade;
	/**
	 * Place at which the security is traded.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.MarketIdentification84
	 * MarketIdentification84}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.TradingMarket TradingMarket}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TradeLeg8
	 * TradeLeg8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PlcOfTrad"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Place at which the security is traded."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TradeLeg5#mmPlaceOfTrade
	 * TradeLeg5.mmPlaceOfTrade}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPlaceOfTrade = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> TradingMarket.mmObject();
			componentContext_lazy = () -> TradeLeg8.mmObject();
			isDerived = false;
			xmlTag = "PlcOfTrad";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfTrade";
			definition = "Place at which the security is traded.";
			previousVersion_lazy = () -> TradeLeg5.mmPlaceOfTrade;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.MarketIdentification84.mmObject();
		}
	};
	protected MarketIdentification85 placeOfListing;
	/**
	 * Place at which the security is listed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.MarketIdentification85
	 * MarketIdentification85}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmPlaceOfListing
	 * Security.mmPlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TradeLeg8
	 * TradeLeg8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PlcOfListg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfListing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Place at which the security is listed."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TradeLeg5#mmPlaceOfListing
	 * TradeLeg5.mmPlaceOfListing}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPlaceOfListing = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Security.mmPlaceOfListing;
			componentContext_lazy = () -> TradeLeg8.mmObject();
			isDerived = false;
			xmlTag = "PlcOfListg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfListing";
			definition = "Place at which the security is listed.";
			previousVersion_lazy = () -> TradeLeg5.mmPlaceOfListing;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.MarketIdentification85.mmObject();
		}
	};
	protected TradeType1Code tradeType;
	/**
	 * Identifies the type of trade transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TradeType1Code
	 * TradeType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmTransactionType
	 * SecuritiesTrade.mmTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TradeLeg8
	 * TradeLeg8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the type of trade transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TradeLeg5#mmTradeType
	 * TradeLeg5.mmTradeType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTradeType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesTrade.mmTransactionType;
			componentContext_lazy = () -> TradeLeg8.mmObject();
			isDerived = false;
			xmlTag = "TradTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeType";
			definition = "Identifies the type of trade transaction.";
			previousVersion_lazy = () -> TradeLeg5.mmTradeType;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TradeType1Code.mmObject();
		}
	};
	protected YesNoIndicator derivativeRelatedTrade;
	/**
	 * Indicates that the trade is for settlement of an exercised derivatives
	 * contract.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TradeLeg8
	 * TradeLeg8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DerivRltdTrad"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DerivativeRelatedTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that the trade is for settlement of an exercised derivatives contract."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TradeLeg5#mmDerivativeRelatedTrade
	 * TradeLeg5.mmDerivativeRelatedTrade}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDerivativeRelatedTrade = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TradeLeg8.mmObject();
			isDerived = false;
			xmlTag = "DerivRltdTrad";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DerivativeRelatedTrade";
			definition = "Indicates that the trade is for settlement of an exercised derivatives contract.";
			previousVersion_lazy = () -> TradeLeg5.mmDerivativeRelatedTrade;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected PartyIdentificationAndAccount100 broker;
	/**
	 * Party that identifies a broker when required (for example, authorised
	 * broker or prime broker).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount100
	 * PartyIdentificationAndAccount100}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Broker Broker}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TradeLeg8
	 * TradeLeg8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Brkr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Broker"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that identifies a broker when required (for example, authorised broker or prime broker)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmBroker = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Broker.mmObject();
			componentContext_lazy = () -> TradeLeg8.mmObject();
			isDerived = false;
			xmlTag = "Brkr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Broker";
			definition = "Party that identifies a broker when required (for example, authorised broker or prime broker).";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentificationAndAccount100.mmObject();
		}
	};
	protected PartyIdentification35Choice tradingParty;
	/**
	 * Provides the identification of the trading party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification35Choice
	 * PartyIdentification35Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TradeLeg8
	 * TradeLeg8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradgPty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the identification of the trading party."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TradeLeg5#mmTradingParty
	 * TradeLeg5.mmTradingParty}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTradingParty = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> TradeLeg8.mmObject();
			isDerived = false;
			xmlTag = "TradgPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingParty";
			definition = "Provides the identification of the trading party.";
			previousVersion_lazy = () -> TradeLeg5.mmTradingParty;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PartyIdentification35Choice.mmObject();
		}
	};
	protected Max35Text tradeRegistrationOrigin;
	/**
	 * Indicates in which session the transaction/operation was executed by the
	 * final investor or an intermediary.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade
	 * SecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TradeLeg8
	 * TradeLeg8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradRegnOrgn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeRegistrationOrigin"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates in which session the transaction/operation was executed by the final investor or an intermediary."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTradeRegistrationOrigin = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> SecuritiesTrade.mmObject();
			componentContext_lazy = () -> TradeLeg8.mmObject();
			isDerived = false;
			xmlTag = "TradRegnOrgn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeRegistrationOrigin";
			definition = "Indicates in which session the transaction/operation was executed by the final investor or an intermediary.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected SecuritiesAccount19 tradingPartyAccount;
	/**
	 * Identifier of the trading participant's account at the trading venue
	 * using the venue's coding system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount19
	 * SecuritiesAccount19}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TradePartyRole#mmAccount
	 * TradePartyRole.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TradeLeg8
	 * TradeLeg8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradgPtyAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingPartyAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifier of the trading participant's account at the trading venue using the venue's coding system."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TradeLeg5#mmTradingPartyAccount
	 * TradeLeg5.mmTradingPartyAccount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTradingPartyAccount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> TradePartyRole.mmAccount;
			componentContext_lazy = () -> TradeLeg8.mmObject();
			isDerived = false;
			xmlTag = "TradgPtyAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingPartyAccount";
			definition = "Identifier of the trading participant's account at the trading venue using the venue's coding system.";
			previousVersion_lazy = () -> TradeLeg5.mmTradingPartyAccount;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.SecuritiesAccount19.mmObject();
		}
	};
	protected TradingCapacity5Code tradingCapacity;
	/**
	 * Specifies the role of the trading party in the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TradingCapacity5Code
	 * TradingCapacity5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TradePartyRole#mmTradingPartyCapacity
	 * TradePartyRole.mmTradingPartyCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TradeLeg8
	 * TradeLeg8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradgCpcty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingCapacity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the role of the trading party in the transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TradeLeg5#mmTradingCapacity
	 * TradeLeg5.mmTradingCapacity}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTradingCapacity = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> TradePartyRole.mmTradingPartyCapacity;
			componentContext_lazy = () -> TradeLeg8.mmObject();
			isDerived = false;
			xmlTag = "TradgCpcty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingCapacity";
			definition = "Specifies the role of the trading party in the transaction.";
			previousVersion_lazy = () -> TradeLeg5.mmTradingCapacity;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TradingCapacity5Code.mmObject();
		}
	};
	protected TradePosting1Code tradePostingCode;
	/**
	 * Indicates how a trade is maintained in the clearing account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TradePosting1Code
	 * TradePosting1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Clearing#mmTradePostingType
	 * Clearing.mmTradePostingType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TradeLeg8
	 * TradeLeg8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradPstngCd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradePostingCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates how a trade is maintained in the clearing account."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TradeLeg5#mmTradePostingCode
	 * TradeLeg5.mmTradePostingCode}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTradePostingCode = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Clearing.mmTradePostingType;
			componentContext_lazy = () -> TradeLeg8.mmObject();
			isDerived = false;
			xmlTag = "TradPstngCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradePostingCode";
			definition = "Indicates how a trade is maintained in the clearing account.";
			previousVersion_lazy = () -> TradeLeg5.mmTradePostingCode;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TradePosting1Code.mmObject();
		}
	};
	protected SafekeepingPlaceFormat7Choice safekeepingPlace;
	/**
	 * Place where the securities are safe-kept, physically or notionally. This
	 * place can be, for example, a local custodian, a Central Securities
	 * Depository (CSD) or an International Central Securities Depository
	 * (ICSD).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat7Choice
	 * SafekeepingPlaceFormat7Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#mmSafekeepingPlace
	 * SecuritiesAccount.mmSafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TradeLeg8
	 * TradeLeg8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SfkpgPlc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlace"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Place where the securities are safe-kept, physically or notionally. This place can be, for example, a local custodian, a Central Securities Depository (CSD) or an International Central Securities Depository (ICSD)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSafekeepingPlace = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesAccount.mmSafekeepingPlace;
			componentContext_lazy = () -> TradeLeg8.mmObject();
			isDerived = false;
			xmlTag = "SfkpgPlc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlace";
			definition = "Place where the securities are safe-kept, physically or notionally. This place can be, for example, a local custodian, a Central Securities Depository (CSD) or an International Central Securities Depository (ICSD).";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SafekeepingPlaceFormat7Choice.mmObject();
		}
	};
	protected SecuritiesAccount19 safekeepingAccount;
	/**
	 * Account to or from which a securities entry is made.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SecuritiesAccount19
	 * SecuritiesAccount19}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ClearingMemberRole#mmClearingAccount
	 * ClearingMemberRole.mmClearingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TradeLeg8
	 * TradeLeg8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SfkpgAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account to or from which a securities entry is made."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSafekeepingAccount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> ClearingMemberRole.mmClearingAccount;
			componentContext_lazy = () -> TradeLeg8.mmObject();
			isDerived = false;
			xmlTag = "SfkpgAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingAccount";
			definition = "Account to or from which a securities entry is made.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SecuritiesAccount19.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(TradeLeg8.mmTradeLegIdentification, TradeLeg8.mmTradeIdentification, TradeLeg8.mmTradeExecutionIdentification, TradeLeg8.mmOrderIdentification, TradeLeg8.mmAllocationIdentification,
						TradeLeg8.mmStatus, TradeLeg8.mmTradeDate, TradeLeg8.mmTransactionDateTime, TradeLeg8.mmSettlementDate, TradeLeg8.mmFinancialInstrumentIdentification, TradeLeg8.mmTradingCurrency, TradeLeg8.mmBuySellIndicator,
						TradeLeg8.mmTradeQuantity, TradeLeg8.mmDealPrice, TradeLeg8.mmGrossAmount, TradeLeg8.mmAccruedInterestAmount, TradeLeg8.mmPlaceOfTrade, TradeLeg8.mmPlaceOfListing, TradeLeg8.mmTradeType,
						TradeLeg8.mmDerivativeRelatedTrade, TradeLeg8.mmBroker, TradeLeg8.mmTradingParty, TradeLeg8.mmTradeRegistrationOrigin, TradeLeg8.mmTradingPartyAccount, TradeLeg8.mmTradingCapacity, TradeLeg8.mmTradePostingCode,
						TradeLeg8.mmSafekeepingPlace, TradeLeg8.mmSafekeepingAccount);
				messageBuildingBlock_lazy = () -> Arrays.asList(TradeLegNotificationV03.mmTradeLegDetails, TradeLegNotificationCancellationV03.mmTradeLegDetails);
				trace_lazy = () -> SecuritiesTrade.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "TradeLeg8";
				definition = "Provides the trade leg details.";
				previousVersion_lazy = () -> TradeLeg5.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "TradLegId", required = true)
	public Max35Text getTradeLegIdentification() {
		return tradeLegIdentification;
	}

	public void setTradeLegIdentification(Max35Text tradeLegIdentification) {
		this.tradeLegIdentification = tradeLegIdentification;
	}

	@XmlElement(name = "TradId")
	public Max35Text getTradeIdentification() {
		return tradeIdentification;
	}

	public void setTradeIdentification(Max35Text tradeIdentification) {
		this.tradeIdentification = tradeIdentification;
	}

	@XmlElement(name = "TradExctnId", required = true)
	public Max35Text getTradeExecutionIdentification() {
		return tradeExecutionIdentification;
	}

	public void setTradeExecutionIdentification(Max35Text tradeExecutionIdentification) {
		this.tradeExecutionIdentification = tradeExecutionIdentification;
	}

	@XmlElement(name = "OrdrId")
	public Max35Text getOrderIdentification() {
		return orderIdentification;
	}

	public void setOrderIdentification(Max35Text orderIdentification) {
		this.orderIdentification = orderIdentification;
	}

	@XmlElement(name = "AllcnId")
	public Max35Text getAllocationIdentification() {
		return allocationIdentification;
	}

	public void setAllocationIdentification(Max35Text allocationIdentification) {
		this.allocationIdentification = allocationIdentification;
	}

	@XmlElement(name = "Sts")
	public Status5Code getStatus() {
		return status;
	}

	public void setStatus(Status5Code status) {
		this.status = status;
	}

	@XmlElement(name = "TradDt", required = true)
	public ISODateTime getTradeDate() {
		return tradeDate;
	}

	public void setTradeDate(ISODateTime tradeDate) {
		this.tradeDate = tradeDate;
	}

	@XmlElement(name = "TxDtTm")
	public ISODateTime getTransactionDateTime() {
		return transactionDateTime;
	}

	public void setTransactionDateTime(ISODateTime transactionDateTime) {
		this.transactionDateTime = transactionDateTime;
	}

	@XmlElement(name = "SttlmDt")
	public DateFormat15Choice getSettlementDate() {
		return settlementDate;
	}

	public void setSettlementDate(DateFormat15Choice settlementDate) {
		this.settlementDate = settlementDate;
	}

	@XmlElement(name = "FinInstrmId", required = true)
	public SecurityIdentification14 getFinancialInstrumentIdentification() {
		return financialInstrumentIdentification;
	}

	public void setFinancialInstrumentIdentification(com.tools20022.repository.msg.SecurityIdentification14 financialInstrumentIdentification) {
		this.financialInstrumentIdentification = financialInstrumentIdentification;
	}

	@XmlElement(name = "TradgCcy")
	public CurrencyCode getTradingCurrency() {
		return tradingCurrency;
	}

	public void setTradingCurrency(CurrencyCode tradingCurrency) {
		this.tradingCurrency = tradingCurrency;
	}

	@XmlElement(name = "BuySellInd", required = true)
	public Side1Code getBuySellIndicator() {
		return buySellIndicator;
	}

	public void setBuySellIndicator(Side1Code buySellIndicator) {
		this.buySellIndicator = buySellIndicator;
	}

	@XmlElement(name = "TradQty", required = true)
	public FinancialInstrumentQuantity1Choice getTradeQuantity() {
		return tradeQuantity;
	}

	public void setTradeQuantity(FinancialInstrumentQuantity1Choice tradeQuantity) {
		this.tradeQuantity = tradeQuantity;
	}

	@XmlElement(name = "DealPric", required = true)
	public Price4 getDealPrice() {
		return dealPrice;
	}

	public void setDealPrice(com.tools20022.repository.msg.Price4 dealPrice) {
		this.dealPrice = dealPrice;
	}

	@XmlElement(name = "GrssAmt")
	public AmountAndDirection21 getGrossAmount() {
		return grossAmount;
	}

	public void setGrossAmount(com.tools20022.repository.msg.AmountAndDirection21 grossAmount) {
		this.grossAmount = grossAmount;
	}

	@XmlElement(name = "AcrdIntrstAmt")
	public AmountAndDirection21 getAccruedInterestAmount() {
		return accruedInterestAmount;
	}

	public void setAccruedInterestAmount(com.tools20022.repository.msg.AmountAndDirection21 accruedInterestAmount) {
		this.accruedInterestAmount = accruedInterestAmount;
	}

	@XmlElement(name = "PlcOfTrad", required = true)
	public MarketIdentification84 getPlaceOfTrade() {
		return placeOfTrade;
	}

	public void setPlaceOfTrade(com.tools20022.repository.msg.MarketIdentification84 placeOfTrade) {
		this.placeOfTrade = placeOfTrade;
	}

	@XmlElement(name = "PlcOfListg")
	public MarketIdentification85 getPlaceOfListing() {
		return placeOfListing;
	}

	public void setPlaceOfListing(com.tools20022.repository.msg.MarketIdentification85 placeOfListing) {
		this.placeOfListing = placeOfListing;
	}

	@XmlElement(name = "TradTp", required = true)
	public TradeType1Code getTradeType() {
		return tradeType;
	}

	public void setTradeType(TradeType1Code tradeType) {
		this.tradeType = tradeType;
	}

	@XmlElement(name = "DerivRltdTrad")
	public YesNoIndicator getDerivativeRelatedTrade() {
		return derivativeRelatedTrade;
	}

	public void setDerivativeRelatedTrade(YesNoIndicator derivativeRelatedTrade) {
		this.derivativeRelatedTrade = derivativeRelatedTrade;
	}

	@XmlElement(name = "Brkr")
	public PartyIdentificationAndAccount100 getBroker() {
		return broker;
	}

	public void setBroker(com.tools20022.repository.msg.PartyIdentificationAndAccount100 broker) {
		this.broker = broker;
	}

	@XmlElement(name = "TradgPty", required = true)
	public PartyIdentification35Choice getTradingParty() {
		return tradingParty;
	}

	public void setTradingParty(PartyIdentification35Choice tradingParty) {
		this.tradingParty = tradingParty;
	}

	@XmlElement(name = "TradRegnOrgn")
	public Max35Text getTradeRegistrationOrigin() {
		return tradeRegistrationOrigin;
	}

	public void setTradeRegistrationOrigin(Max35Text tradeRegistrationOrigin) {
		this.tradeRegistrationOrigin = tradeRegistrationOrigin;
	}

	@XmlElement(name = "TradgPtyAcct")
	public SecuritiesAccount19 getTradingPartyAccount() {
		return tradingPartyAccount;
	}

	public void setTradingPartyAccount(com.tools20022.repository.msg.SecuritiesAccount19 tradingPartyAccount) {
		this.tradingPartyAccount = tradingPartyAccount;
	}

	@XmlElement(name = "TradgCpcty", required = true)
	public TradingCapacity5Code getTradingCapacity() {
		return tradingCapacity;
	}

	public void setTradingCapacity(TradingCapacity5Code tradingCapacity) {
		this.tradingCapacity = tradingCapacity;
	}

	@XmlElement(name = "TradPstngCd")
	public TradePosting1Code getTradePostingCode() {
		return tradePostingCode;
	}

	public void setTradePostingCode(TradePosting1Code tradePostingCode) {
		this.tradePostingCode = tradePostingCode;
	}

	@XmlElement(name = "SfkpgPlc")
	public SafekeepingPlaceFormat7Choice getSafekeepingPlace() {
		return safekeepingPlace;
	}

	public void setSafekeepingPlace(SafekeepingPlaceFormat7Choice safekeepingPlace) {
		this.safekeepingPlace = safekeepingPlace;
	}

	@XmlElement(name = "SfkpgAcct")
	public SecuritiesAccount19 getSafekeepingAccount() {
		return safekeepingAccount;
	}

	public void setSafekeepingAccount(com.tools20022.repository.msg.SecuritiesAccount19 safekeepingAccount) {
		this.safekeepingAccount = safekeepingAccount;
	}
}