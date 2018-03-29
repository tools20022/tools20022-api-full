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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.PaymentPeriod1;
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PaymentTerms3", propOrder = {"dueDate", "paymentPeriod", "description", "partialPaymentPercent", "directDebitMandateIdentification", "discountAmount", "discountPercentRate", "discountBasisAmount", "penaltyAmount",
		"penaltyPercentRate", "penaltyBasisAmount"})
public class PaymentTerms3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "DueDt")
	protected ISODate dueDate;
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
	public static final MMMessageAttribute<PaymentTerms3, Optional<ISODate>> mmDueDate = new MMMessageAttribute<PaymentTerms3, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> PaymentObligation.mmPaymentDueDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentTerms3.mmObject();
			isDerived = false;
			xmlTag = "DueDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DueDate";
			definition = "Due date specified for the payment terms.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(PaymentTerms3 obj) {
			return obj.getDueDate();
		}

		@Override
		public void setValue(PaymentTerms3 obj, Optional<ISODate> value) {
			obj.setDueDate(value.orElse(null));
		}
	};
	@XmlElement(name = "PmtPrd")
	protected PaymentPeriod1 paymentPeriod;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<PaymentTerms3, Optional<PaymentPeriod1>> mmPaymentPeriod = new MMMessageAttribute<PaymentTerms3, Optional<PaymentPeriod1>>() {
		{
			businessElementTrace_lazy = () -> PaymentTerms.mmPaymentPeriod;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentTerms3.mmObject();
			isDerived = false;
			xmlTag = "PmtPrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentPeriod";
			definition = "Payment period specified for these payment terms.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PaymentPeriod1.mmObject();
		}

		@Override
		public Optional<PaymentPeriod1> getValue(PaymentTerms3 obj) {
			return obj.getPaymentPeriod();
		}

		@Override
		public void setValue(PaymentTerms3 obj, Optional<PaymentPeriod1> value) {
			obj.setPaymentPeriod(value.orElse(null));
		}
	};
	@XmlElement(name = "Desc")
	protected List<Max140Text> description;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<PaymentTerms3, List<Max140Text>> mmDescription = new MMMessageAttribute<PaymentTerms3, List<Max140Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentTerms3.mmObject();
			isDerived = false;
			xmlTag = "Desc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Description";
			definition = "Textual description of these payment terms.";
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}

		@Override
		public List<Max140Text> getValue(PaymentTerms3 obj) {
			return obj.getDescription();
		}

		@Override
		public void setValue(PaymentTerms3 obj, List<Max140Text> value) {
			obj.setDescription(value);
		}
	};
	@XmlElement(name = "PrtlPmtPct")
	protected PercentageRate partialPaymentPercent;
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
	public static final MMMessageAttribute<PaymentTerms3, Optional<PercentageRate>> mmPartialPaymentPercent = new MMMessageAttribute<PaymentTerms3, Optional<PercentageRate>>() {
		{
			businessElementTrace_lazy = () -> PaymentTerms.mmPercentage;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentTerms3.mmObject();
			isDerived = false;
			xmlTag = "PrtlPmtPct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialPaymentPercent";
			definition = "Partial payment, expressed as a percentage, for the payment terms.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public Optional<PercentageRate> getValue(PaymentTerms3 obj) {
			return obj.getPartialPaymentPercent();
		}

		@Override
		public void setValue(PaymentTerms3 obj, Optional<PercentageRate> value) {
			obj.setPartialPaymentPercent(value.orElse(null));
		}
	};
	@XmlElement(name = "DrctDbtMndtId")
	protected List<Max35Text> directDebitMandateIdentification;
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
	public static final MMMessageAttribute<PaymentTerms3, List<Max35Text>> mmDirectDebitMandateIdentification = new MMMessageAttribute<PaymentTerms3, List<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> Mandate.mmMandateIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentTerms3.mmObject();
			isDerived = false;
			xmlTag = "DrctDbtMndtId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DirectDebitMandateIdentification";
			definition = "Direct debit mandate identification specified for these payment terms.";
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public List<Max35Text> getValue(PaymentTerms3 obj) {
			return obj.getDirectDebitMandateIdentification();
		}

		@Override
		public void setValue(PaymentTerms3 obj, List<Max35Text> value) {
			obj.setDirectDebitMandateIdentification(value);
		}
	};
	@XmlElement(name = "DscntAmt")
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
	public static final MMMessageAttribute<PaymentTerms3, Optional<CurrencyAndAmount>> mmDiscountAmount = new MMMessageAttribute<PaymentTerms3, Optional<CurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> Adjustment.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentTerms3.mmObject();
			isDerived = false;
			xmlTag = "DscntAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DiscountAmount";
			definition = "Monetary value used as a basis to calculate the discount in these payment terms.";
			nextVersions_lazy = () -> Arrays.asList(EarlyPayment1.mmDiscountAmount);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<CurrencyAndAmount> getValue(PaymentTerms3 obj) {
			return obj.getDiscountAmount();
		}

		@Override
		public void setValue(PaymentTerms3 obj, Optional<CurrencyAndAmount> value) {
			obj.setDiscountAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "DscntPctRate")
	protected PercentageRate discountPercentRate;
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
	public static final MMMessageAttribute<PaymentTerms3, Optional<PercentageRate>> mmDiscountPercentRate = new MMMessageAttribute<PaymentTerms3, Optional<PercentageRate>>() {
		{
			businessElementTrace_lazy = () -> Adjustment.mmChargeRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentTerms3.mmObject();
			isDerived = false;
			xmlTag = "DscntPctRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DiscountPercentRate";
			definition = "Percent rate used to calculate the discount for these payment terms.";
			nextVersions_lazy = () -> Arrays.asList(EarlyPayment1.mmDiscountPercent);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public Optional<PercentageRate> getValue(PaymentTerms3 obj) {
			return obj.getDiscountPercentRate();
		}

		@Override
		public void setValue(PaymentTerms3 obj, Optional<PercentageRate> value) {
			obj.setDiscountPercentRate(value.orElse(null));
		}
	};
	@XmlElement(name = "DscntBsisAmt")
	protected CurrencyAndAmount discountBasisAmount;
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
	public static final MMMessageAttribute<PaymentTerms3, Optional<CurrencyAndAmount>> mmDiscountBasisAmount = new MMMessageAttribute<PaymentTerms3, Optional<CurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> Discount.mmDiscountBasisAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentTerms3.mmObject();
			isDerived = false;
			xmlTag = "DscntBsisAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DiscountBasisAmount";
			definition = "Monetary value used as a basis to calculate the discount in these payment terms.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<CurrencyAndAmount> getValue(PaymentTerms3 obj) {
			return obj.getDiscountBasisAmount();
		}

		@Override
		public void setValue(PaymentTerms3 obj, Optional<CurrencyAndAmount> value) {
			obj.setDiscountBasisAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "PnltyAmt")
	protected CurrencyAndAmount penaltyAmount;
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
	public static final MMMessageAttribute<PaymentTerms3, Optional<CurrencyAndAmount>> mmPenaltyAmount = new MMMessageAttribute<PaymentTerms3, Optional<CurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> Adjustment.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentTerms3.mmObject();
			isDerived = false;
			xmlTag = "PnltyAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PenaltyAmount";
			definition = "Monetary value used as a basis to calculate the penalty in the payment terms.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<CurrencyAndAmount> getValue(PaymentTerms3 obj) {
			return obj.getPenaltyAmount();
		}

		@Override
		public void setValue(PaymentTerms3 obj, Optional<CurrencyAndAmount> value) {
			obj.setPenaltyAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "PnltyPctRate")
	protected PercentageRate penaltyPercentRate;
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
	public static final MMMessageAttribute<PaymentTerms3, Optional<PercentageRate>> mmPenaltyPercentRate = new MMMessageAttribute<PaymentTerms3, Optional<PercentageRate>>() {
		{
			businessElementTrace_lazy = () -> Adjustment.mmChargeRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentTerms3.mmObject();
			isDerived = false;
			xmlTag = "PnltyPctRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PenaltyPercentRate";
			definition = "Percent rate used to calculate the penalty for these payment terms.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public Optional<PercentageRate> getValue(PaymentTerms3 obj) {
			return obj.getPenaltyPercentRate();
		}

		@Override
		public void setValue(PaymentTerms3 obj, Optional<PercentageRate> value) {
			obj.setPenaltyPercentRate(value.orElse(null));
		}
	};
	@XmlElement(name = "PnltyBsisAmt")
	protected CurrencyAndAmount penaltyBasisAmount;
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
	public static final MMMessageAttribute<PaymentTerms3, Optional<CurrencyAndAmount>> mmPenaltyBasisAmount = new MMMessageAttribute<PaymentTerms3, Optional<CurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> Penalty.mmPenaltyBasisAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentTerms3.mmObject();
			isDerived = false;
			xmlTag = "PnltyBsisAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PenaltyBasisAmount";
			definition = "Amount used as a basis to calculate the penalty amount.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<CurrencyAndAmount> getValue(PaymentTerms3 obj) {
			return obj.getPenaltyBasisAmount();
		}

		@Override
		public void setValue(PaymentTerms3 obj, Optional<CurrencyAndAmount> value) {
			obj.setPenaltyBasisAmount(value.orElse(null));
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
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PaymentTerms3";
				definition = "Specifies the payment terms of the underlying transaction.";
				nextVersions_lazy = () -> Arrays.asList(EarlyPayment1.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<ISODate> getDueDate() {
		return dueDate == null ? Optional.empty() : Optional.of(dueDate);
	}

	public PaymentTerms3 setDueDate(ISODate dueDate) {
		this.dueDate = dueDate;
		return this;
	}

	public Optional<PaymentPeriod1> getPaymentPeriod() {
		return paymentPeriod == null ? Optional.empty() : Optional.of(paymentPeriod);
	}

	public PaymentTerms3 setPaymentPeriod(PaymentPeriod1 paymentPeriod) {
		this.paymentPeriod = paymentPeriod;
		return this;
	}

	public List<Max140Text> getDescription() {
		return description == null ? description = new ArrayList<>() : description;
	}

	public PaymentTerms3 setDescription(List<Max140Text> description) {
		this.description = Objects.requireNonNull(description);
		return this;
	}

	public Optional<PercentageRate> getPartialPaymentPercent() {
		return partialPaymentPercent == null ? Optional.empty() : Optional.of(partialPaymentPercent);
	}

	public PaymentTerms3 setPartialPaymentPercent(PercentageRate partialPaymentPercent) {
		this.partialPaymentPercent = partialPaymentPercent;
		return this;
	}

	public List<Max35Text> getDirectDebitMandateIdentification() {
		return directDebitMandateIdentification == null ? directDebitMandateIdentification = new ArrayList<>() : directDebitMandateIdentification;
	}

	public PaymentTerms3 setDirectDebitMandateIdentification(List<Max35Text> directDebitMandateIdentification) {
		this.directDebitMandateIdentification = Objects.requireNonNull(directDebitMandateIdentification);
		return this;
	}

	public Optional<CurrencyAndAmount> getDiscountAmount() {
		return discountAmount == null ? Optional.empty() : Optional.of(discountAmount);
	}

	public PaymentTerms3 setDiscountAmount(CurrencyAndAmount discountAmount) {
		this.discountAmount = discountAmount;
		return this;
	}

	public Optional<PercentageRate> getDiscountPercentRate() {
		return discountPercentRate == null ? Optional.empty() : Optional.of(discountPercentRate);
	}

	public PaymentTerms3 setDiscountPercentRate(PercentageRate discountPercentRate) {
		this.discountPercentRate = discountPercentRate;
		return this;
	}

	public Optional<CurrencyAndAmount> getDiscountBasisAmount() {
		return discountBasisAmount == null ? Optional.empty() : Optional.of(discountBasisAmount);
	}

	public PaymentTerms3 setDiscountBasisAmount(CurrencyAndAmount discountBasisAmount) {
		this.discountBasisAmount = discountBasisAmount;
		return this;
	}

	public Optional<CurrencyAndAmount> getPenaltyAmount() {
		return penaltyAmount == null ? Optional.empty() : Optional.of(penaltyAmount);
	}

	public PaymentTerms3 setPenaltyAmount(CurrencyAndAmount penaltyAmount) {
		this.penaltyAmount = penaltyAmount;
		return this;
	}

	public Optional<PercentageRate> getPenaltyPercentRate() {
		return penaltyPercentRate == null ? Optional.empty() : Optional.of(penaltyPercentRate);
	}

	public PaymentTerms3 setPenaltyPercentRate(PercentageRate penaltyPercentRate) {
		this.penaltyPercentRate = penaltyPercentRate;
		return this;
	}

	public Optional<CurrencyAndAmount> getPenaltyBasisAmount() {
		return penaltyBasisAmount == null ? Optional.empty() : Optional.of(penaltyBasisAmount);
	}

	public PaymentTerms3 setPenaltyBasisAmount(CurrencyAndAmount penaltyBasisAmount) {
		this.penaltyBasisAmount = penaltyBasisAmount;
		return this;
	}
}