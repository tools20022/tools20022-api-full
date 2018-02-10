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
import com.tools20022.repository.choice.InvestorRestrictionType3Choice;
import com.tools20022.repository.choice.InvestorType3Choice;
import com.tools20022.repository.choice.LegalRestrictions5Choice;
import com.tools20022.repository.choice.SecurityRestrictionType2Choice;
import com.tools20022.repository.GeneratedRepository;
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
 * {@linkplain com.tools20022.repository.msg.SecurityRestriction2#mmEffectivePeriod
 * SecurityRestriction2.mmEffectivePeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityRestriction2#mmRestrictionType
 * SecurityRestriction2.mmRestrictionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityRestriction2#mmLegalRestrictionType
 * SecurityRestriction2.mmLegalRestrictionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityRestriction2#mmInvestorRestrictionType
 * SecurityRestriction2.mmInvestorRestrictionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityRestriction2#mmInvestorType
 * SecurityRestriction2.mmInvestorType}</li>
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
 * "SecurityRestriction2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Restrictions applicable to the security."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.SecurityRestriction1
 * SecurityRestriction1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SecurityRestriction2", propOrder = {"effectivePeriod", "restrictionType", "legalRestrictionType", "investorRestrictionType", "investorType"})
public class SecurityRestriction2 {

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
	 * {@linkplain com.tools20022.repository.msg.SecurityRestriction2
	 * SecurityRestriction2}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecurityRestriction1#mmEffectivePeriod
	 * SecurityRestriction1.mmEffectivePeriod}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEffectivePeriod = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecurityRestriction2.mmObject();
			isDerived = false;
			xmlTag = "FctvPrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EffectivePeriod";
			definition = "Period during which the restriction applies.";
			previousVersion_lazy = () -> SecurityRestriction1.mmEffectivePeriod;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.DateTimePeriodDetails1.mmObject();
		}
	};
	@XmlElement(name = "RstrctnTp")
	protected SecurityRestrictionType2Choice restrictionType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.SecurityRestrictionType2Choice
	 * SecurityRestrictionType2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecurityRestriction2
	 * SecurityRestriction2}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecurityRestriction1#mmRestrictionType
	 * SecurityRestriction1.mmRestrictionType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRestrictionType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecurityRestriction2.mmObject();
			isDerived = false;
			xmlTag = "RstrctnTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RestrictionType";
			definition = "Type of the restriction, for example, selling restriction, buying restriction, placing restriction.";
			previousVersion_lazy = () -> SecurityRestriction1.mmRestrictionType;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SecurityRestrictionType2Choice.mmObject();
		}
	};
	@XmlElement(name = "LglRstrctnTp")
	protected LegalRestrictions5Choice legalRestrictionType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.LegalRestrictions5Choice
	 * LegalRestrictions5Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecurityRestriction2
	 * SecurityRestriction2}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecurityRestriction1#mmLegalRestrictionType
	 * SecurityRestriction1.mmLegalRestrictionType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLegalRestrictionType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecurityRestriction2.mmObject();
			isDerived = false;
			xmlTag = "LglRstrctnTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegalRestrictionType";
			definition = "Specifies the regulatory restrictions applicable to a security.";
			previousVersion_lazy = () -> SecurityRestriction1.mmLegalRestrictionType;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> LegalRestrictions5Choice.mmObject();
		}
	};
	@XmlElement(name = "InvstrRstrctnTp")
	protected List<InvestorRestrictionType3Choice> investorRestrictionType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.InvestorRestrictionType3Choice
	 * InvestorRestrictionType3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecurityRestriction2
	 * SecurityRestriction2}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecurityRestriction1#mmInvestorRestrictionType
	 * SecurityRestriction1.mmInvestorRestrictionType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInvestorRestrictionType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecurityRestriction2.mmObject();
			isDerived = false;
			xmlTag = "InvstrRstrctnTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestorRestrictionType";
			definition = "Specifies whether the restriction to be applied is relevant for citizen, resident, country.";
			previousVersion_lazy = () -> SecurityRestriction1.mmInvestorRestrictionType;
			minOccurs = 0;
			complexType_lazy = () -> InvestorRestrictionType3Choice.mmObject();
		}
	};
	@XmlElement(name = "InvstrTp")
	protected List<InvestorType3Choice> investorType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.InvestorType3Choice
	 * InvestorType3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecurityRestriction2
	 * SecurityRestriction2}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecurityRestriction1#mmInvestorType
	 * SecurityRestriction1.mmInvestorType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInvestorType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecurityRestriction2.mmObject();
			isDerived = false;
			xmlTag = "InvstrTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestorType";
			definition = "Type of investor that is allowed to hold the security.";
			previousVersion_lazy = () -> SecurityRestriction1.mmInvestorType;
			minOccurs = 0;
			complexType_lazy = () -> InvestorType3Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecurityRestriction2.mmEffectivePeriod, com.tools20022.repository.msg.SecurityRestriction2.mmRestrictionType,
						com.tools20022.repository.msg.SecurityRestriction2.mmLegalRestrictionType, com.tools20022.repository.msg.SecurityRestriction2.mmInvestorRestrictionType,
						com.tools20022.repository.msg.SecurityRestriction2.mmInvestorType);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "SecurityRestriction2";
				definition = "Restrictions applicable to the security.";
				previousVersion_lazy = () -> SecurityRestriction1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<DateTimePeriodDetails1> getEffectivePeriod() {
		return effectivePeriod == null ? Optional.empty() : Optional.of(effectivePeriod);
	}

	public SecurityRestriction2 setEffectivePeriod(com.tools20022.repository.msg.DateTimePeriodDetails1 effectivePeriod) {
		this.effectivePeriod = effectivePeriod;
		return this;
	}

	public Optional<SecurityRestrictionType2Choice> getRestrictionType() {
		return restrictionType == null ? Optional.empty() : Optional.of(restrictionType);
	}

	public SecurityRestriction2 setRestrictionType(SecurityRestrictionType2Choice restrictionType) {
		this.restrictionType = restrictionType;
		return this;
	}

	public Optional<LegalRestrictions5Choice> getLegalRestrictionType() {
		return legalRestrictionType == null ? Optional.empty() : Optional.of(legalRestrictionType);
	}

	public SecurityRestriction2 setLegalRestrictionType(LegalRestrictions5Choice legalRestrictionType) {
		this.legalRestrictionType = legalRestrictionType;
		return this;
	}

	public List<InvestorRestrictionType3Choice> getInvestorRestrictionType() {
		return investorRestrictionType == null ? investorRestrictionType = new ArrayList<>() : investorRestrictionType;
	}

	public SecurityRestriction2 setInvestorRestrictionType(List<InvestorRestrictionType3Choice> investorRestrictionType) {
		this.investorRestrictionType = Objects.requireNonNull(investorRestrictionType);
		return this;
	}

	public List<InvestorType3Choice> getInvestorType() {
		return investorType == null ? investorType = new ArrayList<>() : investorType;
	}

	public SecurityRestriction2 setInvestorType(List<InvestorType3Choice> investorType) {
		this.investorType = Objects.requireNonNull(investorType);
		return this;
	}
}