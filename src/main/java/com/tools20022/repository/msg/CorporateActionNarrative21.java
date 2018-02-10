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
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.seev.CorporateActionInstructionV03;
import com.tools20022.repository.area.seev.CorporateActionInstructionV04;
import com.tools20022.repository.area.seev.CorporateActionInstructionV05;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.entity.CorporateActionEvent;
import com.tools20022.repository.entity.Role;
import com.tools20022.repository.GeneratedRepository;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides additional information such as the registration details.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative21#mmAdditionalText
 * CorporateActionNarrative21.mmAdditionalText}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative21#mmNarrativeVersion
 * CorporateActionNarrative21.mmNarrativeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative21#mmRegistrationDetails
 * CorporateActionNarrative21.mmRegistrationDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative21#mmPartyContactNarrative
 * CorporateActionNarrative21.mmPartyContactNarrative}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative21#mmDisclaimer
 * CorporateActionNarrative21.mmDisclaimer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative21#mmBasketOrIndexInformation
 * CorporateActionNarrative21.mmBasketOrIndexInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative21#mmCertificationBreakdown
 * CorporateActionNarrative21.mmCertificationBreakdown}</li>
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
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionV03#mmAdditionalInformation
 * CorporateActionInstructionV03.mmAdditionalInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionV04#mmAdditionalInformation
 * CorporateActionInstructionV04.mmAdditionalInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionV05#mmAdditionalInformation
 * CorporateActionInstructionV05.mmAdditionalInformation}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionNarrative21"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides additional information such as the registration details."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionNarrative30
 * CorporateActionNarrative30}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative7
 * CorporateActionNarrative7}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionNarrative21", propOrder = {"additionalText", "narrativeVersion", "registrationDetails", "partyContactNarrative", "disclaimer", "basketOrIndexInformation", "certificationBreakdown"})
