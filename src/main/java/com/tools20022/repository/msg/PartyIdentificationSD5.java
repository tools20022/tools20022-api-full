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

import com.tools20022.metamodel.ext.DTCCSynonym;
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
import com.tools20022.repository.msg.NameAndAddress5;
import com.tools20022.repository.msg.PartyIdentificationSD4;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

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
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationSD5#mmPlaceAndName
 * PartyIdentificationSD5.mmPlaceAndName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationSD5#mmAgentType
 * PartyIdentificationSD5.mmAgentType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationSD5#mmAgentIdentification
 * PartyIdentificationSD5.mmAgentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationSD5#mmAgentNameAndAddress
 * PartyIdentificationSD5.mmAgentNameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationSD5#mmAgentTelephoneNumber
 * PartyIdentificationSD5.mmAgentTelephoneNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationSD5#mmAgentEmailAddress
 * PartyIdentificationSD5.mmAgentEmailAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationSD5#mmContactInformation
 * PartyIdentificationSD5.mmContactInformation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintOtherAgentRule#forPartyIdentificationSD5
 * ConstraintOtherAgentRule.forPartyIdentificationSD5}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PartyIdentificationSD5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides additional information regarding the new agent component."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationSD1
 * PartyIdentificationSD1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PartyIdentificationSD5", propOrder = {"placeAndName", "agentType", "agentIdentification", "agentNameAndAddress", "agentTelephoneNumber", "agentEmailAddress", "contactInformation"})
