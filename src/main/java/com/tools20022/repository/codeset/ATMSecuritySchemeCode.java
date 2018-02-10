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
import com.tools20022.repository.codeset.ATMSecuritySchemeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Key exchange security scheme on an ATM for the host manager.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMSecuritySchemeCode#ApplicationRemoteKeyLoading
 * ATMSecuritySchemeCode.ApplicationRemoteKeyLoading}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMSecuritySchemeCode#CertificateRemoteKeyLoading
 * ATMSecuritySchemeCode.CertificateRemoteKeyLoading}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMSecuritySchemeCode#GermanRemoteKeyLoading
 * ATMSecuritySchemeCode.GermanRemoteKeyLoading}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMSecuritySchemeCode#FrenchRemoteKeyLoading
 * ATMSecuritySchemeCode.FrenchRemoteKeyLoading}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMSecuritySchemeCode#LuxemburgRemoteKeyLoading
 * ATMSecuritySchemeCode.LuxemburgRemoteKeyLoading}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMSecuritySchemeCode#ManualKeyEntry
 * ATMSecuritySchemeCode.ManualKeyEntry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMSecuritySchemeCode#PKIKeyDownload
 * ATMSecuritySchemeCode.PKIKeyDownload}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMSecuritySchemeCode#SignatureRemoteKeyLoading
 * ATMSecuritySchemeCode.SignatureRemoteKeyLoading}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMSecuritySchemeCode#Unitialised
 * ATMSecuritySchemeCode.Unitialised}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMSecuritySchemeCode#TR34
 * ATMSecuritySchemeCode.TR34}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMSecurityScheme2Code
 * ATMSecurityScheme2Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMSecurityScheme1Code
 * ATMSecurityScheme1Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMSecurityScheme3Code
 * ATMSecurityScheme3Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMSecurityScheme4Code
 * ATMSecurityScheme4Code}</li>
 * </ul>
 * </li>
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
 * "ATMSecuritySchemeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Key exchange security scheme on an ATM for the host manager."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ATMSecuritySchemeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Application key download protected by a share symmetric key.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMSecuritySchemeCode
	 * ATMSecuritySchemeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "APPK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ApplicationRemoteKeyLoading"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Application key download protected by a share symmetric key."</li>
	 * </ul>
	 */
	public static final ATMSecuritySchemeCode ApplicationRemoteKeyLoading = new ATMSecuritySchemeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ApplicationRemoteKeyLoading";
			definition = "Application key download protected by a share symmetric key.";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMSecuritySchemeCode.mmObject();
			codeName = "APPK";
		}
	};
	/**
	 * Key download protected by asymmetric keys authenticated by a certificate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMSecuritySchemeCode
	 * ATMSecuritySchemeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CERT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificateRemoteKeyLoading"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Key download protected by asymmetric keys authenticated by a certificate."
	 * </li>
	 * </ul>
	 */
	public static final ATMSecuritySchemeCode CertificateRemoteKeyLoading = new ATMSecuritySchemeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificateRemoteKeyLoading";
			definition = "Key download protected by asymmetric keys authenticated by a certificate.";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMSecuritySchemeCode.mmObject();
			codeName = "CERT";
		}
	};
	/**
	 * Key download conform to the German ATM key download security scheme.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMSecuritySchemeCode
	 * ATMSecuritySchemeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DTCH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GermanRemoteKeyLoading"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Key download conform to the German ATM key download security scheme."</li>
	 * </ul>
	 */
	public static final ATMSecuritySchemeCode GermanRemoteKeyLoading = new ATMSecuritySchemeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GermanRemoteKeyLoading";
			definition = "Key download conform to the German ATM key download security scheme.";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMSecuritySchemeCode.mmObject();
			codeName = "DTCH";
		}
	};
	/**
	 * Key download conform to the French ATM key download security scheme.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMSecuritySchemeCode
	 * ATMSecuritySchemeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FRAN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FrenchRemoteKeyLoading"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Key download conform to the French ATM key download security scheme."</li>
	 * </ul>
	 */
	public static final ATMSecuritySchemeCode FrenchRemoteKeyLoading = new ATMSecuritySchemeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FrenchRemoteKeyLoading";
			definition = "Key download conform to the French ATM key download security scheme.";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMSecuritySchemeCode.mmObject();
			codeName = "FRAN";
		}
	};
	/**
	 * Key download conform to the Luxemburg ATM key download security scheme.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMSecuritySchemeCode
	 * ATMSecuritySchemeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LUXG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LuxemburgRemoteKeyLoading"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Key download conform to the Luxemburg ATM key download security scheme."
	 * </li>
	 * </ul>
	 */
	public static final ATMSecuritySchemeCode LuxemburgRemoteKeyLoading = new ATMSecuritySchemeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LuxemburgRemoteKeyLoading";
			definition = "Key download conform to the Luxemburg ATM key download security scheme.";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMSecuritySchemeCode.mmObject();
			codeName = "LUXG";
		}
	};
	/**
	 * Manual key entry on the ATM.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMSecuritySchemeCode
	 * ATMSecuritySchemeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MANU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ManualKeyEntry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Manual key entry on the ATM."</li>
	 * </ul>
	 */
	public static final ATMSecuritySchemeCode ManualKeyEntry = new ATMSecuritySchemeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ManualKeyEntry";
			definition = "Manual key entry on the ATM.";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMSecuritySchemeCode.mmObject();
			codeName = "MANU";
		}
	};
	/**
	 * Key download protected by asymmetric keys authenticated by a PKI (Public
	 * Key Infrastructure).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMSecuritySchemeCode
	 * ATMSecuritySchemeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PKIP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PKIKeyDownload"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Key download protected by asymmetric keys authenticated by a PKI (Public Key Infrastructure)."
	 * </li>
	 * </ul>
	 */
	public static final ATMSecuritySchemeCode PKIKeyDownload = new ATMSecuritySchemeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PKIKeyDownload";
			definition = "Key download protected by asymmetric keys authenticated by a PKI (Public Key Infrastructure).";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMSecuritySchemeCode.mmObject();
			codeName = "PKIP";
		}
	};
	/**
	 * Key download protected by asymmetric keys authenticated by a digital
	 * signature.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMSecuritySchemeCode
	 * ATMSecuritySchemeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SIGN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SignatureRemoteKeyLoading"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Key download protected by asymmetric keys authenticated by a digital signature."
	 * </li>
	 * </ul>
	 */
	public static final ATMSecuritySchemeCode SignatureRemoteKeyLoading = new ATMSecuritySchemeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SignatureRemoteKeyLoading";
			definition = "Key download protected by asymmetric keys authenticated by a digital signature.";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMSecuritySchemeCode.mmObject();
			codeName = "SIGN";
		}
	};
	/**
	 * No key exchange performed, no security scheme defined.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMSecuritySchemeCode
	 * ATMSecuritySchemeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NONE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unitialised"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "No key exchange performed, no security scheme defined."</li>
	 * </ul>
	 */
	public static final ATMSecuritySchemeCode Unitialised = new ATMSecuritySchemeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unitialised";
			definition = "No key exchange performed, no security scheme defined.";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMSecuritySchemeCode.mmObject();
			codeName = "NONE";
		}
	};
	/**
	 * ANSI X9 TR34 2012 scheme for the distribution of the symmetric public
	 * keys and the initial master key.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMSecuritySchemeCode
	 * ATMSecuritySchemeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TR34"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TR34"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "ANSI X9 TR34 2012 scheme for the distribution of the symmetric public keys and the initial master key."
	 * </li>
	 * </ul>
	 */
	public static final ATMSecuritySchemeCode TR34 = new ATMSecuritySchemeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TR34";
			definition = "ANSI X9 TR34 2012 scheme for the distribution of the symmetric public keys and the initial master key.";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMSecuritySchemeCode.mmObject();
			codeName = "TR34";
		}
	};
	final static private LinkedHashMap<String, ATMSecuritySchemeCode> codesByName = new LinkedHashMap<>();

	protected ATMSecuritySchemeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMSecuritySchemeCode";
				definition = "Key exchange security scheme on an ATM for the host manager.";
				derivation_lazy = () -> Arrays.asList(ATMSecurityScheme2Code.mmObject(), ATMSecurityScheme1Code.mmObject(), ATMSecurityScheme3Code.mmObject(), ATMSecurityScheme4Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ATMSecuritySchemeCode.ApplicationRemoteKeyLoading, com.tools20022.repository.codeset.ATMSecuritySchemeCode.CertificateRemoteKeyLoading,
						com.tools20022.repository.codeset.ATMSecuritySchemeCode.GermanRemoteKeyLoading, com.tools20022.repository.codeset.ATMSecuritySchemeCode.FrenchRemoteKeyLoading,
						com.tools20022.repository.codeset.ATMSecuritySchemeCode.LuxemburgRemoteKeyLoading, com.tools20022.repository.codeset.ATMSecuritySchemeCode.ManualKeyEntry,
						com.tools20022.repository.codeset.ATMSecuritySchemeCode.PKIKeyDownload, com.tools20022.repository.codeset.ATMSecuritySchemeCode.SignatureRemoteKeyLoading,
						com.tools20022.repository.codeset.ATMSecuritySchemeCode.Unitialised, com.tools20022.repository.codeset.ATMSecuritySchemeCode.TR34);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(ApplicationRemoteKeyLoading.getCodeName().get(), ApplicationRemoteKeyLoading);
		codesByName.put(CertificateRemoteKeyLoading.getCodeName().get(), CertificateRemoteKeyLoading);
		codesByName.put(GermanRemoteKeyLoading.getCodeName().get(), GermanRemoteKeyLoading);
		codesByName.put(FrenchRemoteKeyLoading.getCodeName().get(), FrenchRemoteKeyLoading);
		codesByName.put(LuxemburgRemoteKeyLoading.getCodeName().get(), LuxemburgRemoteKeyLoading);
		codesByName.put(ManualKeyEntry.getCodeName().get(), ManualKeyEntry);
		codesByName.put(PKIKeyDownload.getCodeName().get(), PKIKeyDownload);
		codesByName.put(SignatureRemoteKeyLoading.getCodeName().get(), SignatureRemoteKeyLoading);
		codesByName.put(Unitialised.getCodeName().get(), Unitialised);
		codesByName.put(TR34.getCodeName().get(), TR34);
	}

	public static ATMSecuritySchemeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ATMSecuritySchemeCode[] values() {
		ATMSecuritySchemeCode[] values = new ATMSecuritySchemeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ATMSecuritySchemeCode> {
		@Override
		public ATMSecuritySchemeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ATMSecuritySchemeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}