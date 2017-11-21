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
import com.tools20022.repository.area.catp.ATMCompletionAcknowledgementV02;
import com.tools20022.repository.entity.CardPaymentAcquiring;
import com.tools20022.repository.entity.System;
import com.tools20022.repository.entity.TerminalManagementSystem;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information related to the acknowledgement of an ATM completion from the ATM
 * manager.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMCompletionAcknowledgement2#mmATM
 * ATMCompletionAcknowledgement2.mmATM}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMCompletionAcknowledgement2#mmContext
 * ATMCompletionAcknowledgement2.mmContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMCompletionAcknowledgement2#mmTransaction
 * ATMCompletionAcknowledgement2.mmTransaction}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.TerminalManagementSystem
 * TerminalManagementSystem}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMCompletionAcknowledgementV02#mmATMCompletionAcknowledgement
 * ATMCompletionAcknowledgementV02.mmATMCompletionAcknowledgement}</li>
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
 * "ATMCompletionAcknowledgement2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Information related to the acknowledgement  of an ATM completion from the ATM manager."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "ATMCompletionAcknowledgement2", propOrder = {"ATM", "context", "transaction"})
public class ATMCompletionAcknowledgement2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected AutomatedTellerMachine3 aTM;
	/**
	 * ATM information.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AutomatedTellerMachine3
	 * AutomatedTellerMachine3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.System#mmSystemIdentification
	 * System.mmSystemIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMCompletionAcknowledgement2
	 * ATMCompletionAcknowledgement2}</li>
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
			businessElementTrace_lazy = () -> System.mmSystemIdentification;
			componentContext_lazy = () -> ATMCompletionAcknowledgement2.mmObject();
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
	protected ATMContext13 context;
	/**
	 * Context in which the transaction is performed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ATMContext13
	 * ATMContext13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMCompletionAcknowledgement2
	 * ATMCompletionAcknowledgement2}</li>
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
			componentContext_lazy = () -> ATMCompletionAcknowledgement2.mmObject();
			isDerived = false;
			xmlTag = "Cntxt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Context";
			definition = "Context in which the transaction is performed.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ATMContext13.mmObject();
		}
	};
	protected ATMTransaction18 transaction;
	/**
	 * Acknowledgement of the completion advice.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ATMTransaction18
	 * ATMTransaction18}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmRelatedCardPayment
	 * CardPaymentAcquiring.mmRelatedCardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMCompletionAcknowledgement2
	 * ATMCompletionAcknowledgement2}</li>
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
	 * definition} = "Acknowledgement of the completion advice."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTransaction = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CardPaymentAcquiring.mmRelatedCardPayment;
			componentContext_lazy = () -> ATMCompletionAcknowledgement2.mmObject();
			isDerived = false;
			xmlTag = "Tx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Transaction";
			definition = "Acknowledgement of the completion advice.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ATMTransaction18.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(ATMCompletionAcknowledgement2.mmATM, ATMCompletionAcknowledgement2.mmContext, ATMCompletionAcknowledgement2.mmTransaction);
				messageBuildingBlock_lazy = () -> Arrays.asList(ATMCompletionAcknowledgementV02.mmATMCompletionAcknowledgement);
				trace_lazy = () -> TerminalManagementSystem.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMCompletionAcknowledgement2";
				definition = "Information related to the acknowledgement  of an ATM completion from the ATM manager.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "ATM", required = true)
	public AutomatedTellerMachine3 getATM() {
		return aTM;
	}

	public void setATM(com.tools20022.repository.msg.AutomatedTellerMachine3 aTM) {
		this.aTM = aTM;
	}

	@XmlElement(name = "Cntxt", required = true)
	public ATMContext13 getContext() {
		return context;
	}

	public void setContext(com.tools20022.repository.msg.ATMContext13 context) {
		this.context = context;
	}

	@XmlElement(name = "Tx", required = true)
	public ATMTransaction18 getTransaction() {
		return transaction;
	}

	public void setTransaction(com.tools20022.repository.msg.ATMTransaction18 transaction) {
		this.transaction = transaction;
	}
}