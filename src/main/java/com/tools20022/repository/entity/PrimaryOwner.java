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
import com.tools20022.repository.msg.AccountParties2;
import com.tools20022.repository.msg.AccountParties3;
import com.tools20022.repository.msg.AccountParties4;
import com.tools20022.repository.msg.AccountParties5;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Single owner of the investment account or, when the ownership is split among
 * several owners, the primary owner is the one giving its address and account
 * details for the registration.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="PrimaryOwner" src="doc-files/PrimaryOwner.svg">
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
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties2#mmPrimaryOwner
 * AccountParties2.mmPrimaryOwner}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties5#mmPrimaryOwner
 * AccountParties5.mmPrimaryOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountParties1Choice#mmPrimaryOwner
 * AccountParties1Choice.mmPrimaryOwner}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties3#mmPrimaryOwner
 * AccountParties3.mmPrimaryOwner}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties4#mmPrimaryOwner
 * AccountParties4.mmPrimaryOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountParties2Choice#mmPrimaryOwner
 * AccountParties2Choice.mmPrimaryOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountParties3Choice#mmPrimaryOwner
 * AccountParties3Choice.mmPrimaryOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountParties4Choice#mmPrimaryOwner
 * AccountParties4Choice.mmPrimaryOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountParties7Choice#mmPrimaryOwner
 * AccountParties7Choice.mmPrimaryOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountParties6Choice#mmPrimaryOwner
 * AccountParties6Choice.mmPrimaryOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountParties5Choice#mmPrimaryOwner
 * AccountParties5Choice.mmPrimaryOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountParties9Choice#mmPrimaryOwner
 * AccountParties9Choice.mmPrimaryOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountParties8Choice#mmPrimaryOwner
 * AccountParties8Choice.mmPrimaryOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountParties11Choice#mmPrimaryOwner
 * AccountParties11Choice.mmPrimaryOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountParties10Choice#mmPrimaryOwner
 * AccountParties10Choice.mmPrimaryOwner}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PrimaryOwner"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Single owner of the investment account or, when the ownership is split among several owners, the primary owner is the one giving its address and account details for the registration."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
public class PrimaryOwner extends InvestmentAccountPartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PrimaryOwner";
				definition = "Single owner of the investment account or, when the ownership is split among several owners, the primary owner is the one giving its address and account details for the registration.";
				derivationElement_lazy = () -> Arrays.asList(AccountParties2.mmPrimaryOwner, AccountParties5.mmPrimaryOwner, AccountParties1Choice.mmPrimaryOwner, AccountParties3.mmPrimaryOwner, AccountParties4.mmPrimaryOwner,
						AccountParties2Choice.mmPrimaryOwner, AccountParties3Choice.mmPrimaryOwner, AccountParties4Choice.mmPrimaryOwner, AccountParties7Choice.mmPrimaryOwner, AccountParties6Choice.mmPrimaryOwner,
						AccountParties5Choice.mmPrimaryOwner, AccountParties9Choice.mmPrimaryOwner, AccountParties8Choice.mmPrimaryOwner, AccountParties11Choice.mmPrimaryOwner, AccountParties10Choice.mmPrimaryOwner);
				superType_lazy = () -> InvestmentAccountPartyRole.mmObject();
			}

			@Override
			public Class<?> getInstanceClass() {
				return PrimaryOwner.class;
			}
		});
		return mmObject_lazy.get();
	}
}