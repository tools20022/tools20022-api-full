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
import com.tools20022.repository.entity.InvestmentFundPartyRole;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
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
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties5#mmSettler
 * AccountParties5.mmSettler}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties6#mmSettler
 * AccountParties6.mmSettler}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties4#mmSettler
 * AccountParties4.mmSettler}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties7#mmSettler
 * AccountParties7.mmSettler}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties9#mmSettler
 * AccountParties9.mmSettler}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties8#mmSettler
 * AccountParties8.mmSettler}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties11#mmSettlor
 * AccountParties11.mmSettlor}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties10#mmSettlor
 * AccountParties10.mmSettlor}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties12#mmSettlor
 * AccountParties12.mmSettlor}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties13#mmSettlor
 * AccountParties13.mmSettlor}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties14#mmSettlor
 * AccountParties14.mmSettlor}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties15#mmSettlor
 * AccountParties15.mmSettlor}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties16#mmSettlor
 * AccountParties16.mmSettlor}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.InvestmentFundPartyRole
 * InvestmentFundPartyRole}</li>
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
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Settlor";
				definition = "Entity that creates a trust or contributes assets to the trust.";
				derivationElement_lazy = () -> Arrays.asList(AccountParties5.mmSettler, AccountParties6.mmSettler, AccountParties4.mmSettler, AccountParties7.mmSettler, AccountParties9.mmSettler, AccountParties8.mmSettler,
						AccountParties11.mmSettlor, AccountParties10.mmSettlor, AccountParties12.mmSettlor, AccountParties13.mmSettlor, AccountParties14.mmSettlor, AccountParties15.mmSettlor, AccountParties16.mmSettlor);
				superType_lazy = () -> InvestmentFundPartyRole.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}