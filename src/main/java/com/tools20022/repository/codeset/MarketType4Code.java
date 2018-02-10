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
import com.tools20022.repository.codeset.MarketType4Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of place where a trade was executed, a price was sourced
 * from, an instrument is listed.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.MarketType4Code#Fund
 * MarketType4Code.Fund}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MarketType4Code#LocalMarket
 * MarketType4Code.LocalMarket}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MarketType4Code#Theoretical
 * MarketType4Code.Theoretical}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.MarketType4Code#Vendor
 * MarketType4Code.Vendor}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.MarketTypeCode MarketTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"FUND"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MarketType4Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the type of place where a trade was executed, a price was sourced from, an instrument is listed."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class MarketType4Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MarketType4Code
	 * MarketType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Fund"</li>
	 * </ul>
	 */
	public static final MarketType4Code Fund = new MarketType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Fund";
			owner_lazy = () -> com.tools20022.repository.codeset.MarketType4Code.mmObject();
			codeName = MarketTypeCode.Fund.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MarketType4Code
	 * MarketType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LocalMarket"</li>
	 * </ul>
	 */
	public static final MarketType4Code LocalMarket = new MarketType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LocalMarket";
			owner_lazy = () -> com.tools20022.repository.codeset.MarketType4Code.mmObject();
			codeName = MarketTypeCode.LocalMarket.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MarketType4Code
	 * MarketType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Theoretical"</li>
	 * </ul>
	 */
	public static final MarketType4Code Theoretical = new MarketType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Theoretical";
			owner_lazy = () -> com.tools20022.repository.codeset.MarketType4Code.mmObject();
			codeName = MarketTypeCode.Theoretical.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MarketType4Code
	 * MarketType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Vendor"</li>
	 * </ul>
	 */
	public static final MarketType4Code Vendor = new MarketType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Vendor";
			owner_lazy = () -> com.tools20022.repository.codeset.MarketType4Code.mmObject();
			codeName = MarketTypeCode.Vendor.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, MarketType4Code> codesByName = new LinkedHashMap<>();

	protected MarketType4Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("FUND");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MarketType4Code";
				definition = "Specifies the type of place where a trade was executed, a price was sourced from, an instrument is listed.";
				trace_lazy = () -> MarketTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.MarketType4Code.Fund, com.tools20022.repository.codeset.MarketType4Code.LocalMarket, com.tools20022.repository.codeset.MarketType4Code.Theoretical,
						com.tools20022.repository.codeset.MarketType4Code.Vendor);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Fund.getCodeName().get(), Fund);
		codesByName.put(LocalMarket.getCodeName().get(), LocalMarket);
		codesByName.put(Theoretical.getCodeName().get(), Theoretical);
		codesByName.put(Vendor.getCodeName().get(), Vendor);
	}

	public static MarketType4Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static MarketType4Code[] values() {
		MarketType4Code[] values = new MarketType4Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, MarketType4Code> {
		@Override
		public MarketType4Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(MarketType4Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}