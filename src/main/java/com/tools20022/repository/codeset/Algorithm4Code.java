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
import com.tools20022.repository.codeset.Algorithm4Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Cryptographic algorithms for digital signatures.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.Algorithm4Code#SHA256WithRSA
 * Algorithm4Code.SHA256WithRSA}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.AlgorithmCode AlgorithmCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"ERS2"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Algorithm4Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Cryptographic algorithms for digital signatures."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.Algorithm14Code
 * Algorithm14Code}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class Algorithm4Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Algorithm4Code
	 * Algorithm4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SHA256WithRSA"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.Algorithm14Code#SHA256WithRSA
	 * Algorithm14Code.SHA256WithRSA}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final Algorithm4Code SHA256WithRSA = new Algorithm4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SHA256WithRSA";
			nextVersions_lazy = () -> Arrays.asList(Algorithm14Code.SHA256WithRSA);
			owner_lazy = () -> com.tools20022.repository.codeset.Algorithm4Code.mmObject();
			codeName = AlgorithmCode.SHA256WithRSA.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, Algorithm4Code> codesByName = new LinkedHashMap<>();

	protected Algorithm4Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("ERS2");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Algorithm4Code";
				definition = "Cryptographic algorithms for digital signatures.";
				nextVersions_lazy = () -> Arrays.asList(Algorithm14Code.mmObject());
				trace_lazy = () -> AlgorithmCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.Algorithm4Code.SHA256WithRSA);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(SHA256WithRSA.getCodeName().get(), SHA256WithRSA);
	}

	public static Algorithm4Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static Algorithm4Code[] values() {
		Algorithm4Code[] values = new Algorithm4Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, Algorithm4Code> {
		@Override
		public Algorithm4Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(Algorithm4Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}