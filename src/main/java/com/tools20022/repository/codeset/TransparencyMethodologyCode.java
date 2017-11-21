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
 * Specifies the methodology used for a transparency operation.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransparencyMethodologyCode#mmEstimated
 * TransparencyMethodologyCode.mmEstimated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransparencyMethodologyCode#mmFirstFourWeeks
 * TransparencyMethodologyCode.mmFirstFourWeeks}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransparencyMethodologyCode#mmYear
 * TransparencyMethodologyCode.mmYear}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransparencyMethodologyCode#mmSystematicInternaliser
 * TransparencyMethodologyCode.mmSystematicInternaliser}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransparencyMethodology2Code
 * TransparencyMethodology2Code}</li>
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
 * "TransparencyMethodologyCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the methodology used for a transparency operation."</li>
 * </ul>
 */
public class TransparencyMethodologyCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Estimation for New Equity Instruments.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransparencyMethodologyCode
	 * TransparencyMethodologyCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ESTM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Estimated"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Estimation for New Equity Instruments."</li>
	 * </ul>
	 */
	public static final MMCode mmEstimated = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Estimated";
			definition = "Estimation for New Equity Instruments.";
			owner_lazy = () -> TransparencyMethodologyCode.mmObject();
			codeName = "ESTM";
		}
	};
	/**
	 * Calculation based on first Four Weeks of Trading for Equity Instruments.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransparencyMethodologyCode
	 * TransparencyMethodologyCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FFWK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FirstFourWeeks"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Calculation based on first Four Weeks of Trading for Equity Instruments."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmFirstFourWeeks = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FirstFourWeeks";
			definition = "Calculation based on first Four Weeks of Trading for Equity Instruments.";
			owner_lazy = () -> TransparencyMethodologyCode.mmObject();
			codeName = "FFWK";
		}
	};
	/**
	 * Calculation based on yearly cycle.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransparencyMethodologyCode
	 * TransparencyMethodologyCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "YEAR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Year"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Calculation based on yearly cycle."</li>
	 * </ul>
	 */
	public static final MMCode mmYear = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Year";
			definition = "Calculation based on yearly cycle.";
			owner_lazy = () -> TransparencyMethodologyCode.mmObject();
			codeName = "YEAR";
		}
	};
	/**
	 * Results of calculations supporting Systematic Internaliser regime.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransparencyMethodologyCode
	 * TransparencyMethodologyCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SINT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SystematicInternaliser"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Results of calculations supporting Systematic Internaliser regime."</li>
	 * </ul>
	 */
	public static final MMCode mmSystematicInternaliser = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SystematicInternaliser";
			definition = "Results of calculations supporting Systematic Internaliser regime.";
			owner_lazy = () -> TransparencyMethodologyCode.mmObject();
			codeName = "SINT";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TransparencyMethodologyCode";
				definition = "Specifies the methodology used for a transparency operation.";
				code_lazy = () -> Arrays.asList(TransparencyMethodologyCode.mmEstimated, TransparencyMethodologyCode.mmFirstFourWeeks, TransparencyMethodologyCode.mmYear, TransparencyMethodologyCode.mmSystematicInternaliser);
				derivation_lazy = () -> Arrays.asList(TransparencyMethodology2Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}