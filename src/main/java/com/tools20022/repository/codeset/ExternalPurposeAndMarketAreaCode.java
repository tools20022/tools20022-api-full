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

package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the external purpose code in the format of character string with a
 * maximum length of 4 characters.<br>
 * The list of valid codes is an external code list published separately.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.ExternalMarketArea1Code
 * ExternalMarketArea1Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExternalSecuritiesPurpose1Code
 * ExternalSecuritiesPurpose1Code}</li>
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
 * "ExternalPurposeAndMarketAreaCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the external purpose code in the format of character string with a maximum length of 4 characters.\r\nThe list of valid codes is an external code list published separately."
 * </li>
 * </ul>
 */
public class ExternalPurposeAndMarketAreaCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ExternalPurposeAndMarketAreaCode";
				definition = "Specifies the external purpose code in the format of character string with a maximum length of 4 characters.\r\nThe list of valid codes is an external code list published separately.";
				derivation_lazy = () -> Arrays.asList(ExternalMarketArea1Code.mmObject(), ExternalSecuritiesPurpose1Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}