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
import com.tools20022.repository.codeset.TradingCapacity3Code.InternalXmlAdapter;
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
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradingCapacity3Code#Principal
 * TradingCapacity3Code.Principal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradingCapacity3Code#CrossingPrincipal
 * TradingCapacity3Code.CrossingPrincipal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradingCapacity3Code#RisklessPrincipal
 * TradingCapacity3Code.RisklessPrincipal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradingCapacity3Code#Proprietary
 * TradingCapacity3Code.Proprietary}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TradingCapacity3Code#Agent
 * TradingCapacity3Code.Agent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradingCapacity3Code#CrossingAgent
 * TradingCapacity3Code.CrossingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradingCapacity3Code#OtherAgent
 * TradingCapacity3Code.OtherAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradingCapacity3Code#PrincipalAgent
 * TradingCapacity3Code.PrincipalAgent}</li>
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
 * <li>"PRIN"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TradingCapacity3Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the role of a trading party in a transaction."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TradingCapacity3Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradingCapacity3Code
	 * TradingCapacity3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Principal"</li>
	 * </ul>
	 */
	public static final TradingCapacity3Code Principal = new TradingCapacity3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Principal";
			owner_lazy = () -> com.tools20022.repository.codeset.TradingCapacity3Code.mmObject();
			codeName = TradingCapacityCode.Principal.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradingCapacity3Code
	 * TradingCapacity3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CrossingPrincipal"</li>
	 * </ul>
	 */
	public static final TradingCapacity3Code CrossingPrincipal = new TradingCapacity3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CrossingPrincipal";
			owner_lazy = () -> com.tools20022.repository.codeset.TradingCapacity3Code.mmObject();
			codeName = TradingCapacityCode.CrossingPrincipal.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradingCapacity3Code
	 * TradingCapacity3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RisklessPrincipal"</li>
	 * </ul>
	 */
	public static final TradingCapacity3Code RisklessPrincipal = new TradingCapacity3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RisklessPrincipal";
			owner_lazy = () -> com.tools20022.repository.codeset.TradingCapacity3Code.mmObject();
			codeName = TradingCapacityCode.RisklessPrincipal.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradingCapacity3Code
	 * TradingCapacity3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Proprietary"</li>
	 * </ul>
	 */
	public static final TradingCapacity3Code Proprietary = new TradingCapacity3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Proprietary";
			owner_lazy = () -> com.tools20022.repository.codeset.TradingCapacity3Code.mmObject();
			codeName = TradingCapacityCode.Proprietary.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradingCapacity3Code
	 * TradingCapacity3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Agent"</li>
	 * </ul>
	 */
	public static final TradingCapacity3Code Agent = new TradingCapacity3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Agent";
			owner_lazy = () -> com.tools20022.repository.codeset.TradingCapacity3Code.mmObject();
			codeName = TradingCapacityCode.Agent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradingCapacity3Code
	 * TradingCapacity3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CrossingAgent"</li>
	 * </ul>
	 */
	public static final TradingCapacity3Code CrossingAgent = new TradingCapacity3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CrossingAgent";
			owner_lazy = () -> com.tools20022.repository.codeset.TradingCapacity3Code.mmObject();
			codeName = TradingCapacityCode.CrossingAgent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradingCapacity3Code
	 * TradingCapacity3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherAgent"</li>
	 * </ul>
	 */
	public static final TradingCapacity3Code OtherAgent = new TradingCapacity3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherAgent";
			owner_lazy = () -> com.tools20022.repository.codeset.TradingCapacity3Code.mmObject();
			codeName = TradingCapacityCode.OtherAgent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradingCapacity3Code
	 * TradingCapacity3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PrincipalAgent"</li>
	 * </ul>
	 */
	public static final TradingCapacity3Code PrincipalAgent = new TradingCapacity3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PrincipalAgent";
			owner_lazy = () -> com.tools20022.repository.codeset.TradingCapacity3Code.mmObject();
			codeName = TradingCapacityCode.PrincipalAgent.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, TradingCapacity3Code> codesByName = new LinkedHashMap<>();

	protected TradingCapacity3Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("PRIN");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TradingCapacity3Code";
				definition = "Specifies the role of a trading party in a transaction.";
				trace_lazy = () -> TradingCapacityCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TradingCapacity3Code.Principal, com.tools20022.repository.codeset.TradingCapacity3Code.CrossingPrincipal,
						com.tools20022.repository.codeset.TradingCapacity3Code.RisklessPrincipal, com.tools20022.repository.codeset.TradingCapacity3Code.Proprietary, com.tools20022.repository.codeset.TradingCapacity3Code.Agent,
						com.tools20022.repository.codeset.TradingCapacity3Code.CrossingAgent, com.tools20022.repository.codeset.TradingCapacity3Code.OtherAgent, com.tools20022.repository.codeset.TradingCapacity3Code.PrincipalAgent);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Principal.getCodeName().get(), Principal);
		codesByName.put(CrossingPrincipal.getCodeName().get(), CrossingPrincipal);
		codesByName.put(RisklessPrincipal.getCodeName().get(), RisklessPrincipal);
		codesByName.put(Proprietary.getCodeName().get(), Proprietary);
		codesByName.put(Agent.getCodeName().get(), Agent);
		codesByName.put(CrossingAgent.getCodeName().get(), CrossingAgent);
		codesByName.put(OtherAgent.getCodeName().get(), OtherAgent);
		codesByName.put(PrincipalAgent.getCodeName().get(), PrincipalAgent);
	}

	public static TradingCapacity3Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TradingCapacity3Code[] values() {
		TradingCapacity3Code[] values = new TradingCapacity3Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TradingCapacity3Code> {
		@Override
		public TradingCapacity3Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TradingCapacity3Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}