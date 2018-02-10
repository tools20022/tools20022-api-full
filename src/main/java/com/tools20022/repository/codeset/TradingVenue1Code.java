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
import com.tools20022.repository.codeset.TradingVenue1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of a trading venue which must use the market
 * identification code (MIC).
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradingVenue1Code#SystematicInternaliser
 * TradingVenue1Code.SystematicInternaliser}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradingVenue1Code#MultilateralTradingFacility
 * TradingVenue1Code.MultilateralTradingFacility}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradingVenue1Code#OrganisedTradingFacility
 * TradingVenue1Code.OrganisedTradingFacility}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradingVenue1Code#RegulatedMarket
 * TradingVenue1Code.RegulatedMarket}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.TradingVenueCode
 * TradingVenueCode}</li>
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
 * "TradingVenue1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the type of a trading venue which must use the market identification code (MIC)."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TradingVenue1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradingVenue1Code
	 * TradingVenue1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SystematicInternaliser"</li>
	 * </ul>
	 */
	public static final TradingVenue1Code SystematicInternaliser = new TradingVenue1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SystematicInternaliser";
			owner_lazy = () -> com.tools20022.repository.codeset.TradingVenue1Code.mmObject();
			codeName = TradingVenueCode.SystematicInternaliser.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradingVenue1Code
	 * TradingVenue1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MultilateralTradingFacility"</li>
	 * </ul>
	 */
	public static final TradingVenue1Code MultilateralTradingFacility = new TradingVenue1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MultilateralTradingFacility";
			owner_lazy = () -> com.tools20022.repository.codeset.TradingVenue1Code.mmObject();
			codeName = TradingVenueCode.MultilateralTradingFacility.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradingVenue1Code
	 * TradingVenue1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrganisedTradingFacility"</li>
	 * </ul>
	 */
	public static final TradingVenue1Code OrganisedTradingFacility = new TradingVenue1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrganisedTradingFacility";
			owner_lazy = () -> com.tools20022.repository.codeset.TradingVenue1Code.mmObject();
			codeName = TradingVenueCode.OrganisedTradingFacility.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradingVenue1Code
	 * TradingVenue1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegulatedMarket"</li>
	 * </ul>
	 */
	public static final TradingVenue1Code RegulatedMarket = new TradingVenue1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegulatedMarket";
			owner_lazy = () -> com.tools20022.repository.codeset.TradingVenue1Code.mmObject();
			codeName = TradingVenueCode.RegulatedMarket.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, TradingVenue1Code> codesByName = new LinkedHashMap<>();

	protected TradingVenue1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TradingVenue1Code";
				definition = "Specifies the type of a trading venue which must use the market identification code (MIC).";
				trace_lazy = () -> TradingVenueCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TradingVenue1Code.SystematicInternaliser, com.tools20022.repository.codeset.TradingVenue1Code.MultilateralTradingFacility,
						com.tools20022.repository.codeset.TradingVenue1Code.OrganisedTradingFacility, com.tools20022.repository.codeset.TradingVenue1Code.RegulatedMarket);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(SystematicInternaliser.getCodeName().get(), SystematicInternaliser);
		codesByName.put(MultilateralTradingFacility.getCodeName().get(), MultilateralTradingFacility);
		codesByName.put(OrganisedTradingFacility.getCodeName().get(), OrganisedTradingFacility);
		codesByName.put(RegulatedMarket.getCodeName().get(), RegulatedMarket);
	}

	public static TradingVenue1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TradingVenue1Code[] values() {
		TradingVenue1Code[] values = new TradingVenue1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TradingVenue1Code> {
		@Override
		public TradingVenue1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TradingVenue1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}