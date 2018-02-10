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
import com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmation002V06;
import com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmation002V07;
import com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdvice002V05;
import com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdvice002V06;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.datatype.Max3Number;
import com.tools20022.repository.datatype.RestrictedFINXMax16Text;
import com.tools20022.repository.datatype.RestrictedFINXMax350Text;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Details of the securities trade.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails62#mmTradeIdentification
 * SecuritiesTradeDetails62.mmTradeIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails62#mmCollateralTransactionIdentification
 * SecuritiesTradeDetails62.mmCollateralTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails62#mmPlaceOfTrade
 * SecuritiesTradeDetails62.mmPlaceOfTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails62#mmPlaceOfClearing
 * SecuritiesTradeDetails62.mmPlaceOfClearing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails62#mmTradeDate
 * SecuritiesTradeDetails62.mmTradeDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails62#mmSettlementDate
 * SecuritiesTradeDetails62.mmSettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails62#mmEffectiveSettlementDate
 * SecuritiesTradeDetails62.mmEffectiveSettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails62#mmDealPrice
 * SecuritiesTradeDetails62.mmDealPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails62#mmNumberOfDaysAccrued
 * SecuritiesTradeDetails62.mmNumberOfDaysAccrued}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails62#mmOpeningClosing
 * SecuritiesTradeDetails62.mmOpeningClosing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails62#mmReporting
 * SecuritiesTradeDetails62.mmReporting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails62#mmTradeTransactionCondition
 * SecuritiesTradeDetails62.mmTradeTransactionCondition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails62#mmInvestorCapacity
 * SecuritiesTradeDetails62.mmInvestorCapacity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails62#mmTradeOriginatorRole
 * SecuritiesTradeDetails62.mmTradeOriginatorRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails62#mmTypeOfPrice
 * SecuritiesTradeDetails62.mmTypeOfPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails62#mmFXAdditionalDetails
 * SecuritiesTradeDetails62.mmFXAdditionalDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails62#mmSettlementInstructionProcessingAdditionalDetails
 * SecuritiesTradeDetails62.mmSettlementInstructionProcessingAdditionalDetails}</li>
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
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdvice002V05#mmTradeDetails
 * SecuritiesSettlementTransactionReversalAdvice002V05.mmTradeDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmation002V06#mmTradeDetails
 * SecuritiesSettlementTransactionConfirmation002V06.mmTradeDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmation002V07#mmTradeDetails
 * SecuritiesSettlementTransactionConfirmation002V07.mmTradeDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdvice002V06#mmTradeDetails
 * SecuritiesSettlementTransactionReversalAdvice002V06.mmTradeDetails}</li>
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
 * {@linkplain com.tools20022.repository.constraints.ConstraintInvestorCapacityRule#forSecuritiesTradeDetails62
 * ConstraintInvestorCapacityRule.forSecuritiesTradeDetails62}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintPlaceOfTradeRule#forSecuritiesTradeDetails62
 * ConstraintPlaceOfTradeRule.forSecuritiesTradeDetails62}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintTradeDateTimeUTCRule#forSecuritiesTradeDetails62
 * ConstraintTradeDateTimeUTCRule.forSecuritiesTradeDetails62}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule#forSecuritiesTradeDetails62
 * ConstraintAdditionalDetailsRule.forSecuritiesTradeDetails62}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintTradeDateGuideline#forSecuritiesTradeDetails62
 * ConstraintTradeDateGuideline.forSecuritiesTradeDetails62}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesTradeDetails62"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Details of the securities trade."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SecuritiesTradeDetails62", propOrder = {"tradeIdentification", "collateralTransactionIdentification", "placeOfTrade", "placeOfClearing", "tradeDate", "settlementDate", "effectiveSettlementDate", "dealPrice",
		"numberOfDaysAccrued", "openingClosing", "reporting", "tradeTransactionCondition", "investorCapacity", "tradeOriginatorRole", "typeOfPrice", "fXAdditionalDetails", "settlementInstructionProcessingAdditionalDetails"})
