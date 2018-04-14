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
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.TechnicalIdentification1Choice;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Identifies which information are involved by a modification request for party
 * reference data.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SystemPartyModification1Choice#mmSystemParty
 * SystemPartyModification1Choice.mmSystemParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SystemPartyModification1Choice#mmPartyIdentification
 * SystemPartyModification1Choice.mmPartyIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SystemPartyModification1Choice#mmPartyName
 * SystemPartyModification1Choice.mmPartyName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SystemPartyModification1Choice#mmTechnicalAddress
 * SystemPartyModification1Choice.mmTechnicalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SystemPartyModification1Choice#mmPartyAddress
 * SystemPartyModification1Choice.mmPartyAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SystemPartyModification1Choice#mmSystemRestriction
 * SystemPartyModification1Choice.mmSystemRestriction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SystemPartyModification1Choice#mmMarketSpecificAttribute
 * SystemPartyModification1Choice.mmMarketSpecificAttribute}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SystemPartyModification1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Identifies which information are involved by a modification request for party reference data."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SystemPartyModification1Choice", propOrder = {"systemParty", "partyIdentification", "partyName", "technicalAddress", "partyAddress", "systemRestriction", "marketSpecificAttribute"})
public class SystemPartyModification1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "SysPty", required = true)
	protected SystemParty2 systemParty;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.SystemParty2
	 * SystemParty2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SystemPartyModification1Choice
	 * SystemPartyModification1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SysPty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SystemParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the party reference data, as assigned by the system."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SystemPartyModification1Choice, SystemParty2> mmSystemParty = new MMMessageAttribute<SystemPartyModification1Choice, SystemParty2>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.SystemPartyModification1Choice.mmObject();
			isDerived = false;
			xmlTag = "SysPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SystemParty";
			definition = "Specifies the party reference data, as assigned by the system.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SystemParty2.mmObject();
		}

		@Override
		public SystemParty2 getValue(SystemPartyModification1Choice obj) {
			return obj.getSystemParty();
		}

		@Override
		public void setValue(SystemPartyModification1Choice obj, SystemParty2 value) {
			obj.setSystemParty(value);
		}
	};
	@XmlElement(name = "PtyId", required = true)
	protected SystemPartyIdentification2 partyIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SystemPartyIdentification2
	 * SystemPartyIdentification2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SystemPartyModification1Choice
	 * SystemPartyModification1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PtyId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartyIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification to unambiguously identify the party within the system."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SystemPartyModification1Choice, SystemPartyIdentification2> mmPartyIdentification = new MMMessageAttribute<SystemPartyModification1Choice, SystemPartyIdentification2>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.SystemPartyModification1Choice.mmObject();
			isDerived = false;
			xmlTag = "PtyId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartyIdentification";
			definition = "Unique identification to unambiguously identify the party within the system.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SystemPartyIdentification2.mmObject();
		}

		@Override
		public SystemPartyIdentification2 getValue(SystemPartyModification1Choice obj) {
			return obj.getPartyIdentification();
		}

		@Override
		public void setValue(SystemPartyModification1Choice obj, SystemPartyIdentification2 value) {
			obj.setPartyIdentification(value);
		}
	};
	@XmlElement(name = "PtyNm", required = true)
	protected PartyName2 partyName;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.PartyName2
	 * PartyName2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SystemPartyModification1Choice
	 * SystemPartyModification1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PtyNm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartyName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the name by which a party is known and which is usually used to identify that party."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SystemPartyModification1Choice, PartyName2> mmPartyName = new MMMessageAttribute<SystemPartyModification1Choice, PartyName2>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.SystemPartyModification1Choice.mmObject();
			isDerived = false;
			xmlTag = "PtyNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartyName";
			definition = "Specifies the name by which a party is known and which is usually used to identify that party.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> PartyName2.mmObject();
		}

		@Override
		public PartyName2 getValue(SystemPartyModification1Choice obj) {
			return obj.getPartyName();
		}

		@Override
		public void setValue(SystemPartyModification1Choice obj, PartyName2 value) {
			obj.setPartyName(value);
		}
	};
	@XmlElement(name = "TechAdr", required = true)
	protected TechnicalIdentification1Choice technicalAddress;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.TechnicalIdentification1Choice
	 * TechnicalIdentification1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SystemPartyModification1Choice
	 * SystemPartyModification1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TechAdr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TechnicalAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique technical address to unambiguously identify a party for receiving messages from the executing system."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SystemPartyModification1Choice, TechnicalIdentification1Choice> mmTechnicalAddress = new MMMessageAttribute<SystemPartyModification1Choice, TechnicalIdentification1Choice>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.SystemPartyModification1Choice.mmObject();
			isDerived = false;
			xmlTag = "TechAdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TechnicalAddress";
			definition = "Unique technical address to unambiguously identify a party for receiving messages from the executing system.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> TechnicalIdentification1Choice.mmObject();
		}

		@Override
		public TechnicalIdentification1Choice getValue(SystemPartyModification1Choice obj) {
			return obj.getTechnicalAddress();
		}

		@Override
		public void setValue(SystemPartyModification1Choice obj, TechnicalIdentification1Choice value) {
			obj.setTechnicalAddress(value);
		}
	};
	@XmlElement(name = "PtyAdr", required = true)
	protected PostalAddress9 partyAddress;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.PostalAddress9
	 * PostalAddress9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SystemPartyModification1Choice
	 * SystemPartyModification1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PtyAdr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartyAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information that locates and identifies a specific address, as defined by postal services."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SystemPartyModification1Choice, PostalAddress9> mmPartyAddress = new MMMessageAttribute<SystemPartyModification1Choice, PostalAddress9>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.SystemPartyModification1Choice.mmObject();
			isDerived = false;
			xmlTag = "PtyAdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartyAddress";
			definition = "Information that locates and identifies a specific address, as defined by postal services.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> PostalAddress9.mmObject();
		}

		@Override
		public PostalAddress9 getValue(SystemPartyModification1Choice obj) {
			return obj.getPartyAddress();
		}

		@Override
		public void setValue(SystemPartyModification1Choice obj, PostalAddress9 value) {
			obj.setPartyAddress(value);
		}
	};
	@XmlElement(name = "SysRstrctn", required = true)
	protected SystemRestriction1 systemRestriction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SystemRestriction1
	 * SystemRestriction1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SystemPartyModification1Choice
	 * SystemPartyModification1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SysRstrctn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SystemRestriction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Defines the specific processing characteristics for a party to ensure configurability of specific requirements, as prescribed by national legal and regulatory requirements and practices."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SystemPartyModification1Choice, SystemRestriction1> mmSystemRestriction = new MMMessageAttribute<SystemPartyModification1Choice, SystemRestriction1>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.SystemPartyModification1Choice.mmObject();
			isDerived = false;
			xmlTag = "SysRstrctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SystemRestriction";
			definition = "Defines the specific processing characteristics for a party to ensure configurability of specific requirements, as prescribed by national legal and regulatory requirements and practices.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SystemRestriction1.mmObject();
		}

		@Override
		public SystemRestriction1 getValue(SystemPartyModification1Choice obj) {
			return obj.getSystemRestriction();
		}

		@Override
		public void setValue(SystemPartyModification1Choice obj, SystemRestriction1 value) {
			obj.setSystemRestriction(value);
		}
	};
	@XmlElement(name = "MktSpcfcAttr", required = true)
	protected MarketSpecificAttribute1 marketSpecificAttribute;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.MarketSpecificAttribute1
	 * MarketSpecificAttribute1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SystemPartyModification1Choice
	 * SystemPartyModification1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MktSpcfcAttr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketSpecificAttribute"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional attributes defined by a central security depositary for a party."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SystemPartyModification1Choice, MarketSpecificAttribute1> mmMarketSpecificAttribute = new MMMessageAttribute<SystemPartyModification1Choice, MarketSpecificAttribute1>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.SystemPartyModification1Choice.mmObject();
			isDerived = false;
			xmlTag = "MktSpcfcAttr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketSpecificAttribute";
			definition = "Additional attributes defined by a central security depositary for a party.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MarketSpecificAttribute1.mmObject();
		}

		@Override
		public MarketSpecificAttribute1 getValue(SystemPartyModification1Choice obj) {
			return obj.getMarketSpecificAttribute();
		}

		@Override
		public void setValue(SystemPartyModification1Choice obj, MarketSpecificAttribute1 value) {
			obj.setMarketSpecificAttribute(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.SystemPartyModification1Choice.mmSystemParty, com.tools20022.repository.choice.SystemPartyModification1Choice.mmPartyIdentification,
						com.tools20022.repository.choice.SystemPartyModification1Choice.mmPartyName, com.tools20022.repository.choice.SystemPartyModification1Choice.mmTechnicalAddress,
						com.tools20022.repository.choice.SystemPartyModification1Choice.mmPartyAddress, com.tools20022.repository.choice.SystemPartyModification1Choice.mmSystemRestriction,
						com.tools20022.repository.choice.SystemPartyModification1Choice.mmMarketSpecificAttribute);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "SystemPartyModification1Choice";
				definition = "Identifies which information are involved by a modification request for party reference data.";
			}
		});
		return mmObject_lazy.get();
	}

	public SystemParty2 getSystemParty() {
		return systemParty;
	}

	public SystemPartyModification1Choice setSystemParty(SystemParty2 systemParty) {
		this.systemParty = Objects.requireNonNull(systemParty);
		return this;
	}

	public SystemPartyIdentification2 getPartyIdentification() {
		return partyIdentification;
	}

	public SystemPartyModification1Choice setPartyIdentification(SystemPartyIdentification2 partyIdentification) {
		this.partyIdentification = Objects.requireNonNull(partyIdentification);
		return this;
	}

	public PartyName2 getPartyName() {
		return partyName;
	}

	public SystemPartyModification1Choice setPartyName(PartyName2 partyName) {
		this.partyName = Objects.requireNonNull(partyName);
		return this;
	}

	public TechnicalIdentification1Choice getTechnicalAddress() {
		return technicalAddress;
	}

	public SystemPartyModification1Choice setTechnicalAddress(TechnicalIdentification1Choice technicalAddress) {
		this.technicalAddress = Objects.requireNonNull(technicalAddress);
		return this;
	}

	public PostalAddress9 getPartyAddress() {
		return partyAddress;
	}

	public SystemPartyModification1Choice setPartyAddress(PostalAddress9 partyAddress) {
		this.partyAddress = Objects.requireNonNull(partyAddress);
		return this;
	}

	public SystemRestriction1 getSystemRestriction() {
		return systemRestriction;
	}

	public SystemPartyModification1Choice setSystemRestriction(SystemRestriction1 systemRestriction) {
		this.systemRestriction = Objects.requireNonNull(systemRestriction);
		return this;
	}

	public MarketSpecificAttribute1 getMarketSpecificAttribute() {
		return marketSpecificAttribute;
	}

	public SystemPartyModification1Choice setMarketSpecificAttribute(MarketSpecificAttribute1 marketSpecificAttribute) {
		this.marketSpecificAttribute = Objects.requireNonNull(marketSpecificAttribute);
		return this;
	}
}