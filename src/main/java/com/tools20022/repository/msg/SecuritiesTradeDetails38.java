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
import com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV05;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.datatype.AnyBICIdentifier;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max3Number;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.MarketIdentification78;
import com.tools20022.repository.msg.Price2;
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
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails38#mmPlaceOfTrade
 * SecuritiesTradeDetails38.mmPlaceOfTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails38#mmPlaceOfClearing
 * SecuritiesTradeDetails38.mmPlaceOfClearing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails38#mmTradeDate
 * SecuritiesTradeDetails38.mmTradeDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails38#mmSettlementDate
 * SecuritiesTradeDetails38.mmSettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails38#mmEffectiveSettlementDate
 * SecuritiesTradeDetails38.mmEffectiveSettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails38#mmDealPrice
 * SecuritiesTradeDetails38.mmDealPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails38#mmReporting
 * SecuritiesTradeDetails38.mmReporting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails38#mmNumberOfDaysAccrued
 * SecuritiesTradeDetails38.mmNumberOfDaysAccrued}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails38#mmTradeTransactionCondition
 * SecuritiesTradeDetails38.mmTradeTransactionCondition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails38#mmInvestorCapacity
 * SecuritiesTradeDetails38.mmInvestorCapacity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails38#mmTradeOriginatorRole
 * SecuritiesTradeDetails38.mmTradeOriginatorRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails38#mmSettlementInstructionProcessingAdditionalDetails
 * SecuritiesTradeDetails38.mmSettlementInstructionProcessingAdditionalDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails38#mmFXAdditionalDetails
 * SecuritiesTradeDetails38.mmFXAdditionalDetails}</li>
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
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV05#mmTradeDetails
 * SecuritiesFinancingConfirmationV05.mmTradeDetails}</li>
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
 * {@linkplain com.tools20022.repository.constraints.ConstraintInvestorCapacityRule#forSecuritiesTradeDetails38
 * ConstraintInvestorCapacityRule.forSecuritiesTradeDetails38}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintPlaceOfTradeRule#forSecuritiesTradeDetails38
 * ConstraintPlaceOfTradeRule.forSecuritiesTradeDetails38}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintTradeDateTimeUTCRule#forSecuritiesTradeDetails38
 * ConstraintTradeDateTimeUTCRule.forSecuritiesTradeDetails38}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule#forSecuritiesTradeDetails38
 * ConstraintAdditionalDetailsRule.forSecuritiesTradeDetails38}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCurrencyToBuyOrSellRule#forSecuritiesTradeDetails38
 * ConstraintCurrencyToBuyOrSellRule.forSecuritiesTradeDetails38}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesTradeDetails38"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Details of the securities trade."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails55
 * SecuritiesTradeDetails55}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails6
 * SecuritiesTradeDetails6}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SecuritiesTradeDetails38", propOrder = {"placeOfTrade", "placeOfClearing", "tradeDate", "settlementDate", "effectiveSettlementDate", "dealPrice", "reporting", "numberOfDaysAccrued", "tradeTransactionCondition",
		"investorCapacity", "tradeOriginatorRole", "settlementInstructionProcessingAdditionalDetails", "fXAdditionalDetails"})
