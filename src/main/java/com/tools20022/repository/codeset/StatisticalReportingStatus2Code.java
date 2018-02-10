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
import com.tools20022.repository.codeset.StatisticalReportingStatus2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the status of a single statistical reporting transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.StatisticalReportingStatus2Code#Accepted
 * StatisticalReportingStatus2Code.Accepted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.StatisticalReportingStatus2Code#Rejected
 * StatisticalReportingStatus2Code.Rejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.StatisticalReportingStatus2Code#Warning
 * StatisticalReportingStatus2Code.Warning}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.StatisticalReportingStatusCode
 * StatisticalReportingStatusCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "StatisticalReportingStatus2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the status of a single statistical reporting transaction."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.TaxReportingStatus2Code
 * TaxReportingStatus2Code}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class StatisticalReportingStatus2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.StatisticalReportingStatus2Code
	 * StatisticalReportingStatus2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Accepted"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.TaxReportingStatus2Code#Accepted
	 * TaxReportingStatus2Code.Accepted}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final StatisticalReportingStatus2Code Accepted = new StatisticalReportingStatus2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Accepted";
			nextVersions_lazy = () -> Arrays.asList(TaxReportingStatus2Code.Accepted);
			owner_lazy = () -> com.tools20022.repository.codeset.StatisticalReportingStatus2Code.mmObject();
			codeName = StatisticalReportingStatusCode.Accepted.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.StatisticalReportingStatus2Code
	 * StatisticalReportingStatus2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rejected"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.TaxReportingStatus2Code#Rejected
	 * TaxReportingStatus2Code.Rejected}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final StatisticalReportingStatus2Code Rejected = new StatisticalReportingStatus2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rejected";
			nextVersions_lazy = () -> Arrays.asList(TaxReportingStatus2Code.Rejected);
			owner_lazy = () -> com.tools20022.repository.codeset.StatisticalReportingStatus2Code.mmObject();
			codeName = StatisticalReportingStatusCode.Rejected.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.StatisticalReportingStatus2Code
	 * StatisticalReportingStatus2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Warning"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.TaxReportingStatus2Code#Warning
	 * TaxReportingStatus2Code.Warning}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final StatisticalReportingStatus2Code Warning = new StatisticalReportingStatus2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Warning";
			nextVersions_lazy = () -> Arrays.asList(TaxReportingStatus2Code.Warning);
			owner_lazy = () -> com.tools20022.repository.codeset.StatisticalReportingStatus2Code.mmObject();
			codeName = StatisticalReportingStatusCode.Warning.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, StatisticalReportingStatus2Code> codesByName = new LinkedHashMap<>();

	protected StatisticalReportingStatus2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "StatisticalReportingStatus2Code";
				definition = "Specifies the status of a single statistical reporting transaction.";
				nextVersions_lazy = () -> Arrays.asList(TaxReportingStatus2Code.mmObject());
				trace_lazy = () -> StatisticalReportingStatusCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.StatisticalReportingStatus2Code.Accepted, com.tools20022.repository.codeset.StatisticalReportingStatus2Code.Rejected,
						com.tools20022.repository.codeset.StatisticalReportingStatus2Code.Warning);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Accepted.getCodeName().get(), Accepted);
		codesByName.put(Rejected.getCodeName().get(), Rejected);
		codesByName.put(Warning.getCodeName().get(), Warning);
	}

	public static StatisticalReportingStatus2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static StatisticalReportingStatus2Code[] values() {
		StatisticalReportingStatus2Code[] values = new StatisticalReportingStatus2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, StatisticalReportingStatus2Code> {
		@Override
		public StatisticalReportingStatus2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(StatisticalReportingStatus2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}