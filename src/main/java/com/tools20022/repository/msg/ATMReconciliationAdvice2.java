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
import com.tools20022.repository.area.caam.ATMReconciliationAdviceV02;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ATMCommand8;
import com.tools20022.repository.msg.ATMCommand9;
import com.tools20022.repository.msg.ATMEnvironment10;
import com.tools20022.repository.msg.ATMTransaction25;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information related to the reconciliation of an ATM.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMReconciliationAdvice2#mmEnvironment
 * ATMReconciliationAdvice2.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMReconciliationAdvice2#mmCommandResult
 * ATMReconciliationAdvice2.mmCommandResult}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMReconciliationAdvice2#mmCommandContext
 * ATMReconciliationAdvice2.mmCommandContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMReconciliationAdvice2#mmTransaction
 * ATMReconciliationAdvice2.mmTransaction}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.ATMReconciliationAdviceV02#mmATMReconciliationAdvice
 * ATMReconciliationAdviceV02.mmATMReconciliationAdvice}</li>
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
 * "ATMReconciliationAdvice2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information related to the reconciliation of an ATM."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ATMReconciliationAdvice2", propOrder = {"environment", "commandResult", "commandContext", "transaction"})
public class ATMReconciliationAdvice2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Envt", required = true)
	protected ATMEnvironment10 environment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ATMEnvironment10
	 * ATMEnvironment10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMReconciliationAdvice2
	 * ATMReconciliationAdvice2}</li>
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
	 * definition} = "Environment of the ATM."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMReconciliationAdvice2, ATMEnvironment10> mmEnvironment = new MMMessageAssociationEnd<ATMReconciliationAdvice2, ATMEnvironment10>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMReconciliationAdvice2.mmObject();
			isDerived = false;
			xmlTag = "Envt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Environment";
			definition = "Environment of the ATM.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ATMEnvironment10.mmObject();
		}

		@Override
		public ATMEnvironment10 getValue(ATMReconciliationAdvice2 obj) {
			return obj.getEnvironment();
		}

		@Override
		public void setValue(ATMReconciliationAdvice2 obj, ATMEnvironment10 value) {
			obj.setEnvironment(value);
		}
	};
	@XmlElement(name = "CmdRslt")
	protected List<ATMCommand8> commandResult;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ATMCommand8
	 * ATMCommand8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMReconciliationAdvice2
	 * ATMReconciliationAdvice2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CmdRslt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommandResult"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Command result for reinitialisation of the transaction counters."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMReconciliationAdvice2, List<ATMCommand8>> mmCommandResult = new MMMessageAssociationEnd<ATMReconciliationAdvice2, List<ATMCommand8>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMReconciliationAdvice2.mmObject();
			isDerived = false;
			xmlTag = "CmdRslt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommandResult";
			definition = "Command result for reinitialisation of the transaction counters.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ATMCommand8.mmObject();
		}

		@Override
		public List<ATMCommand8> getValue(ATMReconciliationAdvice2 obj) {
			return obj.getCommandResult();
		}

		@Override
		public void setValue(ATMReconciliationAdvice2 obj, List<ATMCommand8> value) {
			obj.setCommandResult(value);
		}
	};
	@XmlElement(name = "CmdCntxt")
	protected ATMCommand9 commandContext;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ATMCommand9
	 * ATMCommand9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMReconciliationAdvice2
	 * ATMReconciliationAdvice2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CmdCntxt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommandContext"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party which has requested the reconciliation."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMReconciliationAdvice2, Optional<ATMCommand9>> mmCommandContext = new MMMessageAssociationEnd<ATMReconciliationAdvice2, Optional<ATMCommand9>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMReconciliationAdvice2.mmObject();
			isDerived = false;
			xmlTag = "CmdCntxt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommandContext";
			definition = "Party which has requested the reconciliation.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ATMCommand9.mmObject();
		}

		@Override
		public Optional<ATMCommand9> getValue(ATMReconciliationAdvice2 obj) {
			return obj.getCommandContext();
		}

		@Override
		public void setValue(ATMReconciliationAdvice2 obj, Optional<ATMCommand9> value) {
			obj.setCommandContext(value.orElse(null));
		}
	};
	@XmlElement(name = "Tx", required = true)
	protected ATMTransaction25 transaction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ATMTransaction25
	 * ATMTransaction25}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMReconciliationAdvice2
	 * ATMReconciliationAdvice2}</li>
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
	 * definition} = "Information about the reconciliation request."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMReconciliationAdvice2, ATMTransaction25> mmTransaction = new MMMessageAssociationEnd<ATMReconciliationAdvice2, ATMTransaction25>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMReconciliationAdvice2.mmObject();
			isDerived = false;
			xmlTag = "Tx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Transaction";
			definition = "Information about the reconciliation request.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ATMTransaction25.mmObject();
		}

		@Override
		public ATMTransaction25 getValue(ATMReconciliationAdvice2 obj) {
			return obj.getTransaction();
		}

		@Override
		public void setValue(ATMReconciliationAdvice2 obj, ATMTransaction25 value) {
			obj.setTransaction(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMReconciliationAdvice2.mmEnvironment, com.tools20022.repository.msg.ATMReconciliationAdvice2.mmCommandResult,
						com.tools20022.repository.msg.ATMReconciliationAdvice2.mmCommandContext, com.tools20022.repository.msg.ATMReconciliationAdvice2.mmTransaction);
				messageBuildingBlock_lazy = () -> Arrays.asList(ATMReconciliationAdviceV02.mmATMReconciliationAdvice);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMReconciliationAdvice2";
				definition = "Information related to the reconciliation of an ATM.";
			}
		});
		return mmObject_lazy.get();
	}

	public ATMEnvironment10 getEnvironment() {
		return environment;
	}

	public ATMReconciliationAdvice2 setEnvironment(ATMEnvironment10 environment) {
		this.environment = Objects.requireNonNull(environment);
		return this;
	}

	public List<ATMCommand8> getCommandResult() {
		return commandResult == null ? commandResult = new ArrayList<>() : commandResult;
	}

	public ATMReconciliationAdvice2 setCommandResult(List<ATMCommand8> commandResult) {
		this.commandResult = Objects.requireNonNull(commandResult);
		return this;
	}

	public Optional<ATMCommand9> getCommandContext() {
		return commandContext == null ? Optional.empty() : Optional.of(commandContext);
	}

	public ATMReconciliationAdvice2 setCommandContext(ATMCommand9 commandContext) {
		this.commandContext = commandContext;
		return this;
	}

	public ATMTransaction25 getTransaction() {
		return transaction;
	}

	public ATMReconciliationAdvice2 setTransaction(ATMTransaction25 transaction) {
		this.transaction = Objects.requireNonNull(transaction);
		return this;
	}
}