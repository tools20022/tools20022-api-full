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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Transactions5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Reports on transactions."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Transactions6 Transactions6}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "Transactions5", propOrder = {"paymentCommonInformation", "transactionsSummary", "transactionReport"})
public class Transactions5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected PaymentCommon1 paymentCommonInformation;
	/**
	 * Common detailed payment instruction information.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentCommonInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Common detailed payment instruction information."</li>
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
	public static final MMMessageAssociationEnd mmPaymentCommonInformation = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> Transactions5.mmObject();
			isDerived = false;
			xmlTag = "PmtCmonInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentCommonInformation";
			definition = "Common detailed payment instruction information.";
			nextVersions_lazy = () -> Arrays.asList(Transactions6.mmPaymentCommonInformation);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PaymentCommon1.mmObject();
		}
	};
	protected NumberAndSumOfTransactions2 transactionsSummary;
	/**
	 * Indicates the total number and sum of the transactions.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionsSummary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the total number and sum of the transactions."</li>
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
	public static final MMMessageAssociationEnd mmTransactionsSummary = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> Transactions5.mmObject();
			isDerived = false;
			xmlTag = "TxsSummry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionsSummary";
			definition = "Indicates the total number and sum of the transactions.";
			nextVersions_lazy = () -> Arrays.asList(Transactions6.mmTransactionsSummary);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.NumberAndSumOfTransactions2.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.TransactionReport1> transactionReport;
	/**
	 * Reports either on the transaction information or on a business error.
	 * <p>
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
	public static final MMMessageAssociationEnd mmTransactionReport = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> Transactions5.mmObject();
			isDerived = false;
			xmlTag = "TxRpt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionReport";
			definition = "Reports either on the transaction information or on a business error.";
			nextVersions_lazy = () -> Arrays.asList(Transactions6.mmTransactionReport);
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.TransactionReport1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(Transactions5.mmPaymentCommonInformation, Transactions5.mmTransactionsSummary, Transactions5.mmTransactionReport);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "Transactions5";
				definition = "Reports on transactions.";
				nextVersions_lazy = () -> Arrays.asList(Transactions6.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "PmtCmonInf")
	public PaymentCommon1 getPaymentCommonInformation() {
		return paymentCommonInformation;
	}

	public void setPaymentCommonInformation(com.tools20022.repository.msg.PaymentCommon1 paymentCommonInformation) {
		this.paymentCommonInformation = paymentCommonInformation;
	}

	@XmlElement(name = "TxsSummry")
	public NumberAndSumOfTransactions2 getTransactionsSummary() {
		return transactionsSummary;
	}

	public void setTransactionsSummary(com.tools20022.repository.msg.NumberAndSumOfTransactions2 transactionsSummary) {
		this.transactionsSummary = transactionsSummary;
	}

	@XmlElement(name = "TxRpt", required = true)
	public List<TransactionReport1> getTransactionReport() {
		return transactionReport;
	}

	public void setTransactionReport(List<com.tools20022.repository.msg.TransactionReport1> transactionReport) {
		this.transactionReport = transactionReport;
	}
}