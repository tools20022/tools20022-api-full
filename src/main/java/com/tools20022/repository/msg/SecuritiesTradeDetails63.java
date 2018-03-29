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
import com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotification002V06;
import com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstruction002V06;
import com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstruction002V07;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.datatype.Max3Number;
import com.tools20022.repository.datatype.RestrictedFINXMax16Text;
import com.tools20022.repository.datatype.RestrictedFINXMax350Text;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.PlaceOfClearingIdentification1;
import com.tools20022.repository.msg.PlaceOfTradeIdentification2;
import com.tools20022.repository.msg.Price3;
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
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails63#mmTradeIdentification
 * SecuritiesTradeDetails63.mmTradeIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails63#mmCollateralTransactionIdentification
 * SecuritiesTradeDetails63.mmCollateralTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails63#mmPlaceOfTrade
 * SecuritiesTradeDetails63.mmPlaceOfTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails63#mmPlaceOfClearing
 * SecuritiesTradeDetails63.mmPlaceOfClearing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails63#mmTradeDate
 * SecuritiesTradeDetails63.mmTradeDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails63#mmSettlementDate
 * SecuritiesTradeDetails63.mmSettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails63#mmLateDeliveryDate
 * SecuritiesTradeDetails63.mmLateDeliveryDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails63#mmDealPrice
 * SecuritiesTradeDetails63.mmDealPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails63#mmNumberOfDaysAccrued
 * SecuritiesTradeDetails63.mmNumberOfDaysAccrued}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails63#mmOpeningClosing
 * SecuritiesTradeDetails63.mmOpeningClosing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails63#mmReporting
 * SecuritiesTradeDetails63.mmReporting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails63#mmTradeTransactionCondition
 * SecuritiesTradeDetails63.mmTradeTransactionCondition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails63#mmInvestorCapacity
 * SecuritiesTradeDetails63.mmInvestorCapacity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails63#mmTradeOriginatorRole
 * SecuritiesTradeDetails63.mmTradeOriginatorRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails63#mmTypeOfPrice
 * SecuritiesTradeDetails63.mmTypeOfPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails63#mmCurrencyToBuyOrSell
 * SecuritiesTradeDetails63.mmCurrencyToBuyOrSell}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails63#mmMatchingStatus
 * SecuritiesTradeDetails63.mmMatchingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails63#mmAffirmationStatus
 * SecuritiesTradeDetails63.mmAffirmationStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails63#mmFXAdditionalDetails
 * SecuritiesTradeDetails63.mmFXAdditionalDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails63#mmSettlementInstructionProcessingAdditionalDetails
 * SecuritiesTradeDetails63.mmSettlementInstructionProcessingAdditionalDetails}</li>
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
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotification002V06#mmTradeDetails
 * SecuritiesSettlementTransactionGenerationNotification002V06.mmTradeDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstruction002V06#mmTradeDetails
 * SecuritiesSettlementTransactionInstruction002V06.mmTradeDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstruction002V07#mmTradeDetails
 * SecuritiesSettlementTransactionInstruction002V07.mmTradeDetails}</li>
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
 * {@linkplain com.tools20022.repository.constraints.ConstraintCurrencyToBuyOrSellRule#forSecuritiesTradeDetails63
 * ConstraintCurrencyToBuyOrSellRule.forSecuritiesTradeDetails63}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintPlaceOfTradeRule#forSecuritiesTradeDetails63
 * ConstraintPlaceOfTradeRule.forSecuritiesTradeDetails63}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintLateDeliveryDateRule#forSecuritiesTradeDetails63
 * ConstraintLateDeliveryDateRule.forSecuritiesTradeDetails63}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintTradeDateTimeUTCRule#forSecuritiesTradeDetails63
 * ConstraintTradeDateTimeUTCRule.forSecuritiesTradeDetails63}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule#forSecuritiesTradeDetails63
 * ConstraintAdditionalDetailsRule.forSecuritiesTradeDetails63}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintInvestorCapacityRule#forSecuritiesTradeDetails63
 * ConstraintInvestorCapacityRule.forSecuritiesTradeDetails63}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintTradeDateGuideline#forSecuritiesTradeDetails63
 * ConstraintTradeDateGuideline.forSecuritiesTradeDetails63}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesTradeDetails63"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Details of the securities trade."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SecuritiesTradeDetails63", propOrder = {"tradeIdentification", "collateralTransactionIdentification", "placeOfTrade", "placeOfClearing", "tradeDate", "settlementDate", "lateDeliveryDate", "dealPrice",
		"numberOfDaysAccrued", "openingClosing", "reporting", "tradeTransactionCondition", "investorCapacity", "tradeOriginatorRole", "typeOfPrice", "currencyToBuyOrSell", "matchingStatus", "affirmationStatus", "fXAdditionalDetails",
		"settlementInstructionProcessingAdditionalDetails"})
