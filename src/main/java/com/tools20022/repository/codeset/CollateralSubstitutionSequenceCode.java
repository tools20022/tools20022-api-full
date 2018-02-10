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
import com.tools20022.repository.codeset.CollateralSubstitutionSequenceCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Indicates whether the collateral substitution request is new or updated.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CollateralSubstitutionSequenceCode#Initial
 * CollateralSubstitutionSequenceCode.Initial}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CollateralSubstitutionSequenceCode#Updated
 * CollateralSubstitutionSequenceCode.Updated}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CollateralSubstitutionSequence1Code
 * CollateralSubstitutionSequence1Code}</li>
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
 * <li>"INIT"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CollateralSubstitutionSequenceCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Indicates whether the collateral substitution request is new or updated."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CollateralSubstitutionSequenceCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Indicates this is a new collateral substitution request.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CollateralSubstitutionSequenceCode
	 * CollateralSubstitutionSequenceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INIT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Initial"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates this is a new collateral substitution request."</li>
	 * </ul>
	 */
	public static final CollateralSubstitutionSequenceCode Initial = new CollateralSubstitutionSequenceCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Initial";
			definition = "Indicates this is a new collateral substitution request.";
			owner_lazy = () -> com.tools20022.repository.codeset.CollateralSubstitutionSequenceCode.mmObject();
			codeName = "INIT";
		}
	};
	/**
	 * Indicates this is an updated collateral substitution request.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CollateralSubstitutionSequenceCode
	 * CollateralSubstitutionSequenceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UPDD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Updated"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates this is an updated collateral substitution request."</li>
	 * </ul>
	 */
	public static final CollateralSubstitutionSequenceCode Updated = new CollateralSubstitutionSequenceCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Updated";
			definition = "Indicates this is an updated collateral substitution request.";
			owner_lazy = () -> com.tools20022.repository.codeset.CollateralSubstitutionSequenceCode.mmObject();
			codeName = "UPDD";
		}
	};
	final static private LinkedHashMap<String, CollateralSubstitutionSequenceCode> codesByName = new LinkedHashMap<>();

	protected CollateralSubstitutionSequenceCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("INIT");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CollateralSubstitutionSequenceCode";
				definition = "Indicates whether the collateral substitution request is new or updated.";
				derivation_lazy = () -> Arrays.asList(CollateralSubstitutionSequence1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CollateralSubstitutionSequenceCode.Initial, com.tools20022.repository.codeset.CollateralSubstitutionSequenceCode.Updated);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Initial.getCodeName().get(), Initial);
		codesByName.put(Updated.getCodeName().get(), Updated);
	}

	public static CollateralSubstitutionSequenceCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CollateralSubstitutionSequenceCode[] values() {
		CollateralSubstitutionSequenceCode[] values = new CollateralSubstitutionSequenceCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CollateralSubstitutionSequenceCode> {
		@Override
		public CollateralSubstitutionSequenceCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CollateralSubstitutionSequenceCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}