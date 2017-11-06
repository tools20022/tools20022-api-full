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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the type of profile.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.ProfileTypeCode#mmTreasury
 * ProfileTypeCode.mmTreasury}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProfileTypeCode#mmHighFrequencyTrader
 * ProfileTypeCode.mmHighFrequencyTrader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProfileTypeCode#mmMarketMaker
 * ProfileTypeCode.mmMarketMaker}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ProfileTypeCode#mmHedge
 * ProfileTypeCode.mmHedge}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.ProfileType1Code
 * ProfileType1Code}</li>
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
 * "ProfileTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of profile."</li>
 * </ul>
 */
public class ProfileTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Trading system of federal securities in the retail market directly to the
	 * investor. The operation can be performed directly over the Internet.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProfileTypeCode
	 * ProfileTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TREA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Treasury"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Trading system of federal securities in the retail market directly to the investor. The operation can be performed directly over the Internet."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmTreasury = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Treasury";
			definition = "Trading system of federal securities in the retail market directly to the investor. The operation can be performed directly over the Internet.";
			owner_lazy = () -> ProfileTypeCode.mmObject();
			codeName = "TREA";
		}
	};
	/**
	 * Investors operating through algorithms and send orders automatically
	 * according to the strategies defined by their managers. Through this
	 * access model, the participants of these servers are hosted primarily
	 * within the premises of Brazilian Market and significantly reduce the time
	 * of submission of offers to trading systems
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProfileTypeCode
	 * ProfileTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "HFTR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HighFrequencyTrader"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Investors operating through algorithms and send orders automatically according to the strategies defined by their managers. Through this access model, the participants of these servers are hosted primarily within the premises of Brazilian Market and significantly reduce the time of submission of offers to trading systems"
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmHighFrequencyTrader = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HighFrequencyTrader";
			definition = "Investors operating through algorithms and send orders automatically according to the strategies defined by their managers. Through this access model, the participants of these servers are hosted primarily within the premises of Brazilian Market and significantly reduce the time of submission of offers to trading systems";
			owner_lazy = () -> ProfileTypeCode.mmObject();
			codeName = "HFTR";
		}
	};
	/**
	 * Agent liquidity, liquidity facilitator, promoter of business, specialist,
	 * market maker and liquidity provider are some designations given to those
	 * who propose to provide liquidity and minimum reference price for assets
	 * previously accredited, factors highlighted in the analysis of efficiency
	 * in capital markets.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProfileTypeCode
	 * ProfileTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MAKE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketMaker"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Agent liquidity, liquidity facilitator, promoter of business, specialist, market maker and liquidity provider are some designations given to those who propose to provide liquidity and minimum reference price for assets previously accredited, factors highlighted in the analysis of efficiency in capital markets."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmMarketMaker = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketMaker";
			definition = "Agent liquidity, liquidity facilitator, promoter of business, specialist, market maker and liquidity provider are some designations given to those who propose to provide liquidity and minimum reference price for assets previously accredited, factors highlighted in the analysis of efficiency in capital markets.";
			owner_lazy = () -> ProfileTypeCode.mmObject();
			codeName = "MAKE";
		}
	};
	/**
	 * Investor shares that uses defensive operations (hedging), thus avoiding
	 * the risk of large swings.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProfileTypeCode
	 * ProfileTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "HEDG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Hedge"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Investor shares that uses defensive operations (hedging), thus avoiding the risk of large swings."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmHedge = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Hedge";
			definition = "Investor shares that uses defensive operations (hedging), thus avoiding the risk of large swings.";
			owner_lazy = () -> ProfileTypeCode.mmObject();
			codeName = "HEDG";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ProfileTypeCode";
				definition = "Specifies the type of profile.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ProfileTypeCode.mmTreasury, com.tools20022.repository.codeset.ProfileTypeCode.mmHighFrequencyTrader,
						com.tools20022.repository.codeset.ProfileTypeCode.mmMarketMaker, com.tools20022.repository.codeset.ProfileTypeCode.mmHedge);
				derivation_lazy = () -> Arrays.asList(ProfileType1Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}