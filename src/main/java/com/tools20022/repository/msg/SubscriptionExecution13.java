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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
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
 * Execution of a subscription order.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmOrderReference
 * SubscriptionExecution13.mmOrderReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmClientReference
 * SubscriptionExecution13.mmClientReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmDealReference
 * SubscriptionExecution13.mmDealReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmOrderType
 * SubscriptionExecution13.mmOrderType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmFinancialInstrumentDetails
 * SubscriptionExecution13.mmFinancialInstrumentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmSubAccountForHolding
 * SubscriptionExecution13.mmSubAccountForHolding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmUnitsNumber
 * SubscriptionExecution13.mmUnitsNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmRounding
 * SubscriptionExecution13.mmRounding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmNetAmount
 * SubscriptionExecution13.mmNetAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmGrossAmount
 * SubscriptionExecution13.mmGrossAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmTradeDateTime
 * SubscriptionExecution13.mmTradeDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmDealingPriceDetails
 * SubscriptionExecution13.mmDealingPriceDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmInformativePriceDetails
 * SubscriptionExecution13.mmInformativePriceDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmSettlementAmount
 * SubscriptionExecution13.mmSettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmCashSettlementDate
 * SubscriptionExecution13.mmCashSettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmSettlementMethod
 * SubscriptionExecution13.mmSettlementMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmPartiallyExecutedIndicator
 * SubscriptionExecution13.mmPartiallyExecutedIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmBestExecution
 * SubscriptionExecution13.mmBestExecution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmCumDividendIndicator
 * SubscriptionExecution13.mmCumDividendIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmInterimProfitAmount
 * SubscriptionExecution13.mmInterimProfitAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmForeignExchangeDetails
 * SubscriptionExecution13.mmForeignExchangeDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmIncomePreference
 * SubscriptionExecution13.mmIncomePreference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmLetterIntentReference
 * SubscriptionExecution13.mmLetterIntentReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmAccumulationRightReference
 * SubscriptionExecution13.mmAccumulationRightReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmTransactionOverhead
 * SubscriptionExecution13.mmTransactionOverhead}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmInformativeTaxDetails
 * SubscriptionExecution13.mmInformativeTaxDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmSettlementAndCustodyDetails
 * SubscriptionExecution13.mmSettlementAndCustodyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmPhysicalDeliveryIndicator
 * SubscriptionExecution13.mmPhysicalDeliveryIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmPhysicalDeliveryDetails
 * SubscriptionExecution13.mmPhysicalDeliveryDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmRequestedSettlementCurrency
 * SubscriptionExecution13.mmRequestedSettlementCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmRequestedNAVCurrency
 * SubscriptionExecution13.mmRequestedNAVCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmRefund
 * SubscriptionExecution13.mmRefund}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmSubscriptionInterest
 * SubscriptionExecution13.mmSubscriptionInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmCashSettlementDetails
 * SubscriptionExecution13.mmCashSettlementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmNonStandardSettlementInformation
 * SubscriptionExecution13.mmNonStandardSettlementInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmPartialSettlementOfUnits
 * SubscriptionExecution13.mmPartialSettlementOfUnits}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmPartialSettlementOfCash
 * SubscriptionExecution13.mmPartialSettlementOfCash}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmStaffClientBreakdown
 * SubscriptionExecution13.mmStaffClientBreakdown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmFinancialAdvice
 * SubscriptionExecution13.mmFinancialAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmNegotiatedTrade
 * SubscriptionExecution13.mmNegotiatedTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmLateReport
 * SubscriptionExecution13.mmLateReport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmRelatedPartyDetails
 * SubscriptionExecution13.mmRelatedPartyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmEqualisation
 * SubscriptionExecution13.mmEqualisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmSourceOfCash
 * SubscriptionExecution13.mmSourceOfCash}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmCustomerConductClassification
 * SubscriptionExecution13.mmCustomerConductClassification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmTransactionChannelType
 * SubscriptionExecution13.mmTransactionChannelType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmSignatureType
 * SubscriptionExecution13.mmSignatureType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmOrderWaiverDetails
 * SubscriptionExecution13.mmOrderWaiverDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SubscriptionExecution
 * SubscriptionExecution}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintPriceDifferenceReasonRule#forSubscriptionExecution13
 * ConstraintPriceDifferenceReasonRule.forSubscriptionExecution13}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintPhysicalDeliveryDetails1Rule#forSubscriptionExecution13
 * ConstraintPhysicalDeliveryDetails1Rule.forSubscriptionExecution13}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintPhysicalDeliveryDetails2Rule#forSubscriptionExecution13
 * ConstraintPhysicalDeliveryDetails2Rule.forSubscriptionExecution13}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintRequestedSettlementCurrencyRule#forSubscriptionExecution13
 * ConstraintRequestedSettlementCurrencyRule.forSubscriptionExecution13}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SubscriptionExecution13"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Execution of a subscription order."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6
 * SubscriptionExecution6}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SubscriptionExecution13", propOrder = {"orderReference", "clientReference", "dealReference", "orderType", "financialInstrumentDetails", "subAccountForHolding", "unitsNumber", "rounding", "netAmount", "grossAmount",
		"tradeDateTime", "dealingPriceDetails", "informativePriceDetails", "settlementAmount", "cashSettlementDate", "settlementMethod", "partiallyExecutedIndicator", "bestExecution", "cumDividendIndicator", "interimProfitAmount",
		"foreignExchangeDetails", "incomePreference", "letterIntentReference", "accumulationRightReference", "transactionOverhead", "informativeTaxDetails", "settlementAndCustodyDetails", "physicalDeliveryIndicator",
		"physicalDeliveryDetails", "requestedSettlementCurrency", "requestedNAVCurrency", "refund", "subscriptionInterest", "cashSettlementDetails", "nonStandardSettlementInformation", "partialSettlementOfUnits", "partialSettlementOfCash",
		"staffClientBreakdown", "financialAdvice", "negotiatedTrade", "lateReport", "relatedPartyDetails", "equalisation", "sourceOfCash", "customerConductClassification", "transactionChannelType", "signatureType", "orderWaiverDetails"})
