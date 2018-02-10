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
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.Quantity6Choice;
import com.tools20022.repository.choice.QuantityOrAmount1Choice;
import com.tools20022.repository.choice.TradeDate4Choice;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Intention to transfer an ownership of a financial instrument.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartialFill2#mmConfirmationQuantity
 * PartialFill2.mmConfirmationQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartialFill2#mmDealPrice
 * PartialFill2.mmDealPrice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartialFill2#mmTradeDate
 * PartialFill2.mmTradeDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartialFill2#mmPlaceOfTrade
 * PartialFill2.mmPlaceOfTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartialFill2#mmOriginalOrderedQuantity
 * PartialFill2.mmOriginalOrderedQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartialFill2#mmPreviouslyExecutedQuantity
 * PartialFill2.mmPreviouslyExecutedQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartialFill2#mmRemainingQuantity
 * PartialFill2.mmRemainingQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartialFill2#mmMatchIncrementQuantity
 * PartialFill2.mmMatchIncrementQuantity}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesOrder
 * SecuritiesOrder}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintPartialFillsRule#forPartialFill2
 * ConstraintPartialFillsRule.forPartialFill2}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PartialFill2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Intention to transfer an ownership of a financial instrument."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.PartialFill1
 * PartialFill1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PartialFill2", propOrder = {"confirmationQuantity", "dealPrice", "tradeDate", "placeOfTrade", "originalOrderedQuantity", "previouslyExecutedQuantity", "remainingQuantity", "matchIncrementQuantity"})
