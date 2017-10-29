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
import com.tools20022.repository.entity.AccountPartyRole;
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
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Account5#Servicer
 * Account5.Servicer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Account6#Servicer
 * Account6.Servicer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountReport1#TransferAccountServicerIdentification
 * AccountReport1.TransferAccountServicerIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ParentCashAccount1#Servicer
 * ParentCashAccount1.Servicer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountReport14#TransferAccountServicerIdentification
 * AccountReport14.TransferAccountServicerIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Account15#Servicer
 * Account15.Servicer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Account16#Servicer
 * Account16.Servicer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardAccount3#Servicer
 * CardAccount3.Servicer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardAccount1#Servicer
 * CardAccount1.Servicer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardAccount6#Servicer
 * CardAccount6.Servicer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardAccount4#Servicer
 * CardAccount4.Servicer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardAccount5#Servicer
 * CardAccount5.Servicer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardAccount2#Servicer
 * CardAccount2.Servicer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ParentCashAccount2#Servicer
 * ParentCashAccount2.Servicer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Account19#Servicer
 * Account19.Servicer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardAccount10#Servicer
 * CardAccount10.Servicer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardAccount9#Servicer
 * CardAccount9.Servicer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardAccount8#Servicer
 * CardAccount8.Servicer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardAccount11#Servicer
 * CardAccount11.Servicer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardAccount13#Servicer
 * CardAccount13.Servicer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardAccount7#Servicer
 * CardAccount7.Servicer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardAccount12#Servicer
 * CardAccount12.Servicer}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.AccountPartyRole
 * AccountPartyRole}</li>
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
 * "AccountServicerRole"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Party that manages the account on behalf of the account owner, that is manages the registration and booking of entries on the account, calculates balances on the account and provides information about the account."
 * </li>
 * </ul>
 */
public class AccountServicerRole extends AccountPartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "AccountServicerRole";
				definition = "Party that manages the account on behalf of the account owner, that is manages the registration and booking of entries on the account, calculates balances on the account and provides information about the account.";
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Account5.Servicer, com.tools20022.repository.msg.Account6.Servicer,
						com.tools20022.repository.msg.AccountReport1.TransferAccountServicerIdentification, com.tools20022.repository.msg.ParentCashAccount1.Servicer,
						com.tools20022.repository.msg.AccountReport14.TransferAccountServicerIdentification, com.tools20022.repository.msg.Account15.Servicer, com.tools20022.repository.msg.Account16.Servicer,
						com.tools20022.repository.msg.CardAccount3.Servicer, com.tools20022.repository.msg.CardAccount1.Servicer, com.tools20022.repository.msg.CardAccount6.Servicer, com.tools20022.repository.msg.CardAccount4.Servicer,
						com.tools20022.repository.msg.CardAccount5.Servicer, com.tools20022.repository.msg.CardAccount2.Servicer, com.tools20022.repository.msg.ParentCashAccount2.Servicer, com.tools20022.repository.msg.Account19.Servicer,
						com.tools20022.repository.msg.CardAccount10.Servicer, com.tools20022.repository.msg.CardAccount9.Servicer, com.tools20022.repository.msg.CardAccount8.Servicer, com.tools20022.repository.msg.CardAccount11.Servicer,
						com.tools20022.repository.msg.CardAccount13.Servicer, com.tools20022.repository.msg.CardAccount7.Servicer, com.tools20022.repository.msg.CardAccount12.Servicer);
				superType_lazy = () -> AccountPartyRole.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}