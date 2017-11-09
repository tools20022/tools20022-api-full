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
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
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
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTerms6#mmDueDate
 * PaymentTerms6.mmDueDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTerms6#mmPaymentPeriod
 * PaymentTerms6.mmPaymentPeriod}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTerms6#mmDescription
 * PaymentTerms6.mmDescription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTerms6#mmPartialPaymentPercent
 * PaymentTerms6.mmPartialPaymentPercent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTerms6#mmDirectDebitMandateIdentification
 * PaymentTerms6.mmDirectDebitMandateIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTerms6#mmBasisAmount
 * PaymentTerms6.mmBasisAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTerms6#mmDiscountAmount
 * PaymentTerms6.mmDiscountAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTerms6#mmDiscountPercentRate
 * PaymentTerms6.mmDiscountPercentRate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTerms6#mmPenaltyAmount
 * PaymentTerms6.mmPenaltyAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTerms6#mmPenaltyPercentRate
 * PaymentTerms6.mmPenaltyPercentRate}</li>
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
 * "PaymentTerms6"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the payment terms of the underlying transaction."</li>
 * </ul>
 */
public class PaymentTerms6 {

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
	 * {@linkplain com.tools20022.repository.entity.CashAvailability#mmDate
	 * CashAvailability.mmDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTerms6 PaymentTerms6}</li>
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
			businessElementTrace_lazy = () -> CashAvailability.mmDate;
			componentContext_lazy = () -> PaymentTerms6.mmObject();
			isDerived = false;
			xmlTag = "DueDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PaymentPeriod1
	 * PaymentPeriod1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTerms6 PaymentTerms6}</li>
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
	public static final MMMessageAssociationEnd mmPaymentPeriod = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> PaymentTerms6.mmObject();
			isDerived = false;
			xmlTag = "PmtPrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentPeriod";
			definition = "Payment period specified for these payment terms.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PaymentPeriod1.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.PaymentTerms6 PaymentTerms6}</li>
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
			componentContext_lazy = () -> PaymentTerms6.mmObject();
			isDerived = false;
			xmlTag = "Desc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTerms6 PaymentTerms6}</li>
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
			componentContext_lazy = () -> PaymentTerms6.mmObject();
			isDerived = false;
			xmlTag = "PrtlPmtPct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	 * {@linkplain com.tools20022.repository.entity.DirectDebit#mmDirectDebitMandate
	 * DirectDebit.mmDirectDebitMandate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTerms6 PaymentTerms6}</li>
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
			businessElementTrace_lazy = () -> DirectDebit.mmDirectDebitMandate;
			componentContext_lazy = () -> PaymentTerms6.mmObject();
			isDerived = false;
			xmlTag = "DrctDbtMndtId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DirectDebitMandateIdentification";
			definition = "Direct debit mandate identification specified for these payment terms.";
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected CurrencyAndAmount basisAmount;
	/**
	 * Amount used as a basis to calculate the discount amount for these payment
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
	 * {@linkplain com.tools20022.repository.msg.PaymentTerms6 PaymentTerms6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BsisAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BasisAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount used as a basis to calculate the discount amount for these payment terms."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBasisAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Discount.mmDiscountBasisAmount;
			componentContext_lazy = () -> PaymentTerms6.mmObject();
			isDerived = false;
			xmlTag = "BsisAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BasisAmount";
			definition = "Amount used as a basis to calculate the discount amount for these payment terms.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	protected CurrencyAndAmount discountAmount;
	/**
	 * Amount of money that results from the application of an agreed discount
	 * percentage to the basis amount and payable to the creditor.
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
	 * {@linkplain com.tools20022.repository.entity.Discount#mmDiscountAppliedAmount
	 * Discount.mmDiscountAppliedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTerms6 PaymentTerms6}</li>
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
	 * "Amount of money that results from the application of an agreed discount percentage to the basis amount and payable to the creditor."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDiscountAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Discount.mmDiscountAppliedAmount;
			componentContext_lazy = () -> PaymentTerms6.mmObject();
			isDerived = false;
			xmlTag = "DscntAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DiscountAmount";
			definition = "Amount of money that results from the application of an agreed discount percentage to the basis amount and payable to the creditor.";
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
	 * {@linkplain com.tools20022.repository.msg.PaymentTerms6 PaymentTerms6}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmDiscountPercentRate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Adjustment.mmChargeRate;
			componentContext_lazy = () -> PaymentTerms6.mmObject();
			isDerived = false;
			xmlTag = "DscntPctRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DiscountPercentRate";
			definition = "Percent rate used to calculate the discount for these payment terms.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	protected CurrencyAndAmount penaltyAmount;
	/**
	 * Amount of money that results from the application of an agreed penalty
	 * percentage to the basis amount and payable by the creditor.
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
	 * {@linkplain com.tools20022.repository.msg.PaymentTerms6 PaymentTerms6}</li>
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
	 * "Amount of money that results from the application of an agreed penalty percentage to the basis amount and payable by the creditor."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPenaltyAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Adjustment.mmAmount;
			componentContext_lazy = () -> PaymentTerms6.mmObject();
			isDerived = false;
			xmlTag = "PnltyAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PenaltyAmount";
			definition = "Amount of money that results from the application of an agreed penalty percentage to the basis amount and payable by the creditor.";
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
	 * {@linkplain com.tools20022.repository.msg.PaymentTerms6 PaymentTerms6}</li>
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
			businessElementTrace_lazy = () -> Adjustment.mmChargeRate;
			componentContext_lazy = () -> PaymentTerms6.mmObject();
			isDerived = false;
			xmlTag = "PnltyPctRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PenaltyPercentRate";
			definition = "Percent rate used to calculate the penalty for these payment terms.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(PaymentTerms6.mmDueDate, PaymentTerms6.mmPaymentPeriod, PaymentTerms6.mmDescription, PaymentTerms6.mmPartialPaymentPercent, PaymentTerms6.mmDirectDebitMandateIdentification,
						PaymentTerms6.mmBasisAmount, PaymentTerms6.mmDiscountAmount, PaymentTerms6.mmDiscountPercentRate, PaymentTerms6.mmPenaltyAmount, PaymentTerms6.mmPenaltyPercentRate);
				trace_lazy = () -> PaymentObligation.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PaymentTerms6";
				definition = "Specifies the payment terms of the underlying transaction.";
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

	public CurrencyAndAmount getBasisAmount() {
		return basisAmount;
	}

	public void setBasisAmount(CurrencyAndAmount basisAmount) {
		this.basisAmount = basisAmount;
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
}