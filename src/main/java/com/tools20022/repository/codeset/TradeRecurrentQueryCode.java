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
import com.tools20022.repository.codeset.TradeRecurrentQueryCode.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.TradeRecurrentQueryCode#AllTradesSubmittedOnPreviousDay
 * TradeRecurrentQueryCode.AllTradesSubmittedOnPreviousDay}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeRecurrentQueryCode#AllOutstandingTradesAsOfEndOfReportingPeriod
 * TradeRecurrentQueryCode.AllOutstandingTradesAsOfEndOfReportingPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeRecurrentQueryCode#AllTradesWhoseExecutionHasBeenReported
 * TradeRecurrentQueryCode.AllTradesWhoseExecutionHasBeenReported}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeRecurrentQueryCode#AllTradesMaturedErroredOrTerminated
 * TradeRecurrentQueryCode.AllTradesMaturedErroredOrTerminated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeRecurrentQueryCode#AllLateReport
 * TradeRecurrentQueryCode.AllLateReport}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.TradeRecurrentQuery1Code
 * TradeRecurrentQuery1Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TradeRecurrentQueryCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of a recurrent query."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TradeRecurrentQueryCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies all trades submitted on previous day.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeRecurrentQueryCode
	 * TradeRecurrentQueryCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ATPD"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllTradesSubmittedOnPreviousDay"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies all trades submitted on previous day."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final TradeRecurrentQueryCode AllTradesSubmittedOnPreviousDay = new TradeRecurrentQueryCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllTradesSubmittedOnPreviousDay";
			definition = "Specifies all trades submitted on previous day.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeRecurrentQueryCode.mmObject();
			codeName = "ATPD";
		}
	};
	/**
	 * Specifies all outstanding trades.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeRecurrentQueryCode
	 * TradeRecurrentQueryCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AOTE"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllOutstandingTradesAsOfEndOfReportingPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies all outstanding trades."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final TradeRecurrentQueryCode AllOutstandingTradesAsOfEndOfReportingPeriod = new TradeRecurrentQueryCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllOutstandingTradesAsOfEndOfReportingPeriod";
			definition = "Specifies all outstanding trades.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeRecurrentQueryCode.mmObject();
			codeName = "AOTE";
		}
	};
	/**
	 * Specifies all trades whose execution has been reported.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeRecurrentQueryCode
	 * TradeRecurrentQueryCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ATER"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllTradesWhoseExecutionHasBeenReported"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies all trades whose execution has been reported."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final TradeRecurrentQueryCode AllTradesWhoseExecutionHasBeenReported = new TradeRecurrentQueryCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllTradesWhoseExecutionHasBeenReported";
			definition = "Specifies all trades whose execution has been reported.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeRecurrentQueryCode.mmObject();
			codeName = "ATER";
		}
	};
	/**
	 * Specifies all trades matured, in error or terminated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeRecurrentQueryCode
	 * TradeRecurrentQueryCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ATMT"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllTradesMaturedErroredOrTerminated"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies all trades matured, in error or terminated."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final TradeRecurrentQueryCode AllTradesMaturedErroredOrTerminated = new TradeRecurrentQueryCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllTradesMaturedErroredOrTerminated";
			definition = "Specifies all trades matured, in error or terminated.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeRecurrentQueryCode.mmObject();
			codeName = "ATMT";
		}
	};
	/**
	 * Specifies all late reports.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeRecurrentQueryCode
	 * TradeRecurrentQueryCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ALTR"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllLateReport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies all late reports."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final TradeRecurrentQueryCode AllLateReport = new TradeRecurrentQueryCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllLateReport";
			definition = "Specifies all late reports.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeRecurrentQueryCode.mmObject();
			codeName = "ALTR";
		}
	};
	final static private LinkedHashMap<String, TradeRecurrentQueryCode> codesByName = new LinkedHashMap<>();

	protected TradeRecurrentQueryCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "TradeRecurrentQueryCode";
				definition = "Specifies the type of a recurrent query.";
				derivation_lazy = () -> Arrays.asList(TradeRecurrentQuery1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TradeRecurrentQueryCode.AllTradesSubmittedOnPreviousDay,
						com.tools20022.repository.codeset.TradeRecurrentQueryCode.AllOutstandingTradesAsOfEndOfReportingPeriod, com.tools20022.repository.codeset.TradeRecurrentQueryCode.AllTradesWhoseExecutionHasBeenReported,
						com.tools20022.repository.codeset.TradeRecurrentQueryCode.AllTradesMaturedErroredOrTerminated, com.tools20022.repository.codeset.TradeRecurrentQueryCode.AllLateReport);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AllTradesSubmittedOnPreviousDay.getCodeName().get(), AllTradesSubmittedOnPreviousDay);
		codesByName.put(AllOutstandingTradesAsOfEndOfReportingPeriod.getCodeName().get(), AllOutstandingTradesAsOfEndOfReportingPeriod);
		codesByName.put(AllTradesWhoseExecutionHasBeenReported.getCodeName().get(), AllTradesWhoseExecutionHasBeenReported);
		codesByName.put(AllTradesMaturedErroredOrTerminated.getCodeName().get(), AllTradesMaturedErroredOrTerminated);
		codesByName.put(AllLateReport.getCodeName().get(), AllLateReport);
	}

	public static TradeRecurrentQueryCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TradeRecurrentQueryCode[] values() {
		TradeRecurrentQueryCode[] values = new TradeRecurrentQueryCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TradeRecurrentQueryCode> {
		@Override
		public TradeRecurrentQueryCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TradeRecurrentQueryCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}