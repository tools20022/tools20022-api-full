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
import com.tools20022.repository.area.caaa.AcceptorCancellationAdviceV06;
import com.tools20022.repository.entity.CardPayment;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Cancellation transaction between an acceptor and an acquirer.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdvice6#mmEnvironment
 * AcceptorCancellationAdvice6.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdvice6#mmContext
 * AcceptorCancellationAdvice6.mmContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdvice6#mmTransaction
 * AcceptorCancellationAdvice6.mmTransaction}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CardPayment
 * CardPayment}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCancellationAdviceV06#mmCancellationAdvice
 * AcceptorCancellationAdviceV06.mmCancellationAdvice}</li>
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
 * "AcceptorCancellationAdvice6"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Cancellation transaction between an acceptor and an acquirer."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdvice5
 * AcceptorCancellationAdvice5}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "AcceptorCancellationAdvice6", propOrder = {"environment", "context", "transaction"})
public class AcceptorCancellationAdvice6 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected CardPaymentEnvironment59 environment;
	/**
	 * Environment of the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment59
	 * CardPaymentEnvironment59}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment CardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdvice6
	 * AcceptorCancellationAdvice6}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdvice5#mmEnvironment
	 * AcceptorCancellationAdvice5.mmEnvironment}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmEnvironment = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> CardPayment.mmObject();
			componentContext_lazy = () -> AcceptorCancellationAdvice6.mmObject();
			isDerived = false;
			xmlTag = "Envt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Environment";
			definition = "Environment of the transaction.";
			previousVersion_lazy = () -> AcceptorCancellationAdvice5.mmEnvironment;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CardPaymentEnvironment59.mmObject();
		}
	};
	protected CardPaymentContext23 context;
	/**
	 * Context in which the transaction is performed (payment and sale).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CardPaymentContext23
	 * CardPaymentContext23}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment#mmCardPaymentAcquiring
	 * CardPayment.mmCardPaymentAcquiring}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdvice6
	 * AcceptorCancellationAdvice6}</li>
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
	 * definition} =
	 * "Context in which the transaction is performed (payment and sale)."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdvice5#mmContext
	 * AcceptorCancellationAdvice5.mmContext}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmContext = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CardPayment.mmCardPaymentAcquiring;
			componentContext_lazy = () -> AcceptorCancellationAdvice6.mmObject();
			isDerived = false;
			xmlTag = "Cntxt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Context";
			definition = "Context in which the transaction is performed (payment and sale).";
			previousVersion_lazy = () -> AcceptorCancellationAdvice5.mmContext;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CardPaymentContext23.mmObject();
		}
	};
	protected CardPaymentTransaction75 transaction;
	/**
	 * Cancellation transaction between an acceptor and an acquirer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction75
	 * CardPaymentTransaction75}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment CardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdvice6
	 * AcceptorCancellationAdvice6}</li>
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
	 * "Cancellation transaction between an acceptor and an acquirer."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdvice5#mmTransaction
	 * AcceptorCancellationAdvice5.mmTransaction}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTransaction = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> CardPayment.mmObject();
			componentContext_lazy = () -> AcceptorCancellationAdvice6.mmObject();
			isDerived = false;
			xmlTag = "Tx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Transaction";
			definition = "Cancellation transaction between an acceptor and an acquirer.";
			previousVersion_lazy = () -> AcceptorCancellationAdvice5.mmTransaction;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CardPaymentTransaction75.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(AcceptorCancellationAdvice6.mmEnvironment, AcceptorCancellationAdvice6.mmContext, AcceptorCancellationAdvice6.mmTransaction);
				messageBuildingBlock_lazy = () -> Arrays.asList(AcceptorCancellationAdviceV06.mmCancellationAdvice);
				trace_lazy = () -> CardPayment.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AcceptorCancellationAdvice6";
				definition = "Cancellation transaction between an acceptor and an acquirer.";
				previousVersion_lazy = () -> AcceptorCancellationAdvice5.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Envt", required = true)
	public CardPaymentEnvironment59 getEnvironment() {
		return environment;
	}

	public void setEnvironment(com.tools20022.repository.msg.CardPaymentEnvironment59 environment) {
		this.environment = environment;
	}

	@XmlElement(name = "Cntxt")
	public CardPaymentContext23 getContext() {
		return context;
	}

	public void setContext(com.tools20022.repository.msg.CardPaymentContext23 context) {
		this.context = context;
	}

	@XmlElement(name = "Tx", required = true)
	public CardPaymentTransaction75 getTransaction() {
		return transaction;
	}

	public void setTransaction(com.tools20022.repository.msg.CardPaymentTransaction75 transaction) {
		this.transaction = transaction;
	}
}