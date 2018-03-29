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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.PresentationParty1Code;
import com.tools20022.repository.entity.UndertakingPlaceOfPresentation;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.PlaceOfPresentation1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice between a location and codified form.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PlaceOrUnderConfirmationChoice1#mmPlaceOfPresentation
 * PlaceOrUnderConfirmationChoice1.mmPlaceOfPresentation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PlaceOrUnderConfirmationChoice1#mmPresentationUnderConfirmation
 * PlaceOrUnderConfirmationChoice1.mmPresentationUnderConfirmation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.UndertakingPlaceOfPresentation
 * UndertakingPlaceOfPresentation}</li>
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
 * "PlaceOrUnderConfirmationChoice1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice between a location and codified form."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PlaceOrUnderConfirmationChoice1", propOrder = {"placeOfPresentation", "presentationUnderConfirmation"})
public class PlaceOrUnderConfirmationChoice1 {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PlcOfPresntn", required = true)
	protected PlaceOfPresentation1 placeOfPresentation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PlaceOfPresentation1
	 * PlaceOfPresentation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.UndertakingPlaceOfPresentation
	 * UndertakingPlaceOfPresentation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PlaceOrUnderConfirmationChoice1
	 * PlaceOrUnderConfirmationChoice1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PlcOfPresntn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfPresentation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party to which the presentation is to be made."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PlaceOrUnderConfirmationChoice1, PlaceOfPresentation1> mmPlaceOfPresentation = new MMMessageAssociationEnd<PlaceOrUnderConfirmationChoice1, PlaceOfPresentation1>() {
		{
			businessComponentTrace_lazy = () -> UndertakingPlaceOfPresentation.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.PlaceOrUnderConfirmationChoice1.mmObject();
			isDerived = false;
			xmlTag = "PlcOfPresntn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfPresentation";
			definition = "Party to which the presentation is to be made.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PlaceOfPresentation1.mmObject();
		}

		@Override
		public PlaceOfPresentation1 getValue(PlaceOrUnderConfirmationChoice1 obj) {
			return obj.getPlaceOfPresentation();
		}

		@Override
		public void setValue(PlaceOrUnderConfirmationChoice1 obj, PlaceOfPresentation1 value) {
			obj.setPlaceOfPresentation(value);
		}
	};
	@XmlElement(name = "PresntnUdrConf", required = true)
	protected PresentationParty1Code presentationUnderConfirmation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PresentationParty1Code
	 * PresentationParty1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PlaceOrUnderConfirmationChoice1
	 * PlaceOrUnderConfirmationChoice1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PresntnUdrConf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PresentationUnderConfirmation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Place of presentation when there is a confirmation."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PlaceOrUnderConfirmationChoice1, PresentationParty1Code> mmPresentationUnderConfirmation = new MMMessageAttribute<PlaceOrUnderConfirmationChoice1, PresentationParty1Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.PlaceOrUnderConfirmationChoice1.mmObject();
			isDerived = false;
			xmlTag = "PresntnUdrConf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PresentationUnderConfirmation";
			definition = "Place of presentation when there is a confirmation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PresentationParty1Code.mmObject();
		}

		@Override
		public PresentationParty1Code getValue(PlaceOrUnderConfirmationChoice1 obj) {
			return obj.getPresentationUnderConfirmation();
		}

		@Override
		public void setValue(PlaceOrUnderConfirmationChoice1 obj, PresentationParty1Code value) {
			obj.setPresentationUnderConfirmation(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.PlaceOrUnderConfirmationChoice1.mmPlaceOfPresentation,
						com.tools20022.repository.choice.PlaceOrUnderConfirmationChoice1.mmPresentationUnderConfirmation);
				trace_lazy = () -> UndertakingPlaceOfPresentation.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PlaceOrUnderConfirmationChoice1";
				definition = "Choice between a location and codified form.";
			}
		});
		return mmObject_lazy.get();
	}

	public PlaceOfPresentation1 getPlaceOfPresentation() {
		return placeOfPresentation;
	}

	public PlaceOrUnderConfirmationChoice1 setPlaceOfPresentation(PlaceOfPresentation1 placeOfPresentation) {
		this.placeOfPresentation = Objects.requireNonNull(placeOfPresentation);
		return this;
	}

	public PresentationParty1Code getPresentationUnderConfirmation() {
		return presentationUnderConfirmation;
	}

	public PlaceOrUnderConfirmationChoice1 setPresentationUnderConfirmation(PresentationParty1Code presentationUnderConfirmation) {
		this.presentationUnderConfirmation = Objects.requireNonNull(presentationUnderConfirmation);
		return this;
	}
}