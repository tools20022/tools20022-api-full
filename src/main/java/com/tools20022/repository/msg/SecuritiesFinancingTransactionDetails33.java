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
import com.tools20022.repository.area.sese.SecuritiesFinancingStatusAdvice002V06;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.DeliveryReceiptType2Code;
import com.tools20022.repository.codeset.ReceiveDelivery1Code;
import com.tools20022.repository.codeset.SecuritiesFinancingTransactionType1Code;
import com.tools20022.repository.datatype.RestrictedFINXMax16Text;
import com.tools20022.repository.datatype.RestrictedFINXMax350Text;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Details of the closing of the securities financing transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33#mmSecuritiesFinancingTradeIdentification
 * SecuritiesFinancingTransactionDetails33.
 * mmSecuritiesFinancingTradeIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33#mmClosingLegIdentification
 * SecuritiesFinancingTransactionDetails33.mmClosingLegIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33#mmPoolIdentification
 * SecuritiesFinancingTransactionDetails33.mmPoolIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33#mmCorporateActionEventIdentification
 * SecuritiesFinancingTransactionDetails33.mmCorporateActionEventIdentification}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33#mmTripartyAgentCollateralTransactionIdentification
 * SecuritiesFinancingTransactionDetails33.
 * mmTripartyAgentCollateralTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33#mmClientTripartyCollateralTransactionIdentification
 * SecuritiesFinancingTransactionDetails33.
 * mmClientTripartyCollateralTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33#mmAccountOwner
 * SecuritiesFinancingTransactionDetails33.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33#mmSafekeepingAccount
 * SecuritiesFinancingTransactionDetails33.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33#mmSafekeepingPlace
 * SecuritiesFinancingTransactionDetails33.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33#mmPlaceOfTrade
 * SecuritiesFinancingTransactionDetails33.mmPlaceOfTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33#mmFinancialInstrumentIdentification
 * SecuritiesFinancingTransactionDetails33.mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33#mmSettlementQuantity
 * SecuritiesFinancingTransactionDetails33.mmSettlementQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33#mmOpeningSettlementAmount
 * SecuritiesFinancingTransactionDetails33.mmOpeningSettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33#mmTerminationTransactionAmount
 * SecuritiesFinancingTransactionDetails33.mmTerminationTransactionAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33#mmOpeningSettlementDate
 * SecuritiesFinancingTransactionDetails33.mmOpeningSettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33#mmTerminationDate
 * SecuritiesFinancingTransactionDetails33.mmTerminationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33#mmTradeDate
 * SecuritiesFinancingTransactionDetails33.mmTradeDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33#mmExpectedSettlementDate
 * SecuritiesFinancingTransactionDetails33.mmExpectedSettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33#mmExpectedValueDate
 * SecuritiesFinancingTransactionDetails33.mmExpectedValueDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33#mmLateDeliveryDate
 * SecuritiesFinancingTransactionDetails33.mmLateDeliveryDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33#mmRateChangeDate
 * SecuritiesFinancingTransactionDetails33.mmRateChangeDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33#mmSecuritiesFinancingTransactionType
 * SecuritiesFinancingTransactionDetails33.mmSecuritiesFinancingTransactionType}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33#mmSecuritiesMovementType
 * SecuritiesFinancingTransactionDetails33.mmSecuritiesMovementType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33#mmPayment
 * SecuritiesFinancingTransactionDetails33.mmPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33#mmSettlementParameters
 * SecuritiesFinancingTransactionDetails33.mmSettlementParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33#mmRateType
 * SecuritiesFinancingTransactionDetails33.mmRateType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33#mmVariableRateSupport
 * SecuritiesFinancingTransactionDetails33.mmVariableRateSupport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33#mmRepurchaseRate
 * SecuritiesFinancingTransactionDetails33.mmRepurchaseRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33#mmStockLoanMargin
 * SecuritiesFinancingTransactionDetails33.mmStockLoanMargin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33#mmSecuritiesHaircut
 * SecuritiesFinancingTransactionDetails33.mmSecuritiesHaircut}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33#mmPricingRate
 * SecuritiesFinancingTransactionDetails33.mmPricingRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33#mmSpread
 * SecuritiesFinancingTransactionDetails33.mmSpread}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33#mmDeliveringSettlementParties
 * SecuritiesFinancingTransactionDetails33.mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33#mmReceivingSettlementParties
 * SecuritiesFinancingTransactionDetails33.mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33#mmInvestor
 * SecuritiesFinancingTransactionDetails33.mmInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33#mmSettlementInstructionProcessingAdditionalDetails
 * SecuritiesFinancingTransactionDetails33.
 * mmSettlementInstructionProcessingAdditionalDetails}</li>
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
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingStatusAdvice002V06#mmTransactionDetails
 * SecuritiesFinancingStatusAdvice002V06.mmTransactionDetails}</li>
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
 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosingRule#forSecuritiesFinancingTransactionDetails33
 * ConstraintTwoLegTransactionOpeningClosingRule.
 * forSecuritiesFinancingTransactionDetails33}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule#forSecuritiesFinancingTransactionDetails33
 * ConstraintAdditionalDetailsRule.forSecuritiesFinancingTransactionDetails33}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesFinancingTransactionDetails33"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Details of the closing of the securities financing transaction."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SecuritiesFinancingTransactionDetails33", propOrder = {"securitiesFinancingTradeIdentification", "closingLegIdentification", "poolIdentification", "corporateActionEventIdentification",
		"tripartyAgentCollateralTransactionIdentification", "clientTripartyCollateralTransactionIdentification", "accountOwner", "safekeepingAccount", "safekeepingPlace", "placeOfTrade", "financialInstrumentIdentification",
		"settlementQuantity", "openingSettlementAmount", "terminationTransactionAmount", "openingSettlementDate", "terminationDate", "tradeDate", "expectedSettlementDate", "expectedValueDate", "lateDeliveryDate", "rateChangeDate",
		"securitiesFinancingTransactionType", "securitiesMovementType", "payment", "settlementParameters", "rateType", "variableRateSupport", "repurchaseRate", "stockLoanMargin", "securitiesHaircut", "pricingRate", "spread",
		"deliveringSettlementParties", "receivingSettlementParties", "investor", "settlementInstructionProcessingAdditionalDetails"})
