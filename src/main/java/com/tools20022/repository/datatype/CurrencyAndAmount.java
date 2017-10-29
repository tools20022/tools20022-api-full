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

package com.tools20022.repository.datatype;

import com.tools20022.metamodel.MMAmount;
import com.tools20022.repository.codeset.CurrencyCode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Number of monetary units specified in a currency, where the unit of currency
 * is explicit and compliant with ISO 4217. The decimal separator is a dot.
 * Note: A zero amount is considered a positive amount.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMAmount#getCurrencyIdentifierSet
 * currencyIdentifierSet} =
 * {@linkplain com.tools20022.repository.codeset.CurrencyCode CurrencyCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"100000"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CurrencyAndAmount"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Number of monetary units specified in a currency, where the unit of currency is explicit and compliant with ISO 4217.  The decimal separator is a dot.\nNote: A zero amount is considered a positive amount."
 * </li>
 * </ul>
 */
public class CurrencyAndAmount {

	final static private AtomicReference<MMAmount> mmObject_lazy = new AtomicReference<>();

	final static public MMAmount mmObject() {
		mmObject_lazy.compareAndSet(null, new MMAmount() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("100000");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CurrencyAndAmount";
				definition = "Number of monetary units specified in a currency, where the unit of currency is explicit and compliant with ISO 4217.  The decimal separator is a dot.\nNote: A zero amount is considered a positive amount.";
				currencyIdentifierSet_lazy = () -> CurrencyCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}