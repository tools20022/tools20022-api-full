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
import com.tools20022.repository.codeset.SettlingCapacity2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the role of the party in the settlement of the transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlingCapacity2Code#SettlingAgent
 * SettlingCapacity2Code.SettlingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlingCapacity2Code#SettlingCustodian
 * SettlingCapacity2Code.SettlingCustodian}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlingCapacity2Code#SettlingPrincipal
 * SettlingCapacity2Code.SettlingPrincipal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlingCapacity2Code#SettlingRisklessPrincipal
 * SettlingCapacity2Code.SettlingRisklessPrincipal}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.SettlingCapacityCode
 * SettlingCapacityCode}</li>
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
 * "SettlingCapacity2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the role of the party in the settlement of the transaction."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class SettlingCapacity2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlingCapacity2Code
	 * SettlingCapacity2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlingAgent"</li>
	 * </ul>
	 */
	public static final SettlingCapacity2Code SettlingAgent = new SettlingCapacity2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlingAgent";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlingCapacity2Code.mmObject();
			codeName = SettlingCapacityCode.SettlingAgent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlingCapacity2Code
	 * SettlingCapacity2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlingCustodian"</li>
	 * </ul>
	 */
	public static final SettlingCapacity2Code SettlingCustodian = new SettlingCapacity2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlingCustodian";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlingCapacity2Code.mmObject();
			codeName = SettlingCapacityCode.SettlingCustodian.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlingCapacity2Code
	 * SettlingCapacity2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlingPrincipal"</li>
	 * </ul>
	 */
	public static final SettlingCapacity2Code SettlingPrincipal = new SettlingCapacity2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlingPrincipal";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlingCapacity2Code.mmObject();
			codeName = SettlingCapacityCode.SettlingPrincipal.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlingCapacity2Code
	 * SettlingCapacity2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlingRisklessPrincipal"</li>
	 * </ul>
	 */
	public static final SettlingCapacity2Code SettlingRisklessPrincipal = new SettlingCapacity2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlingRisklessPrincipal";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlingCapacity2Code.mmObject();
			codeName = SettlingCapacityCode.SettlingRisklessPrincipal.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, SettlingCapacity2Code> codesByName = new LinkedHashMap<>();

	protected SettlingCapacity2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SettlingCapacity2Code";
				definition = "Specifies the role of the party in the settlement of the transaction.";
				trace_lazy = () -> SettlingCapacityCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SettlingCapacity2Code.SettlingAgent, com.tools20022.repository.codeset.SettlingCapacity2Code.SettlingCustodian,
						com.tools20022.repository.codeset.SettlingCapacity2Code.SettlingPrincipal, com.tools20022.repository.codeset.SettlingCapacity2Code.SettlingRisklessPrincipal);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(SettlingAgent.getCodeName().get(), SettlingAgent);
		codesByName.put(SettlingCustodian.getCodeName().get(), SettlingCustodian);
		codesByName.put(SettlingPrincipal.getCodeName().get(), SettlingPrincipal);
		codesByName.put(SettlingRisklessPrincipal.getCodeName().get(), SettlingRisklessPrincipal);
	}

	public static SettlingCapacity2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static SettlingCapacity2Code[] values() {
		SettlingCapacity2Code[] values = new SettlingCapacity2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, SettlingCapacity2Code> {
		@Override
		public SettlingCapacity2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(SettlingCapacity2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}