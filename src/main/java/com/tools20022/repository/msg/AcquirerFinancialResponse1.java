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
import com.tools20022.repository.area.cain.AcquirerFinancialResponse;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information related to the response of a financial authorisation.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerFinancialResponse1#mmEnvironment
 * AcquirerFinancialResponse1.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerFinancialResponse1#mmContext
 * AcquirerFinancialResponse1.mmContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerFinancialResponse1#mmTransaction
 * AcquirerFinancialResponse1.mmTransaction}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.cain.AcquirerFinancialResponse#mmFinancialResponse
 * AcquirerFinancialResponse.mmFinancialResponse}</li>
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
 * "AcquirerFinancialResponse1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Information related to the response of a financial authorisation."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "AcquirerFinancialResponse1", propOrder = {"environment", "context", "transaction"})
public class AcquirerFinancialResponse1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected CardTransactionEnvironment2 environment;
	/**
	 * Environment of the transaction
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CardTransactionEnvironment2
	 * CardTransactionEnvironment2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerFinancialResponse1
	 * AcquirerFinancialResponse1}</li>
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
	 * definition} = "Environment of the transaction"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmEnvironment = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AcquirerFinancialResponse1.mmObject();
			isDerived = false;
			xmlTag = "Envt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Environment";
			definition = "Environment of the transaction";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CardTransactionEnvironment2.mmObject();
		}
	};
	protected CardTransactionContext3 context;
	/**
	 * Context in which the card transaction is performed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CardTransactionContext3
	 * CardTransactionContext3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerFinancialResponse1
	 * AcquirerFinancialResponse1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cntxt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Context"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Context in which the card transaction is performed."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmContext = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AcquirerFinancialResponse1.mmObject();
			isDerived = false;
			xmlTag = "Cntxt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Context";
			definition = "Context in which the card transaction is performed.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CardTransactionContext3.mmObject();
		}
	};
	protected CardTransaction6 transaction;
	/**
	 * Card transaction for which the financial authorisation has been
	 * requested.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CardTransaction6
	 * CardTransaction6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerFinancialResponse1
	 * AcquirerFinancialResponse1}</li>
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
	 * "Card transaction for which the financial authorisation has been requested."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTransaction = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AcquirerFinancialResponse1.mmObject();
			isDerived = false;
			xmlTag = "Tx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Transaction";
			definition = "Card transaction for which the financial authorisation has been requested.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CardTransaction6.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(AcquirerFinancialResponse1.mmEnvironment, AcquirerFinancialResponse1.mmContext, AcquirerFinancialResponse1.mmTransaction);
				messageBuildingBlock_lazy = () -> Arrays.asList(AcquirerFinancialResponse.mmFinancialResponse);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AcquirerFinancialResponse1";
				definition = "Information related to the response of a financial authorisation.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Envt", required = true)
	public CardTransactionEnvironment2 getEnvironment() {
		return environment;
	}

	public void setEnvironment(com.tools20022.repository.msg.CardTransactionEnvironment2 environment) {
		this.environment = environment;
	}

	@XmlElement(name = "Cntxt")
	public CardTransactionContext3 getContext() {
		return context;
	}

	public void setContext(com.tools20022.repository.msg.CardTransactionContext3 context) {
		this.context = context;
	}

	@XmlElement(name = "Tx", required = true)
	public CardTransaction6 getTransaction() {
		return transaction;
	}

	public void setTransaction(com.tools20022.repository.msg.CardTransaction6 transaction) {
		this.transaction = transaction;
	}
}