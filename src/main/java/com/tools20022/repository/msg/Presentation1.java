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
import com.tools20022.repository.choice.PlaceOrUnderConfirmationChoice1;
import com.tools20022.repository.choice.PresentationMedium1Choice;
import com.tools20022.repository.datatype.Max2000Text;
import com.tools20022.repository.entity.Presentation;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.Document8;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information for the presentation of documents.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Presentation1#mmMedium
 * Presentation1.mmMedium}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Presentation1#mmPlaceOfPresentationOrUnderConfirmationChoice
 * Presentation1.mmPlaceOfPresentationOrUnderConfirmationChoice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Presentation1#mmDocument
 * Presentation1.mmDocument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Presentation1#mmAdditionalInformation
 * Presentation1.mmAdditionalInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Presentation
 * Presentation}</li>
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
 * "Presentation1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information for the presentation of documents."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Presentation1", propOrder = {"medium", "placeOfPresentationOrUnderConfirmationChoice", "document", "additionalInformation"})
public class Presentation1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Mdm")
	protected PresentationMedium1Choice medium;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PresentationMedium1Choice
	 * PresentationMedium1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Presentation#mmMedium
	 * Presentation.mmMedium}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Presentation1 Presentation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Mdm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Medium"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Medium through which the presentation can be submitted such as paper, electronic or both."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Presentation1, Optional<PresentationMedium1Choice>> mmMedium = new MMMessageAttribute<Presentation1, Optional<PresentationMedium1Choice>>() {
		{
			businessElementTrace_lazy = () -> Presentation.mmMedium;
			componentContext_lazy = () -> com.tools20022.repository.msg.Presentation1.mmObject();
			isDerived = false;
			xmlTag = "Mdm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Medium";
			definition = "Medium through which the presentation can be submitted such as paper, electronic or both.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PresentationMedium1Choice.mmObject();
		}

		@Override
		public Optional<PresentationMedium1Choice> getValue(Presentation1 obj) {
			return obj.getMedium();
		}

		@Override
		public void setValue(Presentation1 obj, Optional<PresentationMedium1Choice> value) {
			obj.setMedium(value.orElse(null));
		}
	};
	@XmlElement(name = "PlcOfPresntnOrUdrConfChc")
	protected PlaceOrUnderConfirmationChoice1 placeOfPresentationOrUnderConfirmationChoice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PlaceOrUnderConfirmationChoice1
	 * PlaceOrUnderConfirmationChoice1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Presentation1 Presentation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PlcOfPresntnOrUdrConfChc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfPresentationOrUnderConfirmationChoice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Choice of representation for the place of presentation."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Presentation1, Optional<PlaceOrUnderConfirmationChoice1>> mmPlaceOfPresentationOrUnderConfirmationChoice = new MMMessageAssociationEnd<Presentation1, Optional<PlaceOrUnderConfirmationChoice1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Presentation1.mmObject();
			isDerived = false;
			xmlTag = "PlcOfPresntnOrUdrConfChc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfPresentationOrUnderConfirmationChoice";
			definition = "Choice of representation for the place of presentation.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PlaceOrUnderConfirmationChoice1.mmObject();
		}

		@Override
		public Optional<PlaceOrUnderConfirmationChoice1> getValue(Presentation1 obj) {
			return obj.getPlaceOfPresentationOrUnderConfirmationChoice();
		}

		@Override
		public void setValue(Presentation1 obj, Optional<PlaceOrUnderConfirmationChoice1> value) {
			obj.setPlaceOfPresentationOrUnderConfirmationChoice(value.orElse(null));
		}
	};
	@XmlElement(name = "Doc")
	protected List<Document8> document;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Document8 Document8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Presentation#mmPresentedDocument
	 * Presentation.mmPresentedDocument}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Presentation1 Presentation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Doc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Document"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Document required to be presented."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Presentation1, List<Document8>> mmDocument = new MMMessageAssociationEnd<Presentation1, List<Document8>>() {
		{
			businessElementTrace_lazy = () -> Presentation.mmPresentedDocument;
			componentContext_lazy = () -> com.tools20022.repository.msg.Presentation1.mmObject();
			isDerived = false;
			xmlTag = "Doc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Document";
			definition = "Document required to be presented.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Document8.mmObject();
		}

		@Override
		public List<Document8> getValue(Presentation1 obj) {
			return obj.getDocument();
		}

		@Override
		public void setValue(Presentation1 obj, List<Document8> value) {
			obj.setDocument(value);
		}
	};
	@XmlElement(name = "AddtlInf")
	protected List<Max2000Text> additionalInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max2000Text
	 * Max2000Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Presentation1 Presentation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Additional information related to the presentation."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Presentation1, List<Max2000Text>> mmAdditionalInformation = new MMMessageAttribute<Presentation1, List<Max2000Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Presentation1.mmObject();
			isDerived = false;
			xmlTag = "AddtlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformation";
			definition = "Additional information related to the presentation.";
			maxOccurs = 5;
			minOccurs = 0;
			simpleType_lazy = () -> Max2000Text.mmObject();
		}

		@Override
		public List<Max2000Text> getValue(Presentation1 obj) {
			return obj.getAdditionalInformation();
		}

		@Override
		public void setValue(Presentation1 obj, List<Max2000Text> value) {
			obj.setAdditionalInformation(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Presentation1.mmMedium, com.tools20022.repository.msg.Presentation1.mmPlaceOfPresentationOrUnderConfirmationChoice,
						com.tools20022.repository.msg.Presentation1.mmDocument, com.tools20022.repository.msg.Presentation1.mmAdditionalInformation);
				trace_lazy = () -> Presentation.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Presentation1";
				definition = "Information for the presentation of documents.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<PresentationMedium1Choice> getMedium() {
		return medium == null ? Optional.empty() : Optional.of(medium);
	}

	public Presentation1 setMedium(PresentationMedium1Choice medium) {
		this.medium = medium;
		return this;
	}

	public Optional<PlaceOrUnderConfirmationChoice1> getPlaceOfPresentationOrUnderConfirmationChoice() {
		return placeOfPresentationOrUnderConfirmationChoice == null ? Optional.empty() : Optional.of(placeOfPresentationOrUnderConfirmationChoice);
	}

	public Presentation1 setPlaceOfPresentationOrUnderConfirmationChoice(PlaceOrUnderConfirmationChoice1 placeOfPresentationOrUnderConfirmationChoice) {
		this.placeOfPresentationOrUnderConfirmationChoice = placeOfPresentationOrUnderConfirmationChoice;
		return this;
	}

	public List<Document8> getDocument() {
		return document == null ? document = new ArrayList<>() : document;
	}

	public Presentation1 setDocument(List<Document8> document) {
		this.document = Objects.requireNonNull(document);
		return this;
	}

	public List<Max2000Text> getAdditionalInformation() {
		return additionalInformation == null ? additionalInformation = new ArrayList<>() : additionalInformation;
	}

	public Presentation1 setAdditionalInformation(List<Max2000Text> additionalInformation) {
		this.additionalInformation = Objects.requireNonNull(additionalInformation);
		return this;
	}
}