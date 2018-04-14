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
import com.tools20022.repository.codeset.TerminalManagementAction2Code;
import com.tools20022.repository.entity.TerminalManagementAction;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.DataSetIdentification6;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Result of an individual terminal management action by the point of
 * interaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TMSActionIdentification4#mmActionType
 * TMSActionIdentification4.mmActionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TMSActionIdentification4#mmDataSetIdentification
 * TMSActionIdentification4.mmDataSetIdentification}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.TerminalManagementAction
 * TerminalManagementAction}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TMSActionIdentification4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Result of an individual terminal management action by the point of interaction."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TMSActionIdentification5
 * TMSActionIdentification5}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.TMSActionIdentification3
 * TMSActionIdentification3}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TMSActionIdentification4", propOrder = {"actionType", "dataSetIdentification"})
public class TMSActionIdentification4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "ActnTp", required = true)
	protected TerminalManagementAction2Code actionType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAction2Code
	 * TerminalManagementAction2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TerminalManagementAction#mmType
	 * TerminalManagementAction.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TMSActionIdentification4
	 * TMSActionIdentification4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ActnTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ActionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Types of terminal management action performed by a point of interaction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TMSActionIdentification5#mmActionType
	 * TMSActionIdentification5.mmActionType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TMSActionIdentification3#mmActionType
	 * TMSActionIdentification3.mmActionType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TMSActionIdentification4, TerminalManagementAction2Code> mmActionType = new MMMessageAttribute<TMSActionIdentification4, TerminalManagementAction2Code>() {
		{
			businessElementTrace_lazy = () -> TerminalManagementAction.mmType;
			componentContext_lazy = () -> com.tools20022.repository.msg.TMSActionIdentification4.mmObject();
			isDerived = false;
			xmlTag = "ActnTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ActionType";
			definition = "Types of terminal management action performed by a point of interaction.";
			nextVersions_lazy = () -> Arrays.asList(TMSActionIdentification5.mmActionType);
			previousVersion_lazy = () -> TMSActionIdentification3.mmActionType;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TerminalManagementAction2Code.mmObject();
		}

		@Override
		public TerminalManagementAction2Code getValue(TMSActionIdentification4 obj) {
			return obj.getActionType();
		}

		@Override
		public void setValue(TMSActionIdentification4 obj, TerminalManagementAction2Code value) {
			obj.setActionType(value);
		}
	};
	@XmlElement(name = "DataSetId")
	protected DataSetIdentification6 dataSetIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.DataSetIdentification6
	 * DataSetIdentification6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TMSActionIdentification4
	 * TMSActionIdentification4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DataSetId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DataSetIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Data set on which the action has been performed."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TMSActionIdentification5#mmDataSetIdentification
	 * TMSActionIdentification5.mmDataSetIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TMSActionIdentification3#mmDataSetIdentification
	 * TMSActionIdentification3.mmDataSetIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TMSActionIdentification4, Optional<DataSetIdentification6>> mmDataSetIdentification = new MMMessageAssociationEnd<TMSActionIdentification4, Optional<DataSetIdentification6>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TMSActionIdentification4.mmObject();
			isDerived = false;
			xmlTag = "DataSetId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DataSetIdentification";
			definition = "Data set on which the action has been performed.";
			nextVersions_lazy = () -> Arrays.asList(TMSActionIdentification5.mmDataSetIdentification);
			previousVersion_lazy = () -> TMSActionIdentification3.mmDataSetIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DataSetIdentification6.mmObject();
		}

		@Override
		public Optional<DataSetIdentification6> getValue(TMSActionIdentification4 obj) {
			return obj.getDataSetIdentification();
		}

		@Override
		public void setValue(TMSActionIdentification4 obj, Optional<DataSetIdentification6> value) {
			obj.setDataSetIdentification(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TMSActionIdentification4.mmActionType, com.tools20022.repository.msg.TMSActionIdentification4.mmDataSetIdentification);
				trace_lazy = () -> TerminalManagementAction.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TMSActionIdentification4";
				definition = "Result of an individual terminal management action by the point of interaction.";
				nextVersions_lazy = () -> Arrays.asList(TMSActionIdentification5.mmObject());
				previousVersion_lazy = () -> TMSActionIdentification3.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public TerminalManagementAction2Code getActionType() {
		return actionType;
	}

	public TMSActionIdentification4 setActionType(TerminalManagementAction2Code actionType) {
		this.actionType = Objects.requireNonNull(actionType);
		return this;
	}

	public Optional<DataSetIdentification6> getDataSetIdentification() {
		return dataSetIdentification == null ? Optional.empty() : Optional.of(dataSetIdentification);
	}

	public TMSActionIdentification4 setDataSetIdentification(DataSetIdentification6 dataSetIdentification) {
		this.dataSetIdentification = dataSetIdentification;
		return this;
	}
}