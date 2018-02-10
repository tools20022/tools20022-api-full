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
import com.tools20022.repository.choice.AccountOwner1Choice;
import com.tools20022.repository.choice.AccountOwner2Choice;
import com.tools20022.repository.entity.AccountPartyRole;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Party that legally owns the account.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="AccountOwnerRole" src="doc-files/AccountOwnerRole.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.AccountPartyRole
 * AccountPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.AccountAndParties2#mmRole
 * AccountAndParties2.mmRole}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardAccount3#mmAccountOwner
 * CardAccount3.mmAccountOwner}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardAccount1#mmAccountOwner
 * CardAccount1.mmAccountOwner}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardAccount4#mmAccountOwner
 * CardAccount4.mmAccountOwner}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardAccount2#mmAccountOwner
 * CardAccount2.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification79#mmAccountOwner
 * PartyIdentification79.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount52#mmAccountOwner
 * InvestmentAccount52.mmAccountOwner}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardAccount10#mmAccountOwner
 * CardAccount10.mmAccountOwner}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardAccount9#mmAccountOwner
 * CardAccount9.mmAccountOwner}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardAccount8#mmAccountOwner
 * CardAccount8.mmAccountOwner}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardAccount7#mmAccountOwner
 * CardAccount7.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount64#mmAccountOwner
 * InvestmentAccount64.mmAccountOwner}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.OwnerType1 OwnerType1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountRole1 AccountRole1}</li>
 * <li>{@linkplain com.tools20022.repository.choice.AccountOwner1Choice
 * AccountOwner1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.AccountOwner2Choice
 * AccountOwner2Choice}</li>
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
 * "AccountOwnerRole"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Party that legally owns the account."</li>
 * </ul>
 */
public class AccountOwnerRole extends AccountPartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AccountOwnerRole";
				definition = "Party that legally owns the account.";
				derivationElement_lazy = () -> Arrays.asList(AccountAndParties2.mmRole, CardAccount3.mmAccountOwner, CardAccount1.mmAccountOwner, CardAccount4.mmAccountOwner, CardAccount2.mmAccountOwner,
						PartyIdentification79.mmAccountOwner, InvestmentAccount52.mmAccountOwner, CardAccount10.mmAccountOwner, CardAccount9.mmAccountOwner, CardAccount8.mmAccountOwner, CardAccount7.mmAccountOwner,
						InvestmentAccount64.mmAccountOwner);
				superType_lazy = () -> AccountPartyRole.mmObject();
				derivationComponent_lazy = () -> Arrays.asList(OwnerType1.mmObject(), AccountRole1.mmObject(), AccountOwner1Choice.mmObject(), AccountOwner2Choice.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return AccountOwnerRole.class;
			}
		});
		return mmObject_lazy.get();
	}
}