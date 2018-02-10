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
import com.tools20022.repository.codeset.TaxableIncomePerShareCalculated2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies whether the fund calculates a taxable interest per share (TIS).
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxableIncomePerShareCalculated2Code#FundCalculates
 * TaxableIncomePerShareCalculated2Code.FundCalculates}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxableIncomePerShareCalculated2Code#FundDoesNotCalculate
 * TaxableIncomePerShareCalculated2Code.FundDoesNotCalculate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxableIncomePerShareCalculated2Code#FundCalculatesUnknown
 * TaxableIncomePerShareCalculated2Code.FundCalculatesUnknown}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.TaxableIncomePerShareCalculatedCode
 * TaxableIncomePerShareCalculatedCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"TSIY"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TaxableIncomePerShareCalculated2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies whether the fund calculates a taxable interest per share (TIS)."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TaxableIncomePerShareCalculated2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxableIncomePerShareCalculated2Code
	 * TaxableIncomePerShareCalculated2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundCalculates"</li>
	 * </ul>
	 */
	public static final TaxableIncomePerShareCalculated2Code FundCalculates = new TaxableIncomePerShareCalculated2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FundCalculates";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxableIncomePerShareCalculated2Code.mmObject();
			codeName = TaxableIncomePerShareCalculatedCode.FundCalculates.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxableIncomePerShareCalculated2Code
	 * TaxableIncomePerShareCalculated2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundDoesNotCalculate"</li>
	 * </ul>
	 */
	public static final TaxableIncomePerShareCalculated2Code FundDoesNotCalculate = new TaxableIncomePerShareCalculated2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FundDoesNotCalculate";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxableIncomePerShareCalculated2Code.mmObject();
			codeName = TaxableIncomePerShareCalculatedCode.FundDoesNotCalculate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxableIncomePerShareCalculated2Code
	 * TaxableIncomePerShareCalculated2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundCalculatesUnknown"</li>
	 * </ul>
	 */
	public static final TaxableIncomePerShareCalculated2Code FundCalculatesUnknown = new TaxableIncomePerShareCalculated2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FundCalculatesUnknown";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxableIncomePerShareCalculated2Code.mmObject();
			codeName = TaxableIncomePerShareCalculatedCode.FundCalculatesUnknown.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, TaxableIncomePerShareCalculated2Code> codesByName = new LinkedHashMap<>();

	protected TaxableIncomePerShareCalculated2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("TSIY");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TaxableIncomePerShareCalculated2Code";
				definition = "Specifies whether the fund calculates a taxable interest per share (TIS).";
				trace_lazy = () -> TaxableIncomePerShareCalculatedCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TaxableIncomePerShareCalculated2Code.FundCalculates, com.tools20022.repository.codeset.TaxableIncomePerShareCalculated2Code.FundDoesNotCalculate,
						com.tools20022.repository.codeset.TaxableIncomePerShareCalculated2Code.FundCalculatesUnknown);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(FundCalculates.getCodeName().get(), FundCalculates);
		codesByName.put(FundDoesNotCalculate.getCodeName().get(), FundDoesNotCalculate);
		codesByName.put(FundCalculatesUnknown.getCodeName().get(), FundCalculatesUnknown);
	}

	public static TaxableIncomePerShareCalculated2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TaxableIncomePerShareCalculated2Code[] values() {
		TaxableIncomePerShareCalculated2Code[] values = new TaxableIncomePerShareCalculated2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TaxableIncomePerShareCalculated2Code> {
		@Override
		public TaxableIncomePerShareCalculated2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TaxableIncomePerShareCalculated2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}