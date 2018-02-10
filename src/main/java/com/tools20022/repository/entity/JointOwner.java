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
 * Co-owner of an investment account when the ownership is assigned to more than
 * one party.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="JointOwner" src="doc-files/JointOwner.svg">
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
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties2#mmJointOwner
 * AccountParties2.mmJointOwner}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties5#mmJointOwner
 * AccountParties5.mmJointOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountParties1Choice#mmJointOwner
 * AccountParties1Choice.mmJointOwner}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties3#mmJointOwner
 * AccountParties3.mmJointOwner}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties4#mmJointOwner
 * AccountParties4.mmJointOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountParties2Choice#mmJointOwner
 * AccountParties2Choice.mmJointOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountParties3Choice#mmJointOwner
 * AccountParties3Choice.mmJointOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountParties4Choice#mmJointOwner
 * AccountParties4Choice.mmJointOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountParties7Choice#mmJointOwner
 * AccountParties7Choice.mmJointOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountParties6Choice#mmJointOwner
 * AccountParties6Choice.mmJointOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountParties5Choice#mmJointOwner
 * AccountParties5Choice.mmJointOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountParties9Choice#mmJointOwner
 * AccountParties9Choice.mmJointOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountParties8Choice#mmJointOwner
 * AccountParties8Choice.mmJointOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountParties11Choice#mmJointOwner
 * AccountParties11Choice.mmJointOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountParties10Choice#mmJointOwner
 * AccountParties10Choice.mmJointOwner}</li>
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
 * "JointOwner"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Co-owner of an investment account when the ownership is assigned to more than one party."
 * </li>
 * </ul>
 */
public class JointOwner extends InvestmentAccountPartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "JointOwner";
				definition = "Co-owner of an investment account when the ownership is assigned to more than one party.";
				derivationElement_lazy = () -> Arrays.asList(AccountParties2.mmJointOwner, AccountParties5.mmJointOwner, AccountParties1Choice.mmJointOwner, AccountParties3.mmJointOwner, AccountParties4.mmJointOwner,
						AccountParties2Choice.mmJointOwner, AccountParties3Choice.mmJointOwner, AccountParties4Choice.mmJointOwner, AccountParties7Choice.mmJointOwner, AccountParties6Choice.mmJointOwner, AccountParties5Choice.mmJointOwner,
						AccountParties9Choice.mmJointOwner, AccountParties8Choice.mmJointOwner, AccountParties11Choice.mmJointOwner, AccountParties10Choice.mmJointOwner);
				superType_lazy = () -> InvestmentAccountPartyRole.mmObject();
			}

			@Override
			public Class<?> getInstanceClass() {
				return JointOwner.class;
			}
		});
		return mmObject_lazy.get();
	}
}