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
import com.tools20022.repository.msg.IntraPosition4;
import com.tools20022.repository.msg.TransactionDetails52;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
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
 * {@linkplain com.tools20022.repository.choice.SettlementOrIntraPosition1Choice#mmIntraPositionMovement
 * SettlementOrIntraPosition1Choice.mmIntraPositionMovement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementOrIntraPosition1Choice#mmSettlementTransaction
 * SettlementOrIntraPosition1Choice.mmSettlementTransaction}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SettlementOrIntraPosition1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice between the intra-position movement or the settlement transaction."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "SettlementOrIntraPosition1Choice", propOrder = {"intraPositionMovement", "settlementTransaction"})
public class SettlementOrIntraPosition1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected IntraPosition4 intraPositionMovement;
	/**
	 * Specifies the requested intra-position movement details.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.IntraPosition4
	 * IntraPosition4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SettlementOrIntraPosition1Choice
	 * SettlementOrIntraPosition1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntraPosMvmnt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntraPositionMovement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the requested intra-position movement details."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmIntraPositionMovement = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> SettlementOrIntraPosition1Choice.mmObject();
			isDerived = false;
			xmlTag = "IntraPosMvmnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntraPositionMovement";
			definition = "Specifies the requested intra-position movement details.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> IntraPosition4.mmObject();
		}
	};
	protected TransactionDetails52 settlementTransaction;
	/**
	 * Specifies the requested settlement transaction details.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TransactionDetails52
	 * TransactionDetails52}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SettlementOrIntraPosition1Choice
	 * SettlementOrIntraPosition1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmTx"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the requested settlement transaction details."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSettlementTransaction = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> SettlementOrIntraPosition1Choice.mmObject();
			isDerived = false;
			xmlTag = "SttlmTx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementTransaction";
			definition = "Specifies the requested settlement transaction details.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> TransactionDetails52.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(SettlementOrIntraPosition1Choice.mmIntraPositionMovement, SettlementOrIntraPosition1Choice.mmSettlementTransaction);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "SettlementOrIntraPosition1Choice";
				definition = "Choice between the intra-position movement or the settlement transaction.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "IntraPosMvmnt", required = true)
	public IntraPosition4 getIntraPositionMovement() {
		return intraPositionMovement;
	}

	public void setIntraPositionMovement(IntraPosition4 intraPositionMovement) {
		this.intraPositionMovement = intraPositionMovement;
	}

	@XmlElement(name = "SttlmTx", required = true)
	public TransactionDetails52 getSettlementTransaction() {
		return settlementTransaction;
	}

	public void setSettlementTransaction(TransactionDetails52 settlementTransaction) {
		this.settlementTransaction = settlementTransaction;
	}
}