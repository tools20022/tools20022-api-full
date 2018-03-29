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
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.HoldBackInformation1;
import com.tools20022.repository.msg.SidePocketQuantityAndAmount1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Expected trade date and expected settlement date of the order execution.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ExpectedExecutionDetails3#mmExpectedTradeDateTime
 * ExpectedExecutionDetails3.mmExpectedTradeDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ExpectedExecutionDetails3#mmExpectedCashSettlementDate
 * ExpectedExecutionDetails3.mmExpectedCashSettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ExpectedExecutionDetails3#mmExpectedExecutedAmount
 * ExpectedExecutionDetails3.mmExpectedExecutedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ExpectedExecutionDetails3#mmPaymentInIndicator
 * ExpectedExecutionDetails3.mmPaymentInIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ExpectedExecutionDetails3#mmPaymentReference
 * ExpectedExecutionDetails3.mmPaymentReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ExpectedExecutionDetails3#mmPrepaymentDate
 * ExpectedExecutionDetails3.mmPrepaymentDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ExpectedExecutionDetails3#mmTopUpAmount
 * ExpectedExecutionDetails3.mmTopUpAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ExpectedExecutionDetails3#mmHoldBackDetails
 * ExpectedExecutionDetails3.mmHoldBackDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ExpectedExecutionDetails3#mmSidePocketQuantity
 * ExpectedExecutionDetails3.mmSidePocketQuantity}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution
 * InvestmentFundOrderExecution}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ExpectedExecutionDetails3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Expected trade date and expected settlement date of the order execution."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ExpectedExecutionDetails3", propOrder = {"expectedTradeDateTime", "expectedCashSettlementDate", "expectedExecutedAmount", "paymentInIndicator", "paymentReference", "prepaymentDate", "topUpAmount", "holdBackDetails",
		"sidePocketQuantity"})
