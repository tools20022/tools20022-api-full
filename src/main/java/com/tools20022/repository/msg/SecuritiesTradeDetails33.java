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
import com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV05;
import com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV05;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.datatype.AnyBICIdentifier;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Max3Number;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import java.util.List;
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
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails33#mmTradeIdentification
 * SecuritiesTradeDetails33.mmTradeIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails33#mmCollateralTransactionIdentification
 * SecuritiesTradeDetails33.mmCollateralTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails33#mmPlaceOfTrade
 * SecuritiesTradeDetails33.mmPlaceOfTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails33#mmPlaceOfClearing
 * SecuritiesTradeDetails33.mmPlaceOfClearing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails33#mmTradeDate
 * SecuritiesTradeDetails33.mmTradeDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails33#mmSettlementDate
 * SecuritiesTradeDetails33.mmSettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails33#mmLateDeliveryDate
 * SecuritiesTradeDetails33.mmLateDeliveryDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails33#mmDealPrice
 * SecuritiesTradeDetails33.mmDealPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails33#mmNumberOfDaysAccrued
 * SecuritiesTradeDetails33.mmNumberOfDaysAccrued}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails33#mmOpeningClosing
 * SecuritiesTradeDetails33.mmOpeningClosing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails33#mmReporting
 * SecuritiesTradeDetails33.mmReporting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails33#mmTradeTransactionCondition
 * SecuritiesTradeDetails33.mmTradeTransactionCondition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails33#mmInvestorCapacity
 * SecuritiesTradeDetails33.mmInvestorCapacity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails33#mmTradeOriginatorRole
 * SecuritiesTradeDetails33.mmTradeOriginatorRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails33#mmTypeOfPrice
 * SecuritiesTradeDetails33.mmTypeOfPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails33#mmCurrencyToBuyOrSell
 * SecuritiesTradeDetails33.mmCurrencyToBuyOrSell}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails33#mmMatchingStatus
 * SecuritiesTradeDetails33.mmMatchingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails33#mmAffirmationStatus
 * SecuritiesTradeDetails33.mmAffirmationStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails33#mmFXAdditionalDetails
 * SecuritiesTradeDetails33.mmFXAdditionalDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails33#mmSettlementInstructionProcessingAdditionalDetails
 * SecuritiesTradeDetails33.mmSettlementInstructionProcessingAdditionalDetails}</li>
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
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV05#mmTradeDetails
 * SecuritiesSettlementTransactionGenerationNotificationV05.mmTradeDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV05#mmTradeDetails
 * SecuritiesSettlementTransactionInstructionV05.mmTradeDetails}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = May 5, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesTradeDetails33"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Details of the securities trade."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails51
 * SecuritiesTradeDetails51}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails1
 * SecuritiesTradeDetails1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "SecuritiesTradeDetails33", propOrder = {"tradeIdentification", "collateralTransactionIdentification", "placeOfTrade", "placeOfClearing", "tradeDate", "settlementDate", "lateDeliveryDate", "dealPrice",
		"numberOfDaysAccrued", "openingClosing", "reporting", "tradeTransactionCondition", "investorCapacity", "tradeOriginatorRole", "typeOfPrice", "currencyToBuyOrSell", "matchingStatus", "affirmationStatus", "FXAdditionalDetails",
		"settlementInstructionProcessingAdditionalDetails"})
