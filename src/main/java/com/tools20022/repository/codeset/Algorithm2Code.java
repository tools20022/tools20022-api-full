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
import com.tools20022.repository.codeset.Algorithm2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Cryptographic algorithms for the protection of transported keys.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.Algorithm2Code#AES128CBC
 * Algorithm2Code.AES128CBC}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Algorithm2Code#DES112CBC
 * Algorithm2Code.DES112CBC}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Algorithm2Code#DUKPT
 * Algorithm2Code.DUKPT}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Algorithm2Code#DUKPT2009
 * Algorithm2Code.DUKPT2009}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Algorithm2Code#UKPT
 * Algorithm2Code.UKPT}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.Algorithm2Code#UKPTwithAES128
 * Algorithm2Code.UKPTwithAES128}</li>
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
 * "Algorithm2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Cryptographic algorithms for the protection of transported keys."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.Algorithm9Code
 * Algorithm9Code}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class Algorithm2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Algorithm2Code
	 * Algorithm2Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.Algorithm9Code#AES128CBC
	 * Algorithm9Code.AES128CBC}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final Algorithm2Code AES128CBC = new Algorithm2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AES128CBC";
			nextVersions_lazy = () -> Arrays.asList(Algorithm9Code.AES128CBC);
			owner_lazy = () -> com.tools20022.repository.codeset.Algorithm2Code.mmObject();
			codeName = AlgorithmCode.AES128CBC.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Algorithm2Code
	 * Algorithm2Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.Algorithm9Code#DES112CBC
	 * Algorithm9Code.DES112CBC}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final Algorithm2Code DES112CBC = new Algorithm2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DES112CBC";
			nextVersions_lazy = () -> Arrays.asList(Algorithm9Code.DES112CBC);
			owner_lazy = () -> com.tools20022.repository.codeset.Algorithm2Code.mmObject();
			codeName = AlgorithmCode.DES112CBC.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Algorithm2Code
	 * Algorithm2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DUKPT"</li>
	 * </ul>
	 */
	public static final Algorithm2Code DUKPT = new Algorithm2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DUKPT";
			owner_lazy = () -> com.tools20022.repository.codeset.Algorithm2Code.mmObject();
			codeName = AlgorithmCode.DUKPT.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Algorithm2Code
	 * Algorithm2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DUKPT2009"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.Algorithm9Code#DUKPT2009
	 * Algorithm9Code.DUKPT2009}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final Algorithm2Code DUKPT2009 = new Algorithm2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DUKPT2009";
			nextVersions_lazy = () -> Arrays.asList(Algorithm9Code.DUKPT2009);
			owner_lazy = () -> com.tools20022.repository.codeset.Algorithm2Code.mmObject();
			codeName = AlgorithmCode.DUKPT2009.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Algorithm2Code
	 * Algorithm2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UKPT"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.codeset.Algorithm9Code#UKPT
	 * Algorithm9Code.UKPT}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final Algorithm2Code UKPT = new Algorithm2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UKPT";
			nextVersions_lazy = () -> Arrays.asList(Algorithm9Code.UKPT);
			owner_lazy = () -> com.tools20022.repository.codeset.Algorithm2Code.mmObject();
			codeName = AlgorithmCode.UKPT.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Algorithm2Code
	 * Algorithm2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UKPTwithAES128"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.Algorithm9Code#UKPTwithAES128
	 * Algorithm9Code.UKPTwithAES128}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final Algorithm2Code UKPTwithAES128 = new Algorithm2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UKPTwithAES128";
			nextVersions_lazy = () -> Arrays.asList(Algorithm9Code.UKPTwithAES128);
			owner_lazy = () -> com.tools20022.repository.codeset.Algorithm2Code.mmObject();
			codeName = AlgorithmCode.UKPTwithAES128.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, Algorithm2Code> codesByName = new LinkedHashMap<>();

	protected Algorithm2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("EA2C");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Algorithm2Code";
				definition = "Cryptographic algorithms for the protection of transported keys.";
				nextVersions_lazy = () -> Arrays.asList(Algorithm9Code.mmObject());
				trace_lazy = () -> AlgorithmCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.Algorithm2Code.AES128CBC, com.tools20022.repository.codeset.Algorithm2Code.DES112CBC, com.tools20022.repository.codeset.Algorithm2Code.DUKPT,
						com.tools20022.repository.codeset.Algorithm2Code.DUKPT2009, com.tools20022.repository.codeset.Algorithm2Code.UKPT, com.tools20022.repository.codeset.Algorithm2Code.UKPTwithAES128);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AES128CBC.getCodeName().get(), AES128CBC);
		codesByName.put(DES112CBC.getCodeName().get(), DES112CBC);
		codesByName.put(DUKPT.getCodeName().get(), DUKPT);
		codesByName.put(DUKPT2009.getCodeName().get(), DUKPT2009);
		codesByName.put(UKPT.getCodeName().get(), UKPT);
		codesByName.put(UKPTwithAES128.getCodeName().get(), UKPTwithAES128);
	}

	public static Algorithm2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static Algorithm2Code[] values() {
		Algorithm2Code[] values = new Algorithm2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, Algorithm2Code> {
		@Override
		public Algorithm2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(Algorithm2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}