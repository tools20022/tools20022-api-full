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
import com.tools20022.repository.entity.InvestmentFundPartyRole;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Grantor role in the hedge funds industry.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Grantor" src="doc-files/Grantor.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.InvestmentFundPartyRole
 * InvestmentFundPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties5#mmGranter
 * AccountParties5.mmGranter}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties6#mmGranter
 * AccountParties6.mmGranter}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties4#mmGranter
 * AccountParties4.mmGranter}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties7#mmGranter
 * AccountParties7.mmGranter}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties9#mmGranter
 * AccountParties9.mmGranter}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties8#mmGranter
 * AccountParties8.mmGranter}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties11#mmGranter
 * AccountParties11.mmGranter}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties10#mmGranter
 * AccountParties10.mmGranter}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties12#mmGranter
 * AccountParties12.mmGranter}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties13#mmGranter
 * AccountParties13.mmGranter}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties14#mmGranter
 * AccountParties14.mmGranter}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties15#mmGranter
 * AccountParties15.mmGranter}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties16#mmGranter
 * AccountParties16.mmGranter}</li>
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
 * "Grantor"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Grantor role in the hedge funds industry."</li>
 * </ul>
 */
public class Grantor extends InvestmentFundPartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Grantor";
				definition = "Grantor role in the hedge funds industry.";
				derivationElement_lazy = () -> Arrays.asList(AccountParties5.mmGranter, AccountParties6.mmGranter, AccountParties4.mmGranter, AccountParties7.mmGranter, AccountParties9.mmGranter, AccountParties8.mmGranter,
						AccountParties11.mmGranter, AccountParties10.mmGranter, AccountParties12.mmGranter, AccountParties13.mmGranter, AccountParties14.mmGranter, AccountParties15.mmGranter, AccountParties16.mmGranter);
				superType_lazy = () -> InvestmentFundPartyRole.mmObject();
			}

			@Override
			public Class<?> getInstanceClass() {
				return Grantor.class;
			}
		});
		return mmObject_lazy.get();
	}
}