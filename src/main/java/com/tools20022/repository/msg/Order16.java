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
import com.tools20022.repository.area.setr.SecuritiesTradeConfirmationStatusAdviceV01;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
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
 * <li>{@linkplain com.tools20022.repository.msg.Order16#mmBusinessProcessType
 * Order16.mmBusinessProcessType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order16#mmOrderIdentification
 * Order16.mmOrderIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Order16#mmClientOrderIdentification
 * Order16.mmClientOrderIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Order16#mmSecondaryClientOrderIdentification
 * Order16.mmSecondaryClientOrderIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order16#mmListIdentification
 * Order16.mmListIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Order16#mmFinancialInstrumentIdentification
 * Order16.mmFinancialInstrumentIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order16#mmSide Order16.mmSide}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order16#mmPayment
 * Order16.mmPayment}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order16#mmTradeTransactionType
 * Order16.mmTradeTransactionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Order16#mmTradeTransactionCondition
 * Order16.mmTradeTransactionCondition}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order16#mmPreAdvice
 * Order16.mmPreAdvice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order16#mmPlaceOfTrade
 * Order16.mmPlaceOfTrade}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order16#mmOrderBookingDate
 * Order16.mmOrderBookingDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order16#mmTradeOriginationDate
 * Order16.mmTradeOriginationDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order16#mmTradeDate
 * Order16.mmTradeDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order16#mmProcessingDate
 * Order16.mmProcessingDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order16#mmSettlementDate
 * Order16.mmSettlementDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order16#mmNAVDate
 * Order16.mmNAVDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order16#mmPartialFillDetails
 * Order16.mmPartialFillDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order16#mmConfirmationQuantity
 * Order16.mmConfirmationQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order16#mmQuantityBreakdown
 * Order16.mmQuantityBreakdown}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order16#mmGrossTradeAmount
 * Order16.mmGrossTradeAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order16#mmDealPrice
 * Order16.mmDealPrice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order16#mmTypeOfPrice
 * Order16.mmTypeOfPrice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order16#mmCashMargin
 * Order16.mmCashMargin}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order16#mmCommission
 * Order16.mmCommission}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order16#mmNumberOfDaysAccrued
 * Order16.mmNumberOfDaysAccrued}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order16#mmGiveUpNumberOfDays
 * Order16.mmGiveUpNumberOfDays}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order16#mmInterestType
 * Order16.mmInterestType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Order16#mmAccruedInterestPercentage
 * Order16.mmAccruedInterestPercentage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Order16#mmTradeRegulatoryConditionsType
 * Order16.mmTradeRegulatoryConditionsType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order16#mmCurrencyToBuyOrSell
 * Order16.mmCurrencyToBuyOrSell}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Order16#mmOrderOriginatorEligibility
 * Order16.mmOrderOriginatorEligibility}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order16#mmPositionEffect
 * Order16.mmPositionEffect}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order16#mmDerivativeCovered
 * Order16.mmDerivativeCovered}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order16#mmChargeTaxBasisType
 * Order16.mmChargeTaxBasisType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order16#mmCapitalGainType
 * Order16.mmCapitalGainType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order16#mmMatchStatus
 * Order16.mmMatchStatus}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order16#mmCallInType
 * Order16.mmCallInType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order16#mmYieldType
 * Order16.mmYieldType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order16#mmReporting
 * Order16.mmReporting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Order16#mmAdditionalPhysicalOrRegistrationDetails
 * Order16.mmAdditionalPhysicalOrRegistrationDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Order16#mmAdditionalTradeInstructionProcessingInformation
 * Order16.mmAdditionalTradeInstructionProcessingInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Order16#mmAccruedInterestAmount
 * Order16.mmAccruedInterestAmount}</li>
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
 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationStatusAdviceV01#mmPartyTradingDetails
 * SecuritiesTradeConfirmationStatusAdviceV01.mmPartyTradingDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationStatusAdviceV01#mmCounterpartyTradingDetails
 * SecuritiesTradeConfirmationStatusAdviceV01.mmCounterpartyTradingDetails}</li>
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
 * {@linkplain com.tools20022.repository.constraints.ConstraintCurrencyToBuyOrSellRule#forOrder16
 * ConstraintCurrencyToBuyOrSellRule.forOrder16}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintPlaceOfTradeRule#forOrder16
 * ConstraintPlaceOfTradeRule.forOrder16}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintTradeDateTimeUTCRule#forOrder16
 * ConstraintTradeDateTimeUTCRule.forOrder16}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Order16"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Intention to transfer an ownership of a financial instrument."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Order18 Order18}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Order16", propOrder = {"businessProcessType", "orderIdentification", "clientOrderIdentification", "secondaryClientOrderIdentification", "listIdentification", "financialInstrumentIdentification", "side", "payment",
		"tradeTransactionType", "tradeTransactionCondition", "preAdvice", "placeOfTrade", "orderBookingDate", "tradeOriginationDate", "tradeDate", "processingDate", "settlementDate", "nAVDate", "partialFillDetails", "confirmationQuantity",
		"quantityBreakdown", "grossTradeAmount", "dealPrice", "typeOfPrice", "cashMargin", "commission", "numberOfDaysAccrued", "giveUpNumberOfDays", "interestType", "accruedInterestPercentage", "tradeRegulatoryConditionsType",
		"currencyToBuyOrSell", "orderOriginatorEligibility", "positionEffect", "derivativeCovered", "chargeTaxBasisType", "capitalGainType", "matchStatus", "callInType", "yieldType", "reporting", "additionalPhysicalOrRegistrationDetails",
		"additionalTradeInstructionProcessingInformation", "accruedInterestAmount"})
