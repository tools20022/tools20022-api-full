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
import com.tools20022.repository.codeset.SwapTypeCode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the type of an interest rate derivative when the contract type is a
 * swap, a swaption, a future on a swap and / or a forward on a swap.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.SwapTypeCode SwapTypeCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SwapType1Code#mmOvernightIndexSingleCurrencySwap
 * SwapType1Code.mmOvernightIndexSingleCurrencySwap}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SwapType1Code#mmFixedToFloatSingleCurrencySwap
 * SwapType1Code.mmFixedToFloatSingleCurrencySwap}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SwapType1Code#mmFixedToFloatMultiCurrencySwap
 * SwapType1Code.mmFixedToFloatMultiCurrencySwap}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SwapType1Code#mmFixedToFixedSingleCurrencySwap
 * SwapType1Code.mmFixedToFixedSingleCurrencySwap}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SwapType1Code#mmFixedToFixedMultiCurrencySwap
 * SwapType1Code.mmFixedToFixedMultiCurrencySwap}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SwapType1Code#mmInflationMultiCurrencySwap
 * SwapType1Code.mmInflationMultiCurrencySwap}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SwapType1Code#mmFloatToFloatSingleCurrencySwap
 * SwapType1Code.mmFloatToFloatSingleCurrencySwap}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SwapType1Code#mmFloatToFloatMultiCurrencySwap
 * SwapType1Code.mmFloatToFloatMultiCurrencySwap}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SwapType1Code#mmInflationSingleCurrencySwap
 * SwapType1Code.mmInflationSingleCurrencySwap}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SwapType1Code#mmOvernightIndexMultiCurrencySwap
 * SwapType1Code.mmOvernightIndexMultiCurrencySwap}</li>
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
 * "SwapType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the type of an interest rate derivative when the contract type is a swap, a swaption, a future on a swap and / or a forward on a swap."
 * </li>
 * </ul>
 */
public class SwapType1Code extends SwapTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SwapType1Code
	 * SwapType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OvernightIndexSingleCurrencySwap"</li>
	 * </ul>
	 */
	public static final MMCode mmOvernightIndexSingleCurrencySwap = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OvernightIndexSingleCurrencySwap";
			owner_lazy = () -> SwapType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SwapType1Code
	 * SwapType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FixedToFloatSingleCurrencySwap"</li>
	 * </ul>
	 */
	public static final MMCode mmFixedToFloatSingleCurrencySwap = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FixedToFloatSingleCurrencySwap";
			owner_lazy = () -> SwapType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SwapType1Code
	 * SwapType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FixedToFloatMultiCurrencySwap"</li>
	 * </ul>
	 */
	public static final MMCode mmFixedToFloatMultiCurrencySwap = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FixedToFloatMultiCurrencySwap";
			owner_lazy = () -> SwapType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SwapType1Code
	 * SwapType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FixedToFixedSingleCurrencySwap"</li>
	 * </ul>
	 */
	public static final MMCode mmFixedToFixedSingleCurrencySwap = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FixedToFixedSingleCurrencySwap";
			owner_lazy = () -> SwapType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SwapType1Code
	 * SwapType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FixedToFixedMultiCurrencySwap"</li>
	 * </ul>
	 */
	public static final MMCode mmFixedToFixedMultiCurrencySwap = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FixedToFixedMultiCurrencySwap";
			owner_lazy = () -> SwapType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SwapType1Code
	 * SwapType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InflationMultiCurrencySwap"</li>
	 * </ul>
	 */
	public static final MMCode mmInflationMultiCurrencySwap = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InflationMultiCurrencySwap";
			owner_lazy = () -> SwapType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SwapType1Code
	 * SwapType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FloatToFloatSingleCurrencySwap"</li>
	 * </ul>
	 */
	public static final MMCode mmFloatToFloatSingleCurrencySwap = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FloatToFloatSingleCurrencySwap";
			owner_lazy = () -> SwapType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SwapType1Code
	 * SwapType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FloatToFloatMultiCurrencySwap"</li>
	 * </ul>
	 */
	public static final MMCode mmFloatToFloatMultiCurrencySwap = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FloatToFloatMultiCurrencySwap";
			owner_lazy = () -> SwapType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SwapType1Code
	 * SwapType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InflationSingleCurrencySwap"</li>
	 * </ul>
	 */
	public static final MMCode mmInflationSingleCurrencySwap = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InflationSingleCurrencySwap";
			owner_lazy = () -> SwapType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SwapType1Code
	 * SwapType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OvernightIndexMultiCurrencySwap"</li>
	 * </ul>
	 */
	public static final MMCode mmOvernightIndexMultiCurrencySwap = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OvernightIndexMultiCurrencySwap";
			owner_lazy = () -> SwapType1Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SwapType1Code";
				definition = "Specifies the type of an interest rate derivative when the contract type is a swap, a swaption, a future on a swap and / or a forward on a swap.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SwapType1Code.mmOvernightIndexSingleCurrencySwap, com.tools20022.repository.codeset.SwapType1Code.mmFixedToFloatSingleCurrencySwap,
						com.tools20022.repository.codeset.SwapType1Code.mmFixedToFloatMultiCurrencySwap, com.tools20022.repository.codeset.SwapType1Code.mmFixedToFixedSingleCurrencySwap,
						com.tools20022.repository.codeset.SwapType1Code.mmFixedToFixedMultiCurrencySwap, com.tools20022.repository.codeset.SwapType1Code.mmInflationMultiCurrencySwap,
						com.tools20022.repository.codeset.SwapType1Code.mmFloatToFloatSingleCurrencySwap, com.tools20022.repository.codeset.SwapType1Code.mmFloatToFloatMultiCurrencySwap,
						com.tools20022.repository.codeset.SwapType1Code.mmInflationSingleCurrencySwap, com.tools20022.repository.codeset.SwapType1Code.mmOvernightIndexMultiCurrencySwap);
				trace_lazy = () -> SwapTypeCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}