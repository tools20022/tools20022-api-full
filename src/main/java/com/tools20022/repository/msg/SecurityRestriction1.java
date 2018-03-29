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
import com.tools20022.repository.choice.InvestorRestrictionType2Choice;
import com.tools20022.repository.choice.InvestorType2Choice;
import com.tools20022.repository.choice.LegalRestrictions2Choice;
import com.tools20022.repository.choice.SecurityRestrictionType1Choice;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.DateTimePeriodDetails1;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Restrictions applicable to the security.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityRestriction1#mmEffectivePeriod
 * SecurityRestriction1.mmEffectivePeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityRestriction1#mmRestrictionType
 * SecurityRestriction1.mmRestrictionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityRestriction1#mmLegalRestrictionType
 * SecurityRestriction1.mmLegalRestrictionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityRestriction1#mmInvestorRestrictionType
 * SecurityRestriction1.mmInvestorRestrictionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityRestriction1#mmInvestorType
 * SecurityRestriction1.mmInvestorType}</li>
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
 * "SecurityRestriction1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Restrictions applicable to the security."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.SecurityRestriction2
 * SecurityRestriction2}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SecurityRestriction1", propOrder = {"effectivePeriod", "restrictionType", "legalRestrictionType", "investorRestrictionType", "investorType"})
