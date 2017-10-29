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
import com.tools20022.repository.msg.Beneficiary1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Party in whose favour the undertaking (or counter-undertaking) is issued.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="UndertakingBeneficiary"
 * src="doc-files/UndertakingBeneficiary.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Amendment3#NewBeneficiary
 * Amendment3.NewBeneficiary}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Undertaking2#Beneficiary
 * Undertaking2.Beneficiary}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Undertaking1#Beneficiary
 * Undertaking1.Beneficiary}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Undertaking4#Beneficiary
 * Undertaking4.Beneficiary}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Undertaking3#Beneficiary
 * Undertaking3.Beneficiary}</li>
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
 * <li>{@linkplain com.tools20022.repository.msg.Beneficiary1 Beneficiary1}</li>
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
 * "UndertakingBeneficiary"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Party in whose favour the undertaking (or counter-undertaking) is issued."</li>
 * </ul>
 */
public class UndertakingBeneficiary extends UndertakingPartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "UndertakingBeneficiary";
				definition = "Party in whose favour the undertaking (or counter-undertaking) is issued.";
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Amendment3.NewBeneficiary, com.tools20022.repository.msg.Undertaking2.Beneficiary, com.tools20022.repository.msg.Undertaking1.Beneficiary,
						com.tools20022.repository.msg.Undertaking4.Beneficiary, com.tools20022.repository.msg.Undertaking3.Beneficiary);
				superType_lazy = () -> UndertakingPartyRole.mmObject();
				derivationComponent_lazy = () -> Arrays.asList(Beneficiary1.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}