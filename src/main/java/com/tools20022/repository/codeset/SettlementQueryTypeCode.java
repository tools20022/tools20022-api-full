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
import com.tools20022.repository.codeset.SettlementQueryTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of settlement instruction query to be executed.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementQueryTypeCode#Instruction
 * SettlementQueryTypeCode.Instruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementQueryTypeCode#Status
 * SettlementQueryTypeCode.Status}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementQueryTypeCode#StatusPeriod
 * SettlementQueryTypeCode.StatusPeriod}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.SettlementQueryType1Code
 * SettlementQueryType1Code}</li>
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
 * <li>"INST"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SettlementQueryTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the type of settlement instruction query to be executed."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class SettlementQueryTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Queries settlement instructions based on criteria exluding statuses.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementQueryTypeCode
	 * SettlementQueryTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INST"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Instruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Queries settlement instructions based on criteria exluding statuses."</li>
	 * </ul>
	 */
	public static final SettlementQueryTypeCode Instruction = new SettlementQueryTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Instruction";
			definition = "Queries settlement instructions based on criteria exluding statuses.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementQueryTypeCode.mmObject();
			codeName = "INST";
		}
	};
	/**
	 * Queries settlement instructions based on criteria that includes statuses.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementQueryTypeCode
	 * SettlementQueryTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "STTS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Status"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Queries settlement instructions based on criteria that includes statuses."
	 * </li>
	 * </ul>
	 */
	public static final SettlementQueryTypeCode Status = new SettlementQueryTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Status";
			definition = "Queries settlement instructions based on criteria that includes statuses.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementQueryTypeCode.mmObject();
			codeName = "STTS";
		}
	};
	/**
	 * Queries settlement instructions based on criteria that includes statuses
	 * during a period.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementQueryTypeCode
	 * SettlementQueryTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "STPD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Queries settlement instructions based on criteria that includes statuses during a period."
	 * </li>
	 * </ul>
	 */
	public static final SettlementQueryTypeCode StatusPeriod = new SettlementQueryTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusPeriod";
			definition = "Queries settlement instructions based on criteria that includes statuses during a period.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementQueryTypeCode.mmObject();
			codeName = "STPD";
		}
	};
	final static private LinkedHashMap<String, SettlementQueryTypeCode> codesByName = new LinkedHashMap<>();

	protected SettlementQueryTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("INST");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SettlementQueryTypeCode";
				definition = "Specifies the type of settlement instruction query to be executed.";
				derivation_lazy = () -> Arrays.asList(SettlementQueryType1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SettlementQueryTypeCode.Instruction, com.tools20022.repository.codeset.SettlementQueryTypeCode.Status,
						com.tools20022.repository.codeset.SettlementQueryTypeCode.StatusPeriod);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Instruction.getCodeName().get(), Instruction);
		codesByName.put(Status.getCodeName().get(), Status);
		codesByName.put(StatusPeriod.getCodeName().get(), StatusPeriod);
	}

	public static SettlementQueryTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static SettlementQueryTypeCode[] values() {
		SettlementQueryTypeCode[] values = new SettlementQueryTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, SettlementQueryTypeCode> {
		@Override
		public SettlementQueryTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(SettlementQueryTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}