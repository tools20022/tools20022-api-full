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
import com.tools20022.repository.codeset.WaivingInstruction1Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.WaivingInstruction1Code#WaiveInCash
 * WaivingInstruction1Code.WaiveInCash}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.WaivingInstruction1Code#WaiveInUnits
 * WaivingInstruction1Code.WaiveInUnits}</li>
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
 * "WaivingInstruction1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the form of the rebate when commission is waived."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class WaivingInstruction1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.WaivingInstruction1Code
	 * WaivingInstruction1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WaiveInCash"</li>
	 * </ul>
	 */
	public static final WaivingInstruction1Code WaiveInCash = new WaivingInstruction1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WaiveInCash";
			owner_lazy = () -> com.tools20022.repository.codeset.WaivingInstruction1Code.mmObject();
			codeName = WaivingInstructionCode.WaiveInCash.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.WaivingInstruction1Code
	 * WaivingInstruction1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WaiveInUnits"</li>
	 * </ul>
	 */
	public static final WaivingInstruction1Code WaiveInUnits = new WaivingInstruction1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WaiveInUnits";
			owner_lazy = () -> com.tools20022.repository.codeset.WaivingInstruction1Code.mmObject();
			codeName = WaivingInstructionCode.WaiveInUnits.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, WaivingInstruction1Code> codesByName = new LinkedHashMap<>();

	protected WaivingInstruction1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("WICA");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "WaivingInstruction1Code";
				definition = "Specifies the form of the rebate when commission is waived.";
				trace_lazy = () -> WaivingInstructionCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.WaivingInstruction1Code.WaiveInCash, com.tools20022.repository.codeset.WaivingInstruction1Code.WaiveInUnits);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(WaiveInCash.getCodeName().get(), WaiveInCash);
		codesByName.put(WaiveInUnits.getCodeName().get(), WaiveInUnits);
	}

	public static WaivingInstruction1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static WaivingInstruction1Code[] values() {
		WaivingInstruction1Code[] values = new WaivingInstruction1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, WaivingInstruction1Code> {
		@Override
		public WaivingInstruction1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(WaivingInstruction1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}