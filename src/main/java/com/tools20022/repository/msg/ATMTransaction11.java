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
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ATMCassette1;
import com.tools20022.repository.msg.ATMTotals1;
import com.tools20022.repository.msg.ATMTotals3;
import com.tools20022.repository.msg.TransactionIdentifier1;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information about the reconciliation request.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransaction11#mmTypeOfOperation
 * ATMTransaction11.mmTypeOfOperation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransaction11#mmTransactionIdentification
 * ATMTransaction11.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransaction11#mmReconciliationIdentification
 * ATMTransaction11.mmReconciliationIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMTransaction11#mmATMTotals
 * ATMTransaction11.mmATMTotals}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMTransaction11#mmCassette
 * ATMTransaction11.mmCassette}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransaction11#mmTransactionTotals
 * ATMTransaction11.mmTransactionTotals}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransaction11#mmRetainedCard
 * ATMTransaction11.mmRetainedCard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransaction11#mmAdditionalTransactionInformation
 * ATMTransaction11.mmAdditionalTransactionInformation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ATMTransaction11"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information about the reconciliation request."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.ATMTransaction3
 * ATMTransaction3}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ATMTransaction11", propOrder = {"typeOfOperation", "transactionIdentification", "reconciliationIdentification", "aTMTotals", "cassette", "transactionTotals", "retainedCard", "additionalTransactionInformation"})
public class ATMTransaction11 {

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
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction11
	 * ATMTransaction11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TpOfOpr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TypeOfOperation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Type of logical or physical operation on the ATM for which the counters are computed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMTransaction11, Optional<ATMOperation1Code>> mmTypeOfOperation = new MMMessageAttribute<ATMTransaction11, Optional<ATMOperation1Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMTransaction11.mmObject();
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
		public Optional<ATMOperation1Code> getValue(ATMTransaction11 obj) {
			return obj.getTypeOfOperation();
		}

		@Override
		public void setValue(ATMTransaction11 obj, Optional<ATMOperation1Code> value) {
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
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction11
	 * ATMTransaction11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the reconciliation transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMTransaction11, TransactionIdentifier1> mmTransactionIdentification = new MMMessageAssociationEnd<ATMTransaction11, TransactionIdentifier1>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMTransaction11.mmObject();
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
		public TransactionIdentifier1 getValue(ATMTransaction11 obj) {
			return obj.getTransactionIdentification();
		}

		@Override
		public void setValue(ATMTransaction11 obj, TransactionIdentifier1 value) {
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
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction11
	 * ATMTransaction11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcncltnId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReconciliationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the reconciliation period."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMTransaction11, Max35Text> mmReconciliationIdentification = new MMMessageAttribute<ATMTransaction11, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMTransaction11.mmObject();
			isDerived = false;
			xmlTag = "RcncltnId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReconciliationIdentification";
			definition = "Identification of the reconciliation period.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(ATMTransaction11 obj) {
			return obj.getReconciliationIdentification();
		}

		@Override
		public void setValue(ATMTransaction11 obj, Max35Text value) {
			obj.setReconciliationIdentification(value);
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
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction11
	 * ATMTransaction11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ATMTtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMTotals"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Current totals of the ATM."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction3#mmATMTotals
	 * ATMTransaction3.mmATMTotals}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMTransaction11, List<ATMTotals1>> mmATMTotals = new MMMessageAssociationEnd<ATMTransaction11, List<ATMTotals1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMTransaction11.mmObject();
			isDerived = false;
			xmlTag = "ATMTtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMTotals";
			definition = "Current totals of the ATM.";
			previousVersion_lazy = () -> ATMTransaction3.mmATMTotals;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ATMTotals1.mmObject();
		}

		@Override
		public List<ATMTotals1> getValue(ATMTransaction11 obj) {
			return obj.getATMTotals();
		}

