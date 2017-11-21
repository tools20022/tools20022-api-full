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
import com.tools20022.repository.choice.DateFormat11Choice;
import com.tools20022.repository.choice.FinancialInstrumentQuantity1Choice;
import com.tools20022.repository.choice.SettlementParties2Choice;
import com.tools20022.repository.choice.TradeDate3Choice;
import com.tools20022.repository.codeset.ClearingAccountType1Code;
import com.tools20022.repository.codeset.DeliveryReceiptType2Code;
import com.tools20022.repository.codeset.ReceiveDelivery1Code;
import com.tools20022.repository.codeset.TradingCapacity5Code;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides details about the settlement obligation.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementObligation4#mmSettlementObligationIdentification
 * SettlementObligation4.mmSettlementObligationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementObligation4#mmFinancialInstrumentIdentification
 * SettlementObligation4.mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementObligation4#mmIntendedSettlementDate
 * SettlementObligation4.mmIntendedSettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementObligation4#mmQuantity
 * SettlementObligation4.mmQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementObligation4#mmSettlementAmount
 * SettlementObligation4.mmSettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementObligation4#mmPlaceOfTrade
 * SettlementObligation4.mmPlaceOfTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementObligation4#mmTradeDate
 * SettlementObligation4.mmTradeDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementObligation4#mmTradingCapacity
 * SettlementObligation4.mmTradingCapacity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementObligation4#mmClearingAccountType
 * SettlementObligation4.mmClearingAccountType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementObligation4#mmSecuritiesMovementType
 * SettlementObligation4.mmSecuritiesMovementType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementObligation4#mmPayment
 * SettlementObligation4.mmPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementObligation4#mmSettlementParties
 * SettlementObligation4.mmSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementObligation4#mmAdditionalSettlementObligationDetails
 * SettlementObligation4.mmAdditionalSettlementObligationDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
 * SecuritiesSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SettlementObligation4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides details about the settlement obligation."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementObligation8
 * SettlementObligation8}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "SettlementObligation4", propOrder = {"settlementObligationIdentification", "financialInstrumentIdentification", "intendedSettlementDate", "quantity", "settlementAmount", "placeOfTrade", "tradeDate", "tradingCapacity",
		"clearingAccountType", "securitiesMovementType", "payment", "settlementParties", "additionalSettlementObligationDetails"})
