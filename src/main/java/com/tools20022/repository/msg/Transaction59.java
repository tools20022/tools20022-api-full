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
import com.tools20022.repository.codeset.CreditDebitCode;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.entity.System;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CashAccountAndEntry2;
import com.tools20022.repository.msg.PaymentInstruction26;
import com.tools20022.repository.msg.SecuritiesTransactionReferences1;
import com.tools20022.repository.msg.System1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information related to the payment transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Transaction59#mmPaymentTo
 * Transaction59.mmPaymentTo}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transaction59#mmPaymentFrom
 * Transaction59.mmPaymentFrom}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transaction59#mmCreditDebitIndicator
 * Transaction59.mmCreditDebitIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transaction59#mmPayment
 * Transaction59.mmPayment}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transaction59#mmAccountEntry
 * Transaction59.mmAccountEntry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transaction59#mmSecuritiesTransactionReferences
 * Transaction59.mmSecuritiesTransactionReferences}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Transaction59"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information related to the payment transaction."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCreditDebitIndicatorGuideline#forTransaction59
 * ConstraintCreditDebitIndicatorGuideline.forTransaction59}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintTransactionCreditDebitIndicatorRule#forTransaction59
 * ConstraintTransactionCreditDebitIndicatorRule.forTransaction59}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.Transaction33
 * Transaction33}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Transaction59", propOrder = {"paymentTo", "paymentFrom", "creditDebitIndicator", "payment", "accountEntry", "securitiesTransactionReferences"})
