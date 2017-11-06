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
import com.tools20022.repository.codeset.EventFrequencyCode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the regularity of an event.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.EventFrequencyCode
 * EventFrequencyCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EventFrequency1Code#mmAnnual
 * EventFrequency1Code.mmAnnual}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EventFrequency1Code#mmSemiAnnual
 * EventFrequency1Code.mmSemiAnnual}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EventFrequency1Code#mmQuarterly
 * EventFrequency1Code.mmQuarterly}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EventFrequency1Code#mmEveryTwoMonths
 * EventFrequency1Code.mmEveryTwoMonths}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EventFrequency1Code#mmMonthly
 * EventFrequency1Code.mmMonthly}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EventFrequency1Code#mmTwiceAMonth
 * EventFrequency1Code.mmTwiceAMonth}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EventFrequency1Code#mmEveryTwoWeeks
 * EventFrequency1Code.mmEveryTwoWeeks}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EventFrequency1Code#mmWeekly
 * EventFrequency1Code.mmWeekly}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EventFrequency1Code#mmDaily
 * EventFrequency1Code.mmDaily}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EventFrequency1Code#mmAdhoc
 * EventFrequency1Code.mmAdhoc}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EventFrequency1Code#mmIntraDay
 * EventFrequency1Code.mmIntraDay}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EventFrequency1Code#mmOvernight
 * EventFrequency1Code.mmOvernight}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EventFrequency1Code#mmOnDemand
 * EventFrequency1Code.mmOnDemand}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
public class EventFrequency1Code extends EventFrequencyCode {

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
	 * {@linkplain com.tools20022.repository.codeset.EventFrequency9Code#mmAnnual
	 * EventFrequency9Code.mmAnnual}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmAnnual = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Annual";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.EventFrequency9Code.mmAnnual);
			owner_lazy = () -> EventFrequency1Code.mmObject();
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
	 * {@linkplain com.tools20022.repository.codeset.EventFrequency9Code#mmSemiAnnual
	 * EventFrequency9Code.mmSemiAnnual}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmSemiAnnual = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SemiAnnual";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.EventFrequency9Code.mmSemiAnnual);
			owner_lazy = () -> EventFrequency1Code.mmObject();
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
	 * {@linkplain com.tools20022.repository.codeset.EventFrequency9Code#mmQuarterly
	 * EventFrequency9Code.mmQuarterly}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmQuarterly = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Quarterly";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.EventFrequency9Code.mmQuarterly);
			owner_lazy = () -> EventFrequency1Code.mmObject();
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
	 * {@linkplain com.tools20022.repository.codeset.EventFrequency9Code#mmEveryTwoMonths
	 * EventFrequency9Code.mmEveryTwoMonths}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmEveryTwoMonths = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EveryTwoMonths";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.EventFrequency9Code.mmEveryTwoMonths);
			owner_lazy = () -> EventFrequency1Code.mmObject();
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
	 * {@linkplain com.tools20022.repository.codeset.EventFrequency9Code#mmMonthly
	 * EventFrequency9Code.mmMonthly}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmMonthly = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Monthly";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.EventFrequency9Code.mmMonthly);
			owner_lazy = () -> EventFrequency1Code.mmObject();
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
	 * {@linkplain com.tools20022.repository.codeset.EventFrequency9Code#mmTwiceAMonth
	 * EventFrequency9Code.mmTwiceAMonth}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmTwiceAMonth = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwiceAMonth";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.EventFrequency9Code.mmTwiceAMonth);
			owner_lazy = () -> EventFrequency1Code.mmObject();
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
	 * {@linkplain com.tools20022.repository.codeset.EventFrequency9Code#mmEveryTwoWeeks
	 * EventFrequency9Code.mmEveryTwoWeeks}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmEveryTwoWeeks = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EveryTwoWeeks";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.EventFrequency9Code.mmEveryTwoWeeks);
			owner_lazy = () -> EventFrequency1Code.mmObject();
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
	 * {@linkplain com.tools20022.repository.codeset.EventFrequency9Code#mmWeekly
	 * EventFrequency9Code.mmWeekly}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmWeekly = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Weekly";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.EventFrequency9Code.mmWeekly);
			owner_lazy = () -> EventFrequency1Code.mmObject();
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
	 * {@linkplain com.tools20022.repository.codeset.EventFrequency9Code#mmDaily
	 * EventFrequency9Code.mmDaily}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmDaily = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Daily";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.EventFrequency9Code.mmDaily);
			owner_lazy = () -> EventFrequency1Code.mmObject();
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
	 * {@linkplain com.tools20022.repository.codeset.EventFrequency9Code#mmAdhoc
	 * EventFrequency9Code.mmAdhoc}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmAdhoc = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Adhoc";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.EventFrequency9Code.mmAdhoc);
			owner_lazy = () -> EventFrequency1Code.mmObject();
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
	 * {@linkplain com.tools20022.repository.codeset.EventFrequency9Code#mmIntraDay
	 * EventFrequency9Code.mmIntraDay}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmIntraDay = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntraDay";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.EventFrequency9Code.mmIntraDay);
			owner_lazy = () -> EventFrequency1Code.mmObject();
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
	 * {@linkplain com.tools20022.repository.codeset.EventFrequency9Code#mmOvernight
	 * EventFrequency9Code.mmOvernight}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmOvernight = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Overnight";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.EventFrequency9Code.mmOvernight);
			owner_lazy = () -> EventFrequency1Code.mmObject();
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
	 * {@linkplain com.tools20022.repository.codeset.EventFrequency9Code#mmOnDemand
	 * EventFrequency9Code.mmOnDemand}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmOnDemand = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OnDemand";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.EventFrequency9Code.mmOnDemand);
			owner_lazy = () -> EventFrequency1Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				example = Arrays.asList("YEAR");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "EventFrequency1Code";
				definition = "Specifies the regularity of an event.";
				nextVersions_lazy = () -> Arrays.asList(EventFrequency9Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.EventFrequency1Code.mmAnnual, com.tools20022.repository.codeset.EventFrequency1Code.mmSemiAnnual,
						com.tools20022.repository.codeset.EventFrequency1Code.mmQuarterly, com.tools20022.repository.codeset.EventFrequency1Code.mmEveryTwoMonths, com.tools20022.repository.codeset.EventFrequency1Code.mmMonthly,
						com.tools20022.repository.codeset.EventFrequency1Code.mmTwiceAMonth, com.tools20022.repository.codeset.EventFrequency1Code.mmEveryTwoWeeks, com.tools20022.repository.codeset.EventFrequency1Code.mmWeekly,
						com.tools20022.repository.codeset.EventFrequency1Code.mmDaily, com.tools20022.repository.codeset.EventFrequency1Code.mmAdhoc, com.tools20022.repository.codeset.EventFrequency1Code.mmIntraDay,
						com.tools20022.repository.codeset.EventFrequency1Code.mmOvernight, com.tools20022.repository.codeset.EventFrequency1Code.mmOnDemand);
				trace_lazy = () -> EventFrequencyCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}