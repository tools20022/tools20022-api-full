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
import com.tools20022.repository.codeset.Algorithm12Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Cryptographic algorithms for the MAC (Message Authentication Code).
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.Algorithm12Code#RetailCBCMAC
 * Algorithm12Code.RetailCBCMAC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.Algorithm12Code#RetailSHA256MAC
 * Algorithm12Code.RetailSHA256MAC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.Algorithm12Code#SHA256CMACwithAES128
 * Algorithm12Code.SHA256CMACwithAES128}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.Algorithm12Code#RetailSHA1MAC
 * Algorithm12Code.RetailSHA1MAC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.Algorithm12Code#SHA384CMACwithAES192
 * Algorithm12Code.SHA384CMACwithAES192}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.Algorithm12Code#SHA512CMACwithAES256
 * Algorithm12Code.SHA512CMACwithAES256}</li>
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
 * <li>"MACC"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Algorithm12Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Cryptographic algorithms for the MAC (Message Authentication Code)."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.codeset.Algorithm10Code
 * Algorithm10Code}</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class Algorithm12Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Algorithm12Code
	 * Algorithm12Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RetailCBCMAC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.Algorithm10Code#RetailCBCMAC
	 * Algorithm10Code.RetailCBCMAC}</li>
	 * </ul>
	 */
	public static final Algorithm12Code RetailCBCMAC = new Algorithm12Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RetailCBCMAC";
			previousVersion_lazy = () -> Algorithm10Code.RetailCBCMAC;
			owner_lazy = () -> com.tools20022.repository.codeset.Algorithm12Code.mmObject();
			codeName = AlgorithmCode.RetailCBCMAC.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Algorithm12Code
	 * Algorithm12Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RetailSHA256MAC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.Algorithm10Code#RetailSHA256MAC
	 * Algorithm10Code.RetailSHA256MAC}</li>
	 * </ul>
	 */
	public static final Algorithm12Code RetailSHA256MAC = new Algorithm12Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RetailSHA256MAC";
			previousVersion_lazy = () -> Algorithm10Code.RetailSHA256MAC;
			owner_lazy = () -> com.tools20022.repository.codeset.Algorithm12Code.mmObject();
			codeName = AlgorithmCode.RetailSHA256MAC.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Algorithm12Code
	 * Algorithm12Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SHA256CMACwithAES128"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.Algorithm10Code#SHA256CMACwithAES128
	 * Algorithm10Code.SHA256CMACwithAES128}</li>
	 * </ul>
	 */
	public static final Algorithm12Code SHA256CMACwithAES128 = new Algorithm12Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SHA256CMACwithAES128";
			previousVersion_lazy = () -> Algorithm10Code.SHA256CMACwithAES128;
			owner_lazy = () -> com.tools20022.repository.codeset.Algorithm12Code.mmObject();
			codeName = AlgorithmCode.SHA256CMACwithAES128.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Algorithm12Code
	 * Algorithm12Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RetailSHA1MAC"</li>
	 * </ul>
	 */
	public static final Algorithm12Code RetailSHA1MAC = new Algorithm12Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RetailSHA1MAC";
			owner_lazy = () -> com.tools20022.repository.codeset.Algorithm12Code.mmObject();
			codeName = AlgorithmCode.RetailSHA1MAC.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Algorithm12Code
	 * Algorithm12Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SHA384CMACwithAES192"</li>
	 * </ul>
	 */
	public static final Algorithm12Code SHA384CMACwithAES192 = new Algorithm12Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SHA384CMACwithAES192";
			owner_lazy = () -> com.tools20022.repository.codeset.Algorithm12Code.mmObject();
			codeName = AlgorithmCode.SHA384CMACwithAES192.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Algorithm12Code
	 * Algorithm12Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SHA512CMACwithAES256"</li>
	 * </ul>
	 */
	public static final Algorithm12Code SHA512CMACwithAES256 = new Algorithm12Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SHA512CMACwithAES256";
			owner_lazy = () -> com.tools20022.repository.codeset.Algorithm12Code.mmObject();
			codeName = AlgorithmCode.SHA512CMACwithAES256.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, Algorithm12Code> codesByName = new LinkedHashMap<>();

	protected Algorithm12Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("MACC");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Algorithm12Code";
				definition = "Cryptographic algorithms for the MAC (Message Authentication Code).";
				previousVersion_lazy = () -> Algorithm10Code.mmObject();
				trace_lazy = () -> AlgorithmCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.Algorithm12Code.RetailCBCMAC, com.tools20022.repository.codeset.Algorithm12Code.RetailSHA256MAC,
						com.tools20022.repository.codeset.Algorithm12Code.SHA256CMACwithAES128, com.tools20022.repository.codeset.Algorithm12Code.RetailSHA1MAC, com.tools20022.repository.codeset.Algorithm12Code.SHA384CMACwithAES192,
						com.tools20022.repository.codeset.Algorithm12Code.SHA512CMACwithAES256);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(RetailCBCMAC.getCodeName().get(), RetailCBCMAC);
		codesByName.put(RetailSHA256MAC.getCodeName().get(), RetailSHA256MAC);
		codesByName.put(SHA256CMACwithAES128.getCodeName().get(), SHA256CMACwithAES128);
		codesByName.put(RetailSHA1MAC.getCodeName().get(), RetailSHA1MAC);
		codesByName.put(SHA384CMACwithAES192.getCodeName().get(), SHA384CMACwithAES192);
		codesByName.put(SHA512CMACwithAES256.getCodeName().get(), SHA512CMACwithAES256);
	}

	public static Algorithm12Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static Algorithm12Code[] values() {
		Algorithm12Code[] values = new Algorithm12Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, Algorithm12Code> {
		@Override
		public Algorithm12Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(Algorithm12Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}