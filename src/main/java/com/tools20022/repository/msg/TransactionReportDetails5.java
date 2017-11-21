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
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.metamodel.MMXor;
import com.tools20022.repository.choice.PaymentIdentification3Choice;
import com.tools20022.repository.entity.Payment;
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
 * Reports either on the transaction information or on a business error.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponent#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionReportDetails5#mmTransactionOrBusinessErrorRule
 * TransactionReportDetails5.mmTransactionOrBusinessErrorRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionReportDetails5#mmInstructionReference
 * TransactionReportDetails5.mmInstructionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionReportDetails5#mmTransaction
 * TransactionReportDetails5.mmTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionReportDetails5#mmBusinessError
 * TransactionReportDetails5.mmBusinessError}</li>
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
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TransactionReportDetails5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Reports either on the transaction information or on a business error."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "TransactionReportDetails5", propOrder = {"instructionReference", "transaction", "businessError"})
public class TransactionReportDetails5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected PaymentIdentification3Choice instructionReference;
	/**
	 * Reference to the instruction related to the payment for which information
	 * is requested.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PaymentIdentification3Choice
	 * PaymentIdentification3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmPaymentRelatedIdentifications
	 * Payment.mmPaymentRelatedIdentifications}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionReportDetails5
	 * TransactionReportDetails5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstrRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference to the instruction related to the payment for which information is requested."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInstructionReference = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Payment.mmPaymentRelatedIdentifications;
			componentContext_lazy = () -> TransactionReportDetails5.mmObject();
			isDerived = false;
			xmlTag = "InstrRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionReference";
			definition = "Reference to the instruction related to the payment for which information is requested.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PaymentIdentification3Choice.mmObject();
		}
	};
	protected Transaction5 transaction;
	/**
	 * Requested information on the payment transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Transaction5
	 * Transaction5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionReportDetails5
	 * TransactionReportDetails5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tx"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Transaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Requested information on the payment transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTransaction = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Payment.mmObject();
			componentContext_lazy = () -> TransactionReportDetails5.mmObject();
			isDerived = false;
			xmlTag = "Tx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Transaction";
			definition = "Requested information on the payment transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Transaction5.mmObject();
		}
	};
	protected ErrorHandling3 businessError;
	/**
	 * Reason why the requested business information is not given.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ErrorHandling3
	 * ErrorHandling3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionReportDetails5
	 * TransactionReportDetails5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BizErr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BusinessError"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reason why the requested business information is not given."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmBusinessError = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> TransactionReportDetails5.mmObject();
			isDerived = false;
			xmlTag = "BizErr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BusinessError";
			definition = "Reason why the requested business information is not given.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ErrorHandling3.mmObject();
		}
	};
	/**
	 * Either Transaction or BusinessError must be present, but not both.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.TransactionReportDetails5
	 * TransactionReportDetails5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionReportDetails5#mmTransaction
	 * TransactionReportDetails5.mmTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionReportDetails5#mmBusinessError
	 * TransactionReportDetails5.mmBusinessError}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionOrBusinessErrorRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either Transaction or BusinessError must be present, but not both."</li>
	 * </ul>
	 */
	public static final MMXor mmTransactionOrBusinessErrorRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionOrBusinessErrorRule";
			definition = "Either Transaction or BusinessError must be present, but not both.";
			messageComponent_lazy = () -> TransactionReportDetails5.mmObject();
			impactedElements_lazy = () -> Arrays.asList(TransactionReportDetails5.mmTransaction, TransactionReportDetails5.mmBusinessError);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(TransactionReportDetails5.mmInstructionReference, TransactionReportDetails5.mmTransaction, TransactionReportDetails5.mmBusinessError);
				trace_lazy = () -> Payment.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "TransactionReportDetails5";
				definition = "Reports either on the transaction information or on a business error.";
				xors_lazy = () -> Arrays.asList(TransactionReportDetails5.mmTransactionOrBusinessErrorRule);
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "InstrRef", required = true)
	public PaymentIdentification3Choice getInstructionReference() {
		return instructionReference;
	}

	public void setInstructionReference(PaymentIdentification3Choice instructionReference) {
		this.instructionReference = instructionReference;
	}

	@XmlElement(name = "Tx", required = true)
	public Transaction5 getTransaction() {
		return transaction;
	}

	public void setTransaction(com.tools20022.repository.msg.Transaction5 transaction) {
		this.transaction = transaction;
	}

	@XmlElement(name = "BizErr", required = true)
	public ErrorHandling3 getBusinessError() {
		return businessError;
	}

	public void setBusinessError(com.tools20022.repository.msg.ErrorHandling3 businessError) {
		this.businessError = businessError;
	}
}