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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.EuroCurrencyCode;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Number of monetary units specified in a currency, where the unit of currency
 * is the EUR and compliant with ISO 4217. The decimal separator is a dot, of
 * maximum 15 digits before the dot and 2 after. Note: A zero amount is not
 * allowed
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMAmount#getCurrencyIdentifierSet
 * currencyIdentifierSet} =
 * {@linkplain com.tools20022.repository.codeset.EuroCurrencyCode
 * EuroCurrencyCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMDecimal#getMinInclusive
 * minInclusive} = "0.01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMDecimal#getMaxInclusive
 * maxInclusive} = "999999999999999.99"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"0.99"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "EuroMax15Amount"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Number of monetary units specified in a currency, where the unit of currency is the EUR and compliant with ISO 4217.  The decimal separator is a dot, of maximum 15 digits before the dot and 2 after.\nNote: A zero amount is not allowed"
 * </li>
 * </ul>
 */
public class EuroMax15Amount {

	final static private AtomicReference<MMAmount> mmObject_lazy = new AtomicReference<>();

	final static public MMAmount mmObject() {
		mmObject_lazy.compareAndSet(null, new MMAmount() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("0.99");
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "EuroMax15Amount";
				definition = "Number of monetary units specified in a currency, where the unit of currency is the EUR and compliant with ISO 4217.  The decimal separator is a dot, of maximum 15 digits before the dot and 2 after.\nNote: A zero amount is not allowed";
				currencyIdentifierSet_lazy = () -> EuroCurrencyCode.mmObject();
				minInclusive = "0.01";
				maxInclusive = "999999999999999.99";
				totalDigits = 17;
				fractionDigits = 2;
			}
		});
		return mmObject_lazy.get();
	}
}