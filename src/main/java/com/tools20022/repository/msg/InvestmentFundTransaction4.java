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
import com.tools20022.repository.choice.TransactionType1Choice;
import com.tools20022.repository.codeset.CreditDebitCode;
import com.tools20022.repository.codeset.ReversalCode;
import com.tools20022.repository.codeset.TransactionStatus1Code;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.FinancialInstrumentQuantity1;
import com.tools20022.repository.msg.UnitPrice20;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Creation/cancellation of investment units on the books of the fund or its
 * designated agent, as a result of executing an investment fund order.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction4#mmEventType
 * InvestmentFundTransaction4.mmEventType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction4#mmBookingStatus
 * InvestmentFundTransaction4.mmBookingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction4#mmMasterReference
 * InvestmentFundTransaction4.mmMasterReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction4#mmOrderReference
 * InvestmentFundTransaction4.mmOrderReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction4#mmClientReference
 * InvestmentFundTransaction4.mmClientReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction4#mmDealReference
 * InvestmentFundTransaction4.mmDealReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction4#mmLegIdentification
 * InvestmentFundTransaction4.mmLegIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction4#mmLegExecutionIdentification
 * InvestmentFundTransaction4.mmLegExecutionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction4#mmOrderDateTime
 * InvestmentFundTransaction4.mmOrderDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction4#mmSettledTransactionIndicator
 * InvestmentFundTransaction4.mmSettledTransactionIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction4#mmRegisteredTransactionIndicator
 * InvestmentFundTransaction4.mmRegisteredTransactionIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction4#mmUnitsQuantity
 * InvestmentFundTransaction4.mmUnitsQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction4#mmCreditDebit
 * InvestmentFundTransaction4.mmCreditDebit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction4#mmReversal
 * InvestmentFundTransaction4.mmReversal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction4#mmSettlementAmount
 * InvestmentFundTransaction4.mmSettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction4#mmSettlementDate
 * InvestmentFundTransaction4.mmSettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction4#mmTradeDateTime
 * InvestmentFundTransaction4.mmTradeDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction4#mmCumDividendIndicator
 * InvestmentFundTransaction4.mmCumDividendIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction4#mmPartiallyExecutedIndicator
 * InvestmentFundTransaction4.mmPartiallyExecutedIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction4#mmPriceDetails
 * InvestmentFundTransaction4.mmPriceDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction
 * InvestmentFundTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintTransactionTypeLegIdentificationRule#forInvestmentFundTransaction4
 * ConstraintTransactionTypeLegIdentificationRule.forInvestmentFundTransaction4}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintTransactionTypeLegExecutionIdentificationRule#forInvestmentFundTransaction4
 * ConstraintTransactionTypeLegExecutionIdentificationRule.
 * forInvestmentFundTransaction4}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "InvestmentFundTransaction4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Creation/cancellation of investment units on the books of the fund or its designated agent, as a result of executing an investment fund order."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction3
 * InvestmentFundTransaction3}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "InvestmentFundTransaction4", propOrder = {"eventType", "bookingStatus", "masterReference", "orderReference", "clientReference", "dealReference", "legIdentification", "legExecutionIdentification", "orderDateTime",
		"settledTransactionIndicator", "registeredTransactionIndicator", "unitsQuantity", "creditDebit", "reversal", "settlementAmount", "settlementDate", "tradeDateTime", "cumDividendIndicator", "partiallyExecutedIndicator",
		"priceDetails"})
