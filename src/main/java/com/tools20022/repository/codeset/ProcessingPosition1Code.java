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
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Indicates when an instruction is to be executed relative to a linked
 * instruction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProcessingPosition1Code#mmAfter
 * ProcessingPosition1Code.mmAfter}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProcessingPosition1Code#mmWith
 * ProcessingPosition1Code.mmWith}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProcessingPosition1Code#mmBefore
 * ProcessingPosition1Code.mmBefore}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ProcessingPosition1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Indicates when an instruction is to be executed relative to a linked instruction."
 * </li>
 * </ul>
 */
public class ProcessingPosition1Code {

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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "After"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that the instruction is to be executed after the linked instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmAfter = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "After";
			definition = "Indicates that the instruction is to be executed after the linked instruction.";
			owner_lazy = () -> ProcessingPosition1Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "With"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that the instruction is to be executed with the linked instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmWith = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "With";
			definition = "Indicates that the instruction is to be executed with the linked instruction.";
			owner_lazy = () -> ProcessingPosition1Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Before"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that the instruction is to be executed before the linked instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmBefore = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Before";
			definition = "Indicates that the instruction is to be executed before the linked instruction.";
			owner_lazy = () -> ProcessingPosition1Code.mmObject();
			codeName = "BEFR";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("AFTR");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ProcessingPosition1Code";
				definition = "Indicates when an instruction is to be executed relative to a linked instruction.";
				code_lazy = () -> Arrays.asList(ProcessingPosition1Code.mmAfter, ProcessingPosition1Code.mmWith, ProcessingPosition1Code.mmBefore);
			}
		});
		return mmObject_lazy.get();
	}
}