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
import com.tools20022.repository.datatype.Max256Text;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max8Text;
import com.tools20022.repository.datatype.PhoneNumber;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides additional information regarding the existing agent component.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationSD2#mmPlaceAndName
 * PartyIdentificationSD2.mmPlaceAndName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationSD2#mmAgentIdentification
 * PartyIdentificationSD2.mmAgentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationSD2#mmAgentTelephoneNumber
 * PartyIdentificationSD2.mmAgentTelephoneNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationSD2#mmContactInformation
 * PartyIdentificationSD2.mmContactInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationSD2#mmAgentEmailAddress
 * PartyIdentificationSD2.mmAgentEmailAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationSD2#mmAgentAddress
 * PartyIdentificationSD2.mmAgentAddress}</li>
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
 * "PartyIdentificationSD2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides additional information regarding the existing agent component."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "PartyIdentificationSD2", propOrder = {"placeAndName", "agentIdentification", "agentTelephoneNumber", "contactInformation", "agentEmailAddress", "agentAddress"})
public class PartyIdentificationSD2 {

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
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationSD2
	 * PartyIdentificationSD2}</li>
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
			componentContext_lazy = () -> PartyIdentificationSD2.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationSD2
	 * PartyIdentificationSD2}</li>
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
			componentContext_lazy = () -> PartyIdentificationSD2.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationSD2
	 * PartyIdentificationSD2}</li>
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
			componentContext_lazy = () -> PartyIdentificationSD2.mmObject();
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
	protected PartyIdentificationSD4 contactInformation;
	/**
	 * Agent designated contact information details.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentificationSD4
	 * PartyIdentificationSD4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationSD2
	 * PartyIdentificationSD2}</li>
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
	 * definition} = "Agent designated contact information details. "</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmContactInformation = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> PartyIdentificationSD2.mmObject();
			isDerived = false;
			xmlTag = "CtctInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContactInformation";
			definition = "Agent designated contact information details. ";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentificationSD4.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationSD2
	 * PartyIdentificationSD2}</li>
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
			componentContext_lazy = () -> PartyIdentificationSD2.mmObject();
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
	protected PostalAddress1 agentAddress;
	/**
	 * Event agent address.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.PostalAddress1
	 * PostalAddress1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationSD2
	 * PartyIdentificationSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AgtAdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgentAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Event agent address."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAgentAddress = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PartyIdentificationSD2.mmObject();
			isDerived = false;
			xmlTag = "AgtAdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgentAddress";
			definition = "Event agent address.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.PostalAddress1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(PartyIdentificationSD2.mmPlaceAndName, PartyIdentificationSD2.mmAgentIdentification, PartyIdentificationSD2.mmAgentTelephoneNumber, PartyIdentificationSD2.mmContactInformation,
						PartyIdentificationSD2.mmAgentEmailAddress, PartyIdentificationSD2.mmAgentAddress);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PartyIdentificationSD2";
				definition = "Provides additional information regarding the existing agent component.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "PlcAndNm", required = true)
	public Max350Text getPlaceAndName() {
		return placeAndName;
	}

	public void setPlaceAndName(Max350Text placeAndName) {
		this.placeAndName = placeAndName;
	}

	@XmlElement(name = "AgtId")
	public Max8Text getAgentIdentification() {
		return agentIdentification;
	}

	public void setAgentIdentification(Max8Text agentIdentification) {
		this.agentIdentification = agentIdentification;
	}

	@XmlElement(name = "AgtTelNb")
	public PhoneNumber getAgentTelephoneNumber() {
		return agentTelephoneNumber;
	}

	public void setAgentTelephoneNumber(PhoneNumber agentTelephoneNumber) {
		this.agentTelephoneNumber = agentTelephoneNumber;
	}

	@XmlElement(name = "CtctInf")
	public PartyIdentificationSD4 getContactInformation() {
		return contactInformation;
	}

	public void setContactInformation(com.tools20022.repository.msg.PartyIdentificationSD4 contactInformation) {
		this.contactInformation = contactInformation;
	}

	@XmlElement(name = "AgtEmailAdr")
	public Max256Text getAgentEmailAddress() {
		return agentEmailAddress;
	}

	public void setAgentEmailAddress(Max256Text agentEmailAddress) {
		this.agentEmailAddress = agentEmailAddress;
	}

	@XmlElement(name = "AgtAdr")
	public PostalAddress1 getAgentAddress() {
		return agentAddress;
	}

	public void setAgentAddress(com.tools20022.repository.msg.PostalAddress1 agentAddress) {
		this.agentAddress = agentAddress;
	}
}