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
import com.tools20022.repository.codeset.RateType1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies whether the rate is fixed or variable or a forfeit.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.RateType1Code#Fixed
 * RateType1Code.Fixed}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.RateType1Code#Forfeit
 * RateType1Code.Forfeit}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.RateType1Code#Variable
 * RateType1Code.Variable}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.InterestRateTypeCode
 * InterestRateTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"FIXE"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RateType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies whether the rate is fixed or variable or a forfeit."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class RateType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RateType1Code
	 * RateType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Fixed"</li>
	 * </ul>
	 */
	public static final RateType1Code Fixed = new RateType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Fixed";
			owner_lazy = () -> com.tools20022.repository.codeset.RateType1Code.mmObject();
			codeName = InterestRateTypeCode.Fixed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RateType1Code
	 * RateType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Forfeit"</li>
	 * </ul>
	 */
	public static final RateType1Code Forfeit = new RateType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Forfeit";
			owner_lazy = () -> com.tools20022.repository.codeset.RateType1Code.mmObject();
			codeName = InterestRateTypeCode.Forfeit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RateType1Code
	 * RateType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Variable"</li>
	 * </ul>
	 */
	public static final RateType1Code Variable = new RateType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Variable";
			owner_lazy = () -> com.tools20022.repository.codeset.RateType1Code.mmObject();
			codeName = InterestRateTypeCode.Variable.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, RateType1Code> codesByName = new LinkedHashMap<>();

	protected RateType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("FIXE");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RateType1Code";
				definition = "Specifies whether the rate is fixed or variable or a forfeit.";
				trace_lazy = () -> InterestRateTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.RateType1Code.Fixed, com.tools20022.repository.codeset.RateType1Code.Forfeit, com.tools20022.repository.codeset.RateType1Code.Variable);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Fixed.getCodeName().get(), Fixed);
		codesByName.put(Forfeit.getCodeName().get(), Forfeit);
		codesByName.put(Variable.getCodeName().get(), Variable);
	}

	public static RateType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static RateType1Code[] values() {
		RateType1Code[] values = new RateType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, RateType1Code> {
		@Override
		public RateType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(RateType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}