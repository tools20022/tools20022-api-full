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
import com.tools20022.repository.codeset.CutOff1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the cut-off type.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CutOff1Code#AnticipatedEarlyCutoff
 * CutOff1Code.AnticipatedEarlyCutoff}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CutOff1Code#Early
 * CutOff1Code.Early}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CutOff1Code#Late
 * CutOff1Code.Late}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.CutOffCode CutOffCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"AERL"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CutOff1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the cut-off  type."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CutOff1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CutOff1Code CutOff1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AnticipatedEarlyCutoff"</li>
	 * </ul>
	 */
	public static final CutOff1Code AnticipatedEarlyCutoff = new CutOff1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AnticipatedEarlyCutoff";
			owner_lazy = () -> com.tools20022.repository.codeset.CutOff1Code.mmObject();
			codeName = CutOffCode.AnticipatedEarlyCutoff.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CutOff1Code CutOff1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Early"</li>
	 * </ul>
	 */
	public static final CutOff1Code Early = new CutOff1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Early";
			owner_lazy = () -> com.tools20022.repository.codeset.CutOff1Code.mmObject();
			codeName = CutOffCode.Early.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CutOff1Code CutOff1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Late"</li>
	 * </ul>
	 */
	public static final CutOff1Code Late = new CutOff1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Late";
			owner_lazy = () -> com.tools20022.repository.codeset.CutOff1Code.mmObject();
			codeName = CutOffCode.Late.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, CutOff1Code> codesByName = new LinkedHashMap<>();

	protected CutOff1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("AERL");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CutOff1Code";
				definition = "Specifies the cut-off  type.";
				trace_lazy = () -> CutOffCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CutOff1Code.AnticipatedEarlyCutoff, com.tools20022.repository.codeset.CutOff1Code.Early, com.tools20022.repository.codeset.CutOff1Code.Late);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AnticipatedEarlyCutoff.getCodeName().get(), AnticipatedEarlyCutoff);
		codesByName.put(Early.getCodeName().get(), Early);
		codesByName.put(Late.getCodeName().get(), Late);
	}

	public static CutOff1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CutOff1Code[] values() {
		CutOff1Code[] values = new CutOff1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CutOff1Code> {
		@Override
		public CutOff1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CutOff1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}