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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.TradePositionReport4Choice;
import com.tools20022.repository.choice.TradeTransactionReport4Choice;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Position/transaction reporting under EMIR regulation.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TradeReport3Choice#mmPosition
 * TradeReport3Choice.mmPosition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TradeReport3Choice#mmTransaction
 * TradeReport3Choice.mmTransaction}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TradeReport3Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Position/transaction reporting under EMIR regulation."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TradeReport3Choice", propOrder = {"position", "transaction"})
public class TradeReport3Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Pos", required = true)
	protected TradePositionReport4Choice position;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.TradePositionReport4Choice
	 * TradePositionReport4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.TradeReport3Choice
	 * TradeReport3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Pos"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Position"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information concerning the reporting at position level."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TradeReport3Choice, TradePositionReport4Choice> mmPosition = new MMMessageAssociationEnd<TradeReport3Choice, TradePositionReport4Choice>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.TradeReport3Choice.mmObject();
			isDerived = false;
			xmlTag = "Pos";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Position";
			definition = "Information concerning the reporting at position level.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> TradePositionReport4Choice.mmObject();
		}

		@Override
		public TradePositionReport4Choice getValue(TradeReport3Choice obj) {
			return obj.getPosition();
		}

		@Override
		public void setValue(TradeReport3Choice obj, TradePositionReport4Choice value) {
			obj.setPosition(value);
		}
	};
	@XmlElement(name = "Tx", required = true)
	protected TradeTransactionReport4Choice transaction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.TradeTransactionReport4Choice
	 * TradeTransactionReport4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.TradeReport3Choice
	 * TradeReport3Choice}</li>
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
	 * definition} =
	 * "Information concerning the reporting at transaction level."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TradeReport3Choice, TradeTransactionReport4Choice> mmTransaction = new MMMessageAssociationEnd<TradeReport3Choice, TradeTransactionReport4Choice>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.TradeReport3Choice.mmObject();
			isDerived = false;
			xmlTag = "Tx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Transaction";
			definition = "Information concerning the reporting at transaction level.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> TradeTransactionReport4Choice.mmObject();
		}

		@Override
		public TradeTransactionReport4Choice getValue(TradeReport3Choice obj) {
			return obj.getTransaction();
		}

		@Override
		public void setValue(TradeReport3Choice obj, TradeTransactionReport4Choice value) {
			obj.setTransaction(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.TradeReport3Choice.mmPosition, com.tools20022.repository.choice.TradeReport3Choice.mmTransaction);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "TradeReport3Choice";
				definition = "Position/transaction reporting under EMIR regulation.";
			}
		});
		return mmObject_lazy.get();
	}

	public TradePositionReport4Choice getPosition() {
		return position;
	}

	public TradeReport3Choice setPosition(TradePositionReport4Choice position) {
		this.position = Objects.requireNonNull(position);
		return this;
	}

	public TradeTransactionReport4Choice getTransaction() {
		return transaction;
	}

	public TradeReport3Choice setTransaction(TradeTransactionReport4Choice transaction) {
		this.transaction = Objects.requireNonNull(transaction);
		return this;
	}
}