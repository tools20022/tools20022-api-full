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
import com.tools20022.repository.entity.AccountPartyRole;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Party that manages the account on behalf of the account owner, that is
 * manages the registration and booking of entries on the account, calculates
 * balances on the account and provides information about the account.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="AccountServicerRole" src="doc-files/AccountServicerRole.svg">
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
 * <li>{@linkplain com.tools20022.repository.msg.Account5#mmServicer
 * Account5.mmServicer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Account6#mmServicer
 * Account6.mmServicer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountReport1#mmTransferAccountServicerIdentification
 * AccountReport1.mmTransferAccountServicerIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ParentCashAccount1#mmServicer
 * ParentCashAccount1.mmServicer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountReport14#mmTransferAccountServicerIdentification
 * AccountReport14.mmTransferAccountServicerIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Account15#mmServicer
 * Account15.mmServicer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Account16#mmServicer
 * Account16.mmServicer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardAccount3#mmServicer
 * CardAccount3.mmServicer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardAccount1#mmServicer
 * CardAccount1.mmServicer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardAccount6#mmServicer
 * CardAccount6.mmServicer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardAccount4#mmServicer
 * CardAccount4.mmServicer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardAccount5#mmServicer
 * CardAccount5.mmServicer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardAccount2#mmServicer
 * CardAccount2.mmServicer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ParentCashAccount2#mmServicer
 * ParentCashAccount2.mmServicer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Account19#mmServicer
 * Account19.mmServicer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardAccount10#mmServicer
 * CardAccount10.mmServicer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardAccount9#mmServicer
 * CardAccount9.mmServicer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardAccount8#mmServicer
 * CardAccount8.mmServicer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardAccount11#mmServicer
 * CardAccount11.mmServicer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardAccount13#mmServicer
 * CardAccount13.mmServicer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardAccount7#mmServicer
 * CardAccount7.mmServicer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardAccount12#mmServicer
 * CardAccount12.mmServicer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountReport20#mmTransferAccountServicerIdentification
 * AccountReport20.mmTransferAccountServicerIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Account24#mmServicer
 * Account24.mmServicer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardAccount14#mmServicer
 * CardAccount14.mmServicer}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AccountServicerRole"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Party that manages the account on behalf of the account owner, that is manages the registration and booking of entries on the account, calculates balances on the account and provides information about the account."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
public class AccountServicerRole extends AccountPartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AccountServicerRole";
				definition = "Party that manages the account on behalf of the account owner, that is manages the registration and booking of entries on the account, calculates balances on the account and provides information about the account.";
				derivationElement_lazy = () -> Arrays.asList(Account5.mmServicer, Account6.mmServicer, AccountReport1.mmTransferAccountServicerIdentification, ParentCashAccount1.mmServicer,
						AccountReport14.mmTransferAccountServicerIdentification, Account15.mmServicer, Account16.mmServicer, CardAccount3.mmServicer, CardAccount1.mmServicer, CardAccount6.mmServicer, CardAccount4.mmServicer,
						CardAccount5.mmServicer, CardAccount2.mmServicer, ParentCashAccount2.mmServicer, Account19.mmServicer, CardAccount10.mmServicer, CardAccount9.mmServicer, CardAccount8.mmServicer, CardAccount11.mmServicer,
						CardAccount13.mmServicer, CardAccount7.mmServicer, CardAccount12.mmServicer, AccountReport20.mmTransferAccountServicerIdentification, Account24.mmServicer, CardAccount14.mmServicer);
				superType_lazy = () -> AccountPartyRole.mmObject();
			}

			@Override
			public Class<?> getInstanceClass() {
				return AccountServicerRole.class;
			}
		});
		return mmObject_lazy.get();
	}
}