public class PartialFill2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "ConfQty", required = true)
	protected Quantity6Choice confirmationQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.Quantity6Choice
	 * Quantity6Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmOrderedQuantity
	 * SecuritiesOrder.mmOrderedQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartialFill2 PartialFill2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ConfQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 38</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConfirmationQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quantity of financial instrument to be ordered."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PartialFill1#mmConfirmationQuantity
	 * PartialFill1.mmConfirmationQuantity}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmConfirmationQuantity = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmOrderedQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.PartialFill2.mmObject();
			isDerived = false;
			xmlTag = "ConfQty";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "38"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConfirmationQuantity";
			definition = "Quantity of financial instrument to be ordered.";
			previousVersion_lazy = () -> PartialFill1.mmConfirmationQuantity;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Quantity6Choice.mmObject();
		}
	};
	@XmlElement(name = "DealPric", required = true)
	protected Price4 dealPrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Price4 Price4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmOrderPrice
	 * SecuritiesOrder.mmOrderPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartialFill2 PartialFill2}</li>
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
	 * definition} =
	 * "Amount of money for which goods or services are offered, sold, or bought."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PartialFill1#mmDealPrice
	 * PartialFill1.mmDealPrice}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDealPrice = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmOrderPrice;
			componentContext_lazy = () -> com.tools20022.repository.msg.PartialFill2.mmObject();
			isDerived = false;
			xmlTag = "DealPric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DealPrice";
			definition = "Amount of money for which goods or services are offered, sold, or bought.";
			previousVersion_lazy = () -> PartialFill1.mmDealPrice;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> com.tools20022.repository.msg.Price4.mmObject();
		}
	};
	@XmlElement(name = "TradDt")
	protected TradeDate4Choice tradeDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.TradeDate4Choice
	 * TradeDate4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Trade#mmTradeDateTime
	 * Trade.mmTradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartialFill2 PartialFill2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 75</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the date/time on which the trade was executed."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PartialFill1#mmTradeDate
	 * PartialFill1.mmTradeDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTradeDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Trade.mmTradeDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.PartialFill2.mmObject();
			isDerived = false;
			xmlTag = "TradDt";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "75"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDate";
			definition = "Specifies the date/time on which the trade was executed.";
			previousVersion_lazy = () -> PartialFill1.mmTradeDate;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> TradeDate4Choice.mmObject();
		}
	};
	@XmlElement(name = "PlcOfTrad")
	protected MarketIdentification80 placeOfTrade;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.MarketIdentification80
	 * MarketIdentification80}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TradingSession#mmMarket
	 * TradingSession.mmMarket}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartialFill2 PartialFill2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PlcOfTrad"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :94B::TRAD</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Market in which a trade transaction is to be or has been executed."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PartialFill1#mmPlaceOfTrade
	 * PartialFill1.mmPlaceOfTrade}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPlaceOfTrade = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> TradingSession.mmMarket;
			componentContext_lazy = () -> com.tools20022.repository.msg.PartialFill2.mmObject();
			isDerived = false;
			xmlTag = "PlcOfTrad";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":94B::TRAD"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfTrade";
			definition = "Market in which a trade transaction is to be or has been executed.";
			previousVersion_lazy = () -> PartialFill1.mmPlaceOfTrade;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.MarketIdentification80.mmObject();
		}
	};
	@XmlElement(name = "OrgnlOrdrdQty", required = true)
	protected QuantityOrAmount1Choice originalOrderedQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.QuantityOrAmount1Choice
	 * QuantityOrAmount1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmOrderedQuantity
	 * SecuritiesOrder.mmOrderedQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartialFill2 PartialFill2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlOrdrdQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19A::ACCA</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalOrderedQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quantity of financial instrument ordered."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PartialFill1#mmOriginalOrderedQuantity
	 * PartialFill1.mmOriginalOrderedQuantity}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOriginalOrderedQuantity = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmOrderedQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.PartialFill2.mmObject();
			isDerived = false;
			xmlTag = "OrgnlOrdrdQty";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::ACCA"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalOrderedQuantity";
			definition = "Quantity of financial instrument ordered.";
			previousVersion_lazy = () -> PartialFill1.mmOriginalOrderedQuantity;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> QuantityOrAmount1Choice.mmObject();
		}
	};
	@XmlElement(name = "PrevslyExctdQty", required = true)
	protected QuantityOrAmount1Choice previouslyExecutedQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.QuantityOrAmount1Choice
	 * QuantityOrAmount1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmOrderedQuantity
	 * SecuritiesOrder.mmOrderedQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartialFill2 PartialFill2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrevslyExctdQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19A::ACCA</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviouslyExecutedQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity of financial instrument that has been previously executed."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PartialFill1#mmPreviouslyExecutedQuantity
	 * PartialFill1.mmPreviouslyExecutedQuantity}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPreviouslyExecutedQuantity = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmOrderedQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.PartialFill2.mmObject();
			isDerived = false;
			xmlTag = "PrevslyExctdQty";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::ACCA"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviouslyExecutedQuantity";
			definition = "Quantity of financial instrument that has been previously executed.";
			previousVersion_lazy = () -> PartialFill1.mmPreviouslyExecutedQuantity;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> QuantityOrAmount1Choice.mmObject();
		}
	};
	@XmlElement(name = "RmngQty", required = true)
	protected QuantityOrAmount1Choice remainingQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.QuantityOrAmount1Choice
	 * QuantityOrAmount1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus#mmRemainingQuantity
	 * SecuritiesOrderStatus.mmRemainingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartialFill2 PartialFill2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RmngQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19A::ACCA</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RemainingQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity of financial instrument that is remaining in order."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PartialFill1#mmRemainingQuantity
	 * PartialFill1.mmRemainingQuantity}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRemainingQuantity = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrderStatus.mmRemainingQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.PartialFill2.mmObject();
			isDerived = false;
			xmlTag = "RmngQty";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::ACCA"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RemainingQuantity";
			definition = "Quantity of financial instrument that is remaining in order.";
			previousVersion_lazy = () -> PartialFill1.mmRemainingQuantity;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> QuantityOrAmount1Choice.mmObject();
		}
	};
	@XmlElement(name = "MtchIncrmtQty")
	protected QuantityOrAmount1Choice matchIncrementQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.QuantityOrAmount1Choice
	 * QuantityOrAmount1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters#mmMatchIncrement
	 * SecuritiesOrderParameters.mmMatchIncrement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartialFill2 PartialFill2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MtchIncrmtQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19A::ACCA</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MatchIncrementQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum quantity that applies to every execution. The order may still fill against smaller orders, but the cumulative quantity of the execution must be in multiples of the Match Increment."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PartialFill1#mmMatchIncrementQuantity
	 * PartialFill1.mmMatchIncrementQuantity}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMatchIncrementQuantity = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrderParameters.mmMatchIncrement;
			componentContext_lazy = () -> com.tools20022.repository.msg.PartialFill2.mmObject();
			isDerived = false;
			xmlTag = "MtchIncrmtQty";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::ACCA"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MatchIncrementQuantity";
			definition = "Minimum quantity that applies to every execution. The order may still fill against smaller orders, but the cumulative quantity of the execution must be in multiples of the Match Increment.";
			previousVersion_lazy = () -> PartialFill1.mmMatchIncrementQuantity;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> QuantityOrAmount1Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PartialFill2.mmConfirmationQuantity, com.tools20022.repository.msg.PartialFill2.mmDealPrice, com.tools20022.repository.msg.PartialFill2.mmTradeDate,
						com.tools20022.repository.msg.PartialFill2.mmPlaceOfTrade, com.tools20022.repository.msg.PartialFill2.mmOriginalOrderedQuantity, com.tools20022.repository.msg.PartialFill2.mmPreviouslyExecutedQuantity,
						com.tools20022.repository.msg.PartialFill2.mmRemainingQuantity, com.tools20022.repository.msg.PartialFill2.mmMatchIncrementQuantity);
				trace_lazy = () -> SecuritiesOrder.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPartialFillsRule.forPartialFill2);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PartialFill2";
				definition = "Intention to transfer an ownership of a financial instrument.";
				previousVersion_lazy = () -> PartialFill1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Quantity6Choice getConfirmationQuantity() {
		return confirmationQuantity;
	}

	public PartialFill2 setConfirmationQuantity(Quantity6Choice confirmationQuantity) {
		this.confirmationQuantity = Objects.requireNonNull(confirmationQuantity);
		return this;
	}

	public Price4 getDealPrice() {
		return dealPrice;
	}

	public PartialFill2 setDealPrice(com.tools20022.repository.msg.Price4 dealPrice) {
		this.dealPrice = Objects.requireNonNull(dealPrice);
		return this;
	}

	public Optional<TradeDate4Choice> getTradeDate() {
		return tradeDate == null ? Optional.empty() : Optional.of(tradeDate);
	}

	public PartialFill2 setTradeDate(TradeDate4Choice tradeDate) {
		this.tradeDate = tradeDate;
		return this;
	}

	public Optional<MarketIdentification80> getPlaceOfTrade() {
		return placeOfTrade == null ? Optional.empty() : Optional.of(placeOfTrade);
	}

	public PartialFill2 setPlaceOfTrade(com.tools20022.repository.msg.MarketIdentification80 placeOfTrade) {
		this.placeOfTrade = placeOfTrade;
		return this;
	}

	public QuantityOrAmount1Choice getOriginalOrderedQuantity() {
		return originalOrderedQuantity;
	}

	public PartialFill2 setOriginalOrderedQuantity(QuantityOrAmount1Choice originalOrderedQuantity) {
		this.originalOrderedQuantity = Objects.requireNonNull(originalOrderedQuantity);
		return this;
	}

	public QuantityOrAmount1Choice getPreviouslyExecutedQuantity() {
		return previouslyExecutedQuantity;
	}

	public PartialFill2 setPreviouslyExecutedQuantity(QuantityOrAmount1Choice previouslyExecutedQuantity) {
		this.previouslyExecutedQuantity = Objects.requireNonNull(previouslyExecutedQuantity);
		return this;
	}

	public QuantityOrAmount1Choice getRemainingQuantity() {
		return remainingQuantity;
	}

	public PartialFill2 setRemainingQuantity(QuantityOrAmount1Choice remainingQuantity) {
		this.remainingQuantity = Objects.requireNonNull(remainingQuantity);
		return this;
	}

	public Optional<QuantityOrAmount1Choice> getMatchIncrementQuantity() {
		return matchIncrementQuantity == null ? Optional.empty() : Optional.of(matchIncrementQuantity);
	}

	public PartialFill2 setMatchIncrementQuantity(QuantityOrAmount1Choice matchIncrementQuantity) {
		this.matchIncrementQuantity = matchIncrementQuantity;
		return this;
	}
}