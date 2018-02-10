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
import com.tools20022.repository.codeset.CustodianRecordCompletenessTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the state of details of the composite record on the system.
 * Applicable to custodian service only.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CustodianRecordCompletenessTypeCode#Complete
 * CustodianRecordCompletenessTypeCode.Complete}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CustodianRecordCompletenessTypeCode#Incomplete
 * CustodianRecordCompletenessTypeCode.Incomplete}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CustodianRecordCompletenessTypeCode#ConditionallyComplete
 * CustodianRecordCompletenessTypeCode.ConditionallyComplete}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CustodianRecordCompletenessType1Code
 * CustodianRecordCompletenessType1Code}</li>
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
 * <li>"COMP"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CustodianRecordCompletenessTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the state of details of the composite record on the system. Applicable to custodian service only."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CustodianRecordCompletenessTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Custodian record is complete.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CustodianRecordCompletenessTypeCode
	 * CustodianRecordCompletenessTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COMP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Complete"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Custodian record is complete."</li>
	 * </ul>
	 */
	public static final CustodianRecordCompletenessTypeCode Complete = new CustodianRecordCompletenessTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Complete";
			definition = "Custodian record is complete.";
			owner_lazy = () -> com.tools20022.repository.codeset.CustodianRecordCompletenessTypeCode.mmObject();
			codeName = "COMP";
		}
	};
	/**
	 * Custodian record is incomplete.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CustodianRecordCompletenessTypeCode
	 * CustodianRecordCompletenessTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INCO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Incomplete"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Custodian record is incomplete."</li>
	 * </ul>
	 */
	public static final CustodianRecordCompletenessTypeCode Incomplete = new CustodianRecordCompletenessTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Incomplete";
			definition = "Custodian record is incomplete.";
			owner_lazy = () -> com.tools20022.repository.codeset.CustodianRecordCompletenessTypeCode.mmObject();
			codeName = "INCO";
		}
	};
	/**
	 * Custodian record is conditionally complete.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CustodianRecordCompletenessTypeCode
	 * CustodianRecordCompletenessTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CCOM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConditionallyComplete"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Custodian record is conditionally complete."</li>
	 * </ul>
	 */
	public static final CustodianRecordCompletenessTypeCode ConditionallyComplete = new CustodianRecordCompletenessTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConditionallyComplete";
			definition = "Custodian record is conditionally complete.";
			owner_lazy = () -> com.tools20022.repository.codeset.CustodianRecordCompletenessTypeCode.mmObject();
			codeName = "CCOM";
		}
	};
	final static private LinkedHashMap<String, CustodianRecordCompletenessTypeCode> codesByName = new LinkedHashMap<>();

	protected CustodianRecordCompletenessTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("COMP");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CustodianRecordCompletenessTypeCode";
				definition = "Specifies the state of details of the composite record on the system. Applicable to custodian service only.";
				derivation_lazy = () -> Arrays.asList(CustodianRecordCompletenessType1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CustodianRecordCompletenessTypeCode.Complete, com.tools20022.repository.codeset.CustodianRecordCompletenessTypeCode.Incomplete,
						com.tools20022.repository.codeset.CustodianRecordCompletenessTypeCode.ConditionallyComplete);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Complete.getCodeName().get(), Complete);
		codesByName.put(Incomplete.getCodeName().get(), Incomplete);
		codesByName.put(ConditionallyComplete.getCodeName().get(), ConditionallyComplete);
	}

	public static CustodianRecordCompletenessTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CustodianRecordCompletenessTypeCode[] values() {
		CustodianRecordCompletenessTypeCode[] values = new CustodianRecordCompletenessTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CustodianRecordCompletenessTypeCode> {
		@Override
		public CustodianRecordCompletenessTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CustodianRecordCompletenessTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}