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
 * Grantor role in the hedge funds industry.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Grantor" src="doc-files/Grantor.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties5#Granter
 * AccountParties5.Granter}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties6#Granter
 * AccountParties6.Granter}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties4#Granter
 * AccountParties4.Granter}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties7#Granter
 * AccountParties7.Granter}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties9#Granter
 * AccountParties9.Granter}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties8#Granter
 * AccountParties8.Granter}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties11#Granter
 * AccountParties11.Granter}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties10#Granter
 * AccountParties10.Granter}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties12#Granter
 * AccountParties12.Granter}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties13#Granter
 * AccountParties13.Granter}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties14#Granter
 * AccountParties14.Granter}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties15#Granter
 * AccountParties15.Granter}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties16#Granter
 * AccountParties16.Granter}</li>
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
 * "Grantor"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Grantor role in the hedge funds industry."</li>
 * </ul>
 */
public class Grantor extends InvestmentFundPartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Grantor";
				definition = "Grantor role in the hedge funds industry.";
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AccountParties5.Granter, com.tools20022.repository.msg.AccountParties6.Granter, com.tools20022.repository.msg.AccountParties4.Granter,
						com.tools20022.repository.msg.AccountParties7.Granter, com.tools20022.repository.msg.AccountParties9.Granter, com.tools20022.repository.msg.AccountParties8.Granter,
						com.tools20022.repository.msg.AccountParties11.Granter, com.tools20022.repository.msg.AccountParties10.Granter, com.tools20022.repository.msg.AccountParties12.Granter,
						com.tools20022.repository.msg.AccountParties13.Granter, com.tools20022.repository.msg.AccountParties14.Granter, com.tools20022.repository.msg.AccountParties15.Granter,
						com.tools20022.repository.msg.AccountParties16.Granter);
				superType_lazy = () -> InvestmentFundPartyRole.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}