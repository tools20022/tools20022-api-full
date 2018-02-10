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
import com.tools20022.repository.choice.GovernanceIdentification1Choice;
import com.tools20022.repository.datatype.ID;
import com.tools20022.repository.entity.GovernanceRules;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies rules governing an undertaking such as a guarantee or standby
 * letter of credit.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GovernanceRules2#mmIdentification
 * GovernanceRules2.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GovernanceRules2#mmRuleIdentification
 * GovernanceRules2.mmRuleIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GovernanceRules2#mmApplicableLaw
 * GovernanceRules2.mmApplicableLaw}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GovernanceRules2#mmJurisdiction
 * GovernanceRules2.mmJurisdiction}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.GovernanceRules
 * GovernanceRules}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "GovernanceRules2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies rules governing an undertaking such as a guarantee or standby letter of credit."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "GovernanceRules2", propOrder = {"identification", "ruleIdentification", "applicableLaw", "jurisdiction"})
public class GovernanceRules2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Id", required = true)
	protected ID identification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ID ID}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.GovernanceRules2
	 * GovernanceRules2}</li>
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
	 * definition} = "Local identification to be used in IDREFs."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.GovernanceRules2.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Local identification to be used in IDREFs.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ID.mmObject();
		}
	};
	@XmlElement(name = "RuleId", required = true)
	protected GovernanceIdentification1Choice ruleIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
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
	 * {@linkplain com.tools20022.repository.msg.GovernanceRules2
	 * GovernanceRules2}</li>
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
	public static final MMMessageAssociationEnd mmRuleIdentification = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> GovernanceRules.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.GovernanceRules2.mmObject();
			isDerived = false;
			xmlTag = "RuleId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RuleIdentification";
			definition = "Identification of the governance rules.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> GovernanceIdentification1Choice.mmObject();
		}
	};
	@XmlElement(name = "AplblLaw")
	protected Location1 applicableLaw;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.GovernanceRules2
	 * GovernanceRules2}</li>
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
			businessElementTrace_lazy = () -> GovernanceRules.mmApplicableLaw;
			componentContext_lazy = () -> com.tools20022.repository.msg.GovernanceRules2.mmObject();
			isDerived = false;
			xmlTag = "AplblLaw";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ApplicableLaw";
			definition = "Law applicable to the undertaking.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Location1.mmObject();
		}
	};
	@XmlElement(name = "Jursdctn")
	protected List<com.tools20022.repository.msg.Location1> jurisdiction;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.GovernanceRules2
	 * GovernanceRules2}</li>
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
			businessElementTrace_lazy = () -> GovernanceRules.mmJurisdiction;
			componentContext_lazy = () -> com.tools20022.repository.msg.GovernanceRules2.mmObject();
			isDerived = false;
			xmlTag = "Jursdctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.GovernanceRules2.mmIdentification, com.tools20022.repository.msg.GovernanceRules2.mmRuleIdentification,
						com.tools20022.repository.msg.GovernanceRules2.mmApplicableLaw, com.tools20022.repository.msg.GovernanceRules2.mmJurisdiction);
				trace_lazy = () -> GovernanceRules.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "GovernanceRules2";
				definition = "Specifies rules governing an undertaking such as a guarantee or standby letter of credit.";
			}
		});
		return mmObject_lazy.get();
	}

	public ID getIdentification() {
		return identification;
	}

	public GovernanceRules2 setIdentification(ID identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public GovernanceIdentification1Choice getRuleIdentification() {
		return ruleIdentification;
	}

	public GovernanceRules2 setRuleIdentification(GovernanceIdentification1Choice ruleIdentification) {
		this.ruleIdentification = Objects.requireNonNull(ruleIdentification);
		return this;
	}

	public Optional<Location1> getApplicableLaw() {
		return applicableLaw == null ? Optional.empty() : Optional.of(applicableLaw);
	}

	public GovernanceRules2 setApplicableLaw(com.tools20022.repository.msg.Location1 applicableLaw) {
		this.applicableLaw = applicableLaw;
		return this;
	}

	public List<Location1> getJurisdiction() {
		return jurisdiction == null ? jurisdiction = new ArrayList<>() : jurisdiction;
	}

	public GovernanceRules2 setJurisdiction(List<com.tools20022.repository.msg.Location1> jurisdiction) {
		this.jurisdiction = Objects.requireNonNull(jurisdiction);
		return this;
	}
}