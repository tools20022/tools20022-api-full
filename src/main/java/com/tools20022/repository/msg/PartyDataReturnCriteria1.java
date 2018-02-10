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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.RequestedIndicator;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Return criteria for information to be returned in the report deriving from a
 * query about party reference data.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyDataReturnCriteria1#mmOpeningDate
 * PartyDataReturnCriteria1.mmOpeningDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyDataReturnCriteria1#mmClosingDate
 * PartyDataReturnCriteria1.mmClosingDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyDataReturnCriteria1#mmType
 * PartyDataReturnCriteria1.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyDataReturnCriteria1#mmPartyIdentification
 * PartyDataReturnCriteria1.mmPartyIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyDataReturnCriteria1#mmCSDOrNCB
 * PartyDataReturnCriteria1.mmCSDOrNCB}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyDataReturnCriteria1#mmRestrictionIdentification
 * PartyDataReturnCriteria1.mmRestrictionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyDataReturnCriteria1#mmRestrictedOnDate
 * PartyDataReturnCriteria1.mmRestrictedOnDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyDataReturnCriteria1#mmName
 * PartyDataReturnCriteria1.mmName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyDataReturnCriteria1#mmShortName
 * PartyDataReturnCriteria1.mmShortName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyDataReturnCriteria1#mmAddress
 * PartyDataReturnCriteria1.mmAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyDataReturnCriteria1#mmTechnicalAddress
 * PartyDataReturnCriteria1.mmTechnicalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyDataReturnCriteria1#mmMarketSpecificAttribute
 * PartyDataReturnCriteria1.mmMarketSpecificAttribute}</li>
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
 * "PartyDataReturnCriteria1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Return criteria for information to be returned in the report deriving from a query about party reference data. "
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PartyDataReturnCriteria1", propOrder = {"openingDate", "closingDate", "type", "partyIdentification", "cSDOrNCB", "restrictionIdentification", "restrictedOnDate", "name", "shortName", "address", "technicalAddress",
		"marketSpecificAttribute"})
