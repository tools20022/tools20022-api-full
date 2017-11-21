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
import com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestV05;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails26;
import com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails27;
import com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails28;
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
 * {@linkplain com.tools20022.repository.choice.UpdateType25Choice#mmAddition
 * UpdateType25Choice.mmAddition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.UpdateType25Choice#mmDeletion
 * UpdateType25Choice.mmDeletion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.UpdateType25Choice#mmModification
 * UpdateType25Choice.mmModification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestV05#mmUpdateType
 * SecuritiesSettlementTransactionModificationRequestV05.mmUpdateType}</li>
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
 * "UpdateType25Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the type of update requested. That is addition, deletion or modification."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.choice.UpdateType14Choice
 * UpdateType14Choice}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "UpdateType25Choice", propOrder = {"addition", "deletion", "modification"})
public class UpdateType25Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected SecuritiesSettlementTransactionDetails26 addition;
	/**
	 * Addition of information to the securities transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails26
	 * SecuritiesSettlementTransactionDetails26}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.UpdateType25Choice
	 * UpdateType25Choice}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.UpdateType14Choice#mmAddition
	 * UpdateType14Choice.mmAddition}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAddition = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> UpdateType25Choice.mmObject();
			isDerived = false;
			xmlTag = "Addtn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Addition";
			definition = "Addition of information to the securities transaction.";
			previousVersion_lazy = () -> UpdateType14Choice.mmAddition;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SecuritiesSettlementTransactionDetails26.mmObject();
		}
	};
	protected SecuritiesSettlementTransactionDetails27 deletion;
	/**
	 * Deletion of information in the securities transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails27
	 * SecuritiesSettlementTransactionDetails27}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.UpdateType25Choice
	 * UpdateType25Choice}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.UpdateType14Choice#mmDeletion
	 * UpdateType14Choice.mmDeletion}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDeletion = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> UpdateType25Choice.mmObject();
			isDerived = false;
			xmlTag = "Deltn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Deletion";
			definition = "Deletion of information in the securities transaction.";
			previousVersion_lazy = () -> UpdateType14Choice.mmDeletion;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SecuritiesSettlementTransactionDetails27.mmObject();
		}
	};
	protected SecuritiesSettlementTransactionDetails28 modification;
	/**
	 * Modification of information in the securities transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails28
	 * SecuritiesSettlementTransactionDetails28}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.UpdateType25Choice
	 * UpdateType25Choice}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.UpdateType14Choice#mmModification
	 * UpdateType14Choice.mmModification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmModification = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> UpdateType25Choice.mmObject();
			isDerived = false;
			xmlTag = "Mod";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Modification";
			definition = "Modification of information in the securities transaction.";
			previousVersion_lazy = () -> UpdateType14Choice.mmModification;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SecuritiesSettlementTransactionDetails28.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(UpdateType25Choice.mmAddition, UpdateType25Choice.mmDeletion, UpdateType25Choice.mmModification);
				messageBuildingBlock_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionModificationRequestV05.mmUpdateType);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "UpdateType25Choice";
				definition = "Specifies the type of update requested. That is addition, deletion or modification.";
				previousVersion_lazy = () -> UpdateType14Choice.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Addtn", required = true)
	public SecuritiesSettlementTransactionDetails26 getAddition() {
		return addition;
	}

	public void setAddition(SecuritiesSettlementTransactionDetails26 addition) {
		this.addition = addition;
	}

	@XmlElement(name = "Deltn", required = true)
	public SecuritiesSettlementTransactionDetails27 getDeletion() {
		return deletion;
	}

	public void setDeletion(SecuritiesSettlementTransactionDetails27 deletion) {
		this.deletion = deletion;
	}

	@XmlElement(name = "Mod", required = true)
	public SecuritiesSettlementTransactionDetails28 getModification() {
		return modification;
	}

	public void setModification(SecuritiesSettlementTransactionDetails28 modification) {
		this.modification = modification;
	}
}