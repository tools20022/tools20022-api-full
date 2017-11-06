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
import com.tools20022.repository.datatype.RequestedIndicator;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
public class PartyDataReturnCriteria1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected RequestedIndicator openingDate;
	/**
	 * Indicates whether the opening date of the party is requested.
	 * <p>
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
			componentContext_lazy = () -> PartyDataReturnCriteria1.mmObject();
			isDerived = false;
			xmlTag = "OpngDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OpeningDate";
			definition = "Indicates whether the opening date of the party is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	protected RequestedIndicator closingDate;
	/**
	 * Indicates whether the closing date of the party is requested.
	 * <p>
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
			componentContext_lazy = () -> PartyDataReturnCriteria1.mmObject();
			isDerived = false;
			xmlTag = "ClsgDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClosingDate";
			definition = "Indicates whether the closing date of the party is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	protected RequestedIndicator type;
	/**
	 * Indicates whether the type is requested.
	 * <p>
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
			componentContext_lazy = () -> PartyDataReturnCriteria1.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Indicates whether the type is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	protected RequestedIndicator partyIdentification;
	/**
	 * Indicates whether the unique identification to unambiguously identify the
	 * party within the system is requested.
	 * <p>
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
			componentContext_lazy = () -> PartyDataReturnCriteria1.mmObject();
			isDerived = false;
			xmlTag = "PtyId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartyIdentification";
			definition = "Indicates whether the unique identification to unambiguously identify the party within the system is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	protected RequestedIndicator cSDOrNCB;
	/**
	 * Indicates whether the central security depository or the national central
	 * bank who initially created the party reference data is requested.
	 * <p>
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
			componentContext_lazy = () -> PartyDataReturnCriteria1.mmObject();
			isDerived = false;
			xmlTag = "CSDOrNCB";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CSDOrNCB";
			definition = "Indicates whether the central security depository or the national central bank who initially created the party reference data is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	protected RequestedIndicator restrictionIdentification;
	/**
	 * Indicates whether the identification of the restriction is requested.
	 * <p>
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
			componentContext_lazy = () -> PartyDataReturnCriteria1.mmObject();
			isDerived = false;
			xmlTag = "RstrctnId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RestrictionIdentification";
			definition = "Indicates whether the identification of the restriction is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	protected RequestedIndicator restrictedOnDate;
	/**
	 * Indicates whether the date at which a restriction for party has been
	 * issued is requested.
	 * <p>
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
			componentContext_lazy = () -> PartyDataReturnCriteria1.mmObject();
			isDerived = false;
			xmlTag = "RstrctdOnDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RestrictedOnDate";
			definition = "Indicates whether the date at which a restriction for party has been issued is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	protected RequestedIndicator name;
	/**
	 * Indicates whether the name for the party is requested.
	 * <p>
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
			componentContext_lazy = () -> PartyDataReturnCriteria1.mmObject();
			isDerived = false;
			xmlTag = "Nm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Name";
			definition = "Indicates whether the name for the party is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	protected RequestedIndicator shortName;
	/**
	 * Indicates whether the short name for the party is requested.
	 * <p>
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
			componentContext_lazy = () -> PartyDataReturnCriteria1.mmObject();
			isDerived = false;
			xmlTag = "ShrtNm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShortName";
			definition = "Indicates whether the short name for the party is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	protected RequestedIndicator address;
	/**
	 * Indicates whether the address for the party is requested.
	 * <p>
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
			componentContext_lazy = () -> PartyDataReturnCriteria1.mmObject();
			isDerived = false;
			xmlTag = "Adr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Address";
			definition = "Indicates whether the address for the party is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	protected RequestedIndicator technicalAddress;
	/**
	 * Indicates whether the technical addresses for the party are requested.
	 * <p>
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
			componentContext_lazy = () -> PartyDataReturnCriteria1.mmObject();
			isDerived = false;
			xmlTag = "TechAdr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TechnicalAddress";
			definition = "Indicates whether the technical addresses for the party are requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	protected RequestedIndicator marketSpecificAttribute;
	/**
	 * Indicates whether the market specific attributes for the party are
	 * requested.
	 * <p>
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
			componentContext_lazy = () -> PartyDataReturnCriteria1.mmObject();
			isDerived = false;
			xmlTag = "MktSpcfcAttr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "PartyDataReturnCriteria1";
				definition = "Return criteria for information to be returned in the report deriving from a query about party reference data. ";
			}
		});
		return mmObject_lazy.get();
	}

	public RequestedIndicator getOpeningDate() {
		return openingDate;
	}

	public void setOpeningDate(RequestedIndicator openingDate) {
		this.openingDate = openingDate;
	}

	public RequestedIndicator getClosingDate() {
		return closingDate;
	}

	public void setClosingDate(RequestedIndicator closingDate) {
		this.closingDate = closingDate;
	}

	public RequestedIndicator getType() {
		return type;
	}

	public void setType(RequestedIndicator type) {
		this.type = type;
	}

	public RequestedIndicator getPartyIdentification() {
		return partyIdentification;
	}

	public void setPartyIdentification(RequestedIndicator partyIdentification) {
		this.partyIdentification = partyIdentification;
	}

	public RequestedIndicator getCSDOrNCB() {
		return cSDOrNCB;
	}

	public void setCSDOrNCB(RequestedIndicator cSDOrNCB) {
		this.cSDOrNCB = cSDOrNCB;
	}

	public RequestedIndicator getRestrictionIdentification() {
		return restrictionIdentification;
	}

	public void setRestrictionIdentification(RequestedIndicator restrictionIdentification) {
		this.restrictionIdentification = restrictionIdentification;
	}

	public RequestedIndicator getRestrictedOnDate() {
		return restrictedOnDate;
	}

	public void setRestrictedOnDate(RequestedIndicator restrictedOnDate) {
		this.restrictedOnDate = restrictedOnDate;
	}

	public RequestedIndicator getName() {
		return name;
	}

	public void setName(RequestedIndicator name) {
		this.name = name;
	}

	public RequestedIndicator getShortName() {
		return shortName;
	}

	public void setShortName(RequestedIndicator shortName) {
		this.shortName = shortName;
	}

	public RequestedIndicator getAddress() {
		return address;
	}

	public void setAddress(RequestedIndicator address) {
		this.address = address;
	}

	public RequestedIndicator getTechnicalAddress() {
		return technicalAddress;
	}

	public void setTechnicalAddress(RequestedIndicator technicalAddress) {
		this.technicalAddress = technicalAddress;
	}

	public RequestedIndicator getMarketSpecificAttribute() {
		return marketSpecificAttribute;
	}

	public void setMarketSpecificAttribute(RequestedIndicator marketSpecificAttribute) {
		this.marketSpecificAttribute = marketSpecificAttribute;
	}
}