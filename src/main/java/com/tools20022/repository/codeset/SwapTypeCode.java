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
 * Specifies the type of an interest rate derivative when the contract type is a
 * swap, a swaption, a future on a swap and / or a forward on a swap.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SwapTypeCode#mmFloatToFloatMultiCurrencySwap
 * SwapTypeCode.mmFloatToFloatMultiCurrencySwap}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SwapTypeCode#mmInflationMultiCurrencySwap
 * SwapTypeCode.mmInflationMultiCurrencySwap}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SwapTypeCode#mmFloatToFloatSingleCurrencySwap
 * SwapTypeCode.mmFloatToFloatSingleCurrencySwap}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SwapTypeCode#mmFixedToFixedSingleCurrencySwap
 * SwapTypeCode.mmFixedToFixedSingleCurrencySwap}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SwapTypeCode#mmOvernightIndexMultiCurrencySwap
 * SwapTypeCode.mmOvernightIndexMultiCurrencySwap}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SwapTypeCode#mmOvernightIndexSingleCurrencySwap
 * SwapTypeCode.mmOvernightIndexSingleCurrencySwap}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SwapTypeCode#mmFixedToFloatMultiCurrencySwap
 * SwapTypeCode.mmFixedToFloatMultiCurrencySwap}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SwapTypeCode#mmFixedToFloatSingleCurrencySwap
 * SwapTypeCode.mmFixedToFloatSingleCurrencySwap}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SwapTypeCode#mmFixedToFixedMultiCurrencySwap
 * SwapTypeCode.mmFixedToFixedMultiCurrencySwap}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SwapTypeCode#mmInflationSingleCurrencySwap
 * SwapTypeCode.mmInflationSingleCurrencySwap}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.SwapType1Code
 * SwapType1Code}</li>
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
 * "SwapTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the type of an interest rate derivative when the contract type is a swap, a swaption, a future on a swap and / or a forward on a swap."
 * </li>
 * </ul>
 */