public class Transaction59 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PmtTo")
	protected System1 paymentTo;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.System1 System1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.System System}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Transaction59 Transaction59}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtTo"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentTo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Destination of the payment (be it a member or a system or both)."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Transaction33#mmPaymentTo
	 * Transaction33.mmPaymentTo}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Transaction59, Optional<System1>> mmPaymentTo = new MMMessageAssociationEnd<Transaction59, Optional<System1>>() {
		{
			businessComponentTrace_lazy = () -> System.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.Transaction59.mmObject();
			isDerived = false;
			xmlTag = "PmtTo";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentTo";
			definition = "Destination of the payment (be it a member or a system or both).";
			previousVersion_lazy = () -> Transaction33.mmPaymentTo;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> System1.mmObject();
		}

		@Override
		public Optional<System1> getValue(Transaction59 obj) {
			return obj.getPaymentTo();
		}

		@Override
		public void setValue(Transaction59 obj, Optional<System1> value) {
			obj.setPaymentTo(value.orElse(null));
		}
	};
	@XmlElement(name = "PmtFr")
	protected System1 paymentFrom;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.System1 System1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.System System}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Transaction59 Transaction59}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtFr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentFrom"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Origin of the payment (be it a member or a system or both)."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Transaction33#mmPaymentFrom
	 * Transaction33.mmPaymentFrom}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Transaction59, Optional<System1>> mmPaymentFrom = new MMMessageAssociationEnd<Transaction59, Optional<System1>>() {
		{
			businessComponentTrace_lazy = () -> System.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.Transaction59.mmObject();
			isDerived = false;
			xmlTag = "PmtFr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentFrom";
			definition = "Origin of the payment (be it a member or a system or both).";
			previousVersion_lazy = () -> Transaction33.mmPaymentFrom;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> System1.mmObject();
		}

		@Override
		public Optional<System1> getValue(Transaction59 obj) {
			return obj.getPaymentFrom();
		}

		@Override
		public void setValue(Transaction59 obj, Optional<System1> value) {
			obj.setPaymentFrom(value.orElse(null));
		}
	};
	@XmlElement(name = "CdtDbtInd")
	protected CreditDebitCode creditDebitIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CreditDebitCode
	 * CreditDebitCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentExecution#mmCreditDebitIndicator
	 * PaymentExecution.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Transaction59 Transaction59}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CdtDbtInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditDebitIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the payment transaction is a debit or credit transaction. \n."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Transaction33#mmCreditDebitIndicator
	 * Transaction33.mmCreditDebitIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Transaction59, Optional<CreditDebitCode>> mmCreditDebitIndicator = new MMMessageAttribute<Transaction59, Optional<CreditDebitCode>>() {
		{
			businessElementTrace_lazy = () -> PaymentExecution.mmCreditDebitIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.Transaction59.mmObject();
			isDerived = false;
			xmlTag = "CdtDbtInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditDebitIndicator";
			definition = "Indicates whether the payment transaction is a debit or credit transaction. \n.";
			previousVersion_lazy = () -> Transaction33.mmCreditDebitIndicator;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CreditDebitCode.mmObject();
		}

		@Override
		public Optional<CreditDebitCode> getValue(Transaction59 obj) {
			return obj.getCreditDebitIndicator();
		}

		@Override
		public void setValue(Transaction59 obj, Optional<CreditDebitCode> value) {
			obj.setCreditDebitIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "Pmt")
	protected PaymentInstruction26 payment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PaymentInstruction26
	 * PaymentInstruction26}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInstruction
	 * PaymentInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Transaction59 Transaction59}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Pmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Payment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instruction to pay an amount of money to an ultimate beneficiary, on behalf of an originator. This instruction may have to be forwarded several times to complete the settlement chain.\n."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Transaction33#mmPayment
	 * Transaction33.mmPayment}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Transaction59, Optional<PaymentInstruction26>> mmPayment = new MMMessageAssociationEnd<Transaction59, Optional<PaymentInstruction26>>() {
		{
			businessComponentTrace_lazy = () -> PaymentInstruction.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.Transaction59.mmObject();
			isDerived = false;
			xmlTag = "Pmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Payment";
			definition = "Instruction to pay an amount of money to an ultimate beneficiary, on behalf of an originator. This instruction may have to be forwarded several times to complete the settlement chain.\n.";
			previousVersion_lazy = () -> Transaction33.mmPayment;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PaymentInstruction26.mmObject();
		}

		@Override
		public Optional<PaymentInstruction26> getValue(Transaction59 obj) {
			return obj.getPayment();
		}

		@Override
		public void setValue(Transaction59 obj, Optional<PaymentInstruction26> value) {
			obj.setPayment(value.orElse(null));
		}
	};
	@XmlElement(name = "AcctNtry")
	protected CashAccountAndEntry2 accountEntry;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashAccountAndEntry2
	 * CashAccountAndEntry2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.BookEntry#mmCashEntry
	 * BookEntry.mmCashEntry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Transaction59 Transaction59}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctNtry"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountEntry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Posting of an item to a cash account, in the context of a cash transaction, that results in an increase or decrease to the balance of the account."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Transaction33#mmAccountEntry
	 * Transaction33.mmAccountEntry}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Transaction59, Optional<CashAccountAndEntry2>> mmAccountEntry = new MMMessageAssociationEnd<Transaction59, Optional<CashAccountAndEntry2>>() {
		{
			businessElementTrace_lazy = () -> BookEntry.mmCashEntry;
			componentContext_lazy = () -> com.tools20022.repository.msg.Transaction59.mmObject();
			isDerived = false;
			xmlTag = "AcctNtry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountEntry";
			definition = "Posting of an item to a cash account, in the context of a cash transaction, that results in an increase or decrease to the balance of the account.";
			previousVersion_lazy = () -> Transaction33.mmAccountEntry;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CashAccountAndEntry2.mmObject();
		}

		@Override
		public Optional<CashAccountAndEntry2> getValue(Transaction59 obj) {
			return obj.getAccountEntry();
		}

		@Override
		public void setValue(Transaction59 obj, Optional<CashAccountAndEntry2> value) {
			obj.setAccountEntry(value.orElse(null));
		}
	};
	@XmlElement(name = "SctiesTxRefs")
	protected SecuritiesTransactionReferences1 securitiesTransactionReferences;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTransactionReferences1
	 * SecuritiesTransactionReferences1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmRelatedSecuritiesSettlement
	 * Payment.mmRelatedSecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Transaction59 Transaction59}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesTxRefs"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesTransactionReferences"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the references of the underlying securities transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Transaction59, Optional<SecuritiesTransactionReferences1>> mmSecuritiesTransactionReferences = new MMMessageAssociationEnd<Transaction59, Optional<SecuritiesTransactionReferences1>>() {
		{
			businessElementTrace_lazy = () -> Payment.mmRelatedSecuritiesSettlement;
			componentContext_lazy = () -> com.tools20022.repository.msg.Transaction59.mmObject();
			isDerived = false;
			xmlTag = "SctiesTxRefs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesTransactionReferences";
			definition = "Provides the references of the underlying securities transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SecuritiesTransactionReferences1.mmObject();
		}

		@Override
		public Optional<SecuritiesTransactionReferences1> getValue(Transaction59 obj) {
			return obj.getSecuritiesTransactionReferences();
		}

		@Override
		public void setValue(Transaction59 obj, Optional<SecuritiesTransactionReferences1> value) {
			obj.setSecuritiesTransactionReferences(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Transaction59.mmPaymentTo, com.tools20022.repository.msg.Transaction59.mmPaymentFrom,
						com.tools20022.repository.msg.Transaction59.mmCreditDebitIndicator, com.tools20022.repository.msg.Transaction59.mmPayment, com.tools20022.repository.msg.Transaction59.mmAccountEntry,
						com.tools20022.repository.msg.Transaction59.mmSecuritiesTransactionReferences);
				trace_lazy = () -> Payment.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCreditDebitIndicatorGuideline.forTransaction59,
						com.tools20022.repository.constraints.ConstraintTransactionCreditDebitIndicatorRule.forTransaction59);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Transaction59";
				definition = "Information related to the payment transaction.";
				previousVersion_lazy = () -> Transaction33.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<System1> getPaymentTo() {
		return paymentTo == null ? Optional.empty() : Optional.of(paymentTo);
	}

	public Transaction59 setPaymentTo(System1 paymentTo) {
		this.paymentTo = paymentTo;
		return this;
	}

	public Optional<System1> getPaymentFrom() {
		return paymentFrom == null ? Optional.empty() : Optional.of(paymentFrom);
	}

	public Transaction59 setPaymentFrom(System1 paymentFrom) {
		this.paymentFrom = paymentFrom;
		return this;
	}

	public Optional<CreditDebitCode> getCreditDebitIndicator() {
		return creditDebitIndicator == null ? Optional.empty() : Optional.of(creditDebitIndicator);
	}

	public Transaction59 setCreditDebitIndicator(CreditDebitCode creditDebitIndicator) {
		this.creditDebitIndicator = creditDebitIndicator;
		return this;
	}

	public Optional<PaymentInstruction26> getPayment() {
		return payment == null ? Optional.empty() : Optional.of(payment);
	}

	public Transaction59 setPayment(PaymentInstruction26 payment) {
		this.payment = payment;
		return this;
	}

	public Optional<CashAccountAndEntry2> getAccountEntry() {
		return accountEntry == null ? Optional.empty() : Optional.of(accountEntry);
	}

	public Transaction59 setAccountEntry(CashAccountAndEntry2 accountEntry) {
		this.accountEntry = accountEntry;
		return this;
	}

	public Optional<SecuritiesTransactionReferences1> getSecuritiesTransactionReferences() {
		return securitiesTransactionReferences == null ? Optional.empty() : Optional.of(securitiesTransactionReferences);
	}

	public Transaction59 setSecuritiesTransactionReferences(SecuritiesTransactionReferences1 securitiesTransactionReferences) {
		this.securitiesTransactionReferences = securitiesTransactionReferences;
		return this;
	}
}