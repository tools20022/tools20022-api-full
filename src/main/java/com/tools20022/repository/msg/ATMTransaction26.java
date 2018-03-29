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
import com.tools20022.repository.codeset.ATMOperation1Code;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information about the reconciliation response.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransaction26#mmTypeOfOperation
 * ATMTransaction26.mmTypeOfOperation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransaction26#mmTransactionIdentification
 * ATMTransaction26.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransaction26#mmReconciliationIdentification
 * ATMTransaction26.mmReconciliationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransaction26#mmTransactionResponse
 * ATMTransaction26.mmTransactionResponse}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMTransaction26#mmATMTotals
 * ATMTransaction26.mmATMTotals}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMTransaction26#mmCassette
 * ATMTransaction26.mmCassette}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMTransaction26#mmCommand
 * ATMTransaction26.mmCommand}</li>
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
 * "ATMTransaction26"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information about the reconciliation response."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ATMTransaction26", propOrder = {"typeOfOperation", "transactionIdentification", "reconciliationIdentification", "transactionResponse", "aTMTotals", "cassette", "command"})
public class ATMTransaction26 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TpOfOpr")
	protected ATMOperation1Code typeOfOperation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ATMOperation1Code
	 * ATMOperation1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction26
	 * ATMTransaction26}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TpOfOpr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TypeOfOperation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Type of logical or physical operation on the ATM for which the counters are computed."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMTransaction26, Optional<ATMOperation1Code>> mmTypeOfOperation = new MMMessageAttribute<ATMTransaction26, Optional<ATMOperation1Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMTransaction26.mmObject();
			isDerived = false;
			xmlTag = "TpOfOpr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TypeOfOperation";
			definition = "Type of logical or physical operation on the ATM for which the counters are computed.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ATMOperation1Code.mmObject();
		}

		@Override
		public Optional<ATMOperation1Code> getValue(ATMTransaction26 obj) {
			return obj.getTypeOfOperation();
		}

		@Override
		public void setValue(ATMTransaction26 obj, Optional<ATMOperation1Code> value) {
			obj.setTypeOfOperation(value.orElse(null));
		}
	};
	@XmlElement(name = "TxId", required = true)
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
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction26
	 * ATMTransaction26}</li>
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
	 * definition} = "Identification of the reconciliation transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMTransaction26, TransactionIdentifier1> mmTransactionIdentification = new MMMessageAssociationEnd<ATMTransaction26, TransactionIdentifier1>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMTransaction26.mmObject();
			isDerived = false;
			xmlTag = "TxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentification";
			definition = "Identification of the reconciliation transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> TransactionIdentifier1.mmObject();
		}

		@Override
		public TransactionIdentifier1 getValue(ATMTransaction26 obj) {
			return obj.getTransactionIdentification();
		}

		@Override
		public void setValue(ATMTransaction26 obj, TransactionIdentifier1 value) {
			obj.setTransactionIdentification(value);
		}
	};
	@XmlElement(name = "RcncltnId", required = true)
	protected Max35Text reconciliationIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction26
	 * ATMTransaction26}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcncltnId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReconciliationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the reconciliation period assigned by the ATM."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMTransaction26, Max35Text> mmReconciliationIdentification = new MMMessageAttribute<ATMTransaction26, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMTransaction26.mmObject();
			isDerived = false;
			xmlTag = "RcncltnId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReconciliationIdentification";
			definition = "Identification of the reconciliation period assigned by the ATM.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(ATMTransaction26 obj) {
			return obj.getReconciliationIdentification();
		}

		@Override
		public void setValue(ATMTransaction26 obj, Max35Text value) {
			obj.setReconciliationIdentification(value);
		}
	};
	@XmlElement(name = "TxRspn", required = true)
	protected ResponseType7 transactionResponse;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ResponseType7
	 * ResponseType7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction26
	 * ATMTransaction26}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxRspn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionResponse"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Result of the reconciliation."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMTransaction26, ResponseType7> mmTransactionResponse = new MMMessageAssociationEnd<ATMTransaction26, ResponseType7>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMTransaction26.mmObject();
			isDerived = false;
			xmlTag = "TxRspn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionResponse";
			definition = "Result of the reconciliation.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ResponseType7.mmObject();
		}

		@Override
		public ResponseType7 getValue(ATMTransaction26 obj) {
			return obj.getTransactionResponse();
		}

		@Override
		public void setValue(ATMTransaction26 obj, ResponseType7 value) {
			obj.setTransactionResponse(value);
		}
	};
	@XmlElement(name = "ATMTtls")
	protected List<ATMTotals1> aTMTotals;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ATMTotals1 ATMTotals1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction26
	 * ATMTransaction26}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ATMTtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMTotals"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Current totals of the ATM."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMTransaction26, List<ATMTotals1>> mmATMTotals = new MMMessageAssociationEnd<ATMTransaction26, List<ATMTotals1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMTransaction26.mmObject();
			isDerived = false;
			xmlTag = "ATMTtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMTotals";
			definition = "Current totals of the ATM.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ATMTotals1.mmObject();
		}

		@Override
		public List<ATMTotals1> getValue(ATMTransaction26 obj) {
			return obj.getATMTotals();
		}

		@Override
		public void setValue(ATMTransaction26 obj, List<ATMTotals1> value) {
			obj.setATMTotals(value);
		}
	};
	@XmlElement(name = "Csstt")
	protected List<ATMCassette2> cassette;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ATMCassette2
	 * ATMCassette2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction26
	 * ATMTransaction26}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Csstt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cassette"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information on the cassettes of the ATM."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMTransaction26, List<ATMCassette2>> mmCassette = new MMMessageAssociationEnd<ATMTransaction26, List<ATMCassette2>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMTransaction26.mmObject();
			isDerived = false;
			xmlTag = "Csstt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cassette";
			definition = "Information on the cassettes of the ATM.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ATMCassette2.mmObject();
		}

		@Override
		public List<ATMCassette2> getValue(ATMTransaction26 obj) {
			return obj.getCassette();
		}

		@Override
		public void setValue(ATMTransaction26 obj, List<ATMCassette2> value) {
			obj.setCassette(value);
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
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction26
	 * ATMTransaction26}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMTransaction26, List<ATMCommand7>> mmCommand = new MMMessageAssociationEnd<ATMTransaction26, List<ATMCommand7>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMTransaction26.mmObject();
			isDerived = false;
			xmlTag = "Cmd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Command";
			definition = "Maintenance command to perform on the ATM.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ATMCommand7.mmObject();
		}

		@Override
		public List<ATMCommand7> getValue(ATMTransaction26 obj) {
			return obj.getCommand();
		}

		@Override
		public void setValue(ATMTransaction26 obj, List<ATMCommand7> value) {
			obj.setCommand(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMTransaction26.mmTypeOfOperation, com.tools20022.repository.msg.ATMTransaction26.mmTransactionIdentification,
						com.tools20022.repository.msg.ATMTransaction26.mmReconciliationIdentification, com.tools20022.repository.msg.ATMTransaction26.mmTransactionResponse, com.tools20022.repository.msg.ATMTransaction26.mmATMTotals,
						com.tools20022.repository.msg.ATMTransaction26.mmCassette, com.tools20022.repository.msg.ATMTransaction26.mmCommand);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMTransaction26";
				definition = "Information about the reconciliation response.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<ATMOperation1Code> getTypeOfOperation() {
		return typeOfOperation == null ? Optional.empty() : Optional.of(typeOfOperation);
	}

	public ATMTransaction26 setTypeOfOperation(ATMOperation1Code typeOfOperation) {
		this.typeOfOperation = typeOfOperation;
		return this;
	}

	public TransactionIdentifier1 getTransactionIdentification() {
		return transactionIdentification;
	}

	public ATMTransaction26 setTransactionIdentification(TransactionIdentifier1 transactionIdentification) {
		this.transactionIdentification = Objects.requireNonNull(transactionIdentification);
		return this;
	}

	public Max35Text getReconciliationIdentification() {
		return reconciliationIdentification;
	}

	public ATMTransaction26 setReconciliationIdentification(Max35Text reconciliationIdentification) {
		this.reconciliationIdentification = Objects.requireNonNull(reconciliationIdentification);
		return this;
	}

	public ResponseType7 getTransactionResponse() {
		return transactionResponse;
	}

	public ATMTransaction26 setTransactionResponse(ResponseType7 transactionResponse) {
		this.transactionResponse = Objects.requireNonNull(transactionResponse);
		return this;
	}

	public List<ATMTotals1> getATMTotals() {
		return aTMTotals == null ? aTMTotals = new ArrayList<>() : aTMTotals;
	}

	public ATMTransaction26 setATMTotals(List<ATMTotals1> aTMTotals) {
		this.aTMTotals = Objects.requireNonNull(aTMTotals);
		return this;
	}

	public List<ATMCassette2> getCassette() {
		return cassette == null ? cassette = new ArrayList<>() : cassette;
	}

	public ATMTransaction26 setCassette(List<ATMCassette2> cassette) {
		this.cassette = Objects.requireNonNull(cassette);
		return this;
	}

	public List<ATMCommand7> getCommand() {
		return command == null ? command = new ArrayList<>() : command;
	}

	public ATMTransaction26 setCommand(List<ATMCommand7> command) {
		this.command = Objects.requireNonNull(command);
		return this;
	}
}