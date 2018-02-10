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
import com.tools20022.repository.codeset.CollateralSubstitutionSequence1Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.CollateralSubstitutionSequence1Code#Initial
 * CollateralSubstitutionSequence1Code.Initial}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CollateralSubstitutionSequence1Code#Updated
 * CollateralSubstitutionSequence1Code.Updated}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.CollateralSubstitutionSequenceCode
 * CollateralSubstitutionSequenceCode}</li>
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
 * "CollateralSubstitutionSequence1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Indicates whether the collateral substitution request is new or updated."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CollateralSubstitutionSequence1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CollateralSubstitutionSequence1Code
	 * CollateralSubstitutionSequence1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Initial"</li>
	 * </ul>
	 */
	public static final CollateralSubstitutionSequence1Code Initial = new CollateralSubstitutionSequence1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Initial";
			owner_lazy = () -> com.tools20022.repository.codeset.CollateralSubstitutionSequence1Code.mmObject();
			codeName = CollateralSubstitutionSequenceCode.Initial.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CollateralSubstitutionSequence1Code
	 * CollateralSubstitutionSequence1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Updated"</li>
	 * </ul>
	 */
	public static final CollateralSubstitutionSequence1Code Updated = new CollateralSubstitutionSequence1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Updated";
			owner_lazy = () -> com.tools20022.repository.codeset.CollateralSubstitutionSequence1Code.mmObject();
			codeName = CollateralSubstitutionSequenceCode.Updated.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, CollateralSubstitutionSequence1Code> codesByName = new LinkedHashMap<>();

	protected CollateralSubstitutionSequence1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("INIT");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CollateralSubstitutionSequence1Code";
				definition = "Indicates whether the collateral substitution request is new or updated.";
				trace_lazy = () -> CollateralSubstitutionSequenceCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CollateralSubstitutionSequence1Code.Initial, com.tools20022.repository.codeset.CollateralSubstitutionSequence1Code.Updated);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Initial.getCodeName().get(), Initial);
		codesByName.put(Updated.getCodeName().get(), Updated);
	}

	public static CollateralSubstitutionSequence1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CollateralSubstitutionSequence1Code[] values() {
		CollateralSubstitutionSequence1Code[] values = new CollateralSubstitutionSequence1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CollateralSubstitutionSequence1Code> {
		@Override
		public CollateralSubstitutionSequence1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CollateralSubstitutionSequence1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}