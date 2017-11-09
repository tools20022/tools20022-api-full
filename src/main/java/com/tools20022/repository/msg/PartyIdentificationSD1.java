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
import com.tools20022.repository.codeset.AgentType1Code;
import com.tools20022.repository.datatype.Max256Text;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max8Text;
import com.tools20022.repository.datatype.PhoneNumber;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Provides additional information regarding the new agent component.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationSD1#mmPlaceAndName
 * PartyIdentificationSD1.mmPlaceAndName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationSD1#mmAgentType
 * PartyIdentificationSD1.mmAgentType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationSD1#mmAgentIdentification
 * PartyIdentificationSD1.mmAgentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationSD1#mmAgentNameAndAddress
 * PartyIdentificationSD1.mmAgentNameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationSD1#mmAgentTelephoneNumber
 * PartyIdentificationSD1.mmAgentTelephoneNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationSD1#mmAgentEmailAddress
 * PartyIdentificationSD1.mmAgentEmailAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationSD1#mmContactInformation
 * PartyIdentificationSD1.mmContactInformation}</li>
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
 * "PartyIdentificationSD1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides additional information regarding the new agent component. "</li>
 * </ul>
 */
public class PartyIdentificationSD1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max350Text placeAndName;
	/**
	 * xPath to the element that is being extended.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationSD1
	 * PartyIdentificationSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PlcAndNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceAndName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "xPath to the element that is being extended."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPlaceAndName = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PartyIdentificationSD1.mmObject();
			isDerived = false;
			xmlTag = "PlcAndNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceAndName";
			definition = "xPath to the element that is being extended.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	protected AgentType1Code agentType;
	/**
	 * Function the agent is performing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AgentType1Code
	 * AgentType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationSD1
	 * PartyIdentificationSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AgtTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgentType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Function the agent is performing."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAgentType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PartyIdentificationSD1.mmObject();
			isDerived = false;
			xmlTag = "AgtTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgentType";
			definition = "Function the agent is performing.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AgentType1Code.mmObject();
		}
	};
	protected Max8Text agentIdentification;
	/**
	 * DTC agent identification number.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max8Text
	 * Max8Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationSD1
	 * PartyIdentificationSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AgtId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgentIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "DTC agent identification number."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAgentIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PartyIdentificationSD1.mmObject();
			isDerived = false;
			xmlTag = "AgtId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgentIdentification";
			definition = "DTC agent identification number.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max8Text.mmObject();
		}
	};
	protected NameAndAddress5 agentNameAndAddress;
	/**
	 * Name and address of the agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.NameAndAddress5
	 * NameAndAddress5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationSD1
	 * PartyIdentificationSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AgtNmAndAdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgentNameAndAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name and address of the agent.  "</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAgentNameAndAddress = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PartyIdentificationSD1.mmObject();
			isDerived = false;
			xmlTag = "AgtNmAndAdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgentNameAndAddress";
			definition = "Name and address of the agent.  ";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> com.tools20022.repository.msg.NameAndAddress5.mmObject();
		}
	};
	protected PhoneNumber agentTelephoneNumber;
	/**
	 * Telephone number of the agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.PhoneNumber
	 * PhoneNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationSD1
	 * PartyIdentificationSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AgtTelNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgentTelephoneNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Telephone number of the agent."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAgentTelephoneNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PartyIdentificationSD1.mmObject();
			isDerived = false;
			xmlTag = "AgtTelNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgentTelephoneNumber";
			definition = "Telephone number of the agent.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PhoneNumber.mmObject();
		}
	};
	protected Max256Text agentEmailAddress;
	/**
	 * Email address of the event agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max256Text
	 * Max256Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationSD1
	 * PartyIdentificationSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AgtEmailAdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgentEmailAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Email address of the event agent."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAgentEmailAddress = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PartyIdentificationSD1.mmObject();
			isDerived = false;
			xmlTag = "AgtEmailAdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgentEmailAddress";
			definition = "Email address of the event agent.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max256Text.mmObject();
		}
	};
	protected PartyIdentificationSD4 contactInformation;
	/**
	 * Agent designated contact Information details.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentificationSD4
	 * PartyIdentificationSD4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationSD1
	 * PartyIdentificationSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtctInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContactInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Agent designated contact Information details. "</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmContactInformation = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> PartyIdentificationSD1.mmObject();
			isDerived = false;
			xmlTag = "CtctInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContactInformation";
			definition = "Agent designated contact Information details. ";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentificationSD4.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(PartyIdentificationSD1.mmPlaceAndName, PartyIdentificationSD1.mmAgentType, PartyIdentificationSD1.mmAgentIdentification, PartyIdentificationSD1.mmAgentNameAndAddress,
						PartyIdentificationSD1.mmAgentTelephoneNumber, PartyIdentificationSD1.mmAgentEmailAddress, PartyIdentificationSD1.mmContactInformation);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PartyIdentificationSD1";
				definition = "Provides additional information regarding the new agent component. ";
			}
		});
		return mmObject_lazy.get();
	}

	public Max350Text getPlaceAndName() {
		return placeAndName;
	}

	public void setPlaceAndName(Max350Text placeAndName) {
		this.placeAndName = placeAndName;
	}

	public AgentType1Code getAgentType() {
		return agentType;
	}

	public void setAgentType(AgentType1Code agentType) {
		this.agentType = agentType;
	}

	public Max8Text getAgentIdentification() {
		return agentIdentification;
	}

	public void setAgentIdentification(Max8Text agentIdentification) {
		this.agentIdentification = agentIdentification;
	}

	public NameAndAddress5 getAgentNameAndAddress() {
		return agentNameAndAddress;
	}

	public void setAgentNameAndAddress(com.tools20022.repository.msg.NameAndAddress5 agentNameAndAddress) {
		this.agentNameAndAddress = agentNameAndAddress;
	}

	public PhoneNumber getAgentTelephoneNumber() {
		return agentTelephoneNumber;
	}

	public void setAgentTelephoneNumber(PhoneNumber agentTelephoneNumber) {
		this.agentTelephoneNumber = agentTelephoneNumber;
	}

	public Max256Text getAgentEmailAddress() {
		return agentEmailAddress;
	}

	public void setAgentEmailAddress(Max256Text agentEmailAddress) {
		this.agentEmailAddress = agentEmailAddress;
	}

	public PartyIdentificationSD4 getContactInformation() {
		return contactInformation;
	}

	public void setContactInformation(com.tools20022.repository.msg.PartyIdentificationSD4 contactInformation) {
		this.contactInformation = contactInformation;
	}
}