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
import com.tools20022.repository.choice.ATMCommandParameters1Choice;
import com.tools20022.repository.codeset.ATMCommand1Code;
import com.tools20022.repository.codeset.TMSContactLevel2Code;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.entity.TerminalManagementSystem;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Maintenance command to perform on an ATM.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ATMCommand1#mmType
 * ATMCommand1.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMCommand1#mmUrgency
 * ATMCommand1.mmUrgency}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMCommand1#mmDateTime
 * ATMCommand1.mmDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMCommand1#mmCommandIdentification
 * ATMCommand1.mmCommandIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMCommand1#mmCommandParameters
 * ATMCommand1.mmCommandParameters}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.TerminalManagementSystem
 * TerminalManagementSystem}</li>
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
 * "ATMCommand1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Maintenance command to perform on an ATM."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ATMCommand2 ATMCommand2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMCommand4 ATMCommand4}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "ATMCommand1", propOrder = {"type", "urgency", "dateTime", "commandIdentification", "commandParameters"})
public class ATMCommand1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected ATMCommand1Code type;
	/**
	 * Type of command to be performed by the ATM.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ATMCommand1Code
	 * ATMCommand1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMCommand1 ATMCommand1}</li>
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
	 * definition} = "Type of command to be performed by the ATM."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.ATMCommand2#mmType
	 * ATMCommand2.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ATMCommand4#mmType
	 * ATMCommand4.mmType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMCommand1.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Type of command to be performed by the ATM.";
			nextVersions_lazy = () -> Arrays.asList(ATMCommand2.mmType, ATMCommand4.mmType);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ATMCommand1Code.mmObject();
		}
	};
	protected TMSContactLevel2Code urgency;
	/**
	 * Urgency of the command.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TMSContactLevel2Code
	 * TMSContactLevel2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TerminalManagementSystem#mmContactLevel
	 * TerminalManagementSystem.mmContactLevel}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMCommand1 ATMCommand1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Urgcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Urgency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Urgency of the command."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.ATMCommand4#mmUrgency
	 * ATMCommand4.mmUrgency}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmUrgency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> TerminalManagementSystem.mmContactLevel;
			componentContext_lazy = () -> ATMCommand1.mmObject();
			isDerived = false;
			xmlTag = "Urgcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Urgency";
			definition = "Urgency of the command.";
			nextVersions_lazy = () -> Arrays.asList(ATMCommand4.mmUrgency);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TMSContactLevel2Code.mmObject();
		}
	};
	protected ISODateTime dateTime;
	/**
	 * Date time on which the command must be performed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMCommand1 ATMCommand1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DtTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date time on which the command must be performed."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMCommand2#mmRequiredDateTime
	 * ATMCommand2.mmRequiredDateTime}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ATMCommand4#mmDateTime
	 * ATMCommand4.mmDateTime}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDateTime = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMCommand1.mmObject();
			isDerived = false;
			xmlTag = "DtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DateTime";
			definition = "Date time on which the command must be performed.";
			nextVersions_lazy = () -> Arrays.asList(ATMCommand2.mmRequiredDateTime, ATMCommand4.mmDateTime);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected ATMCommandIdentification1 commandIdentification;
	/**
	 * Identification of the entity issuing the command.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ATMCommandIdentification1
	 * ATMCommandIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMCommand1 ATMCommand1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CmdId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommandIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the entity issuing the command."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMCommand2#mmCommandIdentification
	 * ATMCommand2.mmCommandIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMCommand4#mmCommandIdentification
	 * ATMCommand4.mmCommandIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCommandIdentification = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ATMCommand1.mmObject();
			isDerived = false;
			xmlTag = "CmdId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommandIdentification";
			definition = "Identification of the entity issuing the command.";
			nextVersions_lazy = () -> Arrays.asList(ATMCommand2.mmCommandIdentification, ATMCommand4.mmCommandIdentification);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ATMCommandIdentification1.mmObject();
		}
	};
	protected ATMCommandParameters1Choice commandParameters;
	/**
	 * Specific parameters attached to the command.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.ATMCommandParameters1Choice
	 * ATMCommandParameters1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMCommand1 ATMCommand1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CmdParams"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommandParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specific parameters attached to the command."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMCommand4#mmCommandParameters
	 * ATMCommand4.mmCommandParameters}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCommandParameters = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ATMCommand1.mmObject();
			isDerived = false;
			xmlTag = "CmdParams";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommandParameters";
			definition = "Specific parameters attached to the command.";
			nextVersions_lazy = () -> Arrays.asList(ATMCommand4.mmCommandParameters);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ATMCommandParameters1Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(ATMCommand1.mmType, ATMCommand1.mmUrgency, ATMCommand1.mmDateTime, ATMCommand1.mmCommandIdentification, ATMCommand1.mmCommandParameters);
				trace_lazy = () -> TerminalManagementSystem.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMCommand1";
				definition = "Maintenance command to perform on an ATM.";
				nextVersions_lazy = () -> Arrays.asList(ATMCommand2.mmObject(), ATMCommand4.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Tp", required = true)
	public ATMCommand1Code getType() {
		return type;
	}

	public void setType(ATMCommand1Code type) {
		this.type = type;
	}

	@XmlElement(name = "Urgcy", required = true)
	public TMSContactLevel2Code getUrgency() {
		return urgency;
	}

	public void setUrgency(TMSContactLevel2Code urgency) {
		this.urgency = urgency;
	}

	@XmlElement(name = "DtTm")
	public ISODateTime getDateTime() {
		return dateTime;
	}

	public void setDateTime(ISODateTime dateTime) {
		this.dateTime = dateTime;
	}

	@XmlElement(name = "CmdId")
	public ATMCommandIdentification1 getCommandIdentification() {
		return commandIdentification;
	}

	public void setCommandIdentification(com.tools20022.repository.msg.ATMCommandIdentification1 commandIdentification) {
		this.commandIdentification = commandIdentification;
	}

	@XmlElement(name = "CmdParams")
	public ATMCommandParameters1Choice getCommandParameters() {
		return commandParameters;
	}

	public void setCommandParameters(ATMCommandParameters1Choice commandParameters) {
		this.commandParameters = commandParameters;
	}
}