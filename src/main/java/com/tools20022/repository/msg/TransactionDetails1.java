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

import com.tools20022.metamodel.ext.FIXSynonym;
import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.OrderDriverCode;
import com.tools20022.repository.codeset.TradingCapacity3Code;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max70Text;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Details of the transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails1#mmTradeReference
 * TransactionDetails1.mmTradeReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails1#mmAssociatedTradeReference
 * TransactionDetails1.mmAssociatedTradeReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails1#mmPlaceOfTrade
 * TransactionDetails1.mmPlaceOfTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails1#mmTradeDateTime
 * TransactionDetails1.mmTradeDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails1#mmFinancialInstrumentDetails
 * TransactionDetails1.mmFinancialInstrumentDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionDetails1#mmSide
 * TransactionDetails1.mmSide}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails1#mmTransactionReportMarker
 * TransactionDetails1.mmTransactionReportMarker}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails1#mmCounterparty
 * TransactionDetails1.mmCounterparty}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionDetails1#mmClient
 * TransactionDetails1.mmClient}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionDetails1#mmCapacity
 * TransactionDetails1.mmCapacity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails1#mmExecutedTradePrice
 * TransactionDetails1.mmExecutedTradePrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails1#mmExecutedTradeQuantity
 * TransactionDetails1.mmExecutedTradeQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails1#mmSettlementAmount
 * TransactionDetails1.mmSettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails1#mmSettlementDate
 * TransactionDetails1.mmSettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails1#mmProxyHolder
 * TransactionDetails1.mmProxyHolder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails1#mmAdditionalInformation
 * TransactionDetails1.mmAdditionalInformation}</li>
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
 * {@linkplain com.tools20022.repository.constraints.ConstraintClientRule#forTransactionDetails1
 * ConstraintClientRule.forTransactionDetails1}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TransactionDetails1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Details of the transaction."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TransactionDetails1", propOrder = {"tradeReference", "associatedTradeReference", "placeOfTrade", "tradeDateTime", "financialInstrumentDetails", "side", "transactionReportMarker", "counterparty", "client", "capacity",
		"executedTradePrice", "executedTradeQuantity", "settlementAmount", "settlementDate", "proxyHolder", "additionalInformation"})
