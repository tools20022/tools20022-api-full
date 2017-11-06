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
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SystemPartyModification1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Identifies which information are involved by a modification request for party reference data."
 * </li>
 * </ul>
 */
public class SystemPartyModification1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected SystemParty2 systemParty;
	/**
	 * Specifies the party reference data, as assigned by the system.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SystemParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the party reference data, as assigned by the system."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSystemParty = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SystemPartyModification1Choice.mmObject();
			isDerived = false;
			xmlTag = "SysPty";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SystemParty";
			definition = "Specifies the party reference data, as assigned by the system.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SystemParty2.mmObject();
		}
	};
	protected SystemPartyIdentification2 partyIdentification;
	/**
	 * Unique identification to unambiguously identify the party within the
	 * system.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartyIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification to unambiguously identify the party within the system."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPartyIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SystemPartyModification1Choice.mmObject();
			isDerived = false;
			xmlTag = "PtyId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartyIdentification";
			definition = "Unique identification to unambiguously identify the party within the system.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SystemPartyIdentification2.mmObject();
		}
	};
	protected PartyName2 partyName;
	/**
	 * Specifies the name by which a party is known and which is usually used to
	 * identify that party.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartyName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the name by which a party is known and which is usually used to identify that party."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPartyName = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SystemPartyModification1Choice.mmObject();
			isDerived = false;
			xmlTag = "PtyNm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartyName";
			definition = "Specifies the name by which a party is known and which is usually used to identify that party.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> PartyName2.mmObject();
		}
	};
	protected TechnicalIdentification1Choice technicalAddress;
	/**
	 * Unique technical address to unambiguously identify a party for receiving
	 * messages from the executing system.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TechnicalAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique technical address to unambiguously identify a party for receiving messages from the executing system."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTechnicalAddress = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SystemPartyModification1Choice.mmObject();
			isDerived = false;
			xmlTag = "TechAdr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TechnicalAddress";
			definition = "Unique technical address to unambiguously identify a party for receiving messages from the executing system.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> com.tools20022.repository.choice.TechnicalIdentification1Choice.mmObject();
		}
	};
	protected PostalAddress9 partyAddress;
	/**
	 * Information that locates and identifies a specific address, as defined by
	 * postal services.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartyAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information that locates and identifies a specific address, as defined by postal services."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPartyAddress = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SystemPartyModification1Choice.mmObject();
			isDerived = false;
			xmlTag = "PtyAdr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartyAddress";
			definition = "Information that locates and identifies a specific address, as defined by postal services.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> PostalAddress9.mmObject();
		}
	};
	protected SystemRestriction1 systemRestriction;
	/**
	 * Defines the specific processing characteristics for a party to ensure
	 * configurability of specific requirements, as prescribed by national legal
	 * and regulatory requirements and practices.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SystemRestriction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Defines the specific processing characteristics for a party to ensure configurability of specific requirements, as prescribed by national legal and regulatory requirements and practices."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSystemRestriction = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SystemPartyModification1Choice.mmObject();
			isDerived = false;
			xmlTag = "SysRstrctn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SystemRestriction";
			definition = "Defines the specific processing characteristics for a party to ensure configurability of specific requirements, as prescribed by national legal and regulatory requirements and practices.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SystemRestriction1.mmObject();
		}
	};
	protected MarketSpecificAttribute1 marketSpecificAttribute;
	/**
	 * Additional attributes defined by a central security depositary for a
	 * party.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketSpecificAttribute"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional attributes defined by a central security depositary for a party."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMarketSpecificAttribute = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SystemPartyModification1Choice.mmObject();
			isDerived = false;
			xmlTag = "MktSpcfcAttr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketSpecificAttribute";
			definition = "Additional attributes defined by a central security depositary for a party.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MarketSpecificAttribute1.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.SystemPartyModification1Choice.mmSystemParty, com.tools20022.repository.choice.SystemPartyModification1Choice.mmPartyIdentification,
						com.tools20022.repository.choice.SystemPartyModification1Choice.mmPartyName, com.tools20022.repository.choice.SystemPartyModification1Choice.mmTechnicalAddress,
						com.tools20022.repository.choice.SystemPartyModification1Choice.mmPartyAddress, com.tools20022.repository.choice.SystemPartyModification1Choice.mmSystemRestriction,
						com.tools20022.repository.choice.SystemPartyModification1Choice.mmMarketSpecificAttribute);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "SystemPartyModification1Choice";
				definition = "Identifies which information are involved by a modification request for party reference data.";
			}
		});
		return mmObject_lazy.get();
	}

	public SystemParty2 getSystemParty() {
		return systemParty;
	}

	public void setSystemParty(SystemParty2 systemParty) {
		this.systemParty = systemParty;
	}

	public SystemPartyIdentification2 getPartyIdentification() {
		return partyIdentification;
	}

	public void setPartyIdentification(SystemPartyIdentification2 partyIdentification) {
		this.partyIdentification = partyIdentification;
	}

	public PartyName2 getPartyName() {
		return partyName;
	}

	public void setPartyName(PartyName2 partyName) {
		this.partyName = partyName;
	}

	public TechnicalIdentification1Choice getTechnicalAddress() {
		return technicalAddress;
	}

	public void setTechnicalAddress(com.tools20022.repository.choice.TechnicalIdentification1Choice technicalAddress) {
		this.technicalAddress = technicalAddress;
	}

	public PostalAddress9 getPartyAddress() {
		return partyAddress;
	}

	public void setPartyAddress(PostalAddress9 partyAddress) {
		this.partyAddress = partyAddress;
	}

	public SystemRestriction1 getSystemRestriction() {
		return systemRestriction;
	}

	public void setSystemRestriction(SystemRestriction1 systemRestriction) {
		this.systemRestriction = systemRestriction;
	}

	public MarketSpecificAttribute1 getMarketSpecificAttribute() {
		return marketSpecificAttribute;
	}

	public void setMarketSpecificAttribute(MarketSpecificAttribute1 marketSpecificAttribute) {
		this.marketSpecificAttribute = marketSpecificAttribute;
	}
}