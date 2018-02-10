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
import com.tools20022.repository.codeset.TradeRegulatoryConditions1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * indicates if the Trade Regulatory Conditions is solicited or not.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeRegulatoryConditions1Code#Solicited
 * TradeRegulatoryConditions1Code.Solicited}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeRegulatoryConditions1Code#Unsolicited
 * TradeRegulatoryConditions1Code.Unsolicited}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.TradeRegulatoryConditionsCode
 * TradeRegulatoryConditionsCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"SOLI"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TradeRegulatoryConditions1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "indicates if the Trade Regulatory Conditions is solicited or not."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TradeRegulatoryConditions1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeRegulatoryConditions1Code
	 * TradeRegulatoryConditions1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Solicited"</li>
	 * </ul>
	 */
	public static final TradeRegulatoryConditions1Code Solicited = new TradeRegulatoryConditions1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Solicited";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeRegulatoryConditions1Code.mmObject();
			codeName = TradeRegulatoryConditionsCode.Solicited.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeRegulatoryConditions1Code
	 * TradeRegulatoryConditions1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unsolicited"</li>
	 * </ul>
	 */
	public static final TradeRegulatoryConditions1Code Unsolicited = new TradeRegulatoryConditions1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unsolicited";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeRegulatoryConditions1Code.mmObject();
			codeName = TradeRegulatoryConditionsCode.Unsolicited.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, TradeRegulatoryConditions1Code> codesByName = new LinkedHashMap<>();

	protected TradeRegulatoryConditions1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("SOLI");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TradeRegulatoryConditions1Code";
				definition = "indicates if the Trade Regulatory Conditions is solicited or not.";
				trace_lazy = () -> TradeRegulatoryConditionsCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TradeRegulatoryConditions1Code.Solicited, com.tools20022.repository.codeset.TradeRegulatoryConditions1Code.Unsolicited);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Solicited.getCodeName().get(), Solicited);
		codesByName.put(Unsolicited.getCodeName().get(), Unsolicited);
	}

	public static TradeRegulatoryConditions1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TradeRegulatoryConditions1Code[] values() {
		TradeRegulatoryConditions1Code[] values = new TradeRegulatoryConditions1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TradeRegulatoryConditions1Code> {
		@Override
		public TradeRegulatoryConditions1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TradeRegulatoryConditions1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}