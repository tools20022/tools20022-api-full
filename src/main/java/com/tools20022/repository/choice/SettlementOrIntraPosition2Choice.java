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
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.IntraPosition5;
import com.tools20022.repository.msg.TransactionDetails94;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice between the intra-position movement or the settlement transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementOrIntraPosition2Choice#mmIntraPositionMovement
 * SettlementOrIntraPosition2Choice.mmIntraPositionMovement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementOrIntraPosition2Choice#mmSettlementTransaction
 * SettlementOrIntraPosition2Choice.mmSettlementTransaction}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SettlementOrIntraPosition2Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice between the intra-position movement or the settlement transaction."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.choice.SettlementOrIntraPosition1Choice
 * SettlementOrIntraPosition1Choice}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SettlementOrIntraPosition2Choice", propOrder = {"intraPositionMovement", "settlementTransaction"})
public class SettlementOrIntraPosition2Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "IntraPosMvmnt", required = true)
	protected IntraPosition5 intraPositionMovement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.IntraPosition5
	 * IntraPosition5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SettlementOrIntraPosition2Choice
	 * SettlementOrIntraPosition2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntraPosMvmnt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntraPositionMovement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the requested intra-position movement details."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.SettlementOrIntraPosition1Choice#mmIntraPositionMovement
	 * SettlementOrIntraPosition1Choice.mmIntraPositionMovement}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SettlementOrIntraPosition2Choice, IntraPosition5> mmIntraPositionMovement = new MMMessageAssociationEnd<SettlementOrIntraPosition2Choice, IntraPosition5>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.SettlementOrIntraPosition2Choice.mmObject();
			isDerived = false;
			xmlTag = "IntraPosMvmnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntraPositionMovement";
			definition = "Specifies the requested intra-position movement details.";
			previousVersion_lazy = () -> SettlementOrIntraPosition1Choice.mmIntraPositionMovement;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> IntraPosition5.mmObject();
		}

		@Override
		public IntraPosition5 getValue(SettlementOrIntraPosition2Choice obj) {
			return obj.getIntraPositionMovement();
		}

		@Override
		public void setValue(SettlementOrIntraPosition2Choice obj, IntraPosition5 value) {
			obj.setIntraPositionMovement(value);
		}
	};
	@XmlElement(name = "SttlmTx", required = true)
	protected TransactionDetails94 settlementTransaction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TransactionDetails94
	 * TransactionDetails94}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SettlementOrIntraPosition2Choice
	 * SettlementOrIntraPosition2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmTx"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the requested settlement transaction details."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.SettlementOrIntraPosition1Choice#mmSettlementTransaction
	 * SettlementOrIntraPosition1Choice.mmSettlementTransaction}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SettlementOrIntraPosition2Choice, TransactionDetails94> mmSettlementTransaction = new MMMessageAssociationEnd<SettlementOrIntraPosition2Choice, TransactionDetails94>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.SettlementOrIntraPosition2Choice.mmObject();
			isDerived = false;
			xmlTag = "SttlmTx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementTransaction";
			definition = "Specifies the requested settlement transaction details.";
			previousVersion_lazy = () -> SettlementOrIntraPosition1Choice.mmSettlementTransaction;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> TransactionDetails94.mmObject();
		}

		@Override
		public TransactionDetails94 getValue(SettlementOrIntraPosition2Choice obj) {
			return obj.getSettlementTransaction();
		}

		@Override
		public void setValue(SettlementOrIntraPosition2Choice obj, TransactionDetails94 value) {
			obj.setSettlementTransaction(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.SettlementOrIntraPosition2Choice.mmIntraPositionMovement, com.tools20022.repository.choice.SettlementOrIntraPosition2Choice.mmSettlementTransaction);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "SettlementOrIntraPosition2Choice";
				definition = "Choice between the intra-position movement or the settlement transaction.";
				previousVersion_lazy = () -> SettlementOrIntraPosition1Choice.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public IntraPosition5 getIntraPositionMovement() {
		return intraPositionMovement;
	}

	public SettlementOrIntraPosition2Choice setIntraPositionMovement(IntraPosition5 intraPositionMovement) {
		this.intraPositionMovement = Objects.requireNonNull(intraPositionMovement);
		return this;
	}

	public TransactionDetails94 getSettlementTransaction() {
		return settlementTransaction;
	}

	public SettlementOrIntraPosition2Choice setSettlementTransaction(TransactionDetails94 settlementTransaction) {
		this.settlementTransaction = Objects.requireNonNull(settlementTransaction);
		return this;
	}
}