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
import com.tools20022.repository.area.seev.*;
import com.tools20022.repository.choice.ProcessingPosition1Choice;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.Document;
import com.tools20022.repository.entity.GenericIdentification;
import com.tools20022.repository.GeneratedRepository;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;

/**
 * Identification of a document and type of link.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DocumentIdentification15#mmIdentification
 * DocumentIdentification15.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DocumentIdentification15#mmLinkageType
 * DocumentIdentification15.mmLinkageType}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Document Document}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionV01#mmCancelledInstructionIdentification
 * CorporateActionInstructionV01.mmCancelledInstructionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionV01#mmInstructionCancellationRequestIdentification
 * CorporateActionInstructionV01.mmInstructionCancellationRequestIdentification}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionV02#mmCancelledInstructionIdentification
 * CorporateActionInstructionV02.mmCancelledInstructionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionV02#mmInstructionCancellationRequestIdentification
 * CorporateActionInstructionV02.mmInstructionCancellationRequestIdentification}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionV03#mmCancelledInstructionIdentification
 * CorporateActionInstructionV03.mmCancelledInstructionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionV03#mmInstructionCancellationRequestIdentification
 * CorporateActionInstructionV03.mmInstructionCancellationRequestIdentification}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionV04#mmCancelledInstructionIdentification
 * CorporateActionInstructionV04.mmCancelledInstructionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionV04#mmInstructionCancellationRequestIdentification
 * CorporateActionInstructionV04.mmInstructionCancellationRequestIdentification}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestV01#mmInstructionIdentification
 * CorporateActionInstructionCancellationRequestV01.mmInstructionIdentification}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestV02#mmInstructionIdentification
 * CorporateActionInstructionCancellationRequestV02.mmInstructionIdentification}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestV03#mmInstructionIdentification
 * CorporateActionInstructionCancellationRequestV03.mmInstructionIdentification}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestV04#mmInstructionIdentification
 * CorporateActionInstructionCancellationRequestV04.mmInstructionIdentification}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV01#mmNotificationIdentification
 * CorporateActionMovementConfirmationV01.mmNotificationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV01#mmMovementPreliminaryAdviceIdentification
 * CorporateActionMovementConfirmationV01.
 * mmMovementPreliminaryAdviceIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV02#mmNotificationIdentification
 * CorporateActionMovementConfirmationV02.mmNotificationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV02#mmMovementPreliminaryAdviceIdentification
 * CorporateActionMovementConfirmationV02.
 * mmMovementPreliminaryAdviceIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV03#mmNotificationIdentification
 * CorporateActionMovementConfirmationV03.mmNotificationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV03#mmMovementPreliminaryAdviceIdentification
 * CorporateActionMovementConfirmationV03.
 * mmMovementPreliminaryAdviceIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV04#mmNotificationIdentification
 * CorporateActionMovementConfirmationV04.mmNotificationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV04#mmMovementPreliminaryAdviceIdentification
 * CorporateActionMovementConfirmationV04.
 * mmMovementPreliminaryAdviceIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV01#mmPreviousMovementPreliminaryAdviceIdentification
 * CorporateActionMovementPreliminaryAdviceV01.
 * mmPreviousMovementPreliminaryAdviceIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV01#mmNotificationIdentification
 * CorporateActionMovementPreliminaryAdviceV01.mmNotificationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV01#mmMovementConfirmationIdentification
 * CorporateActionMovementPreliminaryAdviceV01.
 * mmMovementConfirmationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV02#mmPreviousMovementPreliminaryAdviceIdentification
 * CorporateActionMovementPreliminaryAdviceV02.
 * mmPreviousMovementPreliminaryAdviceIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV02#mmNotificationIdentification
 * CorporateActionMovementPreliminaryAdviceV02.mmNotificationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV02#mmMovementConfirmationIdentification
 * CorporateActionMovementPreliminaryAdviceV02.
 * mmMovementConfirmationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV03#mmPreviousMovementPreliminaryAdviceIdentification
 * CorporateActionMovementPreliminaryAdviceV03.
 * mmPreviousMovementPreliminaryAdviceIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV03#mmNotificationIdentification
 * CorporateActionMovementPreliminaryAdviceV03.mmNotificationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV03#mmMovementConfirmationIdentification
 * CorporateActionMovementPreliminaryAdviceV03.
 * mmMovementConfirmationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV04#mmPreviousMovementPreliminaryAdviceIdentification
 * CorporateActionMovementPreliminaryAdviceV04.
 * mmPreviousMovementPreliminaryAdviceIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV04#mmNotificationIdentification
 * CorporateActionMovementPreliminaryAdviceV04.mmNotificationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV04#mmMovementConfirmationIdentification
 * CorporateActionMovementPreliminaryAdviceV04.
 * mmMovementConfirmationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV01#mmMovementPreliminaryAdviceIdentification
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV01.
 * mmMovementPreliminaryAdviceIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV02#mmMovementPreliminaryAdviceIdentification
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV02.
 * mmMovementPreliminaryAdviceIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV03#mmMovementPreliminaryAdviceIdentification
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV03.
 * mmMovementPreliminaryAdviceIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV04#mmMovementPreliminaryAdviceIdentification
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV04.
 * mmMovementPreliminaryAdviceIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV01#mmMovementConfirmationIdentification
 * CorporateActionMovementReversalAdviceV01.mmMovementConfirmationIdentification
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV02#mmMovementConfirmationIdentification
 * CorporateActionMovementReversalAdviceV02.mmMovementConfirmationIdentification
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV03#mmMovementConfirmationIdentification
 * CorporateActionMovementReversalAdviceV03.mmMovementConfirmationIdentification
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV04#mmMovementConfirmationIdentification
 * CorporateActionMovementReversalAdviceV04.mmMovementConfirmationIdentification
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV01#mmPreviousNotificationIdentification
 * CorporateActionNotificationV01.mmPreviousNotificationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV02#mmPreviousNotificationIdentification
 * CorporateActionNotificationV02.mmPreviousNotificationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV03#mmPreviousNotificationIdentification
 * CorporateActionNotificationV03.mmPreviousNotificationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV04#mmPreviousNotificationIdentification
 * CorporateActionNotificationV04.mmPreviousNotificationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV05#mmMovementPreliminaryAdviceIdentification
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV05.
 * mmMovementPreliminaryAdviceIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV05#mmNotificationIdentification
 * CorporateActionMovementConfirmationV05.mmNotificationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV05#mmMovementPreliminaryAdviceIdentification
 * CorporateActionMovementConfirmationV05.
 * mmMovementPreliminaryAdviceIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV05#mmPreviousNotificationIdentification
 * CorporateActionNotificationV05.mmPreviousNotificationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV05#mmPreviousMovementPreliminaryAdviceIdentification
 * CorporateActionMovementPreliminaryAdviceV05.
 * mmPreviousMovementPreliminaryAdviceIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV05#mmNotificationIdentification
 * CorporateActionMovementPreliminaryAdviceV05.mmNotificationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV05#mmMovementConfirmationIdentification
 * CorporateActionMovementPreliminaryAdviceV05.
 * mmMovementConfirmationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionV05#mmCancelledInstructionIdentification
 * CorporateActionInstructionV05.mmCancelledInstructionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionV05#mmInstructionCancellationRequestIdentification
 * CorporateActionInstructionV05.mmInstructionCancellationRequestIdentification}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV05#mmMovementConfirmationIdentification
 * CorporateActionMovementReversalAdviceV05.mmMovementConfirmationIdentification
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestV05#mmInstructionIdentification
 * CorporateActionInstructionCancellationRequestV05.mmInstructionIdentification}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV06#mmNotificationIdentification
 * CorporateActionMovementConfirmationV06.mmNotificationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV06#mmMovementPreliminaryAdviceIdentification
 * CorporateActionMovementConfirmationV06.
 * mmMovementPreliminaryAdviceIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV06#mmPreviousMovementPreliminaryAdviceIdentification
 * CorporateActionMovementPreliminaryAdviceV06.
 * mmPreviousMovementPreliminaryAdviceIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV06#mmNotificationIdentification
 * CorporateActionMovementPreliminaryAdviceV06.mmNotificationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV06#mmMovementConfirmationIdentification
 * CorporateActionMovementPreliminaryAdviceV06.
 * mmMovementConfirmationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV06#mmMovementConfirmationIdentification
 * CorporateActionMovementReversalAdviceV06.mmMovementConfirmationIdentification
 * }</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = May 5, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DocumentIdentification15"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Identification of a document and type of link."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentIdentification31
 * DocumentIdentification31}</li>
 * </ul>
 * </li>
 * </ul>
 */
