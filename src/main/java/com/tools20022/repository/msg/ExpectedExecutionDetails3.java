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
import com.tools20022.repository.choice.DateAndDateTimeChoice;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.InvestmentFundOrderExecution;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
public class ExpectedExecutionDetails3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected DateAndDateTimeChoice expectedTradeDateTime;
	/**
	 * Expected date and time at which the price is applied, ie, the expected
	 * execution date for the order.
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
	public static final MMMessageAttribute mmExpectedTradeDateTime = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Trade.mmTradeDateTime;
			componentContext_lazy = () -> ExpectedExecutionDetails3.mmObject();
			isDerived = false;
			xmlTag = "XpctdTradDtTm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpectedTradeDateTime";
			definition = "Expected date and time at which the price is applied, ie, the expected execution date for the order.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateAndDateTimeChoice.mmObject();
		}
	};
	protected ISODate expectedCashSettlementDate;
	/**
	 * Expected date on which the cash will be available.
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
	public static final MMMessageAttribute mmExpectedCashSettlementDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Obligation.mmRequestedSettlementDate;
			componentContext_lazy = () -> ExpectedExecutionDetails3.mmObject();
			isDerived = false;
			xmlTag = "XpctdCshSttlmDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpectedCashSettlementDate";
			definition = "Expected date on which the cash will be available.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount expectedExecutedAmount;
	/**
	 * Expected execution amount.
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
	public static final MMMessageAttribute mmExpectedExecutedAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Obligation.mmRequestedSettlementAmount;
			componentContext_lazy = () -> ExpectedExecutionDetails3.mmObject();
			isDerived = false;
			xmlTag = "XpctdExctdAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpectedExecutedAmount";
			definition = "Expected execution amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected YesNoIndicator paymentInIndicator;
	/**
	 * Indicates, for the status of a subscription, whether payment has been
	 * received by the executing party.
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
	public static final MMMessageAttribute mmPaymentInIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ExpectedExecutionDetails3.mmObject();
			isDerived = false;
			xmlTag = "PmtInInd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentInIndicator";
			definition = "Indicates, for the status of a subscription, whether payment has been received by the executing party.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected Max35Text paymentReference;
	/**
	 * Unique and unambiguous identifier for a payment transaction, as assigned
	 * by the originator. The payment transaction reference is used for
	 * reconciliation or to link tasks relating to the payment transaction.
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
	public static final MMMessageAttribute mmPaymentReference = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PaymentIdentification.mmEndToEndIdentification;
			componentContext_lazy = () -> ExpectedExecutionDetails3.mmObject();
			isDerived = false;
			xmlTag = "PmtRef";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentReference";
			definition = "Unique and unambiguous identifier for a payment transaction, as assigned by the originator. The payment transaction reference is used for reconciliation or to link tasks relating to the payment transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected ISODate prepaymentDate;
	/**
	 * Date of the prepayment, if applicable.
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
	public static final MMMessageAttribute mmPrepaymentDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.ObligationFulfilment.mmDate;
			componentContext_lazy = () -> ExpectedExecutionDetails3.mmObject();
			isDerived = false;
			xmlTag = "PrepmtDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PrepaymentDate";
			definition = "Date of the prepayment, if applicable.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount topUpAmount;
	/**
	 * Additional amount of money (top-up amount) required to meet the minimum
	 * subscription amount.
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
	public static final MMMessageAttribute mmTopUpAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.InvestmentFundClass.mmTopUpAmount;
			componentContext_lazy = () -> ExpectedExecutionDetails3.mmObject();
			isDerived = false;
			xmlTag = "TopUpAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TopUpAmount";
			definition = "Additional amount of money (top-up amount) required to meet the minimum subscription amount.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected HoldBackInformation1 holdBackDetails;
	/**
	 * Information about hold back of redemption proceeds.
	 * <p>
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
	public static final MMMessageAssociationEnd mmHoldBackDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.InvestmentFundTransaction.mmInvestmentFundClass;
			componentContext_lazy = () -> ExpectedExecutionDetails3.mmObject();
			isDerived = false;
			xmlTag = "HldBckDtls";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HoldBackDetails";
			definition = "Information about hold back of redemption proceeds.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.HoldBackInformation1.mmObject();
		}
	};
	protected SidePocketQuantityAndAmount1 sidePocketQuantity;
	/**
	 * Quantity of the side pocket.
	 * <p>
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
	public static final MMMessageAssociationEnd mmSidePocketQuantity = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmSidePocket;
			componentContext_lazy = () -> ExpectedExecutionDetails3.mmObject();
			isDerived = false;
			xmlTag = "SdPcktQty";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SidePocketQuantity";
			definition = "Quantity of the side pocket.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SidePocketQuantityAndAmount1.mmObject();
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
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "ExpectedExecutionDetails3";
				definition = "Expected trade date and expected settlement date of the order execution.";
			}
		});
		return mmObject_lazy.get();
	}

	public DateAndDateTimeChoice getExpectedTradeDateTime() {
		return expectedTradeDateTime;
	}

	public void setExpectedTradeDateTime(DateAndDateTimeChoice expectedTradeDateTime) {
		this.expectedTradeDateTime = expectedTradeDateTime;
	}

	public ISODate getExpectedCashSettlementDate() {
		return expectedCashSettlementDate;
	}

	public void setExpectedCashSettlementDate(ISODate expectedCashSettlementDate) {
		this.expectedCashSettlementDate = expectedCashSettlementDate;
	}

	public ActiveCurrencyAndAmount getExpectedExecutedAmount() {
		return expectedExecutedAmount;
	}

	public void setExpectedExecutedAmount(ActiveCurrencyAndAmount expectedExecutedAmount) {
		this.expectedExecutedAmount = expectedExecutedAmount;
	}

	public YesNoIndicator getPaymentInIndicator() {
		return paymentInIndicator;
	}

	public void setPaymentInIndicator(YesNoIndicator paymentInIndicator) {
		this.paymentInIndicator = paymentInIndicator;
	}

	public Max35Text getPaymentReference() {
		return paymentReference;
	}

	public void setPaymentReference(Max35Text paymentReference) {
		this.paymentReference = paymentReference;
	}

	public ISODate getPrepaymentDate() {
		return prepaymentDate;
	}

	public void setPrepaymentDate(ISODate prepaymentDate) {
		this.prepaymentDate = prepaymentDate;
	}

	public ActiveCurrencyAndAmount getTopUpAmount() {
		return topUpAmount;
	}

	public void setTopUpAmount(ActiveCurrencyAndAmount topUpAmount) {
		this.topUpAmount = topUpAmount;
	}

	public HoldBackInformation1 getHoldBackDetails() {
		return holdBackDetails;
	}

	public void setHoldBackDetails(com.tools20022.repository.msg.HoldBackInformation1 holdBackDetails) {
		this.holdBackDetails = holdBackDetails;
	}

	public SidePocketQuantityAndAmount1 getSidePocketQuantity() {
		return sidePocketQuantity;
	}

	public void setSidePocketQuantity(com.tools20022.repository.msg.SidePocketQuantityAndAmount1 sidePocketQuantity) {
		this.sidePocketQuantity = sidePocketQuantity;
	}
}