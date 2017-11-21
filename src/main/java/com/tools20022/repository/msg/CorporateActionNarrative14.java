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
import com.tools20022.repository.datatype.RestrictedFINXMax350Text;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
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
 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative14#mmDeclarationDetails
 * CorporateActionNarrative14.mmDeclarationDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative14#mmAdditionalText
 * CorporateActionNarrative14.mmAdditionalText}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative14#mmNarrativeVersion
 * CorporateActionNarrative14.mmNarrativeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative14#mmRegistrationDetails
 * CorporateActionNarrative14.mmRegistrationDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative14#mmInformationConditions
 * CorporateActionNarrative14.mmInformationConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative14#mmInformationToComplyWith
 * CorporateActionNarrative14.mmInformationToComplyWith}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative14#mmPartyContactNarrative
 * CorporateActionNarrative14.mmPartyContactNarrative}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative14#mmTaxationConditions
 * CorporateActionNarrative14.mmTaxationConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative14#mmBasketOrIndexInformation
 * CorporateActionNarrative14.mmBasketOrIndexInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CorporateActionEvent
 * CorporateActionEvent}</li>
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
 * "CorporateActionNarrative14"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides additional information such as the taxation conditions."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CorporateActionNarrative14", propOrder = {"declarationDetails", "additionalText", "narrativeVersion", "registrationDetails", "informationConditions", "informationToComplyWith", "partyContactNarrative",
		"taxationConditions", "basketOrIndexInformation"})
