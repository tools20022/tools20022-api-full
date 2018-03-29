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
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Order to invest the investor's principal in an investment fund.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder15#mmOrderReference
 * SubscriptionOrder15.mmOrderReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder15#mmClientReference
 * SubscriptionOrder15.mmClientReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder15#mmOrderType
 * SubscriptionOrder15.mmOrderType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder15#mmAmountOrUnits
 * SubscriptionOrder15.mmAmountOrUnits}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubscriptionOrder15#mmRounding
 * SubscriptionOrder15.mmRounding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder15#mmSettlementAmount
 * SubscriptionOrder15.mmSettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder15#mmCashSettlementDate
 * SubscriptionOrder15.mmCashSettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder15#mmSettlementMethod
 * SubscriptionOrder15.mmSettlementMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder15#mmIncomePreference
 * SubscriptionOrder15.mmIncomePreference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder15#mmInvestmentAccountDetails
 * SubscriptionOrder15.mmInvestmentAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder15#mmBeneficiaryDetails
 * SubscriptionOrder15.mmBeneficiaryDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder15#mmForeignExchangeDetails
 * SubscriptionOrder15.mmForeignExchangeDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder15#mmLetterIntentReference
 * SubscriptionOrder15.mmLetterIntentReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder15#mmAccumulationRightReference
 * SubscriptionOrder15.mmAccumulationRightReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder15#mmTransactionOverhead
 * SubscriptionOrder15.mmTransactionOverhead}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder15#mmSettlementAndCustodyDetails
 * SubscriptionOrder15.mmSettlementAndCustodyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder15#mmPhysicalDeliveryIndicator
 * SubscriptionOrder15.mmPhysicalDeliveryIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder15#mmPhysicalDeliveryDetails
 * SubscriptionOrder15.mmPhysicalDeliveryDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder15#mmCashSettlementDetails
 * SubscriptionOrder15.mmCashSettlementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder15#mmNonStandardSettlementInformation
 * SubscriptionOrder15.mmNonStandardSettlementInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder15#mmStaffClientBreakdown
 * SubscriptionOrder15.mmStaffClientBreakdown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder15#mmFinancialAdvice
 * SubscriptionOrder15.mmFinancialAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder15#mmNegotiatedTrade
 * SubscriptionOrder15.mmNegotiatedTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder15#mmRelatedPartyDetails
 * SubscriptionOrder15.mmRelatedPartyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder15#mmEqualisation
 * SubscriptionOrder15.mmEqualisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder15#mmSourceOfCash
 * SubscriptionOrder15.mmSourceOfCash}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder15#mmCustomerConductClassification
 * SubscriptionOrder15.mmCustomerConductClassification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder15#mmTransactionChannelType
 * SubscriptionOrder15.mmTransactionChannelType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder15#mmSignatureType
 * SubscriptionOrder15.mmSignatureType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder15#mmOrderWaiverDetails
 * SubscriptionOrder15.mmOrderWaiverDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SubscriptionOrder
 * SubscriptionOrder}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintOrderOriginatorEligibility3Rule#forSubscriptionOrder15
 * ConstraintOrderOriginatorEligibility3Rule.forSubscriptionOrder15}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintPhysicalDeliveryDetails1Rule#forSubscriptionOrder15
 * ConstraintPhysicalDeliveryDetails1Rule.forSubscriptionOrder15}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintPhysicalDeliveryDetails2Rule#forSubscriptionOrder15
 * ConstraintPhysicalDeliveryDetails2Rule.forSubscriptionOrder15}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SubscriptionOrder15"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Order to invest the investor's principal in an investment fund."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder7
 * SubscriptionOrder7}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SubscriptionOrder15", propOrder = {"orderReference", "clientReference", "orderType", "amountOrUnits", "rounding", "settlementAmount", "cashSettlementDate", "settlementMethod", "incomePreference",
		"investmentAccountDetails", "beneficiaryDetails", "foreignExchangeDetails", "letterIntentReference", "accumulationRightReference", "transactionOverhead", "settlementAndCustodyDetails", "physicalDeliveryIndicator",
		"physicalDeliveryDetails", "cashSettlementDetails", "nonStandardSettlementInformation", "staffClientBreakdown", "financialAdvice", "negotiatedTrade", "relatedPartyDetails", "equalisation", "sourceOfCash",
		"customerConductClassification", "transactionChannelType", "signatureType", "orderWaiverDetails"})
