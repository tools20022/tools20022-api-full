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
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties2#CustodianForMinor
 * AccountParties2.CustodianForMinor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties5#CustodianForMinor
 * AccountParties5.CustodianForMinor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountParties1Choice#CustodianForMinor
 * AccountParties1Choice.CustodianForMinor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties3#CustodianForMinor
 * AccountParties3.CustodianForMinor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties4#CustodianForMinor
 * AccountParties4.CustodianForMinor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountParties2Choice#CustodianForMinor
 * AccountParties2Choice.CustodianForMinor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountParties3Choice#CustodianForMinor
 * AccountParties3Choice.CustodianForMinor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountParties4Choice#CustodianForMinor
 * AccountParties4Choice.CustodianForMinor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountParties7Choice#CustodianForMinor
 * AccountParties7Choice.CustodianForMinor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountParties6Choice#CustodianForMinor
 * AccountParties6Choice.CustodianForMinor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountParties5Choice#CustodianForMinor
 * AccountParties5Choice.CustodianForMinor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties13#CustodianForMinor
 * AccountParties13.CustodianForMinor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties14#CustodianForMinor
 * AccountParties14.CustodianForMinor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties15#CustodianForMinor
 * AccountParties15.CustodianForMinor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties16#CustodianForMinor
 * AccountParties16.CustodianForMinor}</li>
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
 * "CustodianForMinor"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Entity that holds shares/units on behalf of a legal minor. Although the account is registered under the name of the minor, the custodian retains control of the account."
 * </li>
 * </ul>
 */
public class CustodianForMinor extends InvestmentAccountPartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CustodianForMinor";
				definition = "Entity that holds shares/units on behalf of a legal minor. Although the account is registered under the name of the minor, the custodian retains control of the account.";
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AccountParties2.CustodianForMinor, com.tools20022.repository.msg.AccountParties5.CustodianForMinor,
						com.tools20022.repository.choice.AccountParties1Choice.CustodianForMinor, com.tools20022.repository.msg.AccountParties3.CustodianForMinor, com.tools20022.repository.msg.AccountParties4.CustodianForMinor,
						com.tools20022.repository.choice.AccountParties2Choice.CustodianForMinor, com.tools20022.repository.choice.AccountParties3Choice.CustodianForMinor,
						com.tools20022.repository.choice.AccountParties4Choice.CustodianForMinor, com.tools20022.repository.choice.AccountParties7Choice.CustodianForMinor,
						com.tools20022.repository.choice.AccountParties6Choice.CustodianForMinor, com.tools20022.repository.choice.AccountParties5Choice.CustodianForMinor, com.tools20022.repository.msg.AccountParties13.CustodianForMinor,
						com.tools20022.repository.msg.AccountParties14.CustodianForMinor, com.tools20022.repository.msg.AccountParties15.CustodianForMinor, com.tools20022.repository.msg.AccountParties16.CustodianForMinor);
				superType_lazy = () -> InvestmentAccountPartyRole.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}