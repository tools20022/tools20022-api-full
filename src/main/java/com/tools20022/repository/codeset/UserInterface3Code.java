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
import com.tools20022.repository.codeset.UserInterface3Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Destination of the message.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UserInterface3Code#Acquirer
 * UserInterface3Code.Acquirer}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UserInterface3Code#Agent
 * UserInterface3Code.Agent}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UserInterface3Code#Issuer
 * UserInterface3Code.Issuer}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.UserInterfaceCode
 * UserInterfaceCode}</li>
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
 * "UserInterface3Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Destination of the message."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class UserInterface3Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UserInterface3Code
	 * UserInterface3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Acquirer"</li>
	 * </ul>
	 */
	public static final UserInterface3Code Acquirer = new UserInterface3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Acquirer";
			owner_lazy = () -> com.tools20022.repository.codeset.UserInterface3Code.mmObject();
			codeName = UserInterfaceCode.Acquirer.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UserInterface3Code
	 * UserInterface3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Agent"</li>
	 * </ul>
	 */
	public static final UserInterface3Code Agent = new UserInterface3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Agent";
			owner_lazy = () -> com.tools20022.repository.codeset.UserInterface3Code.mmObject();
			codeName = UserInterfaceCode.Agent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UserInterface3Code
	 * UserInterface3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Issuer"</li>
	 * </ul>
	 */
	public static final UserInterface3Code Issuer = new UserInterface3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Issuer";
			owner_lazy = () -> com.tools20022.repository.codeset.UserInterface3Code.mmObject();
			codeName = UserInterfaceCode.Issuer.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, UserInterface3Code> codesByName = new LinkedHashMap<>();

	protected UserInterface3Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "UserInterface3Code";
				definition = "Destination of the message.";
				trace_lazy = () -> UserInterfaceCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.UserInterface3Code.Acquirer, com.tools20022.repository.codeset.UserInterface3Code.Agent, com.tools20022.repository.codeset.UserInterface3Code.Issuer);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Acquirer.getCodeName().get(), Acquirer);
		codesByName.put(Agent.getCodeName().get(), Agent);
		codesByName.put(Issuer.getCodeName().get(), Issuer);
	}

	public static UserInterface3Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static UserInterface3Code[] values() {
		UserInterface3Code[] values = new UserInterface3Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, UserInterface3Code> {
		@Override
		public UserInterface3Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(UserInterface3Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}