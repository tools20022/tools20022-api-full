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
import java.util.Objects;
import java.util.Optional;
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
 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg9#mmMarginAccount
 * TradeLeg9.mmMarginAccount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg9#mmDeliveryAccount
 * TradeLeg9.mmDeliveryAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeLeg9#mmTradeLegIdentification
 * TradeLeg9.mmTradeLegIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeLeg9#mmTradeIdentification
 * TradeLeg9.mmTradeIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeLeg9#mmTradeExecutionIdentification
 * TradeLeg9.mmTradeExecutionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeLeg9#mmOrderIdentification
 * TradeLeg9.mmOrderIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeLeg9#mmAllocationIdentification
 * TradeLeg9.mmAllocationIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg9#mmNonClearingMember
 * TradeLeg9.mmNonClearingMember}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg9#mmTradeDate
 * TradeLeg9.mmTradeDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeLeg9#mmTransactionDateAndTime
 * TradeLeg9.mmTransactionDateAndTime}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg9#mmSettlementDate
 * TradeLeg9.mmSettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeLeg9#mmFinancialInstrumentIdentification
 * TradeLeg9.mmFinancialInstrumentIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg9#mmTradingCurrency
 * TradeLeg9.mmTradingCurrency}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg9#mmBuySellIndicator
 * TradeLeg9.mmBuySellIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg9#mmTradeQuantity
 * TradeLeg9.mmTradeQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg9#mmDealPrice
 * TradeLeg9.mmDealPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeLeg9#mmAccruedInterestAmount
 * TradeLeg9.mmAccruedInterestAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg9#mmPlaceOfTrade
 * TradeLeg9.mmPlaceOfTrade}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg9#mmPlaceOfListing
 * TradeLeg9.mmPlaceOfListing}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg9#mmTradeType
 * TradeLeg9.mmTradeType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeLeg9#mmDerivativeRelatedTrade
 * TradeLeg9.mmDerivativeRelatedTrade}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg9#mmBroker
 * TradeLeg9.mmBroker}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg9#mmTradingParty
 * TradeLeg9.mmTradingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeLeg9#mmTradeRegistrationOrigin
 * TradeLeg9.mmTradeRegistrationOrigin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeLeg9#mmTradingPartyAccount
 * TradeLeg9.mmTradingPartyAccount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg9#mmTradingCapacity
 * TradeLeg9.mmTradingCapacity}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg9#mmTradePostingCode
 * TradeLeg9.mmTradePostingCode}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg9#mmSafekeepingPlace
 * TradeLeg9.mmSafekeepingPlace}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg9#mmSafekeepingAccount
 * TradeLeg9.mmSafekeepingAccount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg9#mmSettlementDetails
 * TradeLeg9.mmSettlementDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg9#mmClearingDetails
 * TradeLeg9.mmClearingDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg9#mmGrossAmount
 * TradeLeg9.mmGrossAmount}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesTrade
 * SecuritiesTrade}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintDepositoryOrPlaceOfListingPresenceRule#forTradeLeg9
 * ConstraintDepositoryOrPlaceOfListingPresenceRule.forTradeLeg9}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TradeLeg9"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides the trade leg details."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.TradeLeg6
 * TradeLeg6}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TradeLeg9", propOrder = {"marginAccount", "deliveryAccount", "tradeLegIdentification", "tradeIdentification", "tradeExecutionIdentification", "orderIdentification", "allocationIdentification", "nonClearingMember",
		"tradeDate", "transactionDateAndTime", "settlementDate", "financialInstrumentIdentification", "tradingCurrency", "buySellIndicator", "tradeQuantity", "dealPrice", "accruedInterestAmount", "placeOfTrade", "placeOfListing",
		"tradeType", "derivativeRelatedTrade", "broker", "tradingParty", "tradeRegistrationOrigin", "tradingPartyAccount", "tradingCapacity", "tradePostingCode", "safekeepingPlace", "safekeepingAccount", "settlementDetails",
		"clearingDetails", "grossAmount"})