public class PartyDataReturnCriteria1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "OpngDt")
	protected RequestedIndicator openingDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyDataReturnCriteria1
	 * PartyDataReturnCriteria1}</li>
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
	 * definition} =
	 * "Indicates whether the opening date of the party is requested."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOpeningDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PartyDataReturnCriteria1.mmObject();
			isDerived = false;
			xmlTag = "OpngDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OpeningDate";
			definition = "Indicates whether the opening date of the party is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	@XmlElement(name = "ClsgDt")
	protected RequestedIndicator closingDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyDataReturnCriteria1
	 * PartyDataReturnCriteria1}</li>
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
	 * definition} =
	 * "Indicates whether the closing date of the party is requested."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmClosingDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PartyDataReturnCriteria1.mmObject();
			isDerived = false;
			xmlTag = "ClsgDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClosingDate";
			definition = "Indicates whether the closing date of the party is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	@XmlElement(name = "Tp")
	protected RequestedIndicator type;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyDataReturnCriteria1
	 * PartyDataReturnCriteria1}</li>
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
	 * definition} = "Indicates whether the type is requested."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PartyDataReturnCriteria1.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Indicates whether the type is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	@XmlElement(name = "PtyId")
	protected RequestedIndicator partyIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyDataReturnCriteria1
	 * PartyDataReturnCriteria1}</li>
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
	 * "Indicates whether the unique identification to unambiguously identify the party within the system is requested."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPartyIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PartyDataReturnCriteria1.mmObject();
			isDerived = false;
			xmlTag = "PtyId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartyIdentification";
			definition = "Indicates whether the unique identification to unambiguously identify the party within the system is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	@XmlElement(name = "CSDOrNCB")
	protected RequestedIndicator cSDOrNCB;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyDataReturnCriteria1
	 * PartyDataReturnCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CSDOrNCB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CSDOrNCB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the central security depository or the national central bank who initially created the party reference data is requested."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCSDOrNCB = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PartyDataReturnCriteria1.mmObject();
			isDerived = false;
			xmlTag = "CSDOrNCB";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CSDOrNCB";
			definition = "Indicates whether the central security depository or the national central bank who initially created the party reference data is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	@XmlElement(name = "RstrctnId")
	protected RequestedIndicator restrictionIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyDataReturnCriteria1
	 * PartyDataReturnCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RstrctnId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RestrictionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the identification of the restriction is requested."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRestrictionIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PartyDataReturnCriteria1.mmObject();
			isDerived = false;
			xmlTag = "RstrctnId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RestrictionIdentification";
			definition = "Indicates whether the identification of the restriction is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	@XmlElement(name = "RstrctdOnDt")
	protected RequestedIndicator restrictedOnDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyDataReturnCriteria1
	 * PartyDataReturnCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RstrctdOnDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RestrictedOnDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the date at which a restriction for party has been issued is requested."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRestrictedOnDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PartyDataReturnCriteria1.mmObject();
			isDerived = false;
			xmlTag = "RstrctdOnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RestrictedOnDate";
			definition = "Indicates whether the date at which a restriction for party has been issued is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	@XmlElement(name = "Nm")
	protected RequestedIndicator name;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyDataReturnCriteria1
	 * PartyDataReturnCriteria1}</li>
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
	 * definition} = "Indicates whether the name for the party is requested."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmName = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PartyDataReturnCriteria1.mmObject();
			isDerived = false;
			xmlTag = "Nm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Name";
			definition = "Indicates whether the name for the party is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	@XmlElement(name = "ShrtNm")
	protected RequestedIndicator shortName;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyDataReturnCriteria1
	 * PartyDataReturnCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ShrtNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShortName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the short name for the party is requested."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmShortName = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PartyDataReturnCriteria1.mmObject();
			isDerived = false;
			xmlTag = "ShrtNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShortName";
			definition = "Indicates whether the short name for the party is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	@XmlElement(name = "Adr")
	protected RequestedIndicator address;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyDataReturnCriteria1
	 * PartyDataReturnCriteria1}</li>
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
	 * definition} = "Indicates whether the address for the party is requested."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAddress = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PartyDataReturnCriteria1.mmObject();
			isDerived = false;
			xmlTag = "Adr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Address";
			definition = "Indicates whether the address for the party is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	@XmlElement(name = "TechAdr")
	protected RequestedIndicator technicalAddress;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyDataReturnCriteria1
	 * PartyDataReturnCriteria1}</li>
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
	 * "Indicates whether the technical addresses for the party are requested."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTechnicalAddress = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PartyDataReturnCriteria1.mmObject();
			isDerived = false;
			xmlTag = "TechAdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TechnicalAddress";
			definition = "Indicates whether the technical addresses for the party are requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	@XmlElement(name = "MktSpcfcAttr")
	protected RequestedIndicator marketSpecificAttribute;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyDataReturnCriteria1
	 * PartyDataReturnCriteria1}</li>
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
	 * "Indicates whether the market specific attributes  for the party are requested."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMarketSpecificAttribute = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PartyDataReturnCriteria1.mmObject();
			isDerived = false;
			xmlTag = "MktSpcfcAttr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketSpecificAttribute";
			definition = "Indicates whether the market specific attributes  for the party are requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PartyDataReturnCriteria1.mmOpeningDate, com.tools20022.repository.msg.PartyDataReturnCriteria1.mmClosingDate,
						com.tools20022.repository.msg.PartyDataReturnCriteria1.mmType, com.tools20022.repository.msg.PartyDataReturnCriteria1.mmPartyIdentification, com.tools20022.repository.msg.PartyDataReturnCriteria1.mmCSDOrNCB,
						com.tools20022.repository.msg.PartyDataReturnCriteria1.mmRestrictionIdentification, com.tools20022.repository.msg.PartyDataReturnCriteria1.mmRestrictedOnDate,
						com.tools20022.repository.msg.PartyDataReturnCriteria1.mmName, com.tools20022.repository.msg.PartyDataReturnCriteria1.mmShortName, com.tools20022.repository.msg.PartyDataReturnCriteria1.mmAddress,
						com.tools20022.repository.msg.PartyDataReturnCriteria1.mmTechnicalAddress, com.tools20022.repository.msg.PartyDataReturnCriteria1.mmMarketSpecificAttribute);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "PartyDataReturnCriteria1";
				definition = "Return criteria for information to be returned in the report deriving from a query about party reference data. ";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<RequestedIndicator> getOpeningDate() {
		return openingDate == null ? Optional.empty() : Optional.of(openingDate);
	}

	public PartyDataReturnCriteria1 setOpeningDate(RequestedIndicator openingDate) {
		this.openingDate = openingDate;
		return this;
	}

	public Optional<RequestedIndicator> getClosingDate() {
		return closingDate == null ? Optional.empty() : Optional.of(closingDate);
	}

	public PartyDataReturnCriteria1 setClosingDate(RequestedIndicator closingDate) {
		this.closingDate = closingDate;
		return this;
	}

	public Optional<RequestedIndicator> getType() {
		return type == null ? Optional.empty() : Optional.of(type);
	}

	public PartyDataReturnCriteria1 setType(RequestedIndicator type) {
		this.type = type;
		return this;
	}

	public Optional<RequestedIndicator> getPartyIdentification() {
		return partyIdentification == null ? Optional.empty() : Optional.of(partyIdentification);
	}

	public PartyDataReturnCriteria1 setPartyIdentification(RequestedIndicator partyIdentification) {
		this.partyIdentification = partyIdentification;
		return this;
	}

	public Optional<RequestedIndicator> getCSDOrNCB() {
		return cSDOrNCB == null ? Optional.empty() : Optional.of(cSDOrNCB);
	}

	public PartyDataReturnCriteria1 setCSDOrNCB(RequestedIndicator cSDOrNCB) {
		this.cSDOrNCB = cSDOrNCB;
		return this;
	}

	public Optional<RequestedIndicator> getRestrictionIdentification() {
		return restrictionIdentification == null ? Optional.empty() : Optional.of(restrictionIdentification);
	}

	public PartyDataReturnCriteria1 setRestrictionIdentification(RequestedIndicator restrictionIdentification) {
		this.restrictionIdentification = restrictionIdentification;
		return this;
	}

	public Optional<RequestedIndicator> getRestrictedOnDate() {
		return restrictedOnDate == null ? Optional.empty() : Optional.of(restrictedOnDate);
	}

	public PartyDataReturnCriteria1 setRestrictedOnDate(RequestedIndicator restrictedOnDate) {
		this.restrictedOnDate = restrictedOnDate;
		return this;
	}

	public Optional<RequestedIndicator> getName() {
		return name == null ? Optional.empty() : Optional.of(name);
	}

	public PartyDataReturnCriteria1 setName(RequestedIndicator name) {
		this.name = name;
		return this;
	}

	public Optional<RequestedIndicator> getShortName() {
		return shortName == null ? Optional.empty() : Optional.of(shortName);
	}

	public PartyDataReturnCriteria1 setShortName(RequestedIndicator shortName) {
		this.shortName = shortName;
		return this;
	}

	public Optional<RequestedIndicator> getAddress() {
		return address == null ? Optional.empty() : Optional.of(address);
	}

	public PartyDataReturnCriteria1 setAddress(RequestedIndicator address) {
		this.address = address;
		return this;
	}

	public Optional<RequestedIndicator> getTechnicalAddress() {
		return technicalAddress == null ? Optional.empty() : Optional.of(technicalAddress);
	}

	public PartyDataReturnCriteria1 setTechnicalAddress(RequestedIndicator technicalAddress) {
		this.technicalAddress = technicalAddress;
		return this;
	}

	public Optional<RequestedIndicator> getMarketSpecificAttribute() {
		return marketSpecificAttribute == null ? Optional.empty() : Optional.of(marketSpecificAttribute);
	}

	public PartyDataReturnCriteria1 setMarketSpecificAttribute(RequestedIndicator marketSpecificAttribute) {
		this.marketSpecificAttribute = marketSpecificAttribute;
		return this;
	}
}