public class CorporateActionNarrative21 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "AddtlTxt")
	protected List<Max350Text> additionalText;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative21
	 * CorporateActionNarrative21}</li>
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
	public static final MMMessageAttribute mmAdditionalText = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionNarrative21.mmObject();
			isDerived = false;
			xmlTag = "AddtlTxt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":70E::ADTX"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalText";
			definition = "Provides additional information or specifies in more detail the content of a message. This field may only be used when the information to be transmitted, cannot be coded.";
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	@XmlElement(name = "NrrtvVrsn")
	protected List<Max350Text> narrativeVersion;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative21
	 * CorporateActionNarrative21}</li>
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
	public static final MMMessageAttribute mmNarrativeVersion = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionNarrative21.mmObject();
			isDerived = false;
			xmlTag = "NrrtvVrsn";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":70E::TXNR"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NarrativeVersion";
			definition = "Provides information that can be ignored for automated processing; - reiteration of information that has been included within structured fields of this message, - or narrative information not needed for automatic processing.";
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	@XmlElement(name = "RegnDtls")
	protected List<Max350Text> registrationDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmRegistrationDetails
	 * CorporateActionEvent.mmRegistrationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative21
	 * CorporateActionNarrative21}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RegnDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :70E::REGI</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegistrationDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides information required for the registration."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative30#mmRegistrationDetails
	 * CorporateActionNarrative30.mmRegistrationDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRegistrationDetails = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmRegistrationDetails;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionNarrative21.mmObject();
			isDerived = false;
			xmlTag = "RegnDtls";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":70E::REGI"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegistrationDetails";
			definition = "Provides information required for the registration.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionNarrative30.mmRegistrationDetails);
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	@XmlElement(name = "PtyCtctNrrtv")
	protected List<Max350Text> partyContactNarrative;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Role#mmContactPersonRole
	 * Role.mmContactPersonRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative21
	 * CorporateActionNarrative21}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PtyCtctNrrtv"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :70E::PACO</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative30#mmPartyContactNarrative
	 * CorporateActionNarrative30.mmPartyContactNarrative}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPartyContactNarrative = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Role.mmContactPersonRole;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionNarrative21.mmObject();
			isDerived = false;
			xmlTag = "PtyCtctNrrtv";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":70E::PACO"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartyContactNarrative";
			definition = "Provides additional information regarding the party, for example, the contact unit or person responsible for the transaction identified in the message.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionNarrative30.mmPartyContactNarrative);
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	@XmlElement(name = "Dsclmr")
	protected List<Max350Text> disclaimer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative21
	 * CorporateActionNarrative21}</li>
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
	 * "Disclaimer relative to the information provided in the message. It may be ignored for automated processing. No information about the instruction itself is allowed here."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDisclaimer = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionNarrative21.mmObject();
			isDerived = false;
			xmlTag = "Dsclmr";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":70E::DISC"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Disclaimer";
			definition = "Disclaimer relative to the information provided in the message. It may be ignored for automated processing. No information about the instruction itself is allowed here.";
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	@XmlElement(name = "BsktOrIndxInf")
	protected List<Max350Text> basketOrIndexInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmBasketOrIndexInformation
	 * CorporateActionEvent.mmBasketOrIndexInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative21
	 * CorporateActionNarrative21}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BsktOrIndxInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :70E::BAIN</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionNarrative21.mmObject();
			isDerived = false;
			xmlTag = "BsktOrIndxInf";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":70E::BAIN"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BasketOrIndexInformation";
			definition = "Provides additional information on the basket or index underlying a security, for example a warrant.";
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	@XmlElement(name = "CertfctnBrkdwn")
	protected List<Max350Text> certificationBreakdown;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative21
	 * CorporateActionNarrative21}</li>
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
	 * "Provides information required for the certification/breakdown."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative30#mmCertificationBreakdown
	 * CorporateActionNarrative30.mmCertificationBreakdown}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCertificationBreakdown = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionNarrative21.mmObject();
			isDerived = false;
			xmlTag = "CertfctnBrkdwn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificationBreakdown";
			definition = "Provides information required for the certification/breakdown.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionNarrative30.mmCertificationBreakdown);
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionNarrative21.mmAdditionalText, com.tools20022.repository.msg.CorporateActionNarrative21.mmNarrativeVersion,
						com.tools20022.repository.msg.CorporateActionNarrative21.mmRegistrationDetails, com.tools20022.repository.msg.CorporateActionNarrative21.mmPartyContactNarrative,
						com.tools20022.repository.msg.CorporateActionNarrative21.mmDisclaimer, com.tools20022.repository.msg.CorporateActionNarrative21.mmBasketOrIndexInformation,
						com.tools20022.repository.msg.CorporateActionNarrative21.mmCertificationBreakdown);
				messageBuildingBlock_lazy = () -> Arrays.asList(CorporateActionInstructionV03.mmAdditionalInformation, CorporateActionInstructionV04.mmAdditionalInformation, CorporateActionInstructionV05.mmAdditionalInformation);
				trace_lazy = () -> CorporateActionEvent.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionNarrative21";
				definition = "Provides additional information such as the registration details.";
				nextVersions_lazy = () -> Arrays.asList(CorporateActionNarrative30.mmObject());
				previousVersion_lazy = () -> CorporateActionNarrative7.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public List<Max350Text> getAdditionalText() {
		return additionalText == null ? additionalText = new ArrayList<>() : additionalText;
	}

	public CorporateActionNarrative21 setAdditionalText(List<Max350Text> additionalText) {
		this.additionalText = Objects.requireNonNull(additionalText);
		return this;
	}

	public List<Max350Text> getNarrativeVersion() {
		return narrativeVersion == null ? narrativeVersion = new ArrayList<>() : narrativeVersion;
	}

	public CorporateActionNarrative21 setNarrativeVersion(List<Max350Text> narrativeVersion) {
		this.narrativeVersion = Objects.requireNonNull(narrativeVersion);
		return this;
	}

	public List<Max350Text> getRegistrationDetails() {
		return registrationDetails == null ? registrationDetails = new ArrayList<>() : registrationDetails;
	}

	public CorporateActionNarrative21 setRegistrationDetails(List<Max350Text> registrationDetails) {
		this.registrationDetails = Objects.requireNonNull(registrationDetails);
		return this;
	}

	public List<Max350Text> getPartyContactNarrative() {
		return partyContactNarrative == null ? partyContactNarrative = new ArrayList<>() : partyContactNarrative;
	}

	public CorporateActionNarrative21 setPartyContactNarrative(List<Max350Text> partyContactNarrative) {
		this.partyContactNarrative = Objects.requireNonNull(partyContactNarrative);
		return this;
	}

	public List<Max350Text> getDisclaimer() {
		return disclaimer == null ? disclaimer = new ArrayList<>() : disclaimer;
	}

	public CorporateActionNarrative21 setDisclaimer(List<Max350Text> disclaimer) {
		this.disclaimer = Objects.requireNonNull(disclaimer);
		return this;
	}

	public List<Max350Text> getBasketOrIndexInformation() {
		return basketOrIndexInformation == null ? basketOrIndexInformation = new ArrayList<>() : basketOrIndexInformation;
	}

	public CorporateActionNarrative21 setBasketOrIndexInformation(List<Max350Text> basketOrIndexInformation) {
		this.basketOrIndexInformation = Objects.requireNonNull(basketOrIndexInformation);
		return this;
	}

	public List<Max350Text> getCertificationBreakdown() {
		return certificationBreakdown == null ? certificationBreakdown = new ArrayList<>() : certificationBreakdown;
	}

	public CorporateActionNarrative21 setCertificationBreakdown(List<Max350Text> certificationBreakdown) {
		this.certificationBreakdown = Objects.requireNonNull(certificationBreakdown);
		return this;
	}
}