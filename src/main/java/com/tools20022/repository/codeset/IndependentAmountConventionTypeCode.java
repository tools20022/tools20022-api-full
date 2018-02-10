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
import com.tools20022.repository.codeset.IndependentAmountConventionTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Determines how the independent amount was applied in the margin calculation.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IndependentAmountConventionTypeCode#NettedBeforeThreshold
 * IndependentAmountConventionTypeCode.NettedBeforeThreshold}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IndependentAmountConventionTypeCode#NettedAfterThreshold
 * IndependentAmountConventionTypeCode.NettedAfterThreshold}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IndependentAmountConventionTypeCode#Segregated
 * IndependentAmountConventionTypeCode.Segregated}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IndependentAmountConventionType1Code
 * IndependentAmountConventionType1Code}</li>
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
 * <li>"NBTR"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "IndependentAmountConventionTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Determines how the independent amount was applied in the margin calculation."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class IndependentAmountConventionTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Independent amount is an add on to exposure.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IndependentAmountConventionTypeCode
	 * IndependentAmountConventionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NBTR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NettedBeforeThreshold"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Independent amount is an add on to exposure."</li>
	 * </ul>
	 */
	public static final IndependentAmountConventionTypeCode NettedBeforeThreshold = new IndependentAmountConventionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NettedBeforeThreshold";
			definition = "Independent amount is an add on to exposure.";
			owner_lazy = () -> com.tools20022.repository.codeset.IndependentAmountConventionTypeCode.mmObject();
			codeName = "NBTR";
		}
	};
	/**
	 * Independent amount is an add on to the credit support amount and forms
	 * part of the variation margin requirement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IndependentAmountConventionTypeCode
	 * IndependentAmountConventionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NATR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NettedAfterThreshold"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Independent amount is an add on to the credit support amount and forms part of the variation margin requirement."
	 * </li>
	 * </ul>
	 */
	public static final IndependentAmountConventionTypeCode NettedAfterThreshold = new IndependentAmountConventionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NettedAfterThreshold";
			definition = "Independent amount is an add on to the credit support amount and forms part of the variation margin requirement.";
			owner_lazy = () -> com.tools20022.repository.codeset.IndependentAmountConventionTypeCode.mmObject();
			codeName = "NATR";
		}
	};
	/**
	 * Independent amount is treated independently of variation margin for
	 * segregation purposes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IndependentAmountConventionTypeCode
	 * IndependentAmountConventionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SEGR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Segregated"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Independent amount is treated independently of variation margin for segregation purposes."
	 * </li>
	 * </ul>
	 */
	public static final IndependentAmountConventionTypeCode Segregated = new IndependentAmountConventionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Segregated";
			definition = "Independent amount is treated independently of variation margin for segregation purposes.";
			owner_lazy = () -> com.tools20022.repository.codeset.IndependentAmountConventionTypeCode.mmObject();
			codeName = "SEGR";
		}
	};
	final static private LinkedHashMap<String, IndependentAmountConventionTypeCode> codesByName = new LinkedHashMap<>();

	protected IndependentAmountConventionTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("NBTR");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "IndependentAmountConventionTypeCode";
				definition = "Determines how the independent amount was applied in the margin calculation.";
				derivation_lazy = () -> Arrays.asList(IndependentAmountConventionType1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.IndependentAmountConventionTypeCode.NettedBeforeThreshold, com.tools20022.repository.codeset.IndependentAmountConventionTypeCode.NettedAfterThreshold,
						com.tools20022.repository.codeset.IndependentAmountConventionTypeCode.Segregated);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(NettedBeforeThreshold.getCodeName().get(), NettedBeforeThreshold);
		codesByName.put(NettedAfterThreshold.getCodeName().get(), NettedAfterThreshold);
		codesByName.put(Segregated.getCodeName().get(), Segregated);
	}

	public static IndependentAmountConventionTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static IndependentAmountConventionTypeCode[] values() {
		IndependentAmountConventionTypeCode[] values = new IndependentAmountConventionTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, IndependentAmountConventionTypeCode> {
		@Override
		public IndependentAmountConventionTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(IndependentAmountConventionTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}