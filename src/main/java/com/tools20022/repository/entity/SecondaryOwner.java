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
 * Entity that is not the primary owner when the ownership of the investment
 * account is split among several owners.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SecondaryOwner" src="doc-files/SecondaryOwner.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties2#mmSecondaryOwner
 * AccountParties2.mmSecondaryOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties5#mmSecondaryOwner
 * AccountParties5.mmSecondaryOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties6#mmSecondaryOwner
 * AccountParties6.mmSecondaryOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties3#mmSecondaryOwner
 * AccountParties3.mmSecondaryOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties4#mmSecondaryOwner
 * AccountParties4.mmSecondaryOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties7#mmSecondaryOwner
 * AccountParties7.mmSecondaryOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties9#mmSecondaryOwner
 * AccountParties9.mmSecondaryOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties8#mmSecondaryOwner
 * AccountParties8.mmSecondaryOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties11#mmSecondaryOwner
 * AccountParties11.mmSecondaryOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties10#mmSecondaryOwner
 * AccountParties10.mmSecondaryOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties12#mmSecondaryOwner
 * AccountParties12.mmSecondaryOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties13#mmSecondaryOwner
 * AccountParties13.mmSecondaryOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties14#mmSecondaryOwner
 * AccountParties14.mmSecondaryOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties15#mmSecondaryOwner
 * AccountParties15.mmSecondaryOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties16#mmSecondaryOwner
 * AccountParties16.mmSecondaryOwner}</li>
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
 * "SecondaryOwner"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Entity that is not the primary owner when the ownership of the investment account is split among several owners."
 * </li>
 * </ul>
 */
public class SecondaryOwner extends InvestmentAccountPartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SecondaryOwner";
				definition = "Entity that is not the primary owner when the ownership of the investment account is split among several owners.";
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AccountParties2.mmSecondaryOwner, com.tools20022.repository.msg.AccountParties5.mmSecondaryOwner,
						com.tools20022.repository.msg.AccountParties6.mmSecondaryOwner, com.tools20022.repository.msg.AccountParties3.mmSecondaryOwner, com.tools20022.repository.msg.AccountParties4.mmSecondaryOwner,
						com.tools20022.repository.msg.AccountParties7.mmSecondaryOwner, com.tools20022.repository.msg.AccountParties9.mmSecondaryOwner, com.tools20022.repository.msg.AccountParties8.mmSecondaryOwner,
						com.tools20022.repository.msg.AccountParties11.mmSecondaryOwner, com.tools20022.repository.msg.AccountParties10.mmSecondaryOwner, com.tools20022.repository.msg.AccountParties12.mmSecondaryOwner,
						com.tools20022.repository.msg.AccountParties13.mmSecondaryOwner, com.tools20022.repository.msg.AccountParties14.mmSecondaryOwner, com.tools20022.repository.msg.AccountParties15.mmSecondaryOwner,
						com.tools20022.repository.msg.AccountParties16.mmSecondaryOwner);
				superType_lazy = () -> InvestmentAccountPartyRole.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}