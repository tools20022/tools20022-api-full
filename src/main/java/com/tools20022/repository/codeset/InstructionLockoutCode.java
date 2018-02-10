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
import com.tools20022.repository.codeset.InstructionLockoutCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies status of the instruction lock (for elections).
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionLockoutCode#SystemicLocked
 * InstructionLockoutCode.SystemicLocked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionLockoutCode#ManualLocked
 * InstructionLockoutCode.ManualLocked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionLockoutCode#NotLocked
 * InstructionLockoutCode.NotLocked}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.InstructionLockout1Code
 * InstructionLockout1Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"SYLK"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "InstructionLockoutCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies status of the instruction lock (for elections)."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class InstructionLockoutCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * System suspended elections processing based on business rules.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionLockoutCode
	 * InstructionLockoutCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SYLK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SystemicLocked"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "System suspended elections processing based on business rules."</li>
	 * </ul>
	 */
	public static final InstructionLockoutCode SystemicLocked = new InstructionLockoutCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SystemicLocked";
			definition = "System suspended elections processing based on business rules.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionLockoutCode.mmObject();
			codeName = "SYLK";
		}
	};
	/**
	 * DTC (the Depository Trust Company) personnel suspended elections
	 * processing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionLockoutCode
	 * InstructionLockoutCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MALK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ManualLocked"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "DTC (the Depository Trust Company) personnel suspended elections processing."
	 * </li>
	 * </ul>
	 */
	public static final InstructionLockoutCode ManualLocked = new InstructionLockoutCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ManualLocked";
			definition = "DTC (the Depository Trust Company) personnel suspended elections processing.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionLockoutCode.mmObject();
			codeName = "MALK";
		}
	};
	/**
	 * Eligible for elections processing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionLockoutCode
	 * InstructionLockoutCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NOLO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotLocked"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Eligible for elections processing."</li>
	 * </ul>
	 */
	public static final InstructionLockoutCode NotLocked = new InstructionLockoutCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotLocked";
			definition = "Eligible for elections processing.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionLockoutCode.mmObject();
			codeName = "NOLO";
		}
	};
	final static private LinkedHashMap<String, InstructionLockoutCode> codesByName = new LinkedHashMap<>();

	protected InstructionLockoutCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("SYLK");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InstructionLockoutCode";
				definition = "Specifies status of the instruction lock (for elections).";
				derivation_lazy = () -> Arrays.asList(InstructionLockout1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.InstructionLockoutCode.SystemicLocked, com.tools20022.repository.codeset.InstructionLockoutCode.ManualLocked,
						com.tools20022.repository.codeset.InstructionLockoutCode.NotLocked);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(SystemicLocked.getCodeName().get(), SystemicLocked);
		codesByName.put(ManualLocked.getCodeName().get(), ManualLocked);
		codesByName.put(NotLocked.getCodeName().get(), NotLocked);
	}

	public static InstructionLockoutCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static InstructionLockoutCode[] values() {
		InstructionLockoutCode[] values = new InstructionLockoutCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, InstructionLockoutCode> {
		@Override
		public InstructionLockoutCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(InstructionLockoutCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}