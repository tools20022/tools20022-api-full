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
import com.tools20022.repository.choice.TechnicalIdentification1Choice;
import com.tools20022.repository.codeset.SystemPartyType1Code;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides the definition of a party within a system. <br>
 * A party shall denote any legal or organisational entity required in the
 * system. <br>
 * This entity shall store the parties from the first three levels: the system
 * operator, the central securities depositaries, the participants of the
 * central securities depositaries, the national central banks and payment
 * banks.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.SystemParty3#mmOpeningDate
 * SystemParty3.mmOpeningDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SystemParty3#mmClosingDate
 * SystemParty3.mmClosingDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SystemParty3#mmType
 * SystemParty3.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SystemParty3#mmTechnicalAddress
 * SystemParty3.mmTechnicalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SystemParty3#mmMarketSpecificAttribute
 * SystemParty3.mmMarketSpecificAttribute}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SystemParty3#mmIdentification
 * SystemParty3.mmIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SystemParty3#mmName
 * SystemParty3.mmName}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SystemParty3#mmAddress
 * SystemParty3.mmAddress}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SystemParty3#mmRestriction
 * SystemParty3.mmRestriction}</li>
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
 * "SystemParty3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides the definition of a party within a system. \r\nA party shall denote any legal or organisational entity required in the system. \r\nThis entity shall store the parties from the first three levels: the system operator, the central securities depositaries, the participants of the central securities depositaries, the national central banks and payment banks."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "SystemParty3", propOrder = {"openingDate", "closingDate", "type", "technicalAddress", "marketSpecificAttribute", "identification", "name", "address", "restriction"})
