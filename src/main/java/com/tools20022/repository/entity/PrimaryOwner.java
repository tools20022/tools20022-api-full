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
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties2#PrimaryOwner
 * AccountParties2.PrimaryOwner}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties5#PrimaryOwner
 * AccountParties5.PrimaryOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountParties1Choice#PrimaryOwner
 * AccountParties1Choice.PrimaryOwner}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties3#PrimaryOwner
 * AccountParties3.PrimaryOwner}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties4#PrimaryOwner
 * AccountParties4.PrimaryOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountParties2Choice#PrimaryOwner
 * AccountParties2Choice.PrimaryOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountParties3Choice#PrimaryOwner
 * AccountParties3Choice.PrimaryOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountParties4Choice#PrimaryOwner
 * AccountParties4Choice.PrimaryOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountParties7Choice#PrimaryOwner
 * AccountParties7Choice.PrimaryOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountParties6Choice#PrimaryOwner
 * AccountParties6Choice.PrimaryOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountParties5Choice#PrimaryOwner
 * AccountParties5Choice.PrimaryOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountParties9Choice#PrimaryOwner
 * AccountParties9Choice.PrimaryOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountParties8Choice#PrimaryOwner
 * AccountParties8Choice.PrimaryOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountParties11Choice#PrimaryOwner
 * AccountParties11Choice.PrimaryOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountParties10Choice#PrimaryOwner
 * AccountParties10Choice.PrimaryOwner}</li>
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
 * "PrimaryOwner"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Single owner of the investment account or, when the ownership is split among several owners, the primary owner is the one giving its address and account details for the registration."
 * </li>
 * </ul>
 */
public class PrimaryOwner extends InvestmentAccountPartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PrimaryOwner";
				definition = "Single owner of the investment account or, when the ownership is split among several owners, the primary owner is the one giving its address and account details for the registration.";
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AccountParties2.PrimaryOwner, com.tools20022.repository.msg.AccountParties5.PrimaryOwner,
						com.tools20022.repository.choice.AccountParties1Choice.PrimaryOwner, com.tools20022.repository.msg.AccountParties3.PrimaryOwner, com.tools20022.repository.msg.AccountParties4.PrimaryOwner,
						com.tools20022.repository.choice.AccountParties2Choice.PrimaryOwner, com.tools20022.repository.choice.AccountParties3Choice.PrimaryOwner, com.tools20022.repository.choice.AccountParties4Choice.PrimaryOwner,
						com.tools20022.repository.choice.AccountParties7Choice.PrimaryOwner, com.tools20022.repository.choice.AccountParties6Choice.PrimaryOwner, com.tools20022.repository.choice.AccountParties5Choice.PrimaryOwner,
						com.tools20022.repository.choice.AccountParties9Choice.PrimaryOwner, com.tools20022.repository.choice.AccountParties8Choice.PrimaryOwner, com.tools20022.repository.choice.AccountParties11Choice.PrimaryOwner,
						com.tools20022.repository.choice.AccountParties10Choice.PrimaryOwner);
				superType_lazy = () -> InvestmentAccountPartyRole.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}