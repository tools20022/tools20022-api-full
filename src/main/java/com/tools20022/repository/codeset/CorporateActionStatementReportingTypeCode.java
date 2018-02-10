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
import com.tools20022.repository.codeset.CorporateActionStatementReportingTypeCode.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.CorporateActionStatementReportingTypeCode#MultipleAccounts
 * CorporateActionStatementReportingTypeCode.MultipleAccounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionStatementReportingTypeCode#MultipleEvents
 * CorporateActionStatementReportingTypeCode.MultipleEvents}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionStatementReportingType1Code
 * CorporateActionStatementReportingType1Code}</li>
 * </ul>
 * </li>
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
 * "CorporateActionStatementReportingTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Type of statement reporting on account holdings for corporate action events eg. reporting on multiple accounts or multiple events."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CorporateActionStatementReportingTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * The reporting is for a single event and for multiple accounts.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionStatementReportingTypeCode
	 * CorporateActionStatementReportingTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MASE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MultipleAccounts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The reporting is for a single event and for multiple accounts."</li>
	 * </ul>
	 */
	public static final CorporateActionStatementReportingTypeCode MultipleAccounts = new CorporateActionStatementReportingTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MultipleAccounts";
			definition = "The reporting is for a single event and for multiple accounts.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionStatementReportingTypeCode.mmObject();
			codeName = "MASE";
		}
	};
	/**
	 * The reporting is for multiple events for a single account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionStatementReportingTypeCode
	 * CorporateActionStatementReportingTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SAME"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MultipleEvents"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The reporting is for multiple events for a single account."</li>
	 * </ul>
	 */
	public static final CorporateActionStatementReportingTypeCode MultipleEvents = new CorporateActionStatementReportingTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MultipleEvents";
			definition = "The reporting is for multiple events for a single account.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionStatementReportingTypeCode.mmObject();
			codeName = "SAME";
		}
	};
	final static private LinkedHashMap<String, CorporateActionStatementReportingTypeCode> codesByName = new LinkedHashMap<>();

	protected CorporateActionStatementReportingTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("MASE");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionStatementReportingTypeCode";
				definition = "Type of statement reporting on account holdings for corporate action events eg. reporting on multiple accounts or multiple events.";
				derivation_lazy = () -> Arrays.asList(CorporateActionStatementReportingType1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CorporateActionStatementReportingTypeCode.MultipleAccounts, com.tools20022.repository.codeset.CorporateActionStatementReportingTypeCode.MultipleEvents);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(MultipleAccounts.getCodeName().get(), MultipleAccounts);
		codesByName.put(MultipleEvents.getCodeName().get(), MultipleEvents);
	}

	public static CorporateActionStatementReportingTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CorporateActionStatementReportingTypeCode[] values() {
		CorporateActionStatementReportingTypeCode[] values = new CorporateActionStatementReportingTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CorporateActionStatementReportingTypeCode> {
		@Override
		public CorporateActionStatementReportingTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CorporateActionStatementReportingTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}