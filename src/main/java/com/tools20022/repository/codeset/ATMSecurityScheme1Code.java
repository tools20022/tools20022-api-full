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
import com.tools20022.repository.codeset.ATMSecurityScheme1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Key exchange security scheme in activation on the ATM for the host manager.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMSecurityScheme1Code#ApplicationRemoteKeyLoading
 * ATMSecurityScheme1Code.ApplicationRemoteKeyLoading}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMSecurityScheme1Code#CertificateRemoteKeyLoading
 * ATMSecurityScheme1Code.CertificateRemoteKeyLoading}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMSecurityScheme1Code#FrenchRemoteKeyLoading
 * ATMSecurityScheme1Code.FrenchRemoteKeyLoading}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMSecurityScheme1Code#GermanRemoteKeyLoading
 * ATMSecurityScheme1Code.GermanRemoteKeyLoading}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMSecurityScheme1Code#LuxemburgRemoteKeyLoading
 * ATMSecurityScheme1Code.LuxemburgRemoteKeyLoading}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMSecurityScheme1Code#ManualKeyEntry
 * ATMSecurityScheme1Code.ManualKeyEntry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMSecurityScheme1Code#PKIKeyDownload
 * ATMSecurityScheme1Code.PKIKeyDownload}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMSecurityScheme1Code#SignatureRemoteKeyLoading
 * ATMSecurityScheme1Code.SignatureRemoteKeyLoading}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMSecurityScheme1Code#Unitialised
 * ATMSecurityScheme1Code.Unitialised}</li>
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
 * "ATMSecurityScheme1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Key exchange security scheme in activation on the ATM for the host manager."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ATMSecurityScheme1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMSecurityScheme1Code
	 * ATMSecurityScheme1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ApplicationRemoteKeyLoading"</li>
	 * </ul>
	 */
	public static final ATMSecurityScheme1Code ApplicationRemoteKeyLoading = new ATMSecurityScheme1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ApplicationRemoteKeyLoading";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMSecurityScheme1Code.mmObject();
			codeName = ATMSecuritySchemeCode.ApplicationRemoteKeyLoading.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMSecurityScheme1Code
	 * ATMSecurityScheme1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificateRemoteKeyLoading"</li>
	 * </ul>
	 */
	public static final ATMSecurityScheme1Code CertificateRemoteKeyLoading = new ATMSecurityScheme1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificateRemoteKeyLoading";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMSecurityScheme1Code.mmObject();
			codeName = ATMSecuritySchemeCode.CertificateRemoteKeyLoading.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMSecurityScheme1Code
	 * ATMSecurityScheme1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FrenchRemoteKeyLoading"</li>
	 * </ul>
	 */
	public static final ATMSecurityScheme1Code FrenchRemoteKeyLoading = new ATMSecurityScheme1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FrenchRemoteKeyLoading";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMSecurityScheme1Code.mmObject();
			codeName = ATMSecuritySchemeCode.FrenchRemoteKeyLoading.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMSecurityScheme1Code
	 * ATMSecurityScheme1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GermanRemoteKeyLoading"</li>
	 * </ul>
	 */
	public static final ATMSecurityScheme1Code GermanRemoteKeyLoading = new ATMSecurityScheme1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GermanRemoteKeyLoading";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMSecurityScheme1Code.mmObject();
			codeName = ATMSecuritySchemeCode.GermanRemoteKeyLoading.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMSecurityScheme1Code
	 * ATMSecurityScheme1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LuxemburgRemoteKeyLoading"</li>
	 * </ul>
	 */
	public static final ATMSecurityScheme1Code LuxemburgRemoteKeyLoading = new ATMSecurityScheme1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LuxemburgRemoteKeyLoading";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMSecurityScheme1Code.mmObject();
			codeName = ATMSecuritySchemeCode.LuxemburgRemoteKeyLoading.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMSecurityScheme1Code
	 * ATMSecurityScheme1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ManualKeyEntry"</li>
	 * </ul>
	 */
	public static final ATMSecurityScheme1Code ManualKeyEntry = new ATMSecurityScheme1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ManualKeyEntry";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMSecurityScheme1Code.mmObject();
			codeName = ATMSecuritySchemeCode.ManualKeyEntry.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMSecurityScheme1Code
	 * ATMSecurityScheme1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PKIKeyDownload"</li>
	 * </ul>
	 */
	public static final ATMSecurityScheme1Code PKIKeyDownload = new ATMSecurityScheme1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PKIKeyDownload";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMSecurityScheme1Code.mmObject();
			codeName = ATMSecuritySchemeCode.PKIKeyDownload.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMSecurityScheme1Code
	 * ATMSecurityScheme1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SignatureRemoteKeyLoading"</li>
	 * </ul>
	 */
	public static final ATMSecurityScheme1Code SignatureRemoteKeyLoading = new ATMSecurityScheme1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SignatureRemoteKeyLoading";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMSecurityScheme1Code.mmObject();
			codeName = ATMSecuritySchemeCode.SignatureRemoteKeyLoading.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMSecurityScheme1Code
	 * ATMSecurityScheme1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unitialised"</li>
	 * </ul>
	 */
	public static final ATMSecurityScheme1Code Unitialised = new ATMSecurityScheme1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unitialised";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMSecurityScheme1Code.mmObject();
			codeName = ATMSecuritySchemeCode.Unitialised.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, ATMSecurityScheme1Code> codesByName = new LinkedHashMap<>();

	protected ATMSecurityScheme1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMSecurityScheme1Code";
				definition = "Key exchange security scheme in activation on the ATM for the host manager.";
				trace_lazy = () -> ATMSecuritySchemeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ATMSecurityScheme1Code.ApplicationRemoteKeyLoading, com.tools20022.repository.codeset.ATMSecurityScheme1Code.CertificateRemoteKeyLoading,
						com.tools20022.repository.codeset.ATMSecurityScheme1Code.FrenchRemoteKeyLoading, com.tools20022.repository.codeset.ATMSecurityScheme1Code.GermanRemoteKeyLoading,
						com.tools20022.repository.codeset.ATMSecurityScheme1Code.LuxemburgRemoteKeyLoading, com.tools20022.repository.codeset.ATMSecurityScheme1Code.ManualKeyEntry,
						com.tools20022.repository.codeset.ATMSecurityScheme1Code.PKIKeyDownload, com.tools20022.repository.codeset.ATMSecurityScheme1Code.SignatureRemoteKeyLoading,
						com.tools20022.repository.codeset.ATMSecurityScheme1Code.Unitialised);
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
		codesByName.put(Unitialised.getCodeName().get(), Unitialised);
	}

	public static ATMSecurityScheme1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ATMSecurityScheme1Code[] values() {
		ATMSecurityScheme1Code[] values = new ATMSecurityScheme1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ATMSecurityScheme1Code> {
		@Override
		public ATMSecurityScheme1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ATMSecurityScheme1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}