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
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.Adjustment;
import com.tools20022.repository.entity.Discount;
import com.tools20022.repository.entity.Payment;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.EarlyPaymentsVAT1;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "EarlyPayment1", propOrder = {"earlyPaymentDate", "discountPercent", "discountAmount", "earlyPaymentTaxSpecification", "earlyPaymentTaxTotal", "duePayableAmountWithEarlyPayment"})
public class EarlyPayment1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "EarlyPmtDt", required = true)
	protected ISODate earlyPaymentDate;
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
	public static final MMMessageAttribute<EarlyPayment1, ISODate> mmEarlyPaymentDate = new MMMessageAttribute<EarlyPayment1, ISODate>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.EarlyPayment1.mmObject();
			isDerived = false;
			xmlTag = "EarlyPmtDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EarlyPaymentDate";
			definition = "Date before which the early payment discount is valid for payment.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public ISODate getValue(EarlyPayment1 obj) {
			return obj.getEarlyPaymentDate();
		}

		@Override
		public void setValue(EarlyPayment1 obj, ISODate value) {
			obj.setEarlyPaymentDate(value);
		}
	};
	@XmlElement(name = "DscntPct", required = true)
	protected PercentageRate discountPercent;
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
	public static final MMMessageAttribute<EarlyPayment1, PercentageRate> mmDiscountPercent = new MMMessageAttribute<EarlyPayment1, PercentageRate>() {
		{
			businessElementTrace_lazy = () -> Adjustment.mmChargeRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.EarlyPayment1.mmObject();
			isDerived = false;
			xmlTag = "DscntPct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DiscountPercent";
			definition = "Discount percent for early payment.";
			previousVersion_lazy = () -> PaymentTerms3.mmDiscountPercentRate;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public PercentageRate getValue(EarlyPayment1 obj) {
			return obj.getDiscountPercent();
		}

		@Override
		public void setValue(EarlyPayment1 obj, PercentageRate value) {
			obj.setDiscountPercent(value);
		}
	};
	@XmlElement(name = "DscntAmt", required = true)
	protected CurrencyAndAmount discountAmount;
	/**
	 * 
	 <p>
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
	 * definition} = "Early payment discount with tax, with currency."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTerms3#mmDiscountAmount
	 * PaymentTerms3.mmDiscountAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<EarlyPayment1, CurrencyAndAmount> mmDiscountAmount = new MMMessageAttribute<EarlyPayment1, CurrencyAndAmount>() {
		{
			businessElementTrace_lazy = () -> Discount.mmDiscountAppliedAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.EarlyPayment1.mmObject();
			isDerived = false;
			xmlTag = "DscntAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DiscountAmount";
			definition = "Early payment discount with tax, with currency.";
			previousVersion_lazy = () -> PaymentTerms3.mmDiscountAmount;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(EarlyPayment1 obj) {
			return obj.getDiscountAmount();
		}

		@Override
		public void setValue(EarlyPayment1 obj, CurrencyAndAmount value) {
			obj.setDiscountAmount(value);
		}
	};
	@XmlElement(name = "EarlyPmtTaxSpcfctn")
	protected List<EarlyPaymentsVAT1> earlyPaymentTaxSpecification;
	/**
	 * 
	 <p>
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
	public static final MMMessageAssociationEnd<EarlyPayment1, List<EarlyPaymentsVAT1>> mmEarlyPaymentTaxSpecification = new MMMessageAssociationEnd<EarlyPayment1, List<EarlyPaymentsVAT1>>() {
		{
			businessElementTrace_lazy = () -> Payment.mmTradeSettlement;
			componentContext_lazy = () -> com.tools20022.repository.msg.EarlyPayment1.mmObject();
			isDerived = false;
			xmlTag = "EarlyPmtTaxSpcfctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EarlyPaymentTaxSpecification";
			definition = "In tax specification for early payment discount one defined the applied tax rates for specific early payment. VAT stands for value added tax.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> EarlyPaymentsVAT1.mmObject();
		}

		@Override
		public List<EarlyPaymentsVAT1> getValue(EarlyPayment1 obj) {
			return obj.getEarlyPaymentTaxSpecification();
		}

		@Override
		public void setValue(EarlyPayment1 obj, List<EarlyPaymentsVAT1> value) {
			obj.setEarlyPaymentTaxSpecification(value);
		}
	};
	@XmlElement(name = "EarlyPmtTaxTtl")
	protected CurrencyAndAmount earlyPaymentTaxTotal;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<EarlyPayment1, Optional<CurrencyAndAmount>> mmEarlyPaymentTaxTotal = new MMMessageAttribute<EarlyPayment1, Optional<CurrencyAndAmount>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.EarlyPayment1.mmObject();
			isDerived = false;
			xmlTag = "EarlyPmtTaxTtl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EarlyPaymentTaxTotal";
			definition = "Tax total in early payment, with currency.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<CurrencyAndAmount> getValue(EarlyPayment1 obj) {
			return obj.getEarlyPaymentTaxTotal();
		}

		@Override
		public void setValue(EarlyPayment1 obj, Optional<CurrencyAndAmount> value) {
			obj.setEarlyPaymentTaxTotal(value.orElse(null));
		}
	};
	@XmlElement(name = "DuePyblAmtWthEarlyPmt")
	protected CurrencyAndAmount duePayableAmountWithEarlyPayment;
	/**
	 * 
	 <p>
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
	 * "Payable amount with discount of early payment, with currency."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<EarlyPayment1, Optional<CurrencyAndAmount>> mmDuePayableAmountWithEarlyPayment = new MMMessageAttribute<EarlyPayment1, Optional<CurrencyAndAmount>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.EarlyPayment1.mmObject();
			isDerived = false;
			xmlTag = "DuePyblAmtWthEarlyPmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DuePayableAmountWithEarlyPayment";
			definition = "Payable amount with discount of early payment, with currency.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<CurrencyAndAmount> getValue(EarlyPayment1 obj) {
			return obj.getDuePayableAmountWithEarlyPayment();
		}

		@Override
		public void setValue(EarlyPayment1 obj, Optional<CurrencyAndAmount> value) {
			obj.setDuePayableAmountWithEarlyPayment(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.EarlyPayment1.mmEarlyPaymentDate, com.tools20022.repository.msg.EarlyPayment1.mmDiscountPercent,
						com.tools20022.repository.msg.EarlyPayment1.mmDiscountAmount, com.tools20022.repository.msg.EarlyPayment1.mmEarlyPaymentTaxSpecification, com.tools20022.repository.msg.EarlyPayment1.mmEarlyPaymentTaxTotal,
						com.tools20022.repository.msg.EarlyPayment1.mmDuePayableAmountWithEarlyPayment);
				trace_lazy = () -> Payment.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
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

	public EarlyPayment1 setEarlyPaymentDate(ISODate earlyPaymentDate) {
		this.earlyPaymentDate = Objects.requireNonNull(earlyPaymentDate);
		return this;
	}

	public PercentageRate getDiscountPercent() {
		return discountPercent;
	}

	public EarlyPayment1 setDiscountPercent(PercentageRate discountPercent) {
		this.discountPercent = Objects.requireNonNull(discountPercent);
		return this;
	}

	public CurrencyAndAmount getDiscountAmount() {
		return discountAmount;
	}

	public EarlyPayment1 setDiscountAmount(CurrencyAndAmount discountAmount) {
		this.discountAmount = Objects.requireNonNull(discountAmount);
		return this;
	}

	public List<EarlyPaymentsVAT1> getEarlyPaymentTaxSpecification() {
		return earlyPaymentTaxSpecification == null ? earlyPaymentTaxSpecification = new ArrayList<>() : earlyPaymentTaxSpecification;
	}

	public EarlyPayment1 setEarlyPaymentTaxSpecification(List<EarlyPaymentsVAT1> earlyPaymentTaxSpecification) {
		this.earlyPaymentTaxSpecification = Objects.requireNonNull(earlyPaymentTaxSpecification);
		return this;
	}

	public Optional<CurrencyAndAmount> getEarlyPaymentTaxTotal() {
		return earlyPaymentTaxTotal == null ? Optional.empty() : Optional.of(earlyPaymentTaxTotal);
	}

	public EarlyPayment1 setEarlyPaymentTaxTotal(CurrencyAndAmount earlyPaymentTaxTotal) {
		this.earlyPaymentTaxTotal = earlyPaymentTaxTotal;
		return this;
	}

	public Optional<CurrencyAndAmount> getDuePayableAmountWithEarlyPayment() {
		return duePayableAmountWithEarlyPayment == null ? Optional.empty() : Optional.of(duePayableAmountWithEarlyPayment);
	}

	public EarlyPayment1 setDuePayableAmountWithEarlyPayment(CurrencyAndAmount duePayableAmountWithEarlyPayment) {
		this.duePayableAmountWithEarlyPayment = duePayableAmountWithEarlyPayment;
		return this;
	}
}