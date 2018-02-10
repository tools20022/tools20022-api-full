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
import com.tools20022.repository.codeset.TradeRecurrentQuery1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of a recurrent query.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeRecurrentQuery1Code#AllLateReport
 * TradeRecurrentQuery1Code.AllLateReport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeRecurrentQuery1Code#AllOutstandingTradesAsOfEndOfReportingPeriod
 * TradeRecurrentQuery1Code.AllOutstandingTradesAsOfEndOfReportingPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeRecurrentQuery1Code#AllTradesMaturedErroredOrTerminated
 * TradeRecurrentQuery1Code.AllTradesMaturedErroredOrTerminated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeRecurrentQuery1Code#AllTradesSubmittedOnPreviousDay
 * TradeRecurrentQuery1Code.AllTradesSubmittedOnPreviousDay}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeRecurrentQuery1Code#AllTradesWhoseExecutionHasBeenReported
 * TradeRecurrentQuery1Code.AllTradesWhoseExecutionHasBeenReported}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.TradeRecurrentQueryCode
 * TradeRecurrentQueryCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TradeRecurrentQuery1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of a recurrent query."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TradeRecurrentQuery1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeRecurrentQuery1Code
	 * TradeRecurrentQuery1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllLateReport"</li>
	 * </ul>
	 */
	public static final TradeRecurrentQuery1Code AllLateReport = new TradeRecurrentQuery1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllLateReport";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeRecurrentQuery1Code.mmObject();
			codeName = TradeRecurrentQueryCode.AllLateReport.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeRecurrentQuery1Code
	 * TradeRecurrentQuery1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllOutstandingTradesAsOfEndOfReportingPeriod"</li>
	 * </ul>
	 */
	public static final TradeRecurrentQuery1Code AllOutstandingTradesAsOfEndOfReportingPeriod = new TradeRecurrentQuery1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllOutstandingTradesAsOfEndOfReportingPeriod";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeRecurrentQuery1Code.mmObject();
			codeName = TradeRecurrentQueryCode.AllOutstandingTradesAsOfEndOfReportingPeriod.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeRecurrentQuery1Code
	 * TradeRecurrentQuery1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllTradesMaturedErroredOrTerminated"</li>
	 * </ul>
	 */
	public static final TradeRecurrentQuery1Code AllTradesMaturedErroredOrTerminated = new TradeRecurrentQuery1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllTradesMaturedErroredOrTerminated";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeRecurrentQuery1Code.mmObject();
			codeName = TradeRecurrentQueryCode.AllTradesMaturedErroredOrTerminated.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeRecurrentQuery1Code
	 * TradeRecurrentQuery1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllTradesSubmittedOnPreviousDay"</li>
	 * </ul>
	 */
	public static final TradeRecurrentQuery1Code AllTradesSubmittedOnPreviousDay = new TradeRecurrentQuery1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllTradesSubmittedOnPreviousDay";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeRecurrentQuery1Code.mmObject();
			codeName = TradeRecurrentQueryCode.AllTradesSubmittedOnPreviousDay.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeRecurrentQuery1Code
	 * TradeRecurrentQuery1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllTradesWhoseExecutionHasBeenReported"</li>
	 * </ul>
	 */
	public static final TradeRecurrentQuery1Code AllTradesWhoseExecutionHasBeenReported = new TradeRecurrentQuery1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllTradesWhoseExecutionHasBeenReported";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeRecurrentQuery1Code.mmObject();
			codeName = TradeRecurrentQueryCode.AllTradesWhoseExecutionHasBeenReported.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, TradeRecurrentQuery1Code> codesByName = new LinkedHashMap<>();

	protected TradeRecurrentQuery1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "TradeRecurrentQuery1Code";
				definition = "Specifies the type of a recurrent query.";
				trace_lazy = () -> TradeRecurrentQueryCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TradeRecurrentQuery1Code.AllLateReport, com.tools20022.repository.codeset.TradeRecurrentQuery1Code.AllOutstandingTradesAsOfEndOfReportingPeriod,
						com.tools20022.repository.codeset.TradeRecurrentQuery1Code.AllTradesMaturedErroredOrTerminated, com.tools20022.repository.codeset.TradeRecurrentQuery1Code.AllTradesSubmittedOnPreviousDay,
						com.tools20022.repository.codeset.TradeRecurrentQuery1Code.AllTradesWhoseExecutionHasBeenReported);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AllLateReport.getCodeName().get(), AllLateReport);
		codesByName.put(AllOutstandingTradesAsOfEndOfReportingPeriod.getCodeName().get(), AllOutstandingTradesAsOfEndOfReportingPeriod);
		codesByName.put(AllTradesMaturedErroredOrTerminated.getCodeName().get(), AllTradesMaturedErroredOrTerminated);
		codesByName.put(AllTradesSubmittedOnPreviousDay.getCodeName().get(), AllTradesSubmittedOnPreviousDay);
		codesByName.put(AllTradesWhoseExecutionHasBeenReported.getCodeName().get(), AllTradesWhoseExecutionHasBeenReported);
	}

	public static TradeRecurrentQuery1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TradeRecurrentQuery1Code[] values() {
		TradeRecurrentQuery1Code[] values = new TradeRecurrentQuery1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TradeRecurrentQuery1Code> {
		@Override
		public TradeRecurrentQuery1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TradeRecurrentQuery1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}