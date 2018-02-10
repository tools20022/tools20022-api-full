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
import com.tools20022.repository.codeset.MatchingProcess1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the action to be performed on the matching process.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MatchingProcess1Code#Unmatch
 * MatchingProcess1Code.Unmatch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MatchingProcess1Code#ResumeMatching
 * MatchingProcess1Code.ResumeMatching}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.MatchingProcessCode
 * MatchingProcessCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"UNMT"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MatchingProcess1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the action to be performed on the matching process."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class MatchingProcess1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MatchingProcess1Code
	 * MatchingProcess1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unmatch"</li>
	 * </ul>
	 */
	public static final MatchingProcess1Code Unmatch = new MatchingProcess1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unmatch";
			owner_lazy = () -> com.tools20022.repository.codeset.MatchingProcess1Code.mmObject();
			codeName = MatchingProcessCode.Unmatch.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MatchingProcess1Code
	 * MatchingProcess1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResumeMatching"</li>
	 * </ul>
	 */
	public static final MatchingProcess1Code ResumeMatching = new MatchingProcess1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResumeMatching";
			owner_lazy = () -> com.tools20022.repository.codeset.MatchingProcess1Code.mmObject();
			codeName = MatchingProcessCode.ResumeMatching.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, MatchingProcess1Code> codesByName = new LinkedHashMap<>();

	protected MatchingProcess1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("UNMT");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MatchingProcess1Code";
				definition = "Specifies the action to be performed on the matching process.";
				trace_lazy = () -> MatchingProcessCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.MatchingProcess1Code.Unmatch, com.tools20022.repository.codeset.MatchingProcess1Code.ResumeMatching);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Unmatch.getCodeName().get(), Unmatch);
		codesByName.put(ResumeMatching.getCodeName().get(), ResumeMatching);
	}

	public static MatchingProcess1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static MatchingProcess1Code[] values() {
		MatchingProcess1Code[] values = new MatchingProcess1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, MatchingProcess1Code> {
		@Override
		public MatchingProcess1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(MatchingProcess1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}