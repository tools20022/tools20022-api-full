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
import com.tools20022.repository.codeset.RegulatoryTradingCapacityCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the regulatory trading capacity.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RegulatoryTradingCapacityCode#DealOnOwnAccount
 * RegulatoryTradingCapacityCode.DealOnOwnAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RegulatoryTradingCapacityCode#MatchedPrincipal
 * RegulatoryTradingCapacityCode.MatchedPrincipal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RegulatoryTradingCapacityCode#AnyOtherCapacity
 * RegulatoryTradingCapacityCode.AnyOtherCapacity}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RegulatoryTradingCapacity1Code
 * RegulatoryTradingCapacity1Code}</li>
 * </ul>
 * </li>
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
 * "RegulatoryTradingCapacityCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the regulatory trading capacity."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class RegulatoryTradingCapacityCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Transaction was carried out as a deal under own account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RegulatoryTradingCapacityCode
	 * RegulatoryTradingCapacityCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DEAL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DealOnOwnAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction was carried out as a deal under own account."</li>
	 * </ul>
	 */
	public static final RegulatoryTradingCapacityCode DealOnOwnAccount = new RegulatoryTradingCapacityCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DealOnOwnAccount";
			definition = "Transaction was carried out as a deal under own account.";
			owner_lazy = () -> com.tools20022.repository.codeset.RegulatoryTradingCapacityCode.mmObject();
			codeName = "DEAL";
		}
	};
	/**
	 * Transaction was carried out as a matched principal trading.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RegulatoryTradingCapacityCode
	 * RegulatoryTradingCapacityCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MTCH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MatchedPrincipal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction was carried out as a matched principal trading."</li>
	 * </ul>
	 */
	public static final RegulatoryTradingCapacityCode MatchedPrincipal = new RegulatoryTradingCapacityCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MatchedPrincipal";
			definition = "Transaction was carried out as a matched principal trading.";
			owner_lazy = () -> com.tools20022.repository.codeset.RegulatoryTradingCapacityCode.mmObject();
			codeName = "MTCH";
		}
	};
	/**
	 * Transaction was carried out as an agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RegulatoryTradingCapacityCode
	 * RegulatoryTradingCapacityCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AOTC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AnyOtherCapacity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction was carried out as an agent."</li>
	 * </ul>
	 */
	public static final RegulatoryTradingCapacityCode AnyOtherCapacity = new RegulatoryTradingCapacityCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AnyOtherCapacity";
			definition = "Transaction was carried out as an agent.";
			owner_lazy = () -> com.tools20022.repository.codeset.RegulatoryTradingCapacityCode.mmObject();
			codeName = "AOTC";
		}
	};
	final static private LinkedHashMap<String, RegulatoryTradingCapacityCode> codesByName = new LinkedHashMap<>();

	protected RegulatoryTradingCapacityCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RegulatoryTradingCapacityCode";
				definition = "Specifies the regulatory trading capacity.";
				derivation_lazy = () -> Arrays.asList(RegulatoryTradingCapacity1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.RegulatoryTradingCapacityCode.DealOnOwnAccount, com.tools20022.repository.codeset.RegulatoryTradingCapacityCode.MatchedPrincipal,
						com.tools20022.repository.codeset.RegulatoryTradingCapacityCode.AnyOtherCapacity);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(DealOnOwnAccount.getCodeName().get(), DealOnOwnAccount);
		codesByName.put(MatchedPrincipal.getCodeName().get(), MatchedPrincipal);
		codesByName.put(AnyOtherCapacity.getCodeName().get(), AnyOtherCapacity);
	}

	public static RegulatoryTradingCapacityCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static RegulatoryTradingCapacityCode[] values() {
		RegulatoryTradingCapacityCode[] values = new RegulatoryTradingCapacityCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, RegulatoryTradingCapacityCode> {
		@Override
		public RegulatoryTradingCapacityCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(RegulatoryTradingCapacityCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}