public class Order16 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "BizPrcTp")
	protected BusinessProcessType1Choice businessProcessType;
	/**
	 * 
	 <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order16
	 * Order16}</li>
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
	 * {@linkplain com.tools20022.repository.msg.Order18#mmBusinessProcessType
	 * Order18.mmBusinessProcessType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Order16, Optional<BusinessProcessType1Choice>> mmBusinessProcessType = new MMMessageAttribute<Order16, Optional<BusinessProcessType1Choice>>() {
		{
			businessComponentTrace_lazy = () -> SecuritiesOrder.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.Order16.mmObject();
			isDerived = false;
			xmlTag = "BizPrcTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BusinessProcessType";
			definition = "Specifies the type of business process.";
			nextVersions_lazy = () -> Arrays.asList(Order18.mmBusinessProcessType);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> BusinessProcessType1Choice.mmObject();
		}

		@Override
		public Optional<BusinessProcessType1Choice> getValue(Order16 obj) {
			return obj.getBusinessProcessType();
		}

		@Override
		public void setValue(Order16 obj, Optional<BusinessProcessType1Choice> value) {
			obj.setBusinessProcessType(value.orElse(null));
		}
	};
	@XmlElement(name = "OrdrId")
	protected List<Max35Text> orderIdentification;
	/**
	 * 
	 <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order16
	 * Order16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrdrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 37</li>
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
	 * {@linkplain com.tools20022.repository.msg.Order18#mmOrderIdentification
	 * Order18.mmOrderIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Order16, List<Max35Text>> mmOrderIdentification = new MMMessageAttribute<Order16, List<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.Order16.mmObject();
			isDerived = false;
			xmlTag = "OrdrId";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "37"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderIdentification";
			definition = "Unique identifier for Order as assigned by sell-side.";
			nextVersions_lazy = () -> Arrays.asList(Order18.mmOrderIdentification);
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public List<Max35Text> getValue(Order16 obj) {
			return obj.getOrderIdentification();
		}

		@Override
		public void setValue(Order16 obj, List<Max35Text> value) {
			obj.setOrderIdentification(value);
		}
	};
	@XmlElement(name = "ClntOrdrId")
	protected List<Max35Text> clientOrderIdentification;
	/**
	 * 
	 <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order16
	 * Order16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClntOrdrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 11</li>
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
	 * {@linkplain com.tools20022.repository.msg.Order18#mmClientOrderIdentification
	 * Order18.mmClientOrderIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Order16, List<Max35Text>> mmClientOrderIdentification = new MMMessageAttribute<Order16, List<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmClientOrderIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.Order16.mmObject();
			isDerived = false;
			xmlTag = "ClntOrdrId";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "11"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClientOrderIdentification";
			definition = "Unique identifier for the order as assigned by the buy-side. Uniqueness must be guaranteed within a single trading day. Firms, particularly those that electronically submit multi-day orders, trade globally or throughout market close periods, should ensure uniqueness across days, for example by embedding a date within the ClientOrderIdentification element.";
			nextVersions_lazy = () -> Arrays.asList(Order18.mmClientOrderIdentification);
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public List<Max35Text> getValue(Order16 obj) {
			return obj.getClientOrderIdentification();
		}

		@Override
		public void setValue(Order16 obj, List<Max35Text> value) {
			obj.setClientOrderIdentification(value);
		}
	};
	@XmlElement(name = "ScndryClntOrdrId")
	protected List<Max35Text> secondaryClientOrderIdentification;
	/**
	 * 
	 <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order16
	 * Order16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ScndryClntOrdrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 526</li>
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
	 * {@linkplain com.tools20022.repository.msg.Order18#mmSecondaryClientOrderIdentification
	 * Order18.mmSecondaryClientOrderIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Order16, List<Max35Text>> mmSecondaryClientOrderIdentification = new MMMessageAttribute<Order16, List<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmClientOrderIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.Order16.mmObject();
			isDerived = false;
			xmlTag = "ScndryClntOrdrId";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "526"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecondaryClientOrderIdentification";
			definition = "Assigned by the party that originates the order. Can be used to provide the ClientOrderIdentification used by an exchange or executing system.";
			nextVersions_lazy = () -> Arrays.asList(Order18.mmSecondaryClientOrderIdentification);
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public List<Max35Text> getValue(Order16 obj) {
			return obj.getSecondaryClientOrderIdentification();
		}

		@Override
		public void setValue(Order16 obj, List<Max35Text> value) {
			obj.setSecondaryClientOrderIdentification(value);
		}
	};
	@XmlElement(name = "ListId")
	protected List<Max35Text> listIdentification;
	/**
	 * 
	 <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order16
	 * Order16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ListId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :20C::LIST</li>
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
	 * {@linkplain com.tools20022.repository.msg.Order18#mmListIdentification
	 * Order18.mmListIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Order16, List<Max35Text>> mmListIdentification = new MMMessageAttribute<Order16, List<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> ListTrading.mmListIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.Order16.mmObject();
			isDerived = false;
			xmlTag = "ListId";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":20C::LIST"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ListIdentification";
			definition = "Unique identifier for a list, as assigned by the trading party. The identifier must be unique within a single trading day.";
			nextVersions_lazy = () -> Arrays.asList(Order18.mmListIdentification);
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public List<Max35Text> getValue(Order16 obj) {
			return obj.getListIdentification();
		}

		@Override
		public void setValue(Order16 obj, List<Max35Text> value) {
			obj.setListIdentification(value);
		}
	};
	@XmlElement(name = "FinInstrmId", required = true)
	protected SecurityIdentification14 financialInstrumentIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification14
	 * SecurityIdentification14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmIdentification
	 * Security.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order16
	 * Order16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinInstrmId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier of a financial instrument, assigned under a formal or proprietary identification scheme."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order18#mmFinancialInstrumentIdentification
	 * Order18.mmFinancialInstrumentIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Order16, SecurityIdentification14> mmFinancialInstrumentIdentification = new MMMessageAssociationEnd<Order16, SecurityIdentification14>() {
		{
			businessElementTrace_lazy = () -> Security.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.Order16.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentification";
			definition = "Unique and unambiguous identifier of a financial instrument, assigned under a formal or proprietary identification scheme.";
			nextVersions_lazy = () -> Arrays.asList(Order18.mmFinancialInstrumentIdentification);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SecurityIdentification14.mmObject();
		}

		@Override
		public SecurityIdentification14 getValue(Order16 obj) {
			return obj.getFinancialInstrumentIdentification();
		}

		@Override
		public void setValue(Order16 obj, SecurityIdentification14 value) {
			obj.setFinancialInstrumentIdentification(value);
		}
	};
	@XmlElement(name = "Sd", required = true)
	protected Side3Code side;
	/**
	 * 
	 <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order16
	 * Order16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 54</li>
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
	 * <li>{@linkplain com.tools20022.repository.msg.Order18#mmSide
	 * Order18.mmSide}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Order16, Side3Code> mmSide = new MMMessageAttribute<Order16, Side3Code>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmSide;
			componentContext_lazy = () -> com.tools20022.repository.msg.Order16.mmObject();
			isDerived = false;
			xmlTag = "Sd";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "54"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Side";
			definition = "Coded list to specify the side of the order.";
			nextVersions_lazy = () -> Arrays.asList(Order18.mmSide);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Side3Code.mmObject();
		}

		@Override
		public Side3Code getValue(Order16 obj) {
			return obj.getSide();
		}

		@Override
		public void setValue(Order16 obj, Side3Code value) {
			obj.setSide(value);
		}
	};
	@XmlElement(name = "Pmt")
	protected DeliveryReceiptType2Code payment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DeliveryReceiptType2Code
	 * DeliveryReceiptType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order16
	 * Order16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Pmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22H::PAYM, ISO15022Synonym: MT
	 * 541-543 or 540-542</li>
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
	 * <li>{@linkplain com.tools20022.repository.msg.Order18#mmPayment
	 * Order18.mmPayment}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Order16, Optional<DeliveryReceiptType2Code>> mmPayment = new MMMessageAttribute<Order16, Optional<DeliveryReceiptType2Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Order16.mmObject();
			isDerived = false;
			xmlTag = "Pmt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22H::PAYM"), new ISO15022Synonym(this, "MT 541-543 or 540-542"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Payment";
			definition = "Specifies how the transaction is to be settled, for example, against payment.";
			nextVersions_lazy = () -> Arrays.asList(Order18.mmPayment);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DeliveryReceiptType2Code.mmObject();
		}

		@Override
		public Optional<DeliveryReceiptType2Code> getValue(Order16 obj) {
			return obj.getPayment();
		}

		@Override
		public void setValue(Order16 obj, Optional<DeliveryReceiptType2Code> value) {
			obj.setPayment(value.orElse(null));
		}
	};
	@XmlElement(name = "TradTxTp")
	protected TradeType3Choice tradeTransactionType;
	/**
	 * 
	 <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order16
	 * Order16}</li>
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
	 * {@linkplain com.tools20022.repository.msg.Order18#mmTradeTransactionType
	 * Order18.mmTradeTransactionType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Order16, Optional<TradeType3Choice>> mmTradeTransactionType = new MMMessageAttribute<Order16, Optional<TradeType3Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTrade.mmTransactionType;
			componentContext_lazy = () -> com.tools20022.repository.msg.Order16.mmObject();
			isDerived = false;
			xmlTag = "TradTxTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeTransactionType";
			definition = "Specifies the type of transaction of which the order is a component.";
			nextVersions_lazy = () -> Arrays.asList(Order18.mmTradeTransactionType);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> TradeType3Choice.mmObject();
		}

		@Override
		public Optional<TradeType3Choice> getValue(Order16 obj) {
			return obj.getTradeTransactionType();
		}

		@Override
		public void setValue(Order16 obj, Optional<TradeType3Choice> value) {
			obj.setTradeTransactionType(value.orElse(null));
		}
	};
	@XmlElement(name = "TradTxCond")
	protected List<TradeTransactionCondition4Choice> tradeTransactionCondition;
	/**
	 * 
	 <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order16
	 * Order16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradTxCond"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::TTCO</li>
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
	 * {@linkplain com.tools20022.repository.msg.Order18#mmTradeTransactionCondition
	 * Order18.mmTradeTransactionCondition}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Order16, List<TradeTransactionCondition4Choice>> mmTradeTransactionCondition = new MMMessageAttribute<Order16, List<TradeTransactionCondition4Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTrade.mmTradeTransactionCondition;
			componentContext_lazy = () -> com.tools20022.repository.msg.Order16.mmObject();
			isDerived = false;
			xmlTag = "TradTxCond";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::TTCO"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeTransactionCondition";
			definition = "Indicates the conditions under which the order/trade is to be/was executed.";
			nextVersions_lazy = () -> Arrays.asList(Order18.mmTradeTransactionCondition);
			minOccurs = 0;
			complexType_lazy = () -> TradeTransactionCondition4Choice.mmObject();
		}

		@Override
		public List<TradeTransactionCondition4Choice> getValue(Order16 obj) {
			return obj.getTradeTransactionCondition();
		}

		@Override
		public void setValue(Order16 obj, List<TradeTransactionCondition4Choice> value) {
			obj.setTradeTransactionCondition(value);
		}
	};
	@XmlElement(name = "PreAdvc")
	protected YesNoIndicator preAdvice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order16
	 * Order16}</li>
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
	 * <li>{@linkplain com.tools20022.repository.msg.Order18#mmPreAdvice
	 * Order18.mmPreAdvice}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Order16, Optional<YesNoIndicator>> mmPreAdvice = new MMMessageAttribute<Order16, Optional<YesNoIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Order16.mmObject();
			isDerived = false;
			xmlTag = "PreAdvc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreAdvice";
			definition = "Transaction is a pre-advice, that is, for matching purposes only.";
			nextVersions_lazy = () -> Arrays.asList(Order18.mmPreAdvice);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(Order16 obj) {
			return obj.getPreAdvice();
		}

		@Override
		public void setValue(Order16 obj, Optional<YesNoIndicator> value) {
			obj.setPreAdvice(value.orElse(null));
		}
	};
	@XmlElement(name = "PlcOfTrad")
	protected MarketIdentification77 placeOfTrade;
	/**
	 * 
	 <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order16
	 * Order16}</li>
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
	 * <li>{@linkplain com.tools20022.repository.msg.Order18#mmPlaceOfTrade
	 * Order18.mmPlaceOfTrade}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Order16, Optional<MarketIdentification77>> mmPlaceOfTrade = new MMMessageAttribute<Order16, Optional<MarketIdentification77>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmPlaceOfTrade;
			componentContext_lazy = () -> com.tools20022.repository.msg.Order16.mmObject();
			isDerived = false;
			xmlTag = "PlcOfTrad";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfTrade";
			definition = "Market in which a trade transaction is to be or has been executed.";
			nextVersions_lazy = () -> Arrays.asList(Order18.mmPlaceOfTrade);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> MarketIdentification77.mmObject();
		}

		@Override
		public Optional<MarketIdentification77> getValue(Order16 obj) {
			return obj.getPlaceOfTrade();
		}

		@Override
		public void setValue(Order16 obj, Optional<MarketIdentification77> value) {
			obj.setPlaceOfTrade(value.orElse(null));
		}
	};
	@XmlElement(name = "OrdrBookgDt")
	protected ISODate orderBookingDate;
	/**
	 * 
	 <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order16
	 * Order16}</li>
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
	 * <li>{@linkplain com.tools20022.repository.msg.Order18#mmOrderBookingDate
	 * Order18.mmOrderBookingDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Order16, Optional<ISODate>> mmOrderBookingDate = new MMMessageAttribute<Order16, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmOrderDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.Order16.mmObject();
			isDerived = false;
			xmlTag = "OrdrBookgDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderBookingDate";
			definition = "Date and time when an entry is posted to an account on the account servicer's books.";
			nextVersions_lazy = () -> Arrays.asList(Order18.mmOrderBookingDate);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(Order16 obj) {
			return obj.getOrderBookingDate();
		}

		@Override
		public void setValue(Order16 obj, Optional<ISODate> value) {
			obj.setOrderBookingDate(value.orElse(null));
		}
	};
	@XmlElement(name = "TradOrgtnDt")
	protected ISODateTime tradeOriginationDate;
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmTradeOriginationDate
	 * SecuritiesTrade.mmTradeOriginationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order16
	 * Order16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradOrgtnDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 229</li>
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
	 * {@linkplain com.tools20022.repository.msg.Order18#mmTradeOriginationDate
	 * Order18.mmTradeOriginationDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Order16, Optional<ISODateTime>> mmTradeOriginationDate = new MMMessageAttribute<Order16, Optional<ISODateTime>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTrade.mmTradeOriginationDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.Order16.mmObject();
			isDerived = false;
			xmlTag = "TradOrgtnDt";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "229"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeOriginationDate";
			definition = "Indicates the date and time of the agreement in principal between counter-parties prior to actual trade date.\nUsed with fixed income for municipal new issue markets.";
			nextVersions_lazy = () -> Arrays.asList(Order18.mmTradeOriginationDate);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public Optional<ISODateTime> getValue(Order16 obj) {
			return obj.getTradeOriginationDate();
		}

		@Override
		public void setValue(Order16 obj, Optional<ISODateTime> value) {
			obj.setTradeOriginationDate(value.orElse(null));
		}
	};
	@XmlElement(name = "TradDt", required = true)
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order16
	 * Order16}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Order18#mmTradeDate
	 * Order18.mmTradeDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Order16, TradeDate4Choice> mmTradeDate = new MMMessageAttribute<Order16, TradeDate4Choice>() {
		{
			businessElementTrace_lazy = () -> Trade.mmTradeDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.Order16.mmObject();
			isDerived = false;
			xmlTag = "TradDt";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "75"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDate";
			definition = "Specifies the date/time on which the trade was executed.";
			nextVersions_lazy = () -> Arrays.asList(Order18.mmTradeDate);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> TradeDate4Choice.mmObject();
		}

		@Override
		public TradeDate4Choice getValue(Order16 obj) {
			return obj.getTradeDate();
		}

		@Override
		public void setValue(Order16 obj, TradeDate4Choice value) {
			obj.setTradeDate(value);
		}
	};
	@XmlElement(name = "PrcgDt")
	protected TradeDate4Choice processingDate;
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
	 * {@linkplain com.tools20022.repository.entity.Trade#mmStartDate
	 * Trade.mmStartDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order16
	 * Order16}</li>
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
	 * <li>{@linkplain com.tools20022.repository.msg.Order18#mmProcessingDate
	 * Order18.mmProcessingDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Order16, Optional<TradeDate4Choice>> mmProcessingDate = new MMMessageAttribute<Order16, Optional<TradeDate4Choice>>() {
		{
			businessElementTrace_lazy = () -> Trade.mmStartDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.Order16.mmObject();
			isDerived = false;
			xmlTag = "PrcgDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessingDate";
			definition = "Processing date of the trading session.";
			nextVersions_lazy = () -> Arrays.asList(Order18.mmProcessingDate);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> TradeDate4Choice.mmObject();
		}

		@Override
		public Optional<TradeDate4Choice> getValue(Order16 obj) {
			return obj.getProcessingDate();
		}

		@Override
		public void setValue(Order16 obj, Optional<TradeDate4Choice> value) {
			obj.setProcessingDate(value.orElse(null));
		}
	};
	@XmlElement(name = "SttlmDt", required = true)
	protected SettlementDate8Choice settlementDate;
	/**
	 * 
	 <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order16
	 * Order16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98a::SETT</li>
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
	 * <li>{@linkplain com.tools20022.repository.msg.Order18#mmSettlementDate
	 * Order18.mmSettlementDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Order16, SettlementDate8Choice> mmSettlementDate = new MMMessageAttribute<Order16, SettlementDate8Choice>() {
		{
			businessElementTrace_lazy = () -> Obligation.mmRequestedSettlementDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.Order16.mmObject();
			isDerived = false;
			xmlTag = "SttlmDt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::SETT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDate";
			definition = "Date and time at which the securities are to be delivered or received.";
			nextVersions_lazy = () -> Arrays.asList(Order18.mmSettlementDate);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SettlementDate8Choice.mmObject();
		}

		@Override
		public SettlementDate8Choice getValue(Order16 obj) {
			return obj.getSettlementDate();
		}

		@Override
		public void setValue(Order16 obj, SettlementDate8Choice value) {
			obj.setSettlementDate(value);
		}
	};
	@XmlElement(name = "NAVDt")
	protected DateAndDateTime1Choice nAVDate;
	/**
	 * 
	 <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order16
	 * Order16}</li>
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
	 * <li>{@linkplain com.tools20022.repository.msg.Order18#mmNAVDate
	 * Order18.mmNAVDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Order16, Optional<DateAndDateTime1Choice>> mmNAVDate = new MMMessageAttribute<Order16, Optional<DateAndDateTime1Choice>>() {
		{
			businessElementTrace_lazy = () -> NetAssetValueCalculation.mmValuationDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.Order16.mmObject();
			isDerived = false;
			xmlTag = "NAVDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NAVDate";
			definition = "Valuation point, or valuation date of the portfolio (underlying assets). This is also known as price date.";
			nextVersions_lazy = () -> Arrays.asList(Order18.mmNAVDate);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateAndDateTime1Choice.mmObject();
		}

		@Override
		public Optional<DateAndDateTime1Choice> getValue(Order16 obj) {
			return obj.getNAVDate();
		}

		@Override
		public void setValue(Order16 obj, Optional<DateAndDateTime1Choice> value) {
			obj.setNAVDate(value.orElse(null));
		}
	};
	@XmlElement(name = "PrtlFillDtls")
	protected List<PartialFill1> partialFillDetails;
	/**
	 * 
	 <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order16
	 * Order16}</li>
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
	 * {@linkplain com.tools20022.repository.msg.Order18#mmPartialFillDetails
	 * Order18.mmPartialFillDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Order16, List<PartialFill1>> mmPartialFillDetails = new MMMessageAssociationEnd<Order16, List<PartialFill1>>() {
		{
			businessComponentTrace_lazy = () -> SecuritiesOrder.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.Order16.mmObject();
			isDerived = false;
			xmlTag = "PrtlFillDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialFillDetails";
			definition = "Quantity of financial instrument bought or sold which is less than the quantity of financial instrument ordered.";
			nextVersions_lazy = () -> Arrays.asList(Order18.mmPartialFillDetails);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartialFill1.mmObject();
		}

		@Override
		public List<PartialFill1> getValue(Order16 obj) {
			return obj.getPartialFillDetails();
		}

		@Override
		public void setValue(Order16 obj, List<PartialFill1> value) {
			obj.setPartialFillDetails(value);
		}
	};
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order16
	 * Order16}</li>
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
	 * {@linkplain com.tools20022.repository.msg.Order18#mmConfirmationQuantity
	 * Order18.mmConfirmationQuantity}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Order16, Quantity6Choice> mmConfirmationQuantity = new MMMessageAttribute<Order16, Quantity6Choice>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmOrderedQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.Order16.mmObject();
			isDerived = false;
			xmlTag = "ConfQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConfirmationQuantity";
			definition = "Quantity of financial instrument that is being confirmed for the account.The quantity of the security to be settled.";
			nextVersions_lazy = () -> Arrays.asList(Order18.mmConfirmationQuantity);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Quantity6Choice.mmObject();
		}

		@Override
		public Quantity6Choice getValue(Order16 obj) {
			return obj.getConfirmationQuantity();
		}

		@Override
		public void setValue(Order16 obj, Quantity6Choice value) {
			obj.setConfirmationQuantity(value);
		}
	};
	@XmlElement(name = "QtyBrkdwn")
	protected List<QuantityBreakdown11> quantityBreakdown;
	/**
	 * 
	 <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order16
	 * Order16}</li>
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
	 * {@linkplain com.tools20022.repository.msg.Order18#mmQuantityBreakdown
	 * Order18.mmQuantityBreakdown}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Order16, List<QuantityBreakdown11>> mmQuantityBreakdown = new MMMessageAttribute<Order16, List<QuantityBreakdown11>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesQuantity.mmLotBreakdown;
			componentContext_lazy = () -> com.tools20022.repository.msg.Order16.mmObject();
			isDerived = false;
			xmlTag = "QtyBrkdwn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuantityBreakdown";
			definition = "Breakdown of a quantity into lots such as tax lots, instrument series, etc.";
			nextVersions_lazy = () -> Arrays.asList(Order18.mmQuantityBreakdown);
			minOccurs = 0;
			complexType_lazy = () -> QuantityBreakdown11.mmObject();
		}

		@Override
		public List<QuantityBreakdown11> getValue(Order16 obj) {
			return obj.getQuantityBreakdown();
		}

		@Override
		public void setValue(Order16 obj, List<QuantityBreakdown11> value) {
			obj.setQuantityBreakdown(value);
		}
	};
	@XmlElement(name = "GrssTradAmt")
	protected AmountAndDirection29 grossTradeAmount;
	/**
	 * 
	 <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order16
	 * Order16}</li>
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
	 * <li>{@linkplain com.tools20022.repository.msg.Order18#mmGrossTradeAmount
	 * Order18.mmGrossTradeAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Order16, Optional<AmountAndDirection29>> mmGrossTradeAmount = new MMMessageAttribute<Order16, Optional<AmountAndDirection29>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmOrderedAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.Order16.mmObject();
			isDerived = false;
			xmlTag = "GrssTradAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossTradeAmount";
			definition = "Principal amount of a trade (price multiplied by quantity).";
			nextVersions_lazy = () -> Arrays.asList(Order18.mmGrossTradeAmount);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AmountAndDirection29.mmObject();
		}

		@Override
		public Optional<AmountAndDirection29> getValue(Order16 obj) {
			return obj.getGrossTradeAmount();
		}

		@Override
		public void setValue(Order16 obj, Optional<AmountAndDirection29> value) {
			obj.setGrossTradeAmount(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmPrice
	 * SecuritiesPricing.mmPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order16
	 * Order16}</li>
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
	 * <li>{@linkplain com.tools20022.repository.msg.Order18#mmDealPrice
	 * Order18.mmDealPrice}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Order16, Price4> mmDealPrice = new MMMessageAttribute<Order16, Price4>() {
		{
			businessElementTrace_lazy = () -> SecuritiesPricing.mmPrice;
			componentContext_lazy = () -> com.tools20022.repository.msg.Order16.mmObject();
			isDerived = false;
			xmlTag = "DealPric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DealPrice";
			definition = "Amount of money for which goods or services are offered, sold, or bought.";
			nextVersions_lazy = () -> Arrays.asList(Order18.mmDealPrice);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Price4.mmObject();
		}

		@Override
		public Price4 getValue(Order16 obj) {
			return obj.getDealPrice();
		}

		@Override
		public void setValue(Order16 obj, Price4 value) {
			obj.setDealPrice(value);
		}
	};
	@XmlElement(name = "TpOfPric")
	protected TypeOfPrice10Choice typeOfPrice;
	/**
	 * 
	 <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order16
	 * Order16}</li>
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
	 * <li>{@linkplain com.tools20022.repository.msg.Order18#mmTypeOfPrice
	 * Order18.mmTypeOfPrice}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Order16, Optional<TypeOfPrice10Choice>> mmTypeOfPrice = new MMMessageAttribute<Order16, Optional<TypeOfPrice10Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesPricing.mmPriceType;
			componentContext_lazy = () -> com.tools20022.repository.msg.Order16.mmObject();
			isDerived = false;
			xmlTag = "TpOfPric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TypeOfPrice";
			definition = "Specifies the type of transaction price.";
			nextVersions_lazy = () -> Arrays.asList(Order18.mmTypeOfPrice);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> TypeOfPrice10Choice.mmObject();
		}

		@Override
		public Optional<TypeOfPrice10Choice> getValue(Order16 obj) {
			return obj.getTypeOfPrice();
		}

		@Override
		public void setValue(Order16 obj, Optional<TypeOfPrice10Choice> value) {
			obj.setTypeOfPrice(value.orElse(null));
		}
	};
	@XmlElement(name = "CshMrgn")
	protected CashMarginOrder1Code cashMargin;
	/**
	 * 
	 <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order16
	 * Order16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshMrgn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 544</li>
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
	 * <li>{@linkplain com.tools20022.repository.msg.Order18#mmCashMargin
	 * Order18.mmCashMargin}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Order16, Optional<CashMarginOrder1Code>> mmCashMargin = new MMMessageAttribute<Order16, Optional<CashMarginOrder1Code>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmCashMargin;
			componentContext_lazy = () -> com.tools20022.repository.msg.Order16.mmObject();
			isDerived = false;
			xmlTag = "CshMrgn";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "544"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashMargin";
			definition = "Identifies whether an order is a margin order or a non-margin order. This is primarily used when sending orders to Japanese exchanges to indicate sell margin or buy to cover. The same tag could be assigned also by buy-side to indicate the intent to sell or buy margin and the sell-side to accept or reject (base on some validation criteria) the margin request.";
			nextVersions_lazy = () -> Arrays.asList(Order18.mmCashMargin);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CashMarginOrder1Code.mmObject();
		}

		@Override
		public Optional<CashMarginOrder1Code> getValue(Order16 obj) {
			return obj.getCashMargin();
		}

		@Override
		public void setValue(Order16 obj, Optional<CashMarginOrder1Code> value) {
			obj.setCashMargin(value.orElse(null));
		}
	};
	@XmlElement(name = "Comssn")
	protected Commission16 commission;
	/**
	 * 
	 <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order16
	 * Order16}</li>
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
	 * <li>{@linkplain com.tools20022.repository.msg.Order18#mmCommission
	 * Order18.mmCommission}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Order16, Optional<Commission16>> mmCommission = new MMMessageAssociationEnd<Order16, Optional<Commission16>>() {
		{
			businessElementTrace_lazy = () -> Trade.mmTradeCommission;
			componentContext_lazy = () -> com.tools20022.repository.msg.Order16.mmObject();
			isDerived = false;
			xmlTag = "Comssn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Commission";
			definition = "Amount of money due to a party as compensation for a service.";
			nextVersions_lazy = () -> Arrays.asList(Order18.mmCommission);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Commission16.mmObject();
		}

		@Override
		public Optional<Commission16> getValue(Order16 obj) {
			return obj.getCommission();
		}

		@Override
		public void setValue(Order16 obj, Optional<Commission16> value) {
			obj.setCommission(value.orElse(null));
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order16
	 * Order16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NbOfDaysAcrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :99A::DAAC</li>
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
	 * {@linkplain com.tools20022.repository.msg.Order18#mmNumberOfDaysAccrued
	 * Order18.mmNumberOfDaysAccrued}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Order16, Optional<Max3Number>> mmNumberOfDaysAccrued = new MMMessageAttribute<Order16, Optional<Max3Number>>() {
		{
			businessElementTrace_lazy = () -> DateTimePeriod.mmNumberOfDays;
			componentContext_lazy = () -> com.tools20022.repository.msg.Order16.mmObject();
			isDerived = false;
			xmlTag = "NbOfDaysAcrd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":99A::DAAC"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NumberOfDaysAccrued";
			definition = "Number of days on which the interest rate accrues (daily accrual note).";
			nextVersions_lazy = () -> Arrays.asList(Order18.mmNumberOfDaysAccrued);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max3Number.mmObject();
		}

		@Override
		public Optional<Max3Number> getValue(Order16 obj) {
			return obj.getNumberOfDaysAccrued();
		}

		@Override
		public void setValue(Order16 obj, Optional<Max3Number> value) {
			obj.setNumberOfDaysAccrued(value.orElse(null));
		}
	};
	@XmlElement(name = "GvUpNbOfDays")
	protected Max3Number giveUpNumberOfDays;
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmGiveUpNumberOfDays
	 * SecuritiesOrder.mmGiveUpNumberOfDays}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order16
	 * Order16}</li>
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
	 * {@linkplain com.tools20022.repository.msg.Order18#mmGiveUpNumberOfDays
	 * Order18.mmGiveUpNumberOfDays}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Order16, Optional<Max3Number>> mmGiveUpNumberOfDays = new MMMessageAttribute<Order16, Optional<Max3Number>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmGiveUpNumberOfDays;
			componentContext_lazy = () -> com.tools20022.repository.msg.Order16.mmObject();
			isDerived = false;
			xmlTag = "GvUpNbOfDays";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GiveUpNumberOfDays";
			definition = "Specifies the number of days from trade date that the counterparty on the other side of the trade should be \"given up\" or divulged.";
			nextVersions_lazy = () -> Arrays.asList(Order18.mmGiveUpNumberOfDays);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max3Number.mmObject();
		}

		@Override
		public Optional<Max3Number> getValue(Order16 obj) {
			return obj.getGiveUpNumberOfDays();
		}

		@Override
		public void setValue(Order16 obj, Optional<Max3Number> value) {
			obj.setGiveUpNumberOfDays(value.orElse(null));
		}
	};
	@XmlElement(name = "IntrstTp")
	protected InterestType2Code interestType;
	/**
	 * 
	 <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order16
	 * Order16}</li>
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
	 * <li>{@linkplain com.tools20022.repository.msg.Order18#mmInterestType
	 * Order18.mmInterestType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Order16, Optional<InterestType2Code>> mmInterestType = new MMMessageAttribute<Order16, Optional<InterestType2Code>>() {
		{
			businessElementTrace_lazy = () -> Interest.mmTypeOfInterest;
			componentContext_lazy = () -> com.tools20022.repository.msg.Order16.mmObject();
			isDerived = false;
			xmlTag = "IntrstTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestType";
			definition = "Indicates whether the trade is cum interest or ex interest.";
			nextVersions_lazy = () -> Arrays.asList(Order18.mmInterestType);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> InterestType2Code.mmObject();
		}

		@Override
		public Optional<InterestType2Code> getValue(Order16 obj) {
			return obj.getInterestType();
		}

		@Override
		public void setValue(Order16 obj, Optional<InterestType2Code> value) {
			obj.setInterestType(value.orElse(null));
		}
	};
	@XmlElement(name = "AcrdIntrstPctg")
	protected PercentageRate accruedInterestPercentage;
	/**
	 * 
	 <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order16
	 * Order16}</li>
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
	 * {@linkplain com.tools20022.repository.msg.Order18#mmAccruedInterestPercentage
	 * Order18.mmAccruedInterestPercentage}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Order16, Optional<PercentageRate>> mmAccruedInterestPercentage = new MMMessageAttribute<Order16, Optional<PercentageRate>>() {
		{
			businessElementTrace_lazy = () -> Interest.mmRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.Order16.mmObject();
			isDerived = false;
			xmlTag = "AcrdIntrstPctg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccruedInterestPercentage";
			definition = "Interest rate that has been accrued in between coupon payment periods.";
			nextVersions_lazy = () -> Arrays.asList(Order18.mmAccruedInterestPercentage);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public Optional<PercentageRate> getValue(Order16 obj) {
			return obj.getAccruedInterestPercentage();
		}

		@Override
		public void setValue(Order16 obj, Optional<PercentageRate> value) {
			obj.setAccruedInterestPercentage(value.orElse(null));
		}
	};
	@XmlElement(name = "TradRgltryCondsTp")
	protected TradeRegulatoryConditions1Code tradeRegulatoryConditionsType;
	/**
	 * 
	 <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order16
	 * Order16}</li>
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
	 * {@linkplain com.tools20022.repository.msg.Order18#mmTradeRegulatoryConditionsType
	 * Order18.mmTradeRegulatoryConditionsType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Order16, Optional<TradeRegulatoryConditions1Code>> mmTradeRegulatoryConditionsType = new MMMessageAttribute<Order16, Optional<TradeRegulatoryConditions1Code>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmTradeRegulatoryConditionsType;
			componentContext_lazy = () -> com.tools20022.repository.msg.Order16.mmObject();
			isDerived = false;
			xmlTag = "TradRgltryCondsTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeRegulatoryConditionsType";
			definition = "Specifies the regulatory conditions type of the trade.";
			nextVersions_lazy = () -> Arrays.asList(Order18.mmTradeRegulatoryConditionsType);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TradeRegulatoryConditions1Code.mmObject();
		}

		@Override
		public Optional<TradeRegulatoryConditions1Code> getValue(Order16 obj) {
			return obj.getTradeRegulatoryConditionsType();
		}

		@Override
		public void setValue(Order16 obj, Optional<TradeRegulatoryConditions1Code> value) {
			obj.setTradeRegulatoryConditionsType(value.orElse(null));
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#mmSecuritiesSettlement
	 * SecuritiesTradeExecution.mmSecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order16
	 * Order16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CcyToBuyOrSell"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :13B::FXIB or FXIS</li>
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
	 * {@linkplain com.tools20022.repository.msg.Order18#mmCurrencyToBuyOrSell
	 * Order18.mmCurrencyToBuyOrSell}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Order16, Optional<CurrencyToBuyOrSell1Choice>> mmCurrencyToBuyOrSell = new MMMessageAttribute<Order16, Optional<CurrencyToBuyOrSell1Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeExecution.mmSecuritiesSettlement;
			componentContext_lazy = () -> com.tools20022.repository.msg.Order16.mmObject();
			isDerived = false;
			xmlTag = "CcyToBuyOrSell";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":13B::FXIB or FXIS"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyToBuyOrSell";
			definition = "Account servicer is instructed to buy the indicated currency after the receipt of cash proceeds or to sell the indicated currency in order to obtain the necessary currency to fund the transaction.";
			nextVersions_lazy = () -> Arrays.asList(Order18.mmCurrencyToBuyOrSell);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CurrencyToBuyOrSell1Choice.mmObject();
		}

		@Override
		public Optional<CurrencyToBuyOrSell1Choice> getValue(Order16 obj) {
			return obj.getCurrencyToBuyOrSell();
		}

		@Override
		public void setValue(Order16 obj, Optional<CurrencyToBuyOrSell1Choice> value) {
			obj.setCurrencyToBuyOrSell(value.orElse(null));
		}
	};
	@XmlElement(name = "OrdrOrgtrElgblty")
	protected Eligibility1Code orderOriginatorEligibility;
	/**
	 * 
	 <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order16
	 * Order16}</li>
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
	 * {@linkplain com.tools20022.repository.msg.Order18#mmOrderOriginatorEligibility
	 * Order18.mmOrderOriginatorEligibility}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Order16, Optional<Eligibility1Code>> mmOrderOriginatorEligibility = new MMMessageAttribute<Order16, Optional<Eligibility1Code>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmOrderOriginatorEligibility;
			componentContext_lazy = () -> com.tools20022.repository.msg.Order16.mmObject();
			isDerived = false;
			xmlTag = "OrdrOrgtrElgblty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderOriginatorEligibility";
			definition = "Counterparties eligibility as defined by article 24 of the EU MiFID Directive applicable to transactions executed by investment firms for eligible counterparties.";
			nextVersions_lazy = () -> Arrays.asList(Order18.mmOrderOriginatorEligibility);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Eligibility1Code.mmObject();
		}

		@Override
		public Optional<Eligibility1Code> getValue(Order16 obj) {
			return obj.getOrderOriginatorEligibility();
		}

		@Override
		public void setValue(Order16 obj, Optional<Eligibility1Code> value) {
			obj.setOrderOriginatorEligibility(value.orElse(null));
		}
	};
	@XmlElement(name = "PosFct")
	protected PositionEffect2Code positionEffect;
	/**
	 * 
	 <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order16
	 * Order16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PosFct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 77</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PositionEffect"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the resulting position after a trade should be an opening position or closing position. Used for omnibus accounting - where accounts are held on a gross basis instead of being netted together."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Order18#mmPositionEffect
	 * Order18.mmPositionEffect}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Order16, Optional<PositionEffect2Code>> mmPositionEffect = new MMMessageAttribute<Order16, Optional<PositionEffect2Code>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmPositionEffect;
			componentContext_lazy = () -> com.tools20022.repository.msg.Order16.mmObject();
			isDerived = false;
			xmlTag = "PosFct";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "77"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PositionEffect";
			definition = "Indicates whether the resulting position after a trade should be an opening position or closing position. Used for omnibus accounting - where accounts are held on a gross basis instead of being netted together.";
			nextVersions_lazy = () -> Arrays.asList(Order18.mmPositionEffect);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PositionEffect2Code.mmObject();
		}

		@Override
		public Optional<PositionEffect2Code> getValue(Order16 obj) {
			return obj.getPositionEffect();
		}

		@Override
		public void setValue(Order16 obj, Optional<PositionEffect2Code> value) {
			obj.setPositionEffect(value.orElse(null));
		}
	};
	@XmlElement(name = "DerivCvrd")
	protected YesNoIndicator derivativeCovered;
	/**
	 * 
	 <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order16
	 * Order16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DerivCvrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 203</li>
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
	 * {@linkplain com.tools20022.repository.msg.Order18#mmDerivativeCovered
	 * Order18.mmDerivativeCovered}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Order16, Optional<YesNoIndicator>> mmDerivativeCovered = new MMMessageAttribute<Order16, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> Derivative.mmDerivativeCovered;
			componentContext_lazy = () -> com.tools20022.repository.msg.Order16.mmObject();
			isDerived = false;
			xmlTag = "DerivCvrd";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "203"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DerivativeCovered";
			definition = "Indicates whether the derivative product is covered or not by an underlying financial instrument position.";
			nextVersions_lazy = () -> Arrays.asList(Order18.mmDerivativeCovered);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(Order16 obj) {
			return obj.getDerivativeCovered();
		}

		@Override
		public void setValue(Order16 obj, Optional<YesNoIndicator> value) {
			obj.setDerivativeCovered(value.orElse(null));
		}
	};
	@XmlElement(name = "ChrgTaxBsisTp")
	protected ChargeTaxBasisType1Choice chargeTaxBasisType;
	/**
	 * 
	 <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order16
	 * Order16}</li>
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
	 * {@linkplain com.tools20022.repository.msg.Order18#mmChargeTaxBasisType
	 * Order18.mmChargeTaxBasisType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Order16, Optional<ChargeTaxBasisType1Choice>> mmChargeTaxBasisType = new MMMessageAssociationEnd<Order16, Optional<ChargeTaxBasisType1Choice>>() {
		{
			businessElementTrace_lazy = () -> Tax.mmBasis;
			componentContext_lazy = () -> com.tools20022.repository.msg.Order16.mmObject();
			isDerived = false;
			xmlTag = "ChrgTaxBsisTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargeTaxBasisType";
			definition = "Type of charge/tax basis.";
			nextVersions_lazy = () -> Arrays.asList(Order18.mmChargeTaxBasisType);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ChargeTaxBasisType1Choice.mmObject();
		}

		@Override
		public Optional<ChargeTaxBasisType1Choice> getValue(Order16 obj) {
			return obj.getChargeTaxBasisType();
		}

		@Override
		public void setValue(Order16 obj, Optional<ChargeTaxBasisType1Choice> value) {
			obj.setChargeTaxBasisType(value.orElse(null));
		}
	};
	@XmlElement(name = "CptlGnTp")
	protected EUCapitalGainType2Choice capitalGainType;
	/**
	 * 
	 <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order16
	 * Order16}</li>
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
	 * <li>{@linkplain com.tools20022.repository.msg.Order18#mmCapitalGainType
	 * Order18.mmCapitalGainType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Order16, Optional<EUCapitalGainType2Choice>> mmCapitalGainType = new MMMessageAttribute<Order16, Optional<EUCapitalGainType2Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTax.mmEUCapitalGain;
			componentContext_lazy = () -> com.tools20022.repository.msg.Order16.mmObject();
			isDerived = false;
			xmlTag = "CptlGnTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CapitalGainType";
			definition = "Specifies the type of capital gain.";
			nextVersions_lazy = () -> Arrays.asList(Order18.mmCapitalGainType);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> EUCapitalGainType2Choice.mmObject();
		}

		@Override
		public Optional<EUCapitalGainType2Choice> getValue(Order16 obj) {
			return obj.getCapitalGainType();
		}

		@Override
		public void setValue(Order16 obj, Optional<EUCapitalGainType2Choice> value) {
			obj.setCapitalGainType(value.orElse(null));
		}
	};
	@XmlElement(name = "MtchSts")
	protected MatchingStatus8Choice matchStatus;
	/**
	 * 
	 <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order16
	 * Order16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MtchSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :25D::MTCH</li>
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
	 * <li>{@linkplain com.tools20022.repository.msg.Order18#mmMatchStatus
	 * Order18.mmMatchStatus}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Order16, Optional<MatchingStatus8Choice>> mmMatchStatus = new MMMessageAttribute<Order16, Optional<MatchingStatus8Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeStatus.mmMatchingStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.Order16.mmObject();
			isDerived = false;
			xmlTag = "MtchSts";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":25D::MTCH"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MatchStatus";
			definition = "Provides the matching status of the trade confirmation.";
			nextVersions_lazy = () -> Arrays.asList(Order18.mmMatchStatus);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> MatchingStatus8Choice.mmObject();
		}

		@Override
		public Optional<MatchingStatus8Choice> getValue(Order16 obj) {
			return obj.getMatchStatus();
		}

		@Override
		public void setValue(Order16 obj, Optional<MatchingStatus8Choice> value) {
			obj.setMatchStatus(value.orElse(null));
		}
	};
	@XmlElement(name = "CallInTp")
	protected CallIn1Code callInType;
	/**
	 * 
	 <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order16
	 * Order16}</li>
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
	 * <li>{@linkplain com.tools20022.repository.msg.Order18#mmCallInType
	 * Order18.mmCallInType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Order16, Optional<CallIn1Code>> mmCallInType = new MMMessageAttribute<Order16, Optional<CallIn1Code>>() {
		{
			businessElementTrace_lazy = () -> CashManagementService.mmCallInType;
			componentContext_lazy = () -> com.tools20022.repository.msg.Order16.mmObject();
			isDerived = false;
			xmlTag = "CallInTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CallInType";
			definition = "Specifies the type of pay-in call report.";
			nextVersions_lazy = () -> Arrays.asList(Order18.mmCallInType);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CallIn1Code.mmObject();
		}

		@Override
		public Optional<CallIn1Code> getValue(Order16 obj) {
			return obj.getCallInType();
		}

		@Override
		public void setValue(Order16 obj, Optional<CallIn1Code> value) {
			obj.setCallInType(value.orElse(null));
		}
	};
	@XmlElement(name = "YldTp")
	protected YieldCalculation2 yieldType;
	/**
	 * 
	 <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order16
	 * Order16}</li>
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
	 * <li>{@linkplain com.tools20022.repository.msg.Order18#mmYieldType
	 * Order18.mmYieldType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Order16, Optional<YieldCalculation2>> mmYieldType = new MMMessageAttribute<Order16, Optional<YieldCalculation2>>() {
		{
			businessElementTrace_lazy = () -> YieldCalculation.mmCalculationType;
			componentContext_lazy = () -> com.tools20022.repository.msg.Order16.mmObject();
			isDerived = false;
			xmlTag = "YldTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "YieldType";
			definition = "Type of yield at which the transaction was effected.";
			nextVersions_lazy = () -> Arrays.asList(Order18.mmYieldType);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> YieldCalculation2.mmObject();
		}

		@Override
		public Optional<YieldCalculation2> getValue(Order16 obj) {
			return obj.getYieldType();
		}

		@Override
		public void setValue(Order16 obj, Optional<YieldCalculation2> value) {
			obj.setYieldType(value.orElse(null));
		}
	};
	@XmlElement(name = "Rptg")
	protected List<Reporting5Choice> reporting;
	/**
	 * 
	 <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order16
	 * Order16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rptg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::RPOR</li>
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
	 * <li>{@linkplain com.tools20022.repository.msg.Order18#mmReporting
	 * Order18.mmReporting}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Order16, List<Reporting5Choice>> mmReporting = new MMMessageAttribute<Order16, List<Reporting5Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeExecution.mmReportingType;
			componentContext_lazy = () -> com.tools20022.repository.msg.Order16.mmObject();
			isDerived = false;
			xmlTag = "Rptg";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::RPOR"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reporting";
			definition = "Specifies that a trade is to be reported to a third party.";
			nextVersions_lazy = () -> Arrays.asList(Order18.mmReporting);
			minOccurs = 0;
			complexType_lazy = () -> Reporting5Choice.mmObject();
		}

		@Override
		public List<Reporting5Choice> getValue(Order16 obj) {
			return obj.getReporting();
		}

		@Override
		public void setValue(Order16 obj, List<Reporting5Choice> value) {
			obj.setReporting(value);
		}
	};
	@XmlElement(name = "AddtlPhysOrRegnDtls")
	protected RegistrationParameters3 additionalPhysicalOrRegistrationDetails;
	/**
	 * 
	 <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order16
	 * Order16}</li>
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
	 * {@linkplain com.tools20022.repository.msg.Order18#mmAdditionalPhysicalOrRegistrationDetails
	 * Order18.mmAdditionalPhysicalOrRegistrationDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Order16, Optional<RegistrationParameters3>> mmAdditionalPhysicalOrRegistrationDetails = new MMMessageAttribute<Order16, Optional<RegistrationParameters3>>() {
		{
			businessElementTrace_lazy = () -> Security.mmRegistration;
			componentContext_lazy = () -> com.tools20022.repository.msg.Order16.mmObject();
			isDerived = false;
			xmlTag = "AddtlPhysOrRegnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalPhysicalOrRegistrationDetails";
			definition = "Provides information required for the registration or physical settlement.";
			nextVersions_lazy = () -> Arrays.asList(Order18.mmAdditionalPhysicalOrRegistrationDetails);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RegistrationParameters3.mmObject();
		}

		@Override
		public Optional<RegistrationParameters3> getValue(Order16 obj) {
			return obj.getAdditionalPhysicalOrRegistrationDetails();
		}

		@Override
		public void setValue(Order16 obj, Optional<RegistrationParameters3> value) {
			obj.setAdditionalPhysicalOrRegistrationDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "AddtlTradInstrPrcgInf")
	protected Max350Text additionalTradeInstructionProcessingInformation;
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order16
	 * Order16}</li>
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
	 * {@linkplain com.tools20022.repository.msg.Order18#mmAdditionalTradeInstructionProcessingInformation
	 * Order18.mmAdditionalTradeInstructionProcessingInformation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Order16, Optional<Max350Text>> mmAdditionalTradeInstructionProcessingInformation = new MMMessageAttribute<Order16, Optional<Max350Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Order16.mmObject();
			isDerived = false;
			xmlTag = "AddtlTradInstrPrcgInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalTradeInstructionProcessingInformation";
			definition = "Provides additional details of the trade process not included within structured fields of this message.";
			nextVersions_lazy = () -> Arrays.asList(Order18.mmAdditionalTradeInstructionProcessingInformation);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Optional<Max350Text> getValue(Order16 obj) {
			return obj.getAdditionalTradeInstructionProcessingInformation();
		}

		@Override
		public void setValue(Order16 obj, Optional<Max350Text> value) {
			obj.setAdditionalTradeInstructionProcessingInformation(value.orElse(null));
		}
	};
	@XmlElement(name = "AcrdIntrstAmt")
	protected AmountAndDirection29 accruedInterestAmount;
	/**
	 * 
	 <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order16
	 * Order16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcrdIntrstAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19A::ACRU</li>
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
	 * {@linkplain com.tools20022.repository.msg.Order18#mmAccruedInterestAmount
	 * Order18.mmAccruedInterestAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Order16, Optional<AmountAndDirection29>> mmAccruedInterestAmount = new MMMessageAttribute<Order16, Optional<AmountAndDirection29>>() {
		{
			businessElementTrace_lazy = () -> Interest.mmAccruedInterestAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.Order16.mmObject();
			isDerived = false;
			xmlTag = "AcrdIntrstAmt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::ACRU"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccruedInterestAmount";
			definition = "Interest amount that has accrued in between two periods, for example, in between interest payment periods.";
			nextVersions_lazy = () -> Arrays.asList(Order18.mmAccruedInterestAmount);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AmountAndDirection29.mmObject();
		}

		@Override
		public Optional<AmountAndDirection29> getValue(Order16 obj) {
			return obj.getAccruedInterestAmount();
		}

		@Override
		public void setValue(Order16 obj, Optional<AmountAndDirection29> value) {
			obj.setAccruedInterestAmount(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Order16.mmBusinessProcessType, com.tools20022.repository.msg.Order16.mmOrderIdentification,
						com.tools20022.repository.msg.Order16.mmClientOrderIdentification, com.tools20022.repository.msg.Order16.mmSecondaryClientOrderIdentification, com.tools20022.repository.msg.Order16.mmListIdentification,
						com.tools20022.repository.msg.Order16.mmFinancialInstrumentIdentification, com.tools20022.repository.msg.Order16.mmSide, com.tools20022.repository.msg.Order16.mmPayment,
						com.tools20022.repository.msg.Order16.mmTradeTransactionType, com.tools20022.repository.msg.Order16.mmTradeTransactionCondition, com.tools20022.repository.msg.Order16.mmPreAdvice,
						com.tools20022.repository.msg.Order16.mmPlaceOfTrade, com.tools20022.repository.msg.Order16.mmOrderBookingDate, com.tools20022.repository.msg.Order16.mmTradeOriginationDate,
						com.tools20022.repository.msg.Order16.mmTradeDate, com.tools20022.repository.msg.Order16.mmProcessingDate, com.tools20022.repository.msg.Order16.mmSettlementDate, com.tools20022.repository.msg.Order16.mmNAVDate,
						com.tools20022.repository.msg.Order16.mmPartialFillDetails, com.tools20022.repository.msg.Order16.mmConfirmationQuantity, com.tools20022.repository.msg.Order16.mmQuantityBreakdown,
						com.tools20022.repository.msg.Order16.mmGrossTradeAmount, com.tools20022.repository.msg.Order16.mmDealPrice, com.tools20022.repository.msg.Order16.mmTypeOfPrice, com.tools20022.repository.msg.Order16.mmCashMargin,
						com.tools20022.repository.msg.Order16.mmCommission, com.tools20022.repository.msg.Order16.mmNumberOfDaysAccrued, com.tools20022.repository.msg.Order16.mmGiveUpNumberOfDays,
						com.tools20022.repository.msg.Order16.mmInterestType, com.tools20022.repository.msg.Order16.mmAccruedInterestPercentage, com.tools20022.repository.msg.Order16.mmTradeRegulatoryConditionsType,
						com.tools20022.repository.msg.Order16.mmCurrencyToBuyOrSell, com.tools20022.repository.msg.Order16.mmOrderOriginatorEligibility, com.tools20022.repository.msg.Order16.mmPositionEffect,
						com.tools20022.repository.msg.Order16.mmDerivativeCovered, com.tools20022.repository.msg.Order16.mmChargeTaxBasisType, com.tools20022.repository.msg.Order16.mmCapitalGainType,
						com.tools20022.repository.msg.Order16.mmMatchStatus, com.tools20022.repository.msg.Order16.mmCallInType, com.tools20022.repository.msg.Order16.mmYieldType, com.tools20022.repository.msg.Order16.mmReporting,
						com.tools20022.repository.msg.Order16.mmAdditionalPhysicalOrRegistrationDetails, com.tools20022.repository.msg.Order16.mmAdditionalTradeInstructionProcessingInformation,
						com.tools20022.repository.msg.Order16.mmAccruedInterestAmount);
				messageBuildingBlock_lazy = () -> Arrays.asList(SecuritiesTradeConfirmationStatusAdviceV01.mmPartyTradingDetails, SecuritiesTradeConfirmationStatusAdviceV01.mmCounterpartyTradingDetails);
				trace_lazy = () -> SecuritiesOrder.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCurrencyToBuyOrSellRule.forOrder16, com.tools20022.repository.constraints.ConstraintPlaceOfTradeRule.forOrder16,
						com.tools20022.repository.constraints.ConstraintTradeDateTimeUTCRule.forOrder16);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Order16";
				definition = "Intention to transfer an ownership of a financial instrument.";
				nextVersions_lazy = () -> Arrays.asList(Order18.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<BusinessProcessType1Choice> getBusinessProcessType() {
		return businessProcessType == null ? Optional.empty() : Optional.of(businessProcessType);
	}

	public Order16 setBusinessProcessType(BusinessProcessType1Choice businessProcessType) {
		this.businessProcessType = businessProcessType;
		return this;
	}

	public List<Max35Text> getOrderIdentification() {
		return orderIdentification == null ? orderIdentification = new ArrayList<>() : orderIdentification;
	}

	public Order16 setOrderIdentification(List<Max35Text> orderIdentification) {
		this.orderIdentification = Objects.requireNonNull(orderIdentification);
		return this;
	}

	public List<Max35Text> getClientOrderIdentification() {
		return clientOrderIdentification == null ? clientOrderIdentification = new ArrayList<>() : clientOrderIdentification;
	}

	public Order16 setClientOrderIdentification(List<Max35Text> clientOrderIdentification) {
		this.clientOrderIdentification = Objects.requireNonNull(clientOrderIdentification);
		return this;
	}

	public List<Max35Text> getSecondaryClientOrderIdentification() {
		return secondaryClientOrderIdentification == null ? secondaryClientOrderIdentification = new ArrayList<>() : secondaryClientOrderIdentification;
	}

	public Order16 setSecondaryClientOrderIdentification(List<Max35Text> secondaryClientOrderIdentification) {
		this.secondaryClientOrderIdentification = Objects.requireNonNull(secondaryClientOrderIdentification);
		return this;
	}

	public List<Max35Text> getListIdentification() {
		return listIdentification == null ? listIdentification = new ArrayList<>() : listIdentification;
	}

	public Order16 setListIdentification(List<Max35Text> listIdentification) {
		this.listIdentification = Objects.requireNonNull(listIdentification);
		return this;
	}

	public SecurityIdentification14 getFinancialInstrumentIdentification() {
		return financialInstrumentIdentification;
	}

	public Order16 setFinancialInstrumentIdentification(SecurityIdentification14 financialInstrumentIdentification) {
		this.financialInstrumentIdentification = Objects.requireNonNull(financialInstrumentIdentification);
		return this;
	}

	public Side3Code getSide() {
		return side;
	}

	public Order16 setSide(Side3Code side) {
		this.side = Objects.requireNonNull(side);
		return this;
	}

	public Optional<DeliveryReceiptType2Code> getPayment() {
		return payment == null ? Optional.empty() : Optional.of(payment);
	}

	public Order16 setPayment(DeliveryReceiptType2Code payment) {
		this.payment = payment;
		return this;
	}

	public Optional<TradeType3Choice> getTradeTransactionType() {
		return tradeTransactionType == null ? Optional.empty() : Optional.of(tradeTransactionType);
	}

	public Order16 setTradeTransactionType(TradeType3Choice tradeTransactionType) {
		this.tradeTransactionType = tradeTransactionType;
		return this;
	}

	public List<TradeTransactionCondition4Choice> getTradeTransactionCondition() {
		return tradeTransactionCondition == null ? tradeTransactionCondition = new ArrayList<>() : tradeTransactionCondition;
	}

	public Order16 setTradeTransactionCondition(List<TradeTransactionCondition4Choice> tradeTransactionCondition) {
		this.tradeTransactionCondition = Objects.requireNonNull(tradeTransactionCondition);
		return this;
	}

	public Optional<YesNoIndicator> getPreAdvice() {
		return preAdvice == null ? Optional.empty() : Optional.of(preAdvice);
	}

	public Order16 setPreAdvice(YesNoIndicator preAdvice) {
		this.preAdvice = preAdvice;
		return this;
	}

	public Optional<MarketIdentification77> getPlaceOfTrade() {
		return placeOfTrade == null ? Optional.empty() : Optional.of(placeOfTrade);
	}

	public Order16 setPlaceOfTrade(MarketIdentification77 placeOfTrade) {
		this.placeOfTrade = placeOfTrade;
		return this;
	}

	public Optional<ISODate> getOrderBookingDate() {
		return orderBookingDate == null ? Optional.empty() : Optional.of(orderBookingDate);
	}

	public Order16 setOrderBookingDate(ISODate orderBookingDate) {
		this.orderBookingDate = orderBookingDate;
		return this;
	}

	public Optional<ISODateTime> getTradeOriginationDate() {
		return tradeOriginationDate == null ? Optional.empty() : Optional.of(tradeOriginationDate);
	}

	public Order16 setTradeOriginationDate(ISODateTime tradeOriginationDate) {
		this.tradeOriginationDate = tradeOriginationDate;
		return this;
	}

	public TradeDate4Choice getTradeDate() {
		return tradeDate;
	}

	public Order16 setTradeDate(TradeDate4Choice tradeDate) {
		this.tradeDate = Objects.requireNonNull(tradeDate);
		return this;
	}

	public Optional<TradeDate4Choice> getProcessingDate() {
		return processingDate == null ? Optional.empty() : Optional.of(processingDate);
	}

	public Order16 setProcessingDate(TradeDate4Choice processingDate) {
		this.processingDate = processingDate;
		return this;
	}

	public SettlementDate8Choice getSettlementDate() {
		return settlementDate;
	}

	public Order16 setSettlementDate(SettlementDate8Choice settlementDate) {
		this.settlementDate = Objects.requireNonNull(settlementDate);
		return this;
	}

	public Optional<DateAndDateTime1Choice> getNAVDate() {
		return nAVDate == null ? Optional.empty() : Optional.of(nAVDate);
	}

	public Order16 setNAVDate(DateAndDateTime1Choice nAVDate) {
		this.nAVDate = nAVDate;
		return this;
	}

	public List<PartialFill1> getPartialFillDetails() {
		return partialFillDetails == null ? partialFillDetails = new ArrayList<>() : partialFillDetails;
	}

	public Order16 setPartialFillDetails(List<PartialFill1> partialFillDetails) {
		this.partialFillDetails = Objects.requireNonNull(partialFillDetails);
		return this;
	}

	public Quantity6Choice getConfirmationQuantity() {
		return confirmationQuantity;
	}

	public Order16 setConfirmationQuantity(Quantity6Choice confirmationQuantity) {
		this.confirmationQuantity = Objects.requireNonNull(confirmationQuantity);
		return this;
	}

	public List<QuantityBreakdown11> getQuantityBreakdown() {
		return quantityBreakdown == null ? quantityBreakdown = new ArrayList<>() : quantityBreakdown;
	}

	public Order16 setQuantityBreakdown(List<QuantityBreakdown11> quantityBreakdown) {
		this.quantityBreakdown = Objects.requireNonNull(quantityBreakdown);
		return this;
	}

	public Optional<AmountAndDirection29> getGrossTradeAmount() {
		return grossTradeAmount == null ? Optional.empty() : Optional.of(grossTradeAmount);
	}

	public Order16 setGrossTradeAmount(AmountAndDirection29 grossTradeAmount) {
		this.grossTradeAmount = grossTradeAmount;
		return this;
	}

	public Price4 getDealPrice() {
		return dealPrice;
	}

	public Order16 setDealPrice(Price4 dealPrice) {
		this.dealPrice = Objects.requireNonNull(dealPrice);
		return this;
	}

	public Optional<TypeOfPrice10Choice> getTypeOfPrice() {
		return typeOfPrice == null ? Optional.empty() : Optional.of(typeOfPrice);
	}

	public Order16 setTypeOfPrice(TypeOfPrice10Choice typeOfPrice) {
		this.typeOfPrice = typeOfPrice;
		return this;
	}

	public Optional<CashMarginOrder1Code> getCashMargin() {
		return cashMargin == null ? Optional.empty() : Optional.of(cashMargin);
	}

	public Order16 setCashMargin(CashMarginOrder1Code cashMargin) {
		this.cashMargin = cashMargin;
		return this;
	}

	public Optional<Commission16> getCommission() {
		return commission == null ? Optional.empty() : Optional.of(commission);
	}

	public Order16 setCommission(Commission16 commission) {
		this.commission = commission;
		return this;
	}

	public Optional<Max3Number> getNumberOfDaysAccrued() {
		return numberOfDaysAccrued == null ? Optional.empty() : Optional.of(numberOfDaysAccrued);
	}

	public Order16 setNumberOfDaysAccrued(Max3Number numberOfDaysAccrued) {
		this.numberOfDaysAccrued = numberOfDaysAccrued;
		return this;
	}

	public Optional<Max3Number> getGiveUpNumberOfDays() {
		return giveUpNumberOfDays == null ? Optional.empty() : Optional.of(giveUpNumberOfDays);
	}

	public Order16 setGiveUpNumberOfDays(Max3Number giveUpNumberOfDays) {
		this.giveUpNumberOfDays = giveUpNumberOfDays;
		return this;
	}

	public Optional<InterestType2Code> getInterestType() {
		return interestType == null ? Optional.empty() : Optional.of(interestType);
	}

	public Order16 setInterestType(InterestType2Code interestType) {
		this.interestType = interestType;
		return this;
	}

	public Optional<PercentageRate> getAccruedInterestPercentage() {
		return accruedInterestPercentage == null ? Optional.empty() : Optional.of(accruedInterestPercentage);
	}

	public Order16 setAccruedInterestPercentage(PercentageRate accruedInterestPercentage) {
		this.accruedInterestPercentage = accruedInterestPercentage;
		return this;
	}

	public Optional<TradeRegulatoryConditions1Code> getTradeRegulatoryConditionsType() {
		return tradeRegulatoryConditionsType == null ? Optional.empty() : Optional.of(tradeRegulatoryConditionsType);
	}

	public Order16 setTradeRegulatoryConditionsType(TradeRegulatoryConditions1Code tradeRegulatoryConditionsType) {
		this.tradeRegulatoryConditionsType = tradeRegulatoryConditionsType;
		return this;
	}

	public Optional<CurrencyToBuyOrSell1Choice> getCurrencyToBuyOrSell() {
		return currencyToBuyOrSell == null ? Optional.empty() : Optional.of(currencyToBuyOrSell);
	}

	public Order16 setCurrencyToBuyOrSell(CurrencyToBuyOrSell1Choice currencyToBuyOrSell) {
		this.currencyToBuyOrSell = currencyToBuyOrSell;
		return this;
	}

	public Optional<Eligibility1Code> getOrderOriginatorEligibility() {
		return orderOriginatorEligibility == null ? Optional.empty() : Optional.of(orderOriginatorEligibility);
	}

	public Order16 setOrderOriginatorEligibility(Eligibility1Code orderOriginatorEligibility) {
		this.orderOriginatorEligibility = orderOriginatorEligibility;
		return this;
	}

	public Optional<PositionEffect2Code> getPositionEffect() {
		return positionEffect == null ? Optional.empty() : Optional.of(positionEffect);
	}

	public Order16 setPositionEffect(PositionEffect2Code positionEffect) {
		this.positionEffect = positionEffect;
		return this;
	}

	public Optional<YesNoIndicator> getDerivativeCovered() {
		return derivativeCovered == null ? Optional.empty() : Optional.of(derivativeCovered);
	}

	public Order16 setDerivativeCovered(YesNoIndicator derivativeCovered) {
		this.derivativeCovered = derivativeCovered;
		return this;
	}

	public Optional<ChargeTaxBasisType1Choice> getChargeTaxBasisType() {
		return chargeTaxBasisType == null ? Optional.empty() : Optional.of(chargeTaxBasisType);
	}

	public Order16 setChargeTaxBasisType(ChargeTaxBasisType1Choice chargeTaxBasisType) {
		this.chargeTaxBasisType = chargeTaxBasisType;
		return this;
	}

	public Optional<EUCapitalGainType2Choice> getCapitalGainType() {
		return capitalGainType == null ? Optional.empty() : Optional.of(capitalGainType);
	}

	public Order16 setCapitalGainType(EUCapitalGainType2Choice capitalGainType) {
		this.capitalGainType = capitalGainType;
		return this;
	}

	public Optional<MatchingStatus8Choice> getMatchStatus() {
		return matchStatus == null ? Optional.empty() : Optional.of(matchStatus);
	}

	public Order16 setMatchStatus(MatchingStatus8Choice matchStatus) {
		this.matchStatus = matchStatus;
		return this;
	}

	public Optional<CallIn1Code> getCallInType() {
		return callInType == null ? Optional.empty() : Optional.of(callInType);
	}

	public Order16 setCallInType(CallIn1Code callInType) {
		this.callInType = callInType;
		return this;
	}

	public Optional<YieldCalculation2> getYieldType() {
		return yieldType == null ? Optional.empty() : Optional.of(yieldType);
	}

	public Order16 setYieldType(YieldCalculation2 yieldType) {
		this.yieldType = yieldType;
		return this;
	}

	public List<Reporting5Choice> getReporting() {
		return reporting == null ? reporting = new ArrayList<>() : reporting;
	}

	public Order16 setReporting(List<Reporting5Choice> reporting) {
		this.reporting = Objects.requireNonNull(reporting);
		return this;
	}

	public Optional<RegistrationParameters3> getAdditionalPhysicalOrRegistrationDetails() {
		return additionalPhysicalOrRegistrationDetails == null ? Optional.empty() : Optional.of(additionalPhysicalOrRegistrationDetails);
	}

	public Order16 setAdditionalPhysicalOrRegistrationDetails(RegistrationParameters3 additionalPhysicalOrRegistrationDetails) {
		this.additionalPhysicalOrRegistrationDetails = additionalPhysicalOrRegistrationDetails;
		return this;
	}

	public Optional<Max350Text> getAdditionalTradeInstructionProcessingInformation() {
		return additionalTradeInstructionProcessingInformation == null ? Optional.empty() : Optional.of(additionalTradeInstructionProcessingInformation);
	}

	public Order16 setAdditionalTradeInstructionProcessingInformation(Max350Text additionalTradeInstructionProcessingInformation) {
		this.additionalTradeInstructionProcessingInformation = additionalTradeInstructionProcessingInformation;
		return this;
	}

	public Optional<AmountAndDirection29> getAccruedInterestAmount() {
		return accruedInterestAmount == null ? Optional.empty() : Optional.of(accruedInterestAmount);
	}

	public Order16 setAccruedInterestAmount(AmountAndDirection29 accruedInterestAmount) {
		this.accruedInterestAmount = accruedInterestAmount;
		return this;
	}
}