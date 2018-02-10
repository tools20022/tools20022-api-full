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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.PreferenceToIncomeCode.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.PreferenceToIncomeCode#Ordinary
 * PreferenceToIncomeCode.Ordinary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PreferenceToIncomeCode#Preferred
 * PreferenceToIncomeCode.Preferred}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.PreferenceToIncome1Code
 * PreferenceToIncome1Code}</li>
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
 * <li>"ORDN"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PreferenceToIncomeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Indicates the level of priority to claim on income and assets of \nthe company in case of the payment of dividends and in the event of a bankruptcy, eg, ordinary/common stocks, preferred stocks, subordinated debt, etc."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class PreferenceToIncomeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Indicates an ordinary/common preference to income.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PreferenceToIncomeCode
	 * PreferenceToIncomeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ORDN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::PREF//ORDN</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Ordinary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates an ordinary/common preference to income."</li>
	 * </ul>
	 */
	public static final PreferenceToIncomeCode Ordinary = new PreferenceToIncomeCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::PREF//ORDN"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Ordinary";
			definition = "Indicates an ordinary/common preference to income.";
			owner_lazy = () -> com.tools20022.repository.codeset.PreferenceToIncomeCode.mmObject();
			codeName = "ORDN";
		}
	};
	/**
	 * Indicates a preferred claim upon income and assets.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PreferenceToIncomeCode
	 * PreferenceToIncomeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PFRD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::PREF//PFRD</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Preferred"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates a preferred claim upon income and assets."</li>
	 * </ul>
	 */
	public static final PreferenceToIncomeCode Preferred = new PreferenceToIncomeCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::PREF//PFRD"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Preferred";
			definition = "Indicates a preferred claim upon income and assets.";
			owner_lazy = () -> com.tools20022.repository.codeset.PreferenceToIncomeCode.mmObject();
			codeName = "PFRD";
		}
	};
	final static private LinkedHashMap<String, PreferenceToIncomeCode> codesByName = new LinkedHashMap<>();

	protected PreferenceToIncomeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("ORDN");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PreferenceToIncomeCode";
				definition = "Indicates the level of priority to claim on income and assets of \nthe company in case of the payment of dividends and in the event of a bankruptcy, eg, ordinary/common stocks, preferred stocks, subordinated debt, etc.";
				derivation_lazy = () -> Arrays.asList(PreferenceToIncome1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PreferenceToIncomeCode.Ordinary, com.tools20022.repository.codeset.PreferenceToIncomeCode.Preferred);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Ordinary.getCodeName().get(), Ordinary);
		codesByName.put(Preferred.getCodeName().get(), Preferred);
	}

	public static PreferenceToIncomeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static PreferenceToIncomeCode[] values() {
		PreferenceToIncomeCode[] values = new PreferenceToIncomeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, PreferenceToIncomeCode> {
		@Override
		public PreferenceToIncomeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(PreferenceToIncomeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}