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
import com.tools20022.repository.codeset.AuthenticationResult1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the result of authentication done.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationResult1Code#Denial
 * AuthenticationResult1Code.Denial}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationResult1Code#MerchantNotEnroled
 * AuthenticationResult1Code.MerchantNotEnroled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationResult1Code#NonParticipation
 * AuthenticationResult1Code.NonParticipation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationResult1Code#UnableToAuthenticate
 * AuthenticationResult1Code.UnableToAuthenticate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationResult1Code#WithCryptogram
 * AuthenticationResult1Code.WithCryptogram}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationResult1Code#WithoutCryptogram
 * AuthenticationResult1Code.WithoutCryptogram}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.AuthenticationResultCode
 * AuthenticationResultCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AuthenticationResult1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the result of authentication done."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class AuthenticationResult1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationResult1Code
	 * AuthenticationResult1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Denial"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final AuthenticationResult1Code Denial = new AuthenticationResult1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Denial";
			owner_lazy = () -> com.tools20022.repository.codeset.AuthenticationResult1Code.mmObject();
			codeName = AuthenticationResultCode.Denial.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationResult1Code
	 * AuthenticationResult1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MerchantNotEnroled"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final AuthenticationResult1Code MerchantNotEnroled = new AuthenticationResult1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MerchantNotEnroled";
			owner_lazy = () -> com.tools20022.repository.codeset.AuthenticationResult1Code.mmObject();
			codeName = AuthenticationResultCode.MerchantNotEnroled.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationResult1Code
	 * AuthenticationResult1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonParticipation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final AuthenticationResult1Code NonParticipation = new AuthenticationResult1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonParticipation";
			owner_lazy = () -> com.tools20022.repository.codeset.AuthenticationResult1Code.mmObject();
			codeName = AuthenticationResultCode.NonParticipation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationResult1Code
	 * AuthenticationResult1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnableToAuthenticate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final AuthenticationResult1Code UnableToAuthenticate = new AuthenticationResult1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToAuthenticate";
			owner_lazy = () -> com.tools20022.repository.codeset.AuthenticationResult1Code.mmObject();
			codeName = AuthenticationResultCode.UnableToAuthenticate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationResult1Code
	 * AuthenticationResult1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithCryptogram"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final AuthenticationResult1Code WithCryptogram = new AuthenticationResult1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithCryptogram";
			owner_lazy = () -> com.tools20022.repository.codeset.AuthenticationResult1Code.mmObject();
			codeName = AuthenticationResultCode.WithCryptogram.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationResult1Code
	 * AuthenticationResult1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithoutCryptogram"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final AuthenticationResult1Code WithoutCryptogram = new AuthenticationResult1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithoutCryptogram";
			owner_lazy = () -> com.tools20022.repository.codeset.AuthenticationResult1Code.mmObject();
			codeName = AuthenticationResultCode.WithoutCryptogram.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, AuthenticationResult1Code> codesByName = new LinkedHashMap<>();

	protected AuthenticationResult1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AuthenticationResult1Code";
				definition = "Specifies the result of authentication done.";
				trace_lazy = () -> AuthenticationResultCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AuthenticationResult1Code.Denial, com.tools20022.repository.codeset.AuthenticationResult1Code.MerchantNotEnroled,
						com.tools20022.repository.codeset.AuthenticationResult1Code.NonParticipation, com.tools20022.repository.codeset.AuthenticationResult1Code.UnableToAuthenticate,
						com.tools20022.repository.codeset.AuthenticationResult1Code.WithCryptogram, com.tools20022.repository.codeset.AuthenticationResult1Code.WithoutCryptogram);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Denial.getCodeName().get(), Denial);
		codesByName.put(MerchantNotEnroled.getCodeName().get(), MerchantNotEnroled);
		codesByName.put(NonParticipation.getCodeName().get(), NonParticipation);
		codesByName.put(UnableToAuthenticate.getCodeName().get(), UnableToAuthenticate);
		codesByName.put(WithCryptogram.getCodeName().get(), WithCryptogram);
		codesByName.put(WithoutCryptogram.getCodeName().get(), WithoutCryptogram);
	}

	public static AuthenticationResult1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static AuthenticationResult1Code[] values() {
		AuthenticationResult1Code[] values = new AuthenticationResult1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, AuthenticationResult1Code> {
		@Override
		public AuthenticationResult1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(AuthenticationResult1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}