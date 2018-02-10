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
import com.tools20022.repository.codeset.WaivingInstruction2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the form of the rebate when commission is waived.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.WaivingInstruction2Code#WaiveInCash
 * WaivingInstruction2Code.WaiveInCash}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.WaivingInstruction2Code#WaiveInUnits
 * WaivingInstruction2Code.WaiveInUnits}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.WaivingInstruction2Code#Other
 * WaivingInstruction2Code.Other}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.WaivingInstructionCode
 * WaivingInstructionCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"WICA"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "WaivingInstruction2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the form of the rebate when commission is waived."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class WaivingInstruction2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.WaivingInstruction2Code
	 * WaivingInstruction2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WaiveInCash"</li>
	 * </ul>
	 */
	public static final WaivingInstruction2Code WaiveInCash = new WaivingInstruction2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WaiveInCash";
			owner_lazy = () -> com.tools20022.repository.codeset.WaivingInstruction2Code.mmObject();
			codeName = WaivingInstructionCode.WaiveInCash.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.WaivingInstruction2Code
	 * WaivingInstruction2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WaiveInUnits"</li>
	 * </ul>
	 */
	public static final WaivingInstruction2Code WaiveInUnits = new WaivingInstruction2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WaiveInUnits";
			owner_lazy = () -> com.tools20022.repository.codeset.WaivingInstruction2Code.mmObject();
			codeName = WaivingInstructionCode.WaiveInUnits.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.WaivingInstruction2Code
	 * WaivingInstruction2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * </ul>
	 */
	public static final WaivingInstruction2Code Other = new WaivingInstruction2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			owner_lazy = () -> com.tools20022.repository.codeset.WaivingInstruction2Code.mmObject();
			codeName = WaivingInstructionCode.Other.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, WaivingInstruction2Code> codesByName = new LinkedHashMap<>();

	protected WaivingInstruction2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("WICA");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "WaivingInstruction2Code";
				definition = "Specifies the form of the rebate when commission is waived.";
				trace_lazy = () -> WaivingInstructionCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.WaivingInstruction2Code.WaiveInCash, com.tools20022.repository.codeset.WaivingInstruction2Code.WaiveInUnits,
						com.tools20022.repository.codeset.WaivingInstruction2Code.Other);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(WaiveInCash.getCodeName().get(), WaiveInCash);
		codesByName.put(WaiveInUnits.getCodeName().get(), WaiveInUnits);
		codesByName.put(Other.getCodeName().get(), Other);
	}

	public static WaivingInstruction2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static WaivingInstruction2Code[] values() {
		WaivingInstruction2Code[] values = new WaivingInstruction2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, WaivingInstruction2Code> {
		@Override
		public WaivingInstruction2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(WaivingInstruction2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}