public class SecuritiesTradeDetails33 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected List<Max35Text> tradeIdentification;
	/**
	 * Reference assigned to the trade by the investor or the trading party.
	 * This reference will be used throughout the trade life cycle to
	 * access/update the trade details.
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails33
	 * SecuritiesTradeDetails33}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails51#mmTradeIdentification
	 * SecuritiesTradeDetails51.mmTradeIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails1#mmTradeIdentification
	 * SecuritiesTradeDetails1.mmTradeIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTradeIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> TradeIdentification.mmIdentification;
			componentContext_lazy = () -> SecuritiesTradeDetails33.mmObject();
			isDerived = false;
			xmlTag = "TradId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeIdentification";
			definition = "Reference assigned to the trade by the investor or the trading party. This reference will be used throughout the trade life cycle to access/update the trade details.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTradeDetails51.mmTradeIdentification);
			previousVersion_lazy = () -> SecuritiesTradeDetails1.mmTradeIdentification;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected List<Max35Text> collateralTransactionIdentification;
	/**
	 * Unambiguous identification of a collateral transaction as assigned by the
	 * instructing party.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification#mmCollateralTransactionIdentification
	 * SecuritiesTradeIdentification.mmCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails33
	 * SecuritiesTradeDetails33}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails51#mmCollateralTransactionIdentification
	 * SecuritiesTradeDetails51.mmCollateralTransactionIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails1#mmCollateralTransactionIdentification
	 * SecuritiesTradeDetails1.mmCollateralTransactionIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCollateralTransactionIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeIdentification.mmCollateralTransactionIdentification;
			componentContext_lazy = () -> SecuritiesTradeDetails33.mmObject();
			isDerived = false;
			xmlTag = "CollTxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralTransactionIdentification";
			definition = "Unambiguous identification of a collateral transaction as assigned by the instructing party.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTradeDetails51.mmCollateralTransactionIdentification);
			previousVersion_lazy = () -> SecuritiesTradeDetails1.mmCollateralTransactionIdentification;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected MarketIdentification78 placeOfTrade;
	/**
	 * Market in which a trade transaction has been executed.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails33
	 * SecuritiesTradeDetails33}</li>
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails51#mmPlaceOfTrade
	 * SecuritiesTradeDetails51.mmPlaceOfTrade}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails1#mmPlaceOfTrade
	 * SecuritiesTradeDetails1.mmPlaceOfTrade}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPlaceOfTrade = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Security.mmTradingMarket;
			componentContext_lazy = () -> SecuritiesTradeDetails33.mmObject();
			isDerived = false;
			xmlTag = "PlcOfTrad";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfTrade";
			definition = "Market in which a trade transaction has been executed.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTradeDetails51.mmPlaceOfTrade);
			previousVersion_lazy = () -> SecuritiesTradeDetails1.mmPlaceOfTrade;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.MarketIdentification78.mmObject();
		}
	};
	protected AnyBICIdentifier placeOfClearing;
	/**
	 * Infrastructure which may be a component of a clearing house and wich
	 * facilitates clearing and settlement for its members by standing between
	 * the buyer and the seller. It may net transactions and it substitutes
	 * itself as settlement counterparty for each position.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails33
	 * SecuritiesTradeDetails33}</li>
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails51#mmPlaceOfClearing
	 * SecuritiesTradeDetails51.mmPlaceOfClearing}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails1#mmPlaceOfClearing
	 * SecuritiesTradeDetails1.mmPlaceOfClearing}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPlaceOfClearing = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> OrganisationIdentification.mmAnyBIC;
			componentContext_lazy = () -> SecuritiesTradeDetails33.mmObject();
			isDerived = false;
			xmlTag = "PlcOfClr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfClearing";
			definition = "Infrastructure which may be a component of a clearing house and wich facilitates clearing and settlement for its members by standing between the buyer and the seller. It may net transactions and it substitutes itself as settlement counterparty for each position.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTradeDetails51.mmPlaceOfClearing);
			previousVersion_lazy = () -> SecuritiesTradeDetails1.mmPlaceOfClearing;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> AnyBICIdentifier.mmObject();
		}
	};
	protected TradeDate1Choice tradeDate;
	/**
	 * Specifies the date/time on which the trade was executed.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails33
	 * SecuritiesTradeDetails33}</li>
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails51#mmTradeDate
	 * SecuritiesTradeDetails51.mmTradeDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails1#mmTradeDate
	 * SecuritiesTradeDetails1.mmTradeDate}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTradeDate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Trade.mmTradeDateTime;
			componentContext_lazy = () -> SecuritiesTradeDetails33.mmObject();
			isDerived = false;
			xmlTag = "TradDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDate";
			definition = "Specifies the date/time on which the trade was executed.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTradeDetails51.mmTradeDate);
			previousVersion_lazy = () -> SecuritiesTradeDetails1.mmTradeDate;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TradeDate1Choice.mmObject();
		}
	};
	protected SettlementDate1Choice settlementDate;
	/**
	 * Date and time at which the securities are to be delivered or received.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails33
	 * SecuritiesTradeDetails33}</li>
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails51#mmSettlementDate
	 * SecuritiesTradeDetails51.mmSettlementDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails1#mmSettlementDate
	 * SecuritiesTradeDetails1.mmSettlementDate}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSettlementDate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Obligation.mmRequestedSettlementDate;
			componentContext_lazy = () -> SecuritiesTradeDetails33.mmObject();
			isDerived = false;
			xmlTag = "SttlmDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDate";
			definition = "Date and time at which the securities are to be delivered or received.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTradeDetails51.mmSettlementDate);
			previousVersion_lazy = () -> SecuritiesTradeDetails1.mmSettlementDate;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SettlementDate1Choice.mmObject();
		}
	};
	protected DateAndDateTimeChoice lateDeliveryDate;
	/**
	 * Date and time after the settlement date specified in the trade, used for
	 * pool trades resulting from the original To Be Assigned (TBA) securities.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails33
	 * SecuritiesTradeDetails33}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails51#mmLateDeliveryDate
	 * SecuritiesTradeDetails51.mmLateDeliveryDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails1#mmLateDeliveryDate
	 * SecuritiesTradeDetails1.mmLateDeliveryDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLateDeliveryDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesTransfer.mmLateDeliveryDate;
			componentContext_lazy = () -> SecuritiesTradeDetails33.mmObject();
			isDerived = false;
			xmlTag = "LateDlvryDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDate";
			definition = "Date and time after the settlement date specified in the trade, used for pool trades resulting from the original To Be Assigned (TBA) securities.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTradeDetails51.mmLateDeliveryDate);
			previousVersion_lazy = () -> SecuritiesTradeDetails1.mmLateDeliveryDate;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateAndDateTimeChoice.mmObject();
		}
	};
	protected Price2 dealPrice;
	/**
	 * Specifies the price of the traded financial instrument. This is the deal
	 * price of the individual trade transaction. If there is only one trade
	 * transaction for the execution of the trade, then the deal price could
	 * equal the executed trade price (unless, for example, the price includes
	 * commissions or rounding, or some other factor has been applied to the
	 * deal price or the executed trade price, or both).
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails33
	 * SecuritiesTradeDetails33}</li>
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails51#mmDealPrice
	 * SecuritiesTradeDetails51.mmDealPrice}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails1#mmDealPrice
	 * SecuritiesTradeDetails1.mmDealPrice}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDealPrice = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeExecution.mmDealPrice;
			componentContext_lazy = () -> SecuritiesTradeDetails33.mmObject();
			isDerived = false;
			xmlTag = "DealPric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DealPrice";
			definition = "Specifies the price of the traded financial instrument.\nThis is the deal price of the individual trade transaction. \nIf there is only one trade transaction for the execution of the trade, then the deal price could equal the executed trade price (unless, for example, the price includes commissions or rounding, or some other factor has been applied to the deal price or the executed trade price, or both).";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTradeDetails51.mmDealPrice);
			previousVersion_lazy = () -> SecuritiesTradeDetails1.mmDealPrice;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Price2.mmObject();
		}
	};
	protected Max3Number numberOfDaysAccrued;
	/**
	 * Number of days on which the interest rate accrues (daily accrual note).
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails33
	 * SecuritiesTradeDetails33}</li>
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails51#mmNumberOfDaysAccrued
	 * SecuritiesTradeDetails51.mmNumberOfDaysAccrued}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails1#mmNumberOfDaysAccrued
	 * SecuritiesTradeDetails1.mmNumberOfDaysAccrued}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNumberOfDaysAccrued = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> DateTimePeriod.mmNumberOfDays;
			componentContext_lazy = () -> SecuritiesTradeDetails33.mmObject();
			isDerived = false;
			xmlTag = "NbOfDaysAcrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NumberOfDaysAccrued";
			definition = "Number of days on which the interest rate accrues (daily accrual note).";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTradeDetails51.mmNumberOfDaysAccrued);
			previousVersion_lazy = () -> SecuritiesTradeDetails1.mmNumberOfDaysAccrued;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max3Number.mmObject();
		}
	};
	protected OpeningClosing1Choice openingClosing;
	/**
	 * Specifies additional information relative to the processing of the trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.OpeningClosing1Choice
	 * OpeningClosing1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmOpeningClosingIndicator
	 * SecuritiesTrade.mmOpeningClosingIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails33
	 * SecuritiesTradeDetails33}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails51#mmOpeningClosing
	 * SecuritiesTradeDetails51.mmOpeningClosing}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails1#mmOpeningClosing
	 * SecuritiesTradeDetails1.mmOpeningClosing}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOpeningClosing = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesTrade.mmOpeningClosingIndicator;
			componentContext_lazy = () -> SecuritiesTradeDetails33.mmObject();
			isDerived = false;
			xmlTag = "OpngClsg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OpeningClosing";
			definition = "Specifies additional information relative to the processing of the trade.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTradeDetails51.mmOpeningClosing);
			previousVersion_lazy = () -> SecuritiesTradeDetails1.mmOpeningClosing;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> OpeningClosing1Choice.mmObject();
		}
	};
	protected List<Reporting2Choice> reporting;
	/**
	 * Specifies that a trade is to be reported to a third party.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails33
	 * SecuritiesTradeDetails33}</li>
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails51#mmReporting
	 * SecuritiesTradeDetails51.mmReporting}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails1#mmReporting
	 * SecuritiesTradeDetails1.mmReporting}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReporting = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SecuritiesTradeDetails33.mmObject();
			isDerived = false;
			xmlTag = "Rptg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reporting";
			definition = "Specifies that a trade is to be reported to a third party.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTradeDetails51.mmReporting);
			previousVersion_lazy = () -> SecuritiesTradeDetails1.mmReporting;
			minOccurs = 0;
			complexType_lazy = () -> Reporting2Choice.mmObject();
		}
	};
	protected List<TradeTransactionCondition1Choice> tradeTransactionCondition;
	/**
	 * Indicates the conditions under which the order/trade is to be/was
	 * executed.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails33
	 * SecuritiesTradeDetails33}</li>
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails51#mmTradeTransactionCondition
	 * SecuritiesTradeDetails51.mmTradeTransactionCondition}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails1#mmTradeTransactionCondition
	 * SecuritiesTradeDetails1.mmTradeTransactionCondition}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTradeTransactionCondition = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesTrade.mmTradeTransactionCondition;
			componentContext_lazy = () -> SecuritiesTradeDetails33.mmObject();
			isDerived = false;
			xmlTag = "TradTxCond";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeTransactionCondition";
			definition = "Indicates the conditions under which the order/trade is to be/was executed.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTradeDetails51.mmTradeTransactionCondition);
			previousVersion_lazy = () -> SecuritiesTradeDetails1.mmTradeTransactionCondition;
			minOccurs = 0;
			complexType_lazy = () -> TradeTransactionCondition1Choice.mmObject();
		}
	};
	protected InvestorCapacity1Choice investorCapacity;
	/**
	 * Specifies the role of the investor in the transaction.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails33
	 * SecuritiesTradeDetails33}</li>
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails51#mmInvestorCapacity
	 * SecuritiesTradeDetails51.mmInvestorCapacity}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails1#mmInvestorCapacity
	 * SecuritiesTradeDetails1.mmInvestorCapacity}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInvestorCapacity = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestorRole.mmCapacity;
			componentContext_lazy = () -> SecuritiesTradeDetails33.mmObject();
			isDerived = false;
			xmlTag = "InvstrCpcty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestorCapacity";
			definition = "Specifies the role of the investor in the transaction.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTradeDetails51.mmInvestorCapacity);
			previousVersion_lazy = () -> SecuritiesTradeDetails1.mmInvestorCapacity;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> InvestorCapacity1Choice.mmObject();
		}
	};
	protected TradeOriginator1Choice tradeOriginatorRole;
	/**
	 * Specifies the role of the trading party in the transaction.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails33
	 * SecuritiesTradeDetails33}</li>
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails51#mmTradeOriginatorRole
	 * SecuritiesTradeDetails51.mmTradeOriginatorRole}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails1#mmTradeOriginatorRole
	 * SecuritiesTradeDetails1.mmTradeOriginatorRole}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTradeOriginatorRole = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> TradeOriginatorRole.mmObject();
			componentContext_lazy = () -> SecuritiesTradeDetails33.mmObject();
			isDerived = false;
			xmlTag = "TradOrgtrRole";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeOriginatorRole";
			definition = "Specifies the role of the trading party in the transaction.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTradeDetails51.mmTradeOriginatorRole);
			previousVersion_lazy = () -> SecuritiesTradeDetails1.mmTradeOriginatorRole;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> TradeOriginator1Choice.mmObject();
		}
	};
	protected TypeOfPrice3Choice typeOfPrice;
	/**
	 * Specifies the type of price and information about the price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.TypeOfPrice3Choice
	 * TypeOfPrice3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmPriceType
	 * SecuritiesPricing.mmPriceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails33
	 * SecuritiesTradeDetails33}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails51#mmTypeOfPrice
	 * SecuritiesTradeDetails51.mmTypeOfPrice}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails1#mmTypeOfPrice
	 * SecuritiesTradeDetails1.mmTypeOfPrice}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTypeOfPrice = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesPricing.mmPriceType;
			componentContext_lazy = () -> SecuritiesTradeDetails33.mmObject();
			isDerived = false;
			xmlTag = "TpOfPric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TypeOfPrice";
			definition = "Specifies the type of price and information about the price.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTradeDetails51.mmTypeOfPrice);
			previousVersion_lazy = () -> SecuritiesTradeDetails1.mmTypeOfPrice;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> TypeOfPrice3Choice.mmObject();
		}
	};
	protected CurrencyToBuyOrSell1Choice currencyToBuyOrSell;
	/**
	 * Account servicer is instructed to buy the indicated currency after the
	 * receipt of cash proceeds or to sell the indicated currency in order to
	 * obtain the necessary currency to fund the transaction.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails33
	 * SecuritiesTradeDetails33}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails51#mmCurrencyToBuyOrSell
	 * SecuritiesTradeDetails51.mmCurrencyToBuyOrSell}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails1#mmCurrencyToBuyOrSell
	 * SecuritiesTradeDetails1.mmCurrencyToBuyOrSell}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCurrencyToBuyOrSell = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SecuritiesTradeDetails33.mmObject();
			isDerived = false;
			xmlTag = "CcyToBuyOrSell";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyToBuyOrSell";
			definition = "Account servicer is instructed to buy the indicated currency after the receipt of cash proceeds or to sell the indicated currency in order to obtain the necessary currency to fund the transaction.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTradeDetails51.mmCurrencyToBuyOrSell);
			previousVersion_lazy = () -> SecuritiesTradeDetails1.mmCurrencyToBuyOrSell;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CurrencyToBuyOrSell1Choice.mmObject();
		}
	};
	protected MatchingStatus1Choice matchingStatus;
	/**
	 * Provides the matching status of the instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus1Choice
	 * MatchingStatus1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#mmMatchingStatus
	 * SecuritiesTradeStatus.mmMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails33
	 * SecuritiesTradeDetails33}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails51#mmMatchingStatus
	 * SecuritiesTradeDetails51.mmMatchingStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails1#mmMatchingStatus
	 * SecuritiesTradeDetails1.mmMatchingStatus}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMatchingStatus = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeStatus.mmMatchingStatus;
			componentContext_lazy = () -> SecuritiesTradeDetails33.mmObject();
			isDerived = false;
			xmlTag = "MtchgSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MatchingStatus";
			definition = "Provides the matching status of the instruction.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTradeDetails51.mmMatchingStatus);
			previousVersion_lazy = () -> SecuritiesTradeDetails1.mmMatchingStatus;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> MatchingStatus1Choice.mmObject();
		}
	};
	protected AffirmationStatus1Choice affirmationStatus;
	/**
	 * Status of affirmation of a trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.AffirmationStatus1Choice
	 * AffirmationStatus1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#mmAffirmationStatus
	 * SecuritiesTradeStatus.mmAffirmationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails33
	 * SecuritiesTradeDetails33}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails51#mmAffirmationStatus
	 * SecuritiesTradeDetails51.mmAffirmationStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails1#mmAffirmationStatus
	 * SecuritiesTradeDetails1.mmAffirmationStatus}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAffirmationStatus = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeStatus.mmAffirmationStatus;
			componentContext_lazy = () -> SecuritiesTradeDetails33.mmObject();
			isDerived = false;
			xmlTag = "AffirmSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AffirmationStatus";
			definition = "Status of affirmation of a trade.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTradeDetails51.mmAffirmationStatus);
			previousVersion_lazy = () -> SecuritiesTradeDetails1.mmAffirmationStatus;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AffirmationStatus1Choice.mmObject();
		}
	};
	protected Max350Text fXAdditionalDetails;
	/**
	 * Provides additional details pertaining to foreign exchange instructions.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails33
	 * SecuritiesTradeDetails33}</li>
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails51#mmFXAdditionalDetails
	 * SecuritiesTradeDetails51.mmFXAdditionalDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails1#mmFXAdditionalDetails
	 * SecuritiesTradeDetails1.mmFXAdditionalDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFXAdditionalDetails = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PaymentObligation.mmExchangeRateInformation;
			componentContext_lazy = () -> SecuritiesTradeDetails33.mmObject();
			isDerived = false;
			xmlTag = "FxAddtlDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FXAdditionalDetails";
			definition = "Provides additional details pertaining to foreign exchange instructions.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTradeDetails51.mmFXAdditionalDetails);
			previousVersion_lazy = () -> SecuritiesTradeDetails1.mmFXAdditionalDetails;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	protected Max350Text settlementInstructionProcessingAdditionalDetails;
	/**
	 * Provides additional settlement processing information which can not be
	 * included within the structured fields of the message.
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails33
	 * SecuritiesTradeDetails33}</li>
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails51#mmSettlementInstructionProcessingAdditionalDetails
	 * SecuritiesTradeDetails51.
	 * mmSettlementInstructionProcessingAdditionalDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails1#mmSettlementInstructionProcessingAdditionalDetails
	 * SecuritiesTradeDetails1.
	 * mmSettlementInstructionProcessingAdditionalDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSettlementInstructionProcessingAdditionalDetails = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SecuritiesTradeDetails33.mmObject();
			isDerived = false;
			xmlTag = "SttlmInstrPrcgAddtlDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementInstructionProcessingAdditionalDetails";
			definition = "Provides additional settlement processing information which can not be included within the structured fields of the message.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTradeDetails51.mmSettlementInstructionProcessingAdditionalDetails);
			previousVersion_lazy = () -> SecuritiesTradeDetails1.mmSettlementInstructionProcessingAdditionalDetails;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(SecuritiesTradeDetails33.mmTradeIdentification, SecuritiesTradeDetails33.mmCollateralTransactionIdentification, SecuritiesTradeDetails33.mmPlaceOfTrade,
						SecuritiesTradeDetails33.mmPlaceOfClearing, SecuritiesTradeDetails33.mmTradeDate, SecuritiesTradeDetails33.mmSettlementDate, SecuritiesTradeDetails33.mmLateDeliveryDate, SecuritiesTradeDetails33.mmDealPrice,
						SecuritiesTradeDetails33.mmNumberOfDaysAccrued, SecuritiesTradeDetails33.mmOpeningClosing, SecuritiesTradeDetails33.mmReporting, SecuritiesTradeDetails33.mmTradeTransactionCondition,
						SecuritiesTradeDetails33.mmInvestorCapacity, SecuritiesTradeDetails33.mmTradeOriginatorRole, SecuritiesTradeDetails33.mmTypeOfPrice, SecuritiesTradeDetails33.mmCurrencyToBuyOrSell,
						SecuritiesTradeDetails33.mmMatchingStatus, SecuritiesTradeDetails33.mmAffirmationStatus, SecuritiesTradeDetails33.mmFXAdditionalDetails, SecuritiesTradeDetails33.mmSettlementInstructionProcessingAdditionalDetails);
				messageBuildingBlock_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionGenerationNotificationV05.mmTradeDetails, SecuritiesSettlementTransactionInstructionV05.mmTradeDetails);
				trace_lazy = () -> SecuritiesTrade.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("May 5, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "SecuritiesTradeDetails33";
				definition = "Details of the securities trade.";
				nextVersions_lazy = () -> Arrays.asList(SecuritiesTradeDetails51.mmObject());
				previousVersion_lazy = () -> SecuritiesTradeDetails1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "TradId")
	public List<Max35Text> getTradeIdentification() {
		return tradeIdentification;
	}

	public void setTradeIdentification(List<Max35Text> tradeIdentification) {
		this.tradeIdentification = tradeIdentification;
	}

	@XmlElement(name = "CollTxId")
	public List<Max35Text> getCollateralTransactionIdentification() {
		return collateralTransactionIdentification;
	}

	public void setCollateralTransactionIdentification(List<Max35Text> collateralTransactionIdentification) {
		this.collateralTransactionIdentification = collateralTransactionIdentification;
	}

	@XmlElement(name = "PlcOfTrad")
	public MarketIdentification78 getPlaceOfTrade() {
		return placeOfTrade;
	}

	public void setPlaceOfTrade(com.tools20022.repository.msg.MarketIdentification78 placeOfTrade) {
		this.placeOfTrade = placeOfTrade;
	}

	@XmlElement(name = "PlcOfClr")
	public AnyBICIdentifier getPlaceOfClearing() {
		return placeOfClearing;
	}

	public void setPlaceOfClearing(AnyBICIdentifier placeOfClearing) {
		this.placeOfClearing = placeOfClearing;
	}

	@XmlElement(name = "TradDt")
	public TradeDate1Choice getTradeDate() {
		return tradeDate;
	}

	public void setTradeDate(TradeDate1Choice tradeDate) {
		this.tradeDate = tradeDate;
	}

	@XmlElement(name = "SttlmDt", required = true)
	public SettlementDate1Choice getSettlementDate() {
		return settlementDate;
	}

	public void setSettlementDate(SettlementDate1Choice settlementDate) {
		this.settlementDate = settlementDate;
	}

	@XmlElement(name = "LateDlvryDt")
	public DateAndDateTimeChoice getLateDeliveryDate() {
		return lateDeliveryDate;
	}

	public void setLateDeliveryDate(DateAndDateTimeChoice lateDeliveryDate) {
		this.lateDeliveryDate = lateDeliveryDate;
	}

	@XmlElement(name = "DealPric")
	public Price2 getDealPrice() {
		return dealPrice;
	}

	public void setDealPrice(com.tools20022.repository.msg.Price2 dealPrice) {
		this.dealPrice = dealPrice;
	}

	@XmlElement(name = "NbOfDaysAcrd")
	public Max3Number getNumberOfDaysAccrued() {
		return numberOfDaysAccrued;
	}

	public void setNumberOfDaysAccrued(Max3Number numberOfDaysAccrued) {
		this.numberOfDaysAccrued = numberOfDaysAccrued;
	}

	@XmlElement(name = "OpngClsg")
	public OpeningClosing1Choice getOpeningClosing() {
		return openingClosing;
	}

	public void setOpeningClosing(OpeningClosing1Choice openingClosing) {
		this.openingClosing = openingClosing;
	}

	@XmlElement(name = "Rptg")
	public List<Reporting2Choice> getReporting() {
		return reporting;
	}

	public void setReporting(List<Reporting2Choice> reporting) {
		this.reporting = reporting;
	}

	@XmlElement(name = "TradTxCond")
	public List<TradeTransactionCondition1Choice> getTradeTransactionCondition() {
		return tradeTransactionCondition;
	}

	public void setTradeTransactionCondition(List<TradeTransactionCondition1Choice> tradeTransactionCondition) {
		this.tradeTransactionCondition = tradeTransactionCondition;
	}

	@XmlElement(name = "InvstrCpcty")
	public InvestorCapacity1Choice getInvestorCapacity() {
		return investorCapacity;
	}

	public void setInvestorCapacity(InvestorCapacity1Choice investorCapacity) {
		this.investorCapacity = investorCapacity;
	}

	@XmlElement(name = "TradOrgtrRole")
	public TradeOriginator1Choice getTradeOriginatorRole() {
		return tradeOriginatorRole;
	}

	public void setTradeOriginatorRole(TradeOriginator1Choice tradeOriginatorRole) {
		this.tradeOriginatorRole = tradeOriginatorRole;
	}

	@XmlElement(name = "TpOfPric")
	public TypeOfPrice3Choice getTypeOfPrice() {
		return typeOfPrice;
	}

	public void setTypeOfPrice(TypeOfPrice3Choice typeOfPrice) {
		this.typeOfPrice = typeOfPrice;
	}

	@XmlElement(name = "CcyToBuyOrSell")
	public CurrencyToBuyOrSell1Choice getCurrencyToBuyOrSell() {
		return currencyToBuyOrSell;
	}

	public void setCurrencyToBuyOrSell(CurrencyToBuyOrSell1Choice currencyToBuyOrSell) {
		this.currencyToBuyOrSell = currencyToBuyOrSell;
	}

	@XmlElement(name = "MtchgSts")
	public MatchingStatus1Choice getMatchingStatus() {
		return matchingStatus;
	}

	public void setMatchingStatus(MatchingStatus1Choice matchingStatus) {
		this.matchingStatus = matchingStatus;
	}

	@XmlElement(name = "AffirmSts")
	public AffirmationStatus1Choice getAffirmationStatus() {
		return affirmationStatus;
	}

	public void setAffirmationStatus(AffirmationStatus1Choice affirmationStatus) {
		this.affirmationStatus = affirmationStatus;
	}

	@XmlElement(name = "FxAddtlDtls")
	public Max350Text getFXAdditionalDetails() {
		return fXAdditionalDetails;
	}

	public void setFXAdditionalDetails(Max350Text fXAdditionalDetails) {
		this.fXAdditionalDetails = fXAdditionalDetails;
	}

	@XmlElement(name = "SttlmInstrPrcgAddtlDtls")
	public Max350Text getSettlementInstructionProcessingAdditionalDetails() {
		return settlementInstructionProcessingAdditionalDetails;
	}

	public void setSettlementInstructionProcessingAdditionalDetails(Max350Text settlementInstructionProcessingAdditionalDetails) {
		this.settlementInstructionProcessingAdditionalDetails = settlementInstructionProcessingAdditionalDetails;
	}
}