public class SwapTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Float to Float Multi Currency Swap.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SwapTypeCode SwapTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FFMC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FloatToFloatMultiCurrencySwap"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Float to Float Multi Currency Swap."</li>
	 * </ul>
	 */
	public static final MMCode mmFloatToFloatMultiCurrencySwap = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FloatToFloatMultiCurrencySwap";
			definition = "Float to Float Multi Currency Swap.";
			owner_lazy = () -> SwapTypeCode.mmObject();
			codeName = "FFMC";
		}
	};
	/**
	 * Inflation Multi Currency Swap.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SwapTypeCode SwapTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IFMC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InflationMultiCurrencySwap"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Inflation Multi Currency Swap."</li>
	 * </ul>
	 */
	public static final MMCode mmInflationMultiCurrencySwap = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InflationMultiCurrencySwap";
			definition = "Inflation Multi Currency Swap.";
			owner_lazy = () -> SwapTypeCode.mmObject();
			codeName = "IFMC";
		}
	};
	/**
	 * Float to Float Single Currency Swap.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SwapTypeCode SwapTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FFSC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FloatToFloatSingleCurrencySwap"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Float to Float Single Currency Swap."</li>
	 * </ul>
	 */
	public static final MMCode mmFloatToFloatSingleCurrencySwap = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FloatToFloatSingleCurrencySwap";
			definition = "Float to Float Single Currency Swap.";
			owner_lazy = () -> SwapTypeCode.mmObject();
			codeName = "FFSC";
		}
	};
	/**
	 * Fixed to Fixed Single Currency Swap.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SwapTypeCode SwapTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "XXSC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FixedToFixedSingleCurrencySwap"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Fixed to Fixed Single Currency Swap."</li>
	 * </ul>
	 */
	public static final MMCode mmFixedToFixedSingleCurrencySwap = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FixedToFixedSingleCurrencySwap";
			definition = "Fixed to Fixed Single Currency Swap.";
			owner_lazy = () -> SwapTypeCode.mmObject();
			codeName = "XXSC";
		}
	};
	/**
	 * Overnight Index Multi Currency Swap.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SwapTypeCode SwapTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OSMC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OvernightIndexMultiCurrencySwap"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Overnight Index Multi Currency Swap."</li>
	 * </ul>
	 */
	public static final MMCode mmOvernightIndexMultiCurrencySwap = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OvernightIndexMultiCurrencySwap";
			definition = "Overnight Index Multi Currency Swap.";
			owner_lazy = () -> SwapTypeCode.mmObject();
			codeName = "OSMC";
		}
	};
	/**
	 * Overnight Index Single Currency Swap.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SwapTypeCode SwapTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OSSC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OvernightIndexSingleCurrencySwap"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Overnight Index Single Currency Swap."</li>
	 * </ul>
	 */
	public static final MMCode mmOvernightIndexSingleCurrencySwap = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OvernightIndexSingleCurrencySwap";
			definition = "Overnight Index Single Currency Swap.";
			owner_lazy = () -> SwapTypeCode.mmObject();
			codeName = "OSSC";
		}
	};
	/**
	 * Fixed to Float Multi Currency Swap.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SwapTypeCode SwapTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "XFMC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FixedToFloatMultiCurrencySwap"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Fixed to Float Multi Currency Swap."</li>
	 * </ul>
	 */
	public static final MMCode mmFixedToFloatMultiCurrencySwap = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FixedToFloatMultiCurrencySwap";
			definition = "Fixed to Float Multi Currency Swap.";
			owner_lazy = () -> SwapTypeCode.mmObject();
			codeName = "XFMC";
		}
	};
	/**
	 * Fixed to Float Single Currency Swap.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SwapTypeCode SwapTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "XFSC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FixedToFloatSingleCurrencySwap"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Fixed to Float Single Currency Swap."</li>
	 * </ul>
	 */
	public static final MMCode mmFixedToFloatSingleCurrencySwap = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FixedToFloatSingleCurrencySwap";
			definition = "Fixed to Float Single Currency Swap.";
			owner_lazy = () -> SwapTypeCode.mmObject();
			codeName = "XFSC";
		}
	};
	/**
	 * Fixed to Fixed Multi Currency Swap.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SwapTypeCode SwapTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "XXMC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FixedToFixedMultiCurrencySwap"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Fixed to Fixed Multi Currency Swap."</li>
	 * </ul>
	 */
	public static final MMCode mmFixedToFixedMultiCurrencySwap = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FixedToFixedMultiCurrencySwap";
			definition = "Fixed to Fixed Multi Currency Swap.";
			owner_lazy = () -> SwapTypeCode.mmObject();
			codeName = "XXMC";
		}
	};
	/**
	 * Inflation Single Currency Swap.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SwapTypeCode SwapTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IFSC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InflationSingleCurrencySwap"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Inflation Single Currency Swap."</li>
	 * </ul>
	 */
	public static final MMCode mmInflationSingleCurrencySwap = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InflationSingleCurrencySwap";
			definition = "Inflation Single Currency Swap.";
			owner_lazy = () -> SwapTypeCode.mmObject();
			codeName = "IFSC";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SwapTypeCode";
				definition = "Specifies the type of an interest rate derivative when the contract type is a swap, a swaption, a future on a swap and / or a forward on a swap.";
				code_lazy = () -> Arrays.asList(SwapTypeCode.mmFloatToFloatMultiCurrencySwap, SwapTypeCode.mmInflationMultiCurrencySwap, SwapTypeCode.mmFloatToFloatSingleCurrencySwap, SwapTypeCode.mmFixedToFixedSingleCurrencySwap,
						SwapTypeCode.mmOvernightIndexMultiCurrencySwap, SwapTypeCode.mmOvernightIndexSingleCurrencySwap, SwapTypeCode.mmFixedToFloatMultiCurrencySwap, SwapTypeCode.mmFixedToFloatSingleCurrencySwap,
						SwapTypeCode.mmFixedToFixedMultiCurrencySwap, SwapTypeCode.mmInflationSingleCurrencySwap);
				derivation_lazy = () -> Arrays.asList(SwapType1Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}