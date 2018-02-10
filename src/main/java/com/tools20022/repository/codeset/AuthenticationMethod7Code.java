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
import com.tools20022.repository.codeset.AuthenticationMethod7Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Method to authenticate the customer or its card.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod7Code#AuthenticationToken
 * AuthenticationMethod7Code.AuthenticationToken}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod7Code#Biometry
 * AuthenticationMethod7Code.Biometry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod7Code#Mobile
 * AuthenticationMethod7Code.Mobile}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod7Code#Other
 * AuthenticationMethod7Code.Other}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod7Code#OfflinePIN
 * AuthenticationMethod7Code.OfflinePIN}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod7Code#OnLinePIN
 * AuthenticationMethod7Code.OnLinePIN}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod7Code#Password
 * AuthenticationMethod7Code.Password}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod7Code#SecureCertificate
 * AuthenticationMethod7Code.SecureCertificate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod7Code#SecuredChannel
 * AuthenticationMethod7Code.SecuredChannel}</li>
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
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AuthenticationMethod7Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Method to authenticate the customer or its card."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class AuthenticationMethod7Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod7Code
	 * AuthenticationMethod7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AuthenticationToken"</li>
	 * </ul>
	 */
	public static final AuthenticationMethod7Code AuthenticationToken = new AuthenticationMethod7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthenticationToken";
			owner_lazy = () -> com.tools20022.repository.codeset.AuthenticationMethod7Code.mmObject();
			codeName = AuthenticationMethodCode.AuthenticationToken.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod7Code
	 * AuthenticationMethod7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Biometry"</li>
	 * </ul>
	 */
	public static final AuthenticationMethod7Code Biometry = new AuthenticationMethod7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Biometry";
			owner_lazy = () -> com.tools20022.repository.codeset.AuthenticationMethod7Code.mmObject();
			codeName = AuthenticationMethodCode.Biometry.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod7Code
	 * AuthenticationMethod7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Mobile"</li>
	 * </ul>
	 */
	public static final AuthenticationMethod7Code Mobile = new AuthenticationMethod7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Mobile";
			owner_lazy = () -> com.tools20022.repository.codeset.AuthenticationMethod7Code.mmObject();
			codeName = AuthenticationMethodCode.Mobile.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod7Code
	 * AuthenticationMethod7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * </ul>
	 */
	public static final AuthenticationMethod7Code Other = new AuthenticationMethod7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			owner_lazy = () -> com.tools20022.repository.codeset.AuthenticationMethod7Code.mmObject();
			codeName = AuthenticationMethodCode.Other.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod7Code
	 * AuthenticationMethod7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfflinePIN"</li>
	 * </ul>
	 */
	public static final AuthenticationMethod7Code OfflinePIN = new AuthenticationMethod7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfflinePIN";
			owner_lazy = () -> com.tools20022.repository.codeset.AuthenticationMethod7Code.mmObject();
			codeName = AuthenticationMethodCode.OfflinePIN.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod7Code
	 * AuthenticationMethod7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OnLinePIN"</li>
	 * </ul>
	 */
	public static final AuthenticationMethod7Code OnLinePIN = new AuthenticationMethod7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OnLinePIN";
			owner_lazy = () -> com.tools20022.repository.codeset.AuthenticationMethod7Code.mmObject();
			codeName = AuthenticationMethodCode.OnLinePIN.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod7Code
	 * AuthenticationMethod7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Password"</li>
	 * </ul>
	 */
	public static final AuthenticationMethod7Code Password = new AuthenticationMethod7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Password";
			owner_lazy = () -> com.tools20022.repository.codeset.AuthenticationMethod7Code.mmObject();
			codeName = AuthenticationMethodCode.Password.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod7Code
	 * AuthenticationMethod7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecureCertificate"</li>
	 * </ul>
	 */
	public static final AuthenticationMethod7Code SecureCertificate = new AuthenticationMethod7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecureCertificate";
			owner_lazy = () -> com.tools20022.repository.codeset.AuthenticationMethod7Code.mmObject();
			codeName = AuthenticationMethodCode.SecureCertificate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod7Code
	 * AuthenticationMethod7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuredChannel"</li>
	 * </ul>
	 */
	public static final AuthenticationMethod7Code SecuredChannel = new AuthenticationMethod7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuredChannel";
			owner_lazy = () -> com.tools20022.repository.codeset.AuthenticationMethod7Code.mmObject();
			codeName = AuthenticationMethodCode.SecuredChannel.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, AuthenticationMethod7Code> codesByName = new LinkedHashMap<>();

	protected AuthenticationMethod7Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AuthenticationMethod7Code";
				definition = "Method to authenticate the customer or its card.";
				trace_lazy = () -> AuthenticationMethodCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AuthenticationMethod7Code.AuthenticationToken, com.tools20022.repository.codeset.AuthenticationMethod7Code.Biometry,
						com.tools20022.repository.codeset.AuthenticationMethod7Code.Mobile, com.tools20022.repository.codeset.AuthenticationMethod7Code.Other, com.tools20022.repository.codeset.AuthenticationMethod7Code.OfflinePIN,
						com.tools20022.repository.codeset.AuthenticationMethod7Code.OnLinePIN, com.tools20022.repository.codeset.AuthenticationMethod7Code.Password,
						com.tools20022.repository.codeset.AuthenticationMethod7Code.SecureCertificate, com.tools20022.repository.codeset.AuthenticationMethod7Code.SecuredChannel);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AuthenticationToken.getCodeName().get(), AuthenticationToken);
		codesByName.put(Biometry.getCodeName().get(), Biometry);
		codesByName.put(Mobile.getCodeName().get(), Mobile);
		codesByName.put(Other.getCodeName().get(), Other);
		codesByName.put(OfflinePIN.getCodeName().get(), OfflinePIN);
		codesByName.put(OnLinePIN.getCodeName().get(), OnLinePIN);
		codesByName.put(Password.getCodeName().get(), Password);
		codesByName.put(SecureCertificate.getCodeName().get(), SecureCertificate);
		codesByName.put(SecuredChannel.getCodeName().get(), SecuredChannel);
	}

	public static AuthenticationMethod7Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static AuthenticationMethod7Code[] values() {
		AuthenticationMethod7Code[] values = new AuthenticationMethod7Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, AuthenticationMethod7Code> {
		@Override
		public AuthenticationMethod7Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(AuthenticationMethod7Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}