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
import com.tools20022.repository.codeset.DistributionInstructionType1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of distribution instruction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DistributionInstructionType1Code#GlobalDebitOrder
 * DistributionInstructionType1Code.GlobalDebitOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DistributionInstructionType1Code#IndividualOrder
 * DistributionInstructionType1Code.IndividualOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DistributionInstructionType1Code#GlobalReturnOrder
 * DistributionInstructionType1Code.GlobalReturnOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DistributionInstructionType1Code#OptionChangeOrder
 * DistributionInstructionType1Code.OptionChangeOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DistributionInstructionType1Code#IndividualReturnOrder
 * DistributionInstructionType1Code.IndividualReturnOrder}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.DistributionInstructionTypeCode
 * DistributionInstructionTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"GDEB"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DistributionInstructionType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of distribution instruction."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class DistributionInstructionType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DistributionInstructionType1Code
	 * DistributionInstructionType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GlobalDebitOrder"</li>
	 * </ul>
	 */
	public static final DistributionInstructionType1Code GlobalDebitOrder = new DistributionInstructionType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GlobalDebitOrder";
			owner_lazy = () -> com.tools20022.repository.codeset.DistributionInstructionType1Code.mmObject();
			codeName = DistributionInstructionTypeCode.GlobalDebitOrder.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DistributionInstructionType1Code
	 * DistributionInstructionType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndividualOrder"</li>
	 * </ul>
	 */
	public static final DistributionInstructionType1Code IndividualOrder = new DistributionInstructionType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndividualOrder";
			owner_lazy = () -> com.tools20022.repository.codeset.DistributionInstructionType1Code.mmObject();
			codeName = DistributionInstructionTypeCode.IndividualOrder.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DistributionInstructionType1Code
	 * DistributionInstructionType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GlobalReturnOrder"</li>
	 * </ul>
	 */
	public static final DistributionInstructionType1Code GlobalReturnOrder = new DistributionInstructionType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GlobalReturnOrder";
			owner_lazy = () -> com.tools20022.repository.codeset.DistributionInstructionType1Code.mmObject();
			codeName = DistributionInstructionTypeCode.GlobalReturnOrder.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DistributionInstructionType1Code
	 * DistributionInstructionType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionChangeOrder"</li>
	 * </ul>
	 */
	public static final DistributionInstructionType1Code OptionChangeOrder = new DistributionInstructionType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionChangeOrder";
			owner_lazy = () -> com.tools20022.repository.codeset.DistributionInstructionType1Code.mmObject();
			codeName = DistributionInstructionTypeCode.OptionChangeOrder.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DistributionInstructionType1Code
	 * DistributionInstructionType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndividualReturnOrder"</li>
	 * </ul>
	 */
	public static final DistributionInstructionType1Code IndividualReturnOrder = new DistributionInstructionType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndividualReturnOrder";
			owner_lazy = () -> com.tools20022.repository.codeset.DistributionInstructionType1Code.mmObject();
			codeName = DistributionInstructionTypeCode.IndividualReturnOrder.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, DistributionInstructionType1Code> codesByName = new LinkedHashMap<>();

	protected DistributionInstructionType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("GDEB");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DistributionInstructionType1Code";
				definition = "Specifies the type of distribution instruction.";
				trace_lazy = () -> DistributionInstructionTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DistributionInstructionType1Code.GlobalDebitOrder, com.tools20022.repository.codeset.DistributionInstructionType1Code.IndividualOrder,
						com.tools20022.repository.codeset.DistributionInstructionType1Code.GlobalReturnOrder, com.tools20022.repository.codeset.DistributionInstructionType1Code.OptionChangeOrder,
						com.tools20022.repository.codeset.DistributionInstructionType1Code.IndividualReturnOrder);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(GlobalDebitOrder.getCodeName().get(), GlobalDebitOrder);
		codesByName.put(IndividualOrder.getCodeName().get(), IndividualOrder);
		codesByName.put(GlobalReturnOrder.getCodeName().get(), GlobalReturnOrder);
		codesByName.put(OptionChangeOrder.getCodeName().get(), OptionChangeOrder);
		codesByName.put(IndividualReturnOrder.getCodeName().get(), IndividualReturnOrder);
	}

	public static DistributionInstructionType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static DistributionInstructionType1Code[] values() {
		DistributionInstructionType1Code[] values = new DistributionInstructionType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, DistributionInstructionType1Code> {
		@Override
		public DistributionInstructionType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(DistributionInstructionType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}