public class SecuritiesFinancingTransactionDetails33 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "SctiesFincgTradId")
	protected RestrictedFINXMax16Text securitiesFinancingTradeIdentification;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33
	 * SecuritiesFinancingTransactionDetails33}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesFincgTradId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesFinancingTradeIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the underlying securities financing trade as assigned by the instructing party. The identification is common to all collateral pieces (one or many)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesFinancingTransactionDetails33, Optional<RestrictedFINXMax16Text>> mmSecuritiesFinancingTradeIdentification = new MMMessageAttribute<SecuritiesFinancingTransactionDetails33, Optional<RestrictedFINXMax16Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33.mmObject();
			isDerived = false;
			xmlTag = "SctiesFincgTradId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesFinancingTradeIdentification";
			definition = "Unambiguous identification of the underlying securities financing trade as assigned by the instructing party. The identification is common to all collateral pieces (one or many).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINXMax16Text.mmObject();
		}

		@Override
		public Optional<RestrictedFINXMax16Text> getValue(SecuritiesFinancingTransactionDetails33 obj) {
			return obj.getSecuritiesFinancingTradeIdentification();
		}

		@Override
		public void setValue(SecuritiesFinancingTransactionDetails33 obj, Optional<RestrictedFINXMax16Text> value) {
			obj.setSecuritiesFinancingTradeIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "ClsgLegId")
	protected RestrictedFINXMax16Text closingLegIdentification;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33
	 * SecuritiesFinancingTransactionDetails33}</li>
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
	public static final MMMessageAttribute<SecuritiesFinancingTransactionDetails33, Optional<RestrictedFINXMax16Text>> mmClosingLegIdentification = new MMMessageAttribute<SecuritiesFinancingTransactionDetails33, Optional<RestrictedFINXMax16Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33.mmObject();
			isDerived = false;
			xmlTag = "ClsgLegId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClosingLegIdentification";
			definition = "Unambiguous identification of the second leg of the transaction as known by the account owner (or the instructing party acting on its behalf).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINXMax16Text.mmObject();
		}

		@Override
		public Optional<RestrictedFINXMax16Text> getValue(SecuritiesFinancingTransactionDetails33 obj) {
			return obj.getClosingLegIdentification();
		}

		@Override
		public void setValue(SecuritiesFinancingTransactionDetails33 obj, Optional<RestrictedFINXMax16Text> value) {
			obj.setClosingLegIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "PoolId")
	protected RestrictedFINXMax16Text poolIdentification;
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification#mmPoolIdentification
	 * SecuritiesTradeIdentification.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33
	 * SecuritiesFinancingTransactionDetails33}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PoolId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PoolIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Collective reference identifying a set of messages."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesFinancingTransactionDetails33, Optional<RestrictedFINXMax16Text>> mmPoolIdentification = new MMMessageAttribute<SecuritiesFinancingTransactionDetails33, Optional<RestrictedFINXMax16Text>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeIdentification.mmPoolIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33.mmObject();
			isDerived = false;
			xmlTag = "PoolId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PoolIdentification";
			definition = "Collective reference identifying a set of messages.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINXMax16Text.mmObject();
		}

		@Override
		public Optional<RestrictedFINXMax16Text> getValue(SecuritiesFinancingTransactionDetails33 obj) {
			return obj.getPoolIdentification();
		}

		@Override
		public void setValue(SecuritiesFinancingTransactionDetails33 obj, Optional<RestrictedFINXMax16Text> value) {
			obj.setPoolIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "CorpActnEvtId")
	protected RestrictedFINXMax16Text corporateActionEventIdentification;
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
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEventRegistration#mmCorporateActionEventIdentification
	 * CorporateActionEventRegistration.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33
	 * SecuritiesFinancingTransactionDetails33}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CorpActnEvtId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionEventIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification assigned by the account servicer to unambiguously identify a corporate action event."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesFinancingTransactionDetails33, Optional<RestrictedFINXMax16Text>> mmCorporateActionEventIdentification = new MMMessageAttribute<SecuritiesFinancingTransactionDetails33, Optional<RestrictedFINXMax16Text>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEventRegistration.mmCorporateActionEventIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33.mmObject();
			isDerived = false;
			xmlTag = "CorpActnEvtId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionEventIdentification";
			definition = "Identification assigned by the account servicer to unambiguously identify a corporate action event.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINXMax16Text.mmObject();
		}

		@Override
		public Optional<RestrictedFINXMax16Text> getValue(SecuritiesFinancingTransactionDetails33 obj) {
			return obj.getCorporateActionEventIdentification();
		}

		@Override
		public void setValue(SecuritiesFinancingTransactionDetails33 obj, Optional<RestrictedFINXMax16Text> value) {
			obj.setCorporateActionEventIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "TrptyAgtCollTxId")
	protected RestrictedFINXMax16Text tripartyAgentCollateralTransactionIdentification;
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification#mmTripartyAgentCollateralTransactionIdentification
	 * SecuritiesTradeIdentification.
	 * mmTripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33
	 * SecuritiesFinancingTransactionDetails33}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrptyAgtCollTxId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TripartyAgentCollateralTransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique reference identifying the triparty collateral management transaction from the triparty agent's point of view."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesFinancingTransactionDetails33, Optional<RestrictedFINXMax16Text>> mmTripartyAgentCollateralTransactionIdentification = new MMMessageAttribute<SecuritiesFinancingTransactionDetails33, Optional<RestrictedFINXMax16Text>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeIdentification.mmTripartyAgentCollateralTransactionIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33.mmObject();
			isDerived = false;
			xmlTag = "TrptyAgtCollTxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TripartyAgentCollateralTransactionIdentification";
			definition = "Unique reference identifying the triparty collateral management transaction from the triparty agent's point of view.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINXMax16Text.mmObject();
		}

		@Override
		public Optional<RestrictedFINXMax16Text> getValue(SecuritiesFinancingTransactionDetails33 obj) {
			return obj.getTripartyAgentCollateralTransactionIdentification();
		}

		@Override
		public void setValue(SecuritiesFinancingTransactionDetails33 obj, Optional<RestrictedFINXMax16Text> value) {
			obj.setTripartyAgentCollateralTransactionIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "ClntTrptyCollTxId")
	protected RestrictedFINXMax16Text clientTripartyCollateralTransactionIdentification;
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification#mmClientTripartyCollateralTransactionIdentification
	 * SecuritiesTradeIdentification.
	 * mmClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33
	 * SecuritiesFinancingTransactionDetails33}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClntTrptyCollTxId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClientTripartyCollateralTransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique reference identifying the triparty collateral management transaction from the client's point of view."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesFinancingTransactionDetails33, Optional<RestrictedFINXMax16Text>> mmClientTripartyCollateralTransactionIdentification = new MMMessageAttribute<SecuritiesFinancingTransactionDetails33, Optional<RestrictedFINXMax16Text>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeIdentification.mmClientTripartyCollateralTransactionIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33.mmObject();
			isDerived = false;
			xmlTag = "ClntTrptyCollTxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClientTripartyCollateralTransactionIdentification";
			definition = "Unique reference identifying the triparty collateral management transaction from the client's point of view.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINXMax16Text.mmObject();
		}

		@Override
		public Optional<RestrictedFINXMax16Text> getValue(SecuritiesFinancingTransactionDetails33 obj) {
			return obj.getClientTripartyCollateralTransactionIdentification();
		}

		@Override
		public void setValue(SecuritiesFinancingTransactionDetails33 obj, Optional<RestrictedFINXMax16Text> value) {
			obj.setClientTripartyCollateralTransactionIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "AcctOwnr")
	protected PartyIdentification109 accountOwner;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification109
	 * PartyIdentification109}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33
	 * SecuritiesFinancingTransactionDetails33}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctOwnr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountOwner"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party that legally owns the account."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesFinancingTransactionDetails33, Optional<PartyIdentification109>> mmAccountOwner = new MMMessageAssociationEnd<SecuritiesFinancingTransactionDetails33, Optional<PartyIdentification109>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33.mmObject();
			isDerived = false;
			xmlTag = "AcctOwnr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOwner";
			definition = "Party that legally owns the account.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification109.mmObject();
		}

		@Override
		public Optional<PartyIdentification109> getValue(SecuritiesFinancingTransactionDetails33 obj) {
			return obj.getAccountOwner();
		}

		@Override
		public void setValue(SecuritiesFinancingTransactionDetails33 obj, Optional<PartyIdentification109> value) {
			obj.setAccountOwner(value.orElse(null));
		}
	};
	@XmlElement(name = "SfkpgAcct", required = true)
	protected SecuritiesAccount30 safekeepingAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SecuritiesAccount30
	 * SecuritiesAccount30}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount
	 * SecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33
	 * SecuritiesFinancingTransactionDetails33}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SfkpgAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account to or from which a securities entry is made."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesFinancingTransactionDetails33, SecuritiesAccount30> mmSafekeepingAccount = new MMMessageAssociationEnd<SecuritiesFinancingTransactionDetails33, SecuritiesAccount30>() {
		{
			businessComponentTrace_lazy = () -> SecuritiesAccount.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33.mmObject();
			isDerived = false;
			xmlTag = "SfkpgAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingAccount";
			definition = "Account to or from which a securities entry is made.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SecuritiesAccount30.mmObject();
		}

		@Override
		public SecuritiesAccount30 getValue(SecuritiesFinancingTransactionDetails33 obj) {
			return obj.getSafekeepingAccount();
		}

		@Override
		public void setValue(SecuritiesFinancingTransactionDetails33 obj, SecuritiesAccount30 value) {
			obj.setSafekeepingAccount(value);
		}
	};
	@XmlElement(name = "SfkpgPlc")
	protected SafeKeepingPlace2 safekeepingPlace;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SafeKeepingPlace2
	 * SafeKeepingPlace2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SafekeepingPlace
	 * SafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33
	 * SecuritiesFinancingTransactionDetails33}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SfkpgPlc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlace"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Place where the securities are safe-kept, physically or notionally. This place can be, for example, a local custodian, a Central Securities Depository (CSD) or an International Central Securities Depository (ICSD)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesFinancingTransactionDetails33, Optional<SafeKeepingPlace2>> mmSafekeepingPlace = new MMMessageAssociationEnd<SecuritiesFinancingTransactionDetails33, Optional<SafeKeepingPlace2>>() {
		{
			businessComponentTrace_lazy = () -> SafekeepingPlace.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33.mmObject();
			isDerived = false;
			xmlTag = "SfkpgPlc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlace";
			definition = "Place where the securities are safe-kept, physically or notionally. This place can be, for example, a local custodian, a Central Securities Depository (CSD) or an International Central Securities Depository (ICSD).";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SafeKeepingPlace2.mmObject();
		}

		@Override
		public Optional<SafeKeepingPlace2> getValue(SecuritiesFinancingTransactionDetails33 obj) {
			return obj.getSafekeepingPlace();
		}

		@Override
		public void setValue(SecuritiesFinancingTransactionDetails33 obj, Optional<SafeKeepingPlace2> value) {
			obj.setSafekeepingPlace(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33
	 * SecuritiesFinancingTransactionDetails33}</li>
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
	 * "Context, or geographic environment, in which trading parties may meet in order to negotiate and execute trades among themselves."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesFinancingTransactionDetails33, Optional<PlaceOfTradeIdentification2>> mmPlaceOfTrade = new MMMessageAssociationEnd<SecuritiesFinancingTransactionDetails33, Optional<PlaceOfTradeIdentification2>>() {
		{
			businessElementTrace_lazy = () -> Security.mmTradingMarket;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33.mmObject();
			isDerived = false;
			xmlTag = "PlcOfTrad";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfTrade";
			definition = "Context, or geographic environment, in which trading parties may meet in order to negotiate and execute trades among themselves.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PlaceOfTradeIdentification2.mmObject();
		}

		@Override
		public Optional<PlaceOfTradeIdentification2> getValue(SecuritiesFinancingTransactionDetails33 obj) {
			return obj.getPlaceOfTrade();
		}

		@Override
		public void setValue(SecuritiesFinancingTransactionDetails33 obj, Optional<PlaceOfTradeIdentification2> value) {
			obj.setPlaceOfTrade(value.orElse(null));
		}
	};
	@XmlElement(name = "FinInstrmId", required = true)
	protected SecurityIdentification20 financialInstrumentIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification20
	 * SecurityIdentification20}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmIdentification
	 * Security.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33
	 * SecuritiesFinancingTransactionDetails33}</li>
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
	 * "Financial instruments representing a sum of rights of the investor vis-a-vis the issuer."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesFinancingTransactionDetails33, SecurityIdentification20> mmFinancialInstrumentIdentification = new MMMessageAssociationEnd<SecuritiesFinancingTransactionDetails33, SecurityIdentification20>() {
		{
			businessElementTrace_lazy = () -> Security.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentification";
			definition = "Financial instruments representing a sum of rights of the investor vis-a-vis the issuer.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SecurityIdentification20.mmObject();
		}

		@Override
		public SecurityIdentification20 getValue(SecuritiesFinancingTransactionDetails33 obj) {
			return obj.getFinancialInstrumentIdentification();
		}

		@Override
		public void setValue(SecuritiesFinancingTransactionDetails33 obj, SecurityIdentification20 value) {
			obj.setFinancialInstrumentIdentification(value);
		}
	};
	@XmlElement(name = "SttlmQty", required = true)
	protected Quantity10Choice settlementQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Quantity10Choice
	 * Quantity10Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSettlementQuantity
	 * SecuritiesSettlement.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33
	 * SecuritiesFinancingTransactionDetails33}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total quantity of securities to be settled."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesFinancingTransactionDetails33, Quantity10Choice> mmSettlementQuantity = new MMMessageAssociationEnd<SecuritiesFinancingTransactionDetails33, Quantity10Choice>() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmSettlementQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33.mmObject();
			isDerived = false;
			xmlTag = "SttlmQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementQuantity";
			definition = "Total quantity of securities to be settled.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Quantity10Choice.mmObject();
		}

		@Override
		public Quantity10Choice getValue(SecuritiesFinancingTransactionDetails33 obj) {
			return obj.getSettlementQuantity();
		}

		@Override
		public void setValue(SecuritiesFinancingTransactionDetails33 obj, Quantity10Choice value) {
			obj.setSettlementQuantity(value);
		}
	};
	@XmlElement(name = "OpngSttlmAmt")
	protected AmountAndDirection67 openingSettlementAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection67
	 * AmountAndDirection67}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmOpeningSettlementAmount
	 * SecuritiesFinancing.mmOpeningSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33
	 * SecuritiesFinancingTransactionDetails33}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OpngSttlmAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OpeningSettlementAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total amount of money to be paid or received in exchange for the securities at the opening of a securities financing transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesFinancingTransactionDetails33, Optional<AmountAndDirection67>> mmOpeningSettlementAmount = new MMMessageAssociationEnd<SecuritiesFinancingTransactionDetails33, Optional<AmountAndDirection67>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesFinancing.mmOpeningSettlementAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33.mmObject();
			isDerived = false;
			xmlTag = "OpngSttlmAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OpeningSettlementAmount";
			definition = "Total amount of money to be paid or received in exchange for the securities at the opening of a securities financing transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AmountAndDirection67.mmObject();
		}

		@Override
		public Optional<AmountAndDirection67> getValue(SecuritiesFinancingTransactionDetails33 obj) {
			return obj.getOpeningSettlementAmount();
		}

		@Override
		public void setValue(SecuritiesFinancingTransactionDetails33 obj, Optional<AmountAndDirection67> value) {
			obj.setOpeningSettlementAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "TermntnTxAmt")
	protected AmountAndDirection59 terminationTransactionAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection59
	 * AmountAndDirection59}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmTerminationTransactionAmount
	 * SecuritiesFinancing.mmTerminationTransactionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33
	 * SecuritiesFinancingTransactionDetails33}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TermntnTxAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TerminationTransactionAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total amount of money to be settled to terminate the transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesFinancingTransactionDetails33, Optional<AmountAndDirection59>> mmTerminationTransactionAmount = new MMMessageAssociationEnd<SecuritiesFinancingTransactionDetails33, Optional<AmountAndDirection59>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesFinancing.mmTerminationTransactionAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33.mmObject();
			isDerived = false;
			xmlTag = "TermntnTxAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TerminationTransactionAmount";
			definition = "Total amount of money to be settled to terminate the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AmountAndDirection59.mmObject();
		}

		@Override
		public Optional<AmountAndDirection59> getValue(SecuritiesFinancingTransactionDetails33 obj) {
			return obj.getTerminationTransactionAmount();
		}

		@Override
		public void setValue(SecuritiesFinancingTransactionDetails33 obj, Optional<AmountAndDirection59> value) {
			obj.setTerminationTransactionAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "OpngSttlmDt", required = true)
	protected SettlementDate15Choice openingSettlementDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.SettlementDate15Choice
	 * SettlementDate15Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmOpeningSettlementDate
	 * SecuritiesFinancing.mmOpeningSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33
	 * SecuritiesFinancingTransactionDetails33}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OpngSttlmDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OpeningSettlementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time at which the securities are to be delivered or received."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesFinancingTransactionDetails33, SettlementDate15Choice> mmOpeningSettlementDate = new MMMessageAssociationEnd<SecuritiesFinancingTransactionDetails33, SettlementDate15Choice>() {
		{
			businessElementTrace_lazy = () -> SecuritiesFinancing.mmOpeningSettlementDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33.mmObject();
			isDerived = false;
			xmlTag = "OpngSttlmDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OpeningSettlementDate";
			definition = "Date and time at which the securities are to be delivered or received.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SettlementDate15Choice.mmObject();
		}

		@Override
		public SettlementDate15Choice getValue(SecuritiesFinancingTransactionDetails33 obj) {
			return obj.getOpeningSettlementDate();
		}

		@Override
		public void setValue(SecuritiesFinancingTransactionDetails33 obj, SettlementDate15Choice value) {
			obj.setOpeningSettlementDate(value);
		}
	};
	@XmlElement(name = "TermntnDt")
	protected TerminationDate5Choice terminationDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.TerminationDate5Choice
	 * TerminationDate5Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmTerminationDateTime
	 * SecuritiesFinancing.mmTerminationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33
	 * SecuritiesFinancingTransactionDetails33}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TermntnDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TerminationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Closing date/time or maturity date/time of the transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesFinancingTransactionDetails33, Optional<TerminationDate5Choice>> mmTerminationDate = new MMMessageAssociationEnd<SecuritiesFinancingTransactionDetails33, Optional<TerminationDate5Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesFinancing.mmTerminationDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33.mmObject();
			isDerived = false;
			xmlTag = "TermntnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TerminationDate";
			definition = "Closing date/time or maturity date/time of the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TerminationDate5Choice.mmObject();
		}

		@Override
		public Optional<TerminationDate5Choice> getValue(SecuritiesFinancingTransactionDetails33 obj) {
			return obj.getTerminationDate();
		}

		@Override
		public void setValue(SecuritiesFinancingTransactionDetails33 obj, Optional<TerminationDate5Choice> value) {
			obj.setTerminationDate(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33
	 * SecuritiesFinancingTransactionDetails33}</li>
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
	public static final MMMessageAssociationEnd<SecuritiesFinancingTransactionDetails33, Optional<TradeDate6Choice>> mmTradeDate = new MMMessageAssociationEnd<SecuritiesFinancingTransactionDetails33, Optional<TradeDate6Choice>>() {
		{
			businessElementTrace_lazy = () -> Trade.mmTradeDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33.mmObject();
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
		public Optional<TradeDate6Choice> getValue(SecuritiesFinancingTransactionDetails33 obj) {
			return obj.getTradeDate();
		}

		@Override
		public void setValue(SecuritiesFinancingTransactionDetails33 obj, Optional<TradeDate6Choice> value) {
			obj.setTradeDate(value.orElse(null));
		}
	};
	@XmlElement(name = "XpctdSttlmDt")
	protected DateAndDateTimeChoice expectedSettlementDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTimeChoice
	 * DateAndDateTimeChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Obligation#mmRequestedSettlementDate
	 * Obligation.mmRequestedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33
	 * SecuritiesFinancingTransactionDetails33}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XpctdSttlmDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpectedSettlementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date/time at which the sender expects settlement."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesFinancingTransactionDetails33, Optional<DateAndDateTimeChoice>> mmExpectedSettlementDate = new MMMessageAssociationEnd<SecuritiesFinancingTransactionDetails33, Optional<DateAndDateTimeChoice>>() {
		{
			businessElementTrace_lazy = () -> Obligation.mmRequestedSettlementDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33.mmObject();
			isDerived = false;
			xmlTag = "XpctdSttlmDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpectedSettlementDate";
			definition = "Date/time at which the sender expects settlement.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateAndDateTimeChoice.mmObject();
		}

		@Override
		public Optional<DateAndDateTimeChoice> getValue(SecuritiesFinancingTransactionDetails33 obj) {
			return obj.getExpectedSettlementDate();
		}

		@Override
		public void setValue(SecuritiesFinancingTransactionDetails33 obj, Optional<DateAndDateTimeChoice> value) {
			obj.setExpectedSettlementDate(value.orElse(null));
		}
	};
	@XmlElement(name = "XpctdValDt")
	protected DateAndDateTimeChoice expectedValueDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTimeChoice
	 * DateAndDateTimeChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmValueDate
	 * Payment.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33
	 * SecuritiesFinancingTransactionDetails33}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XpctdValDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpectedValueDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For against payment transactions, the value date/time at which the account servicer expects the settlement amount to be credited or debited."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesFinancingTransactionDetails33, Optional<DateAndDateTimeChoice>> mmExpectedValueDate = new MMMessageAssociationEnd<SecuritiesFinancingTransactionDetails33, Optional<DateAndDateTimeChoice>>() {
		{
			businessElementTrace_lazy = () -> Payment.mmValueDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33.mmObject();
			isDerived = false;
			xmlTag = "XpctdValDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpectedValueDate";
			definition = "For against payment transactions, the value date/time at which the account servicer expects the settlement amount to be credited or debited.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateAndDateTimeChoice.mmObject();
		}

		@Override
		public Optional<DateAndDateTimeChoice> getValue(SecuritiesFinancingTransactionDetails33 obj) {
			return obj.getExpectedValueDate();
		}

		@Override
		public void setValue(SecuritiesFinancingTransactionDetails33 obj, Optional<DateAndDateTimeChoice> value) {
			obj.setExpectedValueDate(value.orElse(null));
		}
	};
	@XmlElement(name = "LateDlvryDt")
	protected DateAndDateTimeChoice lateDeliveryDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33
	 * SecuritiesFinancingTransactionDetails33}</li>
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
	public static final MMMessageAssociationEnd<SecuritiesFinancingTransactionDetails33, Optional<DateAndDateTimeChoice>> mmLateDeliveryDate = new MMMessageAssociationEnd<SecuritiesFinancingTransactionDetails33, Optional<DateAndDateTimeChoice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTransfer.mmLateDeliveryDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33.mmObject();
			isDerived = false;
			xmlTag = "LateDlvryDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDate";
			definition = "Date and time after the settlement date specified in the trade, used for pool trades resulting from the original To Be Assigned (TBA) securities.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateAndDateTimeChoice.mmObject();
		}

		@Override
		public Optional<DateAndDateTimeChoice> getValue(SecuritiesFinancingTransactionDetails33 obj) {
			return obj.getLateDeliveryDate();
		}

		@Override
		public void setValue(SecuritiesFinancingTransactionDetails33 obj, Optional<DateAndDateTimeChoice> value) {
			obj.setLateDeliveryDate(value.orElse(null));
		}
	};
	@XmlElement(name = "RateChngDt")
	protected DateAndDateTimeChoice rateChangeDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTimeChoice
	 * DateAndDateTimeChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmRateChangeDateTime
	 * SecuritiesFinancing.mmRateChangeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33
	 * SecuritiesFinancingTransactionDetails33}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RateChngDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RateChangeDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date/Time at which rate change has taken place."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesFinancingTransactionDetails33, Optional<DateAndDateTimeChoice>> mmRateChangeDate = new MMMessageAssociationEnd<SecuritiesFinancingTransactionDetails33, Optional<DateAndDateTimeChoice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesFinancing.mmRateChangeDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33.mmObject();
			isDerived = false;
			xmlTag = "RateChngDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RateChangeDate";
			definition = "Date/Time at which rate change has taken place.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateAndDateTimeChoice.mmObject();
		}

		@Override
		public Optional<DateAndDateTimeChoice> getValue(SecuritiesFinancingTransactionDetails33 obj) {
			return obj.getRateChangeDate();
		}

		@Override
		public void setValue(SecuritiesFinancingTransactionDetails33 obj, Optional<DateAndDateTimeChoice> value) {
			obj.setRateChangeDate(value.orElse(null));
		}
	};
	@XmlElement(name = "SctiesFincgTxTp", required = true)
	protected SecuritiesFinancingTransactionType1Code securitiesFinancingTransactionType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesFinancingTransactionType1Code
	 * SecuritiesFinancingTransactionType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmSecuritiesTransactionType
	 * SecuritiesTrade.mmSecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33
	 * SecuritiesFinancingTransactionDetails33}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesFincgTxTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesFinancingTransactionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of securities financing transaction, that is, repurchase agreement, reverse repurchase agreement, securities lending or securities borrowing."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesFinancingTransactionDetails33, SecuritiesFinancingTransactionType1Code> mmSecuritiesFinancingTransactionType = new MMMessageAttribute<SecuritiesFinancingTransactionDetails33, SecuritiesFinancingTransactionType1Code>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTrade.mmSecuritiesTransactionType;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33.mmObject();
			isDerived = false;
			xmlTag = "SctiesFincgTxTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesFinancingTransactionType";
			definition = "Specifies the type of securities financing transaction, that is, repurchase agreement, reverse repurchase agreement, securities lending or securities borrowing.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SecuritiesFinancingTransactionType1Code.mmObject();
		}

		@Override
		public SecuritiesFinancingTransactionType1Code getValue(SecuritiesFinancingTransactionDetails33 obj) {
			return obj.getSecuritiesFinancingTransactionType();
		}

		@Override
		public void setValue(SecuritiesFinancingTransactionDetails33 obj, SecuritiesFinancingTransactionType1Code value) {
			obj.setSecuritiesFinancingTransactionType(value);
		}
	};
	@XmlElement(name = "SctiesMvmntTp", required = true)
	protected ReceiveDelivery1Code securitiesMovementType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ReceiveDelivery1Code
	 * ReceiveDelivery1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSecuritiesMovementType
	 * SecuritiesSettlement.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33
	 * SecuritiesFinancingTransactionDetails33}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesMvmntTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMovementType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies if the movement on a securities account results from a deliver or a receive instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesFinancingTransactionDetails33, ReceiveDelivery1Code> mmSecuritiesMovementType = new MMMessageAttribute<SecuritiesFinancingTransactionDetails33, ReceiveDelivery1Code>() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmSecuritiesMovementType;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33.mmObject();
			isDerived = false;
			xmlTag = "SctiesMvmntTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMovementType";
			definition = "Specifies if the movement on a securities account results from a deliver or a receive instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ReceiveDelivery1Code.mmObject();
		}

		@Override
		public ReceiveDelivery1Code getValue(SecuritiesFinancingTransactionDetails33 obj) {
			return obj.getSecuritiesMovementType();
		}

		@Override
		public void setValue(SecuritiesFinancingTransactionDetails33 obj, ReceiveDelivery1Code value) {
			obj.setSecuritiesMovementType(value);
		}
	};
	@XmlElement(name = "Pmt", required = true)
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSettlementType
	 * SecuritiesSettlement.mmSettlementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33
	 * SecuritiesFinancingTransactionDetails33}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesFinancingTransactionDetails33, DeliveryReceiptType2Code> mmPayment = new MMMessageAttribute<SecuritiesFinancingTransactionDetails33, DeliveryReceiptType2Code>() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmSettlementType;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33.mmObject();
			isDerived = false;
			xmlTag = "Pmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Payment";
			definition = "Specifies how the transaction is to be settled, for example, against payment.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DeliveryReceiptType2Code.mmObject();
		}

		@Override
		public DeliveryReceiptType2Code getValue(SecuritiesFinancingTransactionDetails33 obj) {
			return obj.getPayment();
		}

		@Override
		public void setValue(SecuritiesFinancingTransactionDetails33 obj, DeliveryReceiptType2Code value) {
			obj.setPayment(value);
		}
	};
	@XmlElement(name = "SttlmParams")
	protected SettlementDetails107 settlementParameters;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SettlementDetails107
	 * SettlementDetails107}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33
	 * SecuritiesFinancingTransactionDetails33}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmParams"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Parameters applied to the settlement of a security transfer."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesFinancingTransactionDetails33, Optional<SettlementDetails107>> mmSettlementParameters = new MMMessageAssociationEnd<SecuritiesFinancingTransactionDetails33, Optional<SettlementDetails107>>() {
		{
			businessComponentTrace_lazy = () -> SecuritiesSettlement.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33.mmObject();
			isDerived = false;
			xmlTag = "SttlmParams";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementParameters";
			definition = "Parameters applied to the settlement of a security transfer.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SettlementDetails107.mmObject();
		}

		@Override
		public Optional<SettlementDetails107> getValue(SecuritiesFinancingTransactionDetails33 obj) {
			return obj.getSettlementParameters();
		}

		@Override
		public void setValue(SecuritiesFinancingTransactionDetails33 obj, Optional<SettlementDetails107> value) {
			obj.setSettlementParameters(value.orElse(null));
		}
	};
	@XmlElement(name = "RateTp")
	protected RateType67Choice rateType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.RateType67Choice
	 * RateType67Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmRateType
	 * InterestCalculation.mmRateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33
	 * SecuritiesFinancingTransactionDetails33}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RateTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RateType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies whether the rate is fixed or variable."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesFinancingTransactionDetails33, Optional<RateType67Choice>> mmRateType = new MMMessageAssociationEnd<SecuritiesFinancingTransactionDetails33, Optional<RateType67Choice>>() {
		{
			businessElementTrace_lazy = () -> InterestCalculation.mmRateType;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33.mmObject();
			isDerived = false;
			xmlTag = "RateTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RateType";
			definition = "Specifies whether the rate is fixed or variable.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RateType67Choice.mmObject();
		}

		@Override
		public Optional<RateType67Choice> getValue(SecuritiesFinancingTransactionDetails33 obj) {
			return obj.getRateType();
		}

		@Override
		public void setValue(SecuritiesFinancingTransactionDetails33 obj, Optional<RateType67Choice> value) {
			obj.setRateType(value.orElse(null));
		}
	};
	@XmlElement(name = "VarblRateSpprt")
	protected RateName2 variableRateSupport;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.RateName2 RateName2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmVariableRateSupport
	 * SecuritiesFinancing.mmVariableRateSupport}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33
	 * SecuritiesFinancingTransactionDetails33}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VarblRateSpprt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VariableRateSupport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Index or support rate used together with the spread to calculate the\nrepurchase rate."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesFinancingTransactionDetails33, Optional<RateName2>> mmVariableRateSupport = new MMMessageAssociationEnd<SecuritiesFinancingTransactionDetails33, Optional<RateName2>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesFinancing.mmVariableRateSupport;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33.mmObject();
			isDerived = false;
			xmlTag = "VarblRateSpprt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VariableRateSupport";
			definition = "Index or support rate used together with the spread to calculate the\nrepurchase rate.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RateName2.mmObject();
		}

		@Override
		public Optional<RateName2> getValue(SecuritiesFinancingTransactionDetails33 obj) {
			return obj.getVariableRateSupport();
		}

		@Override
		public void setValue(SecuritiesFinancingTransactionDetails33 obj, Optional<RateName2> value) {
			obj.setVariableRateSupport(value.orElse(null));
		}
	};
	@XmlElement(name = "RpRate")
	protected Rate2 repurchaseRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Rate2 Rate2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmRepurchaseRate
	 * SecuritiesFinancing.mmRepurchaseRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33
	 * SecuritiesFinancingTransactionDetails33}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RpRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepurchaseRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Rate to be used to recalculate the repurchase amount."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesFinancingTransactionDetails33, Optional<Rate2>> mmRepurchaseRate = new MMMessageAssociationEnd<SecuritiesFinancingTransactionDetails33, Optional<Rate2>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesFinancing.mmRepurchaseRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33.mmObject();
			isDerived = false;
			xmlTag = "RpRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepurchaseRate";
			definition = "Rate to be used to recalculate the repurchase amount.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Rate2.mmObject();
		}

		@Override
		public Optional<Rate2> getValue(SecuritiesFinancingTransactionDetails33 obj) {
			return obj.getRepurchaseRate();
		}

		@Override
		public void setValue(SecuritiesFinancingTransactionDetails33 obj, Optional<Rate2> value) {
			obj.setRepurchaseRate(value.orElse(null));
		}
	};
	@XmlElement(name = "StockLnMrgn")
	protected Rate2 stockLoanMargin;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Rate2 Rate2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmStockLoanMargin
	 * SecuritiesFinancing.mmStockLoanMargin}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33
	 * SecuritiesFinancingTransactionDetails33}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StockLnMrgn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StockLoanMargin"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Percentage mark-up on a loan consideration used to reflect the lender's risk."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesFinancingTransactionDetails33, Optional<Rate2>> mmStockLoanMargin = new MMMessageAssociationEnd<SecuritiesFinancingTransactionDetails33, Optional<Rate2>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesFinancing.mmStockLoanMargin;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33.mmObject();
			isDerived = false;
			xmlTag = "StockLnMrgn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StockLoanMargin";
			definition = "Percentage mark-up on a loan consideration used to reflect the lender's risk.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Rate2.mmObject();
		}

		@Override
		public Optional<Rate2> getValue(SecuritiesFinancingTransactionDetails33 obj) {
			return obj.getStockLoanMargin();
		}

		@Override
		public void setValue(SecuritiesFinancingTransactionDetails33 obj, Optional<Rate2> value) {
			obj.setStockLoanMargin(value.orElse(null));
		}
	};
	@XmlElement(name = "SctiesHrcut")
	protected Rate2 securitiesHaircut;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Rate2 Rate2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding#mmHaircut
	 * AssetHolding.mmHaircut}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33
	 * SecuritiesFinancingTransactionDetails33}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesHrcut"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesHaircut"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Haircut or valuation factor on the security expressed as a percentage."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesFinancingTransactionDetails33, Optional<Rate2>> mmSecuritiesHaircut = new MMMessageAssociationEnd<SecuritiesFinancingTransactionDetails33, Optional<Rate2>>() {
		{
			businessElementTrace_lazy = () -> AssetHolding.mmHaircut;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33.mmObject();
			isDerived = false;
			xmlTag = "SctiesHrcut";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesHaircut";
			definition = "Haircut or valuation factor on the security expressed as a percentage.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Rate2.mmObject();
		}

		@Override
		public Optional<Rate2> getValue(SecuritiesFinancingTransactionDetails33 obj) {
			return obj.getSecuritiesHaircut();
		}

		@Override
		public void setValue(SecuritiesFinancingTransactionDetails33 obj, Optional<Rate2> value) {
			obj.setSecuritiesHaircut(value.orElse(null));
		}
	};
	@XmlElement(name = "PricgRate")
	protected RateOrName2Choice pricingRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.RateOrName2Choice
	 * RateOrName2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmInterest
	 * SecuritiesFinancing.mmInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33
	 * SecuritiesFinancingTransactionDetails33}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PricgRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PricingRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Interest rate to be paid on the transaction amount, as agreed between the counterparties."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesFinancingTransactionDetails33, Optional<RateOrName2Choice>> mmPricingRate = new MMMessageAssociationEnd<SecuritiesFinancingTransactionDetails33, Optional<RateOrName2Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesFinancing.mmInterest;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33.mmObject();
			isDerived = false;
			xmlTag = "PricgRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PricingRate";
			definition = "Interest rate to be paid on the transaction amount, as agreed between the counterparties.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RateOrName2Choice.mmObject();
		}

		@Override
		public Optional<RateOrName2Choice> getValue(SecuritiesFinancingTransactionDetails33 obj) {
			return obj.getPricingRate();
		}

		@Override
		public void setValue(SecuritiesFinancingTransactionDetails33 obj, Optional<RateOrName2Choice> value) {
			obj.setPricingRate(value.orElse(null));
		}
	};
	@XmlElement(name = "Sprd")
	protected Rate2 spread;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Rate2 Rate2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmRepurchaseSpread
	 * SecuritiesFinancing.mmRepurchaseSpread}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33
	 * SecuritiesFinancingTransactionDetails33}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sprd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Spread"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Repurchase spread expressed as a rate; margin over or under an index that determines the repurchase rate."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesFinancingTransactionDetails33, Optional<Rate2>> mmSpread = new MMMessageAssociationEnd<SecuritiesFinancingTransactionDetails33, Optional<Rate2>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesFinancing.mmRepurchaseSpread;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33.mmObject();
			isDerived = false;
			xmlTag = "Sprd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Spread";
			definition = "Repurchase spread expressed as a rate; margin over or under an index that determines the repurchase rate.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Rate2.mmObject();
		}

		@Override
		public Optional<Rate2> getValue(SecuritiesFinancingTransactionDetails33 obj) {
			return obj.getSpread();
		}

		@Override
		public void setValue(SecuritiesFinancingTransactionDetails33 obj, Optional<Rate2> value) {
			obj.setSpread(value.orElse(null));
		}
	};
	@XmlElement(name = "DlvrgSttlmPties")
	protected SettlementParties44 deliveringSettlementParties;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SettlementParties44
	 * SettlementParties44}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.DeliveringSettlementParty
	 * DeliveringSettlementParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33
	 * SecuritiesFinancingTransactionDetails33}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DlvrgSttlmPties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveringSettlementParties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the chain of delivering settlement parties."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesFinancingTransactionDetails33, Optional<SettlementParties44>> mmDeliveringSettlementParties = new MMMessageAssociationEnd<SecuritiesFinancingTransactionDetails33, Optional<SettlementParties44>>() {
		{
			businessComponentTrace_lazy = () -> DeliveringSettlementParty.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33.mmObject();
			isDerived = false;
			xmlTag = "DlvrgSttlmPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveringSettlementParties";
			definition = "Identifies the chain of delivering settlement parties.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SettlementParties44.mmObject();
		}

		@Override
		public Optional<SettlementParties44> getValue(SecuritiesFinancingTransactionDetails33 obj) {
			return obj.getDeliveringSettlementParties();
		}

		@Override
		public void setValue(SecuritiesFinancingTransactionDetails33 obj, Optional<SettlementParties44> value) {
			obj.setDeliveringSettlementParties(value.orElse(null));
		}
	};
	@XmlElement(name = "RcvgSttlmPties")
	protected SettlementParties44 receivingSettlementParties;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SettlementParties44
	 * SettlementParties44}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.ReceivingSettlementParty
	 * ReceivingSettlementParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33
	 * SecuritiesFinancingTransactionDetails33}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcvgSttlmPties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingSettlementParties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the chain of receiving settlement parties."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesFinancingTransactionDetails33, Optional<SettlementParties44>> mmReceivingSettlementParties = new MMMessageAssociationEnd<SecuritiesFinancingTransactionDetails33, Optional<SettlementParties44>>() {
		{
			businessComponentTrace_lazy = () -> ReceivingSettlementParty.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33.mmObject();
			isDerived = false;
			xmlTag = "RcvgSttlmPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingSettlementParties";
			definition = "Identifies the chain of receiving settlement parties.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SettlementParties44.mmObject();
		}

		@Override
		public Optional<SettlementParties44> getValue(SecuritiesFinancingTransactionDetails33 obj) {
			return obj.getReceivingSettlementParties();
		}

		@Override
		public void setValue(SecuritiesFinancingTransactionDetails33 obj, Optional<SettlementParties44> value) {
			obj.setReceivingSettlementParties(value.orElse(null));
		}
	};
	@XmlElement(name = "Invstr")
	protected PartyIdentification110 investor;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification110
	 * PartyIdentification110}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33
	 * SecuritiesFinancingTransactionDetails33}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Invstr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Investor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party, either an individual or organisation, whose assets are being invested."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesFinancingTransactionDetails33, Optional<PartyIdentification110>> mmInvestor = new MMMessageAssociationEnd<SecuritiesFinancingTransactionDetails33, Optional<PartyIdentification110>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33.mmObject();
			isDerived = false;
			xmlTag = "Invstr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Investor";
			definition = "Party, either an individual or organisation, whose assets are being invested.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification110.mmObject();
		}

		@Override
		public Optional<PartyIdentification110> getValue(SecuritiesFinancingTransactionDetails33 obj) {
			return obj.getInvestor();
		}

		@Override
		public void setValue(SecuritiesFinancingTransactionDetails33 obj, Optional<PartyIdentification110> value) {
			obj.setInvestor(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33
	 * SecuritiesFinancingTransactionDetails33}</li>
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
	public static final MMMessageAttribute<SecuritiesFinancingTransactionDetails33, Optional<RestrictedFINXMax350Text>> mmSettlementInstructionProcessingAdditionalDetails = new MMMessageAttribute<SecuritiesFinancingTransactionDetails33, Optional<RestrictedFINXMax350Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33.mmObject();
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
		public Optional<RestrictedFINXMax350Text> getValue(SecuritiesFinancingTransactionDetails33 obj) {
			return obj.getSettlementInstructionProcessingAdditionalDetails();
		}

		@Override
		public void setValue(SecuritiesFinancingTransactionDetails33 obj, Optional<RestrictedFINXMax350Text> value) {
			obj.setSettlementInstructionProcessingAdditionalDetails(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33.mmSecuritiesFinancingTradeIdentification,
						com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33.mmClosingLegIdentification, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33.mmPoolIdentification,
						com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33.mmCorporateActionEventIdentification,
						com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33.mmTripartyAgentCollateralTransactionIdentification,
						com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33.mmClientTripartyCollateralTransactionIdentification, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33.mmAccountOwner,
						com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33.mmSafekeepingAccount, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33.mmSafekeepingPlace,
						com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33.mmPlaceOfTrade, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33.mmFinancialInstrumentIdentification,
						com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33.mmSettlementQuantity, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33.mmOpeningSettlementAmount,
						com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33.mmTerminationTransactionAmount, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33.mmOpeningSettlementDate,
						com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33.mmTerminationDate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33.mmTradeDate,
						com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33.mmExpectedSettlementDate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33.mmExpectedValueDate,
						com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33.mmLateDeliveryDate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33.mmRateChangeDate,
						com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33.mmSecuritiesFinancingTransactionType, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33.mmSecuritiesMovementType,
						com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33.mmPayment, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33.mmSettlementParameters,
						com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33.mmRateType, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33.mmVariableRateSupport,
						com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33.mmRepurchaseRate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33.mmStockLoanMargin,
						com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33.mmSecuritiesHaircut, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33.mmPricingRate,
						com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33.mmSpread, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33.mmDeliveringSettlementParties,
						com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33.mmReceivingSettlementParties, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33.mmInvestor,
						com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33.mmSettlementInstructionProcessingAdditionalDetails);
				messageBuildingBlock_lazy = () -> Arrays.asList(SecuritiesFinancingStatusAdvice002V06.mmTransactionDetails);
				trace_lazy = () -> SecuritiesFinancing.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosingRule.forSecuritiesFinancingTransactionDetails33,
						com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule.forSecuritiesFinancingTransactionDetails33);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesFinancingTransactionDetails33";
				definition = "Details of the closing of the securities financing transaction.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<RestrictedFINXMax16Text> getSecuritiesFinancingTradeIdentification() {
		return securitiesFinancingTradeIdentification == null ? Optional.empty() : Optional.of(securitiesFinancingTradeIdentification);
	}

	public SecuritiesFinancingTransactionDetails33 setSecuritiesFinancingTradeIdentification(RestrictedFINXMax16Text securitiesFinancingTradeIdentification) {
		this.securitiesFinancingTradeIdentification = securitiesFinancingTradeIdentification;
		return this;
	}

	public Optional<RestrictedFINXMax16Text> getClosingLegIdentification() {
		return closingLegIdentification == null ? Optional.empty() : Optional.of(closingLegIdentification);
	}

	public SecuritiesFinancingTransactionDetails33 setClosingLegIdentification(RestrictedFINXMax16Text closingLegIdentification) {
		this.closingLegIdentification = closingLegIdentification;
		return this;
	}

	public Optional<RestrictedFINXMax16Text> getPoolIdentification() {
		return poolIdentification == null ? Optional.empty() : Optional.of(poolIdentification);
	}

	public SecuritiesFinancingTransactionDetails33 setPoolIdentification(RestrictedFINXMax16Text poolIdentification) {
		this.poolIdentification = poolIdentification;
		return this;
	}

	public Optional<RestrictedFINXMax16Text> getCorporateActionEventIdentification() {
		return corporateActionEventIdentification == null ? Optional.empty() : Optional.of(corporateActionEventIdentification);
	}

	public SecuritiesFinancingTransactionDetails33 setCorporateActionEventIdentification(RestrictedFINXMax16Text corporateActionEventIdentification) {
		this.corporateActionEventIdentification = corporateActionEventIdentification;
		return this;
	}

	public Optional<RestrictedFINXMax16Text> getTripartyAgentCollateralTransactionIdentification() {
		return tripartyAgentCollateralTransactionIdentification == null ? Optional.empty() : Optional.of(tripartyAgentCollateralTransactionIdentification);
	}

	public SecuritiesFinancingTransactionDetails33 setTripartyAgentCollateralTransactionIdentification(RestrictedFINXMax16Text tripartyAgentCollateralTransactionIdentification) {
		this.tripartyAgentCollateralTransactionIdentification = tripartyAgentCollateralTransactionIdentification;
		return this;
	}

	public Optional<RestrictedFINXMax16Text> getClientTripartyCollateralTransactionIdentification() {
		return clientTripartyCollateralTransactionIdentification == null ? Optional.empty() : Optional.of(clientTripartyCollateralTransactionIdentification);
	}

	public SecuritiesFinancingTransactionDetails33 setClientTripartyCollateralTransactionIdentification(RestrictedFINXMax16Text clientTripartyCollateralTransactionIdentification) {
		this.clientTripartyCollateralTransactionIdentification = clientTripartyCollateralTransactionIdentification;
		return this;
	}

	public Optional<PartyIdentification109> getAccountOwner() {
		return accountOwner == null ? Optional.empty() : Optional.of(accountOwner);
	}

	public SecuritiesFinancingTransactionDetails33 setAccountOwner(PartyIdentification109 accountOwner) {
		this.accountOwner = accountOwner;
		return this;
	}

	public SecuritiesAccount30 getSafekeepingAccount() {
		return safekeepingAccount;
	}

	public SecuritiesFinancingTransactionDetails33 setSafekeepingAccount(SecuritiesAccount30 safekeepingAccount) {
		this.safekeepingAccount = Objects.requireNonNull(safekeepingAccount);
		return this;
	}

	public Optional<SafeKeepingPlace2> getSafekeepingPlace() {
		return safekeepingPlace == null ? Optional.empty() : Optional.of(safekeepingPlace);
	}

	public SecuritiesFinancingTransactionDetails33 setSafekeepingPlace(SafeKeepingPlace2 safekeepingPlace) {
		this.safekeepingPlace = safekeepingPlace;
		return this;
	}

	public Optional<PlaceOfTradeIdentification2> getPlaceOfTrade() {
		return placeOfTrade == null ? Optional.empty() : Optional.of(placeOfTrade);
	}

	public SecuritiesFinancingTransactionDetails33 setPlaceOfTrade(PlaceOfTradeIdentification2 placeOfTrade) {
		this.placeOfTrade = placeOfTrade;
		return this;
	}

	public SecurityIdentification20 getFinancialInstrumentIdentification() {
		return financialInstrumentIdentification;
	}

	public SecuritiesFinancingTransactionDetails33 setFinancialInstrumentIdentification(SecurityIdentification20 financialInstrumentIdentification) {
		this.financialInstrumentIdentification = Objects.requireNonNull(financialInstrumentIdentification);
		return this;
	}

	public Quantity10Choice getSettlementQuantity() {
		return settlementQuantity;
	}

	public SecuritiesFinancingTransactionDetails33 setSettlementQuantity(Quantity10Choice settlementQuantity) {
		this.settlementQuantity = Objects.requireNonNull(settlementQuantity);
		return this;
	}

	public Optional<AmountAndDirection67> getOpeningSettlementAmount() {
		return openingSettlementAmount == null ? Optional.empty() : Optional.of(openingSettlementAmount);
	}

	public SecuritiesFinancingTransactionDetails33 setOpeningSettlementAmount(AmountAndDirection67 openingSettlementAmount) {
		this.openingSettlementAmount = openingSettlementAmount;
		return this;
	}

	public Optional<AmountAndDirection59> getTerminationTransactionAmount() {
		return terminationTransactionAmount == null ? Optional.empty() : Optional.of(terminationTransactionAmount);
	}

	public SecuritiesFinancingTransactionDetails33 setTerminationTransactionAmount(AmountAndDirection59 terminationTransactionAmount) {
		this.terminationTransactionAmount = terminationTransactionAmount;
		return this;
	}

	public SettlementDate15Choice getOpeningSettlementDate() {
		return openingSettlementDate;
	}

	public SecuritiesFinancingTransactionDetails33 setOpeningSettlementDate(SettlementDate15Choice openingSettlementDate) {
		this.openingSettlementDate = Objects.requireNonNull(openingSettlementDate);
		return this;
	}

	public Optional<TerminationDate5Choice> getTerminationDate() {
		return terminationDate == null ? Optional.empty() : Optional.of(terminationDate);
	}

	public SecuritiesFinancingTransactionDetails33 setTerminationDate(TerminationDate5Choice terminationDate) {
		this.terminationDate = terminationDate;
		return this;
	}

	public Optional<TradeDate6Choice> getTradeDate() {
		return tradeDate == null ? Optional.empty() : Optional.of(tradeDate);
	}

	public SecuritiesFinancingTransactionDetails33 setTradeDate(TradeDate6Choice tradeDate) {
		this.tradeDate = tradeDate;
		return this;
	}

	public Optional<DateAndDateTimeChoice> getExpectedSettlementDate() {
		return expectedSettlementDate == null ? Optional.empty() : Optional.of(expectedSettlementDate);
	}

	public SecuritiesFinancingTransactionDetails33 setExpectedSettlementDate(DateAndDateTimeChoice expectedSettlementDate) {
		this.expectedSettlementDate = expectedSettlementDate;
		return this;
	}

	public Optional<DateAndDateTimeChoice> getExpectedValueDate() {
		return expectedValueDate == null ? Optional.empty() : Optional.of(expectedValueDate);
	}

	public SecuritiesFinancingTransactionDetails33 setExpectedValueDate(DateAndDateTimeChoice expectedValueDate) {
		this.expectedValueDate = expectedValueDate;
		return this;
	}

	public Optional<DateAndDateTimeChoice> getLateDeliveryDate() {
		return lateDeliveryDate == null ? Optional.empty() : Optional.of(lateDeliveryDate);
	}

	public SecuritiesFinancingTransactionDetails33 setLateDeliveryDate(DateAndDateTimeChoice lateDeliveryDate) {
		this.lateDeliveryDate = lateDeliveryDate;
		return this;
	}

	public Optional<DateAndDateTimeChoice> getRateChangeDate() {
		return rateChangeDate == null ? Optional.empty() : Optional.of(rateChangeDate);
	}

	public SecuritiesFinancingTransactionDetails33 setRateChangeDate(DateAndDateTimeChoice rateChangeDate) {
		this.rateChangeDate = rateChangeDate;
		return this;
	}

	public SecuritiesFinancingTransactionType1Code getSecuritiesFinancingTransactionType() {
		return securitiesFinancingTransactionType;
	}

	public SecuritiesFinancingTransactionDetails33 setSecuritiesFinancingTransactionType(SecuritiesFinancingTransactionType1Code securitiesFinancingTransactionType) {
		this.securitiesFinancingTransactionType = Objects.requireNonNull(securitiesFinancingTransactionType);
		return this;
	}

	public ReceiveDelivery1Code getSecuritiesMovementType() {
		return securitiesMovementType;
	}

	public SecuritiesFinancingTransactionDetails33 setSecuritiesMovementType(ReceiveDelivery1Code securitiesMovementType) {
		this.securitiesMovementType = Objects.requireNonNull(securitiesMovementType);
		return this;
	}

	public DeliveryReceiptType2Code getPayment() {
		return payment;
	}

	public SecuritiesFinancingTransactionDetails33 setPayment(DeliveryReceiptType2Code payment) {
		this.payment = Objects.requireNonNull(payment);
		return this;
	}

	public Optional<SettlementDetails107> getSettlementParameters() {
		return settlementParameters == null ? Optional.empty() : Optional.of(settlementParameters);
	}

	public SecuritiesFinancingTransactionDetails33 setSettlementParameters(SettlementDetails107 settlementParameters) {
		this.settlementParameters = settlementParameters;
		return this;
	}

	public Optional<RateType67Choice> getRateType() {
		return rateType == null ? Optional.empty() : Optional.of(rateType);
	}

	public SecuritiesFinancingTransactionDetails33 setRateType(RateType67Choice rateType) {
		this.rateType = rateType;
		return this;
	}

	public Optional<RateName2> getVariableRateSupport() {
		return variableRateSupport == null ? Optional.empty() : Optional.of(variableRateSupport);
	}

	public SecuritiesFinancingTransactionDetails33 setVariableRateSupport(RateName2 variableRateSupport) {
		this.variableRateSupport = variableRateSupport;
		return this;
	}

	public Optional<Rate2> getRepurchaseRate() {
		return repurchaseRate == null ? Optional.empty() : Optional.of(repurchaseRate);
	}

	public SecuritiesFinancingTransactionDetails33 setRepurchaseRate(Rate2 repurchaseRate) {
		this.repurchaseRate = repurchaseRate;
		return this;
	}

	public Optional<Rate2> getStockLoanMargin() {
		return stockLoanMargin == null ? Optional.empty() : Optional.of(stockLoanMargin);
	}

	public SecuritiesFinancingTransactionDetails33 setStockLoanMargin(Rate2 stockLoanMargin) {
		this.stockLoanMargin = stockLoanMargin;
		return this;
	}

	public Optional<Rate2> getSecuritiesHaircut() {
		return securitiesHaircut == null ? Optional.empty() : Optional.of(securitiesHaircut);
	}

	public SecuritiesFinancingTransactionDetails33 setSecuritiesHaircut(Rate2 securitiesHaircut) {
		this.securitiesHaircut = securitiesHaircut;
		return this;
	}

	public Optional<RateOrName2Choice> getPricingRate() {
		return pricingRate == null ? Optional.empty() : Optional.of(pricingRate);
	}

	public SecuritiesFinancingTransactionDetails33 setPricingRate(RateOrName2Choice pricingRate) {
		this.pricingRate = pricingRate;
		return this;
	}

	public Optional<Rate2> getSpread() {
		return spread == null ? Optional.empty() : Optional.of(spread);
	}

	public SecuritiesFinancingTransactionDetails33 setSpread(Rate2 spread) {
		this.spread = spread;
		return this;
	}

	public Optional<SettlementParties44> getDeliveringSettlementParties() {
		return deliveringSettlementParties == null ? Optional.empty() : Optional.of(deliveringSettlementParties);
	}

	public SecuritiesFinancingTransactionDetails33 setDeliveringSettlementParties(SettlementParties44 deliveringSettlementParties) {
		this.deliveringSettlementParties = deliveringSettlementParties;
		return this;
	}

	public Optional<SettlementParties44> getReceivingSettlementParties() {
		return receivingSettlementParties == null ? Optional.empty() : Optional.of(receivingSettlementParties);
	}

	public SecuritiesFinancingTransactionDetails33 setReceivingSettlementParties(SettlementParties44 receivingSettlementParties) {
		this.receivingSettlementParties = receivingSettlementParties;
		return this;
	}

	public Optional<PartyIdentification110> getInvestor() {
		return investor == null ? Optional.empty() : Optional.of(investor);
	}

	public SecuritiesFinancingTransactionDetails33 setInvestor(PartyIdentification110 investor) {
		this.investor = investor;
		return this;
	}

	public Optional<RestrictedFINXMax350Text> getSettlementInstructionProcessingAdditionalDetails() {
		return settlementInstructionProcessingAdditionalDetails == null ? Optional.empty() : Optional.of(settlementInstructionProcessingAdditionalDetails);
	}

	public SecuritiesFinancingTransactionDetails33 setSettlementInstructionProcessingAdditionalDetails(RestrictedFINXMax350Text settlementInstructionProcessingAdditionalDetails) {
		this.settlementInstructionProcessingAdditionalDetails = settlementInstructionProcessingAdditionalDetails;
		return this;
	}
}