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
import com.tools20022.repository.area.caam.ATMExceptionAdviceV01;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ATMContext20;
import com.tools20022.repository.msg.ATMEnvironment16;
import com.tools20022.repository.msg.ATMTransaction27;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information related to exceptions occurring on the ATM.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMExceptionAdvice1#mmEnvironment
 * ATMExceptionAdvice1.mmEnvironment}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMExceptionAdvice1#mmContext
 * ATMExceptionAdvice1.mmContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMExceptionAdvice1#mmTransaction
 * ATMExceptionAdvice1.mmTransaction}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.ATMExceptionAdviceV01#mmATMExceptionAdvice
 * ATMExceptionAdviceV01.mmATMExceptionAdvice}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ATMExceptionAdvice1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information related to exceptions occurring on the ATM."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ATMExceptionAdvice1", propOrder = {"environment", "context", "transaction"})
public class ATMExceptionAdvice1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Envt")
	protected ATMEnvironment16 environment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ATMEnvironment16
	 * ATMEnvironment16}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMExceptionAdvice1
	 * ATMExceptionAdvice1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Envt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Environment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Environment of the exception."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMExceptionAdvice1, Optional<ATMEnvironment16>> mmEnvironment = new MMMessageAssociationEnd<ATMExceptionAdvice1, Optional<ATMEnvironment16>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMExceptionAdvice1.mmObject();
			isDerived = false;
			xmlTag = "Envt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Environment";
			definition = "Environment of the exception.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ATMEnvironment16.mmObject();
		}

		@Override
		public Optional<ATMEnvironment16> getValue(ATMExceptionAdvice1 obj) {
			return obj.getEnvironment();
		}

		@Override
		public void setValue(ATMExceptionAdvice1 obj, Optional<ATMEnvironment16> value) {
			obj.setEnvironment(value.orElse(null));
		}
	};
	@XmlElement(name = "Cntxt")
	protected ATMContext20 context;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ATMContext20
	 * ATMContext20}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMExceptionAdvice1
	 * ATMExceptionAdvice1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cntxt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Context"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Context of the exception."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMExceptionAdvice1, Optional<ATMContext20>> mmContext = new MMMessageAssociationEnd<ATMExceptionAdvice1, Optional<ATMContext20>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMExceptionAdvice1.mmObject();
			isDerived = false;
			xmlTag = "Cntxt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Context";
			definition = "Context of the exception.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ATMContext20.mmObject();
		}

		@Override
		public Optional<ATMContext20> getValue(ATMExceptionAdvice1 obj) {
			return obj.getContext();
		}

		@Override
		public void setValue(ATMExceptionAdvice1 obj, Optional<ATMContext20> value) {
			obj.setContext(value.orElse(null));
		}
	};
	@XmlElement(name = "Tx", required = true)
	protected ATMTransaction27 transaction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ATMTransaction27
	 * ATMTransaction27}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMExceptionAdvice1
	 * ATMExceptionAdvice1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tx"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Transaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction for which the exception is sent."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMExceptionAdvice1, ATMTransaction27> mmTransaction = new MMMessageAssociationEnd<ATMExceptionAdvice1, ATMTransaction27>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMExceptionAdvice1.mmObject();
			isDerived = false;
			xmlTag = "Tx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Transaction";
			definition = "Transaction for which the exception is sent.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ATMTransaction27.mmObject();
		}

		@Override
		public ATMTransaction27 getValue(ATMExceptionAdvice1 obj) {
			return obj.getTransaction();
		}

		@Override
		public void setValue(ATMExceptionAdvice1 obj, ATMTransaction27 value) {
			obj.setTransaction(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMExceptionAdvice1.mmEnvironment, com.tools20022.repository.msg.ATMExceptionAdvice1.mmContext,
						com.tools20022.repository.msg.ATMExceptionAdvice1.mmTransaction);
				messageBuildingBlock_lazy = () -> Arrays.asList(ATMExceptionAdviceV01.mmATMExceptionAdvice);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMExceptionAdvice1";
				definition = "Information related to exceptions occurring on the ATM.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<ATMEnvironment16> getEnvironment() {
		return environment == null ? Optional.empty() : Optional.of(environment);
	}

	public ATMExceptionAdvice1 setEnvironment(ATMEnvironment16 environment) {
		this.environment = environment;
		return this;
	}

	public Optional<ATMContext20> getContext() {
		return context == null ? Optional.empty() : Optional.of(context);
	}

	public ATMExceptionAdvice1 setContext(ATMContext20 context) {
		this.context = context;
		return this;
	}

	public ATMTransaction27 getTransaction() {
		return transaction;
	}

	public ATMExceptionAdvice1 setTransaction(ATMTransaction27 transaction) {
		this.transaction = Objects.requireNonNull(transaction);
		return this;
	}
}