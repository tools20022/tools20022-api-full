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

package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.entity.PaymentPartyRole;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Agent between the debtor's agent and the creditor's agent. There can be
 * several intermediary agents specified for the execution of a payment.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="IntermediaryAgentRole"
 * src="doc-files/IntermediaryAgentRole.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.IntermediaryAgentRole#mmIntermediaryAgentRole
 * IntermediaryAgentRole.mmIntermediaryAgentRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.IntermediaryAgentRole#mmNextParty
 * IntermediaryAgentRole.mmNextParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.IntermediaryAgentRole#mmPosition
 * IntermediaryAgentRole.mmPosition}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.IntermediaryAgentRole#mmIntermediaryAgentRole
 * IntermediaryAgentRole.mmIntermediaryAgentRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.IntermediaryAgentRole#mmNextParty
 * IntermediaryAgentRole.mmNextParty}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation#mmIntermediary
 * PaymentComplementaryInformation.mmIntermediary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestGroupInformation1#mmIntermediaryAgent
 * RequestGroupInformation1.mmIntermediaryAgent}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.PaymentPartyRole
 * PaymentPartyRole}</li>
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
 * "IntermediaryAgentRole"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Agent between the debtor's agent and the creditor's agent. There can be several intermediary agents specified for the execution of a payment."
 * </li>
 * </ul>
 */
public class IntermediaryAgentRole extends PaymentPartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected IntermediaryAgentRole intermediaryAgentRole;
	/**
	 * Specifies the settlement party which is followed by another party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.IntermediaryAgentRole#mmNextParty
	 * IntermediaryAgentRole.mmNextParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.IntermediaryAgentRole
	 * IntermediaryAgentRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.IntermediaryAgentRole
	 * IntermediaryAgentRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryAgentRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the settlement party which is followed by another party."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmIntermediaryAgentRole = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.IntermediaryAgentRole.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IntermediaryAgentRole";
			definition = "Specifies the settlement party which is followed by another party.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.IntermediaryAgentRole.mmNextParty;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.IntermediaryAgentRole.mmObject();
		}
	};
	protected IntermediaryAgentRole nextParty;
	/**
	 * Next intermediary in the payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.IntermediaryAgentRole#mmIntermediaryAgentRole
	 * IntermediaryAgentRole.mmIntermediaryAgentRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.IntermediaryAgentRole
	 * IntermediaryAgentRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.IntermediaryAgentRole
	 * IntermediaryAgentRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NextParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Next intermediary in the payment."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmNextParty = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.IntermediaryAgentRole.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NextParty";
			definition = "Next intermediary in the payment.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.IntermediaryAgentRole.mmIntermediaryAgentRole;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.IntermediaryAgentRole.mmObject();
		}
	};
	protected Number position;
	/**
	 * Number used to show the relative position of an intermediary in the
	 * payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.IntermediaryAgentRole
	 * IntermediaryAgentRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Position"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number used to show the relative position of an intermediary in the payment."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmPosition = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.IntermediaryAgentRole.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Position";
			definition = "Number used to show the relative position of an intermediary in the payment.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "IntermediaryAgentRole";
				definition = "Agent between the debtor's agent and the creditor's agent. There can be several intermediary agents specified for the execution of a payment.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.IntermediaryAgentRole.mmIntermediaryAgentRole, com.tools20022.repository.entity.IntermediaryAgentRole.mmNextParty);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentComplementaryInformation.mmIntermediary, com.tools20022.repository.msg.RequestGroupInformation1.mmIntermediaryAgent);
				superType_lazy = () -> PaymentPartyRole.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.IntermediaryAgentRole.mmIntermediaryAgentRole, com.tools20022.repository.entity.IntermediaryAgentRole.mmNextParty,
						com.tools20022.repository.entity.IntermediaryAgentRole.mmPosition);
			}
		});
		return mmObject_lazy.get();
	}

	public IntermediaryAgentRole getIntermediaryAgentRole() {
		return intermediaryAgentRole;
	}

	public void setIntermediaryAgentRole(com.tools20022.repository.entity.IntermediaryAgentRole intermediaryAgentRole) {
		this.intermediaryAgentRole = intermediaryAgentRole;
	}

	public IntermediaryAgentRole getNextParty() {
		return nextParty;
	}

	public void setNextParty(com.tools20022.repository.entity.IntermediaryAgentRole nextParty) {
		this.nextParty = nextParty;
	}

	public Number getPosition() {
		return position;
	}

	public void setPosition(Number position) {
		this.position = position;
	}
}