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
import com.tools20022.repository.choice.DateAndDateTimeChoice;
import com.tools20022.repository.choice.ProfitAndLoss1Choice;
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
 * Execution of a redemption order.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#mmOrderReference
 * RedemptionExecution6.mmOrderReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#mmClientReference
 * RedemptionExecution6.mmClientReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#mmDealReference
 * RedemptionExecution6.mmDealReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#mmOrderType
 * RedemptionExecution6.mmOrderType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#mmFinancialInstrumentDetails
 * RedemptionExecution6.mmFinancialInstrumentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#mmSubAccountForHolding
 * RedemptionExecution6.mmSubAccountForHolding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#mmUnitsNumber
 * RedemptionExecution6.mmUnitsNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#mmRounding
 * RedemptionExecution6.mmRounding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#mmNetAmount
 * RedemptionExecution6.mmNetAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#mmHoldingsRedemptionRate
 * RedemptionExecution6.mmHoldingsRedemptionRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#mmGrossAmount
 * RedemptionExecution6.mmGrossAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#mmTradeDateTime
 * RedemptionExecution6.mmTradeDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#mmSettlementAmount
 * RedemptionExecution6.mmSettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#mmCashSettlementDate
 * RedemptionExecution6.mmCashSettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#mmSettlementMethod
 * RedemptionExecution6.mmSettlementMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#mmPartiallyExecutedIndicator
 * RedemptionExecution6.mmPartiallyExecutedIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#mmDealingPriceDetails
 * RedemptionExecution6.mmDealingPriceDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#mmInformativePriceDetails
 * RedemptionExecution6.mmInformativePriceDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#mmBestExecution
 * RedemptionExecution6.mmBestExecution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#mmCumDividendIndicator
 * RedemptionExecution6.mmCumDividendIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#mmInterimProfitAmount
 * RedemptionExecution6.mmInterimProfitAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#mmForeignExchangeDetails
 * RedemptionExecution6.mmForeignExchangeDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#mmIncomePreference
 * RedemptionExecution6.mmIncomePreference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#mmGroup1Or2Units
 * RedemptionExecution6.mmGroup1Or2Units}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#mmChargeGeneralDetails
 * RedemptionExecution6.mmChargeGeneralDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#mmStaffClientBreakdown
 * RedemptionExecution6.mmStaffClientBreakdown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#mmCommissionGeneralDetails
 * RedemptionExecution6.mmCommissionGeneralDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#mmTaxGeneralDetails
 * RedemptionExecution6.mmTaxGeneralDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#mmSettlementAndCustodyDetails
 * RedemptionExecution6.mmSettlementAndCustodyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#mmPhysicalDeliveryIndicator
 * RedemptionExecution6.mmPhysicalDeliveryIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#mmPhysicalDeliveryDetails
 * RedemptionExecution6.mmPhysicalDeliveryDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#mmRequestedSettlementCurrency
 * RedemptionExecution6.mmRequestedSettlementCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#mmRequestedNAVCurrency
 * RedemptionExecution6.mmRequestedNAVCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#mmCashSettlementDetails
 * RedemptionExecution6.mmCashSettlementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#mmNonStandardSettlementInformation
 * RedemptionExecution6.mmNonStandardSettlementInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#mmPartialSettlementOfUnits
 * RedemptionExecution6.mmPartialSettlementOfUnits}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#mmPartialSettlementOfCash
 * RedemptionExecution6.mmPartialSettlementOfCash}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#mmPartialRedemptionWithholdingAmount
 * RedemptionExecution6.mmPartialRedemptionWithholdingAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#mmFinancialAdvice
 * RedemptionExecution6.mmFinancialAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#mmNegotiatedTrade
 * RedemptionExecution6.mmNegotiatedTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#mmLateReport
 * RedemptionExecution6.mmLateReport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#mmRelatedPartyDetails
 * RedemptionExecution6.mmRelatedPartyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#mmEqualisation
 * RedemptionExecution6.mmEqualisation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.RedemptionExecution
 * RedemptionExecution}</li>
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
 * "RedemptionExecution6"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Execution of a redemption order."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.RedemptionExecution15
 * RedemptionExecution15}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "RedemptionExecution6", propOrder = {"orderReference", "clientReference", "dealReference", "orderType", "financialInstrumentDetails", "subAccountForHolding", "unitsNumber", "rounding", "netAmount", "holdingsRedemptionRate",
		"grossAmount", "tradeDateTime", "settlementAmount", "cashSettlementDate", "settlementMethod", "partiallyExecutedIndicator", "dealingPriceDetails", "informativePriceDetails", "bestExecution", "cumDividendIndicator",
		"interimProfitAmount", "foreignExchangeDetails", "incomePreference", "group1Or2Units", "chargeGeneralDetails", "staffClientBreakdown", "commissionGeneralDetails", "taxGeneralDetails", "settlementAndCustodyDetails",
		"physicalDeliveryIndicator", "physicalDeliveryDetails", "requestedSettlementCurrency", "requestedNAVCurrency", "cashSettlementDetails", "nonStandardSettlementInformation", "partialSettlementOfUnits", "partialSettlementOfCash",
		"partialRedemptionWithholdingAmount", "financialAdvice", "negotiatedTrade", "lateReport", "relatedPartyDetails", "equalisation"})
