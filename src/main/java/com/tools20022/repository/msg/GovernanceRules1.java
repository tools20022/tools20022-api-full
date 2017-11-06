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
import com.tools20022.repository.choice.GovernanceIdentification1Choice;
import com.tools20022.repository.entity.GovernanceRules;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Rules governing an undertaking such as a guarantee or standby letter of
 * credit.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GovernanceRules1#mmRuleIdentification
 * GovernanceRules1.mmRuleIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GovernanceRules1#mmApplicableLaw
 * GovernanceRules1.mmApplicableLaw}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GovernanceRules1#mmJurisdiction
 * GovernanceRules1.mmJurisdiction}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.GovernanceRules
 * GovernanceRules}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "GovernanceRules1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Rules governing an undertaking such as a guarantee or standby letter of credit."
 * </li>
 * </ul>
 */
public class GovernanceRules1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected GovernanceIdentification1Choice ruleIdentification;
	/**
	 * Identification of the governance rules.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.GovernanceIdentification1Choice
	 * GovernanceIdentification1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.GovernanceRules#mmIdentification
	 * GovernanceRules.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.GovernanceRules1
	 * GovernanceRules1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RuleId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RuleIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the governance rules."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRuleIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.GovernanceRules.mmIdentification;
			componentContext_lazy = () -> GovernanceRules1.mmObject();
			isDerived = false;
			xmlTag = "RuleId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RuleIdentification";
			definition = "Identification of the governance rules.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> GovernanceIdentification1Choice.mmObject();
		}
	};
	protected Location1 applicableLaw;
	/**
	 * Law applicable to the undertaking.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Location1 Location1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.GovernanceRules#mmApplicableLaw
	 * GovernanceRules.mmApplicableLaw}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.GovernanceRules1
	 * GovernanceRules1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AplblLaw"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ApplicableLaw"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Law applicable to the undertaking."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmApplicableLaw = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.GovernanceRules.mmApplicableLaw;
			componentContext_lazy = () -> GovernanceRules1.mmObject();
			isDerived = false;
			xmlTag = "AplblLaw";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ApplicableLaw";
			definition = "Law applicable to the undertaking.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Location1.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.Location1> jurisdiction;
	/**
	 * Place at or system under which any dispute related to the undertaking is
	 * to be resolved, such as court or arbitration. This is also known as
	 * 'forum'.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Location1 Location1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.GovernanceRules#mmJurisdiction
	 * GovernanceRules.mmJurisdiction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.GovernanceRules1
	 * GovernanceRules1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Jursdctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Jurisdiction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Place at or system under which any dispute related to the undertaking is to be resolved, such as court or arbitration. This is also known as 'forum'."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmJurisdiction = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.GovernanceRules.mmJurisdiction;
			componentContext_lazy = () -> GovernanceRules1.mmObject();
			isDerived = false;
			xmlTag = "Jursdctn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Jurisdiction";
			definition = "Place at or system under which any dispute related to the undertaking is to be resolved, such as court or arbitration. This is also known as 'forum'.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Location1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.GovernanceRules1.mmRuleIdentification, com.tools20022.repository.msg.GovernanceRules1.mmApplicableLaw,
						com.tools20022.repository.msg.GovernanceRules1.mmJurisdiction);
				trace_lazy = () -> GovernanceRules.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "GovernanceRules1";
				definition = "Rules governing an undertaking such as a guarantee or standby letter of credit.";
			}
		});
		return mmObject_lazy.get();
	}

	public GovernanceIdentification1Choice getRuleIdentification() {
		return ruleIdentification;
	}

	public void setRuleIdentification(GovernanceIdentification1Choice ruleIdentification) {
		this.ruleIdentification = ruleIdentification;
	}

	public Location1 getApplicableLaw() {
		return applicableLaw;
	}

	public void setApplicableLaw(com.tools20022.repository.msg.Location1 applicableLaw) {
		this.applicableLaw = applicableLaw;
	}

	public List<Location1> getJurisdiction() {
		return jurisdiction;
	}

	public void setJurisdiction(List<com.tools20022.repository.msg.Location1> jurisdiction) {
		this.jurisdiction = jurisdiction;
	}
}