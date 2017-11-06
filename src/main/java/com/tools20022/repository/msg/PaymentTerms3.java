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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.PaymentObligation;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Specifies the payment terms of the underlying transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTerms3#mmDueDate
 * PaymentTerms3.mmDueDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTerms3#mmPaymentPeriod
 * PaymentTerms3.mmPaymentPeriod}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTerms3#mmDescription
 * PaymentTerms3.mmDescription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTerms3#mmPartialPaymentPercent
 * PaymentTerms3.mmPartialPaymentPercent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTerms3#mmDirectDebitMandateIdentification
 * PaymentTerms3.mmDirectDebitMandateIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTerms3#mmDiscountAmount
 * PaymentTerms3.mmDiscountAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTerms3#mmDiscountPercentRate
 * PaymentTerms3.mmDiscountPercentRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTerms3#mmDiscountBasisAmount
 * PaymentTerms3.mmDiscountBasisAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTerms3#mmPenaltyAmount
 * PaymentTerms3.mmPenaltyAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTerms3#mmPenaltyPercentRate
 * PaymentTerms3.mmPenaltyPercentRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTerms3#mmPenaltyBasisAmount
 * PaymentTerms3.mmPenaltyBasisAmount}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.PaymentObligation
 * PaymentObligation}</li>
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
 * "PaymentTerms3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the payment terms of the underlying transaction."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.EarlyPayment1 EarlyPayment1}</li>
 * </ul>
 * </li>
 * </ul>
 */
