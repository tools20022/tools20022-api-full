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
import com.tools20022.repository.codeset.TradingVenueCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of a trading venue.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradingVenueCode#NationalCompetentAuthority
 * TradingVenueCode.NationalCompetentAuthority}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradingVenueCode#ApprovedPublicationArrangement
 * TradingVenueCode.ApprovedPublicationArrangement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradingVenueCode#SystematicInternaliser
 * TradingVenueCode.SystematicInternaliser}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradingVenueCode#TradingVenue
 * TradingVenueCode.TradingVenue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradingVenueCode#MultilateralTradingFacility
 * TradingVenueCode.MultilateralTradingFacility}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradingVenueCode#OrganisedTradingFacility
 * TradingVenueCode.OrganisedTradingFacility}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradingVenueCode#ConsolidatedTapeProvider
 * TradingVenueCode.ConsolidatedTapeProvider}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradingVenueCode#RegulatedMarket
 * TradingVenueCode.RegulatedMarket}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.TradingVenue2Code
 * TradingVenue2Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TradingVenue1Code
 * TradingVenue1Code}</li>
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
 * "TradingVenueCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of a trading venue."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TradingVenueCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Organization that has the legally delegated or invested authority,
	 * capacity, or power to perform a designated function.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradingVenueCode
	 * TradingVenueCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NACA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NationalCompetentAuthority"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Organization that has the legally delegated or invested authority, capacity, or power to perform a designated function."
	 * </li>
	 * </ul>
	 */
	public static final TradingVenueCode NationalCompetentAuthority = new TradingVenueCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NationalCompetentAuthority";
			definition = "Organization that has the legally delegated or invested authority, capacity, or power to perform a designated function.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradingVenueCode.mmObject();
			codeName = "NACA";
		}
	};
	/**
	 * Person authorised under the provisions established in the regulation to
	 * provide the service of publishing trade reports on behalf of investment
	 * firms.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradingVenueCode
	 * TradingVenueCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "APPA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ApprovedPublicationArrangement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Person authorised under the provisions established in the regulation to provide the service of publishing trade reports on behalf of investment firms."
	 * </li>
	 * </ul>
	 */
	public static final TradingVenueCode ApprovedPublicationArrangement = new TradingVenueCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ApprovedPublicationArrangement";
			definition = "Person authorised under the provisions established in the regulation to provide the service of publishing trade reports on behalf of investment firms.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradingVenueCode.mmObject();
			codeName = "APPA";
		}
	};
	/**
	 * Investment firm which, on an organised, frequent systematic and
	 * substantial basis, deals on own account when executing client orders
	 * outside a regulated market, an multilateral trading facility or an
	 * organised trading facility without operating a multilateral system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradingVenueCode
	 * TradingVenueCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SINT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SystematicInternaliser"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Investment firm which, on an organised, frequent systematic and substantial basis, deals on own account when executing client orders outside a regulated market, an multilateral trading facility or an organised trading facility without operating a multilateral system."
	 * </li>
	 * </ul>
	 */
	public static final TradingVenueCode SystematicInternaliser = new TradingVenueCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SystematicInternaliser";
			definition = "Investment firm which, on an organised, frequent systematic and substantial basis, deals on own account when executing client orders outside a regulated market, an multilateral trading facility or an organised trading facility without operating a multilateral system.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradingVenueCode.mmObject();
			codeName = "SINT";
		}
	};
	/**
	 * Multilateral system in which multiple third-party buying and selling
	 * trading interests in financial instruments.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradingVenueCode
	 * TradingVenueCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TMIC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingVenue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Multilateral system in which multiple third-party buying and selling trading interests in financial instruments."
	 * </li>
	 * </ul>
	 */
	public static final TradingVenueCode TradingVenue = new TradingVenueCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingVenue";
			definition = "Multilateral system in which multiple third-party buying and selling trading interests in financial instruments.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradingVenueCode.mmObject();
			codeName = "TMIC";
		}
	};
	/**
	 * Multilateral system which brings together multiple third-party buying and
	 * selling interests in financial instruments in a way that results in a
	 * contract.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradingVenueCode
	 * TradingVenueCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MLTF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MultilateralTradingFacility"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Multilateral system which brings together multiple third-party buying and selling interests in financial instruments in a way that results in a contract."
	 * </li>
	 * </ul>
	 */
	public static final TradingVenueCode MultilateralTradingFacility = new TradingVenueCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MultilateralTradingFacility";
			definition = "Multilateral system which brings together multiple third-party buying and selling interests in financial instruments in a way that results in a contract.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradingVenueCode.mmObject();
			codeName = "MLTF";
		}
	};
	/**
	 * Multilateral system which is not a regulated market or multilateral
	 * trading facility in which multiple third-party buying and selling
	 * interests in bonds, structured finance products, emission allowances or
	 * derivatives are able to interact in a way that results in a contract.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradingVenueCode
	 * TradingVenueCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OTFS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrganisedTradingFacility"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Multilateral system which is not a regulated market or multilateral trading facility in which multiple third-party buying and selling interests in bonds, structured finance products, emission allowances or derivatives are able to interact in a way that results in a contract."
	 * </li>
	 * </ul>
	 */
	public static final TradingVenueCode OrganisedTradingFacility = new TradingVenueCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrganisedTradingFacility";
			definition = "Multilateral system which is not a regulated market or multilateral trading facility in which multiple third-party buying and selling interests in bonds, structured finance products, emission allowances or derivatives are able to interact in a way that results in a contract.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradingVenueCode.mmObject();
			codeName = "OTFS";
		}
	};
	/**
	 * Provider which will consolidate post-trade information into a continuous
	 * electronic data stream and make it publicly available as close to real
	 * time as technologically possible on a reasonable commercial basis and
	 * free of charge after 15 minutes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradingVenueCode
	 * TradingVenueCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CTPS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConsolidatedTapeProvider"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provider which will consolidate post-trade information into a continuous electronic data stream and make it publicly available as close to real time as technologically possible on a reasonable commercial basis and free of charge after 15 minutes."
	 * </li>
	 * </ul>
	 */
	public static final TradingVenueCode ConsolidatedTapeProvider = new TradingVenueCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConsolidatedTapeProvider";
			definition = "Provider which will consolidate post-trade information into a continuous electronic data stream and make it publicly available as close to real time as technologically possible on a reasonable commercial basis and free of charge after 15 minutes.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradingVenueCode.mmObject();
			codeName = "CTPS";
		}
	};
	/**
	 * Market on which financial instruments can be traded according to rules
	 * defined by the stock exchange.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradingVenueCode
	 * TradingVenueCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RMKT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegulatedMarket"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Market on which financial instruments can be traded according to rules defined by the stock exchange."
	 * </li>
	 * </ul>
	 */
	public static final TradingVenueCode RegulatedMarket = new TradingVenueCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegulatedMarket";
			definition = "Market on which financial instruments can be traded according to rules defined by the stock exchange.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradingVenueCode.mmObject();
			codeName = "RMKT";
		}
	};
	final static private LinkedHashMap<String, TradingVenueCode> codesByName = new LinkedHashMap<>();

	protected TradingVenueCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TradingVenueCode";
				definition = "Specifies the type of a trading venue.";
				derivation_lazy = () -> Arrays.asList(TradingVenue2Code.mmObject(), TradingVenue1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TradingVenueCode.NationalCompetentAuthority, com.tools20022.repository.codeset.TradingVenueCode.ApprovedPublicationArrangement,
						com.tools20022.repository.codeset.TradingVenueCode.SystematicInternaliser, com.tools20022.repository.codeset.TradingVenueCode.TradingVenue,
						com.tools20022.repository.codeset.TradingVenueCode.MultilateralTradingFacility, com.tools20022.repository.codeset.TradingVenueCode.OrganisedTradingFacility,
						com.tools20022.repository.codeset.TradingVenueCode.ConsolidatedTapeProvider, com.tools20022.repository.codeset.TradingVenueCode.RegulatedMarket);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(NationalCompetentAuthority.getCodeName().get(), NationalCompetentAuthority);
		codesByName.put(ApprovedPublicationArrangement.getCodeName().get(), ApprovedPublicationArrangement);
		codesByName.put(SystematicInternaliser.getCodeName().get(), SystematicInternaliser);
		codesByName.put(TradingVenue.getCodeName().get(), TradingVenue);
		codesByName.put(MultilateralTradingFacility.getCodeName().get(), MultilateralTradingFacility);
		codesByName.put(OrganisedTradingFacility.getCodeName().get(), OrganisedTradingFacility);
		codesByName.put(ConsolidatedTapeProvider.getCodeName().get(), ConsolidatedTapeProvider);
		codesByName.put(RegulatedMarket.getCodeName().get(), RegulatedMarket);
	}

	public static TradingVenueCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TradingVenueCode[] values() {
		TradingVenueCode[] values = new TradingVenueCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TradingVenueCode> {
		@Override
		public TradingVenueCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TradingVenueCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}