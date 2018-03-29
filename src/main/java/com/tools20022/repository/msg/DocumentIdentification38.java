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
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.seev.*;
import com.tools20022.repository.choice.DocumentIdentification4Choice;
import com.tools20022.repository.choice.DocumentNumber6Choice;
import com.tools20022.repository.choice.ProcessingPosition10Choice;
import com.tools20022.repository.entity.Document;
import com.tools20022.repository.entity.GenericIdentification;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

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
 * {@linkplain com.tools20022.repository.msg.DocumentIdentification38#mmIdentification
 * DocumentIdentification38.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DocumentIdentification38#mmDocumentNumber
 * DocumentIdentification38.mmDocumentNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DocumentIdentification38#mmLinkageType
 * DocumentIdentification38.mmLinkageType}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Document Document}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotification002V06#mmOtherDocumentIdentification
 * CorporateActionNotification002V06.mmOtherDocumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdvice002V07#mmOtherDocumentIdentification
 * CorporateActionMovementPreliminaryAdvice002V07.mmOtherDocumentIdentification}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdvice002V07#mmOtherDocumentIdentification
 * CorporateActionMovementReversalAdvice002V07.mmOtherDocumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmation002V07#mmOtherDocumentIdentification
 * CorporateActionMovementConfirmation002V07.mmOtherDocumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstruction002V06#mmOtherDocumentIdentification
 * CorporateActionInstruction002V06.mmOtherDocumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstruction002V08#mmOtherDocumentIdentification
 * CorporateActionInstruction002V08.mmOtherDocumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmation002V09#mmOtherDocumentIdentification
 * CorporateActionMovementConfirmation002V09.mmOtherDocumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdvice002V09#mmOtherDocumentIdentification
 * CorporateActionMovementPreliminaryAdvice002V09.mmOtherDocumentIdentification}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdvice002V09#mmOtherDocumentIdentification
 * CorporateActionMovementReversalAdvice002V09.mmOtherDocumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotification002V08#mmOtherDocumentIdentification
 * CorporateActionNotification002V08.mmOtherDocumentIdentification}</li>
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
 * "DocumentIdentification38"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Identification of a document as well as the document number and type of link."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "DocumentIdentification38", propOrder = {"identification", "documentNumber", "linkageType"})
public class DocumentIdentification38 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Id", required = true)
	protected DocumentIdentification4Choice identification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.DocumentIdentification4Choice
	 * DocumentIdentification4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentification
	 * GenericIdentification.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification38
	 * DocumentIdentification38}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Id"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :20C:</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<DocumentIdentification38, DocumentIdentification4Choice> mmIdentification = new MMMessageAssociationEnd<DocumentIdentification38, DocumentIdentification4Choice>() {
		{
			businessElementTrace_lazy = () -> GenericIdentification.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.DocumentIdentification38.mmObject();
			isDerived = false;
			xmlTag = "Id";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":20C:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Unique identifier of the document (message) assigned either by the account servicer or the account owner.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> DocumentIdentification4Choice.mmObject();
		}

		@Override
		public DocumentIdentification4Choice getValue(DocumentIdentification38 obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(DocumentIdentification38 obj, DocumentIdentification4Choice value) {
			obj.setIdentification(value);
		}
	};
	@XmlElement(name = "DocNb")
	protected DocumentNumber6Choice documentNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.DocumentNumber6Choice
	 * DocumentNumber6Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification38
	 * DocumentIdentification38}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DocNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :13a::LINK</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DocumentNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the type of document."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<DocumentIdentification38, Optional<DocumentNumber6Choice>> mmDocumentNumber = new MMMessageAssociationEnd<DocumentIdentification38, Optional<DocumentNumber6Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.DocumentIdentification38.mmObject();
			isDerived = false;
			xmlTag = "DocNb";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":13a::LINK"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DocumentNumber";
			definition = "Identification of the type of document.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DocumentNumber6Choice.mmObject();
		}

		@Override
		public Optional<DocumentNumber6Choice> getValue(DocumentIdentification38 obj) {
			return obj.getDocumentNumber();
		}

		@Override
		public void setValue(DocumentIdentification38 obj, Optional<DocumentNumber6Choice> value) {
			obj.setDocumentNumber(value.orElse(null));
		}
	};
	@XmlElement(name = "LkgTp")
	protected ProcessingPosition10Choice linkageType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.ProcessingPosition10Choice
	 * ProcessingPosition10Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification38
	 * DocumentIdentification38}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LkgTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::LINK</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<DocumentIdentification38, Optional<ProcessingPosition10Choice>> mmLinkageType = new MMMessageAssociationEnd<DocumentIdentification38, Optional<ProcessingPosition10Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.DocumentIdentification38.mmObject();
			isDerived = false;
			xmlTag = "LkgTp";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::LINK"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LinkageType";
			definition = "Specifies when this document is to be processed relative to an other referred document.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ProcessingPosition10Choice.mmObject();
		}

		@Override
		public Optional<ProcessingPosition10Choice> getValue(DocumentIdentification38 obj) {
			return obj.getLinkageType();
		}

		@Override
		public void setValue(DocumentIdentification38 obj, Optional<ProcessingPosition10Choice> value) {
			obj.setLinkageType(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DocumentIdentification38.mmIdentification, com.tools20022.repository.msg.DocumentIdentification38.mmDocumentNumber,
						com.tools20022.repository.msg.DocumentIdentification38.mmLinkageType);
				messageBuildingBlock_lazy = () -> Arrays.asList(CorporateActionNotification002V06.mmOtherDocumentIdentification, CorporateActionMovementPreliminaryAdvice002V07.mmOtherDocumentIdentification,
						CorporateActionMovementReversalAdvice002V07.mmOtherDocumentIdentification, CorporateActionMovementConfirmation002V07.mmOtherDocumentIdentification, CorporateActionInstruction002V06.mmOtherDocumentIdentification,
						CorporateActionInstruction002V08.mmOtherDocumentIdentification, CorporateActionMovementConfirmation002V09.mmOtherDocumentIdentification, CorporateActionMovementPreliminaryAdvice002V09.mmOtherDocumentIdentification,
						CorporateActionMovementReversalAdvice002V09.mmOtherDocumentIdentification, CorporateActionNotification002V08.mmOtherDocumentIdentification);
				trace_lazy = () -> Document.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DocumentIdentification38";
				definition = "Identification of a document as well as the document number and type of link.";
			}
		});
		return mmObject_lazy.get();
	}

	public DocumentIdentification4Choice getIdentification() {
		return identification;
	}

	public DocumentIdentification38 setIdentification(DocumentIdentification4Choice identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public Optional<DocumentNumber6Choice> getDocumentNumber() {
		return documentNumber == null ? Optional.empty() : Optional.of(documentNumber);
	}

	public DocumentIdentification38 setDocumentNumber(DocumentNumber6Choice documentNumber) {
		this.documentNumber = documentNumber;
		return this;
	}

	public Optional<ProcessingPosition10Choice> getLinkageType() {
		return linkageType == null ? Optional.empty() : Optional.of(linkageType);
	}

	public DocumentIdentification38 setLinkageType(ProcessingPosition10Choice linkageType) {
		this.linkageType = linkageType;
		return this;
	}
}