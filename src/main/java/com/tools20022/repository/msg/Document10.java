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
import com.tools20022.repository.choice.Channel1Choice;
import com.tools20022.repository.choice.DocumentFormat1Choice;
import com.tools20022.repository.choice.UndertakingDocumentType2Choice;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.Presentation;
import com.tools20022.repository.entity.UndertakingDocument;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information about a document.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Document10#mmDocumentType
 * Document10.mmDocumentType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Document10#mmPresentationChannel
 * Document10.mmPresentationChannel}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Document10#mmDocumentFormat
 * Document10.mmDocumentFormat}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Document10#mmCopyIndicator
 * Document10.mmCopyIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Document10#mmSignedIndicator
 * Document10.mmSignedIndicator}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.UndertakingDocument
 * UndertakingDocument}</li>
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
 * "Document10"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information about a document."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "Document10", propOrder = {"documentType", "presentationChannel", "documentFormat", "copyIndicator", "signedIndicator"})
public class Document10 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected UndertakingDocumentType2Choice documentType;
	/**
	 * Type of document.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.UndertakingDocumentType2Choice
	 * UndertakingDocumentType2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.UndertakingDocument#mmDocumentType
	 * UndertakingDocument.mmDocumentType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Document10
	 * Document10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DocTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DocumentType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of document."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDocumentType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> UndertakingDocument.mmDocumentType;
			componentContext_lazy = () -> Document10.mmObject();
			isDerived = false;
			xmlTag = "DocTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DocumentType";
			definition = "Type of document.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> UndertakingDocumentType2Choice.mmObject();
		}
	};
	protected Channel1Choice presentationChannel;
	/**
	 * Channel through which the document should be presented.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.Channel1Choice
	 * Channel1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Presentation#mmCommunicationMethod
	 * Presentation.mmCommunicationMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Document10
	 * Document10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PresntnChanl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PresentationChannel"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Channel through which the document should be presented."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPresentationChannel = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Presentation.mmCommunicationMethod;
			componentContext_lazy = () -> Document10.mmObject();
			isDerived = false;
			xmlTag = "PresntnChanl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PresentationChannel";
			definition = "Channel through which the document should be presented.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Channel1Choice.mmObject();
		}
	};
	protected DocumentFormat1Choice documentFormat;
	/**
	 * Format of the document.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DocumentFormat1Choice
	 * DocumentFormat1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.UndertakingDocument#mmFormat
	 * UndertakingDocument.mmFormat}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Document10
	 * Document10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DocFrmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DocumentFormat"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Format of the document."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDocumentFormat = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> UndertakingDocument.mmFormat;
			componentContext_lazy = () -> Document10.mmObject();
			isDerived = false;
			xmlTag = "DocFrmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DocumentFormat";
			definition = "Format of the document.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DocumentFormat1Choice.mmObject();
		}
	};
	protected YesNoIndicator copyIndicator;
	/**
	 * Indication whether the document may be a copy of the original document.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.UndertakingDocument#mmCopyIndicator
	 * UndertakingDocument.mmCopyIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Document10
	 * Document10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CpyInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CopyIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indication whether the document may be a copy of the original document."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCopyIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> UndertakingDocument.mmCopyIndicator;
			componentContext_lazy = () -> Document10.mmObject();
			isDerived = false;
			xmlTag = "CpyInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CopyIndicator";
			definition = "Indication whether the document may be a copy of the original document.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator signedIndicator;
	/**
	 * Indication whether the document must be signed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Document10
	 * Document10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SgndInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SignedIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indication whether the document must be signed."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSignedIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Document10.mmObject();
			isDerived = false;
			xmlTag = "SgndInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SignedIndicator";
			definition = "Indication whether the document must be signed.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(Document10.mmDocumentType, Document10.mmPresentationChannel, Document10.mmDocumentFormat, Document10.mmCopyIndicator, Document10.mmSignedIndicator);
				trace_lazy = () -> UndertakingDocument.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Document10";
				definition = "Information about a document.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "DocTp", required = true)
	public UndertakingDocumentType2Choice getDocumentType() {
		return documentType;
	}

	public void setDocumentType(UndertakingDocumentType2Choice documentType) {
		this.documentType = documentType;
	}

	@XmlElement(name = "PresntnChanl")
	public Channel1Choice getPresentationChannel() {
		return presentationChannel;
	}

	public void setPresentationChannel(Channel1Choice presentationChannel) {
		this.presentationChannel = presentationChannel;
	}

	@XmlElement(name = "DocFrmt")
	public DocumentFormat1Choice getDocumentFormat() {
		return documentFormat;
	}

	public void setDocumentFormat(DocumentFormat1Choice documentFormat) {
		this.documentFormat = documentFormat;
	}

	@XmlElement(name = "CpyInd")
	public YesNoIndicator getCopyIndicator() {
		return copyIndicator;
	}

	public void setCopyIndicator(YesNoIndicator copyIndicator) {
		this.copyIndicator = copyIndicator;
	}

	@XmlElement(name = "SgndInd")
	public YesNoIndicator getSignedIndicator() {
		return signedIndicator;
	}

	public void setSignedIndicator(YesNoIndicator signedIndicator) {
		this.signedIndicator = signedIndicator;
	}
}