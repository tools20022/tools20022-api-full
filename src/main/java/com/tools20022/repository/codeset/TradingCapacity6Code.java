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
import com.tools20022.repository.codeset.TradingCapacity6Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the role of a trading party in a transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.TradingCapacity6Code#Agent
 * TradingCapacity6Code.Agent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradingCapacity6Code#ActingAgent
 * TradingCapacity6Code.ActingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradingCapacity6Code#CrossingAgent
 * TradingCapacity6Code.CrossingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradingCapacity6Code#CrossingPrincipal
 * TradingCapacity6Code.CrossingPrincipal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradingCapacity6Code#OtherAgent
 * TradingCapacity6Code.OtherAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradingCapacity6Code#PrincipalAgent
 * TradingCapacity6Code.PrincipalAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradingCapacity6Code#Principal
 * TradingCapacity6Code.Principal}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.TradingCapacityCode
 * TradingCapacityCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"AGEN"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TradingCapacity6Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the role of a trading party in a transaction."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TradingCapacity6Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradingCapacity6Code
	 * TradingCapacity6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Agent"</li>
	 * </ul>
	 */
	public static final TradingCapacity6Code Agent = new TradingCapacity6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Agent";
			owner_lazy = () -> com.tools20022.repository.codeset.TradingCapacity6Code.mmObject();
			codeName = TradingCapacityCode.Agent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradingCapacity6Code
	 * TradingCapacity6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ActingAgent"</li>
	 * </ul>
	 */
	public static final TradingCapacity6Code ActingAgent = new TradingCapacity6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ActingAgent";
			owner_lazy = () -> com.tools20022.repository.codeset.TradingCapacity6Code.mmObject();
			codeName = TradingCapacityCode.ActingAgent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradingCapacity6Code
	 * TradingCapacity6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CrossingAgent"</li>
	 * </ul>
	 */
	public static final TradingCapacity6Code CrossingAgent = new TradingCapacity6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CrossingAgent";
			owner_lazy = () -> com.tools20022.repository.codeset.TradingCapacity6Code.mmObject();
			codeName = TradingCapacityCode.CrossingAgent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradingCapacity6Code
	 * TradingCapacity6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CrossingPrincipal"</li>
	 * </ul>
	 */
	public static final TradingCapacity6Code CrossingPrincipal = new TradingCapacity6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CrossingPrincipal";
			owner_lazy = () -> com.tools20022.repository.codeset.TradingCapacity6Code.mmObject();
			codeName = TradingCapacityCode.CrossingPrincipal.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradingCapacity6Code
	 * TradingCapacity6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherAgent"</li>
	 * </ul>
	 */
	public static final TradingCapacity6Code OtherAgent = new TradingCapacity6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherAgent";
			owner_lazy = () -> com.tools20022.repository.codeset.TradingCapacity6Code.mmObject();
			codeName = TradingCapacityCode.OtherAgent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradingCapacity6Code
	 * TradingCapacity6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PrincipalAgent"</li>
	 * </ul>
	 */
	public static final TradingCapacity6Code PrincipalAgent = new TradingCapacity6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PrincipalAgent";
			owner_lazy = () -> com.tools20022.repository.codeset.TradingCapacity6Code.mmObject();
			codeName = TradingCapacityCode.PrincipalAgent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradingCapacity6Code
	 * TradingCapacity6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Principal"</li>
	 * </ul>
	 */
	public static final TradingCapacity6Code Principal = new TradingCapacity6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Principal";
			owner_lazy = () -> com.tools20022.repository.codeset.TradingCapacity6Code.mmObject();
			codeName = TradingCapacityCode.Principal.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, TradingCapacity6Code> codesByName = new LinkedHashMap<>();

	protected TradingCapacity6Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("AGEN");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TradingCapacity6Code";
				definition = "Specifies the role of a trading party in a transaction.";
				trace_lazy = () -> TradingCapacityCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TradingCapacity6Code.Agent, com.tools20022.repository.codeset.TradingCapacity6Code.ActingAgent,
						com.tools20022.repository.codeset.TradingCapacity6Code.CrossingAgent, com.tools20022.repository.codeset.TradingCapacity6Code.CrossingPrincipal, com.tools20022.repository.codeset.TradingCapacity6Code.OtherAgent,
						com.tools20022.repository.codeset.TradingCapacity6Code.PrincipalAgent, com.tools20022.repository.codeset.TradingCapacity6Code.Principal);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Agent.getCodeName().get(), Agent);
		codesByName.put(ActingAgent.getCodeName().get(), ActingAgent);
		codesByName.put(CrossingAgent.getCodeName().get(), CrossingAgent);
		codesByName.put(CrossingPrincipal.getCodeName().get(), CrossingPrincipal);
		codesByName.put(OtherAgent.getCodeName().get(), OtherAgent);
		codesByName.put(PrincipalAgent.getCodeName().get(), PrincipalAgent);
		codesByName.put(Principal.getCodeName().get(), Principal);
	}

	public static TradingCapacity6Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TradingCapacity6Code[] values() {
		TradingCapacity6Code[] values = new TradingCapacity6Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TradingCapacity6Code> {
		@Override
		public TradingCapacity6Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TradingCapacity6Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}