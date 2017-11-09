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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.seev.*;
import com.tools20022.repository.choice.DocumentIdentification1Choice;
import com.tools20022.repository.choice.DocumentNumber1Choice;
import com.tools20022.repository.entity.Document;
import com.tools20022.repository.entity.GenericIdentification;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Identification of a document as well as the document number.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DocumentIdentification14#mmIdentification
 * DocumentIdentification14.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DocumentIdentification14#mmDocumentNumber
 * DocumentIdentification14.mmDocumentNumber}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Document Document}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionEventProcessingStatusAdviceV01#mmOtherDocumentIdentification
 * CorporateActionEventProcessingStatusAdviceV01.mmOtherDocumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionEventProcessingStatusAdviceV02#mmOtherDocumentIdentification
 * CorporateActionEventProcessingStatusAdviceV02.mmOtherDocumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionEventProcessingStatusAdviceV03#mmOtherDocumentIdentification
 * CorporateActionEventProcessingStatusAdviceV03.mmOtherDocumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionEventProcessingStatusAdviceV04#mmOtherDocumentIdentification
 * CorporateActionEventProcessingStatusAdviceV04.mmOtherDocumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestStatusAdviceV01#mmOtherDocumentIdentification
 * CorporateActionInstructionCancellationRequestStatusAdviceV01.
 * mmOtherDocumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestStatusAdviceV02#mmOtherDocumentIdentification
 * CorporateActionInstructionCancellationRequestStatusAdviceV02.
 * mmOtherDocumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestStatusAdviceV03#mmOtherDocumentIdentification
 * CorporateActionInstructionCancellationRequestStatusAdviceV03.
 * mmOtherDocumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestStatusAdviceV04#mmOtherDocumentIdentification
 * CorporateActionInstructionCancellationRequestStatusAdviceV04.
 * mmOtherDocumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatusAdviceV01#mmOtherDocumentIdentification
 * CorporateActionInstructionStatusAdviceV01.mmOtherDocumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatusAdviceV02#mmOtherDocumentIdentification
 * CorporateActionInstructionStatusAdviceV02.mmOtherDocumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatusAdviceV03#mmOtherDocumentIdentification
 * CorporateActionInstructionStatusAdviceV03.mmOtherDocumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatusAdviceV04#mmOtherDocumentIdentification
 * CorporateActionInstructionStatusAdviceV04.mmOtherDocumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatusAdviceV05#mmOtherDocumentIdentification
 * CorporateActionInstructionStatusAdviceV05.mmOtherDocumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestStatusAdviceV05#mmOtherDocumentIdentification
 * CorporateActionInstructionCancellationRequestStatusAdviceV05.
 * mmOtherDocumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatusAdviceV06#mmOtherDocumentIdentification
 * CorporateActionInstructionStatusAdviceV06.mmOtherDocumentIdentification}</li>
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
 * "DocumentIdentification14"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Identification of a document as well as the document number."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentIdentification33
 * DocumentIdentification33}</li>
 * </ul>
 * </li>
 * </ul>
 */
public class DocumentIdentification14 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected DocumentIdentification1Choice identification;
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
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentification
	 * GenericIdentification.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification14
	 * DocumentIdentification14}</li>
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
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification33#mmIdentification
	 * DocumentIdentification33.mmIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmIdentification = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> GenericIdentification.mmIdentification;
			componentContext_lazy = () -> DocumentIdentification14.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Unique identifier of the document (message) assigned either by the account servicer or the account owner.";
			nextVersions_lazy = () -> Arrays.asList(DocumentIdentification33.mmIdentification);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> DocumentIdentification1Choice.mmObject();
		}
	};
	protected DocumentNumber1Choice documentNumber;
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
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification14
	 * DocumentIdentification14}</li>
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
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification33#mmDocumentNumber
	 * DocumentIdentification33.mmDocumentNumber}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDocumentNumber = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> DocumentIdentification14.mmObject();
			isDerived = false;
			xmlTag = "DocNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DocumentNumber";
			definition = "Identification of the type of document.";
			nextVersions_lazy = () -> Arrays.asList(DocumentIdentification33.mmDocumentNumber);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DocumentNumber1Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(DocumentIdentification14.mmIdentification, DocumentIdentification14.mmDocumentNumber);
				messageBuildingBlock_lazy = () -> Arrays.asList(CorporateActionEventProcessingStatusAdviceV01.mmOtherDocumentIdentification, CorporateActionEventProcessingStatusAdviceV02.mmOtherDocumentIdentification,
						CorporateActionEventProcessingStatusAdviceV03.mmOtherDocumentIdentification, CorporateActionEventProcessingStatusAdviceV04.mmOtherDocumentIdentification,
						CorporateActionInstructionCancellationRequestStatusAdviceV01.mmOtherDocumentIdentification, CorporateActionInstructionCancellationRequestStatusAdviceV02.mmOtherDocumentIdentification,
						CorporateActionInstructionCancellationRequestStatusAdviceV03.mmOtherDocumentIdentification, CorporateActionInstructionCancellationRequestStatusAdviceV04.mmOtherDocumentIdentification,
						CorporateActionInstructionStatusAdviceV01.mmOtherDocumentIdentification, CorporateActionInstructionStatusAdviceV02.mmOtherDocumentIdentification,
						CorporateActionInstructionStatusAdviceV03.mmOtherDocumentIdentification, CorporateActionInstructionStatusAdviceV04.mmOtherDocumentIdentification,
						CorporateActionInstructionStatusAdviceV05.mmOtherDocumentIdentification, CorporateActionInstructionCancellationRequestStatusAdviceV05.mmOtherDocumentIdentification,
						CorporateActionInstructionStatusAdviceV06.mmOtherDocumentIdentification);
				trace_lazy = () -> Document.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DocumentIdentification14";
				definition = "Identification of a document as well as the document number.";
				nextVersions_lazy = () -> Arrays.asList(DocumentIdentification33.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public DocumentIdentification1Choice getIdentification() {
		return identification;
	}

	public void setIdentification(DocumentIdentification1Choice identification) {
		this.identification = identification;
	}

	public DocumentNumber1Choice getDocumentNumber() {
		return documentNumber;
	}

	public void setDocumentNumber(DocumentNumber1Choice documentNumber) {
		this.documentNumber = documentNumber;
	}
}