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
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the regulatory trading capacity.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RegulatoryTradingCapacityCode#mmDealOnOwnAccount
 * RegulatoryTradingCapacityCode.mmDealOnOwnAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RegulatoryTradingCapacityCode#mmMatchedPrincipal
 * RegulatoryTradingCapacityCode.mmMatchedPrincipal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RegulatoryTradingCapacityCode#mmAnyOtherCapacity
 * RegulatoryTradingCapacityCode.mmAnyOtherCapacity}</li>
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
public class RegulatoryTradingCapacityCode {

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
	public static final MMCode mmDealOnOwnAccount = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DealOnOwnAccount";
			definition = "Transaction was carried out as a deal under own account.";
			owner_lazy = () -> RegulatoryTradingCapacityCode.mmObject();
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
	public static final MMCode mmMatchedPrincipal = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MatchedPrincipal";
			definition = "Transaction was carried out as a matched principal trading.";
			owner_lazy = () -> RegulatoryTradingCapacityCode.mmObject();
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
	public static final MMCode mmAnyOtherCapacity = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AnyOtherCapacity";
			definition = "Transaction was carried out as an agent.";
			owner_lazy = () -> RegulatoryTradingCapacityCode.mmObject();
			codeName = "AOTC";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RegulatoryTradingCapacityCode";
				definition = "Specifies the regulatory trading capacity.";
				code_lazy = () -> Arrays.asList(RegulatoryTradingCapacityCode.mmDealOnOwnAccount, RegulatoryTradingCapacityCode.mmMatchedPrincipal, RegulatoryTradingCapacityCode.mmAnyOtherCapacity);
				derivation_lazy = () -> Arrays.asList(RegulatoryTradingCapacity1Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}