public class SecuritiesTradeDetails38 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PlcOfTrad")
	protected MarketIdentification78 placeOfTrade;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.MarketIdentification78
	 * MarketIdentification78}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmTradingMarket
	 * Security.mmTradingMarket}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails38
	 * SecuritiesTradeDetails38}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails55#mmPlaceOfTrade
	 * SecuritiesTradeDetails55.mmPlaceOfTrade}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails6#mmPlaceOfTrade
	 * SecuritiesTradeDetails6.mmPlaceOfTrade}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesTradeDetails38, Optional<MarketIdentification78>> mmPlaceOfTrade = new MMMessageAssociationEnd<SecuritiesTradeDetails38, Optional<MarketIdentification78>>() {
		{
			businessElementTrace_lazy = () -> Security.mmTradingMarket;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesTradeDetails38.mmObject();
			isDerived = false;
			xmlTag = "PlcOfTrad";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfTrade";
			definition = "Market in which a trade transaction has been executed.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTradeDetails55.mmPlaceOfTrade);
			previousVersion_lazy = () -> SecuritiesTradeDetails6.mmPlaceOfTrade;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> MarketIdentification78.mmObject();
		}

		@Override
		public Optional<MarketIdentification78> getValue(SecuritiesTradeDetails38 obj) {
			return obj.getPlaceOfTrade();
		}

		@Override
		public void setValue(SecuritiesTradeDetails38 obj, Optional<MarketIdentification78> value) {
			obj.setPlaceOfTrade(value.orElse(null));
		}
	};
	@XmlElement(name = "PlcOfClr")
	protected AnyBICIdentifier placeOfClearing;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.AnyBICIdentifier
	 * AnyBICIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification#mmAnyBIC
	 * OrganisationIdentification.mmAnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails38
	 * SecuritiesTradeDetails38}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails55#mmPlaceOfClearing
	 * SecuritiesTradeDetails55.mmPlaceOfClearing}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails6#mmPlaceOfClearing
	 * SecuritiesTradeDetails6.mmPlaceOfClearing}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesTradeDetails38, Optional<AnyBICIdentifier>> mmPlaceOfClearing = new MMMessageAttribute<SecuritiesTradeDetails38, Optional<AnyBICIdentifier>>() {
		{
			businessElementTrace_lazy = () -> OrganisationIdentification.mmAnyBIC;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesTradeDetails38.mmObject();
			isDerived = false;
			xmlTag = "PlcOfClr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfClearing";
			definition = "Infrastructure which may be a component of a clearing house and wich facilitates clearing and settlement for its members by standing between the buyer and the seller. It may net transactions and it substitutes itself as settlement counterparty for each position.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTradeDetails55.mmPlaceOfClearing);
			previousVersion_lazy = () -> SecuritiesTradeDetails6.mmPlaceOfClearing;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> AnyBICIdentifier.mmObject();
		}

		@Override
		public Optional<AnyBICIdentifier> getValue(SecuritiesTradeDetails38 obj) {
			return obj.getPlaceOfClearing();
		}

		@Override
		public void setValue(SecuritiesTradeDetails38 obj, Optional<AnyBICIdentifier> value) {
			obj.setPlaceOfClearing(value.orElse(null));
		}
	};
	@XmlElement(name = "TradDt")
	protected TradeDate1Choice tradeDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.TradeDate1Choice
	 * TradeDate1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Trade#mmTradeDateTime
	 * Trade.mmTradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails38
	 * SecuritiesTradeDetails38}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails55#mmTradeDate
	 * SecuritiesTradeDetails55.mmTradeDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails6#mmTradeDate
	 * SecuritiesTradeDetails6.mmTradeDate}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesTradeDetails38, Optional<TradeDate1Choice>> mmTradeDate = new MMMessageAssociationEnd<SecuritiesTradeDetails38, Optional<TradeDate1Choice>>() {
		{
			businessElementTrace_lazy = () -> Trade.mmTradeDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesTradeDetails38.mmObject();
			isDerived = false;
			xmlTag = "TradDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDate";
			definition = "Specifies the date/time on which the trade was executed.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTradeDetails55.mmTradeDate);
			previousVersion_lazy = () -> SecuritiesTradeDetails6.mmTradeDate;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TradeDate1Choice.mmObject();
		}

		@Override
		public Optional<TradeDate1Choice> getValue(SecuritiesTradeDetails38 obj) {
			return obj.getTradeDate();
		}

		@Override
		public void setValue(SecuritiesTradeDetails38 obj, Optional<TradeDate1Choice> value) {
			obj.setTradeDate(value.orElse(null));
		}
	};
	@XmlElement(name = "SttlmDt")
	protected SettlementDate1Choice settlementDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.SettlementDate1Choice
	 * SettlementDate1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Obligation#mmRequestedSettlementDate
	 * Obligation.mmRequestedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails38
	 * SecuritiesTradeDetails38}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails55#mmSettlementDate
	 * SecuritiesTradeDetails55.mmSettlementDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails6#mmSettlementDate
	 * SecuritiesTradeDetails6.mmSettlementDate}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesTradeDetails38, Optional<SettlementDate1Choice>> mmSettlementDate = new MMMessageAssociationEnd<SecuritiesTradeDetails38, Optional<SettlementDate1Choice>>() {
		{
			businessElementTrace_lazy = () -> Obligation.mmRequestedSettlementDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesTradeDetails38.mmObject();
			isDerived = false;
			xmlTag = "SttlmDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDate";
			definition = "Date and time at which the securities are to be delivered or received.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTradeDetails55.mmSettlementDate);
			previousVersion_lazy = () -> SecuritiesTradeDetails6.mmSettlementDate;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SettlementDate1Choice.mmObject();
		}

		@Override
		public Optional<SettlementDate1Choice> getValue(SecuritiesTradeDetails38 obj) {
			return obj.getSettlementDate();
		}

		@Override
		public void setValue(SecuritiesTradeDetails38 obj, Optional<SettlementDate1Choice> value) {
			obj.setSettlementDate(value.orElse(null));
		}
	};
	@XmlElement(name = "FctvSttlmDt", required = true)
	protected SettlementDate3Choice effectiveSettlementDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.SettlementDate3Choice
	 * SettlementDate3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSettlementDate
	 * SecuritiesSettlement.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails38
	 * SecuritiesTradeDetails38}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails55#mmEffectiveSettlementDate
	 * SecuritiesTradeDetails55.mmEffectiveSettlementDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails6#mmEffectiveSettlementDate
	 * SecuritiesTradeDetails6.mmEffectiveSettlementDate}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesTradeDetails38, SettlementDate3Choice> mmEffectiveSettlementDate = new MMMessageAssociationEnd<SecuritiesTradeDetails38, SettlementDate3Choice>() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmSettlementDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesTradeDetails38.mmObject();
			isDerived = false;
			xmlTag = "FctvSttlmDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EffectiveSettlementDate";
			definition = "Date and time at which a transaction is completed and cleared, ie, payment is effected and securities are delivered.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTradeDetails55.mmEffectiveSettlementDate);
			previousVersion_lazy = () -> SecuritiesTradeDetails6.mmEffectiveSettlementDate;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SettlementDate3Choice.mmObject();
		}

		@Override
		public SettlementDate3Choice getValue(SecuritiesTradeDetails38 obj) {
			return obj.getEffectiveSettlementDate();
		}

		@Override
		public void setValue(SecuritiesTradeDetails38 obj, SettlementDate3Choice value) {
			obj.setEffectiveSettlementDate(value);
		}
	};
	@XmlElement(name = "DealPric")
	protected Price2 dealPrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Price2 Price2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#mmDealPrice
	 * SecuritiesTradeExecution.mmDealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails38
	 * SecuritiesTradeDetails38}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails55#mmDealPrice
	 * SecuritiesTradeDetails55.mmDealPrice}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails6#mmDealPrice
	 * SecuritiesTradeDetails6.mmDealPrice}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesTradeDetails38, Optional<Price2>> mmDealPrice = new MMMessageAssociationEnd<SecuritiesTradeDetails38, Optional<Price2>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeExecution.mmDealPrice;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesTradeDetails38.mmObject();
			isDerived = false;
			xmlTag = "DealPric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DealPrice";
			definition = "Specifies the price of the traded financial instrument.\nThis is the deal price of the individual trade transaction. \nIf there is only one trade transaction for the execution of the trade, then the deal price could equal the executed trade price (unless, for example, the price includes commissions or rounding, or some other factor has been applied to the deal price or the executed trade price, or both).";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTradeDetails55.mmDealPrice);
			previousVersion_lazy = () -> SecuritiesTradeDetails6.mmDealPrice;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Price2.mmObject();
		}

		@Override
		public Optional<Price2> getValue(SecuritiesTradeDetails38 obj) {
			return obj.getDealPrice();
		}

		@Override
		public void setValue(SecuritiesTradeDetails38 obj, Optional<Price2> value) {
			obj.setDealPrice(value.orElse(null));
		}
	};
	@XmlElement(name = "Rptg")
	protected List<Reporting2Choice> reporting;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.Reporting2Choice
	 * Reporting2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails38
	 * SecuritiesTradeDetails38}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails55#mmReporting
	 * SecuritiesTradeDetails55.mmReporting}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails6#mmReporting
	 * SecuritiesTradeDetails6.mmReporting}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesTradeDetails38, List<Reporting2Choice>> mmReporting = new MMMessageAttribute<SecuritiesTradeDetails38, List<Reporting2Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesTradeDetails38.mmObject();
			isDerived = false;
			xmlTag = "Rptg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reporting";
			definition = "Specifies that a trade is to be reported to a third party.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTradeDetails55.mmReporting);
			previousVersion_lazy = () -> SecuritiesTradeDetails6.mmReporting;
			minOccurs = 0;
			complexType_lazy = () -> Reporting2Choice.mmObject();
		}

		@Override
		public List<Reporting2Choice> getValue(SecuritiesTradeDetails38 obj) {
			return obj.getReporting();
		}

		@Override
		public void setValue(SecuritiesTradeDetails38 obj, List<Reporting2Choice> value) {
			obj.setReporting(value);
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails38
	 * SecuritiesTradeDetails38}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails55#mmNumberOfDaysAccrued
	 * SecuritiesTradeDetails55.mmNumberOfDaysAccrued}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails6#mmNumberOfDaysAccrued
	 * SecuritiesTradeDetails6.mmNumberOfDaysAccrued}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesTradeDetails38, Optional<Max3Number>> mmNumberOfDaysAccrued = new MMMessageAttribute<SecuritiesTradeDetails38, Optional<Max3Number>>() {
		{
			businessElementTrace_lazy = () -> DateTimePeriod.mmNumberOfDays;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesTradeDetails38.mmObject();
			isDerived = false;
			xmlTag = "NbOfDaysAcrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NumberOfDaysAccrued";
			definition = "Number of days on which the interest rate accrues (daily accrual note).";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTradeDetails55.mmNumberOfDaysAccrued);
			previousVersion_lazy = () -> SecuritiesTradeDetails6.mmNumberOfDaysAccrued;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max3Number.mmObject();
		}

		@Override
		public Optional<Max3Number> getValue(SecuritiesTradeDetails38 obj) {
			return obj.getNumberOfDaysAccrued();
		}

		@Override
		public void setValue(SecuritiesTradeDetails38 obj, Optional<Max3Number> value) {
			obj.setNumberOfDaysAccrued(value.orElse(null));
		}
	};
	@XmlElement(name = "TradTxCond")
	protected List<TradeTransactionCondition1Choice> tradeTransactionCondition;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.TradeTransactionCondition1Choice
	 * TradeTransactionCondition1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmTradeTransactionCondition
	 * SecuritiesTrade.mmTradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails38
	 * SecuritiesTradeDetails38}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails55#mmTradeTransactionCondition
	 * SecuritiesTradeDetails55.mmTradeTransactionCondition}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails6#mmTradeTransactionCondition
	 * SecuritiesTradeDetails6.mmTradeTransactionCondition}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesTradeDetails38, List<TradeTransactionCondition1Choice>> mmTradeTransactionCondition = new MMMessageAttribute<SecuritiesTradeDetails38, List<TradeTransactionCondition1Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTrade.mmTradeTransactionCondition;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesTradeDetails38.mmObject();
			isDerived = false;
			xmlTag = "TradTxCond";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeTransactionCondition";
			definition = "Indicates the conditions under which the order/trade is to be/was executed.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTradeDetails55.mmTradeTransactionCondition);
			previousVersion_lazy = () -> SecuritiesTradeDetails6.mmTradeTransactionCondition;
			minOccurs = 0;
			complexType_lazy = () -> TradeTransactionCondition1Choice.mmObject();
		}

		@Override
		public List<TradeTransactionCondition1Choice> getValue(SecuritiesTradeDetails38 obj) {
			return obj.getTradeTransactionCondition();
		}

		@Override
		public void setValue(SecuritiesTradeDetails38 obj, List<TradeTransactionCondition1Choice> value) {
			obj.setTradeTransactionCondition(value);
		}
	};
	@XmlElement(name = "InvstrCpcty")
	protected InvestorCapacity1Choice investorCapacity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.InvestorCapacity1Choice
	 * InvestorCapacity1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestorRole#mmCapacity
	 * InvestorRole.mmCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails38
	 * SecuritiesTradeDetails38}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails55#mmInvestorCapacity
	 * SecuritiesTradeDetails55.mmInvestorCapacity}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails6#mmInvestorCapacity
	 * SecuritiesTradeDetails6.mmInvestorCapacity}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesTradeDetails38, Optional<InvestorCapacity1Choice>> mmInvestorCapacity = new MMMessageAttribute<SecuritiesTradeDetails38, Optional<InvestorCapacity1Choice>>() {
		{
			businessElementTrace_lazy = () -> InvestorRole.mmCapacity;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesTradeDetails38.mmObject();
			isDerived = false;
			xmlTag = "InvstrCpcty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestorCapacity";
			definition = "Specifies the role of the investor in the transaction.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTradeDetails55.mmInvestorCapacity);
			previousVersion_lazy = () -> SecuritiesTradeDetails6.mmInvestorCapacity;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> InvestorCapacity1Choice.mmObject();
		}

		@Override
		public Optional<InvestorCapacity1Choice> getValue(SecuritiesTradeDetails38 obj) {
			return obj.getInvestorCapacity();
		}

		@Override
		public void setValue(SecuritiesTradeDetails38 obj, Optional<InvestorCapacity1Choice> value) {
			obj.setInvestorCapacity(value.orElse(null));
		}
	};
	@XmlElement(name = "TradOrgtrRole")
	protected TradeOriginator1Choice tradeOriginatorRole;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.TradeOriginator1Choice
	 * TradeOriginator1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.TradeOriginatorRole
	 * TradeOriginatorRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails38
	 * SecuritiesTradeDetails38}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails55#mmTradeOriginatorRole
	 * SecuritiesTradeDetails55.mmTradeOriginatorRole}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails6#mmTradeOriginatorRole
	 * SecuritiesTradeDetails6.mmTradeOriginatorRole}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesTradeDetails38, Optional<TradeOriginator1Choice>> mmTradeOriginatorRole = new MMMessageAttribute<SecuritiesTradeDetails38, Optional<TradeOriginator1Choice>>() {
		{
			businessComponentTrace_lazy = () -> TradeOriginatorRole.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesTradeDetails38.mmObject();
			isDerived = false;
			xmlTag = "TradOrgtrRole";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeOriginatorRole";
			definition = "Specifies the role of the trading party in the transaction.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTradeDetails55.mmTradeOriginatorRole);
			previousVersion_lazy = () -> SecuritiesTradeDetails6.mmTradeOriginatorRole;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> TradeOriginator1Choice.mmObject();
		}

		@Override
		public Optional<TradeOriginator1Choice> getValue(SecuritiesTradeDetails38 obj) {
			return obj.getTradeOriginatorRole();
		}

		@Override
		public void setValue(SecuritiesTradeDetails38 obj, Optional<TradeOriginator1Choice> value) {
			obj.setTradeOriginatorRole(value.orElse(null));
		}
	};
	@XmlElement(name = "SttlmInstrPrcgAddtlDtls")
	protected Max350Text settlementInstructionProcessingAdditionalDetails;
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails38
	 * SecuritiesTradeDetails38}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails55#mmSettlementInstructionProcessingAdditionalDetails
	 * SecuritiesTradeDetails55.
	 * mmSettlementInstructionProcessingAdditionalDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails6#mmSettlementInstructionProcessingAdditionalDetails
	 * SecuritiesTradeDetails6.
	 * mmSettlementInstructionProcessingAdditionalDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesTradeDetails38, Optional<Max350Text>> mmSettlementInstructionProcessingAdditionalDetails = new MMMessageAttribute<SecuritiesTradeDetails38, Optional<Max350Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesTradeDetails38.mmObject();
			isDerived = false;
			xmlTag = "SttlmInstrPrcgAddtlDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementInstructionProcessingAdditionalDetails";
			definition = "Provides additional settlement processing information which can not be included within the structured fields of the message.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTradeDetails55.mmSettlementInstructionProcessingAdditionalDetails);
			previousVersion_lazy = () -> SecuritiesTradeDetails6.mmSettlementInstructionProcessingAdditionalDetails;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Optional<Max350Text> getValue(SecuritiesTradeDetails38 obj) {
			return obj.getSettlementInstructionProcessingAdditionalDetails();
		}

		@Override
		public void setValue(SecuritiesTradeDetails38 obj, Optional<Max350Text> value) {
			obj.setSettlementInstructionProcessingAdditionalDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "FxAddtlDtls")
	protected Max350Text fXAdditionalDetails;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmExchangeRateInformation
	 * PaymentObligation.mmExchangeRateInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails38
	 * SecuritiesTradeDetails38}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails55#mmFXAdditionalDetails
	 * SecuritiesTradeDetails55.mmFXAdditionalDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails6#mmFXAdditionalDetails
	 * SecuritiesTradeDetails6.mmFXAdditionalDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesTradeDetails38, Optional<Max350Text>> mmFXAdditionalDetails = new MMMessageAttribute<SecuritiesTradeDetails38, Optional<Max350Text>>() {
		{
			businessElementTrace_lazy = () -> PaymentObligation.mmExchangeRateInformation;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesTradeDetails38.mmObject();
			isDerived = false;
			xmlTag = "FxAddtlDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FXAdditionalDetails";
			definition = "Provides additional details pertaining to foreign exchange instructions.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTradeDetails55.mmFXAdditionalDetails);
			previousVersion_lazy = () -> SecuritiesTradeDetails6.mmFXAdditionalDetails;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Optional<Max350Text> getValue(SecuritiesTradeDetails38 obj) {
			return obj.getFXAdditionalDetails();
		}

		@Override
		public void setValue(SecuritiesTradeDetails38 obj, Optional<Max350Text> value) {
			obj.setFXAdditionalDetails(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesTradeDetails38.mmPlaceOfTrade, com.tools20022.repository.msg.SecuritiesTradeDetails38.mmPlaceOfClearing,
						com.tools20022.repository.msg.SecuritiesTradeDetails38.mmTradeDate, com.tools20022.repository.msg.SecuritiesTradeDetails38.mmSettlementDate,
						com.tools20022.repository.msg.SecuritiesTradeDetails38.mmEffectiveSettlementDate, com.tools20022.repository.msg.SecuritiesTradeDetails38.mmDealPrice,
						com.tools20022.repository.msg.SecuritiesTradeDetails38.mmReporting, com.tools20022.repository.msg.SecuritiesTradeDetails38.mmNumberOfDaysAccrued,
						com.tools20022.repository.msg.SecuritiesTradeDetails38.mmTradeTransactionCondition, com.tools20022.repository.msg.SecuritiesTradeDetails38.mmInvestorCapacity,
						com.tools20022.repository.msg.SecuritiesTradeDetails38.mmTradeOriginatorRole, com.tools20022.repository.msg.SecuritiesTradeDetails38.mmSettlementInstructionProcessingAdditionalDetails,
						com.tools20022.repository.msg.SecuritiesTradeDetails38.mmFXAdditionalDetails);
				messageBuildingBlock_lazy = () -> Arrays.asList(SecuritiesFinancingConfirmationV05.mmTradeDetails);
				trace_lazy = () -> SecuritiesFinancing.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintInvestorCapacityRule.forSecuritiesTradeDetails38,
						com.tools20022.repository.constraints.ConstraintPlaceOfTradeRule.forSecuritiesTradeDetails38, com.tools20022.repository.constraints.ConstraintTradeDateTimeUTCRule.forSecuritiesTradeDetails38,
						com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule.forSecuritiesTradeDetails38, com.tools20022.repository.constraints.ConstraintCurrencyToBuyOrSellRule.forSecuritiesTradeDetails38);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesTradeDetails38";
				definition = "Details of the securities trade.";
				nextVersions_lazy = () -> Arrays.asList(SecuritiesTradeDetails55.mmObject());
				previousVersion_lazy = () -> SecuritiesTradeDetails6.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<MarketIdentification78> getPlaceOfTrade() {
		return placeOfTrade == null ? Optional.empty() : Optional.of(placeOfTrade);
	}

	public SecuritiesTradeDetails38 setPlaceOfTrade(MarketIdentification78 placeOfTrade) {
		this.placeOfTrade = placeOfTrade;
		return this;
	}

	public Optional<AnyBICIdentifier> getPlaceOfClearing() {
		return placeOfClearing == null ? Optional.empty() : Optional.of(placeOfClearing);
	}

	public SecuritiesTradeDetails38 setPlaceOfClearing(AnyBICIdentifier placeOfClearing) {
		this.placeOfClearing = placeOfClearing;
		return this;
	}

	public Optional<TradeDate1Choice> getTradeDate() {
		return tradeDate == null ? Optional.empty() : Optional.of(tradeDate);
	}

	public SecuritiesTradeDetails38 setTradeDate(TradeDate1Choice tradeDate) {
		this.tradeDate = tradeDate;
		return this;
	}

	public Optional<SettlementDate1Choice> getSettlementDate() {
		return settlementDate == null ? Optional.empty() : Optional.of(settlementDate);
	}

	public SecuritiesTradeDetails38 setSettlementDate(SettlementDate1Choice settlementDate) {
		this.settlementDate = settlementDate;
		return this;
	}

	public SettlementDate3Choice getEffectiveSettlementDate() {
		return effectiveSettlementDate;
	}

	public SecuritiesTradeDetails38 setEffectiveSettlementDate(SettlementDate3Choice effectiveSettlementDate) {
		this.effectiveSettlementDate = Objects.requireNonNull(effectiveSettlementDate);
		return this;
	}

	public Optional<Price2> getDealPrice() {
		return dealPrice == null ? Optional.empty() : Optional.of(dealPrice);
	}

	public SecuritiesTradeDetails38 setDealPrice(Price2 dealPrice) {
		this.dealPrice = dealPrice;
		return this;
	}

	public List<Reporting2Choice> getReporting() {
		return reporting == null ? reporting = new ArrayList<>() : reporting;
	}

	public SecuritiesTradeDetails38 setReporting(List<Reporting2Choice> reporting) {
		this.reporting = Objects.requireNonNull(reporting);
		return this;
	}

	public Optional<Max3Number> getNumberOfDaysAccrued() {
		return numberOfDaysAccrued == null ? Optional.empty() : Optional.of(numberOfDaysAccrued);
	}

	public SecuritiesTradeDetails38 setNumberOfDaysAccrued(Max3Number numberOfDaysAccrued) {
		this.numberOfDaysAccrued = numberOfDaysAccrued;
		return this;
	}

	public List<TradeTransactionCondition1Choice> getTradeTransactionCondition() {
		return tradeTransactionCondition == null ? tradeTransactionCondition = new ArrayList<>() : tradeTransactionCondition;
	}

	public SecuritiesTradeDetails38 setTradeTransactionCondition(List<TradeTransactionCondition1Choice> tradeTransactionCondition) {
		this.tradeTransactionCondition = Objects.requireNonNull(tradeTransactionCondition);
		return this;
	}

	public Optional<InvestorCapacity1Choice> getInvestorCapacity() {
		return investorCapacity == null ? Optional.empty() : Optional.of(investorCapacity);
	}

	public SecuritiesTradeDetails38 setInvestorCapacity(InvestorCapacity1Choice investorCapacity) {
		this.investorCapacity = investorCapacity;
		return this;
	}

	public Optional<TradeOriginator1Choice> getTradeOriginatorRole() {
		return tradeOriginatorRole == null ? Optional.empty() : Optional.of(tradeOriginatorRole);
	}

	public SecuritiesTradeDetails38 setTradeOriginatorRole(TradeOriginator1Choice tradeOriginatorRole) {
		this.tradeOriginatorRole = tradeOriginatorRole;
		return this;
	}

	public Optional<Max350Text> getSettlementInstructionProcessingAdditionalDetails() {
		return settlementInstructionProcessingAdditionalDetails == null ? Optional.empty() : Optional.of(settlementInstructionProcessingAdditionalDetails);
	}

	public SecuritiesTradeDetails38 setSettlementInstructionProcessingAdditionalDetails(Max350Text settlementInstructionProcessingAdditionalDetails) {
		this.settlementInstructionProcessingAdditionalDetails = settlementInstructionProcessingAdditionalDetails;
		return this;
	}

	public Optional<Max350Text> getFXAdditionalDetails() {
		return fXAdditionalDetails == null ? Optional.empty() : Optional.of(fXAdditionalDetails);
	}

	public SecuritiesTradeDetails38 setFXAdditionalDetails(Max350Text fXAdditionalDetails) {
		this.fXAdditionalDetails = fXAdditionalDetails;
		return this;
	}
}