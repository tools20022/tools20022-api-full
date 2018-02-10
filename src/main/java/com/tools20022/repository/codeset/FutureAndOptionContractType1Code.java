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
import com.tools20022.repository.codeset.FutureAndOptionContractType1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Future And Option Contract Type.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FutureAndOptionContractType1Code#Ordinary
 * FutureAndOptionContractType1Code.Ordinary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FutureAndOptionContractType1Code#Index
 * FutureAndOptionContractType1Code.Index}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FutureAndOptionContractType1Code#ExercisedFuture
 * FutureAndOptionContractType1Code.ExercisedFuture}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.FutureAndOptionContractTypeCode
 * FutureAndOptionContractTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"ORDY"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FutureAndOptionContractType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Future And Option Contract Type."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class FutureAndOptionContractType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FutureAndOptionContractType1Code
	 * FutureAndOptionContractType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Ordinary"</li>
	 * </ul>
	 */
	public static final FutureAndOptionContractType1Code Ordinary = new FutureAndOptionContractType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Ordinary";
			owner_lazy = () -> com.tools20022.repository.codeset.FutureAndOptionContractType1Code.mmObject();
			codeName = FutureAndOptionContractTypeCode.Ordinary.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FutureAndOptionContractType1Code
	 * FutureAndOptionContractType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Index"</li>
	 * </ul>
	 */
	public static final FutureAndOptionContractType1Code Index = new FutureAndOptionContractType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Index";
			owner_lazy = () -> com.tools20022.repository.codeset.FutureAndOptionContractType1Code.mmObject();
			codeName = FutureAndOptionContractTypeCode.Index.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FutureAndOptionContractType1Code
	 * FutureAndOptionContractType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExercisedFuture"</li>
	 * </ul>
	 */
	public static final FutureAndOptionContractType1Code ExercisedFuture = new FutureAndOptionContractType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExercisedFuture";
			owner_lazy = () -> com.tools20022.repository.codeset.FutureAndOptionContractType1Code.mmObject();
			codeName = FutureAndOptionContractTypeCode.ExercisedFuture.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, FutureAndOptionContractType1Code> codesByName = new LinkedHashMap<>();

	protected FutureAndOptionContractType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("ORDY");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FutureAndOptionContractType1Code";
				definition = "Future And Option Contract Type.";
				trace_lazy = () -> FutureAndOptionContractTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.FutureAndOptionContractType1Code.Ordinary, com.tools20022.repository.codeset.FutureAndOptionContractType1Code.Index,
						com.tools20022.repository.codeset.FutureAndOptionContractType1Code.ExercisedFuture);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Ordinary.getCodeName().get(), Ordinary);
		codesByName.put(Index.getCodeName().get(), Index);
		codesByName.put(ExercisedFuture.getCodeName().get(), ExercisedFuture);
	}

	public static FutureAndOptionContractType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static FutureAndOptionContractType1Code[] values() {
		FutureAndOptionContractType1Code[] values = new FutureAndOptionContractType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, FutureAndOptionContractType1Code> {
		@Override
		public FutureAndOptionContractType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(FutureAndOptionContractType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}