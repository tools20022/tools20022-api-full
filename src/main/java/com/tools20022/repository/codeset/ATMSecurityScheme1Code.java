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
import com.tools20022.repository.codeset.ATMSecuritySchemeCode;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Key exchange security scheme in activation on the ATM for the host manager.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.ATMSecuritySchemeCode
 * ATMSecuritySchemeCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMSecurityScheme1Code#mmApplicationRemoteKeyLoading
 * ATMSecurityScheme1Code.mmApplicationRemoteKeyLoading}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMSecurityScheme1Code#mmCertificateRemoteKeyLoading
 * ATMSecurityScheme1Code.mmCertificateRemoteKeyLoading}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMSecurityScheme1Code#mmFrenchRemoteKeyLoading
 * ATMSecurityScheme1Code.mmFrenchRemoteKeyLoading}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMSecurityScheme1Code#mmGermanRemoteKeyLoading
 * ATMSecurityScheme1Code.mmGermanRemoteKeyLoading}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMSecurityScheme1Code#mmLuxemburgRemoteKeyLoading
 * ATMSecurityScheme1Code.mmLuxemburgRemoteKeyLoading}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMSecurityScheme1Code#mmManualKeyEntry
 * ATMSecurityScheme1Code.mmManualKeyEntry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMSecurityScheme1Code#mmPKIKeyDownload
 * ATMSecurityScheme1Code.mmPKIKeyDownload}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMSecurityScheme1Code#mmSignatureRemoteKeyLoading
 * ATMSecurityScheme1Code.mmSignatureRemoteKeyLoading}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMSecurityScheme1Code#mmUnitialised
 * ATMSecurityScheme1Code.mmUnitialised}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
public class ATMSecurityScheme1Code extends ATMSecuritySchemeCode {

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
	public static final MMCode mmApplicationRemoteKeyLoading = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ApplicationRemoteKeyLoading";
			owner_lazy = () -> ATMSecurityScheme1Code.mmObject();
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
	public static final MMCode mmCertificateRemoteKeyLoading = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificateRemoteKeyLoading";
			owner_lazy = () -> ATMSecurityScheme1Code.mmObject();
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
	public static final MMCode mmFrenchRemoteKeyLoading = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FrenchRemoteKeyLoading";
			owner_lazy = () -> ATMSecurityScheme1Code.mmObject();
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
	public static final MMCode mmGermanRemoteKeyLoading = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GermanRemoteKeyLoading";
			owner_lazy = () -> ATMSecurityScheme1Code.mmObject();
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
	public static final MMCode mmLuxemburgRemoteKeyLoading = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LuxemburgRemoteKeyLoading";
			owner_lazy = () -> ATMSecurityScheme1Code.mmObject();
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
	public static final MMCode mmManualKeyEntry = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ManualKeyEntry";
			owner_lazy = () -> ATMSecurityScheme1Code.mmObject();
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
	public static final MMCode mmPKIKeyDownload = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PKIKeyDownload";
			owner_lazy = () -> ATMSecurityScheme1Code.mmObject();
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
	public static final MMCode mmSignatureRemoteKeyLoading = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SignatureRemoteKeyLoading";
			owner_lazy = () -> ATMSecurityScheme1Code.mmObject();
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
	public static final MMCode mmUnitialised = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unitialised";
			owner_lazy = () -> ATMSecurityScheme1Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMSecurityScheme1Code";
				definition = "Key exchange security scheme in activation on the ATM for the host manager.";
				code_lazy = () -> Arrays.asList(ATMSecurityScheme1Code.mmApplicationRemoteKeyLoading, ATMSecurityScheme1Code.mmCertificateRemoteKeyLoading, ATMSecurityScheme1Code.mmFrenchRemoteKeyLoading,
						ATMSecurityScheme1Code.mmGermanRemoteKeyLoading, ATMSecurityScheme1Code.mmLuxemburgRemoteKeyLoading, ATMSecurityScheme1Code.mmManualKeyEntry, ATMSecurityScheme1Code.mmPKIKeyDownload,
						ATMSecurityScheme1Code.mmSignatureRemoteKeyLoading, ATMSecurityScheme1Code.mmUnitialised);
				trace_lazy = () -> ATMSecuritySchemeCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}