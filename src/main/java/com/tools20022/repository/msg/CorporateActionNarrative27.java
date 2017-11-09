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
import com.tools20022.repository.area.seev.CorporateActionNotificationV06;
import com.tools20022.repository.area.seev.CorporateActionNotificationV07;
import com.tools20022.repository.entity.BiddingConditions;
import com.tools20022.repository.entity.CorporateActionEvent;
import com.tools20022.repository.entity.Role;
import com.tools20022.repository.entity.Tax;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative27#mmAdditionalText
 * CorporateActionNarrative27.mmAdditionalText}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative27#mmNarrativeVersion
 * CorporateActionNarrative27.mmNarrativeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative27#mmInformationConditions
 * CorporateActionNarrative27.mmInformationConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative27#mmInformationToComplyWith
 * CorporateActionNarrative27.mmInformationToComplyWith}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative27#mmTaxationConditions
 * CorporateActionNarrative27.mmTaxationConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative27#mmDisclaimer
 * CorporateActionNarrative27.mmDisclaimer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative27#mmPartyContactNarrative
 * CorporateActionNarrative27.mmPartyContactNarrative}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative27#mmRegistrationDetails
 * CorporateActionNarrative27.mmRegistrationDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative27#mmBasketOrIndexInformation
 * CorporateActionNarrative27.mmBasketOrIndexInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative27#mmCertificationBreakdown
 * CorporateActionNarrative27.mmCertificationBreakdown}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CorporateActionEvent
 * CorporateActionEvent}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV06#mmAdditionalInformation
 * CorporateActionNotificationV06.mmAdditionalInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV07#mmAdditionalInformation
 * CorporateActionNotificationV07.mmAdditionalInformation}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionNarrative27"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides additional information such as the taxation conditions."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative11
 * CorporateActionNarrative11}</li>
 * </ul>
 */
