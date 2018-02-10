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
import com.tools20022.repository.codeset.ProfileType1Code.InternalXmlAdapter;
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
 * <li>{@linkplain com.tools20022.repository.codeset.ProfileType1Code#Hedge
 * ProfileType1Code.Hedge}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProfileType1Code#HighFrequencyTrader
 * ProfileType1Code.HighFrequencyTrader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProfileType1Code#MarketMaker
 * ProfileType1Code.MarketMaker}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ProfileType1Code#Treasury
 * ProfileType1Code.Treasury}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.ProfileTypeCode
 * ProfileTypeCode}</li>
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
 * "ProfileType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of profile."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ProfileType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProfileType1Code
	 * ProfileType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Hedge"</li>
	 * </ul>
	 */
	public static final ProfileType1Code Hedge = new ProfileType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Hedge";
			owner_lazy = () -> com.tools20022.repository.codeset.ProfileType1Code.mmObject();
			codeName = ProfileTypeCode.Hedge.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProfileType1Code
	 * ProfileType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HighFrequencyTrader"</li>
	 * </ul>
	 */
	public static final ProfileType1Code HighFrequencyTrader = new ProfileType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HighFrequencyTrader";
			owner_lazy = () -> com.tools20022.repository.codeset.ProfileType1Code.mmObject();
			codeName = ProfileTypeCode.HighFrequencyTrader.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProfileType1Code
	 * ProfileType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketMaker"</li>
	 * </ul>
	 */
	public static final ProfileType1Code MarketMaker = new ProfileType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketMaker";
			owner_lazy = () -> com.tools20022.repository.codeset.ProfileType1Code.mmObject();
			codeName = ProfileTypeCode.MarketMaker.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProfileType1Code
	 * ProfileType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Treasury"</li>
	 * </ul>
	 */
	public static final ProfileType1Code Treasury = new ProfileType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Treasury";
			owner_lazy = () -> com.tools20022.repository.codeset.ProfileType1Code.mmObject();
			codeName = ProfileTypeCode.Treasury.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, ProfileType1Code> codesByName = new LinkedHashMap<>();

	protected ProfileType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ProfileType1Code";
				definition = "Specifies the type of profile.";
				trace_lazy = () -> ProfileTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ProfileType1Code.Hedge, com.tools20022.repository.codeset.ProfileType1Code.HighFrequencyTrader,
						com.tools20022.repository.codeset.ProfileType1Code.MarketMaker, com.tools20022.repository.codeset.ProfileType1Code.Treasury);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Hedge.getCodeName().get(), Hedge);
		codesByName.put(HighFrequencyTrader.getCodeName().get(), HighFrequencyTrader);
		codesByName.put(MarketMaker.getCodeName().get(), MarketMaker);
		codesByName.put(Treasury.getCodeName().get(), Treasury);
	}

	public static ProfileType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ProfileType1Code[] values() {
		ProfileType1Code[] values = new ProfileType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ProfileType1Code> {
		@Override
		public ProfileType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ProfileType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}