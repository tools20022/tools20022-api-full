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
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Party that issues the undertaking (or counter-undertaking).
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="UndertakingIssuer" src="doc-files/UndertakingIssuer.svg">
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
 * <li>{@linkplain com.tools20022.repository.msg.Undertaking9#mmIssuer
 * Undertaking9.mmIssuer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Undertaking6#mmIssuer
 * Undertaking6.mmIssuer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Undertaking7#mmIssuer
 * Undertaking7.mmIssuer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Undertaking1#mmIssuer
 * Undertaking1.mmIssuer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Undertaking3#mmIssuer
 * Undertaking3.mmIssuer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Undertaking8#mmIssuer
 * Undertaking8.mmIssuer}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "UndertakingIssuer"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Party that issues the undertaking (or counter-undertaking)."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
public class UndertakingIssuer extends UndertakingPartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "UndertakingIssuer";
				definition = "Party that issues the undertaking (or counter-undertaking).";
				derivationElement_lazy = () -> Arrays.asList(Undertaking9.mmIssuer, Undertaking6.mmIssuer, Undertaking7.mmIssuer, Undertaking1.mmIssuer, Undertaking3.mmIssuer, Undertaking8.mmIssuer);
				superType_lazy = () -> UndertakingPartyRole.mmObject();
			}

			@Override
			public Class<?> getInstanceClass() {
				return UndertakingIssuer.class;
			}
		});
		return mmObject_lazy.get();
	}
}