public class SecurityRestriction1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "FctvPrd")
	protected DateTimePeriodDetails1 effectivePeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DateTimePeriodDetails1
	 * DateTimePeriodDetails1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecurityRestriction1
	 * SecurityRestriction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FctvPrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EffectivePeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Period during which the restriction applies."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityRestriction2#mmEffectivePeriod
	 * SecurityRestriction2.mmEffectivePeriod}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecurityRestriction1, Optional<DateTimePeriodDetails1>> mmEffectivePeriod = new MMMessageAttribute<SecurityRestriction1, Optional<DateTimePeriodDetails1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecurityRestriction1.mmObject();
			isDerived = false;
			xmlTag = "FctvPrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EffectivePeriod";
			definition = "Period during which the restriction applies.";
			nextVersions_lazy = () -> Arrays.asList(SecurityRestriction2.mmEffectivePeriod);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateTimePeriodDetails1.mmObject();
		}

		@Override
		public Optional<DateTimePeriodDetails1> getValue(SecurityRestriction1 obj) {
			return obj.getEffectivePeriod();
		}

		@Override
		public void setValue(SecurityRestriction1 obj, Optional<DateTimePeriodDetails1> value) {
			obj.setEffectivePeriod(value.orElse(null));
		}
	};
	@XmlElement(name = "RstrctnTp")
	protected SecurityRestrictionType1Choice restrictionType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.SecurityRestrictionType1Choice
	 * SecurityRestrictionType1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecurityRestriction1
	 * SecurityRestriction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RstrctnTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RestrictionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Type of the restriction, for example, selling restriction, buying restriction, placing restriction."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityRestriction2#mmRestrictionType
	 * SecurityRestriction2.mmRestrictionType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecurityRestriction1, Optional<SecurityRestrictionType1Choice>> mmRestrictionType = new MMMessageAttribute<SecurityRestriction1, Optional<SecurityRestrictionType1Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecurityRestriction1.mmObject();
			isDerived = false;
			xmlTag = "RstrctnTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RestrictionType";
			definition = "Type of the restriction, for example, selling restriction, buying restriction, placing restriction.";
			nextVersions_lazy = () -> Arrays.asList(SecurityRestriction2.mmRestrictionType);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SecurityRestrictionType1Choice.mmObject();
		}

		@Override
		public Optional<SecurityRestrictionType1Choice> getValue(SecurityRestriction1 obj) {
			return obj.getRestrictionType();
		}

		@Override
		public void setValue(SecurityRestriction1 obj, Optional<SecurityRestrictionType1Choice> value) {
			obj.setRestrictionType(value.orElse(null));
		}
	};
	@XmlElement(name = "LglRstrctnTp")
	protected LegalRestrictions2Choice legalRestrictionType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.LegalRestrictions2Choice
	 * LegalRestrictions2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecurityRestriction1
	 * SecurityRestriction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LglRstrctnTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LegalRestrictionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the regulatory restrictions applicable to a security."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityRestriction2#mmLegalRestrictionType
	 * SecurityRestriction2.mmLegalRestrictionType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecurityRestriction1, Optional<LegalRestrictions2Choice>> mmLegalRestrictionType = new MMMessageAttribute<SecurityRestriction1, Optional<LegalRestrictions2Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecurityRestriction1.mmObject();
			isDerived = false;
			xmlTag = "LglRstrctnTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegalRestrictionType";
			definition = "Specifies the regulatory restrictions applicable to a security.";
			nextVersions_lazy = () -> Arrays.asList(SecurityRestriction2.mmLegalRestrictionType);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> LegalRestrictions2Choice.mmObject();
		}

		@Override
		public Optional<LegalRestrictions2Choice> getValue(SecurityRestriction1 obj) {
			return obj.getLegalRestrictionType();
		}

		@Override
		public void setValue(SecurityRestriction1 obj, Optional<LegalRestrictions2Choice> value) {
			obj.setLegalRestrictionType(value.orElse(null));
		}
	};
	@XmlElement(name = "InvstrRstrctnTp")
	protected List<InvestorRestrictionType2Choice> investorRestrictionType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.InvestorRestrictionType2Choice
	 * InvestorRestrictionType2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecurityRestriction1
	 * SecurityRestriction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InvstrRstrctnTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestorRestrictionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the restriction to be applied is relevant for citizen, resident, country."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityRestriction2#mmInvestorRestrictionType
	 * SecurityRestriction2.mmInvestorRestrictionType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecurityRestriction1, List<InvestorRestrictionType2Choice>> mmInvestorRestrictionType = new MMMessageAttribute<SecurityRestriction1, List<InvestorRestrictionType2Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecurityRestriction1.mmObject();
			isDerived = false;
			xmlTag = "InvstrRstrctnTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestorRestrictionType";
			definition = "Specifies whether the restriction to be applied is relevant for citizen, resident, country.";
			nextVersions_lazy = () -> Arrays.asList(SecurityRestriction2.mmInvestorRestrictionType);
			minOccurs = 0;
			complexType_lazy = () -> InvestorRestrictionType2Choice.mmObject();
		}

		@Override
		public List<InvestorRestrictionType2Choice> getValue(SecurityRestriction1 obj) {
			return obj.getInvestorRestrictionType();
		}

		@Override
		public void setValue(SecurityRestriction1 obj, List<InvestorRestrictionType2Choice> value) {
			obj.setInvestorRestrictionType(value);
		}
	};
	@XmlElement(name = "InvstrTp")
	protected List<InvestorType2Choice> investorType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.InvestorType2Choice
	 * InvestorType2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecurityRestriction1
	 * SecurityRestriction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InvstrTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestorType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of investor that is allowed to hold the security."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityRestriction2#mmInvestorType
	 * SecurityRestriction2.mmInvestorType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecurityRestriction1, List<InvestorType2Choice>> mmInvestorType = new MMMessageAttribute<SecurityRestriction1, List<InvestorType2Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecurityRestriction1.mmObject();
			isDerived = false;
			xmlTag = "InvstrTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestorType";
			definition = "Type of investor that is allowed to hold the security.";
			nextVersions_lazy = () -> Arrays.asList(SecurityRestriction2.mmInvestorType);
			minOccurs = 0;
			complexType_lazy = () -> InvestorType2Choice.mmObject();
		}

		@Override
		public List<InvestorType2Choice> getValue(SecurityRestriction1 obj) {
			return obj.getInvestorType();
		}

		@Override
		public void setValue(SecurityRestriction1 obj, List<InvestorType2Choice> value) {
			obj.setInvestorType(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecurityRestriction1.mmEffectivePeriod, com.tools20022.repository.msg.SecurityRestriction1.mmRestrictionType,
						com.tools20022.repository.msg.SecurityRestriction1.mmLegalRestrictionType, com.tools20022.repository.msg.SecurityRestriction1.mmInvestorRestrictionType,
						com.tools20022.repository.msg.SecurityRestriction1.mmInvestorType);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "SecurityRestriction1";
				definition = "Restrictions applicable to the security.";
				nextVersions_lazy = () -> Arrays.asList(SecurityRestriction2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<DateTimePeriodDetails1> getEffectivePeriod() {
		return effectivePeriod == null ? Optional.empty() : Optional.of(effectivePeriod);
	}

	public SecurityRestriction1 setEffectivePeriod(DateTimePeriodDetails1 effectivePeriod) {
		this.effectivePeriod = effectivePeriod;
		return this;
	}

	public Optional<SecurityRestrictionType1Choice> getRestrictionType() {
		return restrictionType == null ? Optional.empty() : Optional.of(restrictionType);
	}

	public SecurityRestriction1 setRestrictionType(SecurityRestrictionType1Choice restrictionType) {
		this.restrictionType = restrictionType;
		return this;
	}

	public Optional<LegalRestrictions2Choice> getLegalRestrictionType() {
		return legalRestrictionType == null ? Optional.empty() : Optional.of(legalRestrictionType);
	}

	public SecurityRestriction1 setLegalRestrictionType(LegalRestrictions2Choice legalRestrictionType) {
		this.legalRestrictionType = legalRestrictionType;
		return this;
	}

	public List<InvestorRestrictionType2Choice> getInvestorRestrictionType() {
		return investorRestrictionType == null ? investorRestrictionType = new ArrayList<>() : investorRestrictionType;
	}

	public SecurityRestriction1 setInvestorRestrictionType(List<InvestorRestrictionType2Choice> investorRestrictionType) {
		this.investorRestrictionType = Objects.requireNonNull(investorRestrictionType);
		return this;
	}

	public List<InvestorType2Choice> getInvestorType() {
		return investorType == null ? investorType = new ArrayList<>() : investorType;
	}

	public SecurityRestriction1 setInvestorType(List<InvestorType2Choice> investorType) {
		this.investorType = Objects.requireNonNull(investorType);
		return this;
	}
}