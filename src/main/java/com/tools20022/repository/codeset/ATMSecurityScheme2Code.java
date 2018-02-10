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
import com.tools20022.repository.codeset.ATMSecurityScheme2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Key exchange security schemes implemented in the hardware security module of
 * the ATM.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMSecurityScheme2Code#ApplicationRemoteKeyLoading
 * ATMSecurityScheme2Code.ApplicationRemoteKeyLoading}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMSecurityScheme2Code#CertificateRemoteKeyLoading
 * ATMSecurityScheme2Code.CertificateRemoteKeyLoading}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMSecurityScheme2Code#FrenchRemoteKeyLoading
 * ATMSecurityScheme2Code.FrenchRemoteKeyLoading}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMSecurityScheme2Code#GermanRemoteKeyLoading
 * ATMSecurityScheme2Code.GermanRemoteKeyLoading}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMSecurityScheme2Code#LuxemburgRemoteKeyLoading
 * ATMSecurityScheme2Code.LuxemburgRemoteKeyLoading}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMSecurityScheme2Code#ManualKeyEntry
 * ATMSecurityScheme2Code.ManualKeyEntry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMSecurityScheme2Code#PKIKeyDownload
 * ATMSecurityScheme2Code.PKIKeyDownload}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMSecurityScheme2Code#SignatureRemoteKeyLoading
 * ATMSecurityScheme2Code.SignatureRemoteKeyLoading}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.ATMSecuritySchemeCode
 * ATMSecuritySchemeCode}</li>
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
 * "ATMSecurityScheme2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Key exchange security schemes implemented in the hardware security module of the ATM."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ATMSecurityScheme2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMSecurityScheme2Code
	 * ATMSecurityScheme2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ApplicationRemoteKeyLoading"</li>
	 * </ul>
	 */
	public static final ATMSecurityScheme2Code ApplicationRemoteKeyLoading = new ATMSecurityScheme2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ApplicationRemoteKeyLoading";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMSecurityScheme2Code.mmObject();
			codeName = ATMSecuritySchemeCode.ApplicationRemoteKeyLoading.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMSecurityScheme2Code
	 * ATMSecurityScheme2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificateRemoteKeyLoading"</li>
	 * </ul>
	 */
	public static final ATMSecurityScheme2Code CertificateRemoteKeyLoading = new ATMSecurityScheme2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificateRemoteKeyLoading";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMSecurityScheme2Code.mmObject();
			codeName = ATMSecuritySchemeCode.CertificateRemoteKeyLoading.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMSecurityScheme2Code
	 * ATMSecurityScheme2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FrenchRemoteKeyLoading"</li>
	 * </ul>
	 */
	public static final ATMSecurityScheme2Code FrenchRemoteKeyLoading = new ATMSecurityScheme2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FrenchRemoteKeyLoading";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMSecurityScheme2Code.mmObject();
			codeName = ATMSecuritySchemeCode.FrenchRemoteKeyLoading.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMSecurityScheme2Code
	 * ATMSecurityScheme2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GermanRemoteKeyLoading"</li>
	 * </ul>
	 */
	public static final ATMSecurityScheme2Code GermanRemoteKeyLoading = new ATMSecurityScheme2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GermanRemoteKeyLoading";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMSecurityScheme2Code.mmObject();
			codeName = ATMSecuritySchemeCode.GermanRemoteKeyLoading.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMSecurityScheme2Code
	 * ATMSecurityScheme2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LuxemburgRemoteKeyLoading"</li>
	 * </ul>
	 */
	public static final ATMSecurityScheme2Code LuxemburgRemoteKeyLoading = new ATMSecurityScheme2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LuxemburgRemoteKeyLoading";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMSecurityScheme2Code.mmObject();
			codeName = ATMSecuritySchemeCode.LuxemburgRemoteKeyLoading.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMSecurityScheme2Code
	 * ATMSecurityScheme2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ManualKeyEntry"</li>
	 * </ul>
	 */
	public static final ATMSecurityScheme2Code ManualKeyEntry = new ATMSecurityScheme2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ManualKeyEntry";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMSecurityScheme2Code.mmObject();
			codeName = ATMSecuritySchemeCode.ManualKeyEntry.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMSecurityScheme2Code
	 * ATMSecurityScheme2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PKIKeyDownload"</li>
	 * </ul>
	 */
	public static final ATMSecurityScheme2Code PKIKeyDownload = new ATMSecurityScheme2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PKIKeyDownload";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMSecurityScheme2Code.mmObject();
			codeName = ATMSecuritySchemeCode.PKIKeyDownload.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMSecurityScheme2Code
	 * ATMSecurityScheme2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SignatureRemoteKeyLoading"</li>
	 * </ul>
	 */
	public static final ATMSecurityScheme2Code SignatureRemoteKeyLoading = new ATMSecurityScheme2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SignatureRemoteKeyLoading";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMSecurityScheme2Code.mmObject();
			codeName = ATMSecuritySchemeCode.SignatureRemoteKeyLoading.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, ATMSecurityScheme2Code> codesByName = new LinkedHashMap<>();

	protected ATMSecurityScheme2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMSecurityScheme2Code";
				definition = "Key exchange security schemes implemented in the hardware security module of the ATM.";
				trace_lazy = () -> ATMSecuritySchemeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ATMSecurityScheme2Code.ApplicationRemoteKeyLoading, com.tools20022.repository.codeset.ATMSecurityScheme2Code.CertificateRemoteKeyLoading,
						com.tools20022.repository.codeset.ATMSecurityScheme2Code.FrenchRemoteKeyLoading, com.tools20022.repository.codeset.ATMSecurityScheme2Code.GermanRemoteKeyLoading,
						com.tools20022.repository.codeset.ATMSecurityScheme2Code.LuxemburgRemoteKeyLoading, com.tools20022.repository.codeset.ATMSecurityScheme2Code.ManualKeyEntry,
						com.tools20022.repository.codeset.ATMSecurityScheme2Code.PKIKeyDownload, com.tools20022.repository.codeset.ATMSecurityScheme2Code.SignatureRemoteKeyLoading);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(ApplicationRemoteKeyLoading.getCodeName().get(), ApplicationRemoteKeyLoading);
		codesByName.put(CertificateRemoteKeyLoading.getCodeName().get(), CertificateRemoteKeyLoading);
		codesByName.put(FrenchRemoteKeyLoading.getCodeName().get(), FrenchRemoteKeyLoading);
		codesByName.put(GermanRemoteKeyLoading.getCodeName().get(), GermanRemoteKeyLoading);
		codesByName.put(LuxemburgRemoteKeyLoading.getCodeName().get(), LuxemburgRemoteKeyLoading);
		codesByName.put(ManualKeyEntry.getCodeName().get(), ManualKeyEntry);
		codesByName.put(PKIKeyDownload.getCodeName().get(), PKIKeyDownload);
		codesByName.put(SignatureRemoteKeyLoading.getCodeName().get(), SignatureRemoteKeyLoading);
	}

	public static ATMSecurityScheme2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ATMSecurityScheme2Code[] values() {
		ATMSecurityScheme2Code[] values = new ATMSecurityScheme2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ATMSecurityScheme2Code> {
		@Override
		public ATMSecurityScheme2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ATMSecurityScheme2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}