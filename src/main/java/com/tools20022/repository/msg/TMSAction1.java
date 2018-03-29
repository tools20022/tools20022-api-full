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
import com.tools20022.repository.codeset.TerminalManagementAction1Code;
import com.tools20022.repository.codeset.TerminalManagementActionTrigger1Code;
import com.tools20022.repository.codeset.TerminalManagementAdditionalProcess1Code;
import com.tools20022.repository.entity.TerminalManagementAction;
import com.tools20022.repository.entity.TerminalManagementSystem;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.DataSetIdentification2;
import com.tools20022.repository.msg.ErrorAction1;
import com.tools20022.repository.msg.NetworkParameters1;
import com.tools20022.repository.msg.ProcessTiming1;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Single terminal management action to be performed by the point of
 * interaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TMSAction1#mmType
 * TMSAction1.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TMSAction1#mmAddress
 * TMSAction1.mmAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TMSAction1#mmDataSetIdentification
 * TMSAction1.mmDataSetIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TMSAction1#mmTrigger
 * TMSAction1.mmTrigger}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TMSAction1#mmAdditionalProcess
 * TMSAction1.mmAdditionalProcess}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TMSAction1#mmTimeCondition
 * TMSAction1.mmTimeCondition}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TMSAction1#mmErrorAction
 * TMSAction1.mmErrorAction}</li>
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
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TMSAction1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Single terminal management action to be performed by the point of interaction."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TMSAction2 TMSAction2}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TMSAction1", propOrder = {"type", "address", "dataSetIdentification", "trigger", "additionalProcess", "timeCondition", "errorAction"})
public class TMSAction1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Tp", required = true)
	protected TerminalManagementAction1Code type;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAction1Code
	 * TerminalManagementAction1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TerminalManagementAction#mmType
	 * TerminalManagementAction.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TMSAction1
	 * TMSAction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Types of action to be performed by a point of interaction (POI)."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TMSAction1, TerminalManagementAction1Code> mmType = new MMMessageAttribute<TMSAction1, TerminalManagementAction1Code>() {
		{
			businessElementTrace_lazy = () -> TerminalManagementAction.mmType;
			componentContext_lazy = () -> com.tools20022.repository.msg.TMSAction1.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Types of action to be performed by a point of interaction (POI).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TerminalManagementAction1Code.mmObject();
		}

		@Override
		public TerminalManagementAction1Code getValue(TMSAction1 obj) {
			return obj.getType();
		}

		@Override
		public void setValue(TMSAction1 obj, TerminalManagementAction1Code value) {
			obj.setType(value);
		}
	};
	@XmlElement(name = "Adr")
	protected NetworkParameters1 address;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.NetworkParameters1
	 * NetworkParameters1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TerminalManagementSystem#mmNetworkAccess
	 * TerminalManagementSystem.mmNetworkAccess}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TMSAction1
	 * TMSAction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Adr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Address"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Communication parameters of the terminal management system to contact."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TMSAction1, Optional<NetworkParameters1>> mmAddress = new MMMessageAssociationEnd<TMSAction1, Optional<NetworkParameters1>>() {
		{
			businessElementTrace_lazy = () -> TerminalManagementSystem.mmNetworkAccess;
			componentContext_lazy = () -> com.tools20022.repository.msg.TMSAction1.mmObject();
			isDerived = false;
			xmlTag = "Adr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Address";
			definition = "Communication parameters of the terminal management system to contact.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> NetworkParameters1.mmObject();
		}

		@Override
		public Optional<NetworkParameters1> getValue(TMSAction1 obj) {
			return obj.getAddress();
		}

		@Override
		public void setValue(TMSAction1 obj, Optional<NetworkParameters1> value) {
			obj.setAddress(value.orElse(null));
		}
	};
	@XmlElement(name = "DataSetId")
	protected DataSetIdentification2 dataSetIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.DataSetIdentification2
	 * DataSetIdentification2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TMSAction1
	 * TMSAction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DataSetId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DataSetIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Data set on which the action has to be performed."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TMSAction1, Optional<DataSetIdentification2>> mmDataSetIdentification = new MMMessageAssociationEnd<TMSAction1, Optional<DataSetIdentification2>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TMSAction1.mmObject();
			isDerived = false;
			xmlTag = "DataSetId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DataSetIdentification";
			definition = "Data set on which the action has to be performed.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DataSetIdentification2.mmObject();
		}

		@Override
		public Optional<DataSetIdentification2> getValue(TMSAction1 obj) {
			return obj.getDataSetIdentification();
		}

		@Override
		public void setValue(TMSAction1 obj, Optional<DataSetIdentification2> value) {
			obj.setDataSetIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "Trggr", required = true)
	protected TerminalManagementActionTrigger1Code trigger;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionTrigger1Code
	 * TerminalManagementActionTrigger1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TerminalManagementAction#mmTrigger
	 * TerminalManagementAction.mmTrigger}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TMSAction1
	 * TMSAction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Trggr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Trigger"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Event on which the action has to be activated by the point of interaction (POI)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TMSAction1, TerminalManagementActionTrigger1Code> mmTrigger = new MMMessageAttribute<TMSAction1, TerminalManagementActionTrigger1Code>() {
		{
			businessElementTrace_lazy = () -> TerminalManagementAction.mmTrigger;
			componentContext_lazy = () -> com.tools20022.repository.msg.TMSAction1.mmObject();
			isDerived = false;
			xmlTag = "Trggr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Trigger";
			definition = "Event on which the action has to be activated by the point of interaction (POI).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TerminalManagementActionTrigger1Code.mmObject();
		}

		@Override
		public TerminalManagementActionTrigger1Code getValue(TMSAction1 obj) {
			return obj.getTrigger();
		}

		@Override
		public void setValue(TMSAction1 obj, TerminalManagementActionTrigger1Code value) {
			obj.setTrigger(value);
		}
	};
	@XmlElement(name = "AddtlPrc")
	protected TerminalManagementAdditionalProcess1Code additionalProcess;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAdditionalProcess1Code
	 * TerminalManagementAdditionalProcess1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TerminalManagementAction#mmAdditionalProcess
	 * TerminalManagementAction.mmAdditionalProcess}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TMSAction1
	 * TMSAction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlPrc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalProcess"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional process to perform before starting or after completing the action by the point of interaction (POI)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TMSAction1, Optional<TerminalManagementAdditionalProcess1Code>> mmAdditionalProcess = new MMMessageAttribute<TMSAction1, Optional<TerminalManagementAdditionalProcess1Code>>() {
		{
			businessElementTrace_lazy = () -> TerminalManagementAction.mmAdditionalProcess;
			componentContext_lazy = () -> com.tools20022.repository.msg.TMSAction1.mmObject();
			isDerived = false;
			xmlTag = "AddtlPrc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalProcess";
			definition = "Additional process to perform before starting or after completing the action by the point of interaction (POI).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TerminalManagementAdditionalProcess1Code.mmObject();
		}

		@Override
		public Optional<TerminalManagementAdditionalProcess1Code> getValue(TMSAction1 obj) {
			return obj.getAdditionalProcess();
		}

		@Override
		public void setValue(TMSAction1 obj, Optional<TerminalManagementAdditionalProcess1Code> value) {
			obj.setAdditionalProcess(value.orElse(null));
		}
	};
	@XmlElement(name = "TmCond")
	protected ProcessTiming1 timeCondition;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ProcessTiming1
	 * ProcessTiming1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TMSAction1
	 * TMSAction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TmCond"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TimeCondition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date and time the action has to be performed."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TMSAction1, Optional<ProcessTiming1>> mmTimeCondition = new MMMessageAssociationEnd<TMSAction1, Optional<ProcessTiming1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TMSAction1.mmObject();
			isDerived = false;
			xmlTag = "TmCond";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TimeCondition";
			definition = "Date and time the action has to be performed.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ProcessTiming1.mmObject();
		}

		@Override
		public Optional<ProcessTiming1> getValue(TMSAction1 obj) {
			return obj.getTimeCondition();
		}

		@Override
		public void setValue(TMSAction1 obj, Optional<ProcessTiming1> value) {
			obj.setTimeCondition(value.orElse(null));
		}
	};
	@XmlElement(name = "ErrActn")
	protected List<ErrorAction1> errorAction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ErrorAction1
	 * ErrorAction1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.TerminalManagementAction
	 * TerminalManagementAction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TMSAction1
	 * TMSAction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ErrActn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ErrorAction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Action to perform in case of error on the related action in progress."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TMSAction1, List<ErrorAction1>> mmErrorAction = new MMMessageAssociationEnd<TMSAction1, List<ErrorAction1>>() {
		{
			businessComponentTrace_lazy = () -> TerminalManagementAction.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.TMSAction1.mmObject();
			isDerived = false;
			xmlTag = "ErrActn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ErrorAction";
			definition = "Action to perform in case of error on the related action in progress.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ErrorAction1.mmObject();
		}

		@Override
		public List<ErrorAction1> getValue(TMSAction1 obj) {
			return obj.getErrorAction();
		}

		@Override
		public void setValue(TMSAction1 obj, List<ErrorAction1> value) {
			obj.setErrorAction(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TMSAction1.mmType, com.tools20022.repository.msg.TMSAction1.mmAddress, com.tools20022.repository.msg.TMSAction1.mmDataSetIdentification,
						com.tools20022.repository.msg.TMSAction1.mmTrigger, com.tools20022.repository.msg.TMSAction1.mmAdditionalProcess, com.tools20022.repository.msg.TMSAction1.mmTimeCondition,
						com.tools20022.repository.msg.TMSAction1.mmErrorAction);
				trace_lazy = () -> TerminalManagementAction.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TMSAction1";
				definition = "Single terminal management action to be performed by the point of interaction.";
				nextVersions_lazy = () -> Arrays.asList(TMSAction2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public TerminalManagementAction1Code getType() {
		return type;
	}

	public TMSAction1 setType(TerminalManagementAction1Code type) {
		this.type = Objects.requireNonNull(type);
		return this;
	}

	public Optional<NetworkParameters1> getAddress() {
		return address == null ? Optional.empty() : Optional.of(address);
	}

	public TMSAction1 setAddress(NetworkParameters1 address) {
		this.address = address;
		return this;
	}

	public Optional<DataSetIdentification2> getDataSetIdentification() {
		return dataSetIdentification == null ? Optional.empty() : Optional.of(dataSetIdentification);
	}

	public TMSAction1 setDataSetIdentification(DataSetIdentification2 dataSetIdentification) {
		this.dataSetIdentification = dataSetIdentification;
		return this;
	}

	public TerminalManagementActionTrigger1Code getTrigger() {
		return trigger;
	}

	public TMSAction1 setTrigger(TerminalManagementActionTrigger1Code trigger) {
		this.trigger = Objects.requireNonNull(trigger);
		return this;
	}

	public Optional<TerminalManagementAdditionalProcess1Code> getAdditionalProcess() {
		return additionalProcess == null ? Optional.empty() : Optional.of(additionalProcess);
	}

	public TMSAction1 setAdditionalProcess(TerminalManagementAdditionalProcess1Code additionalProcess) {
		this.additionalProcess = additionalProcess;
		return this;
	}

	public Optional<ProcessTiming1> getTimeCondition() {
		return timeCondition == null ? Optional.empty() : Optional.of(timeCondition);
	}

	public TMSAction1 setTimeCondition(ProcessTiming1 timeCondition) {
		this.timeCondition = timeCondition;
		return this;
	}

	public List<ErrorAction1> getErrorAction() {
		return errorAction == null ? errorAction = new ArrayList<>() : errorAction;
	}

	public TMSAction1 setErrorAction(List<ErrorAction1> errorAction) {
		this.errorAction = Objects.requireNonNull(errorAction);
		return this;
	}
}