public class SettlementObligation4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text settlementObligationIdentification;
	/**
	 * Provides the identification of the settlement obligation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation4
	 * SettlementObligation4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmOblgtnId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementObligationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the identification of the settlement obligation."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation8#mmSettlementObligationIdentification
	 * SettlementObligation8.mmSettlementObligationIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSettlementObligationIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SettlementObligation4.mmObject();
			isDerived = false;
			xmlTag = "SttlmOblgtnId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementObligationIdentification";
			definition = "Provides the identification of the settlement obligation.";
			nextVersions_lazy = () -> Arrays.asList(SettlementObligation8.mmSettlementObligationIdentification);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
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
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation4
	 * SettlementObligation4}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation8#mmFinancialInstrumentIdentification
	 * SettlementObligation8.mmFinancialInstrumentIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFinancialInstrumentIdentification = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Security.mmIdentification;
			componentContext_lazy = () -> SettlementObligation4.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentification";
			definition = "Provides details about the security identification.";
			nextVersions_lazy = () -> Arrays.asList(SettlementObligation8.mmFinancialInstrumentIdentification);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SecurityIdentification14.mmObject();
		}
	};
	protected DateFormat11Choice intendedSettlementDate;
	/**
	 * Intended settlement date of the position.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat11Choice
	 * DateFormat11Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSettlementDate
	 * SecuritiesSettlement.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation4
	 * SettlementObligation4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntnddSttlmDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntendedSettlementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Intended settlement date of the position."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation8#mmIntendedSettlementDate
	 * SettlementObligation8.mmIntendedSettlementDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIntendedSettlementDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmSettlementDate;
			componentContext_lazy = () -> SettlementObligation4.mmObject();
			isDerived = false;
			xmlTag = "IntnddSttlmDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntendedSettlementDate";
			definition = "Intended settlement date of the position.";
			nextVersions_lazy = () -> Arrays.asList(SettlementObligation8.mmIntendedSettlementDate);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DateFormat11Choice.mmObject();
		}
	};
	protected FinancialInstrumentQuantity1Choice quantity;
	/**
	 * Specifies the quantity related to the settlement obligation.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmTransferredQuantity
	 * SecuritiesTransfer.mmTransferredQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation4
	 * SettlementObligation4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Qty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Quantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the quantity related to the settlement obligation."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation8#mmQuantity
	 * SettlementObligation8.mmQuantity}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmQuantity = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesTransfer.mmTransferredQuantity;
			componentContext_lazy = () -> SettlementObligation4.mmObject();
			isDerived = false;
			xmlTag = "Qty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Quantity";
			definition = "Specifies the quantity related to the settlement obligation.";
			nextVersions_lazy = () -> Arrays.asList(SettlementObligation8.mmQuantity);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity1Choice.mmObject();
		}
	};
	protected AmountAndDirection27 settlementAmount;
	/**
	 * Provides the total amount to be settled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection27
	 * AmountAndDirection27}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSettlementAmount
	 * SecuritiesSettlement.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation4
	 * SettlementObligation4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the total amount to be settled."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation8#mmSettlementAmount
	 * SettlementObligation8.mmSettlementAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSettlementAmount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmSettlementAmount;
			componentContext_lazy = () -> SettlementObligation4.mmObject();
			isDerived = false;
			xmlTag = "SttlmAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementAmount";
			definition = "Provides the total amount to be settled.";
			nextVersions_lazy = () -> Arrays.asList(SettlementObligation8.mmSettlementAmount);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AmountAndDirection27.mmObject();
		}
	};
	protected MarketIdentification20 placeOfTrade;
	/**
	 * Place at which the security is traded.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.MarketIdentification20
	 * MarketIdentification20}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.TradingMarket TradingMarket}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation4
	 * SettlementObligation4}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation8#mmPlaceOfTrade
	 * SettlementObligation8.mmPlaceOfTrade}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPlaceOfTrade = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> TradingMarket.mmObject();
			componentContext_lazy = () -> SettlementObligation4.mmObject();
			isDerived = false;
			xmlTag = "PlcOfTrad";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfTrade";
			definition = "Place at which the security is traded.";
			nextVersions_lazy = () -> Arrays.asList(SettlementObligation8.mmPlaceOfTrade);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> com.tools20022.repository.msg.MarketIdentification20.mmObject();
		}
	};
	protected TradeDate3Choice tradeDate;
	/**
	 * Provides the trade date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.TradeDate3Choice
	 * TradeDate3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Trade#mmTradeDateTime
	 * Trade.mmTradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation4
	 * SettlementObligation4}</li>
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
	 * definition} = "Provides the trade date."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation8#mmTradeDate
	 * SettlementObligation8.mmTradeDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTradeDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Trade.mmTradeDateTime;
			componentContext_lazy = () -> SettlementObligation4.mmObject();
			isDerived = false;
			xmlTag = "TradDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDate";
			definition = "Provides the trade date.";
			nextVersions_lazy = () -> Arrays.asList(SettlementObligation8.mmTradeDate);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> TradeDate3Choice.mmObject();
		}
	};
	protected TradingCapacity5Code tradingCapacity;
	/**
	 * Identifies the trading capacity of seller.
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
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation4
	 * SettlementObligation4}</li>
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
	 * definition} = "Identifies the trading capacity of seller."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation8#mmTradingCapacity
	 * SettlementObligation8.mmTradingCapacity}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTradingCapacity = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> TradePartyRole.mmTradingPartyCapacity;
			componentContext_lazy = () -> SettlementObligation4.mmObject();
			isDerived = false;
			xmlTag = "TradgCpcty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingCapacity";
			definition = "Identifies the trading capacity of seller.";
			nextVersions_lazy = () -> Arrays.asList(SettlementObligation8.mmTradingCapacity);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TradingCapacity5Code.mmObject();
		}
	};
	protected ClearingAccountType1Code clearingAccountType;
	/**
	 * Specifies the clearing account type.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ClearingAccountType1Code
	 * ClearingAccountType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#mmClearingAccountType
	 * SecuritiesAccount.mmClearingAccountType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation4
	 * SettlementObligation4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClrAcctTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingAccountType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the clearing account type."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation8#mmClearingAccountType
	 * SettlementObligation8.mmClearingAccountType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmClearingAccountType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesAccount.mmClearingAccountType;
			componentContext_lazy = () -> SettlementObligation4.mmObject();
			isDerived = false;
			xmlTag = "ClrAcctTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearingAccountType";
			definition = "Specifies the clearing account type.";
			nextVersions_lazy = () -> Arrays.asList(SettlementObligation8.mmClearingAccountType);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ClearingAccountType1Code.mmObject();
		}
	};
	protected ReceiveDelivery1Code securitiesMovementType;
	/**
	 * Indicates if the obligation will result in a receive or a delivery of
	 * securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ReceiveDelivery1Code
	 * ReceiveDelivery1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSecuritiesMovementType
	 * SecuritiesSettlement.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation4
	 * SettlementObligation4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesMvmntTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMovementType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates if the obligation will result in a receive or a delivery of securities."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation8#mmSecuritiesMovementType
	 * SettlementObligation8.mmSecuritiesMovementType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSecuritiesMovementType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmSecuritiesMovementType;
			componentContext_lazy = () -> SettlementObligation4.mmObject();
			isDerived = false;
			xmlTag = "SctiesMvmntTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMovementType";
			definition = "Indicates if the obligation will result in a receive or a delivery of securities.";
			nextVersions_lazy = () -> Arrays.asList(SettlementObligation8.mmSecuritiesMovementType);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ReceiveDelivery1Code.mmObject();
		}
	};
	protected DeliveryReceiptType2Code payment;
	/**
	 * Specifies the amount to be paid under a specific obligation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DeliveryReceiptType2Code
	 * DeliveryReceiptType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSettlementType
	 * SecuritiesSettlement.mmSettlementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation4
	 * SettlementObligation4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Pmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Payment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the amount to be paid under a specific obligation."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation8#mmPayment
	 * SettlementObligation8.mmPayment}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPayment = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmSettlementType;
			componentContext_lazy = () -> SettlementObligation4.mmObject();
			isDerived = false;
			xmlTag = "Pmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Payment";
			definition = "Specifies the amount to be paid under a specific obligation.";
			nextVersions_lazy = () -> Arrays.asList(SettlementObligation8.mmPayment);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DeliveryReceiptType2Code.mmObject();
		}
	};
	protected SettlementParties2Choice settlementParties;
	/**
	 * Provides details on the parties that are part of the settlement chain.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.SettlementParties2Choice
	 * SettlementParties2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmPartyRole
	 * SecuritiesSettlement.mmPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation4
	 * SettlementObligation4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmPties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementParties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details on the parties that are part of the settlement chain."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation8#mmSettlementParties
	 * SettlementObligation8.mmSettlementParties}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSettlementParties = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmPartyRole;
			componentContext_lazy = () -> SettlementObligation4.mmObject();
			isDerived = false;
			xmlTag = "SttlmPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementParties";
			definition = "Provides details on the parties that are part of the settlement chain.";
			nextVersions_lazy = () -> Arrays.asList(SettlementObligation8.mmSettlementParties);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SettlementParties2Choice.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.SettlementObligation5> additionalSettlementObligationDetails;
	/**
	 * Provides additional information about the settlement obligation details.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SettlementObligation5
	 * SettlementObligation5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#mmSecuritiesDeliveryObligation
	 * SecuritiesTradeExecution.mmSecuritiesDeliveryObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation4
	 * SettlementObligation4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlSttlmOblgtnDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalSettlementObligationDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides additional information about the settlement obligation details."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation8#mmAdditionalSettlementObligationDetails
	 * SettlementObligation8.mmAdditionalSettlementObligationDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAdditionalSettlementObligationDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeExecution.mmSecuritiesDeliveryObligation;
			componentContext_lazy = () -> SettlementObligation4.mmObject();
			isDerived = false;
			xmlTag = "AddtlSttlmOblgtnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalSettlementObligationDetails";
			definition = "Provides additional information about the settlement obligation details.";
			nextVersions_lazy = () -> Arrays.asList(SettlementObligation8.mmAdditionalSettlementObligationDetails);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SettlementObligation5.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(SettlementObligation4.mmSettlementObligationIdentification, SettlementObligation4.mmFinancialInstrumentIdentification, SettlementObligation4.mmIntendedSettlementDate,
						SettlementObligation4.mmQuantity, SettlementObligation4.mmSettlementAmount, SettlementObligation4.mmPlaceOfTrade, SettlementObligation4.mmTradeDate, SettlementObligation4.mmTradingCapacity,
						SettlementObligation4.mmClearingAccountType, SettlementObligation4.mmSecuritiesMovementType, SettlementObligation4.mmPayment, SettlementObligation4.mmSettlementParties,
						SettlementObligation4.mmAdditionalSettlementObligationDetails);
				trace_lazy = () -> SecuritiesSettlement.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "SettlementObligation4";
				definition = "Provides details about the settlement obligation.";
				nextVersions_lazy = () -> Arrays.asList(SettlementObligation8.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "SttlmOblgtnId", required = true)
	public Max35Text getSettlementObligationIdentification() {
		return settlementObligationIdentification;
	}

	public void setSettlementObligationIdentification(Max35Text settlementObligationIdentification) {
		this.settlementObligationIdentification = settlementObligationIdentification;
	}

	@XmlElement(name = "FinInstrmId", required = true)
	public SecurityIdentification14 getFinancialInstrumentIdentification() {
		return financialInstrumentIdentification;
	}

	public void setFinancialInstrumentIdentification(com.tools20022.repository.msg.SecurityIdentification14 financialInstrumentIdentification) {
		this.financialInstrumentIdentification = financialInstrumentIdentification;
	}

	@XmlElement(name = "IntnddSttlmDt", required = true)
	public DateFormat11Choice getIntendedSettlementDate() {
		return intendedSettlementDate;
	}

	public void setIntendedSettlementDate(DateFormat11Choice intendedSettlementDate) {
		this.intendedSettlementDate = intendedSettlementDate;
	}

	@XmlElement(name = "Qty", required = true)
	public FinancialInstrumentQuantity1Choice getQuantity() {
		return quantity;
	}

	public void setQuantity(FinancialInstrumentQuantity1Choice quantity) {
		this.quantity = quantity;
	}

	@XmlElement(name = "SttlmAmt", required = true)
	public AmountAndDirection27 getSettlementAmount() {
		return settlementAmount;
	}

	public void setSettlementAmount(com.tools20022.repository.msg.AmountAndDirection27 settlementAmount) {
		this.settlementAmount = settlementAmount;
	}

	@XmlElement(name = "PlcOfTrad", required = true)
	public MarketIdentification20 getPlaceOfTrade() {
		return placeOfTrade;
	}

	public void setPlaceOfTrade(com.tools20022.repository.msg.MarketIdentification20 placeOfTrade) {
		this.placeOfTrade = placeOfTrade;
	}

	@XmlElement(name = "TradDt")
	public TradeDate3Choice getTradeDate() {
		return tradeDate;
	}

	public void setTradeDate(TradeDate3Choice tradeDate) {
		this.tradeDate = tradeDate;
	}

	@XmlElement(name = "TradgCpcty")
	public TradingCapacity5Code getTradingCapacity() {
		return tradingCapacity;
	}

	public void setTradingCapacity(TradingCapacity5Code tradingCapacity) {
		this.tradingCapacity = tradingCapacity;
	}

	@XmlElement(name = "ClrAcctTp")
	public ClearingAccountType1Code getClearingAccountType() {
		return clearingAccountType;
	}

	public void setClearingAccountType(ClearingAccountType1Code clearingAccountType) {
		this.clearingAccountType = clearingAccountType;
	}

	@XmlElement(name = "SctiesMvmntTp")
	public ReceiveDelivery1Code getSecuritiesMovementType() {
		return securitiesMovementType;
	}

	public void setSecuritiesMovementType(ReceiveDelivery1Code securitiesMovementType) {
		this.securitiesMovementType = securitiesMovementType;
	}

	@XmlElement(name = "Pmt", required = true)
	public DeliveryReceiptType2Code getPayment() {
		return payment;
	}

	public void setPayment(DeliveryReceiptType2Code payment) {
		this.payment = payment;
	}

	@XmlElement(name = "SttlmPties")
	public SettlementParties2Choice getSettlementParties() {
		return settlementParties;
	}

	public void setSettlementParties(SettlementParties2Choice settlementParties) {
		this.settlementParties = settlementParties;
	}

	@XmlElement(name = "AddtlSttlmOblgtnDtls")
	public List<SettlementObligation5> getAdditionalSettlementObligationDetails() {
		return additionalSettlementObligationDetails;
	}

	public void setAdditionalSettlementObligationDetails(List<com.tools20022.repository.msg.SettlementObligation5> additionalSettlementObligationDetails) {
		this.additionalSettlementObligationDetails = additionalSettlementObligationDetails;
	}
}