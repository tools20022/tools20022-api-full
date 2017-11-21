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
import com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV01;
import com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV02;
import com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV03;
import com.tools20022.repository.choice.ClosingDate1Choice;
import com.tools20022.repository.choice.TradeDate1Choice;
import com.tools20022.repository.choice.TradeDate4Choice;
import com.tools20022.repository.choice.TwoLegTransactionType1Choice;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.SecuritiesFinancing;
import com.tools20022.repository.entity.SecuritiesTrade;
import com.tools20022.repository.entity.Trade;
import com.tools20022.repository.entity.TradeIdentification;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies the details of the first leg in a two leg transaction process.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TwoLegTransactionDetails1#mmTradeDate
 * TwoLegTransactionDetails1.mmTradeDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TwoLegTransactionDetails1#mmOpeningLegIdentification
 * TwoLegTransactionDetails1.mmOpeningLegIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TwoLegTransactionDetails1#mmClosingLegIdentification
 * TwoLegTransactionDetails1.mmClosingLegIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TwoLegTransactionDetails1#mmGrossTradeAmount
 * TwoLegTransactionDetails1.mmGrossTradeAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TwoLegTransactionDetails1#mmOtherAmounts
 * TwoLegTransactionDetails1.mmOtherAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TwoLegTransactionDetails1#mmSecondLegNarrative
 * TwoLegTransactionDetails1.mmSecondLegNarrative}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TwoLegTransactionDetails1#mmEndPrice
 * TwoLegTransactionDetails1.mmEndPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TwoLegTransactionDetails1#mmClosingDate
 * TwoLegTransactionDetails1.mmClosingDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TwoLegTransactionDetails1#mmClosingSettlementAmount
 * TwoLegTransactionDetails1.mmClosingSettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TwoLegTransactionDetails1#mmProcessingDate
 * TwoLegTransactionDetails1.mmProcessingDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TwoLegTransactionDetails1#mmTwoLegTransactionType
 * TwoLegTransactionDetails1.mmTwoLegTransactionType}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesFinancing
 * SecuritiesFinancing}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV01#mmTwoLegTransactionDetails
 * SecuritiesTradeConfirmationV01.mmTwoLegTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV02#mmTwoLegTransactionDetails
 * SecuritiesTradeConfirmationV02.mmTwoLegTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV03#mmTwoLegTransactionDetails
 * SecuritiesTradeConfirmationV03.mmTwoLegTransactionDetails}</li>
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
 * "TwoLegTransactionDetails1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the details of the first leg in a two leg transaction process."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "TwoLegTransactionDetails1", propOrder = {"tradeDate", "openingLegIdentification", "closingLegIdentification", "grossTradeAmount", "otherAmounts", "secondLegNarrative", "endPrice", "closingDate", "closingSettlementAmount",
		"processingDate", "twoLegTransactionType"})
