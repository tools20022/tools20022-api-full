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
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SystemParty3", propOrder = {"openingDate", "closingDate", "type", "technicalAddress", "marketSpecificAttribute", "identification", "name", "address", "restriction"})
public class SystemParty3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "OpngDt")
	protected ISODate openingDate;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<SystemParty3, Optional<ISODate>> mmOpeningDate = new MMMessageAttribute<SystemParty3, Optional<ISODate>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SystemParty3.mmObject();
			isDerived = false;
			xmlTag = "OpngDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OpeningDate";
			definition = "Specifies the opening date of the party.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(SystemParty3 obj) {
			return obj.getOpeningDate();
		}

		@Override
		public void setValue(SystemParty3 obj, Optional<ISODate> value) {
			obj.setOpeningDate(value.orElse(null));
		}
	};
	@XmlElement(name = "ClsgDt")
	protected ISODate closingDate;
	/**
	 * 
	 <p>
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
	 * definition} = "Specifies the closing date of the party."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SystemParty3, Optional<ISODate>> mmClosingDate = new MMMessageAttribute<SystemParty3, Optional<ISODate>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SystemParty3.mmObject();
			isDerived = false;
			xmlTag = "ClsgDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClosingDate";
			definition = "Specifies the closing date of the party.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(SystemParty3 obj) {
			return obj.getClosingDate();
		}

		@Override
		public void setValue(SystemParty3 obj, Optional<ISODate> value) {
			obj.setClosingDate(value.orElse(null));
		}
	};
	@XmlElement(name = "Tp")
	protected SystemPartyType1Code type;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<SystemParty3, Optional<SystemPartyType1Code>> mmType = new MMMessageAttribute<SystemParty3, Optional<SystemPartyType1Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SystemParty3.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Specifies the type classification of the party.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> SystemPartyType1Code.mmObject();
		}

		@Override
		public Optional<SystemPartyType1Code> getValue(SystemParty3 obj) {
			return obj.getType();
		}

		@Override
		public void setValue(SystemParty3 obj, Optional<SystemPartyType1Code> value) {
			obj.setType(value.orElse(null));
		}
	};
	@XmlElement(name = "TechAdr")
	protected List<TechnicalIdentification1Choice> technicalAddress;
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
	public static final MMMessageAttribute<SystemParty3, List<TechnicalIdentification1Choice>> mmTechnicalAddress = new MMMessageAttribute<SystemParty3, List<TechnicalIdentification1Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SystemParty3.mmObject();
			isDerived = false;
			xmlTag = "TechAdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TechnicalAddress";
			definition = "Unique technical address to unambiguously identify a party for receiving messages from the executing system.";
			minOccurs = 0;
			complexType_lazy = () -> TechnicalIdentification1Choice.mmObject();
		}

		@Override
		public List<TechnicalIdentification1Choice> getValue(SystemParty3 obj) {
			return obj.getTechnicalAddress();
		}

		@Override
		public void setValue(SystemParty3 obj, List<TechnicalIdentification1Choice> value) {
			obj.setTechnicalAddress(value);
		}
	};
	@XmlElement(name = "MktSpcfcAttr")
	protected List<MarketSpecificAttribute1> marketSpecificAttribute;
	/**
	 * 
	 <p>
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
	public static final MMMessageAssociationEnd<SystemParty3, List<MarketSpecificAttribute1>> mmMarketSpecificAttribute = new MMMessageAssociationEnd<SystemParty3, List<MarketSpecificAttribute1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SystemParty3.mmObject();
			isDerived = false;
			xmlTag = "MktSpcfcAttr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketSpecificAttribute";
			definition = "Additional attributes defined by a central security depositary for a party.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> MarketSpecificAttribute1.mmObject();
		}

		@Override
		public List<MarketSpecificAttribute1> getValue(SystemParty3 obj) {
			return obj.getMarketSpecificAttribute();
		}

		@Override
		public void setValue(SystemParty3 obj, List<MarketSpecificAttribute1> value) {
			obj.setMarketSpecificAttribute(value);
		}
	};
	@XmlElement(name = "Id")
	protected SystemPartyIdentification1 identification;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<SystemParty3, Optional<SystemPartyIdentification1>> mmIdentification = new MMMessageAttribute<SystemParty3, Optional<SystemPartyIdentification1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SystemParty3.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Unique and unambiguous way to identify an organisation.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SystemPartyIdentification1.mmObject();
		}

		@Override
		public Optional<SystemPartyIdentification1> getValue(SystemParty3 obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(SystemParty3 obj, Optional<SystemPartyIdentification1> value) {
			obj.setIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "Nm")
	protected PartyName3 name;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<SystemParty3, Optional<PartyName3>> mmName = new MMMessageAttribute<SystemParty3, Optional<PartyName3>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SystemParty3.mmObject();
			isDerived = false;
			xmlTag = "Nm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Name";
			definition = "Name by which an organisation is known and which is usually used to identify that organisation.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyName3.mmObject();
		}

		@Override
		public Optional<PartyName3> getValue(SystemParty3 obj) {
			return obj.getName();
		}

		@Override
		public void setValue(SystemParty3 obj, Optional<PartyName3> value) {
			obj.setName(value.orElse(null));
		}
	};
	@XmlElement(name = "Adr")
	protected PostalAddress10 address;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<SystemParty3, Optional<PostalAddress10>> mmAddress = new MMMessageAttribute<SystemParty3, Optional<PostalAddress10>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SystemParty3.mmObject();
			isDerived = false;
			xmlTag = "Adr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Address";
			definition = "Information that locates and identifies a specific address.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PostalAddress10.mmObject();
		}

		@Override
		public Optional<PostalAddress10> getValue(SystemParty3 obj) {
			return obj.getAddress();
		}

		@Override
		public void setValue(SystemParty3 obj, Optional<PostalAddress10> value) {
			obj.setAddress(value.orElse(null));
		}
	};
	@XmlElement(name = "Rstrctn")
	protected List<SystemRestriction1> restriction;
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
	public static final MMMessageAttribute<SystemParty3, List<SystemRestriction1>> mmRestriction = new MMMessageAttribute<SystemParty3, List<SystemRestriction1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SystemParty3.mmObject();
			isDerived = false;
			xmlTag = "Rstrctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Restriction";
			definition = "Defines the specific processing characteristics for a party to ensure configurability of specific requirements, as prescribed by national legal and regulatory requirements and practices.";
			minOccurs = 0;
			complexType_lazy = () -> SystemRestriction1.mmObject();
		}

		@Override
		public List<SystemRestriction1> getValue(SystemParty3 obj) {
			return obj.getRestriction();
		}

		@Override
		public void setValue(SystemParty3 obj, List<SystemRestriction1> value) {
			obj.setRestriction(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SystemParty3.mmOpeningDate, com.tools20022.repository.msg.SystemParty3.mmClosingDate, com.tools20022.repository.msg.SystemParty3.mmType,
						com.tools20022.repository.msg.SystemParty3.mmTechnicalAddress, com.tools20022.repository.msg.SystemParty3.mmMarketSpecificAttribute, com.tools20022.repository.msg.SystemParty3.mmIdentification,
						com.tools20022.repository.msg.SystemParty3.mmName, com.tools20022.repository.msg.SystemParty3.mmAddress, com.tools20022.repository.msg.SystemParty3.mmRestriction);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "SystemParty3";
				definition = "Provides the definition of a party within a system. \r\nA party shall denote any legal or organisational entity required in the system. \r\nThis entity shall store the parties from the first three levels: the system operator, the central securities depositaries, the participants of the central securities depositaries, the national central banks and payment banks.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<ISODate> getOpeningDate() {
		return openingDate == null ? Optional.empty() : Optional.of(openingDate);
	}

	public SystemParty3 setOpeningDate(ISODate openingDate) {
		this.openingDate = openingDate;
		return this;
	}

	public Optional<ISODate> getClosingDate() {
		return closingDate == null ? Optional.empty() : Optional.of(closingDate);
	}

	public SystemParty3 setClosingDate(ISODate closingDate) {
		this.closingDate = closingDate;
		return this;
	}

	public Optional<SystemPartyType1Code> getType() {
		return type == null ? Optional.empty() : Optional.of(type);
	}

	public SystemParty3 setType(SystemPartyType1Code type) {
		this.type = type;
		return this;
	}

	public List<TechnicalIdentification1Choice> getTechnicalAddress() {
		return technicalAddress == null ? technicalAddress = new ArrayList<>() : technicalAddress;
	}

	public SystemParty3 setTechnicalAddress(List<TechnicalIdentification1Choice> technicalAddress) {
		this.technicalAddress = Objects.requireNonNull(technicalAddress);
		return this;
	}

	public List<MarketSpecificAttribute1> getMarketSpecificAttribute() {
		return marketSpecificAttribute == null ? marketSpecificAttribute = new ArrayList<>() : marketSpecificAttribute;
	}

	public SystemParty3 setMarketSpecificAttribute(List<MarketSpecificAttribute1> marketSpecificAttribute) {
		this.marketSpecificAttribute = Objects.requireNonNull(marketSpecificAttribute);
		return this;
	}

	public Optional<SystemPartyIdentification1> getIdentification() {
		return identification == null ? Optional.empty() : Optional.of(identification);
	}

	public SystemParty3 setIdentification(SystemPartyIdentification1 identification) {
		this.identification = identification;
		return this;
	}

	public Optional<PartyName3> getName() {
		return name == null ? Optional.empty() : Optional.of(name);
	}

	public SystemParty3 setName(PartyName3 name) {
		this.name = name;
		return this;
	}

	public Optional<PostalAddress10> getAddress() {
		return address == null ? Optional.empty() : Optional.of(address);
	}

	public SystemParty3 setAddress(PostalAddress10 address) {
		this.address = address;
		return this;
	}

	public List<SystemRestriction1> getRestriction() {
		return restriction == null ? restriction = new ArrayList<>() : restriction;
	}

	public SystemParty3 setRestriction(List<SystemRestriction1> restriction) {
		this.restriction = Objects.requireNonNull(restriction);
		return this;
	}
}