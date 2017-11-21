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
import com.tools20022.repository.area.caaa.AcceptorReconciliationResponseV02;
import com.tools20022.repository.area.caaa.AcceptorReconciliationResponseV03;
import com.tools20022.repository.entity.CardPayment;
import com.tools20022.repository.entity.CardPaymentStatus;
import com.tools20022.repository.entity.CardPaymentValidation;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Reconciliation response from the acquirer.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorReconciliationResponse2#mmEnvironment
 * AcceptorReconciliationResponse2.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorReconciliationResponse2#mmTransactionResponse
 * AcceptorReconciliationResponse2.mmTransactionResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorReconciliationResponse2#mmTransaction
 * AcceptorReconciliationResponse2.mmTransaction}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CardPaymentStatus
 * CardPaymentStatus}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorReconciliationResponseV02#mmReconciliationResponse
 * AcceptorReconciliationResponseV02.mmReconciliationResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorReconciliationResponseV03#mmReconciliationResponse
 * AcceptorReconciliationResponseV03.mmReconciliationResponse}</li>
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
 * "AcceptorReconciliationResponse2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Reconciliation response from the acquirer."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorReconciliationResponse3
 * AcceptorReconciliationResponse3}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.AcceptorReconciliationResponse1
 * AcceptorReconciliationResponse1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "AcceptorReconciliationResponse2", propOrder = {"environment", "transactionResponse", "transaction"})
public class AcceptorReconciliationResponse2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected CardPaymentEnvironment19 environment;
	/**
	 * Environment of the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment19
	 * CardPaymentEnvironment19}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentStatus#mmCardPayment
	 * CardPaymentStatus.mmCardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorReconciliationResponse2
	 * AcceptorReconciliationResponse2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Envt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Environment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Environment of the transaction."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorReconciliationResponse3#mmEnvironment
	 * AcceptorReconciliationResponse3.mmEnvironment}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmEnvironment = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CardPaymentStatus.mmCardPayment;
			componentContext_lazy = () -> AcceptorReconciliationResponse2.mmObject();
			isDerived = false;
			xmlTag = "Envt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Environment";
			definition = "Environment of the transaction.";
			nextVersions_lazy = () -> Arrays.asList(AcceptorReconciliationResponse3.mmEnvironment);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CardPaymentEnvironment19.mmObject();
		}
	};
	protected ResponseType1 transactionResponse;
	/**
	 * Response from the acquirer to the reconciliation transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ResponseType1
	 * ResponseType1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation#mmResponse
	 * CardPaymentValidation.mmResponse}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorReconciliationResponse2
	 * AcceptorReconciliationResponse2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxRspn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionResponse"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Response from the acquirer to the reconciliation transaction."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorReconciliationResponse3#mmTransactionResponse
	 * AcceptorReconciliationResponse3.mmTransactionResponse}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTransactionResponse = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CardPaymentValidation.mmResponse;
			componentContext_lazy = () -> AcceptorReconciliationResponse2.mmObject();
			isDerived = false;
			xmlTag = "TxRspn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionResponse";
			definition = "Response from the acquirer to the reconciliation transaction.";
			nextVersions_lazy = () -> Arrays.asList(AcceptorReconciliationResponse3.mmTransactionResponse);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ResponseType1.mmObject();
		}
	};
	protected TransactionReconciliation2 transaction;
	/**
	 * Reconciliation transaction between an acceptor an acquirer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.TransactionReconciliation2
	 * TransactionReconciliation2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment#mmReconciliation
	 * CardPayment.mmReconciliation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorReconciliationResponse2
	 * AcceptorReconciliationResponse2}</li>
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
	 * definition} =
	 * "Reconciliation transaction between an acceptor an acquirer."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorReconciliationResponse3#mmTransaction
	 * AcceptorReconciliationResponse3.mmTransaction}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTransaction = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CardPayment.mmReconciliation;
			componentContext_lazy = () -> AcceptorReconciliationResponse2.mmObject();
			isDerived = false;
			xmlTag = "Tx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Transaction";
			definition = "Reconciliation transaction between an acceptor an acquirer.";
			nextVersions_lazy = () -> Arrays.asList(AcceptorReconciliationResponse3.mmTransaction);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.TransactionReconciliation2.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(AcceptorReconciliationResponse2.mmEnvironment, AcceptorReconciliationResponse2.mmTransactionResponse, AcceptorReconciliationResponse2.mmTransaction);
				messageBuildingBlock_lazy = () -> Arrays.asList(AcceptorReconciliationResponseV02.mmReconciliationResponse, AcceptorReconciliationResponseV03.mmReconciliationResponse);
				trace_lazy = () -> CardPaymentStatus.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AcceptorReconciliationResponse2";
				definition = "Reconciliation response from the acquirer.";
				nextVersions_lazy = () -> Arrays.asList(AcceptorReconciliationResponse3.mmObject());
				previousVersion_lazy = () -> AcceptorReconciliationResponse1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Envt", required = true)
	public CardPaymentEnvironment19 getEnvironment() {
		return environment;
	}

	public void setEnvironment(com.tools20022.repository.msg.CardPaymentEnvironment19 environment) {
		this.environment = environment;
	}

	@XmlElement(name = "TxRspn", required = true)
	public ResponseType1 getTransactionResponse() {
		return transactionResponse;
	}

	public void setTransactionResponse(com.tools20022.repository.msg.ResponseType1 transactionResponse) {
		this.transactionResponse = transactionResponse;
	}

	@XmlElement(name = "Tx", required = true)
	public TransactionReconciliation2 getTransaction() {
		return transaction;
	}

	public void setTransaction(com.tools20022.repository.msg.TransactionReconciliation2 transaction) {
		this.transaction = transaction;
	}
}