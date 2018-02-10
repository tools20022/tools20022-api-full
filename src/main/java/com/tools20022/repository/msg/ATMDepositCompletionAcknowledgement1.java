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
import com.tools20022.repository.area.catp.ATMDepositCompletionAcknowledgementV01;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information related to the acknowledgement of an ATM deposit transaction from
 * the ATM manager.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMDepositCompletionAcknowledgement1#mmATM
 * ATMDepositCompletionAcknowledgement1.mmATM}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMDepositCompletionAcknowledgement1#mmContext
 * ATMDepositCompletionAcknowledgement1.mmContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMDepositCompletionAcknowledgement1#mmTransaction
 * ATMDepositCompletionAcknowledgement1.mmTransaction}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMDepositCompletionAcknowledgementV01#mmATMDepositCompletionAcknowledgement
 * ATMDepositCompletionAcknowledgementV01.mmATMDepositCompletionAcknowledgement}
 * </li>
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
 * "ATMDepositCompletionAcknowledgement1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Information related to the acknowledgement  of an ATM deposit transaction from the ATM manager."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ATMDepositCompletionAcknowledgement1", propOrder = {"aTM", "context", "transaction"})
public class ATMDepositCompletionAcknowledgement1 {

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
	 * {@linkplain com.tools20022.repository.msg.ATMDepositCompletionAcknowledgement1
	 * ATMDepositCompletionAcknowledgement1}</li>
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
	public static final MMMessageAssociationEnd mmATM = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMDepositCompletionAcknowledgement1.mmObject();
			isDerived = false;
			xmlTag = "ATM";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATM";
			definition = "ATM information.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AutomatedTellerMachine3.mmObject();
		}
	};
	@XmlElement(name = "Cntxt", required = true)
	protected ATMContext12 context;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ATMContext12
	 * ATMContext12}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMDepositCompletionAcknowledgement1
	 * ATMDepositCompletionAcknowledgement1}</li>
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
	public static final MMMessageAssociationEnd mmContext = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMDepositCompletionAcknowledgement1.mmObject();
			isDerived = false;
			xmlTag = "Cntxt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Context";
			definition = "Context in which the transaction is performed.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ATMContext12.mmObject();
		}
	};
	@XmlElement(name = "Tx", required = true)
	protected ATMTransaction18 transaction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ATMTransaction18
	 * ATMTransaction18}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMDepositCompletionAcknowledgement1
	 * ATMDepositCompletionAcknowledgement1}</li>
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
	 * definition} = "Acknowledgement of the deposit completion advice."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTransaction = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMDepositCompletionAcknowledgement1.mmObject();
			isDerived = false;
			xmlTag = "Tx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Transaction";
			definition = "Acknowledgement of the deposit completion advice.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ATMTransaction18.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMDepositCompletionAcknowledgement1.mmATM, com.tools20022.repository.msg.ATMDepositCompletionAcknowledgement1.mmContext,
						com.tools20022.repository.msg.ATMDepositCompletionAcknowledgement1.mmTransaction);
				messageBuildingBlock_lazy = () -> Arrays.asList(ATMDepositCompletionAcknowledgementV01.mmATMDepositCompletionAcknowledgement);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMDepositCompletionAcknowledgement1";
				definition = "Information related to the acknowledgement  of an ATM deposit transaction from the ATM manager.";
			}
		});
		return mmObject_lazy.get();
	}

	public AutomatedTellerMachine3 getATM() {
		return aTM;
	}

	public ATMDepositCompletionAcknowledgement1 setATM(com.tools20022.repository.msg.AutomatedTellerMachine3 aTM) {
		this.aTM = Objects.requireNonNull(aTM);
		return this;
	}

	public ATMContext12 getContext() {
		return context;
	}

	public ATMDepositCompletionAcknowledgement1 setContext(com.tools20022.repository.msg.ATMContext12 context) {
		this.context = Objects.requireNonNull(context);
		return this;
	}

	public ATMTransaction18 getTransaction() {
		return transaction;
	}

	public ATMDepositCompletionAcknowledgement1 setTransaction(com.tools20022.repository.msg.ATMTransaction18 transaction) {
		this.transaction = Objects.requireNonNull(transaction);
		return this;
	}
}