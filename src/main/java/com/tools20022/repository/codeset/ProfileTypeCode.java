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
import com.tools20022.repository.codeset.ProfileTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of profile.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.ProfileTypeCode#Treasury
 * ProfileTypeCode.Treasury}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProfileTypeCode#HighFrequencyTrader
 * ProfileTypeCode.HighFrequencyTrader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProfileTypeCode#MarketMaker
 * ProfileTypeCode.MarketMaker}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ProfileTypeCode#Hedge
 * ProfileTypeCode.Hedge}</li>
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ProfileTypeCode extends MMCode {

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
	public static final ProfileTypeCode Treasury = new ProfileTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Treasury";
			definition = "Trading system of federal securities in the retail market directly to the investor. The operation can be performed directly over the Internet.";
			owner_lazy = () -> com.tools20022.repository.codeset.ProfileTypeCode.mmObject();
			codeName = "TREA";
		}
	};
	/**
	 * Investors operating through algorithms and send orders automatically
	 * according to the strategies defined by their managers. Through this
	 * access model, the participants of these servers are hosted primarily
	 * within the premises of Brazilian Market and significantly reduce the time
	 * of submission of offers to trading systems.
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
	 * "Investors operating through algorithms and send orders automatically according to the strategies defined by their managers. Through this access model, the participants of these servers are hosted primarily within the premises of Brazilian Market and significantly reduce the time of submission of offers to trading systems."
	 * </li>
	 * </ul>
	 */
	public static final ProfileTypeCode HighFrequencyTrader = new ProfileTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HighFrequencyTrader";
			definition = "Investors operating through algorithms and send orders automatically according to the strategies defined by their managers. Through this access model, the participants of these servers are hosted primarily within the premises of Brazilian Market and significantly reduce the time of submission of offers to trading systems.";
			owner_lazy = () -> com.tools20022.repository.codeset.ProfileTypeCode.mmObject();
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
	public static final ProfileTypeCode MarketMaker = new ProfileTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketMaker";
			definition = "Agent liquidity, liquidity facilitator, promoter of business, specialist, market maker and liquidity provider are some designations given to those who propose to provide liquidity and minimum reference price for assets previously accredited, factors highlighted in the analysis of efficiency in capital markets.";
			owner_lazy = () -> com.tools20022.repository.codeset.ProfileTypeCode.mmObject();
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
	public static final ProfileTypeCode Hedge = new ProfileTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Hedge";
			definition = "Investor shares that uses defensive operations (hedging), thus avoiding the risk of large swings.";
			owner_lazy = () -> com.tools20022.repository.codeset.ProfileTypeCode.mmObject();
			codeName = "HEDG";
		}
	};
	final static private LinkedHashMap<String, ProfileTypeCode> codesByName = new LinkedHashMap<>();

	protected ProfileTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ProfileTypeCode";
				definition = "Specifies the type of profile.";
				derivation_lazy = () -> Arrays.asList(ProfileType1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ProfileTypeCode.Treasury, com.tools20022.repository.codeset.ProfileTypeCode.HighFrequencyTrader,
						com.tools20022.repository.codeset.ProfileTypeCode.MarketMaker, com.tools20022.repository.codeset.ProfileTypeCode.Hedge);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Treasury.getCodeName().get(), Treasury);
		codesByName.put(HighFrequencyTrader.getCodeName().get(), HighFrequencyTrader);
		codesByName.put(MarketMaker.getCodeName().get(), MarketMaker);
		codesByName.put(Hedge.getCodeName().get(), Hedge);
	}

	public static ProfileTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ProfileTypeCode[] values() {
		ProfileTypeCode[] values = new ProfileTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ProfileTypeCode> {
		@Override
		public ProfileTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ProfileTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}