public class CorporateActionNarrative27 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected UpdatedAdditionalInformation8 additionalText;
	/**
	 * Provides additional information or specifies in more detail the content
	 * of a message. This field may only be used when the information to be
	 * transmitted, cannot be coded.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation8
	 * UpdatedAdditionalInformation8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative27
	 * CorporateActionNarrative27}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlTxt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalText"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides additional information or specifies in more detail the content of a message.  This field may only be used when the information to be transmitted, cannot be coded."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative11#mmAdditionalText
	 * CorporateActionNarrative11.mmAdditionalText}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAdditionalText = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CorporateActionNarrative27.mmObject();
			isDerived = false;
			xmlTag = "AddtlTxt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalText";
			definition = "Provides additional information or specifies in more detail the content of a message.  This field may only be used when the information to be transmitted, cannot be coded.";
			previousVersion_lazy = () -> CorporateActionNarrative11.mmAdditionalText;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.UpdatedAdditionalInformation8.mmObject();
		}
	};
	protected UpdatedAdditionalInformation8 narrativeVersion;
	/**
	 * Provides information that can be ignored for automated processing; -
	 * reiteration of information that has been included within structured
	 * fields, - or narrative information not needed for automatic processing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation8
	 * UpdatedAdditionalInformation8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative27
	 * CorporateActionNarrative27}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NrrtvVrsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NarrativeVersion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information that can be ignored for automated processing; - reiteration of information that has been included within structured fields, - or narrative information not needed for automatic processing."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative11#mmNarrativeVersion
	 * CorporateActionNarrative11.mmNarrativeVersion}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmNarrativeVersion = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CorporateActionNarrative27.mmObject();
			isDerived = false;
			xmlTag = "NrrtvVrsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NarrativeVersion";
			definition = "Provides information that can be ignored for automated processing; - reiteration of information that has been included within structured fields, - or narrative information not needed for automatic processing.";
			previousVersion_lazy = () -> CorporateActionNarrative11.mmNarrativeVersion;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.UpdatedAdditionalInformation8.mmObject();
		}
	};
	protected UpdatedAdditionalInformation8 informationConditions;
	/**
	 * Provides conditional information related to the event, for example, an
	 * offer is subject to 50 percent acceptance, the offeror allows the
	 * securities holder to set some conditions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation8
	 * UpdatedAdditionalInformation8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmInformationConditions
	 * CorporateActionEvent.mmInformationConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative27
	 * CorporateActionNarrative27}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InfConds"</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative11#mmInformationConditions
	 * CorporateActionNarrative11.mmInformationConditions}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInformationConditions = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmInformationConditions;
			componentContext_lazy = () -> CorporateActionNarrative27.mmObject();
			isDerived = false;
			xmlTag = "InfConds";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InformationConditions";
			definition = "Provides conditional information related to the event, for example, an offer is subject to 50 percent acceptance, the offeror allows the securities holder to set some conditions.";
			previousVersion_lazy = () -> CorporateActionNarrative11.mmInformationConditions;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.UpdatedAdditionalInformation8.mmObject();
		}
	};
	protected UpdatedAdditionalInformation8 informationToComplyWith;
	/**
	 * Provides information conditions to the account owner that are to be
	 * complied with, for example, not open to US/Canadian residents, Qualified
	 * Institutional Buyers (QIB) or SIL (Sophisticated Investor Letter) to be
	 * provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation8
	 * UpdatedAdditionalInformation8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmInformationToComplyWith
	 * BiddingConditions.mmInformationToComplyWith}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative27
	 * CorporateActionNarrative27}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InfToCmplyWth"</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative11#mmInformationToComplyWith
	 * CorporateActionNarrative11.mmInformationToComplyWith}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInformationToComplyWith = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> BiddingConditions.mmInformationToComplyWith;
			componentContext_lazy = () -> CorporateActionNarrative27.mmObject();
			isDerived = false;
			xmlTag = "InfToCmplyWth";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InformationToComplyWith";
			definition = "Provides information conditions to the account owner that are to be complied with, for example, not open to US/Canadian residents, Qualified Institutional Buyers (QIB) or SIL (Sophisticated Investor Letter)  to be provided.";
			previousVersion_lazy = () -> CorporateActionNarrative11.mmInformationToComplyWith;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.UpdatedAdditionalInformation8.mmObject();
		}
	};
	protected UpdatedAdditionalInformation8 taxationConditions;
	/**
	 * Provides taxation conditions that cannot be included within the
	 * structured fields of this message and has not been mentioned in the
	 * Service Level Agreement (SLA).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation8
	 * UpdatedAdditionalInformation8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmTaxationConditions
	 * Tax.mmTaxationConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative27
	 * CorporateActionNarrative27}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxtnConds"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxationConditions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides taxation conditions that cannot be included within the structured fields of this message and has not been mentioned in the Service Level Agreement (SLA)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative11#mmTaxationConditions
	 * CorporateActionNarrative11.mmTaxationConditions}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTaxationConditions = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Tax.mmTaxationConditions;
			componentContext_lazy = () -> CorporateActionNarrative27.mmObject();
			isDerived = false;
			xmlTag = "TaxtnConds";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxationConditions";
			definition = "Provides taxation conditions that cannot be included within the structured fields of this message and has not been mentioned in the Service Level Agreement (SLA).";
			previousVersion_lazy = () -> CorporateActionNarrative11.mmTaxationConditions;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.UpdatedAdditionalInformation8.mmObject();
		}
	};
	protected UpdatedAdditionalInformation8 disclaimer;
	/**
	 * Provides a disclaimer relative to the information provided in the
	 * message. It may be ignored for automated processing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation8
	 * UpdatedAdditionalInformation8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative27
	 * CorporateActionNarrative27}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Dsclmr"</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative11#mmDisclaimer
	 * CorporateActionNarrative11.mmDisclaimer}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDisclaimer = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CorporateActionNarrative27.mmObject();
			isDerived = false;
			xmlTag = "Dsclmr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Disclaimer";
			definition = "Provides a disclaimer relative to the information provided in the message. It may be ignored for automated processing.";
			previousVersion_lazy = () -> CorporateActionNarrative11.mmDisclaimer;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.UpdatedAdditionalInformation8.mmObject();
		}
	};
	protected UpdatedAdditionalInformation8 partyContactNarrative;
	/**
	 * Provides additional information regarding the party, for example, the
	 * contact unit or person responsible for the transaction identified in the
	 * message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation8
	 * UpdatedAdditionalInformation8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Role#mmContactPersonRole
	 * Role.mmContactPersonRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative27
	 * CorporateActionNarrative27}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PtyCtctNrrtv"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartyContactNarrative"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides additional information regarding the party, for example, the contact unit or person responsible for the transaction identified in the message."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative11#mmPartyContactNarrative
	 * CorporateActionNarrative11.mmPartyContactNarrative}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPartyContactNarrative = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Role.mmContactPersonRole;
			componentContext_lazy = () -> CorporateActionNarrative27.mmObject();
			isDerived = false;
			xmlTag = "PtyCtctNrrtv";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartyContactNarrative";
			definition = "Provides additional information regarding the party, for example, the contact unit or person responsible for the transaction identified in the message.";
			previousVersion_lazy = () -> CorporateActionNarrative11.mmPartyContactNarrative;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.UpdatedAdditionalInformation8.mmObject();
		}
	};
	protected UpdatedAdditionalInformation8 registrationDetails;
	/**
	 * Provides information required for the registration.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation8
	 * UpdatedAdditionalInformation8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmRegistrationDetails
	 * CorporateActionEvent.mmRegistrationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative27
	 * CorporateActionNarrative27}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RegnDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegistrationDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides information required for the registration."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative11#mmRegistrationDetails
	 * CorporateActionNarrative11.mmRegistrationDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRegistrationDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmRegistrationDetails;
			componentContext_lazy = () -> CorporateActionNarrative27.mmObject();
			isDerived = false;
			xmlTag = "RegnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegistrationDetails";
			definition = "Provides information required for the registration.";
			previousVersion_lazy = () -> CorporateActionNarrative11.mmRegistrationDetails;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.UpdatedAdditionalInformation8.mmObject();
		}
	};
	protected UpdatedAdditionalInformation8 basketOrIndexInformation;
	/**
	 * Provides additional information on the basket or index underlying a
	 * security, for example a warrant.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation8
	 * UpdatedAdditionalInformation8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmBasketOrIndexInformation
	 * CorporateActionEvent.mmBasketOrIndexInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative27
	 * CorporateActionNarrative27}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BsktOrIndxInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BasketOrIndexInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides additional information on the basket or index underlying a security, for example a warrant."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative11#mmBasketOrIndexInformation
	 * CorporateActionNarrative11.mmBasketOrIndexInformation}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmBasketOrIndexInformation = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmBasketOrIndexInformation;
			componentContext_lazy = () -> CorporateActionNarrative27.mmObject();
			isDerived = false;
			xmlTag = "BsktOrIndxInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BasketOrIndexInformation";
			definition = "Provides additional information on the basket or index underlying a security, for example a warrant.";
			previousVersion_lazy = () -> CorporateActionNarrative11.mmBasketOrIndexInformation;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.UpdatedAdditionalInformation8.mmObject();
		}
	};
	protected UpdatedAdditionalInformation8 certificationBreakdown;
	/**
	 * Provides additional information about the type of certification/breakdown
	 * required.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation8
	 * UpdatedAdditionalInformation8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative27
	 * CorporateActionNarrative27}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CertfctnBrkdwn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificationBreakdown"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides additional information about the type of certification/breakdown required."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCertificationBreakdown = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionNarrative27.mmObject();
			isDerived = false;
			xmlTag = "CertfctnBrkdwn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificationBreakdown";
			definition = "Provides additional information about the type of certification/breakdown required.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.UpdatedAdditionalInformation8.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CorporateActionNarrative27.mmAdditionalText, CorporateActionNarrative27.mmNarrativeVersion, CorporateActionNarrative27.mmInformationConditions,
						CorporateActionNarrative27.mmInformationToComplyWith, CorporateActionNarrative27.mmTaxationConditions, CorporateActionNarrative27.mmDisclaimer, CorporateActionNarrative27.mmPartyContactNarrative,
						CorporateActionNarrative27.mmRegistrationDetails, CorporateActionNarrative27.mmBasketOrIndexInformation, CorporateActionNarrative27.mmCertificationBreakdown);
				messageBuildingBlock_lazy = () -> Arrays.asList(CorporateActionNotificationV06.mmAdditionalInformation, CorporateActionNotificationV07.mmAdditionalInformation);
				trace_lazy = () -> CorporateActionEvent.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionNarrative27";
				definition = "Provides additional information such as the taxation conditions.";
				previousVersion_lazy = () -> CorporateActionNarrative11.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public UpdatedAdditionalInformation8 getAdditionalText() {
		return additionalText;
	}

	public void setAdditionalText(com.tools20022.repository.msg.UpdatedAdditionalInformation8 additionalText) {
		this.additionalText = additionalText;
	}

	public UpdatedAdditionalInformation8 getNarrativeVersion() {
		return narrativeVersion;
	}

	public void setNarrativeVersion(com.tools20022.repository.msg.UpdatedAdditionalInformation8 narrativeVersion) {
		this.narrativeVersion = narrativeVersion;
	}

	public UpdatedAdditionalInformation8 getInformationConditions() {
		return informationConditions;
	}

	public void setInformationConditions(com.tools20022.repository.msg.UpdatedAdditionalInformation8 informationConditions) {
		this.informationConditions = informationConditions;
	}

	public UpdatedAdditionalInformation8 getInformationToComplyWith() {
		return informationToComplyWith;
	}

	public void setInformationToComplyWith(com.tools20022.repository.msg.UpdatedAdditionalInformation8 informationToComplyWith) {
		this.informationToComplyWith = informationToComplyWith;
	}

	public UpdatedAdditionalInformation8 getTaxationConditions() {
		return taxationConditions;
	}

	public void setTaxationConditions(com.tools20022.repository.msg.UpdatedAdditionalInformation8 taxationConditions) {
		this.taxationConditions = taxationConditions;
	}

	public UpdatedAdditionalInformation8 getDisclaimer() {
		return disclaimer;
	}

	public void setDisclaimer(com.tools20022.repository.msg.UpdatedAdditionalInformation8 disclaimer) {
		this.disclaimer = disclaimer;
	}

	public UpdatedAdditionalInformation8 getPartyContactNarrative() {
		return partyContactNarrative;
	}

	public void setPartyContactNarrative(com.tools20022.repository.msg.UpdatedAdditionalInformation8 partyContactNarrative) {
		this.partyContactNarrative = partyContactNarrative;
	}

	public UpdatedAdditionalInformation8 getRegistrationDetails() {
		return registrationDetails;
	}

	public void setRegistrationDetails(com.tools20022.repository.msg.UpdatedAdditionalInformation8 registrationDetails) {
		this.registrationDetails = registrationDetails;
	}

	public UpdatedAdditionalInformation8 getBasketOrIndexInformation() {
		return basketOrIndexInformation;
	}

	public void setBasketOrIndexInformation(com.tools20022.repository.msg.UpdatedAdditionalInformation8 basketOrIndexInformation) {
		this.basketOrIndexInformation = basketOrIndexInformation;
	}

	public UpdatedAdditionalInformation8 getCertificationBreakdown() {
		return certificationBreakdown;
	}

	public void setCertificationBreakdown(com.tools20022.repository.msg.UpdatedAdditionalInformation8 certificationBreakdown) {
		this.certificationBreakdown = certificationBreakdown;
	}
}