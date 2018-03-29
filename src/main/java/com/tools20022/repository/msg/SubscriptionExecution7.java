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
import com.tools20022.repository.choice.DateAndDateTimeChoice;
import com.tools20022.repository.choice.ProfitAndLoss1Choice;
import com.tools20022.repository.codeset.ActiveCurrencyCode;
import com.tools20022.repository.codeset.HedgeFundOrderType1Code;
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
 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7#mmMasterReference
 * SubscriptionExecution7.mmMasterReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7#mmOrderReference
 * SubscriptionExecution7.mmOrderReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7#mmClientReference
 * SubscriptionExecution7.mmClientReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7#mmDealReference
 * SubscriptionExecution7.mmDealReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7#mmRequestedTradeDate
 * SubscriptionExecution7.mmRequestedTradeDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7#mmHedgeFundOrderType
 * SubscriptionExecution7.mmHedgeFundOrderType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7#mmInvestmentAccountDetails
 * SubscriptionExecution7.mmInvestmentAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7#mmBeneficiaryDetails
 * SubscriptionExecution7.mmBeneficiaryDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7#mmFinancialInstrumentDetails
 * SubscriptionExecution7.mmFinancialInstrumentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7#mmOrderedAmount
 * SubscriptionExecution7.mmOrderedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7#mmExecutedAmount
 * SubscriptionExecution7.mmExecutedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7#mmUnitsNumber
 * SubscriptionExecution7.mmUnitsNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7#mmDealingPriceDetails
 * SubscriptionExecution7.mmDealingPriceDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7#mmInformativePriceDetails
 * SubscriptionExecution7.mmInformativePriceDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7#mmSidePocketDetails
 * SubscriptionExecution7.mmSidePocketDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7#mmTradeDateTime
 * SubscriptionExecution7.mmTradeDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7#mmNAVDate
 * SubscriptionExecution7.mmNAVDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7#mmCashSettlementDate
 * SubscriptionExecution7.mmCashSettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7#mmRequestedSettlementCurrency
 * SubscriptionExecution7.mmRequestedSettlementCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7#mmPaymentReference
 * SubscriptionExecution7.mmPaymentReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7#mmLetterIntentReference
 * SubscriptionExecution7.mmLetterIntentReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7#mmForeignExchangeDetails
 * SubscriptionExecution7.mmForeignExchangeDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7#mmTotalCharges
 * SubscriptionExecution7.mmTotalCharges}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7#mmTaxGeneralDetails
 * SubscriptionExecution7.mmTaxGeneralDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7#mmEqualisation
 * SubscriptionExecution7.mmEqualisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7#mmInterimProfitAmount
 * SubscriptionExecution7.mmInterimProfitAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7#mmRefund
 * SubscriptionExecution7.mmRefund}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7#mmSubscriptionInterest
 * SubscriptionExecution7.mmSubscriptionInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7#mmPartiallyExecutedIndicator
 * SubscriptionExecution7.mmPartiallyExecutedIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7#mmPartialSettlementOfUnits
 * SubscriptionExecution7.mmPartialSettlementOfUnits}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7#mmPartialSettlementOfCash
 * SubscriptionExecution7.mmPartialSettlementOfCash}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7#mmRelatedPartyDetails
 * SubscriptionExecution7.mmRelatedPartyDetails}</li>
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
 * {@linkplain com.tools20022.repository.constraints.ConstraintUnitizedRule#forSubscriptionExecution7
 * ConstraintUnitizedRule.forSubscriptionExecution7}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSidePocketOrderRule#forSubscriptionExecution7
 * ConstraintSidePocketOrderRule.forSubscriptionExecution7}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SubscriptionExecution7"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Execution of a subscription order."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SubscriptionExecution7", propOrder = {"masterReference", "orderReference", "clientReference", "dealReference", "requestedTradeDate", "hedgeFundOrderType", "investmentAccountDetails", "beneficiaryDetails",
		"financialInstrumentDetails", "orderedAmount", "executedAmount", "unitsNumber", "dealingPriceDetails", "informativePriceDetails", "sidePocketDetails", "tradeDateTime", "nAVDate", "cashSettlementDate", "requestedSettlementCurrency",
		"paymentReference", "letterIntentReference", "foreignExchangeDetails", "totalCharges", "taxGeneralDetails", "equalisation", "interimProfitAmount", "refund", "subscriptionInterest", "partiallyExecutedIndicator",
		"partialSettlementOfUnits", "partialSettlementOfCash", "relatedPartyDetails"})
