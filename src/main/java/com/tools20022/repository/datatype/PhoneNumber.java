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

import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.metamodel.MMText;
import com.tools20022.repository.GeneratedRepository;
import java.util.concurrent.atomic.AtomicReference;

/**
 * The collection of information which identifies a specific phone or FAX number
 * as defined by telecom services. It consists of a "+" followed by the country
 * code (from 1 to 3 characters) then a "-" and finally, any combination of
 * numbers, "(", ")", "+" and "-" (up to 30 characters).
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
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
 * "PhoneNumber"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "The collection of information which identifies a specific phone or FAX number as defined by telecom services.\nIt consists of a \"+\" followed by the country code (from 1 to 3 characters) then a \"-\" and finally, any combination of numbers, \"(\", \")\", \"+\" and \"-\" (up to 30 characters)."
 * </li>
 * </ul>
 */
public class PhoneNumber {

	final static private AtomicReference<MMText> mmObject_lazy = new AtomicReference<>();

	final static public MMText mmObject() {
		mmObject_lazy.compareAndSet(null, new MMText() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PhoneNumber";
				definition = "The collection of information which identifies a specific phone or FAX number as defined by telecom services.\nIt consists of a \"+\" followed by the country code (from 1 to 3 characters) then a \"-\" and finally, any combination of numbers, \"(\", \")\", \"+\" and \"-\" (up to 30 characters).";
			}
		});
		return mmObject_lazy.get();
	}
}