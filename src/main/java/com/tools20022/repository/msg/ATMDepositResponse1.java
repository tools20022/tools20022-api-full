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
import com.tools20022.repository.area.catp.ATMDepositResponseV01;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ATMContext11;
import com.tools20022.repository.msg.ATMEnvironment12;
import com.tools20022.repository.msg.ATMTransaction16;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Response to a deposit request.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMDepositResponse1#mmEnvironment
 * ATMDepositResponse1.mmEnvironment}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMDepositResponse1#mmContext
 * ATMDepositResponse1.mmContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMDepositResponse1#mmTransaction
 * ATMDepositResponse1.mmTransaction}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMDepositResponseV01#mmATMDepositResponse
 * ATMDepositResponseV01.mmATMDepositResponse}</li>
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
 * "ATMDepositResponse1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Response to a deposit request."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ATMDepositResponse1", propOrder = {"environment", "context", "transaction"})
public class ATMDepositResponse1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Envt", required = true)
	protected ATMEnvironment12 environment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ATMEnvironment12
	 * ATMEnvironment12}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMDepositResponse1
	 * ATMDepositResponse1}</li>
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
	 * definition} = "Environment of the deposit transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMDepositResponse1, ATMEnvironment12> mmEnvironment = new MMMessageAssociationEnd<ATMDepositResponse1, ATMEnvironment12>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMDepositResponse1.mmObject();
			isDerived = false;
			xmlTag = "Envt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Environment";
			definition = "Environment of the deposit transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ATMEnvironment12.mmObject();
		}

		@Override
		public ATMEnvironment12 getValue(ATMDepositResponse1 obj) {
			return obj.getEnvironment();
		}

		@Override
		public void setValue(ATMDepositResponse1 obj, ATMEnvironment12 value) {
			obj.setEnvironment(value);
		}
	};
	@XmlElement(name = "Cntxt", required = true)
	protected ATMContext11 context;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ATMContext11
	 * ATMContext11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMDepositResponse1
	 * ATMDepositResponse1}</li>
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
	public static final MMMessageAssociationEnd<ATMDepositResponse1, ATMContext11> mmContext = new MMMessageAssociationEnd<ATMDepositResponse1, ATMContext11>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMDepositResponse1.mmObject();
			isDerived = false;
			xmlTag = "Cntxt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Context";
			definition = "Context in which the transaction is performed.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ATMContext11.mmObject();
		}

		@Override
		public ATMContext11 getValue(ATMDepositResponse1 obj) {
			return obj.getContext();
		}

		@Override
		public void setValue(ATMDepositResponse1 obj, ATMContext11 value) {
			obj.setContext(value);
		}
	};
	@XmlElement(name = "Tx", required = true)
	protected ATMTransaction16 transaction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ATMTransaction16
	 * ATMTransaction16}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMDepositResponse1
	 * ATMDepositResponse1}</li>
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
	 * definition} = "Response to the deposit request."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMDepositResponse1, ATMTransaction16> mmTransaction = new MMMessageAssociationEnd<ATMDepositResponse1, ATMTransaction16>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMDepositResponse1.mmObject();
			isDerived = false;
			xmlTag = "Tx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Transaction";
			definition = "Response to the deposit request.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ATMTransaction16.mmObject();
		}

		@Override
		public ATMTransaction16 getValue(ATMDepositResponse1 obj) {
			return obj.getTransaction();
		}

		@Override
		public void setValue(ATMDepositResponse1 obj, ATMTransaction16 value) {
			obj.setTransaction(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMDepositResponse1.mmEnvironment, com.tools20022.repository.msg.ATMDepositResponse1.mmContext,
						com.tools20022.repository.msg.ATMDepositResponse1.mmTransaction);
				messageBuildingBlock_lazy = () -> Arrays.asList(ATMDepositResponseV01.mmATMDepositResponse);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMDepositResponse1";
				definition = "Response to a deposit request.";
			}
		});
		return mmObject_lazy.get();
	}

	public ATMEnvironment12 getEnvironment() {
		return environment;
	}

	public ATMDepositResponse1 setEnvironment(ATMEnvironment12 environment) {
		this.environment = Objects.requireNonNull(environment);
		return this;
	}

	public ATMContext11 getContext() {
		return context;
	}

	public ATMDepositResponse1 setContext(ATMContext11 context) {
		this.context = Objects.requireNonNull(context);
		return this;
	}

	public ATMTransaction16 getTransaction() {
		return transaction;
	}

	public ATMDepositResponse1 setTransaction(ATMTransaction16 transaction) {
		this.transaction = Objects.requireNonNull(transaction);
		return this;
	}
}