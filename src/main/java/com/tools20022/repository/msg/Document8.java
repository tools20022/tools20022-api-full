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
import com.tools20022.repository.choice.PresentationDocumentFormat1Choice;
import com.tools20022.repository.datatype.Max20000Text;
import com.tools20022.repository.entity.Document;
import com.tools20022.repository.entity.UndertakingDocument;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.Presentation3;
import java.util.*;
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
 * <li>{@linkplain com.tools20022.repository.msg.Document8#mmType
 * Document8.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Document8#mmWording
 * Document8.mmWording}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Document8#mmElectronicDetails
 * Document8.mmElectronicDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.UndertakingDocument
 * UndertakingDocument}</li>
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
 * "Document8"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information about a document."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Document8", propOrder = {"type", "wording", "electronicDetails"})
public class Document8 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Tp", required = true)
	protected PresentationDocumentFormat1Choice type;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PresentationDocumentFormat1Choice
	 * PresentationDocumentFormat1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.UndertakingDocument#mmDocumentType
	 * UndertakingDocument.mmDocumentType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Document8
	 * Document8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of document."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Document8, PresentationDocumentFormat1Choice> mmType = new MMMessageAttribute<Document8, PresentationDocumentFormat1Choice>() {
		{
			businessElementTrace_lazy = () -> UndertakingDocument.mmDocumentType;
			componentContext_lazy = () -> com.tools20022.repository.msg.Document8.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Type of document.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> PresentationDocumentFormat1Choice.mmObject();
		}

		@Override
		public PresentationDocumentFormat1Choice getValue(Document8 obj) {
			return obj.getType();
		}

		@Override
		public void setValue(Document8 obj, PresentationDocumentFormat1Choice value) {
			obj.setType(value);
		}
	};
	@XmlElement(name = "Wrdg")
	protected Max20000Text wording;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max20000Text Max20000Text}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Document8
	 * Document8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Wrdg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Wording"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Wording for document."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Document8, Optional<Max20000Text>> mmWording = new MMMessageAttribute<Document8, Optional<Max20000Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Document8.mmObject();
			isDerived = false;
			xmlTag = "Wrdg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Wording";
			definition = "Wording for document.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max20000Text.mmObject();
		}

		@Override
		public Optional<Max20000Text> getValue(Document8 obj) {
			return obj.getWording();
		}

		@Override
		public void setValue(Document8 obj, Optional<Max20000Text> value) {
			obj.setWording(value.orElse(null));
		}
	};
	@XmlElement(name = "ElctrncDtls")
	protected List<Presentation3> electronicDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Presentation3
	 * Presentation3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Document#mmPresentation
	 * Document.mmPresentation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Document8
	 * Document8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ElctrncDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ElectronicDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details related to an electronic presentation."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Document8, List<Presentation3>> mmElectronicDetails = new MMMessageAssociationEnd<Document8, List<Presentation3>>() {
		{
			businessElementTrace_lazy = () -> Document.mmPresentation;
			componentContext_lazy = () -> com.tools20022.repository.msg.Document8.mmObject();
			isDerived = false;
			xmlTag = "ElctrncDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ElectronicDetails";
			definition = "Details related to an electronic presentation.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Presentation3.mmObject();
		}

		@Override
		public List<Presentation3> getValue(Document8 obj) {
			return obj.getElectronicDetails();
		}

		@Override
		public void setValue(Document8 obj, List<Presentation3> value) {
			obj.setElectronicDetails(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Document8.mmType, com.tools20022.repository.msg.Document8.mmWording, com.tools20022.repository.msg.Document8.mmElectronicDetails);
				trace_lazy = () -> UndertakingDocument.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Document8";
				definition = "Information about a document.";
			}
		});
		return mmObject_lazy.get();
	}

	public PresentationDocumentFormat1Choice getType() {
		return type;
	}

	public Document8 setType(PresentationDocumentFormat1Choice type) {
		this.type = Objects.requireNonNull(type);
		return this;
	}

	public Optional<Max20000Text> getWording() {
		return wording == null ? Optional.empty() : Optional.of(wording);
	}

	public Document8 setWording(Max20000Text wording) {
		this.wording = wording;
		return this;
	}

	public List<Presentation3> getElectronicDetails() {
		return electronicDetails == null ? electronicDetails = new ArrayList<>() : electronicDetails;
	}

	public Document8 setElectronicDetails(List<Presentation3> electronicDetails) {
		this.electronicDetails = Objects.requireNonNull(electronicDetails);
		return this;
	}
}