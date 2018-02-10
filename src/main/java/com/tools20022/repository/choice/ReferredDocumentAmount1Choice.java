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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.entity.Discount;
import com.tools20022.repository.entity.Document;
import com.tools20022.repository.entity.PaymentObligation;
import com.tools20022.repository.entity.Tax;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Nature of the amount and currency on a document referred to in the remittance
 * section, typically either the original amount due/payable or the amount
 * actually remitted for the referenced document.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ReferredDocumentAmount1Choice#mmDuePayableAmount
 * ReferredDocumentAmount1Choice.mmDuePayableAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ReferredDocumentAmount1Choice#mmDiscountAppliedAmount
 * ReferredDocumentAmount1Choice.mmDiscountAppliedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ReferredDocumentAmount1Choice#mmRemittedAmount
 * ReferredDocumentAmount1Choice.mmRemittedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ReferredDocumentAmount1Choice#mmCreditNoteAmount
 * ReferredDocumentAmount1Choice.mmCreditNoteAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ReferredDocumentAmount1Choice#mmTaxAmount
 * ReferredDocumentAmount1Choice.mmTaxAmount}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Document Document}</li>
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
 * "ReferredDocumentAmount1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Nature of the amount and currency on a document referred to in the remittance section, typically either the original amount due/payable or the amount actually remitted for the referenced document."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ReferredDocumentAmount1Choice", propOrder = {"duePayableAmount", "discountAppliedAmount", "remittedAmount", "creditNoteAmount", "taxAmount"})
public class ReferredDocumentAmount1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "DuePyblAmt", required = true)
	protected CurrencyAndAmount duePayableAmount;
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
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmAmount
	 * PaymentObligation.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ReferredDocumentAmount1Choice
	 * ReferredDocumentAmount1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DuePyblAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DuePayableAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount specified is the exact amount due and payable to the creditor."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDuePayableAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PaymentObligation.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.choice.ReferredDocumentAmount1Choice.mmObject();
			isDerived = false;
			xmlTag = "DuePyblAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DuePayableAmount";
			definition = "Amount specified is the exact amount due and payable to the creditor.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	@XmlElement(name = "DscntApldAmt", required = true)
	protected CurrencyAndAmount discountAppliedAmount;
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
	 * {@linkplain com.tools20022.repository.choice.ReferredDocumentAmount1Choice
	 * ReferredDocumentAmount1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DscntApldAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DiscountAppliedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money that results from the application of an agreed discount to the amount due and payable to the creditor."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDiscountAppliedAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Discount.mmDiscountAppliedAmount;
			componentContext_lazy = () -> com.tools20022.repository.choice.ReferredDocumentAmount1Choice.mmObject();
			isDerived = false;
			xmlTag = "DscntApldAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DiscountAppliedAmount";
			definition = "Amount of money that results from the application of an agreed discount to the amount due and payable to the creditor.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	@XmlElement(name = "RmtdAmt", required = true)
	protected CurrencyAndAmount remittedAmount;
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
	 * {@linkplain com.tools20022.repository.entity.Document#mmRemittedAmount
	 * Document.mmRemittedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ReferredDocumentAmount1Choice
	 * ReferredDocumentAmount1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RmtdAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RemittedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of money remitted for the referred document."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRemittedAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Document.mmRemittedAmount;
			componentContext_lazy = () -> com.tools20022.repository.choice.ReferredDocumentAmount1Choice.mmObject();
			isDerived = false;
			xmlTag = "RmtdAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RemittedAmount";
			definition = "Amount of money remitted for the referred document.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	@XmlElement(name = "CdtNoteAmt", required = true)
	protected CurrencyAndAmount creditNoteAmount;
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
	 * {@linkplain com.tools20022.repository.entity.Document#mmAmount
	 * Document.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ReferredDocumentAmount1Choice
	 * ReferredDocumentAmount1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CdtNoteAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditNoteAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount specified for the referred document is the amount of a credit note."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCreditNoteAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Document.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.choice.ReferredDocumentAmount1Choice.mmObject();
			isDerived = false;
			xmlTag = "CdtNoteAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditNoteAmount";
			definition = "Amount specified for the referred document is the amount of a credit note.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	@XmlElement(name = "TaxAmt", required = true)
	protected CurrencyAndAmount taxAmount;
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
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ReferredDocumentAmount1Choice
	 * ReferredDocumentAmount1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity of cash resulting from the calculation of the tax."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTaxAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.choice.ReferredDocumentAmount1Choice.mmObject();
			isDerived = false;
			xmlTag = "TaxAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxAmount";
			definition = "Quantity of cash resulting from the calculation of the tax.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.ReferredDocumentAmount1Choice.mmDuePayableAmount, com.tools20022.repository.choice.ReferredDocumentAmount1Choice.mmDiscountAppliedAmount,
						com.tools20022.repository.choice.ReferredDocumentAmount1Choice.mmRemittedAmount, com.tools20022.repository.choice.ReferredDocumentAmount1Choice.mmCreditNoteAmount,
						com.tools20022.repository.choice.ReferredDocumentAmount1Choice.mmTaxAmount);
				trace_lazy = () -> Document.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ReferredDocumentAmount1Choice";
				definition = "Nature of the amount and currency on a document referred to in the remittance section, typically either the original amount due/payable or the amount actually remitted for the referenced document.";
			}
		});
		return mmObject_lazy.get();
	}

	public CurrencyAndAmount getDuePayableAmount() {
		return duePayableAmount;
	}

	public ReferredDocumentAmount1Choice setDuePayableAmount(CurrencyAndAmount duePayableAmount) {
		this.duePayableAmount = Objects.requireNonNull(duePayableAmount);
		return this;
	}

	public CurrencyAndAmount getDiscountAppliedAmount() {
		return discountAppliedAmount;
	}

	public ReferredDocumentAmount1Choice setDiscountAppliedAmount(CurrencyAndAmount discountAppliedAmount) {
		this.discountAppliedAmount = Objects.requireNonNull(discountAppliedAmount);
		return this;
	}

	public CurrencyAndAmount getRemittedAmount() {
		return remittedAmount;
	}

	public ReferredDocumentAmount1Choice setRemittedAmount(CurrencyAndAmount remittedAmount) {
		this.remittedAmount = Objects.requireNonNull(remittedAmount);
		return this;
	}

	public CurrencyAndAmount getCreditNoteAmount() {
		return creditNoteAmount;
	}

	public ReferredDocumentAmount1Choice setCreditNoteAmount(CurrencyAndAmount creditNoteAmount) {
		this.creditNoteAmount = Objects.requireNonNull(creditNoteAmount);
		return this;
	}

	public CurrencyAndAmount getTaxAmount() {
		return taxAmount;
	}

	public ReferredDocumentAmount1Choice setTaxAmount(CurrencyAndAmount taxAmount) {
		this.taxAmount = Objects.requireNonNull(taxAmount);
		return this;
	}
}