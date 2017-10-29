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
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.Document;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Identifies a document by a unique identification.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DocumentIdentification9#Identification
 * DocumentIdentification9.Identification}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Document Document}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionEventProcessingStatusAdviceV01#NotificationIdentification
 * CorporateActionEventProcessingStatusAdviceV01.NotificationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionEventProcessingStatusAdviceV02#NotificationIdentification
 * CorporateActionEventProcessingStatusAdviceV02.NotificationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionEventProcessingStatusAdviceV03#NotificationIdentification
 * CorporateActionEventProcessingStatusAdviceV03.NotificationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionEventProcessingStatusAdviceV04#NotificationIdentification
 * CorporateActionEventProcessingStatusAdviceV04.NotificationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestStatusAdviceV01#InstructionCancellationRequestIdentification
 * CorporateActionInstructionCancellationRequestStatusAdviceV01.
 * InstructionCancellationRequestIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestStatusAdviceV02#InstructionCancellationRequestIdentification
 * CorporateActionInstructionCancellationRequestStatusAdviceV02.
 * InstructionCancellationRequestIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestStatusAdviceV03#InstructionCancellationRequestIdentification
 * CorporateActionInstructionCancellationRequestStatusAdviceV03.
 * InstructionCancellationRequestIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestStatusAdviceV04#InstructionCancellationRequestIdentification
 * CorporateActionInstructionCancellationRequestStatusAdviceV04.
 * InstructionCancellationRequestIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatusAdviceV01#InstructionIdentification
 * CorporateActionInstructionStatusAdviceV01.InstructionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatusAdviceV02#InstructionIdentification
 * CorporateActionInstructionStatusAdviceV02.InstructionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatusAdviceV03#InstructionIdentification
 * CorporateActionInstructionStatusAdviceV03.InstructionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatusAdviceV04#InstructionIdentification
 * CorporateActionInstructionStatusAdviceV04.InstructionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV01#InstructionIdentification
 * CorporateActionMovementConfirmationV01.InstructionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV02#InstructionIdentification
 * CorporateActionMovementConfirmationV02.InstructionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV03#InstructionIdentification
 * CorporateActionMovementConfirmationV03.InstructionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV04#InstructionIdentification
 * CorporateActionMovementConfirmationV04.InstructionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV01#InstructionIdentification
 * CorporateActionMovementPreliminaryAdviceV01.InstructionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV02#InstructionIdentification
 * CorporateActionMovementPreliminaryAdviceV02.InstructionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV03#InstructionIdentification
 * CorporateActionMovementPreliminaryAdviceV03.InstructionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV04#InstructionIdentification
 * CorporateActionMovementPreliminaryAdviceV04.InstructionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV01#InstructionIdentification
 * CorporateActionNotificationV01.InstructionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV02#InstructionIdentification
 * CorporateActionNotificationV02.InstructionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV03#InstructionIdentification
 * CorporateActionNotificationV03.InstructionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV04#InstructionIdentification
 * CorporateActionNotificationV04.InstructionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.RegulatoryTransactionReportCancellationRequestV02#PreviousReference
 * RegulatoryTransactionReportCancellationRequestV02.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV05#InstructionIdentification
 * CorporateActionMovementConfirmationV05.InstructionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV05#InstructionIdentification
 * CorporateActionNotificationV05.InstructionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatusAdviceV05#InstructionIdentification
 * CorporateActionInstructionStatusAdviceV05.InstructionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV05#InstructionIdentification
 * CorporateActionMovementPreliminaryAdviceV05.InstructionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV06#InstructionIdentification
 * CorporateActionMovementConfirmationV06.InstructionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestStatusAdviceV05#InstructionCancellationRequestIdentification
 * CorporateActionInstructionCancellationRequestStatusAdviceV05.
 * InstructionCancellationRequestIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatusAdviceV06#InstructionIdentification
 * CorporateActionInstructionStatusAdviceV06.InstructionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV06#InstructionIdentification
 * CorporateActionMovementPreliminaryAdviceV06.InstructionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestStatusAdviceV06#InstructionCancellationRequestIdentification
 * CorporateActionInstructionCancellationRequestStatusAdviceV06.
 * InstructionCancellationRequestIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV07#InstructionIdentification
 * CorporateActionMovementPreliminaryAdviceV07.InstructionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV07#InstructionIdentification
 * CorporateActionMovementConfirmationV07.InstructionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV06#InstructionIdentification
 * CorporateActionNotificationV06.InstructionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionEventProcessingStatusAdviceV05#NotificationIdentification
 * CorporateActionEventProcessingStatusAdviceV05.NotificationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatusAdviceV07#InstructionIdentification
 * CorporateActionInstructionStatusAdviceV07.InstructionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV07#InstructionIdentification
 * CorporateActionNotificationV07.InstructionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV08#InstructionIdentification
 * CorporateActionMovementConfirmationV08.InstructionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionEventProcessingStatusAdviceV06#NotificationIdentification
 * CorporateActionEventProcessingStatusAdviceV06.NotificationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV08#InstructionIdentification
 * CorporateActionMovementPreliminaryAdviceV08.InstructionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestStatusAdviceV07#InstructionCancellationRequestIdentification
 * CorporateActionInstructionCancellationRequestStatusAdviceV07.
 * InstructionCancellationRequestIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatusAdviceV08#InstructionIdentification
 * CorporateActionInstructionStatusAdviceV08.InstructionIdentification}</li>
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
 * "DocumentIdentification9"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Identifies a document by a unique identification."</li>
 * </ul>
 */
