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
import com.tools20022.repository.codeset.PresentationParty1Code;
import com.tools20022.repository.entity.UndertakingPlaceOfPresentation;
import com.tools20022.repository.msg.PlaceOfPresentation1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * {@linkplain com.tools20022.repository.choice.PlaceOrUnderConfirmationChoice1#PlaceOfPresentation
 * PlaceOrUnderConfirmationChoice1.PlaceOfPresentation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PlaceOrUnderConfirmationChoice1#PresentationUnderConfirmation
 * PlaceOrUnderConfirmationChoice1.PresentationUnderConfirmation}</li>
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
public class PlaceOrUnderConfirmationChoice1 {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Party to which the presentation is to be made.
	 * <p>
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
	public static final MMMessageAssociationEnd PlaceOfPresentation = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> PlaceOrUnderConfirmationChoice1.mmObject();
			businessComponentTrace_lazy = () -> UndertakingPlaceOfPresentation.mmObject();
			isDerived = false;
			xmlTag = "PlcOfPresntn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfPresentation";
			definition = "Party to which the presentation is to be made.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> PlaceOfPresentation1.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Place of presentation when there is a confirmation.
	 * <p>
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
	public static final MMMessageAttribute PresentationUnderConfirmation = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PlaceOrUnderConfirmationChoice1.mmObject();
			isDerived = false;
			xmlTag = "PresntnUdrConf";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PresentationUnderConfirmation";
			definition = "Place of presentation when there is a confirmation.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PresentationParty1Code.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.PlaceOrUnderConfirmationChoice1.PlaceOfPresentation, com.tools20022.repository.choice.PlaceOrUnderConfirmationChoice1.PresentationUnderConfirmation);
				trace_lazy = () -> UndertakingPlaceOfPresentation.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PlaceOrUnderConfirmationChoice1";
				definition = "Choice between a location and codified form.";
			}
		});
		return mmObject_lazy.get();
	}
}