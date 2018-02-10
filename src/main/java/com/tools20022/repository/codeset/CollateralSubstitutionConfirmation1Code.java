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
import com.tools20022.repository.codeset.CollateralSubstitutionConfirmation1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Provides the status of the collateral substitution, either returned or
 * released.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CollateralSubstitutionConfirmation1Code#CollateralSubstitutionReleased
 * CollateralSubstitutionConfirmation1Code.CollateralSubstitutionReleased}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CollateralSubstitutionConfirmation1Code#CollateralSubstitutionReturned
 * CollateralSubstitutionConfirmation1Code.CollateralSubstitutionReturned}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.CollateralSubstitutionConfirmationCode
 * CollateralSubstitutionConfirmationCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"CREL"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CollateralSubstitutionConfirmation1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides the status of the collateral substitution, either returned or released."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CollateralSubstitutionConfirmation1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CollateralSubstitutionConfirmation1Code
	 * CollateralSubstitutionConfirmation1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralSubstitutionReleased"</li>
	 * </ul>
	 */
	public static final CollateralSubstitutionConfirmation1Code CollateralSubstitutionReleased = new CollateralSubstitutionConfirmation1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralSubstitutionReleased";
			owner_lazy = () -> com.tools20022.repository.codeset.CollateralSubstitutionConfirmation1Code.mmObject();
			codeName = CollateralSubstitutionConfirmationCode.CollateralSubstitutionReleased.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CollateralSubstitutionConfirmation1Code
	 * CollateralSubstitutionConfirmation1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralSubstitutionReturned"</li>
	 * </ul>
	 */
	public static final CollateralSubstitutionConfirmation1Code CollateralSubstitutionReturned = new CollateralSubstitutionConfirmation1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralSubstitutionReturned";
			owner_lazy = () -> com.tools20022.repository.codeset.CollateralSubstitutionConfirmation1Code.mmObject();
			codeName = CollateralSubstitutionConfirmationCode.CollateralSubstitutionReturned.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, CollateralSubstitutionConfirmation1Code> codesByName = new LinkedHashMap<>();

	protected CollateralSubstitutionConfirmation1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("CREL");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CollateralSubstitutionConfirmation1Code";
				definition = "Provides the status of the collateral substitution, either returned or released.";
				trace_lazy = () -> CollateralSubstitutionConfirmationCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CollateralSubstitutionConfirmation1Code.CollateralSubstitutionReleased,
						com.tools20022.repository.codeset.CollateralSubstitutionConfirmation1Code.CollateralSubstitutionReturned);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(CollateralSubstitutionReleased.getCodeName().get(), CollateralSubstitutionReleased);
		codesByName.put(CollateralSubstitutionReturned.getCodeName().get(), CollateralSubstitutionReturned);
	}

	public static CollateralSubstitutionConfirmation1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CollateralSubstitutionConfirmation1Code[] values() {
		CollateralSubstitutionConfirmation1Code[] values = new CollateralSubstitutionConfirmation1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CollateralSubstitutionConfirmation1Code> {
		@Override
		public CollateralSubstitutionConfirmation1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CollateralSubstitutionConfirmation1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}