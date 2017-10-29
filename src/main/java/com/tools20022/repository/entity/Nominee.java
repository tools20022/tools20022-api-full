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
 * Entity (the registered owner) named by the beneficial owner to act on its
 * behalf, often to facilitate dealing, or to conceal the identity of the
 * beneficiary. Securities and other assets are recorded in the nominee's name.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Nominee" src="doc-files/Nominee.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties2#Nominee
 * AccountParties2.Nominee}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties5#Nominee
 * AccountParties5.Nominee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountParties1Choice#Nominee
 * AccountParties1Choice.Nominee}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties3#Nominee
 * AccountParties3.Nominee}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties4#Nominee
 * AccountParties4.Nominee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountParties2Choice#Nominee
 * AccountParties2Choice.Nominee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountParties3Choice#Nominee
 * AccountParties3Choice.Nominee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountParties4Choice#Nominee
 * AccountParties4Choice.Nominee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountParties7Choice#Nominee
 * AccountParties7Choice.Nominee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountParties6Choice#Nominee
 * AccountParties6Choice.Nominee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountParties5Choice#Nominee
 * AccountParties5Choice.Nominee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountParties9Choice#Nominee
 * AccountParties9Choice.Nominee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountParties8Choice#Nominee
 * AccountParties8Choice.Nominee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountParties11Choice#Nominee
 * AccountParties11Choice.Nominee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountParties10Choice#Nominee
 * AccountParties10Choice.Nominee}</li>
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
 * "Nominee"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Entity (the registered owner) named by the beneficial owner to act on its behalf, often to facilitate dealing, or to conceal the identity of the beneficiary. Securities and other assets are recorded in the nominee's name."
 * </li>
 * </ul>
 */
public class Nominee extends InvestmentAccountPartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Nominee";
				definition = "Entity (the registered owner) named by the beneficial owner to act on its behalf, often to facilitate dealing, or to conceal the identity of the beneficiary. Securities and other assets are recorded in the nominee's name.";
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AccountParties2.Nominee, com.tools20022.repository.msg.AccountParties5.Nominee, com.tools20022.repository.choice.AccountParties1Choice.Nominee,
						com.tools20022.repository.msg.AccountParties3.Nominee, com.tools20022.repository.msg.AccountParties4.Nominee, com.tools20022.repository.choice.AccountParties2Choice.Nominee,
						com.tools20022.repository.choice.AccountParties3Choice.Nominee, com.tools20022.repository.choice.AccountParties4Choice.Nominee, com.tools20022.repository.choice.AccountParties7Choice.Nominee,
						com.tools20022.repository.choice.AccountParties6Choice.Nominee, com.tools20022.repository.choice.AccountParties5Choice.Nominee, com.tools20022.repository.choice.AccountParties9Choice.Nominee,
						com.tools20022.repository.choice.AccountParties8Choice.Nominee, com.tools20022.repository.choice.AccountParties11Choice.Nominee, com.tools20022.repository.choice.AccountParties10Choice.Nominee);
				superType_lazy = () -> InvestmentAccountPartyRole.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}