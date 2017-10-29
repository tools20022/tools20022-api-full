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
 * Entity that has been appointed by a legal authority to act on behalf of a
 * person judged to be incapacitated.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="LegalGuardianRole" src="doc-files/LegalGuardianRole.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties2#LegalGuardian
 * AccountParties2.LegalGuardian}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties5#LegalGuardian
 * AccountParties5.LegalGuardian}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties6#LegalGuardian
 * AccountParties6.LegalGuardian}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties3#LegalGuardian
 * AccountParties3.LegalGuardian}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties4#LegalGuardian
 * AccountParties4.LegalGuardian}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties7#LegalGuardian
 * AccountParties7.LegalGuardian}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties9#LegalGuardian
 * AccountParties9.LegalGuardian}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties8#LegalGuardian
 * AccountParties8.LegalGuardian}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties11#LegalGuardian
 * AccountParties11.LegalGuardian}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties10#LegalGuardian
 * AccountParties10.LegalGuardian}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties12#LegalGuardian
 * AccountParties12.LegalGuardian}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties13#LegalGuardian
 * AccountParties13.LegalGuardian}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties14#LegalGuardian
 * AccountParties14.LegalGuardian}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties15#LegalGuardian
 * AccountParties15.LegalGuardian}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties16#LegalGuardian
 * AccountParties16.LegalGuardian}</li>
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
 * "LegalGuardianRole"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Entity that has been appointed by a legal authority to act on behalf of a person judged to be incapacitated."
 * </li>
 * </ul>
 */
public class LegalGuardianRole extends InvestmentAccountPartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "LegalGuardianRole";
				definition = "Entity that has been appointed by a legal authority to act on behalf of a person judged to be incapacitated.";
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AccountParties2.LegalGuardian, com.tools20022.repository.msg.AccountParties5.LegalGuardian,
						com.tools20022.repository.msg.AccountParties6.LegalGuardian, com.tools20022.repository.msg.AccountParties3.LegalGuardian, com.tools20022.repository.msg.AccountParties4.LegalGuardian,
						com.tools20022.repository.msg.AccountParties7.LegalGuardian, com.tools20022.repository.msg.AccountParties9.LegalGuardian, com.tools20022.repository.msg.AccountParties8.LegalGuardian,
						com.tools20022.repository.msg.AccountParties11.LegalGuardian, com.tools20022.repository.msg.AccountParties10.LegalGuardian, com.tools20022.repository.msg.AccountParties12.LegalGuardian,
						com.tools20022.repository.msg.AccountParties13.LegalGuardian, com.tools20022.repository.msg.AccountParties14.LegalGuardian, com.tools20022.repository.msg.AccountParties15.LegalGuardian,
						com.tools20022.repository.msg.AccountParties16.LegalGuardian);
				superType_lazy = () -> InvestmentAccountPartyRole.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}