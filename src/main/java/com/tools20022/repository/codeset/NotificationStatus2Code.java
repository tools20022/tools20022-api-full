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
import com.tools20022.repository.codeset.NotificationStatus2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Status to define if the occurrence of the event contained in the notification
 * is confirmed or unconfirmed.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NotificationStatus2Code#EventConfirmed
 * NotificationStatus2Code.EventConfirmed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NotificationStatus2Code#EventUnconfirmed
 * NotificationStatus2Code.EventUnconfirmed}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.NotificationStatusCode
 * NotificationStatusCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"ECON"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "NotificationStatus2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Status to define if the occurrence of the event contained in the notification is confirmed or unconfirmed."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class NotificationStatus2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NotificationStatus2Code
	 * NotificationStatus2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventConfirmed"</li>
	 * </ul>
	 */
	public static final NotificationStatus2Code EventConfirmed = new NotificationStatus2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventConfirmed";
			owner_lazy = () -> com.tools20022.repository.codeset.NotificationStatus2Code.mmObject();
			codeName = NotificationStatusCode.EventConfirmed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NotificationStatus2Code
	 * NotificationStatus2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventUnconfirmed"</li>
	 * </ul>
	 */
	public static final NotificationStatus2Code EventUnconfirmed = new NotificationStatus2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventUnconfirmed";
			owner_lazy = () -> com.tools20022.repository.codeset.NotificationStatus2Code.mmObject();
			codeName = NotificationStatusCode.EventUnconfirmed.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, NotificationStatus2Code> codesByName = new LinkedHashMap<>();

	protected NotificationStatus2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("ECON");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "NotificationStatus2Code";
				definition = "Status to define if the occurrence of the event contained in the notification is confirmed or unconfirmed.";
				trace_lazy = () -> NotificationStatusCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.NotificationStatus2Code.EventConfirmed, com.tools20022.repository.codeset.NotificationStatus2Code.EventUnconfirmed);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(EventConfirmed.getCodeName().get(), EventConfirmed);
		codesByName.put(EventUnconfirmed.getCodeName().get(), EventUnconfirmed);
	}

	public static NotificationStatus2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static NotificationStatus2Code[] values() {
		NotificationStatus2Code[] values = new NotificationStatus2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, NotificationStatus2Code> {
		@Override
		public NotificationStatus2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(NotificationStatus2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}