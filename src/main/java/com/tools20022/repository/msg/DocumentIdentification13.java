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
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.choice.DocumentIdentification1Choice;
import com.tools20022.repository.choice.DocumentNumber1Choice;
import com.tools20022.repository.choice.ProcessingPosition1Choice;
import com.tools20022.repository.entity.Document;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Identification of a document as well as the document number and type of link.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DocumentIdentification13#Identification
 * DocumentIdentification13.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DocumentIdentification13#DocumentNumber
 * DocumentIdentification13.DocumentNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DocumentIdentification13#LinkageType
 * DocumentIdentification13.LinkageType}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Document Document}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionV01#OtherDocumentIdentification
 * CorporateActionInstructionV01.OtherDocumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionV02#OtherDocumentIdentification
 * CorporateActionInstructionV02.OtherDocumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionV03#OtherDocumentIdentification
 * CorporateActionInstructionV03.OtherDocumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionV04#OtherDocumentIdentification
 * CorporateActionInstructionV04.OtherDocumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV01#OtherDocumentIdentification
 * CorporateActionMovementConfirmationV01.OtherDocumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV02#OtherDocumentIdentification
 * CorporateActionMovementConfirmationV02.OtherDocumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV03#OtherDocumentIdentification
 * CorporateActionMovementConfirmationV03.OtherDocumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV04#OtherDocumentIdentification
 * CorporateActionMovementConfirmationV04.OtherDocumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV01#OtherDocumentIdentification
 * CorporateActionMovementPreliminaryAdviceV01.OtherDocumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV02#OtherDocumentIdentification
 * CorporateActionMovementPreliminaryAdviceV02.OtherDocumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV03#OtherDocumentIdentification
 * CorporateActionMovementPreliminaryAdviceV03.OtherDocumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV04#OtherDocumentIdentification
 * CorporateActionMovementPreliminaryAdviceV04.OtherDocumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV01#OtherDocumentIdentification
 * CorporateActionMovementReversalAdviceV01.OtherDocumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV02#OtherDocumentIdentification
 * CorporateActionMovementReversalAdviceV02.OtherDocumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV03#OtherDocumentIdentification
 * CorporateActionMovementReversalAdviceV03.OtherDocumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV04#OtherDocumentIdentification
 * CorporateActionMovementReversalAdviceV04.OtherDocumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV01#OtherDocumentIdentification
 * CorporateActionNotificationV01.OtherDocumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV02#OtherDocumentIdentification
 * CorporateActionNotificationV02.OtherDocumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV03#OtherDocumentIdentification
 * CorporateActionNotificationV03.OtherDocumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV04#OtherDocumentIdentification
 * CorporateActionNotificationV04.OtherDocumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV05#OtherDocumentIdentification
 * CorporateActionMovementConfirmationV05.OtherDocumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV05#OtherDocumentIdentification
 * CorporateActionNotificationV05.OtherDocumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV05#OtherDocumentIdentification
 * CorporateActionMovementPreliminaryAdviceV05.OtherDocumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionV05#OtherDocumentIdentification
 * CorporateActionInstructionV05.OtherDocumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV05#OtherDocumentIdentification
 * CorporateActionMovementReversalAdviceV05.OtherDocumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV06#OtherDocumentIdentification
 * CorporateActionMovementConfirmationV06.OtherDocumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV06#OtherDocumentIdentification
 * CorporateActionMovementPreliminaryAdviceV06.OtherDocumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV06#OtherDocumentIdentification
 * CorporateActionMovementReversalAdviceV06.OtherDocumentIdentification}</li>
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
 * "DocumentIdentification13"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Identification of a document as well as the document number and type of link."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentIdentification32
 * DocumentIdentification32}</li>
 * </ul>
 * </li>
 * </ul>
 */
public class DocumentIdentification13 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Unique identifier of the document (message) assigned either by the
	 * account servicer or the account owner.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.DocumentIdentification1Choice
	 * DocumentIdentification1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#Identification
	 * GenericIdentification.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification13
	 * DocumentIdentification13}</li>
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
	 * definition} =
	 * "Unique identifier of the document (message) assigned either by the account servicer or the account owner."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification32#Identification
	 * DocumentIdentification32.Identification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Identification = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> DocumentIdentification13.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.GenericIdentification.Identification;
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Unique identifier of the document (message) assigned either by the account servicer or the account owner.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DocumentIdentification32.Identification);
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> DocumentIdentification1Choice.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Identification of the type of document.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.DocumentNumber1Choice
	 * DocumentNumber1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification13
	 * DocumentIdentification13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DocNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DocumentNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the type of document."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification32#DocumentNumber
	 * DocumentIdentification32.DocumentNumber}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd DocumentNumber = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> DocumentIdentification13.mmObject();
			isDerived = false;
			xmlTag = "DocNb";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DocumentNumber";
			definition = "Identification of the type of document.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DocumentIdentification32.DocumentNumber);
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> DocumentNumber1Choice.mmObject();
			isComposite = true;
		}
	};
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
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification13
	 * DocumentIdentification13}</li>
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
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification32#LinkageType
	 * DocumentIdentification32.LinkageType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd LinkageType = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> DocumentIdentification13.mmObject();
			isDerived = false;
			xmlTag = "LkgTp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LinkageType";
			definition = "Specifies when this document is to be processed relative to an other referred document.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DocumentIdentification32.LinkageType);
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> ProcessingPosition1Choice.mmObject();
			isComposite = true;
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DocumentIdentification13.Identification, com.tools20022.repository.msg.DocumentIdentification13.DocumentNumber,
						com.tools20022.repository.msg.DocumentIdentification13.LinkageType);
				trace_lazy = () -> Document.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.seev.CorporateActionInstructionV01.OtherDocumentIdentification,
						com.tools20022.repository.area.seev.CorporateActionInstructionV02.OtherDocumentIdentification, com.tools20022.repository.area.seev.CorporateActionInstructionV03.OtherDocumentIdentification,
						com.tools20022.repository.area.seev.CorporateActionInstructionV04.OtherDocumentIdentification, com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV01.OtherDocumentIdentification,
						com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV02.OtherDocumentIdentification, com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV03.OtherDocumentIdentification,
						com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV04.OtherDocumentIdentification, com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV01.OtherDocumentIdentification,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV02.OtherDocumentIdentification,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV03.OtherDocumentIdentification,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV04.OtherDocumentIdentification, com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV01.OtherDocumentIdentification,
						com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV02.OtherDocumentIdentification, com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV03.OtherDocumentIdentification,
						com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV04.OtherDocumentIdentification, com.tools20022.repository.area.seev.CorporateActionNotificationV01.OtherDocumentIdentification,
						com.tools20022.repository.area.seev.CorporateActionNotificationV02.OtherDocumentIdentification, com.tools20022.repository.area.seev.CorporateActionNotificationV03.OtherDocumentIdentification,
						com.tools20022.repository.area.seev.CorporateActionNotificationV04.OtherDocumentIdentification, com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV05.OtherDocumentIdentification,
						com.tools20022.repository.area.seev.CorporateActionNotificationV05.OtherDocumentIdentification, com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV05.OtherDocumentIdentification,
						com.tools20022.repository.area.seev.CorporateActionInstructionV05.OtherDocumentIdentification, com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV05.OtherDocumentIdentification,
						com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV06.OtherDocumentIdentification, com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV06.OtherDocumentIdentification,
						com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV06.OtherDocumentIdentification);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "DocumentIdentification13";
				definition = "Identification of a document as well as the document number and type of link.";
				nextVersions_lazy = () -> Arrays.asList(DocumentIdentification32.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}