public class PaymentTerms3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected ISODate dueDate;
	/**
	 * Due date specified for the payment terms.
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
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmPaymentDueDate
	 * PaymentObligation.mmPaymentDueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTerms3 PaymentTerms3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DueDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DueDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Due date specified for the payment terms."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDueDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmPaymentDueDate;
			componentContext_lazy = () -> PaymentTerms3.mmObject();
			isDerived = false;
			xmlTag = "DueDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DueDate";
			definition = "Due date specified for the payment terms.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected PaymentPeriod1 paymentPeriod;
	/**
	 * Payment period specified for these payment terms.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.PaymentPeriod1
	 * PaymentPeriod1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentTerms#mmPaymentPeriod
	 * PaymentTerms.mmPaymentPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTerms3 PaymentTerms3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtPrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Payment period specified for these payment terms."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPaymentPeriod = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PaymentTerms.mmPaymentPeriod;
			componentContext_lazy = () -> PaymentTerms3.mmObject();
			isDerived = false;
			xmlTag = "PmtPrd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentPeriod";
			definition = "Payment period specified for these payment terms.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.PaymentPeriod1.mmObject();
		}
	};
	protected List<Max140Text> description;
	/**
	 * Textual description of these payment terms.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTerms3 PaymentTerms3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Desc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Description"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Textual description of these payment terms."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDescription = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PaymentTerms3.mmObject();
			isDerived = false;
			xmlTag = "Desc";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Description";
			definition = "Textual description of these payment terms.";
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};
	protected PercentageRate partialPaymentPercent;
	/**
	 * Partial payment, expressed as a percentage, for the payment terms.
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
	 * {@linkplain com.tools20022.repository.entity.PaymentTerms#mmPercentage
	 * PaymentTerms.mmPercentage}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTerms3 PaymentTerms3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtlPmtPct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialPaymentPercent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Partial payment, expressed as a percentage, for the payment terms."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPartialPaymentPercent = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PaymentTerms.mmPercentage;
			componentContext_lazy = () -> PaymentTerms3.mmObject();
			isDerived = false;
			xmlTag = "PrtlPmtPct";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialPaymentPercent";
			definition = "Partial payment, expressed as a percentage, for the payment terms.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	protected List<Max35Text> directDebitMandateIdentification;
	/**
	 * Direct debit mandate identification specified for these payment terms.
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
	 * {@linkplain com.tools20022.repository.entity.Mandate#mmMandateIdentification
	 * Mandate.mmMandateIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTerms3 PaymentTerms3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DrctDbtMndtId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DirectDebitMandateIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Direct debit mandate identification specified for these payment terms."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDirectDebitMandateIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Mandate.mmMandateIdentification;
			componentContext_lazy = () -> PaymentTerms3.mmObject();
			isDerived = false;
			xmlTag = "DrctDbtMndtId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DirectDebitMandateIdentification";
			definition = "Direct debit mandate identification specified for these payment terms.";
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected CurrencyAndAmount discountAmount;
	/**
	 * Monetary value used as a basis to calculate the discount in these payment
	 * terms.
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
	 * {@linkplain com.tools20022.repository.entity.Adjustment#mmAmount
	 * Adjustment.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTerms3 PaymentTerms3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DscntAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DiscountAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Monetary value used as a basis to calculate the discount in these payment terms."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EarlyPayment1#mmDiscountAmount
	 * EarlyPayment1.mmDiscountAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDiscountAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Adjustment.mmAmount;
			componentContext_lazy = () -> PaymentTerms3.mmObject();
			isDerived = false;
			xmlTag = "DscntAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DiscountAmount";
			definition = "Monetary value used as a basis to calculate the discount in these payment terms.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.EarlyPayment1.mmDiscountAmount);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	protected PercentageRate discountPercentRate;
	/**
	 * Percent rate used to calculate the discount for these payment terms.
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
	 * {@linkplain com.tools20022.repository.entity.Adjustment#mmChargeRate
	 * Adjustment.mmChargeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTerms3 PaymentTerms3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DscntPctRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DiscountPercentRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Percent rate used to calculate the discount for these payment terms."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EarlyPayment1#mmDiscountPercent
	 * EarlyPayment1.mmDiscountPercent}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDiscountPercentRate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Adjustment.mmChargeRate;
			componentContext_lazy = () -> PaymentTerms3.mmObject();
			isDerived = false;
			xmlTag = "DscntPctRate";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DiscountPercentRate";
			definition = "Percent rate used to calculate the discount for these payment terms.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.EarlyPayment1.mmDiscountPercent);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	protected CurrencyAndAmount discountBasisAmount;
	/**
	 * Monetary value used as a basis to calculate the discount in these payment
	 * terms.
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
	 * {@linkplain com.tools20022.repository.entity.Discount#mmDiscountBasisAmount
	 * Discount.mmDiscountBasisAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTerms3 PaymentTerms3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DscntBsisAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DiscountBasisAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Monetary value used as a basis to calculate the discount in these payment terms."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDiscountBasisAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Discount.mmDiscountBasisAmount;
			componentContext_lazy = () -> PaymentTerms3.mmObject();
			isDerived = false;
			xmlTag = "DscntBsisAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DiscountBasisAmount";
			definition = "Monetary value used as a basis to calculate the discount in these payment terms.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	protected CurrencyAndAmount penaltyAmount;
	/**
	 * Monetary value used as a basis to calculate the penalty in the payment
	 * terms.
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
	 * {@linkplain com.tools20022.repository.entity.Adjustment#mmAmount
	 * Adjustment.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTerms3 PaymentTerms3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PnltyAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PenaltyAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Monetary value used as a basis to calculate the penalty in the payment terms."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPenaltyAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Adjustment.mmAmount;
			componentContext_lazy = () -> PaymentTerms3.mmObject();
			isDerived = false;
			xmlTag = "PnltyAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PenaltyAmount";
			definition = "Monetary value used as a basis to calculate the penalty in the payment terms.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	protected PercentageRate penaltyPercentRate;
	/**
	 * Percent rate used to calculate the penalty for these payment terms.
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
	 * {@linkplain com.tools20022.repository.entity.Adjustment#mmChargeRate
	 * Adjustment.mmChargeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTerms3 PaymentTerms3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PnltyPctRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PenaltyPercentRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Percent rate used to calculate the penalty for these payment terms."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPenaltyPercentRate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Adjustment.mmChargeRate;
			componentContext_lazy = () -> PaymentTerms3.mmObject();
			isDerived = false;
			xmlTag = "PnltyPctRate";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PenaltyPercentRate";
			definition = "Percent rate used to calculate the penalty for these payment terms.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	protected CurrencyAndAmount penaltyBasisAmount;
	/**
	 * Amount used as a basis to calculate the penalty amount.
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
	 * {@linkplain com.tools20022.repository.entity.Penalty#mmPenaltyBasisAmount
	 * Penalty.mmPenaltyBasisAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTerms3 PaymentTerms3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PnltyBsisAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PenaltyBasisAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount used as a basis to calculate the penalty amount."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPenaltyBasisAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Penalty.mmPenaltyBasisAmount;
			componentContext_lazy = () -> PaymentTerms3.mmObject();
			isDerived = false;
			xmlTag = "PnltyBsisAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PenaltyBasisAmount";
			definition = "Amount used as a basis to calculate the penalty amount.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentTerms3.mmDueDate, com.tools20022.repository.msg.PaymentTerms3.mmPaymentPeriod, com.tools20022.repository.msg.PaymentTerms3.mmDescription,
						com.tools20022.repository.msg.PaymentTerms3.mmPartialPaymentPercent, com.tools20022.repository.msg.PaymentTerms3.mmDirectDebitMandateIdentification, com.tools20022.repository.msg.PaymentTerms3.mmDiscountAmount,
						com.tools20022.repository.msg.PaymentTerms3.mmDiscountPercentRate, com.tools20022.repository.msg.PaymentTerms3.mmDiscountBasisAmount, com.tools20022.repository.msg.PaymentTerms3.mmPenaltyAmount,
						com.tools20022.repository.msg.PaymentTerms3.mmPenaltyPercentRate, com.tools20022.repository.msg.PaymentTerms3.mmPenaltyBasisAmount);
				trace_lazy = () -> PaymentObligation.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PaymentTerms3";
				definition = "Specifies the payment terms of the underlying transaction.";
				nextVersions_lazy = () -> Arrays.asList(EarlyPayment1.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public ISODate getDueDate() {
		return dueDate;
	}

	public void setDueDate(ISODate dueDate) {
		this.dueDate = dueDate;
	}

	public PaymentPeriod1 getPaymentPeriod() {
		return paymentPeriod;
	}

	public void setPaymentPeriod(com.tools20022.repository.msg.PaymentPeriod1 paymentPeriod) {
		this.paymentPeriod = paymentPeriod;
	}

	public List<Max140Text> getDescription() {
		return description;
	}

	public void setDescription(List<Max140Text> description) {
		this.description = description;
	}

	public PercentageRate getPartialPaymentPercent() {
		return partialPaymentPercent;
	}

	public void setPartialPaymentPercent(PercentageRate partialPaymentPercent) {
		this.partialPaymentPercent = partialPaymentPercent;
	}

	public List<Max35Text> getDirectDebitMandateIdentification() {
		return directDebitMandateIdentification;
	}

	public void setDirectDebitMandateIdentification(List<Max35Text> directDebitMandateIdentification) {
		this.directDebitMandateIdentification = directDebitMandateIdentification;
	}

	public CurrencyAndAmount getDiscountAmount() {
		return discountAmount;
	}

	public void setDiscountAmount(CurrencyAndAmount discountAmount) {
		this.discountAmount = discountAmount;
	}

	public PercentageRate getDiscountPercentRate() {
		return discountPercentRate;
	}

	public void setDiscountPercentRate(PercentageRate discountPercentRate) {
		this.discountPercentRate = discountPercentRate;
	}

	public CurrencyAndAmount getDiscountBasisAmount() {
		return discountBasisAmount;
	}

	public void setDiscountBasisAmount(CurrencyAndAmount discountBasisAmount) {
		this.discountBasisAmount = discountBasisAmount;
	}

	public CurrencyAndAmount getPenaltyAmount() {
		return penaltyAmount;
	}

	public void setPenaltyAmount(CurrencyAndAmount penaltyAmount) {
		this.penaltyAmount = penaltyAmount;
	}

	public PercentageRate getPenaltyPercentRate() {
		return penaltyPercentRate;
	}

	public void setPenaltyPercentRate(PercentageRate penaltyPercentRate) {
		this.penaltyPercentRate = penaltyPercentRate;
	}

	public CurrencyAndAmount getPenaltyBasisAmount() {
		return penaltyBasisAmount;
	}

	public void setPenaltyBasisAmount(CurrencyAndAmount penaltyBasisAmount) {
		this.penaltyBasisAmount = penaltyBasisAmount;
	}
}