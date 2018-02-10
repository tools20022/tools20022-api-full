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
import com.tools20022.repository.area.auth.RegulatoryTransactionReportCancellationRequestV02;
import com.tools20022.repository.area.seev.*;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.Document;
import com.tools20022.repository.entity.GenericIdentification;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

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
 * {@linkplain com.tools20022.repository.msg.DocumentIdentification9#mmIdentification
 * DocumentIdentification9.mmIdentification}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Document Document}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionEventProcessingStatusAdviceV01#mmNotificationIdentification
 * CorporateActionEventProcessingStatusAdviceV01.mmNotificationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionEventProcessingStatusAdviceV02#mmNotificationIdentification
 * CorporateActionEventProcessingStatusAdviceV02.mmNotificationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionEventProcessingStatusAdviceV03#mmNotificationIdentification
 * CorporateActionEventProcessingStatusAdviceV03.mmNotificationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionEventProcessingStatusAdviceV04#mmNotificationIdentification
 * CorporateActionEventProcessingStatusAdviceV04.mmNotificationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestStatusAdviceV01#mmInstructionCancellationRequestIdentification
 * CorporateActionInstructionCancellationRequestStatusAdviceV01.
 * mmInstructionCancellationRequestIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestStatusAdviceV02#mmInstructionCancellationRequestIdentification
 * CorporateActionInstructionCancellationRequestStatusAdviceV02.
 * mmInstructionCancellationRequestIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestStatusAdviceV03#mmInstructionCancellationRequestIdentification
 * CorporateActionInstructionCancellationRequestStatusAdviceV03.
 * mmInstructionCancellationRequestIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestStatusAdviceV04#mmInstructionCancellationRequestIdentification
 * CorporateActionInstructionCancellationRequestStatusAdviceV04.
 * mmInstructionCancellationRequestIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatusAdviceV01#mmInstructionIdentification
 * CorporateActionInstructionStatusAdviceV01.mmInstructionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatusAdviceV02#mmInstructionIdentification
 * CorporateActionInstructionStatusAdviceV02.mmInstructionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatusAdviceV03#mmInstructionIdentification
 * CorporateActionInstructionStatusAdviceV03.mmInstructionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatusAdviceV04#mmInstructionIdentification
 * CorporateActionInstructionStatusAdviceV04.mmInstructionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV01#mmInstructionIdentification
 * CorporateActionMovementConfirmationV01.mmInstructionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV02#mmInstructionIdentification
 * CorporateActionMovementConfirmationV02.mmInstructionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV03#mmInstructionIdentification
 * CorporateActionMovementConfirmationV03.mmInstructionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV04#mmInstructionIdentification
 * CorporateActionMovementConfirmationV04.mmInstructionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV01#mmInstructionIdentification
 * CorporateActionMovementPreliminaryAdviceV01.mmInstructionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV02#mmInstructionIdentification
 * CorporateActionMovementPreliminaryAdviceV02.mmInstructionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV03#mmInstructionIdentification
 * CorporateActionMovementPreliminaryAdviceV03.mmInstructionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV04#mmInstructionIdentification
 * CorporateActionMovementPreliminaryAdviceV04.mmInstructionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV01#mmInstructionIdentification
 * CorporateActionNotificationV01.mmInstructionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV02#mmInstructionIdentification
 * CorporateActionNotificationV02.mmInstructionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV03#mmInstructionIdentification
 * CorporateActionNotificationV03.mmInstructionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV04#mmInstructionIdentification
 * CorporateActionNotificationV04.mmInstructionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.RegulatoryTransactionReportCancellationRequestV02#mmPreviousReference
 * RegulatoryTransactionReportCancellationRequestV02.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV05#mmInstructionIdentification
 * CorporateActionMovementConfirmationV05.mmInstructionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV05#mmInstructionIdentification
 * CorporateActionNotificationV05.mmInstructionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatusAdviceV05#mmInstructionIdentification
 * CorporateActionInstructionStatusAdviceV05.mmInstructionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV05#mmInstructionIdentification
 * CorporateActionMovementPreliminaryAdviceV05.mmInstructionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV06#mmInstructionIdentification
 * CorporateActionMovementConfirmationV06.mmInstructionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestStatusAdviceV05#mmInstructionCancellationRequestIdentification
 * CorporateActionInstructionCancellationRequestStatusAdviceV05.
 * mmInstructionCancellationRequestIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatusAdviceV06#mmInstructionIdentification
 * CorporateActionInstructionStatusAdviceV06.mmInstructionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV06#mmInstructionIdentification
 * CorporateActionMovementPreliminaryAdviceV06.mmInstructionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestStatusAdviceV06#mmInstructionCancellationRequestIdentification
 * CorporateActionInstructionCancellationRequestStatusAdviceV06.
 * mmInstructionCancellationRequestIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV07#mmInstructionIdentification
 * CorporateActionMovementPreliminaryAdviceV07.mmInstructionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV07#mmInstructionIdentification
 * CorporateActionMovementConfirmationV07.mmInstructionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV06#mmInstructionIdentification
 * CorporateActionNotificationV06.mmInstructionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionEventProcessingStatusAdviceV05#mmNotificationIdentification
 * CorporateActionEventProcessingStatusAdviceV05.mmNotificationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatusAdviceV07#mmInstructionIdentification
 * CorporateActionInstructionStatusAdviceV07.mmInstructionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV07#mmInstructionIdentification
 * CorporateActionNotificationV07.mmInstructionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV08#mmInstructionIdentification
 * CorporateActionMovementConfirmationV08.mmInstructionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionEventProcessingStatusAdviceV06#mmNotificationIdentification
 * CorporateActionEventProcessingStatusAdviceV06.mmNotificationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV08#mmInstructionIdentification
 * CorporateActionMovementPreliminaryAdviceV08.mmInstructionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestStatusAdviceV07#mmInstructionCancellationRequestIdentification
 * CorporateActionInstructionCancellationRequestStatusAdviceV07.
 * mmInstructionCancellationRequestIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatusAdviceV08#mmInstructionIdentification
 * CorporateActionInstructionStatusAdviceV08.mmInstructionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV08#mmInstructionIdentification
 * CorporateActionNotificationV08.mmInstructionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV09#mmInstructionIdentification
 * CorporateActionMovementConfirmationV09.mmInstructionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV09#mmInstructionIdentification
 * CorporateActionMovementPreliminaryAdviceV09.mmInstructionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatusAdviceV09#mmInstructionIdentification
 * CorporateActionInstructionStatusAdviceV09.mmInstructionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestStatusAdviceV08#mmInstructionCancellationRequestIdentification
 * CorporateActionInstructionCancellationRequestStatusAdviceV08.
 * mmInstructionCancellationRequestIdentification}</li>
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
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "DocumentIdentification9", propOrder = "identification")
public class DocumentIdentification9 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Id", required = true)
	protected Max35Text identification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentification
	 * GenericIdentification.mmIdentification}</li>
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
	public static final MMMessageAttribute mmIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> GenericIdentification.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.DocumentIdentification9.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Identifies the document.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DocumentIdentification9.mmIdentification);
				messageBuildingBlock_lazy = () -> Arrays.asList(CorporateActionEventProcessingStatusAdviceV01.mmNotificationIdentification, CorporateActionEventProcessingStatusAdviceV02.mmNotificationIdentification,
						CorporateActionEventProcessingStatusAdviceV03.mmNotificationIdentification, CorporateActionEventProcessingStatusAdviceV04.mmNotificationIdentification,
						CorporateActionInstructionCancellationRequestStatusAdviceV01.mmInstructionCancellationRequestIdentification,
						CorporateActionInstructionCancellationRequestStatusAdviceV02.mmInstructionCancellationRequestIdentification,
						CorporateActionInstructionCancellationRequestStatusAdviceV03.mmInstructionCancellationRequestIdentification,
						CorporateActionInstructionCancellationRequestStatusAdviceV04.mmInstructionCancellationRequestIdentification, CorporateActionInstructionStatusAdviceV01.mmInstructionIdentification,
						CorporateActionInstructionStatusAdviceV02.mmInstructionIdentification, CorporateActionInstructionStatusAdviceV03.mmInstructionIdentification, CorporateActionInstructionStatusAdviceV04.mmInstructionIdentification,
						CorporateActionMovementConfirmationV01.mmInstructionIdentification, CorporateActionMovementConfirmationV02.mmInstructionIdentification, CorporateActionMovementConfirmationV03.mmInstructionIdentification,
						CorporateActionMovementConfirmationV04.mmInstructionIdentification, CorporateActionMovementPreliminaryAdviceV01.mmInstructionIdentification, CorporateActionMovementPreliminaryAdviceV02.mmInstructionIdentification,
						CorporateActionMovementPreliminaryAdviceV03.mmInstructionIdentification, CorporateActionMovementPreliminaryAdviceV04.mmInstructionIdentification, CorporateActionNotificationV01.mmInstructionIdentification,
						CorporateActionNotificationV02.mmInstructionIdentification, CorporateActionNotificationV03.mmInstructionIdentification, CorporateActionNotificationV04.mmInstructionIdentification,
						RegulatoryTransactionReportCancellationRequestV02.mmPreviousReference, CorporateActionMovementConfirmationV05.mmInstructionIdentification, CorporateActionNotificationV05.mmInstructionIdentification,
						CorporateActionInstructionStatusAdviceV05.mmInstructionIdentification, CorporateActionMovementPreliminaryAdviceV05.mmInstructionIdentification, CorporateActionMovementConfirmationV06.mmInstructionIdentification,
						CorporateActionInstructionCancellationRequestStatusAdviceV05.mmInstructionCancellationRequestIdentification, CorporateActionInstructionStatusAdviceV06.mmInstructionIdentification,
						CorporateActionMovementPreliminaryAdviceV06.mmInstructionIdentification, CorporateActionInstructionCancellationRequestStatusAdviceV06.mmInstructionCancellationRequestIdentification,
						CorporateActionMovementPreliminaryAdviceV07.mmInstructionIdentification, CorporateActionMovementConfirmationV07.mmInstructionIdentification, CorporateActionNotificationV06.mmInstructionIdentification,
						CorporateActionEventProcessingStatusAdviceV05.mmNotificationIdentification, CorporateActionInstructionStatusAdviceV07.mmInstructionIdentification, CorporateActionNotificationV07.mmInstructionIdentification,
						CorporateActionMovementConfirmationV08.mmInstructionIdentification, CorporateActionEventProcessingStatusAdviceV06.mmNotificationIdentification,
						CorporateActionMovementPreliminaryAdviceV08.mmInstructionIdentification, CorporateActionInstructionCancellationRequestStatusAdviceV07.mmInstructionCancellationRequestIdentification,
						CorporateActionInstructionStatusAdviceV08.mmInstructionIdentification, CorporateActionNotificationV08.mmInstructionIdentification, CorporateActionMovementConfirmationV09.mmInstructionIdentification,
						CorporateActionMovementPreliminaryAdviceV09.mmInstructionIdentification, CorporateActionInstructionStatusAdviceV09.mmInstructionIdentification,
						CorporateActionInstructionCancellationRequestStatusAdviceV08.mmInstructionCancellationRequestIdentification);
				trace_lazy = () -> Document.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DocumentIdentification9";
				definition = "Identifies a document by a unique identification.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getIdentification() {
		return identification;
	}

	public DocumentIdentification9 setIdentification(Max35Text identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}
}