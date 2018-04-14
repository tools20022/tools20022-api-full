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
import com.tools20022.repository.codeset.ProcessingPosition1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Indicates when an instruction is to be executed relative to a linked
 * instruction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProcessingPosition1Code#After
 * ProcessingPosition1Code.After}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProcessingPosition1Code#With
 * ProcessingPosition1Code.With}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProcessingPosition1Code#Before
 * ProcessingPosition1Code.Before}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ProcessingPosition1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Indicates when an instruction is to be executed relative to a linked instruction."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"AFTR"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ProcessingPosition1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Indicates that the instruction is to be executed after the linked
	 * instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProcessingPosition1Code
	 * ProcessingPosition1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AFTR"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "After"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that the instruction is to be executed after the linked instruction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final ProcessingPosition1Code After = new ProcessingPosition1Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "After";
			definition = "Indicates that the instruction is to be executed after the linked instruction.";
			owner_lazy = () -> com.tools20022.repository.codeset.ProcessingPosition1Code.mmObject();
			codeName = "AFTR";
		}
	};
	/**
	 * Indicates that the instruction is to be executed with the linked
	 * instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProcessingPosition1Code
	 * ProcessingPosition1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WITH"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "With"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that the instruction is to be executed with the linked instruction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final ProcessingPosition1Code With = new ProcessingPosition1Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "With";
			definition = "Indicates that the instruction is to be executed with the linked instruction.";
			owner_lazy = () -> com.tools20022.repository.codeset.ProcessingPosition1Code.mmObject();
			codeName = "WITH";
		}
	};
	/**
	 * Indicates that the instruction is to be executed before the linked
	 * instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProcessingPosition1Code
	 * ProcessingPosition1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BEFR"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Before"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that the instruction is to be executed before the linked instruction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final ProcessingPosition1Code Before = new ProcessingPosition1Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Before";
			definition = "Indicates that the instruction is to be executed before the linked instruction.";
			owner_lazy = () -> com.tools20022.repository.codeset.ProcessingPosition1Code.mmObject();
			codeName = "BEFR";
		}
	};
	final static private LinkedHashMap<String, ProcessingPosition1Code> codesByName = new LinkedHashMap<>();

	protected ProcessingPosition1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("AFTR");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ProcessingPosition1Code";
				definition = "Indicates when an instruction is to be executed relative to a linked instruction.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ProcessingPosition1Code.After, com.tools20022.repository.codeset.ProcessingPosition1Code.With,
						com.tools20022.repository.codeset.ProcessingPosition1Code.Before);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(After.getCodeName().get(), After);
		codesByName.put(With.getCodeName().get(), With);
		codesByName.put(Before.getCodeName().get(), Before);
	}

	public static ProcessingPosition1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ProcessingPosition1Code[] values() {
		ProcessingPosition1Code[] values = new ProcessingPosition1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ProcessingPosition1Code> {
		@Override
		public ProcessingPosition1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ProcessingPosition1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}