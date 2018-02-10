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
import com.tools20022.repository.codeset.CorporateActionCalculationMethod1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the calculation method for drawings.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionCalculationMethod1Code#ProRata
 * CorporateActionCalculationMethod1Code.ProRata}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionCalculationMethod1Code#Lottery
 * CorporateActionCalculationMethod1Code.Lottery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionCalculationMethod1Code#NominalReduction
 * CorporateActionCalculationMethod1Code.NominalReduction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionCalculationMethod1Code#NoNominalReduction
 * CorporateActionCalculationMethod1Code.NoNominalReduction}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.CorporateActionCalculationMethodCode
 * CorporateActionCalculationMethodCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"PROR"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionCalculationMethod1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the calculation method for drawings."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CorporateActionCalculationMethod1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionCalculationMethod1Code
	 * CorporateActionCalculationMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProRata"</li>
	 * </ul>
	 */
	public static final CorporateActionCalculationMethod1Code ProRata = new CorporateActionCalculationMethod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProRata";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionCalculationMethod1Code.mmObject();
			codeName = CorporateActionCalculationMethodCode.ProRata.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionCalculationMethod1Code
	 * CorporateActionCalculationMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Lottery"</li>
	 * </ul>
	 */
	public static final CorporateActionCalculationMethod1Code Lottery = new CorporateActionCalculationMethod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Lottery";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionCalculationMethod1Code.mmObject();
			codeName = CorporateActionCalculationMethodCode.Lottery.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionCalculationMethod1Code
	 * CorporateActionCalculationMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NominalReduction"</li>
	 * </ul>
	 */
	public static final CorporateActionCalculationMethod1Code NominalReduction = new CorporateActionCalculationMethod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NominalReduction";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionCalculationMethod1Code.mmObject();
			codeName = CorporateActionCalculationMethodCode.NominalReduction.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionCalculationMethod1Code
	 * CorporateActionCalculationMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoNominalReduction"</li>
	 * </ul>
	 */
	public static final CorporateActionCalculationMethod1Code NoNominalReduction = new CorporateActionCalculationMethod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoNominalReduction";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionCalculationMethod1Code.mmObject();
			codeName = CorporateActionCalculationMethodCode.NoNominalReduction.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, CorporateActionCalculationMethod1Code> codesByName = new LinkedHashMap<>();

	protected CorporateActionCalculationMethod1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("PROR");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionCalculationMethod1Code";
				definition = "Specifies the calculation method for drawings.";
				trace_lazy = () -> CorporateActionCalculationMethodCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CorporateActionCalculationMethod1Code.ProRata, com.tools20022.repository.codeset.CorporateActionCalculationMethod1Code.Lottery,
						com.tools20022.repository.codeset.CorporateActionCalculationMethod1Code.NominalReduction, com.tools20022.repository.codeset.CorporateActionCalculationMethod1Code.NoNominalReduction);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(ProRata.getCodeName().get(), ProRata);
		codesByName.put(Lottery.getCodeName().get(), Lottery);
		codesByName.put(NominalReduction.getCodeName().get(), NominalReduction);
		codesByName.put(NoNominalReduction.getCodeName().get(), NoNominalReduction);
	}

	public static CorporateActionCalculationMethod1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CorporateActionCalculationMethod1Code[] values() {
		CorporateActionCalculationMethod1Code[] values = new CorporateActionCalculationMethod1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CorporateActionCalculationMethod1Code> {
		@Override
		public CorporateActionCalculationMethod1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CorporateActionCalculationMethod1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}