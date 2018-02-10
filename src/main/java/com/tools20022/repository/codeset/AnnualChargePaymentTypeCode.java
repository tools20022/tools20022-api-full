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
import com.tools20022.repository.codeset.AnnualChargePaymentTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies how the charge is to be deducted.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AnnualChargePaymentTypeCode#Capital
 * AnnualChargePaymentTypeCode.Capital}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AnnualChargePaymentTypeCode#Income
 * AnnualChargePaymentTypeCode.Income}</li>
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
 * <li>"CAPL"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AnnualChargePaymentTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies how the charge is to be deducted."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class AnnualChargePaymentTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Annual charge is deducted from the fund capital.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AnnualChargePaymentTypeCode
	 * AnnualChargePaymentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CAPL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Capital"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Annual charge is deducted from the fund capital."</li>
	 * </ul>
	 */
	public static final AnnualChargePaymentTypeCode Capital = new AnnualChargePaymentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.OBSOLETE;
			name = "Capital";
			definition = "Annual charge is deducted from the fund capital.";
			owner_lazy = () -> com.tools20022.repository.codeset.AnnualChargePaymentTypeCode.mmObject();
			codeName = "CAPL";
		}
	};
	/**
	 * Annual charge is deducted from the fund income.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AnnualChargePaymentTypeCode
	 * AnnualChargePaymentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INCO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Income"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Annual charge is deducted from the fund income."</li>
	 * </ul>
	 */
	public static final AnnualChargePaymentTypeCode Income = new AnnualChargePaymentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.OBSOLETE;
			name = "Income";
			definition = "Annual charge is deducted from the fund income.";
			owner_lazy = () -> com.tools20022.repository.codeset.AnnualChargePaymentTypeCode.mmObject();
			codeName = "INCO";
		}
	};
	final static private LinkedHashMap<String, AnnualChargePaymentTypeCode> codesByName = new LinkedHashMap<>();

	protected AnnualChargePaymentTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("CAPL");
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				name = "AnnualChargePaymentTypeCode";
				definition = "Specifies how the charge is to be deducted.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AnnualChargePaymentTypeCode.Capital, com.tools20022.repository.codeset.AnnualChargePaymentTypeCode.Income);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Capital.getCodeName().get(), Capital);
		codesByName.put(Income.getCodeName().get(), Income);
	}

	public static AnnualChargePaymentTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static AnnualChargePaymentTypeCode[] values() {
		AnnualChargePaymentTypeCode[] values = new AnnualChargePaymentTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, AnnualChargePaymentTypeCode> {
		@Override
		public AnnualChargePaymentTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(AnnualChargePaymentTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}