		@Override
		public void setValue(ATMTransaction11 obj, List<ATMTotals1> value) {
			obj.setATMTotals(value);
		}
	};
	@XmlElement(name = "Csstt")
	protected List<ATMCassette1> cassette;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ATMCassette1
	 * ATMCassette1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction11
	 * ATMTransaction11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Csstt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cassette"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information on the cassette of the ATM."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction3#mmCassette
	 * ATMTransaction3.mmCassette}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMTransaction11, List<ATMCassette1>> mmCassette = new MMMessageAssociationEnd<ATMTransaction11, List<ATMCassette1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMTransaction11.mmObject();
			isDerived = false;
			xmlTag = "Csstt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cassette";
			definition = "Information on the cassette of the ATM.";
			previousVersion_lazy = () -> ATMTransaction3.mmCassette;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ATMCassette1.mmObject();
		}

		@Override
		public List<ATMCassette1> getValue(ATMTransaction11 obj) {
			return obj.getCassette();
		}

		@Override
		public void setValue(ATMTransaction11 obj, List<ATMCassette1> value) {
			obj.setCassette(value);
		}
	};
	@XmlElement(name = "TxTtls")
	protected List<ATMTotals3> transactionTotals;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ATMTotals3 ATMTotals3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction11
	 * ATMTransaction11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxTtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionTotals"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction counters that are set to zero after a reconciliation with counter reinitialisation command."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMTransaction11, List<ATMTotals3>> mmTransactionTotals = new MMMessageAssociationEnd<ATMTransaction11, List<ATMTotals3>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMTransaction11.mmObject();
			isDerived = false;
			xmlTag = "TxTtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionTotals";
			definition = "Transaction counters that are set to zero after a reconciliation with counter reinitialisation command.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ATMTotals3.mmObject();
		}

		@Override
		public List<ATMTotals3> getValue(ATMTransaction11 obj) {
			return obj.getTransactionTotals();
		}

		@Override
		public void setValue(ATMTransaction11 obj, List<ATMTotals3> value) {
			obj.setTransactionTotals(value);
		}
	};
	@XmlElement(name = "RtndCard")
	protected Number retainedCard;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction11
	 * ATMTransaction11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RtndCard"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RetainedCard"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total number of retained cards."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMTransaction11, Optional<Number>> mmRetainedCard = new MMMessageAttribute<ATMTransaction11, Optional<Number>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMTransaction11.mmObject();
			isDerived = false;
			xmlTag = "RtndCard";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RetainedCard";
			definition = "Total number of retained cards.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Optional<Number> getValue(ATMTransaction11 obj) {
			return obj.getRetainedCard();
		}

		@Override
		public void setValue(ATMTransaction11 obj, Optional<Number> value) {
			obj.setRetainedCard(value.orElse(null));
		}
	};
	@XmlElement(name = "AddtlTxInf")
	protected Max140Text additionalTransactionInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction11
	 * ATMTransaction11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlTxInf"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalTransactionInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Additional information about reconciliation."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMTransaction11, Optional<Max140Text>> mmAdditionalTransactionInformation = new MMMessageAttribute<ATMTransaction11, Optional<Max140Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMTransaction11.mmObject();
			isDerived = false;
			xmlTag = "AddtlTxInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalTransactionInformation";
			definition = "Additional information about reconciliation.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}

		@Override
		public Optional<Max140Text> getValue(ATMTransaction11 obj) {
			return obj.getAdditionalTransactionInformation();
		}

		@Override
		public void setValue(ATMTransaction11 obj, Optional<Max140Text> value) {
			obj.setAdditionalTransactionInformation(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMTransaction11.mmTypeOfOperation, com.tools20022.repository.msg.ATMTransaction11.mmTransactionIdentification,
						com.tools20022.repository.msg.ATMTransaction11.mmReconciliationIdentification, com.tools20022.repository.msg.ATMTransaction11.mmATMTotals, com.tools20022.repository.msg.ATMTransaction11.mmCassette,
						com.tools20022.repository.msg.ATMTransaction11.mmTransactionTotals, com.tools20022.repository.msg.ATMTransaction11.mmRetainedCard, com.tools20022.repository.msg.ATMTransaction11.mmAdditionalTransactionInformation);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMTransaction11";
				definition = "Information about the reconciliation request.";
				previousVersion_lazy = () -> ATMTransaction3.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<ATMOperation1Code> getTypeOfOperation() {
		return typeOfOperation == null ? Optional.empty() : Optional.of(typeOfOperation);
	}

	public ATMTransaction11 setTypeOfOperation(ATMOperation1Code typeOfOperation) {
		this.typeOfOperation = typeOfOperation;
		return this;
	}

	public TransactionIdentifier1 getTransactionIdentification() {
		return transactionIdentification;
	}

	public ATMTransaction11 setTransactionIdentification(TransactionIdentifier1 transactionIdentification) {
		this.transactionIdentification = Objects.requireNonNull(transactionIdentification);
		return this;
	}

	public Max35Text getReconciliationIdentification() {
		return reconciliationIdentification;
	}

	public ATMTransaction11 setReconciliationIdentification(Max35Text reconciliationIdentification) {
		this.reconciliationIdentification = Objects.requireNonNull(reconciliationIdentification);
		return this;
	}

	public List<ATMTotals1> getATMTotals() {
		return aTMTotals == null ? aTMTotals = new ArrayList<>() : aTMTotals;
	}

	public ATMTransaction11 setATMTotals(List<ATMTotals1> aTMTotals) {
		this.aTMTotals = Objects.requireNonNull(aTMTotals);
		return this;
	}

	public List<ATMCassette1> getCassette() {
		return cassette == null ? cassette = new ArrayList<>() : cassette;
	}

	public ATMTransaction11 setCassette(List<ATMCassette1> cassette) {
		this.cassette = Objects.requireNonNull(cassette);
		return this;
	}

	public List<ATMTotals3> getTransactionTotals() {
		return transactionTotals == null ? transactionTotals = new ArrayList<>() : transactionTotals;
	}

	public ATMTransaction11 setTransactionTotals(List<ATMTotals3> transactionTotals) {
		this.transactionTotals = Objects.requireNonNull(transactionTotals);
		return this;
	}

	public Optional<Number> getRetainedCard() {
		return retainedCard == null ? Optional.empty() : Optional.of(retainedCard);
	}

	public ATMTransaction11 setRetainedCard(Number retainedCard) {
		this.retainedCard = retainedCard;
		return this;
	}

	public Optional<Max140Text> getAdditionalTransactionInformation() {
		return additionalTransactionInformation == null ? Optional.empty() : Optional.of(additionalTransactionInformation);
	}

	public ATMTransaction11 setAdditionalTransactionInformation(Max140Text additionalTransactionInformation) {
		this.additionalTransactionInformation = additionalTransactionInformation;
		return this;
	}
}