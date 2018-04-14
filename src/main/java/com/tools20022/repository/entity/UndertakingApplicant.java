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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.UndertakingPartyRole;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.Undertaking1;
import com.tools20022.repository.msg.Undertaking3;
import com.tools20022.repository.msg.Undertaking4;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Party named in an undertaking as the party on whose behalf the undertaking is
 * issued.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="UndertakingApplicant" src="doc-files/UndertakingApplicant.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.UndertakingPartyRole
 * UndertakingPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Undertaking1#mmApplicant
 * Undertaking1.mmApplicant}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Undertaking4#mmApplicant
 * Undertaking4.mmApplicant}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Undertaking3#mmApplicant
 * Undertaking3.mmApplicant}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "UndertakingApplicant"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Party named in an undertaking as the party on whose behalf the undertaking is issued."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
public class UndertakingApplicant extends UndertakingPartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "UndertakingApplicant";
				definition = "Party named in an undertaking as the party on whose behalf the undertaking is issued.";
				derivationElement_lazy = () -> Arrays.asList(Undertaking1.mmApplicant, Undertaking4.mmApplicant, Undertaking3.mmApplicant);
				superType_lazy = () -> UndertakingPartyRole.mmObject();
			}

			@Override
			public Class<?> getInstanceClass() {
				return UndertakingApplicant.class;
			}
		});
		return mmObject_lazy.get();
	}
}