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
 * Unit of the memory size.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.MemoryUnitCode#mmExaByte
 * MemoryUnitCode.mmExaByte}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.MemoryUnitCode#mmPetaByte
 * MemoryUnitCode.mmPetaByte}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.MemoryUnitCode#mmTeraByte
 * MemoryUnitCode.mmTeraByte}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.MemoryUnitCode#mmGigaByte
 * MemoryUnitCode.mmGigaByte}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.MemoryUnitCode#mmMegaByte
 * MemoryUnitCode.mmMegaByte}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.MemoryUnitCode#mmKiloByte
 * MemoryUnitCode.mmKiloByte}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.MemoryUnitCode#mmByte
 * MemoryUnitCode.mmByte}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.MemoryUnit1Code
 * MemoryUnit1Code}</li>
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
 * <li>"EXAB"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MemoryUnitCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Unit of the memory size."</li>
 * </ul>
 */
public class MemoryUnitCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Exa byte.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MemoryUnitCode
	 * MemoryUnitCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EXAB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExaByte"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Exa byte."</li>
	 * </ul>
	 */
	public static final MMCode mmExaByte = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExaByte";
			definition = "Exa byte.";
			owner_lazy = () -> MemoryUnitCode.mmObject();
			codeName = "EXAB";
		}
	};
	/**
	 * Peta byte.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MemoryUnitCode
	 * MemoryUnitCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PETA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PetaByte"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Peta byte."</li>
	 * </ul>
	 */
	public static final MMCode mmPetaByte = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PetaByte";
			definition = "Peta byte.";
			owner_lazy = () -> MemoryUnitCode.mmObject();
			codeName = "PETA";
		}
	};
	/**
	 * Tera byte.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MemoryUnitCode
	 * MemoryUnitCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TERA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TeraByte"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tera byte."</li>
	 * </ul>
	 */
	public static final MMCode mmTeraByte = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TeraByte";
			definition = "Tera byte.";
			owner_lazy = () -> MemoryUnitCode.mmObject();
			codeName = "TERA";
		}
	};
	/**
	 * Giga byte.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MemoryUnitCode
	 * MemoryUnitCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GIGA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GigaByte"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Giga byte."</li>
	 * </ul>
	 */
	public static final MMCode mmGigaByte = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GigaByte";
			definition = "Giga byte.";
			owner_lazy = () -> MemoryUnitCode.mmObject();
			codeName = "GIGA";
		}
	};
	/**
	 * Mega byte.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MemoryUnitCode
	 * MemoryUnitCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MEGA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MegaByte"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Mega byte."</li>
	 * </ul>
	 */
	public static final MMCode mmMegaByte = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MegaByte";
			definition = "Mega byte.";
			owner_lazy = () -> MemoryUnitCode.mmObject();
			codeName = "MEGA";
		}
	};
	/**
	 * Kilo byte.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MemoryUnitCode
	 * MemoryUnitCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "KILO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KiloByte"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Kilo byte."</li>
	 * </ul>
	 */
	public static final MMCode mmKiloByte = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "KiloByte";
			definition = "Kilo byte.";
			owner_lazy = () -> MemoryUnitCode.mmObject();
			codeName = "KILO";
		}
	};
	/**
	 * Byte.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MemoryUnitCode
	 * MemoryUnitCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BYTE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Byte"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Byte."</li>
	 * </ul>
	 */
	public static final MMCode mmByte = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Byte";
			definition = "Byte.";
			owner_lazy = () -> MemoryUnitCode.mmObject();
			codeName = "BYTE";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("EXAB");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MemoryUnitCode";
				definition = "Unit of the memory size.";
				code_lazy = () -> Arrays.asList(MemoryUnitCode.mmExaByte, MemoryUnitCode.mmPetaByte, MemoryUnitCode.mmTeraByte, MemoryUnitCode.mmGigaByte, MemoryUnitCode.mmMegaByte, MemoryUnitCode.mmKiloByte, MemoryUnitCode.mmByte);
				derivation_lazy = () -> Arrays.asList(MemoryUnit1Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}