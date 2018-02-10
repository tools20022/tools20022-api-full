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
import com.tools20022.repository.codeset.CollateralSubstitutionType1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies if the collateral that is substituted was posted against the
 * variation margin or the independent amount.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CollateralSubstitutionType1Code#AgainstVariationMargin
 * CollateralSubstitutionType1Code.AgainstVariationMargin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CollateralSubstitutionType1Code#AgainstSegregatedIndependentAmount
 * CollateralSubstitutionType1Code.AgainstSegregatedIndependentAmount}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.CollateralSubstitutionTypeCode
 * CollateralSubstitutionTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"AVMG"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CollateralSubstitutionType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies if the collateral that is substituted was posted against the variation margin or the independent amount."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CollateralSubstitutionType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CollateralSubstitutionType1Code
	 * CollateralSubstitutionType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgainstVariationMargin"</li>
	 * </ul>
	 */
	public static final CollateralSubstitutionType1Code AgainstVariationMargin = new CollateralSubstitutionType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgainstVariationMargin";
			owner_lazy = () -> com.tools20022.repository.codeset.CollateralSubstitutionType1Code.mmObject();
			codeName = CollateralSubstitutionTypeCode.AgainstVariationMargin.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CollateralSubstitutionType1Code
	 * CollateralSubstitutionType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgainstSegregatedIndependentAmount"</li>
	 * </ul>
	 */
	public static final CollateralSubstitutionType1Code AgainstSegregatedIndependentAmount = new CollateralSubstitutionType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgainstSegregatedIndependentAmount";
			owner_lazy = () -> com.tools20022.repository.codeset.CollateralSubstitutionType1Code.mmObject();
			codeName = CollateralSubstitutionTypeCode.AgainstSegregatedIndependentAmount.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, CollateralSubstitutionType1Code> codesByName = new LinkedHashMap<>();

	protected CollateralSubstitutionType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("AVMG");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CollateralSubstitutionType1Code";
				definition = "Specifies if the collateral that is substituted was posted against the variation margin or the independent amount.";
				trace_lazy = () -> CollateralSubstitutionTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CollateralSubstitutionType1Code.AgainstVariationMargin, com.tools20022.repository.codeset.CollateralSubstitutionType1Code.AgainstSegregatedIndependentAmount);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AgainstVariationMargin.getCodeName().get(), AgainstVariationMargin);
		codesByName.put(AgainstSegregatedIndependentAmount.getCodeName().get(), AgainstSegregatedIndependentAmount);
	}

	public static CollateralSubstitutionType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CollateralSubstitutionType1Code[] values() {
		CollateralSubstitutionType1Code[] values = new CollateralSubstitutionType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CollateralSubstitutionType1Code> {
		@Override
		public CollateralSubstitutionType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CollateralSubstitutionType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}