public class SecuritiesTradeDetails63 {

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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails63
	 * SecuritiesTradeDetails63}</li>
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
	public static final MMMessageAttribute<SecuritiesTradeDetails63, List<RestrictedFINXMax16Text>> mmTradeIdentification = new MMMessageAttribute<SecuritiesTradeDetails63, List<RestrictedFINXMax16Text>>() {
		{
			businessElementTrace_lazy = () -> TradeIdentification.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesTradeDetails63.mmObject();
			isDerived = false;
			xmlTag = "TradId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeIdentification";
			definition = "Reference assigned to the trade by the investor or the trading party. This reference will be used throughout the trade life cycle to access/update the trade details.";
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINXMax16Text.mmObject();
		}

		@Override
		public List<RestrictedFINXMax16Text> getValue(SecuritiesTradeDetails63 obj) {
			return obj.getTradeIdentification();
		}

		@Override
		public void setValue(SecuritiesTradeDetails63 obj, List<RestrictedFINXMax16Text> value) {
			obj.setTradeIdentification(value);
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails63
	 * SecuritiesTradeDetails63}</li>
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
	public static final MMMessageAttribute<SecuritiesTradeDetails63, List<RestrictedFINXMax16Text>> mmCollateralTransactionIdentification = new MMMessageAttribute<SecuritiesTradeDetails63, List<RestrictedFINXMax16Text>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeIdentification.mmCollateralTransactionIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesTradeDetails63.mmObject();
			isDerived = false;
			xmlTag = "CollTxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralTransactionIdentification";
			definition = "Unambiguous identification of a collateral transaction as assigned by the instructing party.";
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINXMax16Text.mmObject();
		}

		@Override
		public List<RestrictedFINXMax16Text> getValue(SecuritiesTradeDetails63 obj) {
			return obj.getCollateralTransactionIdentification();
		}

		@Override
		public void setValue(SecuritiesTradeDetails63 obj, List<RestrictedFINXMax16Text> value) {
			obj.setCollateralTransactionIdentification(value);
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails63
	 * SecuritiesTradeDetails63}</li>
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
	public static final MMMessageAssociationEnd<SecuritiesTradeDetails63, Optional<PlaceOfTradeIdentification2>> mmPlaceOfTrade = new MMMessageAssociationEnd<SecuritiesTradeDetails63, Optional<PlaceOfTradeIdentification2>>() {
		{
			businessElementTrace_lazy = () -> Security.mmTradingMarket;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesTradeDetails63.mmObject();
			isDerived = false;
			xmlTag = "PlcOfTrad";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfTrade";
			definition = "Market in which a trade transaction has been executed.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PlaceOfTradeIdentification2.mmObject();
		}

		@Override
		public Optional<PlaceOfTradeIdentification2> getValue(SecuritiesTradeDetails63 obj) {
			return obj.getPlaceOfTrade();
		}

		@Override
		public void setValue(SecuritiesTradeDetails63 obj, Optional<PlaceOfTradeIdentification2> value) {
			obj.setPlaceOfTrade(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails63
	 * SecuritiesTradeDetails63}</li>
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
	public static final MMMessageAttribute<SecuritiesTradeDetails63, Optional<PlaceOfClearingIdentification1>> mmPlaceOfClearing = new MMMessageAttribute<SecuritiesTradeDetails63, Optional<PlaceOfClearingIdentification1>>() {
		{
			businessElementTrace_lazy = () -> OrganisationIdentification.mmAnyBIC;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesTradeDetails63.mmObject();
			isDerived = false;
			xmlTag = "PlcOfClr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfClearing";
			definition = "Infrastructure which may be a component of a clearing house and wich facilitates clearing and settlement for its members by standing between the buyer and the seller. It may net transactions and it substitutes itself as settlement counterparty for each position.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PlaceOfClearingIdentification1.mmObject();
		}

		@Override
		public Optional<PlaceOfClearingIdentification1> getValue(SecuritiesTradeDetails63 obj) {
			return obj.getPlaceOfClearing();
		}

		@Override
		public void setValue(SecuritiesTradeDetails63 obj, Optional<PlaceOfClearingIdentification1> value) {
			obj.setPlaceOfClearing(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails63
	 * SecuritiesTradeDetails63}</li>
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
	public static final MMMessageAssociationEnd<SecuritiesTradeDetails63, Optional<TradeDate6Choice>> mmTradeDate = new MMMessageAssociationEnd<SecuritiesTradeDetails63, Optional<TradeDate6Choice>>() {
		{
			businessElementTrace_lazy = () -> Trade.mmTradeDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesTradeDetails63.mmObject();
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

		@Override
		public Optional<TradeDate6Choice> getValue(SecuritiesTradeDetails63 obj) {
			return obj.getTradeDate();
		}

		@Override
		public void setValue(SecuritiesTradeDetails63 obj, Optional<TradeDate6Choice> value) {
			obj.setTradeDate(value.orElse(null));
		}
	};
	@XmlElement(name = "SttlmDt", required = true)
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails63
	 * SecuritiesTradeDetails63}</li>
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
	public static final MMMessageAssociationEnd<SecuritiesTradeDetails63, SettlementDate12Choice> mmSettlementDate = new MMMessageAssociationEnd<SecuritiesTradeDetails63, SettlementDate12Choice>() {
		{
			businessElementTrace_lazy = () -> Obligation.mmRequestedSettlementDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesTradeDetails63.mmObject();
			isDerived = false;
			xmlTag = "SttlmDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDate";
			definition = "Date and time at which the securities are to be delivered or received.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SettlementDate12Choice.mmObject();
		}

		@Override
		public SettlementDate12Choice getValue(SecuritiesTradeDetails63 obj) {
			return obj.getSettlementDate();
		}

		@Override
		public void setValue(SecuritiesTradeDetails63 obj, SettlementDate12Choice value) {
			obj.setSettlementDate(value);
		}
	};
	@XmlElement(name = "LateDlvryDt")
	protected DateAndDateTimeChoice lateDeliveryDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTimeChoice
	 * DateAndDateTimeChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmLateDeliveryDate
	 * SecuritiesTransfer.mmLateDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails63
	 * SecuritiesTradeDetails63}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LateDlvryDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateDeliveryDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time after the settlement date specified in the trade, used for pool trades resulting from the original To Be Assigned (TBA) securities."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesTradeDetails63, Optional<DateAndDateTimeChoice>> mmLateDeliveryDate = new MMMessageAttribute<SecuritiesTradeDetails63, Optional<DateAndDateTimeChoice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTransfer.mmLateDeliveryDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesTradeDetails63.mmObject();
			isDerived = false;
			xmlTag = "LateDlvryDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDate";
			definition = "Date and time after the settlement date specified in the trade, used for pool trades resulting from the original To Be Assigned (TBA) securities.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateAndDateTimeChoice.mmObject();
		}

		@Override
		public Optional<DateAndDateTimeChoice> getValue(SecuritiesTradeDetails63 obj) {
			return obj.getLateDeliveryDate();
		}

		@Override
		public void setValue(SecuritiesTradeDetails63 obj, Optional<DateAndDateTimeChoice> value) {
			obj.setLateDeliveryDate(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails63
	 * SecuritiesTradeDetails63}</li>
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
	public static final MMMessageAssociationEnd<SecuritiesTradeDetails63, Optional<Price3>> mmDealPrice = new MMMessageAssociationEnd<SecuritiesTradeDetails63, Optional<Price3>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeExecution.mmDealPrice;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesTradeDetails63.mmObject();
			isDerived = false;
			xmlTag = "DealPric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DealPrice";
			definition = "Specifies the price of the traded financial instrument.\nThis is the deal price of the individual trade transaction. \nIf there is only one trade transaction for the execution of the trade, then the deal price could equal the executed trade price (unless, for example, the price includes commissions or rounding, or some other factor has been applied to the deal price or the executed trade price, or both).";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Price3.mmObject();
		}

		@Override
		public Optional<Price3> getValue(SecuritiesTradeDetails63 obj) {
			return obj.getDealPrice();
		}

		@Override
		public void setValue(SecuritiesTradeDetails63 obj, Optional<Price3> value) {
			obj.setDealPrice(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails63
	 * SecuritiesTradeDetails63}</li>
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
	public static final MMMessageAttribute<SecuritiesTradeDetails63, Optional<Max3Number>> mmNumberOfDaysAccrued = new MMMessageAttribute<SecuritiesTradeDetails63, Optional<Max3Number>>() {
		{
			businessElementTrace_lazy = () -> DateTimePeriod.mmNumberOfDays;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesTradeDetails63.mmObject();
			isDerived = false;
			xmlTag = "NbOfDaysAcrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NumberOfDaysAccrued";
			definition = "Number of days on which the interest rate accrues (daily accrual note).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max3Number.mmObject();
		}

		@Override
		public Optional<Max3Number> getValue(SecuritiesTradeDetails63 obj) {
			return obj.getNumberOfDaysAccrued();
		}

		@Override
		public void setValue(SecuritiesTradeDetails63 obj, Optional<Max3Number> value) {
			obj.setNumberOfDaysAccrued(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails63
	 * SecuritiesTradeDetails63}</li>
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
	public static final MMMessageAttribute<SecuritiesTradeDetails63, Optional<OpeningClosing4Choice>> mmOpeningClosing = new MMMessageAttribute<SecuritiesTradeDetails63, Optional<OpeningClosing4Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTrade.mmOpeningClosingIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesTradeDetails63.mmObject();
			isDerived = false;
			xmlTag = "OpngClsg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OpeningClosing";
			definition = "Specifies additional information relative to the processing of the trade.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> OpeningClosing4Choice.mmObject();
		}

		@Override
		public Optional<OpeningClosing4Choice> getValue(SecuritiesTradeDetails63 obj) {
			return obj.getOpeningClosing();
		}

		@Override
		public void setValue(SecuritiesTradeDetails63 obj, Optional<OpeningClosing4Choice> value) {
			obj.setOpeningClosing(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails63
	 * SecuritiesTradeDetails63}</li>
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
	public static final MMMessageAttribute<SecuritiesTradeDetails63, List<Reporting9Choice>> mmReporting = new MMMessageAttribute<SecuritiesTradeDetails63, List<Reporting9Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesTradeDetails63.mmObject();
			isDerived = false;
			xmlTag = "Rptg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reporting";
			definition = "Specifies that a trade is to be reported to a third party.";
			minOccurs = 0;
			complexType_lazy = () -> Reporting9Choice.mmObject();
		}

		@Override
		public List<Reporting9Choice> getValue(SecuritiesTradeDetails63 obj) {
			return obj.getReporting();
		}

		@Override
		public void setValue(SecuritiesTradeDetails63 obj, List<Reporting9Choice> value) {
			obj.setReporting(value);
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails63
	 * SecuritiesTradeDetails63}</li>
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
	public static final MMMessageAttribute<SecuritiesTradeDetails63, List<TradeTransactionCondition6Choice>> mmTradeTransactionCondition = new MMMessageAttribute<SecuritiesTradeDetails63, List<TradeTransactionCondition6Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTrade.mmTradeTransactionCondition;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesTradeDetails63.mmObject();
			isDerived = false;
			xmlTag = "TradTxCond";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeTransactionCondition";
			definition = "Indicates the conditions under which the order/trade is to be/was executed.";
			minOccurs = 0;
			complexType_lazy = () -> TradeTransactionCondition6Choice.mmObject();
		}

		@Override
		public List<TradeTransactionCondition6Choice> getValue(SecuritiesTradeDetails63 obj) {
			return obj.getTradeTransactionCondition();
		}

		@Override
		public void setValue(SecuritiesTradeDetails63 obj, List<TradeTransactionCondition6Choice> value) {
			obj.setTradeTransactionCondition(value);
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails63
	 * SecuritiesTradeDetails63}</li>
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
	public static final MMMessageAttribute<SecuritiesTradeDetails63, Optional<InvestorCapacity5Choice>> mmInvestorCapacity = new MMMessageAttribute<SecuritiesTradeDetails63, Optional<InvestorCapacity5Choice>>() {
		{
			businessElementTrace_lazy = () -> InvestorRole.mmCapacity;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesTradeDetails63.mmObject();
			isDerived = false;
			xmlTag = "InvstrCpcty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestorCapacity";
			definition = "Specifies the role of the investor in the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> InvestorCapacity5Choice.mmObject();
		}

		@Override
		public Optional<InvestorCapacity5Choice> getValue(SecuritiesTradeDetails63 obj) {
			return obj.getInvestorCapacity();
		}

		@Override
		public void setValue(SecuritiesTradeDetails63 obj, Optional<InvestorCapacity5Choice> value) {
			obj.setInvestorCapacity(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails63
	 * SecuritiesTradeDetails63}</li>
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
	public static final MMMessageAttribute<SecuritiesTradeDetails63, Optional<TradeOriginator4Choice>> mmTradeOriginatorRole = new MMMessageAttribute<SecuritiesTradeDetails63, Optional<TradeOriginator4Choice>>() {
		{
			businessComponentTrace_lazy = () -> TradeOriginatorRole.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesTradeDetails63.mmObject();
			isDerived = false;
			xmlTag = "TradOrgtrRole";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeOriginatorRole";
			definition = "Specifies the role of the trading party in the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> TradeOriginator4Choice.mmObject();
		}

		@Override
		public Optional<TradeOriginator4Choice> getValue(SecuritiesTradeDetails63 obj) {
			return obj.getTradeOriginatorRole();
		}

		@Override
		public void setValue(SecuritiesTradeDetails63 obj, Optional<TradeOriginator4Choice> value) {
			obj.setTradeOriginatorRole(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails63
	 * SecuritiesTradeDetails63}</li>
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
	public static final MMMessageAttribute<SecuritiesTradeDetails63, Optional<TypeOfPrice32Choice>> mmTypeOfPrice = new MMMessageAttribute<SecuritiesTradeDetails63, Optional<TypeOfPrice32Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesPricing.mmPriceType;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesTradeDetails63.mmObject();
			isDerived = false;
			xmlTag = "TpOfPric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TypeOfPrice";
			definition = "Specifies the type of price and information about the price.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> TypeOfPrice32Choice.mmObject();
		}

		@Override
		public Optional<TypeOfPrice32Choice> getValue(SecuritiesTradeDetails63 obj) {
			return obj.getTypeOfPrice();
		}

		@Override
		public void setValue(SecuritiesTradeDetails63 obj, Optional<TypeOfPrice32Choice> value) {
			obj.setTypeOfPrice(value.orElse(null));
		}
	};
	@XmlElement(name = "CcyToBuyOrSell")
	protected CurrencyToBuyOrSell1Choice currencyToBuyOrSell;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.CurrencyToBuyOrSell1Choice
	 * CurrencyToBuyOrSell1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails63
	 * SecuritiesTradeDetails63}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CcyToBuyOrSell"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyToBuyOrSell"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account servicer is instructed to buy the indicated currency after the receipt of cash proceeds or to sell the indicated currency in order to obtain the necessary currency to fund the transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesTradeDetails63, Optional<CurrencyToBuyOrSell1Choice>> mmCurrencyToBuyOrSell = new MMMessageAttribute<SecuritiesTradeDetails63, Optional<CurrencyToBuyOrSell1Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesTradeDetails63.mmObject();
			isDerived = false;
			xmlTag = "CcyToBuyOrSell";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyToBuyOrSell";
			definition = "Account servicer is instructed to buy the indicated currency after the receipt of cash proceeds or to sell the indicated currency in order to obtain the necessary currency to fund the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CurrencyToBuyOrSell1Choice.mmObject();
		}

		@Override
		public Optional<CurrencyToBuyOrSell1Choice> getValue(SecuritiesTradeDetails63 obj) {
			return obj.getCurrencyToBuyOrSell();
		}

		@Override
		public void setValue(SecuritiesTradeDetails63 obj, Optional<CurrencyToBuyOrSell1Choice> value) {
			obj.setCurrencyToBuyOrSell(value.orElse(null));
		}
	};
	@XmlElement(name = "MtchgSts")
	protected MatchingStatus28Choice matchingStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus28Choice
	 * MatchingStatus28Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#mmMatchingStatus
	 * SecuritiesTradeStatus.mmMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails63
	 * SecuritiesTradeDetails63}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MtchgSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MatchingStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the matching status of the instruction."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesTradeDetails63, Optional<MatchingStatus28Choice>> mmMatchingStatus = new MMMessageAttribute<SecuritiesTradeDetails63, Optional<MatchingStatus28Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeStatus.mmMatchingStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesTradeDetails63.mmObject();
			isDerived = false;
			xmlTag = "MtchgSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MatchingStatus";
			definition = "Provides the matching status of the instruction.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> MatchingStatus28Choice.mmObject();
		}

		@Override
		public Optional<MatchingStatus28Choice> getValue(SecuritiesTradeDetails63 obj) {
			return obj.getMatchingStatus();
		}

		@Override
		public void setValue(SecuritiesTradeDetails63 obj, Optional<MatchingStatus28Choice> value) {
			obj.setMatchingStatus(value.orElse(null));
		}
	};
	@XmlElement(name = "AffirmSts")
	protected AffirmationStatus9Choice affirmationStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.AffirmationStatus9Choice
	 * AffirmationStatus9Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#mmAffirmationStatus
	 * SecuritiesTradeStatus.mmAffirmationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails63
	 * SecuritiesTradeDetails63}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AffirmSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AffirmationStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of affirmation of a trade."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesTradeDetails63, Optional<AffirmationStatus9Choice>> mmAffirmationStatus = new MMMessageAttribute<SecuritiesTradeDetails63, Optional<AffirmationStatus9Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeStatus.mmAffirmationStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesTradeDetails63.mmObject();
			isDerived = false;
			xmlTag = "AffirmSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AffirmationStatus";
			definition = "Status of affirmation of a trade.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AffirmationStatus9Choice.mmObject();
		}

		@Override
		public Optional<AffirmationStatus9Choice> getValue(SecuritiesTradeDetails63 obj) {
			return obj.getAffirmationStatus();
		}

		@Override
		public void setValue(SecuritiesTradeDetails63 obj, Optional<AffirmationStatus9Choice> value) {
			obj.setAffirmationStatus(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails63
	 * SecuritiesTradeDetails63}</li>
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
	public static final MMMessageAttribute<SecuritiesTradeDetails63, Optional<RestrictedFINXMax350Text>> mmFXAdditionalDetails = new MMMessageAttribute<SecuritiesTradeDetails63, Optional<RestrictedFINXMax350Text>>() {
		{
			businessElementTrace_lazy = () -> PaymentObligation.mmExchangeRateInformation;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesTradeDetails63.mmObject();
			isDerived = false;
			xmlTag = "FxAddtlDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FXAdditionalDetails";
			definition = "Provides additional details pertaining to foreign exchange instructions.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINXMax350Text.mmObject();
		}

		@Override
		public Optional<RestrictedFINXMax350Text> getValue(SecuritiesTradeDetails63 obj) {
			return obj.getFXAdditionalDetails();
		}

		@Override
		public void setValue(SecuritiesTradeDetails63 obj, Optional<RestrictedFINXMax350Text> value) {
			obj.setFXAdditionalDetails(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails63
	 * SecuritiesTradeDetails63}</li>
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
	public static final MMMessageAttribute<SecuritiesTradeDetails63, Optional<RestrictedFINXMax350Text>> mmSettlementInstructionProcessingAdditionalDetails = new MMMessageAttribute<SecuritiesTradeDetails63, Optional<RestrictedFINXMax350Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesTradeDetails63.mmObject();
			isDerived = false;
			xmlTag = "SttlmInstrPrcgAddtlDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementInstructionProcessingAdditionalDetails";
			definition = "Provides additional settlement processing information which can not be included within the structured fields of the message.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINXMax350Text.mmObject();
		}

		@Override
		public Optional<RestrictedFINXMax350Text> getValue(SecuritiesTradeDetails63 obj) {
			return obj.getSettlementInstructionProcessingAdditionalDetails();
		}

		@Override
		public void setValue(SecuritiesTradeDetails63 obj, Optional<RestrictedFINXMax350Text> value) {
			obj.setSettlementInstructionProcessingAdditionalDetails(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesTradeDetails63.mmTradeIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails63.mmCollateralTransactionIdentification,
						com.tools20022.repository.msg.SecuritiesTradeDetails63.mmPlaceOfTrade, com.tools20022.repository.msg.SecuritiesTradeDetails63.mmPlaceOfClearing, com.tools20022.repository.msg.SecuritiesTradeDetails63.mmTradeDate,
						com.tools20022.repository.msg.SecuritiesTradeDetails63.mmSettlementDate, com.tools20022.repository.msg.SecuritiesTradeDetails63.mmLateDeliveryDate, com.tools20022.repository.msg.SecuritiesTradeDetails63.mmDealPrice,
						com.tools20022.repository.msg.SecuritiesTradeDetails63.mmNumberOfDaysAccrued, com.tools20022.repository.msg.SecuritiesTradeDetails63.mmOpeningClosing,
						com.tools20022.repository.msg.SecuritiesTradeDetails63.mmReporting, com.tools20022.repository.msg.SecuritiesTradeDetails63.mmTradeTransactionCondition,
						com.tools20022.repository.msg.SecuritiesTradeDetails63.mmInvestorCapacity, com.tools20022.repository.msg.SecuritiesTradeDetails63.mmTradeOriginatorRole,
						com.tools20022.repository.msg.SecuritiesTradeDetails63.mmTypeOfPrice, com.tools20022.repository.msg.SecuritiesTradeDetails63.mmCurrencyToBuyOrSell,
						com.tools20022.repository.msg.SecuritiesTradeDetails63.mmMatchingStatus, com.tools20022.repository.msg.SecuritiesTradeDetails63.mmAffirmationStatus,
						com.tools20022.repository.msg.SecuritiesTradeDetails63.mmFXAdditionalDetails, com.tools20022.repository.msg.SecuritiesTradeDetails63.mmSettlementInstructionProcessingAdditionalDetails);
				messageBuildingBlock_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionGenerationNotification002V06.mmTradeDetails, SecuritiesSettlementTransactionInstruction002V06.mmTradeDetails,
						SecuritiesSettlementTransactionInstruction002V07.mmTradeDetails);
				trace_lazy = () -> SecuritiesTrade.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCurrencyToBuyOrSellRule.forSecuritiesTradeDetails63,
						com.tools20022.repository.constraints.ConstraintPlaceOfTradeRule.forSecuritiesTradeDetails63, com.tools20022.repository.constraints.ConstraintLateDeliveryDateRule.forSecuritiesTradeDetails63,
						com.tools20022.repository.constraints.ConstraintTradeDateTimeUTCRule.forSecuritiesTradeDetails63, com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule.forSecuritiesTradeDetails63,
						com.tools20022.repository.constraints.ConstraintInvestorCapacityRule.forSecuritiesTradeDetails63, com.tools20022.repository.constraints.ConstraintTradeDateGuideline.forSecuritiesTradeDetails63);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesTradeDetails63";
				definition = "Details of the securities trade.";
			}
		});
		return mmObject_lazy.get();
	}

	public List<RestrictedFINXMax16Text> getTradeIdentification() {
		return tradeIdentification == null ? tradeIdentification = new ArrayList<>() : tradeIdentification;
	}

	public SecuritiesTradeDetails63 setTradeIdentification(List<RestrictedFINXMax16Text> tradeIdentification) {
		this.tradeIdentification = Objects.requireNonNull(tradeIdentification);
		return this;
	}

	public List<RestrictedFINXMax16Text> getCollateralTransactionIdentification() {
		return collateralTransactionIdentification == null ? collateralTransactionIdentification = new ArrayList<>() : collateralTransactionIdentification;
	}

	public SecuritiesTradeDetails63 setCollateralTransactionIdentification(List<RestrictedFINXMax16Text> collateralTransactionIdentification) {
		this.collateralTransactionIdentification = Objects.requireNonNull(collateralTransactionIdentification);
		return this;
	}

	public Optional<PlaceOfTradeIdentification2> getPlaceOfTrade() {
		return placeOfTrade == null ? Optional.empty() : Optional.of(placeOfTrade);
	}

	public SecuritiesTradeDetails63 setPlaceOfTrade(PlaceOfTradeIdentification2 placeOfTrade) {
		this.placeOfTrade = placeOfTrade;
		return this;
	}

	public Optional<PlaceOfClearingIdentification1> getPlaceOfClearing() {
		return placeOfClearing == null ? Optional.empty() : Optional.of(placeOfClearing);
	}

	public SecuritiesTradeDetails63 setPlaceOfClearing(PlaceOfClearingIdentification1 placeOfClearing) {
		this.placeOfClearing = placeOfClearing;
		return this;
	}

	public Optional<TradeDate6Choice> getTradeDate() {
		return tradeDate == null ? Optional.empty() : Optional.of(tradeDate);
	}

	public SecuritiesTradeDetails63 setTradeDate(TradeDate6Choice tradeDate) {
		this.tradeDate = tradeDate;
		return this;
	}

	public SettlementDate12Choice getSettlementDate() {
		return settlementDate;
	}

	public SecuritiesTradeDetails63 setSettlementDate(SettlementDate12Choice settlementDate) {
		this.settlementDate = Objects.requireNonNull(settlementDate);
		return this;
	}

	public Optional<DateAndDateTimeChoice> getLateDeliveryDate() {
		return lateDeliveryDate == null ? Optional.empty() : Optional.of(lateDeliveryDate);
	}

	public SecuritiesTradeDetails63 setLateDeliveryDate(DateAndDateTimeChoice lateDeliveryDate) {
		this.lateDeliveryDate = lateDeliveryDate;
		return this;
	}

	public Optional<Price3> getDealPrice() {
		return dealPrice == null ? Optional.empty() : Optional.of(dealPrice);
	}

	public SecuritiesTradeDetails63 setDealPrice(Price3 dealPrice) {
		this.dealPrice = dealPrice;
		return this;
	}

	public Optional<Max3Number> getNumberOfDaysAccrued() {
		return numberOfDaysAccrued == null ? Optional.empty() : Optional.of(numberOfDaysAccrued);
	}

	public SecuritiesTradeDetails63 setNumberOfDaysAccrued(Max3Number numberOfDaysAccrued) {
		this.numberOfDaysAccrued = numberOfDaysAccrued;
		return this;
	}

	public Optional<OpeningClosing4Choice> getOpeningClosing() {
		return openingClosing == null ? Optional.empty() : Optional.of(openingClosing);
	}

	public SecuritiesTradeDetails63 setOpeningClosing(OpeningClosing4Choice openingClosing) {
		this.openingClosing = openingClosing;
		return this;
	}

	public List<Reporting9Choice> getReporting() {
		return reporting == null ? reporting = new ArrayList<>() : reporting;
	}

	public SecuritiesTradeDetails63 setReporting(List<Reporting9Choice> reporting) {
		this.reporting = Objects.requireNonNull(reporting);
		return this;
	}

	public List<TradeTransactionCondition6Choice> getTradeTransactionCondition() {
		return tradeTransactionCondition == null ? tradeTransactionCondition = new ArrayList<>() : tradeTransactionCondition;
	}

	public SecuritiesTradeDetails63 setTradeTransactionCondition(List<TradeTransactionCondition6Choice> tradeTransactionCondition) {
		this.tradeTransactionCondition = Objects.requireNonNull(tradeTransactionCondition);
		return this;
	}

	public Optional<InvestorCapacity5Choice> getInvestorCapacity() {
		return investorCapacity == null ? Optional.empty() : Optional.of(investorCapacity);
	}

	public SecuritiesTradeDetails63 setInvestorCapacity(InvestorCapacity5Choice investorCapacity) {
		this.investorCapacity = investorCapacity;
		return this;
	}

	public Optional<TradeOriginator4Choice> getTradeOriginatorRole() {
		return tradeOriginatorRole == null ? Optional.empty() : Optional.of(tradeOriginatorRole);
	}

	public SecuritiesTradeDetails63 setTradeOriginatorRole(TradeOriginator4Choice tradeOriginatorRole) {
		this.tradeOriginatorRole = tradeOriginatorRole;
		return this;
	}

	public Optional<TypeOfPrice32Choice> getTypeOfPrice() {
		return typeOfPrice == null ? Optional.empty() : Optional.of(typeOfPrice);
	}

	public SecuritiesTradeDetails63 setTypeOfPrice(TypeOfPrice32Choice typeOfPrice) {
		this.typeOfPrice = typeOfPrice;
		return this;
	}

	public Optional<CurrencyToBuyOrSell1Choice> getCurrencyToBuyOrSell() {
		return currencyToBuyOrSell == null ? Optional.empty() : Optional.of(currencyToBuyOrSell);
	}

	public SecuritiesTradeDetails63 setCurrencyToBuyOrSell(CurrencyToBuyOrSell1Choice currencyToBuyOrSell) {
		this.currencyToBuyOrSell = currencyToBuyOrSell;
		return this;
	}

	public Optional<MatchingStatus28Choice> getMatchingStatus() {
		return matchingStatus == null ? Optional.empty() : Optional.of(matchingStatus);
	}

	public SecuritiesTradeDetails63 setMatchingStatus(MatchingStatus28Choice matchingStatus) {
		this.matchingStatus = matchingStatus;
		return this;
	}

	public Optional<AffirmationStatus9Choice> getAffirmationStatus() {
		return affirmationStatus == null ? Optional.empty() : Optional.of(affirmationStatus);
	}

	public SecuritiesTradeDetails63 setAffirmationStatus(AffirmationStatus9Choice affirmationStatus) {
		this.affirmationStatus = affirmationStatus;
		return this;
	}

	public Optional<RestrictedFINXMax350Text> getFXAdditionalDetails() {
		return fXAdditionalDetails == null ? Optional.empty() : Optional.of(fXAdditionalDetails);
	}

	public SecuritiesTradeDetails63 setFXAdditionalDetails(RestrictedFINXMax350Text fXAdditionalDetails) {
		this.fXAdditionalDetails = fXAdditionalDetails;
		return this;
	}

	public Optional<RestrictedFINXMax350Text> getSettlementInstructionProcessingAdditionalDetails() {
		return settlementInstructionProcessingAdditionalDetails == null ? Optional.empty() : Optional.of(settlementInstructionProcessingAdditionalDetails);
	}

	public SecuritiesTradeDetails63 setSettlementInstructionProcessingAdditionalDetails(RestrictedFINXMax350Text settlementInstructionProcessingAdditionalDetails) {
		this.settlementInstructionProcessingAdditionalDetails = settlementInstructionProcessingAdditionalDetails;
		return this;
	}
}