public class CorporateActionNarrative14 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected List<RestrictedFINXMax350Text> declarationDetails;
	/**
	 * Provides declaration details narrative relative to the financial
	 * instrument, for example, beneficial ownership.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINXMax350Text
	 * RestrictedFINXMax350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmDeclarationDetails
	 * Security.mmDeclarationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative14
	 * CorporateActionNarrative14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DclrtnDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeclarationDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides declaration details narrative relative to the financial instrument, for example, beneficial ownership."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDeclarationDetails = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Security.mmDeclarationDetails;
			componentContext_lazy = () -> CorporateActionNarrative14.mmObject();
			isDerived = false;
			xmlTag = "DclrtnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeclarationDetails";
			definition = "Provides declaration details narrative relative to the financial instrument, for example, beneficial ownership.";
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINXMax350Text.mmObject();
		}
	};
	protected List<RestrictedFINXMax350Text> additionalText;
	/**
	 * Provides additional information or specifies in more detail the content
	 * of a message. This field may only be used when the information to be
	 * transmitted, cannot be coded.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINXMax350Text
	 * RestrictedFINXMax350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative14
	 * CorporateActionNarrative14}</li>
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
	 * "Provides additional information or specifies in more detail the content of a message. This field may only be used when the information to be transmitted, cannot be coded."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAdditionalText = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionNarrative14.mmObject();
			isDerived = false;
			xmlTag = "AddtlTxt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalText";
			definition = "Provides additional information or specifies in more detail the content of a message. This field may only be used when the information to be transmitted, cannot be coded.";
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINXMax350Text.mmObject();
		}
	};
	protected List<RestrictedFINXMax350Text> narrativeVersion;
	/**
	 * Provides information that can be ignored for automated processing; -
	 * reiteration of information that has been included within structured
	 * fields of this message, - or narrative information not needed for
	 * automatic processing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINXMax350Text
	 * RestrictedFINXMax350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative14
	 * CorporateActionNarrative14}</li>
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
	 * "Provides information that can be ignored for automated processing; - reiteration of information that has been included within structured fields of this message, - or narrative information not needed for automatic processing."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNarrativeVersion = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionNarrative14.mmObject();
			isDerived = false;
			xmlTag = "NrrtvVrsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NarrativeVersion";
			definition = "Provides information that can be ignored for automated processing; - reiteration of information that has been included within structured fields of this message, - or narrative information not needed for automatic processing.";
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINXMax350Text.mmObject();
		}
	};
	protected List<RestrictedFINXMax350Text> registrationDetails;
	/**
	 * Provides information required for the registration.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINXMax350Text
	 * RestrictedFINXMax350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmRegistrationDetails
	 * CorporateActionEvent.mmRegistrationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative14
	 * CorporateActionNarrative14}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmRegistrationDetails = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmRegistrationDetails;
			componentContext_lazy = () -> CorporateActionNarrative14.mmObject();
			isDerived = false;
			xmlTag = "RegnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegistrationDetails";
			definition = "Provides information required for the registration.";
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINXMax350Text.mmObject();
		}
	};
	protected List<RestrictedFINXMax350Text> informationConditions;
	/**
	 * Provides conditional information related to the event, for example, an
	 * offer is subject to 50 percent acceptance, the offeror allows the
	 * securities holder to set some conditions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINXMax350Text
	 * RestrictedFINXMax350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmInformationConditions
	 * CorporateActionEvent.mmInformationConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative14
	 * CorporateActionNarrative14}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmInformationConditions = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmInformationConditions;
			componentContext_lazy = () -> CorporateActionNarrative14.mmObject();
			isDerived = false;
			xmlTag = "InfConds";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InformationConditions";
			definition = "Provides conditional information related to the event, for example, an offer is subject to 50 percent acceptance, the offeror allows the securities holder to set some conditions.";
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINXMax350Text.mmObject();
		}
	};
	protected List<RestrictedFINXMax350Text> informationToComplyWith;
	/**
	 * Provides information conditions to the account owner that are to be
	 * complied with, for example, not open to US/Canadian residents, Qualified
	 * Institutional Buyers (QIB) or SIL (Sophisticated Investor Letter) to be
	 * provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINXMax350Text
	 * RestrictedFINXMax350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmInformationToComplyWith
	 * BiddingConditions.mmInformationToComplyWith}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative14
	 * CorporateActionNarrative14}</li>
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
	 * "Provides information conditions to the account owner that are to be complied with, for example, not open to US/Canadian residents, Qualified Institutional Buyers (QIB) or SIL (Sophisticated Investor Letter) to be provided."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInformationToComplyWith = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> BiddingConditions.mmInformationToComplyWith;
			componentContext_lazy = () -> CorporateActionNarrative14.mmObject();
			isDerived = false;
			xmlTag = "InfToCmplyWth";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InformationToComplyWith";
			definition = "Provides information conditions to the account owner that are to be complied with, for example, not open to US/Canadian residents, Qualified Institutional Buyers (QIB) or SIL (Sophisticated Investor Letter) to be provided.";
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINXMax350Text.mmObject();
		}
	};
	protected List<RestrictedFINXMax350Text> partyContactNarrative;
	/**
	 * Provides additional information regarding the party, for example, the
	 * contact unit or person responsible for the transaction identified in the
	 * message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINXMax350Text
	 * RestrictedFINXMax350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Role#mmContactPersonRole
	 * Role.mmContactPersonRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative14
	 * CorporateActionNarrative14}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmPartyContactNarrative = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Role.mmContactPersonRole;
			componentContext_lazy = () -> CorporateActionNarrative14.mmObject();
			isDerived = false;
			xmlTag = "PtyCtctNrrtv";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartyContactNarrative";
			definition = "Provides additional information regarding the party, for example, the contact unit or person responsible for the transaction identified in the message.";
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINXMax350Text.mmObject();
		}
	};
	protected List<RestrictedFINXMax350Text> taxationConditions;
	/**
	 * Provides taxation conditions that cannot be included within the
	 * structured fields of this message and has not been mentioned in the
	 * Service Level Agreement (SLA)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINXMax350Text
	 * RestrictedFINXMax350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmTaxationConditions
	 * Tax.mmTaxationConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative14
	 * CorporateActionNarrative14}</li>
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
	 * "Provides taxation conditions that cannot be included within the structured fields of this message and has not been mentioned in the Service Level Agreement (SLA)"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTaxationConditions = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Tax.mmTaxationConditions;
			componentContext_lazy = () -> CorporateActionNarrative14.mmObject();
			isDerived = false;
			xmlTag = "TaxtnConds";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxationConditions";
			definition = "Provides taxation conditions that cannot be included within the structured fields of this message and has not been mentioned in the Service Level Agreement (SLA)";
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINXMax350Text.mmObject();
		}
	};
	protected List<RestrictedFINXMax350Text> basketOrIndexInformation;
	/**
	 * Provides additional information on the basket or index underlying a
	 * security, for example a warrant.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINXMax350Text
	 * RestrictedFINXMax350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmBasketOrIndexInformation
	 * CorporateActionEvent.mmBasketOrIndexInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative14
	 * CorporateActionNarrative14}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmBasketOrIndexInformation = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmBasketOrIndexInformation;
			componentContext_lazy = () -> CorporateActionNarrative14.mmObject();
			isDerived = false;
			xmlTag = "BsktOrIndxInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BasketOrIndexInformation";
			definition = "Provides additional information on the basket or index underlying a security, for example a warrant.";
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINXMax350Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CorporateActionNarrative14.mmDeclarationDetails, CorporateActionNarrative14.mmAdditionalText, CorporateActionNarrative14.mmNarrativeVersion,
						CorporateActionNarrative14.mmRegistrationDetails, CorporateActionNarrative14.mmInformationConditions, CorporateActionNarrative14.mmInformationToComplyWith, CorporateActionNarrative14.mmPartyContactNarrative,
						CorporateActionNarrative14.mmTaxationConditions, CorporateActionNarrative14.mmBasketOrIndexInformation);
				trace_lazy = () -> CorporateActionEvent.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionNarrative14";
				definition = "Provides additional information such as the taxation conditions.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "DclrtnDtls")
	public List<RestrictedFINXMax350Text> getDeclarationDetails() {
		return declarationDetails;
	}

	public void setDeclarationDetails(List<RestrictedFINXMax350Text> declarationDetails) {
		this.declarationDetails = declarationDetails;
	}

	@XmlElement(name = "AddtlTxt")
	public List<RestrictedFINXMax350Text> getAdditionalText() {
		return additionalText;
	}

	public void setAdditionalText(List<RestrictedFINXMax350Text> additionalText) {
		this.additionalText = additionalText;
	}

	@XmlElement(name = "NrrtvVrsn")
	public List<RestrictedFINXMax350Text> getNarrativeVersion() {
		return narrativeVersion;
	}

	public void setNarrativeVersion(List<RestrictedFINXMax350Text> narrativeVersion) {
		this.narrativeVersion = narrativeVersion;
	}

	@XmlElement(name = "RegnDtls")
	public List<RestrictedFINXMax350Text> getRegistrationDetails() {
		return registrationDetails;
	}

	public void setRegistrationDetails(List<RestrictedFINXMax350Text> registrationDetails) {
		this.registrationDetails = registrationDetails;
	}

	@XmlElement(name = "InfConds")
	public List<RestrictedFINXMax350Text> getInformationConditions() {
		return informationConditions;
	}

	public void setInformationConditions(List<RestrictedFINXMax350Text> informationConditions) {
		this.informationConditions = informationConditions;
	}

	@XmlElement(name = "InfToCmplyWth")
	public List<RestrictedFINXMax350Text> getInformationToComplyWith() {
		return informationToComplyWith;
	}

	public void setInformationToComplyWith(List<RestrictedFINXMax350Text> informationToComplyWith) {
		this.informationToComplyWith = informationToComplyWith;
	}

	@XmlElement(name = "PtyCtctNrrtv")
	public List<RestrictedFINXMax350Text> getPartyContactNarrative() {
		return partyContactNarrative;
	}

	public void setPartyContactNarrative(List<RestrictedFINXMax350Text> partyContactNarrative) {
		this.partyContactNarrative = partyContactNarrative;
	}

	@XmlElement(name = "TaxtnConds")
	public List<RestrictedFINXMax350Text> getTaxationConditions() {
		return taxationConditions;
	}

	public void setTaxationConditions(List<RestrictedFINXMax350Text> taxationConditions) {
		this.taxationConditions = taxationConditions;
	}

	@XmlElement(name = "BsktOrIndxInf")
	public List<RestrictedFINXMax350Text> getBasketOrIndexInformation() {
		return basketOrIndexInformation;
	}

	public void setBasketOrIndexInformation(List<RestrictedFINXMax350Text> basketOrIndexInformation) {
		this.basketOrIndexInformation = basketOrIndexInformation;
	}
}