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
import com.tools20022.repository.codeset.PreferenceToIncome1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Indicates the level of priority to claim on income and assets of the company
 * in case of the payment of dividends and in the event of a bankruptcy, eg,
 * ordinary/common stocks, preferred stocks, subordinated debt, etc.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PreferenceToIncome1Code#Ordinary
 * PreferenceToIncome1Code.Ordinary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PreferenceToIncome1Code#Preferred
 * PreferenceToIncome1Code.Preferred}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.PreferenceToIncomeCode
 * PreferenceToIncomeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"ORDN"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PreferenceToIncome1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Indicates the level of priority to claim on income and assets of \nthe company in case of the payment of dividends and in the event of a bankruptcy, eg, ordinary/common stocks, preferred stocks, subordinated debt, etc."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class PreferenceToIncome1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PreferenceToIncome1Code
	 * PreferenceToIncome1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Ordinary"</li>
	 * </ul>
	 */
	public static final PreferenceToIncome1Code Ordinary = new PreferenceToIncome1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Ordinary";
			owner_lazy = () -> com.tools20022.repository.codeset.PreferenceToIncome1Code.mmObject();
			codeName = PreferenceToIncomeCode.Ordinary.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PreferenceToIncome1Code
	 * PreferenceToIncome1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Preferred"</li>
	 * </ul>
	 */
	public static final PreferenceToIncome1Code Preferred = new PreferenceToIncome1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Preferred";
			owner_lazy = () -> com.tools20022.repository.codeset.PreferenceToIncome1Code.mmObject();
			codeName = PreferenceToIncomeCode.Preferred.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, PreferenceToIncome1Code> codesByName = new LinkedHashMap<>();

	protected PreferenceToIncome1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("ORDN");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PreferenceToIncome1Code";
				definition = "Indicates the level of priority to claim on income and assets of \nthe company in case of the payment of dividends and in the event of a bankruptcy, eg, ordinary/common stocks, preferred stocks, subordinated debt, etc.";
				trace_lazy = () -> PreferenceToIncomeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PreferenceToIncome1Code.Ordinary, com.tools20022.repository.codeset.PreferenceToIncome1Code.Preferred);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Ordinary.getCodeName().get(), Ordinary);
		codesByName.put(Preferred.getCodeName().get(), Preferred);
	}

	public static PreferenceToIncome1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static PreferenceToIncome1Code[] values() {
		PreferenceToIncome1Code[] values = new PreferenceToIncome1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, PreferenceToIncome1Code> {
		@Override
		public PreferenceToIncome1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(PreferenceToIncome1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}