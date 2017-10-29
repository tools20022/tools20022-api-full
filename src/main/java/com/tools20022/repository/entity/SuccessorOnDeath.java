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
import com.tools20022.repository.entity.InvestmentAccountPartyRole;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Deceased's estate, or successor, to whom the respective percentage of
 * ownership will be transferred upon the death of one of the owners.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SuccessorOnDeath" src="doc-files/SuccessorOnDeath.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties2#SuccessorOnDeath
 * AccountParties2.SuccessorOnDeath}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties5#SuccessorOnDeath
 * AccountParties5.SuccessorOnDeath}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties6#SuccessorOnDeath
 * AccountParties6.SuccessorOnDeath}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties3#SuccessorOnDeath
 * AccountParties3.SuccessorOnDeath}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties4#SuccessorOnDeath
 * AccountParties4.SuccessorOnDeath}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties7#SuccessorOnDeath
 * AccountParties7.SuccessorOnDeath}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties9#SuccessorOnDeath
 * AccountParties9.SuccessorOnDeath}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties8#SuccessorOnDeath
 * AccountParties8.SuccessorOnDeath}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties11#SuccessorOnDeath
 * AccountParties11.SuccessorOnDeath}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties10#SuccessorOnDeath
 * AccountParties10.SuccessorOnDeath}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties12#SuccessorOnDeath
 * AccountParties12.SuccessorOnDeath}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties13#SuccessorOnDeath
 * AccountParties13.SuccessorOnDeath}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties14#SuccessorOnDeath
 * AccountParties14.SuccessorOnDeath}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties15#SuccessorOnDeath
 * AccountParties15.SuccessorOnDeath}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties16#SuccessorOnDeath
 * AccountParties16.SuccessorOnDeath}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.InvestmentAccountPartyRole
 * InvestmentAccountPartyRole}</li>
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
 * "SuccessorOnDeath"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Deceased's estate, or successor, to whom the respective percentage of ownership will be transferred upon the death of one of the owners."
 * </li>
 * </ul>
 */
public class SuccessorOnDeath extends InvestmentAccountPartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SuccessorOnDeath";
				definition = "Deceased's estate, or successor, to whom the respective percentage of ownership will be transferred upon the death of one of the owners.";
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AccountParties2.SuccessorOnDeath, com.tools20022.repository.msg.AccountParties5.SuccessorOnDeath,
						com.tools20022.repository.msg.AccountParties6.SuccessorOnDeath, com.tools20022.repository.msg.AccountParties3.SuccessorOnDeath, com.tools20022.repository.msg.AccountParties4.SuccessorOnDeath,
						com.tools20022.repository.msg.AccountParties7.SuccessorOnDeath, com.tools20022.repository.msg.AccountParties9.SuccessorOnDeath, com.tools20022.repository.msg.AccountParties8.SuccessorOnDeath,
						com.tools20022.repository.msg.AccountParties11.SuccessorOnDeath, com.tools20022.repository.msg.AccountParties10.SuccessorOnDeath, com.tools20022.repository.msg.AccountParties12.SuccessorOnDeath,
						com.tools20022.repository.msg.AccountParties13.SuccessorOnDeath, com.tools20022.repository.msg.AccountParties14.SuccessorOnDeath, com.tools20022.repository.msg.AccountParties15.SuccessorOnDeath,
						com.tools20022.repository.msg.AccountParties16.SuccessorOnDeath);
				superType_lazy = () -> InvestmentAccountPartyRole.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}