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
import com.tools20022.repository.codeset.TradingCapacity5Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.TradingCapacity5Code#Principal
 * TradingCapacity5Code.Principal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradingCapacity5Code#RisklessPrincipal
 * TradingCapacity5Code.RisklessPrincipal}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TradingCapacity5Code#Agent
 * TradingCapacity5Code.Agent}</li>
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
 * "TradingCapacity5Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the role of a trading party in a transaction."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TradingCapacity5Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradingCapacity5Code
	 * TradingCapacity5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Principal"</li>
	 * </ul>
	 */
	public static final TradingCapacity5Code Principal = new TradingCapacity5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Principal";
			owner_lazy = () -> com.tools20022.repository.codeset.TradingCapacity5Code.mmObject();
			codeName = TradingCapacityCode.Principal.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradingCapacity5Code
	 * TradingCapacity5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RisklessPrincipal"</li>
	 * </ul>
	 */
	public static final TradingCapacity5Code RisklessPrincipal = new TradingCapacity5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RisklessPrincipal";
			owner_lazy = () -> com.tools20022.repository.codeset.TradingCapacity5Code.mmObject();
			codeName = TradingCapacityCode.RisklessPrincipal.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradingCapacity5Code
	 * TradingCapacity5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Agent"</li>
	 * </ul>
	 */
	public static final TradingCapacity5Code Agent = new TradingCapacity5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Agent";
			owner_lazy = () -> com.tools20022.repository.codeset.TradingCapacity5Code.mmObject();
			codeName = TradingCapacityCode.Agent.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, TradingCapacity5Code> codesByName = new LinkedHashMap<>();

	protected TradingCapacity5Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("PRIN");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TradingCapacity5Code";
				definition = "Specifies the role of a trading party in a transaction.";
				trace_lazy = () -> TradingCapacityCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TradingCapacity5Code.Principal, com.tools20022.repository.codeset.TradingCapacity5Code.RisklessPrincipal,
						com.tools20022.repository.codeset.TradingCapacity5Code.Agent);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Principal.getCodeName().get(), Principal);
		codesByName.put(RisklessPrincipal.getCodeName().get(), RisklessPrincipal);
		codesByName.put(Agent.getCodeName().get(), Agent);
	}

	public static TradingCapacity5Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TradingCapacity5Code[] values() {
		TradingCapacity5Code[] values = new TradingCapacity5Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TradingCapacity5Code> {
		@Override
		public TradingCapacity5Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TradingCapacity5Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}