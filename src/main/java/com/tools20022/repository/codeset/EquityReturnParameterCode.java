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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies an equity derivative return parameter.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EquityReturnParameterCode#PriceReturnBasicPerformanceParameter
 * EquityReturnParameterCode.PriceReturnBasicPerformanceParameter}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EquityReturnParameterCode#ParameterReturnVariance
 * EquityReturnParameterCode.ParameterReturnVariance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EquityReturnParameterCode#ParameterReturnVolatility
 * EquityReturnParameterCode.ParameterReturnVolatility}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EquityReturnParameterCode#ParameterReturnDividend
 * EquityReturnParameterCode.ParameterReturnDividend}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.EquityReturnParameter1Code
 * EquityReturnParameter1Code}</li>
 * </ul>
 * </li>
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
 * "EquityReturnParameterCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies an equity derivative return parameter."</li>
 * </ul>
 */
public class EquityReturnParameterCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Equity derivative parameter Price Return Basis Performance.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EquityReturnParameterCode
	 * EquityReturnParameterCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PRBP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceReturnBasicPerformanceParameter"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Equity derivative parameter Price Return Basis Performance. "</li>
	 * </ul>
	 */
	public static final MMCode PriceReturnBasicPerformanceParameter = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceReturnBasicPerformanceParameter";
			definition = "Equity derivative parameter Price Return Basis Performance. ";
			owner_lazy = () -> EquityReturnParameterCode.mmObject();
			codeName = "PRBP";
		}
	};
	/**
	 * Equity derivative parameter Return Variance.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EquityReturnParameterCode
	 * EquityReturnParameterCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PRVA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ParameterReturnVariance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Equity derivative parameter Return Variance. "</li>
	 * </ul>
	 */
	public static final MMCode ParameterReturnVariance = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ParameterReturnVariance";
			definition = "Equity derivative parameter Return Variance. ";
			owner_lazy = () -> EquityReturnParameterCode.mmObject();
			codeName = "PRVA";
		}
	};
	/**
	 * Equity derivative parameter Return Volatility.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EquityReturnParameterCode
	 * EquityReturnParameterCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PRVO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ParameterReturnVolatility"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Equity derivative parameter Return Volatility. "</li>
	 * </ul>
	 */
	public static final MMCode ParameterReturnVolatility = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ParameterReturnVolatility";
			definition = "Equity derivative parameter Return Volatility. ";
			owner_lazy = () -> EquityReturnParameterCode.mmObject();
			codeName = "PRVO";
		}
	};
	/**
	 * Equity derivative parameter Return Dividend.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EquityReturnParameterCode
	 * EquityReturnParameterCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PRDV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ParameterReturnDividend"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Equity derivative parameter Return Dividend. "</li>
	 * </ul>
	 */
	public static final MMCode ParameterReturnDividend = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ParameterReturnDividend";
			definition = "Equity derivative parameter Return Dividend. ";
			owner_lazy = () -> EquityReturnParameterCode.mmObject();
			codeName = "PRDV";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "EquityReturnParameterCode";
				definition = "Specifies an equity derivative return parameter.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.EquityReturnParameterCode.PriceReturnBasicPerformanceParameter, com.tools20022.repository.codeset.EquityReturnParameterCode.ParameterReturnVariance,
						com.tools20022.repository.codeset.EquityReturnParameterCode.ParameterReturnVolatility, com.tools20022.repository.codeset.EquityReturnParameterCode.ParameterReturnDividend);
				derivation_lazy = () -> Arrays.asList(EquityReturnParameter1Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}