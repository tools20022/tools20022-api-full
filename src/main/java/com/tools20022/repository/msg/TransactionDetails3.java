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
import com.tools20022.repository.area.auth.RegulatoryTransactionReportCancellationRequestV02;
import com.tools20022.repository.area.auth.RegulatoryTransactionReportV02;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.OrderDriverCode;
import com.tools20022.repository.codeset.TradingCapacity3Code;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max70Text;
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
 * Details of the transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails3#mmTradeReference
 * TransactionDetails3.mmTradeReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails3#mmAssociatedTradeReference
 * TransactionDetails3.mmAssociatedTradeReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails3#mmPlaceOfTrade
 * TransactionDetails3.mmPlaceOfTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails3#mmTradeDateTime
 * TransactionDetails3.mmTradeDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails3#mmFinancialInstrumentDetails
 * TransactionDetails3.mmFinancialInstrumentDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionDetails3#mmSide
 * TransactionDetails3.mmSide}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails3#mmTransactionReportMarker
 * TransactionDetails3.mmTransactionReportMarker}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails3#mmCounterparty
 * TransactionDetails3.mmCounterparty}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionDetails3#mmClient
 * TransactionDetails3.mmClient}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionDetails3#mmCapacity
 * TransactionDetails3.mmCapacity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails3#mmExecutedTradePrice
 * TransactionDetails3.mmExecutedTradePrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails3#mmExecutedTradeQuantity
 * TransactionDetails3.mmExecutedTradeQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails3#mmSettlementAmount
 * TransactionDetails3.mmSettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails3#mmSettlementDate
 * TransactionDetails3.mmSettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails3#mmProxyHolder
 * TransactionDetails3.mmProxyHolder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails3#mmAdditionalInformation
 * TransactionDetails3.mmAdditionalInformation}</li>
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
 * {@linkplain com.tools20022.repository.area.auth.RegulatoryTransactionReportV02#mmTransactionDetails
 * RegulatoryTransactionReportV02.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.RegulatoryTransactionReportCancellationRequestV02#mmCancellationByTransactionDetails
 * RegulatoryTransactionReportCancellationRequestV02.
 * mmCancellationByTransactionDetails}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TransactionDetails3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Details of the transaction."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "TransactionDetails3", propOrder = {"tradeReference", "associatedTradeReference", "placeOfTrade", "tradeDateTime", "financialInstrumentDetails", "side", "transactionReportMarker", "counterparty", "client", "capacity",
		"executedTradePrice", "executedTradeQuantity", "settlementAmount", "settlementDate", "proxyHolder", "additionalInformation"})