public class SubscriptionExecution7 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "MstrRef")
	protected Max35Text masterReference;
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
	 * {@linkplain com.tools20022.repository.entity.Order#mmMasterIdentification
	 * Order.mmMasterIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7
	 * SubscriptionExecution7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MstrRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MasterReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier for a group of individual orders, as assigned by the instructing party. This identifier links the individual orders together."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SubscriptionExecution7, Optional<Max35Text>> mmMasterReference = new MMMessageAttribute<SubscriptionExecution7, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> Order.mmMasterIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionExecution7.mmObject();
			isDerived = false;
			xmlTag = "MstrRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MasterReference";
			definition = "Unique and unambiguous identifier for a group of individual orders, as assigned by the instructing party. This identifier links the individual orders together.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(SubscriptionExecution7 obj) {
			return obj.getMasterReference();
		}

		@Override
		public void setValue(SubscriptionExecution7 obj, Optional<Max35Text> value) {
			obj.setMasterReference(value.orElse(null));
		}
	};
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
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7
	 * SubscriptionExecution7}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute<SubscriptionExecution7, Max35Text> mmOrderReference = new MMMessageAttribute<SubscriptionExecution7, Max35Text>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionExecution7.mmObject();
			isDerived = false;
			xmlTag = "OrdrRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderReference";
			definition = "Unique and unambiguous identifier for an order, as assigned by the instructing party.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(SubscriptionExecution7 obj) {
			return obj.getOrderReference();
		}

		@Override
		public void setValue(SubscriptionExecution7 obj, Max35Text value) {
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
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7
	 * SubscriptionExecution7}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute<SubscriptionExecution7, Optional<Max35Text>> mmClientReference = new MMMessageAttribute<SubscriptionExecution7, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundTransaction.mmClientReference;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionExecution7.mmObject();
			isDerived = false;
			xmlTag = "ClntRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClientReference";
			definition = "Unique and unambiguous investor's identification of an order. This reference can typically be used in a hub scenario to give the reference of the order as assigned by the underlying client.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(SubscriptionExecution7 obj) {
			return obj.getClientReference();
		}

		@Override
		public void setValue(SubscriptionExecution7 obj, Optional<Max35Text> value) {
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
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7
	 * SubscriptionExecution7}</li>
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
	 * "Unique and unambiguous identifier for an order execution, as assigned by the executing party."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SubscriptionExecution7, Max35Text> mmDealReference = new MMMessageAttribute<SubscriptionExecution7, Max35Text>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrderExecution.mmDealIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionExecution7.mmObject();
			isDerived = false;
			xmlTag = "DealRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DealReference";
			definition = "Unique and unambiguous identifier for an order execution, as assigned by the executing party.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(SubscriptionExecution7 obj) {
			return obj.getDealReference();
		}

		@Override
		public void setValue(SubscriptionExecution7 obj, Max35Text value) {
			obj.setDealReference(value);
		}
	};
	@XmlElement(name = "ReqdTradDt")
	protected ISODate requestedTradeDate;
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmRequestedExecutionDateTime
	 * InvestmentFundOrder.mmRequestedExecutionDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7
	 * SubscriptionExecution7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ReqdTradDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedTradeDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which the investor requested the order to be executed. This is also known as the deal date in hedge funds."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SubscriptionExecution7, Optional<ISODate>> mmRequestedTradeDate = new MMMessageAttribute<SubscriptionExecution7, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrder.mmRequestedExecutionDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionExecution7.mmObject();
			isDerived = false;
			xmlTag = "ReqdTradDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedTradeDate";
			definition = "Date on which the investor requested the order to be executed. This is also known as the deal date in hedge funds.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(SubscriptionExecution7 obj) {
			return obj.getRequestedTradeDate();
		}

		@Override
		public void setValue(SubscriptionExecution7 obj, Optional<ISODate> value) {
			obj.setRequestedTradeDate(value.orElse(null));
		}
	};
	@XmlElement(name = "HdgFndOrdrTp")
	protected List<HedgeFundOrderType1Code> hedgeFundOrderType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.HedgeFundOrderType1Code
	 * HedgeFundOrderType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmOrderType
	 * InvestmentFundOrder.mmOrderType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7
	 * SubscriptionExecution7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "HdgFndOrdrTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HedgeFundOrderType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the category of the investment fund order."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SubscriptionExecution7, List<HedgeFundOrderType1Code>> mmHedgeFundOrderType = new MMMessageAttribute<SubscriptionExecution7, List<HedgeFundOrderType1Code>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrder.mmOrderType;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionExecution7.mmObject();
			isDerived = false;
			xmlTag = "HdgFndOrdrTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HedgeFundOrderType";
			definition = "Specifies the category of the investment fund order.";
			minOccurs = 0;
			simpleType_lazy = () -> HedgeFundOrderType1Code.mmObject();
		}

		@Override
		public List<HedgeFundOrderType1Code> getValue(SubscriptionExecution7 obj) {
			return obj.getHedgeFundOrderType();
		}

		@Override
		public void setValue(SubscriptionExecution7 obj, List<HedgeFundOrderType1Code> value) {
			obj.setHedgeFundOrderType(value);
		}
	};
	@XmlElement(name = "InvstmtAcctDtls", required = true)
	protected InvestmentAccount30 investmentAccountDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.InvestmentAccount30
	 * InvestmentAccount30}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#mmInvestmentAccount
	 * InvestmentFundTransaction.mmInvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7
	 * SubscriptionExecution7}</li>
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
	 * definition} =
	 * "Account between an investor(s) and a fund manager or a fund. The account can contain holdings in any investment fund or investment fund class managed (or distributed) by the fund manager, within the same fund family."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SubscriptionExecution7, InvestmentAccount30> mmInvestmentAccountDetails = new MMMessageAssociationEnd<SubscriptionExecution7, InvestmentAccount30>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundTransaction.mmInvestmentAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionExecution7.mmObject();
			isDerived = false;
			xmlTag = "InvstmtAcctDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentAccountDetails";
			definition = "Account between an investor(s) and a fund manager or a fund. The account can contain holdings in any investment fund or investment fund class managed (or distributed) by the fund manager, within the same fund family.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> InvestmentAccount30.mmObject();
		}

		@Override
		public InvestmentAccount30 getValue(SubscriptionExecution7 obj) {
			return obj.getInvestmentAccountDetails();
		}

		@Override
		public void setValue(SubscriptionExecution7 obj, InvestmentAccount30 value) {
			obj.setInvestmentAccountDetails(value);
		}
	};
	@XmlElement(name = "BnfcryDtls")
	protected BeneficiaryInformation2 beneficiaryDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.BeneficiaryInformation2
	 * BeneficiaryInformation2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Person Person}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7
	 * SubscriptionExecution7}</li>
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
	 * definition} = "Additional information about the beneficial owner."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SubscriptionExecution7, Optional<BeneficiaryInformation2>> mmBeneficiaryDetails = new MMMessageAssociationEnd<SubscriptionExecution7, Optional<BeneficiaryInformation2>>() {
		{
			businessComponentTrace_lazy = () -> Person.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionExecution7.mmObject();
			isDerived = false;
			xmlTag = "BnfcryDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BeneficiaryDetails";
			definition = "Additional information about the beneficial owner.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> BeneficiaryInformation2.mmObject();
		}

		@Override
		public Optional<BeneficiaryInformation2> getValue(SubscriptionExecution7 obj) {
			return obj.getBeneficiaryDetails();
		}

		@Override
		public void setValue(SubscriptionExecution7 obj, Optional<BeneficiaryInformation2> value) {
			obj.setBeneficiaryDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "FinInstrmDtls", required = true)
	protected FinancialInstrument18 financialInstrumentDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.FinancialInstrument18
	 * FinancialInstrument18}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#mmInvestmentFundClass
	 * InvestmentFundTransaction.mmInvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7
	 * SubscriptionExecution7}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SubscriptionExecution7, FinancialInstrument18> mmFinancialInstrumentDetails = new MMMessageAssociationEnd<SubscriptionExecution7, FinancialInstrument18>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundTransaction.mmInvestmentFundClass;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionExecution7.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentDetails";
			definition = "Investment fund class to which an investment fund order execution is related.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> FinancialInstrument18.mmObject();
		}

		@Override
		public FinancialInstrument18 getValue(SubscriptionExecution7 obj) {
			return obj.getFinancialInstrumentDetails();
		}

		@Override
		public void setValue(SubscriptionExecution7 obj, FinancialInstrument18 value) {
			obj.setFinancialInstrumentDetails(value);
		}
	};
	@XmlElement(name = "OrdrdAmt")
	protected ActiveCurrencyAndAmount orderedAmount;
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmOrderedAmount
	 * SecuritiesOrder.mmOrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7
	 * SubscriptionExecution7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrdrdAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of money instructed for the subscription."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SubscriptionExecution7, Optional<ActiveCurrencyAndAmount>> mmOrderedAmount = new MMMessageAttribute<SubscriptionExecution7, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmOrderedAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionExecution7.mmObject();
			isDerived = false;
			xmlTag = "OrdrdAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderedAmount";
			definition = "Amount of money instructed for the subscription.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(SubscriptionExecution7 obj) {
			return obj.getOrderedAmount();
		}

		@Override
		public void setValue(SubscriptionExecution7 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setOrderedAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "ExctdAmt", required = true)
	protected ActiveCurrencyAndAmount executedAmount;
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmExecutedAmount
	 * InvestmentFundOrderExecution.mmExecutedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7
	 * SubscriptionExecution7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ExctdAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExecutedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of money invested in the financial instrument."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SubscriptionExecution7, ActiveCurrencyAndAmount> mmExecutedAmount = new MMMessageAttribute<SubscriptionExecution7, ActiveCurrencyAndAmount>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrderExecution.mmExecutedAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionExecution7.mmObject();
			isDerived = false;
			xmlTag = "ExctdAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExecutedAmount";
			definition = "Amount of money invested in the financial instrument.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public ActiveCurrencyAndAmount getValue(SubscriptionExecution7 obj) {
			return obj.getExecutedAmount();
		}

		@Override
		public void setValue(SubscriptionExecution7 obj, ActiveCurrencyAndAmount value) {
			obj.setExecutedAmount(value);
		}
	};
	@XmlElement(name = "UnitsNb")
	protected FinancialInstrumentQuantity1 unitsNumber;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7
	 * SubscriptionExecution7}</li>
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
	 * definition} = "Total number of units subscribed."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SubscriptionExecution7, Optional<FinancialInstrumentQuantity1>> mmUnitsNumber = new MMMessageAttribute<SubscriptionExecution7, Optional<FinancialInstrumentQuantity1>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrderExecution.mmUnitsNumber;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionExecution7.mmObject();
			isDerived = false;
			xmlTag = "UnitsNb";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":36B::CONF"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnitsNumber";
			definition = "Total number of units subscribed.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> FinancialInstrumentQuantity1.mmObject();
		}

		@Override
		public Optional<FinancialInstrumentQuantity1> getValue(SubscriptionExecution7 obj) {
			return obj.getUnitsNumber();
		}

		@Override
		public void setValue(SubscriptionExecution7 obj, Optional<FinancialInstrumentQuantity1> value) {
			obj.setUnitsNumber(value.orElse(null));
		}
	};
	@XmlElement(name = "DealgPricDtls")
	protected UnitPrice16 dealingPriceDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.UnitPrice16
	 * UnitPrice16}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmExecutedTradePrice
	 * InvestmentFundOrderExecution.mmExecutedTradePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7
	 * SubscriptionExecution7}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SubscriptionExecution7, Optional<UnitPrice16>> mmDealingPriceDetails = new MMMessageAssociationEnd<SubscriptionExecution7, Optional<UnitPrice16>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrderExecution.mmExecutedTradePrice;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionExecution7.mmObject();
			isDerived = false;
			xmlTag = "DealgPricDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DealingPriceDetails";
			definition = "Price at which the order was executed.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> UnitPrice16.mmObject();
		}

		@Override
		public Optional<UnitPrice16> getValue(SubscriptionExecution7 obj) {
			return obj.getDealingPriceDetails();
		}

		@Override
		public void setValue(SubscriptionExecution7 obj, Optional<UnitPrice16> value) {
			obj.setDealingPriceDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "InftvPricDtls")
	protected List<UnitPrice16> informativePriceDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.UnitPrice16
	 * UnitPrice16}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmInformativePrice
	 * InvestmentFundOrderExecution.mmInformativePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7
	 * SubscriptionExecution7}</li>
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
	 * "Other quoted price, other than the price at which the order was executed."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SubscriptionExecution7, List<UnitPrice16>> mmInformativePriceDetails = new MMMessageAssociationEnd<SubscriptionExecution7, List<UnitPrice16>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrderExecution.mmInformativePrice;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionExecution7.mmObject();
			isDerived = false;
			xmlTag = "InftvPricDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InformativePriceDetails";
			definition = "Other quoted price, other than the price at which the order was executed.";
			maxOccurs = 2;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> UnitPrice16.mmObject();
		}

		@Override
		public List<UnitPrice16> getValue(SubscriptionExecution7 obj) {
			return obj.getInformativePriceDetails();
		}

		@Override
		public void setValue(SubscriptionExecution7 obj, List<UnitPrice16> value) {
			obj.setInformativePriceDetails(value);
		}
	};
	@XmlElement(name = "SdPcktDtls")
	protected SidePocketInformation2 sidePocketDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SidePocketInformation2
	 * SidePocketInformation2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#mmSidePocket
	 * InvestmentAccount.mmSidePocket}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7
	 * SubscriptionExecution7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SdPcktDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SidePocketDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information related to the side pocket component of the investment fund order."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SubscriptionExecution7, Optional<SidePocketInformation2>> mmSidePocketDetails = new MMMessageAssociationEnd<SubscriptionExecution7, Optional<SidePocketInformation2>>() {
		{
			businessElementTrace_lazy = () -> InvestmentAccount.mmSidePocket;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionExecution7.mmObject();
			isDerived = false;
			xmlTag = "SdPcktDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SidePocketDetails";
			definition = "Information related to the side pocket component of the investment fund order.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SidePocketInformation2.mmObject();
		}

		@Override
		public Optional<SidePocketInformation2> getValue(SubscriptionExecution7 obj) {
			return obj.getSidePocketDetails();
		}

		@Override
		public void setValue(SubscriptionExecution7 obj, Optional<SidePocketInformation2> value) {
			obj.setSidePocketDetails(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7
	 * SubscriptionExecution7}</li>
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
	 * "Date and time at which a price is applied, according to the terms stated in the prospectus. This is also known as deal date."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SubscriptionExecution7, DateAndDateTimeChoice> mmTradeDateTime = new MMMessageAttribute<SubscriptionExecution7, DateAndDateTimeChoice>() {
		{
			businessElementTrace_lazy = () -> Trade.mmTradeDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionExecution7.mmObject();
			isDerived = false;
			xmlTag = "TradDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDateTime";
			definition = "Date and time at which a price is applied, according to the terms stated in the prospectus. This is also known as deal date.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DateAndDateTimeChoice.mmObject();
		}

		@Override
		public DateAndDateTimeChoice getValue(SubscriptionExecution7 obj) {
			return obj.getTradeDateTime();
		}

		@Override
		public void setValue(SubscriptionExecution7 obj, DateAndDateTimeChoice value) {
			obj.setTradeDateTime(value);
		}
	};
	@XmlElement(name = "NAVDt", required = true)
	protected ISODate nAVDate;
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
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#mmValuationDateTime
	 * NetAssetValueCalculation.mmValuationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7
	 * SubscriptionExecution7}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute<SubscriptionExecution7, ISODate> mmNAVDate = new MMMessageAttribute<SubscriptionExecution7, ISODate>() {
		{
			businessElementTrace_lazy = () -> NetAssetValueCalculation.mmValuationDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionExecution7.mmObject();
			isDerived = false;
			xmlTag = "NAVDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NAVDate";
			definition = "Valuation point, or valuation date of the portfolio (underlying assets). This is also known as price date.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public ISODate getValue(SubscriptionExecution7 obj) {
			return obj.getNAVDate();
		}

		@Override
		public void setValue(SubscriptionExecution7 obj, ISODate value) {
			obj.setNAVDate(value);
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
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7
	 * SubscriptionExecution7}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute<SubscriptionExecution7, Optional<ISODate>> mmCashSettlementDate = new MMMessageAttribute<SubscriptionExecution7, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> Payment.mmValueDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionExecution7.mmObject();
			isDerived = false;
			xmlTag = "CshSttlmDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashSettlementDate";
			definition = "Date on which cash is available.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(SubscriptionExecution7 obj) {
			return obj.getCashSettlementDate();
		}

		@Override
		public void setValue(SubscriptionExecution7 obj, Optional<ISODate> value) {
			obj.setCashSettlementDate(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7
	 * SubscriptionExecution7}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute<SubscriptionExecution7, Optional<ActiveCurrencyCode>> mmRequestedSettlementCurrency = new MMMessageAttribute<SubscriptionExecution7, Optional<ActiveCurrencyCode>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrder.mmRequestedSettlementCurrency;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionExecution7.mmObject();
			isDerived = false;
			xmlTag = "ReqdSttlmCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedSettlementCurrency";
			definition = "Currency requested for settlement of cash proceeds.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyCode.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyCode> getValue(SubscriptionExecution7 obj) {
			return obj.getRequestedSettlementCurrency();
		}

		@Override
		public void setValue(SubscriptionExecution7 obj, Optional<ActiveCurrencyCode> value) {
			obj.setRequestedSettlementCurrency(value.orElse(null));
		}
	};
	@XmlElement(name = "PmtRef")
	protected Max35Text paymentReference;
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
	 * {@linkplain com.tools20022.repository.entity.PaymentIdentification#mmEndToEndIdentification
	 * PaymentIdentification.mmEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7
	 * SubscriptionExecution7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier for a payment transaction, as assigned by the originator. The payment transaction reference is used for reconciliation or to link tasks relating to the payment transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SubscriptionExecution7, Optional<Max35Text>> mmPaymentReference = new MMMessageAttribute<SubscriptionExecution7, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> PaymentIdentification.mmEndToEndIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionExecution7.mmObject();
			isDerived = false;
			xmlTag = "PmtRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentReference";
			definition = "Unique and unambiguous identifier for a payment transaction, as assigned by the originator. The payment transaction reference is used for reconciliation or to link tasks relating to the payment transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(SubscriptionExecution7 obj) {
			return obj.getPaymentReference();
		}

		@Override
		public void setValue(SubscriptionExecution7 obj, Optional<Max35Text> value) {
			obj.setPaymentReference(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7
	 * SubscriptionExecution7}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute<SubscriptionExecution7, Optional<Max35Text>> mmLetterIntentReference = new MMMessageAttribute<SubscriptionExecution7, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> InvestmentAccount.mmInvestmentAccountContract;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionExecution7.mmObject();
			isDerived = false;
			xmlTag = "LttrInttRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LetterIntentReference";
			definition = "Reference of a letter of intent program, in which sales commissions are reduced based on the aggregate of a customer's actual purchase and anticipated purchases, over a specific period of time, and as agreed by the customer. A letter of intent program is mainly used in the US market.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(SubscriptionExecution7 obj) {
			return obj.getLetterIntentReference();
		}

		@Override
		public void setValue(SubscriptionExecution7 obj, Optional<Max35Text> value) {
			obj.setLetterIntentReference(value.orElse(null));
		}
	};
	@XmlElement(name = "FrgnXchgDtls")
	protected List<ForeignExchangeTerms7> foreignExchangeDetails;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7
	 * SubscriptionExecution7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FrgnXchgDtls"</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SubscriptionExecution7, List<ForeignExchangeTerms7>> mmForeignExchangeDetails = new MMMessageAssociationEnd<SubscriptionExecution7, List<ForeignExchangeTerms7>>() {
		{
			businessElementTrace_lazy = () -> ForeignExchangeTrade.mmAgreedRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionExecution7.mmObject();
			isDerived = false;
			xmlTag = "FrgnXchgDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignExchangeDetails";
			definition = "Information needed to process a currency exchange or conversion.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ForeignExchangeTerms7.mmObject();
		}

		@Override
		public List<ForeignExchangeTerms7> getValue(SubscriptionExecution7 obj) {
			return obj.getForeignExchangeDetails();
		}

		@Override
		public void setValue(SubscriptionExecution7 obj, List<ForeignExchangeTerms7> value) {
			obj.setForeignExchangeDetails(value);
		}
	};
	@XmlElement(name = "TtlChrgs")
	protected TotalCharges4 totalCharges;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TotalCharges4
	 * TotalCharges4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#mmTransactionCharge
	 * InvestmentFundTransaction.mmTransactionCharge}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7
	 * SubscriptionExecution7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlChrgs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalCharges"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of money associated with a service."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SubscriptionExecution7, Optional<TotalCharges4>> mmTotalCharges = new MMMessageAssociationEnd<SubscriptionExecution7, Optional<TotalCharges4>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundTransaction.mmTransactionCharge;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionExecution7.mmObject();
			isDerived = false;
			xmlTag = "TtlChrgs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalCharges";
			definition = "Amount of money associated with a service.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TotalCharges4.mmObject();
		}

		@Override
		public Optional<TotalCharges4> getValue(SubscriptionExecution7 obj) {
			return obj.getTotalCharges();
		}

		@Override
		public void setValue(SubscriptionExecution7 obj, Optional<TotalCharges4> value) {
			obj.setTotalCharges(value.orElse(null));
		}
	};
	@XmlElement(name = "TaxGnlDtls")
	protected TotalTaxes4 taxGeneralDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TotalTaxes4
	 * TotalTaxes4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#mmTransactionTax
	 * InvestmentFundTransaction.mmTransactionTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7
	 * SubscriptionExecution7}</li>
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
	public static final MMMessageAssociationEnd<SubscriptionExecution7, Optional<TotalTaxes4>> mmTaxGeneralDetails = new MMMessageAssociationEnd<SubscriptionExecution7, Optional<TotalTaxes4>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundTransaction.mmTransactionTax;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionExecution7.mmObject();
			isDerived = false;
			xmlTag = "TaxGnlDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxGeneralDetails";
			definition = "Tax related to an investment fund order.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TotalTaxes4.mmObject();
		}

		@Override
		public Optional<TotalTaxes4> getValue(SubscriptionExecution7 obj) {
			return obj.getTaxGeneralDetails();
		}

		@Override
		public void setValue(SubscriptionExecution7 obj, Optional<TotalTaxes4> value) {
			obj.setTaxGeneralDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "Equlstn")
	protected Equalisation2 equalisation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Equalisation2
	 * Equalisation2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmEqualisation
	 * InvestmentFundClass.mmEqualisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7
	 * SubscriptionExecution7}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SubscriptionExecution7, Optional<Equalisation2>> mmEqualisation = new MMMessageAssociationEnd<SubscriptionExecution7, Optional<Equalisation2>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundClass.mmEqualisation;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionExecution7.mmObject();
			isDerived = false;
			xmlTag = "Equlstn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Equalisation";
			definition = "Part of an investor's subscription amount that is held by the fund in order to pay incentive / performance fees at the end of the fiscal year.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Equalisation2.mmObject();
		}

		@Override
		public Optional<Equalisation2> getValue(SubscriptionExecution7 obj) {
			return obj.getEqualisation();
		}

		@Override
		public void setValue(SubscriptionExecution7 obj, Optional<Equalisation2> value) {
			obj.setEqualisation(value.orElse(null));
		}
	};
	@XmlElement(name = "IntrmPrftAmt")
	protected ProfitAndLoss1Choice interimProfitAmount;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7
	 * SubscriptionExecution7}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute<SubscriptionExecution7, Optional<ProfitAndLoss1Choice>> mmInterimProfitAmount = new MMMessageAttribute<SubscriptionExecution7, Optional<ProfitAndLoss1Choice>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrderExecution.mmInterimProfitAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionExecution7.mmObject();
			isDerived = false;
			xmlTag = "IntrmPrftAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterimProfitAmount";
			definition = "Part of the price deemed as accrued income or profit rather than capital. The interim profit amount is used for tax purposes.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ProfitAndLoss1Choice.mmObject();
		}

		@Override
		public Optional<ProfitAndLoss1Choice> getValue(SubscriptionExecution7 obj) {
			return obj.getInterimProfitAmount();
		}

		@Override
		public void setValue(SubscriptionExecution7 obj, Optional<ProfitAndLoss1Choice> value) {
			obj.setInterimProfitAmount(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7
	 * SubscriptionExecution7}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute<SubscriptionExecution7, Optional<ActiveCurrencyAndAmount>> mmRefund = new MMMessageAttribute<SubscriptionExecution7, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> SubscriptionExecution.mmRefund;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionExecution7.mmObject();
			isDerived = false;
			xmlTag = "Rfnd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Refund";
			definition = "Return of cash that has been overpaid for a subscription.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(SubscriptionExecution7 obj) {
			return obj.getRefund();
		}

		@Override
		public void setValue(SubscriptionExecution7 obj, Optional<ActiveCurrencyAndAmount> value) {
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
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7
	 * SubscriptionExecution7}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute<SubscriptionExecution7, Optional<ActiveCurrencyAndAmount>> mmSubscriptionInterest = new MMMessageAttribute<SubscriptionExecution7, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> SubscriptionExecution.mmSubscriptionInterest;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionExecution7.mmObject();
			isDerived = false;
			xmlTag = "SbcptIntrst";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubscriptionInterest";
			definition = "Interest received when a subscription amount is paid in advance and then invested by the fund.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(SubscriptionExecution7 obj) {
			return obj.getSubscriptionInterest();
		}

		@Override
		public void setValue(SubscriptionExecution7 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setSubscriptionInterest(value.orElse(null));
		}
	};
	@XmlElement(name = "PrtlyExctdInd")
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
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7
	 * SubscriptionExecution7}</li>
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
	 * "Indicates whether the order has been partially executed, ie, the confirmed quantity does not match the ordered quantity for the financial instrument."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SubscriptionExecution7, Optional<YesNoIndicator>> mmPartiallyExecutedIndicator = new MMMessageAttribute<SubscriptionExecution7, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrderExecution.mmPartiallyExecutedIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionExecution7.mmObject();
			isDerived = false;
			xmlTag = "PrtlyExctdInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartiallyExecutedIndicator";
			definition = "Indicates whether the order has been partially executed, ie, the confirmed quantity does not match the ordered quantity for the financial instrument.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(SubscriptionExecution7 obj) {
			return obj.getPartiallyExecutedIndicator();
		}

		@Override
		public void setValue(SubscriptionExecution7 obj, Optional<YesNoIndicator> value) {
			obj.setPartiallyExecutedIndicator(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7
	 * SubscriptionExecution7}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute<SubscriptionExecution7, Optional<PercentageRate>> mmPartialSettlementOfUnits = new MMMessageAttribute<SubscriptionExecution7, Optional<PercentageRate>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrderExecution.mmPartialSettlementOfUnits;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionExecution7.mmObject();
			isDerived = false;
			xmlTag = "PrtlSttlmOfUnits";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialSettlementOfUnits";
			definition = "Percentage of units partially settled.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public Optional<PercentageRate> getValue(SubscriptionExecution7 obj) {
			return obj.getPartialSettlementOfUnits();
		}

		@Override
		public void setValue(SubscriptionExecution7 obj, Optional<PercentageRate> value) {
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
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7
	 * SubscriptionExecution7}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute<SubscriptionExecution7, Optional<PercentageRate>> mmPartialSettlementOfCash = new MMMessageAttribute<SubscriptionExecution7, Optional<PercentageRate>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrderExecution.mmPartialSettlementOfCash;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionExecution7.mmObject();
			isDerived = false;
			xmlTag = "PrtlSttlmOfCsh";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialSettlementOfCash";
			definition = "Percentage of cash partially settled.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public Optional<PercentageRate> getValue(SubscriptionExecution7 obj) {
			return obj.getPartialSettlementOfCash();
		}

		@Override
		public void setValue(SubscriptionExecution7 obj, Optional<PercentageRate> value) {
			obj.setPartialSettlementOfCash(value.orElse(null));
		}
	};
	@XmlElement(name = "RltdPtyDtls")
	protected List<Intermediary16> relatedPartyDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Intermediary16
	 * Intermediary16}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Trade#mmTradePartyRole
	 * Trade.mmTradePartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7
	 * SubscriptionExecution7}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SubscriptionExecution7, List<Intermediary16>> mmRelatedPartyDetails = new MMMessageAssociationEnd<SubscriptionExecution7, List<Intermediary16>>() {
		{
			businessElementTrace_lazy = () -> Trade.mmTradePartyRole;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionExecution7.mmObject();
			isDerived = false;
			xmlTag = "RltdPtyDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedPartyDetails";
			definition = "Information about parties related to the transaction.";
			maxOccurs = 10;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Intermediary16.mmObject();
		}

		@Override
		public List<Intermediary16> getValue(SubscriptionExecution7 obj) {
			return obj.getRelatedPartyDetails();
		}

		@Override
		public void setValue(SubscriptionExecution7 obj, List<Intermediary16> value) {
			obj.setRelatedPartyDetails(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SubscriptionExecution7.mmMasterReference, com.tools20022.repository.msg.SubscriptionExecution7.mmOrderReference,
						com.tools20022.repository.msg.SubscriptionExecution7.mmClientReference, com.tools20022.repository.msg.SubscriptionExecution7.mmDealReference,
						com.tools20022.repository.msg.SubscriptionExecution7.mmRequestedTradeDate, com.tools20022.repository.msg.SubscriptionExecution7.mmHedgeFundOrderType,
						com.tools20022.repository.msg.SubscriptionExecution7.mmInvestmentAccountDetails, com.tools20022.repository.msg.SubscriptionExecution7.mmBeneficiaryDetails,
						com.tools20022.repository.msg.SubscriptionExecution7.mmFinancialInstrumentDetails, com.tools20022.repository.msg.SubscriptionExecution7.mmOrderedAmount,
						com.tools20022.repository.msg.SubscriptionExecution7.mmExecutedAmount, com.tools20022.repository.msg.SubscriptionExecution7.mmUnitsNumber, com.tools20022.repository.msg.SubscriptionExecution7.mmDealingPriceDetails,
						com.tools20022.repository.msg.SubscriptionExecution7.mmInformativePriceDetails, com.tools20022.repository.msg.SubscriptionExecution7.mmSidePocketDetails,
						com.tools20022.repository.msg.SubscriptionExecution7.mmTradeDateTime, com.tools20022.repository.msg.SubscriptionExecution7.mmNAVDate, com.tools20022.repository.msg.SubscriptionExecution7.mmCashSettlementDate,
						com.tools20022.repository.msg.SubscriptionExecution7.mmRequestedSettlementCurrency, com.tools20022.repository.msg.SubscriptionExecution7.mmPaymentReference,
						com.tools20022.repository.msg.SubscriptionExecution7.mmLetterIntentReference, com.tools20022.repository.msg.SubscriptionExecution7.mmForeignExchangeDetails,
						com.tools20022.repository.msg.SubscriptionExecution7.mmTotalCharges, com.tools20022.repository.msg.SubscriptionExecution7.mmTaxGeneralDetails, com.tools20022.repository.msg.SubscriptionExecution7.mmEqualisation,
						com.tools20022.repository.msg.SubscriptionExecution7.mmInterimProfitAmount, com.tools20022.repository.msg.SubscriptionExecution7.mmRefund, com.tools20022.repository.msg.SubscriptionExecution7.mmSubscriptionInterest,
						com.tools20022.repository.msg.SubscriptionExecution7.mmPartiallyExecutedIndicator, com.tools20022.repository.msg.SubscriptionExecution7.mmPartialSettlementOfUnits,
						com.tools20022.repository.msg.SubscriptionExecution7.mmPartialSettlementOfCash, com.tools20022.repository.msg.SubscriptionExecution7.mmRelatedPartyDetails);
				trace_lazy = () -> SubscriptionExecution.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintUnitizedRule.forSubscriptionExecution7, com.tools20022.repository.constraints.ConstraintSidePocketOrderRule.forSubscriptionExecution7);
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "SubscriptionExecution7";
				definition = "Execution of a subscription order.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max35Text> getMasterReference() {
		return masterReference == null ? Optional.empty() : Optional.of(masterReference);
	}

	public SubscriptionExecution7 setMasterReference(Max35Text masterReference) {
		this.masterReference = masterReference;
		return this;
	}

	public Max35Text getOrderReference() {
		return orderReference;
	}

	public SubscriptionExecution7 setOrderReference(Max35Text orderReference) {
		this.orderReference = Objects.requireNonNull(orderReference);
		return this;
	}

	public Optional<Max35Text> getClientReference() {
		return clientReference == null ? Optional.empty() : Optional.of(clientReference);
	}

	public SubscriptionExecution7 setClientReference(Max35Text clientReference) {
		this.clientReference = clientReference;
		return this;
	}

	public Max35Text getDealReference() {
		return dealReference;
	}

	public SubscriptionExecution7 setDealReference(Max35Text dealReference) {
		this.dealReference = Objects.requireNonNull(dealReference);
		return this;
	}

	public Optional<ISODate> getRequestedTradeDate() {
		return requestedTradeDate == null ? Optional.empty() : Optional.of(requestedTradeDate);
	}

	public SubscriptionExecution7 setRequestedTradeDate(ISODate requestedTradeDate) {
		this.requestedTradeDate = requestedTradeDate;
		return this;
	}

	public List<HedgeFundOrderType1Code> getHedgeFundOrderType() {
		return hedgeFundOrderType == null ? hedgeFundOrderType = new ArrayList<>() : hedgeFundOrderType;
	}

	public SubscriptionExecution7 setHedgeFundOrderType(List<HedgeFundOrderType1Code> hedgeFundOrderType) {
		this.hedgeFundOrderType = Objects.requireNonNull(hedgeFundOrderType);
		return this;
	}

	public InvestmentAccount30 getInvestmentAccountDetails() {
		return investmentAccountDetails;
	}

	public SubscriptionExecution7 setInvestmentAccountDetails(InvestmentAccount30 investmentAccountDetails) {
		this.investmentAccountDetails = Objects.requireNonNull(investmentAccountDetails);
		return this;
	}

	public Optional<BeneficiaryInformation2> getBeneficiaryDetails() {
		return beneficiaryDetails == null ? Optional.empty() : Optional.of(beneficiaryDetails);
	}

	public SubscriptionExecution7 setBeneficiaryDetails(BeneficiaryInformation2 beneficiaryDetails) {
		this.beneficiaryDetails = beneficiaryDetails;
		return this;
	}

	public FinancialInstrument18 getFinancialInstrumentDetails() {
		return financialInstrumentDetails;
	}

	public SubscriptionExecution7 setFinancialInstrumentDetails(FinancialInstrument18 financialInstrumentDetails) {
		this.financialInstrumentDetails = Objects.requireNonNull(financialInstrumentDetails);
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getOrderedAmount() {
		return orderedAmount == null ? Optional.empty() : Optional.of(orderedAmount);
	}

	public SubscriptionExecution7 setOrderedAmount(ActiveCurrencyAndAmount orderedAmount) {
		this.orderedAmount = orderedAmount;
		return this;
	}

	public ActiveCurrencyAndAmount getExecutedAmount() {
		return executedAmount;
	}

	public SubscriptionExecution7 setExecutedAmount(ActiveCurrencyAndAmount executedAmount) {
		this.executedAmount = Objects.requireNonNull(executedAmount);
		return this;
	}

	public Optional<FinancialInstrumentQuantity1> getUnitsNumber() {
		return unitsNumber == null ? Optional.empty() : Optional.of(unitsNumber);
	}

	public SubscriptionExecution7 setUnitsNumber(FinancialInstrumentQuantity1 unitsNumber) {
		this.unitsNumber = unitsNumber;
		return this;
	}

	public Optional<UnitPrice16> getDealingPriceDetails() {
		return dealingPriceDetails == null ? Optional.empty() : Optional.of(dealingPriceDetails);
	}

	public SubscriptionExecution7 setDealingPriceDetails(UnitPrice16 dealingPriceDetails) {
		this.dealingPriceDetails = dealingPriceDetails;
		return this;
	}

	public List<UnitPrice16> getInformativePriceDetails() {
		return informativePriceDetails == null ? informativePriceDetails = new ArrayList<>() : informativePriceDetails;
	}

	public SubscriptionExecution7 setInformativePriceDetails(List<UnitPrice16> informativePriceDetails) {
		this.informativePriceDetails = Objects.requireNonNull(informativePriceDetails);
		return this;
	}

	public Optional<SidePocketInformation2> getSidePocketDetails() {
		return sidePocketDetails == null ? Optional.empty() : Optional.of(sidePocketDetails);
	}

	public SubscriptionExecution7 setSidePocketDetails(SidePocketInformation2 sidePocketDetails) {
		this.sidePocketDetails = sidePocketDetails;
		return this;
	}

	public DateAndDateTimeChoice getTradeDateTime() {
		return tradeDateTime;
	}

	public SubscriptionExecution7 setTradeDateTime(DateAndDateTimeChoice tradeDateTime) {
		this.tradeDateTime = Objects.requireNonNull(tradeDateTime);
		return this;
	}

	public ISODate getNAVDate() {
		return nAVDate;
	}

	public SubscriptionExecution7 setNAVDate(ISODate nAVDate) {
		this.nAVDate = Objects.requireNonNull(nAVDate);
		return this;
	}

	public Optional<ISODate> getCashSettlementDate() {
		return cashSettlementDate == null ? Optional.empty() : Optional.of(cashSettlementDate);
	}

	public SubscriptionExecution7 setCashSettlementDate(ISODate cashSettlementDate) {
		this.cashSettlementDate = cashSettlementDate;
		return this;
	}

	public Optional<ActiveCurrencyCode> getRequestedSettlementCurrency() {
		return requestedSettlementCurrency == null ? Optional.empty() : Optional.of(requestedSettlementCurrency);
	}

	public SubscriptionExecution7 setRequestedSettlementCurrency(ActiveCurrencyCode requestedSettlementCurrency) {
		this.requestedSettlementCurrency = requestedSettlementCurrency;
		return this;
	}

	public Optional<Max35Text> getPaymentReference() {
		return paymentReference == null ? Optional.empty() : Optional.of(paymentReference);
	}

	public SubscriptionExecution7 setPaymentReference(Max35Text paymentReference) {
		this.paymentReference = paymentReference;
		return this;
	}

	public Optional<Max35Text> getLetterIntentReference() {
		return letterIntentReference == null ? Optional.empty() : Optional.of(letterIntentReference);
	}

	public SubscriptionExecution7 setLetterIntentReference(Max35Text letterIntentReference) {
		this.letterIntentReference = letterIntentReference;
		return this;
	}

	public List<ForeignExchangeTerms7> getForeignExchangeDetails() {
		return foreignExchangeDetails == null ? foreignExchangeDetails = new ArrayList<>() : foreignExchangeDetails;
	}

	public SubscriptionExecution7 setForeignExchangeDetails(List<ForeignExchangeTerms7> foreignExchangeDetails) {
		this.foreignExchangeDetails = Objects.requireNonNull(foreignExchangeDetails);
		return this;
	}

	public Optional<TotalCharges4> getTotalCharges() {
		return totalCharges == null ? Optional.empty() : Optional.of(totalCharges);
	}

	public SubscriptionExecution7 setTotalCharges(TotalCharges4 totalCharges) {
		this.totalCharges = totalCharges;
		return this;
	}

	public Optional<TotalTaxes4> getTaxGeneralDetails() {
		return taxGeneralDetails == null ? Optional.empty() : Optional.of(taxGeneralDetails);
	}

	public SubscriptionExecution7 setTaxGeneralDetails(TotalTaxes4 taxGeneralDetails) {
		this.taxGeneralDetails = taxGeneralDetails;
		return this;
	}

	public Optional<Equalisation2> getEqualisation() {
		return equalisation == null ? Optional.empty() : Optional.of(equalisation);
	}

	public SubscriptionExecution7 setEqualisation(Equalisation2 equalisation) {
		this.equalisation = equalisation;
		return this;
	}

	public Optional<ProfitAndLoss1Choice> getInterimProfitAmount() {
		return interimProfitAmount == null ? Optional.empty() : Optional.of(interimProfitAmount);
	}

	public SubscriptionExecution7 setInterimProfitAmount(ProfitAndLoss1Choice interimProfitAmount) {
		this.interimProfitAmount = interimProfitAmount;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getRefund() {
		return refund == null ? Optional.empty() : Optional.of(refund);
	}

	public SubscriptionExecution7 setRefund(ActiveCurrencyAndAmount refund) {
		this.refund = refund;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getSubscriptionInterest() {
		return subscriptionInterest == null ? Optional.empty() : Optional.of(subscriptionInterest);
	}

	public SubscriptionExecution7 setSubscriptionInterest(ActiveCurrencyAndAmount subscriptionInterest) {
		this.subscriptionInterest = subscriptionInterest;
		return this;
	}

	public Optional<YesNoIndicator> getPartiallyExecutedIndicator() {
		return partiallyExecutedIndicator == null ? Optional.empty() : Optional.of(partiallyExecutedIndicator);
	}

	public SubscriptionExecution7 setPartiallyExecutedIndicator(YesNoIndicator partiallyExecutedIndicator) {
		this.partiallyExecutedIndicator = partiallyExecutedIndicator;
		return this;
	}

	public Optional<PercentageRate> getPartialSettlementOfUnits() {
		return partialSettlementOfUnits == null ? Optional.empty() : Optional.of(partialSettlementOfUnits);
	}

	public SubscriptionExecution7 setPartialSettlementOfUnits(PercentageRate partialSettlementOfUnits) {
		this.partialSettlementOfUnits = partialSettlementOfUnits;
		return this;
	}

	public Optional<PercentageRate> getPartialSettlementOfCash() {
		return partialSettlementOfCash == null ? Optional.empty() : Optional.of(partialSettlementOfCash);
	}

	public SubscriptionExecution7 setPartialSettlementOfCash(PercentageRate partialSettlementOfCash) {
		this.partialSettlementOfCash = partialSettlementOfCash;
		return this;
	}

	public List<Intermediary16> getRelatedPartyDetails() {
		return relatedPartyDetails == null ? relatedPartyDetails = new ArrayList<>() : relatedPartyDetails;
	}

	public SubscriptionExecution7 setRelatedPartyDetails(List<Intermediary16> relatedPartyDetails) {
		this.relatedPartyDetails = Objects.requireNonNull(relatedPartyDetails);
		return this;
	}
}