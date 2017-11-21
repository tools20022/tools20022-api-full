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

import com.tools20022.metamodel.*;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.PaymentObligation;
import com.tools20022.repository.entity.PaymentTerms;
import com.tools20022.repository.GeneratedRepository;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies the payment terms of the underlying transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponent#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTerms2#mmPercentageOrAmountRule
 * PaymentTerms2.mmPercentageOrAmountRule}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTerms2#mmOtherPaymentTermsOrPaymentCodeRule
 * PaymentTerms2.mmOtherPaymentTermsOrPaymentCodeRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTerms2#mmOtherPaymentTerms
 * PaymentTerms2.mmOtherPaymentTerms}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTerms2#mmPaymentCode
 * PaymentTerms2.mmPaymentCode}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTerms2#mmPercentage
 * PaymentTerms2.mmPercentage}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTerms2#mmAmount
 * PaymentTerms2.mmAmount}</li>
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
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PaymentTerms2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the payment terms of the underlying transaction."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTerms4 PaymentTerms4}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "PaymentTerms2", propOrder = {"otherPaymentTerms", "paymentCode", "percentage", "amount"})
public class PaymentTerms2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max140Text otherPaymentTerms;
	/**
	 * Specifies payment terms not present in a code list.
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
	 * {@linkplain com.tools20022.repository.msg.PaymentTerms2 PaymentTerms2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrPmtTerms"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherPaymentTerms"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies payment terms not present in a code list."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOtherPaymentTerms = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PaymentTerms2.mmObject();
			isDerived = false;
			xmlTag = "OthrPmtTerms";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherPaymentTerms";
			definition = "Specifies payment terms not present in a code list.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};
	protected PaymentPeriod2 paymentCode;
	/**
	 * Specifies the payment period in coded form and a number of days.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PaymentPeriod2
	 * PaymentPeriod2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmPaymentTerms
	 * PaymentObligation.mmPaymentTerms}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTerms2 PaymentTerms2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtCd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the payment period in coded form and a number of days."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPaymentCode = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> PaymentObligation.mmPaymentTerms;
			componentContext_lazy = () -> PaymentTerms2.mmObject();
			isDerived = false;
			xmlTag = "PmtCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentCode";
			definition = "Specifies the payment period in coded form and a number of days.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PaymentPeriod2.mmObject();
		}
	};
	protected PercentageRate percentage;
	/**
	 * Specifies that the payment conditions apply to a percentage of the amount
	 * due.
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
	 * {@linkplain com.tools20022.repository.msg.PaymentTerms2 PaymentTerms2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Pctg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Percentage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies that the payment conditions apply to a percentage of the amount due."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPercentage = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PaymentTerms.mmPercentage;
			componentContext_lazy = () -> PaymentTerms2.mmObject();
			isDerived = false;
			xmlTag = "Pctg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Percentage";
			definition = "Specifies that the payment conditions apply to a percentage of the amount due.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	protected CurrencyAndAmount amount;
	/**
	 * Amount of money to be moved between the debtor and creditor, before
	 * deduction of charges, expressed in the currency as ordered by the
	 * initiating party.
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
	 * {@linkplain com.tools20022.repository.entity.PaymentTerms#mmAmount
	 * PaymentTerms.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTerms2 PaymentTerms2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Amt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money to be moved between the debtor and creditor, before deduction of charges, expressed in the currency as ordered by the initiating party."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PaymentTerms.mmAmount;
			componentContext_lazy = () -> PaymentTerms2.mmObject();
			isDerived = false;
			xmlTag = "Amt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Amount";
			definition = "Amount of money to be moved between the debtor and creditor, before deduction of charges, expressed in the currency as ordered by the initiating party.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * If Percentage is present, then Amount is not allowed. If Percentage is
	 * not present, then Amount is mandatory.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTerms2 PaymentTerms2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentTerms2#mmPercentage
	 * PaymentTerms2.mmPercentage}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentTerms2#mmAmount
	 * PaymentTerms2.mmAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PercentageOrAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Percentage is present, then Amount is not allowed. If Percentage is not present, then Amount is mandatory."
	 * </li>
	 * </ul>
	 */
	public static final MMXor mmPercentageOrAmountRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PercentageOrAmountRule";
			definition = "If Percentage is present, then Amount is not allowed. If Percentage is not present, then Amount is mandatory.";
			messageComponent_lazy = () -> PaymentTerms2.mmObject();
			impactedElements_lazy = () -> Arrays.asList(PaymentTerms2.mmPercentage, PaymentTerms2.mmAmount);
		}
	};
	/**
	 * If OtherPaymentTerms is present, then PaymentCode is not allowed. If
	 * OtherPaymentTerms is not present, then PaymentCode is mandatory.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTerms2 PaymentTerms2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTerms2#mmOtherPaymentTerms
	 * PaymentTerms2.mmOtherPaymentTerms}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTerms2#mmPaymentCode
	 * PaymentTerms2.mmPaymentCode}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherPaymentTermsOrPaymentCodeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If OtherPaymentTerms is present, then PaymentCode is not allowed. If OtherPaymentTerms is not present, then PaymentCode is mandatory."
	 * </li>
	 * </ul>
	 */
	public static final MMXor mmOtherPaymentTermsOrPaymentCodeRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherPaymentTermsOrPaymentCodeRule";
			definition = "If OtherPaymentTerms is present, then PaymentCode is not allowed. If OtherPaymentTerms is not present, then PaymentCode is mandatory.";
			messageComponent_lazy = () -> PaymentTerms2.mmObject();
			impactedElements_lazy = () -> Arrays.asList(PaymentTerms2.mmOtherPaymentTerms, PaymentTerms2.mmPaymentCode);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(PaymentTerms2.mmOtherPaymentTerms, PaymentTerms2.mmPaymentCode, PaymentTerms2.mmPercentage, PaymentTerms2.mmAmount);
				trace_lazy = () -> PaymentObligation.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "PaymentTerms2";
				definition = "Specifies the payment terms of the underlying transaction.";
				nextVersions_lazy = () -> Arrays.asList(PaymentTerms4.mmObject());
				xors_lazy = () -> Arrays.asList(PaymentTerms2.mmPercentageOrAmountRule, PaymentTerms2.mmOtherPaymentTermsOrPaymentCodeRule);
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "OthrPmtTerms", required = true)
	public Max140Text getOtherPaymentTerms() {
		return otherPaymentTerms;
	}

	public void setOtherPaymentTerms(Max140Text otherPaymentTerms) {
		this.otherPaymentTerms = otherPaymentTerms;
	}

	@XmlElement(name = "PmtCd", required = true)
	public PaymentPeriod2 getPaymentCode() {
		return paymentCode;
	}

	public void setPaymentCode(com.tools20022.repository.msg.PaymentPeriod2 paymentCode) {
		this.paymentCode = paymentCode;
	}

	@XmlElement(name = "Pctg", required = true)
	public PercentageRate getPercentage() {
		return percentage;
	}

	public void setPercentage(PercentageRate percentage) {
		this.percentage = percentage;
	}

	@XmlElement(name = "Amt", required = true)
	public CurrencyAndAmount getAmount() {
		return amount;
	}

	public void setAmount(CurrencyAndAmount amount) {
		this.amount = amount;
	}
}