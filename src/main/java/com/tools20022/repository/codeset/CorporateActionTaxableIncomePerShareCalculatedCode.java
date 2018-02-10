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
import com.tools20022.repository.codeset.CorporateActionTaxableIncomePerShareCalculatedCode.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.CorporateActionTaxableIncomePerShareCalculatedCode#Calculated
 * CorporateActionTaxableIncomePerShareCalculatedCode.Calculated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionTaxableIncomePerShareCalculatedCode#NotCalculated
 * CorporateActionTaxableIncomePerShareCalculatedCode.NotCalculated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionTaxableIncomePerShareCalculatedCode#Unknown
 * CorporateActionTaxableIncomePerShareCalculatedCode.Unknown}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionTaxableIncomePerShareCalculated1Code
 * CorporateActionTaxableIncomePerShareCalculated1Code}</li>
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
 * <li>"TDIY"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionTaxableIncomePerShareCalculatedCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies whether the fund calculates the taxable income per dividend/taxable income per share (TID/TIS)."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CorporateActionTaxableIncomePerShareCalculatedCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Fund is calculating the taxable income per dividend/taxable income per
	 * share.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionTaxableIncomePerShareCalculatedCode
	 * CorporateActionTaxableIncomePerShareCalculatedCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TDIY"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Calculated"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Fund is calculating the taxable income per dividend/taxable income per share."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionTaxableIncomePerShareCalculatedCode Calculated = new CorporateActionTaxableIncomePerShareCalculatedCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Calculated";
			definition = "Fund is calculating the taxable income per dividend/taxable income per share.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionTaxableIncomePerShareCalculatedCode.mmObject();
			codeName = "TDIY";
		}
	};
	/**
	 * Fund is not calculating the taxable income per dividend/taxable income
	 * per share.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionTaxableIncomePerShareCalculatedCode
	 * CorporateActionTaxableIncomePerShareCalculatedCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TDIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotCalculated"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Fund is not calculating the taxable income per dividend/taxable income per share."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionTaxableIncomePerShareCalculatedCode NotCalculated = new CorporateActionTaxableIncomePerShareCalculatedCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NotCalculated";
			definition = "Fund is not calculating the taxable income per dividend/taxable income per share.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionTaxableIncomePerShareCalculatedCode.mmObject();
			codeName = "TDIN";
		}
	};
	/**
	 * Unknown whether the fund is calculating the taxable income per
	 * dividend/taxable income per share.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionTaxableIncomePerShareCalculatedCode
	 * CorporateActionTaxableIncomePerShareCalculatedCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UKWN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unknown"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unknown whether the fund is calculating the taxable income per dividend/taxable income per share."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionTaxableIncomePerShareCalculatedCode Unknown = new CorporateActionTaxableIncomePerShareCalculatedCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Unknown";
			definition = "Unknown whether the fund is calculating the taxable income per dividend/taxable income per share.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionTaxableIncomePerShareCalculatedCode.mmObject();
			codeName = "UKWN";
		}
	};
	final static private LinkedHashMap<String, CorporateActionTaxableIncomePerShareCalculatedCode> codesByName = new LinkedHashMap<>();

	protected CorporateActionTaxableIncomePerShareCalculatedCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("TDIY");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionTaxableIncomePerShareCalculatedCode";
				definition = "Specifies whether the fund calculates the taxable income per dividend/taxable income per share (TID/TIS).";
				derivation_lazy = () -> Arrays.asList(CorporateActionTaxableIncomePerShareCalculated1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CorporateActionTaxableIncomePerShareCalculatedCode.Calculated,
						com.tools20022.repository.codeset.CorporateActionTaxableIncomePerShareCalculatedCode.NotCalculated, com.tools20022.repository.codeset.CorporateActionTaxableIncomePerShareCalculatedCode.Unknown);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Calculated.getCodeName().get(), Calculated);
		codesByName.put(NotCalculated.getCodeName().get(), NotCalculated);
		codesByName.put(Unknown.getCodeName().get(), Unknown);
	}

	public static CorporateActionTaxableIncomePerShareCalculatedCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CorporateActionTaxableIncomePerShareCalculatedCode[] values() {
		CorporateActionTaxableIncomePerShareCalculatedCode[] values = new CorporateActionTaxableIncomePerShareCalculatedCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CorporateActionTaxableIncomePerShareCalculatedCode> {
		@Override
		public CorporateActionTaxableIncomePerShareCalculatedCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CorporateActionTaxableIncomePerShareCalculatedCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}