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
import com.tools20022.repository.codeset.MemberType1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the nature of the membership of a party in a system. A system may
 * recognise different types of membership, with different related rights and
 * obligations.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.MemberType1Code#Direct
 * MemberType1Code.Direct}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.MemberType1Code#Indirect
 * MemberType1Code.Indirect}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.MemberType1Code#Remote
 * MemberType1Code.Remote}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.MemberType1Code#EURO1
 * MemberType1Code.EURO1}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.MemberType1Code#STEP1
 * MemberType1Code.STEP1}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.MemberTypeCode MemberTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"DRCT"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MemberType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the nature of the membership of a party in a system. A system may recognise different types of membership, with different related rights and obligations."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class MemberType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MemberType1Code
	 * MemberType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Direct"</li>
	 * </ul>
	 */
	public static final MemberType1Code Direct = new MemberType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Direct";
			owner_lazy = () -> com.tools20022.repository.codeset.MemberType1Code.mmObject();
			codeName = MemberTypeCode.Direct.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MemberType1Code
	 * MemberType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Indirect"</li>
	 * </ul>
	 */
	public static final MemberType1Code Indirect = new MemberType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Indirect";
			owner_lazy = () -> com.tools20022.repository.codeset.MemberType1Code.mmObject();
			codeName = MemberTypeCode.Indirect.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MemberType1Code
	 * MemberType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Remote"</li>
	 * </ul>
	 */
	public static final MemberType1Code Remote = new MemberType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Remote";
			owner_lazy = () -> com.tools20022.repository.codeset.MemberType1Code.mmObject();
			codeName = MemberTypeCode.Remote.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MemberType1Code
	 * MemberType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EURO1"</li>
	 * </ul>
	 */
	public static final MemberType1Code EURO1 = new MemberType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EURO1";
			owner_lazy = () -> com.tools20022.repository.codeset.MemberType1Code.mmObject();
			codeName = MemberTypeCode.EURO1.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MemberType1Code
	 * MemberType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "STEP1"</li>
	 * </ul>
	 */
	public static final MemberType1Code STEP1 = new MemberType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "STEP1";
			owner_lazy = () -> com.tools20022.repository.codeset.MemberType1Code.mmObject();
			codeName = MemberTypeCode.STEP1.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, MemberType1Code> codesByName = new LinkedHashMap<>();

	protected MemberType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("DRCT");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MemberType1Code";
				definition = "Specifies the nature of the membership of a party in a system. A system may recognise different types of membership, with different related rights and obligations.";
				trace_lazy = () -> MemberTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.MemberType1Code.Direct, com.tools20022.repository.codeset.MemberType1Code.Indirect, com.tools20022.repository.codeset.MemberType1Code.Remote,
						com.tools20022.repository.codeset.MemberType1Code.EURO1, com.tools20022.repository.codeset.MemberType1Code.STEP1);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Direct.getCodeName().get(), Direct);
		codesByName.put(Indirect.getCodeName().get(), Indirect);
		codesByName.put(Remote.getCodeName().get(), Remote);
		codesByName.put(EURO1.getCodeName().get(), EURO1);
		codesByName.put(STEP1.getCodeName().get(), STEP1);
	}

	public static MemberType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static MemberType1Code[] values() {
		MemberType1Code[] values = new MemberType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, MemberType1Code> {
		@Override
		public MemberType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(MemberType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}