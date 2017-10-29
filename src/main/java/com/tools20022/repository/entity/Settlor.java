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
import com.tools20022.repository.entity.InvestmentFundPartyRole;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Entity that creates a trust or contributes assets to the trust.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Settlor" src="doc-files/Settlor.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties5#Settler
 * AccountParties5.Settler}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties6#Settler
 * AccountParties6.Settler}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties4#Settler
 * AccountParties4.Settler}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties7#Settler
 * AccountParties7.Settler}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties9#Settler
 * AccountParties9.Settler}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties8#Settler
 * AccountParties8.Settler}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties11#Settlor
 * AccountParties11.Settlor}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties10#Settlor
 * AccountParties10.Settlor}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties12#Settlor
 * AccountParties12.Settlor}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties13#Settlor
 * AccountParties13.Settlor}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties14#Settlor
 * AccountParties14.Settlor}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties15#Settlor
 * AccountParties15.Settlor}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties16#Settlor
 * AccountParties16.Settlor}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.InvestmentFundPartyRole
 * InvestmentFundPartyRole}</li>
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
 * "Settlor"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Entity that creates a trust or contributes assets to the trust."</li>
 * </ul>
 */
public class Settlor extends InvestmentFundPartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Settlor";
				definition = "Entity that creates a trust or contributes assets to the trust.";
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AccountParties5.Settler, com.tools20022.repository.msg.AccountParties6.Settler, com.tools20022.repository.msg.AccountParties4.Settler,
						com.tools20022.repository.msg.AccountParties7.Settler, com.tools20022.repository.msg.AccountParties9.Settler, com.tools20022.repository.msg.AccountParties8.Settler,
						com.tools20022.repository.msg.AccountParties11.Settlor, com.tools20022.repository.msg.AccountParties10.Settlor, com.tools20022.repository.msg.AccountParties12.Settlor,
						com.tools20022.repository.msg.AccountParties13.Settlor, com.tools20022.repository.msg.AccountParties14.Settlor, com.tools20022.repository.msg.AccountParties15.Settlor,
						com.tools20022.repository.msg.AccountParties16.Settlor);
				superType_lazy = () -> InvestmentFundPartyRole.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}