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
import com.tools20022.repository.choice.InvestorRestrictionType2Choice;
import com.tools20022.repository.choice.InvestorType2Choice;
import com.tools20022.repository.choice.LegalRestrictions2Choice;
import com.tools20022.repository.choice.SecurityRestrictionType1Choice;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecurityRestriction1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Restrictions applicable to the security."</li>
 * </ul>
 */
public class SecurityRestriction1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected DateTimePeriodDetails1 effectivePeriod;
	/**
	 * Period during which the restriction applies.
	 * <p>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmEffectivePeriod = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SecurityRestriction1.mmObject();
			isDerived = false;
			xmlTag = "FctvPrd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EffectivePeriod";
			definition = "Period during which the restriction applies.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.DateTimePeriodDetails1.mmObject();
		}
	};
	protected SecurityRestrictionType1Choice restrictionType;
	/**
	 * Type of the restriction, for example, selling restriction, buying
	 * restriction, placing restriction.
	 * <p>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmRestrictionType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SecurityRestriction1.mmObject();
			isDerived = false;
			xmlTag = "RstrctnTp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RestrictionType";
			definition = "Type of the restriction, for example, selling restriction, buying restriction, placing restriction.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SecurityRestrictionType1Choice.mmObject();
		}
	};
	protected LegalRestrictions2Choice legalRestrictionType;
	/**
	 * Specifies the regulatory restrictions applicable to a security.
	 * <p>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmLegalRestrictionType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SecurityRestriction1.mmObject();
			isDerived = false;
			xmlTag = "LglRstrctnTp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegalRestrictionType";
			definition = "Specifies the regulatory restrictions applicable to a security.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> LegalRestrictions2Choice.mmObject();
		}
	};
	protected List<InvestorRestrictionType2Choice> investorRestrictionType;
	/**
	 * Specifies whether the restriction to be applied is relevant for citizen,
	 * resident, country.
	 * <p>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmInvestorRestrictionType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SecurityRestriction1.mmObject();
			isDerived = false;
			xmlTag = "InvstrRstrctnTp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestorRestrictionType";
			definition = "Specifies whether the restriction to be applied is relevant for citizen, resident, country.";
			minOccurs = 0;
			complexType_lazy = () -> InvestorRestrictionType2Choice.mmObject();
		}
	};
	protected List<InvestorType2Choice> investorType;
	/**
	 * Type of investor that is allowed to hold the security.
	 * <p>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmInvestorType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SecurityRestriction1.mmObject();
			isDerived = false;
			xmlTag = "InvstrTp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestorType";
			definition = "Type of investor that is allowed to hold the security.";
			minOccurs = 0;
			complexType_lazy = () -> InvestorType2Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecurityRestriction1.mmEffectivePeriod, com.tools20022.repository.msg.SecurityRestriction1.mmRestrictionType,
						com.tools20022.repository.msg.SecurityRestriction1.mmLegalRestrictionType, com.tools20022.repository.msg.SecurityRestriction1.mmInvestorRestrictionType,
						com.tools20022.repository.msg.SecurityRestriction1.mmInvestorType);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "SecurityRestriction1";
				definition = "Restrictions applicable to the security.";
			}
		});
		return mmObject_lazy.get();
	}

	public DateTimePeriodDetails1 getEffectivePeriod() {
		return effectivePeriod;
	}

	public void setEffectivePeriod(com.tools20022.repository.msg.DateTimePeriodDetails1 effectivePeriod) {
		this.effectivePeriod = effectivePeriod;
	}

	public SecurityRestrictionType1Choice getRestrictionType() {
		return restrictionType;
	}

	public void setRestrictionType(SecurityRestrictionType1Choice restrictionType) {
		this.restrictionType = restrictionType;
	}

	public LegalRestrictions2Choice getLegalRestrictionType() {
		return legalRestrictionType;
	}

	public void setLegalRestrictionType(LegalRestrictions2Choice legalRestrictionType) {
		this.legalRestrictionType = legalRestrictionType;
	}

	public List<InvestorRestrictionType2Choice> getInvestorRestrictionType() {
		return investorRestrictionType;
	}

	public void setInvestorRestrictionType(List<InvestorRestrictionType2Choice> investorRestrictionType) {
		this.investorRestrictionType = investorRestrictionType;
	}

	public List<InvestorType2Choice> getInvestorType() {
		return investorType;
	}

	public void setInvestorType(List<InvestorType2Choice> investorType) {
		this.investorType = investorType;
	}
}