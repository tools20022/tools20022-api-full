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
import com.tools20022.repository.codeset.EquityReturnParameter1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies an equity derivative return parameter.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EquityReturnParameter1Code#ParameterReturnDividend
 * EquityReturnParameter1Code.ParameterReturnDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EquityReturnParameter1Code#ParameterReturnVariance
 * EquityReturnParameter1Code.ParameterReturnVariance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EquityReturnParameter1Code#ParameterReturnVolatility
 * EquityReturnParameter1Code.ParameterReturnVolatility}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EquityReturnParameter1Code#PriceReturnBasicPerformanceParameter
 * EquityReturnParameter1Code.PriceReturnBasicPerformanceParameter}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.EquityReturnParameterCode
 * EquityReturnParameterCode}</li>
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
 * "EquityReturnParameter1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies an equity derivative return parameter."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class EquityReturnParameter1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EquityReturnParameter1Code
	 * EquityReturnParameter1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ParameterReturnDividend"</li>
	 * </ul>
	 */
	public static final EquityReturnParameter1Code ParameterReturnDividend = new EquityReturnParameter1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ParameterReturnDividend";
			owner_lazy = () -> com.tools20022.repository.codeset.EquityReturnParameter1Code.mmObject();
			codeName = EquityReturnParameterCode.ParameterReturnDividend.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EquityReturnParameter1Code
	 * EquityReturnParameter1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ParameterReturnVariance"</li>
	 * </ul>
	 */
	public static final EquityReturnParameter1Code ParameterReturnVariance = new EquityReturnParameter1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ParameterReturnVariance";
			owner_lazy = () -> com.tools20022.repository.codeset.EquityReturnParameter1Code.mmObject();
			codeName = EquityReturnParameterCode.ParameterReturnVariance.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EquityReturnParameter1Code
	 * EquityReturnParameter1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ParameterReturnVolatility"</li>
	 * </ul>
	 */
	public static final EquityReturnParameter1Code ParameterReturnVolatility = new EquityReturnParameter1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ParameterReturnVolatility";
			owner_lazy = () -> com.tools20022.repository.codeset.EquityReturnParameter1Code.mmObject();
			codeName = EquityReturnParameterCode.ParameterReturnVolatility.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EquityReturnParameter1Code
	 * EquityReturnParameter1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceReturnBasicPerformanceParameter"</li>
	 * </ul>
	 */
	public static final EquityReturnParameter1Code PriceReturnBasicPerformanceParameter = new EquityReturnParameter1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceReturnBasicPerformanceParameter";
			owner_lazy = () -> com.tools20022.repository.codeset.EquityReturnParameter1Code.mmObject();
			codeName = EquityReturnParameterCode.PriceReturnBasicPerformanceParameter.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, EquityReturnParameter1Code> codesByName = new LinkedHashMap<>();

	protected EquityReturnParameter1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "EquityReturnParameter1Code";
				definition = "Specifies an equity derivative return parameter.";
				trace_lazy = () -> EquityReturnParameterCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.EquityReturnParameter1Code.ParameterReturnDividend, com.tools20022.repository.codeset.EquityReturnParameter1Code.ParameterReturnVariance,
						com.tools20022.repository.codeset.EquityReturnParameter1Code.ParameterReturnVolatility, com.tools20022.repository.codeset.EquityReturnParameter1Code.PriceReturnBasicPerformanceParameter);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(ParameterReturnDividend.getCodeName().get(), ParameterReturnDividend);
		codesByName.put(ParameterReturnVariance.getCodeName().get(), ParameterReturnVariance);
		codesByName.put(ParameterReturnVolatility.getCodeName().get(), ParameterReturnVolatility);
		codesByName.put(PriceReturnBasicPerformanceParameter.getCodeName().get(), PriceReturnBasicPerformanceParameter);
	}

	public static EquityReturnParameter1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static EquityReturnParameter1Code[] values() {
		EquityReturnParameter1Code[] values = new EquityReturnParameter1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, EquityReturnParameter1Code> {
		@Override
		public EquityReturnParameter1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(EquityReturnParameter1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}