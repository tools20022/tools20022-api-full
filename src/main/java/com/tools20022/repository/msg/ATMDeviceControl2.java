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
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.caam.ATMDeviceControlV03;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ATMCommand10;
import com.tools20022.repository.msg.ATMEnvironment7;
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
 * Information related to the control of an ATM device.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMDeviceControl2#mmEnvironment
 * ATMDeviceControl2.mmEnvironment}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMDeviceControl2#mmCommand
 * ATMDeviceControl2.mmCommand}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.ATMDeviceControlV03#mmATMDeviceControl
 * ATMDeviceControlV03.mmATMDeviceControl}</li>
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
 * "ATMDeviceControl2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information related to the control of an ATM device."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.ATMDeviceControl1
 * ATMDeviceControl1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ATMDeviceControl2", propOrder = {"environment", "command"})
public class ATMDeviceControl2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Envt", required = true)
	protected ATMEnvironment7 environment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ATMEnvironment7
	 * ATMEnvironment7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMDeviceControl2
	 * ATMDeviceControl2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Envt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Environment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Environment of the transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMDeviceControl1#mmEnvironment
	 * ATMDeviceControl1.mmEnvironment}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMDeviceControl2, ATMEnvironment7> mmEnvironment = new MMMessageAssociationEnd<ATMDeviceControl2, ATMEnvironment7>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMDeviceControl2.mmObject();
			isDerived = false;
			xmlTag = "Envt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Environment";
			definition = "Environment of the transaction.";
			previousVersion_lazy = () -> ATMDeviceControl1.mmEnvironment;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ATMEnvironment7.mmObject();
		}

		@Override
		public ATMEnvironment7 getValue(ATMDeviceControl2 obj) {
			return obj.getEnvironment();
		}

		@Override
		public void setValue(ATMDeviceControl2 obj, ATMEnvironment7 value) {
			obj.setEnvironment(value);
		}
	};
	@XmlElement(name = "Cmd")
	protected List<ATMCommand10> command;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ATMCommand10
	 * ATMCommand10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMDeviceControl2
	 * ATMDeviceControl2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cmd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Command"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Maintenance command the ATM must perform."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMDeviceControl1#mmCommand
	 * ATMDeviceControl1.mmCommand}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMDeviceControl2, List<ATMCommand10>> mmCommand = new MMMessageAssociationEnd<ATMDeviceControl2, List<ATMCommand10>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMDeviceControl2.mmObject();
			isDerived = false;
			xmlTag = "Cmd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Command";
			definition = "Maintenance command the ATM must perform.";
			previousVersion_lazy = () -> ATMDeviceControl1.mmCommand;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ATMCommand10.mmObject();
		}

		@Override
		public List<ATMCommand10> getValue(ATMDeviceControl2 obj) {
			return obj.getCommand();
		}

		@Override
		public void setValue(ATMDeviceControl2 obj, List<ATMCommand10> value) {
			obj.setCommand(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMDeviceControl2.mmEnvironment, com.tools20022.repository.msg.ATMDeviceControl2.mmCommand);
				messageBuildingBlock_lazy = () -> Arrays.asList(ATMDeviceControlV03.mmATMDeviceControl);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "ATMDeviceControl2";
				definition = "Information related to the control of an ATM device.";
				previousVersion_lazy = () -> ATMDeviceControl1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public ATMEnvironment7 getEnvironment() {
		return environment;
	}

	public ATMDeviceControl2 setEnvironment(ATMEnvironment7 environment) {
		this.environment = Objects.requireNonNull(environment);
		return this;
	}

	public List<ATMCommand10> getCommand() {
		return command == null ? command = new ArrayList<>() : command;
	}

	public ATMDeviceControl2 setCommand(List<ATMCommand10> command) {
		this.command = Objects.requireNonNull(command);
		return this;
	}
}