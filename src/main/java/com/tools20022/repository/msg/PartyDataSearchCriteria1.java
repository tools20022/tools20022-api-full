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
import com.tools20022.repository.choice.CSDOrNCB1Choice;
import com.tools20022.repository.choice.DateAndDateTimeSearchChoice;
import com.tools20022.repository.choice.DateSearchChoice;
import com.tools20022.repository.codeset.SystemPartyType1Code;
import com.tools20022.repository.datatype.BICFIIdentifier;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Set of search criteria for querying party reference data.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyDataSearchCriteria1#mmOpeningDate
 * PartyDataSearchCriteria1.mmOpeningDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyDataSearchCriteria1#mmClosingDate
 * PartyDataSearchCriteria1.mmClosingDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyDataSearchCriteria1#mmType
 * PartyDataSearchCriteria1.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyDataSearchCriteria1#mmCSDOrNCB
 * PartyDataSearchCriteria1.mmCSDOrNCB}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyDataSearchCriteria1#mmIdentification
 * PartyDataSearchCriteria1.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyDataSearchCriteria1#mmRestrictionIdentification
 * PartyDataSearchCriteria1.mmRestrictionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyDataSearchCriteria1#mmRestrictionIssueDate
 * PartyDataSearchCriteria1.mmRestrictionIssueDate}</li>
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
 * "PartyDataSearchCriteria1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Set of search criteria for querying party reference data."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "PartyDataSearchCriteria1", propOrder = {"openingDate", "closingDate", "type", "CSDOrNCB", "identification", "restrictionIdentification", "restrictionIssueDate"})
public class PartyDataSearchCriteria1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected DateSearchChoice openingDate;
	/**
	 * Specifies the opening date of the party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateSearchChoice
	 * DateSearchChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyDataSearchCriteria1
	 * PartyDataSearchCriteria1}</li>
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
			componentContext_lazy = () -> PartyDataSearchCriteria1.mmObject();
			isDerived = false;
			xmlTag = "OpngDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OpeningDate";
			definition = "Specifies the opening date of the party.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateSearchChoice.mmObject();
		}
	};
	protected DateSearchChoice closingDate;
	/**
	 * Specifies the closing date of the party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateSearchChoice
	 * DateSearchChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyDataSearchCriteria1
	 * PartyDataSearchCriteria1}</li>
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
	public static final MMMessageAttribute mmClosingDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PartyDataSearchCriteria1.mmObject();
			isDerived = false;
			xmlTag = "ClsgDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClosingDate";
			definition = "Specifies the closing date of the party.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateSearchChoice.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.PartyDataSearchCriteria1
	 * PartyDataSearchCriteria1}</li>
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
			componentContext_lazy = () -> PartyDataSearchCriteria1.mmObject();
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
	protected CSDOrNCB1Choice cSDOrNCB;
	/**
	 * Identifies the central security depository or the national central bank
	 * which initially created the party reference data.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.CSDOrNCB1Choice
	 * CSDOrNCB1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyDataSearchCriteria1
	 * PartyDataSearchCriteria1}</li>
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
	 * "Identifies the central security depository or the national central bank which initially created the party reference data."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCSDOrNCB = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> PartyDataSearchCriteria1.mmObject();
			isDerived = false;
			xmlTag = "CSDOrNCB";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CSDOrNCB";
			definition = "Identifies the central security depository or the national central bank which initially created the party reference data.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CSDOrNCB1Choice.mmObject();
		}
	};
	protected BICFIIdentifier identification;
	/**
	 * Unique identification to unambiguously identify the party within the
	 * system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.BICFIIdentifier
	 * BICFIIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyDataSearchCriteria1
	 * PartyDataSearchCriteria1}</li>
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
	 * definition} =
	 * "Unique identification to unambiguously identify the party within the system."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PartyDataSearchCriteria1.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Unique identification to unambiguously identify the party within the system.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> BICFIIdentifier.mmObject();
		}
	};
	protected Max35Text restrictionIdentification;
	/**
	 * Specifies the identification of a restriction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyDataSearchCriteria1
	 * PartyDataSearchCriteria1}</li>
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
	 * definition} = "Specifies the identification of a restriction."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRestrictionIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PartyDataSearchCriteria1.mmObject();
			isDerived = false;
			xmlTag = "RstrctnId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RestrictionIdentification";
			definition = "Specifies the identification of a restriction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected DateAndDateTimeSearchChoice restrictionIssueDate;
	/**
	 * Specifies the date when the restriction for the party has been issued.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTimeSearchChoice
	 * DateAndDateTimeSearchChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyDataSearchCriteria1
	 * PartyDataSearchCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RstrctnIsseDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RestrictionIssueDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the date when the restriction for the party has been issued."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRestrictionIssueDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PartyDataSearchCriteria1.mmObject();
			isDerived = false;
			xmlTag = "RstrctnIsseDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RestrictionIssueDate";
			definition = "Specifies the date when the restriction for the party has been issued.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateAndDateTimeSearchChoice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(PartyDataSearchCriteria1.mmOpeningDate, PartyDataSearchCriteria1.mmClosingDate, PartyDataSearchCriteria1.mmType, PartyDataSearchCriteria1.mmCSDOrNCB,
						PartyDataSearchCriteria1.mmIdentification, PartyDataSearchCriteria1.mmRestrictionIdentification, PartyDataSearchCriteria1.mmRestrictionIssueDate);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "PartyDataSearchCriteria1";
				definition = "Set of search criteria for querying party reference data.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "OpngDt")
	public DateSearchChoice getOpeningDate() {
		return openingDate;
	}

	public void setOpeningDate(DateSearchChoice openingDate) {
		this.openingDate = openingDate;
	}

	@XmlElement(name = "ClsgDt")
	public DateSearchChoice getClosingDate() {
		return closingDate;
	}

	public void setClosingDate(DateSearchChoice closingDate) {
		this.closingDate = closingDate;
	}

	@XmlElement(name = "Tp")
	public SystemPartyType1Code getType() {
		return type;
	}

	public void setType(SystemPartyType1Code type) {
		this.type = type;
	}

	@XmlElement(name = "CSDOrNCB")
	public CSDOrNCB1Choice getCSDOrNCB() {
		return cSDOrNCB;
	}

	public void setCSDOrNCB(CSDOrNCB1Choice cSDOrNCB) {
		this.cSDOrNCB = cSDOrNCB;
	}

	@XmlElement(name = "Id")
	public BICFIIdentifier getIdentification() {
		return identification;
	}

	public void setIdentification(BICFIIdentifier identification) {
		this.identification = identification;
	}

	@XmlElement(name = "RstrctnId")
	public Max35Text getRestrictionIdentification() {
		return restrictionIdentification;
	}

	public void setRestrictionIdentification(Max35Text restrictionIdentification) {
		this.restrictionIdentification = restrictionIdentification;
	}

	@XmlElement(name = "RstrctnIsseDt")
	public DateAndDateTimeSearchChoice getRestrictionIssueDate() {
		return restrictionIssueDate;
	}

	public void setRestrictionIssueDate(DateAndDateTimeSearchChoice restrictionIssueDate) {
		this.restrictionIssueDate = restrictionIssueDate;
	}
}