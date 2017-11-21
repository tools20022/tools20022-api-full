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

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the quantity sought type.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCQuantitySoughtCode#mmQuantity
 * DTCCQuantitySoughtCode.mmQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCQuantitySoughtCode#mmCheckComments
 * DTCCQuantitySoughtCode.mmCheckComments}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCQuantitySoughtCode#mmPercentage
 * DTCCQuantitySoughtCode.mmPercentage}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.DTCCQuantitySought1Code
 * DTCCQuantitySought1Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"QTTY"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DTCCQuantitySoughtCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the quantity sought type."</li>
 * </ul>
 */
public class DTCCQuantitySoughtCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Quantity Sought expressed as quantity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCQuantitySoughtCode
	 * DTCCQuantitySoughtCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "QTTY"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Quantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quantity Sought expressed as quantity."</li>
	 * </ul>
	 */
	public static final MMCode mmQuantity = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Quantity";
			definition = "Quantity Sought expressed as quantity.";
			owner_lazy = () -> DTCCQuantitySoughtCode.mmObject();
			codeName = "QTTY";
		}
	};
	/**
	 * Check Quantity Sought Comments for quantity sought (irregular expression)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCQuantitySoughtCode
	 * DTCCQuantitySoughtCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CHCO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CheckComments"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Check Quantity Sought Comments for quantity sought (irregular expression)"
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCheckComments = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CheckComments";
			definition = "Check Quantity Sought Comments for quantity sought (irregular expression)";
			owner_lazy = () -> DTCCQuantitySoughtCode.mmObject();
			codeName = "CHCO";
		}
	};
	/**
	 * Quantity sought is expressed as percentage.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCQuantitySoughtCode
	 * DTCCQuantitySoughtCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PRTG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Percentage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quantity sought is expressed as percentage."</li>
	 * </ul>
	 */
	public static final MMCode mmPercentage = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Percentage";
			definition = "Quantity sought is expressed as percentage.";
			owner_lazy = () -> DTCCQuantitySoughtCode.mmObject();
			codeName = "PRTG";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("QTTY");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DTCCQuantitySoughtCode";
				definition = "Specifies the quantity sought type.";
				code_lazy = () -> Arrays.asList(DTCCQuantitySoughtCode.mmQuantity, DTCCQuantitySoughtCode.mmCheckComments, DTCCQuantitySoughtCode.mmPercentage);
				derivation_lazy = () -> Arrays.asList(DTCCQuantitySought1Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}