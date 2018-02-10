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
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Reports on transactions.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transactions3#mmPaymentCommonInformation
 * Transactions3.mmPaymentCommonInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transactions3#mmTransactionReport
 * Transactions3.mmTransactionReport}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintPaymentInstructionStatusRule#forTransactions3
 * ConstraintPaymentInstructionStatusRule.forTransactions3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintTransferValueDateRule#forTransactions3
 * ConstraintTransferValueDateRule.forTransactions3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintPaymentMessageTypeRule#forTransactions3
 * ConstraintPaymentMessageTypeRule.forTransactions3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCreditDebitIndicator1Rule#forTransactions3
 * ConstraintCreditDebitIndicator1Rule.forTransactions3}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Transactions3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Reports on transactions."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Transactions3", propOrder = {"paymentCommonInformation", "transactionReport"})
public class Transactions3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PmtCmonInf")
	protected PaymentCommonDetails3 paymentCommonInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PaymentCommonDetails3
	 * PaymentCommonDetails3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Transactions3 Transactions3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtCmonInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentCommonInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Common detailed payment instruction information."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPaymentCommonInformation = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Transactions3.mmObject();
			isDerived = false;
			xmlTag = "PmtCmonInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentCommonInformation";
			definition = "Common detailed payment instruction information.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PaymentCommonDetails3.mmObject();
		}
	};
	@XmlElement(name = "TxRpt", required = true)
	protected List<com.tools20022.repository.msg.TransactionReportDetails4> transactionReport;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.TransactionReportDetails4
	 * TransactionReportDetails4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Transactions3 Transactions3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxRpt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionReport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reports either on the transaction information or on a business error."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTransactionReport = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Transactions3.mmObject();
			isDerived = false;
			xmlTag = "TxRpt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionReport";
			definition = "Reports either on the transaction information or on a business error.";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.TransactionReportDetails4.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Transactions3.mmPaymentCommonInformation, com.tools20022.repository.msg.Transactions3.mmTransactionReport);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPaymentInstructionStatusRule.forTransactions3, com.tools20022.repository.constraints.ConstraintTransferValueDateRule.forTransactions3,
						com.tools20022.repository.constraints.ConstraintPaymentMessageTypeRule.forTransactions3, com.tools20022.repository.constraints.ConstraintCreditDebitIndicator1Rule.forTransactions3);
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "Transactions3";
				definition = "Reports on transactions.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<PaymentCommonDetails3> getPaymentCommonInformation() {
		return paymentCommonInformation == null ? Optional.empty() : Optional.of(paymentCommonInformation);
	}

	public Transactions3 setPaymentCommonInformation(com.tools20022.repository.msg.PaymentCommonDetails3 paymentCommonInformation) {
		this.paymentCommonInformation = paymentCommonInformation;
		return this;
	}

	public List<TransactionReportDetails4> getTransactionReport() {
		return transactionReport == null ? transactionReport = new ArrayList<>() : transactionReport;
	}

	public Transactions3 setTransactionReport(List<com.tools20022.repository.msg.TransactionReportDetails4> transactionReport) {
		this.transactionReport = Objects.requireNonNull(transactionReport);
		return this;
	}
}