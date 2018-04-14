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
import com.tools20022.repository.codeset.Algorithm16Code.InternalXmlAdapter;
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
 * <li>{@linkplain com.tools20022.repository.codeset.Algorithm16Code#SHA256
 * Algorithm16Code.SHA256}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Algorithm16Code#SHA384
 * Algorithm16Code.SHA384}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Algorithm16Code#SHA512
 * Algorithm16Code.SHA512}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Algorithm16Code#SHA1
 * Algorithm16Code.SHA1}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Algorithm16Code#SHA3224
 * Algorithm16Code.SHA3224}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Algorithm16Code#SHA3256
 * Algorithm16Code.SHA3256}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Algorithm16Code#SHA3384
 * Algorithm16Code.SHA3384}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Algorithm16Code#SHA3512
 * Algorithm16Code.SHA3512}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Algorithm16Code#SHAKE128
 * Algorithm16Code.SHAKE128}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Algorithm16Code#SHAKE256
 * Algorithm16Code.SHAKE256}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.AlgorithmCode AlgorithmCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Algorithm16Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Identification of a digest algorithm."</li>
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
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.codeset.Algorithm11Code
 * Algorithm11Code}</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class Algorithm16Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Algorithm16Code
	 * Algorithm16Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SHA256"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.Algorithm11Code#SHA256
	 * Algorithm11Code.SHA256}</li>
	 * </ul>
	 */
	public static final Algorithm16Code SHA256 = new Algorithm16Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SHA256";
			previousVersion_lazy = () -> Algorithm11Code.SHA256;
			owner_lazy = () -> com.tools20022.repository.codeset.Algorithm16Code.mmObject();
			codeName = AlgorithmCode.SHA256.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Algorithm16Code
	 * Algorithm16Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SHA384"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.Algorithm11Code#SHA384
	 * Algorithm11Code.SHA384}</li>
	 * </ul>
	 */
	public static final Algorithm16Code SHA384 = new Algorithm16Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SHA384";
			previousVersion_lazy = () -> Algorithm11Code.SHA384;
			owner_lazy = () -> com.tools20022.repository.codeset.Algorithm16Code.mmObject();
			codeName = AlgorithmCode.SHA384.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Algorithm16Code
	 * Algorithm16Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SHA512"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.Algorithm11Code#SHA512
	 * Algorithm11Code.SHA512}</li>
	 * </ul>
	 */
	public static final Algorithm16Code SHA512 = new Algorithm16Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SHA512";
			previousVersion_lazy = () -> Algorithm11Code.SHA512;
			owner_lazy = () -> com.tools20022.repository.codeset.Algorithm16Code.mmObject();
			codeName = AlgorithmCode.SHA512.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Algorithm16Code
	 * Algorithm16Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SHA1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.Algorithm11Code#SHA1
	 * Algorithm11Code.SHA1}</li>
	 * </ul>
	 */
	public static final Algorithm16Code SHA1 = new Algorithm16Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SHA1";
			previousVersion_lazy = () -> Algorithm11Code.SHA1;
			owner_lazy = () -> com.tools20022.repository.codeset.Algorithm16Code.mmObject();
			codeName = AlgorithmCode.SHA1.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Algorithm16Code
	 * Algorithm16Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SHA3-224"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final Algorithm16Code SHA3224 = new Algorithm16Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SHA3-224";
			owner_lazy = () -> com.tools20022.repository.codeset.Algorithm16Code.mmObject();
			codeName = AlgorithmCode.SHA3224.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Algorithm16Code
	 * Algorithm16Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SHA3-256"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final Algorithm16Code SHA3256 = new Algorithm16Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SHA3-256";
			owner_lazy = () -> com.tools20022.repository.codeset.Algorithm16Code.mmObject();
			codeName = AlgorithmCode.SHA3256.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Algorithm16Code
	 * Algorithm16Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SHA3-384"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final Algorithm16Code SHA3384 = new Algorithm16Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SHA3-384";
			owner_lazy = () -> com.tools20022.repository.codeset.Algorithm16Code.mmObject();
			codeName = AlgorithmCode.SHA3384.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Algorithm16Code
	 * Algorithm16Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SHA3-512"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final Algorithm16Code SHA3512 = new Algorithm16Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SHA3-512";
			owner_lazy = () -> com.tools20022.repository.codeset.Algorithm16Code.mmObject();
			codeName = AlgorithmCode.SHA3512.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Algorithm16Code
	 * Algorithm16Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SHAKE128"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final Algorithm16Code SHAKE128 = new Algorithm16Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SHAKE128";
			owner_lazy = () -> com.tools20022.repository.codeset.Algorithm16Code.mmObject();
			codeName = AlgorithmCode.SHAKE128.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Algorithm16Code
	 * Algorithm16Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SHAKE256"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final Algorithm16Code SHAKE256 = new Algorithm16Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SHAKE256";
			owner_lazy = () -> com.tools20022.repository.codeset.Algorithm16Code.mmObject();
			codeName = AlgorithmCode.SHAKE256.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, Algorithm16Code> codesByName = new LinkedHashMap<>();

	protected Algorithm16Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("HS25");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Algorithm16Code";
				definition = "Identification of a digest algorithm.";
				previousVersion_lazy = () -> Algorithm11Code.mmObject();
				trace_lazy = () -> AlgorithmCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.Algorithm16Code.SHA256, com.tools20022.repository.codeset.Algorithm16Code.SHA384, com.tools20022.repository.codeset.Algorithm16Code.SHA512,
						com.tools20022.repository.codeset.Algorithm16Code.SHA1, com.tools20022.repository.codeset.Algorithm16Code.SHA3224, com.tools20022.repository.codeset.Algorithm16Code.SHA3256,
						com.tools20022.repository.codeset.Algorithm16Code.SHA3384, com.tools20022.repository.codeset.Algorithm16Code.SHA3512, com.tools20022.repository.codeset.Algorithm16Code.SHAKE128,
						com.tools20022.repository.codeset.Algorithm16Code.SHAKE256);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(SHA256.getCodeName().get(), SHA256);
		codesByName.put(SHA384.getCodeName().get(), SHA384);
		codesByName.put(SHA512.getCodeName().get(), SHA512);
		codesByName.put(SHA1.getCodeName().get(), SHA1);
		codesByName.put(SHA3224.getCodeName().get(), SHA3224);
		codesByName.put(SHA3256.getCodeName().get(), SHA3256);
		codesByName.put(SHA3384.getCodeName().get(), SHA3384);
		codesByName.put(SHA3512.getCodeName().get(), SHA3512);
		codesByName.put(SHAKE128.getCodeName().get(), SHAKE128);
		codesByName.put(SHAKE256.getCodeName().get(), SHAKE256);
	}

	public static Algorithm16Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static Algorithm16Code[] values() {
		Algorithm16Code[] values = new Algorithm16Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, Algorithm16Code> {
		@Override
		public Algorithm16Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(Algorithm16Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}