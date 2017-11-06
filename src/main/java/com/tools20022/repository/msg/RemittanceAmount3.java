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
import com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount;
import com.tools20022.repository.entity.Adjustment;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * {@linkplain com.tools20022.repository.msg.RemittanceAmount3#mmDuePayableAmount
 * RemittanceAmount3.mmDuePayableAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RemittanceAmount3#mmDiscountAppliedAmount
 * RemittanceAmount3.mmDiscountAppliedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RemittanceAmount3#mmCreditNoteAmount
 * RemittanceAmount3.mmCreditNoteAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RemittanceAmount3#mmTaxAmount
 * RemittanceAmount3.mmTaxAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RemittanceAmount3#mmAdjustmentAmountAndReason
 * RemittanceAmount3.mmAdjustmentAmountAndReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RemittanceAmount3#mmRemittedAmount
 * RemittanceAmount3.mmRemittedAmount}</li>
 * </ul>
 * </li>
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
 * "RemittanceAmount3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Nature of the amount and currency on a document referred to in the remittance section, typically either the original amount due/payable or the amount actually remitted for the referenced document."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.RemittanceAmount2
 * RemittanceAmount2}</li>
 * </ul>
 */
public class RemittanceAmount3 {

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
	 * {@linkplain com.tools20022.repository.msg.RemittanceAmount3
	 * RemittanceAmount3}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.RemittanceAmount2#mmDuePayableAmount
	 * RemittanceAmount2.mmDuePayableAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDuePayableAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmAmount;
			componentContext_lazy = () -> RemittanceAmount3.mmObject();
			isDerived = false;
			xmlTag = "DuePyblAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DuePayableAmount";
			definition = "Amount specified is the exact amount due and payable to the creditor.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.RemittanceAmount2.mmDuePayableAmount;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.DiscountAmountAndType1> discountAppliedAmount;
	/**
	 * Amount of discount to be applied to the amount due and payable to the
	 * creditor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DiscountAmountAndType1
	 * DiscountAmountAndType1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Discount#mmDiscountAppliedAmount
	 * Discount.mmDiscountAppliedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RemittanceAmount3
	 * RemittanceAmount3}</li>
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
	 * "Amount of discount to be applied to the amount due and payable to the creditor."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.RemittanceAmount2#mmDiscountAppliedAmount
	 * RemittanceAmount2.mmDiscountAppliedAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDiscountAppliedAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Discount.mmDiscountAppliedAmount;
			componentContext_lazy = () -> RemittanceAmount3.mmObject();
			isDerived = false;
			xmlTag = "DscntApldAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DiscountAppliedAmount";
			definition = "Amount of discount to be applied to the amount due and payable to the creditor.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.RemittanceAmount2.mmDiscountAppliedAmount;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.DiscountAmountAndType1.mmObject();
		}
	};
	protected ActiveOrHistoricCurrencyAndAmount creditNoteAmount;
	/**
	 * Amount of a credit note.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount
	 * ActiveOrHistoricCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RemittanceAmount3
	 * RemittanceAmount3}</li>
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
	 * definition} = "Amount of a credit note."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.RemittanceAmount2#mmCreditNoteAmount
	 * RemittanceAmount2.mmCreditNoteAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCreditNoteAmount = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> RemittanceAmount3.mmObject();
			isDerived = false;
			xmlTag = "CdtNoteAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditNoteAmount";
			definition = "Amount of a credit note.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.RemittanceAmount2.mmCreditNoteAmount;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.TaxAmountAndType1> taxAmount;
	/**
	 * Amount of the tax.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.TaxAmountAndType1
	 * TaxAmountAndType1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RemittanceAmount3
	 * RemittanceAmount3}</li>
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
	 * definition} = "Amount of the tax."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.RemittanceAmount2#mmTaxAmount
	 * RemittanceAmount2.mmTaxAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTaxAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Tax.mmAmount;
			componentContext_lazy = () -> RemittanceAmount3.mmObject();
			isDerived = false;
			xmlTag = "TaxAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxAmount";
			definition = "Amount of the tax.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.RemittanceAmount2.mmTaxAmount;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.TaxAmountAndType1.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.DocumentAdjustment1> adjustmentAmountAndReason;
	/**
	 * Specifies detailed information on the amount and reason of the
	 * adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.DocumentAdjustment1
	 * DocumentAdjustment1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment Adjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RemittanceAmount3
	 * RemittanceAmount3}</li>
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
	 * "Specifies detailed information on the amount and reason of the adjustment."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.RemittanceAmount2#mmAdjustmentAmountAndReason
	 * RemittanceAmount2.mmAdjustmentAmountAndReason}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAdjustmentAmountAndReason = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Adjustment.mmObject();
			componentContext_lazy = () -> RemittanceAmount3.mmObject();
			isDerived = false;
			xmlTag = "AdjstmntAmtAndRsn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdjustmentAmountAndReason";
			definition = "Specifies detailed information on the amount and reason of the adjustment.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.RemittanceAmount2.mmAdjustmentAmountAndReason;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.DocumentAdjustment1.mmObject();
		}
	};
	protected ActiveOrHistoricCurrencyAndAmount remittedAmount;
	/**
	 * Amount of money remitted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount
	 * ActiveOrHistoricCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RemittanceAmount3
	 * RemittanceAmount3}</li>
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
	 * definition} = "Amount of money remitted."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.RemittanceAmount2#mmRemittedAmount
	 * RemittanceAmount2.mmRemittedAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRemittedAmount = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> RemittanceAmount3.mmObject();
			isDerived = false;
			xmlTag = "RmtdAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RemittedAmount";
			definition = "Amount of money remitted.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.RemittanceAmount2.mmRemittedAmount;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RemittanceAmount3.mmDuePayableAmount, com.tools20022.repository.msg.RemittanceAmount3.mmDiscountAppliedAmount,
						com.tools20022.repository.msg.RemittanceAmount3.mmCreditNoteAmount, com.tools20022.repository.msg.RemittanceAmount3.mmTaxAmount, com.tools20022.repository.msg.RemittanceAmount3.mmAdjustmentAmountAndReason,
						com.tools20022.repository.msg.RemittanceAmount3.mmRemittedAmount);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "RemittanceAmount3";
				definition = "Nature of the amount and currency on a document referred to in the remittance section, typically either the original amount due/payable or the amount actually remitted for the referenced document.";
				previousVersion_lazy = () -> RemittanceAmount2.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public ActiveOrHistoricCurrencyAndAmount getDuePayableAmount() {
		return duePayableAmount;
	}

	public void setDuePayableAmount(ActiveOrHistoricCurrencyAndAmount duePayableAmount) {
		this.duePayableAmount = duePayableAmount;
	}

	public List<DiscountAmountAndType1> getDiscountAppliedAmount() {
		return discountAppliedAmount;
	}

	public void setDiscountAppliedAmount(List<com.tools20022.repository.msg.DiscountAmountAndType1> discountAppliedAmount) {
		this.discountAppliedAmount = discountAppliedAmount;
	}

	public ActiveOrHistoricCurrencyAndAmount getCreditNoteAmount() {
		return creditNoteAmount;
	}

	public void setCreditNoteAmount(ActiveOrHistoricCurrencyAndAmount creditNoteAmount) {
		this.creditNoteAmount = creditNoteAmount;
	}

	public List<TaxAmountAndType1> getTaxAmount() {
		return taxAmount;
	}

	public void setTaxAmount(List<com.tools20022.repository.msg.TaxAmountAndType1> taxAmount) {
		this.taxAmount = taxAmount;
	}

	public List<DocumentAdjustment1> getAdjustmentAmountAndReason() {
		return adjustmentAmountAndReason;
	}

	public void setAdjustmentAmountAndReason(List<com.tools20022.repository.msg.DocumentAdjustment1> adjustmentAmountAndReason) {
		this.adjustmentAmountAndReason = adjustmentAmountAndReason;
	}

	public ActiveOrHistoricCurrencyAndAmount getRemittedAmount() {
		return remittedAmount;
	}

	public void setRemittedAmount(ActiveOrHistoricCurrencyAndAmount remittedAmount) {
		this.remittedAmount = remittedAmount;
	}
}