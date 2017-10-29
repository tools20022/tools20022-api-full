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
 * Co-owner of an investment account when the ownership is assigned to more than
 * one party.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="JointOwner" src="doc-files/JointOwner.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties2#JointOwner
 * AccountParties2.JointOwner}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties5#JointOwner
 * AccountParties5.JointOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountParties1Choice#JointOwner
 * AccountParties1Choice.JointOwner}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties3#JointOwner
 * AccountParties3.JointOwner}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties4#JointOwner
 * AccountParties4.JointOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountParties2Choice#JointOwner
 * AccountParties2Choice.JointOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountParties3Choice#JointOwner
 * AccountParties3Choice.JointOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountParties4Choice#JointOwner
 * AccountParties4Choice.JointOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountParties7Choice#JointOwner
 * AccountParties7Choice.JointOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountParties6Choice#JointOwner
 * AccountParties6Choice.JointOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountParties5Choice#JointOwner
 * AccountParties5Choice.JointOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountParties9Choice#JointOwner
 * AccountParties9Choice.JointOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountParties8Choice#JointOwner
 * AccountParties8Choice.JointOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountParties11Choice#JointOwner
 * AccountParties11Choice.JointOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountParties10Choice#JointOwner
 * AccountParties10Choice.JointOwner}</li>
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
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "JointOwner";
				definition = "Co-owner of an investment account when the ownership is assigned to more than one party.";
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AccountParties2.JointOwner, com.tools20022.repository.msg.AccountParties5.JointOwner,
						com.tools20022.repository.choice.AccountParties1Choice.JointOwner, com.tools20022.repository.msg.AccountParties3.JointOwner, com.tools20022.repository.msg.AccountParties4.JointOwner,
						com.tools20022.repository.choice.AccountParties2Choice.JointOwner, com.tools20022.repository.choice.AccountParties3Choice.JointOwner, com.tools20022.repository.choice.AccountParties4Choice.JointOwner,
						com.tools20022.repository.choice.AccountParties7Choice.JointOwner, com.tools20022.repository.choice.AccountParties6Choice.JointOwner, com.tools20022.repository.choice.AccountParties5Choice.JointOwner,
						com.tools20022.repository.choice.AccountParties9Choice.JointOwner, com.tools20022.repository.choice.AccountParties8Choice.JointOwner, com.tools20022.repository.choice.AccountParties11Choice.JointOwner,
						com.tools20022.repository.choice.AccountParties10Choice.JointOwner);
				superType_lazy = () -> InvestmentAccountPartyRole.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}