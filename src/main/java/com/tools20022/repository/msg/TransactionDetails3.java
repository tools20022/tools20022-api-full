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
import com.tools20022.repository.msg.FinancialInstrument15;
import com.tools20022.repository.msg.PartyIdentification23;
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintClientRule#forTransactionDetails3
 * ConstraintClientRule.forTransactionDetails3}</li>
 * </ul>
 * </li>
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
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TransactionDetails3", propOrder = {"tradeReference", "associatedTradeReference", "placeOfTrade", "tradeDateTime", "financialInstrumentDetails", "side", "transactionReportMarker", "counterparty", "client", "capacity",
		"executedTradePrice", "executedTradeQuantity", "settlementAmount", "settlementDate", "proxyHolder", "additionalInformation"})
public class TransactionDetails3 {

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
	public static final MMMessageAttribute<TransactionDetails3, Max70Text> mmTradeReference = new MMMessageAttribute<TransactionDetails3, Max70Text>() {
		{
			businessElementTrace_lazy = () -> TradeIdentification.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionDetails3.mmObject();
			isDerived = false;
			xmlTag = "TradRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeReference";
			definition = "Unique identification assigned to a trade. This is the reference generated by a firm or the reference allocated by the executing system if the trade was executed automatically.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max70Text.mmObject();
		}

		@Override
		public Max70Text getValue(TransactionDetails3 obj) {
			return obj.getTradeReference();
		}

		@Override
		public void setValue(TransactionDetails3 obj, Max70Text value) {
			obj.setTradeReference(value);
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
	public static final MMMessageAttribute<TransactionDetails3, List<Max70Text>> mmAssociatedTradeReference = new MMMessageAttribute<TransactionDetails3, List<Max70Text>>() {
		{
			businessElementTrace_lazy = () -> TradeIdentification.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionDetails3.mmObject();
			isDerived = false;
			xmlTag = "AssoctdTradRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AssociatedTradeReference";
			definition = "Reference that links to other trades that are/will be sent, eg for straddles where put and call legs need to be reported together.";
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}

		@Override
		public List<Max70Text> getValue(TransactionDetails3 obj) {
			return obj.getAssociatedTradeReference();
		}

		@Override
		public void setValue(TransactionDetails3 obj, List<Max70Text> value) {
			obj.setAssociatedTradeReference(value);
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
	public static final MMMessageAttribute<TransactionDetails3, PlaceOfTradeIdentification2Choice> mmPlaceOfTrade = new MMMessageAttribute<TransactionDetails3, PlaceOfTradeIdentification2Choice>() {
		{
			businessElementTrace_lazy = () -> Security.mmTradingMarket;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionDetails3.mmObject();
			isDerived = false;
			xmlTag = "PlcOfTrad";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfTrade";
			definition = "Identifies the execution venue. In the case of an exchange or a Multilateral Trading Facility (MTF), this should be identified using a MIC code. In the case of a systematic internaliser, place of trade should be identified using a BIC code.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> PlaceOfTradeIdentification2Choice.mmObject();
		}

		@Override
		public PlaceOfTradeIdentification2Choice getValue(TransactionDetails3 obj) {
			return obj.getPlaceOfTrade();
		}

		@Override
		public void setValue(TransactionDetails3 obj, PlaceOfTradeIdentification2Choice value) {
			obj.setPlaceOfTrade(value);
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
	public static final MMMessageAttribute<TransactionDetails3, ISODateTime> mmTradeDateTime = new MMMessageAttribute<TransactionDetails3, ISODateTime>() {
		{
			businessElementTrace_lazy = () -> Trade.mmTradeDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionDetails3.mmObject();
			isDerived = false;
			xmlTag = "TradDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDateTime";
			definition = "Specifies the date/time on which the trade was executed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(TransactionDetails3 obj) {
			return obj.getTradeDateTime();
		}

		@Override
		public void setValue(TransactionDetails3 obj, ISODateTime value) {
			obj.setTradeDateTime(value);
		}
	};
	@XmlElement(name = "FinInstrmDtls", required = true)
	protected FinancialInstrument15 financialInstrumentDetails;
	/**
	 * 
	 <p>
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
	public static final MMMessageAssociationEnd<TransactionDetails3, FinancialInstrument15> mmFinancialInstrumentDetails = new MMMessageAssociationEnd<TransactionDetails3, FinancialInstrument15>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTrade.mmSecurity;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionDetails3.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentDetails";
			definition = "Provides details of the financial instrument for which the transaction report is being sent.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> FinancialInstrument15.mmObject();
		}

		@Override
		public FinancialInstrument15 getValue(TransactionDetails3 obj) {
			return obj.getFinancialInstrumentDetails();
		}

		@Override
		public void setValue(TransactionDetails3 obj, FinancialInstrument15 value) {
			obj.setFinancialInstrumentDetails(value);
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
	public static final MMMessageAttribute<TransactionDetails3, OrderDriverCode> mmSide = new MMMessageAttribute<TransactionDetails3, OrderDriverCode>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmSide;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionDetails3.mmObject();
			isDerived = false;
			xmlTag = "Sd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Side";
			definition = "Identifies whether the transaction was a buy or a sell from the perspective of the reporting firm.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> OrderDriverCode.mmObject();
		}

		@Override
		public OrderDriverCode getValue(TransactionDetails3 obj) {
			return obj.getSide();
		}

		@Override
		public void setValue(TransactionDetails3 obj, OrderDriverCode value) {
			obj.setSide(value);
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
	public static final MMMessageAssociationEnd<TransactionDetails3, List<PartyIdentification24Choice>> mmTransactionReportMarker = new MMMessageAssociationEnd<TransactionDetails3, List<PartyIdentification24Choice>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionDetails3.mmObject();
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

		@Override
		public List<PartyIdentification24Choice> getValue(TransactionDetails3 obj) {
			return obj.getTransactionReportMarker();
		}

		@Override
		public void setValue(TransactionDetails3 obj, List<PartyIdentification24Choice> value) {
			obj.setTransactionReportMarker(value);
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
	public static final MMMessageAssociationEnd<TransactionDetails3, PartyIdentification11Choice> mmCounterparty = new MMMessageAssociationEnd<TransactionDetails3, PartyIdentification11Choice>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionDetails3.mmObject();
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

		@Override
		public PartyIdentification11Choice getValue(TransactionDetails3 obj) {
			return obj.getCounterparty();
		}

		@Override
		public void setValue(TransactionDetails3 obj, PartyIdentification11Choice value) {
			obj.setCounterparty(value);
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
	public static final MMMessageAssociationEnd<TransactionDetails3, Optional<PartyIdentification23>> mmClient = new MMMessageAssociationEnd<TransactionDetails3, Optional<PartyIdentification23>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionDetails3.mmObject();
			isDerived = false;
			xmlTag = "Clnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Client";
			definition = "Provides details of the client.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification23.mmObject();
		}

		@Override
		public Optional<PartyIdentification23> getValue(TransactionDetails3 obj) {
			return obj.getClient();
		}

		@Override
		public void setValue(TransactionDetails3 obj, Optional<PartyIdentification23> value) {
			obj.setClient(value.orElse(null));
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
	 * "Identifies the trading capacity of the firm reporting the transaction, eg Agent or Principal."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TransactionDetails3, TradingCapacity3Code> mmCapacity = new MMMessageAttribute<TransactionDetails3, TradingCapacity3Code>() {
		{
			businessElementTrace_lazy = () -> TradePartyRole.mmTradingPartyCapacity;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionDetails3.mmObject();
			isDerived = false;
			xmlTag = "Cpcty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Capacity";
			definition = "Identifies the trading capacity of the firm reporting the transaction, eg Agent or Principal.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TradingCapacity3Code.mmObject();
		}

		@Override
		public TradingCapacity3Code getValue(TransactionDetails3 obj) {
			return obj.getCapacity();
		}

		@Override
		public void setValue(TransactionDetails3 obj, TradingCapacity3Code value) {
			obj.setCapacity(value);
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
	 * "Specifies the currency and price at which the trade has been executed, excluding commission or accrued interest."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TransactionDetails3, PriceRateOrAmountChoice> mmExecutedTradePrice = new MMMessageAttribute<TransactionDetails3, PriceRateOrAmountChoice>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeExecution.mmDealPrice;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionDetails3.mmObject();
			isDerived = false;
			xmlTag = "ExctdTradPric";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":90a::DEAL"), new FIXSynonym(this, "6"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExecutedTradePrice";
			definition = "Specifies the currency and price at which the trade has been executed, excluding commission or accrued interest.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> PriceRateOrAmountChoice.mmObject();
		}

		@Override
		public PriceRateOrAmountChoice getValue(TransactionDetails3 obj) {
			return obj.getExecutedTradePrice();
		}

		@Override
		public void setValue(TransactionDetails3 obj, PriceRateOrAmountChoice value) {
			obj.setExecutedTradePrice(value);
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
	 * "Quantity of financial instrument executed by the trading party."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TransactionDetails3, UnitOrFaceAmountChoice> mmExecutedTradeQuantity = new MMMessageAttribute<TransactionDetails3, UnitOrFaceAmountChoice>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeExecution.mmExecutedTradeQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionDetails3.mmObject();
			isDerived = false;
			xmlTag = "ExctdTradQty";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":36B::TRAD"), new FIXSynonym(this, "14"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExecutedTradeQuantity";
			definition = "Quantity of financial instrument executed by the trading party.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> UnitOrFaceAmountChoice.mmObject();
		}

		@Override
		public UnitOrFaceAmountChoice getValue(TransactionDetails3 obj) {
			return obj.getExecutedTradeQuantity();
		}

		@Override
		public void setValue(TransactionDetails3 obj, UnitOrFaceAmountChoice value) {
			obj.setExecutedTradeQuantity(value);
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
	public static final MMMessageAttribute<TransactionDetails3, Optional<ActiveCurrencyAndAmount>> mmSettlementAmount = new MMMessageAttribute<TransactionDetails3, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmSettlementAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionDetails3.mmObject();
			isDerived = false;
			xmlTag = "SttlmAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementAmount";
			definition = "The total consideration or value.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(TransactionDetails3 obj) {
			return obj.getSettlementAmount();
		}

		@Override
		public void setValue(TransactionDetails3 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setSettlementAmount(value.orElse(null));
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
	public static final MMMessageAttribute<TransactionDetails3, Optional<ISODateTime>> mmSettlementDate = new MMMessageAttribute<TransactionDetails3, Optional<ISODateTime>>() {
		{
			businessElementTrace_lazy = () -> Obligation.mmRequestedSettlementDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionDetails3.mmObject();
			isDerived = false;
			xmlTag = "SttlmDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDate";
			definition = "Identifies the intended settlement date.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public Optional<ISODateTime> getValue(TransactionDetails3 obj) {
			return obj.getSettlementDate();
		}

		@Override
		public void setValue(TransactionDetails3 obj, Optional<ISODateTime> value) {
			obj.setSettlementDate(value.orElse(null));
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
	public static final MMMessageAssociationEnd<TransactionDetails3, Optional<PartyIdentification2Choice>> mmProxyHolder = new MMMessageAssociationEnd<TransactionDetails3, Optional<PartyIdentification2Choice>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionDetails3.mmObject();
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

		@Override
		public Optional<PartyIdentification2Choice> getValue(TransactionDetails3 obj) {
			return obj.getProxyHolder();
		}

		@Override
		public void setValue(TransactionDetails3 obj, Optional<PartyIdentification2Choice> value) {
			obj.setProxyHolder(value.orElse(null));
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
	public static final MMMessageAttribute<TransactionDetails3, Optional<Max350Text>> mmAdditionalInformation = new MMMessageAttribute<TransactionDetails3, Optional<Max350Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionDetails3.mmObject();
			isDerived = false;
			xmlTag = "AddtlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformation";
			definition = "Additional domestic regulatory transaction information.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Optional<Max350Text> getValue(TransactionDetails3 obj) {
			return obj.getAdditionalInformation();
		}

		@Override
		public void setValue(TransactionDetails3 obj, Optional<Max350Text> value) {
			obj.setAdditionalInformation(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransactionDetails3.mmTradeReference, com.tools20022.repository.msg.TransactionDetails3.mmAssociatedTradeReference,
						com.tools20022.repository.msg.TransactionDetails3.mmPlaceOfTrade, com.tools20022.repository.msg.TransactionDetails3.mmTradeDateTime, com.tools20022.repository.msg.TransactionDetails3.mmFinancialInstrumentDetails,
						com.tools20022.repository.msg.TransactionDetails3.mmSide, com.tools20022.repository.msg.TransactionDetails3.mmTransactionReportMarker, com.tools20022.repository.msg.TransactionDetails3.mmCounterparty,
						com.tools20022.repository.msg.TransactionDetails3.mmClient, com.tools20022.repository.msg.TransactionDetails3.mmCapacity, com.tools20022.repository.msg.TransactionDetails3.mmExecutedTradePrice,
						com.tools20022.repository.msg.TransactionDetails3.mmExecutedTradeQuantity, com.tools20022.repository.msg.TransactionDetails3.mmSettlementAmount, com.tools20022.repository.msg.TransactionDetails3.mmSettlementDate,
						com.tools20022.repository.msg.TransactionDetails3.mmProxyHolder, com.tools20022.repository.msg.TransactionDetails3.mmAdditionalInformation);
				messageBuildingBlock_lazy = () -> Arrays.asList(RegulatoryTransactionReportV02.mmTransactionDetails, RegulatoryTransactionReportCancellationRequestV02.mmCancellationByTransactionDetails);
				trace_lazy = () -> SecuritiesTrade.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintClientRule.forTransactionDetails3);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TransactionDetails3";
				definition = "Details of the transaction.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max70Text getTradeReference() {
		return tradeReference;
	}

	public TransactionDetails3 setTradeReference(Max70Text tradeReference) {
		this.tradeReference = Objects.requireNonNull(tradeReference);
		return this;
	}

	public List<Max70Text> getAssociatedTradeReference() {
		return associatedTradeReference == null ? associatedTradeReference = new ArrayList<>() : associatedTradeReference;
	}

	public TransactionDetails3 setAssociatedTradeReference(List<Max70Text> associatedTradeReference) {
		this.associatedTradeReference = Objects.requireNonNull(associatedTradeReference);
		return this;
	}

	public PlaceOfTradeIdentification2Choice getPlaceOfTrade() {
		return placeOfTrade;
	}

	public TransactionDetails3 setPlaceOfTrade(PlaceOfTradeIdentification2Choice placeOfTrade) {
		this.placeOfTrade = Objects.requireNonNull(placeOfTrade);
		return this;
	}

	public ISODateTime getTradeDateTime() {
		return tradeDateTime;
	}

	public TransactionDetails3 setTradeDateTime(ISODateTime tradeDateTime) {
		this.tradeDateTime = Objects.requireNonNull(tradeDateTime);
		return this;
	}

	public FinancialInstrument15 getFinancialInstrumentDetails() {
		return financialInstrumentDetails;
	}

	public TransactionDetails3 setFinancialInstrumentDetails(FinancialInstrument15 financialInstrumentDetails) {
		this.financialInstrumentDetails = Objects.requireNonNull(financialInstrumentDetails);
		return this;
	}

	public OrderDriverCode getSide() {
		return side;
	}

	public TransactionDetails3 setSide(OrderDriverCode side) {
		this.side = Objects.requireNonNull(side);
		return this;
	}

	public List<PartyIdentification24Choice> getTransactionReportMarker() {
		return transactionReportMarker == null ? transactionReportMarker = new ArrayList<>() : transactionReportMarker;
	}

	public TransactionDetails3 setTransactionReportMarker(List<PartyIdentification24Choice> transactionReportMarker) {
		this.transactionReportMarker = Objects.requireNonNull(transactionReportMarker);
		return this;
	}

	public PartyIdentification11Choice getCounterparty() {
		return counterparty;
	}

	public TransactionDetails3 setCounterparty(PartyIdentification11Choice counterparty) {
		this.counterparty = Objects.requireNonNull(counterparty);
		return this;
	}

	public Optional<PartyIdentification23> getClient() {
		return client == null ? Optional.empty() : Optional.of(client);
	}

	public TransactionDetails3 setClient(PartyIdentification23 client) {
		this.client = client;
		return this;
	}

	public TradingCapacity3Code getCapacity() {
		return capacity;
	}

	public TransactionDetails3 setCapacity(TradingCapacity3Code capacity) {
		this.capacity = Objects.requireNonNull(capacity);
		return this;
	}

	public PriceRateOrAmountChoice getExecutedTradePrice() {
		return executedTradePrice;
	}

	public TransactionDetails3 setExecutedTradePrice(PriceRateOrAmountChoice executedTradePrice) {
		this.executedTradePrice = Objects.requireNonNull(executedTradePrice);
		return this;
	}

	public UnitOrFaceAmountChoice getExecutedTradeQuantity() {
		return executedTradeQuantity;
	}

	public TransactionDetails3 setExecutedTradeQuantity(UnitOrFaceAmountChoice executedTradeQuantity) {
		this.executedTradeQuantity = Objects.requireNonNull(executedTradeQuantity);
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getSettlementAmount() {
		return settlementAmount == null ? Optional.empty() : Optional.of(settlementAmount);
	}

	public TransactionDetails3 setSettlementAmount(ActiveCurrencyAndAmount settlementAmount) {
		this.settlementAmount = settlementAmount;
		return this;
	}

	public Optional<ISODateTime> getSettlementDate() {
		return settlementDate == null ? Optional.empty() : Optional.of(settlementDate);
	}

	public TransactionDetails3 setSettlementDate(ISODateTime settlementDate) {
		this.settlementDate = settlementDate;
		return this;
	}

	public Optional<PartyIdentification2Choice> getProxyHolder() {
		return proxyHolder == null ? Optional.empty() : Optional.of(proxyHolder);
	}

	public TransactionDetails3 setProxyHolder(PartyIdentification2Choice proxyHolder) {
		this.proxyHolder = proxyHolder;
		return this;
	}

	public Optional<Max350Text> getAdditionalInformation() {
		return additionalInformation == null ? Optional.empty() : Optional.of(additionalInformation);
	}

	public TransactionDetails3 setAdditionalInformation(Max350Text additionalInformation) {
		this.additionalInformation = additionalInformation;
		return this;
	}
}