public class SubscriptionOrder15 {

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
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder15
	 * SubscriptionOrder15}</li>
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
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder7#mmOrderReference
	 * SubscriptionOrder7.mmOrderReference}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SubscriptionOrder15, Max35Text> mmOrderReference = new MMMessageAttribute<SubscriptionOrder15, Max35Text>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionOrder15.mmObject();
			isDerived = false;
			xmlTag = "OrdrRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderReference";
			definition = "Unique and unambiguous identifier for the order, as assigned by the instructing party.";
			previousVersion_lazy = () -> SubscriptionOrder7.mmOrderReference;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(SubscriptionOrder15 obj) {
			return obj.getOrderReference();
		}

		@Override
		public void setValue(SubscriptionOrder15 obj, Max35Text value) {
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
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder15
	 * SubscriptionOrder15}</li>
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
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder7#mmClientReference
	 * SubscriptionOrder7.mmClientReference}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SubscriptionOrder15, Optional<Max35Text>> mmClientReference = new MMMessageAttribute<SubscriptionOrder15, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundTransaction.mmClientReference;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionOrder15.mmObject();
			isDerived = false;
			xmlTag = "ClntRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClientReference";
			definition = "Unique and unambiguous investor's identification of the order. This reference can typically be used in a hub scenario to give the reference of the order as assigned by the underlying client.";
			previousVersion_lazy = () -> SubscriptionOrder7.mmClientReference;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(SubscriptionOrder15 obj) {
			return obj.getClientReference();
		}

		@Override
		public void setValue(SubscriptionOrder15 obj, Optional<Max35Text> value) {
			obj.setClientReference(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder15
	 * SubscriptionOrder15}</li>
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
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder7#mmOrderType
	 * SubscriptionOrder7.mmOrderType}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SubscriptionOrder15, List<FundOrderType4Choice>> mmOrderType = new MMMessageAssociationEnd<SubscriptionOrder15, List<FundOrderType4Choice>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrder.mmOrderType;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionOrder15.mmObject();
			isDerived = false;
			xmlTag = "OrdrTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderType";
			definition = "Category of the investment fund order.";
			previousVersion_lazy = () -> SubscriptionOrder7.mmOrderType;
			maxOccurs = 10;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FundOrderType4Choice.mmObject();
		}

		@Override
		public List<FundOrderType4Choice> getValue(SubscriptionOrder15 obj) {
			return obj.getOrderType();
		}

		@Override
		public void setValue(SubscriptionOrder15 obj, List<FundOrderType4Choice> value) {
			obj.setOrderType(value);
		}
	};
	@XmlElement(name = "AmtOrUnits", required = true)
	protected FinancialInstrumentQuantity27Choice amountOrUnits;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity27Choice
	 * FinancialInstrumentQuantity27Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmOrderedQuantity
	 * SecuritiesOrder.mmOrderedQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder15
	 * SubscriptionOrder15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AmtOrUnits"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmountOrUnits"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money or the number of units for the subscription order."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SubscriptionOrder15, FinancialInstrumentQuantity27Choice> mmAmountOrUnits = new MMMessageAssociationEnd<SubscriptionOrder15, FinancialInstrumentQuantity27Choice>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmOrderedQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionOrder15.mmObject();
			isDerived = false;
			xmlTag = "AmtOrUnits";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmountOrUnits";
			definition = "Amount of money or the number of units for the subscription order.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity27Choice.mmObject();
		}

		@Override
		public FinancialInstrumentQuantity27Choice getValue(SubscriptionOrder15 obj) {
			return obj.getAmountOrUnits();
		}

		@Override
		public void setValue(SubscriptionOrder15 obj, FinancialInstrumentQuantity27Choice value) {
			obj.setAmountOrUnits(value);
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
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder15
	 * SubscriptionOrder15}</li>
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
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder7#mmRounding
	 * SubscriptionOrder7.mmRounding}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SubscriptionOrder15, Optional<RoundingDirection2Code>> mmRounding = new MMMessageAttribute<SubscriptionOrder15, Optional<RoundingDirection2Code>>() {
		{
			businessElementTrace_lazy = () -> RoundingParameters.mmRoundingDirection;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionOrder15.mmObject();
			isDerived = false;
			xmlTag = "Rndg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rounding";
			definition = "Indicates the rounding direction applied to nearest unit.";
			previousVersion_lazy = () -> SubscriptionOrder7.mmRounding;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RoundingDirection2Code.mmObject();
		}

		@Override
		public Optional<RoundingDirection2Code> getValue(SubscriptionOrder15 obj) {
			return obj.getRounding();
		}

		@Override
		public void setValue(SubscriptionOrder15 obj, Optional<RoundingDirection2Code> value) {
			obj.setRounding(value.orElse(null));
		}
	};
	@XmlElement(name = "SttlmAmt")
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
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder15
	 * SubscriptionOrder15}</li>
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
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder7#mmSettlementAmount
	 * SubscriptionOrder7.mmSettlementAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SubscriptionOrder15, Optional<ActiveCurrencyAndAmount>> mmSettlementAmount = new MMMessageAttribute<SubscriptionOrder15, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmSettlementAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionOrder15.mmObject();
			isDerived = false;
			xmlTag = "SttlmAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementAmount";
			definition = "Total amount of money paid /to be paid or received in exchange for the financial instrument in the individual order.";
			previousVersion_lazy = () -> SubscriptionOrder7.mmSettlementAmount;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(SubscriptionOrder15 obj) {
			return obj.getSettlementAmount();
		}

		@Override
		public void setValue(SubscriptionOrder15 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setSettlementAmount(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder15
	 * SubscriptionOrder15}</li>
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
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder7#mmCashSettlementDate
	 * SubscriptionOrder7.mmCashSettlementDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SubscriptionOrder15, Optional<ISODate>> mmCashSettlementDate = new MMMessageAttribute<SubscriptionOrder15, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> Payment.mmValueDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionOrder15.mmObject();
			isDerived = false;
			xmlTag = "CshSttlmDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashSettlementDate";
			definition = "Date on which cash is available.";
			previousVersion_lazy = () -> SubscriptionOrder7.mmCashSettlementDate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(SubscriptionOrder15 obj) {
			return obj.getCashSettlementDate();
		}

		@Override
		public void setValue(SubscriptionOrder15 obj, Optional<ISODate> value) {
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
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder15
	 * SubscriptionOrder15}</li>
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
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder7#mmSettlementMethod
	 * SubscriptionOrder7.mmSettlementMethod}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SubscriptionOrder15, Optional<DeliveryReceiptType2Code>> mmSettlementMethod = new MMMessageAttribute<SubscriptionOrder15, Optional<DeliveryReceiptType2Code>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmSettlementType;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionOrder15.mmObject();
			isDerived = false;
			xmlTag = "SttlmMtd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementMethod";
			definition = "Method by which the transaction is settled.";
			previousVersion_lazy = () -> SubscriptionOrder7.mmSettlementMethod;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DeliveryReceiptType2Code.mmObject();
		}

		@Override
		public Optional<DeliveryReceiptType2Code> getValue(SubscriptionOrder15 obj) {
			return obj.getSettlementMethod();
		}

		@Override
		public void setValue(SubscriptionOrder15 obj, Optional<DeliveryReceiptType2Code> value) {
			obj.setSettlementMethod(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder15
	 * SubscriptionOrder15}</li>
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
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder7#mmIncomePreference
	 * SubscriptionOrder7.mmIncomePreference}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SubscriptionOrder15, Optional<IncomePreference1Code>> mmIncomePreference = new MMMessageAttribute<SubscriptionOrder15, Optional<IncomePreference1Code>>() {
		{
			businessElementTrace_lazy = () -> InvestmentAccountService.mmIncomePreference;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionOrder15.mmObject();
			isDerived = false;
			xmlTag = "IncmPref";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncomePreference";
			definition = "Dividend option chosen by the account owner based on the options offered in the prospectus.";
			previousVersion_lazy = () -> SubscriptionOrder7.mmIncomePreference;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> IncomePreference1Code.mmObject();
		}

		@Override
		public Optional<IncomePreference1Code> getValue(SubscriptionOrder15 obj) {
			return obj.getIncomePreference();
		}

		@Override
		public void setValue(SubscriptionOrder15 obj, Optional<IncomePreference1Code> value) {
			obj.setIncomePreference(value.orElse(null));
		}
	};
	@XmlElement(name = "InvstmtAcctDtls", required = true)
	protected InvestmentAccount58 investmentAccountDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.InvestmentAccount58
	 * InvestmentAccount58}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#mmInvestmentAccount
	 * InvestmentFundTransaction.mmInvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder15
	 * SubscriptionOrder15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InvstmtAcctDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentAccountDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account impacted by the investment fund order."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder7#mmInvestmentAccountDetails
	 * SubscriptionOrder7.mmInvestmentAccountDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SubscriptionOrder15, InvestmentAccount58> mmInvestmentAccountDetails = new MMMessageAssociationEnd<SubscriptionOrder15, InvestmentAccount58>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundTransaction.mmInvestmentAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionOrder15.mmObject();
			isDerived = false;
			xmlTag = "InvstmtAcctDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentAccountDetails";
			definition = "Account impacted by the investment fund order.";
			previousVersion_lazy = () -> SubscriptionOrder7.mmInvestmentAccountDetails;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> InvestmentAccount58.mmObject();
		}

		@Override
		public InvestmentAccount58 getValue(SubscriptionOrder15 obj) {
			return obj.getInvestmentAccountDetails();
		}

		@Override
		public void setValue(SubscriptionOrder15 obj, InvestmentAccount58 value) {
			obj.setInvestmentAccountDetails(value);
		}
	};
	@XmlElement(name = "BnfcryDtls")
	protected List<IndividualPerson31> beneficiaryDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.IndividualPerson31
	 * IndividualPerson31}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Person Person}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder15
	 * SubscriptionOrder15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BnfcryDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BeneficiaryDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Additional information about the investor."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder7#mmBeneficiaryDetails
	 * SubscriptionOrder7.mmBeneficiaryDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SubscriptionOrder15, List<IndividualPerson31>> mmBeneficiaryDetails = new MMMessageAssociationEnd<SubscriptionOrder15, List<IndividualPerson31>>() {
		{
			businessComponentTrace_lazy = () -> Person.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionOrder15.mmObject();
			isDerived = false;
			xmlTag = "BnfcryDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BeneficiaryDetails";
			definition = "Additional information about the investor.";
			previousVersion_lazy = () -> SubscriptionOrder7.mmBeneficiaryDetails;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> IndividualPerson31.mmObject();
		}

		@Override
		public List<IndividualPerson31> getValue(SubscriptionOrder15 obj) {
			return obj.getBeneficiaryDetails();
		}

		@Override
		public void setValue(SubscriptionOrder15 obj, List<IndividualPerson31> value) {
			obj.setBeneficiaryDetails(value);
		}
	};
	@XmlElement(name = "FXDtls")
	protected ForeignExchangeTerms32 foreignExchangeDetails;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder15
	 * SubscriptionOrder15}</li>
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
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder7#mmForeignExchangeDetails
	 * SubscriptionOrder7.mmForeignExchangeDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SubscriptionOrder15, Optional<ForeignExchangeTerms32>> mmForeignExchangeDetails = new MMMessageAssociationEnd<SubscriptionOrder15, Optional<ForeignExchangeTerms32>>() {
		{
			businessElementTrace_lazy = () -> ForeignExchangeTrade.mmAgreedRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionOrder15.mmObject();
			isDerived = false;
			xmlTag = "FXDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignExchangeDetails";
			definition = "Information needed to process a currency exchange or conversion.\r\nHow the exchange rate is expressed determines which currency is the Unit Currency and Quoted Currency. If the amounts concerned are EUR 1000 and USD 1300, the exchange rate may be expressed as per either of the following examples:\r\nEXAMPLE 1 \r\nUnitCurrency EUR\r\nQuotedCurrency USD\r\nExchangeRate 1.300\r\nEXAMPLE 2\r\nUnitCurrency USD\r\nQuotedCurrency EUR\r\nExchangeRate 0.769.";
			previousVersion_lazy = () -> SubscriptionOrder7.mmForeignExchangeDetails;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ForeignExchangeTerms32.mmObject();
		}

		@Override
		public Optional<ForeignExchangeTerms32> getValue(SubscriptionOrder15 obj) {
			return obj.getForeignExchangeDetails();
		}

		@Override
		public void setValue(SubscriptionOrder15 obj, Optional<ForeignExchangeTerms32> value) {
			obj.setForeignExchangeDetails(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder15
	 * SubscriptionOrder15}</li>
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
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder7#mmLetterIntentReference
	 * SubscriptionOrder7.mmLetterIntentReference}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SubscriptionOrder15, Optional<Max35Text>> mmLetterIntentReference = new MMMessageAttribute<SubscriptionOrder15, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> InvestmentAccount.mmInvestmentAccountContract;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionOrder15.mmObject();
			isDerived = false;
			xmlTag = "LttrInttRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LetterIntentReference";
			definition = "Reference of a letter of intent program, in which sales commissions are reduced based on the aggregate of a customer's actual purchase and anticipated purchases, over a specific period of time, and as agreed by the customer. A letter of intent program is mainly used in the US market.";
			previousVersion_lazy = () -> SubscriptionOrder7.mmLetterIntentReference;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(SubscriptionOrder15 obj) {
			return obj.getLetterIntentReference();
		}

		@Override
		public void setValue(SubscriptionOrder15 obj, Optional<Max35Text> value) {
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
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder15
	 * SubscriptionOrder15}</li>
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
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder7#mmAccumulationRightReference
	 * SubscriptionOrder7.mmAccumulationRightReference}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SubscriptionOrder15, Optional<Max35Text>> mmAccumulationRightReference = new MMMessageAttribute<SubscriptionOrder15, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> InvestmentAccountContract.mmAccumulationRightReference;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionOrder15.mmObject();
			isDerived = false;
			xmlTag = "AcmltnRghtRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccumulationRightReference";
			definition = "Reference of an accumulation right program, in which sales commissions are based on a customer's present purchases of shares and the aggregate quantity previously purchased by the customer. An accumulation rights program is mainly used in the US market.";
			previousVersion_lazy = () -> SubscriptionOrder7.mmAccumulationRightReference;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(SubscriptionOrder15 obj) {
			return obj.getAccumulationRightReference();
		}

		@Override
		public void setValue(SubscriptionOrder15 obj, Optional<Max35Text> value) {
			obj.setAccumulationRightReference(value.orElse(null));
		}
	};
	@XmlElement(name = "TxOvrhd")
	protected FeeAndTax1 transactionOverhead;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder15
	 * SubscriptionOrder15}</li>
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
	 * "Fees (charges/commission) and tax to be applied to the net amount."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SubscriptionOrder15, Optional<FeeAndTax1>> mmTransactionOverhead = new MMMessageAssociationEnd<SubscriptionOrder15, Optional<FeeAndTax1>>() {
		{
			businessComponentTrace_lazy = () -> InvestmentFundTax.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionOrder15.mmObject();
			isDerived = false;
			xmlTag = "TxOvrhd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionOverhead";
			definition = "Fees (charges/commission) and tax to be applied to the net amount.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FeeAndTax1.mmObject();
		}

		@Override
		public Optional<FeeAndTax1> getValue(SubscriptionOrder15 obj) {
			return obj.getTransactionOverhead();
		}

		@Override
		public void setValue(SubscriptionOrder15 obj, Optional<FeeAndTax1> value) {
			obj.setTransactionOverhead(value.orElse(null));
		}
	};
	@XmlElement(name = "SttlmAndCtdyDtls")
	protected FundSettlementParameters11 settlementAndCustodyDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.FundSettlementParameters11
	 * FundSettlementParameters11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#mmSecuritiesSettlement
	 * SecuritiesTradeExecution.mmSecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder15
	 * SubscriptionOrder15}</li>
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
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder7#mmSettlementAndCustodyDetails
	 * SubscriptionOrder7.mmSettlementAndCustodyDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SubscriptionOrder15, Optional<FundSettlementParameters11>> mmSettlementAndCustodyDetails = new MMMessageAssociationEnd<SubscriptionOrder15, Optional<FundSettlementParameters11>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeExecution.mmSecuritiesSettlement;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionOrder15.mmObject();
			isDerived = false;
			xmlTag = "SttlmAndCtdyDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementAndCustodyDetails";
			definition = "Parameters used to execute the settlement of an investment fund order.";
			previousVersion_lazy = () -> SubscriptionOrder7.mmSettlementAndCustodyDetails;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FundSettlementParameters11.mmObject();
		}

		@Override
		public Optional<FundSettlementParameters11> getValue(SubscriptionOrder15 obj) {
			return obj.getSettlementAndCustodyDetails();
		}

		@Override
		public void setValue(SubscriptionOrder15 obj, Optional<FundSettlementParameters11> value) {
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
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder15
	 * SubscriptionOrder15}</li>
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
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder7#mmPhysicalDeliveryIndicator
	 * SubscriptionOrder7.mmPhysicalDeliveryIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SubscriptionOrder15, YesNoIndicator> mmPhysicalDeliveryIndicator = new MMMessageAttribute<SubscriptionOrder15, YesNoIndicator>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionOrder15.mmObject();
			isDerived = false;
			xmlTag = "PhysDlvryInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalDeliveryIndicator";
			definition = "Indicates whether the financial instrument is to be physically delivered.";
			previousVersion_lazy = () -> SubscriptionOrder7.mmPhysicalDeliveryIndicator;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(SubscriptionOrder15 obj) {
			return obj.getPhysicalDeliveryIndicator();
		}

		@Override
		public void setValue(SubscriptionOrder15 obj, YesNoIndicator value) {
			obj.setPhysicalDeliveryIndicator(value);
		}
	};
	@XmlElement(name = "PhysDlvryDtls")
	protected NameAndAddress4 physicalDeliveryDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.NameAndAddress4
	 * NameAndAddress4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PhysicalDelivery#mmAddress
	 * PhysicalDelivery.mmAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder15
	 * SubscriptionOrder15}</li>
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
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder7#mmPhysicalDeliveryDetails
	 * SubscriptionOrder7.mmPhysicalDeliveryDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SubscriptionOrder15, Optional<NameAndAddress4>> mmPhysicalDeliveryDetails = new MMMessageAssociationEnd<SubscriptionOrder15, Optional<NameAndAddress4>>() {
		{
			businessElementTrace_lazy = () -> PhysicalDelivery.mmAddress;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionOrder15.mmObject();
			isDerived = false;
			xmlTag = "PhysDlvryDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalDeliveryDetails";
			definition = "Information related to the physical delivery of the securities.";
			previousVersion_lazy = () -> SubscriptionOrder7.mmPhysicalDeliveryDetails;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> NameAndAddress4.mmObject();
		}

		@Override
		public Optional<NameAndAddress4> getValue(SubscriptionOrder15 obj) {
			return obj.getPhysicalDeliveryDetails();
		}

		@Override
		public void setValue(SubscriptionOrder15 obj, Optional<NameAndAddress4> value) {
			obj.setPhysicalDeliveryDetails(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder15
	 * SubscriptionOrder15}</li>
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
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder7#mmCashSettlementDetails
	 * SubscriptionOrder7.mmCashSettlementDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SubscriptionOrder15, Optional<PaymentTransaction70>> mmCashSettlementDetails = new MMMessageAssociationEnd<SubscriptionOrder15, Optional<PaymentTransaction70>>() {
		{
			businessElementTrace_lazy = () -> PaymentObligation.mmPaymentOffset;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionOrder15.mmObject();
			isDerived = false;
			xmlTag = "CshSttlmDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashSettlementDetails";
			definition = "Payment process for the transfer of cash from the debtor to the creditor.";
			previousVersion_lazy = () -> SubscriptionOrder7.mmCashSettlementDetails;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PaymentTransaction70.mmObject();
		}

		@Override
		public Optional<PaymentTransaction70> getValue(SubscriptionOrder15 obj) {
			return obj.getCashSettlementDetails();
		}

		@Override
		public void setValue(SubscriptionOrder15 obj, Optional<PaymentTransaction70> value) {
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
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder15
	 * SubscriptionOrder15}</li>
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
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder7#mmNonStandardSettlementInformation
	 * SubscriptionOrder7.mmNonStandardSettlementInformation}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SubscriptionOrder15, Optional<Max350Text>> mmNonStandardSettlementInformation = new MMMessageAttribute<SubscriptionOrder15, Optional<Max350Text>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrderExecution.mmNonStandardSettlementInformation;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionOrder15.mmObject();
			isDerived = false;
			xmlTag = "NonStdSttlmInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonStandardSettlementInformation";
			definition = "Additional specific settlement information for non-regulated traded funds.";
			previousVersion_lazy = () -> SubscriptionOrder7.mmNonStandardSettlementInformation;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Optional<Max350Text> getValue(SubscriptionOrder15 obj) {
			return obj.getNonStandardSettlementInformation();
		}

		@Override
		public void setValue(SubscriptionOrder15 obj, Optional<Max350Text> value) {
			obj.setNonStandardSettlementInformation(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder15
	 * SubscriptionOrder15}</li>
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
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder7#mmStaffClientBreakdown
	 * SubscriptionOrder7.mmStaffClientBreakdown}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SubscriptionOrder15, List<InvestmentFundsOrderBreakdown2>> mmStaffClientBreakdown = new MMMessageAssociationEnd<SubscriptionOrder15, List<InvestmentFundsOrderBreakdown2>>() {
		{
			businessComponentTrace_lazy = () -> SubscriptionOrder.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionOrder15.mmObject();
			isDerived = false;
			xmlTag = "StffClntBrkdwn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StaffClientBreakdown";
			definition = "Breakdown of the net amount per type of order.";
			previousVersion_lazy = () -> SubscriptionOrder7.mmStaffClientBreakdown;
			maxOccurs = 4;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> InvestmentFundsOrderBreakdown2.mmObject();
		}

		@Override
		public List<InvestmentFundsOrderBreakdown2> getValue(SubscriptionOrder15 obj) {
			return obj.getStaffClientBreakdown();
		}

		@Override
		public void setValue(SubscriptionOrder15 obj, List<InvestmentFundsOrderBreakdown2> value) {
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
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder15
	 * SubscriptionOrder15}</li>
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
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder7#mmFinancialAdvice
	 * SubscriptionOrder7.mmFinancialAdvice}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SubscriptionOrder15, Optional<FinancialAdvice1Code>> mmFinancialAdvice = new MMMessageAttribute<SubscriptionOrder15, Optional<FinancialAdvice1Code>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrder.mmFinancialAdvice;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionOrder15.mmObject();
			isDerived = false;
			xmlTag = "FinAdvc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialAdvice";
			definition = "Specifies if advice has been received from an independent financial advisor.";
			previousVersion_lazy = () -> SubscriptionOrder7.mmFinancialAdvice;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> FinancialAdvice1Code.mmObject();
		}

		@Override
		public Optional<FinancialAdvice1Code> getValue(SubscriptionOrder15 obj) {
			return obj.getFinancialAdvice();
		}

		@Override
		public void setValue(SubscriptionOrder15 obj, Optional<FinancialAdvice1Code> value) {
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
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder15
	 * SubscriptionOrder15}</li>
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
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder7#mmNegotiatedTrade
	 * SubscriptionOrder7.mmNegotiatedTrade}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SubscriptionOrder15, Optional<NegotiatedTrade1Code>> mmNegotiatedTrade = new MMMessageAttribute<SubscriptionOrder15, Optional<NegotiatedTrade1Code>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrder.mmNegotiatedTrade;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionOrder15.mmObject();
			isDerived = false;
			xmlTag = "NgtdTrad";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NegotiatedTrade";
			definition = "Specifies whether the trade is negotiated.";
			previousVersion_lazy = () -> SubscriptionOrder7.mmNegotiatedTrade;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> NegotiatedTrade1Code.mmObject();
		}

		@Override
		public Optional<NegotiatedTrade1Code> getValue(SubscriptionOrder15 obj) {
			return obj.getNegotiatedTrade();
		}

		@Override
		public void setValue(SubscriptionOrder15 obj, Optional<NegotiatedTrade1Code> value) {
			obj.setNegotiatedTrade(value.orElse(null));
		}
	};
	@XmlElement(name = "RltdPtyDtls")
	protected List<Intermediary40> relatedPartyDetails;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder15
	 * SubscriptionOrder15}</li>
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
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder7#mmRelatedPartyDetails
	 * SubscriptionOrder7.mmRelatedPartyDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SubscriptionOrder15, List<Intermediary40>> mmRelatedPartyDetails = new MMMessageAssociationEnd<SubscriptionOrder15, List<Intermediary40>>() {
		{
			businessElementTrace_lazy = () -> Trade.mmTradePartyRole;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionOrder15.mmObject();
			isDerived = false;
			xmlTag = "RltdPtyDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedPartyDetails";
			definition = "Party related to the transaction.";
			previousVersion_lazy = () -> SubscriptionOrder7.mmRelatedPartyDetails;
			maxOccurs = 10;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Intermediary40.mmObject();
		}

		@Override
		public List<Intermediary40> getValue(SubscriptionOrder15 obj) {
			return obj.getRelatedPartyDetails();
		}

		@Override
		public void setValue(SubscriptionOrder15 obj, List<Intermediary40> value) {
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
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder15
	 * SubscriptionOrder15}</li>
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
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder7#mmEqualisation
	 * SubscriptionOrder7.mmEqualisation}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SubscriptionOrder15, Optional<Equalisation1>> mmEqualisation = new MMMessageAssociationEnd<SubscriptionOrder15, Optional<Equalisation1>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundClass.mmEqualisation;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionOrder15.mmObject();
			isDerived = false;
			xmlTag = "Equlstn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Equalisation";
			definition = "Part of an investor's subscription amount that is held by the fund in order to pay incentive/performance fees at the end of the fiscal year.";
			previousVersion_lazy = () -> SubscriptionOrder7.mmEqualisation;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Equalisation1.mmObject();
		}

		@Override
		public Optional<Equalisation1> getValue(SubscriptionOrder15 obj) {
			return obj.getEqualisation();
		}

		@Override
		public void setValue(SubscriptionOrder15 obj, Optional<Equalisation1> value) {
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
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder15
	 * SubscriptionOrder15}</li>
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
	public static final MMMessageAssociationEnd<SubscriptionOrder15, List<SourceOfCash1Choice>> mmSourceOfCash = new MMMessageAssociationEnd<SubscriptionOrder15, List<SourceOfCash1Choice>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrderExecution.mmSourceOfCash;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionOrder15.mmObject();
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
		public List<SourceOfCash1Choice> getValue(SubscriptionOrder15 obj) {
			return obj.getSourceOfCash();
		}

		@Override
		public void setValue(SubscriptionOrder15 obj, List<SourceOfCash1Choice> value) {
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
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder15
	 * SubscriptionOrder15}</li>
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
	public static final MMMessageAttribute<SubscriptionOrder15, Optional<CustomerConductClassification1Choice>> mmCustomerConductClassification = new MMMessageAttribute<SubscriptionOrder15, Optional<CustomerConductClassification1Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionOrder15.mmObject();
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
		public Optional<CustomerConductClassification1Choice> getValue(SubscriptionOrder15 obj) {
			return obj.getCustomerConductClassification();
		}

		@Override
		public void setValue(SubscriptionOrder15 obj, Optional<CustomerConductClassification1Choice> value) {
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
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder15
	 * SubscriptionOrder15}</li>
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
	public static final MMMessageAssociationEnd<SubscriptionOrder15, Optional<TransactionChannelType1Choice>> mmTransactionChannelType = new MMMessageAssociationEnd<SubscriptionOrder15, Optional<TransactionChannelType1Choice>>() {
		{
			businessElementTrace_lazy = () -> AccountContract.mmTransactionChannel;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionOrder15.mmObject();
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
		public Optional<TransactionChannelType1Choice> getValue(SubscriptionOrder15 obj) {
			return obj.getTransactionChannelType();
		}

		@Override
		public void setValue(SubscriptionOrder15 obj, Optional<TransactionChannelType1Choice> value) {
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
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder15
	 * SubscriptionOrder15}</li>
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
	public static final MMMessageAttribute<SubscriptionOrder15, Optional<SignatureType1Choice>> mmSignatureType = new MMMessageAttribute<SubscriptionOrder15, Optional<SignatureType1Choice>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmSignatureRequired;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionOrder15.mmObject();
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
		public Optional<SignatureType1Choice> getValue(SubscriptionOrder15 obj) {
			return obj.getSignatureType();
		}

		@Override
		public void setValue(SubscriptionOrder15 obj, Optional<SignatureType1Choice> value) {
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
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder15
	 * SubscriptionOrder15}</li>
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
	public static final MMMessageAssociationEnd<SubscriptionOrder15, Optional<OrderWaiver1>> mmOrderWaiverDetails = new MMMessageAssociationEnd<SubscriptionOrder15, Optional<OrderWaiver1>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrder.mmOrderWaiverReason;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionOrder15.mmObject();
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
		public Optional<OrderWaiver1> getValue(SubscriptionOrder15 obj) {
			return obj.getOrderWaiverDetails();
		}

		@Override
		public void setValue(SubscriptionOrder15 obj, Optional<OrderWaiver1> value) {
			obj.setOrderWaiverDetails(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SubscriptionOrder15.mmOrderReference, com.tools20022.repository.msg.SubscriptionOrder15.mmClientReference,
						com.tools20022.repository.msg.SubscriptionOrder15.mmOrderType, com.tools20022.repository.msg.SubscriptionOrder15.mmAmountOrUnits, com.tools20022.repository.msg.SubscriptionOrder15.mmRounding,
						com.tools20022.repository.msg.SubscriptionOrder15.mmSettlementAmount, com.tools20022.repository.msg.SubscriptionOrder15.mmCashSettlementDate, com.tools20022.repository.msg.SubscriptionOrder15.mmSettlementMethod,
						com.tools20022.repository.msg.SubscriptionOrder15.mmIncomePreference, com.tools20022.repository.msg.SubscriptionOrder15.mmInvestmentAccountDetails,
						com.tools20022.repository.msg.SubscriptionOrder15.mmBeneficiaryDetails, com.tools20022.repository.msg.SubscriptionOrder15.mmForeignExchangeDetails,
						com.tools20022.repository.msg.SubscriptionOrder15.mmLetterIntentReference, com.tools20022.repository.msg.SubscriptionOrder15.mmAccumulationRightReference,
						com.tools20022.repository.msg.SubscriptionOrder15.mmTransactionOverhead, com.tools20022.repository.msg.SubscriptionOrder15.mmSettlementAndCustodyDetails,
						com.tools20022.repository.msg.SubscriptionOrder15.mmPhysicalDeliveryIndicator, com.tools20022.repository.msg.SubscriptionOrder15.mmPhysicalDeliveryDetails,
						com.tools20022.repository.msg.SubscriptionOrder15.mmCashSettlementDetails, com.tools20022.repository.msg.SubscriptionOrder15.mmNonStandardSettlementInformation,
						com.tools20022.repository.msg.SubscriptionOrder15.mmStaffClientBreakdown, com.tools20022.repository.msg.SubscriptionOrder15.mmFinancialAdvice, com.tools20022.repository.msg.SubscriptionOrder15.mmNegotiatedTrade,
						com.tools20022.repository.msg.SubscriptionOrder15.mmRelatedPartyDetails, com.tools20022.repository.msg.SubscriptionOrder15.mmEqualisation, com.tools20022.repository.msg.SubscriptionOrder15.mmSourceOfCash,
						com.tools20022.repository.msg.SubscriptionOrder15.mmCustomerConductClassification, com.tools20022.repository.msg.SubscriptionOrder15.mmTransactionChannelType,
						com.tools20022.repository.msg.SubscriptionOrder15.mmSignatureType, com.tools20022.repository.msg.SubscriptionOrder15.mmOrderWaiverDetails);
				trace_lazy = () -> SubscriptionOrder.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintOrderOriginatorEligibility3Rule.forSubscriptionOrder15,
						com.tools20022.repository.constraints.ConstraintPhysicalDeliveryDetails1Rule.forSubscriptionOrder15, com.tools20022.repository.constraints.ConstraintPhysicalDeliveryDetails2Rule.forSubscriptionOrder15);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SubscriptionOrder15";
				definition = "Order to invest the investor's principal in an investment fund.";
				previousVersion_lazy = () -> SubscriptionOrder7.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getOrderReference() {
		return orderReference;
	}

	public SubscriptionOrder15 setOrderReference(Max35Text orderReference) {
		this.orderReference = Objects.requireNonNull(orderReference);
		return this;
	}

	public Optional<Max35Text> getClientReference() {
		return clientReference == null ? Optional.empty() : Optional.of(clientReference);
	}

	public SubscriptionOrder15 setClientReference(Max35Text clientReference) {
		this.clientReference = clientReference;
		return this;
	}

	public List<FundOrderType4Choice> getOrderType() {
		return orderType == null ? orderType = new ArrayList<>() : orderType;
	}

	public SubscriptionOrder15 setOrderType(List<FundOrderType4Choice> orderType) {
		this.orderType = Objects.requireNonNull(orderType);
		return this;
	}

	public FinancialInstrumentQuantity27Choice getAmountOrUnits() {
		return amountOrUnits;
	}

	public SubscriptionOrder15 setAmountOrUnits(FinancialInstrumentQuantity27Choice amountOrUnits) {
		this.amountOrUnits = Objects.requireNonNull(amountOrUnits);
		return this;
	}

	public Optional<RoundingDirection2Code> getRounding() {
		return rounding == null ? Optional.empty() : Optional.of(rounding);
	}

	public SubscriptionOrder15 setRounding(RoundingDirection2Code rounding) {
		this.rounding = rounding;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getSettlementAmount() {
		return settlementAmount == null ? Optional.empty() : Optional.of(settlementAmount);
	}

	public SubscriptionOrder15 setSettlementAmount(ActiveCurrencyAndAmount settlementAmount) {
		this.settlementAmount = settlementAmount;
		return this;
	}

	public Optional<ISODate> getCashSettlementDate() {
		return cashSettlementDate == null ? Optional.empty() : Optional.of(cashSettlementDate);
	}

	public SubscriptionOrder15 setCashSettlementDate(ISODate cashSettlementDate) {
		this.cashSettlementDate = cashSettlementDate;
		return this;
	}

	public Optional<DeliveryReceiptType2Code> getSettlementMethod() {
		return settlementMethod == null ? Optional.empty() : Optional.of(settlementMethod);
	}

	public SubscriptionOrder15 setSettlementMethod(DeliveryReceiptType2Code settlementMethod) {
		this.settlementMethod = settlementMethod;
		return this;
	}

	public Optional<IncomePreference1Code> getIncomePreference() {
		return incomePreference == null ? Optional.empty() : Optional.of(incomePreference);
	}

	public SubscriptionOrder15 setIncomePreference(IncomePreference1Code incomePreference) {
		this.incomePreference = incomePreference;
		return this;
	}

	public InvestmentAccount58 getInvestmentAccountDetails() {
		return investmentAccountDetails;
	}

	public SubscriptionOrder15 setInvestmentAccountDetails(InvestmentAccount58 investmentAccountDetails) {
		this.investmentAccountDetails = Objects.requireNonNull(investmentAccountDetails);
		return this;
	}

	public List<IndividualPerson31> getBeneficiaryDetails() {
		return beneficiaryDetails == null ? beneficiaryDetails = new ArrayList<>() : beneficiaryDetails;
	}

	public SubscriptionOrder15 setBeneficiaryDetails(List<IndividualPerson31> beneficiaryDetails) {
		this.beneficiaryDetails = Objects.requireNonNull(beneficiaryDetails);
		return this;
	}

	public Optional<ForeignExchangeTerms32> getForeignExchangeDetails() {
		return foreignExchangeDetails == null ? Optional.empty() : Optional.of(foreignExchangeDetails);
	}

	public SubscriptionOrder15 setForeignExchangeDetails(ForeignExchangeTerms32 foreignExchangeDetails) {
		this.foreignExchangeDetails = foreignExchangeDetails;
		return this;
	}

	public Optional<Max35Text> getLetterIntentReference() {
		return letterIntentReference == null ? Optional.empty() : Optional.of(letterIntentReference);
	}

	public SubscriptionOrder15 setLetterIntentReference(Max35Text letterIntentReference) {
		this.letterIntentReference = letterIntentReference;
		return this;
	}

	public Optional<Max35Text> getAccumulationRightReference() {
		return accumulationRightReference == null ? Optional.empty() : Optional.of(accumulationRightReference);
	}

	public SubscriptionOrder15 setAccumulationRightReference(Max35Text accumulationRightReference) {
		this.accumulationRightReference = accumulationRightReference;
		return this;
	}

	public Optional<FeeAndTax1> getTransactionOverhead() {
		return transactionOverhead == null ? Optional.empty() : Optional.of(transactionOverhead);
	}

	public SubscriptionOrder15 setTransactionOverhead(FeeAndTax1 transactionOverhead) {
		this.transactionOverhead = transactionOverhead;
		return this;
	}

	public Optional<FundSettlementParameters11> getSettlementAndCustodyDetails() {
		return settlementAndCustodyDetails == null ? Optional.empty() : Optional.of(settlementAndCustodyDetails);
	}

	public SubscriptionOrder15 setSettlementAndCustodyDetails(FundSettlementParameters11 settlementAndCustodyDetails) {
		this.settlementAndCustodyDetails = settlementAndCustodyDetails;
		return this;
	}

	public YesNoIndicator getPhysicalDeliveryIndicator() {
		return physicalDeliveryIndicator;
	}

	public SubscriptionOrder15 setPhysicalDeliveryIndicator(YesNoIndicator physicalDeliveryIndicator) {
		this.physicalDeliveryIndicator = Objects.requireNonNull(physicalDeliveryIndicator);
		return this;
	}

	public Optional<NameAndAddress4> getPhysicalDeliveryDetails() {
		return physicalDeliveryDetails == null ? Optional.empty() : Optional.of(physicalDeliveryDetails);
	}

	public SubscriptionOrder15 setPhysicalDeliveryDetails(NameAndAddress4 physicalDeliveryDetails) {
		this.physicalDeliveryDetails = physicalDeliveryDetails;
		return this;
	}

	public Optional<PaymentTransaction70> getCashSettlementDetails() {
		return cashSettlementDetails == null ? Optional.empty() : Optional.of(cashSettlementDetails);
	}

	public SubscriptionOrder15 setCashSettlementDetails(PaymentTransaction70 cashSettlementDetails) {
		this.cashSettlementDetails = cashSettlementDetails;
		return this;
	}

	public Optional<Max350Text> getNonStandardSettlementInformation() {
		return nonStandardSettlementInformation == null ? Optional.empty() : Optional.of(nonStandardSettlementInformation);
	}

	public SubscriptionOrder15 setNonStandardSettlementInformation(Max350Text nonStandardSettlementInformation) {
		this.nonStandardSettlementInformation = nonStandardSettlementInformation;
		return this;
	}

	public List<InvestmentFundsOrderBreakdown2> getStaffClientBreakdown() {
		return staffClientBreakdown == null ? staffClientBreakdown = new ArrayList<>() : staffClientBreakdown;
	}

	public SubscriptionOrder15 setStaffClientBreakdown(List<InvestmentFundsOrderBreakdown2> staffClientBreakdown) {
		this.staffClientBreakdown = Objects.requireNonNull(staffClientBreakdown);
		return this;
	}

	public Optional<FinancialAdvice1Code> getFinancialAdvice() {
		return financialAdvice == null ? Optional.empty() : Optional.of(financialAdvice);
	}

	public SubscriptionOrder15 setFinancialAdvice(FinancialAdvice1Code financialAdvice) {
		this.financialAdvice = financialAdvice;
		return this;
	}

	public Optional<NegotiatedTrade1Code> getNegotiatedTrade() {
		return negotiatedTrade == null ? Optional.empty() : Optional.of(negotiatedTrade);
	}

	public SubscriptionOrder15 setNegotiatedTrade(NegotiatedTrade1Code negotiatedTrade) {
		this.negotiatedTrade = negotiatedTrade;
		return this;
	}

	public List<Intermediary40> getRelatedPartyDetails() {
		return relatedPartyDetails == null ? relatedPartyDetails = new ArrayList<>() : relatedPartyDetails;
	}

	public SubscriptionOrder15 setRelatedPartyDetails(List<Intermediary40> relatedPartyDetails) {
		this.relatedPartyDetails = Objects.requireNonNull(relatedPartyDetails);
		return this;
	}

	public Optional<Equalisation1> getEqualisation() {
		return equalisation == null ? Optional.empty() : Optional.of(equalisation);
	}

	public SubscriptionOrder15 setEqualisation(Equalisation1 equalisation) {
		this.equalisation = equalisation;
		return this;
	}

	public List<SourceOfCash1Choice> getSourceOfCash() {
		return sourceOfCash == null ? sourceOfCash = new ArrayList<>() : sourceOfCash;
	}

	public SubscriptionOrder15 setSourceOfCash(List<SourceOfCash1Choice> sourceOfCash) {
		this.sourceOfCash = Objects.requireNonNull(sourceOfCash);
		return this;
	}

	public Optional<CustomerConductClassification1Choice> getCustomerConductClassification() {
		return customerConductClassification == null ? Optional.empty() : Optional.of(customerConductClassification);
	}

	public SubscriptionOrder15 setCustomerConductClassification(CustomerConductClassification1Choice customerConductClassification) {
		this.customerConductClassification = customerConductClassification;
		return this;
	}

	public Optional<TransactionChannelType1Choice> getTransactionChannelType() {
		return transactionChannelType == null ? Optional.empty() : Optional.of(transactionChannelType);
	}

	public SubscriptionOrder15 setTransactionChannelType(TransactionChannelType1Choice transactionChannelType) {
		this.transactionChannelType = transactionChannelType;
		return this;
	}

	public Optional<SignatureType1Choice> getSignatureType() {
		return signatureType == null ? Optional.empty() : Optional.of(signatureType);
	}

	public SubscriptionOrder15 setSignatureType(SignatureType1Choice signatureType) {
		this.signatureType = signatureType;
		return this;
	}

	public Optional<OrderWaiver1> getOrderWaiverDetails() {
		return orderWaiverDetails == null ? Optional.empty() : Optional.of(orderWaiverDetails);
	}

	public SubscriptionOrder15 setOrderWaiverDetails(OrderWaiver1 orderWaiverDetails) {
		this.orderWaiverDetails = orderWaiverDetails;
		return this;
	}
}