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
import com.tools20022.repository.entity.BiddingConditions;
import com.tools20022.repository.entity.CorporateActionEvent;
import com.tools20022.repository.entity.Security;
import com.tools20022.repository.entity.Tax;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
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
 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative5#mmAdditionalText
 * CorporateActionNarrative5.mmAdditionalText}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative5#mmNarrativeVersion
 * CorporateActionNarrative5.mmNarrativeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative5#mmInformationConditions
 * CorporateActionNarrative5.mmInformationConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative5#mmInformationToComplyWith
 * CorporateActionNarrative5.mmInformationToComplyWith}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative5#mmSecurityRestriction
 * CorporateActionNarrative5.mmSecurityRestriction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative5#mmTaxationConditions
 * CorporateActionNarrative5.mmTaxationConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative5#mmDisclaimer
 * CorporateActionNarrative5.mmDisclaimer}</li>
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
 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalInforrmationRule#forCorporateActionNarrative5
 * ConstraintAdditionalInforrmationRule.forCorporateActionNarrative5}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionNarrative5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides additional information such as the taxation conditions."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionNarrative20
 * CorporateActionNarrative20}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionNarrative5", propOrder = {"additionalText", "narrativeVersion", "informationConditions", "informationToComplyWith", "securityRestriction", "taxationConditions", "disclaimer"})
