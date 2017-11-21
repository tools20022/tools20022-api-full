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
import com.tools20022.repository.entity.FinancialService;
import com.tools20022.repository.GeneratedRepository;
import java.util.concurrent.atomic.AtomicReference;

/**
 * A service in which a financial institution holds securities on behalf of the
 * client. Custody provides an investor a place to store assets. Assets in
 * custody are not fungible for the brokerage because they remain on the
 * client's name.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="CustodyService" src="doc-files/CustodyService.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.FinancialService
 * FinancialService}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CustodyService"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "A service in which a  financial institution holds securities on behalf of the client. Custody provides an investor a place to store assets. Assets in custody are not fungible for the brokerage because they remain on the client's name."
 * </li>
 * </ul>
 */
public class CustodyService extends FinancialService {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "CustodyService";
				definition = "A service in which a  financial institution holds securities on behalf of the client. Custody provides an investor a place to store assets. Assets in custody are not fungible for the brokerage because they remain on the client's name.";
				superType_lazy = () -> FinancialService.mmObject();
			}

			@Override
			public Class<?> getInstanceClass() {
				return CustodyService.class;
			}
		});
		return mmObject_lazy.get();
	}
}