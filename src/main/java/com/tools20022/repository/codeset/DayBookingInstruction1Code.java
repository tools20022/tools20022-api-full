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
import com.tools20022.repository.codeset.DayBookingInstruction1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Describes of the nature of execution booking process.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DayBookingInstruction1Code#Auto
 * DayBookingInstruction1Code.Auto}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DayBookingInstruction1Code#SpeakFirst
 * DayBookingInstruction1Code.SpeakFirst}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.DayBookingInstructionCode
 * DayBookingInstructionCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"AUTO"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DayBookingInstruction1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Describes of the nature of execution booking process."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class DayBookingInstruction1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DayBookingInstruction1Code
	 * DayBookingInstruction1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Auto"</li>
	 * </ul>
	 */
	public static final DayBookingInstruction1Code Auto = new DayBookingInstruction1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Auto";
			owner_lazy = () -> com.tools20022.repository.codeset.DayBookingInstruction1Code.mmObject();
			codeName = DayBookingInstructionCode.Auto.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DayBookingInstruction1Code
	 * DayBookingInstruction1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpeakFirst"</li>
	 * </ul>
	 */
	public static final DayBookingInstruction1Code SpeakFirst = new DayBookingInstruction1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpeakFirst";
			owner_lazy = () -> com.tools20022.repository.codeset.DayBookingInstruction1Code.mmObject();
			codeName = DayBookingInstructionCode.SpeakFirst.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, DayBookingInstruction1Code> codesByName = new LinkedHashMap<>();

	protected DayBookingInstruction1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("AUTO");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DayBookingInstruction1Code";
				definition = "Describes of the nature of execution booking process.";
				trace_lazy = () -> DayBookingInstructionCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DayBookingInstruction1Code.Auto, com.tools20022.repository.codeset.DayBookingInstruction1Code.SpeakFirst);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Auto.getCodeName().get(), Auto);
		codesByName.put(SpeakFirst.getCodeName().get(), SpeakFirst);
	}

	public static DayBookingInstruction1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static DayBookingInstruction1Code[] values() {
		DayBookingInstruction1Code[] values = new DayBookingInstruction1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, DayBookingInstruction1Code> {
		@Override
		public DayBookingInstruction1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(DayBookingInstruction1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}