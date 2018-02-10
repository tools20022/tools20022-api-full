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
import com.tools20022.repository.codeset.CorporateActionTaxableIncomePerShareCalculated1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies whether the fund calculates the taxable income per dividend/taxable
 * income per share (TID/TIS).
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionTaxableIncomePerShareCalculated1Code#Calculated
 * CorporateActionTaxableIncomePerShareCalculated1Code.Calculated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionTaxableIncomePerShareCalculated1Code#NotCalculated
 * CorporateActionTaxableIncomePerShareCalculated1Code.NotCalculated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionTaxableIncomePerShareCalculated1Code#Unknown
 * CorporateActionTaxableIncomePerShareCalculated1Code.Unknown}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.CorporateActionTaxableIncomePerShareCalculatedCode
 * CorporateActionTaxableIncomePerShareCalculatedCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"TDIY"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionTaxableIncomePerShareCalculated1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies whether the fund calculates the taxable income per dividend/taxable income per share (TID/TIS)."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CorporateActionTaxableIncomePerShareCalculated1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionTaxableIncomePerShareCalculated1Code
	 * CorporateActionTaxableIncomePerShareCalculated1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Calculated"</li>
	 * </ul>
	 */
	public static final CorporateActionTaxableIncomePerShareCalculated1Code Calculated = new CorporateActionTaxableIncomePerShareCalculated1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Calculated";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionTaxableIncomePerShareCalculated1Code.mmObject();
			codeName = CorporateActionTaxableIncomePerShareCalculatedCode.Calculated.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionTaxableIncomePerShareCalculated1Code
	 * CorporateActionTaxableIncomePerShareCalculated1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotCalculated"</li>
	 * </ul>
	 */
	public static final CorporateActionTaxableIncomePerShareCalculated1Code NotCalculated = new CorporateActionTaxableIncomePerShareCalculated1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotCalculated";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionTaxableIncomePerShareCalculated1Code.mmObject();
			codeName = CorporateActionTaxableIncomePerShareCalculatedCode.NotCalculated.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionTaxableIncomePerShareCalculated1Code
	 * CorporateActionTaxableIncomePerShareCalculated1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unknown"</li>
	 * </ul>
	 */
	public static final CorporateActionTaxableIncomePerShareCalculated1Code Unknown = new CorporateActionTaxableIncomePerShareCalculated1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unknown";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionTaxableIncomePerShareCalculated1Code.mmObject();
			codeName = CorporateActionTaxableIncomePerShareCalculatedCode.Unknown.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, CorporateActionTaxableIncomePerShareCalculated1Code> codesByName = new LinkedHashMap<>();

	protected CorporateActionTaxableIncomePerShareCalculated1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("TDIY");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionTaxableIncomePerShareCalculated1Code";
				definition = "Specifies whether the fund calculates the taxable income per dividend/taxable income per share (TID/TIS).";
				trace_lazy = () -> CorporateActionTaxableIncomePerShareCalculatedCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CorporateActionTaxableIncomePerShareCalculated1Code.Calculated,
						com.tools20022.repository.codeset.CorporateActionTaxableIncomePerShareCalculated1Code.NotCalculated, com.tools20022.repository.codeset.CorporateActionTaxableIncomePerShareCalculated1Code.Unknown);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Calculated.getCodeName().get(), Calculated);
		codesByName.put(NotCalculated.getCodeName().get(), NotCalculated);
		codesByName.put(Unknown.getCodeName().get(), Unknown);
	}

	public static CorporateActionTaxableIncomePerShareCalculated1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CorporateActionTaxableIncomePerShareCalculated1Code[] values() {
		CorporateActionTaxableIncomePerShareCalculated1Code[] values = new CorporateActionTaxableIncomePerShareCalculated1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CorporateActionTaxableIncomePerShareCalculated1Code> {
		@Override
		public CorporateActionTaxableIncomePerShareCalculated1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CorporateActionTaxableIncomePerShareCalculated1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}