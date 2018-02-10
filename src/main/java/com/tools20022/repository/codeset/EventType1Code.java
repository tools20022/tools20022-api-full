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
import com.tools20022.repository.codeset.EventType1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Identifies the type of event.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.EventType1Code#Put
 * EventType1Code.Put}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.EventType1Code#Call
 * EventType1Code.Call}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.EventType1Code#Tender
 * EventType1Code.Tender}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.EventType1Code#Activation
 * EventType1Code.Activation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EventType1Code#Inactivation
 * EventType1Code.Inactivation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EventType1Code#SinkingFundCall
 * EventType1Code.SinkingFundCall}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.EventTypeCode EventTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"PUT1"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "EventType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Identifies the type of event."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class EventType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EventType1Code
	 * EventType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Put"</li>
	 * </ul>
	 */
	public static final EventType1Code Put = new EventType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Put";
			owner_lazy = () -> com.tools20022.repository.codeset.EventType1Code.mmObject();
			codeName = EventTypeCode.Put.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EventType1Code
	 * EventType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Call"</li>
	 * </ul>
	 */
	public static final EventType1Code Call = new EventType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Call";
			owner_lazy = () -> com.tools20022.repository.codeset.EventType1Code.mmObject();
			codeName = EventTypeCode.Call.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EventType1Code
	 * EventType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Tender"</li>
	 * </ul>
	 */
	public static final EventType1Code Tender = new EventType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Tender";
			owner_lazy = () -> com.tools20022.repository.codeset.EventType1Code.mmObject();
			codeName = EventTypeCode.Tender.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EventType1Code
	 * EventType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Activation"</li>
	 * </ul>
	 */
	public static final EventType1Code Activation = new EventType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Activation";
			owner_lazy = () -> com.tools20022.repository.codeset.EventType1Code.mmObject();
			codeName = EventTypeCode.Activation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EventType1Code
	 * EventType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Inactivation"</li>
	 * </ul>
	 */
	public static final EventType1Code Inactivation = new EventType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Inactivation";
			owner_lazy = () -> com.tools20022.repository.codeset.EventType1Code.mmObject();
			codeName = EventTypeCode.Inactivation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EventType1Code
	 * EventType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SinkingFundCall"</li>
	 * </ul>
	 */
	public static final EventType1Code SinkingFundCall = new EventType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SinkingFundCall";
			owner_lazy = () -> com.tools20022.repository.codeset.EventType1Code.mmObject();
			codeName = EventTypeCode.SinkingFundCall.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, EventType1Code> codesByName = new LinkedHashMap<>();

	protected EventType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("PUT1");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "EventType1Code";
				definition = "Identifies the type of event.";
				trace_lazy = () -> EventTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.EventType1Code.Put, com.tools20022.repository.codeset.EventType1Code.Call, com.tools20022.repository.codeset.EventType1Code.Tender,
						com.tools20022.repository.codeset.EventType1Code.Activation, com.tools20022.repository.codeset.EventType1Code.Inactivation, com.tools20022.repository.codeset.EventType1Code.SinkingFundCall);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Put.getCodeName().get(), Put);
		codesByName.put(Call.getCodeName().get(), Call);
		codesByName.put(Tender.getCodeName().get(), Tender);
		codesByName.put(Activation.getCodeName().get(), Activation);
		codesByName.put(Inactivation.getCodeName().get(), Inactivation);
		codesByName.put(SinkingFundCall.getCodeName().get(), SinkingFundCall);
	}

	public static EventType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static EventType1Code[] values() {
		EventType1Code[] values = new EventType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, EventType1Code> {
		@Override
		public EventType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(EventType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}