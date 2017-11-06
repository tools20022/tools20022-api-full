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

import com.tools20022.metamodel.MMText;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies a rate source.<br>
 * <br>
 * The values to be used for the settlement rate source are published in Annex A
 * of the 1998 FX and Currency<br>
 * Option Definitions (the FX definitions, as published by the International
 * Swaps and Derivatives Association,<br>
 * Inc., the Emerging Markets Traders Association and the Foreign Exchange
 * Committee) as amended and<br>
 * supplemented from time to time.
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
 * "RateSourceText"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies a rate source.\r\n\r\nThe values to be used for the settlement rate source are published in Annex A of the 1998 FX and Currency\r\nOption Definitions (the FX definitions, as published by the International Swaps and Derivatives Association,\r\nInc., the Emerging Markets Traders Association and the Foreign Exchange Committee) as amended and\r\nsupplemented from time to time."
 * </li>
 * </ul>
 */
public class RateSourceText {

	final static private AtomicReference<MMText> mmObject_lazy = new AtomicReference<>();

	final static public MMText mmObject() {
		mmObject_lazy.compareAndSet(null, new MMText() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "RateSourceText";
				definition = "Specifies a rate source.\r\n\r\nThe values to be used for the settlement rate source are published in Annex A of the 1998 FX and Currency\r\nOption Definitions (the FX definitions, as published by the International Swaps and Derivatives Association,\r\nInc., the Emerging Markets Traders Association and the Foreign Exchange Committee) as amended and\r\nsupplemented from time to time.";
			}
		});
		return mmObject_lazy.get();
	}
}