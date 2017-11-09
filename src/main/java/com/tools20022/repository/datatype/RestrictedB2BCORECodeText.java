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
 * EPC Technical validation subset restricted to B2B or CORE code: - CORE: Used
 * to indicate that the SEPA Core Direct Debit Scheme rules apply. - B2B: Used
 * to indicate that the SEPA Business-to-Business Direct Debit Scheme rules
 * apply.
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
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RestrictedB2BCORECodeText"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "EPC Technical validation subset restricted to B2B or CORE code:\n- CORE: Used to indicate that the SEPA Core Direct Debit Scheme rules apply.\n- B2B: Used to indicate that the SEPA Business-to-Business Direct Debit Scheme rules apply."
 * </li>
 * </ul>
 */
public class RestrictedB2BCORECodeText {

	final static private AtomicReference<MMText> mmObject_lazy = new AtomicReference<>();

	final static public MMText mmObject() {
		mmObject_lazy.compareAndSet(null, new MMText() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "RestrictedB2BCORECodeText";
				definition = "EPC Technical validation subset restricted to B2B or CORE code:\n- CORE: Used to indicate that the SEPA Core Direct Debit Scheme rules apply.\n- B2B: Used to indicate that the SEPA Business-to-Business Direct Debit Scheme rules apply.";
			}
		});
		return mmObject_lazy.get();
	}
}