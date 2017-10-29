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
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties2#Trustee
 * AccountParties2.Trustee}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties5#Trustee
 * AccountParties5.Trustee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountParties1Choice#Trustee
 * AccountParties1Choice.Trustee}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties3#Trustee
 * AccountParties3.Trustee}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties4#Trustee
 * AccountParties4.Trustee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountParties2Choice#Trustee
 * AccountParties2Choice.Trustee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountParties3Choice#Trustee
 * AccountParties3Choice.Trustee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountParties4Choice#Trustee
 * AccountParties4Choice.Trustee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountParties7Choice#Trustee
 * AccountParties7Choice.Trustee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountParties6Choice#Trustee
 * AccountParties6Choice.Trustee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountParties5Choice#Trustee
 * AccountParties5Choice.Trustee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountParties9Choice#Trustee
 * AccountParties9Choice.Trustee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountParties8Choice#Trustee
 * AccountParties8Choice.Trustee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountParties11Choice#Trustee
 * AccountParties11Choice.Trustee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountParties10Choice#Trustee
 * AccountParties10Choice.Trustee}</li>
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
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "TrusteeRole";
				definition = "Legal owner of the property. However, the beneficiary has the equitable or beneficial ownership. The trustee must ensure all terms and conditions of the security are adhered to.";
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AccountParties2.Trustee, com.tools20022.repository.msg.AccountParties5.Trustee, com.tools20022.repository.choice.AccountParties1Choice.Trustee,
						com.tools20022.repository.msg.AccountParties3.Trustee, com.tools20022.repository.msg.AccountParties4.Trustee, com.tools20022.repository.choice.AccountParties2Choice.Trustee,
						com.tools20022.repository.choice.AccountParties3Choice.Trustee, com.tools20022.repository.choice.AccountParties4Choice.Trustee, com.tools20022.repository.choice.AccountParties7Choice.Trustee,
						com.tools20022.repository.choice.AccountParties6Choice.Trustee, com.tools20022.repository.choice.AccountParties5Choice.Trustee, com.tools20022.repository.choice.AccountParties9Choice.Trustee,
						com.tools20022.repository.choice.AccountParties8Choice.Trustee, com.tools20022.repository.choice.AccountParties11Choice.Trustee, com.tools20022.repository.choice.AccountParties10Choice.Trustee);
				superType_lazy = () -> InvestmentAccountPartyRole.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}