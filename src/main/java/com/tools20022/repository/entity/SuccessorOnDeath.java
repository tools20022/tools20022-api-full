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
import com.tools20022.repository.entity.InvestmentAccountPartyRole;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
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
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.InvestmentAccountPartyRole
 * InvestmentAccountPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties2#mmSuccessorOnDeath
 * AccountParties2.mmSuccessorOnDeath}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties5#mmSuccessorOnDeath
 * AccountParties5.mmSuccessorOnDeath}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties6#mmSuccessorOnDeath
 * AccountParties6.mmSuccessorOnDeath}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties3#mmSuccessorOnDeath
 * AccountParties3.mmSuccessorOnDeath}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties4#mmSuccessorOnDeath
 * AccountParties4.mmSuccessorOnDeath}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties7#mmSuccessorOnDeath
 * AccountParties7.mmSuccessorOnDeath}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties9#mmSuccessorOnDeath
 * AccountParties9.mmSuccessorOnDeath}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties8#mmSuccessorOnDeath
 * AccountParties8.mmSuccessorOnDeath}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties11#mmSuccessorOnDeath
 * AccountParties11.mmSuccessorOnDeath}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties10#mmSuccessorOnDeath
 * AccountParties10.mmSuccessorOnDeath}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties12#mmSuccessorOnDeath
 * AccountParties12.mmSuccessorOnDeath}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties13#mmSuccessorOnDeath
 * AccountParties13.mmSuccessorOnDeath}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties14#mmSuccessorOnDeath
 * AccountParties14.mmSuccessorOnDeath}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties15#mmSuccessorOnDeath
 * AccountParties15.mmSuccessorOnDeath}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties16#mmSuccessorOnDeath
 * AccountParties16.mmSuccessorOnDeath}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SuccessorOnDeath";
				definition = "Deceased's estate, or successor, to whom the respective percentage of ownership will be transferred upon the death of one of the owners.";
				derivationElement_lazy = () -> Arrays.asList(AccountParties2.mmSuccessorOnDeath, AccountParties5.mmSuccessorOnDeath, AccountParties6.mmSuccessorOnDeath, AccountParties3.mmSuccessorOnDeath,
						AccountParties4.mmSuccessorOnDeath, AccountParties7.mmSuccessorOnDeath, AccountParties9.mmSuccessorOnDeath, AccountParties8.mmSuccessorOnDeath, AccountParties11.mmSuccessorOnDeath,
						AccountParties10.mmSuccessorOnDeath, AccountParties12.mmSuccessorOnDeath, AccountParties13.mmSuccessorOnDeath, AccountParties14.mmSuccessorOnDeath, AccountParties15.mmSuccessorOnDeath,
						AccountParties16.mmSuccessorOnDeath);
				superType_lazy = () -> InvestmentAccountPartyRole.mmObject();
			}

			@Override
			public Class<?> getInstanceClass() {
				return SuccessorOnDeath.class;
			}
		});
		return mmObject_lazy.get();
	}
}