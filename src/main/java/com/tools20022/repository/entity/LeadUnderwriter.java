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
import com.tools20022.repository.entity.SecuritiesPartyRole;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Main party that is awarded the mandate by a borrower to raise money via a new
 * issue. The lead manager guarantees the liquidity of the deal, arranges the
 * syndication of the issue and undertakes a major underwriting and distribution
 * commitment. Also called Lead Manager.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="LeadUnderwriter" src="doc-files/LeadUnderwriter.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.SecuritiesPartyRole
 * SecuritiesPartyRole}</li>
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
 * "LeadUnderwriter"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Main party that is awarded the mandate by a borrower to raise money via a new issue. The lead manager guarantees the liquidity of the deal, arranges the syndication of the issue and undertakes a major underwriting and distribution commitment. Also called Lead Manager."
 * </li>
 * </ul>
 */
public class LeadUnderwriter extends SecuritiesPartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "LeadUnderwriter";
				definition = "Main party that is awarded the mandate by a borrower to raise money via a new issue. The lead manager guarantees the liquidity of the deal, arranges the syndication of the issue and undertakes a major underwriting and distribution commitment. Also called Lead Manager.";
				superType_lazy = () -> SecuritiesPartyRole.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}