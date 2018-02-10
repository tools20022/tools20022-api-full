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
import com.tools20022.repository.codeset.InstructionQueryType1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of instruction queried.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionQueryType1Code#SettlementInstruction
 * InstructionQueryType1Code.SettlementInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionQueryType1Code#IntraPositionMovement
 * InstructionQueryType1Code.IntraPositionMovement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionQueryType1Code#SettlementAndIntraPosition
 * InstructionQueryType1Code.SettlementAndIntraPosition}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.InstructionQueryTypeCode
 * InstructionQueryTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"SETT"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "InstructionQueryType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of instruction queried."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class InstructionQueryType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionQueryType1Code
	 * InstructionQueryType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementInstruction"</li>
	 * </ul>
	 */
	public static final InstructionQueryType1Code SettlementInstruction = new InstructionQueryType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementInstruction";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionQueryType1Code.mmObject();
			codeName = InstructionQueryTypeCode.SettlementInstruction.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionQueryType1Code
	 * InstructionQueryType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntraPositionMovement"</li>
	 * </ul>
	 */
	public static final InstructionQueryType1Code IntraPositionMovement = new InstructionQueryType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntraPositionMovement";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionQueryType1Code.mmObject();
			codeName = InstructionQueryTypeCode.IntraPositionMovement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionQueryType1Code
	 * InstructionQueryType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementAndIntraPosition"</li>
	 * </ul>
	 */
	public static final InstructionQueryType1Code SettlementAndIntraPosition = new InstructionQueryType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementAndIntraPosition";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionQueryType1Code.mmObject();
			codeName = InstructionQueryTypeCode.SettlementAndIntraPosition.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, InstructionQueryType1Code> codesByName = new LinkedHashMap<>();

	protected InstructionQueryType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("SETT");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InstructionQueryType1Code";
				definition = "Specifies the type of instruction queried.";
				trace_lazy = () -> InstructionQueryTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.InstructionQueryType1Code.SettlementInstruction, com.tools20022.repository.codeset.InstructionQueryType1Code.IntraPositionMovement,
						com.tools20022.repository.codeset.InstructionQueryType1Code.SettlementAndIntraPosition);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(SettlementInstruction.getCodeName().get(), SettlementInstruction);
		codesByName.put(IntraPositionMovement.getCodeName().get(), IntraPositionMovement);
		codesByName.put(SettlementAndIntraPosition.getCodeName().get(), SettlementAndIntraPosition);
	}

	public static InstructionQueryType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static InstructionQueryType1Code[] values() {
		InstructionQueryType1Code[] values = new InstructionQueryType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, InstructionQueryType1Code> {
		@Override
		public InstructionQueryType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(InstructionQueryType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}