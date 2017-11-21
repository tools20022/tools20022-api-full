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
import com.tools20022.repository.area.sese.SecuritiesFinancingStatusAdviceV07;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.DeliveryReceiptType2Code;
import com.tools20022.repository.codeset.ReceiveDelivery1Code;
import com.tools20022.repository.codeset.SecuritiesFinancingTransactionType2Code;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
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
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35#mmSecuritiesFinancingTradeIdentification
 * SecuritiesFinancingTransactionDetails35.
 * mmSecuritiesFinancingTradeIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35#mmClosingLegIdentification
 * SecuritiesFinancingTransactionDetails35.mmClosingLegIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35#mmPoolIdentification
 * SecuritiesFinancingTransactionDetails35.mmPoolIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35#mmCorporateActionEventIdentification
 * SecuritiesFinancingTransactionDetails35.mmCorporateActionEventIdentification}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35#mmTripartyAgentServiceProviderCollateralTransactionIdentification
 * SecuritiesFinancingTransactionDetails35.
 * mmTripartyAgentServiceProviderCollateralTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35#mmClientTripartyCollateralTransactionIdentification
 * SecuritiesFinancingTransactionDetails35.
 * mmClientTripartyCollateralTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35#mmAccountOwner
 * SecuritiesFinancingTransactionDetails35.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35#mmSafekeepingAccount
 * SecuritiesFinancingTransactionDetails35.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35#mmSafekeepingPlace
 * SecuritiesFinancingTransactionDetails35.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35#mmPlaceOfTrade
 * SecuritiesFinancingTransactionDetails35.mmPlaceOfTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35#mmFinancialInstrumentIdentification
 * SecuritiesFinancingTransactionDetails35.mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35#mmSettlementQuantity
 * SecuritiesFinancingTransactionDetails35.mmSettlementQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35#mmOpeningSettlementAmount
 * SecuritiesFinancingTransactionDetails35.mmOpeningSettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35#mmTerminationTransactionAmount
 * SecuritiesFinancingTransactionDetails35.mmTerminationTransactionAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35#mmOpeningSettlementDate
 * SecuritiesFinancingTransactionDetails35.mmOpeningSettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35#mmTerminationDate
 * SecuritiesFinancingTransactionDetails35.mmTerminationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35#mmTradeDate
 * SecuritiesFinancingTransactionDetails35.mmTradeDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35#mmExpectedSettlementDate
 * SecuritiesFinancingTransactionDetails35.mmExpectedSettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35#mmExpectedValueDate
 * SecuritiesFinancingTransactionDetails35.mmExpectedValueDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35#mmLateDeliveryDate
 * SecuritiesFinancingTransactionDetails35.mmLateDeliveryDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35#mmRateChangeDate
 * SecuritiesFinancingTransactionDetails35.mmRateChangeDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35#mmSecuritiesFinancingTransactionType
 * SecuritiesFinancingTransactionDetails35.mmSecuritiesFinancingTransactionType}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35#mmSecuritiesMovementType
 * SecuritiesFinancingTransactionDetails35.mmSecuritiesMovementType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35#mmPayment
 * SecuritiesFinancingTransactionDetails35.mmPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35#mmSettlementParameters
 * SecuritiesFinancingTransactionDetails35.mmSettlementParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35#mmRateType
 * SecuritiesFinancingTransactionDetails35.mmRateType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35#mmVariableRateSupport
 * SecuritiesFinancingTransactionDetails35.mmVariableRateSupport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35#mmRepurchaseRate
 * SecuritiesFinancingTransactionDetails35.mmRepurchaseRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35#mmStockLoanMargin
 * SecuritiesFinancingTransactionDetails35.mmStockLoanMargin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35#mmSecuritiesHaircut
 * SecuritiesFinancingTransactionDetails35.mmSecuritiesHaircut}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35#mmPricingRate
 * SecuritiesFinancingTransactionDetails35.mmPricingRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35#mmSpread
 * SecuritiesFinancingTransactionDetails35.mmSpread}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35#mmDeliveringSettlementParties
 * SecuritiesFinancingTransactionDetails35.mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35#mmReceivingSettlementParties
 * SecuritiesFinancingTransactionDetails35.mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35#mmInvestor
 * SecuritiesFinancingTransactionDetails35.mmInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35#mmSettlementInstructionProcessingAdditionalDetails
 * SecuritiesFinancingTransactionDetails35.
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
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingStatusAdviceV07#mmTransactionDetails
 * SecuritiesFinancingStatusAdviceV07.mmTransactionDetails}</li>
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
 * "SecuritiesFinancingTransactionDetails35"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Details of the closing of the securities financing transaction."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26
 * SecuritiesFinancingTransactionDetails26}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "SecuritiesFinancingTransactionDetails35", propOrder = {"securitiesFinancingTradeIdentification", "closingLegIdentification", "poolIdentification", "corporateActionEventIdentification",
		"tripartyAgentServiceProviderCollateralTransactionIdentification", "clientTripartyCollateralTransactionIdentification", "accountOwner", "safekeepingAccount", "safekeepingPlace", "placeOfTrade", "financialInstrumentIdentification",
		"settlementQuantity", "openingSettlementAmount", "terminationTransactionAmount", "openingSettlementDate", "terminationDate", "tradeDate", "expectedSettlementDate", "expectedValueDate", "lateDeliveryDate", "rateChangeDate",
		"securitiesFinancingTransactionType", "securitiesMovementType", "payment", "settlementParameters", "rateType", "variableRateSupport", "repurchaseRate", "stockLoanMargin", "securitiesHaircut", "pricingRate", "spread",
		"deliveringSettlementParties", "receivingSettlementParties", "investor", "settlementInstructionProcessingAdditionalDetails"})
