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
import com.tools20022.repository.codeset.ProcessingPosition4Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies when a transaction/instruction is to be executed relative to a
 * linked transaction/instruction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProcessingPosition4Code#After
 * ProcessingPosition4Code.After}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProcessingPosition4Code#Before
 * ProcessingPosition4Code.Before}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProcessingPosition4Code#With
 * ProcessingPosition4Code.With}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.ProcessingPositionCode
 * ProcessingPositionCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"AFTE"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ProcessingPosition4Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies when a transaction/instruction is to be executed relative to a linked transaction/instruction."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ProcessingPosition4Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProcessingPosition4Code
	 * ProcessingPosition4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "After"</li>
	 * </ul>
	 */
	public static final ProcessingPosition4Code After = new ProcessingPosition4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "After";
			owner_lazy = () -> com.tools20022.repository.codeset.ProcessingPosition4Code.mmObject();
			codeName = ProcessingPositionCode.After.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProcessingPosition4Code
	 * ProcessingPosition4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Before"</li>
	 * </ul>
	 */
	public static final ProcessingPosition4Code Before = new ProcessingPosition4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Before";
			owner_lazy = () -> com.tools20022.repository.codeset.ProcessingPosition4Code.mmObject();
			codeName = ProcessingPositionCode.Before.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProcessingPosition4Code
	 * ProcessingPosition4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "With"</li>
	 * </ul>
	 */
	public static final ProcessingPosition4Code With = new ProcessingPosition4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "With";
			owner_lazy = () -> com.tools20022.repository.codeset.ProcessingPosition4Code.mmObject();
			codeName = ProcessingPositionCode.With.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, ProcessingPosition4Code> codesByName = new LinkedHashMap<>();

	protected ProcessingPosition4Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("AFTE");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ProcessingPosition4Code";
				definition = "Specifies when a transaction/instruction is to be executed relative to a linked transaction/instruction.";
				trace_lazy = () -> ProcessingPositionCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ProcessingPosition4Code.After, com.tools20022.repository.codeset.ProcessingPosition4Code.Before,
						com.tools20022.repository.codeset.ProcessingPosition4Code.With);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(After.getCodeName().get(), After);
		codesByName.put(Before.getCodeName().get(), Before);
		codesByName.put(With.getCodeName().get(), With);
	}

	public static ProcessingPosition4Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ProcessingPosition4Code[] values() {
		ProcessingPosition4Code[] values = new ProcessingPosition4Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ProcessingPosition4Code> {
		@Override
		public ProcessingPosition4Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ProcessingPosition4Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}