public class TwoLegTransactionDetails1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected TradeDate1Choice tradeDate;
	/**
	 * Specifies the date/time on which the trade was executed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.TradeDate1Choice
	 * TradeDate1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Trade#mmTradeDateTime
	 * Trade.mmTradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TwoLegTransactionDetails1
	 * TwoLegTransactionDetails1}</li>
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
	 * definition} = "Specifies the date/time on which the trade was executed."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTradeDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Trade.mmTradeDateTime;
			componentContext_lazy = () -> TwoLegTransactionDetails1.mmObject();
			isDerived = false;
			xmlTag = "TradDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDate";
			definition = "Specifies the date/time on which the trade was executed.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> TradeDate1Choice.mmObject();
		}
	};
	protected Max35Text openingLegIdentification;
	/**
	 * Unambiguous identification of the reference assigned in the first leg of
	 * the transaction.
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
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TwoLegTransactionDetails1
	 * TwoLegTransactionDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OpngLegId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OpeningLegIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the reference assigned in the first leg of the transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOpeningLegIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> TradeIdentification.mmIdentification;
			componentContext_lazy = () -> TwoLegTransactionDetails1.mmObject();
			isDerived = false;
			xmlTag = "OpngLegId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OpeningLegIdentification";
			definition = "Unambiguous identification of the reference assigned in the first leg of the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text closingLegIdentification;
	/**
	 * Unambiguous identification of the second leg of the transaction as known
	 * by the account owner (or the instructing party acting on its behalf).
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
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TwoLegTransactionDetails1
	 * TwoLegTransactionDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClsgLegId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClosingLegIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the second leg of the transaction as known by the account owner (or the instructing party acting on its behalf)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmClosingLegIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> TradeIdentification.mmIdentification;
			componentContext_lazy = () -> TwoLegTransactionDetails1.mmObject();
			isDerived = false;
			xmlTag = "ClsgLegId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClosingLegIdentification";
			definition = "Unambiguous identification of the second leg of the transaction as known by the account owner (or the instructing party acting on its behalf).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected AmountAndDirection29 grossTradeAmount;
	/**
	 * Principal amount of a trade (price multiplied by quantity).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection29
	 * AmountAndDirection29}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmTradeAmount
	 * SecuritiesTrade.mmTradeAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TwoLegTransactionDetails1
	 * TwoLegTransactionDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GrssTradAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossTradeAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Principal amount of a trade (price multiplied by quantity)."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmGrossTradeAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesTrade.mmTradeAmount;
			componentContext_lazy = () -> TwoLegTransactionDetails1.mmObject();
			isDerived = false;
			xmlTag = "GrssTradAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossTradeAmount";
			definition = "Principal amount of a trade (price multiplied by quantity).";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AmountAndDirection29.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.OtherAmounts16> otherAmounts;
	/**
	 * Identifies other amounts pertaining to the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.OtherAmounts16
	 * OtherAmounts16}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing
	 * SecuritiesFinancing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TwoLegTransactionDetails1
	 * TwoLegTransactionDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrAmts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherAmounts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies other amounts pertaining to the transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOtherAmounts = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> SecuritiesFinancing.mmObject();
			componentContext_lazy = () -> TwoLegTransactionDetails1.mmObject();
			isDerived = false;
			xmlTag = "OthrAmts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherAmounts";
			definition = "Identifies other amounts pertaining to the transaction.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.OtherAmounts16.mmObject();
		}
	};
	protected Max140Text secondLegNarrative;
	/**
	 * Provides additional information about the second leg in narrative form.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TwoLegTransactionDetails1
	 * TwoLegTransactionDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ScndLegNrrtv"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecondLegNarrative"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides additional information about the second leg in narrative form."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSecondLegNarrative = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TwoLegTransactionDetails1.mmObject();
			isDerived = false;
			xmlTag = "ScndLegNrrtv";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecondLegNarrative";
			definition = "Provides additional information about the second leg in narrative form.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};
	protected Price4 endPrice;
	/**
	 * Negotiated fixed price of the security to buy it back.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Price4 Price4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmEndPrice
	 * SecuritiesFinancing.mmEndPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TwoLegTransactionDetails1
	 * TwoLegTransactionDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EndPric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EndPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Negotiated fixed price of the security to buy it back."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEndPrice = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesFinancing.mmEndPrice;
			componentContext_lazy = () -> TwoLegTransactionDetails1.mmObject();
			isDerived = false;
			xmlTag = "EndPric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndPrice";
			definition = "Negotiated fixed price of the security to buy it back.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.Price4.mmObject();
		}
	};
	protected ClosingDate1Choice closingDate;
	/**
	 * Closing date/time or maturity date/time of the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.ClosingDate1Choice
	 * ClosingDate1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmTerminationDateTime
	 * SecuritiesFinancing.mmTerminationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TwoLegTransactionDetails1
	 * TwoLegTransactionDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClsgDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClosingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Closing date/time or maturity date/time of the transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmClosingDate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesFinancing.mmTerminationDateTime;
			componentContext_lazy = () -> TwoLegTransactionDetails1.mmObject();
			isDerived = false;
			xmlTag = "ClsgDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClosingDate";
			definition = "Closing date/time or maturity date/time of the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ClosingDate1Choice.mmObject();
		}
	};
	protected AmountAndDirection5 closingSettlementAmount;
	/**
	 * Total amount of money to be paid or received in exchange for the
	 * securities. The amount includes the principal with any commissions and
	 * fees or accrued interest.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection5
	 * AmountAndDirection5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmTerminationTransactionAmount
	 * SecuritiesFinancing.mmTerminationTransactionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TwoLegTransactionDetails1
	 * TwoLegTransactionDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClsgSttlmAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClosingSettlementAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total amount of money to be paid or received in exchange for the securities.  The amount includes the principal with any commissions and fees or accrued interest."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmClosingSettlementAmount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesFinancing.mmTerminationTransactionAmount;
			componentContext_lazy = () -> TwoLegTransactionDetails1.mmObject();
			isDerived = false;
			xmlTag = "ClsgSttlmAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClosingSettlementAmount";
			definition = "Total amount of money to be paid or received in exchange for the securities.  The amount includes the principal with any commissions and fees or accrued interest.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AmountAndDirection5.mmObject();
		}
	};
	protected TradeDate4Choice processingDate;
	/**
	 * Processing date of the trading session.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.TradeDate4Choice
	 * TradeDate4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TwoLegTransactionDetails1
	 * TwoLegTransactionDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrcgDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProcessingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Processing date of the trading session."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmProcessingDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TwoLegTransactionDetails1.mmObject();
			isDerived = false;
			xmlTag = "PrcgDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessingDate";
			definition = "Processing date of the trading session.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> TradeDate4Choice.mmObject();
		}
	};
	protected TwoLegTransactionType1Choice twoLegTransactionType;
	/**
	 * Specifies the type of the second leg transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.TwoLegTransactionType1Choice
	 * TwoLegTransactionType1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing
	 * SecuritiesFinancing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TwoLegTransactionDetails1
	 * TwoLegTransactionDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TwoLegTxTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of the second leg transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTwoLegTransactionType = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> SecuritiesFinancing.mmObject();
			componentContext_lazy = () -> TwoLegTransactionDetails1.mmObject();
			isDerived = false;
			xmlTag = "TwoLegTxTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionType";
			definition = "Specifies the type of the second leg transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TwoLegTransactionType1Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(TwoLegTransactionDetails1.mmTradeDate, TwoLegTransactionDetails1.mmOpeningLegIdentification, TwoLegTransactionDetails1.mmClosingLegIdentification,
						TwoLegTransactionDetails1.mmGrossTradeAmount, TwoLegTransactionDetails1.mmOtherAmounts, TwoLegTransactionDetails1.mmSecondLegNarrative, TwoLegTransactionDetails1.mmEndPrice, TwoLegTransactionDetails1.mmClosingDate,
						TwoLegTransactionDetails1.mmClosingSettlementAmount, TwoLegTransactionDetails1.mmProcessingDate, TwoLegTransactionDetails1.mmTwoLegTransactionType);
				messageBuildingBlock_lazy = () -> Arrays
						.asList(SecuritiesTradeConfirmationV01.mmTwoLegTransactionDetails, SecuritiesTradeConfirmationV02.mmTwoLegTransactionDetails, SecuritiesTradeConfirmationV03.mmTwoLegTransactionDetails);
				trace_lazy = () -> SecuritiesFinancing.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TwoLegTransactionDetails1";
				definition = "Specifies the details of the first leg in a two leg transaction process.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "TradDt")
	public TradeDate1Choice getTradeDate() {
		return tradeDate;
	}

	public void setTradeDate(TradeDate1Choice tradeDate) {
		this.tradeDate = tradeDate;
	}

	@XmlElement(name = "OpngLegId")
	public Max35Text getOpeningLegIdentification() {
		return openingLegIdentification;
	}

	public void setOpeningLegIdentification(Max35Text openingLegIdentification) {
		this.openingLegIdentification = openingLegIdentification;
	}

	@XmlElement(name = "ClsgLegId")
	public Max35Text getClosingLegIdentification() {
		return closingLegIdentification;
	}

	public void setClosingLegIdentification(Max35Text closingLegIdentification) {
		this.closingLegIdentification = closingLegIdentification;
	}

	@XmlElement(name = "GrssTradAmt")
	public AmountAndDirection29 getGrossTradeAmount() {
		return grossTradeAmount;
	}

	public void setGrossTradeAmount(com.tools20022.repository.msg.AmountAndDirection29 grossTradeAmount) {
		this.grossTradeAmount = grossTradeAmount;
	}

	@XmlElement(name = "OthrAmts")
	public List<OtherAmounts16> getOtherAmounts() {
		return otherAmounts;
	}

	public void setOtherAmounts(List<com.tools20022.repository.msg.OtherAmounts16> otherAmounts) {
		this.otherAmounts = otherAmounts;
	}

	@XmlElement(name = "ScndLegNrrtv")
	public Max140Text getSecondLegNarrative() {
		return secondLegNarrative;
	}

	public void setSecondLegNarrative(Max140Text secondLegNarrative) {
		this.secondLegNarrative = secondLegNarrative;
	}

	@XmlElement(name = "EndPric")
	public Price4 getEndPrice() {
		return endPrice;
	}

	public void setEndPrice(com.tools20022.repository.msg.Price4 endPrice) {
		this.endPrice = endPrice;
	}

	@XmlElement(name = "ClsgDt")
	public ClosingDate1Choice getClosingDate() {
		return closingDate;
	}

	public void setClosingDate(ClosingDate1Choice closingDate) {
		this.closingDate = closingDate;
	}

	@XmlElement(name = "ClsgSttlmAmt")
	public AmountAndDirection5 getClosingSettlementAmount() {
		return closingSettlementAmount;
	}

	public void setClosingSettlementAmount(com.tools20022.repository.msg.AmountAndDirection5 closingSettlementAmount) {
		this.closingSettlementAmount = closingSettlementAmount;
	}

	@XmlElement(name = "PrcgDt")
	public TradeDate4Choice getProcessingDate() {
		return processingDate;
	}

	public void setProcessingDate(TradeDate4Choice processingDate) {
		this.processingDate = processingDate;
	}

	@XmlElement(name = "TwoLegTxTp")
	public TwoLegTransactionType1Choice getTwoLegTransactionType() {
		return twoLegTransactionType;
	}

	public void setTwoLegTransactionType(TwoLegTransactionType1Choice twoLegTransactionType) {
		this.twoLegTransactionType = twoLegTransactionType;
	}
}