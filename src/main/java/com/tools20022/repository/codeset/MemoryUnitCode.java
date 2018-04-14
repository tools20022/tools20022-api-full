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
import com.tools20022.repository.codeset.MemoryUnitCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Unit of the memory size.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.MemoryUnitCode#ExaByte
 * MemoryUnitCode.ExaByte}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.MemoryUnitCode#PetaByte
 * MemoryUnitCode.PetaByte}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.MemoryUnitCode#TeraByte
 * MemoryUnitCode.TeraByte}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.MemoryUnitCode#GigaByte
 * MemoryUnitCode.GigaByte}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.MemoryUnitCode#MegaByte
 * MemoryUnitCode.MegaByte}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.MemoryUnitCode#KiloByte
 * MemoryUnitCode.KiloByte}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.MemoryUnitCode#Byte
 * MemoryUnitCode.Byte}</li>
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MemoryUnitCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Unit of the memory size."</li>
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
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class MemoryUnitCode extends MMCode {

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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExaByte"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Exa byte."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MemoryUnitCode ExaByte = new MemoryUnitCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExaByte";
			definition = "Exa byte.";
			owner_lazy = () -> com.tools20022.repository.codeset.MemoryUnitCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PetaByte"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Peta byte."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MemoryUnitCode PetaByte = new MemoryUnitCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PetaByte";
			definition = "Peta byte.";
			owner_lazy = () -> com.tools20022.repository.codeset.MemoryUnitCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TeraByte"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tera byte."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MemoryUnitCode TeraByte = new MemoryUnitCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TeraByte";
			definition = "Tera byte.";
			owner_lazy = () -> com.tools20022.repository.codeset.MemoryUnitCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GigaByte"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Giga byte."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MemoryUnitCode GigaByte = new MemoryUnitCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GigaByte";
			definition = "Giga byte.";
			owner_lazy = () -> com.tools20022.repository.codeset.MemoryUnitCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MegaByte"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Mega byte."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MemoryUnitCode MegaByte = new MemoryUnitCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MegaByte";
			definition = "Mega byte.";
			owner_lazy = () -> com.tools20022.repository.codeset.MemoryUnitCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KiloByte"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Kilo byte."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MemoryUnitCode KiloByte = new MemoryUnitCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "KiloByte";
			definition = "Kilo byte.";
			owner_lazy = () -> com.tools20022.repository.codeset.MemoryUnitCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Byte"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Byte."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MemoryUnitCode Byte = new MemoryUnitCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Byte";
			definition = "Byte.";
			owner_lazy = () -> com.tools20022.repository.codeset.MemoryUnitCode.mmObject();
			codeName = "BYTE";
		}
	};
	final static private LinkedHashMap<String, MemoryUnitCode> codesByName = new LinkedHashMap<>();

	protected MemoryUnitCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("EXAB");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MemoryUnitCode";
				definition = "Unit of the memory size.";
				derivation_lazy = () -> Arrays.asList(MemoryUnit1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.MemoryUnitCode.ExaByte, com.tools20022.repository.codeset.MemoryUnitCode.PetaByte, com.tools20022.repository.codeset.MemoryUnitCode.TeraByte,
						com.tools20022.repository.codeset.MemoryUnitCode.GigaByte, com.tools20022.repository.codeset.MemoryUnitCode.MegaByte, com.tools20022.repository.codeset.MemoryUnitCode.KiloByte,
						com.tools20022.repository.codeset.MemoryUnitCode.Byte);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(ExaByte.getCodeName().get(), ExaByte);
		codesByName.put(PetaByte.getCodeName().get(), PetaByte);
		codesByName.put(TeraByte.getCodeName().get(), TeraByte);
		codesByName.put(GigaByte.getCodeName().get(), GigaByte);
		codesByName.put(MegaByte.getCodeName().get(), MegaByte);
		codesByName.put(KiloByte.getCodeName().get(), KiloByte);
		codesByName.put(Byte.getCodeName().get(), Byte);
	}

	public static MemoryUnitCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static MemoryUnitCode[] values() {
		MemoryUnitCode[] values = new MemoryUnitCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, MemoryUnitCode> {
		@Override
		public MemoryUnitCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(MemoryUnitCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}