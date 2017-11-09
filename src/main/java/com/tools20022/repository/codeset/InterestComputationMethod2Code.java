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
import com.tools20022.repository.codeset.InterestComputationMethodCode;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the method used to compute accruing interest of a financial
 * instrument.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.InterestComputationMethodCode
 * InterestComputationMethodCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InterestComputationMethod2Code#mmIC30360ISDAor30360AmericanBasicRule
 * InterestComputationMethod2Code.mmIC30360ISDAor30360AmericanBasicRule}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InterestComputationMethod2Code#mmIC30365
 * InterestComputationMethod2Code.mmIC30365}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InterestComputationMethod2Code#mmIC30Actual
 * InterestComputationMethod2Code.mmIC30Actual}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InterestComputationMethod2Code#mmActual360
 * InterestComputationMethod2Code.mmActual360}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InterestComputationMethod2Code#mmActual365Fixed
 * InterestComputationMethod2Code.mmActual365Fixed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InterestComputationMethod2Code#mmActualActualICMA
 * InterestComputationMethod2Code.mmActualActualICMA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InterestComputationMethod2Code#mmIC30E360orEuroBondBasismodel1
 * InterestComputationMethod2Code.mmIC30E360orEuroBondBasismodel1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InterestComputationMethod2Code#mmActualActualISDA
 * InterestComputationMethod2Code.mmActualActualISDA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InterestComputationMethod2Code#mmActual365LorActuActubasisRule
 * InterestComputationMethod2Code.mmActual365LorActuActubasisRule}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InterestComputationMethod2Code#mmActualActualAFB
 * InterestComputationMethod2Code.mmActualActualAFB}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InterestComputationMethod2Code#mmIC30360ICMAor30360basicrule
 * InterestComputationMethod2Code.mmIC30360ICMAor30360basicrule}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InterestComputationMethod2Code#mmIC30E2360orEurobondbasismodel2
 * InterestComputationMethod2Code.mmIC30E2360orEurobondbasismodel2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InterestComputationMethod2Code#mmIC30E3360orEurobondbasismodel3
 * InterestComputationMethod2Code.mmIC30E3360orEurobondbasismodel3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InterestComputationMethod2Code#mmActual365NL
 * InterestComputationMethod2Code.mmActual365NL}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InterestComputationMethod2Code#mmNarrative
 * InterestComputationMethod2Code.mmNarrative}</li>
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
 * <li>"A001"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "InterestComputationMethod2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the method used to compute accruing interest of a financial instrument."
 * </li>
 * </ul>
 */
