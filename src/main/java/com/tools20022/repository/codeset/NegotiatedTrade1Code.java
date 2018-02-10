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
import com.tools20022.repository.codeset.NegotiatedTrade1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies whether the trade is negotiated.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NegotiatedTrade1Code#Negotiated
 * NegotiatedTrade1Code.Negotiated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NegotiatedTrade1Code#NotNegotiated
 * NegotiatedTrade1Code.NotNegotiated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NegotiatedTrade1Code#Unknown
 * NegotiatedTrade1Code.Unknown}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.NegotiatedTradeCode
 * NegotiatedTradeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"NEGO"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "NegotiatedTrade1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies whether the trade is negotiated."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class NegotiatedTrade1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NegotiatedTrade1Code
	 * NegotiatedTrade1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Negotiated"</li>
	 * </ul>
	 */
	public static final NegotiatedTrade1Code Negotiated = new NegotiatedTrade1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Negotiated";
			owner_lazy = () -> com.tools20022.repository.codeset.NegotiatedTrade1Code.mmObject();
			codeName = NegotiatedTradeCode.Negotiated.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NegotiatedTrade1Code
	 * NegotiatedTrade1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotNegotiated"</li>
	 * </ul>
	 */
	public static final NegotiatedTrade1Code NotNegotiated = new NegotiatedTrade1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotNegotiated";
			owner_lazy = () -> com.tools20022.repository.codeset.NegotiatedTrade1Code.mmObject();
			codeName = NegotiatedTradeCode.NotNegotiated.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NegotiatedTrade1Code
	 * NegotiatedTrade1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unknown"</li>
	 * </ul>
	 */
	public static final NegotiatedTrade1Code Unknown = new NegotiatedTrade1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unknown";
			owner_lazy = () -> com.tools20022.repository.codeset.NegotiatedTrade1Code.mmObject();
			codeName = NegotiatedTradeCode.Unknown.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, NegotiatedTrade1Code> codesByName = new LinkedHashMap<>();

	protected NegotiatedTrade1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("NEGO");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "NegotiatedTrade1Code";
				definition = "Specifies whether the trade is negotiated.";
				trace_lazy = () -> NegotiatedTradeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.NegotiatedTrade1Code.Negotiated, com.tools20022.repository.codeset.NegotiatedTrade1Code.NotNegotiated,
						com.tools20022.repository.codeset.NegotiatedTrade1Code.Unknown);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Negotiated.getCodeName().get(), Negotiated);
		codesByName.put(NotNegotiated.getCodeName().get(), NotNegotiated);
		codesByName.put(Unknown.getCodeName().get(), Unknown);
	}

	public static NegotiatedTrade1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static NegotiatedTrade1Code[] values() {
		NegotiatedTrade1Code[] values = new NegotiatedTrade1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, NegotiatedTrade1Code> {
		@Override
		public NegotiatedTrade1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(NegotiatedTrade1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}