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
import com.tools20022.repository.codeset.Algorithm6Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Cryptographic algorithms for encryptions with a symmetric cryptographic key.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.Algorithm6Code#AES128CBC
 * Algorithm6Code.AES128CBC}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Algorithm6Code#DES112CBC
 * Algorithm6Code.DES112CBC}</li>
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
 * <li>"EA2C"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Algorithm6Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Cryptographic algorithms for encryptions with a symmetric cryptographic key."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.Algorithm15Code
 * Algorithm15Code}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class Algorithm6Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Algorithm6Code
	 * Algorithm6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AES128CBC"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.Algorithm15Code#AES128CBC
	 * Algorithm15Code.AES128CBC}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final Algorithm6Code AES128CBC = new Algorithm6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AES128CBC";
			nextVersions_lazy = () -> Arrays.asList(Algorithm15Code.AES128CBC);
			owner_lazy = () -> com.tools20022.repository.codeset.Algorithm6Code.mmObject();
			codeName = AlgorithmCode.AES128CBC.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Algorithm6Code
	 * Algorithm6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DES112CBC"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.Algorithm15Code#DES112CBC
	 * Algorithm15Code.DES112CBC}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final Algorithm6Code DES112CBC = new Algorithm6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DES112CBC";
			nextVersions_lazy = () -> Arrays.asList(Algorithm15Code.DES112CBC);
			owner_lazy = () -> com.tools20022.repository.codeset.Algorithm6Code.mmObject();
			codeName = AlgorithmCode.DES112CBC.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, Algorithm6Code> codesByName = new LinkedHashMap<>();

	protected Algorithm6Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("EA2C");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Algorithm6Code";
				definition = "Cryptographic algorithms for encryptions with a symmetric cryptographic key.";
				nextVersions_lazy = () -> Arrays.asList(Algorithm15Code.mmObject());
				trace_lazy = () -> AlgorithmCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.Algorithm6Code.AES128CBC, com.tools20022.repository.codeset.Algorithm6Code.DES112CBC);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AES128CBC.getCodeName().get(), AES128CBC);
		codesByName.put(DES112CBC.getCodeName().get(), DES112CBC);
	}

	public static Algorithm6Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static Algorithm6Code[] values() {
		Algorithm6Code[] values = new Algorithm6Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, Algorithm6Code> {
		@Override
		public Algorithm6Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(Algorithm6Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}