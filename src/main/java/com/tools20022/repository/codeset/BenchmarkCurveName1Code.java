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
import com.tools20022.repository.codeset.BenchmarkCurveName1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Identifies a benchmark curve name.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveName1Code#MuniAAA
 * BenchmarkCurveName1Code.MuniAAA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveName1Code#FutureSWAP
 * BenchmarkCurveName1Code.FutureSWAP}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveName1Code#LIBID
 * BenchmarkCurveName1Code.LIBID}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveName1Code#LIBOR
 * BenchmarkCurveName1Code.LIBOR}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveName1Code#SWAP
 * BenchmarkCurveName1Code.SWAP}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveName1Code#Treasury
 * BenchmarkCurveName1Code.Treasury}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveName1Code#Euribor
 * BenchmarkCurveName1Code.Euribor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveName1Code#Pfandbriefe
 * BenchmarkCurveName1Code.Pfandbriefe}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveNameCode
 * BenchmarkCurveNameCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class BenchmarkCurveName1Code extends MMCode {

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
	public static final BenchmarkCurveName1Code MuniAAA = new BenchmarkCurveName1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MuniAAA";
			owner_lazy = () -> com.tools20022.repository.codeset.BenchmarkCurveName1Code.mmObject();
			codeName = BenchmarkCurveNameCode.MuniAAA.getCodeName().orElse(name);
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
	public static final BenchmarkCurveName1Code FutureSWAP = new BenchmarkCurveName1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FutureSWAP";
			owner_lazy = () -> com.tools20022.repository.codeset.BenchmarkCurveName1Code.mmObject();
			codeName = BenchmarkCurveNameCode.FutureSWAP.getCodeName().orElse(name);
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
	public static final BenchmarkCurveName1Code LIBID = new BenchmarkCurveName1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LIBID";
			owner_lazy = () -> com.tools20022.repository.codeset.BenchmarkCurveName1Code.mmObject();
			codeName = BenchmarkCurveNameCode.LIBID.getCodeName().orElse(name);
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
	public static final BenchmarkCurveName1Code LIBOR = new BenchmarkCurveName1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LIBOR";
			owner_lazy = () -> com.tools20022.repository.codeset.BenchmarkCurveName1Code.mmObject();
			codeName = BenchmarkCurveNameCode.LIBOR.getCodeName().orElse(name);
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
	public static final BenchmarkCurveName1Code SWAP = new BenchmarkCurveName1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SWAP";
			owner_lazy = () -> com.tools20022.repository.codeset.BenchmarkCurveName1Code.mmObject();
			codeName = BenchmarkCurveNameCode.SWAP.getCodeName().orElse(name);
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
	public static final BenchmarkCurveName1Code Treasury = new BenchmarkCurveName1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Treasury";
			owner_lazy = () -> com.tools20022.repository.codeset.BenchmarkCurveName1Code.mmObject();
			codeName = BenchmarkCurveNameCode.Treasury.getCodeName().orElse(name);
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
	public static final BenchmarkCurveName1Code Euribor = new BenchmarkCurveName1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Euribor";
			owner_lazy = () -> com.tools20022.repository.codeset.BenchmarkCurveName1Code.mmObject();
			codeName = BenchmarkCurveNameCode.Euribor.getCodeName().orElse(name);
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
	public static final BenchmarkCurveName1Code Pfandbriefe = new BenchmarkCurveName1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pfandbriefe";
			owner_lazy = () -> com.tools20022.repository.codeset.BenchmarkCurveName1Code.mmObject();
			codeName = BenchmarkCurveNameCode.Pfandbriefe.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, BenchmarkCurveName1Code> codesByName = new LinkedHashMap<>();

	protected BenchmarkCurveName1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("MAAA");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BenchmarkCurveName1Code";
				definition = "Identifies a benchmark curve name.";
				trace_lazy = () -> BenchmarkCurveNameCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.BenchmarkCurveName1Code.MuniAAA, com.tools20022.repository.codeset.BenchmarkCurveName1Code.FutureSWAP,
						com.tools20022.repository.codeset.BenchmarkCurveName1Code.LIBID, com.tools20022.repository.codeset.BenchmarkCurveName1Code.LIBOR, com.tools20022.repository.codeset.BenchmarkCurveName1Code.SWAP,
						com.tools20022.repository.codeset.BenchmarkCurveName1Code.Treasury, com.tools20022.repository.codeset.BenchmarkCurveName1Code.Euribor, com.tools20022.repository.codeset.BenchmarkCurveName1Code.Pfandbriefe);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(MuniAAA.getCodeName().get(), MuniAAA);
		codesByName.put(FutureSWAP.getCodeName().get(), FutureSWAP);
		codesByName.put(LIBID.getCodeName().get(), LIBID);
		codesByName.put(LIBOR.getCodeName().get(), LIBOR);
		codesByName.put(SWAP.getCodeName().get(), SWAP);
		codesByName.put(Treasury.getCodeName().get(), Treasury);
		codesByName.put(Euribor.getCodeName().get(), Euribor);
		codesByName.put(Pfandbriefe.getCodeName().get(), Pfandbriefe);
	}

	public static BenchmarkCurveName1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static BenchmarkCurveName1Code[] values() {
		BenchmarkCurveName1Code[] values = new BenchmarkCurveName1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, BenchmarkCurveName1Code> {
		@Override
		public BenchmarkCurveName1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(BenchmarkCurveName1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}