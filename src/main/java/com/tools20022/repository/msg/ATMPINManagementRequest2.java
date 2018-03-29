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
import com.tools20022.repository.area.catp.ATMPINManagementRequestV02;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ATMContext16;
import com.tools20022.repository.msg.ATMEnvironment11;
import com.tools20022.repository.msg.ATMTransaction9;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information related to the request of a PIN management from an ATM.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMPINManagementRequest2#mmEnvironment
 * ATMPINManagementRequest2.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMPINManagementRequest2#mmContext
 * ATMPINManagementRequest2.mmContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMPINManagementRequest2#mmTransaction
 * ATMPINManagementRequest2.mmTransaction}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMPINManagementRequestV02#mmATMPINManagementRequest
 * ATMPINManagementRequestV02.mmATMPINManagementRequest}</li>
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
 * "ATMPINManagementRequest2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Information related to the request of a PIN management from an ATM."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ATMPINManagementRequest2", propOrder = {"environment", "context", "transaction"})
public class ATMPINManagementRequest2 {

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
	 * {@linkplain com.tools20022.repository.msg.ATMPINManagementRequest2
	 * ATMPINManagementRequest2}</li>
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
	 * definition} = "Environment in which the transaction is performed."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMPINManagementRequest2, ATMEnvironment11> mmEnvironment = new MMMessageAssociationEnd<ATMPINManagementRequest2, ATMEnvironment11>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMPINManagementRequest2.mmObject();
			isDerived = false;
			xmlTag = "Envt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Environment";
			definition = "Environment in which the transaction is performed.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ATMEnvironment11.mmObject();
		}

		@Override
		public ATMEnvironment11 getValue(ATMPINManagementRequest2 obj) {
			return obj.getEnvironment();
		}

		@Override
		public void setValue(ATMPINManagementRequest2 obj, ATMEnvironment11 value) {
			obj.setEnvironment(value);
		}
	};
	@XmlElement(name = "Cntxt", required = true)
	protected ATMContext16 context;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ATMContext16
	 * ATMContext16}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMPINManagementRequest2
	 * ATMPINManagementRequest2}</li>
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
	 * definition} = "Context in which the transaction is performed."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMPINManagementRequest2, ATMContext16> mmContext = new MMMessageAssociationEnd<ATMPINManagementRequest2, ATMContext16>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMPINManagementRequest2.mmObject();
			isDerived = false;
			xmlTag = "Cntxt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Context";
			definition = "Context in which the transaction is performed.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ATMContext16.mmObject();
		}

		@Override
		public ATMContext16 getValue(ATMPINManagementRequest2 obj) {
			return obj.getContext();
		}

		@Override
		public void setValue(ATMPINManagementRequest2 obj, ATMContext16 value) {
			obj.setContext(value);
		}
	};
	@XmlElement(name = "Tx", required = true)
	protected ATMTransaction9 transaction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ATMTransaction9
	 * ATMTransaction9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMPINManagementRequest2
	 * ATMPINManagementRequest2}</li>
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
	 * definition} = "Transaction for which the service is requested."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMPINManagementRequest2, ATMTransaction9> mmTransaction = new MMMessageAssociationEnd<ATMPINManagementRequest2, ATMTransaction9>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMPINManagementRequest2.mmObject();
			isDerived = false;
			xmlTag = "Tx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Transaction";
			definition = "Transaction for which the service is requested.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ATMTransaction9.mmObject();
		}

		@Override
		public ATMTransaction9 getValue(ATMPINManagementRequest2 obj) {
			return obj.getTransaction();
		}

		@Override
		public void setValue(ATMPINManagementRequest2 obj, ATMTransaction9 value) {
			obj.setTransaction(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMPINManagementRequest2.mmEnvironment, com.tools20022.repository.msg.ATMPINManagementRequest2.mmContext,
						com.tools20022.repository.msg.ATMPINManagementRequest2.mmTransaction);
				messageBuildingBlock_lazy = () -> Arrays.asList(ATMPINManagementRequestV02.mmATMPINManagementRequest);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMPINManagementRequest2";
				definition = "Information related to the request of a PIN management from an ATM.";
			}
		});
		return mmObject_lazy.get();
	}

	public ATMEnvironment11 getEnvironment() {
		return environment;
	}

	public ATMPINManagementRequest2 setEnvironment(ATMEnvironment11 environment) {
		this.environment = Objects.requireNonNull(environment);
		return this;
	}

	public ATMContext16 getContext() {
		return context;
	}

	public ATMPINManagementRequest2 setContext(ATMContext16 context) {
		this.context = Objects.requireNonNull(context);
		return this;
	}

	public ATMTransaction9 getTransaction() {
		return transaction;
	}

	public ATMPINManagementRequest2 setTransaction(ATMTransaction9 transaction) {
		this.transaction = Objects.requireNonNull(transaction);
		return this;
	}
}