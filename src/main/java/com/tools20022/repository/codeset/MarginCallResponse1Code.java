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
import com.tools20022.repository.codeset.MarginCallResponse1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies whether the margin call request was sent on a non valuation day or
 * was received after notification time.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MarginCallResponse1Code#NonValuationDay
 * MarginCallResponse1Code.NonValuationDay}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MarginCallResponse1Code#ReceivedAfterNotificationTime
 * MarginCallResponse1Code.ReceivedAfterNotificationTime}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.MarginCallResponseCode
 * MarginCallResponseCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"NVDA"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MarginCallResponse1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies whether the margin call request was sent on a non valuation day or was received after notification time."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class MarginCallResponse1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MarginCallResponse1Code
	 * MarginCallResponse1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonValuationDay"</li>
	 * </ul>
	 */
	public static final MarginCallResponse1Code NonValuationDay = new MarginCallResponse1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonValuationDay";
			owner_lazy = () -> com.tools20022.repository.codeset.MarginCallResponse1Code.mmObject();
			codeName = MarginCallResponseCode.NonValuationDay.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MarginCallResponse1Code
	 * MarginCallResponse1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivedAfterNotificationTime"</li>
	 * </ul>
	 */
	public static final MarginCallResponse1Code ReceivedAfterNotificationTime = new MarginCallResponse1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivedAfterNotificationTime";
			owner_lazy = () -> com.tools20022.repository.codeset.MarginCallResponse1Code.mmObject();
			codeName = MarginCallResponseCode.ReceivedAfterNotificationTime.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, MarginCallResponse1Code> codesByName = new LinkedHashMap<>();

	protected MarginCallResponse1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("NVDA");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MarginCallResponse1Code";
				definition = "Specifies whether the margin call request was sent on a non valuation day or was received after notification time.";
				trace_lazy = () -> MarginCallResponseCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.MarginCallResponse1Code.NonValuationDay, com.tools20022.repository.codeset.MarginCallResponse1Code.ReceivedAfterNotificationTime);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(NonValuationDay.getCodeName().get(), NonValuationDay);
		codesByName.put(ReceivedAfterNotificationTime.getCodeName().get(), ReceivedAfterNotificationTime);
	}

	public static MarginCallResponse1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static MarginCallResponse1Code[] values() {
		MarginCallResponse1Code[] values = new MarginCallResponse1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, MarginCallResponse1Code> {
		@Override
		public MarginCallResponse1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(MarginCallResponse1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}