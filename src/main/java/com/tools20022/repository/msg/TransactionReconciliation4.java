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
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Max70Text;
import com.tools20022.repository.datatype.TrueFalseIndicator;
import com.tools20022.repository.entity.CardPayment;
import com.tools20022.repository.entity.ReconciliationTransaction;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Reconciliation transaction between an acceptor and an acquirer.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionReconciliation4#mmClosePeriod
 * TransactionReconciliation4.mmClosePeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionReconciliation4#mmReconciliationTransactionIdentification
 * TransactionReconciliation4.mmReconciliationTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionReconciliation4#mmReconciliationIdentification
 * TransactionReconciliation4.mmReconciliationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionReconciliation4#mmTransactionTotals
 * TransactionReconciliation4.mmTransactionTotals}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionReconciliation4#mmAdditionalTransactionData
 * TransactionReconciliation4.mmAdditionalTransactionData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.ReconciliationTransaction
 * ReconciliationTransaction}</li>
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
 * "TransactionReconciliation4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Reconciliation transaction between an acceptor and an acquirer."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.TransactionReconciliation3
 * TransactionReconciliation3}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TransactionReconciliation4", propOrder = {"closePeriod", "reconciliationTransactionIdentification", "reconciliationIdentification", "transactionTotals", "additionalTransactionData"})
public class TransactionReconciliation4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "ClsPrd")
	protected TrueFalseIndicator closePeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionReconciliation4
	 * TransactionReconciliation4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClsPrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClosePeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates if the transaction requires a closure of the reconciliation period."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TransactionReconciliation3#mmClosePeriod
	 * TransactionReconciliation3.mmClosePeriod}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmClosePeriod = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionReconciliation4.mmObject();
			isDerived = false;
			xmlTag = "ClsPrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClosePeriod";
			definition = "Indicates if the transaction requires a closure of the reconciliation period.";
			previousVersion_lazy = () -> TransactionReconciliation3.mmClosePeriod;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	@XmlElement(name = "RcncltnTxId", required = true)
	protected TransactionIdentifier1 reconciliationTransactionIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TransactionIdentifier1
	 * TransactionIdentifier1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment#mmCardPaymentAcquiring
	 * CardPayment.mmCardPaymentAcquiring}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionReconciliation4
	 * TransactionReconciliation4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcncltnTxId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReconciliationTransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unique identification of a reconciliation transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TransactionReconciliation3#mmReconciliationTransactionIdentification
	 * TransactionReconciliation3.mmReconciliationTransactionIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmReconciliationTransactionIdentification = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CardPayment.mmCardPaymentAcquiring;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionReconciliation4.mmObject();
			isDerived = false;
			xmlTag = "RcncltnTxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReconciliationTransactionIdentification";
			definition = "Unique identification of a reconciliation transaction.";
			previousVersion_lazy = () -> TransactionReconciliation3.mmReconciliationTransactionIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.TransactionIdentifier1.mmObject();
		}
	};
	@XmlElement(name = "RcncltnId", required = true)
	protected Max35Text reconciliationIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ReconciliationTransaction#mmReconciliationIdentification
	 * ReconciliationTransaction.mmReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionReconciliation4
	 * TransactionReconciliation4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcncltnId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReconciliationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification of the reconciliation period between the acceptor and the acquirer."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TransactionReconciliation3#mmReconciliationIdentification
	 * TransactionReconciliation3.mmReconciliationIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReconciliationIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ReconciliationTransaction.mmReconciliationIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionReconciliation4.mmObject();
			isDerived = false;
			xmlTag = "RcncltnId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReconciliationIdentification";
			definition = "Unique identification of the reconciliation period between the acceptor and the acquirer.";
			previousVersion_lazy = () -> TransactionReconciliation3.mmReconciliationIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "TxTtls")
	protected List<com.tools20022.repository.msg.TransactionTotals7> transactionTotals;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TransactionTotals7
	 * TransactionTotals7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionReconciliation4
	 * TransactionReconciliation4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxTtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionTotals"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction totals during the reconciliation period for a certain type of transaction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TransactionReconciliation3#mmTransactionTotals
	 * TransactionReconciliation3.mmTransactionTotals}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTransactionTotals = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionReconciliation4.mmObject();
			isDerived = false;
			xmlTag = "TxTtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionTotals";
			definition = "Transaction totals during the reconciliation period for a certain type of transaction.";
			previousVersion_lazy = () -> TransactionReconciliation3.mmTransactionTotals;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.TransactionTotals7.mmObject();
		}
	};
	@XmlElement(name = "AddtlTxData")
	protected Max70Text additionalTransactionData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionReconciliation4
	 * TransactionReconciliation4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlTxData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalTransactionData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information related to the reconciliation transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TransactionReconciliation3#mmAdditionalTransactionData
	 * TransactionReconciliation3.mmAdditionalTransactionData}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAdditionalTransactionData = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionReconciliation4.mmObject();
			isDerived = false;
			xmlTag = "AddtlTxData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalTransactionData";
			definition = "Additional information related to the reconciliation transaction.";
			previousVersion_lazy = () -> TransactionReconciliation3.mmAdditionalTransactionData;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransactionReconciliation4.mmClosePeriod, com.tools20022.repository.msg.TransactionReconciliation4.mmReconciliationTransactionIdentification,
						com.tools20022.repository.msg.TransactionReconciliation4.mmReconciliationIdentification, com.tools20022.repository.msg.TransactionReconciliation4.mmTransactionTotals,
						com.tools20022.repository.msg.TransactionReconciliation4.mmAdditionalTransactionData);
				trace_lazy = () -> ReconciliationTransaction.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TransactionReconciliation4";
				definition = "Reconciliation transaction between an acceptor and an acquirer.";
				previousVersion_lazy = () -> TransactionReconciliation3.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<TrueFalseIndicator> getClosePeriod() {
		return closePeriod == null ? Optional.empty() : Optional.of(closePeriod);
	}

	public TransactionReconciliation4 setClosePeriod(TrueFalseIndicator closePeriod) {
		this.closePeriod = closePeriod;
		return this;
	}

	public TransactionIdentifier1 getReconciliationTransactionIdentification() {
		return reconciliationTransactionIdentification;
	}

	public TransactionReconciliation4 setReconciliationTransactionIdentification(com.tools20022.repository.msg.TransactionIdentifier1 reconciliationTransactionIdentification) {
		this.reconciliationTransactionIdentification = Objects.requireNonNull(reconciliationTransactionIdentification);
		return this;
	}

	public Max35Text getReconciliationIdentification() {
		return reconciliationIdentification;
	}

	public TransactionReconciliation4 setReconciliationIdentification(Max35Text reconciliationIdentification) {
		this.reconciliationIdentification = Objects.requireNonNull(reconciliationIdentification);
		return this;
	}

	public List<TransactionTotals7> getTransactionTotals() {
		return transactionTotals == null ? transactionTotals = new ArrayList<>() : transactionTotals;
	}

	public TransactionReconciliation4 setTransactionTotals(List<com.tools20022.repository.msg.TransactionTotals7> transactionTotals) {
		this.transactionTotals = Objects.requireNonNull(transactionTotals);
		return this;
	}

	public Optional<Max70Text> getAdditionalTransactionData() {
		return additionalTransactionData == null ? Optional.empty() : Optional.of(additionalTransactionData);
	}

	public TransactionReconciliation4 setAdditionalTransactionData(Max70Text additionalTransactionData) {
		this.additionalTransactionData = additionalTransactionData;
		return this;
	}
}