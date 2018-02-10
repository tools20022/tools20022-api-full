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
import com.tools20022.repository.codeset.TradePosting1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the trade is maintained as a separate individual position in the
 * clearing account, or not.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.TradePosting1Code#Gross
 * TradePosting1Code.Gross}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TradePosting1Code#Net
 * TradePosting1Code.Net}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.TradePostingCode
 * TradePostingCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"GROS"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TradePosting1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the trade is maintained as a separate individual position in the clearing account, or not."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TradePosting1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradePosting1Code
	 * TradePosting1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Gross"</li>
	 * </ul>
	 */
	public static final TradePosting1Code Gross = new TradePosting1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Gross";
			owner_lazy = () -> com.tools20022.repository.codeset.TradePosting1Code.mmObject();
			codeName = TradePostingCode.Gross.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradePosting1Code
	 * TradePosting1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Net"</li>
	 * </ul>
	 */
	public static final TradePosting1Code Net = new TradePosting1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Net";
			owner_lazy = () -> com.tools20022.repository.codeset.TradePosting1Code.mmObject();
			codeName = TradePostingCode.Net.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, TradePosting1Code> codesByName = new LinkedHashMap<>();

	protected TradePosting1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("GROS");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TradePosting1Code";
				definition = "Specifies the trade is maintained as a separate individual position in the clearing account, or not.";
				trace_lazy = () -> TradePostingCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TradePosting1Code.Gross, com.tools20022.repository.codeset.TradePosting1Code.Net);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Gross.getCodeName().get(), Gross);
		codesByName.put(Net.getCodeName().get(), Net);
	}

	public static TradePosting1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TradePosting1Code[] values() {
		TradePosting1Code[] values = new TradePosting1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TradePosting1Code> {
		@Override
		public TradePosting1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TradePosting1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}