public class TransactionDetails3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max70Text tradeReference;
	/**
	 * Unique identification assigned to a trade. This is the reference
	 * generated by a firm or the reference allocated by the executing system if
	 * the trade was executed automatically.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails3
	 * TransactionDetails3}</li>
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
	 * "Unique identification assigned to a trade. This is the reference generated by a firm or the reference allocated by the executing system if the trade was executed automatically."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTradeReference = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> TradeIdentification.mmIdentification;
			componentContext_lazy = () -> TransactionDetails3.mmObject();
			isDerived = false;
			xmlTag = "TradRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeReference";
			definition = "Unique identification assigned to a trade. This is the reference generated by a firm or the reference allocated by the executing system if the trade was executed automatically.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};
	protected List<Max70Text> associatedTradeReference;
	/**
	 * Reference that links to other trades that are/will be sent, eg for
	 * straddles where put and call legs need to be reported together.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails3
	 * TransactionDetails3}</li>
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
			componentContext_lazy = () -> TransactionDetails3.mmObject();
			isDerived = false;
			xmlTag = "AssoctdTradRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AssociatedTradeReference";
			definition = "Reference that links to other trades that are/will be sent, eg for straddles where put and call legs need to be reported together.";
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};
	protected PlaceOfTradeIdentification2Choice placeOfTrade;
	/**
	 * Identifies the execution venue. In the case of an exchange or a
	 * Multilateral Trading Facility (MTF), this should be identified using a
	 * MIC code. In the case of a systematic internaliser, place of trade should
	 * be identified using a BIC code.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails3
	 * TransactionDetails3}</li>
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
	 * "Identifies the execution venue. In the case of an exchange or a Multilateral Trading Facility (MTF), this should be identified using a MIC code. In the case of a systematic internaliser, place of trade should be identified using a BIC code."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPlaceOfTrade = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Security.mmTradingMarket;
			componentContext_lazy = () -> TransactionDetails3.mmObject();
			isDerived = false;
			xmlTag = "PlcOfTrad";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfTrade";
			definition = "Identifies the execution venue. In the case of an exchange or a Multilateral Trading Facility (MTF), this should be identified using a MIC code. In the case of a systematic internaliser, place of trade should be identified using a BIC code.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> PlaceOfTradeIdentification2Choice.mmObject();
		}
	};
	protected ISODateTime tradeDateTime;
	/**
	 * Specifies the date/time on which the trade was executed.
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
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails3
	 * TransactionDetails3}</li>
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
	 * definition} = "Specifies the date/time on which the trade was executed."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTradeDateTime = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Trade.mmTradeDateTime;
			componentContext_lazy = () -> TransactionDetails3.mmObject();
			isDerived = false;
			xmlTag = "TradDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDateTime";
			definition = "Specifies the date/time on which the trade was executed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected FinancialInstrument15 financialInstrumentDetails;
	/**
	 * Provides details of the financial instrument for which the transaction
	 * report is being sent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.FinancialInstrument15
	 * FinancialInstrument15}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmSecurity
	 * SecuritiesTrade.mmSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails3
	 * TransactionDetails3}</li>
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
			componentContext_lazy = () -> TransactionDetails3.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentDetails";
			definition = "Provides details of the financial instrument for which the transaction report is being sent.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.FinancialInstrument15.mmObject();
		}
	};
	protected OrderDriverCode side;
	/**
	 * Identifies whether the transaction was a buy or a sell from the
	 * perspective of the reporting firm.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails3
	 * TransactionDetails3}</li>
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
	 * "Identifies whether the transaction was a buy or a sell from the perspective of the reporting firm."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSide = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmSide;
			componentContext_lazy = () -> TransactionDetails3.mmObject();
			isDerived = false;
			xmlTag = "Sd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Side";
			definition = "Identifies whether the transaction was a buy or a sell from the perspective of the reporting firm.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> OrderDriverCode.mmObject();
		}
	};
	protected List<PartyIdentification24Choice> transactionReportMarker;
	/**
	 * Identifies the regulator(s) to whom the transaction report must be sent.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails3
	 * TransactionDetails3}</li>
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
	 * "Identifies the regulator(s) to whom the transaction report must be sent."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTransactionReportMarker = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> TransactionDetails3.mmObject();
			isDerived = false;
			xmlTag = "TxRptMrkr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionReportMarker";
			definition = "Identifies the regulator(s) to whom the transaction report must be sent.";
			maxOccurs = 10;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification24Choice.mmObject();
		}
	};
	protected PartyIdentification11Choice counterparty;
	/**
	 * Provides details of the counterparty.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails3
	 * TransactionDetails3}</li>
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
	 * definition} = "Provides details of the counterparty."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCounterparty = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> TransactionDetails3.mmObject();
			isDerived = false;
			xmlTag = "CtrPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Counterparty";
			definition = "Provides details of the counterparty.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PartyIdentification11Choice.mmObject();
		}
	};
	protected PartyIdentification23 client;
	/**
	 * Provides details of the client.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails3
	 * TransactionDetails3}</li>
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
	 * definition} = "Provides details of the client."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmClient = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> TransactionDetails3.mmObject();
			isDerived = false;
			xmlTag = "Clnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Client";
			definition = "Provides details of the client.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentification23.mmObject();
		}
	};
	protected TradingCapacity3Code capacity;
	/**
	 * Identifies the trading capacity of the firm reporting the transaction, eg
	 * Agent or Principal.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails3
	 * TransactionDetails3}</li>
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
	 * "Identifies the trading capacity of the firm reporting the transaction, eg  Agent or Principal."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCapacity = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> TradePartyRole.mmTradingPartyCapacity;
			componentContext_lazy = () -> TransactionDetails3.mmObject();
			isDerived = false;
			xmlTag = "Cpcty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Capacity";
			definition = "Identifies the trading capacity of the firm reporting the transaction, eg  Agent or Principal.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TradingCapacity3Code.mmObject();
		}
	};
	protected PriceRateOrAmountChoice executedTradePrice;
	/**
	 * Specifies the currency and price at which the trade has been executed,
	 * excluding commission or accrued interest.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#mmDealPrice
	 * SecuritiesTradeExecution.mmDealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails3
	 * TransactionDetails3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ExctdTradPric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExecutedTradePrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the currency and price at which the trade has been executed, excluding commission or accrued interest."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExecutedTradePrice = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeExecution.mmDealPrice;
			componentContext_lazy = () -> TransactionDetails3.mmObject();
			isDerived = false;
			xmlTag = "ExctdTradPric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExecutedTradePrice";
			definition = "Specifies the currency and price at which the trade has been executed, excluding commission or accrued interest.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> PriceRateOrAmountChoice.mmObject();
		}
	};
	protected UnitOrFaceAmountChoice executedTradeQuantity;
	/**
	 * Quantity of financial instrument executed by the trading party.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#mmExecutedTradeQuantity
	 * SecuritiesTradeExecution.mmExecutedTradeQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails3
	 * TransactionDetails3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ExctdTradQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExecutedTradeQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity of financial instrument executed by the trading party."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExecutedTradeQuantity = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeExecution.mmExecutedTradeQuantity;
			componentContext_lazy = () -> TransactionDetails3.mmObject();
			isDerived = false;
			xmlTag = "ExctdTradQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExecutedTradeQuantity";
			definition = "Quantity of financial instrument executed by the trading party.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> UnitOrFaceAmountChoice.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount settlementAmount;
	/**
	 * The total consideration or value.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails3
	 * TransactionDetails3}</li>
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
			componentContext_lazy = () -> TransactionDetails3.mmObject();
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
	protected ISODateTime settlementDate;
	/**
	 * Identifies the intended settlement date.
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
	 * {@linkplain com.tools20022.repository.entity.Obligation#mmRequestedSettlementDate
	 * Obligation.mmRequestedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails3
	 * TransactionDetails3}</li>
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
			componentContext_lazy = () -> TransactionDetails3.mmObject();
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
	protected PartyIdentification2Choice proxyHolder;
	/**
	 * Provides details of the person/organisation that has the power of
	 * attorney.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails3
	 * TransactionDetails3}</li>
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
	 * "Provides details of the person/organisation that has the power of attorney."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmProxyHolder = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> TransactionDetails3.mmObject();
			isDerived = false;
			xmlTag = "PrxyHldr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProxyHolder";
			definition = "Provides details of the person/organisation that has the power of attorney.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification2Choice.mmObject();
		}
	};
	protected Max350Text additionalInformation;
	/**
	 * Additional domestic regulatory transaction information.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails3
	 * TransactionDetails3}</li>
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
			componentContext_lazy = () -> TransactionDetails3.mmObject();
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
				messageElement_lazy = () -> Arrays.asList(TransactionDetails3.mmTradeReference, TransactionDetails3.mmAssociatedTradeReference, TransactionDetails3.mmPlaceOfTrade, TransactionDetails3.mmTradeDateTime,
						TransactionDetails3.mmFinancialInstrumentDetails, TransactionDetails3.mmSide, TransactionDetails3.mmTransactionReportMarker, TransactionDetails3.mmCounterparty, TransactionDetails3.mmClient,
						TransactionDetails3.mmCapacity, TransactionDetails3.mmExecutedTradePrice, TransactionDetails3.mmExecutedTradeQuantity, TransactionDetails3.mmSettlementAmount, TransactionDetails3.mmSettlementDate,
						TransactionDetails3.mmProxyHolder, TransactionDetails3.mmAdditionalInformation);
				messageBuildingBlock_lazy = () -> Arrays.asList(RegulatoryTransactionReportV02.mmTransactionDetails, RegulatoryTransactionReportCancellationRequestV02.mmCancellationByTransactionDetails);
				trace_lazy = () -> SecuritiesTrade.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TransactionDetails3";
				definition = "Details of the transaction.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "TradRef", required = true)
	public Max70Text getTradeReference() {
		return tradeReference;
	}

	public void setTradeReference(Max70Text tradeReference) {
		this.tradeReference = tradeReference;
	}

	@XmlElement(name = "AssoctdTradRef")
	public List<Max70Text> getAssociatedTradeReference() {
		return associatedTradeReference;
	}

	public void setAssociatedTradeReference(List<Max70Text> associatedTradeReference) {
		this.associatedTradeReference = associatedTradeReference;
	}

	@XmlElement(name = "PlcOfTrad", required = true)
	public PlaceOfTradeIdentification2Choice getPlaceOfTrade() {
		return placeOfTrade;
	}

	public void setPlaceOfTrade(PlaceOfTradeIdentification2Choice placeOfTrade) {
		this.placeOfTrade = placeOfTrade;
	}

	@XmlElement(name = "TradDtTm", required = true)
	public ISODateTime getTradeDateTime() {
		return tradeDateTime;
	}

	public void setTradeDateTime(ISODateTime tradeDateTime) {
		this.tradeDateTime = tradeDateTime;
	}

	@XmlElement(name = "FinInstrmDtls", required = true)
	public FinancialInstrument15 getFinancialInstrumentDetails() {
		return financialInstrumentDetails;
	}

	public void setFinancialInstrumentDetails(com.tools20022.repository.msg.FinancialInstrument15 financialInstrumentDetails) {
		this.financialInstrumentDetails = financialInstrumentDetails;
	}

	@XmlElement(name = "Sd", required = true)
	public OrderDriverCode getSide() {
		return side;
	}

	public void setSide(OrderDriverCode side) {
		this.side = side;
	}

	@XmlElement(name = "TxRptMrkr")
	public List<PartyIdentification24Choice> getTransactionReportMarker() {
		return transactionReportMarker;
	}

	public void setTransactionReportMarker(List<PartyIdentification24Choice> transactionReportMarker) {
		this.transactionReportMarker = transactionReportMarker;
	}

	@XmlElement(name = "CtrPty", required = true)
	public PartyIdentification11Choice getCounterparty() {
		return counterparty;
	}

	public void setCounterparty(PartyIdentification11Choice counterparty) {
		this.counterparty = counterparty;
	}

	@XmlElement(name = "Clnt")
	public PartyIdentification23 getClient() {
		return client;
	}

	public void setClient(com.tools20022.repository.msg.PartyIdentification23 client) {
		this.client = client;
	}

	@XmlElement(name = "Cpcty", required = true)
	public TradingCapacity3Code getCapacity() {
		return capacity;
	}

	public void setCapacity(TradingCapacity3Code capacity) {
		this.capacity = capacity;
	}

	@XmlElement(name = "ExctdTradPric", required = true)
	public PriceRateOrAmountChoice getExecutedTradePrice() {
		return executedTradePrice;
	}

	public void setExecutedTradePrice(PriceRateOrAmountChoice executedTradePrice) {
		this.executedTradePrice = executedTradePrice;
	}

	@XmlElement(name = "ExctdTradQty", required = true)
	public UnitOrFaceAmountChoice getExecutedTradeQuantity() {
		return executedTradeQuantity;
	}

	public void setExecutedTradeQuantity(UnitOrFaceAmountChoice executedTradeQuantity) {
		this.executedTradeQuantity = executedTradeQuantity;
	}

	@XmlElement(name = "SttlmAmt")
	public ActiveCurrencyAndAmount getSettlementAmount() {
		return settlementAmount;
	}

	public void setSettlementAmount(ActiveCurrencyAndAmount settlementAmount) {
		this.settlementAmount = settlementAmount;
	}

	@XmlElement(name = "SttlmDt")
	public ISODateTime getSettlementDate() {
		return settlementDate;
	}

	public void setSettlementDate(ISODateTime settlementDate) {
		this.settlementDate = settlementDate;
	}

	@XmlElement(name = "PrxyHldr")
	public PartyIdentification2Choice getProxyHolder() {
		return proxyHolder;
	}

	public void setProxyHolder(PartyIdentification2Choice proxyHolder) {
		this.proxyHolder = proxyHolder;
	}

	@XmlElement(name = "AddtlInf")
	public Max350Text getAdditionalInformation() {
		return additionalInformation;
	}

	public void setAdditionalInformation(Max350Text additionalInformation) {
		this.additionalInformation = additionalInformation;
	}
}