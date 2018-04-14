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
import com.tools20022.repository.choice.*;
import com.tools20022.repository.entity.InvestmentAccountPartyRole;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Entity that holds shares/units on behalf of a legal minor. Although the
 * account is registered under the name of the minor, the custodian retains
 * control of the account.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="CustodianForMinor" src="doc-files/CustodianForMinor.svg">
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
 * {@linkplain com.tools20022.repository.msg.AccountParties2#mmCustodianForMinor
 * AccountParties2.mmCustodianForMinor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties5#mmCustodianForMinor
 * AccountParties5.mmCustodianForMinor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountParties1Choice#mmCustodianForMinor
 * AccountParties1Choice.mmCustodianForMinor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties3#mmCustodianForMinor
 * AccountParties3.mmCustodianForMinor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties4#mmCustodianForMinor
 * AccountParties4.mmCustodianForMinor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountParties2Choice#mmCustodianForMinor
 * AccountParties2Choice.mmCustodianForMinor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountParties3Choice#mmCustodianForMinor
 * AccountParties3Choice.mmCustodianForMinor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountParties4Choice#mmCustodianForMinor
 * AccountParties4Choice.mmCustodianForMinor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountParties7Choice#mmCustodianForMinor
 * AccountParties7Choice.mmCustodianForMinor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountParties6Choice#mmCustodianForMinor
 * AccountParties6Choice.mmCustodianForMinor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountParties5Choice#mmCustodianForMinor
 * AccountParties5Choice.mmCustodianForMinor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties13#mmCustodianForMinor
 * AccountParties13.mmCustodianForMinor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties14#mmCustodianForMinor
 * AccountParties14.mmCustodianForMinor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties15#mmCustodianForMinor
 * AccountParties15.mmCustodianForMinor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties16#mmCustodianForMinor
 * AccountParties16.mmCustodianForMinor}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CustodianForMinor"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Entity that holds shares/units on behalf of a legal minor. Although the account is registered under the name of the minor, the custodian retains control of the account."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
public class CustodianForMinor extends InvestmentAccountPartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CustodianForMinor";
				definition = "Entity that holds shares/units on behalf of a legal minor. Although the account is registered under the name of the minor, the custodian retains control of the account.";
				derivationElement_lazy = () -> Arrays.asList(AccountParties2.mmCustodianForMinor, AccountParties5.mmCustodianForMinor, AccountParties1Choice.mmCustodianForMinor, AccountParties3.mmCustodianForMinor,
						AccountParties4.mmCustodianForMinor, AccountParties2Choice.mmCustodianForMinor, AccountParties3Choice.mmCustodianForMinor, AccountParties4Choice.mmCustodianForMinor, AccountParties7Choice.mmCustodianForMinor,
						AccountParties6Choice.mmCustodianForMinor, AccountParties5Choice.mmCustodianForMinor, AccountParties13.mmCustodianForMinor, AccountParties14.mmCustodianForMinor, AccountParties15.mmCustodianForMinor,
						AccountParties16.mmCustodianForMinor);
				superType_lazy = () -> InvestmentAccountPartyRole.mmObject();
			}

			@Override
			public Class<?> getInstanceClass() {
				return CustodianForMinor.class;
			}
		});
		return mmObject_lazy.get();
	}
}