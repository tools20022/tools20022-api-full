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
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.*;
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
 * Intention to transfer an ownership of a financial instrument.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Order14#mmBusinessProcessType
 * Order14.mmBusinessProcessType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order14#mmOrderIdentification
 * Order14.mmOrderIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Order14#mmClientOrderIdentification
 * Order14.mmClientOrderIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Order14#mmSecondaryClientOrderIdentification
 * Order14.mmSecondaryClientOrderIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order14#mmListIdentification
 * Order14.mmListIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order14#mmSide Order14.mmSide}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order14#mmPayment
 * Order14.mmPayment}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order14#mmTradeTransactionType
 * Order14.mmTradeTransactionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Order14#mmTradeTransactionCondition
 * Order14.mmTradeTransactionCondition}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order14#mmPreAdvice
 * Order14.mmPreAdvice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order14#mmPlaceOfTrade
 * Order14.mmPlaceOfTrade}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order14#mmOrderBookingDate
 * Order14.mmOrderBookingDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order14#mmTradeOriginationDate
 * Order14.mmTradeOriginationDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order14#mmTradeDate
 * Order14.mmTradeDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order14#mmProcessingDate
 * Order14.mmProcessingDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order14#mmSettlementDate
 * Order14.mmSettlementDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order14#mmNAVDate
 * Order14.mmNAVDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order14#mmPartialFillDetails
 * Order14.mmPartialFillDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order14#mmConfirmationQuantity
 * Order14.mmConfirmationQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order14#mmQuantityBreakdown
 * Order14.mmQuantityBreakdown}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order14#mmGrossTradeAmount
 * Order14.mmGrossTradeAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order14#mmDealPrice
 * Order14.mmDealPrice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order14#mmTypeOfPrice
 * Order14.mmTypeOfPrice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order14#mmCashMargin
 * Order14.mmCashMargin}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order14#mmCommission
 * Order14.mmCommission}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order14#mmNumberOfDaysAccrued
 * Order14.mmNumberOfDaysAccrued}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order14#mmGiveUpNumberOfDays
 * Order14.mmGiveUpNumberOfDays}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order14#mmInterestType
 * Order14.mmInterestType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Order14#mmAccruedInterestAmount
 * Order14.mmAccruedInterestAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Order14#mmAccruedInterestPercentage
 * Order14.mmAccruedInterestPercentage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Order14#mmTradeRegulatoryConditionsType
 * Order14.mmTradeRegulatoryConditionsType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order14#mmCurrencyToBuyOrSell
 * Order14.mmCurrencyToBuyOrSell}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Order14#mmOrderOriginatorEligibility
 * Order14.mmOrderOriginatorEligibility}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order14#mmPositionEffect
 * Order14.mmPositionEffect}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order14#mmDerivativeCovered
 * Order14.mmDerivativeCovered}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order14#mmChargeTaxBasisType
 * Order14.mmChargeTaxBasisType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order14#mmCapitalGainType
 * Order14.mmCapitalGainType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order14#mmMatchStatus
 * Order14.mmMatchStatus}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order14#mmCallInType
 * Order14.mmCallInType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order14#mmYieldType
 * Order14.mmYieldType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order14#mmReporting
 * Order14.mmReporting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Order14#mmAdditionalPhysicalOrRegistrationDetails
 * Order14.mmAdditionalPhysicalOrRegistrationDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Order14#mmAdditionalTradeInstructionProcessingInformation
 * Order14.mmAdditionalTradeInstructionProcessingInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesOrder
 * SecuritiesOrder}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV01#mmTradeDetails
 * SecuritiesTradeConfirmationV01.mmTradeDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV02#mmTradeDetails
 * SecuritiesTradeConfirmationV02.mmTradeDetails}</li>
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
 * "Order14"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Intention to transfer an ownership of a financial instrument."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Order17 Order17}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "Order14", propOrder = {"businessProcessType", "orderIdentification", "clientOrderIdentification", "secondaryClientOrderIdentification", "listIdentification", "side", "payment", "tradeTransactionType",
		"tradeTransactionCondition", "preAdvice", "placeOfTrade", "orderBookingDate", "tradeOriginationDate", "tradeDate", "processingDate", "settlementDate", "NAVDate", "partialFillDetails", "confirmationQuantity", "quantityBreakdown",
		"grossTradeAmount", "dealPrice", "typeOfPrice", "cashMargin", "commission", "numberOfDaysAccrued", "giveUpNumberOfDays", "interestType", "accruedInterestAmount", "accruedInterestPercentage", "tradeRegulatoryConditionsType",
		"currencyToBuyOrSell", "orderOriginatorEligibility", "positionEffect", "derivativeCovered", "chargeTaxBasisType", "capitalGainType", "matchStatus", "callInType", "yieldType", "reporting", "additionalPhysicalOrRegistrationDetails",
		"additionalTradeInstructionProcessingInformation"})
