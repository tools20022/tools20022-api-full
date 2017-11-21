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
 * Legal owner of the property. However, the beneficiary has the equitable or
 * beneficial ownership. The trustee must ensure all terms and conditions of the
 * security are adhered to.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="TrusteeRole" src="doc-files/TrusteeRole.svg">
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
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties2#mmTrustee
 * AccountParties2.mmTrustee}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties5#mmTrustee
 * AccountParties5.mmTrustee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountParties1Choice#mmTrustee
 * AccountParties1Choice.mmTrustee}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties3#mmTrustee
 * AccountParties3.mmTrustee}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties4#mmTrustee
 * AccountParties4.mmTrustee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountParties2Choice#mmTrustee
 * AccountParties2Choice.mmTrustee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountParties3Choice#mmTrustee
 * AccountParties3Choice.mmTrustee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountParties4Choice#mmTrustee
 * AccountParties4Choice.mmTrustee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountParties7Choice#mmTrustee
 * AccountParties7Choice.mmTrustee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountParties6Choice#mmTrustee
 * AccountParties6Choice.mmTrustee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountParties5Choice#mmTrustee
 * AccountParties5Choice.mmTrustee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountParties9Choice#mmTrustee
 * AccountParties9Choice.mmTrustee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountParties8Choice#mmTrustee
 * AccountParties8Choice.mmTrustee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountParties11Choice#mmTrustee
 * AccountParties11Choice.mmTrustee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountParties10Choice#mmTrustee
 * AccountParties10Choice.mmTrustee}</li>
 * </ul>
 * </li>
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
 * "TrusteeRole"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Legal owner of the property. However, the beneficiary has the equitable or beneficial ownership. The trustee must ensure all terms and conditions of the security are adhered to."
 * </li>
 * </ul>
 */
public class TrusteeRole extends InvestmentAccountPartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TrusteeRole";
				definition = "Legal owner of the property. However, the beneficiary has the equitable or beneficial ownership. The trustee must ensure all terms and conditions of the security are adhered to.";
				derivationElement_lazy = () -> Arrays.asList(AccountParties2.mmTrustee, AccountParties5.mmTrustee, AccountParties1Choice.mmTrustee, AccountParties3.mmTrustee, AccountParties4.mmTrustee, AccountParties2Choice.mmTrustee,
						AccountParties3Choice.mmTrustee, AccountParties4Choice.mmTrustee, AccountParties7Choice.mmTrustee, AccountParties6Choice.mmTrustee, AccountParties5Choice.mmTrustee, AccountParties9Choice.mmTrustee,
						AccountParties8Choice.mmTrustee, AccountParties11Choice.mmTrustee, AccountParties10Choice.mmTrustee);
				superType_lazy = () -> InvestmentAccountPartyRole.mmObject();
			}

			@Override
			public Class<?> getInstanceClass() {
				return TrusteeRole.class;
			}
		});
		return mmObject_lazy.get();
	}
}