public class DocumentIdentification15 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text identification;
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
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentification
	 * GenericIdentification.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification15
	 * DocumentIdentification15}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification31#mmIdentification
	 * DocumentIdentification31.mmIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> GenericIdentification.mmIdentification;
			componentContext_lazy = () -> DocumentIdentification15.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Identifies the document.";
			nextVersions_lazy = () -> Arrays.asList(DocumentIdentification31.mmIdentification);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected ProcessingPosition1Choice linkageType;
	/**
	 * Specifies when this document is to be processed relative to an other
	 * referred document.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.ProcessingPosition1Choice
	 * ProcessingPosition1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification15
	 * DocumentIdentification15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LkgTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LinkageType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies when this document is to be processed relative to an other referred document."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification31#mmLinkageType
	 * DocumentIdentification31.mmLinkageType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmLinkageType = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> DocumentIdentification15.mmObject();
			isDerived = false;
			xmlTag = "LkgTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LinkageType";
			definition = "Specifies when this document is to be processed relative to an other referred document.";
			nextVersions_lazy = () -> Arrays.asList(DocumentIdentification31.mmLinkageType);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ProcessingPosition1Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(DocumentIdentification15.mmIdentification, DocumentIdentification15.mmLinkageType);
				messageBuildingBlock_lazy = () -> Arrays.asList(CorporateActionInstructionV01.mmCancelledInstructionIdentification, CorporateActionInstructionV01.mmInstructionCancellationRequestIdentification,
						CorporateActionInstructionV02.mmCancelledInstructionIdentification, CorporateActionInstructionV02.mmInstructionCancellationRequestIdentification, CorporateActionInstructionV03.mmCancelledInstructionIdentification,
						CorporateActionInstructionV03.mmInstructionCancellationRequestIdentification, CorporateActionInstructionV04.mmCancelledInstructionIdentification,
						CorporateActionInstructionV04.mmInstructionCancellationRequestIdentification, CorporateActionInstructionCancellationRequestV01.mmInstructionIdentification,
						CorporateActionInstructionCancellationRequestV02.mmInstructionIdentification, CorporateActionInstructionCancellationRequestV03.mmInstructionIdentification,
						CorporateActionInstructionCancellationRequestV04.mmInstructionIdentification, CorporateActionMovementConfirmationV01.mmNotificationIdentification,
						CorporateActionMovementConfirmationV01.mmMovementPreliminaryAdviceIdentification, CorporateActionMovementConfirmationV02.mmNotificationIdentification,
						CorporateActionMovementConfirmationV02.mmMovementPreliminaryAdviceIdentification, CorporateActionMovementConfirmationV03.mmNotificationIdentification,
						CorporateActionMovementConfirmationV03.mmMovementPreliminaryAdviceIdentification, CorporateActionMovementConfirmationV04.mmNotificationIdentification,
						CorporateActionMovementConfirmationV04.mmMovementPreliminaryAdviceIdentification, CorporateActionMovementPreliminaryAdviceV01.mmPreviousMovementPreliminaryAdviceIdentification,
						CorporateActionMovementPreliminaryAdviceV01.mmNotificationIdentification, CorporateActionMovementPreliminaryAdviceV01.mmMovementConfirmationIdentification,
						CorporateActionMovementPreliminaryAdviceV02.mmPreviousMovementPreliminaryAdviceIdentification, CorporateActionMovementPreliminaryAdviceV02.mmNotificationIdentification,
						CorporateActionMovementPreliminaryAdviceV02.mmMovementConfirmationIdentification, CorporateActionMovementPreliminaryAdviceV03.mmPreviousMovementPreliminaryAdviceIdentification,
						CorporateActionMovementPreliminaryAdviceV03.mmNotificationIdentification, CorporateActionMovementPreliminaryAdviceV03.mmMovementConfirmationIdentification,
						CorporateActionMovementPreliminaryAdviceV04.mmPreviousMovementPreliminaryAdviceIdentification, CorporateActionMovementPreliminaryAdviceV04.mmNotificationIdentification,
						CorporateActionMovementPreliminaryAdviceV04.mmMovementConfirmationIdentification, CorporateActionMovementPreliminaryAdviceCancellationAdviceV01.mmMovementPreliminaryAdviceIdentification,
						CorporateActionMovementPreliminaryAdviceCancellationAdviceV02.mmMovementPreliminaryAdviceIdentification, CorporateActionMovementPreliminaryAdviceCancellationAdviceV03.mmMovementPreliminaryAdviceIdentification,
						CorporateActionMovementPreliminaryAdviceCancellationAdviceV04.mmMovementPreliminaryAdviceIdentification, CorporateActionMovementReversalAdviceV01.mmMovementConfirmationIdentification,
						CorporateActionMovementReversalAdviceV02.mmMovementConfirmationIdentification, CorporateActionMovementReversalAdviceV03.mmMovementConfirmationIdentification,
						CorporateActionMovementReversalAdviceV04.mmMovementConfirmationIdentification, CorporateActionNotificationV01.mmPreviousNotificationIdentification,
						CorporateActionNotificationV02.mmPreviousNotificationIdentification, CorporateActionNotificationV03.mmPreviousNotificationIdentification, CorporateActionNotificationV04.mmPreviousNotificationIdentification,
						CorporateActionMovementPreliminaryAdviceCancellationAdviceV05.mmMovementPreliminaryAdviceIdentification, CorporateActionMovementConfirmationV05.mmNotificationIdentification,
						CorporateActionMovementConfirmationV05.mmMovementPreliminaryAdviceIdentification, CorporateActionNotificationV05.mmPreviousNotificationIdentification,
						CorporateActionMovementPreliminaryAdviceV05.mmPreviousMovementPreliminaryAdviceIdentification, CorporateActionMovementPreliminaryAdviceV05.mmNotificationIdentification,
						CorporateActionMovementPreliminaryAdviceV05.mmMovementConfirmationIdentification, CorporateActionInstructionV05.mmCancelledInstructionIdentification,
						CorporateActionInstructionV05.mmInstructionCancellationRequestIdentification, CorporateActionMovementReversalAdviceV05.mmMovementConfirmationIdentification,
						CorporateActionInstructionCancellationRequestV05.mmInstructionIdentification, CorporateActionMovementConfirmationV06.mmNotificationIdentification,
						CorporateActionMovementConfirmationV06.mmMovementPreliminaryAdviceIdentification, CorporateActionMovementPreliminaryAdviceV06.mmPreviousMovementPreliminaryAdviceIdentification,
						CorporateActionMovementPreliminaryAdviceV06.mmNotificationIdentification, CorporateActionMovementPreliminaryAdviceV06.mmMovementConfirmationIdentification,
						CorporateActionMovementReversalAdviceV06.mmMovementConfirmationIdentification);
				trace_lazy = () -> Document.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("May 5, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "DocumentIdentification15";
				definition = "Identification of a document and type of link.";
				nextVersions_lazy = () -> Arrays.asList(DocumentIdentification31.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getIdentification() {
		return identification;
	}

	public void setIdentification(Max35Text identification) {
		this.identification = identification;
	}

	public ProcessingPosition1Choice getLinkageType() {
		return linkageType;
	}

	public void setLinkageType(ProcessingPosition1Choice linkageType) {
		this.linkageType = linkageType;
	}
}