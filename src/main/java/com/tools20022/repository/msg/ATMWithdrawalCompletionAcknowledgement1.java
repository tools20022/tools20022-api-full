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
import com.tools20022.repository.area.catp.ATMWithdrawalCompletionAcknowledgementV01;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ATMContext2;
import com.tools20022.repository.msg.ATMTransaction4;
import com.tools20022.repository.msg.AutomatedTellerMachine3;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information related to the acknowledgement of an ATM withdrawal from the ATM
 * manager.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMWithdrawalCompletionAcknowledgement1#mmATM
 * ATMWithdrawalCompletionAcknowledgement1.mmATM}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMWithdrawalCompletionAcknowledgement1#mmContext
 * ATMWithdrawalCompletionAcknowledgement1.mmContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMWithdrawalCompletionAcknowledgement1#mmTransaction
 * ATMWithdrawalCompletionAcknowledgement1.mmTransaction}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMWithdrawalCompletionAcknowledgementV01#mmATMWithdrawalCompletionAcknowledgement
 * ATMWithdrawalCompletionAcknowledgementV01.
 * mmATMWithdrawalCompletionAcknowledgement}</li>
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
 * "ATMWithdrawalCompletionAcknowledgement1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Information related to the acknowledgement of an ATM withdrawal from the ATM manager."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ATMWithdrawalCompletionAcknowledgement1", propOrder = {"aTM", "context", "transaction"})
public class ATMWithdrawalCompletionAcknowledgement1 {

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
	 * {@linkplain com.tools20022.repository.msg.ATMWithdrawalCompletionAcknowledgement1
	 * ATMWithdrawalCompletionAcknowledgement1}</li>
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
	public static final MMMessageAssociationEnd<ATMWithdrawalCompletionAcknowledgement1, AutomatedTellerMachine3> mmATM = new MMMessageAssociationEnd<ATMWithdrawalCompletionAcknowledgement1, AutomatedTellerMachine3>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMWithdrawalCompletionAcknowledgement1.mmObject();
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
		public AutomatedTellerMachine3 getValue(ATMWithdrawalCompletionAcknowledgement1 obj) {
			return obj.getATM();
		}

		@Override
		public void setValue(ATMWithdrawalCompletionAcknowledgement1 obj, AutomatedTellerMachine3 value) {
			obj.setATM(value);
		}
	};
	@XmlElement(name = "Cntxt", required = true)
	protected ATMContext2 context;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ATMContext2
	 * ATMContext2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMWithdrawalCompletionAcknowledgement1
	 * ATMWithdrawalCompletionAcknowledgement1}</li>
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
	public static final MMMessageAssociationEnd<ATMWithdrawalCompletionAcknowledgement1, ATMContext2> mmContext = new MMMessageAssociationEnd<ATMWithdrawalCompletionAcknowledgement1, ATMContext2>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMWithdrawalCompletionAcknowledgement1.mmObject();
			isDerived = false;
			xmlTag = "Cntxt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Context";
			definition = "Context in which the transaction is performed.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ATMContext2.mmObject();
		}

		@Override
		public ATMContext2 getValue(ATMWithdrawalCompletionAcknowledgement1 obj) {
			return obj.getContext();
		}

		@Override
		public void setValue(ATMWithdrawalCompletionAcknowledgement1 obj, ATMContext2 value) {
			obj.setContext(value);
		}
	};
	@XmlElement(name = "Tx", required = true)
	protected ATMTransaction4 transaction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ATMTransaction4
	 * ATMTransaction4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMWithdrawalCompletionAcknowledgement1
	 * ATMWithdrawalCompletionAcknowledgement1}</li>
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
	 * definition} = "Acknowledgement of the withdrawal completion advice."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMWithdrawalCompletionAcknowledgement1, ATMTransaction4> mmTransaction = new MMMessageAssociationEnd<ATMWithdrawalCompletionAcknowledgement1, ATMTransaction4>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMWithdrawalCompletionAcknowledgement1.mmObject();
			isDerived = false;
			xmlTag = "Tx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Transaction";
			definition = "Acknowledgement of the withdrawal completion advice.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ATMTransaction4.mmObject();
		}

		@Override
		public ATMTransaction4 getValue(ATMWithdrawalCompletionAcknowledgement1 obj) {
			return obj.getTransaction();
		}

		@Override
		public void setValue(ATMWithdrawalCompletionAcknowledgement1 obj, ATMTransaction4 value) {
			obj.setTransaction(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMWithdrawalCompletionAcknowledgement1.mmATM, com.tools20022.repository.msg.ATMWithdrawalCompletionAcknowledgement1.mmContext,
						com.tools20022.repository.msg.ATMWithdrawalCompletionAcknowledgement1.mmTransaction);
				messageBuildingBlock_lazy = () -> Arrays.asList(ATMWithdrawalCompletionAcknowledgementV01.mmATMWithdrawalCompletionAcknowledgement);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMWithdrawalCompletionAcknowledgement1";
				definition = "Information related to the acknowledgement of an ATM withdrawal from the ATM manager.";
			}
		});
		return mmObject_lazy.get();
	}

	public AutomatedTellerMachine3 getATM() {
		return aTM;
	}

	public ATMWithdrawalCompletionAcknowledgement1 setATM(AutomatedTellerMachine3 aTM) {
		this.aTM = Objects.requireNonNull(aTM);
		return this;
	}

	public ATMContext2 getContext() {
		return context;
	}

	public ATMWithdrawalCompletionAcknowledgement1 setContext(ATMContext2 context) {
		this.context = Objects.requireNonNull(context);
		return this;
	}

	public ATMTransaction4 getTransaction() {
		return transaction;
	}

	public ATMWithdrawalCompletionAcknowledgement1 setTransaction(ATMTransaction4 transaction) {
		this.transaction = Objects.requireNonNull(transaction);
		return this;
	}
}