public class SecuritiesTradeDetails62 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TradId")
	protected List<RestrictedFINXMax16Text> tradeIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINXMax16Text
	 * RestrictedFINXMax16Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TradeIdentification#mmIdentification
	 * TradeIdentification.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails62
	 * SecuritiesTradeDetails62}</li>
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
	 * definition} =
	 * "Reference assigned to the trade by the investor or the trading party. This reference will be used throughout the trade life cycle to access/update the trade details."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTradeIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> TradeIdentification.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesTradeDetails62.mmObject();
			isDerived = false;
			xmlTag = "TradId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeIdentification";
			definition = "Reference assigned to the trade by the investor or the trading party. This reference will be used throughout the trade life cycle to access/update the trade details.";
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINXMax16Text.mmObject();
		}
	};
	@XmlElement(name = "CollTxId")
	protected List<RestrictedFINXMax16Text> collateralTransactionIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINXMax16Text
	 * RestrictedFINXMax16Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification#mmCollateralTransactionIdentification
	 * SecuritiesTradeIdentification.mmCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails62
	 * SecuritiesTradeDetails62}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CollTxId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralTransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of a collateral transaction as assigned by the instructing party."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCollateralTransactionIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeIdentification.mmCollateralTransactionIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesTradeDetails62.mmObject();
			isDerived = false;
			xmlTag = "CollTxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralTransactionIdentification";
			definition = "Unambiguous identification of a collateral transaction as assigned by the instructing party.";
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINXMax16Text.mmObject();
		}
	};
	@XmlElement(name = "PlcOfTrad")
	protected PlaceOfTradeIdentification2 placeOfTrade;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PlaceOfTradeIdentification2
	 * PlaceOfTradeIdentification2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmTradingMarket
	 * Security.mmTradingMarket}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails62
	 * SecuritiesTradeDetails62}</li>
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
	 * definition} = "Market in which a trade transaction has been executed."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPlaceOfTrade = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Security.mmTradingMarket;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesTradeDetails62.mmObject();
			isDerived = false;
			xmlTag = "PlcOfTrad";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfTrade";
			definition = "Market in which a trade transaction has been executed.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PlaceOfTradeIdentification2.mmObject();
		}
	};
	@XmlElement(name = "PlcOfClr")
	protected PlaceOfClearingIdentification1 placeOfClearing;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PlaceOfClearingIdentification1
	 * PlaceOfClearingIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification#mmAnyBIC
	 * OrganisationIdentification.mmAnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails62
	 * SecuritiesTradeDetails62}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PlcOfClr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfClearing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Infrastructure which may be a component of a clearing house and wich facilitates clearing and settlement for its members by standing between the buyer and the seller. It may net transactions and it substitutes itself as settlement counterparty for each position."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPlaceOfClearing = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> OrganisationIdentification.mmAnyBIC;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesTradeDetails62.mmObject();
			isDerived = false;
			xmlTag = "PlcOfClr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfClearing";
			definition = "Infrastructure which may be a component of a clearing house and wich facilitates clearing and settlement for its members by standing between the buyer and the seller. It may net transactions and it substitutes itself as settlement counterparty for each position.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.PlaceOfClearingIdentification1.mmObject();
		}
	};
	@XmlElement(name = "TradDt")
	protected TradeDate6Choice tradeDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.TradeDate6Choice
	 * TradeDate6Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Trade#mmTradeDateTime
	 * Trade.mmTradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails62
	 * SecuritiesTradeDetails62}</li>
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
	public static final MMMessageAssociationEnd mmTradeDate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Trade.mmTradeDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesTradeDetails62.mmObject();
			isDerived = false;
			xmlTag = "TradDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDate";
			definition = "Specifies the date/time on which the trade was executed.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TradeDate6Choice.mmObject();
		}
	};
	@XmlElement(name = "SttlmDt")
	protected SettlementDate12Choice settlementDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.SettlementDate12Choice
	 * SettlementDate12Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Obligation#mmRequestedSettlementDate
	 * Obligation.mmRequestedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails62
	 * SecuritiesTradeDetails62}</li>
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
	 * definition} =
	 * "Date and time at which the securities are to be delivered or received."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSettlementDate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Obligation.mmRequestedSettlementDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesTradeDetails62.mmObject();
			isDerived = false;
			xmlTag = "SttlmDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDate";
			definition = "Date and time at which the securities are to be delivered or received.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SettlementDate12Choice.mmObject();
		}
	};
	@XmlElement(name = "FctvSttlmDt", required = true)
	protected SettlementDate14Choice effectiveSettlementDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.SettlementDate14Choice
	 * SettlementDate14Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSettlementDate
	 * SecuritiesSettlement.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails62
	 * SecuritiesTradeDetails62}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FctvSttlmDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EffectiveSettlementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time at which a transaction is completed and cleared, ie, payment is effected and securities are delivered."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmEffectiveSettlementDate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmSettlementDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesTradeDetails62.mmObject();
			isDerived = false;
			xmlTag = "FctvSttlmDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EffectiveSettlementDate";
			definition = "Date and time at which a transaction is completed and cleared, ie, payment is effected and securities are delivered.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SettlementDate14Choice.mmObject();
		}
	};
	@XmlElement(name = "DealPric")
	protected Price3 dealPrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Price3 Price3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#mmDealPrice
	 * SecuritiesTradeExecution.mmDealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails62
	 * SecuritiesTradeDetails62}</li>
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
	 * "Specifies the price of the traded financial instrument.\nThis is the deal price of the individual trade transaction. \nIf there is only one trade transaction for the execution of the trade, then the deal price could equal the executed trade price (unless, for example, the price includes commissions or rounding, or some other factor has been applied to the deal price or the executed trade price, or both)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDealPrice = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeExecution.mmDealPrice;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesTradeDetails62.mmObject();
			isDerived = false;
			xmlTag = "DealPric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DealPrice";
			definition = "Specifies the price of the traded financial instrument.\nThis is the deal price of the individual trade transaction. \nIf there is only one trade transaction for the execution of the trade, then the deal price could equal the executed trade price (unless, for example, the price includes commissions or rounding, or some other factor has been applied to the deal price or the executed trade price, or both).";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Price3.mmObject();
		}
	};
	@XmlElement(name = "NbOfDaysAcrd")
	protected Max3Number numberOfDaysAccrued;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max3Number
	 * Max3Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmNumberOfDays
	 * DateTimePeriod.mmNumberOfDays}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails62
	 * SecuritiesTradeDetails62}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NbOfDaysAcrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NumberOfDaysAccrued"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number of days on which the interest rate accrues (daily accrual note)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNumberOfDaysAccrued = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> DateTimePeriod.mmNumberOfDays;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesTradeDetails62.mmObject();
			isDerived = false;
			xmlTag = "NbOfDaysAcrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NumberOfDaysAccrued";
			definition = "Number of days on which the interest rate accrues (daily accrual note).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max3Number.mmObject();
		}
	};
	@XmlElement(name = "OpngClsg")
	protected OpeningClosing4Choice openingClosing;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.OpeningClosing4Choice
	 * OpeningClosing4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmOpeningClosingIndicator
	 * SecuritiesTrade.mmOpeningClosingIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails62
	 * SecuritiesTradeDetails62}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OpngClsg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OpeningClosing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies additional information relative to the processing of the trade."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOpeningClosing = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesTrade.mmOpeningClosingIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesTradeDetails62.mmObject();
			isDerived = false;
			xmlTag = "OpngClsg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OpeningClosing";
			definition = "Specifies additional information relative to the processing of the trade.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> OpeningClosing4Choice.mmObject();
		}
	};
	@XmlElement(name = "Rptg")
	protected List<Reporting9Choice> reporting;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.Reporting9Choice
	 * Reporting9Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails62
	 * SecuritiesTradeDetails62}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rptg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reporting"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies that a trade is to be reported to a third party."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReporting = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesTradeDetails62.mmObject();
			isDerived = false;
			xmlTag = "Rptg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reporting";
			definition = "Specifies that a trade is to be reported to a third party.";
			minOccurs = 0;
			complexType_lazy = () -> Reporting9Choice.mmObject();
		}
	};
	@XmlElement(name = "TradTxCond")
	protected List<TradeTransactionCondition6Choice> tradeTransactionCondition;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.TradeTransactionCondition6Choice
	 * TradeTransactionCondition6Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmTradeTransactionCondition
	 * SecuritiesTrade.mmTradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails62
	 * SecuritiesTradeDetails62}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradTxCond"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeTransactionCondition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the conditions under which the order/trade is to be/was executed."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTradeTransactionCondition = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesTrade.mmTradeTransactionCondition;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesTradeDetails62.mmObject();
			isDerived = false;
			xmlTag = "TradTxCond";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeTransactionCondition";
			definition = "Indicates the conditions under which the order/trade is to be/was executed.";
			minOccurs = 0;
			complexType_lazy = () -> TradeTransactionCondition6Choice.mmObject();
		}
	};
	@XmlElement(name = "InvstrCpcty")
	protected InvestorCapacity5Choice investorCapacity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.InvestorCapacity5Choice
	 * InvestorCapacity5Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestorRole#mmCapacity
	 * InvestorRole.mmCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails62
	 * SecuritiesTradeDetails62}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InvstrCpcty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestorCapacity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the role of the investor in the transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInvestorCapacity = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestorRole.mmCapacity;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesTradeDetails62.mmObject();
			isDerived = false;
			xmlTag = "InvstrCpcty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestorCapacity";
			definition = "Specifies the role of the investor in the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> InvestorCapacity5Choice.mmObject();
		}
	};
	@XmlElement(name = "TradOrgtrRole")
	protected TradeOriginator4Choice tradeOriginatorRole;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.TradeOriginator4Choice
	 * TradeOriginator4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.TradeOriginatorRole
	 * TradeOriginatorRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails62
	 * SecuritiesTradeDetails62}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradOrgtrRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeOriginatorRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the role of the trading party in the transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTradeOriginatorRole = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> TradeOriginatorRole.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesTradeDetails62.mmObject();
			isDerived = false;
			xmlTag = "TradOrgtrRole";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeOriginatorRole";
			definition = "Specifies the role of the trading party in the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> TradeOriginator4Choice.mmObject();
		}
	};
	@XmlElement(name = "TpOfPric")
	protected TypeOfPrice32Choice typeOfPrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.TypeOfPrice32Choice
	 * TypeOfPrice32Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmPriceType
	 * SecuritiesPricing.mmPriceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails62
	 * SecuritiesTradeDetails62}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TpOfPric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TypeOfPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of price and information about the price."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTypeOfPrice = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesPricing.mmPriceType;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesTradeDetails62.mmObject();
			isDerived = false;
			xmlTag = "TpOfPric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TypeOfPrice";
			definition = "Specifies the type of price and information about the price.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> TypeOfPrice32Choice.mmObject();
		}
	};
	@XmlElement(name = "FxAddtlDtls")
	protected RestrictedFINXMax350Text fXAdditionalDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINXMax350Text
	 * RestrictedFINXMax350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmExchangeRateInformation
	 * PaymentObligation.mmExchangeRateInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails62
	 * SecuritiesTradeDetails62}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FxAddtlDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FXAdditionalDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides additional details pertaining to foreign exchange instructions."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFXAdditionalDetails = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PaymentObligation.mmExchangeRateInformation;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesTradeDetails62.mmObject();
			isDerived = false;
			xmlTag = "FxAddtlDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FXAdditionalDetails";
			definition = "Provides additional details pertaining to foreign exchange instructions.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINXMax350Text.mmObject();
		}
	};
	@XmlElement(name = "SttlmInstrPrcgAddtlDtls")
	protected RestrictedFINXMax350Text settlementInstructionProcessingAdditionalDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINXMax350Text
	 * RestrictedFINXMax350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails62
	 * SecuritiesTradeDetails62}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmInstrPrcgAddtlDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementInstructionProcessingAdditionalDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides additional settlement processing information which can not be included within the structured fields of the message."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSettlementInstructionProcessingAdditionalDetails = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesTradeDetails62.mmObject();
			isDerived = false;
			xmlTag = "SttlmInstrPrcgAddtlDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementInstructionProcessingAdditionalDetails";
			definition = "Provides additional settlement processing information which can not be included within the structured fields of the message.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINXMax350Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesTradeDetails62.mmTradeIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails62.mmCollateralTransactionIdentification,
						com.tools20022.repository.msg.SecuritiesTradeDetails62.mmPlaceOfTrade, com.tools20022.repository.msg.SecuritiesTradeDetails62.mmPlaceOfClearing, com.tools20022.repository.msg.SecuritiesTradeDetails62.mmTradeDate,
						com.tools20022.repository.msg.SecuritiesTradeDetails62.mmSettlementDate, com.tools20022.repository.msg.SecuritiesTradeDetails62.mmEffectiveSettlementDate,
						com.tools20022.repository.msg.SecuritiesTradeDetails62.mmDealPrice, com.tools20022.repository.msg.SecuritiesTradeDetails62.mmNumberOfDaysAccrued,
						com.tools20022.repository.msg.SecuritiesTradeDetails62.mmOpeningClosing, com.tools20022.repository.msg.SecuritiesTradeDetails62.mmReporting,
						com.tools20022.repository.msg.SecuritiesTradeDetails62.mmTradeTransactionCondition, com.tools20022.repository.msg.SecuritiesTradeDetails62.mmInvestorCapacity,
						com.tools20022.repository.msg.SecuritiesTradeDetails62.mmTradeOriginatorRole, com.tools20022.repository.msg.SecuritiesTradeDetails62.mmTypeOfPrice,
						com.tools20022.repository.msg.SecuritiesTradeDetails62.mmFXAdditionalDetails, com.tools20022.repository.msg.SecuritiesTradeDetails62.mmSettlementInstructionProcessingAdditionalDetails);
				messageBuildingBlock_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionReversalAdvice002V05.mmTradeDetails, SecuritiesSettlementTransactionConfirmation002V06.mmTradeDetails,
						SecuritiesSettlementTransactionConfirmation002V07.mmTradeDetails, SecuritiesSettlementTransactionReversalAdvice002V06.mmTradeDetails);
				trace_lazy = () -> SecuritiesTrade.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintInvestorCapacityRule.forSecuritiesTradeDetails62,
						com.tools20022.repository.constraints.ConstraintPlaceOfTradeRule.forSecuritiesTradeDetails62, com.tools20022.repository.constraints.ConstraintTradeDateTimeUTCRule.forSecuritiesTradeDetails62,
						com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule.forSecuritiesTradeDetails62, com.tools20022.repository.constraints.ConstraintTradeDateGuideline.forSecuritiesTradeDetails62);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesTradeDetails62";
				definition = "Details of the securities trade.";
			}
		});
		return mmObject_lazy.get();
	}

	public List<RestrictedFINXMax16Text> getTradeIdentification() {
		return tradeIdentification == null ? tradeIdentification = new ArrayList<>() : tradeIdentification;
	}

	public SecuritiesTradeDetails62 setTradeIdentification(List<RestrictedFINXMax16Text> tradeIdentification) {
		this.tradeIdentification = Objects.requireNonNull(tradeIdentification);
		return this;
	}

	public List<RestrictedFINXMax16Text> getCollateralTransactionIdentification() {
		return collateralTransactionIdentification == null ? collateralTransactionIdentification = new ArrayList<>() : collateralTransactionIdentification;
	}

	public SecuritiesTradeDetails62 setCollateralTransactionIdentification(List<RestrictedFINXMax16Text> collateralTransactionIdentification) {
		this.collateralTransactionIdentification = Objects.requireNonNull(collateralTransactionIdentification);
		return this;
	}

	public Optional<PlaceOfTradeIdentification2> getPlaceOfTrade() {
		return placeOfTrade == null ? Optional.empty() : Optional.of(placeOfTrade);
	}

	public SecuritiesTradeDetails62 setPlaceOfTrade(com.tools20022.repository.msg.PlaceOfTradeIdentification2 placeOfTrade) {
		this.placeOfTrade = placeOfTrade;
		return this;
	}

	public Optional<PlaceOfClearingIdentification1> getPlaceOfClearing() {
		return placeOfClearing == null ? Optional.empty() : Optional.of(placeOfClearing);
	}

	public SecuritiesTradeDetails62 setPlaceOfClearing(com.tools20022.repository.msg.PlaceOfClearingIdentification1 placeOfClearing) {
		this.placeOfClearing = placeOfClearing;
		return this;
	}

	public Optional<TradeDate6Choice> getTradeDate() {
		return tradeDate == null ? Optional.empty() : Optional.of(tradeDate);
	}

	public SecuritiesTradeDetails62 setTradeDate(TradeDate6Choice tradeDate) {
		this.tradeDate = tradeDate;
		return this;
	}

	public Optional<SettlementDate12Choice> getSettlementDate() {
		return settlementDate == null ? Optional.empty() : Optional.of(settlementDate);
	}

	public SecuritiesTradeDetails62 setSettlementDate(SettlementDate12Choice settlementDate) {
		this.settlementDate = settlementDate;
		return this;
	}

	public SettlementDate14Choice getEffectiveSettlementDate() {
		return effectiveSettlementDate;
	}

	public SecuritiesTradeDetails62 setEffectiveSettlementDate(SettlementDate14Choice effectiveSettlementDate) {
		this.effectiveSettlementDate = Objects.requireNonNull(effectiveSettlementDate);
		return this;
	}

	public Optional<Price3> getDealPrice() {
		return dealPrice == null ? Optional.empty() : Optional.of(dealPrice);
	}

	public SecuritiesTradeDetails62 setDealPrice(com.tools20022.repository.msg.Price3 dealPrice) {
		this.dealPrice = dealPrice;
		return this;
	}

	public Optional<Max3Number> getNumberOfDaysAccrued() {
		return numberOfDaysAccrued == null ? Optional.empty() : Optional.of(numberOfDaysAccrued);
	}

	public SecuritiesTradeDetails62 setNumberOfDaysAccrued(Max3Number numberOfDaysAccrued) {
		this.numberOfDaysAccrued = numberOfDaysAccrued;
		return this;
	}

	public Optional<OpeningClosing4Choice> getOpeningClosing() {
		return openingClosing == null ? Optional.empty() : Optional.of(openingClosing);
	}

	public SecuritiesTradeDetails62 setOpeningClosing(OpeningClosing4Choice openingClosing) {
		this.openingClosing = openingClosing;
		return this;
	}

	public List<Reporting9Choice> getReporting() {
		return reporting == null ? reporting = new ArrayList<>() : reporting;
	}

	public SecuritiesTradeDetails62 setReporting(List<Reporting9Choice> reporting) {
		this.reporting = Objects.requireNonNull(reporting);
		return this;
	}

	public List<TradeTransactionCondition6Choice> getTradeTransactionCondition() {
		return tradeTransactionCondition == null ? tradeTransactionCondition = new ArrayList<>() : tradeTransactionCondition;
	}

	public SecuritiesTradeDetails62 setTradeTransactionCondition(List<TradeTransactionCondition6Choice> tradeTransactionCondition) {
		this.tradeTransactionCondition = Objects.requireNonNull(tradeTransactionCondition);
		return this;
	}

	public Optional<InvestorCapacity5Choice> getInvestorCapacity() {
		return investorCapacity == null ? Optional.empty() : Optional.of(investorCapacity);
	}

	public SecuritiesTradeDetails62 setInvestorCapacity(InvestorCapacity5Choice investorCapacity) {
		this.investorCapacity = investorCapacity;
		return this;
	}

	public Optional<TradeOriginator4Choice> getTradeOriginatorRole() {
		return tradeOriginatorRole == null ? Optional.empty() : Optional.of(tradeOriginatorRole);
	}

	public SecuritiesTradeDetails62 setTradeOriginatorRole(TradeOriginator4Choice tradeOriginatorRole) {
		this.tradeOriginatorRole = tradeOriginatorRole;
		return this;
	}

	public Optional<TypeOfPrice32Choice> getTypeOfPrice() {
		return typeOfPrice == null ? Optional.empty() : Optional.of(typeOfPrice);
	}

	public SecuritiesTradeDetails62 setTypeOfPrice(TypeOfPrice32Choice typeOfPrice) {
		this.typeOfPrice = typeOfPrice;
		return this;
	}

	public Optional<RestrictedFINXMax350Text> getFXAdditionalDetails() {
		return fXAdditionalDetails == null ? Optional.empty() : Optional.of(fXAdditionalDetails);
	}

	public SecuritiesTradeDetails62 setFXAdditionalDetails(RestrictedFINXMax350Text fXAdditionalDetails) {
		this.fXAdditionalDetails = fXAdditionalDetails;
		return this;
	}

	public Optional<RestrictedFINXMax350Text> getSettlementInstructionProcessingAdditionalDetails() {
		return settlementInstructionProcessingAdditionalDetails == null ? Optional.empty() : Optional.of(settlementInstructionProcessingAdditionalDetails);
	}

	public SecuritiesTradeDetails62 setSettlementInstructionProcessingAdditionalDetails(RestrictedFINXMax350Text settlementInstructionProcessingAdditionalDetails) {
		this.settlementInstructionProcessingAdditionalDetails = settlementInstructionProcessingAdditionalDetails;
		return this;
	}
}