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
import com.tools20022.repository.choice.PaymentMethod1Choice;
import com.tools20022.repository.datatype.Max210Text;
import com.tools20022.repository.entity.CashAccountService;
import com.tools20022.repository.entity.Invoice;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.PartyIdentification43;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information supplied to enable the matching/reconciliation of an entry with
 * the items that the payment is intended to settle, such as commercial invoices
 * in an accounts' receivable system, in a structured form.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.InvoiceLegalIssue1#mmInvoicer
 * InvoiceLegalIssue1.mmInvoicer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvoiceLegalIssue1#mmInvoicee
 * InvoiceLegalIssue1.mmInvoicee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvoiceLegalIssue1#mmInvoiceLegalStatement
 * InvoiceLegalIssue1.mmInvoiceLegalStatement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvoiceLegalIssue1#mmPaymentMethod
 * InvoiceLegalIssue1.mmPaymentMethod}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Invoice Invoice}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "InvoiceLegalIssue1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Information supplied to enable the matching/reconciliation of an entry with the items that the payment is intended to settle, such as commercial invoices in an accounts' receivable system, in a structured form."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "InvoiceLegalIssue1", propOrder = {"invoicer", "invoicee", "invoiceLegalStatement", "paymentMethod"})
public class InvoiceLegalIssue1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Invcr", required = true)
	protected PartyIdentification43 invoicer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification43
	 * PartyIdentification43}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvoiceLegalIssue1
	 * InvoiceLegalIssue1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Invcr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Invoicer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the organisation issuing the invoice, when it is different from the creditor or ultimate creditor."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InvoiceLegalIssue1, PartyIdentification43> mmInvoicer = new MMMessageAssociationEnd<InvoiceLegalIssue1, PartyIdentification43>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvoiceLegalIssue1.mmObject();
			isDerived = false;
			xmlTag = "Invcr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Invoicer";
			definition = "Identification of the organisation issuing the invoice, when it is different from the creditor or ultimate creditor.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PartyIdentification43.mmObject();
		}

		@Override
		public PartyIdentification43 getValue(InvoiceLegalIssue1 obj) {
			return obj.getInvoicer();
		}

		@Override
		public void setValue(InvoiceLegalIssue1 obj, PartyIdentification43 value) {
			obj.setInvoicer(value);
		}
	};
	@XmlElement(name = "Invcee", required = true)
	protected PartyIdentification43 invoicee;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification43
	 * PartyIdentification43}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvoiceLegalIssue1
	 * InvoiceLegalIssue1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Invcee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Invoicee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the party to whom an invoice is issued, when it is different from the debtor or ultimate debtor."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InvoiceLegalIssue1, PartyIdentification43> mmInvoicee = new MMMessageAssociationEnd<InvoiceLegalIssue1, PartyIdentification43>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvoiceLegalIssue1.mmObject();
			isDerived = false;
			xmlTag = "Invcee";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Invoicee";
			definition = "Identification of the party to whom an invoice is issued, when it is different from the debtor or ultimate debtor.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PartyIdentification43.mmObject();
		}

		@Override
		public PartyIdentification43 getValue(InvoiceLegalIssue1 obj) {
			return obj.getInvoicee();
		}

		@Override
		public void setValue(InvoiceLegalIssue1 obj, PartyIdentification43 value) {
			obj.setInvoicee(value);
		}
	};
	@XmlElement(name = "InvcLglStmt")
	protected Max210Text invoiceLegalStatement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max210Text
	 * Max210Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Invoice Invoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvoiceLegalIssue1
	 * InvoiceLegalIssue1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InvcLglStmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvoiceLegalStatement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information, in free text form, to complement the structured remittance information."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvoiceLegalIssue1, Optional<Max210Text>> mmInvoiceLegalStatement = new MMMessageAttribute<InvoiceLegalIssue1, Optional<Max210Text>>() {
		{
			businessComponentTrace_lazy = () -> Invoice.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.InvoiceLegalIssue1.mmObject();
			isDerived = false;
			xmlTag = "InvcLglStmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvoiceLegalStatement";
			definition = "Additional information, in free text form, to complement the structured remittance information.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max210Text.mmObject();
		}

		@Override
		public Optional<Max210Text> getValue(InvoiceLegalIssue1 obj) {
			return obj.getInvoiceLegalStatement();
		}

		@Override
		public void setValue(InvoiceLegalIssue1 obj, Optional<Max210Text> value) {
			obj.setInvoiceLegalStatement(value.orElse(null));
		}
	};
	@XmlElement(name = "PmtMtd")
	protected PaymentMethod1Choice paymentMethod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PaymentMethod1Choice
	 * PaymentMethod1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashAccountService#mmPaymentMethod
	 * CashAccountService.mmPaymentMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvoiceLegalIssue1
	 * InvoiceLegalIssue1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtMtd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Method of payment for the remittance of the CSD or NCB to the invoicing party."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InvoiceLegalIssue1, Optional<PaymentMethod1Choice>> mmPaymentMethod = new MMMessageAssociationEnd<InvoiceLegalIssue1, Optional<PaymentMethod1Choice>>() {
		{
			businessElementTrace_lazy = () -> CashAccountService.mmPaymentMethod;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvoiceLegalIssue1.mmObject();
			isDerived = false;
			xmlTag = "PmtMtd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentMethod";
			definition = "Method of payment for the remittance of the CSD or NCB to the invoicing party.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PaymentMethod1Choice.mmObject();
		}

		@Override
		public Optional<PaymentMethod1Choice> getValue(InvoiceLegalIssue1 obj) {
			return obj.getPaymentMethod();
		}

		@Override
		public void setValue(InvoiceLegalIssue1 obj, Optional<PaymentMethod1Choice> value) {
			obj.setPaymentMethod(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvoiceLegalIssue1.mmInvoicer, com.tools20022.repository.msg.InvoiceLegalIssue1.mmInvoicee,
						com.tools20022.repository.msg.InvoiceLegalIssue1.mmInvoiceLegalStatement, com.tools20022.repository.msg.InvoiceLegalIssue1.mmPaymentMethod);
				trace_lazy = () -> Invoice.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "InvoiceLegalIssue1";
				definition = "Information supplied to enable the matching/reconciliation of an entry with the items that the payment is intended to settle, such as commercial invoices in an accounts' receivable system, in a structured form.";
			}
		});
		return mmObject_lazy.get();
	}

	public PartyIdentification43 getInvoicer() {
		return invoicer;
	}

	public InvoiceLegalIssue1 setInvoicer(PartyIdentification43 invoicer) {
		this.invoicer = Objects.requireNonNull(invoicer);
		return this;
	}

	public PartyIdentification43 getInvoicee() {
		return invoicee;
	}

	public InvoiceLegalIssue1 setInvoicee(PartyIdentification43 invoicee) {
		this.invoicee = Objects.requireNonNull(invoicee);
		return this;
	}

	public Optional<Max210Text> getInvoiceLegalStatement() {
		return invoiceLegalStatement == null ? Optional.empty() : Optional.of(invoiceLegalStatement);
	}

	public InvoiceLegalIssue1 setInvoiceLegalStatement(Max210Text invoiceLegalStatement) {
		this.invoiceLegalStatement = invoiceLegalStatement;
		return this;
	}

	public Optional<PaymentMethod1Choice> getPaymentMethod() {
		return paymentMethod == null ? Optional.empty() : Optional.of(paymentMethod);
	}

	public InvoiceLegalIssue1 setPaymentMethod(PaymentMethod1Choice paymentMethod) {
		this.paymentMethod = paymentMethod;
		return this;
	}
}