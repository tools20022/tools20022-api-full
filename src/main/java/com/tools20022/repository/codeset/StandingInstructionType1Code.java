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
import com.tools20022.repository.codeset.StandingInstructionType1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of standing instruction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.StandingInstructionType1Code#CashDistribution
 * StandingInstructionType1Code.CashDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.StandingInstructionType1Code#GrossNet
 * StandingInstructionType1Code.GrossNet}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.StandingInstructionType1Code#SecuritiesDistribution
 * StandingInstructionType1Code.SecuritiesDistribution}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.StandingInstructionTypeCode
 * StandingInstructionTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"CASH"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "StandingInstructionType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of standing instruction."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class StandingInstructionType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.StandingInstructionType1Code
	 * StandingInstructionType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashDistribution"</li>
	 * </ul>
	 */
	public static final StandingInstructionType1Code CashDistribution = new StandingInstructionType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashDistribution";
			owner_lazy = () -> com.tools20022.repository.codeset.StandingInstructionType1Code.mmObject();
			codeName = StandingInstructionTypeCode.CashDistribution.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.StandingInstructionType1Code
	 * StandingInstructionType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossNet"</li>
	 * </ul>
	 */
	public static final StandingInstructionType1Code GrossNet = new StandingInstructionType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossNet";
			owner_lazy = () -> com.tools20022.repository.codeset.StandingInstructionType1Code.mmObject();
			codeName = StandingInstructionTypeCode.GrossNet.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.StandingInstructionType1Code
	 * StandingInstructionType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesDistribution"</li>
	 * </ul>
	 */
	public static final StandingInstructionType1Code SecuritiesDistribution = new StandingInstructionType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesDistribution";
			owner_lazy = () -> com.tools20022.repository.codeset.StandingInstructionType1Code.mmObject();
			codeName = StandingInstructionTypeCode.SecuritiesDistribution.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, StandingInstructionType1Code> codesByName = new LinkedHashMap<>();

	protected StandingInstructionType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("CASH");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "StandingInstructionType1Code";
				definition = "Specifies the type of standing instruction.";
				trace_lazy = () -> StandingInstructionTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.StandingInstructionType1Code.CashDistribution, com.tools20022.repository.codeset.StandingInstructionType1Code.GrossNet,
						com.tools20022.repository.codeset.StandingInstructionType1Code.SecuritiesDistribution);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(CashDistribution.getCodeName().get(), CashDistribution);
		codesByName.put(GrossNet.getCodeName().get(), GrossNet);
		codesByName.put(SecuritiesDistribution.getCodeName().get(), SecuritiesDistribution);
	}

	public static StandingInstructionType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static StandingInstructionType1Code[] values() {
		StandingInstructionType1Code[] values = new StandingInstructionType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, StandingInstructionType1Code> {
		@Override
		public StandingInstructionType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(StandingInstructionType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}