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
import com.tools20022.repository.codeset.MemoryUnit1Code.InternalXmlAdapter;
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
 * <li>{@linkplain com.tools20022.repository.codeset.MemoryUnit1Code#Byte
 * MemoryUnit1Code.Byte}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.MemoryUnit1Code#ExaByte
 * MemoryUnit1Code.ExaByte}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.MemoryUnit1Code#GigaByte
 * MemoryUnit1Code.GigaByte}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.MemoryUnit1Code#KiloByte
 * MemoryUnit1Code.KiloByte}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.MemoryUnit1Code#MegaByte
 * MemoryUnit1Code.MegaByte}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.MemoryUnit1Code#PetaByte
 * MemoryUnit1Code.PetaByte}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.MemoryUnit1Code#TeraByte
 * MemoryUnit1Code.TeraByte}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.MemoryUnitCode MemoryUnitCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MemoryUnit1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Unit of the memory size."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"BYTE"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class MemoryUnit1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MemoryUnit1Code
	 * MemoryUnit1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Byte"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MemoryUnit1Code Byte = new MemoryUnit1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Byte";
			owner_lazy = () -> com.tools20022.repository.codeset.MemoryUnit1Code.mmObject();
			codeName = MemoryUnitCode.Byte.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MemoryUnit1Code
	 * MemoryUnit1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExaByte"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MemoryUnit1Code ExaByte = new MemoryUnit1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExaByte";
			owner_lazy = () -> com.tools20022.repository.codeset.MemoryUnit1Code.mmObject();
			codeName = MemoryUnitCode.ExaByte.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MemoryUnit1Code
	 * MemoryUnit1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GigaByte"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MemoryUnit1Code GigaByte = new MemoryUnit1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GigaByte";
			owner_lazy = () -> com.tools20022.repository.codeset.MemoryUnit1Code.mmObject();
			codeName = MemoryUnitCode.GigaByte.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MemoryUnit1Code
	 * MemoryUnit1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KiloByte"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MemoryUnit1Code KiloByte = new MemoryUnit1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KiloByte";
			owner_lazy = () -> com.tools20022.repository.codeset.MemoryUnit1Code.mmObject();
			codeName = MemoryUnitCode.KiloByte.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MemoryUnit1Code
	 * MemoryUnit1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MegaByte"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MemoryUnit1Code MegaByte = new MemoryUnit1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MegaByte";
			owner_lazy = () -> com.tools20022.repository.codeset.MemoryUnit1Code.mmObject();
			codeName = MemoryUnitCode.MegaByte.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MemoryUnit1Code
	 * MemoryUnit1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PetaByte"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MemoryUnit1Code PetaByte = new MemoryUnit1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PetaByte";
			owner_lazy = () -> com.tools20022.repository.codeset.MemoryUnit1Code.mmObject();
			codeName = MemoryUnitCode.PetaByte.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MemoryUnit1Code
	 * MemoryUnit1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TeraByte"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MemoryUnit1Code TeraByte = new MemoryUnit1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TeraByte";
			owner_lazy = () -> com.tools20022.repository.codeset.MemoryUnit1Code.mmObject();
			codeName = MemoryUnitCode.TeraByte.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, MemoryUnit1Code> codesByName = new LinkedHashMap<>();

	protected MemoryUnit1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("BYTE");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MemoryUnit1Code";
				definition = "Unit of the memory size.";
				trace_lazy = () -> MemoryUnitCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.MemoryUnit1Code.Byte, com.tools20022.repository.codeset.MemoryUnit1Code.ExaByte, com.tools20022.repository.codeset.MemoryUnit1Code.GigaByte,
						com.tools20022.repository.codeset.MemoryUnit1Code.KiloByte, com.tools20022.repository.codeset.MemoryUnit1Code.MegaByte, com.tools20022.repository.codeset.MemoryUnit1Code.PetaByte,
						com.tools20022.repository.codeset.MemoryUnit1Code.TeraByte);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Byte.getCodeName().get(), Byte);
		codesByName.put(ExaByte.getCodeName().get(), ExaByte);
		codesByName.put(GigaByte.getCodeName().get(), GigaByte);
		codesByName.put(KiloByte.getCodeName().get(), KiloByte);
		codesByName.put(MegaByte.getCodeName().get(), MegaByte);
		codesByName.put(PetaByte.getCodeName().get(), PetaByte);
		codesByName.put(TeraByte.getCodeName().get(), TeraByte);
	}

	public static MemoryUnit1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static MemoryUnit1Code[] values() {
		MemoryUnit1Code[] values = new MemoryUnit1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, MemoryUnit1Code> {
		@Override
		public MemoryUnit1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(MemoryUnit1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}