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
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties2#Administrator
 * AccountParties2.Administrator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties5#Administrator
 * AccountParties5.Administrator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties6#Administrator
 * AccountParties6.Administrator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties3#Administrator
 * AccountParties3.Administrator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties4#Administrator
 * AccountParties4.Administrator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties7#Administrator
 * AccountParties7.Administrator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties9#Administrator
 * AccountParties9.Administrator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties8#Administrator
 * AccountParties8.Administrator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties11#Administrator
 * AccountParties11.Administrator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties10#Administrator
 * AccountParties10.Administrator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties12#Administrator
 * AccountParties12.Administrator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties13#Administrator
 * AccountParties13.Administrator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties14#Administrator
 * AccountParties14.Administrator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties15#Administrator
 * AccountParties15.Administrator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties16#Administrator
 * AccountParties16.Administrator}</li>
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
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "AdministratorRole";
				definition = "Entity that has been appointed by a legal authority to act on behalf of a person or organisation that has gone bankrupt.";
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AccountParties2.Administrator, com.tools20022.repository.msg.AccountParties5.Administrator,
						com.tools20022.repository.msg.AccountParties6.Administrator, com.tools20022.repository.msg.AccountParties3.Administrator, com.tools20022.repository.msg.AccountParties4.Administrator,
						com.tools20022.repository.msg.AccountParties7.Administrator, com.tools20022.repository.msg.AccountParties9.Administrator, com.tools20022.repository.msg.AccountParties8.Administrator,
						com.tools20022.repository.msg.AccountParties11.Administrator, com.tools20022.repository.msg.AccountParties10.Administrator, com.tools20022.repository.msg.AccountParties12.Administrator,
						com.tools20022.repository.msg.AccountParties13.Administrator, com.tools20022.repository.msg.AccountParties14.Administrator, com.tools20022.repository.msg.AccountParties15.Administrator,
						com.tools20022.repository.msg.AccountParties16.Administrator);
				superType_lazy = () -> InvestmentAccountPartyRole.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}