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
import com.tools20022.repository.codeset.CRSStatus1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the Common Reporting Status (CRS) status.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.CRSStatus1Code#CRS101
 * CRSStatus1Code.CRS101}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CRSStatus1Code#CRS102
 * CRSStatus1Code.CRS102}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CRSStatus1Code#CRS103
 * CRSStatus1Code.CRS103}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CRSStatus1Code#CRS104
 * CRSStatus1Code.CRS104}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CRSStatus1Code#CRS105
 * CRSStatus1Code.CRS105}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CRSStatus1Code#CRS106
 * CRSStatus1Code.CRS106}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CRSStatus1Code#CRS107
 * CRSStatus1Code.CRS107}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CRSStatus1Code#CRS108
 * CRSStatus1Code.CRS108}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CRSStatus1Code#CRS109
 * CRSStatus1Code.CRS109}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CRSStatus1Code#CRS110
 * CRSStatus1Code.CRS110}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CRSStatus1Code#CRS111
 * CRSStatus1Code.CRS111}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CRSStatus1Code#CRS112
 * CRSStatus1Code.CRS112}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CRSStatus1Code#CRS113
 * CRSStatus1Code.CRS113}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CRSStatus1Code#CRS114
 * CRSStatus1Code.CRS114}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.CRSStatusCode CRSStatusCode}</li>
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
 * "CRSStatus1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the Common Reporting Status (CRS) status."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CRSStatus1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CRSStatus1Code
	 * CRSStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CRS101"</li>
	 * </ul>
	 */
	public static final CRSStatus1Code CRS101 = new CRSStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CRS101";
			owner_lazy = () -> com.tools20022.repository.codeset.CRSStatus1Code.mmObject();
			codeName = CRSStatusCode.CRS101.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CRSStatus1Code
	 * CRSStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CRS102"</li>
	 * </ul>
	 */
	public static final CRSStatus1Code CRS102 = new CRSStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CRS102";
			owner_lazy = () -> com.tools20022.repository.codeset.CRSStatus1Code.mmObject();
			codeName = CRSStatusCode.CRS102.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CRSStatus1Code
	 * CRSStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CRS103"</li>
	 * </ul>
	 */
	public static final CRSStatus1Code CRS103 = new CRSStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CRS103";
			owner_lazy = () -> com.tools20022.repository.codeset.CRSStatus1Code.mmObject();
			codeName = CRSStatusCode.CRS103.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CRSStatus1Code
	 * CRSStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CRS104"</li>
	 * </ul>
	 */
	public static final CRSStatus1Code CRS104 = new CRSStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CRS104";
			owner_lazy = () -> com.tools20022.repository.codeset.CRSStatus1Code.mmObject();
			codeName = CRSStatusCode.CRS104.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CRSStatus1Code
	 * CRSStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CRS105"</li>
	 * </ul>
	 */
	public static final CRSStatus1Code CRS105 = new CRSStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CRS105";
			owner_lazy = () -> com.tools20022.repository.codeset.CRSStatus1Code.mmObject();
			codeName = CRSStatusCode.CRS105.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CRSStatus1Code
	 * CRSStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CRS106"</li>
	 * </ul>
	 */
	public static final CRSStatus1Code CRS106 = new CRSStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CRS106";
			owner_lazy = () -> com.tools20022.repository.codeset.CRSStatus1Code.mmObject();
			codeName = CRSStatusCode.CRS106.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CRSStatus1Code
	 * CRSStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CRS107"</li>
	 * </ul>
	 */
	public static final CRSStatus1Code CRS107 = new CRSStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CRS107";
			owner_lazy = () -> com.tools20022.repository.codeset.CRSStatus1Code.mmObject();
			codeName = CRSStatusCode.CRS107.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CRSStatus1Code
	 * CRSStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CRS108"</li>
	 * </ul>
	 */
	public static final CRSStatus1Code CRS108 = new CRSStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CRS108";
			owner_lazy = () -> com.tools20022.repository.codeset.CRSStatus1Code.mmObject();
			codeName = CRSStatusCode.CRS108.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CRSStatus1Code
	 * CRSStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CRS109"</li>
	 * </ul>
	 */
	public static final CRSStatus1Code CRS109 = new CRSStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CRS109";
			owner_lazy = () -> com.tools20022.repository.codeset.CRSStatus1Code.mmObject();
			codeName = CRSStatusCode.CRS109.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CRSStatus1Code
	 * CRSStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CRS110"</li>
	 * </ul>
	 */
	public static final CRSStatus1Code CRS110 = new CRSStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CRS110";
			owner_lazy = () -> com.tools20022.repository.codeset.CRSStatus1Code.mmObject();
			codeName = CRSStatusCode.CRS110.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CRSStatus1Code
	 * CRSStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CRS111"</li>
	 * </ul>
	 */
	public static final CRSStatus1Code CRS111 = new CRSStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CRS111";
			owner_lazy = () -> com.tools20022.repository.codeset.CRSStatus1Code.mmObject();
			codeName = CRSStatusCode.CRS111.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CRSStatus1Code
	 * CRSStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CRS112"</li>
	 * </ul>
	 */
	public static final CRSStatus1Code CRS112 = new CRSStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CRS112";
			owner_lazy = () -> com.tools20022.repository.codeset.CRSStatus1Code.mmObject();
			codeName = CRSStatusCode.CRS112.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CRSStatus1Code
	 * CRSStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CRS113"</li>
	 * </ul>
	 */
	public static final CRSStatus1Code CRS113 = new CRSStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CRS113";
			owner_lazy = () -> com.tools20022.repository.codeset.CRSStatus1Code.mmObject();
			codeName = CRSStatusCode.CRS113.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CRSStatus1Code
	 * CRSStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CRS114"</li>
	 * </ul>
	 */
	public static final CRSStatus1Code CRS114 = new CRSStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CRS114";
			owner_lazy = () -> com.tools20022.repository.codeset.CRSStatus1Code.mmObject();
			codeName = CRSStatusCode.CRS114.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, CRSStatus1Code> codesByName = new LinkedHashMap<>();

	protected CRSStatus1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CRSStatus1Code";
				definition = "Specifies the Common Reporting Status (CRS) status.";
				trace_lazy = () -> CRSStatusCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CRSStatus1Code.CRS101, com.tools20022.repository.codeset.CRSStatus1Code.CRS102, com.tools20022.repository.codeset.CRSStatus1Code.CRS103,
						com.tools20022.repository.codeset.CRSStatus1Code.CRS104, com.tools20022.repository.codeset.CRSStatus1Code.CRS105, com.tools20022.repository.codeset.CRSStatus1Code.CRS106,
						com.tools20022.repository.codeset.CRSStatus1Code.CRS107, com.tools20022.repository.codeset.CRSStatus1Code.CRS108, com.tools20022.repository.codeset.CRSStatus1Code.CRS109,
						com.tools20022.repository.codeset.CRSStatus1Code.CRS110, com.tools20022.repository.codeset.CRSStatus1Code.CRS111, com.tools20022.repository.codeset.CRSStatus1Code.CRS112,
						com.tools20022.repository.codeset.CRSStatus1Code.CRS113, com.tools20022.repository.codeset.CRSStatus1Code.CRS114);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(CRS101.getCodeName().get(), CRS101);
		codesByName.put(CRS102.getCodeName().get(), CRS102);
		codesByName.put(CRS103.getCodeName().get(), CRS103);
		codesByName.put(CRS104.getCodeName().get(), CRS104);
		codesByName.put(CRS105.getCodeName().get(), CRS105);
		codesByName.put(CRS106.getCodeName().get(), CRS106);
		codesByName.put(CRS107.getCodeName().get(), CRS107);
		codesByName.put(CRS108.getCodeName().get(), CRS108);
		codesByName.put(CRS109.getCodeName().get(), CRS109);
		codesByName.put(CRS110.getCodeName().get(), CRS110);
		codesByName.put(CRS111.getCodeName().get(), CRS111);
		codesByName.put(CRS112.getCodeName().get(), CRS112);
		codesByName.put(CRS113.getCodeName().get(), CRS113);
		codesByName.put(CRS114.getCodeName().get(), CRS114);
	}

	public static CRSStatus1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CRSStatus1Code[] values() {
		CRSStatus1Code[] values = new CRSStatus1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CRSStatus1Code> {
		@Override
		public CRSStatus1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CRSStatus1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}