public class TradeLeg9 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "MrgnAcct")
	protected SecuritiesAccount19 marginAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SecuritiesAccount19
	 * SecuritiesAccount19}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ClearingMemberRole#mmMarginAccount
	 * ClearingMemberRole.mmMarginAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TradeLeg9
	 * TradeLeg9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MrgnAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarginAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Margin account where the negotiation and liquidation risks will be calculated."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TradeLeg6#mmMarginAccount
	 * TradeLeg6.mmMarginAccount}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmMarginAccount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> ClearingMemberRole.mmMarginAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeLeg9.mmObject();
			isDerived = false;
			xmlTag = "MrgnAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarginAccount";
			definition = "Margin account where the negotiation and liquidation risks will be calculated.";
			previousVersion_lazy = () -> TradeLeg6.mmMarginAccount;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SecuritiesAccount19.mmObject();
		}
	};
	@XmlElement(name = "DlvryAcct")
	protected SecuritiesAccount19 deliveryAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SecuritiesAccount19
	 * SecuritiesAccount19}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ClearingMemberRole#mmDeliveryAccount
	 * ClearingMemberRole.mmDeliveryAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TradeLeg9
	 * TradeLeg9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DlvryAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveryAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account opened by the central counterparty in the name of the clearing member or its settlement agent within the account structure, for settlement purposes (gives information about the clearing member/its settlement agent account at the central securities depository)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TradeLeg6#mmDeliveryAccount
	 * TradeLeg6.mmDeliveryAccount}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDeliveryAccount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> ClearingMemberRole.mmDeliveryAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeLeg9.mmObject();
			isDerived = false;
			xmlTag = "DlvryAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveryAccount";
			definition = "Account opened by the central counterparty in the name of the clearing member or its settlement agent within the account structure, for settlement purposes (gives information about the clearing member/its settlement agent account at the central securities depository).";
			previousVersion_lazy = () -> TradeLeg6.mmDeliveryAccount;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SecuritiesAccount19.mmObject();
		}
	};
	@XmlElement(name = "TradLegId", required = true)
	protected Max35Text tradeLegIdentification;
	/**
	 * 
	 <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TradeLeg9
	 * TradeLeg9}</li>
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
	 * {@linkplain com.tools20022.repository.msg.TradeLeg6#mmTradeLegIdentification
	 * TradeLeg6.mmTradeLegIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTradeLegIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> TradeIdentification.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeLeg9.mmObject();
			isDerived = false;
			xmlTag = "TradLegId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeLegIdentification";
			definition = "Unambiguous identification of the transaction (that is the trade leg) as known by the instructing party.";
			previousVersion_lazy = () -> TradeLeg6.mmTradeLegIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "TradId")
	protected Max35Text tradeIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TradeLeg9
	 * TradeLeg9}</li>
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
	 * {@linkplain com.tools20022.repository.msg.TradeLeg6#mmTradeIdentification
	 * TradeLeg6.mmTradeIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTradeIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeLeg9.mmObject();
			isDerived = false;
			xmlTag = "TradId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeIdentification";
			definition = "Reference allocated by the broker dealer.";
			previousVersion_lazy = () -> TradeLeg6.mmTradeIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "TradExctnId", required = true)
	protected Max35Text tradeExecutionIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TradeLeg9
	 * TradeLeg9}</li>
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
	 * {@linkplain com.tools20022.repository.msg.TradeLeg6#mmTradeExecutionIdentification
	 * TradeLeg6.mmTradeExecutionIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTradeExecutionIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeLeg9.mmObject();
			isDerived = false;
			xmlTag = "TradExctnId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeExecutionIdentification";
			definition = "Unique reference assigned by the trading venue when the trade is executed.";
			previousVersion_lazy = () -> TradeLeg6.mmTradeExecutionIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "OrdrId")
	protected Max35Text orderIdentification;
	/**
	 * 
	 <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TradeLeg9
	 * TradeLeg9}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeLeg9.mmObject();
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
	@XmlElement(name = "AllcnId")
	protected Max35Text allocationIdentification;
	/**
	 * 
	 <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TradeLeg9
	 * TradeLeg9}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeLeg9.mmObject();
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
	@XmlElement(name = "NonClrMmb")
	protected PartyIdentificationAndAccount31 nonClearingMember;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount31
	 * PartyIdentificationAndAccount31}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TradeLeg9
	 * TradeLeg9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NonClrMmb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonClearingMember"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details about the non clearing member identification and account."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TradeLeg6#mmNonClearingMember
	 * TradeLeg6.mmNonClearingMember}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmNonClearingMember = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeLeg9.mmObject();
			isDerived = false;
			xmlTag = "NonClrMmb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonClearingMember";
			definition = "Provides details about the non clearing member identification and account.";
			previousVersion_lazy = () -> TradeLeg6.mmNonClearingMember;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentificationAndAccount31.mmObject();
		}
	};
	@XmlElement(name = "TradDt", required = true)
	protected ISODateTime tradeDate;
	/**
	 * 
	 <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TradeLeg9
	 * TradeLeg9}</li>
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
	 * {@linkplain com.tools20022.repository.msg.TradeLeg6#mmTradeDate
	 * TradeLeg6.mmTradeDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTradeDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Trade.mmTradeDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeLeg9.mmObject();
			isDerived = false;
			xmlTag = "TradDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDate";
			definition = "Provides the date and time of trade transaction.";
			previousVersion_lazy = () -> TradeLeg6.mmTradeDate;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	@XmlElement(name = "TxDtAndTm")
	protected ISODateTime transactionDateAndTime;
	/**
	 * 
	 <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TradeLeg9
	 * TradeLeg9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxDtAndTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionDateAndTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time used to determine the price applicable to a trade. If the trade is registered \"after market\" hours, the trading price will the price of the day but the actual trade date will be the next working day."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTransactionDateAndTime = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Trade.mmTradeDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeLeg9.mmObject();
			isDerived = false;
			xmlTag = "TxDtAndTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionDateAndTime";
			definition = "Date and time used to determine the price applicable to a trade. If the trade is registered \"after market\" hours, the trading price will the price of the day but the actual trade date will be the next working day.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	@XmlElement(name = "SttlmDt")
	protected DateFormat15Choice settlementDate;
	/**
	 * 
	 <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TradeLeg9
	 * TradeLeg9}</li>
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
	 * {@linkplain com.tools20022.repository.msg.TradeLeg6#mmSettlementDate
	 * TradeLeg6.mmSettlementDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSettlementDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Obligation.mmRequestedSettlementDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeLeg9.mmObject();
			isDerived = false;
			xmlTag = "SttlmDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDate";
			definition = "Provides the contractual settlement date.";
			previousVersion_lazy = () -> TradeLeg6.mmSettlementDate;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat15Choice.mmObject();
		}
	};
	@XmlElement(name = "FinInstrmId", required = true)
	protected SecurityIdentification14 financialInstrumentIdentification;
	/**
	 * 
	 <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TradeLeg9
	 * TradeLeg9}</li>
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
	 * {@linkplain com.tools20022.repository.msg.TradeLeg6#mmFinancialInstrumentIdentification
	 * TradeLeg6.mmFinancialInstrumentIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFinancialInstrumentIdentification = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Security.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeLeg9.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentification";
			definition = "Provides details about the security identification.";
			previousVersion_lazy = () -> TradeLeg6.mmFinancialInstrumentIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SecurityIdentification14.mmObject();
		}
	};
	@XmlElement(name = "TradgCcy")
	protected CurrencyCode tradingCurrency;
	/**
	 * 
	 <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TradeLeg9
	 * TradeLeg9}</li>
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
	 * {@linkplain com.tools20022.repository.msg.TradeLeg6#mmTradingCurrency
	 * TradeLeg6.mmTradingCurrency}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTradingCurrency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> TradingMarket.mmTradingCurrency;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeLeg9.mmObject();
			isDerived = false;
			xmlTag = "TradgCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingCurrency";
			definition = "Specifies the ISO code of the trade currency.";
			previousVersion_lazy = () -> TradeLeg6.mmTradingCurrency;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	@XmlElement(name = "BuySellInd", required = true)
	protected Side1Code buySellIndicator;
	/**
	 * 
	 <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TradeLeg9
	 * TradeLeg9}</li>
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
	 * {@linkplain com.tools20022.repository.msg.TradeLeg6#mmBuySellIndicator
	 * TradeLeg6.mmBuySellIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBuySellIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmSide;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeLeg9.mmObject();
			isDerived = false;
			xmlTag = "BuySellInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BuySellIndicator";
			definition = "Identifies the trade leg indicator which gives the trade side (buy or sell).";
			previousVersion_lazy = () -> TradeLeg6.mmBuySellIndicator;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Side1Code.mmObject();
		}
	};
	@XmlElement(name = "TradQty", required = true)
	protected FinancialInstrumentQuantity1Choice tradeQuantity;
	/**
	 * 
	 <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TradeLeg9
	 * TradeLeg9}</li>
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
	 * {@linkplain com.tools20022.repository.msg.TradeLeg6#mmTradeQuantity
	 * TradeLeg6.mmTradeQuantity}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTradeQuantity = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesTrade.mmTradeQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeLeg9.mmObject();
			isDerived = false;
			xmlTag = "TradQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeQuantity";
			definition = "Identifies the quantity of the trade leg.";
			previousVersion_lazy = () -> TradeLeg6.mmTradeQuantity;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity1Choice.mmObject();
		}
	};
	@XmlElement(name = "DealPric", required = true)
	protected Price4 dealPrice;
	/**
	 * 
	 <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TradeLeg9
	 * TradeLeg9}</li>
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
	 * {@linkplain com.tools20022.repository.msg.TradeLeg6#mmDealPrice
	 * TradeLeg6.mmDealPrice}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDealPrice = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeExecution.mmDealPrice;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeLeg9.mmObject();
			isDerived = false;
			xmlTag = "DealPric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DealPrice";
			definition = "Specifies the price of the traded financial instrument.";
			previousVersion_lazy = () -> TradeLeg6.mmDealPrice;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Price4.mmObject();
		}
	};
	@XmlElement(name = "AcrdIntrstAmt")
	protected AmountAndDirection21 accruedInterestAmount;
	/**
	 * 
	 <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TradeLeg9
	 * TradeLeg9}</li>
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
	 * {@linkplain com.tools20022.repository.msg.TradeLeg6#mmAccruedInterestAmount
	 * TradeLeg6.mmAccruedInterestAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAccruedInterestAmount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Interest.mmAccruedInterestAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeLeg9.mmObject();
			isDerived = false;
			xmlTag = "AcrdIntrstAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccruedInterestAmount";
			definition = "Interest that has accumulated on a bond since the last interest payment up to, but not including, the settlement date.";
			previousVersion_lazy = () -> TradeLeg6.mmAccruedInterestAmount;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AmountAndDirection21.mmObject();
		}
	};
	@XmlElement(name = "PlcOfTrad", required = true)
	protected MarketIdentification84 placeOfTrade;
	/**
	 * 
	 <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TradeLeg9
	 * TradeLeg9}</li>
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
	 * {@linkplain com.tools20022.repository.msg.TradeLeg6#mmPlaceOfTrade
	 * TradeLeg6.mmPlaceOfTrade}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPlaceOfTrade = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> TradingMarket.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeLeg9.mmObject();
			isDerived = false;
			xmlTag = "PlcOfTrad";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfTrade";
			definition = "Place at which the security is traded.";
			previousVersion_lazy = () -> TradeLeg6.mmPlaceOfTrade;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.MarketIdentification84.mmObject();
		}
	};
	@XmlElement(name = "PlcOfListg")
	protected MarketIdentification85 placeOfListing;
	/**
	 * 
	 <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TradeLeg9
	 * TradeLeg9}</li>
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
	 * {@linkplain com.tools20022.repository.msg.TradeLeg6#mmPlaceOfListing
	 * TradeLeg6.mmPlaceOfListing}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPlaceOfListing = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Security.mmPlaceOfListing;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeLeg9.mmObject();
			isDerived = false;
			xmlTag = "PlcOfListg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfListing";
			definition = "Place at which the security is listed.";
			previousVersion_lazy = () -> TradeLeg6.mmPlaceOfListing;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.MarketIdentification85.mmObject();
		}
	};
	@XmlElement(name = "TradTp", required = true)
	protected TradeType1Code tradeType;
	/**
	 * 
	 <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TradeLeg9
	 * TradeLeg9}</li>
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
	 * {@linkplain com.tools20022.repository.msg.TradeLeg6#mmTradeType
	 * TradeLeg6.mmTradeType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTradeType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesTrade.mmTransactionType;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeLeg9.mmObject();
			isDerived = false;
			xmlTag = "TradTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeType";
			definition = "Identifies the type of trade transaction.";
			previousVersion_lazy = () -> TradeLeg6.mmTradeType;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TradeType1Code.mmObject();
		}
	};
	@XmlElement(name = "DerivRltdTrad")
	protected YesNoIndicator derivativeRelatedTrade;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TradeLeg9
	 * TradeLeg9}</li>
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
	 * {@linkplain com.tools20022.repository.msg.TradeLeg6#mmDerivativeRelatedTrade
	 * TradeLeg6.mmDerivativeRelatedTrade}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDerivativeRelatedTrade = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeLeg9.mmObject();
			isDerived = false;
			xmlTag = "DerivRltdTrad";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DerivativeRelatedTrade";
			definition = "Indicates that the trade is for settlement of an exercised derivatives contract.";
			previousVersion_lazy = () -> TradeLeg6.mmDerivativeRelatedTrade;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	@XmlElement(name = "Brkr")
	protected PartyIdentificationAndAccount100 broker;
	/**
	 * 
	 <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TradeLeg9
	 * TradeLeg9}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeLeg9.mmObject();
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
	@XmlElement(name = "TradgPty", required = true)
	protected PartyIdentification35Choice tradingParty;
	/**
	 * 
	 <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TradeLeg9
	 * TradeLeg9}</li>
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
	 * {@linkplain com.tools20022.repository.msg.TradeLeg6#mmTradingParty
	 * TradeLeg6.mmTradingParty}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTradingParty = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeLeg9.mmObject();
			isDerived = false;
			xmlTag = "TradgPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingParty";
			definition = "Provides the identification of the trading party.";
			previousVersion_lazy = () -> TradeLeg6.mmTradingParty;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PartyIdentification35Choice.mmObject();
		}
	};
	@XmlElement(name = "TradRegnOrgn")
	protected Max35Text tradeRegistrationOrigin;
	/**
	 * 
	 <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TradeLeg9
	 * TradeLeg9}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeLeg9.mmObject();
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
	@XmlElement(name = "TradgPtyAcct")
	protected SecuritiesAccount19 tradingPartyAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SecuritiesAccount19
	 * SecuritiesAccount19}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TradePartyRole#mmAccount
	 * TradePartyRole.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TradeLeg9
	 * TradeLeg9}</li>
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
	 * {@linkplain com.tools20022.repository.msg.TradeLeg6#mmTradingPartyAccount
	 * TradeLeg6.mmTradingPartyAccount}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTradingPartyAccount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> TradePartyRole.mmAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeLeg9.mmObject();
			isDerived = false;
			xmlTag = "TradgPtyAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingPartyAccount";
			definition = "Identifier of the trading participant's account at the trading venue using the venue's coding system.";
			previousVersion_lazy = () -> TradeLeg6.mmTradingPartyAccount;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SecuritiesAccount19.mmObject();
		}
	};
	@XmlElement(name = "TradgCpcty", required = true)
	protected TradingCapacity5Code tradingCapacity;
	/**
	 * 
	 <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TradeLeg9
	 * TradeLeg9}</li>
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
	 * {@linkplain com.tools20022.repository.msg.TradeLeg6#mmTradingCapacity
	 * TradeLeg6.mmTradingCapacity}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTradingCapacity = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> TradePartyRole.mmTradingPartyCapacity;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeLeg9.mmObject();
			isDerived = false;
			xmlTag = "TradgCpcty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingCapacity";
			definition = "Specifies the role of the trading party in the transaction.";
			previousVersion_lazy = () -> TradeLeg6.mmTradingCapacity;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TradingCapacity5Code.mmObject();
		}
	};
	@XmlElement(name = "TradPstngCd")
	protected TradePosting1Code tradePostingCode;
	/**
	 * 
	 <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TradeLeg9
	 * TradeLeg9}</li>
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
	 * {@linkplain com.tools20022.repository.msg.TradeLeg6#mmTradePostingCode
	 * TradeLeg6.mmTradePostingCode}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTradePostingCode = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Clearing.mmTradePostingType;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeLeg9.mmObject();
			isDerived = false;
			xmlTag = "TradPstngCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradePostingCode";
			definition = "Indicates how a trade is maintained in the clearing account.";
			previousVersion_lazy = () -> TradeLeg6.mmTradePostingCode;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TradePosting1Code.mmObject();
		}
	};
	@XmlElement(name = "SfkpgPlc")
	protected SafekeepingPlaceFormat7Choice safekeepingPlace;
	/**
	 * 
	 <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TradeLeg9
	 * TradeLeg9}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeLeg9.mmObject();
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
	@XmlElement(name = "SfkpgAcct")
	protected SecuritiesAccount19 safekeepingAccount;
	/**
	 * 
	 <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TradeLeg9
	 * TradeLeg9}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeLeg9.mmObject();
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
	@XmlElement(name = "SttlmDtls")
	protected Settlement1 settlementDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Settlement1
	 * Settlement1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#mmSecuritiesSettlement
	 * SecuritiesTradeExecution.mmSecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TradeLeg9
	 * TradeLeg9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides settlement details such as the settlement amount or the place of settlement."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TradeLeg6#mmSettlementDetails
	 * TradeLeg6.mmSettlementDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSettlementDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeExecution.mmSecuritiesSettlement;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeLeg9.mmObject();
			isDerived = false;
			xmlTag = "SttlmDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetails";
			definition = "Provides settlement details such as the settlement amount or the place of settlement.";
			previousVersion_lazy = () -> TradeLeg6.mmSettlementDetails;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Settlement1.mmObject();
		}
	};
	@XmlElement(name = "ClrDtls")
	protected Clearing4 clearingDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Clearing4 Clearing4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Clearing Clearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TradeLeg9
	 * TradeLeg9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClrDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides clearing details such as the non clearing member identification or the settlement netting (or not) eligibility code."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TradeLeg6#mmClearingDetails
	 * TradeLeg6.mmClearingDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmClearingDetails = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Clearing.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeLeg9.mmObject();
			isDerived = false;
			xmlTag = "ClrDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearingDetails";
			definition = "Provides clearing details such as the non clearing member identification or the settlement netting (or not) eligibility code.";
			previousVersion_lazy = () -> TradeLeg6.mmClearingDetails;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Clearing4.mmObject();
		}
	};
	@XmlElement(name = "GrssAmt")
	protected AmountAndDirection21 grossAmount;
	/**
	 * 
	 <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TradeLeg9
	 * TradeLeg9}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeLeg9.mmObject();
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

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TradeLeg9.mmMarginAccount, com.tools20022.repository.msg.TradeLeg9.mmDeliveryAccount, com.tools20022.repository.msg.TradeLeg9.mmTradeLegIdentification,
						com.tools20022.repository.msg.TradeLeg9.mmTradeIdentification, com.tools20022.repository.msg.TradeLeg9.mmTradeExecutionIdentification, com.tools20022.repository.msg.TradeLeg9.mmOrderIdentification,
						com.tools20022.repository.msg.TradeLeg9.mmAllocationIdentification, com.tools20022.repository.msg.TradeLeg9.mmNonClearingMember, com.tools20022.repository.msg.TradeLeg9.mmTradeDate,
						com.tools20022.repository.msg.TradeLeg9.mmTransactionDateAndTime, com.tools20022.repository.msg.TradeLeg9.mmSettlementDate, com.tools20022.repository.msg.TradeLeg9.mmFinancialInstrumentIdentification,
						com.tools20022.repository.msg.TradeLeg9.mmTradingCurrency, com.tools20022.repository.msg.TradeLeg9.mmBuySellIndicator, com.tools20022.repository.msg.TradeLeg9.mmTradeQuantity,
						com.tools20022.repository.msg.TradeLeg9.mmDealPrice, com.tools20022.repository.msg.TradeLeg9.mmAccruedInterestAmount, com.tools20022.repository.msg.TradeLeg9.mmPlaceOfTrade,
						com.tools20022.repository.msg.TradeLeg9.mmPlaceOfListing, com.tools20022.repository.msg.TradeLeg9.mmTradeType, com.tools20022.repository.msg.TradeLeg9.mmDerivativeRelatedTrade,
						com.tools20022.repository.msg.TradeLeg9.mmBroker, com.tools20022.repository.msg.TradeLeg9.mmTradingParty, com.tools20022.repository.msg.TradeLeg9.mmTradeRegistrationOrigin,
						com.tools20022.repository.msg.TradeLeg9.mmTradingPartyAccount, com.tools20022.repository.msg.TradeLeg9.mmTradingCapacity, com.tools20022.repository.msg.TradeLeg9.mmTradePostingCode,
						com.tools20022.repository.msg.TradeLeg9.mmSafekeepingPlace, com.tools20022.repository.msg.TradeLeg9.mmSafekeepingAccount, com.tools20022.repository.msg.TradeLeg9.mmSettlementDetails,
						com.tools20022.repository.msg.TradeLeg9.mmClearingDetails, com.tools20022.repository.msg.TradeLeg9.mmGrossAmount);
				trace_lazy = () -> SecuritiesTrade.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintDepositoryOrPlaceOfListingPresenceRule.forTradeLeg9);
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "TradeLeg9";
				definition = "Provides the trade leg details.";
				previousVersion_lazy = () -> TradeLeg6.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<SecuritiesAccount19> getMarginAccount() {
		return marginAccount == null ? Optional.empty() : Optional.of(marginAccount);
	}

	public TradeLeg9 setMarginAccount(com.tools20022.repository.msg.SecuritiesAccount19 marginAccount) {
		this.marginAccount = marginAccount;
		return this;
	}

	public Optional<SecuritiesAccount19> getDeliveryAccount() {
		return deliveryAccount == null ? Optional.empty() : Optional.of(deliveryAccount);
	}

	public TradeLeg9 setDeliveryAccount(com.tools20022.repository.msg.SecuritiesAccount19 deliveryAccount) {
		this.deliveryAccount = deliveryAccount;
		return this;
	}

	public Max35Text getTradeLegIdentification() {
		return tradeLegIdentification;
	}

	public TradeLeg9 setTradeLegIdentification(Max35Text tradeLegIdentification) {
		this.tradeLegIdentification = Objects.requireNonNull(tradeLegIdentification);
		return this;
	}

	public Optional<Max35Text> getTradeIdentification() {
		return tradeIdentification == null ? Optional.empty() : Optional.of(tradeIdentification);
	}

	public TradeLeg9 setTradeIdentification(Max35Text tradeIdentification) {
		this.tradeIdentification = tradeIdentification;
		return this;
	}

	public Max35Text getTradeExecutionIdentification() {
		return tradeExecutionIdentification;
	}

	public TradeLeg9 setTradeExecutionIdentification(Max35Text tradeExecutionIdentification) {
		this.tradeExecutionIdentification = Objects.requireNonNull(tradeExecutionIdentification);
		return this;
	}

	public Optional<Max35Text> getOrderIdentification() {
		return orderIdentification == null ? Optional.empty() : Optional.of(orderIdentification);
	}

	public TradeLeg9 setOrderIdentification(Max35Text orderIdentification) {
		this.orderIdentification = orderIdentification;
		return this;
	}

	public Optional<Max35Text> getAllocationIdentification() {
		return allocationIdentification == null ? Optional.empty() : Optional.of(allocationIdentification);
	}

	public TradeLeg9 setAllocationIdentification(Max35Text allocationIdentification) {
		this.allocationIdentification = allocationIdentification;
		return this;
	}

	public Optional<PartyIdentificationAndAccount31> getNonClearingMember() {
		return nonClearingMember == null ? Optional.empty() : Optional.of(nonClearingMember);
	}

	public TradeLeg9 setNonClearingMember(com.tools20022.repository.msg.PartyIdentificationAndAccount31 nonClearingMember) {
		this.nonClearingMember = nonClearingMember;
		return this;
	}

	public ISODateTime getTradeDate() {
		return tradeDate;
	}

	public TradeLeg9 setTradeDate(ISODateTime tradeDate) {
		this.tradeDate = Objects.requireNonNull(tradeDate);
		return this;
	}

	public Optional<ISODateTime> getTransactionDateAndTime() {
		return transactionDateAndTime == null ? Optional.empty() : Optional.of(transactionDateAndTime);
	}

	public TradeLeg9 setTransactionDateAndTime(ISODateTime transactionDateAndTime) {
		this.transactionDateAndTime = transactionDateAndTime;
		return this;
	}

	public Optional<DateFormat15Choice> getSettlementDate() {
		return settlementDate == null ? Optional.empty() : Optional.of(settlementDate);
	}

	public TradeLeg9 setSettlementDate(DateFormat15Choice settlementDate) {
		this.settlementDate = settlementDate;
		return this;
	}

	public SecurityIdentification14 getFinancialInstrumentIdentification() {
		return financialInstrumentIdentification;
	}

	public TradeLeg9 setFinancialInstrumentIdentification(com.tools20022.repository.msg.SecurityIdentification14 financialInstrumentIdentification) {
		this.financialInstrumentIdentification = Objects.requireNonNull(financialInstrumentIdentification);
		return this;
	}

	public Optional<CurrencyCode> getTradingCurrency() {
		return tradingCurrency == null ? Optional.empty() : Optional.of(tradingCurrency);
	}

	public TradeLeg9 setTradingCurrency(CurrencyCode tradingCurrency) {
		this.tradingCurrency = tradingCurrency;
		return this;
	}

	public Side1Code getBuySellIndicator() {
		return buySellIndicator;
	}

	public TradeLeg9 setBuySellIndicator(Side1Code buySellIndicator) {
		this.buySellIndicator = Objects.requireNonNull(buySellIndicator);
		return this;
	}

	public FinancialInstrumentQuantity1Choice getTradeQuantity() {
		return tradeQuantity;
	}

	public TradeLeg9 setTradeQuantity(FinancialInstrumentQuantity1Choice tradeQuantity) {
		this.tradeQuantity = Objects.requireNonNull(tradeQuantity);
		return this;
	}

	public Price4 getDealPrice() {
		return dealPrice;
	}

	public TradeLeg9 setDealPrice(com.tools20022.repository.msg.Price4 dealPrice) {
		this.dealPrice = Objects.requireNonNull(dealPrice);
		return this;
	}

	public Optional<AmountAndDirection21> getAccruedInterestAmount() {
		return accruedInterestAmount == null ? Optional.empty() : Optional.of(accruedInterestAmount);
	}

	public TradeLeg9 setAccruedInterestAmount(com.tools20022.repository.msg.AmountAndDirection21 accruedInterestAmount) {
		this.accruedInterestAmount = accruedInterestAmount;
		return this;
	}

	public MarketIdentification84 getPlaceOfTrade() {
		return placeOfTrade;
	}

	public TradeLeg9 setPlaceOfTrade(com.tools20022.repository.msg.MarketIdentification84 placeOfTrade) {
		this.placeOfTrade = Objects.requireNonNull(placeOfTrade);
		return this;
	}

	public Optional<MarketIdentification85> getPlaceOfListing() {
		return placeOfListing == null ? Optional.empty() : Optional.of(placeOfListing);
	}

	public TradeLeg9 setPlaceOfListing(com.tools20022.repository.msg.MarketIdentification85 placeOfListing) {
		this.placeOfListing = placeOfListing;
		return this;
	}

	public TradeType1Code getTradeType() {
		return tradeType;
	}

	public TradeLeg9 setTradeType(TradeType1Code tradeType) {
		this.tradeType = Objects.requireNonNull(tradeType);
		return this;
	}

	public Optional<YesNoIndicator> getDerivativeRelatedTrade() {
		return derivativeRelatedTrade == null ? Optional.empty() : Optional.of(derivativeRelatedTrade);
	}

	public TradeLeg9 setDerivativeRelatedTrade(YesNoIndicator derivativeRelatedTrade) {
		this.derivativeRelatedTrade = derivativeRelatedTrade;
		return this;
	}

	public Optional<PartyIdentificationAndAccount100> getBroker() {
		return broker == null ? Optional.empty() : Optional.of(broker);
	}

	public TradeLeg9 setBroker(com.tools20022.repository.msg.PartyIdentificationAndAccount100 broker) {
		this.broker = broker;
		return this;
	}

	public PartyIdentification35Choice getTradingParty() {
		return tradingParty;
	}

	public TradeLeg9 setTradingParty(PartyIdentification35Choice tradingParty) {
		this.tradingParty = Objects.requireNonNull(tradingParty);
		return this;
	}

	public Optional<Max35Text> getTradeRegistrationOrigin() {
		return tradeRegistrationOrigin == null ? Optional.empty() : Optional.of(tradeRegistrationOrigin);
	}

	public TradeLeg9 setTradeRegistrationOrigin(Max35Text tradeRegistrationOrigin) {
		this.tradeRegistrationOrigin = tradeRegistrationOrigin;
		return this;
	}

	public Optional<SecuritiesAccount19> getTradingPartyAccount() {
		return tradingPartyAccount == null ? Optional.empty() : Optional.of(tradingPartyAccount);
	}

	public TradeLeg9 setTradingPartyAccount(com.tools20022.repository.msg.SecuritiesAccount19 tradingPartyAccount) {
		this.tradingPartyAccount = tradingPartyAccount;
		return this;
	}

	public TradingCapacity5Code getTradingCapacity() {
		return tradingCapacity;
	}

	public TradeLeg9 setTradingCapacity(TradingCapacity5Code tradingCapacity) {
		this.tradingCapacity = Objects.requireNonNull(tradingCapacity);
		return this;
	}

	public Optional<TradePosting1Code> getTradePostingCode() {
		return tradePostingCode == null ? Optional.empty() : Optional.of(tradePostingCode);
	}

	public TradeLeg9 setTradePostingCode(TradePosting1Code tradePostingCode) {
		this.tradePostingCode = tradePostingCode;
		return this;
	}

	public Optional<SafekeepingPlaceFormat7Choice> getSafekeepingPlace() {
		return safekeepingPlace == null ? Optional.empty() : Optional.of(safekeepingPlace);
	}

	public TradeLeg9 setSafekeepingPlace(SafekeepingPlaceFormat7Choice safekeepingPlace) {
		this.safekeepingPlace = safekeepingPlace;
		return this;
	}

	public Optional<SecuritiesAccount19> getSafekeepingAccount() {
		return safekeepingAccount == null ? Optional.empty() : Optional.of(safekeepingAccount);
	}

	public TradeLeg9 setSafekeepingAccount(com.tools20022.repository.msg.SecuritiesAccount19 safekeepingAccount) {
		this.safekeepingAccount = safekeepingAccount;
		return this;
	}

	public Optional<Settlement1> getSettlementDetails() {
		return settlementDetails == null ? Optional.empty() : Optional.of(settlementDetails);
	}

	public TradeLeg9 setSettlementDetails(com.tools20022.repository.msg.Settlement1 settlementDetails) {
		this.settlementDetails = settlementDetails;
		return this;
	}

	public Optional<Clearing4> getClearingDetails() {
		return clearingDetails == null ? Optional.empty() : Optional.of(clearingDetails);
	}

	public TradeLeg9 setClearingDetails(com.tools20022.repository.msg.Clearing4 clearingDetails) {
		this.clearingDetails = clearingDetails;
		return this;
	}

	public Optional<AmountAndDirection21> getGrossAmount() {
		return grossAmount == null ? Optional.empty() : Optional.of(grossAmount);
	}

	public TradeLeg9 setGrossAmount(com.tools20022.repository.msg.AmountAndDirection21 grossAmount) {
		this.grossAmount = grossAmount;
		return this;
	}
}