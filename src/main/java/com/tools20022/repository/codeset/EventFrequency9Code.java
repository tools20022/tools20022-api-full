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
import com.tools20022.repository.codeset.EventFrequency9Code.InternalXmlAdapter;
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
 * <li>{@linkplain com.tools20022.repository.codeset.EventFrequency9Code#Annual
 * EventFrequency9Code.Annual}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EventFrequency9Code#SemiAnnual
 * EventFrequency9Code.SemiAnnual}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EventFrequency9Code#Quarterly
 * EventFrequency9Code.Quarterly}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EventFrequency9Code#EveryTwoMonths
 * EventFrequency9Code.EveryTwoMonths}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EventFrequency9Code#Monthly
 * EventFrequency9Code.Monthly}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EventFrequency9Code#TwiceAMonth
 * EventFrequency9Code.TwiceAMonth}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EventFrequency9Code#EveryTwoWeeks
 * EventFrequency9Code.EveryTwoWeeks}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.EventFrequency9Code#Weekly
 * EventFrequency9Code.Weekly}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.EventFrequency9Code#Daily
 * EventFrequency9Code.Daily}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.EventFrequency9Code#Adhoc
 * EventFrequency9Code.Adhoc}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EventFrequency9Code#IntraDay
 * EventFrequency9Code.IntraDay}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EventFrequency9Code#Overnight
 * EventFrequency9Code.Overnight}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EventFrequency9Code#OnDemand
 * EventFrequency9Code.OnDemand}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.EventFrequency9Code#None
 * EventFrequency9Code.None}</li>
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
 * "EventFrequency9Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the regularity of an event."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.codeset.EventFrequency1Code
 * EventFrequency1Code}</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class EventFrequency9Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EventFrequency9Code
	 * EventFrequency9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Annual"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.EventFrequency1Code#Annual
	 * EventFrequency1Code.Annual}</li>
	 * </ul>
	 */
	public static final EventFrequency9Code Annual = new EventFrequency9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Annual";
			previousVersion_lazy = () -> EventFrequency1Code.Annual;
			owner_lazy = () -> com.tools20022.repository.codeset.EventFrequency9Code.mmObject();
			codeName = EventFrequencyCode.Annual.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EventFrequency9Code
	 * EventFrequency9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SemiAnnual"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.EventFrequency1Code#SemiAnnual
	 * EventFrequency1Code.SemiAnnual}</li>
	 * </ul>
	 */
	public static final EventFrequency9Code SemiAnnual = new EventFrequency9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SemiAnnual";
			previousVersion_lazy = () -> EventFrequency1Code.SemiAnnual;
			owner_lazy = () -> com.tools20022.repository.codeset.EventFrequency9Code.mmObject();
			codeName = EventFrequencyCode.SemiAnnual.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EventFrequency9Code
	 * EventFrequency9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Quarterly"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.EventFrequency1Code#Quarterly
	 * EventFrequency1Code.Quarterly}</li>
	 * </ul>
	 */
	public static final EventFrequency9Code Quarterly = new EventFrequency9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Quarterly";
			previousVersion_lazy = () -> EventFrequency1Code.Quarterly;
			owner_lazy = () -> com.tools20022.repository.codeset.EventFrequency9Code.mmObject();
			codeName = EventFrequencyCode.Quarterly.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EventFrequency9Code
	 * EventFrequency9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EveryTwoMonths"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.EventFrequency1Code#EveryTwoMonths
	 * EventFrequency1Code.EveryTwoMonths}</li>
	 * </ul>
	 */
	public static final EventFrequency9Code EveryTwoMonths = new EventFrequency9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EveryTwoMonths";
			previousVersion_lazy = () -> EventFrequency1Code.EveryTwoMonths;
			owner_lazy = () -> com.tools20022.repository.codeset.EventFrequency9Code.mmObject();
			codeName = EventFrequencyCode.EveryTwoMonths.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EventFrequency9Code
	 * EventFrequency9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Monthly"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.EventFrequency1Code#Monthly
	 * EventFrequency1Code.Monthly}</li>
	 * </ul>
	 */
	public static final EventFrequency9Code Monthly = new EventFrequency9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Monthly";
			previousVersion_lazy = () -> EventFrequency1Code.Monthly;
			owner_lazy = () -> com.tools20022.repository.codeset.EventFrequency9Code.mmObject();
			codeName = EventFrequencyCode.Monthly.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EventFrequency9Code
	 * EventFrequency9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwiceAMonth"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.EventFrequency1Code#TwiceAMonth
	 * EventFrequency1Code.TwiceAMonth}</li>
	 * </ul>
	 */
	public static final EventFrequency9Code TwiceAMonth = new EventFrequency9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwiceAMonth";
			previousVersion_lazy = () -> EventFrequency1Code.TwiceAMonth;
			owner_lazy = () -> com.tools20022.repository.codeset.EventFrequency9Code.mmObject();
			codeName = EventFrequencyCode.TwiceAMonth.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EventFrequency9Code
	 * EventFrequency9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EveryTwoWeeks"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.EventFrequency1Code#EveryTwoWeeks
	 * EventFrequency1Code.EveryTwoWeeks}</li>
	 * </ul>
	 */
	public static final EventFrequency9Code EveryTwoWeeks = new EventFrequency9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EveryTwoWeeks";
			previousVersion_lazy = () -> EventFrequency1Code.EveryTwoWeeks;
			owner_lazy = () -> com.tools20022.repository.codeset.EventFrequency9Code.mmObject();
			codeName = EventFrequencyCode.EveryTwoWeeks.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EventFrequency9Code
	 * EventFrequency9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Weekly"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.EventFrequency1Code#Weekly
	 * EventFrequency1Code.Weekly}</li>
	 * </ul>
	 */
	public static final EventFrequency9Code Weekly = new EventFrequency9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Weekly";
			previousVersion_lazy = () -> EventFrequency1Code.Weekly;
			owner_lazy = () -> com.tools20022.repository.codeset.EventFrequency9Code.mmObject();
			codeName = EventFrequencyCode.Weekly.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EventFrequency9Code
	 * EventFrequency9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Daily"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.EventFrequency1Code#Daily
	 * EventFrequency1Code.Daily}</li>
	 * </ul>
	 */
	public static final EventFrequency9Code Daily = new EventFrequency9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Daily";
			previousVersion_lazy = () -> EventFrequency1Code.Daily;
			owner_lazy = () -> com.tools20022.repository.codeset.EventFrequency9Code.mmObject();
			codeName = EventFrequencyCode.Daily.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EventFrequency9Code
	 * EventFrequency9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Adhoc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.EventFrequency1Code#Adhoc
	 * EventFrequency1Code.Adhoc}</li>
	 * </ul>
	 */
	public static final EventFrequency9Code Adhoc = new EventFrequency9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Adhoc";
			previousVersion_lazy = () -> EventFrequency1Code.Adhoc;
			owner_lazy = () -> com.tools20022.repository.codeset.EventFrequency9Code.mmObject();
			codeName = EventFrequencyCode.Adhoc.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EventFrequency9Code
	 * EventFrequency9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntraDay"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.EventFrequency1Code#IntraDay
	 * EventFrequency1Code.IntraDay}</li>
	 * </ul>
	 */
	public static final EventFrequency9Code IntraDay = new EventFrequency9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntraDay";
			previousVersion_lazy = () -> EventFrequency1Code.IntraDay;
			owner_lazy = () -> com.tools20022.repository.codeset.EventFrequency9Code.mmObject();
			codeName = EventFrequencyCode.IntraDay.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EventFrequency9Code
	 * EventFrequency9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Overnight"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.EventFrequency1Code#Overnight
	 * EventFrequency1Code.Overnight}</li>
	 * </ul>
	 */
	public static final EventFrequency9Code Overnight = new EventFrequency9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Overnight";
			previousVersion_lazy = () -> EventFrequency1Code.Overnight;
			owner_lazy = () -> com.tools20022.repository.codeset.EventFrequency9Code.mmObject();
			codeName = EventFrequencyCode.Overnight.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EventFrequency9Code
	 * EventFrequency9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OnDemand"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.EventFrequency1Code#OnDemand
	 * EventFrequency1Code.OnDemand}</li>
	 * </ul>
	 */
	public static final EventFrequency9Code OnDemand = new EventFrequency9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OnDemand";
			previousVersion_lazy = () -> EventFrequency1Code.OnDemand;
			owner_lazy = () -> com.tools20022.repository.codeset.EventFrequency9Code.mmObject();
			codeName = EventFrequencyCode.OnDemand.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EventFrequency9Code
	 * EventFrequency9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "None"</li>
	 * </ul>
	 */
	public static final EventFrequency9Code None = new EventFrequency9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "None";
			owner_lazy = () -> com.tools20022.repository.codeset.EventFrequency9Code.mmObject();
			codeName = EventFrequencyCode.None.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, EventFrequency9Code> codesByName = new LinkedHashMap<>();

	protected EventFrequency9Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("YEAR");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "EventFrequency9Code";
				definition = "Specifies the regularity of an event.";
				previousVersion_lazy = () -> EventFrequency1Code.mmObject();
				trace_lazy = () -> EventFrequencyCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.EventFrequency9Code.Annual, com.tools20022.repository.codeset.EventFrequency9Code.SemiAnnual,
						com.tools20022.repository.codeset.EventFrequency9Code.Quarterly, com.tools20022.repository.codeset.EventFrequency9Code.EveryTwoMonths, com.tools20022.repository.codeset.EventFrequency9Code.Monthly,
						com.tools20022.repository.codeset.EventFrequency9Code.TwiceAMonth, com.tools20022.repository.codeset.EventFrequency9Code.EveryTwoWeeks, com.tools20022.repository.codeset.EventFrequency9Code.Weekly,
						com.tools20022.repository.codeset.EventFrequency9Code.Daily, com.tools20022.repository.codeset.EventFrequency9Code.Adhoc, com.tools20022.repository.codeset.EventFrequency9Code.IntraDay,
						com.tools20022.repository.codeset.EventFrequency9Code.Overnight, com.tools20022.repository.codeset.EventFrequency9Code.OnDemand, com.tools20022.repository.codeset.EventFrequency9Code.None);
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
		codesByName.put(None.getCodeName().get(), None);
	}

	public static EventFrequency9Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static EventFrequency9Code[] values() {
		EventFrequency9Code[] values = new EventFrequency9Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, EventFrequency9Code> {
		@Override
		public EventFrequency9Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(EventFrequency9Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}