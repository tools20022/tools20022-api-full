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
import com.tools20022.repository.codeset.Algorithm11Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Identification of a digest algorithm.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.Algorithm11Code#SHA256
 * Algorithm11Code.SHA256}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Algorithm11Code#SHA384
 * Algorithm11Code.SHA384}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Algorithm11Code#SHA512
 * Algorithm11Code.SHA512}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Algorithm11Code#SHA1
 * Algorithm11Code.SHA1}</li>
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
 * <li>"HS25"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Algorithm11Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Identification of a digest algorithm."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.codeset.Algorithm5Code Algorithm5Code}</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class Algorithm11Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Algorithm11Code
	 * Algorithm11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SHA256"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.Algorithm5Code#SHA256
	 * Algorithm5Code.SHA256}</li>
	 * </ul>
	 */
	public static final Algorithm11Code SHA256 = new Algorithm11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SHA256";
			previousVersion_lazy = () -> Algorithm5Code.SHA256;
			owner_lazy = () -> com.tools20022.repository.codeset.Algorithm11Code.mmObject();
			codeName = AlgorithmCode.SHA256.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Algorithm11Code
	 * Algorithm11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SHA384"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.Algorithm5Code#SHA384
	 * Algorithm5Code.SHA384}</li>
	 * </ul>
	 */
	public static final Algorithm11Code SHA384 = new Algorithm11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SHA384";
			previousVersion_lazy = () -> Algorithm5Code.SHA384;
			owner_lazy = () -> com.tools20022.repository.codeset.Algorithm11Code.mmObject();
			codeName = AlgorithmCode.SHA384.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Algorithm11Code
	 * Algorithm11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SHA512"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.Algorithm5Code#SHA512
	 * Algorithm5Code.SHA512}</li>
	 * </ul>
	 */
	public static final Algorithm11Code SHA512 = new Algorithm11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SHA512";
			previousVersion_lazy = () -> Algorithm5Code.SHA512;
			owner_lazy = () -> com.tools20022.repository.codeset.Algorithm11Code.mmObject();
			codeName = AlgorithmCode.SHA512.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Algorithm11Code
	 * Algorithm11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SHA1"</li>
	 * </ul>
	 */
	public static final Algorithm11Code SHA1 = new Algorithm11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SHA1";
			owner_lazy = () -> com.tools20022.repository.codeset.Algorithm11Code.mmObject();
			codeName = AlgorithmCode.SHA1.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, Algorithm11Code> codesByName = new LinkedHashMap<>();

	protected Algorithm11Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("HS25");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Algorithm11Code";
				definition = "Identification of a digest algorithm.";
				previousVersion_lazy = () -> Algorithm5Code.mmObject();
				trace_lazy = () -> AlgorithmCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.Algorithm11Code.SHA256, com.tools20022.repository.codeset.Algorithm11Code.SHA384, com.tools20022.repository.codeset.Algorithm11Code.SHA512,
						com.tools20022.repository.codeset.Algorithm11Code.SHA1);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(SHA256.getCodeName().get(), SHA256);
		codesByName.put(SHA384.getCodeName().get(), SHA384);
		codesByName.put(SHA512.getCodeName().get(), SHA512);
		codesByName.put(SHA1.getCodeName().get(), SHA1);
	}

	public static Algorithm11Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static Algorithm11Code[] values() {
		Algorithm11Code[] values = new Algorithm11Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, Algorithm11Code> {
		@Override
		public Algorithm11Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(Algorithm11Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}