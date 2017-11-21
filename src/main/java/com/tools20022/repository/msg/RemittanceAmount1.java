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
import com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
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
 * {@linkplain com.tools20022.repository.msg.RemittanceAmount1#mmDuePayableAmount
 * RemittanceAmount1.mmDuePayableAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RemittanceAmount1#mmDiscountAppliedAmount
 * RemittanceAmount1.mmDiscountAppliedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RemittanceAmount1#mmCreditNoteAmount
 * RemittanceAmount1.mmCreditNoteAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RemittanceAmount1#mmTaxAmount
 * RemittanceAmount1.mmTaxAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RemittanceAmount1#mmAdjustmentAmountAndReason
 * RemittanceAmount1.mmAdjustmentAmountAndReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RemittanceAmount1#mmRemittedAmount
 * RemittanceAmount1.mmRemittedAmount}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Document Document}</li>
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
 * "RemittanceAmount1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Nature of the amount and currency on a document referred to in the remittance section, typically either the original amount due/payable or the amount actually remitted for the referenced document."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "RemittanceAmount1", propOrder = {"duePayableAmount", "discountAppliedAmount", "creditNoteAmount", "taxAmount", "adjustmentAmountAndReason", "remittedAmount"})
public class RemittanceAmount1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected ActiveOrHistoricCurrencyAndAmount duePayableAmount;
	/**
	 * Amount specified is the exact amount due and payable to the creditor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount
	 * ActiveOrHistoricCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmAmount
	 * PaymentObligation.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RemittanceAmount1
	 * RemittanceAmount1}</li>
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
			componentContext_lazy = () -> RemittanceAmount1.mmObject();
			isDerived = false;
			xmlTag = "DuePyblAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DuePayableAmount";
			definition = "Amount specified is the exact amount due and payable to the creditor.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}
	};
	protected ActiveOrHistoricCurrencyAndAmount discountAppliedAmount;
	/**
	 * Amount of money that results from the application of an agreed discount
	 * to the amount due and payable to the creditor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount
	 * ActiveOrHistoricCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Discount#mmDiscountAppliedAmount
	 * Discount.mmDiscountAppliedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RemittanceAmount1
	 * RemittanceAmount1}</li>
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
			componentContext_lazy = () -> RemittanceAmount1.mmObject();
			isDerived = false;
			xmlTag = "DscntApldAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DiscountAppliedAmount";
			definition = "Amount of money that results from the application of an agreed discount to the amount due and payable to the creditor.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}
	};
	protected ActiveOrHistoricCurrencyAndAmount creditNoteAmount;
	/**
	 * Amount specified for the referred document is the amount of a credit
	 * note.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount
	 * ActiveOrHistoricCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Invoice#mmCreditDebitNoteAmount
	 * Invoice.mmCreditDebitNoteAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RemittanceAmount1
	 * RemittanceAmount1}</li>
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
			businessElementTrace_lazy = () -> Invoice.mmCreditDebitNoteAmount;
			componentContext_lazy = () -> RemittanceAmount1.mmObject();
			isDerived = false;
			xmlTag = "CdtNoteAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditNoteAmount";
			definition = "Amount specified for the referred document is the amount of a credit note.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}
	};
	protected ActiveOrHistoricCurrencyAndAmount taxAmount;
	/**
	 * Quantity of cash resulting from the calculation of the tax.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount
	 * ActiveOrHistoricCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Invoice#mmTotalTaxAmount
	 * Invoice.mmTotalTaxAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RemittanceAmount1
	 * RemittanceAmount1}</li>
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
			businessElementTrace_lazy = () -> Invoice.mmTotalTaxAmount;
			componentContext_lazy = () -> RemittanceAmount1.mmObject();
			isDerived = false;
			xmlTag = "TaxAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxAmount";
			definition = "Quantity of cash resulting from the calculation of the tax.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.DocumentAdjustment1> adjustmentAmountAndReason;
	/**
	 * Set of elements used to provide information on the amount and reason of
	 * the document adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.DocumentAdjustment1
	 * DocumentAdjustment1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmAdjustments
	 * Payment.mmAdjustments}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RemittanceAmount1
	 * RemittanceAmount1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AdjstmntAmtAndRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdjustmentAmountAndReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements used to provide information on the amount and reason of the document adjustment."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAdjustmentAmountAndReason = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Payment.mmAdjustments;
			componentContext_lazy = () -> RemittanceAmount1.mmObject();
			isDerived = false;
			xmlTag = "AdjstmntAmtAndRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdjustmentAmountAndReason";
			definition = "Set of elements used to provide information on the amount and reason of the document adjustment.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.DocumentAdjustment1.mmObject();
		}
	};
	protected ActiveOrHistoricCurrencyAndAmount remittedAmount;
	/**
	 * Amount of money remitted for the referred document.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount
	 * ActiveOrHistoricCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Document#mmRemittedAmount
	 * Document.mmRemittedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RemittanceAmount1
	 * RemittanceAmount1}</li>
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
			componentContext_lazy = () -> RemittanceAmount1.mmObject();
			isDerived = false;
			xmlTag = "RmtdAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RemittedAmount";
			definition = "Amount of money remitted for the referred document.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(RemittanceAmount1.mmDuePayableAmount, RemittanceAmount1.mmDiscountAppliedAmount, RemittanceAmount1.mmCreditNoteAmount, RemittanceAmount1.mmTaxAmount,
						RemittanceAmount1.mmAdjustmentAmountAndReason, RemittanceAmount1.mmRemittedAmount);
				trace_lazy = () -> Document.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RemittanceAmount1";
				definition = "Nature of the amount and currency on a document referred to in the remittance section, typically either the original amount due/payable or the amount actually remitted for the referenced document.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "DuePyblAmt")
	public ActiveOrHistoricCurrencyAndAmount getDuePayableAmount() {
		return duePayableAmount;
	}

	public void setDuePayableAmount(ActiveOrHistoricCurrencyAndAmount duePayableAmount) {
		this.duePayableAmount = duePayableAmount;
	}

	@XmlElement(name = "DscntApldAmt")
	public ActiveOrHistoricCurrencyAndAmount getDiscountAppliedAmount() {
		return discountAppliedAmount;
	}

	public void setDiscountAppliedAmount(ActiveOrHistoricCurrencyAndAmount discountAppliedAmount) {
		this.discountAppliedAmount = discountAppliedAmount;
	}

	@XmlElement(name = "CdtNoteAmt")
	public ActiveOrHistoricCurrencyAndAmount getCreditNoteAmount() {
		return creditNoteAmount;
	}

	public void setCreditNoteAmount(ActiveOrHistoricCurrencyAndAmount creditNoteAmount) {
		this.creditNoteAmount = creditNoteAmount;
	}

	@XmlElement(name = "TaxAmt")
	public ActiveOrHistoricCurrencyAndAmount getTaxAmount() {
		return taxAmount;
	}

	public void setTaxAmount(ActiveOrHistoricCurrencyAndAmount taxAmount) {
		this.taxAmount = taxAmount;
	}

	@XmlElement(name = "AdjstmntAmtAndRsn")
	public List<DocumentAdjustment1> getAdjustmentAmountAndReason() {
		return adjustmentAmountAndReason;
	}

	public void setAdjustmentAmountAndReason(List<com.tools20022.repository.msg.DocumentAdjustment1> adjustmentAmountAndReason) {
		this.adjustmentAmountAndReason = adjustmentAmountAndReason;
	}

	@XmlElement(name = "RmtdAmt")
	public ActiveOrHistoricCurrencyAndAmount getRemittedAmount() {
		return remittedAmount;
	}

	public void setRemittedAmount(ActiveOrHistoricCurrencyAndAmount remittedAmount) {
		this.remittedAmount = remittedAmount;
	}
}