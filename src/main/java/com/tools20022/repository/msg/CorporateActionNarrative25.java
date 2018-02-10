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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.CorporateActionEvent;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides additional information such as the taxation conditions.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative25#mmOfferor
 * CorporateActionNarrative25.mmOfferor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative25#mmNewCompanyName
 * CorporateActionNarrative25.mmNewCompanyName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative25#mmURLAddress
 * CorporateActionNarrative25.mmURLAddress}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CorporateActionEvent
 * CorporateActionEvent}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalInforrmationRule#forCorporateActionNarrative25
 * ConstraintAdditionalInforrmationRule.forCorporateActionNarrative25}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionNarrative25"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides additional information such as the taxation conditions."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionNarrative25", propOrder = {"offeror", "newCompanyName", "uRLAddress"})
public class CorporateActionNarrative25 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Offerr")
	protected List<com.tools20022.repository.msg.UpdatedAdditionalInformation6> offeror;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation6
	 * UpdatedAdditionalInformation6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative25
	 * CorporateActionNarrative25}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Offerr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :70E:OFFO</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Offeror"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the entity making the offer and is different from the issuing company."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOfferor = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionNarrative25.mmObject();
			isDerived = false;
			xmlTag = "Offerr";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":70E:OFFO"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Offeror";
			definition = "Provides the entity making the offer and is different from the issuing company.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.UpdatedAdditionalInformation6.mmObject();
		}
	};
	@XmlElement(name = "NewCpnyNm")
	protected UpdatedAdditionalInformation6 newCompanyName;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation6
	 * UpdatedAdditionalInformation6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative25
	 * CorporateActionNarrative25}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NewCpnyNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :70E:NAME</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewCompanyName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the new name of a company following a name change."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmNewCompanyName = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionNarrative25.mmObject();
			isDerived = false;
			xmlTag = "NewCpnyNm";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":70E:NAME"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewCompanyName";
			definition = "Provides the new name of a company following a name change.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.UpdatedAdditionalInformation6.mmObject();
		}
	};
	@XmlElement(name = "URLAdr")
	protected UpdatedURLlnformation1 uRLAddress;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.UpdatedURLlnformation1
	 * UpdatedURLlnformation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmDocumentationLocation
	 * CorporateActionEvent.mmDocumentationLocation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative25
	 * CorporateActionNarrative25}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "URLAdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :70E::WEBB</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "URLAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the web address published for the event, that is, the address for the Universal Resource Locator (URL), for example, used over the www (HTTP) service."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmURLAddress = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmDocumentationLocation;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionNarrative25.mmObject();
			isDerived = false;
			xmlTag = "URLAdr";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":70E::WEBB"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "URLAddress";
			definition = "Provides the web address published for the event, that is, the address for the Universal Resource Locator (URL), for example, used over the www (HTTP) service.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.UpdatedURLlnformation1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionNarrative25.mmOfferor, com.tools20022.repository.msg.CorporateActionNarrative25.mmNewCompanyName,
						com.tools20022.repository.msg.CorporateActionNarrative25.mmURLAddress);
				trace_lazy = () -> CorporateActionEvent.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalInforrmationRule.forCorporateActionNarrative25);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionNarrative25";
				definition = "Provides additional information such as the taxation conditions.";
			}
		});
		return mmObject_lazy.get();
	}

	public List<UpdatedAdditionalInformation6> getOfferor() {
		return offeror == null ? offeror = new ArrayList<>() : offeror;
	}

	public CorporateActionNarrative25 setOfferor(List<com.tools20022.repository.msg.UpdatedAdditionalInformation6> offeror) {
		this.offeror = Objects.requireNonNull(offeror);
		return this;
	}

	public Optional<UpdatedAdditionalInformation6> getNewCompanyName() {
		return newCompanyName == null ? Optional.empty() : Optional.of(newCompanyName);
	}

	public CorporateActionNarrative25 setNewCompanyName(com.tools20022.repository.msg.UpdatedAdditionalInformation6 newCompanyName) {
		this.newCompanyName = newCompanyName;
		return this;
	}

	public Optional<UpdatedURLlnformation1> getURLAddress() {
		return uRLAddress == null ? Optional.empty() : Optional.of(uRLAddress);
	}

	public CorporateActionNarrative25 setURLAddress(com.tools20022.repository.msg.UpdatedURLlnformation1 uRLAddress) {
		this.uRLAddress = uRLAddress;
		return this;
	}
}