public class SystemParty3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected ISODate openingDate;
	/**
	 * Specifies the opening date of the party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SystemParty3 SystemParty3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OpngDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OpeningDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the opening date of the party."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOpeningDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SystemParty3.mmObject();
			isDerived = false;
			xmlTag = "OpngDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OpeningDate";
			definition = "Specifies the opening date of the party.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected ISODate closingDate;
	/**
	 * Specifies the closing date of the party
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SystemParty3 SystemParty3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClsgDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClosingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the closing date of the party"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmClosingDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SystemParty3.mmObject();
			isDerived = false;
			xmlTag = "ClsgDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClosingDate";
			definition = "Specifies the closing date of the party";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected SystemPartyType1Code type;
	/**
	 * Specifies the type classification of the party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SystemPartyType1Code
	 * SystemPartyType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SystemParty3 SystemParty3}</li>
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
	 * definition} = "Specifies the type classification of the party."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SystemParty3.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Specifies the type classification of the party.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> SystemPartyType1Code.mmObject();
		}
	};
	protected List<TechnicalIdentification1Choice> technicalAddress;
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
	 * {@linkplain com.tools20022.repository.msg.SystemParty3 SystemParty3}</li>
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
			componentContext_lazy = () -> SystemParty3.mmObject();
			isDerived = false;
			xmlTag = "TechAdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TechnicalAddress";
			definition = "Unique technical address to unambiguously identify a party for receiving messages from the executing system.";
			minOccurs = 0;
			complexType_lazy = () -> TechnicalIdentification1Choice.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.MarketSpecificAttribute1> marketSpecificAttribute;
	/**
	 * Additional attributes defined by a central security depositary for a
	 * party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.MarketSpecificAttribute1
	 * MarketSpecificAttribute1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SystemParty3 SystemParty3}</li>
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
	public static final MMMessageAssociationEnd mmMarketSpecificAttribute = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> SystemParty3.mmObject();
			isDerived = false;
			xmlTag = "MktSpcfcAttr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketSpecificAttribute";
			definition = "Additional attributes defined by a central security depositary for a party.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.MarketSpecificAttribute1.mmObject();
		}
	};
	protected SystemPartyIdentification1 identification;
	/**
	 * Unique and unambiguous way to identify an organisation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SystemPartyIdentification1
	 * SystemPartyIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SystemParty3 SystemParty3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Id"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unique and unambiguous way to identify an organisation."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SystemParty3.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Unique and unambiguous way to identify an organisation.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.SystemPartyIdentification1.mmObject();
		}
	};
	protected PartyName3 name;
	/**
	 * Name by which an organisation is known and which is usually used to
	 * identify that organisation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.PartyName3
	 * PartyName3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SystemParty3 SystemParty3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Nm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Name"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Name by which an organisation is known and which is usually used to identify that organisation."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmName = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SystemParty3.mmObject();
			isDerived = false;
			xmlTag = "Nm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Name";
			definition = "Name by which an organisation is known and which is usually used to identify that organisation.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.PartyName3.mmObject();
		}
	};
	protected PostalAddress10 address;
	/**
	 * Information that locates and identifies a specific address.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.PostalAddress10
	 * PostalAddress10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SystemParty3 SystemParty3}</li>
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
	 * "Information that locates and identifies a specific address."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAddress = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SystemParty3.mmObject();
			isDerived = false;
			xmlTag = "Adr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Address";
			definition = "Information that locates and identifies a specific address.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.PostalAddress10.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.SystemRestriction1> restriction;
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
	 * {@linkplain com.tools20022.repository.msg.SystemParty3 SystemParty3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rstrctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Restriction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Defines the specific processing characteristics for a party to ensure configurability of specific requirements, as prescribed by national legal and regulatory requirements and practices."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRestriction = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SystemParty3.mmObject();
			isDerived = false;
			xmlTag = "Rstrctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Restriction";
			definition = "Defines the specific processing characteristics for a party to ensure configurability of specific requirements, as prescribed by national legal and regulatory requirements and practices.";
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.SystemRestriction1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(SystemParty3.mmOpeningDate, SystemParty3.mmClosingDate, SystemParty3.mmType, SystemParty3.mmTechnicalAddress, SystemParty3.mmMarketSpecificAttribute, SystemParty3.mmIdentification,
						SystemParty3.mmName, SystemParty3.mmAddress, SystemParty3.mmRestriction);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "SystemParty3";
				definition = "Provides the definition of a party within a system. \r\nA party shall denote any legal or organisational entity required in the system. \r\nThis entity shall store the parties from the first three levels: the system operator, the central securities depositaries, the participants of the central securities depositaries, the national central banks and payment banks.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "OpngDt")
	public ISODate getOpeningDate() {
		return openingDate;
	}

	public void setOpeningDate(ISODate openingDate) {
		this.openingDate = openingDate;
	}

	@XmlElement(name = "ClsgDt")
	public ISODate getClosingDate() {
		return closingDate;
	}

	public void setClosingDate(ISODate closingDate) {
		this.closingDate = closingDate;
	}

	@XmlElement(name = "Tp")
	public SystemPartyType1Code getType() {
		return type;
	}

	public void setType(SystemPartyType1Code type) {
		this.type = type;
	}

	@XmlElement(name = "TechAdr")
	public List<TechnicalIdentification1Choice> getTechnicalAddress() {
		return technicalAddress;
	}

	public void setTechnicalAddress(List<TechnicalIdentification1Choice> technicalAddress) {
		this.technicalAddress = technicalAddress;
	}

	@XmlElement(name = "MktSpcfcAttr")
	public List<MarketSpecificAttribute1> getMarketSpecificAttribute() {
		return marketSpecificAttribute;
	}

	public void setMarketSpecificAttribute(List<com.tools20022.repository.msg.MarketSpecificAttribute1> marketSpecificAttribute) {
		this.marketSpecificAttribute = marketSpecificAttribute;
	}

	@XmlElement(name = "Id")
	public SystemPartyIdentification1 getIdentification() {
		return identification;
	}

	public void setIdentification(com.tools20022.repository.msg.SystemPartyIdentification1 identification) {
		this.identification = identification;
	}

	@XmlElement(name = "Nm")
	public PartyName3 getName() {
		return name;
	}

	public void setName(com.tools20022.repository.msg.PartyName3 name) {
		this.name = name;
	}

	@XmlElement(name = "Adr")
	public PostalAddress10 getAddress() {
		return address;
	}

	public void setAddress(com.tools20022.repository.msg.PostalAddress10 address) {
		this.address = address;
	}

	@XmlElement(name = "Rstrctn")
	public List<SystemRestriction1> getRestriction() {
		return restriction;
	}

	public void setRestriction(List<com.tools20022.repository.msg.SystemRestriction1> restriction) {
		this.restriction = restriction;
	}
}