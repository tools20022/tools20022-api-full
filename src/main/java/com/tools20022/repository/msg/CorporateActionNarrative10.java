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
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.entity.CorporateActionEvent;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * "CorporateActionNarrative10"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides additional information such as the information conditions."</li>
 * </ul>
 */
public class CorporateActionNarrative10 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected List<Max350Text> additionalText;
	/**
	 * Provides additional information or specifies in more detail the content
	 * of a message. This field may only be used when the information to be
	 * transmitted, cannot be coded.
	 * <p>
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
			componentContext_lazy = () -> CorporateActionNarrative10.mmObject();
			isDerived = false;
			xmlTag = "AddtlTxt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalText";
			definition = "Provides additional information or specifies in more detail the content of a message. This field may only be used when the information to be transmitted, cannot be coded.";
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	protected List<Max350Text> partyContactNarrative;
	/**
	 * Provides additional information regarding the party, for example, the
	 * contact unit or person responsible for the transaction identified in the
	 * message.
	 * <p>
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
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Role.mmContactPersonRole;
			componentContext_lazy = () -> CorporateActionNarrative10.mmObject();
			isDerived = false;
			xmlTag = "PtyCtctNrrtv";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.seev.CorporateActionEventProcessingStatusAdviceV01.mmAdditionalInformation,
						com.tools20022.repository.area.seev.CorporateActionEventProcessingStatusAdviceV02.mmAdditionalInformation, com.tools20022.repository.area.seev.CorporateActionEventProcessingStatusAdviceV03.mmAdditionalInformation,
						com.tools20022.repository.area.seev.CorporateActionEventProcessingStatusAdviceV04.mmAdditionalInformation,
						com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestStatusAdviceV01.mmAdditionalInformation,
						com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestStatusAdviceV02.mmAdditionalInformation,
						com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestStatusAdviceV03.mmAdditionalInformation,
						com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestStatusAdviceV04.mmAdditionalInformation,
						com.tools20022.repository.area.seev.CorporateActionInstructionStatusAdviceV01.mmAdditionalInformation, com.tools20022.repository.area.seev.CorporateActionInstructionStatusAdviceV02.mmAdditionalInformation,
						com.tools20022.repository.area.seev.CorporateActionInstructionStatusAdviceV03.mmAdditionalInformation, com.tools20022.repository.area.seev.CorporateActionInstructionStatusAdviceV04.mmAdditionalInformation,
						com.tools20022.repository.area.seev.CorporateActionInstructionStatusAdviceV05.mmAdditionalInformation,
						com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestStatusAdviceV05.mmAdditionalInformation,
						com.tools20022.repository.area.seev.CorporateActionInstructionStatusAdviceV06.mmAdditionalInformation,
						com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestStatusAdviceV06.mmAdditionalInformation,
						com.tools20022.repository.area.seev.CorporateActionEventProcessingStatusAdviceV05.mmAdditionalInformation, com.tools20022.repository.area.seev.CorporateActionInstructionStatusAdviceV07.mmAdditionalInformation,
						com.tools20022.repository.area.seev.CorporateActionEventProcessingStatusAdviceV06.mmAdditionalInformation,
						com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestStatusAdviceV07.mmAdditionalInformation,
						com.tools20022.repository.area.seev.CorporateActionInstructionStatusAdviceV08.mmAdditionalInformation);
				trace_lazy = () -> CorporateActionEvent.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CorporateActionNarrative10";
				definition = "Provides additional information such as the information conditions.";
			}
		});
		return mmObject_lazy.get();
	}

	public List<Max350Text> getAdditionalText() {
		return additionalText;
	}

	public void setAdditionalText(List<Max350Text> additionalText) {
		this.additionalText = additionalText;
	}

	public List<Max350Text> getPartyContactNarrative() {
		return partyContactNarrative;
	}

	public void setPartyContactNarrative(List<Max350Text> partyContactNarrative) {
		this.partyContactNarrative = partyContactNarrative;
	}
}