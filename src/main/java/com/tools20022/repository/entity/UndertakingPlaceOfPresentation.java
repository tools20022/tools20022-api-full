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

package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.choice.PlaceOrUnderConfirmationChoice1;
import com.tools20022.repository.codeset.PresentationPartyCode;
import com.tools20022.repository.entity.UndertakingPartyRole;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Place at which the documents must be presented.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="UndertakingPlaceOfPresentation"
 * src="doc-files/UndertakingPlaceOfPresentation.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.UndertakingPlaceOfPresentation#PresentationUnderConfirmation
 * UndertakingPlaceOfPresentation.PresentationUnderConfirmation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PlaceOrUnderConfirmationChoice1#PlaceOfPresentation
 * PlaceOrUnderConfirmationChoice1.PlaceOfPresentation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.UndertakingPartyRole
 * UndertakingPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PlaceOrUnderConfirmationChoice1
 * PlaceOrUnderConfirmationChoice1}</li>
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
 * "UndertakingPlaceOfPresentation"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Place at which the documents must be presented."</li>
 * </ul>
 */
public class UndertakingPlaceOfPresentation extends UndertakingPartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies the type of party to which a presentation under confirmation is
	 * required.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PresentationPartyCode
	 * PresentationPartyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.UndertakingPlaceOfPresentation
	 * UndertakingPlaceOfPresentation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PresentationUnderConfirmation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of party to which a presentation under confirmation is required."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PresentationUnderConfirmation = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> UndertakingPlaceOfPresentation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PresentationUnderConfirmation";
			definition = "Specifies the type of party to which a presentation under confirmation is required.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PresentationPartyCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "UndertakingPlaceOfPresentation";
				definition = "Place at which the documents must be presented.";
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.PlaceOrUnderConfirmationChoice1.PlaceOfPresentation);
				superType_lazy = () -> UndertakingPartyRole.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.UndertakingPlaceOfPresentation.PresentationUnderConfirmation);
				derivationComponent_lazy = () -> Arrays.asList(PlaceOrUnderConfirmationChoice1.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}