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
import com.tools20022.repository.codeset.IndependentAmountConventionType1Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.IndependentAmountConventionType1Code#NettedBeforeThreshold
 * IndependentAmountConventionType1Code.NettedBeforeThreshold}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IndependentAmountConventionType1Code#NettedAfterThreshold
 * IndependentAmountConventionType1Code.NettedAfterThreshold}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IndependentAmountConventionType1Code#Segregated
 * IndependentAmountConventionType1Code.Segregated}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.IndependentAmountConventionTypeCode
 * IndependentAmountConventionTypeCode}</li>
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
 * "IndependentAmountConventionType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Determines how the independent amount was applied in the margin calculation."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class IndependentAmountConventionType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IndependentAmountConventionType1Code
	 * IndependentAmountConventionType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NettedBeforeThreshold"</li>
	 * </ul>
	 */
	public static final IndependentAmountConventionType1Code NettedBeforeThreshold = new IndependentAmountConventionType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NettedBeforeThreshold";
			owner_lazy = () -> com.tools20022.repository.codeset.IndependentAmountConventionType1Code.mmObject();
			codeName = IndependentAmountConventionTypeCode.NettedBeforeThreshold.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IndependentAmountConventionType1Code
	 * IndependentAmountConventionType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NettedAfterThreshold"</li>
	 * </ul>
	 */
	public static final IndependentAmountConventionType1Code NettedAfterThreshold = new IndependentAmountConventionType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NettedAfterThreshold";
			owner_lazy = () -> com.tools20022.repository.codeset.IndependentAmountConventionType1Code.mmObject();
			codeName = IndependentAmountConventionTypeCode.NettedAfterThreshold.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IndependentAmountConventionType1Code
	 * IndependentAmountConventionType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Segregated"</li>
	 * </ul>
	 */
	public static final IndependentAmountConventionType1Code Segregated = new IndependentAmountConventionType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Segregated";
			owner_lazy = () -> com.tools20022.repository.codeset.IndependentAmountConventionType1Code.mmObject();
			codeName = IndependentAmountConventionTypeCode.Segregated.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, IndependentAmountConventionType1Code> codesByName = new LinkedHashMap<>();

	protected IndependentAmountConventionType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("NBTR");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "IndependentAmountConventionType1Code";
				definition = "Determines how the independent amount was applied in the margin calculation.";
				trace_lazy = () -> IndependentAmountConventionTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.IndependentAmountConventionType1Code.NettedBeforeThreshold, com.tools20022.repository.codeset.IndependentAmountConventionType1Code.NettedAfterThreshold,
						com.tools20022.repository.codeset.IndependentAmountConventionType1Code.Segregated);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(NettedBeforeThreshold.getCodeName().get(), NettedBeforeThreshold);
		codesByName.put(NettedAfterThreshold.getCodeName().get(), NettedAfterThreshold);
		codesByName.put(Segregated.getCodeName().get(), Segregated);
	}

	public static IndependentAmountConventionType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static IndependentAmountConventionType1Code[] values() {
		IndependentAmountConventionType1Code[] values = new IndependentAmountConventionType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, IndependentAmountConventionType1Code> {
		@Override
		public IndependentAmountConventionType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(IndependentAmountConventionType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}