public class TransactionDetails1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TradRef", required = true)
	protected Max70Text tradeReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TradeIdentification#mmIdentification
	 * TradeIdentification.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails1
	 * TransactionDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification assigned to a trade. This is the reference generated by a firm or the reference allocated by the executing system if the trade was executed automatically. "
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTradeReference = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> TradeIdentification.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionDetails1.mmObject();
			isDerived = false;
			xmlTag = "TradRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeReference";
			definition = "Unique identification assigned to a trade. This is the reference generated by a firm or the reference allocated by the executing system if the trade was executed automatically. ";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};
	@XmlElement(name = "AssoctdTradRef")
	protected List<Max70Text> associatedTradeReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TradeIdentification#mmIdentification
	 * TradeIdentification.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails1
	 * TransactionDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AssoctdTradRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AssociatedTradeReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference that links to other trades that are/will be sent, eg for straddles where put and call legs need to be reported together."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAssociatedTradeReference = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> TradeIdentification.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionDetails1.mmObject();
			isDerived = false;
			xmlTag = "AssoctdTradRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AssociatedTradeReference";
			definition = "Reference that links to other trades that are/will be sent, eg for straddles where put and call legs need to be reported together.";
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};
	@XmlElement(name = "PlcOfTrad", required = true)
	protected PlaceOfTradeIdentification2Choice placeOfTrade;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PlaceOfTradeIdentification2Choice
	 * PlaceOfTradeIdentification2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmTradingMarket
	 * Security.mmTradingMarket}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails1
	 * TransactionDetails1}</li>
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
	 * definition} =
	 * "Identifies the execution venue. In the case of an exchange or a Multilateral Trading Facility (MTF), this should be identified using a MIC code. In the case of a systematic internaliser, place of trade should be identified using a BIC code.\n"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPlaceOfTrade = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Security.mmTradingMarket;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionDetails1.mmObject();
			isDerived = false;
			xmlTag = "PlcOfTrad";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfTrade";
			definition = "Identifies the execution venue. In the case of an exchange or a Multilateral Trading Facility (MTF), this should be identified using a MIC code. In the case of a systematic internaliser, place of trade should be identified using a BIC code.\n";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> PlaceOfTradeIdentification2Choice.mmObject();
		}
	};
	@XmlElement(name = "TradDtTm", required = true)
	protected ISODateTime tradeDateTime;
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
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails1
	 * TransactionDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradDtTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the date/time on which the trade was executed.\n"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTradeDateTime = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Trade.mmTradeDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionDetails1.mmObject();
			isDerived = false;
			xmlTag = "TradDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDateTime";
			definition = "Specifies the date/time on which the trade was executed.\n";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	@XmlElement(name = "FinInstrmDtls", required = true)
	protected FinancialInstrument14 financialInstrumentDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.FinancialInstrument14
	 * FinancialInstrument14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmSecurity
	 * SecuritiesTrade.mmSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails1
	 * TransactionDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinInstrmDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details of the financial instrument for which the transaction report is being sent."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFinancialInstrumentDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesTrade.mmSecurity;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionDetails1.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentDetails";
			definition = "Provides details of the financial instrument for which the transaction report is being sent.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.FinancialInstrument14.mmObject();
		}
	};
	@XmlElement(name = "Sd", required = true)
	protected OrderDriverCode side;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.OrderDriverCode
	 * OrderDriverCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmSide
	 * SecuritiesOrder.mmSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails1
	 * TransactionDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Side"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies whether the transaction was a buy or a sell from the perspective of the reporting firm.\n"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSide = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmSide;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionDetails1.mmObject();
			isDerived = false;
			xmlTag = "Sd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Side";
			definition = "Identifies whether the transaction was a buy or a sell from the perspective of the reporting firm.\n";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> OrderDriverCode.mmObject();
		}
	};
	@XmlElement(name = "TxRptMrkr")
	protected List<PartyIdentification24Choice> transactionReportMarker;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification24Choice
	 * PartyIdentification24Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails1
	 * TransactionDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxRptMrkr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionReportMarker"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the regulator(s) to whom the transaction report must be sent. "
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTransactionReportMarker = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionDetails1.mmObject();
			isDerived = false;
			xmlTag = "TxRptMrkr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionReportMarker";
			definition = "Identifies the regulator(s) to whom the transaction report must be sent. ";
			maxOccurs = 5;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification24Choice.mmObject();
		}
	};
	@XmlElement(name = "CtrPty", required = true)
	protected PartyIdentification11Choice counterparty;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification11Choice
	 * PartyIdentification11Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails1
	 * TransactionDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtrPty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Counterparty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides details of the counterparty.\n"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCounterparty = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionDetails1.mmObject();
			isDerived = false;
			xmlTag = "CtrPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Counterparty";
			definition = "Provides details of the counterparty.\n";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PartyIdentification11Choice.mmObject();
		}
	};
	@XmlElement(name = "Clnt")
	protected PartyIdentification23 client;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification23
	 * PartyIdentification23}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails1
	 * TransactionDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Clnt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Client"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides details of the client. \n"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmClient = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionDetails1.mmObject();
			isDerived = false;
			xmlTag = "Clnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Client";
			definition = "Provides details of the client. \n";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentification23.mmObject();
		}
	};
	@XmlElement(name = "Cpcty", required = true)
	protected TradingCapacity3Code capacity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TradingCapacity3Code
	 * TradingCapacity3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TradePartyRole#mmTradingPartyCapacity
	 * TradePartyRole.mmTradingPartyCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails1
	 * TransactionDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cpcty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Capacity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the trading capacity of the firm reporting the transaction, eg  Agent or Principal.\n"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCapacity = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> TradePartyRole.mmTradingPartyCapacity;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionDetails1.mmObject();
			isDerived = false;
			xmlTag = "Cpcty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Capacity";
			definition = "Identifies the trading capacity of the firm reporting the transaction, eg  Agent or Principal.\n";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TradingCapacity3Code.mmObject();
		}
	};
	@XmlElement(name = "ExctdTradPric", required = true)
	protected PriceRateOrAmountChoice executedTradePrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PriceRateOrAmountChoice
	 * PriceRateOrAmountChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmTradePrice
	 * SecuritiesTrade.mmTradePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails1
	 * TransactionDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ExctdTradPric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :90a::DEAL, FIXSynonym: 6</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExecutedTradePrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the currency and price at which the trade has been executed, excluding commission or accrued interest.\n"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExecutedTradePrice = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesTrade.mmTradePrice;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionDetails1.mmObject();
			isDerived = false;
			xmlTag = "ExctdTradPric";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":90a::DEAL"), new FIXSynonym(this, "6"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExecutedTradePrice";
			definition = "Specifies the currency and price at which the trade has been executed, excluding commission or accrued interest.\n";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> PriceRateOrAmountChoice.mmObject();
		}
	};
	@XmlElement(name = "ExctdTradQty", required = true)
	protected UnitOrFaceAmountChoice executedTradeQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.UnitOrFaceAmountChoice
	 * UnitOrFaceAmountChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmTradeQuantity
	 * SecuritiesTrade.mmTradeQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails1
	 * TransactionDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ExctdTradQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :36B::TRAD, FIXSynonym: 14</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExecutedTradeQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity of financial instrument executed by the trading party.\n"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExecutedTradeQuantity = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesTrade.mmTradeQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionDetails1.mmObject();
			isDerived = false;
			xmlTag = "ExctdTradQty";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":36B::TRAD"), new FIXSynonym(this, "14"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExecutedTradeQuantity";
			definition = "Quantity of financial instrument executed by the trading party.\n";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> UnitOrFaceAmountChoice.mmObject();
		}
	};
	@XmlElement(name = "SttlmAmt")
	protected ActiveCurrencyAndAmount settlementAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSettlementAmount
	 * SecuritiesSettlement.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails1
	 * TransactionDetails1}</li>
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
	 * definition} = "The total consideration or value."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSettlementAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmSettlementAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionDetails1.mmObject();
			isDerived = false;
			xmlTag = "SttlmAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementAmount";
			definition = "The total consideration or value.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	@XmlElement(name = "SttlmDt")
	protected ISODateTime settlementDate;
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
	 * {@linkplain com.tools20022.repository.entity.Obligation#mmRequestedSettlementDate
	 * Obligation.mmRequestedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails1
	 * TransactionDetails1}</li>
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
	 * definition} = "Identifies the intended settlement date."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSettlementDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Obligation.mmRequestedSettlementDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionDetails1.mmObject();
			isDerived = false;
			xmlTag = "SttlmDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDate";
			definition = "Identifies the intended settlement date.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	@XmlElement(name = "PrxyHldr")
	protected PartyIdentification2Choice proxyHolder;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification2Choice
	 * PartyIdentification2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails1
	 * TransactionDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrxyHldr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProxyHolder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details of the person/organisation that has the power of attorney. \n"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmProxyHolder = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionDetails1.mmObject();
			isDerived = false;
			xmlTag = "PrxyHldr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProxyHolder";
			definition = "Provides details of the person/organisation that has the power of attorney. \n";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification2Choice.mmObject();
		}
	};
	@XmlElement(name = "AddtlInf")
	protected Max350Text additionalInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails1
	 * TransactionDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Additional domestic regulatory transaction information."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAdditionalInformation = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionDetails1.mmObject();
			isDerived = false;
			xmlTag = "AddtlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformation";
			definition = "Additional domestic regulatory transaction information.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransactionDetails1.mmTradeReference, com.tools20022.repository.msg.TransactionDetails1.mmAssociatedTradeReference,
						com.tools20022.repository.msg.TransactionDetails1.mmPlaceOfTrade, com.tools20022.repository.msg.TransactionDetails1.mmTradeDateTime, com.tools20022.repository.msg.TransactionDetails1.mmFinancialInstrumentDetails,
						com.tools20022.repository.msg.TransactionDetails1.mmSide, com.tools20022.repository.msg.TransactionDetails1.mmTransactionReportMarker, com.tools20022.repository.msg.TransactionDetails1.mmCounterparty,
						com.tools20022.repository.msg.TransactionDetails1.mmClient, com.tools20022.repository.msg.TransactionDetails1.mmCapacity, com.tools20022.repository.msg.TransactionDetails1.mmExecutedTradePrice,
						com.tools20022.repository.msg.TransactionDetails1.mmExecutedTradeQuantity, com.tools20022.repository.msg.TransactionDetails1.mmSettlementAmount, com.tools20022.repository.msg.TransactionDetails1.mmSettlementDate,
						com.tools20022.repository.msg.TransactionDetails1.mmProxyHolder, com.tools20022.repository.msg.TransactionDetails1.mmAdditionalInformation);
				trace_lazy = () -> SecuritiesTrade.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintClientRule.forTransactionDetails1);
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "TransactionDetails1";
				definition = "Details of the transaction.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max70Text getTradeReference() {
		return tradeReference;
	}

	public TransactionDetails1 setTradeReference(Max70Text tradeReference) {
		this.tradeReference = Objects.requireNonNull(tradeReference);
		return this;
	}

	public List<Max70Text> getAssociatedTradeReference() {
		return associatedTradeReference == null ? associatedTradeReference = new ArrayList<>() : associatedTradeReference;
	}

	public TransactionDetails1 setAssociatedTradeReference(List<Max70Text> associatedTradeReference) {
		this.associatedTradeReference = Objects.requireNonNull(associatedTradeReference);
		return this;
	}

	public PlaceOfTradeIdentification2Choice getPlaceOfTrade() {
		return placeOfTrade;
	}

	public TransactionDetails1 setPlaceOfTrade(PlaceOfTradeIdentification2Choice placeOfTrade) {
		this.placeOfTrade = Objects.requireNonNull(placeOfTrade);
		return this;
	}

	public ISODateTime getTradeDateTime() {
		return tradeDateTime;
	}

	public TransactionDetails1 setTradeDateTime(ISODateTime tradeDateTime) {
		this.tradeDateTime = Objects.requireNonNull(tradeDateTime);
		return this;
	}

	public FinancialInstrument14 getFinancialInstrumentDetails() {
		return financialInstrumentDetails;
	}

	public TransactionDetails1 setFinancialInstrumentDetails(com.tools20022.repository.msg.FinancialInstrument14 financialInstrumentDetails) {
		this.financialInstrumentDetails = Objects.requireNonNull(financialInstrumentDetails);
		return this;
	}

	public OrderDriverCode getSide() {
		return side;
	}

	public TransactionDetails1 setSide(OrderDriverCode side) {
		this.side = Objects.requireNonNull(side);
		return this;
	}

	public List<PartyIdentification24Choice> getTransactionReportMarker() {
		return transactionReportMarker == null ? transactionReportMarker = new ArrayList<>() : transactionReportMarker;
	}

	public TransactionDetails1 setTransactionReportMarker(List<PartyIdentification24Choice> transactionReportMarker) {
		this.transactionReportMarker = Objects.requireNonNull(transactionReportMarker);
		return this;
	}

	public PartyIdentification11Choice getCounterparty() {
		return counterparty;
	}

	public TransactionDetails1 setCounterparty(PartyIdentification11Choice counterparty) {
		this.counterparty = Objects.requireNonNull(counterparty);
		return this;
	}

	public Optional<PartyIdentification23> getClient() {
		return client == null ? Optional.empty() : Optional.of(client);
	}

	public TransactionDetails1 setClient(com.tools20022.repository.msg.PartyIdentification23 client) {
		this.client = client;
		return this;
	}

	public TradingCapacity3Code getCapacity() {
		return capacity;
	}

	public TransactionDetails1 setCapacity(TradingCapacity3Code capacity) {
		this.capacity = Objects.requireNonNull(capacity);
		return this;
	}

	public PriceRateOrAmountChoice getExecutedTradePrice() {
		return executedTradePrice;
	}

	public TransactionDetails1 setExecutedTradePrice(PriceRateOrAmountChoice executedTradePrice) {
		this.executedTradePrice = Objects.requireNonNull(executedTradePrice);
		return this;
	}

	public UnitOrFaceAmountChoice getExecutedTradeQuantity() {
		return executedTradeQuantity;
	}

	public TransactionDetails1 setExecutedTradeQuantity(UnitOrFaceAmountChoice executedTradeQuantity) {
		this.executedTradeQuantity = Objects.requireNonNull(executedTradeQuantity);
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getSettlementAmount() {
		return settlementAmount == null ? Optional.empty() : Optional.of(settlementAmount);
	}

	public TransactionDetails1 setSettlementAmount(ActiveCurrencyAndAmount settlementAmount) {
		this.settlementAmount = settlementAmount;
		return this;
	}

	public Optional<ISODateTime> getSettlementDate() {
		return settlementDate == null ? Optional.empty() : Optional.of(settlementDate);
	}

	public TransactionDetails1 setSettlementDate(ISODateTime settlementDate) {
		this.settlementDate = settlementDate;
		return this;
	}

	public Optional<PartyIdentification2Choice> getProxyHolder() {
		return proxyHolder == null ? Optional.empty() : Optional.of(proxyHolder);
	}

	public TransactionDetails1 setProxyHolder(PartyIdentification2Choice proxyHolder) {
		this.proxyHolder = proxyHolder;
		return this;
	}

	public Optional<Max350Text> getAdditionalInformation() {
		return additionalInformation == null ? Optional.empty() : Optional.of(additionalInformation);
	}

	public TransactionDetails1 setAdditionalInformation(Max350Text additionalInformation) {
		this.additionalInformation = additionalInformation;
		return this;
	}
}