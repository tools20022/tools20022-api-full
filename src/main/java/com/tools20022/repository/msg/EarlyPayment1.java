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
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.Payment;
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
 * <li>
 * {@linkplain com.tools20022.repository.msg.EarlyPayment1#mmEarlyPaymentDate
 * EarlyPayment1.mmEarlyPaymentDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EarlyPayment1#mmDiscountPercent
 * EarlyPayment1.mmDiscountPercent}</li>
 * <li>{@linkplain com.tools20022.repository.msg.EarlyPayment1#mmDiscountAmount
 * EarlyPayment1.mmDiscountAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EarlyPayment1#mmEarlyPaymentTaxSpecification
 * EarlyPayment1.mmEarlyPaymentTaxSpecification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EarlyPayment1#mmEarlyPaymentTaxTotal
 * EarlyPayment1.mmEarlyPaymentTaxTotal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EarlyPayment1#mmDuePayableAmountWithEarlyPayment
 * EarlyPayment1.mmDuePayableAmountWithEarlyPayment}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
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
 * "EarlyPayment1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the payment terms of the underlying transaction."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.PaymentTerms3
 * PaymentTerms3}</li>
 * </ul>
 */
public class EarlyPayment1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected ISODate earlyPaymentDate;
	/**
	 * Date before which the early payment discount is valid for payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EarlyPayment1 EarlyPayment1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EarlyPmtDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EarlyPaymentDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date before which the early payment discount is valid for payment."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEarlyPaymentDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> EarlyPayment1.mmObject();
			isDerived = false;
			xmlTag = "EarlyPmtDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EarlyPaymentDate";
			definition = "Date before which the early payment discount is valid for payment.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected PercentageRate discountPercent;
	/**
	 * Discount percent for early payment.
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
	 * {@linkplain com.tools20022.repository.msg.EarlyPayment1 EarlyPayment1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DscntPct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DiscountPercent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Discount percent for early payment."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTerms3#mmDiscountPercentRate
	 * PaymentTerms3.mmDiscountPercentRate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDiscountPercent = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Adjustment.mmChargeRate;
			componentContext_lazy = () -> EarlyPayment1.mmObject();
			isDerived = false;
			xmlTag = "DscntPct";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DiscountPercent";
			definition = "Discount percent for early payment.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.PaymentTerms3.mmDiscountPercentRate;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	protected CurrencyAndAmount discountAmount;
	/**
	 * Early payment discount with tax, with currency.
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
	 * {@linkplain com.tools20022.repository.msg.EarlyPayment1 EarlyPayment1}</li>
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
	 * definition} = "Early payment discount with tax, with currency. "</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTerms3#mmDiscountAmount
	 * PaymentTerms3.mmDiscountAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDiscountAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Discount.mmDiscountAppliedAmount;
			componentContext_lazy = () -> EarlyPayment1.mmObject();
			isDerived = false;
			xmlTag = "DscntAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DiscountAmount";
			definition = "Early payment discount with tax, with currency. ";
			previousVersion_lazy = () -> com.tools20022.repository.msg.PaymentTerms3.mmDiscountAmount;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.EarlyPaymentsVAT1> earlyPaymentTaxSpecification;
	/**
	 * In tax specification for early payment discount one defined the applied
	 * tax rates for specific early payment. VAT stands for value added tax.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.EarlyPaymentsVAT1
	 * EarlyPaymentsVAT1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmTradeSettlement
	 * Payment.mmTradeSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EarlyPayment1 EarlyPayment1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EarlyPmtTaxSpcfctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EarlyPaymentTaxSpecification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In tax specification for early payment discount one defined the applied tax rates for specific early payment. VAT stands for value added tax."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmEarlyPaymentTaxSpecification = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Payment.mmTradeSettlement;
			componentContext_lazy = () -> EarlyPayment1.mmObject();
			isDerived = false;
			xmlTag = "EarlyPmtTaxSpcfctn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EarlyPaymentTaxSpecification";
			definition = "In tax specification for early payment discount one defined the applied tax rates for specific early payment. VAT stands for value added tax.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.EarlyPaymentsVAT1.mmObject();
		}
	};
	protected CurrencyAndAmount earlyPaymentTaxTotal;
	/**
	 * Tax total in early payment, with currency.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EarlyPayment1 EarlyPayment1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EarlyPmtTaxTtl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EarlyPaymentTaxTotal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax total in early payment, with currency."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEarlyPaymentTaxTotal = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> EarlyPayment1.mmObject();
			isDerived = false;
			xmlTag = "EarlyPmtTaxTtl";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EarlyPaymentTaxTotal";
			definition = "Tax total in early payment, with currency.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	protected CurrencyAndAmount duePayableAmountWithEarlyPayment;
	/**
	 * Payable amount with discount of early payment, with currency.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EarlyPayment1 EarlyPayment1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DuePyblAmtWthEarlyPmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DuePayableAmountWithEarlyPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Payable amount with discount of early payment, with currency. "</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDuePayableAmountWithEarlyPayment = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> EarlyPayment1.mmObject();
			isDerived = false;
			xmlTag = "DuePyblAmtWthEarlyPmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DuePayableAmountWithEarlyPayment";
			definition = "Payable amount with discount of early payment, with currency. ";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.EarlyPayment1.mmEarlyPaymentDate, com.tools20022.repository.msg.EarlyPayment1.mmDiscountPercent,
						com.tools20022.repository.msg.EarlyPayment1.mmDiscountAmount, com.tools20022.repository.msg.EarlyPayment1.mmEarlyPaymentTaxSpecification, com.tools20022.repository.msg.EarlyPayment1.mmEarlyPaymentTaxTotal,
						com.tools20022.repository.msg.EarlyPayment1.mmDuePayableAmountWithEarlyPayment);
				trace_lazy = () -> Payment.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "EarlyPayment1";
				definition = "Specifies the payment terms of the underlying transaction.";
				previousVersion_lazy = () -> PaymentTerms3.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public ISODate getEarlyPaymentDate() {
		return earlyPaymentDate;
	}

	public void setEarlyPaymentDate(ISODate earlyPaymentDate) {
		this.earlyPaymentDate = earlyPaymentDate;
	}

	public PercentageRate getDiscountPercent() {
		return discountPercent;
	}

	public void setDiscountPercent(PercentageRate discountPercent) {
		this.discountPercent = discountPercent;
	}

	public CurrencyAndAmount getDiscountAmount() {
		return discountAmount;
	}

	public void setDiscountAmount(CurrencyAndAmount discountAmount) {
		this.discountAmount = discountAmount;
	}

	public List<EarlyPaymentsVAT1> getEarlyPaymentTaxSpecification() {
		return earlyPaymentTaxSpecification;
	}

	public void setEarlyPaymentTaxSpecification(List<com.tools20022.repository.msg.EarlyPaymentsVAT1> earlyPaymentTaxSpecification) {
		this.earlyPaymentTaxSpecification = earlyPaymentTaxSpecification;
	}

	public CurrencyAndAmount getEarlyPaymentTaxTotal() {
		return earlyPaymentTaxTotal;
	}

	public void setEarlyPaymentTaxTotal(CurrencyAndAmount earlyPaymentTaxTotal) {
		this.earlyPaymentTaxTotal = earlyPaymentTaxTotal;
	}

	public CurrencyAndAmount getDuePayableAmountWithEarlyPayment() {
		return duePayableAmountWithEarlyPayment;
	}

	public void setDuePayableAmountWithEarlyPayment(CurrencyAndAmount duePayableAmountWithEarlyPayment) {
		this.duePayableAmountWithEarlyPayment = duePayableAmountWithEarlyPayment;
	}
}