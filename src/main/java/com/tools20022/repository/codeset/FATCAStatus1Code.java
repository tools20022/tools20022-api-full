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
import com.tools20022.repository.codeset.FATCAStatus1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the Foreign Account Tax Compliance Act (FATCA) status.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.FATCAStatus1Code#FATCA101
 * FATCAStatus1Code.FATCA101}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.FATCAStatus1Code#FATCA102
 * FATCAStatus1Code.FATCA102}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.FATCAStatus1Code#FATCA103
 * FATCAStatus1Code.FATCA103}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.FATCAStatus1Code#FATCA104
 * FATCAStatus1Code.FATCA104}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.FATCAStatus1Code#FATCA105
 * FATCAStatus1Code.FATCA105}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.FATCAStatus1Code#FATCA201
 * FATCAStatus1Code.FATCA201}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.FATCAStatus1Code#FATCA202
 * FATCAStatus1Code.FATCA202}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.FATCAStatus1Code#FATCA203
 * FATCAStatus1Code.FATCA203}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.FATCAStatus1Code#FATCA204
 * FATCAStatus1Code.FATCA204}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.FATCAStatus1Code#FATCA205
 * FATCAStatus1Code.FATCA205}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.FATCAStatus1Code#FATCA206
 * FATCAStatus1Code.FATCA206}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.FATCAStatusCode
 * FATCAStatusCode}</li>
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
 * "FATCAStatus1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the Foreign Account Tax Compliance Act (FATCA) status."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class FATCAStatus1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FATCAStatus1Code
	 * FATCAStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FATCA101"</li>
	 * </ul>
	 */
	public static final FATCAStatus1Code FATCA101 = new FATCAStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FATCA101";
			owner_lazy = () -> com.tools20022.repository.codeset.FATCAStatus1Code.mmObject();
			codeName = FATCAStatusCode.FATCA101.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FATCAStatus1Code
	 * FATCAStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FATCA102"</li>
	 * </ul>
	 */
	public static final FATCAStatus1Code FATCA102 = new FATCAStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FATCA102";
			owner_lazy = () -> com.tools20022.repository.codeset.FATCAStatus1Code.mmObject();
			codeName = FATCAStatusCode.FATCA102.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FATCAStatus1Code
	 * FATCAStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FATCA103"</li>
	 * </ul>
	 */
	public static final FATCAStatus1Code FATCA103 = new FATCAStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FATCA103";
			owner_lazy = () -> com.tools20022.repository.codeset.FATCAStatus1Code.mmObject();
			codeName = FATCAStatusCode.FATCA103.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FATCAStatus1Code
	 * FATCAStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FATCA104"</li>
	 * </ul>
	 */
	public static final FATCAStatus1Code FATCA104 = new FATCAStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FATCA104";
			owner_lazy = () -> com.tools20022.repository.codeset.FATCAStatus1Code.mmObject();
			codeName = FATCAStatusCode.FATCA104.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FATCAStatus1Code
	 * FATCAStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FATCA105"</li>
	 * </ul>
	 */
	public static final FATCAStatus1Code FATCA105 = new FATCAStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FATCA105";
			owner_lazy = () -> com.tools20022.repository.codeset.FATCAStatus1Code.mmObject();
			codeName = FATCAStatusCode.FATCA105.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FATCAStatus1Code
	 * FATCAStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FATCA201"</li>
	 * </ul>
	 */
	public static final FATCAStatus1Code FATCA201 = new FATCAStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FATCA201";
			owner_lazy = () -> com.tools20022.repository.codeset.FATCAStatus1Code.mmObject();
			codeName = FATCAStatusCode.FATCA201.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FATCAStatus1Code
	 * FATCAStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FATCA202"</li>
	 * </ul>
	 */
	public static final FATCAStatus1Code FATCA202 = new FATCAStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FATCA202";
			owner_lazy = () -> com.tools20022.repository.codeset.FATCAStatus1Code.mmObject();
			codeName = FATCAStatusCode.FATCA202.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FATCAStatus1Code
	 * FATCAStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FATCA203"</li>
	 * </ul>
	 */
	public static final FATCAStatus1Code FATCA203 = new FATCAStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FATCA203";
			owner_lazy = () -> com.tools20022.repository.codeset.FATCAStatus1Code.mmObject();
			codeName = FATCAStatusCode.FATCA203.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FATCAStatus1Code
	 * FATCAStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FATCA204"</li>
	 * </ul>
	 */
	public static final FATCAStatus1Code FATCA204 = new FATCAStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FATCA204";
			owner_lazy = () -> com.tools20022.repository.codeset.FATCAStatus1Code.mmObject();
			codeName = FATCAStatusCode.FATCA204.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FATCAStatus1Code
	 * FATCAStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FATCA205"</li>
	 * </ul>
	 */
	public static final FATCAStatus1Code FATCA205 = new FATCAStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FATCA205";
			owner_lazy = () -> com.tools20022.repository.codeset.FATCAStatus1Code.mmObject();
			codeName = FATCAStatusCode.FATCA205.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FATCAStatus1Code
	 * FATCAStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FATCA206"</li>
	 * </ul>
	 */
	public static final FATCAStatus1Code FATCA206 = new FATCAStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FATCA206";
			owner_lazy = () -> com.tools20022.repository.codeset.FATCAStatus1Code.mmObject();
			codeName = FATCAStatusCode.FATCA206.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, FATCAStatus1Code> codesByName = new LinkedHashMap<>();

	protected FATCAStatus1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FATCAStatus1Code";
				definition = "Specifies the Foreign Account Tax Compliance Act (FATCA) status.";
				trace_lazy = () -> FATCAStatusCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.FATCAStatus1Code.FATCA101, com.tools20022.repository.codeset.FATCAStatus1Code.FATCA102, com.tools20022.repository.codeset.FATCAStatus1Code.FATCA103,
						com.tools20022.repository.codeset.FATCAStatus1Code.FATCA104, com.tools20022.repository.codeset.FATCAStatus1Code.FATCA105, com.tools20022.repository.codeset.FATCAStatus1Code.FATCA201,
						com.tools20022.repository.codeset.FATCAStatus1Code.FATCA202, com.tools20022.repository.codeset.FATCAStatus1Code.FATCA203, com.tools20022.repository.codeset.FATCAStatus1Code.FATCA204,
						com.tools20022.repository.codeset.FATCAStatus1Code.FATCA205, com.tools20022.repository.codeset.FATCAStatus1Code.FATCA206);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(FATCA101.getCodeName().get(), FATCA101);
		codesByName.put(FATCA102.getCodeName().get(), FATCA102);
		codesByName.put(FATCA103.getCodeName().get(), FATCA103);
		codesByName.put(FATCA104.getCodeName().get(), FATCA104);
		codesByName.put(FATCA105.getCodeName().get(), FATCA105);
		codesByName.put(FATCA201.getCodeName().get(), FATCA201);
		codesByName.put(FATCA202.getCodeName().get(), FATCA202);
		codesByName.put(FATCA203.getCodeName().get(), FATCA203);
		codesByName.put(FATCA204.getCodeName().get(), FATCA204);
		codesByName.put(FATCA205.getCodeName().get(), FATCA205);
		codesByName.put(FATCA206.getCodeName().get(), FATCA206);
	}

	public static FATCAStatus1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static FATCAStatus1Code[] values() {
		FATCAStatus1Code[] values = new FATCAStatus1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, FATCAStatus1Code> {
		@Override
		public FATCAStatus1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(FATCAStatus1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}