public class Order14 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected BusinessProcessType1Choice businessProcessType;
	/**
	 * Specifies the type of business process.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.BusinessProcessType1Choice
	 * BusinessProcessType1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder
	 * SecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order14
	 * Order14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BizPrcTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BusinessProcessType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of business process."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order17#mmBusinessProcessType
	 * Order17.mmBusinessProcessType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBusinessProcessType = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> SecuritiesOrder.mmObject();
			componentContext_lazy = () -> Order14.mmObject();
			isDerived = false;
			xmlTag = "BizPrcTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BusinessProcessType";
			definition = "Specifies the type of business process.";
			nextVersions_lazy = () -> Arrays.asList(Order17.mmBusinessProcessType);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> BusinessProcessType1Choice.mmObject();
		}
	};
	protected List<Max35Text> orderIdentification;
	/**
	 * Unique identifier for Order as assigned by sell-side.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmIdentification
	 * SecuritiesOrder.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order14
	 * Order14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrdrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unique identifier for Order as assigned by sell-side."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order17#mmOrderIdentification
	 * Order17.mmOrderIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOrderIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmIdentification;
			componentContext_lazy = () -> Order14.mmObject();
			isDerived = false;
			xmlTag = "OrdrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderIdentification";
			definition = "Unique identifier for Order as assigned by sell-side.";
			nextVersions_lazy = () -> Arrays.asList(Order17.mmOrderIdentification);
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected List<Max35Text> clientOrderIdentification;
	/**
	 * Unique identifier for the order as assigned by the buy-side. Uniqueness
	 * must be guaranteed within a single trading day. Firms, particularly those
	 * that electronically submit multi-day orders, trade globally or throughout
	 * market close periods, should ensure uniqueness across days, for example
	 * by embedding a date within the ClientOrderIdentification element.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmClientOrderIdentification
	 * SecuritiesOrder.mmClientOrderIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order14
	 * Order14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClntOrdrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClientOrderIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identifier for the order as assigned by the buy-side. Uniqueness must be guaranteed within a single trading day. Firms, particularly those that electronically submit multi-day orders, trade globally or throughout market close periods, should ensure uniqueness across days, for example by embedding a date within the ClientOrderIdentification element."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order17#mmClientOrderIdentification
	 * Order17.mmClientOrderIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmClientOrderIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmClientOrderIdentification;
			componentContext_lazy = () -> Order14.mmObject();
			isDerived = false;
			xmlTag = "ClntOrdrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClientOrderIdentification";
			definition = "Unique identifier for the order as assigned by the buy-side. Uniqueness must be guaranteed within a single trading day. Firms, particularly those that electronically submit multi-day orders, trade globally or throughout market close periods, should ensure uniqueness across days, for example by embedding a date within the ClientOrderIdentification element.";
			nextVersions_lazy = () -> Arrays.asList(Order17.mmClientOrderIdentification);
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected List<Max35Text> secondaryClientOrderIdentification;
	/**
	 * Assigned by the party that originates the order. Can be used to provide
	 * the ClientOrderIdentification used by an exchange or executing system.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmClientOrderIdentification
	 * SecuritiesOrder.mmClientOrderIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order14
	 * Order14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ScndryClntOrdrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecondaryClientOrderIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Assigned by the party that originates the order. Can be used to provide the ClientOrderIdentification used by an exchange or executing system."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order17#mmSecondaryClientOrderIdentification
	 * Order17.mmSecondaryClientOrderIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSecondaryClientOrderIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmClientOrderIdentification;
			componentContext_lazy = () -> Order14.mmObject();
			isDerived = false;
			xmlTag = "ScndryClntOrdrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecondaryClientOrderIdentification";
			definition = "Assigned by the party that originates the order. Can be used to provide the ClientOrderIdentification used by an exchange or executing system.";
			nextVersions_lazy = () -> Arrays.asList(Order17.mmSecondaryClientOrderIdentification);
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected List<Max35Text> listIdentification;
	/**
	 * Unique identifier for a list, as assigned by the trading party. The
	 * identifier must be unique within a single trading day.
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
	 * {@linkplain com.tools20022.repository.entity.ListTrading#mmListIdentification
	 * ListTrading.mmListIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order14
	 * Order14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ListId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ListIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identifier for a list, as assigned by the trading party. The identifier must be unique within a single trading day."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order17#mmListIdentification
	 * Order17.mmListIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmListIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ListTrading.mmListIdentification;
			componentContext_lazy = () -> Order14.mmObject();
			isDerived = false;
			xmlTag = "ListId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ListIdentification";
			definition = "Unique identifier for a list, as assigned by the trading party. The identifier must be unique within a single trading day.";
			nextVersions_lazy = () -> Arrays.asList(Order17.mmListIdentification);
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Side3Code side;
	/**
	 * Coded list to specify the side of the order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.Side3Code
	 * Side3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmSide
	 * SecuritiesOrder.mmSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order14
	 * Order14}</li>
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
	 * definition} = "Coded list to specify the side of the order."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Order17#mmSide
	 * Order17.mmSide}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSide = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmSide;
			componentContext_lazy = () -> Order14.mmObject();
			isDerived = false;
			xmlTag = "Sd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Side";
			definition = "Coded list to specify the side of the order.";
			nextVersions_lazy = () -> Arrays.asList(Order17.mmSide);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Side3Code.mmObject();
		}
	};
	protected DeliveryReceiptType2Code payment;
	/**
	 * Specifies how the transaction is to be settled, for example, against
	 * payment.
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order14
	 * Order14}</li>
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
	 * "Specifies how the transaction is to be settled, for example, against payment."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Order17#mmPayment
	 * Order17.mmPayment}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPayment = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmSettlementType;
			componentContext_lazy = () -> Order14.mmObject();
			isDerived = false;
			xmlTag = "Pmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Payment";
			definition = "Specifies how the transaction is to be settled, for example, against payment.";
			nextVersions_lazy = () -> Arrays.asList(Order17.mmPayment);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DeliveryReceiptType2Code.mmObject();
		}
	};
	protected TradeType3Choice tradeTransactionType;
	/**
	 * Specifies the type of transaction of which the order is a component.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.TradeType3Choice
	 * TradeType3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmTransactionType
	 * SecuritiesTrade.mmTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order14
	 * Order14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradTxTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeTransactionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of transaction of which the order is a component."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order17#mmTradeTransactionType
	 * Order17.mmTradeTransactionType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTradeTransactionType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesTrade.mmTransactionType;
			componentContext_lazy = () -> Order14.mmObject();
			isDerived = false;
			xmlTag = "TradTxTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeTransactionType";
			definition = "Specifies the type of transaction of which the order is a component.";
			nextVersions_lazy = () -> Arrays.asList(Order17.mmTradeTransactionType);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> TradeType3Choice.mmObject();
		}
	};
	protected List<TradeTransactionCondition4Choice> tradeTransactionCondition;
	/**
	 * Indicates the conditions under which the order/trade is to be/was
	 * executed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.TradeTransactionCondition4Choice
	 * TradeTransactionCondition4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmTradeTransactionCondition
	 * SecuritiesTrade.mmTradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order14
	 * Order14}</li>
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
	 * {@linkplain com.tools20022.repository.msg.Order17#mmTradeTransactionCondition
	 * Order17.mmTradeTransactionCondition}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTradeTransactionCondition = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesTrade.mmTradeTransactionCondition;
			componentContext_lazy = () -> Order14.mmObject();
			isDerived = false;
			xmlTag = "TradTxCond";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeTransactionCondition";
			definition = "Indicates the conditions under which the order/trade is to be/was executed.";
			nextVersions_lazy = () -> Arrays.asList(Order17.mmTradeTransactionCondition);
			minOccurs = 0;
			complexType_lazy = () -> TradeTransactionCondition4Choice.mmObject();
		}
	};
	protected YesNoIndicator preAdvice;
	/**
	 * Transaction is a pre-advice, that is, for matching purposes only.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order14
	 * Order14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PreAdvc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreAdvice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction is a pre-advice, that is, for matching purposes only."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Order17#mmPreAdvice
	 * Order17.mmPreAdvice}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPreAdvice = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Order14.mmObject();
			isDerived = false;
			xmlTag = "PreAdvc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreAdvice";
			definition = "Transaction is a pre-advice, that is, for matching purposes only.";
			nextVersions_lazy = () -> Arrays.asList(Order17.mmPreAdvice);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected MarketIdentification77 placeOfTrade;
	/**
	 * Market in which a trade transaction is to be or has been executed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.MarketIdentification77
	 * MarketIdentification77}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmPlaceOfTrade
	 * SecuritiesOrder.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order14
	 * Order14}</li>
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
	 * "Market in which a trade transaction is to be or has been executed."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Order17#mmPlaceOfTrade
	 * Order17.mmPlaceOfTrade}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPlaceOfTrade = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmPlaceOfTrade;
			componentContext_lazy = () -> Order14.mmObject();
			isDerived = false;
			xmlTag = "PlcOfTrad";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfTrade";
			definition = "Market in which a trade transaction is to be or has been executed.";
			nextVersions_lazy = () -> Arrays.asList(Order17.mmPlaceOfTrade);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.MarketIdentification77.mmObject();
		}
	};
	protected ISODate orderBookingDate;
	/**
	 * Date and time when an entry is posted to an account on the account
	 * servicer's books.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmOrderDate
	 * SecuritiesOrder.mmOrderDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order14
	 * Order14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrdrBookgDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderBookingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time when an entry is posted to an account on the account servicer's books."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Order17#mmOrderBookingDate
	 * Order17.mmOrderBookingDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOrderBookingDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmOrderDate;
			componentContext_lazy = () -> Order14.mmObject();
			isDerived = false;
			xmlTag = "OrdrBookgDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderBookingDate";
			definition = "Date and time when an entry is posted to an account on the account servicer's books.";
			nextVersions_lazy = () -> Arrays.asList(Order17.mmOrderBookingDate);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected ISODateTime tradeOriginationDate;
	/**
	 * Indicates the date and time of the agreement in principal between
	 * counter-parties prior to actual trade date. Used with fixed income for
	 * municipal new issue markets.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmTradeOriginationDate
	 * SecuritiesTrade.mmTradeOriginationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order14
	 * Order14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradOrgtnDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeOriginationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the date and time of the agreement in principal between counter-parties prior to actual trade date.\nUsed with fixed income for municipal new issue markets."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order17#mmTradeOriginationDate
	 * Order17.mmTradeOriginationDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTradeOriginationDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesTrade.mmTradeOriginationDate;
			componentContext_lazy = () -> Order14.mmObject();
			isDerived = false;
			xmlTag = "TradOrgtnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeOriginationDate";
			definition = "Indicates the date and time of the agreement in principal between counter-parties prior to actual trade date.\nUsed with fixed income for municipal new issue markets.";
			nextVersions_lazy = () -> Arrays.asList(Order17.mmTradeOriginationDate);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected TradeDate4Choice tradeDate;
	/**
	 * Specifies the date/time on which the trade was executed.
	 * <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order14
	 * Order14}</li>
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
	 * <li>{@linkplain com.tools20022.repository.msg.Order17#mmTradeDate
	 * Order17.mmTradeDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTradeDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Trade.mmTradeDateTime;
			componentContext_lazy = () -> Order14.mmObject();
			isDerived = false;
			xmlTag = "TradDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDate";
			definition = "Specifies the date/time on which the trade was executed.";
			nextVersions_lazy = () -> Arrays.asList(Order17.mmTradeDate);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> TradeDate4Choice.mmObject();
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Trade#mmStartDate
	 * Trade.mmStartDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order14
	 * Order14}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Order17#mmProcessingDate
	 * Order17.mmProcessingDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmProcessingDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Trade.mmStartDate;
			componentContext_lazy = () -> Order14.mmObject();
			isDerived = false;
			xmlTag = "PrcgDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessingDate";
			definition = "Processing date of the trading session.";
			nextVersions_lazy = () -> Arrays.asList(Order17.mmProcessingDate);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> TradeDate4Choice.mmObject();
		}
	};
	protected SettlementDate8Choice settlementDate;
	/**
	 * Date and time at which the securities are to be delivered or received.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.SettlementDate8Choice
	 * SettlementDate8Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Obligation#mmRequestedSettlementDate
	 * Obligation.mmRequestedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order14
	 * Order14}</li>
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
	 * <li>{@linkplain com.tools20022.repository.msg.Order17#mmSettlementDate
	 * Order17.mmSettlementDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSettlementDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Obligation.mmRequestedSettlementDate;
			componentContext_lazy = () -> Order14.mmObject();
			isDerived = false;
			xmlTag = "SttlmDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDate";
			definition = "Date and time at which the securities are to be delivered or received.";
			nextVersions_lazy = () -> Arrays.asList(Order17.mmSettlementDate);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SettlementDate8Choice.mmObject();
		}
	};
	protected DateAndDateTime1Choice nAVDate;
	/**
	 * Valuation point, or valuation date of the portfolio (underlying assets).
	 * This is also known as price date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTime1Choice
	 * DateAndDateTime1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#mmValuationDateTime
	 * NetAssetValueCalculation.mmValuationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order14
	 * Order14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NAVDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NAVDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Valuation point, or valuation date of the portfolio (underlying assets). This is also known as price date."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Order17#mmNAVDate
	 * Order17.mmNAVDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNAVDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> NetAssetValueCalculation.mmValuationDateTime;
			componentContext_lazy = () -> Order14.mmObject();
			isDerived = false;
			xmlTag = "NAVDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NAVDate";
			definition = "Valuation point, or valuation date of the portfolio (underlying assets). This is also known as price date.";
			nextVersions_lazy = () -> Arrays.asList(Order17.mmNAVDate);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateAndDateTime1Choice.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.PartialFill1> partialFillDetails;
	/**
	 * Quantity of financial instrument bought or sold which is less than the
	 * quantity of financial instrument ordered.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartialFill1
	 * PartialFill1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder
	 * SecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order14
	 * Order14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtlFillDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialFillDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity of financial instrument bought or sold which is less than the quantity of financial instrument ordered."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order17#mmPartialFillDetails
	 * Order17.mmPartialFillDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPartialFillDetails = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> SecuritiesOrder.mmObject();
			componentContext_lazy = () -> Order14.mmObject();
			isDerived = false;
			xmlTag = "PrtlFillDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialFillDetails";
			definition = "Quantity of financial instrument bought or sold which is less than the quantity of financial instrument ordered.";
			nextVersions_lazy = () -> Arrays.asList(Order17.mmPartialFillDetails);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartialFill1.mmObject();
		}
	};
	protected Quantity6Choice confirmationQuantity;
	/**
	 * Quantity of financial instrument that is being confirmed for the
	 * account.The quantity of the security to be settled.
	 * <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order14
	 * Order14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ConfQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConfirmationQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity of financial instrument that is being confirmed for the account.The quantity of the security to be settled."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order17#mmConfirmationQuantity
	 * Order17.mmConfirmationQuantity}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmConfirmationQuantity = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmOrderedQuantity;
			componentContext_lazy = () -> Order14.mmObject();
			isDerived = false;
			xmlTag = "ConfQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConfirmationQuantity";
			definition = "Quantity of financial instrument that is being confirmed for the account.The quantity of the security to be settled.";
			nextVersions_lazy = () -> Arrays.asList(Order17.mmConfirmationQuantity);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Quantity6Choice.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.QuantityBreakdown11> quantityBreakdown;
	/**
	 * Breakdown of a quantity into lots such as tax lots, instrument series,
	 * etc.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown11
	 * QuantityBreakdown11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmLotBreakdown
	 * SecuritiesQuantity.mmLotBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order14
	 * Order14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "QtyBrkdwn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuantityBreakdown"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Breakdown of a quantity into lots such as tax lots, instrument series, etc."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order17#mmQuantityBreakdown
	 * Order17.mmQuantityBreakdown}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmQuantityBreakdown = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesQuantity.mmLotBreakdown;
			componentContext_lazy = () -> Order14.mmObject();
			isDerived = false;
			xmlTag = "QtyBrkdwn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuantityBreakdown";
			definition = "Breakdown of a quantity into lots such as tax lots, instrument series, etc.";
			nextVersions_lazy = () -> Arrays.asList(Order17.mmQuantityBreakdown);
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.QuantityBreakdown11.mmObject();
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmOrderedAmount
	 * SecuritiesOrder.mmOrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order14
	 * Order14}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Order17#mmGrossTradeAmount
	 * Order17.mmGrossTradeAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmGrossTradeAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmOrderedAmount;
			componentContext_lazy = () -> Order14.mmObject();
			isDerived = false;
			xmlTag = "GrssTradAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossTradeAmount";
			definition = "Principal amount of a trade (price multiplied by quantity).";
			nextVersions_lazy = () -> Arrays.asList(Order17.mmGrossTradeAmount);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AmountAndDirection29.mmObject();
		}
	};
	protected Price4 dealPrice;
	/**
	 * Amount of money for which goods or services are offered, sold, or bought.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Price4 Price4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmPrice
	 * SecuritiesPricing.mmPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order14
	 * Order14}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Order17#mmDealPrice
	 * Order17.mmDealPrice}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDealPrice = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesPricing.mmPrice;
			componentContext_lazy = () -> Order14.mmObject();
			isDerived = false;
			xmlTag = "DealPric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DealPrice";
			definition = "Amount of money for which goods or services are offered, sold, or bought.";
			nextVersions_lazy = () -> Arrays.asList(Order17.mmDealPrice);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> com.tools20022.repository.msg.Price4.mmObject();
		}
	};
	protected TypeOfPrice10Choice typeOfPrice;
	/**
	 * Specifies the type of transaction price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.TypeOfPrice10Choice
	 * TypeOfPrice10Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmPriceType
	 * SecuritiesPricing.mmPriceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order14
	 * Order14}</li>
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
	 * definition} = "Specifies the type of transaction price."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Order17#mmTypeOfPrice
	 * Order17.mmTypeOfPrice}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTypeOfPrice = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesPricing.mmPriceType;
			componentContext_lazy = () -> Order14.mmObject();
			isDerived = false;
			xmlTag = "TpOfPric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TypeOfPrice";
			definition = "Specifies the type of transaction price.";
			nextVersions_lazy = () -> Arrays.asList(Order17.mmTypeOfPrice);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> TypeOfPrice10Choice.mmObject();
		}
	};
	protected CashMarginOrder1Code cashMargin;
	/**
	 * Identifies whether an order is a margin order or a non-margin order. This
	 * is primarily used when sending orders to Japanese exchanges to indicate
	 * sell margin or buy to cover. The same tag could be assigned also by
	 * buy-side to indicate the intent to sell or buy margin and the sell-side
	 * to accept or reject (base on some validation criteria) the margin
	 * request.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CashMarginOrder1Code
	 * CashMarginOrder1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmCashMargin
	 * SecuritiesOrder.mmCashMargin}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order14
	 * Order14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshMrgn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashMargin"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies whether an order is a margin order or a non-margin order. This is primarily used when sending orders to Japanese exchanges to indicate sell margin or buy to cover. The same tag could be assigned also by buy-side to indicate the intent to sell or buy margin and the sell-side to accept or reject (base on some validation criteria) the margin request."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Order17#mmCashMargin
	 * Order17.mmCashMargin}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCashMargin = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmCashMargin;
			componentContext_lazy = () -> Order14.mmObject();
			isDerived = false;
			xmlTag = "CshMrgn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashMargin";
			definition = "Identifies whether an order is a margin order or a non-margin order. This is primarily used when sending orders to Japanese exchanges to indicate sell margin or buy to cover. The same tag could be assigned also by buy-side to indicate the intent to sell or buy margin and the sell-side to accept or reject (base on some validation criteria) the margin request.";
			nextVersions_lazy = () -> Arrays.asList(Order17.mmCashMargin);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CashMarginOrder1Code.mmObject();
		}
	};
	protected Commission16 commission;
	/**
	 * Amount of money due to a party as compensation for a service.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Commission16
	 * Commission16}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Trade#mmTradeCommission
	 * Trade.mmTradeCommission}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order14
	 * Order14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Comssn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Commission"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money due to a party as compensation for a service."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Order17#mmCommission
	 * Order17.mmCommission}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCommission = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Trade.mmTradeCommission;
			componentContext_lazy = () -> Order14.mmObject();
			isDerived = false;
			xmlTag = "Comssn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Commission";
			definition = "Amount of money due to a party as compensation for a service.";
			nextVersions_lazy = () -> Arrays.asList(Order17.mmCommission);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Commission16.mmObject();
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order14
	 * Order14}</li>
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
	 * {@linkplain com.tools20022.repository.msg.Order17#mmNumberOfDaysAccrued
	 * Order17.mmNumberOfDaysAccrued}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNumberOfDaysAccrued = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> DateTimePeriod.mmNumberOfDays;
			componentContext_lazy = () -> Order14.mmObject();
			isDerived = false;
			xmlTag = "NbOfDaysAcrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NumberOfDaysAccrued";
			definition = "Number of days on which the interest rate accrues (daily accrual note).";
			nextVersions_lazy = () -> Arrays.asList(Order17.mmNumberOfDaysAccrued);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max3Number.mmObject();
		}
	};
	protected Max3Number giveUpNumberOfDays;
	/**
	 * Specifies the number of days from trade date that the counterparty on the
	 * other side of the trade should be "given up" or divulged.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmGiveUpNumberOfDays
	 * SecuritiesOrder.mmGiveUpNumberOfDays}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order14
	 * Order14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GvUpNbOfDays"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GiveUpNumberOfDays"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the number of days from trade date that the counterparty on the other side of the trade should be \"given up\" or divulged."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order17#mmGiveUpNumberOfDays
	 * Order17.mmGiveUpNumberOfDays}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmGiveUpNumberOfDays = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmGiveUpNumberOfDays;
			componentContext_lazy = () -> Order14.mmObject();
			isDerived = false;
			xmlTag = "GvUpNbOfDays";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GiveUpNumberOfDays";
			definition = "Specifies the number of days from trade date that the counterparty on the other side of the trade should be \"given up\" or divulged.";
			nextVersions_lazy = () -> Arrays.asList(Order17.mmGiveUpNumberOfDays);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max3Number.mmObject();
		}
	};
	protected InterestType2Code interestType;
	/**
	 * Indicates whether the trade is cum interest or ex interest.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.InterestType2Code
	 * InterestType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Interest#mmTypeOfInterest
	 * Interest.mmTypeOfInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order14
	 * Order14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrstTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the trade is cum interest or ex interest."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Order17#mmInterestType
	 * Order17.mmInterestType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInterestType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Interest.mmTypeOfInterest;
			componentContext_lazy = () -> Order14.mmObject();
			isDerived = false;
			xmlTag = "IntrstTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestType";
			definition = "Indicates whether the trade is cum interest or ex interest.";
			nextVersions_lazy = () -> Arrays.asList(Order17.mmInterestType);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> InterestType2Code.mmObject();
		}
	};
	protected AmountAndDirection29 accruedInterestAmount;
	/**
	 * Interest amount that has accrued in between two periods, for example, in
	 * between interest payment periods.
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
	 * {@linkplain com.tools20022.repository.entity.Interest#mmAccruedInterestAmount
	 * Interest.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order14
	 * Order14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcrdIntrstAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccruedInterestAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Interest amount that has accrued in between two periods, for example, in between interest payment periods."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order17#mmAccruedInterestAmount
	 * Order17.mmAccruedInterestAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAccruedInterestAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Interest.mmAccruedInterestAmount;
			componentContext_lazy = () -> Order14.mmObject();
			isDerived = false;
			xmlTag = "AcrdIntrstAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccruedInterestAmount";
			definition = "Interest amount that has accrued in between two periods, for example, in between interest payment periods.";
			nextVersions_lazy = () -> Arrays.asList(Order17.mmAccruedInterestAmount);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AmountAndDirection29.mmObject();
		}
	};
	protected PercentageRate accruedInterestPercentage;
	/**
	 * Interest rate that has been accrued in between coupon payment periods.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Interest#mmRate
	 * Interest.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order14
	 * Order14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcrdIntrstPctg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccruedInterestPercentage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Interest rate that has been accrued in between coupon payment periods."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order17#mmAccruedInterestPercentage
	 * Order17.mmAccruedInterestPercentage}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAccruedInterestPercentage = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Interest.mmRate;
			componentContext_lazy = () -> Order14.mmObject();
			isDerived = false;
			xmlTag = "AcrdIntrstPctg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccruedInterestPercentage";
			definition = "Interest rate that has been accrued in between coupon payment periods.";
			nextVersions_lazy = () -> Arrays.asList(Order17.mmAccruedInterestPercentage);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	protected TradeRegulatoryConditions1Code tradeRegulatoryConditionsType;
	/**
	 * Specifies the regulatory conditions type of the trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TradeRegulatoryConditions1Code
	 * TradeRegulatoryConditions1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmTradeRegulatoryConditionsType
	 * SecuritiesOrder.mmTradeRegulatoryConditionsType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order14
	 * Order14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradRgltryCondsTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeRegulatoryConditionsType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the regulatory conditions type of the trade."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order17#mmTradeRegulatoryConditionsType
	 * Order17.mmTradeRegulatoryConditionsType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTradeRegulatoryConditionsType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmTradeRegulatoryConditionsType;
			componentContext_lazy = () -> Order14.mmObject();
			isDerived = false;
			xmlTag = "TradRgltryCondsTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeRegulatoryConditionsType";
			definition = "Specifies the regulatory conditions type of the trade.";
			nextVersions_lazy = () -> Arrays.asList(Order17.mmTradeRegulatoryConditionsType);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TradeRegulatoryConditions1Code.mmObject();
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#mmSecuritiesSettlement
	 * SecuritiesTradeExecution.mmSecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order14
	 * Order14}</li>
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
	 * {@linkplain com.tools20022.repository.msg.Order17#mmCurrencyToBuyOrSell
	 * Order17.mmCurrencyToBuyOrSell}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCurrencyToBuyOrSell = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeExecution.mmSecuritiesSettlement;
			componentContext_lazy = () -> Order14.mmObject();
			isDerived = false;
			xmlTag = "CcyToBuyOrSell";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyToBuyOrSell";
			definition = "Account servicer is instructed to buy the indicated currency after the receipt of cash proceeds or to sell the indicated currency in order to obtain the necessary currency to fund the transaction.";
			nextVersions_lazy = () -> Arrays.asList(Order17.mmCurrencyToBuyOrSell);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CurrencyToBuyOrSell1Choice.mmObject();
		}
	};
	protected Eligibility1Code orderOriginatorEligibility;
	/**
	 * Counterparties eligibility as defined by article 24 of the EU MiFID
	 * Directive applicable to transactions executed by investment firms for
	 * eligible counterparties.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.Eligibility1Code
	 * Eligibility1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmOrderOriginatorEligibility
	 * SecuritiesOrder.mmOrderOriginatorEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order14
	 * Order14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrdrOrgtrElgblty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderOriginatorEligibility"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Counterparties eligibility as defined by article 24 of the EU MiFID Directive applicable to transactions executed by investment firms for eligible counterparties."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order17#mmOrderOriginatorEligibility
	 * Order17.mmOrderOriginatorEligibility}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOrderOriginatorEligibility = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmOrderOriginatorEligibility;
			componentContext_lazy = () -> Order14.mmObject();
			isDerived = false;
			xmlTag = "OrdrOrgtrElgblty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderOriginatorEligibility";
			definition = "Counterparties eligibility as defined by article 24 of the EU MiFID Directive applicable to transactions executed by investment firms for eligible counterparties.";
			nextVersions_lazy = () -> Arrays.asList(Order17.mmOrderOriginatorEligibility);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Eligibility1Code.mmObject();
		}
	};
	protected PositionEffect2Code positionEffect;
	/**
	 * Indicates whether the resulting position after a trade should be an
	 * opening position or closing position. Used for omnibus accounting - where
	 * accounts are held on a gross basis instead of being netted together.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PositionEffect2Code
	 * PositionEffect2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmPositionEffect
	 * SecuritiesOrder.mmPositionEffect}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order14
	 * Order14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PosFct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PositionEffect"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the resulting position after a  trade should be an opening position or closing position. Used for omnibus accounting - where accounts are held on a gross basis instead of being netted together."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Order17#mmPositionEffect
	 * Order17.mmPositionEffect}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPositionEffect = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmPositionEffect;
			componentContext_lazy = () -> Order14.mmObject();
			isDerived = false;
			xmlTag = "PosFct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PositionEffect";
			definition = "Indicates whether the resulting position after a  trade should be an opening position or closing position. Used for omnibus accounting - where accounts are held on a gross basis instead of being netted together.";
			nextVersions_lazy = () -> Arrays.asList(Order17.mmPositionEffect);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PositionEffect2Code.mmObject();
		}
	};
	protected YesNoIndicator derivativeCovered;
	/**
	 * Indicates whether the derivative product is covered or not by an
	 * underlying financial instrument position.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Derivative#mmDerivativeCovered
	 * Derivative.mmDerivativeCovered}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order14
	 * Order14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DerivCvrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DerivativeCovered"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the derivative product is covered or not by an underlying financial instrument position."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order17#mmDerivativeCovered
	 * Order17.mmDerivativeCovered}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDerivativeCovered = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Derivative.mmDerivativeCovered;
			componentContext_lazy = () -> Order14.mmObject();
			isDerived = false;
			xmlTag = "DerivCvrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DerivativeCovered";
			definition = "Indicates whether the derivative product is covered or not by an underlying financial instrument position.";
			nextVersions_lazy = () -> Arrays.asList(Order17.mmDerivativeCovered);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected ChargeTaxBasisType1Choice chargeTaxBasisType;
	/**
	 * Type of charge/tax basis.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.ChargeTaxBasisType1Choice
	 * ChargeTaxBasisType1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmBasis Tax.mmBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order14
	 * Order14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ChrgTaxBsisTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargeTaxBasisType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of charge/tax basis."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order17#mmChargeTaxBasisType
	 * Order17.mmChargeTaxBasisType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmChargeTaxBasisType = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Tax.mmBasis;
			componentContext_lazy = () -> Order14.mmObject();
			isDerived = false;
			xmlTag = "ChrgTaxBsisTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargeTaxBasisType";
			definition = "Type of charge/tax basis.";
			nextVersions_lazy = () -> Arrays.asList(Order17.mmChargeTaxBasisType);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ChargeTaxBasisType1Choice.mmObject();
		}
	};
	protected EUCapitalGainType2Choice capitalGainType;
	/**
	 * Specifies the type of capital gain.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.EUCapitalGainType2Choice
	 * EUCapitalGainType2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTax#mmEUCapitalGain
	 * SecuritiesTax.mmEUCapitalGain}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order14
	 * Order14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CptlGnTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CapitalGainType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of capital gain."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Order17#mmCapitalGainType
	 * Order17.mmCapitalGainType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCapitalGainType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesTax.mmEUCapitalGain;
			componentContext_lazy = () -> Order14.mmObject();
			isDerived = false;
			xmlTag = "CptlGnTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CapitalGainType";
			definition = "Specifies the type of capital gain.";
			nextVersions_lazy = () -> Arrays.asList(Order17.mmCapitalGainType);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> EUCapitalGainType2Choice.mmObject();
		}
	};
	protected MatchingStatus8Choice matchStatus;
	/**
	 * Provides the matching status of the trade confirmation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus8Choice
	 * MatchingStatus8Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#mmMatchingStatus
	 * SecuritiesTradeStatus.mmMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order14
	 * Order14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MtchSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MatchStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the matching status of the trade confirmation."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Order17#mmMatchStatus
	 * Order17.mmMatchStatus}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMatchStatus = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeStatus.mmMatchingStatus;
			componentContext_lazy = () -> Order14.mmObject();
			isDerived = false;
			xmlTag = "MtchSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MatchStatus";
			definition = "Provides the matching status of the trade confirmation.";
			nextVersions_lazy = () -> Arrays.asList(Order17.mmMatchStatus);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> MatchingStatus8Choice.mmObject();
		}
	};
	protected CallIn1Code callInType;
	/**
	 * Specifies the type of pay-in call report.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CallIn1Code
	 * CallIn1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashManagementService#mmCallInType
	 * CashManagementService.mmCallInType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order14
	 * Order14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CallInTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CallInType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of pay-in call report."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Order17#mmCallInType
	 * Order17.mmCallInType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCallInType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CashManagementService.mmCallInType;
			componentContext_lazy = () -> Order14.mmObject();
			isDerived = false;
			xmlTag = "CallInTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CallInType";
			definition = "Specifies the type of pay-in call report.";
			nextVersions_lazy = () -> Arrays.asList(Order17.mmCallInType);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CallIn1Code.mmObject();
		}
	};
	protected YieldCalculation2 yieldType;
	/**
	 * Type of yield at which the transaction was effected.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.YieldCalculation2
	 * YieldCalculation2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.YieldCalculation#mmCalculationType
	 * YieldCalculation.mmCalculationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order14
	 * Order14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "YldTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "YieldType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of yield at which the transaction was effected."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Order17#mmYieldType
	 * Order17.mmYieldType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmYieldType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> YieldCalculation.mmCalculationType;
			componentContext_lazy = () -> Order14.mmObject();
			isDerived = false;
			xmlTag = "YldTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "YieldType";
			definition = "Type of yield at which the transaction was effected.";
			nextVersions_lazy = () -> Arrays.asList(Order17.mmYieldType);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.YieldCalculation2.mmObject();
		}
	};
	protected List<Reporting5Choice> reporting;
	/**
	 * Specifies that a trade is to be reported to a third party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.Reporting5Choice
	 * Reporting5Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#mmReportingType
	 * SecuritiesTradeExecution.mmReportingType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order14
	 * Order14}</li>
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
	 * <li>{@linkplain com.tools20022.repository.msg.Order17#mmReporting
	 * Order17.mmReporting}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReporting = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeExecution.mmReportingType;
			componentContext_lazy = () -> Order14.mmObject();
			isDerived = false;
			xmlTag = "Rptg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reporting";
			definition = "Specifies that a trade is to be reported to a third party.";
			nextVersions_lazy = () -> Arrays.asList(Order17.mmReporting);
			minOccurs = 0;
			complexType_lazy = () -> Reporting5Choice.mmObject();
		}
	};
	protected RegistrationParameters3 additionalPhysicalOrRegistrationDetails;
	/**
	 * Provides information required for the registration or physical
	 * settlement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.RegistrationParameters3
	 * RegistrationParameters3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmRegistration
	 * Security.mmRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order14
	 * Order14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlPhysOrRegnDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalPhysicalOrRegistrationDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information required for the registration or physical settlement."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order17#mmAdditionalPhysicalOrRegistrationDetails
	 * Order17.mmAdditionalPhysicalOrRegistrationDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAdditionalPhysicalOrRegistrationDetails = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Security.mmRegistration;
			componentContext_lazy = () -> Order14.mmObject();
			isDerived = false;
			xmlTag = "AddtlPhysOrRegnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalPhysicalOrRegistrationDetails";
			definition = "Provides information required for the registration or physical settlement.";
			nextVersions_lazy = () -> Arrays.asList(Order17.mmAdditionalPhysicalOrRegistrationDetails);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.RegistrationParameters3.mmObject();
		}
	};
	protected Max350Text additionalTradeInstructionProcessingInformation;
	/**
	 * Provides additional details of the trade process not included within
	 * structured fields of this message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order14
	 * Order14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlTradInstrPrcgInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalTradeInstructionProcessingInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides additional details of the trade process not included within structured fields of this message."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order17#mmAdditionalTradeInstructionProcessingInformation
	 * Order17.mmAdditionalTradeInstructionProcessingInformation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAdditionalTradeInstructionProcessingInformation = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Order14.mmObject();
			isDerived = false;
			xmlTag = "AddtlTradInstrPrcgInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalTradeInstructionProcessingInformation";
			definition = "Provides additional details of the trade process not included within structured fields of this message.";
			nextVersions_lazy = () -> Arrays.asList(Order17.mmAdditionalTradeInstructionProcessingInformation);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(Order14.mmBusinessProcessType, Order14.mmOrderIdentification, Order14.mmClientOrderIdentification, Order14.mmSecondaryClientOrderIdentification, Order14.mmListIdentification,
						Order14.mmSide, Order14.mmPayment, Order14.mmTradeTransactionType, Order14.mmTradeTransactionCondition, Order14.mmPreAdvice, Order14.mmPlaceOfTrade, Order14.mmOrderBookingDate, Order14.mmTradeOriginationDate,
						Order14.mmTradeDate, Order14.mmProcessingDate, Order14.mmSettlementDate, Order14.mmNAVDate, Order14.mmPartialFillDetails, Order14.mmConfirmationQuantity, Order14.mmQuantityBreakdown, Order14.mmGrossTradeAmount,
						Order14.mmDealPrice, Order14.mmTypeOfPrice, Order14.mmCashMargin, Order14.mmCommission, Order14.mmNumberOfDaysAccrued, Order14.mmGiveUpNumberOfDays, Order14.mmInterestType, Order14.mmAccruedInterestAmount,
						Order14.mmAccruedInterestPercentage, Order14.mmTradeRegulatoryConditionsType, Order14.mmCurrencyToBuyOrSell, Order14.mmOrderOriginatorEligibility, Order14.mmPositionEffect, Order14.mmDerivativeCovered,
						Order14.mmChargeTaxBasisType, Order14.mmCapitalGainType, Order14.mmMatchStatus, Order14.mmCallInType, Order14.mmYieldType, Order14.mmReporting, Order14.mmAdditionalPhysicalOrRegistrationDetails,
						Order14.mmAdditionalTradeInstructionProcessingInformation);
				messageBuildingBlock_lazy = () -> Arrays.asList(SecuritiesTradeConfirmationV01.mmTradeDetails, SecuritiesTradeConfirmationV02.mmTradeDetails);
				trace_lazy = () -> SecuritiesOrder.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Order14";
				definition = "Intention to transfer an ownership of a financial instrument.";
				nextVersions_lazy = () -> Arrays.asList(Order17.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "BizPrcTp")
	public BusinessProcessType1Choice getBusinessProcessType() {
		return businessProcessType;
	}

	public void setBusinessProcessType(BusinessProcessType1Choice businessProcessType) {
		this.businessProcessType = businessProcessType;
	}

	@XmlElement(name = "OrdrId")
	public List<Max35Text> getOrderIdentification() {
		return orderIdentification;
	}

	public void setOrderIdentification(List<Max35Text> orderIdentification) {
		this.orderIdentification = orderIdentification;
	}

	@XmlElement(name = "ClntOrdrId")
	public List<Max35Text> getClientOrderIdentification() {
		return clientOrderIdentification;
	}

	public void setClientOrderIdentification(List<Max35Text> clientOrderIdentification) {
		this.clientOrderIdentification = clientOrderIdentification;
	}

	@XmlElement(name = "ScndryClntOrdrId")
	public List<Max35Text> getSecondaryClientOrderIdentification() {
		return secondaryClientOrderIdentification;
	}

	public void setSecondaryClientOrderIdentification(List<Max35Text> secondaryClientOrderIdentification) {
		this.secondaryClientOrderIdentification = secondaryClientOrderIdentification;
	}

	@XmlElement(name = "ListId")
	public List<Max35Text> getListIdentification() {
		return listIdentification;
	}

	public void setListIdentification(List<Max35Text> listIdentification) {
		this.listIdentification = listIdentification;
	}

	@XmlElement(name = "Sd", required = true)
	public Side3Code getSide() {
		return side;
	}

	public void setSide(Side3Code side) {
		this.side = side;
	}

	@XmlElement(name = "Pmt")
	public DeliveryReceiptType2Code getPayment() {
		return payment;
	}

	public void setPayment(DeliveryReceiptType2Code payment) {
		this.payment = payment;
	}

	@XmlElement(name = "TradTxTp")
	public TradeType3Choice getTradeTransactionType() {
		return tradeTransactionType;
	}

	public void setTradeTransactionType(TradeType3Choice tradeTransactionType) {
		this.tradeTransactionType = tradeTransactionType;
	}

	@XmlElement(name = "TradTxCond")
	public List<TradeTransactionCondition4Choice> getTradeTransactionCondition() {
		return tradeTransactionCondition;
	}

	public void setTradeTransactionCondition(List<TradeTransactionCondition4Choice> tradeTransactionCondition) {
		this.tradeTransactionCondition = tradeTransactionCondition;
	}

	@XmlElement(name = "PreAdvc")
	public YesNoIndicator getPreAdvice() {
		return preAdvice;
	}

	public void setPreAdvice(YesNoIndicator preAdvice) {
		this.preAdvice = preAdvice;
	}

	@XmlElement(name = "PlcOfTrad")
	public MarketIdentification77 getPlaceOfTrade() {
		return placeOfTrade;
	}

	public void setPlaceOfTrade(com.tools20022.repository.msg.MarketIdentification77 placeOfTrade) {
		this.placeOfTrade = placeOfTrade;
	}

	@XmlElement(name = "OrdrBookgDt")
	public ISODate getOrderBookingDate() {
		return orderBookingDate;
	}

	public void setOrderBookingDate(ISODate orderBookingDate) {
		this.orderBookingDate = orderBookingDate;
	}

	@XmlElement(name = "TradOrgtnDt")
	public ISODateTime getTradeOriginationDate() {
		return tradeOriginationDate;
	}

	public void setTradeOriginationDate(ISODateTime tradeOriginationDate) {
		this.tradeOriginationDate = tradeOriginationDate;
	}

	@XmlElement(name = "TradDt", required = true)
	public TradeDate4Choice getTradeDate() {
		return tradeDate;
	}

	public void setTradeDate(TradeDate4Choice tradeDate) {
		this.tradeDate = tradeDate;
	}

	@XmlElement(name = "PrcgDt")
	public TradeDate4Choice getProcessingDate() {
		return processingDate;
	}

	public void setProcessingDate(TradeDate4Choice processingDate) {
		this.processingDate = processingDate;
	}

	@XmlElement(name = "SttlmDt", required = true)
	public SettlementDate8Choice getSettlementDate() {
		return settlementDate;
	}

	public void setSettlementDate(SettlementDate8Choice settlementDate) {
		this.settlementDate = settlementDate;
	}

	@XmlElement(name = "NAVDt")
	public DateAndDateTime1Choice getNAVDate() {
		return nAVDate;
	}

	public void setNAVDate(DateAndDateTime1Choice nAVDate) {
		this.nAVDate = nAVDate;
	}

	@XmlElement(name = "PrtlFillDtls")
	public List<PartialFill1> getPartialFillDetails() {
		return partialFillDetails;
	}

	public void setPartialFillDetails(List<com.tools20022.repository.msg.PartialFill1> partialFillDetails) {
		this.partialFillDetails = partialFillDetails;
	}

	@XmlElement(name = "ConfQty", required = true)
	public Quantity6Choice getConfirmationQuantity() {
		return confirmationQuantity;
	}

	public void setConfirmationQuantity(Quantity6Choice confirmationQuantity) {
		this.confirmationQuantity = confirmationQuantity;
	}

	@XmlElement(name = "QtyBrkdwn")
	public List<QuantityBreakdown11> getQuantityBreakdown() {
		return quantityBreakdown;
	}

	public void setQuantityBreakdown(List<com.tools20022.repository.msg.QuantityBreakdown11> quantityBreakdown) {
		this.quantityBreakdown = quantityBreakdown;
	}

	@XmlElement(name = "GrssTradAmt")
	public AmountAndDirection29 getGrossTradeAmount() {
		return grossTradeAmount;
	}

	public void setGrossTradeAmount(com.tools20022.repository.msg.AmountAndDirection29 grossTradeAmount) {
		this.grossTradeAmount = grossTradeAmount;
	}

	@XmlElement(name = "DealPric", required = true)
	public Price4 getDealPrice() {
		return dealPrice;
	}

	public void setDealPrice(com.tools20022.repository.msg.Price4 dealPrice) {
		this.dealPrice = dealPrice;
	}

	@XmlElement(name = "TpOfPric")
	public TypeOfPrice10Choice getTypeOfPrice() {
		return typeOfPrice;
	}

	public void setTypeOfPrice(TypeOfPrice10Choice typeOfPrice) {
		this.typeOfPrice = typeOfPrice;
	}

	@XmlElement(name = "CshMrgn")
	public CashMarginOrder1Code getCashMargin() {
		return cashMargin;
	}

	public void setCashMargin(CashMarginOrder1Code cashMargin) {
		this.cashMargin = cashMargin;
	}

	@XmlElement(name = "Comssn")
	public Commission16 getCommission() {
		return commission;
	}

	public void setCommission(com.tools20022.repository.msg.Commission16 commission) {
		this.commission = commission;
	}

	@XmlElement(name = "NbOfDaysAcrd")
	public Max3Number getNumberOfDaysAccrued() {
		return numberOfDaysAccrued;
	}

	public void setNumberOfDaysAccrued(Max3Number numberOfDaysAccrued) {
		this.numberOfDaysAccrued = numberOfDaysAccrued;
	}

	@XmlElement(name = "GvUpNbOfDays")
	public Max3Number getGiveUpNumberOfDays() {
		return giveUpNumberOfDays;
	}

	public void setGiveUpNumberOfDays(Max3Number giveUpNumberOfDays) {
		this.giveUpNumberOfDays = giveUpNumberOfDays;
	}

	@XmlElement(name = "IntrstTp")
	public InterestType2Code getInterestType() {
		return interestType;
	}

	public void setInterestType(InterestType2Code interestType) {
		this.interestType = interestType;
	}

	@XmlElement(name = "AcrdIntrstAmt")
	public AmountAndDirection29 getAccruedInterestAmount() {
		return accruedInterestAmount;
	}

	public void setAccruedInterestAmount(com.tools20022.repository.msg.AmountAndDirection29 accruedInterestAmount) {
		this.accruedInterestAmount = accruedInterestAmount;
	}

	@XmlElement(name = "AcrdIntrstPctg")
	public PercentageRate getAccruedInterestPercentage() {
		return accruedInterestPercentage;
	}

	public void setAccruedInterestPercentage(PercentageRate accruedInterestPercentage) {
		this.accruedInterestPercentage = accruedInterestPercentage;
	}

	@XmlElement(name = "TradRgltryCondsTp")
	public TradeRegulatoryConditions1Code getTradeRegulatoryConditionsType() {
		return tradeRegulatoryConditionsType;
	}

	public void setTradeRegulatoryConditionsType(TradeRegulatoryConditions1Code tradeRegulatoryConditionsType) {
		this.tradeRegulatoryConditionsType = tradeRegulatoryConditionsType;
	}

	@XmlElement(name = "CcyToBuyOrSell")
	public CurrencyToBuyOrSell1Choice getCurrencyToBuyOrSell() {
		return currencyToBuyOrSell;
	}

	public void setCurrencyToBuyOrSell(CurrencyToBuyOrSell1Choice currencyToBuyOrSell) {
		this.currencyToBuyOrSell = currencyToBuyOrSell;
	}

	@XmlElement(name = "OrdrOrgtrElgblty")
	public Eligibility1Code getOrderOriginatorEligibility() {
		return orderOriginatorEligibility;
	}

	public void setOrderOriginatorEligibility(Eligibility1Code orderOriginatorEligibility) {
		this.orderOriginatorEligibility = orderOriginatorEligibility;
	}

	@XmlElement(name = "PosFct")
	public PositionEffect2Code getPositionEffect() {
		return positionEffect;
	}

	public void setPositionEffect(PositionEffect2Code positionEffect) {
		this.positionEffect = positionEffect;
	}

	@XmlElement(name = "DerivCvrd")
	public YesNoIndicator getDerivativeCovered() {
		return derivativeCovered;
	}

	public void setDerivativeCovered(YesNoIndicator derivativeCovered) {
		this.derivativeCovered = derivativeCovered;
	}

	@XmlElement(name = "ChrgTaxBsisTp")
	public ChargeTaxBasisType1Choice getChargeTaxBasisType() {
		return chargeTaxBasisType;
	}

	public void setChargeTaxBasisType(ChargeTaxBasisType1Choice chargeTaxBasisType) {
		this.chargeTaxBasisType = chargeTaxBasisType;
	}

	@XmlElement(name = "CptlGnTp")
	public EUCapitalGainType2Choice getCapitalGainType() {
		return capitalGainType;
	}

	public void setCapitalGainType(EUCapitalGainType2Choice capitalGainType) {
		this.capitalGainType = capitalGainType;
	}

	@XmlElement(name = "MtchSts")
	public MatchingStatus8Choice getMatchStatus() {
		return matchStatus;
	}

	public void setMatchStatus(MatchingStatus8Choice matchStatus) {
		this.matchStatus = matchStatus;
	}

	@XmlElement(name = "CallInTp")
	public CallIn1Code getCallInType() {
		return callInType;
	}

	public void setCallInType(CallIn1Code callInType) {
		this.callInType = callInType;
	}

	@XmlElement(name = "YldTp")
	public YieldCalculation2 getYieldType() {
		return yieldType;
	}

	public void setYieldType(com.tools20022.repository.msg.YieldCalculation2 yieldType) {
		this.yieldType = yieldType;
	}

	@XmlElement(name = "Rptg")
	public List<Reporting5Choice> getReporting() {
		return reporting;
	}

	public void setReporting(List<Reporting5Choice> reporting) {
		this.reporting = reporting;
	}

	@XmlElement(name = "AddtlPhysOrRegnDtls")
	public RegistrationParameters3 getAdditionalPhysicalOrRegistrationDetails() {
		return additionalPhysicalOrRegistrationDetails;
	}

	public void setAdditionalPhysicalOrRegistrationDetails(com.tools20022.repository.msg.RegistrationParameters3 additionalPhysicalOrRegistrationDetails) {
		this.additionalPhysicalOrRegistrationDetails = additionalPhysicalOrRegistrationDetails;
	}

	@XmlElement(name = "AddtlTradInstrPrcgInf")
	public Max350Text getAdditionalTradeInstructionProcessingInformation() {
		return additionalTradeInstructionProcessingInformation;
	}

	public void setAdditionalTradeInstructionProcessingInformation(Max350Text additionalTradeInstructionProcessingInformation) {
		this.additionalTradeInstructionProcessingInformation = additionalTradeInstructionProcessingInformation;
	}
}