public class InterestComputationMethod2Code extends InterestComputationMethodCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InterestComputationMethod2Code
	 * InterestComputationMethod2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IC30360ISDAor30360AmericanBasicRule"</li>
	 * </ul>
	 */
	public static final MMCode mmIC30360ISDAor30360AmericanBasicRule = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IC30360ISDAor30360AmericanBasicRule";
			owner_lazy = () -> InterestComputationMethod2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InterestComputationMethod2Code
	 * InterestComputationMethod2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IC30365"</li>
	 * </ul>
	 */
	public static final MMCode mmIC30365 = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IC30365";
			owner_lazy = () -> InterestComputationMethod2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InterestComputationMethod2Code
	 * InterestComputationMethod2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IC30Actual"</li>
	 * </ul>
	 */
	public static final MMCode mmIC30Actual = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IC30Actual";
			owner_lazy = () -> InterestComputationMethod2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InterestComputationMethod2Code
	 * InterestComputationMethod2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Actual360"</li>
	 * </ul>
	 */
	public static final MMCode mmActual360 = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Actual360";
			owner_lazy = () -> InterestComputationMethod2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InterestComputationMethod2Code
	 * InterestComputationMethod2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Actual365Fixed"</li>
	 * </ul>
	 */
	public static final MMCode mmActual365Fixed = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Actual365Fixed";
			owner_lazy = () -> InterestComputationMethod2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InterestComputationMethod2Code
	 * InterestComputationMethod2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ActualActualICMA"</li>
	 * </ul>
	 */
	public static final MMCode mmActualActualICMA = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ActualActualICMA";
			owner_lazy = () -> InterestComputationMethod2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InterestComputationMethod2Code
	 * InterestComputationMethod2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IC30E360orEuroBondBasismodel1"</li>
	 * </ul>
	 */
	public static final MMCode mmIC30E360orEuroBondBasismodel1 = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IC30E360orEuroBondBasismodel1";
			owner_lazy = () -> InterestComputationMethod2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InterestComputationMethod2Code
	 * InterestComputationMethod2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ActualActualISDA"</li>
	 * </ul>
	 */
	public static final MMCode mmActualActualISDA = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ActualActualISDA";
			owner_lazy = () -> InterestComputationMethod2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InterestComputationMethod2Code
	 * InterestComputationMethod2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Actual365LorActuActubasisRule"</li>
	 * </ul>
	 */
	public static final MMCode mmActual365LorActuActubasisRule = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Actual365LorActuActubasisRule";
			owner_lazy = () -> InterestComputationMethod2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InterestComputationMethod2Code
	 * InterestComputationMethod2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ActualActualAFB"</li>
	 * </ul>
	 */
	public static final MMCode mmActualActualAFB = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ActualActualAFB";
			owner_lazy = () -> InterestComputationMethod2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InterestComputationMethod2Code
	 * InterestComputationMethod2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IC30360ICMAor30360basicrule"</li>
	 * </ul>
	 */
	public static final MMCode mmIC30360ICMAor30360basicrule = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IC30360ICMAor30360basicrule";
			owner_lazy = () -> InterestComputationMethod2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InterestComputationMethod2Code
	 * InterestComputationMethod2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IC30E2360orEurobondbasismodel2"</li>
	 * </ul>
	 */
	public static final MMCode mmIC30E2360orEurobondbasismodel2 = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IC30E2360orEurobondbasismodel2";
			owner_lazy = () -> InterestComputationMethod2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InterestComputationMethod2Code
	 * InterestComputationMethod2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IC30E3360orEurobondbasismodel3"</li>
	 * </ul>
	 */
	public static final MMCode mmIC30E3360orEurobondbasismodel3 = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IC30E3360orEurobondbasismodel3";
			owner_lazy = () -> InterestComputationMethod2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InterestComputationMethod2Code
	 * InterestComputationMethod2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Actual365NL"</li>
	 * </ul>
	 */
	public static final MMCode mmActual365NL = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Actual365NL";
			owner_lazy = () -> InterestComputationMethod2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InterestComputationMethod2Code
	 * InterestComputationMethod2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Narrative"</li>
	 * </ul>
	 */
	public static final MMCode mmNarrative = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Narrative";
			owner_lazy = () -> InterestComputationMethod2Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("A001");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InterestComputationMethod2Code";
				definition = "Specifies the method used to compute accruing interest of a financial instrument.";
				code_lazy = () -> Arrays.asList(InterestComputationMethod2Code.mmIC30360ISDAor30360AmericanBasicRule, InterestComputationMethod2Code.mmIC30365, InterestComputationMethod2Code.mmIC30Actual,
						InterestComputationMethod2Code.mmActual360, InterestComputationMethod2Code.mmActual365Fixed, InterestComputationMethod2Code.mmActualActualICMA, InterestComputationMethod2Code.mmIC30E360orEuroBondBasismodel1,
						InterestComputationMethod2Code.mmActualActualISDA, InterestComputationMethod2Code.mmActual365LorActuActubasisRule, InterestComputationMethod2Code.mmActualActualAFB,
						InterestComputationMethod2Code.mmIC30360ICMAor30360basicrule, InterestComputationMethod2Code.mmIC30E2360orEurobondbasismodel2, InterestComputationMethod2Code.mmIC30E3360orEurobondbasismodel3,
						InterestComputationMethod2Code.mmActual365NL, InterestComputationMethod2Code.mmNarrative);
				trace_lazy = () -> InterestComputationMethodCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}