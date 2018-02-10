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
import com.tools20022.repository.codeset.ValuationTiming1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies how the price valuation timing is done based on the timeline
 * defined in the prospectus.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ValuationTiming1Code#Exceptional
 * ValuationTiming1Code.Exceptional}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ValuationTiming1Code#Usual
 * ValuationTiming1Code.Usual}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ValuationTiming1Code#Particular
 * ValuationTiming1Code.Particular}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.ValuationTimingCode
 * ValuationTimingCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"EXCP"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ValuationTiming1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies how the price valuation timing is done based on the timeline defined in the prospectus."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ValuationTiming1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ValuationTiming1Code
	 * ValuationTiming1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Exceptional"</li>
	 * </ul>
	 */
	public static final ValuationTiming1Code Exceptional = new ValuationTiming1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Exceptional";
			owner_lazy = () -> com.tools20022.repository.codeset.ValuationTiming1Code.mmObject();
			codeName = ValuationTimingCode.Exceptional.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ValuationTiming1Code
	 * ValuationTiming1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Usual"</li>
	 * </ul>
	 */
	public static final ValuationTiming1Code Usual = new ValuationTiming1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Usual";
			owner_lazy = () -> com.tools20022.repository.codeset.ValuationTiming1Code.mmObject();
			codeName = ValuationTimingCode.Usual.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ValuationTiming1Code
	 * ValuationTiming1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Particular"</li>
	 * </ul>
	 */
	public static final ValuationTiming1Code Particular = new ValuationTiming1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Particular";
			owner_lazy = () -> com.tools20022.repository.codeset.ValuationTiming1Code.mmObject();
			codeName = ValuationTimingCode.Particular.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, ValuationTiming1Code> codesByName = new LinkedHashMap<>();

	protected ValuationTiming1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("EXCP");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ValuationTiming1Code";
				definition = "Specifies how the price valuation timing is done based on the timeline defined in the prospectus.";
				trace_lazy = () -> ValuationTimingCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ValuationTiming1Code.Exceptional, com.tools20022.repository.codeset.ValuationTiming1Code.Usual,
						com.tools20022.repository.codeset.ValuationTiming1Code.Particular);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Exceptional.getCodeName().get(), Exceptional);
		codesByName.put(Usual.getCodeName().get(), Usual);
		codesByName.put(Particular.getCodeName().get(), Particular);
	}

	public static ValuationTiming1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ValuationTiming1Code[] values() {
		ValuationTiming1Code[] values = new ValuationTiming1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ValuationTiming1Code> {
		@Override
		public ValuationTiming1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ValuationTiming1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}