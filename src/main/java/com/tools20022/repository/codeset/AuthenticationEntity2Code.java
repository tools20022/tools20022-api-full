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
import com.tools20022.repository.codeset.AuthenticationEntity2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Entity or device that has performed the verification.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationEntity2Code#ICC
 * AuthenticationEntity2Code.ICC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationEntity2Code#AuthorisedAgent
 * AuthenticationEntity2Code.AuthorisedAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationEntity2Code#Merchant
 * AuthenticationEntity2Code.Merchant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationEntity2Code#Acquirer
 * AuthenticationEntity2Code.Acquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationEntity2Code#Issuer
 * AuthenticationEntity2Code.Issuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthenticationEntity2Code#Terminal
 * AuthenticationEntity2Code.Terminal}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.AuthenticationEntityCode
 * AuthenticationEntityCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AuthenticationEntity2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Entity or device that has performed the verification."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"ICCD"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.codeset.AuthenticationEntity1Code
 * AuthenticationEntity1Code}</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class AuthenticationEntity2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationEntity2Code
	 * AuthenticationEntity2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ICC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationEntity1Code#ICC
	 * AuthenticationEntity1Code.ICC}</li>
	 * </ul>
	 */
	public static final AuthenticationEntity2Code ICC = new AuthenticationEntity2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ICC";
			previousVersion_lazy = () -> AuthenticationEntity1Code.ICC;
			owner_lazy = () -> com.tools20022.repository.codeset.AuthenticationEntity2Code.mmObject();
			codeName = AuthenticationEntityCode.ICC.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationEntity2Code
	 * AuthenticationEntity2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AuthorisedAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationEntity1Code#AuthorisedAgent
	 * AuthenticationEntity1Code.AuthorisedAgent}</li>
	 * </ul>
	 */
	public static final AuthenticationEntity2Code AuthorisedAgent = new AuthenticationEntity2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthorisedAgent";
			previousVersion_lazy = () -> AuthenticationEntity1Code.AuthorisedAgent;
			owner_lazy = () -> com.tools20022.repository.codeset.AuthenticationEntity2Code.mmObject();
			codeName = AuthenticationEntityCode.AuthorisedAgent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationEntity2Code
	 * AuthenticationEntity2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Merchant"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationEntity1Code#Merchant
	 * AuthenticationEntity1Code.Merchant}</li>
	 * </ul>
	 */
	public static final AuthenticationEntity2Code Merchant = new AuthenticationEntity2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Merchant";
			previousVersion_lazy = () -> AuthenticationEntity1Code.Merchant;
			owner_lazy = () -> com.tools20022.repository.codeset.AuthenticationEntity2Code.mmObject();
			codeName = AuthenticationEntityCode.Merchant.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationEntity2Code
	 * AuthenticationEntity2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Acquirer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final AuthenticationEntity2Code Acquirer = new AuthenticationEntity2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Acquirer";
			owner_lazy = () -> com.tools20022.repository.codeset.AuthenticationEntity2Code.mmObject();
			codeName = AuthenticationEntityCode.Acquirer.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationEntity2Code
	 * AuthenticationEntity2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Issuer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final AuthenticationEntity2Code Issuer = new AuthenticationEntity2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Issuer";
			owner_lazy = () -> com.tools20022.repository.codeset.AuthenticationEntity2Code.mmObject();
			codeName = AuthenticationEntityCode.Issuer.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationEntity2Code
	 * AuthenticationEntity2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Terminal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final AuthenticationEntity2Code Terminal = new AuthenticationEntity2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Terminal";
			owner_lazy = () -> com.tools20022.repository.codeset.AuthenticationEntity2Code.mmObject();
			codeName = AuthenticationEntityCode.Terminal.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, AuthenticationEntity2Code> codesByName = new LinkedHashMap<>();

	protected AuthenticationEntity2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("ICCD");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AuthenticationEntity2Code";
				definition = "Entity or device that has performed the verification.";
				previousVersion_lazy = () -> AuthenticationEntity1Code.mmObject();
				trace_lazy = () -> AuthenticationEntityCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AuthenticationEntity2Code.ICC, com.tools20022.repository.codeset.AuthenticationEntity2Code.AuthorisedAgent,
						com.tools20022.repository.codeset.AuthenticationEntity2Code.Merchant, com.tools20022.repository.codeset.AuthenticationEntity2Code.Acquirer, com.tools20022.repository.codeset.AuthenticationEntity2Code.Issuer,
						com.tools20022.repository.codeset.AuthenticationEntity2Code.Terminal);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(ICC.getCodeName().get(), ICC);
		codesByName.put(AuthorisedAgent.getCodeName().get(), AuthorisedAgent);
		codesByName.put(Merchant.getCodeName().get(), Merchant);
		codesByName.put(Acquirer.getCodeName().get(), Acquirer);
		codesByName.put(Issuer.getCodeName().get(), Issuer);
		codesByName.put(Terminal.getCodeName().get(), Terminal);
	}

	public static AuthenticationEntity2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static AuthenticationEntity2Code[] values() {
		AuthenticationEntity2Code[] values = new AuthenticationEntity2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, AuthenticationEntity2Code> {
		@Override
		public AuthenticationEntity2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(AuthenticationEntity2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}