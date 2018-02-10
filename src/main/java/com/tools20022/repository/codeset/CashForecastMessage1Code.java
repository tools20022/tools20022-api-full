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
import com.tools20022.repository.codeset.CashForecastMessage1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the fund cash forecast message.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashForecastMessage1Code#Estimated
 * CashForecastMessage1Code.Estimated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashForecastMessage1Code#EstimatedDetailed
 * CashForecastMessage1Code.EstimatedDetailed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashForecastMessage1Code#Confirmed
 * CashForecastMessage1Code.Confirmed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashForecastMessage1Code#CornfirmedDetailed
 * CashForecastMessage1Code.CornfirmedDetailed}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.MessageTypeCode
 * MessageTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"CF40"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CashForecastMessage1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the fund cash forecast message."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CashForecastMessage1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashForecastMessage1Code
	 * CashForecastMessage1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Estimated"</li>
	 * </ul>
	 */
	public static final CashForecastMessage1Code Estimated = new CashForecastMessage1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Estimated";
			owner_lazy = () -> com.tools20022.repository.codeset.CashForecastMessage1Code.mmObject();
			codeName = MessageTypeCode.Estimated.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashForecastMessage1Code
	 * CashForecastMessage1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EstimatedDetailed"</li>
	 * </ul>
	 */
	public static final CashForecastMessage1Code EstimatedDetailed = new CashForecastMessage1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EstimatedDetailed";
			owner_lazy = () -> com.tools20022.repository.codeset.CashForecastMessage1Code.mmObject();
			codeName = MessageTypeCode.EstimatedDetailed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashForecastMessage1Code
	 * CashForecastMessage1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Confirmed"</li>
	 * </ul>
	 */
	public static final CashForecastMessage1Code Confirmed = new CashForecastMessage1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Confirmed";
			owner_lazy = () -> com.tools20022.repository.codeset.CashForecastMessage1Code.mmObject();
			codeName = MessageTypeCode.Confirmed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashForecastMessage1Code
	 * CashForecastMessage1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CornfirmedDetailed"</li>
	 * </ul>
	 */
	public static final CashForecastMessage1Code CornfirmedDetailed = new CashForecastMessage1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CornfirmedDetailed";
			owner_lazy = () -> com.tools20022.repository.codeset.CashForecastMessage1Code.mmObject();
			codeName = MessageTypeCode.CornfirmedDetailed.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, CashForecastMessage1Code> codesByName = new LinkedHashMap<>();

	protected CashForecastMessage1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("CF40");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CashForecastMessage1Code";
				definition = "Specifies the fund cash forecast message.";
				trace_lazy = () -> MessageTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CashForecastMessage1Code.Estimated, com.tools20022.repository.codeset.CashForecastMessage1Code.EstimatedDetailed,
						com.tools20022.repository.codeset.CashForecastMessage1Code.Confirmed, com.tools20022.repository.codeset.CashForecastMessage1Code.CornfirmedDetailed);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Estimated.getCodeName().get(), Estimated);
		codesByName.put(EstimatedDetailed.getCodeName().get(), EstimatedDetailed);
		codesByName.put(Confirmed.getCodeName().get(), Confirmed);
		codesByName.put(CornfirmedDetailed.getCodeName().get(), CornfirmedDetailed);
	}

	public static CashForecastMessage1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CashForecastMessage1Code[] values() {
		CashForecastMessage1Code[] values = new CashForecastMessage1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CashForecastMessage1Code> {
		@Override
		public CashForecastMessage1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CashForecastMessage1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}