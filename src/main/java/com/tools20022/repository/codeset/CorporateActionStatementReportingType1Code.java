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
import com.tools20022.repository.codeset.CorporateActionStatementReportingType1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Type of statement reporting on account holdings for corporate action events
 * eg. reporting on multiple accounts or multiple events.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionStatementReportingType1Code#MultipleAccounts
 * CorporateActionStatementReportingType1Code.MultipleAccounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionStatementReportingType1Code#MultipleEvents
 * CorporateActionStatementReportingType1Code.MultipleEvents}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.CorporateActionStatementReportingTypeCode
 * CorporateActionStatementReportingTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"MASE"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionStatementReportingType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Type of statement reporting on account holdings for corporate action events eg. reporting on multiple accounts or multiple events."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CorporateActionStatementReportingType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionStatementReportingType1Code
	 * CorporateActionStatementReportingType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MultipleAccounts"</li>
	 * </ul>
	 */
	public static final CorporateActionStatementReportingType1Code MultipleAccounts = new CorporateActionStatementReportingType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MultipleAccounts";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionStatementReportingType1Code.mmObject();
			codeName = CorporateActionStatementReportingTypeCode.MultipleAccounts.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionStatementReportingType1Code
	 * CorporateActionStatementReportingType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MultipleEvents"</li>
	 * </ul>
	 */
	public static final CorporateActionStatementReportingType1Code MultipleEvents = new CorporateActionStatementReportingType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MultipleEvents";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionStatementReportingType1Code.mmObject();
			codeName = CorporateActionStatementReportingTypeCode.MultipleEvents.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, CorporateActionStatementReportingType1Code> codesByName = new LinkedHashMap<>();

	protected CorporateActionStatementReportingType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("MASE");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionStatementReportingType1Code";
				definition = "Type of statement reporting on account holdings for corporate action events eg. reporting on multiple accounts or multiple events.";
				trace_lazy = () -> CorporateActionStatementReportingTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CorporateActionStatementReportingType1Code.MultipleAccounts, com.tools20022.repository.codeset.CorporateActionStatementReportingType1Code.MultipleEvents);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(MultipleAccounts.getCodeName().get(), MultipleAccounts);
		codesByName.put(MultipleEvents.getCodeName().get(), MultipleEvents);
	}

	public static CorporateActionStatementReportingType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CorporateActionStatementReportingType1Code[] values() {
		CorporateActionStatementReportingType1Code[] values = new CorporateActionStatementReportingType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CorporateActionStatementReportingType1Code> {
		@Override
		public CorporateActionStatementReportingType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CorporateActionStatementReportingType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}