public class InvestmentFundTransaction4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "EvtTp", required = true)
	protected TransactionType1Choice eventType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.TransactionType1Choice
	 * TransactionType1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction
	 * InvestmentFundTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction4
	 * InvestmentFundTransaction4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EvtTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Underlying transaction or corporate action."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InvestmentFundTransaction4, TransactionType1Choice> mmEventType = new MMMessageAssociationEnd<InvestmentFundTransaction4, TransactionType1Choice>() {
		{
			businessComponentTrace_lazy = () -> InvestmentFundTransaction.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentFundTransaction4.mmObject();
			isDerived = false;
			xmlTag = "EvtTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventType";
			definition = "Underlying transaction or corporate action.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> TransactionType1Choice.mmObject();
		}

		@Override
		public TransactionType1Choice getValue(InvestmentFundTransaction4 obj) {
			return obj.getEventType();
		}

		@Override
		public void setValue(InvestmentFundTransaction4 obj, TransactionType1Choice value) {
			obj.setEventType(value);
		}
	};
	@XmlElement(name = "BookgSts")
	protected TransactionStatus1Code bookingStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionStatus1Code
	 * TransactionStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#mmTransactionStatus
	 * SecuritiesTradeStatus.mmTransactionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction4
	 * InvestmentFundTransaction4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BookgSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BookingStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of an investment fund transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction3#mmBookingStatus
	 * InvestmentFundTransaction3.mmBookingStatus}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentFundTransaction4, Optional<TransactionStatus1Code>> mmBookingStatus = new MMMessageAttribute<InvestmentFundTransaction4, Optional<TransactionStatus1Code>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeStatus.mmTransactionStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentFundTransaction4.mmObject();
			isDerived = false;
			xmlTag = "BookgSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BookingStatus";
			definition = "Status of an investment fund transaction.";
			previousVersion_lazy = () -> InvestmentFundTransaction3.mmBookingStatus;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TransactionStatus1Code.mmObject();
		}

		@Override
		public Optional<TransactionStatus1Code> getValue(InvestmentFundTransaction4 obj) {
			return obj.getBookingStatus();
		}

		@Override
		public void setValue(InvestmentFundTransaction4 obj, Optional<TransactionStatus1Code> value) {
			obj.setBookingStatus(value.orElse(null));
		}
	};
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction4
	 * InvestmentFundTransaction4}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction3#mmMasterReference
	 * InvestmentFundTransaction3.mmMasterReference}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentFundTransaction4, Optional<Max35Text>> mmMasterReference = new MMMessageAttribute<InvestmentFundTransaction4, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> Order.mmMasterIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentFundTransaction4.mmObject();
			isDerived = false;
			xmlTag = "MstrRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MasterReference";
			definition = "Unique and unambiguous identifier for a group of individual orders, as assigned by the instructing party. This identifier links the individual orders together.";
			previousVersion_lazy = () -> InvestmentFundTransaction3.mmMasterReference;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(InvestmentFundTransaction4 obj) {
			return obj.getMasterReference();
		}

		@Override
		public void setValue(InvestmentFundTransaction4 obj, Optional<Max35Text> value) {
			obj.setMasterReference(value.orElse(null));
		}
	};
	@XmlElement(name = "OrdrRef")
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction4
	 * InvestmentFundTransaction4}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction3#mmOrderReference
	 * InvestmentFundTransaction3.mmOrderReference}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentFundTransaction4, Optional<Max35Text>> mmOrderReference = new MMMessageAttribute<InvestmentFundTransaction4, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentFundTransaction4.mmObject();
			isDerived = false;
			xmlTag = "OrdrRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderReference";
			definition = "Unique and unambiguous identifier for an order, as assigned by the instructing party.";
			previousVersion_lazy = () -> InvestmentFundTransaction3.mmOrderReference;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(InvestmentFundTransaction4 obj) {
			return obj.getOrderReference();
		}

		@Override
		public void setValue(InvestmentFundTransaction4 obj, Optional<Max35Text> value) {
			obj.setOrderReference(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction4
	 * InvestmentFundTransaction4}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction3#mmClientReference
	 * InvestmentFundTransaction3.mmClientReference}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentFundTransaction4, Optional<Max35Text>> mmClientReference = new MMMessageAttribute<InvestmentFundTransaction4, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundTransaction.mmClientReference;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentFundTransaction4.mmObject();
			isDerived = false;
			xmlTag = "ClntRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClientReference";
			definition = "Unique and unambiguous investor's identification of an order. This reference can typically be used in a hub scenario to give the reference of the order as assigned by the underlying client.";
			previousVersion_lazy = () -> InvestmentFundTransaction3.mmClientReference;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(InvestmentFundTransaction4 obj) {
			return obj.getClientReference();
		}

		@Override
		public void setValue(InvestmentFundTransaction4 obj, Optional<Max35Text> value) {
			obj.setClientReference(value.orElse(null));
		}
	};
	@XmlElement(name = "DealRef")
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction4
	 * InvestmentFundTransaction4}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction3#mmDealReference
	 * InvestmentFundTransaction3.mmDealReference}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentFundTransaction4, Optional<Max35Text>> mmDealReference = new MMMessageAttribute<InvestmentFundTransaction4, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrderExecution.mmDealIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentFundTransaction4.mmObject();
			isDerived = false;
			xmlTag = "DealRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DealReference";
			definition = "Unique and unambiguous identifier for an order execution, as assigned by a confirming party.";
			previousVersion_lazy = () -> InvestmentFundTransaction3.mmDealReference;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(InvestmentFundTransaction4 obj) {
			return obj.getDealReference();
		}

		@Override
		public void setValue(InvestmentFundTransaction4 obj, Optional<Max35Text> value) {
			obj.setDealReference(value.orElse(null));
		}
	};
	@XmlElement(name = "LegId")
	protected Max35Text legIdentification;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction4
	 * InvestmentFundTransaction4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LegId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LegIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique technical identifier for an instance of a leg within a switch."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction3#mmLegIdentification
	 * InvestmentFundTransaction3.mmLegIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentFundTransaction4, Optional<Max35Text>> mmLegIdentification = new MMMessageAttribute<InvestmentFundTransaction4, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentFundTransaction4.mmObject();
			isDerived = false;
			xmlTag = "LegId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegIdentification";
			definition = "Unique technical identifier for an instance of a leg within a switch.";
			previousVersion_lazy = () -> InvestmentFundTransaction3.mmLegIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(InvestmentFundTransaction4 obj) {
			return obj.getLegIdentification();
		}

		@Override
		public void setValue(InvestmentFundTransaction4 obj, Optional<Max35Text> value) {
			obj.setLegIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "LegExctnId")
	protected Max35Text legExecutionIdentification;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction4
	 * InvestmentFundTransaction4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LegExctnId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LegExecutionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identifier for an instance of a leg execution within a switch confirmation."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction3#mmLegExecutionIdentification
	 * InvestmentFundTransaction3.mmLegExecutionIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentFundTransaction4, Optional<Max35Text>> mmLegExecutionIdentification = new MMMessageAttribute<InvestmentFundTransaction4, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentFundTransaction4.mmObject();
			isDerived = false;
			xmlTag = "LegExctnId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegExecutionIdentification";
			definition = "Unique identifier for an instance of a leg execution within a switch confirmation.";
			previousVersion_lazy = () -> InvestmentFundTransaction3.mmLegExecutionIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(InvestmentFundTransaction4 obj) {
			return obj.getLegExecutionIdentification();
		}

		@Override
		public void setValue(InvestmentFundTransaction4 obj, Optional<Max35Text> value) {
			obj.setLegExecutionIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "OrdrDtTm")
	protected ISODateTime orderDateTime;
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmOrderDateTime
	 * InvestmentFundOrder.mmOrderDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction4
	 * InvestmentFundTransaction4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrdrDtTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time at which the order was placed by the investor or its agent."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction3#mmOrderDateTime
	 * InvestmentFundTransaction3.mmOrderDateTime}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentFundTransaction4, Optional<ISODateTime>> mmOrderDateTime = new MMMessageAttribute<InvestmentFundTransaction4, Optional<ISODateTime>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrder.mmOrderDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentFundTransaction4.mmObject();
			isDerived = false;
			xmlTag = "OrdrDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderDateTime";
			definition = "Date and time at which the order was placed by the investor or its agent.";
			previousVersion_lazy = () -> InvestmentFundTransaction3.mmOrderDateTime;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public Optional<ISODateTime> getValue(InvestmentFundTransaction4 obj) {
			return obj.getOrderDateTime();
		}

		@Override
		public void setValue(InvestmentFundTransaction4 obj, Optional<ISODateTime> value) {
			obj.setOrderDateTime(value.orElse(null));
		}
	};
	@XmlElement(name = "SttldTxInd", required = true)
	protected YesNoIndicator settledTransactionIndicator;
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmSettledIndicator
	 * InvestmentFundOrderExecution.mmSettledIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction4
	 * InvestmentFundTransaction4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttldTxInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettledTransactionIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the cash payment with respect to the executed order is settled."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction3#mmSettledTransactionIndicator
	 * InvestmentFundTransaction3.mmSettledTransactionIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentFundTransaction4, YesNoIndicator> mmSettledTransactionIndicator = new MMMessageAttribute<InvestmentFundTransaction4, YesNoIndicator>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrderExecution.mmSettledIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentFundTransaction4.mmObject();
			isDerived = false;
			xmlTag = "SttldTxInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettledTransactionIndicator";
			definition = "Indicates whether the cash payment with respect to the executed order is settled.";
			previousVersion_lazy = () -> InvestmentFundTransaction3.mmSettledTransactionIndicator;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(InvestmentFundTransaction4 obj) {
			return obj.getSettledTransactionIndicator();
		}

		@Override
		public void setValue(InvestmentFundTransaction4 obj, YesNoIndicator value) {
			obj.setSettledTransactionIndicator(value);
		}
	};
	@XmlElement(name = "RegdTxInd", required = true)
	protected YesNoIndicator registeredTransactionIndicator;
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmRegisteredIndicator
	 * InvestmentFundOrderExecution.mmRegisteredIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction4
	 * InvestmentFundTransaction4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RegdTxInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegisteredTransactionIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the executed order has a registered status on the books of the transfer agent."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction3#mmRegisteredTransactionIndicator
	 * InvestmentFundTransaction3.mmRegisteredTransactionIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentFundTransaction4, YesNoIndicator> mmRegisteredTransactionIndicator = new MMMessageAttribute<InvestmentFundTransaction4, YesNoIndicator>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrderExecution.mmRegisteredIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentFundTransaction4.mmObject();
			isDerived = false;
			xmlTag = "RegdTxInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegisteredTransactionIndicator";
			definition = "Indicates whether the executed order has a registered status on the books of the transfer agent.";
			previousVersion_lazy = () -> InvestmentFundTransaction3.mmRegisteredTransactionIndicator;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(InvestmentFundTransaction4 obj) {
			return obj.getRegisteredTransactionIndicator();
		}

		@Override
		public void setValue(InvestmentFundTransaction4 obj, YesNoIndicator value) {
			obj.setRegisteredTransactionIndicator(value);
		}
	};
	@XmlElement(name = "UnitsQty", required = true)
	protected FinancialInstrumentQuantity1 unitsQuantity;
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction4
	 * InvestmentFundTransaction4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UnitsQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnitsQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of investment funds units."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction3#mmUnitsQuantity
	 * InvestmentFundTransaction3.mmUnitsQuantity}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentFundTransaction4, FinancialInstrumentQuantity1> mmUnitsQuantity = new MMMessageAttribute<InvestmentFundTransaction4, FinancialInstrumentQuantity1>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrderExecution.mmUnitsNumber;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentFundTransaction4.mmObject();
			isDerived = false;
			xmlTag = "UnitsQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnitsQuantity";
			definition = "Number of investment funds units.";
			previousVersion_lazy = () -> InvestmentFundTransaction3.mmUnitsQuantity;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> FinancialInstrumentQuantity1.mmObject();
		}

		@Override
		public FinancialInstrumentQuantity1 getValue(InvestmentFundTransaction4 obj) {
			return obj.getUnitsQuantity();
		}

		@Override
		public void setValue(InvestmentFundTransaction4 obj, FinancialInstrumentQuantity1 value) {
			obj.setUnitsQuantity(value);
		}
	};
	@XmlElement(name = "CdtDbt", required = true)
	protected CreditDebitCode creditDebit;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CreditDebitCode
	 * CreditDebitCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#mmCreditDebitIndicator
	 * InvestmentFundTransaction.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction4
	 * InvestmentFundTransaction4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CdtDbt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditDebit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Direction of the transaction being reported, is, securities are received (credited) or delivered (debited)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction3#mmCreditDebit
	 * InvestmentFundTransaction3.mmCreditDebit}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentFundTransaction4, CreditDebitCode> mmCreditDebit = new MMMessageAttribute<InvestmentFundTransaction4, CreditDebitCode>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundTransaction.mmCreditDebitIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentFundTransaction4.mmObject();
			isDerived = false;
			xmlTag = "CdtDbt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditDebit";
			definition = "Direction of the transaction being reported, is, securities are received (credited) or delivered (debited).";
			previousVersion_lazy = () -> InvestmentFundTransaction3.mmCreditDebit;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CreditDebitCode.mmObject();
		}

		@Override
		public CreditDebitCode getValue(InvestmentFundTransaction4 obj) {
			return obj.getCreditDebit();
		}

		@Override
		public void setValue(InvestmentFundTransaction4 obj, CreditDebitCode value) {
			obj.setCreditDebit(value);
		}
	};
	@XmlElement(name = "Rvsl")
	protected ReversalCode reversal;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.ReversalCode
	 * ReversalCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction4
	 * InvestmentFundTransaction4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rvsl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reversal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction being reported is a reversal of previously reported transaction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction3#mmReversal
	 * InvestmentFundTransaction3.mmReversal}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentFundTransaction4, Optional<ReversalCode>> mmReversal = new MMMessageAttribute<InvestmentFundTransaction4, Optional<ReversalCode>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentFundTransaction4.mmObject();
			isDerived = false;
			xmlTag = "Rvsl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reversal";
			definition = "Transaction being reported is a reversal of previously reported transaction.";
			previousVersion_lazy = () -> InvestmentFundTransaction3.mmReversal;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ReversalCode.mmObject();
		}

		@Override
		public Optional<ReversalCode> getValue(InvestmentFundTransaction4 obj) {
			return obj.getReversal();
		}

		@Override
		public void setValue(InvestmentFundTransaction4 obj, Optional<ReversalCode> value) {
			obj.setReversal(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction4
	 * InvestmentFundTransaction4}</li>
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
	 * "Amount of money to be moved between the debtor and creditor, before deduction of charges, expressed in the currency as ordered by the initiating party."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction3#mmSettlementAmount
	 * InvestmentFundTransaction3.mmSettlementAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentFundTransaction4, Optional<ActiveCurrencyAndAmount>> mmSettlementAmount = new MMMessageAttribute<InvestmentFundTransaction4, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmSettlementAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentFundTransaction4.mmObject();
			isDerived = false;
			xmlTag = "SttlmAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementAmount";
			definition = "Amount of money to be moved between the debtor and creditor, before deduction of charges, expressed in the currency as ordered by the initiating party.";
			previousVersion_lazy = () -> InvestmentFundTransaction3.mmSettlementAmount;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(InvestmentFundTransaction4 obj) {
			return obj.getSettlementAmount();
		}

		@Override
		public void setValue(InvestmentFundTransaction4 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setSettlementAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "SttlmDt")
	protected ISODate settlementDate;
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSettlementDate
	 * SecuritiesSettlement.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction4
	 * InvestmentFundTransaction4}</li>
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
	 * "Date on which the debtor expects the amount of money to be available to the creditor."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction3#mmSettlementDate
	 * InvestmentFundTransaction3.mmSettlementDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentFundTransaction4, Optional<ISODate>> mmSettlementDate = new MMMessageAttribute<InvestmentFundTransaction4, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmSettlementDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentFundTransaction4.mmObject();
			isDerived = false;
			xmlTag = "SttlmDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDate";
			definition = "Date on which the debtor expects the amount of money to be available to the creditor.";
			previousVersion_lazy = () -> InvestmentFundTransaction3.mmSettlementDate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(InvestmentFundTransaction4 obj) {
			return obj.getSettlementDate();
		}

		@Override
		public void setValue(InvestmentFundTransaction4 obj, Optional<ISODate> value) {
			obj.setSettlementDate(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction4
	 * InvestmentFundTransaction4}</li>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction3#mmTradeDateTime
	 * InvestmentFundTransaction3.mmTradeDateTime}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentFundTransaction4, DateAndDateTimeChoice> mmTradeDateTime = new MMMessageAttribute<InvestmentFundTransaction4, DateAndDateTimeChoice>() {
		{
			businessElementTrace_lazy = () -> Trade.mmTradeDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentFundTransaction4.mmObject();
			isDerived = false;
			xmlTag = "TradDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDateTime";
			definition = "Date and time at which a price is applied, according to the terms stated in the prospectus.";
			previousVersion_lazy = () -> InvestmentFundTransaction3.mmTradeDateTime;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DateAndDateTimeChoice.mmObject();
		}

		@Override
		public DateAndDateTimeChoice getValue(InvestmentFundTransaction4 obj) {
			return obj.getTradeDateTime();
		}

		@Override
		public void setValue(InvestmentFundTransaction4 obj, DateAndDateTimeChoice value) {
			obj.setTradeDateTime(value);
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction4
	 * InvestmentFundTransaction4}</li>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction3#mmCumDividendIndicator
	 * InvestmentFundTransaction3.mmCumDividendIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentFundTransaction4, YesNoIndicator> mmCumDividendIndicator = new MMMessageAttribute<InvestmentFundTransaction4, YesNoIndicator>() {
		{
			businessElementTrace_lazy = () -> SecuritiesPricing.mmCumDividendIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentFundTransaction4.mmObject();
			isDerived = false;
			xmlTag = "CumDvddInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CumDividendIndicator";
			definition = "Indicates whether the dividend is included, that is, cum-dividend, in the executed price. When the dividend is not included, the price will be ex-dividend.";
			previousVersion_lazy = () -> InvestmentFundTransaction3.mmCumDividendIndicator;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(InvestmentFundTransaction4 obj) {
			return obj.getCumDividendIndicator();
		}

		@Override
		public void setValue(InvestmentFundTransaction4 obj, YesNoIndicator value) {
			obj.setCumDividendIndicator(value);
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction4
	 * InvestmentFundTransaction4}</li>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction3#mmPartiallyExecutedIndicator
	 * InvestmentFundTransaction3.mmPartiallyExecutedIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentFundTransaction4, YesNoIndicator> mmPartiallyExecutedIndicator = new MMMessageAttribute<InvestmentFundTransaction4, YesNoIndicator>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrderExecution.mmPartiallyExecutedIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentFundTransaction4.mmObject();
			isDerived = false;
			xmlTag = "PrtlyExctdInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartiallyExecutedIndicator";
			definition = "Indicates whether the order has been partially executed, that is, the confirmed quantity does not match the ordered quantity for a given financial instrument.";
			previousVersion_lazy = () -> InvestmentFundTransaction3.mmPartiallyExecutedIndicator;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(InvestmentFundTransaction4 obj) {
			return obj.getPartiallyExecutedIndicator();
		}

		@Override
		public void setValue(InvestmentFundTransaction4 obj, YesNoIndicator value) {
			obj.setPartiallyExecutedIndicator(value);
		}
	};
	@XmlElement(name = "PricDtls")
	protected UnitPrice20 priceDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.UnitPrice20
	 * UnitPrice20}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmExecutedTradePrice
	 * InvestmentFundOrderExecution.mmExecutedTradePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction4
	 * InvestmentFundTransaction4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PricDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Price at which the order was executed."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction3#mmPriceDetails
	 * InvestmentFundTransaction3.mmPriceDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InvestmentFundTransaction4, Optional<UnitPrice20>> mmPriceDetails = new MMMessageAssociationEnd<InvestmentFundTransaction4, Optional<UnitPrice20>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrderExecution.mmExecutedTradePrice;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentFundTransaction4.mmObject();
			isDerived = false;
			xmlTag = "PricDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceDetails";
			definition = "Price at which the order was executed.";
			previousVersion_lazy = () -> InvestmentFundTransaction3.mmPriceDetails;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> UnitPrice20.mmObject();
		}

		@Override
		public Optional<UnitPrice20> getValue(InvestmentFundTransaction4 obj) {
			return obj.getPriceDetails();
		}

		@Override
		public void setValue(InvestmentFundTransaction4 obj, Optional<UnitPrice20> value) {
			obj.setPriceDetails(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvestmentFundTransaction4.mmEventType, com.tools20022.repository.msg.InvestmentFundTransaction4.mmBookingStatus,
						com.tools20022.repository.msg.InvestmentFundTransaction4.mmMasterReference, com.tools20022.repository.msg.InvestmentFundTransaction4.mmOrderReference,
						com.tools20022.repository.msg.InvestmentFundTransaction4.mmClientReference, com.tools20022.repository.msg.InvestmentFundTransaction4.mmDealReference,
						com.tools20022.repository.msg.InvestmentFundTransaction4.mmLegIdentification, com.tools20022.repository.msg.InvestmentFundTransaction4.mmLegExecutionIdentification,
						com.tools20022.repository.msg.InvestmentFundTransaction4.mmOrderDateTime, com.tools20022.repository.msg.InvestmentFundTransaction4.mmSettledTransactionIndicator,
						com.tools20022.repository.msg.InvestmentFundTransaction4.mmRegisteredTransactionIndicator, com.tools20022.repository.msg.InvestmentFundTransaction4.mmUnitsQuantity,
						com.tools20022.repository.msg.InvestmentFundTransaction4.mmCreditDebit, com.tools20022.repository.msg.InvestmentFundTransaction4.mmReversal,
						com.tools20022.repository.msg.InvestmentFundTransaction4.mmSettlementAmount, com.tools20022.repository.msg.InvestmentFundTransaction4.mmSettlementDate,
						com.tools20022.repository.msg.InvestmentFundTransaction4.mmTradeDateTime, com.tools20022.repository.msg.InvestmentFundTransaction4.mmCumDividendIndicator,
						com.tools20022.repository.msg.InvestmentFundTransaction4.mmPartiallyExecutedIndicator, com.tools20022.repository.msg.InvestmentFundTransaction4.mmPriceDetails);
				trace_lazy = () -> InvestmentFundTransaction.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTransactionTypeLegIdentificationRule.forInvestmentFundTransaction4,
						com.tools20022.repository.constraints.ConstraintTransactionTypeLegExecutionIdentificationRule.forInvestmentFundTransaction4);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InvestmentFundTransaction4";
				definition = "Creation/cancellation of investment units on the books of the fund or its designated agent, as a result of executing an investment fund order.";
				previousVersion_lazy = () -> InvestmentFundTransaction3.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public TransactionType1Choice getEventType() {
		return eventType;
	}

	public InvestmentFundTransaction4 setEventType(TransactionType1Choice eventType) {
		this.eventType = Objects.requireNonNull(eventType);
		return this;
	}

	public Optional<TransactionStatus1Code> getBookingStatus() {
		return bookingStatus == null ? Optional.empty() : Optional.of(bookingStatus);
	}

	public InvestmentFundTransaction4 setBookingStatus(TransactionStatus1Code bookingStatus) {
		this.bookingStatus = bookingStatus;
		return this;
	}

	public Optional<Max35Text> getMasterReference() {
		return masterReference == null ? Optional.empty() : Optional.of(masterReference);
	}

	public InvestmentFundTransaction4 setMasterReference(Max35Text masterReference) {
		this.masterReference = masterReference;
		return this;
	}

	public Optional<Max35Text> getOrderReference() {
		return orderReference == null ? Optional.empty() : Optional.of(orderReference);
	}

	public InvestmentFundTransaction4 setOrderReference(Max35Text orderReference) {
		this.orderReference = orderReference;
		return this;
	}

	public Optional<Max35Text> getClientReference() {
		return clientReference == null ? Optional.empty() : Optional.of(clientReference);
	}

	public InvestmentFundTransaction4 setClientReference(Max35Text clientReference) {
		this.clientReference = clientReference;
		return this;
	}

	public Optional<Max35Text> getDealReference() {
		return dealReference == null ? Optional.empty() : Optional.of(dealReference);
	}

	public InvestmentFundTransaction4 setDealReference(Max35Text dealReference) {
		this.dealReference = dealReference;
		return this;
	}

	public Optional<Max35Text> getLegIdentification() {
		return legIdentification == null ? Optional.empty() : Optional.of(legIdentification);
	}

	public InvestmentFundTransaction4 setLegIdentification(Max35Text legIdentification) {
		this.legIdentification = legIdentification;
		return this;
	}

	public Optional<Max35Text> getLegExecutionIdentification() {
		return legExecutionIdentification == null ? Optional.empty() : Optional.of(legExecutionIdentification);
	}

	public InvestmentFundTransaction4 setLegExecutionIdentification(Max35Text legExecutionIdentification) {
		this.legExecutionIdentification = legExecutionIdentification;
		return this;
	}

	public Optional<ISODateTime> getOrderDateTime() {
		return orderDateTime == null ? Optional.empty() : Optional.of(orderDateTime);
	}

	public InvestmentFundTransaction4 setOrderDateTime(ISODateTime orderDateTime) {
		this.orderDateTime = orderDateTime;
		return this;
	}

	public YesNoIndicator getSettledTransactionIndicator() {
		return settledTransactionIndicator;
	}

	public InvestmentFundTransaction4 setSettledTransactionIndicator(YesNoIndicator settledTransactionIndicator) {
		this.settledTransactionIndicator = Objects.requireNonNull(settledTransactionIndicator);
		return this;
	}

	public YesNoIndicator getRegisteredTransactionIndicator() {
		return registeredTransactionIndicator;
	}

	public InvestmentFundTransaction4 setRegisteredTransactionIndicator(YesNoIndicator registeredTransactionIndicator) {
		this.registeredTransactionIndicator = Objects.requireNonNull(registeredTransactionIndicator);
		return this;
	}

	public FinancialInstrumentQuantity1 getUnitsQuantity() {
		return unitsQuantity;
	}

	public InvestmentFundTransaction4 setUnitsQuantity(FinancialInstrumentQuantity1 unitsQuantity) {
		this.unitsQuantity = Objects.requireNonNull(unitsQuantity);
		return this;
	}

	public CreditDebitCode getCreditDebit() {
		return creditDebit;
	}

	public InvestmentFundTransaction4 setCreditDebit(CreditDebitCode creditDebit) {
		this.creditDebit = Objects.requireNonNull(creditDebit);
		return this;
	}

	public Optional<ReversalCode> getReversal() {
		return reversal == null ? Optional.empty() : Optional.of(reversal);
	}

	public InvestmentFundTransaction4 setReversal(ReversalCode reversal) {
		this.reversal = reversal;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getSettlementAmount() {
		return settlementAmount == null ? Optional.empty() : Optional.of(settlementAmount);
	}

	public InvestmentFundTransaction4 setSettlementAmount(ActiveCurrencyAndAmount settlementAmount) {
		this.settlementAmount = settlementAmount;
		return this;
	}

	public Optional<ISODate> getSettlementDate() {
		return settlementDate == null ? Optional.empty() : Optional.of(settlementDate);
	}

	public InvestmentFundTransaction4 setSettlementDate(ISODate settlementDate) {
		this.settlementDate = settlementDate;
		return this;
	}

	public DateAndDateTimeChoice getTradeDateTime() {
		return tradeDateTime;
	}

	public InvestmentFundTransaction4 setTradeDateTime(DateAndDateTimeChoice tradeDateTime) {
		this.tradeDateTime = Objects.requireNonNull(tradeDateTime);
		return this;
	}

	public YesNoIndicator getCumDividendIndicator() {
		return cumDividendIndicator;
	}

	public InvestmentFundTransaction4 setCumDividendIndicator(YesNoIndicator cumDividendIndicator) {
		this.cumDividendIndicator = Objects.requireNonNull(cumDividendIndicator);
		return this;
	}

	public YesNoIndicator getPartiallyExecutedIndicator() {
		return partiallyExecutedIndicator;
	}

	public InvestmentFundTransaction4 setPartiallyExecutedIndicator(YesNoIndicator partiallyExecutedIndicator) {
		this.partiallyExecutedIndicator = Objects.requireNonNull(partiallyExecutedIndicator);
		return this;
	}

	public Optional<UnitPrice20> getPriceDetails() {
		return priceDetails == null ? Optional.empty() : Optional.of(priceDetails);
	}

	public InvestmentFundTransaction4 setPriceDetails(UnitPrice20 priceDetails) {
		this.priceDetails = priceDetails;
		return this;
	}
}