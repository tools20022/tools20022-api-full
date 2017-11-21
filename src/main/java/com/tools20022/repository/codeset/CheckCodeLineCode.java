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
 * Format of the check code line.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.CheckCodeLineCode#mmCMC7
 * CheckCodeLineCode.mmCMC7}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CheckCodeLineCode#mmE13B
 * CheckCodeLineCode.mmE13B}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CheckCodeLineCode#mmOCRA
 * CheckCodeLineCode.mmOCRA}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CheckCodeLineCode#mmOCRB
 * CheckCodeLineCode.mmOCRB}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CheckCodeLineCode#mmOCRDefault
 * CheckCodeLineCode.mmOCRDefault}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.CheckCodeLine1Code
 * CheckCodeLine1Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CheckCodeLineCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Format of the check code line."</li>
 * </ul>
 */
public class CheckCodeLineCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Magnetic ink character digitally encoded with 7 sticks.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CheckCodeLineCode
	 * CheckCodeLineCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CMC7"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CMC7"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Magnetic ink character digitally encoded with 7 sticks."</li>
	 * </ul>
	 */
	public static final MMCode mmCMC7 = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CMC7";
			definition = "Magnetic ink character digitally encoded with 7 sticks.";
			owner_lazy = () -> CheckCodeLineCode.mmObject();
			codeName = "CMC7";
		}
	};
	/**
	 * Magnetic ink character recognition.,conform to ISO 1004.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CheckCodeLineCode
	 * CheckCodeLineCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "E13B"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "E13B"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Magnetic ink character recognition.,conform to ISO 1004."</li>
	 * </ul>
	 */
	public static final MMCode mmE13B = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "E13B";
			definition = "Magnetic ink character recognition.,conform to ISO 1004.";
			owner_lazy = () -> CheckCodeLineCode.mmObject();
			codeName = "E13B";
		}
	};
	/**
	 * Optical character recognition font A, conform to ANSI X3.17:1981.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CheckCodeLineCode
	 * CheckCodeLineCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OCRA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OCRA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Optical character recognition font A, conform to ANSI X3.17:1981."</li>
	 * </ul>
	 */
	public static final MMCode mmOCRA = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OCRA";
			definition = "Optical character recognition font A, conform to ANSI X3.17:1981.";
			owner_lazy = () -> CheckCodeLineCode.mmObject();
			codeName = "OCRA";
		}
	};
	/**
	 * Optical character recognition font B, conform to ANSI X3.49:1975.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CheckCodeLineCode
	 * CheckCodeLineCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OCRB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OCRB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Optical character recognition font B, conform to ANSI X3.49:1975."</li>
	 * </ul>
	 */
	public static final MMCode mmOCRB = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OCRB";
			definition = "Optical character recognition font B, conform to ANSI X3.49:1975.";
			owner_lazy = () -> CheckCodeLineCode.mmObject();
			codeName = "OCRB";
		}
	};
	/**
	 * Default optical character recognition used.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CheckCodeLineCode
	 * CheckCodeLineCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OCRF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OCRDefault"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Default optical character recognition used."</li>
	 * </ul>
	 */
	public static final MMCode mmOCRDefault = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OCRDefault";
			definition = "Default optical character recognition used.";
			owner_lazy = () -> CheckCodeLineCode.mmObject();
			codeName = "OCRF";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CheckCodeLineCode";
				definition = "Format of the check code line.";
				code_lazy = () -> Arrays.asList(CheckCodeLineCode.mmCMC7, CheckCodeLineCode.mmE13B, CheckCodeLineCode.mmOCRA, CheckCodeLineCode.mmOCRB, CheckCodeLineCode.mmOCRDefault);
				derivation_lazy = () -> Arrays.asList(CheckCodeLine1Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}