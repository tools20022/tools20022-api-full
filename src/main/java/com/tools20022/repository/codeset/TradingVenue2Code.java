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
import com.tools20022.repository.codeset.TradingVenue2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of a trading venue which can submit the report.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradingVenue2Code#ApprovedPublicationArrangement
 * TradingVenue2Code.ApprovedPublicationArrangement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradingVenue2Code#ConsolidatedTapeProvider
 * TradingVenue2Code.ConsolidatedTapeProvider}</li>
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
 * "TradingVenue2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the type of a trading venue which can submit the report."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TradingVenue2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradingVenue2Code
	 * TradingVenue2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ApprovedPublicationArrangement"</li>
	 * </ul>
	 */
	public static final TradingVenue2Code ApprovedPublicationArrangement = new TradingVenue2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ApprovedPublicationArrangement";
			owner_lazy = () -> com.tools20022.repository.codeset.TradingVenue2Code.mmObject();
			codeName = TradingVenueCode.ApprovedPublicationArrangement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradingVenue2Code
	 * TradingVenue2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConsolidatedTapeProvider"</li>
	 * </ul>
	 */
	public static final TradingVenue2Code ConsolidatedTapeProvider = new TradingVenue2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConsolidatedTapeProvider";
			owner_lazy = () -> com.tools20022.repository.codeset.TradingVenue2Code.mmObject();
			codeName = TradingVenueCode.ConsolidatedTapeProvider.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, TradingVenue2Code> codesByName = new LinkedHashMap<>();

	protected TradingVenue2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TradingVenue2Code";
				definition = "Specifies the type of a trading venue which can submit the report.";
				trace_lazy = () -> TradingVenueCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TradingVenue2Code.ApprovedPublicationArrangement, com.tools20022.repository.codeset.TradingVenue2Code.ConsolidatedTapeProvider);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(ApprovedPublicationArrangement.getCodeName().get(), ApprovedPublicationArrangement);
		codesByName.put(ConsolidatedTapeProvider.getCodeName().get(), ConsolidatedTapeProvider);
	}

	public static TradingVenue2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TradingVenue2Code[] values() {
		TradingVenue2Code[] values = new TradingVenue2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TradingVenue2Code> {
		@Override
		public TradingVenue2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TradingVenue2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}