public class RedemptionExecution6 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text orderReference;
	/**
	 * Unique and unambiguous identifier for an order, as assigned by the
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmIdentification
	 * SecuritiesOrder.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6
	 * RedemptionExecution6}</li>
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
	 * "Unique and unambiguous identifier for an order, as assigned by the instructing party."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#mmOrderReference
	 * RedemptionExecution15.mmOrderReference}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOrderReference = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmIdentification;
			componentContext_lazy = () -> RedemptionExecution6.mmObject();
			isDerived = false;
			xmlTag = "OrdrRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderReference";
			definition = "Unique and unambiguous identifier for an order, as assigned by the instructing party.";
			nextVersions_lazy = () -> Arrays.asList(RedemptionExecution15.mmOrderReference);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text clientReference;
	/**
	 * Unique and unambiguous investor's identification of an order. This
	 * reference can typically be used in a hub scenario to give the reference
	 * of the order as assigned by the underlying client.
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#mmClientReference
	 * InvestmentFundTransaction.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6
	 * RedemptionExecution6}</li>
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
	 * "Unique and unambiguous investor's identification of an order. This reference can typically be used in a hub scenario to give the reference of the order as assigned by the underlying client."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#mmClientReference
	 * RedemptionExecution15.mmClientReference}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmClientReference = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundTransaction.mmClientReference;
			componentContext_lazy = () -> RedemptionExecution6.mmObject();
			isDerived = false;
			xmlTag = "ClntRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClientReference";
			definition = "Unique and unambiguous investor's identification of an order. This reference can typically be used in a hub scenario to give the reference of the order as assigned by the underlying client.";
			nextVersions_lazy = () -> Arrays.asList(RedemptionExecution15.mmClientReference);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text dealReference;
	/**
	 * Unique and unambiguous identifier for an order execution, as assigned by
	 * a confirming party.
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmDealIdentification
	 * InvestmentFundOrderExecution.mmDealIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6
	 * RedemptionExecution6}</li>
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
	 * "Unique and unambiguous identifier for an order execution, as assigned by a confirming party."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#mmDealReference
	 * RedemptionExecution15.mmDealReference}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDealReference = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrderExecution.mmDealIdentification;
			componentContext_lazy = () -> RedemptionExecution6.mmObject();
			isDerived = false;
			xmlTag = "DealRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DealReference";
			definition = "Unique and unambiguous identifier for an order execution, as assigned by a confirming party.";
			nextVersions_lazy = () -> Arrays.asList(RedemptionExecution15.mmDealReference);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.FundOrderType3> orderType;
	/**
	 * Specifies the category of the investment fund order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.FundOrderType3
	 * FundOrderType3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmOrderType
	 * InvestmentFundOrder.mmOrderType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6
	 * RedemptionExecution6}</li>
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
	 * definition} = "Specifies the category of the investment fund order."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#mmOrderType
	 * RedemptionExecution15.mmOrderType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOrderType = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrder.mmOrderType;
			componentContext_lazy = () -> RedemptionExecution6.mmObject();
			isDerived = false;
			xmlTag = "OrdrTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderType";
			definition = "Specifies the category of the investment fund order.";
			nextVersions_lazy = () -> Arrays.asList(RedemptionExecution15.mmOrderType);
			maxOccurs = 10;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.FundOrderType3.mmObject();
		}
	};
	protected FinancialInstrument10 financialInstrumentDetails;
	/**
	 * Investment fund class to which an investment fund order execution is
	 * related.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.FinancialInstrument10
	 * FinancialInstrument10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#mmInvestmentFundClass
	 * InvestmentFundTransaction.mmInvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6
	 * RedemptionExecution6}</li>
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
	 * "Investment fund class to which an investment fund order execution is related."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#mmFinancialInstrumentDetails
	 * RedemptionExecution15.mmFinancialInstrumentDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFinancialInstrumentDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> InvestmentFundTransaction.mmInvestmentFundClass;
			componentContext_lazy = () -> RedemptionExecution6.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentDetails";
			definition = "Investment fund class to which an investment fund order execution is related.";
			nextVersions_lazy = () -> Arrays.asList(RedemptionExecution15.mmFinancialInstrumentDetails);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.FinancialInstrument10.mmObject();
		}
	};
	protected SubAccount1 subAccountForHolding;
	/**
	 * Subdivision of an account used to segregate specific holdings.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SubAccount1
	 * SubAccount1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmSubAccount
	 * Account.mmSubAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6
	 * RedemptionExecution6}</li>
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
	 * "Subdivision of an account used to segregate specific holdings."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#mmSubAccountForHolding
	 * RedemptionExecution15.mmSubAccountForHolding}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSubAccountForHolding = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Account.mmSubAccount;
			componentContext_lazy = () -> RedemptionExecution6.mmObject();
			isDerived = false;
			xmlTag = "SubAcctForHldg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubAccountForHolding";
			definition = "Subdivision of an account used to segregate specific holdings.";
			nextVersions_lazy = () -> Arrays.asList(RedemptionExecution15.mmSubAccountForHolding);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SubAccount1.mmObject();
		}
	};
	protected FinancialInstrumentQuantity1 unitsNumber;
	/**
	 * Number of investment funds units redeemed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentQuantity1
	 * FinancialInstrumentQuantity1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmUnitsNumber
	 * InvestmentFundOrderExecution.mmUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6
	 * RedemptionExecution6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UnitsNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnitsNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of investment funds units redeemed."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#mmUnitsNumber
	 * RedemptionExecution15.mmUnitsNumber}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmUnitsNumber = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrderExecution.mmUnitsNumber;
			componentContext_lazy = () -> RedemptionExecution6.mmObject();
			isDerived = false;
			xmlTag = "UnitsNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnitsNumber";
			definition = "Number of investment funds units redeemed.";
			nextVersions_lazy = () -> Arrays.asList(RedemptionExecution15.mmUnitsNumber);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentQuantity1.mmObject();
		}
	};
	protected RoundingDirection2Code rounding;
	/**
	 * Indicates the rounding direction applied to nearest unit.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6
	 * RedemptionExecution6}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#mmRounding
	 * RedemptionExecution15.mmRounding}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRounding = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> RoundingParameters.mmRoundingDirection;
			componentContext_lazy = () -> RedemptionExecution6.mmObject();
			isDerived = false;
			xmlTag = "Rndg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rounding";
			definition = "Indicates the rounding direction applied to nearest unit.";
			nextVersions_lazy = () -> Arrays.asList(RedemptionExecution15.mmRounding);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RoundingDirection2Code.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount netAmount;
	/**
	 * Amount of money paid to the investor as a result of the redemption after
	 * deduction of charges, commissions and taxes. [(Quantity * Price) -
	 * (Charges + Commissions +Taxes)]
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.RedemptionExecution#mmRedeemedNetAmount
	 * RedemptionExecution.mmRedeemedNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6
	 * RedemptionExecution6}</li>
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
	 * "Amount of money paid to the investor as a result of the redemption after deduction of charges, commissions and taxes.\n[(Quantity * Price) - (Charges + Commissions +Taxes)]"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#mmNetAmount
	 * RedemptionExecution15.mmNetAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNetAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> RedemptionExecution.mmRedeemedNetAmount;
			componentContext_lazy = () -> RedemptionExecution6.mmObject();
			isDerived = false;
			xmlTag = "NetAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetAmount";
			definition = "Amount of money paid to the investor as a result of the redemption after deduction of charges, commissions and taxes.\n[(Quantity * Price) - (Charges + Commissions +Taxes)]";
			nextVersions_lazy = () -> Arrays.asList(RedemptionExecution15.mmNetAmount);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected PercentageRate holdingsRedemptionRate;
	/**
	 * Portion of the investor's holdings, in a specific investment fund/ fund
	 * class, that is redeemed.
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
	 * {@linkplain com.tools20022.repository.entity.RedemptionOrder#mmHoldingsRedemptionRate
	 * RedemptionOrder.mmHoldingsRedemptionRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6
	 * RedemptionExecution6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "HldgsRedRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HoldingsRedemptionRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Portion of the investor's holdings, in a specific investment fund/ fund class, that is redeemed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#mmHoldingsRedemptionRate
	 * RedemptionExecution15.mmHoldingsRedemptionRate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmHoldingsRedemptionRate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> RedemptionOrder.mmHoldingsRedemptionRate;
			componentContext_lazy = () -> RedemptionExecution6.mmObject();
			isDerived = false;
			xmlTag = "HldgsRedRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HoldingsRedemptionRate";
			definition = "Portion of the investor's holdings, in a specific investment fund/ fund class, that is redeemed.";
			nextVersions_lazy = () -> Arrays.asList(RedemptionExecution15.mmHoldingsRedemptionRate);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount grossAmount;
	/**
	 * Amount of money resulting from the redemption before deduction of
	 * charges, commissions and taxes. [Quantity * Price]
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6
	 * RedemptionExecution6}</li>
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
	 * "Amount of money resulting from the redemption before deduction of  charges, commissions and taxes.\n[Quantity * Price]"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#mmGrossAmount
	 * RedemptionExecution15.mmGrossAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmGrossAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrder.mmGrossAmount;
			componentContext_lazy = () -> RedemptionExecution6.mmObject();
			isDerived = false;
			xmlTag = "GrssAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossAmount";
			definition = "Amount of money resulting from the redemption before deduction of  charges, commissions and taxes.\n[Quantity * Price]";
			nextVersions_lazy = () -> Arrays.asList(RedemptionExecution15.mmGrossAmount);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected DateAndDateTimeChoice tradeDateTime;
	/**
	 * Date and time at which a price is applied, according to the terms stated
	 * in the prospectus.
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
	 * {@linkplain com.tools20022.repository.entity.Trade#mmTradeDateTime
	 * Trade.mmTradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6
	 * RedemptionExecution6}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#mmTradeDateTime
	 * RedemptionExecution15.mmTradeDateTime}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTradeDateTime = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Trade.mmTradeDateTime;
			componentContext_lazy = () -> RedemptionExecution6.mmObject();
			isDerived = false;
			xmlTag = "TradDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDateTime";
			definition = "Date and time at which a price is applied, according to the terms stated in the prospectus.";
			nextVersions_lazy = () -> Arrays.asList(RedemptionExecution15.mmTradeDateTime);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DateAndDateTimeChoice.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount settlementAmount;
	/**
	 * Total amount of money paid /to be paid or received in exchange for the
	 * financial instrument in the individual order.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.Payment#mmInstructedAmount
	 * Payment.mmInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6
	 * RedemptionExecution6}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#mmSettlementAmount
	 * RedemptionExecution15.mmSettlementAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSettlementAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Payment.mmInstructedAmount;
			componentContext_lazy = () -> RedemptionExecution6.mmObject();
			isDerived = false;
			xmlTag = "SttlmAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementAmount";
			definition = "Total amount of money paid /to be paid or received in exchange for the financial instrument in the individual order.";
			nextVersions_lazy = () -> Arrays.asList(RedemptionExecution15.mmSettlementAmount);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected ISODate cashSettlementDate;
	/**
	 * Date on which cash is available.
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
	 * {@linkplain com.tools20022.repository.entity.Payment#mmValueDate
	 * Payment.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6
	 * RedemptionExecution6}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#mmCashSettlementDate
	 * RedemptionExecution15.mmCashSettlementDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCashSettlementDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Payment.mmValueDate;
			componentContext_lazy = () -> RedemptionExecution6.mmObject();
			isDerived = false;
			xmlTag = "CshSttlmDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashSettlementDate";
			definition = "Date on which cash is available.";
			nextVersions_lazy = () -> Arrays.asList(RedemptionExecution15.mmCashSettlementDate);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected DeliveryReceiptType2Code settlementMethod;
	/**
	 * Method by which the transaction is settled.
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
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6
	 * RedemptionExecution6}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#mmSettlementMethod
	 * RedemptionExecution15.mmSettlementMethod}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSettlementMethod = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmSettlementType;
			componentContext_lazy = () -> RedemptionExecution6.mmObject();
			isDerived = false;
			xmlTag = "SttlmMtd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementMethod";
			definition = "Method by which the transaction is settled.";
			nextVersions_lazy = () -> Arrays.asList(RedemptionExecution15.mmSettlementMethod);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DeliveryReceiptType2Code.mmObject();
		}
	};
	protected YesNoIndicator partiallyExecutedIndicator;
	/**
	 * Indicates whether the order has been partially executed, ie, the
	 * confirmed quantity does not match the ordered quantity for a given
	 * financial instrument.
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmPartiallyExecutedIndicator
	 * InvestmentFundOrderExecution.mmPartiallyExecutedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6
	 * RedemptionExecution6}</li>
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
	 * "Indicates whether the order has been partially executed, ie, the confirmed quantity does not match the ordered quantity for a given financial instrument."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#mmPartiallyExecutedIndicator
	 * RedemptionExecution15.mmPartiallyExecutedIndicator}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPartiallyExecutedIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrderExecution.mmPartiallyExecutedIndicator;
			componentContext_lazy = () -> RedemptionExecution6.mmObject();
			isDerived = false;
			xmlTag = "PrtlyExctdInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartiallyExecutedIndicator";
			definition = "Indicates whether the order has been partially executed, ie, the confirmed quantity does not match the ordered quantity for a given financial instrument.";
			nextVersions_lazy = () -> Arrays.asList(RedemptionExecution15.mmPartiallyExecutedIndicator);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected UnitPrice10 dealingPriceDetails;
	/**
	 * Price at which the order was executed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.UnitPrice10
	 * UnitPrice10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmExecutedTradePrice
	 * InvestmentFundOrderExecution.mmExecutedTradePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6
	 * RedemptionExecution6}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#mmDealingPriceDetails
	 * RedemptionExecution15.mmDealingPriceDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDealingPriceDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrderExecution.mmExecutedTradePrice;
			componentContext_lazy = () -> RedemptionExecution6.mmObject();
			isDerived = false;
			xmlTag = "DealgPricDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DealingPriceDetails";
			definition = "Price at which the order was executed.";
			nextVersions_lazy = () -> Arrays.asList(RedemptionExecution15.mmDealingPriceDetails);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.UnitPrice10.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.UnitPrice10> informativePriceDetails;
	/**
	 * Other quoted price than the one at which the order was executed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.UnitPrice10
	 * UnitPrice10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmInformativePrice
	 * InvestmentFundOrderExecution.mmInformativePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6
	 * RedemptionExecution6}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#mmInformativePriceDetails
	 * RedemptionExecution15.mmInformativePriceDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInformativePriceDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrderExecution.mmInformativePrice;
			componentContext_lazy = () -> RedemptionExecution6.mmObject();
			isDerived = false;
			xmlTag = "InftvPricDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InformativePriceDetails";
			definition = "Other quoted price than the one at which the order was executed.";
			nextVersions_lazy = () -> Arrays.asList(RedemptionExecution15.mmInformativePriceDetails);
			maxOccurs = 2;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.UnitPrice10.mmObject();
		}
	};
	protected BestExecution1Code bestExecution;
	/**
	 * Specifies that the execution was subject to best execution rules as
	 * defined by MiFID.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6
	 * RedemptionExecution6}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#mmBestExecution
	 * RedemptionExecution15.mmBestExecution}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBestExecution = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrderExecution.mmBestExecution;
			componentContext_lazy = () -> RedemptionExecution6.mmObject();
			isDerived = false;
			xmlTag = "BestExctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BestExecution";
			definition = "Specifies that the execution was subject to best execution rules as defined by MiFID.";
			nextVersions_lazy = () -> Arrays.asList(RedemptionExecution15.mmBestExecution);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> BestExecution1Code.mmObject();
		}
	};
	protected YesNoIndicator cumDividendIndicator;
	/**
	 * Indicates whether the dividend is included, ie, cum-dividend, in the
	 * executed price. When the dividend is not included, the price will be
	 * ex-dividend.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmCumDividendIndicator
	 * SecuritiesPricing.mmCumDividendIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6
	 * RedemptionExecution6}</li>
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
	 * "Indicates whether the dividend is included, ie, cum-dividend, in the executed price. When the dividend is not included, the price will be ex-dividend."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#mmCumDividendIndicator
	 * RedemptionExecution15.mmCumDividendIndicator}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCumDividendIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesPricing.mmCumDividendIndicator;
			componentContext_lazy = () -> RedemptionExecution6.mmObject();
			isDerived = false;
			xmlTag = "CumDvddInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CumDividendIndicator";
			definition = "Indicates whether the dividend is included, ie, cum-dividend, in the executed price. When the dividend is not included, the price will be ex-dividend.";
			nextVersions_lazy = () -> Arrays.asList(RedemptionExecution15.mmCumDividendIndicator);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected ProfitAndLoss1Choice interimProfitAmount;
	/**
	 * Part of the price deemed as accrued income or profit rather than capital.
	 * The interim profit amount is used for tax purposes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.ProfitAndLoss1Choice
	 * ProfitAndLoss1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmInterimProfitAmount
	 * InvestmentFundOrderExecution.mmInterimProfitAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6
	 * RedemptionExecution6}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#mmInterimProfitAmount
	 * RedemptionExecution15.mmInterimProfitAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInterimProfitAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrderExecution.mmInterimProfitAmount;
			componentContext_lazy = () -> RedemptionExecution6.mmObject();
			isDerived = false;
			xmlTag = "IntrmPrftAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterimProfitAmount";
			definition = "Part of the price deemed as accrued income or profit rather than capital. The interim profit amount is used for tax purposes.";
			nextVersions_lazy = () -> Arrays.asList(RedemptionExecution15.mmInterimProfitAmount);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ProfitAndLoss1Choice.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.ForeignExchangeTerms7> foreignExchangeDetails;
	/**
	 * Information needed to process a currency exchange or conversion.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms7
	 * ForeignExchangeTerms7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade#mmAgreedRate
	 * ForeignExchangeTrade.mmAgreedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6
	 * RedemptionExecution6}</li>
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
	 * "Information needed to process a currency exchange or conversion."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#mmForeignExchangeDetails
	 * RedemptionExecution15.mmForeignExchangeDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmForeignExchangeDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> ForeignExchangeTrade.mmAgreedRate;
			componentContext_lazy = () -> RedemptionExecution6.mmObject();
			isDerived = false;
			xmlTag = "FXDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignExchangeDetails";
			definition = "Information needed to process a currency exchange or conversion.";
			nextVersions_lazy = () -> Arrays.asList(RedemptionExecution15.mmForeignExchangeDetails);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ForeignExchangeTerms7.mmObject();
		}
	};
	protected IncomePreference1Code incomePreference;
	/**
	 * Dividend option chosen by the account owner based on the options offered
	 * in the prospectus.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6
	 * RedemptionExecution6}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#mmIncomePreference
	 * RedemptionExecution15.mmIncomePreference}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIncomePreference = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentAccountService.mmIncomePreference;
			componentContext_lazy = () -> RedemptionExecution6.mmObject();
			isDerived = false;
			xmlTag = "IncmPref";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncomePreference";
			definition = "Dividend option chosen by the account owner based on the options offered in the prospectus.";
			nextVersions_lazy = () -> Arrays.asList(RedemptionExecution15.mmIncomePreference);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> IncomePreference1Code.mmObject();
		}
	};
	protected UKTaxGroupUnitCode group1Or2Units;
	/**
	 * Tax group to which the purchased investment fund units belong. The
	 * investor indicates to the intermediary operating pooled nominees, which
	 * type of unit is to be sold.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.UKTaxGroupUnitCode
	 * UKTaxGroupUnitCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmGroup1Or2Units
	 * SecuritiesQuantity.mmGroup1Or2Units}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6
	 * RedemptionExecution6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Grp1Or2Units"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Group1Or2Units"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Tax group to which the purchased investment fund units belong. The investor indicates to the intermediary operating pooled nominees, which type of unit is to be sold."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#mmGroup1Or2Units
	 * RedemptionExecution15.mmGroup1Or2Units}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmGroup1Or2Units = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesQuantity.mmGroup1Or2Units;
			componentContext_lazy = () -> RedemptionExecution6.mmObject();
			isDerived = false;
			xmlTag = "Grp1Or2Units";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Group1Or2Units";
			definition = "Tax group to which the purchased investment fund units belong. The investor indicates to the intermediary operating pooled nominees, which type of unit is to be sold.";
			nextVersions_lazy = () -> Arrays.asList(RedemptionExecution15.mmGroup1Or2Units);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> UKTaxGroupUnitCode.mmObject();
		}
	};
	protected TotalCharges3 chargeGeneralDetails;
	/**
	 * Amount of money associated with a service.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TotalCharges3
	 * TotalCharges3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#mmTransactionCharge
	 * InvestmentFundTransaction.mmTransactionCharge}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6
	 * RedemptionExecution6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ChrgGnlDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargeGeneralDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of money associated with a service."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmChargeGeneralDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> InvestmentFundTransaction.mmTransactionCharge;
			componentContext_lazy = () -> RedemptionExecution6.mmObject();
			isDerived = false;
			xmlTag = "ChrgGnlDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargeGeneralDetails";
			definition = "Amount of money associated with a service.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.TotalCharges3.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.InvestmentFundsOrderBreakdown1> staffClientBreakdown;
	/**
	 * Breakdown of the net amount per type of order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundsOrderBreakdown1
	 * InvestmentFundsOrderBreakdown1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.RedemptionOrder
	 * RedemptionOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6
	 * RedemptionExecution6}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#mmStaffClientBreakdown
	 * RedemptionExecution15.mmStaffClientBreakdown}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmStaffClientBreakdown = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> RedemptionOrder.mmObject();
			componentContext_lazy = () -> RedemptionExecution6.mmObject();
			isDerived = false;
			xmlTag = "StffClntBrkdwn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StaffClientBreakdown";
			definition = "Breakdown of the net amount per type of order.";
			nextVersions_lazy = () -> Arrays.asList(RedemptionExecution15.mmStaffClientBreakdown);
			maxOccurs = 4;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.InvestmentFundsOrderBreakdown1.mmObject();
		}
	};
	protected TotalCommissions3 commissionGeneralDetails;
	/**
	 * Amount of money due to a party as compensation for a service.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TotalCommissions3
	 * TotalCommissions3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Trade#mmTradeCommission
	 * Trade.mmTradeCommission}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6
	 * RedemptionExecution6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ComssnGnlDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommissionGeneralDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money due to a party as compensation for a service."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCommissionGeneralDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Trade.mmTradeCommission;
			componentContext_lazy = () -> RedemptionExecution6.mmObject();
			isDerived = false;
			xmlTag = "ComssnGnlDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommissionGeneralDetails";
			definition = "Amount of money due to a party as compensation for a service.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.TotalCommissions3.mmObject();
		}
	};
	protected TotalTaxes3 taxGeneralDetails;
	/**
	 * Tax related to an investment fund order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TotalTaxes3
	 * TotalTaxes3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#mmTransactionTax
	 * InvestmentFundTransaction.mmTransactionTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6
	 * RedemptionExecution6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxGnlDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxGeneralDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax related to an investment fund order."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTaxGeneralDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> InvestmentFundTransaction.mmTransactionTax;
			componentContext_lazy = () -> RedemptionExecution6.mmObject();
			isDerived = false;
			xmlTag = "TaxGnlDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxGeneralDetails";
			definition = "Tax related to an investment fund order.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.TotalTaxes3.mmObject();
		}
	};
	protected FundSettlementParameters4 settlementAndCustodyDetails;
	/**
	 * Parameters used to execute the settlement of an investment fund order
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.FundSettlementParameters4
	 * FundSettlementParameters4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#mmSecuritiesSettlement
	 * SecuritiesTradeExecution.mmSecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6
	 * RedemptionExecution6}</li>
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
	 * "Parameters used to execute the settlement of an investment fund order"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#mmSettlementAndCustodyDetails
	 * RedemptionExecution15.mmSettlementAndCustodyDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSettlementAndCustodyDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeExecution.mmSecuritiesSettlement;
			componentContext_lazy = () -> RedemptionExecution6.mmObject();
			isDerived = false;
			xmlTag = "SttlmAndCtdyDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementAndCustodyDetails";
			definition = "Parameters used to execute the settlement of an investment fund order";
			nextVersions_lazy = () -> Arrays.asList(RedemptionExecution15.mmSettlementAndCustodyDetails);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.FundSettlementParameters4.mmObject();
		}
	};
	protected YesNoIndicator physicalDeliveryIndicator;
	/**
	 * Indicates whether the financial instrument is to be physically delivered.
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
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6
	 * RedemptionExecution6}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#mmPhysicalDeliveryIndicator
	 * RedemptionExecution15.mmPhysicalDeliveryIndicator}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPhysicalDeliveryIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> RedemptionExecution6.mmObject();
			isDerived = false;
			xmlTag = "PhysDlvryInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalDeliveryIndicator";
			definition = "Indicates whether the financial instrument is to be physically delivered.";
			nextVersions_lazy = () -> Arrays.asList(RedemptionExecution15.mmPhysicalDeliveryIndicator);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected DeliveryParameters3 physicalDeliveryDetails;
	/**
	 * Parameters of a physical delivery.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6
	 * RedemptionExecution6}</li>
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
	 * definition} = "Parameters of a physical delivery."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#mmPhysicalDeliveryDetails
	 * RedemptionExecution15.mmPhysicalDeliveryDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPhysicalDeliveryDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesTransfer.mmPhysicalDelivery;
			componentContext_lazy = () -> RedemptionExecution6.mmObject();
			isDerived = false;
			xmlTag = "PhysDlvryDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalDeliveryDetails";
			definition = "Parameters of a physical delivery.";
			nextVersions_lazy = () -> Arrays.asList(RedemptionExecution15.mmPhysicalDeliveryDetails);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.DeliveryParameters3.mmObject();
		}
	};
	protected ActiveCurrencyCode requestedSettlementCurrency;
	/**
	 * Currency requested for settlement of cash proceeds.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6
	 * RedemptionExecution6}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#mmRequestedSettlementCurrency
	 * RedemptionExecution15.mmRequestedSettlementCurrency}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRequestedSettlementCurrency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrder.mmRequestedSettlementCurrency;
			componentContext_lazy = () -> RedemptionExecution6.mmObject();
			isDerived = false;
			xmlTag = "ReqdSttlmCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedSettlementCurrency";
			definition = "Currency requested for settlement of cash proceeds.";
			nextVersions_lazy = () -> Arrays.asList(RedemptionExecution15.mmRequestedSettlementCurrency);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyCode.mmObject();
		}
	};
	protected ActiveOrHistoricCurrencyCode requestedNAVCurrency;
	/**
	 * Currency to be used for pricing the fund. This currency must be among the
	 * set of currencies in which the price may be expressed, as stated in the
	 * prospectus.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6
	 * RedemptionExecution6}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#mmRequestedNAVCurrency
	 * RedemptionExecution15.mmRequestedNAVCurrency}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRequestedNAVCurrency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundClass.mmRequestedNAVCurrency;
			componentContext_lazy = () -> RedemptionExecution6.mmObject();
			isDerived = false;
			xmlTag = "ReqdNAVCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedNAVCurrency";
			definition = "Currency to be used for pricing the fund. This currency must be among the set of currencies in which the price may be expressed, as stated in the prospectus.";
			nextVersions_lazy = () -> Arrays.asList(RedemptionExecution15.mmRequestedNAVCurrency);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyCode.mmObject();
		}
	};
	protected PaymentTransaction22 cashSettlementDetails;
	/**
	 * Payment transaction resulting from the investment fund order execution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PaymentTransaction22
	 * PaymentTransaction22}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmPaymentOffset
	 * PaymentObligation.mmPaymentOffset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6
	 * RedemptionExecution6}</li>
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
	 * "Payment transaction resulting from the investment fund order execution."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#mmCashSettlementDetails
	 * RedemptionExecution15.mmCashSettlementDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCashSettlementDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> PaymentObligation.mmPaymentOffset;
			componentContext_lazy = () -> RedemptionExecution6.mmObject();
			isDerived = false;
			xmlTag = "CshSttlmDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashSettlementDetails";
			definition = "Payment transaction resulting from the investment fund order execution.";
			nextVersions_lazy = () -> Arrays.asList(RedemptionExecution15.mmCashSettlementDetails);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PaymentTransaction22.mmObject();
		}
	};
	protected Max350Text nonStandardSettlementInformation;
	/**
	 * Additional specific settlement information for non-regulated traded
	 * funds.
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmNonStandardSettlementInformation
	 * InvestmentFundOrderExecution.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6
	 * RedemptionExecution6}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#mmNonStandardSettlementInformation
	 * RedemptionExecution15.mmNonStandardSettlementInformation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNonStandardSettlementInformation = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrderExecution.mmNonStandardSettlementInformation;
			componentContext_lazy = () -> RedemptionExecution6.mmObject();
			isDerived = false;
			xmlTag = "NonStdSttlmInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonStandardSettlementInformation";
			definition = "Additional specific settlement information for non-regulated traded funds.";
			nextVersions_lazy = () -> Arrays.asList(RedemptionExecution15.mmNonStandardSettlementInformation);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	protected PercentageRate partialSettlementOfUnits;
	/**
	 * Percentage of units partially settled.
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmPartialSettlementOfUnits
	 * InvestmentFundOrderExecution.mmPartialSettlementOfUnits}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6
	 * RedemptionExecution6}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#mmPartialSettlementOfUnits
	 * RedemptionExecution15.mmPartialSettlementOfUnits}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPartialSettlementOfUnits = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrderExecution.mmPartialSettlementOfUnits;
			componentContext_lazy = () -> RedemptionExecution6.mmObject();
			isDerived = false;
			xmlTag = "PrtlSttlmOfUnits";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialSettlementOfUnits";
			definition = "Percentage of units partially settled.";
			nextVersions_lazy = () -> Arrays.asList(RedemptionExecution15.mmPartialSettlementOfUnits);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	protected PercentageRate partialSettlementOfCash;
	/**
	 * Percentage of cash partially settled.
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmPartialSettlementOfCash
	 * InvestmentFundOrderExecution.mmPartialSettlementOfCash}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6
	 * RedemptionExecution6}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#mmPartialSettlementOfCash
	 * RedemptionExecution15.mmPartialSettlementOfCash}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPartialSettlementOfCash = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrderExecution.mmPartialSettlementOfCash;
			componentContext_lazy = () -> RedemptionExecution6.mmObject();
			isDerived = false;
			xmlTag = "PrtlSttlmOfCsh";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialSettlementOfCash";
			definition = "Percentage of cash partially settled.";
			nextVersions_lazy = () -> Arrays.asList(RedemptionExecution15.mmPartialSettlementOfCash);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	protected CurrencyAndAmount partialRedemptionWithholdingAmount;
	/**
	 * Amount retained by the Fund and paid out later at a time decided by the
	 * Fund.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.RedemptionExecution#mmPartialRedemptionWithholdingAmount
	 * RedemptionExecution.mmPartialRedemptionWithholdingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6
	 * RedemptionExecution6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtlRedWhldgAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialRedemptionWithholdingAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount retained by the Fund and paid out later at a time decided by the Fund."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#mmPartialRedemptionWithholdingAmount
	 * RedemptionExecution15.mmPartialRedemptionWithholdingAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPartialRedemptionWithholdingAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> RedemptionExecution.mmPartialRedemptionWithholdingAmount;
			componentContext_lazy = () -> RedemptionExecution6.mmObject();
			isDerived = false;
			xmlTag = "PrtlRedWhldgAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialRedemptionWithholdingAmount";
			definition = "Amount retained by the Fund and paid out later at a time decided by the Fund.";
			nextVersions_lazy = () -> Arrays.asList(RedemptionExecution15.mmPartialRedemptionWithholdingAmount);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	protected FinancialAdvice1Code financialAdvice;
	/**
	 * Specifies if advice has been received from an independent financial
	 * advisor.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6
	 * RedemptionExecution6}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#mmFinancialAdvice
	 * RedemptionExecution15.mmFinancialAdvice}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFinancialAdvice = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrder.mmFinancialAdvice;
			componentContext_lazy = () -> RedemptionExecution6.mmObject();
			isDerived = false;
			xmlTag = "FinAdvc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialAdvice";
			definition = "Specifies if advice has been received from an independent financial advisor.";
			nextVersions_lazy = () -> Arrays.asList(RedemptionExecution15.mmFinancialAdvice);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> FinancialAdvice1Code.mmObject();
		}
	};
	protected NegotiatedTrade1Code negotiatedTrade;
	/**
	 * Specifies whether the trade is negotiated.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6
	 * RedemptionExecution6}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#mmNegotiatedTrade
	 * RedemptionExecution15.mmNegotiatedTrade}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNegotiatedTrade = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrder.mmNegotiatedTrade;
			componentContext_lazy = () -> RedemptionExecution6.mmObject();
			isDerived = false;
			xmlTag = "NgtdTrad";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NegotiatedTrade";
			definition = "Specifies whether the trade is negotiated.";
			nextVersions_lazy = () -> Arrays.asList(RedemptionExecution15.mmNegotiatedTrade);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> NegotiatedTrade1Code.mmObject();
		}
	};
	protected LateReport1Code lateReport;
	/**
	 * Specifies whether the order execution confirmation is late.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6
	 * RedemptionExecution6}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#mmLateReport
	 * RedemptionExecution15.mmLateReport}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLateReport = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrderExecution.mmLateReport;
			componentContext_lazy = () -> RedemptionExecution6.mmObject();
			isDerived = false;
			xmlTag = "LateRpt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateReport";
			definition = "Specifies whether the order execution confirmation is late.";
			nextVersions_lazy = () -> Arrays.asList(RedemptionExecution15.mmLateReport);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> LateReport1Code.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.Intermediary9> relatedPartyDetails;
	/**
	 * Information about parties related to the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Intermediary9
	 * Intermediary9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Trade#mmTradePartyRole
	 * Trade.mmTradePartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6
	 * RedemptionExecution6}</li>
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
	 * definition} = "Information about parties related to the transaction."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#mmRelatedPartyDetails
	 * RedemptionExecution15.mmRelatedPartyDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRelatedPartyDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Trade.mmTradePartyRole;
			componentContext_lazy = () -> RedemptionExecution6.mmObject();
			isDerived = false;
			xmlTag = "RltdPtyDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedPartyDetails";
			definition = "Information about parties related to the transaction.";
			nextVersions_lazy = () -> Arrays.asList(RedemptionExecution15.mmRelatedPartyDetails);
			maxOccurs = 10;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Intermediary9.mmObject();
		}
	};
	protected Equalisation1 equalisation;
	/**
	 * Part of an investor's subscription amount that is held by the fund in
	 * order to pay incentive / performance fees at the end of the fiscal year.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6
	 * RedemptionExecution6}</li>
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
	 * "Part of an investor's subscription amount that is held by the fund in order to pay incentive / performance fees at the end of the fiscal year."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#mmEqualisation
	 * RedemptionExecution15.mmEqualisation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmEqualisation = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> InvestmentFundClass.mmEqualisation;
			componentContext_lazy = () -> RedemptionExecution6.mmObject();
			isDerived = false;
			xmlTag = "Equlstn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Equalisation";
			definition = "Part of an investor's subscription amount that is held by the fund in order to pay incentive / performance fees at the end of the fiscal year.";
			nextVersions_lazy = () -> Arrays.asList(RedemptionExecution15.mmEqualisation);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Equalisation1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(RedemptionExecution6.mmOrderReference, RedemptionExecution6.mmClientReference, RedemptionExecution6.mmDealReference, RedemptionExecution6.mmOrderType,
						RedemptionExecution6.mmFinancialInstrumentDetails, RedemptionExecution6.mmSubAccountForHolding, RedemptionExecution6.mmUnitsNumber, RedemptionExecution6.mmRounding, RedemptionExecution6.mmNetAmount,
						RedemptionExecution6.mmHoldingsRedemptionRate, RedemptionExecution6.mmGrossAmount, RedemptionExecution6.mmTradeDateTime, RedemptionExecution6.mmSettlementAmount, RedemptionExecution6.mmCashSettlementDate,
						RedemptionExecution6.mmSettlementMethod, RedemptionExecution6.mmPartiallyExecutedIndicator, RedemptionExecution6.mmDealingPriceDetails, RedemptionExecution6.mmInformativePriceDetails,
						RedemptionExecution6.mmBestExecution, RedemptionExecution6.mmCumDividendIndicator, RedemptionExecution6.mmInterimProfitAmount, RedemptionExecution6.mmForeignExchangeDetails, RedemptionExecution6.mmIncomePreference,
						RedemptionExecution6.mmGroup1Or2Units, RedemptionExecution6.mmChargeGeneralDetails, RedemptionExecution6.mmStaffClientBreakdown, RedemptionExecution6.mmCommissionGeneralDetails,
						RedemptionExecution6.mmTaxGeneralDetails, RedemptionExecution6.mmSettlementAndCustodyDetails, RedemptionExecution6.mmPhysicalDeliveryIndicator, RedemptionExecution6.mmPhysicalDeliveryDetails,
						RedemptionExecution6.mmRequestedSettlementCurrency, RedemptionExecution6.mmRequestedNAVCurrency, RedemptionExecution6.mmCashSettlementDetails, RedemptionExecution6.mmNonStandardSettlementInformation,
						RedemptionExecution6.mmPartialSettlementOfUnits, RedemptionExecution6.mmPartialSettlementOfCash, RedemptionExecution6.mmPartialRedemptionWithholdingAmount, RedemptionExecution6.mmFinancialAdvice,
						RedemptionExecution6.mmNegotiatedTrade, RedemptionExecution6.mmLateReport, RedemptionExecution6.mmRelatedPartyDetails, RedemptionExecution6.mmEqualisation);
				trace_lazy = () -> RedemptionExecution.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RedemptionExecution6";
				definition = "Execution of a redemption order.";
				nextVersions_lazy = () -> Arrays.asList(RedemptionExecution15.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "OrdrRef", required = true)
	public Max35Text getOrderReference() {
		return orderReference;
	}

	public void setOrderReference(Max35Text orderReference) {
		this.orderReference = orderReference;
	}

	@XmlElement(name = "ClntRef")
	public Max35Text getClientReference() {
		return clientReference;
	}

	public void setClientReference(Max35Text clientReference) {
		this.clientReference = clientReference;
	}

	@XmlElement(name = "DealRef", required = true)
	public Max35Text getDealReference() {
		return dealReference;
	}

	public void setDealReference(Max35Text dealReference) {
		this.dealReference = dealReference;
	}

	@XmlElement(name = "OrdrTp")
	public List<FundOrderType3> getOrderType() {
		return orderType;
	}

	public void setOrderType(List<com.tools20022.repository.msg.FundOrderType3> orderType) {
		this.orderType = orderType;
	}

	@XmlElement(name = "FinInstrmDtls", required = true)
	public FinancialInstrument10 getFinancialInstrumentDetails() {
		return financialInstrumentDetails;
	}

	public void setFinancialInstrumentDetails(com.tools20022.repository.msg.FinancialInstrument10 financialInstrumentDetails) {
		this.financialInstrumentDetails = financialInstrumentDetails;
	}

	@XmlElement(name = "SubAcctForHldg")
	public SubAccount1 getSubAccountForHolding() {
		return subAccountForHolding;
	}

	public void setSubAccountForHolding(com.tools20022.repository.msg.SubAccount1 subAccountForHolding) {
		this.subAccountForHolding = subAccountForHolding;
	}

	@XmlElement(name = "UnitsNb", required = true)
	public FinancialInstrumentQuantity1 getUnitsNumber() {
		return unitsNumber;
	}

	public void setUnitsNumber(com.tools20022.repository.msg.FinancialInstrumentQuantity1 unitsNumber) {
		this.unitsNumber = unitsNumber;
	}

	@XmlElement(name = "Rndg")
	public RoundingDirection2Code getRounding() {
		return rounding;
	}

	public void setRounding(RoundingDirection2Code rounding) {
		this.rounding = rounding;
	}

	@XmlElement(name = "NetAmt")
	public ActiveCurrencyAndAmount getNetAmount() {
		return netAmount;
	}

	public void setNetAmount(ActiveCurrencyAndAmount netAmount) {
		this.netAmount = netAmount;
	}

	@XmlElement(name = "HldgsRedRate")
	public PercentageRate getHoldingsRedemptionRate() {
		return holdingsRedemptionRate;
	}

	public void setHoldingsRedemptionRate(PercentageRate holdingsRedemptionRate) {
		this.holdingsRedemptionRate = holdingsRedemptionRate;
	}

	@XmlElement(name = "GrssAmt")
	public ActiveCurrencyAndAmount getGrossAmount() {
		return grossAmount;
	}

	public void setGrossAmount(ActiveCurrencyAndAmount grossAmount) {
		this.grossAmount = grossAmount;
	}

	@XmlElement(name = "TradDtTm", required = true)
	public DateAndDateTimeChoice getTradeDateTime() {
		return tradeDateTime;
	}

	public void setTradeDateTime(DateAndDateTimeChoice tradeDateTime) {
		this.tradeDateTime = tradeDateTime;
	}

	@XmlElement(name = "SttlmAmt", required = true)
	public ActiveCurrencyAndAmount getSettlementAmount() {
		return settlementAmount;
	}

	public void setSettlementAmount(ActiveCurrencyAndAmount settlementAmount) {
		this.settlementAmount = settlementAmount;
	}

	@XmlElement(name = "CshSttlmDt")
	public ISODate getCashSettlementDate() {
		return cashSettlementDate;
	}

	public void setCashSettlementDate(ISODate cashSettlementDate) {
		this.cashSettlementDate = cashSettlementDate;
	}

	@XmlElement(name = "SttlmMtd")
	public DeliveryReceiptType2Code getSettlementMethod() {
		return settlementMethod;
	}

	public void setSettlementMethod(DeliveryReceiptType2Code settlementMethod) {
		this.settlementMethod = settlementMethod;
	}

	@XmlElement(name = "PrtlyExctdInd", required = true)
	public YesNoIndicator getPartiallyExecutedIndicator() {
		return partiallyExecutedIndicator;
	}

	public void setPartiallyExecutedIndicator(YesNoIndicator partiallyExecutedIndicator) {
		this.partiallyExecutedIndicator = partiallyExecutedIndicator;
	}

	@XmlElement(name = "DealgPricDtls", required = true)
	public UnitPrice10 getDealingPriceDetails() {
		return dealingPriceDetails;
	}

	public void setDealingPriceDetails(com.tools20022.repository.msg.UnitPrice10 dealingPriceDetails) {
		this.dealingPriceDetails = dealingPriceDetails;
	}

	@XmlElement(name = "InftvPricDtls")
	public List<UnitPrice10> getInformativePriceDetails() {
		return informativePriceDetails;
	}

	public void setInformativePriceDetails(List<com.tools20022.repository.msg.UnitPrice10> informativePriceDetails) {
		this.informativePriceDetails = informativePriceDetails;
	}

	@XmlElement(name = "BestExctn")
	public BestExecution1Code getBestExecution() {
		return bestExecution;
	}

	public void setBestExecution(BestExecution1Code bestExecution) {
		this.bestExecution = bestExecution;
	}

	@XmlElement(name = "CumDvddInd", required = true)
	public YesNoIndicator getCumDividendIndicator() {
		return cumDividendIndicator;
	}

	public void setCumDividendIndicator(YesNoIndicator cumDividendIndicator) {
		this.cumDividendIndicator = cumDividendIndicator;
	}

	@XmlElement(name = "IntrmPrftAmt")
	public ProfitAndLoss1Choice getInterimProfitAmount() {
		return interimProfitAmount;
	}

	public void setInterimProfitAmount(ProfitAndLoss1Choice interimProfitAmount) {
		this.interimProfitAmount = interimProfitAmount;
	}

	@XmlElement(name = "FXDtls")
	public List<ForeignExchangeTerms7> getForeignExchangeDetails() {
		return foreignExchangeDetails;
	}

	public void setForeignExchangeDetails(List<com.tools20022.repository.msg.ForeignExchangeTerms7> foreignExchangeDetails) {
		this.foreignExchangeDetails = foreignExchangeDetails;
	}

	@XmlElement(name = "IncmPref")
	public IncomePreference1Code getIncomePreference() {
		return incomePreference;
	}

	public void setIncomePreference(IncomePreference1Code incomePreference) {
		this.incomePreference = incomePreference;
	}

	@XmlElement(name = "Grp1Or2Units")
	public UKTaxGroupUnitCode getGroup1Or2Units() {
		return group1Or2Units;
	}

	public void setGroup1Or2Units(UKTaxGroupUnitCode group1Or2Units) {
		this.group1Or2Units = group1Or2Units;
	}

	@XmlElement(name = "ChrgGnlDtls")
	public TotalCharges3 getChargeGeneralDetails() {
		return chargeGeneralDetails;
	}

	public void setChargeGeneralDetails(com.tools20022.repository.msg.TotalCharges3 chargeGeneralDetails) {
		this.chargeGeneralDetails = chargeGeneralDetails;
	}

	@XmlElement(name = "StffClntBrkdwn")
	public List<InvestmentFundsOrderBreakdown1> getStaffClientBreakdown() {
		return staffClientBreakdown;
	}

	public void setStaffClientBreakdown(List<com.tools20022.repository.msg.InvestmentFundsOrderBreakdown1> staffClientBreakdown) {
		this.staffClientBreakdown = staffClientBreakdown;
	}

	@XmlElement(name = "ComssnGnlDtls")
	public TotalCommissions3 getCommissionGeneralDetails() {
		return commissionGeneralDetails;
	}

	public void setCommissionGeneralDetails(com.tools20022.repository.msg.TotalCommissions3 commissionGeneralDetails) {
		this.commissionGeneralDetails = commissionGeneralDetails;
	}

	@XmlElement(name = "TaxGnlDtls")
	public TotalTaxes3 getTaxGeneralDetails() {
		return taxGeneralDetails;
	}

	public void setTaxGeneralDetails(com.tools20022.repository.msg.TotalTaxes3 taxGeneralDetails) {
		this.taxGeneralDetails = taxGeneralDetails;
	}

	@XmlElement(name = "SttlmAndCtdyDtls")
	public FundSettlementParameters4 getSettlementAndCustodyDetails() {
		return settlementAndCustodyDetails;
	}

	public void setSettlementAndCustodyDetails(com.tools20022.repository.msg.FundSettlementParameters4 settlementAndCustodyDetails) {
		this.settlementAndCustodyDetails = settlementAndCustodyDetails;
	}

	@XmlElement(name = "PhysDlvryInd", required = true)
	public YesNoIndicator getPhysicalDeliveryIndicator() {
		return physicalDeliveryIndicator;
	}

	public void setPhysicalDeliveryIndicator(YesNoIndicator physicalDeliveryIndicator) {
		this.physicalDeliveryIndicator = physicalDeliveryIndicator;
	}

	@XmlElement(name = "PhysDlvryDtls")
	public DeliveryParameters3 getPhysicalDeliveryDetails() {
		return physicalDeliveryDetails;
	}

	public void setPhysicalDeliveryDetails(com.tools20022.repository.msg.DeliveryParameters3 physicalDeliveryDetails) {
		this.physicalDeliveryDetails = physicalDeliveryDetails;
	}

	@XmlElement(name = "ReqdSttlmCcy")
	public ActiveCurrencyCode getRequestedSettlementCurrency() {
		return requestedSettlementCurrency;
	}

	public void setRequestedSettlementCurrency(ActiveCurrencyCode requestedSettlementCurrency) {
		this.requestedSettlementCurrency = requestedSettlementCurrency;
	}

	@XmlElement(name = "ReqdNAVCcy")
	public ActiveOrHistoricCurrencyCode getRequestedNAVCurrency() {
		return requestedNAVCurrency;
	}

	public void setRequestedNAVCurrency(ActiveOrHistoricCurrencyCode requestedNAVCurrency) {
		this.requestedNAVCurrency = requestedNAVCurrency;
	}

	@XmlElement(name = "CshSttlmDtls")
	public PaymentTransaction22 getCashSettlementDetails() {
		return cashSettlementDetails;
	}

	public void setCashSettlementDetails(com.tools20022.repository.msg.PaymentTransaction22 cashSettlementDetails) {
		this.cashSettlementDetails = cashSettlementDetails;
	}

	@XmlElement(name = "NonStdSttlmInf")
	public Max350Text getNonStandardSettlementInformation() {
		return nonStandardSettlementInformation;
	}

	public void setNonStandardSettlementInformation(Max350Text nonStandardSettlementInformation) {
		this.nonStandardSettlementInformation = nonStandardSettlementInformation;
	}

	@XmlElement(name = "PrtlSttlmOfUnits")
	public PercentageRate getPartialSettlementOfUnits() {
		return partialSettlementOfUnits;
	}

	public void setPartialSettlementOfUnits(PercentageRate partialSettlementOfUnits) {
		this.partialSettlementOfUnits = partialSettlementOfUnits;
	}

	@XmlElement(name = "PrtlSttlmOfCsh")
	public PercentageRate getPartialSettlementOfCash() {
		return partialSettlementOfCash;
	}

	public void setPartialSettlementOfCash(PercentageRate partialSettlementOfCash) {
		this.partialSettlementOfCash = partialSettlementOfCash;
	}

	@XmlElement(name = "PrtlRedWhldgAmt")
	public CurrencyAndAmount getPartialRedemptionWithholdingAmount() {
		return partialRedemptionWithholdingAmount;
	}

	public void setPartialRedemptionWithholdingAmount(CurrencyAndAmount partialRedemptionWithholdingAmount) {
		this.partialRedemptionWithholdingAmount = partialRedemptionWithholdingAmount;
	}

	@XmlElement(name = "FinAdvc")
	public FinancialAdvice1Code getFinancialAdvice() {
		return financialAdvice;
	}

	public void setFinancialAdvice(FinancialAdvice1Code financialAdvice) {
		this.financialAdvice = financialAdvice;
	}

	@XmlElement(name = "NgtdTrad")
	public NegotiatedTrade1Code getNegotiatedTrade() {
		return negotiatedTrade;
	}

	public void setNegotiatedTrade(NegotiatedTrade1Code negotiatedTrade) {
		this.negotiatedTrade = negotiatedTrade;
	}

	@XmlElement(name = "LateRpt")
	public LateReport1Code getLateReport() {
		return lateReport;
	}

	public void setLateReport(LateReport1Code lateReport) {
		this.lateReport = lateReport;
	}

	@XmlElement(name = "RltdPtyDtls")
	public List<Intermediary9> getRelatedPartyDetails() {
		return relatedPartyDetails;
	}

	public void setRelatedPartyDetails(List<com.tools20022.repository.msg.Intermediary9> relatedPartyDetails) {
		this.relatedPartyDetails = relatedPartyDetails;
	}

	@XmlElement(name = "Equlstn")
	public Equalisation1 getEqualisation() {
		return equalisation;
	}

	public void setEqualisation(com.tools20022.repository.msg.Equalisation1 equalisation) {
		this.equalisation = equalisation;
	}
}