public class SecuritiesFinancingTransactionDetails35 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text securitiesFinancingTradeIdentification;
	/**
	 * Unambiguous identification of the underlying securities financing trade
	 * as assigned by the instructing party. The identification is common to all
	 * collateral pieces (one or many).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35
	 * SecuritiesFinancingTransactionDetails35}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26#mmSecuritiesFinancingTradeIdentification
	 * SecuritiesFinancingTransactionDetails26.
	 * mmSecuritiesFinancingTradeIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSecuritiesFinancingTradeIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SecuritiesFinancingTransactionDetails35.mmObject();
			isDerived = false;
			xmlTag = "SctiesFincgTradId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesFinancingTradeIdentification";
			definition = "Unambiguous identification of the underlying securities financing trade as assigned by the instructing party. The identification is common to all collateral pieces (one or many).";
			previousVersion_lazy = () -> SecuritiesFinancingTransactionDetails26.mmSecuritiesFinancingTradeIdentification;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35
	 * SecuritiesFinancingTransactionDetails35}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26#mmClosingLegIdentification
	 * SecuritiesFinancingTransactionDetails26.mmClosingLegIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmClosingLegIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SecuritiesFinancingTransactionDetails35.mmObject();
			isDerived = false;
			xmlTag = "ClsgLegId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClosingLegIdentification";
			definition = "Unambiguous identification of the second leg of the transaction as known by the account owner (or the instructing party acting on its behalf).";
			previousVersion_lazy = () -> SecuritiesFinancingTransactionDetails26.mmClosingLegIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text poolIdentification;
	/**
	 * Collective reference identifying a set of messages.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification#mmPoolIdentification
	 * SecuritiesTradeIdentification.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35
	 * SecuritiesFinancingTransactionDetails35}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26#mmPoolIdentification
	 * SecuritiesFinancingTransactionDetails26.mmPoolIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPoolIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeIdentification.mmPoolIdentification;
			componentContext_lazy = () -> SecuritiesFinancingTransactionDetails35.mmObject();
			isDerived = false;
			xmlTag = "PoolId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PoolIdentification";
			definition = "Collective reference identifying a set of messages.";
			previousVersion_lazy = () -> SecuritiesFinancingTransactionDetails26.mmPoolIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text corporateActionEventIdentification;
	/**
	 * Identification assigned by the account servicer to unambiguously identify
	 * a corporate action event.
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
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEventRegistration#mmCorporateActionEventIdentification
	 * CorporateActionEventRegistration.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35
	 * SecuritiesFinancingTransactionDetails35}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26#mmCorporateActionEventIdentification
	 * SecuritiesFinancingTransactionDetails26.
	 * mmCorporateActionEventIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCorporateActionEventIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionEventRegistration.mmCorporateActionEventIdentification;
			componentContext_lazy = () -> SecuritiesFinancingTransactionDetails35.mmObject();
			isDerived = false;
			xmlTag = "CorpActnEvtId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionEventIdentification";
			definition = "Identification assigned by the account servicer to unambiguously identify a corporate action event.";
			previousVersion_lazy = () -> SecuritiesFinancingTransactionDetails26.mmCorporateActionEventIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text tripartyAgentServiceProviderCollateralTransactionIdentification;
	/**
	 * Unique identification identifying the triparty collateral management
	 * transaction from the triparty-agent's/service-provider's point of view.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification#mmTripartyAgentCollateralTransactionIdentification
	 * SecuritiesTradeIdentification.
	 * mmTripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35
	 * SecuritiesFinancingTransactionDetails35}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrptyAgtSvcPrvdrCollTxId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TripartyAgentServiceProviderCollateralTransactionIdentification"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification identifying the triparty collateral management transaction from the triparty-agent's/service-provider's point of view."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26#mmTripartyAgentCollateralTransactionIdentification
	 * SecuritiesFinancingTransactionDetails26.
	 * mmTripartyAgentCollateralTransactionIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTripartyAgentServiceProviderCollateralTransactionIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeIdentification.mmTripartyAgentCollateralTransactionIdentification;
			componentContext_lazy = () -> SecuritiesFinancingTransactionDetails35.mmObject();
			isDerived = false;
			xmlTag = "TrptyAgtSvcPrvdrCollTxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TripartyAgentServiceProviderCollateralTransactionIdentification";
			definition = "Unique identification identifying the triparty collateral management transaction from the triparty-agent's/service-provider's point of view.";
			previousVersion_lazy = () -> SecuritiesFinancingTransactionDetails26.mmTripartyAgentCollateralTransactionIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text clientTripartyCollateralTransactionIdentification;
	/**
	 * Unique reference identifying the triparty collateral management
	 * transaction from the client's point of view.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification#mmClientTripartyCollateralTransactionIdentification
	 * SecuritiesTradeIdentification.
	 * mmClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35
	 * SecuritiesFinancingTransactionDetails35}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26#mmClientTripartyCollateralTransactionIdentification
	 * SecuritiesFinancingTransactionDetails26.
	 * mmClientTripartyCollateralTransactionIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmClientTripartyCollateralTransactionIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeIdentification.mmClientTripartyCollateralTransactionIdentification;
			componentContext_lazy = () -> SecuritiesFinancingTransactionDetails35.mmObject();
			isDerived = false;
			xmlTag = "ClntTrptyCollTxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClientTripartyCollateralTransactionIdentification";
			definition = "Unique reference identifying the triparty collateral management transaction from the client's point of view.";
			previousVersion_lazy = () -> SecuritiesFinancingTransactionDetails26.mmClientTripartyCollateralTransactionIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected PartyIdentification98 accountOwner;
	/**
	 * Party that legally owns the account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification98
	 * PartyIdentification98}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35
	 * SecuritiesFinancingTransactionDetails35}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26#mmAccountOwner
	 * SecuritiesFinancingTransactionDetails26.mmAccountOwner}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAccountOwner = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> SecuritiesFinancingTransactionDetails35.mmObject();
			isDerived = false;
			xmlTag = "AcctOwnr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOwner";
			definition = "Party that legally owns the account.";
			previousVersion_lazy = () -> SecuritiesFinancingTransactionDetails26.mmAccountOwner;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentification98.mmObject();
		}
	};
	protected SecuritiesAccount19 safekeepingAccount;
	/**
	 * Account to or from which a securities entry is made.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SecuritiesAccount19
	 * SecuritiesAccount19}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount
	 * SecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35
	 * SecuritiesFinancingTransactionDetails35}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26#mmSafekeepingAccount
	 * SecuritiesFinancingTransactionDetails26.mmSafekeepingAccount}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSafekeepingAccount = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> SecuritiesAccount.mmObject();
			componentContext_lazy = () -> SecuritiesFinancingTransactionDetails35.mmObject();
			isDerived = false;
			xmlTag = "SfkpgAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingAccount";
			definition = "Account to or from which a securities entry is made.";
			previousVersion_lazy = () -> SecuritiesFinancingTransactionDetails26.mmSafekeepingAccount;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SecuritiesAccount19.mmObject();
		}
	};
	protected SafeKeepingPlace1 safekeepingPlace;
	/**
	 * Place where the securities are safe-kept, physically or notionally. This
	 * place can be, for example, a local custodian, a Central Securities
	 * Depository (CSD) or an International Central Securities Depository
	 * (ICSD).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SafeKeepingPlace1
	 * SafeKeepingPlace1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SafekeepingPlace
	 * SafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35
	 * SecuritiesFinancingTransactionDetails35}</li>
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
	 * "Place where the securities are safe-kept, physically or notionally.  This place can be, for example, a local custodian, a Central Securities Depository (CSD) or an International Central Securities Depository (ICSD)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26#mmSafekeepingPlace
	 * SecuritiesFinancingTransactionDetails26.mmSafekeepingPlace}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSafekeepingPlace = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> SafekeepingPlace.mmObject();
			componentContext_lazy = () -> SecuritiesFinancingTransactionDetails35.mmObject();
			isDerived = false;
			xmlTag = "SfkpgPlc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlace";
			definition = "Place where the securities are safe-kept, physically or notionally.  This place can be, for example, a local custodian, a Central Securities Depository (CSD) or an International Central Securities Depository (ICSD).";
			previousVersion_lazy = () -> SecuritiesFinancingTransactionDetails26.mmSafekeepingPlace;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SafeKeepingPlace1.mmObject();
		}
	};
	protected PlaceOfTradeIdentification1 placeOfTrade;
	/**
	 * Context, or geographic environment, in which trading parties may meet in
	 * order to negotiate and execute trades among themselves.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PlaceOfTradeIdentification1
	 * PlaceOfTradeIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmTradingMarket
	 * Security.mmTradingMarket}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35
	 * SecuritiesFinancingTransactionDetails35}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26#mmPlaceOfTrade
	 * SecuritiesFinancingTransactionDetails26.mmPlaceOfTrade}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPlaceOfTrade = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Security.mmTradingMarket;
			componentContext_lazy = () -> SecuritiesFinancingTransactionDetails35.mmObject();
			isDerived = false;
			xmlTag = "PlcOfTrad";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfTrade";
			definition = "Context, or geographic environment, in which trading parties may meet in order to negotiate and execute trades among themselves.";
			previousVersion_lazy = () -> SecuritiesFinancingTransactionDetails26.mmPlaceOfTrade;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PlaceOfTradeIdentification1.mmObject();
		}
	};
	protected SecurityIdentification19 financialInstrumentIdentification;
	/**
	 * Financial instruments representing a sum of rights of the investor
	 * vis-a-vis the issuer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification19
	 * SecurityIdentification19}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmIdentification
	 * Security.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35
	 * SecuritiesFinancingTransactionDetails35}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26#mmFinancialInstrumentIdentification
	 * SecuritiesFinancingTransactionDetails26.
	 * mmFinancialInstrumentIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFinancialInstrumentIdentification = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Security.mmIdentification;
			componentContext_lazy = () -> SecuritiesFinancingTransactionDetails35.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentification";
			definition = "Financial instruments representing a sum of rights of the investor vis-a-vis the issuer.";
			previousVersion_lazy = () -> SecuritiesFinancingTransactionDetails26.mmFinancialInstrumentIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SecurityIdentification19.mmObject();
		}
	};
	protected Quantity6Choice settlementQuantity;
	/**
	 * Total quantity of securities to be settled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Quantity6Choice
	 * Quantity6Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSettlementQuantity
	 * SecuritiesSettlement.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35
	 * SecuritiesFinancingTransactionDetails35}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26#mmSettlementQuantity
	 * SecuritiesFinancingTransactionDetails26.mmSettlementQuantity}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSettlementQuantity = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmSettlementQuantity;
			componentContext_lazy = () -> SecuritiesFinancingTransactionDetails35.mmObject();
			isDerived = false;
			xmlTag = "SttlmQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementQuantity";
			definition = "Total quantity of securities to be settled.";
			previousVersion_lazy = () -> SecuritiesFinancingTransactionDetails26.mmSettlementQuantity;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Quantity6Choice.mmObject();
		}
	};
	protected AmountAndDirection51 openingSettlementAmount;
	/**
	 * Total amount of money to be paid or received in exchange for the
	 * securities at the opening of a securities financing transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection51
	 * AmountAndDirection51}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmOpeningSettlementAmount
	 * SecuritiesFinancing.mmOpeningSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35
	 * SecuritiesFinancingTransactionDetails35}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26#mmOpeningSettlementAmount
	 * SecuritiesFinancingTransactionDetails26.mmOpeningSettlementAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOpeningSettlementAmount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesFinancing.mmOpeningSettlementAmount;
			componentContext_lazy = () -> SecuritiesFinancingTransactionDetails35.mmObject();
			isDerived = false;
			xmlTag = "OpngSttlmAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OpeningSettlementAmount";
			definition = "Total amount of money to be paid or received in exchange for the securities at the opening of a securities financing transaction.";
			previousVersion_lazy = () -> SecuritiesFinancingTransactionDetails26.mmOpeningSettlementAmount;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AmountAndDirection51.mmObject();
		}
	};
	protected AmountAndDirection21 terminationTransactionAmount;
	/**
	 * Total amount of money to be settled to terminate the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection21
	 * AmountAndDirection21}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmTerminationTransactionAmount
	 * SecuritiesFinancing.mmTerminationTransactionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35
	 * SecuritiesFinancingTransactionDetails35}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26#mmTerminationTransactionAmount
	 * SecuritiesFinancingTransactionDetails26.mmTerminationTransactionAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTerminationTransactionAmount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesFinancing.mmTerminationTransactionAmount;
			componentContext_lazy = () -> SecuritiesFinancingTransactionDetails35.mmObject();
			isDerived = false;
			xmlTag = "TermntnTxAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TerminationTransactionAmount";
			definition = "Total amount of money to be settled to terminate the transaction.";
			previousVersion_lazy = () -> SecuritiesFinancingTransactionDetails26.mmTerminationTransactionAmount;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AmountAndDirection21.mmObject();
		}
	};
	protected SettlementDate10Choice openingSettlementDate;
	/**
	 * Date and time at which the securities are to be delivered or received.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.SettlementDate10Choice
	 * SettlementDate10Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmOpeningSettlementDate
	 * SecuritiesFinancing.mmOpeningSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35
	 * SecuritiesFinancingTransactionDetails35}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26#mmOpeningSettlementDate
	 * SecuritiesFinancingTransactionDetails26.mmOpeningSettlementDate}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOpeningSettlementDate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesFinancing.mmOpeningSettlementDate;
			componentContext_lazy = () -> SecuritiesFinancingTransactionDetails35.mmObject();
			isDerived = false;
			xmlTag = "OpngSttlmDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OpeningSettlementDate";
			definition = "Date and time at which the securities are to be delivered or received.";
			previousVersion_lazy = () -> SecuritiesFinancingTransactionDetails26.mmOpeningSettlementDate;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SettlementDate10Choice.mmObject();
		}
	};
	protected TerminationDate4Choice terminationDate;
	/**
	 * Closing date/time or maturity date/time of the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.TerminationDate4Choice
	 * TerminationDate4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmTerminationDateTime
	 * SecuritiesFinancing.mmTerminationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35
	 * SecuritiesFinancingTransactionDetails35}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26#mmTerminationDate
	 * SecuritiesFinancingTransactionDetails26.mmTerminationDate}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTerminationDate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesFinancing.mmTerminationDateTime;
			componentContext_lazy = () -> SecuritiesFinancingTransactionDetails35.mmObject();
			isDerived = false;
			xmlTag = "TermntnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TerminationDate";
			definition = "Closing date/time or maturity date/time of the transaction.";
			previousVersion_lazy = () -> SecuritiesFinancingTransactionDetails26.mmTerminationDate;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TerminationDate4Choice.mmObject();
		}
	};
	protected TradeDate5Choice tradeDate;
	/**
	 * Specifies the date/time on which the trade was executed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.TradeDate5Choice
	 * TradeDate5Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Trade#mmTradeDateTime
	 * Trade.mmTradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35
	 * SecuritiesFinancingTransactionDetails35}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26#mmTradeDate
	 * SecuritiesFinancingTransactionDetails26.mmTradeDate}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTradeDate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Trade.mmTradeDateTime;
			componentContext_lazy = () -> SecuritiesFinancingTransactionDetails35.mmObject();
			isDerived = false;
			xmlTag = "TradDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDate";
			definition = "Specifies the date/time on which the trade was executed.";
			previousVersion_lazy = () -> SecuritiesFinancingTransactionDetails26.mmTradeDate;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TradeDate5Choice.mmObject();
		}
	};
	protected DateAndDateTimeChoice expectedSettlementDate;
	/**
	 * Date/time at which the sender expects settlement.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35
	 * SecuritiesFinancingTransactionDetails35}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26#mmExpectedSettlementDate
	 * SecuritiesFinancingTransactionDetails26.mmExpectedSettlementDate}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmExpectedSettlementDate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Obligation.mmRequestedSettlementDate;
			componentContext_lazy = () -> SecuritiesFinancingTransactionDetails35.mmObject();
			isDerived = false;
			xmlTag = "XpctdSttlmDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpectedSettlementDate";
			definition = "Date/time at which the sender expects settlement.";
			previousVersion_lazy = () -> SecuritiesFinancingTransactionDetails26.mmExpectedSettlementDate;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateAndDateTimeChoice.mmObject();
		}
	};
	protected DateAndDateTimeChoice expectedValueDate;
	/**
	 * For against payment transactions, the value date/time at which the
	 * account servicer expects the settlement amount to be credited or debited.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35
	 * SecuritiesFinancingTransactionDetails35}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26#mmExpectedValueDate
	 * SecuritiesFinancingTransactionDetails26.mmExpectedValueDate}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmExpectedValueDate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Payment.mmValueDate;
			componentContext_lazy = () -> SecuritiesFinancingTransactionDetails35.mmObject();
			isDerived = false;
			xmlTag = "XpctdValDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpectedValueDate";
			definition = "For against payment transactions, the value date/time at which the account servicer expects the settlement amount to be credited or debited.";
			previousVersion_lazy = () -> SecuritiesFinancingTransactionDetails26.mmExpectedValueDate;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateAndDateTimeChoice.mmObject();
		}
	};
	protected DateAndDateTimeChoice lateDeliveryDate;
	/**
	 * Date and time after the settlement date specified in the trade, used for
	 * pool trades resulting from the original To Be Assigned (TBA) securities.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35
	 * SecuritiesFinancingTransactionDetails35}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26#mmLateDeliveryDate
	 * SecuritiesFinancingTransactionDetails26.mmLateDeliveryDate}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmLateDeliveryDate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesTransfer.mmLateDeliveryDate;
			componentContext_lazy = () -> SecuritiesFinancingTransactionDetails35.mmObject();
			isDerived = false;
			xmlTag = "LateDlvryDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateDeliveryDate";
			definition = "Date and time after the settlement date specified in the trade, used for pool trades resulting from the original To Be Assigned (TBA) securities.";
			previousVersion_lazy = () -> SecuritiesFinancingTransactionDetails26.mmLateDeliveryDate;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateAndDateTimeChoice.mmObject();
		}
	};
	protected DateAndDateTimeChoice rateChangeDate;
	/**
	 * Date/Time at which rate change has taken place.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35
	 * SecuritiesFinancingTransactionDetails35}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26#mmRateChangeDate
	 * SecuritiesFinancingTransactionDetails26.mmRateChangeDate}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRateChangeDate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesFinancing.mmRateChangeDateTime;
			componentContext_lazy = () -> SecuritiesFinancingTransactionDetails35.mmObject();
			isDerived = false;
			xmlTag = "RateChngDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RateChangeDate";
			definition = "Date/Time at which rate change has taken place.";
			previousVersion_lazy = () -> SecuritiesFinancingTransactionDetails26.mmRateChangeDate;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateAndDateTimeChoice.mmObject();
		}
	};
	protected SecuritiesFinancingTransactionType2Code securitiesFinancingTransactionType;
	/**
	 * Specifies the type of securities financing transaction, that is,
	 * repurchase agreement, reverse repurchase agreement, securities lending or
	 * securities borrowing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesFinancingTransactionType2Code
	 * SecuritiesFinancingTransactionType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmSecuritiesTransactionType
	 * SecuritiesTrade.mmSecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35
	 * SecuritiesFinancingTransactionDetails35}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26#mmSecuritiesFinancingTransactionType
	 * SecuritiesFinancingTransactionDetails26.
	 * mmSecuritiesFinancingTransactionType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSecuritiesFinancingTransactionType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesTrade.mmSecuritiesTransactionType;
			componentContext_lazy = () -> SecuritiesFinancingTransactionDetails35.mmObject();
			isDerived = false;
			xmlTag = "SctiesFincgTxTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesFinancingTransactionType";
			definition = "Specifies the type of securities financing transaction, that is, repurchase agreement, reverse repurchase agreement, securities lending or securities borrowing.";
			previousVersion_lazy = () -> SecuritiesFinancingTransactionDetails26.mmSecuritiesFinancingTransactionType;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SecuritiesFinancingTransactionType2Code.mmObject();
		}
	};
	protected ReceiveDelivery1Code securitiesMovementType;
	/**
	 * Specifies if the movement on a securities account results from a deliver
	 * or a receive instruction.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35
	 * SecuritiesFinancingTransactionDetails35}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26#mmSecuritiesMovementType
	 * SecuritiesFinancingTransactionDetails26.mmSecuritiesMovementType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSecuritiesMovementType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmSecuritiesMovementType;
			componentContext_lazy = () -> SecuritiesFinancingTransactionDetails35.mmObject();
			isDerived = false;
			xmlTag = "SctiesMvmntTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMovementType";
			definition = "Specifies if the movement on a securities account results from a deliver or a receive instruction.";
			previousVersion_lazy = () -> SecuritiesFinancingTransactionDetails26.mmSecuritiesMovementType;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ReceiveDelivery1Code.mmObject();
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
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35
	 * SecuritiesFinancingTransactionDetails35}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26#mmPayment
	 * SecuritiesFinancingTransactionDetails26.mmPayment}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPayment = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmSettlementType;
			componentContext_lazy = () -> SecuritiesFinancingTransactionDetails35.mmObject();
			isDerived = false;
			xmlTag = "Pmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Payment";
			definition = "Specifies how the transaction is to be settled, for example, against payment.";
			previousVersion_lazy = () -> SecuritiesFinancingTransactionDetails26.mmPayment;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DeliveryReceiptType2Code.mmObject();
		}
	};
	protected SettlementDetails98 settlementParameters;
	/**
	 * Parameters applied to the settlement of a security transfer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SettlementDetails98
	 * SettlementDetails98}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35
	 * SecuritiesFinancingTransactionDetails35}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26#mmSettlementParameters
	 * SecuritiesFinancingTransactionDetails26.mmSettlementParameters}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSettlementParameters = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> SecuritiesSettlement.mmObject();
			componentContext_lazy = () -> SecuritiesFinancingTransactionDetails35.mmObject();
			isDerived = false;
			xmlTag = "SttlmParams";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementParameters";
			definition = "Parameters applied to the settlement of a security transfer.";
			previousVersion_lazy = () -> SecuritiesFinancingTransactionDetails26.mmSettlementParameters;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SettlementDetails98.mmObject();
		}
	};
	protected RateType35Choice rateType;
	/**
	 * Specifies whether the rate is fixed or variable.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.RateType35Choice
	 * RateType35Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmRateType
	 * InterestCalculation.mmRateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35
	 * SecuritiesFinancingTransactionDetails35}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26#mmRateType
	 * SecuritiesFinancingTransactionDetails26.mmRateType}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRateType = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> InterestCalculation.mmRateType;
			componentContext_lazy = () -> SecuritiesFinancingTransactionDetails35.mmObject();
			isDerived = false;
			xmlTag = "RateTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RateType";
			definition = "Specifies whether the rate is fixed or variable.";
			previousVersion_lazy = () -> SecuritiesFinancingTransactionDetails26.mmRateType;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RateType35Choice.mmObject();
		}
	};
	protected RateName1 variableRateSupport;
	/**
	 * Index or support rate used together with the spread to calculate the
	 * repurchase rate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.RateName1 RateName1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmVariableRateSupport
	 * SecuritiesFinancing.mmVariableRateSupport}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35
	 * SecuritiesFinancingTransactionDetails35}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26#mmVariableRateSupport
	 * SecuritiesFinancingTransactionDetails26.mmVariableRateSupport}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmVariableRateSupport = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesFinancing.mmVariableRateSupport;
			componentContext_lazy = () -> SecuritiesFinancingTransactionDetails35.mmObject();
			isDerived = false;
			xmlTag = "VarblRateSpprt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VariableRateSupport";
			definition = "Index or support rate used together with the spread to calculate the\nrepurchase rate.";
			previousVersion_lazy = () -> SecuritiesFinancingTransactionDetails26.mmVariableRateSupport;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.RateName1.mmObject();
		}
	};
	protected Rate2 repurchaseRate;
	/**
	 * Rate to be used to recalculate the repurchase amount.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35
	 * SecuritiesFinancingTransactionDetails35}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26#mmRepurchaseRate
	 * SecuritiesFinancingTransactionDetails26.mmRepurchaseRate}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRepurchaseRate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesFinancing.mmRepurchaseRate;
			componentContext_lazy = () -> SecuritiesFinancingTransactionDetails35.mmObject();
			isDerived = false;
			xmlTag = "RpRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepurchaseRate";
			definition = "Rate to be used to recalculate the repurchase amount.";
			previousVersion_lazy = () -> SecuritiesFinancingTransactionDetails26.mmRepurchaseRate;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Rate2.mmObject();
		}
	};
	protected Rate2 stockLoanMargin;
	/**
	 * Percentage mark-up on a loan consideration used to reflect the lender's
	 * risk.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35
	 * SecuritiesFinancingTransactionDetails35}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26#mmStockLoanMargin
	 * SecuritiesFinancingTransactionDetails26.mmStockLoanMargin}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmStockLoanMargin = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesFinancing.mmStockLoanMargin;
			componentContext_lazy = () -> SecuritiesFinancingTransactionDetails35.mmObject();
			isDerived = false;
			xmlTag = "StockLnMrgn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StockLoanMargin";
			definition = "Percentage mark-up on a loan consideration used to reflect the lender's risk.";
			previousVersion_lazy = () -> SecuritiesFinancingTransactionDetails26.mmStockLoanMargin;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Rate2.mmObject();
		}
	};
	protected Rate2 securitiesHaircut;
	/**
	 * Haircut or valuation factor on the security expressed as a percentage.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35
	 * SecuritiesFinancingTransactionDetails35}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26#mmSecuritiesHaircut
	 * SecuritiesFinancingTransactionDetails26.mmSecuritiesHaircut}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSecuritiesHaircut = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> AssetHolding.mmHaircut;
			componentContext_lazy = () -> SecuritiesFinancingTransactionDetails35.mmObject();
			isDerived = false;
			xmlTag = "SctiesHrcut";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesHaircut";
			definition = "Haircut or valuation factor on the security expressed as a percentage.";
			previousVersion_lazy = () -> SecuritiesFinancingTransactionDetails26.mmSecuritiesHaircut;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Rate2.mmObject();
		}
	};
	protected RateOrName1Choice pricingRate;
	/**
	 * Interest rate to be paid on the transaction amount, as agreed between the
	 * counterparties.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.RateOrName1Choice
	 * RateOrName1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmInterest
	 * SecuritiesFinancing.mmInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35
	 * SecuritiesFinancingTransactionDetails35}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26#mmPricingRate
	 * SecuritiesFinancingTransactionDetails26.mmPricingRate}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPricingRate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesFinancing.mmInterest;
			componentContext_lazy = () -> SecuritiesFinancingTransactionDetails35.mmObject();
			isDerived = false;
			xmlTag = "PricgRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PricingRate";
			definition = "Interest rate to be paid on the transaction amount, as agreed between the counterparties.";
			previousVersion_lazy = () -> SecuritiesFinancingTransactionDetails26.mmPricingRate;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RateOrName1Choice.mmObject();
		}
	};
	protected Rate2 spread;
	/**
	 * Repurchase spread expressed as a rate; margin over or under an index that
	 * determines the repurchase rate.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35
	 * SecuritiesFinancingTransactionDetails35}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26#mmSpread
	 * SecuritiesFinancingTransactionDetails26.mmSpread}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSpread = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesFinancing.mmRepurchaseSpread;
			componentContext_lazy = () -> SecuritiesFinancingTransactionDetails35.mmObject();
			isDerived = false;
			xmlTag = "Sprd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Spread";
			definition = "Repurchase spread expressed as a rate; margin over or under an index that determines the repurchase rate.";
			previousVersion_lazy = () -> SecuritiesFinancingTransactionDetails26.mmSpread;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Rate2.mmObject();
		}
	};
	protected SettlementParties36 deliveringSettlementParties;
	/**
	 * Identifies the chain of delivering settlement parties.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SettlementParties36
	 * SettlementParties36}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.DeliveringSettlementParty
	 * DeliveringSettlementParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35
	 * SecuritiesFinancingTransactionDetails35}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26#mmDeliveringSettlementParties
	 * SecuritiesFinancingTransactionDetails26.mmDeliveringSettlementParties}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDeliveringSettlementParties = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> DeliveringSettlementParty.mmObject();
			componentContext_lazy = () -> SecuritiesFinancingTransactionDetails35.mmObject();
			isDerived = false;
			xmlTag = "DlvrgSttlmPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveringSettlementParties";
			definition = "Identifies the chain of delivering settlement parties.";
			previousVersion_lazy = () -> SecuritiesFinancingTransactionDetails26.mmDeliveringSettlementParties;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SettlementParties36.mmObject();
		}
	};
	protected SettlementParties36 receivingSettlementParties;
	/**
	 * Identifies the chain of receiving settlement parties.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SettlementParties36
	 * SettlementParties36}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.ReceivingSettlementParty
	 * ReceivingSettlementParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35
	 * SecuritiesFinancingTransactionDetails35}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26#mmReceivingSettlementParties
	 * SecuritiesFinancingTransactionDetails26.mmReceivingSettlementParties}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmReceivingSettlementParties = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> ReceivingSettlementParty.mmObject();
			componentContext_lazy = () -> SecuritiesFinancingTransactionDetails35.mmObject();
			isDerived = false;
			xmlTag = "RcvgSttlmPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingSettlementParties";
			definition = "Identifies the chain of receiving settlement parties.";
			previousVersion_lazy = () -> SecuritiesFinancingTransactionDetails26.mmReceivingSettlementParties;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SettlementParties36.mmObject();
		}
	};
	protected PartyIdentification99 investor;
	/**
	 * Party, either an individual or organisation, whose assets are being
	 * invested.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification99
	 * PartyIdentification99}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35
	 * SecuritiesFinancingTransactionDetails35}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26#mmInvestor
	 * SecuritiesFinancingTransactionDetails26.mmInvestor}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInvestor = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> SecuritiesFinancingTransactionDetails35.mmObject();
			isDerived = false;
			xmlTag = "Invstr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Investor";
			definition = "Party, either an individual or organisation, whose assets are being invested.";
			previousVersion_lazy = () -> SecuritiesFinancingTransactionDetails26.mmInvestor;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentification99.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35
	 * SecuritiesFinancingTransactionDetails35}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26#mmSettlementInstructionProcessingAdditionalDetails
	 * SecuritiesFinancingTransactionDetails26.
	 * mmSettlementInstructionProcessingAdditionalDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSettlementInstructionProcessingAdditionalDetails = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SecuritiesFinancingTransactionDetails35.mmObject();
			isDerived = false;
			xmlTag = "SttlmInstrPrcgAddtlDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementInstructionProcessingAdditionalDetails";
			definition = "Provides additional settlement processing information which can not be included within the structured fields of the message.";
			previousVersion_lazy = () -> SecuritiesFinancingTransactionDetails26.mmSettlementInstructionProcessingAdditionalDetails;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(SecuritiesFinancingTransactionDetails35.mmSecuritiesFinancingTradeIdentification, SecuritiesFinancingTransactionDetails35.mmClosingLegIdentification,
						SecuritiesFinancingTransactionDetails35.mmPoolIdentification, SecuritiesFinancingTransactionDetails35.mmCorporateActionEventIdentification,
						SecuritiesFinancingTransactionDetails35.mmTripartyAgentServiceProviderCollateralTransactionIdentification, SecuritiesFinancingTransactionDetails35.mmClientTripartyCollateralTransactionIdentification,
						SecuritiesFinancingTransactionDetails35.mmAccountOwner, SecuritiesFinancingTransactionDetails35.mmSafekeepingAccount, SecuritiesFinancingTransactionDetails35.mmSafekeepingPlace,
						SecuritiesFinancingTransactionDetails35.mmPlaceOfTrade, SecuritiesFinancingTransactionDetails35.mmFinancialInstrumentIdentification, SecuritiesFinancingTransactionDetails35.mmSettlementQuantity,
						SecuritiesFinancingTransactionDetails35.mmOpeningSettlementAmount, SecuritiesFinancingTransactionDetails35.mmTerminationTransactionAmount, SecuritiesFinancingTransactionDetails35.mmOpeningSettlementDate,
						SecuritiesFinancingTransactionDetails35.mmTerminationDate, SecuritiesFinancingTransactionDetails35.mmTradeDate, SecuritiesFinancingTransactionDetails35.mmExpectedSettlementDate,
						SecuritiesFinancingTransactionDetails35.mmExpectedValueDate, SecuritiesFinancingTransactionDetails35.mmLateDeliveryDate, SecuritiesFinancingTransactionDetails35.mmRateChangeDate,
						SecuritiesFinancingTransactionDetails35.mmSecuritiesFinancingTransactionType, SecuritiesFinancingTransactionDetails35.mmSecuritiesMovementType, SecuritiesFinancingTransactionDetails35.mmPayment,
						SecuritiesFinancingTransactionDetails35.mmSettlementParameters, SecuritiesFinancingTransactionDetails35.mmRateType, SecuritiesFinancingTransactionDetails35.mmVariableRateSupport,
						SecuritiesFinancingTransactionDetails35.mmRepurchaseRate, SecuritiesFinancingTransactionDetails35.mmStockLoanMargin, SecuritiesFinancingTransactionDetails35.mmSecuritiesHaircut,
						SecuritiesFinancingTransactionDetails35.mmPricingRate, SecuritiesFinancingTransactionDetails35.mmSpread, SecuritiesFinancingTransactionDetails35.mmDeliveringSettlementParties,
						SecuritiesFinancingTransactionDetails35.mmReceivingSettlementParties, SecuritiesFinancingTransactionDetails35.mmInvestor, SecuritiesFinancingTransactionDetails35.mmSettlementInstructionProcessingAdditionalDetails);
				messageBuildingBlock_lazy = () -> Arrays.asList(SecuritiesFinancingStatusAdviceV07.mmTransactionDetails);
				trace_lazy = () -> SecuritiesFinancing.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesFinancingTransactionDetails35";
				definition = "Details of the closing of the securities financing transaction.";
				previousVersion_lazy = () -> SecuritiesFinancingTransactionDetails26.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "SctiesFincgTradId")
	public Max35Text getSecuritiesFinancingTradeIdentification() {
		return securitiesFinancingTradeIdentification;
	}

	public void setSecuritiesFinancingTradeIdentification(Max35Text securitiesFinancingTradeIdentification) {
		this.securitiesFinancingTradeIdentification = securitiesFinancingTradeIdentification;
	}

	@XmlElement(name = "ClsgLegId")
	public Max35Text getClosingLegIdentification() {
		return closingLegIdentification;
	}

	public void setClosingLegIdentification(Max35Text closingLegIdentification) {
		this.closingLegIdentification = closingLegIdentification;
	}

	@XmlElement(name = "PoolId")
	public Max35Text getPoolIdentification() {
		return poolIdentification;
	}

	public void setPoolIdentification(Max35Text poolIdentification) {
		this.poolIdentification = poolIdentification;
	}

	@XmlElement(name = "CorpActnEvtId")
	public Max35Text getCorporateActionEventIdentification() {
		return corporateActionEventIdentification;
	}

	public void setCorporateActionEventIdentification(Max35Text corporateActionEventIdentification) {
		this.corporateActionEventIdentification = corporateActionEventIdentification;
	}

	@XmlElement(name = "TrptyAgtSvcPrvdrCollTxId")
	public Max35Text getTripartyAgentServiceProviderCollateralTransactionIdentification() {
		return tripartyAgentServiceProviderCollateralTransactionIdentification;
	}

	public void setTripartyAgentServiceProviderCollateralTransactionIdentification(Max35Text tripartyAgentServiceProviderCollateralTransactionIdentification) {
		this.tripartyAgentServiceProviderCollateralTransactionIdentification = tripartyAgentServiceProviderCollateralTransactionIdentification;
	}

	@XmlElement(name = "ClntTrptyCollTxId")
	public Max35Text getClientTripartyCollateralTransactionIdentification() {
		return clientTripartyCollateralTransactionIdentification;
	}

	public void setClientTripartyCollateralTransactionIdentification(Max35Text clientTripartyCollateralTransactionIdentification) {
		this.clientTripartyCollateralTransactionIdentification = clientTripartyCollateralTransactionIdentification;
	}

	@XmlElement(name = "AcctOwnr")
	public PartyIdentification98 getAccountOwner() {
		return accountOwner;
	}

	public void setAccountOwner(com.tools20022.repository.msg.PartyIdentification98 accountOwner) {
		this.accountOwner = accountOwner;
	}

	@XmlElement(name = "SfkpgAcct", required = true)
	public SecuritiesAccount19 getSafekeepingAccount() {
		return safekeepingAccount;
	}

	public void setSafekeepingAccount(com.tools20022.repository.msg.SecuritiesAccount19 safekeepingAccount) {
		this.safekeepingAccount = safekeepingAccount;
	}

	@XmlElement(name = "SfkpgPlc")
	public SafeKeepingPlace1 getSafekeepingPlace() {
		return safekeepingPlace;
	}

	public void setSafekeepingPlace(com.tools20022.repository.msg.SafeKeepingPlace1 safekeepingPlace) {
		this.safekeepingPlace = safekeepingPlace;
	}

	@XmlElement(name = "PlcOfTrad")
	public PlaceOfTradeIdentification1 getPlaceOfTrade() {
		return placeOfTrade;
	}

	public void setPlaceOfTrade(com.tools20022.repository.msg.PlaceOfTradeIdentification1 placeOfTrade) {
		this.placeOfTrade = placeOfTrade;
	}

	@XmlElement(name = "FinInstrmId", required = true)
	public SecurityIdentification19 getFinancialInstrumentIdentification() {
		return financialInstrumentIdentification;
	}

	public void setFinancialInstrumentIdentification(com.tools20022.repository.msg.SecurityIdentification19 financialInstrumentIdentification) {
		this.financialInstrumentIdentification = financialInstrumentIdentification;
	}

	@XmlElement(name = "SttlmQty", required = true)
	public Quantity6Choice getSettlementQuantity() {
		return settlementQuantity;
	}

	public void setSettlementQuantity(Quantity6Choice settlementQuantity) {
		this.settlementQuantity = settlementQuantity;
	}

	@XmlElement(name = "OpngSttlmAmt")
	public AmountAndDirection51 getOpeningSettlementAmount() {
		return openingSettlementAmount;
	}

	public void setOpeningSettlementAmount(com.tools20022.repository.msg.AmountAndDirection51 openingSettlementAmount) {
		this.openingSettlementAmount = openingSettlementAmount;
	}

	@XmlElement(name = "TermntnTxAmt")
	public AmountAndDirection21 getTerminationTransactionAmount() {
		return terminationTransactionAmount;
	}

	public void setTerminationTransactionAmount(com.tools20022.repository.msg.AmountAndDirection21 terminationTransactionAmount) {
		this.terminationTransactionAmount = terminationTransactionAmount;
	}

	@XmlElement(name = "OpngSttlmDt", required = true)
	public SettlementDate10Choice getOpeningSettlementDate() {
		return openingSettlementDate;
	}

	public void setOpeningSettlementDate(SettlementDate10Choice openingSettlementDate) {
		this.openingSettlementDate = openingSettlementDate;
	}

	@XmlElement(name = "TermntnDt")
	public TerminationDate4Choice getTerminationDate() {
		return terminationDate;
	}

	public void setTerminationDate(TerminationDate4Choice terminationDate) {
		this.terminationDate = terminationDate;
	}

	@XmlElement(name = "TradDt")
	public TradeDate5Choice getTradeDate() {
		return tradeDate;
	}

	public void setTradeDate(TradeDate5Choice tradeDate) {
		this.tradeDate = tradeDate;
	}

	@XmlElement(name = "XpctdSttlmDt")
	public DateAndDateTimeChoice getExpectedSettlementDate() {
		return expectedSettlementDate;
	}

	public void setExpectedSettlementDate(DateAndDateTimeChoice expectedSettlementDate) {
		this.expectedSettlementDate = expectedSettlementDate;
	}

	@XmlElement(name = "XpctdValDt")
	public DateAndDateTimeChoice getExpectedValueDate() {
		return expectedValueDate;
	}

	public void setExpectedValueDate(DateAndDateTimeChoice expectedValueDate) {
		this.expectedValueDate = expectedValueDate;
	}

	@XmlElement(name = "LateDlvryDt")
	public DateAndDateTimeChoice getLateDeliveryDate() {
		return lateDeliveryDate;
	}

	public void setLateDeliveryDate(DateAndDateTimeChoice lateDeliveryDate) {
		this.lateDeliveryDate = lateDeliveryDate;
	}

	@XmlElement(name = "RateChngDt")
	public DateAndDateTimeChoice getRateChangeDate() {
		return rateChangeDate;
	}

	public void setRateChangeDate(DateAndDateTimeChoice rateChangeDate) {
		this.rateChangeDate = rateChangeDate;
	}

	@XmlElement(name = "SctiesFincgTxTp", required = true)
	public SecuritiesFinancingTransactionType2Code getSecuritiesFinancingTransactionType() {
		return securitiesFinancingTransactionType;
	}

	public void setSecuritiesFinancingTransactionType(SecuritiesFinancingTransactionType2Code securitiesFinancingTransactionType) {
		this.securitiesFinancingTransactionType = securitiesFinancingTransactionType;
	}

	@XmlElement(name = "SctiesMvmntTp", required = true)
	public ReceiveDelivery1Code getSecuritiesMovementType() {
		return securitiesMovementType;
	}

	public void setSecuritiesMovementType(ReceiveDelivery1Code securitiesMovementType) {
		this.securitiesMovementType = securitiesMovementType;
	}

	@XmlElement(name = "Pmt", required = true)
	public DeliveryReceiptType2Code getPayment() {
		return payment;
	}

	public void setPayment(DeliveryReceiptType2Code payment) {
		this.payment = payment;
	}

	@XmlElement(name = "SttlmParams")
	public SettlementDetails98 getSettlementParameters() {
		return settlementParameters;
	}

	public void setSettlementParameters(com.tools20022.repository.msg.SettlementDetails98 settlementParameters) {
		this.settlementParameters = settlementParameters;
	}

	@XmlElement(name = "RateTp")
	public RateType35Choice getRateType() {
		return rateType;
	}

	public void setRateType(RateType35Choice rateType) {
		this.rateType = rateType;
	}

	@XmlElement(name = "VarblRateSpprt")
	public RateName1 getVariableRateSupport() {
		return variableRateSupport;
	}

	public void setVariableRateSupport(com.tools20022.repository.msg.RateName1 variableRateSupport) {
		this.variableRateSupport = variableRateSupport;
	}

	@XmlElement(name = "RpRate")
	public Rate2 getRepurchaseRate() {
		return repurchaseRate;
	}

	public void setRepurchaseRate(com.tools20022.repository.msg.Rate2 repurchaseRate) {
		this.repurchaseRate = repurchaseRate;
	}

	@XmlElement(name = "StockLnMrgn")
	public Rate2 getStockLoanMargin() {
		return stockLoanMargin;
	}

	public void setStockLoanMargin(com.tools20022.repository.msg.Rate2 stockLoanMargin) {
		this.stockLoanMargin = stockLoanMargin;
	}

	@XmlElement(name = "SctiesHrcut")
	public Rate2 getSecuritiesHaircut() {
		return securitiesHaircut;
	}

	public void setSecuritiesHaircut(com.tools20022.repository.msg.Rate2 securitiesHaircut) {
		this.securitiesHaircut = securitiesHaircut;
	}

	@XmlElement(name = "PricgRate")
	public RateOrName1Choice getPricingRate() {
		return pricingRate;
	}

	public void setPricingRate(RateOrName1Choice pricingRate) {
		this.pricingRate = pricingRate;
	}

	@XmlElement(name = "Sprd")
	public Rate2 getSpread() {
		return spread;
	}

	public void setSpread(com.tools20022.repository.msg.Rate2 spread) {
		this.spread = spread;
	}

	@XmlElement(name = "DlvrgSttlmPties")
	public SettlementParties36 getDeliveringSettlementParties() {
		return deliveringSettlementParties;
	}

	public void setDeliveringSettlementParties(com.tools20022.repository.msg.SettlementParties36 deliveringSettlementParties) {
		this.deliveringSettlementParties = deliveringSettlementParties;
	}

	@XmlElement(name = "RcvgSttlmPties")
	public SettlementParties36 getReceivingSettlementParties() {
		return receivingSettlementParties;
	}

	public void setReceivingSettlementParties(com.tools20022.repository.msg.SettlementParties36 receivingSettlementParties) {
		this.receivingSettlementParties = receivingSettlementParties;
	}

	@XmlElement(name = "Invstr")
	public PartyIdentification99 getInvestor() {
		return investor;
	}

	public void setInvestor(com.tools20022.repository.msg.PartyIdentification99 investor) {
		this.investor = investor;
	}

	@XmlElement(name = "SttlmInstrPrcgAddtlDtls")
	public Max350Text getSettlementInstructionProcessingAdditionalDetails() {
		return settlementInstructionProcessingAdditionalDetails;
	}

	public void setSettlementInstructionProcessingAdditionalDetails(Max350Text settlementInstructionProcessingAdditionalDetails) {
		this.settlementInstructionProcessingAdditionalDetails = settlementInstructionProcessingAdditionalDetails;
	}
}