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
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.Response2Code;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ATMCommand7;
import com.tools20022.repository.msg.TransactionIdentifier1;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Acknowledgement of the exception advice.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransaction28#mmTransactionIdentification
 * ATMTransaction28.mmTransactionIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMTransaction28#mmResponse
 * ATMTransaction28.mmResponse}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMTransaction28#mmCommand
 * ATMTransaction28.mmCommand}</li>
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
 * "ATMTransaction28"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Acknowledgement of the exception advice."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.ATMTransaction22 ATMTransaction22}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ATMTransaction28", propOrder = {"transactionIdentification", "response", "command"})
public class ATMTransaction28 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TxId")
	protected TransactionIdentifier1 transactionIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TransactionIdentifier1
	 * TransactionIdentifier1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction28
	 * ATMTransaction28}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the transaction assigned by the ATM."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction22#mmTransactionIdentification
	 * ATMTransaction22.mmTransactionIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMTransaction28, Optional<TransactionIdentifier1>> mmTransactionIdentification = new MMMessageAssociationEnd<ATMTransaction28, Optional<TransactionIdentifier1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMTransaction28.mmObject();
			isDerived = false;
			xmlTag = "TxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentification";
			definition = "Identification of the transaction assigned by the ATM.";
			previousVersion_lazy = () -> ATMTransaction22.mmTransactionIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TransactionIdentifier1.mmObject();
		}

		@Override
		public Optional<TransactionIdentifier1> getValue(ATMTransaction28 obj) {
			return obj.getTransactionIdentification();
		}

		@Override
		public void setValue(ATMTransaction28 obj, Optional<TransactionIdentifier1> value) {
			obj.setTransactionIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "Rspn", required = true)
	protected Response2Code response;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.Response2Code
	 * Response2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction28
	 * ATMTransaction28}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rspn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Response"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Response to the advice."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction22#mmTransactionResponse
	 * ATMTransaction22.mmTransactionResponse}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMTransaction28, Response2Code> mmResponse = new MMMessageAttribute<ATMTransaction28, Response2Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMTransaction28.mmObject();
			isDerived = false;
			xmlTag = "Rspn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Response";
			definition = "Response to the advice.";
			previousVersion_lazy = () -> ATMTransaction22.mmTransactionResponse;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Response2Code.mmObject();
		}

		@Override
		public Response2Code getValue(ATMTransaction28 obj) {
			return obj.getResponse();
		}

		@Override
		public void setValue(ATMTransaction28 obj, Response2Code value) {
			obj.setResponse(value);
		}
	};
	@XmlElement(name = "Cmd")
	protected List<ATMCommand7> command;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ATMCommand7
	 * ATMCommand7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction28
	 * ATMTransaction28}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cmd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Command"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Maintenance command to perform on the ATM."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction22#mmCommand
	 * ATMTransaction22.mmCommand}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMTransaction28, List<ATMCommand7>> mmCommand = new MMMessageAssociationEnd<ATMTransaction28, List<ATMCommand7>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMTransaction28.mmObject();
			isDerived = false;
			xmlTag = "Cmd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Command";
			definition = "Maintenance command to perform on the ATM.";
			previousVersion_lazy = () -> ATMTransaction22.mmCommand;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ATMCommand7.mmObject();
		}

		@Override
		public List<ATMCommand7> getValue(ATMTransaction28 obj) {
			return obj.getCommand();
		}

		@Override
		public void setValue(ATMTransaction28 obj, List<ATMCommand7> value) {
			obj.setCommand(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMTransaction28.mmTransactionIdentification, com.tools20022.repository.msg.ATMTransaction28.mmResponse,
						com.tools20022.repository.msg.ATMTransaction28.mmCommand);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMTransaction28";
				definition = "Acknowledgement of the exception advice.";
				previousVersion_lazy = () -> ATMTransaction22.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<TransactionIdentifier1> getTransactionIdentification() {
		return transactionIdentification == null ? Optional.empty() : Optional.of(transactionIdentification);
	}

	public ATMTransaction28 setTransactionIdentification(TransactionIdentifier1 transactionIdentification) {
		this.transactionIdentification = transactionIdentification;
		return this;
	}

	public Response2Code getResponse() {
		return response;
	}

	public ATMTransaction28 setResponse(Response2Code response) {
		this.response = Objects.requireNonNull(response);
		return this;
	}

	public List<ATMCommand7> getCommand() {
		return command == null ? command = new ArrayList<>() : command;
	}

	public ATMTransaction28 setCommand(List<ATMCommand7> command) {
		this.command = Objects.requireNonNull(command);
		return this;
	}
}