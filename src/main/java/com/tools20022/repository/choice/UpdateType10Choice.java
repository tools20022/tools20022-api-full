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
import com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails11;
import com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails12;
import com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails13;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies the type of update requested. That is addition, deletion or
 * modification.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.UpdateType10Choice#mmAddition
 * UpdateType10Choice.mmAddition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.UpdateType10Choice#mmDeletion
 * UpdateType10Choice.mmDeletion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.UpdateType10Choice#mmModification
 * UpdateType10Choice.mmModification}</li>
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
 * "UpdateType10Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the type of update requested. That is addition, deletion or modification."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "UpdateType10Choice", propOrder = {"addition", "deletion", "modification"})
public class UpdateType10Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected SecuritiesSettlementTransactionDetails11 addition;
	/**
	 * Addition of information to the securities transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails11
	 * SecuritiesSettlementTransactionDetails11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.UpdateType10Choice
	 * UpdateType10Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Addtn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Addition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Addition of information to the securities transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAddition = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> UpdateType10Choice.mmObject();
			isDerived = false;
			xmlTag = "Addtn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Addition";
			definition = "Addition of information to the securities transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SecuritiesSettlementTransactionDetails11.mmObject();
		}
	};
	protected SecuritiesSettlementTransactionDetails12 deletion;
	/**
	 * Deletion of information in the securities transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails12
	 * SecuritiesSettlementTransactionDetails12}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.UpdateType10Choice
	 * UpdateType10Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Deltn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Deletion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Deletion of information in the securities transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDeletion = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> UpdateType10Choice.mmObject();
			isDerived = false;
			xmlTag = "Deltn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Deletion";
			definition = "Deletion of information in the securities transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SecuritiesSettlementTransactionDetails12.mmObject();
		}
	};
	protected SecuritiesSettlementTransactionDetails13 modification;
	/**
	 * Modification of information in the securities transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails13
	 * SecuritiesSettlementTransactionDetails13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.UpdateType10Choice
	 * UpdateType10Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Mod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Modification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Modification of information in the securities transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmModification = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> UpdateType10Choice.mmObject();
			isDerived = false;
			xmlTag = "Mod";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Modification";
			definition = "Modification of information in the securities transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SecuritiesSettlementTransactionDetails13.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(UpdateType10Choice.mmAddition, UpdateType10Choice.mmDeletion, UpdateType10Choice.mmModification);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "UpdateType10Choice";
				definition = "Specifies the type of update requested. That is addition, deletion or modification.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Addtn", required = true)
	public SecuritiesSettlementTransactionDetails11 getAddition() {
		return addition;
	}

	public void setAddition(SecuritiesSettlementTransactionDetails11 addition) {
		this.addition = addition;
	}

	@XmlElement(name = "Deltn", required = true)
	public SecuritiesSettlementTransactionDetails12 getDeletion() {
		return deletion;
	}

	public void setDeletion(SecuritiesSettlementTransactionDetails12 deletion) {
		this.deletion = deletion;
	}

	@XmlElement(name = "Mod", required = true)
	public SecuritiesSettlementTransactionDetails13 getModification() {
		return modification;
	}

	public void setModification(SecuritiesSettlementTransactionDetails13 modification) {
		this.modification = modification;
	}
}