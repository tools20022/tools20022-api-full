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
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Instruction from an investor to sell investment fund units back to the fund.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionOrder14#mmOrderReference
 * RedemptionOrder14.mmOrderReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionOrder14#mmClientReference
 * RedemptionOrder14.mmClientReference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RedemptionOrder14#mmOrderType
 * RedemptionOrder14.mmOrderType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionOrder14#mmFinancialInstrumentDetails
 * RedemptionOrder14.mmFinancialInstrumentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionOrder14#mmSubAccountForHolding
 * RedemptionOrder14.mmSubAccountForHolding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionOrder14#mmAmountOrUnitsOrPercentage
 * RedemptionOrder14.mmAmountOrUnitsOrPercentage}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RedemptionOrder14#mmRounding
 * RedemptionOrder14.mmRounding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionOrder14#mmSettlementAmount
 * RedemptionOrder14.mmSettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionOrder14#mmCashSettlementDate
 * RedemptionOrder14.mmCashSettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionOrder14#mmSettlementMethod
 * RedemptionOrder14.mmSettlementMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionOrder14#mmForeignExchangeDetails
 * RedemptionOrder14.mmForeignExchangeDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionOrder14#mmIncomePreference
 * RedemptionOrder14.mmIncomePreference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionOrder14#mmGroup1Or2Units
 * RedemptionOrder14.mmGroup1Or2Units}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionOrder14#mmTransactionOverhead
 * RedemptionOrder14.mmTransactionOverhead}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionOrder14#mmSettlementAndCustodyDetails
 * RedemptionOrder14.mmSettlementAndCustodyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionOrder14#mmPhysicalDeliveryIndicator
 * RedemptionOrder14.mmPhysicalDeliveryIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionOrder14#mmPhysicalDeliveryDetails
 * RedemptionOrder14.mmPhysicalDeliveryDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionOrder14#mmRequestedSettlementCurrency
 * RedemptionOrder14.mmRequestedSettlementCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionOrder14#mmRequestedNAVCurrency
 * RedemptionOrder14.mmRequestedNAVCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionOrder14#mmCashSettlementDetails
 * RedemptionOrder14.mmCashSettlementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionOrder14#mmNonStandardSettlementInformation
 * RedemptionOrder14.mmNonStandardSettlementInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionOrder14#mmStaffClientBreakdown
 * RedemptionOrder14.mmStaffClientBreakdown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionOrder14#mmFinancialAdvice
 * RedemptionOrder14.mmFinancialAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionOrder14#mmNegotiatedTrade
 * RedemptionOrder14.mmNegotiatedTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionOrder14#mmRelatedPartyDetails
 * RedemptionOrder14.mmRelatedPartyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionOrder14#mmEqualisation
 * RedemptionOrder14.mmEqualisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionOrder14#mmCustomerConductClassification
 * RedemptionOrder14.mmCustomerConductClassification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionOrder14#mmTransactionChannelType
 * RedemptionOrder14.mmTransactionChannelType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionOrder14#mmSignatureType
 * RedemptionOrder14.mmSignatureType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionOrder14#mmOrderWaiverDetails
 * RedemptionOrder14.mmOrderWaiverDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.RedemptionOrder
 * RedemptionOrder}</li>
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
 * "RedemptionOrder14"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Instruction from an investor to sell investment fund units back to the fund."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.RedemptionOrder8 RedemptionOrder8}</li>
 * </ul>
 */
