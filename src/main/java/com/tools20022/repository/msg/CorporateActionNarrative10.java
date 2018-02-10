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
import com.tools20022.repository.area.seev.*;
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
 * Provides additional information such as the information conditions.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative10#mmAdditionalText
 * CorporateActionNarrative10.mmAdditionalText}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative10#mmPartyContactNarrative
 * CorporateActionNarrative10.mmPartyContactNarrative}</li>
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
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionEventProcessingStatusAdviceV01#mmAdditionalInformation
 * CorporateActionEventProcessingStatusAdviceV01.mmAdditionalInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionEventProcessingStatusAdviceV02#mmAdditionalInformation
 * CorporateActionEventProcessingStatusAdviceV02.mmAdditionalInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionEventProcessingStatusAdviceV03#mmAdditionalInformation
 * CorporateActionEventProcessingStatusAdviceV03.mmAdditionalInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionEventProcessingStatusAdviceV04#mmAdditionalInformation
 * CorporateActionEventProcessingStatusAdviceV04.mmAdditionalInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestStatusAdviceV01#mmAdditionalInformation
 * CorporateActionInstructionCancellationRequestStatusAdviceV01.
 * mmAdditionalInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestStatusAdviceV02#mmAdditionalInformation
 * CorporateActionInstructionCancellationRequestStatusAdviceV02.
 * mmAdditionalInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestStatusAdviceV03#mmAdditionalInformation
 * CorporateActionInstructionCancellationRequestStatusAdviceV03.
 * mmAdditionalInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestStatusAdviceV04#mmAdditionalInformation
 * CorporateActionInstructionCancellationRequestStatusAdviceV04.
 * mmAdditionalInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatusAdviceV01#mmAdditionalInformation
 * CorporateActionInstructionStatusAdviceV01.mmAdditionalInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatusAdviceV02#mmAdditionalInformation
 * CorporateActionInstructionStatusAdviceV02.mmAdditionalInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatusAdviceV03#mmAdditionalInformation
 * CorporateActionInstructionStatusAdviceV03.mmAdditionalInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatusAdviceV04#mmAdditionalInformation
 * CorporateActionInstructionStatusAdviceV04.mmAdditionalInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatusAdviceV05#mmAdditionalInformation
 * CorporateActionInstructionStatusAdviceV05.mmAdditionalInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestStatusAdviceV05#mmAdditionalInformation
 * CorporateActionInstructionCancellationRequestStatusAdviceV05.
 * mmAdditionalInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatusAdviceV06#mmAdditionalInformation
 * CorporateActionInstructionStatusAdviceV06.mmAdditionalInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestStatusAdviceV06#mmAdditionalInformation
 * CorporateActionInstructionCancellationRequestStatusAdviceV06.
 * mmAdditionalInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionEventProcessingStatusAdviceV05#mmAdditionalInformation
 * CorporateActionEventProcessingStatusAdviceV05.mmAdditionalInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatusAdviceV07#mmAdditionalInformation
 * CorporateActionInstructionStatusAdviceV07.mmAdditionalInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionEventProcessingStatusAdviceV06#mmAdditionalInformation
 * CorporateActionEventProcessingStatusAdviceV06.mmAdditionalInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestStatusAdviceV07#mmAdditionalInformation
 * CorporateActionInstructionCancellationRequestStatusAdviceV07.
 * mmAdditionalInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatusAdviceV08#mmAdditionalInformation
 * CorporateActionInstructionStatusAdviceV08.mmAdditionalInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatusAdviceV09#mmAdditionalInformation
 * CorporateActionInstructionStatusAdviceV09.mmAdditionalInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestStatusAdviceV08#mmAdditionalInformation
 * CorporateActionInstructionCancellationRequestStatusAdviceV08.
 * mmAdditionalInformation}</li>
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
 * "CorporateActionNarrative10"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides additional information such as the information conditions."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionNarrative10", propOrder = {"additionalText", "partyContactNarrative"})
public class CorporateActionNarrative10 {

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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative10
	 * CorporateActionNarrative10}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionNarrative10.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative10
	 * CorporateActionNarrative10}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmPartyContactNarrative = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Role.mmContactPersonRole;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionNarrative10.mmObject();
			isDerived = false;
			xmlTag = "PtyCtctNrrtv";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":70E::PACO"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartyContactNarrative";
			definition = "Provides additional information regarding the party, for example, the contact unit or person responsible for the transaction identified in the message.";
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionNarrative10.mmAdditionalText, com.tools20022.repository.msg.CorporateActionNarrative10.mmPartyContactNarrative);
				messageBuildingBlock_lazy = () -> Arrays.asList(CorporateActionEventProcessingStatusAdviceV01.mmAdditionalInformation, CorporateActionEventProcessingStatusAdviceV02.mmAdditionalInformation,
						CorporateActionEventProcessingStatusAdviceV03.mmAdditionalInformation, CorporateActionEventProcessingStatusAdviceV04.mmAdditionalInformation,
						CorporateActionInstructionCancellationRequestStatusAdviceV01.mmAdditionalInformation, CorporateActionInstructionCancellationRequestStatusAdviceV02.mmAdditionalInformation,
						CorporateActionInstructionCancellationRequestStatusAdviceV03.mmAdditionalInformation, CorporateActionInstructionCancellationRequestStatusAdviceV04.mmAdditionalInformation,
						CorporateActionInstructionStatusAdviceV01.mmAdditionalInformation, CorporateActionInstructionStatusAdviceV02.mmAdditionalInformation, CorporateActionInstructionStatusAdviceV03.mmAdditionalInformation,
						CorporateActionInstructionStatusAdviceV04.mmAdditionalInformation, CorporateActionInstructionStatusAdviceV05.mmAdditionalInformation,
						CorporateActionInstructionCancellationRequestStatusAdviceV05.mmAdditionalInformation, CorporateActionInstructionStatusAdviceV06.mmAdditionalInformation,
						CorporateActionInstructionCancellationRequestStatusAdviceV06.mmAdditionalInformation, CorporateActionEventProcessingStatusAdviceV05.mmAdditionalInformation,
						CorporateActionInstructionStatusAdviceV07.mmAdditionalInformation, CorporateActionEventProcessingStatusAdviceV06.mmAdditionalInformation,
						CorporateActionInstructionCancellationRequestStatusAdviceV07.mmAdditionalInformation, CorporateActionInstructionStatusAdviceV08.mmAdditionalInformation,
						CorporateActionInstructionStatusAdviceV09.mmAdditionalInformation, CorporateActionInstructionCancellationRequestStatusAdviceV08.mmAdditionalInformation);
				trace_lazy = () -> CorporateActionEvent.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionNarrative10";
				definition = "Provides additional information such as the information conditions.";
			}
		});
		return mmObject_lazy.get();
	}

	public List<Max350Text> getAdditionalText() {
		return additionalText == null ? additionalText = new ArrayList<>() : additionalText;
	}

	public CorporateActionNarrative10 setAdditionalText(List<Max350Text> additionalText) {
		this.additionalText = Objects.requireNonNull(additionalText);
		return this;
	}

	public List<Max350Text> getPartyContactNarrative() {
		return partyContactNarrative == null ? partyContactNarrative = new ArrayList<>() : partyContactNarrative;
	}

	public CorporateActionNarrative10 setPartyContactNarrative(List<Max350Text> partyContactNarrative) {
		this.partyContactNarrative = Objects.requireNonNull(partyContactNarrative);
		return this;
	}
}