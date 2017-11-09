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
 * Indicates the level of priority to claim on income and assets of the company
 * in case of the payment of dividends and in the event of a bankruptcy, eg,
 * ordinary/common stocks, preferred stocks, subordinated debt, etc.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.PreferenceToIncome1Code
 * PreferenceToIncome1Code}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PreferenceToIncomeCode#mmOrdinary
 * PreferenceToIncomeCode.mmOrdinary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PreferenceToIncomeCode#mmPreferred
 * PreferenceToIncomeCode.mmPreferred}</li>
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
 * <li>"ORDN"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PreferenceToIncomeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Indicates the  level of priority to claim on income and assets of \nthe company in case of the payment of dividends and in the event of a bankruptcy, eg, ordinary/common stocks, preferred stocks, subordinated debt, etc."
 * </li>
 * </ul>
 */
public class PreferenceToIncomeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Indicates an ordinary/common preference to income.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PreferenceToIncomeCode
	 * PreferenceToIncomeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ORDN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Ordinary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates an ordinary/common preference to income."</li>
	 * </ul>
	 */
	public static final MMCode mmOrdinary = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Ordinary";
			definition = "Indicates an ordinary/common preference to income.";
			owner_lazy = () -> PreferenceToIncomeCode.mmObject();
			codeName = "ORDN";
		}
	};
	/**
	 * Indicates a preferred claim upon income and assets.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PreferenceToIncomeCode
	 * PreferenceToIncomeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PFRD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Preferred"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates a preferred claim upon income and assets."</li>
	 * </ul>
	 */
	public static final MMCode mmPreferred = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Preferred";
			definition = "Indicates a preferred claim upon income and assets.";
			owner_lazy = () -> PreferenceToIncomeCode.mmObject();
			codeName = "PFRD";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("ORDN");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PreferenceToIncomeCode";
				definition = "Indicates the  level of priority to claim on income and assets of \nthe company in case of the payment of dividends and in the event of a bankruptcy, eg, ordinary/common stocks, preferred stocks, subordinated debt, etc.";
				code_lazy = () -> Arrays.asList(PreferenceToIncomeCode.mmOrdinary, PreferenceToIncomeCode.mmPreferred);
				derivation_lazy = () -> Arrays.asList(PreferenceToIncome1Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}