public class RedemptionOrder14 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text orderReference;
	/**
	 * Unique and unambiguous identifier for the order, as assigned by the
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
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder14
	 * RedemptionOrder14}</li>
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
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder8#mmOrderReference
	 * RedemptionOrder8.mmOrderReference}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOrderReference = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmIdentification;
			componentContext_lazy = () -> RedemptionOrder14.mmObject();
			isDerived = false;
			xmlTag = "OrdrRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderReference";
			definition = "Unique and unambiguous identifier for the order, as assigned by the instructing party.";
			previousVersion_lazy = () -> RedemptionOrder8.mmOrderReference;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text clientReference;
	/**
	 * Unique and unambiguous investor's identification of the order. This
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
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder14
	 * RedemptionOrder14}</li>
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
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder8#mmClientReference
	 * RedemptionOrder8.mmClientReference}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmClientReference = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundTransaction.mmClientReference;
			componentContext_lazy = () -> RedemptionOrder14.mmObject();
			isDerived = false;
			xmlTag = "ClntRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClientReference";
			definition = "Unique and unambiguous investor's identification of the order. This reference can typically be used in a hub scenario to give the reference of the order as assigned by the underlying client.";
			previousVersion_lazy = () -> RedemptionOrder8.mmClientReference;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected List<FundOrderType4Choice> orderType;
	/**
	 * Category of the investment fund order.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder14
	 * RedemptionOrder14}</li>
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
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder8#mmOrderType
	 * RedemptionOrder8.mmOrderType}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOrderType = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrder.mmOrderType;
			componentContext_lazy = () -> RedemptionOrder14.mmObject();
			isDerived = false;
			xmlTag = "OrdrTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderType";
			definition = "Category of the investment fund order.";
			previousVersion_lazy = () -> RedemptionOrder8.mmOrderType;
			maxOccurs = 10;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FundOrderType4Choice.mmObject();
		}
	};
	protected FinancialInstrument57 financialInstrumentDetails;
	/**
	 * Investment fund class related to the order.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder14
	 * RedemptionOrder14}</li>
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
	 * definition} = "Investment fund class related to the order."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder8#mmFinancialInstrumentDetails
	 * RedemptionOrder8.mmFinancialInstrumentDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFinancialInstrumentDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> InvestmentFundTransaction.mmInvestmentFundClass;
			componentContext_lazy = () -> RedemptionOrder14.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentDetails";
			definition = "Investment fund class related to the order.";
			previousVersion_lazy = () -> RedemptionOrder8.mmFinancialInstrumentDetails;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.FinancialInstrument57.mmObject();
		}
	};
	protected SubAccount6 subAccountForHolding;
	/**
	 * Subdivision of the account used to segregate specific holdings.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder14
	 * RedemptionOrder14}</li>
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
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder8#mmSubAccountForHolding
	 * RedemptionOrder8.mmSubAccountForHolding}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSubAccountForHolding = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Account.mmSubAccount;
			componentContext_lazy = () -> RedemptionOrder14.mmObject();
			isDerived = false;
			xmlTag = "SubAcctForHldg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubAccountForHolding";
			definition = "Subdivision of the account used to segregate specific holdings.";
			previousVersion_lazy = () -> RedemptionOrder8.mmSubAccountForHolding;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SubAccount6.mmObject();
		}
	};
	protected FinancialInstrumentQuantity28Choice amountOrUnitsOrPercentage;
	/**
	 * Amount of money or the number of units or percentage to be redeemed for
	 * the redemption order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity28Choice
	 * FinancialInstrumentQuantity28Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmOrderedQuantity
	 * SecuritiesOrder.mmOrderedQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder14
	 * RedemptionOrder14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AmtOrUnitsOrPctg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmountOrUnitsOrPercentage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money or the number of units or percentage to be redeemed for the redemption order."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAmountOrUnitsOrPercentage = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmOrderedQuantity;
			componentContext_lazy = () -> RedemptionOrder14.mmObject();
			isDerived = false;
			xmlTag = "AmtOrUnitsOrPctg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmountOrUnitsOrPercentage";
			definition = "Amount of money or the number of units or percentage to be redeemed for the redemption order.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity28Choice.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder14
	 * RedemptionOrder14}</li>
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
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder8#mmRounding
	 * RedemptionOrder8.mmRounding}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRounding = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> RoundingParameters.mmRoundingDirection;
			componentContext_lazy = () -> RedemptionOrder14.mmObject();
			isDerived = false;
			xmlTag = "Rndg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rounding";
			definition = "Indicates the rounding direction applied to nearest unit.";
			previousVersion_lazy = () -> RedemptionOrder8.mmRounding;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RoundingDirection2Code.mmObject();
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSettlementAmount
	 * SecuritiesSettlement.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder14
	 * RedemptionOrder14}</li>
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
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder8#mmSettlementAmount
	 * RedemptionOrder8.mmSettlementAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSettlementAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmSettlementAmount;
			componentContext_lazy = () -> RedemptionOrder14.mmObject();
			isDerived = false;
			xmlTag = "SttlmAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementAmount";
			definition = "Total amount of money paid /to be paid or received in exchange for the financial instrument in the individual order.";
			previousVersion_lazy = () -> RedemptionOrder8.mmSettlementAmount;
			maxOccurs = 1;
			minOccurs = 0;
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
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder14
	 * RedemptionOrder14}</li>
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
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder8#mmCashSettlementDate
	 * RedemptionOrder8.mmCashSettlementDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCashSettlementDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Payment.mmValueDate;
			componentContext_lazy = () -> RedemptionOrder14.mmObject();
			isDerived = false;
			xmlTag = "CshSttlmDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashSettlementDate";
			definition = "Date on which cash is available.";
			previousVersion_lazy = () -> RedemptionOrder8.mmCashSettlementDate;
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
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder14
	 * RedemptionOrder14}</li>
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
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder8#mmSettlementMethod
	 * RedemptionOrder8.mmSettlementMethod}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSettlementMethod = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmSettlementType;
			componentContext_lazy = () -> RedemptionOrder14.mmObject();
			isDerived = false;
			xmlTag = "SttlmMtd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementMethod";
			definition = "Method by which the transaction is settled.";
			previousVersion_lazy = () -> RedemptionOrder8.mmSettlementMethod;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DeliveryReceiptType2Code.mmObject();
		}
	};
	protected ForeignExchangeTerms32 foreignExchangeDetails;
	/**
	 * Information needed to process a currency exchange or conversion.<br>
	 * How the exchange rate is expressed determines which currency is the Unit
	 * Currency and Quoted Currency. If the amounts concerned are EUR 1000 and
	 * USD 1300, the exchange rate may be expressed as per either of the
	 * following examples:<br>
	 * EXAMPLE 1 <br>
	 * UnitCurrency EUR<br>
	 * QuotedCurrency USD<br>
	 * ExchangeRate 1.300<br>
	 * EXAMPLE 2<br>
	 * UnitCurrency USD<br>
	 * QuotedCurrency EUR<br>
	 * ExchangeRate 0.769
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms32
	 * ForeignExchangeTerms32}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade#mmAgreedRate
	 * ForeignExchangeTrade.mmAgreedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder14
	 * RedemptionOrder14}</li>
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
	 * "Information needed to process a currency exchange or conversion.\r\nHow the exchange rate is expressed determines which currency is the Unit Currency and Quoted Currency. If the amounts concerned are EUR 1000 and USD 1300, the exchange rate may be expressed as per either of the following examples:\r\nEXAMPLE 1 \r\nUnitCurrency  EUR\r\nQuotedCurrency  USD\r\nExchangeRate  1.300\r\nEXAMPLE 2\r\nUnitCurrency  USD\r\nQuotedCurrency  EUR\r\nExchangeRate  0.769"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder8#mmForeignExchangeDetails
	 * RedemptionOrder8.mmForeignExchangeDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmForeignExchangeDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> ForeignExchangeTrade.mmAgreedRate;
			componentContext_lazy = () -> RedemptionOrder14.mmObject();
			isDerived = false;
			xmlTag = "FXDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignExchangeDetails";
			definition = "Information needed to process a currency exchange or conversion.\r\nHow the exchange rate is expressed determines which currency is the Unit Currency and Quoted Currency. If the amounts concerned are EUR 1000 and USD 1300, the exchange rate may be expressed as per either of the following examples:\r\nEXAMPLE 1 \r\nUnitCurrency  EUR\r\nQuotedCurrency  USD\r\nExchangeRate  1.300\r\nEXAMPLE 2\r\nUnitCurrency  USD\r\nQuotedCurrency  EUR\r\nExchangeRate  0.769";
			previousVersion_lazy = () -> RedemptionOrder8.mmForeignExchangeDetails;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ForeignExchangeTerms32.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder14
	 * RedemptionOrder14}</li>
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
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder8#mmIncomePreference
	 * RedemptionOrder8.mmIncomePreference}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIncomePreference = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentAccountService.mmIncomePreference;
			componentContext_lazy = () -> RedemptionOrder14.mmObject();
			isDerived = false;
			xmlTag = "IncmPref";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncomePreference";
			definition = "Dividend option chosen by the account owner based on the options offered in the prospectus.";
			previousVersion_lazy = () -> RedemptionOrder8.mmIncomePreference;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> IncomePreference1Code.mmObject();
		}
	};
	protected UKTaxGroupUnit1Code group1Or2Units;
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
	 * {@linkplain com.tools20022.repository.codeset.UKTaxGroupUnit1Code
	 * UKTaxGroupUnit1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmGroup1Or2Units
	 * SecuritiesQuantity.mmGroup1Or2Units}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder14
	 * RedemptionOrder14}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder8#mmGroup1Or2Units
	 * RedemptionOrder8.mmGroup1Or2Units}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmGroup1Or2Units = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesQuantity.mmGroup1Or2Units;
			componentContext_lazy = () -> RedemptionOrder14.mmObject();
			isDerived = false;
			xmlTag = "Grp1Or2Units";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Group1Or2Units";
			definition = "Tax group to which the purchased investment fund units belong. The investor indicates to the intermediary operating pooled nominees, which type of unit is to be sold.";
			previousVersion_lazy = () -> RedemptionOrder8.mmGroup1Or2Units;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> UKTaxGroupUnit1Code.mmObject();
		}
	};
	protected FeeAndTax1 transactionOverhead;
	/**
	 * Fees (charges/commission) and tax to be applied to the gross amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.FeeAndTax1 FeeAndTax1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTax
	 * InvestmentFundTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder14
	 * RedemptionOrder14}</li>
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
	 * "Fees (charges/commission) and tax to be applied to the gross amount."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTransactionOverhead = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> InvestmentFundTax.mmObject();
			componentContext_lazy = () -> RedemptionOrder14.mmObject();
			isDerived = false;
			xmlTag = "TxOvrhd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionOverhead";
			definition = "Fees (charges/commission) and tax to be applied to the gross amount.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.FeeAndTax1.mmObject();
		}
	};
	protected FundSettlementParameters12 settlementAndCustodyDetails;
	/**
	 * Parameters used to execute the settlement of an investment fund order.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder14
	 * RedemptionOrder14}</li>
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
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder8#mmSettlementAndCustodyDetails
	 * RedemptionOrder8.mmSettlementAndCustodyDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSettlementAndCustodyDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeExecution.mmSecuritiesSettlement;
			componentContext_lazy = () -> RedemptionOrder14.mmObject();
			isDerived = false;
			xmlTag = "SttlmAndCtdyDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementAndCustodyDetails";
			definition = "Parameters used to execute the settlement of an investment fund order.";
			previousVersion_lazy = () -> RedemptionOrder8.mmSettlementAndCustodyDetails;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.FundSettlementParameters12.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder14
	 * RedemptionOrder14}</li>
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
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder8#mmPhysicalDeliveryIndicator
	 * RedemptionOrder8.mmPhysicalDeliveryIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPhysicalDeliveryIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> RedemptionOrder14.mmObject();
			isDerived = false;
			xmlTag = "PhysDlvryInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalDeliveryIndicator";
			definition = "Indicates whether the financial instrument is to be physically delivered.";
			previousVersion_lazy = () -> RedemptionOrder8.mmPhysicalDeliveryIndicator;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected DeliveryParameters3 physicalDeliveryDetails;
	/**
	 * Information related to the physical delivery of the securities.
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
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder14
	 * RedemptionOrder14}</li>
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
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder8#mmPhysicalDeliveryDetails
	 * RedemptionOrder8.mmPhysicalDeliveryDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPhysicalDeliveryDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesTransfer.mmPhysicalDelivery;
			componentContext_lazy = () -> RedemptionOrder14.mmObject();
			isDerived = false;
			xmlTag = "PhysDlvryDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalDeliveryDetails";
			definition = "Information related to the physical delivery of the securities.";
			previousVersion_lazy = () -> RedemptionOrder8.mmPhysicalDeliveryDetails;
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
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder14
	 * RedemptionOrder14}</li>
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
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder8#mmRequestedSettlementCurrency
	 * RedemptionOrder8.mmRequestedSettlementCurrency}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRequestedSettlementCurrency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrder.mmRequestedSettlementCurrency;
			componentContext_lazy = () -> RedemptionOrder14.mmObject();
			isDerived = false;
			xmlTag = "ReqdSttlmCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedSettlementCurrency";
			definition = "Currency requested for settlement of cash proceeds.";
			previousVersion_lazy = () -> RedemptionOrder8.mmRequestedSettlementCurrency;
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
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder14
	 * RedemptionOrder14}</li>
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
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder8#mmRequestedNAVCurrency
	 * RedemptionOrder8.mmRequestedNAVCurrency}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRequestedNAVCurrency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundClass.mmRequestedNAVCurrency;
			componentContext_lazy = () -> RedemptionOrder14.mmObject();
			isDerived = false;
			xmlTag = "ReqdNAVCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedNAVCurrency";
			definition = "Currency to be used for pricing the fund. This currency must be among the set of currencies in which the price may be expressed, as stated in the prospectus.";
			previousVersion_lazy = () -> RedemptionOrder8.mmRequestedNAVCurrency;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyCode.mmObject();
		}
	};
	protected PaymentTransaction72 cashSettlementDetails;
	/**
	 * Payment process for the transfer of cash from the debtor to the creditor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PaymentTransaction72
	 * PaymentTransaction72}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmPaymentOffset
	 * PaymentObligation.mmPaymentOffset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder14
	 * RedemptionOrder14}</li>
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
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder8#mmCashSettlementDetails
	 * RedemptionOrder8.mmCashSettlementDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCashSettlementDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> PaymentObligation.mmPaymentOffset;
			componentContext_lazy = () -> RedemptionOrder14.mmObject();
			isDerived = false;
			xmlTag = "CshSttlmDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashSettlementDetails";
			definition = "Payment process for the transfer of cash from the debtor to the creditor.";
			previousVersion_lazy = () -> RedemptionOrder8.mmCashSettlementDetails;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PaymentTransaction72.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder14
	 * RedemptionOrder14}</li>
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
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder8#mmNonStandardSettlementInformation
	 * RedemptionOrder8.mmNonStandardSettlementInformation}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNonStandardSettlementInformation = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrderExecution.mmNonStandardSettlementInformation;
			componentContext_lazy = () -> RedemptionOrder14.mmObject();
			isDerived = false;
			xmlTag = "NonStdSttlmInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonStandardSettlementInformation";
			definition = "Additional specific settlement information for non-regulated traded funds.";
			previousVersion_lazy = () -> RedemptionOrder8.mmNonStandardSettlementInformation;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.InvestmentFundsOrderBreakdown2> staffClientBreakdown;
	/**
	 * Breakdown of the net amount per type of order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundsOrderBreakdown2
	 * InvestmentFundsOrderBreakdown2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.RedemptionOrder
	 * RedemptionOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder14
	 * RedemptionOrder14}</li>
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
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder8#mmStaffClientBreakdown
	 * RedemptionOrder8.mmStaffClientBreakdown}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmStaffClientBreakdown = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> RedemptionOrder.mmObject();
			componentContext_lazy = () -> RedemptionOrder14.mmObject();
			isDerived = false;
			xmlTag = "StffClntBrkdwn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StaffClientBreakdown";
			definition = "Breakdown of the net amount per type of order.";
			previousVersion_lazy = () -> RedemptionOrder8.mmStaffClientBreakdown;
			maxOccurs = 4;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.InvestmentFundsOrderBreakdown2.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder14
	 * RedemptionOrder14}</li>
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
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder8#mmFinancialAdvice
	 * RedemptionOrder8.mmFinancialAdvice}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFinancialAdvice = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrder.mmFinancialAdvice;
			componentContext_lazy = () -> RedemptionOrder14.mmObject();
			isDerived = false;
			xmlTag = "FinAdvc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialAdvice";
			definition = "Specifies if advice has been received from an independent financial advisor.";
			previousVersion_lazy = () -> RedemptionOrder8.mmFinancialAdvice;
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
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder14
	 * RedemptionOrder14}</li>
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
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder8#mmNegotiatedTrade
	 * RedemptionOrder8.mmNegotiatedTrade}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNegotiatedTrade = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrder.mmNegotiatedTrade;
			componentContext_lazy = () -> RedemptionOrder14.mmObject();
			isDerived = false;
			xmlTag = "NgtdTrad";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NegotiatedTrade";
			definition = "Specifies whether the trade is negotiated.";
			previousVersion_lazy = () -> RedemptionOrder8.mmNegotiatedTrade;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> NegotiatedTrade1Code.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.Intermediary40> relatedPartyDetails;
	/**
	 * Party related to the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Intermediary40
	 * Intermediary40}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Trade#mmTradePartyRole
	 * Trade.mmTradePartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder14
	 * RedemptionOrder14}</li>
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
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder8#mmRelatedPartyDetails
	 * RedemptionOrder8.mmRelatedPartyDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRelatedPartyDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Trade.mmTradePartyRole;
			componentContext_lazy = () -> RedemptionOrder14.mmObject();
			isDerived = false;
			xmlTag = "RltdPtyDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedPartyDetails";
			definition = "Party related to the transaction.";
			previousVersion_lazy = () -> RedemptionOrder8.mmRelatedPartyDetails;
			maxOccurs = 10;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Intermediary40.mmObject();
		}
	};
	protected Equalisation1 equalisation;
	/**
	 * Part of an investor's retained subscription amount that is returned by
	 * the fund in order to reimburse preliminary incentive/performance fees.
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
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder14
	 * RedemptionOrder14}</li>
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
	 * "Part of an investor's retained subscription amount that is returned by the fund in order to reimburse preliminary incentive/performance fees."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder8#mmEqualisation
	 * RedemptionOrder8.mmEqualisation}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmEqualisation = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> InvestmentFundClass.mmEqualisation;
			componentContext_lazy = () -> RedemptionOrder14.mmObject();
			isDerived = false;
			xmlTag = "Equlstn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Equalisation";
			definition = "Part of an investor's retained subscription amount that is returned by the fund in order to reimburse preliminary incentive/performance fees.";
			previousVersion_lazy = () -> RedemptionOrder8.mmEqualisation;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Equalisation1.mmObject();
		}
	};
	protected CustomerConductClassification1Choice customerConductClassification;
	/**
	 * Assessment of the customer’s behaviour at the time of the account opening
	 * application.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder14
	 * RedemptionOrder14}</li>
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
	public static final MMMessageAttribute mmCustomerConductClassification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> RedemptionOrder14.mmObject();
			isDerived = false;
			xmlTag = "CstmrCndctClssfctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustomerConductClassification";
			definition = "Assessment of the customer’s behaviour at the time of the account opening application.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CustomerConductClassification1Choice.mmObject();
		}
	};
	protected TransactionChannelType1Choice transactionChannelType;
	/**
	 * Means by which the investor or account owner submits the open account
	 * form.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder14
	 * RedemptionOrder14}</li>
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
	 * "Means by which the investor or account owner submits the open account form. "
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTransactionChannelType = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> AccountContract.mmTransactionChannel;
			componentContext_lazy = () -> RedemptionOrder14.mmObject();
			isDerived = false;
			xmlTag = "TxChanlTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionChannelType";
			definition = "Means by which the investor or account owner submits the open account form. ";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TransactionChannelType1Choice.mmObject();
		}
	};
	protected SignatureType1Choice signatureType;
	/**
	 * Type of signature.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder14
	 * RedemptionOrder14}</li>
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
	public static final MMMessageAttribute mmSignatureType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmSignatureRequired;
			componentContext_lazy = () -> RedemptionOrder14.mmObject();
			isDerived = false;
			xmlTag = "SgntrTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SignatureType";
			definition = "Type of signature.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SignatureType1Choice.mmObject();
		}
	};
	protected OrderWaiver1 orderWaiverDetails;
	/**
	 * Information about a non-standard order.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder14
	 * RedemptionOrder14}</li>
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
	public static final MMMessageAssociationEnd mmOrderWaiverDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrder.mmOrderWaiverReason;
			componentContext_lazy = () -> RedemptionOrder14.mmObject();
			isDerived = false;
			xmlTag = "OrdrWvrDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderWaiverDetails";
			definition = "Information about a non-standard order.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.OrderWaiver1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(RedemptionOrder14.mmOrderReference, RedemptionOrder14.mmClientReference, RedemptionOrder14.mmOrderType, RedemptionOrder14.mmFinancialInstrumentDetails,
						RedemptionOrder14.mmSubAccountForHolding, RedemptionOrder14.mmAmountOrUnitsOrPercentage, RedemptionOrder14.mmRounding, RedemptionOrder14.mmSettlementAmount, RedemptionOrder14.mmCashSettlementDate,
						RedemptionOrder14.mmSettlementMethod, RedemptionOrder14.mmForeignExchangeDetails, RedemptionOrder14.mmIncomePreference, RedemptionOrder14.mmGroup1Or2Units, RedemptionOrder14.mmTransactionOverhead,
						RedemptionOrder14.mmSettlementAndCustodyDetails, RedemptionOrder14.mmPhysicalDeliveryIndicator, RedemptionOrder14.mmPhysicalDeliveryDetails, RedemptionOrder14.mmRequestedSettlementCurrency,
						RedemptionOrder14.mmRequestedNAVCurrency, RedemptionOrder14.mmCashSettlementDetails, RedemptionOrder14.mmNonStandardSettlementInformation, RedemptionOrder14.mmStaffClientBreakdown,
						RedemptionOrder14.mmFinancialAdvice, RedemptionOrder14.mmNegotiatedTrade, RedemptionOrder14.mmRelatedPartyDetails, RedemptionOrder14.mmEqualisation, RedemptionOrder14.mmCustomerConductClassification,
						RedemptionOrder14.mmTransactionChannelType, RedemptionOrder14.mmSignatureType, RedemptionOrder14.mmOrderWaiverDetails);
				trace_lazy = () -> RedemptionOrder.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RedemptionOrder14";
				definition = "Instruction from an investor to sell investment fund units back to the fund.";
				previousVersion_lazy = () -> RedemptionOrder8.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getOrderReference() {
		return orderReference;
	}

	public void setOrderReference(Max35Text orderReference) {
		this.orderReference = orderReference;
	}

	public Max35Text getClientReference() {
		return clientReference;
	}

	public void setClientReference(Max35Text clientReference) {
		this.clientReference = clientReference;
	}

	public List<FundOrderType4Choice> getOrderType() {
		return orderType;
	}

	public void setOrderType(List<FundOrderType4Choice> orderType) {
		this.orderType = orderType;
	}

	public FinancialInstrument57 getFinancialInstrumentDetails() {
		return financialInstrumentDetails;
	}

	public void setFinancialInstrumentDetails(com.tools20022.repository.msg.FinancialInstrument57 financialInstrumentDetails) {
		this.financialInstrumentDetails = financialInstrumentDetails;
	}

	public SubAccount6 getSubAccountForHolding() {
		return subAccountForHolding;
	}

	public void setSubAccountForHolding(com.tools20022.repository.msg.SubAccount6 subAccountForHolding) {
		this.subAccountForHolding = subAccountForHolding;
	}

	public FinancialInstrumentQuantity28Choice getAmountOrUnitsOrPercentage() {
		return amountOrUnitsOrPercentage;
	}

	public void setAmountOrUnitsOrPercentage(FinancialInstrumentQuantity28Choice amountOrUnitsOrPercentage) {
		this.amountOrUnitsOrPercentage = amountOrUnitsOrPercentage;
	}

	public RoundingDirection2Code getRounding() {
		return rounding;
	}

	public void setRounding(RoundingDirection2Code rounding) {
		this.rounding = rounding;
	}

	public ActiveCurrencyAndAmount getSettlementAmount() {
		return settlementAmount;
	}

	public void setSettlementAmount(ActiveCurrencyAndAmount settlementAmount) {
		this.settlementAmount = settlementAmount;
	}

	public ISODate getCashSettlementDate() {
		return cashSettlementDate;
	}

	public void setCashSettlementDate(ISODate cashSettlementDate) {
		this.cashSettlementDate = cashSettlementDate;
	}

	public DeliveryReceiptType2Code getSettlementMethod() {
		return settlementMethod;
	}

	public void setSettlementMethod(DeliveryReceiptType2Code settlementMethod) {
		this.settlementMethod = settlementMethod;
	}

	public ForeignExchangeTerms32 getForeignExchangeDetails() {
		return foreignExchangeDetails;
	}

	public void setForeignExchangeDetails(com.tools20022.repository.msg.ForeignExchangeTerms32 foreignExchangeDetails) {
		this.foreignExchangeDetails = foreignExchangeDetails;
	}

	public IncomePreference1Code getIncomePreference() {
		return incomePreference;
	}

	public void setIncomePreference(IncomePreference1Code incomePreference) {
		this.incomePreference = incomePreference;
	}

	public UKTaxGroupUnit1Code getGroup1Or2Units() {
		return group1Or2Units;
	}

	public void setGroup1Or2Units(UKTaxGroupUnit1Code group1Or2Units) {
		this.group1Or2Units = group1Or2Units;
	}

	public FeeAndTax1 getTransactionOverhead() {
		return transactionOverhead;
	}

	public void setTransactionOverhead(com.tools20022.repository.msg.FeeAndTax1 transactionOverhead) {
		this.transactionOverhead = transactionOverhead;
	}

	public FundSettlementParameters12 getSettlementAndCustodyDetails() {
		return settlementAndCustodyDetails;
	}

	public void setSettlementAndCustodyDetails(com.tools20022.repository.msg.FundSettlementParameters12 settlementAndCustodyDetails) {
		this.settlementAndCustodyDetails = settlementAndCustodyDetails;
	}

	public YesNoIndicator getPhysicalDeliveryIndicator() {
		return physicalDeliveryIndicator;
	}

	public void setPhysicalDeliveryIndicator(YesNoIndicator physicalDeliveryIndicator) {
		this.physicalDeliveryIndicator = physicalDeliveryIndicator;
	}

	public DeliveryParameters3 getPhysicalDeliveryDetails() {
		return physicalDeliveryDetails;
	}

	public void setPhysicalDeliveryDetails(com.tools20022.repository.msg.DeliveryParameters3 physicalDeliveryDetails) {
		this.physicalDeliveryDetails = physicalDeliveryDetails;
	}

	public ActiveCurrencyCode getRequestedSettlementCurrency() {
		return requestedSettlementCurrency;
	}

	public void setRequestedSettlementCurrency(ActiveCurrencyCode requestedSettlementCurrency) {
		this.requestedSettlementCurrency = requestedSettlementCurrency;
	}

	public ActiveOrHistoricCurrencyCode getRequestedNAVCurrency() {
		return requestedNAVCurrency;
	}

	public void setRequestedNAVCurrency(ActiveOrHistoricCurrencyCode requestedNAVCurrency) {
		this.requestedNAVCurrency = requestedNAVCurrency;
	}

	public PaymentTransaction72 getCashSettlementDetails() {
		return cashSettlementDetails;
	}

	public void setCashSettlementDetails(com.tools20022.repository.msg.PaymentTransaction72 cashSettlementDetails) {
		this.cashSettlementDetails = cashSettlementDetails;
	}

	public Max350Text getNonStandardSettlementInformation() {
		return nonStandardSettlementInformation;
	}

	public void setNonStandardSettlementInformation(Max350Text nonStandardSettlementInformation) {
		this.nonStandardSettlementInformation = nonStandardSettlementInformation;
	}

	public List<InvestmentFundsOrderBreakdown2> getStaffClientBreakdown() {
		return staffClientBreakdown;
	}

	public void setStaffClientBreakdown(List<com.tools20022.repository.msg.InvestmentFundsOrderBreakdown2> staffClientBreakdown) {
		this.staffClientBreakdown = staffClientBreakdown;
	}

	public FinancialAdvice1Code getFinancialAdvice() {
		return financialAdvice;
	}

	public void setFinancialAdvice(FinancialAdvice1Code financialAdvice) {
		this.financialAdvice = financialAdvice;
	}

	public NegotiatedTrade1Code getNegotiatedTrade() {
		return negotiatedTrade;
	}

	public void setNegotiatedTrade(NegotiatedTrade1Code negotiatedTrade) {
		this.negotiatedTrade = negotiatedTrade;
	}

	public List<Intermediary40> getRelatedPartyDetails() {
		return relatedPartyDetails;
	}

	public void setRelatedPartyDetails(List<com.tools20022.repository.msg.Intermediary40> relatedPartyDetails) {
		this.relatedPartyDetails = relatedPartyDetails;
	}

	public Equalisation1 getEqualisation() {
		return equalisation;
	}

	public void setEqualisation(com.tools20022.repository.msg.Equalisation1 equalisation) {
		this.equalisation = equalisation;
	}

	public CustomerConductClassification1Choice getCustomerConductClassification() {
		return customerConductClassification;
	}

	public void setCustomerConductClassification(CustomerConductClassification1Choice customerConductClassification) {
		this.customerConductClassification = customerConductClassification;
	}

	public TransactionChannelType1Choice getTransactionChannelType() {
		return transactionChannelType;
	}

	public void setTransactionChannelType(TransactionChannelType1Choice transactionChannelType) {
		this.transactionChannelType = transactionChannelType;
	}

	public SignatureType1Choice getSignatureType() {
		return signatureType;
	}

	public void setSignatureType(SignatureType1Choice signatureType) {
		this.signatureType = signatureType;
	}

	public OrderWaiver1 getOrderWaiverDetails() {
		return orderWaiverDetails;
	}

	public void setOrderWaiverDetails(com.tools20022.repository.msg.OrderWaiver1 orderWaiverDetails) {
		this.orderWaiverDetails = orderWaiverDetails;
	}
}