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
import com.tools20022.repository.codeset.BenchmarkCurveNameCode;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Identifies a benchmark curve name.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveNameCode
 * BenchmarkCurveNameCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveName1Code#mmMuniAAA
 * BenchmarkCurveName1Code.mmMuniAAA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveName1Code#mmFutureSWAP
 * BenchmarkCurveName1Code.mmFutureSWAP}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveName1Code#mmLIBID
 * BenchmarkCurveName1Code.mmLIBID}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveName1Code#mmLIBOR
 * BenchmarkCurveName1Code.mmLIBOR}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveName1Code#mmSWAP
 * BenchmarkCurveName1Code.mmSWAP}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveName1Code#mmTreasury
 * BenchmarkCurveName1Code.mmTreasury}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveName1Code#mmEuribor
 * BenchmarkCurveName1Code.mmEuribor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveName1Code#mmPfandbriefe
 * BenchmarkCurveName1Code.mmPfandbriefe}</li>
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
 * <li>"MAAA"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "BenchmarkCurveName1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Identifies a benchmark curve name."</li>
 * </ul>
 */
public class BenchmarkCurveName1Code extends BenchmarkCurveNameCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveName1Code
	 * BenchmarkCurveName1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MuniAAA"</li>
	 * </ul>
	 */
	public static final MMCode mmMuniAAA = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MuniAAA";
			owner_lazy = () -> BenchmarkCurveName1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveName1Code
	 * BenchmarkCurveName1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FutureSWAP"</li>
	 * </ul>
	 */
	public static final MMCode mmFutureSWAP = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FutureSWAP";
			owner_lazy = () -> BenchmarkCurveName1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveName1Code
	 * BenchmarkCurveName1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LIBID"</li>
	 * </ul>
	 */
	public static final MMCode mmLIBID = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LIBID";
			owner_lazy = () -> BenchmarkCurveName1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveName1Code
	 * BenchmarkCurveName1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LIBOR"</li>
	 * </ul>
	 */
	public static final MMCode mmLIBOR = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LIBOR";
			owner_lazy = () -> BenchmarkCurveName1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveName1Code
	 * BenchmarkCurveName1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SWAP"</li>
	 * </ul>
	 */
	public static final MMCode mmSWAP = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SWAP";
			owner_lazy = () -> BenchmarkCurveName1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveName1Code
	 * BenchmarkCurveName1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Treasury"</li>
	 * </ul>
	 */
	public static final MMCode mmTreasury = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Treasury";
			owner_lazy = () -> BenchmarkCurveName1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveName1Code
	 * BenchmarkCurveName1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Euribor"</li>
	 * </ul>
	 */
	public static final MMCode mmEuribor = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Euribor";
			owner_lazy = () -> BenchmarkCurveName1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveName1Code
	 * BenchmarkCurveName1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Pfandbriefe"</li>
	 * </ul>
	 */
	public static final MMCode mmPfandbriefe = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pfandbriefe";
			owner_lazy = () -> BenchmarkCurveName1Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("MAAA");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BenchmarkCurveName1Code";
				definition = "Identifies a benchmark curve name.";
				code_lazy = () -> Arrays.asList(BenchmarkCurveName1Code.mmMuniAAA, BenchmarkCurveName1Code.mmFutureSWAP, BenchmarkCurveName1Code.mmLIBID, BenchmarkCurveName1Code.mmLIBOR, BenchmarkCurveName1Code.mmSWAP,
						BenchmarkCurveName1Code.mmTreasury, BenchmarkCurveName1Code.mmEuribor, BenchmarkCurveName1Code.mmPfandbriefe);
				trace_lazy = () -> BenchmarkCurveNameCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}