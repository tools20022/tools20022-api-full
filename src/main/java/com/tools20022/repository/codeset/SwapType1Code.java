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
import com.tools20022.repository.codeset.SwapType1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of an interest rate derivative when the contract type is a
 * swap, a swaption, a future on a swap and / or a forward on a swap.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SwapType1Code#OvernightIndexSingleCurrencySwap
 * SwapType1Code.OvernightIndexSingleCurrencySwap}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SwapType1Code#FixedToFloatSingleCurrencySwap
 * SwapType1Code.FixedToFloatSingleCurrencySwap}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SwapType1Code#FixedToFloatMultiCurrencySwap
 * SwapType1Code.FixedToFloatMultiCurrencySwap}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SwapType1Code#FixedToFixedSingleCurrencySwap
 * SwapType1Code.FixedToFixedSingleCurrencySwap}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SwapType1Code#FixedToFixedMultiCurrencySwap
 * SwapType1Code.FixedToFixedMultiCurrencySwap}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SwapType1Code#InflationMultiCurrencySwap
 * SwapType1Code.InflationMultiCurrencySwap}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SwapType1Code#FloatToFloatSingleCurrencySwap
 * SwapType1Code.FloatToFloatSingleCurrencySwap}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SwapType1Code#FloatToFloatMultiCurrencySwap
 * SwapType1Code.FloatToFloatMultiCurrencySwap}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SwapType1Code#InflationSingleCurrencySwap
 * SwapType1Code.InflationSingleCurrencySwap}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SwapType1Code#OvernightIndexMultiCurrencySwap
 * SwapType1Code.OvernightIndexMultiCurrencySwap}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.SwapTypeCode SwapTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class SwapType1Code extends MMCode {

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
	public static final SwapType1Code OvernightIndexSingleCurrencySwap = new SwapType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OvernightIndexSingleCurrencySwap";
			owner_lazy = () -> com.tools20022.repository.codeset.SwapType1Code.mmObject();
			codeName = SwapTypeCode.OvernightIndexSingleCurrencySwap.getCodeName().orElse(name);
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
	public static final SwapType1Code FixedToFloatSingleCurrencySwap = new SwapType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FixedToFloatSingleCurrencySwap";
			owner_lazy = () -> com.tools20022.repository.codeset.SwapType1Code.mmObject();
			codeName = SwapTypeCode.FixedToFloatSingleCurrencySwap.getCodeName().orElse(name);
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
	public static final SwapType1Code FixedToFloatMultiCurrencySwap = new SwapType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FixedToFloatMultiCurrencySwap";
			owner_lazy = () -> com.tools20022.repository.codeset.SwapType1Code.mmObject();
			codeName = SwapTypeCode.FixedToFloatMultiCurrencySwap.getCodeName().orElse(name);
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
	public static final SwapType1Code FixedToFixedSingleCurrencySwap = new SwapType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FixedToFixedSingleCurrencySwap";
			owner_lazy = () -> com.tools20022.repository.codeset.SwapType1Code.mmObject();
			codeName = SwapTypeCode.FixedToFixedSingleCurrencySwap.getCodeName().orElse(name);
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
	public static final SwapType1Code FixedToFixedMultiCurrencySwap = new SwapType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FixedToFixedMultiCurrencySwap";
			owner_lazy = () -> com.tools20022.repository.codeset.SwapType1Code.mmObject();
			codeName = SwapTypeCode.FixedToFixedMultiCurrencySwap.getCodeName().orElse(name);
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
	public static final SwapType1Code InflationMultiCurrencySwap = new SwapType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InflationMultiCurrencySwap";
			owner_lazy = () -> com.tools20022.repository.codeset.SwapType1Code.mmObject();
			codeName = SwapTypeCode.InflationMultiCurrencySwap.getCodeName().orElse(name);
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
	public static final SwapType1Code FloatToFloatSingleCurrencySwap = new SwapType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FloatToFloatSingleCurrencySwap";
			owner_lazy = () -> com.tools20022.repository.codeset.SwapType1Code.mmObject();
			codeName = SwapTypeCode.FloatToFloatSingleCurrencySwap.getCodeName().orElse(name);
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
	public static final SwapType1Code FloatToFloatMultiCurrencySwap = new SwapType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FloatToFloatMultiCurrencySwap";
			owner_lazy = () -> com.tools20022.repository.codeset.SwapType1Code.mmObject();
			codeName = SwapTypeCode.FloatToFloatMultiCurrencySwap.getCodeName().orElse(name);
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
	public static final SwapType1Code InflationSingleCurrencySwap = new SwapType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InflationSingleCurrencySwap";
			owner_lazy = () -> com.tools20022.repository.codeset.SwapType1Code.mmObject();
			codeName = SwapTypeCode.InflationSingleCurrencySwap.getCodeName().orElse(name);
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
	public static final SwapType1Code OvernightIndexMultiCurrencySwap = new SwapType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OvernightIndexMultiCurrencySwap";
			owner_lazy = () -> com.tools20022.repository.codeset.SwapType1Code.mmObject();
			codeName = SwapTypeCode.OvernightIndexMultiCurrencySwap.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, SwapType1Code> codesByName = new LinkedHashMap<>();

	protected SwapType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SwapType1Code";
				definition = "Specifies the type of an interest rate derivative when the contract type is a swap, a swaption, a future on a swap and / or a forward on a swap.";
				trace_lazy = () -> SwapTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SwapType1Code.OvernightIndexSingleCurrencySwap, com.tools20022.repository.codeset.SwapType1Code.FixedToFloatSingleCurrencySwap,
						com.tools20022.repository.codeset.SwapType1Code.FixedToFloatMultiCurrencySwap, com.tools20022.repository.codeset.SwapType1Code.FixedToFixedSingleCurrencySwap,
						com.tools20022.repository.codeset.SwapType1Code.FixedToFixedMultiCurrencySwap, com.tools20022.repository.codeset.SwapType1Code.InflationMultiCurrencySwap,
						com.tools20022.repository.codeset.SwapType1Code.FloatToFloatSingleCurrencySwap, com.tools20022.repository.codeset.SwapType1Code.FloatToFloatMultiCurrencySwap,
						com.tools20022.repository.codeset.SwapType1Code.InflationSingleCurrencySwap, com.tools20022.repository.codeset.SwapType1Code.OvernightIndexMultiCurrencySwap);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(OvernightIndexSingleCurrencySwap.getCodeName().get(), OvernightIndexSingleCurrencySwap);
		codesByName.put(FixedToFloatSingleCurrencySwap.getCodeName().get(), FixedToFloatSingleCurrencySwap);
		codesByName.put(FixedToFloatMultiCurrencySwap.getCodeName().get(), FixedToFloatMultiCurrencySwap);
		codesByName.put(FixedToFixedSingleCurrencySwap.getCodeName().get(), FixedToFixedSingleCurrencySwap);
		codesByName.put(FixedToFixedMultiCurrencySwap.getCodeName().get(), FixedToFixedMultiCurrencySwap);
		codesByName.put(InflationMultiCurrencySwap.getCodeName().get(), InflationMultiCurrencySwap);
		codesByName.put(FloatToFloatSingleCurrencySwap.getCodeName().get(), FloatToFloatSingleCurrencySwap);
		codesByName.put(FloatToFloatMultiCurrencySwap.getCodeName().get(), FloatToFloatMultiCurrencySwap);
		codesByName.put(InflationSingleCurrencySwap.getCodeName().get(), InflationSingleCurrencySwap);
		codesByName.put(OvernightIndexMultiCurrencySwap.getCodeName().get(), OvernightIndexMultiCurrencySwap);
	}

	public static SwapType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static SwapType1Code[] values() {
		SwapType1Code[] values = new SwapType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, SwapType1Code> {
		@Override
		public SwapType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(SwapType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}