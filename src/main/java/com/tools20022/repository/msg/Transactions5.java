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
import com.tools20022.repository.msg.NumberAndSumOfTransactions2;
import com.tools20022.repository.msg.PaymentCommon1;
import com.tools20022.repository.msg.TransactionReport1;
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
 * {@linkplain com.tools20022.repository.msg.Transactions5#mmPaymentCommonInformation
 * Transactions5.mmPaymentCommonInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transactions5#mmTransactionsSummary
 * Transactions5.mmTransactionsSummary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transactions5#mmTransactionReport
 * Transactions5.mmTransactionReport}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Transactions5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Reports on transactions."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintPaymentInstructionStatusRule#forTransactions5
 * ConstraintPaymentInstructionStatusRule.forTransactions5}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintTransferValueDateRule#forTransactions5
 * ConstraintTransferValueDateRule.forTransactions5}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCreditDebitIndicator1Rule#forTransactions5
 * ConstraintCreditDebitIndicator1Rule.forTransactions5}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Transactions6 Transactions6}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Transactions5", propOrder = {"paymentCommonInformation", "transactionsSummary", "transactionReport"})
public class Transactions5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PmtCmonInf")
	protected PaymentCommon1 paymentCommonInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PaymentCommon1
	 * PaymentCommon1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Transactions5 Transactions5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtCmonInf"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentCommonInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Common detailed payment instruction information."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transactions6#mmPaymentCommonInformation
	 * Transactions6.mmPaymentCommonInformation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Transactions5, Optional<PaymentCommon1>> mmPaymentCommonInformation = new MMMessageAssociationEnd<Transactions5, Optional<PaymentCommon1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Transactions5.mmObject();
			isDerived = false;
			xmlTag = "PmtCmonInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentCommonInformation";
			definition = "Common detailed payment instruction information.";
			nextVersions_lazy = () -> Arrays.asList(Transactions6.mmPaymentCommonInformation);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PaymentCommon1.mmObject();
		}

		@Override
		public Optional<PaymentCommon1> getValue(Transactions5 obj) {
			return obj.getPaymentCommonInformation();
		}

		@Override
		public void setValue(Transactions5 obj, Optional<PaymentCommon1> value) {
			obj.setPaymentCommonInformation(value.orElse(null));
		}
	};
	@XmlElement(name = "TxsSummry")
	protected NumberAndSumOfTransactions2 transactionsSummary;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.NumberAndSumOfTransactions2
	 * NumberAndSumOfTransactions2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Transactions5 Transactions5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxsSummry"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionsSummary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the total number and sum of the transactions."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transactions6#mmTransactionsSummary
	 * Transactions6.mmTransactionsSummary}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Transactions5, Optional<NumberAndSumOfTransactions2>> mmTransactionsSummary = new MMMessageAssociationEnd<Transactions5, Optional<NumberAndSumOfTransactions2>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Transactions5.mmObject();
			isDerived = false;
			xmlTag = "TxsSummry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionsSummary";
			definition = "Indicates the total number and sum of the transactions.";
			nextVersions_lazy = () -> Arrays.asList(Transactions6.mmTransactionsSummary);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> NumberAndSumOfTransactions2.mmObject();
		}

		@Override
		public Optional<NumberAndSumOfTransactions2> getValue(Transactions5 obj) {
			return obj.getTransactionsSummary();
		}

		@Override
		public void setValue(Transactions5 obj, Optional<NumberAndSumOfTransactions2> value) {
			obj.setTransactionsSummary(value.orElse(null));
		}
	};
	@XmlElement(name = "TxRpt", required = true)
	protected List<TransactionReport1> transactionReport;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TransactionReport1
	 * TransactionReport1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Transactions5 Transactions5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxRpt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionReport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reports either on the transaction information or on a business error."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transactions6#mmTransactionReport
	 * Transactions6.mmTransactionReport}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Transactions5, List<TransactionReport1>> mmTransactionReport = new MMMessageAssociationEnd<Transactions5, List<TransactionReport1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Transactions5.mmObject();
			isDerived = false;
			xmlTag = "TxRpt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionReport";
			definition = "Reports either on the transaction information or on a business error.";
			nextVersions_lazy = () -> Arrays.asList(Transactions6.mmTransactionReport);
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> TransactionReport1.mmObject();
		}

		@Override
		public List<TransactionReport1> getValue(Transactions5 obj) {
			return obj.getTransactionReport();
		}

		@Override
		public void setValue(Transactions5 obj, List<TransactionReport1> value) {
			obj.setTransactionReport(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Transactions5.mmPaymentCommonInformation, com.tools20022.repository.msg.Transactions5.mmTransactionsSummary,
						com.tools20022.repository.msg.Transactions5.mmTransactionReport);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPaymentInstructionStatusRule.forTransactions5, com.tools20022.repository.constraints.ConstraintTransferValueDateRule.forTransactions5,
						com.tools20022.repository.constraints.ConstraintCreditDebitIndicator1Rule.forTransactions5);
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "Transactions5";
				definition = "Reports on transactions.";
				nextVersions_lazy = () -> Arrays.asList(Transactions6.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<PaymentCommon1> getPaymentCommonInformation() {
		return paymentCommonInformation == null ? Optional.empty() : Optional.of(paymentCommonInformation);
	}

	public Transactions5 setPaymentCommonInformation(PaymentCommon1 paymentCommonInformation) {
		this.paymentCommonInformation = paymentCommonInformation;
		return this;
	}

	public Optional<NumberAndSumOfTransactions2> getTransactionsSummary() {
		return transactionsSummary == null ? Optional.empty() : Optional.of(transactionsSummary);
	}

	public Transactions5 setTransactionsSummary(NumberAndSumOfTransactions2 transactionsSummary) {
		this.transactionsSummary = transactionsSummary;
		return this;
	}

	public List<TransactionReport1> getTransactionReport() {
		return transactionReport == null ? transactionReport = new ArrayList<>() : transactionReport;
	}

	public Transactions5 setTransactionReport(List<TransactionReport1> transactionReport) {
		this.transactionReport = Objects.requireNonNull(transactionReport);
		return this;
	}
}