public class ExpectedExecutionDetails3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "XpctdTradDtTm")
	protected DateAndDateTimeChoice expectedTradeDateTime;
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
	 * {@linkplain com.tools20022.repository.msg.ExpectedExecutionDetails3
	 * ExpectedExecutionDetails3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XpctdTradDtTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpectedTradeDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Expected date and time at which the price is applied, ie, the expected execution date for the order."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ExpectedExecutionDetails3, Optional<DateAndDateTimeChoice>> mmExpectedTradeDateTime = new MMMessageAttribute<ExpectedExecutionDetails3, Optional<DateAndDateTimeChoice>>() {
		{
			businessElementTrace_lazy = () -> Trade.mmTradeDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.ExpectedExecutionDetails3.mmObject();
			isDerived = false;
			xmlTag = "XpctdTradDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpectedTradeDateTime";
			definition = "Expected date and time at which the price is applied, ie, the expected execution date for the order.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateAndDateTimeChoice.mmObject();
		}

		@Override
		public Optional<DateAndDateTimeChoice> getValue(ExpectedExecutionDetails3 obj) {
			return obj.getExpectedTradeDateTime();
		}

		@Override
		public void setValue(ExpectedExecutionDetails3 obj, Optional<DateAndDateTimeChoice> value) {
			obj.setExpectedTradeDateTime(value.orElse(null));
		}
	};
	@XmlElement(name = "XpctdCshSttlmDt")
	protected ISODate expectedCashSettlementDate;
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
	 * {@linkplain com.tools20022.repository.entity.Obligation#mmRequestedSettlementDate
	 * Obligation.mmRequestedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ExpectedExecutionDetails3
	 * ExpectedExecutionDetails3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XpctdCshSttlmDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpectedCashSettlementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Expected date on which the cash will be available."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ExpectedExecutionDetails3, Optional<ISODate>> mmExpectedCashSettlementDate = new MMMessageAttribute<ExpectedExecutionDetails3, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> Obligation.mmRequestedSettlementDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.ExpectedExecutionDetails3.mmObject();
			isDerived = false;
			xmlTag = "XpctdCshSttlmDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpectedCashSettlementDate";
			definition = "Expected date on which the cash will be available.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(ExpectedExecutionDetails3 obj) {
			return obj.getExpectedCashSettlementDate();
		}

		@Override
		public void setValue(ExpectedExecutionDetails3 obj, Optional<ISODate> value) {
			obj.setExpectedCashSettlementDate(value.orElse(null));
		}
	};
	@XmlElement(name = "XpctdExctdAmt", required = true)
	protected ActiveCurrencyAndAmount expectedExecutedAmount;
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
	 * {@linkplain com.tools20022.repository.entity.Obligation#mmRequestedSettlementAmount
	 * Obligation.mmRequestedSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ExpectedExecutionDetails3
	 * ExpectedExecutionDetails3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XpctdExctdAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpectedExecutedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Expected execution amount."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ExpectedExecutionDetails3, ActiveCurrencyAndAmount> mmExpectedExecutedAmount = new MMMessageAttribute<ExpectedExecutionDetails3, ActiveCurrencyAndAmount>() {
		{
			businessElementTrace_lazy = () -> Obligation.mmRequestedSettlementAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.ExpectedExecutionDetails3.mmObject();
			isDerived = false;
			xmlTag = "XpctdExctdAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpectedExecutedAmount";
			definition = "Expected execution amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public ActiveCurrencyAndAmount getValue(ExpectedExecutionDetails3 obj) {
			return obj.getExpectedExecutedAmount();
		}

		@Override
		public void setValue(ExpectedExecutionDetails3 obj, ActiveCurrencyAndAmount value) {
			obj.setExpectedExecutedAmount(value);
		}
	};
	@XmlElement(name = "PmtInInd")
	protected YesNoIndicator paymentInIndicator;
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
	 * {@linkplain com.tools20022.repository.msg.ExpectedExecutionDetails3
	 * ExpectedExecutionDetails3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtInInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentInIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates, for the status of a subscription, whether payment has been received by the executing party."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ExpectedExecutionDetails3, Optional<YesNoIndicator>> mmPaymentInIndicator = new MMMessageAttribute<ExpectedExecutionDetails3, Optional<YesNoIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ExpectedExecutionDetails3.mmObject();
			isDerived = false;
			xmlTag = "PmtInInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentInIndicator";
			definition = "Indicates, for the status of a subscription, whether payment has been received by the executing party.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(ExpectedExecutionDetails3 obj) {
			return obj.getPaymentInIndicator();
		}

		@Override
		public void setValue(ExpectedExecutionDetails3 obj, Optional<YesNoIndicator> value) {
			obj.setPaymentInIndicator(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.ExpectedExecutionDetails3
	 * ExpectedExecutionDetails3}</li>
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
	public static final MMMessageAttribute<ExpectedExecutionDetails3, Optional<Max35Text>> mmPaymentReference = new MMMessageAttribute<ExpectedExecutionDetails3, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> PaymentIdentification.mmEndToEndIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.ExpectedExecutionDetails3.mmObject();
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
		public Optional<Max35Text> getValue(ExpectedExecutionDetails3 obj) {
			return obj.getPaymentReference();
		}

		@Override
		public void setValue(ExpectedExecutionDetails3 obj, Optional<Max35Text> value) {
			obj.setPaymentReference(value.orElse(null));
		}
	};
	@XmlElement(name = "PrepmtDt")
	protected ISODate prepaymentDate;
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
	 * {@linkplain com.tools20022.repository.entity.ObligationFulfilment#mmDate
	 * ObligationFulfilment.mmDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ExpectedExecutionDetails3
	 * ExpectedExecutionDetails3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrepmtDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PrepaymentDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date of the prepayment, if applicable."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ExpectedExecutionDetails3, Optional<ISODate>> mmPrepaymentDate = new MMMessageAttribute<ExpectedExecutionDetails3, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> ObligationFulfilment.mmDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.ExpectedExecutionDetails3.mmObject();
			isDerived = false;
			xmlTag = "PrepmtDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PrepaymentDate";
			definition = "Date of the prepayment, if applicable.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(ExpectedExecutionDetails3 obj) {
			return obj.getPrepaymentDate();
		}

		@Override
		public void setValue(ExpectedExecutionDetails3 obj, Optional<ISODate> value) {
			obj.setPrepaymentDate(value.orElse(null));
		}
	};
	@XmlElement(name = "TopUpAmt")
	protected ActiveCurrencyAndAmount topUpAmount;
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmTopUpAmount
	 * InvestmentFundClass.mmTopUpAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ExpectedExecutionDetails3
	 * ExpectedExecutionDetails3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TopUpAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TopUpAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional amount of money (top-up amount) required to meet the minimum subscription amount."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ExpectedExecutionDetails3, Optional<ActiveCurrencyAndAmount>> mmTopUpAmount = new MMMessageAttribute<ExpectedExecutionDetails3, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundClass.mmTopUpAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.ExpectedExecutionDetails3.mmObject();
			isDerived = false;
			xmlTag = "TopUpAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TopUpAmount";
			definition = "Additional amount of money (top-up amount) required to meet the minimum subscription amount.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(ExpectedExecutionDetails3 obj) {
			return obj.getTopUpAmount();
		}

		@Override
		public void setValue(ExpectedExecutionDetails3 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setTopUpAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "HldBckDtls")
	protected HoldBackInformation1 holdBackDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.HoldBackInformation1
	 * HoldBackInformation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#mmInvestmentFundClass
	 * InvestmentFundTransaction.mmInvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ExpectedExecutionDetails3
	 * ExpectedExecutionDetails3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "HldBckDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HoldBackDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information about hold back of redemption proceeds."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ExpectedExecutionDetails3, Optional<HoldBackInformation1>> mmHoldBackDetails = new MMMessageAssociationEnd<ExpectedExecutionDetails3, Optional<HoldBackInformation1>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundTransaction.mmInvestmentFundClass;
			componentContext_lazy = () -> com.tools20022.repository.msg.ExpectedExecutionDetails3.mmObject();
			isDerived = false;
			xmlTag = "HldBckDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HoldBackDetails";
			definition = "Information about hold back of redemption proceeds.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> HoldBackInformation1.mmObject();
		}

		@Override
		public Optional<HoldBackInformation1> getValue(ExpectedExecutionDetails3 obj) {
			return obj.getHoldBackDetails();
		}

		@Override
		public void setValue(ExpectedExecutionDetails3 obj, Optional<HoldBackInformation1> value) {
			obj.setHoldBackDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "SdPcktQty")
	protected SidePocketQuantityAndAmount1 sidePocketQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SidePocketQuantityAndAmount1
	 * SidePocketQuantityAndAmount1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmSidePocket
	 * SecuritiesQuantity.mmSidePocket}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ExpectedExecutionDetails3
	 * ExpectedExecutionDetails3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SdPcktQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SidePocketQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quantity of the side pocket."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ExpectedExecutionDetails3, Optional<SidePocketQuantityAndAmount1>> mmSidePocketQuantity = new MMMessageAssociationEnd<ExpectedExecutionDetails3, Optional<SidePocketQuantityAndAmount1>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesQuantity.mmSidePocket;
			componentContext_lazy = () -> com.tools20022.repository.msg.ExpectedExecutionDetails3.mmObject();
			isDerived = false;
			xmlTag = "SdPcktQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SidePocketQuantity";
			definition = "Quantity of the side pocket.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SidePocketQuantityAndAmount1.mmObject();
		}

		@Override
		public Optional<SidePocketQuantityAndAmount1> getValue(ExpectedExecutionDetails3 obj) {
			return obj.getSidePocketQuantity();
		}

		@Override
		public void setValue(ExpectedExecutionDetails3 obj, Optional<SidePocketQuantityAndAmount1> value) {
			obj.setSidePocketQuantity(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ExpectedExecutionDetails3.mmExpectedTradeDateTime, com.tools20022.repository.msg.ExpectedExecutionDetails3.mmExpectedCashSettlementDate,
						com.tools20022.repository.msg.ExpectedExecutionDetails3.mmExpectedExecutedAmount, com.tools20022.repository.msg.ExpectedExecutionDetails3.mmPaymentInIndicator,
						com.tools20022.repository.msg.ExpectedExecutionDetails3.mmPaymentReference, com.tools20022.repository.msg.ExpectedExecutionDetails3.mmPrepaymentDate,
						com.tools20022.repository.msg.ExpectedExecutionDetails3.mmTopUpAmount, com.tools20022.repository.msg.ExpectedExecutionDetails3.mmHoldBackDetails,
						com.tools20022.repository.msg.ExpectedExecutionDetails3.mmSidePocketQuantity);
				trace_lazy = () -> InvestmentFundOrderExecution.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "ExpectedExecutionDetails3";
				definition = "Expected trade date and expected settlement date of the order execution.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<DateAndDateTimeChoice> getExpectedTradeDateTime() {
		return expectedTradeDateTime == null ? Optional.empty() : Optional.of(expectedTradeDateTime);
	}

	public ExpectedExecutionDetails3 setExpectedTradeDateTime(DateAndDateTimeChoice expectedTradeDateTime) {
		this.expectedTradeDateTime = expectedTradeDateTime;
		return this;
	}

	public Optional<ISODate> getExpectedCashSettlementDate() {
		return expectedCashSettlementDate == null ? Optional.empty() : Optional.of(expectedCashSettlementDate);
	}

	public ExpectedExecutionDetails3 setExpectedCashSettlementDate(ISODate expectedCashSettlementDate) {
		this.expectedCashSettlementDate = expectedCashSettlementDate;
		return this;
	}

	public ActiveCurrencyAndAmount getExpectedExecutedAmount() {
		return expectedExecutedAmount;
	}

	public ExpectedExecutionDetails3 setExpectedExecutedAmount(ActiveCurrencyAndAmount expectedExecutedAmount) {
		this.expectedExecutedAmount = Objects.requireNonNull(expectedExecutedAmount);
		return this;
	}

	public Optional<YesNoIndicator> getPaymentInIndicator() {
		return paymentInIndicator == null ? Optional.empty() : Optional.of(paymentInIndicator);
	}

	public ExpectedExecutionDetails3 setPaymentInIndicator(YesNoIndicator paymentInIndicator) {
		this.paymentInIndicator = paymentInIndicator;
		return this;
	}

	public Optional<Max35Text> getPaymentReference() {
		return paymentReference == null ? Optional.empty() : Optional.of(paymentReference);
	}

	public ExpectedExecutionDetails3 setPaymentReference(Max35Text paymentReference) {
		this.paymentReference = paymentReference;
		return this;
	}

	public Optional<ISODate> getPrepaymentDate() {
		return prepaymentDate == null ? Optional.empty() : Optional.of(prepaymentDate);
	}

	public ExpectedExecutionDetails3 setPrepaymentDate(ISODate prepaymentDate) {
		this.prepaymentDate = prepaymentDate;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getTopUpAmount() {
		return topUpAmount == null ? Optional.empty() : Optional.of(topUpAmount);
	}

	public ExpectedExecutionDetails3 setTopUpAmount(ActiveCurrencyAndAmount topUpAmount) {
		this.topUpAmount = topUpAmount;
		return this;
	}

	public Optional<HoldBackInformation1> getHoldBackDetails() {
		return holdBackDetails == null ? Optional.empty() : Optional.of(holdBackDetails);
	}

	public ExpectedExecutionDetails3 setHoldBackDetails(HoldBackInformation1 holdBackDetails) {
		this.holdBackDetails = holdBackDetails;
		return this;
	}

	public Optional<SidePocketQuantityAndAmount1> getSidePocketQuantity() {
		return sidePocketQuantity == null ? Optional.empty() : Optional.of(sidePocketQuantity);
	}

	public ExpectedExecutionDetails3 setSidePocketQuantity(SidePocketQuantityAndAmount1 sidePocketQuantity) {
		this.sidePocketQuantity = sidePocketQuantity;
		return this;
	}
}