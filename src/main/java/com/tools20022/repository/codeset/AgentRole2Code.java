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
import com.tools20022.repository.codeset.AgentRole2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the role of the agent.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AgentRole2Code#SystemPayingAgent
 * AgentRole2Code.SystemPayingAgent}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.AgentRole2Code#CoDomicile
 * AgentRole2Code.CoDomicile}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.AgentRole2Code#IssuerAgent
 * AgentRole2Code.IssuerAgent}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.AgentRole2Code#Registrar
 * AgentRole2Code.Registrar}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.AgentRole2Code#PayingAgent
 * AgentRole2Code.PayingAgent}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.AgentRoleCode AgentRoleCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"SPAY"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AgentRole2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the role of the agent."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class AgentRole2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AgentRole2Code
	 * AgentRole2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SystemPayingAgent"</li>
	 * </ul>
	 */
	public static final AgentRole2Code SystemPayingAgent = new AgentRole2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SystemPayingAgent";
			owner_lazy = () -> com.tools20022.repository.codeset.AgentRole2Code.mmObject();
			codeName = AgentRoleCode.SystemPayingAgent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AgentRole2Code
	 * AgentRole2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoDomicile"</li>
	 * </ul>
	 */
	public static final AgentRole2Code CoDomicile = new AgentRole2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoDomicile";
			owner_lazy = () -> com.tools20022.repository.codeset.AgentRole2Code.mmObject();
			codeName = AgentRoleCode.CoDomicile.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AgentRole2Code
	 * AgentRole2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerAgent"</li>
	 * </ul>
	 */
	public static final AgentRole2Code IssuerAgent = new AgentRole2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerAgent";
			owner_lazy = () -> com.tools20022.repository.codeset.AgentRole2Code.mmObject();
			codeName = AgentRoleCode.IssuerAgent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AgentRole2Code
	 * AgentRole2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Registrar"</li>
	 * </ul>
	 */
	public static final AgentRole2Code Registrar = new AgentRole2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Registrar";
			owner_lazy = () -> com.tools20022.repository.codeset.AgentRole2Code.mmObject();
			codeName = AgentRoleCode.Registrar.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AgentRole2Code
	 * AgentRole2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PayingAgent"</li>
	 * </ul>
	 */
	public static final AgentRole2Code PayingAgent = new AgentRole2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PayingAgent";
			owner_lazy = () -> com.tools20022.repository.codeset.AgentRole2Code.mmObject();
			codeName = AgentRoleCode.PayingAgent.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, AgentRole2Code> codesByName = new LinkedHashMap<>();

	protected AgentRole2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("SPAY");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AgentRole2Code";
				definition = "Specifies the role of the agent.";
				trace_lazy = () -> AgentRoleCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AgentRole2Code.SystemPayingAgent, com.tools20022.repository.codeset.AgentRole2Code.CoDomicile, com.tools20022.repository.codeset.AgentRole2Code.IssuerAgent,
						com.tools20022.repository.codeset.AgentRole2Code.Registrar, com.tools20022.repository.codeset.AgentRole2Code.PayingAgent);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(SystemPayingAgent.getCodeName().get(), SystemPayingAgent);
		codesByName.put(CoDomicile.getCodeName().get(), CoDomicile);
		codesByName.put(IssuerAgent.getCodeName().get(), IssuerAgent);
		codesByName.put(Registrar.getCodeName().get(), Registrar);
		codesByName.put(PayingAgent.getCodeName().get(), PayingAgent);
	}

	public static AgentRole2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static AgentRole2Code[] values() {
		AgentRole2Code[] values = new AgentRole2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, AgentRole2Code> {
		@Override
		public AgentRole2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(AgentRole2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}