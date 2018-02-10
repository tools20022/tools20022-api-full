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
import com.tools20022.repository.codeset.AuthenticationMethod2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Methods used to authenticate a person.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod2Code#Bypass
 * AuthenticationMethod2Code.Bypass}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod2Code#ManualVerification
 * AuthenticationMethod2Code.ManualVerification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod2Code#MerchantAuthentication
 * AuthenticationMethod2Code.MerchantAuthentication}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod2Code#OfflinePIN
 * AuthenticationMethod2Code.OfflinePIN}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod2Code#OnLinePIN
 * AuthenticationMethod2Code.OnLinePIN}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod2Code#PaperSignature
 * AuthenticationMethod2Code.PaperSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod2Code#Password
 * AuthenticationMethod2Code.Password}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod2Code#SecureCertificate
 * AuthenticationMethod2Code.SecureCertificate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod2Code#SecuredChannel
 * AuthenticationMethod2Code.SecuredChannel}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod2Code#SecureNoCertificate
 * AuthenticationMethod2Code.SecureNoCertificate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod2Code#SignatureCapture
 * AuthenticationMethod2Code.SignatureCapture}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod2Code#UnknownMethod
 * AuthenticationMethod2Code.UnknownMethod}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethodCode
 * AuthenticationMethodCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"BYPS"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AuthenticationMethod2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Methods used to authenticate a person."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.AuthenticationMethod3Code
 * AuthenticationMethod3Code}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class AuthenticationMethod2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod2Code
	 * AuthenticationMethod2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Bypass"</li>
	 * </ul>
	 */
	public static final AuthenticationMethod2Code Bypass = new AuthenticationMethod2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Bypass";
			owner_lazy = () -> com.tools20022.repository.codeset.AuthenticationMethod2Code.mmObject();
			codeName = AuthenticationMethodCode.Bypass.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod2Code
	 * AuthenticationMethod2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ManualVerification"</li>
	 * </ul>
	 */
	public static final AuthenticationMethod2Code ManualVerification = new AuthenticationMethod2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ManualVerification";
			owner_lazy = () -> com.tools20022.repository.codeset.AuthenticationMethod2Code.mmObject();
			codeName = AuthenticationMethodCode.ManualVerification.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod2Code
	 * AuthenticationMethod2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MerchantAuthentication"</li>
	 * </ul>
	 */
	public static final AuthenticationMethod2Code MerchantAuthentication = new AuthenticationMethod2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MerchantAuthentication";
			owner_lazy = () -> com.tools20022.repository.codeset.AuthenticationMethod2Code.mmObject();
			codeName = AuthenticationMethodCode.MerchantAuthentication.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod2Code
	 * AuthenticationMethod2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfflinePIN"</li>
	 * </ul>
	 */
	public static final AuthenticationMethod2Code OfflinePIN = new AuthenticationMethod2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfflinePIN";
			owner_lazy = () -> com.tools20022.repository.codeset.AuthenticationMethod2Code.mmObject();
			codeName = AuthenticationMethodCode.OfflinePIN.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod2Code
	 * AuthenticationMethod2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OnLinePIN"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod3Code#OnLinePIN
	 * AuthenticationMethod3Code.OnLinePIN}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final AuthenticationMethod2Code OnLinePIN = new AuthenticationMethod2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OnLinePIN";
			nextVersions_lazy = () -> Arrays.asList(AuthenticationMethod3Code.OnLinePIN);
			owner_lazy = () -> com.tools20022.repository.codeset.AuthenticationMethod2Code.mmObject();
			codeName = AuthenticationMethodCode.OnLinePIN.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod2Code
	 * AuthenticationMethod2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaperSignature"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod3Code#PaperSignature
	 * AuthenticationMethod3Code.PaperSignature}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final AuthenticationMethod2Code PaperSignature = new AuthenticationMethod2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaperSignature";
			nextVersions_lazy = () -> Arrays.asList(AuthenticationMethod3Code.PaperSignature);
			owner_lazy = () -> com.tools20022.repository.codeset.AuthenticationMethod2Code.mmObject();
			codeName = AuthenticationMethodCode.PaperSignature.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod2Code
	 * AuthenticationMethod2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Password"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod3Code#Password
	 * AuthenticationMethod3Code.Password}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final AuthenticationMethod2Code Password = new AuthenticationMethod2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Password";
			nextVersions_lazy = () -> Arrays.asList(AuthenticationMethod3Code.Password);
			owner_lazy = () -> com.tools20022.repository.codeset.AuthenticationMethod2Code.mmObject();
			codeName = AuthenticationMethodCode.Password.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod2Code
	 * AuthenticationMethod2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecureCertificate"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod3Code#SecureCertificate
	 * AuthenticationMethod3Code.SecureCertificate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final AuthenticationMethod2Code SecureCertificate = new AuthenticationMethod2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecureCertificate";
			nextVersions_lazy = () -> Arrays.asList(AuthenticationMethod3Code.SecureCertificate);
			owner_lazy = () -> com.tools20022.repository.codeset.AuthenticationMethod2Code.mmObject();
			codeName = AuthenticationMethodCode.SecureCertificate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod2Code
	 * AuthenticationMethod2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuredChannel"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod3Code#SecuredChannel
	 * AuthenticationMethod3Code.SecuredChannel}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final AuthenticationMethod2Code SecuredChannel = new AuthenticationMethod2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuredChannel";
			nextVersions_lazy = () -> Arrays.asList(AuthenticationMethod3Code.SecuredChannel);
			owner_lazy = () -> com.tools20022.repository.codeset.AuthenticationMethod2Code.mmObject();
			codeName = AuthenticationMethodCode.SecuredChannel.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod2Code
	 * AuthenticationMethod2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecureNoCertificate"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod3Code#SecureNoCertificate
	 * AuthenticationMethod3Code.SecureNoCertificate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final AuthenticationMethod2Code SecureNoCertificate = new AuthenticationMethod2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecureNoCertificate";
			nextVersions_lazy = () -> Arrays.asList(AuthenticationMethod3Code.SecureNoCertificate);
			owner_lazy = () -> com.tools20022.repository.codeset.AuthenticationMethod2Code.mmObject();
			codeName = AuthenticationMethodCode.SecureNoCertificate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod2Code
	 * AuthenticationMethod2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SignatureCapture"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod3Code#SignatureCapture
	 * AuthenticationMethod3Code.SignatureCapture}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final AuthenticationMethod2Code SignatureCapture = new AuthenticationMethod2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SignatureCapture";
			nextVersions_lazy = () -> Arrays.asList(AuthenticationMethod3Code.SignatureCapture);
			owner_lazy = () -> com.tools20022.repository.codeset.AuthenticationMethod2Code.mmObject();
			codeName = AuthenticationMethodCode.SignatureCapture.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod2Code
	 * AuthenticationMethod2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnknownMethod"</li>
	 * </ul>
	 */
	public static final AuthenticationMethod2Code UnknownMethod = new AuthenticationMethod2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnknownMethod";
			owner_lazy = () -> com.tools20022.repository.codeset.AuthenticationMethod2Code.mmObject();
			codeName = AuthenticationMethodCode.UnknownMethod.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, AuthenticationMethod2Code> codesByName = new LinkedHashMap<>();

	protected AuthenticationMethod2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("BYPS");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AuthenticationMethod2Code";
				definition = "Methods used to authenticate a person.";
				nextVersions_lazy = () -> Arrays.asList(AuthenticationMethod3Code.mmObject());
				trace_lazy = () -> AuthenticationMethodCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AuthenticationMethod2Code.Bypass, com.tools20022.repository.codeset.AuthenticationMethod2Code.ManualVerification,
						com.tools20022.repository.codeset.AuthenticationMethod2Code.MerchantAuthentication, com.tools20022.repository.codeset.AuthenticationMethod2Code.OfflinePIN,
						com.tools20022.repository.codeset.AuthenticationMethod2Code.OnLinePIN, com.tools20022.repository.codeset.AuthenticationMethod2Code.PaperSignature,
						com.tools20022.repository.codeset.AuthenticationMethod2Code.Password, com.tools20022.repository.codeset.AuthenticationMethod2Code.SecureCertificate,
						com.tools20022.repository.codeset.AuthenticationMethod2Code.SecuredChannel, com.tools20022.repository.codeset.AuthenticationMethod2Code.SecureNoCertificate,
						com.tools20022.repository.codeset.AuthenticationMethod2Code.SignatureCapture, com.tools20022.repository.codeset.AuthenticationMethod2Code.UnknownMethod);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Bypass.getCodeName().get(), Bypass);
		codesByName.put(ManualVerification.getCodeName().get(), ManualVerification);
		codesByName.put(MerchantAuthentication.getCodeName().get(), MerchantAuthentication);
		codesByName.put(OfflinePIN.getCodeName().get(), OfflinePIN);
		codesByName.put(OnLinePIN.getCodeName().get(), OnLinePIN);
		codesByName.put(PaperSignature.getCodeName().get(), PaperSignature);
		codesByName.put(Password.getCodeName().get(), Password);
		codesByName.put(SecureCertificate.getCodeName().get(), SecureCertificate);
		codesByName.put(SecuredChannel.getCodeName().get(), SecuredChannel);
		codesByName.put(SecureNoCertificate.getCodeName().get(), SecureNoCertificate);
		codesByName.put(SignatureCapture.getCodeName().get(), SignatureCapture);
		codesByName.put(UnknownMethod.getCodeName().get(), UnknownMethod);
	}

	public static AuthenticationMethod2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static AuthenticationMethod2Code[] values() {
		AuthenticationMethod2Code[] values = new AuthenticationMethod2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, AuthenticationMethod2Code> {
		@Override
		public AuthenticationMethod2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(AuthenticationMethod2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}