public class SubscriptionExecution13 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "OrdrRef", required = true)
	protected Max35Text orderReference;
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
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13
	 * SubscriptionExecution13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrdrRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier for the order, as assigned by the instructing party."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#mmOrderReference
	 * SubscriptionExecution6.mmOrderReference}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SubscriptionExecution13, Max35Text> mmOrderReference = new MMMessageAttribute<SubscriptionExecution13, Max35Text>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionExecution13.mmObject();
			isDerived = false;
			xmlTag = "OrdrRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderReference";
			definition = "Unique and unambiguous identifier for the order, as assigned by the instructing party.";
			previousVersion_lazy = () -> SubscriptionExecution6.mmOrderReference;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(SubscriptionExecution13 obj) {
			return obj.getOrderReference();
		}

		@Override
		public void setValue(SubscriptionExecution13 obj, Max35Text value) {
			obj.setOrderReference(value);
		}
	};
	@XmlElement(name = "ClntRef")
	protected Max35Text clientReference;
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#mmClientReference
	 * InvestmentFundTransaction.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13
	 * SubscriptionExecution13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClntRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClientReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous investor's identification of the order. This reference can typically be used in a hub scenario to give the reference of the order as assigned by the underlying client."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#mmClientReference
	 * SubscriptionExecution6.mmClientReference}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SubscriptionExecution13, Optional<Max35Text>> mmClientReference = new MMMessageAttribute<SubscriptionExecution13, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundTransaction.mmClientReference;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionExecution13.mmObject();
			isDerived = false;
			xmlTag = "ClntRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClientReference";
			definition = "Unique and unambiguous investor's identification of the order. This reference can typically be used in a hub scenario to give the reference of the order as assigned by the underlying client.";
			previousVersion_lazy = () -> SubscriptionExecution6.mmClientReference;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(SubscriptionExecution13 obj) {
			return obj.getClientReference();
		}

		@Override
		public void setValue(SubscriptionExecution13 obj, Optional<Max35Text> value) {
			obj.setClientReference(value.orElse(null));
		}
	};
	@XmlElement(name = "DealRef", required = true)
	protected Max35Text dealReference;
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmDealIdentification
	 * InvestmentFundOrderExecution.mmDealIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13
	 * SubscriptionExecution13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DealRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DealReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier for the order execution, as assigned by the confirming party."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#mmDealReference
	 * SubscriptionExecution6.mmDealReference}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SubscriptionExecution13, Max35Text> mmDealReference = new MMMessageAttribute<SubscriptionExecution13, Max35Text>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrderExecution.mmDealIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionExecution13.mmObject();
			isDerived = false;
			xmlTag = "DealRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DealReference";
			definition = "Unique and unambiguous identifier for the order execution, as assigned by the confirming party.";
			previousVersion_lazy = () -> SubscriptionExecution6.mmDealReference;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(SubscriptionExecution13 obj) {
			return obj.getDealReference();
		}

		@Override
		public void setValue(SubscriptionExecution13 obj, Max35Text value) {
			obj.setDealReference(value);
		}
	};
	@XmlElement(name = "OrdrTp")
	protected List<FundOrderType4Choice> orderType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.FundOrderType4Choice
	 * FundOrderType4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmOrderType
	 * InvestmentFundOrder.mmOrderType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13
	 * SubscriptionExecution13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrdrTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Category of the investment fund order."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#mmOrderType
	 * SubscriptionExecution6.mmOrderType}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SubscriptionExecution13, List<FundOrderType4Choice>> mmOrderType = new MMMessageAssociationEnd<SubscriptionExecution13, List<FundOrderType4Choice>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrder.mmOrderType;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionExecution13.mmObject();
			isDerived = false;
			xmlTag = "OrdrTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderType";
			definition = "Category of the investment fund order.";
			previousVersion_lazy = () -> SubscriptionExecution6.mmOrderType;
			maxOccurs = 10;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FundOrderType4Choice.mmObject();
		}

		@Override
		public List<FundOrderType4Choice> getValue(SubscriptionExecution13 obj) {
			return obj.getOrderType();
		}

		@Override
		public void setValue(SubscriptionExecution13 obj, List<FundOrderType4Choice> value) {
			obj.setOrderType(value);
		}
	};
	@XmlElement(name = "FinInstrmDtls", required = true)
	protected FinancialInstrument57 financialInstrumentDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.FinancialInstrument57
	 * FinancialInstrument57}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#mmInvestmentFundClass
	 * InvestmentFundTransaction.mmInvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13
	 * SubscriptionExecution13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinInstrmDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Investment fund class to which the investment fund order execution is related."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#mmFinancialInstrumentDetails
	 * SubscriptionExecution6.mmFinancialInstrumentDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SubscriptionExecution13, FinancialInstrument57> mmFinancialInstrumentDetails = new MMMessageAssociationEnd<SubscriptionExecution13, FinancialInstrument57>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundTransaction.mmInvestmentFundClass;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionExecution13.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentDetails";
			definition = "Investment fund class to which the investment fund order execution is related.";
			previousVersion_lazy = () -> SubscriptionExecution6.mmFinancialInstrumentDetails;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> FinancialInstrument57.mmObject();
		}

		@Override
		public FinancialInstrument57 getValue(SubscriptionExecution13 obj) {
			return obj.getFinancialInstrumentDetails();
		}

		@Override
		public void setValue(SubscriptionExecution13 obj, FinancialInstrument57 value) {
			obj.setFinancialInstrumentDetails(value);
		}
	};
	@XmlElement(name = "SubAcctForHldg")
	protected SubAccount6 subAccountForHolding;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SubAccount6
	 * SubAccount6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmSubAccount
	 * Account.mmSubAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13
	 * SubscriptionExecution13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SubAcctForHldg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubAccountForHolding"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Subdivision of the account used to segregate specific holdings."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#mmSubAccountForHolding
	 * SubscriptionExecution6.mmSubAccountForHolding}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SubscriptionExecution13, Optional<SubAccount6>> mmSubAccountForHolding = new MMMessageAssociationEnd<SubscriptionExecution13, Optional<SubAccount6>>() {
		{
			businessElementTrace_lazy = () -> Account.mmSubAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionExecution13.mmObject();
			isDerived = false;
			xmlTag = "SubAcctForHldg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubAccountForHolding";
			definition = "Subdivision of the account used to segregate specific holdings.";
			previousVersion_lazy = () -> SubscriptionExecution6.mmSubAccountForHolding;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SubAccount6.mmObject();
		}

		@Override
		public Optional<SubAccount6> getValue(SubscriptionExecution13 obj) {
			return obj.getSubAccountForHolding();
		}

		@Override
		public void setValue(SubscriptionExecution13 obj, Optional<SubAccount6> value) {
			obj.setSubAccountForHolding(value.orElse(null));
		}
	};
	@XmlElement(name = "UnitsNb", required = true)
	protected DecimalNumber unitsNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmUnitsNumber
	 * InvestmentFundOrderExecution.mmUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13
	 * SubscriptionExecution13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UnitsNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :36B::CONF</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnitsNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of investment fund units subscribed."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#mmUnitsNumber
	 * SubscriptionExecution6.mmUnitsNumber}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SubscriptionExecution13, DecimalNumber> mmUnitsNumber = new MMMessageAttribute<SubscriptionExecution13, DecimalNumber>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrderExecution.mmUnitsNumber;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionExecution13.mmObject();
			isDerived = false;
			xmlTag = "UnitsNb";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":36B::CONF"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnitsNumber";
			definition = "Number of investment fund units subscribed.";
			previousVersion_lazy = () -> SubscriptionExecution6.mmUnitsNumber;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}

		@Override
		public DecimalNumber getValue(SubscriptionExecution13 obj) {
			return obj.getUnitsNumber();
		}

		@Override
		public void setValue(SubscriptionExecution13 obj, DecimalNumber value) {
			obj.setUnitsNumber(value);
		}
	};
	@XmlElement(name = "Rndg")
	protected RoundingDirection2Code rounding;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.RoundingDirection2Code
	 * RoundingDirection2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.RoundingParameters#mmRoundingDirection
	 * RoundingParameters.mmRoundingDirection}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13
	 * SubscriptionExecution13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rndg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rounding"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the rounding direction applied to nearest unit."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#mmRounding
	 * SubscriptionExecution6.mmRounding}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SubscriptionExecution13, Optional<RoundingDirection2Code>> mmRounding = new MMMessageAttribute<SubscriptionExecution13, Optional<RoundingDirection2Code>>() {
		{
			businessElementTrace_lazy = () -> RoundingParameters.mmRoundingDirection;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionExecution13.mmObject();
			isDerived = false;
			xmlTag = "Rndg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rounding";
			definition = "Indicates the rounding direction applied to nearest unit.";
			previousVersion_lazy = () -> SubscriptionExecution6.mmRounding;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RoundingDirection2Code.mmObject();
		}

		@Override
		public Optional<RoundingDirection2Code> getValue(SubscriptionExecution13 obj) {
			return obj.getRounding();
		}

		@Override
		public void setValue(SubscriptionExecution13 obj, Optional<RoundingDirection2Code> value) {
			obj.setRounding(value.orElse(null));
		}
	};
	@XmlElement(name = "NetAmt")
	protected ActiveCurrencyAndAmount netAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SubscriptionExecution#mmInvestedNetAmount
	 * SubscriptionExecution.mmInvestedNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13
	 * SubscriptionExecution13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NetAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money invested in the fund. \r\nNet Amount = Quantity * Price."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#mmNetAmount
	 * SubscriptionExecution6.mmNetAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SubscriptionExecution13, Optional<ActiveCurrencyAndAmount>> mmNetAmount = new MMMessageAttribute<SubscriptionExecution13, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> SubscriptionExecution.mmInvestedNetAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionExecution13.mmObject();
			isDerived = false;
			xmlTag = "NetAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetAmount";
			definition = "Amount of money invested in the fund. \r\nNet Amount = Quantity * Price.";
			previousVersion_lazy = () -> SubscriptionExecution6.mmNetAmount;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(SubscriptionExecution13 obj) {
			return obj.getNetAmount();
		}

		@Override
		public void setValue(SubscriptionExecution13 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setNetAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "GrssAmt")
	protected ActiveCurrencyAndAmount grossAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmGrossAmount
	 * InvestmentFundOrder.mmGrossAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13
	 * SubscriptionExecution13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GrssAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money to be paid by the investor when subscribing to fund units.\r\nGross amount = (Quantity * Price) + (Fees + Taxes)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#mmGrossAmount
	 * SubscriptionExecution6.mmGrossAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SubscriptionExecution13, Optional<ActiveCurrencyAndAmount>> mmGrossAmount = new MMMessageAttribute<SubscriptionExecution13, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrder.mmGrossAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionExecution13.mmObject();
			isDerived = false;
			xmlTag = "GrssAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossAmount";
			definition = "Amount of money to be paid by the investor when subscribing to fund units.\r\nGross amount = (Quantity * Price) + (Fees + Taxes).";
			previousVersion_lazy = () -> SubscriptionExecution6.mmGrossAmount;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(SubscriptionExecution13 obj) {
			return obj.getGrossAmount();
		}

		@Override
		public void setValue(SubscriptionExecution13 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setGrossAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "TradDtTm", required = true)
	protected DateAndDateTimeChoice tradeDateTime;
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
	 * {@linkplain com.tools20022.repository.entity.Trade#mmTradeDateTime
	 * Trade.mmTradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13
	 * SubscriptionExecution13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradDtTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time at which a price is applied, according to the terms stated in the prospectus."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#mmTradeDateTime
	 * SubscriptionExecution6.mmTradeDateTime}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SubscriptionExecution13, DateAndDateTimeChoice> mmTradeDateTime = new MMMessageAttribute<SubscriptionExecution13, DateAndDateTimeChoice>() {
		{
			businessElementTrace_lazy = () -> Trade.mmTradeDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionExecution13.mmObject();
			isDerived = false;
			xmlTag = "TradDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDateTime";
			definition = "Date and time at which a price is applied, according to the terms stated in the prospectus.";
			previousVersion_lazy = () -> SubscriptionExecution6.mmTradeDateTime;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DateAndDateTimeChoice.mmObject();
		}

		@Override
		public DateAndDateTimeChoice getValue(SubscriptionExecution13 obj) {
			return obj.getTradeDateTime();
		}

		@Override
		public void setValue(SubscriptionExecution13 obj, DateAndDateTimeChoice value) {
			obj.setTradeDateTime(value);
		}
	};
	@XmlElement(name = "DealgPricDtls", required = true)
	protected UnitPrice22 dealingPriceDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.UnitPrice22
	 * UnitPrice22}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmExecutedTradePrice
	 * InvestmentFundOrderExecution.mmExecutedTradePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13
	 * SubscriptionExecution13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DealgPricDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DealingPriceDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Price at which the order was executed."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#mmDealingPriceDetails
	 * SubscriptionExecution6.mmDealingPriceDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SubscriptionExecution13, UnitPrice22> mmDealingPriceDetails = new MMMessageAssociationEnd<SubscriptionExecution13, UnitPrice22>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrderExecution.mmExecutedTradePrice;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionExecution13.mmObject();
			isDerived = false;
			xmlTag = "DealgPricDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DealingPriceDetails";
			definition = "Price at which the order was executed.";
			previousVersion_lazy = () -> SubscriptionExecution6.mmDealingPriceDetails;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> UnitPrice22.mmObject();
		}

		@Override
		public UnitPrice22 getValue(SubscriptionExecution13 obj) {
			return obj.getDealingPriceDetails();
		}

		@Override
		public void setValue(SubscriptionExecution13 obj, UnitPrice22 value) {
			obj.setDealingPriceDetails(value);
		}
	};
	@XmlElement(name = "InftvPricDtls")
	protected List<UnitPrice22> informativePriceDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.UnitPrice22
	 * UnitPrice22}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmInformativePrice
	 * InvestmentFundOrderExecution.mmInformativePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13
	 * SubscriptionExecution13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InftvPricDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InformativePriceDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Other quoted price than the one at which the order was executed."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#mmInformativePriceDetails
	 * SubscriptionExecution6.mmInformativePriceDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SubscriptionExecution13, List<UnitPrice22>> mmInformativePriceDetails = new MMMessageAssociationEnd<SubscriptionExecution13, List<UnitPrice22>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrderExecution.mmInformativePrice;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionExecution13.mmObject();
			isDerived = false;
			xmlTag = "InftvPricDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InformativePriceDetails";
			definition = "Other quoted price than the one at which the order was executed.";
			previousVersion_lazy = () -> SubscriptionExecution6.mmInformativePriceDetails;
			maxOccurs = 2;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> UnitPrice22.mmObject();
		}

		@Override
		public List<UnitPrice22> getValue(SubscriptionExecution13 obj) {
			return obj.getInformativePriceDetails();
		}

		@Override
		public void setValue(SubscriptionExecution13 obj, List<UnitPrice22> value) {
			obj.setInformativePriceDetails(value);
		}
	};
	@XmlElement(name = "SttlmAmt", required = true)
	protected ActiveCurrencyAndAmount settlementAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSettlementAmount
	 * SecuritiesSettlement.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13
	 * SubscriptionExecution13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total amount of money paid /to be paid or received in exchange for the financial instrument in the individual order."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#mmSettlementAmount
	 * SubscriptionExecution6.mmSettlementAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SubscriptionExecution13, ActiveCurrencyAndAmount> mmSettlementAmount = new MMMessageAttribute<SubscriptionExecution13, ActiveCurrencyAndAmount>() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmSettlementAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionExecution13.mmObject();
			isDerived = false;
			xmlTag = "SttlmAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementAmount";
			definition = "Total amount of money paid /to be paid or received in exchange for the financial instrument in the individual order.";
			previousVersion_lazy = () -> SubscriptionExecution6.mmSettlementAmount;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public ActiveCurrencyAndAmount getValue(SubscriptionExecution13 obj) {
			return obj.getSettlementAmount();
		}

		@Override
		public void setValue(SubscriptionExecution13 obj, ActiveCurrencyAndAmount value) {
			obj.setSettlementAmount(value);
		}
	};
	@XmlElement(name = "CshSttlmDt")
	protected ISODate cashSettlementDate;
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
	 * {@linkplain com.tools20022.repository.entity.Payment#mmValueDate
	 * Payment.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13
	 * SubscriptionExecution13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshSttlmDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashSettlementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date on which cash is available."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#mmCashSettlementDate
	 * SubscriptionExecution6.mmCashSettlementDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SubscriptionExecution13, Optional<ISODate>> mmCashSettlementDate = new MMMessageAttribute<SubscriptionExecution13, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> Payment.mmValueDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionExecution13.mmObject();
			isDerived = false;
			xmlTag = "CshSttlmDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashSettlementDate";
			definition = "Date on which cash is available.";
			previousVersion_lazy = () -> SubscriptionExecution6.mmCashSettlementDate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(SubscriptionExecution13 obj) {
			return obj.getCashSettlementDate();
		}

		@Override
		public void setValue(SubscriptionExecution13 obj, Optional<ISODate> value) {
			obj.setCashSettlementDate(value.orElse(null));
		}
	};
	@XmlElement(name = "SttlmMtd")
	protected DeliveryReceiptType2Code settlementMethod;
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
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13
	 * SubscriptionExecution13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmMtd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Method by which the transaction is settled."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#mmSettlementMethod
	 * SubscriptionExecution6.mmSettlementMethod}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SubscriptionExecution13, Optional<DeliveryReceiptType2Code>> mmSettlementMethod = new MMMessageAttribute<SubscriptionExecution13, Optional<DeliveryReceiptType2Code>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmSettlementType;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionExecution13.mmObject();
			isDerived = false;
			xmlTag = "SttlmMtd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementMethod";
			definition = "Method by which the transaction is settled.";
			previousVersion_lazy = () -> SubscriptionExecution6.mmSettlementMethod;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DeliveryReceiptType2Code.mmObject();
		}

		@Override
		public Optional<DeliveryReceiptType2Code> getValue(SubscriptionExecution13 obj) {
			return obj.getSettlementMethod();
		}

		@Override
		public void setValue(SubscriptionExecution13 obj, Optional<DeliveryReceiptType2Code> value) {
			obj.setSettlementMethod(value.orElse(null));
		}
	};
	@XmlElement(name = "PrtlyExctdInd", required = true)
	protected YesNoIndicator partiallyExecutedIndicator;
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmPartiallyExecutedIndicator
	 * InvestmentFundOrderExecution.mmPartiallyExecutedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13
	 * SubscriptionExecution13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtlyExctdInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartiallyExecutedIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the order has been partially executed, that is, the confirmed quantity does not match the ordered quantity for a given financial instrument."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#mmPartiallyExecutedIndicator
	 * SubscriptionExecution6.mmPartiallyExecutedIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SubscriptionExecution13, YesNoIndicator> mmPartiallyExecutedIndicator = new MMMessageAttribute<SubscriptionExecution13, YesNoIndicator>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrderExecution.mmPartiallyExecutedIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionExecution13.mmObject();
			isDerived = false;
			xmlTag = "PrtlyExctdInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartiallyExecutedIndicator";
			definition = "Indicates whether the order has been partially executed, that is, the confirmed quantity does not match the ordered quantity for a given financial instrument.";
			previousVersion_lazy = () -> SubscriptionExecution6.mmPartiallyExecutedIndicator;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(SubscriptionExecution13 obj) {
			return obj.getPartiallyExecutedIndicator();
		}

		@Override
		public void setValue(SubscriptionExecution13 obj, YesNoIndicator value) {
			obj.setPartiallyExecutedIndicator(value);
		}
	};
	@XmlElement(name = "BestExctn")
	protected BestExecution1Code bestExecution;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.BestExecution1Code
	 * BestExecution1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmBestExecution
	 * InvestmentFundOrderExecution.mmBestExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13
	 * SubscriptionExecution13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BestExctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BestExecution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies that the execution was subject to best execution rules as defined by MiFID."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#mmBestExecution
	 * SubscriptionExecution6.mmBestExecution}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SubscriptionExecution13, Optional<BestExecution1Code>> mmBestExecution = new MMMessageAttribute<SubscriptionExecution13, Optional<BestExecution1Code>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrderExecution.mmBestExecution;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionExecution13.mmObject();
			isDerived = false;
			xmlTag = "BestExctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BestExecution";
			definition = "Specifies that the execution was subject to best execution rules as defined by MiFID.";
			previousVersion_lazy = () -> SubscriptionExecution6.mmBestExecution;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> BestExecution1Code.mmObject();
		}

		@Override
		public Optional<BestExecution1Code> getValue(SubscriptionExecution13 obj) {
			return obj.getBestExecution();
		}

		@Override
		public void setValue(SubscriptionExecution13 obj, Optional<BestExecution1Code> value) {
			obj.setBestExecution(value.orElse(null));
		}
	};
	@XmlElement(name = "CumDvddInd", required = true)
	protected YesNoIndicator cumDividendIndicator;
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmCumDividendIndicator
	 * SecuritiesPricing.mmCumDividendIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13
	 * SubscriptionExecution13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CumDvddInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CumDividendIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the dividend is included, that is, cum-dividend, in the executed price. When the dividend is not included, the price will be ex-dividend."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#mmCumDividendIndicator
	 * SubscriptionExecution6.mmCumDividendIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SubscriptionExecution13, YesNoIndicator> mmCumDividendIndicator = new MMMessageAttribute<SubscriptionExecution13, YesNoIndicator>() {
		{
			businessElementTrace_lazy = () -> SecuritiesPricing.mmCumDividendIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionExecution13.mmObject();
			isDerived = false;
			xmlTag = "CumDvddInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CumDividendIndicator";
			definition = "Indicates whether the dividend is included, that is, cum-dividend, in the executed price. When the dividend is not included, the price will be ex-dividend.";
			previousVersion_lazy = () -> SubscriptionExecution6.mmCumDividendIndicator;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(SubscriptionExecution13 obj) {
			return obj.getCumDividendIndicator();
		}

		@Override
		public void setValue(SubscriptionExecution13 obj, YesNoIndicator value) {
			obj.setCumDividendIndicator(value);
		}
	};
	@XmlElement(name = "IntrmPrftAmt")
	protected ProfitAndLoss2Choice interimProfitAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.ProfitAndLoss2Choice
	 * ProfitAndLoss2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmInterimProfitAmount
	 * InvestmentFundOrderExecution.mmInterimProfitAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13
	 * SubscriptionExecution13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrmPrftAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterimProfitAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Part of the price deemed as accrued income or profit rather than capital. The interim profit amount is used for tax purposes."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#mmInterimProfitAmount
	 * SubscriptionExecution6.mmInterimProfitAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SubscriptionExecution13, Optional<ProfitAndLoss2Choice>> mmInterimProfitAmount = new MMMessageAttribute<SubscriptionExecution13, Optional<ProfitAndLoss2Choice>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrderExecution.mmInterimProfitAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionExecution13.mmObject();
			isDerived = false;
			xmlTag = "IntrmPrftAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterimProfitAmount";
			definition = "Part of the price deemed as accrued income or profit rather than capital. The interim profit amount is used for tax purposes.";
			previousVersion_lazy = () -> SubscriptionExecution6.mmInterimProfitAmount;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ProfitAndLoss2Choice.mmObject();
		}

		@Override
		public Optional<ProfitAndLoss2Choice> getValue(SubscriptionExecution13 obj) {
			return obj.getInterimProfitAmount();
		}

		@Override
		public void setValue(SubscriptionExecution13 obj, Optional<ProfitAndLoss2Choice> value) {
			obj.setInterimProfitAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "FXDtls")
	protected List<ForeignExchangeTerms33> foreignExchangeDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms33
	 * ForeignExchangeTerms33}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade#mmAgreedRate
	 * ForeignExchangeTrade.mmAgreedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13
	 * SubscriptionExecution13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FXDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignExchangeDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information needed to process a currency exchange or conversion.\r\nHow the exchange rate is expressed determines which currency is the Unit Currency and Quoted Currency. If the amounts concerned are EUR 1000 and USD 1300, the exchange rate may be expressed as per either of the following examples:\r\nEXAMPLE 1 \r\nUnitCurrency EUR\r\nQuotedCurrency USD\r\nExchangeRate 1.300\r\nEXAMPLE 2\r\nUnitCurrency USD\r\nQuotedCurrency EUR\r\nExchangeRate 0.769."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#mmForeignExchangeDetails
	 * SubscriptionExecution6.mmForeignExchangeDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SubscriptionExecution13, List<ForeignExchangeTerms33>> mmForeignExchangeDetails = new MMMessageAssociationEnd<SubscriptionExecution13, List<ForeignExchangeTerms33>>() {
		{
			businessElementTrace_lazy = () -> ForeignExchangeTrade.mmAgreedRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionExecution13.mmObject();
			isDerived = false;
			xmlTag = "FXDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignExchangeDetails";
			definition = "Information needed to process a currency exchange or conversion.\r\nHow the exchange rate is expressed determines which currency is the Unit Currency and Quoted Currency. If the amounts concerned are EUR 1000 and USD 1300, the exchange rate may be expressed as per either of the following examples:\r\nEXAMPLE 1 \r\nUnitCurrency EUR\r\nQuotedCurrency USD\r\nExchangeRate 1.300\r\nEXAMPLE 2\r\nUnitCurrency USD\r\nQuotedCurrency EUR\r\nExchangeRate 0.769.";
			previousVersion_lazy = () -> SubscriptionExecution6.mmForeignExchangeDetails;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ForeignExchangeTerms33.mmObject();
		}

		@Override
		public List<ForeignExchangeTerms33> getValue(SubscriptionExecution13 obj) {
			return obj.getForeignExchangeDetails();
		}

		@Override
		public void setValue(SubscriptionExecution13 obj, List<ForeignExchangeTerms33> value) {
			obj.setForeignExchangeDetails(value);
		}
	};
	@XmlElement(name = "IncmPref")
	protected IncomePreference1Code incomePreference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.IncomePreference1Code
	 * IncomePreference1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountService#mmIncomePreference
	 * InvestmentAccountService.mmIncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13
	 * SubscriptionExecution13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IncmPref"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncomePreference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Dividend option chosen by the account owner based on the options offered in the prospectus."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#mmIncomePreference
	 * SubscriptionExecution6.mmIncomePreference}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SubscriptionExecution13, Optional<IncomePreference1Code>> mmIncomePreference = new MMMessageAttribute<SubscriptionExecution13, Optional<IncomePreference1Code>>() {
		{
			businessElementTrace_lazy = () -> InvestmentAccountService.mmIncomePreference;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionExecution13.mmObject();
			isDerived = false;
			xmlTag = "IncmPref";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncomePreference";
			definition = "Dividend option chosen by the account owner based on the options offered in the prospectus.";
			previousVersion_lazy = () -> SubscriptionExecution6.mmIncomePreference;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> IncomePreference1Code.mmObject();
		}

		@Override
		public Optional<IncomePreference1Code> getValue(SubscriptionExecution13 obj) {
			return obj.getIncomePreference();
		}

		@Override
		public void setValue(SubscriptionExecution13 obj, Optional<IncomePreference1Code> value) {
			obj.setIncomePreference(value.orElse(null));
		}
	};
	@XmlElement(name = "LttrInttRef")
	protected Max35Text letterIntentReference;
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#mmInvestmentAccountContract
	 * InvestmentAccount.mmInvestmentAccountContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13
	 * SubscriptionExecution13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LttrInttRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LetterIntentReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference of a letter of intent program, in which sales commissions are reduced based on the aggregate of a customer's actual purchase and anticipated purchases, over a specific period of time, and as agreed by the customer. A letter of intent program is mainly used in the US market."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#mmLetterIntentReference
	 * SubscriptionExecution6.mmLetterIntentReference}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SubscriptionExecution13, Optional<Max35Text>> mmLetterIntentReference = new MMMessageAttribute<SubscriptionExecution13, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> InvestmentAccount.mmInvestmentAccountContract;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionExecution13.mmObject();
			isDerived = false;
			xmlTag = "LttrInttRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LetterIntentReference";
			definition = "Reference of a letter of intent program, in which sales commissions are reduced based on the aggregate of a customer's actual purchase and anticipated purchases, over a specific period of time, and as agreed by the customer. A letter of intent program is mainly used in the US market.";
			previousVersion_lazy = () -> SubscriptionExecution6.mmLetterIntentReference;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(SubscriptionExecution13 obj) {
			return obj.getLetterIntentReference();
		}

		@Override
		public void setValue(SubscriptionExecution13 obj, Optional<Max35Text> value) {
			obj.setLetterIntentReference(value.orElse(null));
		}
	};
	@XmlElement(name = "AcmltnRghtRef")
	protected Max35Text accumulationRightReference;
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountContract#mmAccumulationRightReference
	 * InvestmentAccountContract.mmAccumulationRightReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13
	 * SubscriptionExecution13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcmltnRghtRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccumulationRightReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference of an accumulation right program, in which sales commissions are based on a customer's present purchases of shares and the aggregate quantity previously purchased by the customer. An accumulation rights program is mainly used in the US market."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#mmAccumulationRightReference
	 * SubscriptionExecution6.mmAccumulationRightReference}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SubscriptionExecution13, Optional<Max35Text>> mmAccumulationRightReference = new MMMessageAttribute<SubscriptionExecution13, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> InvestmentAccountContract.mmAccumulationRightReference;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionExecution13.mmObject();
			isDerived = false;
			xmlTag = "AcmltnRghtRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccumulationRightReference";
			definition = "Reference of an accumulation right program, in which sales commissions are based on a customer's present purchases of shares and the aggregate quantity previously purchased by the customer. An accumulation rights program is mainly used in the US market.";
			previousVersion_lazy = () -> SubscriptionExecution6.mmAccumulationRightReference;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(SubscriptionExecution13 obj) {
			return obj.getAccumulationRightReference();
		}

		@Override
		public void setValue(SubscriptionExecution13 obj, Optional<Max35Text> value) {
			obj.setAccumulationRightReference(value.orElse(null));
		}
	};
	@XmlElement(name = "TxOvrhd")
	protected TotalFeesAndTaxes40 transactionOverhead;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TotalFeesAndTaxes40
	 * TotalFeesAndTaxes40}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTax
	 * InvestmentFundTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13
	 * SubscriptionExecution13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxOvrhd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionOverhead"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Fees (charges/commission) and taxes that are taken into consideration for the transaction, so that the total difference between the net amount and gross amount is known, without taking into account equalisation."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SubscriptionExecution13, Optional<TotalFeesAndTaxes40>> mmTransactionOverhead = new MMMessageAssociationEnd<SubscriptionExecution13, Optional<TotalFeesAndTaxes40>>() {
		{
			businessComponentTrace_lazy = () -> InvestmentFundTax.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionExecution13.mmObject();
			isDerived = false;
			xmlTag = "TxOvrhd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionOverhead";
			definition = "Fees (charges/commission) and taxes that are taken into consideration for the transaction, so that the total difference between the net amount and gross amount is known, without taking into account equalisation.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TotalFeesAndTaxes40.mmObject();
		}

		@Override
		public Optional<TotalFeesAndTaxes40> getValue(SubscriptionExecution13 obj) {
			return obj.getTransactionOverhead();
		}

		@Override
		public void setValue(SubscriptionExecution13 obj, Optional<TotalFeesAndTaxes40> value) {
			obj.setTransactionOverhead(value.orElse(null));
		}
	};
	@XmlElement(name = "InftvTaxDtls")
	protected InformativeTax1 informativeTaxDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.InformativeTax1
	 * InformativeTax1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTax SecuritiesTax}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13
	 * SubscriptionExecution13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InftvTaxDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InformativeTaxDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information about tax that does not have an impact on the transaction overhead."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SubscriptionExecution13, Optional<InformativeTax1>> mmInformativeTaxDetails = new MMMessageAssociationEnd<SubscriptionExecution13, Optional<InformativeTax1>>() {
		{
			businessComponentTrace_lazy = () -> SecuritiesTax.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionExecution13.mmObject();
			isDerived = false;
			xmlTag = "InftvTaxDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InformativeTaxDetails";
			definition = "Information about tax that does not have an impact on the transaction overhead.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> InformativeTax1.mmObject();
		}

		@Override
		public Optional<InformativeTax1> getValue(SubscriptionExecution13 obj) {
			return obj.getInformativeTaxDetails();
		}

		@Override
		public void setValue(SubscriptionExecution13 obj, Optional<InformativeTax1> value) {
			obj.setInformativeTaxDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "SttlmAndCtdyDtls")
	protected FundSettlementParameters12 settlementAndCustodyDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.FundSettlementParameters12
	 * FundSettlementParameters12}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#mmSecuritiesSettlement
	 * SecuritiesTradeExecution.mmSecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13
	 * SubscriptionExecution13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmAndCtdyDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementAndCustodyDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Parameters used to execute the settlement of an investment fund order."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#mmSettlementAndCustodyDetails
	 * SubscriptionExecution6.mmSettlementAndCustodyDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SubscriptionExecution13, Optional<FundSettlementParameters12>> mmSettlementAndCustodyDetails = new MMMessageAssociationEnd<SubscriptionExecution13, Optional<FundSettlementParameters12>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeExecution.mmSecuritiesSettlement;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionExecution13.mmObject();
			isDerived = false;
			xmlTag = "SttlmAndCtdyDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementAndCustodyDetails";
			definition = "Parameters used to execute the settlement of an investment fund order.";
			previousVersion_lazy = () -> SubscriptionExecution6.mmSettlementAndCustodyDetails;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FundSettlementParameters12.mmObject();
		}

		@Override
		public Optional<FundSettlementParameters12> getValue(SubscriptionExecution13 obj) {
			return obj.getSettlementAndCustodyDetails();
		}

		@Override
		public void setValue(SubscriptionExecution13 obj, Optional<FundSettlementParameters12> value) {
			obj.setSettlementAndCustodyDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "PhysDlvryInd", required = true)
	protected YesNoIndicator physicalDeliveryIndicator;
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
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13
	 * SubscriptionExecution13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PhysDlvryInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalDeliveryIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the financial instrument is to be physically delivered."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#mmPhysicalDeliveryIndicator
	 * SubscriptionExecution6.mmPhysicalDeliveryIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SubscriptionExecution13, YesNoIndicator> mmPhysicalDeliveryIndicator = new MMMessageAttribute<SubscriptionExecution13, YesNoIndicator>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionExecution13.mmObject();
			isDerived = false;
			xmlTag = "PhysDlvryInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalDeliveryIndicator";
			definition = "Indicates whether the financial instrument is to be physically delivered.";
			previousVersion_lazy = () -> SubscriptionExecution6.mmPhysicalDeliveryIndicator;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(SubscriptionExecution13 obj) {
			return obj.getPhysicalDeliveryIndicator();
		}

		@Override
		public void setValue(SubscriptionExecution13 obj, YesNoIndicator value) {
			obj.setPhysicalDeliveryIndicator(value);
		}
	};
	@XmlElement(name = "PhysDlvryDtls")
	protected DeliveryParameters3 physicalDeliveryDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.DeliveryParameters3
	 * DeliveryParameters3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmPhysicalDelivery
	 * SecuritiesTransfer.mmPhysicalDelivery}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13
	 * SubscriptionExecution13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PhysDlvryDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalDeliveryDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information related to the physical delivery of the securities."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#mmPhysicalDeliveryDetails
	 * SubscriptionExecution6.mmPhysicalDeliveryDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SubscriptionExecution13, Optional<DeliveryParameters3>> mmPhysicalDeliveryDetails = new MMMessageAssociationEnd<SubscriptionExecution13, Optional<DeliveryParameters3>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTransfer.mmPhysicalDelivery;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionExecution13.mmObject();
			isDerived = false;
			xmlTag = "PhysDlvryDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalDeliveryDetails";
			definition = "Information related to the physical delivery of the securities.";
			previousVersion_lazy = () -> SubscriptionExecution6.mmPhysicalDeliveryDetails;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DeliveryParameters3.mmObject();
		}

		@Override
		public Optional<DeliveryParameters3> getValue(SubscriptionExecution13 obj) {
			return obj.getPhysicalDeliveryDetails();
		}

		@Override
		public void setValue(SubscriptionExecution13 obj, Optional<DeliveryParameters3> value) {
			obj.setPhysicalDeliveryDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "ReqdSttlmCcy")
	protected ActiveCurrencyCode requestedSettlementCurrency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ActiveCurrencyCode
	 * ActiveCurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmRequestedSettlementCurrency
	 * InvestmentFundOrder.mmRequestedSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13
	 * SubscriptionExecution13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ReqdSttlmCcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedSettlementCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency requested for settlement of cash proceeds."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#mmRequestedSettlementCurrency
	 * SubscriptionExecution6.mmRequestedSettlementCurrency}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SubscriptionExecution13, Optional<ActiveCurrencyCode>> mmRequestedSettlementCurrency = new MMMessageAttribute<SubscriptionExecution13, Optional<ActiveCurrencyCode>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrder.mmRequestedSettlementCurrency;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionExecution13.mmObject();
			isDerived = false;
			xmlTag = "ReqdSttlmCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedSettlementCurrency";
			definition = "Currency requested for settlement of cash proceeds.";
			previousVersion_lazy = () -> SubscriptionExecution6.mmRequestedSettlementCurrency;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyCode.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyCode> getValue(SubscriptionExecution13 obj) {
			return obj.getRequestedSettlementCurrency();
		}

		@Override
		public void setValue(SubscriptionExecution13 obj, Optional<ActiveCurrencyCode> value) {
			obj.setRequestedSettlementCurrency(value.orElse(null));
		}
	};
	@XmlElement(name = "ReqdNAVCcy")
	protected ActiveOrHistoricCurrencyCode requestedNAVCurrency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode
	 * ActiveOrHistoricCurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmRequestedNAVCurrency
	 * InvestmentFundClass.mmRequestedNAVCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13
	 * SubscriptionExecution13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ReqdNAVCcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedNAVCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Currency to be used for pricing the fund. This currency must be among the set of currencies in which the price may be expressed, as stated in the prospectus."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#mmRequestedNAVCurrency
	 * SubscriptionExecution6.mmRequestedNAVCurrency}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SubscriptionExecution13, Optional<ActiveOrHistoricCurrencyCode>> mmRequestedNAVCurrency = new MMMessageAttribute<SubscriptionExecution13, Optional<ActiveOrHistoricCurrencyCode>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundClass.mmRequestedNAVCurrency;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionExecution13.mmObject();
			isDerived = false;
			xmlTag = "ReqdNAVCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedNAVCurrency";
			definition = "Currency to be used for pricing the fund. This currency must be among the set of currencies in which the price may be expressed, as stated in the prospectus.";
			previousVersion_lazy = () -> SubscriptionExecution6.mmRequestedNAVCurrency;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyCode.mmObject();
		}

		@Override
		public Optional<ActiveOrHistoricCurrencyCode> getValue(SubscriptionExecution13 obj) {
			return obj.getRequestedNAVCurrency();
		}

		@Override
		public void setValue(SubscriptionExecution13 obj, Optional<ActiveOrHistoricCurrencyCode> value) {
			obj.setRequestedNAVCurrency(value.orElse(null));
		}
	};
	@XmlElement(name = "Rfnd")
	protected ActiveCurrencyAndAmount refund;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SubscriptionExecution#mmRefund
	 * SubscriptionExecution.mmRefund}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13
	 * SubscriptionExecution13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rfnd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Refund"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Return of cash that has been overpaid for a subscription."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#mmRefund
	 * SubscriptionExecution6.mmRefund}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SubscriptionExecution13, Optional<ActiveCurrencyAndAmount>> mmRefund = new MMMessageAttribute<SubscriptionExecution13, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> SubscriptionExecution.mmRefund;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionExecution13.mmObject();
			isDerived = false;
			xmlTag = "Rfnd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Refund";
			definition = "Return of cash that has been overpaid for a subscription.";
			previousVersion_lazy = () -> SubscriptionExecution6.mmRefund;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(SubscriptionExecution13 obj) {
			return obj.getRefund();
		}

		@Override
		public void setValue(SubscriptionExecution13 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setRefund(value.orElse(null));
		}
	};
	@XmlElement(name = "SbcptIntrst")
	protected ActiveCurrencyAndAmount subscriptionInterest;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SubscriptionExecution#mmSubscriptionInterest
	 * SubscriptionExecution.mmSubscriptionInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13
	 * SubscriptionExecution13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SbcptIntrst"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubscriptionInterest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Interest received when a subscription amount is paid in advance and then invested by the fund."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#mmSubscriptionInterest
	 * SubscriptionExecution6.mmSubscriptionInterest}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SubscriptionExecution13, Optional<ActiveCurrencyAndAmount>> mmSubscriptionInterest = new MMMessageAttribute<SubscriptionExecution13, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> SubscriptionExecution.mmSubscriptionInterest;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionExecution13.mmObject();
			isDerived = false;
			xmlTag = "SbcptIntrst";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubscriptionInterest";
			definition = "Interest received when a subscription amount is paid in advance and then invested by the fund.";
			previousVersion_lazy = () -> SubscriptionExecution6.mmSubscriptionInterest;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(SubscriptionExecution13 obj) {
			return obj.getSubscriptionInterest();
		}

		@Override
		public void setValue(SubscriptionExecution13 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setSubscriptionInterest(value.orElse(null));
		}
	};
	@XmlElement(name = "CshSttlmDtls")
	protected PaymentTransaction70 cashSettlementDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PaymentTransaction70
	 * PaymentTransaction70}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmPaymentOffset
	 * PaymentObligation.mmPaymentOffset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13
	 * SubscriptionExecution13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshSttlmDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashSettlementDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Payment process for the transfer of cash from the debtor to the creditor."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#mmCashSettlementDetails
	 * SubscriptionExecution6.mmCashSettlementDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SubscriptionExecution13, Optional<PaymentTransaction70>> mmCashSettlementDetails = new MMMessageAssociationEnd<SubscriptionExecution13, Optional<PaymentTransaction70>>() {
		{
			businessElementTrace_lazy = () -> PaymentObligation.mmPaymentOffset;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionExecution13.mmObject();
			isDerived = false;
			xmlTag = "CshSttlmDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashSettlementDetails";
			definition = "Payment process for the transfer of cash from the debtor to the creditor.";
			previousVersion_lazy = () -> SubscriptionExecution6.mmCashSettlementDetails;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PaymentTransaction70.mmObject();
		}

		@Override
		public Optional<PaymentTransaction70> getValue(SubscriptionExecution13 obj) {
			return obj.getCashSettlementDetails();
		}

		@Override
		public void setValue(SubscriptionExecution13 obj, Optional<PaymentTransaction70> value) {
			obj.setCashSettlementDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "NonStdSttlmInf")
	protected Max350Text nonStandardSettlementInformation;
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmNonStandardSettlementInformation
	 * InvestmentFundOrderExecution.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13
	 * SubscriptionExecution13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NonStdSttlmInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonStandardSettlementInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional specific settlement information for non-regulated traded funds."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#mmNonStandardSettlementInformation
	 * SubscriptionExecution6.mmNonStandardSettlementInformation}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SubscriptionExecution13, Optional<Max350Text>> mmNonStandardSettlementInformation = new MMMessageAttribute<SubscriptionExecution13, Optional<Max350Text>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrderExecution.mmNonStandardSettlementInformation;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionExecution13.mmObject();
			isDerived = false;
			xmlTag = "NonStdSttlmInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonStandardSettlementInformation";
			definition = "Additional specific settlement information for non-regulated traded funds.";
			previousVersion_lazy = () -> SubscriptionExecution6.mmNonStandardSettlementInformation;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Optional<Max350Text> getValue(SubscriptionExecution13 obj) {
			return obj.getNonStandardSettlementInformation();
		}

		@Override
		public void setValue(SubscriptionExecution13 obj, Optional<Max350Text> value) {
			obj.setNonStandardSettlementInformation(value.orElse(null));
		}
	};
	@XmlElement(name = "PrtlSttlmOfUnits")
	protected PercentageRate partialSettlementOfUnits;
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmPartialSettlementOfUnits
	 * InvestmentFundOrderExecution.mmPartialSettlementOfUnits}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13
	 * SubscriptionExecution13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtlSttlmOfUnits"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialSettlementOfUnits"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Percentage of units partially settled."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#mmPartialSettlementOfUnits
	 * SubscriptionExecution6.mmPartialSettlementOfUnits}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SubscriptionExecution13, Optional<PercentageRate>> mmPartialSettlementOfUnits = new MMMessageAttribute<SubscriptionExecution13, Optional<PercentageRate>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrderExecution.mmPartialSettlementOfUnits;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionExecution13.mmObject();
			isDerived = false;
			xmlTag = "PrtlSttlmOfUnits";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialSettlementOfUnits";
			definition = "Percentage of units partially settled.";
			previousVersion_lazy = () -> SubscriptionExecution6.mmPartialSettlementOfUnits;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public Optional<PercentageRate> getValue(SubscriptionExecution13 obj) {
			return obj.getPartialSettlementOfUnits();
		}

		@Override
		public void setValue(SubscriptionExecution13 obj, Optional<PercentageRate> value) {
			obj.setPartialSettlementOfUnits(value.orElse(null));
		}
	};
	@XmlElement(name = "PrtlSttlmOfCsh")
	protected PercentageRate partialSettlementOfCash;
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmPartialSettlementOfCash
	 * InvestmentFundOrderExecution.mmPartialSettlementOfCash}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13
	 * SubscriptionExecution13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtlSttlmOfCsh"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialSettlementOfCash"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Percentage of cash partially settled."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#mmPartialSettlementOfCash
	 * SubscriptionExecution6.mmPartialSettlementOfCash}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SubscriptionExecution13, Optional<PercentageRate>> mmPartialSettlementOfCash = new MMMessageAttribute<SubscriptionExecution13, Optional<PercentageRate>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrderExecution.mmPartialSettlementOfCash;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionExecution13.mmObject();
			isDerived = false;
			xmlTag = "PrtlSttlmOfCsh";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialSettlementOfCash";
			definition = "Percentage of cash partially settled.";
			previousVersion_lazy = () -> SubscriptionExecution6.mmPartialSettlementOfCash;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public Optional<PercentageRate> getValue(SubscriptionExecution13 obj) {
			return obj.getPartialSettlementOfCash();
		}

		@Override
		public void setValue(SubscriptionExecution13 obj, Optional<PercentageRate> value) {
			obj.setPartialSettlementOfCash(value.orElse(null));
		}
	};
	@XmlElement(name = "StffClntBrkdwn")
	protected List<InvestmentFundsOrderBreakdown2> staffClientBreakdown;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundsOrderBreakdown2
	 * InvestmentFundsOrderBreakdown2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SubscriptionOrder
	 * SubscriptionOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13
	 * SubscriptionExecution13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StffClntBrkdwn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StaffClientBreakdown"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Breakdown of the net amount per type of order."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#mmStaffClientBreakdown
	 * SubscriptionExecution6.mmStaffClientBreakdown}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SubscriptionExecution13, List<InvestmentFundsOrderBreakdown2>> mmStaffClientBreakdown = new MMMessageAssociationEnd<SubscriptionExecution13, List<InvestmentFundsOrderBreakdown2>>() {
		{
			businessComponentTrace_lazy = () -> SubscriptionOrder.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionExecution13.mmObject();
			isDerived = false;
			xmlTag = "StffClntBrkdwn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StaffClientBreakdown";
			definition = "Breakdown of the net amount per type of order.";
			previousVersion_lazy = () -> SubscriptionExecution6.mmStaffClientBreakdown;
			maxOccurs = 4;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> InvestmentFundsOrderBreakdown2.mmObject();
		}

		@Override
		public List<InvestmentFundsOrderBreakdown2> getValue(SubscriptionExecution13 obj) {
			return obj.getStaffClientBreakdown();
		}

		@Override
		public void setValue(SubscriptionExecution13 obj, List<InvestmentFundsOrderBreakdown2> value) {
			obj.setStaffClientBreakdown(value);
		}
	};
	@XmlElement(name = "FinAdvc")
	protected FinancialAdvice1Code financialAdvice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAdvice1Code
	 * FinancialAdvice1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmFinancialAdvice
	 * InvestmentFundOrder.mmFinancialAdvice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13
	 * SubscriptionExecution13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinAdvc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialAdvice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies if advice has been received from an independent financial advisor."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#mmFinancialAdvice
	 * SubscriptionExecution6.mmFinancialAdvice}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SubscriptionExecution13, Optional<FinancialAdvice1Code>> mmFinancialAdvice = new MMMessageAttribute<SubscriptionExecution13, Optional<FinancialAdvice1Code>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrder.mmFinancialAdvice;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionExecution13.mmObject();
			isDerived = false;
			xmlTag = "FinAdvc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialAdvice";
			definition = "Specifies if advice has been received from an independent financial advisor.";
			previousVersion_lazy = () -> SubscriptionExecution6.mmFinancialAdvice;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> FinancialAdvice1Code.mmObject();
		}

		@Override
		public Optional<FinancialAdvice1Code> getValue(SubscriptionExecution13 obj) {
			return obj.getFinancialAdvice();
		}

		@Override
		public void setValue(SubscriptionExecution13 obj, Optional<FinancialAdvice1Code> value) {
			obj.setFinancialAdvice(value.orElse(null));
		}
	};
	@XmlElement(name = "NgtdTrad")
	protected NegotiatedTrade1Code negotiatedTrade;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.NegotiatedTrade1Code
	 * NegotiatedTrade1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmNegotiatedTrade
	 * InvestmentFundOrder.mmNegotiatedTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13
	 * SubscriptionExecution13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NgtdTrad"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NegotiatedTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies whether the trade is negotiated."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#mmNegotiatedTrade
	 * SubscriptionExecution6.mmNegotiatedTrade}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SubscriptionExecution13, Optional<NegotiatedTrade1Code>> mmNegotiatedTrade = new MMMessageAttribute<SubscriptionExecution13, Optional<NegotiatedTrade1Code>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrder.mmNegotiatedTrade;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionExecution13.mmObject();
			isDerived = false;
			xmlTag = "NgtdTrad";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NegotiatedTrade";
			definition = "Specifies whether the trade is negotiated.";
			previousVersion_lazy = () -> SubscriptionExecution6.mmNegotiatedTrade;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> NegotiatedTrade1Code.mmObject();
		}

		@Override
		public Optional<NegotiatedTrade1Code> getValue(SubscriptionExecution13 obj) {
			return obj.getNegotiatedTrade();
		}

		@Override
		public void setValue(SubscriptionExecution13 obj, Optional<NegotiatedTrade1Code> value) {
			obj.setNegotiatedTrade(value.orElse(null));
		}
	};
	@XmlElement(name = "LateRpt")
	protected LateReport1Code lateReport;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.LateReport1Code
	 * LateReport1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmLateReport
	 * InvestmentFundOrderExecution.mmLateReport}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13
	 * SubscriptionExecution13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LateRpt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateReport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the order execution confirmation is late."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#mmLateReport
	 * SubscriptionExecution6.mmLateReport}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SubscriptionExecution13, Optional<LateReport1Code>> mmLateReport = new MMMessageAttribute<SubscriptionExecution13, Optional<LateReport1Code>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrderExecution.mmLateReport;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionExecution13.mmObject();
			isDerived = false;
			xmlTag = "LateRpt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateReport";
			definition = "Specifies whether the order execution confirmation is late.";
			previousVersion_lazy = () -> SubscriptionExecution6.mmLateReport;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> LateReport1Code.mmObject();
		}

		@Override
		public Optional<LateReport1Code> getValue(SubscriptionExecution13 obj) {
			return obj.getLateReport();
		}

		@Override
		public void setValue(SubscriptionExecution13 obj, Optional<LateReport1Code> value) {
			obj.setLateReport(value.orElse(null));
		}
	};
	@XmlElement(name = "RltdPtyDtls")
	protected List<Intermediary39> relatedPartyDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Intermediary39
	 * Intermediary39}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Trade#mmTradePartyRole
	 * Trade.mmTradePartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13
	 * SubscriptionExecution13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RltdPtyDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedPartyDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party related to the transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#mmRelatedPartyDetails
	 * SubscriptionExecution6.mmRelatedPartyDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SubscriptionExecution13, List<Intermediary39>> mmRelatedPartyDetails = new MMMessageAssociationEnd<SubscriptionExecution13, List<Intermediary39>>() {
		{
			businessElementTrace_lazy = () -> Trade.mmTradePartyRole;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionExecution13.mmObject();
			isDerived = false;
			xmlTag = "RltdPtyDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedPartyDetails";
			definition = "Party related to the transaction.";
			previousVersion_lazy = () -> SubscriptionExecution6.mmRelatedPartyDetails;
			maxOccurs = 10;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Intermediary39.mmObject();
		}

		@Override
		public List<Intermediary39> getValue(SubscriptionExecution13 obj) {
			return obj.getRelatedPartyDetails();
		}

		@Override
		public void setValue(SubscriptionExecution13 obj, List<Intermediary39> value) {
			obj.setRelatedPartyDetails(value);
		}
	};
	@XmlElement(name = "Equlstn")
	protected Equalisation1 equalisation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Equalisation1
	 * Equalisation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmEqualisation
	 * InvestmentFundClass.mmEqualisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13
	 * SubscriptionExecution13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Equlstn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Equalisation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Part of an investor's subscription amount that is held by the fund in order to pay incentive/performance fees at the end of the fiscal year."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#mmEqualisation
	 * SubscriptionExecution6.mmEqualisation}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SubscriptionExecution13, Optional<Equalisation1>> mmEqualisation = new MMMessageAssociationEnd<SubscriptionExecution13, Optional<Equalisation1>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundClass.mmEqualisation;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionExecution13.mmObject();
			isDerived = false;
			xmlTag = "Equlstn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Equalisation";
			definition = "Part of an investor's subscription amount that is held by the fund in order to pay incentive/performance fees at the end of the fiscal year.";
			previousVersion_lazy = () -> SubscriptionExecution6.mmEqualisation;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Equalisation1.mmObject();
		}

		@Override
		public Optional<Equalisation1> getValue(SubscriptionExecution13 obj) {
			return obj.getEqualisation();
		}

		@Override
		public void setValue(SubscriptionExecution13 obj, Optional<Equalisation1> value) {
			obj.setEqualisation(value.orElse(null));
		}
	};
	@XmlElement(name = "SrcOfCsh")
	protected List<SourceOfCash1Choice> sourceOfCash;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.SourceOfCash1Choice
	 * SourceOfCash1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmSourceOfCash
	 * InvestmentFundOrderExecution.mmSourceOfCash}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13
	 * SubscriptionExecution13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SrcOfCsh"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SourceOfCash"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Source of cash used for the settlement of the subscription."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SubscriptionExecution13, List<SourceOfCash1Choice>> mmSourceOfCash = new MMMessageAssociationEnd<SubscriptionExecution13, List<SourceOfCash1Choice>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrderExecution.mmSourceOfCash;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionExecution13.mmObject();
			isDerived = false;
			xmlTag = "SrcOfCsh";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SourceOfCash";
			definition = "Source of cash used for the settlement of the subscription.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SourceOfCash1Choice.mmObject();
		}

		@Override
		public List<SourceOfCash1Choice> getValue(SubscriptionExecution13 obj) {
			return obj.getSourceOfCash();
		}

		@Override
		public void setValue(SubscriptionExecution13 obj, List<SourceOfCash1Choice> value) {
			obj.setSourceOfCash(value);
		}
	};
	@XmlElement(name = "CstmrCndctClssfctn")
	protected CustomerConductClassification1Choice customerConductClassification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.CustomerConductClassification1Choice
	 * CustomerConductClassification1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13
	 * SubscriptionExecution13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CstmrCndctClssfctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustomerConductClassification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Assessment of the customer’s behaviour at the time of the account opening application."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SubscriptionExecution13, Optional<CustomerConductClassification1Choice>> mmCustomerConductClassification = new MMMessageAttribute<SubscriptionExecution13, Optional<CustomerConductClassification1Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionExecution13.mmObject();
			isDerived = false;
			xmlTag = "CstmrCndctClssfctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustomerConductClassification";
			definition = "Assessment of the customer’s behaviour at the time of the account opening application.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CustomerConductClassification1Choice.mmObject();
		}

		@Override
		public Optional<CustomerConductClassification1Choice> getValue(SubscriptionExecution13 obj) {
			return obj.getCustomerConductClassification();
		}

		@Override
		public void setValue(SubscriptionExecution13 obj, Optional<CustomerConductClassification1Choice> value) {
			obj.setCustomerConductClassification(value.orElse(null));
		}
	};
	@XmlElement(name = "TxChanlTp")
	protected TransactionChannelType1Choice transactionChannelType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.TransactionChannelType1Choice
	 * TransactionChannelType1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AccountContract#mmTransactionChannel
	 * AccountContract.mmTransactionChannel}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13
	 * SubscriptionExecution13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxChanlTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionChannelType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Means by which the investor or account owner submits the open account form."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SubscriptionExecution13, Optional<TransactionChannelType1Choice>> mmTransactionChannelType = new MMMessageAssociationEnd<SubscriptionExecution13, Optional<TransactionChannelType1Choice>>() {
		{
			businessElementTrace_lazy = () -> AccountContract.mmTransactionChannel;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionExecution13.mmObject();
			isDerived = false;
			xmlTag = "TxChanlTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionChannelType";
			definition = "Means by which the investor or account owner submits the open account form.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TransactionChannelType1Choice.mmObject();
		}

		@Override
		public Optional<TransactionChannelType1Choice> getValue(SubscriptionExecution13 obj) {
			return obj.getTransactionChannelType();
		}

		@Override
		public void setValue(SubscriptionExecution13 obj, Optional<TransactionChannelType1Choice> value) {
			obj.setTransactionChannelType(value.orElse(null));
		}
	};
	@XmlElement(name = "SgntrTp")
	protected SignatureType1Choice signatureType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.SignatureType1Choice
	 * SignatureType1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#mmSignatureRequired
	 * InvestmentFundClassProcessingCharacteristics.mmSignatureRequired}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13
	 * SubscriptionExecution13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SgntrTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SignatureType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of signature."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SubscriptionExecution13, Optional<SignatureType1Choice>> mmSignatureType = new MMMessageAttribute<SubscriptionExecution13, Optional<SignatureType1Choice>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmSignatureRequired;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionExecution13.mmObject();
			isDerived = false;
			xmlTag = "SgntrTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SignatureType";
			definition = "Type of signature.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SignatureType1Choice.mmObject();
		}

		@Override
		public Optional<SignatureType1Choice> getValue(SubscriptionExecution13 obj) {
			return obj.getSignatureType();
		}

		@Override
		public void setValue(SubscriptionExecution13 obj, Optional<SignatureType1Choice> value) {
			obj.setSignatureType(value.orElse(null));
		}
	};
	@XmlElement(name = "OrdrWvrDtls")
	protected OrderWaiver1 orderWaiverDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.OrderWaiver1
	 * OrderWaiver1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmOrderWaiverReason
	 * InvestmentFundOrder.mmOrderWaiverReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13
	 * SubscriptionExecution13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrdrWvrDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderWaiverDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information about a non-standard order."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SubscriptionExecution13, Optional<OrderWaiver1>> mmOrderWaiverDetails = new MMMessageAssociationEnd<SubscriptionExecution13, Optional<OrderWaiver1>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrder.mmOrderWaiverReason;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionExecution13.mmObject();
			isDerived = false;
			xmlTag = "OrdrWvrDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderWaiverDetails";
			definition = "Information about a non-standard order.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> OrderWaiver1.mmObject();
		}

		@Override
		public Optional<OrderWaiver1> getValue(SubscriptionExecution13 obj) {
			return obj.getOrderWaiverDetails();
		}

		@Override
		public void setValue(SubscriptionExecution13 obj, Optional<OrderWaiver1> value) {
			obj.setOrderWaiverDetails(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SubscriptionExecution13.mmOrderReference, com.tools20022.repository.msg.SubscriptionExecution13.mmClientReference,
						com.tools20022.repository.msg.SubscriptionExecution13.mmDealReference, com.tools20022.repository.msg.SubscriptionExecution13.mmOrderType,
						com.tools20022.repository.msg.SubscriptionExecution13.mmFinancialInstrumentDetails, com.tools20022.repository.msg.SubscriptionExecution13.mmSubAccountForHolding,
						com.tools20022.repository.msg.SubscriptionExecution13.mmUnitsNumber, com.tools20022.repository.msg.SubscriptionExecution13.mmRounding, com.tools20022.repository.msg.SubscriptionExecution13.mmNetAmount,
						com.tools20022.repository.msg.SubscriptionExecution13.mmGrossAmount, com.tools20022.repository.msg.SubscriptionExecution13.mmTradeDateTime,
						com.tools20022.repository.msg.SubscriptionExecution13.mmDealingPriceDetails, com.tools20022.repository.msg.SubscriptionExecution13.mmInformativePriceDetails,
						com.tools20022.repository.msg.SubscriptionExecution13.mmSettlementAmount, com.tools20022.repository.msg.SubscriptionExecution13.mmCashSettlementDate,
						com.tools20022.repository.msg.SubscriptionExecution13.mmSettlementMethod, com.tools20022.repository.msg.SubscriptionExecution13.mmPartiallyExecutedIndicator,
						com.tools20022.repository.msg.SubscriptionExecution13.mmBestExecution, com.tools20022.repository.msg.SubscriptionExecution13.mmCumDividendIndicator,
						com.tools20022.repository.msg.SubscriptionExecution13.mmInterimProfitAmount, com.tools20022.repository.msg.SubscriptionExecution13.mmForeignExchangeDetails,
						com.tools20022.repository.msg.SubscriptionExecution13.mmIncomePreference, com.tools20022.repository.msg.SubscriptionExecution13.mmLetterIntentReference,
						com.tools20022.repository.msg.SubscriptionExecution13.mmAccumulationRightReference, com.tools20022.repository.msg.SubscriptionExecution13.mmTransactionOverhead,
						com.tools20022.repository.msg.SubscriptionExecution13.mmInformativeTaxDetails, com.tools20022.repository.msg.SubscriptionExecution13.mmSettlementAndCustodyDetails,
						com.tools20022.repository.msg.SubscriptionExecution13.mmPhysicalDeliveryIndicator, com.tools20022.repository.msg.SubscriptionExecution13.mmPhysicalDeliveryDetails,
						com.tools20022.repository.msg.SubscriptionExecution13.mmRequestedSettlementCurrency, com.tools20022.repository.msg.SubscriptionExecution13.mmRequestedNAVCurrency,
						com.tools20022.repository.msg.SubscriptionExecution13.mmRefund, com.tools20022.repository.msg.SubscriptionExecution13.mmSubscriptionInterest,
						com.tools20022.repository.msg.SubscriptionExecution13.mmCashSettlementDetails, com.tools20022.repository.msg.SubscriptionExecution13.mmNonStandardSettlementInformation,
						com.tools20022.repository.msg.SubscriptionExecution13.mmPartialSettlementOfUnits, com.tools20022.repository.msg.SubscriptionExecution13.mmPartialSettlementOfCash,
						com.tools20022.repository.msg.SubscriptionExecution13.mmStaffClientBreakdown, com.tools20022.repository.msg.SubscriptionExecution13.mmFinancialAdvice,
						com.tools20022.repository.msg.SubscriptionExecution13.mmNegotiatedTrade, com.tools20022.repository.msg.SubscriptionExecution13.mmLateReport,
						com.tools20022.repository.msg.SubscriptionExecution13.mmRelatedPartyDetails, com.tools20022.repository.msg.SubscriptionExecution13.mmEqualisation,
						com.tools20022.repository.msg.SubscriptionExecution13.mmSourceOfCash, com.tools20022.repository.msg.SubscriptionExecution13.mmCustomerConductClassification,
						com.tools20022.repository.msg.SubscriptionExecution13.mmTransactionChannelType, com.tools20022.repository.msg.SubscriptionExecution13.mmSignatureType,
						com.tools20022.repository.msg.SubscriptionExecution13.mmOrderWaiverDetails);
				trace_lazy = () -> SubscriptionExecution.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPriceDifferenceReasonRule.forSubscriptionExecution13,
						com.tools20022.repository.constraints.ConstraintPhysicalDeliveryDetails1Rule.forSubscriptionExecution13, com.tools20022.repository.constraints.ConstraintPhysicalDeliveryDetails2Rule.forSubscriptionExecution13,
						com.tools20022.repository.constraints.ConstraintRequestedSettlementCurrencyRule.forSubscriptionExecution13);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SubscriptionExecution13";
				definition = "Execution of a subscription order.";
				previousVersion_lazy = () -> SubscriptionExecution6.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getOrderReference() {
		return orderReference;
	}

	public SubscriptionExecution13 setOrderReference(Max35Text orderReference) {
		this.orderReference = Objects.requireNonNull(orderReference);
		return this;
	}

	public Optional<Max35Text> getClientReference() {
		return clientReference == null ? Optional.empty() : Optional.of(clientReference);
	}

	public SubscriptionExecution13 setClientReference(Max35Text clientReference) {
		this.clientReference = clientReference;
		return this;
	}

	public Max35Text getDealReference() {
		return dealReference;
	}

	public SubscriptionExecution13 setDealReference(Max35Text dealReference) {
		this.dealReference = Objects.requireNonNull(dealReference);
		return this;
	}

	public List<FundOrderType4Choice> getOrderType() {
		return orderType == null ? orderType = new ArrayList<>() : orderType;
	}

	public SubscriptionExecution13 setOrderType(List<FundOrderType4Choice> orderType) {
		this.orderType = Objects.requireNonNull(orderType);
		return this;
	}

	public FinancialInstrument57 getFinancialInstrumentDetails() {
		return financialInstrumentDetails;
	}

	public SubscriptionExecution13 setFinancialInstrumentDetails(FinancialInstrument57 financialInstrumentDetails) {
		this.financialInstrumentDetails = Objects.requireNonNull(financialInstrumentDetails);
		return this;
	}

	public Optional<SubAccount6> getSubAccountForHolding() {
		return subAccountForHolding == null ? Optional.empty() : Optional.of(subAccountForHolding);
	}

	public SubscriptionExecution13 setSubAccountForHolding(SubAccount6 subAccountForHolding) {
		this.subAccountForHolding = subAccountForHolding;
		return this;
	}

	public DecimalNumber getUnitsNumber() {
		return unitsNumber;
	}

	public SubscriptionExecution13 setUnitsNumber(DecimalNumber unitsNumber) {
		this.unitsNumber = Objects.requireNonNull(unitsNumber);
		return this;
	}

	public Optional<RoundingDirection2Code> getRounding() {
		return rounding == null ? Optional.empty() : Optional.of(rounding);
	}

	public SubscriptionExecution13 setRounding(RoundingDirection2Code rounding) {
		this.rounding = rounding;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getNetAmount() {
		return netAmount == null ? Optional.empty() : Optional.of(netAmount);
	}

	public SubscriptionExecution13 setNetAmount(ActiveCurrencyAndAmount netAmount) {
		this.netAmount = netAmount;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getGrossAmount() {
		return grossAmount == null ? Optional.empty() : Optional.of(grossAmount);
	}

	public SubscriptionExecution13 setGrossAmount(ActiveCurrencyAndAmount grossAmount) {
		this.grossAmount = grossAmount;
		return this;
	}

	public DateAndDateTimeChoice getTradeDateTime() {
		return tradeDateTime;
	}

	public SubscriptionExecution13 setTradeDateTime(DateAndDateTimeChoice tradeDateTime) {
		this.tradeDateTime = Objects.requireNonNull(tradeDateTime);
		return this;
	}

	public UnitPrice22 getDealingPriceDetails() {
		return dealingPriceDetails;
	}

	public SubscriptionExecution13 setDealingPriceDetails(UnitPrice22 dealingPriceDetails) {
		this.dealingPriceDetails = Objects.requireNonNull(dealingPriceDetails);
		return this;
	}

	public List<UnitPrice22> getInformativePriceDetails() {
		return informativePriceDetails == null ? informativePriceDetails = new ArrayList<>() : informativePriceDetails;
	}

	public SubscriptionExecution13 setInformativePriceDetails(List<UnitPrice22> informativePriceDetails) {
		this.informativePriceDetails = Objects.requireNonNull(informativePriceDetails);
		return this;
	}

	public ActiveCurrencyAndAmount getSettlementAmount() {
		return settlementAmount;
	}

	public SubscriptionExecution13 setSettlementAmount(ActiveCurrencyAndAmount settlementAmount) {
		this.settlementAmount = Objects.requireNonNull(settlementAmount);
		return this;
	}

	public Optional<ISODate> getCashSettlementDate() {
		return cashSettlementDate == null ? Optional.empty() : Optional.of(cashSettlementDate);
	}

	public SubscriptionExecution13 setCashSettlementDate(ISODate cashSettlementDate) {
		this.cashSettlementDate = cashSettlementDate;
		return this;
	}

	public Optional<DeliveryReceiptType2Code> getSettlementMethod() {
		return settlementMethod == null ? Optional.empty() : Optional.of(settlementMethod);
	}

	public SubscriptionExecution13 setSettlementMethod(DeliveryReceiptType2Code settlementMethod) {
		this.settlementMethod = settlementMethod;
		return this;
	}

	public YesNoIndicator getPartiallyExecutedIndicator() {
		return partiallyExecutedIndicator;
	}

	public SubscriptionExecution13 setPartiallyExecutedIndicator(YesNoIndicator partiallyExecutedIndicator) {
		this.partiallyExecutedIndicator = Objects.requireNonNull(partiallyExecutedIndicator);
		return this;
	}

	public Optional<BestExecution1Code> getBestExecution() {
		return bestExecution == null ? Optional.empty() : Optional.of(bestExecution);
	}

	public SubscriptionExecution13 setBestExecution(BestExecution1Code bestExecution) {
		this.bestExecution = bestExecution;
		return this;
	}

	public YesNoIndicator getCumDividendIndicator() {
		return cumDividendIndicator;
	}

	public SubscriptionExecution13 setCumDividendIndicator(YesNoIndicator cumDividendIndicator) {
		this.cumDividendIndicator = Objects.requireNonNull(cumDividendIndicator);
		return this;
	}

	public Optional<ProfitAndLoss2Choice> getInterimProfitAmount() {
		return interimProfitAmount == null ? Optional.empty() : Optional.of(interimProfitAmount);
	}

	public SubscriptionExecution13 setInterimProfitAmount(ProfitAndLoss2Choice interimProfitAmount) {
		this.interimProfitAmount = interimProfitAmount;
		return this;
	}

	public List<ForeignExchangeTerms33> getForeignExchangeDetails() {
		return foreignExchangeDetails == null ? foreignExchangeDetails = new ArrayList<>() : foreignExchangeDetails;
	}

	public SubscriptionExecution13 setForeignExchangeDetails(List<ForeignExchangeTerms33> foreignExchangeDetails) {
		this.foreignExchangeDetails = Objects.requireNonNull(foreignExchangeDetails);
		return this;
	}

	public Optional<IncomePreference1Code> getIncomePreference() {
		return incomePreference == null ? Optional.empty() : Optional.of(incomePreference);
	}

	public SubscriptionExecution13 setIncomePreference(IncomePreference1Code incomePreference) {
		this.incomePreference = incomePreference;
		return this;
	}

	public Optional<Max35Text> getLetterIntentReference() {
		return letterIntentReference == null ? Optional.empty() : Optional.of(letterIntentReference);
	}

	public SubscriptionExecution13 setLetterIntentReference(Max35Text letterIntentReference) {
		this.letterIntentReference = letterIntentReference;
		return this;
	}

	public Optional<Max35Text> getAccumulationRightReference() {
		return accumulationRightReference == null ? Optional.empty() : Optional.of(accumulationRightReference);
	}

	public SubscriptionExecution13 setAccumulationRightReference(Max35Text accumulationRightReference) {
		this.accumulationRightReference = accumulationRightReference;
		return this;
	}

	public Optional<TotalFeesAndTaxes40> getTransactionOverhead() {
		return transactionOverhead == null ? Optional.empty() : Optional.of(transactionOverhead);
	}

	public SubscriptionExecution13 setTransactionOverhead(TotalFeesAndTaxes40 transactionOverhead) {
		this.transactionOverhead = transactionOverhead;
		return this;
	}

	public Optional<InformativeTax1> getInformativeTaxDetails() {
		return informativeTaxDetails == null ? Optional.empty() : Optional.of(informativeTaxDetails);
	}

	public SubscriptionExecution13 setInformativeTaxDetails(InformativeTax1 informativeTaxDetails) {
		this.informativeTaxDetails = informativeTaxDetails;
		return this;
	}

	public Optional<FundSettlementParameters12> getSettlementAndCustodyDetails() {
		return settlementAndCustodyDetails == null ? Optional.empty() : Optional.of(settlementAndCustodyDetails);
	}

	public SubscriptionExecution13 setSettlementAndCustodyDetails(FundSettlementParameters12 settlementAndCustodyDetails) {
		this.settlementAndCustodyDetails = settlementAndCustodyDetails;
		return this;
	}

	public YesNoIndicator getPhysicalDeliveryIndicator() {
		return physicalDeliveryIndicator;
	}

	public SubscriptionExecution13 setPhysicalDeliveryIndicator(YesNoIndicator physicalDeliveryIndicator) {
		this.physicalDeliveryIndicator = Objects.requireNonNull(physicalDeliveryIndicator);
		return this;
	}

	public Optional<DeliveryParameters3> getPhysicalDeliveryDetails() {
		return physicalDeliveryDetails == null ? Optional.empty() : Optional.of(physicalDeliveryDetails);
	}

	public SubscriptionExecution13 setPhysicalDeliveryDetails(DeliveryParameters3 physicalDeliveryDetails) {
		this.physicalDeliveryDetails = physicalDeliveryDetails;
		return this;
	}

	public Optional<ActiveCurrencyCode> getRequestedSettlementCurrency() {
		return requestedSettlementCurrency == null ? Optional.empty() : Optional.of(requestedSettlementCurrency);
	}

	public SubscriptionExecution13 setRequestedSettlementCurrency(ActiveCurrencyCode requestedSettlementCurrency) {
		this.requestedSettlementCurrency = requestedSettlementCurrency;
		return this;
	}

	public Optional<ActiveOrHistoricCurrencyCode> getRequestedNAVCurrency() {
		return requestedNAVCurrency == null ? Optional.empty() : Optional.of(requestedNAVCurrency);
	}

	public SubscriptionExecution13 setRequestedNAVCurrency(ActiveOrHistoricCurrencyCode requestedNAVCurrency) {
		this.requestedNAVCurrency = requestedNAVCurrency;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getRefund() {
		return refund == null ? Optional.empty() : Optional.of(refund);
	}

	public SubscriptionExecution13 setRefund(ActiveCurrencyAndAmount refund) {
		this.refund = refund;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getSubscriptionInterest() {
		return subscriptionInterest == null ? Optional.empty() : Optional.of(subscriptionInterest);
	}

	public SubscriptionExecution13 setSubscriptionInterest(ActiveCurrencyAndAmount subscriptionInterest) {
		this.subscriptionInterest = subscriptionInterest;
		return this;
	}

	public Optional<PaymentTransaction70> getCashSettlementDetails() {
		return cashSettlementDetails == null ? Optional.empty() : Optional.of(cashSettlementDetails);
	}

	public SubscriptionExecution13 setCashSettlementDetails(PaymentTransaction70 cashSettlementDetails) {
		this.cashSettlementDetails = cashSettlementDetails;
		return this;
	}

	public Optional<Max350Text> getNonStandardSettlementInformation() {
		return nonStandardSettlementInformation == null ? Optional.empty() : Optional.of(nonStandardSettlementInformation);
	}

	public SubscriptionExecution13 setNonStandardSettlementInformation(Max350Text nonStandardSettlementInformation) {
		this.nonStandardSettlementInformation = nonStandardSettlementInformation;
		return this;
	}

	public Optional<PercentageRate> getPartialSettlementOfUnits() {
		return partialSettlementOfUnits == null ? Optional.empty() : Optional.of(partialSettlementOfUnits);
	}

	public SubscriptionExecution13 setPartialSettlementOfUnits(PercentageRate partialSettlementOfUnits) {
		this.partialSettlementOfUnits = partialSettlementOfUnits;
		return this;
	}

	public Optional<PercentageRate> getPartialSettlementOfCash() {
		return partialSettlementOfCash == null ? Optional.empty() : Optional.of(partialSettlementOfCash);
	}

	public SubscriptionExecution13 setPartialSettlementOfCash(PercentageRate partialSettlementOfCash) {
		this.partialSettlementOfCash = partialSettlementOfCash;
		return this;
	}

	public List<InvestmentFundsOrderBreakdown2> getStaffClientBreakdown() {
		return staffClientBreakdown == null ? staffClientBreakdown = new ArrayList<>() : staffClientBreakdown;
	}

	public SubscriptionExecution13 setStaffClientBreakdown(List<InvestmentFundsOrderBreakdown2> staffClientBreakdown) {
		this.staffClientBreakdown = Objects.requireNonNull(staffClientBreakdown);
		return this;
	}

	public Optional<FinancialAdvice1Code> getFinancialAdvice() {
		return financialAdvice == null ? Optional.empty() : Optional.of(financialAdvice);
	}

	public SubscriptionExecution13 setFinancialAdvice(FinancialAdvice1Code financialAdvice) {
		this.financialAdvice = financialAdvice;
		return this;
	}

	public Optional<NegotiatedTrade1Code> getNegotiatedTrade() {
		return negotiatedTrade == null ? Optional.empty() : Optional.of(negotiatedTrade);
	}

	public SubscriptionExecution13 setNegotiatedTrade(NegotiatedTrade1Code negotiatedTrade) {
		this.negotiatedTrade = negotiatedTrade;
		return this;
	}

	public Optional<LateReport1Code> getLateReport() {
		return lateReport == null ? Optional.empty() : Optional.of(lateReport);
	}

	public SubscriptionExecution13 setLateReport(LateReport1Code lateReport) {
		this.lateReport = lateReport;
		return this;
	}

	public List<Intermediary39> getRelatedPartyDetails() {
		return relatedPartyDetails == null ? relatedPartyDetails = new ArrayList<>() : relatedPartyDetails;
	}

	public SubscriptionExecution13 setRelatedPartyDetails(List<Intermediary39> relatedPartyDetails) {
		this.relatedPartyDetails = Objects.requireNonNull(relatedPartyDetails);
		return this;
	}

	public Optional<Equalisation1> getEqualisation() {
		return equalisation == null ? Optional.empty() : Optional.of(equalisation);
	}

	public SubscriptionExecution13 setEqualisation(Equalisation1 equalisation) {
		this.equalisation = equalisation;
		return this;
	}

	public List<SourceOfCash1Choice> getSourceOfCash() {
		return sourceOfCash == null ? sourceOfCash = new ArrayList<>() : sourceOfCash;
	}

	public SubscriptionExecution13 setSourceOfCash(List<SourceOfCash1Choice> sourceOfCash) {
		this.sourceOfCash = Objects.requireNonNull(sourceOfCash);
		return this;
	}

	public Optional<CustomerConductClassification1Choice> getCustomerConductClassification() {
		return customerConductClassification == null ? Optional.empty() : Optional.of(customerConductClassification);
	}

	public SubscriptionExecution13 setCustomerConductClassification(CustomerConductClassification1Choice customerConductClassification) {
		this.customerConductClassification = customerConductClassification;
		return this;
	}

	public Optional<TransactionChannelType1Choice> getTransactionChannelType() {
		return transactionChannelType == null ? Optional.empty() : Optional.of(transactionChannelType);
	}

	public SubscriptionExecution13 setTransactionChannelType(TransactionChannelType1Choice transactionChannelType) {
		this.transactionChannelType = transactionChannelType;
		return this;
	}

	public Optional<SignatureType1Choice> getSignatureType() {
		return signatureType == null ? Optional.empty() : Optional.of(signatureType);
	}

	public SubscriptionExecution13 setSignatureType(SignatureType1Choice signatureType) {
		this.signatureType = signatureType;
		return this;
	}

	public Optional<OrderWaiver1> getOrderWaiverDetails() {
		return orderWaiverDetails == null ? Optional.empty() : Optional.of(orderWaiverDetails);
	}

	public SubscriptionExecution13 setOrderWaiverDetails(OrderWaiver1 orderWaiverDetails) {
		this.orderWaiverDetails = orderWaiverDetails;
		return this;
	}
}