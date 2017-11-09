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
 * Entity that has been appointed by a legal authority to act on behalf of a
 * person or organisation that has gone bankrupt.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="AdministratorRole" src="doc-files/AdministratorRole.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties2#mmAdministrator
 * AccountParties2.mmAdministrator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties5#mmAdministrator
 * AccountParties5.mmAdministrator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties6#mmAdministrator
 * AccountParties6.mmAdministrator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties3#mmAdministrator
 * AccountParties3.mmAdministrator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties4#mmAdministrator
 * AccountParties4.mmAdministrator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties7#mmAdministrator
 * AccountParties7.mmAdministrator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties9#mmAdministrator
 * AccountParties9.mmAdministrator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties8#mmAdministrator
 * AccountParties8.mmAdministrator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties11#mmAdministrator
 * AccountParties11.mmAdministrator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties10#mmAdministrator
 * AccountParties10.mmAdministrator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties12#mmAdministrator
 * AccountParties12.mmAdministrator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties13#mmAdministrator
 * AccountParties13.mmAdministrator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties14#mmAdministrator
 * AccountParties14.mmAdministrator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties15#mmAdministrator
 * AccountParties15.mmAdministrator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties16#mmAdministrator
 * AccountParties16.mmAdministrator}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.InvestmentAccountPartyRole
 * InvestmentAccountPartyRole}</li>
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
 * "AdministratorRole"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Entity that has been appointed by a legal authority to act on behalf of a person or organisation that has gone bankrupt."
 * </li>
 * </ul>
 */
public class AdministratorRole extends InvestmentAccountPartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AdministratorRole";
				definition = "Entity that has been appointed by a legal authority to act on behalf of a person or organisation that has gone bankrupt.";
				derivationElement_lazy = () -> Arrays.asList(AccountParties2.mmAdministrator, AccountParties5.mmAdministrator, AccountParties6.mmAdministrator, AccountParties3.mmAdministrator, AccountParties4.mmAdministrator,
						AccountParties7.mmAdministrator, AccountParties9.mmAdministrator, AccountParties8.mmAdministrator, AccountParties11.mmAdministrator, AccountParties10.mmAdministrator, AccountParties12.mmAdministrator,
						AccountParties13.mmAdministrator, AccountParties14.mmAdministrator, AccountParties15.mmAdministrator, AccountParties16.mmAdministrator);
				superType_lazy = () -> InvestmentAccountPartyRole.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}