public class CorporateActionNarrative5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "AddtlTxt")
	protected UpdatedAdditionalInformation3 additionalText;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation3
	 * UpdatedAdditionalInformation3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative5
	 * CorporateActionNarrative5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlTxt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :70E::ADTX</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalText"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides additional information or specifies in more detail the content of a message. This field may only be used when the information to be transmitted, cannot be coded."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAdditionalText = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionNarrative5.mmObject();
			isDerived = false;
			xmlTag = "AddtlTxt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":70E::ADTX"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalText";
			definition = "Provides additional information or specifies in more detail the content of a message. This field may only be used when the information to be transmitted, cannot be coded.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.UpdatedAdditionalInformation3.mmObject();
		}
	};
	@XmlElement(name = "NrrtvVrsn")
	protected UpdatedAdditionalInformation3 narrativeVersion;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation3
	 * UpdatedAdditionalInformation3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative5
	 * CorporateActionNarrative5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NrrtvVrsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :70E::TXNR</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NarrativeVersion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information that can be ignored for automated processing; - reiteration of information that has been included within structured fields of this message, - or narrative information not needed for automatic processing."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmNarrativeVersion = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionNarrative5.mmObject();
			isDerived = false;
			xmlTag = "NrrtvVrsn";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":70E::TXNR"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NarrativeVersion";
			definition = "Provides information that can be ignored for automated processing; - reiteration of information that has been included within structured fields of this message, - or narrative information not needed for automatic processing.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.UpdatedAdditionalInformation3.mmObject();
		}
	};
	@XmlElement(name = "InfConds")
	protected UpdatedAdditionalInformation1 informationConditions;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation1
	 * UpdatedAdditionalInformation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmInformationConditions
	 * CorporateActionEvent.mmInformationConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative5
	 * CorporateActionNarrative5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InfConds"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :70E::INCO</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InformationConditions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides conditional information related to the event, for example, an offer is subject to 50 percent acceptance, the offeror allows the securities holder to set some conditions."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInformationConditions = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmInformationConditions;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionNarrative5.mmObject();
			isDerived = false;
			xmlTag = "InfConds";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":70E::INCO"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InformationConditions";
			definition = "Provides conditional information related to the event, for example, an offer is subject to 50 percent acceptance, the offeror allows the securities holder to set some conditions.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.UpdatedAdditionalInformation1.mmObject();
		}
	};
	@XmlElement(name = "InfToCmplyWth")
	protected UpdatedAdditionalInformation1 informationToComplyWith;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation1
	 * UpdatedAdditionalInformation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmInformationToComplyWith
	 * BiddingConditions.mmInformationToComplyWith}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative5
	 * CorporateActionNarrative5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InfToCmplyWth"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :70E::COMP</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InformationToComplyWith"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information conditions to the account owner that are to be complied with, for example, not open to US/Canadian residents, Qualified Institutional Buyers (QIB) or SIL (Sophisticated Investor Letter)  to be provided."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInformationToComplyWith = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> BiddingConditions.mmInformationToComplyWith;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionNarrative5.mmObject();
			isDerived = false;
			xmlTag = "InfToCmplyWth";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":70E::COMP"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InformationToComplyWith";
			definition = "Provides information conditions to the account owner that are to be complied with, for example, not open to US/Canadian residents, Qualified Institutional Buyers (QIB) or SIL (Sophisticated Investor Letter)  to be provided.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.UpdatedAdditionalInformation1.mmObject();
		}
	};
	@XmlElement(name = "SctyRstrctn")
	protected UpdatedAdditionalInformation1 securityRestriction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation1
	 * UpdatedAdditionalInformation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmRestriction
	 * Security.mmRestriction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative5
	 * CorporateActionNarrative5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctyRstrctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :70E::NSER</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityRestriction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides restriction(s) on securities."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSecurityRestriction = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Security.mmRestriction;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionNarrative5.mmObject();
			isDerived = false;
			xmlTag = "SctyRstrctn";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":70E::NSER"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityRestriction";
			definition = "Provides restriction(s) on securities.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.UpdatedAdditionalInformation1.mmObject();
		}
	};
	@XmlElement(name = "TaxtnConds")
	protected UpdatedAdditionalInformation1 taxationConditions;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation1
	 * UpdatedAdditionalInformation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmTaxationConditions
	 * Tax.mmTaxationConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative5
	 * CorporateActionNarrative5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxtnConds"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :70E::TAXE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxationConditions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides taxation conditions that cannot be included within the structured fields of this message  and has not been mentioned in the Service Level Agreement (SLA)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTaxationConditions = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Tax.mmTaxationConditions;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionNarrative5.mmObject();
			isDerived = false;
			xmlTag = "TaxtnConds";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":70E::TAXE"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxationConditions";
			definition = "Provides taxation conditions that cannot be included within the structured fields of this message  and has not been mentioned in the Service Level Agreement (SLA).";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.UpdatedAdditionalInformation1.mmObject();
		}
	};
	@XmlElement(name = "Dsclmr")
	protected UpdatedAdditionalInformation1 disclaimer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation1
	 * UpdatedAdditionalInformation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative5
	 * CorporateActionNarrative5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Dsclmr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :70E::DISC</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Disclaimer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides a disclaimer relative to the information provided in the message. It may be ignored for automated processing."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDisclaimer = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionNarrative5.mmObject();
			isDerived = false;
			xmlTag = "Dsclmr";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":70E::DISC"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Disclaimer";
			definition = "Provides a disclaimer relative to the information provided in the message. It may be ignored for automated processing.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.UpdatedAdditionalInformation1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionNarrative5.mmAdditionalText, com.tools20022.repository.msg.CorporateActionNarrative5.mmNarrativeVersion,
						com.tools20022.repository.msg.CorporateActionNarrative5.mmInformationConditions, com.tools20022.repository.msg.CorporateActionNarrative5.mmInformationToComplyWith,
						com.tools20022.repository.msg.CorporateActionNarrative5.mmSecurityRestriction, com.tools20022.repository.msg.CorporateActionNarrative5.mmTaxationConditions,
						com.tools20022.repository.msg.CorporateActionNarrative5.mmDisclaimer);
				trace_lazy = () -> CorporateActionEvent.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalInforrmationRule.forCorporateActionNarrative5);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionNarrative5";
				definition = "Provides additional information such as the taxation conditions.";
				nextVersions_lazy = () -> Arrays.asList(CorporateActionNarrative20.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<UpdatedAdditionalInformation3> getAdditionalText() {
		return additionalText == null ? Optional.empty() : Optional.of(additionalText);
	}

	public CorporateActionNarrative5 setAdditionalText(com.tools20022.repository.msg.UpdatedAdditionalInformation3 additionalText) {
		this.additionalText = additionalText;
		return this;
	}

	public Optional<UpdatedAdditionalInformation3> getNarrativeVersion() {
		return narrativeVersion == null ? Optional.empty() : Optional.of(narrativeVersion);
	}

	public CorporateActionNarrative5 setNarrativeVersion(com.tools20022.repository.msg.UpdatedAdditionalInformation3 narrativeVersion) {
		this.narrativeVersion = narrativeVersion;
		return this;
	}

	public Optional<UpdatedAdditionalInformation1> getInformationConditions() {
		return informationConditions == null ? Optional.empty() : Optional.of(informationConditions);
	}

	public CorporateActionNarrative5 setInformationConditions(com.tools20022.repository.msg.UpdatedAdditionalInformation1 informationConditions) {
		this.informationConditions = informationConditions;
		return this;
	}

	public Optional<UpdatedAdditionalInformation1> getInformationToComplyWith() {
		return informationToComplyWith == null ? Optional.empty() : Optional.of(informationToComplyWith);
	}

	public CorporateActionNarrative5 setInformationToComplyWith(com.tools20022.repository.msg.UpdatedAdditionalInformation1 informationToComplyWith) {
		this.informationToComplyWith = informationToComplyWith;
		return this;
	}

	public Optional<UpdatedAdditionalInformation1> getSecurityRestriction() {
		return securityRestriction == null ? Optional.empty() : Optional.of(securityRestriction);
	}

	public CorporateActionNarrative5 setSecurityRestriction(com.tools20022.repository.msg.UpdatedAdditionalInformation1 securityRestriction) {
		this.securityRestriction = securityRestriction;
		return this;
	}

	public Optional<UpdatedAdditionalInformation1> getTaxationConditions() {
		return taxationConditions == null ? Optional.empty() : Optional.of(taxationConditions);
	}

	public CorporateActionNarrative5 setTaxationConditions(com.tools20022.repository.msg.UpdatedAdditionalInformation1 taxationConditions) {
		this.taxationConditions = taxationConditions;
		return this;
	}

	public Optional<UpdatedAdditionalInformation1> getDisclaimer() {
		return disclaimer == null ? Optional.empty() : Optional.of(disclaimer);
	}

	public CorporateActionNarrative5 setDisclaimer(com.tools20022.repository.msg.UpdatedAdditionalInformation1 disclaimer) {
		this.disclaimer = disclaimer;
		return this;
	}
}