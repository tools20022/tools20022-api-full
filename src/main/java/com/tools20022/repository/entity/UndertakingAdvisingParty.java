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

import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.entity.UndertakingPartyRole;
import com.tools20022.repository.msg.AdvisingPartyAdditionalInformation1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Party that advises the undertaking at the request of the issuer. For further
 * clarification, reference the applicable rules to which the undertaking is
 * subject.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="UndertakingAdvisingParty"
 * src="doc-files/UndertakingAdvisingParty.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Amendment2#FirstAdvisingPartyAdditionalInformation
 * Amendment2.FirstAdvisingPartyAdditionalInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Amendment2#SecondAdvisingPartyAdditionalInformation
 * Amendment2.SecondAdvisingPartyAdditionalInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Undertaking1#SecondAdvisingParty
 * Undertaking1.SecondAdvisingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Undertaking4#SecondAdvisingParty
 * Undertaking4.SecondAdvisingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Undertaking3#SecondAdvisingParty
 * Undertaking3.SecondAdvisingParty}</li>
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
 * {@linkplain com.tools20022.repository.msg.AdvisingPartyAdditionalInformation1
 * AdvisingPartyAdditionalInformation1}</li>
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
 * "UndertakingAdvisingParty"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Party that advises the undertaking at the request of the issuer. For further clarification, reference the applicable rules to which the undertaking is subject."
 * </li>
 * </ul>
 */
public class UndertakingAdvisingParty extends UndertakingPartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "UndertakingAdvisingParty";
				definition = "Party that advises the undertaking at the request of the issuer. For further clarification, reference the applicable rules to which the undertaking is subject.";
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Amendment2.FirstAdvisingPartyAdditionalInformation, com.tools20022.repository.msg.Amendment2.SecondAdvisingPartyAdditionalInformation,
						com.tools20022.repository.msg.Undertaking1.SecondAdvisingParty, com.tools20022.repository.msg.Undertaking4.SecondAdvisingParty, com.tools20022.repository.msg.Undertaking3.SecondAdvisingParty);
				superType_lazy = () -> UndertakingPartyRole.mmObject();
				derivationComponent_lazy = () -> Arrays.asList(AdvisingPartyAdditionalInformation1.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}