public class DocumentIdentification9 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Identifies the document.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#Identification
	 * GenericIdentification.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification9
	 * DocumentIdentification9}</li>
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
	 * definition} = "Identifies the document."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute Identification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> DocumentIdentification9.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.GenericIdentification.Identification;
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Identifies the document.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DocumentIdentification9.Identification);
				trace_lazy = () -> Document.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.seev.CorporateActionEventProcessingStatusAdviceV01.NotificationIdentification,
						com.tools20022.repository.area.seev.CorporateActionEventProcessingStatusAdviceV02.NotificationIdentification,
						com.tools20022.repository.area.seev.CorporateActionEventProcessingStatusAdviceV03.NotificationIdentification,
						com.tools20022.repository.area.seev.CorporateActionEventProcessingStatusAdviceV04.NotificationIdentification,
						com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestStatusAdviceV01.InstructionCancellationRequestIdentification,
						com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestStatusAdviceV02.InstructionCancellationRequestIdentification,
						com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestStatusAdviceV03.InstructionCancellationRequestIdentification,
						com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestStatusAdviceV04.InstructionCancellationRequestIdentification,
						com.tools20022.repository.area.seev.CorporateActionInstructionStatusAdviceV01.InstructionIdentification, com.tools20022.repository.area.seev.CorporateActionInstructionStatusAdviceV02.InstructionIdentification,
						com.tools20022.repository.area.seev.CorporateActionInstructionStatusAdviceV03.InstructionIdentification, com.tools20022.repository.area.seev.CorporateActionInstructionStatusAdviceV04.InstructionIdentification,
						com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV01.InstructionIdentification, com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV02.InstructionIdentification,
						com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV03.InstructionIdentification, com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV04.InstructionIdentification,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV01.InstructionIdentification, com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV02.InstructionIdentification,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV03.InstructionIdentification, com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV04.InstructionIdentification,
						com.tools20022.repository.area.seev.CorporateActionNotificationV01.InstructionIdentification, com.tools20022.repository.area.seev.CorporateActionNotificationV02.InstructionIdentification,
						com.tools20022.repository.area.seev.CorporateActionNotificationV03.InstructionIdentification, com.tools20022.repository.area.seev.CorporateActionNotificationV04.InstructionIdentification,
						com.tools20022.repository.area.auth.RegulatoryTransactionReportCancellationRequestV02.PreviousReference, com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV05.InstructionIdentification,
						com.tools20022.repository.area.seev.CorporateActionNotificationV05.InstructionIdentification, com.tools20022.repository.area.seev.CorporateActionInstructionStatusAdviceV05.InstructionIdentification,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV05.InstructionIdentification, com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV06.InstructionIdentification,
						com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestStatusAdviceV05.InstructionCancellationRequestIdentification,
						com.tools20022.repository.area.seev.CorporateActionInstructionStatusAdviceV06.InstructionIdentification, com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV06.InstructionIdentification,
						com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestStatusAdviceV06.InstructionCancellationRequestIdentification,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV07.InstructionIdentification, com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV07.InstructionIdentification,
						com.tools20022.repository.area.seev.CorporateActionNotificationV06.InstructionIdentification, com.tools20022.repository.area.seev.CorporateActionEventProcessingStatusAdviceV05.NotificationIdentification,
						com.tools20022.repository.area.seev.CorporateActionInstructionStatusAdviceV07.InstructionIdentification, com.tools20022.repository.area.seev.CorporateActionNotificationV07.InstructionIdentification,
						com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV08.InstructionIdentification, com.tools20022.repository.area.seev.CorporateActionEventProcessingStatusAdviceV06.NotificationIdentification,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV08.InstructionIdentification,
						com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestStatusAdviceV07.InstructionCancellationRequestIdentification,
						com.tools20022.repository.area.seev.CorporateActionInstructionStatusAdviceV08.InstructionIdentification);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "DocumentIdentification9";
				definition = "Identifies a document by a unique identification.";
			}
		});
		return mmObject_lazy.get();
	}
}