public class PartyIdentificationSD5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PlcAndNm")
	protected Max350Text placeAndName;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationSD5
	 * PartyIdentificationSD5}</li>
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
	 * definition} = "Xpath to the element that is being extended."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationSD1#mmPlaceAndName
	 * PartyIdentificationSD1.mmPlaceAndName}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PartyIdentificationSD5, Optional<Max350Text>> mmPlaceAndName = new MMMessageAttribute<PartyIdentificationSD5, Optional<Max350Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PartyIdentificationSD5.mmObject();
			isDerived = false;
			xmlTag = "PlcAndNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceAndName";
			definition = "Xpath to the element that is being extended.";
			previousVersion_lazy = () -> PartyIdentificationSD1.mmPlaceAndName;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Optional<Max350Text> getValue(PartyIdentificationSD5 obj) {
			return obj.getPlaceAndName();
		}

		@Override
		public void setValue(PartyIdentificationSD5 obj, Optional<Max350Text> value) {
			obj.setPlaceAndName(value.orElse(null));
		}
	};
	@XmlElement(name = "AgtTp", required = true)
	protected AgentType1Code agentType;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationSD5
	 * PartyIdentificationSD5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AgtTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Agent Type</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgentType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Function the agent is performing."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationSD1#mmAgentType
	 * PartyIdentificationSD1.mmAgentType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PartyIdentificationSD5, AgentType1Code> mmAgentType = new MMMessageAttribute<PartyIdentificationSD5, AgentType1Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PartyIdentificationSD5.mmObject();
			isDerived = false;
			xmlTag = "AgtTp";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Agent Type"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgentType";
			definition = "Function the agent is performing.";
			previousVersion_lazy = () -> PartyIdentificationSD1.mmAgentType;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AgentType1Code.mmObject();
		}

		@Override
		public AgentType1Code getValue(PartyIdentificationSD5 obj) {
			return obj.getAgentType();
		}

		@Override
		public void setValue(PartyIdentificationSD5 obj, AgentType1Code value) {
			obj.setAgentType(value);
		}
	};
	@XmlElement(name = "AgtId")
	protected Max8Text agentIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max8Text
	 * Max8Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationSD5
	 * PartyIdentificationSD5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AgtId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Agent ID</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgentIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "DTC agent identification number."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationSD1#mmAgentIdentification
	 * PartyIdentificationSD1.mmAgentIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PartyIdentificationSD5, Optional<Max8Text>> mmAgentIdentification = new MMMessageAttribute<PartyIdentificationSD5, Optional<Max8Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PartyIdentificationSD5.mmObject();
			isDerived = false;
			xmlTag = "AgtId";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Agent ID"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgentIdentification";
			definition = "DTC agent identification number.";
			previousVersion_lazy = () -> PartyIdentificationSD1.mmAgentIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max8Text.mmObject();
		}

		@Override
		public Optional<Max8Text> getValue(PartyIdentificationSD5 obj) {
			return obj.getAgentIdentification();
		}

		@Override
		public void setValue(PartyIdentificationSD5 obj, Optional<Max8Text> value) {
			obj.setAgentIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "AgtNmAndAdr", required = true)
	protected NameAndAddress5 agentNameAndAddress;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.NameAndAddress5
	 * NameAndAddress5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationSD5
	 * PartyIdentificationSD5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AgtNmAndAdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Agent Address</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgentNameAndAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name and address of the agent."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationSD1#mmAgentNameAndAddress
	 * PartyIdentificationSD1.mmAgentNameAndAddress}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PartyIdentificationSD5, NameAndAddress5> mmAgentNameAndAddress = new MMMessageAttribute<PartyIdentificationSD5, NameAndAddress5>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PartyIdentificationSD5.mmObject();
			isDerived = false;
			xmlTag = "AgtNmAndAdr";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Agent Address"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgentNameAndAddress";
			definition = "Name and address of the agent.";
			previousVersion_lazy = () -> PartyIdentificationSD1.mmAgentNameAndAddress;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> NameAndAddress5.mmObject();
		}

		@Override
		public NameAndAddress5 getValue(PartyIdentificationSD5 obj) {
			return obj.getAgentNameAndAddress();
		}

		@Override
		public void setValue(PartyIdentificationSD5 obj, NameAndAddress5 value) {
			obj.setAgentNameAndAddress(value);
		}
	};
	@XmlElement(name = "AgtTelNb")
	protected PhoneNumber agentTelephoneNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.PhoneNumber
	 * PhoneNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationSD5
	 * PartyIdentificationSD5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AgtTelNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Agent Telephone Number</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgentTelephoneNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Telephone number of the agent."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationSD1#mmAgentTelephoneNumber
	 * PartyIdentificationSD1.mmAgentTelephoneNumber}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PartyIdentificationSD5, Optional<PhoneNumber>> mmAgentTelephoneNumber = new MMMessageAttribute<PartyIdentificationSD5, Optional<PhoneNumber>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PartyIdentificationSD5.mmObject();
			isDerived = false;
			xmlTag = "AgtTelNb";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Agent Telephone Number"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgentTelephoneNumber";
			definition = "Telephone number of the agent.";
			previousVersion_lazy = () -> PartyIdentificationSD1.mmAgentTelephoneNumber;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PhoneNumber.mmObject();
		}

		@Override
		public Optional<PhoneNumber> getValue(PartyIdentificationSD5 obj) {
			return obj.getAgentTelephoneNumber();
		}

		@Override
		public void setValue(PartyIdentificationSD5 obj, Optional<PhoneNumber> value) {
			obj.setAgentTelephoneNumber(value.orElse(null));
		}
	};
	@XmlElement(name = "AgtEmailAdr")
	protected Max256Text agentEmailAddress;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max256Text
	 * Max256Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationSD5
	 * PartyIdentificationSD5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AgtEmailAdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Agent E-Mail</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgentEmailAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Email address of the event agent."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationSD1#mmAgentEmailAddress
	 * PartyIdentificationSD1.mmAgentEmailAddress}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PartyIdentificationSD5, Optional<Max256Text>> mmAgentEmailAddress = new MMMessageAttribute<PartyIdentificationSD5, Optional<Max256Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PartyIdentificationSD5.mmObject();
			isDerived = false;
			xmlTag = "AgtEmailAdr";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Agent E-Mail"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgentEmailAddress";
			definition = "Email address of the event agent.";
			previousVersion_lazy = () -> PartyIdentificationSD1.mmAgentEmailAddress;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max256Text.mmObject();
		}

		@Override
		public Optional<Max256Text> getValue(PartyIdentificationSD5 obj) {
			return obj.getAgentEmailAddress();
		}

		@Override
		public void setValue(PartyIdentificationSD5 obj, Optional<Max256Text> value) {
			obj.setAgentEmailAddress(value.orElse(null));
		}
	};
	@XmlElement(name = "CtctInf")
	protected PartyIdentificationSD4 contactInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentificationSD4
	 * PartyIdentificationSD4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationSD5
	 * PartyIdentificationSD5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtctInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Contact Information Address</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContactInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Agent designated contact Information details."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationSD1#mmContactInformation
	 * PartyIdentificationSD1.mmContactInformation}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PartyIdentificationSD5, Optional<PartyIdentificationSD4>> mmContactInformation = new MMMessageAssociationEnd<PartyIdentificationSD5, Optional<PartyIdentificationSD4>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PartyIdentificationSD5.mmObject();
			isDerived = false;
			xmlTag = "CtctInf";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Contact Information Address"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContactInformation";
			definition = "Agent designated contact Information details.";
			previousVersion_lazy = () -> PartyIdentificationSD1.mmContactInformation;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentificationSD4.mmObject();
		}

		@Override
		public Optional<PartyIdentificationSD4> getValue(PartyIdentificationSD5 obj) {
			return obj.getContactInformation();
		}

		@Override
		public void setValue(PartyIdentificationSD5 obj, Optional<PartyIdentificationSD4> value) {
			obj.setContactInformation(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PartyIdentificationSD5.mmPlaceAndName, com.tools20022.repository.msg.PartyIdentificationSD5.mmAgentType,
						com.tools20022.repository.msg.PartyIdentificationSD5.mmAgentIdentification, com.tools20022.repository.msg.PartyIdentificationSD5.mmAgentNameAndAddress,
						com.tools20022.repository.msg.PartyIdentificationSD5.mmAgentTelephoneNumber, com.tools20022.repository.msg.PartyIdentificationSD5.mmAgentEmailAddress,
						com.tools20022.repository.msg.PartyIdentificationSD5.mmContactInformation);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintOtherAgentRule.forPartyIdentificationSD5);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PartyIdentificationSD5";
				definition = "Provides additional information regarding the new agent component.";
				previousVersion_lazy = () -> PartyIdentificationSD1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max350Text> getPlaceAndName() {
		return placeAndName == null ? Optional.empty() : Optional.of(placeAndName);
	}

	public PartyIdentificationSD5 setPlaceAndName(Max350Text placeAndName) {
		this.placeAndName = placeAndName;
		return this;
	}

	public AgentType1Code getAgentType() {
		return agentType;
	}

	public PartyIdentificationSD5 setAgentType(AgentType1Code agentType) {
		this.agentType = Objects.requireNonNull(agentType);
		return this;
	}

	public Optional<Max8Text> getAgentIdentification() {
		return agentIdentification == null ? Optional.empty() : Optional.of(agentIdentification);
	}

	public PartyIdentificationSD5 setAgentIdentification(Max8Text agentIdentification) {
		this.agentIdentification = agentIdentification;
		return this;
	}

	public NameAndAddress5 getAgentNameAndAddress() {
		return agentNameAndAddress;
	}

	public PartyIdentificationSD5 setAgentNameAndAddress(NameAndAddress5 agentNameAndAddress) {
		this.agentNameAndAddress = Objects.requireNonNull(agentNameAndAddress);
		return this;
	}

	public Optional<PhoneNumber> getAgentTelephoneNumber() {
		return agentTelephoneNumber == null ? Optional.empty() : Optional.of(agentTelephoneNumber);
	}

	public PartyIdentificationSD5 setAgentTelephoneNumber(PhoneNumber agentTelephoneNumber) {
		this.agentTelephoneNumber = agentTelephoneNumber;
		return this;
	}

	public Optional<Max256Text> getAgentEmailAddress() {
		return agentEmailAddress == null ? Optional.empty() : Optional.of(agentEmailAddress);
	}

	public PartyIdentificationSD5 setAgentEmailAddress(Max256Text agentEmailAddress) {
		this.agentEmailAddress = agentEmailAddress;
		return this;
	}

	public Optional<PartyIdentificationSD4> getContactInformation() {
		return contactInformation == null ? Optional.empty() : Optional.of(contactInformation);
	}

	public PartyIdentificationSD5 setContactInformation(PartyIdentificationSD4 contactInformation) {
		this.contactInformation = contactInformation;
		return this;
	}
}