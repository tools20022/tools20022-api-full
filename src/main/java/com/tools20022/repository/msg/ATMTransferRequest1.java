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
import com.tools20022.repository.area.catp.ATMTransferRequestV01;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ATMContext18;
import com.tools20022.repository.msg.ATMEnvironment11;
import com.tools20022.repository.msg.ATMTransaction23;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information related to the request of a fund transfer from an ATM.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransferRequest1#mmEnvironment
 * ATMTransferRequest1.mmEnvironment}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMTransferRequest1#mmContext
 * ATMTransferRequest1.mmContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransferRequest1#mmTransaction
 * ATMTransferRequest1.mmTransaction}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMTransferRequestV01#mmATMTransferRequest
 * ATMTransferRequestV01.mmATMTransferRequest}</li>
 * </ul>
 * </li>
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
 * "ATMTransferRequest1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Information related to the request of a fund transfer from an ATM."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ATMTransferRequest1", propOrder = {"environment", "context", "transaction"})
public class ATMTransferRequest1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Envt", required = true)
	protected ATMEnvironment11 environment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ATMEnvironment11
	 * ATMEnvironment11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransferRequest1
	 * ATMTransferRequest1}</li>
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
	 * definition} = "Environment in which the fund transfer is performed."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMTransferRequest1, ATMEnvironment11> mmEnvironment = new MMMessageAssociationEnd<ATMTransferRequest1, ATMEnvironment11>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMTransferRequest1.mmObject();
			isDerived = false;
			xmlTag = "Envt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Environment";
			definition = "Environment in which the fund transfer is performed.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ATMEnvironment11.mmObject();
		}

		@Override
		public ATMEnvironment11 getValue(ATMTransferRequest1 obj) {
			return obj.getEnvironment();
		}

		@Override
		public void setValue(ATMTransferRequest1 obj, ATMEnvironment11 value) {
			obj.setEnvironment(value);
		}
	};
	@XmlElement(name = "Cntxt")
	protected ATMContext18 context;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ATMContext18
	 * ATMContext18}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransferRequest1
	 * ATMTransferRequest1}</li>
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
	 * definition} = "Context in which the fund transfer is performed."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMTransferRequest1, Optional<ATMContext18>> mmContext = new MMMessageAssociationEnd<ATMTransferRequest1, Optional<ATMContext18>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMTransferRequest1.mmObject();
			isDerived = false;
			xmlTag = "Cntxt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Context";
			definition = "Context in which the fund transfer is performed.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ATMContext18.mmObject();
		}

		@Override
		public Optional<ATMContext18> getValue(ATMTransferRequest1 obj) {
			return obj.getContext();
		}

		@Override
		public void setValue(ATMTransferRequest1 obj, Optional<ATMContext18> value) {
			obj.setContext(value.orElse(null));
		}
	};
	@XmlElement(name = "Tx", required = true)
	protected ATMTransaction23 transaction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ATMTransaction23
	 * ATMTransaction23}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransferRequest1
	 * ATMTransferRequest1}</li>
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
	 * definition} = "Transfer information for the transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMTransferRequest1, ATMTransaction23> mmTransaction = new MMMessageAssociationEnd<ATMTransferRequest1, ATMTransaction23>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMTransferRequest1.mmObject();
			isDerived = false;
			xmlTag = "Tx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Transaction";
			definition = "Transfer information for the transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ATMTransaction23.mmObject();
		}

		@Override
		public ATMTransaction23 getValue(ATMTransferRequest1 obj) {
			return obj.getTransaction();
		}

		@Override
		public void setValue(ATMTransferRequest1 obj, ATMTransaction23 value) {
			obj.setTransaction(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMTransferRequest1.mmEnvironment, com.tools20022.repository.msg.ATMTransferRequest1.mmContext,
						com.tools20022.repository.msg.ATMTransferRequest1.mmTransaction);
				messageBuildingBlock_lazy = () -> Arrays.asList(ATMTransferRequestV01.mmATMTransferRequest);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMTransferRequest1";
				definition = "Information related to the request of a fund transfer from an ATM.";
			}
		});
		return mmObject_lazy.get();
	}

	public ATMEnvironment11 getEnvironment() {
		return environment;
	}

	public ATMTransferRequest1 setEnvironment(ATMEnvironment11 environment) {
		this.environment = Objects.requireNonNull(environment);
		return this;
	}

	public Optional<ATMContext18> getContext() {
		return context == null ? Optional.empty() : Optional.of(context);
	}

	public ATMTransferRequest1 setContext(ATMContext18 context) {
		this.context = context;
		return this;
	}

	public ATMTransaction23 getTransaction() {
		return transaction;
	}

	public ATMTransferRequest1 setTransaction(ATMTransaction23 transaction) {
		this.transaction = Objects.requireNonNull(transaction);
		return this;
	}
}