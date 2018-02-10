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
import com.tools20022.repository.codeset.EventFrequency5Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the regularity of an event.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.EventFrequency5Code#Annual
 * EventFrequency5Code.Annual}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EventFrequency5Code#SemiAnnual
 * EventFrequency5Code.SemiAnnual}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EventFrequency5Code#Quarterly
 * EventFrequency5Code.Quarterly}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EventFrequency5Code#Monthly
 * EventFrequency5Code.Monthly}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.EventFrequency5Code#Weekly
 * EventFrequency5Code.Weekly}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.EventFrequency5Code#Daily
 * EventFrequency5Code.Daily}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.EventFrequency5Code#Closed
 * EventFrequency5Code.Closed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EventFrequency5Code#EveryTwoMonths
 * EventFrequency5Code.EveryTwoMonths}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EventFrequency5Code#EveryTwoWeeks
 * EventFrequency5Code.EveryTwoWeeks}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EventFrequency5Code#TwiceAMonth
 * EventFrequency5Code.TwiceAMonth}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.EventFrequencyCode
 * EventFrequencyCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"YEAR"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "EventFrequency5Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the regularity of an event."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class EventFrequency5Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EventFrequency5Code
	 * EventFrequency5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Annual"</li>
	 * </ul>
	 */
	public static final EventFrequency5Code Annual = new EventFrequency5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Annual";
			owner_lazy = () -> com.tools20022.repository.codeset.EventFrequency5Code.mmObject();
			codeName = EventFrequencyCode.Annual.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EventFrequency5Code
	 * EventFrequency5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SemiAnnual"</li>
	 * </ul>
	 */
	public static final EventFrequency5Code SemiAnnual = new EventFrequency5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SemiAnnual";
			owner_lazy = () -> com.tools20022.repository.codeset.EventFrequency5Code.mmObject();
			codeName = EventFrequencyCode.SemiAnnual.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EventFrequency5Code
	 * EventFrequency5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Quarterly"</li>
	 * </ul>
	 */
	public static final EventFrequency5Code Quarterly = new EventFrequency5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Quarterly";
			owner_lazy = () -> com.tools20022.repository.codeset.EventFrequency5Code.mmObject();
			codeName = EventFrequencyCode.Quarterly.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EventFrequency5Code
	 * EventFrequency5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Monthly"</li>
	 * </ul>
	 */
	public static final EventFrequency5Code Monthly = new EventFrequency5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Monthly";
			owner_lazy = () -> com.tools20022.repository.codeset.EventFrequency5Code.mmObject();
			codeName = EventFrequencyCode.Monthly.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EventFrequency5Code
	 * EventFrequency5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Weekly"</li>
	 * </ul>
	 */
	public static final EventFrequency5Code Weekly = new EventFrequency5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Weekly";
			owner_lazy = () -> com.tools20022.repository.codeset.EventFrequency5Code.mmObject();
			codeName = EventFrequencyCode.Weekly.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EventFrequency5Code
	 * EventFrequency5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Daily"</li>
	 * </ul>
	 */
	public static final EventFrequency5Code Daily = new EventFrequency5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Daily";
			owner_lazy = () -> com.tools20022.repository.codeset.EventFrequency5Code.mmObject();
			codeName = EventFrequencyCode.Daily.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EventFrequency5Code
	 * EventFrequency5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Closed"</li>
	 * </ul>
	 */
	public static final EventFrequency5Code Closed = new EventFrequency5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Closed";
			owner_lazy = () -> com.tools20022.repository.codeset.EventFrequency5Code.mmObject();
			codeName = EventFrequencyCode.Closed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EventFrequency5Code
	 * EventFrequency5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EveryTwoMonths"</li>
	 * </ul>
	 */
	public static final EventFrequency5Code EveryTwoMonths = new EventFrequency5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EveryTwoMonths";
			owner_lazy = () -> com.tools20022.repository.codeset.EventFrequency5Code.mmObject();
			codeName = EventFrequencyCode.EveryTwoMonths.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EventFrequency5Code
	 * EventFrequency5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EveryTwoWeeks"</li>
	 * </ul>
	 */
	public static final EventFrequency5Code EveryTwoWeeks = new EventFrequency5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EveryTwoWeeks";
			owner_lazy = () -> com.tools20022.repository.codeset.EventFrequency5Code.mmObject();
			codeName = EventFrequencyCode.EveryTwoWeeks.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EventFrequency5Code
	 * EventFrequency5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwiceAMonth"</li>
	 * </ul>
	 */
	public static final EventFrequency5Code TwiceAMonth = new EventFrequency5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwiceAMonth";
			owner_lazy = () -> com.tools20022.repository.codeset.EventFrequency5Code.mmObject();
			codeName = EventFrequencyCode.TwiceAMonth.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, EventFrequency5Code> codesByName = new LinkedHashMap<>();

	protected EventFrequency5Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("YEAR");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "EventFrequency5Code";
				definition = "Specifies the regularity of an event.";
				trace_lazy = () -> EventFrequencyCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.EventFrequency5Code.Annual, com.tools20022.repository.codeset.EventFrequency5Code.SemiAnnual,
						com.tools20022.repository.codeset.EventFrequency5Code.Quarterly, com.tools20022.repository.codeset.EventFrequency5Code.Monthly, com.tools20022.repository.codeset.EventFrequency5Code.Weekly,
						com.tools20022.repository.codeset.EventFrequency5Code.Daily, com.tools20022.repository.codeset.EventFrequency5Code.Closed, com.tools20022.repository.codeset.EventFrequency5Code.EveryTwoMonths,
						com.tools20022.repository.codeset.EventFrequency5Code.EveryTwoWeeks, com.tools20022.repository.codeset.EventFrequency5Code.TwiceAMonth);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Annual.getCodeName().get(), Annual);
		codesByName.put(SemiAnnual.getCodeName().get(), SemiAnnual);
		codesByName.put(Quarterly.getCodeName().get(), Quarterly);
		codesByName.put(Monthly.getCodeName().get(), Monthly);
		codesByName.put(Weekly.getCodeName().get(), Weekly);
		codesByName.put(Daily.getCodeName().get(), Daily);
		codesByName.put(Closed.getCodeName().get(), Closed);
		codesByName.put(EveryTwoMonths.getCodeName().get(), EveryTwoMonths);
		codesByName.put(EveryTwoWeeks.getCodeName().get(), EveryTwoWeeks);
		codesByName.put(TwiceAMonth.getCodeName().get(), TwiceAMonth);
	}

	public static EventFrequency5Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static EventFrequency5Code[] values() {
		EventFrequency5Code[] values = new EventFrequency5Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, EventFrequency5Code> {
		@Override
		public EventFrequency5Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(EventFrequency5Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}