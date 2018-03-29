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
import com.tools20022.repository.area.caam.ATMExceptionAcknowledgementV01;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ATMContext20;
import com.tools20022.repository.msg.ATMTransaction28;
import com.tools20022.repository.msg.AutomatedTellerMachine3;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information related to the acknowledgement of an ATM exception.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMExceptionAcknowledgement1#mmATM
 * ATMExceptionAcknowledgement1.mmATM}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMExceptionAcknowledgement1#mmContext
 * ATMExceptionAcknowledgement1.mmContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMExceptionAcknowledgement1#mmTransaction
 * ATMExceptionAcknowledgement1.mmTransaction}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.ATMExceptionAcknowledgementV01#mmATMExceptionAcknowledgement
 * ATMExceptionAcknowledgementV01.mmATMExceptionAcknowledgement}</li>
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
 * "ATMExceptionAcknowledgement1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Information related to the acknowledgement of an ATM exception."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ATMExceptionAcknowledgement1", propOrder = {"aTM", "context", "transaction"})
public class ATMExceptionAcknowledgement1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "ATM", required = true)
	protected AutomatedTellerMachine3 aTM;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AutomatedTellerMachine3
	 * AutomatedTellerMachine3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMExceptionAcknowledgement1
	 * ATMExceptionAcknowledgement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ATM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "ATM information."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMExceptionAcknowledgement1, AutomatedTellerMachine3> mmATM = new MMMessageAssociationEnd<ATMExceptionAcknowledgement1, AutomatedTellerMachine3>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMExceptionAcknowledgement1.mmObject();
			isDerived = false;
			xmlTag = "ATM";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATM";
			definition = "ATM information.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AutomatedTellerMachine3.mmObject();
		}

		@Override
		public AutomatedTellerMachine3 getValue(ATMExceptionAcknowledgement1 obj) {
			return obj.getATM();
		}

		@Override
		public void setValue(ATMExceptionAcknowledgement1 obj, AutomatedTellerMachine3 value) {
			obj.setATM(value);
		}
	};
	@XmlElement(name = "Cntxt", required = true)
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
	 * {@linkplain com.tools20022.repository.msg.ATMExceptionAcknowledgement1
	 * ATMExceptionAcknowledgement1}</li>
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
	 * definition} = "Context in which the transaction is performed, if any."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMExceptionAcknowledgement1, ATMContext20> mmContext = new MMMessageAssociationEnd<ATMExceptionAcknowledgement1, ATMContext20>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMExceptionAcknowledgement1.mmObject();
			isDerived = false;
			xmlTag = "Cntxt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Context";
			definition = "Context in which the transaction is performed, if any.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ATMContext20.mmObject();
		}

		@Override
		public ATMContext20 getValue(ATMExceptionAcknowledgement1 obj) {
			return obj.getContext();
		}

		@Override
		public void setValue(ATMExceptionAcknowledgement1 obj, ATMContext20 value) {
			obj.setContext(value);
		}
	};
	@XmlElement(name = "Tx", required = true)
	protected ATMTransaction28 transaction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ATMTransaction28
	 * ATMTransaction28}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMExceptionAcknowledgement1
	 * ATMExceptionAcknowledgement1}</li>
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
	 * definition} = "Acknowledgement of the exception advice."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMExceptionAcknowledgement1, ATMTransaction28> mmTransaction = new MMMessageAssociationEnd<ATMExceptionAcknowledgement1, ATMTransaction28>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMExceptionAcknowledgement1.mmObject();
			isDerived = false;
			xmlTag = "Tx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Transaction";
			definition = "Acknowledgement of the exception advice.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ATMTransaction28.mmObject();
		}

		@Override
		public ATMTransaction28 getValue(ATMExceptionAcknowledgement1 obj) {
			return obj.getTransaction();
		}

		@Override
		public void setValue(ATMExceptionAcknowledgement1 obj, ATMTransaction28 value) {
			obj.setTransaction(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMExceptionAcknowledgement1.mmATM, com.tools20022.repository.msg.ATMExceptionAcknowledgement1.mmContext,
						com.tools20022.repository.msg.ATMExceptionAcknowledgement1.mmTransaction);
				messageBuildingBlock_lazy = () -> Arrays.asList(ATMExceptionAcknowledgementV01.mmATMExceptionAcknowledgement);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMExceptionAcknowledgement1";
				definition = "Information related to the acknowledgement of an ATM exception.";
			}
		});
		return mmObject_lazy.get();
	}

	public AutomatedTellerMachine3 getATM() {
		return aTM;
	}

	public ATMExceptionAcknowledgement1 setATM(AutomatedTellerMachine3 aTM) {
		this.aTM = Objects.requireNonNull(aTM);
		return this;
	}

	public ATMContext20 getContext() {
		return context;
	}

	public ATMExceptionAcknowledgement1 setContext(ATMContext20 context) {
		this.context = Objects.requireNonNull(context);
		return this;
	}

	public ATMTransaction28 getTransaction() {
		return transaction;
	}

	public ATMExceptionAcknowledgement1 setTransaction(ATMTransaction28 transaction) {
		this.transaction = Objects.requireNonNull(transaction);
		return this;
	}
}