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
import java.util.Optional;
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PartyDataSearchCriteria1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Set of search criteria for querying party reference data."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.PartyDataSearchCriteria2
 * PartyDataSearchCriteria2}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PartyDataSearchCriteria1", propOrder = {"openingDate", "closingDate", "type", "cSDOrNCB", "identification", "restrictionIdentification", "restrictionIssueDate"})
public class PartyDataSearchCriteria1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "OpngDt")
	protected DateSearchChoice openingDate;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyDataSearchCriteria2#mmOpeningDate
	 * PartyDataSearchCriteria2.mmOpeningDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PartyDataSearchCriteria1, Optional<DateSearchChoice>> mmOpeningDate = new MMMessageAttribute<PartyDataSearchCriteria1, Optional<DateSearchChoice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PartyDataSearchCriteria1.mmObject();
			isDerived = false;
			xmlTag = "OpngDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OpeningDate";
			definition = "Specifies the opening date of the party.";
			nextVersions_lazy = () -> Arrays.asList(PartyDataSearchCriteria2.mmOpeningDate);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateSearchChoice.mmObject();
		}

		@Override
		public Optional<DateSearchChoice> getValue(PartyDataSearchCriteria1 obj) {
			return obj.getOpeningDate();
		}

		@Override
		public void setValue(PartyDataSearchCriteria1 obj, Optional<DateSearchChoice> value) {
			obj.setOpeningDate(value.orElse(null));
		}
	};
	@XmlElement(name = "ClsgDt")
	protected DateSearchChoice closingDate;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyDataSearchCriteria2#mmClosingDate
	 * PartyDataSearchCriteria2.mmClosingDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PartyDataSearchCriteria1, Optional<DateSearchChoice>> mmClosingDate = new MMMessageAttribute<PartyDataSearchCriteria1, Optional<DateSearchChoice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PartyDataSearchCriteria1.mmObject();
			isDerived = false;
			xmlTag = "ClsgDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClosingDate";
			definition = "Specifies the closing date of the party.";
			nextVersions_lazy = () -> Arrays.asList(PartyDataSearchCriteria2.mmClosingDate);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateSearchChoice.mmObject();
		}

		@Override
		public Optional<DateSearchChoice> getValue(PartyDataSearchCriteria1 obj) {
			return obj.getClosingDate();
		}

		@Override
		public void setValue(PartyDataSearchCriteria1 obj, Optional<DateSearchChoice> value) {
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyDataSearchCriteria2#mmType
	 * PartyDataSearchCriteria2.mmType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PartyDataSearchCriteria1, Optional<SystemPartyType1Code>> mmType = new MMMessageAttribute<PartyDataSearchCriteria1, Optional<SystemPartyType1Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PartyDataSearchCriteria1.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Specifies the type classification of the party.";
			nextVersions_lazy = () -> Arrays.asList(PartyDataSearchCriteria2.mmType);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> SystemPartyType1Code.mmObject();
		}

		@Override
		public Optional<SystemPartyType1Code> getValue(PartyDataSearchCriteria1 obj) {
			return obj.getType();
		}

		@Override
		public void setValue(PartyDataSearchCriteria1 obj, Optional<SystemPartyType1Code> value) {
			obj.setType(value.orElse(null));
		}
	};
	@XmlElement(name = "CSDOrNCB")
	protected CSDOrNCB1Choice cSDOrNCB;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyDataSearchCriteria2#mmCSDOrNCB
	 * PartyDataSearchCriteria2.mmCSDOrNCB}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PartyDataSearchCriteria1, Optional<CSDOrNCB1Choice>> mmCSDOrNCB = new MMMessageAssociationEnd<PartyDataSearchCriteria1, Optional<CSDOrNCB1Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PartyDataSearchCriteria1.mmObject();
			isDerived = false;
			xmlTag = "CSDOrNCB";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CSDOrNCB";
			definition = "Identifies the central security depository or the national central bank which initially created the party reference data.";
			nextVersions_lazy = () -> Arrays.asList(PartyDataSearchCriteria2.mmCSDOrNCB);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CSDOrNCB1Choice.mmObject();
		}

		@Override
		public Optional<CSDOrNCB1Choice> getValue(PartyDataSearchCriteria1 obj) {
			return obj.getCSDOrNCB();
		}

		@Override
		public void setValue(PartyDataSearchCriteria1 obj, Optional<CSDOrNCB1Choice> value) {
			obj.setCSDOrNCB(value.orElse(null));
		}
	};
	@XmlElement(name = "Id")
	protected BICFIIdentifier identification;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyDataSearchCriteria2#mmIdentification
	 * PartyDataSearchCriteria2.mmIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PartyDataSearchCriteria1, Optional<BICFIIdentifier>> mmIdentification = new MMMessageAttribute<PartyDataSearchCriteria1, Optional<BICFIIdentifier>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PartyDataSearchCriteria1.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Unique identification to unambiguously identify the party within the system.";
			nextVersions_lazy = () -> Arrays.asList(PartyDataSearchCriteria2.mmIdentification);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> BICFIIdentifier.mmObject();
		}

		@Override
		public Optional<BICFIIdentifier> getValue(PartyDataSearchCriteria1 obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(PartyDataSearchCriteria1 obj, Optional<BICFIIdentifier> value) {
			obj.setIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "RstrctnId")
	protected Max35Text restrictionIdentification;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyDataSearchCriteria2#mmRestrictionIdentification
	 * PartyDataSearchCriteria2.mmRestrictionIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PartyDataSearchCriteria1, Optional<Max35Text>> mmRestrictionIdentification = new MMMessageAttribute<PartyDataSearchCriteria1, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PartyDataSearchCriteria1.mmObject();
			isDerived = false;
			xmlTag = "RstrctnId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RestrictionIdentification";
			definition = "Specifies the identification of a restriction.";
			nextVersions_lazy = () -> Arrays.asList(PartyDataSearchCriteria2.mmRestrictionIdentification);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(PartyDataSearchCriteria1 obj) {
			return obj.getRestrictionIdentification();
		}

		@Override
		public void setValue(PartyDataSearchCriteria1 obj, Optional<Max35Text> value) {
			obj.setRestrictionIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "RstrctnIsseDt")
	protected DateAndDateTimeSearchChoice restrictionIssueDate;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyDataSearchCriteria2#mmRestrictionIssueDate
	 * PartyDataSearchCriteria2.mmRestrictionIssueDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PartyDataSearchCriteria1, Optional<DateAndDateTimeSearchChoice>> mmRestrictionIssueDate = new MMMessageAttribute<PartyDataSearchCriteria1, Optional<DateAndDateTimeSearchChoice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PartyDataSearchCriteria1.mmObject();
			isDerived = false;
			xmlTag = "RstrctnIsseDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RestrictionIssueDate";
			definition = "Specifies the date when the restriction for the party has been issued.";
			nextVersions_lazy = () -> Arrays.asList(PartyDataSearchCriteria2.mmRestrictionIssueDate);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateAndDateTimeSearchChoice.mmObject();
		}

		@Override
		public Optional<DateAndDateTimeSearchChoice> getValue(PartyDataSearchCriteria1 obj) {
			return obj.getRestrictionIssueDate();
		}

		@Override
		public void setValue(PartyDataSearchCriteria1 obj, Optional<DateAndDateTimeSearchChoice> value) {
			obj.setRestrictionIssueDate(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PartyDataSearchCriteria1.mmOpeningDate, com.tools20022.repository.msg.PartyDataSearchCriteria1.mmClosingDate,
						com.tools20022.repository.msg.PartyDataSearchCriteria1.mmType, com.tools20022.repository.msg.PartyDataSearchCriteria1.mmCSDOrNCB, com.tools20022.repository.msg.PartyDataSearchCriteria1.mmIdentification,
						com.tools20022.repository.msg.PartyDataSearchCriteria1.mmRestrictionIdentification, com.tools20022.repository.msg.PartyDataSearchCriteria1.mmRestrictionIssueDate);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "PartyDataSearchCriteria1";
				definition = "Set of search criteria for querying party reference data.";
				nextVersions_lazy = () -> Arrays.asList(PartyDataSearchCriteria2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<DateSearchChoice> getOpeningDate() {
		return openingDate == null ? Optional.empty() : Optional.of(openingDate);
	}

	public PartyDataSearchCriteria1 setOpeningDate(DateSearchChoice openingDate) {
		this.openingDate = openingDate;
		return this;
	}

	public Optional<DateSearchChoice> getClosingDate() {
		return closingDate == null ? Optional.empty() : Optional.of(closingDate);
	}

	public PartyDataSearchCriteria1 setClosingDate(DateSearchChoice closingDate) {
		this.closingDate = closingDate;
		return this;
	}

	public Optional<SystemPartyType1Code> getType() {
		return type == null ? Optional.empty() : Optional.of(type);
	}

	public PartyDataSearchCriteria1 setType(SystemPartyType1Code type) {
		this.type = type;
		return this;
	}

	public Optional<CSDOrNCB1Choice> getCSDOrNCB() {
		return cSDOrNCB == null ? Optional.empty() : Optional.of(cSDOrNCB);
	}

	public PartyDataSearchCriteria1 setCSDOrNCB(CSDOrNCB1Choice cSDOrNCB) {
		this.cSDOrNCB = cSDOrNCB;
		return this;
	}

	public Optional<BICFIIdentifier> getIdentification() {
		return identification == null ? Optional.empty() : Optional.of(identification);
	}

	public PartyDataSearchCriteria1 setIdentification(BICFIIdentifier identification) {
		this.identification = identification;
		return this;
	}

	public Optional<Max35Text> getRestrictionIdentification() {
		return restrictionIdentification == null ? Optional.empty() : Optional.of(restrictionIdentification);
	}

	public PartyDataSearchCriteria1 setRestrictionIdentification(Max35Text restrictionIdentification) {
		this.restrictionIdentification = restrictionIdentification;
		return this;
	}

	public Optional<DateAndDateTimeSearchChoice> getRestrictionIssueDate() {
		return restrictionIssueDate == null ? Optional.empty() : Optional.of(restrictionIssueDate);
	}

	public PartyDataSearchCriteria1 setRestrictionIssueDate(DateAndDateTimeSearchChoice restrictionIssueDate) {
		this.restrictionIssueDate = restrictionIssueDate;
		return this;
	}
}