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
import com.tools20022.repository.codeset.EventFrequency1Code.InternalXmlAdapter;
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
 * <li>{@linkplain com.tools20022.repository.codeset.EventFrequency1Code#Annual
 * EventFrequency1Code.Annual}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EventFrequency1Code#SemiAnnual
 * EventFrequency1Code.SemiAnnual}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EventFrequency1Code#Quarterly
 * EventFrequency1Code.Quarterly}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EventFrequency1Code#EveryTwoMonths
 * EventFrequency1Code.EveryTwoMonths}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EventFrequency1Code#Monthly
 * EventFrequency1Code.Monthly}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EventFrequency1Code#TwiceAMonth
 * EventFrequency1Code.TwiceAMonth}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EventFrequency1Code#EveryTwoWeeks
 * EventFrequency1Code.EveryTwoWeeks}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.EventFrequency1Code#Weekly
 * EventFrequency1Code.Weekly}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.EventFrequency1Code#Daily
 * EventFrequency1Code.Daily}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.EventFrequency1Code#Adhoc
 * EventFrequency1Code.Adhoc}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EventFrequency1Code#IntraDay
 * EventFrequency1Code.IntraDay}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EventFrequency1Code#Overnight
 * EventFrequency1Code.Overnight}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EventFrequency1Code#OnDemand
 * EventFrequency1Code.OnDemand}</li>
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
 * "EventFrequency1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the regularity of an event."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.EventFrequency9Code
 * EventFrequency9Code}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class EventFrequency1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EventFrequency1Code
	 * EventFrequency1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Annual"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.EventFrequency9Code#Annual
	 * EventFrequency9Code.Annual}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final EventFrequency1Code Annual = new EventFrequency1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Annual";
			nextVersions_lazy = () -> Arrays.asList(EventFrequency9Code.Annual);
			owner_lazy = () -> com.tools20022.repository.codeset.EventFrequency1Code.mmObject();
			codeName = EventFrequencyCode.Annual.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EventFrequency1Code
	 * EventFrequency1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SemiAnnual"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.EventFrequency9Code#SemiAnnual
	 * EventFrequency9Code.SemiAnnual}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final EventFrequency1Code SemiAnnual = new EventFrequency1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SemiAnnual";
			nextVersions_lazy = () -> Arrays.asList(EventFrequency9Code.SemiAnnual);
			owner_lazy = () -> com.tools20022.repository.codeset.EventFrequency1Code.mmObject();
			codeName = EventFrequencyCode.SemiAnnual.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EventFrequency1Code
	 * EventFrequency1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Quarterly"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.EventFrequency9Code#Quarterly
	 * EventFrequency9Code.Quarterly}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final EventFrequency1Code Quarterly = new EventFrequency1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Quarterly";
			nextVersions_lazy = () -> Arrays.asList(EventFrequency9Code.Quarterly);
			owner_lazy = () -> com.tools20022.repository.codeset.EventFrequency1Code.mmObject();
			codeName = EventFrequencyCode.Quarterly.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EventFrequency1Code
	 * EventFrequency1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EveryTwoMonths"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.EventFrequency9Code#EveryTwoMonths
	 * EventFrequency9Code.EveryTwoMonths}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final EventFrequency1Code EveryTwoMonths = new EventFrequency1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EveryTwoMonths";
			nextVersions_lazy = () -> Arrays.asList(EventFrequency9Code.EveryTwoMonths);
			owner_lazy = () -> com.tools20022.repository.codeset.EventFrequency1Code.mmObject();
			codeName = EventFrequencyCode.EveryTwoMonths.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EventFrequency1Code
	 * EventFrequency1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Monthly"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.EventFrequency9Code#Monthly
	 * EventFrequency9Code.Monthly}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final EventFrequency1Code Monthly = new EventFrequency1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Monthly";
			nextVersions_lazy = () -> Arrays.asList(EventFrequency9Code.Monthly);
			owner_lazy = () -> com.tools20022.repository.codeset.EventFrequency1Code.mmObject();
			codeName = EventFrequencyCode.Monthly.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EventFrequency1Code
	 * EventFrequency1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwiceAMonth"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.EventFrequency9Code#TwiceAMonth
	 * EventFrequency9Code.TwiceAMonth}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final EventFrequency1Code TwiceAMonth = new EventFrequency1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwiceAMonth";
			nextVersions_lazy = () -> Arrays.asList(EventFrequency9Code.TwiceAMonth);
			owner_lazy = () -> com.tools20022.repository.codeset.EventFrequency1Code.mmObject();
			codeName = EventFrequencyCode.TwiceAMonth.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EventFrequency1Code
	 * EventFrequency1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EveryTwoWeeks"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.EventFrequency9Code#EveryTwoWeeks
	 * EventFrequency9Code.EveryTwoWeeks}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final EventFrequency1Code EveryTwoWeeks = new EventFrequency1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EveryTwoWeeks";
			nextVersions_lazy = () -> Arrays.asList(EventFrequency9Code.EveryTwoWeeks);
			owner_lazy = () -> com.tools20022.repository.codeset.EventFrequency1Code.mmObject();
			codeName = EventFrequencyCode.EveryTwoWeeks.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EventFrequency1Code
	 * EventFrequency1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Weekly"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.EventFrequency9Code#Weekly
	 * EventFrequency9Code.Weekly}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final EventFrequency1Code Weekly = new EventFrequency1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Weekly";
			nextVersions_lazy = () -> Arrays.asList(EventFrequency9Code.Weekly);
			owner_lazy = () -> com.tools20022.repository.codeset.EventFrequency1Code.mmObject();
			codeName = EventFrequencyCode.Weekly.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EventFrequency1Code
	 * EventFrequency1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Daily"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.EventFrequency9Code#Daily
	 * EventFrequency9Code.Daily}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final EventFrequency1Code Daily = new EventFrequency1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Daily";
			nextVersions_lazy = () -> Arrays.asList(EventFrequency9Code.Daily);
			owner_lazy = () -> com.tools20022.repository.codeset.EventFrequency1Code.mmObject();
			codeName = EventFrequencyCode.Daily.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EventFrequency1Code
	 * EventFrequency1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Adhoc"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.EventFrequency9Code#Adhoc
	 * EventFrequency9Code.Adhoc}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final EventFrequency1Code Adhoc = new EventFrequency1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Adhoc";
			nextVersions_lazy = () -> Arrays.asList(EventFrequency9Code.Adhoc);
			owner_lazy = () -> com.tools20022.repository.codeset.EventFrequency1Code.mmObject();
			codeName = EventFrequencyCode.Adhoc.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EventFrequency1Code
	 * EventFrequency1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntraDay"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.EventFrequency9Code#IntraDay
	 * EventFrequency9Code.IntraDay}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final EventFrequency1Code IntraDay = new EventFrequency1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntraDay";
			nextVersions_lazy = () -> Arrays.asList(EventFrequency9Code.IntraDay);
			owner_lazy = () -> com.tools20022.repository.codeset.EventFrequency1Code.mmObject();
			codeName = EventFrequencyCode.IntraDay.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EventFrequency1Code
	 * EventFrequency1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Overnight"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.EventFrequency9Code#Overnight
	 * EventFrequency9Code.Overnight}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final EventFrequency1Code Overnight = new EventFrequency1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Overnight";
			nextVersions_lazy = () -> Arrays.asList(EventFrequency9Code.Overnight);
			owner_lazy = () -> com.tools20022.repository.codeset.EventFrequency1Code.mmObject();
			codeName = EventFrequencyCode.Overnight.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EventFrequency1Code
	 * EventFrequency1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OnDemand"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.EventFrequency9Code#OnDemand
	 * EventFrequency9Code.OnDemand}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final EventFrequency1Code OnDemand = new EventFrequency1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OnDemand";
			nextVersions_lazy = () -> Arrays.asList(EventFrequency9Code.OnDemand);
			owner_lazy = () -> com.tools20022.repository.codeset.EventFrequency1Code.mmObject();
			codeName = EventFrequencyCode.OnDemand.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, EventFrequency1Code> codesByName = new LinkedHashMap<>();

	protected EventFrequency1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("YEAR");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "EventFrequency1Code";
				definition = "Specifies the regularity of an event.";
				nextVersions_lazy = () -> Arrays.asList(EventFrequency9Code.mmObject());
				trace_lazy = () -> EventFrequencyCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.EventFrequency1Code.Annual, com.tools20022.repository.codeset.EventFrequency1Code.SemiAnnual,
						com.tools20022.repository.codeset.EventFrequency1Code.Quarterly, com.tools20022.repository.codeset.EventFrequency1Code.EveryTwoMonths, com.tools20022.repository.codeset.EventFrequency1Code.Monthly,
						com.tools20022.repository.codeset.EventFrequency1Code.TwiceAMonth, com.tools20022.repository.codeset.EventFrequency1Code.EveryTwoWeeks, com.tools20022.repository.codeset.EventFrequency1Code.Weekly,
						com.tools20022.repository.codeset.EventFrequency1Code.Daily, com.tools20022.repository.codeset.EventFrequency1Code.Adhoc, com.tools20022.repository.codeset.EventFrequency1Code.IntraDay,
						com.tools20022.repository.codeset.EventFrequency1Code.Overnight, com.tools20022.repository.codeset.EventFrequency1Code.OnDemand);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Annual.getCodeName().get(), Annual);
		codesByName.put(SemiAnnual.getCodeName().get(), SemiAnnual);
		codesByName.put(Quarterly.getCodeName().get(), Quarterly);
		codesByName.put(EveryTwoMonths.getCodeName().get(), EveryTwoMonths);
		codesByName.put(Monthly.getCodeName().get(), Monthly);
		codesByName.put(TwiceAMonth.getCodeName().get(), TwiceAMonth);
		codesByName.put(EveryTwoWeeks.getCodeName().get(), EveryTwoWeeks);
		codesByName.put(Weekly.getCodeName().get(), Weekly);
		codesByName.put(Daily.getCodeName().get(), Daily);
		codesByName.put(Adhoc.getCodeName().get(), Adhoc);
		codesByName.put(IntraDay.getCodeName().get(), IntraDay);
		codesByName.put(Overnight.getCodeName().get(), Overnight);
		codesByName.put(OnDemand.getCodeName().get(), OnDemand);
	}

	public static EventFrequency1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static EventFrequency1Code[] values() {
		EventFrequency1Code[] values = new EventFrequency1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, EventFrequency1Code> {
		@Override
		public EventFrequency1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(EventFrequency1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}