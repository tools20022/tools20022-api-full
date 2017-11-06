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

import com.tools20022.metamodel.MMIndicator;
import java.util.concurrent.atomic.AtomicReference;

/**
 * A flag indicating a True or False value.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMIndicator#getMeaningWhenTrue
 * meaningWhenTrue} =
 * "Indicates that there is only one occurrence of the PaymentInformation block and several occurrences of the PaymentTransaction block."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMIndicator#getMeaningWhenFalse
 * meaningWhenFalse} =
 * "Indicates that there is the same number of occurrences of the PaymentInformation block and of the PaymentTransaction block."
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
 * "GroupingIndicator"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "A flag indicating a True or False value."</li>
 * </ul>
 */
public class GroupingIndicator {

	final static private AtomicReference<MMIndicator> mmObject_lazy = new AtomicReference<>();

	final static public MMIndicator mmObject() {
		mmObject_lazy.compareAndSet(null, new MMIndicator() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "GroupingIndicator";
				definition = "A flag indicating a True or False value.";
				meaningWhenTrue = "Indicates that there is only one occurrence of the PaymentInformation block and several occurrences of the PaymentTransaction block.";
				meaningWhenFalse = "Indicates that there is the same number of occurrences of the PaymentInformation block and of the PaymentTransaction block.";
			}
		});
		return mmObject_lazy.get();
	}
}