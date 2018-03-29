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
import com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestV03;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails14;
import com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails15;
import com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails16;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
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
 * {@linkplain com.tools20022.repository.choice.UpdateType11Choice#mmAddition
 * UpdateType11Choice.mmAddition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.UpdateType11Choice#mmDeletion
 * UpdateType11Choice.mmDeletion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.UpdateType11Choice#mmModification
 * UpdateType11Choice.mmModification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestV03#mmUpdateType
 * SecuritiesSettlementTransactionModificationRequestV03.mmUpdateType}</li>
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
 * "UpdateType11Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the type of update requested. That is addition, deletion or modification."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.UpdateType14Choice
 * UpdateType14Choice}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.choice.UpdateType9Choice
 * UpdateType9Choice}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "UpdateType11Choice", propOrder = {"addition", "deletion", "modification"})
public class UpdateType11Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Addtn", required = true)
	protected SecuritiesSettlementTransactionDetails15 addition;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails15
	 * SecuritiesSettlementTransactionDetails15}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.UpdateType11Choice
	 * UpdateType11Choice}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UpdateType14Choice#mmAddition
	 * UpdateType14Choice.mmAddition}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.UpdateType9Choice#mmAddition
	 * UpdateType9Choice.mmAddition}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<UpdateType11Choice, SecuritiesSettlementTransactionDetails15> mmAddition = new MMMessageAssociationEnd<UpdateType11Choice, SecuritiesSettlementTransactionDetails15>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.UpdateType11Choice.mmObject();
			isDerived = false;
			xmlTag = "Addtn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Addition";
			definition = "Addition of information to the securities transaction.";
			nextVersions_lazy = () -> Arrays.asList(UpdateType14Choice.mmAddition);
			previousVersion_lazy = () -> UpdateType9Choice.mmAddition;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SecuritiesSettlementTransactionDetails15.mmObject();
		}

		@Override
		public SecuritiesSettlementTransactionDetails15 getValue(UpdateType11Choice obj) {
			return obj.getAddition();
		}

		@Override
		public void setValue(UpdateType11Choice obj, SecuritiesSettlementTransactionDetails15 value) {
			obj.setAddition(value);
		}
	};
	@XmlElement(name = "Deltn", required = true)
	protected SecuritiesSettlementTransactionDetails16 deletion;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails16
	 * SecuritiesSettlementTransactionDetails16}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.UpdateType11Choice
	 * UpdateType11Choice}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UpdateType14Choice#mmDeletion
	 * UpdateType14Choice.mmDeletion}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.UpdateType9Choice#mmDeletion
	 * UpdateType9Choice.mmDeletion}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<UpdateType11Choice, SecuritiesSettlementTransactionDetails16> mmDeletion = new MMMessageAssociationEnd<UpdateType11Choice, SecuritiesSettlementTransactionDetails16>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.UpdateType11Choice.mmObject();
			isDerived = false;
			xmlTag = "Deltn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Deletion";
			definition = "Deletion of information in the securities transaction.";
			nextVersions_lazy = () -> Arrays.asList(UpdateType14Choice.mmDeletion);
			previousVersion_lazy = () -> UpdateType9Choice.mmDeletion;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SecuritiesSettlementTransactionDetails16.mmObject();
		}

		@Override
		public SecuritiesSettlementTransactionDetails16 getValue(UpdateType11Choice obj) {
			return obj.getDeletion();
		}

		@Override
		public void setValue(UpdateType11Choice obj, SecuritiesSettlementTransactionDetails16 value) {
			obj.setDeletion(value);
		}
	};
	@XmlElement(name = "Mod", required = true)
	protected SecuritiesSettlementTransactionDetails14 modification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails14
	 * SecuritiesSettlementTransactionDetails14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.UpdateType11Choice
	 * UpdateType11Choice}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UpdateType14Choice#mmModification
	 * UpdateType14Choice.mmModification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.UpdateType9Choice#mmModification
	 * UpdateType9Choice.mmModification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<UpdateType11Choice, SecuritiesSettlementTransactionDetails14> mmModification = new MMMessageAssociationEnd<UpdateType11Choice, SecuritiesSettlementTransactionDetails14>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.UpdateType11Choice.mmObject();
			isDerived = false;
			xmlTag = "Mod";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Modification";
			definition = "Modification of information in the securities transaction.";
			nextVersions_lazy = () -> Arrays.asList(UpdateType14Choice.mmModification);
			previousVersion_lazy = () -> UpdateType9Choice.mmModification;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SecuritiesSettlementTransactionDetails14.mmObject();
		}

		@Override
		public SecuritiesSettlementTransactionDetails14 getValue(UpdateType11Choice obj) {
			return obj.getModification();
		}

		@Override
		public void setValue(UpdateType11Choice obj, SecuritiesSettlementTransactionDetails14 value) {
			obj.setModification(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.UpdateType11Choice.mmAddition, com.tools20022.repository.choice.UpdateType11Choice.mmDeletion,
						com.tools20022.repository.choice.UpdateType11Choice.mmModification);
				messageBuildingBlock_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionModificationRequestV03.mmUpdateType);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "UpdateType11Choice";
				definition = "Specifies the type of update requested. That is addition, deletion or modification.";
				nextVersions_lazy = () -> Arrays.asList(UpdateType14Choice.mmObject());
				previousVersion_lazy = () -> UpdateType9Choice.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public SecuritiesSettlementTransactionDetails15 getAddition() {
		return addition;
	}

	public UpdateType11Choice setAddition(SecuritiesSettlementTransactionDetails15 addition) {
		this.addition = Objects.requireNonNull(addition);
		return this;
	}

	public SecuritiesSettlementTransactionDetails16 getDeletion() {
		return deletion;
	}

	public UpdateType11Choice setDeletion(SecuritiesSettlementTransactionDetails16 deletion) {
		this.deletion = Objects.requireNonNull(deletion);
		return this;
	}

	public SecuritiesSettlementTransactionDetails14 getModification() {
		return modification;
	}

	public UpdateType11Choice setModification(SecuritiesSettlementTransactionDetails14 modification) {
		this.modification = Objects.requireNonNull(modification);
		return this;
	}
}