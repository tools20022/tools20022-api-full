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
import com.tools20022.repository.area.caam.ATMDiagnosticResponseV01;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information related to the response of a diagnostic from an ATM manager.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMDiagnosticResponse1#mmEnvironment
 * ATMDiagnosticResponse1.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMDiagnosticResponse1#mmCommand
 * ATMDiagnosticResponse1.mmCommand}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.ATMDiagnosticResponseV01#mmATMDiagnosticResponse
 * ATMDiagnosticResponseV01.mmATMDiagnosticResponse}</li>
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
 * "ATMDiagnosticResponse1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Information related to the response of a diagnostic from an ATM manager."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "ATMDiagnosticResponse1", propOrder = {"environment", "command"})
public class ATMDiagnosticResponse1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected ATMEnvironment6 environment;
	/**
	 * Environment of the ATM.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ATMEnvironment6
	 * ATMEnvironment6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMDiagnosticResponse1
	 * ATMDiagnosticResponse1}</li>
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
	 * definition} = "Environment of the ATM."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmEnvironment = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ATMDiagnosticResponse1.mmObject();
			isDerived = false;
			xmlTag = "Envt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Environment";
			definition = "Environment of the ATM.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ATMEnvironment6.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.ATMCommand1> command;
	/**
	 * Maintenance command to perform on the ATM.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ATMCommand1
	 * ATMCommand1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMDiagnosticResponse1
	 * ATMDiagnosticResponse1}</li>
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
	 * definition} = "Maintenance command to perform on the ATM."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCommand = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ATMDiagnosticResponse1.mmObject();
			isDerived = false;
			xmlTag = "Cmd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Command";
			definition = "Maintenance command to perform on the ATM.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ATMCommand1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(ATMDiagnosticResponse1.mmEnvironment, ATMDiagnosticResponse1.mmCommand);
				messageBuildingBlock_lazy = () -> Arrays.asList(ATMDiagnosticResponseV01.mmATMDiagnosticResponse);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMDiagnosticResponse1";
				definition = "Information related to the response of a diagnostic from an ATM manager.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Envt", required = true)
	public ATMEnvironment6 getEnvironment() {
		return environment;
	}

	public void setEnvironment(com.tools20022.repository.msg.ATMEnvironment6 environment) {
		this.environment = environment;
	}

	@XmlElement(name = "Cmd")
	public List<ATMCommand1> getCommand() {
		return command;
	}

	public void setCommand(List<com.tools20022.repository.msg.ATMCommand1> command) {
		this.command = command;
	}
}