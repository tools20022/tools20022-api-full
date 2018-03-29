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
import com.tools20022.repository.choice.UpdateType24Choice;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.SecurityAttributes5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice between action to request on a security.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.UpdateType23Choice#mmUpdateType
 * UpdateType23Choice.mmUpdateType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.UpdateType23Choice#mmReplace
 * UpdateType23Choice.mmReplace}</li>
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
 * "UpdateType23Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice between action to request on a security."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.choice.UpdateType8Choice
 * UpdateType8Choice}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "UpdateType23Choice", propOrder = {"updateType", "replace"})
public class UpdateType23Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "UpdTp", required = true)
	protected List<UpdateType24Choice> updateType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.UpdateType24Choice
	 * UpdateType24Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.UpdateType23Choice
	 * UpdateType23Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UpdTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UpdateType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Request to add, modify or delete data's of a security."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.UpdateType8Choice#mmUpdateType
	 * UpdateType8Choice.mmUpdateType}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<UpdateType23Choice, List<UpdateType24Choice>> mmUpdateType = new MMMessageAssociationEnd<UpdateType23Choice, List<UpdateType24Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.UpdateType23Choice.mmObject();
			isDerived = false;
			xmlTag = "UpdTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UpdateType";
			definition = "Request to add, modify or delete data's of a security.";
			previousVersion_lazy = () -> UpdateType8Choice.mmUpdateType;
			maxOccurs = 3;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> UpdateType24Choice.mmObject();
		}

		@Override
		public List<UpdateType24Choice> getValue(UpdateType23Choice obj) {
			return obj.getUpdateType();
		}

		@Override
		public void setValue(UpdateType23Choice obj, List<UpdateType24Choice> value) {
			obj.setUpdateType(value);
		}
	};
	@XmlElement(name = "Rplc", required = true)
	protected SecurityAttributes5 replace;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SecurityAttributes5
	 * SecurityAttributes5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.UpdateType23Choice
	 * UpdateType23Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rplc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Replace"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Request to replace all present data of a security."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.UpdateType8Choice#mmReplace
	 * UpdateType8Choice.mmReplace}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<UpdateType23Choice, SecurityAttributes5> mmReplace = new MMMessageAssociationEnd<UpdateType23Choice, SecurityAttributes5>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.UpdateType23Choice.mmObject();
			isDerived = false;
			xmlTag = "Rplc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Replace";
			definition = "Request to replace all present data of a security.";
			previousVersion_lazy = () -> UpdateType8Choice.mmReplace;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SecurityAttributes5.mmObject();
		}

		@Override
		public SecurityAttributes5 getValue(UpdateType23Choice obj) {
			return obj.getReplace();
		}

		@Override
		public void setValue(UpdateType23Choice obj, SecurityAttributes5 value) {
			obj.setReplace(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.UpdateType23Choice.mmUpdateType, com.tools20022.repository.choice.UpdateType23Choice.mmReplace);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "UpdateType23Choice";
				definition = "Choice between action to request on a security.";
				previousVersion_lazy = () -> UpdateType8Choice.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public List<UpdateType24Choice> getUpdateType() {
		return updateType == null ? updateType = new ArrayList<>() : updateType;
	}

	public UpdateType23Choice setUpdateType(List<UpdateType24Choice> updateType) {
		this.updateType = Objects.requireNonNull(updateType);
		return this;
	}

	public SecurityAttributes5 getReplace() {
		return replace;
	}

	public UpdateType23Choice setReplace(SecurityAttributes5 replace) {
		this.replace = Objects.requireNonNull(replace);
		return this;
	}
}