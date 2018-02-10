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
import com.tools20022.repository.codeset.CryptographicKeyType4Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Category of the cryptographic key.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CryptographicKeyType4Code#Application
 * CryptographicKeyType4Code.Application}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CryptographicKeyType4Code#Data
 * CryptographicKeyType4Code.Data}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CryptographicKeyType4Code#Dynamic
 * CryptographicKeyType4Code.Dynamic}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CryptographicKeyType4Code#KeyEncryption
 * CryptographicKeyType4Code.KeyEncryption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CryptographicKeyType4Code#MAC
 * CryptographicKeyType4Code.MAC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CryptographicKeyType4Code#PIN
 * CryptographicKeyType4Code.PIN}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CryptographicKeyType4Code#Working
 * CryptographicKeyType4Code.Working}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.CryptographicKeyTypeCode
 * CryptographicKeyTypeCode}</li>
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
 * "CryptographicKeyType4Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Category of the cryptographic key."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CryptographicKeyType4Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CryptographicKeyType4Code
	 * CryptographicKeyType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Application"</li>
	 * </ul>
	 */
	public static final CryptographicKeyType4Code Application = new CryptographicKeyType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Application";
			owner_lazy = () -> com.tools20022.repository.codeset.CryptographicKeyType4Code.mmObject();
			codeName = CryptographicKeyTypeCode.Application.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CryptographicKeyType4Code
	 * CryptographicKeyType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Data"</li>
	 * </ul>
	 */
	public static final CryptographicKeyType4Code Data = new CryptographicKeyType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Data";
			owner_lazy = () -> com.tools20022.repository.codeset.CryptographicKeyType4Code.mmObject();
			codeName = CryptographicKeyTypeCode.Data.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CryptographicKeyType4Code
	 * CryptographicKeyType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Dynamic"</li>
	 * </ul>
	 */
	public static final CryptographicKeyType4Code Dynamic = new CryptographicKeyType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Dynamic";
			owner_lazy = () -> com.tools20022.repository.codeset.CryptographicKeyType4Code.mmObject();
			codeName = CryptographicKeyTypeCode.Dynamic.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CryptographicKeyType4Code
	 * CryptographicKeyType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KeyEncryption"</li>
	 * </ul>
	 */
	public static final CryptographicKeyType4Code KeyEncryption = new CryptographicKeyType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KeyEncryption";
			owner_lazy = () -> com.tools20022.repository.codeset.CryptographicKeyType4Code.mmObject();
			codeName = CryptographicKeyTypeCode.KeyEncryption.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CryptographicKeyType4Code
	 * CryptographicKeyType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MAC"</li>
	 * </ul>
	 */
	public static final CryptographicKeyType4Code MAC = new CryptographicKeyType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MAC";
			owner_lazy = () -> com.tools20022.repository.codeset.CryptographicKeyType4Code.mmObject();
			codeName = CryptographicKeyTypeCode.MAC.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CryptographicKeyType4Code
	 * CryptographicKeyType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PIN"</li>
	 * </ul>
	 */
	public static final CryptographicKeyType4Code PIN = new CryptographicKeyType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PIN";
			owner_lazy = () -> com.tools20022.repository.codeset.CryptographicKeyType4Code.mmObject();
			codeName = CryptographicKeyTypeCode.PIN.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CryptographicKeyType4Code
	 * CryptographicKeyType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Working"</li>
	 * </ul>
	 */
	public static final CryptographicKeyType4Code Working = new CryptographicKeyType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Working";
			owner_lazy = () -> com.tools20022.repository.codeset.CryptographicKeyType4Code.mmObject();
			codeName = CryptographicKeyTypeCode.Working.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, CryptographicKeyType4Code> codesByName = new LinkedHashMap<>();

	protected CryptographicKeyType4Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CryptographicKeyType4Code";
				definition = "Category of the cryptographic key.";
				trace_lazy = () -> CryptographicKeyTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CryptographicKeyType4Code.Application, com.tools20022.repository.codeset.CryptographicKeyType4Code.Data,
						com.tools20022.repository.codeset.CryptographicKeyType4Code.Dynamic, com.tools20022.repository.codeset.CryptographicKeyType4Code.KeyEncryption, com.tools20022.repository.codeset.CryptographicKeyType4Code.MAC,
						com.tools20022.repository.codeset.CryptographicKeyType4Code.PIN, com.tools20022.repository.codeset.CryptographicKeyType4Code.Working);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Application.getCodeName().get(), Application);
		codesByName.put(Data.getCodeName().get(), Data);
		codesByName.put(Dynamic.getCodeName().get(), Dynamic);
		codesByName.put(KeyEncryption.getCodeName().get(), KeyEncryption);
		codesByName.put(MAC.getCodeName().get(), MAC);
		codesByName.put(PIN.getCodeName().get(), PIN);
		codesByName.put(Working.getCodeName().get(), Working);
	}

	public static CryptographicKeyType4Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CryptographicKeyType4Code[] values() {
		CryptographicKeyType4Code[] values = new CryptographicKeyType4Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CryptographicKeyType4Code> {
		@Override
		public CryptographicKeyType4Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CryptographicKeyType4Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}